package factory.simpleF;

public class PhoneFactory {

    public Phone phoneMake(String phoneName){
        if(phoneName.equals("MiPhone")){
            return new MiPhone();
        }else if(phoneName.equals("ApplePhone")){
            return new ApplePhone();
        }
        return null;
    }

}
