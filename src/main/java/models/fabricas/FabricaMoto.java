package models.fabricas;

import interfaces.AbstractFactory;
import interfaces.Cambio;
import interfaces.Motor;
import models.cambios.CambioMoto;
import models.motores.MotorMoto;

public class FabricaMoto implements AbstractFactory {
    public Motor motor() {
        return new MotorMoto();
    }

    public Cambio cambio() {
        return new CambioMoto();
    }
}
