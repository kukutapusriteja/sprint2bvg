package com.cg.anurag.b4.bvs.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cg.anurag.b4.bvs.dao.EmployeeDAO;
import com.cg.anurag.b4.bvs.dto.Employee;
@Service
public class EmployeeService 
{
    @Autowired
    EmployeeDAO employeeDao;
    public void setEmployeeDao(EmployeeDAO employeeDao)
    {
    	this.employeeDao = employeeDao;
    }
    
    @Transactional(readOnly=true)
    public Optional<Employee> getEmployee(int empid)
    {
    	return employeeDao.findById(empid);
    }
    
    @Transactional(readOnly=true)
    public List<Employee> getAllEmployee()
    {
    	return employeeDao.findAll();
    }
    
    @Transactional
    public void insertEmployee(Employee employee)
    {
    	employeeDao.save(employee);
    }
    
    @Transactional
    public void deleteEmployee(int empid)
    {
    	employeeDao.deleteById(empid);
    }
}
