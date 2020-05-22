package com.hcl.service;

import java.util.List;

import com.hcl.model.Attendance;



public interface AttendanceService {
	

	public Attendance readById(int id);

	public Attendance createAttendance(Attendance attendance);

	public Attendance updateAttendance(Attendance attendance);

	public List<Attendance> viewAttendance();

	public void deleteById(int id);
	
	public List<Attendance> viewAttendance(String empName,int empId);
	
	public List<Attendance> viewAttendance(int empId);
	
	public List<Attendance> viewAttendance(String empName);
	

}
