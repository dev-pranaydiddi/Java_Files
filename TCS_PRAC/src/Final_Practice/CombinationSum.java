package Final_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CombinationSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int[] resultarr = new int[test];
        for (int i = 0; i < test; i++) {
            int len = sc.nextInt();
            int[] arr = new int[len];
            for (int j = 0; j < len; j++) {
                arr[j] = sc.nextInt();
            }
            int tar = sc.nextInt();
            List<List<Integer>> result = checkSum(arr, tar);
            for (List<Integer> x : result){
                for(Integer y : x){
                    System.out.print(y+", ");
                }
                System.out.println();
            }
            resultarr[i] = result.size();
        }
        for (int i : resultarr) {
            System.out.println(i);
        }
    }

    public static List<List<Integer>> checkSum(int[] arr, int tar) {
        Arrays.sort(arr);
        return checkCombSum(arr,tar,new ArrayList<>(),new ArrayList<>(),0);
//    }
    }

    public static List<List<Integer>> checkCombSum(int[] arr, int tar, List<List<Integer>> out, ArrayList<Integer> temp, int index) {
        if(tar == 0){
            out.add(new ArrayList<>(temp));
            return out;
        }
        for (int i = index; i < arr.length ; i++) {
            if(tar-arr[i] < 0) return out;
            if(i > index && arr[i] == arr[i-1]) continue;
            temp.add(arr[i]);
            checkCombSum(arr,tar-arr[i],out,temp,index+1);
            temp.removeLast();
        }
        return out;
    }
    }
