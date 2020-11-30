# TP3 Fundamentos do Desenvolvimento JAVA

Trabalho realizado para a Disciplina Regular 1 - Fundamentos do Desenvolvimento JAVA - do Instituto Infnet. O qual consiste na criação de um sistema para cadastro e exibição das notas e médias de alunos de uma turma. <br/>

Configurações usadas:<br/>
Sistema operacional: Windows 10 Pro, 64 bits<br/>
IDE: Apache Netbeans IDE 12.1 e JDK 8.

# JDK
## Instalação

Instale o JDK via site da Oracle selecionando o programaq compatível com seu Sistema Operacional. Após o download, execute o instalador, seguindo o passo a passo sugerido. <br/>

## Configuração

Acesse "Meu Computador", então clique em "Configurações Avançadas de Sistema" e, por fim, "Variáveis de Ambiente".<br/>

Na tela das variáveis, abrir janela com dois espaços separados, o primeiro será as variáveis do usuário e o segundo as variáveis do sistema.<br/>

###### 1. Editar Path
Selecionar as variáveis do sistema;<br/>
Selecionar "PATH" na primeira coluna e clicar em "EDITAR";<br/>
Na tela "EDITAR VARIÁVEIS DO SISTEMA", clicar em "NOVO" e digitar o comando (SEM AS ASPAS): "path=%JAVA_HOME%\bin";<br/>
Clicar em OK;<br/>

###### 2. Criar Variável
Selecionar as variáveis do sistema;<br/>
Clicar em "NOVO";<br/>
Selecionar nome da variável e digitar (SEM AS ASPAS): "JAVA_HOME";<br/>
Em "VALOR DA VARIÁVEL", selecionar o Diretório onde o JDK foi instalado;<br/>
Clicar em OK;<br/>

###### 3. Criar Variável
Clicar em "NOVO";<br/>
Selecionar nome da variável e digitar (SEM AS ASPAS): "CLASSPATH";<br/>
Em "VALOR DA VARIÁVEL" e digitar (SEM AS ASPAS): "%JAVA_HOME%;.";<br/>
Clicar em OK;<br/>

###### 4. Verificaçaõ das Variáveis
Digitar CMD no seu espaço de busca do Windows;<br/>
Abrir o Prompt de Comando;<br/>
Digitar (SEM AS ASPAS): "javac";<br/>
Verificar informações do JAVA que foi instalado;<br/>
Digitar (SEM AS ASPAS): "java -version";<br/>
Verificar a versão do JAVA que foi instalado;<br/>
