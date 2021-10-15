package fixtures.bodystring.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import fixtures.bodystring.AutoRestSwaggerBATServiceBuilder;
import fixtures.bodystring.EnumClient;

public class EnumPutNotExpandable {
    public static void main(String[] args) {
        EnumClient client = new AutoRestSwaggerBATServiceBuilder().host("http://localhost:3000").buildEnumClient();
        BinaryData stringBody = BinaryData.fromString("\"red color\"");
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response = client.putNotExpandableWithResponse(stringBody, requestOptions, Context.NONE);
    }
}
