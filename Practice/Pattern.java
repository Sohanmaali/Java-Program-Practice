import java.util.Scanner;

class DymandPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row number");
        int row = sc.nextInt();
        int a = row - 1, x = 1;
        for (int i = 1; i < row << 1; i++) {
            for (int j = 1; j < row << 1; j++) {
                if ((i <= row && (j >= row - i + 1 && j < (row << 1) - a))|| (i > row && (j > x && j < (row << 1) - x))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
            a--;
            if (i > row)
                x++;
        }
        sc.close();
    }
}