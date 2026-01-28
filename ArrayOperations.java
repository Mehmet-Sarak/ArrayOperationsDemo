import java.util.Scanner;

public class ArrayOperations {
    static int[] array;

    public static void initializeArray(int len){
        if (len < 1 || len > 100){
            System.out.println("Invalid array length.");
            return;
        }
        array = new int[len];
        System.out.println("New array of length " + len + ':');
        for (int i = 0; i < len; i++){
            array[i] = (int) (Math.random() * 101);
            System.out.print(array[i] + " ");
        }
        System.out.print('\n');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = "a";
        initializeArray(10);
        while (!command.equals("e")){
            System.out.println("(a) Initialize array");
            System.out.println("(b) Find minimum and maximum of array");
            System.out.println("(c) Find average and calculate difference between average and each element of array");
            System.out.println("(d) Find sums of odd and even indexed elements");
            System.out.println("(e) Exit program");
            command = "";
            while (command.length() != 1 || command.charAt(0) < 'a' || command.charAt(0) > 'e'){
                System.out.print("Pick an operation (a-e): ");
                command = scanner.nextLine().toLowerCase().strip();
                if (command.length() != 1 || command.charAt(0) < 'a' || command.charAt(0) > 'e') System.out.println("Invalid operation.");
            }
            if (command.charAt(0) == 'a'){
                System.out.print("Enter length of array: ");
                while (!scanner.hasNextInt()){
                    command = scanner.nextLine().strip();
                    if (!command.isEmpty()){
                        System.out.println("Enter an integer.");
                        System.out.print("Enter length of array: ");
                    }
                }
                initializeArray(scanner.nextInt());
                scanner.nextLine();
            } else if (command.charAt(0) == 'b'){
                // TODO
            } else if (command.charAt(0) == 'c'){
                // TODO
            } else if (command.charAt(0) == 'd'){
                // TODO
            }
        }
        scanner.close();
    }
}
