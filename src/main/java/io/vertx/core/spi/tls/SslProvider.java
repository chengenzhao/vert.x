package io.vertx.core.spi.tls;

import io.vertx.core.net.KeyCertOptions;
import io.vertx.core.net.TCPSSLOptions;
import io.vertx.core.net.TrustOptions;

import java.util.List;

public interface SslProvider {

  SslContextFactory contextFactory(TCPSSLOptions options, KeyCertOptions keyCertOptions, TrustOptions trustOptions, List<String> applicationProtocols);

}
