package OOP.inheritance;

/**
 * Created by Þëÿ on 04.03.2016.
 */
public class Manager extends Employee {



    public void fire(Employee employee) {
        System.out.println(employee.getPosition() + " " + employee.getName() + " fired by " + getPosition() + " " + getName());

    }

    public void greeting() {
        System.out.println("Hello I'm manager, my name is " + getName());
    }
}
