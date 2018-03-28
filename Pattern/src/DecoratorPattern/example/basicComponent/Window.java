package DecoratorPattern.example.basicComponent;

import DecoratorPattern.example.Component;

/**
 * window构建类
 */
public class Window extends Component{
    @Override
    public void display() {
        System.out.println("显示窗体");
    }
}
