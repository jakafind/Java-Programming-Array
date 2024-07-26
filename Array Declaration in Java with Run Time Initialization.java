import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner jakaria = new Scanner(System.in);
        int i, s;
        System.out.print("Enter the size of an array: ");
        s = jakaria.nextInt();
        int[] arr = new int [s];
        System.out.println("Enter the value of an array: ");
        for(i = 0; i<s; i++)
        {
            arr[i]=jakaria.nextInt();
        }
        System.out.print("The value of the array : ");
        for(i = 0; i < s; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
