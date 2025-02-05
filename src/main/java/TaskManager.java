import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3

    public TaskManager() {
        // Initialize tasks list
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("task added: " + task);
    }

    public List<String> listTasks() {
        return new ArrayList<>(tasks);
    }

    public void deleteTask(String task){
//        leave for iteration 4
    }

    public void exit() {
        // leave for iteration 2
    }
}