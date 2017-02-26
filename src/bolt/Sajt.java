package bolt;

import java.util.Date;

public class Sajt extends Elelmiszer{
	private double suly;
	private double zsirtartalom;
	private Long vonalKod;
	private String gyarto;
	private Date szavatossagiIdo;
	
	public Sajt(Long vonalKod, double suly, String gyarto, Date szavatossagiIdo, double zsirtartalom){
		super(vonalKod, gyarto, szavatossagiIdo);
		this.suly = suly;
		this.zsirtartalom = zsirtartalom;
	}
	
	public double getSuly(){
		return suly;
	}
	
	public double getZsirtartalom(){
		return zsirtartalom;
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
		return getGyarto()  +" " + getSuly() +" "+ getSzavatossagiIdo() +" "+ getZsirtartalom() + " " + getVonalKod();
	}
}
