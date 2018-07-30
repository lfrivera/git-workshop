package co.edu.icesi.tic.ingesoft.justfly.model;

import java.util.ArrayList;

/**
 * Class that allows to create enemies.
 * @author lfrivera
 *
 */
public class EnemyCreator {

	/**
	 * Unique instance of the class.
	 */
	private static EnemyCreator instance;
	
	/**
	 * Constructor of the class.
	 */
	private EnemyCreator()
	{}
	
	public static EnemyCreator getInstance()
	{
		if(instance == null)
		{
			instance = new EnemyCreator();
		}
		return instance;
	}
	
	/**
	 * Incomplete.
	 * Allows to create the initial enemies of the game (borders).
	 * @return Initial enemies of the game.
	 */
	public ArrayList<Enemy> generateInitialEnemies()
	{
		ArrayList<Enemy> response = new ArrayList<Enemy>();
		int w=1000;
		int h=600;
		for (int i = 0; i < 1000; i+=100) {
			response.add(new Enemy(i, 0));
			response.add(new Enemy(i, h-100));
		}
		for (int i = 0; i < 600; i+=100) {
			response.add(new Enemy(0, i));
			response.add(new Enemy(w-100, i));
		}
        
		return response;
	}
	
	/**
	 * Incomplete
	 * Method that allows to generate a random enemy.
	 * @return New enemy.
	 */
	public Enemy generateRandomEnemy()
	{
		Enemy random = new Enemy(0, 0);
		return random;
	}
	
}
