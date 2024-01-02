/*
 * Este programa es solamente pedagogico, recaba informacion del usuario pero puede
 * presentar excepciones no controladas durante la ejecuciòn del mismo, su tarea es
 * analizar el còdigo y colocar los try/catch correspondientes para controlar y manejar
 * dichas excepciones
 */
package proy2sinexcepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author DaFons
 */
public class Proy2SinExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // I parte
        
        String edad = JOptionPane.showInputDialog(null, "Ingrese la edad del estudiante");
        
        int edadEnDias;       
        
        do {       
            try{
                edadEnDias = Integer.parseInt(edad) * 365;
                if (edadEnDias < 0){
                    edad = JOptionPane.showInputDialog(null, "Valor de edad no válido, favor ingrese la edad nuevamente");                    
                }
        }catch (NumberFormatException nfe){
            if (edad == null){
                JOptionPane.showMessageDialog(null, "Acción cancelada!, no se ingresa valor de edad");
                edadEnDias = 0;   
            } else{
                edad = JOptionPane.showInputDialog(null, "Valor de edad no válido, favor ingrese la edad nuevamente");     
                edadEnDias = -1;       
            }   
        }            
        }while (edadEnDias < 0);                    
        
        // II parte
        
        String nombre = null;
        String nombreEst = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante");
        
        do {                   
            try{
                nombre = nombreEst;
                if (nombre.length() == 0){
                     nombreEst = JOptionPane.showInputDialog(null, "Nombre no válido, favor ingrese el nombre nuevamente");                     
                }
        }catch (NullPointerException npe){
            nombre = "null";                
        }            
        }while (nombre.length() == 0);            
        
        if (nombre.equals("null")) {
            JOptionPane.showMessageDialog(null, "No ingresó ningún nombre");
        } else {         
            JOptionPane.showMessageDialog(null, "El nombre "+nombre+" tiene "+nombre.length()+" letras");
        }            
        
        // III Parte
        
        String[] meses = new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio"};
        
        String numMes = JOptionPane.showInputDialog(null, "Ingrese un numero de mes del año");            
             
        int nMes;
        
        do {       
            try{
                nMes = Integer.parseInt(numMes);
                if (nMes < 0){
                    numMes = JOptionPane.showInputDialog(null, "Valor de mes no válido, favor ingrese el mes nuevamente");                    
                } else{
                    String mes;
                    try{                           
                        mes = meses[nMes-1];                          
                        JOptionPane.showMessageDialog(null, mes);                                           
                    }catch(ArrayIndexOutOfBoundsException aiobe){                         
                        numMes = JOptionPane.showInputDialog(null, "Valor de mes no se encuentra, favor ingrese el mes nuevamente");  
                        nMes = -1; 
                    }                                                                          
                }
        }catch (NumberFormatException nfe){
            if (numMes == null){
                JOptionPane.showMessageDialog(null, "Acción cancelada!, no se ingresa valor de mes");
                nMes = 0;   
            } else{
                numMes = JOptionPane.showInputDialog(null, "Valor de mes no válido, favor ingrese el mes nuevamente");     
                nMes = -1;       
            }   
        }            
        }while (nMes < 0);             
    } 
}
