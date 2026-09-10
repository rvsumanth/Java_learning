abstract class Employee{
    protected int id;
    protected String name;
    protected double salary;

    protected Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    abstract void calculateSalary();

    public void getDetails(){
        System.out.println("Employee Id: "+this.id);
        System.out.println("Employee Name: "+this.name);
        System.out.println("Employee Salary: "+this.salary);
    }
}

interface BonusEligible{

    void calculateBonus();
}  

class Developer extends Employee implements BonusEligible{

    private final double PERCENTAGE_BONUS = 0.2;

    Developer(int id, String name, double salary){
        super(id, name, salary);
    }

    
    public void calculateSalary(){
        this.salary = this.salary + (PERCENTAGE_BONUS * this.salary);
        System.out.println("Total Salary: "+salary);
    }


    public void calculateBonus(){
        double bonus = PERCENTAGE_BONUS * this.salary;
        System.out.println("Bonus: " + bonus);
    }
}


public class Main{
    public static void main(String[] args){
        Developer emp1 = new Developer(101, "Sumanth", 50000);
        emp1.calculateBonus();
        emp1.calculateSalary();

        emp1.getDetails();
    }
}