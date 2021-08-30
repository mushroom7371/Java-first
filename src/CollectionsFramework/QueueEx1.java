package CollectionsFramework;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

class QueueEx1 {
	static Queue q = new LinkedList();	//static�� ���Ͽ� Ŭ������ �޸𸮿� ����ɶ� ���� �ѹ� ���� �ȴ�. �̰�� LiskedList ��ü�� �����Ͽ� Queue Ÿ���� ���������� �ּҰ��� �����Ѵ�.
	static final int MAX_SIZE = 5;	//Queue�� �ִ� ����� �����Ѵ�.
	
	public static void main(String [] args) {
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");
		
		while(true) {	//�ݺ��� ���� ������ �𸣹Ƿ� while������ ����ϸ�, ���ǹ��� true�� �־� �׻� �ݺ����� ������ ����ǵ��� �Ͽ���.
			System.out.print(">>");
			
			try {
				Scanner s = new Scanner(System.in);
				String input = s.next().trim();
				//����ڰ� Ű����� �Է��� ���� ��ü�� �����Ͽ� String Ÿ���� ���������� �� ��ü�� �ּҰ��� ��´�. �̶� trim()�޼��带 �̿��Ͽ� ������ �����.
				
				if("".equals(input)) continue;
				//�� ���ڿ��� ������ ���´ٸ� continue�� ���� �ݺ��� ���������� ���ư���.
				
				if(input.equalsIgnoreCase("q")) {	//��ҹ��� ������� q�� �Էµȴٸ�, ���α׷��� �����Ѵ�.
					System.exit(0);
				}else if(input.equalsIgnoreCase("help")) {	//help�� �ԷµǸ� �Ʒ��� ���� �޴��� �����ش�.
					System.out.println(" help - ������ �����ݴϴ�.");
					System.out.println(" q �Ǵ� Q - ���α׷��� �����մϴ�.");
					System.out.println(" history - �ֱٿ� �Է��� ��ɾ " + MAX_SIZE + "�� �����ݴϴ�.");
				}else if(input.equalsIgnoreCase("history")) {	//history�� �ԷµǾ�����
					int i = 0;
					
					save(input);
					//�Ʒ��� static �޼��带 ���Ͽ� input�� ������ Queue�� ����ȴ�.
					
					LinkedList tmp = (LinkedList)q;	//�ӽ÷� ������ LinkedList Ÿ���� �������� tmp�� ��ܿ� ������ QueueŸ���� ���������� ����Ű�� �ǳ� ����ȯ�� �Ͽ� ����Ų��.
					ListIterator it = tmp.listIterator();
					//list�� ����� ��ҵ��� �о���� ���� ǥ�� �������̽� iterator�� ����Ͽ���.
					
					while(it.hasNext()) {	//����� LinkedList�� ���� ����Ǿ��ִٸ� �� ������ �о�� ����Ѵ�.
						System.out.println(++i + "." + it.next());
					}
				}else {
					save(input);
					System.out.println(input);
					//������ ������ �ܾ�鿡 �������� �ʴ� ���� �Էµȴٸ� �� ���� Queue�� �����Ѵ�.
				}
			}catch(Exception e) {
				System.out.println("�Է� ���� �Դϴ�.");
				e.printStackTrace();
				//�����߻��� Exception Ŭ������ ��ü�� ���Ͽ� �ش� ���� ������ ����ϵ��� �Ͽ���.
			}
		}
	}	//main
	
	public static void save(String input) {	//static �޼��� Ű����� �Էµ� ���� Queue�� �����Ѵ�.
		if(!"".equals(input))
		q.offer(input);
		
		if(q.size() > MAX_SIZE)	//Queue�� ũ�Ⱑ MAX_SIZE�� �Ѵ´ٸ� Queue�� Ư���� ���� �� ������ ���ŵȴ�.
			q.remove();
	}
}
