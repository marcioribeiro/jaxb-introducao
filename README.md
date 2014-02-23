JAXB - Introdução
-----------------

JAXB o que é ?
Como diz a própria Oracle "Arquitetura Java para Binding XML"

Introdução
-----------

A Extensible Markup Language (XML) se tornou padrão para troca de dados
em sistemas distintos e a API JAXB surgiu para tornar mais fácil o 
acesso ao documentos XML escritos na linguagem de programação Java.

Se você alguma vez usou as APIs DOM ou SAX para trabalhar com Java, 
deve ter se deparado com a complexibilidade de se trabalhar com elas.

Pensando nisso e para facilitar a vida do desenvolvedor a Oracle
disponibilizou uma outra API para acessar documentos XML a JAXB.

Simplificando a JAXB define uma API para a linguagem Java ler e escrever documentos XML.

Como JAXB é definida através de especificação, é possível que você se depara com diferentes
implementações para este padrão.

JAXB - Java Architecture for XML Binding
-----------------------------------------

JAXB usa anotações para indicar elementos centrais vejamos algumas:

@XMLRootElement(namespace="namespace") Define um elemento raiz para uma árvore XML
@XmlType(name="",propOrder="") Permite que você defina a ordem que os campos serão escritos no arquivo XML
@XmlElement(name="nome") usados nos atributos ou métodos do objeto, e permite que seja definido 
um nome para o elemento XML diferente do atributo/método.
