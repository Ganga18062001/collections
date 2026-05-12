package custome_arrayList;

import java.util.ArrayList;

class Employee{
    int id;
    int rollNo;
    String name;

    public Employee(int id, int rollNo, String name) {
        this.id = id;
        this.rollNo = rollNo;
        this.name = name;
    }


}
public class ArrayListCustome {
    public static void main(String[] args) {

        Employee eml1 = new Employee(1,20,"raj");
        Employee emp2 = new Employee(2,21,"ram");
        Employee emp3 = new Employee(3,22,"max");

        ArrayList<Employee> arl = new ArrayList<Employee>();
        arl.add(eml1);
        arl.add(emp2);
        arl.add(emp3);

        for (Employee e : arl){
            System.out.println("Id is :"+e.id+",rollNo is "+e.rollNo+" and name is "+e.name);
        }

        System.out.println(arl.size());



    }
}
