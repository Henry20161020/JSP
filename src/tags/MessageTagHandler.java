package tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MessageTagHandler extends SimpleTagSupport {
	public void doTag() throws JspException, IOException {
		JspFragment jf = getJspBody();
		jf.invoke(null);
	}
}
