package bolt;

import java.util.Date;

public class Tej {
	private long vonalKod;
	private final int LITER = 1000;
	private final int FELLITER = 500;
	private final double ZSIROS = 2.8;
	private final double FELZSIROS = 1.5;
	
	private int urtartalom;
	private String gyarto;
	private Date szavatossagiIdo;
	private double zsirtartalom;
	private long ar;
	
	public Tej( long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar){
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
		this.ar = ar;
		this.vonalKod = vonalKod;
		
	}
	public double getVonalkod(){
		return vonalKod;
	}
	
	public boolean joMeg(){
		Date d = new Date();
		d.before(szavatossagiIdo);
		
		return true;
	}
	
	public int getUrtartalom(){
		return urtartalom;
	}
	
	public String getGyarto(){
		return gyarto;
	}
	
	public Date getSzavatossagiIdo(){
		return szavatossagiIdo;
	}
	
	public double getZsirtartalom(){
		return zsirtartalom;
	}
	
	public long getAr(){
		return ar;
	}
	
	public String toString(){
		return getGyarto() +" "+ getAr() +" " + getUrtartalom() +" "+ getSzavatossagiIdo() +" "+ getZsirtartalom();
	}

}
