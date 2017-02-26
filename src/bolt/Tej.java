package bolt;

import java.util.Date;

public abstract class Tej extends Elelmiszer{
	protected Long vonalKod;
	public final int LITER = 1000;
	public final int FELLITER = 500;
	public final double ZSIROS = 2.8;
	public final double FELZSIROS = 1.5;
	
	protected int urtartalom;
	protected String gyarto;
	protected Date szavatossagiIdo;
	protected double zsirtartalom;

	
	public Tej( Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom){
		super(vonalKod, gyarto, szavatossagiIdo);
		this.urtartalom = urtartalom;
		this.zsirtartalom = zsirtartalom;

		
	}
	public Long getVonalKod(){
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
	

	
	public String toString(){
		return getGyarto() +" "+ getUrtartalom() +" "+ getSzavatossagiIdo() +" "+ getZsirtartalom() + " " + getVonalKod();
	}

}
