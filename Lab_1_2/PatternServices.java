public class PatternServices {

  public static void showMenu() {
    System.out.println("Enter 1 for triangle: ");
    System.out.println("Enter 2 for rectangle: ");
    System.out.println("Enter 3 for diamond: ");
    System.out.println("Enter your choice:- ");
  }

  public static void triangleFun() {
    int i,j;
    for (i = 0; i < 5; i++) {
      for (j = 1; j <= 5 - i; j++) {
        System.out.print(" ");
      }

      for (j = 1; j <= i * 2 - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void rectangleFun() {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void diamondFun() {
		int number = 7;
		int m = 1;
		int n;
		while (m <= number) {
			n = 1;
			while (n++ <= number - m) {
				System.out.print(" ");
			}
			n = 1;
			while (n++ <= m * 2 - 1) {
				System.out.print("*");
			}
			System.out.println();
			m++;
		}
		m = number - 1;
		while (m > 0) {
			n = 1;
			while (n++ <= number - m) {
				System.out.print(" ");
			}
			n = 1;
			while (n++ <= m * 2 - 1) {
				System.out.print("*");
			}
			System.out.println();
			m--;
		}
	}
}

