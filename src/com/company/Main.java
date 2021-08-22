package com.company;

public class Main {

    public static void main(String[] args) {
        AdminDepartment adminDep = new AdminDepartment();
        System.out.println("Welcome to " + adminDep.departmentName());
        System.out.println(adminDep.getTodaysWork());
        System.out.println(adminDep.getWorkDeadline());
        System.out.println(adminDep.isTodayAHoliday());

        System.out.println();

        HrDepartment hrDep = new HrDepartment();
        System.out.println("Welcome to " + hrDep.departmentName());
        System.out.println(hrDep.doActivity());
        System.out.println(hrDep.getTodaysWork());
        System.out.println(hrDep.getWorkDeadline());
        System.out.println(hrDep.isTodayAHoliday());

        System.out.println();

        TechDepartment techDep = new TechDepartment();
        System.out.println("Welcome to " + techDep.departmentName());
        System.out.println(techDep.getTodaysWork());
        System.out.println(techDep.getWorkDeadline());
        System.out.println(techDep.getTechStackInformation());
        System.out.println(techDep.isTodayAHoliday());
    }
}
