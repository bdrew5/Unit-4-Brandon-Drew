public class DieTester {
    public static void main(String[] args) {
        System.out.println("Welcome to the dice simulator");

        ZombieDice d1 = new ZombieDice();
        ZombieDice d2 = new ZombieDice();

        d1.findDieFace();
        d2.findDieFace();


        System.out.println(d1.toString());
        System.out.println(d2.toString());

        d1.rollZombie();
        d2.rollZombie();

        d1.findDieFace();
        d2.findDieFace();

        System.out.println(d1.toString());
        System.out.println(d2.toString());



    }
}
