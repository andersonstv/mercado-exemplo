import models.Lote;
import models.Produto;
import repository.LoteRepository;
import repository.ProductRepository;
import services.LoteService;
import services.ProdutoService;

public class Sistema {

	public static void main(String[] args) {
		ProdutoService prodService= new ProdutoService();
		LoteService loteService = new LoteService();
		Produto p1 = new Produto("Leite", "Parmalat", 10.5);
		Produto p2 = new Produto("Leite Desnatado", "Piracanjuba", 12.90);
		Produto p3 = new Produto("Leite Integral", "Itambe", 9.50);

		Lote l2 = new Lote(p2, 14L);
		Lote l1 = new Lote(p1, 10L);

		prodService.addProduto(p1);
		prodService.addProduto(p2);
		prodService.addProduto(p3);

		prodService.addLote(l1);
		prodService.addLote(l2);

		System.out.println(prodService.listProdutosByName("Leite"));
		System.out.println(prodService.listProdutosLoteByName("Leite"));
	}
}
