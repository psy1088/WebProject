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
    
    // �� �������� GET�޼��� ������� ��û�� ���� ��, ������ doGet�޼��尡 ȣ�� ��
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response��� ��ü�� ������ ������ ��Ƽ� �߻�ȭ�س��� ��ü��� ���� ��. setContentType�� �� ��ü�� ������ Ÿ���� �����ִ� ��. �׷���, �������� ���� ����� html�̶�� �� �� �� ����.
		response.setContentType("text/html;charset=UTF-8");
		// PrintWriter ��ü�� ���� ������ ���ָ� ��
		PrintWriter out = response.getWriter();
		out.println("<h1>Hello World</h1>");
	}

}