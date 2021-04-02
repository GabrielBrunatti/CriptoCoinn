package useCase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pacote.Moedas;


public class useCasePreco {

	private HttpServletRequest request;
	private HttpServletResponse response;
	
	public useCasePreco(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}

	
	public void execute() throws IOException, ServletException {
//		PrintWriter presenter = response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("front.jsp");
		
		try {
			Moedas btc = new Moedas();
			btc.setPreco(58.80000);
			String resposta = String.format("Preco:$%", 
			btc.getPreco());

			
			request.setAttribute("resposta", resposta);  
//			presenter.println(resposta);
			this.guardaNaSessao(resposta);
		} catch (NullPointerException e) {
			request.setAttribute("resposta", "API ERRO EM."); 
//			presenter.println("Um dos valores não foi informado.");
		} catch (NumberFormatException e) {
			request.setAttribute("resposta", "API ERRO EM."); 
//			presenter.println("Um ou mais caractere(s) não são válidos.");
		}
		rd.forward(request, response);
		
	}
	private void guardaNaSessao(String resposta) {
		HttpSession sessao = request.getSession(false);
		if(sessao != null) {
			List<String> listaPreco = (List<String>) sessao.getAttribute("listaPreco");
			if(listaPreco == null) {
				listaPreco = new ArrayList<String>();
			}
			
			listaPreco.add(resposta);
			sessao.setAttribute("listaPreco", listaPreco);
		}
	}
	
}


