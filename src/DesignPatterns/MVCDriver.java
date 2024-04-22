package DesignPatterns;

public class MVCDriver
{
    public static void main(String[] args)
    {
        EmpModel model = retreiveTheData();

        EmpView view = new EmpView();

        EmpController controller = new EmpController(model, view);

        controller.updateView();

        //update the data
        controller.setWage(4000);
        controller.setDescription("Developer");

        controller.updateView();

    }

    private static EmpModel retreiveTheData()
    {
        EmpModel model = new EmpModel();

        model.setEmpName("Veeka");
        model.setEmpId(25);
        model.setEmpWage(3000);
        model.setJobDescription("Wasting time..");

        return model;
    }
}
