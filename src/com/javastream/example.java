package com.javastream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class example {
    public static void main(String[] args) {

        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date");
        boolean containsDate = myList.stream().anyMatch("date"::equals);//anyMatch() yöntemi, myList listesinde "date" öğesi var mı yok mu kontrol eder ve sonucu containsDate değişkeninde saklar.anyMatch(boolean donuyor)
        boolean noOranges = myList.stream().noneMatch("orange"::equals);//Bu örnekte, noneMatch() yöntemi, bir Predicate nesnesi ile eşleşen hiçbir öğe yoksa true değerini döndürür.

        List<Integer> myList1 = Arrays.asList(1, 2, 3, 4, 5);
        int sum1 = myList1.stream().reduce(0, Integer::sum); //reduce() yöntemi, numbers listesi üzerindeki tüm öğelerin toplamını hesaplamak için kullanılır. 0 başlangıç değeri olarak belirlenir ve Integer::sum yöntemi, her öğe üzerinde toplama işlemi yapar.
        int max1 = myList1.stream().reduce(0, Integer::max); //reduce() yöntemi, numbers listesi üzerindeki tüm öğeler arasındaki en büyük sayıyı bulmak için kullanılır. 0 başlangıç değeri olarak belirlenir ve Integer::max yöntemi, her öğe üzerinde en büyük sayıyı bulmak için karşılaştırma işlemi yapar

        List<Integer> tek = myList1.stream().filter(t->t%2==1).toList();//tekleri bulduk

        String text = "Bu örnekte stream API kullanarak metin içerisindeki kelimeleri ayırıyoruz";

        List<String> words = Arrays.stream(text.split(" ")).toList();

        int sumOfSquares = myList1.stream().map(n -> n * n).reduce(0, Integer::sum); //Bir listedeki sayıların karelerinin toplamını hesaplamak için
        int sumOfSquaresOfOdds = myList1.stream().filter(n -> n % 2 != 0).map(n -> n * n).reduce(0, Integer::sum); //teklerin karelerinin toplamı için

        int carpim = myList1.stream().reduce(1, (a, b) -> a * b);

//map ve reduce, Stream API'nin iki temel işlevinden ikisidir. map işlevi, bir Stream'deki her öğeyi başka bir değere dönüştürmek için kullanılırken, reduce işlevi, Stream'deki öğeleri tek bir sonuca dönüştürmek için kullanılır.
//map işlevi bir Function aracılığıyla bir Stream'in her öğesini başka bir değere dönüştürür. Yani, her öğe bir işlemden geçirilir ve işlemden geçirildikten sonra oluşan yeni değerler, yeni bir Stream oluşturmak için kullanılır.
//reduce işlevi, bir Stream'in öğelerini tek bir sonuca dönüştürmek için kullanılır. Bir BinaryOperator aracılığıyla iki öğeyi birleştirir ve bu birleşik sonucu bir sonraki öğeyle birleştirir, bu işlem Stream'in sonuna kadar devam eder ve sonuç olarak tek bir değer üretir.
    }


}
