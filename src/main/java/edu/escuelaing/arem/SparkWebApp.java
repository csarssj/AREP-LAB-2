package edu.escuelaing.arem;

import static spark.Spark.*;

import edu.escuelaing.arem.calculator.Calculator;
import edu.escuelaing.arem.linkedList.LinkedList;
import spark.Request;
import spark.Response;
/**
 * Hello world!
 *
 */
public class SparkWebApp
{
    public static void main(String[] args) {
        port(getPort());
        //Reader r = new Reader();
        //r.fileReader(new File("numeros.txt"));
        get("/hello", (req, res) -> "Hello Heroku");
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }
    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>HTML Forms</h2>"
                + "<form action=\"/results\">"
                + "  First name:<br>"
                + "  <input type=\"text\" name=\"numeros\" value=\"Mickey\">"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/results\".</p>"
                + "</body>"
                + "</html>";
        return pageContent;
    }
    private static String resultsPage(Request req, Response res) {
        LinkedList numbers = new LinkedList();
        Calculator cal = new Calculator();
        String[] par = req.queryParams("numeros").split(",");
        for(String n : par){numbers.append(new Double(n));}
        Double mean = cal.mean(numbers);
        Double des = cal.desviationStandar(numbers);
        return "El calculo de la medía es: " +
                mean +" Y el calculo de la desviación es: "+ des;
    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhot)
    }
}
