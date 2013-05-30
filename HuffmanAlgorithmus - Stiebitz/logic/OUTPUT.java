package logic;

public class OUTPUT {

	private CODEDALPHABET codedalphabet;
	
	
	OUTPUT(CODEDALPHABET alphabet)
	{
		codedalphabet = alphabet;
	}
	
	public double getEntropy()
	{
		return codedalphabet.getEntropy();
	}
}
