package mypkg;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.MDC;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.util.ValueStack;
import com.opensymphony.xwork2.util.ValueStackFactory;

public class InterceptorA extends BaseInterceptor {

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		HttpServletRequest  request = ServletActionContext.getRequest();
		String org = request.getParameter("org");
		String name = request.getParameter("name");
		System.out.println(org);
		Map paramters = arg0.getInvocationContext().getParameters();
		ValueStack vs = ValueStackFactory.getFactory().createValueStack();
		ValueStack vs2 = arg0.getStack();
		ValueStack stack = ActionContext.getContext().getValueStack();
		log.info(vs);
		log.info(vs2);
		log.info(stack);
		System.out.println(name);
    	MDC.put("org", org);
    	MDC.put("name", name);
		String result = "";
		log.info(result);
		result = arg0.invoke();
		log.info(result);
		return result;
	}

}
