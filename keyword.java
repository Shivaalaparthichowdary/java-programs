import java.io.*;
class school
{
int id;
String name= " QIS PUBLIC SCHOOL";
}
class teacher extends school
{
int id;
String name;
void schoolname()
{
System.out.println("school name is "+super.name);
}
}
class keyword
{
public static void main(String[] args)
{
teacher t1=new teacher();
t1.schoolname();
}
}