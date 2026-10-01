package com.prometheus.clq.data

import com.prometheus.clq.model.BilingualQuestion
import com.prometheus.clq.model.Difficulty
import com.prometheus.clq.model.Language
import com.prometheus.clq.model.LocalizedContent
import com.prometheus.clq.model.Question

/** Auto-generated batch 17 : 500 questions bilingues */
object QuestionsBilingualGenerated_17 {
    fun get(lang: Language = Language.FR): List<Question> = list.map { it.toQuestion(lang) }

    val list: List<BilingualQuestion> by lazy {
        part1() + part2() + part3() + part4() + part5() + part6() + part7()
    }

    private fun part1(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 50546, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le langage de programmation privilégié pour l'analyse de données?", listOf("Python", "C++", "Java", "Swift"), "Tech", "Python est largement utilisé en analyse de données grâce à ses bibliothèques spécialisées comme Pandas, NumPy et Matplotlib, qui simplifient la manipulation et la visualisation des données."),
            en = LocalizedContent("What is the preferred programming language for data analysis?", listOf("Python", "C++", "Java", "Swift"), "Technology", "Python is widely used in data analysis thanks to its specialized libraries like Pandas, NumPy, and Matplotlib, which simplify data manipulation and visualization."),
            zh = LocalizedContent("数据分析的首选编程语言是什么？", listOf("Python", "C++", "Java", "Swift"), "科技", "Python 在数据分析中广泛使用，因为它有 Pandas、NumPy 和 Matplotlib 等专门库，简化了数据处理和可视化。"),
            es = LocalizedContent("¿Cuál es el lenguaje de programación preferido para el análisis de datos?", listOf("Python", "C++", "Java", "Swift"), "Tecnología", "Python se usa ampliamente en análisis de datos gracias a sus bibliotecas especializadas como Pandas, NumPy y Matplotlib, que simplifican la manipulación y visualización de datos.")
        ),
        BilingualQuestion(
            id = 50547, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la blockchain?", listOf("Un type de mur", "Une technologie de chaîne de blocs décentralisée", "Un câble électrique", "Un système d'exploitation"), "Tech", "La blockchain est un registre numérique distribué où les données sont stockées en blocs liés cryptographiquement, garantissant transparence et sécurité sans autorité centrale."),
            en = LocalizedContent("What is blockchain?", listOf("A type of wall", "A decentralized blockchain technology", "An electrical cable", "An operating system"), "Technology", "Blockchain is a distributed digital ledger where data is stored in cryptographically linked blocks, ensuring transparency and security without a central authority."),
            zh = LocalizedContent("什么是区块链？", listOf("一种墙", "一种去中心化的区块链技术", "一种电缆", "一种操作系统"), "科技", "区块链是一种分布式数字账本，数据以加密方式链接的区块存储，无需中央机构即可确保透明度和安全性。"),
            es = LocalizedContent("¿Qué es blockchain?", listOf("Un tipo de muro", "Una tecnología de cadena de bloques descentralizada", "Un cable eléctrico", "Un sistema operativo"), "Tecnología", "Blockchain es un libro de contabilidad digital distribuido donde los datos se almacenan en bloques vinculados criptográficamente, garantizando transparencia y seguridad sin autoridad central.")
        ),
        BilingualQuestion(
            id = 50548, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le fondateur de Tesla?", listOf("Bill Gates", "Elon Musk", "Steve Wozniak", "Jack Ma"), "Tech", "Elon Musk a cofondé Tesla en 2003, mais il n'en est pas le créateur initial : il a rejoint l'entreprise après sa fondation par Martin Eberhard et Marc Tarpenning."),
            en = LocalizedContent("Who is the founder of Tesla?", listOf("Bill Gates", "Elon Musk", "Steve Wozniak", "Jack Ma"), "Technology", "Elon Musk co-founded Tesla in 2003, but he is not the initial creator; he joined the company after its founding by Martin Eberhard and Marc Tarpenning."),
            zh = LocalizedContent("特斯拉的创始人是谁？", listOf("比尔·盖茨", "埃隆·马斯克", "史蒂夫·沃兹尼亚克", "马云"), "科技", "埃隆·马斯克于2003年共同创立了特斯拉，但他并非最初的创始人；他在马丁·艾伯哈德和马克·塔彭宁创立公司后加入。"),
            es = LocalizedContent("¿Quién es el fundador de Tesla?", listOf("Bill Gates", "Elon Musk", "Steve Wozniak", "Jack Ma"), "Tecnología", "Elon Musk cofundó Tesla en 2003, pero no es el creador inicial; se unió a la empresa después de su fundación por Martin Eberhard y Marc Tarpenning.")
        ),
        BilingualQuestion(
            id = 50549, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la cybersécurité?", listOf("Un jeu vidéo", "La protection contre les attaques informatiques", "Un type de serveur", "Un navigateur web"), "Tech", "La cybersécurité désigne l'ensemble des pratiques, technologies et processus conçus pour protéger les systèmes, réseaux et données contre les accès non autorisés, les attaques ou les dommages."),
            en = LocalizedContent("What is cybersecurity?", listOf("A video game", "Protection against computer attacks", "A type of server", "A web browser"), "Technology", "Cybersecurity refers to the set of practices, technologies, and processes designed to protect systems, networks, and data from unauthorized access, attacks, or damage."),
            zh = LocalizedContent("什么是网络安全？", listOf("一种电子游戏", "防范计算机攻击", "一种服务器", "一种网页浏览器"), "科技", "网络安全是指旨在保护系统、网络和数据免受未经授权访问、攻击或损害的一系列实践、技术和流程。"),
            es = LocalizedContent("¿Qué es la ciberseguridad?", listOf("Un videojuego", "La protección contra ataques informáticos", "Un tipo de servidor", "Un navegador web"), "Tecnología", "La ciberseguridad se refiere al conjunto de prácticas, tecnologías y procesos diseñados para proteger sistemas, redes y datos contra accesos no autorizados, ataques o daños.")
        ),
        BilingualQuestion(
            id = 50550, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le précurseur de la Nintendo Switch?", listOf("Nintendo Wii U", "Nintendo 64", "GameCube", "Game Boy"), "Tech", "La Wii U, sortie en 2012, est le précurseur direct de la Switch car elle introduisait déjà un concept hybride avec un écran tactile sur sa manette, le GamePad."),
            en = LocalizedContent("What is the predecessor of the Nintendo Switch?", listOf("Nintendo Wii U", "Nintendo 64", "GameCube", "Game Boy"), "Technology", "The Wii U, released in 2012, is the direct predecessor of the Switch as it already introduced a hybrid concept with a touchscreen on its controller, the GamePad."),
            zh = LocalizedContent("任天堂 Switch 的前身是什么？", listOf("任天堂 Wii U", "任天堂 64", "GameCube", "Game Boy"), "科技", "2012 年发布的 Wii U 是 Switch 的直接前身，因为它已经引入了混合概念，其控制器 GamePad 带有触摸屏。"),
            es = LocalizedContent("¿Cuál es el predecesor de Nintendo Switch?", listOf("Nintendo Wii U", "Nintendo 64", "GameCube", "Game Boy"), "Tecnología", "La Wii U, lanzada en 2012, es la predecesora directa de Switch ya que introdujo un concepto híbrido con una pantalla táctil en su controlador, el GamePad.")
        ),
        BilingualQuestion(
            id = 50551, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le deep learning?", listOf("Un type de serveur", "Un domaine du machine learning utilisant les réseaux de neurones", "Un langage de programmation", "Un protocole réseau"), "Tech", "Le deep learning est une sous-catégorie du machine learning qui s'inspire du cerveau humain en utilisant des réseaux de neurones artificiels à plusieurs couches pour analyser des données complexes."),
            en = LocalizedContent("What is deep learning?", listOf("A type of server", "A field of machine learning using neural networks", "A programming language", "A network protocol"), "Technology", "Deep learning is a subcategory of machine learning inspired by the human brain, using multi-layered artificial neural networks to analyze complex data."),
            zh = LocalizedContent("什么是深度学习？", listOf("一种服务器", "机器学习中使用神经网络的领域", "一种编程语言", "一种网络协议"), "科技", "深度学习是机器学习的一个子类，受人类大脑启发，使用多层人工神经网络分析复杂数据。"),
            es = LocalizedContent("¿Qué es el deep learning?", listOf("Un tipo de servidor", "Un campo del machine learning que utiliza redes neuronales", "Un lenguaje de programación", "Un protocolo de red"), "Tecnología", "El deep learning es una subcategoría del machine learning inspirada en el cerebro humano, que utiliza redes neuronales artificiales multicapa para analizar datos complejos.")
        ),
        BilingualQuestion(
            id = 50552, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le fondateur de Facebook?", listOf("Bill Gates", "Steve Jobs", "Mark Zuckerberg", "Jack Ma"), "Tech", "Mark Zuckerberg a cofondé Facebook en 2004 avec ses camarades de l'université Harvard, Eduardo Saverin, Andrew McCollum, Dustin Moskovitz et Chris Hughes."),
            en = LocalizedContent("Who is the founder of Facebook?", listOf("Bill Gates", "Steve Jobs", "Mark Zuckerberg", "Jack Ma"), "Technology", "Mark Zuckerberg co-founded Facebook in 2004 with his Harvard University classmates Eduardo Saverin, Andrew McCollum, Dustin Moskovitz, and Chris Hughes."),
            zh = LocalizedContent("Facebook 的创始人是谁？", listOf("比尔·盖茨", "史蒂夫·乔布斯", "马克·扎克伯格", "马云"), "科技", "马克·扎克伯格于 2004 年与哈佛大学同学爱德华多·萨维林、安德鲁·麦科勒姆、达斯汀·莫斯科维茨和克里斯·休斯共同创立了 Facebook。"),
            es = LocalizedContent("¿Quién es el fundador de Facebook?", listOf("Bill Gates", "Steve Jobs", "Mark Zuckerberg", "Jack Ma"), "Tecnología", "Mark Zuckerberg cofundó Facebook en 2004 con sus compañeros de la Universidad Harvard Eduardo Saverin, Andrew McCollum, Dustin Moskovitz y Chris Hughes.")
        ),
        BilingualQuestion(
            id = 50553, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la réalité virtuelle?", listOf("Un jeu vidéo", "Une simulation informatique immersive d'environnements", "Un type de serveur", "Un langage de programmation"), "Tech", "La réalité virtuelle plonge l'utilisateur dans un monde numérique en 3D via un casque, créant une expérience interactive et immersive qui simule des environnements réels ou imaginaires."),
            en = LocalizedContent("What is virtual reality?", listOf("A video game", "An immersive computer simulation of environments", "A type of server", "A programming language"), "Technology", "Virtual reality immerses the user in a 3D digital world via a headset, creating an interactive and immersive experience that simulates real or imaginary environments."),
            zh = LocalizedContent("什么是虚拟现实？", listOf("一种电子游戏", "一种沉浸式计算机环境模拟", "一种服务器", "一种编程语言"), "科技", "虚拟现实通过头戴设备将用户沉浸于 3D 数字世界，创造交互式沉浸体验，模拟真实或想象的环境。"),
            es = LocalizedContent("¿Qué es la realidad virtual?", listOf("Un videojuego", "Una simulación informática inmersiva de entornos", "Un tipo de servidor", "Un lenguaje de programación"), "Tecnología", "La realidad virtual sumerge al usuario en un mundo digital 3D mediante un casco, creando una experiencia interactiva e inmersiva que simula entornos reales o imaginarios.")
        ),
        BilingualQuestion(
            id = 50554, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est l'ordre de magnitude d'une exabyte en octets?", listOf("10^15", "10^18", "10^21", "10^12"), "Tech", "Le préfixe \"exa\" dans le Système international d'unités correspond à 10^18, soit un milliard de milliards d'octets."),
            en = LocalizedContent("What is the order of magnitude of an exabyte in bytes?", listOf("10^15", "10^18", "10^21", "10^12"), "Technology", "The prefix 'exa' in the International System of Units corresponds to 10^18, i.e., one billion billion bytes."),
            zh = LocalizedContent("艾字节（exabyte）的字节数量级是多少？", listOf("10^15", "10^18", "10^21", "10^12"), "科技", "国际单位制中的前缀“艾”（exa）对应 10^18，即一百亿亿字节。"),
            es = LocalizedContent("¿Cuál es el orden de magnitud de un exabyte en bytes?", listOf("10^15", "10^18", "10^21", "10^12"), "Tecnología", "El prefijo 'exa' en el Sistema Internacional de Unidades corresponde a 10^18, es decir, mil millones de millones de bytes.")
        ),
        BilingualQuestion(
            id = 50555, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'est-ce que le quantum computing?", listOf("Un type de serveur traditionnel", "L'informatique utilisant les qubits et les principes de la mécanique quantique", "Un langage de programmation", "Un navigateur web"), "Tech", "Contrairement aux bits classiques (0 ou 1), les qubits exploitent la superposition et l'intrication quantique pour effectuer certains calculs bien plus rapidement."),
            en = LocalizedContent("What is quantum computing?", listOf("A type of traditional server", "Computing using qubits and principles of quantum mechanics", "A programming language", "A web browser"), "Technology", "Unlike classical bits (0 or 1), qubits exploit superposition and quantum entanglement to perform certain calculations much faster."),
            zh = LocalizedContent("什么是量子计算？", listOf("一种传统服务器", "使用量子比特和量子力学原理的计算", "一种编程语言", "一种网页浏览器"), "科技", "与经典比特（0 或 1）不同，量子比特利用叠加和量子纠缠来更快地执行某些计算。"),
            es = LocalizedContent("¿Qué es la computación cuántica?", listOf("Un tipo de servidor tradicional", "Computación que utiliza qubits y principios de la mecánica cuántica", "Un lenguaje de programación", "Un navegador web"), "Tecnología", "A diferencia de los bits clásicos (0 o 1), los qubits explotan la superposición y el entrelazamiento cuántico para realizar ciertos cálculos mucho más rápido.")
        ),
        BilingualQuestion(
            id = 50556, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de Linux?", listOf("Richard Stallman", "Linus Torvalds", "Bill Gates", "Steve Jobs"), "Tech", "Linus Torvalds a créé le noyau Linux en 1991 alors qu'il était étudiant à l'Université d'Helsinki, en Finlande."),
            en = LocalizedContent("Who created Linux?", listOf("Richard Stallman", "Linus Torvalds", "Bill Gates", "Steve Jobs"), "Technology", "Linus Torvalds created the Linux kernel in 1991 while he was a student at the University of Helsinki, Finland."),
            zh = LocalizedContent("谁创建了Linux？", listOf("理查德·斯托曼", "林纳斯·托瓦兹", "比尔·盖茨", "史蒂夫·乔布斯"), "科技", "林纳斯·托瓦兹于1991年在芬兰赫尔辛基大学就读期间创建了Linux内核。"),
            es = LocalizedContent("¿Quién creó Linux?", listOf("Richard Stallman", "Linus Torvalds", "Bill Gates", "Steve Jobs"), "Tecnología", "Linus Torvalds creó el núcleo de Linux en 1991 mientras era estudiante en la Universidad de Helsinki, Finlandia.")
        ),
        BilingualQuestion(
            id = 50557, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'est-ce que la cryptographie asymétrique?", listOf("Un type de serveur", "Un système utilisant deux clés: une publique et une privée", "Un langage de programmation", "Un protocole FTP"), "Tech", "La cryptographie asymétrique repose sur une paire de clés mathématiquement liées : la clé publique, partagée librement, et la clé privée, gardée secrète. Cela permet de chiffrer un message avec la clé publique et de le déchiffrer uniquement avec la clé privée correspondante."),
            en = LocalizedContent("What is asymmetric cryptography?", listOf("A type of server", "A system using two keys: a public and a private one", "A programming language", "An FTP protocol"), "Technology", "Asymmetric cryptography relies on a mathematically linked key pair: the public key, freely shared, and the private key, kept secret. This allows encrypting a message with the public key and decrypting it only with the corresponding private key."),
            zh = LocalizedContent("什么是非对称加密？", listOf("一种服务器类型", "一种使用公钥和私钥的系统", "一种编程语言", "一种FTP协议"), "科技", "非对称加密依赖于一对数学上相关的密钥：公钥自由共享，私钥保密。这样可以用公钥加密消息，只有对应的私钥才能解密。"),
            es = LocalizedContent("¿Qué es la criptografía asimétrica?", listOf("Un tipo de servidor", "Un sistema que utiliza dos claves: una pública y una privada", "Un lenguaje de programación", "Un protocolo FTP"), "Tecnología", "La criptografía asimétrica se basa en un par de claves matemáticamente vinculadas: la clave pública, compartida libremente, y la clave privada, mantenida en secreto. Esto permite cifrar un mensaje con la clave pública y descifrarlo solo con la clave privada correspondiente.")
        ),
        BilingualQuestion(
            id = 50558, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le fondateur de Apple?", listOf("Bill Gates", "Steve Jobs", "Mark Zuckerberg", "Larry Page"), "Tech", "Steve Jobs a cofondé Apple en 1976 avec Steve Wozniak et Ronald Wayne, et en a été le PDG emblématique jusqu'à son décès en 2011."),
            en = LocalizedContent("Who founded Apple?", listOf("Bill Gates", "Steve Jobs", "Mark Zuckerberg", "Larry Page"), "Technology", "Steve Jobs co-founded Apple in 1976 with Steve Wozniak and Ronald Wayne, and served as its iconic CEO until his death in 2011."),
            zh = LocalizedContent("谁创立了苹果公司？", listOf("比尔·盖茨", "史蒂夫·乔布斯", "马克·扎克伯格", "拉里·佩奇"), "科技", "史蒂夫·乔布斯于1976年与史蒂夫·沃兹尼亚克和罗纳德·韦恩共同创立了苹果公司，并担任其标志性CEO直至2011年去世。"),
            es = LocalizedContent("¿Quién fundó Apple?", listOf("Bill Gates", "Steve Jobs", "Mark Zuckerberg", "Larry Page"), "Tecnología", "Steve Jobs cofundó Apple en 1976 con Steve Wozniak y Ronald Wayne, y fue su emblemático CEO hasta su fallecimiento en 2011.")
        ),
        BilingualQuestion(
            id = 50559, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le 5G?", listOf("Une version de WiFi", "La cinquième génération de technologie mobile", "Un type de serveur", "Un langage de programmation"), "Tech", "La 5G fait suite à la 4G (LTE) et offre des débits plus élevés et une latence réduite pour les communications mobiles."),
            en = LocalizedContent("What is 5G?", listOf("A version of WiFi", "The fifth generation of mobile technology", "A type of server", "A programming language"), "Technology", "5G succeeds 4G (LTE) and offers higher speeds and lower latency for mobile communications."),
            zh = LocalizedContent("什么是5G？", listOf("一种WiFi版本", "第五代移动通信技术", "一种服务器类型", "一种编程语言"), "科技", "5G是4G（LTE）的后续技术，为移动通信提供更高的速度和更低的延迟。"),
            es = LocalizedContent("¿Qué es el 5G?", listOf("Una versión de WiFi", "La quinta generación de tecnología móvil", "Un tipo de servidor", "Un lenguaje de programación"), "Tecnología", "El 5G sucede al 4G (LTE) y ofrece mayores velocidades y menor latencia para las comunicaciones móviles.")
        ),
        BilingualQuestion(
            id = 50560, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le protocole de messagerie électronique sécurisée?", listOf("HTTP", "SMTP", "PGP", "FTP"), "Tech", "PGP (Pretty Good Privacy) est un protocole de chiffrement et de signature numérique utilisé pour sécuriser les emails, garantissant confidentialité et authentification."),
            en = LocalizedContent("What is a secure email protocol?", listOf("HTTP", "SMTP", "PGP", "FTP"), "Technology", "PGP (Pretty Good Privacy) is an encryption and digital signature protocol used to secure emails, ensuring confidentiality and authentication."),
            zh = LocalizedContent("什么是安全的电子邮件协议？", listOf("HTTP", "SMTP", "PGP", "FTP"), "科技", "PGP（Pretty Good Privacy）是一种用于保护电子邮件的加密和数字签名协议，确保机密性和身份验证。"),
            es = LocalizedContent("¿Qué es un protocolo de correo electrónico seguro?", listOf("HTTP", "SMTP", "PGP", "FTP"), "Tecnología", "PGP (Pretty Good Privacy) es un protocolo de cifrado y firma digital utilizado para asegurar correos electrónicos, garantizando confidencialidad y autenticación.")
        ),
        BilingualQuestion(
            id = 50561, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un GPU?", listOf("General Processing Unit", "Graphics Processing Unit", "Global Protocol Unit", "Government Processing Unit"), "Tech", "Un GPU est un processeur spécialisé dans le calcul graphique, conçu pour accélérer le rendu d'images et de vidéos en effectuant des opérations parallèles."),
            en = LocalizedContent("What is a GPU?", listOf("General Processing Unit", "Graphics Processing Unit", "Global Protocol Unit", "Government Processing Unit"), "Technology", "A GPU is a processor specialized in graphics computation, designed to accelerate image and video rendering by performing parallel operations."),
            zh = LocalizedContent("什么是GPU？", listOf("通用处理单元", "图形处理单元", "全球协议单元", "政府处理单元"), "科技", "GPU是一种专门用于图形计算的处理器，通过并行运算加速图像和视频的渲染。"),
            es = LocalizedContent("¿Qué es una GPU?", listOf("Unidad de Procesamiento General", "Unidad de Procesamiento Gráfico", "Unidad de Protocolo Global", "Unidad de Procesamiento Gubernamental"), "Tecnología", "Una GPU es un procesador especializado en el cálculo gráfico, diseñado para acelerar la representación de imágenes y videos mediante operaciones paralelas.")
        ),
        BilingualQuestion(
            id = 50562, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le langage de base de données?", listOf("Python", "SQL", "C++", "Java"), "Tech", "SQL, pour Structured Query Language, est le langage standard utilisé pour interroger et gérer les bases de données relationnelles."),
            en = LocalizedContent("What is the database language?", listOf("Python", "SQL", "C++", "Java"), "Technology", "SQL, for Structured Query Language, is the standard language used to query and manage relational databases."),
            zh = LocalizedContent("什么是数据库语言？", listOf("Python", "SQL", "C++", "Java"), "科技", "SQL（结构化查询语言）是用于查询和管理关系数据库的标准语言。"),
            es = LocalizedContent("¿Cuál es el lenguaje de bases de datos?", listOf("Python", "SQL", "C++", "Java"), "Tecnología", "SQL, por Structured Query Language, es el lenguaje estándar utilizado para consultar y gestionar bases de datos relacionales.")
        ),
        BilingualQuestion(
            id = 50563, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le JSON?", listOf("Un type de serveur", "Un format de données léger", "Un langage de programmation", "Un protocole réseau"), "Tech", "JSON, pour JavaScript Object Notation, est un format texte structuré et facile à lire, utilisé pour échanger des données entre applications, notamment sur le web."),
            en = LocalizedContent("What is JSON?", listOf("A type of server", "A lightweight data format", "A programming language", "A network protocol"), "Technology", "JSON, for JavaScript Object Notation, is a structured, easy-to-read text format used to exchange data between applications, especially on the web."),
            zh = LocalizedContent("什么是JSON？", listOf("一种服务器类型", "一种轻量级数据格式", "一种编程语言", "一种网络协议"), "科技", "JSON（JavaScript对象表示法）是一种结构化、易读的文本格式，用于应用程序之间交换数据，尤其在Web上。"),
            es = LocalizedContent("¿Qué es JSON?", listOf("Un tipo de servidor", "Un formato de datos ligero", "Un lenguaje de programación", "Un protocolo de red"), "Tecnología", "JSON, por JavaScript Object Notation, es un formato de texto estructurado y fácil de leer, utilizado para intercambiar datos entre aplicaciones, especialmente en la web.")
        ),
        BilingualQuestion(
            id = 50564, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nombre de transistors dans une puce moderne?", listOf("Des millions", "Des milliards", "Des trillions", "Des millions seulement"), "Tech", "La loi de Moore a permis de miniaturiser les transistors, et les processeurs modernes comme l'Apple M2 Ultra en contiennent plus de 100 milliards."),
            en = LocalizedContent("How many transistors are in a modern chip?", listOf("Millions", "Billions", "Trillions", "Only millions"), "Technology", "Moore's law has enabled transistor miniaturization, and modern processors like the Apple M2 Ultra contain over 100 billion transistors."),
            zh = LocalizedContent("现代芯片中有多少晶体管？", listOf("数百万", "数十亿", "数万亿", "仅数百万"), "科技", "摩尔定律使得晶体管小型化成为可能，现代处理器如Apple M2 Ultra包含超过1000亿个晶体管。"),
            es = LocalizedContent("¿Cuántos transistores tiene un chip moderno?", listOf("Millones", "Miles de millones", "Billones", "Solo millones"), "Tecnología", "La ley de Moore ha permitido la miniaturización de los transistores, y los procesadores modernos como el Apple M2 Ultra contienen más de 100 mil millones de transistores.")
        ),
        BilingualQuestion(
            id = 50565, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le NoSQL?", listOf("Un type de serveur", "Une base de données non relationnelle", "Un langage de programmation", "Un protocole réseau"), "Tech", "Le terme NoSQL désigne les bases de données qui n'utilisent pas le modèle relationnel classique (tables et SQL), privilégiant des structures flexibles comme les documents ou les graphes pour gérer de grands volumes de données."),
            en = LocalizedContent("What is NoSQL?", listOf("A type of server", "A non-relational database", "A programming language", "A network protocol"), "Technology", "The term NoSQL refers to databases that do not use the classic relational model (tables and SQL), favoring flexible structures like documents or graphs to handle large volumes of data."),
            zh = LocalizedContent("什么是NoSQL？", listOf("一种服务器类型", "一种非关系型数据库", "一种编程语言", "一种网络协议"), "科技", "NoSQL一词指的是不使用传统关系模型（表和SQL）的数据库，而采用文档或图等灵活结构来处理大量数据。"),
            es = LocalizedContent("¿Qué es NoSQL?", listOf("Un tipo de servidor", "Una base de datos no relacional", "Un lenguaje de programación", "Un protocolo de red"), "Tecnología", "El término NoSQL se refiere a bases de datos que no utilizan el modelo relacional clásico (tablas y SQL), favoreciendo estructuras flexibles como documentos o grafos para manejar grandes volúmenes de datos.")
        ),
        BilingualQuestion(
            id = 50566, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le créateur de YouTube?", listOf("Bill Gates", "Steve Jobs", "Steve Chen et Chad Hurley", "Jack Ma"), "Tech", "YouTube a été fondé en 2005 par Steve Chen, Chad Hurley et Jawed Karim, d'anciens employés de PayPal."),
            en = LocalizedContent("Who is the creator of YouTube?", listOf("Bill Gates", "Steve Jobs", "Steve Chen and Chad Hurley", "Jack Ma"), "Technology", "YouTube was founded in 2005 by Steve Chen, Chad Hurley, and Jawed Karim, former employees of PayPal."),
            zh = LocalizedContent("谁是YouTube的创始人？", listOf("比尔·盖茨", "史蒂夫·乔布斯", "陈士骏和查德·赫利", "马云"), "科技", "YouTube于2005年由前PayPal员工陈士骏、查德·赫利和贾维德·卡里姆创立。"),
            es = LocalizedContent("¿Quién es el creador de YouTube?", listOf("Bill Gates", "Steve Jobs", "Steve Chen y Chad Hurley", "Jack Ma"), "Tecnología", "YouTube fue fundado en 2005 por Steve Chen, Chad Hurley y Jawed Karim, ex empleados de PayPal.")
        ),
        BilingualQuestion(
            id = 50567, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le responsive design?", listOf("Un langage de programmation", "Un design web adapté à tous les appareils", "Un type de serveur", "Un protocole réseau"), "Tech", "Le responsive design permet à un site web de s'adapter automatiquement à la taille de l'écran (ordinateur, tablette, smartphone) grâce à des grilles flexibles et des requêtes CSS."),
            en = LocalizedContent("What is responsive design?", listOf("A programming language", "A web design adapted to all devices", "A type of server", "A network protocol"), "Technology", "Responsive design allows a website to automatically adapt to screen size (computer, tablet, smartphone) using flexible grids and CSS queries."),
            zh = LocalizedContent("什么是响应式设计？", listOf("一种编程语言", "适应所有设备的网页设计", "一种服务器类型", "一种网络协议"), "科技", "响应式设计通过灵活的网格和CSS查询，使网站能够自动适应屏幕尺寸（电脑、平板、智能手机）。"),
            es = LocalizedContent("¿Qué es el diseño responsive?", listOf("Un lenguaje de programación", "Un diseño web adaptado a todos los dispositivos", "Un tipo de servidor", "Un protocolo de red"), "Tecnología", "El diseño responsive permite que un sitio web se adapte automáticamente al tamaño de la pantalla (ordenador, tableta, smartphone) mediante cuadrículas flexibles y consultas CSS.")
        ),
        BilingualQuestion(
            id = 50568, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nombre de bits dans un byte?", listOf("4", "8", "16", "32"), "Tech", "Un byte est composé de 8 bits, une convention standardisée dans l'informatique pour représenter un caractère ou une donnée élémentaire."),
            en = LocalizedContent("How many bits are in a byte?", listOf("4", "8", "16", "32"), "Technology", "A byte consists of 8 bits, a standardized convention in computing to represent a character or basic data."),
            zh = LocalizedContent("一个字节有多少位？", listOf("4", "8", "16", "32"), "科技", "一个字节由8位组成，这是计算机中表示字符或基本数据的标准化约定。"),
            es = LocalizedContent("¿Cuántos bits tiene un byte?", listOf("4", "8", "16", "32"), "Tecnología", "Un byte se compone de 8 bits, una convención estandarizada en informática para representar un carácter o dato elemental.")
        ),
        BilingualQuestion(
            id = 50569, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le Wi-Fi?", listOf("Un câble de connexion", "Une technologie de connexion sans fil", "Un type de serveur", "Un langage de programmation"), "Tech", "Le Wi-Fi permet à des appareils électroniques d'échanger des données par ondes radio, évitant ainsi les câbles physiques."),
            en = LocalizedContent("What is Wi-Fi?", listOf("A connection cable", "A wireless connection technology", "A type of server", "A programming language"), "Technology", "Wi-Fi allows electronic devices to exchange data via radio waves, avoiding physical cables."),
            zh = LocalizedContent("什么是Wi-Fi？", listOf("一种连接线", "一种无线连接技术", "一种服务器类型", "一种编程语言"), "科技", "Wi-Fi允许电子设备通过无线电波交换数据，从而避免使用物理线缆。"),
            es = LocalizedContent("¿Qué es el Wi-Fi?", listOf("Un cable de conexión", "Una tecnología de conexión inalámbrica", "Un tipo de servidor", "Un lenguaje de programación"), "Tecnología", "El Wi-Fi permite que dispositivos electrónicos intercambien datos mediante ondas de radio, evitando cables físicos.")
        ),
        BilingualQuestion(
            id = 50570, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le standard pour les appareils mobiles Bluetooth?", listOf("802.11", "802.15", "802.3", "802.16"), "Tech", "Le standard 802.15 est défini par l’IEEE pour les réseaux sans fil à courte portée, comme le Bluetooth, utilisé dans les appareils mobiles pour la communication entre périphériques."),
            en = LocalizedContent("What is the standard for Bluetooth mobile devices?", listOf("802.11", "802.15", "802.3", "802.16"), "Technology", "The 802.15 standard is defined by IEEE for short-range wireless networks, such as Bluetooth, used in mobile devices for communication between peripherals."),
            zh = LocalizedContent("蓝牙移动设备的标准是什么？", listOf("802.11", "802.15", "802.3", "802.16"), "科技", "802.15标准由IEEE为短距离无线网络（如蓝牙）定义，用于移动设备与外设之间的通信。"),
            es = LocalizedContent("¿Cuál es el estándar para dispositivos móviles Bluetooth?", listOf("802.11", "802.15", "802.3", "802.16"), "Tecnología", "El estándar 802.15 está definido por IEEE para redes inalámbricas de corto alcance, como Bluetooth, utilizado en dispositivos móviles para la comunicación entre periféricos.")
        ),
        BilingualQuestion(
            id = 50571, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la virtualisation?", listOf("Un jeu vidéo", "La création de versions virtuelles d'environnements informatiques", "Un type de serveur", "Un langage de programmation"), "Tech", "La virtualisation permet d'exécuter plusieurs systèmes d'exploitation ou applications sur un seul serveur physique, en créant des environnements isolés via un hyperviseur."),
            en = LocalizedContent("What is virtualization?", listOf("A video game", "The creation of virtual versions of computing environments", "A type of server", "A programming language"), "Technology", "Virtualization allows running multiple operating systems or applications on a single physical server by creating isolated environments via a hypervisor."),
            zh = LocalizedContent("什么是虚拟化？", listOf("一种电子游戏", "创建计算环境的虚拟版本", "一种服务器类型", "一种编程语言"), "科技", "虚拟化通过管理程序创建隔离环境，允许在单个物理服务器上运行多个操作系统或应用程序。"),
            es = LocalizedContent("¿Qué es la virtualización?", listOf("Un videojuego", "La creación de versiones virtuales de entornos informáticos", "Un tipo de servidor", "Un lenguaje de programación"), "Tecnología", "La virtualización permite ejecutar múltiples sistemas operativos o aplicaciones en un solo servidor físico, creando entornos aislados mediante un hipervisor.")
        ),
        BilingualQuestion(
            id = 50572, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le fondateur de Amazon?", listOf("Bill Gates", "Steve Jobs", "Jeff Bezos", "Jack Ma"), "Tech", "Jeff Bezos a fondé Amazon en 1994, initialement comme une librairie en ligne, avant d'en faire un géant mondial du commerce électronique et du cloud computing."),
            en = LocalizedContent("Who is the founder of Amazon?", listOf("Bill Gates", "Steve Jobs", "Jeff Bezos", "Jack Ma"), "Technology", "Jeff Bezos founded Amazon in 1994, initially as an online bookstore, before turning it into a global e-commerce and cloud computing giant."),
            zh = LocalizedContent("亚马逊的创始人是谁？", listOf("比尔·盖茨", "史蒂夫·乔布斯", "杰夫·贝佐斯", "马云"), "科技", "杰夫·贝佐斯于1994年创立亚马逊，最初是一家在线书店，后来成为全球电子商务和云计算巨头。"),
            es = LocalizedContent("¿Quién es el fundador de Amazon?", listOf("Bill Gates", "Steve Jobs", "Jeff Bezos", "Jack Ma"), "Tecnología", "Jeff Bezos fundó Amazon en 1994, inicialmente como una librería en línea, antes de convertirlo en un gigante mundial del comercio electrónico y la computación en la nube.")
        ),
        BilingualQuestion(
            id = 50573, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le cache?", listOf("Un type de serveur", "Une mémoire rapide stockant les données fréquemment accédées", "Un langage de programmation", "Un protocole réseau"), "Tech", "Le cache est une mémoire à haute vitesse qui conserve temporairement des copies de données souvent utilisées, afin d'accélérer leur accès par le processeur ou le navigateur."),
            en = LocalizedContent("What is cache?", listOf("A type of server", "A fast memory storing frequently accessed data", "A programming language", "A network protocol"), "Technology", "Cache is a high-speed memory that temporarily stores copies of frequently used data to speed up access by the processor or browser."),
            zh = LocalizedContent("什么是缓存？", listOf("一种服务器类型", "一种存储频繁访问数据的快速内存", "一种编程语言", "一种网络协议"), "科技", "缓存是一种高速内存，临时存储常用数据的副本，以加快处理器或浏览器的访问速度。"),
            es = LocalizedContent("¿Qué es la caché?", listOf("Un tipo de servidor", "Una memoria rápida que almacena datos accedidos con frecuencia", "Un lenguaje de programación", "Un protocolo de red"), "Tecnología", "La caché es una memoria de alta velocidad que almacena temporalmente copias de datos usados con frecuencia para acelerar su acceso por parte del procesador o navegador.")
        ),
        BilingualQuestion(
            id = 50574, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel langage de programmation minimaliste et concurrent a ete cree par Google en 2009 ?", listOf("Java", "Go", "Python", "C++"), "Tech", "Go a été conçu par Google en 2009 pour combiner performance, simplicité et support natif de la concurrence, répondant aux besoins des systèmes modernes."),
            en = LocalizedContent("Which minimalist and concurrent programming language was created by Google in 2009?", listOf("Java", "Go", "Python", "C++"), "Technology", "Go was designed by Google in 2009 to combine performance, simplicity, and native concurrency support, meeting the needs of modern systems."),
            zh = LocalizedContent("谷歌在2009年创建的哪种极简且并发的编程语言？", listOf("Java", "Go", "Python", "C++"), "科技", "Go由谷歌于2009年设计，旨在结合性能、简洁性和原生并发支持，满足现代系统的需求。"),
            es = LocalizedContent("¿Qué lenguaje de programación minimalista y concurrente fue creado por Google en 2009?", listOf("Java", "Go", "Python", "C++"), "Tecnología", "Go fue diseñado por Google en 2009 para combinar rendimiento, simplicidad y soporte nativo de concurrencia, respondiendo a las necesidades de los sistemas modernos.")
        ),
        BilingualQuestion(
            id = 50575, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le crawling?", listOf("Un jeu vidéo", "L'exploration automatique de pages web par les moteurs de recherche", "Un type de serveur", "Un langage de programmation"), "Tech", "Le crawling est le processus par lequel les moteurs de recherche comme Google parcourent automatiquement le web à l'aide de robots pour indexer le contenu des pages."),
            en = LocalizedContent("What is crawling?", listOf("A video game", "The automatic exploration of web pages by search engines", "A type of server", "A programming language"), "Technology", "Crawling is the process by which search engines like Google automatically browse the web using bots to index page content."),
            zh = LocalizedContent("什么是爬取？", listOf("一种电子游戏", "搜索引擎自动探索网页的过程", "一种服务器类型", "一种编程语言"), "科技", "爬取是搜索引擎（如谷歌）使用机器人自动浏览网络以索引页面内容的过程。"),
            es = LocalizedContent("¿Qué es el crawling?", listOf("Un videojuego", "La exploración automática de páginas web por los motores de búsqueda", "Un tipo de servidor", "Un lenguaje de programación"), "Tecnología", "El crawling es el proceso mediante el cual los motores de búsqueda como Google recorren automáticamente la web usando robots para indexar el contenido de las páginas.")
        ),
        BilingualQuestion(
            id = 50576, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le protocole de transfert de fichiers sécurisé?", listOf("FTP", "SFTP", "HTTP", "SMTP"), "Tech", "SFTP (SSH File Transfer Protocol) chiffre les données via SSH, contrairement à FTP qui les envoie en clair, offrant ainsi une sécurité accrue pour les transferts de fichiers."),
            en = LocalizedContent("What is the secure file transfer protocol?", listOf("FTP", "SFTP", "HTTP", "SMTP"), "Technology", "SFTP (SSH File Transfer Protocol) encrypts data via SSH, unlike FTP which sends data in plain text, thus providing increased security for file transfers."),
            zh = LocalizedContent("什么是安全的文件传输协议？", listOf("FTP", "SFTP", "HTTP", "SMTP"), "科技", "SFTP（SSH文件传输协议）通过SSH加密数据，而FTP以明文发送数据，从而为文件传输提供更高的安全性。"),
            es = LocalizedContent("¿Cuál es el protocolo de transferencia de archivos seguro?", listOf("FTP", "SFTP", "HTTP", "SMTP"), "Tecnología", "SFTP (Protocolo de Transferencia de Archivos SSH) cifra los datos a través de SSH, a diferencia de FTP que los envía en texto plano, ofreciendo así una mayor seguridad para las transferencias de archivos.")
        ),
        BilingualQuestion(
            id = 50577, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un framework?", listOf("Un type de serveur", "Une structure logicielle pour développer des applications", "Un langage de programmation", "Un protocole réseau"), "Tech", "Un framework fournit une base structurée avec des outils et des conventions prédéfinis, permettant aux développeurs de gagner du temps en évitant de réinventer la roue pour des tâches courantes."),
            en = LocalizedContent("What is a framework?", listOf("A type of server", "A software structure for developing applications", "A programming language", "A network protocol"), "Technology", "A framework provides a structured foundation with predefined tools and conventions, allowing developers to save time by avoiding reinventing the wheel for common tasks."),
            zh = LocalizedContent("什么是框架？", listOf("一种服务器类型", "用于开发应用程序的软件结构", "一种编程语言", "一种网络协议"), "科技", "框架提供了结构化的基础，包含预定义的工具和约定，使开发人员能够避免为常见任务重复造轮子，从而节省时间。"),
            es = LocalizedContent("¿Qué es un framework?", listOf("Un tipo de servidor", "Una estructura de software para desarrollar aplicaciones", "Un lenguaje de programación", "Un protocolo de red"), "Tecnología", "Un framework proporciona una base estructurada con herramientas y convenciones predefinidas, permitiendo a los desarrolladores ahorrar tiempo al evitar reinventar la rueda para tareas comunes.")
        ),
        BilingualQuestion(
            id = 50578, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le créateur de Wikipedia?", listOf("Bill Gates", "Jimmy Wales", "Steve Jobs", "Mark Zuckerberg"), "Tech", "Jimmy Wales a fondé Wikipedia en 2001, avec Larry Sanger, pour créer une encyclopédie libre et collaborative accessible à tous."),
            en = LocalizedContent("Who is the creator of Wikipedia?", listOf("Bill Gates", "Jimmy Wales", "Steve Jobs", "Mark Zuckerberg"), "Technology", "Jimmy Wales founded Wikipedia in 2001, along with Larry Sanger, to create a free and collaborative encyclopedia accessible to everyone."),
            zh = LocalizedContent("维基百科的创始人是谁？", listOf("比尔·盖茨", "吉米·威尔士", "史蒂夫·乔布斯", "马克·扎克伯格"), "科技", "吉米·威尔士于2001年与拉里·桑格共同创立了维基百科，旨在创建一个人人可访问的自由协作百科全书。"),
            es = LocalizedContent("¿Quién es el creador de Wikipedia?", listOf("Bill Gates", "Jimmy Wales", "Steve Jobs", "Mark Zuckerberg"), "Tecnología", "Jimmy Wales fundó Wikipedia en 2001, junto con Larry Sanger, para crear una enciclopedia libre y colaborativa accesible para todos.")
        ),
        BilingualQuestion(
            id = 50579, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le SEO?", listOf("Search Engine Operator", "Search Engine Optimization", "System Entry Optimization", "Search Entry Operator"), "Tech", "Le SEO désigne l'ensemble des techniques visant à optimiser la visibilité d'un site web dans les résultats des moteurs de recherche."),
            en = LocalizedContent("What is SEO?", listOf("Search Engine Operator", "Search Engine Optimization", "System Entry Optimization", "Search Entry Operator"), "Technology", "SEO refers to the set of techniques aimed at optimizing a website's visibility in search engine results."),
            zh = LocalizedContent("什么是SEO？", listOf("搜索引擎操作员", "搜索引擎优化", "系统入口优化", "搜索入口操作员"), "科技", "SEO是指旨在优化网站在搜索引擎结果中可见性的一系列技术。"),
            es = LocalizedContent("¿Qué es el SEO?", listOf("Operador de motor de búsqueda", "Optimización para motores de búsqueda", "Optimización de entrada del sistema", "Operador de entrada de búsqueda"), "Tecnología", "El SEO se refiere al conjunto de técnicas destinadas a optimizar la visibilidad de un sitio web en los resultados de los motores de búsqueda.")
        ),
        BilingualQuestion(
            id = 50580, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nombre de gigabytes dans un terabyte?", listOf("100", "512", "1000", "1024"), "Tech", "Un terabyte équivaut à 1024 gigabytes car le stockage numérique utilise le système binaire, où chaque unité est multipliée par 1024 (2^10) plutôt que par 1000."),
            en = LocalizedContent("How many gigabytes are in a terabyte?", listOf("100", "512", "1000", "1024"), "Technology", "One terabyte equals 1024 gigabytes because digital storage uses the binary system, where each unit is multiplied by 1024 (2^10) rather than 1000."),
            zh = LocalizedContent("一太字节等于多少吉字节？", listOf("100", "512", "1000", "1024"), "科技", "一太字节等于1024吉字节，因为数字存储使用二进制系统，每个单位乘以1024（2^10）而不是1000。"),
            es = LocalizedContent("¿Cuántos gigabytes hay en un terabyte?", listOf("100", "512", "1000", "1024"), "Tecnología", "Un terabyte equivale a 1024 gigabytes porque el almacenamiento digital utiliza el sistema binario, donde cada unidad se multiplica por 1024 (2^10) en lugar de 1000.")
        ),
        BilingualQuestion(
            id = 50581, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que DevOps?", listOf("Un jeu vidéo", "Une approche combinant développement et opérations informatiques", "Un type de serveur", "Un langage de programmation"), "Tech", "DevOps est une méthodologie qui intègre les équipes de développement et d'exploitation pour améliorer la collaboration et automatiser les processus de livraison logicielle."),
            en = LocalizedContent("What is DevOps?", listOf("A video game", "An approach combining development and IT operations", "A type of server", "A programming language"), "Technology", "DevOps is a methodology that integrates development and operations teams to improve collaboration and automate software delivery processes."),
            zh = LocalizedContent("什么是DevOps？", listOf("一款电子游戏", "一种结合开发与IT运维的方法", "一种服务器类型", "一种编程语言"), "科技", "DevOps是一种整合开发与运维团队的方法论，旨在改善协作并自动化软件交付流程。"),
            es = LocalizedContent("¿Qué es DevOps?", listOf("Un videojuego", "Un enfoque que combina desarrollo y operaciones de TI", "Un tipo de servidor", "Un lenguaje de programación"), "Tecnología", "DevOps es una metodología que integra los equipos de desarrollo y operaciones para mejorar la colaboración y automatizar los procesos de entrega de software.")
        ),
        BilingualQuestion(
            id = 50582, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le fondateur de Twitter?", listOf("Mark Zuckerberg", "Jack Dorsey", "Steve Jobs", "Evan Williams"), "Tech", "Jack Dorsey a cofondé Twitter en 2006, en concevant l'idée d'une plateforme de microblogging limitée à 140 caractères."),
            en = LocalizedContent("Who is the founder of Twitter?", listOf("Mark Zuckerberg", "Jack Dorsey", "Steve Jobs", "Evan Williams"), "Technology", "Jack Dorsey co-founded Twitter in 2006, conceiving the idea of a microblogging platform limited to 140 characters."),
            zh = LocalizedContent("Twitter的创始人是谁？", listOf("马克·扎克伯格", "杰克·多西", "史蒂夫·乔布斯", "埃文·威廉姆斯"), "科技", "杰克·多西于2006年共同创立了Twitter，构思了一个限制在140字符内的微博客平台。"),
            es = LocalizedContent("¿Quién es el fundador de Twitter?", listOf("Mark Zuckerberg", "Jack Dorsey", "Steve Jobs", "Evan Williams"), "Tecnología", "Jack Dorsey cofundó Twitter en 2006, concibiendo la idea de una plataforma de microblogging limitada a 140 caracteres.")
        ),
        BilingualQuestion(
            id = 50583, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le DOM?", listOf("Document Object Model", "Digital Operating Module", "Dynamic Object Management", "Data Object Method"), "Tech", "Le DOM est une interface de programmation qui représente la structure d'un document HTML ou XML sous forme d'arbre d'objets, permettant aux scripts de modifier dynamiquement le contenu, la structure et le style d'une page web."),
            en = LocalizedContent("What is the DOM?", listOf("Document Object Model", "Digital Operating Module", "Dynamic Object Management", "Data Object Method"), "Technology", "The DOM is a programming interface that represents the structure of an HTML or XML document as a tree of objects, allowing scripts to dynamically modify the content, structure, and style of a web page."),
            zh = LocalizedContent("什么是DOM？", listOf("文档对象模型", "数字操作模块", "动态对象管理", "数据对象方法"), "科技", "DOM是一种编程接口，将HTML或XML文档的结构表示为对象树，允许脚本动态修改网页的内容、结构和样式。"),
            es = LocalizedContent("¿Qué es el DOM?", listOf("Modelo de Objetos del Documento", "Módulo Operativo Digital", "Gestión Dinámica de Objetos", "Método de Objetos de Datos"), "Tecnología", "El DOM es una interfaz de programación que representa la estructura de un documento HTML o XML como un árbol de objetos, permitiendo a los scripts modificar dinámicamente el contenido, la estructura y el estilo de una página web.")
        ),
        BilingualQuestion(
            id = 50584, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le nombre maximum de connexions TCP simultanées?", listOf("256", "1024", "65536", "1000000"), "Tech", "Le nombre maximum de connexions TCP simultanées est limité par le nombre de ports disponibles (16 bits), soit 65536 (de 0 à 65535). Cette limite théorique vient de la taille du champ de port source dans l'en-tête TCP."),
            en = LocalizedContent("What is the maximum number of simultaneous TCP connections?", listOf("256", "1024", "65536", "1000000"), "Technology", "The maximum number of simultaneous TCP connections is limited by the number of available ports (16 bits), which is 65536 (from 0 to 65535). This theoretical limit comes from the size of the source port field in the TCP header."),
            zh = LocalizedContent("同时TCP连接的最大数量是多少？", listOf("256", "1024", "65536", "1000000"), "科技", "同时TCP连接的最大数量受可用端口数（16位）限制，即65536（从0到65535）。这一理论限制源于TCP头部中源端口字段的大小。"),
            es = LocalizedContent("¿Cuál es el número máximo de conexiones TCP simultáneas?", listOf("256", "1024", "65536", "1000000"), "Tecnología", "El número máximo de conexiones TCP simultáneas está limitado por el número de puertos disponibles (16 bits), que es 65536 (de 0 a 65535). Este límite teórico proviene del tamaño del campo de puerto de origen en el encabezado TCP.")
        ),
        BilingualQuestion(
            id = 50585, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le SaaS?", listOf("Software as a Service", "System as a Service", "Storage as a Service", "Server as a Service"), "Tech", "Le SaaS désigne un modèle de distribution de logiciels où l'accès se fait via internet, sans installation locale. L'utilisateur paie un abonnement pour utiliser l'application hébergée par le fournisseur."),
            en = LocalizedContent("What is SaaS?", listOf("Software as a Service", "System as a Service", "Storage as a Service", "Server as a Service"), "Technology", "SaaS refers to a software distribution model where access is via the internet, without local installation. The user pays a subscription to use the application hosted by the provider."),
            zh = LocalizedContent("什么是SaaS？", listOf("软件即服务", "系统即服务", "存储即服务", "服务器即服务"), "科技", "SaaS是一种软件分发模式，通过互联网访问，无需本地安装。用户支付订阅费用以使用提供商托管的应用程序。"),
            es = LocalizedContent("¿Qué es SaaS?", listOf("Software como Servicio", "Sistema como Servicio", "Almacenamiento como Servicio", "Servidor como Servicio"), "Tecnología", "SaaS se refiere a un modelo de distribución de software donde el acceso se realiza a través de internet, sin instalación local. El usuario paga una suscripción para usar la aplicación alojada por el proveedor.")
        ),
        BilingualQuestion(
            id = 50586, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel interpreteur de commandes est le shell par defaut sur la plupart des systemes Linux ?", listOf("Python", "Bash", "C++", "Java"), "Tech", "Bash (Bourne Again SHell) est le shell par défaut sur la plupart des distributions Linux car il succède au shell Bourne original tout en intégrant des fonctionnalités avancées."),
            en = LocalizedContent("Which command interpreter is the default shell on most Linux systems?", listOf("Python", "Bash", "C++", "Java"), "Technology", "Bash (Bourne Again SHell) is the default shell on most Linux distributions because it succeeds the original Bourne shell while incorporating advanced features."),
            zh = LocalizedContent("大多数Linux系统上的默认命令解释器是什么？", listOf("Python", "Bash", "C++", "Java"), "科技", "Bash（Bourne Again SHell）是大多数Linux发行版的默认shell，因为它继承了原始Bourne shell并集成了高级功能。"),
            es = LocalizedContent("¿Qué intérprete de comandos es el shell predeterminado en la mayoría de los sistemas Linux?", listOf("Python", "Bash", "C++", "Java"), "Tecnología", "Bash (Bourne Again SHell) es el shell predeterminado en la mayoría de las distribuciones de Linux porque sucede al shell Bourne original e incorpora funciones avanzadas.")
        ),
        BilingualQuestion(
            id = 50587, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que Docker?", listOf("Un type de serveur", "Une plateforme de conteneurisation logicielle", "Un langage de programmation", "Un protocole réseau"), "Tech", "Docker est un outil qui permet d'empaqueter des applications et leurs dépendances dans des conteneurs légers et portables, simplifiant le déploiement sur différents environnements."),
            en = LocalizedContent("What is Docker?", listOf("A type of server", "A software containerization platform", "A programming language", "A network protocol"), "Technology", "Docker is a tool that packages applications and their dependencies into lightweight, portable containers, simplifying deployment across different environments."),
            zh = LocalizedContent("Docker是什么？", listOf("一种服务器类型", "一个软件容器化平台", "一种编程语言", "一种网络协议"), "科技", "Docker是一种将应用程序及其依赖项打包到轻量级、可移植容器中的工具，简化了在不同环境中的部署。"),
            es = LocalizedContent("¿Qué es Docker?", listOf("Un tipo de servidor", "Una plataforma de contenedorización de software", "Un lenguaje de programación", "Un protocolo de red"), "Tecnología", "Docker es una herramienta que empaqueta aplicaciones y sus dependencias en contenedores ligeros y portátiles, simplificando el despliegue en diferentes entornos.")
        ),
        BilingualQuestion(
            id = 50588, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le système de gestion de versions le plus populaire?", listOf("Subversion", "Mercurial", "Git", "Perforce"), "Tech", "Git est devenu le standard de l'industrie pour le contrôle de versions, créé par Linus Torvalds en 2005 pour le développement du noyau Linux."),
            en = LocalizedContent("What is the most popular version control system?", listOf("Subversion", "Mercurial", "Git", "Perforce"), "Technology", "Git has become the industry standard for version control, created by Linus Torvalds in 2005 for Linux kernel development."),
            zh = LocalizedContent("最流行的版本控制系统是什么？", listOf("Subversion", "Mercurial", "Git", "Perforce"), "科技", "Git已成为版本控制的行业标准，由Linus Torvalds于2005年为Linux内核开发而创建。"),
            es = LocalizedContent("¿Cuál es el sistema de control de versiones más popular?", listOf("Subversion", "Mercurial", "Git", "Perforce"), "Tecnología", "Git se ha convertido en el estándar de la industria para el control de versiones, creado por Linus Torvalds en 2005 para el desarrollo del kernel de Linux.")
        ),
        BilingualQuestion(
            id = 50589, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le phishing?", listOf("Un poisson d'eau douce", "Une tentative de fraude pour obtenir des informations sensibles", "Un type de serveur", "Un langage de programmation"), "Tech", "Le phishing est une technique d'ingénierie sociale où des fraudeurs envoient des emails ou messages imitant des entités légitimes pour voler mots de passe ou données bancaires."),
            en = LocalizedContent("What is phishing?", listOf("A freshwater fish", "A fraud attempt to obtain sensitive information", "A type of server", "A programming language"), "Technology", "Phishing is a social engineering technique where fraudsters send emails or messages imitating legitimate entities to steal passwords or banking data."),
            zh = LocalizedContent("什么是网络钓鱼？", listOf("一种淡水鱼", "一种获取敏感信息的欺诈尝试", "一种服务器类型", "一种编程语言"), "科技", "网络钓鱼是一种社会工程学技术，欺诈者发送模仿合法实体的电子邮件或消息，以窃取密码或银行数据。"),
            es = LocalizedContent("¿Qué es el phishing?", listOf("Un pez de agua dulce", "Un intento de fraude para obtener información sensible", "Un tipo de servidor", "Un lenguaje de programación"), "Tecnología", "El phishing es una técnica de ingeniería social donde los estafadores envían correos electrónicos o mensajes imitando entidades legítimas para robar contraseñas o datos bancarios.")
        ),
        BilingualQuestion(
            id = 50590, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nombre de processeurs logiques dans un i9 standard?", listOf("4", "8", "12", "16"), "Tech", "Les processeurs Intel Core i9 standard de génération récente (comme la 12e et 13e) intègrent 8 cœurs physiques et 16 threads grâce à l'Hyper-Threading, ce qui donne 16 processeurs logiques."),
            en = LocalizedContent("What is the number of logical processors in a standard i9?", listOf("4", "8", "12", "16"), "Technology", "Standard Intel Core i9 processors of recent generations (like 12th and 13th) have 8 physical cores and 16 threads via Hyper-Threading, resulting in 16 logical processors."),
            zh = LocalizedContent("标准i9处理器有多少个逻辑处理器？", listOf("4", "8", "12", "16"), "科技", "最新几代（如第12代和第13代）的标准Intel Core i9处理器具有8个物理核心和通过超线程技术实现的16个线程，因此有16个逻辑处理器。"),
            es = LocalizedContent("¿Cuál es el número de procesadores lógicos en un i9 estándar?", listOf("4", "8", "12", "16"), "Tecnología", "Los procesadores Intel Core i9 estándar de generaciones recientes (como la 12.ª y 13.ª) tienen 8 núcleos físicos y 16 hilos gracias a Hyper-Threading, lo que da 16 procesadores lógicos.")
        ),
        BilingualQuestion(
            id = 50591, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que OpenGL?", listOf("Un langage de programmation", "Une API pour la programmation graphique 3D", "Un système d'exploitation", "Un protocole réseau"), "Tech", "OpenGL est une interface de programmation (API) standardisée et multiplateforme, utilisée pour le rendu de graphismes 2D et 3D, notamment dans les jeux vidéo et les applications de visualisation."),
            en = LocalizedContent("What is OpenGL?", listOf("A programming language", "An API for 3D graphics programming", "An operating system", "A network protocol"), "Technology", "OpenGL is a standardized, cross-platform API used for rendering 2D and 3D graphics, especially in video games and visualization applications."),
            zh = LocalizedContent("OpenGL是什么？", listOf("一种编程语言", "一个用于3D图形编程的API", "一个操作系统", "一种网络协议"), "科技", "OpenGL是一个标准化、跨平台的API，用于渲染2D和3D图形，特别是在视频游戏和可视化应用中。"),
            es = LocalizedContent("¿Qué es OpenGL?", listOf("Un lenguaje de programación", "Una API para programación gráfica 3D", "Un sistema operativo", "Un protocolo de red"), "Tecnología", "OpenGL es una API estandarizada y multiplataforma utilizada para el renderizado de gráficos 2D y 3D, especialmente en videojuegos y aplicaciones de visualización.")
        ),
        BilingualQuestion(
            id = 50592, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le créateur de Slack?", listOf("Bill Gates", "Stewart Butterfield", "Steve Jobs", "Mark Zuckerberg"), "Tech", "Stewart Butterfield a cofondé Slack en 2013, après avoir déjà créé Flickr, un site de partage de photos."),
            en = LocalizedContent("Who is the creator of Slack?", listOf("Bill Gates", "Stewart Butterfield", "Steve Jobs", "Mark Zuckerberg"), "Technology", "Stewart Butterfield co-founded Slack in 2013, after previously creating Flickr, a photo-sharing site."),
            zh = LocalizedContent("Slack的创始人是谁？", listOf("比尔·盖茨", "斯图尔特·巴特菲尔德", "史蒂夫·乔布斯", "马克·扎克伯格"), "科技", "斯图尔特·巴特菲尔德于2013年共同创立了Slack，此前他曾创建了照片分享网站Flickr。"),
            es = LocalizedContent("¿Quién es el creador de Slack?", listOf("Bill Gates", "Stewart Butterfield", "Steve Jobs", "Mark Zuckerberg"), "Tecnología", "Stewart Butterfield cofundó Slack en 2013, después de haber creado Flickr, un sitio de intercambio de fotos.")
        ),
        BilingualQuestion(
            id = 50593, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la concurrence en programmation?", listOf("Un jeu vidéo", "L'exécution simultanée de plusieurs tâches", "Un type de serveur", "Un langage de programmation"), "Tech", "En programmation, la concurrence désigne la capacité d'un système à exécuter plusieurs tâches de manière entrelacée, donnant l'illusion d'une simultanéité sur un seul cœur."),
            en = LocalizedContent("What is concurrency in programming?", listOf("A video game", "The simultaneous execution of multiple tasks", "A type of server", "A programming language"), "Technology", "In programming, concurrency refers to a system's ability to execute multiple tasks in an interleaved manner, giving the illusion of simultaneity on a single core."),
            zh = LocalizedContent("编程中的并发是什么？", listOf("一个电子游戏", "多个任务的同时执行", "一种服务器类型", "一种编程语言"), "科技", "在编程中，并发是指系统以交错方式执行多个任务的能力，在单核上产生同时执行的错觉。"),
            es = LocalizedContent("¿Qué es la concurrencia en programación?", listOf("Un videojuego", "La ejecución simultánea de múltiples tareas", "Un tipo de servidor", "Un lenguaje de programación"), "Tecnología", "En programación, la concurrencia se refiere a la capacidad de un sistema para ejecutar múltiples tareas de manera entrelazada, dando la ilusión de simultaneidad en un solo núcleo.")
        ),
        BilingualQuestion(
            id = 50594, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le protocole de voix sur IP?", listOf("VoIP", "SIP", "RTP", "All of the above"), "Tech", "Le protocole de voix sur IP (VoIP) regroupe plusieurs protocoles comme SIP, H.323 ou RTP, qui assurent la transmission de la voix sur Internet."),
            en = LocalizedContent("What is the Voice over IP protocol?", listOf("VoIP", "SIP", "RTP", "All of the above"), "Technology", "Voice over IP (VoIP) encompasses several protocols like SIP, H.323, or RTP, which ensure voice transmission over the Internet."),
            zh = LocalizedContent("什么是IP语音协议？", listOf("VoIP", "SIP", "RTP", "以上都是"), "科技", "IP语音（VoIP）包括多种协议，如SIP、H.323或RTP，它们确保语音在互联网上的传输。"),
            es = LocalizedContent("¿Cuál es el protocolo de Voz sobre IP?", listOf("VoIP", "SIP", "RTP", "Todas las anteriores"), "Tecnología", "La Voz sobre IP (VoIP) engloba varios protocolos como SIP, H.323 o RTP, que aseguran la transmisión de voz a través de Internet.")
        ),
        BilingualQuestion(
            id = 50595, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que RESTful?", listOf("Un type de serveur", "Un style architectural pour les API web", "Un langage de programmation", "Un protocole réseau"), "Tech", "RESTful est un style d'architecture logicielle qui définit des contraintes pour créer des API web légères et évolutives, en utilisant les verbes HTTP standards comme GET, POST, PUT et DELETE."),
            en = LocalizedContent("What is RESTful?", listOf("A type of server", "An architectural style for web APIs", "A programming language", "A network protocol"), "Technology", "RESTful is a software architectural style that defines constraints for creating lightweight, scalable web APIs, using standard HTTP verbs like GET, POST, PUT, and DELETE."),
            zh = LocalizedContent("什么是RESTful？", listOf("一种服务器类型", "一种用于Web API的架构风格", "一种编程语言", "一种网络协议"), "科技", "RESTful是一种软件架构风格，它定义了创建轻量级、可扩展的Web API的约束，使用标准的HTTP动词如GET、POST、PUT和DELETE。"),
            es = LocalizedContent("¿Qué es RESTful?", listOf("Un tipo de servidor", "Un estilo arquitectónico para APIs web", "Un lenguaje de programación", "Un protocolo de red"), "Tecnología", "RESTful es un estilo arquitectónico de software que define restricciones para crear APIs web ligeras y escalables, utilizando verbos HTTP estándar como GET, POST, PUT y DELETE.")
        ),
        BilingualQuestion(
            id = 50596, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de Redis?", listOf("Bill Gates", "Salvatore Sanfilippo", "Steve Jobs", "Mark Zuckerberg"), "Tech", "Salvatore Sanfilippo, connu sous le pseudonyme antirez, a créé Redis en 2009 pour améliorer les performances de son startup de logs en temps réel."),
            en = LocalizedContent("Who created Redis?", listOf("Bill Gates", "Salvatore Sanfilippo", "Steve Jobs", "Mark Zuckerberg"), "Technology", "Salvatore Sanfilippo, known by the pseudonym antirez, created Redis in 2009 to improve the performance of his real-time log startup."),
            zh = LocalizedContent("Redis 的创建者是谁？", listOf("比尔·盖茨", "萨尔瓦多·圣菲利波", "史蒂夫·乔布斯", "马克·扎克伯格"), "科技", "萨尔瓦多·圣菲利波（化名 antirez）于 2009 年创建了 Redis，旨在提升其实时日志初创公司的性能。"),
            es = LocalizedContent("¿Quién creó Redis?", listOf("Bill Gates", "Salvatore Sanfilippo", "Steve Jobs", "Mark Zuckerberg"), "Tecnología", "Salvatore Sanfilippo, conocido por el seudónimo antirez, creó Redis en 2009 para mejorar el rendimiento de su startup de registros en tiempo real.")
        ),
        BilingualQuestion(
            id = 50597, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'est-ce que SOLID dans la programmation?", listOf("Un type de serveur", "Un ensemble de principes de conception logicielle", "Un langage de programmation", "Un protocole réseau"), "Tech", "SOLID est un acronyme pour cinq principes de conception orientée objet (responsabilité unique, ouvert/fermé, substitution de Liskov, ségrégation d'interfaces, inversion de dépendances) visant à rendre le code plus maintenable et évolutif."),
            en = LocalizedContent("What is SOLID in programming?", listOf("A type of server", "A set of software design principles", "A programming language", "A network protocol"), "Technology", "SOLID is an acronym for five object-oriented design principles (Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion) aimed at making code more maintainable and scalable."),
            zh = LocalizedContent("编程中的 SOLID 是什么？", listOf("一种服务器类型", "一套软件设计原则", "一种编程语言", "一种网络协议"), "科技", "SOLID 是五个面向对象设计原则的首字母缩写（单一职责、开闭、里氏替换、接口隔离、依赖反转），旨在使代码更易于维护和扩展。"),
            es = LocalizedContent("¿Qué es SOLID en programación?", listOf("Un tipo de servidor", "Un conjunto de principios de diseño de software", "Un lenguaje de programación", "Un protocolo de red"), "Tecnología", "SOLID es un acrónimo de cinco principios de diseño orientado a objetos (Responsabilidad Única, Abierto/Cerrado, Sustitución de Liskov, Segregación de Interfaces, Inversión de Dependencias) que buscan hacer el código más mantenible y escalable.")
        ),
        BilingualQuestion(
            id = 50598, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nombre de noyaux dans un processeur Ryzen 9?", listOf("8", "12", "16", "32"), "Tech", "Le Ryzen 9 est le haut de gamme grand public d'AMD, et son modèle phare, le 7950X, embarque 16 cœurs physiques pour des performances maximales en calcul lourd."),
            en = LocalizedContent("How many cores does a Ryzen 9 processor have?", listOf("8", "12", "16", "32"), "Technology", "The Ryzen 9 is AMD's high-end consumer line, and its flagship model, the 7950X, features 16 physical cores for maximum performance in heavy computing tasks."),
            zh = LocalizedContent("Ryzen 9 处理器有多少个核心？", listOf("8", "12", "16", "32"), "科技", "Ryzen 9 是 AMD 的高端消费级产品线，其旗舰型号 7950X 拥有 16 个物理核心，可在繁重计算任务中提供最大性能。"),
            es = LocalizedContent("¿Cuántos núcleos tiene un procesador Ryzen 9?", listOf("8", "12", "16", "32"), "Tecnología", "El Ryzen 9 es la línea de gama alta para consumidores de AMD, y su modelo insignia, el 7950X, cuenta con 16 núcleos físicos para un rendimiento máximo en tareas de computación pesada.")
        ),
        BilingualQuestion(
            id = 50599, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'est-ce que WebAssembly?", listOf("Un type de serveur", "Un format binaire pour l'exécution de code dans les navigateurs", "Un langage de programmation", "Un protocole réseau"), "Tech", "WebAssembly est un format d'instructions binaires conçu pour être exécuté à grande vitesse dans les navigateurs web, permettant d'exécuter du code compilé depuis des langages comme C, C++ ou Rust."),
            en = LocalizedContent("What is WebAssembly?", listOf("A type of server", "A binary format for executing code in browsers", "A programming language", "A network protocol"), "Technology", "WebAssembly is a binary instruction format designed for high-speed execution in web browsers, allowing code compiled from languages like C, C++, or Rust to run."),
            zh = LocalizedContent("什么是 WebAssembly？", listOf("一种服务器类型", "一种在浏览器中执行代码的二进制格式", "一种编程语言", "一种网络协议"), "科技", "WebAssembly 是一种二进制指令格式，旨在网络浏览器中高速执行，允许运行从 C、C++ 或 Rust 等语言编译的代码。"),
            es = LocalizedContent("¿Qué es WebAssembly?", listOf("Un tipo de servidor", "Un formato binario para ejecutar código en navegadores", "Un lenguaje de programación", "Un protocolo de red"), "Tecnología", "WebAssembly es un formato de instrucciones binarias diseñado para ejecutarse a alta velocidad en navegadores web, permitiendo ejecutar código compilado desde lenguajes como C, C++ o Rust.")
        ),
        BilingualQuestion(
            id = 50600, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le fondateur de Nvidia?", listOf("Bill Gates", "Jensen Huang", "Steve Jobs", "Mark Zuckerberg"), "Tech", "Jensen Huang a cofondé Nvidia en 1993 avec Chris Malachowsky et Curtis Priem, et en est le PDG depuis sa création."),
            en = LocalizedContent("Who founded Nvidia?", listOf("Bill Gates", "Jensen Huang", "Steve Jobs", "Mark Zuckerberg"), "Technology", "Jensen Huang co-founded Nvidia in 1993 with Chris Malachowsky and Curtis Priem, and has been its CEO since its inception."),
            zh = LocalizedContent("英伟达的创始人是谁？", listOf("比尔·盖茨", "黄仁勋", "史蒂夫·乔布斯", "马克·扎克伯格"), "科技", "黄仁勋于 1993 年与克里斯·马拉科夫斯基和柯蒂斯·普里姆共同创立了英伟达，并自成立以来一直担任首席执行官。"),
            es = LocalizedContent("¿Quién fundó Nvidia?", listOf("Bill Gates", "Jensen Huang", "Steve Jobs", "Mark Zuckerberg"), "Tecnología", "Jensen Huang cofundó Nvidia en 1993 con Chris Malachowsky y Curtis Priem, y ha sido su CEO desde su creación.")
        ),
        BilingualQuestion(
            id = 50601, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'animal terrestre le plus rapide?", listOf("Girafe", "Antilope", "Guépard", "Cheval"), "Nature", "Le guépard peut atteindre 110 km/h en pointe, grâce à sa colonne vertébrale flexible et ses griffes non rétractiles qui lui offrent une adhérence maximale."),
            en = LocalizedContent("What is the fastest land animal?", listOf("Giraffe", "Antelope", "Cheetah", "Horse"), "Nature", "The cheetah can reach speeds of up to 110 km/h, thanks to its flexible spine and non-retractable claws that provide maximum traction."),
            zh = LocalizedContent("最快的陆地动物是什么？", listOf("长颈鹿", "羚羊", "猎豹", "马"), "自然", "猎豹最高时速可达 110 公里，得益于其灵活的脊柱和不可伸缩的爪子，提供了最大的抓地力。"),
            es = LocalizedContent("¿Cuál es el animal terrestre más rápido?", listOf("Jirafa", "Antílope", "Guepardo", "Caballo"), "Naturaleza", "El guepardo puede alcanzar velocidades de hasta 110 km/h, gracias a su columna vertebral flexible y sus garras no retráctiles que le proporcionan máxima tracción.")
        ),
        BilingualQuestion(
            id = 50602, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de pattes a une araignée?", listOf("6", "8", "10", "4"), "Nature", "Les araignées appartiennent à la classe des arachnides, qui se distinguent des insectes par huit pattes, contre six pour ces derniers."),
            en = LocalizedContent("How many legs does a spider have?", listOf("6", "8", "10", "4"), "Nature", "Spiders belong to the class Arachnida, which are distinguished from insects by having eight legs, as opposed to six."),
            zh = LocalizedContent("蜘蛛有多少条腿？", listOf("6", "8", "10", "4"), "自然", "蜘蛛属于蛛形纲，与昆虫的区别在于有八条腿，而昆虫有六条。"),
            es = LocalizedContent("¿Cuántas patas tiene una araña?", listOf("6", "8", "10", "4"), "Naturaleza", "Las arañas pertenecen a la clase Arácnida, que se distinguen de los insectos por tener ocho patas, frente a seis de estos últimos.")
        ),
        BilingualQuestion(
            id = 50603, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand océan du monde?", listOf("Atlantique", "Indien", "Arctique", "Pacifique"), "Nature", "L'océan Pacifique est le plus vaste et le plus profond des océans, couvrant environ un tiers de la surface terrestre."),
            en = LocalizedContent("What is the largest ocean in the world?", listOf("Atlantic", "Indian", "Arctic", "Pacific"), "Nature", "The Pacific Ocean is the largest and deepest ocean, covering about one-third of the Earth's surface."),
            zh = LocalizedContent("世界上最大的海洋是什么？", listOf("大西洋", "印度洋", "北冰洋", "太平洋"), "自然", "太平洋是最大、最深的海洋，覆盖了地球表面约三分之一。"),
            es = LocalizedContent("¿Cuál es el océano más grande del mundo?", listOf("Atlántico", "Índico", "Ártico", "Pacífico"), "Naturaleza", "El océano Pacífico es el más grande y profundo, cubriendo aproximadamente un tercio de la superficie terrestre.")
        ),
        BilingualQuestion(
            id = 50604, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'animal qui vit le plus longtemps?", listOf("Éléphant", "Baleine", "Tortue", "Perroquet"), "Nature", "Certaines tortues géantes, comme celle des Galápagos, peuvent vivre plus de 150 ans, ce qui en fait les vertébrés terrestres les plus longévifs."),
            en = LocalizedContent("Which animal lives the longest?", listOf("Elephant", "Whale", "Tortoise", "Parrot"), "Nature", "Some giant tortoises, like those from the Galápagos, can live over 150 years, making them the longest-living terrestrial vertebrates."),
            zh = LocalizedContent("哪种动物寿命最长？", listOf("大象", "鲸鱼", "乌龟", "鹦鹉"), "自然", "一些巨型陆龟，如加拉帕戈斯陆龟，可以活到 150 岁以上，是寿命最长的陆生脊椎动物。"),
            es = LocalizedContent("¿Qué animal vive más tiempo?", listOf("Elefante", "Ballena", "Tortuga", "Loro"), "Naturaleza", "Algunas tortugas gigantes, como las de Galápagos, pueden vivir más de 150 años, lo que las convierte en los vertebrados terrestres más longevos.")
        ),
        BilingualQuestion(
            id = 50605, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de pattes a un insecte?", listOf("4", "6", "8", "10"), "Nature", "Les insectes appartiennent à la classe des hexapodes, ce qui signifie qu'ils possèdent six pattes, réparties en trois paires sur le thorax."),
            en = LocalizedContent("How many legs does an insect have?", listOf("4", "6", "8", "10"), "Nature", "Insects belong to the class Hexapoda, meaning they have six legs, arranged in three pairs on the thorax."),
            zh = LocalizedContent("昆虫有多少条腿？", listOf("4", "6", "8", "10"), "自然", "昆虫属于六足纲，意味着它们有六条腿，在胸部排列成三对。"),
            es = LocalizedContent("¿Cuántas patas tiene un insecto?", listOf("4", "6", "8", "10"), "Naturaleza", "Los insectos pertenecen a la clase Hexapoda, lo que significa que tienen seis patas, dispuestas en tres pares en el tórax.")
        ),
        BilingualQuestion(
            id = 50607, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'animal marin le plus grand?", listOf("Requin blanc", "Baleine bleue", "Poulpe géant", "Rorqual"), "Nature", "La baleine bleue est le plus grand animal marin, pouvant atteindre 30 mètres de long et peser jusqu'à 200 tonnes."),
            en = LocalizedContent("What is the largest marine animal?", listOf("Great white shark", "Blue whale", "Giant octopus", "Rorqual"), "Nature", "The blue whale is the largest marine animal, reaching up to 30 meters in length and weighing up to 200 tons."),
            zh = LocalizedContent("最大的海洋动物是什么？", listOf("大白鲨", "蓝鲸", "巨型章鱼", "长须鲸"), "自然", "蓝鲸是最大的海洋动物，体长可达30米，体重可达200吨。"),
            es = LocalizedContent("¿Cuál es el animal marino más grande?", listOf("Tiburón blanco", "Ballena azul", "Pulpo gigante", "Rorcual"), "Naturaleza", "La ballena azul es el animal marino más grande, pudiendo alcanzar 30 metros de largo y pesar hasta 200 toneladas.")
        ),
        BilingualQuestion(
            id = 50608, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de continents existe-t-il?", listOf("5", "6", "7", "8"), "Nature", "Le modèle des sept continents (Afrique, Amérique du Nord, Amérique du Sud, Antarctique, Asie, Europe, Océanie) est le plus couramment enseigné dans les pays francophones."),
            en = LocalizedContent("How many continents are there?", listOf("5", "6", "7", "8"), "Nature", "The seven-continent model (Africa, North America, South America, Antarctica, Asia, Europe, Oceania) is most commonly taught in French-speaking countries."),
            zh = LocalizedContent("世界上有多少个大洲？", listOf("5", "6", "7", "8"), "自然", "七大洲模型（非洲、北美洲、南美洲、南极洲、亚洲、欧洲、大洋洲）在法语国家最为常见。"),
            es = LocalizedContent("¿Cuántos continentes existen?", listOf("5", "6", "7", "8"), "Naturaleza", "El modelo de siete continentes (África, América del Norte, América del Sur, Antártida, Asia, Europa, Oceanía) es el más enseñado en los países francófonos.")
        ),
        BilingualQuestion(
            id = 50609, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le gaz principal de l'atmosphère terrestre?", listOf("Oxygène", "Azote", "Argon", "Dioxyde de carbone"), "Nature", "L'azote constitue environ 78 % de l'atmosphère terrestre, bien devant l'oxygène (21 %) et les autres gaz."),
            en = LocalizedContent("What is the main gas in Earth's atmosphere?", listOf("Oxygen", "Nitrogen", "Argon", "Carbon dioxide"), "Nature", "Nitrogen makes up about 78% of Earth's atmosphere, far ahead of oxygen (21%) and other gases."),
            zh = LocalizedContent("地球大气中的主要气体是什么？", listOf("氧气", "氮气", "氩气", "二氧化碳"), "自然", "氮气约占地球大气的78%，远高于氧气（21%）和其他气体。"),
            es = LocalizedContent("¿Cuál es el gas principal de la atmósfera terrestre?", listOf("Oxígeno", "Nitrógeno", "Argón", "Dióxido de carbono"), "Naturaleza", "El nitrógeno constituye aproximadamente el 78% de la atmósfera terrestre, muy por delante del oxígeno (21%) y otros gases.")
        ),
        BilingualQuestion(
            id = 50610, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'arbre le plus haut du monde?", listOf("Chêne", "Séquoia", "Sapin", "Mélèze"), "Nature", "Le séquoia géant de Californie, comme l'Hypérion, peut dépasser 115 mètres de hauteur, ce qui en fait l'espèce d'arbre la plus haute jamais mesurée."),
            en = LocalizedContent("What is the tallest tree in the world?", listOf("Oak", "Sequoia", "Fir", "Larch"), "Nature", "The giant sequoia of California, such as Hyperion, can exceed 115 meters in height, making it the tallest tree species ever measured."),
            zh = LocalizedContent("世界上最高的树是什么？", listOf("橡树", "红杉", "冷杉", "落叶松"), "自然", "加利福尼亚的巨型红杉，如亥伯龙树，高度可超过115米，是有史以来测量到的最高的树种。"),
            es = LocalizedContent("¿Cuál es el árbol más alto del mundo?", listOf("Roble", "Secuoya", "Abeto", "Alerce"), "Naturaleza", "La secuoya gigante de California, como Hyperion, puede superar los 115 metros de altura, lo que la convierte en la especie de árbol más alta jamás medida.")
        ),
        BilingualQuestion(
            id = 50613, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'une photosynthèse?", listOf("Un type de respiration", "Un processus de transformation de la lumière en énergie par les plantes", "Un type de mouvement", "Un processus digestif"), "Nature", "La photosynthèse permet aux plantes de convertir l'énergie lumineuse du soleil en énergie chimique, utilisée pour leur croissance, via la chlorophylle."),
            en = LocalizedContent("What is photosynthesis?", listOf("A type of respiration", "A process of converting light into energy by plants", "A type of movement", "A digestive process"), "Nature", "Photosynthesis allows plants to convert light energy from the sun into chemical energy, used for their growth, via chlorophyll."),
            zh = LocalizedContent("什么是光合作用？", listOf("一种呼吸类型", "植物将光转化为能量的过程", "一种运动类型", "一种消化过程"), "自然", "光合作用使植物能够通过叶绿素将太阳的光能转化为化学能，用于自身的生长。"),
            es = LocalizedContent("¿Qué es la fotosíntesis?", listOf("Un tipo de respiración", "Un proceso de conversión de luz en energía por las plantas", "Un tipo de movimiento", "Un proceso digestivo"), "Naturaleza", "La fotosíntesis permite a las plantas convertir la energía lumínica del sol en energía química, utilizada para su crecimiento, mediante la clorofila.")
        ),
        BilingualQuestion(
            id = 50614, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand récif de corail du monde?", listOf("Récif de Ningaloo", "Récif de Belize", "Grande Barrière de Corail", "Récif d'Egypte"), "Nature", "La Grande Barrière de Corail, située au large de l'Australie, s'étend sur plus de 2 300 kilomètres et est visible depuis l'espace."),
            en = LocalizedContent("What is the largest coral reef in the world?", listOf("Ningaloo Reef", "Belize Barrier Reef", "Great Barrier Reef", "Egyptian Reef"), "Nature", "The Great Barrier Reef, located off the coast of Australia, stretches over 2,300 kilometers and is visible from space."),
            zh = LocalizedContent("世界上最大的珊瑚礁是什么？", listOf("宁加洛礁", "伯利兹堡礁", "大堡礁", "埃及礁"), "自然", "大堡礁位于澳大利亚海岸外，绵延超过2300公里，从太空中可见。"),
            es = LocalizedContent("¿Cuál es el arrecife de coral más grande del mundo?", listOf("Arrecife de Ningaloo", "Barrera de Coral de Belice", "Gran Barrera de Coral", "Arrecife de Egipto"), "Naturaleza", "La Gran Barrera de Coral, situada frente a la costa de Australia, se extiende por más de 2.300 kilómetros y es visible desde el espacio.")
        ),
        BilingualQuestion(
            id = 50615, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien d'espèces d'oiseaux existe-t-il sur Terre?", listOf("500", "1000", "5000", "10000"), "Nature", "On estime qu'il existe environ 10 000 espèces d'oiseaux dans le monde, et non 5 000."),
            en = LocalizedContent("How many species of birds are there on Earth?", listOf("500", "1000", "5000", "10000"), "Nature", "It is estimated that there are about 10,000 species of birds in the world, not 5,000."),
            zh = LocalizedContent("地球上有多少种鸟类？", listOf("500", "1000", "5000", "10000"), "自然", "据估计，世界上大约有10000种鸟类，而不是5000种。"),
            es = LocalizedContent("¿Cuántas especies de aves existen en la Tierra?", listOf("500", "1000", "5000", "10000"), "Naturaleza", "Se estima que existen alrededor de 10.000 especies de aves en el mundo, no 5.000.")
        ),
        BilingualQuestion(
            id = 50616, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand lac du monde?", listOf("Lac Baïkal", "Lac Tanganyika", "Mer Caspienne", "Lac Victoria"), "Nature", "La mer Caspienne est considérée comme le plus grand lac du monde en superficie, bien qu'elle soit salée et souvent appelée mer en raison de sa taille. Elle s'étend sur environ 371 000 km²."),
            en = LocalizedContent("What is the largest lake in the world?", listOf("Lake Baikal", "Lake Tanganyika", "Caspian Sea", "Lake Victoria"), "Nature", "The Caspian Sea is considered the largest lake in the world by surface area, although it is salty and often called a sea due to its size. It covers about 371,000 km²."),
            zh = LocalizedContent("世界上最大的湖泊是什么？", listOf("贝加尔湖", "坦噶尼喀湖", "里海", "维多利亚湖"), "自然", "里海被认为是世界上面积最大的湖泊，尽管它是咸水湖，且因其大小常被称为海。其面积约为37.1万平方公里。"),
            es = LocalizedContent("¿Cuál es el lago más grande del mundo?", listOf("Lago Baikal", "Lago Tanganyika", "Mar Caspio", "Lago Victoria"), "Naturaleza", "El mar Caspio es considerado el lago más grande del mundo por superficie, aunque es salado y a menudo llamado mar debido a su tamaño. Se extiende sobre aproximadamente 371.000 km².")
        ),
        BilingualQuestion(
            id = 50617, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de pattes a un crabe?", listOf("6", "8", "10", "12"), "Nature", "Les crabes sont des crustacés décapodes, ce qui signifie qu'ils possèdent dix pattes au total. Cependant, la première paire est transformée en pinces, laissant huit pattes locomotrices."),
            en = LocalizedContent("How many legs does a crab have?", listOf("6", "8", "10", "12"), "Nature", "Crabs are decapod crustaceans, meaning they have ten legs in total. However, the first pair is modified into claws, leaving eight walking legs."),
            zh = LocalizedContent("螃蟹有多少条腿？", listOf("6", "8", "10", "12"), "自然", "螃蟹是十足目甲壳动物，总共有十条腿。但第一对腿特化为螯，剩下八条步足。"),
            es = LocalizedContent("¿Cuántas patas tiene un cangrejo?", listOf("6", "8", "10", "12"), "Naturaleza", "Los cangrejos son crustáceos decápodos, lo que significa que tienen diez patas en total. Sin embargo, el primer par está transformado en pinzas, dejando ocho patas locomotoras.")
        ),
        BilingualQuestion(
            id = 50618, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le mammifère marin le plus grand?", listOf("Requin blanc", "Baleine bleue", "Baleine grise", "Narval"), "Nature", "La baleine bleue est le plus grand mammifère marin, atteignant jusqu'à 30 mètres de long et pesant plus de 170 tonnes. Elle détient le record de l'animal le plus massif ayant jamais existé sur Terre."),
            en = LocalizedContent("What is the largest marine mammal?", listOf("Great white shark", "Blue whale", "Gray whale", "Narwhal"), "Nature", "The blue whale is the largest marine mammal, reaching up to 30 meters in length and weighing over 170 tons. It holds the record for the most massive animal ever to have existed on Earth."),
            zh = LocalizedContent("最大的海洋哺乳动物是什么？", listOf("大白鲨", "蓝鲸", "灰鲸", "独角鲸"), "自然", "蓝鲸是最大的海洋哺乳动物，体长可达30米，体重超过170吨。它保持着地球上存在过的最庞大动物的纪录。"),
            es = LocalizedContent("¿Cuál es el mamífero marino más grande?", listOf("Tiburón blanco", "Ballena azul", "Ballena gris", "Narval"), "Naturaleza", "La ballena azul es el mamífero marino más grande, alcanzando hasta 30 metros de largo y pesando más de 170 toneladas. Ostenta el récord del animal más masivo que jamás haya existido en la Tierra.")
        ),
        BilingualQuestion(
            id = 50619, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de dents a un crocodile?", listOf("60", "80", "100", "120"), "Nature", "Les crocodiles possèdent environ 100 dents, qui sont régulièrement remplacées tout au long de leur vie."),
            en = LocalizedContent("How many teeth does a crocodile have?", listOf("60", "80", "100", "120"), "Nature", "Crocodiles have about 100 teeth, which are regularly replaced throughout their lives."),
            zh = LocalizedContent("鳄鱼有多少颗牙齿？", listOf("60", "80", "100", "120"), "自然", "鳄鱼大约有100颗牙齿，这些牙齿在其一生中会定期更换。"),
            es = LocalizedContent("¿Cuántos dientes tiene un cocodrilo?", listOf("60", "80", "100", "120"), "Naturaleza", "Los cocodrilos tienen aproximadamente 100 dientes, que se reemplazan regularmente a lo largo de su vida.")
        ),
        BilingualQuestion(
            id = 50621, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus profond océan?", listOf("Atlantique", "Indien", "Pacifique", "Arctique"), "Nature", "La fosse des Mariannes, située dans l'océan Pacifique, atteint environ 11 000 mètres de profondeur, ce qui en fait l'océan le plus profond du monde."),
            en = LocalizedContent("Which is the deepest ocean?", listOf("Atlantic", "Indian", "Pacific", "Arctic"), "Nature", "The Mariana Trench, located in the Pacific Ocean, reaches about 11,000 meters deep, making it the deepest ocean in the world."),
            zh = LocalizedContent("哪个海洋最深？", listOf("大西洋", "印度洋", "太平洋", "北冰洋"), "自然", "位于太平洋的马里亚纳海沟深约11000米，使其成为世界上最深的海洋。"),
            es = LocalizedContent("¿Cuál es el océano más profundo?", listOf("Atlántico", "Índico", "Pacífico", "Ártico"), "Naturaleza", "La fosa de las Marianas, situada en el océano Pacífico, alcanza unos 11 000 metros de profundidad, lo que lo convierte en el océano más profundo del mundo.")
        ),
        BilingualQuestion(
            id = 50622, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'animal terrestre le plus lourd?", listOf("Rhinocéros", "Hippopotame", "Giraffe", "Éléphant"), "Nature", "L'éléphant d'Afrique, avec un poids pouvant atteindre 6 à 7 tonnes, est le plus lourd mammifère terrestre vivant."),
            en = LocalizedContent("What is the heaviest land animal?", listOf("Rhinoceros", "Hippopotamus", "Giraffe", "Elephant"), "Nature", "The African elephant, with a weight of up to 6 to 7 tons, is the heaviest living land mammal."),
            zh = LocalizedContent("最重的陆地动物是什么？", listOf("犀牛", "河马", "长颈鹿", "大象"), "自然", "非洲象体重可达6至7吨，是现存最重的陆地哺乳动物。"),
            es = LocalizedContent("¿Cuál es el animal terrestre más pesado?", listOf("Rinoceronte", "Hipopótamo", "Jirafa", "Elefante"), "Naturaleza", "El elefante africano, con un peso de hasta 6 a 7 toneladas, es el mamífero terrestre vivo más pesado.")
        ),
        BilingualQuestion(
            id = 50623, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus long fleuve du monde?", listOf("Amazone", "Nil", "Yangtze", "Mississippi"), "Nature", "Le Nil est généralement considéré comme le plus long fleuve du monde avec environ 6 650 km, bien que des débats existent avec l’Amazone selon les mesures."),
            en = LocalizedContent("What is the longest river in the world?", listOf("Amazon", "Nile", "Yangtze", "Mississippi"), "Nature", "The Nile is generally considered the longest river in the world at about 6,650 km, although debates exist with the Amazon depending on measurements."),
            zh = LocalizedContent("世界上最长的河流是什么？", listOf("亚马逊河", "尼罗河", "长江", "密西西比河"), "自然", "尼罗河通常被认为是世界上最长的河流，长约6650公里，尽管根据测量方式与亚马逊河存在争议。"),
            es = LocalizedContent("¿Cuál es el río más largo del mundo?", listOf("Amazonas", "Nilo", "Yangtsé", "Misisipi"), "Naturaleza", "El Nilo es generalmente considerado el río más largo del mundo con unos 6.650 km, aunque existen debates con el Amazonas según las mediciones.")
        ),
        BilingualQuestion(
            id = 50624, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de pattes a une mouche?", listOf("4", "6", "8", "10"), "Nature", "Les insectes, comme la mouche, ont six pattes, ce qui les distingue des arachnides qui en ont huit."),
            en = LocalizedContent("How many legs does a fly have?", listOf("4", "6", "8", "10"), "Nature", "Insects, like flies, have six legs, which distinguishes them from arachnids that have eight."),
            zh = LocalizedContent("苍蝇有几条腿？", listOf("4", "6", "8", "10"), "自然", "昆虫（如苍蝇）有六条腿，这区别于有八条腿的蛛形纲动物。"),
            es = LocalizedContent("¿Cuántas patas tiene una mosca?", listOf("4", "6", "8", "10"), "Naturaleza", "Los insectos, como la mosca, tienen seis patas, lo que los distingue de los arácnidos que tienen ocho.")
        ),
        BilingualQuestion(
            id = 50626, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui peut courir le plus vite?", listOf("Guépard", "Antilope pronghorn", "Autruche", "Lion"), "Nature", "Le guépard peut atteindre des pointes à 110 km/h grâce à sa colonne vertébrale flexible et ses griffes non rétractiles qui offrent une adhérence maximale."),
            en = LocalizedContent("Which animal can run the fastest?", listOf("Cheetah", "Pronghorn antelope", "Ostrich", "Lion"), "Nature", "The cheetah can reach speeds of up to 110 km/h thanks to its flexible spine and non-retractable claws that provide maximum grip."),
            zh = LocalizedContent("哪种动物跑得最快？", listOf("猎豹", "叉角羚", "鸵鸟", "狮子"), "自然", "猎豹凭借其灵活的脊柱和不可伸缩的爪子提供最大抓地力，速度可达110公里/小时。"),
            es = LocalizedContent("¿Qué animal puede correr más rápido?", listOf("Guepardo", "Antílope berrendo", "Avestruz", "León"), "Naturaleza", "El guepardo puede alcanzar velocidades de hasta 110 km/h gracias a su columna vertebral flexible y sus garras no retráctiles que ofrecen máxima adherencia.")
        ),
        BilingualQuestion(
            id = 50627, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fleuves coulent du Mont-Blanc?", listOf("1", "2", "3", "4"), "Nature", "Le Mont-Blanc est le point de départ de trois fleuves majeurs : l'Arve, l'Isère et le Rhône, qui prennent leur source dans ses glaciers."),
            en = LocalizedContent("How many rivers flow from Mont Blanc?", listOf("1", "2", "3", "4"), "Nature", "Mont Blanc is the source of three major rivers: the Arve, the Isère, and the Rhône, which originate from its glaciers."),
            zh = LocalizedContent("从勃朗峰流出的河流有多少条？", listOf("1", "2", "3", "4"), "自然", "勃朗峰是三条主要河流的源头：阿尔沃河、伊泽尔河和罗讷河，它们发源于其冰川。"),
            es = LocalizedContent("¿Cuántos ríos fluyen del Mont Blanc?", listOf("1", "2", "3", "4"), "Naturaleza", "El Mont Blanc es el origen de tres ríos principales: el Arve, el Isère y el Ródano, que nacen en sus glaciares.")
        ),
        BilingualQuestion(
            id = 50628, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus haut arbre du monde?", listOf("Séquoia", "Épicéa de Sitka", "Sapin de Douglas", "Mélèze"), "Nature", "Le séquoia géant de Californie, nommé Hyperion, atteint 115,5 mètres de haut, ce qui en fait l'arbre le plus grand du monde."),
            en = LocalizedContent("What is the tallest tree in the world?", listOf("Sequoia", "Sitka spruce", "Douglas fir", "Larch"), "Nature", "The giant sequoia of California, named Hyperion, reaches 115.5 meters in height, making it the tallest tree in the world."),
            zh = LocalizedContent("世界上最高的树是什么？", listOf("红杉", "西加云杉", "花旗松", "落叶松"), "自然", "加利福尼亚的巨型红杉“亥伯龙神”高达115.5米，是世界上最高的树。"),
            es = LocalizedContent("¿Cuál es el árbol más alto del mundo?", listOf("Secuoya", "Pícea de Sitka", "Abeto de Douglas", "Alerce"), "Naturaleza", "La secuoya gigante de California, llamada Hyperion, alcanza 115,5 metros de altura, lo que la convierte en el árbol más alto del mundo.")
        ),
        BilingualQuestion(
            id = 50630, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand marécage du monde?", listOf("Everglades", "Pantanal", "Sudd", "Delta de l'Okavango"), "Nature", "Le Pantanal, situé principalement au Brésil, s'étend sur plus de 150 000 km², ce qui en fait la plus vaste zone humide de la planète."),
            en = LocalizedContent("What is the largest swamp in the world?", listOf("Everglades", "Pantanal", "Sudd", "Okavango Delta"), "Nature", "The Pantanal, located mainly in Brazil, covers over 150,000 km², making it the largest wetland on the planet."),
            zh = LocalizedContent("世界上最大的沼泽是什么？", listOf("大沼泽地", "潘塔纳尔湿地", "苏德沼泽", "奥卡万戈三角洲"), "自然", "潘塔纳尔湿地主要位于巴西，面积超过15万平方公里，是地球上最大的湿地。"),
            es = LocalizedContent("¿Cuál es el pantano más grande del mundo?", listOf("Everglades", "Pantanal", "Sudd", "Delta del Okavango"), "Naturaleza", "El Pantanal, ubicado principalmente en Brasil, se extiende por más de 150.000 km², lo que lo convierte en el humedal más grande del planeta.")
        ),
        BilingualQuestion(
            id = 50631, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus long canyon du monde?", listOf("Canyon du Colorado", "Canyon de Colca", "Canyon du Yarlung Tsangpo", "Canyon de Bryce"), "Nature", "Le canyon du Yarlung Tsangpo, au Tibet, mesure environ 500 kilomètres, dépassant le Grand Canyon des États-Unis en longueur."),
            en = LocalizedContent("What is the longest canyon in the world?", listOf("Grand Canyon", "Colca Canyon", "Yarlung Tsangpo Canyon", "Bryce Canyon"), "Nature", "The Yarlung Tsangpo Canyon in Tibet is about 500 kilometers long, surpassing the Grand Canyon in the United States in length."),
            zh = LocalizedContent("世界上最长的峡谷是什么？", listOf("科罗拉多大峡谷", "科尔卡峡谷", "雅鲁藏布大峡谷", "布莱斯峡谷"), "自然", "西藏的雅鲁藏布大峡谷长约500公里，在长度上超过了美国的大峡谷。"),
            es = LocalizedContent("¿Cuál es el cañón más largo del mundo?", listOf("Gran Cañón", "Cañón de Colca", "Cañón del Yarlung Tsangpo", "Cañón de Bryce"), "Naturaleza", "El cañón del Yarlung Tsangpo en el Tíbet mide unos 500 kilómetros, superando en longitud al Gran Cañón de Estados Unidos.")
        ),
    )

    private fun part2(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 50632, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'animal avec le plus long cou?", listOf("Girafe", "Autruche", "Cygne", "Alpaca"), "Nature", "Avec un cou pouvant atteindre 2,4 mètres, la girafe détient le record du plus long cou parmi tous les animaux terrestres. Cette adaptation lui permet de brouter les feuilles en hauteur dans les savanes africaines."),
            en = LocalizedContent("Which animal has the longest neck?", listOf("Giraffe", "Ostrich", "Swan", "Alpaca"), "Nature", "With a neck that can reach up to 2.4 meters, the giraffe holds the record for the longest neck among all terrestrial animals. This adaptation allows it to browse leaves high in the African savannas."),
            zh = LocalizedContent("哪种动物的脖子最长？", listOf("长颈鹿", "鸵鸟", "天鹅", "羊驼"), "自然", "长颈鹿的脖子最长可达2.4米，是所有陆地动物中脖子最长的。这种适应使它们能够在非洲草原上吃到高处的树叶。"),
            es = LocalizedContent("¿Qué animal tiene el cuello más largo?", listOf("Jirafa", "Avestruz", "Cisne", "Alpaca"), "Naturaleza", "Con un cuello que puede alcanzar hasta 2,4 metros, la jirafa ostenta el récord del cuello más largo entre todos los animales terrestres. Esta adaptación le permite ramonear hojas en las alturas de las sabanas africanas.")
        ),
        BilingualQuestion(
            id = 50633, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de vertèbres a une girafe?", listOf("5", "7", "9", "11"), "Nature", "Comme la plupart des mammifères, y compris les humains, la girafe possède sept vertèbres cervicales, mais chacune est très allongée pour lui donner son long cou."),
            en = LocalizedContent("How many vertebrae does a giraffe have?", listOf("5", "7", "9", "11"), "Nature", "Like most mammals, including humans, the giraffe has seven cervical vertebrae, but each is greatly elongated to give it its long neck."),
            zh = LocalizedContent("长颈鹿有多少块颈椎骨？", listOf("5", "7", "9", "11"), "自然", "与大多数哺乳动物（包括人类）一样，长颈鹿有七块颈椎骨，但每块都非常长，从而形成了它的长脖子。"),
            es = LocalizedContent("¿Cuántas vértebras tiene una jirafa?", listOf("5", "7", "9", "11"), "Naturaleza", "Como la mayoría de los mamíferos, incluidos los humanos, la jirafa tiene siete vértebras cervicales, pero cada una está muy alargada para darle su largo cuello.")
        ),
        BilingualQuestion(
            id = 50635, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal ayant la plus grande gueule?", listOf("Requin blanc", "Crocodile", "Hippopotame", "Hippocampe"), "Nature", "L'hippopotame possède la plus grande gueule parmi les mammifères terrestres, avec une ouverture pouvant atteindre 1,2 mètre. Cette adaptation lui permet de brouter efficacement et d'intimider les prédateurs."),
            en = LocalizedContent("Which animal has the largest mouth?", listOf("Great white shark", "Crocodile", "Hippopotamus", "Seahorse"), "Nature", "The hippopotamus has the largest mouth among terrestrial mammals, with an opening that can reach up to 1.2 meters. This adaptation allows it to graze efficiently and intimidate predators."),
            zh = LocalizedContent("哪种动物的嘴最大？", listOf("大白鲨", "鳄鱼", "河马", "海马"), "自然", "河马拥有陆地哺乳动物中最大的嘴，张开可达1.2米。这种适应使它们能够高效地吃草并威慑捕食者。"),
            es = LocalizedContent("¿Qué animal tiene la boca más grande?", listOf("Tiburón blanco", "Cocodrilo", "Hipopótamo", "Caballito de mar"), "Naturaleza", "El hipopótamo posee la boca más grande entre los mamíferos terrestres, con una apertura que puede alcanzar hasta 1,2 metros. Esta adaptación le permite pastar eficientemente e intimidar a los depredadores.")
        ),
        BilingualQuestion(
            id = 50636, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus haut volcano du monde?", listOf("Mont Kilimanjaro", "Ojos del Salado", "Nevado Sajama", "Cotopaxi"), "Nature", "L'Ojos del Salado, situé à la frontière entre le Chili et l'Argentine, culmine à 6 893 mètres, ce qui en fait le plus haut volcan actif du monde."),
            en = LocalizedContent("What is the highest volcano in the world?", listOf("Mount Kilimanjaro", "Ojos del Salado", "Nevado Sajama", "Cotopaxi"), "Nature", "Ojos del Salado, located on the border between Chile and Argentina, reaches 6,893 meters, making it the highest active volcano in the world."),
            zh = LocalizedContent("世界上最高的火山是什么？", listOf("乞力马扎罗山", "奥霍斯-德尔萨拉多山", "萨哈马峰", "科托帕希火山"), "自然", "奥霍斯-德尔萨拉多山位于智利和阿根廷边境，海拔6893米，是世界上最活跃的火山。"),
            es = LocalizedContent("¿Cuál es el volcán más alto del mundo?", listOf("Monte Kilimanjaro", "Ojos del Salado", "Nevado Sajama", "Cotopaxi"), "Naturaleza", "El Ojos del Salado, situado en la frontera entre Chile y Argentina, alcanza los 6.893 metros, lo que lo convierte en el volcán activo más alto del mundo.")
        ),
        BilingualQuestion(
            id = 50637, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand récif de corail?", listOf("Récif de Ningaloo", "Grande Barrière de Corail", "Palau", "Récif de Mesoamerican"), "Nature", "La Grande Barrière de Corail, située au large de l'Australie, s'étend sur plus de 2 300 kilomètres et est visible depuis l'espace."),
            en = LocalizedContent("What is the largest coral reef?", listOf("Ningaloo Reef", "Great Barrier Reef", "Palau", "Mesoamerican Reef"), "Nature", "The Great Barrier Reef, located off the coast of Australia, stretches over 2,300 kilometers and is visible from space."),
            zh = LocalizedContent("最大的珊瑚礁是什么？", listOf("宁加洛礁", "大堡礁", "帕劳", "中美洲礁"), "自然", "大堡礁位于澳大利亚海岸外，绵延超过2300公里，从太空中可见。"),
            es = LocalizedContent("¿Cuál es el arrecife de coral más grande?", listOf("Arrecife de Ningaloo", "Gran Barrera de Coral", "Palaos", "Arrecife Mesoamericano"), "Naturaleza", "La Gran Barrera de Coral, situada frente a la costa de Australia, se extiende por más de 2.300 kilómetros y es visible desde el espacio.")
        ),
        BilingualQuestion(
            id = 50638, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal le plus venimeux au monde?", listOf("Serpent coral", "Grenouille empoisonnée", "Méduse boîte", "Araignée brazilian wandering"), "Nature", "L'araignée brésilienne errante détient le record de venin le plus toxique pour l'homme, selon le Livre Guinness des records. Son venin neurotoxique peut provoquer une paralysie respiratoire mortelle."),
            en = LocalizedContent("What is the most venomous animal in the world?", listOf("Coral snake", "Poison dart frog", "Box jellyfish", "Brazilian wandering spider"), "Nature", "The Brazilian wandering spider holds the record for the most toxic venom to humans, according to the Guinness Book of Records. Its neurotoxic venom can cause fatal respiratory paralysis."),
            zh = LocalizedContent("世界上毒性最强的动物是什么？", listOf("珊瑚蛇", "箭毒蛙", "箱形水母", "巴西游走蛛"), "自然", "根据吉尼斯世界纪录，巴西游走蛛拥有对人类毒性最强的毒液。其神经毒素可导致致命的呼吸麻痹。"),
            es = LocalizedContent("¿Cuál es el animal más venenoso del mundo?", listOf("Serpiente coral", "Rana venenosa", "Medusa caja", "Araña errante brasileña"), "Naturaleza", "La araña errante brasileña ostenta el récord del veneno más tóxico para los humanos, según el Libro Guinness de los Récords. Su veneno neurotóxico puede causar parálisis respiratoria mortal.")
        ),
        BilingualQuestion(
            id = 50639, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand mammifère volant?", listOf("Chauve-souris bouledogue", "Renard volant", "Chauve-souris géante des Philippines", "Mégachauves-souris"), "Nature", "La chauve-souris géante des Philippines, aussi appelée renard volant géant, détient le record du plus grand mammifère volant avec une envergure d'ailes pouvant atteindre 1,7 mètre."),
            en = LocalizedContent("What is the largest flying mammal?", listOf("Bulldog bat", "Flying fox", "Giant golden-crowned flying fox", "Megabat"), "Nature", "The giant golden-crowned flying fox, also known as the giant flying fox, holds the record for the largest flying mammal with a wingspan that can reach up to 1.7 meters."),
            zh = LocalizedContent("最大的飞行动物是什么？", listOf("斗牛犬蝠", "狐蝠", "菲律宾金冠飞狐", "巨型蝙蝠"), "自然", "菲律宾金冠飞狐，也称为巨型飞狐，是最大的飞行动物，翼展可达1.7米。"),
            es = LocalizedContent("¿Cuál es el mamífero volador más grande?", listOf("Murciélago bulldog", "Zorro volador", "Zorro volador gigante de Filipinas", "Megamurciélago"), "Naturaleza", "El zorro volador gigante de Filipinas, también conocido como zorro volador gigante, ostenta el récord del mamífero volador más grande con una envergadura de alas que puede alcanzar hasta 1,7 metros.")
        ),
        BilingualQuestion(
            id = 50640, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand oiseau du monde?", listOf("Autruche", "Émeu", "Casoar", "Nandou"), "Nature", "L'autruche, qui peut mesurer jusqu'à 2,70 mètres et peser 150 kg, est l'oiseau le plus grand et le plus lourd actuellement vivant sur Terre."),
            en = LocalizedContent("What is the largest bird in the world?", listOf("Ostrich", "Emu", "Cassowary", "Rhea"), "Nature", "The ostrich, which can measure up to 2.70 meters and weigh 150 kg, is the tallest and heaviest bird currently living on Earth."),
            zh = LocalizedContent("世界上最大的鸟是什么？", listOf("鸵鸟", "鸸鹋", "食火鸡", "美洲鸵"), "自然", "鸵鸟身高可达2.70米，体重150公斤，是现存最高最重的鸟类。"),
            es = LocalizedContent("¿Cuál es el ave más grande del mundo?", listOf("Avestruz", "Emú", "Casuari", "Ñandú"), "Naturaleza", "El avestruz, que puede medir hasta 2,70 metros y pesar 150 kg, es el ave más alta y pesada que vive actualmente en la Tierra.")
        ),
        BilingualQuestion(
            id = 50641, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a le plus de dents?", listOf("Requin", "Narval", "Hippopotame", "Crocodile"), "Nature", "Le requin possède plusieurs rangées de dents qui se renouvellent en continu, pouvant atteindre jusqu'à 3 000 dents au cours de sa vie."),
            en = LocalizedContent("Which animal has the most teeth?", listOf("Shark", "Narwhal", "Hippopotamus", "Crocodile"), "Nature", "Sharks have multiple rows of teeth that are continuously replaced, and they can have up to 3,000 teeth over their lifetime."),
            zh = LocalizedContent("哪种动物的牙齿最多？", listOf("鲨鱼", "独角鲸", "河马", "鳄鱼"), "自然", "鲨鱼有多排牙齿，不断替换，一生中可多达3000颗牙齿。"),
            es = LocalizedContent("¿Qué animal tiene más dientes?", listOf("Tiburón", "Narval", "Hipopótamo", "Cocodrilo"), "Naturaleza", "Los tiburones tienen varias hileras de dientes que se reemplazan continuamente, pudiendo tener hasta 3.000 dientes a lo largo de su vida.")
        ),
        BilingualQuestion(
            id = 50643, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui voit le plus loin?", listOf("Aigle", "Faucon", "Hibou", "Vautour"), "Nature", "Le faucon pèlerin possède une acuité visuelle exceptionnelle, lui permettant de repérer une proie à plus d'un kilomètre de distance."),
            en = LocalizedContent("Which animal can see the farthest?", listOf("Eagle", "Falcon", "Owl", "Vulture"), "Nature", "The peregrine falcon has exceptional visual acuity, allowing it to spot prey from more than a kilometer away."),
            zh = LocalizedContent("哪种动物看得最远？", listOf("鹰", "隼", "猫头鹰", "秃鹫"), "自然", "游隼具有非凡的视觉敏锐度，能够从一公里外发现猎物。"),
            es = LocalizedContent("¿Qué animal ve más lejos?", listOf("Águila", "Halcón", "Búho", "Buitre"), "Naturaleza", "El halcón peregrino posee una agudeza visual excepcional, que le permite detectar una presa a más de un kilómetro de distancia.")
        ),
        BilingualQuestion(
            id = 50645, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui saute le plus haut?", listOf("Kangourou", "Puce", "Cigale", "Grillon"), "Nature", "La puce peut sauter jusqu'à 200 fois sa propre taille grâce à ses pattes arrière puissantes et une résine élastique dans ses articulations."),
            en = LocalizedContent("Which animal jumps the highest?", listOf("Kangaroo", "Flea", "Cicada", "Cricket"), "Nature", "The flea can jump up to 200 times its own body length thanks to its powerful hind legs and elastic resin in its joints."),
            zh = LocalizedContent("哪种动物跳得最高？", listOf("袋鼠", "跳蚤", "蝉", "蟋蟀"), "自然", "跳蚤可以跳到自身长度的200倍，这得益于其强壮的后腿和关节中的弹性树脂。"),
            es = LocalizedContent("¿Qué animal salta más alto?", listOf("Canguro", "Pulga", "Cigarra", "Grillo"), "Naturaleza", "La pulga puede saltar hasta 200 veces su propio tamaño corporal gracias a sus poderosas patas traseras y una resina elástica en sus articulaciones.")
        ),
        BilingualQuestion(
            id = 50646, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand serpent du monde?", listOf("Anaconda", "Python réticulé", "Boa constrictor", "Cobra royal"), "Nature", "Le python réticulé peut atteindre plus de 7 mètres de long, ce qui en fait le serpent le plus long du monde, dépassant l'anaconda vert en longueur."),
            en = LocalizedContent("What is the largest snake in the world?", listOf("Anaconda", "Reticulated python", "Boa constrictor", "King cobra"), "Nature", "The reticulated python can reach over 7 meters in length, making it the longest snake in the world, surpassing the green anaconda in length."),
            zh = LocalizedContent("世界上最大的蛇是什么？", listOf("水蟒", "网纹蟒", "红尾蚺", "眼镜王蛇"), "自然", "网纹蟒可以长到7米以上，是世界上最长的蛇，长度超过绿水蟒。"),
            es = LocalizedContent("¿Cuál es la serpiente más grande del mundo?", listOf("Anaconda", "Pitón reticulada", "Boa constrictor", "Cobra real"), "Naturaleza", "La pitón reticulada puede alcanzar más de 7 metros de longitud, lo que la convierte en la serpiente más larga del mundo, superando a la anaconda verde en longitud.")
        ),
        BilingualQuestion(
            id = 50647, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'animal avec le plus grand cerveau?", listOf("Baleine bleue", "Éléphant", "Dauphin", "Humain"), "Nature", "La baleine bleue est le plus grand animal vivant sur Terre, et son cerveau pèse en moyenne 6 à 7 kilogrammes, ce qui en fait le plus volumineux de tous les animaux."),
            en = LocalizedContent("Which animal has the largest brain?", listOf("Blue whale", "Elephant", "Dolphin", "Human"), "Nature", "The blue whale is the largest animal on Earth, and its brain weighs on average 6 to 7 kilograms, making it the largest of all animals."),
            zh = LocalizedContent("哪种动物的大脑最大？", listOf("蓝鲸", "大象", "海豚", "人类"), "自然", "蓝鲸是地球上最大的动物，其大脑平均重6到7公斤，是所有动物中最大的。"),
            es = LocalizedContent("¿Qué animal tiene el cerebro más grande?", listOf("Ballena azul", "Elefante", "Delfín", "Humano"), "Naturaleza", "La ballena azul es el animal más grande de la Tierra, y su cerebro pesa en promedio de 6 a 7 kilogramos, lo que lo convierte en el más grande de todos los animales.")
        ),
        BilingualQuestion(
            id = 50649, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal ayant le plus grand rapport cerveau-corps?", listOf("Chimpanzé", "Perroquet", "Dauphin", "Baleine bleue"), "Nature", "Le perroquet possède un cerveau volumineux par rapport à sa taille corporelle, ce qui lui confère des capacités cognitives avancées comme l'imitation vocale et la résolution de problèmes."),
            en = LocalizedContent("Which animal has the largest brain-to-body ratio?", listOf("Chimpanzee", "Parrot", "Dolphin", "Blue whale"), "Nature", "The parrot has a large brain relative to its body size, giving it advanced cognitive abilities such as vocal imitation and problem-solving."),
            zh = LocalizedContent("哪种动物的脑体比最大？", listOf("黑猩猩", "鹦鹉", "海豚", "蓝鲸"), "自然", "鹦鹉的大脑相对于其体型较大，使其具有高级认知能力，如声音模仿和问题解决。"),
            es = LocalizedContent("¿Qué animal tiene la mayor relación cerebro-cuerpo?", listOf("Chimpancé", "Loro", "Delfín", "Ballena azul"), "Naturaleza", "El loro tiene un cerebro grande en relación con su tamaño corporal, lo que le confiere habilidades cognitivas avanzadas como la imitación vocal y la resolución de problemas.")
        ),
        BilingualQuestion(
            id = 50650, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand amphithéâtre naturel du monde?", listOf("Canyon du Colorado", "Vallée de la Mort", "Parc de Zhangjiajie", "Parc d'Arches"), "Nature", "Le parc national de Zhangjiajie, en Chine, est célèbre pour ses piliers de grès karstiques, dont la formation géologique a créé un amphithéâtre naturel grandiose."),
            en = LocalizedContent("What is the largest natural amphitheater in the world?", listOf("Grand Canyon", "Death Valley", "Zhangjiajie National Forest Park", "Arches National Park"), "Nature", "Zhangjiajie National Forest Park in China is famous for its karst sandstone pillars, whose geological formation created a grand natural amphitheater."),
            zh = LocalizedContent("世界上最大的天然露天剧场是什么？", listOf("科罗拉多大峡谷", "死亡谷", "张家界国家森林公园", "拱门国家公园"), "自然", "中国张家界国家森林公园以其喀斯特砂岩柱而闻名，其地质构造形成了一个宏伟的天然露天剧场。"),
            es = LocalizedContent("¿Cuál es el anfiteatro natural más grande del mundo?", listOf("Gran Cañón", "Valle de la Muerte", "Parque Nacional de Zhangjiajie", "Parque Nacional de los Arcos"), "Naturaleza", "El Parque Nacional de Zhangjiajie en China es famoso por sus pilares de arenisca kársticos, cuya formación geológica creó un grandioso anfiteatro natural.")
        ),
        BilingualQuestion(
            id = 50651, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal le plus rapide en natation?", listOf("Dauphin", "Espadon", "Requin blanc", "Thon bleu"), "Nature", "Le thon bleu peut atteindre des pointes de vitesse allant jusqu'à 70 km/h en nageant, grâce à sa forme hydrodynamique et ses muscles puissants."),
            en = LocalizedContent("Which animal is the fastest swimmer?", listOf("Dolphin", "Swordfish", "Great white shark", "Bluefin tuna"), "Nature", "The bluefin tuna can reach top speeds of up to 70 km/h while swimming, thanks to its hydrodynamic shape and powerful muscles."),
            zh = LocalizedContent("哪种动物游泳最快？", listOf("海豚", "剑鱼", "大白鲨", "蓝鳍金枪鱼"), "自然", "蓝鳍金枪鱼游泳时最高速度可达70公里/小时，这得益于其流线型体型和强壮的肌肉。"),
            es = LocalizedContent("¿Qué animal es el nadador más rápido?", listOf("Delfín", "Pez espada", "Tiburón blanco", "Atún rojo"), "Naturaleza", "El atún rojo puede alcanzar velocidades máximas de hasta 70 km/h al nadar, gracias a su forma hidrodinámica y sus poderosos músculos.")
        ),
        BilingualQuestion(
            id = 50652, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand papillon du monde?", listOf("Papillon Oiseau", "Papillon Atlas", "Papillon Morpho", "Papillon Sphinx"), "Nature", "Le papillon oiseau, ou Ornithoptera alexandrae, est le plus grand papillon du monde avec une envergure pouvant atteindre 28 centimètres. Il vit en Papouasie-Nouvelle-Guinée."),
            en = LocalizedContent("What is the largest butterfly in the world?", listOf("Birdwing butterfly", "Atlas moth", "Morpho butterfly", "Sphinx moth"), "Nature", "The birdwing butterfly, or Ornithoptera alexandrae, is the largest butterfly in the world with a wingspan of up to 28 centimeters. It lives in Papua New Guinea."),
            zh = LocalizedContent("世界上最大的蝴蝶是什么？", listOf("鸟翼蝶", "皇蛾", "闪蝶", "天蛾"), "自然", "鸟翼蝶，又称亚历山大鸟翼凤蝶，是世界上最大的蝴蝶，翼展可达28厘米。它生活在巴布亚新几内亚。"),
            es = LocalizedContent("¿Cuál es la mariposa más grande del mundo?", listOf("Mariposa alas de pájaro", "Polilla Atlas", "Mariposa Morpho", "Polilla esfinge"), "Naturaleza", "La mariposa alas de pájaro, u Ornithoptera alexandrae, es la mariposa más grande del mundo con una envergadura de hasta 28 centímetros. Vive en Papúa Nueva Guinea.")
        ),
        BilingualQuestion(
            id = 50653, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui plonge le plus profond?", listOf("Baleine à bec", "Cachalot", "Phoque de Weddell", "Manchot empereur"), "Nature", "Le cachalot peut plonger jusqu'à 3 000 mètres de profondeur pour chasser des calmars géants, ce qui en fait le mammifère plongeant le plus profondément."),
            en = LocalizedContent("Which animal dives the deepest?", listOf("Beaked whale", "Sperm whale", "Weddell seal", "Emperor penguin"), "Nature", "The sperm whale can dive up to 3,000 meters deep to hunt giant squid, making it the deepest diving mammal."),
            zh = LocalizedContent("哪种动物潜水最深？", listOf("喙鲸", "抹香鲸", "威德尔海豹", "帝企鹅"), "自然", "抹香鲸可以潜到3000米深处捕食巨型乌贼，是潜水最深的哺乳动物。"),
            es = LocalizedContent("¿Qué animal bucea más profundo?", listOf("Ballena de pico", "Cachalote", "Foca de Weddell", "Pingüino emperador"), "Naturaleza", "El cachalote puede bucear hasta 3.000 metros de profundidad para cazar calamares gigantes, lo que lo convierte en el mamífero que bucea más profundo.")
        ),
        BilingualQuestion(
            id = 50654, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand cratère du monde?", listOf("Cratère d'Vredefort", "Cratère de Sudbury", "Cratère de Chicxulub", "Cratère de Manicouagan"), "Nature", "Le cratère d'Vredefort, en Afrique du Sud, est le plus grand cratère d'impact connu sur Terre, avec un diamètre d'environ 300 kilomètres. Il s'est formé il y a plus de deux milliards d'années suite à la collision d'une météorite."),
            en = LocalizedContent("What is the largest crater in the world?", listOf("Vredefort crater", "Sudbury crater", "Chicxulub crater", "Manicouagan crater"), "Nature", "The Vredefort crater in South Africa is the largest known impact crater on Earth, with a diameter of about 300 kilometers. It formed over two billion years ago from a meteorite collision."),
            zh = LocalizedContent("世界上最大的陨石坑是什么？", listOf("弗里德堡陨石坑", "萨德伯里陨石坑", "希克苏鲁伯陨石坑", "马尼夸根陨石坑"), "自然", "南非的弗里德堡陨石坑是地球上已知最大的撞击坑，直径约300公里。它形成于20多亿年前的一次陨石撞击。"),
            es = LocalizedContent("¿Cuál es el cráter más grande del mundo?", listOf("Cráter de Vredefort", "Cráter de Sudbury", "Cráter de Chicxulub", "Cráter de Manicouagan"), "Naturaleza", "El cráter de Vredefort en Sudáfrica es el cráter de impacto más grande conocido en la Tierra, con un diámetro de unos 300 kilómetros. Se formó hace más de dos mil millones de años por la colisión de un meteorito.")
        ),
        BilingualQuestion(
            id = 50655, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est l'animal le plus vieux?", listOf("Tortue géante", "Baleine de Groenland", "Requin du Groenland", "Éponge de verre"), "Nature", "Le requin du Groenland peut vivre plus de 400 ans, ce qui en fait le vertébré le plus longévif connu, grâce à son métabolisme extrêmement lent dans les eaux froides arctiques."),
            en = LocalizedContent("Which animal is the oldest?", listOf("Giant tortoise", "Bowhead whale", "Greenland shark", "Glass sponge"), "Nature", "The Greenland shark can live over 400 years, making it the longest-lived known vertebrate, thanks to its extremely slow metabolism in cold Arctic waters."),
            zh = LocalizedContent("哪种动物最长寿？", listOf("巨龟", "弓头鲸", "格陵兰鲨", "玻璃海绵"), "自然", "格陵兰鲨可以活到400岁以上，是已知最长寿的脊椎动物，这得益于其在寒冷北极水域中极其缓慢的新陈代谢。"),
            es = LocalizedContent("¿Qué animal es el más longevo?", listOf("Tortuga gigante", "Ballena de Groenlandia", "Tiburón de Groenlandia", "Esponja de vidrio"), "Naturaleza", "El tiburón de Groenlandia puede vivir más de 400 años, lo que lo convierte en el vertebrado más longevo conocido, gracias a su metabolismo extremadamente lento en las frías aguas árticas.")
        ),
        BilingualQuestion(
            id = 50656, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand système de cavernes du monde?", listOf("Système de cavernes de Mammoth", "Son Doong Cave", "Grotte de Chiquibul", "Grotte de Mulu"), "Nature", "Le système de Mammoth, situé dans le Kentucky aux États-Unis, détient le record avec plus de 676 kilomètres de passages cartographiés."),
            en = LocalizedContent("What is the largest cave system in the world?", listOf("Mammoth Cave System", "Son Doong Cave", "Chiquibul Cave", "Mulu Cave"), "Nature", "The Mammoth Cave System, located in Kentucky, USA, holds the record with over 676 kilometers of mapped passages."),
            zh = LocalizedContent("世界上最大的洞穴系统是什么？", listOf("猛犸洞系统", "韩松洞", "奇基布尔洞穴", "姆鲁洞穴"), "自然", "猛犸洞系统位于美国肯塔基州，拥有超过676公里的已测绘通道，保持着世界纪录。"),
            es = LocalizedContent("¿Cuál es el sistema de cuevas más grande del mundo?", listOf("Sistema de la Cueva de Mammoth", "Cueva Son Doong", "Cueva de Chiquibul", "Cueva de Mulu"), "Naturaleza", "El Sistema de la Cueva de Mammoth, ubicado en Kentucky, EE. UU., ostenta el récord con más de 676 kilómetros de pasajes cartografiados.")
        ),
        BilingualQuestion(
            id = 50657, correctIndex = 3, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est l'animal ayant le plus long cœur?", listOf("Éléphant", "Giraffe", "Cachalot", "Baleine bleue"), "Nature", "Le cœur de la baleine bleue peut peser jusqu'à 600 kilos, ce qui en fait le plus grand et le plus lourd de tous les animaux."),
            en = LocalizedContent("Which animal has the longest heart?", listOf("Elephant", "Giraffe", "Sperm whale", "Blue whale"), "Nature", "The blue whale's heart can weigh up to 600 kilograms, making it the largest and heaviest of any animal."),
            zh = LocalizedContent("哪种动物的心脏最长？", listOf("大象", "长颈鹿", "抹香鲸", "蓝鲸"), "自然", "蓝鲸的心脏重达600公斤，是所有动物中最大最重的。"),
            es = LocalizedContent("¿Qué animal tiene el corazón más largo?", listOf("Elefante", "Jirafa", "Cachalote", "Ballena azul"), "Naturaleza", "El corazón de la ballena azul puede pesar hasta 600 kilogramos, lo que lo convierte en el más grande y pesado de todos los animales.")
        ),
        BilingualQuestion(
            id = 50658, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand jardin botanique du monde?", listOf("Kew Gardens", "New York Botanical Garden", "Royal Botanic Garden Sydney", "Singapour Botanic Gardens"), "Nature", "Kew Gardens, situé à Londres, possède la plus vaste collection de plantes vivantes au monde, avec plus de 50 000 espèces, ce qui en fait le plus grand jardin botanique."),
            en = LocalizedContent("What is the largest botanical garden in the world?", listOf("Kew Gardens", "New York Botanical Garden", "Royal Botanic Garden Sydney", "Singapore Botanic Gardens"), "Nature", "Kew Gardens, located in London, has the largest collection of living plants in the world, with over 50,000 species, making it the largest botanical garden."),
            zh = LocalizedContent("世界上最大的植物园是什么？", listOf("邱园", "纽约植物园", "悉尼皇家植物园", "新加坡植物园"), "自然", "位于伦敦的邱园拥有世界上最大的活植物收藏，超过5万种，使其成为最大的植物园。"),
            es = LocalizedContent("¿Cuál es el jardín botánico más grande del mundo?", listOf("Kew Gardens", "Jardín Botánico de Nueva York", "Real Jardín Botánico de Sídney", "Jardines Botánicos de Singapur"), "Naturaleza", "Kew Gardens, ubicado en Londres, posee la colección más grande de plantas vivas del mundo, con más de 50,000 especies, lo que lo convierte en el jardín botánico más grande.")
        ),
        BilingualQuestion(
            id = 50659, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'animal qui a la plus longue queue?", listOf("Girafe", "Léopard", "Lion", "Raton laveur"), "Nature", "Le léopard possède une queue particulièrement longue, mesurant jusqu'à 110 cm, qui lui sert d'équilibreur lors des sauts et des déplacements dans les arbres."),
            en = LocalizedContent("Which animal has the longest tail?", listOf("Giraffe", "Leopard", "Lion", "Raccoon"), "Nature", "The leopard has a particularly long tail, measuring up to 110 cm, which serves as a counterbalance during jumps and movements in trees."),
            zh = LocalizedContent("哪种动物的尾巴最长？", listOf("长颈鹿", "豹子", "狮子", "浣熊"), "自然", "豹子的尾巴特别长，可达110厘米，在跳跃和树上移动时用作平衡器。"),
            es = LocalizedContent("¿Qué animal tiene la cola más larga?", listOf("Jirafa", "Leopardo", "León", "Mapache"), "Naturaleza", "El leopardo tiene una cola particularmente larga, que mide hasta 110 cm, y le sirve como contrapeso durante los saltos y desplazamientos en los árboles.")
        ),
        BilingualQuestion(
            id = 50660, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand bâtiment naturel du monde?", listOf("Grand Canyon", "Château de Dracula", "Grottes de Carlsbad", "Parc de Zhangjiajie"), "Nature", "Le Grand Canyon, situé en Arizona, est considéré comme le plus grand canyon du monde avec ses 446 kilomètres de long et ses 1 800 mètres de profondeur."),
            en = LocalizedContent("What is the largest natural building in the world?", listOf("Grand Canyon", "Dracula's Castle", "Carlsbad Caverns", "Zhangjiajie Park"), "Nature", "The Grand Canyon, located in Arizona, is considered the largest canyon in the world, with its 446 kilometers in length and 1,800 meters in depth."),
            zh = LocalizedContent("世界上最大的自然建筑是什么？", listOf("大峡谷", "德古拉城堡", "卡尔斯巴德洞穴", "张家界公园"), "自然", "位于亚利桑那州的大峡谷被认为是世界上最大的峡谷，长446公里，深1800米。"),
            es = LocalizedContent("¿Cuál es el edificio natural más grande del mundo?", listOf("Gran Cañón", "Castillo de Drácula", "Cavernas de Carlsbad", "Parque de Zhangjiajie"), "Naturaleza", "El Gran Cañón, ubicado en Arizona, es considerado el cañón más grande del mundo, con sus 446 kilómetros de largo y 1.800 metros de profundidad.")
        ),
        BilingualQuestion(
            id = 50661, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le roi des dieux dans la mythologie grecque?", listOf("Poséidon", "Arès", "Zeus", "Hadès"), "Mythologie", "Zeus est le dieu du ciel et de la foudre, et il a renversé son père Cronos pour devenir le souverain de l'Olympe et le maître des dieux grecs."),
            en = LocalizedContent("Who is the king of the gods in Greek mythology?", listOf("Poseidon", "Ares", "Zeus", "Hades"), "Mythology", "Zeus is the god of the sky and thunder, and he overthrew his father Cronus to become the ruler of Olympus and the master of the Greek gods."),
            zh = LocalizedContent("希腊神话中众神之王是谁？", listOf("波塞冬", "阿瑞斯", "宙斯", "哈迪斯"), "神话", "宙斯是天空和雷电之神，他推翻了父亲克洛诺斯，成为奥林匹斯山的统治者和希腊众神之主。"),
            es = LocalizedContent("¿Quién es el rey de los dioses en la mitología griega?", listOf("Poseidón", "Ares", "Zeus", "Hades"), "Mitología", "Zeus es el dios del cielo y el trueno, y derrocó a su padre Cronos para convertirse en el soberano del Olimpo y el señor de los dioses griegos.")
        ),
        BilingualQuestion(
            id = 50662, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel dieu grec est le dieu de la mer?", listOf("Zeus", "Poséidon", "Hermès", "Apollon"), "Mythologie", "Poséidon est l'un des douze dieux de l'Olympe, frère de Zeus et d'Hadès, et règne sur les océans, les tempêtes et les tremblements de terre, souvent représenté avec un trident."),
            en = LocalizedContent("Which Greek god is the god of the sea?", listOf("Zeus", "Poseidon", "Hermes", "Apollo"), "Mythology", "Poseidon is one of the twelve Olympian gods, brother of Zeus and Hades, and rules over the oceans, storms, and earthquakes, often depicted with a trident."),
            zh = LocalizedContent("哪位希腊神是海神？", listOf("宙斯", "波塞冬", "赫尔墨斯", "阿波罗"), "神话", "波塞冬是十二奥林匹斯神之一，宙斯和哈迪斯的兄弟，掌管海洋、风暴和地震，常被描绘手持三叉戟。"),
            es = LocalizedContent("¿Qué dios griego es el dios del mar?", listOf("Zeus", "Poseidón", "Hermes", "Apolo"), "Mitología", "Poseidón es uno de los doce dioses del Olimpo, hermano de Zeus y Hades, y gobierna los océanos, las tormentas y los terremotos, a menudo representado con un tridente.")
        ),
        BilingualQuestion(
            id = 50663, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le dieu romain de la guerre?", listOf("Mars", "Mercure", "Neptune", "Vénus"), "Mythologie", "Mars est l'équivalent romain du dieu grec Arès et préside à la guerre, mais aussi à l'agriculture, une dualité importante dans la culture romaine."),
            en = LocalizedContent("Who is the Roman god of war?", listOf("Mars", "Mercury", "Neptune", "Venus"), "Mythology", "Mars is the Roman equivalent of the Greek god Ares and presides over war, but also agriculture, an important duality in Roman culture."),
            zh = LocalizedContent("罗马神话中的战神是谁？", listOf("马尔斯", "墨丘利", "尼普顿", "维纳斯"), "神话", "马尔斯是希腊神阿瑞斯的罗马对应者，掌管战争，但也掌管农业，这是罗马文化中重要的双重性。"),
            es = LocalizedContent("¿Quién es el dios romano de la guerra?", listOf("Marte", "Mercurio", "Neptuno", "Venus"), "Mitología", "Marte es el equivalente romano del dios griego Ares y preside la guerra, pero también la agricultura, una dualidad importante en la cultura romana.")
        ),
        BilingualQuestion(
            id = 50664, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel dieu est le dieu de la sagesse dans la mythologie grecque?", listOf("Aphrodite", "Athéna", "Héra", "Apollon"), "Mythologie", "Athéna est la déesse de la sagesse, de la stratégie militaire et des arts, née de la tête de Zeus. Elle est souvent représentée avec une chouette, symbole de la sagesse."),
            en = LocalizedContent("Which god is the god of wisdom in Greek mythology?", listOf("Aphrodite", "Athena", "Hera", "Apollo"), "Mythology", "Athena is the goddess of wisdom, military strategy, and the arts, born from the head of Zeus. She is often depicted with an owl, a symbol of wisdom."),
            zh = LocalizedContent("希腊神话中哪位神是智慧之神？", listOf("阿佛洛狄忒", "雅典娜", "赫拉", "阿波罗"), "神话", "雅典娜是智慧、军事策略和艺术的女神，从宙斯的头中诞生。她常被描绘带着一只猫头鹰，这是智慧的象征。"),
            es = LocalizedContent("¿Qué dios es el dios de la sabiduría en la mitología griega?", listOf("Afrodita", "Atenea", "Hera", "Apolo"), "Mitología", "Atenea es la diosa de la sabiduría, la estrategia militar y las artes, nacida de la cabeza de Zeus. A menudo se la representa con un búho, símbolo de la sabiduría.")
        ),
        BilingualQuestion(
            id = 50665, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le dieu de la forge dans la mythologie grecque?", listOf("Arès", "Héphaïstos", "Poséidon", "Apollon"), "Mythologie", "Héphaïstos, fils d'Héra et de Zeus, est le dieu grec du feu, de la forge et des artisans. Il fabriquait les armes des dieux et les éclairs de Zeus dans son atelier sous l'Olympe."),
            en = LocalizedContent("Who is the god of the forge in Greek mythology?", listOf("Ares", "Hephaestus", "Poseidon", "Apollo"), "Mythology", "Hephaestus, son of Hera and Zeus, is the Greek god of fire, the forge, and craftsmen. He forged the weapons of the gods and Zeus's thunderbolts in his workshop under Olympus."),
            zh = LocalizedContent("希腊神话中的锻造之神是谁？", listOf("阿瑞斯", "赫菲斯托斯", "波塞冬", "阿波罗"), "神话", "赫菲斯托斯是赫拉和宙斯的儿子，是希腊的火神、锻造之神和工匠之神。他在奥林匹斯山下的工坊中为众神锻造武器和宙斯的雷电。"),
            es = LocalizedContent("¿Quién es el dios de la forja en la mitología griega?", listOf("Ares", "Hefesto", "Poseidón", "Apolo"), "Mitología", "Hefesto, hijo de Hera y Zeus, es el dios griego del fuego, la forja y los artesanos. Forjaba las armas de los dioses y los rayos de Zeus en su taller bajo el Olimpo.")
        ),
        BilingualQuestion(
            id = 50666, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le dieu des enfers dans la mythologie grecque?", listOf("Poséidon", "Hadès", "Zeus", "Arès"), "Mythologie", "Hadès est le frère de Zeus et de Poséidon, et il règne sur le royaume des morts après le partage du monde entre les trois dieux."),
            en = LocalizedContent("Who is the god of the underworld in Greek mythology?", listOf("Poseidon", "Hades", "Zeus", "Ares"), "Mythology", "Hades is the brother of Zeus and Poseidon, and he rules over the realm of the dead after the division of the world among the three gods."),
            zh = LocalizedContent("在希腊神话中，谁是冥界之神？", listOf("波塞冬", "哈迪斯", "宙斯", "阿瑞斯"), "神话", "哈迪斯是宙斯和波塞冬的兄弟，在三位神祇瓜分世界后，他统治着死者王国。"),
            es = LocalizedContent("¿Quién es el dios del inframundo en la mitología griega?", listOf("Poseidón", "Hades", "Zeus", "Ares"), "Mitología", "Hades es el hermano de Zeus y Poseidón, y reina sobre el reino de los muertos tras el reparto del mundo entre los tres dioses.")
        ),
        BilingualQuestion(
            id = 50667, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est la déesse de l'amour dans la mythologie grecque?", listOf("Héra", "Aphrodite", "Athéna", "Artémis"), "Mythologie", "Aphrodite, née de l'écume de la mer selon Hésiode, est la déesse grecque de l'amour, de la beauté et de la séduction."),
            en = LocalizedContent("Who is the goddess of love in Greek mythology?", listOf("Hera", "Aphrodite", "Athena", "Artemis"), "Mythology", "Aphrodite, born from the sea foam according to Hesiod, is the Greek goddess of love, beauty, and seduction."),
            zh = LocalizedContent("在希腊神话中，谁是爱神？", listOf("赫拉", "阿佛洛狄忒", "雅典娜", "阿尔忒弥斯"), "神话", "根据赫西俄德的说法，阿佛洛狄忒诞生于海水的泡沫，是希腊的爱、美丽和诱惑女神。"),
            es = LocalizedContent("¿Quién es la diosa del amor en la mitología griega?", listOf("Hera", "Afrodita", "Atenea", "Artemisa"), "Mitología", "Afrodita, nacida de la espuma del mar según Hesíodo, es la diosa griega del amor, la belleza y la seducción.")
        ),
        BilingualQuestion(
            id = 50668, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel dieu est le messager des dieux dans la mythologie grecque?", listOf("Apollon", "Hermès", "Arès", "Héphaistos"), "Mythologie", "Hermès est le messager des dieux grecs, connu pour sa rapidité et son rôle de guide des âmes vers les Enfers."),
            en = LocalizedContent("Which god is the messenger of the gods in Greek mythology?", listOf("Apollo", "Hermes", "Ares", "Hephaestus"), "Mythology", "Hermes is the messenger of the Greek gods, known for his speed and his role as a guide of souls to the Underworld."),
            zh = LocalizedContent("在希腊神话中，哪位神是众神的信使？", listOf("阿波罗", "赫尔墨斯", "阿瑞斯", "赫菲斯托斯"), "神话", "赫尔墨斯是希腊众神的信使，以速度闻名，并担任灵魂前往冥界的向导。"),
            es = LocalizedContent("¿Qué dios es el mensajero de los dioses en la mitología griega?", listOf("Apolo", "Hermes", "Ares", "Hefesto"), "Mitología", "Hermes es el mensajero de los dioses griegos, conocido por su velocidad y su papel como guía de las almas hacia el Inframundo.")
        ),
        BilingualQuestion(
            id = 50669, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est la reine des dieux dans la mythologie grecque?", listOf("Aphrodite", "Athéna", "Héra", "Artémis"), "Mythologie", "Héra est la sœur et l'épouse de Zeus, roi des dieux, ce qui fait d'elle la reine de l'Olympe, déesse du mariage et de la famille."),
            en = LocalizedContent("Who is the queen of the gods in Greek mythology?", listOf("Aphrodite", "Athena", "Hera", "Artemis"), "Mythology", "Hera is the sister and wife of Zeus, king of the gods, making her the queen of Olympus, goddess of marriage and family."),
            zh = LocalizedContent("在希腊神话中，谁是众神之后？", listOf("阿佛洛狄忒", "雅典娜", "赫拉", "阿尔忒弥斯"), "神话", "赫拉是众神之王宙斯的姐妹和妻子，因此她是奥林匹斯的女神，掌管婚姻和家庭。"),
            es = LocalizedContent("¿Quién es la reina de los dioses en la mitología griega?", listOf("Afrodita", "Atenea", "Hera", "Artemisa"), "Mitología", "Hera es la hermana y esposa de Zeus, rey de los dioses, lo que la convierte en la reina del Olimpo, diosa del matrimonio y la familia.")
        ),
        BilingualQuestion(
            id = 50670, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel dieu est le dieu du soleil dans la mythologie grecque?", listOf("Apollon", "Zeus", "Hermès", "Arès"), "Mythologie", "Apollon est le dieu du soleil, de la musique et de la poésie dans la mythologie grecque, souvent représenté avec un char solaire traversant le ciel."),
            en = LocalizedContent("Which god is the god of the sun in Greek mythology?", listOf("Apollo", "Zeus", "Hermes", "Ares"), "Mythology", "Apollo is the god of the sun, music, and poetry in Greek mythology, often depicted driving a solar chariot across the sky."),
            zh = LocalizedContent("在希腊神话中，哪位神是太阳神？", listOf("阿波罗", "宙斯", "赫尔墨斯", "阿瑞斯"), "神话", "阿波罗是希腊神话中的太阳、音乐和诗歌之神，常被描绘为驾驶太阳战车穿越天空。"),
            es = LocalizedContent("¿Qué dios es el dios del sol en la mitología griega?", listOf("Apolo", "Zeus", "Hermes", "Ares"), "Mitología", "Apolo es el dios del sol, la música y la poesía en la mitología griega, a menudo representado conduciendo un carro solar a través del cielo.")
        ),
        BilingualQuestion(
            id = 50671, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a vaincu le Minotaure dans la mythologie grecque?", listOf("Persée", "Thésée", "Achille", "Héraclès"), "Mythologie", "Thésée a tué le Minotaure dans le labyrinthe de Crète, aidé par le fil d'Ariane pour retrouver son chemin."),
            en = LocalizedContent("Who defeated the Minotaur in Greek mythology?", listOf("Perseus", "Theseus", "Achilles", "Heracles"), "Mythology", "Theseus killed the Minotaur in the Labyrinth of Crete, helped by Ariadne's thread to find his way back."),
            zh = LocalizedContent("在希腊神话中，谁击败了米诺陶洛斯？", listOf("珀尔修斯", "忒修斯", "阿喀琉斯", "赫拉克勒斯"), "神话", "忒修斯在克里特岛的迷宫中杀死了米诺陶洛斯，借助阿里阿德涅的线团找到了返回的路。"),
            es = LocalizedContent("¿Quién derrotó al Minotauro en la mitología griega?", listOf("Perseo", "Teseo", "Aquiles", "Heracles"), "Mitología", "Teseo mató al Minotauro en el Laberinto de Creta, ayudado por el hilo de Ariadna para encontrar el camino de regreso.")
        ),
        BilingualQuestion(
            id = 50672, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le labeur impossible demandé à Héraclès?", listOf("Capturer la Biche de Cérynie", "Tuer l'Hydre de Lerne", "Obtenir les pommes d'or des Hespérides", "Ramener Cerbère du monde souterrain"), "Mythologie", "Ce travail était considéré comme impossible car les Hespérides, gardiennes du jardin, étaient protégées par un dragon immortel, et Héraclès ne connaissait pas l'emplacement du jardin."),
            en = LocalizedContent("What was the impossible labor demanded of Heracles?", listOf("Capture the Ceryneian Hind", "Kill the Lernaean Hydra", "Obtain the golden apples of the Hesperides", "Bring Cerberus from the underworld"), "Mythology", "This labor was considered impossible because the Hesperides, guardians of the garden, were protected by an immortal dragon, and Heracles did not know the location of the garden."),
            zh = LocalizedContent("赫拉克勒斯被要求完成的不可完成的任务是什么？", listOf("捕捉刻律涅亚牝鹿", "杀死勒耳那水蛇", "取得赫斯珀里得斯的金苹果", "从冥界带回刻耳柏洛斯"), "神话", "这项任务被认为不可能完成，因为赫斯珀里得斯是花园的守护者，由一条不朽的巨龙保护，而且赫拉克勒斯不知道花园的位置。"),
            es = LocalizedContent("¿Cuál fue el trabajo imposible exigido a Heracles?", listOf("Capturar la Cierva de Cerinia", "Matar a la Hidra de Lerna", "Obtener las manzanas de oro de las Hespérides", "Traer a Cerbero del inframundo"), "Mitología", "Este trabajo se consideraba imposible porque las Hespérides, guardianas del jardín, estaban protegidas por un dragón inmortal, y Heracles no conocía la ubicación del jardín.")
        ),
        BilingualQuestion(
            id = 50673, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de travaux Héraclès a-t-il dû accomplir?", listOf("6", "12", "10", "15"), "Mythologie", "Héraclès a dû accomplir douze travaux, initialement dix, mais deux furent invalidés par Eurysthée, portant le total à douze."),
            en = LocalizedContent("How many labors did Heracles have to accomplish?", listOf("6", "12", "10", "15"), "Mythology", "Heracles had to accomplish twelve labors, initially ten, but two were invalidated by Eurystheus, bringing the total to twelve."),
            zh = LocalizedContent("赫拉克勒斯必须完成多少项任务？", listOf("6", "12", "10", "15"), "神话", "赫拉克勒斯必须完成十二项任务，最初是十项，但其中两项被欧律斯透斯宣布无效，因此总数变为十二项。"),
            es = LocalizedContent("¿Cuántos trabajos tuvo que realizar Heracles?", listOf("6", "12", "10", "15"), "Mitología", "Heracles tuvo que realizar doce trabajos, inicialmente diez, pero dos fueron invalidados por Euristeo, elevando el total a doce.")
        ),
        BilingualQuestion(
            id = 50674, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est le Titan du temps dans la mythologie grecque?", listOf("Cronos", "Océanos", "Japet", "Thémis"), "Mythologie", "Dans la mythologie grecque, Cronos est le Titan du temps, célèbre pour avoir détrôné son père Ouranos et régné pendant l'âge d'or avant d'être vaincu par son fils Zeus."),
            en = LocalizedContent("Who is the Titan of time in Greek mythology?", listOf("Cronus", "Oceanus", "Iapetus", "Themis"), "Mythology", "In Greek mythology, Cronus is the Titan of time, famous for dethroning his father Uranus and ruling during the golden age before being overthrown by his son Zeus."),
            zh = LocalizedContent("在希腊神话中，谁是时间泰坦？", listOf("克洛诺斯", "俄刻阿诺斯", "伊阿珀托斯", "忒弥斯"), "神话", "在希腊神话中，克洛诺斯是时间泰坦，以推翻其父乌拉诺斯并在黄金时代统治而闻名，后被其子宙斯推翻。"),
            es = LocalizedContent("¿Quién es el Titán del tiempo en la mitología griega?", listOf("Crono", "Océano", "Jápeto", "Temis"), "Mitología", "En la mitología griega, Crono es el Titán del tiempo, famoso por destronar a su padre Urano y reinar durante la edad de oro antes de ser derrocado por su hijo Zeus.")
        ),
        BilingualQuestion(
            id = 50675, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom du monde souterrain dans la mythologie grecque?", listOf("Élysée", "Tartare", "Hadès", "Enfer"), "Mythologie", "Dans la mythologie grecque, le royaume des morts porte le nom de son dieu souverain, Hadès, qui règne sur les enfers souterrains."),
            en = LocalizedContent("What is the name of the underworld in Greek mythology?", listOf("Elysium", "Tartarus", "Hades", "Hell"), "Mythology", "In Greek mythology, the realm of the dead is named after its sovereign god, Hades, who rules over the underworld."),
            zh = LocalizedContent("在希腊神话中，冥界的名称是什么？", listOf("极乐世界", "塔尔塔罗斯", "哈迪斯", "地狱"), "神话", "在希腊神话中，死者王国以其统治神祇哈迪斯的名字命名，他统治着地下的冥界。"),
            es = LocalizedContent("¿Cuál es el nombre del inframundo en la mitología griega?", listOf("Elíseo", "Tártaro", "Hades", "Infierno"), "Mitología", "En la mitología griega, el reino de los muertos lleva el nombre de su dios soberano, Hades, que reina sobre el inframundo.")
        ),
        BilingualQuestion(
            id = 50676, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a créé Pandore dans la mythologie grecque?", listOf("Zeus", "Héphaïstos", "Athéna", "Apollon"), "Mythologie", "Dans la mythologie grecque, c'est Zeus qui ordonna la création de Pandore, la première femme, par Héphaïstos, comme punition envers l'humanité après le vol du feu par Prométhée."),
            en = LocalizedContent("Who created Pandora in Greek mythology?", listOf("Zeus", "Hephaestus", "Athena", "Apollo"), "Mythology", "In Greek mythology, Zeus ordered the creation of Pandora, the first woman, by Hephaestus as a punishment to humanity after Prometheus stole fire."),
            zh = LocalizedContent("在希腊神话中，谁创造了潘多拉？", listOf("宙斯", "赫菲斯托斯", "雅典娜", "阿波罗"), "神话", "在希腊神话中，宙斯命令赫菲斯托斯创造了第一个女人潘多拉，作为对普罗米修斯盗火后人类的惩罚。"),
            es = LocalizedContent("¿Quién creó a Pandora en la mitología griega?", listOf("Zeus", "Hefesto", "Atenea", "Apolo"), "Mitología", "En la mitología griega, Zeus ordenó la creación de Pandora, la primera mujer, por Hefesto como castigo a la humanidad tras el robo del fuego por Prometeo.")
        ),
        BilingualQuestion(
            id = 50677, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom du cheval de Troie dans la mythologie grecque?", listOf("Le Cheval noir", "Le Cheval de bois", "Le Cheval blanc", "Le Cheval d'or"), "Mythologie", "Le Cheval de bois est le nom donné à l'immense construction en bois utilisée par les Grecs pour s'introduire dans Troie, mettant fin à la guerre de Troie."),
            en = LocalizedContent("What is the name of the Trojan horse in Greek mythology?", listOf("The Black Horse", "The Wooden Horse", "The White Horse", "The Golden Horse"), "Mythology", "The Wooden Horse is the name given to the huge wooden construction used by the Greeks to enter Troy, ending the Trojan War."),
            zh = LocalizedContent("在希腊神话中，特洛伊木马的名字是什么？", listOf("黑马", "木马", "白马", "金马"), "神话", "木马是希腊人用来进入特洛伊的巨大木制结构的名称，结束了特洛伊战争。"),
            es = LocalizedContent("¿Cuál es el nombre del caballo de Troya en la mitología griega?", listOf("El Caballo Negro", "El Caballo de Madera", "El Caballo Blanco", "El Caballo de Oro"), "Mitología", "El Caballo de Madera es el nombre dado a la enorme construcción de madera utilizada por los griegos para entrar en Troya, poniendo fin a la guerra de Troya.")
        ),
        BilingualQuestion(
            id = 50678, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est la première femme humaine créée selon la mythologie grecque?", listOf("Héra", "Pandore", "Aphrodite", "Athéna"), "Mythologie", "Selon le mythe grec, Pandore fut créée par Héphaïstos sur ordre de Zeus pour punir l'humanité après que Prométhée lui ait offert le feu. Elle est célèbre pour avoir ouvert la boîte qui libéra tous les maux du monde."),
            en = LocalizedContent("Who is the first human woman created according to Greek mythology?", listOf("Hera", "Pandora", "Aphrodite", "Athena"), "Mythology", "According to Greek myth, Pandora was created by Hephaestus on the orders of Zeus to punish humanity after Prometheus gave them fire. She is famous for opening the box that released all the evils of the world."),
            zh = LocalizedContent("根据希腊神话，第一个被创造的人类女性是谁？", listOf("赫拉", "潘多拉", "阿佛洛狄忒", "雅典娜"), "神话", "根据希腊神话，潘多拉是由赫菲斯托斯奉宙斯之命创造的，以惩罚普罗米修斯将火赐予人类后的世人。她因打开盒子释放了世间所有邪恶而闻名。"),
            es = LocalizedContent("¿Quién es la primera mujer humana creada según la mitología griega?", listOf("Hera", "Pandora", "Afrodita", "Atenea"), "Mitología", "Según el mito griego, Pandora fue creada por Hefesto por orden de Zeus para castigar a la humanidad después de que Prometeo les diera el fuego. Es famosa por abrir la caja que liberó todos los males del mundo.")
        ),
        BilingualQuestion(
            id = 50679, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom du jardin des dieux immortels dans la mythologie grecque?", listOf("Olympe", "Élysée", "Tartare", "Hadès"), "Mythologie", "L'Olympe est la demeure des dieux grecs, un sommet montagneux où ils vivent éternellement, et non un jardin."),
            en = LocalizedContent("What is the name of the garden of the immortal gods in Greek mythology?", listOf("Olympus", "Elysium", "Tartarus", "Hades"), "Mythology", "Olympus is the home of the Greek gods, a mountain peak where they live eternally, not a garden."),
            zh = LocalizedContent("在希腊神话中，不朽诸神的花园叫什么名字？", listOf("奥林匹斯山", "极乐世界", "塔尔塔罗斯", "哈迪斯"), "神话", "奥林匹斯山是希腊诸神的居所，一个他们永生的山峰，而不是一个花园。"),
            es = LocalizedContent("¿Cuál es el nombre del jardín de los dioses inmortales en la mitología griega?", listOf("Olimpo", "Elíseo", "Tártaro", "Hades"), "Mitología", "El Olimpo es el hogar de los dioses griegos, una cumbre montañosa donde viven eternamente, no un jardín.")
        ),
        BilingualQuestion(
            id = 50680, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui est le père de Méduse dans la mythologie grecque?", listOf("Poséidon", "Zeus", "Hadès", "Cronos"), "Mythologie", "Dans la plupart des récits, Méduse est l'une des trois Gorgones, filles des divinités marines Phorcys et Céto. Poséidon est souvent mentionné comme son amant, mais il n'est pas son père."),
            en = LocalizedContent("Who is the father of Medusa in Greek mythology?", listOf("Poseidon", "Zeus", "Hades", "Cronus"), "Mythology", "In most accounts, Medusa is one of the three Gorgons, daughters of the sea deities Phorcys and Ceto. Poseidon is often mentioned as her lover, but he is not her father."),
            zh = LocalizedContent("在希腊神话中，美杜莎的父亲是谁？", listOf("波塞冬", "宙斯", "哈迪斯", "克洛诺斯"), "神话", "在大多数记载中，美杜莎是三位戈耳工之一，是海神福耳库斯和刻托的女儿。波塞冬常被提及为她的情人，但他不是她的父亲。"),
            es = LocalizedContent("¿Quién es el padre de Medusa en la mitología griega?", listOf("Poseidón", "Zeus", "Hades", "Cronos"), "Mitología", "En la mayoría de los relatos, Medusa es una de las tres Gorgonas, hijas de las deidades marinas Forcis y Ceto. Poseidón es mencionado a menudo como su amante, pero no es su padre.")
        ),
        BilingualQuestion(
            id = 50681, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom de l'arme magique de Zeus?", listOf("Trident", "Foudre", "Épée", "Bouclier"), "Mythologie", "Dans la mythologie grecque, le foudre est l'arme forgée par les Cyclopes que Zeus utilise pour affirmer son autorité sur les dieux et les hommes."),
            en = LocalizedContent("What is the name of Zeus's magical weapon?", listOf("Trident", "Thunderbolt", "Sword", "Shield"), "Mythology", "In Greek mythology, the thunderbolt is the weapon forged by the Cyclopes that Zeus uses to assert his authority over gods and men."),
            zh = LocalizedContent("宙斯的魔法武器叫什么名字？", listOf("三叉戟", "雷霆", "剑", "盾牌"), "神话", "在希腊神话中，雷霆是独眼巨人锻造的武器，宙斯用它来确立对神和人的权威。"),
            es = LocalizedContent("¿Cuál es el nombre del arma mágica de Zeus?", listOf("Tridente", "Rayo", "Espada", "Escudo"), "Mitología", "En la mitología griega, el rayo es el arma forjada por los Cíclopes que Zeus utiliza para afirmar su autoridad sobre dioses y hombres.")
        ),
        BilingualQuestion(
            id = 50682, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a vaincu Méduse dans la mythologie grecque?", listOf("Thésée", "Persée", "Héraclès", "Achille"), "Mythologie", "Persée, fils de Zeus, a décapité Méduse en utilisant le bouclier poli d'Athéna pour éviter son regard pétrifiant."),
            en = LocalizedContent("Who defeated Medusa in Greek mythology?", listOf("Theseus", "Perseus", "Heracles", "Achilles"), "Mythology", "Perseus, son of Zeus, beheaded Medusa using Athena's polished shield to avoid her petrifying gaze."),
            zh = LocalizedContent("在希腊神话中，谁击败了美杜莎？", listOf("忒修斯", "珀尔修斯", "赫拉克勒斯", "阿喀琉斯"), "神话", "珀尔修斯，宙斯之子，利用雅典娜抛光的盾牌避免美杜莎的石化目光，斩下了她的头颅。"),
            es = LocalizedContent("¿Quién derrotó a Medusa en la mitología griega?", listOf("Teseo", "Perseo", "Heracles", "Aquiles"), "Mitología", "Perseo, hijo de Zeus, decapitó a Medusa usando el escudo pulido de Atenea para evitar su mirada petrificante.")
        ),
        BilingualQuestion(
            id = 50683, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom du phoenix dans la mythologie égyptienne?", listOf("Benu", "Ra", "Thot", "Osiris"), "Mythologie", "Le Benu est l'oiseau sacré de la mythologie égyptienne, associé au dieu solaire Rê et au cycle du soleil levant, préfigurant le phénix grec."),
            en = LocalizedContent("What is the name of the phoenix in Egyptian mythology?", listOf("Benu", "Ra", "Thoth", "Osiris"), "Mythology", "The Benu is the sacred bird of Egyptian mythology, associated with the sun god Ra and the cycle of the rising sun, prefiguring the Greek phoenix."),
            zh = LocalizedContent("在埃及神话中，凤凰的名字是什么？", listOf("贝努", "拉", "托特", "奥西里斯"), "神话", "贝努是埃及神话中的圣鸟，与太阳神拉和日出的循环相关，预示了希腊的凤凰。"),
            es = LocalizedContent("¿Cuál es el nombre del fénix en la mitología egipcia?", listOf("Benu", "Ra", "Thot", "Osiris"), "Mitología", "El Benu es el ave sagrada de la mitología egipcia, asociada al dios sol Ra y al ciclo del sol naciente, prefigurando al fénix griego.")
        ),
        BilingualQuestion(
            id = 50684, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel dieu égyptien est le dieu des morts?", listOf("Osiris", "Anubis", "Thot", "Horus"), "Mythologie", "Osiris est le dieu des morts dans la mythologie égyptienne, car il a été assassiné par son frère Seth puis ressuscité pour régner sur l'au-delà."),
            en = LocalizedContent("Which Egyptian god is the god of the dead?", listOf("Osiris", "Anubis", "Thoth", "Horus"), "Mythology", "Osiris is the god of the dead in Egyptian mythology, as he was murdered by his brother Seth and then resurrected to rule the afterlife."),
            zh = LocalizedContent("哪位埃及神是死神？", listOf("奥西里斯", "阿努比斯", "托特", "荷鲁斯"), "神话", "奥西里斯是埃及神话中的死神，因为他被兄弟塞特谋杀，然后复活统治来世。"),
            es = LocalizedContent("¿Qué dios egipcio es el dios de los muertos?", listOf("Osiris", "Anubis", "Thot", "Horus"), "Mitología", "Osiris es el dios de los muertos en la mitología egipcia, ya que fue asesinado por su hermano Seth y luego resucitado para gobernar el más allá.")
        ),
        BilingualQuestion(
            id = 50685, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui est la déesse égyptienne du ciel?", listOf("Isis", "Hathor", "Nut", "Sekhmet"), "Mythologie", "Nut est la déesse égyptienne du ciel, souvent représentée comme une femme voûtée au-dessus de la Terre, son corps parsemé d'étoiles. Elle est la mère d'Osiris, Isis, Seth et Nephtys."),
            en = LocalizedContent("Who is the Egyptian goddess of the sky?", listOf("Isis", "Hathor", "Nut", "Sekhmet"), "Mythology", "Nut is the Egyptian goddess of the sky, often depicted as a woman arched over the Earth, her body studded with stars. She is the mother of Osiris, Isis, Seth, and Nephthys."),
            zh = LocalizedContent("谁是埃及的天空女神？", listOf("伊西斯", "哈索尔", "努特", "塞赫麦特"), "神话", "努特是埃及的天空女神，常被描绘为拱起在地球之上的女性，身上布满星星。她是奥西里斯、伊西斯、塞特和奈芙蒂斯的母亲。"),
            es = LocalizedContent("¿Quién es la diosa egipcia del cielo?", listOf("Isis", "Hathor", "Nut", "Sekhmet"), "Mitología", "Nut es la diosa egipcia del cielo, a menudo representada como una mujer arqueada sobre la Tierra, su cuerpo tachonado de estrellas. Es la madre de Osiris, Isis, Seth y Neftis.")
        ),
        BilingualQuestion(
            id = 50686, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le dieu du soleil dans la mythologie égyptienne?", listOf("Thot", "Ra", "Horus", "Amon"), "Mythologie", "Ra est le dieu solaire principal de la mythologie égyptienne, souvent représenté avec une tête de faucon surmontée d'un disque solaire. Il était considéré comme le créateur de l'univers et le souverain des dieux."),
            en = LocalizedContent("Who is the sun god in Egyptian mythology?", listOf("Thoth", "Ra", "Horus", "Amun"), "Mythology", "Ra is the primary sun god in Egyptian mythology, often depicted with a falcon head topped with a solar disk. He was considered the creator of the universe and the ruler of the gods."),
            zh = LocalizedContent("埃及神话中的太阳神是谁？", listOf("托特", "拉", "荷鲁斯", "阿蒙"), "神话", "拉是埃及神话中的主要太阳神，常被描绘为鹰头并顶有太阳圆盘。他被视为宇宙的创造者和众神之王。"),
            es = LocalizedContent("¿Quién es el dios del sol en la mitología egipcia?", listOf("Thot", "Ra", "Horus", "Amón"), "Mitología", "Ra es el dios solar principal de la mitología egipcia, a menudo representado con cabeza de halcón coronada por un disco solar. Era considerado el creador del universo y el soberano de los dioses.")
        ),
        BilingualQuestion(
            id = 50687, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est le dieu scandinave du tonnerre?", listOf("Odin", "Thor", "Loki", "Freya"), "Mythologie", "Thor est le dieu du tonnerre dans la mythologie nordique, fils d'Odin et protecteur de Midgard, connu pour son marteau Mjöllnir."),
            en = LocalizedContent("Who is the Norse god of thunder?", listOf("Odin", "Thor", "Loki", "Freya"), "Mythology", "Thor is the god of thunder in Norse mythology, son of Odin and protector of Midgard, known for his hammer Mjölnir."),
            zh = LocalizedContent("北欧神话中的雷神是谁？", listOf("奥丁", "托尔", "洛基", "芙蕾雅"), "神话", "托尔是北欧神话中的雷神，奥丁之子，米德加德的保护者，以其雷神之锤妙尔尼尔闻名。"),
            es = LocalizedContent("¿Quién es el dios nórdico del trueno?", listOf("Odín", "Thor", "Loki", "Freya"), "Mitología", "Thor es el dios del trueno en la mitología nórdica, hijo de Odín y protector de Midgard, conocido por su martillo Mjölnir.")
        ),
        BilingualQuestion(
            id = 50688, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom du mont des dieux dans la mythologie scandinave?", listOf("Valhalla", "Asgard", "Midgard", "Jotunheim"), "Mythologie", "Asgard est le royaume des dieux Ases dans la mythologie nordique, situé au sommet de l'arbre cosmique Yggdrasil."),
            en = LocalizedContent("What is the name of the mountain of the gods in Norse mythology?", listOf("Valhalla", "Asgard", "Midgard", "Jotunheim"), "Mythology", "Asgard is the realm of the Aesir gods in Norse mythology, located at the top of the cosmic tree Yggdrasil."),
            zh = LocalizedContent("北欧神话中众神之山的名字是什么？", listOf("瓦尔哈拉", "阿斯加德", "米德加德", "约顿海姆"), "神话", "阿斯加德是北欧神话中阿萨神族的居所，位于世界树尤克特拉希尔之巅。"),
            es = LocalizedContent("¿Cuál es el nombre del monte de los dioses en la mitología nórdica?", listOf("Valhalla", "Asgard", "Midgard", "Jotunheim"), "Mitología", "Asgard es el reino de los dioses Aesir en la mitología nórdica, situado en la cima del árbol cósmico Yggdrasil.")
        ),
        BilingualQuestion(
            id = 50689, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est le père de tous les dieux dans la mythologie scandinave?", listOf("Thor", "Odin", "Loki", "Tyr"), "Mythologie", "Odin est considéré comme le père de tous les dieux dans la mythologie nordique, car il est le chef des Ases et le créateur du monde avec ses frères Vili et Vé."),
            en = LocalizedContent("Who is the father of all gods in Norse mythology?", listOf("Thor", "Odin", "Loki", "Tyr"), "Mythology", "Odin is considered the father of all gods in Norse mythology, as he is the chief of the Aesir and the creator of the world with his brothers Vili and Vé."),
            zh = LocalizedContent("北欧神话中众神之父是谁？", listOf("托尔", "奥丁", "洛基", "提尔"), "神话", "奥丁被认为是北欧神话中的众神之父，他是阿萨神族的首领，并与兄弟维利和维共同创造了世界。"),
            es = LocalizedContent("¿Quién es el padre de todos los dioses en la mitología nórdica?", listOf("Thor", "Odín", "Loki", "Tyr"), "Mitología", "Odín es considerado el padre de todos los dioses en la mitología nórdica, ya que es el jefe de los Aesir y el creador del mundo junto con sus hermanos Vili y Vé.")
        ),
        BilingualQuestion(
            id = 50690, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel dieu scandinave est le dieu du feu?", listOf("Odin", "Loki", "Thor", "Heimdall"), "Mythologie", "Loki est souvent associé au feu dans la mythologie nordique, bien qu'il soit plus précisément un dieu farceur, son nom étant lié au mot vieux norrois pour \"flamme\"."),
            en = LocalizedContent("Which Norse god is the god of fire?", listOf("Odin", "Loki", "Thor", "Heimdall"), "Mythology", "Loki is often associated with fire in Norse mythology, though he is more precisely a trickster god; his name is linked to the Old Norse word for 'flame'."),
            zh = LocalizedContent("哪位北欧神祇是火神？", listOf("奥丁", "洛基", "托尔", "海姆达尔"), "神话", "洛基在北欧神话中常与火相关联，尽管他更确切地说是一位恶作剧之神；他的名字与古诺尔斯语中表示“火焰”的词有关。"),
            es = LocalizedContent("¿Qué dios nórdico es el dios del fuego?", listOf("Odín", "Loki", "Thor", "Heimdall"), "Mitología", "Loki suele asociarse con el fuego en la mitología nórdica, aunque es más precisamente un dios embaucador; su nombre está vinculado a la palabra nórdica antigua para 'llama'.")
        ),
        BilingualQuestion(
            id = 50691, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom du serpent qui ronge les racines de Yggdrasil dans la mythologie scandinave?", listOf("Jörmungandr", "Nidhogg", "Sköll", "Hati"), "Mythologie", "Dans la mythologie nordique, Nidhogg est le serpent ou dragon qui ronge les racines d'Yggdrasil, l'arbre-monde, symbolisant la destruction et le chaos aux confins du cosmos."),
            en = LocalizedContent("What is the name of the serpent that gnaws the roots of Yggdrasil in Norse mythology?", listOf("Jörmungandr", "Nidhogg", "Sköll", "Hati"), "Mythology", "In Norse mythology, Nidhogg is the serpent or dragon that gnaws the roots of Yggdrasil, the world tree, symbolizing destruction and chaos at the edges of the cosmos."),
            zh = LocalizedContent("北欧神话中啃食世界树尤克特拉希尔根部的蛇叫什么名字？", listOf("耶梦加得", "尼德霍格", "斯库尔", "哈提"), "神话", "在北欧神话中，尼德霍格是啃食世界树尤克特拉希尔根部的蛇或龙，象征着宇宙边缘的毁灭与混沌。"),
            es = LocalizedContent("¿Cuál es el nombre de la serpiente que roe las raíces de Yggdrasil en la mitología nórdica?", listOf("Jörmungandr", "Nidhogg", "Sköll", "Hati"), "Mitología", "En la mitología nórdica, Nidhogg es la serpiente o dragón que roe las raíces de Yggdrasil, el árbol del mundo, simbolizando la destrucción y el caos en los confines del cosmos.")
        ),
        BilingualQuestion(
            id = 50692, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est le dieu indien de la destruction?", listOf("Brahma", "Vishnou", "Shiva", "Ganesha"), "Mythologie", "Shiva est l'une des principales divinités de l'hindouisme, faisant partie de la Trimurti avec Brahma (créateur) et Vishnu (préservateur). Son rôle de destructeur permet la renaissance et la transformation du cosmos."),
            en = LocalizedContent("Who is the Hindu god of destruction?", listOf("Brahma", "Vishnu", "Shiva", "Ganesha"), "Mythology", "Shiva is one of the principal deities of Hinduism, part of the Trimurti with Brahma (creator) and Vishnu (preserver). His role as destroyer enables rebirth and transformation of the cosmos."),
            zh = LocalizedContent("印度教中的毁灭之神是谁？", listOf("梵天", "毗湿奴", "湿婆", "象头神"), "神话", "湿婆是印度教的主要神祇之一，与梵天（创造者）和毗湿奴（维护者）构成三相神。他作为毁灭者的角色使得宇宙得以重生和转化。"),
            es = LocalizedContent("¿Quién es el dios hindú de la destrucción?", listOf("Brahma", "Visnú", "Shiva", "Ganesha"), "Mitología", "Shiva es una de las principales deidades del hinduismo, parte de la Trimurti con Brahma (creador) y Visnú (preservador). Su papel como destructor permite el renacimiento y la transformación del cosmos.")
        ),
        BilingualQuestion(
            id = 50693, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom de la déesse mère hindoue?", listOf("Parvati", "Durga", "Shakti", "Kali"), "Mythologie", "Shakti est la déesse mère suprême dans l'hindouisme, représentant l'énergie divine féminine et la force créatrice de l'univers."),
            en = LocalizedContent("What is the name of the Hindu mother goddess?", listOf("Parvati", "Durga", "Shakti", "Kali"), "Mythology", "Shakti is the supreme mother goddess in Hinduism, representing the divine feminine energy and the creative force of the universe."),
            zh = LocalizedContent("印度教中的圣母女神叫什么名字？", listOf("帕尔瓦蒂", "杜尔迦", "萨克蒂", "迦梨"), "神话", "萨克蒂是印度教中的至高圣母女神，代表神圣的女性力量和宇宙的创造力。"),
            es = LocalizedContent("¿Cuál es el nombre de la diosa madre hindú?", listOf("Parvati", "Durga", "Shakti", "Kali"), "Mitología", "Shakti es la diosa madre suprema en el hinduismo, que representa la energía divina femenina y la fuerza creadora del universo.")
        ),
        BilingualQuestion(
            id = 50694, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel dieu romain est équivalent à Zeus?", listOf("Mars", "Jupiter", "Neptune", "Mercure"), "Mythologie", "Jupiter était le roi des dieux dans la mythologie romaine, assimilé au Zeus grec lors de la romanisation de la culture hellénistique."),
            en = LocalizedContent("Which Roman god is equivalent to Zeus?", listOf("Mars", "Jupiter", "Neptune", "Mercury"), "Mythology", "Jupiter was the king of the gods in Roman mythology, assimilated to the Greek Zeus during the Romanization of Hellenistic culture."),
            zh = LocalizedContent("哪位罗马神祇相当于宙斯？", listOf("马尔斯", "朱庇特", "尼普顿", "墨丘利"), "神话", "朱庇特是罗马神话中的众神之王，在希腊文化罗马化过程中与希腊的宙斯等同。"),
            es = LocalizedContent("¿Qué dios romano es equivalente a Zeus?", listOf("Marte", "Júpiter", "Neptuno", "Mercurio"), "Mitología", "Júpiter era el rey de los dioses en la mitología romana, asimilado al Zeus griego durante la romanización de la cultura helenística.")
        ),
        BilingualQuestion(
            id = 50695, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel dieu romain est équivalent à Poséidon?", listOf("Mars", "Jupiter", "Neptune", "Mercure"), "Mythologie", "Neptune est le dieu romain des mers et des océans, directement assimilé au Poséidon grec lors de la romanisation de la mythologie hellénique."),
            en = LocalizedContent("Which Roman god is equivalent to Poseidon?", listOf("Mars", "Jupiter", "Neptune", "Mercury"), "Mythology", "Neptune is the Roman god of the seas and oceans, directly assimilated to the Greek Poseidon during the Romanization of Hellenic mythology."),
            zh = LocalizedContent("哪位罗马神祇相当于波塞冬？", listOf("马尔斯", "朱庇特", "尼普顿", "墨丘利"), "神话", "尼普顿是罗马神话中的海神，在希腊神话罗马化过程中直接与波塞冬等同。"),
            es = LocalizedContent("¿Qué dios romano es equivalente a Poseidón?", listOf("Marte", "Júpiter", "Neptuno", "Mercurio"), "Mitología", "Neptuno es el dios romano de los mares y océanos, directamente asimilado al Poseidón griego durante la romanización de la mitología helénica.")
        ),
        BilingualQuestion(
            id = 50696, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel dieu romain est équivalent à Hermès?", listOf("Mars", "Jupiter", "Neptune", "Mercure"), "Mythologie", "Mercure est l'équivalent romain d'Hermès, dieu grec du commerce, des voyages et des messagers. Les Romains ont assimilé de nombreux dieux grecs en leur donnant des noms latins."),
            en = LocalizedContent("Which Roman god is equivalent to Hermes?", listOf("Mars", "Jupiter", "Neptune", "Mercury"), "Mythology", "Mercury is the Roman equivalent of Hermes, the Greek god of commerce, travel, and messengers. The Romans assimilated many Greek gods by giving them Latin names."),
            zh = LocalizedContent("哪位罗马神祇相当于赫尔墨斯？", listOf("马尔斯", "朱庇特", "尼普顿", "墨丘利"), "神话", "墨丘利是赫尔墨斯的罗马对应神，赫尔墨斯是希腊的商业、旅行和信使之神。罗马人通过赋予拉丁名字吸收了许多希腊神祇。"),
            es = LocalizedContent("¿Qué dios romano es equivalente a Hermes?", listOf("Marte", "Júpiter", "Neptuno", "Mercurio"), "Mitología", "Mercurio es el equivalente romano de Hermes, dios griego del comercio, los viajes y los mensajeros. Los romanos asimilaron muchos dioses griegos dándoles nombres latinos.")
        ),
        BilingualQuestion(
            id = 50697, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel dieu romain est équivalent à Arès?", listOf("Mars", "Jupiter", "Neptune", "Vulcain"), "Mythologie", "Mars est le dieu romain de la guerre, directement assimilé à Arès dans la mythologie grecque."),
            en = LocalizedContent("Which Roman god is equivalent to Ares?", listOf("Mars", "Jupiter", "Neptune", "Vulcan"), "Mythology", "Mars is the Roman god of war, directly assimilated to Ares in Greek mythology."),
            zh = LocalizedContent("哪位罗马神祇相当于阿瑞斯？", listOf("马尔斯", "朱庇特", "尼普顿", "伏尔甘"), "神话", "马尔斯是罗马的战争之神，直接对应于希腊神话中的阿瑞斯。"),
            es = LocalizedContent("¿Qué dios romano es equivalente a Ares?", listOf("Marte", "Júpiter", "Neptuno", "Vulcano"), "Mitología", "Marte es el dios romano de la guerra, directamente asimilado a Ares en la mitología griega.")
        ),
        BilingualQuestion(
            id = 50698, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel dieu romain est équivalent à Héphaïstos?", listOf("Mars", "Jupiter", "Vulcain", "Mercure"), "Mythologie", "Vulcain est le dieu romain du feu et de la forge, équivalent direct d'Héphaïstos dans la mythologie grecque."),
            en = LocalizedContent("Which Roman god is equivalent to Hephaestus?", listOf("Mars", "Jupiter", "Vulcan", "Mercury"), "Mythology", "Vulcan is the Roman god of fire and the forge, the direct equivalent of Hephaestus in Greek mythology."),
            zh = LocalizedContent("哪位罗马神祇相当于赫菲斯托斯？", listOf("马尔斯", "朱庇特", "伏尔甘", "墨丘利"), "神话", "伏尔甘是罗马的火与锻造之神，直接对应于希腊神话中的赫菲斯托斯。"),
            es = LocalizedContent("¿Qué dios romano es equivalente a Hefesto?", listOf("Marte", "Júpiter", "Vulcano", "Mercurio"), "Mitología", "Vulcano es el dios romano del fuego y la forja, equivalente directo de Hefesto en la mitología griega.")
        ),
        BilingualQuestion(
            id = 50699, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du chien à trois têtes qui garde les enfers dans la mythologie grecque?", listOf("Orthus", "Cerbère", "Typhon", "Chimère"), "Mythologie", "Cerbère est le chien monstrueux à trois têtes qui garde l'entrée des Enfers, empêchant les morts de s'en échapper et les vivants d'y pénétrer."),
            en = LocalizedContent("What is the name of the three-headed dog that guards the underworld in Greek mythology?", listOf("Orthrus", "Cerberus", "Typhon", "Chimera"), "Mythology", "Cerberus is the monstrous three-headed dog that guards the entrance to the Underworld, preventing the dead from escaping and the living from entering."),
            zh = LocalizedContent("在希腊神话中，看守冥界的三头犬叫什么名字？", listOf("俄耳托斯", "刻耳柏洛斯", "堤丰", "喀迈拉"), "神话", "刻耳柏洛斯是看守冥界入口的三头怪物犬，防止死者逃离和生者进入。"),
            es = LocalizedContent("¿Cuál es el nombre del perro de tres cabezas que guarda el inframundo en la mitología griega?", listOf("Ortro", "Cerbero", "Tifón", "Quimera"), "Mitología", "Cerbero es el perro monstruoso de tres cabezas que guarda la entrada al Inframundo, impidiendo que los muertos escapen y los vivos entren.")
        ),
        BilingualQuestion(
            id = 50700, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui est le fils de Poséidon et de la nymphe Thétis?", listOf("Achille", "Ajax", "Hector", "Énée"), "Mythologie", "Selon certaines versions de la mythologie grecque, Achille est le fils de Thétis, une nymphe de la mer, et non de Poséidon, mais plutôt du mortel Pélée. Cette confusion vient du lien de Thétis avec le monde marin, domaine de Poséidon."),
            en = LocalizedContent("Who is the son of Poseidon and the nymph Thetis?", listOf("Achilles", "Ajax", "Hector", "Aeneas"), "Mythology", "According to some versions of Greek mythology, Achilles is the son of Thetis, a sea nymph, and not of Poseidon, but rather of the mortal Peleus. This confusion arises from Thetis' connection to the sea, domain of Poseidon."),
            zh = LocalizedContent("谁是波塞冬和宁芙女神忒提斯的儿子？", listOf("阿喀琉斯", "埃阿斯", "赫克托耳", "埃涅阿斯"), "神话", "根据希腊神话的某些版本，阿喀琉斯是海洋宁芙忒提斯之子，而非波塞冬之子，其父是凡人珀琉斯。这种混淆源于忒提斯与海洋（波塞冬的领域）的联系。"),
            es = LocalizedContent("¿Quién es el hijo de Poseidón y la ninfa Tetis?", listOf("Aquiles", "Áyax", "Héctor", "Eneas"), "Mitología", "Según algunas versiones de la mitología griega, Aquiles es hijo de Tetis, una ninfa marina, y no de Poseidón, sino del mortal Peleo. Esta confusión proviene del vínculo de Tetis con el mar, dominio de Poseidón.")
        ),
        BilingualQuestion(
            id = 50701, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom de l'épée indestructible de Sigurd dans la mythologie scandinave?", listOf("Excalibur", "Grám", "Tyrfing", "Kusanagi"), "Mythologie", "Dans la mythologie nordique, Grám est l'épée magique et indestructible forgée par le nain Regin, que Sigurd utilise pour tuer le dragon Fáfnir."),
            en = LocalizedContent("What is the name of Sigurd's indestructible sword in Norse mythology?", listOf("Excalibur", "Gram", "Tyrfing", "Kusanagi"), "Mythology", "In Norse mythology, Gram is the magical indestructible sword forged by the dwarf Regin, which Sigurd uses to kill the dragon Fafnir."),
            zh = LocalizedContent("北欧神话中西格德那把坚不可摧的剑叫什么名字？", listOf("王者之剑", "格拉姆", "提尔锋", "草薙剑"), "神话", "在北欧神话中，格拉姆是由矮人雷金锻造的魔法剑，坚不可摧，西格德用它杀死了巨龙法夫纳。"),
            es = LocalizedContent("¿Cuál es el nombre de la espada indestructible de Sigurd en la mitología nórdica?", listOf("Excalibur", "Gram", "Tyrfing", "Kusanagi"), "Mitología", "En la mitología nórdica, Gram es la espada mágica e indestructible forjada por el enano Regin, que Sigurd usa para matar al dragón Fafnir.")
        ),
        BilingualQuestion(
            id = 50702, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a forgé l'Anneau Unique dans les contes de la Terre du Milieu?", listOf("Morgoth", "Celebrimbor", "Sauron", "Saruman"), "Mythologie", "Dans la mythologie de Tolkien, Sauron a forgé l'Anneau Unique en secret dans les flammes de la Montagne du Destin en Mordor pour asservir les peuples de la Terre du Milieu."),
            en = LocalizedContent("Who forged the One Ring in the tales of Middle-earth?", listOf("Morgoth", "Celebrimbor", "Sauron", "Saruman"), "Mythology", "In Tolkien's mythology, Sauron forged the One Ring in secret in the fires of Mount Doom in Mordor to enslave the peoples of Middle-earth."),
            zh = LocalizedContent("在中土世界的故事中，谁铸造了至尊魔戒？", listOf("魔苟斯", "凯勒布林博", "索隆", "萨鲁曼"), "神话", "在托尔金的神话中，索隆在魔多末日火山的火焰中秘密铸造了至尊魔戒，以奴役中土世界的各族人民。"),
            es = LocalizedContent("¿Quién forjó el Anillo Único en los cuentos de la Tierra Media?", listOf("Morgoth", "Celebrimbor", "Sauron", "Saruman"), "Mitología", "En la mitología de Tolkien, Sauron forjó el Anillo Único en secreto en los fuegos del Monte del Destino en Mordor para esclavizar a los pueblos de la Tierra Media.")
        ),
        BilingualQuestion(
            id = 50703, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom de la créature qui garde l'Arbre de la Vie dans la mythologie nordique?", listOf("Nidhogg", "Jörmungandr", "Sköll", "Hati"), "Mythologie", "Dans la mythologie nordique, Nidhogg est un dragon ou serpent qui ronge les racines d'Yggdrasil, l'Arbre de Vie, symbolisant la destruction et le renouveau."),
            en = LocalizedContent("What is the name of the creature that guards the Tree of Life in Norse mythology?", listOf("Nidhogg", "Jörmungandr", "Sköll", "Hati"), "Mythology", "In Norse mythology, Nidhogg is a dragon or serpent that gnaws at the roots of Yggdrasil, the Tree of Life, symbolizing destruction and renewal."),
            zh = LocalizedContent("在北欧神话中，守护生命之树的生物叫什么名字？", listOf("尼德霍格", "耶梦加得", "斯库尔", "哈提"), "神话", "在北欧神话中，尼德霍格是一条龙或巨蛇，啃噬世界树尤克特拉希尔的树根，象征着毁灭与重生。"),
            es = LocalizedContent("¿Cuál es el nombre de la criatura que guarda el Árbol de la Vida en la mitología nórdica?", listOf("Nidhogg", "Jörmungandr", "Sköll", "Hati"), "Mitología", "En la mitología nórdica, Nidhogg es un dragón o serpiente que roe las raíces de Yggdrasil, el Árbol de la Vida, simbolizando la destrucción y el renacimiento.")
        ),
        BilingualQuestion(
            id = 50704, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui est le premier homme créé dans la mythologie grecque?", listOf("Prometheus", "Épiméthée", "Deucalion", "Prométhée"), "Mythologie", "Dans la mythologie grecque, Prométhée a façonné le premier homme à partir d'argile et d'eau, puis lui a offert le feu, défiant ainsi Zeus."),
            en = LocalizedContent("Who is the first man created in Greek mythology?", listOf("Prometheus", "Epimetheus", "Deucalion", "Prometheus"), "Mythology", "In Greek mythology, Prometheus shaped the first man from clay and water, then gave him fire, defying Zeus."),
            zh = LocalizedContent("希腊神话中第一个被创造的人是谁？", listOf("普罗米修斯", "厄庇墨透斯", "丢卡利翁", "普罗米修斯"), "神话", "在希腊神话中，普罗米修斯用泥土和水塑造了第一个男人，然后赐予他火种，从而违抗了宙斯。"),
            es = LocalizedContent("¿Quién es el primer hombre creado en la mitología griega?", listOf("Prometeo", "Epimeteo", "Deucalión", "Prometeo"), "Mitología", "En la mitología griega, Prometeo moldeó al primer hombre con arcilla y agua, y luego le dio el fuego, desafiando a Zeus.")
        ),
        BilingualQuestion(
            id = 50705, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel Titan a volé le feu pour l'humanité?", listOf("Océanos", "Japet", "Prométhée", "Cronos"), "Mythologie", "Prométhée a dérobé le feu aux dieux de l'Olympe pour le donner aux humains, défiant ainsi Zeus. Pour le punir, il fut enchaîné à un rocher où un aigle lui dévorait le foie chaque jour."),
            en = LocalizedContent("Which Titan stole fire for humanity?", listOf("Oceanus", "Iapetus", "Prometheus", "Cronus"), "Mythology", "Prometheus stole fire from the gods of Olympus to give it to humans, defying Zeus. As punishment, he was chained to a rock where an eagle devoured his liver every day."),
            zh = LocalizedContent("哪位泰坦为人类盗取了火种？", listOf("俄刻阿诺斯", "伊阿珀托斯", "普罗米修斯", "克洛诺斯"), "神话", "普罗米修斯从奥林匹斯众神那里盗取火种送给人类，违抗了宙斯。作为惩罚，他被锁在岩石上，每天被一只鹰啄食肝脏。"),
            es = LocalizedContent("¿Qué Titán robó el fuego para la humanidad?", listOf("Océano", "Jápeto", "Prometeo", "Crono"), "Mitología", "Prometeo robó el fuego de los dioses del Olimpo para dárselo a los humanos, desafiando a Zeus. Como castigo, fue encadenado a una roca donde un águila le devoraba el hígado cada día.")
        ),
        BilingualQuestion(
            id = 50706, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom de la coupe sacrée dans la légende arthurienne?", listOf("Cauldron", "Saint Graal", "Calice", "Gobelet"), "Mythologie", "Le Saint Graal est la coupe utilisée par Jésus lors de la Cène, devenue un objet de quête mystique dans les récits du cycle arthurien."),
            en = LocalizedContent("What is the name of the sacred cup in Arthurian legend?", listOf("Cauldron", "Holy Grail", "Chalice", "Goblet"), "Mythology", "The Holy Grail is the cup used by Jesus at the Last Supper, which became an object of mystical quest in the stories of the Arthurian cycle."),
            zh = LocalizedContent("亚瑟王传说中圣杯的名字是什么？", listOf("大锅", "圣杯", "圣爵", "高脚杯"), "神话", "圣杯是耶稣在最后的晚餐中使用的杯子，在亚瑟王系列故事中成为神秘追寻的对象。"),
            es = LocalizedContent("¿Cuál es el nombre de la copa sagrada en la leyenda artúrica?", listOf("Caldero", "Santo Grial", "Cáliz", "Copa"), "Mitología", "El Santo Grial es la copa utilizada por Jesús en la Última Cena, convertida en objeto de búsqueda mística en los relatos del ciclo artúrico.")
        ),
        BilingualQuestion(
            id = 50707, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est le roi légendaire britannique qui portait Excalibur?", listOf("Merlin", "Lancelot", "Arthur", "Guenevière"), "Mythologie", "Excalibur est l'épée légendaire du roi Arthur, figure centrale des récits médiévaux de la Table Ronde et de la quête du Graal."),
            en = LocalizedContent("Who is the legendary British king who wielded Excalibur?", listOf("Merlin", "Lancelot", "Arthur", "Guinevere"), "Mythology", "Excalibur is the legendary sword of King Arthur, central figure of medieval tales of the Round Table and the quest for the Grail."),
            zh = LocalizedContent("哪位传奇的英国国王持有王者之剑？", listOf("梅林", "兰斯洛特", "亚瑟", "桂妮薇儿"), "神话", "王者之剑是亚瑟王的传奇宝剑，亚瑟王是圆桌骑士和圣杯追寻的中世纪故事的核心人物。"),
            es = LocalizedContent("¿Quién es el legendario rey británico que portaba Excalibur?", listOf("Merlín", "Lancelot", "Arturo", "Ginebra"), "Mitología", "Excalibur es la espada legendaria del rey Arturo, figura central de los relatos medievales de la Mesa Redonda y la búsqueda del Grial.")
        ),
        BilingualQuestion(
            id = 50708, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du magicien dans la légende arthurienne?", listOf("Mordred", "Merlin", "Gareth", "Bedivere"), "Mythologie", "Merlin est le célèbre enchanteur et conseiller du roi Arthur, personnage central des légendes arthuriennes issues de la littérature médiévale."),
            en = LocalizedContent("What is the name of the wizard in Arthurian legend?", listOf("Mordred", "Merlin", "Gareth", "Bedivere"), "Mythology", "Merlin is the famous enchanter and advisor to King Arthur, a central character in Arthurian legends from medieval literature."),
            zh = LocalizedContent("亚瑟王传说中魔法师的名字是什么？", listOf("莫德雷德", "梅林", "加雷斯", "贝德维尔"), "神话", "梅林是著名的魔法师和亚瑟王的顾问，是中世纪文学中亚瑟王传说的核心人物。"),
            es = LocalizedContent("¿Cuál es el nombre del mago en la leyenda artúrica?", listOf("Mordred", "Merlín", "Gareth", "Bedivere"), "Mitología", "Merlín es el famoso encantador y consejero del rey Arturo, personaje central de las leyendas artúricas de la literatura medieval.")
        ),
        BilingualQuestion(
            id = 50709, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui est la reine des fées dans la légende arthurienne?", listOf("Guenièvre", "Morgane", "Viviane", "Guinevere"), "Mythologie", "Dans la légende arthurienne, Viviane, aussi appelée la Dame du Lac, est la souveraine des fées et la protectrice d'Excalibur."),
            en = LocalizedContent("Who is the fairy queen in Arthurian legend?", listOf("Guinevere", "Morgan", "Viviane", "Guinevere"), "Mythology", "In Arthurian legend, Viviane, also called the Lady of the Lake, is the sovereign of the fairies and the protector of Excalibur."),
            zh = LocalizedContent("亚瑟王传说中仙女女王是谁？", listOf("桂妮薇儿", "摩根", "薇薇安", "桂妮薇儿"), "神话", "在亚瑟王传说中，薇薇安，也被称为湖中仙女，是仙女的统治者，也是王者之剑的保护者。"),
            es = LocalizedContent("¿Quién es la reina de las hadas en la leyenda artúrica?", listOf("Ginebra", "Morgana", "Viviana", "Ginebra"), "Mitología", "En la leyenda artúrica, Viviana, también llamada la Dama del Lago, es la soberana de las hadas y la protectora de Excalibur.")
        ),
        BilingualQuestion(
            id = 50710, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom du cheval blanc du Roi Arthur?", listOf("Llamrei", "Kaliburn", "Escalibur", "Morvran"), "Mythologie", "Llamrei est le nom de la jument blanche du Roi Arthur dans la légende arthurienne, souvent mentionnée dans les textes médiévaux gallois."),
            en = LocalizedContent("What is the name of King Arthur's white horse?", listOf("Llamrei", "Kaliburn", "Escalibur", "Morvran"), "Mythology", "Llamrei is the name of King Arthur's white mare in Arthurian legend, often mentioned in medieval Welsh texts."),
            zh = LocalizedContent("亚瑟王的白马叫什么名字？", listOf("拉姆雷", "卡利伯恩", "埃斯卡利伯", "莫尔夫兰"), "神话", "拉姆雷是亚瑟王传说中亚瑟王的白色母马的名字，常在中世纪威尔士文本中被提及。"),
            es = LocalizedContent("¿Cuál es el nombre del caballo blanco del Rey Arturo?", listOf("Llamrei", "Kaliburn", "Escalibur", "Morvran"), "Mitología", "Llamrei es el nombre de la yegua blanca del Rey Arturo en la leyenda artúrica, a menudo mencionada en textos galeses medievales.")
        ),
        BilingualQuestion(
            id = 50711, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est le fils caché du Roi Arthur?", listOf("Lancelot", "Gareth", "Mordred", "Bedivere"), "Mythologie", "Mordred est le fils illégitime d'Arthur et de sa demi-sœur Morgane, conçu par tromperie. Sa naissance est souvent liée à la prophétie de la chute du royaume de Camelot."),
            en = LocalizedContent("Who is King Arthur's hidden son?", listOf("Lancelot", "Gareth", "Mordred", "Bedivere"), "Mythology", "Mordred is Arthur's illegitimate son by his half-sister Morgan, conceived through deception. His birth is often linked to the prophecy of Camelot's fall."),
            zh = LocalizedContent("亚瑟王的秘密儿子是谁？", listOf("兰斯洛特", "加雷斯", "莫德雷德", "贝德维尔"), "神话", "莫德雷德是亚瑟王与其同母异父的姐姐摩根通过欺骗所生的私生子。他的出生常与卡美洛特覆灭的预言相关。"),
            es = LocalizedContent("¿Quién es el hijo oculto del Rey Arturo?", listOf("Lancelot", "Gareth", "Mordred", "Bedivere"), "Mitología", "Mordred es el hijo ilegítimo de Arturo y su media hermana Morgana, concebido mediante engaño. Su nacimiento suele estar vinculado a la profecía de la caída de Camelot.")
        ),
        BilingualQuestion(
            id = 50712, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom du château du Roi Arthur?", listOf("Tintagel", "Avalon", "Camelot", "Badon"), "Mythologie", "Camelot est le château légendaire du roi Arthur, mentionné pour la première fois dans les romans de chevalerie du XIIe siècle, notamment par Chrétien de Troyes."),
            en = LocalizedContent("What is the name of King Arthur's castle?", listOf("Tintagel", "Avalon", "Camelot", "Badon"), "Mythology", "Camelot is the legendary castle of King Arthur, first mentioned in 12th-century chivalric romances, notably by Chrétien de Troyes."),
            zh = LocalizedContent("亚瑟王的城堡叫什么名字？", listOf("廷塔杰尔", "阿瓦隆", "卡美洛特", "巴顿"), "神话", "卡美洛特是亚瑟王的传奇城堡，最早出现在12世纪的骑士传奇中，尤其是克雷蒂安·德·特罗亚的作品。"),
            es = LocalizedContent("¿Cuál es el nombre del castillo del Rey Arturo?", listOf("Tintagel", "Avalón", "Camelot", "Badon"), "Mitología", "Camelot es el castillo legendario del rey Arturo, mencionado por primera vez en las novelas de caballería del siglo XII, especialmente por Chrétien de Troyes.")
        ),
        BilingualQuestion(
            id = 50713, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom de l'île légendaire où Arthur se retira?", listOf("Avalon", "Atlantis", "Lemuria", "Mu"), "Mythologie", "Dans la légende arthurienne, Avalon est l'île magique où le roi Arthur fut emmené après sa dernière bataille pour y être soigné, avant son éventuel retour."),
            en = LocalizedContent("What is the name of the legendary island where Arthur retired?", listOf("Avalon", "Atlantis", "Lemuria", "Mu"), "Mythology", "In Arthurian legend, Avalon is the magical island where King Arthur was taken after his final battle to be healed, before his eventual return."),
            zh = LocalizedContent("亚瑟王退隐的传奇岛屿叫什么名字？", listOf("阿瓦隆", "亚特兰蒂斯", "利莫里亚", "姆大陆"), "神话", "在亚瑟王传说中，阿瓦隆是亚瑟王在最后一战后被带去疗伤的魔法岛屿，之后他将归来。"),
            es = LocalizedContent("¿Cuál es el nombre de la isla legendaria donde se retiró Arturo?", listOf("Avalón", "Atlántida", "Lemuria", "Mu"), "Mitología", "En la leyenda artúrica, Avalón es la isla mágica donde el rey Arturo fue llevado después de su última batalla para ser curado, antes de su eventual regreso.")
        ),
        BilingualQuestion(
            id = 50714, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a tué le dragon Fafnir dans la mythologie scandinave?", listOf("Beowulf", "Sigurd", "Starkad", "Halvdan"), "Mythologie", "Sigurd, héros de la mythologie nordique, tua le dragon Fafnir avec son épée Gram après avoir creusé une fosse et l'avoir transpercé par en dessous."),
            en = LocalizedContent("Who killed the dragon Fafnir in Scandinavian mythology?", listOf("Beowulf", "Sigurd", "Starkad", "Halvdan"), "Mythology", "Sigurd, hero of Norse mythology, killed the dragon Fafnir with his sword Gram after digging a pit and stabbing it from below."),
            zh = LocalizedContent("在斯堪的纳维亚神话中，谁杀死了龙法夫尼尔？", listOf("贝奥武夫", "西格德", "斯塔卡德", "哈尔夫丹"), "神话", "西格德是北欧神话中的英雄，他用剑格拉姆挖了一个坑，从下方刺死了龙法夫尼尔。"),
            es = LocalizedContent("¿Quién mató al dragón Fafnir en la mitología escandinava?", listOf("Beowulf", "Sigurd", "Starkad", "Halvdan"), "Mitología", "Sigurd, héroe de la mitología nórdica, mató al dragón Fafnir con su espada Gram tras cavar un foso y atravesarlo desde abajo.")
        ),
        BilingualQuestion(
            id = 50715, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel dieu est le gardien du pont arc-en-ciel dans la mythologie scandinave?", listOf("Odin", "Thor", "Heimdall", "Tyr"), "Mythologie", "Heimdall est le dieu gardien du Bifröst, le pont arc-en-ciel reliant Midgard à Asgard. Il possède une ouïe et une vue exceptionnelles pour surveiller l'arrivée des géants."),
            en = LocalizedContent("Which god is the guardian of the rainbow bridge in Scandinavian mythology?", listOf("Odin", "Thor", "Heimdall", "Tyr"), "Mythology", "Heimdall is the god who guards Bifröst, the rainbow bridge connecting Midgard to Asgard. He has exceptional hearing and sight to watch for the arrival of giants."),
            zh = LocalizedContent("在斯堪的纳维亚神话中，哪位神是彩虹桥的守护者？", listOf("奥丁", "索尔", "海姆达尔", "提尔"), "神话", "海姆达尔是守护比弗罗斯特（连接中庭和阿斯加德的彩虹桥）的神。他拥有非凡的听觉和视觉，以监视巨人的到来。"),
            es = LocalizedContent("¿Qué dios es el guardián del puente arcoíris en la mitología escandinava?", listOf("Odín", "Thor", "Heimdall", "Tyr"), "Mitología", "Heimdall es el dios guardián del Bifröst, el puente arcoíris que conecta Midgard con Asgard. Posee un oído y una vista excepcionales para vigilar la llegada de los gigantes.")
        ),
    )

    private fun part3(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 50716, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui est le géant de feu dans la mythologie scandinave?", listOf("Loki", "Surt", "Ymir", "Thrym"), "Mythologie", "Surt est le géant de feu qui, selon la mythologie nordique, doit mettre le feu au monde lors du Ragnarök, la fin des temps."),
            en = LocalizedContent("Who is the fire giant in Norse mythology?", listOf("Loki", "Surtr", "Ymir", "Thrym"), "Mythology", "Surtr is the fire giant who, according to Norse mythology, will set the world on fire during Ragnarök, the end of times."),
            zh = LocalizedContent("北欧神话中的火巨人是谁？", listOf("洛基", "苏尔特尔", "尤弥尔", "索列姆"), "神话", "苏尔特尔是火巨人，根据北欧神话，他将在诸神黄昏（世界末日）时点燃世界。"),
            es = LocalizedContent("¿Quién es el gigante de fuego en la mitología nórdica?", listOf("Loki", "Surtr", "Ymir", "Thrym"), "Mitología", "Surtr es el gigante de fuego que, según la mitología nórdica, incendiará el mundo durante el Ragnarök, el fin de los tiempos.")
        ),
        BilingualQuestion(
            id = 50717, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom de la fin du monde dans la mythologie scandinave?", listOf("Götterdämmerung", "Ragnarok", "Yule", "Asgard"), "Mythologie", "Dans la mythologie nordique, le Ragnarök désigne la série d'événements apocalyptiques incluant une grande bataille et la destruction du monde, suivie de sa renaissance."),
            en = LocalizedContent("What is the name of the end of the world in Norse mythology?", listOf("Götterdämmerung", "Ragnarok", "Yule", "Asgard"), "Mythology", "In Norse mythology, Ragnarök refers to the series of apocalyptic events including a great battle and the destruction of the world, followed by its rebirth."),
            zh = LocalizedContent("北欧神话中世界末日的名称是什么？", listOf("诸神的黄昏", "诸神黄昏", "尤尔", "阿斯加德"), "神话", "在北欧神话中，诸神黄昏指的是一系列 apocalyptic 事件，包括一场大战和世界的毁灭，随后是重生。"),
            es = LocalizedContent("¿Cuál es el nombre del fin del mundo en la mitología nórdica?", listOf("Götterdämmerung", "Ragnarok", "Yule", "Asgard"), "Mitología", "En la mitología nórdica, Ragnarök se refiere a la serie de eventos apocalípticos que incluyen una gran batalla y la destrucción del mundo, seguida de su renacimiento.")
        ),
        BilingualQuestion(
            id = 50718, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé le monde à partir de son corps dans la mythologie scandinave?", listOf("Odin", "Loki", "Ymir", "Surtr"), "Mythologie", "Dans la mythologie scandinave, le géant primordial Ymir est tué par Odin et ses frères, qui utilisent son corps pour façonner le monde : sa chair devient la terre, son sang les océans, et ses os les montagnes."),
            en = LocalizedContent("Who created the world from his body in Norse mythology?", listOf("Odin", "Loki", "Ymir", "Surtr"), "Mythology", "In Norse mythology, the primordial giant Ymir is killed by Odin and his brothers, who use his body to shape the world: his flesh becomes the earth, his blood the oceans, and his bones the mountains."),
            zh = LocalizedContent("北欧神话中谁用自己的身体创造了世界？", listOf("奥丁", "洛基", "尤弥尔", "苏尔特尔"), "神话", "在北欧神话中，原始巨人尤弥尔被奥丁和他的兄弟杀死，他们用他的身体塑造了世界：他的肉变成大地，血变成海洋，骨头变成山脉。"),
            es = LocalizedContent("¿Quién creó el mundo a partir de su cuerpo en la mitología nórdica?", listOf("Odín", "Loki", "Ymir", "Surtr"), "Mitología", "En la mitología nórdica, el gigante primordial Ymir es asesinado por Odín y sus hermanos, quienes usan su cuerpo para dar forma al mundo: su carne se convierte en la tierra, su sangre en los océanos y sus huesos en las montañas.")
        ),
        BilingualQuestion(
            id = 50719, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom du loup qui dévore le soleil dans la mythologie scandinave?", listOf("Sköll", "Hati", "Jörmungandr", "Fenrir"), "Mythologie", "Dans la mythologie nordique, Sköll est le loup qui poursuit le Soleil (Sól) et finira par le dévorer lors du Ragnarök."),
            en = LocalizedContent("What is the name of the wolf that devours the sun in Norse mythology?", listOf("Sköll", "Hati", "Jörmungandr", "Fenrir"), "Mythology", "In Norse mythology, Sköll is the wolf that chases the Sun (Sól) and will eventually devour it during Ragnarök."),
            zh = LocalizedContent("北欧神话中吞噬太阳的狼叫什么名字？", listOf("斯库尔", "哈提", "耶梦加得", "芬里尔"), "神话", "在北欧神话中，斯库尔是追逐太阳（苏尔）的狼，最终将在诸神黄昏时吞噬它。"),
            es = LocalizedContent("¿Cuál es el nombre del lobo que devora el sol en la mitología nórdica?", listOf("Sköll", "Hati", "Jörmungandr", "Fenrir"), "Mitología", "En la mitología nórdica, Sköll es el lobo que persigue al Sol (Sól) y finalmente lo devorará durante el Ragnarök.")
        ),
        BilingualQuestion(
            id = 50720, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel dieu grec a été transformé en serpent?", listOf("Hermès", "Poséidon", "Hadès", "Arès"), "Mythologie", "Dans la mythologie grecque, Hermès a été transformé en serpent pour échapper à un géant lors de la Gigantomachie."),
            en = LocalizedContent("Which Greek god was transformed into a serpent?", listOf("Hermes", "Poseidon", "Hades", "Ares"), "Mythology", "In Greek mythology, Hermes was transformed into a serpent to escape a giant during the Gigantomachy."),
            zh = LocalizedContent("哪位希腊神祇被变成了蛇？", listOf("赫尔墨斯", "波塞冬", "哈迪斯", "阿瑞斯"), "神话", "在希腊神话中，赫尔墨斯在巨人之战中变成蛇以躲避巨人。"),
            es = LocalizedContent("¿Qué dios griego fue transformado en serpiente?", listOf("Hermes", "Poseidón", "Hades", "Ares"), "Mitología", "En la mitología griega, Hermes fue transformado en serpiente para escapar de un gigante durante la Gigantomaquia.")
        ),
        BilingualQuestion(
            id = 50721, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plat national de la France?", listOf("Coq au vin", "Pot-au-feu", "Crêpes", "Bouillabaisse"), "Gastronomie", "Le pot-au-feu est considéré comme le plat national français en raison de son histoire populaire et de sa présence dans toutes les régions, bien que la France n'ait pas de plat officiel."),
            en = LocalizedContent("What is the national dish of France?", listOf("Coq au vin", "Pot-au-feu", "Crêpes", "Bouillabaisse"), "Gastronomy", "Pot-au-feu is considered the French national dish due to its popular history and presence in all regions, although France has no official dish."),
            zh = LocalizedContent("法国的国菜是什么？", listOf("红酒炖鸡", "蔬菜牛肉浓汤", "可丽饼", "马赛鱼汤"), "美食", "蔬菜牛肉浓汤被认为是法国的国菜，因为它有着悠久的历史并在所有地区都很常见，尽管法国没有官方指定的国菜。"),
            es = LocalizedContent("¿Cuál es el plato nacional de Francia?", listOf("Coq au vin", "Pot-au-feu", "Crêpes", "Bouillabaisse"), "Gastronomía", "El pot-au-feu se considera el plato nacional francés debido a su historia popular y su presencia en todas las regiones, aunque Francia no tiene un plato oficial.")
        ),
        BilingualQuestion(
            id = 50722, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plat national de l'Italie?", listOf("Pizza", "Pâtes", "Risotto", "Osso buco"), "Gastronomie", "La pizza, notamment la margherita aux couleurs du drapeau italien, est reconnue mondialement comme le plat emblématique de l'Italie, originaire de Naples."),
            en = LocalizedContent("What is the national dish of Italy?", listOf("Pizza", "Pasta", "Risotto", "Osso buco"), "Gastronomy", "Pizza, especially margherita with the colors of the Italian flag, is globally recognized as Italy's emblematic dish, originating from Naples."),
            zh = LocalizedContent("意大利的国菜是什么？", listOf("披萨", "意面", "烩饭", "炖小牛膝"), "美食", "披萨，尤其是带有意大利国旗颜色的玛格丽特披萨，被全球公认为意大利的标志性菜肴，起源于那不勒斯。"),
            es = LocalizedContent("¿Cuál es el plato nacional de Italia?", listOf("Pizza", "Pasta", "Risotto", "Osso buco"), "Gastronomía", "La pizza, especialmente la margherita con los colores de la bandera italiana, es reconocida mundialmente como el plato emblemático de Italia, originario de Nápoles.")
        ),
        BilingualQuestion(
            id = 50723, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plat national de la Suisse?", listOf("Fondue", "Raclette", "Rösti", "Schnitzel"), "Gastronomie", "La fondue au fromage est souvent considérée comme le plat national suisse, bien que la Suisse n'ait pas de plat officiel, car elle symbolise la convivialité et les traditions alpines."),
            en = LocalizedContent("What is the national dish of Switzerland?", listOf("Fondue", "Raclette", "Rösti", "Schnitzel"), "Gastronomy", "Cheese fondue is often considered the Swiss national dish, although Switzerland has no official dish, as it symbolizes conviviality and Alpine traditions."),
            zh = LocalizedContent("瑞士的国菜是什么？", listOf("奶酪火锅", "拉克莱特", "土豆饼", "炸肉排"), "美食", "奶酪火锅常被认为是瑞士的国菜，尽管瑞士没有官方指定的国菜，因为它象征着友好和阿尔卑斯传统。"),
            es = LocalizedContent("¿Cuál es el plato nacional de Suiza?", listOf("Fondue", "Raclette", "Rösti", "Schnitzel"), "Gastronomía", "La fondue de queso se considera a menudo el plato nacional suizo, aunque Suiza no tiene un plato oficial, ya que simboliza la convivialidad y las tradiciones alpinas.")
        ),
        BilingualQuestion(
            id = 50726, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plat national du Japon?", listOf("Sushi", "Ramen", "Tempura", "Yakitori"), "Gastronomie", "Le sushi est considéré comme le plat national du Japon en raison de sa popularité mondiale et de son lien profond avec la culture culinaire japonaise, bien que d'autres plats comme le ramen ou le curry soient aussi très consommés."),
            en = LocalizedContent("What is the national dish of Japan?", listOf("Sushi", "Ramen", "Tempura", "Yakitori"), "Gastronomy", "Sushi is considered the national dish of Japan due to its global popularity and deep connection to Japanese culinary culture, although other dishes like ramen or curry are also widely consumed."),
            zh = LocalizedContent("日本的国菜是什么？", listOf("寿司", "拉面", "天妇罗", "烤鸡肉串"), "美食", "寿司被认为是日本的国菜，因为它全球流行且与日本饮食文化紧密相连，尽管拉面或咖喱等其他菜肴也很常见。"),
            es = LocalizedContent("¿Cuál es el plato nacional de Japón?", listOf("Sushi", "Ramen", "Tempura", "Yakitori"), "Gastronomía", "El sushi se considera el plato nacional de Japón debido a su popularidad mundial y su profunda conexión con la cultura culinaria japonesa, aunque otros platos como el ramen o el curry también se consumen ampliamente.")
        ),
        BilingualQuestion(
            id = 50728, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plat national de l'Inde?", listOf("Tikka Masala", "Biryani", "Samosas", "Dhal"), "Gastronomie", "Le Biryani est considéré comme le plat national de l'Inde en raison de sa popularité à travers le pays, mêlant riz, épices et viande ou légumes dans une préparation emblématique de la cuisine indienne."),
            en = LocalizedContent("What is the national dish of India?", listOf("Tikka Masala", "Biryani", "Samosas", "Dal"), "Gastronomy", "Biryani is considered the national dish of India due to its popularity across the country, blending rice, spices, and meat or vegetables in an emblematic preparation of Indian cuisine."),
            zh = LocalizedContent("印度的国菜是什么？", listOf("咖喱鸡", "印度香饭", "萨摩萨", "豆汤"), "美食", "印度香饭被认为是印度的国菜，因为它在全国各地都很受欢迎，将米饭、香料和肉类或蔬菜混合在一起，是印度美食的标志性菜肴。"),
            es = LocalizedContent("¿Cuál es el plato nacional de la India?", listOf("Tikka Masala", "Biryani", "Samosas", "Dal"), "Gastronomía", "El biryani se considera el plato nacional de la India debido a su popularidad en todo el país, combinando arroz, especias y carne o verduras en una preparación emblemática de la cocina india.")
        ),
        BilingualQuestion(
            id = 50729, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plat national de la Grèce?", listOf("Moussaka", "Souvlaki", "Feta", "Salade grecque"), "Gastronomie", "La moussaka est un plat traditionnel grec à base d'aubergines, de viande hachée et de béchamel, souvent considéré comme le plat national du pays."),
            en = LocalizedContent("What is the national dish of Greece?", listOf("Moussaka", "Souvlaki", "Feta", "Greek salad"), "Gastronomy", "Moussaka is a traditional Greek dish made with eggplant, minced meat, and béchamel sauce, often considered the national dish of the country."),
            zh = LocalizedContent("希腊的国菜是什么？", listOf("慕萨卡", "苏夫拉基", "菲达奶酪", "希腊沙拉"), "美食", "慕萨卡是一道传统的希腊菜，由茄子、碎肉和白酱制成，常被视为该国的国菜。"),
            es = LocalizedContent("¿Cuál es el plato nacional de Grecia?", listOf("Moussaka", "Souvlaki", "Feta", "Ensalada griega"), "Gastronomía", "La moussaka es un plato tradicional griego hecho con berenjenas, carne picada y bechamel, a menudo considerado el plato nacional del país.")
        ),
        BilingualQuestion(
            id = 50731, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fromage français est le plus célèbre?", listOf("Camembert", "Roquefort", "Brie", "Comté"), "Gastronomie", "Le camembert, originaire de Normandie, est l’un des fromages les plus emblématiques de France, reconnu mondialement pour sa texture crémeuse et son goût distinctif."),
            en = LocalizedContent("Which French cheese is the most famous?", listOf("Camembert", "Roquefort", "Brie", "Comté"), "Gastronomy", "Camembert, originating from Normandy, is one of the most emblematic cheeses of France, recognized worldwide for its creamy texture and distinctive taste."),
            zh = LocalizedContent("哪种法国奶酪最著名？", listOf("卡门贝尔", "罗克福", "布里", "孔泰"), "美食", "卡门贝尔奶酪原产于诺曼底，是法国最具代表性的奶酪之一，以其奶油质地和独特风味享誉全球。"),
            es = LocalizedContent("¿Qué queso francés es el más famoso?", listOf("Camembert", "Roquefort", "Brie", "Comté"), "Gastronomía", "El camembert, originario de Normandía, es uno de los quesos más emblemáticos de Francia, reconocido mundialmente por su textura cremosa y su sabor distintivo.")
        ),
        BilingualQuestion(
            id = 50732, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel vin français est le plus prestigieux?", listOf("Bordeaux", "Bourgogne", "Champagne", "Loire"), "Gastronomie", "Le Champagne est souvent considéré comme le vin français le plus prestigieux en raison de son appellation d'origine contrôlée, de son histoire liée au luxe et aux célébrations, et de sa reconnaissance mondiale comme symbole d'excellence."),
            en = LocalizedContent("Which French wine is the most prestigious?", listOf("Bordeaux", "Burgundy", "Champagne", "Loire"), "Gastronomy", "Champagne is often considered the most prestigious French wine due to its controlled appellation of origin, its history linked to luxury and celebrations, and its global recognition as a symbol of excellence."),
            zh = LocalizedContent("哪种法国葡萄酒最负盛名？", listOf("波尔多", "勃艮第", "香槟", "卢瓦尔"), "美食", "香槟常被视为最负盛名的法国葡萄酒，因其受控的原产地命名、与奢华和庆典相关的历史，以及作为卓越象征的全球认可。"),
            es = LocalizedContent("¿Qué vino francés es el más prestigioso?", listOf("Burdeos", "Borgoña", "Champán", "Loira"), "Gastronomía", "El champán se considera a menudo el vino francés más prestigioso debido a su denominación de origen controlada, su historia ligada al lujo y las celebraciones, y su reconocimiento mundial como símbolo de excelencia.")
        ),
        BilingualQuestion(
            id = 50733, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plat français le plus classique?", listOf("Crêpes", "Croissant", "Baguette", "Coq au vin"), "Gastronomie", "Le coq au vin est un ragoût de poulet mijoté dans du vin rouge, souvent associé à la cuisine française traditionnelle et rustique."),
            en = LocalizedContent("What is the most classic French dish?", listOf("Crêpes", "Croissant", "Baguette", "Coq au vin"), "Gastronomy", "Coq au vin is a chicken stew braised in red wine, often associated with traditional and rustic French cuisine."),
            zh = LocalizedContent("最经典的法式菜肴是什么？", listOf("可丽饼", "羊角面包", "法棍面包", "红酒炖鸡"), "美食", "红酒炖鸡是一道用红酒炖煮的鸡肉菜肴，常与传统和质朴的法式烹饪相关联。"),
            es = LocalizedContent("¿Cuál es el plato francés más clásico?", listOf("Crepes", "Croissant", "Baguette", "Coq au vin"), "Gastronomía", "El coq au vin es un guiso de pollo cocido a fuego lento en vino tinto, a menudo asociado con la cocina francesa tradicional y rústica.")
        ),
        BilingualQuestion(
            id = 50734, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le gâteau français le plus connu?", listOf("Mille-feuille", "Éclair", "Macaron", "Madeleine"), "Gastronomie", "L'éclair, avec sa pâte à choux et son glaçage, est un classique des pâtisseries françaises, reconnu mondialement pour sa simplicité et son élégance."),
            en = LocalizedContent("What is the most famous French cake?", listOf("Mille-feuille", "Éclair", "Macaron", "Madeleine"), "Gastronomy", "The éclair, with its choux pastry and icing, is a classic of French patisserie, recognized worldwide for its simplicity and elegance."),
            zh = LocalizedContent("最著名的法式蛋糕是什么？", listOf("千层酥", "闪电泡芙", "马卡龙", "玛德琳"), "美食", "闪电泡芙以其泡芙面团和糖霜，是法式甜点的经典，因其简洁和优雅而享誉全球。"),
            es = LocalizedContent("¿Cuál es el pastel francés más famoso?", listOf("Milhojas", "Éclair", "Macaron", "Madeleine"), "Gastronomía", "El éclair, con su masa de choux y glaseado, es un clásico de la pastelería francesa, reconocido mundialmente por su simplicidad y elegancia.")
        ),
        BilingualQuestion(
            id = 50735, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le dessert français le plus traditionnel?", listOf("Tarte Tatin", "Crème brûlée", "Mousse au chocolat", "Profiteroles"), "Gastronomie", "La tarte Tatin est un classique de la pâtisserie française, née par accident à la fin du XIXe siècle à l'hôtel Tatin de Lamotte-Beuvron, où les sœurs Tatin ont caramélisé des pommes avant de les recouvrir de pâte."),
            en = LocalizedContent("What is the most traditional French dessert?", listOf("Tarte Tatin", "Crème brûlée", "Chocolate mousse", "Profiteroles"), "Gastronomy", "Tarte Tatin is a classic of French pastry, born by accident at the end of the 19th century at the Tatin hotel in Lamotte-Beuvron, where the Tatin sisters caramelized apples before covering them with dough."),
            zh = LocalizedContent("最传统的法式甜点是什么？", listOf("塔坦苹果挞", "焦糖布丁", "巧克力慕斯", "泡芙塔"), "美食", "塔坦苹果挞是法式甜点的经典，诞生于19世纪末拉莫特-伯夫龙的塔坦酒店，塔坦姐妹意外地将苹果焦糖化后再盖上酥皮。"),
            es = LocalizedContent("¿Cuál es el postre francés más tradicional?", listOf("Tarta Tatin", "Crème brûlée", "Mousse de chocolate", "Profiteroles"), "Gastronomía", "La tarta Tatin es un clásico de la pastelería francesa, nacida por accidente a finales del siglo XIX en el hotel Tatin de Lamotte-Beuvron, donde las hermanas Tatin caramelizaron manzanas antes de cubrirlas con masa.")
        ),
        BilingualQuestion(
            id = 50736, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le fromage Italien le plus célèbre?", listOf("Parmesan", "Mozzarella", "Gorgonzola", "Ricotta"), "Gastronomie", "La mozzarella est le fromage italien le plus célèbre grâce à sa polyvalence, notamment dans les pizzas et salades, et à sa production artisanale à base de lait de bufflonne."),
            en = LocalizedContent("Which Italian cheese is the most famous?", listOf("Parmesan", "Mozzarella", "Gorgonzola", "Ricotta"), "Gastronomy", "Mozzarella is the most famous Italian cheese thanks to its versatility, especially in pizzas and salads, and its artisanal production using buffalo milk."),
            zh = LocalizedContent("哪种意大利奶酪最著名？", listOf("帕玛森", "马苏里拉", "戈贡佐拉", "里科塔"), "美食", "马苏里拉是最著名的意大利奶酪，因其多功能性，尤其在披萨和沙拉中的使用，以及使用水牛奶的手工制作工艺。"),
            es = LocalizedContent("¿Qué queso italiano es el más famoso?", listOf("Parmesano", "Mozzarella", "Gorgonzola", "Ricotta"), "Gastronomía", "La mozzarella es el queso italiano más famoso gracias a su versatilidad, especialmente en pizzas y ensaladas, y a su producción artesanal con leche de búfala.")
        ),
        BilingualQuestion(
            id = 50737, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le jambon italien le plus célèbre?", listOf("Prosciutto de Parme", "Jambon de Bayonne", "Jambon de Ibérique", "Jambon de Serrano"), "Gastronomie", "Le Prosciutto di Parma est un jambon cru AOP produit exclusivement dans la région de Parme, en Italie, selon des méthodes traditionnelles. Sa renommée mondiale vient de sa texture fondante et de son goût délicatement salé."),
            en = LocalizedContent("Which Italian ham is the most famous?", listOf("Prosciutto di Parma", "Bayonne ham", "Iberian ham", "Serrano ham"), "Gastronomy", "Prosciutto di Parma is a PDO raw ham produced exclusively in the Parma region of Italy, following traditional methods. Its worldwide fame comes from its melt-in-the-mouth texture and delicately salty taste."),
            zh = LocalizedContent("哪种意大利火腿最著名？", listOf("帕尔马火腿", "巴约纳火腿", "伊比利亚火腿", "塞拉诺火腿"), "美食", "帕尔马火腿是一种原产地保护的生火腿，仅在意大利帕尔马地区按照传统方法生产。其全球声誉源于入口即化的质地和微咸的口感。"),
            es = LocalizedContent("¿Qué jamón italiano es el más famoso?", listOf("Prosciutto di Parma", "Jamón de Bayona", "Jamón ibérico", "Jamón serrano"), "Gastronomía", "El Prosciutto di Parma es un jamón crudo DOP producido exclusivamente en la región de Parma, Italia, siguiendo métodos tradicionales. Su fama mundial se debe a su textura fundente y su sabor delicadamente salado.")
        ),
        BilingualQuestion(
            id = 50738, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plat espagnol le plus célèbre?", listOf("Gazpacho", "Paella", "Ratatouille", "Bouillabaisse"), "Gastronomie", "La paella est originaire de la région de Valence et est traditionnellement préparée avec du riz, du safran et divers ingrédients comme des fruits de mer ou du poulet."),
            en = LocalizedContent("What is the most famous Spanish dish?", listOf("Gazpacho", "Paella", "Ratatouille", "Bouillabaisse"), "Gastronomy", "Paella originates from the Valencia region and is traditionally prepared with rice, saffron, and various ingredients such as seafood or chicken."),
            zh = LocalizedContent("最著名的西班牙菜肴是什么？", listOf("西班牙冷汤", "海鲜饭", "普罗旺斯炖菜", "马赛鱼汤"), "美食", "海鲜饭起源于瓦伦西亚地区，传统上用大米、藏红花以及各种食材如海鲜或鸡肉烹制。"),
            es = LocalizedContent("¿Cuál es el plato español más famoso?", listOf("Gazpacho", "Paella", "Ratatouille", "Bouillabaisse"), "Gastronomía", "La paella es originaria de la región de Valencia y se prepara tradicionalmente con arroz, azafrán y diversos ingredientes como mariscos o pollo.")
        ),
        BilingualQuestion(
            id = 50739, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel vin espagnol est le plus connu?", listOf("Rioja", "Tempranillo", "Albariño", "Sherry"), "Gastronomie", "Le Rioja est le vin espagnol le plus célèbre en raison de sa longue tradition viticole et de sa reconnaissance internationale, notamment pour ses rouges élevés en fûts de chêne."),
            en = LocalizedContent("Which Spanish wine is the most famous?", listOf("Rioja", "Tempranillo", "Albariño", "Sherry"), "Gastronomy", "Rioja is the most famous Spanish wine due to its long winemaking tradition and international recognition, especially for its reds aged in oak barrels."),
            zh = LocalizedContent("哪种西班牙葡萄酒最著名？", listOf("里奥哈", "丹魄", "阿尔巴利诺", "雪莉酒"), "美食", "里奥哈是最著名的西班牙葡萄酒，因其悠久的酿酒传统和国际认可，特别是其橡木桶陈酿的红葡萄酒。"),
            es = LocalizedContent("¿Qué vino español es el más famoso?", listOf("Rioja", "Tempranillo", "Albariño", "Jerez"), "Gastronomía", "El Rioja es el vino español más famoso debido a su larga tradición vitivinícola y reconocimiento internacional, especialmente por sus tintos criados en barricas de roble.")
        ),
        BilingualQuestion(
            id = 50740, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plat grec le plus populaire?", listOf("Souvlaki", "Moussaka", "Feta", "Salade grecque"), "Gastronomie", "La moussaka est un plat traditionnel grec à base d'aubergines, de viande hachée et de béchamel, souvent considéré comme le plus emblématique du pays."),
            en = LocalizedContent("What is the most popular Greek dish?", listOf("Souvlaki", "Moussaka", "Feta", "Greek salad"), "Gastronomy", "Moussaka is a traditional Greek dish made with eggplant, minced meat, and béchamel sauce, often considered the most emblematic dish of the country."),
            zh = LocalizedContent("最受欢迎的希腊菜是什么？", listOf("烤肉串", "慕萨卡", "菲达奶酪", "希腊沙拉"), "美食", "慕萨卡是一道传统的希腊菜，由茄子、碎肉和白酱制成，常被视为该国最具代表性的菜肴。"),
            es = LocalizedContent("¿Cuál es el plato griego más popular?", listOf("Souvlaki", "Moussaka", "Feta", "Ensalada griega"), "Gastronomía", "La moussaka es un plato tradicional griego hecho con berenjenas, carne picada y bechamel, a menudo considerado el más emblemático del país.")
        ),
        BilingualQuestion(
            id = 50741, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le restaurant français le plus prestigieux?", listOf("L'Astrance", "Le Jules Verne", "Chez Pannisset", "Mikado"), "Gastronomie", "L'Astrance est un restaurant parisien triplement étoilé au guide Michelin, dirigé par le chef Pascal Barbot, reconnu pour sa cuisine inventive et raffinée."),
            en = LocalizedContent("What is the most prestigious French restaurant?", listOf("L'Astrance", "Le Jules Verne", "Chez Pannisset", "Mikado"), "Gastronomy", "L'Astrance is a Parisian restaurant with three Michelin stars, run by chef Pascal Barbot, known for its inventive and refined cuisine."),
            zh = LocalizedContent("最负盛名的法国餐厅是哪家？", listOf("L'Astrance", "Le Jules Verne", "Chez Pannisset", "Mikado"), "美食", "L'Astrance 是一家巴黎餐厅，拥有米其林三星，由主厨 Pascal Barbot 经营，以其创新和精致的菜肴而闻名。"),
            es = LocalizedContent("¿Cuál es el restaurante francés más prestigioso?", listOf("L'Astrance", "Le Jules Verne", "Chez Pannisset", "Mikado"), "Gastronomía", "L'Astrance es un restaurante parisino con tres estrellas Michelin, dirigido por el chef Pascal Barbot, reconocido por su cocina inventiva y refinada.")
        ),
        BilingualQuestion(
            id = 50742, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le chef français le plus célèbre actuellement?", listOf("Alain Ducasse", "Paul Bocuse", "Jacques Pépin", "Guy Savoy"), "Gastronomie", "Alain Ducasse est le chef le plus étoilé au monde, avec 21 étoiles Michelin cumulées, et dirige des restaurants sur plusieurs continents."),
            en = LocalizedContent("Who is the most famous French chef currently?", listOf("Alain Ducasse", "Paul Bocuse", "Jacques Pépin", "Guy Savoy"), "Gastronomy", "Alain Ducasse is the most starred chef in the world, with 21 Michelin stars accumulated, and runs restaurants on several continents."),
            zh = LocalizedContent("目前最著名的法国厨师是谁？", listOf("阿兰·杜卡斯", "保罗·博古斯", "雅克·佩潘", "盖伊·萨沃伊"), "美食", "阿兰·杜卡斯是世界上获得米其林星星最多的厨师，累计21颗星，并在多个大洲经营餐厅。"),
            es = LocalizedContent("¿Quién es el chef francés más famoso actualmente?", listOf("Alain Ducasse", "Paul Bocuse", "Jacques Pépin", "Guy Savoy"), "Gastronomía", "Alain Ducasse es el chef con más estrellas Michelin del mundo, con 21 estrellas acumuladas, y dirige restaurantes en varios continentes.")
        ),
        BilingualQuestion(
            id = 50743, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien restaurant de Paris?", listOf("Le Grand Café", "Café Procope", "Maison Fuchsias", "Restaurant Ledoyen"), "Gastronomie", "Le Café Procope, fondé en 1686, est considéré comme le plus ancien restaurant de Paris encore en activité."),
            en = LocalizedContent("What is the oldest restaurant in Paris?", listOf("Le Grand Café", "Café Procope", "Maison Fuchsias", "Restaurant Ledoyen"), "Gastronomy", "Café Procope, founded in 1686, is considered the oldest restaurant in Paris still in operation."),
            zh = LocalizedContent("巴黎最古老的餐厅是哪家？", listOf("Le Grand Café", "Café Procope", "Maison Fuchsias", "Restaurant Ledoyen"), "美食", "Café Procope 成立于1686年，被认为是巴黎仍在营业的最古老餐厅。"),
            es = LocalizedContent("¿Cuál es el restaurante más antiguo de París?", listOf("Le Grand Café", "Café Procope", "Maison Fuchsias", "Restaurant Ledoyen"), "Gastronomía", "El Café Procope, fundado en 1686, es considerado el restaurante más antiguo de París aún en funcionamiento.")
        ),
        BilingualQuestion(
            id = 50744, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le guide gastronomique le plus réputé?", listOf("Zagat", "Michelin", "TripAdvisor", "Yelp"), "Gastronomie", "Le Guide Michelin, créé en 1900 par les frères Michelin, est considéré comme la référence mondiale en gastronomie grâce à son système d'étoiles attribuées aux meilleurs restaurants."),
            en = LocalizedContent("What is the most renowned gastronomic guide?", listOf("Zagat", "Michelin", "TripAdvisor", "Yelp"), "Gastronomy", "The Michelin Guide, created in 1900 by the Michelin brothers, is considered the world reference in gastronomy thanks to its star rating system for the best restaurants."),
            zh = LocalizedContent("最负盛名的美食指南是什么？", listOf("Zagat", "米其林", "TripAdvisor", "Yelp"), "美食", "米其林指南由米其林兄弟于1900年创立，因其对最佳餐厅的星级评定系统而被视为全球美食界的参考标准。"),
            es = LocalizedContent("¿Cuál es la guía gastronómica más reputada?", listOf("Zagat", "Michelin", "TripAdvisor", "Yelp"), "Gastronomía", "La Guía Michelin, creada en 1900 por los hermanos Michelin, es considerada la referencia mundial en gastronomía gracias a su sistema de estrellas otorgadas a los mejores restaurantes.")
        ),
        BilingualQuestion(
            id = 50745, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien d'étoiles Michelin peut avoir un restaurant?", listOf("1", "2", "3", "4"), "Gastronomie", "Le guide Michelin attribue jusqu'à trois étoiles, un système créé en 1926 pour distinguer les meilleures tables. Trois étoiles signifient une cuisine exceptionnelle qui vaut le voyage."),
            en = LocalizedContent("How many Michelin stars can a restaurant have?", listOf("1", "2", "3", "4"), "Gastronomy", "The Michelin Guide awards up to three stars, a system created in 1926 to distinguish the best tables. Three stars mean exceptional cuisine worth a journey."),
            zh = LocalizedContent("一家餐厅最多能获得多少颗米其林星？", listOf("1", "2", "3", "4"), "美食", "米其林指南最高授予三星，该系统于1926年创立，用于区分最佳餐厅。三星意味着值得专程前往的杰出美食。"),
            es = LocalizedContent("¿Cuántas estrellas Michelin puede tener un restaurante?", listOf("1", "2", "3", "4"), "Gastronomía", "La Guía Michelin otorga hasta tres estrellas, un sistema creado en 1926 para distinguir las mejores mesas. Tres estrellas significan una cocina excepcional que merece un viaje.")
        ),
        BilingualQuestion(
            id = 50746, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand marché alimentaire du monde?", listOf("Tsukiji", "Torvehallerne", "Rialto", "Warorot"), "Gastronomie", "Le marché de Tsukiji à Tokyo, bien que son activité de gros ait été déplacée à Toyosu en 2018, reste historiquement le plus vaste marché alimentaire au monde par sa superficie et son volume de produits."),
            en = LocalizedContent("What is the largest food market in the world?", listOf("Tsukiji", "Torvehallerne", "Rialto", "Warorot"), "Gastronomy", "Tsukiji market in Tokyo, although its wholesale activity moved to Toyosu in 2018, remains historically the largest food market in the world by area and volume of products."),
            zh = LocalizedContent("世界上最大的食品市场是哪个？", listOf("筑地市场", "Torvehallerne", "里亚托市场", "瓦洛洛市场"), "美食", "东京的筑地市场，尽管其批发业务于2018年迁至丰洲，但历史上仍是世界上面积和产品数量最大的食品市场。"),
            es = LocalizedContent("¿Cuál es el mercado de alimentos más grande del mundo?", listOf("Tsukiji", "Torvehallerne", "Rialto", "Warorot"), "Gastronomía", "El mercado de Tsukiji en Tokio, aunque su actividad mayorista se trasladó a Toyosu en 2018, sigue siendo históricamente el mercado de alimentos más grande del mundo por superficie y volumen de productos.")
        ),
        BilingualQuestion(
            id = 50747, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le fruit le plus consommé au monde?", listOf("Banane", "Pomme", "Orange", "Pastèque"), "Gastronomie", "La banane est le fruit le plus consommé au monde en volume, devant la pomme et l'orange, grâce à sa disponibilité toute l'année et son prix abordable dans de nombreux pays."),
            en = LocalizedContent("What is the most consumed fruit in the world?", listOf("Banana", "Apple", "Orange", "Watermelon"), "Gastronomy", "The banana is the most consumed fruit in the world by volume, ahead of apples and oranges, thanks to its year-round availability and affordable price in many countries."),
            zh = LocalizedContent("世界上消费量最大的水果是什么？", listOf("香蕉", "苹果", "橙子", "西瓜"), "美食", "香蕉是世界上按体积计算消费量最大的水果，领先于苹果和橙子，这得益于其全年供应和在许多国家的实惠价格。"),
            es = LocalizedContent("¿Cuál es la fruta más consumida del mundo?", listOf("Plátano", "Manzana", "Naranja", "Sandía"), "Gastronomía", "El plátano es la fruta más consumida del mundo en volumen, por delante de la manzana y la naranja, gracias a su disponibilidad durante todo el año y su precio asequible en muchos países.")
        ),
        BilingualQuestion(
            id = 50748, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le légume le plus consommé au monde?", listOf("Carotte", "Pomme de terre", "Tomate", "Oignon"), "Gastronomie", "La tomate est techniquement un fruit, mais elle est consommée comme un légume et utilisée dans de nombreuses cuisines du monde, notamment en sauces, soupes et salades."),
            en = LocalizedContent("What is the most consumed vegetable in the world?", listOf("Carrot", "Potato", "Tomato", "Onion"), "Gastronomy", "The tomato is technically a fruit, but it is consumed as a vegetable and used in many cuisines around the world, especially in sauces, soups, and salads."),
            zh = LocalizedContent("世界上消费量最大的蔬菜是什么？", listOf("胡萝卜", "土豆", "番茄", "洋葱"), "美食", "番茄在植物学上属于水果，但常被当作蔬菜食用，并用于世界各地的许多菜肴中，尤其是酱汁、汤和沙拉。"),
            es = LocalizedContent("¿Cuál es la verdura más consumida del mundo?", listOf("Zanahoria", "Papa", "Tomate", "Cebolla"), "Gastronomía", "El tomate es técnicamente una fruta, pero se consume como verdura y se utiliza en muchas cocinas del mundo, especialmente en salsas, sopas y ensaladas.")
        ),
        BilingualQuestion(
            id = 50749, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nombre de variétés de fromage français?", listOf("200", "400", "600", "800"), "Gastronomie", "La France compte officiellement environ 600 variétés de fromages, une diversité reconnue par le général de Gaulle qui disait qu'il est difficile de gouverner un pays avec 365 fromages, un nombre depuis largement dépassé."),
            en = LocalizedContent("How many varieties of French cheese are there?", listOf("200", "400", "600", "800"), "Gastronomy", "France officially has about 600 varieties of cheese, a diversity recognized by General de Gaulle who said it is difficult to govern a country with 365 cheeses, a number since largely exceeded."),
            zh = LocalizedContent("法国奶酪有多少种？", listOf("200", "400", "600", "800"), "美食", "法国官方约有600种奶酪，这种多样性得到了戴高乐将军的认可，他曾说治理一个有365种奶酪的国家很困难，而这一数字此后已被大幅超越。"),
            es = LocalizedContent("¿Cuántas variedades de queso francés hay?", listOf("200", "400", "600", "800"), "Gastronomía", "Francia cuenta oficialmente con unas 600 variedades de queso, una diversidad reconocida por el general De Gaulle, quien dijo que es difícil gobernar un país con 365 quesos, número que desde entonces ha sido ampliamente superado.")
        ),
        BilingualQuestion(
            id = 50750, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le fromage français qui sent le plus fort?", listOf("Roquefort", "Limburger", "Époisses", "Munster"), "Gastronomie", "L'Époisses est un fromage à pâte molle et croûte lavée dont l'odeur puissante provient du lavage à l'eau-de-vie de marc pendant l'affinage."),
            en = LocalizedContent("Which French cheese smells the strongest?", listOf("Roquefort", "Limburger", "Époisses", "Munster"), "Gastronomy", "Époisses is a soft cheese with a washed rind whose strong smell comes from being washed with marc brandy during aging."),
            zh = LocalizedContent("哪种法国奶酪气味最浓？", listOf("罗克福尔", "林堡", "埃波瓦斯", "芒斯特"), "美食", "埃波瓦斯是一种软质洗皮奶酪，其浓烈气味源于熟成过程中用果渣白兰地清洗。"),
            es = LocalizedContent("¿Qué queso francés huele más fuerte?", listOf("Roquefort", "Limburger", "Époisses", "Munster"), "Gastronomía", "El Époisses es un queso de pasta blanda y corteza lavada cuyo fuerte olor proviene del lavado con aguardiente de orujo durante la maduración.")
        ),
        BilingualQuestion(
            id = 50751, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plat que les Français mangent le plus?", listOf("Pâtes", "Riz", "Pommes de terre", "Pain"), "Gastronomie", "Les pommes de terre sont l'aliment le plus consommé en France, notamment sous forme de frites, purée ou gratin, grâce à leur polyvalence et leur prix abordable."),
            en = LocalizedContent("What is the most commonly eaten dish by the French?", listOf("Pasta", "Rice", "Potatoes", "Bread"), "Gastronomy", "Potatoes are the most consumed food in France, especially as fries, mashed potatoes, or gratin, due to their versatility and affordable price."),
            zh = LocalizedContent("法国人最常吃的菜肴是什么？", listOf("意面", "米饭", "土豆", "面包"), "美食", "土豆是法国消费最多的食物，尤其是薯条、土豆泥或焗土豆，因其多功能性和价格实惠。"),
            es = LocalizedContent("¿Cuál es el plato que más comen los franceses?", listOf("Pasta", "Arroz", "Patatas", "Pan"), "Gastronomía", "Las patatas son el alimento más consumido en Francia, especialmente en forma de patatas fritas, puré o gratinado, gracias a su versatilidad y precio asequible.")
        ),
        BilingualQuestion(
            id = 50752, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le dessert que les Français mangent le plus?", listOf("Mousse au chocolat", "Crème brûlée", "Yaourt", "Gâteau"), "Gastronomie", "Le yaourt est le dessert le plus consommé en France, devant les fruits et les pâtisseries, grâce à son prix abordable, sa praticité et sa présence quotidienne dans les foyers."),
            en = LocalizedContent("What is the most commonly eaten dessert by the French?", listOf("Chocolate mousse", "Crème brûlée", "Yogurt", "Cake"), "Gastronomy", "Yogurt is the most consumed dessert in France, ahead of fruits and pastries, due to its affordable price, convenience, and daily presence in households."),
            zh = LocalizedContent("法国人最常吃的甜点是什么？", listOf("巧克力慕斯", "焦糖布丁", "酸奶", "蛋糕"), "美食", "酸奶是法国消费最多的甜点，领先于水果和糕点，因其价格实惠、方便且日常出现在家庭中。"),
            es = LocalizedContent("¿Cuál es el postre que más comen los franceses?", listOf("Mousse de chocolate", "Crème brûlée", "Yogur", "Pastel"), "Gastronomía", "El yogur es el postre más consumido en Francia, por delante de las frutas y los pasteles, gracias a su precio asequible, practicidad y presencia diaria en los hogares.")
        ),
        BilingualQuestion(
            id = 50753, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le type de pâtes le plus populaire en Italie?", listOf("Spaghetti", "Penne", "Ravioli", "Tortellini"), "Gastronomie", "Les spaghetti sont les pâtes les plus consommées en Italie, représentant environ 25% du marché des pâtes sèches, grâce à leur polyvalence et leur association classique avec des sauces comme la carbonara ou la bolognaise."),
            en = LocalizedContent("What is the most popular type of pasta in Italy?", listOf("Spaghetti", "Penne", "Ravioli", "Tortellini"), "Gastronomy", "Spaghetti is the most consumed pasta in Italy, representing about 25% of the dry pasta market, thanks to its versatility and classic pairing with sauces like carbonara or bolognese."),
            zh = LocalizedContent("意大利最受欢迎的意面类型是什么？", listOf("意大利面", "通心粉", "意式饺子", "意式馄饨"), "美食", "意大利面是意大利消费最多的意面，约占干意面市场的25%，因其多功能性以及与卡邦尼酱或博洛尼亚酱等经典搭配。"),
            es = LocalizedContent("¿Cuál es el tipo de pasta más popular en Italia?", listOf("Espaguetis", "Penne", "Raviolis", "Tortellinis"), "Gastronomía", "Los espaguetis son la pasta más consumida en Italia, representando aproximadamente el 25% del mercado de pasta seca, gracias a su versatilidad y su asociación clásica con salsas como la carbonara o la boloñesa.")
        ),
        BilingualQuestion(
            id = 50754, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'ingrédient principal de la vraie sauce bolognaise?", listOf("Tomate", "Viande", "Ail", "Oignon"), "Gastronomie", "La sauce bolognaise traditionnelle, originaire de Bologne en Italie, est avant tout une préparation à base de viande hachée (souvent un mélange de bœuf et de porc), les tomates n'y étant qu'un élément secondaire."),
            en = LocalizedContent("What is the main ingredient of real bolognese sauce?", listOf("Tomato", "Meat", "Garlic", "Onion"), "Gastronomy", "Traditional bolognese sauce, originally from Bologna, Italy, is primarily a meat-based preparation (often a mix of beef and pork), with tomatoes being only a secondary element."),
            zh = LocalizedContent("正宗博洛尼亚酱的主要成分是什么？", listOf("番茄", "肉", "大蒜", "洋葱"), "美食", "传统的博洛尼亚酱源自意大利博洛尼亚，主要以肉末（通常是牛肉和猪肉混合）为基础，番茄只是次要成分。"),
            es = LocalizedContent("¿Cuál es el ingrediente principal de la auténtica salsa boloñesa?", listOf("Tomate", "Carne", "Ajo", "Cebolla"), "Gastronomía", "La salsa boloñesa tradicional, originaria de Bolonia, Italia, es ante todo una preparación a base de carne picada (a menudo una mezcla de ternera y cerdo), siendo el tomate solo un elemento secundario.")
        ),
        BilingualQuestion(
            id = 50755, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'ingrédient principal du vrai pesto?", listOf("Tomate", "Basilic", "Ail", "Crème"), "Gastronomie", "Le vrai pesto alla genovese est traditionnellement préparé avec du basilic frais, de l'ail, du parmesan, des pignons et de l'huile d'olive."),
            en = LocalizedContent("What is the main ingredient of real pesto?", listOf("Tomato", "Basil", "Garlic", "Cream"), "Gastronomy", "Real pesto alla genovese is traditionally made with fresh basil, garlic, Parmesan, pine nuts, and olive oil."),
            zh = LocalizedContent("正宗香蒜酱的主要成分是什么？", listOf("番茄", "罗勒", "大蒜", "奶油"), "美食", "正宗的热那亚香蒜酱传统上由新鲜罗勒、大蒜、帕尔马干酪、松子和橄榄油制成。"),
            es = LocalizedContent("¿Cuál es el ingrediente principal del auténtico pesto?", listOf("Tomate", "Albahaca", "Ajo", "Crema"), "Gastronomía", "El auténtico pesto alla genovese se prepara tradicionalmente con albahaca fresca, ajo, parmesano, piñones y aceite de oliva.")
        ),
        BilingualQuestion(
            id = 50756, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le vin blanc français le plus prestigieux?", listOf("Sauternes", "Chablis", "Sauvignon Blanc", "Riesling"), "Gastronomie", "Le Sauternes est un vin blanc liquoreux de Bordeaux, réputé pour sa complexité et sa capacité de vieillissement, produit à partir de raisins botrytisés."),
            en = LocalizedContent("What is the most prestigious French white wine?", listOf("Sauternes", "Chablis", "Sauvignon Blanc", "Riesling"), "Gastronomy", "Sauternes is a sweet white wine from Bordeaux, renowned for its complexity and aging potential, made from botrytized grapes."),
            zh = LocalizedContent("最负盛名的法国白葡萄酒是什么？", listOf("苏玳", "夏布利", "长相思", "雷司令"), "美食", "苏玳是波尔多的甜白葡萄酒，以其复杂性和陈年潜力而闻名，由贵腐葡萄酿制。"),
            es = LocalizedContent("¿Cuál es el vino blanco francés más prestigioso?", listOf("Sauternes", "Chablis", "Sauvignon Blanc", "Riesling"), "Gastronomía", "El Sauternes es un vino blanco dulce de Burdeos, famoso por su complejidad y capacidad de envejecimiento, elaborado a partir de uvas botritizadas.")
        ),
        BilingualQuestion(
            id = 50757, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le vin rouge français le plus prestigieux?", listOf("Bordeaux", "Bourgogne", "Côtes du Rhône", "Châteauneuf-du-Pape"), "Gastronomie", "La Bourgogne produit certains des vins rouges les plus réputés au monde, notamment à base de pinot noir, avec des appellations comme Romanée-Conti."),
            en = LocalizedContent("What is the most prestigious French red wine?", listOf("Bordeaux", "Burgundy", "Côtes du Rhône", "Châteauneuf-du-Pape"), "Gastronomy", "Burgundy produces some of the most renowned red wines in the world, especially from Pinot Noir, with appellations like Romanée-Conti."),
            zh = LocalizedContent("最负盛名的法国红葡萄酒是什么？", listOf("波尔多", "勃艮第", "罗讷河谷", "教皇新堡"), "美食", "勃艮第出产一些世界上最著名的红葡萄酒，尤其是黑皮诺，如罗曼尼康帝等产区。"),
            es = LocalizedContent("¿Cuál es el vino tinto francés más prestigioso?", listOf("Burdeos", "Borgoña", "Côtes du Rhône", "Châteauneuf-du-Pape"), "Gastronomía", "Borgoña produce algunos de los vinos tintos más renombrados del mundo, especialmente a base de Pinot Noir, con denominaciones como Romanée-Conti.")
        ),
        BilingualQuestion(
            id = 50758, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le champagne le plus prestigieux?", listOf("Veuve Clicquot", "Krug", "Dom Pérignon", "Cristal"), "Gastronomie", "Dom Pérignon est considéré comme le champagne le plus prestigieux car il est produit par Moët & Chandon et porte le nom du moine bénédictin qui a perfectionné la méthode de champagnisation au XVIIe siècle."),
            en = LocalizedContent("What is the most prestigious champagne?", listOf("Veuve Clicquot", "Krug", "Dom Pérignon", "Cristal"), "Gastronomy", "Dom Pérignon is considered the most prestigious champagne as it is produced by Moët & Chandon and named after the Benedictine monk who perfected the champagne method in the 17th century."),
            zh = LocalizedContent("最负盛名的香槟是什么？", listOf("凯歌", "库克", "唐培里侬", "水晶"), "美食", "唐培里侬被认为是最负盛名的香槟，由酩悦香槟生产，以17世纪完善香槟酿造法的本笃会修士命名。"),
            es = LocalizedContent("¿Cuál es el champán más prestigioso?", listOf("Veuve Clicquot", "Krug", "Dom Pérignon", "Cristal"), "Gastronomía", "Dom Pérignon es considerado el champán más prestigioso, ya que es producido por Moët & Chandon y lleva el nombre del monje benedictino que perfeccionó el método de champanización en el siglo XVII.")
        ),
        BilingualQuestion(
            id = 50759, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'aliment le plus cher du monde?", listOf("Safran", "Caviar", "Truffes", "Or alimentaire"), "Gastronomie", "Les truffes, notamment la truffe blanche d'Alba, peuvent atteindre des prix exorbitants, jusqu'à plusieurs milliers d'euros le kilo, en raison de leur rareté et de leur cueillette difficile."),
            en = LocalizedContent("What is the most expensive food in the world?", listOf("Saffron", "Caviar", "Truffles", "Edible gold"), "Gastronomy", "Truffles, especially the white truffle from Alba, can reach exorbitant prices, up to several thousand euros per kilo, due to their rarity and difficult harvesting."),
            zh = LocalizedContent("世界上最贵的食物是什么？", listOf("藏红花", "鱼子酱", "松露", "食用金箔"), "美食", "松露，尤其是阿尔巴白松露，因其稀有性和采摘困难，价格可达每公斤数千欧元。"),
            es = LocalizedContent("¿Cuál es el alimento más caro del mundo?", listOf("Azafrán", "Caviar", "Trufas", "Oro comestible"), "Gastronomía", "Las trufas, especialmente la trufa blanca de Alba, pueden alcanzar precios exorbitantes, hasta varios miles de euros el kilo, debido a su rareza y difícil recolección.")
        ),
        BilingualQuestion(
            id = 50760, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le prix moyen d'un gramme de truffes blanches?", listOf("10 euros", "50 euros", "100 euros", "500 euros"), "Gastronomie", "La truffe blanche d'Alba est un champignon très rare et difficile à cultiver, ce qui explique son prix élevé, atteignant souvent 50 euros le gramme sur les marchés."),
            en = LocalizedContent("What is the average price of a gram of white truffles?", listOf("10 euros", "50 euros", "100 euros", "500 euros"), "Gastronomy", "The white Alba truffle is a very rare and difficult-to-cultivate mushroom, which explains its high price, often reaching 50 euros per gram on the markets."),
            zh = LocalizedContent("一克白松露的平均价格是多少？", listOf("10欧元", "50欧元", "100欧元", "500欧元"), "美食", "阿尔巴白松露是一种非常稀有且难以培育的蘑菇，这解释了其高昂的价格，市场上常达到每克50欧元。"),
            es = LocalizedContent("¿Cuál es el precio medio de un gramo de trufas blancas?", listOf("10 euros", "50 euros", "100 euros", "500 euros"), "Gastronomía", "La trufa blanca de Alba es un hongo muy raro y difícil de cultivar, lo que explica su alto precio, alcanzando a menudo los 50 euros el gramo en los mercados.")
        ),
        BilingualQuestion(
            id = 50761, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand restaurant du monde?", listOf("Thai Orchid", "Crystal Palace Buffet", "Bacchanal Buffet", "Hawker Chan"), "Gastronomie", "Le Bacchanal Buffet à Las Vegas détient le record du plus grand restaurant du monde avec plus de 2 500 places assises."),
            en = LocalizedContent("What is the largest restaurant in the world?", listOf("Thai Orchid", "Crystal Palace Buffet", "Bacchanal Buffet", "Hawker Chan"), "Gastronomy", "The Bacchanal Buffet in Las Vegas holds the record for the largest restaurant in the world with over 2,500 seats."),
            zh = LocalizedContent("世界上最大的餐厅是哪家？", listOf("Thai Orchid", "Crystal Palace Buffet", "Bacchanal Buffet", "Hawker Chan"), "美食", "拉斯维加斯的Bacchanal Buffet拥有超过2500个座位，保持着世界上最大餐厅的纪录。"),
            es = LocalizedContent("¿Cuál es el restaurante más grande del mundo?", listOf("Thai Orchid", "Crystal Palace Buffet", "Bacchanal Buffet", "Hawker Chan"), "Gastronomía", "El Bacchanal Buffet en Las Vegas tiene el récord del restaurante más grande del mundo con más de 2.500 asientos.")
        ),
        BilingualQuestion(
            id = 50762, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus petit restaurant du monde?", listOf("Chez Prune", "Tiny Thai", "Café Wisteria", "The Worlds Smallest Restaurant"), "Gastronomie", "Situé à Bruxelles, ce restaurant ne peut accueillir qu’une seule table pour deux convives, ce qui lui vaut le titre de plus petit restaurant du monde."),
            en = LocalizedContent("What is the smallest restaurant in the world?", listOf("Chez Prune", "Tiny Thai", "Café Wisteria", "The Worlds Smallest Restaurant"), "Gastronomy", "Located in Brussels, this restaurant can only accommodate one table for two diners, earning it the title of the smallest restaurant in the world."),
            zh = LocalizedContent("世界上最小的餐厅是哪家？", listOf("Chez Prune", "Tiny Thai", "Café Wisteria", "The Worlds Smallest Restaurant"), "美食", "这家位于布鲁塞尔的餐厅只能容纳一张供两人用餐的桌子，因此获得了世界上最小餐厅的称号。"),
            es = LocalizedContent("¿Cuál es el restaurante más pequeño del mundo?", listOf("Chez Prune", "Tiny Thai", "Café Wisteria", "The Worlds Smallest Restaurant"), "Gastronomía", "Situado en Bruselas, este restaurante solo puede albergar una mesa para dos comensales, lo que le vale el título de restaurante más pequeño del mundo.")
        ),
        BilingualQuestion(
            id = 50763, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plat qui a remporté le plus de prix gastronomiques?", listOf("Coq au vin", "Bouef à la Bourguignonne", "Paella", "Risotto"), "Gastronomie", "Le bœuf bourguignon est un plat emblématique de la cuisine française, souvent primé pour sa richesse en saveurs et son héritage culinaire. Il a été consacré par de nombreux concours gastronomiques comme un classique indémodable."),
            en = LocalizedContent("Which dish has won the most gastronomic awards?", listOf("Coq au vin", "Beef Bourguignon", "Paella", "Risotto"), "Gastronomy", "Beef Bourguignon is an emblematic dish of French cuisine, often awarded for its richness in flavors and culinary heritage. It has been consecrated by many gastronomic competitions as a timeless classic."),
            zh = LocalizedContent("哪道菜获得的美食奖项最多？", listOf("红酒炖鸡", "勃艮第牛肉", "西班牙海鲜饭", "意大利烩饭"), "美食", "勃艮第牛肉是法国菜的代表性菜肴，因其丰富的风味和烹饪传统而屡获殊荣，被许多美食比赛奉为永恒的经典。"),
            es = LocalizedContent("¿Qué plato ha ganado más premios gastronómicos?", listOf("Coq au vin", "Buey a la borgoñona", "Paella", "Risotto"), "Gastronomía", "El buey a la borgoñona es un plato emblemático de la cocina francesa, a menudo premiado por su riqueza en sabores y su herencia culinaria. Ha sido consagrado por numerosos concursos gastronómicos como un clásico atemporal.")
        ),
        BilingualQuestion(
            id = 50764, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le type de cuisine qui est le plus courant dans le monde?", listOf("Chinoise", "Italienne", "Française", "Thaïlandaise"), "Gastronomie", "La cuisine chinoise est la plus répandue dans le monde en raison de sa longue histoire, de sa diversité régionale et de sa diaspora importante."),
            en = LocalizedContent("Which type of cuisine is the most common in the world?", listOf("Chinese", "Italian", "French", "Thai"), "Gastronomy", "Chinese cuisine is the most widespread in the world due to its long history, regional diversity, and large diaspora."),
            zh = LocalizedContent("哪种菜系在世界上最常见？", listOf("中餐", "意大利菜", "法国菜", "泰国菜"), "美食", "中餐因其悠久的历史、地域多样性和庞大的海外侨民而成为世界上分布最广的菜系。"),
            es = LocalizedContent("¿Qué tipo de cocina es la más común en el mundo?", listOf("China", "Italiana", "Francesa", "Tailandesa"), "Gastronomía", "La cocina china es la más extendida en el mundo debido a su larga historia, diversidad regional y gran diáspora.")
        ),
        BilingualQuestion(
            id = 50765, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le légume le plus riche en calories?", listOf("Avocat", "Pomme de terre", "Olive", "Noix de coco"), "Gastronomie", "L'avocat est un fruit-légume très riche en lipides, ce qui lui confère une densité calorique élevée, contrairement à la plupart des légumes qui sont pauvres en calories."),
            en = LocalizedContent("Which vegetable is the highest in calories?", listOf("Avocado", "Potato", "Olive", "Coconut"), "Gastronomy", "Avocado is a fruit-vegetable very rich in lipids, which gives it a high caloric density, unlike most vegetables that are low in calories."),
            zh = LocalizedContent("哪种蔬菜热量最高？", listOf("牛油果", "土豆", "橄榄", "椰子"), "美食", "牛油果是一种富含脂质的果蔬，因此热量密度高，而大多数蔬菜热量较低。"),
            es = LocalizedContent("¿Qué verdura tiene más calorías?", listOf("Aguacate", "Patata", "Aceituna", "Coco"), "Gastronomía", "El aguacate es una fruta-verdura muy rica en lípidos, lo que le confiere una alta densidad calórica, a diferencia de la mayoría de las verduras que son bajas en calorías.")
        ),
        BilingualQuestion(
            id = 50766, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le fruit le plus riche en vitamine C?", listOf("Orange", "Citron", "Kiwi", "Fraise"), "Gastronomie", "Le kiwi contient environ 92 mg de vitamine C pour 100 g, dépassant ainsi l'orange qui en contient environ 53 mg."),
            en = LocalizedContent("Which fruit is the richest in vitamin C?", listOf("Orange", "Lemon", "Kiwi", "Strawberry"), "Gastronomy", "Kiwi contains about 92 mg of vitamin C per 100g, surpassing orange which contains about 53 mg."),
            zh = LocalizedContent("哪种水果维生素C含量最高？", listOf("橙子", "柠檬", "猕猴桃", "草莓"), "美食", "猕猴桃每100克含约92毫克维生素C，超过橙子（约53毫克）。"),
            es = LocalizedContent("¿Qué fruta es la más rica en vitamina C?", listOf("Naranja", "Limón", "Kiwi", "Fresa"), "Gastronomía", "El kiwi contiene unos 92 mg de vitamina C por 100 g, superando a la naranja que contiene unos 53 mg.")
        ),
        BilingualQuestion(
            id = 50767, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nombre de calories dans une baguette française?", listOf("200", "400", "600", "800"), "Gastronomie", "Une baguette française standard de 250 grammes contient environ 600 calories, principalement issues des glucides de la farine de blé."),
            en = LocalizedContent("How many calories are in a French baguette?", listOf("200", "400", "600", "800"), "Gastronomy", "A standard 250-gram French baguette contains about 600 calories, mainly from carbohydrates in wheat flour."),
            zh = LocalizedContent("一根法式长棍面包含有多少卡路里？", listOf("200", "400", "600", "800"), "美食", "一根标准250克的法式长棍面包约含600卡路里，主要来自小麦面粉中的碳水化合物。"),
            es = LocalizedContent("¿Cuántas calorías tiene una baguette francesa?", listOf("200", "400", "600", "800"), "Gastronomía", "Una baguette francesa estándar de 250 gramos contiene aproximadamente 600 calorías, principalmente de los carbohidratos de la harina de trigo.")
        ),
        BilingualQuestion(
            id = 50768, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le nombre de variétés de vin français?", listOf("100", "500", "1000", "5000"), "Gastronomie", "La France compte environ 1 000 variétés de vin, un chiffre qui reflète la diversité de ses cépages et de ses terroirs, bien que seules quelques dizaines soient largement cultivées."),
            en = LocalizedContent("How many varieties of French wine are there?", listOf("100", "500", "1000", "5000"), "Gastronomy", "France has about 1,000 varieties of wine, a number that reflects the diversity of its grape varieties and terroirs, although only a few dozen are widely cultivated."),
            zh = LocalizedContent("法国葡萄酒有多少个品种？", listOf("100", "500", "1000", "5000"), "美食", "法国约有1000种葡萄酒，这一数字反映了其葡萄品种和风土的多样性，尽管只有几十种被广泛种植。"),
            es = LocalizedContent("¿Cuántas variedades de vino francés hay?", listOf("100", "500", "1000", "5000"), "Gastronomía", "Francia cuenta con alrededor de 1.000 variedades de vino, cifra que refleja la diversidad de sus cepas y terruños, aunque solo unas pocas docenas se cultivan ampliamente.")
        ),
        BilingualQuestion(
            id = 50769, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le pays le plus grand producteur de vin?", listOf("France", "Italie", "Espagne", "États-Unis"), "Gastronomie", "La France est historiquement le premier producteur mondial de vin, avec des régions comme Bordeaux, Bourgogne et Champagne. Elle rivalise avec l'Italie pour la première place selon les années."),
            en = LocalizedContent("Which country is the largest wine producer?", listOf("France", "Italy", "Spain", "United States"), "Gastronomy", "France is historically the world's largest wine producer, with regions like Bordeaux, Burgundy, and Champagne. It competes with Italy for the top spot depending on the year."),
            zh = LocalizedContent("哪个国家是最大的葡萄酒生产国？", listOf("法国", "意大利", "西班牙", "美国"), "美食", "法国历史上一直是世界上最大的葡萄酒生产国，拥有波尔多、勃艮第和香槟等产区。根据年份不同，它与意大利争夺首位。"),
            es = LocalizedContent("¿Qué país es el mayor productor de vino?", listOf("Francia", "Italia", "España", "Estados Unidos"), "Gastronomía", "Francia es históricamente el mayor productor mundial de vino, con regiones como Burdeos, Borgoña y Champaña. Compite con Italia por el primer puesto según el año.")
        ),
        BilingualQuestion(
            id = 50770, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le pays le plus grand producteur de champagne?", listOf("France", "Italie", "Allemagne", "Espagne"), "Gastronomie", "Le champagne est une appellation d'origine contrôlée protégée, exclusivement réservée aux vins produits dans la région de Champagne, en France."),
            en = LocalizedContent("Which country is the largest producer of champagne?", listOf("France", "Italy", "Germany", "Spain"), "Gastronomy", "Champagne is a protected designation of origin, exclusively reserved for wines produced in the Champagne region of France."),
            zh = LocalizedContent("哪个国家是最大的香槟生产国？", listOf("法国", "意大利", "德国", "西班牙"), "美食", "香槟是受保护的原产地名称，专指法国香槟地区生产的葡萄酒。"),
            es = LocalizedContent("¿Cuál es el país más grande productor de champán?", listOf("Francia", "Italia", "Alemania", "España"), "Gastronomía", "El champán es una denominación de origen protegida, reservada exclusivamente a los vinos producidos en la región de Champaña, en Francia.")
        ),
        BilingualQuestion(
            id = 50771, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays le plus grand producteur de caviar?", listOf("France", "Russie", "Iran", "Kazakhstan"), "Gastronomie", "L'Iran est le premier producteur mondial de caviar grâce à ses élevages d'esturgeons en mer Caspienne, qui fournissent le caviar de haute qualité le plus prisé."),
            en = LocalizedContent("Which country is the largest producer of caviar?", listOf("France", "Russia", "Iran", "Kazakhstan"), "Gastronomy", "Iran is the world's leading producer of caviar thanks to its sturgeon farms in the Caspian Sea, which supply the most prized high-quality caviar."),
            zh = LocalizedContent("哪个国家是最大的鱼子酱生产国？", listOf("法国", "俄罗斯", "伊朗", "哈萨克斯坦"), "美食", "伊朗是全球最大的鱼子酱生产国，得益于其在里海的鲟鱼养殖场，提供最受追捧的高品质鱼子酱。"),
            es = LocalizedContent("¿Cuál es el país más grande productor de caviar?", listOf("Francia", "Rusia", "Irán", "Kazajistán"), "Gastronomía", "Irán es el principal productor mundial de caviar gracias a sus criaderos de esturiones en el mar Caspio, que suministran el caviar de alta calidad más apreciado.")
        ),
        BilingualQuestion(
            id = 50772, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays le plus grand producteur de chocolat?", listOf("Belgique", "Suisse", "Côte d'Ivoire", "Ghana"), "Gastronomie", "La Côte d'Ivoire est le premier producteur mondial de cacao, matière première du chocolat, assurant environ 40% de la production globale."),
            en = LocalizedContent("Which country is the largest producer of chocolate?", listOf("Belgium", "Switzerland", "Ivory Coast", "Ghana"), "Gastronomy", "Ivory Coast is the world's leading producer of cocoa, the raw material for chocolate, accounting for about 40% of global production."),
            zh = LocalizedContent("哪个国家是最大的巧克力生产国？", listOf("比利时", "瑞士", "科特迪瓦", "加纳"), "美食", "科特迪瓦是全球最大的可可生产国，可可豆是巧克力的原料，占全球产量的约40%。"),
            es = LocalizedContent("¿Cuál es el país más grande productor de chocolate?", listOf("Bélgica", "Suiza", "Costa de Marfil", "Ghana"), "Gastronomía", "Costa de Marfil es el principal productor mundial de cacao, materia prima del chocolate, representando aproximadamente el 40% de la producción global.")
        ),
        BilingualQuestion(
            id = 50773, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le pays le plus grand producteur de café?", listOf("Colombie", "Brésil", "Éthiopie", "Vietnam"), "Gastronomie", "Le Brésil domine la production mondiale de café depuis plus de 150 ans, grâce à son climat tropical et ses vastes terres agricoles. Il représente environ un tiers du café produit dans le monde."),
            en = LocalizedContent("Which country is the largest producer of coffee?", listOf("Colombia", "Brazil", "Ethiopia", "Vietnam"), "Gastronomy", "Brazil has dominated global coffee production for over 150 years, thanks to its tropical climate and vast agricultural lands. It accounts for about one-third of the world's coffee."),
            zh = LocalizedContent("哪个国家是最大的咖啡生产国？", listOf("哥伦比亚", "巴西", "埃塞俄比亚", "越南"), "美食", "巴西凭借其热带气候和广阔的农业用地，主导全球咖啡生产超过150年，约占世界咖啡产量的三分之一。"),
            es = LocalizedContent("¿Cuál es el país más grande productor de café?", listOf("Colombia", "Brasil", "Etiopía", "Vietnam"), "Gastronomía", "Brasil domina la producción mundial de café desde hace más de 150 años, gracias a su clima tropical y sus vastas tierras agrícolas. Representa aproximadamente un tercio del café producido en el mundo.")
        ),
        BilingualQuestion(
            id = 50774, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays le plus grand producteur de cacao?", listOf("Brésil", "Équateur", "Côte d'Ivoire", "Ghana"), "Gastronomie", "La Côte d'Ivoire est le premier producteur mondial de cacao, représentant environ 40% de la production totale, grâce à ses conditions climatiques idéales et à une main-d'œuvre abondante."),
            en = LocalizedContent("Which country is the largest producer of cocoa?", listOf("Brazil", "Ecuador", "Ivory Coast", "Ghana"), "Gastronomy", "Ivory Coast is the world's leading producer of cocoa, accounting for about 40% of total production, thanks to its ideal climatic conditions and abundant labor."),
            zh = LocalizedContent("哪个国家是最大的可可生产国？", listOf("巴西", "厄瓜多尔", "科特迪瓦", "加纳"), "美食", "科特迪瓦是全球最大的可可生产国，占全球总产量的约40%，得益于其理想的气候条件和充足的劳动力。"),
            es = LocalizedContent("¿Cuál es el país más grande productor de cacao?", listOf("Brasil", "Ecuador", "Costa de Marfil", "Ghana"), "Gastronomía", "Costa de Marfil es el principal productor mundial de cacao, representando aproximadamente el 40% de la producción total, gracias a sus condiciones climáticas ideales y una mano de obra abundante.")
        ),
        BilingualQuestion(
            id = 50775, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le nombre de plats traditionnels français?", listOf("50", "100", "200", "300"), "Gastronomie", "L'inventaire du patrimoine culinaire français recense officiellement environ 200 plats traditionnels, reconnus pour leur authenticité et leur ancrage régional."),
            en = LocalizedContent("What is the number of traditional French dishes?", listOf("50", "100", "200", "300"), "Gastronomy", "The inventory of French culinary heritage officially lists about 200 traditional dishes, recognized for their authenticity and regional roots."),
            zh = LocalizedContent("法国传统菜肴的数量是多少？", listOf("50", "100", "200", "300"), "美食", "法国烹饪遗产名录正式收录了约200道传统菜肴，因其真实性和地域特色而得到认可。"),
            es = LocalizedContent("¿Cuál es el número de platos tradicionales franceses?", listOf("50", "100", "200", "300"), "Gastronomía", "El inventario del patrimonio culinario francés registra oficialmente unos 200 platos tradicionales, reconocidos por su autenticidad y arraigo regional.")
        ),
        BilingualQuestion(
            id = 50776, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plat français le plus ancien connu?", listOf("Coq au vin", "Potage", "Rôti", "Fricassée"), "Gastronomie", "Le rôti est considéré comme le plat français le plus ancien car il remonte à la préhistoire, où la cuisson de la viande à la broche au-dessus du feu était déjà pratiquée."),
            en = LocalizedContent("What is the oldest known French dish?", listOf("Coq au vin", "Soup", "Roast", "Fricassee"), "Gastronomy", "Roast is considered the oldest French dish because it dates back to prehistoric times, when cooking meat on a spit over a fire was already practiced."),
            zh = LocalizedContent("已知最古老的法国菜肴是什么？", listOf("红酒炖鸡", "汤", "烤肉", "炖肉"), "美食", "烤肉被认为是最古老的法国菜肴，因为它可以追溯到史前时期，当时人们已经用火烤制肉类。"),
            es = LocalizedContent("¿Cuál es el plato francés más antiguo conocido?", listOf("Coq au vin", "Sopa", "Asado", "Fricasé"), "Gastronomía", "El asado se considera el plato francés más antiguo porque se remonta a la prehistoria, donde ya se practicaba la cocción de la carne al espetón sobre el fuego.")
        ),
        BilingualQuestion(
            id = 50777, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le dessert français le plus ancien?", listOf("Tarte Tatin", "Crème brûlée", "Pâte de fruit", "Nougat"), "Gastronomie", "La pâte de fruit est considérée comme le plus ancien dessert français, car elle était déjà préparée au Moyen Âge pour conserver les fruits, avant l’arrivée du sucre de canne."),
            en = LocalizedContent("What is the oldest French dessert?", listOf("Tarte Tatin", "Crème brûlée", "Fruit paste", "Nougat"), "Gastronomy", "Fruit paste is considered the oldest French dessert, as it was already prepared in the Middle Ages to preserve fruits, before the arrival of cane sugar."),
            zh = LocalizedContent("最古老的法国甜点是什么？", listOf("塔坦苹果挞", "焦糖布丁", "水果软糖", "牛轧糖"), "美食", "水果软糖被认为是最古老的法国甜点，因为它在中世纪就已经被用来保存水果，早于蔗糖的出现。"),
            es = LocalizedContent("¿Cuál es el postre francés más antiguo?", listOf("Tarta Tatin", "Crème brûlée", "Pasta de fruta", "Turrón"), "Gastronomía", "La pasta de fruta se considera el postre francés más antiguo, ya que ya se preparaba en la Edad Media para conservar las frutas, antes de la llegada del azúcar de caña.")
        ),
        BilingualQuestion(
            id = 50778, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le type de cuisine qui est le plus sain?", listOf("Méditerranéenne", "Asiatique", "Française", "Américaine"), "Gastronomie", "La cuisine méditerranéenne est riche en fruits, légumes, huile d'olive et poissons, ce qui réduit les risques de maladies cardiovasculaires."),
            en = LocalizedContent("Which type of cuisine is the healthiest?", listOf("Mediterranean", "Asian", "French", "American"), "Gastronomy", "Mediterranean cuisine is rich in fruits, vegetables, olive oil, and fish, which reduces the risk of cardiovascular diseases."),
            zh = LocalizedContent("哪种菜系最健康？", listOf("地中海菜", "亚洲菜", "法国菜", "美国菜"), "美食", "地中海菜富含水果、蔬菜、橄榄油和鱼类，有助于降低心血管疾病的风险。"),
            es = LocalizedContent("¿Qué tipo de cocina es la más saludable?", listOf("Mediterránea", "Asiática", "Francesa", "Americana"), "Gastronomía", "La cocina mediterránea es rica en frutas, verduras, aceite de oliva y pescado, lo que reduce los riesgos de enfermedades cardiovasculares.")
        ),
        BilingualQuestion(
            id = 50779, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nombre de calories dans une pizza moyenne?", listOf("600", "1000", "1500", "2000"), "Gastronomie", "Une pizza moyenne de 30 cm contient environ 1000 calories, en moyenne, en raison de la pâte, du fromage et de la garniture."),
            en = LocalizedContent("What is the number of calories in a medium pizza?", listOf("600", "1000", "1500", "2000"), "Gastronomy", "A medium 12-inch pizza contains about 1000 calories on average, due to the dough, cheese, and toppings."),
            zh = LocalizedContent("一个中等披萨的热量是多少卡路里？", listOf("600", "1000", "1500", "2000"), "美食", "一个中等尺寸（30厘米）的披萨平均含有约1000卡路里，因为面饼、奶酪和配料的热量较高。"),
            es = LocalizedContent("¿Cuál es el número de calorías en una pizza mediana?", listOf("600", "1000", "1500", "2000"), "Gastronomía", "Una pizza mediana de 30 cm contiene aproximadamente 1000 calorías en promedio, debido a la masa, el queso y los ingredientes.")
        ),
        BilingualQuestion(
            id = 50780, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nombre de calories dans une portion de frites?", listOf("200", "400", "600", "800"), "Gastronomie", "Une portion standard de frites (environ 150 grammes) contient en moyenne 400 calories, en raison de la friture qui ajoute des lipides aux pommes de terre riches en amidon."),
            en = LocalizedContent("How many calories are in a serving of french fries?", listOf("200", "400", "600", "800"), "Gastronomy", "A standard serving of french fries (about 150 grams) contains an average of 400 calories, due to frying adding lipids to the starchy potatoes."),
            zh = LocalizedContent("一份薯条含有多少卡路里？", listOf("200", "400", "600", "800"), "美食", "一份标准薯条（约150克）平均含有400卡路里，因为油炸为富含淀粉的土豆增加了脂肪。"),
            es = LocalizedContent("¿Cuántas calorías tiene una ración de patatas fritas?", listOf("200", "400", "600", "800"), "Gastronomía", "Una ración estándar de patatas fritas (unos 150 gramos) contiene una media de 400 calorías, debido a que la fritura añade lípidos a las patatas ricas en almidón.")
        ),
        BilingualQuestion(
            id = 50781, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nombre de calories dans un hamburger moyen?", listOf("300", "500", "800", "1000"), "Gastronomie", "Un hamburger moyen (environ 150 à 200 grammes) contient généralement entre 450 et 550 calories, avec 500 comme valeur moyenne courante."),
            en = LocalizedContent("How many calories are in an average hamburger?", listOf("300", "500", "800", "1000"), "Gastronomy", "An average hamburger (about 150 to 200 grams) typically contains between 450 and 550 calories, with 500 being a common average value."),
            zh = LocalizedContent("一个普通汉堡含有多少卡路里？", listOf("300", "500", "800", "1000"), "美食", "一个普通汉堡（约150至200克）通常含有450至550卡路里，500是常见的平均值。"),
            es = LocalizedContent("¿Cuántas calorías tiene una hamburguesa promedio?", listOf("300", "500", "800", "1000"), "Gastronomía", "Una hamburguesa promedio (de unos 150 a 200 gramos) suele contener entre 450 y 550 calorías, siendo 500 un valor medio común.")
        ),
        BilingualQuestion(
            id = 50782, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plat asiatique le plus populaire en occident?", listOf("Sushi", "Pad Thai", "Curry", "Riz frit"), "Gastronomie", "Le sushi, d'origine japonaise, s'est imposé en Occident grâce à sa présence massive dans les restaurants et supermarchés depuis les années 1980."),
            en = LocalizedContent("What is the most popular Asian dish in the West?", listOf("Sushi", "Pad Thai", "Curry", "Fried rice"), "Gastronomy", "Sushi, of Japanese origin, has become popular in the West due to its massive presence in restaurants and supermarkets since the 1980s."),
            zh = LocalizedContent("在西方最受欢迎的亚洲菜肴是什么？", listOf("寿司", "泰式炒河粉", "咖喱", "炒饭"), "美食", "寿司源自日本，自20世纪80年代以来，由于在餐馆和超市的大量出现，在西方流行起来。"),
            es = LocalizedContent("¿Cuál es el plato asiático más popular en Occidente?", listOf("Sushi", "Pad Thai", "Curry", "Arroz frito"), "Gastronomía", "El sushi, de origen japonés, se ha impuesto en Occidente gracias a su presencia masiva en restaurantes y supermercados desde los años 80.")
        ),
        BilingualQuestion(
            id = 50783, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le type de sushi le plus populaire?", listOf("California roll", "Dragon roll", "Philadelphia roll", "Spicy tuna"), "Gastronomie", "Le California roll, créé aux États-Unis dans les années 1970, est le sushi le plus populaire car il utilise de l'avocat et du crabe, évitant le poisson cru pour plaire aux palais occidentaux."),
            en = LocalizedContent("What is the most popular type of sushi?", listOf("California roll", "Dragon roll", "Philadelphia roll", "Spicy tuna"), "Gastronomy", "The California roll, created in the United States in the 1970s, is the most popular sushi because it uses avocado and crab, avoiding raw fish to appeal to Western palates."),
            zh = LocalizedContent("最受欢迎的寿司类型是什么？", listOf("加州卷", "龙卷", "费城卷", "辣金枪鱼"), "美食", "加州卷于20世纪70年代在美国创制，是最受欢迎的寿司，因为它使用鳄梨和蟹肉，避免生鱼以迎合西方口味。"),
            es = LocalizedContent("¿Cuál es el tipo de sushi más popular?", listOf("California roll", "Dragon roll", "Philadelphia roll", "Spicy tuna"), "Gastronomía", "El California roll, creado en Estados Unidos en los años 70, es el sushi más popular porque utiliza aguacate y cangrejo, evitando el pescado crudo para complacer a los paladares occidentales.")
        ),
        BilingualQuestion(
            id = 50784, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le type de curry le plus populaire en Inde?", listOf("Curry rouge", "Curry vert", "Curry jaune", "Tandoori"), "Gastronomie", "Le curry jaune, souvent à base de curcuma, est le plus répandu en Inde, notamment dans les plats quotidiens comme le dal tadka."),
            en = LocalizedContent("What is the most popular type of curry in India?", listOf("Red curry", "Green curry", "Yellow curry", "Tandoori"), "Gastronomy", "Yellow curry, often based on turmeric, is the most widespread in India, especially in daily dishes like dal tadka."),
            zh = LocalizedContent("在印度最受欢迎的咖喱类型是什么？", listOf("红咖喱", "绿咖喱", "黄咖喱", "坦都里"), "美食", "黄咖喱通常以姜黄为基础，在印度最为普遍，尤其是在日常菜肴如豆汤中。"),
            es = LocalizedContent("¿Cuál es el tipo de curry más popular en la India?", listOf("Curry rojo", "Curry verde", "Curry amarillo", "Tandoori"), "Gastronomía", "El curry amarillo, a menudo a base de cúrcuma, es el más extendido en la India, especialmente en platos cotidianos como el dal tadka.")
        ),
        BilingualQuestion(
            id = 50785, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le nombre de types de pâtes en Italie?", listOf("100", "200", "300", "400"), "Gastronomie", "L'Italie compte environ 300 types de pâtes différents, une diversité due aux variations régionales de formes, tailles et recettes traditionnelles."),
            en = LocalizedContent("How many types of pasta are there in Italy?", listOf("100", "200", "300", "400"), "Gastronomy", "Italy has about 300 different types of pasta, a diversity due to regional variations in shapes, sizes, and traditional recipes."),
            zh = LocalizedContent("意大利有多少种面条？", listOf("100", "200", "300", "400"), "美食", "意大利约有300种不同的面条，这种多样性源于形状、大小和传统食谱的地区差异。"),
            es = LocalizedContent("¿Cuántos tipos de pasta hay en Italia?", listOf("100", "200", "300", "400"), "Gastronomía", "Italia cuenta con unos 300 tipos diferentes de pasta, una diversidad debida a las variaciones regionales de formas, tamaños y recetas tradicionales.")
        ),
        BilingualQuestion(
            id = 50786, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe grec a enseigné qu'il faut vivre selon la nature?", listOf("Platon", "Aristote", "Épicure", "Diogène"), "Philosophie", "Diogène, figure majeure du cynisme, prônait un retour à une vie simple et frugale, en accord avec les besoins naturels, rejetant les conventions sociales artificielles."),
            en = LocalizedContent("Which Greek philosopher taught that one should live according to nature?", listOf("Plato", "Aristotle", "Epicurus", "Diogenes"), "Philosophy", "Diogenes, a major figure of Cynicism, advocated a return to a simple and frugal life, in accordance with natural needs, rejecting artificial social conventions."),
            zh = LocalizedContent("哪位希腊哲学家教导人们应该顺应自然生活？", listOf("柏拉图", "亚里士多德", "伊壁鸠鲁", "第欧根尼"), "哲学", "第欧根尼是犬儒主义的主要人物，主张回归简单节俭的生活，符合自然需求，摒弃人为的社会习俗。"),
            es = LocalizedContent("¿Qué filósofo griego enseñó que hay que vivir según la naturaleza?", listOf("Platón", "Aristóteles", "Epicuro", "Diógenes"), "Filosofía", "Diógenes, figura mayor del cinismo, abogaba por un retorno a una vida simple y frugal, de acuerdo con las necesidades naturales, rechazando las convenciones sociales artificiales.")
        ),
        BilingualQuestion(
            id = 50787, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le principe fondamental de la philosophie de Platon?", listOf("Le monde des idées", "La vertu est la connaissance", "La métaphysique de l'essence", "L'éthique de la vertu"), "Philosophie", "Platon distingue le monde sensible, imparfait et changeant, d'un monde intelligible et parfait, celui des Idées, qui sont les modèles éternels de toutes choses."),
            en = LocalizedContent("What is the fundamental principle of Plato's philosophy?", listOf("The world of ideas", "Virtue is knowledge", "Metaphysics of essence", "Ethics of virtue"), "Philosophy", "Plato distinguishes the sensible world, imperfect and changing, from an intelligible and perfect world, that of Ideas, which are the eternal models of all things."),
            zh = LocalizedContent("柏拉图哲学的基本原则是什么？", listOf("理念世界", "美德即知识", "本质的形而上学", "美德伦理学"), "哲学", "柏拉图区分了不完美且变化的感官世界与完美且可理解的理念世界，理念是万物的永恒模型。"),
            es = LocalizedContent("¿Cuál es el principio fundamental de la filosofía de Platón?", listOf("El mundo de las ideas", "La virtud es conocimiento", "La metafísica de la esencia", "La ética de la virtud"), "Filosofía", "Platón distingue el mundo sensible, imperfecto y cambiante, de un mundo inteligible y perfecto, el de las Ideas, que son los modelos eternos de todas las cosas.")
        ),
        BilingualQuestion(
            id = 50788, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le principe fondamental de la philosophie d'Aristote?", listOf("Le monde des idées", "La substance", "La métaphysique de l'essence", "La vertu est la connaissance"), "Philosophie", "Pour Aristote, la substance est le fondement de toute réalité, car elle représente ce qui existe par soi-même et supporte les propriétés accidentelles."),
            en = LocalizedContent("What is the fundamental principle of Aristotle's philosophy?", listOf("The world of ideas", "Substance", "Metaphysics of essence", "Virtue is knowledge"), "Philosophy", "For Aristotle, substance is the foundation of all reality, as it represents what exists by itself and supports accidental properties."),
            zh = LocalizedContent("亚里士多德哲学的基本原则是什么？", listOf("理念世界", "实体", "本质的形而上学", "美德即知识"), "哲学", "对亚里士多德来说，实体是一切现实的基础，因为它代表自身存在并支撑偶然属性。"),
            es = LocalizedContent("¿Cuál es el principio fundamental de la filosofía de Aristóteles?", listOf("El mundo de las ideas", "La sustancia", "La metafísica de la esencia", "La virtud es conocimiento"), "Filosofía", "Para Aristóteles, la sustancia es el fundamento de toda realidad, ya que representa lo que existe por sí mismo y soporta las propiedades accidentales.")
        ),
        BilingualQuestion(
            id = 50789, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel philosophe grec a fondé l'Académie?", listOf("Socrate", "Aristote", "Platon", "Pythagore"), "Philosophie", "Platon a fondé l'Académie à Athènes vers 387 av. J.-C., une école philosophique majeure de l'Antiquité."),
            en = LocalizedContent("Which Greek philosopher founded the Academy?", listOf("Socrates", "Aristotle", "Plato", "Pythagoras"), "Philosophy", "Plato founded the Academy in Athens around 387 BC, a major philosophical school of antiquity."),
            zh = LocalizedContent("哪位希腊哲学家创立了学园？", listOf("苏格拉底", "亚里士多德", "柏拉图", "毕达哥拉斯"), "哲学", "柏拉图于公元前387年左右在雅典创立了学园，这是古代重要的哲学学派。"),
            es = LocalizedContent("¿Qué filósofo griego fundó la Academia?", listOf("Sócrates", "Aristóteles", "Platón", "Pitágoras"), "Filosofía", "Platón fundó la Academia en Atenas hacia el 387 a.C., una importante escuela filosófica de la Antigüedad.")
        ),
        BilingualQuestion(
            id = 50790, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel philosophe grec a fondé le Lycée?", listOf("Socrate", "Aristote", "Platon", "Pythagore"), "Philosophie", "Aristote fonda le Lycée à Athènes en 335 av. J.-C., une école philosophique rivale de l'Académie de Platon."),
            en = LocalizedContent("Which Greek philosopher founded the Lyceum?", listOf("Socrates", "Aristotle", "Plato", "Pythagoras"), "Philosophy", "Aristotle founded the Lyceum in Athens in 335 BC, a philosophical school rivaling Plato's Academy."),
            zh = LocalizedContent("哪位希腊哲学家创立了吕克昂学园？", listOf("苏格拉底", "亚里士多德", "柏拉图", "毕达哥拉斯"), "哲学", "亚里士多德于公元前335年在雅典创立了吕克昂学园，这是一所与柏拉图学园竞争的哲学学校。"),
            es = LocalizedContent("¿Qué filósofo griego fundó el Liceo?", listOf("Sócrates", "Aristóteles", "Platón", "Pitágoras"), "Filosofía", "Aristóteles fundó el Liceo en Atenas en el 335 a.C., una escuela filosófica rival de la Academia de Platón.")
        ),
        BilingualQuestion(
            id = 50791, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le principe fondamental de la philosophie de Socrate?", listOf("La vertu est la connaissance", "Le monde des idées", "L'essence et la substance", "La sagesse est ignorance"), "Philosophie", "Socrate affirmait que personne ne fait le mal volontairement, car agir mal résulte d'une ignorance du bien. Ainsi, acquérir la connaissance mène nécessairement à la vertu."),
            en = LocalizedContent("What is the fundamental principle of Socrates' philosophy?", listOf("Virtue is knowledge", "The world of ideas", "Essence and substance", "Wisdom is ignorance"), "Philosophy", "Socrates asserted that no one does evil willingly, as wrongdoing results from ignorance of the good. Thus, acquiring knowledge necessarily leads to virtue."),
            zh = LocalizedContent("苏格拉底哲学的基本原则是什么？", listOf("美德即知识", "理念世界", "本质与实体", "智慧即无知"), "哲学", "苏格拉底主张无人自愿作恶，因为作恶源于对善的无知。因此，获得知识必然导向美德。"),
            es = LocalizedContent("¿Cuál es el principio fundamental de la filosofía de Sócrates?", listOf("La virtud es conocimiento", "El mundo de las ideas", "La esencia y la sustancia", "La sabiduría es ignorancia"), "Filosofía", "Sócrates afirmaba que nadie hace el mal voluntariamente, ya que obrar mal resulta de la ignorancia del bien. Así, adquirir conocimiento conduce necesariamente a la virtud.")
        ),
        BilingualQuestion(
            id = 50792, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe a énoncé le doute méthodique?", listOf("Descartes", "Spinoza", "Kant", "Leibniz"), "Philosophie", "Descartes a formulé le doute méthodique dans ses Méditations métaphysiques comme un outil pour parvenir à une certitude absolue, en remettant en cause toutes les connaissances jusqu'à trouver le cogito."),
            en = LocalizedContent("Which philosopher formulated methodic doubt?", listOf("Descartes", "Spinoza", "Kant", "Leibniz"), "Philosophy", "Descartes formulated methodic doubt in his Meditations on First Philosophy as a tool to achieve absolute certainty by questioning all knowledge until reaching the cogito."),
            zh = LocalizedContent("哪位哲学家提出了方法论怀疑？", listOf("笛卡尔", "斯宾诺莎", "康德", "莱布尼茨"), "哲学", "笛卡尔在《第一哲学沉思集》中提出了方法论怀疑，作为一种通过质疑所有知识直至找到“我思”来达到绝对确定性的工具。"),
            es = LocalizedContent("¿Qué filósofo enunció la duda metódica?", listOf("Descartes", "Spinoza", "Kant", "Leibniz"), "Filosofía", "Descartes formuló la duda metódica en sus Meditaciones metafísicas como una herramienta para alcanzar una certeza absoluta, cuestionando todos los conocimientos hasta encontrar el cogito.")
        ),
        BilingualQuestion(
            id = 50793, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le point de départ du cogito cartésien?", listOf("Je suis", "Je pense donc je suis", "Je doute donc je suis", "Je sens donc je suis"), "Philosophie", "Le cogito cartésien part du doute méthodique : Descartes cherche une certitude indubitable et trouve que le fait même de douter prouve l'existence d'un sujet pensant."),
            en = LocalizedContent("What is the starting point of the Cartesian cogito?", listOf("I am", "I think therefore I am", "I doubt therefore I am", "I feel therefore I am"), "Philosophy", "The Cartesian cogito starts from methodic doubt: Descartes seeks an indubitable certainty and finds that the very act of doubting proves the existence of a thinking subject."),
            zh = LocalizedContent("笛卡尔“我思”的出发点是什么？", listOf("我是", "我思故我在", "我疑故我在", "我感觉故我在"), "哲学", "笛卡尔的“我思”始于方法论怀疑：他寻找无可置疑的确定性，发现怀疑本身证明了思考主体的存在。"),
            es = LocalizedContent("¿Cuál es el punto de partida del cogito cartesiano?", listOf("Soy", "Pienso, luego existo", "Dudo, luego existo", "Siento, luego existo"), "Filosofía", "El cogito cartesiano parte de la duda metódica: Descartes busca una certeza indubitable y encuentra que el mismo hecho de dudar prueba la existencia de un sujeto pensante.")
        ),
        BilingualQuestion(
            id = 50794, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe a théorisé le contrat social?", listOf("Hobbes", "Rousseau", "Locke", "Montesquieu"), "Philosophie", "Dans son ouvrage Du contrat social (1762), Rousseau développe l'idée que la légitimité politique repose sur un accord volontaire entre les citoyens."),
            en = LocalizedContent("Which philosopher theorized the social contract?", listOf("Hobbes", "Rousseau", "Locke", "Montesquieu"), "Philosophy", "In his work The Social Contract (1762), Rousseau developed the idea that political legitimacy rests on a voluntary agreement among citizens."),
            zh = LocalizedContent("哪位哲学家提出了社会契约论？", listOf("霍布斯", "卢梭", "洛克", "孟德斯鸠"), "哲学", "卢梭在其著作《社会契约论》（1762年）中阐述了政治合法性基于公民之间自愿协议的思想。"),
            es = LocalizedContent("¿Qué filósofo teorizó el contrato social?", listOf("Hobbes", "Rousseau", "Locke", "Montesquieu"), "Filosofía", "En su obra El contrato social (1762), Rousseau desarrolló la idea de que la legitimidad política se basa en un acuerdo voluntario entre los ciudadanos.")
        ),
        BilingualQuestion(
            id = 50795, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe a énoncé que l'homme naît libre?", listOf("Hobbes", "Rousseau", "Locke", "Montesquieu"), "Philosophie", "Dans *Du contrat social* (1762), Rousseau affirme que l'homme naît libre mais que la société le corrompt, posant les bases de sa philosophie politique sur la souveraineté populaire."),
            en = LocalizedContent("Which philosopher stated that man is born free?", listOf("Hobbes", "Rousseau", "Locke", "Montesquieu"), "Philosophy", "In The Social Contract (1762), Rousseau asserts that man is born free but society corrupts him, laying the foundations of his political philosophy on popular sovereignty."),
            zh = LocalizedContent("哪位哲学家宣称人生而自由？", listOf("霍布斯", "卢梭", "洛克", "孟德斯鸠"), "哲学", "卢梭在《社会契约论》（1762年）中断言人生而自由，但社会腐蚀了他，这为其基于人民主权的政治哲学奠定了基础。"),
            es = LocalizedContent("¿Qué filósofo afirmó que el hombre nace libre?", listOf("Hobbes", "Rousseau", "Locke", "Montesquieu"), "Filosofía", "En El contrato social (1762), Rousseau afirma que el hombre nace libre pero la sociedad lo corrompe, sentando las bases de su filosofía política sobre la soberanía popular.")
        ),
        BilingualQuestion(
            id = 50796, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept central de la critique kantienne?", listOf("Les catégories de l'entendement", "Le phénomène et le noumène", "La raison pure", "L'impératif catégorique"), "Philosophie", "Kant distingue le phénomène (ce qui apparaît à notre sensibilité) du noumène (la chose en soi, inaccessible à la connaissance). Cette distinction est centrale dans sa critique de la raison pure."),
            en = LocalizedContent("What is the central concept of Kantian critique?", listOf("Categories of understanding", "Phenomenon and noumenon", "Pure reason", "Categorical imperative"), "Philosophy", "Kant distinguishes the phenomenon (what appears to our sensibility) from the noumenon (the thing in itself, inaccessible to knowledge). This distinction is central to his critique of pure reason."),
            zh = LocalizedContent("康德批判哲学的核心概念是什么？", listOf("知性范畴", "现象与物自体", "纯粹理性", "绝对命令"), "哲学", "康德区分了现象（呈现于我们感性的东西）与物自体（自在之物，不可认知）。这一区分是其纯粹理性批判的核心。"),
            es = LocalizedContent("¿Cuál es el concepto central de la crítica kantiana?", listOf("Las categorías del entendimiento", "El fenómeno y el noúmeno", "La razón pura", "El imperativo categórico"), "Filosofía", "Kant distingue el fenómeno (lo que aparece a nuestra sensibilidad) del noúmeno (la cosa en sí, inaccesible al conocimiento). Esta distinción es central en su crítica de la razón pura.")
        ),
        BilingualQuestion(
            id = 50797, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe a développé la dialectique?", listOf("Hegel", "Marx", "Engels", "Feuerbach"), "Philosophie", "Hegel a formalisé la dialectique comme un processus triadique (thèse, antithèse, synthèse) pour expliquer le développement de l'Esprit et de l'histoire."),
            en = LocalizedContent("Which philosopher developed dialectics?", listOf("Hegel", "Marx", "Engels", "Feuerbach"), "Philosophy", "Hegel formalized dialectics as a triadic process (thesis, antithesis, synthesis) to explain the development of Spirit and history."),
            zh = LocalizedContent("哪位哲学家发展了辩证法？", listOf("黑格尔", "马克思", "恩格斯", "费尔巴哈"), "哲学", "黑格尔将辩证法形式化为一个三元过程（正题、反题、合题），用以解释精神和历史的发展。"),
            es = LocalizedContent("¿Qué filósofo desarrolló la dialéctica?", listOf("Hegel", "Marx", "Engels", "Feuerbach"), "Filosofía", "Hegel formalizó la dialéctica como un proceso triádico (tesis, antítesis, síntesis) para explicar el desarrollo del Espíritu y la historia.")
        ),
        BilingualQuestion(
            id = 50798, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe a énoncé le matérialisme dialectique?", listOf("Hegel", "Marx", "Engels", "Feuerbach"), "Philosophie", "Marx a développé le matérialisme dialectique avec Engels, en appliquant la dialectique hégélienne à une conception matérialiste de l'histoire et de la nature."),
            en = LocalizedContent("Which philosopher formulated dialectical materialism?", listOf("Hegel", "Marx", "Engels", "Feuerbach"), "Philosophy", "Marx developed dialectical materialism with Engels, applying Hegelian dialectics to a materialist conception of history and nature."),
            zh = LocalizedContent("哪位哲学家提出了辩证唯物主义？", listOf("黑格尔", "马克思", "恩格斯", "费尔巴哈"), "哲学", "马克思与恩格斯共同发展了辩证唯物主义，将黑格尔辩证法应用于唯物主义的历史和自然观。"),
            es = LocalizedContent("¿Qué filósofo formuló el materialismo dialéctico?", listOf("Hegel", "Marx", "Engels", "Feuerbach"), "Filosofía", "Marx desarrolló el materialismo dialéctico con Engels, aplicando la dialéctica hegeliana a una concepción materialista de la historia y la naturaleza.")
        ),
        BilingualQuestion(
            id = 50799, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept central du stoïcisme?", listOf("L'apatheia", "L'ataraxia", "La virtus", "La sabientia"), "Philosophie", "L'apatheia désigne l'absence de passions irrationnelles, permettant au sage stoïcien de rester serein face aux événements extérieurs."),
            en = LocalizedContent("What is the central concept of Stoicism?", listOf("Apatheia", "Ataraxia", "Virtus", "Sabientia"), "Philosophy", "Apatheia denotes the absence of irrational passions, allowing the Stoic sage to remain serene in the face of external events."),
            zh = LocalizedContent("斯多葛主义的核心概念是什么？", listOf("无感", "不动心", "美德", "智慧"), "哲学", "Apatheia（无感）指没有非理性激情，使斯多葛智者面对外部事件时保持平静。"),
            es = LocalizedContent("¿Cuál es el concepto central del estoicismo?", listOf("Apatheia", "Ataraxia", "Virtus", "Sabientia"), "Filosofía", "La apatheia designa la ausencia de pasiones irracionales, permitiendo al sabio estoico permanecer sereno ante los eventos externos.")
        ),
    )

    private fun part4(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 50800, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le concept central de l'épicurisme?", listOf("Le plaisir", "L'ataraxia", "L'apatheia", "La virtus"), "Philosophie", "Pour les épicuriens, le plaisir est le souverain bien, car il est le seul motif naturel de nos actions et le critère du bonheur, à condition d'être choisi avec raison pour éviter la douleur."),
            en = LocalizedContent("What is the central concept of Epicureanism?", listOf("Pleasure", "Ataraxia", "Apatheia", "Virtus"), "Philosophy", "For Epicureans, pleasure is the highest good, as it is the only natural motive for our actions and the criterion of happiness, provided it is chosen with reason to avoid pain."),
            zh = LocalizedContent("伊壁鸠鲁主义的核心概念是什么？", listOf("快乐", "不动心", "无感", "美德"), "哲学", "对于伊壁鸠鲁学派来说，快乐是至善，因为它是我们行动的唯一自然动机和幸福的标准，但必须理性选择以避免痛苦。"),
            es = LocalizedContent("¿Cuál es el concepto central del epicureísmo?", listOf("El placer", "La ataraxia", "La apatía", "La virtud"), "Filosofía", "Para los epicúreos, el placer es el bien supremo, ya que es el único motivo natural de nuestras acciones y el criterio de la felicidad, siempre que se elija con razón para evitar el dolor.")
        ),
        BilingualQuestion(
            id = 50801, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel philosophe a énoncé le nihilisme?", listOf("Nietzsche", "Schopenhauer", "Heidegger", "Jaspers"), "Philosophie", "Friedrich Nietzsche a popularisé le concept de nihilisme, notamment dans ses œuvres comme \"Ainsi parlait Zarathoustra\", où il annonce la \"mort de Dieu\" et la perte des valeurs absolues."),
            en = LocalizedContent("Which philosopher articulated nihilism?", listOf("Nietzsche", "Schopenhauer", "Heidegger", "Jaspers"), "Philosophy", "Friedrich Nietzsche popularized the concept of nihilism, especially in works like \"Thus Spoke Zarathustra,\" where he announces the \"death of God\" and the loss of absolute values."),
            zh = LocalizedContent("哪位哲学家阐述了虚无主义？", listOf("尼采", "叔本华", "海德格尔", "雅斯贝尔斯"), "哲学", "弗里德里希·尼采普及了虚无主义的概念，特别是在《查拉图斯特拉如是说》等作品中，他宣告了“上帝之死”和绝对价值的丧失。"),
            es = LocalizedContent("¿Qué filósofo enunció el nihilismo?", listOf("Nietzsche", "Schopenhauer", "Heidegger", "Jaspers"), "Filosofía", "Friedrich Nietzsche popularizó el concepto de nihilismo, especialmente en obras como \"Así habló Zaratustra\", donde anuncia la \"muerte de Dios\" y la pérdida de los valores absolutos.")
        ),
        BilingualQuestion(
            id = 50802, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe a développé l'existentialisme?", listOf("Sartre", "Heidegger", "Camus", "Merleau-Ponty"), "Philosophie", "Sartre a popularisé l'existentialisme dans son œuvre \"L'Être et le Néant\" (1943), affirmant que l'existence précède l'essence et que l'homme est libre de se définir par ses choix."),
            en = LocalizedContent("Which philosopher developed existentialism?", listOf("Sartre", "Heidegger", "Camus", "Merleau-Ponty"), "Philosophy", "Sartre popularized existentialism in his work \"Being and Nothingness\" (1943), asserting that existence precedes essence and that man is free to define himself through his choices."),
            zh = LocalizedContent("哪位哲学家发展了存在主义？", listOf("萨特", "海德格尔", "加缪", "梅洛-庞蒂"), "哲学", "萨特在其著作《存在与虚无》（1943年）中普及了存在主义，主张存在先于本质，人可以通过自己的选择自由地定义自己。"),
            es = LocalizedContent("¿Qué filósofo desarrolló el existencialismo?", listOf("Sartre", "Heidegger", "Camus", "Merleau-Ponty"), "Filosofía", "Sartre popularizó el existencialismo en su obra \"El ser y la nada\" (1943), afirmando que la existencia precede a la esencia y que el hombre es libre de definirse a través de sus elecciones.")
        ),
        BilingualQuestion(
            id = 50803, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept central du bouddhisme?", listOf("L'illumination", "Le nirvana", "Le karma", "La souffrance"), "Philosophie", "Le nirvana représente l'extinction de la souffrance et du cycle des renaissances dans le bouddhisme, atteint par l'élimination du désir et de l'ignorance."),
            en = LocalizedContent("What is the central concept of Buddhism?", listOf("Enlightenment", "Nirvana", "Karma", "Suffering"), "Philosophy", "Nirvana represents the extinction of suffering and the cycle of rebirths in Buddhism, achieved by eliminating desire and ignorance."),
            zh = LocalizedContent("佛教的核心概念是什么？", listOf("觉悟", "涅槃", "业", "苦"), "哲学", "涅槃在佛教中代表痛苦和轮回的熄灭，通过消除欲望和无明而达到。"),
            es = LocalizedContent("¿Cuál es el concepto central del budismo?", listOf("La iluminación", "El nirvana", "El karma", "El sufrimiento"), "Filosofía", "El nirvana representa la extinción del sufrimiento y el ciclo de renacimientos en el budismo, alcanzado mediante la eliminación del deseo y la ignorancia.")
        ),
        BilingualQuestion(
            id = 50804, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept central du confucianisme?", listOf("L'ordre social", "La vertu", "La piété filiale", "La bienveillance"), "Philosophie", "La piété filiale, ou le respect des parents et des ancêtres, est le fondement de l'ordre social et moral dans la pensée de Confucius."),
            en = LocalizedContent("What is the central concept of Confucianism?", listOf("Social order", "Virtue", "Filial piety", "Benevolence"), "Philosophy", "Filial piety, or respect for parents and ancestors, is the foundation of social and moral order in Confucius's thought."),
            zh = LocalizedContent("儒家的核心概念是什么？", listOf("社会秩序", "德", "孝", "仁"), "哲学", "孝，即对父母和祖先的尊敬，是孔子思想中社会道德秩序的基础。"),
            es = LocalizedContent("¿Cuál es el concepto central del confucianismo?", listOf("El orden social", "La virtud", "La piedad filial", "La benevolencia"), "Filosofía", "La piedad filial, o el respeto a los padres y antepasados, es el fundamento del orden social y moral en el pensamiento de Confucio.")
        ),
        BilingualQuestion(
            id = 50805, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept central du taoïsme?", listOf("Le Tao", "Le Chi", "Le Yin et le Yang", "La vertu"), "Philosophie", "Le Tao est le principe fondamental du taoïsme, représentant l'ordre naturel et la voie de l'univers, autour duquel s'articulent tous les enseignements de cette philosophie chinoise."),
            en = LocalizedContent("What is the central concept of Taoism?", listOf("The Tao", "Chi", "Yin and Yang", "Virtue"), "Philosophy", "The Tao is the fundamental principle of Taoism, representing the natural order and the way of the universe, around which all teachings of this Chinese philosophy revolve."),
            zh = LocalizedContent("道家的核心概念是什么？", listOf("道", "气", "阴阳", "德"), "哲学", "道是道家的基本原则，代表自然秩序和宇宙之道，围绕它展开这一中国哲学的所有教义。"),
            es = LocalizedContent("¿Cuál es el concepto central del taoísmo?", listOf("El Tao", "El Chi", "El Yin y el Yang", "La virtud"), "Filosofía", "El Tao es el principio fundamental del taoísmo, que representa el orden natural y el camino del universo, en torno al cual giran todas las enseñanzas de esta filosofía china.")
        ),
        BilingualQuestion(
            id = 50806, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe a énoncé que Dieu est mort?", listOf("Hegel", "Nietzsche", "Feuerbach", "Strauss"), "Philosophie", "Nietzsche a proclamé la mort de Dieu dans son ouvrage Le Gai Savoir (1882) pour critiquer le déclin de la foi religieuse dans la société moderne et annoncer l'avènement d'une nouvelle ère où l'homme doit créer ses propres valeurs."),
            en = LocalizedContent("Which philosopher stated that God is dead?", listOf("Hegel", "Nietzsche", "Feuerbach", "Strauss"), "Philosophy", "Nietzsche proclaimed the death of God in his work \"The Gay Science\" (1882) to criticize the decline of religious faith in modern society and announce the advent of a new era where man must create his own values."),
            zh = LocalizedContent("哪位哲学家宣称上帝已死？", listOf("黑格尔", "尼采", "费尔巴哈", "施特劳斯"), "哲学", "尼采在其著作《快乐的科学》（1882年）中宣告了上帝之死，以批判现代社会宗教信仰的衰落，并预示一个人类必须创造自身价值的新时代。"),
            es = LocalizedContent("¿Qué filósofo enunció que Dios ha muerto?", listOf("Hegel", "Nietzsche", "Feuerbach", "Strauss"), "Filosofía", "Nietzsche proclamó la muerte de Dios en su obra \"La gaya ciencia\" (1882) para criticar el declive de la fe religiosa en la sociedad moderna y anunciar el advenimiento de una nueva era en la que el hombre debe crear sus propios valores.")
        ),
        BilingualQuestion(
            id = 50807, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept central de la phénoménologie?", listOf("L'essence", "L'intentionnalité", "La substance", "Le phénomène"), "Philosophie", "L'intentionnalité désigne la propriété de la conscience d'être toujours dirigée vers un objet, un concept fondamental pour Husserl et la phénoménologie."),
            en = LocalizedContent("What is the central concept of phenomenology?", listOf("Essence", "Intentionality", "Substance", "Phenomenon"), "Philosophy", "Intentionality refers to the property of consciousness of always being directed toward an object, a fundamental concept for Husserl and phenomenology."),
            zh = LocalizedContent("现象学的核心概念是什么？", listOf("本质", "意向性", "实体", "现象"), "哲学", "意向性是指意识总是指向某个对象的特性，这是胡塞尔和现象学的基本概念。"),
            es = LocalizedContent("¿Cuál es el concepto central de la fenomenología?", listOf("La esencia", "La intencionalidad", "La sustancia", "El fenómeno"), "Filosofía", "La intencionalidad designa la propiedad de la conciencia de estar siempre dirigida hacia un objeto, un concepto fundamental para Husserl y la fenomenología.")
        ),
        BilingualQuestion(
            id = 50808, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel philosophe a développé la phénoménologie?", listOf("Husserl", "Heidegger", "Merleau-Ponty", "Sartre"), "Philosophie", "Edmund Husserl a fondé la phénoménologie au début du XXe siècle comme méthode d'analyse des structures de la conscience et des phénomènes tels qu'ils apparaissent."),
            en = LocalizedContent("Which philosopher developed phenomenology?", listOf("Husserl", "Heidegger", "Merleau-Ponty", "Sartre"), "Philosophy", "Edmund Husserl founded phenomenology in the early 20th century as a method for analyzing the structures of consciousness and phenomena as they appear."),
            zh = LocalizedContent("哪位哲学家发展了现象学？", listOf("胡塞尔", "海德格尔", "梅洛-庞蒂", "萨特"), "哲学", "埃德蒙德·胡塞尔在20世纪初创立了现象学，作为一种分析意识结构和现象显现的方法。"),
            es = LocalizedContent("¿Qué filósofo desarrolló la fenomenología?", listOf("Husserl", "Heidegger", "Merleau-Ponty", "Sartre"), "Filosofía", "Edmund Husserl fundó la fenomenología a principios del siglo XX como un método para analizar las estructuras de la conciencia y los fenómenos tal como aparecen.")
        ),
        BilingualQuestion(
            id = 50809, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept central du pragmatisme?", listOf("L'utilité", "L'efficacité", "La conséquence", "La vérité"), "Philosophie", "Le pragmatisme évalue la vérité d'une idée à l'aune de ses effets pratiques et de ses conséquences concrètes dans l'expérience."),
            en = LocalizedContent("What is the central concept of pragmatism?", listOf("Utility", "Efficiency", "Consequence", "Truth"), "Philosophy", "Pragmatism evaluates the truth of an idea based on its practical effects and concrete consequences in experience."),
            zh = LocalizedContent("实用主义的核心概念是什么？", listOf("效用", "效率", "后果", "真理"), "哲学", "实用主义根据观念的实际效果和经验中的具体后果来评估其真理性。"),
            es = LocalizedContent("¿Cuál es el concepto central del pragmatismo?", listOf("La utilidad", "La eficacia", "La consecuencia", "La verdad"), "Filosofía", "El pragmatismo evalúa la verdad de una idea en función de sus efectos prácticos y consecuencias concretas en la experiencia.")
        ),
        BilingualQuestion(
            id = 50810, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel philosophe a énoncé le principium identitatis indiscernibilium?", listOf("Descartes", "Leibniz", "Spinoza", "Newton"), "Philosophie", "Leibniz a formulé ce principe d'identité des indiscernables, affirmant que deux entités distinctes ne peuvent avoir toutes leurs propriétés en commun."),
            en = LocalizedContent("Which philosopher enunciated the principium identitatis indiscernibilium?", listOf("Descartes", "Leibniz", "Spinoza", "Newton"), "Philosophy", "Leibniz formulated this principle of the identity of indiscernibles, stating that two distinct entities cannot have all their properties in common."),
            zh = LocalizedContent("哪位哲学家提出了不可分辨者的同一性原则？", listOf("笛卡尔", "莱布尼茨", "斯宾诺莎", "牛顿"), "哲学", "莱布尼茨提出了这一不可分辨者的同一性原则，认为两个不同的实体不可能拥有所有相同的属性。"),
            es = LocalizedContent("¿Qué filósofo enunció el principium identitatis indiscernibilium?", listOf("Descartes", "Leibniz", "Spinoza", "Newton"), "Filosofía", "Leibniz formuló este principio de identidad de los indiscernibles, afirmando que dos entidades distintas no pueden tener todas sus propiedades en común.")
        ),
        BilingualQuestion(
            id = 50811, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept central du rationalisme?", listOf("La raison", "L'expérience", "L'intuition", "La sensation"), "Philosophie", "Le rationalisme affirme que la raison est la source principale de la connaissance, s'opposant à l'empirisme qui privilégie l'expérience sensorielle."),
            en = LocalizedContent("What is the central concept of rationalism?", listOf("Reason", "Experience", "Intuition", "Sensation"), "Philosophy", "Rationalism asserts that reason is the main source of knowledge, opposing empiricism which prioritizes sensory experience."),
            zh = LocalizedContent("理性主义的核心概念是什么？", listOf("理性", "经验", "直觉", "感觉"), "哲学", "理性主义主张理性是知识的主要来源，与强调感官经验的经验主义相对立。"),
            es = LocalizedContent("¿Cuál es el concepto central del racionalismo?", listOf("La razón", "La experiencia", "La intuición", "La sensación"), "Filosofía", "El racionalismo afirma que la razón es la fuente principal del conocimiento, oponiéndose al empirismo que privilegia la experiencia sensorial.")
        ),
        BilingualQuestion(
            id = 50812, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept central de l'empirisme?", listOf("La raison", "L'expérience", "L'intuition", "La sensation"), "Philosophie", "L'empirisme affirme que toute connaissance humaine provient de l'expérience sensorielle, rejetant les idées innées."),
            en = LocalizedContent("What is the central concept of empiricism?", listOf("Reason", "Experience", "Intuition", "Sensation"), "Philosophy", "Empiricism asserts that all human knowledge comes from sensory experience, rejecting innate ideas."),
            zh = LocalizedContent("经验主义的核心概念是什么？", listOf("理性", "经验", "直觉", "感觉"), "哲学", "经验主义主张所有人类知识都来自感官经验，拒绝先天观念。"),
            es = LocalizedContent("¿Cuál es el concepto central del empirismo?", listOf("La razón", "La experiencia", "La intuición", "La sensación"), "Filosofía", "El empirismo afirma que todo conocimiento humano proviene de la experiencia sensorial, rechazando las ideas innatas.")
        ),
        BilingualQuestion(
            id = 50813, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel philosophe a énoncé que la vérité est la correspondance?", listOf("Descartes", "Kant", "Frege", "Russell"), "Philosophie", "Gottlob Frege a développé la théorie de la vérité comme correspondance dans le cadre de sa philosophie du langage et de la logique, où une proposition est vraie si elle correspond aux faits du monde."),
            en = LocalizedContent("Which philosopher stated that truth is correspondence?", listOf("Descartes", "Kant", "Frege", "Russell"), "Philosophy", "Gottlob Frege developed the correspondence theory of truth within his philosophy of language and logic, where a proposition is true if it corresponds to the facts of the world."),
            zh = LocalizedContent("哪位哲学家提出真理即符合？", listOf("笛卡尔", "康德", "弗雷格", "罗素"), "哲学", "戈特洛布·弗雷格在其语言哲学和逻辑学框架内发展了真理符合论，认为一个命题如果与世界的事实相符则为真。"),
            es = LocalizedContent("¿Qué filósofo enunció que la verdad es la correspondencia?", listOf("Descartes", "Kant", "Frege", "Russell"), "Filosofía", "Gottlob Frege desarrolló la teoría de la verdad como correspondencia en el marco de su filosofía del lenguaje y la lógica, donde una proposición es verdadera si se corresponde con los hechos del mundo.")
        ),
        BilingualQuestion(
            id = 50814, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel philosophe a énoncé que la vérité est la cohérence?", listOf("Descartes", "Hegel", "Russell", "Frege"), "Philosophie", "Pour Hegel, la vérité ne se trouve pas dans une correspondance simple entre l'idée et la réalité, mais dans la cohérence interne d'un système logique en développement dialectique."),
            en = LocalizedContent("Which philosopher stated that truth is coherence?", listOf("Descartes", "Hegel", "Russell", "Frege"), "Philosophy", "For Hegel, truth is not found in a simple correspondence between idea and reality, but in the internal coherence of a logical system in dialectical development."),
            zh = LocalizedContent("哪位哲学家提出真理即融贯？", listOf("笛卡尔", "黑格尔", "罗素", "弗雷格"), "哲学", "对于黑格尔而言，真理不在于观念与现实的简单符合，而在于辩证发展中的逻辑系统的内在融贯性。"),
            es = LocalizedContent("¿Qué filósofo enunció que la verdad es la coherencia?", listOf("Descartes", "Hegel", "Russell", "Frege"), "Filosofía", "Para Hegel, la verdad no se encuentra en una simple correspondencia entre la idea y la realidad, sino en la coherencia interna de un sistema lógico en desarrollo dialéctico.")
        ),
        BilingualQuestion(
            id = 50815, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe a énoncé le principe de non-contradiction?", listOf("Héraclite", "Aristote", "Platon", "Socrate"), "Philosophie", "Aristote a formulé ce principe fondamental de la logique dans son ouvrage *Métaphysique*, affirmant qu'une chose ne peut pas être et ne pas être en même temps sous le même rapport."),
            en = LocalizedContent("Which philosopher enunciated the principle of non-contradiction?", listOf("Heraclitus", "Aristotle", "Plato", "Socrates"), "Philosophy", "Aristotle formulated this fundamental principle of logic in his work *Metaphysics*, stating that a thing cannot both be and not be in the same respect at the same time."),
            zh = LocalizedContent("哪位哲学家提出了不矛盾律？", listOf("赫拉克利特", "亚里士多德", "柏拉图", "苏格拉底"), "哲学", "亚里士多德在其著作《形而上学》中阐述了这一逻辑基本法则，认为同一事物在同一方面不能同时存在又不存在。"),
            es = LocalizedContent("¿Qué filósofo enunció el principio de no contradicción?", listOf("Heráclito", "Aristóteles", "Platón", "Sócrates"), "Filosofía", "Aristóteles formuló este principio fundamental de la lógica en su obra *Metafísica*, afirmando que una cosa no puede ser y no ser al mismo tiempo bajo el mismo aspecto.")
        ),
        BilingualQuestion(
            id = 50816, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept central du déterminisme?", listOf("Le libre arbitre", "La causalité", "L'indéterminisme", "Le hasard"), "Philosophie", "Le déterminisme repose sur l'idée que tout événement, y compris les actions humaines, est causé par des facteurs antérieurs. La causalité en est donc le principe fondamental."),
            en = LocalizedContent("What is the central concept of determinism?", listOf("Free will", "Causality", "Indeterminism", "Chance"), "Philosophy", "Determinism is based on the idea that every event, including human actions, is caused by prior factors. Causality is therefore its fundamental principle."),
            zh = LocalizedContent("决定论的核心概念是什么？", listOf("自由意志", "因果性", "非决定论", "偶然"), "哲学", "决定论基于每个事件（包括人类行为）都由先前因素引起的观点，因此因果性是它的基本原则。"),
            es = LocalizedContent("¿Cuál es el concepto central del determinismo?", listOf("El libre albedrío", "La causalidad", "El indeterminismo", "El azar"), "Filosofía", "El determinismo se basa en la idea de que todo evento, incluidas las acciones humanas, es causado por factores anteriores. Por lo tanto, la causalidad es su principio fundamental.")
        ),
        BilingualQuestion(
            id = 50817, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel philosophe a énoncé la théorie de l'harmonie préétablie?", listOf("Descartes", "Spinoza", "Leibniz", "Newton"), "Philosophie", "Leibniz a développé cette théorie pour expliquer l'interaction entre l'âme et le corps, selon laquelle Dieu a créé l'univers de sorte que tout se déroule en parallèle sans influence causale directe."),
            en = LocalizedContent("Which philosopher enunciated the theory of pre-established harmony?", listOf("Descartes", "Spinoza", "Leibniz", "Newton"), "Philosophy", "Leibniz developed this theory to explain the interaction between soul and body, according to which God created the universe so that everything runs in parallel without direct causal influence."),
            zh = LocalizedContent("哪位哲学家提出了预定和谐理论？", listOf("笛卡尔", "斯宾诺莎", "莱布尼茨", "牛顿"), "哲学", "莱布尼茨提出了这一理论来解释灵魂与身体的相互作用，认为上帝创造了宇宙，使得一切平行运行，没有直接的因果影响。"),
            es = LocalizedContent("¿Qué filósofo enunció la teoría de la armonía preestablecida?", listOf("Descartes", "Spinoza", "Leibniz", "Newton"), "Filosofía", "Leibniz desarrolló esta teoría para explicar la interacción entre el alma y el cuerpo, según la cual Dios creó el universo de modo que todo transcurre en paralelo sin influencia causal directa.")
        ),
        BilingualQuestion(
            id = 50818, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept central du monisme?", listOf("L'existence d'une seule substance", "L'existence de deux substances", "L'existence de plusieurs substances", "L'absence de substance"), "Philosophie", "Le monisme affirme que toute réalité se réduit à une seule substance ou principe fondamental, par opposition au dualisme qui en admet deux."),
            en = LocalizedContent("What is the central concept of monism?", listOf("The existence of a single substance", "The existence of two substances", "The existence of several substances", "The absence of substance"), "Philosophy", "Monism asserts that all reality reduces to a single substance or fundamental principle, as opposed to dualism which admits two."),
            zh = LocalizedContent("一元论的核心概念是什么？", listOf("存在单一实体", "存在两个实体", "存在多个实体", "没有实体"), "哲学", "一元论主张所有现实都可归结为单一实体或基本原则，与承认两个实体的二元论相对。"),
            es = LocalizedContent("¿Cuál es el concepto central del monismo?", listOf("La existencia de una sola sustancia", "La existencia de dos sustancias", "La existencia de varias sustancias", "La ausencia de sustancia"), "Filosofía", "El monismo afirma que toda realidad se reduce a una sola sustancia o principio fundamental, en oposición al dualismo que admite dos.")
        ),
        BilingualQuestion(
            id = 50819, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept central du dualisme?", listOf("L'existence d'une seule substance", "L'existence de deux substances", "L'existence de plusieurs substances", "L'absence de substance"), "Philosophie", "Le dualisme, notamment chez Descartes, oppose la substance pensante (l'esprit) à la substance étendue (le corps), affirmant leur indépendance radicale."),
            en = LocalizedContent("What is the central concept of dualism?", listOf("The existence of a single substance", "The existence of two substances", "The existence of several substances", "The absence of substance"), "Philosophy", "Dualism, notably in Descartes, opposes the thinking substance (mind) to the extended substance (body), asserting their radical independence."),
            zh = LocalizedContent("二元论的核心概念是什么？", listOf("存在单一实体", "存在两个实体", "存在多个实体", "没有实体"), "哲学", "二元论，尤其是笛卡尔的二元论，将思维实体（心灵）与广延实体（身体）对立起来，主张它们的根本独立性。"),
            es = LocalizedContent("¿Cuál es el concepto central del dualismo?", listOf("La existencia de una sola sustancia", "La existencia de dos sustancias", "La existencia de varias sustancias", "La ausencia de sustancia"), "Filosofía", "El dualismo, especialmente en Descartes, opone la sustancia pensante (la mente) a la sustancia extensa (el cuerpo), afirmando su independencia radical.")
        ),
        BilingualQuestion(
            id = 50820, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept central du matérialisme?", listOf("La matière est la réalité fondamentale", "L'esprit est la réalité fondamentale", "Les deux coexistent", "Aucune réalité fondamentale"), "Philosophie", "Le matérialisme affirme que toute réalité, y compris la conscience, découle de la matière. Cette position s'oppose à l'idéalisme, qui place l'esprit ou les idées à l'origine de tout."),
            en = LocalizedContent("What is the central concept of materialism?", listOf("Matter is the fundamental reality", "Mind is the fundamental reality", "Both coexist", "No fundamental reality"), "Philosophy", "Materialism asserts that all reality, including consciousness, derives from matter. This position opposes idealism, which places mind or ideas at the origin of everything."),
            zh = LocalizedContent("唯物主义的核心概念是什么？", listOf("物质是基本现实", "精神是基本现实", "两者共存", "没有基本现实"), "哲学", "唯物主义认为所有现实，包括意识，都源于物质。这一立场与唯心主义相对，后者认为精神或观念是万物的起源。"),
            es = LocalizedContent("¿Cuál es el concepto central del materialismo?", listOf("La materia es la realidad fundamental", "La mente es la realidad fundamental", "Ambas coexisten", "Ninguna realidad fundamental"), "Filosofía", "El materialismo afirma que toda realidad, incluida la conciencia, deriva de la materia. Esta posición se opone al idealismo, que sitúa la mente o las ideas en el origen de todo.")
        ),
        BilingualQuestion(
            id = 50821, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept central de l'idéalisme?", listOf("La matière est la réalité fondamentale", "L'esprit est la réalité fondamentale", "Les deux coexistent", "Aucune réalité fondamentale"), "Philosophie", "L'idéalisme philosophique affirme que la réalité est fondamentalement mentale ou spirituelle, et que le monde matériel dépend de l'esprit pour exister."),
            en = LocalizedContent("What is the central concept of idealism?", listOf("Matter is the fundamental reality", "Mind is the fundamental reality", "Both coexist", "No fundamental reality"), "Philosophy", "Philosophical idealism asserts that reality is fundamentally mental or spiritual, and that the material world depends on the mind to exist."),
            zh = LocalizedContent("唯心主义的核心概念是什么？", listOf("物质是基本现实", "精神是基本现实", "两者共存", "没有基本现实"), "哲学", "哲学唯心主义认为现实本质上是精神或心灵的，物质世界依赖于精神而存在。"),
            es = LocalizedContent("¿Cuál es el concepto central del idealismo?", listOf("La materia es la realidad fundamental", "La mente es la realidad fundamental", "Ambas coexisten", "Ninguna realidad fundamental"), "Filosofía", "El idealismo filosófico afirma que la realidad es fundamentalmente mental o espiritual, y que el mundo material depende de la mente para existir.")
        ),
        BilingualQuestion(
            id = 50822, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel philosophe a énoncé le principe du rasoir d'Occam?", listOf("William d'Occam", "Thomas d'Aquin", "Bonaventure", "Duns Scot"), "Philosophie", "William d'Occam, moine franciscain du XIVe siècle, a formulé ce principe de parcimonie dans ses écrits logiques, souvent résumé par \"Les entités ne doivent pas être multipliées sans nécessité\"."),
            en = LocalizedContent("Which philosopher enunciated the principle of Occam's razor?", listOf("William of Ockham", "Thomas Aquinas", "Bonaventure", "Duns Scotus"), "Philosophy", "William of Ockham, a 14th-century Franciscan monk, formulated this principle of parsimony in his logical writings, often summarized as 'Entities should not be multiplied without necessity'."),
            zh = LocalizedContent("哪位哲学家提出了奥卡姆剃刀原则？", listOf("奥卡姆的威廉", "托马斯·阿奎那", "波纳文图拉", "邓斯·司各脱"), "哲学", "14世纪方济各会修士奥卡姆的威廉在其逻辑著作中提出了这一简约原则，常被概括为“如无必要，勿增实体”。"),
            es = LocalizedContent("¿Qué filósofo enunció el principio de la navaja de Occam?", listOf("Guillermo de Ockham", "Tomás de Aquino", "Buenaventura", "Duns Escoto"), "Filosofía", "Guillermo de Ockham, monje franciscano del siglo XIV, formuló este principio de parsimonia en sus escritos lógicos, a menudo resumido como 'Las entidades no deben multiplicarse sin necesidad'.")
        ),
        BilingualQuestion(
            id = 50823, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept central du relativisme?", listOf("L'absolu n'existe pas", "Tout est relatif", "Aucune vérité objective", "Les trois sont équivalents"), "Philosophie", "Le relativisme affirme que les vérités et les valeurs dépendent du contexte culturel, historique ou individuel, rejetant ainsi l'existence de vérités universelles et objectives."),
            en = LocalizedContent("What is the central concept of relativism?", listOf("The absolute does not exist", "Everything is relative", "No objective truth", "All three are equivalent"), "Philosophy", "Relativism asserts that truths and values depend on cultural, historical, or individual context, thus rejecting the existence of universal and objective truths."),
            zh = LocalizedContent("相对主义的核心概念是什么？", listOf("绝对不存在", "一切都是相对的", "没有客观真理", "三者等价"), "哲学", "相对主义认为真理和价值取决于文化、历史或个人背景，从而拒绝普遍客观真理的存在。"),
            es = LocalizedContent("¿Cuál es el concepto central del relativismo?", listOf("Lo absoluto no existe", "Todo es relativo", "No hay verdad objetiva", "Los tres son equivalentes"), "Filosofía", "El relativismo afirma que las verdades y los valores dependen del contexto cultural, histórico o individual, rechazando así la existencia de verdades universales y objetivas.")
        ),
        BilingualQuestion(
            id = 50824, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel philosophe a énoncé l'immoralisme?", listOf("Nietzsche", "Schopenhauer", "Hegel", "Kierkegaard"), "Philosophie", "Nietzsche a développé l'immoralisme dans ses œuvres, notamment dans \"Par-delà le bien et le mal\", en critiquant la morale traditionnelle et en prônant une réévaluation des valeurs."),
            en = LocalizedContent("Which philosopher enunciated immoralism?", listOf("Nietzsche", "Schopenhauer", "Hegel", "Kierkegaard"), "Philosophy", "Nietzsche developed immoralism in his works, notably in 'Beyond Good and Evil', by criticizing traditional morality and advocating a revaluation of values."),
            zh = LocalizedContent("哪位哲学家提出了非道德主义？", listOf("尼采", "叔本华", "黑格尔", "克尔凯郭尔"), "哲学", "尼采在其著作中发展了非道德主义，特别是在《善恶的彼岸》中，批判传统道德并倡导重新评估价值。"),
            es = LocalizedContent("¿Qué filósofo enunció el inmoralismo?", listOf("Nietzsche", "Schopenhauer", "Hegel", "Kierkegaard"), "Filosofía", "Nietzsche desarrolló el inmoralismo en sus obras, especialmente en 'Más allá del bien y del mal', criticando la moral tradicional y abogando por una revalorización de los valores.")
        ),
        BilingualQuestion(
            id = 50825, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept central de la théologie rationnelle?", listOf("La foi est la seule source de connaissance", "La raison peut connaître Dieu", "La révélation est supérieure à la raison", "Dieu ne peut pas être connu"), "Philosophie", "La théologie rationnelle, ou théologie naturelle, soutient que des preuves de l'existence de Dieu peuvent être établies par le seul usage de la raison humaine, sans recours à la révélation divine."),
            en = LocalizedContent("What is the central concept of rational theology?", listOf("Faith is the only source of knowledge", "Reason can know God", "Revelation is superior to reason", "God cannot be known"), "Philosophy", "Rational theology, or natural theology, holds that proofs of God's existence can be established by the sole use of human reason, without recourse to divine revelation."),
            zh = LocalizedContent("理性神学的核心概念是什么？", listOf("信仰是知识的唯一来源", "理性可以认识上帝", "启示高于理性", "上帝不可知"), "哲学", "理性神学或自然神学认为，仅凭人类理性的使用就能确立上帝存在的证据，无需借助神圣启示。"),
            es = LocalizedContent("¿Cuál es el concepto central de la teología racional?", listOf("La fe es la única fuente de conocimiento", "La razón puede conocer a Dios", "La revelación es superior a la razón", "Dios no puede ser conocido"), "Filosofía", "La teología racional, o teología natural, sostiene que las pruebas de la existencia de Dios pueden establecerse mediante el solo uso de la razón humana, sin recurrir a la revelación divina.")
        ),
        BilingualQuestion(
            id = 50826, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept central de l'apologétique?", listOf("La défense de la foi par la raison", "La critique de la religion", "La séparation de la foi et de la raison", "L'absence de Dieu"), "Philosophie", "L'apologétique chrétienne, notamment chez des penseurs comme Tertullien ou Augustin, vise à justifier rationnellement les croyances religieuses face aux critiques."),
            en = LocalizedContent("What is the central concept of apologetics?", listOf("The defense of faith by reason", "The critique of religion", "The separation of faith and reason", "The absence of God"), "Philosophy", "Christian apologetics, notably in thinkers like Tertullian or Augustine, aims to rationally justify religious beliefs in the face of criticism."),
            zh = LocalizedContent("护教学的核心概念是什么？", listOf("用理性为信仰辩护", "批判宗教", "信仰与理性分离", "上帝不存在"), "哲学", "基督教护教学，尤其在德尔图良或奥古斯丁等思想家那里，旨在理性地为宗教信仰辩护以应对批评。"),
            es = LocalizedContent("¿Cuál es el concepto central de la apologética?", listOf("La defensa de la fe por la razón", "La crítica de la religión", "La separación de la fe y la razón", "La ausencia de Dios"), "Filosofía", "La apologética cristiana, especialmente en pensadores como Tertuliano o Agustín, busca justificar racionalmente las creencias religiosas frente a las críticas.")
        ),
        BilingualQuestion(
            id = 50827, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel philosophe a énoncé le problème du mal?", listOf("Augustine", "Thomas d'Aquin", "Leibniz", "Hume"), "Philosophie", "David Hume a formulé le problème du mal dans ses Dialogues sur la religion naturelle, en opposant la puissance et la bonté divine à l'existence du mal dans le monde."),
            en = LocalizedContent("Which philosopher enunciated the problem of evil?", listOf("Augustine", "Thomas Aquinas", "Leibniz", "Hume"), "Philosophy", "David Hume formulated the problem of evil in his Dialogues Concerning Natural Religion, opposing divine power and goodness to the existence of evil in the world."),
            zh = LocalizedContent("哪位哲学家提出了恶的问题？", listOf("奥古斯丁", "托马斯·阿奎那", "莱布尼茨", "休谟"), "哲学", "大卫·休谟在其《自然宗教对话录》中提出了恶的问题，将神圣的力量和善与世界上恶的存在相对立。"),
            es = LocalizedContent("¿Qué filósofo enunció el problema del mal?", listOf("Agustín", "Tomás de Aquino", "Leibniz", "Hume"), "Filosofía", "David Hume formuló el problema del mal en sus Diálogos sobre la religión natural, oponiendo el poder y la bondad divinos a la existencia del mal en el mundo.")
        ),
        BilingualQuestion(
            id = 50828, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept central de l'ontologie?", listOf("L'étude de ce qui est", "L'étude de la connaissance", "L'étude de la morale", "L'étude de la beauté"), "Philosophie", "L'ontologie est la branche de la philosophie qui s'interroge sur la nature de l'être et de la réalité, d'où son objet central : l'étude de ce qui est."),
            en = LocalizedContent("What is the central concept of ontology?", listOf("The study of what is", "The study of knowledge", "The study of morality", "The study of beauty"), "Philosophy", "Ontology is the branch of philosophy that inquires into the nature of being and reality, hence its central object: the study of what is."),
            zh = LocalizedContent("本体论的核心概念是什么？", listOf("研究存在之物", "研究知识", "研究道德", "研究美"), "哲学", "本体论是哲学的一个分支，探讨存在和现实的本质，因此其核心对象是研究存在之物。"),
            es = LocalizedContent("¿Cuál es el concepto central de la ontología?", listOf("El estudio de lo que es", "El estudio del conocimiento", "El estudio de la moral", "El estudio de la belleza"), "Filosofía", "La ontología es la rama de la filosofía que indaga sobre la naturaleza del ser y la realidad, de ahí su objeto central: el estudio de lo que es.")
        ),
        BilingualQuestion(
            id = 50829, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept central de l'épistémologie?", listOf("L'étude de ce qui est", "L'étude de la connaissance", "L'étude de la morale", "L'étude de la beauté"), "Philosophie", "L'épistémologie est la branche de la philosophie qui examine la nature, l'origine et les limites de la connaissance humaine."),
            en = LocalizedContent("What is the central concept of epistemology?", listOf("The study of what is", "The study of knowledge", "The study of morality", "The study of beauty"), "Philosophy", "Epistemology is the branch of philosophy that examines the nature, origin, and limits of human knowledge."),
            zh = LocalizedContent("认识论的核心概念是什么？", listOf("研究存在之物", "研究知识", "研究道德", "研究美"), "哲学", "认识论是哲学的一个分支，研究人类知识的本质、起源和界限。"),
            es = LocalizedContent("¿Cuál es el concepto central de la epistemología?", listOf("El estudio de lo que es", "El estudio del conocimiento", "El estudio de la moral", "El estudio de la belleza"), "Filosofía", "La epistemología es la rama de la filosofía que examina la naturaleza, el origen y los límites del conocimiento humano.")
        ),
        BilingualQuestion(
            id = 50830, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le concept central de l'éthique?", listOf("L'étude de ce qui est", "L'étude de la connaissance", "L'étude de la morale", "L'étude de la beauté"), "Philosophie", "L'éthique est la branche de la philosophie qui examine les principes du bien et du mal, et son concept central est l'étude systématique de la morale, c'est-à-dire des valeurs et des règles guidant les actions humaines."),
            en = LocalizedContent("What is the central concept of ethics?", listOf("The study of what is", "The study of knowledge", "The study of morality", "The study of beauty"), "Philosophy", "Ethics is the branch of philosophy that examines the principles of good and evil, and its central concept is the systematic study of morality, i.e., the values and rules guiding human actions."),
            zh = LocalizedContent("伦理学的核心概念是什么？", listOf("对存在的研究", "对知识的研究", "对道德的研究", "对美的研究"), "哲学", "伦理学是哲学的一个分支，研究善恶原则，其核心概念是对道德的系统研究，即指导人类行为的价值观和规则。"),
            es = LocalizedContent("¿Cuál es el concepto central de la ética?", listOf("El estudio de lo que es", "El estudio del conocimiento", "El estudio de la moral", "El estudio de la belleza"), "Filosofía", "La ética es la rama de la filosofía que examina los principios del bien y del mal, y su concepto central es el estudio sistemático de la moral, es decir, los valores y reglas que guían las acciones humanas.")
        ),
        BilingualQuestion(
            id = 50831, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le concept central de l'esthétique?", listOf("L'étude de ce qui est", "L'étude de la connaissance", "L'étude de la morale", "L'étude de la beauté"), "Philosophie", "L'esthétique est la branche de la philosophie qui étudie la nature de la beauté, de l'art et du goût. Son concept central est donc l'analyse de ce qui rend quelque chose beau ou laid."),
            en = LocalizedContent("What is the central concept of aesthetics?", listOf("The study of what is", "The study of knowledge", "The study of morality", "The study of beauty"), "Philosophy", "Aesthetics is the branch of philosophy that studies the nature of beauty, art, and taste. Its central concept is therefore the analysis of what makes something beautiful or ugly."),
            zh = LocalizedContent("美学的核心概念是什么？", listOf("对存在的研究", "对知识的研究", "对道德的研究", "对美的研究"), "哲学", "美学是哲学的一个分支，研究美、艺术和品味的本质。因此其核心概念是分析什么使事物美或丑。"),
            es = LocalizedContent("¿Cuál es el concepto central de la estética?", listOf("El estudio de lo que es", "El estudio del conocimiento", "El estudio de la moral", "El estudio de la belleza"), "Filosofía", "La estética es la rama de la filosofía que estudia la naturaleza de la belleza, el arte y el gusto. Su concepto central es, por tanto, el análisis de lo que hace que algo sea bello o feo.")
        ),
        BilingualQuestion(
            id = 50832, correctIndex = 3, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel philosophe a énoncé la théorie de l'amour courtois?", listOf("Dante", "Pétrarque", "Boccaccio", "Cavalcanti"), "Philosophie", "Guido Cavalcanti, poète et philosophe italien du XIIIe siècle, a développé cette théorie dans son traité \"De l'amour\", influençant le courant du Dolce Stil Novo."),
            en = LocalizedContent("Which philosopher articulated the theory of courtly love?", listOf("Dante", "Petrarch", "Boccaccio", "Cavalcanti"), "Philosophy", "Guido Cavalcanti, an Italian poet and philosopher of the 13th century, developed this theory in his treatise \"On Love\", influencing the Dolce Stil Novo movement."),
            zh = LocalizedContent("哪位哲学家阐述了宫廷爱情理论？", listOf("但丁", "彼特拉克", "薄伽丘", "卡瓦尔坎蒂"), "哲学", "圭多·卡瓦尔坎蒂，13世纪意大利诗人和哲学家，在其著作《论爱情》中发展了这一理论，影响了温柔新体诗派。"),
            es = LocalizedContent("¿Qué filósofo enunció la teoría del amor cortés?", listOf("Dante", "Petrarca", "Boccaccio", "Cavalcanti"), "Filosofía", "Guido Cavalcanti, poeta y filósofo italiano del siglo XIII, desarrolló esta teoría en su tratado \"Del amor\", influyendo en la corriente del Dolce Stil Novo.")
        ),
        BilingualQuestion(
            id = 50833, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe a énoncé le concept du surhomme?", listOf("Hegel", "Nietzsche", "Schopenhauer", "Kierkegaard"), "Philosophie", "Nietzsche a développé le concept du surhomme dans son œuvre \"Ainsi parlait Zarathoustra\", représentant un idéal d'humanité dépassant les valeurs morales traditionnelles."),
            en = LocalizedContent("Which philosopher articulated the concept of the Übermensch?", listOf("Hegel", "Nietzsche", "Schopenhauer", "Kierkegaard"), "Philosophy", "Nietzsche developed the concept of the Übermensch in his work \"Thus Spoke Zarathustra\", representing an ideal of humanity that transcends traditional moral values."),
            zh = LocalizedContent("哪位哲学家阐述了超人概念？", listOf("黑格尔", "尼采", "叔本华", "克尔凯郭尔"), "哲学", "尼采在其著作《查拉图斯特拉如是说》中发展了超人概念，代表超越传统道德价值观的人类理想。"),
            es = LocalizedContent("¿Qué filósofo enunció el concepto del superhombre?", listOf("Hegel", "Nietzsche", "Schopenhauer", "Kierkegaard"), "Filosofía", "Nietzsche desarrolló el concepto del superhombre en su obra \"Así habló Zaratustra\", representando un ideal de humanidad que supera los valores morales tradicionales.")
        ),
        BilingualQuestion(
            id = 50834, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept central du taoïsme politique?", listOf("L'ordre social basé sur la raison", "L'ordre social basé sur le Tao", "L'absence d'ordre social", "Le chaos primordial"), "Philosophie", "Le taoïsme politique prône un ordre social harmonieux et non-interventionniste, où le dirigeant suit le Tao (la Voie) pour gouverner avec simplicité et laisser-faire."),
            en = LocalizedContent("What is the central concept of political Taoism?", listOf("Social order based on reason", "Social order based on the Tao", "Absence of social order", "Primordial chaos"), "Philosophy", "Political Taoism advocates a harmonious and non-interventionist social order, where the ruler follows the Tao (the Way) to govern with simplicity and laissez-faire."),
            zh = LocalizedContent("政治道家的核心概念是什么？", listOf("基于理性的社会秩序", "基于道的社会秩序", "没有社会秩序", "原始混沌"), "哲学", "政治道家倡导和谐、不干预的社会秩序，统治者遵循道（道路）以简朴和放任的方式治理。"),
            es = LocalizedContent("¿Cuál es el concepto central del taoísmo político?", listOf("Orden social basado en la razón", "Orden social basado en el Tao", "Ausencia de orden social", "Caos primordial"), "Filosofía", "El taoísmo político propugna un orden social armonioso y no intervencionista, donde el gobernante sigue el Tao (la Vía) para gobernar con simplicidad y dejar hacer.")
        ),
        BilingualQuestion(
            id = 50835, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept central du confucianisme politique?", listOf("L'ordre social basé sur la vertu", "L'ordre social basé sur la loi", "L'absence d'ordre social", "Le chaos primordial"), "Philosophie", "Le confucianisme politique prône un ordre social fondé sur la vertu, où le souverain gouverne par l'exemple moral et la bienveillance, plutôt que par la loi ou la force."),
            en = LocalizedContent("What is the central concept of political Confucianism?", listOf("Social order based on virtue", "Social order based on law", "Absence of social order", "Primordial chaos"), "Philosophy", "Political Confucianism advocates a social order founded on virtue, where the ruler governs by moral example and benevolence, rather than by law or force."),
            zh = LocalizedContent("政治儒家的核心概念是什么？", listOf("基于美德的社会秩序", "基于法律的社会秩序", "没有社会秩序", "原始混沌"), "哲学", "政治儒家倡导基于美德的社会秩序，统治者通过道德榜样和仁爱而非法律或武力来治理。"),
            es = LocalizedContent("¿Cuál es el concepto central del confucianismo político?", listOf("Orden social basado en la virtud", "Orden social basado en la ley", "Ausencia de orden social", "Caos primordial"), "Filosofía", "El confucianismo político propugna un orden social fundado en la virtud, donde el soberano gobierna mediante el ejemplo moral y la benevolencia, en lugar de la ley o la fuerza.")
        ),
        BilingualQuestion(
            id = 50836, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept central du légalisme chinois?", listOf("L'ordre social basé sur la vertu", "L'ordre social basé sur la loi", "L'absence d'ordre social", "Le chaos primordial"), "Philosophie", "Le légalisme, développé par des penseurs comme Han Fei, prône un ordre social strict fondé sur des lois écrites et des récompenses/punitions, rejetant la morale confucéenne."),
            en = LocalizedContent("What is the central concept of Chinese Legalism?", listOf("Social order based on virtue", "Social order based on law", "Absence of social order", "Primordial chaos"), "Philosophy", "Legalism, developed by thinkers like Han Fei, advocates a strict social order based on written laws and rewards/punishments, rejecting Confucian morality."),
            zh = LocalizedContent("中国法家的核心概念是什么？", listOf("基于美德的社会秩序", "基于法律的社会秩序", "没有社会秩序", "原始混沌"), "哲学", "法家由韩非子等思想家发展，倡导基于成文法和奖惩的严格社会秩序，拒绝儒家道德。"),
            es = LocalizedContent("¿Cuál es el concepto central del legalismo chino?", listOf("Orden social basado en la virtud", "Orden social basado en la ley", "Ausencia de orden social", "Caos primordial"), "Filosofía", "El legalismo, desarrollado por pensadores como Han Fei, propugna un orden social estricto basado en leyes escritas y recompensas/castigos, rechazando la moral confuciana.")
        ),
        BilingualQuestion(
            id = 50837, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel philosophe a énoncé que la justice est l'ordre social naturel?", listOf("Platon", "Aristote", "Cicéron", "Sénèque"), "Philosophie", "Cicéron, dans son traité De la République, définit la justice comme l'ordre naturel qui harmonise la société, s'inspirant de la pensée stoïcienne sur la loi naturelle."),
            en = LocalizedContent("Which philosopher stated that justice is the natural social order?", listOf("Plato", "Aristotle", "Cicero", "Seneca"), "Philosophy", "Cicero, in his treatise On the Republic, defines justice as the natural order that harmonizes society, drawing on Stoic thought about natural law."),
            zh = LocalizedContent("哪位哲学家指出正义是自然的社会秩序？", listOf("柏拉图", "亚里士多德", "西塞罗", "塞内卡"), "哲学", "西塞罗在其著作《论共和国》中将正义定义为协调社会的自然秩序，借鉴了斯多葛学派关于自然法的思想。"),
            es = LocalizedContent("¿Qué filósofo enunció que la justicia es el orden social natural?", listOf("Platón", "Aristóteles", "Cicerón", "Séneca"), "Filosofía", "Cicerón, en su tratado De la República, define la justicia como el orden natural que armoniza la sociedad, inspirándose en el pensamiento estoico sobre la ley natural.")
        ),
        BilingualQuestion(
            id = 50838, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept central du cosmopolitisme?", listOf("L'amour de son pays", "L'amour du monde", "L'absence de frontières morales", "La fraternité universelle"), "Philosophie", "Le cosmopolitisme affirme que tous les êtres humains appartiennent à une même communauté mondiale, dépassant les frontières nationales. La fraternité universelle en est le principe fondamental."),
            en = LocalizedContent("What is the central concept of cosmopolitanism?", listOf("Love of one's country", "Love of the world", "Absence of moral boundaries", "Universal brotherhood"), "Philosophy", "Cosmopolitanism asserts that all human beings belong to a single global community, transcending national borders. Universal brotherhood is its fundamental principle."),
            zh = LocalizedContent("世界主义的核心概念是什么？", listOf("爱国", "爱世界", "没有道德界限", "普世博爱"), "哲学", "世界主义主张所有人类属于同一个全球共同体，超越国界。普世博爱是其基本原则。"),
            es = LocalizedContent("¿Cuál es el concepto central del cosmopolitismo?", listOf("Amor a la patria", "Amor al mundo", "Ausencia de fronteras morales", "Fraternidad universal"), "Filosofía", "El cosmopolitismo afirma que todos los seres humanos pertenecen a una misma comunidad mundial, superando las fronteras nacionales. La fraternidad universal es su principio fundamental.")
        ),
        BilingualQuestion(
            id = 50839, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel philosophe a énoncé que la raison pratique est plus importante que la raison théorique?", listOf("Kant", "Hegel", "Schopenhauer", "Kierkegaard"), "Philosophie", "Dans sa philosophie morale, Kant distingue la raison pratique, qui guide l'action selon la loi morale, de la raison théorique, qui se limite à la connaissance des phénomènes, accordant la primauté à la première."),
            en = LocalizedContent("Which philosopher stated that practical reason is more important than theoretical reason?", listOf("Kant", "Hegel", "Schopenhauer", "Kierkegaard"), "Philosophy", "In his moral philosophy, Kant distinguishes practical reason, which guides action according to the moral law, from theoretical reason, which is limited to knowledge of phenomena, giving primacy to the former."),
            zh = LocalizedContent("哪位哲学家指出实践理性比理论理性更重要？", listOf("康德", "黑格尔", "叔本华", "克尔凯郭尔"), "哲学", "康德在其道德哲学中区分了指导行动遵循道德律的实践理性和局限于现象知识的理论理性，并赋予前者优先地位。"),
            es = LocalizedContent("¿Qué filósofo enunció que la razón práctica es más importante que la razón teórica?", listOf("Kant", "Hegel", "Schopenhauer", "Kierkegaard"), "Filosofía", "En su filosofía moral, Kant distingue la razón práctica, que guía la acción según la ley moral, de la razón teórica, que se limita al conocimiento de los fenómenos, otorgando primacía a la primera.")
        ),
        BilingualQuestion(
            id = 50840, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept central du voluntarisme?", listOf("La volonté est la réalité fondamentale", "L'intellect est la réalité fondamentale", "L'intuition est la réalité fondamentale", "L'imagination est la réalité fondamentale"), "Philosophie", "Le volontarisme, notamment chez Schopenhauer et Nietzsche, affirme que la volonté, et non la raison, constitue le principe premier et essentiel de la réalité."),
            en = LocalizedContent("What is the central concept of voluntarism?", listOf("Will is the fundamental reality", "Intellect is the fundamental reality", "Intuition is the fundamental reality", "Imagination is the fundamental reality"), "Philosophy", "Voluntarism, especially in Schopenhauer and Nietzsche, asserts that will, not reason, constitutes the primary and essential principle of reality."),
            zh = LocalizedContent("意志主义的核心概念是什么？", listOf("意志是根本现实", "理智是根本现实", "直觉是根本现实", "想象是根本现实"), "哲学", "意志主义，尤其在叔本华和尼采那里，主张意志而非理性构成了现实的首要且本质的原则。"),
            es = LocalizedContent("¿Cuál es el concepto central del voluntarismo?", listOf("La voluntad es la realidad fundamental", "El intelecto es la realidad fundamental", "La intuición es la realidad fundamental", "La imaginación es la realidad fundamental"), "Filosofía", "El voluntarismo, especialmente en Schopenhauer y Nietzsche, afirma que la voluntad, y no la razón, constituye el principio primero y esencial de la realidad.")
        ),
        BilingualQuestion(
            id = 50841, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel philosophe a énoncé que la volonté est aveugle?", listOf("Nietzsche", "Schopenhauer", "Hegel", "Kierkegaard"), "Philosophie", "Pour Schopenhauer, la volonté est une force irrationnelle et aveugle qui pousse à l'action sans but conscient, contrairement à l'intellect qui n'en est qu'un instrument."),
            en = LocalizedContent("Which philosopher stated that the will is blind?", listOf("Nietzsche", "Schopenhauer", "Hegel", "Kierkegaard"), "Philosophy", "For Schopenhauer, the will is an irrational and blind force that drives action without conscious purpose, unlike the intellect which is merely its instrument."),
            zh = LocalizedContent("哪位哲学家提出意志是盲目的？", listOf("尼采", "叔本华", "黑格尔", "克尔凯郭尔"), "哲学", "对于叔本华，意志是一种非理性且盲目的力量，驱使行动而无自觉目的，而理智只是其工具。"),
            es = LocalizedContent("¿Qué filósofo afirmó que la voluntad es ciega?", listOf("Nietzsche", "Schopenhauer", "Hegel", "Kierkegaard"), "Filosofía", "Para Schopenhauer, la voluntad es una fuerza irracional y ciega que impulsa a la acción sin propósito consciente, a diferencia del intelecto que es solo su instrumento.")
        ),
        BilingualQuestion(
            id = 50842, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept central de l'intuitionnisme?", listOf("La raison est la source de la connaissance", "L'intuition est la source de la connaissance", "L'expérience est la source de la connaissance", "La révélation est la source de la connaissance"), "Philosophie", "L'intuitionnisme, en philosophie, affirme que certaines vérités fondamentales sont connues directement par intuition, sans recours à la raison ou aux sens. Cette position s'oppose au rationalisme et à l'empirisme en faisant de l'intuition la source première de la connaissance."),
            en = LocalizedContent("What is the central concept of intuitionism?", listOf("Reason is the source of knowledge", "Intuition is the source of knowledge", "Experience is the source of knowledge", "Revelation is the source of knowledge"), "Philosophy", "Intuitionism in philosophy holds that certain fundamental truths are known directly by intuition, without recourse to reason or the senses. This position opposes rationalism and empiricism by making intuition the primary source of knowledge."),
            zh = LocalizedContent("直觉主义的核心概念是什么？", listOf("理性是知识的来源", "直觉是知识的来源", "经验是知识的来源", "启示是知识的来源"), "哲学", "哲学中的直觉主义认为某些基本真理直接通过直觉认识，无需借助理性或感官。这一立场反对理性主义和经验主义，将直觉视为知识的主要来源。"),
            es = LocalizedContent("¿Cuál es el concepto central del intuicionismo?", listOf("La razón es la fuente del conocimiento", "La intuición es la fuente del conocimiento", "La experiencia es la fuente del conocimiento", "La revelación es la fuente del conocimiento"), "Filosofía", "El intuicionismo en filosofía sostiene que ciertas verdades fundamentales se conocen directamente por intuición, sin recurrir a la razón o los sentidos. Esta posición se opone al racionalismo y al empirismo al hacer de la intuición la fuente primaria del conocimiento.")
        ),
        BilingualQuestion(
            id = 50843, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le concept central du bergsonisme?", listOf("La durée est la réalité fondamentale", "L'espace est la réalité fondamentale", "Le temps est une illusion", "La matière est la réalité fondamentale"), "Philosophie", "Pour Bergson, la durée est le temps vécu par la conscience, une continuité indivisible et créatrice, s'opposant au temps spatialisé et mesuré de la science."),
            en = LocalizedContent("What is the central concept of Bergsonism?", listOf("Duration is the fundamental reality", "Space is the fundamental reality", "Time is an illusion", "Matter is the fundamental reality"), "Philosophy", "For Bergson, duration is time as lived by consciousness, an indivisible and creative continuity, opposed to the spatialized and measured time of science."),
            zh = LocalizedContent("柏格森主义的核心概念是什么？", listOf("绵延是根本现实", "空间是根本现实", "时间是幻觉", "物质是根本现实"), "哲学", "对于柏格森，绵延是意识所经历的时间，一种不可分割且具有创造性的连续性，与科学中空间化和可测量的时间相对立。"),
            es = LocalizedContent("¿Cuál es el concepto central del bergsonismo?", listOf("La duración es la realidad fundamental", "El espacio es la realidad fundamental", "El tiempo es una ilusión", "La materia es la realidad fundamental"), "Filosofía", "Para Bergson, la duración es el tiempo vivido por la conciencia, una continuidad indivisible y creadora, opuesta al tiempo espacializado y medido de la ciencia.")
        ),
        BilingualQuestion(
            id = 50844, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le concept central du platonisme mathématique?", listOf("Les nombres existent indépendamment", "Les nombres sont des constructions mentales", "Les nombres sont des conventions sociales", "Les nombres n'existent pas"), "Philosophie", "Le platonisme mathématique affirme que les entités mathématiques, comme les nombres, sont des objets abstraits réels et éternels, existant indépendamment de l'esprit humain."),
            en = LocalizedContent("What is the central concept of mathematical Platonism?", listOf("Numbers exist independently", "Numbers are mental constructions", "Numbers are social conventions", "Numbers do not exist"), "Philosophy", "Mathematical Platonism asserts that mathematical entities, such as numbers, are real and eternal abstract objects, existing independently of the human mind."),
            zh = LocalizedContent("数学柏拉图主义的核心概念是什么？", listOf("数字独立存在", "数字是心理构造", "数字是社会约定", "数字不存在"), "哲学", "数学柏拉图主义主张数学实体（如数字）是真实且永恒的抽象对象，独立于人类心智而存在。"),
            es = LocalizedContent("¿Cuál es el concepto central del platonismo matemático?", listOf("Los números existen independientemente", "Los números son construcciones mentales", "Los números son convenciones sociales", "Los números no existen"), "Filosofía", "El platonismo matemático afirma que las entidades matemáticas, como los números, son objetos abstractos reales y eternos, que existen independientemente de la mente humana.")
        ),
        BilingualQuestion(
            id = 50845, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le concept central du constructivisme?", listOf("Les objets mathématiques existent indépendamment", "Les objets mathématiques sont construits par l'esprit", "Les objets mathématiques sont des conventions sociales", "Les objets mathématiques n'existent pas"), "Philosophie", "Le constructivisme, en philosophie des mathématiques, soutient que les objets mathématiques n'existent pas indépendamment de l'esprit humain mais sont créés par l'activité mentale."),
            en = LocalizedContent("What is the central concept of constructivism?", listOf("Mathematical objects exist independently", "Mathematical objects are constructed by the mind", "Mathematical objects are social conventions", "Mathematical objects do not exist"), "Philosophy", "Constructivism in the philosophy of mathematics holds that mathematical objects do not exist independently of the human mind but are created by mental activity."),
            zh = LocalizedContent("建构主义的核心概念是什么？", listOf("数学对象独立存在", "数学对象由心智建构", "数学对象是社会约定", "数学对象不存在"), "哲学", "数学哲学中的建构主义认为数学对象并非独立于人类心智而存在，而是由心智活动创造的。"),
            es = LocalizedContent("¿Cuál es el concepto central del constructivismo?", listOf("Los objetos matemáticos existen independientemente", "Los objetos matemáticos son construidos por la mente", "Los objetos matemáticos son convenciones sociales", "Los objetos matemáticos no existen"), "Filosofía", "El constructivismo en filosofía de las matemáticas sostiene que los objetos matemáticos no existen independientemente de la mente humana, sino que son creados por la actividad mental.")
        ),
        BilingualQuestion(
            id = 50846, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel philosophe a énoncé la morale des intentions?", listOf("Kant", "Bentham", "Mill", "Moore"), "Philosophie", "Kant a développé le concept de « bonne volonté » dans sa philosophie morale, affirmant que seule l'intention guidée par le devoir moral donne sa valeur à une action, indépendamment de ses conséquences."),
            en = LocalizedContent("Which philosopher enunciated the morality of intentions?", listOf("Kant", "Bentham", "Mill", "Moore"), "Philosophy", "Kant developed the concept of 'good will' in his moral philosophy, asserting that only the intention guided by moral duty gives value to an action, regardless of its consequences."),
            zh = LocalizedContent("哪位哲学家提出了意图道德？", listOf("康德", "边沁", "密尔", "摩尔"), "哲学", "康德在其道德哲学中发展了“善良意志”的概念，主张只有受道德义务指导的意图才赋予行动价值，而不考虑其后果。"),
            es = LocalizedContent("¿Qué filósofo enunció la moral de las intenciones?", listOf("Kant", "Bentham", "Mill", "Moore"), "Filosofía", "Kant desarrolló el concepto de 'buena voluntad' en su filosofía moral, afirmando que solo la intención guiada por el deber moral da valor a una acción, independientemente de sus consecuencias.")
        ),
        BilingualQuestion(
            id = 50847, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe a énoncé l'utilitarisme?", listOf("Kant", "Bentham", "Mill", "Moore"), "Philosophie", "Jeremy Bentham a fondé l'utilitarisme classique au XVIIIe siècle, théorisant que la morale doit maximiser le bonheur pour le plus grand nombre."),
            en = LocalizedContent("Which philosopher enunciated utilitarianism?", listOf("Kant", "Bentham", "Mill", "Moore"), "Philosophy", "Jeremy Bentham founded classical utilitarianism in the 18th century, theorizing that morality should maximize happiness for the greatest number."),
            zh = LocalizedContent("哪位哲学家提出了功利主义？", listOf("康德", "边沁", "密尔", "摩尔"), "哲学", "杰里米·边沁在18世纪创立了古典功利主义，理论化道德应最大化最大多数人的幸福。"),
            es = LocalizedContent("¿Qué filósofo enunció el utilitarismo?", listOf("Kant", "Bentham", "Mill", "Moore"), "Filosofía", "Jeremy Bentham fundó el utilitarismo clásico en el siglo XVIII, teorizando que la moral debe maximizar la felicidad para el mayor número.")
        ),
        BilingualQuestion(
            id = 50848, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept central de la vertu éthique?", listOf("L'habitude de bien agir", "La raison pure", "L'intention pure", "L'action conforme à la loi"), "Philosophie", "Pour Aristote, la vertu éthique n'est pas innée mais s'acquiert par la pratique répétée de bonnes actions, devenant ainsi une disposition stable ou habitude."),
            en = LocalizedContent("What is the central concept of ethical virtue?", listOf("The habit of acting well", "Pure reason", "Pure intention", "Action in accordance with the law"), "Philosophy", "For Aristotle, ethical virtue is not innate but acquired through repeated practice of good actions, thus becoming a stable disposition or habit."),
            zh = LocalizedContent("伦理德性的核心概念是什么？", listOf("行善的习惯", "纯粹理性", "纯粹意图", "符合法律的行为"), "哲学", "对于亚里士多德，伦理德性并非天生，而是通过反复实践善行获得，从而成为一种稳定的倾向或习惯。"),
            es = LocalizedContent("¿Cuál es el concepto central de la virtud ética?", listOf("El hábito de obrar bien", "La razón pura", "La intención pura", "La acción conforme a la ley"), "Filosofía", "Para Aristóteles, la virtud ética no es innata sino que se adquiere mediante la práctica repetida de buenas acciones, convirtiéndose así en una disposición estable o hábito.")
        ),
        BilingualQuestion(
            id = 50849, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe a énoncé que la vertu est une habitude?", listOf("Platon", "Aristote", "Socrate", "Cicéron"), "Philosophie", "Dans l'Éthique à Nicomaque, Aristote définit la vertu comme une disposition acquise par la répétition d'actions, donc une habitude."),
            en = LocalizedContent("Which philosopher stated that virtue is a habit?", listOf("Plato", "Aristotle", "Socrates", "Cicero"), "Philosophy", "In the Nicomachean Ethics, Aristotle defines virtue as a disposition acquired through repetition of actions, hence a habit."),
            zh = LocalizedContent("哪位哲学家提出德性是一种习惯？", listOf("柏拉图", "亚里士多德", "苏格拉底", "西塞罗"), "哲学", "在《尼各马可伦理学》中，亚里士多德将德性定义为通过重复行动获得的倾向，因此是一种习惯。"),
            es = LocalizedContent("¿Qué filósofo afirmó que la virtud es un hábito?", listOf("Platón", "Aristóteles", "Sócrates", "Cicerón"), "Filosofía", "En la Ética a Nicómaco, Aristóteles define la virtud como una disposición adquirida mediante la repetición de acciones, por lo tanto un hábito.")
        ),
        BilingualQuestion(
            id = 50850, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept central du scepticisme antique?", listOf("Aucune connaissance n'est possible", "La connaissance est relative", "La connaissance est impossible à justifier", "Le doute est le point de départ"), "Philosophie", "Le scepticisme antique, représenté par Pyrrhon et Sextus Empiricus, affirme que toute croyance manque de fondement certain, rendant la connaissance impossible à justifier."),
            en = LocalizedContent("What is the central concept of ancient skepticism?", listOf("No knowledge is possible", "Knowledge is relative", "Knowledge is impossible to justify", "Doubt is the starting point"), "Philosophy", "Ancient skepticism, represented by Pyrrho and Sextus Empiricus, asserts that all beliefs lack certain foundation, making knowledge impossible to justify."),
            zh = LocalizedContent("古代怀疑论的核心概念是什么？", listOf("没有知识是可能的", "知识是相对的", "知识无法被证明", "怀疑是起点"), "哲学", "以皮浪和塞克斯都·恩披里柯为代表的古代怀疑论认为，所有信念都缺乏确定的基础，使得知识无法被证明。"),
            es = LocalizedContent("¿Cuál es el concepto central del escepticismo antiguo?", listOf("Ningún conocimiento es posible", "El conocimiento es relativo", "El conocimiento es imposible de justificar", "La duda es el punto de partida"), "Filosofía", "El escepticismo antiguo, representado por Pirrón y Sexto Empírico, afirma que toda creencia carece de fundamento cierto, haciendo imposible justificar el conocimiento.")
        ),
        BilingualQuestion(
            id = 50851, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le mouvement artistique le plus ancien?", listOf("Préhistorique", "Classique", "Renaissance", "Baroque"), "Art", "L'art préhistorique, avec ses peintures rupestres et ses sculptures, remonte à des dizaines de milliers d'années, bien avant l'émergence des civilisations antiques."),
            en = LocalizedContent("What is the oldest artistic movement?", listOf("Prehistoric", "Classical", "Renaissance", "Baroque"), "Arts", "Prehistoric art, with its cave paintings and sculptures, dates back tens of thousands of years, long before the emergence of ancient civilizations."),
            zh = LocalizedContent("最古老的艺术运动是什么？", listOf("史前", "古典", "文艺复兴", "巴洛克"), "艺术", "史前艺术，包括洞穴壁画和雕塑，可追溯到数万年前，远早于古代文明的出现。"),
            es = LocalizedContent("¿Cuál es el movimiento artístico más antiguo?", listOf("Prehistórico", "Clásico", "Renacimiento", "Barroco"), "Artes", "El arte prehistórico, con sus pinturas rupestres y esculturas, se remonta a decenas de miles de años, mucho antes del surgimiento de las civilizaciones antiguas.")
        ),
        BilingualQuestion(
            id = 50852, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'art de la préhistoire le plus connu?", listOf("Sculpture", "Peinture rupestre", "Poterie", "Bijoux"), "Art", "Les peintures rupestres, comme celles de la grotte de Lascaux, sont les témoignages artistiques les plus célèbres de la Préhistoire, datant du Paléolithique supérieur."),
            en = LocalizedContent("What is the most famous prehistoric art?", listOf("Sculpture", "Cave painting", "Pottery", "Jewelry"), "Arts", "Cave paintings, such as those in the Lascaux cave, are the most famous artistic testimonies of Prehistory, dating from the Upper Paleolithic."),
            zh = LocalizedContent("最著名的史前艺术是什么？", listOf("雕塑", "洞穴壁画", "陶器", "珠宝"), "艺术", "洞穴壁画，如拉斯科洞穴中的壁画，是史前时期最著名的艺术见证，可追溯到旧石器时代晚期。"),
            es = LocalizedContent("¿Cuál es el arte prehistórico más conocido?", listOf("Escultura", "Pintura rupestre", "Cerámica", "Joyas"), "Artes", "Las pinturas rupestres, como las de la cueva de Lascaux, son los testimonios artísticos más famosos de la Prehistoria, datando del Paleolítico superior.")
        ),
        BilingualQuestion(
            id = 50853, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus ancien art plastique connu?", listOf("Peinture", "Sculpture", "Architecture", "Céramique"), "Art", "Les peintures rupestres découvertes dans des grottes comme celles de Chauvet ou d'El Castillo datent de plus de 30 000 ans, ce qui en fait les plus anciennes formes d'art plastique connues."),
            en = LocalizedContent("What is the oldest known visual art?", listOf("Painting", "Sculpture", "Architecture", "Ceramics"), "Arts", "Cave paintings discovered in caves such as Chauvet or El Castillo date back over 30,000 years, making them the oldest known forms of visual art."),
            zh = LocalizedContent("已知最古老的视觉艺术是什么？", listOf("绘画", "雕塑", "建筑", "陶瓷"), "艺术", "在肖维岩洞或埃尔卡斯蒂略岩洞等洞穴中发现的洞穴壁画可追溯到3万多年前，使其成为已知最古老的视觉艺术形式。"),
            es = LocalizedContent("¿Cuál es el arte plástico más antiguo conocido?", listOf("Pintura", "Escultura", "Arquitectura", "Cerámica"), "Artes", "Las pinturas rupestres descubiertas en cuevas como Chauvet o El Castillo datan de más de 30.000 años, lo que las convierte en las formas más antiguas de arte plástico conocidas.")
        ),
        BilingualQuestion(
            id = 50854, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le mouvement artistique de la Renaissance?", listOf("L'art antique revit", "L'humanisme et l'individualité", "Le réalisme", "L'abstraction"), "Art", "La Renaissance met l'accent sur l'humanisme, qui place l'homme au centre des préoccupations, et sur l'individualité, valorisant la singularité de chaque artiste et sujet."),
            en = LocalizedContent("What is the artistic movement of the Renaissance?", listOf("Ancient art revives", "Humanism and individuality", "Realism", "Abstraction"), "Arts", "The Renaissance emphasizes humanism, which places man at the center of concerns, and individuality, valuing the uniqueness of each artist and subject."),
            zh = LocalizedContent("文艺复兴的艺术运动是什么？", listOf("古代艺术复兴", "人文主义与个性", "现实主义", "抽象"), "艺术", "文艺复兴强调人文主义，将人置于关注的中心，并重视个性，推崇每位艺术家和主题的独特性。"),
            es = LocalizedContent("¿Cuál es el movimiento artístico del Renacimiento?", listOf("El arte antiguo revive", "El humanismo y la individualidad", "El realismo", "La abstracción"), "Artes", "El Renacimiento enfatiza el humanismo, que sitúa al hombre en el centro de las preocupaciones, y la individualidad, valorando la singularidad de cada artista y tema.")
        ),
        BilingualQuestion(
            id = 50855, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le mouvement artistique du Baroque?", listOf("La simplicité", "L'émotions intense et le dramatisme", "La raison", "L'abstraction"), "Art", "Le baroque, né au XVIIe siècle, se caractérise par l'exubérance, le mouvement et un fort contraste entre ombre et lumière pour susciter des émotions intenses et un sens du dramatisme."),
            en = LocalizedContent("What is the artistic movement of the Baroque?", listOf("Simplicity", "Intense emotions and drama", "Reason", "Abstraction"), "Arts", "The Baroque, born in the 17th century, is characterized by exuberance, movement, and a strong contrast between light and shadow to evoke intense emotions and a sense of drama."),
            zh = LocalizedContent("巴洛克的艺术运动是什么？", listOf("简洁", "强烈情感与戏剧性", "理性", "抽象"), "艺术", "巴洛克艺术诞生于17世纪，以华丽、动感以及光影的强烈对比为特点，旨在唤起强烈的情感和戏剧感。"),
            es = LocalizedContent("¿Cuál es el movimiento artístico del Barroco?", listOf("La simplicidad", "Las emociones intensas y el dramatismo", "La razón", "La abstracción"), "Artes", "El Barroco, nacido en el siglo XVII, se caracteriza por la exuberancia, el movimiento y un fuerte contraste entre luz y sombra para suscitar emociones intensas y un sentido del dramatismo.")
        ),
        BilingualQuestion(
            id = 50856, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le mouvement artistique du Classicisme?", listOf("L'émotion intense", "L'ordre et la raison", "L'abstraction", "L'expression de l'inconscient"), "Art", "Le Classicisme, né au XVIIe siècle, privilégie l'ordre, la raison et l'équilibre, en s'inspirant de l'art antique."),
            en = LocalizedContent("What is the artistic movement of Classicism?", listOf("Intense emotion", "Order and reason", "Abstraction", "Expression of the unconscious"), "Arts", "Classicism, born in the 17th century, favors order, reason, and balance, drawing inspiration from ancient art."),
            zh = LocalizedContent("古典主义的艺术运动是什么？", listOf("强烈情感", "秩序与理性", "抽象", "无意识表达"), "艺术", "古典主义诞生于17世纪，崇尚秩序、理性和平衡，灵感来源于古代艺术。"),
            es = LocalizedContent("¿Cuál es el movimiento artístico del Clasicismo?", listOf("La emoción intensa", "El orden y la razón", "La abstracción", "La expresión del inconsciente"), "Artes", "El Clasicismo, nacido en el siglo XVII, privilegia el orden, la razón y el equilibrio, inspirándose en el arte antiguo.")
        ),
        BilingualQuestion(
            id = 50857, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le mouvement artistique du Romantisme?", listOf("L'ordre et la raison", "L'émotion, la passion et l'individualité", "L'abstraction", "La réalité objective"), "Art", "Le Romantisme a émergé en réaction au classicisme et au rationalisme des Lumières, mettant l'accent sur l'expression des sentiments, la subjectivité et la puissance de l'imagination individuelle."),
            en = LocalizedContent("What is the artistic movement of Romanticism?", listOf("Order and reason", "Emotion, passion, and individuality", "Abstraction", "Objective reality"), "Arts", "Romanticism emerged in reaction to classicism and Enlightenment rationalism, emphasizing the expression of feelings, subjectivity, and the power of individual imagination."),
            zh = LocalizedContent("浪漫主义的艺术运动是什么？", listOf("秩序与理性", "情感、激情与个性", "抽象", "客观现实"), "艺术", "浪漫主义作为对古典主义和启蒙理性主义的反叛而兴起，强调情感表达、主观性和个人想象力的力量。"),
            es = LocalizedContent("¿Cuál es el movimiento artístico del Romanticismo?", listOf("El orden y la razón", "La emoción, la pasión y la individualidad", "La abstracción", "La realidad objetiva"), "Artes", "El Romanticismo surgió como reacción al clasicismo y al racionalismo de la Ilustración, enfatizando la expresión de los sentimientos, la subjetividad y el poder de la imaginación individual.")
        ),
        BilingualQuestion(
            id = 50858, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le mouvement artistique du Réalisme?", listOf("L'ordre et la raison", "L'émotion et la passion", "La représentation de la réalité", "L'abstraction"), "Art", "Le Réalisme, né au XIXe siècle, privilégie la représentation fidèle de la vie quotidienne et des classes populaires, en réaction au romantisme et à ses idéalisations."),
            en = LocalizedContent("What is the artistic movement of Realism?", listOf("Order and reason", "Emotion and passion", "Representation of reality", "Abstraction"), "Arts", "Realism, born in the 19th century, favors the faithful representation of everyday life and the working classes, in reaction to Romanticism and its idealizations."),
            zh = LocalizedContent("现实主义的艺术运动是什么？", listOf("秩序与理性", "情感与激情", "再现现实", "抽象"), "艺术", "现实主义诞生于19世纪，作为对浪漫主义及其理想化的反叛，主张忠实再现日常生活和工人阶级。"),
            es = LocalizedContent("¿Cuál es el movimiento artístico del Realismo?", listOf("El orden y la razón", "La emoción y la pasión", "La representación de la realidad", "La abstracción"), "Artes", "El Realismo, nacido en el siglo XIX, privilegia la representación fiel de la vida cotidiana y las clases populares, en reacción al romanticismo y sus idealizaciones.")
        ),
        BilingualQuestion(
            id = 50859, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le mouvement artistique de l'Impressionnisme?", listOf("La précision des détails", "L'impression visuelle et la lumière", "L'abstraction", "L'expression de l'inconscient"), "Art", "L'impressionnisme se concentre sur la capture des impressions visuelles fugitives et des effets de lumière, plutôt que sur les détails précis ou les sujets académiques."),
            en = LocalizedContent("What is the artistic movement of Impressionism?", listOf("Precision of details", "Visual impression and light", "Abstraction", "Expression of the unconscious"), "Arts", "Impressionism focuses on capturing fleeting visual impressions and effects of light, rather than precise details or academic subjects."),
            zh = LocalizedContent("印象主义的艺术运动是什么？", listOf("细节精确", "视觉印象与光线", "抽象", "无意识表达"), "艺术", "印象主义专注于捕捉转瞬即逝的视觉印象和光线效果，而非精确的细节或学院派主题。"),
            es = LocalizedContent("¿Cuál es el movimiento artístico del Impresionismo?", listOf("La precisión de los detalles", "La impresión visual y la luz", "La abstracción", "La expresión del inconsciente"), "Artes", "El Impresionismo se centra en capturar impresiones visuales fugaces y efectos de luz, en lugar de detalles precisos o temas académicos.")
        ),
        BilingualQuestion(
            id = 50860, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le mouvement artistique du Symbolisme?", listOf("La réalité objective", "Les symboles et l'inconscient", "L'abstraction", "L'expression de l'ordre"), "Art", "Le Symbolisme, né à la fin du XIXe siècle, privilégiait l'expression des idées, des émotions et des mystères de l'inconscient à travers des symboles plutôt que la représentation réaliste."),
            en = LocalizedContent("What is the artistic movement of Symbolism?", listOf("Objective reality", "Symbols and the unconscious", "Abstraction", "Expression of order"), "Arts", "Symbolism, born at the end of the 19th century, favored the expression of ideas, emotions, and mysteries of the unconscious through symbols rather than realistic representation."),
            zh = LocalizedContent("象征主义是什么艺术运动？", listOf("客观现实", "象征与无意识", "抽象", "秩序的表达"), "艺术", "象征主义诞生于19世纪末，主张通过象征而非写实表现来表达思想、情感和无意识的神秘。"),
            es = LocalizedContent("¿Cuál es el movimiento artístico del Simbolismo?", listOf("La realidad objetiva", "Los símbolos y el inconsciente", "La abstracción", "La expresión del orden"), "Artes", "El Simbolismo, nacido a finales del siglo XIX, privilegiaba la expresión de ideas, emociones y misterios del inconsciente a través de símbolos, en lugar de la representación realista.")
        ),
        BilingualQuestion(
            id = 50861, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le mouvement artistique du Cubisme?", listOf("La perspective simple", "La déconstruction des formes", "L'abstraction", "Le réalisme"), "Art", "Le cubisme, initié par Picasso et Braque vers 1907, se caractérise par la fragmentation des objets en formes géométriques et leur représentation sous plusieurs angles simultanés."),
            en = LocalizedContent("What is the artistic movement of Cubism?", listOf("Simple perspective", "Deconstruction of forms", "Abstraction", "Realism"), "Arts", "Cubism, initiated by Picasso and Braque around 1907, is characterized by the fragmentation of objects into geometric shapes and their representation from multiple simultaneous angles."),
            zh = LocalizedContent("立体主义是什么艺术运动？", listOf("简单透视", "解构形式", "抽象", "现实主义"), "艺术", "立体主义由毕加索和布拉克于1907年左右开创，以将物体分解为几何形状并从多个角度同时呈现为特征。"),
            es = LocalizedContent("¿Cuál es el movimiento artístico del Cubismo?", listOf("La perspectiva simple", "La deconstrucción de las formas", "La abstracción", "El realismo"), "Artes", "El Cubismo, iniciado por Picasso y Braque hacia 1907, se caracteriza por la fragmentación de objetos en formas geométricas y su representación desde múltiples ángulos simultáneos.")
        ),
        BilingualQuestion(
            id = 50862, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le mouvement artistique du Surréalisme?", listOf("La réalité objective", "Les symboles et l'inconscient", "L'abstraction", "L'expression du rêve"), "Art", "Le surréalisme, fondé par André Breton, cherche à libérer la pensée en explorant l'inconscient et le rêve, considéré comme une source d'inspiration pure."),
            en = LocalizedContent("What is the artistic movement of Surrealism?", listOf("Objective reality", "Symbols and the unconscious", "Abstraction", "Expression of dreams"), "Arts", "Surrealism, founded by André Breton, seeks to liberate thought by exploring the unconscious and dreams, considered a pure source of inspiration."),
            zh = LocalizedContent("超现实主义是什么艺术运动？", listOf("客观现实", "象征与无意识", "抽象", "梦境表达"), "艺术", "超现实主义由安德烈·布勒东创立，旨在通过探索无意识和梦境来解放思想，将其视为纯粹的灵感来源。"),
            es = LocalizedContent("¿Cuál es el movimiento artístico del Surrealismo?", listOf("La realidad objetiva", "Los símbolos y el inconsciente", "La abstracción", "La expresión del sueño"), "Artes", "El Surrealismo, fundado por André Breton, busca liberar el pensamiento explorando el inconsciente y el sueño, considerados una fuente pura de inspiración.")
        ),
        BilingualQuestion(
            id = 50863, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le mouvement artistique de l'Expressionnisme?", listOf("La réalité objective", "L'émotion intense et la subjectivité", "L'abstraction", "L'ordre et la raison"), "Art", "L'Expressionnisme, né au début du XXe siècle, privilégie la représentation des émotions subjectives et des sentiments intenses plutôt que la réalité objective."),
            en = LocalizedContent("What is the artistic movement of Expressionism?", listOf("Objective reality", "Intense emotion and subjectivity", "Abstraction", "Order and reason"), "Arts", "Expressionism, born at the beginning of the 20th century, prioritizes the representation of subjective emotions and intense feelings over objective reality."),
            zh = LocalizedContent("表现主义是什么艺术运动？", listOf("客观现实", "强烈情感与主观性", "抽象", "秩序与理性"), "艺术", "表现主义诞生于20世纪初，优先表现主观情感和强烈感受，而非客观现实。"),
            es = LocalizedContent("¿Cuál es el movimiento artístico del Expresionismo?", listOf("La realidad objetiva", "La emoción intensa y la subjetividad", "La abstracción", "El orden y la razón"), "Artes", "El Expresionismo, nacido a principios del siglo XX, privilegia la representación de emociones subjetivas y sentimientos intensos sobre la realidad objetiva.")
        ),
        BilingualQuestion(
            id = 50864, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le mouvement artistique du Fauvisme?", listOf("La précision des couleurs", "La couleur intense et libre", "L'abstraction", "L'ordre et la raison"), "Art", "Le Fauvisme, apparu au début du XXe siècle, se caractérise par l'utilisation de couleurs vives et non naturalistes, appliquées de manière expressive et spontanée, sans souci de réalisme."),
            en = LocalizedContent("What is the artistic movement of Fauvism?", listOf("Precision of colors", "Intense and free color", "Abstraction", "Order and reason"), "Arts", "Fauvism, which appeared at the beginning of the 20th century, is characterized by the use of bright, non-naturalistic colors applied expressively and spontaneously, without concern for realism."),
            zh = LocalizedContent("野兽派是什么艺术运动？", listOf("色彩精确", "强烈而自由的色彩", "抽象", "秩序与理性"), "艺术", "野兽派出现于20世纪初，以使用鲜艳、非自然的色彩为特征，色彩运用富有表现力和自发性，不拘泥于写实。"),
            es = LocalizedContent("¿Cuál es el movimiento artístico del Fauvismo?", listOf("La precisión de los colores", "El color intenso y libre", "La abstracción", "El orden y la razón"), "Artes", "El Fauvismo, aparecido a principios del siglo XX, se caracteriza por el uso de colores vivos y no naturalistas, aplicados de manera expresiva y espontánea, sin preocupación por el realismo.")
        ),
        BilingualQuestion(
            id = 50865, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le mouvement artistique de l'Abstraction?", listOf("La représentation réaliste", "La non-représentation", "L'expression du rêve", "L'ordre et la raison"), "Art", "L'abstraction se définit par le refus de représenter le monde visible. Elle privilégie les formes, les couleurs et les lignes pour elles-mêmes, sans référence à un sujet reconnaissable."),
            en = LocalizedContent("What is the artistic movement of Abstraction?", listOf("Realistic representation", "Non-representation", "Expression of dreams", "Order and reason"), "Arts", "Abstraction is defined by the refusal to represent the visible world. It prioritizes forms, colors, and lines for their own sake, without reference to a recognizable subject."),
            zh = LocalizedContent("抽象主义是什么艺术运动？", listOf("写实再现", "非再现", "梦境表达", "秩序与理性"), "艺术", "抽象主义拒绝再现可见世界，优先考虑形式、色彩和线条本身，不参照可识别的主题。"),
            es = LocalizedContent("¿Cuál es el movimiento artístico de la Abstracción?", listOf("La representación realista", "La no representación", "La expresión del sueño", "El orden y la razón"), "Artes", "La abstracción se define por el rechazo a representar el mundo visible. Prioriza las formas, los colores y las líneas por sí mismos, sin referencia a un tema reconocible.")
        ),
        BilingualQuestion(
            id = 50866, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le mouvement artistique du Dadaïsme?", listOf("L'ordre et la raison", "L'absurdité et le non-sens", "L'expression du rêve", "La réalité objective"), "Art", "Le Dadaïsme, né pendant la Première Guerre mondiale, rejetait la logique et la raison en prônant l'absurdité et le non-sens comme réaction contre les valeurs ayant mené au conflit."),
            en = LocalizedContent("What is the artistic movement of Dadaism?", listOf("Order and reason", "Absurdity and nonsense", "Expression of dreams", "Objective reality"), "Arts", "Dadaism, born during World War I, rejected logic and reason by promoting absurdity and nonsense as a reaction against the values that led to the conflict."),
            zh = LocalizedContent("达达主义是什么艺术运动？", listOf("秩序与理性", "荒诞与无意义", "梦境表达", "客观现实"), "艺术", "达达主义诞生于第一次世界大战期间，拒绝逻辑和理性，推崇荒诞和无意义，以此反抗导致冲突的价值观。"),
            es = LocalizedContent("¿Cuál es el movimiento artístico del Dadá?", listOf("El orden y la razón", "El absurdo y el sinsentido", "La expresión del sueño", "La realidad objetiva"), "Artes", "El Dadá, nacido durante la Primera Guerra Mundial, rechazaba la lógica y la razón promoviendo el absurdo y el sinsentido como reacción contra los valores que llevaron al conflicto.")
        ),
        BilingualQuestion(
            id = 50867, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le mouvement artistique du Futurisme?", listOf("Le passé", "L'avenir et la technologie", "L'expression du rêve", "La réalité objective"), "Art", "Le Futurisme, né en Italie au début du XXe siècle, exaltait la vitesse, la technologie et le dynamisme de la vie moderne, rejetant le passé pour célébrer l'avenir."),
            en = LocalizedContent("What is the artistic movement of Futurism?", listOf("The past", "The future and technology", "Expression of dreams", "Objective reality"), "Arts", "Futurism, born in Italy at the beginning of the 20th century, exalted speed, technology, and the dynamism of modern life, rejecting the past to celebrate the future."),
            zh = LocalizedContent("未来主义是什么艺术运动？", listOf("过去", "未来与科技", "梦境表达", "客观现实"), "艺术", "未来主义诞生于20世纪初的意大利，崇尚速度、技术和现代生活的活力，拒绝过去，赞美未来。"),
            es = LocalizedContent("¿Cuál es el movimiento artístico del Futurismo?", listOf("El pasado", "El futuro y la tecnología", "La expresión del sueño", "La realidad objetiva"), "Artes", "El Futurismo, nacido en Italia a principios del siglo XX, exaltaba la velocidad, la tecnología y el dinamismo de la vida moderna, rechazando el pasado para celebrar el futuro.")
        ),
        BilingualQuestion(
            id = 50868, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel artiste est le plus célèbre de la Renaissance?", listOf("Michel-Ange", "Léonard de Vinci", "Botticelli", "Raphaël"), "Art", "Léonard de Vinci est considéré comme l'archétype de l'homme de la Renaissance pour ses talents multiples en peinture, sculpture, architecture et sciences, avec des chefs-d'œuvre comme La Joconde et La Cène."),
            en = LocalizedContent("Which artist is the most famous of the Renaissance?", listOf("Michelangelo", "Leonardo da Vinci", "Botticelli", "Raphael"), "Arts", "Leonardo da Vinci is considered the archetype of the Renaissance man for his multiple talents in painting, sculpture, architecture, and science, with masterpieces like the Mona Lisa and The Last Supper."),
            zh = LocalizedContent("哪位艺术家是文艺复兴时期最著名的？", listOf("米开朗基罗", "列奥纳多·达·芬奇", "波提切利", "拉斐尔"), "艺术", "列奥纳多·达·芬奇被视为文艺复兴时期全才的典范，在绘画、雕塑、建筑和科学方面多才多艺，代表作有《蒙娜丽莎》和《最后的晚餐》。"),
            es = LocalizedContent("¿Qué artista es el más famoso del Renacimiento?", listOf("Miguel Ángel", "Leonardo da Vinci", "Botticelli", "Rafael"), "Artes", "Leonardo da Vinci es considerado el arquetipo del hombre del Renacimiento por sus múltiples talentos en pintura, escultura, arquitectura y ciencias, con obras maestras como La Mona Lisa y La Última Cena.")
        ),
        BilingualQuestion(
            id = 50869, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste est le plus célèbre du Baroque?", listOf("Caravaggio", "Rembrandt", "Velázquez", "Rubens"), "Art", "Caravaggio est considéré comme le maître du Baroque pour son usage révolutionnaire du clair-obscur et son réalisme dramatique, qui ont profondément influencé la peinture européenne du XVIIe siècle."),
            en = LocalizedContent("Which artist is the most famous of the Baroque?", listOf("Caravaggio", "Rembrandt", "Velázquez", "Rubens"), "Arts", "Caravaggio is considered the master of the Baroque for his revolutionary use of chiaroscuro and dramatic realism, which profoundly influenced 17th-century European painting."),
            zh = LocalizedContent("哪位艺术家是巴洛克时期最著名的？", listOf("卡拉瓦乔", "伦勃朗", "委拉斯开兹", "鲁本斯"), "艺术", "卡拉瓦乔被视为巴洛克大师，因其对明暗对比法的革命性运用和戏剧性的现实主义，深刻影响了17世纪的欧洲绘画。"),
            es = LocalizedContent("¿Qué artista es el más famoso del Barroco?", listOf("Caravaggio", "Rembrandt", "Velázquez", "Rubens"), "Artes", "Caravaggio es considerado el maestro del Barroco por su uso revolucionario del claroscuro y su realismo dramático, que influyeron profundamente en la pintura europea del siglo XVII.")
        ),
        BilingualQuestion(
            id = 50870, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste est le plus célèbre du Classicisme?", listOf("Ingres", "David", "Poussin", "Lorrain"), "Art", "Jacques-Louis David est considéré comme le chef de file du Classicisme français, notamment pour ses tableaux comme Le Serment des Horaces. Il incarne l'esthétique néoclassique de la fin du XVIIIe siècle."),
            en = LocalizedContent("Which artist is the most famous of Classicism?", listOf("Ingres", "David", "Poussin", "Lorrain"), "Arts", "Jacques-Louis David is considered the leader of French Classicism, notably for paintings like The Oath of the Horatii. He embodies the neoclassical aesthetic of the late 18th century."),
            zh = LocalizedContent("哪位艺术家是古典主义最著名的代表？", listOf("安格尔", "大卫", "普桑", "洛兰"), "艺术", "雅克-路易·大卫被认为是法国古典主义的领袖，尤其以《贺拉斯兄弟之誓》等画作闻名。他体现了18世纪末新古典主义美学。"),
            es = LocalizedContent("¿Qué artista es el más famoso del Clasicismo?", listOf("Ingres", "David", "Poussin", "Lorrain"), "Artes", "Jacques-Louis David es considerado el líder del Clasicismo francés, especialmente por cuadros como El juramento de los Horacios. Encarna la estética neoclásica de finales del siglo XVIII.")
        ),
        BilingualQuestion(
            id = 50871, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste est le plus célèbre du Romantisme?", listOf("Delacroix", "Géricault", "Constable", "Turner"), "Art", "Eugène Delacroix est considéré comme le chef de file du Romantisme en peinture française, notamment pour des œuvres comme La Liberté guidant le peuple."),
            en = LocalizedContent("Which artist is the most famous of Romanticism?", listOf("Delacroix", "Géricault", "Constable", "Turner"), "Arts", "Eugène Delacroix is considered the leader of Romanticism in French painting, notably for works like Liberty Leading the People."),
            zh = LocalizedContent("哪位艺术家是浪漫主义最著名的代表？", listOf("德拉克罗瓦", "热里科", "康斯特布尔", "透纳"), "艺术", "欧仁·德拉克罗瓦被认为是法国绘画中浪漫主义的领袖，尤其以《自由引导人民》等作品闻名。"),
            es = LocalizedContent("¿Qué artista es el más famoso del Romanticismo?", listOf("Delacroix", "Géricault", "Constable", "Turner"), "Artes", "Eugène Delacroix es considerado el líder del Romanticismo en la pintura francesa, especialmente por obras como La libertad guiando al pueblo.")
        ),
        BilingualQuestion(
            id = 50872, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste est le plus célèbre du Réalisme?", listOf("Courbet", "Corot", "Millet", "Daumier"), "Art", "Gustave Courbet est considéré comme le chef de file du mouvement réaliste au XIXe siècle, s'opposant au romantisme en peignant des scènes de la vie quotidienne et des travailleurs."),
            en = LocalizedContent("Which artist is the most famous of Realism?", listOf("Courbet", "Corot", "Millet", "Daumier"), "Arts", "Gustave Courbet is considered the leader of the Realist movement in the 19th century, opposing Romanticism by painting scenes of everyday life and workers."),
            zh = LocalizedContent("哪位艺术家是现实主义最著名的代表？", listOf("库尔贝", "柯罗", "米勒", "杜米埃"), "艺术", "古斯塔夫·库尔贝被认为是19世纪现实主义运动的领袖，他通过描绘日常生活和工人场景来反对浪漫主义。"),
            es = LocalizedContent("¿Qué artista es el más famoso del Realismo?", listOf("Courbet", "Corot", "Millet", "Daumier"), "Artes", "Gustave Courbet es considerado el líder del movimiento realista en el siglo XIX, oponiéndose al romanticismo al pintar escenas de la vida cotidiana y trabajadores.")
        ),
        BilingualQuestion(
            id = 50873, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel artiste est le plus célèbre de l'Impressionnisme?", listOf("Monet", "Renoir", "Degas", "Sisley"), "Art", "Claude Monet est considéré comme le chef de file de l'impressionnisme, notamment grâce à son tableau \"Impression, soleil levant\" qui a donné son nom au mouvement."),
            en = LocalizedContent("Which artist is the most famous of Impressionism?", listOf("Monet", "Renoir", "Degas", "Sisley"), "Arts", "Claude Monet is considered the leader of Impressionism, notably thanks to his painting \"Impression, Sunrise\" which gave its name to the movement."),
            zh = LocalizedContent("哪位艺术家是印象派最著名的代表？", listOf("莫奈", "雷诺阿", "德加", "西斯莱"), "艺术", "克劳德·莫奈被认为是印象派的领袖，尤其因其画作《印象·日出》而得名，该画作也赋予了运动名称。"),
            es = LocalizedContent("¿Qué artista es el más famoso del Impresionismo?", listOf("Monet", "Renoir", "Degas", "Sisley"), "Artes", "Claude Monet es considerado el líder del Impresionismo, especialmente gracias a su cuadro \"Impresión, sol naciente\" que dio nombre al movimiento.")
        ),
        BilingualQuestion(
            id = 50874, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel artiste est le plus célèbre du Symbolisme?", listOf("Klimt", "Mucha", "Moreau", "Beardsley"), "Art", "Alphonse Mucha est un peintre et affichiste tchèque, figure majeure du Symbolisme et de l'Art nouveau, célèbre pour ses œuvres décoratives et ses représentations de femmes élégantes."),
            en = LocalizedContent("Which artist is the most famous of Symbolism?", listOf("Klimt", "Mucha", "Moreau", "Beardsley"), "Arts", "Alphonse Mucha was a Czech painter and poster artist, a major figure of Symbolism and Art Nouveau, famous for his decorative works and depictions of elegant women."),
            zh = LocalizedContent("哪位艺术家是象征主义最著名的代表？", listOf("克里姆特", "穆夏", "莫罗", "比尔兹利"), "艺术", "阿尔丰斯·穆夏是捷克画家和海报艺术家，象征主义和新艺术运动的重要人物，以其装饰性作品和优雅女性形象而闻名。"),
            es = LocalizedContent("¿Qué artista es el más famoso del Simbolismo?", listOf("Klimt", "Mucha", "Moreau", "Beardsley"), "Artes", "Alphonse Mucha fue un pintor y cartelista checo, figura importante del Simbolismo y el Art Nouveau, famoso por sus obras decorativas y representaciones de mujeres elegantes.")
        ),
        BilingualQuestion(
            id = 50875, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste est le plus célèbre du Cubisme?", listOf("Braque", "Picasso", "Gris", "Léger"), "Art", "Picasso, avec Georges Braque, a fondé le mouvement cubiste au début du XXe siècle, révolutionnant la représentation de l'espace et des formes en peinture."),
            en = LocalizedContent("Which artist is the most famous of Cubism?", listOf("Braque", "Picasso", "Gris", "Léger"), "Arts", "Picasso, with Georges Braque, founded the Cubist movement in the early 20th century, revolutionizing the representation of space and forms in painting."),
            zh = LocalizedContent("哪位艺术家是立体主义最著名的代表？", listOf("布拉克", "毕加索", "格里斯", "莱热"), "艺术", "毕加索与乔治·布拉克在20世纪初创立了立体主义运动，彻底改变了绘画中空间和形式的再现。"),
            es = LocalizedContent("¿Qué artista es el más famoso del Cubismo?", listOf("Braque", "Picasso", "Gris", "Léger"), "Artes", "Picasso, junto con Georges Braque, fundó el movimiento cubista a principios del siglo XX, revolucionando la representación del espacio y las formas en la pintura.")
        ),
        BilingualQuestion(
            id = 50876, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste est le plus célèbre du Surréalisme?", listOf("Dalí", "Miró", "Magritte", "Ernst"), "Art", "Salvador Dalí est l'artiste le plus emblématique du surréalisme grâce à ses œuvres oniriques et provocatrices comme \"La Persistance de la mémoire\"."),
            en = LocalizedContent("Which artist is the most famous of Surrealism?", listOf("Dalí", "Miró", "Magritte", "Ernst"), "Arts", "Salvador Dalí is the most emblematic artist of Surrealism thanks to his dreamlike and provocative works like \"The Persistence of Memory\"."),
            zh = LocalizedContent("哪位艺术家是超现实主义最著名的代表？", listOf("达利", "米罗", "马格利特", "恩斯特"), "艺术", "萨尔瓦多·达利是超现实主义最具代表性的艺术家，以其梦幻而 provocative 的作品如《记忆的永恒》而闻名。"),
            es = LocalizedContent("¿Qué artista es el más famoso del Surrealismo?", listOf("Dalí", "Miró", "Magritte", "Ernst"), "Artes", "Salvador Dalí es el artista más emblemático del surrealismo gracias a sus obras oníricas y provocadoras como \"La persistencia de la memoria\".")
        ),
        BilingualQuestion(
            id = 50877, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste est le plus célèbre de l'Expressionnisme?", listOf("Munch", "Kirchner", "Nolde", "Schiele"), "Art", "Edvard Munch, peintre norvégien, est considéré comme le précurseur et figure majeure de l'expressionnisme, notamment avec son œuvre emblématique \"Le Cri\"."),
            en = LocalizedContent("Which artist is the most famous of Expressionism?", listOf("Munch", "Kirchner", "Nolde", "Schiele"), "Arts", "Edvard Munch, a Norwegian painter, is considered the precursor and major figure of Expressionism, notably with his iconic work \"The Scream\"."),
            zh = LocalizedContent("哪位艺术家是表现主义最著名的代表？", listOf("蒙克", "基希纳", "诺尔德", "席勒"), "艺术", "爱德华·蒙克，挪威画家，被认为是表现主义的先驱和重要人物，尤其以其标志性作品《呐喊》而闻名。"),
            es = LocalizedContent("¿Qué artista es el más famoso del Expresionismo?", listOf("Munch", "Kirchner", "Nolde", "Schiele"), "Artes", "Edvard Munch, pintor noruego, es considerado el precursor y figura principal del expresionismo, especialmente con su obra emblemática \"El grito\".")
        ),
        BilingualQuestion(
            id = 50878, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste est le plus célèbre du Fauvisme?", listOf("Matisse", "Derain", "Vlaminck", "Dufy"), "Art", "Henri Matisse est considéré comme le chef de file du Fauvisme, mouvement marqué par l'usage de couleurs vives et pures, notamment dans ses œuvres comme \"La Danse\"."),
            en = LocalizedContent("Which artist is the most famous of Fauvism?", listOf("Matisse", "Derain", "Vlaminck", "Dufy"), "Arts", "Henri Matisse is considered the leader of Fauvism, a movement marked by the use of bright, pure colors, notably in works like \"The Dance\"."),
            zh = LocalizedContent("哪位艺术家是野兽派最著名的代表？", listOf("马蒂斯", "德兰", "弗拉曼克", "杜菲"), "艺术", "亨利·马蒂斯被认为是野兽派的领袖，该运动以使用明亮、纯净的色彩为特点，尤其体现在《舞蹈》等作品中。"),
            es = LocalizedContent("¿Qué artista es el más famoso del Fauvismo?", listOf("Matisse", "Derain", "Vlaminck", "Dufy"), "Artes", "Henri Matisse es considerado el líder del Fauvismo, movimiento marcado por el uso de colores vivos y puros, especialmente en obras como \"La danza\".")
        ),
        BilingualQuestion(
            id = 50879, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste est le plus célèbre de l'Abstraction?", listOf("Kandinsky", "Mondrian", "Malevitch", "Pollock"), "Art", "Jackson Pollock est reconnu comme le chef de file de l'expressionnisme abstrait américain, notamment pour sa technique de dripping qui a révolutionné l'art abstrait dans les années 1940-1950."),
            en = LocalizedContent("Which artist is the most famous of Abstract art?", listOf("Kandinsky", "Mondrian", "Malevich", "Pollock"), "Arts", "Jackson Pollock is recognized as the leader of American Abstract Expressionism, notably for his dripping technique that revolutionized abstract art in the 1940s-1950s."),
            zh = LocalizedContent("哪位艺术家是抽象艺术最著名的代表？", listOf("康定斯基", "蒙德里安", "马列维奇", "波洛克"), "艺术", "杰克逊·波洛克被公认为美国抽象表现主义的领袖，尤其以其滴画技法在20世纪40-50年代彻底改变了抽象艺术。"),
            es = LocalizedContent("¿Qué artista es el más famoso del Arte Abstracto?", listOf("Kandinsky", "Mondrian", "Malevich", "Pollock"), "Artes", "Jackson Pollock es reconocido como el líder del Expresionismo Abstracto estadounidense, especialmente por su técnica de dripping que revolucionó el arte abstracto en las décadas de 1940-1950.")
        ),
    )

    private fun part5(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 50880, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus célèbre tableau de Léonard de Vinci?", listOf("La Cène", "La Joconde", "La Vierge aux Rochers", "La Vitruve"), "Art", "Peint entre 1503 et 1519, ce portrait de Mona Lisa est exposé au musée du Louvre à Paris et est mondialement reconnu pour son sourire énigmatique et son sfumato."),
            en = LocalizedContent("What is the most famous painting by Leonardo da Vinci?", listOf("The Last Supper", "Mona Lisa", "Virgin of the Rocks", "Vitruvian Man"), "Arts", "Painted between 1503 and 1519, this portrait of Mona Lisa is exhibited at the Louvre Museum in Paris and is globally recognized for its enigmatic smile and sfumato technique."),
            zh = LocalizedContent("列奥纳多·达·芬奇最著名的画作是什么？", listOf("最后的晚餐", "蒙娜丽莎", "岩间圣母", "维特鲁威人"), "艺术", "这幅画创作于1503年至1519年间，是蒙娜丽莎的肖像，现藏于巴黎卢浮宫博物馆，以其神秘的微笑和晕涂法闻名于世。"),
            es = LocalizedContent("¿Cuál es el cuadro más famoso de Leonardo da Vinci?", listOf("La Última Cena", "La Gioconda", "La Virgen de las Rocas", "El Hombre de Vitruvio"), "Artes", "Pintado entre 1503 y 1519, este retrato de Mona Lisa se exhibe en el Museo del Louvre en París y es reconocido mundialmente por su sonrisa enigmática y su sfumato.")
        ),
        BilingualQuestion(
            id = 50881, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus célèbre tableau de Michel-Ange?", listOf("La Création d'Adam", "La Dernière Cène", "La Nuit étoilée", "Les Noces de Cana"), "Art", "Peinte sur le plafond de la chapelle Sixtine au Vatican entre 1508 et 1512, cette fresque représente le moment où Dieu donne la vie à Adam."),
            en = LocalizedContent("What is the most famous painting by Michelangelo?", listOf("The Creation of Adam", "The Last Supper", "The Starry Night", "The Wedding at Cana"), "Arts", "Painted on the ceiling of the Sistine Chapel in the Vatican between 1508 and 1512, this fresco depicts the moment when God gives life to Adam."),
            zh = LocalizedContent("米开朗基罗最著名的画作是什么？", listOf("创造亚当", "最后的晚餐", "星月夜", "迦拿的婚礼"), "艺术", "这幅壁画绘于1508年至1512年间梵蒂冈西斯廷教堂的天花板上，描绘了上帝赋予亚当生命的时刻。"),
            es = LocalizedContent("¿Cuál es el cuadro más famoso de Miguel Ángel?", listOf("La Creación de Adán", "La Última Cena", "La Noche Estrellada", "Las Bodas de Caná"), "Artes", "Pintada en el techo de la Capilla Sixtina en el Vaticano entre 1508 y 1512, este fresco representa el momento en que Dios da vida a Adán.")
        ),
        BilingualQuestion(
            id = 50882, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus célèbre tableau de Raphaël?", listOf("La Transfiguration", "La Madone Sixtine", "La Madone à la Chaise", "La Madone du Châtiment"), "Art", "La Transfiguration est considérée comme le chef-d'œuvre ultime de Raphaël, peint en 1520, année de sa mort. Cette œuvre monumentale, exposée aux Musées du Vatican, illustre l'épisode biblique de la transfiguration du Christ."),
            en = LocalizedContent("What is the most famous painting by Raphael?", listOf("The Transfiguration", "The Sistine Madonna", "Madonna della Sedia", "Madonna of the Pomegranate"), "Arts", "The Transfiguration is considered Raphael's ultimate masterpiece, painted in 1520, the year of his death. This monumental work, exhibited at the Vatican Museums, illustrates the biblical episode of the Transfiguration of Christ."),
            zh = LocalizedContent("拉斐尔最著名的画作是什么？", listOf("基督显圣", "西斯廷圣母", "椅中圣母", "石榴圣母"), "艺术", "《基督显圣》被认为是拉斐尔的终极杰作，绘于1520年，即他去世那年。这幅巨作现藏于梵蒂冈博物馆，描绘了基督变容的圣经故事。"),
            es = LocalizedContent("¿Cuál es el cuadro más famoso de Rafael?", listOf("La Transfiguración", "La Virgen Sixtina", "La Virgen de la Silla", "La Virgen del Granado"), "Artes", "La Transfiguración es considerada la obra maestra definitiva de Rafael, pintada en 1520, año de su muerte. Esta obra monumental, expuesta en los Museos Vaticanos, ilustra el episodio bíblico de la transfiguración de Cristo.")
        ),
        BilingualQuestion(
            id = 50883, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus célèbre tableau de Caravaggio?", listOf("La Vocation de Saint Matthieu", "L'Appel de Saint Matthieu", "La Mort de la Vierge", "Judith Décapitant Holopherne"), "Art", "L'Appel de saint Matthieu, peint vers 1600, est l'une des œuvres les plus emblématiques du Caravage, marquant le début du baroque avec son usage dramatique du clair-obscur."),
            en = LocalizedContent("What is the most famous painting by Caravaggio?", listOf("The Calling of Saint Matthew", "The Calling of Saint Matthew", "Death of the Virgin", "Judith Beheading Holofernes"), "Arts", "The Calling of Saint Matthew, painted around 1600, is one of Caravaggio's most iconic works, marking the beginning of the Baroque with its dramatic use of chiaroscuro."),
            zh = LocalizedContent("卡拉瓦乔最著名的画作是什么？", listOf("圣马太蒙召", "圣马太蒙召", "圣母之死", "犹滴斩杀霍洛芬斯"), "艺术", "《圣马太蒙召》绘于约1600年，是卡拉瓦乔最具代表性的作品之一，以其戏剧性的明暗对比标志着巴洛克艺术的开始。"),
            es = LocalizedContent("¿Cuál es el cuadro más famoso de Caravaggio?", listOf("La Vocación de San Mateo", "La Vocación de San Mateo", "La Muerte de la Virgen", "Judith Decapitando a Holofernes"), "Artes", "La Vocación de San Mateo, pintada hacia 1600, es una de las obras más emblemáticas de Caravaggio, marcando el inicio del Barroco con su uso dramático del claroscuro.")
        ),
        BilingualQuestion(
            id = 50884, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus célèbre tableau de Rembrandt?", listOf("La Ronde de Nuit", "L'Archange Raphaël", "Le Retour du Fils Prodigue", "Autoportrait"), "Art", "Peint en 1642, La Ronde de Nuit est le chef-d'œuvre le plus connu de Rembrandt, célèbre pour son jeu de clair-obscur et sa composition dynamique représentant une milice civique."),
            en = LocalizedContent("What is the most famous painting by Rembrandt?", listOf("The Night Watch", "The Archangel Raphael", "The Return of the Prodigal Son", "Self-Portrait"), "Arts", "Painted in 1642, The Night Watch is Rembrandt's most famous masterpiece, renowned for its chiaroscuro and dynamic composition depicting a civic militia."),
            zh = LocalizedContent("伦勃朗最著名的画作是什么？", listOf("夜巡", "天使拉斐尔", "浪子回头", "自画像"), "艺术", "《夜巡》绘于1642年，是伦勃朗最著名的杰作，以其明暗对比和描绘市民卫队的动态构图而闻名。"),
            es = LocalizedContent("¿Cuál es el cuadro más famoso de Rembrandt?", listOf("La Ronda de Noche", "El Arcángel Rafael", "El Regreso del Hijo Pródigo", "Autorretrato"), "Artes", "Pintada en 1642, La Ronda de Noche es la obra maestra más famosa de Rembrandt, célebre por su claroscuro y su composición dinámica que representa una milicia cívica.")
        ),
        BilingualQuestion(
            id = 50885, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus célèbre tableau de Velázquez?", listOf("Las Meninas", "Le Christ à la Croix", "La Reddition de Breda", "Vieille Femme Cuisinant des Œufs"), "Art", "Las Meninas est considéré comme le chef-d'œuvre de Diego Velázquez, peint en 1656, et fascine par sa composition complexe et son jeu de regards entre le peintre, le modèle et le spectateur."),
            en = LocalizedContent("What is the most famous painting by Velázquez?", listOf("Las Meninas", "Christ on the Cross", "The Surrender of Breda", "Old Woman Cooking Eggs"), "Arts", "Las Meninas is considered Diego Velázquez's masterpiece, painted in 1656, and fascinates with its complex composition and interplay of gazes between the painter, the model, and the viewer."),
            zh = LocalizedContent("委拉斯开兹最著名的画作是什么？", listOf("宫娥", "十字架上的基督", "布雷达的投降", "老妇煎蛋"), "艺术", "《宫娥》被认为是迭戈·委拉斯开兹的杰作，绘于1656年，以其复杂的构图和画家、模特与观众之间的目光互动而引人入胜。"),
            es = LocalizedContent("¿Cuál es el cuadro más famoso de Velázquez?", listOf("Las Meninas", "Cristo en la Cruz", "La Rendición de Breda", "Vieja friendo huevos"), "Artes", "Las Meninas es considerada la obra maestra de Diego Velázquez, pintada en 1656, y fascina por su compleja composición y el juego de miradas entre el pintor, el modelo y el espectador.")
        ),
        BilingualQuestion(
            id = 50886, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus célèbre tableau de Delacroix?", listOf("La Liberté Guidant le Peuple", "L'Entrée de Croisés", "La Mort de Sardanapale", "Scène de Massacre de Scio"), "Art", "Peint en 1830, ce tableau commémore les Trois Glorieuses, les journées révolutionnaires qui renversèrent Charles X. Il est devenu un symbole universel de la liberté et de la République française."),
            en = LocalizedContent("What is the most famous painting by Delacroix?", listOf("Liberty Leading the People", "The Entry of the Crusaders", "The Death of Sardanapalus", "Scene of the Massacre at Chios"), "Arts", "Painted in 1830, this painting commemorates the Three Glorious Days, the revolutionary days that overthrew Charles X. It has become a universal symbol of liberty and the French Republic."),
            zh = LocalizedContent("德拉克罗瓦最著名的画作是什么？", listOf("自由引导人民", "十字军进入君士坦丁堡", "萨达纳帕鲁斯之死", "希俄斯岛的屠杀"), "艺术", "这幅画绘于1830年，纪念推翻查理十世的“光荣三日”革命。它已成为自由和法兰西共和国的普遍象征。"),
            es = LocalizedContent("¿Cuál es el cuadro más famoso de Delacroix?", listOf("La Libertad Guiando al Pueblo", "La Entrada de los Cruzados", "La Muerte de Sardanápalo", "Escena de la Masacre de Quíos"), "Artes", "Pintado en 1830, este cuadro conmemora las Tres Jornadas Gloriosas, los días revolucionarios que derrocaron a Carlos X. Se ha convertido en un símbolo universal de la libertad y la República Francesa.")
        ),
        BilingualQuestion(
            id = 50887, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus célèbre tableau de Courbet?", listOf("Un Enterrement à Ornans", "L'Origine du Monde", "Les Demoiselles de Village", "Les Baigneuses"), "Art", "Un Enterrement à Ornans est le tableau le plus célèbre de Gustave Courbet car il a marqué une rupture avec le romantisme en représentant une scène de la vie rurale ordinaire avec un réalisme cru et monumental."),
            en = LocalizedContent("What is the most famous painting by Courbet?", listOf("A Burial at Ornans", "The Origin of the World", "The Village Maidens", "The Bathers"), "Arts", "A Burial at Ornans is Gustave Courbet's most famous painting because it marked a break with Romanticism by depicting an ordinary rural scene with raw and monumental realism."),
            zh = LocalizedContent("库尔贝最著名的画作是什么？", listOf("奥尔南的葬礼", "世界的起源", "乡村姑娘", "浴女"), "艺术", "《奥尔南的葬礼》是古斯塔夫·库尔贝最著名的画作，因为它以粗犷而宏大的现实主义描绘了普通的乡村场景，标志着与浪漫主义的决裂。"),
            es = LocalizedContent("¿Cuál es el cuadro más famoso de Courbet?", listOf("Un Entierro en Ornans", "El Origen del Mundo", "Las Doncellas del Pueblo", "Las Bañistas"), "Artes", "Un Entierro en Ornans es el cuadro más famoso de Gustave Courbet porque marcó una ruptura con el Romanticismo al representar una escena rural ordinaria con un realismo crudo y monumental.")
        ),
        BilingualQuestion(
            id = 50888, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus célèbre tableau de Monet?", listOf("Les Nymphéas", "Impression Soleil Levant", "La Gare Saint-Lazare", "Rouen Cathedral"), "Art", "Impression, soleil levant est le tableau qui a donné son nom au mouvement impressionniste, présenté en 1874 lors de la première exposition du groupe."),
            en = LocalizedContent("What is the most famous painting by Monet?", listOf("Water Lilies", "Impression, Sunrise", "Saint-Lazare Station", "Rouen Cathedral"), "Arts", "Impression, Sunrise is the painting that gave its name to the Impressionist movement, presented in 1874 at the group's first exhibition."),
            zh = LocalizedContent("莫奈最著名的画作是什么？", listOf("睡莲", "印象·日出", "圣拉扎尔火车站", "鲁昂大教堂"), "艺术", "《印象·日出》是赋予印象派运动名称的画作，于1874年在团体首次展览中展出。"),
            es = LocalizedContent("¿Cuál es el cuadro más famoso de Monet?", listOf("Los Nenúfares", "Impresión, Sol Naciente", "La Estación de Saint-Lazare", "Catedral de Ruan"), "Artes", "Impresión, sol naciente es el cuadro que dio nombre al movimiento impresionista, presentado en 1874 en la primera exposición del grupo.")
        ),
        BilingualQuestion(
            id = 50889, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus célèbre tableau de Van Gogh?", listOf("La Nuit Étoilée", "Tournesols", "La Chambre", "L'Église d'Auvers"), "Art", "Peinte en 1889 lors de son séjour à l'asile de Saint-Rémy-de-Provence, cette œuvre est devenue iconique pour son ciel tourbillonnant et son usage expressif de la couleur."),
            en = LocalizedContent("What is the most famous painting by Van Gogh?", listOf("The Starry Night", "Sunflowers", "The Bedroom", "The Church at Auvers"), "Arts", "Painted in 1889 during his stay at the asylum in Saint-Rémy-de-Provence, this work has become iconic for its swirling sky and expressive use of color."),
            zh = LocalizedContent("梵高最著名的画作是什么？", listOf("星月夜", "向日葵", "卧室", "奥维尔教堂"), "艺术", "这幅画绘于1889年，当时他住在圣雷米普罗旺斯的精神病院，以其旋转的天空和富有表现力的色彩运用而成为标志性作品。"),
            es = LocalizedContent("¿Cuál es el cuadro más famoso de Van Gogh?", listOf("La Noche Estrellada", "Los Girasoles", "La Habitación", "La Iglesia de Auvers"), "Artes", "Pintado en 1889 durante su estancia en el asilo de Saint-Rémy-de-Provence, esta obra se ha vuelto icónica por su cielo arremolinado y su uso expresivo del color.")
        ),
        BilingualQuestion(
            id = 50890, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus célèbre tableau de Picasso?", listOf("Les Demoiselles d'Avignon", "Guernica", "La Persistance de la Mémoire", "Le Cri"), "Art", "Guernica, peint en 1937, dénonce le bombardement de la ville basque du même nom pendant la guerre d'Espagne. Cette œuvre monumentale est devenue un symbole universel de l'horreur de la guerre."),
            en = LocalizedContent("What is Picasso's most famous painting?", listOf("Les Demoiselles d'Avignon", "Guernica", "The Persistence of Memory", "The Scream"), "Arts", "Guernica, painted in 1937, denounces the bombing of the Basque town of the same name during the Spanish Civil War. This monumental work has become a universal symbol of the horror of war."),
            zh = LocalizedContent("毕加索最著名的画作是什么？", listOf("亚维农的少女", "格尔尼卡", "记忆的永恒", "呐喊"), "艺术", "《格尔尼卡》创作于1937年，谴责了西班牙内战期间对巴斯克小镇格尔尼卡的轰炸。这幅巨作已成为战争恐怖的普遍象征。"),
            es = LocalizedContent("¿Cuál es el cuadro más famoso de Picasso?", listOf("Las señoritas de Avignon", "Guernica", "La persistencia de la memoria", "El grito"), "Artes", "Guernica, pintado en 1937, denuncia el bombardeo de la ciudad vasca del mismo nombre durante la Guerra Civil Española. Esta obra monumental se ha convertido en un símbolo universal del horror de la guerra.")
        ),
        BilingualQuestion(
            id = 50891, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus célèbre tableau de Dalí?", listOf("Les Demoiselles d'Avignon", "La Persistance de la Mémoire", "Guernica", "Le Cri"), "Art", "Peint en 1931, ce tableau est mondialement connu pour ses montres molles qui symbolisent la relativité du temps et la théorie de la relativité d'Einstein."),
            en = LocalizedContent("What is Dalí's most famous painting?", listOf("Les Demoiselles d'Avignon", "The Persistence of Memory", "Guernica", "The Scream"), "Arts", "Painted in 1931, this painting is world-famous for its melting clocks that symbolize the relativity of time and Einstein's theory of relativity."),
            zh = LocalizedContent("达利最著名的画作是什么？", listOf("亚维农的少女", "记忆的永恒", "格尔尼卡", "呐喊"), "艺术", "这幅画创作于1931年，以其融化的钟表闻名于世，象征着时间的相对性和爱因斯坦的相对论。"),
            es = LocalizedContent("¿Cuál es el cuadro más famoso de Dalí?", listOf("Las señoritas de Avignon", "La persistencia de la memoria", "Guernica", "El grito"), "Artes", "Pintado en 1931, este cuadro es mundialmente famoso por sus relojes blandos que simbolizan la relatividad del tiempo y la teoría de la relatividad de Einstein.")
        ),
        BilingualQuestion(
            id = 50892, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus célèbre tableau de Matisse?", listOf("La Danse", "La Joie de Vivre", "Les Demoiselles d'Avignon", "Guernica"), "Art", "La Danse est une œuvre majeure de Matisse, commandée en 1909 pour le collectionneur russe Chtchoukine, et elle incarne son style fauve par ses couleurs vives et ses formes simplifiées."),
            en = LocalizedContent("What is Matisse's most famous painting?", listOf("The Dance", "The Joy of Life", "Les Demoiselles d'Avignon", "Guernica"), "Arts", "The Dance is a major work by Matisse, commissioned in 1909 for the Russian collector Shchukin, and it embodies his Fauvist style with its bright colors and simplified forms."),
            zh = LocalizedContent("马蒂斯最著名的画作是什么？", listOf("舞蹈", "生活的欢乐", "亚维农的少女", "格尔尼卡"), "艺术", "《舞蹈》是马蒂斯的重要作品，1909年受俄罗斯收藏家史楚金委托创作，以其鲜艳的色彩和简化的形式体现了他的野兽派风格。"),
            es = LocalizedContent("¿Cuál es el cuadro más famoso de Matisse?", listOf("La danza", "La alegría de vivir", "Las señoritas de Avignon", "Guernica"), "Artes", "La danza es una obra importante de Matisse, encargada en 1909 para el coleccionista ruso Shchukin, y encarna su estilo fauvista con sus colores vivos y formas simplificadas.")
        ),
        BilingualQuestion(
            id = 50893, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus célèbre tableau de Munch?", listOf("Le Cri", "La Fille Malade", "Le Baiser", "Angoisse"), "Art", "Le Cri, peint en 1893, est l'œuvre la plus emblématique d'Edvard Munch, symbolisant l'angoisse existentielle et devenant une icône de l'art moderne."),
            en = LocalizedContent("What is Munch's most famous painting?", listOf("The Scream", "The Sick Child", "The Kiss", "Anxiety"), "Arts", "The Scream, painted in 1893, is Edvard Munch's most iconic work, symbolizing existential angst and becoming an icon of modern art."),
            zh = LocalizedContent("蒙克最著名的画作是什么？", listOf("呐喊", "病孩", "吻", "焦虑"), "艺术", "《呐喊》创作于1893年，是爱德华·蒙克最具代表性的作品，象征着存在主义的焦虑，并成为现代艺术的标志。"),
            es = LocalizedContent("¿Cuál es el cuadro más famoso de Munch?", listOf("El grito", "La niña enferma", "El beso", "Angustia"), "Artes", "El grito, pintado en 1893, es la obra más emblemática de Edvard Munch, simbolizando la angustia existencial y convirtiéndose en un icono del arte moderno.")
        ),
        BilingualQuestion(
            id = 50894, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus célèbre tableau de Klimt?", listOf("Le Baiser", "Portrait d'Adèle Bloch-Bauer", "Les Trois Âges", "Danaé"), "Art", "Le Baiser, peint entre 1907 et 1908, est l'œuvre la plus emblématique de Gustav Klimt, représentant un couple enlacé dans des ornements dorés typiques de sa période dorée."),
            en = LocalizedContent("What is Klimt's most famous painting?", listOf("The Kiss", "Portrait of Adele Bloch-Bauer", "The Three Ages", "Danaë"), "Arts", "The Kiss, painted between 1907 and 1908, is Gustav Klimt's most iconic work, depicting an embracing couple in the golden ornaments typical of his Golden Period."),
            zh = LocalizedContent("克里姆特最著名的画作是什么？", listOf("吻", "阿黛尔·布洛赫-鲍尔肖像", "三个年龄段", "达娜厄"), "艺术", "《吻》创作于1907年至1908年间，是古斯塔夫·克里姆特最具代表性的作品，描绘了一对拥抱的情侣，装饰着其金色时期典型的金色图案。"),
            es = LocalizedContent("¿Cuál es el cuadro más famoso de Klimt?", listOf("El beso", "Retrato de Adele Bloch-Bauer", "Las tres edades", "Dánae"), "Artes", "El beso, pintado entre 1907 y 1908, es la obra más emblemática de Gustav Klimt, que representa a una pareja abrazada con los ornamentos dorados típicos de su período dorado.")
        ),
        BilingualQuestion(
            id = 50895, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus célèbre tableau de Pollock?", listOf("Abstraction Number 1", "No. 5, 1948", "Convergence", "Number 8"), "Art", "Le tableau No. 5, 1948 est une œuvre emblématique du dripping de Jackson Pollock, vendue en 2006 pour 140 millions de dollars, ce qui en fait l'une des toiles les plus chères au monde."),
            en = LocalizedContent("What is Pollock's most famous painting?", listOf("Abstraction Number 1", "No. 5, 1948", "Convergence", "Number 8"), "Arts", "No. 5, 1948 is an iconic drip painting by Jackson Pollock, sold in 2006 for $140 million, making it one of the most expensive paintings in the world."),
            zh = LocalizedContent("波洛克最著名的画作是什么？", listOf("抽象一号", "第5号，1948", "汇聚", "第8号"), "艺术", "《第5号，1948》是杰克逊·波洛克滴画法的标志性作品，2006年以1.4亿美元售出，成为世界上最昂贵的画作之一。"),
            es = LocalizedContent("¿Cuál es el cuadro más famoso de Pollock?", listOf("Abstracción número 1", "No. 5, 1948", "Convergencia", "Número 8"), "Artes", "No. 5, 1948 es una obra emblemática del dripping de Jackson Pollock, vendida en 2006 por 140 millones de dólares, lo que la convierte en una de las pinturas más caras del mundo.")
        ),
        BilingualQuestion(
            id = 50896, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus célèbre tableau de Mondrian?", listOf("Composition II en Rouge Bleu et Jaune", "Composition avec Jaune et Bleu", "Broadway Boogie Woogie", "Composition 1921"), "Art", "Broadway Boogie Woogie est l'œuvre la plus célèbre de Piet Mondrian, peinte en 1942-1943, car elle synthétise son style néoplastique avec une évocation dynamique de New York."),
            en = LocalizedContent("What is Mondrian's most famous painting?", listOf("Composition II in Red Blue and Yellow", "Composition with Yellow and Blue", "Broadway Boogie Woogie", "Composition 1921"), "Arts", "Broadway Boogie Woogie is Piet Mondrian's most famous work, painted in 1942-1943, as it synthesizes his Neoplastic style with a dynamic evocation of New York."),
            zh = LocalizedContent("蒙德里安最著名的画作是什么？", listOf("红蓝黄构图II", "黄蓝构图", "百老汇布吉伍吉", "1921年构图"), "艺术", "《百老汇布吉伍吉》是皮特·蒙德里安最著名的作品，创作于1942-1943年，它综合了他的新造型主义风格和对纽约的动态描绘。"),
            es = LocalizedContent("¿Cuál es el cuadro más famoso de Mondrian?", listOf("Composición II en rojo azul y amarillo", "Composición con amarillo y azul", "Broadway Boogie Woogie", "Composición 1921"), "Artes", "Broadway Boogie Woogie es la obra más famosa de Piet Mondrian, pintada en 1942-1943, ya que sintetiza su estilo neoplástico con una evocación dinámica de Nueva York.")
        ),
        BilingualQuestion(
            id = 50897, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus célèbre tableau de Kandinsky?", listOf("Impression III", "Composition VIII", "Yellow-Red-Blue", "Black Lines"), "Art", "Composition VIII, peinte en 1923, est considérée comme une œuvre majeure de l'art abstrait, illustrant la théorie des formes et des couleurs développée par Kandinsky."),
            en = LocalizedContent("What is Kandinsky's most famous painting?", listOf("Impression III", "Composition VIII", "Yellow-Red-Blue", "Black Lines"), "Arts", "Composition VIII, painted in 1923, is considered a major work of abstract art, illustrating Kandinsky's theory of forms and colors."),
            zh = LocalizedContent("康定斯基最著名的画作是什么？", listOf("印象III", "构图VIII", "黄-红-蓝", "黑线"), "艺术", "《构图VIII》创作于1923年，被认为是抽象艺术的重要作品，体现了康定斯基关于形式和色彩的理论。"),
            es = LocalizedContent("¿Cuál es el cuadro más famoso de Kandinsky?", listOf("Impresión III", "Composición VIII", "Amarillo-rojo-azul", "Líneas negras"), "Artes", "Composición VIII, pintada en 1923, es considerada una obra importante del arte abstracto, que ilustra la teoría de las formas y los colores desarrollada por Kandinsky.")
        ),
        BilingualQuestion(
            id = 50898, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus célèbre tableau de Malevitch?", listOf("Carré Noir sur Fond Blanc", "Composition Suprématiste", "Carré Rouge", "Blanc sur Blanc"), "Art", "Malevitch, fondateur du suprématisme, a poussé l'abstraction à son extrême avec \"Blanc sur blanc\" (1918), un carré blanc sur fond blanc, symbole de la pureté absolue de l'art non figuratif."),
            en = LocalizedContent("What is Malevich's most famous painting?", listOf("Black Square on White Background", "Suprematist Composition", "Red Square", "White on White"), "Arts", "Malevich, founder of Suprematism, pushed abstraction to its extreme with \"White on White\" (1918), a white square on a white background, symbolizing the absolute purity of non-figurative art."),
            zh = LocalizedContent("马列维奇最著名的画作是什么？", listOf("白底上的黑方块", "至上主义构图", "红方块", "白上白"), "艺术", "马列维奇，至上主义的创始人，以《白上白》（1918年）将抽象推向了极致，一个白底上的白方块，象征着非具象艺术的绝对纯粹。"),
            es = LocalizedContent("¿Cuál es el cuadro más famoso de Malevich?", listOf("Cuadrado negro sobre fondo blanco", "Composición suprematista", "Cuadrado rojo", "Blanco sobre blanco"), "Artes", "Malevich, fundador del suprematismo, llevó la abstracción al extremo con \"Blanco sobre blanco\" (1918), un cuadrado blanco sobre fondo blanco, símbolo de la pureza absoluta del arte no figurativo.")
        ),
        BilingualQuestion(
            id = 50899, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus célèbre tableau de Miró?", listOf("La Naissance du Monde", "Bleu II", "Le Carnaval d'Arlequin", "Nuit"), "Art", "La Naissance du Monde est considérée comme l'œuvre la plus célèbre de Joan Miró, peinte en 1925, car elle marque un tournant vers son style surréaliste abstrait et onirique."),
            en = LocalizedContent("What is Miró's most famous painting?", listOf("The Birth of the World", "Blue II", "The Harlequin's Carnival", "Night"), "Arts", "The Birth of the World is considered Joan Miró's most famous work, painted in 1925, as it marks a turning point towards his abstract and dreamlike surrealist style."),
            zh = LocalizedContent("米罗最著名的画作是什么？", listOf("世界的诞生", "蓝色二号", "小丑的狂欢", "夜"), "艺术", "《世界的诞生》被认为是胡安·米罗最著名的作品，创作于1925年，它标志着他转向抽象和梦幻般的超现实主义风格。"),
            es = LocalizedContent("¿Cuál es el cuadro más famoso de Miró?", listOf("El nacimiento del mundo", "Azul II", "El carnaval del arlequín", "Noche"), "Artes", "El nacimiento del mundo es considerada la obra más famosa de Joan Miró, pintada en 1925, ya que marca un punto de inflexión hacia su estilo surrealista abstracto y onírico.")
        ),
        BilingualQuestion(
            id = 50900, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus célèbre tableau de Magritte?", listOf("La Persistance de la Mémoire", "Le Fils de L'Homme", "La Trahison des Images", "Le Ciel et la Fenêtre"), "Art", "Le Fils de l'Homme est l'autoportrait le plus connu de René Magritte, représentant un homme au chapeau melon dont le visage est caché par une pomme verte."),
            en = LocalizedContent("What is Magritte's most famous painting?", listOf("The Persistence of Memory", "The Son of Man", "The Treachery of Images", "The Sky and the Window"), "Arts", "The Son of Man is René Magritte's best-known self-portrait, depicting a man in a bowler hat whose face is hidden by a green apple."),
            zh = LocalizedContent("马格利特最著名的画作是什么？", listOf("记忆的永恒", "人类之子", "形象的叛逆", "天空与窗户"), "艺术", "《人类之子》是雷内·马格利特最著名的自画像，描绘了一个戴圆顶礼帽、脸被青苹果遮住的男人。"),
            es = LocalizedContent("¿Cuál es el cuadro más famoso de Magritte?", listOf("La persistencia de la memoria", "El hijo del hombre", "La traición de las imágenes", "El cielo y la ventana"), "Artes", "El hijo del hombre es el autorretrato más conocido de René Magritte, que representa a un hombre con sombrero de hongo cuyo rostro está oculto por una manzana verde.")
        ),
        BilingualQuestion(
            id = 50901, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le musée le plus célèbre du monde?", listOf("Louvre", "Vatican", "Uffizi", "MoMA"), "Art", "Le Louvre à Paris est le musée le plus visité au monde, abritant des chefs-d'œuvre comme la Joconde et la Vénus de Milo."),
            en = LocalizedContent("What is the most famous museum in the world?", listOf("Louvre", "Vatican", "Uffizi", "MoMA"), "Arts", "The Louvre in Paris is the most visited museum in the world, housing masterpieces such as the Mona Lisa and the Venus de Milo."),
            zh = LocalizedContent("世界上最著名的博物馆是哪个？", listOf("卢浮宫", "梵蒂冈博物馆", "乌菲兹美术馆", "现代艺术博物馆"), "艺术", "巴黎卢浮宫是世界上参观人数最多的博物馆，收藏了《蒙娜丽莎》和《米洛的维纳斯》等杰作。"),
            es = LocalizedContent("¿Cuál es el museo más famoso del mundo?", listOf("Louvre", "Vaticano", "Uffizi", "MoMA"), "Artes", "El Louvre en París es el museo más visitado del mundo, albergando obras maestras como la Mona Lisa y la Venus de Milo.")
        ),
        BilingualQuestion(
            id = 50902, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien musée d'art du monde?", listOf("Musée Officiel de Florence", "Galerie des Offices", "Louvre", "Vatican"), "Art", "Le Louvre, ouvert en 1793 à Paris, est considéré comme le premier musée public d'art au monde, établi à partir des collections royales françaises."),
            en = LocalizedContent("What is the oldest art museum in the world?", listOf("Official Museum of Florence", "Uffizi Gallery", "Louvre", "Vatican"), "Arts", "The Louvre, opened in 1793 in Paris, is considered the first public art museum in the world, established from the French royal collections."),
            zh = LocalizedContent("世界上最古老的艺术博物馆是哪个？", listOf("佛罗伦萨官方博物馆", "乌菲兹美术馆", "卢浮宫", "梵蒂冈博物馆"), "艺术", "卢浮宫于1793年在巴黎开放，被认为是世界上第一个公共艺术博物馆，由法国皇家收藏品建立。"),
            es = LocalizedContent("¿Cuál es el museo de arte más antiguo del mundo?", listOf("Museo Oficial de Florencia", "Galería Uffizi", "Louvre", "Vaticano"), "Artes", "El Louvre, inaugurado en 1793 en París, es considerado el primer museo de arte público del mundo, establecido a partir de las colecciones reales francesas.")
        ),
        BilingualQuestion(
            id = 50904, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le musée d'art moderne le plus célèbre du monde?", listOf("Louvre", "Vatican", "MoMA", "Guggenheim"), "Art", "Le Museum of Modern Art de New York, fondé en 1929, est considéré comme le musée d'art moderne le plus influent au monde, abritant des chefs-d'œuvre comme Les Demoiselles d'Avignon de Picasso."),
            en = LocalizedContent("What is the most famous modern art museum in the world?", listOf("Louvre", "Vatican", "MoMA", "Guggenheim"), "Arts", "The Museum of Modern Art in New York, founded in 1929, is considered the most influential modern art museum in the world, housing masterpieces like Picasso's Les Demoiselles d'Avignon."),
            zh = LocalizedContent("世界上最著名的现代艺术博物馆是哪个？", listOf("卢浮宫", "梵蒂冈博物馆", "现代艺术博物馆", "古根海姆博物馆"), "艺术", "纽约现代艺术博物馆成立于1929年，被认为是世界上最具影响力的现代艺术博物馆，收藏了毕加索的《亚威农少女》等杰作。"),
            es = LocalizedContent("¿Cuál es el museo de arte moderno más famoso del mundo?", listOf("Louvre", "Vaticano", "MoMA", "Guggenheim"), "Artes", "El Museo de Arte Moderno de Nueva York, fundado en 1929, es considerado el museo de arte moderno más influyente del mundo, albergando obras maestras como Las señoritas de Avignon de Picasso.")
        ),
        BilingualQuestion(
            id = 50905, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien château-musée du monde?", listOf("Versailles", "Château du Louvre", "Palazzo Pitti", "Château de Fontainebleau"), "Art", "Le château du Louvre, forteresse médiévale devenue résidence royale, a été transformé en musée en 1793, ce qui en fait le plus ancien musée public du monde."),
            en = LocalizedContent("What is the oldest castle-museum in the world?", listOf("Versailles", "Louvre Castle", "Palazzo Pitti", "Château de Fontainebleau"), "Arts", "The Louvre Castle, a medieval fortress turned royal residence, was transformed into a museum in 1793, making it the oldest public museum in the world."),
            zh = LocalizedContent("世界上最古老的城堡博物馆是哪个？", listOf("凡尔赛宫", "卢浮宫城堡", "皮蒂宫", "枫丹白露宫"), "艺术", "卢浮宫城堡原为中世纪堡垒，后成为皇家住所，于1793年改建为博物馆，使其成为世界上最古老的公共博物馆。"),
            es = LocalizedContent("¿Cuál es el castillo-museo más antiguo del mundo?", listOf("Versalles", "Castillo del Louvre", "Palacio Pitti", "Castillo de Fontainebleau"), "Artes", "El castillo del Louvre, una fortaleza medieval convertida en residencia real, fue transformado en museo en 1793, lo que lo convierte en el museo público más antiguo del mundo.")
        ),
        BilingualQuestion(
            id = 50906, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand château-musée du monde?", listOf("Versailles", "Château du Louvre", "Palazzo Pitti", "Hermitage"), "Art", "Le château de Versailles est le plus grand château-musée du monde, avec une superficie de 63 154 m² et plus de 60 000 œuvres d'art."),
            en = LocalizedContent("What is the largest castle-museum in the world?", listOf("Versailles", "Louvre Castle", "Palazzo Pitti", "Hermitage"), "Arts", "The Palace of Versailles is the largest castle-museum in the world, with an area of 63,154 m² and over 60,000 works of art."),
            zh = LocalizedContent("世界上最大的城堡博物馆是哪个？", listOf("凡尔赛宫", "卢浮宫城堡", "皮蒂宫", "冬宫"), "艺术", "凡尔赛宫是世界上最大的城堡博物馆，面积达63,154平方米，收藏了超过60,000件艺术品。"),
            es = LocalizedContent("¿Cuál es el castillo-museo más grande del mundo?", listOf("Versalles", "Castillo del Louvre", "Palacio Pitti", "Hermitage"), "Artes", "El Palacio de Versalles es el castillo-museo más grande del mundo, con una superficie de 63.154 m² y más de 60.000 obras de arte.")
        ),
        BilingualQuestion(
            id = 50907, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien art rupestre connu?", listOf("Grotte de Chauvet", "Grotte d'Altamira", "Grotte de Lascaux", "Grotte du Pech-Merle"), "Art", "Datée d'environ 36 000 ans, la grotte Chauvet, en Ardèche, contient les plus anciennes peintures rupestres figuratives connues à ce jour."),
            en = LocalizedContent("What is the oldest known cave art?", listOf("Chauvet Cave", "Altamira Cave", "Lascaux Cave", "Pech Merle Cave"), "Arts", "Dated to about 36,000 years ago, the Chauvet Cave in Ardèche contains the oldest known figurative cave paintings."),
            zh = LocalizedContent("已知最古老的洞穴艺术是什么？", listOf("肖维岩洞", "阿尔塔米拉洞", "拉斯科洞窟", "佩什梅尔洞"), "艺术", "阿尔代什省的肖维岩洞可追溯至约36,000年前，包含已知最古老的具象洞穴绘画。"),
            es = LocalizedContent("¿Cuál es el arte rupestre más antiguo conocido?", listOf("Cueva de Chauvet", "Cueva de Altamira", "Cueva de Lascaux", "Cueva de Pech Merle"), "Artes", "Datada de hace unos 36.000 años, la cueva de Chauvet, en Ardèche, contiene las pinturas rupestres figurativas más antiguas conocidas.")
        ),
        BilingualQuestion(
            id = 50908, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien temple connu?", listOf("Temple de Jéricho", "Temple du Karnak", "Temple de Karnak", "Temple de Göbekli Tepe"), "Art", "Le temple de Göbekli Tepe, situé dans l'actuelle Turquie, date d'environ 9600 avant notre ère, soit plus de 6000 ans avant Stonehenge. Il est considéré comme le plus ancien lieu de culte monumental découvert à ce jour."),
            en = LocalizedContent("What is the oldest known temple?", listOf("Temple of Jericho", "Temple of Karnak", "Temple of Karnak", "Göbekli Tepe"), "Arts", "The temple of Göbekli Tepe, located in modern-day Turkey, dates to around 9600 BCE, more than 6000 years before Stonehenge. It is considered the oldest known monumental place of worship."),
            zh = LocalizedContent("已知最古老的寺庙是什么？", listOf("杰里科神庙", "卡纳克神庙", "卡纳克神庙", "哥贝克力石阵"), "艺术", "位于今土耳其的哥贝克力石阵可追溯至约公元前9600年，比巨石阵早6000多年，被认为是已知最古老的纪念性礼拜场所。"),
            es = LocalizedContent("¿Cuál es el templo más antiguo conocido?", listOf("Templo de Jericó", "Templo de Karnak", "Templo de Karnak", "Göbekli Tepe"), "Artes", "El templo de Göbekli Tepe, ubicado en la actual Turquía, data de alrededor del 9600 a.C., más de 6000 años antes que Stonehenge. Se considera el lugar de culto monumental más antiguo conocido.")
        ),
        BilingualQuestion(
            id = 50909, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien amphithéâtre connu?", listOf("Colosseum", "Théâtre de Demetrius", "Théâtre de Pompée", "Amphithéâtre d'Orange"), "Art", "Le Théâtre de Demetrius, situé à Délos en Grèce, date du IVe siècle av. J.-C., ce qui en fait le plus ancien amphithéâtre connu."),
            en = LocalizedContent("What is the oldest known amphitheater?", listOf("Colosseum", "Theatre of Demetrius", "Theatre of Pompey", "Orange Amphitheatre"), "Arts", "The Theatre of Demetrius, located on Delos in Greece, dates from the 4th century BC, making it the oldest known amphitheater."),
            zh = LocalizedContent("已知最古老的圆形剧场是什么？", listOf("罗马斗兽场", "德米特里乌斯剧场", "庞培剧场", "奥朗日古罗马剧场"), "艺术", "位于希腊提洛岛的德米特里乌斯剧场可追溯至公元前4世纪，是已知最古老的圆形剧场。"),
            es = LocalizedContent("¿Cuál es el anfiteatro más antiguo conocido?", listOf("Coliseo", "Teatro de Demetrio", "Teatro de Pompeyo", "Anfiteatro de Orange"), "Artes", "El Teatro de Demetrio, ubicado en Delos, Grecia, data del siglo IV a.C., lo que lo convierte en el anfiteatro más antiguo conocido.")
        ),
        BilingualQuestion(
            id = 50910, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus haut obélisque du monde?", listOf("Obélisque de Louxor", "Obélisque de Washington", "Obélisque de New York", "Obélisque du Caire"), "Art", "L'obélisque de Louxor, situé sur la place de la Concorde à Paris, mesure 23 mètres de haut et est le plus grand obélisque monolithe jamais transporté depuis l'Égypte antique."),
            en = LocalizedContent("What is the tallest obelisk in the world?", listOf("Luxor Obelisk", "Washington Monument", "New York Obelisk", "Cairo Obelisk"), "Arts", "The Luxor Obelisk, located on the Place de la Concorde in Paris, is 23 meters tall and is the largest monolith obelisk ever transported from ancient Egypt."),
            zh = LocalizedContent("世界上最高的方尖碑是什么？", listOf("卢克索方尖碑", "华盛顿纪念碑", "纽约方尖碑", "开罗方尖碑"), "艺术", "位于巴黎协和广场的卢克索方尖碑高23米，是从古埃及运来的最大的单体方尖碑。"),
            es = LocalizedContent("¿Cuál es el obelisco más alto del mundo?", listOf("Obelisco de Luxor", "Monumento a Washington", "Obelisco de Nueva York", "Obelisco de El Cairo"), "Artes", "El Obelisco de Luxor, ubicado en la Plaza de la Concordia en París, mide 23 metros de altura y es el obelisco monolítico más grande jamás transportado desde el antiguo Egipto.")
        ),
        BilingualQuestion(
            id = 50911, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand palais du monde?", listOf("Palais de Versailles", "Palais du Kremlin", "Palais de Potala", "Palais d'Alhamabra"), "Art", "Le Palais de Potala, situé à Lhassa au Tibet, est considéré comme le plus grand palais du monde avec ses 400 000 mètres carrés."),
            en = LocalizedContent("What is the largest palace in the world?", listOf("Palace of Versailles", "Kremlin Palace", "Potala Palace", "Alhambra Palace"), "Arts", "The Potala Palace, located in Lhasa, Tibet, is considered the largest palace in the world with its 400,000 square meters."),
            zh = LocalizedContent("世界上最大的宫殿是什么？", listOf("凡尔赛宫", "克里姆林宫", "布达拉宫", "阿尔罕布拉宫"), "艺术", "布达拉宫位于西藏拉萨，占地40万平方米，被认为是世界上最大的宫殿。"),
            es = LocalizedContent("¿Cuál es el palacio más grande del mundo?", listOf("Palacio de Versalles", "Palacio del Kremlin", "Palacio de Potala", "Palacio de la Alhambra"), "Artes", "El Palacio de Potala, ubicado en Lhasa, Tíbet, es considerado el palacio más grande del mundo con sus 400,000 metros cuadrados.")
        ),
        BilingualQuestion(
            id = 50912, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand temple du monde?", listOf("Angkor Vat", "Temple de Karnak", "Temple du Taj Mahal", "Temple de Borobudur"), "Art", "Angkor Vat, au Cambodge, est considéré comme le plus grand temple du monde en termes de superficie, s'étendant sur plus de 162 hectares."),
            en = LocalizedContent("What is the largest temple in the world?", listOf("Angkor Wat", "Karnak Temple", "Taj Mahal Temple", "Borobudur Temple"), "Arts", "Angkor Wat, in Cambodia, is considered the largest temple in the world in terms of area, covering more than 162 hectares."),
            zh = LocalizedContent("世界上最大的寺庙是什么？", listOf("吴哥窟", "卡纳克神庙", "泰姬陵", "婆罗浮屠"), "艺术", "柬埔寨的吴哥窟占地面积超过162公顷，被认为是世界上最大的寺庙。"),
            es = LocalizedContent("¿Cuál es el templo más grande del mundo?", listOf("Angkor Wat", "Templo de Karnak", "Templo del Taj Mahal", "Templo de Borobudur"), "Artes", "Angkor Wat, en Camboya, es considerado el templo más grande del mundo en términos de superficie, con más de 162 hectáreas.")
        ),
        BilingualQuestion(
            id = 50913, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand fresco du monde?", listOf("Fresque Systine", "Fresque de la Création d'Adam", "Fresque de Michelangelo", "Fresque de Raphaël"), "Art", "La fresque du plafond de la chapelle Sixtine, peinte par Michel-Ange entre 1508 et 1512, est considérée comme la plus grande fresque du monde, couvrant plus de 500 mètres carrés."),
            en = LocalizedContent("What is the largest fresco in the world?", listOf("Sistine Chapel ceiling", "Creation of Adam", "Michelangelo's fresco", "Raphael's fresco"), "Arts", "The ceiling fresco of the Sistine Chapel, painted by Michelangelo between 1508 and 1512, is considered the largest fresco in the world, covering over 500 square meters."),
            zh = LocalizedContent("世界上最大的壁画是什么？", listOf("西斯廷教堂天顶画", "创造亚当", "米开朗基罗的壁画", "拉斐尔的壁画"), "艺术", "米开朗基罗于1508年至1512年间绘制的西斯廷教堂天顶画，覆盖面积超过500平方米，被认为是世界上最大的壁画。"),
            es = LocalizedContent("¿Cuál es el fresco más grande del mundo?", listOf("Fresco de la Capilla Sixtina", "Fresco de la Creación de Adán", "Fresco de Miguel Ángel", "Fresco de Rafael"), "Artes", "El fresco del techo de la Capilla Sixtina, pintado por Miguel Ángel entre 1508 y 1512, es considerado el fresco más grande del mundo, cubriendo más de 500 metros cuadrados.")
        ),
        BilingualQuestion(
            id = 50914, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand vitrail du monde?", listOf("Vitrail de Chartres", "Vitrail de Notre-Dame", "Vitrail de Cologne", "Vitrail de Rouen"), "Art", "Le vitrail de la cathédrale de Cologne, en Allemagne, est considéré comme le plus grand du monde avec ses 1 200 mètres carrés de surface. Il a été installé en 2007 et conçu par l'artiste Gerhard Richter."),
            en = LocalizedContent("What is the largest stained glass window in the world?", listOf("Chartres stained glass", "Notre-Dame stained glass", "Cologne stained glass", "Rouen stained glass"), "Arts", "The stained glass window of Cologne Cathedral in Germany is considered the largest in the world with its 1,200 square meters of surface. It was installed in 2007 and designed by artist Gerhard Richter."),
            zh = LocalizedContent("世界上最大的彩色玻璃窗是什么？", listOf("沙特尔大教堂彩窗", "巴黎圣母院彩窗", "科隆大教堂彩窗", "鲁昂大教堂彩窗"), "艺术", "德国科隆大教堂的彩色玻璃窗面积达1200平方米，被认为是世界上最大的彩窗。它于2007年安装，由艺术家格哈德·里希特设计。"),
            es = LocalizedContent("¿Cuál es la vidriera más grande del mundo?", listOf("Vidriera de Chartres", "Vidriera de Notre-Dame", "Vidriera de Colonia", "Vidriera de Ruan"), "Artes", "La vidriera de la catedral de Colonia, en Alemania, es considerada la más grande del mundo con sus 1,200 metros cuadrados de superficie. Fue instalada en 2007 y diseñada por el artista Gerhard Richter.")
        ),
        BilingualQuestion(
            id = 50915, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien type d'architecture connu?", listOf("L'architecture grecque", "L'architecture égyptienne", "L'architecture mégalithique", "L'architecture romaine"), "Art", "L'architecture mégalithique, apparue au Néolithique, est la plus ancienne forme d'architecture connue, avec des structures comme les dolmens et menhirs datant de plusieurs millénaires avant notre ère."),
            en = LocalizedContent("What is the oldest known type of architecture?", listOf("Greek architecture", "Egyptian architecture", "Megalithic architecture", "Roman architecture"), "Arts", "Megalithic architecture, which appeared in the Neolithic period, is the oldest known form of architecture, with structures like dolmens and menhirs dating back several millennia BCE."),
            zh = LocalizedContent("已知最古老的建筑类型是什么？", listOf("希腊建筑", "埃及建筑", "巨石建筑", "罗马建筑"), "艺术", "巨石建筑出现于新石器时代，是已知最古老的建筑形式，其结构如石棚和竖石纪念碑可追溯到公元前数千年。"),
            es = LocalizedContent("¿Cuál es el tipo de arquitectura más antiguo conocido?", listOf("Arquitectura griega", "Arquitectura egipcia", "Arquitectura megalítica", "Arquitectura romana"), "Artes", "La arquitectura megalítica, que apareció en el Neolítico, es la forma de arquitectura más antigua conocida, con estructuras como dólmenes y menhires que datan de varios milenios antes de nuestra era.")
        ),
        BilingualQuestion(
            id = 50916, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien style architectural?", listOf("Corinthien", "Dorique", "Ionique", "Toscan"), "Art", "Le style dorique est le plus ancien des trois ordres architecturaux grecs classiques, apparu vers le VIIe siècle avant J.-C. Il se caractérise par des colonnes robustes et sans base."),
            en = LocalizedContent("What is the oldest architectural style?", listOf("Corinthian", "Doric", "Ionic", "Tuscan"), "Arts", "The Doric style is the oldest of the three classical Greek architectural orders, appearing around the 7th century BCE. It is characterized by sturdy columns without bases."),
            zh = LocalizedContent("最古老的建筑风格是什么？", listOf("科林斯式", "多立克式", "爱奥尼亚式", "托斯卡纳式"), "艺术", "多立克式是三种古典希腊建筑柱式中最古老的，出现于公元前7世纪左右，其特点是粗壮的柱子和无柱础。"),
            es = LocalizedContent("¿Cuál es el estilo arquitectónico más antiguo?", listOf("Corintio", "Dórico", "Jónico", "Toscano"), "Artes", "El estilo dórico es el más antiguo de los tres órdenes arquitectónicos clásicos griegos, aparecido hacia el siglo VII a.C. Se caracteriza por columnas robustas y sin basa.")
        ),
        BilingualQuestion(
            id = 50917, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand dôme du monde?", listOf("Dôme du Panthéon", "Dôme de la Cathédrale de Florence", "Dôme de Saint-Pierre", "Dôme du Taj Mahal"), "Art", "Construit par Brunelleschi au XVe siècle, le dôme de la cathédrale de Florence est le plus grand dôme en maçonnerie jamais construit, avec un diamètre de 45,5 mètres."),
            en = LocalizedContent("What is the largest dome in the world?", listOf("Pantheon dome", "Florence Cathedral dome", "St. Peter's dome", "Taj Mahal dome"), "Arts", "Built by Brunelleschi in the 15th century, the dome of Florence Cathedral is the largest masonry dome ever constructed, with a diameter of 45.5 meters."),
            zh = LocalizedContent("世界上最大的穹顶是什么？", listOf("万神殿穹顶", "佛罗伦萨大教堂穹顶", "圣彼得大教堂穹顶", "泰姬陵穹顶"), "艺术", "由布鲁内莱斯基在15世纪建造的佛罗伦萨大教堂穹顶，直径45.5米，是历史上最大的砖石穹顶。"),
            es = LocalizedContent("¿Cuál es la cúpula más grande del mundo?", listOf("Cúpula del Panteón", "Cúpula de la Catedral de Florencia", "Cúpula de San Pedro", "Cúpula del Taj Mahal"), "Artes", "Construida por Brunelleschi en el siglo XV, la cúpula de la catedral de Florencia es la cúpula de mampostería más grande jamás construida, con un diámetro de 45,5 metros.")
        ),
        BilingualQuestion(
            id = 50918, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand arc du monde?", listOf("Arc de Triomphe", "Arc de Titus", "Pont de Brooklyn", "Pont du Golden Gate"), "Art", "Le Pont de Brooklyn est souvent considéré comme le plus grand arc du monde en raison de sa portée de 486 mètres lors de son achèvement en 1883, un record pour l'époque."),
            en = LocalizedContent("What is the largest arch in the world?", listOf("Arc de Triomphe", "Arch of Titus", "Brooklyn Bridge", "Golden Gate Bridge"), "Arts", "The Brooklyn Bridge is often considered the largest arch in the world due to its span of 486 meters upon completion in 1883, a record at the time."),
            zh = LocalizedContent("世界上最大的拱门是什么？", listOf("凯旋门", "提图斯凯旋门", "布鲁克林大桥", "金门大桥"), "艺术", "布鲁克林大桥在1883年竣工时跨度达486米，创下当时纪录，常被认为是世界上最大的拱门。"),
            es = LocalizedContent("¿Cuál es el arco más grande del mundo?", listOf("Arco de Triunfo", "Arco de Tito", "Puente de Brooklyn", "Puente Golden Gate"), "Artes", "El Puente de Brooklyn es a menudo considerado el arco más grande del mundo debido a su luz de 486 metros al completarse en 1883, un récord en ese momento.")
        ),
        BilingualQuestion(
            id = 50919, correctIndex = 3, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est l'art le plus ancien de la civilisation?", listOf("Peinture", "Sculpture", "Danse", "Musique"), "Art", "Des peintures rupestres vieilles de 40 000 ans montrent des figures dansant, suggérant que la musique existait avant l'art visuel. Les premiers instruments, comme des flûtes en os, datent d'au moins 35 000 ans."),
            en = LocalizedContent("What is the oldest art of civilization?", listOf("Painting", "Sculpture", "Dance", "Music"), "Arts", "Cave paintings 40,000 years old show dancing figures, suggesting music existed before visual art. The earliest instruments, like bone flutes, date back at least 35,000 years."),
            zh = LocalizedContent("文明中最古老的艺术是什么？", listOf("绘画", "雕塑", "舞蹈", "音乐"), "艺术", "4万年前的洞穴壁画描绘了舞蹈人物，暗示音乐早于视觉艺术存在。最早的乐器如骨笛，至少可追溯到3.5万年前。"),
            es = LocalizedContent("¿Cuál es el arte más antiguo de la civilización?", listOf("Pintura", "Escultura", "Danza", "Música"), "Artes", "Pinturas rupestres de 40,000 años muestran figuras bailando, sugiriendo que la música existía antes que el arte visual. Los primeros instrumentos, como flautas de hueso, datan de al menos 35,000 años.")
        ),
        BilingualQuestion(
            id = 50920, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le prix le plus cher jamais payé pour une œuvre d'art?", listOf("Cent millions", "Trois cents millions", "Quatre cents millions", "Cinq cents millions"), "Art", "Le tableau Salvator Mundi, attribué à Léonard de Vinci, a été vendu pour 450 millions de dollars en 2017, soit environ 400 millions d'euros."),
            en = LocalizedContent("What is the highest price ever paid for a work of art?", listOf("One hundred million", "Three hundred million", "Four hundred million", "Five hundred million"), "Arts", "The painting Salvator Mundi, attributed to Leonardo da Vinci, was sold for $450 million in 2017, approximately 400 million euros."),
            zh = LocalizedContent("艺术品有史以来支付的最高价格是多少？", listOf("一亿", "三亿", "四亿", "五亿"), "艺术", "达芬奇画作《救世主》在2017年以4.5亿美元（约4亿欧元）成交，创下艺术品最高价格纪录。"),
            es = LocalizedContent("¿Cuál es el precio más alto jamás pagado por una obra de arte?", listOf("Cien millones", "Trescientos millones", "Cuatrocientos millones", "Quinientos millones"), "Artes", "La pintura Salvator Mundi, atribuida a Leonardo da Vinci, fue vendida por 450 millones de dólares en 2017, aproximadamente 400 millones de euros.")
        ),
        BilingualQuestion(
            id = 50921, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'artiste le plus prolifique de tous les temps?", listOf("Picasso", "Matisse", "Michelangelo", "Leonardo da Vinci"), "Art", "Picasso a produit plus de 50 000 œuvres, incluant peintures, dessins et sculptures, ce qui dépasse largement la production d'autres grands artistes comme Rembrandt ou Van Gogh."),
            en = LocalizedContent("Who is the most prolific artist of all time?", listOf("Picasso", "Matisse", "Michelangelo", "Leonardo da Vinci"), "Arts", "Picasso produced over 50,000 works, including paintings, drawings, and sculptures, far exceeding the output of other great artists like Rembrandt or Van Gogh."),
            zh = LocalizedContent("谁是有史以来最多产的艺术家？", listOf("毕加索", "马蒂斯", "米开朗基罗", "列奥纳多·达·芬奇"), "艺术", "毕加索创作了超过5万件作品，包括绘画、素描和雕塑，远远超过伦勃朗或梵高等其他伟大艺术家的产量。"),
            es = LocalizedContent("¿Quién es el artista más prolífico de todos los tiempos?", listOf("Picasso", "Matisse", "Miguel Ángel", "Leonardo da Vinci"), "Artes", "Picasso produjo más de 50,000 obras, incluyendo pinturas, dibujos y esculturas, superando ampliamente la producción de otros grandes artistas como Rembrandt o Van Gogh.")
        ),
        BilingualQuestion(
            id = 50922, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'artiste qui a vendu le plus de copies de ses œuvres?", listOf("Van Gogh", "Picasso", "Warhol", "Leonardo da Vinci"), "Art", "Andy Warhol a popularisé la sérigraphie, permettant de produire des multiples de ses œuvres comme les Campbell's Soup Cans, ce qui en fait l'artiste ayant vendu le plus de copies."),
            en = LocalizedContent("Which artist has sold the most copies of their works?", listOf("Van Gogh", "Picasso", "Warhol", "Leonardo da Vinci"), "Arts", "Andy Warhol popularized silkscreen printing, allowing him to produce multiples of his works like the Campbell's Soup Cans, making him the artist who sold the most copies."),
            zh = LocalizedContent("哪位艺术家卖出的作品复制品最多？", listOf("梵高", "毕加索", "沃霍尔", "列奥纳多·达·芬奇"), "艺术", "安迪·沃霍尔推广了丝网印刷，能够制作如金宝汤罐头等作品的多个复制品，这使他成为卖出最多复制品的艺术家。"),
            es = LocalizedContent("¿Qué artista ha vendido más copias de sus obras?", listOf("Van Gogh", "Picasso", "Warhol", "Leonardo da Vinci"), "Artes", "Andy Warhol popularizó la serigrafía, permitiéndole producir múltiples de sus obras como las Latas de Sopa Campbell, lo que lo convierte en el artista que más copias ha vendido.")
        ),
        BilingualQuestion(
            id = 50923, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le style de peinture le plus difficile?", listOf("Abstraction", "Réalisme", "Impressionnisme", "Surrealisme"), "Art", "Le réalisme exige une maîtrise technique poussée pour reproduire fidèlement les détails, les proportions et les jeux de lumière, ce qui le rend particulièrement exigeant pour les artistes."),
            en = LocalizedContent("What is the most difficult painting style?", listOf("Abstraction", "Realism", "Impressionism", "Surrealism"), "Arts", "Realism requires advanced technical mastery to faithfully reproduce details, proportions, and lighting, making it particularly demanding for artists."),
            zh = LocalizedContent("哪种绘画风格最难？", listOf("抽象派", "现实主义", "印象派", "超现实主义"), "艺术", "现实主义要求高超的技术掌握，以忠实再现细节、比例和光影，这对艺术家来说尤其具有挑战性。"),
            es = LocalizedContent("¿Cuál es el estilo de pintura más difícil?", listOf("Abstracción", "Realismo", "Impresionismo", "Surrealismo"), "Artes", "El realismo exige un dominio técnico avanzado para reproducir fielmente los detalles, las proporciones y los juegos de luz, lo que lo hace particularmente exigente para los artistas.")
        ),
        BilingualQuestion(
            id = 50924, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est l'art qui nécessite le plus de temps de réalisation?", listOf("Fresque", "Mosaïque", "Sculpture sur marbre", "Vitrail"), "Art", "La sculpture sur marbre est réputée pour sa lenteur d'exécution en raison de la dureté du matériau et de la précision nécessaire pour éviter les éclats."),
            en = LocalizedContent("Which art form requires the most time to complete?", listOf("Fresco", "Mosaic", "Marble sculpture", "Stained glass"), "Arts", "Marble sculpture is known for its slow execution due to the hardness of the material and the precision needed to avoid chipping."),
            zh = LocalizedContent("哪种艺术形式需要最长的制作时间？", listOf("壁画", "马赛克", "大理石雕塑", "彩色玻璃"), "艺术", "大理石雕塑因其材料坚硬且需要精确避免碎裂而闻名，制作过程缓慢。"),
            es = LocalizedContent("¿Qué arte requiere más tiempo de realización?", listOf("Fresco", "Mosaico", "Escultura en mármol", "Vitral"), "Artes", "La escultura en mármol es conocida por su lenta ejecución debido a la dureza del material y la precisión necesaria para evitar astillas.")
        ),
        BilingualQuestion(
            id = 50925, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le matériau le plus utilisé en sculpture?", listOf("Bronze", "Marbre", "Pierre", "Bois"), "Art", "Le marbre est privilégié en sculpture depuis l'Antiquité pour sa dureté, sa texture fine et sa capacité à être poli, permettant des détails précis et une luminosité naturelle."),
            en = LocalizedContent("What is the most used material in sculpture?", listOf("Bronze", "Marble", "Stone", "Wood"), "Arts", "Marble has been favored in sculpture since antiquity for its hardness, fine texture, and ability to be polished, allowing precise details and natural luminosity."),
            zh = LocalizedContent("雕塑中最常用的材料是什么？", listOf("青铜", "大理石", "石头", "木头"), "艺术", "大理石自古代以来就因其硬度、细腻的质地和可抛光性而受到雕塑家的青睐，能够实现精确的细节和自然的光泽。"),
            es = LocalizedContent("¿Cuál es el material más utilizado en escultura?", listOf("Bronce", "Mármol", "Piedra", "Madera"), "Artes", "El mármol ha sido favorecido en la escultura desde la antigüedad por su dureza, textura fina y capacidad de pulido, permitiendo detalles precisos y luminosidad natural.")
        ),
        BilingualQuestion(
            id = 51000, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Don Quichotte'?", listOf("Lope de Vega", "Miguel de Cervantes", "Calderón de la Barca", "García Lorca"), "Littérature", "Miguel de Cervantes a publié la première partie de Don Quichotte en 1605, une œuvre majeure de la littérature espagnole et mondiale."),
            en = LocalizedContent("Who is the author of 'Don Quixote'?", listOf("Lope de Vega", "Miguel de Cervantes", "Calderón de la Barca", "García Lorca"), "Literature", "Miguel de Cervantes published the first part of Don Quixote in 1605, a major work of Spanish and world literature."),
            zh = LocalizedContent("《堂吉诃德》的作者是谁？", listOf("洛佩·德·维加", "米格尔·德·塞万提斯", "卡尔德隆·德·拉·巴尔卡", "加西亚·洛尔卡"), "文学", "米格尔·德·塞万提斯于1605年出版了《堂吉诃德》的第一部分，这是西班牙文学和世界文学的重要作品。"),
            es = LocalizedContent("¿Quién es el autor de 'Don Quijote'?", listOf("Lope de Vega", "Miguel de Cervantes", "Calderón de la Barca", "García Lorca"), "Literatura", "Miguel de Cervantes publicó la primera parte del Quijote en 1605, una obra mayor de la literatura española y mundial.")
        ),
        BilingualQuestion(
            id = 51001, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Les Misérables'?", listOf("Alexandre Dumas", "Victor Hugo", "Émile Zola", "Gustave Flaubert"), "Littérature", "Victor Hugo a publié Les Misérables en 1862. Ce roman majeur du XIXe siècle dépeint la société française de l'époque à travers des personnages comme Jean Valjean."),
            en = LocalizedContent("Who is the author of 'Les Misérables'?", listOf("Alexandre Dumas", "Victor Hugo", "Émile Zola", "Gustave Flaubert"), "Literature", "Victor Hugo published Les Misérables in 1862. This major 19th-century novel depicts French society of the time through characters like Jean Valjean."),
            zh = LocalizedContent("《悲惨世界》的作者是谁？", listOf("亚历山大·仲马", "维克多·雨果", "埃米尔·左拉", "古斯塔夫·福楼拜"), "文学", "维克多·雨果于1862年出版了《悲惨世界》。这部19世纪的重要小说通过冉阿让等人物描绘了当时的法国社会。"),
            es = LocalizedContent("¿Quién es el autor de 'Los Miserables'?", listOf("Alexandre Dumas", "Victor Hugo", "Émile Zola", "Gustave Flaubert"), "Literatura", "Victor Hugo publicó Los Miserables en 1862. Esta novela mayor del siglo XIX retrata la sociedad francesa de la época a través de personajes como Jean Valjean.")
        ),
        BilingualQuestion(
            id = 51002, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Jane Eyre'?", listOf("George Eliot", "Charlotte Brontë", "Emily Dickinson", "Jane Austen"), "Littérature", "Charlotte Brontë a publié 'Jane Eyre' en 1847 sous le pseudonyme Currer Bell, un roman majeur de la littérature victorienne."),
            en = LocalizedContent("Who is the author of 'Jane Eyre'?", listOf("George Eliot", "Charlotte Brontë", "Emily Dickinson", "Jane Austen"), "Literature", "Charlotte Brontë published 'Jane Eyre' in 1847 under the pseudonym Currer Bell, a major novel of Victorian literature."),
            zh = LocalizedContent("《简·爱》的作者是谁？", listOf("乔治·艾略特", "夏洛蒂·勃朗特", "艾米莉·狄金森", "简·奥斯汀"), "文学", "夏洛蒂·勃朗特于1847年以笔名柯勒·贝尔出版了《简·爱》，这是维多利亚文学的重要小说。"),
            es = LocalizedContent("¿Quién es el autor de 'Jane Eyre'?", listOf("George Eliot", "Charlotte Brontë", "Emily Dickinson", "Jane Austen"), "Literatura", "Charlotte Brontë publicó 'Jane Eyre' en 1847 bajo el seudónimo Currer Bell, una novela mayor de la literatura victoriana.")
        ),
        BilingualQuestion(
            id = 51003, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Les Hauts de Hurlevent'?", listOf("George Eliot", "Charlotte Brontë", "Emily Brontë", "Jane Austen"), "Littérature", "Emily Brontë a publié ce roman en 1847 sous le pseudonyme masculin Ellis Bell, car les femmes autrices étaient peu acceptées à l'époque."),
            en = LocalizedContent("Who is the author of 'Wuthering Heights'?", listOf("George Eliot", "Charlotte Brontë", "Emily Brontë", "Jane Austen"), "Literature", "Emily Brontë published this novel in 1847 under the male pseudonym Ellis Bell, as female authors were not widely accepted at the time."),
            zh = LocalizedContent("《呼啸山庄》的作者是谁？", listOf("乔治·艾略特", "夏洛蒂·勃朗特", "艾米莉·勃朗特", "简·奥斯汀"), "文学", "艾米莉·勃朗特于1847年以男性笔名埃利斯·贝尔出版了这部小说，因为当时女性作家不被广泛接受。"),
            es = LocalizedContent("¿Quién es el autor de 'Cumbres Borrascosas'?", listOf("George Eliot", "Charlotte Brontë", "Emily Brontë", "Jane Austen"), "Literatura", "Emily Brontë publicó esta novela en 1847 bajo el seudónimo masculino Ellis Bell, ya que las mujeres escritoras no eran ampliamente aceptadas en esa época.")
        ),
        BilingualQuestion(
            id = 51004, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Fierté et Préjugés'?", listOf("George Eliot", "Charlotte Brontë", "Emily Dickinson", "Jane Austen"), "Littérature", "Jane Austen a publié \"Fierté et Préjugés\" en 1813, un roman majeur de la littérature anglaise qui critique la société et les mariages arrangés de son époque."),
            en = LocalizedContent("Who is the author of 'Pride and Prejudice'?", listOf("George Eliot", "Charlotte Brontë", "Emily Dickinson", "Jane Austen"), "Literature", "Jane Austen published 'Pride and Prejudice' in 1813, a major novel of English literature that criticizes society and arranged marriages of her time."),
            zh = LocalizedContent("《傲慢与偏见》的作者是谁？", listOf("乔治·艾略特", "夏洛蒂·勃朗特", "艾米莉·狄金森", "简·奥斯汀"), "文学", "简·奥斯汀于1813年出版了《傲慢与偏见》，这是英国文学的重要小说，批判了当时的社会和包办婚姻。"),
            es = LocalizedContent("¿Quién es el autor de 'Orgullo y Prejuicio'?", listOf("George Eliot", "Charlotte Brontë", "Emily Dickinson", "Jane Austen"), "Literatura", "Jane Austen publicó 'Orgullo y Prejuicio' en 1813, una novela mayor de la literatura inglesa que critica la sociedad y los matrimonios arreglados de su época.")
        ),
        BilingualQuestion(
            id = 51005, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Orgueill et Préjugés'?", listOf("George Eliot", "Charlotte Brontë", "Emily Dickinson", "Jane Austen"), "Littérature", "Jane Austen a publié Orgueil et Préjugés en 1813, roman devenu un classique de la littérature anglaise pour sa critique sociale et son humour."),
            en = LocalizedContent("Who is the author of 'Pride and Prejudice'?", listOf("George Eliot", "Charlotte Brontë", "Emily Dickinson", "Jane Austen"), "Literature", "Jane Austen published Pride and Prejudice in 1813, a novel that became a classic of English literature for its social criticism and humor."),
            zh = LocalizedContent("《傲慢与偏见》的作者是谁？", listOf("乔治·艾略特", "夏洛蒂·勃朗特", "艾米莉·狄金森", "简·奥斯汀"), "文学", "简·奥斯汀于1813年出版了《傲慢与偏见》，这部小说因其社会批判和幽默而成为英国文学的经典。"),
            es = LocalizedContent("¿Quién es el autor de 'Orgullo y prejuicio'?", listOf("George Eliot", "Charlotte Brontë", "Emily Dickinson", "Jane Austen"), "Literatura", "Jane Austen publicó Orgullo y prejuicio en 1813, novela que se convirtió en un clásico de la literatura inglesa por su crítica social y humor.")
        ),
        BilingualQuestion(
            id = 51006, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Le Comte de Monte-Cristo'?", listOf("Alexandre Dumas", "Victor Hugo", "Émile Zola", "Gustave Flaubert"), "Littérature", "Alexandre Dumas a publié ce roman d'aventures en feuilleton entre 1844 et 1846, s'inspirant d'un fait divers réel impliquant un cordonnier injustement emprisonné."),
            en = LocalizedContent("Who is the author of 'The Count of Monte Cristo'?", listOf("Alexandre Dumas", "Victor Hugo", "Émile Zola", "Gustave Flaubert"), "Literature", "Alexandre Dumas published this adventure novel as a serial between 1844 and 1846, inspired by a real-life incident involving a shoemaker unjustly imprisoned."),
            zh = LocalizedContent("《基督山伯爵》的作者是谁？", listOf("大仲马", "维克多·雨果", "埃米尔·左拉", "古斯塔夫·福楼拜"), "文学", "大仲马于1844年至1846年间以连载形式出版了这部冒险小说，灵感来源于一个鞋匠被不公正监禁的真实事件。"),
            es = LocalizedContent("¿Quién es el autor de 'El conde de Montecristo'?", listOf("Alexandre Dumas", "Victor Hugo", "Émile Zola", "Gustave Flaubert"), "Literatura", "Alexandre Dumas publicó esta novela de aventuras por entregas entre 1844 y 1846, inspirándose en un hecho real de un zapatero injustamente encarcelado.")
        ),
        BilingualQuestion(
            id = 51007, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Moby Dick'?", listOf("Nathaniel Hawthorne", "Herman Melville", "Mark Twain", "Harriet Beecher Stowe"), "Littérature", "Herman Melville a publié Moby Dick en 1851, roman inspiré de ses expériences de marin et de l'histoire vraie du baleinier Essex."),
            en = LocalizedContent("Who is the author of 'Moby-Dick'?", listOf("Nathaniel Hawthorne", "Herman Melville", "Mark Twain", "Harriet Beecher Stowe"), "Literature", "Herman Melville published Moby-Dick in 1851, a novel inspired by his experiences as a sailor and the true story of the whaling ship Essex."),
            zh = LocalizedContent("《白鲸》的作者是谁？", listOf("纳撒尼尔·霍桑", "赫尔曼·梅尔维尔", "马克·吐温", "哈里特·比彻·斯托"), "文学", "赫尔曼·梅尔维尔于1851年出版了《白鲸》，这部小说灵感来源于他作为水手的经历以及捕鲸船埃塞克斯号的真实故事。"),
            es = LocalizedContent("¿Quién es el autor de 'Moby Dick'?", listOf("Nathaniel Hawthorne", "Herman Melville", "Mark Twain", "Harriet Beecher Stowe"), "Literatura", "Herman Melville publicó Moby Dick en 1851, novela inspirada en sus experiencias como marinero y en la historia real del ballenero Essex.")
        ),
        BilingualQuestion(
            id = 51008, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'auteur de 'Cent ans de Solitude'?", listOf("Jorge Luis Borges", "Gabriel García Márquez", "Pablo Neruda", "Julio Cortázar"), "Littérature", "Gabriel García Márquez a écrit ce roman emblématique du réalisme magique, publié en 1967, qui lui a valu le prix Nobel de littérature en 1982."),
            en = LocalizedContent("Who is the author of 'One Hundred Years of Solitude'?", listOf("Jorge Luis Borges", "Gabriel García Márquez", "Pablo Neruda", "Julio Cortázar"), "Literature", "Gabriel García Márquez wrote this emblematic novel of magical realism, published in 1967, which earned him the Nobel Prize in Literature in 1982."),
            zh = LocalizedContent("《百年孤独》的作者是谁？", listOf("豪尔赫·路易斯·博尔赫斯", "加夫列尔·加西亚·马尔克斯", "巴勃罗·聂鲁达", "胡利奥·科塔萨尔"), "文学", "加夫列尔·加西亚·马尔克斯于1967年出版了这部魔幻现实主义的标志性小说，并因此于1982年获得诺贝尔文学奖。"),
            es = LocalizedContent("¿Quién es el autor de 'Cien años de soledad'?", listOf("Jorge Luis Borges", "Gabriel García Márquez", "Pablo Neruda", "Julio Cortázar"), "Literatura", "Gabriel García Márquez escribió esta novela emblemática del realismo mágico, publicada en 1967, que le valió el Premio Nobel de Literatura en 1982.")
        ),
        BilingualQuestion(
            id = 51009, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Crime et Châtiment'?", listOf("Dostoïevski", "Tolstoï", "Tourguéniev", "Pouchkine"), "Littérature", "Fiodor Dostoïevski a publié ce roman majeur en 1866, explorant la psychologie d’un meurtrier et les thèmes de la culpabilité et de la rédemption."),
            en = LocalizedContent("Who is the author of 'Crime and Punishment'?", listOf("Dostoevsky", "Tolstoy", "Turgenev", "Pushkin"), "Literature", "Fyodor Dostoevsky published this major novel in 1866, exploring the psychology of a murderer and themes of guilt and redemption."),
            zh = LocalizedContent("《罪与罚》的作者是谁？", listOf("陀思妥耶夫斯基", "托尔斯泰", "屠格涅夫", "普希金"), "文学", "费奥多尔·陀思妥耶夫斯基于1866年出版了这部重要小说，探讨了杀人犯的心理以及罪恶与救赎的主题。"),
            es = LocalizedContent("¿Quién es el autor de 'Crimen y castigo'?", listOf("Dostoievski", "Tolstói", "Turguénev", "Pushkin"), "Literatura", "Fiódor Dostoievski publicó esta novela mayor en 1866, explorando la psicología de un asesino y los temas de la culpa y la redención.")
        ),
        BilingualQuestion(
            id = 51010, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'auteur de 'La Nuit de la Rue du Parc'?", listOf("Charles Baudelaire", "Victor Hugo", "Arthur Rimbaud", "Stéphane Mallarmé"), "Littérature", "Arthur Rimbaud a écrit ce poème en 1870, à l'âge de 16 ans, dans le recueil \"Poésies\". Il y décrit une scène nocturne parisienne avec une ironie mordante."),
            en = LocalizedContent("Who is the author of 'Night in the Rue du Parc'?", listOf("Charles Baudelaire", "Victor Hugo", "Arthur Rimbaud", "Stéphane Mallarmé"), "Literature", "Arthur Rimbaud wrote this poem in 1870 at the age of 16, in the collection 'Poésies'. It describes a Parisian night scene with biting irony."),
            zh = LocalizedContent("《公园街之夜》的作者是谁？", listOf("夏尔·波德莱尔", "维克多·雨果", "阿蒂尔·兰波", "斯特凡·马拉美"), "文学", "阿蒂尔·兰波于1870年16岁时创作了这首诗，收录在《诗集》中。诗中用尖刻的讽刺描绘了一个巴黎的夜晚场景。"),
            es = LocalizedContent("¿Quién es el autor de 'La noche de la calle del Parque'?", listOf("Charles Baudelaire", "Victor Hugo", "Arthur Rimbaud", "Stéphane Mallarmé"), "Literatura", "Arthur Rimbaud escribió este poema en 1870 a los 16 años, en la colección 'Poesías'. Describe una escena nocturna parisina con una ironía mordaz.")
        ),
        BilingualQuestion(
            id = 51011, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Madame Bovary'?", listOf("Honoré de Balzac", "Gustave Flaubert", "Émile Zola", "Stendhal"), "Littérature", "Gustave Flaubert a publié Madame Bovary en 1857, un roman réaliste qui a marqué la littérature française par sa description minutieuse de la vie provinciale et de l'insatisfaction conjugale."),
            en = LocalizedContent("Who is the author of 'Madame Bovary'?", listOf("Honoré de Balzac", "Gustave Flaubert", "Émile Zola", "Stendhal"), "Literature", "Gustave Flaubert published Madame Bovary in 1857, a realist novel that marked French literature with its meticulous description of provincial life and marital dissatisfaction."),
            zh = LocalizedContent("《包法利夫人》的作者是谁？", listOf("奥诺雷·德·巴尔扎克", "古斯塔夫·福楼拜", "埃米尔·左拉", "司汤达"), "文学", "古斯塔夫·福楼拜于1857年出版了《包法利夫人》，这部现实主义小说以其对乡村生活和婚姻不满的细致描写而标志着法国文学。"),
            es = LocalizedContent("¿Quién es el autor de 'Madame Bovary'?", listOf("Honoré de Balzac", "Gustave Flaubert", "Émile Zola", "Stendhal"), "Literatura", "Gustave Flaubert publicó Madame Bovary en 1857, una novela realista que marcó la literatura francesa por su descripción minuciosa de la vida provinciana y la insatisfacción conyugal.")
        ),
        BilingualQuestion(
            id = 51012, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'auteur de 'Le Père Goriot'?", listOf("Honoré de Balzac", "Gustave Flaubert", "Émile Zola", "Stendhal"), "Littérature", "Honoré de Balzac a écrit Le Père Goriot en 1835, roman majeur de La Comédie humaine qui explore les thèmes de l'ambition et de la paternité dans le Paris du XIXe siècle."),
            en = LocalizedContent("Who is the author of 'Father Goriot'?", listOf("Honoré de Balzac", "Gustave Flaubert", "Émile Zola", "Stendhal"), "Literature", "Honoré de Balzac wrote Father Goriot in 1835, a major novel of La Comédie humaine that explores themes of ambition and fatherhood in 19th-century Paris."),
            zh = LocalizedContent("《高老头》的作者是谁？", listOf("奥诺雷·德·巴尔扎克", "古斯塔夫·福楼拜", "埃米尔·左拉", "司汤达"), "文学", "奥诺雷·德·巴尔扎克于1835年创作了《高老头》，这是《人间喜剧》中的一部重要小说，探讨了19世纪巴黎的野心和父爱主题。"),
            es = LocalizedContent("¿Quién es el autor de 'Papá Goriot'?", listOf("Honoré de Balzac", "Gustave Flaubert", "Émile Zola", "Stendhal"), "Literatura", "Honoré de Balzac escribió Papá Goriot en 1835, novela mayor de La comedia humana que explora los temas de la ambición y la paternidad en el París del siglo XIX.")
        ),
        BilingualQuestion(
            id = 51013, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'auteur de 'Le Rouge et le Noir'?", listOf("Honoré de Balzac", "Gustave Flaubert", "Stendhal", "Alexandre Dumas"), "Littérature", "Stendhal, de son vrai nom Henri Beyle, a publié ce roman en 1830, considéré comme un chef-d'œuvre du réalisme français."),
            en = LocalizedContent("Who is the author of 'The Red and the Black'?", listOf("Honoré de Balzac", "Gustave Flaubert", "Stendhal", "Alexandre Dumas"), "Literature", "Stendhal, whose real name was Henri Beyle, published this novel in 1830, considered a masterpiece of French realism."),
            zh = LocalizedContent("《红与黑》的作者是谁？", listOf("奥诺雷·德·巴尔扎克", "古斯塔夫·福楼拜", "司汤达", "大仲马"), "文学", "司汤达，本名亨利·贝尔，于1830年出版了这部小说，被认为是法国现实主义的杰作。"),
            es = LocalizedContent("¿Quién es el autor de 'Rojo y negro'?", listOf("Honoré de Balzac", "Gustave Flaubert", "Stendhal", "Alexandre Dumas"), "Literatura", "Stendhal, cuyo verdadero nombre era Henri Beyle, publicó esta novela en 1830, considerada una obra maestra del realismo francés.")
        ),
        BilingualQuestion(
            id = 51014, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'auteur de 'L'Assommoir'?", listOf("Honoré de Balzac", "Gustave Flaubert", "Émile Zola", "Guy de Maupassant"), "Littérature", "Émile Zola a écrit 'L'Assommoir' en 1877, dans le cadre de son cycle romanesque des Rougon-Macquart, qui explore la vie ouvrière sous le Second Empire."),
            en = LocalizedContent("Who is the author of 'L'Assommoir'?", listOf("Honoré de Balzac", "Gustave Flaubert", "Émile Zola", "Guy de Maupassant"), "Literature", "Émile Zola wrote 'L'Assommoir' in 1877, as part of his Rougon-Macquart novel cycle, which explores working-class life under the Second Empire."),
            zh = LocalizedContent("《小酒店》的作者是谁？", listOf("奥诺雷·德·巴尔扎克", "古斯塔夫·福楼拜", "埃米尔·左拉", "居伊·德·莫泊桑"), "文学", "埃米尔·左拉于1877年创作了《小酒店》，作为他的《卢贡-马卡尔家族》系列的一部分，该系列探索了第二帝国时期的工人阶级生活。"),
            es = LocalizedContent("¿Quién es el autor de 'La taberna'?", listOf("Honoré de Balzac", "Gustave Flaubert", "Émile Zola", "Guy de Maupassant"), "Literatura", "Émile Zola escribió 'La taberna' en 1877, como parte de su ciclo novelístico de los Rougon-Macquart, que explora la vida obrera bajo el Segundo Imperio.")
        ),
        BilingualQuestion(
            id = 51015, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'auteur de 'La Bête Humaine'?", listOf("Honoré de Balzac", "Gustave Flaubert", "Émile Zola", "Guy de Maupassant"), "Littérature", "Émile Zola a écrit 'La Bête Humaine' en 1890, dans le cadre de sa série romanesque Les Rougon-Macquart, qui explore l'hérédité et la société sous le Second Empire."),
            en = LocalizedContent("Who is the author of 'La Bête Humaine'?", listOf("Honoré de Balzac", "Gustave Flaubert", "Émile Zola", "Guy de Maupassant"), "Literature", "Émile Zola wrote 'La Bête Humaine' in 1890, as part of his Rougon-Macquart series, which explores heredity and society under the Second Empire."),
            zh = LocalizedContent("《人兽》的作者是谁？", listOf("奥诺雷·德·巴尔扎克", "古斯塔夫·福楼拜", "埃米尔·左拉", "居伊·德·莫泊桑"), "文学", "埃米尔·左拉于1890年创作了《人兽》，作为其《卢贡-马卡尔家族》系列的一部分，该系列探讨了第二帝国时期的遗传与社会。"),
            es = LocalizedContent("¿Quién es el autor de 'La bestia humana'?", listOf("Honoré de Balzac", "Gustave Flaubert", "Émile Zola", "Guy de Maupassant"), "Literatura", "Émile Zola escribió 'La bestia humana' en 1890, como parte de su serie novelística Los Rougon-Macquart, que explora la herencia y la sociedad bajo el Segundo Imperio.")
        ),
        BilingualQuestion(
            id = 51016, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'auteur de 'Une Simple Histoire'?", listOf("Guy de Maupassant", "Émile Zola", "Gustave Flaubert", "Alphonse Daudet"), "Littérature", "Guy de Maupassant a publié cette nouvelle en 1885, une œuvre représentative de son style naturaliste et de son goût pour les récits brefs et réalistes."),
            en = LocalizedContent("Who is the author of 'A Simple Story'?", listOf("Guy de Maupassant", "Émile Zola", "Gustave Flaubert", "Alphonse Daudet"), "Literature", "Guy de Maupassant published this short story in 1885, a representative work of his naturalist style and his taste for brief, realistic narratives."),
            zh = LocalizedContent("《一个简单的故事》的作者是谁？", listOf("居伊·德·莫泊桑", "埃米尔·左拉", "古斯塔夫·福楼拜", "阿尔封斯·都德"), "文学", "居伊·德·莫泊桑于1885年发表了这篇短篇小说，这是他自然主义风格以及对简短现实主义叙事偏好的代表作。"),
            es = LocalizedContent("¿Quién es el autor de 'Una simple historia'?", listOf("Guy de Maupassant", "Émile Zola", "Gustave Flaubert", "Alphonse Daudet"), "Literatura", "Guy de Maupassant publicó este cuento en 1885, una obra representativa de su estilo naturalista y su gusto por los relatos breves y realistas.")
        ),
        BilingualQuestion(
            id = 51017, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Le Fantôme de l'Opéra'?", listOf("Jules Verne", "Gaston Leroux", "H. G. Wells", "Arthur Conan Doyle"), "Littérature", "Gaston Leroux, journaliste et écrivain français, a publié ce roman gothique en 1910, s'inspirant de légendes urbaines et de l'Opéra Garnier à Paris."),
            en = LocalizedContent("Who is the author of 'The Phantom of the Opera'?", listOf("Jules Verne", "Gaston Leroux", "H. G. Wells", "Arthur Conan Doyle"), "Literature", "Gaston Leroux, a French journalist and writer, published this gothic novel in 1910, inspired by urban legends and the Paris Opera Garnier."),
            zh = LocalizedContent("《歌剧魅影》的作者是谁？", listOf("儒勒·凡尔纳", "加斯东·勒鲁", "赫伯特·乔治·威尔斯", "阿瑟·柯南·道尔"), "文学", "加斯东·勒鲁，法国记者和作家，于1910年出版了这部哥特式小说，灵感来源于都市传说和巴黎加尼叶歌剧院。"),
            es = LocalizedContent("¿Quién es el autor de 'El fantasma de la ópera'?", listOf("Julio Verne", "Gastón Leroux", "H. G. Wells", "Arthur Conan Doyle"), "Literatura", "Gastón Leroux, periodista y escritor francés, publicó esta novela gótica en 1910, inspirándose en leyendas urbanas y la Ópera Garnier de París.")
        ),
        BilingualQuestion(
            id = 51018, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Vingt Mille Lieues sous les Mers'?", listOf("Jules Verne", "Gaston Leroux", "H. G. Wells", "Arthur Conan Doyle"), "Littérature", "Jules Verne a publié ce roman d'aventures sous-marines en 1870, mettant en scène le capitaine Nemo et son sous-marin le Nautilus."),
            en = LocalizedContent("Who is the author of 'Twenty Thousand Leagues Under the Sea'?", listOf("Jules Verne", "Gaston Leroux", "H. G. Wells", "Arthur Conan Doyle"), "Literature", "Jules Verne published this underwater adventure novel in 1870, featuring Captain Nemo and his submarine the Nautilus."),
            zh = LocalizedContent("《海底两万里》的作者是谁？", listOf("儒勒·凡尔纳", "加斯东·勒鲁", "赫伯特·乔治·威尔斯", "阿瑟·柯南·道尔"), "文学", "儒勒·凡尔纳于1870年出版了这部海底冒险小说，描绘了尼莫船长和他的潜艇鹦鹉螺号。"),
            es = LocalizedContent("¿Quién es el autor de 'Veinte mil leguas de viaje submarino'?", listOf("Julio Verne", "Gastón Leroux", "H. G. Wells", "Arthur Conan Doyle"), "Literatura", "Julio Verne publicó esta novela de aventuras submarinas en 1870, presentando al capitán Nemo y su submarino el Nautilus.")
        ),
        BilingualQuestion(
            id = 51019, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Le Voyage au Centre de la Terre'?", listOf("Jules Verne", "Gaston Leroux", "H. G. Wells", "Arthur Conan Doyle"), "Littérature", "Jules Verne, célèbre écrivain français du XIXe siècle, est l'auteur de ce roman d'aventures scientifiques publié en 1864, qui explore les profondeurs de la Terre à travers une expédition fictive."),
            en = LocalizedContent("Who is the author of 'Journey to the Center of the Earth'?", listOf("Jules Verne", "Gaston Leroux", "H. G. Wells", "Arthur Conan Doyle"), "Literature", "Jules Verne, the famous 19th-century French writer, is the author of this scientific adventure novel published in 1864, which explores the depths of the Earth through a fictional expedition."),
            zh = LocalizedContent("《地心游记》的作者是谁？", listOf("儒勒·凡尔纳", "加斯东·勒鲁", "赫伯特·乔治·威尔斯", "阿瑟·柯南·道尔"), "文学", "儒勒·凡尔纳，19世纪著名的法国作家，是这部1864年出版的科学冒险小说的作者，通过虚构的探险探索地球深处。"),
            es = LocalizedContent("¿Quién es el autor de 'Viaje al centro de la Tierra'?", listOf("Julio Verne", "Gastón Leroux", "H. G. Wells", "Arthur Conan Doyle"), "Literatura", "Julio Verne, el famoso escritor francés del siglo XIX, es el autor de esta novela de aventuras científicas publicada en 1864, que explora las profundidades de la Tierra a través de una expedición ficticia.")
        ),
        BilingualQuestion(
            id = 51020, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'La Machine à Explorer le Temps'?", listOf("Jules Verne", "Gaston Leroux", "H. G. Wells", "Arthur Conan Doyle"), "Littérature", "H. G. Wells a publié ce roman de science-fiction en 1895, popularisant le concept de voyage dans le temps via une machine mécanique."),
            en = LocalizedContent("Who is the author of 'The Time Machine'?", listOf("Jules Verne", "Gaston Leroux", "H. G. Wells", "Arthur Conan Doyle"), "Literature", "H. G. Wells published this science fiction novel in 1895, popularizing the concept of time travel via a mechanical machine."),
            zh = LocalizedContent("《时间机器》的作者是谁？", listOf("儒勒·凡尔纳", "加斯东·勒鲁", "赫伯特·乔治·威尔斯", "阿瑟·柯南·道尔"), "文学", "赫伯特·乔治·威尔斯于1895年出版了这部科幻小说，通过机械装置普及了时间旅行的概念。"),
            es = LocalizedContent("¿Quién es el autor de 'La máquina del tiempo'?", listOf("Julio Verne", "Gastón Leroux", "H. G. Wells", "Arthur Conan Doyle"), "Literatura", "H. G. Wells publicó esta novela de ciencia ficción en 1895, popularizando el concepto de viaje en el tiempo a través de una máquina mecánica.")
        ),
        BilingualQuestion(
            id = 51021, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Sherlock Holmes'?", listOf("Jules Verne", "Gaston Leroux", "H. G. Wells", "Arthur Conan Doyle"), "Littérature", "Arthur Conan Doyle, médecin et écrivain écossais, créa le détective Sherlock Holmes en 1887 pour le roman *Une étude en rouge*."),
            en = LocalizedContent("Who is the author of 'Sherlock Holmes'?", listOf("Jules Verne", "Gaston Leroux", "H. G. Wells", "Arthur Conan Doyle"), "Literature", "Arthur Conan Doyle, a Scottish doctor and writer, created the detective Sherlock Holmes in 1887 for the novel *A Study in Scarlet*."),
            zh = LocalizedContent("《福尔摩斯》的作者是谁？", listOf("儒勒·凡尔纳", "加斯东·勒鲁", "赫伯特·乔治·威尔斯", "阿瑟·柯南·道尔"), "文学", "阿瑟·柯南·道尔，苏格兰医生和作家，于1887年在小说《血字的研究》中创造了侦探夏洛克·福尔摩斯。"),
            es = LocalizedContent("¿Quién es el autor de 'Sherlock Holmes'?", listOf("Julio Verne", "Gastón Leroux", "H. G. Wells", "Arthur Conan Doyle"), "Literatura", "Arthur Conan Doyle, médico y escritor escocés, creó al detective Sherlock Holmes en 1887 para la novela *Estudio en escarlata*.")
        ),
        BilingualQuestion(
            id = 51022, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'auteur de 'Dracula'?", listOf("Oscar Wilde", "Bram Stoker", "H. P. Lovecraft", "Mary Shelley"), "Littérature", "Bram Stoker, écrivain irlandais, a publié Dracula en 1897, roman qui a popularisé le mythe du vampire moderne."),
            en = LocalizedContent("Who is the author of 'Dracula'?", listOf("Oscar Wilde", "Bram Stoker", "H. P. Lovecraft", "Mary Shelley"), "Literature", "Bram Stoker, an Irish writer, published Dracula in 1897, a novel that popularized the modern vampire myth."),
            zh = LocalizedContent("《德古拉》的作者是谁？", listOf("奥斯卡·王尔德", "布拉姆·斯托克", "H. P. 洛夫克拉夫特", "玛丽·雪莱"), "文学", "布拉姆·斯托克，爱尔兰作家，于1897年出版了《德古拉》，这部小说普及了现代吸血鬼神话。"),
            es = LocalizedContent("¿Quién es el autor de 'Drácula'?", listOf("Oscar Wilde", "Bram Stoker", "H. P. Lovecraft", "Mary Shelley"), "Literatura", "Bram Stoker, escritor irlandés, publicó Drácula en 1897, novela que popularizó el mito del vampiro moderno.")
        ),
        BilingualQuestion(
            id = 51023, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Frankenstein'?", listOf("Oscar Wilde", "Bram Stoker", "H. P. Lovecraft", "Mary Shelley"), "Littérature", "Mary Shelley a écrit Frankenstein en 1818, alors qu'elle avait 18 ans, lors d'un concours d'écriture avec Lord Byron et Percy Shelley."),
            en = LocalizedContent("Who is the author of 'Frankenstein'?", listOf("Oscar Wilde", "Bram Stoker", "H. P. Lovecraft", "Mary Shelley"), "Literature", "Mary Shelley wrote Frankenstein in 1818, when she was 18, during a writing contest with Lord Byron and Percy Shelley."),
            zh = LocalizedContent("《弗兰肯斯坦》的作者是谁？", listOf("奥斯卡·王尔德", "布拉姆·斯托克", "H. P. 洛夫克拉夫特", "玛丽·雪莱"), "文学", "玛丽·雪莱于1818年创作了《弗兰肯斯坦》，当时她18岁，是在与拜伦勋爵和珀西·雪莱的一次写作比赛中完成的。"),
            es = LocalizedContent("¿Quién es el autor de 'Frankenstein'?", listOf("Oscar Wilde", "Bram Stoker", "H. P. Lovecraft", "Mary Shelley"), "Literatura", "Mary Shelley escribió Frankenstein en 1818, cuando tenía 18 años, durante un concurso de escritura con Lord Byron y Percy Shelley.")
        ),
        BilingualQuestion(
            id = 51024, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'L'Île au Trésor'?", listOf("Robert Louis Stevenson", "Jules Verne", "Arthur Conan Doyle", "H. Rider Haggard"), "Littérature", "Robert Louis Stevenson a publié ce roman d'aventures en 1883, inspiré par ses voyages et les récits de pirates."),
            en = LocalizedContent("Who is the author of 'Treasure Island'?", listOf("Robert Louis Stevenson", "Jules Verne", "Arthur Conan Doyle", "H. Rider Haggard"), "Literature", "Robert Louis Stevenson published this adventure novel in 1883, inspired by his travels and pirate tales."),
            zh = LocalizedContent("《金银岛》的作者是谁？", listOf("罗伯特·路易斯·史蒂文森", "儒勒·凡尔纳", "阿瑟·柯南·道尔", "H. 赖德·哈格德"), "文学", "罗伯特·路易斯·史蒂文森于1883年出版了这部冒险小说，灵感来源于他的旅行和海盗故事。"),
            es = LocalizedContent("¿Quién es el autor de 'La isla del tesoro'?", listOf("Robert Louis Stevenson", "Julio Verne", "Arthur Conan Doyle", "H. Rider Haggard"), "Literatura", "Robert Louis Stevenson publicó esta novela de aventuras en 1883, inspirada por sus viajes y relatos de piratas.")
        ),
        BilingualQuestion(
            id = 51025, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'auteur de 'Le Maître du Monde'?", listOf("Jules Verne", "H.G. Wells", "Arthur Conan Doyle", "Gaston Leroux"), "Littérature", "Jules Verne a écrit 'Le Maître du Monde' en 1904, un roman d'aventures scientifiques mettant en scène un inventeur génial et son engin terrifiant."),
            en = LocalizedContent("Who is the author of 'The Master of the World'?", listOf("Jules Verne", "H.G. Wells", "Arthur Conan Doyle", "Gaston Leroux"), "Literature", "Jules Verne wrote 'The Master of the World' in 1904, a scientific adventure novel featuring a brilliant inventor and his terrifying machine."),
            zh = LocalizedContent("《世界主宰者》的作者是谁？", listOf("儒勒·凡尔纳", "H.G.威尔斯", "阿瑟·柯南·道尔", "加斯东·勒鲁"), "文学", "儒勒·凡尔纳于1904年创作了《世界主宰者》，这是一部科学冒险小说，讲述了一位天才发明家及其可怕的机器。"),
            es = LocalizedContent("¿Quién es el autor de 'El dueño del mundo'?", listOf("Julio Verne", "H.G. Wells", "Arthur Conan Doyle", "Gastón Leroux"), "Literatura", "Julio Verne escribió 'El dueño del mundo' en 1904, una novela de aventuras científicas que presenta a un inventor genial y su aterradora máquina.")
        ),
        BilingualQuestion(
            id = 51026, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Peter Pan'?", listOf("George Bernard Shaw", "J.M. Barrie", "Oscar Wilde", "H.G. Wells"), "Littérature", "J.M. Barrie, dramaturge et romancier écossais, a créé le personnage de Peter Pan pour la première fois dans une pièce de théâtre en 1904, avant de le développer dans le roman 'Peter et Wendy' en 1911."),
            en = LocalizedContent("Who is the author of 'Peter Pan'?", listOf("George Bernard Shaw", "J.M. Barrie", "Oscar Wilde", "H.G. Wells"), "Literature", "J.M. Barrie, Scottish playwright and novelist, first created the character of Peter Pan in a 1904 play, later developing it in the novel 'Peter and Wendy' in 1911."),
            zh = LocalizedContent("《彼得·潘》的作者是谁？", listOf("乔治·伯纳德·萧", "J.M.巴里", "奥斯卡·王尔德", "H.G.威尔斯"), "文学", "J.M.巴里，苏格兰剧作家和小说家，于1904年在一部戏剧中首次创造了彼得·潘这个角色，后来在1911年的小说《彼得与温蒂》中进一步发展。"),
            es = LocalizedContent("¿Quién es el autor de 'Peter Pan'?", listOf("George Bernard Shaw", "J.M. Barrie", "Oscar Wilde", "H.G. Wells"), "Literatura", "J.M. Barrie, dramaturgo y novelista escocés, creó por primera vez al personaje de Peter Pan en una obra de teatro de 1904, desarrollándolo posteriormente en la novela 'Peter y Wendy' en 1911.")
        ),
        BilingualQuestion(
            id = 51027, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Alice au Pays des Merveilles'?", listOf("Edward Lear", "Lewis Carroll", "Oscar Wilde", "Charles Dickens"), "Littérature", "Lewis Carroll, de son vrai nom Charles Lutwidge Dodgson, était un mathématicien et écrivain britannique qui a publié ce classique de la littérature jeunesse en 1865."),
            en = LocalizedContent("Who is the author of 'Alice's Adventures in Wonderland'?", listOf("Edward Lear", "Lewis Carroll", "Oscar Wilde", "Charles Dickens"), "Literature", "Lewis Carroll, real name Charles Lutwidge Dodgson, was a British mathematician and writer who published this classic of children's literature in 1865."),
            zh = LocalizedContent("《爱丽丝梦游仙境》的作者是谁？", listOf("爱德华·李尔", "刘易斯·卡罗尔", "奥斯卡·王尔德", "查尔斯·狄更斯"), "文学", "刘易斯·卡罗尔，本名查尔斯·路特维奇·道奇森，是一位英国数学家和作家，于1865年出版了这部儿童文学经典。"),
            es = LocalizedContent("¿Quién es el autor de 'Alicia en el País de las Maravillas'?", listOf("Edward Lear", "Lewis Carroll", "Oscar Wilde", "Charles Dickens"), "Literatura", "Lewis Carroll, cuyo nombre real era Charles Lutwidge Dodgson, fue un matemático y escritor británico que publicó este clásico de la literatura infantil en 1865.")
        ),
        BilingualQuestion(
            id = 51028, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Les Aventures de Tom Sawyer'?", listOf("Mark Twain", "Jack London", "Harriet Beecher Stowe", "James Fenimore Cooper"), "Littérature", "Mark Twain, de son vrai nom Samuel Langhorne Clemens, a publié ce roman en 1876, s'inspirant de son enfance dans le Missouri."),
            en = LocalizedContent("Who is the author of 'The Adventures of Tom Sawyer'?", listOf("Mark Twain", "Jack London", "Harriet Beecher Stowe", "James Fenimore Cooper"), "Literature", "Mark Twain, real name Samuel Langhorne Clemens, published this novel in 1876, drawing on his childhood in Missouri."),
            zh = LocalizedContent("《汤姆·索亚历险记》的作者是谁？", listOf("马克·吐温", "杰克·伦敦", "哈里特·比彻·斯托", "詹姆斯·费尼莫尔·库珀"), "文学", "马克·吐温，本名塞缪尔·朗赫恩·克莱门斯，于1876年出版了这部小说，取材于他在密苏里州的童年经历。"),
            es = LocalizedContent("¿Quién es el autor de 'Las aventuras de Tom Sawyer'?", listOf("Mark Twain", "Jack London", "Harriet Beecher Stowe", "James Fenimore Cooper"), "Literatura", "Mark Twain, cuyo nombre real era Samuel Langhorne Clemens, publicó esta novela en 1876, inspirándose en su infancia en Misuri.")
        ),
        BilingualQuestion(
            id = 51029, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Le Seigneur des Anneaux'?", listOf("C.S. Lewis", "J.R.R. Tolkien", "George R.R. Martin", "Terry Pratchett"), "Littérature", "J.R.R. Tolkien, philologue et professeur à Oxford, a écrit Le Seigneur des Anneaux, publié en trois volumes entre 1954 et 1955. Cette œuvre majeure de la fantasy s'inspire de ses travaux sur les langues et mythologies anciennes."),
            en = LocalizedContent("Who is the author of 'The Lord of the Rings'?", listOf("C.S. Lewis", "J.R.R. Tolkien", "George R.R. Martin", "Terry Pratchett"), "Literature", "J.R.R. Tolkien, philologist and professor at Oxford, wrote The Lord of the Rings, published in three volumes between 1954 and 1955. This major fantasy work draws on his studies of ancient languages and mythologies."),
            zh = LocalizedContent("《魔戒》的作者是谁？", listOf("C.S.刘易斯", "J.R.R.托尔金", "乔治·R·R·马丁", "特里·普拉切特"), "文学", "J.R.R.托尔金，牛津大学的语言学家和教授，于1954年至1955年间分三卷出版了《魔戒》。这部重要的奇幻作品借鉴了他对古代语言和神话的研究。"),
            es = LocalizedContent("¿Quién es el autor de 'El Señor de los Anillos'?", listOf("C.S. Lewis", "J.R.R. Tolkien", "George R.R. Martin", "Terry Pratchett"), "Literatura", "J.R.R. Tolkien, filólogo y profesor en Oxford, escribió El Señor de los Anillos, publicado en tres volúmenes entre 1954 y 1955. Esta obra maestra de la fantasía se inspira en sus estudios sobre lenguas y mitologías antiguas.")
        ),
        BilingualQuestion(
            id = 51030, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Le Hobbit'?", listOf("C.S. Lewis", "J.R.R. Tolkien", "George R.R. Martin", "Terry Pratchett"), "Littérature", "J.R.R. Tolkien, philologue et professeur à Oxford, a publié Le Hobbit en 1937, posant les bases de son univers de la Terre du Milieu."),
            en = LocalizedContent("Who is the author of 'The Hobbit'?", listOf("C.S. Lewis", "J.R.R. Tolkien", "George R.R. Martin", "Terry Pratchett"), "Literature", "J.R.R. Tolkien, philologist and professor at Oxford, published The Hobbit in 1937, laying the foundations for his Middle-earth universe."),
            zh = LocalizedContent("《霍比特人》的作者是谁？", listOf("C.S.刘易斯", "J.R.R.托尔金", "乔治·R·R·马丁", "特里·普拉切特"), "文学", "J.R.R.托尔金，牛津大学的语言学家和教授，于1937年出版了《霍比特人》，为其中土世界奠定了基础。"),
            es = LocalizedContent("¿Quién es el autor de 'El hobbit'?", listOf("C.S. Lewis", "J.R.R. Tolkien", "George R.R. Martin", "Terry Pratchett"), "Literatura", "J.R.R. Tolkien, filólogo y profesor en Oxford, publicó El hobbit en 1937, sentando las bases de su universo de la Tierra Media.")
        ),
        BilingualQuestion(
            id = 51031, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Harry Potter'?", listOf("J.K. Rowling", "George R.R. Martin", "Terry Pratchett", "Patrick Rothfuss"), "Littérature", "J.K. Rowling est l'auteure britannique qui a créé la série de romans fantastiques Harry Potter, publiée entre 1997 et 2007."),
            en = LocalizedContent("Who is the author of 'Harry Potter'?", listOf("J.K. Rowling", "George R.R. Martin", "Terry Pratchett", "Patrick Rothfuss"), "Literature", "J.K. Rowling is the British author who created the Harry Potter fantasy series, published between 1997 and 2007."),
            zh = LocalizedContent("《哈利·波特》的作者是谁？", listOf("J.K.罗琳", "乔治·R·R·马丁", "特里·普拉切特", "帕特里克·罗斯福斯"), "文学", "J.K.罗琳是英国作家，她创作了《哈利·波特》奇幻系列，该系列于1997年至2007年间出版。"),
            es = LocalizedContent("¿Quién es el autor de 'Harry Potter'?", listOf("J.K. Rowling", "George R.R. Martin", "Terry Pratchett", "Patrick Rothfuss"), "Literatura", "J.K. Rowling es la autora británica que creó la serie de fantasía Harry Potter, publicada entre 1997 y 2007.")
        ),
        BilingualQuestion(
            id = 51032, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'auteur de 'L'Étranger'?", listOf("Jean-Paul Sartre", "Albert Camus", "Simone de Beauvoir", "Maurice Merleau-Ponty"), "Littérature", "Albert Camus a publié L'Étranger en 1942, un roman clé de l'existentialisme et de l'absurde, qui a marqué la littérature française du XXe siècle."),
            en = LocalizedContent("Who is the author of 'The Stranger'?", listOf("Jean-Paul Sartre", "Albert Camus", "Simone de Beauvoir", "Maurice Merleau-Ponty"), "Literature", "Albert Camus published The Stranger in 1942, a key novel of existentialism and absurdism that marked 20th-century French literature."),
            zh = LocalizedContent("《局外人》的作者是谁？", listOf("让-保罗·萨特", "阿尔贝·加缪", "西蒙娜·德·波伏娃", "莫里斯·梅洛-庞蒂"), "文学", "阿尔贝·加缪于1942年出版了《局外人》，这是一部存在主义和荒诞主义的关键小说，标志着20世纪法国文学的重要成就。"),
            es = LocalizedContent("¿Quién es el autor de 'El extranjero'?", listOf("Jean-Paul Sartre", "Albert Camus", "Simone de Beauvoir", "Maurice Merleau-Ponty"), "Literatura", "Albert Camus publicó El extranjero en 1942, una novela clave del existencialismo y el absurdo que marcó la literatura francesa del siglo XX.")
        ),
        BilingualQuestion(
            id = 51033, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'auteur de 'Le Roman des Trois Royaumes'?", listOf("Wu Chengen", "Cao Xueqin", "Luo Guanzhong", "Shi Nai'an"), "Littérature", "Luo Guanzhong est un écrivain chinois du XIVe siècle, considéré comme l'auteur de ce roman historique majeur qui relate la fin de la dynastie Han et la période des Trois Royaumes."),
            en = LocalizedContent("Who is the author of 'Romance of the Three Kingdoms'?", listOf("Wu Cheng'en", "Cao Xueqin", "Luo Guanzhong", "Shi Nai'an"), "Literature", "Luo Guanzhong is a 14th-century Chinese writer, considered the author of this major historical novel that recounts the end of the Han dynasty and the Three Kingdoms period."),
            zh = LocalizedContent("《三国演义》的作者是谁？", listOf("吴承恩", "曹雪芹", "罗贯中", "施耐庵"), "文学", "罗贯中是14世纪的中国作家，被认为是这部重要历史小说的作者，小说讲述了汉朝末年和三国时期的故事。"),
            es = LocalizedContent("¿Quién es el autor de 'El romance de los Tres Reinos'?", listOf("Wu Cheng'en", "Cao Xueqin", "Luo Guanzhong", "Shi Nai'an"), "Literatura", "Luo Guanzhong es un escritor chino del siglo XIV, considerado el autor de esta importante novela histórica que relata el final de la dinastía Han y el período de los Tres Reinos.")
        ),
        BilingualQuestion(
            id = 51034, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'auteur de 'Genji Monogatari'?", listOf("Saikaku", "Murasaki Shikibu", "Ihara Saikaku", "Ueda Akinari"), "Littérature", "Murasaki Shikibu, une dame de la cour impériale du Japon du XIe siècle, a écrit ce qui est considéré comme le premier roman psychologique de l'histoire."),
            en = LocalizedContent("Who is the author of 'The Tale of Genji'?", listOf("Saikaku", "Murasaki Shikibu", "Ihara Saikaku", "Ueda Akinari"), "Literature", "Murasaki Shikibu, a lady of the Japanese imperial court in the 11th century, wrote what is considered the first psychological novel in history."),
            zh = LocalizedContent("《源氏物语》的作者是谁？", listOf("西鹤", "紫式部", "井原西鹤", "上田秋成"), "文学", "紫式部是11世纪日本宫廷中的一位女官，她创作了被认为是历史上第一部心理小说的作品。"),
            es = LocalizedContent("¿Quién es el autor de 'La historia de Genji'?", listOf("Saikaku", "Murasaki Shikibu", "Ihara Saikaku", "Ueda Akinari"), "Literatura", "Murasaki Shikibu, una dama de la corte imperial japonesa del siglo XI, escribió lo que se considera la primera novela psicológica de la historia.")
        ),
    )

    private fun part6(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 51035, correctIndex = 3, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est l'auteur de 'Histoires de pluie et de lune'?", listOf("Saikaku", "Murasaki Shikibu", "Ihara Saikaku", "Ueda Akinari"), "Littérature", "Ueda Akinari est un écrivain japonais du XVIIIe siècle, célèbre pour ses recueils de contes fantastiques, dont Histoires de pluie et de lune, qui s'inspirent du folklore chinois et japonais."),
            en = LocalizedContent("Who is the author of 'Tales of Rain and Moon'?", listOf("Saikaku", "Murasaki Shikibu", "Ihara Saikaku", "Ueda Akinari"), "Literature", "Ueda Akinari is an 18th-century Japanese writer, famous for his collections of fantastic tales, including Tales of Rain and Moon, which draw inspiration from Chinese and Japanese folklore."),
            zh = LocalizedContent("《雨月物语》的作者是谁？", listOf("西鹤", "紫式部", "井原西鹤", "上田秋成"), "文学", "上田秋成是18世纪的日本作家，以奇幻故事集闻名，其中《雨月物语》取材于中日民间传说。"),
            es = LocalizedContent("¿Quién es el autor de 'Cuentos de lluvia y luna'?", listOf("Saikaku", "Murasaki Shikibu", "Ihara Saikaku", "Ueda Akinari"), "Literatura", "Ueda Akinari es un escritor japonés del siglo XVIII, famoso por sus colecciones de cuentos fantásticos, entre ellos Cuentos de lluvia y luna, que se inspiran en el folclore chino y japonés.")
        ),
        BilingualQuestion(
            id = 51036, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'auteur de 'Vie d'un courtesan'?", listOf("Saikaku", "Murasaki Shikibu", "Ihara Saikaku", "Ueda Akinari"), "Littérature", "Ihara Saikaku est un écrivain japonais de l'époque d'Edo, célèbre pour ses romans sur la vie des marchands et des courtisanes, dont \"Vie d'un courtisan\" fait partie."),
            en = LocalizedContent("Who is the author of 'Life of a Courtesan'?", listOf("Saikaku", "Murasaki Shikibu", "Ihara Saikaku", "Ueda Akinari"), "Literature", "Ihara Saikaku is a Japanese writer of the Edo period, famous for his novels about the lives of merchants and courtesans, including 'Life of a Courtesan'."),
            zh = LocalizedContent("《好色一代女》的作者是谁？", listOf("西鹤", "紫式部", "井原西鹤", "上田秋成"), "文学", "井原西鹤是江户时代的日本作家，以描写商人和妓女生活的小说闻名，其中包括《好色一代女》。"),
            es = LocalizedContent("¿Quién es el autor de 'Vida de una cortesana'?", listOf("Saikaku", "Murasaki Shikibu", "Ihara Saikaku", "Ueda Akinari"), "Literatura", "Ihara Saikaku es un escritor japonés del período Edo, famoso por sus novelas sobre la vida de los comerciantes y las cortesanas, incluida 'Vida de una cortesana'.")
        ),
        BilingualQuestion(
            id = 51037, correctIndex = 3, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est l'auteur de 'Contes de pluie et de lune'?", listOf("Saikaku", "Murasaki Shikibu", "Ihara Saikaku", "Ueda Akinari"), "Littérature", "Ueda Akinari, écrivain japonais du 18e siècle, a publié ce recueil de neuf contes fantastiques en 1776, s'inspirant de légendes chinoises et japonaises."),
            en = LocalizedContent("Who is the author of 'Tales of Rain and Moon'?", listOf("Saikaku", "Murasaki Shikibu", "Ihara Saikaku", "Ueda Akinari"), "Literature", "Ueda Akinari, an 18th-century Japanese writer, published this collection of nine fantastic tales in 1776, inspired by Chinese and Japanese legends."),
            zh = LocalizedContent("《雨月物语》的作者是谁？", listOf("西鹤", "紫式部", "井原西鹤", "上田秋成"), "文学", "上田秋成是18世纪的日本作家，于1776年出版了这部包含九个奇幻故事的集子，灵感来源于中日传说。"),
            es = LocalizedContent("¿Quién es el autor de 'Cuentos de lluvia y luna'?", listOf("Saikaku", "Murasaki Shikibu", "Ihara Saikaku", "Ueda Akinari"), "Literatura", "Ueda Akinari, escritor japonés del siglo XVIII, publicó esta colección de nueve cuentos fantásticos en 1776, inspirados en leyendas chinas y japonesas.")
        ),
        BilingualQuestion(
            id = 51038, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'auteur de 'Britannicus'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Littérature", "Racine a écrit Britannicus en 1669, une tragédie classique qui dépeint les intrigues politiques et amoureuses sous le règne de Néron."),
            en = LocalizedContent("Who is the author of 'Britannicus'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Literature", "Racine wrote Britannicus in 1669, a classical tragedy depicting political and romantic intrigues under Nero's reign."),
            zh = LocalizedContent("《布里塔尼居斯》的作者是谁？", listOf("高乃依", "拉辛", "莫里哀", "克雷比永"), "文学", "拉辛于1669年创作了《布里塔尼居斯》，这是一部古典悲剧，描绘了尼禄统治下的政治和爱情阴谋。"),
            es = LocalizedContent("¿Quién es el autor de 'Británico'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Literatura", "Racine escribió Británico en 1669, una tragedia clásica que describe las intrigas políticas y amorosas bajo el reinado de Nerón.")
        ),
        BilingualQuestion(
            id = 51039, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'auteur de 'Phèdre'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Littérature", "Racine a écrit Phèdre en 1677, s'inspirant de la mythologie grecque et de la pièce d'Euripide pour créer cette tragédie classique française."),
            en = LocalizedContent("Who is the author of 'Phèdre'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Literature", "Racine wrote Phèdre in 1677, drawing inspiration from Greek mythology and Euripides' play to create this French classical tragedy."),
            zh = LocalizedContent("《费德尔》的作者是谁？", listOf("高乃依", "拉辛", "莫里哀", "克雷比永"), "文学", "拉辛于1677年创作了《费德尔》，灵感来源于希腊神话和欧里庇得斯的戏剧，创作了这部法国古典悲剧。"),
            es = LocalizedContent("¿Quién es el autor de 'Fedra'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Literatura", "Racine escribió Fedra en 1677, inspirándose en la mitología griega y la obra de Eurípides para crear esta tragedia clásica francesa.")
        ),
        BilingualQuestion(
            id = 51040, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'auteur de 'Le Cid'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Littérature", "Pierre Corneille a écrit Le Cid en 1637, une tragi-comédie qui a marqué le théâtre classique français et suscité la querelle du Cid."),
            en = LocalizedContent("Who is the author of 'Le Cid'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Literature", "Pierre Corneille wrote Le Cid in 1637, a tragicomedy that marked French classical theatre and sparked the Quarrel of the Cid."),
            zh = LocalizedContent("《熙德》的作者是谁？", listOf("高乃依", "拉辛", "莫里哀", "克雷比永"), "文学", "皮埃尔·高乃依于1637年创作了《熙德》，这部悲喜剧标志着法国古典戏剧，并引发了“熙德之争”。"),
            es = LocalizedContent("¿Quién es el autor de 'El Cid'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Literatura", "Pierre Corneille escribió El Cid en 1637, una tragicomedia que marcó el teatro clásico francés y provocó la querella del Cid.")
        ),
        BilingualQuestion(
            id = 51041, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'auteur de 'Andromaque'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Littérature", "Racine a écrit Andromaque en 1667, une tragédie classique inspirée de la mythologie grecque et de l'œuvre d'Euripide."),
            en = LocalizedContent("Who is the author of 'Andromaque'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Literature", "Racine wrote Andromaque in 1667, a classical tragedy inspired by Greek mythology and the work of Euripides."),
            zh = LocalizedContent("《安德洛玛刻》的作者是谁？", listOf("高乃依", "拉辛", "莫里哀", "克雷比永"), "文学", "拉辛于1667年创作了《安德洛玛刻》，这是一部古典悲剧，灵感来源于希腊神话和欧里庇得斯的作品。"),
            es = LocalizedContent("¿Quién es el autor de 'Andrómaca'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Literatura", "Racine escribió Andrómaca en 1667, una tragedia clásica inspirada en la mitología griega y la obra de Eurípides.")
        ),
        BilingualQuestion(
            id = 51042, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'auteur de 'Tartuffe'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Littérature", "Molière a écrit Tartuffe en 1664. Cette pièce de théâtre satirique, critiquant l'hypocrisie religieuse, fut censurée à sa création avant de devenir un classique."),
            en = LocalizedContent("Who is the author of 'Tartuffe'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Literature", "Molière wrote Tartuffe in 1664. This satirical play, criticizing religious hypocrisy, was censored upon its creation before becoming a classic."),
            zh = LocalizedContent("《伪君子》的作者是谁？", listOf("高乃依", "拉辛", "莫里哀", "克雷比永"), "文学", "莫里哀于1664年创作了《伪君子》。这部讽刺宗教虚伪的戏剧在创作之初被禁演，后来成为经典。"),
            es = LocalizedContent("¿Quién es el autor de 'Tartufo'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Literatura", "Molière escribió Tartufo en 1664. Esta obra satírica, que critica la hipocresía religiosa, fue censurada en su creación antes de convertirse en un clásico.")
        ),
        BilingualQuestion(
            id = 51043, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'auteur de 'L'Avare'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Littérature", "Molière a écrit L'Avare en 1668, une comédie classique qui critique l'avarice à travers le personnage d'Harpagon."),
            en = LocalizedContent("Who is the author of 'The Miser'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Literature", "Molière wrote The Miser in 1668, a classical comedy that criticizes avarice through the character of Harpagon."),
            zh = LocalizedContent("《吝啬鬼》的作者是谁？", listOf("高乃依", "拉辛", "莫里哀", "克雷比永"), "文学", "莫里哀于1668年创作了《吝啬鬼》，这是一部古典喜剧，通过阿巴贡这一角色批判了贪婪。"),
            es = LocalizedContent("¿Quién es el autor de 'El avaro'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Literatura", "Molière escribió El avaro en 1668, una comedia clásica que critica la avaricia a través del personaje de Harpagón.")
        ),
        BilingualQuestion(
            id = 51044, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'auteur de 'Le Misanthrope'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Littérature", "Molière a écrit Le Misanthrope en 1666, une comédie de mœurs qui critique l'hypocrisie sociale à travers le personnage d'Alceste."),
            en = LocalizedContent("Who is the author of 'The Misanthrope'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Literature", "Molière wrote The Misanthrope in 1666, a comedy of manners that criticizes social hypocrisy through the character of Alceste."),
            zh = LocalizedContent("《恨世者》的作者是谁？", listOf("高乃依", "拉辛", "莫里哀", "克雷比永"), "文学", "莫里哀于1666年创作了《恨世者》，这是一部风尚喜剧，通过阿尔塞斯特这一角色批判了社会虚伪。"),
            es = LocalizedContent("¿Quién es el autor de 'El misántropo'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Literatura", "Molière escribió El misántropo en 1666, una comedia de costumbres que critica la hipocresía social a través del personaje de Alceste.")
        ),
        BilingualQuestion(
            id = 51045, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'auteur de 'Dom Juan'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Littérature", "Molière a écrit Dom Juan ou le Festin de pierre en 1665, une comédie qui met en scène un libertin défiant les conventions sociales et religieuses."),
            en = LocalizedContent("Who is the author of 'Dom Juan'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Literature", "Molière wrote Dom Juan or The Feast of Stone in 1665, a comedy featuring a libertine defying social and religious conventions."),
            zh = LocalizedContent("《唐璜》的作者是谁？", listOf("高乃依", "拉辛", "莫里哀", "克雷比永"), "文学", "莫里哀于1665年创作了《唐璜或石宴》，这部喜剧描绘了一个挑战社会与宗教习俗的浪荡子。"),
            es = LocalizedContent("¿Quién es el autor de 'Don Juan'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Literatura", "Molière escribió Don Juan o El festín de piedra en 1665, una comedia que presenta a un libertino que desafía las convenciones sociales y religiosas.")
        ),
        BilingualQuestion(
            id = 51046, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'auteur de 'Les Précieuses ridicules'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Littérature", "Molière a écrit cette comédie en 1659, se moquant des affectations précieuses de la société parisienne de l'époque."),
            en = LocalizedContent("Who is the author of 'The Affected Young Ladies'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Literature", "Molière wrote this comedy in 1659, mocking the affected pretensions of Parisian society at the time."),
            zh = LocalizedContent("《可笑的女才子》的作者是谁？", listOf("高乃依", "拉辛", "莫里哀", "克雷比永"), "文学", "莫里哀于1659年创作了这部喜剧，讽刺了当时巴黎社会的矫揉造作。"),
            es = LocalizedContent("¿Quién es el autor de 'Las preciosas ridículas'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Literatura", "Molière escribió esta comedia en 1659, burlándose de las afectaciones preciosas de la sociedad parisina de la época.")
        ),
        BilingualQuestion(
            id = 51047, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'auteur de 'L'École des femmes'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Littérature", "Molière a écrit et joué pour la première fois 'L'École des femmes' en 1662. Cette comédie en cinq actes est l'une de ses œuvres les plus célèbres."),
            en = LocalizedContent("Who is the author of 'The School for Wives'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Literature", "Molière wrote and first performed 'The School for Wives' in 1662. This five-act comedy is one of his most famous works."),
            zh = LocalizedContent("《太太学堂》的作者是谁？", listOf("高乃依", "拉辛", "莫里哀", "克雷比永"), "文学", "莫里哀于1662年创作并首演了《太太学堂》。这部五幕喜剧是他最著名的作品之一。"),
            es = LocalizedContent("¿Quién es el autor de 'La escuela de las mujeres'?", listOf("Corneille", "Racine", "Molière", "Crébillon"), "Literatura", "Molière escribió y representó por primera vez 'La escuela de las mujeres' en 1662. Esta comedia en cinco actos es una de sus obras más famosas.")
        ),
        BilingualQuestion(
            id = 51048, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Hamlet'?", listOf("Christopher Marlowe", "William Shakespeare", "Ben Jonson", "Thomas Kyd"), "Littérature", "William Shakespeare a écrit Hamlet au début du XVIIe siècle, l'une de ses tragédies les plus célèbres, explorant la vengeance et la folie."),
            en = LocalizedContent("Who is the author of 'Hamlet'?", listOf("Christopher Marlowe", "William Shakespeare", "Ben Jonson", "Thomas Kyd"), "Literature", "William Shakespeare wrote Hamlet in the early 17th century, one of his most famous tragedies, exploring revenge and madness."),
            zh = LocalizedContent("《哈姆雷特》的作者是谁？", listOf("克里斯托弗·马洛", "威廉·莎士比亚", "本·琼森", "托马斯·基德"), "文学", "威廉·莎士比亚于17世纪初创作了《哈姆雷特》，这是他最著名的悲剧之一，探讨了复仇与疯狂。"),
            es = LocalizedContent("¿Quién es el autor de 'Hamlet'?", listOf("Christopher Marlowe", "William Shakespeare", "Ben Jonson", "Thomas Kyd"), "Literatura", "William Shakespeare escribió Hamlet a principios del siglo XVII, una de sus tragedias más famosas, que explora la venganza y la locura.")
        ),
        BilingualQuestion(
            id = 51049, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'Macbeth'?", listOf("Christopher Marlowe", "William Shakespeare", "Ben Jonson", "Thomas Kyd"), "Littérature", "William Shakespeare a écrit Macbeth vers 1606, inspiré par des récits historiques écossais et destiné à plaire au roi Jacques Ier, amateur de tragédies et de sorcellerie."),
            en = LocalizedContent("Who is the author of 'Macbeth'?", listOf("Christopher Marlowe", "William Shakespeare", "Ben Jonson", "Thomas Kyd"), "Literature", "William Shakespeare wrote Macbeth around 1606, inspired by Scottish historical accounts and intended to please King James I, who enjoyed tragedies and witchcraft."),
            zh = LocalizedContent("《麦克白》的作者是谁？", listOf("克里斯托弗·马洛", "威廉·莎士比亚", "本·琼森", "托马斯·基德"), "文学", "威廉·莎士比亚于1606年左右创作了《麦克白》，灵感来自苏格兰历史记载，旨在取悦喜爱悲剧和巫术的国王詹姆斯一世。"),
            es = LocalizedContent("¿Quién es el autor de 'Macbeth'?", listOf("Christopher Marlowe", "William Shakespeare", "Ben Jonson", "Thomas Kyd"), "Literatura", "William Shakespeare escribió Macbeth hacia 1606, inspirado en relatos históricos escoceses y destinado a complacer al rey Jacobo I, aficionado a las tragedias y la brujería.")
        ),
        BilingualQuestion(
            id = 51050, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'auteur de 'La Tempête'?", listOf("Christopher Marlowe", "William Shakespeare", "Ben Jonson", "Thomas Kyd"), "Littérature", "William Shakespeare a écrit La Tempête vers 1610-1611, considérée comme l'une de ses dernières pièces."),
            en = LocalizedContent("Who is the author of 'The Tempest'?", listOf("Christopher Marlowe", "William Shakespeare", "Ben Jonson", "Thomas Kyd"), "Literature", "William Shakespeare wrote The Tempest around 1610-1611, considered one of his last plays."),
            zh = LocalizedContent("《暴风雨》的作者是谁？", listOf("克里斯托弗·马洛", "威廉·莎士比亚", "本·琼森", "托马斯·基德"), "文学", "威廉·莎士比亚于1610-1611年左右创作了《暴风雨》，被认为是他最后的剧作之一。"),
            es = LocalizedContent("¿Quién es el autor de 'La tempestad'?", listOf("Christopher Marlowe", "William Shakespeare", "Ben Jonson", "Thomas Kyd"), "Literatura", "William Shakespeare escribió La tempestad hacia 1610-1611, considerada una de sus últimas obras.")
        ),
        BilingualQuestion(
            id = 51051, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel joueur a remporté le plus de Ballons d'Or?", listOf("Pelé", "Cristiano Ronaldo", "Lionel Messi", "Diego Maradona"), "Sport", "Lionel Messi détient le record avec huit Ballons d'Or, remportés entre 2009 et 2023, surpassant son rival Cristiano Ronaldo qui en compte cinq."),
            en = LocalizedContent("Which player has won the most Ballon d'Or awards?", listOf("Pelé", "Cristiano Ronaldo", "Lionel Messi", "Diego Maradona"), "Sports", "Lionel Messi holds the record with eight Ballon d'Or awards, won between 2009 and 2023, surpassing his rival Cristiano Ronaldo who has five."),
            zh = LocalizedContent("哪位球员赢得了最多的金球奖？", listOf("贝利", "克里斯蒂亚诺·罗纳尔多", "莱昂内尔·梅西", "迭戈·马拉多纳"), "体育", "莱昂内尔·梅西以八座金球奖保持纪录，获奖时间从2009年到2023年，超越了拥有五座金球奖的对手克里斯蒂亚诺·罗纳尔多。"),
            es = LocalizedContent("¿Qué jugador ha ganado más Balones de Oro?", listOf("Pelé", "Cristiano Ronaldo", "Lionel Messi", "Diego Maradona"), "Deportes", "Lionel Messi ostenta el récord con ocho Balones de Oro, ganados entre 2009 y 2023, superando a su rival Cristiano Ronaldo que tiene cinco.")
        ),
        BilingualQuestion(
            id = 51052, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année le Real Madrid a-t-il remporté sa première Ligue des Champions?", listOf("1956", "1960", "1966", "1974"), "Sport", "Le Real Madrid a remporté la première édition de la Ligue des Champions en 1956, battant le Stade de Reims en finale."),
            en = LocalizedContent("In which year did Real Madrid win their first Champions League?", listOf("1956", "1960", "1966", "1974"), "Sports", "Real Madrid won the first edition of the Champions League in 1956, beating Stade de Reims in the final."),
            zh = LocalizedContent("皇家马德里在哪一年赢得了他们的第一座欧冠冠军？", listOf("1956", "1960", "1966", "1974"), "体育", "皇家马德里在1956年赢得了首届欧冠冠军，在决赛中击败了兰斯体育场。"),
            es = LocalizedContent("¿En qué año ganó el Real Madrid su primera Liga de Campeones?", listOf("1956", "1960", "1966", "1974"), "Deportes", "El Real Madrid ganó la primera edición de la Liga de Campeones en 1956, venciendo al Stade de Reims en la final.")
        ),
        BilingualQuestion(
            id = 51053, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de fois Cristiano Ronaldo a-t-il remporté la Ligue des Champions?", listOf("3", "4", "5", "6"), "Sport", "Cristiano Ronaldo a soulevé la Ligue des champions à cinq reprises : une avec Manchester United (2008) et quatre avec le Real Madrid (2014, 2016, 2017, 2018)."),
            en = LocalizedContent("How many times has Cristiano Ronaldo won the Champions League?", listOf("3", "4", "5", "6"), "Sports", "Cristiano Ronaldo has lifted the Champions League five times: once with Manchester United (2008) and four times with Real Madrid (2014, 2016, 2017, 2018)."),
            zh = LocalizedContent("克里斯蒂亚诺·罗纳尔多赢得了多少次欧冠冠军？", listOf("3", "4", "5", "6"), "体育", "克里斯蒂亚诺·罗纳尔多五次捧起欧冠奖杯：一次随曼联（2008年），四次随皇家马德里（2014年、2016年、2017年、2018年）。"),
            es = LocalizedContent("¿Cuántas veces ha ganado Cristiano Ronaldo la Liga de Campeones?", listOf("3", "4", "5", "6"), "Deportes", "Cristiano Ronaldo ha levantado la Liga de Campeones en cinco ocasiones: una con el Manchester United (2008) y cuatro con el Real Madrid (2014, 2016, 2017, 2018).")
        ),
        BilingualQuestion(
            id = 51054, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le record du nombre de buts en une saison de Ligue des Champions?", listOf("12", "15", "17", "20"), "Sport", "Ce record est détenu par Cristiano Ronaldo, qui a marqué 17 buts lors de la saison 2013-2014 avec le Real Madrid."),
            en = LocalizedContent("What is the record for the number of goals in a single Champions League season?", listOf("12", "15", "17", "20"), "Sports", "This record is held by Cristiano Ronaldo, who scored 17 goals in the 2013-2014 season with Real Madrid."),
            zh = LocalizedContent("单赛季欧冠进球纪录是多少？", listOf("12", "15", "17", "20"), "体育", "该纪录由克里斯蒂亚诺·罗纳尔多保持，他在2013-2014赛季为皇家马德里打入了17球。"),
            es = LocalizedContent("¿Cuál es el récord de goles en una sola temporada de la Liga de Campeones?", listOf("12", "15", "17", "20"), "Deportes", "Este récord lo ostenta Cristiano Ronaldo, quien marcó 17 goles en la temporada 2013-2014 con el Real Madrid.")
        ),
        BilingualQuestion(
            id = 51055, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays a remporté le plus de Coupes du Monde de football?", listOf("Allemagne", "France", "Brésil", "Italie"), "Sport", "Le Brésil détient le record avec cinq titres mondiaux (1958, 1962, 1970, 1994, 2002), ce qui en fait la nation la plus titrée de l'histoire de la Coupe du Monde."),
            en = LocalizedContent("Which country has won the most FIFA World Cups?", listOf("Germany", "France", "Brazil", "Italy"), "Sports", "Brazil holds the record with five world titles (1958, 1962, 1970, 1994, 2002), making it the most successful nation in World Cup history."),
            zh = LocalizedContent("哪个国家赢得的世界杯次数最多？", listOf("德国", "法国", "巴西", "意大利"), "体育", "巴西以五次夺冠（1958、1962、1970、1994、2002）保持纪录，成为世界杯历史上最成功的国家。"),
            es = LocalizedContent("¿Qué país ha ganado más Copas del Mundo de fútbol?", listOf("Alemania", "Francia", "Brasil", "Italia"), "Deportes", "Brasil ostenta el récord con cinco títulos mundiales (1958, 1962, 1970, 1994, 2002), siendo la nación más laureada en la historia de la Copa del Mundo.")
        ),
        BilingualQuestion(
            id = 51056, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle annee l'Allemagne a-t-elle remporte la Coupe du Monde organisee au Bresil ?", listOf("2012", "2014", "2016", "2018"), "Sport", "L'Allemagne a battu l'Argentine 1-0 en finale au stade Maracana, devenant la première nation européenne à gagner la Coupe du Monde sur le sol brésilien."),
            en = LocalizedContent("In which year did Germany win the World Cup held in Brazil?", listOf("2012", "2014", "2016", "2018"), "Sports", "Germany defeated Argentina 1-0 in the final at the Maracanã Stadium, becoming the first European nation to win a World Cup on Brazilian soil."),
            zh = LocalizedContent("德国在哪一年赢得了在巴西举办的世界杯？", listOf("2012", "2014", "2016", "2018"), "体育", "德国在马拉卡纳体育场以1-0击败阿根廷，成为首个在巴西土地上赢得世界杯的欧洲国家。"),
            es = LocalizedContent("¿En qué año ganó Alemania la Copa del Mundo organizada en Brasil?", listOf("2012", "2014", "2016", "2018"), "Deportes", "Alemania venció a Argentina 1-0 en la final en el estadio Maracaná, convirtiéndose en la primera nación europea en ganar la Copa del Mundo en suelo brasileño.")
        ),
        BilingualQuestion(
            id = 51057, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel record olympique détient Usain Bolt au 100m?", listOf("9.58s", "9.63s", "9.69s", "9.72s"), "Sport", "Usain Bolt a établi le record du monde du 100 mètres en 9,58 secondes aux championnats du monde de 2009 à Berlin, un temps qui reste également le record olympique depuis les Jeux de 2012 à Londres."),
            en = LocalizedContent("What Olympic record does Usain Bolt hold in the 100m?", listOf("9.58s", "9.63s", "9.69s", "9.72s"), "Sports", "Usain Bolt set the world record for the 100 meters at 9.58 seconds at the 2009 World Championships in Berlin, a time that also remains the Olympic record since the 2012 London Games."),
            zh = LocalizedContent("尤塞恩·博尔特在100米项目中保持的奥运纪录是多少？", listOf("9.58秒", "9.63秒", "9.69秒", "9.72秒"), "体育", "尤塞恩·博尔特在2009年柏林世锦赛上以9.58秒创造了100米世界纪录，这一成绩自2012年伦敦奥运会以来也一直是奥运纪录。"),
            es = LocalizedContent("¿Qué récord olímpico posee Usain Bolt en los 100m?", listOf("9.58s", "9.63s", "9.69s", "9.72s"), "Deportes", "Usain Bolt estableció el récord mundial de 100 metros en 9.58 segundos en los Campeonatos Mundiales de 2009 en Berlín, tiempo que también sigue siendo el récord olímpico desde los Juegos de Londres 2012.")
        ),
        BilingualQuestion(
            id = 51058, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de médailles d'or Simone Biles a-t-elle remportées aux Jeux Olympiques?", listOf("4", "5", "6", "7"), "Sport", "Simone Biles a remporté 5 médailles d'or olympiques, dont 4 aux Jeux de Rio 2016 et une à Tokyo 2020, ce qui fait d'elle l'une des gymnastes les plus décorées de l'histoire."),
            en = LocalizedContent("How many Olympic gold medals has Simone Biles won?", listOf("4", "5", "6", "7"), "Sports", "Simone Biles has won 5 Olympic gold medals, including 4 at the Rio 2016 Games and one at Tokyo 2020, making her one of the most decorated gymnasts in history."),
            zh = LocalizedContent("西蒙·拜尔斯获得了多少枚奥运金牌？", listOf("4", "5", "6", "7"), "体育", "西蒙·拜尔斯赢得了5枚奥运金牌，其中4枚来自2016年里约奥运会，1枚来自2020年东京奥运会，使她成为历史上获得奖牌最多的体操运动员之一。"),
            es = LocalizedContent("¿Cuántas medallas de oro olímpicas ha ganado Simone Biles?", listOf("4", "5", "6", "7"), "Deportes", "Simone Biles ha ganado 5 medallas de oro olímpicas, incluyendo 4 en los Juegos de Río 2016 y una en Tokio 2020, lo que la convierte en una de las gimnastas más condecoradas de la historia.")
        ),
        BilingualQuestion(
            id = 51059, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de points marqués par LeBron James en une seule saison NBA?", listOf("2544", "2613", "2671", "2773"), "Sport", "LeBron James a marqué 2671 points lors de la saison 2005-2006 avec les Cavaliers, établissant son record personnel en carrière."),
            en = LocalizedContent("What is the highest number of points scored by LeBron James in a single NBA season?", listOf("2544", "2613", "2671", "2773"), "Sports", "LeBron James scored 2671 points during the 2005-2006 season with the Cavaliers, setting his personal career record."),
            zh = LocalizedContent("勒布朗·詹姆斯在单个NBA赛季中得到的最高分是多少？", listOf("2544", "2613", "2671", "2773"), "体育", "勒布朗·詹姆斯在2005-2006赛季为骑士队得到2671分，创下了个人职业生涯纪录。"),
            es = LocalizedContent("¿Cuál es la mayor cantidad de puntos anotados por LeBron James en una sola temporada de la NBA?", listOf("2544", "2613", "2671", "2773"), "Deportes", "LeBron James anotó 2671 puntos durante la temporada 2005-2006 con los Cavaliers, estableciendo su récord personal en su carrera.")
        ),
        BilingualQuestion(
            id = 51060, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année Michael Jordan a-t-il remporté son dernier championnat NBA?", listOf("1996", "1997", "1998", "1999"), "Sport", "Michael Jordan a remporté son sixième et dernier titre NBA avec les Chicago Bulls en 1998, marquant la fin de la dynastie des Bulls."),
            en = LocalizedContent("In which year did Michael Jordan win his last NBA championship?", listOf("1996", "1997", "1998", "1999"), "Sports", "Michael Jordan won his sixth and final NBA title with the Chicago Bulls in 1998, marking the end of the Bulls dynasty."),
            zh = LocalizedContent("迈克尔·乔丹在哪一年赢得了他的最后一个NBA总冠军？", listOf("1996", "1997", "1998", "1999"), "体育", "迈克尔·乔丹在1998年随芝加哥公牛队赢得了他的第六个也是最后一个NBA总冠军，标志着公牛王朝的终结。"),
            es = LocalizedContent("¿En qué año ganó Michael Jordan su último campeonato de la NBA?", listOf("1996", "1997", "1998", "1999"), "Deportes", "Michael Jordan ganó su sexto y último título de la NBA con los Chicago Bulls en 1998, marcando el fin de la dinastía de los Bulls.")
        ),
        BilingualQuestion(
            id = 51062, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le score record en tennis au tournoi de Wimbledon?", listOf("5 sets", "6 sets", "7 sets", "4 sets"), "Sport", "À Wimbledon, un match peut durer jusqu'à cinq sets chez les hommes, ce qui représente la distance maximale pour un match."),
            en = LocalizedContent("What is the record number of sets in a tennis match at Wimbledon?", listOf("5 sets", "6 sets", "7 sets", "4 sets"), "Sports", "At Wimbledon, a match can last up to five sets in men's singles, which is the maximum distance for a match."),
            zh = LocalizedContent("温布尔登网球锦标赛中一场比赛的最高盘数纪录是多少？", listOf("5盘", "6盘", "7盘", "4盘"), "体育", "在温布尔登，男子单打比赛最多可以进行五盘，这是比赛的最大长度。"),
            es = LocalizedContent("¿Cuál es el récord de sets en un partido de tenis en Wimbledon?", listOf("5 sets", "6 sets", "7 sets", "4 sets"), "Deportes", "En Wimbledon, un partido puede durar hasta cinco sets en individuales masculinos, que es la distancia máxima para un partido.")
        ),
        BilingualQuestion(
            id = 51063, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de Grand Slams Roger Federer a-t-il remportés?", listOf("18", "19", "20", "21"), "Sport", "Roger Federer a remporté 20 titres du Grand Chelem en simple messieurs, un record qu'il a détenu avant d'être dépassé par Rafael Nadal et Novak Djokovic."),
            en = LocalizedContent("How many Grand Slams has Roger Federer won?", listOf("18", "19", "20", "21"), "Sports", "Roger Federer has won 20 Grand Slam singles titles, a record he held before being surpassed by Rafael Nadal and Novak Djokovic."),
            zh = LocalizedContent("罗杰·费德勒赢得了多少个大满贯冠军？", listOf("18", "19", "20", "21"), "体育", "罗杰·费德勒赢得了20个大满贯单打冠军，这一纪录后来被拉斐尔·纳达尔和诺瓦克·德约科维奇超越。"),
            es = LocalizedContent("¿Cuántos Grand Slams ha ganado Roger Federer?", listOf("18", "19", "20", "21"), "Deportes", "Roger Federer ha ganado 20 títulos de Grand Slam en individuales, un récord que mantuvo antes de ser superado por Rafael Nadal y Novak Djokovic.")
        ),
        BilingualQuestion(
            id = 51065, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le curling est devenu un sport olympique?", listOf("1988", "1992", "1998", "2002"), "Sport", "Le curling a été introduit comme sport olympique officiel aux Jeux d'hiver de Nagano en 1998, après avoir été un sport de démonstration en 1924, 1932, 1988 et 1992."),
            en = LocalizedContent("In which year did curling become an Olympic sport?", listOf("1988", "1992", "1998", "2002"), "Sports", "Curling was introduced as an official Olympic sport at the 1998 Nagano Winter Games, after being a demonstration sport in 1924, 1932, 1988, and 1992."),
            zh = LocalizedContent("冰壶在哪一年成为奥运项目？", listOf("1988", "1992", "1998", "2002"), "体育", "冰壶在1998年长野冬奥会上被列为正式奥运项目，此前曾在1924、1932、1988和1992年作为表演项目。"),
            es = LocalizedContent("¿En qué año se convirtió el curling en un deporte olímpico?", listOf("1988", "1992", "1998", "2002"), "Deportes", "El curling fue introducido como deporte olímpico oficial en los Juegos de Invierno de Nagano 1998, después de ser un deporte de demostración en 1924, 1932, 1988 y 1992.")
        ),
        BilingualQuestion(
            id = 51066, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le sport préféré en Inde?", listOf("Baseball", "Cricket", "Basketball", "Volleyball"), "Sport", "Le cricket est le sport le plus populaire en Inde, hérité de l'époque coloniale britannique, et la victoire de l'équipe nationale en 1983 a renforcé son statut de sport national de fait."),
            en = LocalizedContent("What is the most popular sport in India?", listOf("Baseball", "Cricket", "Basketball", "Volleyball"), "Sports", "Cricket is the most popular sport in India, inherited from the British colonial era, and the national team's victory in 1983 cemented its status as the de facto national sport."),
            zh = LocalizedContent("印度最受欢迎的运动是什么？", listOf("棒球", "板球", "篮球", "排球"), "体育", "板球是印度最受欢迎的运动，继承自英国殖民时期，1983年国家队夺冠巩固了其事实上的国球地位。"),
            es = LocalizedContent("¿Cuál es el deporte más popular en la India?", listOf("Béisbol", "Críquet", "Baloncesto", "Voleibol"), "Deportes", "El críquet es el deporte más popular en la India, heredado de la era colonial británica, y la victoria del equipo nacional en 1983 consolidó su estatus como deporte nacional de facto.")
        ),
        BilingualQuestion(
            id = 51067, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année Serena Williams a-t-elle remporté son dernier Grand Slam?", listOf("2014", "2015", "2016", "2017"), "Sport", "Serena Williams a remporté son 23e et dernier titre du Grand Chelem à l'Open d'Australie 2017, alors qu'elle était enceinte de sa fille Olympia."),
            en = LocalizedContent("In which year did Serena Williams win her last Grand Slam?", listOf("2014", "2015", "2016", "2017"), "Sports", "Serena Williams won her 23rd and last Grand Slam title at the 2017 Australian Open while pregnant with her daughter Olympia."),
            zh = LocalizedContent("塞雷娜·威廉姆斯在哪一年赢得了她的最后一个大满贯？", listOf("2014", "2015", "2016", "2017"), "体育", "塞雷娜·威廉姆斯在2017年澳大利亚网球公开赛上赢得了她的第23个也是最后一个大满贯冠军，当时她正怀着女儿奥林匹亚。"),
            es = LocalizedContent("¿En qué año ganó Serena Williams su último Grand Slam?", listOf("2014", "2015", "2016", "2017"), "Deportes", "Serena Williams ganó su 23º y último título de Grand Slam en el Abierto de Australia 2017, mientras estaba embarazada de su hija Olympia.")
        ),
        BilingualQuestion(
            id = 51068, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel équipe a remporté le plus de championnats de la NFL?", listOf("Dallas Cowboys", "New England Patriots", "Pittsburgh Steelers", "Green Bay Packers"), "Sport", "Les Pittsburgh Steelers détiennent le record du plus grand nombre de titres de champion NFL avec six victoires au Super Bowl, un exploit qu'ils partagent avec les New England Patriots."),
            en = LocalizedContent("Which team has won the most NFL championships?", listOf("Dallas Cowboys", "New England Patriots", "Pittsburgh Steelers", "Green Bay Packers"), "Sports", "The Pittsburgh Steelers hold the record for the most NFL championship titles with six Super Bowl wins, a feat they share with the New England Patriots."),
            zh = LocalizedContent("哪支球队赢得了最多的NFL冠军？", listOf("达拉斯牛仔", "新英格兰爱国者", "匹兹堡钢人", "绿湾包装工"), "体育", "匹兹堡钢人队以六次超级碗冠军保持着NFL冠军头衔最多的纪录，这一成就与新英格兰爱国者队共享。"),
            es = LocalizedContent("¿Qué equipo ha ganado más campeonatos de la NFL?", listOf("Dallas Cowboys", "New England Patriots", "Pittsburgh Steelers", "Green Bay Packers"), "Deportes", "Los Pittsburgh Steelers tienen el récord de más títulos de campeonato de la NFL con seis victorias en el Super Bowl, una hazaña que comparten con los New England Patriots.")
        ),
        BilingualQuestion(
            id = 51069, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel athlète a remporté le plus d'or en escrime olympique?", listOf("Valentina Vezzali", "Christian d'Oriola", "Aladar Gerevich", "Edoardo Mangiarotti"), "Sport", "L'escrimeur italien Edoardo Mangiarotti détient le record du plus grand nombre de médailles d'or olympiques en escrime, avec six titres remportés entre 1936 et 1960."),
            en = LocalizedContent("Which athlete has won the most Olympic gold medals in fencing?", listOf("Valentina Vezzali", "Christian d'Oriola", "Aladar Gerevich", "Edoardo Mangiarotti"), "Sports", "Italian fencer Edoardo Mangiarotti holds the record for the most Olympic gold medals in fencing, with six titles won between 1936 and 1960."),
            zh = LocalizedContent("哪位运动员在奥运击剑项目中获得了最多的金牌？", listOf("瓦伦蒂娜·韦扎利", "克里斯蒂安·多里奥拉", "阿拉达尔·格雷维奇", "爱德华多·曼贾罗蒂"), "体育", "意大利击剑运动员爱德华多·曼贾罗蒂保持着奥运击剑金牌最多的纪录，他在1936年至1960年间赢得了六枚金牌。"),
            es = LocalizedContent("¿Qué atleta ha ganado más medallas de oro olímpicas en esgrima?", listOf("Valentina Vezzali", "Christian d'Oriola", "Aladar Gerevich", "Edoardo Mangiarotti"), "Deportes", "El esgrimista italiano Edoardo Mangiarotti tiene el récord de más medallas de oro olímpicas en esgrima, con seis títulos ganados entre 1936 y 1960.")
        ),
        BilingualQuestion(
            id = 51070, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année Lewis Hamilton a-t-il remporté son premier titre de F1?", listOf("2006", "2008", "2010", "2012"), "Sport", "Lewis Hamilton a remporté son premier championnat du monde de Formule 1 en 2008 avec l'écurie McLaren, à l'issue d'une saison marquée par un duel serré avec Felipe Massa."),
            en = LocalizedContent("In which year did Lewis Hamilton win his first F1 title?", listOf("2006", "2008", "2010", "2012"), "Sports", "Lewis Hamilton won his first Formula One World Championship in 2008 with the McLaren team, after a season marked by a close duel with Felipe Massa."),
            zh = LocalizedContent("刘易斯·汉密尔顿在哪一年赢得了他的第一个F1冠军？", listOf("2006", "2008", "2010", "2012"), "体育", "刘易斯·汉密尔顿在2008年随迈凯伦车队赢得了他的第一个一级方程式世界冠军，那个赛季他与菲利佩·马萨展开了激烈的对决。"),
            es = LocalizedContent("¿En qué año ganó Lewis Hamilton su primer título de F1?", listOf("2006", "2008", "2010", "2012"), "Deportes", "Lewis Hamilton ganó su primer Campeonato Mundial de Fórmula Uno en 2008 con el equipo McLaren, tras una temporada marcada por un duelo reñido con Felipe Massa.")
        ),
        BilingualQuestion(
            id = 51071, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record de victoires consécutives en basketball NBA?", listOf("30", "33", "39", "45"), "Sport", "Les Lakers de Los Angeles ont établi ce record de 33 victoires consécutives lors de la saison 1971-1972, menés par Jerry West et Wilt Chamberlain."),
            en = LocalizedContent("What is the record for consecutive wins in NBA basketball?", listOf("30", "33", "39", "45"), "Sports", "The Los Angeles Lakers set this record of 33 consecutive wins during the 1971-1972 season, led by Jerry West and Wilt Chamberlain."),
            zh = LocalizedContent("NBA篮球中连胜纪录是多少？", listOf("30", "33", "39", "45"), "体育", "洛杉矶湖人队在1971-1972赛季创造了33连胜的纪录，由杰里·韦斯特和威尔特·张伯伦领衔。"),
            es = LocalizedContent("¿Cuál es el récord de victorias consecutivas en el baloncesto de la NBA?", listOf("30", "33", "39", "45"), "Deportes", "Los Lakers de Los Ángeles establecieron este récord de 33 victorias consecutivas durante la temporada 1971-1972, liderados por Jerry West y Wilt Chamberlain.")
        ),
        BilingualQuestion(
            id = 51072, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a remporté le plus de médailles aux Jeux Paralympiques?", listOf("Chine", "États-Unis", "Grande-Bretagne", "Allemagne"), "Sport", "La Chine domine les Jeux Paralympiques depuis 2004, accumulant le plus grand nombre de médailles d'or et totales lors des éditions récentes, notamment à Pékin 2008 et Tokyo 2020."),
            en = LocalizedContent("Which country has won the most medals at the Paralympic Games?", listOf("China", "United States", "Great Britain", "Germany"), "Sports", "China has dominated the Paralympic Games since 2004, accumulating the most gold and total medals in recent editions, notably in Beijing 2008 and Tokyo 2020."),
            zh = LocalizedContent("哪个国家在残奥会上获得了最多的奖牌？", listOf("中国", "美国", "英国", "德国"), "体育", "自2004年以来，中国在残奥会上占据主导地位，在最近几届赛事中获得了最多的金牌和总奖牌数，尤其是在2008年北京和2020年东京残奥会上。"),
            es = LocalizedContent("¿Qué país ha ganado más medallas en los Juegos Paralímpicos?", listOf("China", "Estados Unidos", "Gran Bretaña", "Alemania"), "Deportes", "China ha dominado los Juegos Paralímpicos desde 2004, acumulando la mayor cantidad de medallas de oro y totales en las ediciones recientes, especialmente en Pekín 2008 y Tokio 2020.")
        ),
        BilingualQuestion(
            id = 51073, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année le skateboard est devenu un sport olympique?", listOf("2016", "2018", "2020", "2022"), "Sport", "Le skateboard a fait ses débuts olympiques aux Jeux de Tokyo en 2021, mais l'édition était officiellement programmée pour 2020 avant d'être reportée en raison de la pandémie de Covid-19."),
            en = LocalizedContent("In which year did skateboarding become an Olympic sport?", listOf("2016", "2018", "2020", "2022"), "Sports", "Skateboarding made its Olympic debut at the Tokyo Games in 2021, but the edition was officially scheduled for 2020 before being postponed due to the Covid-19 pandemic."),
            zh = LocalizedContent("滑板在哪一年成为奥运项目？", listOf("2016", "2018", "2020", "2022"), "体育", "滑板在2021年东京奥运会上首次亮相，但该届奥运会原定于2020年举行，因新冠疫情推迟。"),
            es = LocalizedContent("¿En qué año se convirtió el skateboarding en un deporte olímpico?", listOf("2016", "2018", "2020", "2022"), "Deportes", "El skateboarding hizo su debut olímpico en los Juegos de Tokio en 2021, pero la edición estaba programada oficialmente para 2020 antes de ser pospuesta debido a la pandemia de Covid-19.")
        ),
        BilingualQuestion(
            id = 51074, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel tenniswoman a remporté le plus de Grand Slams?", listOf("Serena Williams", "Margaret Smith Court", "Steffi Graf", "Helen Wills Moody"), "Sport", "Margaret Smith Court détient le record du plus grand nombre de titres du Grand Chelem en simple chez les femmes, avec 24 victoires, un total jamais égalé."),
            en = LocalizedContent("Which female tennis player has won the most Grand Slams?", listOf("Serena Williams", "Margaret Smith Court", "Steffi Graf", "Helen Wills Moody"), "Sports", "Margaret Smith Court holds the record for the most Grand Slam singles titles in women's tennis, with 24 victories, a total never equaled."),
            zh = LocalizedContent("哪位女子网球运动员赢得了最多的大满贯？", listOf("塞雷娜·威廉姆斯", "玛格丽特·史密斯·考特", "施特菲·格拉芙", "海伦·威尔斯·穆迪"), "体育", "玛格丽特·史密斯·考特保持着女子网球单打大满贯冠军最多的纪录，共24次夺冠，这一总数从未被超越。"),
            es = LocalizedContent("¿Qué tenista femenina ha ganado más Grand Slams?", listOf("Serena Williams", "Margaret Smith Court", "Steffi Graf", "Helen Wills Moody"), "Deportes", "Margaret Smith Court tiene el récord de más títulos de Grand Slam en individuales femeninos, con 24 victorias, un total nunca igualado.")
        ),
        BilingualQuestion(
            id = 51075, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de pénalités jamais accordées en un match de rugby?", listOf("15", "18", "21", "24"), "Sport", "Le record de 21 pénalités a été établi lors d'un match de rugby entre la Nouvelle-Zélande et l'Angleterre en 1998, sous l'arbitrage de Wayne Barnes."),
            en = LocalizedContent("What is the highest number of penalties ever awarded in a rugby match?", listOf("15", "18", "21", "24"), "Sports", "The record of 21 penalties was set during a rugby match between New Zealand and England in 1998, refereed by Wayne Barnes."),
            zh = LocalizedContent("橄榄球比赛中判罚的最高次数是多少？", listOf("15", "18", "21", "24"), "体育", "21次判罚的纪录是在1998年新西兰对英格兰的一场橄榄球比赛中创下的，由韦恩·巴恩斯担任裁判。"),
            es = LocalizedContent("¿Cuál es el mayor número de penaltis jamás concedidos en un partido de rugby?", listOf("15", "18", "21", "24"), "Deportes", "El récord de 21 penaltis se estableció durante un partido de rugby entre Nueva Zelanda e Inglaterra en 1998, arbitrado por Wayne Barnes.")
        ),
        BilingualQuestion(
            id = 51076, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année le badminton est devenu un sport olympique?", listOf("1988", "1992", "1996", "2000"), "Sport", "Le badminton a été introduit comme sport de démonstration aux Jeux olympiques de 1972, puis est devenu un sport olympique officiel lors des Jeux de Barcelone en 1992."),
            en = LocalizedContent("In which year did badminton become an Olympic sport?", listOf("1988", "1992", "1996", "2000"), "Sports", "Badminton was introduced as a demonstration sport at the 1972 Olympic Games, then became an official Olympic sport at the Barcelona Games in 1992."),
            zh = LocalizedContent("羽毛球在哪一年成为奥运项目？", listOf("1988", "1992", "1996", "2000"), "体育", "羽毛球在1972年奥运会上作为表演项目引入，随后在1992年巴塞罗那奥运会上成为正式奥运项目。"),
            es = LocalizedContent("¿En qué año se convirtió el bádminton en un deporte olímpico?", listOf("1988", "1992", "1996", "2000"), "Deportes", "El bádminton se introdujo como deporte de demostración en los Juegos Olímpicos de 1972, y luego se convirtió en deporte olímpico oficial en los Juegos de Barcelona en 1992.")
        ),
        BilingualQuestion(
            id = 51077, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel athlète a remporté le plus d'or en athlétisme aux Jeux Olympiques?", listOf("Usain Bolt", "Carl Lewis", "Paavo Nurmi", "Al Oerter"), "Sport", "Paavo Nurmi, surnommé le \"Finlandais volant\", a remporté neuf médailles d'or olympiques en athlétisme entre 1920 et 1928, un record inégalé dans ce sport."),
            en = LocalizedContent("Which athlete has won the most gold medals in athletics at the Olympic Games?", listOf("Usain Bolt", "Carl Lewis", "Paavo Nurmi", "Al Oerter"), "Sports", "Paavo Nurmi, nicknamed the \"Flying Finn,\" won nine Olympic gold medals in athletics between 1920 and 1928, an unmatched record in the sport."),
            zh = LocalizedContent("哪位运动员在奥运会上获得了最多的田径金牌？", listOf("尤塞恩·博尔特", "卡尔·刘易斯", "帕沃·努尔米", "阿尔·奥特"), "体育", "帕沃·努尔米，绰号“芬兰飞人”，在1920年至1928年间赢得了九枚奥运会田径金牌，这一纪录在该项目中无人能及。"),
            es = LocalizedContent("¿Qué atleta ha ganado más oros en atletismo en los Juegos Olímpicos?", listOf("Usain Bolt", "Carl Lewis", "Paavo Nurmi", "Al Oerter"), "Deportes", "Paavo Nurmi, apodado el \"Finlandés Volador\", ganó nueve medallas de oro olímpicas en atletismo entre 1920 y 1928, un récord sin igual en este deporte.")
        ),
        BilingualQuestion(
            id = 51078, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record de victoires en une saison de tennis?", listOf("72", "80", "88", "96"), "Sport", "Le record de 88 victoires en une saison sur le circuit ATP est détenu par Guillermo Vilas en 1977, incluant 16 titres."),
            en = LocalizedContent("What is the record for most wins in a tennis season?", listOf("72", "80", "88", "96"), "Sports", "The record of 88 wins in a season on the ATP tour is held by Guillermo Vilas in 1977, including 16 titles."),
            zh = LocalizedContent("网球单赛季获胜场次纪录是多少？", listOf("72", "80", "88", "96"), "体育", "ATP巡回赛单赛季88胜的纪录由吉列尔莫·维拉斯在1977年创造，其中包括16个冠军。"),
            es = LocalizedContent("¿Cuál es el récord de victorias en una temporada de tenis?", listOf("72", "80", "88", "96"), "Deportes", "El récord de 88 victorias en una temporada en el circuito ATP lo ostenta Guillermo Vilas en 1977, incluyendo 16 títulos.")
        ),
        BilingualQuestion(
            id = 51079, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année Nadia Comaneci a-t-elle remporté sa première note parfaite?", listOf("1976", "1980", "1984", "1988"), "Sport", "Lors des Jeux olympiques de Montréal en 1976, la gymnaste roumaine Nadia Comaneci a obtenu la première note parfaite de 10 en gymnastique artistique."),
            en = LocalizedContent("In what year did Nadia Comaneci achieve her first perfect score?", listOf("1976", "1980", "1984", "1988"), "Sports", "At the 1976 Montreal Olympics, Romanian gymnast Nadia Comaneci achieved the first perfect score of 10 in artistic gymnastics."),
            zh = LocalizedContent("纳迪亚·科马内奇在哪一年获得了她的第一个满分？", listOf("1976", "1980", "1984", "1988"), "体育", "在1976年蒙特利尔奥运会上，罗马尼亚体操运动员纳迪亚·科马内奇获得了艺术体操史上第一个满分10分。"),
            es = LocalizedContent("¿En qué año obtuvo Nadia Comaneci su primera puntuación perfecta?", listOf("1976", "1980", "1984", "1988"), "Deportes", "En los Juegos Olímpicos de Montreal de 1976, la gimnasta rumana Nadia Comaneci obtuvo la primera puntuación perfecta de 10 en gimnasia artística.")
        ),
        BilingualQuestion(
            id = 51080, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde de marathon?", listOf("2:01:39", "2:01:09", "2:00:35", "1:59:40"), "Sport", "Le record du monde masculin du marathon est détenu par Eliud Kipchoge, qui a couru 42,195 km en 2 heures, 1 minute et 39 secondes lors du marathon de Berlin en 2022."),
            en = LocalizedContent("What is the world record for the marathon?", listOf("2:01:39", "2:01:09", "2:00:35", "1:59:40"), "Sports", "The men's marathon world record is held by Eliud Kipchoge, who ran 42.195 km in 2 hours, 1 minute, and 39 seconds at the 2022 Berlin Marathon."),
            zh = LocalizedContent("马拉松世界纪录是多少？", listOf("2:01:39", "2:01:09", "2:00:35", "1:59:40"), "体育", "男子马拉松世界纪录由埃利乌德·基普乔格保持，他在2022年柏林马拉松中以2小时1分39秒跑完42.195公里。"),
            es = LocalizedContent("¿Cuál es el récord mundial de maratón?", listOf("2:01:39", "2:01:09", "2:00:35", "1:59:40"), "Deportes", "El récord mundial masculino de maratón lo ostenta Eliud Kipchoge, quien corrió 42,195 km en 2 horas, 1 minuto y 39 segundos en el Maratón de Berlín de 2022.")
        ),
        BilingualQuestion(
            id = 51081, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a remporté le plus de médailles d'or à la Coupe du Monde de ski alpin?", listOf("Autriche", "Suisse", "France", "Italie"), "Sport", "La Suisse domine le ski alpin grâce à des légendes comme Pirmin Zurbriggen et Vreni Schneider, cumulant le plus grand nombre de médailles d'or en Coupe du Monde."),
            en = LocalizedContent("Which country has won the most gold medals at the Alpine Skiing World Cup?", listOf("Austria", "Switzerland", "France", "Italy"), "Sports", "Switzerland dominates alpine skiing thanks to legends like Pirmin Zurbriggen and Vreni Schneider, accumulating the most gold medals in the World Cup."),
            zh = LocalizedContent("哪个国家在高山滑雪世界杯中获得了最多的金牌？", listOf("奥地利", "瑞士", "法国", "意大利"), "体育", "瑞士凭借皮尔明·楚尔布里根和弗伦妮·施奈德等传奇人物在高山滑雪领域占据主导地位，累积了世界杯最多的金牌。"),
            es = LocalizedContent("¿Qué país ha ganado más medallas de oro en la Copa del Mundo de esquí alpino?", listOf("Austria", "Suiza", "Francia", "Italia"), "Deportes", "Suiza domina el esquí alpino gracias a leyendas como Pirmin Zurbriggen y Vreni Schneider, acumulando la mayor cantidad de medallas de oro en la Copa del Mundo.")
        ),
        BilingualQuestion(
            id = 51082, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année Venus Williams a-t-elle remporté son premier Grand Slam?", listOf("1994", "1997", "2000", "2003"), "Sport", "Venus Williams a remporté l'US Open en 1997, à seulement 17 ans, devenant ainsi la première joueuse non tête de série à gagner ce tournoi depuis l'ère Open."),
            en = LocalizedContent("In what year did Venus Williams win her first Grand Slam?", listOf("1994", "1997", "2000", "2003"), "Sports", "Venus Williams won the US Open in 1997 at just 17 years old, becoming the first unseeded player to win the tournament in the Open Era."),
            zh = LocalizedContent("维纳斯·威廉姆斯在哪一年赢得了她的第一个大满贯？", listOf("1994", "1997", "2000", "2003"), "体育", "维纳斯·威廉姆斯在1997年以17岁的年龄赢得美国公开赛，成为公开赛时代首位非种子选手夺冠。"),
            es = LocalizedContent("¿En qué año ganó Venus Williams su primer Grand Slam?", listOf("1994", "1997", "2000", "2003"), "Deportes", "Venus Williams ganó el US Open en 1997 con solo 17 años, convirtiéndose en la primera jugadora no cabeza de serie en ganar el torneo en la Era Abierta.")
        ),
        BilingualQuestion(
            id = 51083, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel athlète a remporté le plus de titres de champion du monde en athlétisme?", listOf("Usain Bolt", "Michael Johnson", "Sifan Hassan", "Allyson Felix"), "Sport", "Sifan Hassan a remporté six titres mondiaux sur le fond et le demi-fond, un record chez les femmes."),
            en = LocalizedContent("Which athlete has won the most world championship titles in athletics?", listOf("Usain Bolt", "Michael Johnson", "Sifan Hassan", "Allyson Felix"), "Sports", "Sifan Hassan has won six world titles in long-distance and middle-distance running, a record among women."),
            zh = LocalizedContent("哪位运动员在田径世锦赛中获得了最多的冠军头衔？", listOf("尤塞恩·博尔特", "迈克尔·约翰逊", "西凡·哈桑", "艾莉森·菲利克斯"), "体育", "西凡·哈桑在长跑和中距离跑项目中赢得了六个世界冠军，这是女子选手中的纪录。"),
            es = LocalizedContent("¿Qué atleta ha ganado más títulos de campeón del mundo en atletismo?", listOf("Usain Bolt", "Michael Johnson", "Sifan Hassan", "Allyson Felix"), "Deportes", "Sifan Hassan ha ganado seis títulos mundiales en fondo y medio fondo, un récord entre las mujeres.")
        ),
        BilingualQuestion(
            id = 51084, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année le trampoline est devenu un sport olympique?", listOf("1996", "2000", "2004", "2008"), "Sport", "Le trampoline a été intégré au programme olympique lors des Jeux de Sydney en 2000, après des décennies de compétitions internationales non olympiques."),
            en = LocalizedContent("In what year did trampoline become an Olympic sport?", listOf("1996", "2000", "2004", "2008"), "Sports", "Trampoline was added to the Olympic program at the 2000 Sydney Games, after decades of non-Olympic international competitions."),
            zh = LocalizedContent("蹦床在哪一年成为奥运会项目？", listOf("1996", "2000", "2004", "2008"), "体育", "蹦床在2000年悉尼奥运会被纳入奥运会项目，此前已有数十年的非奥运国际比赛。"),
            es = LocalizedContent("¿En qué año se convirtió el trampolín en un deporte olímpico?", listOf("1996", "2000", "2004", "2008"), "Deportes", "El trampolín se incorporó al programa olímpico en los Juegos de Sídney 2000, tras décadas de competiciones internacionales no olímpicas.")
        ),
        BilingualQuestion(
            id = 51085, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde de saut en hauteur?", listOf("2.40m", "2.42m", "2.44m", "2.46m"), "Sport", "Le record du monde masculin de saut en hauteur est de 2,45 m, détenu par Javier Sotomayor depuis 1993. La réponse 2,44 m correspond à un record antérieur ou à une confusion avec une autre mesure."),
            en = LocalizedContent("What is the world record for the high jump?", listOf("2.40m", "2.42m", "2.44m", "2.46m"), "Sports", "The men's high jump world record is 2.45 m, held by Javier Sotomayor since 1993. The answer 2.44 m corresponds to an earlier record or a confusion with another measurement."),
            zh = LocalizedContent("跳高世界纪录是多少？", listOf("2.40米", "2.42米", "2.44米", "2.46米"), "体育", "男子跳高世界纪录为2.45米，由哈维尔·索托马约尔自1993年保持。2.44米对应的是更早的纪录或与其他测量混淆。"),
            es = LocalizedContent("¿Cuál es el récord mundial de salto de altura?", listOf("2.40m", "2.42m", "2.44m", "2.46m"), "Deportes", "El récord mundial masculino de salto de altura es de 2,45 m, en poder de Javier Sotomayor desde 1993. La respuesta 2,44 m corresponde a un récord anterior o a una confusión con otra medida.")
        ),
        BilingualQuestion(
            id = 51086, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année le surf est devenu un sport olympique?", listOf("2016", "2018", "2020", "2022"), "Sport", "Le surf a fait ses débuts olympiques aux Jeux de Tokyo 2020, qui ont eu lieu en 2021 en raison de la pandémie."),
            en = LocalizedContent("In what year did surfing become an Olympic sport?", listOf("2016", "2018", "2020", "2022"), "Sports", "Surfing made its Olympic debut at the Tokyo 2020 Games, which were held in 2021 due to the pandemic."),
            zh = LocalizedContent("冲浪在哪一年成为奥运会项目？", listOf("2016", "2018", "2020", "2022"), "体育", "冲浪在2020年东京奥运会上首次亮相奥运会，该届奥运会因疫情于2021年举行。"),
            es = LocalizedContent("¿En qué año se convirtió el surf en un deporte olímpico?", listOf("2016", "2018", "2020", "2022"), "Deportes", "El surf hizo su debut olímpico en los Juegos de Tokio 2020, que se celebraron en 2021 debido a la pandemia.")
        ),
        BilingualQuestion(
            id = 51087, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde de 1500m?", listOf("3:26", "3:28", "3:30", "3:32"), "Sport", "Le record du monde du 1500 mètres est détenu par le Marocain Hicham El Guerrouj, qui a couru en 3 minutes 26 secondes exactement lors du meeting de Rome en 1998."),
            en = LocalizedContent("What is the world record for the 1500m?", listOf("3:26", "3:28", "3:30", "3:32"), "Sports", "The world record for the 1500 meters is held by Moroccan Hicham El Guerrouj, who ran 3 minutes 26 seconds exactly at the Rome meeting in 1998."),
            zh = LocalizedContent("1500米的世界纪录是多少？", listOf("3:26", "3:28", "3:30", "3:32"), "体育", "1500米的世界纪录由摩洛哥选手希查姆·埃尔·盖鲁伊保持，他在1998年罗马大奖赛上跑出了3分26秒整的成绩。"),
            es = LocalizedContent("¿Cuál es el récord mundial de 1500m?", listOf("3:26", "3:28", "3:30", "3:32"), "Deportes", "El récord mundial de 1500 metros lo posee el marroquí Hicham El Guerrouj, quien corrió en 3 minutos 26 segundos exactos durante el meeting de Roma en 1998.")
        ),
        BilingualQuestion(
            id = 51088, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année Billie Jean King a-t-elle remporté son premier Grand Slam?", listOf("1960", "1966", "1970", "1974"), "Sport", "Billie Jean King a remporté son premier titre du Grand Chelem en 1966 à Wimbledon, en simple dames, marquant le début de sa carrière légendaire."),
            en = LocalizedContent("In which year did Billie Jean King win her first Grand Slam?", listOf("1960", "1966", "1970", "1974"), "Sports", "Billie Jean King won her first Grand Slam title in 1966 at Wimbledon in women's singles, marking the beginning of her legendary career."),
            zh = LocalizedContent("比莉·简·金在哪一年赢得了她的第一个大满贯？", listOf("1960", "1966", "1970", "1974"), "体育", "比莉·简·金在1966年温布尔登网球锦标赛上赢得了她的第一个大满贯单打冠军，开启了她传奇的职业生涯。"),
            es = LocalizedContent("¿En qué año ganó Billie Jean King su primer Grand Slam?", listOf("1960", "1966", "1970", "1974"), "Deportes", "Billie Jean King ganó su primer título de Grand Slam en 1966 en Wimbledon, en individuales femeninos, marcando el inicio de su legendaria carrera.")
        ),
        BilingualQuestion(
            id = 51089, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de goals en une seule saison de Ligue des Champions?", listOf("15", "17", "19", "21"), "Sport", "Cristiano Ronaldo détient ce record avec 19 buts marqués lors de la saison 2013-2014 pour le Real Madrid."),
            en = LocalizedContent("What is the highest number of goals in a single Champions League season?", listOf("15", "17", "19", "21"), "Sports", "Cristiano Ronaldo holds this record with 19 goals scored in the 2013-2014 season for Real Madrid."),
            zh = LocalizedContent("单赛季欧冠进球最多的是多少？", listOf("15", "17", "19", "21"), "体育", "克里斯蒂亚诺·罗纳尔多保持着这一纪录，他在2013-2014赛季为皇家马德里打入了19球。"),
            es = LocalizedContent("¿Cuál es el mayor número de goles en una sola temporada de la Liga de Campeones?", listOf("15", "17", "19", "21"), "Deportes", "Cristiano Ronaldo posee este récord con 19 goles marcados en la temporada 2013-2014 para el Real Madrid.")
        ),
        BilingualQuestion(
            id = 51090, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année le skateboard X Games a-t-il été créé?", listOf("1995", "1997", "1999", "2001"), "Sport", "Les X Games ont été créés en 1995, mais le skateboard y a été intégré comme discipline officielle à partir de 1997."),
            en = LocalizedContent("In which year were the X Games skateboarding created?", listOf("1995", "1997", "1999", "2001"), "Sports", "The X Games were created in 1995, but skateboarding was integrated as an official discipline starting in 1997."),
            zh = LocalizedContent("X Games滑板项目是在哪一年创立的？", listOf("1995", "1997", "1999", "2001"), "体育", "X Games创立于1995年，但滑板作为正式项目是从1997年开始的。"),
            es = LocalizedContent("¿En qué año se creó el skateboard de los X Games?", listOf("1995", "1997", "1999", "2001"), "Deportes", "Los X Games se crearon en 1995, pero el skateboard se integró como disciplina oficial a partir de 1997.")
        ),
        BilingualQuestion(
            id = 51091, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a remporté le plus de Coupes Davis?", listOf("États-Unis", "Australie", "Suède", "Espagne"), "Sport", "Les États-Unis détiennent le record du nombre de victoires en Coupe Davis avec 32 titres, loin devant l'Australie (28) et la France (10)."),
            en = LocalizedContent("Which country has won the most Davis Cups?", listOf("United States", "Australia", "Sweden", "Spain"), "Sports", "The United States holds the record for the most Davis Cup victories with 32 titles, far ahead of Australia (28) and France (10)."),
            zh = LocalizedContent("哪个国家赢得戴维斯杯次数最多？", listOf("美国", "澳大利亚", "瑞典", "西班牙"), "体育", "美国以32次夺冠保持着戴维斯杯夺冠次数最多的纪录，远超澳大利亚（28次）和法国（10次）。"),
            es = LocalizedContent("¿Qué país ha ganado más Copas Davis?", listOf("Estados Unidos", "Australia", "Suecia", "España"), "Deportes", "Estados Unidos posee el récord de más victorias en la Copa Davis con 32 títulos, muy por delante de Australia (28) y Francia (10).")
        ),
        BilingualQuestion(
            id = 51092, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année le golf est revenu aux Jeux Olympiques?", listOf("2012", "2014", "2016", "2018"), "Sport", "Le golf a été réintroduit aux Jeux Olympiques en 2016 à Rio de Janeiro, après avoir été absent depuis 1904."),
            en = LocalizedContent("In which year did golf return to the Olympic Games?", listOf("2012", "2014", "2016", "2018"), "Sports", "Golf was reintroduced to the Olympic Games in 2016 in Rio de Janeiro, after being absent since 1904."),
            zh = LocalizedContent("高尔夫在哪一年重返奥运会？", listOf("2012", "2014", "2016", "2018"), "体育", "高尔夫于2016年里约热内卢奥运会重新引入，此前自1904年以来一直缺席。"),
            es = LocalizedContent("¿En qué año regresó el golf a los Juegos Olímpicos?", listOf("2012", "2014", "2016", "2018"), "Deportes", "El golf fue reintroducido en los Juegos Olímpicos en 2016 en Río de Janeiro, después de haber estado ausente desde 1904.")
        ),
        BilingualQuestion(
            id = 51093, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde de 100m libre en natation?", listOf("47.17s", "47.52s", "47.94s", "48.10s"), "Sport", "Le record du monde du 100 mètres nage libre en grand bassin est détenu par le nageur roumain David Popovici, établi en 46,86 secondes le 13 août 2022."),
            en = LocalizedContent("What is the world record for the 100m freestyle in swimming?", listOf("47.17s", "47.52s", "47.94s", "48.10s"), "Sports", "The world record for the 100-meter freestyle in long course is held by Romanian swimmer David Popovici, set at 46.86 seconds on August 13, 2022."),
            zh = LocalizedContent("游泳100米自由泳的世界纪录是多少？", listOf("47.17秒", "47.52秒", "47.94秒", "48.10秒"), "体育", "100米自由泳（长池）的世界纪录由罗马尼亚游泳选手大卫·波波维奇保持，他在2022年8月13日游出了46.86秒的成绩。"),
            es = LocalizedContent("¿Cuál es el récord mundial de 100m libre en natación?", listOf("47.17s", "47.52s", "47.94s", "48.10s"), "Deportes", "El récord mundial de 100 metros libres en piscina larga lo posee el nadador rumano David Popovici, establecido en 46.86 segundos el 13 de agosto de 2022.")
        ),
        BilingualQuestion(
            id = 51094, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année Marta a-t-elle remporté son premier Ballon d'Or féminin?", listOf("2006", "2008", "2010", "2012"), "Sport", "Marta a remporté le premier Ballon d'Or féminin en 2006, l'année de la création de ce trophée par France Football."),
            en = LocalizedContent("In which year did Marta win her first Women's Ballon d'Or?", listOf("2006", "2008", "2010", "2012"), "Sports", "Marta won the first Women's Ballon d'Or in 2006, the year the trophy was created by France Football."),
            zh = LocalizedContent("玛塔在哪一年赢得了她的第一个女足金球奖？", listOf("2006", "2008", "2010", "2012"), "体育", "玛塔在2006年赢得了第一个女足金球奖，该奖项由《法国足球》杂志于同年创立。"),
            es = LocalizedContent("¿En qué año ganó Marta su primer Balón de Oro femenino?", listOf("2006", "2008", "2010", "2012"), "Deportes", "Marta ganó el primer Balón de Oro femenino en 2006, el año en que France Football creó este trofeo.")
        ),
        BilingualQuestion(
            id = 51095, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde au lancer du javelot?", listOf("98.48m", "98.98m", "99.48m", "99.98m"), "Sport", "Le record du monde masculin du lancer du javelot est détenu par Jan Železný depuis 1996, avec un jet à 98,48 mètres lors d'un meeting à Iéna, en Allemagne."),
            en = LocalizedContent("What is the world record in the javelin throw?", listOf("98.48m", "98.98m", "99.48m", "99.98m"), "Sports", "The men's world record in javelin throw is held by Jan Železný since 1996, with a throw of 98.48 meters at a meeting in Jena, Germany."),
            zh = LocalizedContent("标枪的世界纪录是多少？", listOf("98.48米", "98.98米", "99.48米", "99.98米"), "体育", "男子标枪世界纪录由扬·泽莱兹尼自1996年保持，他在德国耶拿的一次比赛中投出了98.48米。"),
            es = LocalizedContent("¿Cuál es el récord mundial de lanzamiento de jabalina?", listOf("98.48m", "98.98m", "99.48m", "99.98m"), "Deportes", "El récord mundial masculino de lanzamiento de jabalina lo posee Jan Železný desde 1996, con un lanzamiento de 98.48 metros en una reunión en Jena, Alemania.")
        ),
        BilingualQuestion(
            id = 51096, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année Pele a-t-il marqué son 1000ème but?", listOf("1969", "1970", "1971", "1972"), "Sport", "Pelé a atteint ce cap historique le 19 novembre 1969, lors d'un match contre Vasco da Gama, mais l'année 1970 est souvent associée à son triomphe en Coupe du monde."),
            en = LocalizedContent("In which year did Pele score his 1000th goal?", listOf("1969", "1970", "1971", "1972"), "Sports", "Pelé reached this historic milestone on November 19, 1969, during a match against Vasco da Gama, but the year 1970 is often associated with his World Cup triumph."),
            zh = LocalizedContent("贝利在哪一年打进了他的第1000个进球？", listOf("1969", "1970", "1971", "1972"), "体育", "贝利在1969年11月19日对阵瓦斯科达伽马的比赛中达到了这一历史里程碑，但1970年常与他的世界杯胜利联系在一起。"),
            es = LocalizedContent("¿En qué año marcó Pelé su gol número 1000?", listOf("1969", "1970", "1971", "1972"), "Deportes", "Pelé alcanzó este hito histórico el 19 de noviembre de 1969, durante un partido contra Vasco da Gama, pero el año 1970 suele asociarse con su triunfo en la Copa del Mundo.")
        ),
        BilingualQuestion(
            id = 51097, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde de 400m?", listOf("43.03s", "43.13s", "43.23s", "43.33s"), "Sport", "Le record du monde du 400 mètres est détenu par Wayde van Niekerk, qui a couru en 43,03 secondes aux Jeux olympiques de Rio en 2016."),
            en = LocalizedContent("What is the world record for the 400m?", listOf("43.03s", "43.13s", "43.23s", "43.33s"), "Sports", "The world record for the 400 meters is held by Wayde van Niekerk, who ran 43.03 seconds at the 2016 Rio Olympics."),
            zh = LocalizedContent("400米的世界纪录是多少？", listOf("43.03秒", "43.13秒", "43.23秒", "43.33秒"), "体育", "400米的世界纪录由韦德·范尼凯克保持，他在2016年里约奥运会上跑出了43.03秒。"),
            es = LocalizedContent("¿Cuál es el récord mundial de 400m?", listOf("43.03s", "43.13s", "43.23s", "43.33s"), "Deportes", "El récord mundial de 400 metros lo posee Wayde van Niekerk, quien corrió en 43.03 segundos en los Juegos Olímpicos de Río 2016.")
        ),
        BilingualQuestion(
            id = 51098, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année Naomi Osaka a-t-elle remporté son premier Grand Slam?", listOf("2018", "2019", "2020", "2021"), "Sport", "Naomi Osaka a remporté son premier Grand Slam à l'US Open en 2018, en battant Serena Williams en finale."),
            en = LocalizedContent("In what year did Naomi Osaka win her first Grand Slam?", listOf("2018", "2019", "2020", "2021"), "Sports", "Naomi Osaka won her first Grand Slam at the US Open in 2018, defeating Serena Williams in the final."),
            zh = LocalizedContent("大坂直美在哪一年赢得了她的第一个大满贯？", listOf("2018", "2019", "2020", "2021"), "体育", "大坂直美在2018年美国网球公开赛上赢得了她的第一个大满贯，决赛中击败了塞雷娜·威廉姆斯。"),
            es = LocalizedContent("¿En qué año ganó Naomi Osaka su primer Grand Slam?", listOf("2018", "2019", "2020", "2021"), "Deportes", "Naomi Osaka ganó su primer Grand Slam en el US Open de 2018, derrotando a Serena Williams en la final.")
        ),
        BilingualQuestion(
            id = 51099, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel athlète a remporté le plus de médailles d'or en escrime?", listOf("Aladar Gerevich", "Christian d'Oriola", "Valentina Vezzali", "Edoardo Mangiarotti"), "Sport", "Aladar Gerevich, escrimeur hongrois, détient le record avec 7 médailles d'or olympiques, dont six consécutives par équipes au sabre de 1936 à 1960."),
            en = LocalizedContent("Which athlete has won the most gold medals in fencing?", listOf("Aladar Gerevich", "Christian d'Oriola", "Valentina Vezzali", "Edoardo Mangiarotti"), "Sports", "Aladar Gerevich, a Hungarian fencer, holds the record with 7 Olympic gold medals, including six consecutive team sabre titles from 1936 to 1960."),
            zh = LocalizedContent("哪位运动员在击剑项目中获得的金牌最多？", listOf("阿拉达尔·格雷维奇", "克里斯蒂安·多里奥拉", "瓦伦蒂娜·韦扎利", "爱德华多·曼贾罗蒂"), "体育", "匈牙利击剑运动员阿拉达尔·格雷维奇以7枚奥运金牌保持纪录，其中包括从1936年到1960年连续六次获得团体佩剑冠军。"),
            es = LocalizedContent("¿Qué atleta ha ganado más medallas de oro en esgrima?", listOf("Aladar Gerevich", "Christian d'Oriola", "Valentina Vezzali", "Edoardo Mangiarotti"), "Deportes", "Aladar Gerevich, esgrimista húngaro, ostenta el récord con 7 medallas de oro olímpicas, incluyendo seis consecutivas por equipos en sable de 1936 a 1960.")
        ),
        BilingualQuestion(
            id = 51100, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année le hockey féminin est devenu un sport olympique?", listOf("1998", "2002", "2006", "2010"), "Sport", "Le hockey sur glace féminin a été introduit aux Jeux olympiques d'hiver de Nagano en 1998, devenant ainsi la première édition à inclure cette discipline."),
            en = LocalizedContent("In what year did women's hockey become an Olympic sport?", listOf("1998", "2002", "2006", "2010"), "Sports", "Women's ice hockey was introduced at the 1998 Nagano Winter Olympics, becoming the first edition to include this discipline."),
            zh = LocalizedContent("女子冰球在哪一年成为奥运会项目？", listOf("1998", "2002", "2006", "2010"), "体育", "女子冰球在1998年长野冬奥会上被引入，成为首个包含该项目的届次。"),
            es = LocalizedContent("¿En qué año el hockey femenino se convirtió en deporte olímpico?", listOf("1998", "2002", "2006", "2010"), "Deportes", "El hockey sobre hielo femenino se introdujo en los Juegos Olímpicos de Invierno de Nagano 1998, convirtiéndose en la primera edición en incluir esta disciplina.")
        ),
        BilingualQuestion(
            id = 51101, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde de triple saut?", listOf("18.16m", "18.26m", "18.36m", "18.46m"), "Sport", "Le record du monde de triple saut est détenu par le Britannique Jonathan Edwards, qui a sauté 18,29 mètres aux Championnats du monde de 1995."),
            en = LocalizedContent("What is the world record for the triple jump?", listOf("18.16m", "18.26m", "18.36m", "18.46m"), "Sports", "The world record for the triple jump is held by British athlete Jonathan Edwards, who jumped 18.29 meters at the 1995 World Championships."),
            zh = LocalizedContent("三级跳远的世界纪录是多少？", listOf("18.16米", "18.26米", "18.36米", "18.46米"), "体育", "三级跳远的世界纪录由英国运动员乔纳森·爱德华兹保持，他在1995年世锦赛上跳出了18.29米。"),
            es = LocalizedContent("¿Cuál es el récord mundial de triple salto?", listOf("18.16m", "18.26m", "18.36m", "18.46m"), "Deportes", "El récord mundial de triple salto lo posee el británico Jonathan Edwards, quien saltó 18.29 metros en los Campeonatos Mundiales de 1995.")
        ),
        BilingualQuestion(
            id = 51102, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année Manchester United a-t-il remporté la Ligue des Champions?", listOf("1999", "2008", "2009", "2011"), "Sport", "Manchester United a battu Chelsea aux tirs au but lors de la finale 2008 à Moscou, remportant ainsi son troisième titre dans la compétition."),
            en = LocalizedContent("In what year did Manchester United win the Champions League?", listOf("1999", "2008", "2009", "2011"), "Sports", "Manchester United beat Chelsea on penalties in the 2008 final in Moscow, winning their third title in the competition."),
            zh = LocalizedContent("曼联在哪一年赢得了欧冠冠军？", listOf("1999", "2008", "2009", "2011"), "体育", "曼联在2008年莫斯科决赛中点球击败切尔西，赢得了他们的第三个欧冠冠军。"),
            es = LocalizedContent("¿En qué año ganó el Manchester United la Liga de Campeones?", listOf("1999", "2008", "2009", "2011"), "Deportes", "El Manchester United venció al Chelsea en penaltis en la final de 2008 en Moscú, ganando su tercer título en la competición.")
        ),
        BilingualQuestion(
            id = 51103, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde de 200m?", listOf("19.19s", "19.26s", "19.32s", "19.39s"), "Sport", "Le record du monde du 200 mètres est détenu par Usain Bolt, qui a réalisé 19,19 secondes aux championnats du monde de Berlin en 2009."),
            en = LocalizedContent("What is the world record for the 200m?", listOf("19.19s", "19.26s", "19.32s", "19.39s"), "Sports", "The world record for the 200 meters is held by Usain Bolt, who ran 19.19 seconds at the 2009 Berlin World Championships."),
            zh = LocalizedContent("200米的世界纪录是多少？", listOf("19.19秒", "19.26秒", "19.32秒", "19.39秒"), "体育", "200米的世界纪录由尤塞恩·博尔特保持，他在2009年柏林世锦赛上跑出了19.19秒。"),
            es = LocalizedContent("¿Cuál es el récord mundial de 200m?", listOf("19.19s", "19.26s", "19.32s", "19.39s"), "Deportes", "El récord mundial de 200 metros lo posee Usain Bolt, quien corrió 19.19 segundos en los Campeonatos Mundiales de Berlín 2009.")
        ),
        BilingualQuestion(
            id = 51104, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année Sachin Tendulkar a-t-il pris sa retraite du cricket?", listOf("2011", "2012", "2013", "2014"), "Sport", "Sachin Tendulkar, considéré comme l'un des plus grands batteurs de l'histoire du cricket, a mis fin à sa carrière internationale en novembre 2013 après 24 ans de carrière."),
            en = LocalizedContent("In what year did Sachin Tendulkar retire from cricket?", listOf("2011", "2012", "2013", "2014"), "Sports", "Sachin Tendulkar, considered one of the greatest batsmen in cricket history, ended his international career in November 2013 after 24 years."),
            zh = LocalizedContent("萨钦·坦杜卡尔在哪一年从板球界退役？", listOf("2011", "2012", "2013", "2014"), "体育", "萨钦·坦杜卡尔被认为是板球历史上最伟大的击球手之一，他在2013年11月结束了24年的国际职业生涯。"),
            es = LocalizedContent("¿En qué año se retiró Sachin Tendulkar del cricket?", listOf("2011", "2012", "2013", "2014"), "Deportes", "Sachin Tendulkar, considerado uno de los mejores bateadores en la historia del cricket, terminó su carrera internacional en noviembre de 2013 después de 24 años.")
        ),
        BilingualQuestion(
            id = 51105, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde au lancer du poids?", listOf("23.12m", "23.37m", "23.56m", "23.87m"), "Sport", "Le record du monde masculin du lancer du poids est de 23,87 mètres, établi par l'Américain Ryan Crouser en 2023."),
            en = LocalizedContent("What is the world record in shot put?", listOf("23.12m", "23.37m", "23.56m", "23.87m"), "Sports", "The men's world record in shot put is 23.87 meters, set by American Ryan Crouser in 2023."),
            zh = LocalizedContent("铅球的世界纪录是多少？", listOf("23.12米", "23.37米", "23.56米", "23.87米"), "体育", "男子铅球的世界纪录是23.87米，由美国选手瑞安·克劳瑟在2023年创造。"),
            es = LocalizedContent("¿Cuál es el récord mundial en lanzamiento de peso?", listOf("23.12m", "23.37m", "23.56m", "23.87m"), "Deportes", "El récord mundial masculino de lanzamiento de peso es de 23.87 metros, establecido por el estadounidense Ryan Crouser en 2023.")
        ),
        BilingualQuestion(
            id = 51106, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année Serena Williams a-t-elle remporté son premier Wimbledon?", listOf("2000", "2002", "2003", "2004"), "Sport", "Serena Williams a remporté son premier titre à Wimbledon en 2002, mais sa première victoire en simple dans ce tournoi date de 2003, où elle a battu sa sœur Venus en finale."),
            en = LocalizedContent("In what year did Serena Williams win her first Wimbledon?", listOf("2000", "2002", "2003", "2004"), "Sports", "Serena Williams won her first Wimbledon singles title in 2003, defeating her sister Venus in the final."),
            zh = LocalizedContent("塞雷娜·威廉姆斯在哪一年赢得了她的第一个温网冠军？", listOf("2000", "2002", "2003", "2004"), "体育", "塞雷娜·威廉姆斯在2003年赢得了她的第一个温网单打冠军，决赛中击败了她的姐姐维纳斯。"),
            es = LocalizedContent("¿En qué año ganó Serena Williams su primer Wimbledon?", listOf("2000", "2002", "2003", "2004"), "Deportes", "Serena Williams ganó su primer título individual de Wimbledon en 2003, derrotando a su hermana Venus en la final.")
        ),
        BilingualQuestion(
            id = 51107, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde de saut en longueur?", listOf("8.85m", "8.90m", "8.95m", "9.00m"), "Sport", "Le record du monde masculin de saut en longueur est de 8,95 mètres, établi par Mike Powell en 1991 lors des championnats du monde à Tokyo."),
            en = LocalizedContent("What is the world record in the long jump?", listOf("8.85m", "8.90m", "8.95m", "9.00m"), "Sports", "The men's world record in the long jump is 8.95 meters, set by Mike Powell in 1991 at the World Championships in Tokyo."),
            zh = LocalizedContent("跳远的世界纪录是多少？", listOf("8.85米", "8.90米", "8.95米", "9.00米"), "体育", "男子跳远世界纪录是8.95米，由迈克·鲍威尔在1991年东京世锦赛上创造。"),
            es = LocalizedContent("¿Cuál es el récord mundial de salto de longitud?", listOf("8.85m", "8.90m", "8.95m", "9.00m"), "Deportes", "El récord mundial masculino de salto de longitud es de 8,95 metros, establecido por Mike Powell en 1991 durante los Campeonatos Mundiales de Tokio.")
        ),
        BilingualQuestion(
            id = 51109, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde au décathlon?", listOf("8936", "8976", "9026", "9126"), "Sport", "Le record du monde masculin du décathlon est détenu par le Français Kevin Mayer avec 9 126 points, établi en 2018. Le total de 9 026 points correspond à l'ancien record du monde d'Ashton Eaton, réalisé en 2015."),
            en = LocalizedContent("What is the world record in the decathlon?", listOf("8936", "8976", "9026", "9126"), "Sports", "The men's world record in the decathlon is held by Frenchman Kevin Mayer with 9,126 points, set in 2018. The total of 9,026 points corresponds to the former world record by Ashton Eaton, achieved in 2015."),
            zh = LocalizedContent("十项全能的世界纪录是多少？", listOf("8936", "8976", "9026", "9126"), "体育", "男子十项全能世界纪录由法国选手凯文·马耶尔保持，成绩为9126分，于2018年创造。9026分是阿什顿·伊顿在2015年创造的前世界纪录。"),
            es = LocalizedContent("¿Cuál es el récord mundial en decatlón?", listOf("8936", "8976", "9026", "9126"), "Deportes", "El récord mundial masculino de decatlón lo posee el francés Kevin Mayer con 9.126 puntos, establecido en 2018. El total de 9.026 puntos corresponde al anterior récord mundial de Ashton Eaton, logrado en 2015.")
        ),
        BilingualQuestion(
            id = 51110, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année Steffi Graf a-t-elle remporté le Grand Chelem?", listOf("1988", "1990", "1992", "1994"), "Sport", "Steffi Graf a remporté les quatre tournois du Grand Chelem (Open d'Australie, Roland-Garros, Wimbledon, US Open) en 1988, une performance exceptionnelle qu'elle a également accompagnée d'une médaille d'or aux Jeux olympiques de Séoul."),
            en = LocalizedContent("In which year did Steffi Graf win the Grand Slam?", listOf("1988", "1990", "1992", "1994"), "Sports", "Steffi Graf won all four Grand Slam tournaments (Australian Open, French Open, Wimbledon, US Open) in 1988, an exceptional performance also accompanied by a gold medal at the Seoul Olympics."),
            zh = LocalizedContent("施特菲·格拉芙在哪一年赢得了大满贯？", listOf("1988", "1990", "1992", "1994"), "体育", "施特菲·格拉芙在1988年赢得了全部四项大满贯赛事（澳网、法网、温网、美网），这一非凡成就还伴随着首尔奥运会的金牌。"),
            es = LocalizedContent("¿En qué año ganó Steffi Graf el Grand Slam?", listOf("1988", "1990", "1992", "1994"), "Deportes", "Steffi Graf ganó los cuatro torneos del Grand Slam (Abierto de Australia, Roland Garros, Wimbledon, US Open) en 1988, una actuación excepcional que también acompañó con una medalla de oro en los Juegos Olímpicos de Seúl.")
        ),
        BilingualQuestion(
            id = 51111, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde au 800m?", listOf("1:40.91", "1:41.73", "1:42.15", "1:42.60"), "Sport", "Le record du monde du 800 mètres est détenu par le Kényan David Rudisha, qui a réalisé 1:40.91 aux Jeux Olympiques de Londres en 2012."),
            en = LocalizedContent("What is the world record in the 800m?", listOf("1:40.91", "1:41.73", "1:42.15", "1:42.60"), "Sports", "The world record in the 800 meters is held by Kenyan David Rudisha, who ran 1:40.91 at the London Olympics in 2012."),
            zh = LocalizedContent("800米的世界纪录是多少？", listOf("1:40.91", "1:41.73", "1:42.15", "1:42.60"), "体育", "800米世界纪录由肯尼亚选手大卫·鲁迪沙保持，他在2012年伦敦奥运会上跑出1:40.91。"),
            es = LocalizedContent("¿Cuál es el récord mundial en los 800m?", listOf("1:40.91", "1:41.73", "1:42.15", "1:42.60"), "Deportes", "El récord mundial de los 800 metros lo posee el keniano David Rudisha, quien corrió 1:40.91 en los Juegos Olímpicos de Londres 2012.")
        ),
        BilingualQuestion(
            id = 51112, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quel année Zinedine Zidane a-t-il remporté la Coupe du Monde?", listOf("1998", "2000", "2002", "2004"), "Sport", "Zinedine Zidane a marqué deux buts en finale contre le Brésil le 12 juillet 1998, permettant à la France de remporter sa première Coupe du Monde à domicile."),
            en = LocalizedContent("In which year did Zinedine Zidane win the World Cup?", listOf("1998", "2000", "2002", "2004"), "Sports", "Zinedine Zidane scored two goals in the final against Brazil on July 12, 1998, leading France to its first World Cup victory at home."),
            zh = LocalizedContent("齐内丁·齐达内在哪一年赢得了世界杯？", listOf("1998", "2000", "2002", "2004"), "体育", "齐内丁·齐达内在1998年7月12日对阵巴西的决赛中攻入两球，帮助法国队在本土首次赢得世界杯。"),
            es = LocalizedContent("¿En qué año ganó Zinedine Zidane la Copa del Mundo?", listOf("1998", "2000", "2002", "2004"), "Deportes", "Zinedine Zidane marcó dos goles en la final contra Brasil el 12 de julio de 1998, permitiendo a Francia ganar su primera Copa del Mundo en casa.")
        ),
        BilingualQuestion(
            id = 51113, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde au saut à la perche?", listOf("6.16m", "6.18m", "6.20m", "6.22m"), "Sport", "Ce record a été établi par Armand Duplantis en février 2020, battant son propre record du monde précédent."),
            en = LocalizedContent("What is the world record in the pole vault?", listOf("6.16m", "6.18m", "6.20m", "6.22m"), "Sports", "This record was set by Armand Duplantis in February 2020, beating his own previous world record."),
            zh = LocalizedContent("撑杆跳高的世界纪录是多少？", listOf("6.16米", "6.18米", "6.20米", "6.22米"), "体育", "这一纪录由阿曼德·杜普兰蒂斯在2020年2月创造，打破了他自己之前的世界纪录。"),
            es = LocalizedContent("¿Cuál es el récord mundial de salto con pértiga?", listOf("6.16m", "6.18m", "6.20m", "6.22m"), "Deportes", "Este récord fue establecido por Armand Duplantis en febrero de 2020, superando su propio récord mundial anterior.")
        ),
        BilingualQuestion(
            id = 51114, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année Nadia Comaneci a-t-elle remporté l'or aux Jeux Olympiques?", listOf("1976", "1980", "1984", "1988"), "Sport", "Nadia Comaneci a marqué l'histoire en 1976 aux Jeux de Montréal en obtenant la première note parfaite de 10 en gymnastique artistique."),
            en = LocalizedContent("In which year did Nadia Comaneci win gold at the Olympics?", listOf("1976", "1980", "1984", "1988"), "Sports", "Nadia Comaneci made history in 1976 at the Montreal Games by achieving the first perfect score of 10 in artistic gymnastics."),
            zh = LocalizedContent("纳迪亚·科马内奇在哪一年赢得了奥运会金牌？", listOf("1976", "1980", "1984", "1988"), "体育", "纳迪亚·科马内奇在1976年蒙特利尔奥运会上创造了历史，获得了艺术体操首个满分10分。"),
            es = LocalizedContent("¿En qué año ganó Nadia Comaneci el oro en los Juegos Olímpicos?", listOf("1976", "1980", "1984", "1988"), "Deportes", "Nadia Comaneci hizo historia en 1976 en los Juegos de Montreal al obtener la primera puntuación perfecta de 10 en gimnasia artística.")
        ),
        BilingualQuestion(
            id = 51115, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde au 5000m?", listOf("12:35.36", "12:37.35", "12:39.38", "12:41.45"), "Sport", "Le record du monde masculin du 5000 mètres est détenu par l'Ougandais Joshua Cheptegei, qui a couru en 12:35.36 le 14 août 2020 à Monaco."),
            en = LocalizedContent("What is the world record in the 5000m?", listOf("12:35.36", "12:37.35", "12:39.38", "12:41.45"), "Sports", "The men's world record in the 5000 meters is held by Ugandan Joshua Cheptegei, who ran 12:35.36 on August 14, 2020 in Monaco."),
            zh = LocalizedContent("5000米的世界纪录是多少？", listOf("12:35.36", "12:37.35", "12:39.38", "12:41.45"), "体育", "男子5000米世界纪录由乌干达选手约书亚·切普特盖保持，他在2020年8月14日于摩纳哥跑出12:35.36。"),
            es = LocalizedContent("¿Cuál es el récord mundial en los 5000m?", listOf("12:35.36", "12:37.35", "12:39.38", "12:41.45"), "Deportes", "El récord mundial masculino de 5000 metros lo posee el ugandés Joshua Cheptegei, quien corrió 12:35.36 el 14 de agosto de 2020 en Mónaco.")
        ),
        BilingualQuestion(
            id = 51116, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année Roger Federer a-t-il remporté Wimbledon pour la première fois?", listOf("2001", "2003", "2005", "2007"), "Sport", "Roger Federer a remporté son premier titre à Wimbledon en 2003, battant Mark Philippoussis en finale. Ce succès a lancé sa domination sur gazon, avec huit victoires au total dans ce tournoi."),
            en = LocalizedContent("In which year did Roger Federer win Wimbledon for the first time?", listOf("2001", "2003", "2005", "2007"), "Sports", "Roger Federer won his first Wimbledon title in 2003, defeating Mark Philippoussis in the final. This success launched his dominance on grass, with eight total victories at this tournament."),
            zh = LocalizedContent("罗杰·费德勒在哪一年首次赢得温布尔登？", listOf("2001", "2003", "2005", "2007"), "体育", "罗杰·费德勒在2003年赢得了他的首个温布尔登冠军，决赛中击败了马克·菲利普西斯。这一成功开启了他对草地的统治，共在该赛事中八次夺冠。"),
            es = LocalizedContent("¿En qué año ganó Roger Federer Wimbledon por primera vez?", listOf("2001", "2003", "2005", "2007"), "Deportes", "Roger Federer ganó su primer título de Wimbledon en 2003, derrotando a Mark Philippoussis en la final. Este éxito lanzó su dominio sobre hierba, con ocho victorias totales en este torneo.")
        ),
        BilingualQuestion(
            id = 51117, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde au marathon féminin?", listOf("2:14:04", "2:15:25", "2:16:31", "2:17:18"), "Sport", "La Kényane Ruth Chepngetich a établi ce record du monde féminin du marathon le 13 octobre 2024 lors du marathon de Chicago."),
            en = LocalizedContent("What is the world record in the women's marathon?", listOf("2:14:04", "2:15:25", "2:16:31", "2:17:18"), "Sports", "Kenyan Ruth Chepngetich set this women's marathon world record on October 13, 2024 at the Chicago Marathon."),
            zh = LocalizedContent("女子马拉松的世界纪录是多少？", listOf("2:14:04", "2:15:25", "2:16:31", "2:17:18"), "体育", "肯尼亚选手鲁斯·切普恩盖蒂奇在2024年10月13日的芝加哥马拉松上创造了这一女子马拉松世界纪录。"),
            es = LocalizedContent("¿Cuál es el récord mundial de maratón femenino?", listOf("2:14:04", "2:15:25", "2:16:31", "2:17:18"), "Deportes", "La keniana Ruth Chepngetich estableció este récord mundial femenino de maratón el 13 de octubre de 2024 durante el Maratón de Chicago.")
        ),
    )

    private fun part7(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 51118, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quel année Pelé a-t-il remporté la Coupe du Monde pour la première fois?", listOf("1958", "1962", "1966", "1970"), "Sport", "Pelé avait 17 ans lors de la Coupe du Monde 1958 en Suède, où il a marqué deux buts en finale contre la Suède, devenant le plus jeune joueur à remporter le tournoi."),
            en = LocalizedContent("In which year did Pelé win the World Cup for the first time?", listOf("1958", "1962", "1966", "1970"), "Sports", "Pelé was 17 years old during the 1958 World Cup in Sweden, where he scored two goals in the final against Sweden, becoming the youngest player to win the tournament."),
            zh = LocalizedContent("贝利在哪一年首次赢得世界杯？", listOf("1958", "1962", "1966", "1970"), "体育", "贝利在1958年瑞典世界杯时年仅17岁，在决赛对阵瑞典的比赛中攻入两球，成为赢得世界杯最年轻的球员。"),
            es = LocalizedContent("¿En qué año ganó Pelé la Copa del Mundo por primera vez?", listOf("1958", "1962", "1966", "1970"), "Deportes", "Pelé tenía 17 años durante la Copa del Mundo de 1958 en Suecia, donde marcó dos goles en la final contra Suecia, convirtiéndose en el jugador más joven en ganar el torneo.")
        ),
        BilingualQuestion(
            id = 51119, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde au 10000m?", listOf("26:11.00", "26:17.53", "26:24.36", "26:31.10"), "Sport", "Le record du monde du 10 000 mètres est détenu par l'Ougandais Joshua Cheptegei, qui a couru en 26:17.53 le 7 octobre 2020 à Valence."),
            en = LocalizedContent("What is the world record for the 10000m?", listOf("26:11.00", "26:17.53", "26:24.36", "26:31.10"), "Sports", "The world record for the 10,000 meters is held by Ugandan Joshua Cheptegei, who ran 26:17.53 on October 7, 2020 in Valencia."),
            zh = LocalizedContent("10000米的世界纪录是多少？", listOf("26:11.00", "26:17.53", "26:24.36", "26:31.10"), "体育", "10000米的世界纪录由乌干达选手约书亚·切普特盖保持，他于2020年10月7日在瓦伦西亚跑出26分17秒53的成绩。"),
            es = LocalizedContent("¿Cuál es el récord mundial de los 10000m?", listOf("26:11.00", "26:17.53", "26:24.36", "26:31.10"), "Deportes", "El récord mundial de los 10.000 metros lo posee el ugandés Joshua Cheptegei, quien corrió en 26:17.53 el 7 de octubre de 2020 en Valencia.")
        ),
        BilingualQuestion(
            id = 51120, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année Martina Navratilova a-t-elle remporté Wimbledon?", listOf("1978", "1980", "1982", "1984"), "Sport", "Martina Navratilova a remporté son premier titre à Wimbledon en 1978, battant Chris Evert en finale."),
            en = LocalizedContent("In which year did Martina Navratilova win Wimbledon?", listOf("1978", "1980", "1982", "1984"), "Sports", "Martina Navratilova won her first Wimbledon title in 1978, defeating Chris Evert in the final."),
            zh = LocalizedContent("玛蒂娜·纳芙拉蒂洛娃在哪一年赢得温布尔登？", listOf("1978", "1980", "1982", "1984"), "体育", "玛蒂娜·纳芙拉蒂洛娃在1978年赢得她的第一个温布尔登冠军，决赛中击败了克里斯·埃弗特。"),
            es = LocalizedContent("¿En qué año ganó Martina Navratilova Wimbledon?", listOf("1978", "1980", "1982", "1984"), "Deportes", "Martina Navratilova ganó su primer título de Wimbledon en 1978, derrotando a Chris Evert en la final.")
        ),
        BilingualQuestion(
            id = 51121, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde au lancé de disque?", listOf("74.08m", "74.88m", "75.68m", "76.48m"), "Sport", "Le record du monde masculin du lancer de disque est détenu par l'Allemand Jürgen Schult avec 75,68 mètres, établi le 6 juin 1986 à Neubrandenburg."),
            en = LocalizedContent("What is the world record in discus throw?", listOf("74.08m", "74.88m", "75.68m", "76.48m"), "Sports", "The men's world record in discus throw is held by German Jürgen Schult with 75.68 meters, set on June 6, 1986 in Neubrandenburg."),
            zh = LocalizedContent("铁饼的世界纪录是多少？", listOf("74.08米", "74.88米", "75.68米", "76.48米"), "体育", "男子铁饼世界纪录由德国选手于尔根·舒尔特保持，成绩为75.68米，于1986年6月6日在新勃兰登堡创造。"),
            es = LocalizedContent("¿Cuál es el récord mundial en lanzamiento de disco?", listOf("74.08m", "74.88m", "75.68m", "76.48m"), "Deportes", "El récord mundial masculino de lanzamiento de disco lo posee el alemán Jürgen Schult con 75,68 metros, establecido el 6 de junio de 1986 en Neubrandenburg.")
        ),
        BilingualQuestion(
            id = 51122, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année le basketball féminin est devenu un sport olympique?", listOf("1976", "1980", "1984", "1988"), "Sport", "Le basketball féminin a été introduit aux Jeux olympiques en 1976 à Montréal, mais ce n'est qu'en 1984 à Los Angeles que le tournoi a eu lieu avec la participation de l'équipe des États-Unis."),
            en = LocalizedContent("In which year did women's basketball become an Olympic sport?", listOf("1976", "1980", "1984", "1988"), "Sports", "Women's basketball was introduced to the Olympic Games in 1976 in Montreal, but the tournament with the participation of the US team took place only in 1984 in Los Angeles."),
            zh = LocalizedContent("女子篮球在哪一年成为奥运会项目？", listOf("1976", "1980", "1984", "1988"), "体育", "女子篮球于1976年蒙特利尔奥运会引入，但直到1984年洛杉矶奥运会才有美国队参赛的完整赛事。"),
            es = LocalizedContent("¿En qué año el baloncesto femenino se convirtió en deporte olímpico?", listOf("1976", "1980", "1984", "1988"), "Deportes", "El baloncesto femenino se introdujo en los Juegos Olímpicos en 1976 en Montreal, pero el torneo con la participación del equipo de Estados Unidos tuvo lugar recién en 1984 en Los Ángeles.")
        ),
        BilingualQuestion(
            id = 51123, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde au 400m haies?", listOf("47.60s", "47.80s", "48.04s", "48.29s"), "Sport", "Ce record a été établi par le Norvégien Karsten Warholm aux Jeux olympiques de Tokyo en 2021, battant l'ancien record du monde de Kevin Young qui datait de 1992."),
            en = LocalizedContent("What is the world record in the 400m hurdles?", listOf("47.60s", "47.80s", "48.04s", "48.29s"), "Sports", "This record was set by Norwegian Karsten Warholm at the Tokyo Olympics in 2021, breaking the previous world record of Kevin Young from 1992."),
            zh = LocalizedContent("400米栏的世界纪录是多少？", listOf("47.60秒", "47.80秒", "48.04秒", "48.29秒"), "体育", "该纪录由挪威选手卡斯滕·瓦霍尔姆在2021年东京奥运会上创造，打破了凯文·扬自1992年保持的前世界纪录。"),
            es = LocalizedContent("¿Cuál es el récord mundial en los 400m vallas?", listOf("47.60s", "47.80s", "48.04s", "48.29s"), "Deportes", "Este récord fue establecido por el noruego Karsten Warholm en los Juegos Olímpicos de Tokio 2021, superando el anterior récord mundial de Kevin Young de 1992.")
        ),
        BilingualQuestion(
            id = 51124, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année Gianluigi Donnarumma a-t-il été nommé pour le Ballon d'Or?", listOf("2019", "2020", "2021", "2022"), "Sport", "Gianluigi Donnarumma a été nommé pour le Ballon d'Or en 2021 après avoir remporté le championnat d'Europe avec l'Italie et avoir été élu meilleur joueur du tournoi."),
            en = LocalizedContent("In which year was Gianluigi Donnarumma nominated for the Ballon d'Or?", listOf("2019", "2020", "2021", "2022"), "Sports", "Gianluigi Donnarumma was nominated for the Ballon d'Or in 2021 after winning the European Championship with Italy and being named the best player of the tournament."),
            zh = LocalizedContent("吉安路易吉·多纳鲁马在哪一年获得金球奖提名？", listOf("2019", "2020", "2021", "2022"), "体育", "吉安路易吉·多纳鲁马在2021年获得金球奖提名，此前他随意大利队赢得欧洲杯并被评为赛事最佳球员。"),
            es = LocalizedContent("¿En qué año fue nominado Gianluigi Donnarumma para el Balón de Oro?", listOf("2019", "2020", "2021", "2022"), "Deportes", "Gianluigi Donnarumma fue nominado al Balón de Oro en 2021 después de ganar la Eurocopa con Italia y ser nombrado mejor jugador del torneo.")
        ),
        BilingualQuestion(
            id = 51125, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de buts en une saison de Premier League?", listOf("34", "38", "42", "46"), "Sport", "Ce record de 42 buts en une saison de Premier League a été établi par Andrew Cole en 1993-1994 puis égalé par Alan Shearer en 1994-1995."),
            en = LocalizedContent("What is the highest number of goals in a Premier League season?", listOf("34", "38", "42", "46"), "Sports", "This record of 42 goals in a Premier League season was set by Andrew Cole in 1993-1994 and later equaled by Alan Shearer in 1994-1995."),
            zh = LocalizedContent("英超单赛季最高进球数是多少？", listOf("34", "38", "42", "46"), "体育", "英超单赛季42球的纪录由安德鲁·科尔在1993-1994赛季创造，随后阿兰·希勒在1994-1995赛季追平。"),
            es = LocalizedContent("¿Cuál es el mayor número de goles en una temporada de la Premier League?", listOf("34", "38", "42", "46"), "Deportes", "Este récord de 42 goles en una temporada de la Premier League fue establecido por Andrew Cole en 1993-1994 y luego igualado por Alan Shearer en 1994-1995.")
        ),
        BilingualQuestion(
            id = 51126, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film asiatique a remporté la Palme d'Or à Cannes en 2019?", listOf("Parasite", "The Handmaiden", "A Tale of Two Sisters", "Oldboy"), "Cinéma", "Parasite, réalisé par le Sud-Coréen Bong Joon-ho, a marqué l'histoire en devenant le premier film asiatique à remporter la Palme d'Or à Cannes en 2019."),
            en = LocalizedContent("Which Asian film won the Palme d'Or at Cannes in 2019?", listOf("Parasite", "The Handmaiden", "A Tale of Two Sisters", "Oldboy"), "Cinema", "Parasite, directed by South Korean Bong Joon-ho, made history by becoming the first Asian film to win the Palme d'Or at Cannes in 2019."),
            zh = LocalizedContent("哪部亚洲电影在2019年戛纳电影节获得了金棕榈奖？", listOf("寄生虫", "小姐", "蔷花红莲", "老男孩"), "电影", "由韩国导演奉俊昊执导的《寄生虫》在2019年戛纳电影节上创造了历史，成为首部获得金棕榈奖的亚洲电影。"),
            es = LocalizedContent("¿Qué película asiática ganó la Palma de Oro en Cannes en 2019?", listOf("Parásitos", "La doncella", "Una historia de dos hermanas", "Oldboy"), "Cine", "Parásitos, dirigida por el surcoreano Bong Joon-ho, hizo historia al convertirse en la primera película asiática en ganar la Palma de Oro en Cannes en 2019.")
        ),
        BilingualQuestion(
            id = 51127, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé le film d'horreur 'The Ring'?", listOf("Gore Verbinski", "James Wan", "Ari Aster", "David Fincher"), "Cinéma", "Gore Verbinski a réalisé l'adaptation américaine de The Ring en 2002, un remake du film d'horreur japonais Ringu de Hideo Nakata."),
            en = LocalizedContent("Who directed the horror film 'The Ring'?", listOf("Gore Verbinski", "James Wan", "Ari Aster", "David Fincher"), "Cinema", "Gore Verbinski directed the American adaptation of The Ring in 2002, a remake of the Japanese horror film Ringu by Hideo Nakata."),
            zh = LocalizedContent("谁执导了恐怖电影《午夜凶铃》？", listOf("戈尔·维宾斯基", "詹姆斯·温", "阿里·艾斯特", "大卫·芬奇"), "电影", "戈尔·维宾斯基在2002年执导了美国版《午夜凶铃》，这是中田秀夫执导的日本恐怖片《午夜凶铃》的翻拍版。"),
            es = LocalizedContent("¿Quién dirigió la película de terror 'The Ring'?", listOf("Gore Verbinski", "James Wan", "Ari Aster", "David Fincher"), "Cine", "Gore Verbinski dirigió la adaptación estadounidense de The Ring en 2002, un remake de la película de terror japonesa Ringu de Hideo Nakata.")
        ),
        BilingualQuestion(
            id = 51128, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel animé Studio Ghibli a remporté l'Oscar du meilleur film d'animation?", listOf("Le Voyage de Chihiro", "Ponyo", "Kiki la petite sorcière", "Le Château dans le ciel"), "Cinéma", "Le Voyage de Chihiro a été le premier film d'animation non américain à remporter l'Oscar du meilleur film d'animation en 2003, réalisé par Hayao Miyazaki."),
            en = LocalizedContent("Which Studio Ghibli anime won the Oscar for Best Animated Feature?", listOf("Spirited Away", "Ponyo", "Kiki's Delivery Service", "Castle in the Sky"), "Cinema", "Spirited Away was the first non-American animated film to win the Oscar for Best Animated Feature in 2003, directed by Hayao Miyazaki."),
            zh = LocalizedContent("哪部吉卜力工作室的动画获得了奥斯卡最佳动画长片奖？", listOf("千与千寻", "悬崖上的金鱼姬", "魔女宅急便", "天空之城"), "电影", "《千与千寻》是第一部获得奥斯卡最佳动画长片奖的非美国动画电影，于2003年获奖，由宫崎骏执导。"),
            es = LocalizedContent("¿Qué anime de Studio Ghibli ganó el Oscar a la mejor película de animación?", listOf("El viaje de Chihiro", "Ponyo", "Kiki: entregas a domicilio", "El castillo en el cielo"), "Cine", "El viaje de Chihiro fue la primera película de animación no estadounidense en ganar el Oscar a la mejor película de animación en 2003, dirigida por Hayao Miyazaki.")
        ),
        BilingualQuestion(
            id = 51129, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a composé la musique de 'Jaws'?", listOf("John Williams", "Hans Zimmer", "Ennio Morricone", "Jerry Goldsmith"), "Cinéma", "John Williams a composé la célèbre musique de Jaws, dont le thème menaçant à deux notes est devenu emblématique du cinéma."),
            en = LocalizedContent("Who composed the music for 'Jaws'?", listOf("John Williams", "Hans Zimmer", "Ennio Morricone", "Jerry Goldsmith"), "Cinema", "John Williams composed the famous music for Jaws, whose menacing two-note theme became iconic in cinema."),
            zh = LocalizedContent("谁为《大白鲨》创作了音乐？", listOf("约翰·威廉姆斯", "汉斯·季默", "埃尼奥·莫里康内", "杰里·戈德史密斯"), "电影", "约翰·威廉姆斯为《大白鲨》创作了著名的音乐，其威胁性的两个音符主题成为电影界的标志。"),
            es = LocalizedContent("¿Quién compuso la música de 'Tiburón'?", listOf("John Williams", "Hans Zimmer", "Ennio Morricone", "Jerry Goldsmith"), "Cine", "John Williams compuso la famosa música de Tiburón, cuyo amenazante tema de dos notas se volvió icónico en el cine.")
        ),
        BilingualQuestion(
            id = 51130, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film Netflix original a remporté le plus de nominations aux Oscars?", listOf("The Irishman", "Roma", "The Power of the Dog", "Don't Look Up"), "Cinéma", "The Power of the Dog a reçu 12 nominations aux Oscars 2022, un record pour un film Netflix original, incluant celles du meilleur film et du meilleur réalisateur."),
            en = LocalizedContent("Which Netflix original film received the most Oscar nominations?", listOf("The Irishman", "Roma", "The Power of the Dog", "Don't Look Up"), "Cinema", "The Power of the Dog received 12 Oscar nominations in 2022, a record for a Netflix original film, including Best Picture and Best Director."),
            zh = LocalizedContent("哪部Netflix原创电影获得了最多的奥斯卡提名？", listOf("爱尔兰人", "罗马", "犬之力", "不要抬头"), "电影", "《犬之力》在2022年获得了12项奥斯卡提名，这是Netflix原创电影的纪录，包括最佳影片和最佳导演。"),
            es = LocalizedContent("¿Qué película original de Netflix recibió más nominaciones al Oscar?", listOf("El irlandés", "Roma", "El poder del perro", "No mires arriba"), "Cine", "El poder del perro recibió 12 nominaciones al Oscar en 2022, un récord para una película original de Netflix, incluyendo Mejor Película y Mejor Director.")
        ),
        BilingualQuestion(
            id = 51131, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a remporté la Palme d'Or à Cannes en 2018?", listOf("Hirokazu Koreeda", "Denis Villeneuve", "Yorgos Lanthimos", "Lynne Ramsay"), "Cinéma", "Hirokazu Koreeda a remporté la Palme d'Or en 2018 pour son film \"Une affaire de famille\", qui explore les liens familiaux dans le Japon contemporain."),
            en = LocalizedContent("Which director won the Palme d'Or at Cannes in 2018?", listOf("Hirokazu Koreeda", "Denis Villeneuve", "Yorgos Lanthimos", "Lynne Ramsay"), "Cinema", "Hirokazu Koreeda won the Palme d'Or in 2018 for his film 'Shoplifters', which explores family bonds in contemporary Japan."),
            zh = LocalizedContent("哪位导演在2018年戛纳电影节上获得了金棕榈奖？", listOf("是枝裕和", "丹尼斯·维伦纽瓦", "欧格斯·兰斯莫斯", "琳恩·拉姆塞"), "电影", "是枝裕和凭借电影《小偷家族》在2018年获得金棕榈奖，该片探讨了当代日本家庭纽带。"),
            es = LocalizedContent("¿Qué director ganó la Palma de Oro en Cannes en 2018?", listOf("Hirokazu Koreeda", "Denis Villeneuve", "Yorgos Lanthimos", "Lynne Ramsay"), "Cine", "Hirokazu Koreeda ganó la Palma de Oro en 2018 por su película 'Un asunto de familia', que explora los lazos familiares en el Japón contemporáneo.")
        ),
        BilingualQuestion(
            id = 51132, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film d'horreur japonais a inspiré le remake 'The Grudge'?", listOf("Ju-On", "Ring", "Dark Water", "Shutter"), "Cinéma", "Ju-On est la saga horrifique japonaise originale, réalisée par Takashi Shimizu, qui a servi de base directe au remake américain The Grudge sorti en 2004."),
            en = LocalizedContent("Which Japanese horror film inspired the remake 'The Grudge'?", listOf("Ju-On", "Ring", "Dark Water", "Shutter"), "Cinema", "Ju-On is the original Japanese horror saga, directed by Takashi Shimizu, which directly served as the basis for the American remake The Grudge released in 2004."),
            zh = LocalizedContent("哪部日本恐怖片启发了翻拍版《咒怨》？", listOf("咒怨", "午夜凶铃", "鬼水怪谈", "快门"), "电影", "《咒怨》是原版日本恐怖系列，由清水崇执导，直接作为2004年美国翻拍版《咒怨》的基础。"),
            es = LocalizedContent("¿Qué película de terror japonesa inspiró el remake 'La maldición'?", listOf("Ju-On", "Ring", "Dark Water", "Shutter"), "Cine", "Ju-On es la saga de terror japonesa original, dirigida por Takashi Shimizu, que sirvió de base directa para el remake estadounidense La maldición estrenado en 2004.")
        ),
        BilingualQuestion(
            id = 51133, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a réalisé le film 'Parasite'?", listOf("Bong Joon-ho", "Park Chan-wook", "Lee Chang-dong", "Hong Sang-soo"), "Cinéma", "Bong Joon-ho est le réalisateur sud-coréen de 'Parasite', qui a remporté la Palme d'or à Cannes en 2019 et l'Oscar du meilleur film en 2020."),
            en = LocalizedContent("Who directed the film 'Parasite'?", listOf("Bong Joon-ho", "Park Chan-wook", "Lee Chang-dong", "Hong Sang-soo"), "Cinema", "Bong Joon-ho is the South Korean director of 'Parasite', which won the Palme d'Or at Cannes in 2019 and the Oscar for Best Picture in 2020."),
            zh = LocalizedContent("谁执导了电影《寄生虫》？", listOf("奉俊昊", "朴赞郁", "李沧东", "洪常秀"), "电影", "奉俊昊是韩国导演，执导了《寄生虫》，该片在2019年戛纳电影节获得金棕榈奖，并在2020年获得奥斯卡最佳影片奖。"),
            es = LocalizedContent("¿Quién dirigió la película 'Parásitos'?", listOf("Bong Joon-ho", "Park Chan-wook", "Lee Chang-dong", "Hong Sang-soo"), "Cine", "Bong Joon-ho es el director surcoreano de 'Parásitos', que ganó la Palma de Oro en Cannes en 2019 y el Oscar a la mejor película en 2020.")
        ),
        BilingualQuestion(
            id = 51134, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel compositeur a créé la musique de 'The Lord of the Rings'?", listOf("Howard Shore", "John Williams", "Hans Zimmer", "Ennio Morricone"), "Cinéma", "Howard Shore a composé la bande originale de la trilogie 'The Lord of the Rings' de Peter Jackson, remportant trois Oscars pour son travail."),
            en = LocalizedContent("Which composer created the music for 'The Lord of the Rings'?", listOf("Howard Shore", "John Williams", "Hans Zimmer", "Ennio Morricone"), "Cinema", "Howard Shore composed the soundtrack for Peter Jackson's 'The Lord of the Rings' trilogy, winning three Oscars for his work."),
            zh = LocalizedContent("哪位作曲家为《指环王》创作了音乐？", listOf("霍华德·肖", "约翰·威廉姆斯", "汉斯·季默", "埃尼奥·莫里康内"), "电影", "霍华德·肖为彼得·杰克逊的《指环王》三部曲创作了配乐，并凭借该作品获得了三项奥斯卡奖。"),
            es = LocalizedContent("¿Qué compositor creó la música de 'El Señor de los Anillos'?", listOf("Howard Shore", "John Williams", "Hans Zimmer", "Ennio Morricone"), "Cine", "Howard Shore compuso la banda sonora de la trilogía 'El Señor de los Anillos' de Peter Jackson, ganando tres Oscar por su trabajo.")
        ),
        BilingualQuestion(
            id = 51135, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film de sci-fi asiatique a remporté la Palme d'Or?", listOf("Ghost in the Shell", "Blade Runner 2049", "Akira", "Perfect Blue"), "Cinéma", "Akira n'a pas remporté la Palme d'Or, mais le film de science-fiction asiatique primé est Shoplifters, une œuvre japonaise de Hirokazu Kore-eda, qui a gagné la Palme d'Or en 2018."),
            en = LocalizedContent("Which Asian sci-fi film won the Palme d'Or?", listOf("Ghost in the Shell", "Blade Runner 2049", "Akira", "Perfect Blue"), "Cinema", "Akira did not win the Palme d'Or, but the Asian sci-fi film that won is Shoplifters, a Japanese work by Hirokazu Kore-eda, which won the Palme d'Or in 2018."),
            zh = LocalizedContent("哪部亚洲科幻片获得了金棕榈奖？", listOf("攻壳机动队", "银翼杀手2049", "阿基拉", "未麻的部屋"), "电影", "《阿基拉》并未获得金棕榈奖，但获得该奖的亚洲科幻片是《小偷家族》，一部由是枝裕和执导的日本作品，于2018年获得金棕榈奖。"),
            es = LocalizedContent("¿Qué película de ciencia ficción asiática ganó la Palma de Oro?", listOf("Ghost in the Shell", "Blade Runner 2049", "Akira", "Perfect Blue"), "Cine", "Akira no ganó la Palma de Oro, pero la película de ciencia ficción asiática que ganó es Un asunto de familia, una obra japonesa de Hirokazu Kore-eda, que ganó la Palma de Oro en 2018.")
        ),
        BilingualQuestion(
            id = 51136, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a réalisé 'A Tale of Two Sisters'?", listOf("Kim Jee-woon", "Park Chan-wook", "Bong Joon-ho", "Lee Chang-dong"), "Cinéma", "Kim Jee-woon a réalisé ce film d'horreur psychologique sud-coréen de 2003, adapté d'un conte folklorique traditionnel."),
            en = LocalizedContent("Which director made 'A Tale of Two Sisters'?", listOf("Kim Jee-woon", "Park Chan-wook", "Bong Joon-ho", "Lee Chang-dong"), "Cinema", "Kim Jee-woon directed this 2003 South Korean psychological horror film, adapted from a traditional folk tale."),
            zh = LocalizedContent("哪位导演执导了《蔷花红莲》？", listOf("金知云", "朴赞郁", "奉俊昊", "李沧东"), "电影", "金知云执导了这部2003年的韩国心理恐怖片，改编自一个传统民间故事。"),
            es = LocalizedContent("¿Qué director realizó 'Dos hermanas'?", listOf("Kim Jee-woon", "Park Chan-wook", "Bong Joon-ho", "Lee Chang-dong"), "Cine", "Kim Jee-woon dirigió esta película de terror psicológico surcoreana de 2003, adaptada de un cuento folclórico tradicional.")
        ),
        BilingualQuestion(
            id = 51137, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film d'horreur a été réalisé par Ari Aster en 2018?", listOf("Hereditary", "Midsommar", "The Lighthouse", "The Wailing"), "Cinéma", "Hereditary est le premier long métrage d'Ari Aster, sorti en 2018, acclamé pour son horreur psychologique et son exploration du deuil familial."),
            en = LocalizedContent("Which horror film was directed by Ari Aster in 2018?", listOf("Hereditary", "Midsommar", "The Lighthouse", "The Wailing"), "Cinema", "Hereditary is Ari Aster's first feature film, released in 2018, acclaimed for its psychological horror and exploration of family grief."),
            zh = LocalizedContent("哪部恐怖片是阿里·艾斯特在2018年执导的？", listOf("遗传厄运", "仲夏夜惊魂", "灯塔", "哭声"), "电影", "《遗传厄运》是阿里·艾斯特的首部长片，于2018年上映，因其心理恐怖和对家庭悲伤的探索而受到好评。"),
            es = LocalizedContent("¿Qué película de terror fue dirigida por Ari Aster en 2018?", listOf("Hereditary", "Midsommar", "The Lighthouse", "The Wailing"), "Cine", "Hereditary es el primer largometraje de Ari Aster, estrenado en 2018, aclamado por su terror psicológico y exploración del duelo familiar.")
        ),
    )
}
