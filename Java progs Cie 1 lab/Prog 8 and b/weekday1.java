enum Weekday {
   MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
 
   public boolean isWeekday()
   {
       if(this.ordinal() >= MONDAY.ordinal() && this.ordinal() <= FRIDAY.ordinal())
       {
           return true;
       }
       else
       {
           return false;
       }
   }
 
   public boolean isHoliday() {
       return !isWeekday();
   }
}
 
public class weekday1
{
   public static void main(String[] args)
   {  
       Weekday wednesday = Weekday.WEDNESDAY;
       printIsHoliday(wednesday);
      
       Weekday sunday = Weekday.SUNDAY;
       printIsHoliday(sunday);
   }
  
   public static void printIsHoliday(Weekday day)
   {
       if (day.isHoliday()) {
           System.out.println(day + " is a holiday");
       } else {
           System.out.println(day + " is not a holiday");
       }
  
   }
}
