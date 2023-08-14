import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseList {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in) ;
            List<Integer> list = new ArrayList<>();

            System.out.println("Enter the number of elements: ");
            int n = scanner.nextInt();

            System.out.println("Enter the elments: ");
            for(int i=0; i<n; i++){
                int num = scanner.nextInt();
                list.add(num);
            }

            List<Integer> reversedList = new ArrayList<>();
            System.out.println("List with reverse order: ");
            for(int i = list.size()-1;i>=0;i--){
                reversedList.add(list.get(i));
            }
            System.out.println("Original List: "+list);
            System.out.println("Reversed List: "+reversedList);
            scanner.close();
        
    }
}
