package java_chess;

import java.io.File;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        Board b = new Board();
        b.initialiseState();
        b.showState();

    }

}
