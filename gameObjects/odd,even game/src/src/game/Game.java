package game;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import gameObjects.Gameobject;
import gameObjects.even;
import gameObjects.odd;

public class Game {
//홀짝
	
	Gameobject[] objects = {new odd(), new even()  };
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	
	public void run() {
		System.out.println("게임시작...");
		int wins= 0;
		
		System.out.print("홀(1),짝(0) 중 숫자로 선택: ");
		
		Gameobject ob1= objects[scanner.nextInt()];
		
		Gameobject ob2= objects[random.nextInt(objects.length)];
		
		System.out.println("당신의 선택은? : " + ob1.getName());
		System.out.println("컴퓨터의 선택은? : "+ ob2.getName() );
		
		int result = ob1.compareTo(ob2);
		wins += result;
		
		if (ob1==ob2) {
			System.out.println("당신의 승리! 😎😎 ");
		}else {
			System.out.println("당신의 패배! 🤢🤢 ");
		}
		
		
		}
	}

