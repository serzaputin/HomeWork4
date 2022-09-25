public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int a=100000000;
        System.out.println(a);
        byte b=120;
        System.out.println(b);
        short c=-11000;
        System.out.println(c);
        long d=123000000000L;
        System.out.println(d);
        float e=1000;
        System.out.println(e);
        double f=120000000;
        System.out.println(f);

        System.out.println("Задача 2");
        float w=27.12f;
        System.out.println(w);
        long q=987678965549L;
        System.out.println(q);
        byte g=2;
        System.out.println(g);
        short v=786;
        System.out.println(v);
        boolean n=false;
        System.out.println(n);
        short x=569;
        System.out.println(x);
        short o=-159;
        System.out.println(o);
        int t=27897;
        System.out.println(t);
        byte y=67;
        System.out.println(y);

        System.out.println("Задача 3");
        int ticherOne=23;
        System.out.println("У Людмилы Павловны  "+ticherOne+" ученика");
        byte ticherTwo=27;
        System.out.println("У Анны Сергеевны "+ticherTwo+" учеников");
        short ticherThree=30;
        System.out.println("У Екатерины Андреевны "+ticherThree+" учеников");
        System.out.println("Всего "+(ticherOne+ticherTwo+ticherThree)+" учеников");
        long paper=480;
        System.out.println("На каждого ученика расчитано "+(paper/(ticherOne+ticherTwo+ticherThree))+" листов бумаги");

        System.out.println("Задача 4");
        int bottle=16;
        int time=2;
        System.out.println("За "+time+" минуты машина производит "+bottle+" бутылок");
        byte time1=20;
        short tame2=1440;
        int time3=4320;
        long taim4=43200;
        System.out.println("За "+time1+" минут машина произвела "+(bottle*time1)+" бутылок");
        System.out.println("За "+tame2+" минут машина произвела "+(bottle*tame2)+" бутылок");
        System.out.println("За "+time3+" минут машина произвела "+(time3*bottle)+" бутылок");
        System.out.println("За "+taim4+" минут машина произвела "+(taim4*bottle)+" бутылок");

        System.out.println("Задача 5");
        int canPaint=120;
        byte whitePaint=2;
        short brownPaint=4;
        System.out.println("В школе всего "+canPaint/(whitePaint+brownPaint)+" классов");
        System.out.println("Белой краски "+canPaint/(whitePaint+brownPaint)*whitePaint+" банок");
        System.out.println("Коричневой краски "+canPaint/(whitePaint+brownPaint)*brownPaint+" банок");
        System.out.println( "В школе, где "+canPaint/(whitePaint+brownPaint)+" классов, нужно "+(canPaint/(whitePaint+brownPaint)*whitePaint)+" банок белой краски и "+(canPaint/(whitePaint+brownPaint)*brownPaint)+" банок коричневой краски");

        System.out.println("задача 6");
        short bananas=80*5;
        short milk=105*2;
        short iceCream=100*2;
        short egg=70*4;
        System.out.println("В спорт-завтраке "+(bananas+milk+iceCream+egg)+" грамм");
        System.out.println("В спорт-завтраке "+(bananas+milk+iceCream+egg)*0.001+" кг");

        System.out.println("задача 7");
        short loseWeight=7000;
        short weightOne=250;
        short weightTwo=500;
        System.out.println("Если спортсмен будет терять по "+weightOne+" грамм, то понадобится "+loseWeight/weightOne+" дней");
        System.out.println("Если спортсмен будет терять по "+weightTwo+" грамм, то понадобится "+loseWeight/weightTwo+" дней");
        System.out.println("Потребуется в среднем "+(loseWeight/weightOne-loseWeight/weightTwo)%loseWeight+" дней");

        System.out.println("задача 8");
        int masha=67760;
        System.out.println(masha+677.6-masha);
        int denis=83690;
        System.out.println(denis+836.9-denis);
        int kristina=76230;
        System.out.println(kristina+762.3-kristina);
        System.out.println(masha+677.6);
        System.out.println(denis+836.9);
        System.out.println(kristina+762.3);
        System.out.println("Маша теперь получает "+(masha+677.6)+" рублей, годовой доход вырос на "+(masha+677.6-masha)+" рублей");
        System.out.println("Денис теперь получает "+(denis+836.9)+" рублей, годовой доход вырос на "+(denis+836.9-denis)+" рублей");
        System.out.println("Кристина теперь получает "+(kristina+762.3)+" рублей, годовой доход вырос на "+(kristina+762.3-kristina)+" рублей");
    }
}