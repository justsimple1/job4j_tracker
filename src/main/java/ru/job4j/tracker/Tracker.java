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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
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

    public boolean replace(int id, Item item) {
       int index = indexOf(id);
       if (index == -1) {
           return false;
       }
       item.setId(items[index].getId());
       items[index] = item;
        return true;
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (index == -1) {
            return;
        }

        if (index == 0) {
            items[index] = null;
            size--;
            return;
        }

        System.arraycopy(items, index, items, index - 1, size - index - 1);
        items[size - 1] = null;
        size--;
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }
}