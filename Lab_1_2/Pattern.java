import java.util.Scanner;

public class Pattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ch;
    do {
      PatternServices.showMenu();
      ch = sc.nextInt();
      switch(ch){
        case 0:
        System.exit(0);
        break;
        
        case 1:
        PatternServices.triangleFun();
        break;

        case 2:
        PatternServices.rectangleFun();
        break;

        case 3:
        PatternServices.diamondFun();
        break;

        default:
        System.out.println("Invalid Input: ");
        break;
      }
    } while (ch != 0);
    sc.close();
  }
}
