package bai2.code;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.swim();
        hero.fight();
        CanSwim swimmer = (CanSwim) hero;
        swimmer.swim();

        CanFight fighter = (CanFight) hero;
        fighter.fight();

        // fight() không cần implement lại vì ActionCharacter đã có fight()
        // ActionCharacter.fight() tự động được dùng làm implementation của CanFight.fight()

    }
}
