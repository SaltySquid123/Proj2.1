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
        double m = ((double) (y2 - y1)) / (x2 - x1);
        m = roundToHundredth(m);
        return y1 - (x1 * m);
    }

    public String equation() {
        String eq = "";
        if (y1 != y2) {
            int intM = (y2 - y1) / (x2 - x1);
            String strM = (y2 - y1) + "/" + (x2 - x1);
            String absStrM = Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1);

            if ((y2 - y1) % (x2 - x1) == 0){
                strM = "" +  (y2 - y1) / (x2 - x1);
            }

            eq = "y = " + strM + "x";

            if (x2 - x1 < 0 && y2 - y1 < 0) {
                eq = "y = " + absStrM + "x";
            }
            else if (x2 - x1 < 0 || y2 - y1 < 0) {
                eq = "y = -" + absStrM + "x";
            }

            if  (intercept() > 0) {
                eq += " + " + intercept();
            }
            else if (intercept() < 0){
                eq = eq + " - " + Math.abs(intercept());
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
