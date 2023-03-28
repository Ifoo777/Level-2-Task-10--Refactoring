package DecoratorAfter;

public class ScrollingFrameDecorator extends FrameDecorator{
    private int numScrollBars = 1;

    public ScrollingFrameDecorator(Frame wrappee, int numScrollBars) {
    super(wrappee);
    this.numScrollBars = numScrollBars;}

    public void render() {
        super.render();
    System.out.println(String.format("Imagine adding %d scroll bars to the frame!", numScrollBars));}
    
    public void addScrollBar() {
        
        numScrollBars++;}}