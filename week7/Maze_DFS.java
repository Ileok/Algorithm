package week7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Maze_DFS {
	
	private static int n, m;	//미로 담을 배열의 행열 크기
	
	private static int[][] arr;	//미로 담을 배열(dfs용)
	
	//이동할 4방향 정의(상하좌우)
	private static int[] dx = {1, -1, 0, 0};
	private static int[] dy = {0, 0, 1, -1};
	
	private static int sum = 1;
	
	//dfs함수
	private static void dfs( int now_x, int now_y ) {
		//현재 노드를 0으로 바꿔서 방문처리한다.
		arr[now_x][now_y] = 0;
		
		int x, y;
		
		//상하좌우로 이동하기 위해 arr인덱스값 설정
		for( int i=0; i<4; i++ ) {
			x = now_x + dx[i];
			y = now_y + dy[i];
			
			//x, y값이 배열의 범위를 넘으면 다음 순회
			if( x <= 0 || x >= n+1 || y <= 0 || y >= m+1 ) continue;
			
			//배열값이 1이고, x나 y가 기존 x,y보다 클 때만 bfs 재귀적 호출
			if( arr[x][y] == 1 && ( x>now_x || y>now_y ) ) {
				sum++;
				dfs( x, y );
			}
		}
	}//dfs함수 끝
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = new StringTokenizer( br.readLine() );
		
		n = Integer.parseInt( st.nextToken() );	//미로출구 n행
		m = Integer.parseInt( st.nextToken() );	//미로출구 m행
		
		arr = new int[n+1][m+1];	//미로배열 선언
		
		for( int i=0; i<=n; i++ ) {
			if( i == 0 ) {
				int[] tmp = {0, 0, 0, 0, 0, 0, 0};
				arr[i] = tmp;
			} else {
				char[] tmp1 = br.readLine().toCharArray();
				for( int j=0; j<=m; j++ ) {
					if( j == 0 ) {
						arr[i][j] = 0;
					}
					else {
						arr[i][j] = Character.getNumericValue(tmp1[j-1]);
					}
				}
			}
		}
		
		dfs( 1, 1 );
		
		System.out.println( "DFS 결과 : " + sum );
		

	}//main method end
}