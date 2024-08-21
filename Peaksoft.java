package task4;

import java.util.Arrays;

public class Peaksoft {
    private String name;
    private String address;
    private  Mentor[] mentors;
    private Studenty[] students;

    public Peaksoft(String name, String address, Mentor[] mentors, Studenty[] students) {
        this.name = name;
        this.address = address;
        this.mentors = mentors;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Mentor[] getMentors() {
        return mentors;
    }

    public void setMentors(Mentor[] mentors) {
        this.mentors = mentors;
    }

    public Studenty[] getStudents() {
        return students;
    }

    public void setStudents(Studenty[] students) {
        this.students = students;
    }


// method
public Mentor[] getAllMentors (String name){
        return mentors;
}
public Studenty[] getAllStudents(String name){
        return students;
}
public Studenty searchByStudentName(String name){
    for (Studenty stud : students) {
        if (stud.getName().equalsIgnoreCase(name)){
            return stud;
        }

    }
    return null;
}

public Mentor searchByMentorEmail(String email){
    for (Mentor mentor : mentors) {
        if (mentor.getEmail().equalsIgnoreCase(email)){
            return mentor;
        }

    }
    return null;
}

public Studenty[] sortByStudentName(Studenty[] students){
        Arrays.sort(students,(a,b)->a.getName().compareToIgnoreCase(b.getName()));
        return students;
}

public Studenty[] onlyFemaleOrMaleGenders(String gender){
        return Arrays.stream(students)
                .filter(studenty -> studenty.getGender().equalsIgnoreCase(gender))
                .toArray(Studenty[]::new);
}
    @Override
    public String toString() {
        return "Peaksoft{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mentors=" + Arrays.toString(mentors) +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
