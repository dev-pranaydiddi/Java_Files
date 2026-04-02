package Final_Practice;

import java.util.ArrayList;
import java.util.Scanner;


public class ExpenseCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<Finance> fins = new ArrayList<>();
        String income = sc.nextLine().trim();
        int incamt = Integer.parseInt(sc.nextLine().trim().replace("$",""));
//        sc.nextLine();
        String expense = sc.nextLine().trim();
        int expamt = 0;
        while(true){
            if(expense.equalsIgnoreCase("done")) break;
            int amt = Integer.parseInt(sc.nextLine().trim().replace("$",""));
            expamt+=amt;
            expense = sc.nextLine().trim();
        }
        System.out.println("Total income: "+incamt+"$");
        System.out.println("Total expense: "+expamt+"$");
        System.out.println("Total savings: "+ (incamt-expamt)+"$");
    }
}
