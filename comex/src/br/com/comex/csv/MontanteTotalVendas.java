package br.com.comex.csv;

public class MontanteTotalVendas extends PedidoCsv {
	 float TotalVenda;
	public void MontanteTotalVendas (String preco , String  quantidade) {
		 int qtd =  Integer.parseInt(quantidade);
		 float pc = Float.parseFloat(preco);
		 TotalVenda += qtd* pc;
	}
	
	 public void printTV() {
		 System.out.println("Montante de vendas: "+ TotalVenda);
	 }
   
}