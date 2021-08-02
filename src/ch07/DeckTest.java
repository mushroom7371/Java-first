package ch07;

public class DeckTest {
	public static void main(String [] args) {
		Deck d = new Deck(); // Deck Ÿ���� �ν��Ͻ��� ���� �����Ͽ� �������� d�� �ּҰ��� ������.
		Card c = d.pick(0);	// Card Ÿ���� ���� c�� d�� pick()�޼��带 ȣ���Ͽ� 0������ ī�� ��ü�� �ּҸ� ��´�.
		System.out.println(c);
		
		d.shuffle();
		c = d.pick(0);
		System.out.println(c);
		
	}
}
	
	class Card{	//Card�� ��������� Ŭ����
		//ī���� �Ӽ��� �����Ͽ���. ����� ������ ���� static���� �����Ͽ� Ŭ������ �޸𸮿� ����ɶ� �����ѹ� �����ȴ�.
		static final int KIND_MAX = 4;
		static final int NUM_MAX = 13;
		
		static final int SPADE  =4;
		static final int DIAMOND = 3;
		static final int HEART = 2;
		static final int CLOVER = 1;
		int kind;
		int number;
		
		Card(){	//�����ڸ� ���Ͽ� �Ű������� ������ ���� kind���� SPADE(4)��, number���� 1�� �Է��Ѵ�.
			this(SPADE,1);
		}
		
		Card(int kind, int number){	//�Ű������� �ִٸ� ������ ������ �����Ѵ�.
			this.kind = kind;
			this.number = number;
		}
		
		public String toString() {
			String [] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
			//�迭�� �����ϵ� ù��° ������ ���ڿ�("")�� �����Ͽ� �������� ���� ���������� �Ǵ��ϱ� ���� �Ͽ���.
			String numbers = "0123456789XJQK";
			//ī���� ���ڸ� ������ ���������� charAt()�޼���� ���ڸ� �̾Ƴ��ű� ������ 0������ 0�� �����ϵ��� �Ͽ���.
			return "kind : " + kinds[this.kind] + ", num : " + numbers.charAt(this.number);
		}
	}
	
	class Deck{
		final int CARD_NUM = 52;	//ī�� ������ ���� ���� ����� ����
		Card cardArr[] = new Card[CARD_NUM];	//Card Ŭ������ ���԰���� Deck Ŭ�������� ������
		//ī���� ���� ������ ������ 52�� �ǰ� ������ ��ü�� CardŸ���� �������� cardArr�� ����Ű���� �Ͽ���.
		
		Deck() {	//�����ڸ� ���Ͽ� �ʱ�ȭ�� ������.
			int i = 0;
			
			for(int k = Card.KIND_MAX; k > 0; k--)	//ī���� ���� ũ�⿡�� ����(4)�ؼ� 1���� �����ϸ� �ݺ��Ѵ�.
				for(int n = 0; n < Card.NUM_MAX; n++)	//ī���� ���ڸ�ŭ �����ϸ� �ݺ��Ѵ�.
					cardArr[i++] = new Card(k, n+1);	//cardArr�� ������ ������ ������ ī���� �ּҰ��� �����ϰ� �������� �ݺ��Ѵ�.
		}
		
		Card pick(int index) {	//�Ű������� �����Ͽ� ī���� �������� �ش��ϴ� ���� ��ȯ�Ѵ�.
			return cardArr[index];
		}
		
		Card pick() {	//�Ű������� ���ٸ� ������ ī�带 ��ȯ�ϱ� ���� �ٽ� pick()�޼��带 ȣ���Ѵ�.
			int index = (int)(Math.random() * CARD_NUM);
			return pick(index);
		}
		
		void shuffle() {	//ġȯ�� ���Ͽ� ī�带 �����ش�.
			for(int i = 0; i < cardArr.length; i++) {
				int r = (int)(Math.random() * CARD_NUM);
				
				Card temp = cardArr[i];
				cardArr[i] = cardArr[r];
				cardArr[r] = temp;
				
			}
		}
	}
	
