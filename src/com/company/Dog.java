package com.company;

public class Dog extends Pet{

    // String name;
    double weight;
    double height;
    String furColor;
    // int age;

    public Dog(String ownerName, String petName, int age, char gender, String homeAddress) {
        super(ownerName, petName, age, gender, homeAddress);
    }

    public Dog(String ownerName, String petName, int age, char gender, String homeAddress, double weight, double height) {
        super(ownerName, petName, age, gender, homeAddress);
        this.weight = weight;
        this.height = height;
    }


//    public Dog(String name){
//        // default constructor
//        this.name = name;
//    }
//
//    public Dog(String name, double weight, double height) {
//        this.name = name;
//        this.weight = weight;
//        this.height = height;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
}
