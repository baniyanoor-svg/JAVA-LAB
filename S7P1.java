
class Student1{
String name;
int rollno;
Student1(String n,int r ){
name =n;
rollno=r;

}
void display(){
System.out.println("Name:" + name +"Rollno:" + rollno );

}

}
public class S7P1{
public static void  main(String args[]){

Student1 st1 =new Student1("mohan", 3);
st1.display();

}

}
