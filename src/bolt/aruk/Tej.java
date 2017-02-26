package bolt.aruk;

import java.util.Date;

import bolt.aruk.Elelmiszer;

public abstract class Tej extends Elelmiszer{
	protected Long vonalKod;
	public static final int LITER = 1000;
	public static final int FELLITER = 500;
	public static final double ZSIROS = 2.8;
	public static final double FELZSIROS = 1.5;
	
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
        Date currentTime = new Date();


        if(currentTime.before(getSzavatossagiIdo()))
        {
            return true;
        }
        else if(currentTime.equals(getSzavatossagiIdo()))
        {
            return true;
        }
        return false;
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
