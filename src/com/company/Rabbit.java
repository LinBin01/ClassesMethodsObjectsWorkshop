package com.company;

public class Rabbit extends Pet {
    double weight;
    String furColor;
    String eyeColor;
    String likeToEat;


    public Rabbit(String ownerName, String petName, int age, char gender, String homeAddress) {
        super(ownerName, petName, age, gender, homeAddress);
    }

    public Rabbit(String ownerName, String petName, int age, char gender, String homeAddress, double weight, String furColor) {
        super(ownerName, petName, age, gender, homeAddress);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getLikeToEat() {
        return likeToEat;
    }

    public void setLikeToEat(String likeToEat) {
        this.likeToEat = likeToEat;
    }
}
