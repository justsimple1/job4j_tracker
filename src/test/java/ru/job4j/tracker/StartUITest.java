package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class StartUITest {
    @Test
    void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new MockInput(answers);
        Tracker tracker = new Tracker();
        StartUI.addItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");

        assertThat(created.getName()).isEqualTo(expected.getName());
    }

    @Test
    void whenReplaceItem() {
        Item item = new Item("Fix PC");
        Tracker tracker = new Tracker();
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId()), "Replace PC"};
        StartUI.editItem(new MockInput(answers), tracker);
        Item created = tracker.findAll()[0];
        assertThat(created.getName()).isEqualTo("Replace PC");
    }

    @Test
    void whenDeleteItem() {
        Item item = new Item("Fix PC");
        Tracker tracker = new Tracker();
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId())};
        StartUI.deleteItem(new MockInput(answers), tracker);
        Item expected = tracker.findById(item.getId());
        assertThat(expected).isEqualTo(null);
    }
}