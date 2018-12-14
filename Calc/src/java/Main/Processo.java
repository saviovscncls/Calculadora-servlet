/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aluno
 */
@WebServlet(name = "Processo", urlPatterns = {"/Processo"})
public class Processo extends HttpServlet {

    double resul = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/Principal.jsp").forward(request, response);

        String valor1 = request.getParameter("valor1");
        String valor2 = request.getParameter("valor2");
        String operacao = request.getParameter("operacao");

        double vl1 = Double.parseDouble(valor1);
        double vl2 = Double.parseDouble(valor2);

        if (valor1 != null || valor2 != null) {

            if (operacao.equals("Somar")) {
                request.setAttribute("resul", soma(vl1,vl2));
            }
            if (operacao.equals("Subtrair")) {
                request.setAttribute("resul", subtrair(vl1,vl2));
            }
            if (operacao.equals("Dividir")) {
                request.setAttribute("resul", dividir(vl1,vl2));
            }
            if (operacao.equals("Multiplicar")) {
               request.setAttribute("resul", multiplicar(vl1,vl2));
            }
        }
    }

    private double soma(double vl1, double vl2) {
        resul = vl1 + vl2;
        return resul;
    }

    private double subtrair(double vl1, double vl2) {
        resul = vl1 - vl2;
        return resul;
    }

    private double multiplicar(double vl1, double vl2) {
        resul = vl1 * vl2;
        return resul;
    }

    private double dividir(double vl1, double vl2) {
        resul = vl1 / vl2;
        return (float) resul;
        
    }

}
