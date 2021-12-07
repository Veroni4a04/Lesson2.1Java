public class Main {
    public static void main(String[] args) {
        int ticketPrice = 1000;
        int rublesForMile = 20;
        int bonusMile = ticketPrice / rublesForMile;

        System.out.println("Бесплатные мили: " + bonusMile);
    }
}
