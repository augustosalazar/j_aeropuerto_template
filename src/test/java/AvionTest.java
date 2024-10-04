import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.uninorte.Avion;
import com.uninorte.Equipo;

public class AvionTest {
      

    @Test
    public void testGetId() {
        Equipo equipo = new Equipo(1);
        Avion avion = new Avion(101, equipo);
        assertEquals(101, avion.getId());
    }

    @Test
    public void testGetEquipo() {
        Equipo equipo = new Equipo(1);
        Avion avion = new Avion(101, equipo);
        assertEquals(equipo, avion.getEquipo());
    }

    @Test
    public void testAddComponente() {
        Equipo equipo = new Equipo(1);
        Avion avion = new Avion(101, equipo);        
        avion.addComponente(201);
        assertEquals(1, avion.getNumeroComponentes());
    }
}
