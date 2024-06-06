package LabTest.LabTest3;

import java.util.ArrayList;
import java.util.List;

public class Task implements Comparable<Task> {
    String taskName;
    int estimatedRunTime;
    List<String> dependencies;

    public Task(String taskName, int estimatedRunTime) {
        this.taskName = taskName;
        this.estimatedRunTime = estimatedRunTime;
        this.dependencies = new ArrayList<>();
    }

    public void addDependency(String dependency) {
        this.dependencies.add(dependency);
    }

    public String getTaskName() {
        return taskName;
    }

    public int getEstimatedRunTime() {
        return estimatedRunTime;
    }

    public List<String> getDependencies() {
        return dependencies;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setEstimatedRunTime(int estimatedRunTime) {
        this.estimatedRunTime = estimatedRunTime;
    }

    public void setDependencies(List<String> dependencies) {
        this.dependencies = dependencies;
    }

    @Override
    public int compareTo(Task o) {
        return Integer.compare(this.estimatedRunTime, o.estimatedRunTime);
    }
}
