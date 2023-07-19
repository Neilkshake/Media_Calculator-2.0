import java.util.Scanner;

public class MediaCalculator {


    public static void menuView() {
        System.out.println("===== MENU =====");
    }

    public static double setNumGrades(Scanner scanner) {
        System.out.println("Do you want to take the average of how many grades? ");
        return scanner.nextDouble();
    }

    public static void setGrades(Scanner scanner) {
        Double grades = 0.0;
        Integer i = 0;
        Double numGrades = setNumGrades(scanner);

        System.out.println("\nInsert your grades: ");

        while (i < numGrades) {
            Double gradesLoop = scanner.nextDouble();
            if (gradesLoop > 10) {
                System.out.println("Invalid grade, the score can only go up to 10.");
                continue;
            }
            grades += gradesLoop;
            i++;
        }

        Double average = grades / numGrades;

        System.out.println("Your grade point average is: " + average);

        if (average >= 7) {
            System.out.println("\nGotcha! You been approved!");
        } else if (average >= 5) {
            System.out.println("\nA pity, you got recovery...");
        } else System.out.println("\nWow, study. Serious, you reproved.");
    }

}

