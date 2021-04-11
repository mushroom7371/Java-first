package JavaStudy;

public class abstractExam {
	//Marine, Tank, DropShip Ŭ���� ��� ������ ��� �ڵ带 �־� �� �� ������ �ڵ尡 ������ ���� �������
	//�� ������ ����� ������ �����Ͽ� �����ϰ� ���ְ�, ���� �ٸ� ����� �����Ҷ����� ������ �ȴ�.
}

abstract class Unit	{	//Marine, Tank, DropShip ��� ������ �ִ� ����κ��� �̾Ƴ��� �θ�Ŭ������ ����.
	int x, y;
	abstract void move(int x, int y);	//�ٸ� ���߰� ���� ������ �̵� ����� �ٸ��⶧���� �� �κ��� �߻�޼���� ����, ������ Unit Ŭ������ �߻� Ŭ������ ��
	void stop() { /*����*/ }
	
}

class Marine extends Unit	{	//Marine Ŭ������ Unit Ŭ������ ���� ��� �޴´�.
	void stimPack() { /*������ ���*/ }
	void move(int x, int y) { /*������ ��ġ�� �̵�*/ }	//�θ� Ŭ������ �߻�޼��带 �ݵ�� �����ؾ� �Ǳ� ������ �߰���.
}

class Tank extends Unit	{
	void move(int x, int y) { /*������ ��ġ�� �̵�*/ }
	void changeMode() { /*���� ���� ��ȯ*/ }	// Tank ������ ���� ���
}

class DropShip extends Unit	{
	void move(int x, int y) { /*������ ��ġ�� �̵�*/ }
	void load() { /*���� �¼�*/ }	// DropShip ������ ���� ���
	void unload() { /*���� �ϼ�*/ }	// DropShip ������ ���� ���
}
