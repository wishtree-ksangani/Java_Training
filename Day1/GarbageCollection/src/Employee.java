public class Employee {
    public static int nextId = 0;
    String name;
    int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
        nextId++;
    }


    protected void finalize(){
        nextId--;
    }
}
