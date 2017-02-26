package bolt.aruk;

import bolt.Aru;

public class Szappan extends Aru{
    protected long vonalKod;
    protected String gyarto;
    protected char mosoHatas;

    public Szappan(long vonalKod, String gyarto, char mosoHatas) {
        this.vonalKod = vonalKod;
        this.gyarto = gyarto;
        this.mosoHatas = mosoHatas;
    }

}
