import java.util.Arrays;
import java.util.Scanner;

public class ThemPt {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vi tri muon them");
        int index = scanner.nextInt();
        System.out.println("nhap so muon them");
        int so = scanner.nextInt();
        while (index > 10) {
            System.out.println("nhap lai");
            index = scanner.nextInt();
        }
        int[] newarr = new int[arr.length + 1];
        for (int i = 0; i < newarr.length; i++) {
            if (i < index) {
                newarr[i] = arr[i];
            }
            if (i == index) {
                newarr[i] = so;
            }
            if (i > index) {
                newarr[i] = arr[i - 1];
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}
