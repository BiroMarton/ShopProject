package bolt;

import java.util.Hashtable;
import bolt.aruk.*;

public class Bolt {
	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable<Long, BoltBejegyzes> elelmiszerpult;
	
	public Bolt(String nev, String cim, String tulajdonos, Hashtable<Long, BoltBejegyzes> elelmiszerpult){
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.elelmiszerpult = elelmiszerpult;
	}
	public Bolt(String nev, String cim, String tulajdonos){
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		
	}
	public String getNev(){
		return nev;
	}
	public String getCim(){
		return cim;
	}
	public String getTulajdonos(){
		return tulajdonos;
	}
	private boolean vanMegAdottAru(Class c){
        for (BoltBejegyzes b :elelmiszerpult.values())
        {
            Elelmiszer e = b.getElelmiszer();
            if (e.getClass().equals(c)) return true;
        }
        return false;
    }
	
	public boolean vanMegTej(){
		return vanMegAdottAru(Tej.class);
	}
	
	public boolean vanMegSajt(){
		return vanMegAdottAru(Sajt.class);
	}
	public void vasarolElelmiszer(long vonalKod, long mennyiseg){
		for(long v: elelmiszerpult.keySet()){
			if(v == vonalKod){
				elelmiszerpult.get(v).levonMennyiseg(mennyiseg);
			}
		}
		
	}
	
	public void feltoltelElmiszer(long vonalKod, long mennyiseg){
		for(long v: elelmiszerpult.keySet()){
			if(v == vonalKod){
				elelmiszerpult.get(v).adMennyiseg(mennyiseg);
			}
		}

		
	}

	public class BoltBejegyzes{
		private Elelmiszer e;
		private long mennyiseg;
		private long ar;
		public BoltBejegyzes(Elelmiszer e, long mennyiseg, long ar){
			this.e= e;
			this.mennyiseg = mennyiseg;
			this.ar = ar;
		}
		public Elelmiszer getElelmiszer(){
			return e;
		}
		public void setElelmiszer(Elelmiszer e){
			this.e = e;
		}
		
		public long getMennyiseg(){
			return mennyiseg;
		}
		public void setMennyiseg(int mennyiseg){
			this.mennyiseg = mennyiseg;
		}
		public void adMennyiseg(long mennyiseg){
			mennyiseg = mennyiseg + this.mennyiseg;
		}
		public void levonMennyiseg(long mennyiseg){
			if(this.mennyiseg > mennyiseg){
				mennyiseg = 0;
			}else{
				mennyiseg = mennyiseg - this.mennyiseg;
			}
		}
		public long getAr(){
			return ar;
		}
		public void setAr(long ar){
			ar = this.ar;
		}
	}

}
