package models.fabricas;

import interfaces.AbstractFactory;
import interfaces.Cambio;
import interfaces.Motor;
import models.cambios.CambioCarro;
import models.motores.MotorCarro;

public class FabricaCarro implements AbstractFactory {
    public Motor motor() {
        return new MotorCarro();
    }

    public Cambio cambio() {
        return new CambioCarro();
    }
}
