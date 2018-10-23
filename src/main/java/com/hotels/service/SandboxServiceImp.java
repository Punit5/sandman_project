package com.hotels.service;

import com.hotels.bean.HotelInfo;
import com.hotels.bean.SandboxResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.List;

@PropertySource("classpath:sandbox.properties")
@Service
public class SandboxServiceImp implements AllHotelService {

    @Value("${url}")
    private String url;

    @Value("${key}")
    private String key;

    private String baseRequstUrl;

    @PostConstruct
    public void start() {
        baseRequstUrl = new StringBuilder().append(url).append("?apikey=").append(key).toString();
    }

    public List<HotelInfo> getInfo(String location, String checkinDate, String checkOutDate) {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(baseRequstUrl)
                .append("&location=")
                .append(location)
                .append("&check_in=")
                .append(checkinDate)
                .append("&check_out=")
                .append(checkOutDate);

        SandboxResult sandboxResult;
        try {
            sandboxResult = new RestTemplate().getForObject(stringBuilder.toString(), SandboxResult.class);
        } catch (RestClientException e) {
            throw new RuntimeException(e.getMessage());
        }
        return sandboxResult.getResults();
    }
}
