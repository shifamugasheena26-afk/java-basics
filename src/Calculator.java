import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number :");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number :");
        int num2 = sc.nextInt();

        System.out.println("Enter Operator: " );
        char op =sc.next().charAt(0);

        if(op == '+'){
            System.out.println("Result = " + (num1+num2));
        }
        else if(op == '-'){
            System.out.println("Result = " + (num1-num2));
        }
        else if(op == '*'){
            System.out.println("Result = " + (num1*num2));
        }
        else if(op == '/'){
            System.out.println("Result = " + (num1/num2));
        }
        else{
            System.out.println("Invalid Operator");
        }

    }
}
