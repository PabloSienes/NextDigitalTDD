package character_copy;

public class DestinationMock implements Destination {
    private String textoEscrito = "";

    public void write(String c) {
        this.textoEscrito = c;
    }

    public String getTextoEscrito () {
        return textoEscrito;
    }

}

