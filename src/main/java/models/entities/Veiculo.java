package models.entities;

import interfaces.AbstractFactory;
import interfaces.Cambio;
import interfaces.Motor;

public class Veiculo {
    private final Motor motor;
    private final Cambio cambio;

    public Veiculo (AbstractFactory fabrica) {
        motor = fabrica.motor();
        cambio  = fabrica.cambio();
    }

    public String obterMotor() {
        return motor.obter();
    }

    public String obterCambio() {
        return cambio.obter();
    }
}
