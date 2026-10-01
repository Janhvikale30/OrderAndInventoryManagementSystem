import requests

# Get product data from Java API
response = requests.get("http://localhost:8080/api/products")

# Convert API response into Python data
products = response.json()

print(products)