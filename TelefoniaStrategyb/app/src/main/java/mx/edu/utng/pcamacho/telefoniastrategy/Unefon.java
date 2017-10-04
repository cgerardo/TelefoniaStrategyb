package mx.edu.utng.pcamacho.telefoniastrategy;

/**
 * Created by UTNG on 14/09/2017.
 */

public class Unefon implements Telefonica {
    @Override
    public double calcularTarifaLocal(int minutosLocal) {
        return minutosLocal*1.0;
    }

    @Override
    public double calcularTarifaLD(int minutosLD) {
        return minutosLD*4.0;
    }
}
