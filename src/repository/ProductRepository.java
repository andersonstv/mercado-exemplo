package repository;

import exemplo.Produto;

import java.util.*;

public class ProductRepository {
    private Map<String, Produto> catalogo;

    public ProductRepository() {
        this.catalogo = new HashMap<>();
    }

    public String addProduto(Produto p){
        catalogo.put(p.getId(), p);
        return p.getId();
    }
    public String editarProduto(Produto produtoAlterado){
        catalogo.replace(produtoAlterado.getId(), produtoAlterado);
        return produtoAlterado.getId();
    }
    public Produto getProduto(String id){
        return catalogo.get(id);
    }
    public String deleteProduto(String id){
        catalogo.remove(id);
        return id;
    }
    public List<Produto> listProdutos(){
        return new ArrayList<>(catalogo.values());
    }

}
