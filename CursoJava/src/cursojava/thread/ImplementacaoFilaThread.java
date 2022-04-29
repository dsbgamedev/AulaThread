package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class ImplementacaoFilaThread extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = 
			new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}
	
	@Override
	public void run() {
		
		System.out.println("Fila rodando");
		
		while(true) {
	
		Iterator iteracao = pilha_fila.iterator(); 		
		synchronized (pilha_fila) {//Bloquear o acessar a esta lista por outro processo
			
			while (iteracao.hasNext()) {//enquanto conter dados a lista ira processar
				
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
				
				/* Processar uma lista rotina ou processo grande do java */
				
				/* Depois de processar limpar a lista */
				
				iteracao.remove();
				
				//Depois que remove colocar um tempo
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {//Dar um tempo para descarga de memoria
					e.printStackTrace();
				}
				
			}
			
		}
		
		try {
			Thread.sleep(1000);//Processou toda a lista da um tempo para limpeza de memoria
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}

	}
	
}
