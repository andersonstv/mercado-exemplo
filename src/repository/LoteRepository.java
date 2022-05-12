package repository;

import exemplo.Lote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoteRepository {
    Map<String, Lote> estoque;

    public LoteRepository() {
        this.estoque = new HashMap<>();
    }
    public String addLote(Lote lote){
        estoque.put(lote.getId(), lote);
        return lote.getId();
    }
    public String editarLote(Lote lote){
        estoque.replace(lote.getId(), lote);
        return lote.getId();
    }
    public Lote getLote(String idLote){
        return estoque.get(idLote);
    }
    public String deleteLote(String idLote){
        estoque.remove(idLote);
        return idLote;
    }
    public List<Lote> listLotes(){
        return new ArrayList<>(estoque.values());
    }
}
