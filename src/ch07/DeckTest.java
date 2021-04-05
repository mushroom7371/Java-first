package ch07;

public class DeckTest {
	public static void main(String [] args) {
		Deck d = new Deck(); // Deck 타입의 인스턴스를 새로 생성하여 참조변수 b에 주소값을 대입함.
		Card c = d.pick(0);	// Card 타입의 변수 c에 Deck 인스턴스 메서드인 pick을 호출하여 값을 저장함.
		System.out.println(c);
		
		d.shuffle();
		c = d.pick(0);
		System.out.println(c);
		
	}
}
	
	class Card{
		static final int KIND_MAX = 4;
		static final int NUM_MAX = 13;
		
		static final int SPADE  =4;
		static final int DIAMOND = 3;
		static final int HEART = 2;
		static final int CLOVER = 1;
		int kind;
		int number;
		
		Card(){
			this(SPADE,1);
		}
		
		Card(int kind, int number){
			this.kind = kind;
			this.number = number;
		}
		
		public String toString() {
			String [] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
			String numbers = "0123456789XJQK";
			return "kind : " + kinds[this.kind] + ", num : " + numbers.charAt(this.number);
		}
	}
	
	class Deck{
		final int CARD_NUM = 52;
		Card cardArr[] = new Card[CARD_NUM];	//Card 클래스를 포함관계로 Deck 클래스에서 재사용함
		
		Deck() {
			int i = 0;
			
			for(int k = Card.KIND_MAX; k > 0; k--)
				for(int n = 0; n < Card.NUM_MAX; n++)
					cardArr[i++] = new Card(k, n+1);
		}
		
		Card pick(int index) {
			return cardArr[index];
		}
		
		Card pick() {
			int index = (int)(Math.random() * CARD_NUM);
			return pick(index);
		}
		
		void shuffle() {
			for(int i = 0; i < cardArr.length; i++) {
				int r = (int)(Math.random() * CARD_NUM);
				
				Card temp = cardArr[i];
				cardArr[i] = cardArr[r];
				cardArr[r] = temp;
				
			}
		}
	}
	
