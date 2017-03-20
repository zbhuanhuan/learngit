package com.task4.pojo;

/**
 * Created by admin on 2017/3/12.
 */
public class Student {
    int id;
    String name;
    String  introduction;
    String type;
    boolean good;

    public Student() {
    }

    public Student(int id, String name, String introduction, String type, boolean good) {
        this.id = id;
        this.name = name;
        this.introduction = introduction;
        this.type = type;
        this.good = good;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isGood() {
        return good;
    }

    public void setGood(boolean good) {
        this.good = good;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", introduction='" + introduction + '\'' +
                ", type=" + type +
                ", good=" + good +
                '}';
    }
}
