package mypkg;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.log4j.MDC;


public class SSOAction extends BaseAction {
	
	private String org;
	private String name;
	private String pwd;
	private String res;
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
    public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
    
    public String login(){
    	log.info(ToStringBuilder.reflectionToString(this));
//    	MDC.put("org", org);
//    	MDC.put("name", name);
    	
    	res = "org: "+org+", name: "+name+", pwd: "+pwd;
    	log.info(org);
    	log.info(name);
    	log.info(pwd);
    	return "view";
    }
    public String logout(){
    	log.info(ToStringBuilder.reflectionToString(this));
    	res = "logout[org: "+org+", name: "+name+", pwd: "+pwd+"]";
    	log.info(res);
    	return "view";
    }
}
