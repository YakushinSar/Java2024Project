package hw5;

public class Hw5_14 {
    public static void main(String[] args) {
        /*
9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
  8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
    7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
      6 5 4 3 2 1 0 1 2 3 4 5 6
        5 4 3 2 1 0 1 2 3 4 5
          4 3 2 1 0 1 2 3 4
            3 2 1 0 1 2 3
              2 1 0 1 2
                1 0 1
                  0
*/

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");

            }
            for (int j = 9 - i; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();

        }
        }
    }




