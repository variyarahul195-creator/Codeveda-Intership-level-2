import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        while (true) {
            System.out.println("\n1 Add");
            System.out.println("2 View");
            System.out.println("3 Update");
            System.out.println("4 Delete");
            System.out.println("5 Exit");
            System.out.print("Choice: ");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    manager.addEmployee(new Employee(id, name, salary));
                    break;

                case 2:
                    manager.viewEmployees();
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("New Salary: ");
                    double newSal = sc.nextDouble();

                    manager.updateEmployee(uid, newName, newSal);
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    manager.deleteEmployee(did);
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}
 
    

