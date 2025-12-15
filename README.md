# 🎬 Mini TikTok (Java)
Projeto realizado para disciplina de Programação II - IFPB

Desenvolvido em **Java (console)** que simula, de forma simplificada, algumas funcionalidades básicas de uma plataforma estilo **TikTok**.

O objetivo é demonstrar **boas práticas de programação orientada a objetos**, uso correto de **coleções**, **persistência em arquivo**, **organização em camadas/packages** e **testes unitários básicos**.

---

## 📌 Tecnologias utilizadas

* **Java 17**
* **Maven** (gerenciamento do projeto)
* **Gson** (persistência em JSON)
* **JUnit 5** (testes unitários)
* Execução via **console**

---

## 🧱 Arquitetura do projeto

O projeto é organizado em **packages**, cada um representando uma camada lógica:

```
src/
 ├─ main/
 │   └─ java/
 │       ├─ app/         → aplicação (Main)
 │       ├─ model/       → classes de domínio
 │       ├─ service/     → regras de negócio
 │       ├─ repository/  → persistência em arquivo
 │       └─ util/        → utilitários
 └─ test/
     └─ java/
         └─ test/        → testes unitários
```

### 📦 Camada `model`

Contém apenas as **entidades do domínio**, sem lógica de I/O ou persistência:

* `Usuario`
* `Video`
* `Comentario`

📌 Datas são armazenadas como `String` (formato ISO-8601) para simplificar a persistência em JSON.

---

## 🧩 Funcionalidades implementadas

* Cadastro de usuários
* Postagem de vídeos (metadados)
* Curtidas (sem duplicação)
* Comentários em vídeos
* Sistema de seguir/seguidores
* Feed personalizado (vídeos dos seguidos, ordenados por data)
* Busca de vídeos por hashtag
* Persistência em arquivos JSON

---

## 📚 Estruturas de dados utilizadas

Todas as coleções foram usadas de forma **justificada**, conforme solicitado:

* **List**

  * Lista de vídeos
  * Comentários de um vídeo
  * Feed do usuário

* **Set**

  * Curtidas (evita duplicação)
  * Hashtags
  * Seguidores

* **Map**

  * Relacionamento seguidores/seguidos
  * Índice de hashtags (`hashtag → lista de vídeos`)

---

## 💾 Persistência

* Dados são salvos e lidos a partir de arquivos **JSON**
* Implementação feita com a biblioteca **Gson**
* Arquivos gerados automaticamente:

  * `usuarios.json`
  * `videos.json`

📌 Não é utilizado banco de dados.

---

## 🧪 Testes unitários

* Implementados com **JUnit 5**
* Exemplo de teste:

  * Verificação de que um usuário não pode curtir o mesmo vídeo duas vezes

Os testes estão localizados em:

```
src/test/java/test
```

---

## ▶️ Como executar o projeto

### 1️⃣ Compilar e testar

No diretório do `pom.xml`, execute:

```bash
mvn clean install
```

### 2️⃣ Executar a aplicação

```bash
mvn exec:java
```

Ou, após gerar o JAR:

```bash
java -jar target/mini-tiktok-1.0.jar
```

---

## 🖥️ Exemplo de saída

```
=== MINI TIKTOK ===

--- FEED DA ALICE ---
bob | Meu primeiro vídeo | ❤️ 1 | 👁 0

--- BUSCA #java ---
bob | Meu primeiro vídeo | ❤️ 1 | 👁 0
```

---

## 🎓 Observações finais

* O projeto prioriza **clareza**, **organização** e **boas práticas**
* A separação em camadas facilita manutenção e entendimento
* A solução foi pensada para **avaliação acadêmica**

---

## 👤 Autoria: Renata Ingryd Alves de Vasconcelos

Projeto desenvolvido para fins educacionais.
