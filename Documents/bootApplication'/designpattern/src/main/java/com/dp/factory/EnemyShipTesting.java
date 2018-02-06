package com.dp.factory;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {
		
		EnemyShip ufoShip = new UFOEnemyShip();
		/*EnemyShip theEnemy = null;
		Scanner userInput = new Scanner(System.in);
		String enemyShipOption = "";
		
		System.out.println("What type of ship ? U/ R ?");
		if(userInput.hasNextLine()){
			enemyShipOption = userInput.nextLine();
					
		}
		if(enemyShipOption.equals("U")){
			theEnemy = new UFOEnemyShip();
		}
		else{
			if(enemyShipOption.equals("R")){
				theEnemy = new RocketEnemyShip();
			}
		}*/
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		
		EnemyShip theEnemy = null;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("What type ship ? U/ R/ B");

		if(userInput.hasNextLine()){
			String typeOfShip = userInput.nextLine();
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
			
					
		}
		
		if(theEnemy!=null){
		doStuffEnemy(theEnemy);
		}
		else{
			System.out.println("Eter a U, R or B next line");
		}
	}

	private static void doStuffEnemy(EnemyShip anEnemyShip) {
		// TODO Auto-generated method stub
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoot();
	}

}
