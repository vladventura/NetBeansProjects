
public class StudentTester {
    public static void PrettyPrint (Person p){
        System.out.println("--------------------");
        p.printInfo();
        System.out.println("--------------------");
    }
    public static void sayHello (Person p){
        System.out.println("Hello my name is " +p.getName());
    }
    public static void sayHello(Student s){
        System.out.println("Hello my name is "+s.getName() +" and I am a student");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person aida = new Person("Aida", 16);
        Student jankos = new Student("Jankos", 23);
        Student uzi = new Student ("Uzi", 27, 3.3);
        
        aida.setAge(20);
        aida.setName("Aiida");
        aida.getAge();
        aida.getName();
        
        uzi.setName("Faker");
        uzi.setAge(20);
        uzi.setGPA(3.4);
        uzi.getAge();
        uzi.getGPA();
        uzi.getID();
        uzi.getName();
        
        PrettyPrint(uzi);
        PrettyPrint(jankos);
        PrettyPrint(aida);
        
        sayHello(uzi);
        sayHello(jankos);
        sayHello(aida);
    }
    
}
