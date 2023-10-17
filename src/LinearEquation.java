public class LinearEquation {
    int x1;
    int y1;
    int x2;
    int y2;
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public String equation() {
        double m = ((double) y2 - y1) / ((double) x2 - x1);
        double b = y1 - (x1 * m);
        return "y = " + m + "x" + " + " + b;
    }
    public double distance() {
        double dis = Math.sqrt(Math.pow((double) x2 - x1, 2) + Math.pow((double) y2 - y1, 2));
        return ((double) Math.round(dis * 100) / 100);
    }
    public double slope(){
        return ((double) y2 - y1) / ((double) x2 - x1);
    }
    public double intercept() {
        double m = ((double) y2 - y1) / ((double) x2 - x1);
        return y1 - (x1 * m);
    }

}
