import java.util.Scanner;

/**
 * arrCreation
 */
public class arrCreation {

    public static void main(String[] args) {
        System.out.print("enter the size(integer) of array: ");
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        for(int i = 0; i<size; i++){
            System.out.print("Array["+i+"]= ");
            arr[i] = sc.nextInt();
            System.out.print("\033[H\033[2J");
        }
        sc.close();

        System.out.println("Your Array elements are -");
        for(int i = 0; i<size; i++){
            System.out.println("Array["+i+"]= "+arr[i]);
        }

    }
}