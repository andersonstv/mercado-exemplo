package repository;

import models.Produto;

import java.util.*;

public class ProductRepository {
    private Map<String, Produto> produtos;

    public ProductRepository() {
        this.produtos = new HashMap<>();
    }
    public String addProduto(Produto p){
        produtos.put(p.getId(), p);
        return p.getId();
    }
    public List<Produto> getAll(){
        return new ArrayList<>(produtos.values());
    }
    public String editarProduto(Produto produtoAlterado){
        produtos.replace(produtoAlterado.getId(), produtoAlterado);
        return produtoAlterado.getId();
    }
    public Produto getProduto(String id){
        return produtos.get(id);
    }
    public String deleteProduto(String id){
        produtos.remove(id);
        return id;
    }


}
