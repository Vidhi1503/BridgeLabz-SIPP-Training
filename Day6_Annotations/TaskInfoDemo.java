package Day6_Annotations;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)@interface TaskInfo{String priority();String assignedTo();}
class TaskManager{@TaskInfo(priority="HIGH",assignedTo="Alice")void task(){}}
public class TaskInfoDemo{
 public static void main(String[]a)throws Exception{
   TaskInfo t=TaskManager.class.getMethod("task").getAnnotation(TaskInfo.class);
   System.out.println(t.priority()+" "+t.assignedTo());
 }
}
