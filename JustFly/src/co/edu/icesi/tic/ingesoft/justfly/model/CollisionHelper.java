package co.edu.icesi.tic.ingesoft.justfly.model;

import java.awt.Rectangle;

import co.edu.icesi.tic.ingesoft.justfly.model.entity.CircleShape;


/**
 * Class that allows to detect collisions.
 * @author lfrivera
 *
 */
public class CollisionHelper {

	/**
	 * Unique instances of the class.
	 */
	private static CollisionHelper instance;
	
	/**
	 * Constructor of the class.
	 */
	private CollisionHelper() {}
	
	/**
	 * Allows to obtain the unique instance of the class.
	 * @return Unique instance of the class.
	 */
	public static CollisionHelper getInstance()
	{
		if(instance == null)
		{
			instance = new CollisionHelper();
		}
		
		return instance;
	}
	
	/**
	 * Incomplete.
	 * Allows to detect collisions.
	 * Taken from: http://stackoverflow.com/questions/8566336/java-circle-circle-collision-detection
	 * @param a First shape to be compared.
	 * @param b Second shape to be compared.
	 * @return Boolean value that indicates whether there is a collision.
	 */
	public boolean collision(CircleShape a, CircleShape b)
	{
		boolean colisionan= false;
		double x1= a.getPosition().getX();
		double y1= a.getPosition().getY();
		double x2= b.getPosition().getX();
		double y2= b.getPosition().getY();
		double d= Math.sqrt(Math.pow(new Double((x2-x1)), 2)+Math.pow(new Double((y2-y1)), 2));
		double suma= a.getRadius()+ b.getRadius();
		if( suma<= d) colisionan= true;
		return colisionan;
		
	}
	
}
