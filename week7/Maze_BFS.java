package week7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Maze_BFS {
	
	private static int n, m;
	
	private static int[][] arr;	

	private static int[] dx = {1, -1, 0, 0};
	private static int[] dy = {0, 0, 1, -1};
	
	private static int sum = 1;
	
	
	private static void bfs( int now_x, int now_y ) {
		Queue<Integer> que = new LinkedList<Integer>();
		
		que.add( now_x );
		que.add( now_y );
		
		arr[now_x][now_y] = 0;
		
		int x, y;
		
		while( !que.isEmpty() ) {
			now_x = que.poll();
			now_y = que.poll();
			
			arr[now_x][now_y] = 0;
			
			for( int i=0; i<4; i++ ) {
				x = now_x + dx[i];
				y = now_y + dy[i];

				if( x <= 0 || x >= n+1 || y <= 0 || y >= m+1 ) 
                continue;
				
				if( arr[x][y] == 1 && ( x>now_x || y>now_y ) ) {
					sum++;
					que.add( x );
					que.add( y );
				}
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = new StringTokenizer( br.readLine() );
		
		n = Integer.parseInt( st.nextToken() );
		m = Integer.parseInt( st.nextToken() );
		
		arr = new int[n+1][m+1];
		
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
		
		bfs( 1, 1 );
		System.out.println( "BFS 결과 : " + sum );
		

	}
}