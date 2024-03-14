package th1;

public abstract class Animal {
    private String makeSound;

    public Animal() {
    }

    public Animal(String makeSound) {
        this.makeSound = makeSound;
    }

    public String getMakeSound() {
        return makeSound;
    }

    public void setMakeSound(String makeSound) {
        this.makeSound = makeSound;
    }

    public abstract String makeSound();

    @Override
    public String toString() {
        return "Animal{" +
                "makeSound='" + makeSound + '\'' +
                '}';
    }
}
