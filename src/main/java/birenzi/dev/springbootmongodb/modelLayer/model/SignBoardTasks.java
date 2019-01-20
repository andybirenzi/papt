package birenzi.dev.springbootmongodb.modelLayer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
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

    public SignBoardTasks(String taskName, String taskDescription, TaskType taskType, TaskStatus taskStatus, Date startDate, Date endDate, List<Sign> assignedAds, List<SignBoard> assignedBoards, List<User> assignedUsers) {
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

}
