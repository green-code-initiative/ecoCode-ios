![Logo](docs/resources/5ekko.png)
======================================

Mobile apps running on top of battery-limited devices are more than others concerned by the reduction of their environmental footprint. Hence, we created `ecoCode iOS`, the version of ecoCode project fully dedicated to the iOS platform. It provides static code analyzers to highlight code structures that may have a negative ecological impact: energy over-consumption, "fatware", shortening devices' lifespan, etc.

ecoCode iOS is based on evolving catalogs of [best practices](https://github.com/cnumr/best-practices-mobile). A SonarQube plugin then implements these catalogs as rules for scanning your projects. To learn more, take a look at the [complete presentation](docs/resources/devfest-2022.pdf) (in french) or the [presentation in a nutshell](docs/resources/apidays-2022.pdf) (in english).

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)

🌿 SonarQube Plugin
-------------------

ecoCode iOS SonarQube plugin is an "eco-responsibility" static code analyzer for iOS projects written in Swift. Its aim is to detect code smells indicating how the source code can be improved to reduce their environmental and social impact.

🛒 Distribution
---------------

Ready to use binaries are available [from GitHub](https://github.com/green-code-initiative/ecoCode-ios/releases).


🚀 Quickstart
-------------

### Requirements

- Java JDK 11+
- Maven 3.8 or later
- A local SonarQube instance for local testing

### Compile

```bash
mvn package
```

### Run (with Docker)

**This implies to have a machine ready to run containerized applications.** Please refer to Docker documentation: https://www.docker.com/.

```bash
docker-compose up --build -d && docker ps
```

The tests instance of SonarQube with the plugin will then be available at: [http://localhost:9000](http://localhost:9000). Default credentials are `admin`/`admin`


🤝 Partners
------------

[![Snapp’](docs/resources/logoSnapp.png)](https://www.snapp.fr)
[![Université de Pau](docs/resources/logoUnivPau.png)](https://www.univ-pau.fr/)
[![Région Nouvelle-Aquitaine](docs/resources/logoNA.png)](https://www.nouvelle-aquitaine.fr)
[![Solocal / PagesJaunes](docs/resources/logoSolocal.png)](https://www.pagesjaunes.fr)
[![inside|app](docs/resources/logoInsideApp.jpg)](https://www.insideapp.fr/)


🧩 Plugins version compatibility
------------------

| Plugins Version | SonarQube version          |
|-----------------|----------------------------|
| 0.0.+           | SonarQube 8.9.+ LTS to 9.3 |
| 0.1.+           | SonarQube 9.4.+ LTS to 9.9 |
| 1.0.+           | SonarQube 9.4.+ LTS to 9.9 |


🛠️ Contributing
------------------

If you want to contribute to the project, your help will be greatly appreciated.

Start right away by reading [General contribution guide](https://github.com/green-code-initiative/ecoCode-common/blob/main/doc/CONTRIBUTING.md) and the [iOS specific contribution guide](https://github.com/green-code-initiative/ecoCode-ios/blob/main/CONTRIBUTING.md).

