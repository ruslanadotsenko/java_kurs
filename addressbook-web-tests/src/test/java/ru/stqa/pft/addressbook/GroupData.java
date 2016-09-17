package ru.stqa.pft.addressbook;

public class GroupData {
    private final String name;
    private final String header;
    private final String footer;
//конструктор
    public GroupData(String name, String header, String footer) {
        this.name = name;
        this.header = header;
        this.footer = footer;
    }
//методы возвращающие атрибуты
    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }
}
