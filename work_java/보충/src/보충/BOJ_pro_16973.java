package 보충;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 직사각형 탈출
public class BOJ_pro_16973 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [][] dir = {{-1, 0},{1, 0},{0, -1},{0, 1}}; 
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int map[][] = new int[n][m];
		for(int i=0; i< n; i++) {
			for(int j=0; j<m; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int sr = sc.nextInt();
		int scc = sc.nextInt();
		
		int fr = sc.nextInt();
		int fc = sc.nextInt();
		
		Queue<point> q = new LinkedList<>();
		
		q.add(new point(sr, scc));
		
		while(!q.isEmpty()) {
			int x = q.peek().x;
			int y = q.peek().y;
			
			for(int i=0; i<4; i++) {
				int nx = x + dir[i][1];
				int ny = y + dir[i][0];
				
				if(i==0) {
					
				}else if(i == 1) {
					
				}else if(i == 2) {
					
				}else {
					
				}
			}
			
		}
		
		
	}
	static class point{
		int y, x;
		public point(int y, int x) {
			// TODO Auto-generated constructor stub
			this.y = y;
			this.x = x;
			
		}
	}

}
