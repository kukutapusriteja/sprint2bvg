package com.cg.anurag.b4.bvs.dto;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Department 
{
    @Id
    @Column(name="deptno")
    int departmentNo;
    @Column(name="dept_name")
    String departmentName;
    @Column(name="emp_location")
    String departmentLocation;
    @OneToMany(mappedBy="department")
    List<Employee> employees;
    public Department() { }
	public Department(int departmentNo, String departmentName, String departmentLocation) 
	{
		this.departmentNo = departmentNo;
		this.departmentName = departmentName;
		this.departmentLocation = departmentLocation;
		//this.employees = employees;
	}
	public int getDepartmentNo() {
		return departmentNo;
	}
	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentLocation() {
		return departmentLocation;
	}
	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
