package OOP.inheritance;

import io.Car;

import java.io.Serializable;

/**
 * Created by ��� on 04.03.2016.
 */
public class Person implements Serializable {
    private String name;
    private Car car;
    //constructors is not polimorfing


   @Deprecated
    public Person(){
       System.out.println("is default person constructor");
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public boolean hasCar(){
        return car != null;
    }

    /**
     * constructors is not polimorfing(to see documentations click ctrl+Q)
     * @param name person's name
     */
    public Person(String name){
        this.name = name;
        System.out.println("in constructor of person with one parameter");
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void greeting() {
        System.out.println("Hello I'm person my name is " + name);
    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Person)) return false;
        Person another = (Person) other;
        return this.getName().equals(another.getName());

    }
    @Override
    public String toString(){
       return "I'm person. My name is "+getName();
    }
}
