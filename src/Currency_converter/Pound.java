package Currency_converter;

class Pound extends Display{
    Pound(double amount)
    {
        pound=amount;
    }
    String display(){
        rupee = pound * 101;
        dollar = pound * 1.35;
        euro = pound * 1.36;
        KWD = pound * 0.4;
        msg="\nRupees : "+rupee+"\nDollar : "+dollar+"\nEuro : "+euro+"\nKuwaiti dinar : "+KWD;
        return msg;
    }
}


