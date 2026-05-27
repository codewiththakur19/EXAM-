package model;

public class Student {
    private int roll;
    private String name;
    private int m1, m2, m3;

    public Student(int roll, String name, int m1, int m2, int m3) {
        this.roll = roll;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public int getRoll() { return roll; }
    public String getName() { return name; }
    public int getM1() { return m1; }
    public int getM2() { return m2; }
    public int getM3() { return m3; }
}