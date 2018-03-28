package DecoratorPattern.example.Decorator;


import DecoratorPattern.example.Component;

//抽象装饰构建类
public class ComponentDecorator extends Component {
    private Component component;
    public ComponentDecorator(Component component){
        this.component = component;
    }
    @Override
    public void display() {
        component.display();
    }
}
