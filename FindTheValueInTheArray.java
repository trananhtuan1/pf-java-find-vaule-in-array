import java.util.Arrays;
import java.util.Scanner;

public class FindTheValueInTheArray {
    public static void main(String[] args) {
        String[] name = {"boby", "jonh", "kata", "lyly"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String enter = scanner.nextLine();

        boolean check = false;
        for (int i = 0; i < name.length; i++) {
            if (enter.equals(name[i])) {
                check = true;
                System.out.println("location " + name[i] + "is: " + (i + 1));
            }
        }
        if (!check) {
            System.out.println("Please Enter Again");
        }
    }
}
