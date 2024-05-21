using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace exemplo_fundamentos.Modles
{
    public class Calculaora
    {
        public void Somar(int x, int y ){
            Console.WriteLine($"{x} + {y} = {x+y}");
        }

        public void Subtrair(int x, int y){
            Console.WriteLine($"{x} - {y} = {x-y}");
        }

        public void Multiplicar(double x, double y){
            Console.WriteLine($"{x}x{y} = {x*y}");
        }

        
        public void Dividir(double x, double y){
            Console.WriteLine($"{x}/{y} = {x/y}");
        }
         public void Potencia(double x, double y){
            double pot = Math.Pow(x,y);
            Console.WriteLine($"{x}^{y} = {pot}");
        }

        public void Seno(double angulo){
            double radiano = angulo * Math.PI/180;
            double seno = Math.Sin(radiano);
            Console.WriteLine($"Seno de {angulo}º = {seno}");
        }
        public void Coseno(double angulo){
            double radiano = angulo * Math.PI/180;
            double cos = Math.Cos(radiano);
            Console.WriteLine($"Seno de {angulo}º = {cos}");
        }
        public void Tan(double angulo){
            double radiano = angulo * Math.PI/180;
            double tan = Math.Tan(radiano);
            Console.WriteLine($"Seno de {angulo}º = {tan}");
        }
            public void RaizQuadrada(double x){
            double raiz = Math.Sqrt(x);
            Console.WriteLine($"Raiz quadrada de {x} = {raiz}");
        }

    }
}