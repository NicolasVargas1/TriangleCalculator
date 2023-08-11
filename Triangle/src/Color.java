public class Color {

    private int red;
    private int green;
    private int blue;

    public Color ( int pRed, int pGreen, int pBlue ) {

        red = pRed;
        green = pGreen;
        blue = pBlue;

    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public void changeRed ( int pRed) {

        red = pRed;

    }
    public void changeGreen ( int pGreen) {

        green = pGreen;

    }
    public void changeBlue ( int pBlue) {

        blue = pBlue;

    }

}
