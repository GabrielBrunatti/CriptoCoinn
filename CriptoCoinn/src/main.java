
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pacote.Moedas;

/**
 * Servlet implementation class main
 */
@WebServlet(name ="/main" , urlPatterns= {"/info"})
public class main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		Moedas btc = new Moedas();
		btc.setName("Bitcoin");
		btc.setPreco(58.800);
		String str="1099821583466";
		BigInteger bigIntegerStr=new BigInteger(str);
		btc.setMarket_cap((bigIntegerStr));
		String str2="53838985160";
		BigInteger bigIntegerStr2=new BigInteger(str2);
		btc.setVolume((bigIntegerStr2));
		btc.setSymbol("BTC");
		
		PrintWriter resposta= response.getWriter();
		resposta.println("preco " + btc.getPreco());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
