import java.util.Comparator;

public class CourseUtility implements Comparator<Course> {
    String directions;

    public CourseUtility(String directions) {
        this.directions = directions;
    }

    @Override
    public int compare(Course o1, Course o2) {
        if(this.directions == "ASC")
        {
            return o1.fee -o2.fee;
        }
        else{
            return o2.fee-o1.fee;
        }
    }
}
