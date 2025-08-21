package aula21_08;

public class Bicicleta extends Veiculo {

	public Bicicleta(String modelo) {
		super(modelo);
	}
	
	public String calcularTempo(float distancia) {
		double tempoHoras = distancia / 20;
		int horas = (int) tempoHoras;
		int minutos = (int) Math.round((tempoHoras - horas) * 60);
		if (minutos == 60) {
			horas += 1;
			minutos = 0;
		}
		return String.format("%d hora(s) e %02d minuto(s)", horas, minutos);
	}
}
