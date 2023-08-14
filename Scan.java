import java.util.Scanner;

public class Scan {
    
    public static void main(String args[]){

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            System.out.println("Enter your age: ");
            int age = scanner.nextInt();

            System.out.println("My name is "+name+". I am "+age+" years old.");
        }
    }

}
