# Rapport TP : Protocole MCP et Applications associées

## 1. Concepts de base

Le protocole MCP (Message Communication Protocol) est un protocole de communication léger basé sur SSE (Server-Sent Events) permettant l'échange asynchrone de messages entre serveurs et clients. Il est conçu pour faciliter l'intégration d'agents intelligents et la communication en temps réel.



---

## 2. Architecture et Spécifications du Protocole MCP

- **Architecture client-serveur** avec un serveur central MCP diffusant les messages via SSE.
- Les clients peuvent être des agents intelligents ou applications qui écoutent les événements SSE.
- Spécifications précises définissant les types de messages, formats JSON, et règles de communication.
- Supporte plusieurs serveurs MCP interconnectés et multi-clients.


---

## 3. Comment créer un serveur MCP SSE avec Java Spring

- Mise en place d’une application Spring Boot exposant un endpoint SSE (`/sse`).
- Utilisation de `SseEmitter` pour envoyer des événements continus au client.
- Gestion des connexions clients et diffusion des messages.
- Configuration simple avec un serveur HTTP sur un port dédié.

<img width="1171" height="340" alt="image" src="https://github.com/user-attachments/assets/b8cca5d3-d5be-4c0d-9cd1-01047d3d0b80" />


---

## 4. Comment Tester le serveur MCP avec Postman

- Postman permet de tester les endpoints SSE en envoyant une requête GET vers `/sse`.
- Visualisation du flux d’événements en temps réel.
- Possibilité d’envoyer des messages test depuis Postman via des requêtes POST vers des endpoints dédiés.

<img width="1748" height="876" alt="image" src="https://github.com/user-attachments/assets/066e0bd5-10e3-4374-8b58-5433cba9f6f9" />

**[Capture d’écran 6 : Exemple de requête POST dans Postman]**

/Get :

<img width="1752" height="837" alt="image" src="https://github.com/user-attachments/assets/45c7a08c-88cc-490f-9fbb-1de698cf7cc2" />

initialisation :

<img width="1650" height="377" alt="image" src="https://github.com/user-attachments/assets/3da7f224-35d4-448c-a542-6a1ae5851f30" />



---

## 5. Comment Créer un Client MCP avec Spring AI, OpenAI

- Implémentation d’un client Spring AI capable de se connecter au serveur MCP via SSE.
- Intégration de modèles LLM  OpenAI via leurs API.
- Configuration dynamique des clés API via variables d’environnement.
- Gestion des interactions avec les modèles pour traitement et génération de réponses.

<img width="868" height="582" alt="image" src="https://github.com/user-attachments/assets/142e29a0-02d0-4b9f-8697-24f4e78c17fa" />
 
<img width="1170" height="522" alt="image" src="https://github.com/user-attachments/assets/99f19416-3383-46f3-9b53-1b3dbc5b00b2" />


---

## 6. Comment déployer un serveur MCP NodeJS en mode STDIO dans le client MCP Spring AI

- Développement d’un serveur MCP en NodeJS utilisant le mode STDIO pour communication inter-processus.
- Intégration dans le client Spring AI via configuration du serveur STDIO.
- Communication bidirectionnelle entre le client et le serveur NodeJS.


---

## 7. Comment Créer un serveur MCP avec Python

- Implémentation d’un serveur MCP utilisant `FastAPI` ou `Flask` avec un endpoint SSE.
- Utilisation de bibliothèques Python pour gérer les connexions SSE et diffuser les messages.
- Possibilité d’intégrer des modèles IA Python.


---

## 8. Comment déployer un serveur MCP Python en mode STDIO dans le client MCP Spring AI

- Exécution du serveur Python en tant que processus enfant communiquant via STDIO.
- Configuration du client Spring AI pour interagir avec ce serveur via les flux d’entrée/sortie.
- Synchronisation des messages entre les deux processus.

---

## 9. Comment rendre l'application Agentique

- Conception orientée agents intelligents autonomes.
- Modularité pour intégrer divers modèles IA et serveurs MCP.
- Gestion des états, contextes de conversation et orchestration des interactions.


---

## 10. Tester l'application avec Swagger UI

- Mise en place de Swagger UI pour documenter et tester les API REST exposées.
- Visualisation interactive des endpoints MCP.
- Possibilité de lancer des requêtes directement depuis l’interface Swagger.
- 
<img width="1366" height="193" alt="10 query result" src="https://github.com/user-attachments/assets/28b47683-2899-45d9-a48e-a5e5bd5624ff" />


<img width="1317" height="565" alt="11 swagger query" src="https://github.com/user-attachments/assets/948592cf-8b5c-4021-bc51-f270f0d4919e" />


<img width="1278" height="401" alt="12 resul swagger" src="https://github.com/user-attachments/assets/52f57600-8abd-44a7-9f45-7508283b439f" />



---

# Conclusion

Ce TP permet de maîtriser les bases du protocole MCP, la mise en œuvre de serveurs et clients en Java Spring, NodeJS et Python, ainsi que l’intégration avancée de modèles IA modernes. La prise en main des outils de test comme Postman et Swagger UI complète l’expérience de développement.

---

