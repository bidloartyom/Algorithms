import java.sql.SQLOutput;

public class FliperString {
    public static void main(String[] args) {
        String s="Hello World";
        System.out.println(fliper(s));
    }
    public static String fliper( String p1 ){
        if ( p1.length() <= 1 ){
            return p1;
        }
        return fliper(p1.substring(1)) + p1.charAt(0) ;
    }
}
