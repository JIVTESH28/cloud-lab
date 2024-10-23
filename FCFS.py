def fcfs(processes, burst_time):
    n = len(processes)
    waiting_time = [0] * n
    turnaround_time = [0] * n

    # Calculate waiting times
    for i in range(1, n):
        waiting_time[i] = waiting_time[i - 1] + burst_time[i - 1]

    # Calculate turnaround times
    for i in range(n):
        turnaround_time[i] = waiting_time[i] + burst_time[i]

    # Display process details
    print("Process    Burst Time    Waiting Time    Turnaround Time")
    for i in range(n):
        print(f"{processes[i]}\t\t{burst_time[i]}\t\t{waiting_time[i]}\t\t{turnaround_time[i]}")

    print(f"\nAverage Waiting Time: {sum(waiting_time) / n:.2f}")
    print(f"Average Turnaround Time: {sum(turnaround_time) / n:.2f}")

# Example input
processes = [1, 2, 3]
burst_time = [10, 5, 8]  # Burst time for each process

fcfs(processes, burst_time)
