
/**
 * Write a description of class Hrac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hrac {
    private String meno;
    private HraciaPlocha hraciaPlocha;
    /**
     * Constructor for objects of class Hrac
     */
    public Hrac(String meno, HraciaPlocha hraciaPlocha) {
        this.hraciaPlocha = hraciaPlocha;
        this.meno = meno;
    }
    
    private String getMeno() {
        return this.meno;
    }
}
