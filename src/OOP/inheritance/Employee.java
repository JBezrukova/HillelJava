package OOP.inheritance;

/**
 * Created by Þëÿ on 04.03.2016.
 */
public class Employee extends Person {
    private String position;

    public Employee(){
        
    }
    //can be done with setter
    //super(name) call person's constructor with parameter name

    public Employee(String name){
        super(name);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String getName() {
        return super.getName().toUpperCase() + "!"; //to get name from person
    }

    public void greeting() {
        System.out.println("Hello I'm employee, my name is " + getName());
    }
}

