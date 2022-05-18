package repository;

import models.Lote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoteRepository {
    Map<String, Lote> lotes;

    public LoteRepository() {
        this.lotes = new HashMap<>();
    }
    public String addLote(Lote lote){
        lotes.put(lote.getId(), lote);
        return lote.getId();
    }
    public Lote getLote(String idLote){
        return lotes.get(idLote);
    }
    public List<Lote> getAll(){
        return new ArrayList<>(lotes.values());
    }
    public String editarLote(Lote lote){
        lotes.replace(lote.getId(), lote);
        return lote.getId();
    }
    public String deleteLote(String idLote){
        lotes.remove(idLote);
        return idLote;
    }
}
