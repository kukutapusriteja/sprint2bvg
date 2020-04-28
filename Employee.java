package com.cg.anurag.b4.bvs.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Employee 
{
    @Id
    @Column(name="emp_id")
    int empid;
    @Column(name="emp_name")
    String ename;
    @Column(name="emp_pwd")
    String password;
    @Column(name="emp_phone")
    long phone;
    @Column(name="designation")
    String designation;
    @Column(name="salary")
    double salary;
    @ManyToOne
    @JoinColumn(name="deptno")
    Department department;
    @OneToOne
    @JoinColumn(name="aid")
    Address address;
    public Employee() {}
	public Employee(int empid, String ename, String password,long phone, String designation, double salary, Department department,Address address) 
	{
		this.empid = empid;
		this.ename = ename;
		this.password=password;
		this.phone = phone;
		this.designation = designation;
		this.salary = salary;
		this.department = department;
		this.address = address;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
