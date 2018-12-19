package org.web3j.protocol.exceptions;

/**
 * Transaction timeout exception indicates that we have breached some threshold waiting for a
 * transaction to execute.
 */
public class TransactionException extends Exception {

    private String transactionHash;

    public TransactionException(String message) {
        super(message);
    }

    public TransactionException(String message, String transactionHash) {
        super(message);
        this.transactionHash = transactionHash;
    }

    public TransactionException(Throwable cause) {
        super(cause);
    }

    /**
     * Obtain the transaction hash .
     * @return optional transaction hash .
     */
    public String getTransactionHash() {
        return transactionHash;
    }
}
