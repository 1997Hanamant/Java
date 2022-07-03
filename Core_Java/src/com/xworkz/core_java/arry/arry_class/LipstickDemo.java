package com.xworkz.core_java.arry.arry_class;

public class LipstickDemo {
	public static void main(String[] args) {
		Lipstick Lackme=new Lipstick("Lackme","green",10.00);
		Lipstick mac=new Lipstick("mac","bule",15.00);
		Lipstick Revelon=new Lipstick("Revelon","black",20.00);
		Lipstick UranDecay=new Lipstick("uranDecay","red",10.00);
		Lipstick Fentybeauty =new Lipstick("Fenty beauty","yellow",10.00);
		
		Lipstick[] lipstick= {Lackme,mac,Revelon,UranDecay, Fentybeauty };
		for(int i=0;i<lipstick.length;i++) {
			if(lipstick[i].price<15) {
				
			System.out.println(lipstick[i]);
		}
	
		
	}

}
}