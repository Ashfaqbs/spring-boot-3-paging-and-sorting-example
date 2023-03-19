# Spring Boot Pagination and Sorting Example
## This is a sample Spring Boot application that demonstrates how to implement pagination and sorting in a web application.

## Why use pagination and sorting?
When working with large datasets, it can be impractical and slow to load all of the data into memory at once. This is where pagination comes in: it allows you to split your data into smaller chunks, or "pages", that can be loaded individually. This can significantly improve the performance and efficiency of your application.

## Sorting, on the other hand, allows you to order your data in a specific way, such as alphabetically or numerically. This can be useful when working with large datasets to help users find the information they need more easily.

### Where to use pagination and sorting?
Pagination and sorting are commonly used in web applications that display lists or tables of data, such as product listings, search results, or user accounts. By breaking up the data into smaller pages and allowing users to sort it, you can make it easier for them to find what they're looking for.

### How to use this example
This example Spring Boot application includes a simple REST API that allows you to retrieve a list of items with pagination and sorting. The application uses Spring Data JPA and the PagingAndSortingRepository interface to handle pagination and sorting.

To use this example:

Clone the repository to your local machine
Open the project in your preferred IDE
Start the application by running the main class (PaginationAndSortingSpringboot3Application.java)
Use a tool like Postman to send GET requests to the API endpoint (localhost:9000/items) with parameters for page size, page number, and sorting options
Note that this is just a basic example and there are many different ways to implement pagination and sorting in a Spring Boot application. This example should provide a starting point for further exploration and experimentation.


# spring-boot-3-paging-and-sorting-example


## API endpoint - http://localhost:9000/PaginationAndShorting/0/10
## Pagination and Shorting Default

![image](https://user-images.githubusercontent.com/105435085/226152530-b438b772-2a64-4ad2-96b5-96e94fbac3a6.png)



 
## API endpoint  -  http://localhost:9000/PaginationAndShortingBYNAMEAESC/0/10
## Pagination and Shorting  by name of the employee (in ASC order)

![image](https://user-images.githubusercontent.com/105435085/226152664-88e88d9e-56b8-47ec-950f-78b7f5fb7259.png)




## Pagination and Shorting  by Any Property of the class of the employee (in ASC order)

## API endpoint  - http://localhost:9000/PaginationAndShortingBYCustomPropertyAESC/0/10/Company

## By Company
![image](https://user-images.githubusercontent.com/105435085/226153948-50b76bb2-6660-4e1a-9c12-fc0a27a193ad.png)

## API endpoint  - http://localhost:9000/PaginationAndShortingBYCustomPropertyAESC/0/10/name

## By Name
![image](https://user-images.githubusercontent.com/105435085/226153977-b60885c7-9686-4cd2-a1ce-cab391b49062.png)


### To run the application, clone and you can use the following command:
            mvn spring-boot:run

This repository contains an example application demonstrating how to implement pagination and sorting in a Spring Boot 3 application.


## Contributions
Contributions are welcome! If you find a bug or have an idea for a new feature, please submit an issue or pull request on GitHub.
