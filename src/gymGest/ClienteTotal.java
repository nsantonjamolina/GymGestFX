package gymGest;

import interfaces.palaPadel;

/**
 * Created by ignaciosantonjamolina on 16/5/16.
 */
public class ClienteTotal extends Cliente{

	int cuota;
	
    public ClienteTotal(String dni, String nombre, String direccion, String telefono, String gama, boolean material){
        super(dni, nombre, direccion, telefono, gama, material);
        this.cuota = cuotaMensual();
    }
    

    @Override
    int fijo() {
        return 30;
    }

    @Override
    int alquilerMaterial() {
        return 40;
    }
}

