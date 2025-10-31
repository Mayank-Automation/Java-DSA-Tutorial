package inheritance;

public class Box {

    int h;
    int l;
    int w;

    Box()
    {
        this.h=-1;
        this.l=-1;
        this.w=-1;

    }

    Box(int side)
    {
        this.h=side;
        this.l=side;
        this.w=side;

    }

    Box(Box old)
    {
        this.h= old.h;
        this.l=old.l;
        this.w=old.w;
    }

    Box(int h, int l, int w)
    {
        this.h=h;
        this.l=l;
        this.w=w;
    }
}
