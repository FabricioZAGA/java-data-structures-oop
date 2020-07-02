using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SistemaConversion
{
    class Program
    {
        public static int Cifra { get; set; }
        public static string Binario { get; set; }
        static void Main(string[] args)
        {
            Cifra = 128;
            GenerarConversion();
            Console.WriteLine(Binario);
            Console.ReadKey();
        }
        public static void GenerarConversion()
        {
            int cosciente = 0;
            int residuo = 0;
            Binario = "";
            while (Cifra != 0)
            {
                
                cosciente = Cifra / 2;
                residuo = Cifra % 2;
                Binario = residuo + Binario;
                Cifra = cosciente;
            }
        }
    }
}
