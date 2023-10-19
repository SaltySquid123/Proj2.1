
import javax.sound.sampled.Line;
import java.util.Scanner;

public class LinearEquationLogic {
    private LinearEquation lin ;
    private Scanner scan;

    public LinearEquationLogic() {
        lin = null;
        scan = new Scanner(System.in);
    }

    public void start(){
        System.out.println("Welcome to the linear equation calculator!");
        getLinearInfo();
    }
    public void getLinearInfo() {
        System.out.print("Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coord2 = scan.nextLine();

        int idx1Comma = coord1.indexOf(",");
        int x1 = Integer.parseInt(coord1.substring(1, idx1Comma));
        int y1 = Integer.parseInt(coord1.substring(idx1Comma + 1, coord1.length() - 1));

        int idx2Comma = coord2.indexOf(",");
        int x2 = Integer.parseInt(coord2.substring(1, idx2Comma));
        int y2 = Integer.parseInt(coord2.substring(idx2Comma + 1, coord2.length() - 1));
        lin = new LinearEquation(x1, y1, x2, y2);
    }
    public void info() {
        System.out.println("The two points are: " + coord1 + " and " + coord2);
        System.out.println("The linear equation between these 2 points is: " + lin.equation());

    }
}
