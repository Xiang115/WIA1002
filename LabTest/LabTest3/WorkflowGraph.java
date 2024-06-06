package LabTest.LabTest3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkflowGraph {
    List<Task> tasks;
    Map<String, Task> taskName;

    public WorkflowGraph() {
        tasks = new ArrayList<>();
        taskName = new HashMap<>();
    }

    public void addTask(String name, int estimatedRunTime) {
        if (taskName.containsKey(name)) {
            Task task = taskName.get(name);
            task.setEstimatedRunTime(estimatedRunTime);
        } else {
            Task task = new Task(name, estimatedRunTime);
            tasks.add(task);
            taskName.put(name, task);
        }
    }

    public void addDependency(String parentTaskName, String childTaskName) {
        Task parentTask = taskName.get(parentTaskName);
        Task childTask = taskName.get(childTaskName);
        childTask.addDependency(parentTask.getTaskName());
    }

    public void readDAGFILE(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = br.readLine()) != null) {
                if (line.startsWith("JOB")) {
                    String[] taskInfo = line.split(" ");
                    String taskName = taskInfo[1];
                    String fileName = taskInfo[2];
                    readTask(taskName, fileName);
                } else if (line.startsWith("PARENT")) {
                    String[] parts = line.split(" ");
                    List<String> parents = new ArrayList<>();
                    List<String> children = new ArrayList<>();
                    boolean isChildSection = false;

                    for (String part : parts) {
                        if (part.equals("PARENT")) {
                            continue;
                        } else if (part.equals("CHILD")) {
                            isChildSection = true;
                        } else {
                            if (isChildSection) {
                                children.add(part);
                            } else {
                                parents.add(part);
                            }
                        }
                    }

                    for (String child : children) {
                        for (String parent : parents) {
                            addDependency(parent, child);
                        }
                    }
                }
                br.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readTask(String taskname, String filename) {
        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            int estimatedRunTime = 0;

            while((line = br.readLine()) != null){
                if(line.startsWith("extimated_runtime")){
                    String[] parts = line.split("=");
                    estimatedRunTime = Integer.parseInt(parts[1].trim());
                    break;
                }
            }

            addTask(taskname, estimatedRunTime);
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public List<Task> getTasksSortedByRunTime() {
        List<Task> sortedTasks = new ArrayList<>(tasks);
        Collections.sort(sortedTasks);
        return sortedTasks;
    }

    public void printSortedTasks() {
        List<Task> sortedTasks = getTasksSortedByRunTime();
        for (Task task : sortedTasks) {
            System.out.println("Task " + task.getTaskName() + " : " + task.getEstimatedRunTime());
        }
    }

    public void findCriticalPath() {
        Map<String, Integer> maxTimes = new HashMap<>();
        int maxTime = 0;
        String lastTask = null;

        for (Task task : tasks) {
            int taskMaxTime = findMaxTime(task.getTaskName(), maxTimes);
            if (taskMaxTime > maxTime) {
                maxTime = taskMaxTime;
                lastTask = task.getTaskName();
            }
        }

        List<String> criticalPath = new ArrayList<>();
        while (lastTask != null) {
            criticalPath.add(lastTask);
            lastTask = findParentWithMaxTime(lastTask, maxTimes);
        }

        Collections.reverse(criticalPath);
        System.out.println("Critical Path: " + String.join(" -> ", criticalPath));
        System.out.println("Total Run Time: " + maxTime);
    }

    private int findMaxTime(String task, Map<String, Integer> maxTimes) {
        if (maxTimes.containsKey(task)) {
            return maxTimes.get(task);
        }
    
        Task taskObj = taskName.get(task);
        int maxTime = taskObj.getEstimatedRunTime();
    
        for (String dep : taskObj.getDependencies()) {
            maxTime = Math.max(maxTime, taskObj.getEstimatedRunTime() + findMaxTime(dep, maxTimes));
        }
    
        maxTimes.put(task, maxTime);
        return maxTime;
    }

    private String findParentWithMaxTime(String task, Map<String, Integer> maxTimes) {
        Task taskObj = taskName.get(task);
        String parentWithMaxTime = null;
        int maxTime = 0;
    
        for (String dep : taskObj.getDependencies()) {
            if (maxTimes.get(dep) > maxTime) {
                maxTime = maxTimes.get(dep);
                parentWithMaxTime = dep;
            }
        }
    
        return parentWithMaxTime;
    }
}
