
public class Person {
    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public Person (String s, int a){
        name = s;
        age = a;
    }
}
