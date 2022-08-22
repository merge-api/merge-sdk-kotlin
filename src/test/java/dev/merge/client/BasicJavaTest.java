package dev.merge.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import dev.merge.client.accounting.models.Account;
import dev.merge.client.ats.apis.CandidatesApi;
import dev.merge.client.accounting.apis.AccountsApi;
import dev.merge.client.ats.models.Candidate;
import dev.merge.client.shared.MergePaginatedResponse;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class BasicJavaTest extends TestCase {

    @Test
    @Disabled
    public void testBasic() throws InterruptedException, ExecutionException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        String apiKey = "REDACTED";

        AccountsApi accountsApi = new AccountsApi();
        accountsApi.setApiKey(apiKey);
        accountsApi.setAccountToken("REDACTED");

        CandidatesApi candidatesApi = new CandidatesApi();
        candidatesApi.setApiKey(apiKey);
        candidatesApi.setAccountToken("REDACTED");

        CompletableFuture<MergePaginatedResponse<Account>> accountingAccountsPromise = accountsApi.accountsListAsync(
                new AccountsApi.AccountsListRequest()
        );

        CandidatesApi.CandidatesListRequest expandRequest = new CandidatesApi.CandidatesListRequest(
                null, null, null,
                "applications",
                null, null, null, null, null, null, null, null
        );
        CompletableFuture<MergePaginatedResponse<Candidate.Expanded>> atsCandidatesExpandedPromise =
                candidatesApi.candidatesListExpandedAsync(
                        expandRequest
                );

        // check all results

        // vanilla accounting category call
        MergePaginatedResponse<Account> accountingAccountsResponse = accountingAccountsPromise.get();

        assertNotNull(accountingAccountsResponse);
        assertNotNull(accountingAccountsResponse.getResults());
        try {
            System.out.println(mapper.writeValueAsString(accountingAccountsResponse));
        } catch (JsonProcessingException exc) {
            System.out.println(exc.getMessage());
        }

        // get candidates with expand=applications, check we have an expanded application sub object
        MergePaginatedResponse<Candidate.Expanded> atsCandidatesExpandedResponse = atsCandidatesExpandedPromise.get();

        assertNotNull(atsCandidatesExpandedResponse);
        assertNotNull(atsCandidatesExpandedResponse.getResults());
        try {
            System.out.println(mapper.writeValueAsString(atsCandidatesExpandedResponse));
        } catch (JsonProcessingException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
