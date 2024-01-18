package com.example.test;

import com.example.test.booking.BookingApiResponse;
import com.example.test.search.HotelSearchApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.Response;

@RestController
@Slf4j
public class TestController {

  @PostMapping()
  public HotelSearchApiResponse doSearch () throws JsonProcessingException, InterruptedException {
    Thread.sleep(2000);
    String jsonString = "{\"data\":{\"hotelX\":{\"search\":{\"context\":\"MGHO\",\"auditData\":{\"transactions\":[],\"timeStamp\":\"\"},\"requestCriteria\":{\"checkIn\":\"2024-02-07\",\"checkOut\":\"2024-02-08\"},\"options\":[{\"surcharges\":null,\"accessCode\":\"24627\",\"supplierCode\":\"MGHO\",\"markets\":[\"ID\"],\"hotelCode\":\"ID#ID-BDO#ID10001275\",\"hotelName\":\"JanevallaBandung\",\"boardCode\":\"BDBF\",\"paymentType\":\"MERCHANT\",\"status\":\"OK\",\"occupancies\":[{\"paxes\":[{\"age\":30},{\"age\":30}]}],\"rooms\":[{\"occupancyRefId\":1,\"promotions\":null,\"code\":\"RM_1382_2\",\"description\":\"SUPERIOR\",\"refundable\":true,\"surcharges\":null,\"beds\":null,\"amenities\":null,\"units\":null,\"roomPrice\":{\"breakdown\":[{\"start\":\"2024-02-07\",\"end\":\"2024-02-08\",\"price\":{\"currency\":\"IDR\",\"net\":621575}}],\"price\":{\"currency\":\"IDR\",\"binding\":false,\"net\":621575,\"gross\":621575,\"exchange\":{\"currency\":\"IDR\",\"rate\":1},\"markups\":null}},\"ratePlans\":null}],\"price\":{\"currency\":\"IDR\",\"binding\":false,\"net\":621575,\"gross\":621575,\"exchange\":{\"currency\":\"IDR\",\"rate\":1},\"markups\":null},\"supplements\":null,\"rateRules\":null,\"cancelPolicy\":{\"refundable\":true,\"cancelPenalties\":[{\"hoursBefore\":96,\"deadline\":\"2024-02-02T10:00:00Z\",\"penaltyType\":\"PERCENT\",\"currency\":\"IDR\",\"value\":100},{\"hoursBefore\":0,\"deadline\":\"2024-02-06T10:00:00Z\",\"penaltyType\":\"PERCENT\",\"currency\":\"IDR\",\"value\":100}]},\"remarks\":\"SpecialInstructions-Pleasenotethatourratesdonotincludeexpensesorfeeswhichmustbesettledbytheguestatthehotel,suchasresortfees,citytax,parking,gratuities,andsuchothers.\",\"token\":\"\",\"id\":\"13[%!03!~|3[%@240207!~|240208!~|ID#ID-BDO#ID10001275!~|BDBF!~|0!~|ID!~|ID!~|id!~|IDR!~|0!~|24627!~|ID#ID-BDO#ID10001275!~|BDBF!~|1!~|0!~|11011315!~|!~|621575[%@0[%@false[%@IDR[%@[%@0[%@!~|1#RM_1382_2!~|RM_1382_2[%!RM_1382_2!~|30[%@30!~|!~|SUPERIOR!~|1!~|!~|cancellationPolicyType[%@Flexi[%!currency[%@IDR[%!raterules[%@NONE!~|OK!~|Sith!~|0!~|\"},{\"surcharges\":null,\"accessCode\":\"24627\",\"supplierCode\":\"MGHO\",\"markets\":[\"ID\"],\"hotelCode\":\"ID#ID-BDO#ID10001275\",\"hotelName\":\"JanevallaBandung\",\"boardCode\":\"BDBF\",\"paymentType\":\"MERCHANT\",\"status\":\"OK\",\"occupancies\":[{\"paxes\":[{\"age\":30},{\"age\":30}]}],\"rooms\":[{\"occupancyRefId\":1,\"promotions\":null,\"code\":\"RM_1382_0\",\"description\":\"DELUXE\",\"refundable\":true,\"surcharges\":null,\"beds\":null,\"amenities\":null,\"units\":null,\"roomPrice\":{\"breakdown\":[{\"start\":\"2024-02-07\",\"end\":\"2024-02-08\",\"price\":{\"currency\":\"IDR\",\"net\":919931}}],\"price\":{\"currency\":\"IDR\",\"binding\":false,\"net\":919931,\"gross\":919931,\"exchange\":{\"currency\":\"IDR\",\"rate\":1},\"markups\":null}},\"ratePlans\":null}],\"price\":{\"currency\":\"IDR\",\"binding\":false,\"net\":919931,\"gross\":919931,\"exchange\":{\"currency\":\"IDR\",\"rate\":1},\"markups\":null},\"supplements\":null,\"rateRules\":null,\"cancelPolicy\":{\"refundable\":true,\"cancelPenalties\":[{\"hoursBefore\":96,\"deadline\":\"2024-02-02T10:00:00Z\",\"penaltyType\":\"PERCENT\",\"currency\":\"IDR\",\"value\":100},{\"hoursBefore\":0,\"deadline\":\"2024-02-06T10:00:00Z\",\"penaltyType\":\"PERCENT\",\"currency\":\"IDR\",\"value\":100}]},\"remarks\":\"SpecialInstructions-Pleasenotethatourratesdonotincludeexpensesorfeeswhichmustbesettledbytheguestatthehotel,suchasresortfees,citytax,parking,gratuities,andsuchothers.\",\"token\":\"\",\"id\":\"13[%!03!~|3[%@240207!~|240208!~|ID#ID-BDO#ID10001275!~|BDBF!~|0!~|ID!~|ID!~|id!~|IDR!~|0!~|24627!~|ID#ID-BDO#ID10001275!~|BDBF!~|1!~|0!~|11011315!~|!~|919931[%@0[%@false[%@IDR[%@[%@0[%@!~|1#RM_1382_0!~|RM_1382_0[%!RM_1382_0!~|30[%@30!~|!~|DELUXE!~|1!~|!~|cancellationPolicyType[%@Flexi[%!currency[%@IDR[%!raterules[%@NONE!~|OK!~|Sith!~|0!~|\"},{\"surcharges\":null,\"accessCode\":\"24627\",\"supplierCode\":\"MGHO\",\"markets\":[\"ID\"],\"hotelCode\":\"ID#ID-BDO#ID10001275\",\"hotelName\":\"JanevallaBandung\",\"boardCode\":\"BDBF\",\"paymentType\":\"MERCHANT\",\"status\":\"OK\",\"occupancies\":[{\"paxes\":[{\"age\":30},{\"age\":30}]}],\"rooms\":[{\"occupancyRefId\":1,\"promotions\":null,\"code\":\"RM_1382_1\",\"description\":\"GRANDDELUXE\",\"refundable\":true,\"surcharges\":null,\"beds\":null,\"amenities\":null,\"units\":null,\"roomPrice\":{\"breakdown\":[{\"start\":\"2024-02-07\",\"end\":\"2024-02-08\",\"price\":{\"currency\":\"IDR\",\"net\":1466917}}],\"price\":{\"currency\":\"IDR\",\"binding\":false,\"net\":1466917,\"gross\":1466917,\"exchange\":{\"currency\":\"IDR\",\"rate\":1},\"markups\":null}},\"ratePlans\":null}],\"price\":{\"currency\":\"IDR\",\"binding\":false,\"net\":1466917,\"gross\":1466917,\"exchange\":{\"currency\":\"IDR\",\"rate\":1},\"markups\":null},\"supplements\":null,\"rateRules\":null,\"cancelPolicy\":{\"refundable\":true,\"cancelPenalties\":[{\"hoursBefore\":144,\"deadline\":\"2024-01-31T10:00:00Z\",\"penaltyType\":\"NIGHTS\",\"currency\":\"IDR\",\"value\":1},{\"hoursBefore\":96,\"deadline\":\"2024-02-02T10:00:00Z\",\"penaltyType\":\"PERCENT\",\"currency\":\"IDR\",\"value\":100},{\"hoursBefore\":0,\"deadline\":\"2024-02-06T10:00:00Z\",\"penaltyType\":\"PERCENT\",\"currency\":\"IDR\",\"value\":100}]},\"remarks\":\"SpecialInstructions-Pleasenotethatourratesdonotincludeexpensesorfeeswhichmustbesettledbytheguestatthehotel,suchasresortfees,citytax,parking,gratuities,andsuchothers.\",\"token\":\"\",\"id\":\"13[%!03!~|3[%@240207!~|240208!~|ID#ID-BDO#ID10001275!~|BDBF!~|0!~|ID!~|ID!~|id!~|IDR!~|0!~|24627!~|ID#ID-BDO#ID10001275!~|BDBF!~|1!~|0!~|11011315!~|!~|1466917[%@0[%@false[%@IDR[%@[%@0[%@!~|1#RM_1382_1!~|RM_1382_1[%!RM_1382_1!~|30[%@30!~|!~|GRANDDELUXE!~|1!~|!~|cancellationPolicyType[%@Flexi[%!currency[%@IDR[%!raterules[%@NONE!~|OK!~|Sith!~|0!~|\"},{\"surcharges\":null,\"accessCode\":\"24627\",\"supplierCode\":\"MGHO\",\"markets\":[\"ID\"],\"hotelCode\":\"ID#ID-BDO#ID10001275\",\"hotelName\":\"JanevallaBandung\",\"boardCode\":\"RO\",\"paymentType\":\"MERCHANT\",\"status\":\"OK\",\"occupancies\":[{\"paxes\":[{\"age\":30},{\"age\":30}]}],\"rooms\":[{\"occupancyRefId\":1,\"promotions\":null,\"code\":\"RM_1382_2\",\"description\":\"SUPERIOR\",\"refundable\":true,\"surcharges\":null,\"beds\":null,\"amenities\":null,\"units\":null,\"roomPrice\":{\"breakdown\":[{\"start\":\"2024-02-07\",\"end\":\"2024-02-08\",\"price\":{\"currency\":\"IDR\",\"net\":1187652.66}}],\"price\":{\"currency\":\"IDR\",\"binding\":false,\"net\":1187652.66,\"gross\":1187652.66,\"exchange\":{\"currency\":\"IDR\",\"rate\":1},\"markups\":null}},\"ratePlans\":null}],\"price\":{\"currency\":\"IDR\",\"binding\":false,\"net\":1187652.66,\"gross\":1187652.66,\"exchange\":{\"currency\":\"IDR\",\"rate\":1},\"markups\":null},\"supplements\":null,\"rateRules\":null,\"cancelPolicy\":{\"refundable\":true,\"cancelPenalties\":[{\"hoursBefore\":144,\"deadline\":\"2024-01-31T10:00:00Z\",\"penaltyType\":\"NIGHTS\",\"currency\":\"IDR\",\"value\":1},{\"hoursBefore\":0,\"deadline\":\"2024-02-06T10:00:00Z\",\"penaltyType\":\"NIGHTS\",\"currency\":\"IDR\",\"value\":1}]},\"remarks\":\"SpecialInstructions-Pleasenotethatourratesdonotincludeexpensesorfeeswhichmustbesettledbytheguestatthehotel,suchasresortfees,citytax,parking,gratuities,andsuchothers.\",\"token\":\"\",\"id\":\"13[%!03!~|3[%@240207!~|240208!~|ID#ID-BDO#ID10001275!~|RO!~|0!~|ID!~|ID!~|id!~|IDR!~|0!~|24627!~|ID#ID-BDO#ID10001275!~|RO!~|1!~|0!~|11011315!~|!~|1187652.66[%@0[%@false[%@IDR[%@[%@0[%@!~|1#RM_1382_2!~|RM_1382_2[%!RM_1382_2!~|30[%@30!~|!~|SUPERIOR!~|1!~|!~|cancellationPolicyType[%@Flexi[%!currency[%@IDR[%!raterules[%@NONE!~|OK!~|Sith!~|0!~|\"}],\"warnings\":null,\"errors\":null}}}}";
    ObjectMapper objectMapper = new ObjectMapper();
    TypeReference<HotelSearchApiResponse> responseType = new TypeReference<HotelSearchApiResponse>() {};
    retrofit2.Response<HotelSearchApiResponse> retrofitResponse;
    HotelSearchApiResponse response = objectMapper.readValue(jsonString, responseType);
//    retrofitResponse = Response.success(response);

    log.error(String.valueOf(response));
    return response;
  }

//  @PostMapping()
//  public BookingApiResponse doSearch () throws JsonProcessingException, InterruptedException {
//    Thread.sleep(4000);
//    String jsonString = "{\"data\":{\"hotelX\":{\"book\":{\"auditData\":{\"transactions\":[{\"request\":\"\",\"response\":\"\"}],\"timeStamp\":\"\"},\"booking\":{\"price\":{\"currency\":\"IDR\",\"binding\":false,\"net\":601008,\"gross\":601008,\"exchange\":{\"currency\":\"IDR\",\"rate\":1},\"markups\":null},\"status\":\"OK\",\"remarks\":null,\"reference\":{\"client\":\"TRA1234TEST\",\"supplier\":\"AGID0343292401036911\",\"bookingID\":\"1@1[240112[240113[240110[ID#ID-CGK#ID10000163[en[IDR[23226[TRA1234TEST[AGID0343292401036911\"},\"holder\":null,\"hotel\":{\"bookingDate\":null,\"start\":null,\"end\":null,\"hotelCode\":\"ID#ID-CGK#ID10000163\",\"hotelName\":null,\"boardCode\":null,\"occupancies\":null,\"rooms\":null}},\"errors\":null,\"warnings\":null}}}}";
//
//    ObjectMapper objectMapper = new ObjectMapper();
//    TypeReference<BookingApiResponse> responseType = new TypeReference<BookingApiResponse>() {};
//    retrofit2.Response<HotelSearchApiResponse> retrofitResponse;
//    BookingApiResponse response = objectMapper.readValue(jsonString, responseType);
////    retrofitResponse = Response.success(response);
//
//    log.error(String.valueOf(response));
//    return response;
//  }
}