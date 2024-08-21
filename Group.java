package task4;

import java.util.Arrays;

public class Group {
    private String name;
    private Studenty[] students;
    private int count;

    public Group(String name, Studenty[] students, int count) {
        this.name = name;
        this.students = students;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Studenty[] getStudents() {
        return students;
    }

    public void setStudents(Studenty[] students) {
        this.students = students;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                ", count=" + count +
                '}';
    }
}
