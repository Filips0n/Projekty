import java.util.ArrayList;
/**
 * Write a description of class Znak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Znak {
    private String circle = "pics\\circle.png";
    private String cross = "pics\\cross.png";
    private String stav;
    private Obrazok znak;
    private int pocitadlo;
    private HraciaPlocha hraciaPlocha;
    private int x;
    private int y;
    private String aktualnePolicko;
    private Hra hra;
    /**
     * Constructor for objects of class Znak
     */
    public Znak(HraciaPlocha hraciaPlocha) {
        this.hra = new Hra();
        this.hraciaPlocha = hraciaPlocha;
        this.stav = cross;     
        this.pocitadlo = 0;
        
    }

    public String urciStav() {        
        if (this.pocitadlo % 2 == 0) {
            this.stav = cross;            
        } else {
            this.stav = circle;            
        }  
        this.pocitadlo++;
        return stav;
    }

    public void vyberSuradnice(int x, int y) {
        x -= 62;
        y -= 52;
        System.out.println();
        System.out.println();
        vytvorZnak();
        if (x < 0) {
            x = 0;
        }
        if (x > ( this.hraciaPlocha.getRozmer() -1 ) * 80) {
            x = ( this.hraciaPlocha.getRozmer() -1) * 80;
        }
        if (y < 0) {
            y = 0;
        }
        if (y > ( this.hraciaPlocha.getRozmer() -1 ) * 80) {
            y = ( this.hraciaPlocha.getRozmer() -1) * 80;
        }
        System.out.println(x);
        System.out.println(y);
        int posX = x / 80;
        int posY = y / 80;
        System.out.println();
        System.out.println(posX);
        System.out.println(posY);
        this.aktualnePolicko = "" + posX + posY;
        
        if (this.hra.zakazKliknutNaRovnakePolickoDvakrat()){
            System.out.println("zabrate");
        } else {
            System.out.println("volne");
          this.znak.posunVodorovne(80 * posX);
          this.znak.posunZvisle(80 * posY);                    
          zobrazZnak();
        }
    }

    public void vytvorZnak() { 
        this.stav = urciStav();
        this.znak = new Obrazok(this.stav);
        this.znak.posunVodorovne(-33);
        this.znak.posunZvisle(-43);
    }

    public void zobrazZnak() {        
        this.znak.zobraz();
    }
    
    public String getAktualnePolicko() {
        return this.aktualnePolicko;
    }
}
