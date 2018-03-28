package DecoratorPattern.example.Decorator;

import DecoratorPattern.example.Component;

/**
 * 具体装饰类：滚动条装饰类
 */
public class ScrollBarDecorator extends ComponentDecorator{

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    //为构建添加滚动条
    public void setScrollBar(){
        System.out.println("为构件添加滚动条");
    }
}
