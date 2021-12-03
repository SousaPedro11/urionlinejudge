# Becrowd

Repositório para implementação de alguns problemas da plataforma [Beecrowd](https://www.beecrowd.com.br/)
antiga UriJudgeOnline.

## Motivação
Auxiliar o meu amigo [@Aquim2911](https://github.com/Aquim2911) no início de sua jornada como
programador.

## Estrutura do repositório
Na raiz do repositório encontram-se arquivos de configuração, propriedades e dependencias 
([requirements.txt](requirements.txt)).

Na pasta python há dois diretórios:
* [implementations](python/implementations): possui os arquivos onde deve ser implementado as soluções.
  * O arquivo [base.py](python/implementations/base.py) possui a classe abstrata **Problem** que serve como base para a 
  implementação das soluções dos problemas. As soluções devem ser implementadas no método **solv** de suas classes
  filhas.
  * Os arquivos **problemXXXX.py** possuem as classes concretas ("filhas") da classe **Problem**. Por exemplo o arquivo
  [problem1000.py](python/implementations/problem1000.py) possui a classe **Problem1000** que extende de **Problem** e
  implementa o método **solv** que contém a solução.
* [tests](python/tests): possui os testes unitários dos problemas.
  * Os testes unitários já estão implementados, então não precisa ser editado!
  * Tais testes servem para validar se sua solução atende ao problema.
  * Se algum teste falhar, ou a solução está errada (de acordo com o que foi pedido) ou não foi implementada.

## Como faço para usar essa joça?
* Faça o fork do projeto para sua conta
* Clone o seu fork
```shell
git clone https://github.com/seu_usuario/perfis-pyro5.git
```
* [Crie seu ambiente virtual](#preparao-do-ambiente)
* Instale as dependências
* Implemente
* Execute os testes

## Preparação do ambiente
* instalar o Python
* instalar o pipenv utilizando o pip (caso deseje usar o pipenv)

    No Linux seria: ```sudo pip install pipenv```
* clonar o projeto (se ainda não tiver feito)
    ```shell
    git clone https://github.com/SousaPedro11/perfis-pyro5.git
    ```
* mude para o diretório raiz do projeto

**OBS**: Você pode usar o pip ou pipenv para gerenciar os pacotes.

### Usando Pipenv
* criar o abiente virtual
  * criar o ambiente com: ```pipenv --three```
* instalar dependências
  * entrar no shell do pipenv: ```pipenv shell```
  * instalar dependencias com: ```pipenv install```

**OBS**: É necessário estar com o ambiente virtual ativado para executar os testes do projeto. Com pipenv, 
o comando ```pipenv shell``` serve para isso.

### Usando pip
* criar o abiente virtual
  ```shell
  python -m venv venv
  ```
* Ativar o ambiente virtual
  * No Linux
    ```shell
    source ./venv/bin/activate
    ```
  * No Windows
    ```
    source .\venv\Scripts\activate
    ```
* instalar dependências
  * instalar dependencias com: ```pip install -r requirements.txt```

## Implementei. E agora?
Basta ter configurado o ambiente previamente e executar o comando abaixo via console/terminal:
```shell
pytest
```
ou
```shell
pytest -vvv
```
Se tudo estiver **OK**, os testes aparecem em verde. Caso contrário em vermelho os que falharem.

Espero que ajude você também!
