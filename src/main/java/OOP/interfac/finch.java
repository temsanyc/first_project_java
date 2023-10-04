package OOP.interfac;

public interface finch extends bird{
    default void finch_take_off(){
        System.out.println("Finch");
        bird.super.take_off();
    }
}
