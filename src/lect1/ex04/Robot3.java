package ex04;

import java.util.ArrayList;

public class Robot3 {
    
    enum State {
        On, Off
    }

    private static int defaultIndex;
    private static ArrayList<String> names;

    static {
        defaultIndex = 1;
        names = new ArrayList<String>();
    }

    /**Robot's level */
    private int level;

    /**Robot's name */
    private String name;

    private State state;

    private Robot3(String name, int level) {
        System.out.println(Character.isDigit(name.charAt(0)));
        if ((name.isEmpty()
            || Character.isDigit(name.charAt(0)))
            || Robot3.names.indexOf(name) != -1)

        {
            this.name = String.format("DefaultName_%d", defaultIndex++);
        } else {
            this.name = name;
        }

        Robot3.names.add(this.name);
        this.level = level;
        this.state = State.Off;
    }

    // public Robot3(String name) {
    //     if ((name.isEmpty()
    //     || Character.isDigit(name.charAt(0)))
    //     || Robot3.names.indexOf(name) == -1)
    //     { this.name = String.format("DefaultName_%d", defaultIndex++);}
    //     else { this.name = name; }

    //     Robot3.names.add(this.name);
    //     this.level = 1;
    //     this.state = State.Off;
    // }

    // public Robot3() {
    //     this.name = String.format("DefaultName_%d", defaultIndex++);

    //     Robot3.names.add(this.name);
    //     this.level = 1;
    //     this.state = State.Off;
    // }

    public Robot3(String name) {
        this(name, 1);
    }

    public Robot3() {
        this("");
    }

    public void power() {
        if (this.state == State.Off) {
            this.powerOn();
            this.state = State.On;
        } else {
            this.powerOff();
            this.state = State.Off;
        }
        System.out.println();
    }

    private void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    private void powerOff(){
        this.sayBye();
        this.stopOS();
        this.stopBIOS();     
    }

    public int getLevel(){
        return this.level;
    }

    public String getName(){
        return this.name;
    }

    /**BIOS loading */
    private void startBIOS() { System.out.println("Start BIOS...");}

    /**OS loading */
    private void startOS() { System.out.println("Start OS...");}

    /**Greeting */
    private void sayHi() { System.out.println("Hello world...");}

    /**BIOS unloading */
    private void stopBIOS() { System.out.println("Stop BIOS...");}

    /**OS unloading */
    private void stopOS() { System.out.println("Stop OS...");}

    /**Farewell */
    private void sayBye() { System.out.println("Bye...");}

    /**Work */
    public void work() { 
        if (this.state == State.On) {
            System.out.println("Working...");
        }
    }
    
    @Override
    public String toString() {
        return String.format("%s %d\n", this.name, this.level);
    }
}
