using exemplo_fundamentos.Modles;

Calculaora calc = new Calculaora();


calc.Somar(5,7);
calc.Dividir(5,7);
calc.Multiplicar(5,7);
calc.Subtrair(5,7);
calc.Potencia(3,3);
calc.Coseno(150);
calc.Seno(150);
calc.Tan(150);
calc.RaizQuadrada(3);




//ordem de execução e prioridade de atribuição



/*
//casting de um tipo que suporta mais dados é um casting
// implicto e não precisa de nenhum comando

int a = 5;
double b = a;

System.Console.WriteLine(b);


int a = Convert.ToInt32("5");

int b = int.Parse("7");

System.Console.WriteLine(a);
System.Console.WriteLine(b);



int a = 150;
int b = 20;

int c = a+b ;

c = c+5;

c +=5;
c -= 5;
c *= 5;

System.Console.WriteLine(c);

DateTime dataAtual = DateTime.Now.AddYears(25);
System.Console.WriteLine(dataAtual);

Pessoa pessoa1 = new Pessoa();

pessoa1.Nome = "Pedro";
pessoa1.idade = 26;
pessoa1.Apresentar();
*/