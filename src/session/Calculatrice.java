package session;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class Calculatrice
 */
@Stateless
public class Calculatrice implements CalculatriceLocal {

    /**
     * Default constructor. 
     */
    public Calculatrice() {
        // TODO Auto-generated constructor stub
    }

    public double add(double v1,double v2) {return v1+v2;}

    public double sub(double v1,double v2) {return v1-v2;}
    
    public double mul(double v1,double v2) {return v1*v2;}

    public double div(double v1,double v2) {return v1/v2;}
}
