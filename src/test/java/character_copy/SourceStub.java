package character_copy;

public class SourceStub implements Source{
    private String textoPreparado;

    public SourceStub(String textoPreparado) {
        this.textoPreparado = textoPreparado;
    }

    @Override
    public String read() {
        return textoPreparado;
    }

}

