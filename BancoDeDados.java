

import java.util.ArrayList;

public class BancoDeDados {
	ArrayList<PontoDeColeta> addPonto = new ArrayList<>();
	
	public BancoDeDados(PontoDeColeta ponto) {
		addPonto.add(ponto);
	}
	
	public void adicionaPonto (PontoDeColeta ponto) {
		addPonto.add(ponto);
	}
	
	public PontoDeColeta getPonto(int i) {
		
		return addPonto.get(i);
	}
	
	public ArrayList<PontoDeColeta> getPontos () {
		return addPonto;
	}
}
