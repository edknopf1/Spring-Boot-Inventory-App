# Spring Boot Inventory App

**Java 17**

## Overview
A Spring application with an HTML front-end and Java backend for managing an inventory system for a business that sells car parts.
Supports buying products, increasing or decreasing inventory and included unit tests.

## Features
- View/Search Parts or Products in tables
- **Part Management** - Add or modify parts with minimum and maximum inventory tracking
- **Products Management** - Add or modify products, associate parts with respective product, view total cost
- **Buy Now Button** = Decrease product inventory by 1, implemented failure alert if inventory was 0
- **Inventory Validation** - Ensures stock is between a minimum and maximum value, prevents updating if violation occurs
- **Sample Inventory** - Auto generates 5 parts and 5 products only if database is empty
- **Unit Testing** - Tests for minimum and maximum inventory in PartTest


