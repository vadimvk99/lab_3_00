public class Square implements GraphicalElement {
    double x1,y1,x2,y2,x3,y3,x4,y4,width,height;

    public Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        System.out.println("Constructor() "+this);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
        width=Math.abs(x1-x3);
        height=width;
    }
    @Override
    public void draw() {
        System.out.println("draw() "+this);
    }
}
