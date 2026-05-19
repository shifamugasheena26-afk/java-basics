import java.util.Scanner;
public class SumOfArrayElements {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.println("Array Elements :");
      int arr[] = new int[5];

      for(int i=0;i< arr.length;i++) {
          arr[i] = sc.nextInt();
      }

      int sum=0;
      for(int i=0;i< arr.length;i++)
          sum += arr[i];
      System.out.println("Sum = " + sum);
  }
}
