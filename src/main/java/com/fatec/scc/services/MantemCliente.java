package com.fatec.scc.services;

import java.util.List;
import java.util.Optional;

import com.fatec.scc.model.Endereco;
import com.fatec.scc.model.cliente.Cliente;

public interface MantemCliente {
	List<Cliente> consultaTodos();

	Optional<Cliente> consultaPorCpf(String cpf);

	Optional<Cliente> consultaPorId(Long id);

	Optional<Cliente> save(Cliente cliente);

	void delete(Long id);

	Optional<Cliente> atualiza(Long id, Cliente cliente);

	Endereco obtemEndereco(String cep);
}