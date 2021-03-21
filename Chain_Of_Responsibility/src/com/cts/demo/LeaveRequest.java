package com.cts.demo;

public class LeaveRequest {
		public String employee;
		public int leaveDays;
		public String getEmployee() {
			return employee;
		}
		public void setEmployee(String employee) {
			this.employee = employee;
		}
		public int getLeaveDays() {
			return leaveDays;
		}
		public LeaveRequest(String employee, int leaveDays) {
			super();
			this.employee = employee;
			this.leaveDays = leaveDays;
		}
		public LeaveRequest() {
			// TODO Auto-generated constructor stub
		}
		public void setLeaveDays(int leaveDays) {
			this.leaveDays = leaveDays;
		}
}
