class Singleton{
    private String name;
    private int age;
    private String gender;

    public static Singleton single_instance = null;

    private Singleton(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static Singleton getInstance(String name, int age, String gender){
        if(single_instance == null){
            single_instance = new Singleton(name, age, gender);
        }
        return single_instance;
    }

    //Getter Methods
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public String getGender(){
        return this.gender;
    }

    //Setter Methods
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public String toString(){
        return ("Object has name: " + this.name + " ,age: " + this.age + " & gender: " + this.gender);
    }
}