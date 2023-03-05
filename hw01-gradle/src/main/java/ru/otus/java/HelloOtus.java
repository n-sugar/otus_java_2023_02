package ru.otus.java;

import com.google.common.base.Splitter;

import java.util.List;

public class HelloOtus {
    public static void main(String[] args) {
        String teachers = "Сергей Петрелевич,Стрекалов Павел,Александр Оруджев,Вячеслав Лапин,Виталий Куценко";
        List<String> list = Splitter.on(",").splitToList(teachers);
        System.out.println("Преподаватели курса:");
        for (String name : list) {
            System.out.println(name);
        }
    }
}