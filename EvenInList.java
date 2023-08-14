import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class EvenList{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            li.add(num);
        }

        System.out.println("Original List: "+li);

        List<Integer> evenList = new ArrayList<>();
         List<Integer> oddList = new ArrayList<>();
        for (Integer nums : li){
            if(nums%2==0){
                evenList.add(nums);
            }
            else{
                oddList.add(nums);
            }
        }
        System.out.println("Even elements in the List: "+evenList);
        System.out.println("Odd elements in the List: "+oddList);
    }

    public void processLists() {
    }

}
