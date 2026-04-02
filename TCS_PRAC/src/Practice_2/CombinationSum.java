package Practice_2;

import java.util.*;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int[] resultarr = new int[test];
        for (int i = 0; i < test; i++) {
            int len = sc.nextInt();
//            System.out.println(len);
            int[] arr = new int[len];
            for (int j = 0; j < len; j++) {
                arr[j] = sc.nextInt();
//                System.out.println(arr[j]);
            }
            int tar = sc.nextInt();
            List<List<Integer>> result = checkSum(arr, tar);
            resultarr[i] = result.size();
        }
        for (int i : resultarr) {
            System.out.println(i);
        }

    }

    public static List<List<Integer>> checkSum(int[] indi, int target) {
        Arrays.sort(indi);
        return chechSumComb(indi, target, new ArrayList<>(), new ArrayList<>(), 0);
    }

    private static List<List<Integer>> chechSumComb(int[] indi, int target, List<List<Integer>> out, List<Integer> temp, int index) {
        if (target == 0) {
            out.add(new ArrayList<Integer>(temp));
            return out;
        }
        for (int ind = index; ind < indi.length; ind++) {
            if (ind > index && indi[ind] == indi[ind - 1]) continue;
            if (target - indi[ind] < 0) return out;
            temp.add(indi[ind]);
            chechSumComb(indi, target - indi[ind], out, temp, ind+1);
            temp.removeLast();
        }
        return out;
    }

}