package tool;

import java.util.Scanner;
import seat.AvailableSeat;

public class GetUsersDetail {
    Scanner scanner = new Scanner(System.in);
    private String userName;
    private double userPayment;
    private int seatNumber;

    AvailableSeat available = new AvailableSeat(); // No parameter needed here
    private final int[] seats = available.getSeatNumbers();

    public int[] getSeats() {
        return seats;
    }

    public String getUserName() {
        System.out.print("Enter your name: ");
        try {
            userName = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Error: Failed to get username. " + e.getMessage());
        }
        return userName;
    }

    public double getUserPayment() {
        System.out.print("Enter your payment: ");
        try {
            userPayment = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Error: Failed to get payment. " + e.getMessage());
        }
        return userPayment;
    }

    public int getUserSeatNumber() {
        System.out.print("Enter your seat number: ");
        try {
            seatNumber = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Failed to get seat number. " + e.getMessage());
        }
        return seatNumber;
    }
}
