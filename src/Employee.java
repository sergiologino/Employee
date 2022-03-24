public class Employee {
    String name, position;
    int salary;
    private static int tabNumberId;

    public Employee(){
        this("no name", "-", 0);
    }
    public Employee(String name){
        this(name,"-",0);
    }
    public Employee(String name, String position){
        this(name,position,0);
    }
    public Employee(String name, String position, int salary){
        this.name=name;
        this.position=position;
        this.salary=salary;
        tabNumberId++;
    }
    public void ChangeEmployeeSalary(int i){
        salary=i;
    }
    public void ChangeEmployeePosition(String p){
        position=p;
    }
    public void printEmployee() {
        System.out.println("The Employee " + name + " (" + tabNumberId + ")  have position " + position + " and his salary is " + salary);
    }
}