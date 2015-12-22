package com.oxsys.topcon;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.oxsys.topcon.model.Contato;
import com.oxsys.topcon.model.Contrado;
import com.oxsys.topcon.model.FormDinamico;
import com.oxsys.topcon.model.Pessoa;
import com.oxsys.topcon.model.Unidade;
import com.oxsys.topcon.model.Vaga;
import com.oxsys.topcon.model.auth.Funcionalidade;
import com.oxsys.topcon.model.auth.Permissao;
import com.oxsys.topcon.model.auth.Usuario;
import com.oxsys.topcon.model.enums.ContatoTipo;
import com.oxsys.topcon.model.enums.ContratoTipo;
import com.oxsys.topcon.model.enums.PessoaSituacao;
import com.oxsys.topcon.model.enums.Sexo;
import com.oxsys.topcon.model.enums.TipoArtefato;
import com.oxsys.topcon.model.enums.UnidadeTipo;
import com.oxsys.topcon.model.enums.UsuarioSituacao;
import com.oxsys.topcon.model.enums.UsuarioTipo;
import com.oxsys.topcon.repository.ContatoRepository;
import com.oxsys.topcon.repository.ContratoRepository;
import com.oxsys.topcon.repository.FormDinamicoRepository;
import com.oxsys.topcon.repository.FuncionalidadeRepository;
import com.oxsys.topcon.repository.PermissaoRepository;
import com.oxsys.topcon.repository.PessoaRepository;
import com.oxsys.topcon.repository.UnidadeRepository;
import com.oxsys.topcon.repository.UsuarioRepository;
import com.oxsys.topcon.repository.VagaRepository;
import com.oxsys.topcon.security.JwtFilter;

@SpringBootApplication
public class TopconApplication {

	@Autowired
	PessoaRepository repoPessoa;
	
	@Autowired
	UnidadeRepository repoUnidade;
	
	@Autowired
	VagaRepository repoVaga;
	
	@Autowired
	ContratoRepository repoContrato;
	
	@Autowired
	ContatoRepository repoContato;
	
	@Autowired
	UsuarioRepository repoUsuario;
	
	@Autowired PermissaoRepository repoPermissao;
	
	@Autowired FuncionalidadeRepository repoFuncionalidade;
	
	@Autowired FormDinamicoRepository repoDinamico;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ConfigurableApplicationContext app = SpringApplication.run(TopconApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		
		for(long i=1 ; i<=10; i++){
			
			Pessoa p = new Pessoa(i,"Pessoa-"+i,PessoaSituacao.ATIVA,Sexo.MASCULINO,new Date());
			repoPessoa.save(p);
			
			Contato c = new Contato(0,"Contato",ContatoTipo.AMIGO,"9999-000"+i,"email@com",p);
			repoContato.save(c);
		
			Unidade u = new Unidade(i,UnidadeTipo.APARTAMENTO,"Q."+i,"BL."+i,"Rua "+i,"1","1",i,null);
			repoUnidade.save(u);
			
			Vaga v = new Vaga(i,u,Long.toString(i));
			repoVaga.save(v);
			
			
			Contrado ctr = new Contrado(i,"201-11-01-"+i, ContratoTipo.ALUGUEL , new Date(), new Date(), p, p, u);
			repoContrato.save(ctr);
			
			Usuario usu = new Usuario("usuario-"+i,"usuario-"+i,"123",UsuarioSituacao.ATIVO,UsuarioTipo.USER);
			repoUsuario.save(usu);
			
		}
		
		Usuario u = new Usuario();
		Funcionalidade f = new Funcionalidade();
		Permissao p = new Permissao();

		u.setId(1);
		p.setUsuario(u);	
		p.setFuncionalidade(f);
		
		f.setId(11);	f.setDescricao("pessoa.select");
		repoFuncionalidade.save(f);
		repoPermissao.save(p); p.setId(0);	
		f.setId(12);	f.setDescricao("pessoa.insert");
		repoFuncionalidade.save(f);
		repoPermissao.save(p);	p.setId(0);
		f.setId(13);	f.setDescricao("pessoa.update");
		repoFuncionalidade.save(f);
		repoPermissao.save(p); p.setId(0);
		f.setId(14);	f.setDescricao("pessoa.delete");
		repoFuncionalidade.save(f);
		repoPermissao.save(p);	 p.setId(0);
		
		f.setId(21);	f.setDescricao("contrato.select");
		repoFuncionalidade.save(f);
		repoPermissao.save(p);	p.setId(0);
		f.setId(22);	f.setDescricao("contrato.insert");
		repoFuncionalidade.save(f);
		repoPermissao.save(p);	p.setId(0);
		f.setId(23);	f.setDescricao("contrato.update");
		repoFuncionalidade.save(f);
		repoPermissao.save(p);	p.setId(0);
		f.setId(24);	f.setDescricao("contrato.delete");
		repoFuncionalidade.save(f);
		repoPermissao.save(p);	p.setId(0);

		f.setId(31);	f.setDescricao("unidade.select");
		repoFuncionalidade.save(f);
		repoPermissao.save(p);	p.setId(0);
		f.setId(32);	f.setDescricao("unidade.insert");
		repoFuncionalidade.save(f);
		repoPermissao.save(p);	p.setId(0);
		f.setId(33);	f.setDescricao("unidade.update");
		repoFuncionalidade.save(f);
		repoPermissao.save(p);	p.setId(0);
		f.setId(34);	f.setDescricao("unidade.delete");
		repoFuncionalidade.save(f);
		repoPermissao.save(p);	p.setId(0);

		f.setId(41);	f.setDescricao("conta.select");
		repoFuncionalidade.save(f);
		repoPermissao.save(p);	p.setId(0);
		f.setId(42);	f.setDescricao("conta.insert");
		repoFuncionalidade.save(f);
		repoPermissao.save(p);	p.setId(0);
		f.setId(43);	f.setDescricao("conta.update");
		repoFuncionalidade.save(f);
		repoPermissao.save(p);	p.setId(0);
		f.setId(44);	f.setDescricao("conta.delete");
		repoFuncionalidade.save(f);
		repoPermissao.save(p);	p.setId(0);

		f.setId(101);	f.setDescricao("gerenciar.usuario");
		repoFuncionalidade.save(f);
		repoPermissao.save(p);	p.setId(0);
	
		FormDinamico form = new FormDinamico(0,"form1","<h1>template1</h1>",TipoArtefato.FORM);
		repoDinamico.save(form);

	}
	
	
	@Bean
    public FilterRegistrationBean jwtFilter() {
        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new JwtFilter());
        registrationBean.addUrlPatterns("/apiX/*");
        return registrationBean;
	}
	
	
}
