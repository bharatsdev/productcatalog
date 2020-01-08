# Getting Started

### Tech Stack

	- Spring Boot
	- Java 8
	- Junit
	- H2
	- Docker
	- Docker-compose
	- Tomcat

### Build & Deploy

	- mvn clean
	- mvn install
	------
	- docker-compose up
	- docker-compose up --force-recreate --build
	- docker image prune -f
	

### Service EndPoint
	Search Product Catalog by SKU number
		http://localhost:8080/productcatalog/{productsku}


	Buy Product By SKU Number
		http://localhost:8080/productcatalog/{productsku}/{quantity}

		
## TODO
	-- Micro-Services (Search and Buy the product)
	-- Use Queue
	-- Horizontal Scaling  Micro-services
