package OOP;

import java.util.Arrays;

/**
 * Created by ��� on 26.02.2016.
 */
public class Cat implements Comparable{
    private String color;
    private String name;
    private int birthYear;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Cat)) return false;

        Cat cat = (Cat) object;

        if (getBirthYear() != cat.getBirthYear()) return false;
        if (numberOfVaccines != cat.numberOfVaccines) return false;
        if (!getColor().equals(cat.getColor())) return false;
        if (!getName().equals(cat.getName())) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(vaccines, cat.vaccines);

    }

    @Override
    public int hashCode() {
        int result = getColor().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getBirthYear();
        result = 31 * result + Arrays.hashCode(vaccines);
        result = 31 * result + numberOfVaccines;
        return result;
    }

    private String[] vaccines = new String[10];
    private int numberOfVaccines;

    public Cat(String name, String color, int birthYear) {
        this.name = name;
        this.color = color;
        this.birthYear = birthYear;
    }

    public void meow() {
        System.out.println("meow!");
    }

    public void vaccinate(String vaccine) {
        vaccines[numberOfVaccines] = vaccine;
        numberOfVaccines++;
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Cat another = (Cat) o;
        if (birthYear > another.birthYear){
            return -1;
        }
        else {
            if (birthYear == another.birthYear){
                return 0;
            }
                return 1;
        }
    }

    public String toString() {

           return "name: " +name + " ,color: " + color + " birthYear: " + birthYear;

    }

}
