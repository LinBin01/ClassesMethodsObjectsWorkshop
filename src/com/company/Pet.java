package com.company;

public class Pet {
    String ownerName;
    String petName;
    int age;
    char gender;
    String homeAddress;

    public Pet(String ownerName, String petName, int age, char gender, String homeAddress) {
        this.ownerName = ownerName;
        this.petName = petName;
        this.age = age;
        this.gender = gender;
        this.homeAddress = homeAddress;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getHomeAdress() {
        return homeAddress;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAddress = homeAdress;
    }
}
