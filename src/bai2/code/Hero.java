package bai2.code;

public class Hero extends ActionCharacter implements CanFly, CanSwim, CanFight {
    @Override
    public void fly() {
        System.out.println("Hero is flying");
    }

    @Override
    public void swim() {
        System.out.println("Hero is swimming");
    }
}
