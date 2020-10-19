package com.praj.tag.audit;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        //TODO Get the user from security system/ actual app/ user
        return Optional.of("System");
    }
}
