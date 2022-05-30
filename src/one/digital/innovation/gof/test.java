package one.digital.innovation.gof;

import one.digital.innovation.gof.facade.Facade;
import one.digital.innovation.gof.singleton.SingletonEager;
import one.digital.innovation.gof.singleton.SingletonLazy;
import one.digital.innovation.gof.singleton.SingletonLazyHolder;
import one.digital.innovation.gof.strategy.Comportamento;
import one.digital.innovation.gof.strategy.ComportamentoAgressivo;
import one.digital.innovation.gof.strategy.ComportamentoDefensivo;
import one.digital.innovation.gof.strategy.ComportamentoNormal;
import one.digital.innovation.gof.strategy.Robo;

public class test {

	public static void main(String[] args) {
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		
		// strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		
		robo.mover();
		robo.mover();
		
		// facade

		Facade facade = new Facade();
		facade.migrarCliente("Jessika", "91120010");
	}

}
