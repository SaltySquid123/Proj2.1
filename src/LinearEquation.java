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
    public double intercept() {
        double m = ((double) y2 - y1) / ((double) x2 - x1);
        return y1 - (x1 * m);
    }
    public String equation() {
        if (y1 != y2 ) {
            String m = (y2 - y1) + "/" + (x2 - x1);
            return "y = " + m + "x" + " + " + intercept();
        }
        else {
            return "y = "  + intercept();
        }
    }
    public double distance() {
        double dis = Math.sqrt(Math.pow((double) x2 - x1, 2) + Math.pow((double) y2 - y1, 2));
        return ((double) Math.round(dis * 100) / 100);
    }
    public double slope(){
        return ((double) y2 - y1) / ((double) x2 - x1);
    }

}
