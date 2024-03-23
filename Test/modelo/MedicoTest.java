package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MedicoTest {
	private Medico medico;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Iniciando pruebas de medico");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("terminando pruebas de estudiante");
	}

	@BeforeEach
	void setUp() throws Exception {
		medico = new Medico();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testSetNumeroEmpleadoCP1() throws Exception{
		medico.setNumeroEmpleado("12345");
	}
	
	@Test
	void testSetNumeroEmpleadoCP2() throws Exception{
		medico.setNumeroEmpleado("7813861084723890");
	}
	
	@Test
	void testSetNumeroEmpleadoCP3() throws Exception{
		medico.setNumeroEmpleado("Hola mundo");
	}
	
	@Test
	void testSetNumeroEmpleadoCP4() throws Exception{
		medico.setNumeroEmpleado("9");
	}
	
	@Test
	void testSetNumeroEmpleadoCP5() throws Exception{
		medico.setNumeroEmpleado("43654");
	}
	
	@Test
	void testSetCedulaProfesionalCP1() throws Exception{
		medico.setCedulaProfesional("JUCA800215HDFLRN091234567890");
	}
	
	@Test
	void testSetCedulaProfesionalCP2() throws Exception{
		medico.setCedulaProfesional("7813861084723890");
	}
	
	@Test
	void testSetCedulaProfesionalCP3() throws Exception{
		medico.setCedulaProfesional("Hola mundo");
	}
	
	@Test
	void testSetCedulaProfesionalCP4() throws Exception{
		medico.setCedulaProfesional("9");
	}
	
	@Test
	void testSetCedulaProfesionalCP5() throws Exception{
		medico.setCedulaProfesional("CUFK990810HDFLLV045527529715");
	}

	@Test
	void testSetNombre() throws Exception{
		medico.setNombre("Alegandro Magno");
	}

	@Test
	void testSetApellidos() throws Exception{
		medico.setApellidos("Roberto Valdez");
	}

	@Test
	void testSetEdad() throws Exception{
		medico.setEdad(37);
	}

}
