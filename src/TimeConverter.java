import java.util.Scanner;

public class TimeConverter {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.println("Example #01\nrun:\n[1] Seconds to Minutes\n[2] Seconds to Hours\n[3] Minutes to Seconds\n[4] Minutes to Hours\n[5] Hours to Seconds\n[6] Hours to Minutes\nChoose the Conversion: ");
 int choice = scanner.nextInt();

 System.out.print("Enter the Value: ");
 double value = scanner.nextDouble();

 switch (choice) {
 case 1:
 System.out.println(String.format("%.1f", value / 60.0) + " Minutes");
 break;
 case 2:
 System.out.println(String.format("%.1f", value / 3600.0) + " Hours");
 break;
 case 3:
 System.out.println(String.format("%.1f", value * 60.0) + " Seconds");
 break;
 case 4:
 System.out.println(String.format("%.1f", value / 60.0) + " Hours");
 break;
 case 5:
 System.out.println(String.format("%.1f", value * 60.0) + " Minutes");
 break;
 case 6:
 System.out.println(String.format("%.1f", value / 3600.0) + " Hours");
 break;
 default:
 System.out.println("Invalid choice. Please try again.");
 }

 System.out.print("Do you want to convert time? (Y/N): ");
 String response = scanner.next();

 if (response.equalsIgnoreCase("Y")) {
 System.out.println("\n[1] Seconds to Minute is\n[2] Seconds to Hours\n[3] Minutes to Seconds\n[4] Minutes to Hours\n[5] Hours to Seconds\n[6] Hours to Minutes\nChoose the Conversion: ");
 choice = scanner.nextInt();

 System.out.print("Enter the Value: ");
 value = scanner.nextDouble();

 switch (choice) {
 case 1:
 System.out.println(String.format("%.1f", value / 60.0) + " Minutes");
 break;
 case 2:
 System.out.println(String.format("%.1f", value / 3600.0) + " Hours");
 break;
 case 3:
 System.out.println(String.format("%.1f", value * 60.0) + " Seconds");
 break;
 case 4:
 System.out.println(String.format("%.1f", value / 60.0) + " Hours");
 break;
 case 5:
 System.out.println(String.format("%.1f", value * 60.0) + " Minutes");
 break;
 case 6:
 System.out.println(String.format("%.1f", value / 3600.0) + " Hours");
 break;
 default:
 System.out.println("Invalid choice. Please try again.");
 }
 } else {
 System.out.println("Time conversion terminated.");
 }

 scanner.close();
}
}