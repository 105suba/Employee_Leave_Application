package ajay2301;
import java.util.Scanner;
class casual_leave {
    int[] casualleave_manipulation(int num, int i, int[] taken, int[] balance) {
        for (int j = 0; j < balance.length; j++) {
            if (j == i) {
                taken[j] = taken[j] + num;
                balance[j] = balance[j] - num;
            }
        }
        return taken;

    }
    int[] sickleave(int[] taken, int[] balance) {
        return taken;
    }
}
class Sick_leave {
    int[] sickleavemanipulation(int num, int i, int[] taken, int[] balance) {
        for (int j = 0; j < balance.length; j++) {
            if (j == i) {
                taken[j] = taken[j] + num;
                balance[j] = balance[j] - num;
            }
        }
        return taken;
    }
    int[] casualeave(int[] taken, int[] balance) {
        return taken;
    }


}
class Approvalstatus {
    String approval()
    if (balance[index] == 0 && balancesickleave[index] == 0) {
        System.out.println("LEAVE NOT PERMITTED");
    } else {
        System.out.println();
        System.out.println("LEAVE PERMITTED");
    }

}

public class EmployeeLeaveApplication {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR ID:");
        String s = sc.nextLine();
        s = s.toUpperCase();
        int index = 0;
        int count = 0;
        String employee_ids[] = {
            "E001",
            "E002",
            "E003",
            "E004",
            "E005"
        };
        String employee_names[] = {
            "John Smith",
            "Emily Johnson",
            "Michael Lee",
            "Sarah Brown",
            "David Rodriguez"
        };
        String designations[] = {
            "Software Engineer",
            "HR Manager",
            "Data Analyst",
            "Marketing Specialist",
            "Project Manager"
        };
        for (int i = 0; i < employee_ids.length; i++) {
            if (s.equals(employee_ids[i])) {
                System.out.println("EMPLOYEE NAME:" + " " + employee_names[i]);
                System.out.println("EMPLOYEE ID:" + " " + employee_ids[i]);
                System.out.println("DESIGNATION:" + " " + designations[i]);
                System.out.println("------------------------------------");
                index = i;
            } else {
                count++;
            }
        }
        if (count == designations.length) {
            System.out.println("INVALID USER ");
        }
        int taken[] = {
            0,
            0,
            0,
            0,
            0
        };
        int balance[] = {
            12,
            12,
            12,
            12,
            12
        };
        int takensickleave[] = {
            0,
            0,
            0,
            0,
            0
        };
        int balancesickleave[] = {
            12,
            12,
            12,
            12,
            12
        };
        int totaltakenleave = 0, totalbalanceleave = 0;
        casual_leave c = new casual_leave();
        Sick_leave sl = new Sick_leave();

        System.out.println("ENTER THE TYPE OF LEAVE");
        System.out.println("Press 1 for casual leave");
        System.out.println("Press 2 for sick leave");
        int tp = sc.nextInt();
        System.out.println("ENTER THE DAYS OF LEAVE");
        int num = sc.nextInt();
        System.out.println("ENTER THE DESCRIPTION");
        String desc = sc.nextLine();
        if (tp == 1) {
            taken = c.casualleave_manipulation(num, index, taken, balance);
            takensickleave = c.sickleave(takensickleave, balancesickleave);
            System.out.println("---------------CASUAL LEAVE---------");
            System.out.print(" Taken leave:" + " " + taken[index] + " \t Balance leave:" + " " + balance[index]);
            System.out.println();
            System.out.println("---------------SICK LEAVE----------");
            System.out.println(" Taken leave:" + " " + takensickleave[index] + " \t Balance leave:" + " " + balancesickleave[index]);
            totaltakenleave = taken[index] + takensickleave[index];
            totalbalanceleave = balance[index] + balancesickleave[index];
            System.out.println("-----------------TOTAL---------------");
            System.out.println("Total Takenleave :" + totaltakenleave + "\t Total Balanceleave :" + totalbalanceleave);

            if (balance[index] == 0 && balancesickleave[index] == 0) {
                System.out.println("LEAVE NOT PERMITTED");
            } else {
                System.out.println();
                System.out.println("LEAVE PERMITTED");
            }

        } else {

            takensickleave = sl.sickleavemanipulation(num, index, takensickleave, balancesickleave);
            taken = sl.casualeave(taken, balance);

            System.out.println("---------------SICK LEAVE----------");
            System.out.println("Taken leave:" + " " + takensickleave[index] + "\t Balance leave:" + " " + balancesickleave[index]);
            System.out.println();
            System.out.println("---------------CASUAL LEAVE---------");
            System.out.println("Taken leave:" + " " + taken[index] + " \t Balance leave:" + " " + balance[index] + "\n ");
            totaltakenleave = taken[index] + takensickleave[index];
            totalbalanceleave = balance[index] + balancesickleave[index];
            System.out.println("-----------------TOTAL---------------");
            System.out.println("Total Takenleave :" + totaltakenleave + "\t Total Balanceleave :" + totalbalanceleave);
            System.out.println();
            if (balance[index] == 0 && balancesickleave[index] == 0) {
                System.out.println("LEAVE NOT PERMITTED");
            } else {
                System.out.println("LEAVE PERMITTED");
            }

        }




    }

}