import java.util.ArrayList;

import javax.swing.JTextField;

public class PontoDeColeta {
	private String nomePonto;
	private int cepPonto;
	private String bairroPonto;
	private String enderecoPonto;
	private int numeroPonto;
	private String cidadePonto;
	private int telefonePonto;
	private String emailPonto;
	private String selecionado;
	
	public PontoDeColeta (String nomePonto, int cepPonto, String bairroPonto, String enderecoPonto, int numeroPonto,
			String cidadePonto, int telefonePonto, String emailPonto, String selecionado) {
		this.nomePonto=nomePonto;
		this.cepPonto=cepPonto;
		this.bairroPonto=bairroPonto;
		this.enderecoPonto=enderecoPonto;
		this.numeroPonto=numeroPonto;
		this.cidadePonto=cidadePonto;
		this.telefonePonto=telefonePonto;
		this.emailPonto=emailPonto;
		this.selecionado = selecionado;
	}

	public String getNomePonto() {
		return nomePonto;
	}

	public void setNomePonto(String nomePonto) {
		this.nomePonto = nomePonto;
	}

	public int getCepPonto() {
		return cepPonto;
	}

	public void setCepPonto(int cepPonto) {
		this.cepPonto = cepPonto;
	}

	public String getBairroPonto() {
		return bairroPonto;
	}

	public void setBairroPonto(String bairroPonto) {
		this.bairroPonto = bairroPonto;
	}

	public String getEnderecoPonto() {
		return enderecoPonto;
	}

	public void setEnderecoPonto(String enderecoPonto) {
		this.enderecoPonto = enderecoPonto;
	}

	public int getNumeroPonto() {
		return numeroPonto;
	}

	public void setNumeroPonto(int numeroPonto) {
		this.numeroPonto = numeroPonto;
	}

	public String getCidadePonto() {
		return cidadePonto;
	}

	public void setCidadePonto(String cidadePonto) {
		this.cidadePonto = cidadePonto;
	}

	public int getTelefonePonto() {
		return telefonePonto;
	}

	public void setTelefonePonto(int telefonePonto) {
		this.telefonePonto = telefonePonto;
	}

	public String getEmailPonto() {
		return emailPonto;
	}

	public void setEmailPonto(String emailPonto) {
		this.emailPonto = emailPonto;
	}

	public String getSelecionado() {
		return selecionado;
	}

	public void setSelecionado(String selecionado) {
		this.selecionado = selecionado;
	}
	
	
	
	
	
}
