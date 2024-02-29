import javax.swing.text.StyledEditorKit;

public class Test {
    private String name;
    public Test(String name){
        this.name = name;

    }

    @Override
    public boolean equals(Object o){
        Test test  = (Test) o;
        return (name.equals(test.name));

    }
    public static void main(String[] args){

        Test ob1 = new Test("Anas");
        Test ob2 = new Test("Anas");
        Test c = ob1;

        c = new Test("Safae");

        System.out.println(ob1==ob2);
        System.out.println(ob1==c);

        System.out.println(ob1.equals(ob2));
        System.out.println(ob1.equals(c));
        System.out.println(c.hashCode());
        System.out.println(ob1.hashCode());
        System.out.println(c);

    }
}
