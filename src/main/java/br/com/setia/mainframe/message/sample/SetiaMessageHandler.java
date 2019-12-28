package br.com.setia.mainframe.message.sample;

import br.com.setia.mainframe.message.base.BaseMessageHandler;


/**
 * Billet Registration Request Handler
 *
 * @author Setia Tecnologia
 */
public class SetiaMessageHandler extends BaseMessageHandler {

    public String prepareMessageRequest(SampleMessageRequestSpec request) throws NoSuchFieldException, SecurityException {
        return new StringBuilder()
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "codigoLayout", request.getCodigoLayout()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tamanhoLayout", request.getTamanhoLayout()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "codigoUsuario", request.getCodigoUsuario()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tipoAcesso", request.getTipoAcesso()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "chaveArqPessoaJuridica", request.getChaveArqPessoaJuridica()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "chaveArqTipoContratoNeg", request.getChaveArqTipoContratoNeg()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "chaveArqNumSeqContrato", request.getChaveArqNumSeqContrato()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "chaveLegCodigoProduto", request.getChaveLegCodigoProduto()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "chaveLegCodigoNegociacao", request.getChaveLegCodigoNegociacao()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloCodigoBanco", request.getTituloCodigoBanco()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloNroSeqContrato", request.getTituloNroSeqContrato()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloTipoRegistro", request.getTituloTipoRegistro()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloCodigoProduto", request.getTituloCodigoProduto()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloNossoNumero", request.getTituloNossoNumero()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloSeuNumero", request.getTituloSeuNumero()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloDataEmissao", request.getTituloDataEmissao()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloDataVencimento", request.getTituloDataVencimento()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloTipoVencimento", request.getTituloTipoVencimento()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloCodigoMoeda", request.getTituloCodigoMoeda()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloValor", request.getTituloValor()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloQtdeMoeda", request.getTituloQtdeMoeda()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloEspecie", request.getTituloEspecie()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloAceite", request.getTituloAceite()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloTipoProtestoNegociacao", request.getTituloTipoProtestoNegociacao()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloQtdeDiasProtesto", request.getTituloQtdeDiasProtesto()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloTipoDecursoPrazo", request.getTituloTipoDecursoPrazo()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloQtdeDiasDecurso", request.getTituloQtdeDiasDecurso()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloControleParticipante", request.getTituloControleParticipante()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloTipoEmissaoPapeleta", request.getTituloTipoEmissaoPapeleta()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloPagtoParcial", request.getTituloPagtoParcial()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "tituloQtdeParcelas", request.getTituloQtdeParcelas()))
                .append(prepareFieldWithMetada(SampleMessageRequestSpec.class, "filler1", request.getFiller1()))
                .toString();
    }


}
