package Currency_converter;

class KWD extends Display{
    KWD(double amount)
    {
        KWD=amount;
    }
    String display(){
        rupee = KWD * 250;
        dollar = KWD * 3.30;
        pound = KWD * 2.5;
        euro = KWD * 2.94;
        msg="\nRupees : "+rupee+"\nDollar : "+dollar+"\nPound : "+pound+"\nEuro : "+euro;
        return msg;
    }
}
