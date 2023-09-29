package org.example;

import org.example.Student;
import org.example.StudyGroupIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    //      - Создать класс Студент
    //      - Создать класс УчебнаяГруппаИтератор
    //      - Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
    //      - Реализовать его контракты (включая удаление)


    public static void main(String[] args) {

        Student first = new Student("Vasya", 20, 3);
        Student second = new Student("Ivan", 19, 2);
        Student third = new Student("Alla", 19, 2);

        List<Student> studentsList = new ArrayList<>(List.of(first, second, third));
        StudyGroupIterator studyGroupIterator = new StudyGroupIterator(studentsList);


        System.out.println(studyGroupIterator);

        studyGroupIterator.setCurrentIndex(studyGroupIterator.searchStudent("Ivan",19,2));
        studyGroupIterator.remove();
        studyGroupIterator.reset();


        System.out.println("-".repeat(30));
        while (studyGroupIterator.hasNext()) {
            System.out.print(studyGroupIterator.getStudent(studyGroupIterator.getCurrentIndex()));
            studyGroupIterator.next();
        }



    }
}
