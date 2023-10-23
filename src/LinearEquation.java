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
    public double roundToHundredth(double toRound){
        return Math.round(toRound * 100.0) / 100.0;
    }
    public double intercept() {
        double m = roundToHundredth((((double) y2 - y1) / ((double) x2 - x1)));
        return y1 - (x1 * m);
    }
    public String equation() {
        String eq = "";
        if (y1 != y2) {
            if ((y2 - y1) % (x2 - x1) == 0) {
                int m = (y2 - y1) / (x2 - x1);
                eq = "y = " + m + "x" + " + " + intercept();
            }
            else {
                String m = (y2 - y1) + "/" + (x2 - x1);
                eq = "y = " + m + "x" + " + " + intercept();
            }
        }
        else {
            eq = "y = "  + intercept();
        }
        return eq;
    }
    public double distance() {
        double dis = Math.sqrt(Math.pow((double) x2 - x1, 2) + Math.pow((double) y2 - y1, 2));
        return roundToHundredth(dis);
    }
    public double slope(){
        return roundToHundredth((((double) y2 - y1) / ((double) x2 - x1)));
    }
    public String newX(double newX) {
        double z = (newX * slope());
        z += intercept();
        double k = roundToHundredth(z);
        return "(" + newX + ", " + k + ")";
    }

}
