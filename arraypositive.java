import java.util.Scanner;

class arraypositive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int positive = 0;
        int negative = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                positive++;
            } else if (a[i] < 0) {
                negative++;
            }
        }

        System.out.println("Positive elements: " + positive);
        System.out.println("Negative elements: " + negative);

        sc.close();
    }
}