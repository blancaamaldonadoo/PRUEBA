/* Escribe un programa que defina variables que representen el número de días de un año,
el número de horas que tiene un día, el número de minutos que tiene una hora y el número de segundos que
tiene un minuto.
Emplear las variables que ocupen el mínimo de espacio de memoria posible. A continuación,
calcular el número de segundos que tiene un año y almacenar el valor del cálculo en otra variable.
Realizar preferiblemente mediante una función que reciba como parámetros el número de años, meses y días
y devuelva el número de segundos, días, meses y años introducidos. */

public class ejercicio1{

public static void main (String[] args){

int dias_ano= 365;
int horas_dia=24;
int segundos_minuto=60;

int segundos_ano= dias_ano*horas_dia*60*segundos_minuto;

int fun(int a,int m,int d){

int seg, dias,meses,anos;

anos=a;
meses=m;
dias= d;
seg= a*m*d*60*60;

int array[]=new int[4]
array[0]=anos;
array[1]=meses;
array[2]=dias;
array[3]=seg;

return (array[]);
}
}
}