package DecoratorAfter;

public class FrameDecorator implements Frame {
    Frame decoratedFrame;
    public FrameDecorator(Frame wrappee) {
    decoratedFrame = wrappee;}
    public void render() {
    decoratedFrame.render();}}