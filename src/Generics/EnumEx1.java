package Generics;

enum Direction { EAST, SOUTH, WEST, NORTH }
//������ ���� Direction�� �������� �̸��̰� {}���� ������ ����̸��̴�.

class EnumEx1 {
	public static void main(String[] args) {
		Direction d1 = Direction.EAST;	//Direction Ÿ���� �������� d1�� �����ϰ� Direction���� EAST�� �����Ѵ�. ��üȭ ��.
		Direction d2 = Direction.valueOf("WEST");	//Direction���������� "WEST"�� ���� ���� ���� �����͸� ��üȭ �Ͽ� �����Ѵ�.
		Direction d3 = Enum.valueOf(Direction.class, "EAST");	//EnumŬ�����κ��� valueOf()�޼��带 ȣ���Ͽ� �Ű����������� ���� ������ �����Ͽ� ���������� �����Ѵ�.

		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);

		System.out.println("d1==d2 ? "+ (d1==d2));	//������ ��������� ==�� ���� �񱳰����ϴ� d1�� d2�� ���� �����Ƿ� false�� ��µȴ�.
		System.out.println("d1==d3 ? "+ (d1==d3));	//d1�� d3�� ���������� ��µȴ� �̴� ���� �ν��Ͻ��� �ּҸ� d1�� d3�� ���� ����Ų�ٴ� �ǹ��̴�.
		System.out.println("d1.equals(d3) ? "+ d1.equals(d3));	//equals()�޼��� ���� ��밡���ϳ� == �����ڿ� �������� �ӵ��̴�. == �����ڰ� �� ������.
//		System.out.println("d2 > d3 ? "+ (d1 > d3)); // ����
		System.out.println("d1.compareTo(d3) ? "+ (d1.compareTo(d3)));	//<,> �� ���� �񱳿����ڴ� ����� �Ұ����ϳ� compareTo()�޼��带 ���� �񱳴� �����ϴ�.
		System.out.println("d1.compareTo(d2) ? "+ (d1.compareTo(d2)));	//compareTo()�� �񱳴���� ������ 0, ������ �� ũ�� ���, �������� �� ũ�� ������ ��ȯ�Ѵ�.

		switch(d1) {	//Enum�� ����̹Ƿ� switch�� �ݺ��� �����ϴ�.
			case EAST: // Direction.EAST��� �� �� ����.
				System.out.println("The direction is EAST."); 
				break;
			case SOUTH:	//���� d1�� ����Ű�� ��ü�� SOUTH��� �Ʒ��� ����� ����ϰ� �ݺ��� ������.
				System.out.println("The direction is SOUTH."); 
				break;
			case WEST:
				System.out.println("The direction is WEST."); 
				break;
			case NORTH:
				System.out.println("The direction is NORTH."); 
				break;
			default:	//��ġ�ϴ� ����� ���ٸ� �Ʒ��� ����� ����ϰ� �ݺ��� ������.
				System.out.println("Invalid direction."); 
//				break;
		}

		Direction[] dArr = Direction.values();	//Direction Ÿ���� �迭�� �����ϰ� �������� dArr�� �� �ּҰ��� ��´�. �迭�� Direction�� value()�޼��带 ���Ͽ� ��ȯ���� �����͸� �����Ѵ�.

		for(Direction d : dArr)  // for(Direction d : Direction.values()) 
			System.out.printf("%s=%d%n", d.name(), d.ordinal()); 
		//���� for���� �̿��Ͽ� Direction Ÿ���� �������� d�� dArr�� ����Ű�� �迭�� �����͸� ���������� �����Ѵ�.
		//��½� d�� name()�޼��带 ���Ͽ� ����� �̸��� ���ڿ��� ��ȯ�ϰ� �� ����������� ���ǵ� ������ ���� ����Ѵ�. ������ 0 ���� �����Ѵ�(�迭�� ���������� �迭�� 0�������� �����Ѵ�.)
	}
}
