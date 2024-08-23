package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS
            = {"red", "green", "blue", "yellow", "pink", "black", "white"};
    private Random random = new Random();

    public String getRandomColor() {
        return COLORS[random.nextInt(COLORS.length)];
    }
}
