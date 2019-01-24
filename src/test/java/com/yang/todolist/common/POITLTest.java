package com.yang.todolist.common;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.data.MiniTableRenderData;
import com.deepoove.poi.data.RowRenderData;
import com.deepoove.poi.data.TextRenderData;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class POITLTest {
    RowRenderData header;
    List<RowRenderData> tableDatas;

    @Before
    public void init() {
        header = new RowRenderData(Arrays.asList(new TextRenderData("FFFFFF", "Word处理解决方案"),
                new TextRenderData("FFFFFF", "是否跨平台"), new TextRenderData("FFFFFF", "易用性")), "ff9800");
        RowRenderData row0 = RowRenderData.build("Poi-tl", "纯Java组件，跨平台", "简单：模板引擎功能，并对POI进行了一些封装");
        RowRenderData row1 = RowRenderData.build("Apache Poi", "纯Java组件，跨平台", "简单，缺少一些功能的封装");
        RowRenderData row2 = RowRenderData.build("Freemarker", "XML操作，跨平台", "复杂，需要理解XML结构");
        RowRenderData row3 = RowRenderData.build("OpenOffice", "需要安装OpenOffice软件", "复杂，需要了解OpenOffice的API");
        RowRenderData row4 = RowRenderData.build("Jacob、winlib", "Windows平台", "复杂，不推荐使用");
        tableDatas = Arrays.asList(row0, row1, row2, row3, row4);
    }

    @Test
    public void exportDoc() throws IOException {
        //核心API采用了极简设计，只需要一行代码
        String path = ResourceUtils.getURL("classpath:").getPath();
//        RowRenderData header = RowRenderData.build(new TextRenderData( "姓名"), new TextRenderData("学历"));
//        RowRenderData row = RowRenderData.build("张三", "研究生");

        XWPFTemplate template = XWPFTemplate.compile(path+"payment.docx").render(new HashMap<String, Object>(){{
            put("order_title", "Poi-tl 模板引擎");
            put("order_no", "BJ201901240001");
            put("order_date", "2019-01-24");
            put("customer", "张三");
            put("saler", "李四");
            put("money_type", "RMB");
            put("tableData", new MiniTableRenderData(header, tableDatas, MiniTableRenderData.WIDTH_A4_FULL));
        }});
        FileOutputStream out = new FileOutputStream(path+"out_payment.docx");
        template.write(out);
        out.flush();
        out.close();
        template.close();
    }
}
