package org.example;

import java.util.OptionalInt;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;
    protected Person person;

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

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null || OptionalInt.of(age).isEmpty() || address == null) {
            throw new IllegalStateException("Необходимо заполнить все параметры класса");
        } else {
            person = new Person(name, surname, age, address);
        }
        return person;
    }
}