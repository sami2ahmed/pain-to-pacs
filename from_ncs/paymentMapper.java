import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import iso.std.iso._20022.tech.xsd.pain_001_001.Document;
import java.time.LocalDate;

@Mapper
public interface Pain001Mapper {

    Pain001Mapper INSTANCE = Mappers.getMapper(Pain001Mapper.class);

    @Mapping(source = "cstmrCdtTrfInitn.grpHdr.msgId", target = "payhubTxnRef")
    @Mapping(source = "cstmrCdtTrfInitn.pmtInf[0].pmtInfId", target = "interfaceRefNo")
    @Mapping(source = "cstmrCdtTrfInitn.pmtInf[0].cdtTrfTxInf[0].pmtId.endToEndId", target = "customerRef")
    @Mapping(source = "cstmrCdtTrfInitn.pmtInf[0].cdtTrfTxInf[0].amt.instdAmt.amount", target = "settlmAmt")
    @Mapping(source = "cstmrCdtTrfInitn.pmtInf[0].cdtTrfTxInf[0].amt.instdAmt.currency", target = "settlmCurrencyCd")
    @Mapping(source = "cstmrCdtTrfInitn.pmtInf[0].dbtrAcct.id.othr[0].id", target = "debitAcct")
    @Mapping(source = "cstmrCdtTrfInitn.pmtInf[0].dbtr.nm", target = "debtrAcctNm")
    @Mapping(source = "cstmrCdtTrfInitn.grpHdr.creDtTm", target = "createdDt", dateFormat = "yyyy-MM-dd'T'HH:mm:ss")
    @Mapping(source = "cstmrCdtTrfInitn.pmtInf[0].cdtTrfTxInf[0].cdtr.nm", target = "creditAcctNm")
    TransactionMasterDTO mapToTransactionMasterDTO(Document document);
}
