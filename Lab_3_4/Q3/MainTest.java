package Q3;

import java.util.Scanner;

public class MainTest {

  public static void main(String[] args) {
    System.out.println(
      "______________________________________________________"
    );
    System.out.println(
      "| Sr. No. |                  OPTIONS                 |"
    );
    System.out.println(
      "|-----------------------------------------------------"
    );
    System.out.println(
      "|    1    |                 EMPLOYEES                |"
    );
    System.out.println(
      "|         |                                          |"
    );
    System.out.println(
      "|    2    |              MEMBERS OF CLUB             |"
    );
    System.out.println(
      "|_________|__________________________________________|"
    );
    System.out.println("select one from above options: ");
    Scanner sc = new Scanner(System.in);
    int ch = sc.nextInt();
    if (ch == 1) {
      System.out.println(
        "______________________________________________________"
      );
      System.out.println(
        "| Sr. No. |             EMPLOYEE DETAILS             |"
      );
      System.out.println(
        "|-----------------------------------------------------"
      );
      System.out.println(
        "|    1    |             SALARIED EMPLOYEE            |"
      );
      System.out.println(
        "|         |                                          |"
      );
      System.out.println(
        "|    2    |             CONTRACT EMPLOYEE            |"
      );
      System.out.println(
        "|         |                                          |"
      );
      System.out.println(
        "|    3    |                  VENDORS                 |"
      );
      System.out.println(
        "|_________|__________________________________________|"
      );
      System.out.println("select one from above options: ");
      int n = sc.nextInt();

      //----------------------------------------------------------------------------------------------------

      switch (n) {
        case 1:
          SalariedEmp s = new SalariedEmp();
          //Generic Data Input
          System.out.println("ENTER SALARIED EMPLOYEE DETAILS");
          System.out.println("Enter id: ");
          int sId = sc.nextInt();
          s.setId(sId);
          sc.nextLine();
          System.out.println("Enter name: ");
          String sName = sc.nextLine();
          s.setName(sName);
          System.out.println("Enter mobile: ");
          String sMobile = sc.nextLine();
          s.setMobile(sMobile);
          System.out.println("Enter email: ");
          String sEmail = sc.nextLine();
          s.setEmail(sEmail);
          System.out.println("Enter department: ");
          String sDept = sc.nextLine();
          s.setDept(sDept);
          System.out.println("Enter designation: ");
          String sDesg = sc.nextLine();
          s.setDesignation(sDesg);
          System.out.println("Enter date of joining: ");
          String sDoj = sc.nextLine();
          s.setDoj(sDoj);
          //Specific Data Input
          System.out.println("Enter basic salary:");
          int sSal = sc.nextInt();
          s.setBasicSal(sSal);
          System.out.println(s);
          break;
        case 2:
          Contract c = new Contract();
          System.out.println("ENTER CONTRACT EMPLOYEE DETAILS");
          System.out.println("Enter id: ");
          int cId = sc.nextInt();
          c.setId(cId);
          sc.nextLine();
          System.out.println("Enter name: ");
          String cName = sc.nextLine();
          c.setName(cName);
          System.out.println("Enter mobile: ");
          String cMobile = sc.nextLine();
          c.setMobile(cMobile);
          System.out.println("Enter email: ");
          String cEmail = sc.nextLine();
          c.setEmail(cEmail);
          System.out.println("Enter employee details: ");
          System.out.println("Enter department: ");
          String cDept = sc.nextLine();
          c.setDept(cDept);
          System.out.println("Enter designation: ");
          String cDesg = sc.nextLine();
          c.setDesignation(cDesg);
          System.out.println("Enter date of joining: ");
          String cDoj = sc.nextLine();
          c.setDoj(cDoj);
          System.out.println("Enter no of hours: ");
          int cHrs = sc.nextInt();
          c.setHrs(cHrs);
          System.out.println("Enter rate per hour: ");
          int cRate = sc.nextInt();
          c.setRate(cRate);
          break;
        case 3:
          Vendors v = new Vendors();
          System.out.println("ENTER VENDOR EMPLOYEE DETAILS");
          System.out.println("Enter id: ");
          int vId = sc.nextInt();
          v.setId(vId);
          sc.nextLine();
          System.out.println("Enter name: ");
          String vName = sc.nextLine();
          v.setName(vName);
          System.out.println("Enter mobile: ");
          String vMobile = sc.nextLine();
          v.setMobile(vMobile);
          System.out.println("Enter email: ");
          String vEmail = sc.nextLine();
          v.setEmail(vEmail);
          System.out.println("Enter employee details: ");
          System.out.println("Enter department: ");
          String vDept = sc.nextLine();
          v.setDept(vDept);
          System.out.println("Enter designation: ");
          String vDesg = sc.nextLine();
          v.setDesignation(vDesg);
          System.out.println("Enter date of joining: ");
          String vDoj = sc.nextLine();
          v.setDoj(vDoj);
          System.out.println("Enter no of employees: ");
          int vNoOfEmp = sc.nextInt();
          v.setNoOfEmp(vNoOfEmp);
          System.out.println("Enter amount per hour: ");
          int vAmt = sc.nextInt();
          v.setAmt(vAmt);
          break;
        default:
          System.out.println("CHOOSE VALID OPTION.");
          break;
      }
    } else if (ch == 2) {
      System.out.println("==========MEMBERS OF CLUB==========");
      MembersOfClub m = new MembersOfClub();
      System.out.println("Enter Member details: ");
      System.out.println("Enter id: ");
      int id = sc.nextInt();
      m.setId(id);
      sc.nextLine();
      System.out.println("Enter name: ");
      String name = sc.nextLine();
      m.setName(name);
      System.out.println("Enter mobile: ");
      String mobile = sc.nextLine();
      m.setMobile(mobile);
      System.out.println("Enter email: ");
      String email = sc.nextLine();
      m.setEmail(email);
      System.out.println("Enter membership:");
      String membership = sc.nextLine();
      m.setMembership(membership);
      System.out.println("Enter amount paid:");
      int amt = sc.nextInt();
      m.setAmtPaid(amt);
      System.out.println(m);
    } else {
      System.out.println("CHOOSE VALID OPTION.");
    }

    sc.close();
  }
}
