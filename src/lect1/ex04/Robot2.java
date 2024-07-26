package ex04;

public class Robot2 {
     /**Robot's level */
     private int level;

     /**Robot's name */
     private String name;
 
     /**
      * Robot's creation
      * @param name Robot's name !Shouldn't start from a digit
      * @param level Robot's level
      */
     public Robot2(String name, int level) {
        this.name = name;
        this.level = level;
     }
 
     // Methods of switching on/off of subsystems
 
    public void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    public void powerOff(){
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
    public void work() { System.out.println("Working...");}
}
