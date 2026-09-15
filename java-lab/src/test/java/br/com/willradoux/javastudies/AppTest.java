package br.com.willradoux.javastudies;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test
    void shouldReturnLabStatus() {
        assertThat(App.status()).isEqualTo("Java Studies Lab pronto");
    }
}
