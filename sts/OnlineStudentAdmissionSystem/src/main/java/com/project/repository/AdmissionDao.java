package com.project.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.entity.Admission;

@Repository
public interface AdmissionDao extends JpaRepository<Admission, Integer> {
	
	public List<Admission> findByEmail(String email);
	
	public List<Admission> findByReqid(int reqid);
	
	@Query("select a from Admission a where email=:e and status=:s")
	public List<Admission> pendingData(@Param("e") String email,@Param("s") boolean status);
	
	
	@Query("select a from Admission a where status=:s")
	public List<Admission> viewAllPendingData(@Param("s") boolean status);
	
	
}
