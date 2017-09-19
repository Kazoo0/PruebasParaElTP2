package test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import utilidades.BinomioNewton;

public class BinomioTest {

	BinomioNewton binomio ;
	BinomioNewton binomio1 ;
	BinomioNewton binomio2 ;
	@Before
	public void setUp() {
		binomio = new BinomioNewton(10,4664,1022);
		binomio1 = new BinomioNewton(20 , 4664,1022);
		binomio2 = new BinomioNewton(30,4664,1022);
		
	}

//	@Test
//	public void queObtengaLosTerminosConTartaglia() {
//		double[]resultado = new double[binomio.getGrado()+1];
//		double[]esperado = {1,2,1};
//		resultado  =binomio.obtenerTerminosTarta(binomio.getGrado() +1);
//		Assert.assertArrayEquals(esperado, resultado, 0);
//	}
//	
//	
//	@Test
//	public void queResuelvaBinomio() {
//		
//		Assert.assertTrue(binomio.resolverBinomio()==4);
//	}
//	
//	@Test
//	public void queResuelvaBinomioEstatico() {
//
//		Assert.assertTrue(binomio.resolverBinomio(3, 5, 2,1)==64);
//	}
//	
//	@Test
//	public void queMuestreElBinomio() {
//		String resultado = "+16.0X2-16.0X1+4.0X0";
//		Assert.assertEquals(resultado, binomio.mostrarBinomioResuelto());
//	}
	
	// MODIFICA A PARTIR DE ACÁ!
	
	@Test
	public void queEvalueBienHornerGrado10(){
		long start = System.nanoTime();
		Assert.assertTrue(binomio.evaluarHorner(1)!=0);		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarHorner10: " + tiempo + " ns");
	}	
	
	@Test
	public void queEvalueBienHornerGrado20(){
		long start = System.nanoTime();
		Assert.assertTrue(binomio1.evaluarHorner(1)!=0);
		long tiempo = System.nanoTime() - start; 
		System.out.println("[BinomioEvaluarHorner20: " + tiempo + " ns");
	}
	
	@Test
	public void queEvalueBienHornerGrado30(){
		long start = System.nanoTime();
		Assert.assertTrue(binomio2.evaluarHorner(1) !=0);
		long tiempo = System.nanoTime() - start; 
		System.out.println("[BinomioEvaluarHorner30: " + tiempo + " ns");
		System.out.println("");
	}
	
	@Test
	public void queEvalueBienPowGrado10(){
		long start = System.nanoTime();
		
		Assert.assertTrue(binomio.evaluarPow(1)!=0);
		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarPowGrado10: " + tiempo + " ns");
	}
	
	@Test
	public void queEvalueBienPowGrado20(){
		long start = System.nanoTime();
		Assert.assertTrue(binomio1.evaluarPow(1)!=0);
		long tiempo = System.nanoTime() - start; 
		System.out.println("[BinomioEvaluarPowGrado20: " + tiempo + " ns");
	}
	
	
	@Test
	public void queEvalueBienPowGrado30(){
		long start = System.nanoTime();
		Assert.assertTrue(binomio2.evaluarPow(1)!=0);
		long tiempo = System.nanoTime() - start; 
		System.out.println("[BinomioEvaluarPowGrado30: " + tiempo + " ns");
		System.out.println("");
	}
	
	@Test
	public void queEvalueBienMSucesivasGrado10(){
		long start = System.nanoTime();
		
		Assert.assertTrue(binomio.evaluarMSucesivas(1)!=0);
		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarMsucesivasGrado10: " + tiempo + " ns");
	}
	
	@Test
	public void queEvalueBienMSucesivasGrado20(){
		long start = System.nanoTime();
		
		Assert.assertTrue(binomio1.evaluarMSucesivas(1)!=0);
		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarMsucesivasGrado20: " + tiempo + " ns");
	}	

	@Test
	public void queEvalueBienMSucesivasGrado30(){
		long start = System.nanoTime();
		
		Assert.assertTrue(binomio2.evaluarMSucesivas(1)!=0);
		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarMsucesivasGrado30: " + tiempo + " ns");
		System.out.println("");
	}	

	@Test
	public void queEvalueBienProgDinamicaGrado10(){
		long start = System.nanoTime();
		Assert.assertTrue(binomio.evaluarProgDinamica(1) !=0);		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarProgDinamica10: " + tiempo + " ns");
	}	

	@Test
	public void queEvalueBienProgDinamicaGrado20(){
		long start = System.nanoTime();
		Assert.assertTrue(binomio1.evaluarProgDinamica(1) !=0);		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarProgDinamica20: " + tiempo + " ns");
	}
	
	@Test
	public void queEvalueBienProgDinamicaGrado30(){
		long start = System.nanoTime();
		Assert.assertTrue(binomio2.evaluarProgDinamica(1) !=0);		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarProgDinamica30: " + tiempo + " ns");
		System.out.println("");
	}
	
	@Test
	public void queEvalueBienRecursivaParGrado10(){
		long start = System.nanoTime();
		
		Assert.assertTrue(binomio.evaluarRecursivaPar(1)!=0);
		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarRecursivaPar10: " + tiempo + " ns");
	}	
	
	@Test
	public void queEvalueBienRecursivaParGrado20(){
		long start = System.nanoTime();
		
		Assert.assertTrue(binomio1.evaluarRecursivaPar(1)!=0);
		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarRecursivaPar20: " + tiempo + " ns");
	}	
	
	@Test
	public void queEvalueBienRecursivaParGrado30(){
		long start = System.nanoTime();
		
		Assert.assertTrue(binomio2.evaluarRecursivaPar(1)!=0);
		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarRecursivaPar30: " + tiempo + " ns");
		System.out.println("");
	}	
	
	@Test
	public void queEvalueBienRecursivaGrado10(){
		long start = System.nanoTime();
		
		Assert.assertTrue(binomio.evaluarRecursiva(1)!=0);
		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarRecursiva10: " + tiempo + " ns");
	}	
	
	@Test
	public void queEvalueBienRecursivaGrado20(){
		long start = System.nanoTime();
		
		Assert.assertTrue(binomio1.evaluarRecursiva(1)!=0);
		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarRecursiva20: " + tiempo + " ns");
	}	
	
	@Test
	public void queEvalueBienRecursivaGrado30(){
		long start = System.nanoTime();
		
		Assert.assertTrue(binomio2.evaluarRecursiva(1)!=0);
		
		long tiempo = System.nanoTime() - start;
		System.out.println("[BinomioEvaluarRecursiva30: " + tiempo + " ns");
		System.out.println("");
	}	
}