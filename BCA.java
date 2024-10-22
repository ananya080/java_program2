class Student{
int rollno;
String name;
int mobileno;
}
class BCA
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
Student s3=new Student();
Student s4=new Student();
Student s5=new Student();
s1.rollno=01;
s1.name="Ananya";
s1.mobileno=12345;
s2.rollno=02;
s2.name="Abcd";
s2.mobileno=125678;
s3.rollno=03;
s3.name="efghv";
s3.mobileno=67897;
s4.rollno=04;
s4.name="efghg";
s4.mobileno=67895;
s5.rollno=05;
s5.name="efghi";
s5.mobileno=67890;
System.out.println(s1.rollno+" "+s1.name+" "+s1.mobileno);
System.out.println(s2.rollno+" "+s2.name+" "+s2.mobileno);
System.out.println(s3.rollno+" "+s3.name+" "+s3.mobileno);
System.out.println(s4.rollno+" "+s4.name+" "+s4.mobileno);
System.out.println(s5.rollno+" "+s5.name+" "+s5.mobileno);
}
}

