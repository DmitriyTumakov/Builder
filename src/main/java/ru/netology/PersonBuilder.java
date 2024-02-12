package ru.netology;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age = -1;
    private String city;

    public Person build() {
        if (age < 0 && age != -1 || age > 120 && age != -1) {
            throw new IllegalArgumentException("Некорректный возраст");
        } else if (surname == null || name == null || name == null && surname == null) {
            throw new IllegalStateException("Не хватает обязательных полей");
        }

        Person person;
        if (age == -1) {
            person = new Person(name, surname);
        } else {
            person = new Person(name, surname, age);
        }
        if (city != null) {
            person.setAddress(city);
        }
        return person;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }
}
