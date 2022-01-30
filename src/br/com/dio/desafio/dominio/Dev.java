package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	private String nome;
	private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluido = new LinkedHashSet<>();
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudoInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsIncritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo>conteudo=this.conteudoInscritos.stream().findFirst();
		if (conteudo.isPresent()) {
			this.conteudosConcluido.add(conteudo.get());
			this.conteudoInscritos.remove(conteudo.get());
		}else {
			System.err.println("Você não esta matriculado em nenhum conteúdo");
		}
			
	}
	
	public double calcularTotalXp() {
		return this.conteudoInscritos.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();
		//return this.conteudoInscritos.stream().mapToDouble(Conteudo::calcularXP()).sum();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudoInscritos() {
		return conteudoInscritos;
	}

	public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
		this.conteudoInscritos = conteudoInscritos;
	}

	public Set<Conteudo> getConteudosConcluido() {
		return conteudosConcluido;
	}

	public void setConteudosConcluido(Set<Conteudo> conteudosConcluido) {
		this.conteudosConcluido = conteudosConcluido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudoInscritos, conteudosConcluido, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudoInscritos, other.conteudoInscritos)
				&& Objects.equals(conteudosConcluido, other.conteudosConcluido) && Objects.equals(nome, other.nome);
	}
	
	
	
	
	
}
