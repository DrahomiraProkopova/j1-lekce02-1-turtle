package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        zofka.setLocation(40, 200);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                zofka.move(80);
                zofka.turnRight(90);
                zofka.move(83);
                zofka.turnRight(90);
            }
            zofka.penUp();
            zofka.move(80);
            zofka.penDown();
            zofka.turnRight(45);
            zofka.move(60);
            zofka.turnRight(90);
            zofka.move(60);
            zofka.penUp();
            zofka.turnLeft(45);
            zofka.move(30);
            zofka.turnRight(90);
            zofka.move(80);
            zofka.turnRight(180);
            zofka.penDown();
        }





    }

}
