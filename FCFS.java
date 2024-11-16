import java.util.Scanner;

public class FCFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] at = new int[n], bt = new int[n], ct = new int[n], tat = new int[n], wt = new int[n];
        System.out.println("Enter Arrival Time and Burst Time:");
        for (int i = 0; i < n; i++) {
            at[i] = sc.nextInt();
            bt[i] = sc.nextInt();
        }

        int currentTime = 0;
        for (int i = 0; i < n; i++) {
            currentTime = Math.max(currentTime, at[i]) + bt[i];
            ct[i] = currentTime;
            tat[i] = ct[i] - at[i];
            wt[i] = tat[i] - bt[i];
        }

        System.out.println("\nP\tAT\tBT\tCT\tTAT\tWT");
        double totalTAT = 0, totalWT = 0;
        for (int i = 0; i < n; i++) {
            totalTAT += tat[i];
            totalWT += wt[i];
            System.out.println((i + 1) + "\t" + at[i] + "\t" + bt[i] + "\t" + ct[i] + "\t" + tat[i] + "\t" + wt[i]);
        }

        System.out.println("\nAvg TAT: " + (totalTAT / n) + ", Avg WT: " + (totalWT / n));
        sc.close();
    }
}
