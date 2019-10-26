package tags;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class FooterTagHandler extends SimpleTagSupport {
	private Integer year;
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		
	    if (year == null || year == 0) {
	        year = LocalDate.now().getYear();
	    }
		out.append("<footer><address>&copy " + year
		        + " </address>"
		        + "</footer>");
	}
	/**
	 * @return the year
	 */
	public Integer getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(Integer year) {
		this.year = year;
	}

}
