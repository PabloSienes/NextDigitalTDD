package character_copy;

public class Copier {

    private final Source src;
    private final Destination dest;

    public Copier(Source src, Destination dest) {
        this.src = src;
        this.dest = dest;
    }

    public void copy(){
        String leido = src.read();
        dest.write(leido);
    }
}



