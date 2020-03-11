package com.company;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Alex", 22));
        list.add(new Student("Ben", 33));
        list.add(new Student("Carl", 44));

        Group group = new Group("Java", list);

        String save = convertToString(group);
        System.out.println(save);

        Group group2 = createObjectFromJson(save);
        System.out.println(group2);


    }


    /*
    {
      "name": "Java",
      "list": [
        {
          "name": "Alex",
          "age": 22
        },
        {
          "name": "Ben",
          "age": 33
        },
        {
          "name": "Carl",
          "age": 44
        }
      ]
    }
         */
    private static String convertToString(Group group) {
        Gson gson = new Gson();
        return gson.toJson(group);
    }

    private static Group createObjectFromJson(String save) {
        Gson gson = new Gson();
        return gson.fromJson(save, Group.class);
    }


}
