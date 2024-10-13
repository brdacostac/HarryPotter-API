# ⚡ Harry Potter API

Cette API fournit des informations sur l'univers de **Harry Potter**, en commençant par les personnages. Ce projet est en cours de développement avec **Java Spring Boot** afin d'approfondir mes compétences techniques.

Les données JSON sont stockées dans **AWS S3** et récupérées à travers l'API. De plus, l'API utilise **OpenFeign** pour effectuer des appels HTTP externes lorsque cela est nécessaire.

Actuellement, seul l'endpoint permettant de récupérer tous les personnages a été implémenté. Le projet est en production pour une éventuelle application de type **master-detail**.

## 🛠️ Technologies utilisées

- **Java 17**
- **Spring Boot 3**
- **AWS S3** pour le stockage des fichiers JSON
- **OpenFeign** pour les appels HTTP
- **Maven**

## ✨ Fonctionnalités (en cours de développement)

- **GET tous les personnages** : Récupère tous les personnages de l'univers Harry Potter via l'endpoint `/api/characters`.
- **Stockage des données JSON** dans AWS S3 : Les fichiers JSON contenant les informations sont stockés dans un bucket S3 et récupérés via l'API.
- **Utilisation d'OpenFeign** : OpenFeign est utilisé pour interagir avec des services externes via HTTP.

## 🚀 Installation et exécution

1. Clonez le dépôt :

   ```bash
   git clone https://github.com/brdacostac/Spring-Personal-API.git
   ```

2. Accédez au répertoire du projet :

   ```bash
   cd harry-potter-api
   ```

3. Installez les dépendances avec Maven :

   ```bash
   mvn clean install
   ```

4. Exécutez l'application :

   ```bash
   mvn spring-boot:run
   ```

5. L'application est accessible à l'adresse `http://localhost:8080`.

## 📋 Endpoints actuels

| Méthode | Endpoint                | Description                                         |
| ------- | ----------------------- |-----------------------------------------------------|
| GET     | `/api/characters`        | Récupère tous les personnages et leurs informations |

## 🤝 Contribution

Les contributions sont les bienvenues ! N'hésitez pas à soumettre une pull request ou à ouvrir une issue pour discuter d'améliorations ou de nouvelles fonctionnalités.

## 👤 Auteur

- **Bruno Cunha** - [GitHub](https://github.com/brdacostac)

