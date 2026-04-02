package Practice_2;

import java.util.Scanner;

class Task {
    int priority;
    int time;

    Task(int priority, int time) {
        this.priority = priority;
        this.time = time;
    }

    @Override
    public String toString() {
        return priority + " " + time;
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read N
        int N = scanner.nextInt();
        Task[] tasks = new Task[N];

        // Read tasks
        for (int i = 0; i < N; i++) {
            int priority = scanner.nextInt();
            int time = scanner.nextInt();
            tasks[i] = new Task(priority, time);
        }

        // Perform Selection Sort
//
//        for (int i = 0; i < N - 1; i++) {
//            int min = i;
//            for (int j = i + 1; j < N; j++) {
//                if (tasks[min].priority > tasks[j].priority) {
//                    min = j;
//                } else if (tasks[min].priority == tasks[j].priority && tasks[min].time > tasks[j].time) {
//                    min = j;
//                }
//            }
//            Task temp = tasks[min];
//            tasks[min] = tasks[i];
//            tasks[i] = temp;
//        }


        for (int i = 0; i < N - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < N; j++) {
                // Compare based on priority first
                if (tasks[j].priority < tasks[minIndex].priority) {
                    minIndex = j;
                } else if (tasks[j].priority == tasks[minIndex].priority) {
                    // If priorities are same, compare by time
                    if (tasks[j].time < tasks[minIndex].time) {
                        minIndex = j;
                    }
                }
            }
            // Swap the found minimum element with the first element
            Task temp = tasks[minIndex];
            tasks[minIndex] = tasks[i];
            tasks[i] = temp;
        }

        // Print sorted tasks
        for (int i = 0; i < N; i++) {
            System.out.print(tasks[i].toString());
            if (i < N - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        scanner.close();
    }
}