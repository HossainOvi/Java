// Rubayet Hossain - 260611040

public class DnaUtilities{
  public static void main(String[]args){
    System.out.println(watsonCrickTripletComplement("ZZZ"));
  }
  public static boolean isValidBase (char input){
    if ( input=='T' || input=='A' || input== 'C' || input=='G'){
    return true;
    
    }
    else {
      return false;
    }
  }
  public static char watsonCrickComplement( char input){
    if ( isValidBase(input)){
      if ( input== 'A'){
        return 'T';
      }
      else if ( input=='T'){
        return 'A';
      }
      else if (input=='C') {
        return 'G';
      }
      else if (input=='G') {
        return 'C';
      }
    }
    
    
     return input; 
    
  }
  public static String watsonCrickTripletComplement( String input){
    String result="";
    if ( input.length()==3){
      for(int i=0; i<3; i++){
        if ( isValidBase(input.charAt(i))){
          char temp = watsonCrickComplement(input.charAt(i));
          result = result + temp;
        }
        else {
         return ""; 
        }
        
      }
      return result;
    }
    else {
     return ""; 
    }
  }

  
}
  
