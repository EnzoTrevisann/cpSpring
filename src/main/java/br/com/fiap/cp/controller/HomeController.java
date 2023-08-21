package br.com.fiap.cp.controller;

<<<<<<< HEAD
=======
import java.math.BigDecimal;
import java.util.Arrays;
>>>>>>> 77cb54a4e27f47e1fdf3c307e52a0ee0269966e7
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.cp.model.Pedido;
import br.com.fiap.cp.repository.PedidoRepository;

@RestController
@RequestMapping("/home")
public class HomeController {

<<<<<<< HEAD
		@Autowired
		private PedidoRepository pedidoRepository;
	
	@GetMapping
	public ModelAndView home() {
		List <Pedido> pedidos = pedidoRepository.findAll();
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("pedidos", pedidos);
		return mv;
	}
=======
  @GetMapping
  public String home(Model model) {
    Pedido pedido = new Pedido();
    pedido.setNomeProduto("Funko Pop Harry Potter: Harry Triwizard, NC Game");
    pedido.setUrlImagem("https://m.media-amazon.com/images/I/61XLGUPtaSL._AC_.jpg");
    pedido.setUrlImagem2("https://m.media-amazon.com/images/I/51cGxkFbaNL._AC_.jpg");
    pedido.setUrlProduto("https://www.amazon.com.br/Triwizard-Potter-Pop-Figure-Funko/dp/B019JIAB1G/ref=asc_df_B019JIAB1G/?tag=googleshopp00-20&linkCode=df0&hvadid=379787071859&hvpos=&hvnetw=g&hvrand=15756791836791176950&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1001765&hvtargid=pla-433074748969&psc=1");
    pedido.setDescricao("Bonecos Funko Pop, os queridinhos dos pequenos. Colecione e divirta-se com essas figuras encantadoras. Este produto não é um brinquedo. Produto destinado a colecionadores com mais de 14 (quatorze) anos.");
    pedido.setValorNegociado(new BigDecimal(89.00));

    Pedido pedido2 = new Pedido();
    pedido2.setNomeProduto("Boneco Movies Harry Potter, Funko Pop");
    pedido2.setUrlImagem("https://m.media-amazon.com/images/I/813DK2rJqCL._AC_SL1500_.jpg");
    pedido2.setUrlImagem2("https://m.media-amazon.com/images/I/71XK4Qvr9NL._AC_SL1500_.jpg");
    pedido2.setUrlProduto("https://www.amazon.com.br/Funko-Harry-Potter-Pop/dp/B076HVJN7T/ref=asc_df_B076HVJN7T/?tag=googleshopp00-20&linkCode=df0&hvadid=392796143940&hvpos=&hvnetw=g&hvrand=10270545852851725291&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1001765&hvtargid=pla-402800120800&psc=1");
    pedido2.setDescricao("Funko pop veio para enlouquecer os apaixonados por animes, filmes, series de tvs e desenhos animados. São bonecos de diversos personagens, lindos e cabeludinhos. Muitos deles tornam-se raro devido a baixa tiragem de peças. A funko já produziu mais de 3 mil modelos diferentes e mensalmente lançam novos personagens. não perca tempo, entre logo nessa onda e colecione os funko pop.");
    pedido2.setValorNegociado(new BigDecimal(116.00));

    List<Pedido> pedidos = Arrays.asList(pedido, pedido2);
    model.addAttribute("pedidos", pedidos);
    return "home";
  }
>>>>>>> 77cb54a4e27f47e1fdf3c307e52a0ee0269966e7
}