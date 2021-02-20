package DAO;

public class Student {
    int id,age;
    String name,place;

    public Student() {}

    public Student(int id, int age, String name, String place) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.place = place;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", age=" + age + ", name='" + name + '\'' + ", place='" + place + '\'' + '}';
    }
}
