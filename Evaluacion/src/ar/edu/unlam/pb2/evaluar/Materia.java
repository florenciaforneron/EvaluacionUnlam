package ar.edu.unlam.pb2.evaluar;

public class Materia {
	
	private Examen examen1= new Examen();
	private Examen examen2 = new Examen();
	

	
	public void calificar(Integer numExamen, Integer nota) throws examenInvalidoExc, NotaInvalidaExc{
		if(numExamen==1){
			this.examen1.evaluar(nota);
		}
		else if(numExamen==2){
			this.examen2.evaluar(nota);
		}else{
			throw new examenInvalidoExc();
		}
			
	}


	public Examen getExamen1() {
		return examen1;
	}


	public void setExamen1(Examen examen1) {
		this.examen1 = examen1;
	}


	public Examen getExamen2() {
		return examen2;
	}


	public void setExamen2(Examen examen2) {
		this.examen2 = examen2;
	}
}
