package com.qa.Parents;

public class Animals {

    private String Animals;
    private boolean isCarnivore;

    public Animals(String Animals, boolean isCarnivore) {
        this.Animals = Animals;
        this.isCarnivore = isCarnivore;
    }

        public String getAnimals () {
            return Animals;
        }

    public boolean isCarnivore() {
        return isCarnivore;
    }

    public void setCarnivore() {
        isCarnivore = isCarnivore;
    }

@Override
    public String toString() {
        return Animals + "is a Carnivore = " + isCarnivore;
}
}
