package java_chess;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Board b = new Board();
        MoveGenerator mg = new MoveGenerator(b);

        b.initialiseState();

        for (int i = 0; i < 10; i++) {
            int[] rndMove = mg.getRandomMove();
            try {
                b.executeMove(rndMove);
                b.showState();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
