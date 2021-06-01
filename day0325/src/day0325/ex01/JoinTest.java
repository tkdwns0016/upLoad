package day0325.ex01;

import java.util.Map;
import java.util.Scanner;

public class JoinTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Join joiner = new Join();
		int cnt = 0;
		
		while(cnt < 5) {
			System.out.println("아이디를 입력하세요");
			String id = sc.next();
			System.out.println("비밀번호를 입력하세요");
			String password = sc.next();
			
			try {
				cnt = joiner.join(id, password);
			} catch (DuplicationIdException e) {
				System.out.println("입력받은 id가 중복되었습니다.");
				System.out.println("다른 아이디를 사용하세요.");
			}
		}
		System.out.println("------입력완료.------");
		
		//안에 들은 데이터 출력하기.
		Map<String, String> users = joiner.getUsers();
		for(String key : users.keySet()) {
			System.out.println("id : "+key+", 비밀번호 : "+users.get(key));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
