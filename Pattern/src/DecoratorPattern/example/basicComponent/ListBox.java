package DecoratorPattern.example.basicComponent;

import DecoratorPattern.example.Component;

/**
 * 列表框
 */
public class ListBox extends Component{
    @Override
    public void display() {
        System.out.println("显示列表框");
    }
}
