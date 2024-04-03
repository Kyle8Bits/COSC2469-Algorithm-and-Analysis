package W2;
public class p2{
    public static void main (String[] args){
        
        int [] Array = {6,8,10,11,6,10};
        boolean found;
        for (int i = 0; i < Array.length; i++){
            found = false;
            for (int j = 0; j < Array.length; j++){
                if (i!=j && Array[i] == Array[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println(Array[i]);
            }
        }
    
    }
}