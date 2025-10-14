Feature: Product API

    Scenario: Get all products
        Given the product API is available
        When I Get all products
        Then the response should contain at least one product
        And the response should contain at least one product



    Scenario:create a new product
        Given the product API is available
        When I POST a new product with id 4, name "wireless Mouse",price 1500
        Then the response status code should 200
        And  the response product name should be "wireless Mouse"
        
            