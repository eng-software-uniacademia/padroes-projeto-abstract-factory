package models.motores;

import interfaces.Motor;

public class MotorMoto implements Motor {
    public String obter() {
        return "250CC, 1 Cilindro, 2 válvulas";
    }
}
