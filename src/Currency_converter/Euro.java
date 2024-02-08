package Currency_converter;

class Euro extends Display{
    Euro(double amount)
    {
        euro=amount;
    }
    String display(){
        rupee = euro * 84;
        dollar = euro * 1.12;
        pound = euro * 0.73;
        KWD = euro * 0.34;
        msg="\nRupees : "+rupee+"\nDollar : "+dollar+"\nPound : "+pound+"\nKuwaiti dinar : "+KWD;
        return msg;
    }
}
