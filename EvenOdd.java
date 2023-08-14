public class EvenOdd {

    public static int evenOdd(int number){
        if(number % 2 == 0){
            System.out.println(number+" is Even Number");
        }
        else{
            System.out.println(number+" is Odd Number");
        }
        return number;
    }

    public static int positiveNegative(int number){
        if(number > 0){
            System.out.println(number+" is Positive Number");
        }
        else{
            System.out.println(number+" is Negative Number");
        }
        return number;
    }

    public static void main(String args[]){
        int number1 = 12;
        int number2 = -15;
        evenOdd(number1);
        evenOdd(number2);
        positiveNegative(number2);
    }
}
