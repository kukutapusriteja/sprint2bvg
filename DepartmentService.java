package com.cg.anurag.b4.bvs.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cg.anurag.b4.bvs.dao.DepartmentDAO;
import com.cg.anurag.b4.bvs.dto.Department;
@Service
public class DepartmentService 
{
    @Autowired
    DepartmentDAO departmentDao;
    public void setDepartmentDao(DepartmentDAO departmentDao)
    {
    	this.departmentDao = departmentDao;
    }
    
    @Transactional(readOnly=true)
    public Optional<Department> getDepartment(int departmentNo)
    {
    	return departmentDao.findById(departmentNo);
    }
    
    @Transactional(readOnly=true)
    public List<Department> getAllDepartment()
    {
    	return departmentDao.findAll();
    }
    
    @Transactional
    public void insertDepartment(Department department)
    {
    	departmentDao.save(department);
    }
    
    @Transactional
    public void deleteDepartment(int departmentNo)
    {
    	departmentDao.deleteById(departmentNo);
    }
}
