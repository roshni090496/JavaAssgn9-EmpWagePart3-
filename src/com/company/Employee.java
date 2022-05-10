package com.company;

public class Employee {
    int employeeId;
    String employeeName;
    Company companyDetails; // used for uc8
    EmployeeType employeeType;

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Company getCompanyDetails() {
        return companyDetails;
    }

    public void setCompanyDetails(Company companyDetails) {
        this.companyDetails = companyDetails;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }
}
