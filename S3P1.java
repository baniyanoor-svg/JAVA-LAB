class Person{
    String name;
    int age;
    Person(String n,int a){

        name =n;
        age =a;
    }
    
}
class Student extends Person{
int rollno;
String course;

Student(String n,int a,int r,String c ){

    super(n,a);
    rollno=r;
    course=c;

}
void display(){
System.out.println("Name:" +name );
System.out.println("Age:" +age );
System.out.println("Rollno:" +rollno );
System.out.println("Course:" +course);


}
}
public class S3P1 {
    public static void main(String[] args) {
        Student s1 = new Student("noor",20,1,"cse");
        s1.display();
       
    }
}