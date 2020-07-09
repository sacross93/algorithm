package mazerunner;

public class maze {
	static int m = 3;
	static int n = 3;
	static int k = 3;

	static public ListStack mazePath(int maze[][][]) {
		int[][][] mark = new int[m + 2][n + 2][k + 2];
		mark = maze;
		ListNode start = new ListNode();
		start.x = 1;
		start.y = 1;
		start.z = 1;
		start.go = 0;
		ListStack path = new ListStack();
		int i;
		while (true) {
			i = mark[start.x][start.y][start.z];
			switch (i) {
			case 0:
				if (maze[start.x + 1][start.y][start.z] == 0) {
					start.go = 0;
					path.push(start);
					start.x += 1;
				}
				else mark[start.x][start.y][start.z] = 1;
				break;
			case 1:
				if (maze[start.x][start.y + 1][start.z] == 0) {
					start.go = 1;
					path.push(start);
					start.y += 1;
				}
				else mark[start.x][start.y][start.z] = 2;
				break;
			case 2:
				if (maze[start.x][start.y][start.z + 1] == 0) {
					start.go = 2;
					path.push(start);
					start.z += 1;
				}
				else mark[start.x][start.y][start.z] = 3;
				break;
			case 3:
				if (maze[start.x - 1][start.y][start.z] == 0) {
					start.go = 3;
					path.push(start);
					start.x -= 1;
				}
				else mark[start.x][start.y][start.z] = 4;
				break;
			case 4:
				if (maze[start.x][start.y - 1][start.z] == 0) {
					start.go = 4;
					path.push(start);
					start.y -= 1;
				}
				else mark[start.x][start.y][start.z] = 5;
				break;
			case 5:
				if (maze[start.x][start.y][start.z - 1] == 0) {
					start.go = 5;
					path.push(start);
					start.z -= 1;
				}
				else mark[start.x][start.y][start.z] = 6;
				break;
			case 6:
				start = path.pop();
				break;
			}
			//System.out.println("x= " + start.x + "y= " + start.y + "z= " + start.z);
			if (start.x == m && start.y == n && start.z == k) {
				break;
			}
			if (path.isEmpty() == true) {
				break;
			}
			//start = path.peek();
		}
		
		

		System.out.println("x= " + path.peek().x + "y= " + path.peek().y + "z= " + path.pop().z);

		System.out.println("x= " + path.peek().x + "y= " + path.peek().y + "z= " + path.pop().z);

		System.out.println("x= " + path.peek().x + "y= " + path.peek().y + "z= " + path.pop().z);
		
		
		

		return path;

	}

	public static void main(String[] args) {
		int[][][] maze = new int[m + 2][n + 2][k + 2];
		for (int z = 0; z < k + 2; z++) {
			for (int x = 0; x < m + 2; x++) {
				for (int y = 0; y < n + 2; y++) {
					if (z == 0 || z == k + 1) {
						maze[x][y][z] = 1;
					} else if (x == 0 || x == m + 1 || y == 0 || y == n + 1) {
						maze[x][y][z] = 1;
					}
					System.out.print(maze[x][y][z]);
				}
				System.out.println("");
			}
			System.out.println("");
		}
		ListStack a = mazePath(maze);
		ListStack real = new ListStack();
		
		if (a.isEmpty()) {
			System.out.println("³ë°æ·Î");
		} else {
		}

	}

}
