package modelo;

public class Endereco {
	
	private String logradouro;
	
	private String bairro;

	public Endereco() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Endereco(String logradouro, String bairro) {
		super();
		this.logradouro = logradouro;
		this.bairro = bairro;
	}



	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}
