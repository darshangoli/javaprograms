import java.util.Scanner;

public class Equal4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if(a==b && a==c && a==d && b==c && b==d && c==d){
            System.out.println("All the numbers are equal.");
        }
        else{
            System.out.println("All the numbers are not equal.");
        }
    }
}
