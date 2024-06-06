package LabTest.LabTest3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String DAGFileName;
        WorkflowGraph workflowGraph = new WorkflowGraph();
        System.out.println("Enter the DAG filename: ");
        DAGFileName = sc.nextLine();
        sc.close();
        workflowGraph.readDAGFILE(DAGFileName);
        workflowGraph.printSortedTasks();
        workflowGraph.findCriticalPath();
    }
}
