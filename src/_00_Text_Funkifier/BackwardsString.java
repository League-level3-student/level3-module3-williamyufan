package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String y="";
		for (int i = s.length()-1; i >=0; i--) {
			
			y+=s.charAt(i);
			
		}
		
		return y;
	}

}
