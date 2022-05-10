package com.company;

public class PartTimeEmployee extends Employee{
    int noOfWorkingDay;
    int workingHourPerDay;
    MontlhyDetails montlhyDetails;


    public int getNoOfWorkingDay() {
        return noOfWorkingDay;
    }

    public int getWorkingHourPerDay() {
        return workingHourPerDay;
    }

    public void setNoOfWorkingDay(int noOfWorkingDay) {
        this.noOfWorkingDay = noOfWorkingDay;
    }

    public void setWorkingHourPerDay(int workingHourPerDay) {
        this.workingHourPerDay = workingHourPerDay;
    }

    public MontlhyDetails getMontlhyDetails() {
        return montlhyDetails;
    }

    public void setMontlhyDetails(MontlhyDetails montlhyDetails) {
        this.montlhyDetails = montlhyDetails;
    }

    // uc6
    public double employeeWage(){
        double empWage = (double)workingHourPerDay * noOfWorkingDay;
        if(empWage > 160 && noOfWorkingDay > 20)
            empWage = (double) 20 * 8; // 20 is no fo working day and 8 is no of working hour
        int salary_per_day = 400;
        return empWage * 400;
    }
}
