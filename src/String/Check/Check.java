package String.Check;
public class Check {
    void Present(String string1,String string2){
        if(isWordPresent(string1,string2)) System.out.print("True");
        else System.out.print("No");
    }
    static boolean isWordPresent(String string1,String string2){
        String[]split1=string1.split(" ");
        for(String temp:split1){
            if(temp.equals(string2)) return true;
        }
        return false;
    }
        
        }
    
   
        
        
    
    

