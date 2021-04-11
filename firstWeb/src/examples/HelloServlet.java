package examples;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public HelloServlet() {
        super();
    }
    
    // 웹 브라우저가 GET메서드 방식으로 요청을 보낼 떄, 서버에 doGet메서드가 호출 됨
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response라는 객체는 응답할 내용을 모아서 추상화해놓은 객체라고 보면 됨. setContentType은 이 객체에 콘텐츠 타입을 정해주는 것. 그러면, 브라우저는 응답 결과가 html이라는 걸 알 수 있지.
		response.setContentType("text/html;charset=UTF-8");
		// PrintWriter 객체에 보낼 내용을 써주면 돼
		PrintWriter out = response.getWriter();
		out.println("<h1>Hello World</h1>");
	}

}