package aula21_08;

public class Veiculo {

	private String modelo;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String calcularTempo(float distancia) {
		double tempoHoras = distancia / 80;
		int horas = (int) tempoHoras;
		int minutos = (int) Math.round((tempoHoras - horas) * 60);
		if (minutos == 60) {
			horas += 1;
			minutos = 0;
		}
		return String.format("%d hora(s) e %02d minuto(s)", horas, minutos);
	}

	public Veiculo(String modelo) {
		this.modelo = modelo;
	}

}
