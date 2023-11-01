
import javax.sound.sampled.Line;
import java.util.Scanner;

public class LinearEquationLogic {
    private LinearEquation lin ;
    private Scanner scan;
    private String coord1 = "";
    private String coord2 = "";
    private String keep = "y";
    private int x1;
    private int y1;
    private int x2;
    private int y2;


    public LinearEquationLogic() {
        lin = null;
        scan = new Scanner(System.in);
    }

    public void start(){
        System.out.println("Welcome to the linear equation calculator!");
        while (!keep.equals("n")) {
            getLinearInfo();
            System.out.println(info());
            if (x1 != x2) {
                System.out.print("Input value for x: ");
                double x3 = scan.nextDouble();
                System.out.println(xEquals(x3));
            }
            checkKeep();
        }
        System.out.println("Thank you for using our calculator. Goodbye!");
    }
    public void getLinearInfo() {
        System.out.print("Enter coordinate 1: ");
        coord1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        coord2 = scan.nextLine();

        int idx1Comma = coord1.indexOf(",");
        x1 = Integer.parseInt(coord1.substring(1, idx1Comma));
        y1 = Integer.parseInt(coord1.substring(idx1Comma + 2, coord1.length() - 1));

        int idx2Comma = coord2.indexOf(",");
        x2 = Integer.parseInt(coord2.substring(1, idx2Comma));
        y2 = Integer.parseInt(coord2.substring(idx2Comma + 2, coord2.length() - 1));
        lin = new LinearEquation(x1, y1, x2, y2);
    }
    public String info() {
        String str = "__________________________________________\n";
        if (x1 != x2) {
            str += "The two points are: " + coord1 + " and " + coord2 + "\n";
            str += "The linear equation between these 2 points is: " + lin.equation() +"\n";
            str += "The slope of this line is: " + lin.slope() + "\n";
            str += "The y intercept of the line is " + lin.yIntercept() + "\n";
            str += "The distance between these 2 points is " + lin.distance() + "\n";
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
    public String xEquals(double newX){
        scan.nextLine();
        System.out.println();
        return "The point on the line is: " + lin.coordinateForX(newX);
    }
    public void checkKeep(){
        System.out.println();
        System.out.println("Would you like to enter another pair of coordinates? y/n: ");
        keep = scan.nextLine();
    }

}
