import java.util.*;

public class Q6 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Shubam", "14-06-2000", "Pathankot", 40000));
        list.add(new Employee("Gaurav", "24-11-2002", "Sonipat", 34000));
        list.add(new Employee("Harshit", "27-06-1996", "Jalandhar", 56000));

        System.out.println("Name\tYear of Joining\tAddress");
        list.forEach(System.out::println);
    }
}

class Employee {

    String name, yoj, address;
    int salary;

    Employee(String name, String yoj, String address, int salary) {
        this.name = name;
        this.yoj = yoj;
        this.address = address;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + "\t" + yoj + "\t" + address;
    }
}