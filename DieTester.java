import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class DieTester {
    public static void main(String[] args) {
        System.out.println("Welcome to the dice simulator");

        ZombieDice d1 = new ZombieDice();
        ZombieDice d2 = new ZombieDice();

        d1.findDieFace();
        d2.findDieFace();


        System.out.println("Die 1: " + d1.getSide());
        System.out.println("Die 2: " + d2.getSide());

        d1.rollZombie();
        d2.rollZombie();

        d1.findDieFace();
        d2.findDieFace();

        System.out.println("Die 1: " + d1.getSide());
        System.out.println("Die 2: " + d2.getSide());
        d1.rollZombie();
        d2.rollZombie();

        d1.findDieFace();
        d2.findDieFace();

        System.out.println("Die 1: " + d1.getSide());
        System.out.println("Die 2: " + d2.getSide());d1.rollZombie();
        d2.rollZombie();

        d1.findDieFace();
        d2.findDieFace();

        System.out.println("Die 1: " + d1.getSide());
        System.out.println("Die 2: " + d2.getSide());






    }
}
