package Practice_4;
import java.util.Scanner;
public class AdjSwap {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String[] str1 = sc.nextLine().split(" ");
        String[] str2 = sc.nextLine().split(" ");
        int[] a = new int[str1.length];
        int[] b = new int[str2.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(str1[i]);
            b[i] = Integer.parseInt(str2[i]);
        }
        int tar=0,count=0;
        for (int i = 0; i < a.length ; i++) {
            for (int j = i; j < a.length ; j++) {
                if(a[i] == b[j]){
                    tar = j;
                    System.out.println(tar);
                    break;
                }
            }
            for (int j = tar; j > i; j--) {
                b[j-1] += b[j] - (b[j] = b[j-1]);
                count++;
            }
        }
        System.out.println(count);
    }
}
