public class Employee {

    private String name;
    private String department;
    private int salary;
    private static int counter = 1;
    public int id;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    //   ЗДЕСЬ ГЕТТЕРЫ
    public String getName() {
        return name;
    }


    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    //    ЗДЕСЬ СЕТТЕРЫ
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ФИО " + name + " Отдел " + department + " Зарплата  " + salary + " ID сотрудника " + id;
    }

}
