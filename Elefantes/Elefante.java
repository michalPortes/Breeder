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
public class Elefante extends Exception{

    public double getComida() {
        return comida;
    }

    public void setComida(double comida) {
        this.comida = comida;
    }

    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        this.agua = agua;
    }
    
    private double comida;
    private double agua;
    
    
    public void alimentar(double valor) throws ElefanteSatisfeiroException{
        
        if (valor > 125)
            
            throw new ElefanteSatisfeiroException(valor);
        
        double NovaComida = valor + getComida();
        setComida(NovaComida);
        
    }
    
    public void dieta (double valor) throws ElefanteFamintoException{
        
        if (valor <= 20)
            
            throw new ElefanteFamintoException(valor);
            
            double NovaComida = valor + getComida();
            setComida(NovaComida);
    }
    
    public void hidratar(double valor) throws ElefanteHidratadoException{
        
        if (valor <= 200)
            
            throw new ElefanteHidratadoException(valor);
            
            double NovaComida = valor + getComida();
            setComida(NovaComida);
        
    }
    
    public void desidratar(double valor) throws ExefanteDesidratadoException{
        
        if (valor <= 40)
            
            throw new ExefanteDesidratadoException(valor);
            
            double NovaComida = valor + getComida();
            setComida(NovaComida);
    }
}
