package programmers;

//피로도
class Exhausted {
	boolean [] visit;
    int [][] dungeons;
    int max = 0;
    
    private int solution(int k, int [][] dungeons) {
        this.dungeons=dungeons;	//멤버 변수이자 참조변수인 dungeons가 인자로 받은 dungeons 변수가 가리키는 배열을 가리키도록 한다.
        visit = new boolean[dungeons.length];	//방문 여부를 저장할 boolean 배열 선언
        for(int i = 0; i < dungeons.length; i++) {	//dungeons가 가리키는 배열의 크기만큼 1씩 증가하면서 반복
        	if(k >= dungeons[i][0]) {	//주어진 피로도가 배열의 각 번지의 최소필요도 보다 크다면
        		dfs(i, k, 1); //dfs()메서드를 호출한다.
        	}
        }
        return max;
    }
 
    private void dfs(int cur, int tired, int depth) {
        visit[cur]=true;	//cur 번지의 값을 true로 설정
        tired -= dungeons[cur][1];	//최대 피로도에서 cur번지 던전의 소모 필요도를 뺀다.
        for(int i = 0; i < dungeons.length; i++) {	//dungeons의 크기반큼 1씩 증가하며 반복
        	if(!visit[i] && dungeons[i][0] <= tired) {	//i번지 던전을 방문하지 않았고, 피로도보다 소모 필요도가 작다면
        		dfs(i,tired,depth+1);	//dfs() 메서드를 다시 호출하고, 인자값을 조정한다.
        	}
        }
        max = Math.max(depth,max);	//최대 탐험 던전수를 저장
        visit[cur]=false;	//방문 여부를 false로 되돌린다.
    }
}
