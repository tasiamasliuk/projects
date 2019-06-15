public enum Planet{
    MERCURY (3.302e+23,  2.439e6),
    VENUS   (4.869e+24,  6.052e6),
    EARTH   (5.975e+24,  6.378e6),
    MARTH   (6.419e+23,  3.393e6),
    JUPITER (1.899e+27,  7.149e7),
    SATURN  (5.685e+26,  2.556e7),
    URANUS  (8.683e+25,  2.556e7),
    NEPTUNE (1.024e+26,  2.477e7);
    
    
    private final double mass;              //kilograms
    private final double radius;            //meters
    private final double surfaceGravity;    //m/s^2
    
    //uniwersalna staa grawitacyjna w m^3/kg s^2
    private static final double G = 6.67300E-11;
    
    //konstruktor
    Planet (double mass, double radius){
        this.mass = mass;
        this.radius = radius;
        surfaceGravity = G * mass / (radius * radius);
    }
    
    public double get_mass(){
        return mass;
    }
    
    public double get_radius(){
        return radius;
    }
    
    public double get_surfaceGravity(){
        return surfaceGravity;
    }
    
    public double surfaceWeight(double mass){
        return mass * surfaceGravity;       //F=ma;
    }
}
