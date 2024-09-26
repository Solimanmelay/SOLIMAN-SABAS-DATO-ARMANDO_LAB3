import java.util.Scanner;

public class Clock {

    public double SecondstoMinutes(int seconds) {
        return seconds / 60.0;
    }

    public double SecondstoHours(int seconds) {
        return seconds / 3600.0;
    }

    public int MinutestoSeconds(int minutes) {
        return minutes * 60;
    }

    public double MinutestoHours(int minutes) {
        return minutes / 60.0;
    }

    public int HourstoSeconds(int hours) {
        return hours * 3600;
    }

    public int HourstoMinutes(int hours) {
        return hours * 60;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clock clock = new Clock();
        boolean continueConversion = true;

        while (continueConversion) {

            System.out.println("Select the conversion option:");
            System.out.println("1. Seconds to Minutes");
            System.out.println("2. Seconds to Hours");
            System.out.println("3. Minutes to Seconds");
            System.out.println("4. Minutes to Hours");
            System.out.println("5. Hours to Seconds");
            System.out.println("6. Hours to Minutes");

            System.out.print("Enter your choice (1-6): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of seconds: ");
                    int secondsToMinutes = scanner.nextInt();
                    System.out.println(secondsToMinutes + " seconds is " + clock.SecondstoMinutes(secondsToMinutes) + " minutes");
                    break;

                case 2:
                    System.out.print("Enter the number of seconds: ");
                    int secondsToHours = scanner.nextInt();
                    System.out.println(secondsToHours + " seconds is " + clock.SecondstoHours(secondsToHours) + " hours");
                    break;

                case 3:
                    System.out.print("Enter the number of minutes: ");
                    int minutesToSeconds = scanner.nextInt();
                    System.out.println(minutesToSeconds + " minutes is " + clock.MinutestoSeconds(minutesToSeconds) + " seconds");
                    break;

                case 4:
                    System.out.print("Enter the number of minutes: ");
                    int minutesToHours = scanner.nextInt();
                    System.out.println(minutesToHours + " minutes is " + clock.MinutestoHours(minutesToHours) + " hours");
                    break;

                case 5:
                    System.out.print("Enter the number of hours: ");
                    int hoursToSeconds = scanner.nextInt();
                    System.out.println(hoursToSeconds + " hours is " + clock.HourstoSeconds(hoursToSeconds) + " seconds");
                    break;

                case 6:
                    System.out.print("Enter the number of hours: ");
                    int hoursToMinutes = scanner.nextInt();
                    System.out.println(hoursToMinutes + " hours is " + clock.HourstoMinutes(hoursToMinutes) + " minutes");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 6.");
                    break;
            }

            System.out.print("Do you want to perform another conversion? (yes/no): ");
            String continueResponse = scanner.next();

            if (continueResponse.equalsIgnoreCase("no")) {
                continueConversion = false;
                System.out.println("Thank you for using the Clock Conversion program. Goodbye!");
            }
        }
        scanner.close();
    }
}
