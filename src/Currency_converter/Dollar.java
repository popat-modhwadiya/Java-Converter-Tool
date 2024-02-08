package Currency_converter;

class Dollar extends Display{
    Dollar(double amount)
    {
        dollar=amount;
    }
    String display(){
        rupee = dollar * 75;
        pound = dollar * 0.72;
        euro = dollar * 0.88;
        KWD = dollar * 0.30;
        msg="\nRupees : "+rupee+"\nPound : "+pound+"\nEuro : "+euro+"\nKuwaiti dinar : "+KWD;
        return msg;
    }
}
