package br.com.setia.mainframe;

import br.com.setia.mainframe.message.sample.SampleMessageRequestSpec;
import br.com.setia.mainframe.message.sample.SampleMessageResponseSpec;
import br.com.setia.mainframe.message.sample.SetiaMessageHandler;

public class SampleMessageUsage {
    public static void main(String[] args) throws NoSuchFieldException, InstantiationException, IllegalAccessException {
        System.out.println("Sample message generator usage");

        // Prepare request message - POJO * Set only required information
        SampleMessageRequestSpec messageRequestData = SampleMessageRequestSpec.builder()
                .codigoLayout("CODEW999")
                .tamanhoLayout("2012")
                .codigoUsuario("SETIASM")
                .tipoAcesso("1")
                .chaveArqPessoaJuridica("99801")
                .chaveArqTipoContratoNeg("78444")
                .chaveArqNumSeqContrato("12457")
                .chaveLegCodigoProduto("12")
                .chaveLegCodigoNegociacao("457878")
                .tituloCodigoBanco("999")
                .tituloNroSeqContrato("1")
                .tituloTipoRegistro("784444")
                .tituloCodigoProduto("12345678")
                .tituloNossoNumero("12312312345")
                .tituloSeuNumero("CODREFPRD00465456400")
                .tituloDataEmissao("01.12.2012")
                .tituloDataVencimento("04.12.2012")
                .tituloTipoVencimento("BRL")
                .tituloValor("15099")
                .build();

        //Declare message handler
        SetiaMessageHandler messageHandler = new SetiaMessageHandler();
        String textMessage = messageHandler.prepareMessageRequest(messageRequestData);

        //Convert POJO to String
        System.out.println("==============================================================");
        System.out.println("FROM POJO TO TEXT MESSAGE");
        System.out.println(textMessage);

        //Convert String to POJO
        System.out.println("==============================================================");
        System.out.println("FROM TEXT MESSAGE TO POJO");
        SampleMessageResponseSpec messageResponse = messageHandler.getMessageResponse(textMessage, SampleMessageResponseSpec.class);
        System.out.println(messageResponse);
    }
}
