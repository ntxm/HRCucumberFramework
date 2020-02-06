package com.hr.bases;

import com.hr.pages.AddEmployeePageElements;
import com.hr.pages.DashboardPageElements;
import com.hr.pages.EmployeeListPageElement;
import com.hr.pages.LeaveListPageElements;
import com.hr.pages.LoginPageElements;
import com.hr.pages.RecruitmentPageElements;
import com.hr.pages.ReportsPageElements;
import com.hr.pages.ViewEmployeePageElements;

public class PageInitializer extends BaseClass {
	
	protected static LoginPageElements login;
	protected static DashboardPageElements dashboard;
	protected static AddEmployeePageElements addEmp;
	protected static EmployeeListPageElement empList;
	protected static LeaveListPageElements leaveList;
	protected static RecruitmentPageElements rec;
	protected static ReportsPageElements report;
	protected static ViewEmployeePageElements viewEmp;
	
	
	public static void initiliazeAllPages() {
		
		login = new LoginPageElements();
		dashboard = new DashboardPageElements();
		addEmp = new AddEmployeePageElements();
		empList = new EmployeeListPageElement();
		leaveList = new LeaveListPageElements();
		rec = new RecruitmentPageElements();
		report = new ReportsPageElements();
		viewEmp = new ViewEmployeePageElements();
		
	}	
	
	

}
