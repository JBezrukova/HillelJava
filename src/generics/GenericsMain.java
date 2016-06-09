package generics;

import OOP.inheritance.Employee;
import OOP.inheritance.Manager;
import OOP.inheritance.Person;
import org.omg.CORBA.OBJ_ADAPTER;
import sun.dc.path.PathError;

import java.util.*;

/**
 * Created by Юля on 06.05.2016.
 */
public class GenericsMain {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Kolya"));
        Employee employee1 = employees.get(0);
        employee1.getPosition();

        Manager manager = new Manager();
        manager.setName("Vasya");
        Employee employee = new Employee("Petya");

        employee = manager;
        employee.greeting();

        List<Manager> managers = new ArrayList<>();
        employees.add(new Employee("Ann"));
        employee = employees.get(0);
        Manager manager1 = new Manager();
        manager1.setName("Olya");
        managers.add(manager);
        managers.add(manager1);

        fire(managers);

        fire(employees);

        Pair<Person, Person> pair1 = new Pair<>(new Person("Ivan"), new Person("Helen"));
        Person first = pair1.getFirst();
        Person second = pair1.getSecond();

        Map<Person, String> personStringMap = new HashMap<>();
        personStringMap.put(new Person("Ivan"), "person");
        personStringMap.put(manager, "mngr");


        List<Employee> employees1 = copy(managers);
        Collections.singletonList(employee);
        Collections.emptyList();
    }

    public static void fire(List<? extends Employee> employees){
        for (Employee employee : employees){
            System.out.println(employee.getName()+" was fired;");
        }
        //can not do
        //employees.add(new Employee())
    }

    public static void addEmployee(List<? super Employee> employees){
        employees.add(new Employee());
        Object employee = employees.get(0);
        //can not do
        //Employee employee = employees.get(0);
    }

    public static <T> List<T> copy(List<? extends T> source){
        List<T> target = new ArrayList<>();
        target.addAll(source);
        return target;
    }
}
