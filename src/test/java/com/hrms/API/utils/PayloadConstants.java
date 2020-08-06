package com.hrms.API.utils;

import com.hrms.API.steps.practice.HardcodedExamples;

public class PayloadConstants {

	/**
	 * Create employee body
	 * @return
	 */
	public static String createEmployeeBody() {
		
		String createEmployeeBody = "{\r\n" + 
				"            \"employee_id\": \"23098A\",\r\n" + 
				"            \"emp_firstname\": \"syntaxinsan\",\r\n" + 
				"            \"emp_middle_name\": \"syntaxyok\",\r\n" + 
				"            \"emp_lastname\": \"syntaxoglu\",\r\n" + 
				"            \"emp_birthday\": \"2000-07-18\",\r\n" + 
				"            \"emp_gender\": \"F\",\r\n" + 
				"            \"emp_job_title\": \"Cloud Architect\",\r\n" + 
				"            \"emp_status\": \"Employee\"\r\n" + 
				"        }";
		
		return createEmployeeBody;
		
	}
	
	/** 
	 * Created method to return payload - to reduce messy code
	 * @return
	 */
	public static String updateCreatedEmpBody() {
	
		String updateBody = "{\r\n" + 
				"            \"employee_id\": \""+ HardcodedExamples.employeeID+"\",\r\n" + 
				"            \"emp_firstname\": \"syntaxInsan\",\r\n" + 
				"            \"emp_middle_name\": \"syntaxYok\",\r\n" + 
				"            \"emp_lastname\": \"syntaxoglu\",\r\n" + 
				"            \"emp_birthday\": \"2000-07-08\",\r\n" + 
				"            \"emp_gender\": \"F\",\r\n" + 
				"            \"emp_job_title\": \"Cloud Consultant\",\r\n" + 
				"            \"emp_status\": \"Employee\"\r\n" + 
				"        }";
		
		return updateBody;
		
		
	}
}
