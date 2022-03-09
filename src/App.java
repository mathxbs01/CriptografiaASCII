public class App {
    public static int codigo_ASCII;	
	private static String codigo_criptografado = "", codigo_descriptografado = "";	

	public static String getCodigo_Cript(){
		return codigo_criptografado;
	}

	public static void Converter (String param){		
		char b;		

		for (int a = 0; a <= param.length()-1; a++){	
			
			codigo_ASCII = param.charAt(a)-15;
			b = (char)codigo_ASCII;

			codigo_criptografado += Character.toString(b);			
		}
	}

	public static void Reverter (String param){
		char c;		

		for (int d = 0; d <= param.length()-1; d++){	
			
			codigo_ASCII = param.charAt(d)+15;
			c = (char)codigo_ASCII;

			codigo_descriptografado += Character.toString(c);			
		}
	}	

	public static String Mensagem() {
		return "Palavra Convertida: "+codigo_criptografado+".";
	}

	public static String Mensagem2() {
		return "Palavra Revertida: "+codigo_descriptografado+".";
	}
}
