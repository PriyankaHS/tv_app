package com.ultralesson.tv_app;

public class Student
{
    // declare variables as private
    private String name;
    private String roll_no;

    private String std;

    public Student(String name, String roll_no, String std)
    {
        this.name = name;
        this.roll_no = roll_no;
        this.std = std;
    }

    // Public Methods to access variables using Getter method
    public String getName()
    {
        return name;
    }

    public String getRoll_no()
    {
        return roll_no;
    }

    public String getStd()
    {
        return std;
    }

    // Setters Method to set/update values
    public void setName(String name)
    {
        this.name = name;
    }

    public void setRoll_no(String rollNo)
    {
        this.roll_no = rollNo;
    }

    public void setStd(String std)
    {
        this.std = std;
    }

    public static void main(String[] args)
    {
        Student s = new Student("RamPriya", "17", "11");
        s.setName("Ramkumar");
        s.setRoll_no("1708");
        s.setStd("12");
        System.out.println(s.getName());
        System.out.println(s.getRoll_no());
        System.out.println(s.getStd());
    }

}
