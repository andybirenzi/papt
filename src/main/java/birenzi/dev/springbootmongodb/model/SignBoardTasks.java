package birenzi.dev.springbootmongodb.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
@Document (collection = "SignBoardTasks")
public class SignBoardTasks {
    private String id;
    private String taskName;
    private String taskDescription;

    private TaskType taskType;
    private TaskStatus taskStatus;
    private Date startDate;
    private Date endDate;

    private List<Sign> assignedAds;

    private List<SignBoard> assignedBoards;
    private List<User> assignedUsers;

    public SignBoardTasks(String id, String taskName, String taskDescription, TaskType taskType, TaskStatus taskStatus, Date startDate, Date endDate, List<Sign> assignedAds, List<SignBoard> assignedBoards, List<User> assignedUsers) {
        this.id = id;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskType = taskType;
        this.taskStatus = taskStatus;
        this.startDate = startDate;
        this.endDate = endDate;
        this.assignedAds = assignedAds;
        this.assignedBoards = assignedBoards;
        this.assignedUsers = assignedUsers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Sign> getAssignedAds() {
        return assignedAds;
    }

    public void setAssignedAds(List<Sign> assignedAds) {
        this.assignedAds = assignedAds;
    }

    public List<SignBoard> getAssignedBoards() {
        return assignedBoards;
    }

    public void setAssignedBoards(List<SignBoard> assignedBoards) {
        this.assignedBoards = assignedBoards;
    }

    public List<User> getAssignedUsers() {
        return assignedUsers;
    }

    public void setAssignedUsers(List<User> assignedUsers) {
        this.assignedUsers = assignedUsers;
    }
}
