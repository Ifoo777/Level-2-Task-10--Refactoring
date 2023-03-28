package DecoratorAfter;

public class Main{


public static void main(String[] args) {
    System.out.println("The basic frame");

    Frame var1 = new BasicFrame();
    var1.render();
    System.out.println("");

    FrameDecorator scrollFrame = new ScrollingFrameDecorator(var1, 2);
    scrollFrame.render();

    System.out.println("");
    FrameDecorator scaleFrame = new ScalingFrameDecorator(scrollFrame, 7.0);
    scaleFrame.render();

}
}

