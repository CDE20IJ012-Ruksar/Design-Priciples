package com.cts.demo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeaveRequest leaveRequest=new LeaveRequest();
		leaveRequest.setEmployee("ABC");
		leaveRequest.setLeaveDays(4);
		ILeaveRequestHandler leaveRequestHandler = new Supervisor();
		leaveRequestHandler.handleRequest(leaveRequest);
		System.out.println("\n");
		leaveRequest=new LeaveRequest();
		leaveRequest.setEmployee("XYZ");
		leaveRequest.setLeaveDays(2);
		leaveRequestHandler = new Supervisor();
		leaveRequestHandler.handleRequest(leaveRequest);
		System.out.println("\n");
		leaveRequest=new LeaveRequest();
		leaveRequest.setEmployee("EYV");
		leaveRequest.setLeaveDays(10);
		leaveRequestHandler = new Supervisor();
		leaveRequestHandler.handleRequest(leaveRequest);
		
	}

}
