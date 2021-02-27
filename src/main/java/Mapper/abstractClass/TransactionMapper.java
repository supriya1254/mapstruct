package Mapper.abstractClass;

import Entity.Transaction;
import Entity.TransactionDTO;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
abstract class TransactionMapper {

  public TransactionDTO toTransactionDTO(Transaction transaction) {
    TransactionDTO transactionDTO = new TransactionDTO();
    transactionDTO.setUuid(transaction.getUuid());

    //this is how we will convert BigDecimal to Long

    transactionDTO.setTotalInCents(transaction.getTotal()
    .multiply(new BigDecimal("100")).longValue());

    return transactionDTO;
  }

  //map Collection to a List abstract

  public abstract List<TransactionDTO> toTransactionDTO(
    Collection<Transaction> transactions);
}
