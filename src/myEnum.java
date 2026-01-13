public class myEnum {

    public static void main(String [] args){

        Day day = Day.SUNDAY;

        System.out.println(day);
        System.out.println(day.getDayNumber());

        //Using enums is faster than using strings when using a switch
        switch(day){

            case MONDAY -> System.out.println("Its is a week day");
            case TUESDAY -> System.out.println("Its is a week day");
            case WEDNESDAY -> System.out.println("Its is a week day");
            case THURSDAY -> System.out.println("Its is a week day");
            case FRIDAY -> System.out.println("Its is a week day");
            case SATURDAY -> System.out.println("Its the weekend");
            case SUNDAY -> System.out.println("Its the weekend");
            default -> System.out.println("That is not a day");






        }
    }
}
