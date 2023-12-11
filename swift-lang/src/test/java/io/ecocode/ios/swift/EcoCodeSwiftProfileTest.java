package io.ecocode.ios.swift;

import org.junit.Test;
import org.sonar.api.server.profile.BuiltInQualityProfilesDefinition;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

public class EcoCodeSwiftProfileTest {

    @Test
    public void define() {
        EcoCodeSwiftProfile profile = new EcoCodeSwiftProfile();
        BuiltInQualityProfilesDefinition.Context context = new BuiltInQualityProfilesDefinition.Context();

        profile.define(context);
        BuiltInQualityProfilesDefinition.BuiltInQualityProfile ecoCodeProfile = context.profile(Swift.KEY, Swift.PROFILE_NAME);
        assertNotNull(ecoCodeProfile);
    }
}
