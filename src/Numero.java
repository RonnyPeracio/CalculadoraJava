
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ronny Peracio
 */
public class Numero {

    public double somar(double Nro1, double Nro2) {

        return (Nro1 + Nro2);
    }

    public double subtrair(double Nro1, double Nro2) {

        return (Nro1 - Nro2);
    }

    public double dividir(double Nro1, double Nro2) {

        if (Nro2 == 0) {
            JOptionPane.showMessageDialog(null, "Divisão por ZERO Impossível.");
        }
        return (Nro1 / Nro2);

    }

    public double multiplicar(double Nro1, double Nro2) {

        return (Nro1 * Nro2);
    }

    public String verPar(double Nro1, double Nro2) {
        
        String msg = "";
        boolean ehpar1 = false;
        boolean ehpar2 = false;

        if (Nro1 % 2 == 0) {
            ehpar1 = true;
        }
        if (Nro2 % 2 == 0) {
            ehpar2 = true;
        }
        if (ehpar1 && ehpar2) {
            msg = "O nro " + Nro1 + " e o nro " + Nro2
                    + " são PARES.";
        } else if (ehpar1 && !ehpar2) {
            msg = "O nro " + Nro1 + " é PAR e o nro " + Nro2
                    + " é ÍMPAR.";
        } else if (!ehpar1 && ehpar2) {
            msg = "O nro " + Nro1 + " é ÍMPAR e o nro " + Nro2
                    + " é PAR.";
        }
        if (!ehpar1 && !ehpar2) {
            msg = "O nro " + Nro1 + " e o nro " + Nro2
                    + " são ÍMPARES.";
        }
        return msg;
    }
    public boolean verDivisivel (double Nro1, double Nro2){
        return Nro1%Nro2 == 0;
    }
    
}


