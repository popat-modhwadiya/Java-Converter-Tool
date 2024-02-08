package Currency_converter;

class Rupees extends Display{
    Rupees(double amount)
    {
        rupee=amount;
    }
    String display(){
        dollar = rupee / 75;
        pound = rupee / 101;
        euro = rupee / 84;
        KWD = rupee / 250;
        msg="\nDollar : "+dollar+"\nPound : "+pound+"\nEuro : "+euro+"\nKuwaiti dinar : "+KWD;
        return msg;
    }
}
