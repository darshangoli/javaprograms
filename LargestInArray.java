// Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LargestInArray {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the number of elements: ");
        int num = sc.nextInt();

        System.out.println("Enter the elements:");
        for(int i=0;i<num;i++){
            int ele = sc.nextInt();
            list.add(ele);
        }

        System.out.println("The Generated List: "+list);

        System.out.println("Enter the number of small and large elements you want in the list: ");
        int point = sc.nextInt();
        Collections.sort(list);
        List<Integer> min = list.subList(0, point);
        List<Integer> max = list.subList(list.size()-point, list.size());
        System.out.println("Large "+point+" elements in the list is: "+max);
        System.out.println("Small "+point+" elements in the list is: "+min);
       
    }
}
