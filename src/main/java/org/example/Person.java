package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    String city;
    String education;

    // Constructor with firstname, lastname and age
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Constructor with gender, city and education
    public Person(String firstName, String lastName, int age, String gender, String city, String education) {
        this(firstName, lastName, age);
        this.gender = gender;
        this.city = city;
        this.education = education;
    }

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Method to check if the person is a teenager
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
