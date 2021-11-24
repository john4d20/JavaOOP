package model;

public class Student {
    public String name;
    private int age;
    private String gender;
    private int id;

    public Student(String name, int age,String gender, int id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(){
        this.gender = gender;
    }
    public int getId(){
        return id;
    }
    public void setId(){
        this.age = id;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

}
