import java.util.ArrayList;

class EmployeeManager {

    ArrayList<Employee> list = new ArrayList<>();

    // CREATE
    void addEmployee(Employee e) {
        list.add(e);
        System.out.println("Employee added.");
    }

    // READ
    void viewEmployees() {
        if (list.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        for (Employee e : list) {
            e.display();
        }
    }

    // UPDATE
    void updateEmployee(int id, String newName, double newSalary) {
        for (Employee e : list) {
            if (e.id == id) {
                e.name = newName;
                e.salary = newSalary;
                System.out.println("Employee updated.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // DELETE
    void deleteEmployee(int id) {
        for (Employee e : list) {
            if (e.id == id) {
                list.remove(e);
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
