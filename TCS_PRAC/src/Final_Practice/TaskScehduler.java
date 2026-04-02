package Final_Practice;

import java.util.Scanner;

class Task {
    int priority, time;

    Task(int priority, int time) {
        this.priority = priority;
        this.time = time;
    }

    @Override
    public String toString() {
        return priority + " " + time;
    }

}

public class TaskScehduler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Task[] tasks = new Task[n];
        for (int i = 0; i < n; i++) {
            String[] str = sc.nextLine().split(" ");
            Task task = new Task(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
            tasks[i] = task;
        }
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (tasks[min].priority > tasks[j].priority) {
                    min = j;
                }
                if (tasks[min].priority == tasks[j].priority && tasks[min].time > tasks[j].time) {
                    min = j;
                }
            }
            Task temp = tasks[min];
            tasks[min] = tasks[i];
            tasks[i] = temp;
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(tasks[i].toString());
        }
    }
}
