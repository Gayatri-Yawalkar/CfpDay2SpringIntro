package com.example.demo.component;
import org.springframework.stereotype.Component;
@Component
public class DeptBean {
	private String deptName;
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String depName) {
		this.deptName=depName;
	}
}
