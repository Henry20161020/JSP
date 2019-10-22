package tags;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class FooterTagHandler extends SimpleTagSupport {
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		int year = LocalDate.now().getYear();
		out.append("<footer><address>&copy " + year
		        + " </address>"
		        + "</footer>");
	}

}
