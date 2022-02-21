package AlgorithmStudy;

public class IntStack {
	private int max;	//?ㅽ ?⑸
	private int ptr;	//?ㅽ ?ъ명?
	private int [] stk;	//?ㅽ 蹂몄껜 諛곗?
	
	//?ㅽ??鍮?댁?? ??몄?由?
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {
		}
	}
	
	//?ㅽ??媛? 李쇱? ??몄?由?
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {
		}
	}
	
	//??깆瑜??듯??媛泥닿? ??깅硫???? ?댁⑹쇰? 珥湲고 ???
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;	//?몄媛?쇰? 諛? int 蹂?? 媛?쇰? ?⑸????댁?
		try {
			stk = new int[max];				// ?ㅽ?쇰? ?ъ⑺ 諛곗?
		} catch (OutOfMemoryError e) {		// 硫紐⑤━ ??(leak) ??⑹? 諛??? ??몄?寃쎌??ㅽ?몃?댁ㅺ? 異?λ?
			//?諛? 媛泥대? ?(Heap) 怨듦?? ??깊怨 ??????移? ?? 二쇱媛? 媛吏怨 媛泥?李몄“?? 諛⑹?쇰? ?ъ⑺?
			//媛泥대? ??깊? 怨쇱?? ?怨듦?? 媛泥대? ??뱁 怨듦???遺議깊 ? 諛???
			max = 0;
		}
	}

	// ?ㅽ? ?곗댄??몄(???
	public int push(int x) throws OverflowIntStackException {
		if (ptr >= max)	//諛곗댁 ?ш린?? max瑜??? ? ??? ptr? ?ъ명곕濡 諛곗댁 踰吏蹂대?1?щ?
			throw new OverflowIntStackException();
		return stk[ptr++] = x;	//洹몃吏 ??ㅻ㈃ ?ㅽ 諛곗댁 ptr(?ъ명?踰吏? ?곗댄?x瑜???ν怨 ?ъ명곗 ?ш린瑜?1 利媛 ??⑤?
	}

	// ?ㅽ?? ?곗댄곕? 爰쇰(留??? ?곗댄?
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0)	//?ъ명곕 諛곗댁 踰吏蹂대?1 ?щ濡 0?댄媛 ? ? ???
			throw new EmptyIntStackException();
		return stk[--ptr];	//?ъ명?1 ? 踰吏? ?? ?곗댄곕? 諛?
	}

	// ?ㅽ?? ?곗댄곕? ?쇳???? ?? ?곗댄곕? ?ㅼщㅻ?) 
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0)	//?곗댄곌? 鍮?댁? 寃쎌?
			throw new EmptyIntStackException();
		return stk[ptr - 1];	//?곗댄곌? ??ㅻ㈃, ?ъ명?1 踰吏? ??(留吏留 ?곗댄?瑜?諛?
	}

	// ?ㅽ?? x瑜?李얠 ?몃깆???쇰㈃ ?1)瑜?諛? 
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--)	//諛곗댁 留吏留 踰吏 遺??泥ル?吏?踰吏源吏 ?媛??以?ш?硫댁
			if (stk[i] == x)	//?대?踰吏? 媛???몄濡 諛? ?곗댄?x? 媛?ㅻ㈃
				return i;	//?대?踰吏瑜?諛?
		return -1;
	}

	// ?ㅽ? 鍮?
	public void clear() {
		ptr = 0;
	}

	// ?ㅽ? ?⑸? 諛?
	public int capacity() {
		return max;
	}

	// ?ㅽ? ????? ?곗댄??瑜?諛?
	public int size() {
		//諛곗댁 0踰吏遺?????닿?, ?ъ명곕 1踰吏 遺?????대濡 n媛? ?곗댄?媛 ??ㅺ? 媛??硫?
		//0踰吏 ~ n-1 踰吏? 媛??, 1 ~ n 源吏? 媛?? 媛? 寃곌낵瑜?媛?몄⑤? ???臾몄 ?ъ명곌? 媛?媛 ???
		return ptr;
	}

	// ?ㅽ??鍮????媛?
	public boolean isEmpty() {
		return ptr <= 0;
	}

	// ?ㅽ??媛? 李쇰媛?
	public boolean isFull() {
		return ptr >= max;
	}

	// ?ㅽ ?? 紐⑤ ?곗댄곕? 諛??-> 瑗?湲???濡 異??
	public void dump() {
		if (ptr <= 0)
			System.out.println("?ㅽ??鍮????듬??");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
}
