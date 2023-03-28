package DecoratorAfter;

public class ScalingFrameDecorator extends FrameDecorator {
    private double scaleFactor = 1;

    public ScalingFrameDecorator(Frame wrappee, double scaleFactor) {
    super(wrappee);
    this.scaleFactor = scaleFactor;}

    public void render() {
    super.render();

    System.out.println(String.format("Imagine making the frame %.1f times bigger!", scaleFactor));}

    public void scale(double factor) {
        scaleFactor = factor;
    }

}
