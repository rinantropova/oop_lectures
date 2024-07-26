package ex04;

public class Robot1 {
    /**Robot's level */
    public int level;

    /**Robot's name */
    public String name;

    /**
     * Robot's creation
     * @param name Robot's name !Shouldn't start from a digit
     * @param level Robot's level
     */
    public Robot1(String name, int level)
    {
        this.name = name;
        this.level = level;
    }

    // Methods of switching on/off of subsystems

    /**BIOS loading */
    public void startBIOS() { System.out.println("Start BIOS...");}

    /**OS loading */
    public void startOS() { System.out.println("Start OS...");}

    /**Greeting */
    public void sayHi() { System.out.println("Hello world...");}

    /**BIOS unloading */
    public void stopBIOS() { System.out.println("Stop BIOS...");}

    /**OS unloading */
    public void stopOS() { System.out.println("Stop OS...");}

    /**Farewell */
    public void sayBye() { System.out.println("Bye...");}

    /**Work */
    public void work() { System.out.println("Working...");}

}
