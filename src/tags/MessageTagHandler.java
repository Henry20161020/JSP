package tags;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MessageTagHandler extends SimpleTagSupport implements DynamicAttributes {
	private Map<String, Object> attribMap = new HashMap<String, Object>();
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		StringWriter sw = new StringWriter();
		JspFragment jf = getJspBody();
		
		out.append("<p");
		for (String attribName : attribMap.keySet()) {
		    out.append(String.format(" %s='%s'", attribName, attribMap.get(attribName)));
		}
		out.append(">");
		jf.invoke(sw);
		out.append(sw.toString().toUpperCase());
		out.append("</p>");
	}
	public void setDynamicAttribute(String uri, String name, Object value) throws JspException {
		attribMap.put(name, value);
		
	}
}
