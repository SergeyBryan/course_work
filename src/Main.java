public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
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
          Base_level.printEmployees(employees);
        System.out.println("Сумма затрат на зарплаты в месяц: " + Base_level.calculateTotalSalary(employees));
        System.out.println("Минимальная зарплата у сотрудника: " + Base_level.findEmployeeWithMaxSalary(employees));
        System.out.println("Максимальная зарплата у сотрудника: " + Base_level.findEmployeeWithMinSalary(employees));
        System.out.println("Средняя зарплата по сотрудникам = " + Base_level.AverageSalary(employees));
        Base_level.printFullNames(employees);
    }
    }