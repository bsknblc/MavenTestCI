public class Indicator {
    // comment
    public String indicator(int ph){
       String result = "";
       if (ph>7){
            result = "alkaline";
       }else if(ph<7){
            result = "acidic";
       }else{
           result = "neutral";
       }
       return result;
    }
}
