package inheritance;

public class BoxMain {

    static void main() {

        Box box = new Box(4);
        Box box2 = new Box(box);
        Box box3 = new Box();
        System.out.println(box.h+" "+ box.l+" "+ box.w);
        System.out.println(box2.h+" "+ box2.l+" "+ box2.w);
        System.out.println(box3.h+" "+ box3.l+" "+ box3.w);

        BoxPrice box4= new BoxPrice();
        System.out.println(box4.weight+" "+box4.l+" "+box4.h+" "+ box4.w);
    }
}
