import java.util.Scanner;

public class Main {
    int choice;
    String str = "";

    public void draw() {
        switch (choice) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    str += "*";
                    System.out.println(str);
                }
                break;
            case 2:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            default:
                break;
        }
    }

    public void getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 - draw triangle");
        System.out.println("Enter 2 - draw square");
        System.out.println("Enter 3 - draw rectangle");
        System.out.println("Enter 0 - Exit");
        choice = sc.nextInt();
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.getInfo();
        m.draw();

    }
}
