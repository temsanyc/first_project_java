package OOP.interfac;

public interface swallow extends bird{
    default void swallow_sit_down(){
        System.out.println("Swallow");
        bird.super.sit_down();
        bird.super.take_off();
    }

}
