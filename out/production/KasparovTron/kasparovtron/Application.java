package kasparovtron;

import kasparovtron.tests.*;

public class Application {
    public static void main(String[] args) {

        PawnTest.run();
        RookTest.run();
        BishopTest.run();
        QueenTest.run();
        KingTest.run();
        KnightTest.run();

    }
}