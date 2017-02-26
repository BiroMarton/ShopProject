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
	public boolean joMeg(){
		Date d = new Date();
		d.before(szavatossagiIdo);
		
		return true;
	}
	public Long getVonalKod(){
		return vonalKod;
	}
	public String getGyarto(){
		return gyarto;
	}
	
	public Date getSzavatossagiIdo(){
		return szavatossagiIdo;
	}
	
	public String toString(){
		return getGyarto() + " " + getSzavatossagiIdo() + " " + getVonalKod();
	}

}
