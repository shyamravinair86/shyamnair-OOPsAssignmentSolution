package com.company;

public class TechDepartment extends SuperDepartment {
    public String departmentName() {
        return "Tech Department";
    }

    public String getTodaysWork() {
        return "Complete coding of Module 1";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String getTechStackInformation() {
        return "Core Java";
    }

    public String isTodayAHoliday() {
        return super.isTodayAHoliday();
    }
}
