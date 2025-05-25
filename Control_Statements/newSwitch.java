package Control_Statements;
class InnernewSwitch {

    void show(){
        System.out.println("SJflkajf;a");
    }
    
}

public class newSwitch {
    public static  void main(String []args){
        InnernewSwitch INS = new InnernewSwitch();
        System.out.println(INS);
        int n  = 3;
        switch(n){
            case 1 -> System.out.println("YEss");
            case 2 -> System.out.println("Nooo");
            default -> System.out.println("Very NOO");
        }
    }
}

