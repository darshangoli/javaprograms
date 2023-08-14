import java.util.Scanner;

public class RegistrationNumber {
    public static void main(String args[]){

        String branchnum="";
        String specializationnum="";

        Scanner reg = new Scanner(System.in);

        System.out.println("Enter your Branch: ");
        String branch = reg.nextLine();
        if(branch.equals("vishakapatanam")){
            branchnum = "1";
        }
        else if(branch.equals("hyderabad")){
            branchnum = "2";
        }
        else if(branch.equals("bengaluru")){
            branchnum = "3";
        }
        else{
            System.out.println("Invalid Branch");
        }

        System.out.println("Enter your Specialization: ");
        String specialization = reg.nextLine();
        if(specialization.equals("ECE")){
            specializationnum = "1";
        }
        else if(specialization.equals("EEE")){
            specializationnum = "2";
        }
        else if(specialization.equals("CSE")){
            specializationnum = "3";
        }
        else if(specialization.equals("CIVIL")){
            specializationnum = "4";
        }

        System.out.println("Enter your Year: ");
        int year = reg.nextInt();

        System.out.println("Enter your Roll No: ");
        int rollno = reg.nextInt();

        System.out.println("Your Regestration Number is generated: "+branchnum+"21910"+year+"0"+specializationnum+"0"+rollno);

    }
}
