
public class EntendendoFuncoesReturn {

	public static void saudacao(String nome) {
		System.out.println("Ol�! " + nome + "!");
	}
	
	public static int anoLancamento() {
		return 1977;
	}
	
	public static void main(String[] args) {
		saudacao("Marina");
		
		int ano;
		ano = anoLancamento();
		int diferenca;
		diferenca = 1990 - ano;
		
		System.out.println("Quando voc� nasceu, Star wars j� tinha " + diferenca + "anos");
		
		System.out.println(anoLancamento());

	}

}
				
