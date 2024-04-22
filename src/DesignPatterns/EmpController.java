package DesignPatterns;

public class EmpController
{
    private EmpModel model;
    private EmpView view;

    public EmpController(EmpModel model, EmpView view)
    {
        this.model = model;
        this.view = view;

    }


    public void setName(String name)
    {
        model.setEmpName(name);
    }

    public String getName()
    {
        return model.getEmpName();
    }

    public void setId(int id)
    {
        model.setEmpId(id);
    }

    public int getId()
    {
        return model.getEmpId();
    }

    public void setWage(int wage)
    {
        model.setEmpWage(wage);
    }

    public int getWage()
    {
        return model.getEmpWage();
    }

    public void setDescription(String des)
    {
        model.setJobDescription(des);
    }

    public String getDescription()
    {
        return model.getJobDescription();
    }

    //update the values
    public void updateView()
    {
        view.employeeDetails(model.getEmpName(), model.getEmpId(), model.getEmpWage(), model.getJobDescription());
    }



}
