package ru.netology.javaqa.domain;

public class FilmItem {
    private int id;
    private String filmName;
    private int releaseYear;
    private String filmGenre;

    public FilmItem(int id, String filmName, int releaseYear, String filmGenre) {
        this.id = id;
        this.filmName = filmName;
        this.releaseYear = releaseYear;
        this.filmGenre = filmGenre;
    }
}
