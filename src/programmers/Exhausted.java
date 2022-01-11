package programmers;

//�Ƿε�
class Exhausted {
	boolean [] visit;
    int [][] dungeons;
    int max = 0;
    
    private int solution(int k, int [][] dungeons) {
        this.dungeons=dungeons;	//��� �������� ���������� dungeons�� ���ڷ� ���� dungeons ������ ����Ű�� �迭�� ����Ű���� �Ѵ�.
        visit = new boolean[dungeons.length];	//�湮 ���θ� ������ boolean �迭 ����
        for(int i = 0; i < dungeons.length; i++) {	//dungeons�� ����Ű�� �迭�� ũ�⸸ŭ 1�� �����ϸ鼭 �ݺ�
        	if(k >= dungeons[i][0]) {	//�־��� �Ƿε��� �迭�� �� ������ �ּ��ʿ䵵 ���� ũ�ٸ�
        		dfs(i, k, 1); //dfs()�޼��带 ȣ���Ѵ�.
        	}
        }
        return max;
    }
 
    private void dfs(int cur, int tired, int depth) {
        visit[cur]=true;	//cur ������ ���� true�� ����
        tired -= dungeons[cur][1];	//�ִ� �Ƿε����� cur���� ������ �Ҹ� �ʿ䵵�� ����.
        for(int i = 0; i < dungeons.length; i++) {	//dungeons�� ũ���ŭ 1�� �����ϸ� �ݺ�
        	if(!visit[i] && dungeons[i][0] <= tired) {	//i���� ������ �湮���� �ʾҰ�, �Ƿε����� �Ҹ� �ʿ䵵�� �۴ٸ�
        		dfs(i,tired,depth+1);	//dfs() �޼��带 �ٽ� ȣ���ϰ�, ���ڰ��� �����Ѵ�.
        	}
        }
        max = Math.max(depth,max);	//�ִ� Ž�� �������� ����
        visit[cur]=false;	//�湮 ���θ� false�� �ǵ�����.
    }
}
