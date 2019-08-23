package br.com.henrique.bean;

import javax.faces.bean.ManagedBean;

import br.com.henrique.model.Veiculo;

@ManagedBean
public class VeiculoBean {

	private Veiculo veiculo = new Veiculo();

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public void mostraInfo() {
		System.out.println(veiculo);
	}
	
	
	
}
