package FlyweightPattern.IgoChessExample;

/**
 * 围棋棋子类：抽象享元类
 */
abstract public class IgoChessMan {
    //享元方法
    public abstract String getColor();
    public  void display(Coordinates coordinates){
        System.out.print("棋子的颜色："+this.getColor() + ";棋子的位置：x：" + coordinates.getX() + "y:" + coordinates.getY());
    }
}
