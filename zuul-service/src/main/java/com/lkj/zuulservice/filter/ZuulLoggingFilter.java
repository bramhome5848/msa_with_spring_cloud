package com.lkj.zuulservice.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
@Slf4j
public class ZuulLoggingFilter extends ZuulFilter {

    //Logger logger = LoggerFactory.getLogger(ZuulLoggingFilter.class);

    @Override
    public Object run() throws ZuulException {  //실제 어떤 동작을 하는지 지정
        log.info("*************** printing logs : ");

        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info("*************** " + request.getRequestURI());
        return null;
    }

    @Override
    public String filterType() {    //사전 필터인지 사후 필터인지 확인하는 부분
        return "pre";   //사전 필터
    }

    @Override
    public int filterOrder() {  //여러 필터가 있을 경우 순서
        return 1;
    }

    @Override
    public boolean shouldFilter() { //해당 필터는 원하는 옵션에 따라 사용하거나 안하거나
        return true;
    }
}
