import java.util.Scanner;

public class RepeatStringCharacters {
	public static String getResultString(String source, int charsToRepeat) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(source);
		for (int i = 0; i < charsToRepeat; i++)
		{
			stringBuffer.append(source.substring(source.length() - charsToRepeat, source.length()));
		}
		return stringBuffer.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  
		System.out.println("Enter Value : ");
		String source = scanner.nextLine();
		int charsToRepeat = scanner.nextInt();
		System.out.println("Result :" + getResultString(source, charsToRepeat));
	}
}
