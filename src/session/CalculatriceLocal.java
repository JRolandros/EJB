package session;

import javax.ejb.Local;

@Local
public interface CalculatriceLocal {
	public double add(double v1,double v2);

	public double sub(double v1,double v2);

	public double mul(double v1,double v2);

	public double div(double v1,double v2);
}
