
public class Hora {
	private int hora;
	private int minuto;
	private int segundo;

	public void setTime(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public String exibirHoraUniversal() {
		String horaUniversal;
		horaUniversal = hora + ":" + minuto + ":" + segundo;
		return horaUniversal;
	}

	public String exibirHoraPadrao() {
		String horaPadrao;
		String periodo;
		if (hora == 0) {
			hora = 12;
			periodo = "AM";
		} else if (hora > 0 && hora < 12) {
			periodo = "AM";
		} else if (hora == 12) {
			periodo = "PM";
		} else {
			hora = hora - 12;
			periodo = "PM";
		}
		horaPadrao = hora + ":" + minuto + ":" + segundo + " " + periodo;
		return horaPadrao;
	}

	public void imprimir() {
		System.out.println("Hora Universal: " + exibirHoraUniversal());
		System.out.println("Hora Padrão   : " + exibirHoraPadrao());
	}
}
