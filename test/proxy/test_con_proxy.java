package alarcos.test.proxy;

import alarcos.patrones.composite.examples.directories.Directory;
import alarcos.patrones.composite.examples.directories.File;
import alarcos.patrones.composite.examples.directories.FileSystem;
import alarcos.patrones.composite.examples.directories.SimpleFile;
import alarcos.patrones.proxy.CalculadoraProxy;
import alarcos.patrones.proxy.EntradaConsola;
import alarcos.patrones.proxy.SalidaConsola;
/**
 * Created by David Carretero Martin
 */
import junit.framework.TestCase;

public class test_con_proxy extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_con_proxy(String sTestName)
	{
		super(sTestName);
	}

	public void setUp() throws Exception
	{
	}

	public void tearDown() throws Exception
	{
	}

	private void test() throws InterruptedException
	{
		
		
		System.out.println("inicio del test: proxy, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
		for(int i=10 ;i>-1 ; i--) {
			Thread.sleep(1000);
			System.out.println("en: "+i+" seg");
		}
		

		for(int i=inicio; i< inicio+repeticiones ;i++) {
			
			System.out.println(i);
			
			CalculadoraProxy objCalculadora = new CalculadoraProxy();
	        SalidaConsola objSalida = new SalidaConsola();
	        EntradaConsola objEntrada = new EntradaConsola();
	        //String opcion = objEntrada.elegirOpcion();
	        
	        //double a = objEntrada.capturar();
	        //double b = objEntrada.capturar();
	        double resp =0;
	        
	            resp = objCalculadora.obtenerSuma(4, 5);
	        
	            
	            resp = objCalculadora.obtenerResta(10, 5);
	            
	        
	            resp = objCalculadora.obtenerProducto(2, 3);
	        
	        
	            resp = objCalculadora.obtenerDivision(10, 2);
	        
	       
	    
			
			
		}
				
		System.out.println("fin del test: proxy, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
	}
	
	public void testNuevoAdmin() throws InterruptedException
	{
		for(prueba = 1; prueba<21 ;prueba++) {
			test();
			inicio += repeticiones;
		}
	}
	

}
