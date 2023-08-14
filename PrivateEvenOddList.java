import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PrivateEvenOddList {
    private List<Integer> li = new ArrayList<>();
    private List<Integer> evenList = new ArrayList<>();
    private List<Integer> oddList = new ArrayList<>();
    
    private void inputElements() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            li.add(num);
        }
    }
    
    private void classifyElements() {
        for (Integer nums : li) {
            if (nums % 2 == 0) {
                evenList.add(nums);
            } else {
                oddList.add(nums);
            }
        }
    }
    
    private void displayLists() {
        System.out.println("Original List: " + li);
        System.out.println("Even elements in the List: " + evenList);
        System.out.println("Odd elements in the List: " + oddList);
    }
    
    public void processLists() {
        inputElements();
        classifyElements();
        displayLists();
    }
    
    public static void main(String args[]) {
        EvenList evenList = new EvenList();
        evenList.processLists();
    }
}
