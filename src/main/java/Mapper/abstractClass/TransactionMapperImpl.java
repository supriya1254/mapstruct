package Mapper.abstractClass;

import Entity.Transaction;
import Entity.TransactionDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TransactionMapperImpl extends TransactionMapper{

  @Override
  public List<TransactionDTO> toTransactionDTO(Collection<Transaction> transactions) {
    if(transactions == null) {
      return null;
    }

    List<TransactionDTO> list = new ArrayList<>();
    for (Transaction transaction : transactions)
    {
      list.add(toTransactionDTO(transaction)); // this is the place where we are using generated Result
                                              // from TransactionMapper class
    }
    return list;
  }
}
