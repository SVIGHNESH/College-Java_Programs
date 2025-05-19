enum Process{
    Ready,Running,Waiting,Terminated;
}
public class EnumSwitch {
    public static void main(String[] args) {
        Process s = Process.Terminated;
        switch (s) {
            case Ready:
                System.out.println("The Process is in the Ready State"); 
                break;
            case Running:
            System.out.println("The Process is in the Running State");
            break;

            case Waiting:
            System.out.println("The Process is in the Waiting State");
            break;

            default:
                System.out.println("The Process has been Terminated");
                break;
        }
    }
}
