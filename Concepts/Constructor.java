class Constructor{
    int x,y;
    Constructor(){
        x = 10;
        System.out.println("Constructor is Called.");

    }
    {
        System.out.println("Instance Intilizer Is Invoked.");
    }
    public static void main(String []args){
        Constructor ob = new Constructor();
        System.out.println(ob.x);
        System.out.println(ob.y);

    }
}