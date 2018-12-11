package br.com.pesquisamercado.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.pesquisamercado.modelo.Convidado;
import br.com.pesquisamercado.modelo.Empresa;

public class ConvidadoDao {

	private Connection connection;

	public ConvidadoDao() {

		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Convidado convidado) {
		String sql = "insert into convidado (nome, rg, estado, dataNascimento, cpf, endereco, "
				+ "bairro, cidade, telefone, celular, email, nacionalidade, tempoCidade, "
				+ "estadoCivil, temFilhos, qtdeFilhos, idadeFilhos1, idadeFilhos2, idadeFilhos3, idadeFilhos4, "
				+ "trabalhaFora, profissao, dataHoraInclusao, estuda, curso, faculdade, "
				+ "contBanheiro, pontosBanheiro, contEmpregadas, pontosEmpregadas, contAutomoveis, pontosAutomoveis, "
				+ "contMicrocomputador, pontosMicrocomputador, contLavaLoucas, pontosLavaLoucas, "
				+ "contGeladeira, pontosGeladeira, contFreezer, pontosFreezer, contLavaRoupas, pontosLavaRoupas, "
				+ "contDvd, pontosDvd, contMicroondas, pontosMicroondas, contMotocicleta, pontosMotocicleta,"
				+ "contSecadoraRoupas, pontosSecadoraRoupas, anoModeloCarro, "
				+ "aguaEncanada, pontoAgua, ruaPavimentada, pontoRua, entrevistado, profissaoChefe, nomeEmpresa, pontos, nivel ) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try (PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql)) {
			stmt.setString(1, convidado.getNome());
			stmt.setString(2, convidado.getRg());
			stmt.setString(3, convidado.getEstado());
			stmt.setDate(4, new Date(convidado.getDataHoraInclusao().getTimeInMillis()));
			stmt.setString(5, convidado.getCpf());
			stmt.setString(6, convidado.getEndereco());
			stmt.setString(7, convidado.getBairro());
			stmt.setString(8, convidado.getCidade());
			stmt.setString(9, convidado.getTelefone());
			stmt.setString(10, convidado.getCelular());
			stmt.setString(11, convidado.getEmail());
			stmt.setString(12, convidado.getNacionalidade());
			stmt.setString(13, convidado.getTempoCidade());
			stmt.setString(14, convidado.getEstadoCivil());
			stmt.setString(15, String.valueOf(convidado.getTemFilhos()));
			// stmt.setString(2, String.valueOf(t.getSexo()));
			stmt.setInt(16, convidado.getQtdeFilhos());
			stmt.setInt(17, convidado.getIdadeFilhos1());
			stmt.setInt(18, convidado.getIdadeFilhos2());
			stmt.setInt(19, convidado.getIdadeFilhos3());
			stmt.setInt(20, convidado.getIdadeFilhos4());
			stmt.setString(21, String.valueOf(convidado.getTrabalhaFora()));
			stmt.setString(22, convidado.getProfissao());
			// stmt.setString(2, String.valueOf(t.getSexo()));
			stmt.setDate(23, new Date(convidado.getDataHoraInclusao().getTimeInMillis()));
			stmt.setString(24,  String.valueOf(convidado.getEstuda()));
			// stmt.setString(2, String.valueOf(t.getSexo()));
			stmt.setString(25, convidado.getCurso());
			stmt.setString(26, convidado.getFaculdade());
			stmt.setInt(27, convidado.getContBanheiro());
			stmt.setInt(28, convidado.getPontosBanheiro());
			stmt.setInt(29, convidado.getContEmpregadas());
			stmt.setInt(30, convidado.getPontosEmpregadas());
			stmt.setInt(31, convidado.getContAutomoveis());
			stmt.setInt(32, convidado.getPontosAutomoveis());
			stmt.setInt(33, convidado.getContMicrocomputador());
			stmt.setInt(34, convidado.getPontosMicrocomputador());
			stmt.setInt(35, convidado.getContLavaLoucas());
			stmt.setInt(36, convidado.getPontosLavaLoucas());
			stmt.setInt(37, convidado.getContGeladeira());
			stmt.setInt(38, convidado.getPontosGeladeira());
			stmt.setInt(39, convidado.getContFreezer());
			stmt.setInt(40, convidado.getPontosFreezer());
			stmt.setInt(41, convidado.getContLavaRoupas());
			stmt.setInt(42, convidado.getPontosLavaRoupas());
			stmt.setInt(43, convidado.getContDvd());
			stmt.setInt(44, convidado.getPontosDvd());
			stmt.setInt(45, convidado.getContMicroondas());
			stmt.setInt(46, convidado.getPontosMicroondas());
			stmt.setInt(47, convidado.getContMotocicleta());
			stmt.setInt(48, convidado.getPontosMotocicleta());
			stmt.setInt(49, convidado.getContSecadoraRoupas());
			stmt.setInt(50, convidado.getPontosSecadoraRoupas());
			stmt.setString(51, convidado.getAnoModeloCarro());
			stmt.setString(52, String.valueOf(convidado.getAguaEncanada()));
			// stmt.setString(2, String.valueOf(t.getSexo()));
			stmt.setInt(53, convidado.getPontoAgua());
			stmt.setString(54, String.valueOf(convidado.getRuaPavimentada()));
			stmt.setInt(55, convidado.getPontoRua());
			stmt.setInt(56, convidado.getEntrevistado());
			stmt.setString(57, convidado.getProfissaoChefe());
			stmt.setString(58, convidado.getNomeEmpresa());
			stmt.setInt(59, convidado.getPontos());
			stmt.setString(60, convidado.getNivel());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
	}// fim adiciona

	public List<Convidado> getLista() {
		String sql = "select * from convidado";
		List<Convidado> convidados = new ArrayList();
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Convidado convidado = new Convidado();
				convidado.setIdConvidado(rs.getLong("idconvidado"));
				convidado.setNome(rs.getString("nome"));
				convidado.setRg(rs.getString("rg"));
				convidado.setEstado(rs.getString("estado"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				convidado.setCpf(rs.getString("cpf"));
				convidado.setEndereco(rs.getString("endereco"));
				convidado.setBairro(rs.getString("bairro"));
				convidado.setCidade(rs.getString("cidade"));
				convidado.setTelefone(rs.getString("telefone"));
				convidado.setCelular(rs.getString("celular"));
				convidado.setEmail(rs.getString("email"));
				convidado.setNacionalidade(rs.getString("nacionalidade"));
				convidado.setTempoCidade(rs.getString("tempoCidade"));
				convidado.setEstadoCivil(rs.getString("estadoCivil"));
				convidado.setTemFilhos(rs.getString("temFilhos").charAt(0));
				convidado.setQtdeFilhos(rs.getInt("qtdeFilhos"));
				convidado.setIdadeFilhos1(rs.getInt("idadeFilhos1"));
				convidado.setIdadeFilhos2(rs.getInt("idadeFilhos2"));
				convidado.setIdadeFilhos3(rs.getInt("idadeFilhos3"));
				convidado.setIdadeFilhos4(rs.getInt("idadeFilhos4"));
				convidado.setTrabalhaFora(rs.getString("trabalhaFora").charAt(0));
				convidado.setProfissao(rs.getString("profissao"));
				Calendar data1 = Calendar.getInstance();
				data1.setTime(rs.getDate("dataHoraInclusao"));
				convidado.setDataHoraInclusao(data1);
				convidado.setEstuda(rs.getString("estuda").charAt(0));
				convidado.setCurso(rs.getString("curso"));
				convidado.setFaculdade(rs.getString("faculdade"));
				convidado.setContBanheiro(rs.getInt("contBanheiro"));
				convidado.setPontosBanheiro(rs.getInt("pontosBanheiro"));
				convidado.setContEmpregadas(rs.getInt("contEmpregadas"));
				convidado.setPontosEmpregadas(rs.getInt("pontosEmpregadas"));
				convidado.setContAutomoveis(rs.getInt("contAutomoveis"));
				convidado.setPontosAutomoveis(rs.getInt("pontosAutomoveis"));
				convidado.setContMicrocomputador(rs.getInt("contMicrocomputador"));
				convidado.setPontosMicrocomputador(rs.getInt("pontosMicrocomputador"));
				convidado.setContLavaLoucas(rs.getInt("contLavaLoucas"));
				convidado.setPontosLavaLoucas(rs.getInt("pontosLavaLoucas"));
				convidado.setContGeladeira(rs.getInt("contGeladeira"));
				convidado.setPontosGeladeira(rs.getInt("pontosLavaLoucas"));
				convidado.setContFreezer(rs.getInt("contFreezer"));
				convidado.setPontosFreezer(rs.getInt("pontosFreezer"));
				convidado.setContLavaRoupas(rs.getInt("contLavaRoupas"));
				convidado.setPontosLavaRoupas(rs.getInt("pontosLavaRoupas"));
				convidado.setContDvd(rs.getInt("contDvd"));
				convidado.setPontosDvd(rs.getInt("pontosDvd"));
				convidado.setContMicroondas(rs.getInt("contMicroondas"));
				convidado.setPontosMicroondas(rs.getInt("pontosFreezer"));
				convidado.setContMotocicleta(rs.getInt("contMotocicleta"));
				convidado.setPontosMotocicleta(rs.getInt("pontosFreezer"));
				convidado.setContSecadoraRoupas(rs.getInt("contSecadoraRoupas"));
				convidado.setPontosSecadoraRoupas(rs.getInt("pontosSecadoraRoupas"));
				convidado.setAnoModeloCarro(rs.getString("anoModeloCarro"));
				convidado.setAguaEncanada(rs.getString("aguaEncanada").charAt(0));
				convidado.setPontoAgua(rs.getInt("pontoAgua"));
				convidado.setRuaPavimentada(rs.getString("ruaPavimentada").charAt(0));
				convidado.setPontoRua(rs.getInt("pontoRua"));
				convidado.setEntrevistado(rs.getInt("entrevistado"));
				convidado.setProfissaoChefe(rs.getString("profissaoChefe"));
				convidado.setNomeEmpresa(rs.getString("nomeEmpresa"));
				convidado.setPontos(rs.getInt("pontos"));
				convidado.setNivel(rs.getString("nivel"));
				convidados.add(convidado);
			} // fim while
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
		return convidados;
	}// fim lista

	public Convidado buscaIdade(int idade) {
		String sql = "select * from convidado where idade => ? and idade <= ?";
		Convidado convidado = null;
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setInt(1, idade);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				convidado = new Convidado();
				convidado.setIdConvidado(rs.getLong("idconvidado"));
				convidado.setNome(rs.getString("nome"));
				convidado.setRg(rs.getString("rg"));
				convidado.setEstado(rs.getString("estado"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				convidado.setCpf(rs.getString("cpf"));
				convidado.setEndereco(rs.getString("endereco"));
				convidado.setBairro(rs.getString("bairro"));
				convidado.setCidade(rs.getString("cidade"));
				convidado.setTelefone(rs.getString("telefone"));
				convidado.setCelular(rs.getString("celular"));
				convidado.setEmail(rs.getString("email"));
				convidado.setNacionalidade(rs.getString("nacionalidade"));
				convidado.setTempoCidade(rs.getString("tempoCidade"));
				convidado.setEstadoCivil(rs.getString("estadoCivil"));
				convidado.setTemFilhos(rs.getString("temFilhos").charAt(0));
				convidado.setQtdeFilhos(rs.getInt("qtdeFilhos"));
				convidado.setIdadeFilhos1(rs.getInt("idadeFilho1"));
				convidado.setIdadeFilhos2(rs.getInt("idadeFilho2"));
				convidado.setIdadeFilhos3(rs.getInt("idadeFilho3"));
				convidado.setIdadeFilhos4(rs.getInt("idadeFilho4"));
				convidado.setTrabalhaFora(rs.getString("trabalhaFora").charAt(0));
				convidado.setProfissao(rs.getString("profissao"));
				Calendar data1 = Calendar.getInstance();
				data1.setTime(rs.getDate("dataHoraInclusao"));
				convidado.setDataHoraInclusao(data1);
				convidado.setEstuda(rs.getString("estuda").charAt(0));
				convidado.setCurso(rs.getString("curso"));
				convidado.setFaculdade(rs.getString("faculdade"));
				convidado.setContBanheiro(rs.getInt("contBanheiro"));
				convidado.setPontosBanheiro(rs.getInt("pontosBanheiro"));
				convidado.setContEmpregadas(rs.getInt("contEmpregadas"));
				convidado.setPontosEmpregadas(rs.getInt("pontosEmpregadas"));
				convidado.setContAutomoveis(rs.getInt("contAutomoveis"));
				convidado.setPontosAutomoveis(rs.getInt("pontosAutomoveis"));
				convidado.setContMicrocomputador(rs.getInt("contMicrocomputador"));
				convidado.setPontosMicrocomputador(rs.getInt("pontosMicrocomputador"));
				convidado.setContLavaLoucas(rs.getInt("contLavaLoucas"));
				convidado.setPontosLavaLoucas(rs.getInt("pontosLavaLoucas"));
				convidado.setContGeladeira(rs.getInt("contGeladeira"));
				convidado.setPontosGeladeira(rs.getInt("pontosLavaLoucas"));
				convidado.setContFreezer(rs.getInt("contFreezer"));
				convidado.setPontosFreezer(rs.getInt("pontosFreezer"));
				convidado.setContLavaRoupas(rs.getInt("contLavaRoupas"));
				convidado.setPontosLavaRoupas(rs.getInt("pontosRoupas"));
				convidado.setContDvd(rs.getInt("contDvd"));
				convidado.setPontosDvd(rs.getInt("pontosDvd"));
				convidado.setContMicroondas(rs.getInt("contMicroondas"));
				convidado.setPontosMicroondas(rs.getInt("pontosMicroondas"));
				convidado.setContMotocicleta(rs.getInt("contMotocicleta"));
				convidado.setPontosMotocicleta(rs.getInt("pontosFreezer"));
				convidado.setContSecadoraRoupas(rs.getInt("contSecadoraRoupas"));
				convidado.setPontosSecadoraRoupas(rs.getInt("pontosSecadoraRoupas"));
				convidado.setAnoModeloCarro(rs.getString("anoModeloCarro"));
				convidado.setAguaEncanada(rs.getString("aguaEncanada").charAt(0));
				convidado.setPontoAgua(rs.getInt("pontoAgua"));
				convidado.setRuaPavimentada(rs.getString("ruaPavimentada").charAt(0));
				convidado.setPontoRua(rs.getInt("pontoRua"));
				convidado.setEntrevistado(rs.getInt("entrevistado"));
				convidado.setProfissaoChefe(rs.getString("profissaoChefe"));
				convidado.setNomeEmpresa(rs.getString("nomeEmpresa"));
				convidado.setPontos(rs.getInt("pontos"));
				convidado.setNivel(rs.getString("nivel"));
			} // fim if
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
		return convidado;
	}// fim busca
	
	public Convidado buscaNivel(String nivel) {
		String sql = "select * from convidado where nivel = ?";
		Convidado convidado = null;
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, nivel);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				convidado = new Convidado();
				convidado.setIdConvidado(rs.getLong("idconvidado"));
				convidado.setNome(rs.getString("nome"));
				convidado.setRg(rs.getString("rg"));
				convidado.setEstado(rs.getString("estado"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				convidado.setCpf(rs.getString("cpf"));
				convidado.setEndereco(rs.getString("endereco"));
				convidado.setBairro(rs.getString("bairro"));
				convidado.setCidade(rs.getString("cidade"));
				convidado.setTelefone(rs.getString("telefone"));
				convidado.setCelular(rs.getString("celular"));
				convidado.setEmail(rs.getString("email"));
				convidado.setNacionalidade(rs.getString("nacionalidade"));
				convidado.setTempoCidade(rs.getString("tempoCidade"));
				convidado.setEstadoCivil(rs.getString("estadoCivil"));
				convidado.setTemFilhos(rs.getString("temFilhos").charAt(0));
				convidado.setQtdeFilhos(rs.getInt("qtdeFilhos"));
				convidado.setIdadeFilhos1(rs.getInt("idadeFilho1"));
				convidado.setIdadeFilhos2(rs.getInt("idadeFilho2"));
				convidado.setIdadeFilhos3(rs.getInt("idadeFilho3"));
				convidado.setIdadeFilhos4(rs.getInt("idadeFilho4"));
				convidado.setTrabalhaFora(rs.getString("trabalhaFora").charAt(0));
				convidado.setProfissao(rs.getString("profissao"));
				Calendar data1 = Calendar.getInstance();
				data1.setTime(rs.getDate("dataHoraInclusao"));
				convidado.setDataHoraInclusao(data1);
				convidado.setEstuda(rs.getString("estuda").charAt(0));
				convidado.setCurso(rs.getString("curso"));
				convidado.setFaculdade(rs.getString("faculdade"));
				convidado.setContBanheiro(rs.getInt("contBanheiro"));
				convidado.setPontosBanheiro(rs.getInt("pontosBanheiro"));
				convidado.setContEmpregadas(rs.getInt("contEmpregadas"));
				convidado.setPontosEmpregadas(rs.getInt("pontosEmpregadas"));
				convidado.setContAutomoveis(rs.getInt("contAutomoveis"));
				convidado.setPontosAutomoveis(rs.getInt("pontosAutomoveis"));
				convidado.setContMicrocomputador(rs.getInt("contMicrocomputador"));
				convidado.setPontosMicrocomputador(rs.getInt("pontosMicrocomputador"));
				convidado.setContLavaLoucas(rs.getInt("contLavaLoucas"));
				convidado.setPontosLavaLoucas(rs.getInt("pontosLavaLoucas"));
				convidado.setContGeladeira(rs.getInt("contGeladeira"));
				convidado.setPontosGeladeira(rs.getInt("pontosLavaLoucas"));
				convidado.setContFreezer(rs.getInt("contFreezer"));
				convidado.setPontosFreezer(rs.getInt("pontosFreezer"));
				convidado.setContLavaRoupas(rs.getInt("contLavaRoupa"));
				convidado.setPontosLavaRoupas(rs.getInt("pontosFreezer"));
				convidado.setContDvd(rs.getInt("contDvd"));
				convidado.setPontosDvd(rs.getInt("pontosDvd"));
				convidado.setContMicroondas(rs.getInt("contMicroondas"));
				convidado.setPontosMicroondas(rs.getInt("pontosFreezer"));
				convidado.setContMotocicleta(rs.getInt("contMotocicleta"));
				convidado.setPontosMotocicleta(rs.getInt("pontosFreezer"));
				convidado.setContSecadoraRoupas(rs.getInt("contSecadoraRoupas"));
				convidado.setPontosSecadoraRoupas(rs.getInt("pontosSecadoraRoupas"));
				convidado.setAnoModeloCarro(rs.getString("anoModeloCarro"));
				convidado.setAguaEncanada(rs.getString("aguaEncanada").charAt(0));
				convidado.setPontoAgua(rs.getInt("pontoAgua"));
				convidado.setRuaPavimentada(rs.getString("ruaPavimentada").charAt(0));
				convidado.setPontoRua(rs.getInt("pontoRua"));
				convidado.setEntrevistado(rs.getInt("entrevistado"));
				convidado.setProfissaoChefe(rs.getString("profissaoChefe"));
				convidado.setNomeEmpresa(rs.getString("nomeEmpresa"));
				convidado.setPontos(rs.getInt("pontos"));
				convidado.setNivel(rs.getString("nivel"));
			} // fim if
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
		return convidado;
	}// fim busca
	
	public void altera(Convidado convidado) {
		String sql = "update convidado set nome = ?, rg = ? , estado = ?, dataNascimento = ?, "
				+ "cpf = ?, endereco = ?, bairro = ?, cidade = ?, telefone = ?, celular = ?, email = ?, nacionalidade = ?, "
				+ "tempoCidade = ?, idade = ?, estadoCivil = ?, "
				+ "temFilhos = ?, qtdeFilhos = ?, idadeFilhos1 = ?, "
				+ "idadeFilhos2 = ?, idadeFilhos3 = ?, idadeFilhos4 = ?, trabalhaFora = ?, "
				+ "profissao = ?, dataHoraInclusao = ?, estuda = ?, curso = ?, faculdade = ?, "
				+ "contBanheiro = ?, pontosBanheiro= ?, contEmpregadas= ?, pontosEmpregradas= ?, "
				+ "contAutomoveis= ?, pontosAutomoveis= ?, contMicrocomputador= ?, "
				+ "pontosMicrocomputador= ?, contLavaLoucas= ?, pontosLavaLoucas= ?, contGeladeira= ?, "
				+ "pontosGeladeira = ?, contFreezer = ?, pontosFreezer = ?, contLavaRoupas = ?, pontosLavaRoupas = ?, "
				+ "contDvd = ?, pontosDvd= ?, contMicroondas = ?, pontosMicroondas= ?, contMotocicleta= ?,"
				+ "pontosMotocicleta = ?, contSecadoraRoupas= ?, pontosSecadoraRoupas = ?, anoModeloCarro = ?, "
				+ "aguaEncanada= ?, pontoAgua= ?, ruaPavimentada= ?, pontoRua= ?, chefe= ?, entrevistado= ?, "
				+ "profissaoChefe= ?, nomeEmpresa = ?, pontos= ?, nivel = ? where idconvidado = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, convidado.getNome());
			stmt.setString(2, convidado.getRg());
			stmt.setString(3, convidado.getEstado());
			stmt.setDate(4, new Date(convidado.getDataHoraInclusao().getTimeInMillis()));
			stmt.setString(5, convidado.getCpf());
			stmt.setString(6, convidado.getEndereco());
			stmt.setString(7, convidado.getBairro());
			stmt.setString(8, convidado.getCidade());
			stmt.setString(9, convidado.getTelefone());
			stmt.setString(10, convidado.getCelular());
			stmt.setString(11, convidado.getEmail());
			stmt.setString(12, convidado.getNacionalidade());
			stmt.setString(13, convidado.getTempoCidade());
			stmt.setString(14, convidado.getEstadoCivil());
			stmt.setString(15, String.valueOf(convidado.getTemFilhos()));
			//stmt.setString(21, String.valueOf(convidado.getTrabalhaFora()));
			//convidado.setTemFilhos(rs.getString("temFilhos").charAt(0));
			stmt.setInt(16, convidado.getQtdeFilhos());
			stmt.setInt(17, convidado.getIdadeFilhos1());
			stmt.setInt(18, convidado.getIdadeFilhos2());
			stmt.setInt(19, convidado.getIdadeFilhos3());
			stmt.setInt(20, convidado.getIdadeFilhos4());
			stmt.setString(21, String.valueOf(convidado.getTrabalhaFora()));
			stmt.setString(22, convidado.getProfissao());
			stmt.setDate(23, new Date(convidado.getDataHoraInclusao().getTimeInMillis()));
			stmt.setString(24, String.valueOf(convidado.getEstuda()));
			//stmt.setString(21, String.valueOf(convidado.getTrabalhaFora()));
			stmt.setString(25, convidado.getCurso());
			stmt.setString(26, convidado.getFaculdade());
			stmt.setInt(27, convidado.getContBanheiro());
			stmt.setInt(28, convidado.getPontosBanheiro());
			stmt.setInt(29, convidado.getContEmpregadas());
			stmt.setInt(30, convidado.getPontosEmpregadas());
			stmt.setInt(31, convidado.getContAutomoveis());
			stmt.setInt(32, convidado.getPontosAutomoveis());
			stmt.setInt(33, convidado.getContMicrocomputador());
			stmt.setInt(34, convidado.getPontosMicrocomputador());
			stmt.setInt(35, convidado.getContLavaLoucas());
			stmt.setInt(36, convidado.getPontosLavaLoucas());
			stmt.setInt(37, convidado.getContGeladeira());
			stmt.setInt(38, convidado.getPontosGeladeira());
			stmt.setInt(39, convidado.getContFreezer());
			stmt.setInt(40, convidado.getPontosFreezer());
			stmt.setInt(41, convidado.getContLavaRoupas());
			stmt.setInt(42, convidado.getPontosLavaRoupas());
			stmt.setInt(43, convidado.getContDvd());
			stmt.setInt(44, convidado.getPontosDvd());
			stmt.setInt(45, convidado.getContMicroondas());
			stmt.setInt(46, convidado.getPontosMicroondas());
			stmt.setInt(47, convidado.getContMotocicleta());
			stmt.setInt(48, convidado.getPontosMotocicleta());
			stmt.setInt(49, convidado.getContSecadoraRoupas());
			stmt.setInt(50, convidado.getPontosSecadoraRoupas());
			stmt.setString(51, convidado.getAnoModeloCarro());
			stmt.setString(52,  String.valueOf(convidado.getAguaEncanada()));
			//stmt.setString(21, String.valueOf(convidado.getTrabalhaFora()));
			stmt.setInt(53, convidado.getPontoAgua());
			stmt.setString(54, String.valueOf(convidado.getRuaPavimentada()));
			stmt.setInt(55, convidado.getPontoRua());
			stmt.setInt(56, convidado.getEntrevistado());
			stmt.setString(57, convidado.getProfissaoChefe());
			stmt.setString(58, convidado.getNomeEmpresa());
			stmt.setInt(59, convidado.getPontos());
			stmt.setString(60, convidado.getNivel());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
	}// fim altera
	
	public void remove(Convidado convidado) {
		String sql = "delete from convidado where idconvidado = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setLong(1, convidado.getIdConvidado());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
	} // fim remove
}
