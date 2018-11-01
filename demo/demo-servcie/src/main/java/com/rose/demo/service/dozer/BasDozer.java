package com.rose.demo.service.dozer;

import org.dozer.DozerBeanMapper;

/**
 * Created by BG331163 on 2018/11/1.
 * Version 1.0.1
 */
public class BasDozer {
    private static DozerBeanMapper mapper = new DozerBeanMapper();

    public <V, P> P convert(V base, P target) {

        if (base != null) {
            mapper.map(base, target);
            return target;
        }
        return target;
    }

    public <V, P> P convert(V base, Class<P> target) {
        if (base == null) {
            return null;
        } else {
            P p = mapper.map(base, target);

            return p;
        }
    }


}
