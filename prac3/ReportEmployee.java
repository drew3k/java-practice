package prac3;

class Employee {
    private final String fullName;
    private final double salary;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }
}

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет о сотрудниках");
        System.out.println("+----------------------+----------------+");

        // Заголовок таблицы
        System.out.println("| ФИО                  | Зарплата       |");
        System.out.println("+----------------------+----------------+");

        // Вывод информации о сотрудниках
        for (Employee employee : employees) {
            String fullName = employee.getFullName();
            double salary = employee.getSalary();
            String formattedSalary = String.format("%.2f", salary);

            System.out.printf("| %-20s | %12s   |%n", fullName, formattedSalary);
        }

        // Завершение таблицы
        System.out.println("+----------------------+----------------+");
    }
}

public class ReportEmployee {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иван Иванов", 5000.0),
                new Employee("Петр Петров", 6000.50),
                new Employee("Мария Сидорова", 5500.75)
        };

        Report.generateReport(employees);
    }
}
