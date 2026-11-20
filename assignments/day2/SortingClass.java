package assignments.day2;

import java.util.*;

class Course
{
    int id;
    String name;
    int fee;

    public Course(int id, String name, int fee) {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fee=" + fee +
                '}';
    }

}
public class SortingClass {
    public static void main(String[] args) {
        List<Course> list = Arrays.asList(
                new Course(101, "Java", 15000),
                new Course(102, "Python", 12000),
                new Course(103, "React", 15000),
                new Course(104, "SQL", 8000),
                new Course(105, "Angular", 12000)
        );
        sortAsc(list);
        sortDes(list);
        sortByName(list);
    }
    public static void sortAsc(List<Course> list)
    {
        System.out.println("-----------------Sorting by Asecending order ---------------------------------");
        Collections.sort(list,new CourseUtil("ASC"));
        for(Course c: list)
        {
            System.out.println(c);
        }
        System.out.println();
    }
    public static void sortDes(List<Course> list)
    {
        System.out.println("-----------------Sorting by Desecending order ---------------------------------");
        Collections.sort(list,new CourseUtil("DES"));
        for(Course c: list)
        {
            System.out.println(c);
        }
        System.out.println();
    }
    public static void sortByName(List<Course> list)
    {
        System.out.println("-----------------Sorting by Course Name ---------------------------------");
        Collections.sort(list,new CourseUtilByName());
        for(Course c: list)
        {
            System.out.println(c);
        }
        System.out.println();
    }

}
class CourseUtil implements Comparator<Course>
{
    String direction;

    public CourseUtil(String direction) {
        this.direction = direction;
    }

    @Override
    public int compare(Course o1, Course o2) {
        if(direction.equals("ASC"))
        {
            if(o1.fee < o2.fee)
            {
                return -1;
            }
            else if(o1.fee > o2.fee){
                return 1;
            }
        }
        else{
            if(o1.fee < o2.fee)
            {
                return 1;
            }
            else if(o1.fee > o2.fee){
                return -1;
            }
        }
        return 0;
    }
}
class CourseUtilByName implements Comparator<Course>
{

    @Override
    public int compare(Course o1, Course o2) {
        return o1.name.compareTo(o2.name);
    }
}
