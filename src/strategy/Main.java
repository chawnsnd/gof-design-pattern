//전략패턴
//인터페이스 개념, 델리게이트 개념, 전략 패턴 이해
package strategy;

public class Main {
	
	public static void main(String[] args) {
//		Ainterface ainterface = new AinterfaceImpl();
//		
//		//통로
//		ainterface.funcA();
//		
//		AObj aObj = new AObj();
//		aObj.funcAA();
		
		GameCharacter gameCharacter = new GameCharacter();
		
		gameCharacter.attack();
		
		gameCharacter.setWeapon(new Knife());
		gameCharacter.attack();
		
		gameCharacter.setWeapon(new Sword());
		gameCharacter.attack();
		
		gameCharacter.setWeapon(new Ax());
		gameCharacter.attack();
	}

}
