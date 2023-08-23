import java.io.*;
public class EmployeeTest {
    public static void main(String[] args){
        Employee empOne = new Employee("NOOB1");
        Employee empTwo = new Employee("NOOB2");

        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(22);
        empTwo.empDesignation("菜鸟程序猿");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}
