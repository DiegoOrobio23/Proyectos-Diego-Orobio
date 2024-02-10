package guia1;


public class Calculadora {
    // atributos:
   public float num1,num2,result;
   
   
   //metodos:
public void suma(){
    result=num1+num2;
}   
public double cos(double a){
    return (Math.cos(a));
}
public void resta(){
    result=num1-num2;
}
public void multi(){
    result=num1*num2;
}
public void divi(){
    result=num1/num2;
}
public double seno(double a){
    return Math.sin(a);
}
public double tan(double a){
    return Math.tan(a);
}
public double raizCuadra(double a){
    return Math.sqrt(a);
}
public double poten(double a, double b){
    return Math.pow(a, b);
}
public void iva(){
    result= num1*(1 + num2/100)-num1;
    //Para el iva num1 = valor y num2 es el porcentaje en la calculadora especifico las funciones de la calculadora
}

    
}
