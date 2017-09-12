public class Triangle {

    public String printAsterisk() {
        return "*";
    }
    public String asteriskLine(int number){
        String result = "";
        for(int i = 0; i < number; i++ ){
            result += "*";
        }
        return result;
}
    public String asteriskVertical(int number){
        String result = "";
        for(int i = 0; i < number; i++ ){
            result += "*\n";
        }
        return result;
    }
    public String rightTriangle(int number){
        String result = "";
        for(int i=0; i < number; i++){
            String asteriskLine = "";
            for(int j=0; j <= i; j++){
               asteriskLine += "*";
            }
            result += asteriskLine + "\n";
        }
        return result;
    }



}
