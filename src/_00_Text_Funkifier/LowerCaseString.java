package _00_Text_Funkifier;

public class LowerCaseString extends SpecialString{

	public LowerCaseString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String funkifyText(String s) {
		
		String string ="";
		
		string =s.toLowerCase();
		
		return string;
		
		
	}

}
