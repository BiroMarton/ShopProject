package bolt.aruk;

import java.util.Date;

import bolt.Aru;

public abstract class Elelmiszer extends Aru {
	protected Long vonalKod;
	protected String gyarto;
	protected Date szavatossagiIdo;
	
	public Elelmiszer(Long vonalKod, String gyarto, Date szavatossagiIdo){
		this.vonalKod = vonalKod;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		
	}
    public abstract Long getVonalKod();
    public abstract String getGyarto();
    public abstract Date getSzavatossagiIdo();
    public abstract boolean joMeg();
    public abstract String toString();

}
