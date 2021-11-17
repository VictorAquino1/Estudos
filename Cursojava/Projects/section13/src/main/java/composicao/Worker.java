package composicao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Departament department;

    private List<HourContract> contracts = new ArrayList<HourContract>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
        
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return this.level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartment() {
        return this.department;
    }

    public void setDepartment(Departament department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return this.contracts;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);

    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);

    }
    public Double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts ){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = cal.get(Calendar.MONTH);
            if(year == c_year && month == c_month){
                sum += c.totalValue();
            }
        }
        return sum;
    }

}
