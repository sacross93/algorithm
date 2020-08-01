package maze;

public class maze3 {

	static public int[][][] setMaze(int m, int n, int k) {
		int[][][] maze = new int[m + 2][n + 2][k + 2];
		
		maze[2][1][1] = 1;
		maze[3][1][1] = 1;
		maze[3][2][1] = 1;
		maze[1][3][1] = 1;
		maze[3][3][2] = 1;
		maze[1][2][1] = 1;
		maze[2][1][2] = 1;
		maze[3][2][3] = 1;
		maze[2][2][3] = 1;

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


		return maze;
	}

	static public void printMaze(ListStack maze) {
		ListStack path = new ListStack();
		int i = 1;
		if(maze.isEmpty()==true) {
			System.out.println("겅로가 없습니다.");
			return;
		}
		System.out.println("Start");
		while (true) {
			path.push(maze.pop());
			if (maze.isEmpty() == true) {
				break;
			}
		}
		while (true) {
			System.out.println(i + "번째 x:" + path.peek().posX + " y:" + path.peek().posY + " z:" + path.pop().posZ);
			i++;
			if (path.isEmpty() == true) {
				break;
			}
		}
		System.out.println("Finish");
	}

	static ListStack mazePath(int[][][] maze,int[][][] mark) {
		
		ListStack path = new ListStack();
		ListNode currentNode = new ListNode();
		path.push(1, 1, 1);
		mark[currentNode.posX][currentNode.posY][currentNode.posZ] = -1;
		while(true) {
			currentNode = path.peek();
			mark[currentNode.posX][currentNode.posY][currentNode.posZ]++;
			if(currentNode.posX == maze.length-2 && currentNode.posY == maze[0].length-2 && currentNode.posZ == maze[0][0].length-2) {
				break;
			}
			switch(mark[currentNode.posX][currentNode.posY][currentNode.posZ]) {
				case 0:
					if(maze[currentNode.posX+1][currentNode.posY][currentNode.posZ]== 0
						&& mark[currentNode.posX+1][currentNode.posY][currentNode.posZ] != 3) {
						path.push(currentNode.posX+1, currentNode.posY, currentNode.posZ);
					}
					break;
				case 1:
					if(maze[currentNode.posX][currentNode.posY+1][currentNode.posZ]== 0
						&& mark[currentNode.posX][currentNode.posY+1][currentNode.posZ] != 4) {
						path.push(currentNode.posX, currentNode.posY+1, currentNode.posZ);
					}
					break;
				case 2:
					if(maze[currentNode.posX][currentNode.posY][currentNode.posZ+1]== 0
						&& mark[currentNode.posX][currentNode.posY][currentNode.posZ+1] != 5) {
						path.push(currentNode.posX, currentNode.posY, currentNode.posZ+1);
					}
					break;
				case 3:
					if(maze[currentNode.posX-1][currentNode.posY][currentNode.posZ]== 0
							&& mark[currentNode.posX-1][currentNode.posY][currentNode.posZ] != 0) {
						path.push(currentNode.posX-1, currentNode.posY, currentNode.posZ);
					}
					break;
				case 4:
					if(maze[currentNode.posX][currentNode.posY-1][currentNode.posZ]== 0
							&& mark[currentNode.posX][currentNode.posY-1][currentNode.posZ] != 1) {
						path.push(currentNode.posX, currentNode.posY-1, currentNode.posZ);
					}
					break;
				case 5:
					if(maze[currentNode.posX][currentNode.posY][currentNode.posZ-1]== 0
							&& mark[currentNode.posX][currentNode.posY][currentNode.posZ-1] != 2) {
						path.push(currentNode.posX, currentNode.posY, currentNode.posZ-1);
					}
					break;
				case 6:
					path.pop();
					break;
			}
			if(path.isEmpty()) {
				break;
			}
			
		}
		return path;
	}

	public static void main(String[] args) {
		int m = 3, n = 3, k = 3;
		int[][][] maze = setMaze(m, n, k);
		int[][][] mark = new int[m + 2][n + 2][k + 2];
		ListStack path = new ListStack();
		for (int z = 0; z < k + 2; z++) {
			for (int x = 0; x < n + 2; x++) {
				for (int y = 0; y < m + 2; y++) {
					mark[x][y][z] = -1;
				}
			}
		}
		path=mazePath(maze,mark);
		printMaze(path);
		
	}
}
