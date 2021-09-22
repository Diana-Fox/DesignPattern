package visitor.combine;

public class Leaf extends Component {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitorLeaf(this);
    }

    private String name = "";

    public Leaf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
