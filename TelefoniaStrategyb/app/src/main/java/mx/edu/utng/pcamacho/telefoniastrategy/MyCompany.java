package mx.edu.utng.pcamacho.telefoniastrategy;

/**
 * Created by UTNG on 14/09/2017.
 */

public class MyCompany implements Telefonica {
    @Override
    public double calcularTarifaLocal(int minutosLocal) {
        return minutosLocal *1.0;
    }

    @Override
    public double calcularTarifaLD(int minutosLD) {
        return minutosLD*1.50;
    }
}
