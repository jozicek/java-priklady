import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {



  public static void main(String[] args) {

    //object oriented to functional programming paradigm
    //java 8

    //object oriented : vsetko je objekt, vsetok kod je asociovany s nejakym objektom/clasou
    //design cez objekty : podstatne mena, veci, funkcia neexistuje ako samostatny celok


    //functional oriented : funkcie su primarne a samostatne - lambdy nepatria ziadnej classe.

    //neexistuje nic v objektovo orientovanom jazyku co by sa nedalo naprogramovat vo funkcionalnom a naopak

    //why lambda
    // enables functional programming
    // readable / concise and maintainable code
    // parallel processing
    // easier apis and libraries


    //lambda - function - blok kodu treated as value, premenna, parameter..



    //passing behaviour

//    blockOfCode = public void perform(){   // nepotrebuje druhe meno ani public lebo nie je v classe..
//      System.out.println("Hello world");
//    }

    //    blockOfCode =  void (){
//      System.out.println("Hello world"); .. compiler vie return type podla vyrazu
//    }

    //    blockOfCode =   (){
//      System.out.println("Hello world");
//    }

//        blockOfCode =   () -> {
//      System.out.println("Hello world");
//    };


  //      blockOfCode =   () -> System.out.println("Hello world");

    //doubleNumberFunction = (int a) -> a * 2;

    //NAPIS lambdu ktora scita dve cisla
    //NAPIS lambdu ktora vydeli dve cisla ale v pripade ak sa deli nulou vrati 0


    //Stale nevieme datovy typ lambdy.
    //Functional interface

    Operation doubleNumberFunction = (int a) -> a * 2;

    new Main().performOperation(10, doubleNumberFunction);

    new Main().performOperation(10, a -> a * 2); // v tomto kontexte kompilator vie aj navratovy typ lambdy.

    //ukazat aj stary sposob cez implementaciu interfeujsu.

    //ukazat pouzitie s filter a map na streame:

    List<String> mena = Arrays.asList("Jozinko", "Longi", "Leuska", "Adamko", "Zuzka", "Julka", "Tomasko");

    List<String> prefiltrovane = mena.stream().filter(meno -> meno.startsWith("L")).collect(Collectors.toList());

    //optimalizacie a paralelne vypocty.
    List<String> prefiltrovaneAnamapovane = mena.stream().
        map(meno -> meno.toUpperCase()).
        filter(meno -> meno.startsWith("L")).
        collect(Collectors.toList());

    System.out.println(prefiltrovaneAnamapovane);

  }


  //pass behaviour
  public int performOperation(int number, Operation operation){
    return operation.count(number);
  }

  //ULOHA:

  //Vytvorit triedu Kalkulacka, ktora bude mat dve pretazene metody:
  //int spocitaj(operand, unarnaOperacia) a int spocitaj(operand1, operand2, binarnaOperacia) //datovy typy argumentov som schvalne nenapisal

  //kde operand je cislo
  //unarna operacia je napriklad druha mocnina alebo odmocnina, absolutna hodnota .............
  //binarna operacia je plus, minus, deleno ....


  //bonus
  //zoznam cisel [1 .. 10] prefiltrovat iba parne a kazde vynasobit 10 pomocou streamov.

  // ************



}
