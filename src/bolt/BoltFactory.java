package bolt;

import java.util.Date;

import bolt.aruk.Tej;
import bolt.aruk.tej.FeltartosTej;
import bolt.aruk.tej.TartosTej;
import bolt.aruk.Sajt;
import bolt.aruk.Szappan;

public class BoltFactory {
	
	public Tej ujTartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom){
		Tej tartos = new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
		return tartos;
		
	}
	
	public Tej ujFelartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom){
		Tej felTartos = new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
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
    public Tej ujFelzsirosTartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo)
    {
        return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, Tej.FELZSIROS);
    }
    public Tej ujZsirosTartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo)
    {
        return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, Tej.ZSIROS);
    }
    public Tej ujFelzsirosFeltartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo)
    {
        return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, Tej.FELZSIROS);
    }
    public Tej ujZsirosFeltartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo)
    {
        return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, Tej.ZSIROS);
    }
    public Tej ujFelzsirosLiteresTartosTej(Long vonalKod, String gyarto, Date szavatossagiIdo)
    {
        return new TartosTej(vonalKod, Tej.LITER ,gyarto, szavatossagiIdo ,Tej.FELZSIROS);
    }
    public Tej ujZsirosLiteresTartosTej(Long vonalKod, String gyarto, Date szavatossagiIdo)
    {
        return new TartosTej(vonalKod, Tej.LITER ,gyarto, szavatossagiIdo ,Tej.ZSIROS);
    }
    public Tej ujFelzsirosLiteresFelartosTej(Long vonalKod, String gyarto, Date szavatossagiIdo)
    {
        return new FeltartosTej(vonalKod, Tej.LITER ,gyarto, szavatossagiIdo ,Tej.FELZSIROS);
    }
    public Tej ujZsirosLiteresFelartosTej(Long vonalKod, String gyarto, Date szavatossagiIdo)
    {
        return new FeltartosTej(vonalKod, Tej.LITER ,gyarto, szavatossagiIdo ,Tej.ZSIROS);
    }

}
