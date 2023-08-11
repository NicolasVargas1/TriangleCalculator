public class Triangle {

    private Point point1;
    private Point point2;
    private Point point3;
    private Color linesColor;
    private Color filledColor;


    public Triangle () {

        point1 = new Point(200, 50);
        point2 = new Point(150, 200);
        point3 = new Point(50, 200);

        linesColor = new Color(60, 168, 56);
        filledColor = new Color(0, 83, 24);

    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public Color getLinesColor() {
        return linesColor;
    }

    public Color getFilledColor() {
        return filledColor;
    }

    public double getPerimeter () {
        return side1Calculator() + side2Calculator() + side3Calculator();
    }

    public double getArea () {

        return ( ( getHeight() * side2Calculator() ) / 2 );
    }

    public double getHeight () {

        return Math.sqrt( ( side1Calculator() * side1Calculator() ) - ( side2Calculator() * side2Calculator() ) );
    }

    private double side1Calculator () {

        double valueX = Math.pow(point1.getX() - point2.getX(),2);
        double valueY = Math.pow(point1.getY() - point2.getY(),2);

        return Math.sqrt(valueX + valueY);
    }

    private double side2Calculator () {

        double valueX = Math.pow(point2.getX() - point3.getX(),2);
        double valueY = Math.pow(point2.getY() - point3.getY(),2);

        return Math.sqrt(valueX + valueY);
    }

    private double side3Calculator () {

        double valueX = Math.pow(point3.getX() - point1.getX(),2);
        double valueY = Math.pow(point3.getY() - point1.getY(),2);

        return Math.sqrt(valueX + valueY);
    }

    public double calculateOppositeAngle (double pX1, double pY1, double pX2, double pY2, double pX3, double pY3 ) {

        double angle1 = Math.atan2( pY2 - pY1, pX2 - pX1 );

        double angle2 = Math.atan2( pY3 - pY1, pX3 - pX1 );

        if (Math.abs( angle1 - angle2 ) > Math.PI) {

            angle1 = angle1 < 0 ? angle1 + 2.d * Math.PI : angle1;
            angle2 = angle2 < 0 ? angle2 + 2.d * Math.PI : angle2;

        }

        double oppositeAngle = ( angle1 + angle2 ) / 2.d + Math.PI;
        oppositeAngle = oppositeAngle % ( 2.d * Math.PI );
        return oppositeAngle;
    }

    public void changePoint1 (double pX, double pY) {

        point1.changeX( pX );
        point1.changeY( pY );

    }

    public void changePoint2 (double pX, double pY) {

        point2.changeX( pX );
        point2.changeY( pY );

    }

    public void changePoint3 (double pX, double pY) {

        point3.changeX( pX );
        point3.changeY( pY );

    }

    public void linesColorChange (int pRed, int pGreen, int pBlue) {

        linesColor.changeBlue(pBlue);
        linesColor.changeGreen(pGreen);
        linesColor.changeRed(pRed);
    }

    public void filledColorChange (int pRed, int pGreen, int pBlue) {

        filledColor.changeBlue(pBlue);
        filledColor.changeGreen(pGreen);
        filledColor.changeRed(pRed);
    }
}