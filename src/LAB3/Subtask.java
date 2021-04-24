package LAB3;

public class Subtask extends Task {
    String subtaskName;

    String getSubtaskName() {
        return null;
    }

    void SubtaskName(String subtaskName) {
    }

    public String toString() {
        return "Subtask{subtaskName='" + this.subtaskName + '\'' + '}';
    }

    public Subtask() {
    }

    public Subtask(String taskName, String taskDescription, TaskCategory taskCategory) {
        super(taskName, taskDescription, taskCategory);
        this.subtaskName = this.subtaskName;
    }
}