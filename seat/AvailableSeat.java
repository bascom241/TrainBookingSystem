package seat;

public class AvailableSeat {

    private final int[] seatNumbers = new int[100];

    public AvailableSeat() {
        for (int i = 0; i < seatNumbers.length; i++) {
            if (i < 10) {
                seatNumbers[i] = 10;
            } else if (i < 50) {
                seatNumbers[i] = 50; 
            } else {
                seatNumbers[i] = 100; 
            }
        }
    }

    public int[] getSeatNumbers() {
        return seatNumbers;
    }
}
