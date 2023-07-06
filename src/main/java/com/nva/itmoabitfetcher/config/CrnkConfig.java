package com.nva.itmoabitfetcher.config;

import io.crnk.core.boot.CrnkBoot;
import io.crnk.spring.setup.boot.core.CrnkBootConfigurer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CrnkConfig implements CrnkBootConfigurer {

    @Override
    public void configure(CrnkBoot crnkBoot) {
        crnkBoot.setAllowUnknownParameters();
    }
}
