package Q1;

import java.util.Scanner;

public class EmpMain {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ch;

    do {
      System.out.println("Enter 1. for salaried employee");
      System.out.println("Enter 2. for contract employee");
      System.out.println("Enter 3. to exit");
      System.out.println("Enter your choice: ");
      ch = sc.nextInt();

      switch (ch) {
        case 1:
        Salaried e = new Salaried();
        System.out.println("Enter emp id: ");
        int id = sc.nextInt();
        sc.nextLine();
        e.setId(id);
        
        System.out.println("Enter emp name");
        String nm = sc.nextLine();
        e.setName(nm);


          break;
        default:
          break;
      }
    } while (ch != 3);

    sc.close();
  }
}
