# Sistema de Gerenciamento de Veículos

## Descrição
Este projeto é um sistema simples de gerenciamento de veículos desenvolvido em Java. Ele utiliza conceitos de **Orientação a Objetos**, como:
- **Herança**
- **Classes Abstratas**
- **Métodos de Acesso (Getters e Setters)**

O objetivo é criar um sistema que permita gerenciar informações básicas de veículos, incluindo carros e motos, e exibir essas informações.

## Estrutura do Projeto
O projeto está organizado da seguinte forma:

### Arquivos:
- **Veiculo.java**: Classe abstrata que define atributos comuns a todos os veículos e métodos para acesso ao ano do veículo.
- **Carro.java**: Classe que herda de `Veiculo` e adiciona o atributo `numeroPortas`.
- **Moto.java**: Classe que herda de `Veiculo` e adiciona o atributo privado `cilindrada`.
- **Main.java**: Classe principal que instancia objetos de `Carro` e `Moto`, define seus atributos e exibe suas informações.

## Funcionalidades
- Permite definir e acessar atributos de veículos, como marca, modelo, ano de fabricação, número de portas (para carros) e cilindrada (para motos).
- Exibe as informações completas do veículo usando o método `informacoesVeiculo()`.

## Requisitos
- **Java JDK 8** ou superior.

## Como Executar

### Passo 1: Clonar o Repositório
git clone https://github.com/gabinhonf/AP2---Gabriel-Nunes-Fonseca.git
### Passo 2: Compilar o Projeto
javac src/*.java

### Passo 3: Executar o Projeto
java -cp src Main

