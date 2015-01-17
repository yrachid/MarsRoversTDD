package main;


import java.util.ArrayList;
import java.util.List;

import br.com.yasser.rachid.marsrovers.model.Robot;

public class RobotBuilder implements Builder<Robot>{

	public Robot getSingle() {
		Robot robot = new Robot();
		
		return robot;
	}

	public List<Robot> getMany(int amount) {
		ArrayList<Robot> robots  = new ArrayList<Robot>();
		
		for(int i=0; i<amount; i++){
			Robot robot = new Robot();
			
			robots.add(robot);
		}
		

		return robots;
	}
		

}
