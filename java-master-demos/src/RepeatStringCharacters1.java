//getResultString takes string and number as input
public class RepeatStringCharacters1 {
	public static void main(String[] args) {
		String resultString = getResultString("program", 3);
		System.out.println(resultString);
	}

	public static String getResultString(String source, int charsToRepeat) {
		// A string buffer is like a String, but can be modified.
		StringBuffer stringBuffer = new StringBuffer();
		//System.out.println("Value : " + stringBuffer);
		String lastString = source.substring(charsToRepeat);
		//System.out.println(lastString);
		stringBuffer.append(source);
	for(int ctr = 0; ctr<charsToRepeat ; ctr++) {
		stringBuffer.append(lastString);
	}
		//System.out.println(stringBuffer);
		return stringBuffer.toString();
	}
}
