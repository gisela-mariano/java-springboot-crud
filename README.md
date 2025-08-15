# java-springboot-crud

Este projeto é uma demonstração de um sistema CRUD (Create, Read, Update, Delete) utilizando o framework Spring Boot em Java.

## Visão geral

O repositório está estruturado conforme as melhores práticas de projetos Spring Boot, com separação clara entre código-fonte principal (`src/main`) e testes (`src/test`). O gerenciamento de dependências é feito pelo Maven, utilizando o arquivo `pom.xml`.

## Estratégias Utilizadas

- **Spring Boot**: O projeto utiliza o Spring Boot para facilitar a configuração e o desenvolvimento de aplicações Java modernas, aproveitando a injeção de dependência, inicialização automática e servidor embutido.
- **Arquitetura em Camadas**: A estrutura do projeto segue o padrão clássico de camadas (Controller, Service, Repository), promovendo separação de responsabilidades, facilitando manutenção e testes.
- **Maven**: Gerenciamento de dependências e ciclo de vida do projeto automatizado via Maven.
- **Testes**: Estrutura reservada em `src/test` para testes unitários e de integração, promovendo qualidade e confiabilidade do código.
- **Boas Práticas de Versionamento**: Uso de arquivos `.gitignore` e `.gitattributes` para excluir arquivos desnecessários e garantir portabilidade.
- **Padronização de Código**: Organização dos diretórios e arquivos conforme convenções do Spring Boot, facilitando o entendimento e colaboração.

## Como rodar o projeto

1. Certifique-se de ter o Java e o Maven instalados.
2. Clone o repositório:
   ```bash
   git clone https://github.com/gisela-mariano/java-springboot-crud.git
   ```
3. Navegue até o diretório do projeto e execute:
   ```bash
   mvn spring-boot:run
   ```

	 ou, se preferir, adicionar o seguinte `launch.json`:

	 ```json
	  {
			"configurations": [
				{
					"type": "java",
					"name": "Application",
					"request": "launch",
					"mainClass": "java_springboot_crud.Application",
					"projectName": "java-springboot-crud"
				},
			]
		}
	 ```

## Acessando documentação da API:
A documentação está disponível no http://localhost:8080/swagger-ui/index.html#/

## Estrutura Principal

- **pom.xml**: Gerenciamento de dependências e plugins.
- **src/main**: Código-fonte principal da aplicação.
- **src/test**: Testes automatizados.

## Objetivo

Este projeto serve como base para quem deseja aprender ou implementar operações CRUD com Java e Spring Boot, podendo ser expandido para aplicações reais de maior porte.