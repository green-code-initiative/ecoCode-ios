![Logo](docs/resources/5ekko.png)
======================================

Mobile apps running on top of battery-limited devices are more than others concerned by the reduction of their environmental footprint. Hence, we created `ecoCode iOS`, the version of ecoCode project fully dedicated to the iOS platform. It provides static code analyzers to highlight code structures that may have a negative ecological impact: energy over-consumption, "fatware", shortening devices' lifespan, etc.

ecoCode iOS is based on evolving catalogs of [best practices](https://github.com/cnumr/best-practices-mobile). A SonarQube plugin then implements these catalogs as rules for scanning your projects. To learn more, take a look at the [complete presentation](docs/resources/devfest-2022.pdf) (in french) or the [presentation in a nutshell](docs/resources/apidays-2022.pdf) (in english).

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0) ![Build](https://github.com/green-code-initiative/ecoCode-ios/actions/workflows/build.yml/badge.svg)

[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=green-code-initiative_ecoCode-ios&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=green-code-initiative_ecoCode-ios) [![Coverage](https://sonarcloud.io/api/project_badges/measure?project=green-code-initiative_ecoCode-ios&metric=coverage)](https://sonarcloud.io/summary/new_code?id=green-code-initiative_ecoCode-ios) [![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=green-code-initiative_ecoCode-ios&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=green-code-initiative_ecoCode-ios) [![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=green-code-initiative_ecoCode-ios&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=green-code-initiative_ecoCode-ios) [![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=green-code-initiative_ecoCode-ios&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=green-code-initiative_ecoCode-ios)

🌿 SonarQube Plugin
-------------------

ecoCode iOS SonarQube plugin is an "eco-responsibility" static code analyzer for iOS projects written in Swift. Its aim is to detect code smells indicating how the source code can be improved to reduce their environmental and social impact.

🛒 Distribution
---------------

Ready to use binaries are available [from GitHub](https://github.com/green-code-initiative/ecoCode-ios/releases).

NB: To work, `ecocode-ios` needs `Swift` language support in SonarQube. For *SonarQube Community Edition* (which does not support Swift language), you need to install an additional plugin like [sonar-apple](https://github.com/insideapp-oss/sonar-apple).

🚀 Development Quickstart
-------------

### Requirements

- Java JDK 11+
- Maven 3.8 or later
- A local SonarQube instance for local testing

### Compile

```bash
./tool_compile.sh
```

### Run (with Docker)

**This implies to have a machine ready to run containerized applications.** Please refer to Docker documentation: https://www.docker.com/.

```bash
# build Jar files for application
./tool_build.sh

# clean docker environment
./tool_docker-clean.sh

# initialize docker environment
./tool_docker-init.sh

# display logs from docker environment
./tool_docker-logs.sh
```

The tests instance of SonarQube with the plugin will then be available at: [http://localhost:9000](http://localhost:9000). Default credentials are `admin`/`admin`

### Test

An iOS test project is available [here](https://github.com/green-code-initiative/ecoCode-mobile-ios-swift-test-project)/

🤝 Partners
------------

[![Snapp’](docs/resources/logoSnapp.png)](https://www.snapp.fr)
[![Université de Pau](docs/resources/logoUnivPau.png)](https://www.univ-pau.fr/)
[![Région Nouvelle-Aquitaine](docs/resources/logoNA.png)](https://www.nouvelle-aquitaine.fr)
[![Solocal / PagesJaunes](docs/resources/logoSolocal.png)](https://www.pagesjaunes.fr)
[![inside|app](docs/resources/logoInsideApp.jpg)](https://www.insideapp.fr/)

🧩 Plugins version compatibility
------------------

| Plugins Version | SonarQube version           |
|-----------------|-----------------------------|
| 1.1.+           | SonarQube 9.4.+ LTS to 10.0 |

🛠️ Contributing
------------------

If you want to contribute to the project, your help will be greatly appreciated.

Start right away by reading [General contribution guide](https://github.com/green-code-initiative/ecoCode-common/blob/main/doc/CONTRIBUTING.md) and the [iOS specific contribution guide](https://github.com/green-code-initiative/ecoCode-ios/blob/main/CONTRIBUTING.md).
