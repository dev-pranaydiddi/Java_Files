package Practice_4;
import java.util.*;
import java.lang.*;


public class Dup_Trans_Time_Based {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n =  sc.nextInt(); sc.nextLine();
        Map<String, String> trans = new HashMap<>();
        List<String> dup = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().replace(":","").split(" ");
            String key = parts[0] + " | " + parts[1] + " | " + parts[2];
            String Transaction = String.join(" ",parts);
            int currTime = Integer.parseInt(parts[3]);
            if(trans.containsKey(key)){
                int prevTime = Integer.parseInt(trans.get(key));
                if(currTime-prevTime<=60) {
                    dup.add(Transaction);
                }
            }
            trans.put(key,parts[3]);
        }

        for (int i = 0; i <dup.size() ; i++) {
            System.out.println(dup.get(i));
        }
    }
}




