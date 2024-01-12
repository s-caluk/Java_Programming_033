package m15_selection_statements_part2;

public class Lab {
    public static void main(String[] args) {
        // Write a program using switch statement to display traffic light colors using following logic:
        //'R' or 'r' -> "Red", Y or y -> Yellow , G or g -> Green

        String lightColor = "r";

        switch (lightColor) {
            case "R":
            case "r":
                System.out.println("Red");
                break;
            case "Y":
            case "y":
                System.out.println("Yellow");
                break;
            case "G":
            case "g":
                System.out.println("Green");
                break;
            default:
                System.out.println("Invalid Color");
        }
    }
}
