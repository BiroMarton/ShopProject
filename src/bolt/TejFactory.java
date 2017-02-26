package bolt;

import java.util.Date;

import bolt.aruk.Tej;
import bolt.aruk.tej.FeltartosTej;
import bolt.aruk.tej.TartosTej;

public abstract class TejFactory {
	
	public Tej ujTartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar){
		Tej tartos = new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom, ar);
		return tartos;
		
	}
	
	public Tej ujFelartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar){
		Tej felTartos = new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom, ar);
		return felTartos;
		
	}

}
