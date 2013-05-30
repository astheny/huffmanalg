package logic;

public class PROBABILITYTREE {
	private PROBABILITYELEMENT[] root;
	private int codedalphabetlength;
	
	PROBABILITYTREE(double[] probabilityvector, int calphabetlength){
		int rest = probabilityvector.length%calphabetlength;
		root = new PROBABILITYELEMENT[probabilityvector.length+rest];
	}

}
