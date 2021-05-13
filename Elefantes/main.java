/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elefantes;

/**
 *
 * @author micha
 */
public class main {
    
    public static void main (String [] args){
        
        Elefante E1 = new Elefante();
        
        try
        {
        E1.alimentar(150);
        E1.dieta(12);
        E1.hidratar(800);
        E1.desidratar(980);
        }
        
        catch(ElefanteSatisfeiroException ex){
            System.out.println("O elefante está satisfeito !");
        }
        
        catch(ElefanteFamintoException ex){
            System.out.println("O elefante precisa de alimento !");
        }
        
        catch(ElefanteHidratadoException ex){
            System.out.println("O elefante está hidratado !");
        }
        
        catch(ExefanteDesidratadoException ex){
            System.out.println("O elefante precisa beber um pouco d'água !");
           
        }
    }
}
