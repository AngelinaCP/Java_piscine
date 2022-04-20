package Day01.ex03;

import java.util.LinkedList;
import java.util.UUID;

interface TransactionListinterface {
    void addTransaction(Transaction newTransaction);
    void removeTransaction(UUID id);
    Transaction[] transformInArray();

}