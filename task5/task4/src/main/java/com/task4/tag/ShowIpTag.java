package com.task4.tag;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class ShowIpTag extends SimpleTagSupport{
    private JspContext jspContext;

    public void setJspContext(JspContext jspContext) {
        this.jspContext = jspContext;
    }

    @Override
    public void doTag() throws JspException, IOException {

        PageContext pageContext = (PageContext) jspContext;
        ServletRequest request = pageContext.getRequest();
        ServletResponse response = pageContext.getResponse();
        response.setCharacterEncoding("utf-8");
        int ip = request.getLocalPort();
        JspWriter out = pageContext.getOut();
        out.write("用tag标签输出Addr地址："+ip);
    }



}