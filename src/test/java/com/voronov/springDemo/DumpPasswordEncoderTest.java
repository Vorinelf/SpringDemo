package com.voronov.springDemo;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DumpPasswordEncoderTest {
    @Test
    public void encode() {
        DumpPasswordEncoder encoder = new DumpPasswordEncoder();

        Assert.assertEquals("secret: 'mypwd'",encoder.encode("mypwd"));
        Assert.assertThat(encoder.encode("mypwd"), Matchers.containsString("mypwd"));

    }
}