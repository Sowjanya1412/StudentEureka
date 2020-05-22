package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.AttandanceRepositary;
import com.hcl.model.Attendance;
@Service
public class AttendanceServiceImpl implements AttendanceService {
	
	@Autowired
	private AttandanceRepositary attandanceRepositary; 


	@Override
	public Attendance readById(int id) {
		// TODO Auto-generated method stub
		return attandanceRepositary.findById(id).get();
	}

	@Override
	public Attendance createAttendance(Attendance attendance) {
		// TODO Auto-generated method stub
		return attandanceRepositary.save(attendance);
	}

	@Override
	public Attendance updateAttendance(Attendance attendance) {
		// TODO Auto-generated method stub
		return attandanceRepositary.save(attendance);
	}

	@Override
	public List<Attendance> viewAttendance() {
		// TODO Auto-generated method stub
		return attandanceRepositary.findAll();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		 attandanceRepositary.deleteById(id);
		
	}

	@Override
	public List<Attendance> viewAttendance(String empName, int empId) {
		// TODO Auto-generated method stub
		return attandanceRepositary.findAttendanceByEmpNameOrEmpId(empName, empId);
	}

	@Override
	public List<Attendance> viewAttendance(int empId) {
		// TODO Auto-generated method stub
		return attandanceRepositary.findByempId(empId);
	}

	@Override
	public List<Attendance> viewAttendance(String empName) {
		// TODO Auto-generated method stub
		return attandanceRepositary.findByempName(empName);
	}

}
