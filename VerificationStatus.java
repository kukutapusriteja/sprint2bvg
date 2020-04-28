package com.cg.anurag.b4.bvs.dto;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class VerificationStatus 
{
     @Id
     @Column(name="verify_id")
     int verificationId;
     @Column(name="start_date")
     LocalDate startDate;
     @Column(name="end_date")
     LocalDate endDate;
     @OneToOne
     @JoinColumn(name="doc_id")
     Documents document;
     @Column(name="status")
     String status;
     @Column(name="remarks")
     String remarks;
     public VerificationStatus() {}
	public VerificationStatus(int verificationId, LocalDate startDate, LocalDate endDate, Documents document,String status, String remarks) 
	{
		this.verificationId = verificationId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.document = document;
		this.status = status;
		this.remarks = remarks;
	}
	public int getVerificationId() {
		return verificationId;
	}
	public void setVerificationId(int verificationId) {
		this.verificationId = verificationId;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public Documents getDocument() {
		return document;
	}
	public void setDocument(Documents document) {
		this.document = document;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	} 
}
