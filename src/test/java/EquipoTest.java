import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.uninorte.Empleado;
import com.uninorte.Equipo;

public class EquipoTest {
    
    @Test
    public void testAddEmpleado() {
        Equipo equipo = new Equipo(501);
        Empleado empleado = new Empleado(601);
        equipo.addEmpleado(empleado);
        assertEquals(1, equipo.getNumeroEmpleados());
    }

    @Test
    public void testAddEquipo() {
        Equipo equipo = new Equipo(501);
        Equipo subEquipo = new Equipo(701);
        equipo.addEquipo(subEquipo);
        assertEquals(1, equipo.getNumeroEquipos());
        assertEquals(equipo, subEquipo.getEquipoMadre());
    }    
}
