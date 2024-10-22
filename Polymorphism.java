class Shape
{
 void draw(){ System.out.println("drawing shape");}
 void erase(){ System.out.println("erasing shape");}
}
 class Circle extends Shape
 {
 void draw(){ System.out.println("drawing circle");}
 void erase(){ System.out.println("erasing circle");}
 }
 class Triangle extends Shape
 {
 void draw(){ System.out.println("drawing triangle");}
 void erase(){ System.out.println("erasing triangle");}
 }
 class Square extends Shape
 {
 void draw(){ System.out.println("drawing square");}
 void erase(){ System.out.println("erasingsquare");}
 }
class Rectangle extends Shape
 {
 void draw(){ System.out.println("drawing rectangle");}
 void erase(){ System.out.println("erasing rectangle");}
 }

 public class Polymorphism
 {
   public static void main(String[]args)
   {
     Shape S = new Shape();
     Shape c = new Circle();
     Shape t = new Triangle();
     Shape s = new Square();
     Shape r = new Rectangle();
     c.draw();
     c.erase();
     t.draw();
     t.erase();
     s.draw();
     s.erase();
     r.draw();
     r.erase();
   }
}
