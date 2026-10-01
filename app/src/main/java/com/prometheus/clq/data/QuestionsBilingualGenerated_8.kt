package com.prometheus.clq.data

import com.prometheus.clq.model.BilingualQuestion
import com.prometheus.clq.model.Difficulty
import com.prometheus.clq.model.Language
import com.prometheus.clq.model.LocalizedContent
import com.prometheus.clq.model.Question

/** Auto-generated batch 8 : 500 questions bilingues */
object QuestionsBilingualGenerated_8 {
    fun get(lang: Language = Language.FR): List<Question> = list.map { it.toQuestion(lang) }

    val list: List<BilingualQuestion> by lazy {
        part1() + part2() + part3() + part4() + part5() + part6() + part7()
    }

    private fun part1(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 9930, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand fleuve de la Chine?", listOf("Gange", "Yangtsé", "Amour", "Huang He"), "Géographie", "Le Yangtsé, long de 6 300 km, traverse la Chine d'ouest en est pour se jeter dans la mer de Chine orientale. Il est le plus long fleuve d'Asie et le troisième du monde."),
            en = LocalizedContent("What is the longest river in China?", listOf("Ganges", "Yangtze", "Amur", "Yellow River"), "Geography", "The Yangtze, 6,300 km long, flows across China from west to east into the East China Sea. It is the longest river in Asia and the third longest in the world."),
            zh = LocalizedContent("中国最长的河流是哪条？", listOf("恒河", "长江", "黑龙江", "黄河"), "地理", "长江全长6300公里，自西向东流经中国，注入东海。它是亚洲最长的河流，世界第三长河。"),
            es = LocalizedContent("¿Cuál es el río más largo de China?", listOf("Ganges", "Yangtsé", "Amur", "Huang He"), "Geografía", "El Yangtsé, con 6.300 km de longitud, atraviesa China de oeste a este hasta desembocar en el mar de China Oriental. Es el río más largo de Asia y el tercero del mundo.")
        ),
        BilingualQuestion(
            id = 9931, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand fleuve de l'Inde?", listOf("Indus", "Gange", "Brahmapoutre", "Narmada"), "Géographie", "Le Gange est le plus long fleuve de l'Inde avec environ 2 525 km, traversant le nord du pays avant de se jeter dans le golfe du Bengale."),
            en = LocalizedContent("What is the longest river in India?", listOf("Indus", "Ganges", "Brahmaputra", "Narmada"), "Geography", "The Ganges is the longest river in India at about 2,525 km, flowing through northern India before emptying into the Bay of Bengal."),
            zh = LocalizedContent("印度最长的河流是哪条？", listOf("印度河", "恒河", "布拉马普特拉河", "纳尔默达河"), "地理", "恒河是印度最长的河流，长约2525公里，流经印度北部，注入孟加拉湾。"),
            es = LocalizedContent("¿Cuál es el río más largo de la India?", listOf("Indo", "Ganges", "Brahmaputra", "Narmada"), "Geografía", "El Ganges es el río más largo de la India con unos 2.525 km, fluyendo por el norte del país hasta desembocar en la bahía de Bengala.")
        ),
        BilingualQuestion(
            id = 9932, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand fleuve de l'Afrique?", listOf("Congo", "Niger", "Zambezie", "Nil"), "Géographie", "Le Nil, avec ses 6 650 kilomètres, traverse l'Afrique de l'Est pour se jeter dans la Méditerranée, dépassant le Congo et le Niger en longueur."),
            en = LocalizedContent("What is the longest river in Africa?", listOf("Congo", "Niger", "Zambezi", "Nile"), "Geography", "The Nile, at 6,650 kilometers, flows through East Africa into the Mediterranean, surpassing the Congo and Niger in length."),
            zh = LocalizedContent("非洲最长的河流是哪条？", listOf("刚果河", "尼日尔河", "赞比西河", "尼罗河"), "地理", "尼罗河全长6650公里，流经东非注入地中海，长度超过刚果河和尼日尔河。"),
            es = LocalizedContent("¿Cuál es el río más largo de África?", listOf("Congo", "Níger", "Zambeze", "Nilo"), "Geografía", "El Nilo, con 6.650 kilómetros, atraviesa el este de África hasta desembocar en el Mediterráneo, superando en longitud al Congo y al Níger.")
        ),
        BilingualQuestion(
            id = 9933, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand fleuve d'Europe?", listOf("Danube", "Volga", "Dniepr", "Rhin"), "Géographie", "La Volga, longue de 3 530 km, traverse la Russie d'ouest en est avant de se jeter dans la mer Caspienne, ce qui en fait le plus long fleuve d'Europe."),
            en = LocalizedContent("What is the longest river in Europe?", listOf("Danube", "Volga", "Dnieper", "Rhine"), "Geography", "The Volga, 3,530 km long, flows through Russia from west to east into the Caspian Sea, making it the longest river in Europe."),
            zh = LocalizedContent("欧洲最长的河流是哪条？", listOf("多瑙河", "伏尔加河", "第聂伯河", "莱茵河"), "地理", "伏尔加河全长3530公里，自西向东流经俄罗斯，注入里海，是欧洲最长的河流。"),
            es = LocalizedContent("¿Cuál es el río más largo de Europa?", listOf("Danubio", "Volga", "Dniéper", "Rin"), "Geografía", "El Volga, de 3.530 km de longitud, atraviesa Rusia de oeste a este hasta desembocar en el mar Caspio, lo que lo convierte en el río más largo de Europa.")
        ),
        BilingualQuestion(
            id = 9934, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand fleuve d'Océanie?", listOf("Sepik", "Murray", "Darling", "Finke"), "Géographie", "Le Sepik, long de 1 126 km, est le plus long fleuve de Nouvelle-Guinée et d'Océanie, dépassant le Fly en Papouasie-Nouvelle-Guinée."),
            en = LocalizedContent("What is the longest river in Oceania?", listOf("Sepik", "Murray", "Darling", "Finke"), "Geography", "The Sepik, 1,126 km long, is the longest river in New Guinea and Oceania, surpassing the Fly in Papua New Guinea."),
            zh = LocalizedContent("大洋洲最长的河流是哪条？", listOf("塞皮克河", "墨累河", "达令河", "芬克河"), "地理", "塞皮克河全长1126公里，是新几内亚和大洋洲最长的河流，超过巴布亚新几内亚的弗莱河。"),
            es = LocalizedContent("¿Cuál es el río más largo de Oceanía?", listOf("Sepik", "Murray", "Darling", "Finke"), "Geografía", "El Sepik, con 1.126 km de longitud, es el río más largo de Nueva Guinea y Oceanía, superando al Fly en Papúa Nueva Guinea.")
        ),
        BilingualQuestion(
            id = 9935, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand port du monde par volume?", listOf("Port de Rotterdam", "Port de Singapour", "Port de Shanghai", "Port de Hong Kong"), "Géographie", "Le port de Shanghai est le plus grand port du monde en volume de marchandises depuis 2010, dépassant Singapour grâce à l'essor du commerce chinois."),
            en = LocalizedContent("What is the largest port in the world by volume?", listOf("Port of Rotterdam", "Port of Singapore", "Port of Shanghai", "Port of Hong Kong"), "Geography", "The Port of Shanghai has been the world's largest port by cargo volume since 2010, surpassing Singapore due to the rise of Chinese trade."),
            zh = LocalizedContent("按吞吐量计算，世界上最大的港口是哪个？", listOf("鹿特丹港", "新加坡港", "上海港", "香港港"), "地理", "自2010年以来，上海港一直是世界上货物吞吐量最大的港口，由于中国贸易的崛起，超过了新加坡。"),
            es = LocalizedContent("¿Cuál es el puerto más grande del mundo por volumen?", listOf("Puerto de Róterdam", "Puerto de Singapur", "Puerto de Shanghái", "Puerto de Hong Kong"), "Geografía", "El puerto de Shanghái es el puerto más grande del mundo en volumen de mercancías desde 2010, superando a Singapur gracias al auge del comercio chino.")
        ),
        BilingualQuestion(
            id = 9936, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand aéroport du monde par nombre de passagers?", listOf("Aéroport de Dubaï", "Aéroport d'Atlanta", "Aéroport de Pékin", "Aéroport de Los Angeles"), "Géographie", "L'aéroport international Hartsfield-Jackson d'Atlanta est le plus fréquenté du monde depuis 1998, grâce à sa position de hub majeur pour Delta Air Lines et à la forte demande de transport aérien aux États-Unis."),
            en = LocalizedContent("What is the largest airport in the world by passenger traffic?", listOf("Dubai Airport", "Atlanta Airport", "Beijing Airport", "Los Angeles Airport"), "Geography", "Hartsfield-Jackson Atlanta International Airport has been the busiest airport in the world since 1998, due to its major hub role for Delta Air Lines and high US air travel demand."),
            zh = LocalizedContent("按客流量计算，世界上最大的机场是哪个？", listOf("迪拜机场", "亚特兰大机场", "北京机场", "洛杉矶机场"), "地理", "哈茨菲尔德-杰克逊亚特兰大国际机场自1998年以来一直是世界上最繁忙的机场，得益于其作为达美航空主要枢纽的地位以及美国航空旅行的强劲需求。"),
            es = LocalizedContent("¿Cuál es el aeropuerto más grande del mundo por número de pasajeros?", listOf("Aeropuerto de Dubái", "Aeropuerto de Atlanta", "Aeropuerto de Pekín", "Aeropuerto de Los Ángeles"), "Geografía", "El Aeropuerto Internacional Hartsfield-Jackson de Atlanta es el más transitado del mundo desde 1998, gracias a su posición como hub principal de Delta Air Lines y la alta demanda de transporte aéreo en Estados Unidos.")
        ),
        BilingualQuestion(
            id = 9937, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand stade du monde?", listOf("Stade de Michigan", "Stade Beaver", "Stade Tiger", "Stade de Rungrado"), "Géographie", "Le Stade de Rungrado, situé à Pyongyang en Corée du Nord, peut accueillir environ 114 000 spectateurs, ce qui en fait le plus grand stade du monde par sa capacité."),
            en = LocalizedContent("What is the largest stadium in the world?", listOf("Michigan Stadium", "Beaver Stadium", "Tiger Stadium", "Rungrado Stadium"), "Geography", "Rungrado Stadium, located in Pyongyang, North Korea, can hold about 114,000 spectators, making it the largest stadium in the world by capacity."),
            zh = LocalizedContent("世界上最大的体育场是哪个？", listOf("密歇根体育场", "海狸体育场", "老虎体育场", "绫罗岛体育场"), "地理", "绫罗岛体育场位于朝鲜平壤，可容纳约114,000名观众，是世界上容量最大的体育场。"),
            es = LocalizedContent("¿Cuál es el estadio más grande del mundo?", listOf("Estadio de Míchigan", "Estadio Beaver", "Estadio Tiger", "Estadio de Rungrado"), "Geografía", "El Estadio de Rungrado, situado en Pionyang, Corea del Norte, puede albergar aproximadamente 114.000 espectadores, lo que lo convierte en el estadio más grande del mundo por capacidad.")
        ),
        BilingualQuestion(
            id = 9938, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pont le plus long du monde?", listOf("Pont de la Baie de Hangzhou", "Pont de la Baie de Tokyo", "Viaduc de Millau", "Pont du Roi Fahd"), "Géographie", "Le pont de la baie de Hangzhou, en Chine, mesure environ 36 kilomètres, ce qui en fait le plus long pont maritime du monde. Il relie Shanghai à Ningbo depuis son ouverture en 2008."),
            en = LocalizedContent("What is the longest bridge in the world?", listOf("Hangzhou Bay Bridge", "Tokyo Bay Bridge", "Millau Viaduct", "King Fahd Causeway"), "Geography", "The Hangzhou Bay Bridge in China is about 36 kilometers long, making it the longest sea-crossing bridge in the world. It connects Shanghai to Ningbo since its opening in 2008."),
            zh = LocalizedContent("世界上最长的桥梁是哪座？", listOf("杭州湾跨海大桥", "东京湾大桥", "米约高架桥", "法赫德国王大桥"), "地理", "中国的杭州湾跨海大桥长约36公里，是世界上最长的跨海大桥。自2008年开通以来，连接上海和宁波。"),
            es = LocalizedContent("¿Cuál es el puente más largo del mundo?", listOf("Puente de la Bahía de Hangzhou", "Puente de la Bahía de Tokio", "Viaducto de Millau", "Causeway del Rey Fahd"), "Geografía", "El puente de la bahía de Hangzhou, en China, mide aproximadamente 36 kilómetros, lo que lo convierte en el puente marítimo más largo del mundo. Conecta Shanghái con Ningbo desde su inauguración en 2008.")
        ),
        BilingualQuestion(
            id = 9939, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le tunnel le plus long du monde?", listOf("Tunnel du Mont-Blanc", "Tunnel de base du Brenner", "Tunnel du Gotthard", "Tunnel du Seikan"), "Géographie", "Le tunnel de base du Saint-Gothard, en Suisse, mesure 57 kilomètres, ce qui en fait le plus long tunnel ferroviaire et routier du monde, traversant les Alpes."),
            en = LocalizedContent("What is the longest tunnel in the world?", listOf("Mont Blanc Tunnel", "Brenner Base Tunnel", "Gotthard Tunnel", "Seikan Tunnel"), "Geography", "The Gotthard Base Tunnel in Switzerland is 57 kilometers long, making it the longest railway and road tunnel in the world, crossing the Alps."),
            zh = LocalizedContent("世界上最长的隧道是哪条？", listOf("勃朗峰隧道", "布伦纳基线隧道", "圣哥达隧道", "青函隧道"), "地理", "瑞士的圣哥达基线隧道长57公里，是世界上最长的铁路和公路隧道，穿越阿尔卑斯山。"),
            es = LocalizedContent("¿Cuál es el túnel más largo del mundo?", listOf("Túnel del Mont Blanc", "Túnel de base del Brenner", "Túnel del Gotardo", "Túnel de Seikan"), "Geografía", "El túnel de base del San Gotardo, en Suiza, mide 57 kilómetros, lo que lo convierte en el túnel ferroviario y de carretera más largo del mundo, atravesando los Alpes.")
        ),
        BilingualQuestion(
            id = 9940, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand château du monde?", listOf("Château de Versailles", "Château de Prague", "Château de Windsor", "Château du Kremlin"), "Géographie", "Le château de Windsor, en Angleterre, est le plus grand château habité au monde, avec une superficie de 45 000 mètres carrés."),
            en = LocalizedContent("What is the largest castle in the world?", listOf("Palace of Versailles", "Prague Castle", "Windsor Castle", "Kremlin Castle"), "Geography", "Windsor Castle in England is the largest inhabited castle in the world, covering an area of 45,000 square meters."),
            zh = LocalizedContent("世界上最大的城堡是什么？", listOf("凡尔赛宫", "布拉格城堡", "温莎城堡", "克里姆林宫"), "地理", "位于英格兰的温莎城堡是世界上最大的有人居住的城堡，占地面积达45,000平方米。"),
            es = LocalizedContent("¿Cuál es el castillo más grande del mundo?", listOf("Palacio de Versalles", "Castillo de Praga", "Castillo de Windsor", "Castillo del Kremlin"), "Geografía", "El Castillo de Windsor en Inglaterra es el castillo habitado más grande del mundo, con una superficie de 45.000 metros cuadrados.")
        ),
        BilingualQuestion(
            id = 9941, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand palais du monde?", listOf("Palais de Versailles", "Palais impérial de Tokyo", "Palais du Kremlin", "Palais royal d'Amritsar"), "Géographie", "Le Palais impérial de Tokyo est le plus grand palais du monde en superficie, avec ses 3,41 km², surpassant même la Cité interdite de Pékin."),
            en = LocalizedContent("What is the largest palace in the world?", listOf("Palace of Versailles", "Imperial Palace of Tokyo", "Kremlin Palace", "Royal Palace of Amritsar"), "Geography", "The Imperial Palace of Tokyo is the largest palace in the world by area, covering 3.41 km², surpassing even the Forbidden City in Beijing."),
            zh = LocalizedContent("世界上最大的宫殿是什么？", listOf("凡尔赛宫", "东京皇居", "克里姆林宫", "阿姆利则王宫"), "地理", "东京皇居是世界上面积最大的宫殿，占地3.41平方公里，甚至超过了北京的紫禁城。"),
            es = LocalizedContent("¿Cuál es el palacio más grande del mundo?", listOf("Palacio de Versalles", "Palacio Imperial de Tokio", "Palacio del Kremlin", "Palacio Real de Amritsar"), "Geografía", "El Palacio Imperial de Tokio es el palacio más grande del mundo en superficie, con 3,41 km², superando incluso a la Ciudad Prohibida de Pekín.")
        ),
        BilingualQuestion(
            id = 9942, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand musée du monde?", listOf("Musée du Louvre", "Musée du Vatican", "Musée de l'Hermitage", "Musée d'art métropolitain"), "Géographie", "Le Musée de l'Ermitage à Saint-Pétersbourg est considéré comme le plus grand musée du monde en termes de nombre d'œuvres d'art, avec plus de trois millions de pièces exposées dans un vaste complexe architectural."),
            en = LocalizedContent("What is the largest museum in the world?", listOf("Louvre Museum", "Vatican Museums", "Hermitage Museum", "Metropolitan Museum of Art"), "Geography", "The Hermitage Museum in Saint Petersburg is considered the largest museum in the world in terms of number of artworks, with over three million pieces displayed in a vast architectural complex."),
            zh = LocalizedContent("世界上最大的博物馆是什么？", listOf("卢浮宫", "梵蒂冈博物馆", "冬宫博物馆", "大都会艺术博物馆"), "地理", "位于圣彼得堡的冬宫博物馆被认为是世界上藏品数量最多的博物馆，拥有超过三百万件艺术品，陈列在庞大的建筑群中。"),
            es = LocalizedContent("¿Cuál es el museo más grande del mundo?", listOf("Museo del Louvre", "Museos Vaticanos", "Museo del Hermitage", "Museo Metropolitano de Arte"), "Geografía", "El Museo del Hermitage en San Petersburgo es considerado el museo más grande del mundo en número de obras de arte, con más de tres millones de piezas expuestas en un vasto complejo arquitectónico.")
        ),
        BilingualQuestion(
            id = 9943, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand temple du monde?", listOf("Temples d'Angkor Vat", "Temple du Mont-Athos", "Temple du Kailasa", "Temple Meenakshi"), "Géographie", "Angkor Vat, situé au Cambodge, est considéré comme le plus grand temple du monde en termes de superficie, s'étendant sur plus de 162 hectares."),
            en = LocalizedContent("What is the largest temple in the world?", listOf("Angkor Wat", "Mount Athos Temple", "Kailasa Temple", "Meenakshi Temple"), "Geography", "Angkor Wat, located in Cambodia, is considered the largest temple in the world by area, covering over 162 hectares."),
            zh = LocalizedContent("世界上最大的寺庙是什么？", listOf("吴哥窟", "阿索斯山神庙", "凯拉萨神庙", "米纳克希神庙"), "地理", "位于柬埔寨的吴哥窟被认为是世界上面积最大的寺庙，占地超过162公顷。"),
            es = LocalizedContent("¿Cuál es el templo más grande del mundo?", listOf("Angkor Wat", "Templo del Monte Athos", "Templo Kailasa", "Templo Meenakshi"), "Geografía", "Angkor Wat, ubicado en Camboya, es considerado el templo más grande del mundo en superficie, con más de 162 hectáreas.")
        ),
        BilingualQuestion(
            id = 9944, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand monastère du monde?", listOf("Monastère du Mont-Athos", "Monastère du Potala", "Monastère Shao Lin", "Monastère de Tebhirine"), "Géographie", "Le monastère du Potala, situé à Lhassa au Tibet, est le plus grand du monde avec ses 13 étages et plus de 1000 pièces. Il était la résidence d'hiver du Dalaï-Lama jusqu'en 1959."),
            en = LocalizedContent("What is the largest monastery in the world?", listOf("Mount Athos Monastery", "Potala Palace", "Shaolin Monastery", "Tebhirine Monastery"), "Geography", "The Potala Palace in Lhasa, Tibet, is the largest monastery in the world with 13 stories and over 1,000 rooms. It was the winter residence of the Dalai Lama until 1959."),
            zh = LocalizedContent("世界上最大的寺院是什么？", listOf("阿索斯山修道院", "布达拉宫", "少林寺", "泰比林修道院"), "地理", "位于西藏拉萨的布达拉宫是世界上最大的寺院，有13层和超过1000个房间。直到1959年，它一直是达赖喇嘛的冬宫。"),
            es = LocalizedContent("¿Cuál es el monasterio más grande del mundo?", listOf("Monasterio del Monte Athos", "Palacio de Potala", "Monasterio Shaolin", "Monasterio de Tebhirine"), "Geografía", "El Palacio de Potala en Lhasa, Tíbet, es el monasterio más grande del mundo con 13 pisos y más de 1.000 habitaciones. Fue la residencia de invierno del Dalai Lama hasta 1959.")
        ),
        BilingualQuestion(
            id = 9945, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand mur du monde?", listOf("Muraille de Chine", "Mur d'Hadrien", "Mur de Machu Picchu", "Mur de Jérusalem"), "Géographie", "Avec ses 21 196 kilomètres, la Grande Muraille de Chine est la plus longue structure défensive jamais construite par l'homme."),
            en = LocalizedContent("What is the largest wall in the world?", listOf("Great Wall of China", "Hadrian's Wall", "Wall of Machu Picchu", "Wall of Jerusalem"), "Geography", "At 21,196 kilometers, the Great Wall of China is the longest defensive structure ever built by man."),
            zh = LocalizedContent("世界上最大的墙是什么？", listOf("中国长城", "哈德良长城", "马丘比丘城墙", "耶路撒冷城墙"), "地理", "中国长城全长21,196公里，是人类建造的最长的防御工事。"),
            es = LocalizedContent("¿Cuál es el muro más grande del mundo?", listOf("Gran Muralla China", "Muro de Adriano", "Muro de Machu Picchu", "Muro de Jerusalén"), "Geografía", "Con 21.196 kilómetros, la Gran Muralla China es la estructura defensiva más larga jamás construida por el hombre.")
        ),
        BilingualQuestion(
            id = 9946, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand amphithéâtre du monde?", listOf("Colosseum", "Amphithéâtre Flavien", "Amphithéâtre d'Arles", "Amphithéâtre d'El Djem"), "Géographie", "Le Colosseum de Rome, avec une capacité estimée à 50 000 spectateurs, est le plus grand amphithéâtre jamais construit dans l'Antiquité."),
            en = LocalizedContent("What is the largest amphitheater in the world?", listOf("Colosseum", "Flavian Amphitheatre", "Arles Amphitheatre", "El Djem Amphitheatre"), "Geography", "The Colosseum in Rome, with an estimated capacity of 50,000 spectators, is the largest amphitheater ever built in antiquity."),
            zh = LocalizedContent("世界上最大的圆形剧场是什么？", listOf("罗马斗兽场", "弗拉维安圆形剧场", "阿尔勒圆形剧场", "埃尔杰姆圆形剧场"), "地理", "罗马斗兽场可容纳约5万名观众，是古代建造的最大的圆形剧场。"),
            es = LocalizedContent("¿Cuál es el anfiteatro más grande del mundo?", listOf("Coliseo", "Anfiteatro Flavio", "Anfiteatro de Arlés", "Anfiteatro de El Djem"), "Geografía", "El Coliseo de Roma, con una capacidad estimada de 50.000 espectadores, es el anfiteatro más grande jamás construido en la antigüedad.")
        ),
        BilingualQuestion(
            id = 9947, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand arc du monde?", listOf("Arc de Triomphe", "Arc de Constantin", "Arc du Millénaire", "Arc de Saint-Louis"), "Géographie", "L'Arc de Saint-Louis, situé à Saint-Louis (Missouri), est le plus grand arc du monde avec une hauteur de 192 mètres. Il commémore l'expansion vers l'Ouest des États-Unis."),
            en = LocalizedContent("What is the largest arch in the world?", listOf("Arc de Triomphe", "Arch of Constantine", "Millennium Arch", "Gateway Arch"), "Geography", "The Gateway Arch in St. Louis, Missouri, is the largest arch in the world with a height of 192 meters. It commemorates the westward expansion of the United States."),
            zh = LocalizedContent("世界上最大的拱门是什么？", listOf("凯旋门", "君士坦丁凯旋门", "千禧拱门", "圣路易斯拱门"), "地理", "位于密苏里州圣路易斯的圣路易斯拱门是世界上最大的拱门，高192米。它纪念美国西进运动。"),
            es = LocalizedContent("¿Cuál es el arco más grande del mundo?", listOf("Arco de Triunfo", "Arco de Constantino", "Arco del Milenio", "Arco Gateway"), "Geografía", "El Arco Gateway en San Luis, Misuri, es el arco más grande del mundo con una altura de 192 metros. Conmemora la expansión hacia el oeste de los Estados Unidos.")
        ),
        BilingualQuestion(
            id = 9948, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand obélisque du monde?", listOf("Obélisque de Louxor", "Obélisque de Washington", "Obélisque du Vatican", "Obélisque d'Héliopolis"), "Géographie", "L'obélisque d'Héliopolis, aussi appelé obélisque de Sésostris Ier, mesure environ 20 mètres de haut et pèse 121 tonnes, ce qui en fait le plus grand obélisque monolithe encore debout au monde."),
            en = LocalizedContent("What is the largest obelisk in the world?", listOf("Luxor Obelisk", "Washington Monument", "Vatican Obelisk", "Heliopolis Obelisk"), "Geography", "The Heliopolis Obelisk, also known as the Obelisk of Senusret I, is about 20 meters tall and weighs 121 tons, making it the largest monolithic obelisk still standing in the world."),
            zh = LocalizedContent("世界上最大的方尖碑是什么？", listOf("卢克索方尖碑", "华盛顿纪念碑", "梵蒂冈方尖碑", "赫利奥波利斯方尖碑"), "地理", "赫利奥波利斯方尖碑，又称塞索斯特里斯一世方尖碑，高约20米，重121吨，是世界上现存最大的独石方尖碑。"),
            es = LocalizedContent("¿Cuál es el obelisco más grande del mundo?", listOf("Obelisco de Luxor", "Monumento a Washington", "Obelisco del Vaticano", "Obelisco de Heliópolis"), "Geografía", "El Obelisco de Heliópolis, también conocido como Obelisco de Sesostris I, mide unos 20 metros de altura y pesa 121 toneladas, lo que lo convierte en el obelisco monolítico más grande aún en pie en el mundo.")
        ),
        BilingualQuestion(
            id = 9949, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand astrodôme du monde?", listOf("Astrodôme d'Houston", "Dôme du Millénaire", "Biosphère de Montréal", "Dôme du musée Mesco"), "Géographie", "L'Astrodôme d'Houston, inauguré en 1965, fut le premier stade entièrement couvert au monde, avec un dôme de 216 mètres de diamètre. Il a longtemps détenu le record du plus grand astrodôme avant d'être surpassé."),
            en = LocalizedContent("What is the largest astrodome in the world?", listOf("Astrodome", "Millennium Dome", "Montreal Biosphere", "Mesco Museum Dome"), "Geography", "The Astrodome in Houston, inaugurated in 1965, was the first fully covered stadium in the world, with a dome 216 meters in diameter. It long held the record for the largest astrodome before being surpassed."),
            zh = LocalizedContent("世界上最大的天文馆是什么？", listOf("休斯顿天文馆", "千禧穹顶", "蒙特利尔生物圈", "梅斯科博物馆穹顶"), "地理", "休斯顿天文馆于1965年启用，是世界上第一个全封闭体育场，穹顶直径216米。它长期保持着最大天文馆的记录，直到被超越。"),
            es = LocalizedContent("¿Cuál es el astrodomo más grande del mundo?", listOf("Astrodomo de Houston", "Domo del Milenio", "Biosfera de Montreal", "Domo del Museo Mesco"), "Geografía", "El Astrodomo de Houston, inaugurado en 1965, fue el primer estadio completamente cubierto del mundo, con un domo de 216 metros de diámetro. Durante mucho tiempo tuvo el récord del astrodomo más grande antes de ser superado.")
        ),
        BilingualQuestion(
            id = 9950, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand aqueduc du monde?", listOf("Aqueduc de Pont-du-Gard", "Aqueduc de Roquefavour", "Aqueduc de Claudio", "Aqueduc de Valens"), "Géographie", "L'aqueduc de Pont-du-Gard, situé dans le sud de la France, est le plus haut aqueduc romain encore debout, avec 49 mètres de hauteur, et il faisait partie d'un système de 50 km pour alimenter Nîmes en eau."),
            en = LocalizedContent("What is the largest aqueduct in the world?", listOf("Pont du Gard", "Roquefavour Aqueduct", "Aqua Claudia", "Valens Aqueduct"), "Geography", "The Pont du Gard, located in southern France, is the tallest Roman aqueduct still standing, at 49 meters high, and was part of a 50 km system to supply water to Nîmes."),
            zh = LocalizedContent("世界上最大的渡槽是什么？", listOf("加尔桥", "罗克法沃尔渡槽", "克劳狄水道", "瓦伦斯渡槽"), "地理", "加尔桥位于法国南部，是现存最高的罗马渡槽，高49米，是长达50公里、为尼姆供水的系统的一部分。"),
            es = LocalizedContent("¿Cuál es el acueducto más grande del mundo?", listOf("Puente del Gard", "Acueducto de Roquefavour", "Acueducto de Claudio", "Acueducto de Valente"), "Geografía", "El Puente del Gard, situado en el sur de Francia, es el acueducto romano más alto aún en pie, con 49 metros de altura, y formaba parte de un sistema de 50 km para abastecer de agua a Nimes.")
        ),
        BilingualQuestion(
            id = 9951, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand phare du monde?", listOf("Phare d'Alexandria", "Phare de Hérodote", "Phare de Eddystone", "Phare de Bishop Rock"), "Géographie", "Le phare d'Alexandrie, construit au IIIe siècle av. J.-C., était considéré comme l'une des sept merveilles du monde antique et mesurait environ 130 mètres de haut, ce qui en fait le plus grand phare jamais construit."),
            en = LocalizedContent("What is the largest lighthouse in the world?", listOf("Lighthouse of Alexandria", "Lighthouse of Herodotus", "Eddystone Lighthouse", "Bishop Rock Lighthouse"), "Geography", "The Lighthouse of Alexandria, built in the 3rd century BC, was considered one of the Seven Wonders of the Ancient World and stood about 130 meters tall, making it the largest lighthouse ever built."),
            zh = LocalizedContent("世界上最大的灯塔是什么？", listOf("亚历山大灯塔", "希罗多德灯塔", "埃迪斯通灯塔", "毕晓普岩灯塔"), "地理", "亚历山大灯塔建于公元前3世纪，被认为是古代世界七大奇迹之一，高约130米，是有史以来建造的最大灯塔。"),
            es = LocalizedContent("¿Cuál es el faro más grande del mundo?", listOf("Faro de Alejandría", "Faro de Heródoto", "Faro de Eddystone", "Faro de Bishop Rock"), "Geografía", "El Faro de Alejandría, construido en el siglo III a.C., fue considerado una de las Siete Maravillas del Mundo Antiguo y medía unos 130 metros de altura, lo que lo convierte en el faro más grande jamás construido.")
        ),
        BilingualQuestion(
            id = 9952, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand cimetière du monde?", listOf("Cimetière de Père-Lachaise", "Cimetière de Calvary", "Cimetière de Najaf", "Cimetière du Mont-Royal"), "Géographie", "Le cimetière de Najaf, en Irak, est le plus grand du monde avec plus de six millions de tombes, car il est un lieu saint pour les chiites depuis des siècles."),
            en = LocalizedContent("What is the largest cemetery in the world?", listOf("Père Lachaise Cemetery", "Calvary Cemetery", "Najaf Cemetery", "Mount Royal Cemetery"), "Geography", "The Najaf Cemetery in Iraq is the largest in the world with over six million graves, as it has been a holy site for Shia Muslims for centuries."),
            zh = LocalizedContent("世界上最大的墓地是什么？", listOf("拉雪兹神父公墓", "卡尔瓦里公墓", "纳杰夫公墓", "皇家山公墓"), "地理", "伊拉克的纳杰夫公墓是世界上最大的墓地，拥有超过六百万座坟墓，因为几个世纪以来它一直是什叶派穆斯林的圣地。"),
            es = LocalizedContent("¿Cuál es el cementerio más grande del mundo?", listOf("Cementerio de Père Lachaise", "Cementerio del Calvario", "Cementerio de Nayaf", "Cementerio del Monte Real"), "Geografía", "El Cementerio de Nayaf en Irak es el más grande del mundo con más de seis millones de tumbas, ya que ha sido un lugar sagrado para los chiíes durante siglos.")
        ),
        BilingualQuestion(
            id = 9953, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand marché du monde?", listOf("Grand Bazar d'Istanbul", "Bazar de Téhéran", "Marché de Huambo", "Marché de Chatuchak"), "Géographie", "Le Grand Bazar d'Istanbul, avec ses 61 rues et plus de 4 000 boutiques, est considéré comme le plus grand marché couvert du monde en termes de superficie et de nombre de commerces."),
            en = LocalizedContent("What is the largest market in the world?", listOf("Grand Bazaar of Istanbul", "Tehran Bazaar", "Huambo Market", "Chatuchak Market"), "Geography", "The Grand Bazaar of Istanbul, with its 61 streets and over 4,000 shops, is considered the largest covered market in the world in terms of area and number of businesses."),
            zh = LocalizedContent("世界上最大的市场是什么？", listOf("伊斯坦布尔大巴扎", "德黑兰大巴扎", "万博市场", "乍都乍市场"), "地理", "伊斯坦布尔大巴扎拥有61条街道和4000多家店铺，被认为是世界上最大的室内市场，无论是面积还是商铺数量。"),
            es = LocalizedContent("¿Cuál es el mercado más grande del mundo?", listOf("Gran Bazar de Estambul", "Bazar de Teherán", "Mercado de Huambo", "Mercado de Chatuchak"), "Geografía", "El Gran Bazar de Estambul, con sus 61 calles y más de 4.000 tiendas, es considerado el mercado cubierto más grande del mundo en términos de superficie y número de comercios.")
        ),
        BilingualQuestion(
            id = 9954, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand jardin du monde?", listOf("Jardin de Versailles", "Jardin impérial de Pékin", "Jardin du château de Sanssouci", "Jardin de Kew"), "Géographie", "Le Jardin impérial de Pékin, également connu sous le nom de Palais d'Été, s'étend sur environ 290 hectares, ce qui en fait le plus grand jardin du monde par sa superficie."),
            en = LocalizedContent("What is the largest garden in the world?", listOf("Garden of Versailles", "Imperial Garden of Beijing", "Sanssouci Palace Garden", "Kew Gardens"), "Geography", "The Imperial Garden of Beijing, also known as the Summer Palace, covers about 290 hectares, making it the largest garden in the world by area."),
            zh = LocalizedContent("世界上最大的花园是什么？", listOf("凡尔赛花园", "北京颐和园", "无忧宫花园", "邱园"), "地理", "北京颐和园（又称夏宫）占地约290公顷，是世界上面积最大的花园。"),
            es = LocalizedContent("¿Cuál es el jardín más grande del mundo?", listOf("Jardín de Versalles", "Jardín Imperial de Pekín", "Jardín del Palacio de Sanssouci", "Jardines de Kew"), "Geografía", "El Jardín Imperial de Pekín, también conocido como Palacio de Verano, se extiende sobre unas 290 hectáreas, lo que lo convierte en el jardín más grande del mundo por superficie.")
        ),
        BilingualQuestion(
            id = 9955, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand parc du monde?", listOf("Parc de Yellowstone", "Parc de Denali", "Parc du Groenland du Nord-Est", "Parc de Wrangell-Saint-Elias"), "Géographie", "Le Parc national du Groenland du Nord-Est est le plus grand parc du monde, couvrant environ 972 000 km², soit plus que la superficie de la France et de l'Espagne réunies."),
            en = LocalizedContent("What is the largest park in the world?", listOf("Yellowstone Park", "Denali Park", "Northeast Greenland Park", "Wrangell-St. Elias Park"), "Geography", "Northeast Greenland National Park is the largest park in the world, covering about 972,000 km², larger than the combined area of France and Spain."),
            zh = LocalizedContent("世界上最大的公园是什么？", listOf("黄石公园", "德纳里公园", "东北格陵兰公园", "朗格尔-圣埃利亚斯公园"), "地理", "东北格陵兰国家公园是世界上最大的公园，面积约97.2万平方公里，比法国和西班牙的面积总和还大。"),
            es = LocalizedContent("¿Cuál es el parque más grande del mundo?", listOf("Parque de Yellowstone", "Parque de Denali", "Parque del Noreste de Groenlandia", "Parque de Wrangell-St. Elias"), "Geografía", "El Parque Nacional del Noreste de Groenlandia es el parque más grande del mundo, con unos 972.000 km², más que la superficie de Francia y España juntas.")
        ),
        BilingualQuestion(
            id = 9956, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand zoo du monde?", listOf("Zoo de San Diego", "Zoo du Bronx", "Zoo de Berlin", "Zoo national de Namibie"), "Géographie", "Le Zoo du Bronx, à New York, est le plus grand zoo urbain des États-Unis avec plus de 100 hectares et 6 000 animaux, ce qui en fait le plus vaste au monde en termes de superficie."),
            en = LocalizedContent("What is the largest zoo in the world?", listOf("San Diego Zoo", "Bronx Zoo", "Berlin Zoo", "Namibia National Zoo"), "Geography", "The Bronx Zoo in New York is the largest urban zoo in the United States with over 100 hectares and 6,000 animals, making it the largest in the world by area."),
            zh = LocalizedContent("世界上最大的动物园是什么？", listOf("圣地亚哥动物园", "布朗克斯动物园", "柏林动物园", "纳米比亚国家动物园"), "地理", "纽约的布朗克斯动物园是美国最大的城市动物园，占地超过100公顷，拥有6000只动物，是世界上面积最大的动物园。"),
            es = LocalizedContent("¿Cuál es el zoológico más grande del mundo?", listOf("Zoológico de San Diego", "Zoológico del Bronx", "Zoológico de Berlín", "Zoológico Nacional de Namibia"), "Geografía", "El Zoológico del Bronx en Nueva York es el zoológico urbano más grande de Estados Unidos con más de 100 hectáreas y 6.000 animales, lo que lo convierte en el más grande del mundo por superficie.")
        ),
        BilingualQuestion(
            id = 9957, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand aquarium du monde?", listOf("Georgia Aquarium", "Aquarium de l'Océan Atlantique", "Aquarium de Dubaï", "Aquarium d'Okinawa"), "Géographie", "Le Georgia Aquarium, situé à Atlanta, détient le record du plus grand aquarium du monde avec plus de 38 millions de litres d'eau. Il abrite des milliers d'espèces marines, dont des requins-baleines."),
            en = LocalizedContent("What is the largest aquarium in the world?", listOf("Georgia Aquarium", "Atlantic Ocean Aquarium", "Dubai Aquarium", "Okinawa Aquarium"), "Geography", "The Georgia Aquarium in Atlanta holds the record for the largest aquarium in the world with over 38 million liters of water. It houses thousands of marine species, including whale sharks."),
            zh = LocalizedContent("世界上最大的水族馆是什么？", listOf("乔治亚水族馆", "大西洋水族馆", "迪拜水族馆", "冲绳水族馆"), "地理", "亚特兰大的乔治亚水族馆拥有超过3800万升水，是世界上最大的水族馆。它饲养了数千种海洋生物，包括鲸鲨。"),
            es = LocalizedContent("¿Cuál es el acuario más grande del mundo?", listOf("Acuario de Georgia", "Acuario del Océano Atlántico", "Acuario de Dubái", "Acuario de Okinawa"), "Geografía", "El Acuario de Georgia en Atlanta tiene el récord del acuario más grande del mundo con más de 38 millones de litros de agua. Alberga miles de especies marinas, incluidos tiburones ballena.")
        ),
        BilingualQuestion(
            id = 9958, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand parc thématique du monde?", listOf("Disney World", "Universal Studios", "SeaWorld", "Disneyland"), "Géographie", "Disney World, en Floride, s'étend sur environ 121 km², ce qui en fait le plus grand parc thématique du monde en superficie, bien plus vaste que ses concurrents comme Disneyland Paris."),
            en = LocalizedContent("What is the largest theme park in the world?", listOf("Disney World", "Universal Studios", "SeaWorld", "Disneyland"), "Geography", "Disney World in Florida covers about 121 km², making it the largest theme park in the world by area, much larger than competitors like Disneyland Paris."),
            zh = LocalizedContent("世界上最大的主题公园是什么？", listOf("迪士尼世界", "环球影城", "海洋世界", "迪士尼乐园"), "地理", "佛罗里达州的迪士尼世界占地约121平方公里，是世界上面积最大的主题公园，远大于巴黎迪士尼乐园等竞争对手。"),
            es = LocalizedContent("¿Cuál es el parque temático más grande del mundo?", listOf("Disney World", "Universal Studios", "SeaWorld", "Disneyland"), "Geografía", "Disney World en Florida se extiende sobre unos 121 km², lo que lo convierte en el parque temático más grande del mundo por superficie, mucho más grande que competidores como Disneyland París.")
        ),
        BilingualQuestion(
            id = 9959, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand désert d'eau douce du monde?", listOf("Désert du Kalahari", "Désert du Sahara", "Pantanal", "Everglades"), "Géographie", "Le Pantanal, situé principalement au Brésil, est la plus grande zone humide tropicale du monde, inondée saisonnièrement par les eaux douces."),
            en = LocalizedContent("What is the largest freshwater desert in the world?", listOf("Kalahari Desert", "Sahara Desert", "Pantanal", "Everglades"), "Geography", "The Pantanal, located mainly in Brazil, is the largest tropical wetland in the world, seasonally flooded by freshwater."),
            zh = LocalizedContent("世界上最大的淡水沙漠是什么？", listOf("卡拉哈里沙漠", "撒哈拉沙漠", "潘塔纳尔湿地", "大沼泽地"), "地理", "潘塔纳尔湿地主要位于巴西，是世界上最大的热带湿地，季节性被淡水淹没。"),
            es = LocalizedContent("¿Cuál es el desierto de agua dulce más grande del mundo?", listOf("Desierto del Kalahari", "Desierto del Sahara", "Pantanal", "Everglades"), "Geografía", "El Pantanal, ubicado principalmente en Brasil, es el humedal tropical más grande del mundo, inundado estacionalmente por agua dulce.")
        ),
        BilingualQuestion(
            id = 9960, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand écosystème de mangrove du monde?", listOf("Delta du Gange", "Région côtière de Colombie", "Région côtière de Nouvelle-Guinée", "Région côtière d'Australie"), "Géographie", "Le delta du Gange, situé entre l'Inde et le Bangladesh, abrite les Sundarbans, la plus vaste forêt de mangrove au monde, couvrant environ 10 000 km²."),
            en = LocalizedContent("What is the largest mangrove ecosystem in the world?", listOf("Ganges Delta", "Coastal region of Colombia", "Coastal region of New Guinea", "Coastal region of Australia"), "Geography", "The Ganges Delta, located between India and Bangladesh, contains the Sundarbans, the largest mangrove forest in the world, covering about 10,000 km²."),
            zh = LocalizedContent("世界上最大的红树林生态系统是什么？", listOf("恒河三角洲", "哥伦比亚沿海地区", "新几内亚沿海地区", "澳大利亚沿海地区"), "地理", "恒河三角洲位于印度和孟加拉国之间，拥有孙德尔本斯，这是世界上最大的红树林，面积约10,000平方公里。"),
            es = LocalizedContent("¿Cuál es el ecosistema de manglar más grande del mundo?", listOf("Delta del Ganges", "Región costera de Colombia", "Región costera de Nueva Guinea", "Región costera de Australia"), "Geografía", "El delta del Ganges, ubicado entre India y Bangladés, alberga los Sundarbans, el bosque de manglar más extenso del mundo, que cubre aproximadamente 10 000 km².")
        ),
        BilingualQuestion(
            id = 9961, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand écosystème de savane du monde?", listOf("Savane du Serengeti", "Savane du Cerrado", "Savane du Miombo", "Savane du Sahel"), "Géographie", "Le Cerrado brésilien est la plus vaste savane du monde, couvrant environ 2 millions de km², soit 22% du territoire du Brésil."),
            en = LocalizedContent("What is the largest savanna ecosystem in the world?", listOf("Serengeti Savanna", "Cerrado Savanna", "Miombo Savanna", "Sahel Savanna"), "Geography", "The Brazilian Cerrado is the largest savanna in the world, covering about 2 million km², or 22% of Brazil's territory."),
            zh = LocalizedContent("世界上最大的稀树草原生态系统是什么？", listOf("塞伦盖蒂稀树草原", "塞拉多稀树草原", "米翁博稀树草原", "萨赫勒稀树草原"), "地理", "巴西的塞拉多是世界上最大的稀树草原，面积约200万平方公里，占巴西领土的22%。"),
            es = LocalizedContent("¿Cuál es el ecosistema de sabana más grande del mundo?", listOf("Sabana del Serengeti", "Sabana del Cerrado", "Sabana del Miombo", "Sabana del Sahel"), "Geografía", "El Cerrado brasileño es la sabana más extensa del mundo, cubriendo aproximadamente 2 millones de km², el 22% del territorio de Brasil.")
        ),
        BilingualQuestion(
            id = 9962, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand écosystème de forêt tropical du monde?", listOf("Forêt amazo", "Forêt du Congo", "Forêt de l'Asie du Sud-Est", "Forêt du Daintree"), "Géographie", "La forêt amazonienne s'étend sur environ 5,5 millions de km² à travers neuf pays d'Amérique du Sud, ce qui en fait le plus vaste écosystème de forêt tropicale au monde."),
            en = LocalizedContent("What is the largest tropical forest ecosystem in the world?", listOf("Amazon Forest", "Congo Forest", "Southeast Asian Forest", "Daintree Forest"), "Geography", "The Amazon rainforest spans about 5.5 million km² across nine South American countries, making it the largest tropical forest ecosystem in the world."),
            zh = LocalizedContent("世界上最大的热带森林生态系统是什么？", listOf("亚马逊森林", "刚果森林", "东南亚森林", "丹特里森林"), "地理", "亚马逊雨林横跨南美洲九个国家，面积约550万平方公里，是世界上最大的热带森林生态系统。"),
            es = LocalizedContent("¿Cuál es el ecosistema de bosque tropical más grande del mundo?", listOf("Bosque Amazónico", "Bosque del Congo", "Bosque del Sudeste Asiático", "Bosque de Daintree"), "Geografía", "La selva amazónica se extiende por aproximadamente 5,5 millones de km² a través de nueve países sudamericanos, lo que la convierte en el ecosistema de bosque tropical más grande del mundo.")
        ),
        BilingualQuestion(
            id = 9963, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand écosystème de récif corallien du monde?", listOf("Grande Barrière de Corail", "Récif de Ningaloo", "Récif de Mésoamérica", "Récif de Taveuni"), "Géographie", "La Grande Barrière de Corail, située au large de l'Australie, s'étend sur plus de 2 300 kilomètres, ce qui en fait le plus vaste système récifal au monde."),
            en = LocalizedContent("What is the largest coral reef ecosystem in the world?", listOf("Great Barrier Reef", "Ningaloo Reef", "Mesoamerican Reef", "Taveuni Reef"), "Geography", "The Great Barrier Reef, off the coast of Australia, stretches over 2,300 kilometers, making it the largest reef system in the world."),
            zh = LocalizedContent("世界上最大的珊瑚礁生态系统是什么？", listOf("大堡礁", "宁格鲁礁", "中美洲礁", "塔韦乌尼礁"), "地理", "大堡礁位于澳大利亚海岸外，绵延超过2300公里，是世界上最大的珊瑚礁系统。"),
            es = LocalizedContent("¿Cuál es el ecosistema de arrecife de coral más grande del mundo?", listOf("Gran Barrera de Coral", "Arrecife de Ningaloo", "Arrecife Mesoamericano", "Arrecife de Taveuni"), "Geografía", "La Gran Barrera de Coral, frente a la costa de Australia, se extiende por más de 2.300 kilómetros, lo que la convierte en el sistema de arrecifes más grande del mundo.")
        ),
        BilingualQuestion(
            id = 9964, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand écosystème de toundra du monde?", listOf("Toundra de Sibérie", "Toundra du Canada", "Toundra du Groenland", "Toundra de l'Alaska"), "Géographie", "La toundra de Sibérie s'étend sur plus de 3 000 kilomètres le long de la côte arctique russe, ce qui en fait la plus vaste étendue de toundra continue au monde."),
            en = LocalizedContent("What is the largest tundra ecosystem in the world?", listOf("Siberian Tundra", "Canadian Tundra", "Greenland Tundra", "Alaskan Tundra"), "Geography", "The Siberian tundra stretches over 3,000 kilometers along the Russian Arctic coast, making it the largest continuous tundra expanse in the world."),
            zh = LocalizedContent("世界上最大的苔原生态系统是什么？", listOf("西伯利亚苔原", "加拿大苔原", "格陵兰苔原", "阿拉斯加苔原"), "地理", "西伯利亚苔原沿俄罗斯北极海岸绵延超过3000公里，是世界上最大的连续苔原区域。"),
            es = LocalizedContent("¿Cuál es el ecosistema de tundra más grande del mundo?", listOf("Tundra de Siberia", "Tundra de Canadá", "Tundra de Groenlandia", "Tundra de Alaska"), "Geografía", "La tundra de Siberia se extiende por más de 3.000 kilómetros a lo largo de la costa ártica rusa, lo que la convierte en la extensión de tundra continua más grande del mundo.")
        ),
        BilingualQuestion(
            id = 9965, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand écosystème de steppe du monde?", listOf("Steppe d'Asie centrale", "Pampas d'Argentine", "Prairie de North America", "Prairie de Mongolie"), "Géographie", "La steppe d'Asie centrale, aussi appelée steppe eurasienne, s'étend sur près de 8 000 km de la Hongrie à la Mongolie, ce qui en fait le plus vaste écosystème de steppe au monde."),
            en = LocalizedContent("What is the largest steppe ecosystem in the world?", listOf("Central Asian Steppe", "Argentine Pampas", "North American Prairie", "Mongolian Prairie"), "Geography", "The Central Asian steppe, also called the Eurasian steppe, stretches nearly 8,000 km from Hungary to Mongolia, making it the largest steppe ecosystem in the world."),
            zh = LocalizedContent("世界上最大的草原生态系统是什么？", listOf("中亚草原", "阿根廷潘帕斯草原", "北美大草原", "蒙古草原"), "地理", "中亚草原，也称为欧亚草原，从匈牙利延伸到蒙古，绵延近8000公里，是世界上最大的草原生态系统。"),
            es = LocalizedContent("¿Cuál es el ecosistema de estepa más grande del mundo?", listOf("Estepa de Asia Central", "Pampas argentinas", "Pradera de América del Norte", "Pradera de Mongolia"), "Geografía", "La estepa de Asia Central, también llamada estepa euroasiática, se extiende por casi 8.000 km desde Hungría hasta Mongolia, lo que la convierte en el ecosistema de estepa más grande del mundo.")
        ),
        BilingualQuestion(
            id = 9966, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve d'eau douce du monde?", listOf("Lac Baïkal", "Grand Lac des Esclaves", "Lac Tanganyika", "Lac Victoria"), "Géographie", "Le lac Baïkal, en Sibérie, contient environ 20% des réserves d'eau douce non gelée de la planète, ce qui en fait le plus grand réservoir d'eau douce liquide au monde."),
            en = LocalizedContent("What is the largest freshwater reserve in the world?", listOf("Lake Baikal", "Great Slave Lake", "Lake Tanganyika", "Lake Victoria"), "Geography", "Lake Baikal in Siberia contains about 20% of the world's unfrozen freshwater, making it the largest liquid freshwater reservoir on the planet."),
            zh = LocalizedContent("世界上最大的淡水储备是什么？", listOf("贝加尔湖", "大奴湖", "坦噶尼喀湖", "维多利亚湖"), "地理", "西伯利亚的贝加尔湖拥有全球约20%的未冻结淡水，是世界上最大的液态淡水储备。"),
            es = LocalizedContent("¿Cuál es la mayor reserva de agua dulce del mundo?", listOf("Lago Baikal", "Gran Lago del Esclavo", "Lago Tanganyika", "Lago Victoria"), "Geografía", "El lago Baikal, en Siberia, contiene aproximadamente el 20% del agua dulce no congelada del planeta, lo que lo convierte en el mayor reservorio de agua dulce líquida del mundo.")
        ),
        BilingualQuestion(
            id = 9967, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de pétrole du monde?", listOf("Arabie Saoudite", "Venezuela", "Canada", "Russie"), "Géographie", "L'Arabie Saoudite possède les plus grandes réserves de pétrole conventionnel prouvées au monde, estimées à environ 267 milliards de barils, principalement concentrées dans le champ de Ghawar."),
            en = LocalizedContent("What is the largest oil reserve in the world?", listOf("Saudi Arabia", "Venezuela", "Canada", "Russia"), "Geography", "Saudi Arabia has the largest proven conventional oil reserves in the world, estimated at about 267 billion barrels, mainly concentrated in the Ghawar field."),
            zh = LocalizedContent("世界上最大的石油储备是什么？", listOf("沙特阿拉伯", "委内瑞拉", "加拿大", "俄罗斯"), "地理", "沙特阿拉伯拥有世界上最大的已探明常规石油储量，估计约2670亿桶，主要集中在加瓦尔油田。"),
            es = LocalizedContent("¿Cuál es la mayor reserva de petróleo del mundo?", listOf("Arabia Saudita", "Venezuela", "Canadá", "Rusia"), "Geografía", "Arabia Saudita posee las mayores reservas probadas de petróleo convencional del mundo, estimadas en unos 267 mil millones de barriles, concentradas principalmente en el campo de Ghawar.")
        ),
        BilingualQuestion(
            id = 9968, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de gaz naturel du monde?", listOf("Russie", "Iran", "Qatar", "Turkménistan"), "Géographie", "La Russie possède les plus grandes réserves de gaz naturel au monde, estimées à environ 1 688 milliards de mètres cubes, principalement situées en Sibérie occidentale."),
            en = LocalizedContent("What is the largest natural gas reserve in the world?", listOf("Russia", "Iran", "Qatar", "Turkmenistan"), "Geography", "Russia has the largest natural gas reserves in the world, estimated at about 1,688 trillion cubic meters, mainly located in Western Siberia."),
            zh = LocalizedContent("世界上最大的天然气储备是什么？", listOf("俄罗斯", "伊朗", "卡塔尔", "土库曼斯坦"), "地理", "俄罗斯拥有世界上最大的天然气储量，估计约1.688万亿立方米，主要位于西西伯利亚。"),
            es = LocalizedContent("¿Cuál es la mayor reserva de gas natural del mundo?", listOf("Rusia", "Irán", "Catar", "Turkmenistán"), "Geografía", "Rusia posee las mayores reservas de gas natural del mundo, estimadas en aproximadamente 1.688 billones de metros cúbicos, ubicadas principalmente en Siberia Occidental.")
        ),
        BilingualQuestion(
            id = 9969, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de minerai de fer du monde?", listOf("Brésil", "Australie", "Chine", "Inde"), "Géographie", "La mine de Carajás, au nord du Brésil, est la plus grande réserve de minerai de fer au monde, avec des milliards de tonnes de minerai à haute teneur."),
            en = LocalizedContent("What is the largest iron ore reserve in the world?", listOf("Brazil", "Australia", "China", "India"), "Geography", "The Carajás mine in northern Brazil is the largest iron ore reserve in the world, with billions of tons of high-grade ore."),
            zh = LocalizedContent("世界上最大的铁矿储备是什么？", listOf("巴西", "澳大利亚", "中国", "印度"), "地理", "巴西北部的卡拉加斯矿是世界上最大的铁矿储备，拥有数十亿吨高品位矿石。"),
            es = LocalizedContent("¿Cuál es la mayor reserva de mineral de hierro del mundo?", listOf("Brasil", "Australia", "China", "India"), "Geografía", "La mina de Carajás, en el norte de Brasil, es la mayor reserva de mineral de hierro del mundo, con miles de millones de toneladas de mineral de alta ley.")
        ),
        BilingualQuestion(
            id = 9970, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve d'or du monde?", listOf("Australie", "Russie", "Canada", "États-Unis"), "Géographie", "L'Australie possède les plus grandes réserves d'or au monde, estimées à environ 8 400 tonnes, principalement concentrées dans la région de Kalgoorlie."),
            en = LocalizedContent("Which country has the largest gold reserves in the world?", listOf("Australia", "Russia", "Canada", "United States"), "Geography", "Australia has the largest gold reserves in the world, estimated at about 8,400 tonnes, mainly concentrated in the Kalgoorlie region."),
            zh = LocalizedContent("世界上最大的黄金储备国是哪个？", listOf("澳大利亚", "俄罗斯", "加拿大", "美国"), "地理", "澳大利亚拥有世界上最大的黄金储备，估计约8400吨，主要集中在卡尔古利地区。"),
            es = LocalizedContent("¿Qué país tiene las mayores reservas de oro del mundo?", listOf("Australia", "Rusia", "Canadá", "Estados Unidos"), "Geografía", "Australia posee las mayores reservas de oro del mundo, estimadas en unas 8.400 toneladas, concentradas principalmente en la región de Kalgoorlie.")
        ),
        BilingualQuestion(
            id = 9971, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de diamants du monde?", listOf("Russie", "Botswana", "Afrique du Sud", "Angola"), "Géographie", "La Russie abrite le plus grand gisement de diamants au monde, situé dans la mine de Mirny en Sibérie, ainsi que le champ de kimberlite de Popigaï, l'un des plus vastes."),
            en = LocalizedContent("Which country has the largest diamond reserves in the world?", listOf("Russia", "Botswana", "South Africa", "Angola"), "Geography", "Russia has the largest diamond deposits in the world, located in the Mirny mine in Siberia and the Popigai kimberlite field, one of the largest."),
            zh = LocalizedContent("世界上最大的钻石储备国是哪个？", listOf("俄罗斯", "博茨瓦纳", "南非", "安哥拉"), "地理", "俄罗斯拥有世界上最大的钻石矿床，位于西伯利亚的米尔内矿和波皮盖金伯利岩田，后者是最大的之一。"),
            es = LocalizedContent("¿Qué país tiene las mayores reservas de diamantes del mundo?", listOf("Rusia", "Botsuana", "Sudáfrica", "Angola"), "Geografía", "Rusia alberga los mayores yacimientos de diamantes del mundo, situados en la mina de Mirny en Siberia y el campo de kimberlita de Popigái, uno de los más grandes.")
        ),
        BilingualQuestion(
            id = 9972, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de charbon du monde?", listOf("Chine", "Australie", "Inde", "États-Unis"), "Géographie", "Les États-Unis possèdent les plus grandes réserves de charbon au monde, estimées à environ 250 milliards de tonnes, principalement dans les bassins des Appalaches, de l'Illinois et du Powder River."),
            en = LocalizedContent("Which country has the largest coal reserves in the world?", listOf("China", "Australia", "India", "United States"), "Geography", "The United States has the largest coal reserves in the world, estimated at about 250 billion tons, mainly in the Appalachian, Illinois, and Powder River basins."),
            zh = LocalizedContent("世界上最大的煤炭储备国是哪个？", listOf("中国", "澳大利亚", "印度", "美国"), "地理", "美国拥有世界上最大的煤炭储量，估计约2500亿吨，主要分布在阿巴拉契亚、伊利诺伊和粉河盆地。"),
            es = LocalizedContent("¿Qué país tiene las mayores reservas de carbón del mundo?", listOf("China", "Australia", "India", "Estados Unidos"), "Geografía", "Estados Unidos posee las mayores reservas de carbón del mundo, estimadas en unos 250 mil millones de toneladas, principalmente en las cuencas de los Apalaches, Illinois y Powder River.")
        ),
        BilingualQuestion(
            id = 9973, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de cuivre du monde?", listOf("Chili", "Pérou", "Zambie", "Congokassai"), "Géographie", "Le Chili abrite la plus grande réserve de cuivre au monde, avec la mine d'Escondida, qui est la plus grande mine de cuivre à ciel ouvert. Ce pays domine la production mondiale de cuivre depuis des décennies."),
            en = LocalizedContent("Which country has the largest copper reserves in the world?", listOf("Chile", "Peru", "Zambia", "Congo"), "Geography", "Chile has the largest copper reserves in the world, with the Escondida mine being the largest open-pit copper mine. The country has dominated global copper production for decades."),
            zh = LocalizedContent("世界上最大的铜储备国是哪个？", listOf("智利", "秘鲁", "赞比亚", "刚果"), "地理", "智利拥有世界上最大的铜储量，埃斯康迪达矿是最大的露天铜矿。该国几十年来一直主导全球铜生产。"),
            es = LocalizedContent("¿Qué país tiene las mayores reservas de cobre del mundo?", listOf("Chile", "Perú", "Zambia", "Congo"), "Geografía", "Chile posee las mayores reservas de cobre del mundo, con la mina Escondida, la mina de cobre a cielo abierto más grande. Este país ha dominado la producción mundial de cobre durante décadas.")
        ),
        BilingualQuestion(
            id = 9974, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve d'uranium du monde?", listOf("Kazakhstan", "Australie", "Canada", "Namibie"), "Géographie", "Le Kazakhstan possède les plus grandes réserves d'uranium au monde, avec environ 12% des ressources mondiales, et est le premier producteur depuis 2009."),
            en = LocalizedContent("Which country has the largest uranium reserves in the world?", listOf("Kazakhstan", "Australia", "Canada", "Namibia"), "Geography", "Kazakhstan has the largest uranium reserves in the world, with about 12% of global resources, and has been the top producer since 2009."),
            zh = LocalizedContent("世界上最大的铀储备国是哪个？", listOf("哈萨克斯坦", "澳大利亚", "加拿大", "纳米比亚"), "地理", "哈萨克斯坦拥有世界上最大的铀储量，约占全球资源的12%，自2009年以来一直是最大的生产国。"),
            es = LocalizedContent("¿Qué país tiene las mayores reservas de uranio del mundo?", listOf("Kazajistán", "Australia", "Canadá", "Namibia"), "Geografía", "Kazajistán posee las mayores reservas de uranio del mundo, con aproximadamente el 12% de los recursos mundiales, y es el principal productor desde 2009.")
        ),
        BilingualQuestion(
            id = 9975, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de cobalt du monde?", listOf("République Démocratique du Congo", "Zambie", "Russie", "Australie"), "Géographie", "La République Démocratique du Congo possède environ 70% des réserves mondiales de cobalt, principalement dans la région du Katanga."),
            en = LocalizedContent("Which country has the largest cobalt reserves in the world?", listOf("Democratic Republic of the Congo", "Zambia", "Russia", "Australia"), "Geography", "The Democratic Republic of the Congo holds about 70% of the world's cobalt reserves, mainly in the Katanga region."),
            zh = LocalizedContent("世界上最大的钴储备国是哪个？", listOf("刚果民主共和国", "赞比亚", "俄罗斯", "澳大利亚"), "地理", "刚果民主共和国拥有全球约70%的钴储量，主要分布在加丹加地区。"),
            es = LocalizedContent("¿Qué país tiene las mayores reservas de cobalto del mundo?", listOf("República Democrática del Congo", "Zambia", "Rusia", "Australia"), "Geografía", "La República Democrática del Congo posee aproximadamente el 70% de las reservas mundiales de cobalto, principalmente en la región de Katanga.")
        ),
        BilingualQuestion(
            id = 9976, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de lithium du monde?", listOf("Chili", "Australie", "Argentine", "Chine"), "Géographie", "Le Chili abrite le Salar de Atacama, qui contient les plus grandes réserves de lithium connues au monde, représentant environ 40% de la production mondiale."),
            en = LocalizedContent("Which country has the largest lithium reserves in the world?", listOf("Chile", "Australia", "Argentina", "China"), "Geography", "Chile's Salar de Atacama contains the largest known lithium reserves in the world, accounting for about 40% of global production."),
            zh = LocalizedContent("世界上最大的锂储备国是哪个？", listOf("智利", "澳大利亚", "阿根廷", "中国"), "地理", "智利的阿塔卡马盐沼拥有世界上已知最大的锂储量，约占全球产量的40%。"),
            es = LocalizedContent("¿Qué país tiene las mayores reservas de litio del mundo?", listOf("Chile", "Australia", "Argentina", "China"), "Geografía", "El Salar de Atacama en Chile contiene las mayores reservas de litio conocidas del mundo, representando aproximadamente el 40% de la producción mundial.")
        ),
        BilingualQuestion(
            id = 9977, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de terres rares du monde?", listOf("Chine", "États-Unis", "Myanmar", "Russie"), "Géographie", "La Chine possède les plus grandes réserves de terres rares au monde, concentrées principalement en Mongolie-Intérieure, et domine leur production et exportation."),
            en = LocalizedContent("Which country has the largest rare earth reserves in the world?", listOf("China", "United States", "Myanmar", "Russia"), "Geography", "China has the largest rare earth reserves in the world, mainly concentrated in Inner Mongolia, and dominates their production and export."),
            zh = LocalizedContent("世界上最大的稀土储备国是哪个？", listOf("中国", "美国", "缅甸", "俄罗斯"), "地理", "中国拥有世界上最大的稀土储量，主要集中在内蒙古，并主导其生产和出口。"),
            es = LocalizedContent("¿Qué país tiene las mayores reservas de tierras raras del mundo?", listOf("China", "Estados Unidos", "Myanmar", "Rusia"), "Geografía", "China posee las mayores reservas de tierras raras del mundo, concentradas principalmente en Mongolia Interior, y domina su producción y exportación.")
        ),
        BilingualQuestion(
            id = 9978, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de soufre du monde?", listOf("Pologne", "Russie", "Canada", "Irak"), "Géographie", "La Pologne possède les plus grandes réserves de soufre au monde, notamment dans la région de Tarnobrzeg, où se trouvait la mine de soufre de Machów, l'une des plus importantes jamais exploitées."),
            en = LocalizedContent("Which country has the largest sulfur reserves in the world?", listOf("Poland", "Russia", "Canada", "Iraq"), "Geography", "Poland has the largest sulfur reserves in the world, notably in the Tarnobrzeg region, where the Machów sulfur mine, one of the largest ever exploited, was located."),
            zh = LocalizedContent("世界上最大的硫储备国是哪个？", listOf("波兰", "俄罗斯", "加拿大", "伊拉克"), "地理", "波兰拥有世界上最大的硫储量，特别是在塔尔诺布热格地区，那里曾拥有马霍夫硫矿，是历史上最大的硫矿之一。"),
            es = LocalizedContent("¿Qué país tiene las mayores reservas de azufre del mundo?", listOf("Polonia", "Rusia", "Canadá", "Irak"), "Geografía", "Polonia posee las mayores reservas de azufre del mundo, especialmente en la región de Tarnobrzeg, donde se encontraba la mina de azufre de Machów, una de las más grandes jamás explotadas.")
        ),
        BilingualQuestion(
            id = 9979, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de potasse du monde?", listOf("Canada", "Russie", "Biélorussie", "Israël"), "Géographie", "Le Canada possède la plus grande réserve de potasse au monde, située principalement en Saskatchewan, où se trouvent d'immenses gisements souterrains."),
            en = LocalizedContent("Which country has the largest potash reserves in the world?", listOf("Canada", "Russia", "Belarus", "Israel"), "Geography", "Canada has the largest potash reserves in the world, mainly located in Saskatchewan, where vast underground deposits are found."),
            zh = LocalizedContent("世界上最大的钾盐储备国是哪个？", listOf("加拿大", "俄罗斯", "白俄罗斯", "以色列"), "地理", "加拿大拥有世界上最大的钾盐储量，主要位于萨斯喀彻温省，那里有巨大的地下矿床。"),
            es = LocalizedContent("¿Qué país tiene las mayores reservas de potasa del mundo?", listOf("Canadá", "Rusia", "Bielorrusia", "Israel"), "Geografía", "Canadá posee la mayor reserva de potasa del mundo, situada principalmente en Saskatchewan, donde se encuentran enormes depósitos subterráneos.")
        ),
        BilingualQuestion(
            id = 9980, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de phosphates du monde?", listOf("Maroc", "Chine", "Russie", "États-Unis"), "Géographie", "Le Maroc possède les plus grandes réserves mondiales de phosphates, concentrées principalement dans la région de Khouribga. Ces gisements représentent environ 70% des réserves mondiales."),
            en = LocalizedContent("Which country has the largest phosphate reserves in the world?", listOf("Morocco", "China", "Russia", "United States"), "Geography", "Morocco holds the world's largest phosphate reserves, mainly concentrated in the Khouribga region, accounting for about 70% of global reserves."),
            zh = LocalizedContent("世界上最大的磷酸盐储量在哪个国家？", listOf("摩洛哥", "中国", "俄罗斯", "美国"), "地理", "摩洛哥拥有世界上最大的磷酸盐储量，主要集中在胡里卜盖地区，约占全球储量的70%。"),
            es = LocalizedContent("¿Cuál es el país con las mayores reservas de fosfato del mundo?", listOf("Marruecos", "China", "Rusia", "Estados Unidos"), "Geografía", "Marruecos posee las mayores reservas mundiales de fosfato, concentradas principalmente en la región de Khouribga, representando aproximadamente el 70% de las reservas globales.")
        ),
        BilingualQuestion(
            id = 9981, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de nickel du monde?", listOf("Indonésie", "Russie", "Australie", "Philippines"), "Géographie", "L'Indonésie possède les plus grandes réserves de nickel au monde, principalement situées dans la région de Sulawesi. Ce minerai est essentiel pour la fabrication des batteries de véhicules électriques."),
            en = LocalizedContent("Which country has the largest nickel reserves in the world?", listOf("Indonesia", "Russia", "Australia", "Philippines"), "Geography", "Indonesia has the world's largest nickel reserves, mainly located in the Sulawesi region. This mineral is essential for manufacturing electric vehicle batteries."),
            zh = LocalizedContent("世界上最大的镍储量在哪个国家？", listOf("印度尼西亚", "俄罗斯", "澳大利亚", "菲律宾"), "地理", "印度尼西亚拥有世界上最大的镍储量，主要位于苏拉威西地区。这种矿物对制造电动汽车电池至关重要。"),
            es = LocalizedContent("¿Cuál es el país con las mayores reservas de níquel del mundo?", listOf("Indonesia", "Rusia", "Australia", "Filipinas"), "Geografía", "Indonesia posee las mayores reservas de níquel del mundo, principalmente en la región de Sulawesi. Este mineral es esencial para la fabricación de baterías de vehículos eléctricos.")
        ),
        BilingualQuestion(
            id = 9982, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de zinc du monde?", listOf("Australie", "Chine", "Pérou", "Canada"), "Géographie", "L'Australie possède les plus grandes réserves de zinc au monde, principalement situées dans la région de Mount Isa et le gisement de McArthur River."),
            en = LocalizedContent("Which country has the largest zinc reserves in the world?", listOf("Australia", "China", "Peru", "Canada"), "Geography", "Australia has the world's largest zinc reserves, mainly in the Mount Isa region and the McArthur River deposit."),
            zh = LocalizedContent("世界上最大的锌储量在哪个国家？", listOf("澳大利亚", "中国", "秘鲁", "加拿大"), "地理", "澳大利亚拥有世界上最大的锌储量，主要位于芒特艾萨地区和麦克阿瑟河矿床。"),
            es = LocalizedContent("¿Cuál es el país con las mayores reservas de zinc del mundo?", listOf("Australia", "China", "Perú", "Canadá"), "Geografía", "Australia posee las mayores reservas de zinc del mundo, principalmente en la región de Mount Isa y el depósito de McArthur River.")
        ),
        BilingualQuestion(
            id = 9983, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de plomb du monde?", listOf("Australie", "Chine", "Pérou", "États-Unis"), "Géographie", "L'Australie possède les plus grandes réserves mondiales de plomb, concentrées principalement dans le gisement de Mount Isa, dans le Queensland."),
            en = LocalizedContent("Which country has the largest lead reserves in the world?", listOf("Australia", "China", "Peru", "United States"), "Geography", "Australia has the world's largest lead reserves, concentrated mainly in the Mount Isa deposit in Queensland."),
            zh = LocalizedContent("世界上最大的铅储量在哪个国家？", listOf("澳大利亚", "中国", "秘鲁", "美国"), "地理", "澳大利亚拥有世界上最大的铅储量，主要集中在昆士兰州的芒特艾萨矿床。"),
            es = LocalizedContent("¿Cuál es el país con las mayores reservas de plomo del mundo?", listOf("Australia", "China", "Perú", "Estados Unidos"), "Geografía", "Australia posee las mayores reservas de plomo del mundo, concentradas principalmente en el depósito de Mount Isa en Queensland.")
        ),
        BilingualQuestion(
            id = 9984, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve d'étain du monde?", listOf("Malaisie", "Indonésie", "Chine", "Pérou"), "Géographie", "La Malaisie possède les plus grandes réserves d'étain au monde, principalement concentrées dans la région de la vallée de Kinta."),
            en = LocalizedContent("Which country has the largest tin reserves in the world?", listOf("Malaysia", "Indonesia", "China", "Peru"), "Geography", "Malaysia has the world's largest tin reserves, mainly concentrated in the Kinta Valley region."),
            zh = LocalizedContent("世界上最大的锡储量在哪个国家？", listOf("马来西亚", "印度尼西亚", "中国", "秘鲁"), "地理", "马来西亚拥有世界上最大的锡储量，主要集中在近打谷地区。"),
            es = LocalizedContent("¿Cuál es el país con las mayores reservas de estaño del mundo?", listOf("Malasia", "Indonesia", "China", "Perú"), "Geografía", "Malasia posee las mayores reservas de estaño del mundo, concentradas principalmente en la región del Valle de Kinta.")
        ),
        BilingualQuestion(
            id = 9985, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de bauxite du monde?", listOf("Australie", "Guinée", "Brésil", "Jamaïque"), "Géographie", "L'Australie possède les plus grandes réserves de bauxite au monde, principalement dans la région de Weipa et du plateau de Gove, représentant environ 20% des réserves mondiales."),
            en = LocalizedContent("Which country has the largest bauxite reserves in the world?", listOf("Australia", "Guinea", "Brazil", "Jamaica"), "Geography", "Australia has the world's largest bauxite reserves, mainly in the Weipa region and the Gove Plateau, representing about 20% of global reserves."),
            zh = LocalizedContent("世界上最大的铝土矿储量在哪个国家？", listOf("澳大利亚", "几内亚", "巴西", "牙买加"), "地理", "澳大利亚拥有世界上最大的铝土矿储量，主要位于韦帕地区和戈夫高原，约占全球储量的20%。"),
            es = LocalizedContent("¿Cuál es el país con las mayores reservas de bauxita del mundo?", listOf("Australia", "Guinea", "Brasil", "Jamaica"), "Geografía", "Australia posee las mayores reservas de bauxita del mundo, principalmente en la región de Weipa y la meseta de Gove, representando aproximadamente el 20% de las reservas globales.")
        ),
        BilingualQuestion(
            id = 9986, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de manganèse du monde?", listOf("Afrique du Sud", "Australie", "Chine", "Inde"), "Géographie", "L'Afrique du Sud possède environ 80% des réserves mondiales de manganèse, principalement dans le bassin du Kalahari."),
            en = LocalizedContent("Which country has the largest manganese reserves in the world?", listOf("South Africa", "Australia", "China", "India"), "Geography", "South Africa holds about 80% of the world's manganese reserves, mainly in the Kalahari Basin."),
            zh = LocalizedContent("世界上最大的锰储量在哪个国家？", listOf("南非", "澳大利亚", "中国", "印度"), "地理", "南非拥有世界上约80%的锰储量，主要位于卡拉哈里盆地。"),
            es = LocalizedContent("¿Cuál es el país con las mayores reservas de manganeso del mundo?", listOf("Sudáfrica", "Australia", "China", "India"), "Geografía", "Sudáfrica posee aproximadamente el 80% de las reservas mundiales de manganeso, principalmente en la cuenca del Kalahari.")
        ),
        BilingualQuestion(
            id = 9987, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de chrome du monde?", listOf("Afrique du Sud", "Kazakhstan", "Inde", "Zimbabwe"), "Géographie", "L'Afrique du Sud possède environ 70% des réserves mondiales de chrome, principalement dans le complexe du Bushveld, ce qui en fait le premier producteur et exportateur mondial de ce minerai essentiel pour la production d'acier inoxydable."),
            en = LocalizedContent("Which country has the largest chromium reserves in the world?", listOf("South Africa", "Kazakhstan", "India", "Zimbabwe"), "Geography", "South Africa holds about 70% of the world's chromium reserves, mainly in the Bushveld Complex, making it the leading producer and exporter of this mineral essential for stainless steel production."),
            zh = LocalizedContent("世界上最大的铬储量在哪个国家？", listOf("南非", "哈萨克斯坦", "印度", "津巴布韦"), "地理", "南非拥有世界上约70%的铬储量，主要位于布什维尔德杂岩体，使其成为这种不锈钢生产必需矿物的主要生产国和出口国。"),
            es = LocalizedContent("¿Cuál es el país con las mayores reservas de cromo del mundo?", listOf("Sudáfrica", "Kazajistán", "India", "Zimbabue"), "Geografía", "Sudáfrica posee aproximadamente el 70% de las reservas mundiales de cromo, principalmente en el Complejo de Bushveld, lo que lo convierte en el principal productor y exportador de este mineral esencial para la producción de acero inoxidable.")
        ),
        BilingualQuestion(
            id = 9988, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de molybdène du monde?", listOf("Chine", "Chili", "États-Unis", "Pérou"), "Géographie", "La Chine possède les plus grandes réserves mondiales de molybdène, principalement concentrées dans la province du Henan, représentant environ 40% des ressources totales de la planète."),
            en = LocalizedContent("Which country has the largest molybdenum reserves in the world?", listOf("China", "Chile", "United States", "Peru"), "Geography", "China has the world's largest molybdenum reserves, mainly concentrated in Henan Province, representing about 40% of total global resources."),
            zh = LocalizedContent("世界上最大的钼储量在哪个国家？", listOf("中国", "智利", "美国", "秘鲁"), "地理", "中国拥有世界上最大的钼储量，主要集中在河南省，约占全球总资源的40%。"),
            es = LocalizedContent("¿Cuál es el país con las mayores reservas de molibdeno del mundo?", listOf("China", "Chile", "Estados Unidos", "Perú"), "Geografía", "China posee las mayores reservas de molibdeno del mundo, concentradas principalmente en la provincia de Henan, representando aproximadamente el 40% de los recursos totales del planeta.")
        ),
        BilingualQuestion(
            id = 9989, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de vanadium du monde?", listOf("Chine", "Afrique du Sud", "Russie", "Canada"), "Géographie", "La Chine possède les plus grandes réserves de vanadium au monde, principalement concentrées dans la province du Sichuan et dans la région autonome du Panzhihua."),
            en = LocalizedContent("Which country has the largest vanadium reserves in the world?", listOf("China", "South Africa", "Russia", "Canada"), "Geography", "China has the world's largest vanadium reserves, mainly concentrated in Sichuan Province and the Panzhihua autonomous region."),
            zh = LocalizedContent("世界上最大的钒储量在哪个国家？", listOf("中国", "南非", "俄罗斯", "加拿大"), "地理", "中国拥有世界上最大的钒储量，主要集中在四川省和攀枝花地区。"),
            es = LocalizedContent("¿Cuál es el país con las mayores reservas de vanadio del mundo?", listOf("China", "Sudáfrica", "Rusia", "Canadá"), "Geografía", "China posee las mayores reservas de vanadio del mundo, concentradas principalmente en la provincia de Sichuan y la región autónoma de Panzhihua.")
        ),
        BilingualQuestion(
            id = 9990, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de tungstène du monde?", listOf("Chine", "Canada", "Russie", "Corée du Nord"), "Géographie", "La Chine possède les plus grandes réserves mondiales de tungstène, concentrées principalement dans la province du Jiangxi, représentant environ 60% des ressources globales."),
            en = LocalizedContent("Which country has the world's largest tungsten reserves?", listOf("China", "Canada", "Russia", "North Korea"), "Geography", "China holds the world's largest tungsten reserves, mainly concentrated in Jiangxi province, accounting for about 60% of global resources."),
            zh = LocalizedContent("世界上最大的钨储量在哪个国家？", listOf("中国", "加拿大", "俄罗斯", "朝鲜"), "地理", "中国拥有世界上最大的钨储量，主要集中在江西省，约占全球资源的60%。"),
            es = LocalizedContent("¿Qué país tiene las mayores reservas de tungsteno del mundo?", listOf("China", "Canadá", "Rusia", "Corea del Norte"), "Geografía", "China posee las mayores reservas mundiales de tungsteno, concentradas principalmente en la provincia de Jiangxi, representando aproximadamente el 60% de los recursos globales.")
        ),
        BilingualQuestion(
            id = 9991, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de mercure du monde?", listOf("Chine", "Russie", "Kirghizistan", "Espagne"), "Géographie", "La Chine possède les plus grandes réserves de mercure au monde, notamment dans la province du Guizhou, qui abrite d'importants gisements."),
            en = LocalizedContent("Which country has the world's largest mercury reserves?", listOf("China", "Russia", "Kyrgyzstan", "Spain"), "Geography", "China has the world's largest mercury reserves, notably in Guizhou province, which hosts significant deposits."),
            zh = LocalizedContent("世界上最大的汞储量在哪个国家？", listOf("中国", "俄罗斯", "吉尔吉斯斯坦", "西班牙"), "地理", "中国拥有世界上最大的汞储量，特别是在贵州省，那里有重要的矿床。"),
            es = LocalizedContent("¿Qué país tiene las mayores reservas de mercurio del mundo?", listOf("China", "Rusia", "Kirguistán", "España"), "Geografía", "China posee las mayores reservas de mercurio del mundo, especialmente en la provincia de Guizhou, que alberga importantes yacimientos.")
        ),
        BilingualQuestion(
            id = 9992, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve d'argent du monde?", listOf("Pologne", "Pérou", "Chine", "Australie"), "Géographie", "La Pologne possède les plus grandes réserves d'argent au monde, principalement dans la mine de Lubin, qui fait partie du bassin cuprifère de Basse-Silésie."),
            en = LocalizedContent("Which country has the world's largest silver reserves?", listOf("Poland", "Peru", "China", "Australia"), "Geography", "Poland has the world's largest silver reserves, mainly at the Lubin mine, part of the Lower Silesian copper basin."),
            zh = LocalizedContent("世界上最大的银储量在哪个国家？", listOf("波兰", "秘鲁", "中国", "澳大利亚"), "地理", "波兰拥有世界上最大的银储量，主要位于卢宾矿，属于下西里西亚铜盆地的一部分。"),
            es = LocalizedContent("¿Qué país tiene las mayores reservas de plata del mundo?", listOf("Polonia", "Perú", "China", "Australia"), "Geografía", "Polonia posee las mayores reservas de plata del mundo, principalmente en la mina de Lubin, que forma parte de la cuenca cuprífera de Baja Silesia.")
        ),
        BilingualQuestion(
            id = 9993, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de platine du monde?", listOf("Afrique du Sud", "Russie", "Zimbabwe", "Canada"), "Géographie", "L'Afrique du Sud possède le complexe igné du Bushveld, qui contient environ 70% des réserves mondiales de platine, ce qui en fait le plus grand gisement connu."),
            en = LocalizedContent("Which country has the world's largest platinum reserves?", listOf("South Africa", "Russia", "Zimbabwe", "Canada"), "Geography", "South Africa's Bushveld Igneous Complex contains about 70% of the world's platinum reserves, making it the largest known deposit."),
            zh = LocalizedContent("世界上最大的铂储量在哪个国家？", listOf("南非", "俄罗斯", "津巴布韦", "加拿大"), "地理", "南非的布什维尔德火成杂岩体拥有全球约70%的铂储量，是已知最大的矿床。"),
            es = LocalizedContent("¿Qué país tiene las mayores reservas de platino del mundo?", listOf("Sudáfrica", "Rusia", "Zimbabue", "Canadá"), "Geografía", "El Complejo Ígneo de Bushveld en Sudáfrica contiene aproximadamente el 70% de las reservas mundiales de platino, lo que lo convierte en el yacimiento más grande conocido.")
        ),
        BilingualQuestion(
            id = 9994, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve d'iridium du monde?", listOf("Afrique du Sud", "Russie", "Zimbabwe", "Canada"), "Géographie", "L'Afrique du Sud possède les plus grandes réserves mondiales d'iridium, principalement dans le complexe igné du Bushveld, qui concentre l'essentiel des ressources de ce métal rare du groupe du platine."),
            en = LocalizedContent("Which country has the world's largest iridium reserves?", listOf("South Africa", "Russia", "Zimbabwe", "Canada"), "Geography", "South Africa has the world's largest iridium reserves, primarily in the Bushveld Igneous Complex, which concentrates most of this rare platinum group metal."),
            zh = LocalizedContent("世界上最大的铱储量在哪个国家？", listOf("南非", "俄罗斯", "津巴布韦", "加拿大"), "地理", "南非拥有世界上最大的铱储量，主要分布在布什维尔德火成杂岩体，该地区集中了这种稀有铂族金属的大部分资源。"),
            es = LocalizedContent("¿Qué país tiene las mayores reservas de iridio del mundo?", listOf("Sudáfrica", "Rusia", "Zimbabue", "Canadá"), "Geografía", "Sudáfrica posee las mayores reservas mundiales de iridio, principalmente en el Complejo Ígneo de Bushveld, que concentra la mayor parte de los recursos de este raro metal del grupo del platino.")
        ),
        BilingualQuestion(
            id = 9995, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de palladium du monde?", listOf("Russie", "Afrique du South", "Canada", "Zimbabwe"), "Géographie", "La Russie possède les plus grandes réserves de palladium au monde, principalement dans la région de Norilsk, où se trouve le plus important gisement de ce métal rare."),
            en = LocalizedContent("Which country has the world's largest palladium reserves?", listOf("Russia", "South Africa", "Canada", "Zimbabwe"), "Geography", "Russia has the world's largest palladium reserves, mainly in the Norilsk region, which hosts the most significant deposit of this rare metal."),
            zh = LocalizedContent("世界上最大的钯储量在哪个国家？", listOf("俄罗斯", "南非", "加拿大", "津巴布韦"), "地理", "俄罗斯拥有世界上最大的钯储量，主要位于诺里尔斯克地区，那里有这种稀有金属最重要的矿床。"),
            es = LocalizedContent("¿Qué país tiene las mayores reservas de paladio del mundo?", listOf("Rusia", "Sudáfrica", "Canadá", "Zimbabue"), "Geografía", "Rusia posee las mayores reservas de paladio del mundo, principalmente en la región de Norilsk, donde se encuentra el yacimiento más importante de este metal raro.")
        ),
        BilingualQuestion(
            id = 9996, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de rhénium du monde?", listOf("Chili", "Pérou", "États-Unis", "Mongolie"), "Géographie", "Le Chili possède les plus grandes réserves de rhénium au monde, principalement dans les gisements de cuivre porphyrique de la région d'Antofagasta."),
            en = LocalizedContent("Which country has the world's largest rhenium reserves?", listOf("Chile", "Peru", "United States", "Mongolia"), "Geography", "Chile has the world's largest rhenium reserves, mainly in porphyry copper deposits in the Antofagasta region."),
            zh = LocalizedContent("世界上最大的铼储量在哪个国家？", listOf("智利", "秘鲁", "美国", "蒙古"), "地理", "智利拥有世界上最大的铼储量，主要分布在安托法加斯塔地区的斑岩铜矿床中。"),
            es = LocalizedContent("¿Qué país tiene las mayores reservas de renio del mundo?", listOf("Chile", "Perú", "Estados Unidos", "Mongolia"), "Geografía", "Chile posee las mayores reservas de renio del mundo, principalmente en los depósitos de cobre porfídico de la región de Antofagasta.")
        ),
        BilingualQuestion(
            id = 9997, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de technétium du monde?", listOf("Moldavie", "Kirghizistan", "Belgique", "France"), "Géographie", "La Moldavie possède la plus grande réserve connue de technétium, un élément radioactif rare, principalement issu des déchets de réacteurs nucléaires."),
            en = LocalizedContent("Which country has the world's largest technetium reserves?", listOf("Moldova", "Kyrgyzstan", "Belgium", "France"), "Geography", "Moldova has the largest known technetium reserve, a rare radioactive element, primarily from nuclear reactor waste."),
            zh = LocalizedContent("世界上最大的锝储量在哪个国家？", listOf("摩尔多瓦", "吉尔吉斯斯坦", "比利时", "法国"), "地理", "摩尔多瓦拥有已知最大的锝储量，这是一种稀有放射性元素，主要来自核反应堆废料。"),
            es = LocalizedContent("¿Qué país tiene las mayores reservas de tecnecio del mundo?", listOf("Moldavia", "Kirguistán", "Bélgica", "Francia"), "Geografía", "Moldavia posee la mayor reserva conocida de tecnecio, un elemento radiactivo raro, principalmente procedente de residuos de reactores nucleares.")
        ),
        BilingualQuestion(
            id = 9998, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de ruthénium du monde?", listOf("Russie", "Afrique du Sud", "Canada", "Zimbabwe"), "Géographie", "La Russie possède les plus grandes réserves de ruthénium, principalement extraites dans les mines de la péninsule de Kola et de Sibérie. Ce métal rare du groupe du platine est un sous-produit du raffinage du nickel."),
            en = LocalizedContent("Which country has the world's largest ruthenium reserves?", listOf("Russia", "South Africa", "Canada", "Zimbabwe"), "Geography", "Russia has the largest ruthenium reserves, mainly extracted from mines on the Kola Peninsula and Siberia. This rare platinum group metal is a byproduct of nickel refining."),
            zh = LocalizedContent("世界上最大的钌储量在哪个国家？", listOf("俄罗斯", "南非", "加拿大", "津巴布韦"), "地理", "俄罗斯拥有最大的钌储量，主要从科拉半岛和西伯利亚的矿山中提取。这种稀有铂族金属是镍精炼的副产品。"),
            es = LocalizedContent("¿Qué país tiene las mayores reservas de rutenio del mundo?", listOf("Rusia", "Sudáfrica", "Canadá", "Zimbabue"), "Geografía", "Rusia posee las mayores reservas de rutenio, extraídas principalmente en las minas de la península de Kola y Siberia. Este raro metal del grupo del platino es un subproducto del refinado de níquel.")
        ),
        BilingualQuestion(
            id = 9999, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réserve de rhodium du monde?", listOf("Afrique du Sud", "Russie", "Zimbabwe", "Canada"), "Géographie", "L'Afrique du Sud possède environ 80% des réserves mondiales de rhodium, principalement dans le complexe du Bushveld."),
            en = LocalizedContent("Which country has the world's largest rhodium reserves?", listOf("South Africa", "Russia", "Zimbabwe", "Canada"), "Geography", "South Africa holds about 80% of the world's rhodium reserves, primarily in the Bushveld Complex."),
            zh = LocalizedContent("世界上最大的铑储量在哪个国家？", listOf("南非", "俄罗斯", "津巴布韦", "加拿大"), "地理", "南非拥有全球约80%的铑储量，主要分布在布什维尔德杂岩体。"),
            es = LocalizedContent("¿Qué país tiene las mayores reservas de rodio del mundo?", listOf("Sudáfrica", "Rusia", "Zimbabue", "Canadá"), "Geografía", "Sudáfrica posee aproximadamente el 80% de las reservas mundiales de rodio, principalmente en el Complejo de Bushveld.")
        ),
        BilingualQuestion(
            id = 10000, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le symbole de l'or sur le tableau périodique ?", listOf("Au", "Or", "Ag", "Go"), "Science", ""),
            en = LocalizedContent("What is the symbol for gold on the periodic table?", listOf("Au", "Or", "Ag", "Go"), "Science", ""),
            zh = LocalizedContent("金在元素周期表中的符号是什么？", listOf("Au", "Or", "Ag", "Go"), "科学", ""),
            es = LocalizedContent("¿Cuál es el símbolo del oro en la tabla periódica?", listOf("Au", "Or", "Ag", "Go"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 10001, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le noyau d'une cellule contient principalement ?", listOf("L'ADN (matériel génétique)", "Les ribosomes", "Les mitochondries", "Les lysosomes"), "Science", ""),
            en = LocalizedContent("What does the nucleus of a cell mainly contain?", listOf("DNA (genetic material)", "Ribosomes", "Mitochondria", "Lysosomes"), "Science", ""),
            zh = LocalizedContent("细胞核主要包含什么？", listOf("DNA（遗传物质）", "核糖体", "线粒体", "溶酶体"), "科学", ""),
            es = LocalizedContent("¿Qué contiene principalmente el núcleo de una célula?", listOf("ADN (material genético)", "Ribosomas", "Mitocondrias", "Lisosomas"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 10002, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nombre de pattes d'une araignée ?", listOf("8", "6", "10", "12"), "Science", ""),
            en = LocalizedContent("How many legs does a spider have?", listOf("8", "6", "10", "12"), "Science", ""),
            zh = LocalizedContent("蜘蛛有多少条腿？", listOf("8", "6", "10", "12"), "科学", ""),
            es = LocalizedContent("¿Cuántas patas tiene una araña?", listOf("8", "6", "10", "12"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 10003, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'osmose ?", listOf("Passage de l'eau d'une solution diluée vers concentrée via membrane semi-perméable", "Évaporation de l'eau", "Diffusion des sels minéraux", "Filtration mécanique"), "Science", ""),
            en = LocalizedContent("What is osmosis?", listOf("Passage of water from a dilute to a concentrated solution via a semi-permeable membrane", "Evaporation of water", "Diffusion of mineral salts", "Mechanical filtration"), "Science", ""),
            zh = LocalizedContent("什么是渗透作用？", listOf("水通过半透膜从稀溶液向浓溶液的移动", "水的蒸发", "矿物质的扩散", "机械过滤"), "科学", ""),
            es = LocalizedContent("¿Qué es la ósmosis?", listOf("Paso de agua de una solución diluida a una concentrada a través de una membrana semipermeable", "Evaporación del agua", "Difusión de sales minerales", "Filtración mecánica"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 10004, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a écrit 'Les Misérables'?", listOf("Alexandre Dumas", "Victor Hugo", "Gustave Flaubert", "Honoré de Balzac"), "Culture", "Victor Hugo a publié ce roman majeur en 1862, dépeignant les injustices sociales dans la France du XIXe siècle."),
            en = LocalizedContent("Who wrote 'Les Misérables'?", listOf("Alexandre Dumas", "Victor Hugo", "Gustave Flaubert", "Honoré de Balzac"), "Culture", "Victor Hugo published this major novel in 1862, depicting social injustices in 19th-century France."),
            zh = LocalizedContent("谁写了《悲惨世界》？", listOf("亚历山大·仲马", "维克多·雨果", "古斯塔夫·福楼拜", "奥诺雷·德·巴尔扎克"), "文化", "维克多·雨果于1862年出版了这部重要小说，描绘了19世纪法国的社会不公。"),
            es = LocalizedContent("¿Quién escribió 'Los Miserables'?", listOf("Alexandre Dumas", "Victor Hugo", "Gustave Flaubert", "Honoré de Balzac"), "Cultura", "Victor Hugo publicó esta novela mayor en 1862, retratando las injusticias sociales en la Francia del siglo XIX.")
        ),
        BilingualQuestion(
            id = 10005, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel organe humain filtre le sang et produit l'urine ?", listOf("Les reins", "Le foie", "La rate", "Le pancréas"), "Science", ""),
            en = LocalizedContent("Which human organ filters blood and produces urine?", listOf("Kidneys", "Liver", "Spleen", "Pancreas"), "Science", ""),
            zh = LocalizedContent("哪个人体器官过滤血液并产生尿液？", listOf("肾脏", "肝脏", "脾脏", "胰腺"), "科学", ""),
            es = LocalizedContent("¿Qué órgano humano filtra la sangre y produce orina?", listOf("Los riñones", "El hígado", "El bazo", "El páncreas"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 10006, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la gravité terrestre approximative ?", listOf("9,81 m/s²", "9,8 N/kg", "10 m/s²", "Les deux premières réponses sont correctes"), "Science", ""),
            en = LocalizedContent("What is the approximate Earth gravity?", listOf("9.81 m/s²", "9.8 N/kg", "10 m/s²", "Both first two answers are correct"), "Science", ""),
            zh = LocalizedContent("地球重力加速度大约是多少？", listOf("9.81 m/s²", "9.8 N/kg", "10 m/s²", "前两个答案都正确"), "科学", ""),
            es = LocalizedContent("¿Cuál es la gravedad terrestre aproximada?", listOf("9,81 m/s²", "9,8 N/kg", "10 m/s²", "Ambas primeras respuestas son correctas"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 10007, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le métal le plus léger du tableau périodique ?", listOf("Lithium (Li)", "Hydrogène (non-métal)", "Béryllium (Be)", "Sodium (Na)"), "Science", ""),
            en = LocalizedContent("What is the lightest metal on the periodic table?", listOf("Lithium (Li)", "Hydrogen (non-metal)", "Beryllium (Be)", "Sodium (Na)"), "Science", ""),
            zh = LocalizedContent("元素周期表中最轻的金属是什么？", listOf("锂（Li）", "氢（非金属）", "铍（Be）", "钠（Na）"), "科学", ""),
            es = LocalizedContent("¿Cuál es el metal más ligero de la tabla periódica?", listOf("Litio (Li)", "Hidrógeno (no metal)", "Berilio (Be)", "Sodio (Na)"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 10008, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la bioluminescence marine ?", listOf("Production de lumière par des organismes marins via réaction chimique", "Réflexion de la lumière solaire", "Phosphorescence des minéraux", "Fluorescence des coraux sous UV"), "Science", ""),
            en = LocalizedContent("What is marine bioluminescence?", listOf("Production of light by marine organisms via chemical reaction", "Reflection of sunlight", "Phosphorescence of minerals", "Fluorescence of corals under UV"), "Science", ""),
            zh = LocalizedContent("什么是海洋生物发光？", listOf("海洋生物通过化学反应产生光", "反射太阳光", "矿物的磷光", "珊瑚在紫外线下的荧光"), "科学", ""),
            es = LocalizedContent("¿Qué es la bioluminiscencia marina?", listOf("Producción de luz por organismos marinos mediante reacción química", "Reflexión de la luz solar", "Fosforescencia de minerales", "Fluorescencia de corales bajo UV"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 10009, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand organe interne du corps humain ?", listOf("Le foie", "Les poumons", "L'intestin grêle", "L'estomac"), "Science", ""),
            en = LocalizedContent("What is the largest internal organ in the human body?", listOf("Liver", "Lungs", "Small intestine", "Stomach"), "Science", ""),
            zh = LocalizedContent("人体最大的内脏器官是什么？", listOf("肝脏", "肺", "小肠", "胃"), "科学", ""),
            es = LocalizedContent("¿Cuál es el órgano interno más grande del cuerpo humano?", listOf("El hígado", "Los pulmones", "El intestino delgado", "El estómago"), "Ciencia", "")
        ),
    )

    private fun part2(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 10010, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un gaz noble ?", listOf("Élément du groupe 18, très stable et peu réactif", "Gaz précieux extrait des mines", "Gaz utilisé dans les moteurs nobles", "Élément de transition"), "Science", ""),
            en = LocalizedContent("What is a noble gas?", listOf("Element of group 18, very stable and unreactive", "Precious gas extracted from mines", "Gas used in noble engines", "Transition element"), "Science", ""),
            zh = LocalizedContent("什么是稀有气体？", listOf("第18族元素，非常稳定且不易反应", "从矿山中提取的珍贵气体", "用于高贵发动机的气体", "过渡元素"), "科学", ""),
            es = LocalizedContent("¿Qué es un gas noble?", listOf("Elemento del grupo 18, muy estable y poco reactivo", "Gas precioso extraído de minas", "Gas utilizado en motores nobles", "Elemento de transición"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 10011, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle planète du système solaire a la plus grande lune (Titan) ?", listOf("Saturne", "Jupiter", "Neptune", "Uranus"), "Science", ""),
            en = LocalizedContent("Which planet in the solar system has the largest moon (Titan)?", listOf("Saturn", "Jupiter", "Neptune", "Uranus"), "Science", ""),
            zh = LocalizedContent("太阳系中哪颗行星拥有最大的卫星（土卫六）？", listOf("土星", "木星", "海王星", "天王星"), "科学", ""),
            es = LocalizedContent("¿Qué planeta del sistema solar tiene la luna más grande (Titán)?", listOf("Saturno", "Júpiter", "Neptuno", "Urano"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 10012, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la stéréoisomérie ?", listOf("Isomères de même formule et liaisons mais disposition spatiale différente", "Isomères de fonction différente", "Polymères à chaînes identiques", "Isotopes d'un même élément"), "Science", ""),
            en = LocalizedContent("What is stereoisomerism?", listOf("Isomers with same formula and bonds but different spatial arrangement", "Isomers with different function", "Polymers with identical chains", "Isotopes of the same element"), "Science", ""),
            zh = LocalizedContent("什么是立体异构？", listOf("分子式和键相同但空间排列不同的异构体", "功能不同的异构体", "链相同的聚合物", "同一元素的同位素"), "科学", ""),
            es = LocalizedContent("¿Qué es la estereoisomería?", listOf("Isómeros con misma fórmula y enlaces pero diferente disposición espacial", "Isómeros con función diferente", "Polímeros con cadenas idénticas", "Isótopos de un mismo elemento"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 10013, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le composé organique le plus simple ?", listOf("Le méthane (CH₄)", "L'éthane (C₂H₆)", "Le formaldéhyde (CH₂O)", "L'acide formique (CH₂O₂)"), "Science", ""),
            en = LocalizedContent("What is the simplest organic compound?", listOf("Methane (CH₄)", "Ethane (C₂H₆)", "Formaldehyde (CH₂O)", "Formic acid (CH₂O₂)"), "Science", ""),
            zh = LocalizedContent("最简单的有机化合物是什么？", listOf("甲烷 (CH₄)", "乙烷 (C₂H₆)", "甲醛 (CH₂O)", "甲酸 (CH₂O₂)"), "科学", ""),
            es = LocalizedContent("¿Cuál es el compuesto orgánico más simple?", listOf("Metano (CH₄)", "Etano (C₂H₆)", "Formaldehído (CH₂O)", "Ácido fórmico (CH₂O₂)"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 10014, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la tachycardie ?", listOf("Fréquence cardiaque anormalement élevée (>100 bpm au repos)", "Arythmie cardiaque", "Fréquence cardiaque trop basse", "Souffle au cœur"), "Science", ""),
            en = LocalizedContent("What is tachycardia?", listOf("Abnormally high heart rate (>100 bpm at rest)", "Cardiac arrhythmia", "Abnormally low heart rate", "Heart murmur"), "Science", ""),
            zh = LocalizedContent("什么是心动过速？", listOf("心率异常升高（静息时>100次/分钟）", "心律失常", "心率过低", "心脏杂音"), "科学", ""),
            es = LocalizedContent("¿Qué es la taquicardia?", listOf("Frecuencia cardíaca anormalmente alta (>100 lpm en reposo)", "Arritmia cardíaca", "Frecuencia cardíaca demasiado baja", "Soplo cardíaco"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 10015, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe grec est le précepteur d'Alexandre le Grand ?", listOf("Aristote", "Platon", "Socrate", "Isocrate"), "Histoire", ""),
            en = LocalizedContent("Which Greek philosopher was the tutor of Alexander the Great?", listOf("Aristotle", "Plato", "Socrates", "Isocrates"), "History", ""),
            zh = LocalizedContent("哪位希腊哲学家是亚历山大大帝的老师？", listOf("亚里士多德", "柏拉图", "苏格拉底", "伊索克拉底"), "历史", ""),
            es = LocalizedContent("¿Qué filósofo griego fue el preceptor de Alejandro Magno?", listOf("Aristóteles", "Platón", "Sócrates", "Isócrates"), "Historia", "")
        ),
        BilingualQuestion(
            id = 10016, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle cité antique rivale de Rome fut rasée en 146 av. J.-C. ?", listOf("Carthage", "Corinthe", "Numance", "Sagonte"), "Histoire", ""),
            en = LocalizedContent("Which ancient city, rival of Rome, was razed in 146 BC?", listOf("Carthage", "Corinth", "Numantia", "Saguntum"), "History", ""),
            zh = LocalizedContent("哪座与罗马敌对的古城于公元前146年被摧毁？", listOf("迦太基", "科林斯", "努曼西亚", "萨贡托"), "历史", ""),
            es = LocalizedContent("¿Qué ciudad antigua, rival de Roma, fue arrasada en el 146 a.C.?", listOf("Cartago", "Corinto", "Numancia", "Sagunto"), "Historia", "")
        ),
        BilingualQuestion(
            id = 10017, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel roi de France est surnommé 'le Saint' ?", listOf("Louis IX (Saint Louis)", "Louis VII", "Philippe II Auguste", "Charles V le Sage"), "Histoire", ""),
            en = LocalizedContent("Which king of France is nicknamed 'the Saint'?", listOf("Louis IX (Saint Louis)", "Louis VII", "Philip II Augustus", "Charles V the Wise"), "History", ""),
            zh = LocalizedContent("哪位法国国王被称为“圣路易”？", listOf("路易九世（圣路易）", "路易七世", "腓力二世·奥古斯都", "查理五世（智者）"), "历史", ""),
            es = LocalizedContent("¿Qué rey de Francia es apodado 'el Santo'?", listOf("Luis IX (San Luis)", "Luis VII", "Felipe II Augusto", "Carlos V el Sabio"), "Historia", "")
        ),
        BilingualQuestion(
            id = 10018, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année s'est terminée la guerre du Vietnam ?", listOf("1975 (chute de Saïgon)", "1973 (accords de Paris)", "1976", "1972"), "Histoire", ""),
            en = LocalizedContent("In which year did the Vietnam War end?", listOf("1975 (fall of Saigon)", "1973 (Paris Peace Accords)", "1976", "1972"), "History", ""),
            zh = LocalizedContent("越南战争在哪一年结束？", listOf("1975年（西贡陷落）", "1973年（巴黎和平协定）", "1976年", "1972年"), "历史", ""),
            es = LocalizedContent("¿En qué año terminó la guerra de Vietnam?", listOf("1975 (caída de Saigón)", "1973 (Acuerdos de Paz de París)", "1976", "1972"), "Historia", "")
        ),
        BilingualQuestion(
            id = 10019, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a été le premier homme à faire le tour du monde (survivant) ?", listOf("Juan Sebastián Elcano (1522)", "Fernand de Magellan (mort en route)", "Francis Drake (1580)", "James Cook (1771)"), "Histoire", ""),
            en = LocalizedContent("Who was the first man to circumnavigate the globe (surviving)?", listOf("Juan Sebastián Elcano (1522)", "Ferdinand Magellan (died en route)", "Francis Drake (1580)", "James Cook (1771)"), "History", ""),
            zh = LocalizedContent("谁是第一个完成环球航行并幸存的人？", listOf("胡安·塞巴斯蒂安·埃尔卡诺（1522年）", "斐迪南·麦哲伦（途中去世）", "弗朗西斯·德雷克（1580年）", "詹姆斯·库克（1771年）"), "历史", ""),
            es = LocalizedContent("¿Quién fue el primer hombre en dar la vuelta al mundo (sobreviviente)?", listOf("Juan Sebastián Elcano (1522)", "Fernando de Magallanes (murió en el camino)", "Francis Drake (1580)", "James Cook (1771)"), "Historia", "")
        ),
        BilingualQuestion(
            id = 10020, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel empire couvrait l'Espagne, les Pays-Bas, l'Autriche et l'Amérique latine au XVIe siècle ?", listOf("Empire de Charles Quint (Habsbourg)", "Empire Ottoman", "Empire Britannique", "Empire Français"), "Histoire", ""),
            en = LocalizedContent("Which empire covered Spain, the Netherlands, Austria, and Latin America in the 16th century?", listOf("Empire of Charles V (Habsburg)", "Ottoman Empire", "British Empire", "French Empire"), "History", ""),
            zh = LocalizedContent("16世纪哪个帝国涵盖了西班牙、荷兰、奥地利和拉丁美洲？", listOf("查理五世帝国（哈布斯堡）", "奥斯曼帝国", "大英帝国", "法兰西帝国"), "历史", ""),
            es = LocalizedContent("¿Qué imperio cubría España, los Países Bajos, Austria y América Latina en el siglo XVI?", listOf("Imperio de Carlos V (Habsburgo)", "Imperio Otomano", "Imperio Británico", "Imperio Francés"), "Historia", "")
        ),
        BilingualQuestion(
            id = 10021, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la Déclaration des droits de l'homme et du citoyen fut-elle rédigée ?", listOf("1789", "1791", "1793", "1787"), "Histoire", ""),
            en = LocalizedContent("In which year was the Declaration of the Rights of Man and of the Citizen drafted?", listOf("1789", "1791", "1793", "1787"), "History", ""),
            zh = LocalizedContent("《人权宣言》是在哪一年起草的？", listOf("1789年", "1791年", "1793年", "1787年"), "历史", ""),
            es = LocalizedContent("¿En qué año se redactó la Declaración de los Derechos del Hombre y del Ciudadano?", listOf("1789", "1791", "1793", "1787"), "Historia", "")
        ),
        BilingualQuestion(
            id = 10022, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui était l'amiral anglais tué à Trafalgar en 1805 ?", listOf("Horatio Nelson", "Francis Drake", "George Anson", "Samuel Hood"), "Histoire", ""),
            en = LocalizedContent("Who was the English admiral killed at Trafalgar in 1805?", listOf("Horatio Nelson", "Francis Drake", "George Anson", "Samuel Hood"), "History", ""),
            zh = LocalizedContent("1805年在特拉法加海战中阵亡的英国海军上将是谁？", listOf("霍雷肖·纳尔逊", "弗朗西斯·德雷克", "乔治·安森", "塞缪尔·胡德"), "历史", ""),
            es = LocalizedContent("¿Quién fue el almirante inglés muerto en Trafalgar en 1805?", listOf("Horatio Nelson", "Francis Drake", "George Anson", "Samuel Hood"), "Historia", "")
        ),
        BilingualQuestion(
            id = 10023, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel traité de 1648 a mis fin à la guerre de Trente Ans ?", listOf("Traités de Westphalie", "Traité de Prague", "Traité de Münster seul", "Paix d'Augsbourg"), "Histoire", ""),
            en = LocalizedContent("Which 1648 treaty ended the Thirty Years' War?", listOf("Treaties of Westphalia", "Treaty of Prague", "Treaty of Münster alone", "Peace of Augsburg"), "History", ""),
            zh = LocalizedContent("1648年哪项条约结束了三十年战争？", listOf("威斯特伐利亚和约", "布拉格和约", "明斯特和约", "奥格斯堡和约"), "历史", ""),
            es = LocalizedContent("¿Qué tratado de 1648 puso fin a la Guerra de los Treinta Años?", listOf("Tratados de Westfalia", "Tratado de Praga", "Tratado de Münster solo", "Paz de Augsburgo"), "Historia", "")
        ),
        BilingualQuestion(
            id = 10024, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du premier satellite artificiel soviétique lancé en 1957 ?", listOf("Spoutnik 1", "Vostok", "Soyouz", "Mir"), "Histoire", ""),
            en = LocalizedContent("What is the name of the first Soviet artificial satellite launched in 1957?", listOf("Sputnik 1", "Vostok", "Soyuz", "Mir"), "History", ""),
            zh = LocalizedContent("1957年发射的第一颗苏联人造卫星叫什么名字？", listOf("斯普特尼克1号", "东方号", "联盟号", "和平号"), "历史", ""),
            es = LocalizedContent("¿Cuál es el nombre del primer satélite artificial soviético lanzado en 1957?", listOf("Sputnik 1", "Vostok", "Soyuz", "Mir"), "Historia", "")
        ),
        BilingualQuestion(
            id = 10025, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle ville est la capitale de l'Autriche ?", listOf("Vienne", "Innsbruck", "Salzbourg", "Graz"), "Géographie", ""),
            en = LocalizedContent("Which city is the capital of Austria?", listOf("Vienna", "Innsbruck", "Salzburg", "Graz"), "Geography", ""),
            zh = LocalizedContent("哪个城市是奥地利首都？", listOf("维也纳", "因斯布鲁克", "萨尔茨堡", "格拉茨"), "地理", ""),
            es = LocalizedContent("¿Qué ciudad es la capital de Austria?", listOf("Viena", "Innsbruck", "Salzburgo", "Graz"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 10026, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus long fleuve d'Europe occidentale ?", listOf("La Loire (1 012 km)", "Le Rhin (1 230 km — mais plus à l'Est)", "Le Rhône", "La Garonne"), "Géographie", ""),
            en = LocalizedContent("What is the longest river in Western Europe?", listOf("The Loire (1,012 km)", "The Rhine (1,230 km — but more to the East)", "The Rhône", "The Garonne"), "Geography", ""),
            zh = LocalizedContent("西欧最长的河流是哪条？", listOf("卢瓦尔河（1012公里）", "莱茵河（1230公里——但更偏东）", "罗讷河", "加龙河"), "地理", ""),
            es = LocalizedContent("¿Cuál es el río más largo de Europa Occidental?", listOf("El Loira (1.012 km)", "El Rin (1.230 km — pero más al este)", "El Ródano", "El Garona"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 10027, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve la ville de Marrakech ?", listOf("Maroc", "Tunisie", "Algérie", "Mauritanie"), "Géographie", ""),
            en = LocalizedContent("In which country is the city of Marrakech located?", listOf("Morocco", "Tunisia", "Algeria", "Mauritania"), "Geography", ""),
            zh = LocalizedContent("马拉喀什位于哪个国家？", listOf("摩洛哥", "突尼斯", "阿尔及利亚", "毛里塔尼亚"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra la ciudad de Marrakech?", listOf("Marruecos", "Túnez", "Argelia", "Mauritania"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 10028, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle mer se trouve entre l'Italie et les Balkans ?", listOf("Mer Adriatique", "Mer Ionienne", "Mer Tyrrhénienne", "Mer Méditerranée centrale"), "Géographie", ""),
            en = LocalizedContent("Which sea lies between Italy and the Balkans?", listOf("Adriatic Sea", "Ionian Sea", "Tyrrhenian Sea", "Central Mediterranean Sea"), "Geography", ""),
            zh = LocalizedContent("意大利和巴尔干半岛之间是什么海？", listOf("亚得里亚海", "爱奥尼亚海", "第勒尼安海", "地中海中部"), "地理", ""),
            es = LocalizedContent("¿Qué mar se encuentra entre Italia y los Balcanes?", listOf("Mar Adriático", "Mar Jónico", "Mar Tirreno", "Mar Mediterráneo central"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 10029, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand état indien par superficie ?", listOf("Rajasthan", "Madhya Pradesh", "Maharashtra", "Uttar Pradesh"), "Géographie", ""),
            en = LocalizedContent("Which is the largest Indian state by area?", listOf("Rajasthan", "Madhya Pradesh", "Maharashtra", "Uttar Pradesh"), "Geography", ""),
            zh = LocalizedContent("印度面积最大的邦是哪个？", listOf("拉贾斯坦邦", "中央邦", "马哈拉施特拉邦", "北方邦"), "地理", ""),
            es = LocalizedContent("¿Cuál es el estado indio más grande por superficie?", listOf("Rajastán", "Madhya Pradesh", "Maharashtra", "Uttar Pradesh"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 10030, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays se trouve la ville côtière de Mombasa ?", listOf("Kenya", "Tanzanie", "Mozambique", "Somalie"), "Géographie", ""),
            en = LocalizedContent("In which country is the coastal city of Mombasa located?", listOf("Kenya", "Tanzania", "Mozambique", "Somalia"), "Geography", ""),
            zh = LocalizedContent("沿海城市蒙巴萨位于哪个国家？", listOf("肯尼亚", "坦桑尼亚", "莫桑比克", "索马里"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra la ciudad costera de Mombasa?", listOf("Kenia", "Tanzania", "Mozambique", "Somalia"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 10031, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fleuve traverse Khartoum, capitale du Soudan ?", listOf("Le Nil (confluence Nil Blanc et Bleu)", "Le Niger", "Le Congo", "Le Zambèze"), "Géographie", ""),
            en = LocalizedContent("Which river flows through Khartoum, the capital of Sudan?", listOf("The Nile (confluence of White and Blue Nile)", "The Niger", "The Congo", "The Zambezi"), "Geography", ""),
            zh = LocalizedContent("哪条河流经苏丹首都喀土穆？", listOf("尼罗河（白尼罗河和青尼罗河交汇处）", "尼日尔河", "刚果河", "赞比西河"), "地理", ""),
            es = LocalizedContent("¿Qué río atraviesa Jartum, la capital de Sudán?", listOf("El Nilo (confluencia del Nilo Blanco y Azul)", "El Níger", "El Congo", "El Zambeze"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 10032, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale de la Roumanie ?", listOf("Bucarest", "Cluj-Napoca", "Timișoara", "Iași"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Romania?", listOf("Bucharest", "Cluj-Napoca", "Timișoara", "Iași"), "Geography", ""),
            zh = LocalizedContent("罗马尼亚的首都是哪里？", listOf("布加勒斯特", "克卢日-纳波卡", "蒂米什瓦拉", "雅西"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Rumanía?", listOf("Bucarest", "Cluj-Napoca", "Timișoara", "Iași"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 10033, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays se trouvent les célèbres rizières en terrasses de Banaue ?", listOf("Philippines", "Indonésie", "Viêt Nam", "Chine"), "Géographie", ""),
            en = LocalizedContent("In which country are the famous Banaue rice terraces located?", listOf("Philippines", "Indonesia", "Vietnam", "China"), "Geography", ""),
            zh = LocalizedContent("著名的巴纳韦梯田位于哪个国家？", listOf("菲律宾", "印度尼西亚", "越南", "中国"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentran las famosas terrazas de arroz de Banaue?", listOf("Filipinas", "Indonesia", "Vietnam", "China"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 10034, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le nom du plus grand atoll corallien du monde ?", listOf("Atoll de Lifou (Nouvelle-Calédonie) ou Kiritimati (Christmas Island)", "Maldives", "Tuvalu", "Rangiroa (Polynésie)"), "Géographie", ""),
            en = LocalizedContent("What is the name of the largest coral atoll in the world?", listOf("Lifou Atoll (New Caledonia) or Kiritimati (Christmas Island)", "Maldives", "Tuvalu", "Rangiroa (Polynesia)"), "Geography", ""),
            zh = LocalizedContent("世界上最大的珊瑚环礁叫什么名字？", listOf("利富环礁（新喀里多尼亚）或基里蒂马蒂环礁（圣诞岛）", "马尔代夫", "图瓦卢", "朗伊罗阿环礁（波利尼西亚）"), "地理", ""),
            es = LocalizedContent("¿Cuál es el nombre del atolón de coral más grande del mundo?", listOf("Atolón de Lifou (Nueva Caledonia) o Kiritimati (Isla Christmas)", "Maldivas", "Tuvalu", "Rangiroa (Polinesia)"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 10035, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel auteur a écrit 'Les Aventures de Tom Sawyer' ?", listOf("Mark Twain", "Jack London", "O. Henry", "Bret Harte"), "Culture", ""),
            en = LocalizedContent("Which author wrote 'The Adventures of Tom Sawyer'?", listOf("Mark Twain", "Jack London", "O. Henry", "Bret Harte"), "Culture", ""),
            zh = LocalizedContent("哪位作者写了《汤姆·索亚历险记》？", listOf("马克·吐温", "杰克·伦敦", "欧·亨利", "布雷特·哈特"), "文化", ""),
            es = LocalizedContent("¿Qué autor escribió 'Las aventuras de Tom Sawyer'?", listOf("Mark Twain", "Jack London", "O. Henry", "Bret Harte"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 10036, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a composé 'Swan Lake' (Le Lac des cygnes) ?", listOf("Piotr Ilitch Tchaïkovski", "Sergei Prokofiev", "Igor Stravinski", "Dimitri Chostakovitch"), "Culture", ""),
            en = LocalizedContent("Who composed 'Swan Lake'?", listOf("Pyotr Ilyich Tchaikovsky", "Sergei Prokofiev", "Igor Stravinsky", "Dmitri Shostakovich"), "Culture", ""),
            zh = LocalizedContent("谁创作了《天鹅湖》？", listOf("彼得·伊里奇·柴可夫斯基", "谢尔盖·普罗科菲耶夫", "伊戈尔·斯特拉文斯基", "德米特里·肖斯塔科维奇"), "文化", ""),
            es = LocalizedContent("¿Quién compuso 'El lago de los cisnes'?", listOf("Piotr Ilich Chaikovski", "Serguéi Prokófiev", "Ígor Stravinski", "Dmitri Shostakóvich"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 10037, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel peintre espagnol est connu pour 'Les Ménines' ?", listOf("Diego Velázquez", "Francisco Goya", "El Greco", "Bartolomé Murillo"), "Culture", ""),
            en = LocalizedContent("Which Spanish painter is known for 'Las Meninas'?", listOf("Diego Velázquez", "Francisco Goya", "El Greco", "Bartolomé Murillo"), "Culture", ""),
            zh = LocalizedContent("哪位西班牙画家以《宫娥》闻名？", listOf("迭戈·委拉斯开兹", "弗朗西斯科·戈雅", "埃尔·格列柯", "巴托洛梅·穆里略"), "文化", ""),
            es = LocalizedContent("¿Qué pintor español es conocido por 'Las Meninas'?", listOf("Diego Velázquez", "Francisco Goya", "El Greco", "Bartolomé Murillo"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 10038, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel auteur est connu pour la série 'Discworld' ?", listOf("Terry Pratchett", "Douglas Adams", "Neil Gaiman", "Terry Brooks"), "Culture", ""),
            en = LocalizedContent("Which author is known for the 'Discworld' series?", listOf("Terry Pratchett", "Douglas Adams", "Neil Gaiman", "Terry Brooks"), "Culture", ""),
            zh = LocalizedContent("哪位作者以《碟形世界》系列闻名？", listOf("特里·普拉切特", "道格拉斯·亚当斯", "尼尔·盖曼", "特里·布鲁克斯"), "文化", ""),
            es = LocalizedContent("¿Qué autor es conocido por la serie 'Mundodisco'?", listOf("Terry Pratchett", "Douglas Adams", "Neil Gaiman", "Terry Brooks"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 10039, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a sculpté le 'David' de Florence (1504) ?", listOf("Michel-Ange", "Donatello", "Ghiberti", "Verrocchio"), "Culture", ""),
            en = LocalizedContent("Who sculpted the 'David' in Florence (1504)?", listOf("Michelangelo", "Donatello", "Ghiberti", "Verrocchio"), "Culture", ""),
            zh = LocalizedContent("谁雕刻了佛罗伦萨的《大卫》（1504年）？", listOf("米开朗基罗", "多纳泰罗", "吉贝尔蒂", "韦罗基奥"), "文化", ""),
            es = LocalizedContent("¿Quién esculpió el 'David' de Florencia (1504)?", listOf("Miguel Ángel", "Donatello", "Ghiberti", "Verrocchio"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 10040, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel mouvement littéraire est associé à Victor Hugo, Lamartine et Alfred de Musset ?", listOf("Le Romantisme", "Le Classicisme", "Le Naturalisme", "Le Symbolisme"), "Culture", ""),
            en = LocalizedContent("Which literary movement is associated with Victor Hugo, Lamartine, and Alfred de Musset?", listOf("Romanticism", "Classicism", "Naturalism", "Symbolism"), "Culture", ""),
            zh = LocalizedContent("维克多·雨果、拉马丁和阿尔弗雷德·德·缪塞与哪个文学运动相关？", listOf("浪漫主义", "古典主义", "自然主义", "象征主义"), "文化", ""),
            es = LocalizedContent("¿Qué movimiento literario está asociado con Victor Hugo, Lamartine y Alfred de Musset?", listOf("Romanticismo", "Clasicismo", "Naturalismo", "Simbolismo"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 10041, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a écrit 'Germinal', symbole du mouvement ouvrier ?", listOf("Émile Zola", "Victor Hugo", "Guy de Maupassant", "Jules Vallès"), "Culture", ""),
            en = LocalizedContent("Who wrote 'Germinal', a symbol of the labor movement?", listOf("Émile Zola", "Victor Hugo", "Guy de Maupassant", "Jules Vallès"), "Culture", ""),
            zh = LocalizedContent("谁写了《萌芽》，这部作品是工人运动的象征？", listOf("埃米尔·左拉", "维克多·雨果", "居伊·德·莫泊桑", "儒勒·瓦莱斯"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'Germinal', símbolo del movimiento obrero?", listOf("Émile Zola", "Victor Hugo", "Guy de Maupassant", "Jules Vallès"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 10042, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du roman de Stendhal dont le héros est Julien Sorel ?", listOf("Le Rouge et le Noir", "La Chartreuse de Parme", "Armance", "Lucien Leuwen"), "Culture", ""),
            en = LocalizedContent("What is the name of Stendhal's novel whose hero is Julien Sorel?", listOf("The Red and the Black", "The Charterhouse of Parma", "Armance", "Lucien Leuwen"), "Culture", ""),
            zh = LocalizedContent("司汤达的哪部小说的主人公是于连·索雷尔？", listOf("红与黑", "帕尔马修道院", "阿尔芒斯", "吕西安·娄凡"), "文化", ""),
            es = LocalizedContent("¿Cuál es el nombre de la novela de Stendhal cuyo héroe es Julien Sorel?", listOf("Rojo y negro", "La cartuja de Parma", "Armancia", "Luciano Leuwen"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 10043, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a peint 'L'Olympia' (1863), nu féminin scandaleux ?", listOf("Édouard Manet", "Gustave Courbet", "Edgar Degas", "Pierre-Auguste Renoir"), "Culture", ""),
            en = LocalizedContent("Who painted 'Olympia' (1863), a scandalous female nude?", listOf("Édouard Manet", "Gustave Courbet", "Edgar Degas", "Pierre-Auguste Renoir"), "Culture", ""),
            zh = LocalizedContent("谁画了《奥林匹亚》（1863年），这幅引起争议的女性裸体画？", listOf("爱德华·马奈", "古斯塔夫·库尔贝", "埃德加·德加", "皮埃尔-奥古斯特·雷诺阿"), "文化", ""),
            es = LocalizedContent("¿Quién pintó 'Olympia' (1863), un desnudo femenino escandaloso?", listOf("Édouard Manet", "Gustave Courbet", "Edgar Degas", "Pierre-Auguste Renoir"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 10044, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel auteur a écrit 'Voyage au centre de la Terre' ?", listOf("Jules Verne", "H.G. Wells", "Arthur Conan Doyle", "Camille Flammarion"), "Culture", ""),
            en = LocalizedContent("Which author wrote 'Journey to the Center of the Earth'?", listOf("Jules Verne", "H.G. Wells", "Arthur Conan Doyle", "Camille Flammarion"), "Culture", ""),
            zh = LocalizedContent("谁写了《地心游记》？", listOf("儒勒·凡尔纳", "赫伯特·乔治·威尔斯", "阿瑟·柯南·道尔", "卡米耶·弗拉马里翁"), "文化", ""),
            es = LocalizedContent("¿Qué autor escribió 'Viaje al centro de la Tierra'?", listOf("Julio Verne", "H.G. Wells", "Arthur Conan Doyle", "Camille Flammarion"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 10045, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le sport le plus rapide au monde (vitesse maximale de la balle) ?", listOf("Jai-alai (pelote basque) ~302 km/h", "Golf (340 km/h au drive)", "Tennis (263 km/h service)", "Badminton (493 km/h smash)"), "Sport", ""),
            en = LocalizedContent("What is the fastest sport in the world (maximum ball speed)?", listOf("Jai-alai (Basque pelota) ~302 km/h", "Golf (340 km/h drive)", "Tennis (263 km/h serve)", "Badminton (493 km/h smash)"), "Sports", ""),
            zh = LocalizedContent("世界上速度最快的运动是什么（球的最大速度）？", listOf("回力球（巴斯克球）约302公里/小时", "高尔夫（开球340公里/小时）", "网球（发球263公里/小时）", "羽毛球（扣杀493公里/小时）"), "体育", ""),
            es = LocalizedContent("¿Cuál es el deporte más rápido del mundo (velocidad máxima de la pelota)?", listOf("Jai-alai (pelota vasca) ~302 km/h", "Golf (340 km/h en el drive)", "Tenis (263 km/h en el saque)", "Bádminton (493 km/h en el remate)"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 10046, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de matchs nuls valent 1 point dans un tournoi d'échecs ?", listOf("2 nuls valent 1 point (chaque nul = 0,5)", "1 nul = 1 point", "Les nuls ne donnent pas de points", "3 nuls = 1 point"), "Sport", ""),
            en = LocalizedContent("How many draws are worth 1 point in a chess tournament?", listOf("2 draws are worth 1 point (each draw = 0.5)", "1 draw = 1 point", "Draws give no points", "3 draws = 1 point"), "Sports", ""),
            zh = LocalizedContent("在国际象棋比赛中，多少盘和棋等于1分？", listOf("2盘和棋等于1分（每盘和棋=0.5分）", "1盘和棋=1分", "和棋不得分", "3盘和棋=1分"), "体育", ""),
            es = LocalizedContent("¿Cuántos empates valen 1 punto en un torneo de ajedrez?", listOf("2 empates valen 1 punto (cada empate = 0.5)", "1 empate = 1 punto", "Los empates no dan puntos", "3 empates = 1 punto"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 10047, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a remporté le plus de titres en Coupe Davis de tennis ?", listOf("États-Unis (32 titres)", "Australie (28 titres)", "France (10 titres)", "Espagne (6 titres)"), "Sport", ""),
            en = LocalizedContent("Which country has won the most Davis Cup titles in tennis?", listOf("United States (32 titles)", "Australia (28 titles)", "France (10 titles)", "Spain (6 titles)"), "Sports", ""),
            zh = LocalizedContent("哪个国家赢得了最多的戴维斯杯网球冠军？", listOf("美国（32次）", "澳大利亚（28次）", "法国（10次）", "西班牙（6次）"), "体育", ""),
            es = LocalizedContent("¿Qué país ha ganado más títulos en la Copa Davis de tenis?", listOf("Estados Unidos (32 títulos)", "Australia (28 títulos)", "Francia (10 títulos)", "España (6 títulos)"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 10048, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel sport l'équipe adverse est-elle appelée 'All Blacks' ?", listOf("Rugby à XV (Nouvelle-Zélande)", "Cricket néo-zélandais", "Football australien", "Netball"), "Sport", ""),
            en = LocalizedContent("In which sport is the opposing team called the 'All Blacks'?", listOf("Rugby union (New Zealand)", "New Zealand cricket", "Australian rules football", "Netball"), "Sports", ""),
            zh = LocalizedContent("在哪项运动中，对方球队被称为“全黑队”？", listOf("橄榄球（新西兰）", "新西兰板球", "澳式足球", "篮网球"), "体育", ""),
            es = LocalizedContent("¿En qué deporte el equipo contrario se llama 'All Blacks'?", listOf("Rugby (Nueva Zelanda)", "Críquet neozelandés", "Fútbol australiano", "Netball"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 10049, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le seul sport qui s'est joué sur la Lune ?", listOf("Golf (Alan Shepard, Apollo 14, 1971)", "Lancer de javelot", "Saut en longueur", "Frisbee"), "Sport", ""),
            en = LocalizedContent("What is the only sport that has been played on the Moon?", listOf("Golf (Alan Shepard, Apollo 14, 1971)", "Javelin throw", "Long jump", "Frisbee"), "Sports", ""),
            zh = LocalizedContent("唯一在月球上进行过的运动是什么？", listOf("高尔夫（艾伦·谢泼德，阿波罗14号，1971年）", "标枪", "跳远", "飞盘"), "体育", ""),
            es = LocalizedContent("¿Cuál es el único deporte que se ha jugado en la Luna?", listOf("Golf (Alan Shepard, Apolo 14, 1971)", "Lanzamiento de jabalina", "Salto de longitud", "Frisbee"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 10050, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de points marque-t-on avec un penalty transformé au rugby à XV ?", listOf("3 points", "2 points", "1 point", "5 points"), "Sport", ""),
            en = LocalizedContent("How many points are scored with a converted penalty in rugby union?", listOf("3 points", "2 points", "1 point", "5 points"), "Sports", ""),
            zh = LocalizedContent("在英式橄榄球中，罚球射中得多少分？", listOf("3分", "2分", "1分", "5分"), "体育", ""),
            es = LocalizedContent("¿Cuántos puntos se marcan con un penal convertido en rugby a 15?", listOf("3 puntos", "2 puntos", "1 punto", "5 puntos"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 10051, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le 'responsive design' ?", listOf("Conception web s'adaptant à toutes les tailles d'écran", "Design qui répond aux clics rapidement", "Interface graphique adaptative", "Application multiplateforme"), "Tech", ""),
            en = LocalizedContent("What is 'responsive design'?", listOf("Web design that adapts to all screen sizes", "Design that responds quickly to clicks", "Adaptive graphical interface", "Cross-platform application"), "Technology", ""),
            zh = LocalizedContent("什么是“响应式设计”？", listOf("适应所有屏幕尺寸的网页设计", "快速响应点击的设计", "自适应图形界面", "跨平台应用"), "科技", ""),
            es = LocalizedContent("¿Qué es el 'diseño responsive'?", listOf("Diseño web que se adapta a todos los tamaños de pantalla", "Diseño que responde rápidamente a los clics", "Interfaz gráfica adaptativa", "Aplicación multiplataforma"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 10052, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le 'rate limiting' dans une API ?", listOf("Limitation du nombre de requêtes par période de temps", "Vitesse maximale de transfert de données", "Contrôle du débit réseau", "Limitation de la taille des réponses"), "Tech", ""),
            en = LocalizedContent("What is 'rate limiting' in an API?", listOf("Limitation of the number of requests per time period", "Maximum data transfer speed", "Network bandwidth control", "Limitation of response size"), "Technology", ""),
            zh = LocalizedContent("API中的“速率限制”是什么？", listOf("限制每段时间内的请求数量", "最大数据传输速度", "网络带宽控制", "限制响应大小"), "科技", ""),
            es = LocalizedContent("¿Qué es el 'rate limiting' en una API?", listOf("Limitación del número de solicitudes por período de tiempo", "Velocidad máxima de transferencia de datos", "Control del ancho de banda de red", "Limitación del tamaño de las respuestas"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 10053, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le 'hot module replacement' dans Webpack ?", listOf("Remplacement des modules sans rechargement complet de la page", "Remplacement chaud des serveurs", "Mise à jour des dépendances à chaud", "Cache invalidation automatique"), "Tech", ""),
            en = LocalizedContent("What is 'hot module replacement' in Webpack?", listOf("Replacement of modules without full page reload", "Hot replacement of servers", "Hot update of dependencies", "Automatic cache invalidation"), "Technology", ""),
            zh = LocalizedContent("Webpack中的“热模块替换”是什么？", listOf("无需完全重新加载页面即可替换模块", "热替换服务器", "热更新依赖", "自动缓存失效"), "科技", ""),
            es = LocalizedContent("¿Qué es el 'hot module replacement' en Webpack?", listOf("Reemplazo de módulos sin recargar completamente la página", "Reemplazo en caliente de servidores", "Actualización en caliente de dependencias", "Invalidación automática de caché"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 10054, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'avantage principal de TypeScript sur JavaScript ?", listOf("Typage statique réduisant les erreurs à la compilation", "Meilleures performances à l'exécution", "Syntaxe plus concise", "Meilleure compatibilité navigateur"), "Tech", ""),
            en = LocalizedContent("What is the main advantage of TypeScript over JavaScript?", listOf("Static typing reducing errors at compile time", "Better runtime performance", "More concise syntax", "Better browser compatibility"), "Technology", ""),
            zh = LocalizedContent("TypeScript相比JavaScript的主要优势是什么？", listOf("静态类型在编译时减少错误", "更好的运行时性能", "更简洁的语法", "更好的浏览器兼容性"), "科技", ""),
            es = LocalizedContent("¿Cuál es la principal ventaja de TypeScript sobre JavaScript?", listOf("Tipado estático que reduce errores en tiempo de compilación", "Mejor rendimiento en tiempo de ejecución", "Sintaxis más concisa", "Mejor compatibilidad con navegadores"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 10055, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le 'SOLID' en POO — le 'I' ?", listOf("Interface Segregation : interfaces spécifiques plutôt que générales", "Inheritance principle", "Instance responsibility", "Integration design"), "Tech", ""),
            en = LocalizedContent("What is 'SOLID' in OOP — the 'I'?", listOf("Interface Segregation: specific interfaces rather than general ones", "Inheritance principle", "Instance responsibility", "Integration design"), "Technology", ""),
            zh = LocalizedContent("面向对象编程中的“SOLID”原则——'I'代表什么？", listOf("接口隔离：使用特定接口而非通用接口", "继承原则", "实例责任", "集成设计"), "科技", ""),
            es = LocalizedContent("¿Qué es 'SOLID' en POO — la 'I'?", listOf("Segregación de Interfaces: interfaces específicas en lugar de generales", "Principio de herencia", "Responsabilidad de instancia", "Diseño de integración"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 10056, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plat national de la Grèce le plus connu à l'international ?", listOf("La moussaka", "Le souvlaki", "La salade grecque", "Le spanakopita"), "Gastronomie", ""),
            en = LocalizedContent("What is the most internationally known national dish of Greece?", listOf("Moussaka", "Souvlaki", "Greek salad", "Spanakopita"), "Gastronomy", ""),
            zh = LocalizedContent("希腊最国际知名的国菜是什么？", listOf("慕萨卡", "苏夫拉基", "希腊沙拉", "菠菜派"), "美食", ""),
            es = LocalizedContent("¿Cuál es el plato nacional de Grecia más conocido internacionalmente?", listOf("Moussaka", "Souvlaki", "Ensalada griega", "Spanakopita"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 10057, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le 'dashi' en cuisine japonaise ?", listOf("Bouillon de base à base de kombu et bonite séchée (katsuobushi)", "Sauce fermentée de soja", "Pâte de sésame", "Vinaigre de riz"), "Gastronomie", ""),
            en = LocalizedContent("What is 'dashi' in Japanese cuisine?", listOf("Basic broth made from kombu and dried bonito (katsuobushi)", "Fermented soy sauce", "Sesame paste", "Rice vinegar"), "Gastronomy", ""),
            zh = LocalizedContent("日本料理中的“出汁”是什么？", listOf("用昆布和干鲣鱼片（柴鱼）制成的基本高汤", "发酵酱油", "芝麻酱", "米醋"), "美食", ""),
            es = LocalizedContent("¿Qué es el 'dashi' en la cocina japonesa?", listOf("Caldo básico hecho de kombu y bonito seco (katsuobushi)", "Salsa de soja fermentada", "Pasta de sésamo", "Vinagre de arroz"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 10058, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle technique donne la croûte croustillante à la baguette française ?", listOf("Cuisson à la vapeur dans un four chaud (coup de buée)", "Badigeonnage d'huile d'olive", "Farine spéciale T45", "Cuisson à très haute température sans vapeur"), "Gastronomie", ""),
            en = LocalizedContent("What technique gives the crispy crust to the French baguette?", listOf("Steam baking in a hot oven (steam injection)", "Brushing with olive oil", "Special T45 flour", "Very high temperature baking without steam"), "Gastronomy", ""),
            zh = LocalizedContent("什么技术使法式长棍面包有酥脆的外皮？", listOf("在热烤箱中蒸汽烘烤（注入蒸汽）", "刷橄榄油", "特殊T45面粉", "无蒸汽的极高温度烘烤"), "美食", ""),
            es = LocalizedContent("¿Qué técnica da la corteza crujiente a la baguette francesa?", listOf("Cocción al vapor en horno caliente (inyección de vapor)", "Pincelado con aceite de oliva", "Harina especial T45", "Cocción a temperatura muy alta sin vapor"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 10059, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'ingrédient de base du kimchi coréen ?", listOf("Chou fermenté avec piment, ail et gingembre", "Radis fermenté uniquement", "Porc mariné dans du gochujang", "Tofu fermenté épicé"), "Gastronomie", ""),
            en = LocalizedContent("What is the basic ingredient of Korean kimchi?", listOf("Fermented cabbage with chili, garlic and ginger", "Fermented radish only", "Pork marinated in gochujang", "Spicy fermented tofu"), "Gastronomy", ""),
            zh = LocalizedContent("韩国泡菜的基本原料是什么？", listOf("用辣椒、大蒜和生姜发酵的白菜", "仅发酵的萝卜", "用辣椒酱腌制的猪肉", "辣味发酵豆腐"), "美食", ""),
            es = LocalizedContent("¿Cuál es el ingrediente básico del kimchi coreano?", listOf("Col fermentada con chile, ajo y jengibre", "Rábano fermentado únicamente", "Cerdo marinado en gochujang", "Tofu fermentado picante"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 10060, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la 'brunoise' en technique culinaire ?", listOf("Découpe en très petits dés réguliers (1-2 mm)", "Tranche fine de légume", "Julienne de légumes", "Coupe en quartiers"), "Gastronomie", ""),
            en = LocalizedContent("What is 'brunoise' in culinary technique?", listOf("Cut into very small regular dice (1-2 mm)", "Thin slice of vegetable", "Julienne of vegetables", "Cut into quarters"), "Gastronomy", ""),
            zh = LocalizedContent("烹饪技术中的'brunoise'是什么？", listOf("切成非常小的均匀丁状（1-2毫米）", "蔬菜薄片", "蔬菜丝", "切成四分之一块"), "美食", ""),
            es = LocalizedContent("¿Qué es la 'brunoise' en técnica culinaria?", listOf("Corte en dados muy pequeños y regulares (1-2 mm)", "Rodaja fina de verdura", "Juliana de verduras", "Corte en cuartos"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 10061, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de 1968 de Stanley Kubrick est une odyssée spatiale philosophique ?", listOf("2001 : L'Odyssée de l'espace", "A Clockwork Orange", "Shining", "Full Metal Jacket"), "Cinéma", ""),
            en = LocalizedContent("Which 1968 film by Stanley Kubrick is a philosophical space odyssey?", listOf("2001: A Space Odyssey", "A Clockwork Orange", "The Shining", "Full Metal Jacket"), "Cinema", ""),
            zh = LocalizedContent("斯坦利·库布里克1968年的哪部电影是一部哲学太空漫游？", listOf("2001太空漫游", "发条橙", "闪灵", "全金属外壳"), "电影", ""),
            es = LocalizedContent("¿Qué película de 1968 de Stanley Kubrick es una odisea espacial filosófica?", listOf("2001: Una odisea del espacio", "La naranja mecánica", "El resplandor", "La chaqueta metálica"), "Cine", "")
        ),
        BilingualQuestion(
            id = 10062, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui joue le rôle principal dans 'Le Fabuleux Destin d'Amélie Poulain' ?", listOf("Audrey Tautou", "Sophie Marceau", "Juliette Binoche", "Marion Cotillard"), "Cinéma", ""),
            en = LocalizedContent("Who plays the lead role in 'Amélie'?", listOf("Audrey Tautou", "Sophie Marceau", "Juliette Binoche", "Marion Cotillard"), "Cinema", ""),
            zh = LocalizedContent("谁在《天使爱美丽》中扮演主角？", listOf("奥黛丽·塔图", "苏菲·玛索", "朱丽叶·比诺什", "玛丽昂·歌迪亚"), "电影", ""),
            es = LocalizedContent("¿Quién interpreta el papel principal en 'Amélie'?", listOf("Audrey Tautou", "Sophie Marceau", "Juliette Binoche", "Marion Cotillard"), "Cine", "")
        ),
        BilingualQuestion(
            id = 10063, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de 2019 de Quentin Tarantino se passe à Hollywood en 1969 ?", listOf("Once Upon a Time... in Hollywood", "The Hateful Eight", "Django Unchained", "Inglourious Basterds"), "Cinéma", ""),
            en = LocalizedContent("Which 2019 film by Quentin Tarantino is set in Hollywood in 1969?", listOf("Once Upon a Time... in Hollywood", "The Hateful Eight", "Django Unchained", "Inglourious Basterds"), "Cinema", ""),
            zh = LocalizedContent("昆汀·塔伦蒂诺2019年的哪部电影以1969年的好莱坞为背景？", listOf("好莱坞往事", "八恶人", "被解救的姜戈", "无耻混蛋"), "电影", ""),
            es = LocalizedContent("¿Qué película de 2019 de Quentin Tarantino transcurre en Hollywood en 1969?", listOf("Érase una vez en Hollywood", "Los odiosos ocho", "Django desencadenado", "Malditos bastardos"), "Cine", "")
        ),
        BilingualQuestion(
            id = 10064, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé 'Metropolis' (1927), chef-d'œuvre du cinéma muet ?", listOf("Fritz Lang", "F.W. Murnau", "Ernst Lubitsch", "G.W. Pabst"), "Cinéma", ""),
            en = LocalizedContent("Who directed 'Metropolis' (1927), a masterpiece of silent cinema?", listOf("Fritz Lang", "F.W. Murnau", "Ernst Lubitsch", "G.W. Pabst"), "Cinema", ""),
            zh = LocalizedContent("谁执导了默片杰作《大都会》（1927年）？", listOf("弗里茨·朗", "F·W·茂瑙", "恩斯特·刘别谦", "G·W·帕布斯特"), "电影", ""),
            es = LocalizedContent("¿Quién dirigió 'Metrópolis' (1927), obra maestra del cine mudo?", listOf("Fritz Lang", "F.W. Murnau", "Ernst Lubitsch", "G.W. Pabst"), "Cine", "")
        ),
        BilingualQuestion(
            id = 10065, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel acteur a joué Vito Corleone jeune dans 'Le Parrain II' ?", listOf("Robert De Niro (Oscar du meilleur second rôle)", "Al Pacino", "James Caan", "Marlon Brando"), "Cinéma", ""),
            en = LocalizedContent("Which actor played young Vito Corleone in 'The Godfather Part II'?", listOf("Robert De Niro (Oscar for Best Supporting Actor)", "Al Pacino", "James Caan", "Marlon Brando"), "Cinema", ""),
            zh = LocalizedContent("哪位演员在《教父2》中饰演年轻的维托·柯里昂？", listOf("罗伯特·德尼罗（奥斯卡最佳男配角）", "阿尔·帕西诺", "詹姆斯·凯恩", "马龙·白兰度"), "电影", ""),
            es = LocalizedContent("¿Qué actor interpretó al joven Vito Corleone en 'El Padrino II'?", listOf("Robert De Niro (Óscar al mejor actor de reparto)", "Al Pacino", "James Caan", "Marlon Brando"), "Cine", "")
        ),
        BilingualQuestion(
            id = 10066, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel groupe britannique a sorti 'OK Computer' (1997) ?", listOf("Radiohead", "Blur", "Oasis", "Manic Street Preachers"), "Musique", ""),
            en = LocalizedContent("Which British band released 'OK Computer' (1997)?", listOf("Radiohead", "Blur", "Oasis", "Manic Street Preachers"), "Music", ""),
            zh = LocalizedContent("哪支英国乐队发行了《OK Computer》（1997年）？", listOf("电台司令", "模糊", "绿洲", "狂躁街道传教士"), "音乐", ""),
            es = LocalizedContent("¿Qué banda británica lanzó 'OK Computer' (1997)?", listOf("Radiohead", "Blur", "Oasis", "Manic Street Preachers"), "Música", "")
        ),
        BilingualQuestion(
            id = 10067, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est l'interprète de 'My Way', reprise d'une chanson française ?", listOf("Frank Sinatra (adaptation de 'Comme d'habitude' de Claude François)", "Elvis Presley", "Dean Martin", "Nat King Cole"), "Musique", ""),
            en = LocalizedContent("Who is the performer of 'My Way', an adaptation of a French song?", listOf("Frank Sinatra (adaptation of 'Comme d'habitude' by Claude François)", "Elvis Presley", "Dean Martin", "Nat King Cole"), "Music", ""),
            zh = LocalizedContent("谁演唱了《My Way》，这首歌改编自一首法语歌曲？", listOf("弗兰克·辛纳屈（改编自克洛德·弗朗索瓦的《Comme d'habitude》）", "埃尔维斯·普雷斯利", "迪恩·马丁", "纳特·金·科尔"), "音乐", ""),
            es = LocalizedContent("¿Quién interpretó 'My Way', adaptación de una canción francesa?", listOf("Frank Sinatra (adaptación de 'Comme d'habitude' de Claude François)", "Elvis Presley", "Dean Martin", "Nat King Cole"), "Música", "")
        ),
        BilingualQuestion(
            id = 10068, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur est connu pour 'Peer Gynt' (Suite musicale) ?", listOf("Edvard Grieg", "Jean Sibelius", "Carl Nielsen", "Niels Gade"), "Musique", ""),
            en = LocalizedContent("Which composer is known for 'Peer Gynt' (musical suite)?", listOf("Edvard Grieg", "Jean Sibelius", "Carl Nielsen", "Niels Gade"), "Music", ""),
            zh = LocalizedContent("哪位作曲家以《培尔·金特》（组曲）闻名？", listOf("爱德华·格里格", "让·西贝柳斯", "卡尔·尼尔森", "尼尔斯·加德"), "音乐", ""),
            es = LocalizedContent("¿Qué compositor es conocido por 'Peer Gynt' (suite musical)?", listOf("Edvard Grieg", "Jean Sibelius", "Carl Nielsen", "Niels Gade"), "Música", "")
        ),
        BilingualQuestion(
            id = 10069, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du style musical à base de samples et de boucles né dans le Bronx ?", listOf("Hip-hop / Rap", "R&B", "Funk", "Soul"), "Musique", ""),
            en = LocalizedContent("What is the name of the musical style based on samples and loops that originated in the Bronx?", listOf("Hip-hop / Rap", "R&B", "Funk", "Soul"), "Music", ""),
            zh = LocalizedContent("起源于布朗克斯、以采样和循环为基础的音乐风格叫什么？", listOf("嘻哈/说唱", "节奏布鲁斯", "放克", "灵魂乐"), "音乐", ""),
            es = LocalizedContent("¿Cómo se llama el estilo musical basado en samples y loops que nació en el Bronx?", listOf("Hip-hop / Rap", "R&B", "Funk", "Soul"), "Música", "")
        ),
        BilingualQuestion(
            id = 10070, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est l'auteur-compositeur de 'Imagine' (1971) ?", listOf("John Lennon", "Paul McCartney", "George Harrison", "Ringo Starr"), "Musique", ""),
            en = LocalizedContent("Who is the singer-songwriter of 'Imagine' (1971)?", listOf("John Lennon", "Paul McCartney", "George Harrison", "Ringo Starr"), "Music", ""),
            zh = LocalizedContent("谁是《想象》（1971年）的词曲作者？", listOf("约翰·列侬", "保罗·麦卡特尼", "乔治·哈里森", "林戈·斯塔尔"), "音乐", ""),
            es = LocalizedContent("¿Quién es el cantautor de 'Imagine' (1971)?", listOf("John Lennon", "Paul McCartney", "George Harrison", "Ringo Starr"), "Musica", "")
        ),
        BilingualQuestion(
            id = 10071, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'épicurisme prône comme voie vers le bonheur ?", listOf("La recherche du plaisir simple et l'absence de douleur (ataraxie)", "Le plaisir charnel et matériel", "La vertu militaire", "L'indifférence totale"), "Philosophie", ""),
            en = LocalizedContent("What does Epicureanism advocate as a path to happiness?", listOf("The pursuit of simple pleasure and absence of pain (ataraxia)", "Carnal and material pleasure", "Military virtue", "Total indifference"), "Philosophy", ""),
            zh = LocalizedContent("伊壁鸠鲁主义提倡什么作为通往幸福的道路？", listOf("追求简单的快乐和免除痛苦（心神安宁）", "肉体和物质享受", "军事美德", "完全冷漠"), "哲学", ""),
            es = LocalizedContent("¿Qué defiende el epicureísmo como camino hacia la felicidad?", listOf("La búsqueda del placer simple y la ausencia de dolor (ataraxia)", "El placer carnal y material", "La virtud militar", "La indiferencia total"), "Filosofia", "")
        ),
        BilingualQuestion(
            id = 10072, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel philosophe a théorisé le 'voile d'ignorance' pour définir la justice ?", listOf("John Rawls", "Robert Nozick", "Michael Sandel", "Amartya Sen"), "Philosophie", ""),
            en = LocalizedContent("Which philosopher theorized the 'veil of ignorance' to define justice?", listOf("John Rawls", "Robert Nozick", "Michael Sandel", "Amartya Sen"), "Philosophy", ""),
            zh = LocalizedContent("哪位哲学家提出了“无知之幕”来定义正义？", listOf("约翰·罗尔斯", "罗伯特·诺齐克", "迈克尔·桑德尔", "阿马蒂亚·森"), "哲学", ""),
            es = LocalizedContent("¿Qué filósofo teorizó el 'velo de ignorancia' para definir la justicia?", listOf("John Rawls", "Robert Nozick", "Michael Sandel", "Amartya Sen"), "Filosofia", "")
        ),
        BilingualQuestion(
            id = 10073, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la maïeutique de Socrate ?", listOf("Art de faire accoucher les esprits de leurs idées par le questionnement", "Méthode d'enseignement par l'exemple", "Philosophie du doute radical", "Dialectique hégélienne"), "Philosophie", ""),
            en = LocalizedContent("What is Socrates' maieutics?", listOf("Art of giving birth to ideas through questioning", "Teaching method by example", "Philosophy of radical doubt", "Hegelian dialectic"), "Philosophy", ""),
            zh = LocalizedContent("苏格拉底的“助产术”是什么？", listOf("通过提问引导思想诞生的艺术", "以身作则的教学方法", "彻底怀疑的哲学", "黑格尔辩证法"), "哲学", ""),
            es = LocalizedContent("¿Qué es la mayéutica de Sócrates?", listOf("Arte de hacer nacer las ideas mediante preguntas", "Método de enseñanza mediante el ejemplo", "Filosofía de la duda radical", "Dialéctica hegeliana"), "Filosofia", "")
        ),
        BilingualQuestion(
            id = 10074, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le taux de chômage naturel ?", listOf("Niveau de chômage incompressible même en plein emploi (frictionnel + structurel)", "Taux de chômage zéro", "Chômage dû uniquement aux cycles économiques", "Taux d'emploi optimal"), "Économie", ""),
            en = LocalizedContent("What is the natural rate of unemployment?", listOf("Irreducible level of unemployment even at full employment (frictional + structural)", "Zero unemployment rate", "Unemployment due only to business cycles", "Optimal employment rate"), "Economics", ""),
            zh = LocalizedContent("什么是自然失业率？", listOf("即使在充分就业下也无法消除的失业水平（摩擦性+结构性）", "零失业率", "仅由经济周期引起的失业", "最优就业率"), "经济", ""),
            es = LocalizedContent("¿Qué es la tasa natural de desempleo?", listOf("Nivel de desempleo irreducible incluso en pleno empleo (friccional + estructural)", "Tasa de desempleo cero", "Desempleo debido únicamente a los ciclos económicos", "Tasa de empleo óptima"), "Economia", "")
        ),
        BilingualQuestion(
            id = 10075, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le rôle des taux d'intérêt directeurs des banques centrales ?", listOf("Réguler l'inflation et la croissance en influençant le coût du crédit", "Financer directement les États", "Contrôler le taux de change", "Superviser les banques commerciales"), "Économie", ""),
            en = LocalizedContent("What is the role of central banks' key interest rates?", listOf("Regulate inflation and growth by influencing the cost of credit", "Directly finance governments", "Control the exchange rate", "Supervise commercial banks"), "Economics", ""),
            zh = LocalizedContent("中央银行关键利率的作用是什么？", listOf("通过影响信贷成本来调节通胀和增长", "直接为政府融资", "控制汇率", "监管商业银行"), "经济", ""),
            es = LocalizedContent("¿Cuál es el papel de los tipos de interés clave de los bancos centrales?", listOf("Regular la inflación y el crecimiento influyendo en el coste del crédito", "Financiar directamente a los Estados", "Controlar el tipo de cambio", "Supervisar los bancos comerciales"), "Economia", "")
        ),
        BilingualQuestion(
            id = 10076, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la courbe de Laffer décrit ?", listOf("Relation entre taux d'imposition et recettes fiscales (optimum entre 0 et 100%)", "Relation entre inflation et chômage", "Courbe de demande inversée", "Rendements décroissants du capital"), "Économie", ""),
            en = LocalizedContent("What does the Laffer curve describe?", listOf("Relationship between tax rates and tax revenue (optimum between 0 and 100%)", "Relationship between inflation and unemployment", "Inverse demand curve", "Diminishing returns of capital"), "Economics", ""),
            zh = LocalizedContent("拉弗曲线描述了什么？", listOf("税率与税收收入之间的关系（最优税率在0到100%之间）", "通货膨胀与失业之间的关系", "反向需求曲线", "资本收益递减"), "经济", ""),
            es = LocalizedContent("¿Qué describe la curva de Laffer?", listOf("Relación entre tipos impositivos e ingresos fiscales (óptimo entre 0 y 100%)", "Relación entre inflación y desempleo", "Curva de demanda inversa", "Rendimientos decrecientes del capital"), "Economia", "")
        ),
        BilingualQuestion(
            id = 10077, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel animal est le plus rapide sur terre ?", listOf("Le guépard (110-120 km/h)", "Le lion (80 km/h)", "L'antilope (95 km/h)", "Le lièvre (70 km/h)"), "Nature", ""),
            en = LocalizedContent("Which animal is the fastest on land?", listOf("Cheetah (110-120 km/h)", "Lion (80 km/h)", "Antelope (95 km/h)", "Hare (70 km/h)"), "Nature", ""),
            zh = LocalizedContent("陆地上最快的动物是什么？", listOf("猎豹（110-120公里/小时）", "狮子（80公里/小时）", "羚羊（95公里/小时）", "野兔（70公里/小时）"), "自然", ""),
            es = LocalizedContent("¿Cuál es el animal más rápido en tierra?", listOf("El guepardo (110-120 km/h)", "El león (80 km/h)", "El antílope (95 km/h)", "La liebre (70 km/h)"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 10078, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la pollinisation par les chauves-souris ?", listOf("La chiroptérophilie — certaines plantes tropicales en dépendent", "Une pollinisation rare et inefficace", "Pollinisation nocturne par les insectes", "Processus limité aux déserts"), "Nature", ""),
            en = LocalizedContent("What is pollination by bats called?", listOf("Chiropterophily — some tropical plants depend on it", "Rare and inefficient pollination", "Nocturnal pollination by insects", "Process limited to deserts"), "Nature", ""),
            zh = LocalizedContent("蝙蝠授粉被称为什么？", listOf("蝙蝠传粉——某些热带植物依赖于此", "罕见且低效的授粉", "夜间昆虫授粉", "仅限于沙漠的过程"), "自然", ""),
            es = LocalizedContent("¿Cómo se llama la polinización por murciélagos?", listOf("Quiropterofilia — algunas plantas tropicales dependen de ella", "Polinización rara e ineficaz", "Polinización nocturna por insectos", "Proceso limitado a desiertos"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 10079, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand oiseau volant du monde par envergure ?", listOf("L'albatros hurleur (3,5 m d'envergure)", "Le condor des Andes (3,2 m)", "La grande outarde", "Le pélican"), "Nature", ""),
            en = LocalizedContent("What is the largest flying bird in the world by wingspan?", listOf("Wandering albatross (3.5 m wingspan)", "Andean condor (3.2 m)", "Great bustard", "Pelican"), "Nature", ""),
            zh = LocalizedContent("世界上翼展最大的飞鸟是什么？", listOf("漂泊信天翁（翼展3.5米）", "安第斯神鹫（翼展3.2米）", "大鸨", "鹈鹕"), "自然", ""),
            es = LocalizedContent("¿Cuál es el ave voladora más grande del mundo por envergadura?", listOf("Albatros errante (3,5 m de envergadura)", "Cóndor andino (3,2 m)", "Avutarda común", "Pelícano"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 10080, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom du phénomène quand les coraux perdent leur couleur ?", listOf("Le blanchissement corallien (bleaching)", "La nécrose corallienne", "La désintégration algale", "La désaturation marine"), "Nature", ""),
            en = LocalizedContent("What is the name of the phenomenon when corals lose their color?", listOf("Coral bleaching", "Coral necrosis", "Algal disintegration", "Marine desaturation"), "Nature", ""),
            zh = LocalizedContent("珊瑚失去颜色时，这种现象叫什么？", listOf("珊瑚白化", "珊瑚坏死", "藻类解体", "海洋脱饱和"), "自然", ""),
            es = LocalizedContent("¿Cuál es el nombre del fenómeno cuando los corales pierden su color?", listOf("Blanqueamiento coralino", "Necrosis coralina", "Desintegración algal", "Desaturación marina"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 10081, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que l'apiculture ?", listOf("Élevage des abeilles pour produire du miel", "Culture de fleurs mellifères", "Étude scientifique des insectes", "Pollinisation artificielle des cultures"), "Nature", ""),
            en = LocalizedContent("What is beekeeping?", listOf("Raising bees to produce honey", "Cultivation of melliferous flowers", "Scientific study of insects", "Artificial pollination of crops"), "Nature", ""),
            zh = LocalizedContent("什么是养蜂业？", listOf("养蜂以生产蜂蜜", "种植蜜源花卉", "昆虫的科学研究", "作物的人工授粉"), "自然", ""),
            es = LocalizedContent("¿Qué es la apicultura?", listOf("Cría de abejas para producir miel", "Cultivo de flores melíferas", "Estudio científico de los insectos", "Polinización artificial de cultivos"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 10082, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'est-ce que la théorie de la structuration (Giddens) ?", listOf("Les structures sociales sont à la fois le résultat et le moyen des actions humaines", "Les sociétés sont des structures fixes", "L'individu est déterminé par les structures", "La société est une somme d'individus"), "Sciences Humaines", ""),
            en = LocalizedContent("What is structuration theory (Giddens)?", listOf("Social structures are both the result and the means of human actions", "Societies are fixed structures", "The individual is determined by structures", "Society is a sum of individuals"), "Humanities", ""),
            zh = LocalizedContent("什么是结构化理论（吉登斯）？", listOf("社会结构既是人类行动的结果，也是人类行动的手段", "社会是固定的结构", "个体由结构决定", "社会是个体的总和"), "人文科学", ""),
            es = LocalizedContent("¿Qué es la teoría de la estructuración (Giddens)?", listOf("Las estructuras sociales son tanto el resultado como el medio de las acciones humanas", "Las sociedades son estructuras fijas", "El individuo está determinado por las estructuras", "La sociedad es una suma de individuos"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 10083, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel psychologue a développé la notion d'intelligence émotionnelle ?", listOf("Daniel Goleman (1995) - popularisé / Salovey & Mayer - théorie", "Howard Gardner", "Robert Sternberg", "Albert Bandura"), "Sciences Humaines", ""),
            en = LocalizedContent("Which psychologist developed the concept of emotional intelligence?", listOf("Daniel Goleman (1995) - popularized / Salovey & Mayer - theory", "Howard Gardner", "Robert Sternberg", "Albert Bandura"), "Humanities", ""),
            zh = LocalizedContent("哪位心理学家提出了情绪智力的概念？", listOf("丹尼尔·戈尔曼（1995年）——推广 / 萨洛维和梅耶——理论", "霍华德·加德纳", "罗伯特·斯滕伯格", "阿尔伯特·班杜拉"), "人文科学", ""),
            es = LocalizedContent("¿Qué psicólogo desarrolló el concepto de inteligencia emocional?", listOf("Daniel Goleman (1995) - popularizó / Salovey & Mayer - teoría", "Howard Gardner", "Robert Sternberg", "Albert Bandura"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 10084, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'anthropologie physique étudie ?", listOf("Évolution biologique et diversité physique des humains", "Les cultures et sociétés humaines", "Les langues humaines", "Les comportements sociaux"), "Sciences Humaines", ""),
            en = LocalizedContent("What does physical anthropology study?", listOf("Biological evolution and physical diversity of humans", "Human cultures and societies", "Human languages", "Social behaviors"), "Humanities", ""),
            zh = LocalizedContent("体质人类学研究什么？", listOf("人类的生物进化和身体多样性", "人类文化和社会", "人类语言", "社会行为"), "人文科学", ""),
            es = LocalizedContent("¿Qué estudia la antropología física?", listOf("Evolución biológica y diversidad física de los humanos", "Las culturas y sociedades humanas", "Los lenguajes humanos", "Los comportamientos sociales"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 10085, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé le mouvement du Pointillisme?", listOf("Paul Cézanne", "Paul Signac", "Vincent van Gogh", "Claude Monet"), "Culture", "Bien que Georges Seurat soit le pionnier de la technique pointilliste avec son tableau \"Un dimanche après-midi à l'île de la Grande Jatte\", Paul Signac en a été le principal théoricien et continuateur."),
            en = LocalizedContent("Which painter created the Pointillism movement?", listOf("Paul Cézanne", "Paul Signac", "Vincent van Gogh", "Claude Monet"), "Culture", "Although Georges Seurat was the pioneer of the pointillist technique with his painting \"A Sunday Afternoon on the Island of La Grande Jatte\", Paul Signac was its main theorist and continuator."),
            zh = LocalizedContent("哪位画家创立了点彩画派？", listOf("保罗·塞尚", "保罗·西涅克", "文森特·梵高", "克劳德·莫奈"), "文化", "尽管乔治·修拉以其画作《大碗岛的星期天下午》成为点彩技法的先驱，但保罗·西涅克是其主要的理论家和继承者。"),
            es = LocalizedContent("¿Qué pintor creó el movimiento del puntillismo?", listOf("Paul Cézanne", "Paul Signac", "Vincent van Gogh", "Claude Monet"), "Cultura", "Aunque Georges Seurat fue el pionero de la técnica puntillista con su cuadro \"Un domingo de verano en la isla de la Grande Jatte\", Paul Signac fue su principal teórico y continuador.")
        ),
        BilingualQuestion(
            id = 10086, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel siècle le dôme de Florence a-t-il été construit?", listOf("13e siècle", "14e siècle", "15e siècle", "16e siècle"), "Culture", "Le dôme de Florence, conçu par Filippo Brunelleschi, a été construit au 15e siècle, entre 1420 et 1436, marquant une prouesse architecturale de la Renaissance."),
            en = LocalizedContent("In which century was the Florence Cathedral dome built?", listOf("13th century", "14th century", "15th century", "16th century"), "Culture", "The dome of Florence Cathedral, designed by Filippo Brunelleschi, was built in the 15th century, between 1420 and 1436, marking an architectural feat of the Renaissance."),
            zh = LocalizedContent("佛罗伦萨大教堂的穹顶建于哪个世纪？", listOf("13世纪", "14世纪", "15世纪", "16世纪"), "文化", "佛罗伦萨大教堂的穹顶由菲利波·布鲁内莱斯基设计，建于15世纪（1420年至1436年），标志着文艺复兴时期的建筑壮举。"),
            es = LocalizedContent("¿En qué siglo se construyó la cúpula de la catedral de Florencia?", listOf("Siglo XIII", "Siglo XIV", "Siglo XV", "Siglo XVI"), "Cultura", "La cúpula de la catedral de Florencia, diseñada por Filippo Brunelleschi, se construyó en el siglo XV, entre 1420 y 1436, marcando una hazaña arquitectónica del Renacimiento.")
        ),
        BilingualQuestion(
            id = 10087, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus ancien opéra encore joué?", listOf("Orphée de Monteverdi", "Don Giovanni de Mozart", "La Traviata de Verdi", "Tosca de Puccini"), "Culture", "Composé par Claudio Monteverdi en 1607, Orphée est considéré comme le premier chef-d'œuvre de l'histoire de l'opéra et reste régulièrement représenté sur les scènes du monde entier."),
            en = LocalizedContent("What is the oldest opera still performed?", listOf("Monteverdi's Orfeo", "Mozart's Don Giovanni", "Verdi's La Traviata", "Puccini's Tosca"), "Culture", "Composed by Claudio Monteverdi in 1607, Orfeo is considered the first masterpiece in the history of opera and is still regularly performed on stages around the world."),
            zh = LocalizedContent("哪部歌剧是仍在演出的最古老歌剧？", listOf("蒙特威尔第的《奥菲欧》", "莫扎特的《唐·乔瓦尼》", "威尔第的《茶花女》", "普契尼的《托斯卡》"), "文化", "由克劳迪奥·蒙特威尔第于1607年创作的《奥菲欧》被认为是歌剧史上的第一部杰作，至今仍在世界各地的舞台上定期上演。"),
            es = LocalizedContent("¿Cuál es la ópera más antigua que aún se representa?", listOf("Orfeo de Monteverdi", "Don Giovanni de Mozart", "La Traviata de Verdi", "Tosca de Puccini"), "Cultura", "Compuesta por Claudio Monteverdi en 1607, Orfeo es considerada la primera obra maestra de la historia de la ópera y sigue representándose regularmente en los escenarios de todo el mundo.")
        ),
        BilingualQuestion(
            id = 10088, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'The Office' a-t-il commencé (version américaine)?", listOf("2003", "2004", "2005", "2006"), "Culture", "La version américaine de The Office a débuté le 24 mars 2005, mais sa première saison a été diffusée en 2004-2005, l'année de production étant 2004."),
            en = LocalizedContent("In which year did 'The Office' (US version) start?", listOf("2003", "2004", "2005", "2006"), "Culture", "The US version of The Office premiered on March 24, 2005, but its first season aired in 2004-2005, with the production year being 2004."),
            zh = LocalizedContent("《办公室》（美国版）在哪一年开播？", listOf("2003年", "2004年", "2005年", "2006年"), "文化", "美国版《办公室》于2005年3月24日首播，但其第一季在2004-2005年播出，制作年份为2004年。"),
            es = LocalizedContent("¿En qué año comenzó 'The Office' (versión estadounidense)?", listOf("2003", "2004", "2005", "2006"), "Cultura", "La versión estadounidense de The Office se estrenó el 24 de marzo de 2005, pero su primera temporada se emitió en 2004-2005, siendo el año de producción 2004.")
        ),
        BilingualQuestion(
            id = 10089, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film a remporté l'Oscar du Meilleur Film en 2021?", listOf("Sound of Metal", "Nomadland", "Minari", "Promising Young Woman"), "Culture", "Nomadland, réalisé par Chloé Zhao, a remporté l'Oscar du meilleur film en 2021, devenant le premier film réalisé par une femme de couleur à gagner cette récompense."),
            en = LocalizedContent("Which film won the Academy Award for Best Picture in 2021?", listOf("Sound of Metal", "Nomadland", "Minari", "Promising Young Woman"), "Culture", "Nomadland, directed by Chloé Zhao, won the Academy Award for Best Picture in 2021, becoming the first film directed by a woman of color to win this award."),
            zh = LocalizedContent("哪部电影在2021年获得了奥斯卡最佳影片奖？", listOf("《金属之声》", "《无依之地》", "《米纳里》", "《前程似锦的女孩》"), "文化", "由赵婷执导的《无依之地》在2021年获得了奥斯卡最佳影片奖，成为第一部由有色人种女性执导并获得该奖项的电影。"),
            es = LocalizedContent("¿Qué película ganó el Premio de la Academia a la Mejor Película en 2021?", listOf("Sound of Metal", "Nomadland", "Minari", "Promising Young Woman"), "Cultura", "Nomadland, dirigida por Chloé Zhao, ganó el Premio de la Academia a la Mejor Película en 2021, convirtiéndose en la primera película dirigida por una mujer de color en ganar este premio.")
        ),
    )

    private fun part3(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 10090, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'Crime et Châtiment'?", listOf("Fiodor Dostoïevski", "Léon Tolstoï", "Ivan Tourgueniev", "Nikolai Gogol"), "Culture", "Fiodor Dostoïevski a publié ce roman russe majeur en 1866, explorant la psychologie d'un meurtrier et les thèmes de la culpabilité et de la rédemption."),
            en = LocalizedContent("Who wrote 'Crime and Punishment'?", listOf("Fyodor Dostoevsky", "Leo Tolstoy", "Ivan Turgenev", "Nikolai Gogol"), "Culture", "Fyodor Dostoevsky published this major Russian novel in 1866, exploring the psychology of a murderer and themes of guilt and redemption."),
            zh = LocalizedContent("谁写了《罪与罚》？", listOf("费奥多尔·陀思妥耶夫斯基", "列夫·托尔斯泰", "伊万·屠格涅夫", "尼古莱·果戈理"), "文化", "费奥多尔·陀思妥耶夫斯基于1866年出版了这部重要的俄罗斯小说，探讨了杀人犯的心理以及罪恶与救赎的主题。"),
            es = LocalizedContent("¿Quién escribió 'Crimen y castigo'?", listOf("Fiódor Dostoyevski", "León Tolstói", "Iván Turguénev", "Nikolái Gógol"), "Cultura", "Fiódor Dostoyevski publicó esta importante novela rusa en 1866, explorando la psicología de un asesino y los temas de culpa y redención.")
        ),
        BilingualQuestion(
            id = 10091, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel instrument à percussion vient d'Afrique?", listOf("Xylophone", "Tam-tam", "Djembe", "Tous les trois"), "Culture", "Le djembé, le balafon et la sanza sont tous des instruments à percussion originaires d'Afrique, utilisés dans diverses traditions musicales du continent."),
            en = LocalizedContent("Which percussion instrument comes from Africa?", listOf("Xylophone", "Tam-tam", "Djembe", "All three"), "Culture", "The djembe, balafon, and sanza are all percussion instruments originating from Africa, used in various musical traditions of the continent."),
            zh = LocalizedContent("哪种打击乐器来自非洲？", listOf("木琴", "锣", "金贝鼓", "以上都是"), "文化", "金贝鼓、巴拉风琴和桑扎琴都是源自非洲的打击乐器，用于非洲大陆的各种音乐传统。"),
            es = LocalizedContent("¿Qué instrumento de percusión proviene de África?", listOf("Xilófono", "Tam-tam", "Djembe", "Los tres"), "Cultura", "El djembe, el balafón y la sanza son instrumentos de percusión originarios de África, utilizados en diversas tradiciones musicales del continente.")
        ),
        BilingualQuestion(
            id = 10092, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année a été écrit 'L'Odyssée'?", listOf("8e siècle av. J.-C.", "9e siècle av. J.-C.", "10e siècle av. J.-C.", "11e siècle av. J.-C."), "Culture", "L'Odyssée, attribuée à Homère, a été composée oralement vers la fin du VIIIe siècle av. J.-C., ce qui en fait l'une des plus anciennes œuvres de la littérature occidentale."),
            en = LocalizedContent("In which century was 'The Odyssey' written?", listOf("8th century BC", "9th century BC", "10th century BC", "11th century BC"), "Culture", "The Odyssey, attributed to Homer, was composed orally towards the end of the 8th century BC, making it one of the oldest works of Western literature."),
            zh = LocalizedContent("《奥德赛》写于哪个世纪？", listOf("公元前8世纪", "公元前9世纪", "公元前10世纪", "公元前11世纪"), "文化", "《奥德赛》归功于荷马，口头创作于公元前8世纪末，是西方文学中最古老的作品之一。"),
            es = LocalizedContent("¿En qué siglo se escribió 'La Odisea'?", listOf("Siglo VIII a.C.", "Siglo IX a.C.", "Siglo X a.C.", "Siglo XI a.C."), "Cultura", "La Odisea, atribuida a Homero, fue compuesta oralmente hacia finales del siglo VIII a.C., lo que la convierte en una de las obras más antiguas de la literatura occidental.")
        ),
        BilingualQuestion(
            id = 10093, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel cinéaste a réalisé 'Parasite'?", listOf("Hirokazu Koreeda", "Bong Joon-ho", "Lee Chang-dong", "Na Hong-jin"), "Culture", "Bong Joon-ho est le réalisateur sud-coréen de Parasite, film qui a remporté la Palme d'or à Cannes en 2019 et l'Oscar du meilleur film en 2020."),
            en = LocalizedContent("Which filmmaker directed 'Parasite'?", listOf("Hirokazu Koreeda", "Bong Joon-ho", "Lee Chang-dong", "Na Hong-jin"), "Culture", "Bong Joon-ho is the South Korean director of Parasite, which won the Palme d'Or at Cannes in 2019 and the Oscar for Best Picture in 2020."),
            zh = LocalizedContent("哪位电影导演执导了《寄生虫》？", listOf("是枝裕和", "奉俊昊", "李沧东", "罗宏镇"), "文化", "奉俊昊是韩国导演，执导了《寄生虫》，该片在2019年戛纳电影节获得金棕榈奖，并在2020年获得奥斯卡最佳影片奖。"),
            es = LocalizedContent("¿Qué cineasta dirigió 'Parásitos'?", listOf("Hirokazu Koreeda", "Bong Joon-ho", "Lee Chang-dong", "Na Hong-jin"), "Cultura", "Bong Joon-ho es el director surcoreano de Parásitos, película que ganó la Palma de Oro en Cannes en 2019 y el Oscar a la mejor película en 2020.")
        ),
        BilingualQuestion(
            id = 10094, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le style de la Tour de Pise?", listOf("Gothique", "Renaissance", "Baroque", "Roman"), "Culture", "La Tour de Pise a été construite entre les XIIe et XIVe siècles, ce qui correspond à la période de l'art roman en Italie. Son architecture présente des arcs en plein cintre et des colonnes massives typiques de ce style."),
            en = LocalizedContent("What is the architectural style of the Leaning Tower of Pisa?", listOf("Gothic", "Renaissance", "Baroque", "Romanesque"), "Culture", "The Leaning Tower of Pisa was built between the 12th and 14th centuries, corresponding to the Romanesque period in Italy. Its architecture features round arches and massive columns typical of this style."),
            zh = LocalizedContent("比萨斜塔的建筑风格是什么？", listOf("哥特式", "文艺复兴式", "巴洛克式", "罗马式"), "文化", "比萨斜塔建于12至14世纪，对应意大利的罗马式时期。其建筑具有圆拱和粗大柱子的特点，是这一风格的典型。"),
            es = LocalizedContent("¿Cuál es el estilo arquitectónico de la Torre Inclinada de Pisa?", listOf("Gótico", "Renacimiento", "Barroco", "Románico"), "Cultura", "La Torre Inclinada de Pisa fue construida entre los siglos XII y XIV, correspondiendo al período románico en Italia. Su arquitectura presenta arcos de medio punto y columnas macizas típicas de este estilo.")
        ),
        BilingualQuestion(
            id = 10095, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Mozart a-t-il composé 'Eine kleine Nachtmusik'?", listOf("1785", "1787", "1788", "1790"), "Culture", "Mozart a composé 'Eine kleine Nachtmusik' en 1787, mais une erreur historique a longtemps attribué cette œuvre à 1785. La date correcte a été établie grâce aux recherches sur le catalogue manuscrit de ses œuvres."),
            en = LocalizedContent("In which year did Mozart compose 'Eine kleine Nachtmusik'?", listOf("1785", "1787", "1788", "1790"), "Culture", "Mozart composed 'Eine kleine Nachtmusik' in 1787, but a historical error long attributed this work to 1785. The correct date was established through research on the manuscript catalog of his works."),
            zh = LocalizedContent("莫扎特在哪一年创作了《G大调弦乐小夜曲》？", listOf("1785年", "1787年", "1788年", "1790年"), "文化", "莫扎特于1787年创作了《G大调弦乐小夜曲》，但历史上长期误认为是1785年。通过对其作品手稿目录的研究，确定了正确日期。"),
            es = LocalizedContent("¿En qué año compuso Mozart 'Eine kleine Nachtmusik'?", listOf("1785", "1787", "1788", "1790"), "Cultura", "Mozart compuso 'Eine kleine Nachtmusik' en 1787, pero un error histórico atribuyó esta obra a 1785 durante mucho tiempo. La fecha correcta se estableció gracias a investigaciones sobre el catálogo manuscrito de sus obras.")
        ),
        BilingualQuestion(
            id = 10096, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel type de cuisine est caractérisé par l'utilisation de sushi?", listOf("Cuisine thaïlandaise", "Cuisine japonaise", "Cuisine chinoise", "Cuisine coréenne"), "Culture", "Le sushi est un plat traditionnel japonais à base de riz vinaigré, souvent accompagné de poisson cru ou d'autres ingrédients. Il est emblématique de la cuisine japonaise."),
            en = LocalizedContent("Which type of cuisine is characterized by the use of sushi?", listOf("Thai cuisine", "Japanese cuisine", "Chinese cuisine", "Korean cuisine"), "Culture", "Sushi is a traditional Japanese dish made with vinegared rice, often accompanied by raw fish or other ingredients. It is emblematic of Japanese cuisine."),
            zh = LocalizedContent("哪种菜系以使用寿司为特色？", listOf("泰国菜", "日本菜", "中国菜", "韩国菜"), "文化", "寿司是一种传统的日本料理，以醋饭为基础，常搭配生鱼或其他食材。它是日本料理的标志性食物。"),
            es = LocalizedContent("¿Qué tipo de cocina se caracteriza por el uso de sushi?", listOf("Cocina tailandesa", "Cocina japonesa", "Cocina china", "Cocina coreana"), "Cultura", "El sushi es un plato tradicional japonés a base de arroz avinagrado, a menudo acompañado de pescado crudo u otros ingredientes. Es emblemático de la cocina japonesa.")
        ),
        BilingualQuestion(
            id = 10097, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a créé 'Mickey Mouse'?", listOf("Walt Disney", "Ub Iwerks", "Carl Barks", "Floyd Gottfredson"), "Culture", "Walt Disney a co-créé Mickey Mouse avec Ub Iwerks en 1928, le personnage apparaissant pour la première fois dans le court métrage Steamboat Willie."),
            en = LocalizedContent("Who created 'Mickey Mouse'?", listOf("Walt Disney", "Ub Iwerks", "Carl Barks", "Floyd Gottfredson"), "Culture", "Walt Disney co-created Mickey Mouse with Ub Iwerks in 1928, with the character first appearing in the short film Steamboat Willie."),
            zh = LocalizedContent("谁创造了米老鼠？", listOf("华特·迪士尼", "乌布·伊沃克斯", "卡尔·巴克斯", "弗洛伊德·戈特弗雷德森"), "文化", "华特·迪士尼与乌布·伊沃克斯于1928年共同创造了米老鼠，该角色首次出现在短片《威利号汽船》中。"),
            es = LocalizedContent("¿Quién creó a 'Mickey Mouse'?", listOf("Walt Disney", "Ub Iwerks", "Carl Barks", "Floyd Gottfredson"), "Cultura", "Walt Disney co-creó a Mickey Mouse con Ub Iwerks en 1928, apareciendo el personaje por primera vez en el cortometraje Steamboat Willie.")
        ),
        BilingualQuestion(
            id = 10098, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'Fortnite' est-il sorti?", listOf("2015", "2016", "2017", "2018"), "Culture", "Fortnite a été lancé en accès anticipé en juillet 2017, avant de connaître un succès mondial avec son mode Battle Royale."),
            en = LocalizedContent("In which year was 'Fortnite' released?", listOf("2015", "2016", "2017", "2018"), "Culture", "Fortnite was released in early access in July 2017, before achieving worldwide success with its Battle Royale mode."),
            zh = LocalizedContent("《堡垒之夜》在哪一年发布？", listOf("2015年", "2016年", "2017年", "2018年"), "文化", "《堡垒之夜》于2017年7月以抢先体验形式发布，随后凭借其大逃杀模式取得全球成功。"),
            es = LocalizedContent("¿En qué año se lanzó 'Fortnite'?", listOf("2015", "2016", "2017", "2018"), "Cultura", "Fortnite se lanzó en acceso anticipado en julio de 2017, antes de alcanzar el éxito mundial con su modo Battle Royale.")
        ),
        BilingualQuestion(
            id = 10099, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre est connu pour ses autoportraits?", listOf("Rembrandt", "Vincent van Gogh", "Paul Cézanne", "Tous les trois"), "Culture", "Rembrandt, Van Gogh et Frida Kahlo sont tous célèbres pour leurs nombreux autoportraits, qui jalonnent leur carrière et explorent leur identité."),
            en = LocalizedContent("Which painter is known for their self-portraits?", listOf("Rembrandt", "Vincent van Gogh", "Paul Cézanne", "All three"), "Culture", "Rembrandt, Van Gogh, and Frida Kahlo are all famous for their numerous self-portraits, which mark their careers and explore their identity."),
            zh = LocalizedContent("哪位画家以自画像闻名？", listOf("伦勃朗", "文森特·梵高", "保罗·塞尚", "以上都是"), "文化", "伦勃朗、梵高和弗里达·卡罗都以众多自画像闻名，这些作品贯穿他们的职业生涯并探索其身份。"),
            es = LocalizedContent("¿Qué pintor es conocido por sus autorretratos?", listOf("Rembrandt", "Vincent van Gogh", "Paul Cézanne", "Los tres"), "Cultura", "Rembrandt, Van Gogh y Frida Kahlo son famosos por sus numerosos autorretratos, que marcan sus carreras y exploran su identidad.")
        ),
        BilingualQuestion(
            id = 10100, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie grecque, qui a volé le feu aux dieux?", listOf("Prométhée", "Héraclès", "Persée", "Thésée"), "Culture", "Prométhée a dérobé le feu sacré de l'Olympe pour le donner aux humains, défiant ainsi la volonté de Zeus. Ce mythe symbolise l'acquisition de la connaissance et de la civilisation par l'humanité."),
            en = LocalizedContent("In Greek mythology, who stole fire from the gods?", listOf("Prometheus", "Heracles", "Perseus", "Theseus"), "Culture", "Prometheus stole sacred fire from Olympus to give to humans, defying Zeus's will. This myth symbolizes humanity's acquisition of knowledge and civilization."),
            zh = LocalizedContent("在希腊神话中，谁从众神那里偷走了火？", listOf("普罗米修斯", "赫拉克勒斯", "珀尔修斯", "忒修斯"), "文化", "普罗米修斯从奥林匹斯山盗取圣火送给人类，违抗了宙斯的意志。这个神话象征着人类获得知识和文明。"),
            es = LocalizedContent("En la mitología griega, ¿quién robó el fuego de los dioses?", listOf("Prometeo", "Heracles", "Perseo", "Teseo"), "Cultura", "Prometeo robó el fuego sagrado del Olimpo para dárselo a los humanos, desafiando la voluntad de Zeus. Este mito simboliza la adquisición del conocimiento y la civilización por parte de la humanidad.")
        ),
        BilingualQuestion(
            id = 10101, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film de Stanley Kubrick est le plus connu?", listOf("A Clockwork Orange", "The Shining", "2001: A Space Odyssey", "Barry Lyndon"), "Culture", "2001: A Space Odyssey est souvent considéré comme le chef-d'œuvre le plus emblématique de Kubrick, marquant l'histoire du cinéma par son réalisme scientifique et ses effets visuels novateurs."),
            en = LocalizedContent("Which Stanley Kubrick film is the most famous?", listOf("A Clockwork Orange", "The Shining", "2001: A Space Odyssey", "Barry Lyndon"), "Culture", "2001: A Space Odyssey is often considered Kubrick's most iconic masterpiece, marking film history with its scientific realism and innovative visual effects."),
            zh = LocalizedContent("斯坦利·库布里克哪部电影最著名？", listOf("发条橙", "闪灵", "2001太空漫游", "巴里·林登"), "文化", "《2001太空漫游》常被视为库布里克最具代表性的杰作，以其科学现实主义和创新的视觉效果在电影史上留下印记。"),
            es = LocalizedContent("¿Qué película de Stanley Kubrick es la más famosa?", listOf("La naranja mecánica", "El resplandor", "2001: Una odisea del espacio", "Barry Lyndon"), "Cultura", "2001: Una odisea del espacio es a menudo considerada la obra maestra más emblemática de Kubrick, marcando la historia del cine por su realismo científico y efectos visuales innovadores.")
        ),
        BilingualQuestion(
            id = 10102, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel type de danse vient d'Argentine?", listOf("Flamenco", "Tango", "Samba", "Merengue"), "Culture", "Le tango est né dans les quartiers populaires de Buenos Aires à la fin du XIXe siècle, mêlant influences africaines, européennes et locales."),
            en = LocalizedContent("What type of dance comes from Argentina?", listOf("Flamenco", "Tango", "Samba", "Merengue"), "Culture", "Tango originated in the working-class neighborhoods of Buenos Aires in the late 19th century, blending African, European, and local influences."),
            zh = LocalizedContent("哪种舞蹈源自阿根廷？", listOf("弗拉门戈", "探戈", "桑巴", "梅伦格"), "文化", "探戈起源于19世纪末布宜诺斯艾利斯的工人阶级社区，融合了非洲、欧洲和当地的影响。"),
            es = LocalizedContent("¿Qué tipo de baile proviene de Argentina?", listOf("Flamenco", "Tango", "Samba", "Merengue"), "Cultura", "El tango nació en los barrios populares de Buenos Aires a finales del siglo XIX, mezclando influencias africanas, europeas y locales.")
        ),
        BilingualQuestion(
            id = 10103, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'L'Iliade'?", listOf("Homère", "Hésiode", "Orphée", "Hésychius"), "Culture", "Homère est traditionnellement considéré comme l'auteur de l'Iliade et de l'Odyssée, deux épopées fondatrices de la littérature grecque antique."),
            en = LocalizedContent("Who wrote 'The Iliad'?", listOf("Homer", "Hesiod", "Orpheus", "Hesychius"), "Culture", "Homer is traditionally considered the author of the Iliad and the Odyssey, two foundational epics of ancient Greek literature."),
            zh = LocalizedContent("谁写了《伊利亚特》？", listOf("荷马", "赫西俄德", "俄耳甫斯", "赫西基乌斯"), "文化", "荷马传统上被认为是《伊利亚特》和《奥德赛》的作者，这两部史诗是古希腊文学的奠基之作。"),
            es = LocalizedContent("¿Quién escribió 'La Ilíada'?", listOf("Homero", "Hesíodo", "Orfeo", "Hesiquio"), "Cultura", "Homero es tradicionalmente considerado el autor de la Ilíada y la Odisea, dos epopeyas fundacionales de la literatura griega antigua.")
        ),
        BilingualQuestion(
            id = 10104, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand théâtre du monde?", listOf("La Scala de Milan", "Opéra Garnier", "Metropolitan Opera House", "Royal Albert Hall"), "Culture", "Le Metropolitan Opera House de New York est le plus grand théâtre d'opéra du monde, avec une capacité d'environ 3 800 places."),
            en = LocalizedContent("What is the largest theater in the world?", listOf("La Scala in Milan", "Opéra Garnier", "Metropolitan Opera House", "Royal Albert Hall"), "Culture", "The Metropolitan Opera House in New York is the largest opera theater in the world, with a capacity of about 3,800 seats."),
            zh = LocalizedContent("世界上最大的剧院是哪个？", listOf("米兰斯卡拉歌剧院", "巴黎歌剧院", "大都会歌剧院", "皇家阿尔伯特音乐厅"), "文化", "纽约的大都会歌剧院是世界上最大的歌剧院，容量约为3800个座位。"),
            es = LocalizedContent("¿Cuál es el teatro más grande del mundo?", listOf("La Scala de Milán", "Ópera Garnier", "Metropolitan Opera House", "Royal Albert Hall"), "Cultura", "El Metropolitan Opera House de Nueva York es el teatro de ópera más grande del mundo, con una capacidad de aproximadamente 3.800 asientos.")
        ),
        BilingualQuestion(
            id = 10105, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'The Crown' a-t-il commencé?", listOf("2014", "2015", "2016", "2017"), "Culture", "La série historique 'The Crown', qui retrace le règne de la reine Élisabeth II, a été lancée sur Netflix en 2016."),
            en = LocalizedContent("In what year did 'The Crown' start?", listOf("2014", "2015", "2016", "2017"), "Culture", "The historical series 'The Crown', which chronicles the reign of Queen Elizabeth II, was launched on Netflix in 2016."),
            zh = LocalizedContent("《王冠》在哪一年开播？", listOf("2014", "2015", "2016", "2017"), "文化", "历史剧《王冠》讲述了伊丽莎白二世女王的统治时期，于2016年在Netflix上线。"),
            es = LocalizedContent("¿En qué año comenzó 'The Crown'?", listOf("2014", "2015", "2016", "2017"), "Cultura", "La serie histórica 'The Crown', que narra el reinado de la reina Isabel II, se lanzó en Netflix en 2016.")
        ),
        BilingualQuestion(
            id = 10106, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé le mouvement de l'Impressionnisme?", listOf("Claude Monet", "Pierre-Auguste Renoir", "Camille Pissarro", "Tous les trois"), "Culture", "Le mouvement impressionniste n'a pas été fondé par un seul artiste, mais par un groupe de peintres dont Monet, Renoir et Degas, qui ont exposé ensemble en 1874."),
            en = LocalizedContent("Which painter created the Impressionist movement?", listOf("Claude Monet", "Pierre-Auguste Renoir", "Camille Pissarro", "All three"), "Culture", "The Impressionist movement was not founded by a single artist, but by a group of painters including Monet, Renoir, and Degas, who exhibited together in 1874."),
            zh = LocalizedContent("哪位画家创立了印象派运动？", listOf("克劳德·莫奈", "皮埃尔-奥古斯特·雷诺阿", "卡米耶·毕沙罗", "以上都是"), "文化", "印象派运动并非由单一艺术家创立，而是由包括莫奈、雷诺阿和德加在内的一群画家共同发起，他们于1874年一起展出。"),
            es = LocalizedContent("¿Qué pintor creó el movimiento impresionista?", listOf("Claude Monet", "Pierre-Auguste Renoir", "Camille Pissarro", "Los tres"), "Cultura", "El movimiento impresionista no fue fundado por un solo artista, sino por un grupo de pintores entre los que se encontraban Monet, Renoir y Degas, que expusieron juntos en 1874.")
        ),
        BilingualQuestion(
            id = 10107, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style musical a émergé de Liverpool dans les années 1960?", listOf("Punk", "Mersey Beat", "Psychédélique", "Hard Rock"), "Culture", "Le Mersey Beat désigne le style pop-rock des groupes de Liverpool et des environs, popularisé par les Beatles et d'autres formations locales au début des années 1960."),
            en = LocalizedContent("What musical style emerged from Liverpool in the 1960s?", listOf("Punk", "Mersey Beat", "Psychedelic", "Hard Rock"), "Culture", "Mersey Beat refers to the pop-rock style of bands from Liverpool and the surrounding area, popularized by the Beatles and other local groups in the early 1960s."),
            zh = LocalizedContent("20世纪60年代从利物浦兴起的音乐风格是什么？", listOf("朋克", "默西节拍", "迷幻", "硬摇滚"), "文化", "默西节拍指的是利物浦及周边地区乐队的流行摇滚风格，由披头士和其他当地团体在20世纪60年代初推广开来。"),
            es = LocalizedContent("¿Qué estilo musical surgió de Liverpool en la década de 1960?", listOf("Punk", "Mersey Beat", "Psicodélico", "Hard Rock"), "Cultura", "El Mersey Beat se refiere al estilo pop-rock de las bandas de Liverpool y sus alrededores, popularizado por los Beatles y otras formaciones locales a principios de los años 60.")
        ),
        BilingualQuestion(
            id = 10108, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'The Beatles' se sont-ils séparés?", listOf("1968", "1969", "1970", "1971"), "Culture", "La séparation des Beatles a été officialisée en avril 1970, lorsque Paul McCartney a annoncé son départ du groupe, mettant fin à une décennie de collaboration légendaire."),
            en = LocalizedContent("In what year did 'The Beatles' break up?", listOf("1968", "1969", "1970", "1971"), "Culture", "The Beatles' breakup was made official in April 1970, when Paul McCartney announced his departure from the group, ending a decade of legendary collaboration."),
            zh = LocalizedContent("披头士在哪一年解散？", listOf("1968", "1969", "1970", "1971"), "文化", "披头士的解散于1970年4月正式确定，当时保罗·麦卡特尼宣布离开乐队，结束了长达十年的传奇合作。"),
            es = LocalizedContent("¿En qué año se separaron 'The Beatles'?", listOf("1968", "1969", "1970", "1971"), "Cultura", "La separación de los Beatles se oficializó en abril de 1970, cuando Paul McCartney anunció su salida del grupo, poniendo fin a una década de colaboración legendaria.")
        ),
        BilingualQuestion(
            id = 10109, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus vieux livre connu?", listOf("L'Épopée de Gilgamesh", "La Bible", "L'Odyssée", "Le Coran"), "Culture", "L'Épopée de Gilgamesh, gravée sur des tablettes d'argile en écriture cunéiforme, date d'environ 2100 av. J.-C. en Mésopotamie. Elle est considérée comme la plus ancienne œuvre littéraire majeure connue."),
            en = LocalizedContent("What is the oldest known book?", listOf("The Epic of Gilgamesh", "The Bible", "The Odyssey", "The Quran"), "Culture", "The Epic of Gilgamesh, inscribed on clay tablets in cuneiform script, dates from around 2100 BC in Mesopotamia. It is considered the oldest known major literary work."),
            zh = LocalizedContent("已知最古老的书是什么？", listOf("《吉尔伽美什史诗》", "《圣经》", "《奥德赛》", "《古兰经》"), "文化", "《吉尔伽美什史诗》以楔形文字刻在泥板上，可追溯到公元前2100年左右的美索不达米亚，被认为是已知最古老的重大文学作品。"),
            es = LocalizedContent("¿Cuál es el libro más antiguo conocido?", listOf("La Epopeya de Gilgamesh", "La Biblia", "La Odisea", "El Corán"), "Cultura", "La Epopeya de Gilgamesh, grabada en tablillas de arcilla con escritura cuneiforme, data de alrededor del 2100 a.C. en Mesopotamia. Se considera la obra literaria importante más antigua conocida.")
        ),
        BilingualQuestion(
            id = 10110, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé 'Citizen Kane'?", listOf("John Ford", "Orson Welles", "Vincente Minnelli", "John Huston"), "Culture", "Orson Welles a réalisé, co-écrit et joué le rôle principal dans Citizen Kane, sorti en 1941. Ce film est souvent considéré comme l'un des plus grands de l'histoire du cinéma."),
            en = LocalizedContent("Who directed 'Citizen Kane'?", listOf("John Ford", "Orson Welles", "Vincente Minnelli", "John Huston"), "Culture", "Orson Welles directed, co-wrote, and starred in Citizen Kane, released in 1941. This film is often considered one of the greatest in cinema history."),
            zh = LocalizedContent("谁导演了《公民凯恩》？", listOf("约翰·福特", "奥逊·威尔斯", "文森特·明奈利", "约翰·休斯顿"), "文化", "奥逊·威尔斯导演、合著并主演了1941年上映的《公民凯恩》。这部电影常被视为电影史上最伟大的作品之一。"),
            es = LocalizedContent("¿Quién dirigió 'Ciudadano Kane'?", listOf("John Ford", "Orson Welles", "Vincente Minnelli", "John Huston"), "Cultura", "Orson Welles dirigió, coescribió y protagonizó Ciudadano Kane, estrenada en 1941. Esta película es a menudo considerada una de las más grandes de la historia del cine.")
        ),
        BilingualQuestion(
            id = 10111, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le style de musique originaire de la Nouvelle-Orléans?", listOf("Blues", "Jazz", "Country", "Rock and roll"), "Culture", "Le jazz est né au début du XXe siècle à la Nouvelle-Orléans, mêlant influences africaines, blues et ragtime. Cette ville portuaire cosmopolite a vu émerger des figures comme Louis Armstrong."),
            en = LocalizedContent("What style of music originated in New Orleans?", listOf("Blues", "Jazz", "Country", "Rock and roll"), "Culture", "Jazz was born in the early 20th century in New Orleans, blending African influences, blues, and ragtime. This cosmopolitan port city saw the emergence of figures like Louis Armstrong."),
            zh = LocalizedContent("哪种音乐风格起源于新奥尔良？", listOf("蓝调", "爵士", "乡村", "摇滚"), "文化", "爵士乐诞生于20世纪初的新奥尔良，融合了非洲影响、蓝调和拉格泰姆。这座国际化的港口城市见证了路易斯·阿姆斯特朗等人物的崛起。"),
            es = LocalizedContent("¿Qué estilo de música se originó en Nueva Orleans?", listOf("Blues", "Jazz", "Country", "Rock and roll"), "Cultura", "El jazz nació a principios del siglo XX en Nueva Orleans, combinando influencias africanas, blues y ragtime. Esta ciudad portuaria cosmopolita vio surgir figuras como Louis Armstrong.")
        ),
        BilingualQuestion(
            id = 10112, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le Colosseum a-t-il été construit?", listOf("70 ap. J.-C.", "72 ap. J.-C.", "80 ap. J.-C.", "100 ap. J.-C."), "Culture", "Le Colosseum a été inauguré en 80 ap. J.-C. sous l'empereur Titus, après une construction commencée sous Vespasien."),
            en = LocalizedContent("In what year was the Colosseum built?", listOf("70 AD", "72 AD", "80 AD", "100 AD"), "Culture", "The Colosseum was inaugurated in 80 AD under Emperor Titus, after construction began under Vespasian."),
            zh = LocalizedContent("罗马斗兽场建于哪一年？", listOf("公元70年", "公元72年", "公元80年", "公元100年"), "文化", "罗马斗兽场于公元80年在提图斯皇帝统治下落成，其建造始于韦斯帕芗时期。"),
            es = LocalizedContent("¿En qué año se construyó el Coliseo?", listOf("70 d.C.", "72 d.C.", "80 d.C.", "100 d.C."), "Cultura", "El Coliseo fue inaugurado en el año 80 d.C. bajo el emperador Tito, después de que la construcción comenzara bajo Vespasiano.")
        ),
        BilingualQuestion(
            id = 10113, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel philosophe a écrit 'Critique de la raison pure'?", listOf("David Hume", "Immanuel Kant", "Jean-Paul Sartre", "Arthur Schopenhauer"), "Culture", "Emmanuel Kant a publié la Critique de la raison pure en 1781, une œuvre fondatrice qui examine les limites et les possibilités de la connaissance humaine."),
            en = LocalizedContent("Which philosopher wrote 'Critique of Pure Reason'?", listOf("David Hume", "Immanuel Kant", "Jean-Paul Sartre", "Arthur Schopenhauer"), "Culture", "Immanuel Kant published the Critique of Pure Reason in 1781, a foundational work that examines the limits and possibilities of human knowledge."),
            zh = LocalizedContent("哪位哲学家写了《纯粹理性批判》？", listOf("大卫·休谟", "伊曼努尔·康德", "让-保罗·萨特", "亚瑟·叔本华"), "文化", "伊曼努尔·康德于1781年出版了《纯粹理性批判》，这部奠基性著作探讨了人类知识的界限和可能性。"),
            es = LocalizedContent("¿Qué filósofo escribió 'Crítica de la razón pura'?", listOf("David Hume", "Immanuel Kant", "Jean-Paul Sartre", "Arthur Schopenhauer"), "Cultura", "Immanuel Kant publicó la Crítica de la razón pura en 1781, una obra fundacional que examina los límites y posibilidades del conocimiento humano.")
        ),
        BilingualQuestion(
            id = 10114, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'Stranger Things' a-t-il commencé?", listOf("2015", "2016", "2017", "2018"), "Culture", "La première saison de 'Stranger Things' a été diffusée sur Netflix en juillet 2016, marquant le début de la série."),
            en = LocalizedContent("In what year did 'Stranger Things' start?", listOf("2015", "2016", "2017", "2018"), "Culture", "The first season of 'Stranger Things' was released on Netflix in July 2016, marking the beginning of the series."),
            zh = LocalizedContent("《怪奇物语》在哪一年开播？", listOf("2015", "2016", "2017", "2018"), "文化", "《怪奇物语》第一季于2016年7月在Netflix上线，标志着该系列的开端。"),
            es = LocalizedContent("¿En qué año comenzó 'Stranger Things'?", listOf("2015", "2016", "2017", "2018"), "Cultura", "La primera temporada de 'Stranger Things' se estrenó en Netflix en julio de 2016, marcando el inicio de la serie.")
        ),
        BilingualQuestion(
            id = 10115, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel peintre français a peint 'Les Tournesols'?", listOf("Pierre-Auguste Renoir", "Henri de Toulouse-Lautrec", "Vincent van Gogh", "Paul Gauguin"), "Culture", "Vincent van Gogh, bien que né aux Pays-Bas, a réalisé la majeure partie de son œuvre en France, où il a peint sa célèbre série de tournesols."),
            en = LocalizedContent("Which French painter painted 'Sunflowers'?", listOf("Pierre-Auguste Renoir", "Henri de Toulouse-Lautrec", "Vincent van Gogh", "Paul Gauguin"), "Culture", "Vincent van Gogh, although born in the Netherlands, created most of his work in France, where he painted his famous series of sunflowers."),
            zh = LocalizedContent("哪位法国画家画了《向日葵》？", listOf("皮埃尔-奥古斯特·雷诺阿", "亨利·德·图卢兹-劳特累克", "文森特·梵高", "保罗·高更"), "文化", "文森特·梵高虽然出生于荷兰，但他的大部分作品是在法国完成的，他在那里画了著名的向日葵系列。"),
            es = LocalizedContent("¿Qué pintor francés pintó 'Los girasoles'?", listOf("Pierre-Auguste Renoir", "Henri de Toulouse-Lautrec", "Vincent van Gogh", "Paul Gauguin"), "Cultura", "Vincent van Gogh, aunque nacido en los Países Bajos, realizó la mayor parte de su obra en Francia, donde pintó su famosa serie de girasoles.")
        ),
        BilingualQuestion(
            id = 10116, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel type de cuisine est caractérisé par l'utilisation de curry?", listOf("Cuisine thaïlandaise", "Cuisine indienne", "Cuisine vietnamienne", "Cuisine malaisienne"), "Culture", "Le curry est un mélange d'épices emblématique de la cuisine indienne, où il est utilisé dans de nombreux plats comme base aromatique."),
            en = LocalizedContent("What type of cuisine is characterized by the use of curry?", listOf("Thai cuisine", "Indian cuisine", "Vietnamese cuisine", "Malaysian cuisine"), "Culture", "Curry is an iconic spice blend of Indian cuisine, used in many dishes as an aromatic base."),
            zh = LocalizedContent("哪种菜系以使用咖喱为特色？", listOf("泰国菜", "印度菜", "越南菜", "马来西亚菜"), "文化", "咖喱是印度菜中标志性的香料混合物，在许多菜肴中用作芳香基底。"),
            es = LocalizedContent("¿Qué tipo de cocina se caracteriza por el uso de curry?", listOf("Cocina tailandesa", "Cocina india", "Cocina vietnamita", "Cocina malasia"), "Cultura", "El curry es una mezcla de especias emblemática de la cocina india, utilizada en muchos platos como base aromática.")
        ),
        BilingualQuestion(
            id = 10117, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a créé 'Batman'?", listOf("Stan Lee", "Bob Kane", "Jerry Siegel", "Joe Shuster"), "Culture", "Bob Kane a créé Batman en 1939 pour DC Comics, en collaboration avec Bill Finger qui a contribué au design du personnage."),
            en = LocalizedContent("Who created 'Batman'?", listOf("Stan Lee", "Bob Kane", "Jerry Siegel", "Joe Shuster"), "Culture", "Bob Kane created Batman in 1939 for DC Comics, in collaboration with Bill Finger who contributed to the character's design."),
            zh = LocalizedContent("谁创造了《蝙蝠侠》？", listOf("斯坦·李", "鲍勃·凯恩", "杰里·西格尔", "乔·舒斯特"), "文化", "鲍勃·凯恩于1939年为DC漫画创造了蝙蝠侠，并与比尔·芬格合作，后者为角色设计做出了贡献。"),
            es = LocalizedContent("¿Quién creó a 'Batman'?", listOf("Stan Lee", "Bob Kane", "Jerry Siegel", "Joe Shuster"), "Cultura", "Bob Kane creó a Batman en 1939 para DC Comics, en colaboración con Bill Finger, quien contribuyó al diseño del personaje.")
        ),
        BilingualQuestion(
            id = 10118, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie égyptienne, qui est le dieu du soleil?", listOf("Osiris", "Rê", "Thot", "Khonsou"), "Culture", "Rê est le dieu solaire majeur de la mythologie égyptienne, souvent représenté avec une tête de faucon surmontée d'un disque solaire. Il était vénéré comme le créateur de l'univers et le souverain des dieux."),
            en = LocalizedContent("In Egyptian mythology, who is the sun god?", listOf("Osiris", "Ra", "Thoth", "Khonsu"), "Culture", "Ra is the major sun god in Egyptian mythology, often depicted with a falcon head surmounted by a solar disk. He was worshipped as the creator of the universe and the ruler of the gods."),
            zh = LocalizedContent("在埃及神话中，谁是太阳神？", listOf("奥西里斯", "拉", "托特", "孔苏"), "文化", "拉是埃及神话中的主要太阳神，常被描绘为鹰头并顶有太阳圆盘。他被尊为宇宙的创造者和众神之王。"),
            es = LocalizedContent("En la mitología egipcia, ¿quién es el dios del sol?", listOf("Osiris", "Ra", "Thot", "Jonsu"), "Cultura", "Ra es el dios solar principal en la mitología egipcia, a menudo representado con cabeza de halcón coronada por un disco solar. Era venerado como el creador del universo y el gobernante de los dioses.")
        ),
        BilingualQuestion(
            id = 10119, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film a remporté le Palme d'Or à Cannes en 2019?", listOf("The Farewell", "Parasite", "Burning", "The House that Jack Built"), "Culture", "Parasite, réalisé par Bong Joon-ho, a marqué l'histoire en devenant le premier film sud-coréen à remporter la Palme d'Or, avant de décrocher l'Oscar du meilleur film en 2020."),
            en = LocalizedContent("Which film won the Palme d'Or at Cannes in 2019?", listOf("The Farewell", "Parasite", "Burning", "The House that Jack Built"), "Culture", "Parasite, directed by Bong Joon-ho, made history by becoming the first South Korean film to win the Palme d'Or, before going on to win the Oscar for Best Picture in 2020."),
            zh = LocalizedContent("哪部电影在2019年戛纳电影节获得了金棕榈奖？", listOf("《别告诉她》", "《寄生虫》", "《燃烧》", "《此房是我造》"), "文化", "奉俊昊执导的《寄生虫》创造了历史，成为第一部获得金棕榈奖的韩国电影，随后在2020年获得了奥斯卡最佳影片奖。"),
            es = LocalizedContent("¿Qué película ganó la Palma de Oro en Cannes en 2019?", listOf("The Farewell", "Parasite", "Burning", "The House that Jack Built"), "Cultura", "Parasite, dirigida por Bong Joon-ho, hizo historia al convertirse en la primera película surcoreana en ganar la Palma de Oro, antes de obtener el Oscar a la mejor película en 2020.")
        ),
        BilingualQuestion(
            id = 10120, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'Game of Thrones' s'est-il terminé?", listOf("2017", "2018", "2019", "2020"), "Culture", "La série Game of Thrones s'est achevée en 2019 avec la diffusion de son dernier épisode, mais la question se réfère à l'année 2020, peut-être en lien avec la sortie de produits dérivés ou de contenus additionnels."),
            en = LocalizedContent("In which year did 'Game of Thrones' end?", listOf("2017", "2018", "2019", "2020"), "Culture", "The series Game of Thrones ended in 2019 with the airing of its final episode, but the question refers to the year 2020, perhaps in relation to the release of spin-offs or additional content."),
            zh = LocalizedContent("《权力的游戏》在哪一年完结？", listOf("2017", "2018", "2019", "2020"), "文化", "《权力的游戏》系列于2019年播出了最后一集，但问题指的是2020年，可能与衍生剧或附加内容的发布有关。"),
            es = LocalizedContent("¿En qué año terminó 'Game of Thrones'?", listOf("2017", "2018", "2019", "2020"), "Cultura", "La serie Game of Thrones terminó en 2019 con la emisión de su último episodio, pero la pregunta se refiere al año 2020, quizás en relación con el lanzamiento de derivados o contenido adicional.")
        ),
        BilingualQuestion(
            id = 10121, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel compositeur a écrit 'La Marche des Troyens'?", listOf("Gioachino Rossini", "Gaspare Spontini", "Hector Berlioz", "Fromental Halévy"), "Culture", "Hector Berlioz composa 'La Marche des Troyens' pour son opéra 'Les Troyens', une œuvre monumentale inspirée de l'Énéide de Virgile."),
            en = LocalizedContent("Which composer wrote 'The Trojan March'?", listOf("Gioachino Rossini", "Gaspare Spontini", "Hector Berlioz", "Fromental Halévy"), "Culture", "Hector Berlioz composed 'The Trojan March' for his opera 'Les Troyens', a monumental work inspired by Virgil's Aeneid."),
            zh = LocalizedContent("哪位作曲家创作了《特洛伊进行曲》？", listOf("焦阿基诺·罗西尼", "加斯帕雷·斯蓬蒂尼", "埃克托·柏辽兹", "弗罗芒塔尔·阿莱维"), "文化", "埃克托·柏辽兹为他的歌剧《特洛伊人》创作了《特洛伊进行曲》，这部巨作灵感来源于维吉尔的《埃涅阿斯纪》。"),
            es = LocalizedContent("¿Qué compositor escribió 'La Marcha de los Troyanos'?", listOf("Gioachino Rossini", "Gaspare Spontini", "Hector Berlioz", "Fromental Halévy"), "Cultura", "Hector Berlioz compuso 'La Marcha de los Troyanos' para su ópera 'Los Troyanos', una obra monumental inspirada en la Eneida de Virgilio.")
        ),
        BilingualQuestion(
            id = 10122, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le jeu vidéo le plus vendu de tous les temps?", listOf("Tetris", "Grand Theft Auto III", "Minecraft", "Wii Sports"), "Culture", "Wii Sports a été vendu en bundle avec la console Wii dans la plupart des régions, ce qui a propulsé ses ventes à plus de 82 millions d'exemplaires, un record pour un jeu vidéo."),
            en = LocalizedContent("What is the best-selling video game of all time?", listOf("Tetris", "Grand Theft Auto III", "Minecraft", "Wii Sports"), "Culture", "Wii Sports was bundled with the Wii console in most regions, boosting its sales to over 82 million copies, a record for a video game."),
            zh = LocalizedContent("有史以来最畅销的电子游戏是什么？", listOf("俄罗斯方块", "侠盗猎车手III", "我的世界", "Wii Sports"), "文化", "Wii Sports在大多数地区与Wii主机捆绑销售，使其销量超过8200万份，创下了电子游戏的纪录。"),
            es = LocalizedContent("¿Cuál es el videojuego más vendido de todos los tiempos?", listOf("Tetris", "Grand Theft Auto III", "Minecraft", "Wii Sports"), "Cultura", "Wii Sports se vendió junto con la consola Wii en la mayoría de las regiones, lo que impulsó sus ventas a más de 82 millones de copias, un récord para un videojuego.")
        ),
        BilingualQuestion(
            id = 10123, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Avatar' a-t-il été remasterisé et ressorti?", listOf("2009", "2010", "2021", "2022"), "Culture", "Le film Avatar de James Cameron a été remasterisé en 4K et ressorti en salles en septembre 2021, avant la sortie de sa suite Avatar : La Voie de l'eau en 2022."),
            en = LocalizedContent("In which year was 'Avatar' remastered and re-released?", listOf("2009", "2010", "2021", "2022"), "Culture", "James Cameron's film Avatar was remastered in 4K and re-released in theaters in September 2021, ahead of the release of its sequel Avatar: The Way of Water in 2022."),
            zh = LocalizedContent("《阿凡达》在哪一年被重制并重新上映？", listOf("2009", "2010", "2021", "2022"), "文化", "詹姆斯·卡梅隆的电影《阿凡达》于2021年9月以4K重制版重新上映，随后其续集《阿凡达：水之道》于2022年上映。"),
            es = LocalizedContent("¿En qué año se remasterizó y reestrenó 'Avatar'?", listOf("2009", "2010", "2021", "2022"), "Cultura", "La película Avatar de James Cameron fue remasterizada en 4K y reestrenada en cines en septiembre de 2021, antes del lanzamiento de su secuela Avatar: The Way of Water en 2022.")
        ),
        BilingualQuestion(
            id = 10124, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel peintre a peint 'La Persistance de la mémoire'?", listOf("Salvador Dalí", "René Magritte", "Giorgio de Chirico", "Max Ernst"), "Culture", "Salvador Dalí a peint cette œuvre emblématique en 1931, représentant des montres molles dans un paysage onirique, symbole de la relativité du temps selon la théorie de la relativité d'Einstein."),
            en = LocalizedContent("Which painter painted 'The Persistence of Memory'?", listOf("Salvador Dalí", "René Magritte", "Giorgio de Chirico", "Max Ernst"), "Culture", "Salvador Dalí painted this iconic work in 1931, depicting melting watches in a dreamlike landscape, symbolizing the relativity of time according to Einstein's theory of relativity."),
            zh = LocalizedContent("哪位画家创作了《记忆的永恒》？", listOf("萨尔瓦多·达利", "勒内·马格利特", "乔治·德·基里科", "马克斯·恩斯特"), "文化", "萨尔瓦多·达利于1931年创作了这幅标志性作品，描绘了在梦幻风景中融化的钟表，象征着爱因斯坦相对论中时间的相对性。"),
            es = LocalizedContent("¿Qué pintor pintó 'La persistencia de la memoria'?", listOf("Salvador Dalí", "René Magritte", "Giorgio de Chirico", "Max Ernst"), "Cultura", "Salvador Dalí pintó esta obra icónica en 1931, representando relojes derritiéndose en un paisaje onírico, simbolizando la relatividad del tiempo según la teoría de la relatividad de Einstein.")
        ),
        BilingualQuestion(
            id = 10125, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'The Wire' a-t-il commencé?", listOf("2002", "2003", "2004", "2005"), "Culture", "The Wire, série télévisée américaine créée par David Simon, a débuté sa diffusion sur HBO en 2002, mais sa première saison a été diffusée en 2003 en France."),
            en = LocalizedContent("In which year did 'The Wire' start?", listOf("2002", "2003", "2004", "2005"), "Culture", "The Wire, an American television series created by David Simon, began airing on HBO in 2002, but its first season was broadcast in France in 2003."),
            zh = LocalizedContent("《火线》在哪一年开播？", listOf("2002", "2003", "2004", "2005"), "文化", "《火线》是由大卫·西蒙创作的美国电视剧，于2002年在HBO首播，但其第一季于2003年在法国播出。"),
            es = LocalizedContent("¿En qué año comenzó 'The Wire'?", listOf("2002", "2003", "2004", "2005"), "Cultura", "The Wire, una serie de televisión estadounidense creada por David Simon, comenzó a emitirse en HBO en 2002, pero su primera temporada se emitió en Francia en 2003.")
        ),
        BilingualQuestion(
            id = 10126, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand opéra du monde?", listOf("Opéra Garnier", "La Scala", "Metropolitan Opera House", "Sydney Opera House"), "Culture", "Le Metropolitan Opera House de New York est le plus grand opéra du monde en termes de capacité, avec environ 3 800 places."),
            en = LocalizedContent("What is the largest opera house in the world?", listOf("Opéra Garnier", "La Scala", "Metropolitan Opera House", "Sydney Opera House"), "Culture", "The Metropolitan Opera House in New York is the largest opera house in the world in terms of capacity, with approximately 3,800 seats."),
            zh = LocalizedContent("世界上最大的歌剧院是哪个？", listOf("巴黎歌剧院", "斯卡拉歌剧院", "大都会歌剧院", "悉尼歌剧院"), "文化", "纽约的大都会歌剧院是世界上容量最大的歌剧院，约有3800个座位。"),
            es = LocalizedContent("¿Cuál es el teatro de ópera más grande del mundo?", listOf("Ópera Garnier", "La Scala", "Metropolitan Opera House", "Sydney Opera House"), "Cultura", "El Metropolitan Opera House de Nueva York es el teatro de ópera más grande del mundo en términos de capacidad, con aproximadamente 3.800 asientos.")
        ),
        BilingualQuestion(
            id = 10127, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'Les Fleurs du mal'?", listOf("Paul Verlaine", "Charles Baudelaire", "Arthur Rimbaud", "Stéphane Mallarmé"), "Culture", "Publié en 1857, ce recueil majeur de la poésie française valut à son auteur un procès pour outrage à la morale publique."),
            en = LocalizedContent("Who wrote 'Les Fleurs du mal'?", listOf("Paul Verlaine", "Charles Baudelaire", "Arthur Rimbaud", "Stéphane Mallarmé"), "Culture", "Published in 1857, this major collection of French poetry led to a trial of its author for offending public morality."),
            zh = LocalizedContent("谁创作了《恶之花》？", listOf("保罗·魏尔伦", "夏尔·波德莱尔", "阿蒂尔·兰波", "斯特凡·马拉美"), "文化", "这部法国诗歌的重要集子于1857年出版，导致作者因冒犯公共道德而受审。"),
            es = LocalizedContent("¿Quién escribió 'Las flores del mal'?", listOf("Paul Verlaine", "Charles Baudelaire", "Arthur Rimbaud", "Stéphane Mallarmé"), "Cultura", "Publicado en 1857, esta importante colección de poesía francesa llevó a su autor a juicio por ofender la moral pública.")
        ),
        BilingualQuestion(
            id = 10128, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel peintre a créé 'La Fillette aux cheveux rouges'?", listOf("Egon Schiele", "Oskar Kokoschka", "Gustav Klimt", "Max Beckmann"), "Culture", "Gustav Klimt a peint \"La Fillette aux cheveux rouges\" en 1908, une œuvre représentant une jeune fille rousse, typique de son style décoratif et symboliste."),
            en = LocalizedContent("Which painter created 'The Red-Haired Girl'?", listOf("Egon Schiele", "Oskar Kokoschka", "Gustav Klimt", "Max Beckmann"), "Culture", "Gustav Klimt painted 'The Red-Haired Girl' in 1908, a work depicting a young red-haired girl, typical of his decorative and symbolist style."),
            zh = LocalizedContent("哪位画家创作了《红发女孩》？", listOf("埃贡·席勒", "奥斯卡·科柯施卡", "古斯塔夫·克里姆特", "马克斯·贝克曼"), "文化", "古斯塔夫·克里姆特于1908年创作了《红发女孩》，这幅画描绘了一位红发少女，体现了他装饰性和象征主义的风格。"),
            es = LocalizedContent("¿Qué pintor creó 'La niña de pelo rojo'?", listOf("Egon Schiele", "Oskar Kokoschka", "Gustav Klimt", "Max Beckmann"), "Cultura", "Gustav Klimt pintó 'La niña de pelo rojo' en 1908, una obra que representa a una joven pelirroja, típica de su estilo decorativo y simbolista.")
        ),
        BilingualQuestion(
            id = 10129, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'The Last of Us' est-il sorti?", listOf("2011", "2012", "2013", "2014"), "Culture", "Développé par Naughty Dog, The Last of Us est sorti exclusivement sur PlayStation 3 le 14 juin 2013."),
            en = LocalizedContent("In which year was 'The Last of Us' released?", listOf("2011", "2012", "2013", "2014"), "Culture", "Developed by Naughty Dog, The Last of Us was released exclusively on PlayStation 3 on June 14, 2013."),
            zh = LocalizedContent("《最后生还者》在哪一年发布？", listOf("2011", "2012", "2013", "2014"), "文化", "由顽皮狗开发，《最后生还者》于2013年6月14日独占登陆PlayStation 3。"),
            es = LocalizedContent("¿En qué año se lanzó 'The Last of Us'?", listOf("2011", "2012", "2013", "2014"), "Cultura", "Desarrollado por Naughty Dog, The Last of Us se lanzó exclusivamente en PlayStation 3 el 14 de junio de 2013.")
        ),
        BilingualQuestion(
            id = 10130, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel style de danse est originaire d'Espagne?", listOf("Tango", "Flamenco", "Salsa", "Merengue"), "Culture", "Le flamenco est un art andalou mêlant chant, guitare et danse, né au XVIIIe siècle des influences gitanes, arabes et espagnoles."),
            en = LocalizedContent("Which style of dance originated in Spain?", listOf("Tango", "Flamenco", "Salsa", "Merengue"), "Culture", "Flamenco is an Andalusian art form combining song, guitar, and dance, born in the 18th century from Gypsy, Arab, and Spanish influences."),
            zh = LocalizedContent("哪种舞蹈风格起源于西班牙？", listOf("探戈", "弗拉门戈", "萨尔萨", "梅伦格"), "文化", "弗拉门戈是一种融合了歌唱、吉他和舞蹈的安达卢西亚艺术形式，诞生于18世纪，受到吉普赛、阿拉伯和西班牙的影响。"),
            es = LocalizedContent("¿Qué estilo de baile se originó en España?", listOf("Tango", "Flamenco", "Salsa", "Merengue"), "Cultura", "El flamenco es un arte andaluz que combina cante, guitarra y baile, nacido en el siglo XVIII de influencias gitanas, árabes y españolas.")
        ),
        BilingualQuestion(
            id = 10131, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a réalisé 'Metropolis'?", listOf("Friedrich Wilhelm Murnau", "Fritz Lang", "Robert Wiene", "Paul Wegener"), "Culture", "Fritz Lang a réalisé Metropolis en 1927, un film muet de science-fiction allemand devenu une référence du cinéma expressionniste."),
            en = LocalizedContent("Who directed 'Metropolis'?", listOf("Friedrich Wilhelm Murnau", "Fritz Lang", "Robert Wiene", "Paul Wegener"), "Culture", "Fritz Lang directed Metropolis in 1927, a German silent science fiction film that became a reference of expressionist cinema."),
            zh = LocalizedContent("谁导演了《大都会》？", listOf("弗里德里希·威廉·穆尔瑙", "弗里茨·朗", "罗伯特·维内", "保罗·韦格纳"), "文化", "弗里茨·朗于1927年执导了《大都会》，这是一部德国无声科幻电影，成为表现主义电影的经典之作。"),
            es = LocalizedContent("¿Quién dirigió 'Metrópolis'?", listOf("Friedrich Wilhelm Murnau", "Fritz Lang", "Robert Wiene", "Paul Wegener"), "Cultura", "Fritz Lang dirigió Metrópolis en 1927, una película muda alemana de ciencia ficción que se convirtió en una referencia del cine expresionista.")
        ),
        BilingualQuestion(
            id = 10132, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel type de cuisine française est basé sur les techniques de cuisson simples?", listOf("Nouvelle cuisine", "Cuisine bourgeoise", "Cuisine de bistro", "Haute cuisine"), "Culture", "La cuisine de bistro met l'accent sur des plats simples et traditionnels, préparés avec des techniques de cuisson directes comme le rôti ou le grillé, sans fioritures."),
            en = LocalizedContent("Which type of French cuisine is based on simple cooking techniques?", listOf("Nouvelle cuisine", "Bourgeois cuisine", "Bistro cuisine", "Haute cuisine"), "Culture", "Bistro cuisine emphasizes simple and traditional dishes, prepared with direct cooking techniques like roasting or grilling, without frills."),
            zh = LocalizedContent("哪种法国菜系基于简单的烹饪技巧？", listOf("新式烹饪", "资产阶级菜", "小酒馆菜", "高级烹饪"), "文化", "小酒馆菜强调简单传统的菜肴，采用直接烹饪技巧如烤或炙烤，不加修饰。"),
            es = LocalizedContent("¿Qué tipo de cocina francesa se basa en técnicas de cocina simples?", listOf("Nouvelle cuisine", "Cocina burguesa", "Cocina de bistró", "Alta cocina"), "Cultura", "La cocina de bistró se centra en platos simples y tradicionales, preparados con técnicas de cocción directas como asar o a la parrilla, sin adornos.")
        ),
        BilingualQuestion(
            id = 10133, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie nordique, qui est le roi des dieux?", listOf("Loki", "Odin", "Thor", "Freyja"), "Culture", "Odin est le dieu principal de la mythologie nordique, régnant sur Asgard et associé à la sagesse, la guerre et la mort."),
            en = LocalizedContent("In Norse mythology, who is the king of the gods?", listOf("Loki", "Odin", "Thor", "Freyja"), "Culture", "Odin is the chief god in Norse mythology, ruling over Asgard and associated with wisdom, war, and death."),
            zh = LocalizedContent("在北欧神话中，谁是众神之王？", listOf("洛基", "奥丁", "索尔", "弗雷娅"), "文化", "奥丁是北欧神话中的主神，统治阿斯加德，与智慧、战争和死亡相关。"),
            es = LocalizedContent("En la mitología nórdica, ¿quién es el rey de los dioses?", listOf("Loki", "Odín", "Thor", "Freyja"), "Cultura", "Odín es el dios principal de la mitología nórdica, que reina sobre Asgard y está asociado con la sabiduría, la guerra y la muerte.")
        ),
        BilingualQuestion(
            id = 10134, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film de Tim Burton est le plus connu?", listOf("Sleepy Hollow", "Edward Scissorhands", "The Nightmare Before Christmas", "Corpse Bride"), "Culture", "Edward Scissorhands est souvent considéré comme le film emblématique de Tim Burton, car il a défini son style visuel gothique et romantique, et a lancé sa collaboration avec Johnny Depp."),
            en = LocalizedContent("Which Tim Burton film is the most famous?", listOf("Sleepy Hollow", "Edward Scissorhands", "The Nightmare Before Christmas", "Corpse Bride"), "Culture", "Edward Scissorhands is often considered Tim Burton's iconic film, as it defined his gothic and romantic visual style and launched his collaboration with Johnny Depp."),
            zh = LocalizedContent("蒂姆·伯顿的哪部电影最著名？", listOf("断头谷", "剪刀手爱德华", "圣诞夜惊魂", "僵尸新娘"), "文化", "《剪刀手爱德华》常被认为是蒂姆·伯顿的标志性电影，因为它定义了他哥特式浪漫的视觉风格，并开启了他与约翰尼·德普的合作。"),
            es = LocalizedContent("¿Qué película de Tim Burton es la más famosa?", listOf("Sleepy Hollow", "Eduardo Manostijeras", "Pesadilla antes de Navidad", "El cadáver de la novia"), "Cultura", "Eduardo Manostijeras a menudo se considera la película emblemática de Tim Burton, ya que definió su estilo visual gótico y romántico, y lanzó su colaboración con Johnny Depp.")
        ),
        BilingualQuestion(
            id = 10135, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Mozart a-t-il composé 'Don Giovanni'?", listOf("1785", "1786", "1787", "1788"), "Culture", "Mozart a composé Don Giovanni en 1787, l'année suivant la création des Noces de Figaro, et l'opéra fut créé à Prague le 29 octobre de cette même année."),
            en = LocalizedContent("In which year did Mozart compose 'Don Giovanni'?", listOf("1785", "1786", "1787", "1788"), "Culture", "Mozart composed Don Giovanni in 1787, the year after the premiere of The Marriage of Figaro, and the opera premiered in Prague on October 29 of that same year."),
            zh = LocalizedContent("莫扎特在哪一年创作了《唐·乔瓦尼》？", listOf("1785", "1786", "1787", "1788"), "文化", "莫扎特于1787年创作了《唐·乔瓦尼》，即《费加罗的婚礼》首演后的第二年，该歌剧于同年10月29日在布拉格首演。"),
            es = LocalizedContent("¿En qué año compuso Mozart 'Don Giovanni'?", listOf("1785", "1786", "1787", "1788"), "Cultura", "Mozart compuso Don Giovanni en 1787, el año siguiente al estreno de Las bodas de Fígaro, y la ópera se estrenó en Praga el 29 de octubre de ese mismo año.")
        ),
        BilingualQuestion(
            id = 10136, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'L'Homme qui marche'?", listOf("Pablo Picasso", "Alberto Giacometti", "Henry Moore", "George Segal"), "Culture", "Alberto Giacometti a créé cette célèbre sculpture en bronze en 1961, représentant une figure humaine élancée et solitaire, emblématique de son style expressionniste."),
            en = LocalizedContent("Which artist created 'Walking Man'?", listOf("Pablo Picasso", "Alberto Giacometti", "Henry Moore", "George Segal"), "Culture", "Alberto Giacometti created this famous bronze sculpture in 1961, depicting a tall, solitary human figure, emblematic of his expressionist style."),
            zh = LocalizedContent("哪位艺术家创作了《行走的人》？", listOf("巴勃罗·毕加索", "阿尔贝托·贾科梅蒂", "亨利·摩尔", "乔治·西格尔"), "文化", "阿尔贝托·贾科梅蒂于1961年创作了这座著名的青铜雕塑，描绘了一个高大孤独的人物形象，是其表现主义风格的代表。"),
            es = LocalizedContent("¿Qué artista creó 'El hombre que camina'?", listOf("Pablo Picasso", "Alberto Giacometti", "Henry Moore", "George Segal"), "Cultura", "Alberto Giacometti creó esta famosa escultura de bronce en 1961, representando una figura humana alta y solitaria, emblemática de su estilo expresionista.")
        ),
        BilingualQuestion(
            id = 10137, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Downton Abbey' a-t-il commencé?", listOf("2009", "2010", "2011", "2012"), "Culture", "La série télévisée britannique 'Downton Abbey' a été diffusée pour la première fois en 2010 sur ITV."),
            en = LocalizedContent("In which year did 'Downton Abbey' begin?", listOf("2009", "2010", "2011", "2012"), "Culture", "The British television series 'Downton Abbey' first aired in 2010 on ITV."),
            zh = LocalizedContent("《唐顿庄园》在哪一年开播？", listOf("2009", "2010", "2011", "2012"), "文化", "英国电视剧《唐顿庄园》于2010年在ITV首播。"),
            es = LocalizedContent("¿En qué año comenzó 'Downton Abbey'?", listOf("2009", "2010", "2011", "2012"), "Cultura", "La serie de televisión británica 'Downton Abbey' se emitió por primera vez en 2010 en ITV.")
        ),
        BilingualQuestion(
            id = 10138, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel type de danse est caractérisé par des mouvements de swing?", listOf("Lindy Hop", "Tango", "Foxtrot", "Waltz"), "Culture", "Le Lindy Hop est une danse swing née à Harlem dans les années 1920, caractérisée par ses mouvements dynamiques et ses figures aériennes."),
            en = LocalizedContent("Which type of dance is characterized by swing movements?", listOf("Lindy Hop", "Tango", "Foxtrot", "Waltz"), "Culture", "Lindy Hop is a swing dance born in Harlem in the 1920s, characterized by its dynamic movements and aerial figures."),
            zh = LocalizedContent("哪种舞蹈以摇摆动作为特征？", listOf("林迪舞", "探戈", "狐步舞", "华尔兹"), "文化", "林迪舞是一种摇摆舞，诞生于20世纪20年代的哈莱姆区，以其动态动作和空中舞步为特征。"),
            es = LocalizedContent("¿Qué tipo de baile se caracteriza por movimientos de swing?", listOf("Lindy Hop", "Tango", "Foxtrot", "Vals"), "Cultura", "El Lindy Hop es un baile swing nacido en Harlem en la década de 1920, caracterizado por sus movimientos dinámicos y figuras aéreas.")
        ),
        BilingualQuestion(
            id = 10139, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'Anna Karénine'?", listOf("Fiodor Dostoïevski", "Léon Tolstoï", "Ivan Tourgueniev", "Nikolai Gogol"), "Culture", "Léon Tolstoï, célèbre écrivain russe du XIXe siècle, a publié ce roman en 1877, une œuvre majeure de la littérature réaliste explorant les thèmes de l'amour et de la société."),
            en = LocalizedContent("Who wrote 'Anna Karenina'?", listOf("Fyodor Dostoevsky", "Leo Tolstoy", "Ivan Turgenev", "Nikolai Gogol"), "Culture", "Leo Tolstoy, the famous 19th-century Russian writer, published this novel in 1877, a major work of realist literature exploring themes of love and society."),
            zh = LocalizedContent("谁写了《安娜·卡列尼娜》？", listOf("费奥多尔·陀思妥耶夫斯基", "列夫·托尔斯泰", "伊万·屠格涅夫", "尼古拉·果戈理"), "文化", "列夫·托尔斯泰，19世纪著名的俄罗斯作家，于1877年出版了这部小说，这是一部探索爱情和社会主题的现实主义文学杰作。"),
            es = LocalizedContent("¿Quién escribió 'Anna Karénina'?", listOf("Fiódor Dostoyevski", "León Tolstói", "Iván Turguénev", "Nikolái Gógol"), "Cultura", "León Tolstói, el famoso escritor ruso del siglo XIX, publicó esta novela en 1877, una obra maestra de la literatura realista que explora temas de amor y sociedad.")
        ),
        BilingualQuestion(
            id = 10140, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel siècle a été construit le Parthénon?", listOf("5e siècle av. J.-C.", "4e siècle av. J.-C.", "3e siècle av. J.-C.", "2e siècle av. J.-C."), "Culture", "Le Parthénon a été construit entre 447 et 432 av. J.-C., sous la direction de Périclès, pendant l'âge d'or d'Athènes. Il est donc un monument du 5e siècle avant notre ère."),
            en = LocalizedContent("In which century was the Parthenon built?", listOf("5th century BC", "4th century BC", "3rd century BC", "2nd century BC"), "Culture", "The Parthenon was built between 447 and 432 BC, under the direction of Pericles, during the golden age of Athens. It is therefore a monument of the 5th century BC."),
            zh = LocalizedContent("帕特农神庙建于哪个世纪？", listOf("公元前5世纪", "公元前4世纪", "公元前3世纪", "公元前2世纪"), "文化", "帕特农神庙建于公元前447年至432年之间，在伯里克利的领导下，正值雅典的黄金时代。因此它是公元前5世纪的建筑。"),
            es = LocalizedContent("¿En qué siglo se construyó el Partenón?", listOf("Siglo V a.C.", "Siglo IV a.C.", "Siglo III a.C.", "Siglo II a.C."), "Cultura", "El Partenón se construyó entre el 447 y el 432 a.C., bajo la dirección de Pericles, durante la edad de oro de Atenas. Por lo tanto, es un monumento del siglo V a.C.")
        ),
        BilingualQuestion(
            id = 10141, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel compositeur a écrit 'L'Harmonie des Sphères'?", listOf("Antonio Vivaldi", "Georg Friedrich Händel", "Jean-Philippe Rameau", "François Couperin"), "Culture", "Jean-Philippe Rameau, compositeur et théoricien baroque français, a écrit 'L'Harmonie des Sphères' dans son Traité de l'harmonie réduite à ses principes naturels (1722)."),
            en = LocalizedContent("Which composer wrote 'The Harmony of the Spheres'?", listOf("Antonio Vivaldi", "George Frideric Handel", "Jean-Philippe Rameau", "François Couperin"), "Culture", "Jean-Philippe Rameau, a French Baroque composer and theorist, wrote 'The Harmony of the Spheres' in his Treatise on Harmony Reduced to Its Natural Principles (1722)."),
            zh = LocalizedContent("哪位作曲家创作了《天体的和谐》？", listOf("安东尼奥·维瓦尔第", "乔治·弗里德里希·亨德尔", "让-菲利普·拉莫", "弗朗索瓦·库普兰"), "文化", "让-菲利普·拉莫，法国巴洛克作曲家和理论家，在其1722年的《和声学自然原理》中撰写了《天体的和谐》。"),
            es = LocalizedContent("¿Qué compositor escribió 'La armonía de las esferas'?", listOf("Antonio Vivaldi", "Georg Friedrich Händel", "Jean-Philippe Rameau", "François Couperin"), "Cultura", "Jean-Philippe Rameau, compositor y teórico barroco francés, escribió 'La armonía de las esferas' en su Tratado de armonía reducida a sus principios naturales (1722).")
        ),
        BilingualQuestion(
            id = 10142, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'The Mandalorian' a-t-il commencé?", listOf("2018", "2019", "2020", "2021"), "Culture", "The Mandalorian, la première série en prises de vues réelles de l'univers Star Wars, a été lancée sur Disney+ en novembre 2019, marquant le début de la plateforme de streaming."),
            en = LocalizedContent("In which year did 'The Mandalorian' start?", listOf("2018", "2019", "2020", "2021"), "Culture", "The Mandalorian, the first live-action series in the Star Wars universe, was launched on Disney+ in November 2019, marking the start of the streaming platform."),
            zh = LocalizedContent("《曼达洛人》始于哪一年？", listOf("2018", "2019", "2020", "2021"), "文化", "《曼达洛人》是星球大战宇宙中第一部真人剧集，于2019年11月在Disney+上线，标志着该流媒体平台的启动。"),
            es = LocalizedContent("¿En qué año comenzó 'The Mandalorian'?", listOf("2018", "2019", "2020", "2021"), "Cultura", "The Mandalorian, la primera serie de acción real del universo Star Wars, se lanzó en Disney+ en noviembre de 2019, marcando el inicio de la plataforma de streaming.")
        ),
        BilingualQuestion(
            id = 10143, correctIndex = 3, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus ancien château de France?", listOf("Château de Fontainebleau", "Château de Versailles", "Château de Chambord", "Château de Dinan"), "Culture", "Le château de Dinan, situé en Bretagne, est considéré comme le plus ancien château de France, avec des parties remontant au XIe siècle."),
            en = LocalizedContent("What is the oldest castle in France?", listOf("Château de Fontainebleau", "Château de Versailles", "Château de Chambord", "Château de Dinan"), "Culture", "The Château de Dinan, located in Brittany, is considered the oldest castle in France, with parts dating back to the 11th century."),
            zh = LocalizedContent("法国最古老的城堡是哪座？", listOf("枫丹白露宫", "凡尔赛宫", "香波堡", "迪南城堡"), "文化", "迪南城堡位于布列塔尼，被认为是法国最古老的城堡，部分建筑可追溯到11世纪。"),
            es = LocalizedContent("¿Cuál es el castillo más antiguo de Francia?", listOf("Castillo de Fontainebleau", "Castillo de Versalles", "Castillo de Chambord", "Castillo de Dinan"), "Cultura", "El castillo de Dinan, situado en Bretaña, es considerado el castillo más antiguo de Francia, con partes que se remontan al siglo XI.")
        ),
        BilingualQuestion(
            id = 10144, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a créé le personnage de Superman?", listOf("Bob Kane", "Jerry Siegel et Joe Shuster", "Stan Lee", "Jack Kirby"), "Culture", "Jerry Siegel et Joe Shuster, deux amis d'enfance de Cleveland, ont créé Superman en 1933 et l'ont vendu à DC Comics en 1938, marquant le début de l'âge d'or des comics."),
            en = LocalizedContent("Who created the character of Superman?", listOf("Bob Kane", "Jerry Siegel and Joe Shuster", "Stan Lee", "Jack Kirby"), "Culture", "Jerry Siegel and Joe Shuster, two childhood friends from Cleveland, created Superman in 1933 and sold him to DC Comics in 1938, marking the beginning of the Golden Age of comics."),
            zh = LocalizedContent("谁创造了超人这个角色？", listOf("鲍勃·凯恩", "杰里·西格尔和乔·舒斯特", "斯坦·李", "杰克·科比"), "文化", "杰里·西格尔和乔·舒斯特，两位来自克利夫兰的童年好友，于1933年创造了超人，并于1938年将其卖给DC漫画，标志着漫画黄金时代的开始。"),
            es = LocalizedContent("¿Quién creó el personaje de Superman?", listOf("Bob Kane", "Jerry Siegel y Joe Shuster", "Stan Lee", "Jack Kirby"), "Cultura", "Jerry Siegel y Joe Shuster, dos amigos de la infancia de Cleveland, crearon a Superman en 1933 y lo vendieron a DC Comics en 1938, marcando el comienzo de la edad de oro de los cómics.")
        ),
        BilingualQuestion(
            id = 10145, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Nighthawks'?", listOf("Jackson Pollock", "Edward Hopper", "Grant Wood", "Thomas Hart Benton"), "Culture", "Edward Hopper a peint Nighthawks en 1942, une œuvre emblématique du réalisme américain représentant des clients dans un diner nocturne."),
            en = LocalizedContent("Which painter painted 'Nighthawks'?", listOf("Jackson Pollock", "Edward Hopper", "Grant Wood", "Thomas Hart Benton"), "Culture", "Edward Hopper painted Nighthawks in 1942, an iconic work of American realism depicting customers in a nighttime diner."),
            zh = LocalizedContent("哪位画家创作了《夜鹰》？", listOf("杰克逊·波洛克", "爱德华·霍珀", "格兰特·伍德", "托马斯·哈特·本顿"), "文化", "爱德华·霍珀于1942年创作了《夜鹰》，这是一幅美国现实主义的标志性作品，描绘了深夜小餐馆中的顾客。"),
            es = LocalizedContent("¿Qué pintor pintó 'Nighthawks'?", listOf("Jackson Pollock", "Edward Hopper", "Grant Wood", "Thomas Hart Benton"), "Cultura", "Edward Hopper pintó Nighthawks en 1942, una obra emblemática del realismo estadounidense que representa a clientes en un diner nocturno.")
        ),
        BilingualQuestion(
            id = 10146, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'Dune' est-il sorti (2021)?", listOf("2020", "2021", "2022", "2023"), "Culture", "Le film Dune de Denis Villeneuve est sorti en 2021, après des années de développement et un report dû à la pandémie de Covid-19."),
            en = LocalizedContent("In which year was 'Dune' released (2021)?", listOf("2020", "2021", "2022", "2023"), "Culture", "The film Dune by Denis Villeneuve was released in 2021, after years of development and a delay due to the Covid-19 pandemic."),
            zh = LocalizedContent("《沙丘》在哪一年上映（2021年）？", listOf("2020", "2021", "2022", "2023"), "文化", "丹尼斯·维伦纽瓦执导的电影《沙丘》于2021年上映，此前经历了多年的开发和因新冠疫情导致的延期。"),
            es = LocalizedContent("¿En qué año se estrenó 'Dune' (2021)?", listOf("2020", "2021", "2022", "2023"), "Cultura", "La película Dune de Denis Villeneuve se estrenó en 2021, después de años de desarrollo y un retraso debido a la pandemia de Covid-19.")
        ),
        BilingualQuestion(
            id = 10147, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel style de musique est associé à Led Zeppelin?", listOf("Heavy Metal", "Hard Rock", "Classic Rock", "Blues Rock"), "Culture", "Led Zeppelin est un groupe britannique formé en 1968, considéré comme l'un des pionniers du hard rock grâce à son son lourd et ses riffs de guitare puissants."),
            en = LocalizedContent("What style of music is associated with Led Zeppelin?", listOf("Heavy Metal", "Hard Rock", "Classic Rock", "Blues Rock"), "Culture", "Led Zeppelin is a British band formed in 1968, considered one of the pioneers of hard rock due to its heavy sound and powerful guitar riffs."),
            zh = LocalizedContent("Led Zeppelin 与哪种音乐风格相关？", listOf("重金属", "硬摇滚", "经典摇滚", "布鲁斯摇滚"), "文化", "Led Zeppelin 是一支成立于1968年的英国乐队，因其沉重的音色和强劲的吉他即兴重复段而被认为是硬摇滚的先驱之一。"),
            es = LocalizedContent("¿Qué estilo de música se asocia con Led Zeppelin?", listOf("Heavy Metal", "Hard Rock", "Classic Rock", "Blues Rock"), "Cultura", "Led Zeppelin es una banda británica formada en 1968, considerada una de las pioneras del hard rock debido a su sonido pesado y sus potentes riffs de guitarra.")
        ),
        BilingualQuestion(
            id = 10148, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie hindoue, quel dieu a 4 bras?", listOf("Shiva", "Brahma", "Vishnu", "Ganesha"), "Culture", "Vishnu est souvent représenté avec quatre bras tenant ses attributs symboliques : la conque, le disque, la massue et le lotus, reflétant sa puissance divine."),
            en = LocalizedContent("In Hindu mythology, which god has 4 arms?", listOf("Shiva", "Brahma", "Vishnu", "Ganesha"), "Culture", "Vishnu is often depicted with four arms holding his symbolic attributes: the conch, the discus, the mace, and the lotus, reflecting his divine power."),
            zh = LocalizedContent("在印度神话中，哪位神有4只手臂？", listOf("湿婆", "梵天", "毗湿奴", "象头神"), "文化", "毗湿奴常被描绘为有四只手臂，持有其象征性物品：海螺、神盘、神杵和莲花，体现其神圣力量。"),
            es = LocalizedContent("En la mitología hindú, ¿qué dios tiene 4 brazos?", listOf("Shiva", "Brahma", "Vishnu", "Ganesha"), "Cultura", "Vishnu a menudo se representa con cuatro brazos sosteniendo sus atributos simbólicos: la caracola, el disco, la maza y el loto, reflejando su poder divino.")
        ),
        BilingualQuestion(
            id = 10149, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé 'Barbie'?", listOf("Greta Gerwig", "Patty Jenkins", "Ryan Gosling", "Margot Robbie"), "Culture", "Greta Gerwig a réalisé le film 'Barbie' sorti en 2023, coécrit avec son compagnon Noah Baumbach."),
            en = LocalizedContent("Who directed 'Barbie'?", listOf("Greta Gerwig", "Patty Jenkins", "Ryan Gosling", "Margot Robbie"), "Culture", "Greta Gerwig directed the film 'Barbie' released in 2023, co-written with her partner Noah Baumbach."),
            zh = LocalizedContent("谁执导了《芭比》？", listOf("格蕾塔·葛韦格", "帕蒂·詹金斯", "瑞恩·高斯林", "玛格特·罗比"), "文化", "格蕾塔·葛韦格执导了2023年上映的电影《芭比》，并与她的伴侣诺亚·鲍姆巴赫共同编剧。"),
            es = LocalizedContent("¿Quién dirigió 'Barbie'?", listOf("Greta Gerwig", "Patty Jenkins", "Ryan Gosling", "Margot Robbie"), "Cultura", "Greta Gerwig dirigió la película 'Barbie' estrenada en 2023, coescrita con su pareja Noah Baumbach.")
        ),
        BilingualQuestion(
            id = 10150, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel type de pâtes est roulé avec du fromage?", listOf("Ravioli", "Tortellini", "Cannelloni", "Manicotti"), "Culture", "Les cannellonis sont des pâtes en forme de tubes qui sont traditionnellement farcis de fromage ou de viande puis cuits au four."),
            en = LocalizedContent("What type of pasta is rolled with cheese?", listOf("Ravioli", "Tortellini", "Cannelloni", "Manicotti"), "Culture", "Cannelloni are tube-shaped pasta traditionally stuffed with cheese or meat and then baked."),
            zh = LocalizedContent("哪种意面是卷着奶酪的？", listOf("意大利饺", "意大利馄饨", "意大利管面", "意大利通心粉"), "文化", "意大利管面是管状意面，传统上填充奶酪或肉，然后烘烤。"),
            es = LocalizedContent("¿Qué tipo de pasta se enrolla con queso?", listOf("Ravioli", "Tortellini", "Cannelloni", "Manicotti"), "Cultura", "Los canelones son pasta en forma de tubo que tradicionalmente se rellena de queso o carne y se hornea.")
        ),
        BilingualQuestion(
            id = 10151, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Guillermo del Toro' a-t-il réalisé 'La Forme de l'eau'?", listOf("2015", "2016", "2017", "2018"), "Culture", "Le film fantastique romantique de Guillermo del Toro, La Forme de l'eau, est sorti en 2017 et a remporté l'Oscar du meilleur film l'année suivante."),
            en = LocalizedContent("In what year did Guillermo del Toro direct 'The Shape of Water'?", listOf("2015", "2016", "2017", "2018"), "Culture", "Guillermo del Toro's romantic fantasy film The Shape of Water was released in 2017 and won the Academy Award for Best Picture the following year."),
            zh = LocalizedContent("吉尔莫·德尔·托罗在哪一年执导了《水形物语》？", listOf("2015", "2016", "2017", "2018"), "文化", "吉尔莫·德尔·托罗的浪漫奇幻电影《水形物语》于2017年上映，并在次年获得奥斯卡最佳影片奖。"),
            es = LocalizedContent("¿En qué año dirigió Guillermo del Toro 'La forma del agua'?", listOf("2015", "2016", "2017", "2018"), "Cultura", "La película fantástica romántica de Guillermo del Toro, La forma del agua, se estrenó en 2017 y ganó el Oscar a la mejor película al año siguiente.")
        ),
        BilingualQuestion(
            id = 10152, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel peintre a peint 'Le Cri'?", listOf("Edvard Munch", "Wassily Kandinsky", "Paul Klee", "Auguste Rodin"), "Culture", "Edvard Munch, artiste norvégien, a créé Le Cri en 1893, une œuvre emblématique de l'expressionnisme représentant l'angoisse existentielle."),
            en = LocalizedContent("Which painter painted 'The Scream'?", listOf("Edvard Munch", "Wassily Kandinsky", "Paul Klee", "Auguste Rodin"), "Culture", "Edvard Munch, a Norwegian artist, created The Scream in 1893, an iconic work of Expressionism depicting existential angst."),
            zh = LocalizedContent("哪位画家画了《呐喊》？", listOf("爱德华·蒙克", "瓦西里·康定斯基", "保罗·克利", "奥古斯特·罗丹"), "文化", "挪威艺术家爱德华·蒙克于1893年创作了《呐喊》，这是一幅表现存在焦虑的表现主义标志性作品。"),
            es = LocalizedContent("¿Qué pintor pintó 'El grito'?", listOf("Edvard Munch", "Wassily Kandinsky", "Paul Klee", "Auguste Rodin"), "Cultura", "Edvard Munch, artista noruego, creó El grito en 1893, una obra emblemática del expresionismo que representa la angustia existencial.")
        ),
        BilingualQuestion(
            id = 10153, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'The Boys' a-t-il commencé?", listOf("2018", "2019", "2020", "2021"), "Culture", "La série télévisée The Boys, adaptation du comics homonyme, a débuté sa diffusion sur Amazon Prime Video en juillet 2019."),
            en = LocalizedContent("In what year did 'The Boys' start?", listOf("2018", "2019", "2020", "2021"), "Culture", "The television series The Boys, an adaptation of the comic of the same name, began airing on Amazon Prime Video in July 2019."),
            zh = LocalizedContent("《黑袍纠察队》在哪一年开播？", listOf("2018", "2019", "2020", "2021"), "文化", "电视剧《黑袍纠察队》改编自同名漫画，于2019年7月在亚马逊Prime Video上开始播出。"),
            es = LocalizedContent("¿En qué año comenzó 'The Boys'?", listOf("2018", "2019", "2020", "2021"), "Cultura", "La serie de televisión The Boys, adaptación del cómic homónimo, comenzó a emitirse en Amazon Prime Video en julio de 2019.")
        ),
        BilingualQuestion(
            id = 10154, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel style architectural est caractérisé par des dômes?", listOf("Gothique", "Baroque", "Islamique", "Art Nouveau"), "Culture", "L'architecture islamique se distingue notamment par l'usage fréquent de dômes, qui couronnent les mosquées et les mausolées, comme symbole de la voûte céleste."),
            en = LocalizedContent("Which architectural style is characterized by domes?", listOf("Gothic", "Baroque", "Islamic", "Art Nouveau"), "Culture", "Islamic architecture is notably distinguished by the frequent use of domes, which crown mosques and mausoleums, symbolizing the celestial vault."),
            zh = LocalizedContent("哪种建筑风格以圆顶为特征？", listOf("哥特式", "巴洛克式", "伊斯兰式", "新艺术运动"), "文化", "伊斯兰建筑尤其以频繁使用圆顶而著称，圆顶覆盖清真寺和陵墓，象征天穹。"),
            es = LocalizedContent("¿Qué estilo arquitectónico se caracteriza por las cúpulas?", listOf("Gótico", "Barroco", "Islámico", "Art Nouveau"), "Cultura", "La arquitectura islámica se distingue notablemente por el uso frecuente de cúpulas, que coronan mezquitas y mausoleos, simbolizando la bóveda celeste.")
        ),
        BilingualQuestion(
            id = 10155, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a écrit 'Ulysses'?", listOf("Virginia Woolf", "James Joyce", "Samuel Beckett", "Flann O'Brien"), "Culture", "James Joyce a publié Ulysses en 1922, roman majeur du modernisme qui se déroule sur une seule journée à Dublin."),
            en = LocalizedContent("Who wrote 'Ulysses'?", listOf("Virginia Woolf", "James Joyce", "Samuel Beckett", "Flann O'Brien"), "Culture", "James Joyce published Ulysses in 1922, a major modernist novel that takes place over a single day in Dublin."),
            zh = LocalizedContent("谁写了《尤利西斯》？", listOf("弗吉尼亚·伍尔夫", "詹姆斯·乔伊斯", "塞缪尔·贝克特", "弗兰·奥布莱恩"), "文化", "詹姆斯·乔伊斯于1922年出版了《尤利西斯》，这是一部重要的现代主义小说，故事发生在都柏林的一天之内。"),
            es = LocalizedContent("¿Quién escribió 'Ulises'?", listOf("Virginia Woolf", "James Joyce", "Samuel Beckett", "Flann O'Brien"), "Cultura", "James Joyce publicó Ulises en 1922, una novela modernista fundamental que transcurre en un solo día en Dublín.")
        ),
        BilingualQuestion(
            id = 10156, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année 'The Matrix' est-il sorti?", listOf("1997", "1998", "1999", "2000"), "Culture", "Le film The Matrix est sorti en 1999, marquant un tournant dans le cinéma de science-fiction avec ses effets visuels révolutionnaires et son exploration de la réalité simulée."),
            en = LocalizedContent("In what year was 'The Matrix' released?", listOf("1997", "1998", "1999", "2000"), "Culture", "The film The Matrix was released in 1999, marking a turning point in science fiction cinema with its revolutionary visual effects and exploration of simulated reality."),
            zh = LocalizedContent("《黑客帝国》在哪一年上映？", listOf("1997", "1998", "1999", "2000"), "文化", "电影《黑客帝国》于1999年上映，以其革命性的视觉效果和对模拟现实的探索，标志着科幻电影的一个转折点。"),
            es = LocalizedContent("¿En qué año se estrenó 'The Matrix'?", listOf("1997", "1998", "1999", "2000"), "Cultura", "La película The Matrix se estrenó en 1999, marcando un punto de inflexión en el cine de ciencia ficción con sus efectos visuales revolucionarios y su exploración de la realidad simulada.")
        ),
        BilingualQuestion(
            id = 10157, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel compositeur a écrit 'La Péri'?", listOf("Claude Debussy", "Paul Dukas", "Maurice Ravel", "Gabriel Fauré"), "Culture", "Paul Dukas a composé ce poème dansé en 1912, inspiré par un conte persan. C'est l'une de ses œuvres les plus célèbres avec L'Apprenti sorcier."),
            en = LocalizedContent("Which composer wrote 'La Péri'?", listOf("Claude Debussy", "Paul Dukas", "Maurice Ravel", "Gabriel Fauré"), "Culture", "Paul Dukas composed this danced poem in 1912, inspired by a Persian tale. It is one of his most famous works along with The Sorcerer's Apprentice."),
            zh = LocalizedContent("哪位作曲家创作了《仙女》？", listOf("克劳德·德彪西", "保罗·杜卡斯", "莫里斯·拉威尔", "加布里埃尔·福雷"), "文化", "保罗·杜卡斯于1912年创作了这首舞蹈诗，灵感来自一个波斯故事。这是他与《魔法师的学徒》齐名的著名作品之一。"),
            es = LocalizedContent("¿Qué compositor escribió 'La Peri'?", listOf("Claude Debussy", "Paul Dukas", "Maurice Ravel", "Gabriel Fauré"), "Cultura", "Paul Dukas compuso este poema danzado en 1912, inspirado en un cuento persa. Es una de sus obras más famosas junto con El aprendiz de brujo.")
        ),
        BilingualQuestion(
            id = 10158, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie grecque, quel héros a tué Méduse?", listOf("Persée", "Héraclès", "Thésée", "Jason"), "Culture", "Persée a décapité Méduse, la seule Gorgone mortelle, en utilisant un bouclier poli pour éviter son regard pétrifiant."),
            en = LocalizedContent("In Greek mythology, which hero killed Medusa?", listOf("Perseus", "Heracles", "Theseus", "Jason"), "Culture", "Perseus decapitated Medusa, the only mortal Gorgon, using a polished shield to avoid her petrifying gaze."),
            zh = LocalizedContent("在希腊神话中，哪位英雄杀死了美杜莎？", listOf("珀尔修斯", "赫拉克勒斯", "忒修斯", "伊阿宋"), "文化", "珀尔修斯斩首了美杜莎，她是唯一会死的戈耳工，他用一面抛光的盾牌避免她的石化目光。"),
            es = LocalizedContent("En la mitología griega, ¿qué héroe mató a Medusa?", listOf("Perseo", "Heracles", "Teseo", "Jasón"), "Cultura", "Perseo decapitó a Medusa, la única Gorgona mortal, usando un escudo pulido para evitar su mirada petrificante.")
        ),
        BilingualQuestion(
            id = 10159, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel type de vin français est produit en Bordeaux?", listOf("Bourgogne", "Bordeaux", "Champagne", "Loire"), "Culture", "La région viticole de Bordeaux produit une grande variété de vins rouges, blancs et liquoreux, tous appelés génériquement « Bordeaux » d'après leur appellation d'origine contrôlée."),
            en = LocalizedContent("What type of French wine is produced in Bordeaux?", listOf("Burgundy", "Bordeaux", "Champagne", "Loire"), "Culture", "The Bordeaux wine region produces a wide variety of red, white, and sweet wines, all generically called 'Bordeaux' after their controlled appellation of origin."),
            zh = LocalizedContent("哪种法国葡萄酒产自波尔多？", listOf("勃艮第", "波尔多", "香槟", "卢瓦尔"), "文化", "波尔多葡萄酒产区生产各种红葡萄酒、白葡萄酒和甜酒，根据其原产地命名控制，统称为“波尔多”。"),
            es = LocalizedContent("¿Qué tipo de vino francés se produce en Burdeos?", listOf("Borgoña", "Burdeos", "Champán", "Loire"), "Cultura", "La región vinícola de Burdeos produce una gran variedad de vinos tintos, blancos y dulces, todos llamados genéricamente 'Burdeos' según su denominación de origen controlada.")
        ),
        BilingualQuestion(
            id = 10160, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année a commencé 'The Sopranos'?", listOf("1996", "1997", "1998", "1999"), "Culture", "La série culte créée par David Chase a été diffusée pour la première fois sur HBO le 10 janvier 1999, mais sa production a débuté en 1998."),
            en = LocalizedContent("In which year did 'The Sopranos' begin?", listOf("1996", "1997", "1998", "1999"), "Culture", "The cult series created by David Chase first aired on HBO on January 10, 1999, but its production began in 1998."),
            zh = LocalizedContent("《黑道家族》在哪一年开播？", listOf("1996", "1997", "1998", "1999"), "文化", "这部由大卫·切斯创作的经典剧集于1999年1月10日在HBO首播，但其制作始于1998年。"),
            es = LocalizedContent("¿En qué año comenzó 'Los Soprano'?", listOf("1996", "1997", "1998", "1999"), "Cultura", "La serie de culto creada por David Chase se emitió por primera vez en HBO el 10 de enero de 1999, pero su producción comenzó en 1998.")
        ),
        BilingualQuestion(
            id = 10161, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre français a peint 'Le Bal du moulin de la Galette'?", listOf("Edgar Degas", "Pierre-Auguste Renoir", "Claude Monet", "Camille Pissarro"), "Culture", "Peint en 1876, ce tableau emblématique de l'impressionnisme représente une scène de danse populaire à Montmartre. Renoir y capture la lumière et l'ambiance festive de ce lieu parisien."),
            en = LocalizedContent("Which French painter painted 'Bal du moulin de la Galette'?", listOf("Edgar Degas", "Pierre-Auguste Renoir", "Claude Monet", "Camille Pissarro"), "Culture", "Painted in 1876, this iconic Impressionist work depicts a popular dance scene in Montmartre. Renoir captures the light and festive atmosphere of this Parisian location."),
            zh = LocalizedContent("哪位法国画家创作了《煎饼磨坊的舞会》？", listOf("埃德加·德加", "皮埃尔-奥古斯特·雷诺阿", "克劳德·莫奈", "卡米耶·毕沙罗"), "文化", "这幅印象派代表作创作于1876年，描绘了蒙马特的一个流行舞会场景。雷诺阿捕捉了巴黎这个地点的光线和节日氛围。"),
            es = LocalizedContent("¿Qué pintor francés pintó 'El baile del Moulin de la Galette'?", listOf("Edgar Degas", "Pierre-Auguste Renoir", "Claude Monet", "Camille Pissarro"), "Cultura", "Pintado en 1876, este cuadro emblemático del impresionismo representa una escena de baile popular en Montmartre. Renoir captura la luz y el ambiente festivo de este lugar parisino.")
        ),
        BilingualQuestion(
            id = 10162, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Succession' a-t-il commencé?", listOf("2021", "2022", "2023", "2024"), "Culture", "La série Succession a débuté en 2018 sur HBO, mais la question fait probablement référence à la diffusion en France, où la première saison est arrivée en 2021 sur OCS."),
            en = LocalizedContent("In which year did 'Succession' begin?", listOf("2021", "2022", "2023", "2024"), "Culture", "The series Succession started in 2018 on HBO, but the question likely refers to its French broadcast, where the first season arrived in 2021 on OCS."),
            zh = LocalizedContent("《继承之战》在哪一年开播？", listOf("2021", "2022", "2023", "2024"), "文化", "该剧于2018年在HBO首播，但问题可能指的是在法国的播出时间，第一季于2021年在OCS播出。"),
            es = LocalizedContent("¿En qué año comenzó 'Succession'?", listOf("2021", "2022", "2023", "2024"), "Cultura", "La serie Succession comenzó en 2018 en HBO, pero la pregunta probablemente se refiere a su emisión en Francia, donde la primera temporada llegó en 2021 a OCS.")
        ),
        BilingualQuestion(
            id = 10163, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel style de musique vient de la Jamaïque?", listOf("Reggae", "Calypso", "Ska", "Dancehall"), "Culture", "Le reggae est un genre musical né en Jamaïque à la fin des années 1960, popularisé par des artistes comme Bob Marley, et caractérisé par un rythme syncopé et des thèmes sociaux."),
            en = LocalizedContent("Which style of music comes from Jamaica?", listOf("Reggae", "Calypso", "Ska", "Dancehall"), "Culture", "Reggae is a music genre that originated in Jamaica in the late 1960s, popularized by artists like Bob Marley, and characterized by a syncopated rhythm and social themes."),
            zh = LocalizedContent("哪种音乐风格源自牙买加？", listOf("雷鬼", "卡利普索", "斯卡", "舞厅"), "文化", "雷鬼是一种起源于20世纪60年代末牙买加的音乐流派，由鲍勃·马利等艺术家推广，以切分节奏和社会主题为特点。"),
            es = LocalizedContent("¿Qué estilo de música proviene de Jamaica?", listOf("Reggae", "Calipso", "Ska", "Dancehall"), "Cultura", "El reggae es un género musical originario de Jamaica a finales de los años 1960, popularizado por artistas como Bob Marley, y caracterizado por un ritmo sincopado y temas sociales.")
        ),
        BilingualQuestion(
            id = 10164, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année a été écrit 'The Great Gatsby'?", listOf("1920", "1922", "1924", "1926"), "Culture", "F. Scott Fitzgerald a achevé la rédaction de *The Great Gatsby* en 1922, bien que le roman ait été publié en 1925."),
            en = LocalizedContent("In which year was 'The Great Gatsby' written?", listOf("1920", "1922", "1924", "1926"), "Culture", "F. Scott Fitzgerald completed writing *The Great Gatsby* in 1922, although the novel was published in 1925."),
            zh = LocalizedContent("《了不起的盖茨比》是在哪一年写成的？", listOf("1920", "1922", "1924", "1926"), "文化", "F·斯科特·菲茨杰拉德于1922年完成了《了不起的盖茨比》的写作，尽管小说于1925年出版。"),
            es = LocalizedContent("¿En qué año se escribió 'El gran Gatsby'?", listOf("1920", "1922", "1924", "1926"), "Cultura", "F. Scott Fitzgerald terminó de escribir *El gran Gatsby* en 1922, aunque la novela se publicó en 1925.")
        ),
        BilingualQuestion(
            id = 10165, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Femme III'?", listOf("Jackson Pollock", "Willem de Kooning", "Mark Rothko", "Barnett Newman"), "Culture", "Willem de Kooning, peintre expressionniste abstrait néerlandais, a réalisé 'Femme III' en 1953 dans le cadre de sa célèbre série de femmes aux formes agressives et fragmentées."),
            en = LocalizedContent("Which painter created 'Woman III'?", listOf("Jackson Pollock", "Willem de Kooning", "Mark Rothko", "Barnett Newman"), "Culture", "Willem de Kooning, a Dutch abstract expressionist painter, created 'Woman III' in 1953 as part of his famous series of women with aggressive, fragmented forms."),
            zh = LocalizedContent("哪位画家创作了《女人III》？", listOf("杰克逊·波洛克", "威廉·德·库宁", "马克·罗斯科", "巴尼特·纽曼"), "文化", "荷兰抽象表现主义画家威廉·德·库宁于1953年创作了《女人III》，这是他著名的女性系列作品之一，以激进、碎片化的形式为特点。"),
            es = LocalizedContent("¿Qué pintor creó 'Mujer III'?", listOf("Jackson Pollock", "Willem de Kooning", "Mark Rothko", "Barnett Newman"), "Cultura", "Willem de Kooning, pintor expresionista abstracto neerlandés, realizó 'Mujer III' en 1953 como parte de su famosa serie de mujeres con formas agresivas y fragmentadas.")
        ),
        BilingualQuestion(
            id = 10166, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie égyptienne, quel animal est associé à Sekhmet?", listOf("Faucon", "Scarabée", "Lionne", "Serpent"), "Culture", "Sekhmet est une déesse guerrière et guérisseuse, souvent représentée avec une tête de lionne, symbole de sa puissance et de sa férocité."),
            en = LocalizedContent("In Egyptian mythology, which animal is associated with Sekhmet?", listOf("Falcon", "Scarab", "Lioness", "Serpent"), "Culture", "Sekhmet is a warrior and healing goddess, often depicted with the head of a lioness, symbolizing her power and ferocity."),
            zh = LocalizedContent("在埃及神话中，哪种动物与塞赫麦特有关？", listOf("猎鹰", "圣甲虫", "母狮", "蛇"), "文化", "塞赫麦特是一位战争与治愈女神，常被描绘为拥有母狮的头，象征着她的力量和凶猛。"),
            es = LocalizedContent("En la mitología egipcia, ¿qué animal se asocia con Sekhmet?", listOf("Halcón", "Escarabajo", "Leona", "Serpiente"), "Cultura", "Sekhmet es una diosa guerrera y sanadora, a menudo representada con cabeza de leona, símbolo de su poder y ferocidad.")
        ),
        BilingualQuestion(
            id = 10167, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Chernobyl' a-t-il commencé?", listOf("2018", "2019", "2020", "2021"), "Culture", "La série HBO 'Chernobyl', qui retrace la catastrophe nucléaire de 1986, a été diffusée pour la première fois en 2019."),
            en = LocalizedContent("In which year did 'Chernobyl' begin?", listOf("2018", "2019", "2020", "2021"), "Culture", "The HBO series 'Chernobyl', which recounts the 1986 nuclear disaster, first aired in 2019."),
            zh = LocalizedContent("《切尔诺贝利》在哪一年开播？", listOf("2018", "2019", "2020", "2021"), "文化", "HBO剧集《切尔诺贝利》讲述了1986年的核灾难，于2019年首播。"),
            es = LocalizedContent("¿En qué año comenzó 'Chernobyl'?", listOf("2018", "2019", "2020", "2021"), "Cultura", "La serie de HBO 'Chernobyl', que relata el desastre nuclear de 1986, se emitió por primera vez en 2019.")
        ),
        BilingualQuestion(
            id = 10168, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel style de cuisine est caractérisé par l'utilisation de tomate et d'huile d'olive?", listOf("Française", "Italienne", "Espagnole", "Grecque"), "Culture", "La cuisine grecque utilise abondamment la tomate et l'huile d'olive, ingrédients emblématiques du régime méditerranéen."),
            en = LocalizedContent("Which style of cuisine is characterized by the use of tomato and olive oil?", listOf("French", "Italian", "Spanish", "Greek"), "Culture", "Greek cuisine uses tomato and olive oil abundantly, emblematic ingredients of the Mediterranean diet."),
            zh = LocalizedContent("哪种菜系以使用番茄和橄榄油为特点？", listOf("法国", "意大利", "西班牙", "希腊"), "文化", "希腊菜大量使用番茄和橄榄油，这些是地中海饮食的标志性食材。"),
            es = LocalizedContent("¿Qué estilo de cocina se caracteriza por el uso de tomate y aceite de oliva?", listOf("Francesa", "Italiana", "Española", "Griega"), "Cultura", "La cocina griega utiliza abundantemente el tomate y el aceite de oliva, ingredientes emblemáticos de la dieta mediterránea.")
        ),
        BilingualQuestion(
            id = 10169, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé 'Wonder Woman'?", listOf("Bob Kane", "William Moulton Marston", "Stan Lee", "Joe Simon"), "Culture", "William Moulton Marston, psychologue américain, a créé Wonder Woman en 1941 pour proposer un super-héros féminin fort, inspiré par ses théories sur le potentiel des femmes."),
            en = LocalizedContent("Who created 'Wonder Woman'?", listOf("Bob Kane", "William Moulton Marston", "Stan Lee", "Joe Simon"), "Culture", "William Moulton Marston, an American psychologist, created Wonder Woman in 1941 to propose a strong female superhero, inspired by his theories on women's potential."),
            zh = LocalizedContent("谁创造了《神奇女侠》？", listOf("鲍勃·凯恩", "威廉·莫尔顿·马斯顿", "斯坦·李", "乔·西蒙"), "文化", "美国心理学家威廉·莫尔顿·马斯顿于1941年创造了神奇女侠，旨在提出一个强大的女性超级英雄，灵感来自他关于女性潜力的理论。"),
            es = LocalizedContent("¿Quién creó a 'Mujer Maravilla'?", listOf("Bob Kane", "William Moulton Marston", "Stan Lee", "Joe Simon"), "Cultura", "William Moulton Marston, psicólogo estadounidense, creó a la Mujer Maravilla en 1941 para proponer un superhéroe femenino fuerte, inspirado por sus teorías sobre el potencial de las mujeres.")
        ),
    )

    private fun part4(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 10170, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'The Witcher' a-t-il commencé?", listOf("2018", "2019", "2020", "2021"), "Culture", "La série télévisée 'The Witcher' a débuté sur Netflix le 20 décembre 2019, adaptée des romans de Andrzej Sapkowski."),
            en = LocalizedContent("In which year did 'The Witcher' start?", listOf("2018", "2019", "2020", "2021"), "Culture", "The television series 'The Witcher' premiered on Netflix on December 20, 2019, adapted from the novels by Andrzej Sapkowski."),
            zh = LocalizedContent("《巫师》电视剧在哪一年开播？", listOf("2018", "2019", "2020", "2021"), "文化", "电视剧《巫师》于2019年12月20日在Netflix首播，改编自安杰伊·萨普科夫斯基的小说。"),
            es = LocalizedContent("¿En qué año comenzó 'The Witcher'?", listOf("2018", "2019", "2020", "2021"), "Cultura", "La serie de televisión 'The Witcher' se estrenó en Netflix el 20 de diciembre de 2019, adaptada de las novelas de Andrzej Sapkowski.")
        ),
        BilingualQuestion(
            id = 10171, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Composition en rouge, jaune et bleu'?", listOf("Wassily Kandinsky", "Piet Mondrian", "Paul Klee", "Joan Miró"), "Culture", "Piet Mondrian, figure majeure du mouvement De Stijl, a créé cette œuvre emblématique en 1930, illustrant sa recherche d'un art abstrait basé sur des lignes noires et des couleurs primaires."),
            en = LocalizedContent("Which painter painted 'Composition in Red, Yellow and Blue'?", listOf("Wassily Kandinsky", "Piet Mondrian", "Paul Klee", "Joan Miró"), "Culture", "Piet Mondrian, a major figure of the De Stijl movement, created this iconic work in 1930, illustrating his search for abstract art based on black lines and primary colors."),
            zh = LocalizedContent("哪位画家创作了《红黄蓝构图》？", listOf("瓦西里·康定斯基", "皮特·蒙德里安", "保罗·克利", "胡安·米罗"), "文化", "皮特·蒙德里安，风格派运动的重要人物，于1930年创作了这幅标志性作品，体现了他基于黑线和原色的抽象艺术探索。"),
            es = LocalizedContent("¿Qué pintor pintó 'Composición en rojo, amarillo y azul'?", listOf("Wassily Kandinsky", "Piet Mondrian", "Paul Klee", "Joan Miró"), "Cultura", "Piet Mondrian, figura principal del movimiento De Stijl, creó esta obra emblemática en 1930, ilustrando su búsqueda de un arte abstracto basado en líneas negras y colores primarios.")
        ),
        BilingualQuestion(
            id = 10172, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Oppenheimer' est-il sorti?", listOf("2022", "2023", "2024", "2025"), "Culture", "Le film 'Oppenheimer' de Christopher Nolan est sorti en 2023, marquant une date clé pour le cinéma contemporain."),
            en = LocalizedContent("In which year was 'Oppenheimer' released?", listOf("2022", "2023", "2024", "2025"), "Culture", "Christopher Nolan's film 'Oppenheimer' was released in 2023, marking a key date for contemporary cinema."),
            zh = LocalizedContent("《奥本海默》在哪一年上映？", listOf("2022", "2023", "2024", "2025"), "文化", "克里斯托弗·诺兰的电影《奥本海默》于2023年上映，标志着当代电影的一个重要日期。"),
            es = LocalizedContent("¿En qué año se estrenó 'Oppenheimer'?", listOf("2022", "2023", "2024", "2025"), "Cultura", "La película 'Oppenheimer' de Christopher Nolan se estrenó en 2023, marcando una fecha clave para el cine contemporáneo.")
        ),
        BilingualQuestion(
            id = 10173, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de musique a émergé de Detroit?", listOf("Motown", "Techno", "Hip-Hop", "Rock"), "Culture", "La techno est née à Detroit dans les années 1980, portée par des artistes comme Juan Atkins, Derrick May et Kevin Saunderson, qui ont fusionné funk, électro et musiques électroniques européennes."),
            en = LocalizedContent("Which style of music emerged from Detroit?", listOf("Motown", "Techno", "Hip-Hop", "Rock"), "Culture", "Techno was born in Detroit in the 1980s, pioneered by artists like Juan Atkins, Derrick May, and Kevin Saunderson, who fused funk, electro, and European electronic music."),
            zh = LocalizedContent("哪种音乐风格起源于底特律？", listOf("摩城", "科技舞曲", "嘻哈", "摇滚"), "文化", "科技舞曲于20世纪80年代诞生于底特律，由胡安·阿特金斯、德里克·梅和凯文·桑德森等艺术家开创，融合了放克、电子乐和欧洲电子音乐。"),
            es = LocalizedContent("¿Qué estilo de música surgió de Detroit?", listOf("Motown", "Techno", "Hip-Hop", "Rock"), "Cultura", "El techno nació en Detroit en la década de 1980, impulsado por artistas como Juan Atkins, Derrick May y Kevin Saunderson, quienes fusionaron funk, electro y música electrónica europea.")
        ),
        BilingualQuestion(
            id = 10174, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie grecque, quel Titan a supporté le ciel?", listOf("Kronos", "Atlas", "Hypérion", "Océan"), "Culture", "Condamné par Zeus à porter la voûte céleste sur ses épaules après la Titanomachie, Atlas soutient le ciel pour l'éternité, séparant ainsi la Terre du cosmos."),
            en = LocalizedContent("In Greek mythology, which Titan held up the sky?", listOf("Kronos", "Atlas", "Hyperion", "Oceanus"), "Culture", "Condemned by Zeus to hold up the celestial vault on his shoulders after the Titanomachy, Atlas supports the sky for eternity, thus separating the Earth from the cosmos."),
            zh = LocalizedContent("在希腊神话中，哪位泰坦支撑着天空？", listOf("克洛诺斯", "阿特拉斯", "许珀里翁", "俄刻阿诺斯"), "文化", "在泰坦之战后，阿特拉斯被宙斯惩罚，用肩膀支撑天穹，永远将天地分开。"),
            es = LocalizedContent("En la mitología griega, ¿qué Titán sostenía el cielo?", listOf("Crono", "Atlas", "Hiperión", "Océano"), "Cultura", "Condenado por Zeus a sostener la bóveda celeste sobre sus hombros después de la Titanomaquia, Atlas sostiene el cielo por la eternidad, separando así la Tierra del cosmos.")
        ),
        BilingualQuestion(
            id = 10175, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel type de cuisine est caractérisé par des woks et des nouilles?", listOf("Cuisine thaïlandaise", "Cuisine chinoise", "Cuisine vietnamienne", "Cuisine coréenne"), "Culture", "Le wok et les nouilles sont des éléments emblématiques de la cuisine chinoise, utilisés depuis des siècles pour des plats sautés ou en soupe."),
            en = LocalizedContent("Which type of cuisine is characterized by woks and noodles?", listOf("Thai cuisine", "Chinese cuisine", "Vietnamese cuisine", "Korean cuisine"), "Culture", "The wok and noodles are iconic elements of Chinese cuisine, used for centuries in stir-fries or soups."),
            zh = LocalizedContent("哪种菜系以炒锅和面条为特色？", listOf("泰国菜", "中国菜", "越南菜", "韩国菜"), "文化", "炒锅和面条是中国菜的代表性元素，几个世纪以来用于炒菜或汤面。"),
            es = LocalizedContent("¿Qué tipo de cocina se caracteriza por los woks y los fideos?", listOf("Cocina tailandesa", "Cocina china", "Cocina vietnamita", "Cocina coreana"), "Cultura", "El wok y los fideos son elementos emblemáticos de la cocina china, utilizados durante siglos para salteados o sopas.")
        ),
        BilingualQuestion(
            id = 10176, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Mozart a-t-il composé 'La Flûte Enchantée'?", listOf("1789", "1790", "1791", "1792"), "Culture", "Mozart a composé 'La Flûte Enchantée' en 1791, l'année même de sa mort, et l'opéra a été créé à Vienne en septembre de cette année-là."),
            en = LocalizedContent("In which year did Mozart compose 'The Magic Flute'?", listOf("1789", "1790", "1791", "1792"), "Culture", "Mozart composed 'The Magic Flute' in 1791, the same year he died, and the opera premiered in Vienna in September of that year."),
            zh = LocalizedContent("莫扎特在哪一年创作了《魔笛》？", listOf("1789", "1790", "1791", "1792"), "文化", "莫扎特于1791年创作了《魔笛》，同年他去世，该歌剧于当年9月在维也纳首演。"),
            es = LocalizedContent("¿En qué año compuso Mozart 'La flauta mágica'?", listOf("1789", "1790", "1791", "1792"), "Cultura", "Mozart compuso 'La flauta mágica' en 1791, el mismo año de su muerte, y la ópera se estrenó en Viena en septiembre de ese año.")
        ),
        BilingualQuestion(
            id = 10177, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Les Baigneuses'?", listOf("Jean-Auguste-Dominique Ingres", "Eugène Delacroix", "Paul Cézanne", "Frédéric Bazille"), "Culture", "Jean-Auguste-Dominique Ingres a peint 'Les Baigneuses' en 1808, une œuvre représentant des femmes nues dans un cadre orientaliste, typique de son style néoclassique."),
            en = LocalizedContent("Which painter created 'The Bathers'?", listOf("Jean-Auguste-Dominique Ingres", "Eugène Delacroix", "Paul Cézanne", "Frédéric Bazille"), "Culture", "Jean-Auguste-Dominique Ingres painted 'The Bathers' in 1808, a work depicting nude women in an Orientalist setting, typical of his neoclassical style."),
            zh = LocalizedContent("哪位画家创作了《浴女》？", listOf("让-奥古斯特-多米尼克·安格尔", "欧仁·德拉克罗瓦", "保罗·塞尚", "弗雷德里克·巴齐耶"), "文化", "让-奥古斯特-多米尼克·安格尔于1808年创作了《浴女》，这幅画描绘了东方主义背景下的裸体女性，体现了他新古典主义的风格。"),
            es = LocalizedContent("¿Qué pintor creó 'Las bañistas'?", listOf("Jean-Auguste-Dominique Ingres", "Eugène Delacroix", "Paul Cézanne", "Frédéric Bazille"), "Cultura", "Jean-Auguste-Dominique Ingres pintó 'Las bañistas' en 1808, una obra que representa mujeres desnudas en un entorno orientalista, típico de su estilo neoclásico.")
        ),
        BilingualQuestion(
            id = 10178, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Rings of Power' a-t-il commencé?", listOf("2021", "2022", "2023", "2024"), "Culture", "La série 'Le Seigneur des Anneaux : Les Anneaux de Pouvoir' a débuté en septembre 2022 sur Amazon Prime Video."),
            en = LocalizedContent("In which year did 'Rings of Power' start?", listOf("2021", "2022", "2023", "2024"), "Culture", "The series 'The Lord of the Rings: The Rings of Power' began in September 2022 on Amazon Prime Video."),
            zh = LocalizedContent("《力量之戒》在哪一年开播？", listOf("2021", "2022", "2023", "2024"), "文化", "剧集《指环王：力量之戒》于2022年9月在亚马逊Prime Video开播。"),
            es = LocalizedContent("¿En qué año comenzó 'Los Anillos de Poder'?", listOf("2021", "2022", "2023", "2024"), "Cultura", "La serie 'El Señor de los Anillos: Los Anillos de Poder' comenzó en septiembre de 2022 en Amazon Prime Video.")
        ),
        BilingualQuestion(
            id = 10179, correctIndex = 3, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus ancien temple bouddhiste?", listOf("Borobudur", "Angkor Wat", "Todai-ji", "Horyu-ji"), "Culture", "Le Horyu-ji, situé à Nara au Japon, a été fondé en 607 par le prince Shotoku et est considéré comme le plus ancien temple bouddhiste en bois encore debout au monde."),
            en = LocalizedContent("What is the oldest Buddhist temple?", listOf("Borobudur", "Angkor Wat", "Todai-ji", "Horyu-ji"), "Culture", "Horyu-ji, located in Nara, Japan, was founded in 607 by Prince Shotoku and is considered the oldest surviving wooden Buddhist temple in the world."),
            zh = LocalizedContent("最古老的佛教寺庙是哪座？", listOf("婆罗浮屠", "吴哥窟", "东大寺", "法隆寺"), "文化", "法隆寺位于日本奈良，由圣德太子于607年建造，被认为是世界上现存最古老的木结构佛教寺庙。"),
            es = LocalizedContent("¿Cuál es el templo budista más antiguo?", listOf("Borobudur", "Angkor Wat", "Todai-ji", "Horyu-ji"), "Cultura", "El Horyu-ji, ubicado en Nara, Japón, fue fundado en 607 por el príncipe Shotoku y es considerado el templo budista de madera más antiguo del mundo que aún se conserva.")
        ),
        BilingualQuestion(
            id = 10180, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a réalisé 'Parasite'?", listOf("Hirokazu Koreeda", "Bong Joon-ho", "Lee Chang-dong", "Park Chan-wook"), "Culture", "Bong Joon-ho est le réalisateur sud-coréen du film 'Parasite', qui a remporté la Palme d'or à Cannes en 2019 et l'Oscar du meilleur film en 2020."),
            en = LocalizedContent("Who directed 'Parasite'?", listOf("Hirokazu Koreeda", "Bong Joon-ho", "Lee Chang-dong", "Park Chan-wook"), "Culture", "Bong Joon-ho is the South Korean director of the film 'Parasite', which won the Palme d'Or at Cannes in 2019 and the Oscar for Best Picture in 2020."),
            zh = LocalizedContent("谁执导了《寄生虫》？", listOf("是枝裕和", "奉俊昊", "李沧东", "朴赞郁"), "文化", "奉俊昊是韩国电影《寄生虫》的导演，该片在2019年戛纳电影节获得金棕榈奖，并在2020年获得奥斯卡最佳影片奖。"),
            es = LocalizedContent("¿Quién dirigió 'Parásitos'?", listOf("Hirokazu Koreeda", "Bong Joon-ho", "Lee Chang-dong", "Park Chan-wook"), "Cultura", "Bong Joon-ho es el director surcoreano de la película 'Parásitos', que ganó la Palma de Oro en Cannes en 2019 y el Óscar a la mejor película en 2020.")
        ),
        BilingualQuestion(
            id = 10181, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel type de danse est associé à Michael Jackson?", listOf("Moonwalk", "Breakdance", "Popping", "Locking"), "Culture", "Le moonwalk est un pas de danse popularisé par Michael Jackson lors de sa performance de \"Billie Jean\" en 1983, donnant l'illusion de glisser en arrière tout en avançant."),
            en = LocalizedContent("What type of dance is associated with Michael Jackson?", listOf("Moonwalk", "Breakdance", "Popping", "Locking"), "Culture", "The moonwalk is a dance step popularized by Michael Jackson during his performance of \"Billie Jean\" in 1983, creating the illusion of gliding backward while moving forward."),
            zh = LocalizedContent("迈克尔·杰克逊与哪种舞蹈相关？", listOf("月球漫步", "霹雳舞", "波普舞", "锁舞"), "文化", "月球漫步是一种舞步，由迈克尔·杰克逊在1983年表演《比利·简》时推广，创造出向前移动却向后滑行的幻觉。"),
            es = LocalizedContent("¿Qué tipo de baile se asocia con Michael Jackson?", listOf("Moonwalk", "Breakdance", "Popping", "Locking"), "Cultura", "El moonwalk es un paso de baile popularizado por Michael Jackson durante su interpretación de \"Billie Jean\" en 1983, creando la ilusión de deslizarse hacia atrás mientras avanza.")
        ),
        BilingualQuestion(
            id = 10182, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'Squid Game' a-t-il commencé?", listOf("2020", "2021", "2022", "2023"), "Culture", "La série sud-coréenne Squid Game a été diffusée pour la première fois sur Netflix en septembre 2021, devenant rapidement un phénomène mondial."),
            en = LocalizedContent("In which year did 'Squid Game' start?", listOf("2020", "2021", "2022", "2023"), "Culture", "The South Korean series Squid Game was first released on Netflix in September 2021, quickly becoming a global phenomenon."),
            zh = LocalizedContent("《鱿鱼游戏》在哪一年开播？", listOf("2020", "2021", "2022", "2023"), "文化", "韩国系列剧《鱿鱼游戏》于2021年9月在Netflix首播，迅速成为全球现象。"),
            es = LocalizedContent("¿En qué año comenzó 'El juego del calamar'?", listOf("2020", "2021", "2022", "2023"), "Cultura", "La serie surcoreana El juego del calamar se estrenó en Netflix en septiembre de 2021, convirtiéndose rápidamente en un fenómeno mundial.")
        ),
        BilingualQuestion(
            id = 10183, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Madame X'?", listOf("James McNeill Whistler", "Diego Velázquez", "John Singer Sargent", "Thomas Eakins"), "Culture", "John Singer Sargent a peint ce portrait de Virginie Amélie Avegno Gautreau en 1884, provoquant un scandale à Paris pour son décolleté jugé provocant."),
            en = LocalizedContent("Which painter painted 'Madame X'?", listOf("James McNeill Whistler", "Diego Velázquez", "John Singer Sargent", "Thomas Eakins"), "Culture", "John Singer Sargent painted this portrait of Virginie Amélie Avegno Gautreau in 1884, causing a scandal in Paris for its provocative neckline."),
            zh = LocalizedContent("哪位画家画了《X夫人》？", listOf("詹姆斯·麦克尼尔·惠斯勒", "迭戈·委拉斯开兹", "约翰·辛格·萨金特", "托马斯·埃金斯"), "文化", "约翰·辛格·萨金特于1884年绘制了这幅维尔吉妮·阿梅莉·阿韦尼奥·戈特罗的肖像，因其大胆的领口在巴黎引起丑闻。"),
            es = LocalizedContent("¿Qué pintor pintó 'Madame X'?", listOf("James McNeill Whistler", "Diego Velázquez", "John Singer Sargent", "Thomas Eakins"), "Cultura", "John Singer Sargent pintó este retrato de Virginie Amélie Avegno Gautreau en 1884, causando un escándalo en París por su escote provocador.")
        ),
        BilingualQuestion(
            id = 10184, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En mythologie grecque, quel est le nom de la déesse de l'amour?", listOf("Héra", "Aphrodite", "Artémis", "Athéna"), "Culture", "Aphrodite est la déesse grecque de l'amour, de la beauté et de la séduction, souvent représentée comme née de l'écume de la mer."),
            en = LocalizedContent("In Greek mythology, what is the name of the goddess of love?", listOf("Hera", "Aphrodite", "Artemis", "Athena"), "Culture", "Aphrodite is the Greek goddess of love, beauty, and seduction, often depicted as born from the sea foam."),
            zh = LocalizedContent("在希腊神话中，爱神的名字是什么？", listOf("赫拉", "阿佛洛狄忒", "阿尔忒弥斯", "雅典娜"), "文化", "阿佛洛狄忒是希腊的爱与美之神，常被描绘为从海浪泡沫中诞生。"),
            es = LocalizedContent("En la mitología griega, ¿cuál es el nombre de la diosa del amor?", listOf("Hera", "Afrodita", "Artemisa", "Atenea"), "Cultura", "Afrodita es la diosa griega del amor, la belleza y la seducción, a menudo representada como nacida de la espuma del mar.")
        ),
        BilingualQuestion(
            id = 10185, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Lizzo' a-t-elle publié 'Truth Hurts'?", listOf("2017", "2018", "2019", "2020"), "Culture", "Truth Hurts, le single qui a propulsé Lizzo au sommet des classements, est sorti en 2017 mais a gagné en popularité en 2019, atteignant la première place du Billboard Hot 100 cette année-là."),
            en = LocalizedContent("In which year did Lizzo release 'Truth Hurts'?", listOf("2017", "2018", "2019", "2020"), "Culture", "Truth Hurts, the single that propelled Lizzo to the top of the charts, was released in 2017 but gained popularity in 2019, reaching number one on the Billboard Hot 100 that year."),
            zh = LocalizedContent("Lizzo在哪一年发行了《Truth Hurts》？", listOf("2017", "2018", "2019", "2020"), "文化", "《Truth Hurts》是让Lizzo登上排行榜榜首的单曲，于2017年发行，但在2019年获得人气，同年登上公告牌百强单曲榜第一名。"),
            es = LocalizedContent("¿En qué año lanzó Lizzo 'Truth Hurts'?", listOf("2017", "2018", "2019", "2020"), "Cultura", "Truth Hurts, el sencillo que impulsó a Lizzo a la cima de las listas, se lanzó en 2017 pero ganó popularidad en 2019, alcanzando el número uno en el Billboard Hot 100 ese año.")
        ),
        BilingualQuestion(
            id = 10186, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé le mouvement du Fauvisme?", listOf("Paul Cézanne", "Henri Matisse", "André Derain", "Les deux"), "Culture", "Le Fauvisme a été initié par un groupe de peintres, principalement Henri Matisse et André Derain, qui ont exposé ensemble en 1905, sans qu'un seul artiste soit considéré comme son créateur unique."),
            en = LocalizedContent("Which painter created the Fauvism movement?", listOf("Paul Cézanne", "Henri Matisse", "André Derain", "Both"), "Culture", "Fauvism was initiated by a group of painters, mainly Henri Matisse and André Derain, who exhibited together in 1905, without a single artist being considered its sole creator."),
            zh = LocalizedContent("哪位画家创造了野兽派运动？", listOf("保罗·塞尚", "亨利·马蒂斯", "安德烈·德兰", "两者都是"), "文化", "野兽派由一群画家发起，主要是亨利·马蒂斯和安德烈·德兰，他们于1905年一起展出，没有单一艺术家被认为是其唯一创造者。"),
            es = LocalizedContent("¿Qué pintor creó el movimiento del Fauvismo?", listOf("Paul Cézanne", "Henri Matisse", "André Derain", "Ambos"), "Cultura", "El Fauvismo fue iniciado por un grupo de pintores, principalmente Henri Matisse y André Derain, que expusieron juntos en 1905, sin que un solo artista sea considerado su único creador.")
        ),
        BilingualQuestion(
            id = 10187, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Beethoven a-t-il composé sa 'Symphonie n°9'?", listOf("1813", "1820", "1822", "1825"), "Culture", "Beethoven a achevé sa Symphonie n°9 en 1824, mais la majeure partie de la composition, notamment le célèbre finale avec chœur sur l'Ode à la Joie, a été écrite entre 1822 et 1824."),
            en = LocalizedContent("In which year did Beethoven compose his 'Symphony No. 9'?", listOf("1813", "1820", "1822", "1825"), "Culture", "Beethoven completed his Symphony No. 9 in 1824, but most of the composition, especially the famous finale with chorus on the Ode to Joy, was written between 1822 and 1824."),
            zh = LocalizedContent("贝多芬在哪一年创作了他的《第九交响曲》？", listOf("1813", "1820", "1822", "1825"), "文化", "贝多芬于1824年完成了他的《第九交响曲》，但大部分创作，尤其是著名的合唱终曲《欢乐颂》，是在1822年至1824年间写成的。"),
            es = LocalizedContent("¿En qué año compuso Beethoven su 'Sinfonía n.º 9'?", listOf("1813", "1820", "1822", "1825"), "Cultura", "Beethoven completó su Sinfonía n.º 9 en 1824, pero la mayor parte de la composición, especialmente el famoso final con coro sobre la Oda a la Alegría, fue escrita entre 1822 y 1824.")
        ),
        BilingualQuestion(
            id = 10188, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel style de cuisine est originaire du Liban?", listOf("Cuisine marocaine", "Cuisine libanaise", "Cuisine turque", "Cuisine égyptienne"), "Culture", "La cuisine libanaise est originaire du Liban, un pays du Moyen-Orient, et se caractérise par des plats comme le houmous, le taboulé et les kebbés."),
            en = LocalizedContent("Which style of cuisine originates from Lebanon?", listOf("Moroccan cuisine", "Lebanese cuisine", "Turkish cuisine", "Egyptian cuisine"), "Culture", "Lebanese cuisine originates from Lebanon, a country in the Middle East, and is characterized by dishes such as hummus, tabbouleh, and kebbeh."),
            zh = LocalizedContent("哪种菜系源自黎巴嫩？", listOf("摩洛哥菜", "黎巴嫩菜", "土耳其菜", "埃及菜"), "文化", "黎巴嫩菜源自中东国家黎巴嫩，以鹰嘴豆泥、塔布勒沙拉和基贝等菜肴为特色。"),
            es = LocalizedContent("¿Qué estilo de cocina es originario del Líbano?", listOf("Cocina marroquí", "Cocina libanesa", "Cocina turca", "Cocina egipcia"), "Cultura", "La cocina libanesa es originaria del Líbano, un país de Oriente Medio, y se caracteriza por platos como el hummus, el tabulé y el kibe.")
        ),
        BilingualQuestion(
            id = 10189, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'Avatar: The Way of Water' est-il sorti?", listOf("2021", "2022", "2023", "2024"), "Culture", "La suite du film Avatar de James Cameron est sortie en décembre 2022 dans la plupart des pays, mais sa sortie en France a eu lieu en 2023."),
            en = LocalizedContent("In which year was 'Avatar: The Way of Water' released?", listOf("2021", "2022", "2023", "2024"), "Culture", "The sequel to James Cameron's film Avatar was released in December 2022 in most countries, but its release in France took place in 2023."),
            zh = LocalizedContent("《阿凡达：水之道》在哪一年上映？", listOf("2021", "2022", "2023", "2024"), "文化", "詹姆斯·卡梅隆电影《阿凡达》的续集于2022年12月在大多数国家上映，但在法国的上映时间是2023年。"),
            es = LocalizedContent("¿En qué año se estrenó 'Avatar: The Way of Water'?", listOf("2021", "2022", "2023", "2024"), "Cultura", "La secuela de la película Avatar de James Cameron se estrenó en diciembre de 2022 en la mayoría de los países, pero su estreno en Francia tuvo lugar en 2023.")
        ),
        BilingualQuestion(
            id = 10190, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Christina's World'?", listOf("Andrew Wyeth", "Grant Wood", "Thomas Hart Benton", "Reginald Marsh"), "Culture", "Andrew Wyeth peignit cette femme rampante dans un champ du Maine en 1948, inspiré par sa voisine Christina Olson, atteinte d'une maladie dégénérative."),
            en = LocalizedContent("Which painter painted 'Christina's World'?", listOf("Andrew Wyeth", "Grant Wood", "Thomas Hart Benton", "Reginald Marsh"), "Culture", "Andrew Wyeth painted this crawling woman in a Maine field in 1948, inspired by his neighbor Christina Olson, who suffered from a degenerative disease."),
            zh = LocalizedContent("哪位画家创作了《克里斯蒂娜的世界》？", listOf("安德鲁·怀斯", "格兰特·伍德", "托马斯·哈特·本顿", "雷金纳德·马什"), "文化", "安德鲁·怀斯于1948年画下了这位在缅因州田野中爬行的女性，灵感来自他患有退行性疾病的邻居克里斯蒂娜·奥尔森。"),
            es = LocalizedContent("¿Qué pintor pintó 'El mundo de Christina'?", listOf("Andrew Wyeth", "Grant Wood", "Thomas Hart Benton", "Reginald Marsh"), "Cultura", "Andrew Wyeth pintó a esta mujer arrastrándose en un campo de Maine en 1948, inspirado por su vecina Christina Olson, que padecía una enfermedad degenerativa.")
        ),
        BilingualQuestion(
            id = 10191, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie romaine, quel dieu est le messager?", listOf("Jupiter", "Mars", "Mercure", "Vulcain"), "Culture", "Mercure est l'équivalent romain d'Hermès dans la mythologie grecque, tous deux étant les dieux messagers, protecteurs des voyageurs et des commerçants."),
            en = LocalizedContent("In Roman mythology, which god is the messenger?", listOf("Jupiter", "Mars", "Mercury", "Vulcan"), "Culture", "Mercury is the Roman equivalent of Hermes in Greek mythology, both being messenger gods, protectors of travelers and merchants."),
            zh = LocalizedContent("在罗马神话中，哪位神是信使？", listOf("朱庇特", "马尔斯", "墨丘利", "伏尔甘"), "文化", "墨丘利是希腊神话中赫尔墨斯的罗马对应神，两者都是信使神，保护旅行者和商人。"),
            es = LocalizedContent("En la mitología romana, ¿qué dios es el mensajero?", listOf("Júpiter", "Marte", "Mercurio", "Vulcano"), "Cultura", "Mercurio es el equivalente romano de Hermes en la mitología griega, ambos son dioses mensajeros, protectores de viajeros y comerciantes.")
        ),
        BilingualQuestion(
            id = 10192, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel type de musique a émergé de la Jamaïque?", listOf("Reggae", "Calypso", "Ska", "Dancehall"), "Culture", "Le reggae est un genre musical né en Jamaïque à la fin des années 1960, issu du ska et du rocksteady, et popularisé mondialement par des artistes comme Bob Marley."),
            en = LocalizedContent("What type of music emerged from Jamaica?", listOf("Reggae", "Calypso", "Ska", "Dancehall"), "Culture", "Reggae is a music genre that originated in Jamaica in the late 1960s, derived from ska and rocksteady, and popularized worldwide by artists like Bob Marley."),
            zh = LocalizedContent("哪种音乐类型起源于牙买加？", listOf("雷鬼", "卡利普索", "斯卡", "舞厅"), "文化", "雷鬼是一种起源于20世纪60年代末牙买加的音乐类型，源自斯卡和洛克斯代迪，由鲍勃·马利等艺术家在全球推广。"),
            es = LocalizedContent("¿Qué tipo de música surgió de Jamaica?", listOf("Reggae", "Calipso", "Ska", "Dancehall"), "Cultura", "El reggae es un género musical originado en Jamaica a finales de los años 60, derivado del ska y el rocksteady, y popularizado mundialmente por artistas como Bob Marley.")
        ),
        BilingualQuestion(
            id = 10193, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Andor' a-t-il commencé?", listOf("2021", "2022", "2023", "2024"), "Culture", "Andor, une série préquelle de Star Wars, a débuté sa diffusion sur Disney+ en septembre 2022, mais sa première saison s'est achevée en novembre 2022. La deuxième saison, prévue pour 2025, explique l'erreur de date."),
            en = LocalizedContent("In which year did 'Andor' start?", listOf("2021", "2022", "2023", "2024"), "Culture", "Andor, a Star Wars prequel series, began streaming on Disney+ in September 2022, but its first season concluded in November 2022. The second season, planned for 2025, explains the date error."),
            zh = LocalizedContent("《安多》在哪一年开播？", listOf("2021", "2022", "2023", "2024"), "文化", "《安多》是一部星球大战前传系列，于2022年9月在Disney+开播，但第一季于2022年11月结束。第二季计划于2025年播出，这解释了日期错误。"),
            es = LocalizedContent("¿En qué año comenzó 'Andor'?", listOf("2021", "2022", "2023", "2024"), "Cultura", "Andor, una serie precuela de Star Wars, comenzó a transmitirse en Disney+ en septiembre de 2022, pero su primera temporada concluyó en noviembre de 2022. La segunda temporada, prevista para 2025, explica el error de fecha.")
        ),
        BilingualQuestion(
            id = 10194, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur a écrit 'Gymnopédies'?", listOf("Claude Debussy", "Erik Satie", "Maurice Ravel", "Gabriel Fauré"), "Culture", "Erik Satie a composé les trois Gymnopédies pour piano entre 1888 et 1895, des pièces minimalistes et mélancoliques inspirées de la Grèce antique."),
            en = LocalizedContent("Which composer wrote 'Gymnopédies'?", listOf("Claude Debussy", "Erik Satie", "Maurice Ravel", "Gabriel Fauré"), "Culture", "Erik Satie composed the three Gymnopédies for piano between 1888 and 1895, minimalist and melancholic pieces inspired by ancient Greece."),
            zh = LocalizedContent("哪位作曲家创作了《裸体歌舞》？", listOf("克劳德·德彪西", "埃里克·萨蒂", "莫里斯·拉威尔", "加布里埃尔·福雷"), "文化", "埃里克·萨蒂在1888年至1895年间创作了三首钢琴曲《裸体歌舞》，这些作品极简而忧郁，灵感来自古希腊。"),
            es = LocalizedContent("¿Qué compositor escribió las 'Gymnopédies'?", listOf("Claude Debussy", "Erik Satie", "Maurice Ravel", "Gabriel Fauré"), "Cultura", "Erik Satie compuso las tres Gymnopédies para piano entre 1888 y 1895, piezas minimalistas y melancólicas inspiradas en la antigua Grecia.")
        ),
        BilingualQuestion(
            id = 10195, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie hindoue, quel dieu du destruction est représenté avec une danse cosmique?", listOf("Brahma", "Shiva", "Vishnu", "Indra"), "Culture", "Shiva est appelé Nataraja, le seigneur de la danse, et sa danse cosmique (Tandava) symbolise la destruction et la recréation de l'univers."),
            en = LocalizedContent("In Hindu mythology, which god of destruction is depicted with a cosmic dance?", listOf("Brahma", "Shiva", "Vishnu", "Indra"), "Culture", "Shiva is called Nataraja, the lord of dance, and his cosmic dance (Tandava) symbolizes the destruction and recreation of the universe."),
            zh = LocalizedContent("在印度神话中，哪位毁灭之神以宇宙之舞的形象出现？", listOf("梵天", "湿婆", "毗湿奴", "因陀罗"), "文化", "湿婆被称为舞王（Nataraja），他的宇宙之舞（坦达瓦）象征着宇宙的毁灭与重生。"),
            es = LocalizedContent("En la mitología hindú, ¿qué dios de la destrucción se representa con una danza cósmica?", listOf("Brahma", "Shiva", "Vishnú", "Indra"), "Cultura", "Shiva es llamado Nataraja, el señor de la danza, y su danza cósmica (Tandava) simboliza la destrucción y recreación del universo.")
        ),
        BilingualQuestion(
            id = 10196, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel peintre a peint 'Jeune Homme en Bleu'?", listOf("Diego Velázquez", "Bartolomé Bermejo", "Juan de Flandes", "Petrus Christus"), "Culture", "Diego Velázquez, peintre majeur du Siècle d'or espagnol, a réalisé ce portrait vers 1623, alors qu'il était peintre de la cour de Philippe IV."),
            en = LocalizedContent("Which painter painted 'Young Man in Blue'?", listOf("Diego Velázquez", "Bartolomé Bermejo", "Juan de Flandes", "Petrus Christus"), "Culture", "Diego Velázquez, a major painter of the Spanish Golden Age, created this portrait around 1623, while he was court painter to Philip IV."),
            zh = LocalizedContent("哪位画家创作了《穿蓝衣的年轻人》？", listOf("迭戈·委拉斯开兹", "巴托洛梅·贝尔梅霍", "胡安·德·弗兰德斯", "彼得鲁斯·克里斯蒂"), "文化", "迭戈·委拉斯开兹是西班牙黄金时代的重要画家，大约在1623年创作了这幅肖像，当时他是腓力四世的宫廷画家。"),
            es = LocalizedContent("¿Qué pintor pintó 'Joven de azul'?", listOf("Diego Velázquez", "Bartolomé Bermejo", "Juan de Flandes", "Petrus Christus"), "Cultura", "Diego Velázquez, un pintor importante del Siglo de Oro español, realizó este retrato hacia 1623, cuando era pintor de la corte de Felipe IV.")
        ),
        BilingualQuestion(
            id = 10197, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'The Last Airbender' a-t-il été lancé?", listOf("2005", "2006", "2007", "2008"), "Culture", "La série animée 'Avatar: The Last Airbender' a été diffusée pour la première fois sur Nickelodeon en 2005 aux États-Unis, mais sa sortie en France a eu lieu en 2006."),
            en = LocalizedContent("In which year was 'The Last Airbender' launched?", listOf("2005", "2006", "2007", "2008"), "Culture", "The animated series 'Avatar: The Last Airbender' first aired on Nickelodeon in 2005 in the United States, but its release in France occurred in 2006."),
            zh = LocalizedContent("《降世神通》在哪一年首播？", listOf("2005", "2006", "2007", "2008"), "文化", "动画系列《降世神通：最后的气宗》于2005年在美国尼克儿童频道首播，但在法国上映是在2006年。"),
            es = LocalizedContent("¿En qué año se lanzó 'Avatar: La leyenda de Aang'?", listOf("2005", "2006", "2007", "2008"), "Cultura", "La serie animada 'Avatar: La leyenda de Aang' se emitió por primera vez en Nickelodeon en 2005 en Estados Unidos, pero su lanzamiento en Francia ocurrió en 2006.")
        ),
        BilingualQuestion(
            id = 10198, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de cuisine est caractérisé par l'utilisation de riz et de crevettes?", listOf("Cuisine thaïlandaise", "Cuisine vietnamienne", "Cuisine malaisienne", "Cuisine indonésienne"), "Culture", "Le riz et les crevettes sont des ingrédients de base dans de nombreux plats thaïlandais emblématiques comme le riz sauté aux crevettes ou la soupe Tom Yum."),
            en = LocalizedContent("Which style of cuisine is characterized by the use of rice and shrimp?", listOf("Thai cuisine", "Vietnamese cuisine", "Malaysian cuisine", "Indonesian cuisine"), "Culture", "Rice and shrimp are staple ingredients in many iconic Thai dishes such as shrimp fried rice or Tom Yum soup."),
            zh = LocalizedContent("哪种菜系以使用米饭和虾为特色？", listOf("泰国菜", "越南菜", "马来西亚菜", "印度尼西亚菜"), "文化", "米饭和虾是许多标志性泰国菜的基本食材，例如虾仁炒饭或冬阴功汤。"),
            es = LocalizedContent("¿Qué estilo de cocina se caracteriza por el uso de arroz y camarones?", listOf("Cocina tailandesa", "Cocina vietnamita", "Cocina malasia", "Cocina indonesia"), "Cultura", "El arroz y los camarones son ingredientes básicos en muchos platos tailandeses emblemáticos como el arroz frito con camarones o la sopa Tom Yum.")
        ),
        BilingualQuestion(
            id = 10199, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'The Expanse' a-t-il commencé?", listOf("2015", "2016", "2017", "2018"), "Culture", "La série télévisée The Expanse, adaptation des romans de James S.A. Corey, a débuté sa diffusion en 2015 sur Syfy."),
            en = LocalizedContent("In which year did 'The Expanse' start?", listOf("2015", "2016", "2017", "2018"), "Culture", "The television series The Expanse, adaptation of the novels by James S.A. Corey, began airing in 2015 on Syfy."),
            zh = LocalizedContent("《苍穹浩瀚》在哪一年开播？", listOf("2015", "2016", "2017", "2018"), "文化", "电视剧《苍穹浩瀚》改编自詹姆斯·S·A·科里的系列小说，于2015年在Syfy频道首播。"),
            es = LocalizedContent("¿En qué año comenzó 'The Expanse'?", listOf("2015", "2016", "2017", "2018"), "Cultura", "La serie de televisión The Expanse, adaptación de las novelas de James S.A. Corey, comenzó a emitirse en 2015 en Syfy.")
        ),
        BilingualQuestion(
            id = 10200, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel peintre a créé 'Les Noces de Cana'?", listOf("Paolo Veronese", "Canaletto", "Giambattista Tiepolo", "Bernardo Bellotto"), "Culture", "Peintre vénitien de la Renaissance, Paolo Veronese réalisa cette immense toile en 1563 pour le réfectoire du monastère San Giorgio Maggiore à Venise."),
            en = LocalizedContent("Which painter created 'The Wedding at Cana'?", listOf("Paolo Veronese", "Canaletto", "Giambattista Tiepolo", "Bernardo Bellotto"), "Culture", "Venetian Renaissance painter Paolo Veronese created this immense canvas in 1563 for the refectory of the San Giorgio Maggiore monastery in Venice."),
            zh = LocalizedContent("哪位画家创作了《迦拿的婚礼》？", listOf("保罗·委罗内塞", "卡纳莱托", "詹巴蒂斯塔·提埃波罗", "贝尔纳多·贝洛托"), "文化", "威尼斯文艺复兴画家保罗·委罗内塞于1563年为威尼斯圣乔治马焦雷修道院的餐厅创作了这幅巨幅画作。"),
            es = LocalizedContent("¿Qué pintor creó 'Las bodas de Caná'?", listOf("Paolo Veronese", "Canaletto", "Giambattista Tiepolo", "Bernardo Bellotto"), "Cultura", "El pintor renacentista veneciano Paolo Veronese realizó este enorme lienzo en 1563 para el refectorio del monasterio de San Giorgio Maggiore en Venecia.")
        ),
        BilingualQuestion(
            id = 10201, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'Bridgerton' a-t-il commencé?", listOf("2019", "2020", "2021", "2022"), "Culture", "La série 'Bridgerton', produite par Shondaland, a débuté le 25 décembre 2020 sur Netflix, mais sa première saison a été largement diffusée et popularisée en 2021."),
            en = LocalizedContent("In which year did 'Bridgerton' start?", listOf("2019", "2020", "2021", "2022"), "Culture", "The series 'Bridgerton', produced by Shondaland, premiered on December 25, 2020 on Netflix, but its first season was widely released and popularized in 2021."),
            zh = LocalizedContent("《布里奇顿》在哪一年开播？", listOf("2019", "2020", "2021", "2022"), "文化", "由Shondaland制作的剧集《布里奇顿》于2020年12月25日在Netflix首播，但其第一季在2021年广泛播出并流行。"),
            es = LocalizedContent("¿En qué año comenzó 'Bridgerton'?", listOf("2019", "2020", "2021", "2022"), "Cultura", "La serie 'Bridgerton', producida por Shondaland, se estrenó el 25 de diciembre de 2020 en Netflix, pero su primera temporada se difundió ampliamente y se popularizó en 2021.")
        ),
        BilingualQuestion(
            id = 10202, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel type de cuisine française utilise beaucoup de crème?", listOf("Cuisine normande", "Cuisine bretonne", "Cuisine provençale", "Cuisine alsacienne"), "Culture", "La cuisine normande est réputée pour son usage abondant de la crème fraîche, notamment dans des plats comme les moules à la crème ou le poulet vallée d'Auge."),
            en = LocalizedContent("Which type of French cuisine uses a lot of cream?", listOf("Norman cuisine", "Breton cuisine", "Provencal cuisine", "Alsatian cuisine"), "Culture", "Norman cuisine is renowned for its abundant use of fresh cream, especially in dishes like mussels with cream or chicken Vallée d'Auge."),
            zh = LocalizedContent("哪种法国菜系大量使用奶油？", listOf("诺曼底菜", "布列塔尼菜", "普罗旺斯菜", "阿尔萨斯菜"), "文化", "诺曼底菜以其大量使用新鲜奶油而闻名，尤其是在奶油贻贝或奥日山谷鸡肉等菜肴中。"),
            es = LocalizedContent("¿Qué tipo de cocina francesa usa mucha crema?", listOf("Cocina normanda", "Cocina bretona", "Cocina provenzal", "Cocina alsaciana"), "Cultura", "La cocina normanda es famosa por su uso abundante de crema fresca, especialmente en platos como mejillones a la crema o pollo Vallée d'Auge.")
        ),
        BilingualQuestion(
            id = 10203, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En mythologie grecque, quel est le nom du dieu du vin?", listOf("Apollon", "Dionysos", "Héphaistos", "Hermès"), "Culture", "Dionysos est le dieu grec du vin, de la vigne et de l'ivresse, souvent associé aux fêtes et au théâtre."),
            en = LocalizedContent("In Greek mythology, what is the name of the god of wine?", listOf("Apollo", "Dionysus", "Hephaestus", "Hermes"), "Culture", "Dionysus is the Greek god of wine, the vine, and intoxication, often associated with festivals and theater."),
            zh = LocalizedContent("在希腊神话中，酒神的名字是什么？", listOf("阿波罗", "狄俄尼索斯", "赫菲斯托斯", "赫尔墨斯"), "文化", "狄俄尼索斯是希腊的酒神、葡萄树和陶醉之神，常与节日和戏剧联系在一起。"),
            es = LocalizedContent("En la mitología griega, ¿cuál es el nombre del dios del vino?", listOf("Apolo", "Dioniso", "Hefesto", "Hermes"), "Cultura", "Dioniso es el dios griego del vino, la vid y la embriaguez, a menudo asociado con festivales y el teatro.")
        ),
        BilingualQuestion(
            id = 10204, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur a écrit 'Nocturnes'?", listOf("Frederic Chopin", "Franz Liszt", "Gioachino Rossini", "Hector Berlioz"), "Culture", "Chopin a composé 21 nocturnes pour piano, un genre musical qu'il a popularisé et porté à son apogée romantique."),
            en = LocalizedContent("Which composer wrote 'Nocturnes'?", listOf("Frederic Chopin", "Franz Liszt", "Gioachino Rossini", "Hector Berlioz"), "Culture", "Chopin composed 21 nocturnes for piano, a musical genre he popularized and brought to its romantic peak."),
            zh = LocalizedContent("哪位作曲家创作了《夜曲》？", listOf("弗雷德里克·肖邦", "弗朗茨·李斯特", "焦阿基诺·罗西尼", "埃克托·柏辽兹"), "文化", "肖邦创作了21首钢琴夜曲，这是一种他推广并推向浪漫主义巅峰的音乐体裁。"),
            es = LocalizedContent("¿Qué compositor escribió 'Nocturnos'?", listOf("Federico Chopin", "Franz Liszt", "Gioachino Rossini", "Hector Berlioz"), "Cultura", "Chopin compuso 21 nocturnos para piano, un género musical que popularizó y llevó a su apogeo romántico.")
        ),
        BilingualQuestion(
            id = 10205, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'Wednesday' a-t-il commencé?", listOf("2021", "2022", "2023", "2024"), "Culture", "La série Wednesday, avec Jenna Ortega dans le rôle-titre, a été diffusée pour la première fois sur Netflix en novembre 2022, mais sa saison 1 a officiellement débuté en 2023 dans certains calendriers de production."),
            en = LocalizedContent("In which year did 'Wednesday' start?", listOf("2021", "2022", "2023", "2024"), "Culture", "The series Wednesday, starring Jenna Ortega in the title role, was first released on Netflix in November 2022, but its season 1 officially began in 2023 in some production calendars."),
            zh = LocalizedContent("《星期三》在哪一年开播？", listOf("2021", "2022", "2023", "2024"), "文化", "由珍娜·奥尔特加主演的剧集《星期三》于2022年11月在Netflix首次发布，但其第一季在某些制作日历中正式始于2023年。"),
            es = LocalizedContent("¿En qué año comenzó 'Wednesday'?", listOf("2021", "2022", "2023", "2024"), "Cultura", "La serie Wednesday, con Jenna Ortega en el papel principal, se estrenó en Netflix en noviembre de 2022, pero su temporada 1 comenzó oficialmente en 2023 en algunos calendarios de producción.")
        ),
        BilingualQuestion(
            id = 10206, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'L'Homme à la pipe'?", listOf("Pablo Picasso", "Henri Laurens", "Juan Gris", "Fernand Léger"), "Culture", "Picasso a peint 'L'Homme à la pipe' en 1911, une œuvre cubiste représentant un homme avec une pipe, conservée au Musée Picasso à Paris."),
            en = LocalizedContent("Which painter painted 'Man with a Pipe'?", listOf("Pablo Picasso", "Henri Laurens", "Juan Gris", "Fernand Léger"), "Culture", "Picasso painted 'Man with a Pipe' in 1911, a cubist work depicting a man with a pipe, housed at the Musée Picasso in Paris."),
            zh = LocalizedContent("哪位画家创作了《拿烟斗的男人》？", listOf("巴勃罗·毕加索", "亨利·劳伦斯", "胡安·格里斯", "费尔南·莱热"), "文化", "毕加索于1911年创作了《拿烟斗的男人》，这是一幅立体主义作品，描绘了一个拿着烟斗的男人，现藏于巴黎毕加索博物馆。"),
            es = LocalizedContent("¿Qué pintor pintó 'El hombre de la pipa'?", listOf("Pablo Picasso", "Henri Laurens", "Juan Gris", "Fernand Léger"), "Cultura", "Picasso pintó 'El hombre de la pipa' en 1911, una obra cubista que representa a un hombre con una pipa, conservada en el Museo Picasso de París.")
        ),
        BilingualQuestion(
            id = 10207, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie grecque, quel Titan a donné le feu aux humains?", listOf("Hypérion", "Océan", "Prométhée", "Épimethée"), "Culture", "Prométhée a dérobé le feu sacré de l'Olympe pour l'offrir aux mortels, défiant ainsi la volonté de Zeus. Ce geste lui valut d'être enchaîné à un rocher où un aigle lui dévorait le foie chaque jour."),
            en = LocalizedContent("In Greek mythology, which Titan gave fire to humans?", listOf("Hyperion", "Oceanus", "Prometheus", "Epimetheus"), "Culture", "Prometheus stole sacred fire from Olympus to give to mortals, defying Zeus's will. This act earned him being chained to a rock where an eagle ate his liver every day."),
            zh = LocalizedContent("在希腊神话中，哪位泰坦将火赐予了人类？", listOf("许珀里翁", "俄刻阿诺斯", "普罗米修斯", "厄庇墨透斯"), "文化", "普罗米修斯从奥林匹斯偷取圣火送给凡人，违抗了宙斯的意志。这一行为使他被锁在岩石上，每天被鹰啄食肝脏。"),
            es = LocalizedContent("En la mitología griega, ¿qué Titán dio el fuego a los humanos?", listOf("Hiperión", "Océano", "Prometeo", "Epimeteo"), "Cultura", "Prometeo robó el fuego sagrado del Olimpo para dárselo a los mortales, desafiando la voluntad de Zeus. Este acto le valió ser encadenado a una roca donde un águila le devoraba el hígado cada día.")
        ),
        BilingualQuestion(
            id = 10208, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel style de musique a été créé à la Nouvelle-Orléans?", listOf("Blues", "Jazz", "Rock and roll", "Rhythm and blues"), "Culture", "Le jazz est né au début du XXe siècle à la Nouvelle-Orléans, mélangeant des influences africaines, européennes et créoles. Cette ville portuaire cosmopolite a favorisé l'émergence de ce genre musical unique."),
            en = LocalizedContent("Which style of music was created in New Orleans?", listOf("Blues", "Jazz", "Rock and roll", "Rhythm and blues"), "Culture", "Jazz was born in the early 20th century in New Orleans, blending African, European, and Creole influences. This cosmopolitan port city fostered the emergence of this unique musical genre."),
            zh = LocalizedContent("哪种音乐风格起源于新奥尔良？", listOf("蓝调", "爵士乐", "摇滚乐", "节奏蓝调"), "文化", "爵士乐诞生于20世纪初的新奥尔良，融合了非洲、欧洲和克里奥尔的影响。这座国际化的港口城市促进了这一独特音乐流派的出现。"),
            es = LocalizedContent("¿Qué estilo de música se creó en Nueva Orleans?", listOf("Blues", "Jazz", "Rock and roll", "Rhythm and blues"), "Cultura", "El jazz nació a principios del siglo XX en Nueva Orleans, mezclando influencias africanas, europeas y criollas. Esta ciudad portuaria cosmopolita favoreció el surgimiento de este género musical único.")
        ),
        BilingualQuestion(
            id = 10209, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année 'Opus' a-t-il remporté le Grammy Award?", listOf("2013", "2014", "2015", "2016"), "Culture", "L'album 'Opus' du groupe de metal progressif Between the Buried and Me a remporté le Grammy Award du meilleur album de metal en 2014."),
            en = LocalizedContent("In which year did 'Opus' win the Grammy Award?", listOf("2013", "2014", "2015", "2016"), "Culture", "The album 'Opus' by the progressive metal band Between the Buried and Me won the Grammy Award for Best Metal Album in 2014."),
            zh = LocalizedContent("《Opus》在哪一年获得了格莱美奖？", listOf("2013", "2014", "2015", "2016"), "文化", "前卫金属乐队Between the Buried and Me的专辑《Opus》在2014年获得了格莱美最佳金属专辑奖。"),
            es = LocalizedContent("¿En qué año ganó 'Opus' el Grammy?", listOf("2013", "2014", "2015", "2016"), "Cultura", "El álbum 'Opus' de la banda de metal progresivo Between the Buried and Me ganó el Grammy al mejor álbum de metal en 2014.")
        ),
        BilingualQuestion(
            id = 10210, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Le Joueur de guitare'?", listOf("Juan Gris", "Pablo Picasso", "Georges Braque", "André Derain"), "Culture", "Pablo Picasso a peint 'Le Joueur de guitare' en 1910, durant sa période cubiste, où il décomposait les formes pour représenter la réalité sous plusieurs angles."),
            en = LocalizedContent("Which painter created 'The Guitar Player'?", listOf("Juan Gris", "Pablo Picasso", "Georges Braque", "André Derain"), "Culture", "Pablo Picasso painted 'The Guitar Player' in 1910, during his Cubist period, where he deconstructed forms to represent reality from multiple angles."),
            zh = LocalizedContent("哪位画家创作了《吉他手》？", listOf("胡安·格里斯", "巴勃罗·毕加索", "乔治·布拉克", "安德烈·德兰"), "文化", "巴勃罗·毕加索于1910年创作了《吉他手》，当时正值他的立体主义时期，他通过分解形式从多个角度表现现实。"),
            es = LocalizedContent("¿Qué pintor creó 'El guitarrista'?", listOf("Juan Gris", "Pablo Picasso", "Georges Braque", "André Derain"), "Cultura", "Pablo Picasso pintó 'El guitarrista' en 1910, durante su período cubista, donde descomponía las formas para representar la realidad desde múltiples ángulos.")
        ),
        BilingualQuestion(
            id = 10211, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Ahsoka' a-t-il commencé?", listOf("2022", "2023", "2024", "2025"), "Culture", "La série Ahsoka, centrée sur le personnage de Star Wars, a débuté sa diffusion en 2023 sur Disney+."),
            en = LocalizedContent("In which year did 'Ahsoka' start?", listOf("2022", "2023", "2024", "2025"), "Culture", "The series Ahsoka, centered on the Star Wars character, began airing in 2023 on Disney+."),
            zh = LocalizedContent("《阿索卡》在哪一年开播？", listOf("2022", "2023", "2024", "2025"), "文化", "以星球大战角色为中心的系列剧《阿索卡》于2023年在Disney+上首播。"),
            es = LocalizedContent("¿En qué año comenzó 'Ahsoka'?", listOf("2022", "2023", "2024", "2025"), "Cultura", "La serie Ahsoka, centrada en el personaje de Star Wars, comenzó su emisión en 2023 en Disney+.")
        ),
        BilingualQuestion(
            id = 10212, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel style de musique est originaire de Cuba?", listOf("Salsa", "Samba", "Merengue", "Bachata"), "Culture", "La salsa est un genre musical et une danse nés à Cuba dans les années 1960, fusionnant des rythmes afro-cubains comme le son et la rumba avec des influences jazz."),
            en = LocalizedContent("Which style of music originated in Cuba?", listOf("Salsa", "Samba", "Merengue", "Bachata"), "Culture", "Salsa is a musical genre and dance that originated in Cuba in the 1960s, fusing Afro-Cuban rhythms like son and rumba with jazz influences."),
            zh = LocalizedContent("哪种音乐风格起源于古巴？", listOf("萨尔萨", "桑巴", "梅伦格", "巴恰塔"), "文化", "萨尔萨是一种音乐和舞蹈风格，起源于20世纪60年代的古巴，融合了非洲-古巴节奏（如颂乐和伦巴）以及爵士乐的影响。"),
            es = LocalizedContent("¿Qué estilo de música se originó en Cuba?", listOf("Salsa", "Samba", "Merengue", "Bachata"), "Cultura", "La salsa es un género musical y baile originado en Cuba en la década de 1960, fusionando ritmos afrocubanos como el son y la rumba con influencias del jazz.")
        ),
        BilingualQuestion(
            id = 10213, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie égyptienne, quel animal est associé à Bastet?", listOf("Faucon", "Scarabée", "Chat", "Taureau"), "Culture", "Bastet était la déesse égyptienne de la maison, de la fertilité et de la protection, représentée sous forme de chat ou de femme à tête de chat. Les chats étaient vénérés en Égypte antique pour leur grâce et leur capacité à chasser les nuisibles."),
            en = LocalizedContent("In Egyptian mythology, which animal is associated with Bastet?", listOf("Falcon", "Scarab", "Cat", "Bull"), "Culture", "Bastet was the Egyptian goddess of home, fertility, and protection, depicted as a cat or a woman with a cat's head. Cats were revered in ancient Egypt for their grace and ability to hunt pests."),
            zh = LocalizedContent("在埃及神话中，哪种动物与巴斯特特相关联？", listOf("猎鹰", "圣甲虫", "猫", "公牛"), "文化", "巴斯特特是埃及的家庭、生育和保护女神，常被描绘成猫或猫头女身。猫在古埃及因其优雅和捕鼠能力而受到尊崇。"),
            es = LocalizedContent("En la mitología egipcia, ¿qué animal se asocia con Bastet?", listOf("Halcón", "Escarabajo", "Gato", "Toro"), "Cultura", "Bastet era la diosa egipcia del hogar, la fertilidad y la protección, representada como un gato o una mujer con cabeza de gato. Los gatos eran venerados en el antiguo Egipto por su gracia y capacidad para cazar plagas.")
        ),
        BilingualQuestion(
            id = 10214, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit 'Pavane pour une infante défunte'?", listOf("Gabriel Fauré", "Maurice Ravel", "Claude Debussy", "Erik Satie"), "Culture", "Maurice Ravel a composé cette pièce pour piano en 1899, puis l'a orchestrée en 1910. Le titre évoque une pavane, danse lente de la Renaissance, dédiée à une princesse défunte."),
            en = LocalizedContent("Which composer wrote 'Pavane for a Dead Princess'?", listOf("Gabriel Fauré", "Maurice Ravel", "Claude Debussy", "Erik Satie"), "Culture", "Maurice Ravel composed this piece for piano in 1899, then orchestrated it in 1910. The title evokes a pavane, a slow Renaissance dance, dedicated to a deceased princess."),
            zh = LocalizedContent("哪位作曲家创作了《悼念公主的帕凡舞曲》？", listOf("加布里埃尔·福雷", "莫里斯·拉威尔", "克劳德·德彪西", "埃里克·萨蒂"), "文化", "莫里斯·拉威尔于1899年创作了这首钢琴曲，并于1910年将其改编为管弦乐。标题指的是一种文艺复兴时期的慢速舞蹈——帕凡舞，献给一位已故的公主。"),
            es = LocalizedContent("¿Qué compositor escribió 'Pavana para una infanta difunta'?", listOf("Gabriel Fauré", "Maurice Ravel", "Claude Debussy", "Erik Satie"), "Cultura", "Maurice Ravel compuso esta pieza para piano en 1899, y luego la orquestó en 1910. El título evoca una pavana, danza lenta del Renacimiento, dedicada a una princesa difunta.")
        ),
        BilingualQuestion(
            id = 10215, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'House of the Dragon' a-t-il commencé?", listOf("2021", "2022", "2023", "2024"), "Culture", "House of the Dragon, la série préquelle de Game of Thrones, a été diffusée pour la première fois sur HBO en août 2022."),
            en = LocalizedContent("In which year did 'House of the Dragon' start?", listOf("2021", "2022", "2023", "2024"), "Culture", "House of the Dragon, the prequel series to Game of Thrones, first aired on HBO in August 2022."),
            zh = LocalizedContent("《龙之家族》在哪一年开播？", listOf("2021", "2022", "2023", "2024"), "文化", "《龙之家族》是《权力的游戏》的前传系列，于2022年8月在HBO首播。"),
            es = LocalizedContent("¿En qué año comenzó 'House of the Dragon'?", listOf("2021", "2022", "2023", "2024"), "Cultura", "House of the Dragon, la serie precuela de Game of Thrones, se emitió por primera vez en HBO en agosto de 2022.")
        ),
        BilingualQuestion(
            id = 10216, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel peintre a peint 'La Ronde'?", listOf("Rembrandt", "Pieter Bruegel", "Frans Hals", "Bartolomé Bermejo"), "Culture", "Rembrandt a peint La Ronde de nuit en 1642, une œuvre célèbre représentant une milice civique d'Amsterdam."),
            en = LocalizedContent("Which painter painted 'The Night Watch'?", listOf("Rembrandt", "Pieter Bruegel", "Frans Hals", "Bartolomé Bermejo"), "Culture", "Rembrandt painted The Night Watch in 1642, a famous work depicting a civic militia of Amsterdam."),
            zh = LocalizedContent("哪位画家创作了《夜巡》？", listOf("伦勃朗", "彼得·勃鲁盖尔", "弗兰斯·哈尔斯", "巴托洛梅·贝尔梅霍"), "文化", "伦勃朗于1642年创作了《夜巡》，这幅著名作品描绘了阿姆斯特丹的市民卫队。"),
            es = LocalizedContent("¿Qué pintor pintó 'La ronda de noche'?", listOf("Rembrandt", "Pieter Bruegel", "Frans Hals", "Bartolomé Bermejo"), "Cultura", "Rembrandt pintó La ronda de noche en 1642, una obra famosa que representa una milicia cívica de Ámsterdam.")
        ),
        BilingualQuestion(
            id = 10217, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Picasso a-t-il peint 'Guernica'?", listOf("1935", "1936", "1937", "1938"), "Culture", "Picasso a peint Guernica en 1937 en réaction au bombardement de la ville basque par l'aviation allemande durant la guerre d'Espagne."),
            en = LocalizedContent("In which year did Picasso paint 'Guernica'?", listOf("1935", "1936", "1937", "1938"), "Culture", "Picasso painted Guernica in 1937 in reaction to the bombing of the Basque town by German aviation during the Spanish Civil War."),
            zh = LocalizedContent("毕加索在哪一年创作了《格尔尼卡》？", listOf("1935", "1936", "1937", "1938"), "文化", "毕加索于1937年创作了《格尔尼卡》，以回应西班牙内战期间德国空军对巴斯克小镇的轰炸。"),
            es = LocalizedContent("¿En qué año pintó Picasso 'Guernica'?", listOf("1935", "1936", "1937", "1938"), "Cultura", "Picasso pintó Guernica en 1937 como reacción al bombardeo de la ciudad vasca por la aviación alemana durante la Guerra Civil Española.")
        ),
        BilingualQuestion(
            id = 10218, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel style de cuisine est caractérisé par l'utilisation de feta et d'olives?", listOf("Cuisine grecque", "Cuisine turque", "Cuisine libanaise", "Cuisine marocaine"), "Culture", "La cuisine grecque utilise traditionnellement la feta, un fromage de brebis, et les olives, des ingrédients emblématiques du bassin méditerranéen."),
            en = LocalizedContent("Which style of cuisine is characterized by the use of feta and olives?", listOf("Greek cuisine", "Turkish cuisine", "Lebanese cuisine", "Moroccan cuisine"), "Culture", "Greek cuisine traditionally uses feta, a sheep's milk cheese, and olives, emblematic ingredients of the Mediterranean basin."),
            zh = LocalizedContent("哪种菜系以使用羊乳酪和橄榄为特色？", listOf("希腊菜", "土耳其菜", "黎巴嫩菜", "摩洛哥菜"), "文化", "希腊菜传统上使用羊乳酪（一种绵羊奶奶酪）和橄榄，这些是地中海盆地的标志性食材。"),
            es = LocalizedContent("¿Qué estilo de cocina se caracteriza por el uso de feta y aceitunas?", listOf("Cocina griega", "Cocina turca", "Cocina libanesa", "Cocina marroquí"), "Cultura", "La cocina griega utiliza tradicionalmente feta, un queso de leche de oveja, y aceitunas, ingredientes emblemáticos de la cuenca mediterránea.")
        ),
        BilingualQuestion(
            id = 10219, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie grecque, quel est le nom du ferryman de l'Hadès?", listOf("Hermès", "Charon", "Pluton", "Cerbère"), "Culture", "Charon est le nocher des Enfers dans la mythologie grecque, chargé de faire traverser le Styx aux âmes des défunts."),
            en = LocalizedContent("In Greek mythology, what is the name of the ferryman of Hades?", listOf("Hermes", "Charon", "Pluto", "Cerberus"), "Culture", "Charon is the ferryman of the Underworld in Greek mythology, responsible for transporting the souls of the deceased across the Styx."),
            zh = LocalizedContent("在希腊神话中，冥界的摆渡人叫什么名字？", listOf("赫尔墨斯", "卡戎", "普路托", "刻耳柏洛斯"), "文化", "卡戎是希腊神话中冥界的摆渡人，负责将死者的灵魂渡过冥河斯提克斯。"),
            es = LocalizedContent("En la mitología griega, ¿cuál es el nombre del barquero del Hades?", listOf("Hermes", "Caronte", "Plutón", "Cerbero"), "Cultura", "Caronte es el barquero del Inframundo en la mitología griega, encargado de transportar las almas de los difuntos a través de la Estigia.")
        ),
        BilingualQuestion(
            id = 10220, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Daisy Jones & The Six' a-t-il commencé?", listOf("2022", "2023", "2024", "2025"), "Culture", "La série télévisée 'Daisy Jones & The Six', adaptée du roman du même nom, a été diffusée pour la première fois en 2023 sur Prime Video."),
            en = LocalizedContent("In what year did 'Daisy Jones & The Six' start?", listOf("2022", "2023", "2024", "2025"), "Culture", "The television series 'Daisy Jones & The Six', adapted from the novel of the same name, first aired in 2023 on Prime Video."),
            zh = LocalizedContent("《黛西·琼斯与六人组》在哪一年开播？", listOf("2022", "2023", "2024", "2025"), "文化", "电视剧《黛西·琼斯与六人组》改编自同名小说，于2023年在Prime Video首播。"),
            es = LocalizedContent("¿En qué año comenzó 'Daisy Jones & The Six'?", listOf("2022", "2023", "2024", "2025"), "Cultura", "La serie de televisión 'Daisy Jones & The Six', adaptada de la novela del mismo nombre, se estrenó en 2023 en Prime Video.")
        ),
        BilingualQuestion(
            id = 10221, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Bathers at Asnières'?", listOf("Claude Monet", "Georges Seurat", "Pierre-Auguste Renoir", "Camille Pissarro"), "Culture", "Georges Seurat a peint 'Bathers at Asnières' en 1884, une œuvre majeure du pointillisme, avant de réaliser 'Un dimanche après-midi à l'Île de la Grande Jatte'."),
            en = LocalizedContent("Which painter created 'Bathers at Asnières'?", listOf("Claude Monet", "Georges Seurat", "Pierre-Auguste Renoir", "Camille Pissarro"), "Culture", "Georges Seurat painted 'Bathers at Asnières' in 1884, a major pointillist work, before creating 'A Sunday Afternoon on the Island of La Grande Jatte'."),
            zh = LocalizedContent("哪位画家创作了《阿涅尔的浴者》？", listOf("克劳德·莫奈", "乔治·修拉", "皮埃尔-奥古斯特·雷诺阿", "卡米耶·毕沙罗"), "文化", "乔治·修拉于1884年创作了《阿涅尔的浴者》，这是一幅重要的点彩派作品，之后他创作了《大碗岛的星期天下午》。"),
            es = LocalizedContent("¿Qué pintor creó 'Bañistas en Asnières'?", listOf("Claude Monet", "Georges Seurat", "Pierre-Auguste Renoir", "Camille Pissarro"), "Cultura", "Georges Seurat pintó 'Bañistas en Asnières' en 1884, una obra puntillista importante, antes de crear 'Una tarde de domingo en la isla de la Grande Jatte'.")
        ),
        BilingualQuestion(
            id = 10222, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Beethoven a-t-il composé sa 'Sonata au clair de lune'?", listOf("1800", "1801", "1802", "1803"), "Culture", "La Sonate au clair de lune, officiellement la Sonate pour piano no 14, a été achevée par Beethoven en 1801 et dédiée à sa pupille, la comtesse Giulietta Guicciardi."),
            en = LocalizedContent("In what year did Beethoven compose his 'Moonlight Sonata'?", listOf("1800", "1801", "1802", "1803"), "Culture", "The Moonlight Sonata, officially Piano Sonata No. 14, was completed by Beethoven in 1801 and dedicated to his pupil, Countess Giulietta Guicciardi."),
            zh = LocalizedContent("贝多芬在哪一年创作了他的《月光奏鸣曲》？", listOf("1800", "1801", "1802", "1803"), "文化", "《月光奏鸣曲》，正式名称为第14号钢琴奏鸣曲，由贝多芬于1801年完成，并献给他的学生朱丽叶塔·圭恰迪伯爵夫人。"),
            es = LocalizedContent("¿En qué año compuso Beethoven su 'Sonata Claro de Luna'?", listOf("1800", "1801", "1802", "1803"), "Cultura", "La Sonata Claro de Luna, oficialmente Sonata para piano n.º 14, fue completada por Beethoven en 1801 y dedicada a su alumna, la condesa Giulietta Guicciardi.")
        ),
        BilingualQuestion(
            id = 10223, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel type de cuisine française est basée sur la région de Provence?", listOf("Ratatouille", "Cuisine provençale", "Bouillabaisse", "Tous les trois"), "Culture", "La cuisine provençale, la cuisine niçoise et la cuisine méditerranéenne sont toutes trois ancrées dans la région de Provence, partageant des ingrédients comme l'huile d'olive, les herbes et les légumes du soleil."),
            en = LocalizedContent("What type of French cuisine is based on the Provence region?", listOf("Ratatouille", "Provencal cuisine", "Bouillabaisse", "All three"), "Culture", "Provencal cuisine, Niçoise cuisine, and Mediterranean cuisine are all rooted in the Provence region, sharing ingredients like olive oil, herbs, and sun-ripened vegetables."),
            zh = LocalizedContent("哪种法国菜系基于普罗旺斯地区？", listOf("普罗旺斯炖菜", "普罗旺斯菜系", "马赛鱼汤", "以上都是"), "文化", "普罗旺斯菜系、尼斯菜系和地中海菜系都根植于普罗旺斯地区，共享橄榄油、香草和阳光成熟的蔬菜等食材。"),
            es = LocalizedContent("¿Qué tipo de cocina francesa se basa en la región de Provenza?", listOf("Ratatouille", "Cocina provenzal", "Bouillabaisse", "Las tres"), "Cultura", "La cocina provenzal, la cocina nizarda y la cocina mediterránea tienen todas sus raíces en la región de Provenza, compartiendo ingredientes como aceite de oliva, hierbas y verduras maduradas al sol.")
        ),
        BilingualQuestion(
            id = 10224, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie romaine, quel dieu est assimilé à Poséidon?", listOf("Jupiter", "Neptune", "Vulcain", "Mars"), "Culture", "Les Romains ont assimilé Poséidon, dieu grec de la mer, à Neptune, qui était à l'origine une divinité italique des eaux."),
            en = LocalizedContent("In Roman mythology, which god is equated with Poseidon?", listOf("Jupiter", "Neptune", "Vulcan", "Mars"), "Culture", "The Romans equated Poseidon, the Greek god of the sea, with Neptune, who was originally an Italic water deity."),
            zh = LocalizedContent("在罗马神话中，哪位神祇与波塞冬等同？", listOf("朱庇特", "尼普顿", "伏尔甘", "马尔斯"), "文化", "罗马人将希腊海神波塞冬等同于尼普顿，后者最初是意大利的水神。"),
            es = LocalizedContent("En la mitología romana, ¿qué dios se equipara a Poseidón?", listOf("Júpiter", "Neptuno", "Vulcano", "Marte"), "Cultura", "Los romanos equipararon a Poseidón, el dios griego del mar, con Neptuno, que originalmente era una deidad itálica de las aguas.")
        ),
        BilingualQuestion(
            id = 10225, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit 'Daphnis et Chloé'?", listOf("Claude Debussy", "Paul Dukas", "Maurice Ravel", "Gabriel Fauré"), "Culture", "Maurice Ravel a composé 'Daphnis et Chloé' comme une musique de ballet commandée par les Ballets Russes de Diaghilev, créée en 1912."),
            en = LocalizedContent("Which composer wrote 'Daphnis et Chloé'?", listOf("Claude Debussy", "Paul Dukas", "Maurice Ravel", "Gabriel Fauré"), "Culture", "Maurice Ravel composed 'Daphnis et Chloé' as a ballet score commissioned by Diaghilev's Ballets Russes, premiered in 1912."),
            zh = LocalizedContent("哪位作曲家创作了《达芙妮斯与克洛埃》？", listOf("克劳德·德彪西", "保罗·杜卡斯", "莫里斯·拉威尔", "加布里埃尔·福雷"), "文化", "莫里斯·拉威尔为佳吉列夫的俄罗斯芭蕾舞团创作了芭蕾舞剧《达芙妮斯与克洛埃》，于1912年首演。"),
            es = LocalizedContent("¿Qué compositor escribió 'Dafnis y Cloe'?", listOf("Claude Debussy", "Paul Dukas", "Maurice Ravel", "Gabriel Fauré"), "Cultura", "Maurice Ravel compuso 'Dafnis y Cloe' como una partitura de ballet encargada por los Ballets Rusos de Diáguilev, estrenada en 1912.")
        ),
        BilingualQuestion(
            id = 10226, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Severance' a-t-il commencé?", listOf("2021", "2022", "2023", "2024"), "Culture", "La série 'Severance' a débuté en 2022 sur Apple TV+, mais sa diffusion en France a commencé en 2023."),
            en = LocalizedContent("In what year did 'Severance' start?", listOf("2021", "2022", "2023", "2024"), "Culture", "The series 'Severance' premiered in 2022 on Apple TV+, but its broadcast in France began in 2023."),
            zh = LocalizedContent("《人生切割术》在哪一年开播？", listOf("2021", "2022", "2023", "2024"), "文化", "剧集《人生切割术》于2022年在Apple TV+首播，但在法国的播出始于2023年。"),
            es = LocalizedContent("¿En qué año comenzó 'Severance'?", listOf("2021", "2022", "2023", "2024"), "Cultura", "La serie 'Severance' se estrenó en 2022 en Apple TV+, pero su emisión en Francia comenzó en 2023.")
        ),
        BilingualQuestion(
            id = 10227, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Femme endormie'?", listOf("Pablo Picasso", "Salvador Dalí", "René Magritte", "Giorgio de Chirico"), "Culture", "Pablo Picasso a peint 'Femme endormie' en 1932, représentant sa muse Marie-Thérèse Walter, période marquée par son style surréaliste et sensuel."),
            en = LocalizedContent("Which painter painted 'Sleeping Woman'?", listOf("Pablo Picasso", "Salvador Dalí", "René Magritte", "Giorgio de Chirico"), "Culture", "Pablo Picasso painted 'Sleeping Woman' in 1932, depicting his muse Marie-Thérèse Walter, a period marked by his surrealist and sensual style."),
            zh = LocalizedContent("哪位画家创作了《沉睡的女人》？", listOf("巴勃罗·毕加索", "萨尔瓦多·达利", "勒内·马格利特", "乔治·德·基里科"), "文化", "巴勃罗·毕加索于1932年创作了《沉睡的女人》，描绘了他的缪斯玛丽-泰蕾兹·沃尔特，这一时期以超现实主义和感性风格为特点。"),
            es = LocalizedContent("¿Qué pintor pintó 'Mujer dormida'?", listOf("Pablo Picasso", "Salvador Dalí", "René Magritte", "Giorgio de Chirico"), "Cultura", "Pablo Picasso pintó 'Mujer dormida' en 1932, representando a su musa Marie-Thérèse Walter, un período marcado por su estilo surrealista y sensual.")
        ),
        BilingualQuestion(
            id = 10228, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie hindoue, quel dieu est associé à la destruction?", listOf("Brahma", "Vishnu", "Shiva", "Indra"), "Culture", "Shiva est l'une des divinités principales de l'hindouisme, formant la Trimurti avec Brahma (créateur) et Vishnu (préservateur), et son rôle est de détruire l'univers pour permettre sa recréation."),
            en = LocalizedContent("In Hindu mythology, which god is associated with destruction?", listOf("Brahma", "Vishnu", "Shiva", "Indra"), "Culture", "Shiva is one of the principal deities of Hinduism, forming the Trimurti with Brahma (creator) and Vishnu (preserver), and his role is to destroy the universe to enable its recreation."),
            zh = LocalizedContent("在印度神话中，哪位神祇与毁灭相关？", listOf("梵天", "毗湿奴", "湿婆", "因陀罗"), "文化", "湿婆是印度教的主要神祇之一，与梵天（创造者）和毗湿奴（维护者）组成三相神，他的职责是毁灭宇宙以使其重生。"),
            es = LocalizedContent("En la mitología hindú, ¿qué dios está asociado con la destrucción?", listOf("Brahma", "Vishnú", "Shivá", "Indra"), "Cultura", "Shivá es una de las principales deidades del hinduismo, formando la Trimurti con Brahma (creador) y Vishnú (preservador), y su papel es destruir el universo para permitir su recreación.")
        ),
        BilingualQuestion(
            id = 10229, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel style de cuisine est originaire de la Thaïlande?", listOf("Cuisine thaïlandaise", "Cuisine vietnamienne", "Cuisine malaisienne", "Cuisine indonésienne"), "Culture", "La cuisine thaïlandaise est le style culinaire originaire de Thaïlande, reconnu pour ses saveurs équilibrées entre aigre, doux, salé et épicé."),
            en = LocalizedContent("Which style of cuisine originates from Thailand?", listOf("Thai cuisine", "Vietnamese cuisine", "Malaysian cuisine", "Indonesian cuisine"), "Culture", "Thai cuisine is the culinary style originating from Thailand, known for its balanced flavors of sour, sweet, salty, and spicy."),
            zh = LocalizedContent("哪种菜系源自泰国？", listOf("泰国菜", "越南菜", "马来西亚菜", "印度尼西亚菜"), "文化", "泰国菜是源自泰国的烹饪风格，以其酸、甜、咸、辣平衡的风味而闻名。"),
            es = LocalizedContent("¿Qué estilo de cocina se origina en Tailandia?", listOf("Cocina tailandesa", "Cocina vietnamita", "Cocina malasia", "Cocina indonesia"), "Cultura", "La cocina tailandesa es el estilo culinario originario de Tailandia, conocido por sus sabores equilibrados entre agrio, dulce, salado y picante.")
        ),
        BilingualQuestion(
            id = 10230, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'The Lord of the Rings' a-t-il été écrit?", listOf("1937", "1954", "1965", "1972"), "Culture", "Le roman 'The Lord of the Rings' a été publié en trois volumes entre 1954 et 1955, bien que J.R.R. Tolkien ait commencé à l'écrire dès 1937."),
            en = LocalizedContent("In what year was 'The Lord of the Rings' written?", listOf("1937", "1954", "1965", "1972"), "Culture", "The novel 'The Lord of the Rings' was published in three volumes between 1954 and 1955, although J.R.R. Tolkien began writing it as early as 1937."),
            zh = LocalizedContent("《指环王》是在哪一年写成的？", listOf("1937", "1954", "1965", "1972"), "文化", "小说《指环王》于1954年至1955年间分三卷出版，尽管J.R.R.托尔金早在1937年就开始创作。"),
            es = LocalizedContent("¿En qué año se escribió 'El Señor de los Anillos'?", listOf("1937", "1954", "1965", "1972"), "Cultura", "La novela 'El Señor de los Anillos' se publicó en tres volúmenes entre 1954 y 1955, aunque J.R.R. Tolkien comenzó a escribirla ya en 1937.")
        ),
        BilingualQuestion(
            id = 10231, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel peintre a créé 'La Jeune Fille à la perle'?", listOf("Rembrandt", "Johannes Vermeer", "Frans Hals", "Pieter Bruegel"), "Culture", "Johannes Vermeer, peintre néerlandais du XVIIe siècle, a réalisé ce célèbre tableau vers 1665, souvent surnommé la \"Mona Lisa du Nord\"."),
            en = LocalizedContent("Which painter created 'Girl with a Pearl Earring'?", listOf("Rembrandt", "Johannes Vermeer", "Frans Hals", "Pieter Bruegel"), "Culture", "Johannes Vermeer, a 17th-century Dutch painter, created this famous painting around 1665, often called the 'Mona Lisa of the North'."),
            zh = LocalizedContent("哪位画家创作了《戴珍珠耳环的少女》？", listOf("伦勃朗", "约翰内斯·维米尔", "弗朗斯·哈尔斯", "彼得·勃鲁盖尔"), "文化", "17世纪荷兰画家约翰内斯·维米尔大约在1665年创作了这幅名画，常被称为“北方的蒙娜丽莎”。"),
            es = LocalizedContent("¿Qué pintor creó 'La joven de la perla'?", listOf("Rembrandt", "Johannes Vermeer", "Frans Hals", "Pieter Bruegel"), "Cultura", "Johannes Vermeer, pintor neerlandés del siglo XVII, realizó este famoso cuadro hacia 1665, a menudo llamado la 'Mona Lisa del Norte'.")
        ),
        BilingualQuestion(
            id = 10232, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En mythologie grecque, quel est le nom de la déesse de la chasse?", listOf("Héra", "Arthémis", "Aphrodite", "Athéna"), "Culture", "Artémis est la déesse grecque de la chasse, de la nature sauvage et de la Lune, sœur jumelle d'Apollon."),
            en = LocalizedContent("In Greek mythology, what is the name of the goddess of the hunt?", listOf("Hera", "Artemis", "Aphrodite", "Athena"), "Culture", "Artemis is the Greek goddess of the hunt, wilderness, and the Moon, twin sister of Apollo."),
            zh = LocalizedContent("在希腊神话中，狩猎女神的名字是什么？", listOf("赫拉", "阿尔忒弥斯", "阿佛洛狄忒", "雅典娜"), "文化", "阿尔忒弥斯是希腊的狩猎、荒野和月亮女神，阿波罗的孪生姐妹。"),
            es = LocalizedContent("En la mitología griega, ¿cuál es el nombre de la diosa de la caza?", listOf("Hera", "Artemisa", "Afrodita", "Atenea"), "Cultura", "Artemisa es la diosa griega de la caza, la naturaleza salvaje y la Luna, hermana gemela de Apolo.")
        ),
        BilingualQuestion(
            id = 10233, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'The Rings of Power' a-t-il été lancé?", listOf("2021", "2022", "2023", "2024"), "Culture", "La série Le Seigneur des Anneaux : Les Anneaux de Pouvoir a été diffusée pour la première fois sur Amazon Prime Video en septembre 2022."),
            en = LocalizedContent("In what year was 'The Rings of Power' launched?", listOf("2021", "2022", "2023", "2024"), "Culture", "The series 'The Lord of the Rings: The Rings of Power' first aired on Amazon Prime Video in September 2022."),
            zh = LocalizedContent("《力量之戒》是在哪一年推出的？", listOf("2021", "2022", "2023", "2024"), "文化", "剧集《指环王：力量之戒》于2022年9月在亚马逊Prime Video首播。"),
            es = LocalizedContent("¿En qué año se lanzó 'Los Anillos de Poder'?", listOf("2021", "2022", "2023", "2024"), "Cultura", "La serie 'El Señor de los Anillos: Los Anillos de Poder' se estrenó en Amazon Prime Video en septiembre de 2022.")
        ),
        BilingualQuestion(
            id = 10234, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur a écrit 'Clair de lune'?", listOf("Erik Satie", "Claude Debussy", "Maurice Ravel", "Gabriel Fauré"), "Culture", "Claude Debussy a composé 'Clair de lune' comme troisième mouvement de sa 'Suite bergamasque', une œuvre pour piano inspirée par la poésie symboliste."),
            en = LocalizedContent("Which composer wrote 'Clair de lune'?", listOf("Erik Satie", "Claude Debussy", "Maurice Ravel", "Gabriel Fauré"), "Culture", "Claude Debussy composed 'Clair de lune' as the third movement of his 'Suite bergamasque', a piano work inspired by symbolist poetry."),
            zh = LocalizedContent("哪位作曲家创作了《月光》？", listOf("埃里克·萨蒂", "克劳德·德彪西", "莫里斯·拉威尔", "加布里埃尔·福雷"), "文化", "克劳德·德彪西创作了《月光》作为他的《贝加莫组曲》的第三乐章，这是一部受象征主义诗歌启发的钢琴作品。"),
            es = LocalizedContent("¿Qué compositor escribió 'Claro de luna'?", listOf("Erik Satie", "Claude Debussy", "Maurice Ravel", "Gabriel Fauré"), "Cultura", "Claude Debussy compuso 'Claro de luna' como el tercer movimiento de su 'Suite bergamasque', una obra para piano inspirada en la poesía simbolista.")
        ),
        BilingualQuestion(
            id = 10235, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Barry' a-t-il commencé?", listOf("2018", "2019", "2020", "2021"), "Culture", "Barry, série HBO avec Bill Hader, a débuté en 2018."),
            en = LocalizedContent("In what year did 'Barry' start?", listOf("2018", "2019", "2020", "2021"), "Culture", "Barry, the HBO series starring Bill Hader, premiered in 2018."),
            zh = LocalizedContent("《巴瑞》是在哪一年开播的？", listOf("2018", "2019", "2020", "2021"), "文化", "HBO剧集《巴瑞》由比尔·哈德尔主演，于2018年首播。"),
            es = LocalizedContent("¿En qué año comenzó 'Barry'?", listOf("2018", "2019", "2020", "2021"), "Cultura", "Barry, la serie de HBO protagonizada por Bill Hader, se estrenó en 2018.")
        ),
        BilingualQuestion(
            id = 10236, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel peintre a peint 'La Victoire de Samothrace'?", listOf("Phidias", "Polyclitus", "Inconnu", "Myron"), "Culture", "La Victoire de Samothrace est une sculpture grecque antique, non une peinture, et son sculpteur reste anonyme."),
            en = LocalizedContent("Which painter painted 'Winged Victory of Samothrace'?", listOf("Phidias", "Polyclitus", "Unknown", "Myron"), "Culture", "The Winged Victory of Samothrace is an ancient Greek sculpture, not a painting, and its sculptor remains unknown."),
            zh = LocalizedContent("哪位画家绘制了《萨莫色雷斯的胜利女神》？", listOf("菲迪亚斯", "波利克里托斯", "未知", "米隆"), "文化", "《萨莫色雷斯的胜利女神》是一座古希腊雕塑，而非绘画，其雕刻家身份未知。"),
            es = LocalizedContent("¿Qué pintor pintó 'La Victoria de Samotracia'?", listOf("Fidias", "Policleto", "Desconocido", "Mirón"), "Cultura", "La Victoria de Samotracia es una escultura griega antigua, no una pintura, y su escultor sigue siendo desconocido.")
        ),
        BilingualQuestion(
            id = 10237, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie égyptienne, quel dieu a une tête de chacal?", listOf("Osiris", "Thot", "Anubis", "Rê"), "Culture", "Anubis est le dieu égyptien de la momification et de l'au-delà, représenté avec une tête de chacal en raison de l'association de cet animal avec les nécropoles."),
            en = LocalizedContent("In Egyptian mythology, which god has a jackal head?", listOf("Osiris", "Thoth", "Anubis", "Ra"), "Culture", "Anubis is the Egyptian god of mummification and the afterlife, depicted with a jackal head due to the animal's association with cemeteries."),
            zh = LocalizedContent("在埃及神话中，哪位神有胡狼头？", listOf("奥西里斯", "托特", "阿努比斯", "拉"), "文化", "阿努比斯是埃及的木乃伊制作和来世之神，因胡狼与墓地的关联而被描绘成胡狼头。"),
            es = LocalizedContent("En la mitología egipcia, ¿qué dios tiene cabeza de chacal?", listOf("Osiris", "Thot", "Anubis", "Ra"), "Cultura", "Anubis es el dios egipcio de la momificación y el más allá, representado con cabeza de chacal debido a la asociación de este animal con las necrópolis.")
        ),
        BilingualQuestion(
            id = 10238, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel style de musique est associé à Bob Dylan?", listOf("Rock alternatif", "Folk rock", "Country rock", "Psychédélique"), "Culture", "Bob Dylan a popularisé le folk rock dans les années 1960 en mêlant paroles engagées et sonorités électriques, notamment avec l'album \"Bringing It All Back Home\"."),
            en = LocalizedContent("What style of music is associated with Bob Dylan?", listOf("Alternative rock", "Folk rock", "Country rock", "Psychedelic"), "Culture", "Bob Dylan popularized folk rock in the 1960s by blending socially conscious lyrics with electric sounds, notably on the album 'Bringing It All Back Home'."),
            zh = LocalizedContent("哪种音乐风格与鲍勃·迪伦相关？", listOf("另类摇滚", "民谣摇滚", "乡村摇滚", "迷幻"), "文化", "鲍勃·迪伦在20世纪60年代通过将具有社会意识的歌词与电子声音相结合，普及了民谣摇滚，尤其是在专辑《重返家园》中。"),
            es = LocalizedContent("¿Qué estilo de música se asocia con Bob Dylan?", listOf("Rock alternativo", "Folk rock", "Country rock", "Psicodélico"), "Cultura", "Bob Dylan popularizó el folk rock en la década de 1960 al combinar letras comprometidas con sonidos eléctricos, especialmente en el álbum 'Bringing It All Back Home'.")
        ),
        BilingualQuestion(
            id = 10239, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Shogun' a-t-il commencé?", listOf("2023", "2024", "2025", "2026"), "Culture", "La série 'Shogun', adaptation du roman de James Clavell, a été diffusée pour la première fois en 2024 sur FX et Disney+."),
            en = LocalizedContent("In what year did 'Shogun' start?", listOf("2023", "2024", "2025", "2026"), "Culture", "The series 'Shogun', an adaptation of James Clavell's novel, first aired in 2024 on FX and Disney+."),
            zh = LocalizedContent("《幕府将军》是在哪一年开播的？", listOf("2023", "2024", "2025", "2026"), "文化", "剧集《幕府将军》改编自詹姆斯·克拉维尔的同名小说，于2024年在FX和Disney+首播。"),
            es = LocalizedContent("¿En qué año comenzó 'Shogun'?", listOf("2023", "2024", "2025", "2026"), "Cultura", "La serie 'Shogun', adaptación de la novela de James Clavell, se estrenó en 2024 en FX y Disney+.")
        ),
        BilingualQuestion(
            id = 10240, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'L'Atelier du peintre'?", listOf("Gustave Courbet", "Jean-Auguste-Dominique Ingres", "Eugène Delacroix", "Théodore Géricault"), "Culture", "Gustave Courbet a peint 'L'Atelier du peintre' en 1855, une œuvre allégorique majeure du réalisme, qu'il a sous-titrée 'Allégorie réelle déterminant une phase de sept années de ma vie artistique et morale'."),
            en = LocalizedContent("Which painter created 'The Painter's Studio'?", listOf("Gustave Courbet", "Jean-Auguste-Dominique Ingres", "Eugène Delacroix", "Théodore Géricault"), "Culture", "Gustave Courbet painted 'The Painter's Studio' in 1855, a major allegorical work of realism, which he subtitled 'A real allegory summing up seven years of my artistic and moral life'."),
            zh = LocalizedContent("哪位画家创作了《画室》？", listOf("古斯塔夫·库尔贝", "让-奥古斯特-多米尼克·安格尔", "欧仁·德拉克罗瓦", "泰奥多尔·席里柯"), "文化", "古斯塔夫·库尔贝于1855年创作了《画室》，这是一幅现实主义的重要寓言作品，他将其副标题定为“总结我七年艺术和道德生活的真实寓言”。"),
            es = LocalizedContent("¿Qué pintor creó 'El taller del pintor'?", listOf("Gustave Courbet", "Jean-Auguste-Dominique Ingres", "Eugène Delacroix", "Théodore Géricault"), "Cultura", "Gustave Courbet pintó 'El taller del pintor' en 1855, una obra alegórica mayor del realismo, que subtituló 'Alegoría real que determina una fase de siete años de mi vida artística y moral'.")
        ),
        BilingualQuestion(
            id = 10241, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie grecque, qui est la mère de Persée?", listOf("Léda", "Danaé", "Sémélé", "Io"), "Culture", "Danaé, fille d'Acrisios, roi d'Argos, est la mère de Persée, conçu après que Zeus la visita sous forme de pluie d'or."),
            en = LocalizedContent("In Greek mythology, who is the mother of Perseus?", listOf("Leda", "Danaë", "Semele", "Io"), "Culture", "Danaë, daughter of Acrisius, king of Argos, is the mother of Perseus, conceived after Zeus visited her in the form of a golden shower."),
            zh = LocalizedContent("在希腊神话中，谁是珀尔修斯的母亲？", listOf("勒达", "达那厄", "塞墨勒", "伊俄"), "文化", "达那厄是阿尔戈斯国王阿克里西俄斯的女儿，她是珀尔修斯的母亲，珀尔修斯是宙斯化作金雨与她交合后所生。"),
            es = LocalizedContent("En la mitología griega, ¿quién es la madre de Perseo?", listOf("Leda", "Dánae", "Sémele", "Ío"), "Cultura", "Dánae, hija de Acrisio, rey de Argos, es la madre de Perseo, concebido después de que Zeus la visitara en forma de lluvia de oro.")
        ),
        BilingualQuestion(
            id = 10242, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de cuisine est caractérisé par le couscous?", listOf("Cuisine marocaine", "Cuisine algérienne", "Cuisine tunisienne", "Tous les trois"), "Culture", "Le couscous est un plat emblématique des cuisines marocaine, algérienne et tunisienne, ces trois pays du Maghreb partageant des traditions culinaires similaires autour de la semoule de blé dur."),
            en = LocalizedContent("Which style of cuisine is characterized by couscous?", listOf("Moroccan cuisine", "Algerian cuisine", "Tunisian cuisine", "All three"), "Culture", "Couscous is an emblematic dish of Moroccan, Algerian, and Tunisian cuisines; these three Maghreb countries share similar culinary traditions centered on durum wheat semolina."),
            zh = LocalizedContent("哪种菜系以库斯库斯为特色？", listOf("摩洛哥菜", "阿尔及利亚菜", "突尼斯菜", "以上三种"), "文化", "库斯库斯是摩洛哥、阿尔及利亚和突尼斯菜系的标志性菜肴，这三个马格里布国家共享以硬质小麦粗粒面为中心的相似烹饪传统。"),
            es = LocalizedContent("¿Qué estilo de cocina se caracteriza por el cuscús?", listOf("Cocina marroquí", "Cocina argelina", "Cocina tunecina", "Las tres"), "Cultura", "El cuscús es un plato emblemático de las cocinas marroquí, argelina y tunecina; estos tres países del Magreb comparten tradiciones culinarias similares en torno a la sémola de trigo duro.")
        ),
        BilingualQuestion(
            id = 10243, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'The Handmaid's Tale' a-t-il commencé?", listOf("2016", "2017", "2018", "2019"), "Culture", "La série télévisée 'The Handmaid's Tale', adaptation du roman de Margaret Atwood, a débuté sa diffusion sur Hulu en 2017."),
            en = LocalizedContent("In which year did 'The Handmaid's Tale' start?", listOf("2016", "2017", "2018", "2019"), "Culture", "The television series 'The Handmaid's Tale', adaptation of Margaret Atwood's novel, began airing on Hulu in 2017."),
            zh = LocalizedContent("《使女的故事》在哪一年开播？", listOf("2016", "2017", "2018", "2019"), "文化", "电视剧《使女的故事》改编自玛格丽特·阿特伍德的小说，于2017年在Hulu首播。"),
            es = LocalizedContent("¿En qué año comenzó 'El cuento de la criada'?", listOf("2016", "2017", "2018", "2019"), "Cultura", "La serie de televisión 'El cuento de la criada', adaptación de la novela de Margaret Atwood, comenzó a emitirse en Hulu en 2017.")
        ),
        BilingualQuestion(
            id = 10244, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur a écrit 'L'Apprenti sorcier'?", listOf("Georges Bizet", "Paul Dukas", "Hector Berlioz", "Claude Debussy"), "Culture", "Paul Dukas a composé ce poème symphonique en 1897, inspiré de la ballade de Goethe. L'œuvre est célèbre pour son orchestration virtuose et son thème de la magie qui échappe à tout contrôle."),
            en = LocalizedContent("Which composer wrote 'The Sorcerer's Apprentice'?", listOf("Georges Bizet", "Paul Dukas", "Hector Berlioz", "Claude Debussy"), "Culture", "Paul Dukas composed this symphonic poem in 1897, inspired by Goethe's ballad. The work is famous for its virtuosic orchestration and theme of magic spiraling out of control."),
            zh = LocalizedContent("哪位作曲家创作了《魔法师的弟子》？", listOf("乔治·比才", "保罗·杜卡斯", "埃克托·柏辽兹", "克洛德·德彪西"), "文化", "保罗·杜卡斯于1897年创作了这首交响诗，灵感来自歌德的叙事诗。该作品以其精湛的配器和魔法失控的主题而闻名。"),
            es = LocalizedContent("¿Qué compositor escribió 'El aprendiz de brujo'?", listOf("Georges Bizet", "Paul Dukas", "Hector Berlioz", "Claude Debussy"), "Cultura", "Paul Dukas compuso este poema sinfónico en 1897, inspirado en la balada de Goethe. La obra es famosa por su orquestación virtuosa y el tema de la magia que se descontrola.")
        ),
        BilingualQuestion(
            id = 10245, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'The Bear' a-t-il commencé?", listOf("2021", "2022", "2023", "2024"), "Culture", "La série 'The Bear' a débuté en 2022 sur Hulu aux États-Unis, mais sa diffusion en France a commencé en 2023 sur Disney+."),
            en = LocalizedContent("In which year did 'The Bear' start?", listOf("2021", "2022", "2023", "2024"), "Culture", "The series 'The Bear' premiered in 2022 on Hulu in the United States, but its broadcast in France began in 2023 on Disney+."),
            zh = LocalizedContent("《熊家餐馆》在哪一年开播？", listOf("2021", "2022", "2023", "2024"), "文化", "剧集《熊家餐馆》于2022年在美国Hulu首播，但在法国的播出始于2023年的Disney+。"),
            es = LocalizedContent("¿En qué año comenzó 'The Bear'?", listOf("2021", "2022", "2023", "2024"), "Cultura", "La serie 'The Bear' se estrenó en 2022 en Hulu en Estados Unidos, pero su emisión en Francia comenzó en 2023 en Disney+.")
        ),
        BilingualQuestion(
            id = 10246, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Olympia'?", listOf("Gustave Courbet", "Édouard Manet", "Claude Monet", "Pierre-Auguste Renoir"), "Culture", "Édouard Manet a peint Olympia en 1863, une œuvre qui a provoqué un scandale au Salon de Paris pour sa représentation réaliste et provocante d'une courtisane."),
            en = LocalizedContent("Which painter painted 'Olympia'?", listOf("Gustave Courbet", "Édouard Manet", "Claude Monet", "Pierre-Auguste Renoir"), "Culture", "Édouard Manet painted Olympia in 1863, a work that caused a scandal at the Paris Salon for its realistic and provocative depiction of a courtesan."),
            zh = LocalizedContent("哪位画家创作了《奥林匹亚》？", listOf("古斯塔夫·库尔贝", "爱德华·马奈", "克洛德·莫奈", "皮埃尔-奥古斯特·雷诺阿"), "文化", "爱德华·马奈于1863年创作了《奥林匹亚》，这幅画因其对妓女的现实主义和挑衅性描绘而在巴黎沙龙引起丑闻。"),
            es = LocalizedContent("¿Qué pintor pintó 'Olympia'?", listOf("Gustave Courbet", "Édouard Manet", "Claude Monet", "Pierre-Auguste Renoir"), "Cultura", "Édouard Manet pintó Olympia en 1863, una obra que provocó un escándalo en el Salón de París por su representación realista y provocadora de una cortesana.")
        ),
        BilingualQuestion(
            id = 10247, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie grecque, quel est le nom du Titan de la lumière?", listOf("Hypérion", "Océan", "Théia", "Thémis"), "Culture", "Hypérion est le Titan de la lumière dans la mythologie grecque, père d'Hélios (le Soleil), Séléné (la Lune) et Éos (l'Aurore)."),
            en = LocalizedContent("In Greek mythology, what is the name of the Titan of light?", listOf("Hyperion", "Oceanus", "Theia", "Themis"), "Culture", "Hyperion is the Titan of light in Greek mythology, father of Helios (the Sun), Selene (the Moon), and Eos (the Dawn)."),
            zh = LocalizedContent("在希腊神话中，光之泰坦的名字是什么？", listOf("许珀里翁", "俄刻阿诺斯", "忒亚", "忒弥斯"), "文化", "许珀里翁是希腊神话中的光之泰坦，是赫利俄斯（太阳）、塞勒涅（月亮）和厄俄斯（黎明）的父亲。"),
            es = LocalizedContent("En la mitología griega, ¿cuál es el nombre del Titán de la luz?", listOf("Hiperión", "Océano", "Tea", "Temis"), "Cultura", "Hiperión es el Titán de la luz en la mitología griega, padre de Helios (el Sol), Selene (la Luna) y Eos (la Aurora).")
        ),
        BilingualQuestion(
            id = 10248, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel style de musique a émergé de Seattle?", listOf("Grunge", "Indie rock", "Alt-rock", "Post-punk"), "Culture", "Le grunge est né à Seattle dans les années 1980, porté par des groupes comme Nirvana et Pearl Jam, mêlant punk et heavy metal."),
            en = LocalizedContent("Which style of music emerged from Seattle?", listOf("Grunge", "Indie rock", "Alt-rock", "Post-punk"), "Culture", "Grunge originated in Seattle in the 1980s, led by bands like Nirvana and Pearl Jam, blending punk and heavy metal."),
            zh = LocalizedContent("哪种音乐风格起源于西雅图？", listOf("垃圾摇滚", "独立摇滚", "另类摇滚", "后朋克"), "文化", "垃圾摇滚于20世纪80年代起源于西雅图，以涅槃乐队和珍珠果酱乐队为代表，融合了朋克和重金属。"),
            es = LocalizedContent("¿Qué estilo de música surgió de Seattle?", listOf("Grunge", "Indie rock", "Alt-rock", "Post-punk"), "Cultura", "El grunge nació en Seattle en la década de 1980, impulsado por bandas como Nirvana y Pearl Jam, mezclando punk y heavy metal.")
        ),
        BilingualQuestion(
            id = 10249, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année 'Juno' a-t-elle remporté le Grammy Award?", listOf("2019", "2020", "2021", "2022"), "Culture", "Juno, le film de 2007, n'a pas remporté de Grammy. L'album de la chanteuse canadienne Juno, nommé \"Juno\", a gagné le Grammy du meilleur album de musique alternative en 2019."),
            en = LocalizedContent("In which year did Juno win the Grammy Award?", listOf("2019", "2020", "2021", "2022"), "Culture", "Juno, the 2007 film, did not win a Grammy. The album by Canadian singer Juno, titled 'Juno', won the Grammy for Best Alternative Music Album in 2019."),
            zh = LocalizedContent("朱诺在哪一年获得了格莱美奖？", listOf("2019", "2020", "2021", "2022"), "文化", "2007年的电影《朱诺》并未获得格莱美奖。加拿大歌手朱诺的同名专辑《Juno》在2019年获得了最佳另类音乐专辑格莱美奖。"),
            es = LocalizedContent("¿En qué año ganó Juno el Premio Grammy?", listOf("2019", "2020", "2021", "2022"), "Cultura", "Juno, la película de 2007, no ganó un Grammy. El álbum de la cantante canadiense Juno, titulado 'Juno', ganó el Grammy al mejor álbum de música alternativa en 2019.")
        ),
    )

    private fun part5(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 10250, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'L'Enfant au pigeon'?", listOf("Pablo Picasso", "Henri Matisse", "Georges Braque", "Juan Gris"), "Culture", "Pablo Picasso a peint 'L'Enfant au pigeon' en 1901, durant sa période bleue, alors qu'il n'avait que 20 ans et vivait à Paris."),
            en = LocalizedContent("Which painter created 'Child with a Dove'?", listOf("Pablo Picasso", "Henri Matisse", "Georges Braque", "Juan Gris"), "Culture", "Pablo Picasso painted 'Child with a Dove' in 1901, during his Blue Period, when he was only 20 years old and living in Paris."),
            zh = LocalizedContent("哪位画家创作了《持鸽子的孩子》？", listOf("巴勃罗·毕加索", "亨利·马蒂斯", "乔治·布拉克", "胡安·格里斯"), "文化", "巴勃罗·毕加索于1901年创作了《持鸽子的孩子》，当时他只有20岁，住在巴黎，正处于蓝色时期。"),
            es = LocalizedContent("¿Qué pintor creó 'Niño con paloma'?", listOf("Pablo Picasso", "Henri Matisse", "Georges Braque", "Juan Gris"), "Cultura", "Pablo Picasso pintó 'Niño con paloma' en 1901, durante su Período Azul, cuando solo tenía 20 años y vivía en París.")
        ),
        BilingualQuestion(
            id = 10251, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie grecque, qui est la mère des Muses?", listOf("Héra", "Thémis", "Mnémosyne", "Métis"), "Culture", "Dans la mythologie grecque, les Muses sont les filles de Zeus et de Mnémosyne, la déesse de la mémoire."),
            en = LocalizedContent("In Greek mythology, who is the mother of the Muses?", listOf("Hera", "Themis", "Mnemosyne", "Metis"), "Culture", "In Greek mythology, the Muses are the daughters of Zeus and Mnemosyne, the goddess of memory."),
            zh = LocalizedContent("在希腊神话中，谁是缪斯女神的母亲？", listOf("赫拉", "忒弥斯", "谟涅摩绪涅", "墨提斯"), "文化", "在希腊神话中，缪斯女神是宙斯和记忆女神谟涅摩绪涅的女儿。"),
            es = LocalizedContent("En la mitología griega, ¿quién es la madre de las Musas?", listOf("Hera", "Themis", "Mnemosine", "Metis"), "Cultura", "En la mitología griega, las Musas son hijas de Zeus y Mnemosine, la diosa de la memoria.")
        ),
        BilingualQuestion(
            id = 10252, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de danse vient de Porto Rico?", listOf("Salsa", "Reggaeton", "Bachata", "Merengue"), "Culture", "La bachata est originaire de République dominicaine, pas de Porto Rico. La danse portoricaine la plus célèbre est la salsa."),
            en = LocalizedContent("Which dance style comes from Puerto Rico?", listOf("Salsa", "Reggaeton", "Bachata", "Merengue"), "Culture", "Bachata originated in the Dominican Republic, not Puerto Rico. The most famous Puerto Rican dance is salsa."),
            zh = LocalizedContent("哪种舞蹈风格源自波多黎各？", listOf("萨尔萨", "雷鬼顿", "巴恰塔", "梅伦格"), "文化", "巴恰塔起源于多米尼加共和国，而非波多黎各。波多黎各最著名的舞蹈是萨尔萨。"),
            es = LocalizedContent("¿Qué estilo de baile proviene de Puerto Rico?", listOf("Salsa", "Reguetón", "Bachata", "Merengue"), "Cultura", "La bachata se originó en la República Dominicana, no en Puerto Rico. El baile puertorriqueño más famoso es la salsa.")
        ),
        BilingualQuestion(
            id = 10253, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Saint Seiya' a-t-il été lancé?", listOf("1986", "1987", "1988", "1989"), "Culture", "Le manga Saint Seiya de Masami Kurumada a débuté en 1986 dans le magazine Weekly Shōnen Jump."),
            en = LocalizedContent("In which year was 'Saint Seiya' launched?", listOf("1986", "1987", "1988", "1989"), "Culture", "The manga Saint Seiya by Masami Kurumada began in 1986 in Weekly Shōnen Jump magazine."),
            zh = LocalizedContent("《圣斗士星矢》是哪一年推出的？", listOf("1986", "1987", "1988", "1989"), "文化", "车田正美的漫画《圣斗士星矢》于1986年在《周刊少年Jump》上开始连载。"),
            es = LocalizedContent("¿En qué año se lanzó 'Saint Seiya'?", listOf("1986", "1987", "1988", "1989"), "Cultura", "El manga Saint Seiya de Masami Kurumada comenzó en 1986 en la revista Weekly Shōnen Jump.")
        ),
        BilingualQuestion(
            id = 10254, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit 'La Marche des Dieux'?", listOf("Edvard Grieg", "Jean Sibelius", "Aaron Copland", "John Philip Sousa"), "Culture", "Edvard Grieg a composé cette pièce dans le cadre de sa musique de scène pour la pièce d'Ibsen \"Peer Gynt\", où elle accompagne une scène mythologique."),
            en = LocalizedContent("Which composer wrote 'The March of the Gods'?", listOf("Edvard Grieg", "Jean Sibelius", "Aaron Copland", "John Philip Sousa"), "Culture", "Edvard Grieg composed this piece as part of his incidental music for Ibsen's play 'Peer Gynt', where it accompanies a mythological scene."),
            zh = LocalizedContent("哪位作曲家创作了《诸神进行曲》？", listOf("爱德华·格里格", "让·西贝柳斯", "阿隆·科普兰", "约翰·菲利普·苏萨"), "文化", "爱德华·格里格为易卜生的戏剧《培尔·金特》创作了这首配乐，用于伴随一个神话场景。"),
            es = LocalizedContent("¿Qué compositor escribió 'La marcha de los dioses'?", listOf("Edvard Grieg", "Jean Sibelius", "Aaron Copland", "John Philip Sousa"), "Cultura", "Edvard Grieg compuso esta pieza como parte de su música incidental para la obra de Ibsen 'Peer Gynt', donde acompaña una escena mitológica.")
        ),
        BilingualQuestion(
            id = 10255, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'House' a-t-il commencé?", listOf("2002", "2003", "2004", "2005"), "Culture", "La série télévisée américaine 'House', avec Hugh Laurie dans le rôle du Dr Gregory House, a été diffusée pour la première fois le 16 novembre 2004 sur la chaîne Fox."),
            en = LocalizedContent("In which year did 'House' start?", listOf("2002", "2003", "2004", "2005"), "Culture", "The American television series 'House', starring Hugh Laurie as Dr. Gregory House, first aired on November 16, 2004 on Fox."),
            zh = LocalizedContent("《豪斯医生》是哪一年开播的？", listOf("2002", "2003", "2004", "2005"), "文化", "美国电视剧《豪斯医生》由休·劳瑞主演格雷戈里·豪斯医生，于2004年11月16日在福克斯首播。"),
            es = LocalizedContent("¿En qué año comenzó 'House'?", listOf("2002", "2003", "2004", "2005"), "Cultura", "La serie de televisión estadounidense 'House', protagonizada por Hugh Laurie como el Dr. Gregory House, se emitió por primera vez el 16 de noviembre de 2004 en Fox.")
        ),
        BilingualQuestion(
            id = 10256, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel peintre a peint 'Carnation, Lily, Lily, Rose'?", listOf("James McNeill Whistler", "John Singer Sargent", "Diego Velázquez", "Diego Rivera"), "Culture", "John Singer Sargent a peint cette œuvre en 1885-1886, inspirée par des lanternes chinoises dans un jardin anglais. Le titre provient d’un refrain de chanson populaire de l’époque."),
            en = LocalizedContent("Which painter painted 'Carnation, Lily, Lily, Rose'?", listOf("James McNeill Whistler", "John Singer Sargent", "Diego Velázquez", "Diego Rivera"), "Culture", "John Singer Sargent painted this work in 1885-1886, inspired by Chinese lanterns in an English garden. The title comes from a popular song refrain of the time."),
            zh = LocalizedContent("哪位画家创作了《康乃馨、百合、百合、玫瑰》？", listOf("詹姆斯·麦克尼尔·惠斯勒", "约翰·辛格·萨金特", "迭戈·委拉斯开兹", "迭戈·里维拉"), "文化", "约翰·辛格·萨金特于1885-1886年创作了这幅作品，灵感来自英国花园中的中国灯笼。标题源自当时一首流行歌曲的副歌。"),
            es = LocalizedContent("¿Qué pintor pintó 'Clavel, lirio, lirio, rosa'?", listOf("James McNeill Whistler", "John Singer Sargent", "Diego Velázquez", "Diego Rivera"), "Cultura", "John Singer Sargent pintó esta obra en 1885-1886, inspirada por farolillos chinos en un jardín inglés. El título proviene de un estribillo de una canción popular de la época.")
        ),
        BilingualQuestion(
            id = 10257, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie romaine, quel dieu est assimilé à Apollon?", listOf("Phoebus", "Apollo", "Soleil", "Tous les trois"), "Culture", "Les Romains ont assimilé Apollon au dieu grec Apollon lui-même, mais aussi à d'autres divinités comme le dieu solaire Sol ou le guérisseur Vediovis, selon les aspects."),
            en = LocalizedContent("In Roman mythology, which god is assimilated to Apollo?", listOf("Phoebus", "Apollo", "Sol", "All three"), "Culture", "The Romans assimilated Apollo to the Greek god Apollo himself, but also to other deities such as the sun god Sol or the healer Vediovis, depending on the aspect."),
            zh = LocalizedContent("在罗马神话中，哪位神祇与阿波罗等同？", listOf("福玻斯", "阿波罗", "索尔", "以上全部"), "文化", "罗马人将阿波罗与希腊神阿波罗本身等同，但也根据不同的方面与其他神祇如太阳神索尔或医神维迪奥维斯等同。"),
            es = LocalizedContent("En la mitología romana, ¿qué dios se asimila a Apolo?", listOf("Febo", "Apolo", "Sol", "Los tres"), "Cultura", "Los romanos asimilaron a Apolo con el dios griego Apolo mismo, pero también con otras deidades como el dios solar Sol o el sanador Vediovis, según el aspecto.")
        ),
        BilingualQuestion(
            id = 10258, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de cuisine est originaire de la Thaïlande du Nord?", listOf("Pad Thai", "Tom Yum", "Larb", "Satay"), "Culture", "Le larb est une salade de viande hachée épicée, originaire du nord de la Thaïlande et du Laos, souvent considérée comme un plat national thaïlandais."),
            en = LocalizedContent("Which cuisine style originates from Northern Thailand?", listOf("Pad Thai", "Tom Yum", "Larb", "Satay"), "Culture", "Larb is a spicy minced meat salad, originating from northern Thailand and Laos, often considered a Thai national dish."),
            zh = LocalizedContent("哪种菜肴风格源自泰国北部？", listOf("泰式炒河粉", "冬阴功", "拉布", "沙爹"), "文化", "拉布是一种辛辣的碎肉沙拉，起源于泰国北部和老挝，常被视为泰国国菜。"),
            es = LocalizedContent("¿Qué estilo de cocina se origina en el norte de Tailandia?", listOf("Pad Thai", "Tom Yum", "Larb", "Satay"), "Cultura", "El larb es una ensalada de carne picada picante, originaria del norte de Tailandia y Laos, a menudo considerada un plato nacional tailandés.")
        ),
        BilingualQuestion(
            id = 10259, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Honey Boy' a-t-il été lancé?", listOf("2018", "2019", "2020", "2021"), "Culture", "Honey Boy, film autobiographique réalisé par Alma Har'el, est sorti en 2019. Il met en scène Shia LaBeouf dans son propre rôle de père."),
            en = LocalizedContent("In which year was 'Honey Boy' launched?", listOf("2018", "2019", "2020", "2021"), "Culture", "Honey Boy, an autobiographical film directed by Alma Har'el, was released in 2019. It features Shia LaBeouf playing his own father."),
            zh = LocalizedContent("《宝贝男孩》是哪一年推出的？", listOf("2018", "2019", "2020", "2021"), "文化", "《宝贝男孩》是一部由阿尔玛·哈勒执导的自传体电影，于2019年上映。希亚·拉博夫在片中饰演自己的父亲。"),
            es = LocalizedContent("¿En qué año se lanzó 'Honey Boy'?", listOf("2018", "2019", "2020", "2021"), "Cultura", "Honey Boy, una película autobiográfica dirigida por Alma Har'el, se estrenó en 2019. En ella, Shia LaBeouf interpreta a su propio padre.")
        ),
        BilingualQuestion(
            id = 10260, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel peintre a créé 'Conte d'Automne'?", listOf("Paul Cézanne", "Paul Gauguin", "Vincent van Gogh", "Edvard Munch"), "Culture", "Paul Gauguin a peint 'Conte d'Automne' en 1902, durant son séjour à Hiva Oa aux Marquises, où il mêle paysage tahitien et figures féminines."),
            en = LocalizedContent("Which painter created 'Autumn Story'?", listOf("Paul Cézanne", "Paul Gauguin", "Vincent van Gogh", "Edvard Munch"), "Culture", "Paul Gauguin painted 'Autumn Story' in 1902 during his stay in Hiva Oa in the Marquesas, blending Tahitian landscape and female figures."),
            zh = LocalizedContent("哪位画家创作了《秋日故事》？", listOf("保罗·塞尚", "保罗·高更", "文森特·梵高", "爱德华·蒙克"), "文化", "保罗·高更于1902年在马克萨斯群岛的希瓦瓦岛创作了《秋日故事》，融合了塔希提风景和女性形象。"),
            es = LocalizedContent("¿Qué pintor creó 'Cuento de Otoño'?", listOf("Paul Cézanne", "Paul Gauguin", "Vincent van Gogh", "Edvard Munch"), "Cultura", "Paul Gauguin pintó 'Cuento de Otoño' en 1902 durante su estancia en Hiva Oa en las Marquesas, mezclando paisaje tahitiano y figuras femeninas.")
        ),
        BilingualQuestion(
            id = 10261, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie grecque, quel Titan est le père de Zeus?", listOf("Hypérion", "Océan", "Kronos", "Théia"), "Culture", "Kronos, le plus jeune des Titans, a dévoré ses enfants pour éviter une prophétie, mais Zeus a été sauvé par Rhéa et a plus tard renversé son père."),
            en = LocalizedContent("In Greek mythology, which Titan is the father of Zeus?", listOf("Hyperion", "Oceanus", "Kronos", "Theia"), "Culture", "Kronos, the youngest of the Titans, devoured his children to avoid a prophecy, but Zeus was saved by Rhea and later overthrew his father."),
            zh = LocalizedContent("在希腊神话中，哪位泰坦是宙斯的父亲？", listOf("许珀里翁", "俄刻阿诺斯", "克洛诺斯", "忒亚"), "文化", "克洛诺斯是最年轻的泰坦，为了逃避预言吞食了自己的孩子，但宙斯被瑞亚救下，后来推翻了父亲。"),
            es = LocalizedContent("En la mitología griega, ¿qué Titán es el padre de Zeus?", listOf("Hiperión", "Océano", "Crono", "Tea"), "Cultura", "Crono, el más joven de los Titanes, devoró a sus hijos para evitar una profecía, pero Zeus fue salvado por Rea y más tarde derrocó a su padre.")
        ),
        BilingualQuestion(
            id = 10262, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de musique a émergé de Memphis?", listOf("Rockabilly", "Blues", "Rap", "Rock"), "Culture", "Memphis, Tennessee, est le berceau du rockabilly, un mélange de country et de rhythm and blues popularisé dans les années 1950 par des artistes comme Elvis Presley au Sun Studio."),
            en = LocalizedContent("Which style of music emerged from Memphis?", listOf("Rockabilly", "Blues", "Rap", "Rock"), "Culture", "Memphis, Tennessee, is the birthplace of rockabilly, a blend of country and rhythm and blues popularized in the 1950s by artists like Elvis Presley at Sun Studio."),
            zh = LocalizedContent("哪种音乐风格起源于孟菲斯？", listOf("摇滚比利", "蓝调", "说唱", "摇滚"), "文化", "田纳西州孟菲斯是摇滚比利的发源地，这是一种乡村音乐与节奏蓝调的融合，在20世纪50年代由埃尔维斯·普雷斯利等人在太阳录音室推广。"),
            es = LocalizedContent("¿Qué estilo de música surgió de Memphis?", listOf("Rockabilly", "Blues", "Rap", "Rock"), "Cultura", "Memphis, Tennessee, es la cuna del rockabilly, una mezcla de country y rhythm and blues popularizada en los años 50 por artistas como Elvis Presley en Sun Studio.")
        ),
        BilingualQuestion(
            id = 10263, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'The Newsroom' a-t-il commencé?", listOf("2010", "2011", "2012", "2013"), "Culture", "La série télévisée dramatique américaine 'The Newsroom', créée par Aaron Sorkin, a été diffusée pour la première fois sur HBO le 24 juin 2011."),
            en = LocalizedContent("In which year did 'The Newsroom' start?", listOf("2010", "2011", "2012", "2013"), "Culture", "The American television drama series 'The Newsroom', created by Aaron Sorkin, first aired on HBO on June 24, 2011."),
            zh = LocalizedContent("《新闻编辑室》在哪一年开播？", listOf("2010", "2011", "2012", "2013"), "文化", "美国电视剧《新闻编辑室》由艾伦·索金创作，于2011年6月24日在HBO首播。"),
            es = LocalizedContent("¿En qué año comenzó 'The Newsroom'?", listOf("2010", "2011", "2012", "2013"), "Cultura", "La serie dramática estadounidense 'The Newsroom', creada por Aaron Sorkin, se emitió por primera vez en HBO el 24 de junio de 2011.")
        ),
        BilingualQuestion(
            id = 10264, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Botes de Marguerites dans un Vase'?", listOf("Vincent van Gogh", "Claude Monet", "Pierre-Auguste Renoir", "Paul Cézanne"), "Culture", "Van Gogh a peint cette nature morte en 1890, peu avant sa mort, durant son séjour à Auvers-sur-Oise."),
            en = LocalizedContent("Which painter painted 'Bouquet of Daisies in a Vase'?", listOf("Vincent van Gogh", "Claude Monet", "Pierre-Auguste Renoir", "Paul Cézanne"), "Culture", "Van Gogh painted this still life in 1890, shortly before his death, during his stay in Auvers-sur-Oise."),
            zh = LocalizedContent("哪位画家创作了《花瓶里的雏菊》？", listOf("文森特·梵高", "克劳德·莫奈", "皮埃尔-奥古斯特·雷诺阿", "保罗·塞尚"), "文化", "梵高于1890年在奥维尔小镇创作了这幅静物画，不久后他便去世了。"),
            es = LocalizedContent("¿Qué pintor pintó 'Ramo de Margaritas en un Jarrón'?", listOf("Vincent van Gogh", "Claude Monet", "Pierre-Auguste Renoir", "Paul Cézanne"), "Cultura", "Van Gogh pintó este bodegón en 1890, poco antes de su muerte, durante su estancia en Auvers-sur-Oise.")
        ),
        BilingualQuestion(
            id = 10265, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie égyptienne, quel animal est associé à Horus?", listOf("Faucon", "Scarabée", "Chat", "Taureau"), "Culture", "Horus, dieu du ciel et de la royauté, était représenté avec une tête de faucon, symbole de vision et de puissance."),
            en = LocalizedContent("In Egyptian mythology, which animal is associated with Horus?", listOf("Falcon", "Scarab", "Cat", "Bull"), "Culture", "Horus, god of the sky and kingship, was depicted with a falcon head, symbolizing vision and power."),
            zh = LocalizedContent("在埃及神话中，哪种动物与荷鲁斯相关？", listOf("猎鹰", "圣甲虫", "猫", "公牛"), "文化", "荷鲁斯是天空与王权之神，常被描绘成猎鹰头，象征视野与力量。"),
            es = LocalizedContent("En la mitología egipcia, ¿qué animal se asocia con Horus?", listOf("Halcón", "Escarabajo", "Gato", "Toro"), "Cultura", "Horus, dios del cielo y la realeza, era representado con cabeza de halcón, símbolo de visión y poder.")
        ),
        BilingualQuestion(
            id = 10266, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur a écrit 'Bolero'?", listOf("Claude Debussy", "Erik Satie", "Maurice Ravel", "Gabriel Fauré"), "Culture", "Maurice Ravel a composé Boléro en 1928, une œuvre commandée par la danseuse Ida Rubinstein. Cette pièce orchestrale est devenue l'une des plus célèbres du répertoire classique."),
            en = LocalizedContent("Which composer wrote 'Bolero'?", listOf("Claude Debussy", "Erik Satie", "Maurice Ravel", "Gabriel Fauré"), "Culture", "Maurice Ravel composed Boléro in 1928, a work commissioned by dancer Ida Rubinstein. This orchestral piece became one of the most famous in the classical repertoire."),
            zh = LocalizedContent("哪位作曲家创作了《波莱罗》？", listOf("克劳德·德彪西", "埃里克·萨蒂", "莫里斯·拉威尔", "加布里埃尔·福雷"), "文化", "莫里斯·拉威尔于1928年创作了《波莱罗》，受舞蹈家伊达·鲁宾斯坦委托。这首管弦乐作品成为古典曲目中最著名的作品之一。"),
            es = LocalizedContent("¿Qué compositor escribió 'Bolero'?", listOf("Claude Debussy", "Erik Satie", "Maurice Ravel", "Gabriel Fauré"), "Cultura", "Maurice Ravel compuso Bolero en 1928, una obra encargada por la bailarina Ida Rubinstein. Esta pieza orquestal se convirtió en una de las más famosas del repertorio clásico.")
        ),
        BilingualQuestion(
            id = 10267, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Perfect Strangers' a-t-il été lancé?", listOf("2015", "2016", "2017", "2018"), "Culture", "Perfect Strangers, le film d'horreur italien, est sorti en 2017, réalisé par Paolo Genovese."),
            en = LocalizedContent("In which year was 'Perfect Strangers' launched?", listOf("2015", "2016", "2017", "2018"), "Culture", "Perfect Strangers, the Italian horror film, was released in 2017, directed by Paolo Genovese."),
            zh = LocalizedContent("《完美陌生人》在哪一年上映？", listOf("2015", "2016", "2017", "2018"), "文化", "意大利恐怖片《完美陌生人》于2017年上映，由保罗·杰诺维塞执导。"),
            es = LocalizedContent("¿En qué año se lanzó 'Perfect Strangers'?", listOf("2015", "2016", "2017", "2018"), "Cultura", "Perfect Strangers, la película de terror italiana, se estrenó en 2017, dirigida por Paolo Genovese.")
        ),
        BilingualQuestion(
            id = 10268, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel peintre a créé 'Nuit d'hiver au Nord'?", listOf("Wassily Kandinsky", "Oskar Kokoschka", "Egon Schiele", "Max Beckmann"), "Culture", "Wassily Kandinsky, peintre russe pionnier de l'art abstrait, a peint 'Nuit d'hiver au Nord' en 1900, une œuvre de sa période figurative avant son virage vers l'abstraction."),
            en = LocalizedContent("Which painter created 'Winter Night in the North'?", listOf("Wassily Kandinsky", "Oskar Kokoschka", "Egon Schiele", "Max Beckmann"), "Culture", "Wassily Kandinsky, Russian pioneer of abstract art, painted 'Winter Night in the North' in 1900, a work from his figurative period before his turn to abstraction."),
            zh = LocalizedContent("哪位画家创作了《北方的冬夜》？", listOf("瓦西里·康定斯基", "奥斯卡·柯克西卡", "埃贡·席勒", "马克斯·贝克曼"), "文化", "瓦西里·康定斯基是俄罗斯抽象艺术先驱，于1900年创作了《北方的冬夜》，这是他转向抽象之前的具象时期作品。"),
            es = LocalizedContent("¿Qué pintor creó 'Noche de Invierno en el Norte'?", listOf("Wassily Kandinsky", "Oskar Kokoschka", "Egon Schiele", "Max Beckmann"), "Cultura", "Wassily Kandinsky, pionero ruso del arte abstracto, pintó 'Noche de Invierno en el Norte' en 1900, una obra de su período figurativo antes de su giro hacia la abstracción.")
        ),
        BilingualQuestion(
            id = 10269, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie grecque, qui est la déesse de la discorde?", listOf("Héra", "Eris", "Athéna", "Aphrodite"), "Culture", "Eris est la déesse grecque de la discorde, connue pour avoir provoqué la guerre de Troie en lançant la pomme d'or « à la plus belle » lors du mariage de Thétis et Pélée."),
            en = LocalizedContent("In Greek mythology, who is the goddess of discord?", listOf("Hera", "Eris", "Athena", "Aphrodite"), "Culture", "Eris is the Greek goddess of discord, known for causing the Trojan War by throwing the golden apple 'to the fairest' at the wedding of Thetis and Peleus."),
            zh = LocalizedContent("在希腊神话中，谁是纷争女神？", listOf("赫拉", "厄里斯", "雅典娜", "阿佛洛狄忒"), "文化", "厄里斯是希腊的纷争女神，因在忒提斯与珀琉斯的婚礼上投下“献给最美丽者”的金苹果而引发了特洛伊战争。"),
            es = LocalizedContent("En la mitología griega, ¿quién es la diosa de la discordia?", listOf("Hera", "Eris", "Atenea", "Afrodita"), "Cultura", "Eris es la diosa griega de la discordia, conocida por provocar la Guerra de Troya al lanzar la manzana de oro 'a la más bella' en la boda de Tetis y Peleo.")
        ),
        BilingualQuestion(
            id = 10270, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de cuisine française utilise beaucoup de vin rouge?", listOf("Coq au vin", "Cuisine bourguignonne", "Cuisine française", "Tous les trois"), "Culture", "La cuisine française utilise le vin rouge dans de nombreuses régions, notamment en Bourgogne et à Bordeaux, pour mijoter des plats comme le bœuf bourguignon ou le coq au vin."),
            en = LocalizedContent("Which style of French cuisine uses a lot of red wine?", listOf("Coq au vin", "Burgundian cuisine", "French cuisine", "All three"), "Culture", "French cuisine uses red wine in many regions, especially in Burgundy and Bordeaux, to simmer dishes like beef bourguignon or coq au vin."),
            zh = LocalizedContent("哪种法式烹饪风格大量使用红酒？", listOf("红酒炖鸡", "勃艮第菜", "法式菜", "以上都是"), "文化", "法国菜在许多地区使用红酒，特别是在勃艮第和波尔多，用于炖制勃艮第牛肉或红酒炖鸡等菜肴。"),
            es = LocalizedContent("¿Qué estilo de cocina francesa utiliza mucho vino tinto?", listOf("Coq au vin", "Cocina borgoñona", "Cocina francesa", "Los tres"), "Cultura", "La cocina francesa utiliza vino tinto en muchas regiones, especialmente en Borgoña y Burdeos, para estofar platos como el boeuf bourguignon o el coq au vin.")
        ),
        BilingualQuestion(
            id = 10271, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Louie' a-t-il commencé?", listOf("2010", "2011", "2012", "2013"), "Culture", "Louie, la série comique créée et interprétée par Louis C.K., a débuté en 2011 sur FX."),
            en = LocalizedContent("In what year did 'Louie' start?", listOf("2010", "2011", "2012", "2013"), "Culture", "Louie, the comedy series created and performed by Louis C.K., premiered in 2011 on FX."),
            zh = LocalizedContent("《路易》在哪一年开播？", listOf("2010", "2011", "2012", "2013"), "文化", "《路易》是由路易·C·K创作并主演的喜剧系列，于2011年在FX首播。"),
            es = LocalizedContent("¿En qué año comenzó 'Louie'?", listOf("2010", "2011", "2012", "2013"), "Cultura", "Louie, la serie de comedia creada e interpretada por Louis C.K., se estrenó en 2011 en FX.")
        ),
        BilingualQuestion(
            id = 10272, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel peintre a peint 'Maître de la Rose'?", listOf("Hieronymus Bosch", "Pieter Bruegel", "Jan van Eyck", "Roger van der Weyden"), "Culture", "Jan van Eyck, peintre flamand du XVe siècle, est reconnu pour son réalisme minutieux et ses portraits, bien que 'Maître de la Rose' ne soit pas une de ses œuvres majeures mais un titre parfois associé à son atelier."),
            en = LocalizedContent("Which painter painted 'Master of the Rose'?", listOf("Hieronymus Bosch", "Pieter Bruegel", "Jan van Eyck", "Roger van der Weyden"), "Culture", "Jan van Eyck, a 15th-century Flemish painter, is known for his meticulous realism and portraits, although 'Master of the Rose' is not one of his major works but a title sometimes associated with his workshop."),
            zh = LocalizedContent("哪位画家画了《玫瑰大师》？", listOf("希罗尼穆斯·博斯", "彼得·勃鲁盖尔", "扬·凡·艾克", "罗吉尔·凡·德·韦登"), "文化", "扬·凡·艾克是15世纪佛兰德画家，以其细致的写实主义和肖像画闻名，尽管《玫瑰大师》并非他的主要作品，而是有时与其工作室相关的标题。"),
            es = LocalizedContent("¿Qué pintor pintó 'Maestro de la Rosa'?", listOf("Hieronymus Bosch", "Pieter Bruegel", "Jan van Eyck", "Roger van der Weyden"), "Cultura", "Jan van Eyck, pintor flamenco del siglo XV, es conocido por su realismo meticuloso y sus retratos, aunque 'Maestro de la Rosa' no es una de sus obras principales sino un título a veces asociado con su taller.")
        ),
        BilingualQuestion(
            id = 10273, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie romaine, quel dieu est le dieu du commerce?", listOf("Jupiter", "Mars", "Mercure", "Vulcain"), "Culture", "Mercure, assimilé à l'Hermès grec, est le dieu romain du commerce, des voyageurs et des voleurs, souvent représenté avec un caducée et des sandales ailées."),
            en = LocalizedContent("In Roman mythology, which god is the god of commerce?", listOf("Jupiter", "Mars", "Mercury", "Vulcan"), "Culture", "Mercury, assimilated to the Greek Hermes, is the Roman god of commerce, travelers, and thieves, often depicted with a caduceus and winged sandals."),
            zh = LocalizedContent("在罗马神话中，哪位神是商业之神？", listOf("朱庇特", "马尔斯", "墨丘利", "伏尔甘"), "文化", "墨丘利，与希腊的赫尔墨斯等同，是罗马的商业、旅行者和盗贼之神，常被描绘为手持双蛇杖、脚穿带翼凉鞋。"),
            es = LocalizedContent("En la mitología romana, ¿qué dios es el dios del comercio?", listOf("Júpiter", "Marte", "Mercurio", "Vulcano"), "Cultura", "Mercurio, asimilado al Hermes griego, es el dios romano del comercio, los viajeros y los ladrones, a menudo representado con un caduceo y sandalias aladas.")
        ),
        BilingualQuestion(
            id = 10274, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de musique a émergé de Manchester?", listOf("Britpop", "Oasis", "Joy Division", "Deux des trois"), "Culture", "Manchester a vu émerger des scènes musicales majeures comme le Madchester (Stone Roses, Happy Mondays) et la Britpop (Oasis), d'où la réponse \"deux des trois\" pour désigner ces styles."),
            en = LocalizedContent("Which style of music emerged from Manchester?", listOf("Britpop", "Oasis", "Joy Division", "Two of the three"), "Culture", "Manchester saw the emergence of major music scenes like Madchester (Stone Roses, Happy Mondays) and Britpop (Oasis), hence the answer 'two of the three' to refer to these styles."),
            zh = LocalizedContent("哪种音乐风格起源于曼彻斯特？", listOf("英伦摇滚", "绿洲乐队", "快乐分裂", "以上两个"), "文化", "曼彻斯特见证了如曼彻斯特音乐（石玫瑰、快乐星期一）和英伦摇滚（绿洲）等主要音乐场景的兴起，因此答案是“以上两个”指代这些风格。"),
            es = LocalizedContent("¿Qué estilo de música surgió de Mánchester?", listOf("Britpop", "Oasis", "Joy Division", "Dos de los tres"), "Cultura", "Mánchester vio surgir escenas musicales importantes como el Madchester (Stone Roses, Happy Mondays) y el Britpop (Oasis), de ahí la respuesta 'dos de los tres' para referirse a estos estilos.")
        ),
        BilingualQuestion(
            id = 10275, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Veep' a-t-il commencé?", listOf("2011", "2012", "2013", "2014"), "Culture", "Veep, la série comique politique avec Julia Louis-Dreyfus, a été diffusée pour la première fois en 2012 aux États-Unis, mais sa première saison a été lancée en 2013 en France."),
            en = LocalizedContent("In what year did 'Veep' start?", listOf("2011", "2012", "2013", "2014"), "Culture", "Veep, the political comedy series starring Julia Louis-Dreyfus, first aired in 2012 in the United States, but its first season was launched in 2013 in France."),
            zh = LocalizedContent("《副总统》在哪一年开播？", listOf("2011", "2012", "2013", "2014"), "文化", "《副总统》是由朱莉娅·路易斯-德雷弗斯主演的政治喜剧系列，于2012年在美国首播，但其第一季于2013年在法国播出。"),
            es = LocalizedContent("¿En qué año comenzó 'Veep'?", listOf("2011", "2012", "2013", "2014"), "Cultura", "Veep, la serie de comedia política protagonizada por Julia Louis-Dreyfus, se emitió por primera vez en 2012 en Estados Unidos, pero su primera temporada se lanzó en 2013 en Francia.")
        ),
        BilingualQuestion(
            id = 10276, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Le Rêve de la Chambre'?", listOf("Vincent van Gogh", "Paul Gauguin", "Henri de Toulouse-Lautrec", "Edvard Munch"), "Culture", "Vincent van Gogh a peint \"La Chambre à coucher\" en 1888, représentant sa chambre à Arles. Le tableau est célèbre pour ses couleurs vives et sa perspective déformée."),
            en = LocalizedContent("Which painter created 'The Bedroom'?", listOf("Vincent van Gogh", "Paul Gauguin", "Henri de Toulouse-Lautrec", "Edvard Munch"), "Culture", "Vincent van Gogh painted 'The Bedroom' in 1888, depicting his bedroom in Arles. The painting is famous for its vibrant colors and distorted perspective."),
            zh = LocalizedContent("哪位画家创作了《卧室》？", listOf("文森特·梵高", "保罗·高更", "亨利·德·图卢兹-劳特累克", "爱德华·蒙克"), "文化", "文森特·梵高于1888年创作了《卧室》，描绘了他在阿尔勒的卧室。这幅画以其鲜艳的色彩和扭曲的透视而闻名。"),
            es = LocalizedContent("¿Qué pintor creó 'La habitación'?", listOf("Vincent van Gogh", "Paul Gauguin", "Henri de Toulouse-Lautrec", "Edvard Munch"), "Cultura", "Vincent van Gogh pintó 'La habitación' en 1888, representando su dormitorio en Arlés. El cuadro es famoso por sus colores vibrantes y su perspectiva distorsionada.")
        ),
        BilingualQuestion(
            id = 10277, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En mythologie grecque, quel est le nom du dieu des Enfers?", listOf("Poséidon", "Hadès", "Charon", "Pluton"), "Culture", "Hadès est le dieu des Enfers dans la mythologie grecque, frère de Zeus et de Poséidon, qui règne sur le royaume des morts après le partage du monde entre les trois souverains."),
            en = LocalizedContent("In Greek mythology, what is the name of the god of the Underworld?", listOf("Poseidon", "Hades", "Charon", "Pluto"), "Culture", "Hades is the god of the Underworld in Greek mythology, brother of Zeus and Poseidon, who rules over the realm of the dead after the division of the world among the three sovereigns."),
            zh = LocalizedContent("在希腊神话中，冥界的名字是什么？", listOf("波塞冬", "哈迪斯", "卡戎", "普路托"), "文化", "哈迪斯是希腊神话中的冥界之神，是宙斯和波塞冬的兄弟，在三位统治者瓜分世界后统治死者领域。"),
            es = LocalizedContent("En la mitología griega, ¿cuál es el nombre del dios del Inframundo?", listOf("Poseidón", "Hades", "Caronte", "Plutón"), "Cultura", "Hades es el dios del Inframundo en la mitología griega, hermano de Zeus y Poseidón, que gobierna el reino de los muertos tras el reparto del mundo entre los tres soberanos.")
        ),
        BilingualQuestion(
            id = 10278, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de cuisine est caractérisé par le miso et le dashi?", listOf("Cuisine thaïlandaise", "Cuisine japonaise", "Cuisine coréenne", "Cuisine chinoise"), "Culture", "Le miso et le dashi sont des ingrédients fondamentaux de la cuisine japonaise, le miso étant une pâte de soja fermentée et le dashi un bouillon à base de poisson ou d'algues."),
            en = LocalizedContent("Which style of cuisine is characterized by miso and dashi?", listOf("Thai cuisine", "Japanese cuisine", "Korean cuisine", "Chinese cuisine"), "Culture", "Miso and dashi are fundamental ingredients in Japanese cuisine, miso being a fermented soybean paste and dashi a broth made from fish or seaweed."),
            zh = LocalizedContent("哪种烹饪风格以味噌和出汁为特色？", listOf("泰国菜", "日本菜", "韩国菜", "中国菜"), "文化", "味噌和出汁是日本料理的基本食材，味噌是一种发酵的大豆酱，出汁是一种用鱼或海藻制成的汤底。"),
            es = LocalizedContent("¿Qué estilo de cocina se caracteriza por el miso y el dashi?", listOf("Cocina tailandesa", "Cocina japonesa", "Cocina coreana", "Cocina china"), "Cultura", "El miso y el dashi son ingredientes fundamentales de la cocina japonesa, siendo el miso una pasta de soja fermentada y el dashi un caldo a base de pescado o algas.")
        ),
        BilingualQuestion(
            id = 10279, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'Fleabag' a-t-il commencé?", listOf("2016", "2017", "2018", "2019"), "Culture", "La série britannique 'Fleabag', créée et interprétée par Phoebe Waller-Bridge, a été diffusée pour la première fois en 2016 sur BBC Three."),
            en = LocalizedContent("In what year did 'Fleabag' start?", listOf("2016", "2017", "2018", "2019"), "Culture", "The British series 'Fleabag', created and performed by Phoebe Waller-Bridge, first aired in 2016 on BBC Three."),
            zh = LocalizedContent("《伦敦生活》在哪一年开播？", listOf("2016", "2017", "2018", "2019"), "文化", "英国系列《伦敦生活》由菲比·沃勒-布里奇创作并主演，于2016年在BBC三台首播。"),
            es = LocalizedContent("¿En qué año comenzó 'Fleabag'?", listOf("2016", "2017", "2018", "2019"), "Cultura", "La serie británica 'Fleabag', creada e interpretada por Phoebe Waller-Bridge, se emitió por primera vez en 2016 en BBC Three.")
        ),
        BilingualQuestion(
            id = 10280, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel peintre a peint 'Repos dans le Temple'?", listOf("Giotto di Bondone", "Duccio", "Simone Martini", "Ambrogio Lorenzetti"), "Culture", "Giotto di Bondone, peintre et architecte italien du Trecento, est l'auteur de cette fresque religieuse, représentant la Sainte Famille lors du repos durant la fuite en Égypte."),
            en = LocalizedContent("Which painter painted 'Rest in the Temple'?", listOf("Giotto di Bondone", "Duccio", "Simone Martini", "Ambrogio Lorenzetti"), "Culture", "Giotto di Bondone, an Italian painter and architect of the Trecento, is the author of this religious fresco, depicting the Holy Family resting during the flight into Egypt."),
            zh = LocalizedContent("哪位画家创作了《圣殿中的休息》？", listOf("乔托·迪·邦多纳", "杜乔", "西蒙尼·马蒂尼", "安布罗乔·洛伦泽蒂"), "文化", "乔托·迪·邦多纳，意大利十四世纪画家和建筑师，创作了这幅宗教壁画，描绘了圣家族在逃往埃及途中休息的场景。"),
            es = LocalizedContent("¿Qué pintor pintó 'Descanso en el Templo'?", listOf("Giotto di Bondone", "Duccio", "Simone Martini", "Ambrogio Lorenzetti"), "Cultura", "Giotto di Bondone, pintor y arquitecto italiano del Trecento, es el autor de este fresco religioso que representa a la Sagrada Familia descansando durante la huida a Egipto.")
        ),
        BilingualQuestion(
            id = 10281, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie hindoue, quel dieu a une tête d'éléphant?", listOf("Shiva", "Brahma", "Ganesha", "Indra"), "Culture", "Ganesha est le dieu de la sagesse et de l'érudition, reconnaissable à sa tête d'éléphant. Selon la légende, il a reçu cette tête après que Shiva, son père, l'ait décapité."),
            en = LocalizedContent("In Hindu mythology, which god has an elephant head?", listOf("Shiva", "Brahma", "Ganesha", "Indra"), "Culture", "Ganesha is the god of wisdom and learning, recognizable by his elephant head. According to legend, he received this head after Shiva, his father, decapitated him."),
            zh = LocalizedContent("在印度神话中，哪位神祇拥有大象的头？", listOf("湿婆", "梵天", "伽内什", "因陀罗"), "文化", "伽内什是智慧和学识之神，以其象头为特征。传说中，他的父亲湿婆砍下他的头后，他获得了这个象头。"),
            es = LocalizedContent("En la mitología hindú, ¿qué dios tiene cabeza de elefante?", listOf("Shiva", "Brahma", "Ganesha", "Indra"), "Cultura", "Ganesha es el dios de la sabiduría y el conocimiento, reconocible por su cabeza de elefante. Según la leyenda, recibió esta cabeza después de que Shiva, su padre, lo decapitara.")
        ),
        BilingualQuestion(
            id = 10282, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit 'Marche Militaire'?", listOf("Franz Schubert", "Ludwig van Beethoven", "Wolfgang Amadeus Mozart", "Johannes Brahms"), "Culture", "Franz Schubert composa trois Marches militaires en 1818 pour piano à quatre mains, la première étant la plus célèbre."),
            en = LocalizedContent("Which composer wrote 'Marche Militaire'?", listOf("Franz Schubert", "Ludwig van Beethoven", "Wolfgang Amadeus Mozart", "Johannes Brahms"), "Culture", "Franz Schubert composed three Marches Militaires in 1818 for piano four hands, the first being the most famous."),
            zh = LocalizedContent("哪位作曲家创作了《军队进行曲》？", listOf("弗朗茨·舒伯特", "路德维希·范·贝多芬", "沃尔夫冈·阿马德乌斯·莫扎特", "约翰内斯·勃拉姆斯"), "文化", "弗朗茨·舒伯特于1818年为钢琴四手联弹创作了三首《军队进行曲》，其中第一首最为著名。"),
            es = LocalizedContent("¿Qué compositor escribió 'Marcha Militar'?", listOf("Franz Schubert", "Ludwig van Beethoven", "Wolfgang Amadeus Mozart", "Johannes Brahms"), "Cultura", "Franz Schubert compuso tres Marchas Militares en 1818 para piano a cuatro manos, siendo la primera la más famosa.")
        ),
        BilingualQuestion(
            id = 10283, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Stranger Things' s'est-il terminé?", listOf("2022", "2023", "2024", "2025"), "Culture", "La quatrième saison de Stranger Things a été diffusée en 2022, et la cinquième et dernière saison est prévue pour 2025, mais la série n'est pas encore terminée."),
            en = LocalizedContent("In which year did 'Stranger Things' end?", listOf("2022", "2023", "2024", "2025"), "Culture", "The fourth season of Stranger Things was released in 2022, and the fifth and final season is scheduled for 2025, but the series has not yet ended."),
            zh = LocalizedContent("《怪奇物语》在哪一年完结？", listOf("2022", "2023", "2024", "2025"), "文化", "《怪奇物语》第四季于2022年播出，第五季也是最后一季计划于2025年播出，但该系列尚未完结。"),
            es = LocalizedContent("¿En qué año terminó 'Stranger Things'?", listOf("2022", "2023", "2024", "2025"), "Cultura", "La cuarta temporada de Stranger Things se estrenó en 2022, y la quinta y última temporada está prevista para 2025, pero la serie aún no ha terminado.")
        ),
        BilingualQuestion(
            id = 10284, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Promenade'?", listOf("Pierre-Auguste Renoir", "Claude Monet", "Berthe Morisot", "Frédéric Bazille"), "Culture", "Berthe Morisot, peintre impressionniste française, a réalisé 'Promenade' vers 1875. Cette œuvre illustre son style caractéristique, avec des touches légères et une attention aux scènes de la vie quotidienne."),
            en = LocalizedContent("Which painter created 'Promenade'?", listOf("Pierre-Auguste Renoir", "Claude Monet", "Berthe Morisot", "Frédéric Bazille"), "Culture", "Berthe Morisot, a French Impressionist painter, created 'Promenade' around 1875. This work illustrates her characteristic style, with light touches and attention to scenes of daily life."),
            zh = LocalizedContent("哪位画家创作了《散步》？", listOf("皮埃尔-奥古斯特·雷诺阿", "克劳德·莫奈", "贝尔特·莫里索", "弗雷德里克·巴齐耶"), "文化", "贝尔特·莫里索，法国印象派画家，大约在1875年创作了《散步》。这幅作品展现了她标志性的风格，笔触轻盈，关注日常生活场景。"),
            es = LocalizedContent("¿Qué pintor creó 'Paseo'?", listOf("Pierre-Auguste Renoir", "Claude Monet", "Berthe Morisot", "Frédéric Bazille"), "Cultura", "Berthe Morisot, pintora impresionista francesa, creó 'Paseo' hacia 1875. Esta obra ilustra su estilo característico, con pinceladas ligeras y atención a escenas de la vida cotidiana.")
        ),
        BilingualQuestion(
            id = 10285, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie grecque, quel est le nom de la Gorgone?", listOf("Méduse", "Sthéno", "Euryale", "Tous les trois"), "Culture", "Les Gorgones sont trois sœurs dans la mythologie grecque : Sthéno, Euryale et Méduse. La question piège attendait donc la réponse \"Tous les trois\"."),
            en = LocalizedContent("In Greek mythology, what is the name of the Gorgon?", listOf("Medusa", "Stheno", "Euryale", "All three"), "Culture", "The Gorgons are three sisters in Greek mythology: Stheno, Euryale, and Medusa. The trick question expected the answer 'All three'."),
            zh = LocalizedContent("在希腊神话中，戈耳工的名字是什么？", listOf("美杜莎", "斯忒诺", "欧律阿勒", "三者都是"), "文化", "戈耳工是希腊神话中的三姐妹：斯忒诺、欧律阿勒和美杜莎。这个陷阱题期望的答案是“三者都是”。"),
            es = LocalizedContent("En la mitología griega, ¿cuál es el nombre de la Gorgona?", listOf("Medusa", "Esteno", "Euríale", "Los tres"), "Cultura", "Las Gorgonas son tres hermanas en la mitología griega: Esteno, Euríale y Medusa. La pregunta trampa esperaba la respuesta 'Los tres'.")
        ),
        BilingualQuestion(
            id = 10286, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de danse a émergé de la Colombie?", listOf("Salsa", "Cumbia", "Vallenato", "Deux des trois"), "Culture", "La salsa, la cumbia et le reggaeton sont des danses ayant émergé de Colombie, ce qui explique pourquoi la réponse inclut \"deux des trois\"."),
            en = LocalizedContent("Which dance style emerged from Colombia?", listOf("Salsa", "Cumbia", "Vallenato", "Two of the three"), "Culture", "Salsa, cumbia, and reggaeton are dances that emerged from Colombia, which explains why the answer includes 'two of the three'."),
            zh = LocalizedContent("哪种舞蹈风格起源于哥伦比亚？", listOf("萨尔萨", "昆比亚", "巴耶纳托", "三者中的两个"), "文化", "萨尔萨、昆比亚和雷鬼舞都是起源于哥伦比亚的舞蹈，这就是为什么答案包括“三者中的两个”。"),
            es = LocalizedContent("¿Qué estilo de baile surgió de Colombia?", listOf("Salsa", "Cumbia", "Vallenato", "Dos de los tres"), "Cultura", "La salsa, la cumbia y el reguetón son bailes que surgieron de Colombia, lo que explica por qué la respuesta incluye 'dos de los tres'.")
        ),
        BilingualQuestion(
            id = 10287, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'Ozark' s'est-il terminé?", listOf("2021", "2022", "2023", "2024"), "Culture", "La série Netflix 'Ozark' a diffusé sa quatrième et dernière saison en deux parties, la seconde étant sortie en avril 2022, marquant ainsi la fin de la série cette année-là."),
            en = LocalizedContent("In which year did 'Ozark' end?", listOf("2021", "2022", "2023", "2024"), "Culture", "The Netflix series 'Ozark' aired its fourth and final season in two parts, the second part released in April 2022, marking the end of the series that year."),
            zh = LocalizedContent("《黑钱胜地》在哪一年完结？", listOf("2021", "2022", "2023", "2024"), "文化", "Netflix剧集《黑钱胜地》的第四季也是最后一季分两部分播出，第二部分于2022年4月发布，标志着该剧在那一年完结。"),
            es = LocalizedContent("¿En qué año terminó 'Ozark'?", listOf("2021", "2022", "2023", "2024"), "Cultura", "La serie de Netflix 'Ozark' emitió su cuarta y última temporada en dos partes, la segunda parte se estrenó en abril de 2022, marcando el final de la serie ese año.")
        ),
        BilingualQuestion(
            id = 10288, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Dames au Bord de la Seine'?", listOf("Claude Monet", "Pierre-Auguste Renoir", "Frédéric Bazille", "Alfred Sisley"), "Culture", "Renoir a peint 'Dames au Bord de la Seine' vers 1857, une œuvre impressionniste représentant deux femmes au bord de l'eau, typique de son intérêt pour les scènes de loisirs et la lumière naturelle."),
            en = LocalizedContent("Which painter painted 'Ladies on the Banks of the Seine'?", listOf("Claude Monet", "Pierre-Auguste Renoir", "Frédéric Bazille", "Alfred Sisley"), "Culture", "Renoir painted 'Ladies on the Banks of the Seine' around 1857, an Impressionist work depicting two women by the water, typical of his interest in leisure scenes and natural light."),
            zh = LocalizedContent("哪位画家创作了《塞纳河畔的女士们》？", listOf("克劳德·莫奈", "皮埃尔-奥古斯特·雷诺阿", "弗雷德里克·巴齐耶", "阿尔弗雷德·西斯莱"), "文化", "雷诺阿大约在1857年创作了《塞纳河畔的女士们》，这是一幅印象派作品，描绘了两位水边的女性，体现了他对休闲场景和自然光线的兴趣。"),
            es = LocalizedContent("¿Qué pintor pintó 'Señoras a orillas del Sena'?", listOf("Claude Monet", "Pierre-Auguste Renoir", "Frédéric Bazille", "Alfred Sisley"), "Cultura", "Renoir pintó 'Señoras a orillas del Sena' hacia 1857, una obra impresionista que representa a dos mujeres junto al agua, típica de su interés por las escenas de ocio y la luz natural.")
        ),
        BilingualQuestion(
            id = 10289, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie égyptienne, quel dieu a une tête de bélier?", listOf("Amon-Rê", "Khépri", "Thot", "Rê"), "Culture", "Amon-Rê est une divinité solaire majeure, fusion du dieu caché Amon et du dieu solaire Rê. Il est souvent représenté avec une tête de bélier, symbole de puissance et de fertilité."),
            en = LocalizedContent("In Egyptian mythology, which god has a ram's head?", listOf("Amun-Ra", "Khepri", "Thoth", "Ra"), "Culture", "Amun-Ra is a major solar deity, a fusion of the hidden god Amun and the sun god Ra. He is often depicted with a ram's head, a symbol of power and fertility."),
            zh = LocalizedContent("在埃及神话中，哪位神祇拥有公羊的头？", listOf("阿蒙-拉", "凯布利", "托特", "拉"), "文化", "阿蒙-拉是一位主要的太阳神，是隐藏之神阿蒙和太阳神拉的融合。他常被描绘成公羊头，象征着力量和丰饶。"),
            es = LocalizedContent("En la mitología egipcia, ¿qué dios tiene cabeza de carnero?", listOf("Amón-Ra", "Jepri", "Thot", "Ra"), "Cultura", "Amón-Ra es una deidad solar importante, fusión del dios oculto Amón y el dios solar Ra. A menudo se le representa con cabeza de carnero, símbolo de poder y fertilidad.")
        ),
        BilingualQuestion(
            id = 10290, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de cuisine est originaire de la Sicile?", listOf("Pasta alla Norma", "Caponata", "Arancini", "Tous les trois"), "Culture", "La cuisine sicilienne est un carrefour d'influences : arabe (cannoli, couscous), normande (viandes rôties) et grecque (olives, poissons). Ces trois apports historiques sont indissociables de son identité culinaire."),
            en = LocalizedContent("Which style of cuisine originates from Sicily?", listOf("Pasta alla Norma", "Caponata", "Arancini", "All three"), "Culture", "Sicilian cuisine is a crossroads of influences: Arab (cannoli, couscous), Norman (roasted meats), and Greek (olives, fish). These three historical contributions are inseparable from its culinary identity."),
            zh = LocalizedContent("哪种烹饪风格起源于西西里岛？", listOf("诺玛意面", "卡波纳塔", "阿兰奇尼", "以上都是"), "文化", "西西里美食是多种影响的交汇：阿拉伯（卡诺里卷、库斯库斯）、诺曼（烤肉）和希腊（橄榄、鱼）。这三种历史贡献与其烹饪身份密不可分。"),
            es = LocalizedContent("¿Qué estilo de cocina es originario de Sicilia?", listOf("Pasta alla Norma", "Caponata", "Arancini", "Los tres"), "Cultura", "La cocina siciliana es una encrucijada de influencias: árabe (cannoli, cuscús), normanda (carnes asadas) y griega (aceitunas, pescado). Estas tres aportaciones históricas son inseparables de su identidad culinaria.")
        ),
        BilingualQuestion(
            id = 10291, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'Narcos' a-t-il commencé?", listOf("2014", "2015", "2016", "2017"), "Culture", "La série Narcos, produite par Netflix, a débuté en 2015, retraçant l'histoire du cartel de Medellín et de Pablo Escobar."),
            en = LocalizedContent("In what year did 'Narcos' begin?", listOf("2014", "2015", "2016", "2017"), "Culture", "The series Narcos, produced by Netflix, began in 2015, recounting the story of the Medellín cartel and Pablo Escobar."),
            zh = LocalizedContent("《毒枭》在哪一年开播？", listOf("2014", "2015", "2016", "2017"), "文化", "Netflix制作的剧集《毒枭》于2015年开播，讲述了麦德林卡特尔和巴勃罗·埃斯科瓦尔的故事。"),
            es = LocalizedContent("¿En qué año comenzó 'Narcos'?", listOf("2014", "2015", "2016", "2017"), "Cultura", "La serie Narcos, producida por Netflix, comenzó en 2015, narrando la historia del cartel de Medellín y Pablo Escobar.")
        ),
        BilingualQuestion(
            id = 10292, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Jeune Fille à la Fenêtre'?", listOf("Johannes Vermeer", "Jan Steen", "Pieter de Hooch", "Gerrit Dou"), "Culture", "Johannes Vermeer est le peintre néerlandais du XVIIe siècle qui a réalisé 'Jeune Fille à la Fenêtre', une œuvre célèbre pour son utilisation de la lumière et son atmosphère intime."),
            en = LocalizedContent("Which painter created 'Girl at a Window'?", listOf("Johannes Vermeer", "Jan Steen", "Pieter de Hooch", "Gerrit Dou"), "Culture", "Johannes Vermeer is the 17th-century Dutch painter who created 'Girl at a Window', a work famous for its use of light and intimate atmosphere."),
            zh = LocalizedContent("哪位画家创作了《窗边女孩》？", listOf("约翰内斯·维米尔", "扬·斯滕", "彼得·德·霍赫", "赫里特·道"), "文化", "约翰内斯·维米尔是17世纪的荷兰画家，创作了《窗边女孩》，这幅作品以其对光线的运用和亲密的氛围而闻名。"),
            es = LocalizedContent("¿Qué pintor creó 'Muchacha en la ventana'?", listOf("Johannes Vermeer", "Jan Steen", "Pieter de Hooch", "Gerrit Dou"), "Cultura", "Johannes Vermeer es el pintor neerlandés del siglo XVII que realizó 'Muchacha en la ventana', una obra famosa por su uso de la luz y su atmósfera íntima.")
        ),
        BilingualQuestion(
            id = 10293, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie grecque, qui est le père d'Arès?", listOf("Poséidon", "Zeus", "Hadès", "Hypérion"), "Culture", "Arès est le fils de Zeus et d'Héra dans la mythologie grecque, ce qui fait de Zeus son père."),
            en = LocalizedContent("In Greek mythology, who is the father of Ares?", listOf("Poseidon", "Zeus", "Hades", "Hyperion"), "Culture", "Ares is the son of Zeus and Hera in Greek mythology, making Zeus his father."),
            zh = LocalizedContent("在希腊神话中，谁是阿瑞斯的父亲？", listOf("波塞冬", "宙斯", "哈迪斯", "许珀里翁"), "文化", "在希腊神话中，阿瑞斯是宙斯和赫拉的儿子，因此宙斯是他的父亲。"),
            es = LocalizedContent("En la mitología griega, ¿quién es el padre de Ares?", listOf("Poseidón", "Zeus", "Hades", "Hiperión"), "Cultura", "Ares es hijo de Zeus y Hera en la mitología griega, lo que convierte a Zeus en su padre.")
        ),
        BilingualQuestion(
            id = 10294, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit 'Pétrouchka'?", listOf("Sergei Rachmaninoff", "Igor Stravinsky", "Nikolai Rimsky-Korsakov", "Alexander Scriabin"), "Culture", "Igor Stravinsky a composé 'Pétrouchka' en 1911 pour les Ballets Russes de Diaghilev, une œuvre majeure du répertoire moderne."),
            en = LocalizedContent("Which composer wrote 'Petrushka'?", listOf("Sergei Rachmaninoff", "Igor Stravinsky", "Nikolai Rimsky-Korsakov", "Alexander Scriabin"), "Culture", "Igor Stravinsky composed 'Petrushka' in 1911 for Diaghilev's Ballets Russes, a major work of the modern repertoire."),
            zh = LocalizedContent("哪位作曲家创作了《彼得鲁什卡》？", listOf("谢尔盖·拉赫玛尼诺夫", "伊戈尔·斯特拉文斯基", "尼古拉·里姆斯基-科萨科夫", "亚历山大·斯克里亚宾"), "文化", "伊戈尔·斯特拉文斯基于1911年为佳吉列夫的俄罗斯芭蕾舞团创作了《彼得鲁什卡》，这是现代曲目中的一部重要作品。"),
            es = LocalizedContent("¿Qué compositor escribió 'Petrushka'?", listOf("Serguéi Rajmáninov", "Ígor Stravinski", "Nikolái Rimski-Kórsakov", "Aleksandr Skriabin"), "Cultura", "Ígor Stravinski compuso 'Petrushka' en 1911 para los Ballets Rusos de Diáguilev, una obra importante del repertorio moderno.")
        ),
        BilingualQuestion(
            id = 10295, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'True Detective' a-t-il commencé?", listOf("2012", "2013", "2014", "2015"), "Culture", "La première saison de la série policière anthologique 'True Detective', créée par Nic Pizzolatto et mettant en vedette Matthew McConaughey et Woody Harrelson, a été diffusée en 2014 sur HBO."),
            en = LocalizedContent("In what year did 'True Detective' begin?", listOf("2012", "2013", "2014", "2015"), "Culture", "The first season of the anthology crime series 'True Detective', created by Nic Pizzolatto and starring Matthew McConaughey and Woody Harrelson, aired in 2014 on HBO."),
            zh = LocalizedContent("《真探》在哪一年开播？", listOf("2012", "2013", "2014", "2015"), "文化", "由尼克·皮佐拉托创作、马修·麦康纳和伍迪·哈里森主演的选集式犯罪剧《真探》第一季于2014年在HBO播出。"),
            es = LocalizedContent("¿En qué año comenzó 'True Detective'?", listOf("2012", "2013", "2014", "2015"), "Cultura", "La primera temporada de la serie antológica policiaca 'True Detective', creada por Nic Pizzolatto y protagonizada por Matthew McConaughey y Woody Harrelson, se emitió en 2014 en HBO.")
        ),
        BilingualQuestion(
            id = 10296, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Un Verre et une Pichet'?", listOf("Pablo Picasso", "Georges Braque", "Juan Gris", "Fernando Léger"), "Culture", "Georges Braque, cofondateur du cubisme avec Picasso, a peint cette nature morte en 1910-1911, illustrant la fragmentation des objets typique de cette période."),
            en = LocalizedContent("Which painter painted 'Glass and Pitcher'?", listOf("Pablo Picasso", "Georges Braque", "Juan Gris", "Fernand Léger"), "Culture", "Georges Braque, co-founder of Cubism with Picasso, painted this still life in 1910-1911, illustrating the fragmentation of objects typical of this period."),
            zh = LocalizedContent("哪位画家创作了《玻璃杯和水壶》？", listOf("巴勃罗·毕加索", "乔治·布拉克", "胡安·格里斯", "费尔南·莱热"), "文化", "乔治·布拉克与毕加索共同创立了立体主义，他在1910-1911年间创作了这幅静物画，体现了这一时期典型的物体碎片化。"),
            es = LocalizedContent("¿Qué pintor pintó 'Vaso y jarra'?", listOf("Pablo Picasso", "Georges Braque", "Juan Gris", "Fernand Léger"), "Cultura", "Georges Braque, cofundador del cubismo con Picasso, pintó este bodegón en 1910-1911, ilustrando la fragmentación de objetos típica de este período.")
        ),
        BilingualQuestion(
            id = 10297, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie romaine, quel dieu est associé à la guerre?", listOf("Jupiter", "Mars", "Pluton", "Neptune"), "Culture", "Mars est le dieu romain de la guerre, équivalent du grec Arès, et l'une des divinités les plus vénérées à Rome, notamment comme père de Romulus et Rémus."),
            en = LocalizedContent("In Roman mythology, which god is associated with war?", listOf("Jupiter", "Mars", "Pluto", "Neptune"), "Culture", "Mars is the Roman god of war, equivalent to the Greek Ares, and one of the most venerated deities in Rome, notably as the father of Romulus and Remus."),
            zh = LocalizedContent("在罗马神话中，哪位神祇与战争相关？", listOf("朱庇特", "马尔斯", "普路托", "尼普顿"), "文化", "马尔斯是罗马的战争之神，相当于希腊的阿瑞斯，是罗马最受尊崇的神祇之一，尤其作为罗慕路斯和雷穆斯的父亲。"),
            es = LocalizedContent("En la mitología romana, ¿qué dios está asociado con la guerra?", listOf("Júpiter", "Marte", "Plutón", "Neptuno"), "Cultura", "Marte es el dios romano de la guerra, equivalente al griego Ares, y una de las deidades más veneradas en Roma, especialmente como padre de Rómulo y Remo.")
        ),
        BilingualQuestion(
            id = 10298, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de musique a émergé de Motown?", listOf("Soul", "R&B", "Pop", "Tous les trois"), "Culture", "Motown Records a produit de nombreux genres musicaux, incluant la soul, le rhythm and blues, et la pop, qui ont tous émergé de son catalogue emblématique."),
            en = LocalizedContent("Which style of music emerged from Motown?", listOf("Soul", "R&B", "Pop", "All three"), "Culture", "Motown Records produced many musical genres, including soul, rhythm and blues, and pop, all of which emerged from its iconic catalog."),
            zh = LocalizedContent("哪种音乐风格起源于摩城唱片？", listOf("灵魂乐", "节奏布鲁斯", "流行乐", "以上都是"), "文化", "摩城唱片制作了许多音乐类型，包括灵魂乐、节奏布鲁斯和流行乐，这些风格都源自其标志性的曲库。"),
            es = LocalizedContent("¿Qué estilo de música surgió de Motown?", listOf("Soul", "R&B", "Pop", "Los tres"), "Cultura", "Motown Records produjo muchos géneros musicales, incluyendo soul, rhythm and blues y pop, todos los cuales surgieron de su catálogo icónico.")
        ),
        BilingualQuestion(
            id = 10299, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Better Call Saul' s'est-il terminé?", listOf("2021", "2022", "2023", "2024"), "Culture", "La série Better Call Saul, spin-off de Breaking Bad, a diffusé son ultime épisode le 15 août 2022, mais sa sixième et dernière saison s'est officiellement conclue en 2023 avec la sortie du coffret DVD et la fin de sa diffusion internationale."),
            en = LocalizedContent("In what year did 'Better Call Saul' end?", listOf("2021", "2022", "2023", "2024"), "Culture", "The series Better Call Saul, a spin-off of Breaking Bad, aired its final episode on August 15, 2022, but its sixth and final season officially concluded in 2023 with the release of the DVD box set and the end of its international broadcast."),
            zh = LocalizedContent("《风骚律师》在哪一年完结？", listOf("2021", "2022", "2023", "2024"), "文化", "《风骚律师》是《绝命毒师》的衍生剧，最后一集于2022年8月15日播出，但其第六季即最终季在2023年随着DVD套装发行和国际播送结束而正式完结。"),
            es = LocalizedContent("¿En qué año terminó 'Better Call Saul'?", listOf("2021", "2022", "2023", "2024"), "Cultura", "La serie Better Call Saul, spin-off de Breaking Bad, emitió su último episodio el 15 de agosto de 2022, pero su sexta y última temporada concluyó oficialmente en 2023 con el lanzamiento del cofre de DVD y el fin de su transmisión internacional.")
        ),
        BilingualQuestion(
            id = 10300, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Paysage avec Pont'?", listOf("Paul Cézanne", "Vincent van Gogh", "Paul Gauguin", "Claude Monet"), "Culture", "Paul Cézanne a peint 'Paysage avec Pont' vers 1885, une œuvre représentant un pont sur l'Arc près d'Aix-en-Provence, région qui a souvent inspiré son travail."),
            en = LocalizedContent("Which painter created 'Landscape with Bridge'?", listOf("Paul Cézanne", "Vincent van Gogh", "Paul Gauguin", "Claude Monet"), "Culture", "Paul Cézanne painted 'Landscape with Bridge' around 1885, a work depicting a bridge over the Arc near Aix-en-Provence, a region that often inspired his work."),
            zh = LocalizedContent("哪位画家创作了《有桥的风景》？", listOf("保罗·塞尚", "文森特·梵高", "保罗·高更", "克劳德·莫奈"), "文化", "保罗·塞尚于1885年左右创作了《有桥的风景》，描绘了艾克斯普罗旺斯附近阿尔克河上的一座桥，该地区经常激发他的创作灵感。"),
            es = LocalizedContent("¿Qué pintor creó 'Paisaje con puente'?", listOf("Paul Cézanne", "Vincent van Gogh", "Paul Gauguin", "Claude Monet"), "Cultura", "Paul Cézanne pintó 'Paisaje con puente' hacia 1885, una obra que representa un puente sobre el Arc cerca de Aix-en-Provence, región que a menudo inspiró su trabajo.")
        ),
        BilingualQuestion(
            id = 10301, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie grecque, quel est le nom du centaure Chiron?", listOf("Centaure", "Chiron", "Sagittaire", "Hiron"), "Culture", "Chiron est le nom du centaure lui-même dans la mythologie grecque, célèbre pour sa sagesse et son rôle de précepteur de nombreux héros comme Achille."),
            en = LocalizedContent("In Greek mythology, what is the name of the centaur Chiron?", listOf("Centaure", "Chiron", "Sagittaire", "Hiron"), "Culture", "Chiron is the name of the centaur himself in Greek mythology, famous for his wisdom and role as tutor to many heroes like Achilles."),
            zh = LocalizedContent("在希腊神话中，半人马喀戎的名字是什么？", listOf("Centaure", "Chiron", "Sagittaire", "Hiron"), "文化", "喀戎是希腊神话中半人马的名字，以其智慧和作为阿喀琉斯等众多英雄导师的角色而闻名。"),
            es = LocalizedContent("En la mitología griega, ¿cuál es el nombre del centauro Quirón?", listOf("Centaure", "Chiron", "Sagittaire", "Hiron"), "Cultura", "Quirón es el nombre del centauro en la mitología griega, famoso por su sabiduría y su papel como tutor de muchos héroes como Aquiles.")
        ),
        BilingualQuestion(
            id = 10302, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de cuisine française est basé sur les ingrédients régionaux?", listOf("Cuisine de marché", "Cuisine paysanne", "Cuisine terroir", "Tous les trois"), "Culture", "La cuisine française s'appuie historiquement sur des produits locaux et des terroirs variés, ce qui rend chaque région distinctive. Ainsi, les styles comme la cuisine bourgeoise, la nouvelle cuisine ou la cuisine du terroir intègrent tous des ingrédients régionaux."),
            en = LocalizedContent("Which style of French cuisine is based on regional ingredients?", listOf("Market cuisine", "Peasant cuisine", "Terroir cuisine", "All three"), "Culture", "French cuisine historically relies on local products and varied terroirs, making each region distinctive. Thus, styles like bourgeois cuisine, nouvelle cuisine, or terroir cuisine all incorporate regional ingredients."),
            zh = LocalizedContent("哪种法式烹饪风格基于当地食材？", listOf("市场菜", "农家菜", "风土菜", "以上都是"), "文化", "法国烹饪历史上依赖于当地产品和多样的风土，使每个地区独具特色。因此，诸如资产阶级菜、新式菜或风土菜等风格都融入了当地食材。"),
            es = LocalizedContent("¿Qué estilo de cocina francesa se basa en ingredientes regionales?", listOf("Cocina de mercado", "Cocina campesina", "Cocina de terruño", "Los tres"), "Cultura", "La cocina francesa se basa históricamente en productos locales y terruños variados, lo que hace que cada región sea distintiva. Así, estilos como la cocina burguesa, la nouvelle cuisine o la cocina de terruño incorporan todos ingredientes regionales.")
        ),
        BilingualQuestion(
            id = 10303, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'Silicon Valley' a-t-il commencé?", listOf("2013", "2014", "2015", "2016"), "Culture", "La série télévisée humoristique 'Silicon Valley', créée par Mike Judge, a été diffusée pour la première fois en 2014 sur HBO, mais sa première saison complète a débuté en 2015."),
            en = LocalizedContent("In which year did 'Silicon Valley' start?", listOf("2013", "2014", "2015", "2016"), "Culture", "The humorous television series 'Silicon Valley', created by Mike Judge, first aired in 2014 on HBO, but its first full season began in 2015."),
            zh = LocalizedContent("《硅谷》在哪一年开播？", listOf("2013", "2014", "2015", "2016"), "文化", "由迈克·贾奇创作的幽默电视剧《硅谷》于2014年在HBO首播，但其第一完整季始于2015年。"),
            es = LocalizedContent("¿En qué año comenzó 'Silicon Valley'?", listOf("2013", "2014", "2015", "2016"), "Cultura", "La serie de televisión humorística 'Silicon Valley', creada por Mike Judge, se emitió por primera vez en 2014 en HBO, pero su primera temporada completa comenzó en 2015.")
        ),
        BilingualQuestion(
            id = 10304, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Dame en Rose'?", listOf("Diego Velázquez", "James McNeill Whistler", "John Singer Sargent", "Thomas Eakins"), "Culture", "John Singer Sargent a peint 'Dame en Rose' en 1882, un portrait de la mondaine américaine Mrs. Henry White."),
            en = LocalizedContent("Which painter painted 'Lady in Pink'?", listOf("Diego Velázquez", "James McNeill Whistler", "John Singer Sargent", "Thomas Eakins"), "Culture", "John Singer Sargent painted 'Lady in Pink' in 1882, a portrait of American socialite Mrs. Henry White."),
            zh = LocalizedContent("哪位画家创作了《穿粉色的女士》？", listOf("迭戈·委拉斯开兹", "詹姆斯·麦克尼尔·惠斯勒", "约翰·辛格·萨金特", "托马斯·埃金斯"), "文化", "约翰·辛格·萨金特于1882年创作了《穿粉色的女士》，这是一幅美国社交名流亨利·怀特夫人的肖像。"),
            es = LocalizedContent("¿Qué pintor pintó 'Dama de rosa'?", listOf("Diego Velázquez", "James McNeill Whistler", "John Singer Sargent", "Thomas Eakins"), "Cultura", "John Singer Sargent pintó 'Dama de rosa' en 1882, un retrato de la socialité estadounidense Sra. Henry White.")
        ),
        BilingualQuestion(
            id = 10305, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie égyptienne, quel dieu est associé à la sagesse?", listOf("Thot", "Seshat", "Khépri", "Tefnout"), "Culture", "Thot est le dieu égyptien de l'écriture, de la sagesse et de la connaissance, souvent représenté avec une tête d'ibis ou de babouin."),
            en = LocalizedContent("In Egyptian mythology, which god is associated with wisdom?", listOf("Thoth", "Seshat", "Khepri", "Tefnut"), "Culture", "Thoth is the Egyptian god of writing, wisdom, and knowledge, often depicted with the head of an ibis or a baboon."),
            zh = LocalizedContent("在埃及神话中，哪位神与智慧相关？", listOf("托特", "塞莎特", "凯布利", "泰芙努特"), "文化", "托特是埃及的书写、智慧和知识之神，常被描绘成朱鹭头或狒狒头。"),
            es = LocalizedContent("En la mitología egipcia, ¿qué dios está asociado con la sabiduría?", listOf("Thot", "Seshat", "Khepri", "Tefnut"), "Cultura", "Thot es el dios egipcio de la escritura, la sabiduría y el conocimiento, a menudo representado con cabeza de ibis o de babuino.")
        ),
        BilingualQuestion(
            id = 10306, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit 'Afternoon of a Faun'?", listOf("Claude Debussy", "Maurice Ravel", "Erik Satie", "Gabriel Fauré"), "Culture", "Claude Debussy a composé \"Prélude à l'après-midi d'un faune\" en 1894, inspiré par un poème de Stéphane Mallarmé. Cette œuvre marque un tournant vers le modernisme musical."),
            en = LocalizedContent("Which composer wrote 'Afternoon of a Faun'?", listOf("Claude Debussy", "Maurice Ravel", "Erik Satie", "Gabriel Fauré"), "Culture", "Claude Debussy composed 'Prélude à l'après-midi d'un faune' in 1894, inspired by a poem by Stéphane Mallarmé. This work marks a turning point towards musical modernism."),
            zh = LocalizedContent("哪位作曲家创作了《牧神午后》？", listOf("克劳德·德彪西", "莫里斯·拉威尔", "埃里克·萨蒂", "加布里埃尔·福雷"), "文化", "克劳德·德彪西于1894年创作了《牧神午后前奏曲》，灵感来自斯特凡·马拉美的诗。这部作品标志着向音乐现代主义的转折。"),
            es = LocalizedContent("¿Qué compositor escribió 'La siesta de un fauno'?", listOf("Claude Debussy", "Maurice Ravel", "Erik Satie", "Gabriel Fauré"), "Cultura", "Claude Debussy compuso 'Prélude à l'après-midi d'un faune' en 1894, inspirado en un poema de Stéphane Mallarmé. Esta obra marca un punto de inflexión hacia el modernismo musical.")
        ),
        BilingualQuestion(
            id = 10307, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'The Diplomat' a-t-il commencé?", listOf("2022", "2023", "2024", "2025"), "Culture", "La série télévisée 'The Diplomat' a débuté en 2024 sur Netflix, suivant une diplomate américaine dans un poste à haut risque au Royaume-Uni."),
            en = LocalizedContent("In which year did 'The Diplomat' start?", listOf("2022", "2023", "2024", "2025"), "Culture", "The television series 'The Diplomat' began in 2024 on Netflix, following an American diplomat in a high-risk post in the United Kingdom."),
            zh = LocalizedContent("《外交官》在哪一年开播？", listOf("2022", "2023", "2024", "2025"), "文化", "电视剧《外交官》于2024年在Netflix开播，讲述一位美国外交官在英国担任高风险职务的故事。"),
            es = LocalizedContent("¿En qué año comenzó 'The Diplomat'?", listOf("2022", "2023", "2024", "2025"), "Cultura", "La serie de televisión 'The Diplomat' comenzó en 2024 en Netflix, siguiendo a una diplomática estadounidense en un puesto de alto riesgo en el Reino Unido.")
        ),
        BilingualQuestion(
            id = 10308, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Trois Femmes'?", listOf("Pablo Picasso", "Henri Matisse", "Georges Braque", "Fernand Léger"), "Culture", "Pablo Picasso a peint 'Trois Femmes' en 1908, une œuvre qui marque sa transition vers le cubisme, influencée par l'art africain et ibérique."),
            en = LocalizedContent("Which painter created 'Three Women'?", listOf("Pablo Picasso", "Henri Matisse", "Georges Braque", "Fernand Léger"), "Culture", "Pablo Picasso painted 'Three Women' in 1908, a work marking his transition to Cubism, influenced by African and Iberian art."),
            zh = LocalizedContent("哪位画家创作了《三个女人》？", listOf("巴勃罗·毕加索", "亨利·马蒂斯", "乔治·布拉克", "费尔南·莱热"), "文化", "巴勃罗·毕加索于1908年创作了《三个女人》，这部作品标志着他向立体主义的过渡，受到非洲和伊比利亚艺术的影响。"),
            es = LocalizedContent("¿Qué pintor creó 'Tres mujeres'?", listOf("Pablo Picasso", "Henri Matisse", "Georges Braque", "Fernand Léger"), "Cultura", "Pablo Picasso pintó 'Tres mujeres' en 1908, una obra que marca su transición al cubismo, influenciada por el arte africano e ibérico.")
        ),
        BilingualQuestion(
            id = 10309, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie grecque, quel est le nom du dieu du sommeil?", listOf("Morphée", "Hypnos", "Phantasos", "Thanaté"), "Culture", "Hypnos est le dieu grec du sommeil, fils de Nyx (la Nuit) et frère jumeau de Thanatos (la Mort)."),
            en = LocalizedContent("In Greek mythology, what is the name of the god of sleep?", listOf("Morpheus", "Hypnos", "Phantasos", "Thanatos"), "Culture", "Hypnos is the Greek god of sleep, son of Nyx (Night) and twin brother of Thanatos (Death)."),
            zh = LocalizedContent("在希腊神话中，睡眠之神的名字是什么？", listOf("摩耳甫斯", "许普诺斯", "方塔索斯", "塔纳托斯"), "文化", "许普诺斯是希腊的睡眠之神，倪克斯（夜）之子，塔纳托斯（死亡）的孪生兄弟。"),
            es = LocalizedContent("En la mitología griega, ¿cuál es el nombre del dios del sueño?", listOf("Morféo", "Hipnos", "Fantaso", "Tánatos"), "Cultura", "Hipnos es el dios griego del sueño, hijo de Nix (la Noche) y hermano gemelo de Tánatos (la Muerte).")
        ),
        BilingualQuestion(
            id = 10310, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de danse est associé à Fred Astaire?", listOf("Tap Dance", "Swing", "Foxtrot", "Tous les trois"), "Culture", "Fred Astaire excellait dans le claquette, la danse de salon et la danse jazz, maîtrisant ces trois styles avec une élégance légendaire au cinéma."),
            en = LocalizedContent("Which dance style is associated with Fred Astaire?", listOf("Tap Dance", "Swing", "Foxtrot", "All three"), "Culture", "Fred Astaire excelled in tap, ballroom, and jazz dance, mastering all three styles with legendary elegance on film."),
            zh = LocalizedContent("哪种舞蹈风格与弗雷德·阿斯泰尔相关？", listOf("踢踏舞", "摇摆舞", "狐步舞", "以上都是"), "文化", "弗雷德·阿斯泰尔擅长踢踏舞、交谊舞和爵士舞，在电影中以传奇般的优雅掌握了这三种风格。"),
            es = LocalizedContent("¿Qué estilo de baile se asocia con Fred Astaire?", listOf("Claqué", "Swing", "Foxtrot", "Los tres"), "Cultura", "Fred Astaire destacó en claqué, baile de salón y danza jazz, dominando estos tres estilos con una elegancia legendaria en el cine.")
        ),
        BilingualQuestion(
            id = 10311, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'White Lotus' a-t-il commencé?", listOf("2020", "2021", "2022", "2023"), "Culture", "La série télévisée satirique 'White Lotus' a été créée par Mike White et diffusée pour la première fois sur HBO en juillet 2021."),
            en = LocalizedContent("In what year did 'White Lotus' start?", listOf("2020", "2021", "2022", "2023"), "Culture", "The satirical television series 'White Lotus' was created by Mike White and first aired on HBO in July 2021."),
            zh = LocalizedContent("《白莲花度假村》是哪一年开播的？", listOf("2020", "2021", "2022", "2023"), "文化", "讽刺电视剧《白莲花度假村》由迈克·怀特创作，于2021年7月在HBO首播。"),
            es = LocalizedContent("¿En qué año comenzó 'White Lotus'?", listOf("2020", "2021", "2022", "2023"), "Cultura", "La serie satírica 'White Lotus' fue creada por Mike White y se emitió por primera vez en HBO en julio de 2021.")
        ),
        BilingualQuestion(
            id = 10312, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Solitude'?", listOf("Edward Hopper", "Andrew Wyeth", "Grant Wood", "Thomas Hart Benton"), "Culture", "Edward Hopper a peint 'Solitude' en 1944, une œuvre représentant une femme assise seule dans un intérieur, typique de son exploration des thèmes de l'isolement et de la mélancolie dans la vie moderne américaine."),
            en = LocalizedContent("Which painter painted 'Solitude'?", listOf("Edward Hopper", "Andrew Wyeth", "Grant Wood", "Thomas Hart Benton"), "Culture", "Edward Hopper painted 'Solitude' in 1944, depicting a woman sitting alone in an interior, typical of his exploration of themes of isolation and melancholy in modern American life."),
            zh = LocalizedContent("哪位画家创作了《孤独》？", listOf("爱德华·霍珀", "安德鲁·怀斯", "格兰特·伍德", "托马斯·哈特·本顿"), "文化", "爱德华·霍珀于1944年创作了《孤独》，描绘了一位独自坐在室内的女性，典型地探索了现代美国生活中的孤立与忧郁主题。"),
            es = LocalizedContent("¿Qué pintor pintó 'Soledad'?", listOf("Edward Hopper", "Andrew Wyeth", "Grant Wood", "Thomas Hart Benton"), "Cultura", "Edward Hopper pintó 'Soledad' en 1944, representando a una mujer sentada sola en un interior, típico de su exploración de temas de aislamiento y melancolía en la vida moderna estadounidense.")
        ),
        BilingualQuestion(
            id = 10313, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie hindoue, quel dieu est associé à l'amour?", listOf("Agni", "Kamadeva", "Varuna", "Vayu"), "Culture", "Kamadeva est le dieu hindou de l'amour, comparable à Éros ou Cupidon dans les mythologies grecque et romaine. Il est souvent représenté avec un arc en canne à sucre et des flèches de fleurs."),
            en = LocalizedContent("In Hindu mythology, which god is associated with love?", listOf("Agni", "Kamadeva", "Varuna", "Vayu"), "Culture", "Kamadeva is the Hindu god of love, comparable to Eros or Cupid in Greek and Roman mythologies. He is often depicted with a sugarcane bow and flower arrows."),
            zh = LocalizedContent("在印度神话中，哪位神祇与爱情相关？", listOf("阿耆尼", "伽摩", "伐楼那", "伐由"), "文化", "伽摩是印度神话中的爱神，相当于希腊和罗马神话中的厄洛斯或丘比特。他常被描绘为手持甘蔗弓和花箭。"),
            es = LocalizedContent("En la mitología hindú, ¿qué dios está asociado con el amor?", listOf("Agni", "Kamadeva", "Varuna", "Vayu"), "Cultura", "Kamadeva es el dios hindú del amor, comparable a Eros o Cupido en las mitologías griega y romana. A menudo se le representa con un arco de caña de azúcar y flechas de flores.")
        ),
        BilingualQuestion(
            id = 10314, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de musique vient de l'Afrique du Nord?", listOf("Raï", "Gnaoua", "Chaâbi", "Tous les trois"), "Culture", "Le raï, le chaâbi et le gnawa sont tous des styles musicaux originaires d'Afrique du Nord, principalement du Maroc, d'Algérie et de Tunisie."),
            en = LocalizedContent("Which style of music comes from North Africa?", listOf("Raï", "Gnaoua", "Chaâbi", "All three"), "Culture", "Raï, Chaâbi, and Gnawa are all musical styles originating from North Africa, mainly Morocco, Algeria, and Tunisia."),
            zh = LocalizedContent("哪种音乐风格源自北非？", listOf("拉伊", "格纳瓦", "沙比", "以上都是"), "文化", "拉伊、沙比和格纳瓦都是源自北非的音乐风格，主要来自摩洛哥、阿尔及利亚和突尼斯。"),
            es = LocalizedContent("¿Qué estilo de música proviene del norte de África?", listOf("Raï", "Gnaoua", "Chaâbi", "Los tres"), "Cultura", "El raï, el chaâbi y el gnawa son estilos musicales originarios del norte de África, principalmente de Marruecos, Argelia y Túnez.")
        ),
        BilingualQuestion(
            id = 10315, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Bling Empire' a-t-il commencé?", listOf("2020", "2021", "2022", "2023"), "Culture", "Bling Empire, une téléréalité sur la jet-set asiatique de Los Angeles, a été diffusée pour la première fois sur Netflix en 2021."),
            en = LocalizedContent("In what year did 'Bling Empire' start?", listOf("2020", "2021", "2022", "2023"), "Culture", "Bling Empire, a reality show about the Asian jet set in Los Angeles, first aired on Netflix in 2021."),
            zh = LocalizedContent("《璀璨帝国》是哪一年开播的？", listOf("2020", "2021", "2022", "2023"), "文化", "《璀璨帝国》是一部关于洛杉矶亚洲富豪的真人秀，于2021年在Netflix首播。"),
            es = LocalizedContent("¿En qué año comenzó 'Bling Empire'?", listOf("2020", "2021", "2022", "2023"), "Cultura", "Bling Empire, un reality show sobre la jet set asiática en Los Ángeles, se emitió por primera vez en Netflix en 2021.")
        ),
        BilingualQuestion(
            id = 10316, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel peintre a créé 'Automne'?", listOf("Giuseppe Arcimboldo", "Pierre-Auguste Renoir", "Paul Cézanne", "Vincent van Gogh"), "Culture", "Giuseppe Arcimboldo est connu pour ses portraits composites réalisés avec des fruits, légumes et objets. 'Automne' fait partie de sa série des Quatre Saisons, où il représente la saison avec une tête composée de raisins, pommes et autres fruits d'automne."),
            en = LocalizedContent("Which painter created 'Autumn'?", listOf("Giuseppe Arcimboldo", "Pierre-Auguste Renoir", "Paul Cézanne", "Vincent van Gogh"), "Culture", "Giuseppe Arcimboldo is known for his composite portraits made of fruits, vegetables, and objects. 'Autumn' is part of his Four Seasons series, depicting the season with a head composed of grapes, apples, and other autumn fruits."),
            zh = LocalizedContent("哪位画家创作了《秋天》？", listOf("朱塞佩·阿尔钦博多", "皮埃尔-奥古斯特·雷诺阿", "保罗·塞尚", "文森特·梵高"), "文化", "朱塞佩·阿尔钦博多以用水果、蔬菜和物品组成的复合肖像画闻名。《秋天》是他的《四季》系列之一，用葡萄、苹果和其他秋季水果组成头部来表现季节。"),
            es = LocalizedContent("¿Qué pintor creó 'Otoño'?", listOf("Giuseppe Arcimboldo", "Pierre-Auguste Renoir", "Paul Cézanne", "Vincent van Gogh"), "Cultura", "Giuseppe Arcimboldo es conocido por sus retratos compuestos de frutas, verduras y objetos. 'Otoño' es parte de su serie de las Cuatro Estaciones, representando la estación con una cabeza compuesta de uvas, manzanas y otras frutas otoñales.")
        ),
        BilingualQuestion(
            id = 10317, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie grecque, quel est le nom du Titan des Mers?", listOf("Hypérion", "Océan", "Coeus", "Théia"), "Culture", "Dans la mythologie grecque, Océan est le Titan qui personnifie le fleuve censé entourer la Terre, considéré comme la source de toutes les eaux marines et fluviales."),
            en = LocalizedContent("In Greek mythology, what is the name of the Titan of the Sea?", listOf("Hyperion", "Oceanus", "Coeus", "Theia"), "Culture", "In Greek mythology, Oceanus is the Titan who personifies the river believed to encircle the Earth, considered the source of all marine and river waters."),
            zh = LocalizedContent("在希腊神话中，海洋泰坦的名字是什么？", listOf("许珀里翁", "俄刻阿诺斯", "科俄斯", "忒亚"), "文化", "在希腊神话中，俄刻阿诺斯是代表环绕大地的河流的泰坦，被认为是所有海洋和河流水源的源头。"),
            es = LocalizedContent("En la mitología griega, ¿cuál es el nombre del Titán del Mar?", listOf("Hiperión", "Océano", "Ceo", "Tea"), "Cultura", "En la mitología griega, Océano es el Titán que personifica el río que se creía rodeaba la Tierra, considerado la fuente de todas las aguas marinas y fluviales.")
        ),
        BilingualQuestion(
            id = 10318, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel style de cuisine est caractérisé par le kimchi?", listOf("Cuisine coréenne", "Cuisine thaïlandaise", "Cuisine vietnamienne", "Cuisine japonaise"), "Culture", "Le kimchi, un plat de légumes fermentés épicés, est un élément fondamental et emblématique de la gastronomie coréenne."),
            en = LocalizedContent("Which style of cuisine is characterized by kimchi?", listOf("Korean cuisine", "Thai cuisine", "Vietnamese cuisine", "Japanese cuisine"), "Culture", "Kimchi, a spicy fermented vegetable dish, is a fundamental and iconic element of Korean gastronomy."),
            zh = LocalizedContent("哪种菜系以泡菜为特色？", listOf("韩国菜", "泰国菜", "越南菜", "日本菜"), "文化", "泡菜是一种辛辣的发酵蔬菜菜肴，是韩国美食的基本和标志性元素。"),
            es = LocalizedContent("¿Qué estilo de cocina se caracteriza por el kimchi?", listOf("Cocina coreana", "Cocina tailandesa", "Cocina vietnamita", "Cocina japonesa"), "Cultura", "El kimchi, un plato de verduras fermentadas picantes, es un elemento fundamental e icónico de la gastronomía coreana.")
        ),
        BilingualQuestion(
            id = 10319, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'Emily in Paris' a-t-il commencé?", listOf("2019", "2020", "2021", "2022"), "Culture", "La série 'Emily in Paris' a été diffusée pour la première fois sur Netflix en octobre 2020."),
            en = LocalizedContent("In what year did 'Emily in Paris' start?", listOf("2019", "2020", "2021", "2022"), "Culture", "The series 'Emily in Paris' first aired on Netflix in October 2020."),
            zh = LocalizedContent("《艾米丽在巴黎》是哪一年开播的？", listOf("2019", "2020", "2021", "2022"), "文化", "《艾米丽在巴黎》于2020年10月在Netflix首播。"),
            es = LocalizedContent("¿En qué año comenzó 'Emily in Paris'?", listOf("2019", "2020", "2021", "2022"), "Cultura", "La serie 'Emily in Paris' se emitió por primera vez en Netflix en octubre de 2020.")
        ),
        BilingualQuestion(
            id = 10320, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Jeunes Filles dansant'?", listOf("Pierre-Auguste Renoir", "Claude Monet", "Berthe Morisot", "Mary Cassatt"), "Culture", "Jeunes Filles dansant est une œuvre de Pierre-Auguste Renoir, peinte vers 1885, représentant deux fillettes dans un jardin, typique de son style impressionniste."),
            en = LocalizedContent("Which painter painted 'Young Girls Dancing'?", listOf("Pierre-Auguste Renoir", "Claude Monet", "Berthe Morisot", "Mary Cassatt"), "Culture", "'Young Girls Dancing' is a work by Pierre-Auguste Renoir, painted around 1885, depicting two little girls in a garden, typical of his Impressionist style."),
            zh = LocalizedContent("哪位画家创作了《跳舞的少女》？", listOf("皮埃尔-奥古斯特·雷诺阿", "克劳德·莫奈", "贝尔特·莫里索", "玛丽·卡萨特"), "文化", "《跳舞的少女》是皮埃尔-奥古斯特·雷诺阿的作品，创作于1885年左右，描绘了两个小女孩在花园中的场景，体现了他印象派的典型风格。"),
            es = LocalizedContent("¿Qué pintor pintó 'Jóvenes bailando'?", listOf("Pierre-Auguste Renoir", "Claude Monet", "Berthe Morisot", "Mary Cassatt"), "Cultura", "'Jóvenes bailando' es una obra de Pierre-Auguste Renoir, pintada hacia 1885, que representa a dos niñas en un jardín, típica de su estilo impresionista.")
        ),
        BilingualQuestion(
            id = 10321, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie romaine, quel est le nom de la déesse de la chasse?", listOf("Junon", "Minerve", "Diane", "Mercure"), "Culture", "Diane est l'équivalent romain de la déesse grecque Artémis, toutes deux associées à la chasse, la nature et la lune."),
            en = LocalizedContent("In Roman mythology, what is the name of the goddess of the hunt?", listOf("Juno", "Minerva", "Diana", "Mercury"), "Culture", "Diana is the Roman equivalent of the Greek goddess Artemis, both associated with hunting, nature, and the moon."),
            zh = LocalizedContent("在罗马神话中，狩猎女神的名字是什么？", listOf("朱诺", "密涅瓦", "狄安娜", "墨丘利"), "文化", "狄安娜是希腊女神阿尔忒弥斯的罗马对应者，两者都与狩猎、自然和月亮有关。"),
            es = LocalizedContent("En la mitología romana, ¿cuál es el nombre de la diosa de la caza?", listOf("Juno", "Minerva", "Diana", "Mercurio"), "Cultura", "Diana es el equivalente romano de la diosa griega Artemisa, ambas asociadas con la caza, la naturaleza y la luna.")
        ),
        BilingualQuestion(
            id = 10322, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit 'La Danse Macabre'?", listOf("Camille Saint-Saëns", "Hector Berlioz", "Georges Bizet", "Gioachino Rossini"), "Culture", "Camille Saint-Saëns a composé ce poème symphonique en 1874, s'inspirant d'un poème d'Henri Cazalis sur la mort dansant à minuit."),
            en = LocalizedContent("Which composer wrote 'Danse Macabre'?", listOf("Camille Saint-Saëns", "Hector Berlioz", "Georges Bizet", "Gioachino Rossini"), "Culture", "Camille Saint-Saëns composed this symphonic poem in 1874, inspired by a poem by Henri Cazalis about death dancing at midnight."),
            zh = LocalizedContent("哪位作曲家创作了《骷髅之舞》？", listOf("卡米尔·圣桑", "埃克托·柏辽兹", "乔治·比才", "焦阿基诺·罗西尼"), "文化", "卡米尔·圣桑于1874年创作了这首交响诗，灵感来自亨利·卡扎利斯关于午夜死神跳舞的诗。"),
            es = LocalizedContent("¿Qué compositor escribió 'La Danza Macabra'?", listOf("Camille Saint-Saëns", "Hector Berlioz", "Georges Bizet", "Gioachino Rossini"), "Cultura", "Camille Saint-Saëns compuso este poema sinfónico en 1874, inspirado en un poema de Henri Cazalis sobre la muerte bailando a medianoche.")
        ),
        BilingualQuestion(
            id = 10323, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Mindhunter' a-t-il commencé?", listOf("2016", "2017", "2018", "2019"), "Culture", "La série policière 'Mindhunter', créée par Joe Penhall et produite par David Fincher, a été diffusée pour la première fois sur Netflix en 2017."),
            en = LocalizedContent("In which year did 'Mindhunter' start?", listOf("2016", "2017", "2018", "2019"), "Culture", "The crime series 'Mindhunter', created by Joe Penhall and produced by David Fincher, first aired on Netflix in 2017."),
            zh = LocalizedContent("《心灵猎人》在哪一年开播？", listOf("2016", "2017", "2018", "2019"), "文化", "犯罪剧《心灵猎人》由乔·彭霍尔创作、大卫·芬奇制作，于2017年在Netflix首播。"),
            es = LocalizedContent("¿En qué año comenzó 'Mindhunter'?", listOf("2016", "2017", "2018", "2019"), "Cultura", "La serie policiaca 'Mindhunter', creada por Joe Penhall y producida por David Fincher, se estrenó en Netflix en 2017.")
        ),
        BilingualQuestion(
            id = 10324, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel peintre a créé 'Intérieur avec Figures'?", listOf("Pieter de Hooch", "Johannes Vermeer", "Jan Steen", "Gerard ter Borch"), "Culture", "Pieter de Hooch, peintre néerlandais du Siècle d'or, a réalisé 'Intérieur avec Figures' vers 1665, une scène domestique typique de son œuvre."),
            en = LocalizedContent("Which painter created 'Interior with Figures'?", listOf("Pieter de Hooch", "Johannes Vermeer", "Jan Steen", "Gerard ter Borch"), "Culture", "Pieter de Hooch, a Dutch Golden Age painter, created 'Interior with Figures' around 1665, a typical domestic scene of his work."),
            zh = LocalizedContent("哪位画家创作了《室内人物》？", listOf("彼得·德·霍赫", "约翰内斯·维米尔", "扬·斯滕", "赫拉德·特博赫"), "文化", "荷兰黄金时代画家彼得·德·霍赫于1665年左右创作了《室内人物》，这是他典型的家庭场景作品。"),
            es = LocalizedContent("¿Qué pintor creó 'Interior con figuras'?", listOf("Pieter de Hooch", "Johannes Vermeer", "Jan Steen", "Gerard ter Borch"), "Cultura", "Pieter de Hooch, pintor neerlandés del Siglo de Oro, realizó 'Interior con figuras' hacia 1665, una escena doméstica típica de su obra.")
        ),
        BilingualQuestion(
            id = 10325, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie grecque, qui est la mère d'Aphrodite?", listOf("Métis", "Thémis", "Océan et Théis", "Uranus et Gaïa"), "Culture", "Selon Hésiode, Aphrodite naît de l'écume formée par les organes d'Ouranos tombés dans la mer, mais une autre tradition la fait fille d'Océan et de Théis, divinités marines."),
            en = LocalizedContent("In Greek mythology, who is the mother of Aphrodite?", listOf("Metis", "Themis", "Oceanus and Tethys", "Uranus and Gaia"), "Culture", "According to Hesiod, Aphrodite was born from the foam formed by Uranus's genitals falling into the sea, but another tradition makes her the daughter of Oceanus and Tethys, marine deities."),
            zh = LocalizedContent("在希腊神话中，阿佛洛狄忒的母亲是谁？", listOf("墨提斯", "忒弥斯", "俄刻阿诺斯和忒堤斯", "乌拉诺斯和盖亚"), "文化", "根据赫西俄德，阿佛洛狄忒诞生于乌拉诺斯的生殖器落入海中形成的泡沫，但另一种传统认为她是海洋神祇俄刻阿诺斯和忒堤斯的女儿。"),
            es = LocalizedContent("En la mitología griega, ¿quién es la madre de Afrodita?", listOf("Metis", "Temis", "Océano y Tetis", "Urano y Gea"), "Cultura", "Según Hesíodo, Afrodita nació de la espuma formada por los genitales de Urano al caer al mar, pero otra tradición la hace hija de Océano y Tetis, deidades marinas.")
        ),
        BilingualQuestion(
            id = 10326, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de danse a émergé de la Turquie?", listOf("Belly Dance", "Turkish Dance", "Sufi Dance", "Tous les trois"), "Culture", "La Turquie a vu émerger plusieurs danses traditionnelles, comme la danse du ventre, le zeybek et le halay, toutes issues de sa riche culture régionale."),
            en = LocalizedContent("Which dance style emerged from Turkey?", listOf("Belly Dance", "Turkish Dance", "Sufi Dance", "All three"), "Culture", "Turkey has seen the emergence of several traditional dances, such as belly dance, zeybek, and halay, all stemming from its rich regional culture."),
            zh = LocalizedContent("哪种舞蹈风格源自土耳其？", listOf("肚皮舞", "土耳其舞", "苏菲舞", "以上所有"), "文化", "土耳其涌现了多种传统舞蹈，如肚皮舞、泽贝克舞和哈莱舞，均源于其丰富的地区文化。"),
            es = LocalizedContent("¿Qué estilo de danza surgió de Turquía?", listOf("Danza del vientre", "Danza turca", "Danza sufí", "Los tres"), "Cultura", "Turquía ha visto surgir varias danzas tradicionales, como la danza del vientre, el zeybek y el halay, todas provenientes de su rica cultura regional.")
        ),
        BilingualQuestion(
            id = 10327, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Defending Jacob' a-t-il été lancé?", listOf("2019", "2020", "2021", "2022"), "Culture", "Defending Jacob, une série dramatique policière avec Chris Evans, a été diffusée pour la première fois sur Apple TV+ en avril 2020."),
            en = LocalizedContent("In which year was 'Defending Jacob' launched?", listOf("2019", "2020", "2021", "2022"), "Culture", "'Defending Jacob', a crime drama series starring Chris Evans, first aired on Apple TV+ in April 2020."),
            zh = LocalizedContent("《捍卫雅各布》在哪一年上线？", listOf("2019", "2020", "2021", "2022"), "文化", "犯罪剧《捍卫雅各布》由克里斯·埃文斯主演，于2020年4月在Apple TV+首播。"),
            es = LocalizedContent("¿En qué año se lanzó 'Defending Jacob'?", listOf("2019", "2020", "2021", "2022"), "Cultura", "'Defending Jacob', una serie dramática policiaca protagonizada por Chris Evans, se estrenó en Apple TV+ en abril de 2020.")
        ),
        BilingualQuestion(
            id = 10328, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Femme lisant'?", listOf("Pierre-Auguste Renoir", "Berthe Morisot", "Mary Cassatt", "Eva Gonzalès"), "Culture", "Berthe Morisot, figure majeure de l'impressionnisme, a peint 'Femme lisant' en 1873, représentant souvent des scènes intimes de la vie quotidienne féminine."),
            en = LocalizedContent("Which painter painted 'Woman Reading'?", listOf("Pierre-Auguste Renoir", "Berthe Morisot", "Mary Cassatt", "Eva Gonzalès"), "Culture", "Berthe Morisot, a major figure of Impressionism, painted 'Woman Reading' in 1873, often depicting intimate scenes of women's daily life."),
            zh = LocalizedContent("哪位画家创作了《阅读的女人》？", listOf("皮埃尔-奥古斯特·雷诺阿", "贝尔特·莫里索", "玛丽·卡萨特", "埃娃·冈萨雷斯"), "文化", "贝尔特·莫里索是印象派的重要人物，于1873年创作了《阅读的女人》，常描绘女性日常生活的亲密场景。"),
            es = LocalizedContent("¿Qué pintor pintó 'Mujer leyendo'?", listOf("Pierre-Auguste Renoir", "Berthe Morisot", "Mary Cassatt", "Eva Gonzalès"), "Cultura", "Berthe Morisot, figura importante del impresionismo, pintó 'Mujer leyendo' en 1873, representando a menudo escenas íntimas de la vida cotidiana femenina.")
        ),
        BilingualQuestion(
            id = 10329, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie égyptienne, quel dieu est le dieu de la fertilité?", listOf("Geb", "Nut", "Min", "Sobek"), "Culture", "Min est le dieu égyptien de la fertilité et de la reproduction, souvent représenté avec un phallus en érection et un fouet."),
            en = LocalizedContent("In Egyptian mythology, which god is the god of fertility?", listOf("Geb", "Nut", "Min", "Sobek"), "Culture", "Min is the Egyptian god of fertility and reproduction, often depicted with an erect phallus and a whip."),
            zh = LocalizedContent("在埃及神话中，哪位神是生育之神？", listOf("盖布", "努特", "敏", "索贝克"), "文化", "敏是埃及的生育和繁殖之神，常被描绘为勃起的阴茎和手持鞭子。"),
            es = LocalizedContent("En la mitología egipcia, ¿qué dios es el dios de la fertilidad?", listOf("Geb", "Nut", "Min", "Sobek"), "Cultura", "Min es el dios egipcio de la fertilidad y la reproducción, a menudo representado con un falo erecto y un látigo.")
        ),
    )

    private fun part6(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 10330, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de musique a émergé de Nashville?", listOf("Country", "Bluegrass", "Honky-tonk", "Tous les trois"), "Culture", "Nashville est historiquement associée à la musique country, mais la ville a aussi vu émerger le gospel et le rockabilly, d'où la réponse \"Tous les trois\"."),
            en = LocalizedContent("Which style of music emerged from Nashville?", listOf("Country", "Bluegrass", "Honky-tonk", "All three"), "Culture", "Nashville is historically associated with country music, but the city also saw the emergence of gospel and rockabilly, hence the answer \"All three\"."),
            zh = LocalizedContent("哪种音乐风格起源于纳什维尔？", listOf("乡村音乐", "蓝草音乐", "酒吧音乐", "以上三种"), "文化", "纳什维尔历史上与乡村音乐相关，但该市也见证了福音音乐和摇滚比利音乐的出现，因此答案是“以上三种”。"),
            es = LocalizedContent("¿Qué estilo de música surgió de Nashville?", listOf("Country", "Bluegrass", "Honky-tonk", "Los tres"), "Cultura", "Nashville está históricamente asociada con la música country, pero la ciudad también vio surgir el gospel y el rockabilly, de ahí la respuesta \"Los tres\".")
        ),
        BilingualQuestion(
            id = 10331, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'The Plot Against America' a-t-il été lancé?", listOf("2019", "2020", "2021", "2022"), "Culture", "The Plot Against America, une série télévisée adaptée du roman de Philip Roth, a été diffusée pour la première fois en mars 2020 sur HBO."),
            en = LocalizedContent("In what year was 'The Plot Against America' launched?", listOf("2019", "2020", "2021", "2022"), "Culture", "The Plot Against America, a television series adapted from Philip Roth's novel, first aired in March 2020 on HBO."),
            zh = LocalizedContent("《反美阴谋》在哪一年首播？", listOf("2019", "2020", "2021", "2022"), "文化", "《反美阴谋》是一部改编自菲利普·罗斯小说的电视剧，于2020年3月在HBO首播。"),
            es = LocalizedContent("¿En qué año se lanzó 'The Plot Against America'?", listOf("2019", "2020", "2021", "2022"), "Cultura", "The Plot Against America, una serie de televisión adaptada de la novela de Philip Roth, se emitió por primera vez en marzo de 2020 en HBO.")
        ),
        BilingualQuestion(
            id = 10332, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel peintre a créé 'Promenade dans le Parc'?", listOf("Canaletto", "Bernardo Bellotto", "Francesco Guardi", "Giambattista Tiepolo"), "Culture", "Francesco Guardi, peintre vénitien du XVIIIe siècle, est connu pour ses vedute et ses scènes de la vie quotidienne à Venise, dont fait partie 'Promenade dans le Parc'."),
            en = LocalizedContent("Which painter created 'Promenade in the Park'?", listOf("Canaletto", "Bernardo Bellotto", "Francesco Guardi", "Giambattista Tiepolo"), "Culture", "Francesco Guardi, an 18th-century Venetian painter, is known for his vedute and scenes of daily life in Venice, including 'Promenade in the Park'."),
            zh = LocalizedContent("哪位画家创作了《公园漫步》？", listOf("卡纳莱托", "贝尔纳多·贝洛托", "弗朗切斯科·瓜尔迪", "詹巴蒂斯塔·提埃坡罗"), "文化", "弗朗切斯科·瓜尔迪是18世纪威尼斯画家，以其风景画和威尼斯日常生活场景而闻名，其中包括《公园漫步》。"),
            es = LocalizedContent("¿Qué pintor creó 'Paseo en el Parque'?", listOf("Canaletto", "Bernardo Bellotto", "Francesco Guardi", "Giambattista Tiepolo"), "Cultura", "Francesco Guardi, pintor veneciano del siglo XVIII, es conocido por sus vedute y escenas de la vida cotidiana en Venecia, incluido 'Paseo en el Parque'.")
        ),
        BilingualQuestion(
            id = 10333, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie grecque, quel est le nom de la Parque du Destin?", listOf("Clotho", "Lachésis", "Atropos", "Parcae"), "Culture", "Dans la mythologie grecque, les trois Parques (Moires) sont Clotho, Lachésis et Atropos. Lachésis est celle qui mesure le fil de la vie, attribuant ainsi le destin à chaque mortel."),
            en = LocalizedContent("In Greek mythology, what is the name of the Fate of Destiny?", listOf("Clotho", "Lachesis", "Atropos", "Parcae"), "Culture", "In Greek mythology, the three Fates (Moirai) are Clotho, Lachesis, and Atropos. Lachesis is the one who measures the thread of life, thus assigning destiny to each mortal."),
            zh = LocalizedContent("在希腊神话中，命运女神的名字是什么？", listOf("克洛托", "拉刻西斯", "阿特罗波斯", "帕耳开"), "文化", "在希腊神话中，三位命运女神（摩伊拉）是克洛托、拉刻西斯和阿特罗波斯。拉刻西斯负责丈量生命之线，从而为每个凡人分配命运。"),
            es = LocalizedContent("En la mitología griega, ¿cuál es el nombre de la Parca del Destino?", listOf("Cloto", "Láquesis", "Átropos", "Parcae"), "Cultura", "En la mitología griega, las tres Parcas (Moiras) son Cloto, Láquesis y Átropos. Láquesis es la que mide el hilo de la vida, asignando así el destino a cada mortal.")
        ),
        BilingualQuestion(
            id = 10334, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de cuisine est originaire de la Suisse?", listOf("Raclette", "Fondue", "Rösti", "Tous les trois"), "Culture", "Les cuisines française, italienne et allemande ont toutes influencé les traditions culinaires suisses, selon les régions linguistiques du pays."),
            en = LocalizedContent("Which style of cuisine originated in Switzerland?", listOf("Raclette", "Fondue", "Rösti", "All three"), "Culture", "French, Italian, and German cuisines have all influenced Swiss culinary traditions, depending on the linguistic regions of the country."),
            zh = LocalizedContent("哪种烹饪风格起源于瑞士？", listOf("拉克莱特", "奶酪火锅", "土豆饼", "以上三种"), "文化", "法国、意大利和德国菜系都影响了瑞士的烹饪传统，具体取决于该国的语言区域。"),
            es = LocalizedContent("¿Qué estilo de cocina se originó en Suiza?", listOf("Raclette", "Fondue", "Rösti", "Los tres"), "Cultura", "Las cocinas francesa, italiana y alemana han influido en las tradiciones culinarias suizas, según las regiones lingüísticas del país.")
        ),
        BilingualQuestion(
            id = 10335, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Godless' a-t-il été lancé?", listOf("2016", "2017", "2018", "2019"), "Culture", "Godless, une série western de Netflix créée par Scott Frank, a été mise en ligne le 22 novembre 2017."),
            en = LocalizedContent("In what year was 'Godless' launched?", listOf("2016", "2017", "2018", "2019"), "Culture", "Godless, a Netflix western series created by Scott Frank, was released on November 22, 2017."),
            zh = LocalizedContent("《无神》在哪一年首播？", listOf("2016", "2017", "2018", "2019"), "文化", "《无神》是一部由斯科特·弗兰克创作的Netflix西部剧，于2017年11月22日上线。"),
            es = LocalizedContent("¿En qué año se lanzó 'Godless'?", listOf("2016", "2017", "2018", "2019"), "Cultura", "Godless, una serie western de Netflix creada por Scott Frank, se estrenó el 22 de noviembre de 2017.")
        ),
        BilingualQuestion(
            id = 10336, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Salon d'Automne'?", listOf("Henri Matisse", "André Derain", "Raoul Dufy", "Deux des trois"), "Culture", "Le tableau 'Salon d'Automne' a été peint par deux des trois frères Duchamp, Marcel et Jacques Villon, pour une exposition collective."),
            en = LocalizedContent("Which painter painted 'Salon d'Automne'?", listOf("Henri Matisse", "André Derain", "Raoul Dufy", "Two of the three"), "Culture", "The painting 'Salon d'Automne' was painted by two of the three Duchamp brothers, Marcel and Jacques Villon, for a group exhibition."),
            zh = LocalizedContent("哪位画家创作了《秋季沙龙》？", listOf("亨利·马蒂斯", "安德烈·德兰", "拉乌尔·杜菲", "其中两位"), "文化", "《秋季沙龙》这幅画是由杜尚三兄弟中的两位——马塞尔·杜尚和雅克·维永——为一次集体展览创作的。"),
            es = LocalizedContent("¿Qué pintor pintó 'Salón de Otoño'?", listOf("Henri Matisse", "André Derain", "Raoul Dufy", "Dos de los tres"), "Cultura", "El cuadro 'Salón de Otoño' fue pintado por dos de los tres hermanos Duchamp, Marcel y Jacques Villon, para una exposición colectiva.")
        ),
        BilingualQuestion(
            id = 10337, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie romaine, quel est le nom de la déesse des récoltes?", listOf("Junon", "Cérès", "Flore", "Minerve"), "Culture", "Cérès est l'équivalent romaine de la déesse grecque Déméter, protectrice de l'agriculture, des moissons et de la fertilité des terres."),
            en = LocalizedContent("In Roman mythology, what is the name of the goddess of harvests?", listOf("Juno", "Ceres", "Flora", "Minerva"), "Culture", "Ceres is the Roman equivalent of the Greek goddess Demeter, protector of agriculture, harvests, and fertility of the land."),
            zh = LocalizedContent("在罗马神话中，收获女神的名字是什么？", listOf("朱诺", "刻瑞斯", "福罗拉", "密涅瓦"), "文化", "刻瑞斯是希腊女神得墨忒耳的罗马对应神，掌管农业、收获和土地肥沃。"),
            es = LocalizedContent("En la mitología romana, ¿cuál es el nombre de la diosa de las cosechas?", listOf("Juno", "Ceres", "Flora", "Minerva"), "Cultura", "Ceres es la equivalente romana de la diosa griega Deméter, protectora de la agricultura, las cosechas y la fertilidad de la tierra.")
        ),
        BilingualQuestion(
            id = 10338, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit 'Rhapsody in Blue'?", listOf("Aaron Copland", "George Gershwin", "Leonard Bernstein", "Duke Ellington"), "Culture", "George Gershwin a composé 'Rhapsody in Blue' en 1924, mêlant musique classique et jazz dans une œuvre emblématique de l'ère du jazz américain."),
            en = LocalizedContent("Which composer wrote 'Rhapsody in Blue'?", listOf("Aaron Copland", "George Gershwin", "Leonard Bernstein", "Duke Ellington"), "Culture", "George Gershwin composed 'Rhapsody in Blue' in 1924, blending classical music and jazz in an iconic work of the American Jazz Age."),
            zh = LocalizedContent("哪位作曲家创作了《蓝色狂想曲》？", listOf("阿隆·科普兰", "乔治·格什温", "伦纳德·伯恩斯坦", "艾灵顿公爵"), "文化", "乔治·格什温于1924年创作了《蓝色狂想曲》，将古典音乐与爵士乐融合，成为美国爵士时代的标志性作品。"),
            es = LocalizedContent("¿Qué compositor escribió 'Rhapsody in Blue'?", listOf("Aaron Copland", "George Gershwin", "Leonard Bernstein", "Duke Ellington"), "Cultura", "George Gershwin compuso 'Rhapsody in Blue' en 1924, fusionando música clásica y jazz en una obra emblemática de la era del jazz estadounidense.")
        ),
        BilingualQuestion(
            id = 10339, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'The Affair' a-t-il commencé?", listOf("2013", "2014", "2015", "2016"), "Culture", "The Affair, une série dramatique américaine, a débuté en 2014 sur Showtime, remportant un Golden Globe de la meilleure série télévisée dramatique pour sa première saison."),
            en = LocalizedContent("In what year did 'The Affair' begin?", listOf("2013", "2014", "2015", "2016"), "Culture", "The Affair, an American drama series, began in 2014 on Showtime, winning a Golden Globe for Best Television Series – Drama for its first season."),
            zh = LocalizedContent("《婚外情事》在哪一年开播？", listOf("2013", "2014", "2015", "2016"), "文化", "《婚外情事》是一部美国剧情剧，于2014年在Showtime开播，第一季获得了金球奖最佳剧情类剧集。"),
            es = LocalizedContent("¿En qué año comenzó 'The Affair'?", listOf("2013", "2014", "2015", "2016"), "Cultura", "The Affair, una serie dramática estadounidense, comenzó en 2014 en Showtime, ganando un Globo de Oro a la mejor serie de televisión dramática por su primera temporada.")
        ),
        BilingualQuestion(
            id = 10340, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Baigneuses à Asnières'?", listOf("Claude Monet", "Georges Seurat", "Pierre-Auguste Renoir", "Camille Pissarro"), "Culture", "Georges Seurat a peint Baigneuses à Asnières en 1884, une œuvre majeure du pointillisme exposée à la National Gallery de Londres."),
            en = LocalizedContent("Which painter created 'Bathers at Asnières'?", listOf("Claude Monet", "Georges Seurat", "Pierre-Auguste Renoir", "Camille Pissarro"), "Culture", "Georges Seurat painted Bathers at Asnières in 1884, a major work of Pointillism exhibited at the National Gallery in London."),
            zh = LocalizedContent("哪位画家创作了《阿涅尔的浴者》？", listOf("克劳德·莫奈", "乔治·修拉", "皮埃尔-奥古斯特·雷诺阿", "卡米耶·毕沙罗"), "文化", "乔治·修拉于1884年创作了《阿涅尔的浴者》，这是一幅点彩画派的重要作品，现藏于伦敦国家美术馆。"),
            es = LocalizedContent("¿Qué pintor creó 'Bañistas en Asnières'?", listOf("Claude Monet", "Georges Seurat", "Pierre-Auguste Renoir", "Camille Pissarro"), "Cultura", "Georges Seurat pintó Bañistas en Asnières en 1884, una obra maestra del puntillismo expuesta en la National Gallery de Londres.")
        ),
        BilingualQuestion(
            id = 10341, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie grecque, qui est le père de Poseidon?", listOf("Hypérion", "Océan", "Kronos", "Coeus"), "Culture", "Kronos, le titan du temps, est le père de Poséidon, qu'il a avalé à sa naissance comme ses autres enfants, avant que Zeus ne le force à les régurgiter."),
            en = LocalizedContent("In Greek mythology, who is the father of Poseidon?", listOf("Hyperion", "Oceanus", "Cronus", "Coeus"), "Culture", "Cronus, the titan of time, is the father of Poseidon, whom he swallowed at birth like his other children, until Zeus forced him to regurgitate them."),
            zh = LocalizedContent("在希腊神话中，波塞冬的父亲是谁？", listOf("许珀里翁", "俄刻阿诺斯", "克洛诺斯", "科俄斯"), "文化", "克洛诺斯，时间泰坦，是波塞冬的父亲，他在波塞冬出生时将其吞下，如同其他孩子，直到宙斯迫使他吐出他们。"),
            es = LocalizedContent("En la mitología griega, ¿quién es el padre de Poseidón?", listOf("Hiperión", "Océano", "Crono", "Ceo"), "Cultura", "Crono, el titán del tiempo, es el padre de Poseidón, a quien se tragó al nacer como a sus otros hijos, hasta que Zeus lo obligó a regurgitarlos.")
        ),
        BilingualQuestion(
            id = 10342, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de danse vient de l'Inde?", listOf("Bharata Natyam", "Kathak", "Odissi", "Tous les trois"), "Culture", "Le Bharatanatyam, le Kathak et le Kathakali sont trois danses classiques majeures originaires de différentes régions de l'Inde."),
            en = LocalizedContent("Which style of dance comes from India?", listOf("Bharata Natyam", "Kathak", "Odissi", "All three"), "Culture", "Bharatanatyam, Kathak, and Odissi are three major classical dances originating from different regions of India."),
            zh = LocalizedContent("哪种舞蹈风格源自印度？", listOf("婆罗多舞", "卡塔克舞", "奥迪西舞", "以上都是"), "文化", "婆罗多舞、卡塔克舞和奥迪西舞是源自印度不同地区的三种主要古典舞蹈。"),
            es = LocalizedContent("¿Qué estilo de danza proviene de la India?", listOf("Bharata Natyam", "Kathak", "Odissi", "Los tres"), "Cultura", "Bharatanatyam, Kathak y Odissi son tres danzas clásicas principales originarias de diferentes regiones de la India.")
        ),
        BilingualQuestion(
            id = 10343, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Westworld' a-t-il commencé?", listOf("2014", "2015", "2016", "2017"), "Culture", "La série Westworld a débuté en 2016 sur HBO, adaptée du film éponyme de 1973."),
            en = LocalizedContent("In which year did 'Westworld' start?", listOf("2014", "2015", "2016", "2017"), "Culture", "The series Westworld premiered in 2016 on HBO, adapted from the 1973 film of the same name."),
            zh = LocalizedContent("《西部世界》在哪一年开播？", listOf("2014", "2015", "2016", "2017"), "文化", "剧集《西部世界》于2016年在HBO首播，改编自1973年的同名电影。"),
            es = LocalizedContent("¿En qué año comenzó 'Westworld'?", listOf("2014", "2015", "2016", "2017"), "Cultura", "La serie Westworld se estrenó en 2016 en HBO, adaptada de la película homónima de 1973.")
        ),
        BilingualQuestion(
            id = 10344, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Femme à la Harpe'?", listOf("Pablo Picasso", "Henri Laurens", "Juan Gris", "Fernand Léger"), "Culture", "Pablo Picasso a peint \"Femme à la Harpe\" en 1911, une œuvre cubiste représentant sa compagne Fanny Tellier."),
            en = LocalizedContent("Which painter painted 'Woman with a Harp'?", listOf("Pablo Picasso", "Henri Laurens", "Juan Gris", "Fernand Léger"), "Culture", "Pablo Picasso painted 'Woman with a Harp' in 1911, a Cubist work depicting his companion Fanny Tellier."),
            zh = LocalizedContent("哪位画家创作了《持竖琴的女子》？", listOf("巴勃罗·毕加索", "亨利·劳伦斯", "胡安·格里斯", "费尔南·莱热"), "文化", "巴勃罗·毕加索于1911年创作了《持竖琴的女子》，这是一幅立体主义作品，描绘了他的伴侣范妮·泰利耶。"),
            es = LocalizedContent("¿Qué pintor pintó 'Mujer con arpa'?", listOf("Pablo Picasso", "Henri Laurens", "Juan Gris", "Fernand Léger"), "Cultura", "Pablo Picasso pintó 'Mujer con arpa' en 1911, una obra cubista que representa a su compañera Fanny Tellier.")
        ),
        BilingualQuestion(
            id = 10345, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie égyptienne, quel est le nom du monde des morts?", listOf("Douat", "Aaru", "Tuat", "Tous les trois"), "Culture", "Le Duat, l'Amenti et le Champ des Roseaux sont trois noms désignant le monde des morts dans la mythologie égyptienne, selon les époques et les croyances."),
            en = LocalizedContent("In Egyptian mythology, what is the name of the underworld?", listOf("Duat", "Aaru", "Tuat", "All three"), "Culture", "Duat, Amenti, and Field of Reeds are three names for the underworld in Egyptian mythology, depending on the period and beliefs."),
            zh = LocalizedContent("在埃及神话中，冥界的名称是什么？", listOf("杜阿特", "阿鲁", "图阿特", "以上都是"), "文化", "杜阿特、阿门提和芦苇原野是埃及神话中冥界的三个名称，因时期和信仰而异。"),
            es = LocalizedContent("En la mitología egipcia, ¿cuál es el nombre del inframundo?", listOf("Duat", "Aaru", "Tuat", "Los tres"), "Cultura", "Duat, Amenti y Campo de Cañas son tres nombres para el inframundo en la mitología egipcia, según la época y las creencias.")
        ),
        BilingualQuestion(
            id = 10346, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de cuisine française utilise beaucoup de beurre?", listOf("Cuisine normande", "Cuisine bretonne", "Cuisine alsacienne", "Cuisine provençale"), "Culture", "La cuisine normande utilise abondamment le beurre en raison de l'élevage laitier développé en Normandie, région réputée pour ses produits laitiers."),
            en = LocalizedContent("Which French cuisine style uses a lot of butter?", listOf("Norman cuisine", "Breton cuisine", "Alsatian cuisine", "Provencal cuisine"), "Culture", "Norman cuisine uses butter abundantly due to the dairy farming in Normandy, a region known for its dairy products."),
            zh = LocalizedContent("哪种法国菜系大量使用黄油？", listOf("诺曼底菜", "布列塔尼菜", "阿尔萨斯菜", "普罗旺斯菜"), "文化", "诺曼底菜大量使用黄油，因为诺曼底地区以乳制品闻名，乳品业发达。"),
            es = LocalizedContent("¿Qué estilo de cocina francesa usa mucha mantequilla?", listOf("Cocina normanda", "Cocina bretona", "Cocina alsaciana", "Cocina provenzal"), "Cultura", "La cocina normanda usa abundantemente mantequilla debido a la ganadería lechera en Normandía, región famosa por sus productos lácteos.")
        ),
        BilingualQuestion(
            id = 10347, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Kidding' a-t-il commencé?", listOf("2016", "2017", "2018", "2019"), "Culture", "Kidding, série dramatique avec Jim Carrey, a débuté en 2018 sur Showtime."),
            en = LocalizedContent("In which year did 'Kidding' start?", listOf("2016", "2017", "2018", "2019"), "Culture", "Kidding, a drama series starring Jim Carrey, premiered in 2018 on Showtime."),
            zh = LocalizedContent("《开玩笑》在哪一年开播？", listOf("2016", "2017", "2018", "2019"), "文化", "《开玩笑》是一部由金·凯瑞主演的剧情剧，于2018年在Showtime首播。"),
            es = LocalizedContent("¿En qué año comenzó 'Kidding'?", listOf("2016", "2017", "2018", "2019"), "Cultura", "Kidding, una serie dramática protagonizada por Jim Carrey, se estrenó en 2018 en Showtime.")
        ),
        BilingualQuestion(
            id = 10348, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel peintre a créé 'Intérieur avec Femme lisant'?", listOf("Pieter de Hooch", "Johannes Vermeer", "Gerrit Dou", "Jan Steen"), "Culture", "Johannes Vermeer, peintre néerlandais du XVIIe siècle, est célèbre pour ses scènes d'intérieur domestiques baignées de lumière, dont fait partie 'Intérieur avec Femme lisant'."),
            en = LocalizedContent("Which painter created 'Interior with a Woman Reading'?", listOf("Pieter de Hooch", "Johannes Vermeer", "Gerrit Dou", "Jan Steen"), "Culture", "Johannes Vermeer, a 17th-century Dutch painter, is famous for his domestic interior scenes bathed in light, including 'Interior with a Woman Reading'."),
            zh = LocalizedContent("哪位画家创作了《室内阅读的女子》？", listOf("彼得·德·霍赫", "约翰内斯·维米尔", "赫里特·道", "扬·斯滕"), "文化", "约翰内斯·维米尔是17世纪荷兰画家，以描绘沐浴在光线中的家庭室内场景而闻名，包括《室内阅读的女子》。"),
            es = LocalizedContent("¿Qué pintor creó 'Interior con mujer leyendo'?", listOf("Pieter de Hooch", "Johannes Vermeer", "Gerrit Dou", "Jan Steen"), "Cultura", "Johannes Vermeer, pintor neerlandés del siglo XVII, es famoso por sus escenas de interiores domésticos bañados en luz, incluido 'Interior con mujer leyendo'.")
        ),
        BilingualQuestion(
            id = 10349, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie grecque, quel est le nombre de Muses?", listOf("3", "7", "9", "12"), "Culture", "Dans la mythologie grecque, les neuf Muses sont les filles de Zeus et de Mnémosyne, chacune présidant à un art ou une science (comme l'épopée, l'histoire ou la danse)."),
            en = LocalizedContent("In Greek mythology, what is the number of Muses?", listOf("3", "7", "9", "12"), "Culture", "In Greek mythology, the nine Muses are the daughters of Zeus and Mnemosyne, each presiding over an art or science (such as epic poetry, history, or dance)."),
            zh = LocalizedContent("在希腊神话中，缪斯女神的数量是多少？", listOf("3", "7", "9", "12"), "文化", "在希腊神话中，九位缪斯女神是宙斯和谟涅摩绪涅的女儿，每位掌管一门艺术或科学（如史诗、历史或舞蹈）。"),
            es = LocalizedContent("En la mitología griega, ¿cuál es el número de Musas?", listOf("3", "7", "9", "12"), "Cultura", "En la mitología griega, las nueve Musas son hijas de Zeus y Mnemósine, cada una preside un arte o ciencia (como la épica, la historia o la danza).")
        ),
        BilingualQuestion(
            id = 10350, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit 'The Planets'?", listOf("Edvard Grieg", "Gustav Holst", "Ralph Vaughan Williams", "Edward Elgar"), "Culture", "Gustav Holst, compositeur britannique, a composé cette suite orchestrale entre 1914 et 1916, chaque mouvement représentant une planète du système solaire et son caractère astrologique associé."),
            en = LocalizedContent("Which composer wrote 'The Planets'?", listOf("Edvard Grieg", "Gustav Holst", "Ralph Vaughan Williams", "Edward Elgar"), "Culture", "Gustav Holst, a British composer, wrote this orchestral suite between 1914 and 1916, with each movement representing a planet of the solar system and its associated astrological character."),
            zh = LocalizedContent("哪位作曲家创作了《行星组曲》？", listOf("爱德华·格里格", "古斯塔夫·霍尔斯特", "拉尔夫·沃恩·威廉姆斯", "爱德华·埃尔加"), "文化", "英国作曲家古斯塔夫·霍尔斯特于1914年至1916年间创作了这部管弦乐组曲，每个乐章代表太阳系的一颗行星及其相关的占星学特征。"),
            es = LocalizedContent("¿Qué compositor escribió 'Los planetas'?", listOf("Edvard Grieg", "Gustav Holst", "Ralph Vaughan Williams", "Edward Elgar"), "Cultura", "Gustav Holst, compositor británico, compuso esta suite orquestal entre 1914 y 1916, cada movimiento representa un planeta del sistema solar y su carácter astrológico asociado.")
        ),
        BilingualQuestion(
            id = 10351, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Transparent' a-t-il commencé?", listOf("2013", "2014", "2015", "2016"), "Culture", "Transparent, série créée par Jill Soloway, a débuté sur Amazon Prime Video en 2014, mais sa première saison complète a été diffusée en 2015."),
            en = LocalizedContent("In which year did 'Transparent' start?", listOf("2013", "2014", "2015", "2016"), "Culture", "Transparent, a series created by Jill Soloway, premiered on Amazon Prime Video in 2014, but its first full season was released in 2015."),
            zh = LocalizedContent("《透明家庭》在哪一年开播？", listOf("2013", "2014", "2015", "2016"), "文化", "由吉尔·索洛韦创作的剧集《透明家庭》于2014年在亚马逊Prime Video首播，但其完整第一季于2015年发布。"),
            es = LocalizedContent("¿En qué año comenzó 'Transparent'?", listOf("2013", "2014", "2015", "2016"), "Cultura", "Transparent, serie creada por Jill Soloway, se estrenó en Amazon Prime Video en 2014, pero su primera temporada completa se lanzó en 2015.")
        ),
        BilingualQuestion(
            id = 10352, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Coin du Studio'?", listOf("Gustave Courbet", "Jean-Auguste-Dominique Ingres", "Eugène Delacroix", "Théodore Géricault"), "Culture", "Gustave Courbet, figure majeure du réalisme, a peint 'Coin du Studio' en 1854-1855, une œuvre qui représente son atelier parisien."),
            en = LocalizedContent("Which painter painted 'Corner of the Studio'?", listOf("Gustave Courbet", "Jean-Auguste-Dominique Ingres", "Eugène Delacroix", "Théodore Géricault"), "Culture", "Gustave Courbet, a major figure of Realism, painted 'Corner of the Studio' in 1854-1855, a work depicting his Parisian studio."),
            zh = LocalizedContent("哪位画家创作了《工作室的一角》？", listOf("古斯塔夫·库尔贝", "让-奥古斯特-多米尼克·安格尔", "欧仁·德拉克罗瓦", "泰奥多尔·热里科"), "文化", "现实主义大师古斯塔夫·库尔贝于1854-1855年创作了《工作室的一角》，这幅作品描绘了他的巴黎工作室。"),
            es = LocalizedContent("¿Qué pintor pintó 'Rincón del estudio'?", listOf("Gustave Courbet", "Jean-Auguste-Dominique Ingres", "Eugène Delacroix", "Théodore Géricault"), "Cultura", "Gustave Courbet, figura principal del realismo, pintó 'Rincón del estudio' en 1854-1855, una obra que representa su estudio parisino.")
        ),
        BilingualQuestion(
            id = 10353, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En mythologie romaine, quel dieu est le roi du ciel?", listOf("Mars", "Neptune", "Jupiter", "Pluton"), "Culture", "Jupiter est l'équivalent romain du Zeus grec, souverain des dieux et maître du ciel et de la foudre dans la mythologie romaine."),
            en = LocalizedContent("In Roman mythology, which god is the king of the sky?", listOf("Mars", "Neptune", "Jupiter", "Pluto"), "Culture", "Jupiter is the Roman equivalent of the Greek Zeus, sovereign of the gods and master of the sky and thunder in Roman mythology."),
            zh = LocalizedContent("在罗马神话中，哪位神是天空之王？", listOf("马尔斯", "尼普顿", "朱庇特", "普路托"), "文化", "朱庇特是希腊神话中宙斯的罗马对应神，在罗马神话中是众神之王，掌管天空和雷电。"),
            es = LocalizedContent("En la mitología romana, ¿qué dios es el rey del cielo?", listOf("Marte", "Neptuno", "Júpiter", "Plutón"), "Cultura", "Júpiter es el equivalente romano del Zeus griego, soberano de los dioses y señor del cielo y el trueno en la mitología romana.")
        ),
        BilingualQuestion(
            id = 10354, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de musique a émergé de la Nouvelle-Orléans?", listOf("Jazz", "Blues", "Ragtime", "Tous les trois"), "Culture", "La Nouvelle-Orléans est le berceau du jazz, mais aussi un creuset pour le blues et le rhythm and blues, qui y ont tous émergé ou se sont développés grâce à son riche métissage culturel."),
            en = LocalizedContent("Which style of music emerged from New Orleans?", listOf("Jazz", "Blues", "Ragtime", "All three"), "Culture", "New Orleans is the birthplace of jazz, but also a melting pot for blues and rhythm and blues, all of which emerged or developed there thanks to its rich cultural mix."),
            zh = LocalizedContent("哪种音乐风格起源于新奥尔良？", listOf("爵士乐", "蓝调", "拉格泰姆", "以上全部"), "文化", "新奥尔良是爵士乐的发源地，也是蓝调和节奏蓝调的熔炉，由于其丰富的文化融合，这些音乐风格都在那里诞生或发展。"),
            es = LocalizedContent("¿Qué estilo de música surgió de Nueva Orleans?", listOf("Jazz", "Blues", "Ragtime", "Los tres"), "Cultura", "Nueva Orleans es la cuna del jazz, pero también un crisol para el blues y el rhythm and blues, todos los cuales surgieron o se desarrollaron allí gracias a su rica mezcla cultural.")
        ),
        BilingualQuestion(
            id = 10355, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'The Diplomat' s'est-il terminé?", listOf("2023", "2024", "2025", "2026"), "Culture", "La série télévisée 'The Diplomat' s'est conclue en 2024 après deux saisons sur Netflix."),
            en = LocalizedContent("In which year did 'The Diplomat' end?", listOf("2023", "2024", "2025", "2026"), "Culture", "The television series 'The Diplomat' concluded in 2024 after two seasons on Netflix."),
            zh = LocalizedContent("《外交官》在哪一年完结？", listOf("2023", "2024", "2025", "2026"), "文化", "电视剧《外交官》在Netflix上播出两季后于2024年完结。"),
            es = LocalizedContent("¿En qué año terminó 'The Diplomat'?", listOf("2023", "2024", "2025", "2026"), "Cultura", "La serie de televisión 'The Diplomat' concluyó en 2024 después de dos temporadas en Netflix.")
        ),
        BilingualQuestion(
            id = 10356, correctIndex = 1, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel peintre a créé 'Paysage avec Moulin'?", listOf("Ruisdael", "Jacob van Ruisdael", "Meyndert Hobbema", "Albert Cuyp"), "Culture", "Jacob van Ruisdael, peintre néerlandais du XVIIe siècle, est célèbre pour ses paysages réalistes et atmosphériques, dont 'Paysage avec Moulin' est un exemple typique de son travail."),
            en = LocalizedContent("Which painter created 'Landscape with a Mill'?", listOf("Ruisdael", "Jacob van Ruisdael", "Meyndert Hobbema", "Albert Cuyp"), "Culture", "Jacob van Ruisdael, a 17th-century Dutch painter, is famous for his realistic and atmospheric landscapes, of which 'Landscape with a Mill' is a typical example of his work."),
            zh = LocalizedContent("哪位画家创作了《有磨坊的风景》？", listOf("雷斯达尔", "雅各布·范·雷斯达尔", "梅因德尔特·霍贝玛", "阿尔伯特·克伊普"), "文化", "17世纪荷兰画家雅各布·范·雷斯达尔以其写实且富有氛围的风景画而闻名，《有磨坊的风景》是其作品的典型代表。"),
            es = LocalizedContent("¿Qué pintor creó 'Paisaje con molino'?", listOf("Ruisdael", "Jacob van Ruisdael", "Meyndert Hobbema", "Albert Cuyp"), "Cultura", "Jacob van Ruisdael, pintor neerlandés del siglo XVII, es famoso por sus paisajes realistas y atmosféricos, de los cuales 'Paisaje con molino' es un ejemplo típico de su obra.")
        ),
        BilingualQuestion(
            id = 10357, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie grecque, quel est le symbole d'Athéna?", listOf("Hibou", "Colombe", "Aigle", "Paon"), "Culture", "Le hibou est associé à Athéna, déesse de la sagesse, car il symbolise la connaissance et la clairvoyance dans la mythologie grecque."),
            en = LocalizedContent("In Greek mythology, what is Athena's symbol?", listOf("Owl", "Dove", "Eagle", "Peacock"), "Culture", "The owl is associated with Athena, goddess of wisdom, as it symbolizes knowledge and foresight in Greek mythology."),
            zh = LocalizedContent("在希腊神话中，雅典娜的象征是什么？", listOf("猫头鹰", "鸽子", "鹰", "孔雀"), "文化", "猫头鹰与智慧女神雅典娜相关联，因为在希腊神话中它象征着知识和远见。"),
            es = LocalizedContent("En la mitología griega, ¿cuál es el símbolo de Atenea?", listOf("Búho", "Paloma", "Águila", "Pavo real"), "Cultura", "El búho está asociado con Atenea, diosa de la sabiduría, ya que simboliza el conocimiento y la clarividencia en la mitología griega.")
        ),
        BilingualQuestion(
            id = 10358, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de danse est associé à Ginger Rogers?", listOf("Tap Dance", "Swing", "Foxtrot", "Tous les trois"), "Culture", "Ginger Rogers excellait dans la danse à claquettes, la danse de salon et la comédie musicale, notamment aux côtés de Fred Astaire dans dix films."),
            en = LocalizedContent("Which dance style is associated with Ginger Rogers?", listOf("Tap Dance", "Swing", "Foxtrot", "All three"), "Culture", "Ginger Rogers excelled in tap dance, ballroom dance, and musical comedy, notably alongside Fred Astaire in ten films."),
            zh = LocalizedContent("哪种舞蹈风格与金杰·罗杰斯相关？", listOf("踢踏舞", "摇摆舞", "狐步舞", "以上全部"), "文化", "金杰·罗杰斯擅长踢踏舞、交谊舞和音乐喜剧，尤其与弗雷德·阿斯泰尔合作了十部电影。"),
            es = LocalizedContent("¿Qué estilo de baile se asocia con Ginger Rogers?", listOf("Claqué", "Swing", "Foxtrot", "Los tres"), "Cultura", "Ginger Rogers destacó en claqué, baile de salón y comedia musical, especialmente junto a Fred Astaire en diez películas.")
        ),
        BilingualQuestion(
            id = 10359, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'The Patient' a-t-il été lancé?", listOf("2021", "2022", "2023", "2024"), "Culture", "The Patient est une série télévisée américaine avec Steve Carell, diffusée sur FX et Hulu à partir d'août 2022, mais sa sortie internationale et sa reconnaissance majeure datent de 2023."),
            en = LocalizedContent("In which year was 'The Patient' launched?", listOf("2021", "2022", "2023", "2024"), "Culture", "The Patient is an American television series starring Steve Carell, aired on FX and Hulu starting in August 2022, but its international release and major recognition date from 2023."),
            zh = LocalizedContent("《病人》在哪一年推出？", listOf("2021", "2022", "2023", "2024"), "文化", "《病人》是一部由史蒂夫·卡瑞尔主演的美国电视剧，于2022年8月在FX和Hulu上播出，但其国际发行和主要认可始于2023年。"),
            es = LocalizedContent("¿En qué año se lanzó 'The Patient'?", listOf("2021", "2022", "2023", "2024"), "Cultura", "The Patient es una serie de televisión estadounidense protagonizada por Steve Carell, emitida en FX y Hulu a partir de agosto de 2022, pero su lanzamiento internacional y reconocimiento importante datan de 2023.")
        ),
        BilingualQuestion(
            id = 10360, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Paysage Pastoral'?", listOf("Claude Lorrain", "Nicolas Poussin", "Salvator Rosa", "Deux des trois"), "Culture", "Le tableau 'Paysage Pastoral' est une œuvre collective réalisée par trois artistes, dont deux sont généralement cités comme ses auteurs principaux."),
            en = LocalizedContent("Which painter painted 'Pastoral Landscape'?", listOf("Claude Lorrain", "Nicolas Poussin", "Salvator Rosa", "Two of the three"), "Culture", "The painting 'Pastoral Landscape' is a collective work by three artists, of which two are generally cited as its main authors."),
            zh = LocalizedContent("哪位画家创作了《田园风景》？", listOf("克劳德·洛兰", "尼古拉·普桑", "萨尔瓦多·罗萨", "其中两位"), "文化", "《田园风景》是一幅由三位艺术家合作完成的作品，其中两位通常被认为是其主要作者。"),
            es = LocalizedContent("¿Qué pintor pintó 'Paisaje Pastoral'?", listOf("Claudio de Lorena", "Nicolás Poussin", "Salvator Rosa", "Dos de los tres"), "Cultura", "El cuadro 'Paisaje Pastoral' es una obra colectiva realizada por tres artistas, de los cuales dos son generalmente citados como sus autores principales.")
        ),
        BilingualQuestion(
            id = 10361, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie hindoue, quel est le nom du grand serpent cosmique?", listOf("Ananta", "Vasuki", "Sesha", "Ananta Shesha"), "Culture", "Ananta Shesha est le serpent divin sur lequel le dieu Vishnu repose dans l'océan cosmique, symbolisant l'infini et servant de couche pour le créateur de l'univers."),
            en = LocalizedContent("In Hindu mythology, what is the name of the great cosmic serpent?", listOf("Ananta", "Vasuki", "Sesha", "Ananta Shesha"), "Culture", "Ananta Shesha is the divine serpent on which the god Vishnu rests in the cosmic ocean, symbolizing infinity and serving as a couch for the creator of the universe."),
            zh = LocalizedContent("在印度神话中，伟大的宇宙之蛇叫什么名字？", listOf("阿南塔", "瓦苏基", "舍沙", "阿南塔·舍沙"), "文化", "阿南塔·舍沙是神蛇，毗湿奴神在宇宙之海上休息时躺在其身上，象征着无限，并作为宇宙创造者的卧榻。"),
            es = LocalizedContent("En la mitología hindú, ¿cuál es el nombre de la gran serpiente cósmica?", listOf("Ananta", "Vasuki", "Sesha", "Ananta Shesha"), "Cultura", "Ananta Shesha es la serpiente divina sobre la que el dios Vishnu descansa en el océano cósmico, simbolizando el infinito y sirviendo como lecho para el creador del universo.")
        ),
        BilingualQuestion(
            id = 10362, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de cuisine est caractérisé par les épices?", listOf("Cuisine indienne", "Cuisine thaïlandaise", "Cuisine marocaine", "Tous les trois"), "Culture", "Les cuisines indienne, mexicaine et thaïlandaise utilisent toutes des épices variées et essentielles, comme le cumin, le piment ou la cardamome, pour leurs plats traditionnels."),
            en = LocalizedContent("Which style of cuisine is characterized by spices?", listOf("Indian cuisine", "Thai cuisine", "Moroccan cuisine", "All three"), "Culture", "Indian, Mexican, and Thai cuisines all use varied and essential spices, such as cumin, chili, or cardamom, for their traditional dishes."),
            zh = LocalizedContent("哪种菜系以香料为特色？", listOf("印度菜", "泰国菜", "摩洛哥菜", "以上所有"), "文化", "印度菜、墨西哥菜和泰国菜都使用各种必不可少的香料，如孜然、辣椒或小豆蔻，用于其传统菜肴。"),
            es = LocalizedContent("¿Qué estilo de cocina se caracteriza por las especias?", listOf("Cocina india", "Cocina tailandesa", "Cocina marroquí", "Las tres"), "Cultura", "Las cocinas india, mexicana y tailandesa utilizan todas especias variadas y esenciales, como comino, chile o cardamomo, para sus platos tradicionales.")
        ),
        BilingualQuestion(
            id = 10363, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Love, Death & Robots' a-t-il commencé?", listOf("2018", "2019", "2020", "2021"), "Culture", "La série d'animation anthologique Love, Death & Robots a été créée par Tim Miller et David Fincher et diffusée pour la première fois sur Netflix en 2019."),
            en = LocalizedContent("In which year did 'Love, Death & Robots' start?", listOf("2018", "2019", "2020", "2021"), "Culture", "The anthology animated series Love, Death & Robots was created by Tim Miller and David Fincher and first aired on Netflix in 2019."),
            zh = LocalizedContent("《爱、死亡与机器人》始于哪一年？", listOf("2018", "2019", "2020", "2021"), "文化", "动画选集系列《爱、死亡与机器人》由蒂姆·米勒和大卫·芬奇创作，并于2019年在Netflix首播。"),
            es = LocalizedContent("¿En qué año comenzó 'Love, Death & Robots'?", listOf("2018", "2019", "2020", "2021"), "Cultura", "La serie de animación antológica Love, Death & Robots fue creada por Tim Miller y David Fincher y se emitió por primera vez en Netflix en 2019.")
        ),
        BilingualQuestion(
            id = 10364, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Port de Honfleur'?", listOf("Claude Monet", "Eugène Boudin", "Alfred Sisley", "Berthe Morisot"), "Culture", "Eugène Boudin, natif de Honfleur, est un précurseur de l'impressionnisme connu pour ses marines. Il a peint ce port normand à de nombreuses reprises, capturant ses lumières changeantes."),
            en = LocalizedContent("Which painter created 'Port of Honfleur'?", listOf("Claude Monet", "Eugène Boudin", "Alfred Sisley", "Berthe Morisot"), "Culture", "Eugène Boudin, a native of Honfleur, was a precursor of Impressionism known for his seascapes. He painted this Norman port many times, capturing its changing lights."),
            zh = LocalizedContent("哪位画家创作了《翁弗勒尔港》？", listOf("克劳德·莫奈", "欧仁·布丹", "阿尔弗雷德·西斯莱", "贝尔特·莫里索"), "文化", "欧仁·布丹，翁弗勒尔本地人，是印象派的先驱，以海景画闻名。他多次描绘这个诺曼底港口，捕捉其变幻的光线。"),
            es = LocalizedContent("¿Qué pintor creó 'Puerto de Honfleur'?", listOf("Claude Monet", "Eugène Boudin", "Alfred Sisley", "Berthe Morisot"), "Cultura", "Eugène Boudin, nativo de Honfleur, fue un precursor del impresionismo conocido por sus marinas. Pintó este puerto normando en numerosas ocasiones, capturando sus luces cambiantes.")
        ),
        BilingualQuestion(
            id = 10365, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie grecque, quel est le nom du dieu du commerce?", listOf("Apollon", "Hermès", "Athéna", "Héphaïstos"), "Culture", "Hermès est le messager des dieux et le dieu des voyageurs, des commerçants et des voleurs dans la mythologie grecque."),
            en = LocalizedContent("In Greek mythology, what is the name of the god of commerce?", listOf("Apollo", "Hermes", "Athena", "Hephaestus"), "Culture", "Hermes is the messenger of the gods and the god of travelers, merchants, and thieves in Greek mythology."),
            zh = LocalizedContent("在希腊神话中，商业之神叫什么名字？", listOf("阿波罗", "赫尔墨斯", "雅典娜", "赫菲斯托斯"), "文化", "赫尔墨斯是众神的信使，也是希腊神话中旅行者、商人和小偷的神。"),
            es = LocalizedContent("En la mitología griega, ¿cuál es el nombre del dios del comercio?", listOf("Apolo", "Hermes", "Atenea", "Hefesto"), "Cultura", "Hermes es el mensajero de los dioses y el dios de los viajeros, comerciantes y ladrones en la mitología griega.")
        ),
        BilingualQuestion(
            id = 10366, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit 'Hungarian Rhapsody'?", listOf("Franz Liszt", "Béla Bartók", "Zoltán Kodály", "George Dohnanyi"), "Culture", "Franz Liszt, compositeur hongrois du XIXe siècle, a composé les 19 Rhapsodies hongroises, dont la plus célèbre est la n°2, s'inspirant de la musique folklorique tzigane."),
            en = LocalizedContent("Which composer wrote 'Hungarian Rhapsody'?", listOf("Franz Liszt", "Béla Bartók", "Zoltán Kodály", "George Dohnanyi"), "Culture", "Franz Liszt, a 19th-century Hungarian composer, composed the 19 Hungarian Rhapsodies, the most famous of which is No. 2, inspired by Gypsy folk music."),
            zh = LocalizedContent("哪位作曲家创作了《匈牙利狂想曲》？", listOf("弗朗茨·李斯特", "贝拉·巴托克", "佐尔坦·科达伊", "乔治·多纳伊"), "文化", "弗朗茨·李斯特，19世纪匈牙利作曲家，创作了19首匈牙利狂想曲，其中最著名的是第二首，灵感来自吉普赛民间音乐。"),
            es = LocalizedContent("¿Qué compositor escribió 'Rapsodia húngara'?", listOf("Franz Liszt", "Béla Bartók", "Zoltán Kodály", "George Dohnanyi"), "Cultura", "Franz Liszt, compositor húngaro del siglo XIX, compuso las 19 Rapsodias húngaras, la más famosa de las cuales es la n.º 2, inspirada en la música folclórica gitana.")
        ),
        BilingualQuestion(
            id = 10367, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'The Fall' a-t-il commencé?", listOf("2011", "2012", "2013", "2014"), "Culture", "The Fall est une série télévisée britannique avec Gillian Anderson, diffusée pour la première fois en 2013 sur BBC Two."),
            en = LocalizedContent("In which year did 'The Fall' start?", listOf("2011", "2012", "2013", "2014"), "Culture", "The Fall is a British television series starring Gillian Anderson, first broadcast in 2013 on BBC Two."),
            zh = LocalizedContent("《堕落》始于哪一年？", listOf("2011", "2012", "2013", "2014"), "文化", "《堕落》是一部英国电视剧，由吉莲·安德森主演，于2013年在BBC第二频道首播。"),
            es = LocalizedContent("¿En qué año comenzó 'The Fall'?", listOf("2011", "2012", "2013", "2014"), "Cultura", "The Fall es una serie de televisión británica protagonizada por Gillian Anderson, emitida por primera vez en 2013 en BBC Two.")
        ),
        BilingualQuestion(
            id = 10368, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Jardin Japonais'?", listOf("Claude Monet", "Pierre-Auguste Renoir", "Paul Cézanne", "Vincent van Gogh"), "Culture", "Claude Monet a peint 'Jardin Japonais' en 1899, inspiré par le pont et les nymphéas de son jardin à Giverny, reflet de son intérêt pour l'art japonais."),
            en = LocalizedContent("Which painter painted 'Japanese Garden'?", listOf("Claude Monet", "Pierre-Auguste Renoir", "Paul Cézanne", "Vincent van Gogh"), "Culture", "Claude Monet painted 'Japanese Garden' in 1899, inspired by the bridge and water lilies in his garden at Giverny, reflecting his interest in Japanese art."),
            zh = LocalizedContent("哪位画家创作了《日本花园》？", listOf("克劳德·莫奈", "皮埃尔-奥古斯特·雷诺阿", "保罗·塞尚", "文森特·梵高"), "文化", "克劳德·莫奈于1899年创作了《日本花园》，灵感来自他在吉维尼花园中的桥和睡莲，反映了他对日本艺术的兴趣。"),
            es = LocalizedContent("¿Qué pintor pintó 'Jardín Japonés'?", listOf("Claude Monet", "Pierre-Auguste Renoir", "Paul Cézanne", "Vincent van Gogh"), "Cultura", "Claude Monet pintó 'Jardín Japonés' en 1899, inspirado por el puente y los nenúfares de su jardín en Giverny, reflejando su interés por el arte japonés.")
        ),
        BilingualQuestion(
            id = 10369, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie égyptienne, quel est le symbole du dieu Rê?", listOf("Disque solaire", "Ankh", "Scarabée", "Faucon"), "Culture", "Rê est le dieu du soleil dans la mythologie égyptienne, et son symbole principal est le disque solaire, représentant sa puissance et sa lumière."),
            en = LocalizedContent("In Egyptian mythology, what is the symbol of the god Ra?", listOf("Solar disk", "Ankh", "Scarab", "Falcon"), "Culture", "Ra is the sun god in Egyptian mythology, and his main symbol is the solar disk, representing his power and light."),
            zh = LocalizedContent("在埃及神话中，拉神的象征是什么？", listOf("太阳圆盘", "安卡", "圣甲虫", "猎鹰"), "文化", "拉是埃及神话中的太阳神，其主要象征是太阳圆盘，代表他的力量和光芒。"),
            es = LocalizedContent("En la mitología egipcia, ¿cuál es el símbolo del dios Ra?", listOf("Disco solar", "Anj", "Escarabajo", "Halcón"), "Cultura", "Ra es el dios del sol en la mitología egipcia, y su símbolo principal es el disco solar, que representa su poder y luz.")
        ),
        BilingualQuestion(
            id = 10370, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de danse vient de l'Afrique du Sud?", listOf("Gumboot Dance", "Umqombothi Dance", "Kwaito", "Tous les trois"), "Culture", "Le gumboot, le pantsula et le kwaito sont trois styles de danse originaires d'Afrique du Sud, chacun issu de contextes culturels et historiques différents."),
            en = LocalizedContent("Which style of dance comes from South Africa?", listOf("Gumboot Dance", "Umqombothi Dance", "Kwaito", "All three"), "Culture", "Gumboot, pantsula, and kwaito are three dance styles originating from South Africa, each from different cultural and historical contexts."),
            zh = LocalizedContent("哪种舞蹈风格来自南非？", listOf("Gumboot舞", "Umqombothi舞", "Kwaito", "以上都是"), "文化", "Gumboot、pantsula和kwaito是三种源自南非的舞蹈风格，每种都来自不同的文化和历史背景。"),
            es = LocalizedContent("¿Qué estilo de baile proviene de Sudáfrica?", listOf("Gumboot Dance", "Umqombothi Dance", "Kwaito", "Los tres"), "Cultura", "El gumboot, el pantsula y el kwaito son tres estilos de baile originarios de Sudáfrica, cada uno de contextos culturales e históricos diferentes.")
        ),
        BilingualQuestion(
            id = 10371, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'The Girlfriend' a-t-il été lancé?", listOf("2018", "2019", "2020", "2021"), "Culture", "The Girlfriend, un service d'abonnement pour vidéos de petites amies virtuelles, a été lancé en 2020 par l'entreprise américaine CarynAI."),
            en = LocalizedContent("In what year was 'The Girlfriend' launched?", listOf("2018", "2019", "2020", "2021"), "Culture", "The Girlfriend, a subscription service for virtual girlfriend videos, was launched in 2020 by the American company CarynAI."),
            zh = LocalizedContent("《The Girlfriend》是哪一年推出的？", listOf("2018", "2019", "2020", "2021"), "文化", "《The Girlfriend》是一个虚拟女友视频订阅服务，由美国公司CarynAI于2020年推出。"),
            es = LocalizedContent("¿En qué año se lanzó 'The Girlfriend'?", listOf("2018", "2019", "2020", "2021"), "Cultura", "The Girlfriend, un servicio de suscripción para videos de novias virtuales, fue lanzado en 2020 por la empresa estadounidense CarynAI.")
        ),
        BilingualQuestion(
            id = 10372, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Étude de Fleurs'?", listOf("Pierre-Auguste Renoir", "Henri Fantin-Latour", "Frédéric Bazille", "Berthe Morisot"), "Culture", "Henri Fantin-Latour, peintre réaliste et symboliste français du XIXe siècle, est connu pour ses natures mortes florales et ses portraits de groupe."),
            en = LocalizedContent("Which painter created 'Study of Flowers'?", listOf("Pierre-Auguste Renoir", "Henri Fantin-Latour", "Frédéric Bazille", "Berthe Morisot"), "Culture", "Henri Fantin-Latour, a 19th-century French realist and symbolist painter, is known for his floral still lifes and group portraits."),
            zh = LocalizedContent("哪位画家创作了《花卉研究》？", listOf("皮埃尔-奥古斯特·雷诺阿", "亨利·方丹-拉图尔", "弗雷德里克·巴齐耶", "贝尔特·莫里索"), "文化", "亨利·方丹-拉图尔，19世纪法国现实主义与象征主义画家，以其花卉静物和群体肖像画闻名。"),
            es = LocalizedContent("¿Qué pintor creó 'Estudio de Flores'?", listOf("Pierre-Auguste Renoir", "Henri Fantin-Latour", "Frédéric Bazille", "Berthe Morisot"), "Cultura", "Henri Fantin-Latour, pintor realista y simbolista francés del siglo XIX, es conocido por sus naturalezas muertas florales y retratos de grupo.")
        ),
        BilingualQuestion(
            id = 10373, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie grecque, quel Titan est le père d'Hélios?", listOf("Hypérion", "Océan", "Coeus", "Théia"), "Culture", "Dans la Théogonie d'Hésiode, Hypérion, Titan de la lumière, est l'époux de Théia et le père d'Hélios (le Soleil), Séléné (la Lune) et Éos (l'Aurore)."),
            en = LocalizedContent("In Greek mythology, which Titan is the father of Helios?", listOf("Hyperion", "Oceanus", "Coeus", "Theia"), "Culture", "In Hesiod's Theogony, Hyperion, Titan of light, is the husband of Theia and father of Helios (the Sun), Selene (the Moon), and Eos (the Dawn)."),
            zh = LocalizedContent("在希腊神话中，哪位泰坦是赫利俄斯的父亲？", listOf("许珀里翁", "俄刻阿诺斯", "科俄斯", "忒亚"), "文化", "在赫西俄德的《神谱》中，光之泰坦许珀里翁是忒亚的丈夫，赫利俄斯（太阳）、塞勒涅（月亮）和厄俄斯（黎明）的父亲。"),
            es = LocalizedContent("En la mitología griega, ¿qué Titán es el padre de Helios?", listOf("Hiperión", "Océano", "Ceo", "Tea"), "Cultura", "En la Teogonía de Hesíodo, Hiperión, Titán de la luz, es el esposo de Tea y padre de Helios (el Sol), Selene (la Luna) y Eos (la Aurora).")
        ),
        BilingualQuestion(
            id = 10374, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de musique a émergé du Brésil?", listOf("Bossa Nova", "Samba", "Tropicália", "Tous les trois"), "Culture", "La samba, la bossa nova et le choro sont trois styles musicaux majeurs nés au Brésil, chacun ayant émergé à des époques et dans des régions différentes du pays."),
            en = LocalizedContent("Which style of music emerged from Brazil?", listOf("Bossa Nova", "Samba", "Tropicália", "All three"), "Culture", "Samba, bossa nova, and choro are three major musical styles born in Brazil, each emerging in different eras and regions of the country."),
            zh = LocalizedContent("哪种音乐风格源自巴西？", listOf("波萨诺瓦", "桑巴", "热带主义", "以上都是"), "文化", "桑巴、波萨诺瓦和肖罗是三种源自巴西的主要音乐风格，每种都出现在该国的不同时代和地区。"),
            es = LocalizedContent("¿Qué estilo de música surgió de Brasil?", listOf("Bossa Nova", "Samba", "Tropicália", "Los tres"), "Cultura", "La samba, la bossa nova y el choro son tres estilos musicales importantes nacidos en Brasil, cada uno surgido en diferentes épocas y regiones del país.")
        ),
        BilingualQuestion(
            id = 10375, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'Killing Eve' a-t-il commencé?", listOf("2017", "2018", "2019", "2020"), "Culture", "La série d'espionnage et de thriller psychologique Killing Eve a été diffusée pour la première fois en 2018 sur BBC America."),
            en = LocalizedContent("In what year did 'Killing Eve' start?", listOf("2017", "2018", "2019", "2020"), "Culture", "The spy thriller psychological drama series Killing Eve first aired in 2018 on BBC America."),
            zh = LocalizedContent("《杀死伊芙》是哪一年开播的？", listOf("2017", "2018", "2019", "2020"), "文化", "间谍惊悚心理剧《杀死伊芙》于2018年在BBC America首播。"),
            es = LocalizedContent("¿En qué año comenzó 'Killing Eve'?", listOf("2017", "2018", "2019", "2020"), "Cultura", "La serie de espionaje y thriller psicológico Killing Eve se emitió por primera vez en 2018 en BBC America.")
        ),
        BilingualQuestion(
            id = 10376, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Intérieur Hollandais'?", listOf("Jan Steen", "Pieter de Hooch", "Gerrit Dou", "Gerard ter Borch"), "Culture", "Jan Steen a peint 'Intérieur Hollandais' au XVIIe siècle, une scène de genre typique de l'âge d'or néerlandais."),
            en = LocalizedContent("Which painter painted 'Dutch Interior'?", listOf("Jan Steen", "Pieter de Hooch", "Gerrit Dou", "Gerard ter Borch"), "Culture", "Jan Steen painted 'Dutch Interior' in the 17th century, a typical genre scene of the Dutch Golden Age."),
            zh = LocalizedContent("哪位画家创作了《荷兰室内》？", listOf("扬·斯滕", "彼得·德·霍赫", "赫里特·道", "赫拉德·特·博尔赫"), "文化", "扬·斯滕在17世纪创作了《荷兰室内》，这是荷兰黄金时代典型的风格画。"),
            es = LocalizedContent("¿Qué pintor pintó 'Interior Holandés'?", listOf("Jan Steen", "Pieter de Hooch", "Gerrit Dou", "Gerard ter Borch"), "Cultura", "Jan Steen pintó 'Interior Holandés' en el siglo XVII, una escena de género típica de la Edad de Oro neerlandesa.")
        ),
        BilingualQuestion(
            id = 10377, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En mythologie grecque, qui est le dieu de la forge?", listOf("Apollon", "Héphaïstos", "Arès", "Hermès"), "Culture", "Héphaïstos est le dieu grec du feu, de la forge et des artisans. Il fabriquait les armes des dieux et était souvent représenté boiteux, car il avait été jeté de l'Olympe par sa mère Héra."),
            en = LocalizedContent("In Greek mythology, who is the god of the forge?", listOf("Apollo", "Hephaestus", "Ares", "Hermes"), "Culture", "Hephaestus is the Greek god of fire, the forge, and craftsmen. He forged the weapons of the gods and was often depicted as lame, having been thrown from Olympus by his mother Hera."),
            zh = LocalizedContent("在希腊神话中，谁是锻造之神？", listOf("阿波罗", "赫菲斯托斯", "阿瑞斯", "赫尔墨斯"), "文化", "赫菲斯托斯是希腊的火神、锻造之神和工匠之神。他为众神锻造武器，常被描绘成跛足，因被母亲赫拉从奥林匹斯山扔下。"),
            es = LocalizedContent("En la mitología griega, ¿quién es el dios de la forja?", listOf("Apolo", "Hefesto", "Ares", "Hermes"), "Cultura", "Hefesto es el dios griego del fuego, la forja y los artesanos. Forjaba las armas de los dioses y a menudo se le representaba cojo, ya que fue arrojado del Olimpo por su madre Hera.")
        ),
        BilingualQuestion(
            id = 10378, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de cuisine est caractérisé par les fruits de mer?", listOf("Cuisine méditerranéenne", "Cuisine côtière", "Cuisine française", "Tous les trois"), "Culture", "La cuisine côtière, la cuisine méditerranéenne et la cuisine asiatique utilisent toutes abondamment les fruits de mer, ce qui rend chaque style pertinent selon le contexte."),
            en = LocalizedContent("Which style of cuisine is characterized by seafood?", listOf("Mediterranean cuisine", "Coastal cuisine", "French cuisine", "All three"), "Culture", "Coastal cuisine, Mediterranean cuisine, and Asian cuisine all make abundant use of seafood, making each style relevant depending on context."),
            zh = LocalizedContent("哪种菜系以海鲜为特色？", listOf("地中海菜", "沿海菜", "法国菜", "以上都是"), "文化", "沿海菜、地中海菜和亚洲菜都大量使用海鲜，因此每种风格在特定语境下都相关。"),
            es = LocalizedContent("¿Qué estilo de cocina se caracteriza por los mariscos?", listOf("Cocina mediterránea", "Cocina costera", "Cocina francesa", "Los tres"), "Cultura", "La cocina costera, la cocina mediterránea y la cocina asiática utilizan abundantemente mariscos, lo que hace que cada estilo sea relevante según el contexto.")
        ),
        BilingualQuestion(
            id = 10379, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Chilling Adventures of Sabrina' a-t-il commencé?", listOf("2017", "2018", "2019", "2020"), "Culture", "Chilling Adventures of Sabrina a débuté sur Netflix en 2018, mais la série a été officiellement lancée en 2019 avec la diffusion de sa première saison complète."),
            en = LocalizedContent("In what year did 'Chilling Adventures of Sabrina' start?", listOf("2017", "2018", "2019", "2020"), "Culture", "Chilling Adventures of Sabrina debuted on Netflix in 2018, but the series officially launched in 2019 with the release of its first full season."),
            zh = LocalizedContent("《萨布丽娜的惊心冒险》是哪一年开播的？", listOf("2017", "2018", "2019", "2020"), "文化", "《萨布丽娜的惊心冒险》于2018年在Netflix首播，但该剧正式推出是在2019年第一季完整播出时。"),
            es = LocalizedContent("¿En qué año comenzó 'Chilling Adventures of Sabrina'?", listOf("2017", "2018", "2019", "2020"), "Cultura", "Chilling Adventures of Sabrina debutó en Netflix en 2018, pero la serie se lanzó oficialmente en 2019 con el estreno de su primera temporada completa.")
        ),
        BilingualQuestion(
            id = 10380, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Femme au Tambourin'?", listOf("Pablo Picasso", "Henri Matisse", "Georges Braque", "Juan Gris"), "Culture", "Pablo Picasso a peint 'Femme au Tambourin' en 1925, une œuvre représentant sa compagne Olga Khokhlova, typique de sa période néoclassique."),
            en = LocalizedContent("Which painter created 'Woman with a Tambourine'?", listOf("Pablo Picasso", "Henri Matisse", "Georges Braque", "Juan Gris"), "Culture", "Pablo Picasso painted 'Woman with a Tambourine' in 1925, a work depicting his companion Olga Khokhlova, typical of his neoclassical period."),
            zh = LocalizedContent("哪位画家创作了《持铃鼓的女人》？", listOf("巴勃罗·毕加索", "亨利·马蒂斯", "乔治·布拉克", "胡安·格里斯"), "文化", "巴勃罗·毕加索于1925年创作了《持铃鼓的女人》，描绘了他的伴侣奥尔加·霍赫洛娃，属于他的新古典主义时期。"),
            es = LocalizedContent("¿Qué pintor creó 'Mujer con pandereta'?", listOf("Pablo Picasso", "Henri Matisse", "Georges Braque", "Juan Gris"), "Cultura", "Pablo Picasso pintó 'Mujer con pandereta' en 1925, una obra que representa a su compañera Olga Khokhlova, típica de su período neoclásico.")
        ),
        BilingualQuestion(
            id = 10381, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie égyptienne, quel dieu a deux cornes de bélier?", listOf("Khépri", "Amon", "Thot", "Ptah"), "Culture", "Amon était souvent représenté avec une tête de bélier ou des cornes de bélier, symbolisant sa puissance créatrice et sa fertilité."),
            en = LocalizedContent("In Egyptian mythology, which god has two ram horns?", listOf("Khepri", "Amun", "Thoth", "Ptah"), "Culture", "Amun was often depicted with a ram's head or ram horns, symbolizing his creative power and fertility."),
            zh = LocalizedContent("在埃及神话中，哪位神有两只公羊角？", listOf("凯布利", "阿蒙", "托特", "卜塔"), "文化", "阿蒙常被描绘为有公羊头或公羊角，象征他的创造力和丰饶。"),
            es = LocalizedContent("En la mitología egipcia, ¿qué dios tiene dos cuernos de carnero?", listOf("Jepri", "Amón", "Thot", "Ptah"), "Cultura", "Amón a menudo era representado con cabeza de carnero o cuernos de carnero, simbolizando su poder creador y fertilidad.")
        ),
        BilingualQuestion(
            id = 10382, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur a écrit 'Swan Lake'?", listOf("Modest Mussorgski", "Piotr Ilyitch Tchaïkovski", "Sergei Rachmaninoff", "Alexander Scriabin"), "Culture", "Tchaïkovski a composé 'Le Lac des cygnes' entre 1875 et 1876, sur commande du Théâtre Bolchoï de Moscou. C'est l'un des ballets les plus célèbres du répertoire classique."),
            en = LocalizedContent("Which composer wrote 'Swan Lake'?", listOf("Modest Mussorgsky", "Pyotr Ilyich Tchaikovsky", "Sergei Rachmaninoff", "Alexander Scriabin"), "Culture", "Tchaikovsky composed 'Swan Lake' between 1875 and 1876, commissioned by the Bolshoi Theatre in Moscow. It is one of the most famous ballets in the classical repertoire."),
            zh = LocalizedContent("哪位作曲家创作了《天鹅湖》？", listOf("莫杰斯特·穆索尔斯基", "彼得·伊里奇·柴可夫斯基", "谢尔盖·拉赫玛尼诺夫", "亚历山大·斯克里亚宾"), "文化", "柴可夫斯基于1875年至1876年间创作了《天鹅湖》，受莫斯科大剧院委托。这是古典剧目中最著名的芭蕾舞剧之一。"),
            es = LocalizedContent("¿Qué compositor escribió 'El lago de los cisnes'?", listOf("Modest Músorgski", "Piotr Ilich Chaikovski", "Serguéi Rajmáninov", "Aleksandr Skriabin"), "Cultura", "Chaikovski compuso 'El lago de los cisnes' entre 1875 y 1876, por encargo del Teatro Bolshói de Moscú. Es uno de los ballets más famosos del repertorio clásico.")
        ),
        BilingualQuestion(
            id = 10383, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Godlessness' a-t-il été lancé?", listOf("2016", "2017", "2018", "2019"), "Culture", "Godlessness est un album du groupe de black metal autrichien Harakiri for the Sky, sorti en 2017."),
            en = LocalizedContent("In which year was 'Godlessness' released?", listOf("2016", "2017", "2018", "2019"), "Culture", "'Godlessness' is an album by the Austrian black metal band Harakiri for the Sky, released in 2017."),
            zh = LocalizedContent("《Godlessness》是哪一年发行的？", listOf("2016", "2017", "2018", "2019"), "文化", "《Godlessness》是奥地利黑金属乐队Harakiri for the Sky的专辑，于2017年发行。"),
            es = LocalizedContent("¿En qué año se lanzó 'Godlessness'?", listOf("2016", "2017", "2018", "2019"), "Cultura", "'Godlessness' es un álbum de la banda austriaca de black metal Harakiri for the Sky, lanzado en 2017.")
        ),
        BilingualQuestion(
            id = 10384, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Étude de Chevaux'?", listOf("Théodore Géricault", "Eugène Delacroix", "George Stubbs", "John Frederick Herring"), "Culture", "Théodore Géricault, peintre romantique français du XIXe siècle, est connu pour sa fascination pour les chevaux, qu'il a représentés dans de nombreuses œuvres, dont \"Étude de Chevaux\"."),
            en = LocalizedContent("Which painter painted 'Study of Horses'?", listOf("Théodore Géricault", "Eugène Delacroix", "George Stubbs", "John Frederick Herring"), "Culture", "Théodore Géricault, a French Romantic painter of the 19th century, is known for his fascination with horses, which he depicted in many works, including 'Study of Horses'."),
            zh = LocalizedContent("哪位画家创作了《马的研究》？", listOf("泰奥多尔·籍里柯", "欧仁·德拉克罗瓦", "乔治·斯塔布斯", "约翰·弗雷德里克·赫林"), "文化", "泰奥多尔·籍里柯是19世纪法国浪漫主义画家，以对马的迷恋而闻名，他在许多作品中描绘了马，包括《马的研究》。"),
            es = LocalizedContent("¿Qué pintor pintó 'Estudio de caballos'?", listOf("Théodore Géricault", "Eugène Delacroix", "George Stubbs", "John Frederick Herring"), "Cultura", "Théodore Géricault, pintor romántico francés del siglo XIX, es conocido por su fascinación por los caballos, a los que representó en muchas obras, incluido 'Estudio de caballos'.")
        ),
        BilingualQuestion(
            id = 10385, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En mythologie grecque, qui est la déesse de la beauté?", listOf("Héra", "Aphrodite", "Athéna", "Artémis"), "Culture", "Aphrodite est la déesse grecque de l'amour, de la beauté et de la procréation, souvent associée à la séduction et au désir."),
            en = LocalizedContent("In Greek mythology, who is the goddess of beauty?", listOf("Hera", "Aphrodite", "Athena", "Artemis"), "Culture", "Aphrodite is the Greek goddess of love, beauty, and procreation, often associated with seduction and desire."),
            zh = LocalizedContent("在希腊神话中，谁是美神？", listOf("赫拉", "阿佛洛狄忒", "雅典娜", "阿尔忒弥斯"), "文化", "阿佛洛狄忒是希腊的爱与美之神，常与诱惑和欲望相关联。"),
            es = LocalizedContent("En la mitología griega, ¿quién es la diosa de la belleza?", listOf("Hera", "Afrodita", "Atenea", "Artemisa"), "Cultura", "Afrodita es la diosa griega del amor, la belleza y la procreación, a menudo asociada con la seducción y el deseo.")
        ),
        BilingualQuestion(
            id = 10386, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de danse a émergé de la Nouvelle-Orléans?", listOf("Jazz Dance", "Tap Dance", "Swing", "Tous les trois"), "Culture", "La Nouvelle-Orléans est le berceau du jazz, et le jazz a influencé plusieurs danses comme le charleston, le lindy hop et le swing, qui y ont émergé ou se sont développées."),
            en = LocalizedContent("Which dance style emerged from New Orleans?", listOf("Jazz Dance", "Tap Dance", "Swing", "All three"), "Culture", "New Orleans is the birthplace of jazz, and jazz influenced several dances such as the Charleston, Lindy Hop, and Swing, which emerged or developed there."),
            zh = LocalizedContent("哪种舞蹈风格起源于新奥尔良？", listOf("爵士舞", "踢踏舞", "摇摆舞", "以上全部"), "文化", "新奥尔良是爵士乐的发源地，爵士乐影响了多种舞蹈，如查尔斯顿舞、林迪舞和摇摆舞，它们都在那里兴起或发展。"),
            es = LocalizedContent("¿Qué estilo de baile surgió de Nueva Orleans?", listOf("Danza Jazz", "Claqué", "Swing", "Los tres"), "Cultura", "Nueva Orleans es la cuna del jazz, y el jazz influyó en varios bailes como el charlestón, el lindy hop y el swing, que surgieron o se desarrollaron allí.")
        ),
        BilingualQuestion(
            id = 10387, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Insecure' a-t-il commencé?", listOf("2014", "2015", "2016", "2017"), "Culture", "La série comique et dramatique 'Insecure', créée par Issa Rae et Larry Wilmore, a été diffusée pour la première fois sur HBO en octobre 2016."),
            en = LocalizedContent("In which year did 'Insecure' start?", listOf("2014", "2015", "2016", "2017"), "Culture", "The comedy-drama series 'Insecure', created by Issa Rae and Larry Wilmore, first aired on HBO in October 2016."),
            zh = LocalizedContent("《不安感》是哪一年开播的？", listOf("2014", "2015", "2016", "2017"), "文化", "喜剧剧情系列《不安感》由伊萨·雷和拉里·威尔莫创作，于2016年10月在HBO首播。"),
            es = LocalizedContent("¿En qué año comenzó 'Insecure'?", listOf("2014", "2015", "2016", "2017"), "Cultura", "La serie de comedia dramática 'Insecure', creada por Issa Rae y Larry Wilmore, se emitió por primera vez en HBO en octubre de 2016.")
        ),
        BilingualQuestion(
            id = 10388, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Intérieur avec Chat'?", listOf("Félix Vallotton", "Édouard Vuillard", "Pierre Bonnard", "Deux des trois"), "Culture", "Balthus a peint plusieurs versions d'Intérieur avec Chat, dont une en 1947 et une autre en 1954, ce qui explique que la réponse soit \"Deux des trois\"."),
            en = LocalizedContent("Which painter created 'Interior with Cat'?", listOf("Félix Vallotton", "Édouard Vuillard", "Pierre Bonnard", "Two of the three"), "Culture", "Balthus painted several versions of 'Interior with Cat', including one in 1947 and another in 1954, which explains why the answer is 'Two of the three'."),
            zh = LocalizedContent("哪位画家创作了《室内与猫》？", listOf("费利克斯·瓦洛东", "爱德华·维亚尔", "皮埃尔·博纳尔", "以上两位"), "文化", "巴尔蒂斯画了多个版本的《室内与猫》，包括1947年和1954年的版本，因此答案是“以上两位”。"),
            es = LocalizedContent("¿Qué pintor creó 'Interior con gato'?", listOf("Félix Vallotton", "Édouard Vuillard", "Pierre Bonnard", "Dos de los tres"), "Cultura", "Balthus pintó varias versiones de 'Interior con gato', incluyendo una en 1947 y otra en 1954, lo que explica que la respuesta sea 'Dos de los tres'.")
        ),
        BilingualQuestion(
            id = 10389, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie romaine, quel est le nom de la déesse de la victoire?", listOf("Victoria", "Victrix", "Valkyrie", "Nike"), "Culture", "Victoria est l'équivalent romain de la Niké grecque, déesse personnifiant la victoire, souvent représentée avec des ailes et une couronne de laurier."),
            en = LocalizedContent("In Roman mythology, what is the name of the goddess of victory?", listOf("Victoria", "Victrix", "Valkyrie", "Nike"), "Culture", "Victoria is the Roman equivalent of the Greek Nike, goddess personifying victory, often depicted with wings and a laurel wreath."),
            zh = LocalizedContent("在罗马神话中，胜利女神的名字是什么？", listOf("维多利亚", "维克特里克斯", "瓦尔基里", "尼刻"), "文化", "维多利亚是希腊尼刻的罗马对应神，象征胜利，常被描绘为有翅膀和月桂花环。"),
            es = LocalizedContent("En la mitología romana, ¿cuál es el nombre de la diosa de la victoria?", listOf("Victoria", "Victrix", "Valkiria", "Niké"), "Cultura", "Victoria es el equivalente romano de la Niké griega, diosa que personifica la victoria, a menudo representada con alas y una corona de laurel.")
        ),
        BilingualQuestion(
            id = 10390, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de cuisine est originaire de la Thaïlande du Nordest?", listOf("Pad Krapow", "Larb", "Som Tam", "Deux des trois"), "Culture", "La cuisine de la Thaïlande du Nord-Est, appelée Isan, est distincte du reste du pays, avec des plats comme le larb et le som tam. Deux de ses trois influences majeures sont la cuisine laotienne et khmère."),
            en = LocalizedContent("Which style of cuisine originates from northeastern Thailand?", listOf("Pad Krapow", "Larb", "Som Tam", "Two of the three"), "Culture", "The cuisine of northeastern Thailand, called Isan, is distinct from the rest of the country, with dishes like larb and som tam. Two of its three major influences are Lao and Khmer cuisines."),
            zh = LocalizedContent("哪种菜系起源于泰国东北部？", listOf("打抛猪肉", "拉布", "宋丹", "以上两种"), "文化", "泰国东北部菜系称为伊桑菜，与泰国其他地区不同，代表菜有拉布和宋丹。其三大主要影响中的两个是老挝菜和高棉菜。"),
            es = LocalizedContent("¿Qué estilo de cocina es originario del noreste de Tailandia?", listOf("Pad Krapow", "Larb", "Som Tam", "Dos de los tres"), "Cultura", "La cocina del noreste de Tailandia, llamada Isan, es distinta del resto del país, con platos como larb y som tam. Dos de sus tres influencias principales son la cocina laosiana y la jemer.")
        ),
        BilingualQuestion(
            id = 10391, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Chappelle's Show' a-t-il commencé?", listOf("2001", "2002", "2003", "2004"), "Culture", "Le sketch show de Dave Chappelle a été diffusé pour la première fois sur Comedy Central en 2003, marquant le début de son succès critique et populaire."),
            en = LocalizedContent("In which year did 'Chappelle's Show' start?", listOf("2001", "2002", "2003", "2004"), "Culture", "Dave Chappelle's sketch show first aired on Comedy Central in 2003, marking the beginning of its critical and popular success."),
            zh = LocalizedContent("《查普尔秀》在哪一年开播？", listOf("2001", "2002", "2003", "2004"), "文化", "戴夫·查普尔的喜剧小品节目于2003年在喜剧中心首播，标志着其评论和商业成功的开始。"),
            es = LocalizedContent("¿En qué año comenzó 'Chappelle's Show'?", listOf("2001", "2002", "2003", "2004"), "Cultura", "El programa de sketches de Dave Chappelle se emitió por primera vez en Comedy Central en 2003, marcando el inicio de su éxito crítico y popular.")
        ),
        BilingualQuestion(
            id = 10392, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Buveurs de Café'?", listOf("Jean-François Millet", "Gustave Courbet", "Honoré Daumier", "Camille Pissarro"), "Culture", "Honoré Daumier a peint Les Buveurs de café en 1860, une œuvre réaliste représentant des habitués de bistrot parisiens."),
            en = LocalizedContent("Which painter painted 'Coffee Drinkers'?", listOf("Jean-François Millet", "Gustave Courbet", "Honoré Daumier", "Camille Pissarro"), "Culture", "Honoré Daumier painted 'The Coffee Drinkers' in 1860, a realistic work depicting regulars in a Parisian bistro."),
            zh = LocalizedContent("哪位画家创作了《喝咖啡的人》？", listOf("让-弗朗索瓦·米勒", "古斯塔夫·库尔贝", "奥诺雷·杜米埃", "卡米耶·毕沙罗"), "文化", "奥诺雷·杜米埃于1860年创作了《喝咖啡的人》，这是一幅现实主义作品，描绘了巴黎小酒馆的常客。"),
            es = LocalizedContent("¿Qué pintor pintó 'Bebedores de café'?", listOf("Jean-François Millet", "Gustave Courbet", "Honoré Daumier", "Camille Pissarro"), "Cultura", "Honoré Daumier pintó 'Los bebedores de café' en 1860, una obra realista que representa a los habituales de un bistró parisino.")
        ),
        BilingualQuestion(
            id = 10393, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie grecque, quel est le nombre des Titans?", listOf("6", "8", "12", "15"), "Culture", "Dans la Théogonie d'Hésiode, les douze Titans sont les enfants d'Ouranos (le Ciel) et Gaïa (la Terre), formant la première génération divine avant les dieux de l'Olympe."),
            en = LocalizedContent("In Greek mythology, what is the number of Titans?", listOf("6", "8", "12", "15"), "Culture", "In Hesiod's Theogony, the twelve Titans are the children of Uranus (Sky) and Gaia (Earth), forming the first divine generation before the Olympian gods."),
            zh = LocalizedContent("在希腊神话中，泰坦的数量是多少？", listOf("6", "8", "12", "15"), "文化", "在赫西俄德的《神谱》中，十二泰坦是乌拉诺斯（天空）和盖亚（大地）的孩子，构成了奥林匹斯众神之前的第一代神祇。"),
            es = LocalizedContent("En la mitología griega, ¿cuál es el número de Titanes?", listOf("6", "8", "12", "15"), "Cultura", "En la Teogonía de Hesíodo, los doce Titanes son hijos de Urano (el Cielo) y Gea (la Tierra), formando la primera generación divina antes de los dioses del Olimpo.")
        ),
        BilingualQuestion(
            id = 10394, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit 'The Rite of Spring'?", listOf("Sergei Rachmaninoff", "Igor Stravinsky", "Alexander Scriabin", "Nikolai Rimsky-Korsakov"), "Culture", "Igor Stravinsky a composé 'The Rite of Spring' en 1913 pour les Ballets Russes, provoquant un scandale lors de sa première à Paris en raison de sa musique dissonante et de sa chorégraphie novatrice."),
            en = LocalizedContent("Which composer wrote 'The Rite of Spring'?", listOf("Sergei Rachmaninoff", "Igor Stravinsky", "Alexander Scriabin", "Nikolai Rimsky-Korsakov"), "Culture", "Igor Stravinsky composed 'The Rite of Spring' in 1913 for the Ballets Russes, causing a scandal at its Paris premiere due to its dissonant music and innovative choreography."),
            zh = LocalizedContent("哪位作曲家创作了《春之祭》？", listOf("谢尔盖·拉赫玛尼诺夫", "伊戈尔·斯特拉文斯基", "亚历山大·斯克里亚宾", "尼古拉·里姆斯基-科萨科夫"), "文化", "伊戈尔·斯特拉文斯基于1913年为俄罗斯芭蕾舞团创作了《春之祭》，因其不和谐的音乐和创新的编舞在巴黎首演时引发丑闻。"),
            es = LocalizedContent("¿Qué compositor escribió 'La consagración de la primavera'?", listOf("Serguéi Rajmáninov", "Ígor Stravinski", "Aleksandr Skriabin", "Nikolái Rimski-Kórsakov"), "Cultura", "Ígor Stravinski compuso 'La consagración de la primavera' en 1913 para los Ballets Rusos, provocando un escándalo en su estreno en París debido a su música disonante y coreografía innovadora.")
        ),
        BilingualQuestion(
            id = 10395, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Bust Down' a-t-il commencé?", listOf("2020", "2021", "2022", "2023"), "Culture", "Bust Down est une série de sketchs humoristiques diffusée sur YouTube, créée par des rappeurs comme Trippie Redd et lancée en 2022."),
            en = LocalizedContent("In which year did 'Bust Down' start?", listOf("2020", "2021", "2022", "2023"), "Culture", "'Bust Down' is a comedy sketch series aired on YouTube, created by rappers like Trippie Redd and launched in 2022."),
            zh = LocalizedContent("《Bust Down》在哪一年开播？", listOf("2020", "2021", "2022", "2023"), "文化", "《Bust Down》是一部在YouTube上播出的喜剧小品系列，由Trippie Redd等说唱歌手创作，于2022年推出。"),
            es = LocalizedContent("¿En qué año comenzó 'Bust Down'?", listOf("2020", "2021", "2022", "2023"), "Cultura", "'Bust Down' es una serie de sketches cómicos emitida en YouTube, creada por raperos como Trippie Redd y lanzada en 2022.")
        ),
        BilingualQuestion(
            id = 10396, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Paysage avec Ruines'?", listOf("Claude Lorrain", "Nicolas Poussin", "Salvator Rosa", "Tous les trois"), "Culture", "Le tableau 'Paysage avec Ruines' est une œuvre collective réalisée par trois peintres flamands du XVIIe siècle : Paul Bril, Cornelis van Poelenburch et Bartholomeus Breenbergh."),
            en = LocalizedContent("Which painter created 'Landscape with Ruins'?", listOf("Claude Lorrain", "Nicolas Poussin", "Salvator Rosa", "All three"), "Culture", "The painting 'Landscape with Ruins' is a collective work by three Flemish painters of the 17th century: Paul Bril, Cornelis van Poelenburch, and Bartholomeus Breenbergh."),
            zh = LocalizedContent("哪位画家创作了《废墟风景》？", listOf("克劳德·洛兰", "尼古拉·普桑", "萨尔瓦多·罗萨", "以上全部"), "文化", "《废墟风景》是17世纪三位佛兰德画家的集体作品：保罗·布里尔、科内利斯·范·波伦堡和巴托洛梅乌斯·布伦伯格。"),
            es = LocalizedContent("¿Qué pintor creó 'Paisaje con ruinas'?", listOf("Claudio de Lorena", "Nicolás Poussin", "Salvator Rosa", "Los tres"), "Cultura", "El cuadro 'Paisaje con ruinas' es una obra colectiva de tres pintores flamencos del siglo XVII: Paul Bril, Cornelis van Poelenburch y Bartholomeus Breenbergh.")
        ),
        BilingualQuestion(
            id = 10397, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie égyptienne, quel dieu a une tête d'ibis?", listOf("Tefnout", "Thot", "Geb", "Shu"), "Culture", "Thot est le dieu égyptien de l'écriture, de la sagesse et de la magie, souvent représenté avec une tête d'ibis en raison de l'association de cet oiseau à la connaissance."),
            en = LocalizedContent("In Egyptian mythology, which god has the head of an ibis?", listOf("Tefnut", "Thoth", "Geb", "Shu"), "Culture", "Thoth is the Egyptian god of writing, wisdom, and magic, often depicted with the head of an ibis due to the bird's association with knowledge."),
            zh = LocalizedContent("在埃及神话中，哪位神有朱鹭的头？", listOf("泰芙努特", "托特", "盖布", "舒"), "文化", "托特是埃及的书写、智慧和魔法之神，常被描绘成朱鹭头，因为这种鸟与知识相关联。"),
            es = LocalizedContent("En la mitología egipcia, ¿qué dios tiene cabeza de ibis?", listOf("Tefnut", "Thot", "Geb", "Shu"), "Cultura", "Thot es el dios egipcio de la escritura, la sabiduría y la magia, a menudo representado con cabeza de ibis debido a la asociación de esta ave con el conocimiento.")
        ),
        BilingualQuestion(
            id = 10398, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de danse est associé à la Russie?", listOf("Ballet", "Cosaque Dance", "Russian Folk Dance", "Tous les trois"), "Culture", "La Russie a plusieurs danses traditionnelles emblématiques, dont la danse cosaque, la danse folklorique russe et le ballet classique, qui y est particulièrement développé."),
            en = LocalizedContent("Which dance style is associated with Russia?", listOf("Ballet", "Cossack Dance", "Russian Folk Dance", "All three"), "Culture", "Russia has several iconic traditional dances, including Cossack dance, Russian folk dance, and classical ballet, which is particularly developed there."),
            zh = LocalizedContent("哪种舞蹈风格与俄罗斯相关？", listOf("芭蕾", "哥萨克舞", "俄罗斯民间舞", "以上全部"), "文化", "俄罗斯有几种标志性的传统舞蹈，包括哥萨克舞、俄罗斯民间舞和古典芭蕾，后者在俄罗斯尤为发达。"),
            es = LocalizedContent("¿Qué estilo de baile está asociado con Rusia?", listOf("Ballet", "Danza cosaca", "Danza folclórica rusa", "Los tres"), "Cultura", "Rusia tiene varios bailes tradicionales emblemáticos, como la danza cosaca, la danza folclórica rusa y el ballet clásico, que está particularmente desarrollado allí.")
        ),
        BilingualQuestion(
            id = 10399, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'The Bear' s'est-il terminé?", listOf("2023", "2024", "2025", "2026"), "Culture", "La série 'The Bear' a diffusé sa troisième saison en 2024, et la quatrième et dernière saison est prévue pour 2025, marquant ainsi la fin de la série cette année-là."),
            en = LocalizedContent("In which year did 'The Bear' end?", listOf("2023", "2024", "2025", "2026"), "Culture", "The series 'The Bear' aired its third season in 2024, and the fourth and final season is scheduled for 2025, marking the end of the series that year."),
            zh = LocalizedContent("《熊家餐馆》在哪一年完结？", listOf("2023", "2024", "2025", "2026"), "文化", "《熊家餐馆》第三季于2024年播出，第四季即最终季计划于2025年播出，标志着该剧在那一年完结。"),
            es = LocalizedContent("¿En qué año terminó 'The Bear'?", listOf("2023", "2024", "2025", "2026"), "Cultura", "La serie 'The Bear' emitió su tercera temporada en 2024, y la cuarta y última temporada está programada para 2025, marcando el final de la serie ese año.")
        ),
        BilingualQuestion(
            id = 10400, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel peintre a peint 'Épée de Damoclès'?", listOf("Jean-Léon Gérôme", "Frederic Leighton", "Lawrence Alma-Tadema", "Peter Paul Rubens"), "Culture", "Jean-Léon Gérôme, peintre académique français du XIXe siècle, a réalisé cette œuvre illustrant la légende antique de Damoclès."),
            en = LocalizedContent("Which painter painted 'Sword of Damocles'?", listOf("Jean-Léon Gérôme", "Frederic Leighton", "Lawrence Alma-Tadema", "Peter Paul Rubens"), "Culture", "Jean-Léon Gérôme, a 19th-century French academic painter, created this work illustrating the ancient legend of Damocles."),
            zh = LocalizedContent("哪位画家画了《达摩克利斯之剑》？", listOf("让-莱昂·热罗姆", "弗雷德里克·莱顿", "劳伦斯·阿尔玛-塔德玛", "彼得·保罗·鲁本斯"), "文化", "让-莱昂·热罗姆，19世纪法国学院派画家，创作了这幅描绘达摩克利斯古老传说的作品。"),
            es = LocalizedContent("¿Qué pintor pintó 'Espada de Damocles'?", listOf("Jean-Léon Gérôme", "Frederic Leighton", "Lawrence Alma-Tadema", "Peter Paul Rubens"), "Cultura", "Jean-Léon Gérôme, pintor académico francés del siglo XIX, realizó esta obra que ilustra la antigua leyenda de Damocles.")
        ),
        BilingualQuestion(
            id = 10401, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie grecque, quel est le nom de l'ambroisie?", listOf("Népenthès", "Ambrosia", "Aulos", "Kalydos"), "Culture", "Dans la mythologie grecque, l'ambroisie est la nourriture des dieux de l'Olympe, leur conférant l'immortalité. Son nom signifie littéralement « immortalité » en grec ancien."),
            en = LocalizedContent("In Greek mythology, what is the name of ambrosia?", listOf("Nepenthes", "Ambrosia", "Aulos", "Kalydos"), "Culture", "In Greek mythology, ambrosia is the food of the Olympian gods, granting them immortality. Its name literally means 'immortality' in ancient Greek."),
            zh = LocalizedContent("在希腊神话中，神馔的名字是什么？", listOf("忘忧草", "安布罗西亚", "阿夫洛斯管", "卡吕冬"), "文化", "在希腊神话中，安布罗西亚是奥林匹斯众神的食物，赋予他们永生。其名称在古希腊语中字面意思是“不朽”。"),
            es = LocalizedContent("En la mitología griega, ¿cuál es el nombre de la ambrosía?", listOf("Nepentes", "Ambrosía", "Aulos", "Kalydos"), "Cultura", "En la mitología griega, la ambrosía es el alimento de los dioses del Olimpo, que les otorga la inmortalidad. Su nombre significa literalmente 'inmortalidad' en griego antiguo.")
        ),
        BilingualQuestion(
            id = 10402, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de cuisine italienne utilise la crème de truffe?", listOf("Cuisine piémontaise", "Cuisine de Modène", "Cuisine toscane", "Cuisine sicilienne"), "Culture", "La crème de truffe est un ingrédient emblématique du Piémont, région du nord-ouest de l'Italie réputée pour ses truffes blanches d'Alba."),
            en = LocalizedContent("Which style of Italian cuisine uses truffle cream?", listOf("Piedmontese cuisine", "Cuisine of Modena", "Tuscan cuisine", "Sicilian cuisine"), "Culture", "Truffle cream is an emblematic ingredient of Piedmont, a region in northwestern Italy renowned for its white truffles from Alba."),
            zh = LocalizedContent("哪种意大利菜系使用松露酱？", listOf("皮埃蒙特菜", "摩德纳菜", "托斯卡纳菜", "西西里菜"), "文化", "松露酱是皮埃蒙特的标志性食材，该地区位于意大利西北部，以阿尔巴的白松露闻名。"),
            es = LocalizedContent("¿Qué estilo de cocina italiana utiliza crema de trufa?", listOf("Cocina piamontesa", "Cocina de Módena", "Cocina toscana", "Cocina siciliana"), "Cultura", "La crema de trufa es un ingrediente emblemático del Piamonte, región del noroeste de Italia famosa por sus trufas blancas de Alba.")
        ),
        BilingualQuestion(
            id = 10403, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Dream Girl' a-t-il commencé?", listOf("2020", "2021", "2022", "2023"), "Culture", "Dream Girl est une web-série indienne comique et romantique diffusée sur Amazon Mini TV, dont la première saison a débuté en 2021."),
            en = LocalizedContent("In which year did 'Dream Girl' start?", listOf("2020", "2021", "2022", "2023"), "Culture", "Dream Girl is an Indian romantic comedy web series aired on Amazon Mini TV, whose first season began in 2021."),
            zh = LocalizedContent("《梦幻女孩》在哪一年开播？", listOf("2020", "2021", "2022", "2023"), "文化", "《梦幻女孩》是一部在Amazon Mini TV播出的印度浪漫喜剧网络剧，第一季于2021年开播。"),
            es = LocalizedContent("¿En qué año comenzó 'Dream Girl'?", listOf("2020", "2021", "2022", "2023"), "Cultura", "Dream Girl es una serie web india de comedia romántica emitida en Amazon Mini TV, cuya primera temporada comenzó en 2021.")
        ),
        BilingualQuestion(
            id = 10404, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Vénus et Mars'?", listOf("Sandro Botticelli", "Tiziano", "Giovanni Bellini", "Giorgione"), "Culture", "Sandro Botticelli a peint 'Vénus et Mars' vers 1485, une œuvre allégorique de la Renaissance italienne représentant l'amour triomphant de la guerre."),
            en = LocalizedContent("Which painter created 'Venus and Mars'?", listOf("Sandro Botticelli", "Titian", "Giovanni Bellini", "Giorgione"), "Culture", "Sandro Botticelli painted 'Venus and Mars' around 1485, an allegorical work of the Italian Renaissance depicting love triumphing over war."),
            zh = LocalizedContent("哪位画家创作了《维纳斯与马尔斯》？", listOf("桑德罗·波提切利", "提香", "乔瓦尼·贝利尼", "乔尔乔内"), "文化", "桑德罗·波提切利大约在1485年绘制了《维纳斯与马尔斯》，这是一幅意大利文艺复兴时期的寓言作品，描绘了爱情战胜战争。"),
            es = LocalizedContent("¿Qué pintor creó 'Venus y Marte'?", listOf("Sandro Botticelli", "Tiziano", "Giovanni Bellini", "Giorgione"), "Cultura", "Sandro Botticelli pintó 'Venus y Marte' hacia 1485, una obra alegórica del Renacimiento italiano que representa el amor triunfando sobre la guerra.")
        ),
        BilingualQuestion(
            id = 10405, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie romaine, quel est le nom du dieu du vin?", listOf("Liber", "Bacchus", "Dionysus", "Deux des trois"), "Culture", "Le dieu du vin dans la mythologie romaine est Bacchus, équivalent du grec Dionysos, souvent représenté avec une coupe de vin et des grappes de raisin."),
            en = LocalizedContent("In Roman mythology, what is the name of the god of wine?", listOf("Liber", "Bacchus", "Dionysus", "Two of the three"), "Culture", "The god of wine in Roman mythology is Bacchus, equivalent to the Greek Dionysus, often depicted with a wine cup and grape clusters."),
            zh = LocalizedContent("在罗马神话中，酒神的名字是什么？", listOf("利伯", "巴克斯", "狄俄尼索斯", "以上两个"), "文化", "罗马神话中的酒神是巴克斯，相当于希腊的狄俄尼索斯，常被描绘为手持酒杯和葡萄串。"),
            es = LocalizedContent("En la mitología romana, ¿cuál es el nombre del dios del vino?", listOf("Liber", "Baco", "Dioniso", "Dos de los tres"), "Cultura", "El dios del vino en la mitología romana es Baco, equivalente al griego Dioniso, a menudo representado con una copa de vino y racimos de uvas.")
        ),
        BilingualQuestion(
            id = 10406, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur a écrit 'Winter'?", listOf("Georg Friedrich Händel", "Antonio Vivaldi", "Arcangelo Corelli", "Ione"), "Culture", "Antonio Vivaldi a composé \"Winter\" (L'Inverno) comme l'un des quatre concertos pour violon de son célèbre recueil \"Les Quatre Saisons\", publié en 1723."),
            en = LocalizedContent("Which composer wrote 'Winter'?", listOf("George Frideric Handel", "Antonio Vivaldi", "Arcangelo Corelli", "Ione"), "Culture", "Antonio Vivaldi composed 'Winter' (L'Inverno) as one of the four violin concertos in his famous collection 'The Four Seasons', published in 1723."),
            zh = LocalizedContent("哪位作曲家创作了《冬》？", listOf("乔治·弗里德里希·亨德尔", "安东尼奥·维瓦尔第", "阿尔坎杰罗·科雷利", "伊奥内"), "文化", "安东尼奥·维瓦尔第创作了《冬》（L'Inverno），作为其著名作品集《四季》中的四首小提琴协奏曲之一，于1723年出版。"),
            es = LocalizedContent("¿Qué compositor escribió 'Invierno'?", listOf("Georg Friedrich Händel", "Antonio Vivaldi", "Arcangelo Corelli", "Ione"), "Cultura", "Antonio Vivaldi compuso 'Invierno' (L'Inverno) como uno de los cuatro conciertos para violín de su famosa colección 'Las cuatro estaciones', publicada en 1723.")
        ),
        BilingualQuestion(
            id = 10407, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Special' a-t-il commencé?", listOf("2018", "2019", "2020", "2021"), "Culture", "Le podcast « Special » de Karim Rissouli a été lancé en 2020 sur France Inter, proposant des entretiens longs et intimes avec des personnalités."),
            en = LocalizedContent("In which year did 'Special' start?", listOf("2018", "2019", "2020", "2021"), "Culture", "The podcast 'Special' by Karim Rissouli was launched in 2020 on France Inter, offering long, intimate interviews with personalities."),
            zh = LocalizedContent("《特别》在哪一年开播？", listOf("2018", "2019", "2020", "2021"), "文化", "卡里姆·里苏利的播客《特别》于2020年在法国国际广播电台推出，提供与名人的长篇亲密访谈。"),
            es = LocalizedContent("¿En qué año comenzó 'Special'?", listOf("2018", "2019", "2020", "2021"), "Cultura", "El podcast 'Special' de Karim Rissouli se lanzó en 2020 en France Inter, ofreciendo entrevistas largas e íntimas con personalidades.")
        ),
        BilingualQuestion(
            id = 10408, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Nuit d'Hiver'?", listOf("Wassily Kandinsky", "Oskar Kokoschka", "Egon Schiele", "Max Beckmann"), "Culture", "Oskar Kokoschka, peintre expressionniste autrichien, a réalisé 'Nuit d'Hiver' en 1914, une œuvre reflétant son style tourmenté et ses expériences personnelles."),
            en = LocalizedContent("Which painter painted 'Winter Night'?", listOf("Wassily Kandinsky", "Oskar Kokoschka", "Egon Schiele", "Max Beckmann"), "Culture", "Oskar Kokoschka, an Austrian expressionist painter, created 'Winter Night' in 1914, a work reflecting his tormented style and personal experiences."),
            zh = LocalizedContent("哪位画家画了《冬夜》？", listOf("瓦西里·康定斯基", "奥斯卡·科柯施卡", "埃贡·席勒", "马克斯·贝克曼"), "文化", "奥斯卡·科柯施卡，奥地利表现主义画家，于1914年创作了《冬夜》，这幅作品反映了他痛苦的个人风格和经历。"),
            es = LocalizedContent("¿Qué pintor pintó 'Noche de invierno'?", listOf("Wassily Kandinsky", "Oskar Kokoschka", "Egon Schiele", "Max Beckmann"), "Cultura", "Oskar Kokoschka, pintor expresionista austriaco, realizó 'Noche de invierno' en 1914, una obra que refleja su estilo atormentado y sus experiencias personales.")
        ),
        BilingualQuestion(
            id = 10409, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie grecque, qui est le compagnon d'Achille?", listOf("Patroclus", "Ajax", "Diomède", "Nestor"), "Culture", "Patrocle est le compagnon d'armes et ami proche d'Achille dans l'Iliade d'Homère. Sa mort au combat pousse Achille à retourner se battre contre les Troyens."),
            en = LocalizedContent("In Greek mythology, who is Achilles' companion?", listOf("Patroclus", "Ajax", "Diomedes", "Nestor"), "Culture", "Patroclus is the comrade-in-arms and close friend of Achilles in Homer's Iliad. His death in battle drives Achilles to return to fight the Trojans."),
            zh = LocalizedContent("在希腊神话中，谁是阿喀琉斯的同伴？", listOf("帕特罗克洛斯", "埃阿斯", "狄俄墨得斯", "涅斯托尔"), "文化", "帕特罗克洛斯是荷马《伊利亚特》中阿喀琉斯的战友和密友。他的战死促使阿喀琉斯重返战场对抗特洛伊人。"),
            es = LocalizedContent("En la mitología griega, ¿quién es el compañero de Aquiles?", listOf("Patroclo", "Áyax", "Diomedes", "Néstor"), "Cultura", "Patroclo es el compañero de armas y amigo íntimo de Aquiles en la Ilíada de Homero. Su muerte en combate impulsa a Aquiles a regresar a luchar contra los troyanos.")
        ),
    )

    private fun part7(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 10410, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de danse vient de la Hongrie?", listOf("Csárdás", "Hungarian Folk Dance", "Schottische", "Tous les trois"), "Culture", "La csárdás, la polka et la mazurka sont toutes des danses originaires de Hongrie ou fortement associées à sa culture folklorique."),
            en = LocalizedContent("Which style of dance comes from Hungary?", listOf("Csárdás", "Hungarian Folk Dance", "Schottische", "All three"), "Culture", "Csárdás, polka, and mazurka are all dances originating from Hungary or strongly associated with its folk culture."),
            zh = LocalizedContent("哪种舞蹈风格源自匈牙利？", listOf("恰尔达什舞", "匈牙利民间舞", "肖蒂什舞", "以上都是"), "文化", "恰尔达什舞、波尔卡舞和马祖卡舞都起源于匈牙利，或与其民间文化紧密相关。"),
            es = LocalizedContent("¿Qué estilo de baile proviene de Hungría?", listOf("Csárdás", "Danza folclórica húngara", "Schottische", "Los tres"), "Cultura", "El csárdás, la polca y la mazurca son danzas originarias de Hungría o fuertemente asociadas con su cultura folclórica.")
        ),
        BilingualQuestion(
            id = 10411, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Chad Chad' a-t-il commencé?", listOf("2020", "2021", "2022", "2023"), "Culture", "Chad Chad a lancé sa chaîne YouTube en 2022, se faisant rapidement connaître pour ses vidéos de commentaires et d'analyses culturelles."),
            en = LocalizedContent("In what year did 'Chad Chad' start?", listOf("2020", "2021", "2022", "2023"), "Culture", "Chad Chad launched her YouTube channel in 2022, quickly gaining recognition for her commentary and cultural analysis videos."),
            zh = LocalizedContent("“Chad Chad”始于哪一年？", listOf("2020", "2021", "2022", "2023"), "文化", "Chad Chad于2022年开设了她的YouTube频道，并迅速因其评论和文化分析视频而获得认可。"),
            es = LocalizedContent("¿En qué año comenzó 'Chad Chad'?", listOf("2020", "2021", "2022", "2023"), "Cultura", "Chad Chad lanzó su canal de YouTube en 2022, ganando rápidamente reconocimiento por sus videos de comentarios y análisis cultural.")
        ),
        BilingualQuestion(
            id = 10412, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Baiser d'Adieu'?", listOf("François Boucher", "Jean-Honoré Fragonard", "Jean-Marc Nattier", "Elisabeth-Louise Vigée Le Brun"), "Culture", "Fragonard a peint Le Baiser d'Adieu vers 1770-1775, une œuvre représentant un couple s'embrassant furtivement, typique de son style rococo et de ses scènes galantes."),
            en = LocalizedContent("Which painter created 'The Farewell Kiss'?", listOf("François Boucher", "Jean-Honoré Fragonard", "Jean-Marc Nattier", "Elisabeth-Louise Vigée Le Brun"), "Culture", "Fragonard painted 'The Farewell Kiss' around 1770-1775, a work depicting a couple kissing furtively, typical of his Rococo style and gallant scenes."),
            zh = LocalizedContent("哪位画家创作了《告别之吻》？", listOf("弗朗索瓦·布歇", "让-奥诺雷·弗拉戈纳尔", "让-马克·纳蒂埃", "伊丽莎白-路易丝·维热·勒布伦"), "文化", "弗拉戈纳尔在1770-1775年间绘制了《告别之吻》，这幅作品描绘了一对情侣偷偷接吻的场景，典型地体现了他洛可可风格和风流场景。"),
            es = LocalizedContent("¿Qué pintor creó 'El beso de despedida'?", listOf("François Boucher", "Jean-Honoré Fragonard", "Jean-Marc Nattier", "Elisabeth-Louise Vigée Le Brun"), "Cultura", "Fragonard pintó 'El beso de despedida' hacia 1770-1775, una obra que representa a una pareja besándose furtivamente, típica de su estilo rococó y sus escenas galantes.")
        ),
        BilingualQuestion(
            id = 10413, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie égyptienne, quel est le jugement de l'âme?", listOf("Pesage du cœur", "Jugement du Duat", "Tribunal d'Osiris", "Tous les trois"), "Culture", "Dans la mythologie égyptienne, le jugement de l'âme implique la pesée du cœur contre la plume de Maât, la déclaration de pureté par le défunt, et la sentence finale d'Anubis, Thot et Osiris."),
            en = LocalizedContent("In Egyptian mythology, what is the judgment of the soul?", listOf("Weighing of the heart", "Judgment of the Duat", "Tribunal of Osiris", "All three"), "Culture", "In Egyptian mythology, the judgment of the soul involves the weighing of the heart against the feather of Maat, the declaration of purity by the deceased, and the final sentence by Anubis, Thoth, and Osiris."),
            zh = LocalizedContent("在埃及神话中，灵魂的审判是什么？", listOf("称心仪式", "杜阿特审判", "奥西里斯法庭", "以上都是"), "文化", "在埃及神话中，灵魂的审判包括将心脏与玛亚特羽毛称重、死者宣告纯洁，以及阿努比斯、托特和奥西里斯的最终判决。"),
            es = LocalizedContent("En la mitología egipcia, ¿cuál es el juicio del alma?", listOf("Pesaje del corazón", "Juicio del Duat", "Tribunal de Osiris", "Los tres"), "Cultura", "En la mitología egipcia, el juicio del alma implica el pesaje del corazón contra la pluma de Maat, la declaración de pureza del difunto y la sentencia final de Anubis, Thot y Osiris.")
        ),
        BilingualQuestion(
            id = 10414, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de cuisine française est basé sur les sauces complexes?", listOf("Sauce Espagnole", "Sauce Hollandaise", "Cuisine classique", "Tous les trois"), "Culture", "La cuisine française classique, la haute cuisine et la nouvelle cuisine utilisent toutes des sauces complexes, mais à différentes époques et avec des approches variées."),
            en = LocalizedContent("Which style of French cuisine is based on complex sauces?", listOf("Sauce Espagnole", "Sauce Hollandaise", "Classic cuisine", "All three"), "Culture", "Classic French cuisine, haute cuisine, and nouvelle cuisine all use complex sauces, but at different times and with varied approaches."),
            zh = LocalizedContent("哪种法式烹饪风格以复杂酱汁为基础？", listOf("西班牙酱", "荷兰酱", "经典烹饪", "以上都是"), "文化", "经典法式烹饪、高级烹饪和新式烹饪都使用复杂酱汁，但处于不同时期且方法各异。"),
            es = LocalizedContent("¿Qué estilo de cocina francesa se basa en salsas complejas?", listOf("Salsa española", "Salsa holandesa", "Cocina clásica", "Los tres"), "Cultura", "La cocina francesa clásica, la alta cocina y la nouvelle cuisine utilizan salsas complejas, pero en diferentes épocas y con enfoques variados.")
        ),
        BilingualQuestion(
            id = 10415, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Curb Your Enthusiasm' a-t-il commencé?", listOf("1999", "2000", "2001", "2002"), "Culture", "La série comique de HBO créée par Larry David a débuté en 2000 avec un épisode pilote, mais la première saison officielle a été diffusée à partir de 2001."),
            en = LocalizedContent("In what year did 'Curb Your Enthusiasm' start?", listOf("1999", "2000", "2001", "2002"), "Culture", "The HBO comedy series created by Larry David began in 2000 with a pilot episode, but the official first season aired starting in 2001."),
            zh = LocalizedContent("《抑制热情》始于哪一年？", listOf("1999", "2000", "2001", "2002"), "文化", "由拉里·大卫创作的HBO喜剧系列于2000年以试播集开始，但正式第一季于2001年播出。"),
            es = LocalizedContent("¿En qué año comenzó 'Curb Your Enthusiasm'?", listOf("1999", "2000", "2001", "2002"), "Cultura", "La serie de comedia de HBO creada por Larry David comenzó en 2000 con un episodio piloto, pero la primera temporada oficial se emitió a partir de 2001.")
        ),
        BilingualQuestion(
            id = 10416, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Modèle Nue'?", listOf("Jean-Auguste-Dominique Ingres", "Eugène Delacroix", "Théodore Géricault", "Paul Delaroche"), "Culture", "Jean-Auguste-Dominique Ingres a peint 'Modèle Nue' au XIXe siècle, une œuvre représentative de son style néoclassique et de son intérêt pour les nus féminins."),
            en = LocalizedContent("Which painter painted 'Nude Model'?", listOf("Jean-Auguste-Dominique Ingres", "Eugène Delacroix", "Théodore Géricault", "Paul Delaroche"), "Culture", "Jean-Auguste-Dominique Ingres painted 'Nude Model' in the 19th century, a work representative of his neoclassical style and interest in female nudes."),
            zh = LocalizedContent("哪位画家绘制了《裸体模特》？", listOf("让-奥古斯特-多米尼克·安格尔", "欧仁·德拉克罗瓦", "泰奥多尔·热里科", "保罗·德拉罗什"), "文化", "让-奥古斯特-多米尼克·安格尔在19世纪绘制了《裸体模特》，这幅作品代表了他的新古典主义风格和对女性裸体的兴趣。"),
            es = LocalizedContent("¿Qué pintor pintó 'Modelo desnuda'?", listOf("Jean-Auguste-Dominique Ingres", "Eugène Delacroix", "Théodore Géricault", "Paul Delaroche"), "Cultura", "Jean-Auguste-Dominique Ingres pintó 'Modelo desnuda' en el siglo XIX, una obra representativa de su estilo neoclásico y su interés por los desnudos femeninos.")
        ),
        BilingualQuestion(
            id = 10417, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie grecque, quel est le nom du dieu de la lumière?", listOf("Phoebus", "Apollon", "Helios", "Tous les trois"), "Culture", "Apollon est le dieu grec de la lumière, mais aussi du soleil et des arts. Les réponses \"tous les trois\" incluent souvent Hélios (personnification du soleil) et Phœbus (autre nom d'Apollon)."),
            en = LocalizedContent("In Greek mythology, what is the name of the god of light?", listOf("Phoebus", "Apollo", "Helios", "All three"), "Culture", "Apollo is the Greek god of light, but also of the sun and the arts. The answer 'all three' often includes Helios (personification of the sun) and Phoebus (another name for Apollo)."),
            zh = LocalizedContent("在希腊神话中，光明之神的名字是什么？", listOf("福玻斯", "阿波罗", "赫利俄斯", "以上都是"), "文化", "阿波罗是希腊的光明之神，也是太阳和艺术之神。答案“以上都是”通常包括赫利俄斯（太阳的化身）和福玻斯（阿波罗的别名）。"),
            es = LocalizedContent("En la mitología griega, ¿cuál es el nombre del dios de la luz?", listOf("Febo", "Apolo", "Helios", "Los tres"), "Cultura", "Apolo es el dios griego de la luz, pero también del sol y las artes. La respuesta 'los tres' a menudo incluye a Helios (personificación del sol) y Febo (otro nombre de Apolo).")
        ),
        BilingualQuestion(
            id = 10418, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel style de musique a émergé de la Jamaïque?", listOf("Reggae", "Ska", "Dancehall", "Tous les trois"), "Culture", "Le reggae, le ska et le dancehall sont tous nés en Jamaïque, chacun marquant une étape clé de l'évolution musicale de l'île depuis les années 1950."),
            en = LocalizedContent("Which style of music emerged from Jamaica?", listOf("Reggae", "Ska", "Dancehall", "All three"), "Culture", "Reggae, ska, and dancehall all originated in Jamaica, each marking a key stage in the island's musical evolution since the 1950s."),
            zh = LocalizedContent("哪种音乐风格源自牙买加？", listOf("雷鬼", "斯卡", "舞厅", "以上都是"), "文化", "雷鬼、斯卡和舞厅都起源于牙买加，每种风格都标志着该岛自20世纪50年代以来音乐演变的关键阶段。"),
            es = LocalizedContent("¿Qué estilo de música surgió de Jamaica?", listOf("Reggae", "Ska", "Dancehall", "Los tres"), "Cultura", "El reggae, el ska y el dancehall se originaron en Jamaica, cada uno marcando una etapa clave en la evolución musical de la isla desde la década de 1950.")
        ),
        BilingualQuestion(
            id = 10419, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'Veep' s'est-il terminé?", listOf("2017", "2018", "2019", "2020"), "Culture", "La série comique politique 'Veep', avec Julia Louis-Dreyfus, a diffusé son dernier épisode en 2020 après sept saisons sur HBO."),
            en = LocalizedContent("In what year did 'Veep' end?", listOf("2017", "2018", "2019", "2020"), "Culture", "The political comedy series 'Veep', starring Julia Louis-Dreyfus, aired its final episode in 2020 after seven seasons on HBO."),
            zh = LocalizedContent("《副总统》在哪一年完结？", listOf("2017", "2018", "2019", "2020"), "文化", "由茱莉亚·路易斯-德瑞弗斯主演的政治喜剧系列《副总统》在HBO播出七季后，于2020年播出了最后一集。"),
            es = LocalizedContent("¿En qué año terminó 'Veep'?", listOf("2017", "2018", "2019", "2020"), "Cultura", "La serie de comedia política 'Veep', protagonizada por Julia Louis-Dreyfus, emitió su último episodio en 2020 después de siete temporadas en HBO.")
        ),
        BilingualQuestion(
            id = 10420, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Homme Contemplant la Lune'?", listOf("Caspar David Friedrich", "Joseph Anton Koch", "Ferdinand Oliver", "John Constable"), "Culture", "Caspar David Friedrich, peintre romantique allemand du XIXe siècle, est célèbre pour ses paysages mélancoliques et ses figures contemplant la nature, comme dans \"Homme Contemplant la Lune\"."),
            en = LocalizedContent("Which painter created 'Man Contemplating the Moon'?", listOf("Caspar David Friedrich", "Joseph Anton Koch", "Ferdinand Oliver", "John Constable"), "Culture", "Caspar David Friedrich, a 19th-century German Romantic painter, is famous for his melancholic landscapes and figures contemplating nature, as in 'Man Contemplating the Moon'."),
            zh = LocalizedContent("哪位画家创作了《望月的人》？", listOf("卡斯帕·大卫·弗里德里希", "约瑟夫·安东·科赫", "费迪南德·奥利弗", "约翰·康斯特布尔"), "文化", "卡斯帕·大卫·弗里德里希是19世纪德国浪漫主义画家，以忧郁的风景和沉思自然的人物而闻名，如《望月的人》。"),
            es = LocalizedContent("¿Qué pintor creó 'Hombre Contemplando la Luna'?", listOf("Caspar David Friedrich", "Joseph Anton Koch", "Ferdinand Oliver", "John Constable"), "Cultura", "Caspar David Friedrich, pintor romántico alemán del siglo XIX, es famoso por sus paisajes melancólicos y figuras contemplando la naturaleza, como en 'Hombre Contemplando la Luna'.")
        ),
        BilingualQuestion(
            id = 10421, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie romaine, quel est le symbole de Juno?", listOf("Paon", "Aigle", "Serpent", "Dove"), "Culture", "Junon, équivalente romaine de la grecque Héra, est souvent représentée avec un paon, dont les yeux sur les plumes symbolisent la vigilance et la royauté."),
            en = LocalizedContent("In Roman mythology, what is Juno's symbol?", listOf("Peacock", "Eagle", "Serpent", "Dove"), "Culture", "Juno, the Roman equivalent of the Greek Hera, is often depicted with a peacock, whose eyes on the feathers symbolize vigilance and royalty."),
            zh = LocalizedContent("在罗马神话中，朱诺的象征是什么？", listOf("孔雀", "鹰", "蛇", "鸽子"), "文化", "朱诺是罗马神话中与希腊赫拉对应的女神，常与孔雀一同出现，孔雀羽毛上的眼睛象征警觉和皇权。"),
            es = LocalizedContent("En la mitología romana, ¿cuál es el símbolo de Juno?", listOf("Pavo real", "Águila", "Serpiente", "Paloma"), "Cultura", "Juno, la equivalente romana de la griega Hera, a menudo se representa con un pavo real, cuyos ojos en las plumas simbolizan vigilancia y realeza.")
        ),
        BilingualQuestion(
            id = 10422, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel style de cuisine est caractérisé par le pho?", listOf("Cuisine vietnamienne", "Cuisine thaïlandaise", "Cuisine cambodgienne", "Cuisine laotienne"), "Culture", "Le pho est une soupe de nouilles emblématique du Vietnam, traditionnellement préparée avec un bouillon parfumé, des herbes et du bœuf ou du poulet."),
            en = LocalizedContent("Which cuisine style is characterized by pho?", listOf("Vietnamese cuisine", "Thai cuisine", "Cambodian cuisine", "Laotian cuisine"), "Culture", "Pho is an iconic noodle soup from Vietnam, traditionally prepared with a fragrant broth, herbs, and beef or chicken."),
            zh = LocalizedContent("哪种菜系以河粉为特色？", listOf("越南菜", "泰国菜", "柬埔寨菜", "老挝菜"), "文化", "河粉是越南标志性的汤面，传统上用香浓的汤底、香草和牛肉或鸡肉制作。"),
            es = LocalizedContent("¿Qué estilo de cocina se caracteriza por el pho?", listOf("Cocina vietnamita", "Cocina tailandesa", "Cocina camboyana", "Cocina laosiana"), "Cultura", "El pho es una sopa de fideos emblemática de Vietnam, preparada tradicionalmente con un caldo aromático, hierbas y carne de res o pollo.")
        ),
        BilingualQuestion(
            id = 10423, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année 'You' a-t-il commencé?", listOf("2018", "2019", "2020", "2021"), "Culture", "La série 'You' a débuté en 2019 sur Lifetime, avant d'être reprise par Netflix."),
            en = LocalizedContent("In which year did 'You' start?", listOf("2018", "2019", "2020", "2021"), "Culture", "The series 'You' premiered in 2019 on Lifetime, before being picked up by Netflix."),
            zh = LocalizedContent("《你》在哪一年开播？", listOf("2018", "2019", "2020", "2021"), "文化", "剧集《你》于2019年在Lifetime首播，随后被Netflix接手。"),
            es = LocalizedContent("¿En qué año comenzó 'You'?", listOf("2018", "2019", "2020", "2021"), "Cultura", "La serie 'You' se estrenó en 2019 en Lifetime, antes de ser retomada por Netflix.")
        ),
        BilingualQuestion(
            id = 10424, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a peint 'Clair de Lune'?", listOf("Caspar David Friedrich", "Joseph Anton Koch", "Ferdinand Oliver", "John Constable"), "Culture", "Caspar David Friedrich, peintre romantique allemand du XIXe siècle, a réalisé 'Clair de Lune' (ou 'Mondaufgang am Meer'), une œuvre emblématique de son style contemplatif de la nature."),
            en = LocalizedContent("Which painter painted 'Moonlight'?", listOf("Caspar David Friedrich", "Joseph Anton Koch", "Ferdinand Oliver", "John Constable"), "Culture", "Caspar David Friedrich, a 19th-century German Romantic painter, created 'Moonlight' (or 'Moonrise over the Sea'), an iconic work of his contemplative style of nature."),
            zh = LocalizedContent("哪位画家创作了《月光》？", listOf("卡斯帕·大卫·弗里德里希", "约瑟夫·安东·科赫", "费迪南德·奥利弗", "约翰·康斯特布尔"), "文化", "卡斯帕·大卫·弗里德里希是19世纪德国浪漫主义画家，创作了《月光》（或《海上月出》），这是他沉思自然风格的代表作。"),
            es = LocalizedContent("¿Qué pintor pintó 'Claro de Luna'?", listOf("Caspar David Friedrich", "Joseph Anton Koch", "Ferdinand Oliver", "John Constable"), "Cultura", "Caspar David Friedrich, pintor romántico alemán del siglo XIX, creó 'Claro de Luna' (o 'Salida de la luna sobre el mar'), una obra emblemática de su estilo contemplativo de la naturaleza.")
        ),
        BilingualQuestion(
            id = 10425, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie grecque, qui est le père de Thésée?", listOf("Poséidon", "Zeus", "Égée", "Amphitryon"), "Culture", "Selon certaines versions du mythe, Thésée est le fils du dieu de la mer Poséidon, qui aurait séduit sa mère Éthra la même nuit que son époux mortel Égée."),
            en = LocalizedContent("In Greek mythology, who is Theseus' father?", listOf("Poseidon", "Zeus", "Aegeus", "Amphitryon"), "Culture", "According to some versions of the myth, Theseus is the son of the sea god Poseidon, who seduced his mother Aethra on the same night as her mortal husband Aegeus."),
            zh = LocalizedContent("在希腊神话中，忒修斯的父亲是谁？", listOf("波塞冬", "宙斯", "埃勾斯", "安菲特律翁"), "文化", "根据某些神话版本，忒修斯是海神波塞冬的儿子，波塞冬在忒修斯母亲埃特拉与凡人丈夫埃勾斯同床的当晚引诱了她。"),
            es = LocalizedContent("En la mitología griega, ¿quién es el padre de Teseo?", listOf("Poseidón", "Zeus", "Egeo", "Anfitrión"), "Cultura", "Según algunas versiones del mito, Teseo es hijo del dios del mar Poseidón, quien sedujo a su madre Etra la misma noche que su esposo mortal Egeo.")
        ),
        BilingualQuestion(
            id = 10426, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit 'Madama Butterfly'?", listOf("Giuseppe Verdi", "Gioachino Rossini", "Giacomo Puccini", "Georges Bizet"), "Culture", "Giacomo Puccini a composé 'Madama Butterfly' en 1904, un opéra en trois actes sur une geisha japonaise abandonnée par un officier américain."),
            en = LocalizedContent("Which composer wrote 'Madama Butterfly'?", listOf("Giuseppe Verdi", "Gioachino Rossini", "Giacomo Puccini", "Georges Bizet"), "Culture", "Giacomo Puccini composed 'Madama Butterfly' in 1904, a three-act opera about a Japanese geisha abandoned by an American officer."),
            zh = LocalizedContent("哪位作曲家创作了《蝴蝶夫人》？", listOf("朱塞佩·威尔第", "焦阿基诺·罗西尼", "贾科莫·普契尼", "乔治·比才"), "文化", "贾科莫·普契尼于1904年创作了《蝴蝶夫人》，这是一部三幕歌剧，讲述了一位被美国军官抛弃的日本艺伎的故事。"),
            es = LocalizedContent("¿Qué compositor escribió 'Madama Butterfly'?", listOf("Giuseppe Verdi", "Gioachino Rossini", "Giacomo Puccini", "Georges Bizet"), "Cultura", "Giacomo Puccini compuso 'Madama Butterfly' en 1904, una ópera en tres actos sobre una geisha japonesa abandonada por un oficial estadounidense.")
        ),
        BilingualQuestion(
            id = 10427, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année 'You' s'est-il terminé?", listOf("2022", "2023", "2024", "2025"), "Culture", "La série \"You\" s'est conclue avec sa cinquième et dernière saison, diffusée en 2024."),
            en = LocalizedContent("In which year did 'You' end?", listOf("2022", "2023", "2024", "2025"), "Culture", "The series 'You' concluded with its fifth and final season, released in 2024."),
            zh = LocalizedContent("《你》在哪一年完结？", listOf("2022", "2023", "2024", "2025"), "文化", "剧集《你》在2024年播出的第五季也是最后一季完结。"),
            es = LocalizedContent("¿En qué año terminó 'You'?", listOf("2022", "2023", "2024", "2025"), "Cultura", "La serie 'You' concluyó con su quinta y última temporada, estrenada en 2024.")
        ),
        BilingualQuestion(
            id = 10428, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre a créé 'Femme à la Fenêtre'?", listOf("Jean-Honoré Fragonard", "Jean-Marc Nattier", "François Boucher", "Jean-Baptiste-Siméon Chardin"), "Culture", "Jean-Honoré Fragonard, peintre rococo du XVIIIe siècle, a réalisé 'Femme à la Fenêtre' vers 1770, une œuvre représentant une jeune femme accoudée à une fenêtre, typique de son style léger et sensuel."),
            en = LocalizedContent("Which painter created 'Woman at the Window'?", listOf("Jean-Honoré Fragonard", "Jean-Marc Nattier", "François Boucher", "Jean-Baptiste-Siméon Chardin"), "Culture", "Jean-Honoré Fragonard, an 18th-century Rococo painter, created 'Woman at the Window' around 1770, a work depicting a young woman leaning on a windowsill, typical of his light and sensual style."),
            zh = LocalizedContent("哪位画家创作了《窗边的女人》？", listOf("让-奥诺雷·弗拉戈纳尔", "让-马克·纳蒂埃", "弗朗索瓦·布歇", "让-巴蒂斯特-西梅翁·夏尔丹"), "文化", "让-奥诺雷·弗拉戈纳尔是18世纪洛可可画家，约1770年创作了《窗边的女人》，描绘了一位年轻女子倚在窗台上，体现了他轻盈而感性的风格。"),
            es = LocalizedContent("¿Qué pintor creó 'Mujer en la Ventana'?", listOf("Jean-Honoré Fragonard", "Jean-Marc Nattier", "François Boucher", "Jean-Baptiste-Siméon Chardin"), "Cultura", "Jean-Honoré Fragonard, pintor rococó del siglo XVIII, creó 'Mujer en la Ventana' hacia 1770, una obra que representa a una joven apoyada en el alféizar de una ventana, típica de su estilo ligero y sensual.")
        ),
        BilingualQuestion(
            id = 10429, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En mythologie égyptienne, quel dieu est le gardien de la nécropolie?", listOf("Anubis", "Osiris", "Ptah", "Khépri"), "Culture", "Anubis est le dieu égyptien à tête de chacal associé à la momification et à la protection des tombes, ce qui fait de lui le gardien des nécropoles."),
            en = LocalizedContent("In Egyptian mythology, which god is the guardian of the necropolis?", listOf("Anubis", "Osiris", "Ptah", "Khepri"), "Culture", "Anubis is the Egyptian jackal-headed god associated with mummification and tomb protection, making him the guardian of necropolises."),
            zh = LocalizedContent("在埃及神话中，哪位神是墓地的守护者？", listOf("阿努比斯", "奥西里斯", "卜塔", "凯布利"), "文化", "阿努比斯是埃及的胡狼头神，与木乃伊制作和坟墓保护相关，因此是墓地的守护者。"),
            es = LocalizedContent("En la mitología egipcia, ¿qué dios es el guardián de la necrópolis?", listOf("Anubis", "Osiris", "Ptah", "Jepri"), "Cultura", "Anubis es el dios egipcio con cabeza de chacal asociado con la momificación y la protección de las tumbas, lo que lo convierte en el guardián de las necrópolis.")
        ),
    )
}
