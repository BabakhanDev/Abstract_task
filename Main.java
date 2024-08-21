package task4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

       Studenty[] studenties = {
               new Studenty("Bek", "M", "Bek@gmail.com"),
               new Studenty("Aida", "F", "Aida@gmail.com"),
        new Studenty("Nursultan", "M", "Nursultan@gmail.com"),
        new Studenty("Aruzhan", "F", "Aruzhan@gmail.com"),
        new Studenty("Azamat", "M", "Azamat@gmail.com"),
        new Studenty("Bermet", "F", "Alieva@gmail.com"),
        new Studenty("Ermek", "M", "Sadykov@gmail.com"),
        new Studenty("Gulzhan", "F", "Nurbekova@gmail.com"),
        new Studenty("Mirlan", "M", "Tursunov@Gmail.com"),
        new Studenty("Aiperi", "F", "Esenkulova@gmail.com")
       };



        Group[] groups = {
                new Group("Java", studenties, 10),
                new Group("JS", studenties, 15)};

        Mentor[] mentors = {
                new Mentor("Azat", "M", "Azamat@gmail.com", groups),
                new Mentor("Mirlan", "M", "Esenkulova@gmail.com", groups)};

        Peaksoft peaksoft = new Peaksoft("Peaksoft", "Bishkek", mentors, studenties);
// Вызов Методов
        Studenty foundStudent = peaksoft.searchByStudentName("Aida");
        if (foundStudent != null) {
            System.out.println("Found Student: " + foundStudent.getName());
        } else {
            System.out.println("Student not found");
        }
        System.out.println(".....................................");
        //  Вызов Методов
        Mentor foundMentor = peaksoft.searchByMentorEmail("Azamat@gmail.com");
        if (foundMentor != null) {
            System.out.println("Found Mentor: " + foundMentor.getName());
        } else {
            System.out.println("Mentor not found");
        }
        System.out.println(".....................................");
        // Студенттерди аттары боюнча сорттоо
        Studenty[] sortedStudents = peaksoft.sortByStudentName(studenties);
        for (Studenty student : sortedStudents) {
            System.out.println("Sorted Student: " + student.getName());
        }
        System.out.println(".....................................");
        // Жынысы боюнча фильтрлөө
        Studenty[] femaleStudents = peaksoft.onlyFemaleOrMaleGenders("F");
        for (Studenty student : femaleStudents) {
            System.out.println("Female Student: " + student.getName());
            
        }System.out.println(".....................................");
    }
}
