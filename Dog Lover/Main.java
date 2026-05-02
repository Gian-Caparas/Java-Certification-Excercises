import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        char gen = ' ';
        String col = "";

        //GENDER INPUT
        while (true) {
            try {
                System.out.print("Enter dog gender (M/F): ");
                gen = in.next().charAt(0);
                if (gen == 'M' || gen == 'm' || gen == 'F' || gen == 'f') {
                    break;
                }
                System.out.println("Invalid input.");
            } catch (Exception e) {
                System.out.println("Error. Try again.");
                in.nextLine(); // clear scanner
            }
        }
        in.nextLine(); // clear buffer

        //COLOR INPUT
        while (true) {
            try {
                System.out.print("Enter dog color: ");
                col = in.nextLine();
                if (!col.isEmpty()) {
                    break;
                }
                System.out.println("Invalid input.");
            } catch (Exception e) {
                System.out.println("Error. Try again.");
            }
        }
        Dog mydog = new Dog(gen, col);
        System.out.println(mydog);

        in.close();
    }
}