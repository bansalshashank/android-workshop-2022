package edu.shashank.ourfirstapp;

public class Student extends Class8 {
    public String name = "Shashank";
    private String fatherName = "please set name";
    public float marks;
    private String address;

    public void setFatherName(String name) {
        if(name.length() > 10 ) {
            fatherName = name;
        }
    }

    public String getFatherName() {
        if(name == "Shashank") {
            return "Set Name First";
        }
         return fatherName;
    }

    public int add(int a, int b ) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b + 40;
    }

    public float add(float a, float b, float c) {
        return a + b + c;
    }
}
