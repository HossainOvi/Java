public class MakingChange {
  public static void main (String[] args) {
      int money=Integer.parseInt(args[0]); 
      int toonies= 200;
      int loonies= 100;
      int quarters=25;
      int dimes= 10;
      int nickels= 5;
      int pennies= 1;
      int numOfToonies = money/toonies;  
      int rem= money % toonies;  
      
      int numOfLoonies = rem/loonies;
      int rem2= rem %loonies;
      int numOfQuarters = rem2/quarters;
      int rem3= rem2% quarters;
      int numOfDimes= rem3/dimes;
      int rem4= rem3%dimes;
      int numOfNickels= rem4/nickels;
      int rem5= rem4% nickels;
      int numOfPennies= rem5;
      
        
        
      System.out.println( " Number of toonies=  "+ numOfToonies);
      System.out.println( " Number of loonies=  "+ numOfLoonies);
      System.out.println( " Number of quarters=  "+ numOfQuarters);
      System.out.println( " Number of dimes=  "+ numOfDimes);
      System.out.println( " Number of nickels =  "+ numOfNickels);
      System.out.println( " Number of pennies=  "+ numOfPennies);
  }
}
        
                          
                            
         
    
      
    