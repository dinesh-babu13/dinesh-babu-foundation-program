import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Course {
    int id;
    String name;
    int fee;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fee=" + fee +
                '}';
    }

    public Course(int id, String name, int fee) {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

}
