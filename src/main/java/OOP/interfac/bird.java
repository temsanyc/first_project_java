package OOP.interfac;

public interface bird {
   default void sit_down(){
       System.out.println("Sit down");
   };
   default void take_off(){
       System.out.println("Take off");
   };
}
