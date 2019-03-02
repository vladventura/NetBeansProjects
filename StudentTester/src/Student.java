
public class Student extends Person {
    protected int ID;
    private static int nextID = 103;
    protected double GPA;

    public int getID() {
        return ID;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        boolean done = false;
        while (done == false){
            if (GPA <= 4.0){
               this.GPA = GPA;
               done = true;
            }
            else {
                System.out.println("Try again.");
            }
        }
    }
    
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("GPA: "+GPA);
        System.out.println("ID: "+ID);
    }
              
    public Student(String n, int a){
        super(n, a);
        ID = nextID;
        nextID++;
        GPA = 4.0;
    }
    public Student (String n, int a, double g){
        super(n, a);
        GPA = g;
        ID = nextID;
        nextID++;
    }
    
}
