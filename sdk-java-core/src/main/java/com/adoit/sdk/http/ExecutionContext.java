package com.adoit.sdk.http;

import com.adoit.sdk.RequestHandler;
import com.adoit.sdk.auth.CredentialsProvider;
import com.adoit.sdk.auth.Signer;

import java.util.List;

public class ExecutionContext {
    private Signer signer;
    private CredentialsProvider credentialsProvider;
    private List<RequestHandler> requestHandlers;

    private ExecutionContext(final Builder builder) {
        this.signer = builder.getSigner();
        this.credentialsProvider = builder.getCredentialsProvider();
        this.requestHandlers = builder.getRequestHandlers();
    }

    public Signer getSigner() {
        return signer;
    }

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public List<RequestHandler> getRequestHandlers() {
        return requestHandlers;
    }

    public Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Signer signer;
        private CredentialsProvider credentialsProvider;
        private List<RequestHandler> requestHandlers;

        private Builder() {
        }

        public Builder withSigner(Signer signer) {
            this.signer = signer;
            return this;
        }

        public Builder withCredentialsProvider(CredentialsProvider credentialsProvider) {
            this.credentialsProvider = credentialsProvider;
            return this;
        }

        public Builder withRequestHandlers(List<RequestHandler> requestHandlers) {
            this.requestHandlers = requestHandlers;
            return this;
        }

        public Signer getSigner() {
            return signer;
        }

        public CredentialsProvider getCredentialsProvider() {
            return credentialsProvider;
        }

        public List<RequestHandler> getRequestHandlers() {
            return requestHandlers;
        }

        public ExecutionContext build() {
            return new ExecutionContext(this);
        }
    }
}
