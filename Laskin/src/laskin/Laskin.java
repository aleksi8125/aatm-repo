package laskin;

public class Laskin {

    private static double tulos;  // Muuttuja tulokselle
    
    public void nollaa() {     // Nollaa tuloksen
        tulos = 0;
    }

    public double annaTulos() {
        return tulos;
    }
    
    public void lisaa(double n) {
        tulos = tulos + n;
    }

    public void vahenna(double n) {
        tulos = tulos - n;
    }

    public void kerro(double n) {
        tulos = tulos * n;
    }

    public void jaa(double n) {
        if(n != 0) {
            tulos = tulos / n;
        } else {
            throw new java.lang.ArithmeticException("Can't divide by zero!");
        }                       
    }

    public void nelio(double n) {
        tulos = n * n;
    }

    public void neliojuuri(double n) {
        if(n >= 0) {
            tulos = (Math.sqrt(n));
        } else{
            throw new java.lang.ArithmeticException("Negative value!");
        }     
    }
    
    public void virtaON() {
        // Tähän voisi laittaa alkutoimet
        tulos = 0;
    }

    public void virtaOFF() {
        // Tähän voisi laittaa lopputoimet
    }

}
