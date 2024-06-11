import java.util.Scanner;
import java.util.Arrays;

public class ReveseArray {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter the size of the array: ");
            size = sc.nextInt();
            if (size > 0 && size <= 20) {
                arr = new int[size];
                for (int i = 0; i < size; i++) {
                    System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
                    arr[i] = sc.nextInt();
                }
                System.out.printf("Các phần tử trong mảng: ");
                for (int j = 0; j < size; j++) {
                    System.out.printf("%d ", arr[j]);
                }
                int temp = 0;
                for (int j = 0; j < arr.length / 2; j++) {
                    temp = arr[j];
                    arr[j] = arr[arr.length - 1 - j];
                    arr[arr.length - 1 - j] = temp;
                }

                System.out.printf( "\n%s","Mảng sau khi đảo ngược: " , "");
                for (int j = 0; j < size; j++) {
                    System.out.printf("%d ", arr[j]);
                }
            } else if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
    }
}
