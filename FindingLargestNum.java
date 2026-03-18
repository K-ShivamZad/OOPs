import java.util.Scanner;

public class FindingLargestNum {
    int[] arr;
    int n;
    Scanner sc;

    FindingLargestNum() {
        sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = sc.nextInt();
        arr = new int[n];
    }

    void input() {
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    int largest() {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    void closeScanner() {
        sc.close();
    }

    public static void main(String[] args) {
        FindingLargestNum obj = new FindingLargestNum();
        obj.input();
        int max = obj.largest();
        System.out.println("The largest number is: " + max);
        obj.closeScanner();
    }
}
