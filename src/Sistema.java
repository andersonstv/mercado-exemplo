import exemplo.Lote;
import exemplo.Produto;
import repository.LoteRepository;
import repository.ProductRepository;

public class Sistema {

	public static void main(String[] args) {
		ProductRepository produtoRepo = new ProductRepository();
		LoteRepository loteRepo = new LoteRepository();
		Produto produto = new Produto("Leite", "Parmalat");
		Lote lote = new Lote(produto, 10L);
		produtoRepo.addProduto(produto);
		loteRepo.addLote(lote);

		System.out.println(produto);
		System.out.println(lote);
		System.out.println(produtoRepo.listProdutos());
		System.out.println(loteRepo.listLotes());
	}
}
