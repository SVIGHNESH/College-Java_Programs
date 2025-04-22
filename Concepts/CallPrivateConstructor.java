package Concepts;

class PrivateConstructor{
    private PrivateConstructor(){

    System.out.println("Private Constructor is called. ");
    }
    void Hell(){
        System.out.println("Hellllooooo!!!!");
    }
    static PrivateConstructor getinstance(){
        return new PrivateConstructor();  //here the constructor of the  PrivateConstructor class is return by the getinstance function that itself is static when the obj of the PrivateCOnstructor is returned by the getinstance function a object of the class Private Constructor is made with the help of the new keyword.

    }  
}

class CallPrivateConstructor{
    public static void main(String[] args) {

        PrivateConstructor ob = PrivateConstructor.getinstance();
        ob.Hell();
    }
}
