import java.util.ArrayList;
/**
 * Write a description of class Hra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hra {
    private ArrayList<String> zaznamenavaniePolicok;
    private Znak znak;
    private boolean hranePolicko;
    /**
     * Constructor for objects of class Hra
     */
    public Hra() {     
        this.zaznamenavaniePolicok = new ArrayList<String>();     
    }

    public boolean zakazKliknutNaRovnakePolickoDvakrat() {          
        for (String policko : this.zaznamenavaniePolicok) {
            if (this.znak.getAktualnePolicko().equals(policko)) {
                 this.hranePolicko = true;
            } else {
                 this.hranePolicko = false;
            }
        }
        this.zaznamenavaniePolicok.add(this.znak.getAktualnePolicko());
        return this.hranePolicko;
    }
    
}
