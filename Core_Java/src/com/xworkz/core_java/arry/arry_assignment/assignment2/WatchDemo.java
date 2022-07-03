package com.xworkz.core_java.arry.arry_assignment.assignment2;

public class WatchDemo {
public static void main(String[] args) {
	Watch fastarck =new Watch("fastarck","black",200.00);
	Watch tommy =new Watch("tommy","silver",300.00);
	Watch styledose =new Watch("styledose","gold",200.00);
	Watch miband=new Watch("miband","grey",500);
	Watch boat =new Watch("boat","pink",400);
	
	Watch[] watch= {fastarck, tommy,styledose ,miband, boat};
	for(int i=0;i<watch.length;i++) {
		if(watch[i].price<500) {
			System.out.println(watch[i]);
		}
	}
	
}
}
