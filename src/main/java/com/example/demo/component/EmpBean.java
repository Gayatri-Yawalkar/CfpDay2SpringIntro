package com.example.demo.component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class EmpBean {
	private int eid;
	private String ename;
	@Autowired
	private DeptBean deptBean;
	public static final Logger logger=LoggerFactory.getLogger(EmpBean.class);
	public EmpBean() {
		
	}
	@Autowired
	public EmpBean(DeptBean deptBean) {
		logger.trace("Autowired annotation on Constructor");
		this.deptBean=deptBean;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
		System.out.println("set id"+getEid());
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public DeptBean getDeptBean() {
		return deptBean;
	}
	@Autowired
	public void setDeptBean(DeptBean deptBean) {
		logger.trace("Autowired Annotation on Setter");
		this.deptBean = deptBean;
	}
	public void showEmployeeDetails() {
		logger.debug("Employee Id:"+getEid());
		logger.debug("Employee Name:"+getEname());
		deptBean.setDeptName("Information Technology");
		logger.debug("Department:"+deptBean.getDeptName());
	}
}
