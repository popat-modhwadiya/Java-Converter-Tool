package Length_converter;

class feet extends Display {

        feet(double langth)
        {
            feet=langth;
        }
        String display(){
            cm = feet * 30.48;
            meter = feet * 0.304;
            inch = feet * 12;
            msg="\ncm : "+cm+"\nmeter : "+meter+"\ninch : "+inch;

            return msg;
        }


}
