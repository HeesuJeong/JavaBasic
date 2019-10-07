package 보충;

public class 치즈도둑 {

	public static void main(String[] args) {
/*		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc ++) {
			int N = sc.nextInt();
			int[][] map = new int[N+2][N+2];
			for(int i=1; i<= N; i++) {
				map[i][j] = sc.nextInt();
			}
		int max = 1;
		for(int day = 0; day <= 100; day++) {
			boolean[][] visited = new boolean[N+2][N+2];
			int cnt = 0;
			for(int i=1; i<=N; i++) {
				for(int j=1; j<=N; j++) {
					
				}
			}
		}
		}
		
		if(!visited[i][j])
		// Point객체를 담을 큐를 준비
			Queue<Point> queue = new LinkedList()<>();
		// 처음 방문하는 위치에 대한 Point객체를 큐에 삽입
		queue.add(new Point(i, j));
		visited[i][j] = true;
		// 큐에 Point가 바닥날 때까지 큐에서 하나 꺼내서 상하좌우로 먹을 수 있는 치즈가 있다면 큐에 추가	
		while( !queue.isEmpty()) {
			// 큐에서 하나 꺼내서
			Point p = queue.poll();
			// 상하좌우로 먹을 수 있는 치즈가 있다면 큐에 추가
			for(int d = 0; d < 4; d++) {
				int nr = p.r + dr[d];
				int nc = p.c + dc[d];
				// 상하지 않았고 (날짜보다 크고) 먹지 않았다면(방문체크안되어있으면)
				if( map[nr][nc] > day && !visited[nr][nc] ) {
					visited[nr][nc] = true;
					queue.add(new Point(nr, nc));
				}
			}
		}*/
	}
	static class Point{
		int r, c;
		public Point(int r, int c) {
			// TODO Auto-generated constructor stub
			this.r = r;
			this.c = c;
		}
	}
	static int [] dr = {-1, 1, 0, 0};
	static int [] dc = {0, 0, -1, 1};
	static void dfs(int[][] map, boolean[][] visited, int r, int c, int day) {
		visited[r][c] = true;
		for(int i = 0; i < 4 ; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			
		}
	}

}
