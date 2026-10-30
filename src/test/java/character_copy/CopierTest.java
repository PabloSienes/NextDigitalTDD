package character_copy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CopierTest {
    @Test
    void deberiaLeerDeSourceYEscribirEnDestination() {
        SourceStub origen = new SourceStub("Hola buenas");
        DestinationMock destino = new DestinationMock();
        Copier copier = new Copier(origen, destino);
        copier.copy();
        assertEquals("Hola buenas", destino.getTextoEscrito());
    }
}