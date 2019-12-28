package br.com.setia.mainframe.message.sample;


import br.com.setia.mainframe.message.spec.SetiaMessageFieldAttr;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static br.com.setia.mainframe.message.spec.SetiaMessageFieldAttr.SetiaMessageFieldType;

/**
 * Sample Billet Registration Request Message
 *
 * @author Setia Tecnologia
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SampleMessageRequestSpec {

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-COD-LAYOUT",
            description = "CODIGO DO LAY-OUT",
            size = 8,
            order = 1,
            completeWith = "",
            defaultValue = "SAMPW3EI")
    private String codigoLayout;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-TAM-LAYOUT",
            description = "TAMANHO DO LAY-OUT",
            size = 5,
            order = 2,
            completeWith = "0",
            defaultValue = "2500")
    private String tamanhoLayout;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-COD-USUARIO",
            description = "CODIGO DO USUARIO",
            size = 9,
            order = 3,
            completeWith = "",
            defaultValue = "")
    private String codigoUsuario;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-TIPO-ACESSO",
            description = "TIPO DE ACESSO",
            size = 1,
            order = 4,
            completeWith = "0",
            defaultValue = "2")
    private String tipoAcesso;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-E-CPSSOA-JURID-CONTR",
            description = "CLUB DO BANCO",
            size = 10,
            order = 5,
            completeWith = "0",
            defaultValue = "")
    private String chaveArqPessoaJuridica;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-E-CTPO-CONTR-NEGOC",
            description = "TIPO DE CONTRATO DE NEGOCIO",
            size = 3,
            order = 6,
            completeWith = "0",
            defaultValue = "")
    private String chaveArqTipoContratoNeg;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-E-NSEQ-CONTR-NEGOC",
            description = "NUMERO DE SEQ. DO CONTRATO",
            size = 10,
            order = 7,
            completeWith = "0",
            defaultValue = "")
    private String chaveArqNumSeqContrato;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-E-CIDTFD-PROD-COBR",
            description = "CODIGO DO PRODUTO",
            size = 2,
            order = 8,
            completeWith = "0",
            defaultValue = "")
    private String chaveLegCodigoProduto;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-E-CNEGOC-COBR",
            description = "CODIGO DA NEGOCIACAO",
            size = 18,
            order = 9,
            completeWith = "0",
            defaultValue = "")
    private String chaveLegCodigoNegociacao;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-E-CODIGO-BANCO",
            description = "CODIGO DO BANCO",
            size = 3,
            order = 10,
            completeWith = "0",
            defaultValue = "123")
    private String tituloCodigoBanco;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-E-NSEQ-CONTR-NEGOC",
            description = "NUMERO DE SEQUENCIA DO CONTRAT",
            size = 10,
            order = 11,
            completeWith = "0",
            defaultValue = "")
    private String tituloNroSeqContrato;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-E-TIPO-REGISTRO",
            description = "TIPO DE REGISTRO",
            size = 3,
            order = 12,
            completeWith = "0",
            defaultValue = "1")
    private String tituloTipoRegistro;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-E-CPRODT-SERVC-OPER",
            description = "CODIGO DO PRODUTO",
            size = 8,
            order = 13,
            completeWith = "0",
            defaultValue = "0")
    private String tituloCodigoProduto;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-E-CTITLO-COBR-CDENT",
            description = "NOSSO NUMERO",
            size = 11,
            order = 14,
            completeWith = "0",
            defaultValue = "")
    private String tituloNossoNumero;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-E-CTITLO-CLI-CDENT",
            description = "SEU NUMERO",
            size = 25,
            order = 15,
            completeWith = "",
            defaultValue = "")
    private String tituloSeuNumero;

    //DD.MM.YYYY
    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-E-DEMIS-TITLO-COBR",
            description = "DATA DE EMISSAO DO TITULO",
            size = 10,
            order = 16,
            completeWith = "",
            defaultValue = "")
    private String tituloDataEmissao;

    //DD.MM.YYYY
    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-E-DVCTO-TITLO-COBR",
            description = "DATE DE VENCIMENTO DO TITULO",
            size = 10,
            order = 17,
            completeWith = "",
            defaultValue = "")
    private String tituloDataVencimento;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-E-CIDTFD-TPO-VCTO",
            description = "TIPO DE VENCIMENTO",
            size = 1,
            order = 18,
            completeWith = "0",
            defaultValue = "1")
    private String tituloTipoVencimento;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-E-CINDCD-ECONM-MOEDA",
            description = "CODIGO DE MOEDA",
            size = 5,
            order = 19,
            completeWith = "0",
            defaultValue = "6")
    private String tituloCodigoMoeda;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-E-VNMNAL-TITLO-COBR",
            description = "VALOR DO TITULO",
            size = 17,
            order = 20,
            completeWith = "0",
            defaultValue = "")
    private String tituloValor;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-E-QMOEDA-NEGOC-TITLO",
            description = "QUANTIDADE DE MOEDA",
            size = 17,
            order = 21,
            completeWith = "0",
            defaultValue = "")
    private String tituloQtdeMoeda;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-E-CESPCE-TITLO-COBR",
            description = "ESPECIE",
            size = 2,
            order = 22,
            completeWith = "0",
            defaultValue = "02")
    private String tituloEspecie;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-E-CINDCD-ACEIT-SACDO",
            description = "ACEITE",
            size = 1,
            order = 23,
            completeWith = "",
            defaultValue = "")
    private String tituloAceite;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-E-CTPO-PROTE-TITLO",
            description = "TIPO PROTESTO/NEGOCIACAO",
            size = 2,
            order = 24,
            completeWith = "0",
            defaultValue = "")
    private String tituloTipoProtestoNegociacao;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-E-CTPO-PRZ-PROTE",
            description = "QUANTIDADE DIAS PROTESTO",
            size = 2,
            order = 25,
            completeWith = "0",
            defaultValue = "")
    private String tituloQtdeDiasProtesto;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-E-CTPO-PROTE-DECURS",
            description = "TIPO DECURSO PRAZO",
            size = 2,
            order = 26,
            completeWith = "0",
            defaultValue = "")
    private String tituloTipoDecursoPrazo;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-E-CTPO-PRZ-DECURS",
            description = "QUANTIDADE DE DIAS",
            size = 2,
            order = 27,
            completeWith = "0",
            defaultValue = "")
    private String tituloQtdeDiasDecurso;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-E-CCTRL-PARTC-TITLO",
            description = "CONTROLE PARTICIPANTE",
            size = 25,
            order = 28,
            completeWith = "",
            defaultValue = "")
    private String tituloControleParticipante;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-E-CFORMA-EMIS-PPLTA",
            description = "BANCO EMITE PAPELETA",
            size = 2,
            order = 29,
            completeWith = "0",
            defaultValue = "")
    private String tituloTipoEmissaoPapeleta;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-E-CINDCD-PGTO-PARCIAL",
            description = "INDICADOR DE PGTO PARCIAL",
            size = 1,
            order = 30,
            completeWith = "",
            defaultValue = "")
    private String tituloPagtoParcial;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-E-QTDE-PGTO-PARCIAL",
            description = "QTDADE. PAGAMENTOS PARCIAIS",
            size = 3,
            order = 31,
            completeWith = "0",
            defaultValue = "0")
    private String tituloQtdeParcelas;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-FILLER1",
            description = "",
            size = 36,
            order = 32,
            completeWith = "",
            defaultValue = "")
    private String filler1;
}