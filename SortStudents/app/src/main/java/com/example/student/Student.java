package com.example.student;

import java.util.Arrays;
import java.util.Comparator;

public class Student {
    private int id;
    private String fname;
    private String lname;
    private int age;
    private int[] grades= new int[5];
    private int avg;
    private boolean isLikvid=false;

    public Student() {
    }

    public Student(int id, String fname, String lname, int age, int[] grades) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.grades = grades;
        this.avg = solveAVG();
    }

    public int getId() {
        return id;
    }

    public boolean isLikvid() {
        return isLikvid;
    }

    public void setLikvid(boolean likvid) {
        isLikvid = likvid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getAvg() {
        return avg;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
    public static Comparator<Student> StudentFnameComparator = new Comparator<Student>() {

        public int compare(Student s1, Student s2) {
            String StudentName1 = s1.getFname().toUpperCase();
            String StudentName2 = s2.getFname().toUpperCase();

            //ascending order
            return StudentName1.compareTo(StudentName2);

            //descending order
            //return StudentName2.compareTo(StudentName1);
        }};
    public static Comparator<Student> StudentAVGComparator = new Comparator<Student>() {

        public int compare(Student s1, Student s2) {
            String StudentAVG1 = s1.getAvg()+"";
            String StudentAVG2 = s2.getAvg()+"";

            //ascending order
            return StudentAVG1.compareTo(StudentAVG2);

            //descending order
            //return StudentName2.compareTo(StudentName1);
        }};

    @Override
    public String toString() {
        return "id=" + id +", fname=" + fname +", lname=" + lname +", age=" + age +", grades=" + Arrays.toString(grades) +
                ", avg=" + avg+"\n";
    }

    private int solveAVG()
    {
        int sum=0;
        for (int i = 0; i <grades.length ; i++) {
            sum+= grades[i];
        }
        return (int)(Math.ceil(sum/grades.length));
    }
}
