## 🐳 **Docker Commands Cheat Sheet (Beginner → Intermediate)**

---

### **1️⃣ General / Help**

| Command                   | What it Does                                       | Example             |
| ------------------------- | -------------------------------------------------- | ------------------- |
| `docker --help`           | Shows all Docker commands.                         | `docker --help`     |
| `docker <command> --help` | Shows help for a specific command.                 | `docker run --help` |
| `docker version`          | Shows Docker version.                              | `docker version`    |
| `docker info`             | Shows system info (images, containers, resources). | `docker info`       |

---

### **2️⃣ Image Commands**

| Command                    | What it Does                 | Example                   |
| -------------------------- | ---------------------------- | ------------------------- |
| `docker search <name>`     | Search images on Docker Hub. | `docker search mysql`     |
| `docker pull <image>`      | Download an image.           | `docker pull mysql:8`     |
| `docker images`            | List downloaded images.      | `docker images`           |
| `docker rmi <image>`       | Remove an image.             | `docker rmi mysql:8`      |
| `docker build -t <name> .` | Build image from Dockerfile. | `docker build -t myapp .` |

---

### **3️⃣ Container Commands**

| Command                              | What it Does                             | Example                          |
| ------------------------------------ | ---------------------------------------- | -------------------------------- |
| `docker run -d -p host:cont <image>` | Run container in background, map ports.  | `docker run -d -p 8080:80 nginx` |
| `docker run -it <image> sh`          | Run container with interactive shell.    | `docker run -it ubuntu sh`       |
| `docker ps`                          | Show running containers.                 | `docker ps`                      |
| `docker ps -a`                       | Show all containers (including stopped). | `docker ps -a`                   |
| `docker stop <id>`                   | Stop a running container.                | `docker stop abc123`             |
| `docker start <id>`                  | Start a stopped container.               | `docker start abc123`            |
| `docker restart <id>`                | Restart a container.                     | `docker restart abc123`          |
| `docker rm <id>`                     | Remove a container.                      | `docker rm abc123`               |
| `docker logs -f <id>`                | Show container logs live.                | `docker logs -f abc123`          |
| `docker exec -it <id> sh`            | Open shell inside container.             | `docker exec -it abc123 sh`      |
| `docker stats`                       | Show container CPU/RAM usage.            | `docker stats`                   |

---

### **4️⃣ Network Commands**

| Command                         | What it Does          | Example                         |
| ------------------------------- | --------------------- | ------------------------------- |
| `docker network ls`             | List networks.        | `docker network ls`             |
| `docker network inspect <name>` | Show network details. | `docker network inspect bridge` |
| `docker network create <name>`  | Create a new network. | `docker network create mynet`   |
| `docker network rm <name>`      | Remove a network.     | `docker network rm mynet`       |

---

### **5️⃣ Volume Commands**

| Command                        | What it Does         | Example                       |
| ------------------------------ | -------------------- | ----------------------------- |
| `docker volume ls`             | List volumes.        | `docker volume ls`            |
| `docker volume inspect <name>` | Show volume details. | `docker volume inspect myvol` |
| `docker volume create <name>`  | Create a new volume. | `docker volume create myvol`  |
| `docker volume rm <name>`      | Remove a volume.     | `docker volume rm myvol`      |

---

### **6️⃣ Docker Compose Commands**

| Command                  | What it Does                                  | Example                  |
| ------------------------ | --------------------------------------------- | ------------------------ |
| `docker-compose up -d`   | Start all services from `docker-compose.yml`. | `docker-compose up -d`   |
| `docker-compose down`    | Stop & remove all services.                   | `docker-compose down`    |
| `docker-compose ps`      | List running services.                        | `docker-compose ps`      |
| `docker-compose logs -f` | Show logs of all services.                    | `docker-compose logs -f` |

---
