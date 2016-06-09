package OOP.inheritance;

import com.sun.java.accessibility.util.AccessibilityEventMonitor;

/**
 * Created by Юля on 04.03.2016.
 */
public class InheritanceMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ivan");

        Employee employee = new Employee();
        employee.setPosition("programmer");
        employee.setName("Denis");

        Manager manager = new Manager();
        manager.setPosition("director");
        manager.setName("Igor");
        manager.fire(employee);

        person.getName();

        Person employeeAsPerson = employee; //upcast наслденику присваевается тип родителя
        Person managerAsPerson = manager;

        //employeeAsPerson = person;

        managerAsPerson.getName();
        employeeAsPerson.getName();

        //person is a parent

        //Employee employee1 = (Employee) employeeAsPerson;

        // instanceof let us know which class is object of
        if (employeeAsPerson instanceof Employee) {
            System.out.println("employee");
        } else {
            System.out.println("not employee");
        }

        // System.out.println(employee1.getPosition());


        Person somebody = manager;
        speek(somebody);
        speek(employeeAsPerson);
        speek(manager);

        Employee employee1 = new Employee();
        employee1.setName("Ivan");
        System.out.println(employee.getName());
        System.out.println(person.getName());
        System.out.println(manager.getName());

        Object o = new Employee();
        o = "SDF";
        o.equals(employee);

    }

    public static void speek(Person person) {
        person.greeting();
    }

}
