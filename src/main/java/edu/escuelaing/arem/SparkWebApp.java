package edu.escuelaing.arem;

import static spark.Spark.*;

import edu.escuelaing.arem.calculator.Calculator;
import edu.escuelaing.arem.linkedList.LinkedList;
import spark.Request;
import spark.Response;
/**
 * Clase principal donde se inicia la aplicación web construida con spark
 * 
 * @author ceseg
 */
public class SparkWebApp
{
    /**
     * Metodo principal que usa sparkWeb y funciones lampda para mapear las vistas
     * dentro de la app
     * @param args
     */
    public static void main(String[] args) {
        port(getPort());
        get("/hello", (req, res) -> "Hello Heroku");
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }

    /**
     * Pagina de inicio donde se ingresan los datos ha calcular
     * @param req Tiene la informacion de la petición.
     * @param res Tiene la información con la respuesta del servidor.
     * @return String que contiene el codigo generado del HTML
     */
    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "<style>"
                + "body {text-align: center; font-family: \"new century schoolbook\";}"
                + "h2 {text-align: center;}"
                + "h4 {text-align: center;}"
                + "p {text-align: center;}"
                + "div {text-align: center;}"
                + "form { inline-block;}"
                + "</style>"
                + "</head>"
                +"<title>Calculator</title>"
                + "<body style=\"background-color:powderblue;\">"
                + "<h2 text-aling =\"center\">Calculadora de medía y desviación estandar</h2>"
                + "<h4 text-aling =\"center\">Ingresar una lista de numeros: [1,2,3,4,5] </h4>"
                + "<form action=\"/results\">"
                + "  Ingresa Numeros:<br>"
                + "  <input type=\"text\" name=\"numeros\" value=\"\">"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    /**
     * Pagina que da el resultado de los calculos
     * @param req Tiene la informacion de la petición.
     * @param res Tiene la información con la respuesta del servidor.
     * @return String que contiene el codigo generado del HTML
     */
    private static String resultsPage(Request req, Response res) {
        LinkedList numbers = new LinkedList();
        Calculator cal = new Calculator();
        String[] par = req.queryParams("numeros").split(",");
        for(String n : par){numbers.append(new Double(n));}
        Double mean = cal.mean(numbers);
        Double des = cal.desviationStandar(numbers);
        return "<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "<style>"
                + "body {text-align: center;"
                + " font-family: \"new century schoolbook\";}"
                + "h2 {text-align: center;}"
                + "p {text-align: center;}"
                + "a {text-align: center;}"
                + "div {text-align: center;}"
                + "form action {text-align: center;}"
                + "</style>"
                + "</head>"
                +"<title>Calculator</title>"
                + "<body style=\"background-color:powderblue;\">"
                + "<h2 text-aling =\"center\">El resultado de  medía y desviación estandar</h2>"
                + "<p>El calculo de la medía es: " +mean+ "</p>"
                + "<p>El calculo de la desviación es: "+des+ "</p>"
                + "<br>"
                + "<p><a href=\"/inputdata\"> Para volver haz clic acá</a></p>"
                + "</body>"
                + "</html>";
    }

    /**
     *
     * @return el puerto sobre cual se desplegará la app
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhot)
    }
}
