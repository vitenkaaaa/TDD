package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int size = phoneBook.add("1name", "123");
        assertEquals(1, size);
        size = phoneBook.add("2name", "123");
        assertEquals(2, size);
        size = phoneBook.add("1name", "321");
        assertEquals(3, size);
    }
    @Test
    public void testFindByNumber() {
        PhoneBook pb = new PhoneBook();
        pb.add("Alice", "123");
        assertEquals("Alice", pb.findByNumber("123"));
        assertNull(pb.findByNumber("999"));
    }
    @Test
    public void testPrintAllNames() {
        PhoneBook pb = new PhoneBook();
        pb.add("Charlie", "111");
        pb.add("Alice", "222");
        pb.add("Bob", "333");
        String allNames = pb.printAllNames();
        String[] names = allNames.split("\n");
        assertArrayEquals(new String[]{"Alice", "Bob", "Charlie"}, names);
    }
}

