/**
 * @author Stefan Heyder
 * @date 24.05.2013
 * @version 0.1
 */

package logic;


//This class will implement the HuffmanAlgorithm
public class HuffmanAlgorithm {
	private INPUT input;
	private OUTPUT output;
	
	HuffmanAlgorithm()
	{
		input = new INPUT();
		output = DoAlgorithm(input);
	}
	
	HuffmanAlgorithm(int alength)
	{
		input = new INPUT(alength);
	}
	
	HuffmanAlgorithm(int alength, double[] probability)
	{
		input = new INPUT(alength, probability);
	}
	
	HuffmanAlgorithm(int alength, double[] probability, int calength)
	{
		input = new INPUT(alength, probability, calength);
	}
	
	private OUTPUT DoAlgorithm(INPUT theInput)
	{
		CODEDALPHABET newalphabet = new CODEDALPHABET(theInput.getAlphabetLength(), theInput.getProbabilityvector(), theInput.getCodedAlphabetLength());
		if(!newalphabet.DoTheAlgorithm())
			newalphabet = new CODEDALPHABET();
		OUTPUT retval = new OUTPUT(newalphabet);
		return retval;
	}
	
}
