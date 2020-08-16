import java.util.*;
import java.util.stream.Collectors;

public class Q3 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, 30000, "Shubam Virdi", "CEO", "Pathankot"));
        list.add(new Employee(1, 40000, "Gaurav", "CTO", "Sonipat"));
        list.add(new Employee(1, 50000, "Bhupendra", "Product Manager", "Loomb"));
        list.add(new Employee(1, 60000, "Harshit", "Product Manager", "Gorakhpur"));
        list.add(new Employee(1, 70000, "Bansant", "Product Manager", "Nagaland"));
        list.add(new Employee(1, 70000, "Abdul", "Product Manager", "Andhra Pradesh"));
        list.add(new Employee(1, 55000, "Jatin", "Product Manager", "Haryana"));
        list.add(new Employee(1, 20000, "Sujeet", "Software Engineer", "Bihar"));
        list.add(new Employee(1, 15000, "Manoj", "Software Engineer", "Rajasthan"));
        list.add(new Employee(1, 130000, "Dilip", "INTERNEE", "Jalandhar"));

        // list out all the names of the persons
        List<String> names = list.stream().map(emp -> emp.empName).collect(Collectors.toList());
        names.forEach(System.out::println);

        // salaries which are greater than 50,000/-
        List<Integer> salaries = list.stream().filter(emp -> emp.getEmpSalary() > 50000).map(emp -> emp.getEmpSalary())
                .collect(Collectors.toList());
        salaries.forEach(System.out::println);

        // locations starting with the letter ‘M’
        List<String> nameList = list.stream().filter(emp -> emp.getEmpName().startsWith("M"))
                .map(emp -> emp.getEmpName()).collect(Collectors.toList());
        nameList.forEach(System.out::println);

        // designations ending with ‘E’
        List<String> endingDesigList = list.stream().filter(emp -> emp.getEmpDesignation().endsWith("E"))
                .map(emp -> emp.getEmpDesignation()).collect(Collectors.toList());
        endingDesigList.forEach(System.out::println);
    }
}

class Employee {
    int empId, empSalary;
    String empName, empDesignation, empLocation;

    public Employee(int empId, int empSalary, String empName, String empDesignation, String empLocation) {
        this.empId = empId;
        this.empSalary = empSalary;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empLocation = empLocation;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpSalary() {
        return this.empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpDesignation() {
        return this.empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

}