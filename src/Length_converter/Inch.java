package Length_converter;

class Inch extends Display {
    Inch(double langth)
    {
        inch=langth;
    }
    String display(){
        feet = inch * 30.48;
        cm = inch * 0.304;
        meter = inch * 12;
        msg="\nfeet : "+feet+"\ncm : "+cm+"\nmeter : "+meter;

        return msg;
    }
}
