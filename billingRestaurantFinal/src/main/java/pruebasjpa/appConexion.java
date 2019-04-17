package pruebasjpa;

import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class appConexion {

	public static void main(String[] args) {
		// Se crea la instancia del application context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		
		context.close();

	}

}
