package action;

import java.io.IOException;
import been.actionforward;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface action {
	public actionforward execute(HttpServletRequest request, HttpServletResponse response) 
			throws Exception;
			
	}
