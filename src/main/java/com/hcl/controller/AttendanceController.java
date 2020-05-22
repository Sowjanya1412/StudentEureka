package com.hcl.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.Attendance;
import com.hcl.service.AttendanceService;

@RestController
public class AttendanceController {

	@Autowired
	private AttendanceService attendanceService;

	@GetMapping("/")
	public String welcome() {

		return "WELCOME TO SPRING BOOT ----> SOWJANYA";

	}
	

	@PostMapping("/attendance")
	public Attendance createAttendance(@RequestBody Attendance attendance) {

		return attendanceService.createAttendance(attendance);

	}

	@PutMapping("/attendance")
	public Attendance updateAttendance(@RequestBody Attendance attendance) {

		return attendanceService.updateAttendance(attendance);

	}

	@GetMapping("/attendance/{id}")
	public Attendance readById(@PathVariable int id) {

		return attendanceService.readById(id);

	}

	@GetMapping("/attendancelist")
	public List<Attendance> viewAttendance() {

		return attendanceService.viewAttendance();
	}

	@GetMapping("/attendance/{empName}/{empId}")
	public List<Attendance> viewAttendance(@PathVariable String empName, @PathVariable int empId) {

		return attendanceService.viewAttendance(empName, empId);

	}

	@GetMapping("/attendance/empId/{empId}")
	public List<Attendance> viewAttendance(@PathVariable int empId) {
		return attendanceService.viewAttendance(empId);
	}

	@GetMapping("/attendance/empName/{empName}")
	public List<Attendance> viewAttendance(@PathVariable String empName) {
		return attendanceService.viewAttendance(empName);
	}

	@DeleteMapping("/attendance/{id}")
	public String deleteById(@PathVariable int id) {
		attendanceService.deleteById(id);
		return "Employee Attendance is deleted with Id :"+id;
		
	}

}
