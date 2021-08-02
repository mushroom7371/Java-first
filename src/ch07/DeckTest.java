package ch07;

public class DeckTest {
	public static void main(String [] args) {
		Deck d = new Deck(); // Deck 타입의 인스턴스를 새로 생성하여 참조변수 d에 주소값을 대입함.
		Card c = d.pick(0);	// Card 타입의 변수 c에 d의 pick()메서드를 호출하여 0번지의 카드 객체의 주소를 담는다.
		System.out.println(c);
		
		d.shuffle();
		c = d.pick(0);
		System.out.println(c);
		
	}
}
	
	class Card{	//Card를 만들기위한 클래스
		//카드의 속성을 정의하였다. 상수로 선언한 것은 static으로 선언하여 클래스가 메모리에 적재될때 최초한번 생성된다.
		static final int KIND_MAX = 4;
		static final int NUM_MAX = 13;
		
		static final int SPADE  =4;
		static final int DIAMOND = 3;
		static final int HEART = 2;
		static final int CLOVER = 1;
		int kind;
		int number;
		
		Card(){	//생성자를 통하여 매개변수가 없을시 변수 kind에는 SPADE(4)를, number에는 1을 입력한다.
			this(SPADE,1);
		}
		
		Card(int kind, int number){	//매개변수가 있다면 각각의 변수를 대입한다.
			this.kind = kind;
			this.number = number;
		}
		
		public String toString() {
			String [] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
			//배열로 설정하되 첫번째 번지엔 빈문자열("")을 지정하여 번지수의 값을 직관적으로 판단하기 쉽게 하였다.
			String numbers = "0123456789XJQK";
			//카드의 숫자를 지정함 마찬가지로 charAt()메서드로 숫자를 뽑아낼거기 때문에 0번지엔 0을 대입하도록 하였다.
			return "kind : " + kinds[this.kind] + ", num : " + numbers.charAt(this.number);
		}
	}
	
	class Deck{
		final int CARD_NUM = 52;	//카드 묶음의 수를 위해 상수로 선언
		Card cardArr[] = new Card[CARD_NUM];	//Card 클래스를 포함관계로 Deck 클래스에서 재사용함
		//카드의 수는 위에서 선언한 52가 되고 생성한 객체를 Card타입의 참조변수 cardArr이 가리키도록 하였다.
		
		Deck() {	//생성자를 통하여 초기화를 진행함.
			int i = 0;
			
			for(int k = Card.KIND_MAX; k > 0; k--)	//카드의 종류 크기에서 시작(4)해서 1까지 감소하며 반복한다.
				for(int n = 0; n < Card.NUM_MAX; n++)	//카드의 숫자만큼 증가하며 반복한다.
					cardArr[i++] = new Card(k, n+1);	//cardArr의 각각의 번지에 생성한 카드의 주소값을 저장하고 증가시켜 반복한다.
		}
		
		Card pick(int index) {	//매개변수를 참고하여 카드의 번지수에 해당하는 값을 반환한다.
			return cardArr[index];
		}
		
		Card pick() {	//매개변수가 없다면 임의의 카드를 반환하기 위해 다시 pick()메서드를 호출한다.
			int index = (int)(Math.random() * CARD_NUM);
			return pick(index);
		}
		
		void shuffle() {	//치환을 통하여 카드를 섞어준다.
			for(int i = 0; i < cardArr.length; i++) {
				int r = (int)(Math.random() * CARD_NUM);
				
				Card temp = cardArr[i];
				cardArr[i] = cardArr[r];
				cardArr[r] = temp;
				
			}
		}
	}
	
