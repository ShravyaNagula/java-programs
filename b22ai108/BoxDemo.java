class BoxDemo{
double width;
double height
double depth;
}
class BoxDemo{
public static void main(String args[]){
Box b1=new Box();
Box b2=new Box();
double vol1,vol2;

b1.width=10;
b1.height=20;
b1.depth=15;

b2.width=12;
b2.height=20;
b2.depth=18;

vol1=b1.width*b1.height*b1.depth;
vol2=b2.width*b2.height*b2.depth;
system.out.println("Volume of Box1 is :" +vol1);
system.out.println("Volume of Box2 is :" +vol1);
}
}
  

