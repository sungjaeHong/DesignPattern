package strategyPattern;

import attackStrategy.BombStrategy;
import attackStrategy.MissileStrategy;
import character.Para;
import character.Tracer;
import movingStrategy.FlyingStrategy;
import movingStrategy.WalkingStrategy;

public class LaunchProject {

	public static void main(String[] args) {
		character para = new Para("파라");
		character tracer = new Tracer("트레이서");
		
		para.setAttackStrategy(new MissileStrategy());
		para.setMovingStrategy(new FlyingStrategy());
		
		tracer.setAttackStrategy(new BombStrategy());
		tracer.setMovingStrategy(new WalkingStrategy());
		
		System.out.println("이 캐릭터의 이름은 "+para.getName()+"입니다.");
		para.move();
		para.attack();
		System.out.println();
		System.out.println("이 캐릭터의 이름은 "+tracer.getName()+"입니다.");
		tracer.move();
		tracer.attack();
		
	}

}
