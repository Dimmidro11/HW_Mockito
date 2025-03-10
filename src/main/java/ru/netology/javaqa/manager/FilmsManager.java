package ru.netology.javaqa.manager;

import ru.netology.javaqa.domain.FilmItem;

public class FilmsManager {
    private FilmItem[] films = new FilmItem[0];
    private int limit;

    public FilmsManager() {
        this.limit = 5;
    }

    public FilmsManager(int limit) {
        this.limit = limit;
    }

    public void save(FilmItem film) {
        FilmItem[] tmp = new FilmItem[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public FilmItem[] findAll() {
        return films;
    }

    public FilmItem[] findLast() {
        if (limit < 1) {
            return films = new FilmItem[0];
        }
        if (limit <= films.length) {
            FilmItem[] tmp = new FilmItem[limit];
            for (int i = 0; i < limit; i++) {
                tmp[i] = films[films.length - 1 - i];
            }
            return tmp;
        } else {
            FilmItem[] tmp = new FilmItem[films.length];
            for (int i = 0; i < films.length; i++) {
                tmp[i] = films[films.length - 1 - i];
            }
            return tmp;
        }
    }
}
