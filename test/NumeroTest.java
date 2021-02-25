/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sala305b
 */
public class NumeroTest {
    
    public NumeroTest() {
        
    }
      
    
    @Test
    public void testSomar() {
        
        Numero n = new Numero();
        double resultado = n.somar(1, 2);
        assertEquals("3.0", String.valueOf(resultado));
    }
       
    
    @Test
    public void testSubtrair() {
       
        
        Numero n = new Numero();
        double resultado = n.subtrair(3, 2);
        assertEquals("1.0", String.valueOf(resultado));
    }
    

    @Test
    public void testDividir() {
        
        Numero n = new Numero();
        double resultado = n.dividir(12, 4);
        assertEquals("3.0", String.valueOf(resultado));
        
    }

   
    @Test
    public void testMultiplicar() {
        
        Numero n = new Numero();
        double resultado = n.multiplicar(3, 2);
        assertEquals("6.0", String.valueOf(resultado));
        
    }

    @Test
    public void testVerPar() {
        
        Numero n = new Numero();
        String resultado = n.verPar(4, 2);
        String mensagem = "O nro 4.0 e o nro 2.0 são PARES.";
        assertEquals(mensagem, String.valueOf(resultado));
        
    }

    @Test
    public void testVerDivisivel() {
        
        Numero n = new Numero();
        boolean resultado = n.verDivisivel(4, 2);
        assertTrue(resultado);
        
    }
    
}
