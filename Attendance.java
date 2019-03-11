package com.mhachem.attendance.client;

import java.io.IOException;
import java.util.List;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.mhachem.attendance.model.AttendanceDay;

public interface IAttendanceMachineClient {

	// todo move call to attendance machine here
	
	List<AttendanceDay> parseAttendanceDays(int Studentid, int month) throws UnirestException, IOException;

	List<AttendanceDay> parseAttendanceDays(int Studentid, int month, int year) throws UnirestException, IOException;
}
