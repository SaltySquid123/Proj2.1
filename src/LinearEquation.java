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
    public double yIntercept() {
        double m = ((double) (y2 - y1)) / (x2 - x1);
        m = roundToHundredth(m);
        return y1 - x1 * m;
    }

    public String equation() {
        String eq = "";
        if (y1 != y2) {
            String strM = (y2 - y1) + "/" + (x2 - x1);
            String absStrM = Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1);

            if ((y2 - y1) % (x2 - x1) == 0){
                strM = "" +  (y2 - y1) / (x2 - x1);
                absStrM = "" + Math.abs((y2 - y1) / (x2 - x1));
                if (x2 - x1 < 0 && y2 - y1 < 0) {
                    eq = "y = " + absStrM + "x";
                }
                else if (x2 - x1 < 0 || y2 - y1 < 0) {
                    eq = "y = -" + absStrM + "x";
                }
                else {
                    eq = "y = " + strM + "x";
                }
            }
            else {

                if (x2 - x1 < 0 && y2 - y1 < 0) {
                    eq = "y = " + absStrM + "x";
                } else if (x2 - x1 < 0 || y2 - y1 < 0) {
                    eq = "y = -" + absStrM + "x";
                } else {
                    eq = "y = " + strM + "x";
                }
            }

            if (absStrM.equals("-1") || strM.equals("-1")) {
                eq = "y = -x";
            }
            else if (absStrM.equals("1") || strM.equals("1")) {
                eq = "y = x";
            }

            if  (yIntercept() > 0) {
                eq += " + " + yIntercept();
            }
            else if (yIntercept() < 0){
                eq = eq + " - " + Math.abs(yIntercept());
            }

        }
        else {
            eq = "y = "  + yIntercept();
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
    public String coordinateForX(double newX) {
        double z = (newX * slope());
        z += yIntercept();
        double k = roundToHundredth(z);
        return "(" + newX + ", " + k + ")";
    }
    public String lineInfo() {
        String str = "__________________________________________\n";
        if (x1 != x2) {
            str += "The two points are: " + "(" + x1 + ", " + y1 + ")" + " and " + "(" + x2 + ", " + y2 + ")" + "\n";
            str += "The linear equation between these 2 points is: " + equation() +"\n";
            str += "The slope of this line is: " + slope() + "\n";
            str += "The y intercept of the line is " + yIntercept() + "\n";
            str += "The distance between these 2 points is " + distance() + "\n";
            return str;
        }
        else if (x1 == x2) {
            str += "The points are on a vertical line: x = " + x1;
            return str;
        }
        else {
            return "";
        }
    }
}
