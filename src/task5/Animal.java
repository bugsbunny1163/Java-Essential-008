package task5;

public class Animal {
    String name;
    int age;
    boolean tail;

    Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public String toString() {
        String temp;
        if (tail) {
            temp = "єсть";
        } else {
            temp = "нет";
        }

        return "\"Имя: " + name +
                ", возраст: " + age +
                ", хвост: " + temp +
                "\"";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        if (tail != animal.tail) return false;
        return name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + (tail ? 1 : 0);
        return result;
    }
}
