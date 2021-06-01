package day0331.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectTest {
		public static void main(String[] args) {
			//디비 접속 테스트
			//디비에 접속하기 위한 Driver 클래스를 로드
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				//mysql에 접속하기 위한 id
				String id = "root";
				//mysql에 접속하기 위한 password
				String password = "mysql";
				
				//mysql 에 접속하기 위한 url 셋팅
				//프로토콜//아이피주소:포트번호/데이타베이스이름?파라미터
				String url = "jdbc:mysql://localhost:3306/sakila?"
						+"characterEncoding=utf-8&serverTimezone=Asia/Seoul";
				
				//디비 접속할 정보를 다 만들었으니 
				//디비에 연결시켜 주는 커넥터 객체를 받는다.
				//접속이 되면 connection 객체를 반환 받는다.!
				Connection conn = DriverManager.getConnection(url, id, password);
				
				System.out.println("커넥션 객체 : "+conn);
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
}