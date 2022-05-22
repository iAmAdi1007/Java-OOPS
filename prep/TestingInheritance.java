class TestingInheritance extends Employee{

    public TestingInheritance(String name, int age, double salary){
        super(name, age, salary);
    }
    public static void printDetails(){
        System.out.println("This is called from the child class");
    }
}