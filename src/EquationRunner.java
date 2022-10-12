import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first coordinate pair");
        String firstPair = s.nextLine();
        int x1 = Integer.parseInt((firstPair.substring(1, firstPair.indexOf(",") )));
        int y1 = Integer.parseInt((firstPair.substring(firstPair.indexOf(",")+1, firstPair.length()-1)));
        System.out.print("Enter the second coordinate pair");
        String secondPair = s.nextLine();
        int x2 = Integer.parseInt((secondPair.substring(1, secondPair.indexOf(",") )));
        int y2 = Integer.parseInt((secondPair.substring(secondPair.indexOf(",")+1, secondPair.length()-1)));
        LinearEquation bothPairs = new LinearEquation(x1, y1, x2, y2);
        bothPairs.getSlope();
        bothPairs.getDistance();

    }
}
