/*
 * Copyright 2013-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.kubernetes.configserver;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Ryan Baxter
 */

@ConfigurationProperties("spring.cloud.kubernetes.configserver")
public class KubernetesConfigServerProperties {

	private String conigMapNamespaces = "";

	private String secretsNamespaces = "";

	public String getConigMapNamespaces() {
		return conigMapNamespaces;
	}

	public void setConigMapNamespaces(String conigMapNamespaces) {
		this.conigMapNamespaces = conigMapNamespaces;
	}

	public String getSecretsNamespaces() {
		return secretsNamespaces;
	}

	public void setSecretsNamespaces(String secretsNamespaces) {
		this.secretsNamespaces = secretsNamespaces;
	}

}
