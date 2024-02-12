package ru.netology;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String city;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        return personBuilder.setSurname(surname).setAge(0).setAddress(city);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String city() {
        return city;
    }

    public boolean hasAddress() {
        return city != null;
    }

    public boolean hasAge() {
        return age != -1;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    public void setAddress(String city) {
        this.city = city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, city);
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" +
                "Возраст: " + age + ", " +
                "Живёт в городе " + city + ")";
    }
}
