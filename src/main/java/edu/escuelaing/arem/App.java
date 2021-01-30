package edu.escuelaing.arem;
import edu.escuelaing.arem.calculator.Reader;

import java.io.File;

import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App 
{
        public static void main(String[] args) {
            port(getPort());
            Reader r = new Reader();
            r.fileReader(new File("numeros.txt"));
            get("/hello", (req, res) -> "Hello Heroku");
        }
        static int getPort() {
            if (System.getenv("PORT") != null) {
                return Integer.parseInt(System.getenv("PORT"));
            }
            return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
        }
}
