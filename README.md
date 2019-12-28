# mainframe-request-msg-lib
Java Mainframe text message generator based on annotations and reflection

## Usage
```java
// Prepare request message - POJO
SampleMessageRequestSpec messageRequestData = SampleMessageRequestSpec.builder()
        .fieldName1("CODEW999")
        .[MORE_FIELDS...]
        .build();

//Declare message handler
SetiaMessageHandler messageHandler = new SetiaMessageHandler();

//Convert POJO to String
String textMessage = messageHandler.prepareMessageRequest(messageRequestData);

//Convert String to POJO
SampleMessageResponseSpec messageResponse = messageHandler.getMessageResponse(textMessage, SampleMessageResponseSpec.class);
```

## Support
+ Java Compile version: 1.8

## License
__mainframe-request-msg-lib__ is licensed under an Apache-2.0 license