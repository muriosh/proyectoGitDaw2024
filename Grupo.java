package crud;

//nueva especificacion del Modelo de datos

public class Grupo {
	private String ies;
	private String ciclo;
	private String curso;
	
	public Grupo(String ies, String ciclo, String curso) {
		this.ies= ies;
		this.ciclo =ciclo;
		this.curso= curso;
	}
	
	
	public String getIes() {
		return ies;
	}


	public void setIes(String ies) {
		this.ies = ies;
	}


	public String getCiclo() {
		return ciclo;
	}


	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	@Override
	public String toString() {
		return "Grupo [ies=" + ies + ", ciclo=" + ciclo + ", curso=" + curso + "]\n";
	}
}
