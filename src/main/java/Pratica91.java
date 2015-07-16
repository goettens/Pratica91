
import java.io.IOException;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica91 {
    public static void main(String[] args) throws InterruptedException, IOException {
        Runtime runTime = Runtime.getRuntime();
        int divisor = 1048576; //1024*1024
        String os = System.getProperty("os.name");
        System.out.println("Ambiente de execução: " + os);
        System.out.println("Nº de processadores: " + runTime.availableProcessors());
        System.out.println("Memória total em MB: " + runTime.totalMemory()/divisor);
        System.out.println("Memória livre em MB: " + runTime.freeMemory() /divisor);
        System.out.println("Memória máxima VirtualMachine em MB: " + runTime.maxMemory() /divisor);
    }
}
