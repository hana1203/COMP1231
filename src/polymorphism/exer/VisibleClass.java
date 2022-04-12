package polymorphism.exer;

public class VisibleClass implements Visible{

    @Override
    public boolean makeVisible() {
        return true;
    }

    @Override
    public boolean makeInvisible() {
        return false;
    }
}
