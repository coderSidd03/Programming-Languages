public class Main {

    public static void main(String[] args) {
        SpeedConverter.printConversion(10.5);

        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = "+ miles);
    }
}
