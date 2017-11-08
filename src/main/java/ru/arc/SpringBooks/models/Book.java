package ru.arc.SpringBooks.models;

public class Book {
    private final String name;
    private final String author;
    private final String genre;
    public int id = 0;

    public Book(String name) {
        this.name = name;
        this.author = "UNKNOWN";
        this.genre = "UNKNOWN";
    }

    public Book(String name, String author, String genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }
}

