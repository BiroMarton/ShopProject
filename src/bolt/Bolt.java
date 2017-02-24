package bolt;

import java.util.Hashtable;

public class Bolt {
	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable tejpult;
	
	public Bolt(String nev, String cim, String tulajdonos, Hashtable tejpult){
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.tejpult = tejpult;
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
	
	public boolean vanMegTej(){
		return tejpult.isEmpty();
	}
	public Tej vasarolTej(Tej m){
		return m;
	}
	
	public void feltoltTej(Tej m){
		if(tejpult.containsKey(m)){
			tejpult.put(m, tejpult.get(m));
		}else{
		tejpult.put(m, 1);
		}
		
	}

	public class BoltBejegyzes{
		private Tej t;
		private int mennyiseg;
		private int ar;
		public BoltBejegyzes(Tej t, int mennyiseg, int ar){
			this.t= t;
			this.mennyiseg = mennyiseg;
			this.ar = ar;
		}
		public Tej getTej(){
			return t;
		}
		public void setTej(Tej t){
			this.t = t;
		}
		
		public int getMennyiseg(){
			return mennyiseg;
		}
		public void setMennyiseg(int mennyiseg){
			this.mennyiseg = mennyiseg;
		}
		public void adMennyiseg(int mennyiseg){
			mennyiseg = mennyiseg + this.mennyiseg;
		}
		public void levonMennyiseg(int mennyiseg){
			if(this.mennyiseg > mennyiseg){
				mennyiseg = 0;
			}else{
				mennyiseg = mennyiseg - this.mennyiseg;
			}
		}
		public int getAr(){
			return ar;
		}
		public void setAr(int ar){
			ar = this.ar;
		}
	}

}
