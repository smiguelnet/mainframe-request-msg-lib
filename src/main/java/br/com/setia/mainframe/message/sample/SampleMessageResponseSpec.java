package br.com.setia.mainframe.message.sample;

import br.com.setia.mainframe.message.spec.SetiaMessageFieldAttr;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static br.com.setia.mainframe.message.spec.SetiaMessageFieldAttr.SetiaMessageFieldType;

/**
 * Sample Billet Registration Response Message
 *
 * @author Setia Tecnologia
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SampleMessageResponseSpec extends SampleMessageRequestSpec {

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-COD-LAYOUT",
            description = "CODIGO DO LAY-OUT",
            size = 8,
            order = 1,
            completeWith = "",
            defaultValue = "SAMPW3EI")
    private String codigoLayoutRet;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-TAM-LAYOUT",
            description = "TAMANHO DO LAY-OUT",
            size = 5,
            order = 2,
            completeWith = "0",
            defaultValue = "1000")
    private String tamanhoLayoutRet;

    /**
     * 01-FRAMEWORK
     * 02-BATCH
     */
    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-COD-ORIGEM",
            description = "CODIGO DE ORIGEM DA TRANSACAO",
            size = 2,
            order = 3,
            completeWith = "0",
            defaultValue = "0")
    private String codigoOrigemRet;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-COD-FUNCAO",
            description = "CODIGO DE FUNCAO",
            size = 2,
            order = 4,
            completeWith = "",
            defaultValue = "")
    private String codigoFuncaoRet;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-SEQ-FUNCAO",
            description = "CODIGO DA SEQUENCIA DA FUNCAO",
            size = 2,
            order = 5,
            completeWith = "0",
            defaultValue = "0")
    private String codigoSequenciaFuncaoRet;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-PGM-CHAMADOR",
            description = "PROGRAMA CHAMADOR DO MODULO ACESSADO",
            size = 8,
            order = 6,
            completeWith = "",
            defaultValue = "")
    private String programaChamadorRet;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-AREA-SESSAO",
            description = "AREA PADRAO DO FRAMEWORK RECUPERADA DA SESSAO",
            size = 263,
            order = 7,
            completeWith = "",
            defaultValue = "")
    private String areaSessaoRet;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-RESERVA-ENVIO",
            description = "FILLER",
            size = 50,
            order = 8,
            completeWith = "",
            defaultValue = "")
    private String reservaEnvioRet;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.NUMERIC,
            field = "SAMPLEB-COD-RETORNO",
            description = "CODIGO DE RETORNO",
            size = 2,
            order = 9,
            completeWith = "0",
            defaultValue = "0")
    private String codigoRetornoRet;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-COD-ERRO",
            description = "CODIGO DE ERRO",
            size = 4,
            order = 10,
            completeWith = "",
            defaultValue = "")
    private String codigoErroRet;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-COD-MENSAGEM",
            description = "CODIGO DE MENSAGEM",
            size = 8,
            order = 11,
            completeWith = "",
            defaultValue = "")
    private String codigoMensagemRet;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-RESERVA-RETORNO",
            description = "FILLER",
            size = 50,
            order = 12,
            completeWith = "",
            defaultValue = "")
    private String reservaRetornoRet;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-PROGRAMA-ERRO",
            description = "PROGRAMA ERRO",
            size = 8,
            order = 13,
            completeWith = "",
            defaultValue = "")
    private String programaErroRet;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-TIPO-ERRO",
            description = "TIPO ERRO",
            size = 4,
            order = 14,
            completeWith = "",
            defaultValue = "")
    private String tipoErroRet;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-AREA-ERRO",
            description = "AREA ERRO",
            size = 500,
            order = 15,
            completeWith = "",
            defaultValue = "")
    private String areaErroRet;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-RESERVA-ERRO",
            description = "FILLER",
            size = 50,
            order = 16,
            completeWith = "",
            defaultValue = "")
    private String reservaErroRet;

    @SetiaMessageFieldAttr(type = SetiaMessageFieldType.ALFA,
            field = "SAMPLEB-RESERVA",
            description = "FILLER",
            size = 34,
            order = 17,
            completeWith = "",
            defaultValue = "")
    private String reservaFinalRet;
}
