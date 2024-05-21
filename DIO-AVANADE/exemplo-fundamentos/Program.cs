using System.Reflection;
using exemplo_fundamentos.Modles;

string opcao;
bool exibirMenu = true;

while(true){
    System.Console.Clear();
    System.Console.WriteLine("Digite sua opção: ");
    System.Console.WriteLine("1- Cadastrar Cliente: ");
    System.Console.WriteLine("2- Buscar Cliente: ");
    System.Console.WriteLine("3- Apagar o CLiente:");
    System.Console.WriteLine("4- Encerrar");
    System.Console.WriteLine("Digite sua opção:");

    opcao = Console.ReadLine();

    switch(opcao){
        case "1":
            System.Console.WriteLine("Cadastro de cliente");
            break;
        case "2":
            System.Console.WriteLine("Busca Cliente");
            break;
        case "3":
            System.Console.WriteLine("Apagar Cliente");
            break;
        case "4":
            System.Console.WriteLine("Encerrar");
            //Environment.Exit(0);
            exibirMenu = false;
            break;
            default:
            System.Console.WriteLine("DE UM A QUATRO");
            break;
    }


}




















/*

int numero, soma = 0;

do
{
    System.Console.WriteLine("Digite um Número(0 para parar)");
    numero = Convert.ToInt32(Console.ReadLine());



    soma += numero;

    
}while(numero !=0);


System.Console.WriteLine($"Total de numero digitados é: {soma}");






int numero = 10;
int rep=50;

for (int i=1;i <=rep;i++){
    System.Console.WriteLine($"{numero} x {i} = {numero*i}");

}

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