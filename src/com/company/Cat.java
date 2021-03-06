package com.company;

public class Cat extends Pet{

    // String name;
    boolean whiskers;
    boolean fur;
    int legs;
    double weight;
    String furColor;

    public Cat(String ownerName, String petName, int age, char gender, String homeAddress) {
        super(ownerName, petName, age, gender, homeAddress);
    }

    public Cat(String ownerName, String petName, int age, char gender, String homeAddress, boolean fur, double weight) {
        super(ownerName, petName, age, gender, homeAddress);
        this.fur = fur;
        this.weight = weight;
    }



    public boolean isWhiskers() {
    return whiskers;
    }

    public void setWhiskers(boolean whiskers) {
        this.whiskers = whiskers;
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
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

    @Override
    protected String makeSound(){
        return "MEOOOOOOOOW!";
    }

    protected String catYears(){
        int catYear;
        switch(age){
            case 0:
                catYear = 0;
                break;
            case 1:
                catYear = 15;
                break;
            case 2:
                catYear = 24;
                break;
            default:
                catYear = (age -2) * 4 + 24;
                break;
        }
        return super.getPetName() + " is " + super.getAge() + " human years old and " + catYear + " cat years old.";
    }
}
