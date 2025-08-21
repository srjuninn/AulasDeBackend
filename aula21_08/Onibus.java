package aula21_08;

public class Onibus extends Veiculo {

	private int numeroParadas;

	public int getNumeroParadas() {
		return numeroParadas;
	}

	public void setNumeroParadas(int numeroParadas) {
		this.numeroParadas = numeroParadas;
	}

	public Onibus(String modelo, int numParadas) {
		super(modelo);
		this.numeroParadas = numParadas;
	}
	
	public String calcularTempo(float distancia) {
		double tempoHoras = distancia / 60 + (this.numeroParadas * 0.25);
		int horas = (int) tempoHoras;
		int minutos = (int) Math.round((tempoHoras - horas) * 60);
		if (minutos == 60) {
			horas += 1;
			minutos = 0;
		}
		return String.format("%d hora(s) e %02d minuto(s)", horas, minutos);
	}

}
