package Length_converter;

class Meter extends Display{
    Meter(double langth)
    {
        meter=langth;
    }
    String display(){
        feet = meter * 30.48;
        cm = meter * 0.304;
        inch = meter * 12;
        msg="\nfeet : "+feet+"\ncm : "+cm+"\ninch : "+inch;
        return msg;
    }

}
