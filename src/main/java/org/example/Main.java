package org.example;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {

        Person p = new Person("fff");

        String jsonPerson = new Gson().toJson(p);

        System.out.println(jsonPerson);
    }
}