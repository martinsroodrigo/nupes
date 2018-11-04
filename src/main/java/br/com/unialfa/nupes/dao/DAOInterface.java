package br.com.unialfa.nupes.dao;

import br.com.unialfa.nupes.entity.Aluno;
import br.com.unialfa.nupes.entity.Curso;

public interface DAOInterface<T,K> {
	public void salvar(T obj,K ob);

}
