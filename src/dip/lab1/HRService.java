package dip.lab1;



public class HRService {
   
    private Employee employee;

    public HRService(Employee employee) {
        this.employee = employee;
    }
    
   public void getYearlyWage(){
       employee.getAnnualWages();
    }
}