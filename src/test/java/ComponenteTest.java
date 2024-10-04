import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.uninorte.Avion;
import com.uninorte.Componente;
import com.uninorte.Equipo;

public class ComponenteTest {
    
    @Test
    public void testGetId() {
        Equipo equipo = new Equipo(1);
        Avion avion = new Avion(101, equipo);
        Componente componente = new Componente(201, avion);
        assertEquals(201, componente.getId());
    }

    @Test
    public void testGetAvion() {
        Equipo equipo = new Equipo(1);
        Avion avion = new Avion(101, equipo);
        Componente componente = new Componente(201, avion);        
        assertEquals(avion, componente.getAvion());
    }
}
