
/**
 * Write a description of class HraciaPlocha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HraciaPlocha {
    private Obdlznik pozadie;
    private Obdlznik pozadie2;
    private int rozmer;
    /**
     * Constructor for objects of class HraciaPlocha
     */
    public HraciaPlocha(int rozmer) {
        this.rozmer = rozmer;
        this.pozadie = new Obdlznik();
        this.pozadie.zmenFarbu("blue");
        this.pozadie.zmenStrany(80 * rozmer + 6, 80 * rozmer + 6);
        this.pozadie.posunVodorovne(-3);
        this.pozadie.posunZvisle(-3);
        this.pozadie.zobraz();
        this.pozadie2 = new Obdlznik();
        this.pozadie2.zmenFarbu("black");
        this.pozadie2.zmenStrany(80 * rozmer - 6, 80 * rozmer - 6);
        this.pozadie2.posunVodorovne(3);
        this.pozadie2.posunZvisle(3);
        this.pozadie2.zobraz();
        for (int j = 0; j < rozmer - 1; j++) {  
            Obdlznik ciara = new Obdlznik();
            ciara.zmenStrany(5, 80 * rozmer);
            ciara.posunVodorovne(80 * (j + 1));
            ciara.zmenFarbu("yellow");
            ciara.zobraz();         
        }   
        for (int i = 0; i < rozmer - 1; i++) {
            Obdlznik ciara = new Obdlznik();
            ciara.zmenStrany(80 * rozmer, 5);
            ciara.posunZvisle(80 * (i + 1));
            ciara.zmenFarbu("yellow");
            ciara.zobraz();        
        }
    }
    public int getRozmer() {
        return this.rozmer; 
    }
}
