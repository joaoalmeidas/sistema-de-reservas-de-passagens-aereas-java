import java.util.Scanner;

public class Aviao {
	
	private enum Lotacao{VOO_LOTADO, VOO_VAGO};
	private enum Primeira{PRIMEIRA_LOTADA, PRIMEIRA_VAGA};
	private enum Segunda{SEGUNDA_LOTADA, SEGUNDA_VAGA};
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int opcao, ocupadoPrimeira = 0, ocupadoSegunda = 5;
		boolean[] lugares = new boolean[10];
		
		Primeira primeira;
		primeira = Primeira.PRIMEIRA_VAGA;
		Segunda segunda;
		segunda = Segunda.SEGUNDA_VAGA;
		Lotacao lotacaoDoVoo;
		lotacaoDoVoo = Lotacao.VOO_VAGO;
		
		while(lotacaoDoVoo != Lotacao.VOO_LOTADO){
			System.out.println("Bem vindo ao sistema de reservas de passagens aéreas!\n");
			
			System.out.printf("Digite 1 para a Primeira Classe.\n");			
			System.out.printf("Digite 2 para a segunda Classe.\n");
			
			
			opcao = input.nextInt();
			switch(opcao){
			case 1:
				if(primeira == Primeira.PRIMEIRA_VAGA){
					lugares[ocupadoPrimeira] = true;
					System.out.printf("Bilhete nº %d - Primeira Classe\n\n", ocupadoPrimeira+1);
					ocupadoPrimeira++;
					if(lugares[4] == true){
						primeira = Primeira.PRIMEIRA_LOTADA;
					}	
				}else{
					String op;
					System.out.println("Primeira classe lotada! Deseja comprar passagens para a Segunda Classe?");
					op = input.next();
					if(op.equals("sim") && segunda == Segunda.SEGUNDA_VAGA){
						lugares[ocupadoSegunda] = true;
						System.out.printf("Bilhete nº %d - Segunda Classe\n\n", ocupadoSegunda%5+1);
						ocupadoSegunda++;
						if(lugares[9] == true){
						segunda = Segunda.SEGUNDA_LOTADA;
						}
					}else{
						System.out.printf("O próximo voo parte em 3 horas\n\n");
					}
				}
				break;
			case 2:
				if(segunda == Segunda.SEGUNDA_VAGA){
					lugares[ocupadoSegunda] = true;
					System.out.printf("Bilhete nº %d - Segunda Classe\n\n", ocupadoSegunda%5+1);
					ocupadoSegunda++;
					if(lugares[9] == true){
					segunda = Segunda.SEGUNDA_LOTADA;
					}
				}else{
					String op;
					System.out.println("Segunda classe lotada! Deseja comprar passagens para a Primeira Classe?");
					op = input.next();
					if(op.equals("sim") && primeira == Primeira.PRIMEIRA_VAGA){
						lugares[ocupadoPrimeira] = true;
						System.out.printf("Bilhete nº %d - Primeira Classe\n\n", ocupadoPrimeira+1);
						ocupadoPrimeira++;
						if(lugares[4] == true){
						primeira = Primeira.PRIMEIRA_LOTADA;
						}
					}
					else{
						System.out.printf("O próximo voo parte em 3 horas\n\n");
					}
				}
					
				break;
			default:
				break;		
			}
			
			if(primeira == Primeira.PRIMEIRA_LOTADA && segunda == Segunda.SEGUNDA_LOTADA){
				lotacaoDoVoo = Lotacao.VOO_LOTADO;
			}
			
		}
		
		System.out.printf("Voo lotado! O próximo voo parte em 3 horas.\n");
		
		
	}
}
