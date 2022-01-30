package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java"); 
		curso1.setDescricao("Descrição curso java");
		curso1.setCargaHoraria(20);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso X"); 
		curso2.setDescricao("Descrição curso X");
		curso2.setCargaHoraria(4);
		
		//Conteudo conteudo = new Curso();
		
		//Conteudo conteudo1 = new Mentoria();
		
		
		Mentoria mentoria =new Mentoria();
		mentoria.setTitulo("mentoria java");
		mentoria.setDescricao("descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java DEV");
		bootcamp.setNome("Descrição Bootcamp JAVA");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devAnderson = new Dev();
		devAnderson.inscreverBootcamp(bootcamp);
		devAnderson.setNome("Anderson");
		System.out.println("Conteudos inscritos de Anderson"+devAnderson.getConteudoInscritos());
		System.out.println();
		System.out.println();
		devAnderson.progredir();
		devAnderson.progredir();
		devAnderson.progredir();
		System.out.println("Conteudos inscritos de Anderson"+devAnderson.getConteudoInscritos());
		System.out.println("Conteudos concluidos de Anderson"+devAnderson.getConteudosConcluido());
		System.out.println("Xp:  "+ devAnderson.calcularTotalXp());
		
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println();
		
		
		Dev devJaoa = new Dev();
		devJaoa.inscreverBootcamp(bootcamp);
		devJaoa.setNome("João");
		System.out.println("Conteudos inscritos de João"+devJaoa.getConteudoInscritos());
		System.out.println();
		System.out.println();
		devJaoa.progredir();
		System.out.println("Conteudos inscritos de João"+devJaoa.getConteudoInscritos());
		System.out.println("Conteudos concluidos de João"+devJaoa.getConteudosConcluido());
		System.out.println("Xp:  "+ devJaoa.calcularTotalXp());
	}

}
