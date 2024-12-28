package utililty;

import tool.GetUsersDetail;

public class ExecuteProgram {
    GetUsersDetail dg = new GetUsersDetail();

    public String userName = dg.getUserName();
    public double userPayment = dg.getUserPayment();
    public int userSeatNumber = dg.getUserSeatNumber();

    int[] allSeats = dg.getSeats();

    public void displayAllSeats() {
        System.out.println("Available Seat Assignments:");
        for (int i = 0; i < allSeats.length; i++) {
            System.out.println("Seat " + (i + 1) + ": " + allSeats[i]);
        }
    }

    public void displayUserDetails() {
        System.out.println("\nUser Details:");
        System.out.println("Name: " + userName);
        System.out.println("Payment: " + userPayment);
        System.out.println("Seat Number: " + userSeatNumber);
    }
}
