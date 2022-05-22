class Employee{
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void printDetails(){
        System.out.println("Called from Parent Class");
    }
    //Getter Methods
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public int getAge(){
        return this.age;
    }

    //Setter Methods
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return (name + " has a salary of " + salary);
    }


}