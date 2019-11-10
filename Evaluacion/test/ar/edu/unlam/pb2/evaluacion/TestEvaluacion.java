package ar.edu.unlam.pb2.evaluacion;
import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.pb2.evaluar.Examen;
import ar.edu.unlam.pb2.evaluar.Materia;
import ar.edu.unlam.pb2.evaluar.NotaInvalidaExc;
import ar.edu.unlam.pb2.evaluar.examenInvalidoExc;


public class TestEvaluacion {

	@Test
	public void asignarUnaNotaCorrectaAUnExamen() {
		
		Examen E = new Examen();
		try{
			E.evaluar(7);
		}catch(NotaInvalidaExc e1){
			e1.printStackTrace();
		}
		Assert.assertEquals(7, E.getNota(),0.0);
		
	}

	
	@Test
	public void asignarUnaNotaIncorrectaAUnExamen() {
		
		Examen E = new Examen();
		try{
			E.evaluar(17);
		}catch(NotaInvalidaExc e1){
			e1.printStackTrace();
		}
		Assert.assertEquals(7, E.getNota(),0.0);
		
	}
	
	
/*	@Test(expected=NotaInvalidaExc.class)
	public void tirarLaExcepcion() throws NotaInvalidaExc{
		
		Examen E = new Examen();
		try{
			E.evaluar(17);
		}catch(NotaInvalidaExc e1){
			Assert.assertEquals(e1.getMessage(), E.getNota());
		} */
	
	@Test(expected=NotaInvalidaExc.class)
	public void tirarLaExcepcion() throws NotaInvalidaExc{
		Examen E = new Examen();
		E.evaluar(11);
		
	}
	
	@Test
	public void asignarUnaNotaAUnExamenCorrecto()throws NotaInvalidaExc, examenInvalidoExc{
		Materia m = new Materia();
	/*	try{ */
			m.calificar(1,7);
			
	/*	}catch(NotaInvalidaExc e1){
			e1.printStackTrace();
		}catch(examenInvalidoExc e2){
			e2.printStackTrace();
		} */
		Assert.assertEquals(7,m.getExamen1().getNota(),0.0);
	}
	
	@Test
	public void asignarUnaNotaAUnExamenCorrectoDeOtraFormaDeHacerLoMismoQueEnElAnterior(){
		Materia m = new Materia();
		try{ 
			m.calificar(1,7);
			
		}catch(NotaInvalidaExc e1){
			e1.printStackTrace();
		}catch(examenInvalidoExc e2){
			e2.printStackTrace();
		} 
		Assert.assertEquals(7,m.getExamen1().getNota(),0.0);
	}
	
	
	@Test(expected= examenInvalidoExc.class)
	public void calificarUnExamenIncorrecto() throws examenInvalidoExc, NotaInvalidaExc{
		Materia m = new Materia();
		m.calificar(3,7);
		
	}
	
	@Test(expected= NotaInvalidaExc.class)
	public void calificarUnExamenConUnaNotaIncorrecta() throws NotaInvalidaExc,examenInvalidoExc{
		Materia m = new Materia();
		m.calificar(1,11);
		
	}

	

	
	
	

}
