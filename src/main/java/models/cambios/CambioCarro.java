package models.cambios;

import interfaces.Cambio;

public class CambioCarro implements Cambio {
    public String obter() {
        return "CVT com 8 marchas simuladas";
    }
}
