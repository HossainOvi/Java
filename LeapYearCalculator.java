//Rubayet Hossain- 260611040

public class LeapYearCalculator { 
  public static void main(String[] args) { 
//    printIsLeapYear(2013);
//    printIsLeapYear(4);
//    
//    System.out.println(isLeapYear(1960));
//    System.out.println(isLeapYear(2013));
//    System.out.println(isLeapYear(4));
    int result = subsequentLeapYear(1960);
    System.out.println("The next leap year for 1960 is " + result);
  }
  public static void printIsLeapYear(int year) {
    
    if ( year % 4==0) {
      if ( year % 100!=0) {
        System.out.println ( year + " is a leap year");
        
      }
    
      else {
        if (year%400==0){
          System.out.println ( year + " is a leap year");
          
        
        }
      else {
         System.out.println ( year + " is not a leap year"); 
        }
      }
    }
      else {
        System.out.println ( year + " is not a leap year"); 
    }
  }
  
      public static boolean isLeapYear (int year) {
        if ( year % 4==0) {
          if ( year % 100!=0) {
            return true;
            
          }
    
         else {
           if (year%400==0){
             return true;
          
        
           }
           else {
             return false;
           }
         }
        }
         else {
           return false; 
         } 
       
  }
      
      public static int subsequentLeapYear(int year){
        boolean notFound = true;
        while (notFound){
        year = year +1 ;
         if (isLeapYear(year)){
           notFound = false;
           break;
         }
          
        }
        return year;
      }
}

      
  
