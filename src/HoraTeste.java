
public class HoraTeste {
	public static void main (String args[]) {
		Hora h1;
		
		h1 = new Hora();
		h1.setTime(13,35,40);
		System.out.println(h1.exibirHoraUniversal());
		System.out.println(h1.exibirHoraPadrao());
		
		h1.setTime(8,35,40);
		System.out.println(h1.exibirHoraUniversal());
		System.out.println(h1.exibirHoraPadrao());
		
		h1.setTime(12,35,40);
		System.out.println(h1.exibirHoraUniversal());
		System.out.println(h1.exibirHoraPadrao());
		
		h1.setTime(0,35,40);
		System.out.println(h1.exibirHoraUniversal());
		System.out.println(h1.exibirHoraPadrao());
	}
}
