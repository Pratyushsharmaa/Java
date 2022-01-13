//convert speed from km/h to miles/h.


public class speedConverter {

        public static long toMilesPerHour(double KilometersPerHour) {
            if(KilometersPerHour<0){
                return -1;
            }
            long milesPerHour = Math.round(KilometersPerHour/1.609); //given in coding exercise question
            return milesPerHour;
        }
        public static void printConversion(double KilometersPerHour){
            if(KilometersPerHour<0){
                System.out.println("-1");
            } else {
                long milesPerHour = toMilesPerHour(KilometersPerHour);
                System.out.println(KilometersPerHour + " Km/h= "
                        + milesPerHour + " mi/h");
            }
        }

}
