import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.println("Enter 5 numbers :");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int secondmax = arr[1];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }
            if(arr[i] > secondmax && arr[i] != max ){
                secondmax=arr[i];
            }
        }
        System.out.println("Largest : " + max);
        System.out.println("SecondLargest : " + secondmax);





    }
}
