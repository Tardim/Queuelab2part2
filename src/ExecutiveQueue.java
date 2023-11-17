import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class ExecutiveQueue {
    private String name;
    private int seniority;

    public ExecutiveQueue(String name, int seniority) {
        this.name = name;
        this.seniority = seniority;
    }

    public void AddDepartment(String departmentName) {
        Scanner scan = new Scanner(System.in);
        Queue<Department> departments = new LinkedList<>();

        for (int i = 0; i < departments.size(); i++) {
            if (departments == null) {
                departmentName = scan.next();
                System.out.println("There is no departments. Create a department");


            }
        }
    }
}