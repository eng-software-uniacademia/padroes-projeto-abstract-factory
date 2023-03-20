import models.entities.Veiculo;
import models.fabricas.FabricaCarro;
import models.fabricas.FabricaMoto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VeiculoTest {
    @Test
    void deveObterMotorMoto() {
        var fabrica = new FabricaMoto();
        var moto = new Veiculo(fabrica);
        assertEquals("250CC, 1 Cilindro, 2 válvulas", moto.obterMotor());
    }

    @Test
    void deveObterCambioMoto() {
        var fabrica = new FabricaMoto();
        var moto = new Veiculo(fabrica);
        assertEquals("SOHC manual 6 marchas", moto.obterCambio());
    }

    @Test
    void deveObterMotorCarro() {
        var fabrica = new FabricaCarro();
        var carro = new Veiculo(fabrica);
        assertEquals("2.0, 4 Cilindros, 16 válvulas", carro.obterMotor());
    }

    @Test
    void deveObterCambioCarro() {
        var fabrica = new FabricaCarro();
        var carro = new Veiculo(fabrica);
        assertEquals("CVT com 8 marchas simuladas", carro.obterCambio());
    }
}
