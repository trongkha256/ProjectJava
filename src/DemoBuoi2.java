import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoBuoi2 {
    public  static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] arr= new int[5];
        int n=arr.length;
        for (int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();

    }
}
