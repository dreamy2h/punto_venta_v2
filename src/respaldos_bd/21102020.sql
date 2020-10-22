-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: punto_venta
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorias` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `estado` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'perecibles',NULL,1),(2,'carnes',NULL,1),(3,'verduras',NULL,1);
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `rut` int NOT NULL,
  `dv` varchar(1) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `id_comuna` int DEFAULT NULL,
  `calle` varchar(100) DEFAULT NULL,
  `numero` int DEFAULT NULL,
  `resto_direccion` varchar(100) DEFAULT NULL,
  `fono_1` int DEFAULT NULL,
  `fono_2` int DEFAULT NULL,
  `estado` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`rut`),
  KEY `rel_comuna_cliente_idx` (`id_comuna`),
  CONSTRAINT `rel_comuna_cliente` FOREIGN KEY (`id_comuna`) REFERENCES `comunas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compras`
--

DROP TABLE IF EXISTS `compras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compras` (
  `id` int NOT NULL,
  `id_proveedor` int NOT NULL,
  `fecha_emision` date DEFAULT NULL,
  `fecha_vencimiento` date DEFAULT NULL,
  `total` int NOT NULL,
  `iva` decimal(10,0) DEFAULT NULL,
  `monto_neto` decimal(10,0) DEFAULT NULL,
  `impuesto_adicional` decimal(10,0) DEFAULT NULL,
  `id_tipo` int NOT NULL,
  `estado` int NOT NULL DEFAULT '1',
  `id_usuario` int NOT NULL,
  `fecha_registro` datetime NOT NULL,
  `id_sucursal` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `rel_tipo_entrada_idx` (`id_tipo`),
  KEY `rel_proveedores_idx` (`id_proveedor`),
  KEY `rel_usuario_compra_idx` (`id_usuario`),
  KEY `id_sucursal_compra_idx` (`id_sucursal`),
  CONSTRAINT `id_sucursal_compra` FOREIGN KEY (`id_sucursal`) REFERENCES `dependencias` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rel_proveedores` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedores` (`rut`),
  CONSTRAINT `rel_tipo_documento_compra` FOREIGN KEY (`id_tipo`) REFERENCES `tipo_documento` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rel_usuario_compra` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compras`
--

LOCK TABLES `compras` WRITE;
/*!40000 ALTER TABLE `compras` DISABLE KEYS */;
/*!40000 ALTER TABLE `compras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compras_detalle`
--

DROP TABLE IF EXISTS `compras_detalle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compras_detalle` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_producto` int NOT NULL,
  `cantidad` int NOT NULL,
  `costo_unitario` int NOT NULL,
  `impuesto_adicional` decimal(10,0) DEFAULT NULL,
  `descuento` decimal(10,0) DEFAULT NULL,
  `id_compra` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `rel_productos_idx` (`id_producto`),
  KEY `rel_compra_detalle_idx` (`id_compra`),
  CONSTRAINT `rel_compra_detalle` FOREIGN KEY (`id_compra`) REFERENCES `compras` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rel_productos` FOREIGN KEY (`id_producto`) REFERENCES `productos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compras_detalle`
--

LOCK TABLES `compras_detalle` WRITE;
/*!40000 ALTER TABLE `compras_detalle` DISABLE KEYS */;
/*!40000 ALTER TABLE `compras_detalle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comunas`
--

DROP TABLE IF EXISTS `comunas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comunas` (
  `id` int NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `id_provincia` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_provincias_idx` (`id_provincia`),
  CONSTRAINT `fk_provincias` FOREIGN KEY (`id_provincia`) REFERENCES `provincias` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comunas`
--

LOCK TABLES `comunas` WRITE;
/*!40000 ALTER TABLE `comunas` DISABLE KEYS */;
INSERT INTO `comunas` VALUES (1,'Arica',1),(2,'Camarones',1),(3,'Putre',2),(4,'General Lagos',2),(5,'Iquique',3),(6,'Alto Hospicio',3),(7,'Pozo Almonte',4),(8,'Camiña',4),(9,'Colchane',4),(10,'Huara',4),(11,'Pica',4),(12,'Antofagasta',5),(13,'Mejillones',5),(14,'Sierra Gorda',5),(15,'Taltal',5),(16,'Calama',6),(17,'Ollagüe',6),(18,'San Pedro de Atacama',6),(19,'Tocopilla',7),(20,'María Elena',7),(21,'Copiapó',8),(22,'Caldera',8),(23,'Tierra Amarilla',8),(24,'Chañaral',9),(25,'Diego de Almagro',9),(26,'Vallenar',10),(27,'Alto del Carmen',10),(28,'Freirina',10),(29,'Huasco',10),(30,'La Serena',11),(31,'Coquimbo',11),(32,'Andacollo',11),(33,'La Higuera',11),(34,'Paiguano',11),(35,'Vicuña',11),(36,'Illapel',12),(37,'Canela',12),(38,'Los Vilos',12),(39,'Salamanca',12),(40,'Ovalle',13),(41,'Combarbalá',13),(42,'Monte Patria',13),(43,'Punitaqui',13),(44,'Río Hurtado',13),(45,'Valparaíso',14),(46,'Casablanca',14),(47,'Concón',14),(48,'Juan Fernández',14),(49,'Puchuncaví',14),(50,'Quintero',14),(51,'Viña del Mar',14),(52,'Isla de Pascua',15),(53,'Los Andes',16),(54,'Calle Larga',16),(55,'Rinconada',16),(56,'San Esteban',16),(57,'La Ligua',17),(58,'Cabildo',17),(59,'Papudo',17),(60,'Petorca',17),(61,'Zapallar',17),(62,'Quillota',18),(63,'Calera',18),(64,'Hijuelas',18),(65,'La Cruz',18),(66,'Nogales',18),(67,'San Antonio',19),(68,'Algarrobo',19),(69,'Cartagena',19),(70,'El Quisco',19),(71,'El Tabo',19),(72,'Santo Domingo',19),(73,'San Felipe',20),(74,'Catemu',20),(75,'Llaillay',20),(76,'Panquehue',20),(77,'Putaendo',20),(78,'Santa María',20),(79,'Limache',21),(80,'Quilpué',21),(81,'Villa Alemana',21),(82,'Olmué',21),(83,'Rancagua',22),(84,'Codegua',22),(85,'Coinco',22),(86,'Coltauco',22),(87,'Doñihue',22),(88,'Graneros',22),(89,'Las Cabras',22),(90,'Machalí',22),(91,'Malloa',22),(92,'Mostazal',22),(93,'Olivar',22),(94,'Peumo',22),(95,'Pichidegua',22),(96,'Quinta de Tilcoco',22),(97,'Rengo',22),(98,'Requínoa',22),(99,'San Vicente',22),(100,'Pichilemu',23),(101,'La Estrella',23),(102,'Litueche',23),(103,'Marchihue',23),(104,'Navidad',23),(105,'Paredones',23),(106,'San Fernando',24),(107,'Chépica',24),(108,'Chimbarongo',24),(109,'Lolol',24),(110,'Nancagua',24),(111,'Palmilla',24),(112,'Peralillo',24),(113,'Placilla',24),(114,'Pumanque',24),(115,'Santa Cruz',24),(116,'Talca',25),(117,'Constitución',25),(118,'Curepto',25),(119,'Empedrado',25),(120,'Maule',25),(121,'Pelarco',25),(122,'Pencahue',25),(123,'Río Claro',25),(124,'San Clemente',25),(125,'San Rafael',25),(126,'Cauquenes',26),(127,'Chanco',26),(128,'Pelluhue',26),(129,'Curicó',27),(130,'Hualañé',27),(131,'Licantén',27),(132,'Molina',27),(133,'Rauco',27),(134,'Romeral',27),(135,'Sagrada Familia',27),(136,'Teno',27),(137,'Vichuquén',27),(138,'Linares',28),(139,'Colbún',28),(140,'Longaví',28),(141,'Parral',28),(142,'Retiro',28),(143,'San Javier',28),(144,'Villa Alegre',28),(145,'Yerbas Buenas',28),(146,'Concepción',29),(147,'Coronel',29),(148,'Chiguayante',29),(149,'Florida',29),(150,'Hualqui',29),(151,'Lota',29),(152,'Penco',29),(153,'San Pedro de la Paz',29),(154,'Santa Juana',29),(155,'Talcahuano',29),(156,'Tomé',29),(157,'Hualpén',29),(158,'Lebu',30),(159,'Arauco',30),(160,'Cañete',30),(161,'Contulmo',30),(162,'Curanilahue',30),(163,'Los Alamos',30),(164,'Tirúa',30),(165,'Los Angeles',31),(166,'Antuco',31),(167,'Cabrero',31),(168,'Laja',31),(169,'Mulchén',31),(170,'Nacimiento',31),(171,'Negrete',31),(172,'Quilaco',31),(173,'Quilleco',31),(174,'San Rosendo',31),(175,'Santa Bárbara',31),(176,'Tucapel',31),(177,'Yumbel',31),(178,'Alto Biobío',31),(179,'Chillán',32),(180,'Bulnes',32),(181,'Cobquecura',32),(182,'Coelemu',32),(183,'Coihueco',32),(184,'Chillán Viejo',32),(185,'El Carmen',32),(186,'Ninhue',32),(187,'Ñiquén',32),(188,'Pemuco',32),(189,'Pinto',32),(190,'Portezuelo',32),(191,'Quillón',32),(192,'Quirihue',32),(193,'Ránquil',32),(194,'San Carlos',32),(195,'San Fabián',32),(196,'San Ignacio',32),(197,'San Nicolás',32),(198,'Treguaco',32),(199,'Yungay',32),(200,'Temuco',33),(201,'Carahue',33),(202,'Cunco',33),(203,'Curarrehue',33),(204,'Freire',33),(205,'Galvarino',33),(206,'Gorbea',33),(207,'Lautaro',33),(208,'Loncoche',33),(209,'Melipeuco',33),(210,'Nueva Imperial',33),(211,'Padre Las Casas',33),(212,'Perquenco',33),(213,'Pitrufquén',33),(214,'Pucón',33),(215,'Saavedra',33),(216,'Teodoro Schmidt',33),(217,'Toltén',33),(218,'Vilcún',33),(219,'Villarrica',33),(220,'Cholchol',33),(221,'Angol',34),(222,'Collipulli',34),(223,'Curacautín',34),(224,'Ercilla',34),(225,'Lonquimay',34),(226,'Los Sauces',34),(227,'Lumaco',34),(228,'Purén',34),(229,'Renaico',34),(230,'Traiguén',34),(231,'Victoria',34),(232,'Valdivia',35),(233,'Corral',35),(234,'Lanco',35),(235,'Los Lagos',35),(236,'Máfil',35),(237,'Mariquina',35),(238,'Paillaco',35),(239,'Panguipulli',35),(240,'La Unión',36),(241,'Futrono',36),(242,'Lago Ranco',36),(243,'Río Bueno',36),(244,'Puerto Montt',37),(245,'Calbuco',37),(246,'Cochamó',37),(247,'Fresia',37),(248,'Frutillar',37),(249,'Los Muermos',37),(250,'Llanquihue',37),(251,'Maullín',37),(252,'Puerto Varas',37),(253,'Castro',38),(254,'Ancud',38),(255,'Chonchi',38),(256,'Curaco de Vélez',38),(257,'Dalcahue',38),(258,'Puqueldón',38),(259,'Queilén',38),(260,'Quellón',38),(261,'Quemchi',38),(262,'Quinchao',38),(263,'Osorno',39),(264,'Puerto Octay',39),(265,'Purranque',39),(266,'Puyehue',39),(267,'Río Negro',39),(268,'San Juan de la Costa',39),(269,'San Pablo',39),(270,'Chaitén',40),(271,'Futaleufú',40),(272,'Hualaihué',40),(273,'Palena',40),(274,'Coihaique',41),(275,'Lago Verde',41),(276,'Aisén',42),(277,'Cisnes',42),(278,'Guaitecas',42),(279,'Cochrane',43),(280,'OHiggins',43),(281,'Tortel',43),(282,'Chile Chico',44),(283,'Río Ibáñez',44),(284,'Punta Arenas',45),(285,'Laguna Blanca',45),(286,'Río Verde',45),(287,'San Gregorio',45),(288,'Cabo de Hornos',46),(289,'Antártica',46),(290,'Porvenir',47),(291,'Primavera',47),(292,'Timaukel',47),(293,'Natales',48),(294,'Torres del Paine',48),(295,'Santiago',49),(296,'Cerrillos',49),(297,'Cerro Navia',49),(298,'Conchalí',49),(299,'El Bosque',49),(300,'Estación Central',49),(301,'Huechuraba',49),(302,'Independencia',49),(303,'La Cisterna',49),(304,'La Florida',49),(305,'La Granja',49),(306,'La Pintana',49),(307,'La Reina',49),(308,'Las Condes',49),(309,'Lo Barnechea',49),(310,'Lo Espejo',49),(311,'Lo Prado',49),(312,'Macul',49),(313,'Maipú',49),(314,'Ñuñoa',49),(315,'Pedro Aguirre Cerda',49),(316,'Peñalolén',49),(317,'Providencia',49),(318,'Pudahuel',49),(319,'Quilicura',49),(320,'Quinta Normal',49),(321,'Recoleta',49),(322,'Renca',49),(323,'Joaquín',49),(324,'San Miguel',49),(325,'San Ramón',49),(326,'Vitacura',49),(327,'Puente Alto',50),(328,'Pirque',50),(329,'San José de Maipú',50),(330,'Colina',51),(331,'Lampa',51),(332,'Tiltil',51),(333,'San Bernardo',52),(334,'Buin',52),(335,'Calera de Tango',52),(336,'Paine',52),(337,'Melipilla',53),(338,'Alhué',53),(339,'Curacaví',53),(340,'María Pinto',53),(341,'San Pedro',53),(342,'Talagante',54),(343,'El Monte',54),(344,'Isla de Maipo',54),(345,'Padre Hurtado',54),(346,'Peñaflor',54);
/*!40000 ALTER TABLE `comunas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dependencias`
--

DROP TABLE IF EXISTS `dependencias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dependencias` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `tipo_dependencia` int DEFAULT NULL,
  `id_comuna` int DEFAULT NULL,
  `calle` varchar(100) DEFAULT NULL,
  `numero` int DEFAULT NULL,
  `resto_direccion` varchar(100) DEFAULT NULL,
  `id_empresa` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `rel_empresa_idx` (`id_empresa`),
  KEY `rel_comuna_sucursales_idx` (`id_comuna`),
  KEY `rel_tipo_dependencia_idx` (`tipo_dependencia`),
  CONSTRAINT `rel_comuna_sucursales` FOREIGN KEY (`id_comuna`) REFERENCES `comunas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rel_empresa` FOREIGN KEY (`id_empresa`) REFERENCES `empresa` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rel_tipo_dependencia` FOREIGN KEY (`tipo_dependencia`) REFERENCES `tipo_dependencias` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dependencias`
--

LOCK TABLES `dependencias` WRITE;
/*!40000 ALTER TABLE `dependencias` DISABLE KEYS */;
INSERT INTO `dependencias` VALUES (1,'Sala de vental 1',NULL,110,NULL,NULL,NULL,1);
/*!40000 ALTER TABLE `dependencias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empresa`
--

DROP TABLE IF EXISTS `empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empresa` (
  `id` int NOT NULL,
  `razon_social` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresa`
--

LOCK TABLES `empresa` WRITE;
/*!40000 ALTER TABLE `empresa` DISABLE KEYS */;
INSERT INTO `empresa` VALUES (1,'zamyr');
/*!40000 ALTER TABLE `empresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lista_precio_clientes`
--

DROP TABLE IF EXISTS `lista_precio_clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lista_precio_clientes` (
  `id_cliente` int NOT NULL,
  `id_producto` int NOT NULL,
  `precio` decimal(10,0) DEFAULT NULL,
  `id_sucursal` int DEFAULT NULL,
  PRIMARY KEY (`id_cliente`,`id_producto`),
  KEY `rel_producto_precio_cliente_idx` (`id_producto`),
  KEY `rel_sucursal_precio_cliente_idx` (`id_sucursal`),
  CONSTRAINT `rel_cliente_precio` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`rut`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rel_producto_precio_cliente` FOREIGN KEY (`id_producto`) REFERENCES `productos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rel_sucursal_precio_cliente` FOREIGN KEY (`id_sucursal`) REFERENCES `dependencias` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lista_precio_clientes`
--

LOCK TABLES `lista_precio_clientes` WRITE;
/*!40000 ALTER TABLE `lista_precio_clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `lista_precio_clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lista_precio_proveedores`
--

DROP TABLE IF EXISTS `lista_precio_proveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lista_precio_proveedores` (
  `id_proveedor` int NOT NULL,
  `id_producto` int NOT NULL,
  `precio` decimal(10,0) DEFAULT NULL,
  `id_sucursal` int DEFAULT NULL,
  PRIMARY KEY (`id_proveedor`,`id_producto`),
  KEY `rel_producto_precio_proveedor_idx` (`id_producto`),
  KEY `rel_sucursal_precio_proveedor_idx` (`id_sucursal`),
  CONSTRAINT `rel_precio_proveedor` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedores` (`rut`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rel_producto_precio_proveedor` FOREIGN KEY (`id_producto`) REFERENCES `productos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rel_sucursal_precio_proveedor` FOREIGN KEY (`id_sucursal`) REFERENCES `dependencias` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lista_precio_proveedores`
--

LOCK TABLES `lista_precio_proveedores` WRITE;
/*!40000 ALTER TABLE `lista_precio_proveedores` DISABLE KEYS */;
/*!40000 ALTER TABLE `lista_precio_proveedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prod_unidad_medida`
--

DROP TABLE IF EXISTS `prod_unidad_medida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prod_unidad_medida` (
  `id` int NOT NULL,
  `glosa` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prod_unidad_medida`
--

LOCK TABLES `prod_unidad_medida` WRITE;
/*!40000 ALTER TABLE `prod_unidad_medida` DISABLE KEYS */;
INSERT INTO `prod_unidad_medida` VALUES (1,'Decímetro cúbico (Litro)'),(2,'Centímetro cúbico'),(3,'Milímetro cúbico'),(4,'kilogramo'),(5,'Hectogramo'),(6,'Decagramo'),(7,'Gramo'),(8,'Unidad'),(9,'Decena'),(10,'Centena');
/*!40000 ALTER TABLE `prod_unidad_medida` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `codigo` varchar(50) DEFAULT NULL,
  `nombre` varchar(100) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `imagen` varchar(45) DEFAULT NULL,
  `estado` int NOT NULL DEFAULT '1',
  `id_categoria` int NOT NULL,
  `unidad_medida` int NOT NULL,
  `id_usuario` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `categoria_idx` (`id_categoria`),
  KEY `idx_codigo` (`codigo`),
  KEY `unidad_medida_idx` (`unidad_medida`),
  KEY `rel_usuario_productos_idx` (`id_usuario`),
  CONSTRAINT `categoria` FOREIGN KEY (`id_categoria`) REFERENCES `categorias` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rel_usuario_productos` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `unidad_medida` FOREIGN KEY (`unidad_medida`) REFERENCES `prod_unidad_medida` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos_stock`
--

DROP TABLE IF EXISTS `productos_stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos_stock` (
  `id_producto` int NOT NULL,
  `id_sucursal` int NOT NULL,
  `stock` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`id_producto`,`id_sucursal`),
  KEY `rel_sucursal_stock_idx` (`id_sucursal`),
  CONSTRAINT `rel_producto_stock` FOREIGN KEY (`id_producto`) REFERENCES `productos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rel_sucursal_stock` FOREIGN KEY (`id_sucursal`) REFERENCES `dependencias` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos_stock`
--

LOCK TABLES `productos_stock` WRITE;
/*!40000 ALTER TABLE `productos_stock` DISABLE KEYS */;
/*!40000 ALTER TABLE `productos_stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos_traza`
--

DROP TABLE IF EXISTS `productos_traza`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos_traza` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_producto` int DEFAULT NULL,
  `codigo` varchar(50) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `imagen` varchar(45) DEFAULT NULL,
  `estado` int DEFAULT '1',
  `id_categoria` int DEFAULT NULL,
  `unidad_medida` int DEFAULT NULL,
  `id_usuario` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `categoria_idx` (`id_categoria`),
  KEY `idx_codigo` (`codigo`),
  KEY `unidad_medida_idx` (`unidad_medida`),
  KEY `rel_usuario_productos_idx` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos_traza`
--

LOCK TABLES `productos_traza` WRITE;
/*!40000 ALTER TABLE `productos_traza` DISABLE KEYS */;
/*!40000 ALTER TABLE `productos_traza` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedores`
--

DROP TABLE IF EXISTS `proveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedores` (
  `rut` int NOT NULL,
  `dv` varchar(1) NOT NULL,
  `razon_social` varchar(100) NOT NULL,
  `id_comuna` int DEFAULT NULL,
  `calle` varchar(100) DEFAULT NULL,
  `numero` int DEFAULT NULL,
  `resto_direccion` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `fono_1` int DEFAULT NULL,
  `fono_2` int DEFAULT NULL,
  `estado` int NOT NULL DEFAULT '1',
  `id_usuario` int NOT NULL,
  PRIMARY KEY (`rut`),
  KEY `fk_comuna_idx` (`id_comuna`),
  KEY `rel_usuario_proveedores_idx` (`id_usuario`),
  CONSTRAINT `fk_comuna` FOREIGN KEY (`id_comuna`) REFERENCES `comunas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rel_usuario_proveedor` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedores`
--

LOCK TABLES `proveedores` WRITE;
/*!40000 ALTER TABLE `proveedores` DISABLE KEYS */;
INSERT INTO `proveedores` VALUES (76159315,'3','COMERCIAL PATRCIO CUITINO VASQUEZ E.I.R.L.',179,'',NULL,'MERC MUNICIPAL LOCAL 15 SN 0','PATRICIOCUITINOVASQUEZ@HOTMAIL.COM',NULL,NULL,1,1);
/*!40000 ALTER TABLE `proveedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedores_traza`
--

DROP TABLE IF EXISTS `proveedores_traza`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedores_traza` (
  `id` int NOT NULL AUTO_INCREMENT,
  `rut` int DEFAULT NULL,
  `dv` varchar(1) DEFAULT NULL,
  `razon_social` varchar(100) DEFAULT NULL,
  `id_comuna` int DEFAULT NULL,
  `calle` varchar(100) DEFAULT NULL,
  `numero` int DEFAULT NULL,
  `resto_direccion` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `fono_1` int DEFAULT NULL,
  `fono_2` int DEFAULT NULL,
  `estado` int DEFAULT '1',
  `id_usuario` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_comuna_idx` (`id_comuna`),
  KEY `rel_usuario_proveedores_idx` (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedores_traza`
--

LOCK TABLES `proveedores_traza` WRITE;
/*!40000 ALTER TABLE `proveedores_traza` DISABLE KEYS */;
INSERT INTO `proveedores_traza` VALUES (1,76159315,'3','COMERCIAL PATRCIO CUITNI VASQUEZ E.I.R.L.',179,'',NULL,'MERC MUNICIPAL LOCAL 15 SN 0','PATRICIOCUITINOVASQUEZ@HOTMAIL.COM',NULL,NULL,1,1);
/*!40000 ALTER TABLE `proveedores_traza` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `provincias`
--

DROP TABLE IF EXISTS `provincias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `provincias` (
  `id` int NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `id_region` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_regiones_idx` (`id_region`),
  CONSTRAINT `fk_regiones` FOREIGN KEY (`id_region`) REFERENCES `regiones` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `provincias`
--

LOCK TABLES `provincias` WRITE;
/*!40000 ALTER TABLE `provincias` DISABLE KEYS */;
INSERT INTO `provincias` VALUES (1,'ARICA',1),(2,'PARINACOTA',1),(3,'IQUIQUE',2),(4,'TAMARUGAL',2),(5,'ANTOFAGASTA',3),(6,'EL LOA',3),(7,'TOCOPILLA',3),(8,'COPIAPÓ',4),(9,'CHAÑARAL',4),(10,'HUASCO',4),(11,'ELQUI',5),(12,'CHOAPA',5),(13,'LIMARÍ',5),(14,'VALPARAÍSO',6),(15,'ISLA DE PASCUA',6),(16,'LOS ANDES',6),(17,'PETORCA',6),(18,'QUILLOTA',6),(19,'SAN ANTONIO',6),(20,'SAN FELIPE DE ACONCAGUA',6),(21,'MARGA MARGA',6),(22,'CACHAPOAL',7),(23,'CARDENAL CARO',7),(24,'COLCHAGUA',7),(25,'TALCA',8),(26,'CAUQUENES',8),(27,'CURICÓ',8),(28,'LINARES',8),(29,'CONCEPCIÓN',9),(30,'ARAUCO',9),(31,'BIOBÍO',9),(32,'ÑUBLE',9),(33,'CAUTÍN',10),(34,'MALLECO',10),(35,'VALDIVIA',11),(36,'RANCO',11),(37,'LLANQUIHUE',12),(38,'CHILOÉ',12),(39,'OSORNO',12),(40,'PALENA',12),(41,'COIHAIQUE',13),(42,'AISÉN',13),(43,'CAPITÁN PRAT',13),(44,'GENERAL CARRERA',13),(45,'MAGALLANES',14),(46,'ANTÁRTICA CHILENA',14),(47,'TIERRA DEL FUEGO',14),(48,'ULTIMA ESPERANZA',14),(49,'SANTIAGO',15),(50,'CORDILLERA',15),(51,'CHACABUCO',15),(52,'MAIPO',15),(53,'MELIPILLA',15),(54,'TALAGANTE',15);
/*!40000 ALTER TABLE `provincias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `regiones`
--

DROP TABLE IF EXISTS `regiones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `regiones` (
  `id` int NOT NULL,
  `nombre` varchar(70) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `regiones`
--

LOCK TABLES `regiones` WRITE;
/*!40000 ALTER TABLE `regiones` DISABLE KEYS */;
INSERT INTO `regiones` VALUES (1,'ARICA Y PARINACOTA'),(2,'TARAPACÁ'),(3,'ANTOFAGASTA'),(4,'ATACAMA'),(5,'COQUIMBO'),(6,'VALPARAÍSO'),(7,'DEL LIBERTADOR GRAL. BERNARDO OHIGGINS'),(8,'DEL MAULE'),(9,'DEL BIOBÍO'),(10,'DE LA ARAUCANÍA'),(11,'DE LOS RÍOS'),(12,'DE LOS LAGOS'),(13,'AISÉN DEL GRAL. CARLOS IBÁÑEZ DEL CAMPO'),(14,'MAGALLANES Y DE LA ANTÁRTICA CHILENA'),(15,'REGIÓN METROPOLITANA DE SANTIAGO');
/*!40000 ALTER TABLE `regiones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_dependencias`
--

DROP TABLE IF EXISTS `tipo_dependencias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_dependencias` (
  `id` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_dependencias`
--

LOCK TABLES `tipo_dependencias` WRITE;
/*!40000 ALTER TABLE `tipo_dependencias` DISABLE KEYS */;
INSERT INTO `tipo_dependencias` VALUES (1,'Sucursal'),(2,'Bodega'),(3,'Oficina'),(4,'Sala de Venta');
/*!40000 ALTER TABLE `tipo_dependencias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_documento`
--

DROP TABLE IF EXISTS `tipo_documento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_documento` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre_entrada` varchar(45) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `estado` int DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_documento`
--

LOCK TABLES `tipo_documento` WRITE;
/*!40000 ALTER TABLE `tipo_documento` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo_documento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario_sucursal`
--

DROP TABLE IF EXISTS `usuario_sucursal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario_sucursal` (
  `id_usuario` int NOT NULL,
  `id_sucursal` int NOT NULL,
  `estado` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_usuario`,`id_sucursal`,`estado`),
  KEY `rel_sucursal_idx` (`id_sucursal`),
  CONSTRAINT `rel_sucursal` FOREIGN KEY (`id_sucursal`) REFERENCES `dependencias` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rel_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario_sucursal`
--

LOCK TABLES `usuario_sucursal` WRITE;
/*!40000 ALTER TABLE `usuario_sucursal` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario_sucursal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `usuario` varchar(45) DEFAULT NULL,
  `clave` varchar(45) DEFAULT NULL,
  `id_sucursal` int DEFAULT NULL,
  `estado` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `rel_sucursal_usuario_idx` (`id_sucursal`),
  CONSTRAINT `rel_sucursal_usuario` FOREIGN KEY (`id_sucursal`) REFERENCES `dependencias` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'zamyr','zamyr','123',NULL,1),(2,'karen','karen','123',NULL,0),(3,'nene','213','123',NULL,1),(4,'asdasdas','dasdasd','123',NULL,1);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ventas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `total` int NOT NULL,
  `fecha` datetime NOT NULL,
  `estado` int NOT NULL DEFAULT '1',
  `id_cliente` int NOT NULL,
  `id_tipo_documento` int NOT NULL,
  `id_usuario` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `rel_cliente_ventas_idx` (`id_cliente`),
  KEY `rel_tipo_documento_ventas_idx` (`id_tipo_documento`),
  KEY `rel_usuario_ventas_idx` (`id_usuario`),
  CONSTRAINT `rel_cliente_ventas` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`rut`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rel_tipo_documento_ventas` FOREIGN KEY (`id_tipo_documento`) REFERENCES `tipo_documento` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rel_usuario_ventas` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventas_detalle`
--

DROP TABLE IF EXISTS `ventas_detalle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ventas_detalle` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_boleta` int NOT NULL,
  `costo_unitario` int NOT NULL,
  `precio_unitario` int NOT NULL,
  `cantidad` int NOT NULL,
  `id_producto` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `rel_boleta_idx` (`id_boleta`),
  KEY `rel_producto_idx` (`id_producto`),
  CONSTRAINT `rel_boleta` FOREIGN KEY (`id_boleta`) REFERENCES `ventas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rel_producto` FOREIGN KEY (`id_producto`) REFERENCES `productos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='			';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas_detalle`
--

LOCK TABLES `ventas_detalle` WRITE;
/*!40000 ALTER TABLE `ventas_detalle` DISABLE KEYS */;
/*!40000 ALTER TABLE `ventas_detalle` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-21 18:40:38
