package ar.edu.unlam.pb2.evaluar;

public class Examen {
	
	private Integer nota;

	public void evaluar(Integer nota)throws NotaInvalidaExc{
		if(nota<=10 && nota>=1){
			this.nota=nota;
		}else{
			throw new NotaInvalidaExc();
		}
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}
	

}
