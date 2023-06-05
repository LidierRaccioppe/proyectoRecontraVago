package Model;
import View.VistaVagos;

import java.util.Observable;
import java.util.Observer;

/**
 * Observar of New User from View
 * Version: Undefined
 * @LidierRaccioppe
 */
public class Observar implements Observer {
    /**
     * Este método es llamado siempre que hay un nuevo Usuario
     * El observable cuando hace el notifyObservers
     * 'dispara' todos los update de los Observers
     * @param o   el observable, en nuestro caso es el Modelo
     * @param arg el argumento pasado por el observable, el coche actualizado
     */
    @Override
    public void update(Observable o, Object arg) {
        // el argumento es tipo Object, porque es general
        // le hacemos un cast para poder trabajar con un objeto Usuario
        Usuario auxUsuario = (Usuario) arg;
        System.out.println("Se ha creado un nuevo usuario");
        // comunicamos de forma interna que se hizo un Usuario nuevo
        System.out.println("Esto no hara nada, el observer con utilidad y varios eventos todavia no encontra la necesidad de usarlo");










    }
}
