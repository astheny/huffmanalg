package logic;

public class PROBABILITYELEMENT {
	private PROBABILITYELEMENT[] successor;
	private double probability;
	
	PROBABILITYELEMENT(double prob){
		successor = new PROBABILITYELEMENT[1];
		successor[0] = new PROBABILITYCLOSURE();
		probability = prob;
	}
	
	PROBABILITYELEMENT(){
		successor = new PROBABILITYELEMENT[1];
		successor[0] = new PROBABILITYCLOSURE();
		probability = 0;
	}
}
