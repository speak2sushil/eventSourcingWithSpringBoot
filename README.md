## Run the Application 
- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one)
- Open Command Prompt and Change directory (cd) to folder containing pom.xml
- Open Eclipse 
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
   - Select the  project
- Choose the Spring Boot Application file (search for @SpringBootApplication)
- Right Click on the file and Run as Java Application

## Examples 

POST http://localhost:8080/travelers

Request
  {
 
                "name":"Susheel",
 
                "location":"pune"
 
             }
            
Response - 73087a8d-7314-46cb-bc48-c4c1d6c7b163  

PUT http://localhost:8080/travelers/shift/73087a8d-7314-46cb-bc48-c4c1d6c7b163

Request
  {
 
                "name":"Susheel",
 
                "location":"delhi"
 
             }
             
PUT http://localhost:8080/travelers/shift/73087a8d-7314-46cb-bc48-c4c1d6c7b163

Request
  {
 
                "name":"Susheel",
 
                "location":"hyderabad"
 
             }             



Request GET http://localhost:8080/travelers/73087a8d-7314-46cb-bc48-c4c1d6c7b163/events

Response 



[
    {
        "id": "73087a8d-7314-46cb-bc48-c4c1d6c7b163",
        "name": "Susheel",
        "location": "pune"
    },
    {
        "id": "73087a8d-7314-46cb-bc48-c4c1d6c7b163",
        "status": "ACTIVATED"
    },
    {
        "id": "73087a8d-7314-46cb-bc48-c4c1d6c7b163",
        "name": "Susheel",
        "location": "delhi"
    },
    {
        "id": "73087a8d-7314-46cb-bc48-c4c1d6c7b163",
        "status": "SHIFTED"
    },
    {
        "id": "73087a8d-7314-46cb-bc48-c4c1d6c7b163",
        "name": "Susheel",
        "location": "hyderabad"
    },
    {
        "id": "73087a8d-7314-46cb-bc48-c4c1d6c7b163",
        "status": "SHIFTED"
    }
]

## API Documents and Contract 

http://localhost:8080/swagger-ui.html

http://localhost:8080/v2/api-docs

## Database Validation and Query Detail

visit -->> http://localhost:8080/h2-console

login to testdb. Then, we can execute the below query in the console.

SELECT PAYLOAD_TYPE , AGGREGATE_IDENTIFIER, SEQUENCE_NUMBER , PAYLOAD   FROM DOMAIN_EVENT_ENTRY




