package DesignPatterns;

public class EmpModel
{
    private String empName;

    private int empId;

    private int empWage;

    private String jobDescription;

    //getters and setters

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpWage() {
        return empWage;
    }

    public void setEmpWage(int empWage) {
        this.empWage = empWage;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
}
