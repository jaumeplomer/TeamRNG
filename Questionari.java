import java.util.*;

public class Questionari
{
	int edat;
	int capacitat;
	int programacio;
	int nivell;

	public Questionari()
	{
		this.edat = edat;
		this.capacitat = capacitat;
		this.programacio = programacio;
		this.nivell = nivell;
	}

	public void Preguntas()
	{
		Scanner in = new Scanner(System.in);

		System.out.println("A. Insereix la teva edat:");
		edat = in.nextInt();

		System.out.println("B. Ets habil o has manetjat ordinadors alguna vegada?");
		System.out.println("Respostes: 1.Mai, 2.Poques vegades, 3.Algunes vegades, 4.Frequentment");
		capacitat = in.nextInt();

		System.out.println("C. Has programat alguna vegada abans?");
		System.out.println("Respostes: 1.Mai, 2.Poques vegades, 3.Algunes vegades, 4.Frequentment");
		programacio = in.nextInt();

		System.out.println("D. Estas realitzant o has cursat algun curs relacionat amb programacio?");
		System.out.println("Respostes: 0.Cap, 1.Extraescolar, 2.Grau Mitja, 3.Grau Superior, 4.Universitat");
		nivell = in.nextInt();

		in.close();
	}

	public void Respuestas()
	{
		if (edat < 10)
		{
			System.out.println("Nivel basico: https://github.com/jaumeplomer/TeamRNG/tree/Iniciacio");
			System.exit(0);
		}
		if (edat >= 10 || edat <= 15) 
		{
			Puntuacion();
			System.exit(0);
		}
		if (edat > 15 || edat <= 18)
		{
			Puntuacion();
			System.exit(0);
		}
		if (edat > 18)
		{
			Puntuacion();
			System.exit(0);
		}
	}

	public void Puntuacion()
	{
		int puntuacio = capacitat + programacio + nivell;

		if (puntuacio < 6)
		{
			System.out.println("Nivel intermedio: https://github.com/jaumeplomer/TeamRNG/tree/Intermig");
			System.exit(0);
		}
		if (puntuacio >= 10)
		{
			System.out.println("Nivel experto: https://github.com/jaumeplomer/TeamRNG/tree/Expert");
			System.exit(0);
		}
		if (puntuacio >= 6 || puntuacio < 10)
		{
			System.out.println("Nivel avanzado: https://github.com/jaumeplomer/TeamRNG/tree/Avan%C3%A7at");
			System.exit(0);
		}
	}

	public static void main(String[] args)
	{
		Questionari q = new Questionari();
		q.Preguntas();
		q.Respuestas();
	}
}