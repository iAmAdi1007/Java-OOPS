import java.util.*;
class MainDriver{
    
    public static void main(String[] args) {
        Employee  e1 = new Employee("Adi", 27, 30000);
        Employee  e2 = new Employee("Dholu", 22, 3000);
        Employee  e3 = new Employee("Chhavi", 23, 5000);
        
        //System.out.println(e1.getSalary());
        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        // System.out.println("Before Increment");
        // System.out.println(employees);

        for(Employee e : employees){
            if(e.getAge() > 25) e.setSalary(e.getSalary() + 2500);
        }

        // System.out.println("After Increment");
        // System.out.println(employees);


        Singleton s = Singleton.getInstance("Adi", 27, "Male");
        // System.out.println(s);

        Employee e = new TestingInheritance("Adi", 27, 30000);
        e.printDetails();

        //Complex Number Class
        Complex n1 = new Complex(2, 3);
        Complex n2 = new Complex(3, 4);
        n1.add(n2);
        System.out.println("Update After Add: " + n1.print());

        n1.multiply(n2);
        System.out.println("Updated After Multiply: " +n1.print());

    }

}