package models.motores;

import interfaces.Motor;

public class MotorCarro implements Motor {
    public String obter() {
        return "2.0, 4 Cilindros, 16 válvulas";
    }
}
