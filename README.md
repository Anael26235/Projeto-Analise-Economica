Pré-requisitos do projeto:

Java 11 
ELK stack
Springboot 2.1.2



# Instalação projeto


	$ git clone https://github.com/Anael26235/Projeto-Analise-Economica.git
	$ cd projeto-analise
	$ mvn clean install



# Docker image para elasticsearch

	$ docker pull docker.elastic.co/elasticsearch/elasticsearch:8.5.3

	$ docker run -p 9200:9200 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:8.5.3



# Instalação elastic seach

Faça o download do zip do elasticsearch 8.5.3: https://artifacts.elastic.co/downloads/elasticsearch/elasticsearch-8.5.3-windows-x86_64.zip

Inicializando elastic search através de linha de commando.	Primeiro vá até a pasta de instalação:
	
	$ cd C:\elasticsearch-8.5.3
	
Depois rode o comando a seguir para iniciar o elastic search:

	$ .\bin\elasticsearch.bat
