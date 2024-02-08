package Length_converter;

class Cm extends Display {
    Cm(double langth)
    {
        cm=langth;
    }
    String display(){
        feet = cm * 0.0328;
        meter = cm * 0.01;
        inch = cm * 0.3937;
        msg="\nfeet : "+feet+"\nmeter : "+meter+"\ninch : "+inch;
        return msg;
    }
}
