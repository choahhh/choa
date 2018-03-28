package DecoratorPattern.example.Decorator;

import DecoratorPattern.example.Component;

/**
 * 具体装饰类：黑色边框装饰类
 */
public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        setBlackBorder();
        super.display();
    }
    //额外的方法
    public void setBlackBorder(){
        System.out.println("为构件添加黑色边框");
    }
}
