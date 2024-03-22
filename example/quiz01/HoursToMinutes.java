public class HoursToMinutes {
    public static void main(String[] args) {
        final int MINUTES_PER_HOUR = 60;
        int hours = 3, minutes = 10;


        System.out.println(hours + "시간 " + minutes + "분");
        int minutesResult = (hours * MINUTES_PER_HOUR) + minutes;
        System.out.println("총 " + minutesResult + "분");

        hours = 9;
        minutes = 2;

        System.out.println(hours + "시간 " + minutes + "분");
        minutesResult = (hours * MINUTES_PER_HOUR) + minutes;
        System.out.println("총 " + minutesResult + "분");

    }
}
