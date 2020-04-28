package com.cg.anurag.b4.bvs.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.anurag.b4.bvs.dto.Department;
public interface DepartmentDAO extends JpaRepository<Department,Integer>
{

}
