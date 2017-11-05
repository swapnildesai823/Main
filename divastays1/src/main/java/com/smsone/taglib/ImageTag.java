package com.smsone.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import org.apache.commons.codec.binary.Base64;

public class ImageTag extends SimpleTagSupport {
	private byte[] img;

    public void setImg(byte[] img) {
        this.img = img;
    }

@Override
    public void doTag() throws JspException, IOException {
        try {
            JspWriter out = getJspContext().getOut();
            if (img != null && img.length > 0) {
                byte[] encodeBase64 = Base64.encodeBase64(img);
                String base64Encoded = new String(encodeBase64, "UTF-8");
                out.print("data:image/jpeg;base64,"+base64Encoded);

            }
        } catch (Exception e) {
            throw new JspException("Error: " + e.getMessage());     }
    }   

}
