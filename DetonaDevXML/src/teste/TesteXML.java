package teste;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import entidade.Pessoa;

public class TesteXML {

	public static void main(String[] args) {
		
		XStream xstream = new XStream(new DomDriver());
		
		Pessoa p = new Pessoa();
		p.setCpf("122345");
		p.setNome("Cleiton");
		p.setSexo("M");
		p.setIdade(35);
		
		System.out.println(xstream.toXML(p));
		
		String xml = "<entidade.Pessoa>" + 
				"  <cpf>66667777</cpf>" + 
				"  <nome>Grabriel o Verde</nome>" + 
				"  <sexo>M</sexo>" + 
				"  <idade>41</idade>" + 
				"</entidade.Pessoa>";
		
		Pessoa nova = (Pessoa)xstream.fromXML(xml);
		
		System.out.println(nova.getNome() + " ---- ");
	}

}
