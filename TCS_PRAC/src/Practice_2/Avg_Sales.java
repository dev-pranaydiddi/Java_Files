package Practice_2;

import java.util.Scanner;

public class Avg_Sales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        float avg =0;
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            avg +=
                    (sc.nextFloat()*sc.nextInt());
        }
        System.out.println(avg/N);
    }

}
