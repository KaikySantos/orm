package util;

import DAO.MedicoDAO;
import model.Medico;
import servico.ServicoMedico;

public class Teste {
	static ServicoMedico servicoMedico = new ServicoMedico();
	
	public static void main(String[] args) {
		System.out.println(servicoMedico.buscarPorId(1));
	}
}
