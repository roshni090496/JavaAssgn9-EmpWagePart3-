package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Driver {
   List<Employee> employeeList = new ArrayList<>();
// uc1
   public static void checkIfEmployeeIsPresent(){
       Random random = new Random();
       int ran = random.nextInt(2);
       ran = ran -1;
       if(ran == 0)
           System.out.println("Employee is Absent");
       else
           System.out.println("Employee is Presnet");


   }
    public static double calculateEmployeeWageAsPerCompany(Employee employee){
        int salary_per_day = 400;
       if(employee.getCompanyDetails() != null) {
           int noOfWorkingHour = employee.getCompanyDetails().getWorkingDay();
           int noOfWorkingDay = employee.getCompanyDetails().getWorkingHour();
           double totalWorkingHour = (double) noOfWorkingDay * noOfWorkingDay;
           if (noOfWorkingDay > 20 && totalWorkingHour > 160) {
               System.out.println("working day/hour excedded for employee " + employee.getEmployeeId());
               totalWorkingHour = (double) 20 * 8; // 20 is no fo working day and 8 is no of working hour
           }
           return totalWorkingHour * salary_per_day;
       }
       System.out.println(" company details not found");
        return 0.0;
   }
  // uc2
   public static double calculateEmployeeWage(Employee employee){
       int noOfWorkingDay = 0;
       int noOfWorkingHour = 0;


       // switch case uc4
       switch (employee.getEmployeeType()){
           case fulltime  :
               FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) employee;
               noOfWorkingDay =  fullTimeEmployee.getNoOfWorkingDay() ;
               noOfWorkingHour =  fullTimeEmployee.getWorkingHourPerDay();
               break;
           case parttime:
               PartTimeEmployee partTimeEmployee = (PartTimeEmployee) employee;
               noOfWorkingDay =  partTimeEmployee.getNoOfWorkingDay() ;
               noOfWorkingHour =  partTimeEmployee.getWorkingHourPerDay();

               break;
           default:
               break;
       }

       double workingHour = noOfWorkingDay * noOfWorkingHour;
       if(noOfWorkingDay > 20 && workingHour > 160 ) {
           System.out.println("working day/hour excedded for employee " + employee.getEmployeeId());
           workingHour = (double) 20 * 8; // 20 is no fo working day and 8 is no of working hour
       }
       int salry_per_day = 400;
       return workingHour * salry_per_day;

   }
    public static void main(String[] args) {
        System.out.println("Welcome to employee system");
        // check absent and presnet of employee
        checkIfEmployeeIsPresent();

        // adding an employee
        FullTimeEmployee employee = new FullTimeEmployee();
        employee.setEmployeeName("rabhul");
        employee.setEmployeeId(12345);
        employee.setNoOfWorkingDay(20);
        employee.setWorkingHourPerDay(8);
        employee.setEmployeeType(EmployeeType.fulltime);

        double wage = calculateEmployeeWage(employee);
        System.out.println("##### Employee Wage for employee Id "+employee.getEmployeeId() +" is " +wage);

        // part time employee
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.setEmployeeName("Rohit");
        partTimeEmployee.setEmployeeId(123456);
        partTimeEmployee.setNoOfWorkingDay(18);
        partTimeEmployee.setWorkingHourPerDay(8);
        partTimeEmployee.setEmployeeType(EmployeeType.parttime);

        double wageForPartTimeEmployee = calculateEmployeeWage(partTimeEmployee);
        System.out.println("##### Employee Wage for employee Id "+partTimeEmployee.getEmployeeId() +" is " +wageForPartTimeEmployee);

        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee();
        partTimeEmployee1.setEmployeeName("Rohan");
        partTimeEmployee1.setEmployeeId(123457);
        partTimeEmployee1.setNoOfWorkingDay(25);
        partTimeEmployee1.setWorkingHourPerDay(8);
        partTimeEmployee1.setEmployeeType(EmployeeType.parttime);
          // uc6
        double exceededwage = calculateEmployeeWage(partTimeEmployee1);
        System.out.println("##### Employee Wage for employee Id "+partTimeEmployee.getEmployeeId() +" is " +exceededwage);



        // uc 6


        FullTimeEmployee employee1 = new FullTimeEmployee();
        employee1.setEmployeeName("rabhul");
        employee1.setEmployeeId(12345);
        employee1.setNoOfWorkingDay(20);
        employee1.setWorkingHourPerDay(8);
        employee1.setEmployeeType(EmployeeType.fulltime);

        double employee1wage = employee1.employeeWage();
        System.out.println("##### Employee Wage for employee Id "+employee1.getEmployeeId() +" is " +employee1wage);

        // part time employee
        PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee();
        partTimeEmployee2.setEmployeeName("Rohit");
        partTimeEmployee2.setEmployeeId(123456);
        partTimeEmployee2.setNoOfWorkingDay(18);
        partTimeEmployee2.setWorkingHourPerDay(8);
        partTimeEmployee2.setEmployeeType(EmployeeType.parttime);

        double wageForPartTimeEmployee1 = partTimeEmployee2.employeeWage();
        System.out.println("##### Employee Wage for employee Id "+partTimeEmployee2.getEmployeeId() +" is " +wageForPartTimeEmployee1);


        // uc 8


        FullTimeEmployee employee3 = new FullTimeEmployee();
        employee3.setEmployeeName("rabhul");
        employee3.setEmployeeId(12345);
        employee3.setNoOfWorkingDay(20);
        employee3.setWorkingHourPerDay(8);
        employee3.setEmployeeType(EmployeeType.fulltime);
        Company company = new Company();
        company.setNameOfCompany("Google");
        company.setWorkingDay(20);
        company.setWorkingHour(8);
        employee3.setCompanyDetails(company);
        double wageAsPerCompany = calculateEmployeeWageAsPerCompany(employee3);
        System.out.println("wage as per company is ="+ wageAsPerCompany);




    }
}
