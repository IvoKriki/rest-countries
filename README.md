
# Rest Countries API Consumer

This is a Java-based Spring Boot application that consumes data from the [Rest Countries API](https://restcountries.com/v3.1/all). It retrieves detailed information about countries and exposes a local API with the data. The project also integrates with Swagger for easy API documentation and exploration.

## Features

- Consume data from the public [Rest Countries API](https://restcountries.com/v3.1/all).
- Expose an endpoint to retrieve country data.
- Swagger UI integrated for easy API testing.
- Modular design following good practices for separation of concerns.

## Technologies

- **Java 17**
- **Spring Boot 3.3.4**
- **Spring Cloud OpenFeign** for REST client communication.
- **Lombok** for reducing boilerplate code.
- **Swagger UI** for API documentation.
- **Maven** for dependency management and build.

## Installation

To run this application, ensure that you have Java 17 or later installed. You will also need to have [Maven](https://maven.apache.org/install.html) installed to manage dependencies and run the application.

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/rest-countries.git
   ```

2. **Navigate to the project directory:**

   ```bash
   cd rest-countries
   ```

3. **Install dependencies:**

   ```bash
   mvn clean install
   ```

4. **Run the application:**

   ```bash
   mvn spring-boot:run
   ```

## Running the Application

After running the application, the API will be accessible at the following address:

```
http://localhost:8080
```

## API Documentation

The API includes Swagger UI for easy exploration and testing of endpoints. You can access the Swagger UI at:

- [Swagger UI](http://localhost:8080/swagger-ui/index.html#/external-ap-is-controller/consumeApi)

This page allows you to see the available endpoints, request details, and responses.

## API Endpoints

### `GET /consume-api`

This endpoint allows you to retrieve country information by consuming data from the external [Rest Countries API](https://restcountries.com/v3.1/all).

#### Example Request:

```bash
GET http://localhost:8080/consume-api
```

#### Example Response:

```json
[
  {
    "name": {
      "common": "South Georgia",
      "official": "South Georgia and the South Sandwich Islands",
      "nativeName": {
        "eng": {
          "official": "South Georgia and the South Sandwich Islands",
          "common": "South Georgia"
        }
      }
    },
    "tld": [".gs"],
    "cca2": "GS",
    "ccn3": "239",
    "cca3": "SGS",
    "independent": false,
    "status": "officially-assigned",
    "unMember": false,
    "currencies": {
      "SHP": {
        "name": "Saint Helena pound",
        "symbol": "£"
      }
    },
    "idd": {
      "root": "+5",
      "suffixes": ["00"]
    },
    "capital": ["King Edward Point"],
    "altSpellings": [
      "GS",
      "South Georgia and the South Sandwich Islands"
    ],
    "region": "Antarctic",
    "languages": {
      "eng": "English"
    },
    "translations": {
      "ara": {
        "official": "جورجيا الجنوبية وجزر ساندوتش الجنوبية",
        "common": "جورجيا الجنوبية"
      },
      "deu": {
        "official": "Südgeorgien und die Südlichen Sandwichinseln",
        "common": "Südgeorgien und die Südlichen Sandwichinseln"
      },
      "fra": {
        "official": "Géorgie du Sud et les îles Sandwich du Sud",
        "common": "Géorgie du Sud et les Îles Sandwich du Sud"
      }
    },
    "latlng": [-54.5, -37],
    "landlocked": false,
    "area": 3903,
    "flag": "🇬🇸",
    "maps": {
      "googleMaps": "https://goo.gl/maps/mJzdaBwKBbm2B81q9",
      "openStreetMaps": "https://www.openstreetmap.org/relation/1983629"
    },
    "population": 30,
    "timezones": ["UTC-02:00"],
    "continents": ["Antarctica"],
    "flags": {
      "png": "https://flagcdn.com/w320/gs.png",
      "svg": "https://flagcdn.com/gs.svg"
    },
    "coatOfArms": {},
    "capitalInfo": {
      "latlng": [-54.28, -36.5]
    }
  }
]
```
