package comex;

public class MainProduto {

	public static void main(String[] args) {
		 Categoria  cat1 = new Categoria("INFORMATICA","ATIVA");
		
		 Categoria  cat3 = new Categoria("LIVROS","ATIVA");
		
		Produto P1 = new Produto("Notebook Samsung.." , "I5 4gb ram ." ,(float)3523.00 , 1 , cat1);
		Produto P2 = new Produto("Clean Architecture" ,    "bla bla  bla" , (float)102.90 , 2 , cat3 );
		Produto P3 = new Produto("Monitor Dell 27..." ,      "27 polegadas" ,(float)1889.00 , 3 , cat1  );
		ProdutoIsento Pi = new ProdutoIsento ("Clean Architecture" ,    "bla bla  bla" , (float)102.90 , 2 , cat3 );
	
	
		
	
	
		
	    System.out.println("Funcao Calcula Estoque: \n");
	    System.out.printf("id | Produto           |Custo | Quantidade  | Total Estoque  \n");
	    P1.calcula_estoque();
	    P2.calcula_estoque();
		P3.calcula_estoque();
		System.out.println("Funcao Calcula Calcula Imposto: \n");
		System.out.printf("id | Produto           | Custo  |  Imposto |\n");
		P1.calcula_imposto();
		P2.calcula_imposto();
		P3.calcula_imposto ();
		System.out.println("Impressao de todos produtos \n");
	    System.out.println("|Id|  Nome             |   DEscricao |  valor   | Quantidade   | categoria  |");
		P1.print();
	 	P2.print();
		P3.print();
		
		System.out.println("Funcao Calcula Calcula Imposto 2 : \n");
		
		 System.out.println("|Id|  Nome             |   DEscricao |  valor   | Quantidade   | categoria  | Imposto");
		 Pi.Calcula_Imposto();
		 
		
	}

}