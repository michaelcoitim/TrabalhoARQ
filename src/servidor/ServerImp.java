package servidor;

import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

import comum.Arquivo;
import comum.Cliente;
import comum.IServer;
import comum.TipoFiltro;

public class ServerImp implements IServer {

	@Override
	public void registrarCliente(Cliente c) throws RemoteException {
		

	}

	@Override
	public void publicarListaArquivos(Cliente c, List<Arquivo> lista) throws RemoteException {
		
	}

	@Override
	public Map<Cliente, List<Arquivo>> procurarArquivo(String query, TipoFiltro tipoFiltro, String filtro)
			throws RemoteException {
		
		return null;
	}

	@Override
	public byte[] baixarArquivo(Cliente cli, Arquivo arq) throws RemoteException {
		
		return null;
	}

	@Override
	public void desconectar(Cliente c) throws RemoteException {
	
	}
	public static void main(String[] args) {

	}
}
