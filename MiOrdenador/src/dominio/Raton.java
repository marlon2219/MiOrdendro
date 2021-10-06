
package dominio;


public class Raton extends DispositivoEntrada {
    private final int idRaton;
    private static int contadorRatones;
    
    
    

   

    public Raton(int idRaton, String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    
    
    
    
}
