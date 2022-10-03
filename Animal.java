package com.company.java_core.homework15.task1;

import java.util.Objects;

public class Animal {
    private String animalName;
    private String type;

    public Animal() {
    }

    public Animal(String animalName, String type) {
        this.type = type;
        this.animalName = animalName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(type, animal.type) && Objects.equals(animalName, animal.animalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalName, type);
    }

    @Override
    public String toString() {
        return "Animal: " +
                "type - " + type +
                ", animalName - " + animalName;
    }
}
