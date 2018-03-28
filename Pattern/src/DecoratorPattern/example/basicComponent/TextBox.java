package DecoratorPattern.example.basicComponent;

import DecoratorPattern.example.Component;

/**
 * 文本框构建类
 */
public class TextBox extends Component{
    @Override
    public void display() {
        System.out.println("显示文本框");
    }
}
