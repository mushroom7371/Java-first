package JavaStudy;

public class abstractExam {
	//Marine, Tank, DropShip 클래스 모두 각각의 기능 코드를 넣어 줄 수 있지만 코드가 번잡해 지고 길어진다
	//이 때문에 상속의 개념을 도입하여 간결하게 해주고, 추후 다른 기능을 구현할때에도 도움이 된다.
}

abstract class Unit	{	//Marine, Tank, DropShip 모두 가지고 있는 공통부분을 뽑아내서 부모클래스로 만듦.
	int x, y;
	abstract void move(int x, int y);	//다만 공중과 지상 유닛의 이동 방식이 다르기때문에 이 부분을 추상메서드로 선언, 때문에 Unit 클래스가 추상 클래스가 됨
	void stop() { /*멈춤*/ }
	
}

class Marine extends Unit	{	//Marine 클래스는 Unit 클래스로 부터 상속 받는다.
	void stimPack() { /*스팀팩 사용*/ }
	void move(int x, int y) { /*지정된 위치로 이동*/ }	//부모 클래스의 추상메서드를 반드시 구현해야 되기 때문에 추가함.
}

class Tank extends Unit	{
	void move(int x, int y) { /*지정된 위치로 이동*/ }
	void changeMode() { /*공격 모드로 변환*/ }	// Tank 유닛의 고유 기능
}

class DropShip extends Unit	{
	void move(int x, int y) { /*지정된 위치로 이동*/ }
	void load() { /*유닛 승선*/ }	// DropShip 유닛의 고유 기능
	void unload() { /*유닛 하선*/ }	// DropShip 유닛의 고유 기능
}
