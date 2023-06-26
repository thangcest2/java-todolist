package com.example.todolist;

import java.util.ArrayList;
import java.util.List;


public class TodoList {

    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(int index) {
        items.remove(index);
    }

    public List<String> getItems() {
        return items;
    }

    public void printItems() {
        for (String item : items) {
            System.out.println(item);
        }
    }

}
