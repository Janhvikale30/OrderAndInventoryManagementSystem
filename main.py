import requests


def inventory_analytics():
    url = "https://github.com/Janhvikale30/OrderAndInventoryManagementSystem.git"

    response = requests.get(url)

    if response.status_code != 200:
        print("Failed to fetch product data")
        return

    products = response.json()

    total_products = len(products)
    total_stock = sum(product["stock"] for product in products)
    average_stock = total_stock / total_products if total_products > 0 else 0

    print("----- INVENTORY ANALYTICS -----")
    print("Total Products:", total_products)
    print("Total Stock:", total_stock)
    print("Average Stock:", round(average_stock, 2))

    print("\nProduct-wise Stock:")
    for product in products:
        print(
            product["product"],
            "->",
            product["stock"]
        )


inventory_analytics()