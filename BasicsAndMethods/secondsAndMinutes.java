//total hours in given minutes(parameter1) and //seconds(parameter2).



public class secondsAndMinutes {
    public static void main(String[] args) {
        getDurationString(30,0);
        getDurationString(60,0);
        getDurationString(120,30);
        getDurationString(-20,30);
        getDurationString(30);
        getDurationString(120);
        getDurationString(-30);
    }
    private static String getDurationString(long minutes, long seconds){
    if((minutes<0) || (seconds<0 || seconds>59)){
        System.out.println("Invalid value");
    }
    else{
        long hour = minutes/60;
        hour += seconds/3600;
        long remainderMinutes = minutes % 60;
        long remainderSeconds = seconds % 60;
        System.out.println(minutes + " m " + seconds + " s = " + hour + " h " + remainderMinutes + " m " + remainderSeconds + " s ");
    }


    return null;
}
    private static String getDurationString(long seconds){
        if(seconds<0){
            System.out.println("Invalid value");
            return "invalid";
        }

        long minutes = seconds/60;
        long remainderSeconds = seconds%60;
    System.out.println(seconds + " s = " + minutes + " m " + remainderSeconds + " s ");
    return null;
}

}

