/*Program pobierający wagę obiektu na Ziemi (w dowolnej jednostce) i wyświetla
tabelę wag obiektu na wszystkich ośmiu planetach (w pobranej jednostce):*/


public class WeightTable {
    public static void main(String[] args) {
        double earthWeight = Double.parseDouble(args[0]);
        double mass = earthWeight / Planet.EARTH.get_surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("Waga na %s wynosi %f%n",
                    p, p.surfaceWeight(mass));
    }
}
