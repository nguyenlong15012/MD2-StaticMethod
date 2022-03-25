package com.company;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change(); //gọi đến hàm change

        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Long");
        Student s3 = new Student(333, "Trang");

        s1.display();
        s2.display();
        s3.display();
    }
}
