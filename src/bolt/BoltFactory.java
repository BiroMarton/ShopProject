package bolt;

import java.util.Date;

import bolt.aruk.Tej;
import bolt.aruk.tej.FeltartosTej;
import bolt.aruk.tej.TartosTej;
import bolt.aruk.Sajt;
import bolt.aruk.Szappan;

public abstract class BoltFactory {
	
	public Tej ujTartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar){
		Tej tartos = new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom, ar);
		return tartos;
		
	}
	
	public Tej ujFelartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar){
		Tej felTartos = new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom, ar);
		return felTartos;
		
	}
    public Sajt ujSajt(Long vonalKod, double suly, String gyarto, Date szavatossagiIdo, double zsirtartalom)
    {
        return new Sajt(vonalKod, suly, gyarto, szavatossagiIdo, zsirtartalom);
    }
    public Szappan ujSzappan(Long vonalkod, String gyarto, char mosohatas)
    {
        return new Szappan(vonalkod, gyarto, mosohatas);
    }

}
