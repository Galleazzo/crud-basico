package model;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosFic {
	
	private static List<Aluno> listaAlunos = new ArrayList<>();
	private static Integer RA = 0;
	
	static {
		Aluno aluno = new Aluno();
		aluno.setRa(RA++);
	}
	
	
	public void adicionaAluno(Aluno aluno) {
		
		aluno.setRa(RA++);
		BancoDeDadosFic.listaAlunos.add(aluno);
		
		
	}

	public List<Aluno> getAlunos() {
		return BancoDeDadosFic.listaAlunos;
	}

	public boolean deletar(Integer ra2) {
		
		for(Aluno aluno : listaAlunos) {
			if(aluno.getRa() == ra2) {
				return listaAlunos.remove(aluno);
			}
		}
		return false;
		
	}

	public Aluno buscaPorId(Integer ra) {
		for(Aluno a1 : listaAlunos) {
			if(a1.getRa() == ra) {
				return a1;
			}
		}
			
		return null;
		
	}
	
	
	
	
	
}
