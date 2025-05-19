class Box{
	double height ;
	double width;
	double length;
}
class BoxDemo{
	public static void main(String []args){
		Box box1 = new Box();
		box1.length = 10;
		box1.width = 10;
		box1.height = 10;

		double volume;

		volume = box1.length * box1.width * box1.height;
		System.out.println("The Volume of the given BOx is");
		System.out.println("The Volume of the given BOx is " + volume);
	}
}
