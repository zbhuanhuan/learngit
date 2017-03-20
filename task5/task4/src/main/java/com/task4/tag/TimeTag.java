package com.task4.tag;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TimeTag extends SimpleTagSupport {

    private JspContext context;

    public void setJspContext(JspContext context){
        this.context = context;
    }

    @Override
    public void doTag() throws JspException, IOException {
        PageContext pagecontext = (PageContext) context;

        //得到当前的系统时间
        Date date = new Date();
        long time = date.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = simpleDateFormat.format(time);

        JspWriter out = pagecontext.getOut();
        out.write(s);
    }

}
