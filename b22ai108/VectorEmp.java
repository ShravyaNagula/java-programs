import java.util.*;
public class VectorEmp extends Employee
{
public static void main(String args[])
{
Vector<Employee>v=new <Employee> Vector();
Employee e1=new Employee(E1,"Shravya");
Employee e2=new Employee(E2,"jayanthi");
Employee e3=new Employee(E3,"Sharath");
v.add(e1);
v.add(e2);
v.add(e3);
Iterator i1=v.iterator();
while(i1.hasNext())
{
i1.next().display();
}
}
}