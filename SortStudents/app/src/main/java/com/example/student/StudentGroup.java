package com.example.student;

import java.util.ArrayList;
import java.util.Collections;

public class StudentGroup {
    private ArrayList<Student> students = new ArrayList<Student>();

    public StudentGroup() {
    }

    public StudentGroup(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void fillStudents()
    {
        students.add(new Student(1,"Mariam","Petrosyan",22,new int[]{20,19,18,19,20}));
        students.add(new Student(2,"Marine","Badiryan",22,new int[]{16,19,18,19,20}));
        students.add(new Student(3,"Qristine","Vanesyan",22,new int[]{16,2,18,19,20}));
        students.add(new Student(4,"Ani","Sahakyan",22,new int[]{20,19,18,2,20}));
    }
    public String printStudents()
    {
        String list="";
        for (int i = 0; i <students.size() ; i++) {
            String gradesStr="[";
            for (int j = 0; j <students.get(i).getGrades().length ; j++) {
                gradesStr+=students.get(i).getGrades()[j]+", ";
            }
            gradesStr+="]";
            list+=" "+students.get(i).getId()+" "+students.get(i).getFname()+" "+students.get(i).getLname()+" "+gradesStr+" "+students.get(i).getAvg()+"\n";
        }
        return list;
    }
    public Student getStudentById(int id)
    {
        for (int i = 0; i < students.size() ; i++) {
            if(students.get(i).getId()==id)
            {
                return students.get(i);
            }
        }
        return null;
    }
    public String sortByName() {
        String names = "";
        /*Sorting based on Student Name*/
        System.out.println("Student Name Sorting:");
        Collections.sort(students, Student.StudentFnameComparator);

        for (Student str : students) {
            names += str.toString() + "\n";
        }
        return names;
    }
    public String sortByAvg() {
        String names = "";
        /*Sorting based on Student AVG*/
        System.out.println("Student AVG Sorting:");
        Collections.sort(students, Student.StudentAVGComparator);

        for (Student str : students) {
            names += str.toString() + "\n";
        }
        return names;
    }
    public void getLikvidStudentArray()
    {
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j <students.get(i).getGrades().length ; j++) {
                if(students.get(i).getGrades()[j]<8)
                {
                    students.get(i).setLikvid(true);
                    break;
                }
            }
        }
    }
    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                '}';
    }
}
