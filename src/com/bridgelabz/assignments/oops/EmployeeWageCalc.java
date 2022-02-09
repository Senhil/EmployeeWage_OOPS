package com.bridgelabz.assignments.oops;

public class EmployeeWageCalc {

    public static void main(String[] args) {
        Attendance attendance = new Attendance();
        attendance.empCheck();
    }
}
class Attendance {
    public static final int IS_PRESENT = 1;
    public static final int IS_ABSENT = 0;
    public void empCheck() {
        int empCheck = (int)Math.floor(Math.random() * 10) % 2;
        switch(empCheck) {
            case IS_PRESENT:
                System.out.println("Employee is present");
                break;
            case IS_ABSENT:
                System.out.println("Employee is absent");
                break;
            default:
                System.out.println("Welcome");
        }
    }
}