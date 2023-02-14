package ru.job4j.tracker;

import java.util.Arrays;

/**
 * В классе Tracker должны быть методы
 * добавление заявок - public Item add(Item item);
 * получение списка всех заявок - public Item[] findAll();
 * получение списка по имени - public Item[] findByName(String key);
 * получение заявки по id - public Item findById(int id);
 * Метод удаления заявки - public boolean delete(int id);
 */

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int copySize = 0;
        for (int i = 0; i < size; i++) {
            Item name = this.items[i];
            if (name.getName().equals(key)) {
                rsl[copySize++] = name;
            }
        }
        return  Arrays.copyOf(rsl, copySize);
    }

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            items[index] = item;
            item.setId(id);
            rsl = true;
        }

        return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public boolean delete(int id) {
        boolean rsl = false;
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            System.arraycopy(items, indexOf(1), items, indexOf(id), size - indexOf(id));
            items[size - 1] = null;
            size--;
            return true;
        }
        return rsl;
    }
}