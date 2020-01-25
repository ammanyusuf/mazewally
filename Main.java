import java.io.*; 
import java.util.LinkedList;
public class Main{
	public static void main(String[] args){
		Graph test = new Graph(9);
		DepthFirstSearch Bill = new DepthFirstSearch();
		test.addPath(0,3);
		test.addPath(3,4);
		test.addPath(1,4);
		test.addPath(4,5);
		test.addPath(2,5);
		test.addPath(4,7);
		test.addPath(6,7);
		test.addPath(7,8);
		Bill.dfs(test);
		for(int i = 0; i<Bill.predecessor.length-1; i++){
			System.out.println(i+"-->"+Bill.predecessor[i]);
		}
	}
}

		
		
		