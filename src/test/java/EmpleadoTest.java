import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.uninorte.Empleado;
import com.uninorte.Equipo;

public class EmpleadoTest {

    @Test
    public void testGetId() {
        Empleado empleado = new Empleado(301);
        assertEquals(301, empleado.getId());
    }

    @Test
    public void testAddEquipo() {
        Equipo equipo = new Equipo(401);
        Empleado empleado = new Empleado(301);
        empleado.addEquipo(equipo);
        assertEquals(1, empleado.getNumeroEquipos());
    }
}
