package com.cts.demo;

public class Supervisor implements ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler;
	
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {

		if (leaveRequest.leaveDays <= 3) {
			System.out.println("Request Approved by Supervisor");
		}
		else {
			System.out.println("Forwarded to Project Manager");
			nextHandler = new ProjectManager();
			nextHandler.handleRequest(leaveRequest);
		}
		
	}

}