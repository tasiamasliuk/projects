public class Kolory_test {
    public static void main(String[] args) {

        for (Kolory kolor: Kolory.values()) {
            System.out.println(kolor + " ");
        }

        System.out.println();
        System.out.println("Niebieski znajduje się na pozycji " + (Kolory.Niebieski.ordinal() + 1));
    }
}
