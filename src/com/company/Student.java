package com.company;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //Hàm khởi tạo để khởi tạo biến
    Student(int r, String n){
        rollno = r;
        name = n;
    }

    //Phương thức static để thay đổi giá trị của biến static
    static void change(){
        college = "Codegym";
    }

    //Phương pháp hiện thị giá trị
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
