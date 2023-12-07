/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Composite.EmployeeExample;

public class Main {
    public static void main(String[] args) {
        // Creating instances of employees
        IEmployee director = new Director("Maroof Shah", "IT", 60000);
        IEmployee hod = new HeadOfDepartment("Ali", "Engineering", 40000);
        IEmployee teacher = new Teacher("Ahmed", "Math", 40000);
        IEmployee doo = new DOO("Sami", "Operations", 55000);

        ((BaseEmployee) director).add(hod);
        ((BaseEmployee) hod).add(teacher);
        ((BaseEmployee) hod).add(doo);

        EmployeeController employeeController = new EmployeeController(director);

        String organogram = employeeController.generateOrganogram();
        System.out.println(organogram);

        director.giveBonus();
        for (IEmployee headEmployee : ((BaseEmployee) director).getSubordinates()) {
            headEmployee.giveBonus();

            for (IEmployee employee : ((BaseEmployee) headEmployee).getSubordinates()) {
                employee.giveBonus();
            }
        }
    }
}
