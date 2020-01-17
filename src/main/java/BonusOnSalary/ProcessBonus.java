package BonusOnSalary;

import java.util.ArrayList;
import java.util.Scanner;

class Emp
{
    String Name, Gender;
    double Salary,Bonus;
}

class ProcessEmp
{
    double ApplicableBonus;

    Emp _employee = new Emp();
    ArrayList<Emp> _arrListOfEmployee = new ArrayList<>();

    public void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name");
        _employee.Name= sc.nextLine();

        System.out.println("Enter the Gender");
        _employee.Gender= sc.nextLine();

        System.out.println("Enter the Salary");
        _employee.Salary= sc.nextInt();

        _arrListOfEmployee.add(_employee);
    }

    public void applyBonusOnSalary()
    {
        for (Emp employeeitem:_arrListOfEmployee)
        {
            if(employeeitem.Salary == 10000)
            {
                if(employeeitem.Gender.equalsIgnoreCase("Male"))
                {
                    ApplicableBonus = employeeitem.Salary * .05;
                    employeeitem.Salary = employeeitem.Salary + ApplicableBonus;
                }
                else if (employeeitem.Gender.equalsIgnoreCase("Female"))
                {
                    ApplicableBonus = employeeitem.Salary * .07;
                    employeeitem.Salary = employeeitem.Salary + ApplicableBonus;
                }
            }
            else if(employeeitem.Salary == 20000)
            {
                ApplicableBonus = employeeitem.Salary * .02;
                employeeitem.Salary = employeeitem.Salary + ApplicableBonus;
            }
            else
            {
                ApplicableBonus = 0;
                System.out.println("Sorry! Find aother job.");
            }
            employeeitem.Bonus = ApplicableBonus;
        }
    }

    public void putData()
    {
        for (Emp employeeitem:_arrListOfEmployee)
        {
            System.out.println("Name: " + employeeitem.Name + "\t Geneder: " + employeeitem.Gender + "\t Salary: " + employeeitem.Salary);
            System.out.println("Bonus applied: " + employeeitem.Bonus);
        }
    }
}

public class ProcessBonus
{
    public static void main(String args[])
    {
        ProcessEmp _processemp = new ProcessEmp();

        _processemp.getData();
        _processemp.applyBonusOnSalary();

        System.out.println("Applicable bonus on salary processed");

        _processemp.putData();
    }

}