package board;
import java.util.Scanner;
import java.util.ArrayList;

public class board {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList board = new ArrayList();
		
		
		while(true) {
			
			String cmd = scan.nextLine();
			System.out.println("명령어를 입력해주세요. :" + "[" + cmd + "]");
		
			if(cmd.equals("exit")) {
				break;
				}
		
			if(cmd.equals("add")) {
				System.out.println("게시물 제목을 입력해주세요 : ");
				String cmd제목 = scan.nextLine();
				System.out.println("게시물 내용을 입력해주세요 : ");
				String cmd내용 = scan.nextLine();
				System.out.println("게시물이 등록되었습니다.");
				
				게시판 게시물1 = 게시판(cmd제목, cmd내용);
				a게시판.게시물add(게시물1);
			}
			
		}
		
		
		
		System.out.println("시스템을 종료합니다.");
		scan.close();		
	}

}

class 게시판 {
	게시판[] 게시물 = new 게시판[10];
	void 게시물add() {
		
	}
}
