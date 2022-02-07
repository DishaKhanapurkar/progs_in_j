import java.time.LocalDate;
class employee { 
    private String name; 
    employee(String name) {
    this.name = name;
    }
    boolean validateDetails(){
        for(int index=0; index<this.name.length();index++)
        { 
         if((this.name.charAt(index) >= 'A' && this.name.charAt(index) <= 'Z') 
            ||(this.name.charAt(index) >= 'a' && this.name.charAt(index) <= 'z')){}
         else{
             return false;
         }
         return true;
        }
    }