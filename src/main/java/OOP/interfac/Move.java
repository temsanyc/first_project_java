package OOP.interfac;

public class Move implements finch,swallow {
    @Override
    public void sit_down() {
        swallow.super.swallow_sit_down();

    }

    @Override
    public void take_off() {
        finch.super.finch_take_off();

    }
}
