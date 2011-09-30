package mypkg;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.MDC;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;

public class InterceptorA extends BaseInterceptor {

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		HttpServletRequest  request = ServletActionContext.getRequest();
		String org = request.getParameter("org");
		String name = request.getParameter("name");
		System.out.println(org);
		System.out.println(name);
    	MDC.put("org", org);
    	MDC.put("name", name);
		String result = "";
		log.info(result);
//		result = arg0.invoke();
//		log.info(result);
		return arg0.invoke();
	}

}
