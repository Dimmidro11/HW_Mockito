package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.domain.FilmItem;
import ru.netology.javaqa.manager.FilmsManager;

public class FilmManagerTest {

    FilmItem film1 = new FilmItem(11, "Эйс Вентура", 1993, "Комедия");
    FilmItem film2 = new FilmItem(22, "Вечное сияние чистого разума", 2004, "Драма");
    FilmItem film3 = new FilmItem(33, "Пипец 2", 2013, "Боевик");
    FilmItem film4 = new FilmItem(44, "Тупой и ещё тупее", 1994, "Комедия");
    FilmItem film5 = new FilmItem(55, "Настоящее преступление", 2018, "Драма");
    FilmItem film6 = new FilmItem(66, "Соник в кино", 2020, "Боевик");
    FilmItem film7 = new FilmItem(77, "Лжец лжец", 1997, "Комедия");
    FilmItem film8 = new FilmItem(88, "Кабельщик", 1996, "Комедия");
    FilmItem film9 = new FilmItem(99, "Соник 2 в кино", 2022, "Боевик");
    FilmItem film10 = new FilmItem(100, "Шоу Трумана", 1998, "Комедия");
    FilmItem film11= new FilmItem(111, "Брюс всемогущий", 2003, "Комедия");
    FilmItem film12 = new FilmItem(122, "Соник 3 в кино", 2024, "Боевик");

    FilmsManager manager = new FilmsManager();

    @BeforeEach
    public void setup() {
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);
        manager.save(film8);
        manager.save(film9);
        manager.save(film10);
        manager.save(film11);
        manager.save(film12);
    }

    @Test
    public void shouldFindAll() {

        FilmItem[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11, film12};
        FilmItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {

        FilmItem[] expected = {film12, film11, film10, film9, film8};
        FilmItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
        public void shouldFindLast7Films() {

        FilmItem[] expected = {film12, film11, film10, film9, film8, film7, film6};
        FilmItem[] actual = manager.findLast(7);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast1() {

        FilmItem[] expected = {film12};
        FilmItem[] actual = manager.findLast(1);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast12Among12() {

        FilmItem[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        FilmItem[] actual = manager.findLast(12);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast13FilmsAmong12() {

        FilmItem[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        FilmItem[] actual = manager.findLast(13);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotFindFilmsLimitLess0() {

        FilmItem[] expected = {};
        FilmItem[] actual = manager.findLast(0);

        Assertions.assertArrayEquals(expected, actual);
    }

}
