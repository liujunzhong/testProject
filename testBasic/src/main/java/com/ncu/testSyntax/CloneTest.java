package com.ncu.testSyntax;

class Student {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    protected Student clone() {
        Student stu = null;
        try {
            stu = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return stu;
    }

    @Override
    public String toString() {
        return this.id + " ";
    }
}

public class CloneTest {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setId(111);
        Student stu2 = stu1.clone();
        System.out.println("stu1: " + stu1.toString());
        System.out.println("stu2: " + stu2.toString());
        stu2.setId(222);
        System.out.println("stu1: " + stu1.toString());
        System.out.println("stu2: " + stu2.toString());


    }

}
