public class Estimating_Pi {
    public static void main(String[] args) {
        random rand = new random();
        StdDraw draw = new StdDraw();

        double x,y;
        double points_in_circle = 0, points = 0;

        double Pi;

        StdDraw.setXscale(0,2);
        StdDraw.setYscale(0,2);

        draw.setPenColor(StdDraw.BOOK_BLUE);
        draw.filledSquare(1,1,1);
        draw.setPenColor(StdDraw.BLACK);
        draw.filledCircle(1,1,1);

        draw.setPenColor(StdDraw.WHITE);
        // 200 000 random points
        //percentage error = 0,0002%
        for (int i = 0; i < 200000; i++) {
            x = rand.uniform(-1.0,1.0);
            y = rand.uniform(-1.0,1.0);
            draw.point(x + 1,y + 1);

            points++;

            if (x*x + y*y <= 1)
                points_in_circle++;

            Pi = 4 * (points_in_circle/points);
            System.out.println(Pi);
        }
    }
}
