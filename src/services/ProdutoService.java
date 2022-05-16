package services;

import models.Lote;
import models.Produto;
import repository.LoteRepository;
import repository.ProductRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProdutoService {
    ProductRepository prodRepo;
    LoteRepository loteRepo;

    public ProdutoService() {
        prodRepo = new ProductRepository();
        loteRepo = new LoteRepository();
    }
    public String addProduto(Produto prod){
        return prodRepo.addProduto(prod);
    }
    public String addLote(Lote lt){
        return loteRepo.addLote(lt);
    }
    public List<Produto> listProdutosByName(String name){
        return getProdutoByName(name, prodRepo.getAll());
    }
    public List<Produto> listProdutosLoteByName(String name){
        return getProdutoByName(name, getProdutoWithLote());
    }
    private List<Produto> getProdutoWithLote(){
        List<Produto> result = new ArrayList<>();
        for (Lote lt: loteRepo.getAll()) {
            result.add(lt.getProduto());
        }
        return result;
    }
    private List<Produto> getProdutoByName(String name, Collection<Produto> collection){
        List<Produto> result = new ArrayList<>();
        for (Produto prod: collection) {
            if (prod.getNome().toLowerCase().contains(name.toLowerCase())){
                result.add(prod);
            }
        }
        return result;
    }
}
