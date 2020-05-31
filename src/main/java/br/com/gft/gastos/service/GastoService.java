package br.com.gft.gastos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gft.gastos.dto.GastoDTO;
import br.com.gft.gastos.model.Gasto;
import br.com.gft.gastos.repository.GastoRepository;

@Service
public class GastoService {
	
	@Autowired 
	private GastoRepository gastoRepository; 
	
	public Gasto setGasto(GastoDTO gasto) {
		
		Gasto novoGasto =  new Gasto();
		novoGasto.setDescricao(gasto.getDescricao());
		novoGasto.setCodigoUsuario(gasto.getCodigoUsuario());
		novoGasto.setValor(gasto.getValor());
		novoGasto.setData(gasto.getData());
		novoGasto.setCategoria(gasto.getCategoria());
		novoGasto.setCliente(gasto.getCliente());
		
		gastoRepository.save(novoGasto);
		return novoGasto;
	}
	
	public List<Gasto> lista() {
		List<Gasto> listaGasto =  gastoRepository.findAll();
		
		return listaGasto;
	}

	public List<Gasto> listaPorIdCliente(Long id) {
		List<Gasto> list = gastoRepository.findByCliente(id);
		
		return list;
	}
}
