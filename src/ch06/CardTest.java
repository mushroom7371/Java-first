package ch06;

	class Card	{
		String kind;
		int number;
		static int width = 100;
		static int heigt = 250;
	}
	
	class CardTest	{
		public static void main (String args[]) {
			System.out.println("Card.width = "+ Card.width);
			System.out.println("Card.heigt ="+ Card.heigt);
			
			Card c1 = new Card();
			c1.kind = "Heart";
			c1.number = 7;
			
			Card c2 = new Card();
			c2.kind = "Spade";
			c2.number = 4;
			
			System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� ("+ c1.width + ", " + c1.heigt + ")");
			System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� ("+ c2.width + ", " + c2.heigt + ")");
			System.out.println("c1�� width�� heigt�� ���� 50, 80���� �����մϴ�.");
			c1.width = 50;
			c2.heigt= 80;
			
			System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� ("+ c1.width + ", " + c1.heigt + ")");
			System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� ("+ c2.width + ", " + c2.heigt + ")");
			
		}
	}