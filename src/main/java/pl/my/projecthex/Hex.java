package pl.my.projecthex;

public class Hex {

    HexId id;
    String terrainFeature;
    String terrain;
    String occupant;

    public Hex(int row, int column) {
        id = new HexId(row,column);
    }
}
