package com.cg.anurag.b4.bvs.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.anurag.b4.bvs.dao.VerificationStatusDAO;
import com.cg.anurag.b4.bvs.dto.VerificationStatus;
@Service
public class VerificationStatusService 
{
    @Autowired
    VerificationStatusDAO verificationStatusDao;
    public void setVerificationStatusDao(VerificationStatusDAO verificationStatusDao) 
    {
         this.verificationStatusDao = verificationStatusDao;	
    }
    
    @Transactional(readOnly=true)
    public Optional<VerificationStatus> getVerificationStatus(int verificationId)
    {
    	return verificationStatusDao.findById(verificationId);
    }
    
    @Transactional(readOnly=true)
    public List<VerificationStatus> getAllVerificationStatus()
    {
    	return verificationStatusDao.findAll();
    }
    
    @Transactional
    public void insertVerificationStatus(VerificationStatus verificationStatus)
    {
    	verificationStatusDao.save(verificationStatus);
    }
    
    @Transactional
    public void deleteVerificationStatus(int verificationId)
    {
    	verificationStatusDao.deleteById(verificationId);
    }
}
