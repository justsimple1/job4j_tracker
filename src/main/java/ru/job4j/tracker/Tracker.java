package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.size);
    }

    public Item[] findByName(String name) {
        Item[] result = new Item[this.size];
        int size = 0;

        for (Item item: items) {
            if (item == null) {
                break;
            }
            if (item.getName().equals(name)) {
                result[size] = item;
                size++;
            }
        }

        return Arrays.copyOf(result, size);
    }
}