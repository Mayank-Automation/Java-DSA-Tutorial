package inheritance;

public class BoxWeight extends Box {
int weight;
    BoxWeight()
    {
        this.weight=2;
    }

    public BoxWeight(int h, int l, int w, int weight) {
      super(h,l,w);  // Calling the parent class constructor
      this.weight= weight;
    }




}
