package com.company;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String name;
    private List<Student> list = new ArrayList<>();

    public Group(String name, List<Student> list) {
        this.name = name;
        this.list = list;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
