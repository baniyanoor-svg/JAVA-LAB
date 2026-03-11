
class Student{
String name;
int rollno;
Student(String n,int r ){
name =n;
rollno=r;

}
void display(){
System.out.println("Name:" + name +"Rollno:" + rollno );

}

}
public class S7P1{
public static void  main(String args[]){

Student st1 =new Student("mohan", 3);
st1.display();

}

}
