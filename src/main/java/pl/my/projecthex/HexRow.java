package pl.my.projecthex;

import java.util.List;

public class HexRow {

    HexRowId id;
    List<Hex> row;

    public HexRow(HexRowId id) {
        this.id = id;

    }

    public void fillRow(int size){
        for (int i =0;i<size;i++){
            Hex hex = new Hex(id.getId(),i);
        }
    }
}
