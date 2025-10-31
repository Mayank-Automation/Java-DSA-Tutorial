package inheritance;

public class BoxPrice extends BoxWeight{

    int price;

    static void main() {

    }
    BoxPrice(){
        super();
        this.price=100;
        System.out.println(this.weight);
    }

    public BoxPrice(int h, int l, int w, int weight, int price)
    {
        super(h, l, w, weight);
        this.price=price;
    }
}
