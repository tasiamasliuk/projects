import java.util.Arrays;
public class Tekst {
    public static void main(String[] args) {
        String tekst = "Chromosom";
        System.out.println("Tekst                              : "+tekst);
        
        // testy, porównania
        System.out.println("equals(\"chromosom\")                : "+tekst.equals("chromosom"));
        System.out.println("equalsIgnoreCase(\"chromosom\")      : "+tekst.equalsIgnoreCase("chromosom"));
        System.out.println("contains(\"omo\")                    : "+tekst.contains("omo"));
        System.out.println("startsWith(\"Chro\")                 : "+tekst.startsWith("Chro"));
        System.out.println("endsWith(\"Chro\")                   : "+tekst.endsWith("Chro"));
        System.out.println("regionMatches(2,\"BROMEK\",1,3)      : " + tekst.regionMatches(2, "BROMEK",1 , 3));
        System.out.println("regionMatches(true,2,\"BROMEK\",1,3) : " + tekst.regionMatches(true, 2, "BROMEK",1 , 3));
        System.out.println("length()                           : "+tekst.length());
        
        // modyfikacje
        System.out.println("toLowerCase()                      : "+tekst.toLowerCase());
        System.out.println("toUpperCase()                      : "+tekst.toUpperCase());
        System.out.println("replace(\"osom\", \"atyda\")           : "+tekst.replace("osom", "atyda"));
        System.out.println("replaceFirst(\"o\", \"i\")             : "+tekst.replaceFirst("o", "i"));
        System.out.println("replaceAll(\"o\", \"i\")           	   : "+tekst.replaceAll("o", "i"));
        System.out.println("concat(\"owy\")                      : "+tekst.concat("owy"));
        
        // wycinanie i dzielenie
        System.out.println("substring(4)                   	   : "+tekst.substring(4));
        System.out.println("substring(3,6)                 	   : "+tekst.substring(3,6));
        String[] teksty = tekst.split("o");
        System.out.println("split(\"o\")                     	   : " +Arrays.toString(teksty));
        String[] teksty2 = tekst.split("o",2);
        System.out.println("split(\"o\",2)                   	   : " +Arrays.toString(teksty2) );
        
        tekst = " "+tekst+" ";
        System.out.println("tekst = \" \"+tekst+\" \"              : "+tekst);
        System.out.println("trim()                         	   : "+tekst.trim());
    }
}
