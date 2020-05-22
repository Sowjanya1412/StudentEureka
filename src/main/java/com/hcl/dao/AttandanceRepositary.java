package com.hcl.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.model.Attendance;



public interface AttandanceRepositary extends JpaRepository<Attendance, Integer> {
	
	public List<Attendance> findAttendanceByEmpNameOrEmpId(String empName,int empId);
	
	public List<Attendance> findByempName(String empName);
	public List<Attendance> findByempId(int empId);
	

}
