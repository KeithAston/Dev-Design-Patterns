package compositeentitypattern;

public class CompositeEntityPattern {

    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("TestNo2", "SecondPieceOfData");
        client.printData();
    }

}
