package Arrays_Practice;

import java.util.Arrays;

public class Rem_Dup {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,4,5,6,7,7};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(i>0){
                if(arr[i] != arr[count]){
                    arr[++count] = arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr)+ "count : " + (count+1) );
    }
}
