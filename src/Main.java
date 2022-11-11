public class Main {

    public static Employee[] employees = new Employee[10];

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float AverageSalary() {
        return calculateTotalSalary() / (float) employees.length;
    }

    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }


    public static void main(String[] args) {
        employees = new Employee[]{
                new Employee("Иванов Иван Иванович", "1", 65000),
                new Employee("Петров Петр Петрович", "2", 55000),
                new Employee("Гаврилова Александра Николаевна", "3", 150000),
                new Employee("Иванов Петр Иванович", "4", 45000),
                new Employee("Петров Иван Николаевич", "5", 125000),
                new Employee("Бочков Петр Николаевич", "5", 15000),
                new Employee("Говрилов Николай Иванович", "4", 25000),
                new Employee("Котов Михаил Петрович", "3", 327000),
                new Employee("Бочков Иван Михайлович", "2", 350000),
                new Employee("Гаврилов Михаил Николаевич", "1", 35000),
        };
        printEmployees();
        System.out.println("Сумма затрат на зарплаты в месяц: " + calculateTotalSalary());
        System.out.println("Максимальная зарплата у сотрудника: " + findEmployeeWithMaxSalary());
        System.out.println("Минимальная зарплата у сотрудника: " + findEmployeeWithMinSalary());
        System.out.println("Средняя зарплата по сотрудникам = " + AverageSalary());
        printFullNames();
    }
}