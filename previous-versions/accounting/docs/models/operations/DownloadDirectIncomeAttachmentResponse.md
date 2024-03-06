# DownloadDirectIncomeAttachmentResponse


## Fields

| Field                                                                                                                         | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `contentType`                                                                                                                 | *String*                                                                                                                      | :heavy_check_mark:                                                                                                            | HTTP response content type for this operation                                                                                 |
| `data`                                                                                                                        | *Optional<? extends InputStream>*                                                                                             | :heavy_minus_sign:                                                                                                            | Success                                                                                                                       |
| `errorMessage`                                                                                                                | [Optional<? extends io.codat.accounting.models.components.ErrorMessage>](../../models/components/ErrorMessage.md)             | :heavy_minus_sign:                                                                                                            | Your API request was not properly authorized.                                                                                 |
| `statusCode`                                                                                                                  | *int*                                                                                                                         | :heavy_check_mark:                                                                                                            | HTTP response status code for this operation                                                                                  |
| `rawResponse`                                                                                                                 | [HttpResponse<InputStream>](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html) | :heavy_check_mark:                                                                                                            | Raw HTTP response; suitable for custom response parsing                                                                       |