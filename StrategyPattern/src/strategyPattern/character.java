package strategyPattern;

import attackStrategy.AttackStrategy;
import movingStrategy.MovingStrategy;

public class character {
	private String name;
	private MovingStrategy movingStrategy;
	private AttackStrategy attackStrategy;
	
	public character(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	public void move(){
		movingStrategy.move();
	}
	public void attack(){
		attackStrategy.attack();
	}
	
	public void setMovingStrategy(MovingStrategy movingStrategy){
		this.movingStrategy = movingStrategy;
	}
	public void setAttackStrategy(AttackStrategy attackStrategy){
		this.attackStrategy = attackStrategy;
	}
}
