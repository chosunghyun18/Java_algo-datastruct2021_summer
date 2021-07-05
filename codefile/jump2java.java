import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class followingclass
{
    public static void main(String[] args)
    {   /*  code from jump to java
        */
        int one =2 ;
        String two;

        one = 1;
        System.out.println(one);
        two =  "this  is data struct ";
        String str1 = "aa";
        one++;
        System.out.println(one);
        System.out.println(two.charAt(1));
        System.out.println(str1.length());
        long big = 122112121121212121L;
        System.out.println(big);
        int a = 10 ;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        //// java could join sting and int data type!    % 나머지 연산
        System.out.println("this is what i say"+a%b+"this is what i say");
        ////////////////////////////////////////
        //bool count 2>1 ,1==2, 3%2 ==1, "3".equals("2")
        int base= 180 ;
        int height = 185;
        boolean istall = height > base;
        if (istall)
        {
            System.out.println("this is tall");
        }
        //one word char
        char a1= 'a';
        char a2 = 97; // ascii code
        System.out.println(a1);
        System.out.println(a2);
        //check same string
        String ho = "hello";
        String hoo= "hello" ;
        System.out.println(ho.equals(hoo)); /// check just value
        System.out.println(ho == hoo);   //check same object
            /// string related method
        System.out.println(hoo.substring(0,4)); //범위는 파이썬 같이 읽음 [,,,)
        System.out.println(ho.toUpperCase());   //HELLO
        int[] odds = {1,3,5,77,9};
        String[] weeks1 = {"d", "d" , "d"};  // 배열은 자료형이 아닌 자료의 집합을 의미 한다.
        String[] weeks2 = new String[7];  // array 정
        String[] weeks3 = new String[6];  // array define must input len at first
        weeks3[0] = "mon";
        weeks3[1] = "tue";
        weeks3[2] = "wed";
        for(int i = 0 ; i < weeks3.length;i++)
        { System.out.println(weeks3[i]);
        }
        // Using an Aray list  to make dinamic data type
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("246");
        pitches.add(1,"222");
        pitches.add("98");
        System.out.println(pitches);
        /// array list method : add,size,contains,remove,get
        String pitch1 =" s" ;
        //pitch =pitches.get(1); ::::    Error cause  get return object type,
       pitch1 = (String)pitches.get(1); //change object type into string type to read and load
        System.out.println(pitch1);

        // java Generics  > make to put only definede type (ex,Integer,dog,String)
        ArrayList <String> aList = new ArrayList <String>();
        aList.add("hello wordl");
        aList.add("java");
        String hell = aList.get(0);
        String jav = aList.get(1);    //we don't need type change for get data

        System.out.println(hell);
        ///  Map
        /// map is using key to get value like dictionary in python
        HashMap<String,String> map1 = new HashMap<String,String>();
        map1.put("people","사람");
        map1.put("tail","사람");
        System.out.println(map1);
        map1.put("tail1","람1");
        map1.put("tail1","람2");    //same key and put diiferent value >> update value
        map1.put("tail3","람");
        map1.put("tail3","s");
        map1.put("4","s");
        System.out.println(map1);
        System.out.println(map1.containsKey("tail1")); // chek key exist
        System.out.println(map1.remove("tail1")); // remve key
        System.out.println(map1.size());
        ///////
        // if(조선 식 && A  || B ){}
        // else {}
        /////// swith/case
        int month = 8  ;
        String monthString = " ";
        switch (month)
        {
            case 1: monthString= "January";
                break ;
            case 2: monthString = "nextlevel";
                break;
        }
        int treeHit = 0 ;
        while(treeHit < 10)
        {
            treeHit++;
            System.out.println("oo");
        }
        int num0 = 0 ;
        while(num0 < 10 )
        {
            num0++;
            if(a%2 ==0)
            {
                continue;
            }
            System.out.println(num0);
        }
        /// for normal struct
        String[] numbers = {"one","two","three"};
        for(int i= 0 ; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
        /// for each struct        like a python yeild
        String[] num1 = {"one","two","three"};
        for(String x:num1)
        {
            System.out.println(x);
        }
        Animal cat = new Animal();
        cat.name = "pow";
        System.out.println(cat.name);
    }

}

class Animal
{
    String name;
}

/*
about main method :
    followingclass.java  a b c 실행시 내용들어감 Sting[] args 가 받
* */

/*
*  string method : indexof,replaceAll ,substring
*    int[] method = {1,2,3,4}
*
*
*
* */

/*     bigger than int use long type and put L on last as postfix
        same as float which use F on last
*     long big = 122112121121212121L;
*      float pi = 3.14F;
       double d1 = 123.4;
       double d2 =1.234e2;
* */



/*
* 자바 주석 블록처리
*  main 치고 나서 탭 누르면 자동  쿨래
*  print ln:     sout
*  인덱스 접근 함수로 charAt or indexOf
* use class to make it own datastructure
*
* */

// line 주석   단축키 : /+cmd

class ifcase
{
    int a = 10;
    ArrayList<String> pocket = new ArrayList<>();
     // pocket.add("paaper");
    // add 가 않읽힘 ? > class 상속 예상
}
