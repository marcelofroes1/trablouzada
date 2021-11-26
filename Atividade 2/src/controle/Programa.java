package controle;

import java.util.Scanner;
import dominio.Circulo;
import dominio.Quadrado;
import dominio.Retangulo;
import dominio.Trapezio;
import dominio.Triangulo;

	public class Programa {
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			System.out.println("As op��es s�o:");
			System.out.println("1-Quadrado");
			System.out.println("2-Ret�ngulo");
			System.out.println("3-Tri�ngulo");
			System.out.println("4-Trap�zio");
			System.out.println("5-C�rculo");
			System.out.print("Digite a op��o: ");
			int opcao = leia.nextInt();
			switch(opcao) {
			case 1:
				System.out.print("Digite o lado: ");
				float lado = leia.nextFloat();
				Quadrado qua = new Quadrado(lado);
				System.out.print("�rea do quadrado: " + qua.calcularArea());
				break;

			case 2:
				System.out.print("Digite a base: ");
				float base1 = leia.nextFloat();
				System.out.print("Digite a altura: ");
				float altura1 = leia.nextFloat();
				Retangulo ret = new Retangulo(base1, altura1);
				System.out.print("�rea do Ret�ngulo: " + ret.calcularArea());
				break;
				
			case 3:
				System.out.print("Digite a base: ");
				float base2 = leia.nextFloat();
				System.out.print("Digite a altura: ");
				float altura2 = leia.nextFloat();
				Triangulo tri = new Triangulo(base2, altura2);
				System.out.print("�rea do Tri�ngulo: " + tri.calcularArea());
				break;
				
			case 4:
				System.out.print("Digite a base menor: ");
				float baseMenor = leia.nextFloat();
				System.out.print("Digite a base maior: ");
				float baseMaior = leia.nextFloat();
				System.out.print("Digite a altura: ");
				float altura3 = leia.nextFloat();
				Trapezio tra = new Trapezio(baseMenor, baseMaior, altura3);
				System.out.print("�rea do Trap�zio: " + tra.calcularArea());
				break;
				
			case 5:
				System.out.print("Digite o raio: ");
				float raio = leia.nextFloat();
				Circulo cir = new Circulo(raio);
				System.out.print("�rea do C�rculo: " + cir.calcularArea());
				break;
			default:
				System.out.print("Op��o Inv�lida!");
				leia.close();

			}
		}
}
