package NumComplejo;
/**
 * Programa que opera con numeros complejos.
 *
 * @author Julian Perez Ortiz - 1ºDAW
 * @version 29.05.2019
 */
public class NumComplejo {
  private double pReal;
  private double pImaginaria;

  /**
   * Constructor vacio por defecto.
   */
  public NumComplejo(){

  }

  /**
   * Constructor de NumComplejo.
   * @param pReal posicionReal.
   * @param pImaginaria posicionImaginario.
   */
  public NumComplejo(double pReal, double pImaginaria){
    this.pReal=pReal;
    this.pImaginaria=pImaginaria;
  }

  /**
   * Getter de posicionReal.
   * @return pReal Devuelve posicion real.
   */
  public double getpReal() {
    return pReal;
  }

  /**
   * Setter de posicionReal
   * @param pReal Devuelve la posicion real.
   */
  public void setpReal(double pReal) {
    this.pReal = pReal;
  }

  /**
   * Getter de posicionImaginaria
   * @return pImaginaria Marca un valor a posicion Imaginaria.
   */
  public double getpImaginaria() {
    return pImaginaria;
  }

  /**
   * Setter de posicionImaginaria
   * @param pImaginaria Devuelve posicion imaginaria.
   */
  public void setpImaginaria(double pImaginaria) {
    this.pImaginaria = pImaginaria;
  }

  /**
   * Funcion en la que suma dos numero complejos que recibe como parametro, c1 y c2.
   * @param c1 Numero 1
   * @param c2 Numero 2
   * @return result, resultado de la operacion.
   */
  public static NumComplejo sumarComplejos (NumComplejo c1, NumComplejo c2){
    NumComplejo result = new NumComplejo();

    result.setpReal(c1.getpReal()+c2.getpReal());
    result.setpImaginaria(c1.getpImaginaria()+c2.getpImaginaria());

    return result;
  }

  /**
   * Funcion que resta dos numeros comlejos que recibe como parametos.
   * @param c1 Numero 1
   * @param c2 Numero 2
   * @return result resultado de la operacion de resta.
   */
  public static NumComplejo restarComplejos (NumComplejo c1, NumComplejo c2){
    NumComplejo result = new NumComplejo();

    result.setpReal(c1.getpReal()-c2.getpReal());
    result.setpImaginaria(c1.getpImaginaria()-c2.getpImaginaria());

    return result;
  }

  /**
   * Funcion que multiplica dos numeros que recibe como parametro.
   * @param c1 Numero 1
   * @param c2 Numero 2
   * @return result resultado de la operacion.
   */
  public static NumComplejo multiplicarComplejos (NumComplejo c1, NumComplejo c2){
    NumComplejo result = new NumComplejo();

    double a=c1.getpReal();
    double b=c1.getpImaginaria();
    double c=c2.getpReal();
    double d=c2.getpImaginaria();

    result.setpReal((a*c)-(b*d));
    result.setpImaginaria((a*d)+(b*c));

    return result;
  }

  /**
   * Funcion que divide dos numeros que recibe por parametro.
   * @param c1 Numero 1
   * @param c2 Numero 2
   * @return result resultado de la operacion.
   */
  public  static NumComplejo dividirComplejos (NumComplejo c1, NumComplejo c2){
    NumComplejo result = new NumComplejo();

    double a=c1.getpReal();
    double b=c1.getpImaginaria();
    double c=c2.getpReal();
    double d=c2.getpImaginaria();

    double dividendoReal = (a*c)+(b*d);
    double dividendoImaginario = (b*c)-(a*d);
    double divisor = (Math.pow(c, 2)+Math.pow(d, 2));

    result.setpReal(dividendoReal/divisor);
    result.setpImaginaria(dividendoImaginario/divisor);

    return result;
  }

  /**
   * Funcion modulo que primero realiza la suma de la base elevada al exponente de la pReal y pImaginaria y  retorna la raíz cuadrada.
   * @param numComplejo Recibe objeto numComplejo.
   * @return Math.sqrt(Math.pow(real, 2)+Math.pow(imaginaria, 2))
   */
  public static double modulo (NumComplejo numComplejo){
    double real =  numComplejo.getpReal();
    double imaginaria = numComplejo.getpImaginaria();

    return Math.sqrt(Math.pow(real, 2)+Math.pow(imaginaria, 2));
  }

  /**
   * toString para mostrar por pantalla la pReal y pImaginaria.
   * @return mostrar
   */
  @Override
  public String toString(){

    String mostrar="";
    if (pReal!=0){
      mostrar+=pReal;
    }
    if (pImaginaria>=0){
      mostrar=mostrar+"+"+pImaginaria+"i";
    }else {
      mostrar=mostrar+"-"+(pImaginaria*(-1))+"i";
    }
    return mostrar;
  }
}
