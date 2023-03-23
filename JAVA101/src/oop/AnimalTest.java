package oop;

import java.util.ArrayList;

class Animal{

	public void move() {
		System.out.println("짐승이 움직입니다.");
	}
	public void eating() {
		System.out.println("짐승이 밥을 먹습니다.");
	}
}

class Human extends Animal{
	

	@Override
	public void move() {
		System.out.println("인간이 움직입니다.");
	}
	public void buildFire() {
		System.out.println("인간이 불을 지핍니다.");
	}
}
class Tiger extends Animal{
	
	@Override
	public void move() {
		System.out.println("범이 움직입니다.");
	}
	public void growl() {
		System.out.println("범이 으르렁거립니다");
	}
}
class Racoon extends Animal{

	@Override
	public void move() {
		System.out.println("너구리가 움직입니다.");
	}
	public void smoke() {
		System.out.println("너구리가 담배를 핍니다.");
	}
}

public class AnimalTest {

	
	
	public static void main(String[] args) {
		
		Animal hairlessMonkey = new Human();
		Animal Barr = new Tiger();
		Animal bruisedRat = new Racoon();
		
		Animal[] array = {hairlessMonkey,Barr,bruisedRat};
		
		ArrayList<Animal> animalFarm = new ArrayList<Animal>();
		
		for(Animal a : array) {
			
			animalFarm.add(a);
		}
		
		for(Animal animal :animalFarm) {
			
			animal.move();
			//animal.smoke();
	
		}
		//downcasting
		Human hlMonkey = (Human)hairlessMonkey;
		hlMonkey.buildFire();
		//만약 업캐스팅(Animal)한 원래의 클래스(Tiger)를 실수로 다른 하위클래스(Human)으로 변환해서
		//사용하면 선언시에는 아무오류도 안뜨지만 실제 사용할 때 오류가 난다.
		//그러므로 항상 instanceof 로 원래의 클래스(Tiger)임을 확인하고 다운캐스팅을 진행
		//Human barr = (Human) Barr;// no error
		 //bar r.growl(); error
		//barr.buildFire(); error
		if(Barr instanceof Tiger) {
			Tiger barr = (Tiger) Barr;
			barr.growl();
		}
		
		if (bruisedRat instanceof Racoon) {
			Racoon bRat = (Racoon) bruisedRat;
			bRat.smoke();
		}

	}

}
