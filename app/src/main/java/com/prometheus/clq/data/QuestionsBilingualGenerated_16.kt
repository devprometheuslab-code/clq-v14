package com.prometheus.clq.data

import com.prometheus.clq.model.BilingualQuestion
import com.prometheus.clq.model.Difficulty
import com.prometheus.clq.model.Language
import com.prometheus.clq.model.LocalizedContent
import com.prometheus.clq.model.Question

/** Auto-generated batch 16 : 500 questions bilingues */
object QuestionsBilingualGenerated_16 {
    fun get(lang: Language = Language.FR): List<Question> = list.map { it.toQuestion(lang) }

    val list: List<BilingualQuestion> by lazy {
        part1() + part2() + part3() + part4() + part5() + part6() + part7()
    }

    private fun part1(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 50040, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel scientifique a découvert la radioactivité?", listOf("Marie Curie", "Pierre Curie", "Ernest Rutherford", "Niels Bohr"), "Science", "Marie Curie a découvert la radioactivité en 1898 avec son mari Pierre, en isolant le polonium et le radium. Ses travaux ont révolutionné la physique et la chimie."),
            en = LocalizedContent("Which scientist discovered radioactivity?", listOf("Marie Curie", "Pierre Curie", "Ernest Rutherford", "Niels Bohr"), "Science", "Marie Curie discovered radioactivity in 1898 with her husband Pierre, isolating polonium and radium. Her work revolutionized physics and chemistry."),
            zh = LocalizedContent("哪位科学家发现了放射性？", listOf("玛丽·居里", "皮埃尔·居里", "欧内斯特·卢瑟福", "尼尔斯·玻尔"), "科学", "玛丽·居里于1898年与丈夫皮埃尔一起发现了放射性，分离出钋和镭。她的工作彻底改变了物理学和化学。"),
            es = LocalizedContent("¿Qué científico descubrió la radiactividad?", listOf("Marie Curie", "Pierre Curie", "Ernest Rutherford", "Niels Bohr"), "Ciencia", "Marie Curie descubrió la radiactividad en 1898 junto con su esposo Pierre, aislando el polonio y el radio. Su trabajo revolucionó la física y la química.")
        ),
        BilingualQuestion(
            id = 50041, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays a 50 États?", listOf("Brésil", "Australie", "Mexique", "États-Unis"), "Géographie", "Les États-Unis sont composés de 50 États fédérés, chacun disposant de son propre gouvernement, en plus du gouvernement fédéral."),
            en = LocalizedContent("Which country has 50 states?", listOf("Brazil", "Australia", "Mexico", "United States"), "Geography", "The United States is composed of 50 federated states, each with its own government, in addition to the federal government."),
            zh = LocalizedContent("哪个国家有50个州？", listOf("巴西", "澳大利亚", "墨西哥", "美国"), "地理", "美国由50个联邦州组成，每个州都有自己的政府，此外还有联邦政府。"),
            es = LocalizedContent("¿Qué país tiene 50 estados?", listOf("Brasil", "Australia", "México", "Estados Unidos"), "Geografía", "Estados Unidos está compuesto por 50 estados federados, cada uno con su propio gobierno, además del gobierno federal.")
        ),
        BilingualQuestion(
            id = 50042, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel instrument a créé la musique jazz?", listOf("Piano", "Saxophone", "Trompette", "Tous les ci-dessus"), "Culture", "Le jazz est né de la fusion de multiples influences musicales, notamment le blues, le ragtime et les chants de travail africains, aucun instrument unique n'étant à son origine."),
            en = LocalizedContent("Which instrument created jazz music?", listOf("Piano", "Saxophone", "Trumpet", "All of the above"), "Culture", "Jazz was born from the fusion of multiple musical influences, including blues, ragtime, and African work songs, with no single instrument at its origin."),
            zh = LocalizedContent("哪种乐器创造了爵士乐？", listOf("钢琴", "萨克斯管", "小号", "以上所有"), "文化", "爵士乐诞生于多种音乐影响的融合，包括蓝调、拉格泰姆和非洲劳动歌曲，没有单一乐器是其起源。"),
            es = LocalizedContent("¿Qué instrumento creó la música jazz?", listOf("Piano", "Saxofón", "Trompeta", "Todos los anteriores"), "Cultura", "El jazz nació de la fusión de múltiples influencias musicales, incluyendo el blues, el ragtime y los cantos de trabajo africanos, sin que ningún instrumento único esté en su origen.")
        ),
        BilingualQuestion(
            id = 50043, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel rugbyman français a remporté la Coupe du Monde?", listOf("Serge Blanco", "Jean-Pierre Rives", "France n'a jamais remporté", "David Gallagher"), "Sport", "La France n'a jamais remporté la Coupe du Monde de rugby, malgré trois finales perdues (1987, 1999, 2011). Aucun rugbyman français n'est donc champion du monde."),
            en = LocalizedContent("Which French rugby player won the World Cup?", listOf("Serge Blanco", "Jean-Pierre Rives", "France has never won", "David Gallagher"), "Sports", "France has never won the Rugby World Cup, despite three lost finals (1987, 1999, 2011). Therefore, no French rugby player is a world champion."),
            zh = LocalizedContent("哪位法国橄榄球运动员赢得了世界杯？", listOf("塞尔日·布兰科", "让-皮埃尔·里夫", "法国从未赢过", "大卫·加拉格尔"), "体育", "法国从未赢得过橄榄球世界杯，尽管三次进入决赛（1987、1999、2011）均告失利。因此，没有法国橄榄球运动员是世界冠军。"),
            es = LocalizedContent("¿Qué jugador de rugby francés ganó la Copa del Mundo?", listOf("Serge Blanco", "Jean-Pierre Rives", "Francia nunca ha ganado", "David Gallagher"), "Deportes", "Francia nunca ha ganado la Copa del Mundo de rugby, a pesar de tres finales perdidas (1987, 1999, 2011). Por lo tanto, ningún rugbista francés es campeón del mundo.")
        ),
        BilingualQuestion(
            id = 50044, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année le film 'Jaws' est-il sorti?", listOf("1974", "1975", "1976", "1977"), "Cinéma", "Le film \"Jaws\" (Les Dents de la mer) est sorti en 1975, réalisé par Steven Spielberg. Ce thriller aquatique est considéré comme le premier blockbuster de l'histoire du cinéma."),
            en = LocalizedContent("In which year was the movie 'Jaws' released?", listOf("1974", "1975", "1976", "1977"), "Cinema", "The movie 'Jaws' was released in 1975, directed by Steven Spielberg. This aquatic thriller is considered the first blockbuster in cinema history."),
            zh = LocalizedContent("电影《大白鲨》是哪一年上映的？", listOf("1974", "1975", "1976", "1977"), "电影", "电影《大白鲨》于1975年上映，由史蒂文·斯皮尔伯格执导。这部水上惊悚片被认为是电影史上第一部大片。"),
            es = LocalizedContent("¿En qué año se estrenó la película 'Tiburón'?", listOf("1974", "1975", "1976", "1977"), "Cine", "La película 'Tiburón' se estrenó en 1975, dirigida por Steven Spielberg. Este thriller acuático es considerado el primer blockbuster de la historia del cine.")
        ),
        BilingualQuestion(
            id = 50045, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel compositeur a écrit 'La Neuvième Symphonie'?", listOf("Mozart", "Chopin", "Beethoven", "Bach"), "Musique", "Beethoven a composé sa Neuvième Symphonie entre 1822 et 1824, une œuvre révolutionnaire qui inclut pour la première fois des chœurs et des solistes vocaux dans une symphonie."),
            en = LocalizedContent("Which composer wrote the 'Ninth Symphony'?", listOf("Mozart", "Chopin", "Beethoven", "Bach"), "Music", "Beethoven composed his Ninth Symphony between 1822 and 1824, a revolutionary work that for the first time included choirs and vocal soloists in a symphony."),
            zh = LocalizedContent("哪位作曲家创作了《第九交响曲》？", listOf("莫扎特", "肖邦", "贝多芬", "巴赫"), "音乐", "贝多芬在1822年至1824年间创作了他的第九交响曲，这是一部革命性的作品，首次在交响曲中加入了合唱和声乐独唱。"),
            es = LocalizedContent("¿Qué compositor escribió la 'Novena Sinfonía'?", listOf("Mozart", "Chopin", "Beethoven", "Bach"), "Música", "Beethoven compuso su Novena Sinfonía entre 1822 y 1824, una obra revolucionaria que por primera vez incluía coros y solistas vocales en una sinfonía.")
        ),
        BilingualQuestion(
            id = 50046, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année Christophe Colomb a-t-il découvert l'Amérique?", listOf("1491", "1492", "1493", "1494"), "Histoire", "Christophe Colomb, naviguant pour le compte de l'Espagne, atteint les Amériques le 12 octobre 1492, croyant avoir ouvert une route maritime vers les Indes."),
            en = LocalizedContent("In which year did Christopher Columbus discover America?", listOf("1491", "1492", "1493", "1494"), "History", "Christopher Columbus, sailing for Spain, reached the Americas on October 12, 1492, believing he had opened a sea route to the Indies."),
            zh = LocalizedContent("克里斯托弗·哥伦布在哪一年发现了美洲？", listOf("1491", "1492", "1493", "1494"), "历史", "克里斯托弗·哥伦布为西班牙航行，于1492年10月12日到达美洲，认为他开辟了一条通往印度的海上航线。"),
            es = LocalizedContent("¿En qué año descubrió Cristóbal Colón América?", listOf("1491", "1492", "1493", "1494"), "Historia", "Cristóbal Colón, navegando para España, llegó a las Américas el 12 de octubre de 1492, creyendo haber abierto una ruta marítima hacia las Indias.")
        ),
        BilingualQuestion(
            id = 50047, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand plan d'eau du monde?", listOf("Lac Baïkal", "Océan Pacifique", "Lac Supérieur", "Caspienne"), "Science", "L'océan Pacifique couvre environ 165 millions de kilomètres carrés, soit plus du tiers de la surface terrestre, ce qui en fait le plus vaste plan d'eau de la planète."),
            en = LocalizedContent("What is the largest body of water in the world?", listOf("Lake Baikal", "Pacific Ocean", "Lake Superior", "Caspian Sea"), "Science", "The Pacific Ocean covers about 165 million square kilometers, more than a third of the Earth's surface, making it the largest body of water on the planet."),
            zh = LocalizedContent("世界上最大的水体是什么？", listOf("贝加尔湖", "太平洋", "苏必利尔湖", "里海"), "科学", "太平洋覆盖约1.65亿平方公里，超过地球表面的三分之一，使其成为地球上最大的水体。"),
            es = LocalizedContent("¿Cuál es la masa de agua más grande del mundo?", listOf("Lago Baikal", "Océano Pacífico", "Lago Superior", "Mar Caspio"), "Ciencia", "El océano Pacífico cubre aproximadamente 165 millones de kilómetros cuadrados, más de un tercio de la superficie terrestre, lo que lo convierte en la mayor masa de agua del planeta.")
        ),
        BilingualQuestion(
            id = 50048, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel continent est le plus densément peuplé?", listOf("Asie", "Afrique", "Europe", "Amérique du Nord"), "Géographie", "L'Asie abrite plus de 60% de la population mondiale, avec des pays très peuplés comme la Chine et l'Inde, ce qui en fait le continent le plus densément peuplé."),
            en = LocalizedContent("Which continent is the most densely populated?", listOf("Asia", "Africa", "Europe", "North America"), "Geography", "Asia is home to more than 60% of the world's population, with highly populated countries like China and India, making it the most densely populated continent."),
            zh = LocalizedContent("哪个大洲人口密度最高？", listOf("亚洲", "非洲", "欧洲", "北美洲"), "地理", "亚洲拥有世界人口的60%以上，有中国和印度等人口大国，使其成为人口密度最高的大洲。"),
            es = LocalizedContent("¿Qué continente está más densamente poblado?", listOf("Asia", "África", "Europa", "América del Norte"), "Geografía", "Asia alberga más del 60% de la población mundial, con países muy poblados como China e India, lo que la convierte en el continente más densamente poblado.")
        ),
        BilingualQuestion(
            id = 50049, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus vieux musée du monde?", listOf("Louvre", "Metropolitan", "Égyptien du Caire", "Hermitage"), "Culture", "Fondé en 1835, le Musée égyptien du Caire est considéré comme le plus vieux musée du monde dédié à une civilisation antique, bien que d'autres musées plus anciens existent, comme le Capitole à Rome."),
            en = LocalizedContent("What is the oldest museum in the world?", listOf("Louvre", "Metropolitan", "Egyptian Museum in Cairo", "Hermitage"), "Culture", "Founded in 1835, the Egyptian Museum in Cairo is considered the oldest museum in the world dedicated to an ancient civilization, although older museums exist, such as the Capitoline in Rome."),
            zh = LocalizedContent("世界上最古老的博物馆是哪个？", listOf("卢浮宫", "大都会博物馆", "开罗埃及博物馆", "冬宫"), "文化", "开罗埃及博物馆成立于1835年，被认为是世界上最古老的专门展示古代文明的博物馆，尽管还有更古老的博物馆，如罗马的卡比托利欧博物馆。"),
            es = LocalizedContent("¿Cuál es el museo más antiguo del mundo?", listOf("Louvre", "Metropolitano", "Museo Egipcio de El Cairo", "Hermitage"), "Cultura", "Fundado en 1835, el Museo Egipcio de El Cairo es considerado el museo más antiguo del mundo dedicado a una civilización antigua, aunque existen museos más antiguos, como el Capitolino en Roma.")
        ),
        BilingualQuestion(
            id = 50050, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel athlète olympique a remporté 23 médailles d'or?", listOf("Carl Lewis", "Mark Spitz", "Michael Phelps", "Jesse Owens"), "Sport", "Michael Phelps, nageur américain, détient le record du plus grand nombre de médailles d'or olympiques, avec 23 titres obtenus entre 2004 et 2016."),
            en = LocalizedContent("Which Olympic athlete has won 23 gold medals?", listOf("Carl Lewis", "Mark Spitz", "Michael Phelps", "Jesse Owens"), "Sports", "Michael Phelps, an American swimmer, holds the record for the most Olympic gold medals, with 23 titles won between 2004 and 2016."),
            zh = LocalizedContent("哪位奥运运动员获得了23枚金牌？", listOf("卡尔·刘易斯", "马克·斯皮茨", "迈克尔·菲尔普斯", "杰西·欧文斯"), "体育", "美国游泳运动员迈克尔·菲尔普斯保持着奥运金牌最多的纪录，在2004年至2016年间共获得23枚金牌。"),
            es = LocalizedContent("¿Qué atleta olímpico ha ganado 23 medallas de oro?", listOf("Carl Lewis", "Mark Spitz", "Michael Phelps", "Jesse Owens"), "Deportes", "Michael Phelps, nadador estadounidense, posee el récord de más medallas de oro olímpicas, con 23 títulos obtenidos entre 2004 y 2016.")
        ),
        BilingualQuestion(
            id = 50051, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel acteur a joué Sherlock Holmes dans la franchise BBC?", listOf("David Tennant", "Benedict Cumberbatch", "Tom Hiddleston", "Andrew Scott"), "Cinéma", "Benedict Cumberbatch a incarné Sherlock Holmes dans la série télévisée Sherlock de la BBC, diffusée de 2010 à 2017."),
            en = LocalizedContent("Which actor played Sherlock Holmes in the BBC franchise?", listOf("David Tennant", "Benedict Cumberbatch", "Tom Hiddleston", "Andrew Scott"), "Cinema", "Benedict Cumberbatch portrayed Sherlock Holmes in the BBC television series Sherlock, aired from 2010 to 2017."),
            zh = LocalizedContent("哪位演员在BBC系列剧中饰演了夏洛克·福尔摩斯？", listOf("大卫·田纳特", "本尼迪克特·康伯巴奇", "汤姆·希德勒斯顿", "安德鲁·斯科特"), "电影", "本尼迪克特·康伯巴奇在BBC电视剧《神探夏洛克》中饰演夏洛克·福尔摩斯，该剧于2010年至2017年播出。"),
            es = LocalizedContent("¿Qué actor interpretó a Sherlock Holmes en la franquicia de la BBC?", listOf("David Tennant", "Benedict Cumberbatch", "Tom Hiddleston", "Andrew Scott"), "Cine", "Benedict Cumberbatch interpretó a Sherlock Holmes en la serie de televisión Sherlock de la BBC, emitida de 2010 a 2017.")
        ),
        BilingualQuestion(
            id = 50052, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel chanteur français a écrit 'La Vie en Rose'?", listOf("Charles Aznavour", "Edith Piaf", "Jacques Brel", "Serge Gainsbourg"), "Musique", "Edith Piaf a coécrit et popularisé 'La Vie en Rose' en 1945, bien que la chanson ait été officiellement créditée à elle et à la compositrice Louiguy."),
            en = LocalizedContent("Which French singer wrote 'La Vie en Rose'?", listOf("Charles Aznavour", "Edith Piaf", "Jacques Brel", "Serge Gainsbourg"), "Music", "Edith Piaf co-wrote and popularized 'La Vie en Rose' in 1945, although the song was officially credited to her and composer Louiguy."),
            zh = LocalizedContent("哪位法国歌手创作了《玫瑰人生》？", listOf("查尔斯·阿兹纳武尔", "伊迪丝·琵雅芙", "雅克·布雷尔", "塞尔日·甘斯布"), "音乐", "伊迪丝·琵雅芙于1945年共同创作并推广了《玫瑰人生》，尽管这首歌正式归功于她和作曲家路易吉。"),
            es = LocalizedContent("¿Qué cantante francés escribió 'La Vie en Rose'?", listOf("Charles Aznavour", "Edith Piaf", "Jacques Brel", "Serge Gainsbourg"), "Música", "Edith Piaf coescribió y popularizó 'La Vie en Rose' en 1945, aunque la canción fue acreditada oficialmente a ella y al compositor Louiguy.")
        ),
        BilingualQuestion(
            id = 50053, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pharaon égyptien a construit le Grand Sphinx?", listOf("Khéops", "Khéphren", "Menkaure", "Thoutmosis"), "Histoire", "Le Grand Sphinx de Gizeh se trouve dans le complexe funéraire du pharaon Khéphren, et son visage est généralement identifié comme étant celui de ce souverain de la IVe dynastie."),
            en = LocalizedContent("Which Egyptian pharaoh built the Great Sphinx?", listOf("Khufu", "Khafre", "Menkaure", "Thutmose"), "History", "The Great Sphinx of Giza is located in the funerary complex of Pharaoh Khafre, and its face is generally identified as that of this Fourth Dynasty ruler."),
            zh = LocalizedContent("哪位埃及法老建造了狮身人面像？", listOf("胡夫", "哈夫拉", "门卡乌拉", "图特摩斯"), "历史", "吉萨大狮身人面像位于法老哈夫拉的墓葬建筑群中，其面容通常被认为是这位第四王朝统治者的形象。"),
            es = LocalizedContent("¿Qué faraón egipcio construyó la Gran Esfinge?", listOf("Keops", "Kefrén", "Micerino", "Tutmosis"), "Historia", "La Gran Esfinge de Guiza se encuentra en el complejo funerario del faraón Kefrén, y su rostro se identifica generalmente como el de este gobernante de la IV dinastía.")
        ),
        BilingualQuestion(
            id = 50054, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand os du corps humain?", listOf("Fémur", "Tibia", "Humérus", "Colonne vertébrale"), "Science", "Le fémur, l'os de la cuisse, est le plus long et le plus lourd du squelette humain, supportant le poids du corps lors de la marche et de la course."),
            en = LocalizedContent("What is the largest bone in the human body?", listOf("Femur", "Tibia", "Humerus", "Spine"), "Science", "The femur, the thigh bone, is the longest and heaviest bone in the human skeleton, supporting the body's weight during walking and running."),
            zh = LocalizedContent("人体最大的骨头是什么？", listOf("股骨", "胫骨", "肱骨", "脊柱"), "科学", "股骨是大腿骨，是人体骨骼中最长最重的骨头，在行走和跑步时支撑身体重量。"),
            es = LocalizedContent("¿Cuál es el hueso más grande del cuerpo humano?", listOf("Fémur", "Tibia", "Húmero", "Columna vertebral"), "Ciencia", "El fémur, el hueso del muslo, es el más largo y pesado del esqueleto humano, soportando el peso del cuerpo al caminar y correr.")
        ),
        BilingualQuestion(
            id = 50055, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel fleuve passe par Paris?", listOf("Rhône", "Loire", "Seine", "Garonne"), "Géographie", "La Seine traverse Paris et constitue un axe majeur de la ville, avec ses célèbres quais classés au patrimoine mondial de l'UNESCO."),
            en = LocalizedContent("Which river flows through Paris?", listOf("Rhône", "Loire", "Seine", "Garonne"), "Geography", "The Seine flows through Paris and is a major axis of the city, with its famous quays listed as a UNESCO World Heritage site."),
            zh = LocalizedContent("哪条河流经巴黎？", listOf("罗讷河", "卢瓦尔河", "塞纳河", "加龙河"), "地理", "塞纳河流经巴黎，是城市的主要轴线，其著名的河岸被列为联合国教科文组织世界遗产。"),
            es = LocalizedContent("¿Qué río atraviesa París?", listOf("Ródano", "Loira", "Sena", "Garona"), "Geografía", "El Sena atraviesa París y constituye un eje principal de la ciudad, con sus famosos muelles declarados Patrimonio de la Humanidad por la UNESCO.")
        ),
        BilingualQuestion(
            id = 50056, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste a peint 'La Persistance de la Mémoire'?", listOf("Miró", "Dalí", "Kandinsky", "Magritte"), "Culture", "Dalí a peint ce tableau en 1931, où les montres molles symbolisent la relativité du temps, une œuvre emblématique du surréalisme."),
            en = LocalizedContent("Which artist painted 'The Persistence of Memory'?", listOf("Miró", "Dalí", "Kandinsky", "Magritte"), "Culture", "Dalí painted this work in 1931, where the melting watches symbolize the relativity of time, an iconic piece of Surrealism."),
            zh = LocalizedContent("哪位艺术家创作了《记忆的永恒》？", listOf("米罗", "达利", "康定斯基", "马格利特"), "文化", "达利于1931年创作了这幅画，融化的钟表象征着时间的相对性，是超现实主义的标志性作品。"),
            es = LocalizedContent("¿Qué artista pintó 'La persistencia de la memoria'?", listOf("Miró", "Dalí", "Kandinsky", "Magritte"), "Cultura", "Dalí pintó esta obra en 1931, donde los relojes blandos simbolizan la relatividad del tiempo, una obra emblemática del surrealismo.")
        ),
        BilingualQuestion(
            id = 50057, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays a remporté la Coupe du Monde de football 2022?", listOf("France", "Argentine", "Brésil", "Allemagne"), "Sport", "L'Argentine a battu la France en finale aux tirs au but, le 18 décembre 2022 au Qatar. C'était le troisième titre mondial pour l'Argentine, après 1978 et 1986."),
            en = LocalizedContent("Which country won the 2022 FIFA World Cup?", listOf("France", "Argentina", "Brazil", "Germany"), "Sports", "Argentina defeated France in the final on penalties on December 18, 2022 in Qatar. It was Argentina's third world title, after 1978 and 1986."),
            zh = LocalizedContent("哪个国家赢得了2022年世界杯？", listOf("法国", "阿根廷", "巴西", "德国"), "体育", "阿根廷在2022年12月18日于卡塔尔举行的决赛中点球击败法国，这是阿根廷继1978年和1986年后的第三个世界冠军。"),
            es = LocalizedContent("¿Qué país ganó la Copa Mundial de la FIFA 2022?", listOf("Francia", "Argentina", "Brasil", "Alemania"), "Deportes", "Argentina derrotó a Francia en la final por penaltis el 18 de diciembre de 2022 en Catar. Fue el tercer título mundial de Argentina, después de 1978 y 1986.")
        ),
        BilingualQuestion(
            id = 50058, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film a remporté l'Oscar du meilleur film en 2023?", listOf("Everything Everywhere All at Once", "The Fabelmans", "Top Gun: Maverick", "All Quiet"), "Cinéma", "Le film Everything Everywhere All at Once a remporté l'Oscar du meilleur film en 2023, marquant une victoire historique pour un film de science-fiction indépendant."),
            en = LocalizedContent("Which film won the Academy Award for Best Picture in 2023?", listOf("Everything Everywhere All at Once", "The Fabelmans", "Top Gun: Maverick", "All Quiet"), "Cinema", "The film Everything Everywhere All at Once won the Oscar for Best Picture in 2023, marking a historic victory for an independent science fiction film."),
            zh = LocalizedContent("哪部电影获得了2023年奥斯卡最佳影片奖？", listOf("瞬息全宇宙", "造梦之家", "壮志凌云：独行侠", "西线无战事"), "电影", "电影《瞬息全宇宙》在2023年获得奥斯卡最佳影片奖，标志着独立科幻电影的历史性胜利。"),
            es = LocalizedContent("¿Qué película ganó el Premio de la Academia a la Mejor Película en 2023?", listOf("Todo a la vez en todas partes", "Los Fabelman", "Top Gun: Maverick", "Sin novedad en el frente"), "Cine", "La película Todo a la vez en todas partes ganó el Oscar a la Mejor Película en 2023, marcando una victoria histórica para una película de ciencia ficción independiente.")
        ),
        BilingualQuestion(
            id = 50059, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel artiste a créé 'Blinding Lights'?", listOf("Dua Lipa", "The Weeknd", "Billie Eilish", "Ariana Grande"), "Musique", "The Weeknd a sorti 'Blinding Lights' en 2019 sur son album 'After Hours'. La chanson est devenue l'un des plus grands succès de la décennie."),
            en = LocalizedContent("Which artist created 'Blinding Lights'?", listOf("Dua Lipa", "The Weeknd", "Billie Eilish", "Ariana Grande"), "Music", "The Weeknd released 'Blinding Lights' in 2019 on his album 'After Hours'. The song became one of the biggest hits of the decade."),
            zh = LocalizedContent("哪位艺术家创作了《Blinding Lights》？", listOf("杜阿·利帕", "威肯", "比莉·艾利什", "爱莉安娜·格兰德"), "音乐", "威肯于2019年在其专辑《After Hours》中发布了《Blinding Lights》。这首歌成为十年来最热门的歌曲之一。"),
            es = LocalizedContent("¿Qué artista creó 'Blinding Lights'?", listOf("Dua Lipa", "The Weeknd", "Billie Eilish", "Ariana Grande"), "Música", "The Weeknd lanzó 'Blinding Lights' en 2019 en su álbum 'After Hours'. La canción se convirtió en uno de los mayores éxitos de la década.")
        ),
        BilingualQuestion(
            id = 50060, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Napoléon a-t-il été exilé?", listOf("1814", "1815", "1816", "1817"), "Histoire", "Après l'invasion de la France par les coalisés et l'abdication d'avril 1814, Napoléon est exilé à l'île d'Elbe par le traité de Fontainebleau."),
            en = LocalizedContent("In which year was Napoleon exiled?", listOf("1814", "1815", "1816", "1817"), "History", "After the invasion of France by the coalition and his abdication in April 1814, Napoleon was exiled to the island of Elba by the Treaty of Fontainebleau."),
            zh = LocalizedContent("拿破仑在哪一年被流放？", listOf("1814", "1815", "1816", "1817"), "历史", "在联军入侵法国和1814年4月退位后，拿破仑根据枫丹白露条约被流放到厄尔巴岛。"),
            es = LocalizedContent("¿En qué año fue exiliado Napoleón?", listOf("1814", "1815", "1816", "1817"), "Historia", "Tras la invasión de Francia por la coalición y su abdicación en abril de 1814, Napoleón fue exiliado a la isla de Elba por el Tratado de Fontainebleau.")
        ),
        BilingualQuestion(
            id = 50061, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel élément chimique a le symbole Au?", listOf("Argent", "Aluminium", "Or", "Arsenic"), "Science", "Le symbole Au vient du latin aurum, qui signifie or. C'est un métal précieux utilisé en joaillerie et en électronique."),
            en = LocalizedContent("Which chemical element has the symbol Au?", listOf("Silver", "Aluminum", "Gold", "Arsenic"), "Science", "The symbol Au comes from the Latin aurum, meaning gold. It is a precious metal used in jewelry and electronics."),
            zh = LocalizedContent("哪种化学元素的符号是Au？", listOf("银", "铝", "金", "砷"), "科学", "符号Au来自拉丁语aurum，意为金。它是一种用于珠宝和电子产品的贵金属。"),
            es = LocalizedContent("¿Qué elemento químico tiene el símbolo Au?", listOf("Plata", "Aluminio", "Oro", "Arsénico"), "Ciencia", "El símbolo Au proviene del latín aurum, que significa oro. Es un metal precioso utilizado en joyería y electrónica.")
        ),
        BilingualQuestion(
            id = 50062, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel océan est le plus grand?", listOf("Atlantique", "Indien", "Arctique", "Pacifique"), "Géographie", "L'océan Pacifique couvre environ 165 millions de kilomètres carrés, soit plus du tiers de la surface terrestre, ce qui en fait le plus vaste océan du monde."),
            en = LocalizedContent("Which ocean is the largest?", listOf("Atlantic", "Indian", "Arctic", "Pacific"), "Geography", "The Pacific Ocean covers about 165 million square kilometers, more than a third of the Earth's surface, making it the largest ocean in the world."),
            zh = LocalizedContent("哪个海洋最大？", listOf("大西洋", "印度洋", "北冰洋", "太平洋"), "地理", "太平洋面积约1.65亿平方公里，占地球表面积的三分之一以上，是世界上最大的海洋。"),
            es = LocalizedContent("¿Qué océano es el más grande?", listOf("Atlántico", "Índico", "Ártico", "Pacífico"), "Geografía", "El océano Pacífico cubre aproximadamente 165 millones de kilómetros cuadrados, más de un tercio de la superficie terrestre, lo que lo convierte en el océano más grande del mundo.")
        ),
        BilingualQuestion(
            id = 50063, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle religion a pour livre sacré le Coran?", listOf("Hindouisme", "Islam", "Bouddhisme", "Judaïsme"), "Culture", "Le Coran est le texte sacré de l'islam, révélé au prophète Mahomet selon la tradition musulmane."),
            en = LocalizedContent("Which religion has the Quran as its holy book?", listOf("Hinduism", "Islam", "Buddhism", "Judaism"), "Culture", "The Quran is the sacred text of Islam, revealed to the prophet Muhammad according to Muslim tradition."),
            zh = LocalizedContent("哪种宗教以《古兰经》为圣书？", listOf("印度教", "伊斯兰教", "佛教", "犹太教"), "文化", "《古兰经》是伊斯兰教的圣典，根据穆斯林传统，它是真主启示给先知穆罕默德的。"),
            es = LocalizedContent("¿Qué religión tiene el Corán como libro sagrado?", listOf("Hinduismo", "Islam", "Budismo", "Judaísmo"), "Cultura", "El Corán es el texto sagrado del islam, revelado al profeta Mahoma según la tradición musulmana.")
        ),
        BilingualQuestion(
            id = 50064, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quel année le marathon olympique a-t-il été créé?", listOf("1896", "1900", "1908", "1920"), "Sport", "Le marathon a été introduit aux Jeux olympiques modernes lors de leur première édition à Athènes en 1896, en hommage à la légende du messager grec Phidippidès."),
            en = LocalizedContent("In which year was the Olympic marathon created?", listOf("1896", "1900", "1908", "1920"), "Sports", "The marathon was introduced at the modern Olympic Games in their first edition in Athens in 1896, in honor of the legend of the Greek messenger Pheidippides."),
            zh = LocalizedContent("奥林匹克马拉松在哪一年创立？", listOf("1896", "1900", "1908", "1920"), "体育", "马拉松在1896年雅典第一届现代奥运会上被引入，以纪念希腊信使菲迪皮德斯的传说。"),
            es = LocalizedContent("¿En qué año se creó el maratón olímpico?", listOf("1896", "1900", "1908", "1920"), "Deportes", "El maratón se introdujo en los Juegos Olímpicos modernos en su primera edición en Atenas en 1896, en homenaje a la leyenda del mensajero griego Filípides.")
        ),
        BilingualQuestion(
            id = 50065, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a créé 'Pulp Fiction'?", listOf("Martin Scorsese", "David Fincher", "Quentin Tarantino", "Spike Lee"), "Cinéma", "Quentin Tarantino a écrit et réalisé Pulp Fiction, sorti en 1994, qui a remporté la Palme d'or à Cannes et révolutionné le cinéma indépendant."),
            en = LocalizedContent("Which director created 'Pulp Fiction'?", listOf("Martin Scorsese", "David Fincher", "Quentin Tarantino", "Spike Lee"), "Cinema", "Quentin Tarantino wrote and directed Pulp Fiction, released in 1994, which won the Palme d'Or at Cannes and revolutionized independent cinema."),
            zh = LocalizedContent("哪位导演创作了《低俗小说》？", listOf("马丁·斯科塞斯", "大卫·芬奇", "昆汀·塔伦蒂诺", "斯派克·李"), "电影", "昆汀·塔伦蒂诺编剧并执导了1994年上映的《低俗小说》，该片获得了戛纳金棕榈奖，并革新了独立电影。"),
            es = LocalizedContent("¿Qué director creó 'Pulp Fiction'?", listOf("Martin Scorsese", "David Fincher", "Quentin Tarantino", "Spike Lee"), "Cine", "Quentin Tarantino escribió y dirigió Pulp Fiction, estrenada en 1994, que ganó la Palma de Oro en Cannes y revolucionó el cine independiente.")
        ),
        BilingualQuestion(
            id = 50066, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel musicien a composé '4'33\"'?", listOf("John Cage", "Yoko Ono", "Merzbow", "Alvin Lucier"), "Musique", "John Cage a composé 4'33\" en 1952, une œuvre où l'interprète ne joue aucune note, mettant en avant les bruits ambiants comme la musique."),
            en = LocalizedContent("Which musician composed '4'33\"'?", listOf("John Cage", "Yoko Ono", "Merzbow", "Alvin Lucier"), "Music", "John Cage composed 4'33\" in 1952, a piece where the performer plays no notes, highlighting ambient sounds as music."),
            zh = LocalizedContent("哪位音乐家创作了《4分33秒》？", listOf("约翰·凯奇", "小野洋子", "梅兹鲍", "阿尔文·卢西尔"), "音乐", "约翰·凯奇于1952年创作了《4分33秒》，这部作品演奏者不弹奏任何音符，将环境声音作为音乐呈现。"),
            es = LocalizedContent("¿Qué músico compuso '4'33\"'?", listOf("John Cage", "Yoko Ono", "Merzbow", "Alvin Lucier"), "Música", "John Cage compuso 4'33\" en 1952, una obra en la que el intérprete no toca ninguna nota, destacando los sonidos ambientales como música.")
        ),
        BilingualQuestion(
            id = 50067, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel était le principal adversaire de l'URSS pendant la Guerre froide?", listOf("Allemagne", "États-Unis", "Royaume-Uni", "France"), "Histoire", "Les États-Unis et l'URSS se sont affrontés idéologiquement et géopolitiquement de 1947 à 1991, sans combat direct, dans ce qu'on appelle la Guerre froide."),
            en = LocalizedContent("Who was the main adversary of the USSR during the Cold War?", listOf("Germany", "United States", "United Kingdom", "France"), "History", "The United States and the USSR clashed ideologically and geopolitically from 1947 to 1991, without direct combat, in what is called the Cold War."),
            zh = LocalizedContent("冷战期间苏联的主要对手是谁？", listOf("德国", "美国", "英国", "法国"), "历史", "美国和苏联从1947年到1991年在意识形态和地缘政治上对抗，没有直接交战，这被称为冷战。"),
            es = LocalizedContent("¿Quién fue el principal adversario de la URSS durante la Guerra Fría?", listOf("Alemania", "Estados Unidos", "Reino Unido", "Francia"), "Historia", "Estados Unidos y la URSS se enfrentaron ideológica y geopolíticamente desde 1947 hasta 1991, sin combate directo, en lo que se llama la Guerra Fría.")
        ),
        BilingualQuestion(
            id = 50068, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de os a un adulte?", listOf("186", "206", "226", "246"), "Science", "Le squelette humain adulte compte 206 os, un nombre qui diminue par rapport à la naissance où il y en a environ 270, car certains os fusionnent en grandissant."),
            en = LocalizedContent("How many bones does an adult have?", listOf("186", "206", "226", "246"), "Science", "The adult human skeleton has 206 bones, a decrease from about 270 at birth because some bones fuse as we grow."),
            zh = LocalizedContent("成年人有多少块骨头？", listOf("186", "206", "226", "246"), "科学", "成年人的骨骼有206块骨头，比出生时的约270块减少，因为一些骨头在成长过程中融合。"),
            es = LocalizedContent("¿Cuántos huesos tiene un adulto?", listOf("186", "206", "226", "246"), "Ciencia", "El esqueleto humano adulto tiene 206 huesos, una disminución respecto a los aproximadamente 270 al nacer, ya que algunos huesos se fusionan al crecer.")
        ),
        BilingualQuestion(
            id = 50069, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de lacs?", listOf("Canada", "Finlande", "Suède", "Norvège"), "Géographie", "Le Canada compte plus de 2 millions de lacs, soit environ 60 % des lacs du monde, en raison de son relief façonné par les glaciers."),
            en = LocalizedContent("Which country has the most lakes?", listOf("Canada", "Finland", "Sweden", "Norway"), "Geography", "Canada has over 2 million lakes, about 60% of the world's lakes, due to its glacier-carved landscape."),
            zh = LocalizedContent("哪个国家拥有最多的湖泊？", listOf("加拿大", "芬兰", "瑞典", "挪威"), "地理", "加拿大有超过200万个湖泊，约占世界湖泊的60%，这是由于冰川侵蚀形成的地貌。"),
            es = LocalizedContent("¿Qué país tiene más lagos?", listOf("Canadá", "Finlandia", "Suecia", "Noruega"), "Geografía", "Canadá tiene más de 2 millones de lagos, aproximadamente el 60% de los lagos del mundo, debido a su paisaje esculpido por glaciares.")
        ),
        BilingualQuestion(
            id = 50070, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel artiste a peint la 'Nuit étoilée'?", listOf("Picasso", "Van Gogh", "Kandinsky", "Mondrian"), "Culture", "Van Gogh a peint La Nuit étoilée en 1889 alors qu'il était interné à l'asile de Saint-Rémy-de-Provence, et ce tableau est devenu l'une de ses œuvres les plus célèbres."),
            en = LocalizedContent("Which artist painted 'The Starry Night'?", listOf("Picasso", "Van Gogh", "Kandinsky", "Mondrian"), "Culture", "Van Gogh painted The Starry Night in 1889 while he was interned at the asylum of Saint-Rémy-de-Provence, and this painting became one of his most famous works."),
            zh = LocalizedContent("哪位艺术家画了《星夜》？", listOf("毕加索", "梵高", "康定斯基", "蒙德里安"), "文化", "梵高于1889年在圣雷米普罗旺斯的精神病院期间创作了《星夜》，这幅画成为他最著名的作品之一。"),
            es = LocalizedContent("¿Qué artista pintó 'La noche estrellada'?", listOf("Picasso", "Van Gogh", "Kandinsky", "Mondrian"), "Cultura", "Van Gogh pintó La noche estrellada en 1889 mientras estaba internado en el asilo de Saint-Rémy-de-Provence, y este cuadro se convirtió en una de sus obras más famosas.")
        ),
        BilingualQuestion(
            id = 50071, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel golfeur a remporté le plus de majeurs?", listOf("Arnold Palmer", "Jack Nicklaus", "Tiger Woods", "Phil Mickelson"), "Sport", "Jack Nicklaus détient le record du nombre de victoires en tournois majeurs avec 18 titres, un total inégalé dans l'histoire du golf professionnel masculin."),
            en = LocalizedContent("Which golfer has won the most majors?", listOf("Arnold Palmer", "Jack Nicklaus", "Tiger Woods", "Phil Mickelson"), "Sports", "Jack Nicklaus holds the record for most major championship wins with 18 titles, a total unmatched in the history of men's professional golf."),
            zh = LocalizedContent("哪位高尔夫球手赢得的大满贯最多？", listOf("阿诺德·帕尔默", "杰克·尼克劳斯", "泰格·伍兹", "菲尔·米克尔森"), "体育", "杰克·尼克劳斯以18个大满贯冠军头衔保持着纪录，这一总数在男子职业高尔夫历史上无人能及。"),
            es = LocalizedContent("¿Qué golfista ha ganado más grandes?", listOf("Arnold Palmer", "Jack Nicklaus", "Tiger Woods", "Phil Mickelson"), "Deportes", "Jack Nicklaus posee el récord de más victorias en torneos mayores con 18 títulos, un total sin igual en la historia del golf profesional masculino.")
        ),
        BilingualQuestion(
            id = 50072, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur a joué dans 'The Matrix'?", listOf("Johnny Depp", "Keanu Reeves", "Tom Cruise", "Brad Pitt"), "Cinéma", "Keanu Reeves a incarné Neo, le personnage principal de la trilogie Matrix, un rôle emblématique qui a marqué sa carrière et le cinéma de science-fiction."),
            en = LocalizedContent("Which actor starred in 'The Matrix'?", listOf("Johnny Depp", "Keanu Reeves", "Tom Cruise", "Brad Pitt"), "Cinema", "Keanu Reeves played Neo, the main character of the Matrix trilogy, an iconic role that marked his career and science fiction cinema."),
            zh = LocalizedContent("哪位演员出演了《黑客帝国》？", listOf("约翰尼·德普", "基努·里维斯", "汤姆·克鲁斯", "布拉德·皮特"), "电影", "基努·里维斯饰演了《黑客帝国》三部曲的主角尼奥，这是一个标志性的角色，标志了他的职业生涯和科幻电影。"),
            es = LocalizedContent("¿Qué actor actuó en 'The Matrix'?", listOf("Johnny Depp", "Keanu Reeves", "Tom Cruise", "Brad Pitt"), "Cine", "Keanu Reeves interpretó a Neo, el personaje principal de la trilogía Matrix, un papel emblemático que marcó su carrera y el cine de ciencia ficción.")
        ),
        BilingualQuestion(
            id = 50073, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel rappeur a créé l'album 'Illmatic'?", listOf("JAY-Z", "Nas", "Biggie", "Tupac"), "Musique", "Nas a sorti Illmatic en 1994, considéré comme un classique du hip-hop et un sommet du rap new-yorkais."),
            en = LocalizedContent("Which rapper created the album 'Illmatic'?", listOf("JAY-Z", "Nas", "Biggie", "Tupac"), "Music", "Nas released Illmatic in 1994, considered a classic of hip-hop and a pinnacle of New York rap."),
            zh = LocalizedContent("哪位说唱歌手创作了专辑《Illmatic》？", listOf("JAY-Z", "纳斯", "比吉", "图帕克"), "音乐", "纳斯于1994年发行了《Illmatic》，这张专辑被认为是嘻哈音乐的经典之作，也是纽约说唱的巅峰之作。"),
            es = LocalizedContent("¿Qué rapero creó el álbum 'Illmatic'?", listOf("JAY-Z", "Nas", "Biggie", "Tupac"), "Música", "Nas lanzó Illmatic en 1994, considerado un clásico del hip-hop y una cumbre del rap neoyorquino.")
        ),
        BilingualQuestion(
            id = 50074, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la Première Guerre mondiale a-t-elle commencé?", listOf("1912", "1913", "1914", "1915"), "Histoire", "L'assassinat de l'archiduc François-Ferdinand en juin 1914 a déclenché un engrenage d'alliances, menant à la déclaration de guerre de l'Autriche-Hongrie à la Serbie le 28 juillet, suivie par l'entrée en guerre des grandes puissances européennes."),
            en = LocalizedContent("In which year did World War I begin?", listOf("1912", "1913", "1914", "1915"), "History", "The assassination of Archduke Franz Ferdinand in June 1914 triggered a chain of alliances, leading to Austria-Hungary's declaration of war on Serbia on July 28, followed by the entry of major European powers into the war."),
            zh = LocalizedContent("第一次世界大战在哪一年开始？", listOf("1912", "1913", "1914", "1915"), "历史", "1914年6月，斐迪南大公遇刺引发了一系列联盟连锁反应，导致奥匈帝国于7月28日向塞尔维亚宣战，随后欧洲各大国参战。"),
            es = LocalizedContent("¿En qué año comenzó la Primera Guerra Mundial?", listOf("1912", "1913", "1914", "1915"), "Historia", "El asesinato del archiduque Francisco Fernando en junio de 1914 desencadenó un engranaje de alianzas, llevando a la declaración de guerra de Austria-Hungría a Serbia el 28 de julio, seguida por la entrada en guerra de las grandes potencias europeas.")
        ),
        BilingualQuestion(
            id = 50075, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus rapide animal terrestre?", listOf("Lion", "Guépard", "Gazelle", "Cheval"), "Science", "Le guépard peut atteindre des pointes à 110 km/h sur de courtes distances, grâce à sa colonne vertébrale flexible et ses griffes non rétractiles."),
            en = LocalizedContent("What is the fastest land animal?", listOf("Lion", "Cheetah", "Gazelle", "Horse"), "Science", "The cheetah can reach speeds of up to 110 km/h over short distances, thanks to its flexible spine and non-retractable claws."),
            zh = LocalizedContent("最快的陆地动物是什么？", listOf("狮子", "猎豹", "瞪羚", "马"), "科学", "猎豹在短距离内时速可达110公里，这得益于其灵活的脊柱和不可伸缩的爪子。"),
            es = LocalizedContent("¿Cuál es el animal terrestre más rápido?", listOf("León", "Guepardo", "Gacela", "Caballo"), "Ciencia", "El guepardo puede alcanzar velocidades de hasta 110 km/h en distancias cortas, gracias a su columna vertebral flexible y sus garras no retráctiles.")
        ),
        BilingualQuestion(
            id = 50076, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand lac d'Afrique?", listOf("Tanganyika", "Victoria", "Malawi", "Albert"), "Géographie", "Le lac Victoria est le plus grand lac d'Afrique par sa superficie, situé entre l'Ouganda, la Tanzanie et le Kenya."),
            en = LocalizedContent("What is the largest lake in Africa?", listOf("Tanganyika", "Victoria", "Malawi", "Albert"), "Geography", "Lake Victoria is the largest lake in Africa by surface area, located between Uganda, Tanzania, and Kenya."),
            zh = LocalizedContent("非洲最大的湖泊是什么？", listOf("坦噶尼喀湖", "维多利亚湖", "马拉维湖", "阿尔伯特湖"), "地理", "维多利亚湖是非洲面积最大的湖泊，位于乌干达、坦桑尼亚和肯尼亚之间。"),
            es = LocalizedContent("¿Cuál es el lago más grande de África?", listOf("Tanganica", "Victoria", "Malaui", "Alberto"), "Geografía", "El lago Victoria es el lago más grande de África por superficie, situado entre Uganda, Tanzania y Kenia.")
        ),
        BilingualQuestion(
            id = 50077, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien livre du monde?", listOf("Bible", "Épopée de Gilgamesh", "Ramayana", "Iliade"), "Culture", "L'Épopée de Gilgamesh, gravée sur des tablettes d'argile en écriture cunéiforme, date d'environ 2100 av. J.-C. en Mésopotamie."),
            en = LocalizedContent("What is the oldest book in the world?", listOf("Bible", "Epic of Gilgamesh", "Ramayana", "Iliad"), "Culture", "The Epic of Gilgamesh, inscribed on clay tablets in cuneiform script, dates from around 2100 BC in Mesopotamia."),
            zh = LocalizedContent("世界上最古老的书是什么？", listOf("圣经", "吉尔伽美什史诗", "罗摩衍那", "伊利亚特"), "文化", "《吉尔伽美什史诗》刻在楔形文字的泥板上，可追溯到公元前2100年左右的美索不达米亚。"),
            es = LocalizedContent("¿Cuál es el libro más antiguo del mundo?", listOf("Biblia", "Épica de Gilgamesh", "Ramayana", "Ilíada"), "Cultura", "La Épica de Gilgamesh, grabada en tablillas de arcilla con escritura cuneiforme, data de alrededor del 2100 a.C. en Mesopotamia.")
        ),
        BilingualQuestion(
            id = 50078, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel tenniseur a remporté Wimbledon le plus de fois?", listOf("Pete Sampras", "Rafael Nadal", "Roger Federer", "Novak Djokovic"), "Sport", "Roger Federer détient le record de titres à Wimbledon chez les hommes avec huit victoires, la dernière en 2017. Il a dominé l'herbe londonienne entre 2003 et 2017."),
            en = LocalizedContent("Which tennis player has won Wimbledon the most times?", listOf("Pete Sampras", "Rafael Nadal", "Roger Federer", "Novak Djokovic"), "Sports", "Roger Federer holds the record for most Wimbledon titles among men with eight victories, the last in 2017. He dominated the London grass between 2003 and 2017."),
            zh = LocalizedContent("哪位网球运动员赢得温布尔登次数最多？", listOf("皮特·桑普拉斯", "拉斐尔·纳达尔", "罗杰·费德勒", "诺瓦克·德约科维奇"), "体育", "罗杰·费德勒以八次温网冠军保持着男子纪录，最后一次是在2017年。他在2003年至2017年间统治了伦敦的草地赛场。"),
            es = LocalizedContent("¿Qué tenista ha ganado Wimbledon más veces?", listOf("Pete Sampras", "Rafael Nadal", "Roger Federer", "Novak Djokovic"), "Deportes", "Roger Federer posee el récord de más títulos de Wimbledon entre los hombres con ocho victorias, la última en 2017. Dominó la hierba londinense entre 2003 y 2017.")
        ),
        BilingualQuestion(
            id = 50079, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel année 'E.T.' a-t-il été lancé?", listOf("1980", "1981", "1982", "1983"), "Cinéma", "Le film E.T. l'extra-terrestre, réalisé par Steven Spielberg, est sorti en salles le 11 juin 1982 aux États-Unis, devenant un immense succès commercial et critique."),
            en = LocalizedContent("In which year was 'E.T.' released?", listOf("1980", "1981", "1982", "1983"), "Cinema", "The film E.T. the Extra-Terrestrial, directed by Steven Spielberg, was released in theaters on June 11, 1982 in the United States, becoming a huge commercial and critical success."),
            zh = LocalizedContent("《E.T.》在哪一年上映？", listOf("1980", "1981", "1982", "1983"), "电影", "由史蒂文·斯皮尔伯格执导的电影《E.T.外星人》于1982年6月11日在美国上映，取得了巨大的商业和评论成功。"),
            es = LocalizedContent("¿En qué año se estrenó 'E.T.'?", listOf("1980", "1981", "1982", "1983"), "Cine", "La película E.T. el extraterrestre, dirigida por Steven Spielberg, se estrenó en cines el 11 de junio de 1982 en Estados Unidos, convirtiéndose en un enorme éxito comercial y de crítica.")
        ),
        BilingualQuestion(
            id = 50080, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel compositeur a créé 'Pour Elise'?", listOf("Mozart", "Chopin", "Beethoven", "Bach"), "Musique", "Beethoven a composé 'Pour Elise' en 1810, une pièce pour piano dédiée à une femme non identifiée, probablement Thérèse Malfatti."),
            en = LocalizedContent("Which composer created 'Für Elise'?", listOf("Mozart", "Chopin", "Beethoven", "Bach"), "Music", "Beethoven composed 'Für Elise' in 1810, a piano piece dedicated to an unidentified woman, likely Therese Malfatti."),
            zh = LocalizedContent("哪位作曲家创作了《致爱丽丝》？", listOf("莫扎特", "肖邦", "贝多芬", "巴赫"), "音乐", "贝多芬于1810年创作了《致爱丽丝》，这是一首献给一位身份不明的女性（可能是特蕾莎·马尔法蒂）的钢琴曲。"),
            es = LocalizedContent("¿Qué compositor creó 'Para Elisa'?", listOf("Mozart", "Chopin", "Beethoven", "Bach"), "Musica", "Beethoven compuso 'Para Elisa' en 1810, una pieza para piano dedicada a una mujer no identificada, probablemente Therese Malfatti.")
        ),
        BilingualQuestion(
            id = 50081, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel roi d'Angleterre a fondé l'Église d'Angleterre?", listOf("Charles I", "Henri VIII", "Édouard I", "Jean d'Angleterre"), "Histoire", "Henri VIII rompit avec l'Église catholique romaine en 1534 après le refus du pape d'annuler son mariage avec Catherine d'Aragon, créant ainsi l'Église d'Angleterre dont il devint le chef suprême."),
            en = LocalizedContent("Which English king founded the Church of England?", listOf("Charles I", "Henry VIII", "Edward I", "John of England"), "History", "Henry VIII broke with the Roman Catholic Church in 1534 after the Pope refused to annul his marriage to Catherine of Aragon, thus creating the Church of England with himself as its Supreme Head."),
            zh = LocalizedContent("哪位英格兰国王创立了英格兰教会？", listOf("查理一世", "亨利八世", "爱德华一世", "英格兰的约翰"), "历史", "亨利八世在教皇拒绝宣布他与阿拉贡的凯瑟琳的婚姻无效后，于1534年与罗马天主教会决裂，创立了英格兰教会，并自任最高领袖。"),
            es = LocalizedContent("¿Qué rey de Inglaterra fundó la Iglesia de Inglaterra?", listOf("Carlos I", "Enrique VIII", "Eduardo I", "Juan de Inglaterra"), "Historia", "Enrique VIII rompió con la Iglesia Católica Romana en 1534 después de que el Papa se negara a anular su matrimonio con Catalina de Aragón, creando así la Iglesia de Inglaterra, de la que se convirtió en cabeza suprema.")
        ),
        BilingualQuestion(
            id = 50082, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand mammifère du monde?", listOf("Éléphant d'Afrique", "Girafe", "Baleine bleue", "Hippopotame"), "Science", "La baleine bleue peut atteindre plus de 30 mètres de long et peser jusqu'à 200 tonnes, ce qui en fait le plus grand animal ayant jamais existé sur Terre."),
            en = LocalizedContent("What is the largest mammal in the world?", listOf("African elephant", "Giraffe", "Blue whale", "Hippopotamus"), "Science", "The blue whale can reach over 30 meters in length and weigh up to 200 tons, making it the largest animal ever to have lived on Earth."),
            zh = LocalizedContent("世界上最大的哺乳动物是什么？", listOf("非洲象", "长颈鹿", "蓝鲸", "河马"), "科学", "蓝鲸体长可达30米以上，重达200吨，是地球上现存最大的动物。"),
            es = LocalizedContent("¿Cuál es el mamífero más grande del mundo?", listOf("Elefante africano", "Jirafa", "Ballena azul", "Hipopótamo"), "Ciencia", "La ballena azul puede alcanzar más de 30 metros de longitud y pesar hasta 200 toneladas, lo que la convierte en el animal más grande que jamás haya existido en la Tierra.")
        ),
        BilingualQuestion(
            id = 50083, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le pays le plus peuplé d'Afrique?", listOf("Égypte", "Nigeria", "Éthiopie", "Tanzanie"), "Géographie", "Le Nigeria est le pays le plus peuplé d'Afrique avec plus de 220 millions d'habitants, dépassant largement l'Éthiopie et l'Égypte."),
            en = LocalizedContent("Which is the most populous country in Africa?", listOf("Egypt", "Nigeria", "Ethiopia", "Tanzania"), "Geography", "Nigeria is the most populous country in Africa with over 220 million inhabitants, far surpassing Ethiopia and Egypt."),
            zh = LocalizedContent("非洲人口最多的国家是哪个？", listOf("埃及", "尼日利亚", "埃塞俄比亚", "坦桑尼亚"), "地理", "尼日利亚是非洲人口最多的国家，拥有超过2.2亿居民，远超埃塞俄比亚和埃及。"),
            es = LocalizedContent("¿Cuál es el país más poblado de África?", listOf("Egipto", "Nigeria", "Etiopía", "Tanzania"), "Geografia", "Nigeria es el país más poblado de África con más de 220 millones de habitantes, superando ampliamente a Etiopía y Egipto.")
        ),
        BilingualQuestion(
            id = 50084, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel festival annuel se tient en Inde pour la Lumière?", listOf("Holi", "Diwali", "Navratri", "Baisakhi"), "Culture", "Diwali, également appelé la fête des lumières, est une célébration hindoue majeure qui symbolise la victoire de la lumière sur les ténèbres."),
            en = LocalizedContent("Which annual festival is held in India for Light?", listOf("Holi", "Diwali", "Navratri", "Baisakhi"), "Culture", "Diwali, also known as the festival of lights, is a major Hindu celebration that symbolizes the victory of light over darkness."),
            zh = LocalizedContent("印度每年举行的光明节是哪个？", listOf("洒红节", "排灯节", "九夜节", "丰收节"), "文化", "排灯节，又称光明节，是印度教的重要节日，象征着光明战胜黑暗。"),
            es = LocalizedContent("¿Qué festival anual se celebra en la India por la Luz?", listOf("Holi", "Diwali", "Navratri", "Baisakhi"), "Cultura", "Diwali, también conocido como el festival de las luces, es una celebración hindú importante que simboliza la victoria de la luz sobre la oscuridad.")
        ),
        BilingualQuestion(
            id = 50085, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel ancien boxeur a remporté trois titres mondiaux poids lourds?", listOf("Joe Frazier", "Muhammad Ali", "Lennox Lewis", "Evander Holyfield"), "Sport", "Muhammad Ali a remporté le titre poids lourds à trois reprises (1964, 1974, 1978), devenant le premier boxeur de l'histoire à réaliser cet exploit dans cette catégorie."),
            en = LocalizedContent("Which former boxer won three world heavyweight titles?", listOf("Joe Frazier", "Muhammad Ali", "Lennox Lewis", "Evander Holyfield"), "Sports", "Muhammad Ali won the heavyweight title three times (1964, 1974, 1978), becoming the first boxer in history to achieve this feat in that category."),
            zh = LocalizedContent("哪位前拳击手赢得了三次世界重量级冠军？", listOf("乔·弗雷泽", "穆罕默德·阿里", "伦诺克斯·刘易斯", "伊万德·霍利菲尔德"), "体育", "穆罕默德·阿里三次赢得重量级冠军（1964年、1974年、1978年），成为历史上首位在该级别实现这一壮举的拳击手。"),
            es = LocalizedContent("¿Qué exboxeador ganó tres títulos mundiales de peso pesado?", listOf("Joe Frazier", "Muhammad Ali", "Lennox Lewis", "Evander Holyfield"), "Deportes", "Muhammad Ali ganó el título de peso pesado tres veces (1964, 1974, 1978), convirtiéndose en el primer boxeador en la historia en lograr esta hazaña en esa categoría.")
        ),
        BilingualQuestion(
            id = 50086, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a créé 'Inception'?", listOf("Denis Villeneuve", "Christopher Nolan", "Ridley Scott", "David Fincher"), "Cinéma", "Christopher Nolan a écrit et réalisé Inception, sorti en 2010, un film de science-fiction explorant l'infiltration des rêves."),
            en = LocalizedContent("Which director created 'Inception'?", listOf("Denis Villeneuve", "Christopher Nolan", "Ridley Scott", "David Fincher"), "Cinema", "Christopher Nolan wrote and directed Inception, released in 2010, a science fiction film exploring the infiltration of dreams."),
            zh = LocalizedContent("哪位导演创作了《盗梦空间》？", listOf("丹尼斯·维伦纽瓦", "克里斯托弗·诺兰", "雷德利·斯科特", "大卫·芬奇"), "电影", "克里斯托弗·诺兰编剧并执导了2010年上映的《盗梦空间》，这是一部探索梦境入侵的科幻电影。"),
            es = LocalizedContent("¿Qué director creó 'Inception'?", listOf("Denis Villeneuve", "Christopher Nolan", "Ridley Scott", "David Fincher"), "Cine", "Christopher Nolan escribió y dirigió Inception, estrenada en 2010, una película de ciencia ficción que explora la infiltración de los sueños.")
        ),
        BilingualQuestion(
            id = 50087, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel rappeur a créé 'Lose Yourself'?", listOf("50 Cent", "Eminem", "Dr. Dre", "Snoop Dogg"), "Musique", "Eminem a écrit et interprété 'Lose Yourself' pour la bande originale du film '8 Mile' (2002), où il joue le rôle principal. La chanson a remporté l'Oscar de la meilleure chanson originale."),
            en = LocalizedContent("Which rapper created 'Lose Yourself'?", listOf("50 Cent", "Eminem", "Dr. Dre", "Snoop Dogg"), "Music", "Eminem wrote and performed 'Lose Yourself' for the soundtrack of the film '8 Mile' (2002), in which he played the lead role. The song won the Oscar for Best Original Song."),
            zh = LocalizedContent("哪位说唱歌手创作了《Lose Yourself》？", listOf("50 Cent", "埃米纳姆", "Dr. Dre", "史努比·狗狗"), "音乐", "埃米纳姆为电影《8英里》（2002年）的原声带创作并演唱了《Lose Yourself》，他在片中饰演主角。这首歌获得了奥斯卡最佳原创歌曲奖。"),
            es = LocalizedContent("¿Qué rapero creó 'Lose Yourself'?", listOf("50 Cent", "Eminem", "Dr. Dre", "Snoop Dogg"), "Musica", "Eminem escribió e interpretó 'Lose Yourself' para la banda sonora de la película '8 Mile' (2002), en la que interpretó el papel principal. La canción ganó el Oscar a la mejor canción original.")
        ),
        BilingualQuestion(
            id = 50088, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel empire a construit le Colosseum?", listOf("Empire Byzantin", "Empire Romain", "Empire Ottoman", "Empire Persan"), "Histoire", "Le Colosseum a été commandé par l'empereur Vespasien de la dynastie flavienne et achevé sous son fils Titus, tous deux souverains de l'Empire romain."),
            en = LocalizedContent("Which empire built the Colosseum?", listOf("Byzantine Empire", "Roman Empire", "Ottoman Empire", "Persian Empire"), "History", "The Colosseum was commissioned by Emperor Vespasian of the Flavian dynasty and completed under his son Titus, both rulers of the Roman Empire."),
            zh = LocalizedContent("哪个帝国建造了罗马斗兽场？", listOf("拜占庭帝国", "罗马帝国", "奥斯曼帝国", "波斯帝国"), "历史", "罗马斗兽场由弗拉维王朝的皇帝韦斯巴芗下令建造，并在其子提图斯统治下完工，两人都是罗马帝国的统治者。"),
            es = LocalizedContent("¿Qué imperio construyó el Coliseo?", listOf("Imperio Bizantino", "Imperio Romano", "Imperio Otomano", "Imperio Persa"), "Historia", "El Coliseo fue encargado por el emperador Vespasiano de la dinastía Flavia y completado bajo su hijo Tito, ambos gobernantes del Imperio Romano.")
        ),
        BilingualQuestion(
            id = 50089, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel gaz les plantes absorbent-elles?", listOf("Oxygène", "Azote", "Dioxyde de carbone", "Hydrogène"), "Science", "Lors de la photosynthèse, les plantes absorbent le dioxyde de carbone (CO₂) présent dans l'air pour produire leur nourriture et libérer de l'oxygène."),
            en = LocalizedContent("Which gas do plants absorb?", listOf("Oxygen", "Nitrogen", "Carbon dioxide", "Hydrogen"), "Science", "During photosynthesis, plants absorb carbon dioxide (CO₂) from the air to produce their food and release oxygen."),
            zh = LocalizedContent("植物吸收哪种气体？", listOf("氧气", "氮气", "二氧化碳", "氢气"), "科学", "在光合作用过程中，植物吸收空气中的二氧化碳（CO₂）来制造食物并释放氧气。"),
            es = LocalizedContent("¿Qué gas absorben las plantas?", listOf("Oxígeno", "Nitrógeno", "Dióxido de carbono", "Hidrógeno"), "Ciencia", "Durante la fotosíntesis, las plantas absorben dióxido de carbono (CO₂) del aire para producir su alimento y liberar oxígeno.")
        ),
        BilingualQuestion(
            id = 50090, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a la plus grande forêt?", listOf("Canada", "Russie", "Brésil", "Indonesia"), "Géographie", "La forêt amazonienne, qui couvre une grande partie du Brésil, est la plus vaste forêt tropicale du monde."),
            en = LocalizedContent("Which country has the largest forest?", listOf("Canada", "Russia", "Brazil", "Indonesia"), "Geography", "The Amazon rainforest, which covers a large part of Brazil, is the largest tropical forest in the world."),
            zh = LocalizedContent("哪个国家拥有最大的森林？", listOf("加拿大", "俄罗斯", "巴西", "印度尼西亚"), "地理", "亚马逊雨林覆盖了巴西的大部分地区，是世界上最大的热带森林。"),
            es = LocalizedContent("¿Qué país tiene el bosque más grande?", listOf("Canadá", "Rusia", "Brasil", "Indonesia"), "Geografía", "La selva amazónica, que cubre gran parte de Brasil, es el bosque tropical más grande del mundo.")
        ),
        BilingualQuestion(
            id = 50091, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus haut temple hindou?", listOf("Taj Mahal", "Meenakshi", "Kailasanatha", "Konark Sun Temple"), "Culture", "Le temple Meenakshi, situé à Madurai en Inde, est célèbre pour ses neuf tours (gopurams) richement sculptées, dont la plus haute atteint environ 52 mètres, ce qui en fait le plus haut temple hindou."),
            en = LocalizedContent("What is the tallest Hindu temple?", listOf("Taj Mahal", "Meenakshi", "Kailasanatha", "Konark Sun Temple"), "Culture", "The Meenakshi Temple, located in Madurai, India, is famous for its nine richly sculpted towers (gopurams), the tallest of which reaches about 52 meters, making it the tallest Hindu temple."),
            zh = LocalizedContent("最高的印度教寺庙是什么？", listOf("泰姬陵", "米纳克希神庙", "凯拉萨纳塔神庙", "科纳克太阳神庙"), "文化", "位于印度马杜赖的米纳克希神庙以其九座雕刻精美的塔楼（gopurams）而闻名，其中最高的一座约52米，使其成为最高的印度教寺庙。"),
            es = LocalizedContent("¿Cuál es el templo hindú más alto?", listOf("Taj Mahal", "Meenakshi", "Kailasanatha", "Templo del Sol de Konark"), "Cultura", "El templo Meenakshi, ubicado en Madurai, India, es famoso por sus nueve torres (gopurams) ricamente esculpidas, la más alta de las cuales alcanza unos 52 metros, lo que lo convierte en el templo hindú más alto.")
        ),
        BilingualQuestion(
            id = 50092, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel cycliste français a remporté 7 Tours de France?", listOf("Eddy Merckx", "Fausto Coppi", "Lance Armstrong", "Bernard Hinault"), "Sport", "Lance Armstrong a remporté 7 Tours de France entre 1999 et 2005, mais ses titres ont été annulés en 2012 pour dopage."),
            en = LocalizedContent("Which French cyclist won 7 Tour de France titles?", listOf("Eddy Merckx", "Fausto Coppi", "Lance Armstrong", "Bernard Hinault"), "Sports", "Lance Armstrong won 7 Tour de France titles between 1999 and 2005, but his titles were annulled in 2012 for doping."),
            zh = LocalizedContent("哪位法国自行车手赢得了7次环法自行车赛冠军？", listOf("埃迪·默克斯", "福斯托·科皮", "兰斯·阿姆斯特朗", "贝尔纳·伊诺"), "体育", "兰斯·阿姆斯特朗在1999年至2005年间赢得了7次环法自行车赛冠军，但他的冠军头衔在2012年因兴奋剂问题被取消。"),
            es = LocalizedContent("¿Qué ciclista francés ganó 7 Tours de Francia?", listOf("Eddy Merckx", "Fausto Coppi", "Lance Armstrong", "Bernard Hinault"), "Deportes", "Lance Armstrong ganó 7 Tours de Francia entre 1999 y 2005, pero sus títulos fueron anulados en 2012 por dopaje.")
        ),
        BilingualQuestion(
            id = 50093, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film d'horreur met en vedette un homme dans un labyrinthe?", listOf("The Shining", "The Ring", "Insidious", "Paranormal Activity"), "Cinéma", "Dans The Shining, Jack Torrance poursuit son fils Danny dans le labyrinthe de l'hôtel Overlook, une scène emblématique du film de Stanley Kubrick."),
            en = LocalizedContent("Which horror movie features a man in a maze?", listOf("The Shining", "The Ring", "Insidious", "Paranormal Activity"), "Cinema", "In The Shining, Jack Torrance chases his son Danny through the maze of the Overlook Hotel, an iconic scene from Stanley Kubrick's film."),
            zh = LocalizedContent("哪部恐怖电影中有一个男人在迷宫里？", listOf("闪灵", "午夜凶铃", "潜伏", "灵动：鬼影实录"), "电影", "在《闪灵》中，杰克·托伦斯在瞭望酒店的迷宫中追赶他的儿子丹尼，这是斯坦利·库布里克电影中的标志性场景。"),
            es = LocalizedContent("¿Qué película de terror presenta a un hombre en un laberinto?", listOf("El resplandor", "La señal", "Insidious", "Actividad paranormal"), "Cine", "En El resplandor, Jack Torrance persigue a su hijo Danny por el laberinto del Hotel Overlook, una escena icónica de la película de Stanley Kubrick.")
        ),
        BilingualQuestion(
            id = 50094, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel chanteur a créé 'Purple Rain'?", listOf("Michael Jackson", "Prince", "David Bowie", "Freddie Mercury"), "Musique", "Prince a écrit et interprété 'Purple Rain' en 1984 pour l'album et le film du même nom, devenant l'un de ses titres emblématiques."),
            en = LocalizedContent("Which singer created 'Purple Rain'?", listOf("Michael Jackson", "Prince", "David Bowie", "Freddie Mercury"), "Music", "Prince wrote and performed 'Purple Rain' in 1984 for the album and film of the same name, becoming one of his signature songs."),
            zh = LocalizedContent("哪位歌手创作了《紫雨》？", listOf("迈克尔·杰克逊", "王子", "大卫·鲍伊", "弗雷迪·默丘里"), "音乐", "王子在1984年为同名专辑和电影创作并演唱了《紫雨》，成为他的标志性歌曲之一。"),
            es = LocalizedContent("¿Qué cantante creó 'Purple Rain'?", listOf("Michael Jackson", "Prince", "David Bowie", "Freddie Mercury"), "Música", "Prince escribió e interpretó 'Purple Rain' en 1984 para el álbum y la película del mismo nombre, convirtiéndose en una de sus canciones emblemáticas.")
        ),
        BilingualQuestion(
            id = 50095, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la Seconde Guerre mondiale s'est-elle terminée?", listOf("1943", "1944", "1945", "1946"), "Histoire", "La Seconde Guerre mondiale s'est achevée en 1945 avec la capitulation de l'Allemagne nazie en mai et celle du Japon en septembre, après les bombardements atomiques d'Hiroshima et Nagasaki."),
            en = LocalizedContent("In which year did World War II end?", listOf("1943", "1944", "1945", "1946"), "History", "World War II ended in 1945 with the surrender of Nazi Germany in May and Japan in September, following the atomic bombings of Hiroshima and Nagasaki."),
            zh = LocalizedContent("第二次世界大战在哪一年结束？", listOf("1943", "1944", "1945", "1946"), "历史", "第二次世界大战于1945年结束，纳粹德国在5月投降，日本在9月投降，此前广岛和长崎遭受了原子弹轰炸。"),
            es = LocalizedContent("¿En qué año terminó la Segunda Guerra Mundial?", listOf("1943", "1944", "1945", "1946"), "Historia", "La Segunda Guerra Mundial terminó en 1945 con la rendición de la Alemania nazi en mayo y la de Japón en septiembre, tras los bombardeos atómicos de Hiroshima y Nagasaki.")
        ),
        BilingualQuestion(
            id = 50096, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus petit oiseau du monde?", listOf("Moineau", "Colibri", "Roitelet", "Troglodyte"), "Science", "Le colibri, et plus précisément le colibri d'Elena, mesure environ 5 centimètres et pèse moins de 2 grammes, ce qui en fait le plus petit oiseau connu."),
            en = LocalizedContent("What is the smallest bird in the world?", listOf("Sparrow", "Hummingbird", "Goldcrest", "Wren"), "Science", "The hummingbird, specifically the bee hummingbird, measures about 5 centimeters and weighs less than 2 grams, making it the smallest known bird."),
            zh = LocalizedContent("世界上最小的鸟是什么？", listOf("麻雀", "蜂鸟", "戴菊", "鹪鹩"), "科学", "蜂鸟，特别是吸蜜蜂鸟，长约5厘米，重不到2克，是已知最小的鸟类。"),
            es = LocalizedContent("¿Cuál es el ave más pequeña del mundo?", listOf("Gorrión", "Colibrí", "Reyezuelo", "Chochín"), "Ciencia", "El colibrí, específicamente el colibrí zunzuncito, mide unos 5 centímetros y pesa menos de 2 gramos, lo que lo convierte en el ave más pequeña conocida.")
        ),
        BilingualQuestion(
            id = 50097, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand désert non polaire?", listOf("Arabique", "Sahara", "Gobi", "Atacama"), "Géographie", "Le Sahara s'étend sur environ 9,2 millions de kilomètres carrés en Afrique du Nord, ce qui en fait le plus vaste désert chaud du monde, loin devant les autres déserts non polaires."),
            en = LocalizedContent("What is the largest non-polar desert?", listOf("Arabian", "Sahara", "Gobi", "Atacama"), "Geography", "The Sahara covers about 9.2 million square kilometers in North Africa, making it the largest hot desert in the world, far ahead of other non-polar deserts."),
            zh = LocalizedContent("最大的非极地沙漠是什么？", listOf("阿拉伯沙漠", "撒哈拉沙漠", "戈壁沙漠", "阿塔卡马沙漠"), "地理", "撒哈拉沙漠覆盖北非约920万平方公里，是世界上最大的热带沙漠，远超其他非极地沙漠。"),
            es = LocalizedContent("¿Cuál es el desierto no polar más grande?", listOf("Arábigo", "Sahara", "Gobi", "Atacama"), "Geografía", "El Sahara cubre aproximadamente 9,2 millones de kilómetros cuadrados en el norte de África, lo que lo convierte en el desierto cálido más grande del mundo, muy por delante de otros desiertos no polares.")
        ),
        BilingualQuestion(
            id = 50098, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le festival film le plus prestigieux?", listOf("Venise", "Berlin", "Cannes", "San Sebastián"), "Culture", "Le Festival de Cannes est considéré comme le plus prestigieux en raison de son histoire, de son glamour et de son influence sur le cinéma mondial depuis 1946."),
            en = LocalizedContent("What is the most prestigious film festival?", listOf("Venice", "Berlin", "Cannes", "San Sebastián"), "Culture", "The Cannes Film Festival is considered the most prestigious due to its history, glamour, and influence on world cinema since 1946."),
            zh = LocalizedContent("最负盛名的电影节是什么？", listOf("威尼斯", "柏林", "戛纳", "圣塞巴斯蒂安"), "文化", "戛纳电影节因其历史、魅力和自1946年以来对世界电影的影响而被认为是最负盛名的。"),
            es = LocalizedContent("¿Cuál es el festival de cine más prestigioso?", listOf("Venecia", "Berlín", "Cannes", "San Sebastián"), "Cultura", "El Festival de Cannes es considerado el más prestigioso por su historia, glamour e influencia en el cine mundial desde 1946.")
        ),
        BilingualQuestion(
            id = 50099, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel athlète a remporté le titre de 'Homme le plus fort du monde' plusieurs fois?", listOf("Hafthor Björnsson", "Eddie Hall", "Zydrunas Savickas", "Brian Shaw"), "Sport", "Zydrunas Savickas a remporté le titre d'Homme le plus fort du monde à quatre reprises (2009, 2010, 2012, 2014), ce qui fait de lui l'un des compétiteurs les plus titrés de l'histoire de cette compétition."),
            en = LocalizedContent("Which athlete has won the title of 'World's Strongest Man' multiple times?", listOf("Hafthor Björnsson", "Eddie Hall", "Zydrunas Savickas", "Brian Shaw"), "Sports", "Zydrunas Savickas has won the World's Strongest Man title four times (2009, 2010, 2012, 2014), making him one of the most decorated competitors in the history of the competition."),
            zh = LocalizedContent("哪位运动员多次获得“世界最强壮男人”称号？", listOf("哈夫索·比约恩松", "埃迪·霍尔", "日德鲁纳斯·萨维卡斯", "布莱恩·肖"), "体育", "日德鲁纳斯·萨维卡斯四次获得世界最强壮男人称号（2009、2010、2012、2014），使他成为该比赛历史上获奖最多的选手之一。"),
            es = LocalizedContent("¿Qué atleta ha ganado el título de 'Hombre más fuerte del mundo' varias veces?", listOf("Hafthor Björnsson", "Eddie Hall", "Zydrunas Savickas", "Brian Shaw"), "Deportes", "Zydrunas Savickas ha ganado el título de Hombre más fuerte del mundo cuatro veces (2009, 2010, 2012, 2014), lo que lo convierte en uno de los competidores más condecorados en la historia de la competición.")
        ),
        BilingualQuestion(
            id = 50100, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de superhéros est sorti en 2018 et a remporté un succès majeur?", listOf("Black Panther", "Avengers Infinity War", "Aquaman", "Captain Marvel"), "Cinéma", "Black Panther, réalisé par Ryan Coogler, est sorti en 2018 et a été un phénomène culturel, devenant le premier film de superhéros nommé pour l'Oscar du meilleur film."),
            en = LocalizedContent("Which superhero movie was released in 2018 and achieved major success?", listOf("Black Panther", "Avengers: Infinity War", "Aquaman", "Captain Marvel"), "Cinema", "Black Panther, directed by Ryan Coogler, was released in 2018 and became a cultural phenomenon, becoming the first superhero film nominated for the Academy Award for Best Picture."),
            zh = LocalizedContent("哪部超级英雄电影于2018年上映并取得了巨大成功？", listOf("黑豹", "复仇者联盟3：无限战争", "海王", "惊奇队长"), "电影", "由瑞恩·库格勒执导的《黑豹》于2018年上映，成为一种文化现象，成为首部获得奥斯卡最佳影片提名的超级英雄电影。"),
            es = LocalizedContent("¿Qué película de superhéroes se estrenó en 2018 y logró un gran éxito?", listOf("Black Panther", "Avengers: Infinity War", "Aquaman", "Captain Marvel"), "Cine", "Black Panther, dirigida por Ryan Coogler, se estrenó en 2018 y se convirtió en un fenómeno cultural, siendo la primera película de superhéroes nominada al Premio de la Academia a la Mejor Película.")
        ),
        BilingualQuestion(
            id = 50101, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe de K-pop a créé 'Dynamite'?", listOf("EXO", "BTS", "Blackpink", "Twice"), "Musique", "BTS a sorti Dynamite en août 2020, leur premier single entièrement en anglais, qui est devenu un succès mondial et a atteint la première place du Billboard Hot 100."),
            en = LocalizedContent("Which K-pop group created 'Dynamite'?", listOf("EXO", "BTS", "Blackpink", "Twice"), "Music", "BTS released 'Dynamite' in August 2020, their first fully English single, which became a global hit and reached number one on the Billboard Hot 100."),
            zh = LocalizedContent("哪个K-pop组合创作了《Dynamite》？", listOf("EXO", "防弹少年团", "Blackpink", "Twice"), "音乐", "防弹少年团于2020年8月发行了《Dynamite》，这是他们的首支全英文单曲，成为全球热门歌曲并登顶公告牌百强单曲榜。"),
            es = LocalizedContent("¿Qué grupo de K-pop creó 'Dynamite'?", listOf("EXO", "BTS", "Blackpink", "Twice"), "Música", "BTS lanzó 'Dynamite' en agosto de 2020, su primer sencillo completamente en inglés, que se convirtió en un éxito mundial y alcanzó el número uno en el Billboard Hot 100.")
        ),
        BilingualQuestion(
            id = 50102, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe grec a fondé l'Académie d'Athènes?", listOf("Socrate", "Platon", "Aristote", "Héraclite"), "Histoire", "Platon a fondé l'Académie d'Athènes vers 387 av. J.-C., une école philosophique majeure de l'Antiquité."),
            en = LocalizedContent("Which Greek philosopher founded the Academy of Athens?", listOf("Socrates", "Plato", "Aristotle", "Heraclitus"), "History", "Plato founded the Academy of Athens around 387 BC, a major philosophical school of antiquity."),
            zh = LocalizedContent("哪位希腊哲学家创立了雅典学院？", listOf("苏格拉底", "柏拉图", "亚里士多德", "赫拉克利特"), "历史", "柏拉图于公元前387年左右创立了雅典学院，这是古代重要的哲学学派。"),
            es = LocalizedContent("¿Qué filósofo griego fundó la Academia de Atenas?", listOf("Sócrates", "Platón", "Aristóteles", "Heráclito"), "Historia", "Platón fundó la Academia de Atenas alrededor del 387 a.C., una importante escuela filosófica de la antigüedad.")
        ),
        BilingualQuestion(
            id = 50103, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de planètes y a-t-il dans notre système solaire?", listOf("7", "8", "9", "10"), "Science", "En 2006, l'Union astronomique internationale a reclassé Pluton comme planète naine, réduisant le nombre de planètes majeures du système solaire de neuf à huit."),
            en = LocalizedContent("How many planets are there in our solar system?", listOf("7", "8", "9", "10"), "Science", "In 2006, the International Astronomical Union reclassified Pluto as a dwarf planet, reducing the number of major planets in the solar system from nine to eight."),
            zh = LocalizedContent("我们的太阳系有多少颗行星？", listOf("7", "8", "9", "10"), "科学", "2006年，国际天文学联合会将冥王星重新归类为矮行星，将太阳系的主要行星数量从九颗减少到八颗。"),
            es = LocalizedContent("¿Cuántos planetas hay en nuestro sistema solar?", listOf("7", "8", "9", "10"), "Ciencia", "En 2006, la Unión Astronómica Internacional reclasificó a Plutón como planeta enano, reduciendo el número de planetas principales del sistema solar de nueve a ocho.")
        ),
        BilingualQuestion(
            id = 50104, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus d'îles?", listOf("Indonésie", "Suède", "Finlande", "Norvège"), "Géographie", "L'Indonésie est un archipel de plus de 17 000 îles, ce qui en fait le pays avec le plus d'îles au monde, devant des pays comme les Philippines ou la Suède."),
            en = LocalizedContent("Which country has the most islands?", listOf("Indonesia", "Sweden", "Finland", "Norway"), "Geography", "Indonesia is an archipelago of over 17,000 islands, making it the country with the most islands in the world, ahead of countries like the Philippines or Sweden."),
            zh = LocalizedContent("哪个国家的岛屿最多？", listOf("印度尼西亚", "瑞典", "芬兰", "挪威"), "地理", "印度尼西亚是一个由超过17000个岛屿组成的群岛，使其成为世界上岛屿最多的国家，领先于菲律宾或瑞典等国。"),
            es = LocalizedContent("¿Qué país tiene más islas?", listOf("Indonesia", "Suecia", "Finlandia", "Noruega"), "Geografía", "Indonesia es un archipiélago de más de 17,000 islas, lo que lo convierte en el país con más islas del mundo, por delante de países como Filipinas o Suecia.")
        ),
        BilingualQuestion(
            id = 50105, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien stade de football du monde?", listOf("Old Trafford", "Anfield", "Bramall Lane", "Manchester City Stadium"), "Culture", "Bramall Lane, situé à Sheffield en Angleterre, a ouvert en 1855 et accueille des matchs de football depuis 1862, ce qui en fait le plus ancien stade de football encore en activité."),
            en = LocalizedContent("What is the oldest football stadium in the world?", listOf("Old Trafford", "Anfield", "Bramall Lane", "Manchester City Stadium"), "Culture", "Bramall Lane, located in Sheffield, England, opened in 1855 and has hosted football matches since 1862, making it the oldest football stadium still in use."),
            zh = LocalizedContent("世界上最古老的足球场是哪个？", listOf("老特拉福德球场", "安菲尔德球场", "布拉莫巷球场", "曼彻斯特城球场"), "文化", "位于英格兰谢菲尔德的布拉莫巷球场于1855年开放，自1862年起举办足球比赛，是仍在使用的历史最悠久的足球场。"),
            es = LocalizedContent("¿Cuál es el estadio de fútbol más antiguo del mundo?", listOf("Old Trafford", "Anfield", "Bramall Lane", "Estadio del Manchester City"), "Cultura", "Bramall Lane, ubicado en Sheffield, Inglaterra, abrió en 1855 y ha albergado partidos de fútbol desde 1862, lo que lo convierte en el estadio de fútbol más antiguo aún en uso.")
        ),
        BilingualQuestion(
            id = 50106, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel nageur olympique a remporté le plus de médailles d'or?", listOf("Mark Spitz", "Gary Hall Jr.", "Michael Phelps", "Matt Biondi"), "Sport", "Michael Phelps détient le record du plus grand nombre de médailles d'or olympiques, avec 23 titres remportés entre 2004 et 2016, surpassant tous les autres nageurs."),
            en = LocalizedContent("Which Olympic swimmer has won the most gold medals?", listOf("Mark Spitz", "Gary Hall Jr.", "Michael Phelps", "Matt Biondi"), "Sports", "Michael Phelps holds the record for the most Olympic gold medals, with 23 titles won between 2004 and 2016, surpassing all other swimmers."),
            zh = LocalizedContent("哪位奥运游泳运动员获得的金牌最多？", listOf("马克·斯皮茨", "小加里·霍尔", "迈克尔·菲尔普斯", "马特·比昂迪"), "体育", "迈克尔·菲尔普斯保持着奥运会金牌最多的纪录，在2004年至2016年间共获得23枚金牌，超越了所有其他游泳运动员。"),
            es = LocalizedContent("¿Qué nadador olímpico ha ganado más medallas de oro?", listOf("Mark Spitz", "Gary Hall Jr.", "Michael Phelps", "Matt Biondi"), "Deportes", "Michael Phelps tiene el récord de la mayor cantidad de medallas de oro olímpicas, con 23 títulos ganados entre 2004 y 2016, superando a todos los demás nadadores.")
        ),
        BilingualQuestion(
            id = 50107, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur a joué Iron Man?", listOf("Tom Holland", "Robert Downey Jr.", "Mark Ruffalo", "Chris Evans"), "Cinéma", "Robert Downey Jr. a incarné Tony Stark, alias Iron Man, dans l'univers cinématographique Marvel de 2008 à 2019, un rôle qui a relancé sa carrière et défini le personnage au cinéma."),
            en = LocalizedContent("Which actor played Iron Man?", listOf("Tom Holland", "Robert Downey Jr.", "Mark Ruffalo", "Chris Evans"), "Cinema", "Robert Downey Jr. portrayed Tony Stark, aka Iron Man, in the Marvel Cinematic Universe from 2008 to 2019, a role that revived his career and defined the character on screen."),
            zh = LocalizedContent("哪位演员饰演了钢铁侠？", listOf("汤姆·赫兰德", "小罗伯特·唐尼", "马克·鲁弗洛", "克里斯·埃文斯"), "电影", "小罗伯特·唐尼在2008年至2019年的漫威电影宇宙中饰演托尼·斯塔克（钢铁侠），这个角色重振了他的职业生涯，并定义了该角色的银幕形象。"),
            es = LocalizedContent("¿Qué actor interpretó a Iron Man?", listOf("Tom Holland", "Robert Downey Jr.", "Mark Ruffalo", "Chris Evans"), "Cine", "Robert Downey Jr. interpretó a Tony Stark, alias Iron Man, en el Universo Cinematográfico de Marvel de 2008 a 2019, un papel que revitalizó su carrera y definió al personaje en la pantalla.")
        ),
        BilingualQuestion(
            id = 50108, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel chanteur a créé 'Bohemian Rhapsody'?", listOf("David Bowie", "Freddie Mercury", "Mick Jagger", "Roger Daltrey"), "Musique", "Freddie Mercury était le chanteur du groupe Queen, qui a sorti 'Bohemian Rhapsody' en 1975 sur l'album 'A Night at the Opera'."),
            en = LocalizedContent("Which singer created 'Bohemian Rhapsody'?", listOf("David Bowie", "Freddie Mercury", "Mick Jagger", "Roger Daltrey"), "Music", "Freddie Mercury was the lead singer of the band Queen, which released 'Bohemian Rhapsody' in 1975 on the album 'A Night at the Opera'."),
            zh = LocalizedContent("哪位歌手创作了《波西米亚狂想曲》？", listOf("大卫·鲍伊", "弗雷迪·默丘里", "米克·贾格尔", "罗杰·达尔特雷"), "音乐", "弗雷迪·默丘里是皇后乐队的主唱，该乐队于1975年在专辑《A Night at the Opera》中发行了《波西米亚狂想曲》。"),
            es = LocalizedContent("¿Qué cantante creó 'Bohemian Rhapsody'?", listOf("David Bowie", "Freddie Mercury", "Mick Jagger", "Roger Daltrey"), "Música", "Freddie Mercury fue el cantante principal de la banda Queen, que lanzó 'Bohemian Rhapsody' en 1975 en el álbum 'A Night at the Opera'.")
        ),
        BilingualQuestion(
            id = 50109, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la Révolution française a-t-elle commencé?", listOf("1787", "1788", "1789", "1790"), "Histoire", "La Révolution française débute en 1789 avec la convocation des États généraux, puis la prise de la Bastille le 14 juillet, marquant la fin de l'Ancien Régime."),
            en = LocalizedContent("In which year did the French Revolution begin?", listOf("1787", "1788", "1789", "1790"), "History", "The French Revolution began in 1789 with the convocation of the Estates-General, followed by the storming of the Bastille on July 14, marking the end of the Ancien Régime."),
            zh = LocalizedContent("法国大革命始于哪一年？", listOf("1787", "1788", "1789", "1790"), "历史", "法国大革命始于1789年，以三级会议的召开为开端，随后于7月14日攻占巴士底狱，标志着旧制度的终结。"),
            es = LocalizedContent("¿En qué año comenzó la Revolución Francesa?", listOf("1787", "1788", "1789", "1790"), "Historia", "La Revolución Francesa comenzó en 1789 con la convocatoria de los Estados Generales, seguida de la toma de la Bastilla el 14 de julio, marcando el fin del Antiguo Régimen.")
        ),
        BilingualQuestion(
            id = 50110, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand organe du système nerveux?", listOf("Cervelet", "Moelle épinière", "Cerveau", "Pont"), "Science", "Le cerveau est le plus grand organe du système nerveux, centralisant le contrôle des fonctions corporelles et cognitives."),
            en = LocalizedContent("What is the largest organ of the nervous system?", listOf("Cerebellum", "Spinal cord", "Brain", "Pons"), "Science", "The brain is the largest organ of the nervous system, centralizing control of bodily and cognitive functions."),
            zh = LocalizedContent("神经系统最大的器官是什么？", listOf("小脑", "脊髓", "大脑", "脑桥"), "科学", "大脑是神经系统最大的器官，集中控制身体和认知功能。"),
            es = LocalizedContent("¿Cuál es el órgano más grande del sistema nervioso?", listOf("Cerebelo", "Médula espinal", "Cerebro", "Puente"), "Ciencia", "El cerebro es el órgano más grande del sistema nervioso, centralizando el control de las funciones corporales y cognitivas.")
        ),
        BilingualQuestion(
            id = 50111, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel continent n'a pas de désert?", listOf("Antarctique", "Amérique du Nord", "Asie", "Europe"), "Géographie", "L'Europe est le seul continent sans désert aride, car son climat tempéré et ses précipitations régulières empêchent la formation de vastes zones désertiques."),
            en = LocalizedContent("Which continent has no desert?", listOf("Antarctica", "North America", "Asia", "Europe"), "Geography", "Europe is the only continent without an arid desert, as its temperate climate and regular precipitation prevent the formation of vast desert areas."),
            zh = LocalizedContent("哪个大洲没有沙漠？", listOf("南极洲", "北美洲", "亚洲", "欧洲"), "地理", "欧洲是唯一没有干旱沙漠的大洲，因其温带气候和规律降水阻止了广阔沙漠的形成。"),
            es = LocalizedContent("¿Qué continente no tiene desierto?", listOf("Antártida", "América del Norte", "Asia", "Europa"), "Geografía", "Europa es el único continente sin desierto árido, ya que su clima templado y precipitaciones regulares impiden la formación de vastas zonas desérticas.")
        ),
        BilingualQuestion(
            id = 50112, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel art martial japonais utilise les épées?", listOf("Karaté", "Aïkido", "Judo", "Kendô"), "Culture", "Le kendô est un art martial japonais moderne qui utilise des sabres en bambou (shinai) et des armures (bogu), dérivé des techniques de combat des samouraïs."),
            en = LocalizedContent("Which Japanese martial art uses swords?", listOf("Karate", "Aikido", "Judo", "Kendo"), "Culture", "Kendo is a modern Japanese martial art that uses bamboo swords (shinai) and armor (bogu), derived from samurai combat techniques."),
            zh = LocalizedContent("哪种日本武术使用剑？", listOf("空手道", "合气道", "柔道", "剑道"), "文化", "剑道是一种现代日本武术，使用竹刀（shinai）和护具（bogu），源自武士战斗技巧。"),
            es = LocalizedContent("¿Qué arte marcial japonés utiliza espadas?", listOf("Kárate", "Aikido", "Judo", "Kendo"), "Cultura", "El kendo es un arte marcial japonés moderno que utiliza espadas de bambú (shinai) y armaduras (bogu), derivado de las técnicas de combate de los samuráis.")
        ),
        BilingualQuestion(
            id = 50113, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel tenniseur a remporté 20 titres du Grand Slam?", listOf("Novak Djokovic", "Rafael Nadal", "Roger Federer", "Pete Sampras"), "Sport", "Roger Federer a détenu le record de 20 titres du Grand Chelem chez les hommes jusqu'en 2022, avant d'être dépassé par Rafael Nadal et Novak Djokovic."),
            en = LocalizedContent("Which tennis player has won 20 Grand Slam titles?", listOf("Novak Djokovic", "Rafael Nadal", "Roger Federer", "Pete Sampras"), "Sports", "Roger Federer held the record of 20 Grand Slam titles in men's tennis until 2022, when he was surpassed by Rafael Nadal and Novak Djokovic."),
            zh = LocalizedContent("哪位网球运动员赢得了20个大满贯冠军？", listOf("诺瓦克·德约科维奇", "拉斐尔·纳达尔", "罗杰·费德勒", "皮特·桑普拉斯"), "体育", "罗杰·费德勒在男子网球中保持20个大满贯冠军的纪录，直到2022年被拉斐尔·纳达尔和诺瓦克·德约科维奇超越。"),
            es = LocalizedContent("¿Qué tenista ha ganado 20 títulos de Grand Slam?", listOf("Novak Djokovic", "Rafael Nadal", "Roger Federer", "Pete Sampras"), "Deportes", "Roger Federer ostentó el récord de 20 títulos de Grand Slam en tenis masculino hasta 2022, cuando fue superado por Rafael Nadal y Novak Djokovic.")
        ),
        BilingualQuestion(
            id = 50114, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a créé 'Parasite'?", listOf("Park Chan-wook", "Bong Joon-ho", "Lee Ang", "Kim Ki-duk"), "Cinéma", "Bong Joon-ho est le réalisateur sud-coréen du film 'Parasite', qui a remporté la Palme d'Or à Cannes en 2019 et l'Oscar du meilleur film en 2020."),
            en = LocalizedContent("Which director created 'Parasite'?", listOf("Park Chan-wook", "Bong Joon-ho", "Ang Lee", "Kim Ki-duk"), "Cinema", "Bong Joon-ho is the South Korean director of the film 'Parasite', which won the Palme d'Or at Cannes in 2019 and the Oscar for Best Picture in 2020."),
            zh = LocalizedContent("哪位导演创作了《寄生虫》？", listOf("朴赞郁", "奉俊昊", "李安", "金基德"), "电影", "奉俊昊是电影《寄生虫》的韩国导演，该片在2019年戛纳电影节获得金棕榈奖，并在2020年获得奥斯卡最佳影片奖。"),
            es = LocalizedContent("¿Qué director creó 'Parásitos'?", listOf("Park Chan-wook", "Bong Joon-ho", "Ang Lee", "Kim Ki-duk"), "Cine", "Bong Joon-ho es el director surcoreano de la película 'Parásitos', que ganó la Palma de Oro en Cannes en 2019 y el Oscar a la mejor película en 2020.")
        ),
        BilingualQuestion(
            id = 50115, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur a écrit 'La Marche des Travailleurs'?", listOf("Rouget de Lisle", "Camille Saint-Saëns", "Gabriel Fauré", "Jules Massenet"), "Musique", "Rouget de Lisle, surtout connu pour La Marseillaise, a également composé La Marche des Travailleurs en 1792, un chant révolutionnaire dédié aux ouvriers."),
            en = LocalizedContent("Which composer wrote 'The Workers' March'?", listOf("Rouget de Lisle", "Camille Saint-Saëns", "Gabriel Fauré", "Jules Massenet"), "Music", "Rouget de Lisle, best known for La Marseillaise, also composed The Workers' March in 1792, a revolutionary song dedicated to workers."),
            zh = LocalizedContent("哪位作曲家创作了《工人进行曲》？", listOf("鲁热·德·利尔", "卡米耶·圣桑", "加布里埃尔·福雷", "朱尔·马斯内"), "音乐", "鲁热·德·利尔以《马赛曲》闻名，他还在1792年创作了《工人进行曲》，这是一首献给工人的革命歌曲。"),
            es = LocalizedContent("¿Qué compositor escribió 'La Marcha de los Trabajadores'?", listOf("Rouget de Lisle", "Camille Saint-Saëns", "Gabriel Fauré", "Jules Massenet"), "Música", "Rouget de Lisle, conocido por La Marsellesa, también compuso La Marcha de los Trabajadores en 1792, una canción revolucionaria dedicada a los obreros.")
        ),
        BilingualQuestion(
            id = 50116, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel général français a remporté la bataille de Valmy?", listOf("Murat", "Ney", "Dumouriez", "Beauharnais"), "Histoire", "La bataille de Valmy, le 20 septembre 1792, fut une victoire décisive des armées révolutionnaires françaises contre les Prussiens, commandée par le général Dumouriez."),
            en = LocalizedContent("Which French general won the Battle of Valmy?", listOf("Murat", "Ney", "Dumouriez", "Beauharnais"), "History", "The Battle of Valmy, on September 20, 1792, was a decisive victory of the French revolutionary armies against the Prussians, commanded by General Dumouriez."),
            zh = LocalizedContent("哪位法国将军赢得了瓦尔密战役？", listOf("缪拉", "内伊", "迪穆里埃", "博阿尔内"), "历史", "1792年9月20日的瓦尔密战役是法国革命军对普鲁士的决定性胜利，由迪穆里埃将军指挥。"),
            es = LocalizedContent("¿Qué general francés ganó la batalla de Valmy?", listOf("Murat", "Ney", "Dumouriez", "Beauharnais"), "Historia", "La batalla de Valmy, el 20 de septiembre de 1792, fue una victoria decisiva de los ejércitos revolucionarios franceses contra los prusianos, comandada por el general Dumouriez.")
        ),
        BilingualQuestion(
            id = 50117, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus dur matériau naturel?", listOf("Quartz", "Diamant", "Corindon", "Feldspath"), "Science", "Le diamant est composé de carbone pur cristallisé sous haute pression et haute température dans le manteau terrestre, ce qui lui confère une dureté maximale sur l'échelle de Mohs (10)."),
            en = LocalizedContent("What is the hardest natural material?", listOf("Quartz", "Diamond", "Corundum", "Feldspar"), "Science", "Diamond is composed of pure carbon crystallized under high pressure and high temperature in the Earth's mantle, giving it maximum hardness on the Mohs scale (10)."),
            zh = LocalizedContent("最硬的天然材料是什么？", listOf("石英", "钻石", "刚玉", "长石"), "科学", "钻石由纯碳在地幔高压高温下结晶而成，在莫氏硬度标度上达到最高硬度（10）。"),
            es = LocalizedContent("¿Cuál es el material natural más duro?", listOf("Cuarzo", "Diamante", "Corindón", "Feldespato"), "Ciencia", "El diamante está compuesto de carbono puro cristalizado bajo alta presión y alta temperatura en el manto terrestre, lo que le confiere la máxima dureza en la escala de Mohs (10).")
        ),
        BilingualQuestion(
            id = 50118, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a le plus de volcans actifs?", listOf("Japon", "Indonésie", "Philippines", "Mexique"), "Géographie", "L'Indonésie se trouve sur la ceinture de feu du Pacifique, une zone de forte activité tectonique, et compte plus de 130 volcans actifs, soit le plus grand nombre au monde."),
            en = LocalizedContent("Which country has the most active volcanoes?", listOf("Japan", "Indonesia", "Philippines", "Mexico"), "Geography", "Indonesia lies on the Pacific Ring of Fire, an area of high tectonic activity, and has over 130 active volcanoes, the highest number in the world."),
            zh = LocalizedContent("哪个国家拥有最多的活火山？", listOf("日本", "印度尼西亚", "菲律宾", "墨西哥"), "地理", "印度尼西亚位于太平洋火山带上，这是一个构造活动强烈的区域，拥有超过130座活火山，数量居世界之首。"),
            es = LocalizedContent("¿Qué país tiene más volcanes activos?", listOf("Japón", "Indonesia", "Filipinas", "México"), "Geografía", "Indonesia se encuentra en el Cinturón de Fuego del Pacífico, una zona de alta actividad tectónica, y cuenta con más de 130 volcanes activos, el mayor número del mundo.")
        ),
        BilingualQuestion(
            id = 50119, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel instrument a créé la musique indienne classique?", listOf("Sitar", "Sarod", "Tabla", "Bansuri"), "Culture", "Le sitar est l'instrument emblématique de la musique classique indienne, popularisé par des maîtres comme Ravi Shankar. Il incarne les traditions raga et tala de cette musique."),
            en = LocalizedContent("Which instrument created Indian classical music?", listOf("Sitar", "Sarod", "Tabla", "Bansuri"), "Culture", "The sitar is the emblematic instrument of Indian classical music, popularized by masters like Ravi Shankar. It embodies the raga and tala traditions of this music."),
            zh = LocalizedContent("哪种乐器创造了印度古典音乐？", listOf("西塔琴", "萨罗德琴", "塔布拉鼓", "班苏里笛"), "文化", "西塔琴是印度古典音乐的代表性乐器，由拉维·香卡等大师推广。它体现了这种音乐的拉格和塔拉传统。"),
            es = LocalizedContent("¿Qué instrumento creó la música clásica india?", listOf("Sitar", "Sarod", "Tabla", "Bansuri"), "Cultura", "El sitar es el instrumento emblemático de la música clásica india, popularizado por maestros como Ravi Shankar. Encarna las tradiciones raga y tala de esta música.")
        ),
    )

    private fun part2(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 50120, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel athlète a remporté quatre titres olympiques en athlétisme?", listOf("Jesse Owens", "Carl Lewis", "Usain Bolt", "Michael Johnson"), "Sport", "Jesse Owens a remporté quatre médailles d'or aux Jeux olympiques de Berlin en 1936, sur 100 mètres, 200 mètres, saut en longueur et relais 4x100 mètres."),
            en = LocalizedContent("Which athlete won four Olympic titles in athletics?", listOf("Jesse Owens", "Carl Lewis", "Usain Bolt", "Michael Johnson"), "Sports", "Jesse Owens won four gold medals at the 1936 Berlin Olympics in the 100 meters, 200 meters, long jump, and 4x100 meter relay."),
            zh = LocalizedContent("哪位运动员在田径项目中赢得了四个奥运冠军？", listOf("杰西·欧文斯", "卡尔·刘易斯", "尤塞恩·博尔特", "迈克尔·约翰逊"), "体育", "杰西·欧文斯在1936年柏林奥运会上赢得了100米、200米、跳远和4x100米接力四枚金牌。"),
            es = LocalizedContent("¿Qué atleta ganó cuatro títulos olímpicos en atletismo?", listOf("Jesse Owens", "Carl Lewis", "Usain Bolt", "Michael Johnson"), "Deportes", "Jesse Owens ganó cuatro medallas de oro en los Juegos Olímpicos de Berlín de 1936 en 100 metros, 200 metros, salto de longitud y relevo 4x100 metros.")
        ),
        BilingualQuestion(
            id = 50121, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de fantaisie met en vedette un garçon avec une cicatrice en forme d'éclair?", listOf("Percy Jackson", "Harry Potter", "Twilight", "The Hunger Games"), "Cinéma", "Harry Potter est le personnage principal de la saga éponyme, reconnaissable à sa cicatrice en forme d'éclair, héritée de sa confrontation avec Voldemort."),
            en = LocalizedContent("Which fantasy film features a boy with a lightning-shaped scar?", listOf("Percy Jackson", "Harry Potter", "Twilight", "The Hunger Games"), "Cinema", "Harry Potter is the main character of the eponymous saga, recognizable by his lightning-shaped scar, inherited from his confrontation with Voldemort."),
            zh = LocalizedContent("哪部奇幻电影的主角是一个带有闪电形伤疤的男孩？", listOf("波西·杰克逊", "哈利·波特", "暮光之城", "饥饿游戏"), "电影", "哈利·波特是同名系列电影的主角，他因与伏地魔的对抗而留下闪电形伤疤，极具辨识度。"),
            es = LocalizedContent("¿Qué película de fantasía presenta a un niño con una cicatriz en forma de rayo?", listOf("Percy Jackson", "Harry Potter", "Crepúsculo", "Los juegos del hambre"), "Cine", "Harry Potter es el personaje principal de la saga homónima, reconocible por su cicatriz en forma de rayo, heredada de su enfrentamiento con Voldemort.")
        ),
        BilingualQuestion(
            id = 50122, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel chanteur a créé 'Imagine'?", listOf("George Harrison", "Ringo Starr", "John Lennon", "Paul McCartney"), "Musique", "John Lennon a écrit et interprété 'Imagine' en 1971, une chanson devenue un hymne pour la paix dans le monde."),
            en = LocalizedContent("Which singer created 'Imagine'?", listOf("George Harrison", "Ringo Starr", "John Lennon", "Paul McCartney"), "Music", "John Lennon wrote and performed 'Imagine' in 1971, a song that became an anthem for world peace."),
            zh = LocalizedContent("哪位歌手创作了《Imagine》？", listOf("乔治·哈里森", "林戈·斯塔尔", "约翰·列侬", "保罗·麦卡特尼"), "音乐", "约翰·列侬于1971年创作并演唱了《Imagine》，这首歌成为世界和平的颂歌。"),
            es = LocalizedContent("¿Qué cantante creó 'Imagine'?", listOf("George Harrison", "Ringo Starr", "John Lennon", "Paul McCartney"), "Música", "John Lennon escribió e interpretó 'Imagine' en 1971, una canción que se convirtió en un himno por la paz mundial.")
        ),
        BilingualQuestion(
            id = 50123, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année l'Homme a-t-il marché sur la Lune?", listOf("1967", "1968", "1969", "1970"), "Histoire", "La mission Apollo 11 de la NASA a aluné le 20 juillet 1969, avec Neil Armstrong et Buzz Aldrin devenant les premiers humains à marcher sur la Lune."),
            en = LocalizedContent("In which year did man walk on the Moon?", listOf("1967", "1968", "1969", "1970"), "History", "NASA's Apollo 11 mission landed on the Moon on July 20, 1969, with Neil Armstrong and Buzz Aldrin becoming the first humans to walk on the Moon."),
            zh = LocalizedContent("人类在哪一年登上了月球？", listOf("1967", "1968", "1969", "1970"), "历史", "美国宇航局的阿波罗11号任务于1969年7月20日登陆月球，尼尔·阿姆斯特朗和巴兹·奥尔德林成为首批在月球上行走的人类。"),
            es = LocalizedContent("¿En qué año el hombre caminó sobre la Luna?", listOf("1967", "1968", "1969", "1970"), "Historia", "La misión Apolo 11 de la NASA alunizó el 20 de julio de 1969, con Neil Armstrong y Buzz Aldrin convirtiéndose en los primeros humanos en caminar sobre la Luna.")
        ),
        BilingualQuestion(
            id = 50124, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand prédateur marin?", listOf("Grand blanc", "Tigre de la mer", "Baleine épaulard", "Poulpe géant"), "Science", "L'orque, ou baleine épaulard, est le plus grand prédateur marin car elle se nourrit de mammifères marins comme les phoques et même les baleines."),
            en = LocalizedContent("What is the largest marine predator?", listOf("Great white shark", "Tiger shark", "Killer whale", "Giant octopus"), "Science", "The killer whale, or orca, is the largest marine predator as it feeds on marine mammals like seals and even whales."),
            zh = LocalizedContent("最大的海洋捕食者是什么？", listOf("大白鲨", "虎鲨", "虎鲸", "巨型章鱼"), "科学", "虎鲸是最大的海洋捕食者，它以海豹甚至鲸鱼等海洋哺乳动物为食。"),
            es = LocalizedContent("¿Cuál es el mayor depredador marino?", listOf("Tiburón blanco", "Tiburón tigre", "Orca", "Pulpo gigante"), "Ciencia", "La orca es el mayor depredador marino, ya que se alimenta de mamíferos marinos como focas e incluso ballenas.")
        ),
        BilingualQuestion(
            id = 50125, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le fleuve le plus long d'Asie?", listOf("Mékong", "Fleuve Jaune", "Yangtze", "Brahmapoutre"), "Géographie", "Le Yangtze, long de 6 300 km, traverse la Chine du Tibet à la mer de Chine orientale, ce qui en fait le plus long fleuve d'Asie et le troisième au monde."),
            en = LocalizedContent("What is the longest river in Asia?", listOf("Mekong", "Yellow River", "Yangtze", "Brahmaputra"), "Geography", "The Yangtze, 6,300 km long, flows through China from Tibet to the East China Sea, making it the longest river in Asia and the third longest in the world."),
            zh = LocalizedContent("亚洲最长的河流是什么？", listOf("湄公河", "黄河", "长江", "雅鲁藏布江"), "地理", "长江全长6300公里，从西藏流经中国至东海，是亚洲最长的河流，世界第三长。"),
            es = LocalizedContent("¿Cuál es el río más largo de Asia?", listOf("Mekong", "Río Amarillo", "Yangtsé", "Brahmaputra"), "Geografía", "El Yangtsé, de 6.300 km de longitud, atraviesa China desde el Tíbet hasta el mar de China Oriental, lo que lo convierte en el río más largo de Asia y el tercero del mundo.")
        ),
        BilingualQuestion(
            id = 50126, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien musée du Louvre?", listOf("Denon", "Richelieu", "Sully", "Marsan"), "Culture", "L'aile Sully est la partie la plus ancienne du palais du Louvre, construite sous le règne d'Henri IV et nommée d'après son ministre Sully."),
            en = LocalizedContent("What is the oldest wing of the Louvre Museum?", listOf("Denon", "Richelieu", "Sully", "Marsan"), "Culture", "The Sully wing is the oldest part of the Louvre Palace, built under the reign of Henry IV and named after his minister Sully."),
            zh = LocalizedContent("卢浮宫最古老的侧翼是哪个？", listOf("德农", "黎塞留", "叙利", "马尔桑"), "文化", "叙利侧翼是卢浮宫最古老的部分，建于亨利四世统治时期，以其大臣叙利的名字命名。"),
            es = LocalizedContent("¿Cuál es el ala más antigua del Museo del Louvre?", listOf("Denon", "Richelieu", "Sully", "Marsan"), "Cultura", "El ala Sully es la parte más antigua del palacio del Louvre, construida bajo el reinado de Enrique IV y nombrada en honor a su ministro Sully.")
        ),
        BilingualQuestion(
            id = 50127, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel golfeur a remporté le Masters d'Augusta en 2023?", listOf("Rory McIlroy", "Scottie Scheffler", "Tiger Woods", "Dustin Johnson"), "Sport", "Scottie Scheffler a remporté le Masters d'Augusta en 2023, son deuxième titre majeur après le Masters 2022."),
            en = LocalizedContent("Which golfer won the Masters at Augusta in 2023?", listOf("Rory McIlroy", "Scottie Scheffler", "Tiger Woods", "Dustin Johnson"), "Sports", "Scottie Scheffler won the Masters at Augusta in 2023, his second major title after the 2022 Masters."),
            zh = LocalizedContent("哪位高尔夫球手在2023年赢得了奥古斯塔大师赛？", listOf("罗里·麦克罗伊", "斯科蒂·舍夫勒", "泰格·伍兹", "达斯汀·约翰逊"), "体育", "斯科蒂·舍夫勒在2023年赢得了奥古斯塔大师赛，这是他继2022年大师赛后的第二个大满贯冠军。"),
            es = LocalizedContent("¿Qué golfista ganó el Masters de Augusta en 2023?", listOf("Rory McIlroy", "Scottie Scheffler", "Tiger Woods", "Dustin Johnson"), "Deportes", "Scottie Scheffler ganó el Masters de Augusta en 2023, su segundo título importante después del Masters de 2022.")
        ),
        BilingualQuestion(
            id = 50128, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a créé 'Amélie'?", listOf("Jean-Pierre Jeunet", "Bong Joon-ho", "Park Chan-wook", "Luc Besson"), "Cinéma", "Jean-Pierre Jeunet a réalisé \"Le Fabuleux Destin d'Amélie Poulain\" en 2001, un film emblématique du cinéma français."),
            en = LocalizedContent("Which director created 'Amélie'?", listOf("Jean-Pierre Jeunet", "Bong Joon-ho", "Park Chan-wook", "Luc Besson"), "Cinema", "Jean-Pierre Jeunet directed 'Amélie' (original title: Le Fabuleux Destin d'Amélie Poulain) in 2001, an iconic film of French cinema."),
            zh = LocalizedContent("哪位导演创作了《天使爱美丽》？", listOf("让-皮埃尔·热内", "奉俊昊", "朴赞郁", "吕克·贝松"), "电影", "让-皮埃尔·热内在2001年执导了《天使爱美丽》（原名《艾米莉·普兰的奇妙命运》），这是法国电影的一部标志性作品。"),
            es = LocalizedContent("¿Qué director creó 'Amélie'?", listOf("Jean-Pierre Jeunet", "Bong Joon-ho", "Park Chan-wook", "Luc Besson"), "Cine", "Jean-Pierre Jeunet dirigió 'Amélie' (título original: Le Fabuleux Destin d'Amélie Poulain) en 2001, una película emblemática del cine francés.")
        ),
        BilingualQuestion(
            id = 50129, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe de rock a créé 'Another One Bites the Dust'?", listOf("The Rolling Stones", "Queen", "Led Zeppelin", "Pink Floyd"), "Musique", "Queen a sorti 'Another One Bites the Dust' en 1980 sur l'album 'The Game', et la chanson est devenue l'un de leurs plus grands succès grâce à sa ligne de basse funk."),
            en = LocalizedContent("Which rock band created 'Another One Bites the Dust'?", listOf("The Rolling Stones", "Queen", "Led Zeppelin", "Pink Floyd"), "Music", "Queen released 'Another One Bites the Dust' in 1980 on the album 'The Game', and the song became one of their biggest hits thanks to its funky bass line."),
            zh = LocalizedContent("哪支摇滚乐队创作了《Another One Bites the Dust》？", listOf("滚石乐队", "皇后乐队", "齐柏林飞艇", "平克·弗洛伊德"), "音乐", "皇后乐队于1980年在专辑《The Game》中发行了《Another One Bites the Dust》，这首歌因其放克贝斯线而成为他们最热门的歌曲之一。"),
            es = LocalizedContent("¿Qué banda de rock creó 'Another One Bites the Dust'?", listOf("The Rolling Stones", "Queen", "Led Zeppelin", "Pink Floyd"), "Música", "Queen lanzó 'Another One Bites the Dust' en 1980 en el álbum 'The Game', y la canción se convirtió en uno de sus mayores éxitos gracias a su línea de bajo funk.")
        ),
        BilingualQuestion(
            id = 50130, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel royaume a été le centre de la Renaissance?", listOf("Venise", "Florence", "Rome", "Milan"), "Histoire", "Florence, sous la domination des Médicis, fut le berceau de la Renaissance italienne grâce à son mécénat artistique et son essor intellectuel aux XVe et XVIe siècles."),
            en = LocalizedContent("Which kingdom was the center of the Renaissance?", listOf("Venice", "Florence", "Rome", "Milan"), "History", "Florence, under the Medici rule, was the cradle of the Italian Renaissance due to its artistic patronage and intellectual flourishing in the 15th and 16th centuries."),
            zh = LocalizedContent("哪个王国是文艺复兴的中心？", listOf("威尼斯", "佛罗伦萨", "罗马", "米兰"), "历史", "佛罗伦萨在美第奇家族的统治下，凭借其艺术赞助和15、16世纪的知识繁荣，成为意大利文艺复兴的摇篮。"),
            es = LocalizedContent("¿Qué reino fue el centro del Renacimiento?", listOf("Venecia", "Florencia", "Roma", "Milán"), "Historia", "Florencia, bajo el dominio de los Médici, fue la cuna del Renacimiento italiano gracias a su mecenazgo artístico y su auge intelectual en los siglos XV y XVI.")
        ),
        BilingualQuestion(
            id = 50131, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le processus par lequel les plantes produisent leur nourriture?", listOf("Respiration", "Photosynthèse", "Fermentation", "Dégradation"), "Science", "La photosynthèse utilise la lumière solaire, l'eau et le dioxyde de carbone pour synthétiser des sucres, fournissant l'énergie nécessaire à la croissance des plantes."),
            en = LocalizedContent("What is the process by which plants produce their food?", listOf("Respiration", "Photosynthesis", "Fermentation", "Decomposition"), "Science", "Photosynthesis uses sunlight, water, and carbon dioxide to synthesize sugars, providing the energy needed for plant growth."),
            zh = LocalizedContent("植物通过什么过程制造食物？", listOf("呼吸作用", "光合作用", "发酵", "分解"), "科学", "光合作用利用阳光、水和二氧化碳合成糖类，为植物生长提供所需能量。"),
            es = LocalizedContent("¿Cuál es el proceso por el cual las plantas producen su alimento?", listOf("Respiración", "Fotosíntesis", "Fermentación", "Descomposición"), "Ciencia", "La fotosíntesis utiliza la luz solar, el agua y el dióxido de carbono para sintetizar azúcares, proporcionando la energía necesaria para el crecimiento de las plantas.")
        ),
        BilingualQuestion(
            id = 50132, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac d'Asie?", listOf("Aral", "Baïkal", "Lop Nor", "Caspienne"), "Géographie", "La mer Caspienne est considérée comme le plus grand lac d'Asie et du monde, car elle est une étendue d'eau fermée, bien que souvent appelée mer en raison de sa taille et de sa salinité."),
            en = LocalizedContent("What is the largest lake in Asia?", listOf("Aral", "Baikal", "Lop Nor", "Caspian"), "Geography", "The Caspian Sea is considered the largest lake in Asia and the world, as it is a closed body of water, though often called a sea due to its size and salinity."),
            zh = LocalizedContent("亚洲最大的湖泊是哪个？", listOf("咸海", "贝加尔湖", "罗布泊", "里海"), "地理", "里海被认为是亚洲乃至世界上最大的湖泊，因为它是一个封闭的水体，尽管由于其大小和盐度常被称为海。"),
            es = LocalizedContent("¿Cuál es el lago más grande de Asia?", listOf("Aral", "Baikal", "Lop Nor", "Caspio"), "Geografía", "El mar Caspio es considerado el lago más grande de Asia y del mundo, ya que es una masa de agua cerrada, aunque a menudo se le llama mar debido a su tamaño y salinidad.")
        ),
        BilingualQuestion(
            id = 50133, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plat national de l'Espagne?", listOf("Gazpacho", "Paella", "Tortilla", "Chorizo"), "Culture", "La paella est originaire de la région de Valence, à base de riz, de safran et de divers ingrédients comme les fruits de mer ou le poulet. Elle est largement considérée comme le plat emblématique de la cuisine espagnole."),
            en = LocalizedContent("What is the national dish of Spain?", listOf("Gazpacho", "Paella", "Tortilla", "Chorizo"), "Culture", "Paella originates from the Valencia region, based on rice, saffron, and various ingredients like seafood or chicken. It is widely considered the emblematic dish of Spanish cuisine."),
            zh = LocalizedContent("西班牙的国菜是什么？", listOf("西班牙冷汤", "海鲜饭", "西班牙土豆饼", "西班牙香肠"), "文化", "海鲜饭起源于瓦伦西亚地区，以大米、藏红花和各种食材（如海鲜或鸡肉）为基础，被广泛认为是西班牙美食的代表菜肴。"),
            es = LocalizedContent("¿Cuál es el plato nacional de España?", listOf("Gazpacho", "Paella", "Tortilla", "Chorizo"), "Cultura", "La paella es originaria de la región de Valencia, a base de arroz, azafrán y diversos ingredientes como mariscos o pollo. Es ampliamente considerada el plato emblemático de la cocina española.")
        ),
        BilingualQuestion(
            id = 50134, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel boxeur a remporté le combat contre Floyd Mayweather en 2017?", listOf("Conor McGregor", "Manny Pacquiao", "Gennady Golovkin", "Canelo Alvarez"), "Sport", "Le combat de 2017 était un événement跨界 entre la boxe et le MMA, où le champion irlandais Conor McGregor a affronté Floyd Mayweather, mais ce dernier a remporté la victoire par TKO au dixième round."),
            en = LocalizedContent("Which boxer won the fight against Floyd Mayweather in 2017?", listOf("Conor McGregor", "Manny Pacquiao", "Gennady Golovkin", "Canelo Alvarez"), "Sports", "The 2017 fight was a crossover event between boxing and MMA, where Irish champion Conor McGregor faced Floyd Mayweather, but the latter won by TKO in the tenth round."),
            zh = LocalizedContent("哪位拳击手在2017年战胜了弗洛伊德·梅威瑟？", listOf("康纳·麦格雷戈", "曼尼·帕奎奥", "根纳季·戈洛夫金", "卡内洛·阿尔瓦雷斯"), "体育", "2017年的比赛是拳击和MMA的跨界赛事，爱尔兰冠军康纳·麦格雷戈对阵弗洛伊德·梅威瑟，但梅威瑟在第十回合以技术性击倒获胜。"),
            es = LocalizedContent("¿Qué boxeador ganó la pelea contra Floyd Mayweather en 2017?", listOf("Conor McGregor", "Manny Pacquiao", "Gennady Golovkin", "Canelo Álvarez"), "Deportes", "La pelea de 2017 fue un evento crossover entre el boxeo y las MMA, donde el campeón irlandés Conor McGregor se enfrentó a Floyd Mayweather, pero este último ganó por TKO en el décimo asalto.")
        ),
        BilingualQuestion(
            id = 50135, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film d'animation Pixar a été le plus appréciée des critiques?", listOf("Toy Story 4", "Coco", "Ratatouille", "Vice-Versa"), "Cinéma", "Ratatouille détient le meilleur score sur Rotten Tomatoes parmi les films Pixar, avec 96% d'avis positifs, grâce à son scénario original et sa mise en scène saluée par la critique."),
            en = LocalizedContent("Which Pixar animated film was most acclaimed by critics?", listOf("Toy Story 4", "Coco", "Ratatouille", "Inside Out"), "Cinema", "Ratatouille holds the highest score on Rotten Tomatoes among Pixar films, with 96% positive reviews, thanks to its original storyline and direction praised by critics."),
            zh = LocalizedContent("哪部皮克斯动画电影最受评论家好评？", listOf("玩具总动员4", "寻梦环游记", "料理鼠王", "头脑特工队"), "电影", "《料理鼠王》在烂番茄上拥有皮克斯电影中最高的评分，好评率达96%，这得益于其原创剧情和备受评论家赞誉的导演手法。"),
            es = LocalizedContent("¿Qué película animada de Pixar fue más aclamada por la crítica?", listOf("Toy Story 4", "Coco", "Ratatouille", "Intensa-Mente"), "Cine", "Ratatouille tiene la puntuación más alta en Rotten Tomatoes entre las películas de Pixar, con un 96% de críticas positivas, gracias a su historia original y dirección elogiada por la crítica.")
        ),
        BilingualQuestion(
            id = 50136, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste afrobeats nigérian a remporté un Grammy?", listOf("Rema", "Burna Boy", "Wizkid", "Tous les ci-dessus"), "Musique", "Burna Boy, Wizkid et Tems ont tous remporté des Grammy Awards, faisant de ces trois artistes nigérians des lauréats de cette récompense majeure."),
            en = LocalizedContent("Which Nigerian afrobeats artist won a Grammy?", listOf("Rema", "Burna Boy", "Wizkid", "All of the above"), "Music", "Burna Boy, Wizkid, and Tems have all won Grammy Awards, making these three Nigerian artists laureates of this major award."),
            zh = LocalizedContent("哪位尼日利亚非洲节拍艺术家获得了格莱美奖？", listOf("雷马", "伯纳男孩", "威兹基德", "以上都是"), "音乐", "伯纳男孩、威兹基德和泰姆斯都曾获得格莱美奖，使这三位尼日利亚艺术家成为这一重要奖项的得主。"),
            es = LocalizedContent("¿Qué artista nigeriano de afrobeats ganó un Grammy?", listOf("Rema", "Burna Boy", "Wizkid", "Todos los anteriores"), "Música", "Burna Boy, Wizkid y Tems han ganado premios Grammy, convirtiendo a estos tres artistas nigerianos en ganadores de este importante galardón.")
        ),
        BilingualQuestion(
            id = 50137, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel général britannique a arrêté Napoléon à Waterloo?", listOf("Edmund Allenby", "Arthur Wellesley", "Edmund Allenby", "Ralph Abercromby"), "Histoire", "Arthur Wellesley, 1er duc de Wellington, commandait les forces alliées (britanniques, néerlandaises et allemandes) qui ont vaincu Napoléon à la bataille de Waterloo le 18 juin 1815."),
            en = LocalizedContent("Which British general stopped Napoleon at Waterloo?", listOf("Edmund Allenby", "Arthur Wellesley", "Edmund Allenby", "Ralph Abercromby"), "History", "Arthur Wellesley, 1st Duke of Wellington, commanded the allied forces (British, Dutch, and German) that defeated Napoleon at the Battle of Waterloo on June 18, 1815."),
            zh = LocalizedContent("哪位英国将军在滑铁卢阻止了拿破仑？", listOf("埃德蒙·艾伦比", "阿瑟·韦尔斯利", "埃德蒙·艾伦比", "拉尔夫·阿伯克龙比"), "历史", "阿瑟·韦尔斯利，第一代威灵顿公爵，指挥盟军（英国、荷兰和德国军队）于1815年6月18日在滑铁卢战役中击败拿破仑。"),
            es = LocalizedContent("¿Qué general británico detuvo a Napoleón en Waterloo?", listOf("Edmund Allenby", "Arthur Wellesley", "Edmund Allenby", "Ralph Abercromby"), "Historia", "Arthur Wellesley, primer duque de Wellington, comandó las fuerzas aliadas (británicas, holandesas y alemanas) que derrotaron a Napoleón en la batalla de Waterloo el 18 de junio de 1815.")
        ),
        BilingualQuestion(
            id = 50138, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus rapide type de radiation?", listOf("Rayons bêta", "Rayons gamma", "Rayons X", "Rayons alpha"), "Science", "Les rayons gamma sont la forme de radiation électromagnétique la plus énergétique et rapide, se déplaçant à la vitesse de la lumière. Ils sont émis lors de processus nucléaires comme les désintégrations radioactives ou les explosions de supernovas."),
            en = LocalizedContent("What is the fastest type of radiation?", listOf("Beta rays", "Gamma rays", "X-rays", "Alpha rays"), "Science", "Gamma rays are the most energetic and fastest form of electromagnetic radiation, traveling at the speed of light. They are emitted during nuclear processes such as radioactive decay or supernova explosions."),
            zh = LocalizedContent("哪种辐射速度最快？", listOf("β射线", "γ射线", "X射线", "α射线"), "科学", "γ射线是能量最高、速度最快的电磁辐射形式，以光速传播。它们是在核过程（如放射性衰变或超新星爆炸）中发射的。"),
            es = LocalizedContent("¿Cuál es el tipo de radiación más rápido?", listOf("Rayos beta", "Rayos gamma", "Rayos X", "Rayos alfa"), "Ciencia", "Los rayos gamma son la forma más energética y rápida de radiación electromagnética, viajando a la velocidad de la luz. Se emiten durante procesos nucleares como la desintegración radiactiva o las explosiones de supernovas.")
        ),
        BilingualQuestion(
            id = 50139, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand île du monde?", listOf("Bornéo", "Sumatra", "Groenland", "Madagascar"), "Géographie", "Le Groenland est la plus grande île du monde avec une superficie de plus de 2 millions de km², bien que géologiquement rattachée à la plaque nord-américaine."),
            en = LocalizedContent("What is the largest island in the world?", listOf("Borneo", "Sumatra", "Greenland", "Madagascar"), "Geography", "Greenland is the largest island in the world with an area of over 2 million km², although geologically it is attached to the North American plate."),
            zh = LocalizedContent("世界上最大的岛屿是哪个？", listOf("婆罗洲", "苏门答腊", "格陵兰", "马达加斯加"), "地理", "格陵兰是世界上最大的岛屿，面积超过200万平方公里，尽管在地质上它属于北美板块。"),
            es = LocalizedContent("¿Cuál es la isla más grande del mundo?", listOf("Borneo", "Sumatra", "Groenlandia", "Madagascar"), "Geografía", "Groenlandia es la isla más grande del mundo con una superficie de más de 2 millones de km², aunque geológicamente está unida a la placa norteamericana.")
        ),
        BilingualQuestion(
            id = 50140, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel festival traditionnelle est célèbre en Nouvelle-Orléans?", listOf("Oktoberfest", "Mardi Gras", "Coachella", "SXSW"), "Culture", "Le Mardi Gras de La Nouvelle-Orléans est un carnaval annuel célèbre pour ses défilés colorés, ses costumes et ses traditions françaises et créoles."),
            en = LocalizedContent("Which traditional festival is famous in New Orleans?", listOf("Oktoberfest", "Mardi Gras", "Coachella", "SXSW"), "Culture", "Mardi Gras in New Orleans is an annual carnival famous for its colorful parades, costumes, and French and Creole traditions."),
            zh = LocalizedContent("新奥尔良以哪个传统节日闻名？", listOf("慕尼黑啤酒节", "狂欢节", "科切拉音乐节", "西南偏南电影节"), "文化", "新奥尔良的狂欢节是一个年度嘉年华，以其色彩缤纷的游行、服装以及法国和克里奥尔传统而闻名。"),
            es = LocalizedContent("¿Qué festival tradicional es famoso en Nueva Orleans?", listOf("Oktoberfest", "Mardi Gras", "Coachella", "SXSW"), "Cultura", "El Mardi Gras de Nueva Orleans es un carnaval anual famoso por sus coloridos desfiles, disfraces y tradiciones francesas y criollas.")
        ),
        BilingualQuestion(
            id = 50141, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel cycliste a remporté le Giro d'Italia le plus de fois?", listOf("Eddy Merckx", "Fausto Coppi", "Gino Bartali", "Bernard Hinault"), "Sport", "Fausto Coppi a remporté le Giro d'Italia à cinq reprises, un record qu'il partage avec Alfredo Binda et Eddy Merckx."),
            en = LocalizedContent("Which cyclist has won the Giro d'Italia the most times?", listOf("Eddy Merckx", "Fausto Coppi", "Gino Bartali", "Bernard Hinault"), "Sports", "Fausto Coppi won the Giro d'Italia five times, a record he shares with Alfredo Binda and Eddy Merckx."),
            zh = LocalizedContent("哪位自行车手赢得环意自行车赛次数最多？", listOf("埃迪·莫克斯", "福斯托·科皮", "吉诺·巴塔利", "贝尔纳·伊诺"), "体育", "福斯托·科皮五次赢得环意自行车赛，这一纪录他与阿尔弗雷多·宾达和埃迪·莫克斯共享。"),
            es = LocalizedContent("¿Qué ciclista ha ganado el Giro de Italia más veces?", listOf("Eddy Merckx", "Fausto Coppi", "Gino Bartali", "Bernard Hinault"), "Deportes", "Fausto Coppi ganó el Giro de Italia cinco veces, un récord que comparte con Alfredo Binda y Eddy Merckx.")
        ),
        BilingualQuestion(
            id = 50142, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur a joué Batman dans 'The Dark Knight' trilogie?", listOf("George Clooney", "Val Kilmer", "Christian Bale", "Ben Affleck"), "Cinéma", "Christian Bale a incarné Batman dans la trilogie de Christopher Nolan, dont le deuxième volet, The Dark Knight, est sorti en 2008."),
            en = LocalizedContent("Which actor played Batman in 'The Dark Knight' trilogy?", listOf("George Clooney", "Val Kilmer", "Christian Bale", "Ben Affleck"), "Cinema", "Christian Bale portrayed Batman in Christopher Nolan's trilogy, the second installment of which, The Dark Knight, was released in 2008."),
            zh = LocalizedContent("哪位演员在《黑暗骑士》三部曲中饰演蝙蝠侠？", listOf("乔治·克鲁尼", "瓦尔·基尔默", "克里斯蒂安·贝尔", "本·阿弗莱克"), "电影", "克里斯蒂安·贝尔在克里斯托弗·诺兰的三部曲中饰演蝙蝠侠，其中第二部《黑暗骑士》于2008年上映。"),
            es = LocalizedContent("¿Qué actor interpretó a Batman en la trilogía 'The Dark Knight'?", listOf("George Clooney", "Val Kilmer", "Christian Bale", "Ben Affleck"), "Cine", "Christian Bale interpretó a Batman en la trilogía de Christopher Nolan, cuya segunda entrega, The Dark Knight, se estrenó en 2008.")
        ),
        BilingualQuestion(
            id = 50143, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel compositeur a écrit 'Les Quatre Saisons'?", listOf("Vivaldi", "Bach", "Haydn", "Mozart"), "Musique", "Antonio Vivaldi a composé ce célèbre cycle de quatre concertos pour violon en 1723, représentant les saisons de l'année."),
            en = LocalizedContent("Which composer wrote 'The Four Seasons'?", listOf("Vivaldi", "Bach", "Haydn", "Mozart"), "Music", "Antonio Vivaldi composed this famous cycle of four violin concertos in 1723, representing the seasons of the year."),
            zh = LocalizedContent("哪位作曲家创作了《四季》？", listOf("维瓦尔第", "巴赫", "海顿", "莫扎特"), "音乐", "安东尼奥·维瓦尔第于1723年创作了这部由四首小提琴协奏曲组成的著名套曲，代表一年中的四季。"),
            es = LocalizedContent("¿Qué compositor escribió 'Las cuatro estaciones'?", listOf("Vivaldi", "Bach", "Haydn", "Mozart"), "Música", "Antonio Vivaldi compuso este famoso ciclo de cuatro conciertos para violín en 1723, representando las estaciones del año.")
        ),
        BilingualQuestion(
            id = 50144, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Chine a-t-elle élu son premier empereur?", listOf("200 av. J.-C.", "221 av. J.-C.", "206 av. J.-C.", "195 av. J.-C."), "Histoire", "Qin Shi Huang unifia la Chine et se proclama premier empereur en 221 av. J.-C., fondant la dynastie Qin."),
            en = LocalizedContent("In which year did China elect its first emperor?", listOf("200 BC", "221 BC", "206 BC", "195 BC"), "History", "Qin Shi Huang unified China and proclaimed himself the first emperor in 221 BC, founding the Qin dynasty."),
            zh = LocalizedContent("中国在哪一年选举了第一位皇帝？", listOf("公元前200年", "公元前221年", "公元前206年", "公元前195年"), "历史", "秦始皇统一中国，于公元前221年自称第一位皇帝，建立秦朝。"),
            es = LocalizedContent("¿En qué año China eligió a su primer emperador?", listOf("200 a.C.", "221 a.C.", "206 a.C.", "195 a.C."), "Historia", "Qin Shi Huang unificó China y se proclamó primer emperador en el 221 a.C., fundando la dinastía Qin.")
        ),
        BilingualQuestion(
            id = 50145, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gaz est le plus abondant dans l'espace?", listOf("Hélium", "Azote", "Hydrogène", "Oxygène"), "Science", "L'hydrogène est le gaz le plus abondant dans l'espace car il a été formé en grande quantité lors du Big Bang et constitue environ 75% de la matière baryonique de l'univers."),
            en = LocalizedContent("Which gas is the most abundant in space?", listOf("Helium", "Nitrogen", "Hydrogen", "Oxygen"), "Science", "Hydrogen is the most abundant gas in space because it was formed in large quantities during the Big Bang and constitutes about 75% of the baryonic matter in the universe."),
            zh = LocalizedContent("太空中最丰富的气体是什么？", listOf("氦", "氮", "氢", "氧"), "科学", "氢是太空中最丰富的气体，因为它在宇宙大爆炸期间大量形成，约占宇宙中重子物质的75%。"),
            es = LocalizedContent("¿Qué gas es el más abundante en el espacio?", listOf("Helio", "Nitrógeno", "Hidrógeno", "Oxígeno"), "Ciencia", "El hidrógeno es el gas más abundante en el espacio porque se formó en grandes cantidades durante el Big Bang y constituye aproximadamente el 75% de la materia bariónica del universo.")
        ),
        BilingualQuestion(
            id = 50146, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand glacier du monde?", listOf("Inlandsis du Groenland", "Inlandsis antarctique", "Glacier de l'Aletsch", "Glacier d'Athabasca"), "Géographie", "L'inlandsis antarctique est le plus grand glacier du monde, couvrant environ 14 millions de km², soit 98% de la surface du continent Antarctique. Il contient 70% de l'eau douce de la planète."),
            en = LocalizedContent("What is the largest glacier in the world?", listOf("Greenland Ice Sheet", "Antarctic Ice Sheet", "Aletsch Glacier", "Athabasca Glacier"), "Geography", "The Antarctic Ice Sheet is the largest glacier in the world, covering about 14 million km², or 98% of the Antarctic continent's surface. It contains 70% of the planet's fresh water."),
            zh = LocalizedContent("世界上最大的冰川是什么？", listOf("格陵兰冰盖", "南极冰盖", "阿莱奇冰川", "阿萨巴斯卡冰川"), "地理", "南极冰盖是世界上最大的冰川，覆盖约1400万平方公里，占南极大陆表面的98%。它含有地球上70%的淡水。"),
            es = LocalizedContent("¿Cuál es el glaciar más grande del mundo?", listOf("Indlandsis de Groenlandia", "Indlandsis antártico", "Glaciar de Aletsch", "Glaciar de Athabasca"), "Geografía", "El indlandsis antártico es el glaciar más grande del mundo, cubriendo aproximadamente 14 millones de km², es decir, el 98% de la superficie del continente antártico. Contiene el 70% del agua dulce del planeta.")
        ),
        BilingualQuestion(
            id = 50147, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel type de danse est originaire de Porto Rico?", listOf("Mambo", "Reggaeton", "Bachata", "Salsa"), "Culture", "La salsa est un genre musical et une danse dont les racines puisent dans les rythmes afro-cubains, mais c'est à Porto Rico qu'elle a été popularisée et codifiée dans sa forme moderne."),
            en = LocalizedContent("Which type of dance originated in Puerto Rico?", listOf("Mambo", "Reggaeton", "Bachata", "Salsa"), "Culture", "Salsa is a musical genre and dance whose roots draw from Afro-Cuban rhythms, but it was in Puerto Rico that it was popularized and codified in its modern form."),
            zh = LocalizedContent("哪种舞蹈起源于波多黎各？", listOf("曼波", "雷鬼顿", "巴恰塔", "萨尔萨"), "文化", "萨尔萨是一种音乐流派和舞蹈，其根源汲取自非洲-古巴节奏，但正是在波多黎各，它被推广并以现代形式规范化。"),
            es = LocalizedContent("¿Qué tipo de baile se originó en Puerto Rico?", listOf("Mambo", "Reguetón", "Bachata", "Salsa"), "Cultura", "La salsa es un género musical y un baile cuyas raíces provienen de ritmos afrocubanos, pero fue en Puerto Rico donde se popularizó y codificó en su forma moderna.")
        ),
        BilingualQuestion(
            id = 50148, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel coureur automobile a remporté le plus de titres de Formule 1?", listOf("Michael Schumacher", "Lewis Hamilton", "Juan Manuel Fangio", "Alain Prost"), "Sport", "Lewis Hamilton détient le record du nombre de titres de champion du monde de Formule 1, avec sept sacres, à égalité avec Michael Schumacher. Il a conquis ces titres entre 2008 et 2020."),
            en = LocalizedContent("Which racing driver has won the most Formula One titles?", listOf("Michael Schumacher", "Lewis Hamilton", "Juan Manuel Fangio", "Alain Prost"), "Sports", "Lewis Hamilton holds the record for the most Formula One World Drivers' Championship titles, with seven, tied with Michael Schumacher. He won these titles between 2008 and 2020."),
            zh = LocalizedContent("哪位赛车手赢得一级方程式冠军次数最多？", listOf("迈克尔·舒马赫", "刘易斯·汉密尔顿", "胡安·曼努埃尔·方吉奥", "阿兰·普罗斯特"), "体育", "刘易斯·汉密尔顿保持着最多一级方程式世界车手冠军头衔的纪录，共七个，与迈克尔·舒马赫持平。他在2008年至2020年间赢得了这些冠军。"),
            es = LocalizedContent("¿Qué piloto de carreras ha ganado más títulos de Fórmula 1?", listOf("Michael Schumacher", "Lewis Hamilton", "Juan Manuel Fangio", "Alain Prost"), "Deportes", "Lewis Hamilton tiene el récord de más títulos de Campeón del Mundo de Fórmula 1, con siete, empatado con Michael Schumacher. Ganó estos títulos entre 2008 y 2020.")
        ),
        BilingualQuestion(
            id = 50149, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film met en vedette un lion blanc qui revient à son royaume?", listOf("Le Monde de Nemo", "Raiponce", "Le Roi Lion", "La Reine des Neiges"), "Cinéma", "Le Roi Lion, film d'animation Disney de 1994, suit Simba, un lionceau héritier du trône, qui après l'exil revient pour réclamer son royaume."),
            en = LocalizedContent("Which movie features a white lion who returns to his kingdom?", listOf("Finding Nemo", "Tangled", "The Lion King", "Frozen"), "Cinema", "The Lion King, a 1994 Disney animated film, follows Simba, a lion cub heir to the throne, who after exile returns to reclaim his kingdom."),
            zh = LocalizedContent("哪部电影讲述了一头白狮返回他的王国？", listOf("海底总动员", "魔发奇缘", "狮子王", "冰雪奇缘"), "电影", "《狮子王》是1994年迪士尼动画电影，讲述了辛巴，一只继承王位的幼狮，在流亡后返回夺回他的王国。"),
            es = LocalizedContent("¿Qué película presenta un león blanco que regresa a su reino?", listOf("Buscando a Nemo", "Enredados", "El Rey León", "Frozen"), "Cine", "El Rey León, película animada de Disney de 1994, sigue a Simba, un cachorro de león heredero del trono, que tras el exilio regresa para reclamar su reino.")
        ),
        BilingualQuestion(
            id = 50150, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel chanteur a créé 'Hallelujah'?", listOf("Bob Dylan", "Leonard Cohen", "David Bowie", "Lou Reed"), "Musique", "Leonard Cohen a écrit et enregistré 'Hallelujah' pour son album 'Various Positions' en 1984, bien que la chanson soit devenue célèbre plus tard grâce à des reprises."),
            en = LocalizedContent("Which singer created 'Hallelujah'?", listOf("Bob Dylan", "Leonard Cohen", "David Bowie", "Lou Reed"), "Music", "Leonard Cohen wrote and recorded 'Hallelujah' for his album 'Various Positions' in 1984, though the song became famous later through covers."),
            zh = LocalizedContent("哪位歌手创作了《哈利路亚》？", listOf("鲍勃·迪伦", "莱昂纳德·科恩", "大卫·鲍伊", "卢·里德"), "音乐", "莱昂纳德·科恩于1984年为他的专辑《Various Positions》创作并录制了《哈利路亚》，尽管这首歌后来因翻唱而闻名。"),
            es = LocalizedContent("¿Qué cantante creó 'Hallelujah'?", listOf("Bob Dylan", "Leonard Cohen", "David Bowie", "Lou Reed"), "Musica", "Leonard Cohen escribió y grabó 'Hallelujah' para su álbum 'Various Positions' en 1984, aunque la canción se hizo famosa más tarde gracias a versiones.")
        ),
        BilingualQuestion(
            id = 50151, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel événement a marqué le début de la Première Guerre mondiale?", listOf("Annexion de la Bosnie", "Assassinat de l'archiduc François-Ferdinand", "Attaque de Verdun", "Bataille de la Somme"), "Histoire", "L'assassinat de l'archiduc François-Ferdinand, héritier du trône d'Autriche-Hongrie, le 28 juin 1914 à Sarajevo, a déclenché une série de mobilisations et de déclarations de guerre entre les grandes puissances européennes."),
            en = LocalizedContent("Which event marked the beginning of World War I?", listOf("Annexation of Bosnia", "Assassination of Archduke Franz Ferdinand", "Attack on Verdun", "Battle of the Somme"), "History", "The assassination of Archduke Franz Ferdinand, heir to the Austro-Hungarian throne, on June 28, 1914 in Sarajevo triggered a series of mobilizations and declarations of war among the great European powers."),
            zh = LocalizedContent("哪个事件标志着第一次世界大战的开始？", listOf("吞并波斯尼亚", "刺杀弗朗茨·斐迪南大公", "凡尔登战役", "索姆河战役"), "历史", "1914年6月28日，奥匈帝国王位继承人弗朗茨·斐迪南大公在萨拉热窝遇刺，引发了欧洲列强之间的一系列动员和宣战。"),
            es = LocalizedContent("¿Qué evento marcó el inicio de la Primera Guerra Mundial?", listOf("Anexión de Bosnia", "Asesinato del archiduque Francisco Fernando", "Ataque a Verdún", "Batalla del Somme"), "Historia", "El asesinato del archiduque Francisco Fernando, heredero del trono austrohúngaro, el 28 de junio de 1914 en Sarajevo desencadenó una serie de movilizaciones y declaraciones de guerra entre las grandes potencias europeas.")
        ),
        BilingualQuestion(
            id = 50152, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand virus du monde?", listOf("Virus de la grippe", "Virus du VIH", "Virus Mimivirus", "Virus Ebola"), "Science", "Le Mimivirus, découvert en 2003, est le plus grand virus connu, avec une taille visible au microscope optique et un génome plus complexe que certaines bactéries."),
            en = LocalizedContent("What is the largest virus in the world?", listOf("Influenza virus", "HIV virus", "Mimivirus", "Ebola virus"), "Science", "Mimivirus, discovered in 2003, is the largest known virus, visible under an optical microscope and with a genome more complex than some bacteria."),
            zh = LocalizedContent("世界上最大的病毒是什么？", listOf("流感病毒", "艾滋病毒", "拟菌病毒", "埃博拉病毒"), "科学", "拟菌病毒于2003年被发现，是已知最大的病毒，在光学显微镜下可见，其基因组比某些细菌更复杂。"),
            es = LocalizedContent("¿Cuál es el virus más grande del mundo?", listOf("Virus de la gripe", "VIH", "Mimivirus", "Virus del Ébola"), "Ciencia", "El Mimivirus, descubierto en 2003, es el virus más grande conocido, visible al microscopio óptico y con un genoma más complejo que algunas bacterias.")
        ),
        BilingualQuestion(
            id = 50153, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a le plus haut nombre d'îles?", listOf("Suède", "Finlande", "Norvège", "Indonésie"), "Géographie", "L'Indonésie est le plus grand archipel du monde, comptant plus de 17 000 îles, ce qui lui confère le record du nombre d'îles le plus élevé."),
            en = LocalizedContent("Which country has the highest number of islands?", listOf("Sweden", "Finland", "Norway", "Indonesia"), "Geography", "Indonesia is the largest archipelago in the world, with over 17,000 islands, giving it the highest number of islands."),
            zh = LocalizedContent("哪个国家拥有最多的岛屿？", listOf("瑞典", "芬兰", "挪威", "印度尼西亚"), "地理", "印度尼西亚是世界上最大的群岛国家，拥有超过17000个岛屿，因此岛屿数量最多。"),
            es = LocalizedContent("¿Qué país tiene el mayor número de islas?", listOf("Suecia", "Finlandia", "Noruega", "Indonesia"), "Geografia", "Indonesia es el archipiélago más grande del mundo, con más de 17,000 islas, lo que le otorga el mayor número de islas.")
        ),
        BilingualQuestion(
            id = 50154, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien temple hindou d'Inde?", listOf("Temples de Khajuraho", "Temple de Meenakshi", "Temple de Brihadisvara", "Temple de Tanjavur"), "Culture", "Construit au XIe siècle sous le règne du roi Rajaraja Chola Ier, le temple de Brihadisvara à Thanjavur est considéré comme le plus ancien temple hindou majeur encore debout en Inde."),
            en = LocalizedContent("What is the oldest Hindu temple in India?", listOf("Khajuraho Temples", "Meenakshi Temple", "Brihadisvara Temple", "Tanjavur Temple"), "Culture", "Built in the 11th century under King Rajaraja Chola I, the Brihadisvara Temple in Thanjavur is considered the oldest major Hindu temple still standing in India."),
            zh = LocalizedContent("印度最古老的印度教寺庙是哪座？", listOf("克久拉霍寺庙群", "米纳克希神庙", "布里哈迪希瓦拉神庙", "坦贾武尔神庙"), "文化", "布里哈迪希瓦拉神庙建于11世纪，由朱罗王朝国王拉贾拉贾一世建造，被认为是印度现存最古老的主要印度教寺庙。"),
            es = LocalizedContent("¿Cuál es el templo hindú más antiguo de la India?", listOf("Templos de Khajuraho", "Templo de Meenakshi", "Templo de Brihadisvara", "Templo de Tanjavur"), "Cultura", "Construido en el siglo XI bajo el reinado del rey Rajaraja Chola I, el templo de Brihadisvara en Thanjavur es considerado el templo hindú importante más antiguo aún en pie en la India.")
        ),
        BilingualQuestion(
            id = 50155, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel équipe de football a remporté la Ligue des Champions 2023?", listOf("Real Madrid", "Manchester City", "Bayern Munich", "PSG"), "Sport", "Le Real Madrid a remporté la Ligue des Champions 2023 en battant Liverpool 1-0 en finale. C'était leur 14e titre dans la compétition."),
            en = LocalizedContent("Which football team won the 2023 Champions League?", listOf("Real Madrid", "Manchester City", "Bayern Munich", "PSG"), "Sports", "Real Madrid won the 2023 Champions League by beating Liverpool 1-0 in the final. It was their 14th title in the competition."),
            zh = LocalizedContent("哪支足球队赢得了2023年欧冠联赛？", listOf("皇家马德里", "曼彻斯特城", "拜仁慕尼黑", "巴黎圣日耳曼"), "体育", "皇家马德里在决赛中以1-0击败利物浦，赢得了2023年欧冠联赛。这是他们在这项赛事中的第14个冠军。"),
            es = LocalizedContent("¿Qué equipo de fútbol ganó la Liga de Campeones 2023?", listOf("Real Madrid", "Manchester City", "Bayern Munich", "PSG"), "Deportes", "El Real Madrid ganó la Liga de Campeones 2023 al vencer al Liverpool 1-0 en la final. Fue su 14º título en la competición.")
        ),
        BilingualQuestion(
            id = 50156, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a créé la franchise 'Mission: Impossible'?", listOf("Brad Bird", "J.J. Abrams", "Tom Cruise", "Chris McQuarrie"), "Cinéma", "Chris McQuarrie a réalisé les trois derniers films de la franchise 'Mission: Impossible', mais c'est Brian De Palma qui a créé la série en 1996 avec le premier opus."),
            en = LocalizedContent("Which director created the 'Mission: Impossible' franchise?", listOf("Brad Bird", "J.J. Abrams", "Tom Cruise", "Chris McQuarrie"), "Cinema", "Chris McQuarrie directed the last three films of the 'Mission: Impossible' franchise, but Brian De Palma created the series in 1996 with the first installment."),
            zh = LocalizedContent("哪位导演创造了《碟中谍》系列？", listOf("布拉德·伯德", "J·J·艾布拉姆斯", "汤姆·克鲁斯", "克里斯托弗·麦奎里"), "电影", "克里斯托弗·麦奎里执导了《碟中谍》系列的最后三部电影，但布莱恩·德·帕尔玛在1996年以第一部作品创造了该系列。"),
            es = LocalizedContent("¿Qué director creó la franquicia 'Misión: Imposible'?", listOf("Brad Bird", "J.J. Abrams", "Tom Cruise", "Chris McQuarrie"), "Cine", "Chris McQuarrie dirigió las últimas tres películas de la franquicia 'Misión: Imposible', pero Brian De Palma creó la serie en 1996 con la primera entrega.")
        ),
        BilingualQuestion(
            id = 50157, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel rappeur a créé 'Rap God'?", listOf("Drake", "Eminem", "Lil Wayne", "50 Cent"), "Musique", "Eminem a sorti 'Rap God' en 2013 sur son album 'The Marshall Mathers LP 2', un titre connu pour sa vitesse d'élocution record."),
            en = LocalizedContent("Which rapper created 'Rap God'?", listOf("Drake", "Eminem", "Lil Wayne", "50 Cent"), "Music", "Eminem released 'Rap God' in 2013 on his album 'The Marshall Mathers LP 2', a track known for its record-breaking speed of delivery."),
            zh = LocalizedContent("哪位说唱歌手创作了《Rap God》？", listOf("德雷克", "埃米纳姆", "李尔·韦恩", "50美分"), "音乐", "埃米纳姆于2013年在专辑《The Marshall Mathers LP 2》中发布了《Rap God》，这首歌以其创纪录的语速而闻名。"),
            es = LocalizedContent("¿Qué rapero creó 'Rap God'?", listOf("Drake", "Eminem", "Lil Wayne", "50 Cent"), "Musica", "Eminem lanzó 'Rap God' en 2013 en su álbum 'The Marshall Mathers LP 2', un tema conocido por su velocidad de locución récord.")
        ),
        BilingualQuestion(
            id = 50158, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Grande Muraille de Chine a-t-elle été construite?", listOf("500 av. J.-C.", "200 av. J.-C.", "0 ap. J.-C.", "400 ap. J.-C."), "Histoire", "La construction de la Grande Muraille a débuté au IIIe siècle av. J.-C. sous l'empereur Qin Shi Huang, vers 200 av. J.-C., pour protéger la Chine des invasions nomades."),
            en = LocalizedContent("In which year was the Great Wall of China built?", listOf("500 BC", "200 BC", "0 AD", "400 AD"), "History", "Construction of the Great Wall began in the 3rd century BC under Emperor Qin Shi Huang, around 200 BC, to protect China from nomadic invasions."),
            zh = LocalizedContent("中国的长城建于哪一年？", listOf("公元前500年", "公元前200年", "公元0年", "公元400年"), "历史", "长城的建造始于公元前3世纪，秦始皇时期，大约公元前200年，旨在保护中国免受游牧民族的入侵。"),
            es = LocalizedContent("¿En qué año se construyó la Gran Muralla China?", listOf("500 a.C.", "200 a.C.", "0 d.C.", "400 d.C."), "Historia", "La construcción de la Gran Muralla comenzó en el siglo III a.C. bajo el emperador Qin Shi Huang, alrededor del 200 a.C., para proteger a China de las invasiones nómadas.")
        ),
        BilingualQuestion(
            id = 50159, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand continent?", listOf("Afrique", "Amérique du Nord", "Asie", "Europe"), "Science", "L'Asie est le plus grand continent en superficie, couvrant environ 30% des terres émergées de la planète."),
            en = LocalizedContent("What is the largest continent?", listOf("Africa", "North America", "Asia", "Europe"), "Science", "Asia is the largest continent by area, covering about 30% of the Earth's land area."),
            zh = LocalizedContent("最大的洲是哪个？", listOf("非洲", "北美洲", "亚洲", "欧洲"), "科学", "亚洲是面积最大的洲，约占地球陆地面积的30%。"),
            es = LocalizedContent("¿Cuál es el continente más grande?", listOf("África", "América del Norte", "Asia", "Europa"), "Ciencia", "Asia es el continente más grande en superficie, cubriendo aproximadamente el 30% de la tierra emergida del planeta.")
        ),
        BilingualQuestion(
            id = 50160, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus petit pays du monde?", listOf("Liechtenstein", "Monténégro", "Vatican", "Malte"), "Géographie", "Le Vatican, enclavé dans Rome, s'étend sur seulement 0,44 km², ce qui en fait le plus petit État souverain du monde par sa superficie."),
            en = LocalizedContent("What is the smallest country in the world?", listOf("Liechtenstein", "Montenegro", "Vatican City", "Malta"), "Geography", "Vatican City, an enclave within Rome, covers only 0.44 km², making it the smallest sovereign state in the world by area."),
            zh = LocalizedContent("世界上最小的国家是哪个？", listOf("列支敦士登", "黑山", "梵蒂冈", "马耳他"), "地理", "梵蒂冈城位于罗马城内，面积仅0.44平方公里，是世界上面积最小的主权国家。"),
            es = LocalizedContent("¿Cuál es el país más pequeño del mundo?", listOf("Liechtenstein", "Montenegro", "Ciudad del Vaticano", "Malta"), "Geografía", "La Ciudad del Vaticano, enclavada en Roma, tiene solo 0,44 km², lo que la convierte en el estado soberano más pequeño del mundo por superficie.")
        ),
        BilingualQuestion(
            id = 50161, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien festival de cinéma du monde?", listOf("Berlin", "Venise", "Cannes", "San Sebastián"), "Culture", "Le Festival de Venise, créé en 1932, est le plus ancien festival de cinéma au monde, précédant Cannes (1946) et Berlin (1951)."),
            en = LocalizedContent("What is the oldest film festival in the world?", listOf("Berlin", "Venice", "Cannes", "San Sebastián"), "Culture", "The Venice Film Festival, founded in 1932, is the oldest film festival in the world, predating Cannes (1946) and Berlin (1951)."),
            zh = LocalizedContent("世界上最古老的电影节是哪个？", listOf("柏林", "威尼斯", "戛纳", "圣塞巴斯蒂安"), "文化", "威尼斯电影节创办于1932年，是世界上最古老的电影节，早于戛纳（1946年）和柏林（1951年）。"),
            es = LocalizedContent("¿Cuál es el festival de cine más antiguo del mundo?", listOf("Berlín", "Venecia", "Cannes", "San Sebastián"), "Cultura", "El Festival de Venecia, fundado en 1932, es el festival de cine más antiguo del mundo, anterior a Cannes (1946) y Berlín (1951).")
        ),
        BilingualQuestion(
            id = 50162, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel rugby joueur a remporté la Coupe du Monde en 2019?", listOf("Afrique du Sud", "Nouvelle-Zélande", "Angleterre", "Japon"), "Sport", "L'équipe d'Afrique du Sud a battu l'Angleterre en finale pour remporter la Coupe du Monde de rugby 2019 au Japon."),
            en = LocalizedContent("Which rugby team won the World Cup in 2019?", listOf("South Africa", "New Zealand", "England", "Japan"), "Sports", "The South African team defeated England in the final to win the 2019 Rugby World Cup in Japan."),
            zh = LocalizedContent("哪支橄榄球队赢得了2019年世界杯？", listOf("南非", "新西兰", "英格兰", "日本"), "体育", "南非队在决赛中击败英格兰队，赢得了2019年在日本举行的橄榄球世界杯。"),
            es = LocalizedContent("¿Qué equipo de rugby ganó la Copa del Mundo en 2019?", listOf("Sudáfrica", "Nueva Zelanda", "Inglaterra", "Japón"), "Deportes", "El equipo de Sudáfrica derrotó a Inglaterra en la final para ganar la Copa del Mundo de Rugby 2019 en Japón.")
        ),
        BilingualQuestion(
            id = 50163, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film de guerre a reçu 11 Oscars?", listOf("Sauve qui peut la vie", "Titanic", "Seigneur des Anneaux", "Il faut sauver le soldat Ryan"), "Cinéma", "Le Seigneur des Anneaux : Le Retour du Roi a remporté 11 Oscars en 2004, égalant le record de Ben-Hur et Titanic."),
            en = LocalizedContent("Which war film won 11 Oscars?", listOf("Saving Private Ryan", "Titanic", "The Lord of the Rings", "Saving Private Ryan"), "Cinema", "The Lord of the Rings: The Return of the King won 11 Oscars in 2004, tying the record with Ben-Hur and Titanic."),
            zh = LocalizedContent("哪部战争片获得了11项奥斯卡奖？", listOf("拯救大兵瑞恩", "泰坦尼克号", "指环王", "拯救大兵瑞恩"), "电影", "《指环王：王者归来》在2004年获得了11项奥斯卡奖，与《宾虚》和《泰坦尼克号》并列纪录。"),
            es = LocalizedContent("¿Qué película de guerra ganó 11 premios Oscar?", listOf("Salvar al soldado Ryan", "Titanic", "El Señor de los Anillos", "Salvar al soldado Ryan"), "Cine", "El Señor de los Anillos: El Retorno del Rey ganó 11 premios Oscar en 2004, empatando el récord con Ben-Hur y Titanic.")
        ),
        BilingualQuestion(
            id = 50164, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe a enregistré 'Stairway to Heaven'?", listOf("Pink Floyd", "Queen", "Led Zeppelin", "Black Sabbath"), "Musique", "Led Zeppelin a sorti ce morceau emblématique en 1971 sur l'album Led Zeppelin IV. Il est souvent considéré comme l'un des plus grands chefs-d'œuvre du rock."),
            en = LocalizedContent("Which band recorded 'Stairway to Heaven'?", listOf("Pink Floyd", "Queen", "Led Zeppelin", "Black Sabbath"), "Music", "Led Zeppelin released this iconic track in 1971 on the album Led Zeppelin IV. It is often considered one of the greatest rock masterpieces."),
            zh = LocalizedContent("哪支乐队录制了《Stairway to Heaven》？", listOf("平克·弗洛伊德", "皇后乐队", "齐柏林飞艇", "黑色安息日"), "音乐", "齐柏林飞艇于1971年在专辑《Led Zeppelin IV》中发布了这首标志性曲目，常被视为最伟大的摇滚杰作之一。"),
            es = LocalizedContent("¿Qué banda grabó 'Stairway to Heaven'?", listOf("Pink Floyd", "Queen", "Led Zeppelin", "Black Sabbath"), "Música", "Led Zeppelin lanzó este tema icónico en 1971 en el álbum Led Zeppelin IV. A menudo se considera una de las mayores obras maestras del rock.")
        ),
        BilingualQuestion(
            id = 50165, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel empereur romain a créé le Panthéon?", listOf("Hadrien", "Auguste", "Trajan", "Antonin le Pieux"), "Histoire", "Hadrien fit reconstruire le Panthéon de Rome après un incendie, achevant l'édifice vers 125 après J.-C. avec sa célèbre coupole."),
            en = LocalizedContent("Which Roman emperor built the Pantheon?", listOf("Hadrian", "Augustus", "Trajan", "Antoninus Pius"), "History", "Hadrian rebuilt the Pantheon in Rome after a fire, completing the structure around 125 AD with its famous dome."),
            zh = LocalizedContent("哪位罗马皇帝建造了万神殿？", listOf("哈德良", "奥古斯都", "图拉真", "安东尼·庇护"), "历史", "哈德良在火灾后重建了罗马万神殿，于公元125年左右完工，以其著名的穹顶而闻名。"),
            es = LocalizedContent("¿Qué emperador romano construyó el Panteón?", listOf("Adriano", "Augusto", "Trajano", "Antonino Pío"), "Historia", "Adriano reconstruyó el Panteón de Roma tras un incendio, completando el edificio hacia el año 125 d.C. con su famosa cúpula.")
        ),
        BilingualQuestion(
            id = 50166, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus petit élément d'une plante?", listOf("Feuille", "Racine", "Cellule", "Graine"), "Science", "La cellule est l'unité de base de tout organisme vivant, y compris les plantes, et constitue leur plus petit élément structurel et fonctionnel."),
            en = LocalizedContent("What is the smallest part of a plant?", listOf("Leaf", "Root", "Cell", "Seed"), "Science", "The cell is the basic unit of all living organisms, including plants, and constitutes their smallest structural and functional element."),
            zh = LocalizedContent("植物最小的组成部分是什么？", listOf("叶子", "根", "细胞", "种子"), "科学", "细胞是所有生物体（包括植物）的基本单位，是它们最小的结构和功能元素。"),
            es = LocalizedContent("¿Cuál es la parte más pequeña de una planta?", listOf("Hoja", "Raíz", "Célula", "Semilla"), "Ciencia", "La célula es la unidad básica de todos los organismos vivos, incluidas las plantas, y constituye su elemento estructural y funcional más pequeño.")
        ),
        BilingualQuestion(
            id = 50167, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand parc national d'Afrique?", listOf("Parc du Sérengeti", "Parc Kruger", "Parc du Kilimandjaro", "Parc Natron"), "Géographie", "Le parc national Kruger, en Afrique du Sud, s'étend sur près de 20 000 km², ce qui en fait le plus grand parc national d'Afrique."),
            en = LocalizedContent("What is the largest national park in Africa?", listOf("Serengeti National Park", "Kruger National Park", "Kilimanjaro National Park", "Natron Park"), "Geography", "Kruger National Park in South Africa covers nearly 20,000 km², making it the largest national park in Africa."),
            zh = LocalizedContent("非洲最大的国家公园是哪个？", listOf("塞伦盖蒂国家公园", "克鲁格国家公园", "乞力马扎罗国家公园", "纳特龙公园"), "地理", "南非的克鲁格国家公园面积近2万平方公里，是非洲最大的国家公园。"),
            es = LocalizedContent("¿Cuál es el parque nacional más grande de África?", listOf("Parque Nacional del Serengueti", "Parque Nacional Kruger", "Parque Nacional del Kilimanjaro", "Parque Natron"), "Geografía", "El Parque Nacional Kruger, en Sudáfrica, abarca casi 20.000 km², lo que lo convierte en el parque nacional más grande de África.")
        ),
        BilingualQuestion(
            id = 50168, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plat national de la Chine?", listOf("Nouilles", "Riz", "Dumplings", "Raviolis"), "Culture", "Les dumplings, ou jiaozi, sont considérés comme le plat national chinois car ils symbolisent la richesse et la prospérité, souvent consommés lors du Nouvel An lunaire."),
            en = LocalizedContent("What is the national dish of China?", listOf("Noodles", "Rice", "Dumplings", "Ravioli"), "Culture", "Dumplings, or jiaozi, are considered the national dish of China as they symbolize wealth and prosperity, often eaten during the Lunar New Year."),
            zh = LocalizedContent("中国的国菜是什么？", listOf("面条", "米饭", "饺子", "馄饨"), "文化", "饺子被视为中国的国菜，因为它们象征着财富和繁荣，常在农历新年期间食用。"),
            es = LocalizedContent("¿Cuál es el plato nacional de China?", listOf("Fideos", "Arroz", "Dumplings", "Raviolis"), "Cultura", "Los dumplings, o jiaozi, se consideran el plato nacional de China, ya que simbolizan riqueza y prosperidad, y se consumen a menudo durante el Año Nuevo lunar.")
        ),
        BilingualQuestion(
            id = 50169, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel équipe de tennis a remporté la Coupe Davis en 2022?", listOf("États-Unis", "Italie", "Serbie", "Espagne"), "Sport", "L'Italie a remporté la Coupe Davis 2022 en battant le Canada en finale, à Malaga, pour son premier titre depuis 1976."),
            en = LocalizedContent("Which tennis team won the Davis Cup in 2022?", listOf("United States", "Italy", "Serbia", "Spain"), "Sports", "Italy won the 2022 Davis Cup by defeating Canada in the final in Malaga, securing their first title since 1976."),
            zh = LocalizedContent("哪支网球队赢得了2022年戴维斯杯？", listOf("美国", "意大利", "塞尔维亚", "西班牙"), "体育", "意大利队在马拉加决赛中击败加拿大队，赢得了2022年戴维斯杯，这是他们自1976年以来的首个冠军。"),
            es = LocalizedContent("¿Qué equipo de tenis ganó la Copa Davis en 2022?", listOf("Estados Unidos", "Italia", "Serbia", "España"), "Deportes", "Italia ganó la Copa Davis 2022 al derrotar a Canadá en la final en Málaga, obteniendo su primer título desde 1976.")
        ),
        BilingualQuestion(
            id = 50170, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel acteur a joué James Bond le plus de fois?", listOf("Pierce Brosnan", "Sean Connery", "Roger Moore", "Daniel Craig"), "Cinéma", "Roger Moore a incarné James Bond dans sept films officiels entre 1973 et 1985, un record de longévité pour l'acteur dans le rôle."),
            en = LocalizedContent("Which actor played James Bond the most times?", listOf("Pierce Brosnan", "Sean Connery", "Roger Moore", "Daniel Craig"), "Cinema", "Roger Moore played James Bond in seven official films between 1973 and 1985, a longevity record for the actor in the role."),
            zh = LocalizedContent("哪位演员扮演詹姆斯·邦德的次数最多？", listOf("皮尔斯·布鲁斯南", "肖恩·康纳利", "罗杰·摩尔", "丹尼尔·克雷格"), "电影", "罗杰·摩尔在1973年至1985年间在七部官方电影中扮演詹姆斯·邦德，创下了该角色演员的长期纪录。"),
            es = LocalizedContent("¿Qué actor interpretó a James Bond la mayor cantidad de veces?", listOf("Pierce Brosnan", "Sean Connery", "Roger Moore", "Daniel Craig"), "Cine", "Roger Moore interpretó a James Bond en siete películas oficiales entre 1973 y 1985, un récord de longevidad para el actor en el papel.")
        ),
        BilingualQuestion(
            id = 50171, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel chanteur reggae a remporté le plus de Grammys?", listOf("Bunny Wailer", "Bob Marley", "Peter Tosh", "Burning Spear"), "Musique", "Bunny Wailer, membre fondateur des Wailers avec Bob Marley, a remporté trois Grammy Awards du meilleur album reggae entre 1991 et 1995."),
            en = LocalizedContent("Which reggae singer has won the most Grammys?", listOf("Bunny Wailer", "Bob Marley", "Peter Tosh", "Burning Spear"), "Music", "Bunny Wailer, a founding member of the Wailers with Bob Marley, won three Grammy Awards for Best Reggae Album between 1991 and 1995."),
            zh = LocalizedContent("哪位雷鬼歌手获得格莱美奖最多？", listOf("巴尼·韦勒", "鲍勃·马利", "彼得·托什", "燃烧的长矛"), "音乐", "巴尼·韦勒是与鲍勃·马利共同创立哭泣者乐队的成员，在1991年至1995年间三次获得格莱美最佳雷鬼专辑奖。"),
            es = LocalizedContent("¿Qué cantante de reggae ha ganado más Grammys?", listOf("Bunny Wailer", "Bob Marley", "Peter Tosh", "Burning Spear"), "Musica", "Bunny Wailer, miembro fundador de los Wailers junto a Bob Marley, ganó tres premios Grammy al mejor álbum de reggae entre 1991 y 1995.")
        ),
        BilingualQuestion(
            id = 50172, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année les Jeux Olympiques antiques ont-ils été arrêtés?", listOf("300 ap. J.-C.", "400 ap. J.-C.", "393 ap. J.-C.", "500 ap. J.-C."), "Histoire", "L'empereur romain Théodose Ier, chrétien, interdit les Jeux Olympiques antiques en 393 ap. J.-C., les considérant comme un vestige du paganisme."),
            en = LocalizedContent("In which year were the ancient Olympic Games stopped?", listOf("300 AD", "400 AD", "393 AD", "500 AD"), "History", "The Roman emperor Theodosius I, a Christian, banned the ancient Olympic Games in 393 AD, considering them a remnant of paganism."),
            zh = LocalizedContent("古代奥运会在哪一年被停止？", listOf("公元300年", "公元400年", "公元393年", "公元500年"), "历史", "罗马皇帝狄奥多西一世是基督徒，于公元393年禁止了古代奥运会，认为它们是异教的残余。"),
            es = LocalizedContent("¿En qué año se detuvieron los Juegos Olímpicos antiguos?", listOf("300 d.C.", "400 d.C.", "393 d.C.", "500 d.C."), "Historia", "El emperador romano Teodosio I, cristiano, prohibió los Juegos Olímpicos antiguos en el 393 d.C., considerándolos un vestigio del paganismo.")
        ),
        BilingualQuestion(
            id = 50173, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel type de rayonnement est le plus dangereux?", listOf("Rayons alpha", "Rayons bêta", "Rayons gamma", "Rayons X"), "Science", "Les rayons gamma sont les plus dangereux car ils possèdent la plus haute énergie et le plus grand pouvoir de pénétration, pouvant traverser le corps humain et endommager l'ADN des cellules."),
            en = LocalizedContent("Which type of radiation is the most dangerous?", listOf("Alpha rays", "Beta rays", "Gamma rays", "X-rays"), "Science", "Gamma rays are the most dangerous because they have the highest energy and greatest penetrating power, able to pass through the human body and damage cell DNA."),
            zh = LocalizedContent("哪种辐射最危险？", listOf("α射线", "β射线", "γ射线", "X射线"), "科学", "γ射线最危险，因为它们能量最高、穿透力最强，能穿透人体并损伤细胞DNA。"),
            es = LocalizedContent("¿Qué tipo de radiación es la más peligrosa?", listOf("Rayos alfa", "Rayos beta", "Rayos gamma", "Rayos X"), "Ciencia", "Los rayos gamma son los más peligrosos porque poseen la mayor energía y poder de penetración, pudiendo atravesar el cuerpo humano y dañar el ADN de las células.")
        ),
        BilingualQuestion(
            id = 50174, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand archipel du monde?", listOf("Îles Philippines", "Indonésie", "Îles Canaries", "Îles Hawaï"), "Géographie", "L'Indonésie est le plus grand archipel du monde avec plus de 17 000 îles, dont les principales sont Java, Sumatra, Bornéo et la Nouvelle-Guinée."),
            en = LocalizedContent("What is the largest archipelago in the world?", listOf("Philippine Islands", "Indonesia", "Canary Islands", "Hawaiian Islands"), "Geography", "Indonesia is the largest archipelago in the world with over 17,000 islands, the main ones being Java, Sumatra, Borneo, and New Guinea."),
            zh = LocalizedContent("世界上最大的群岛是哪个？", listOf("菲律宾群岛", "印度尼西亚", "加那利群岛", "夏威夷群岛"), "地理", "印度尼西亚是世界上最大的群岛，拥有超过17000个岛屿，主要岛屿包括爪哇岛、苏门答腊岛、婆罗洲和新几内亚岛。"),
            es = LocalizedContent("¿Cuál es el archipiélago más grande del mundo?", listOf("Islas Filipinas", "Indonesia", "Islas Canarias", "Islas Hawái"), "Geografia", "Indonesia es el archipiélago más grande del mundo con más de 17,000 islas, siendo las principales Java, Sumatra, Borneo y Nueva Guinea.")
        ),
        BilingualQuestion(
            id = 50175, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien art martial du monde?", listOf("Karaté", "Kung Fu", "Judo", "Taekwondo"), "Culture", "Le kung fu, dont les origines remontent à la Chine ancienne il y a plus de 4 000 ans, est considéré comme le plus ancien art martial grâce à des textes et des preuves archéologiques."),
            en = LocalizedContent("What is the oldest martial art in the world?", listOf("Karate", "Kung Fu", "Judo", "Taekwondo"), "Culture", "Kung Fu, whose origins date back to ancient China over 4,000 years ago, is considered the oldest martial art thanks to texts and archaeological evidence."),
            zh = LocalizedContent("世界上最古老的武术是什么？", listOf("空手道", "功夫", "柔道", "跆拳道"), "文化", "功夫起源于4000多年前的中国古代，凭借文献和考古证据被认为是世界上最古老的武术。"),
            es = LocalizedContent("¿Cuál es el arte marcial más antiguo del mundo?", listOf("Kárate", "Kung Fu", "Judo", "Taekwondo"), "Cultura", "El kung fu, cuyos orígenes se remontan a la antigua China hace más de 4,000 años, es considerado el arte marcial más antiguo gracias a textos y evidencias arqueológicas.")
        ),
        BilingualQuestion(
            id = 50176, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel athlète a remporté le titre olympique de saut en hauteur?", listOf("Stefka Kostadinova", "Mariya Lasitskene", "Mutaz Essa Barshim", "Jaroslav Janu"), "Sport", "Mutaz Essa Barshim a partagé la médaille d'or olympique du saut en hauteur avec Gianmarco Tamberi aux Jeux de Tokyo 2020, après que les deux athlètes aient accepté de ne pas disputer de barrage."),
            en = LocalizedContent("Which athlete won the Olympic title in high jump?", listOf("Stefka Kostadinova", "Mariya Lasitskene", "Mutaz Essa Barshim", "Jaroslav Janu"), "Sports", "Mutaz Essa Barshim shared the Olympic gold medal in high jump with Gianmarco Tamberi at the Tokyo 2020 Games, after both athletes agreed not to have a jump-off."),
            zh = LocalizedContent("哪位运动员赢得了奥运会跳高冠军？", listOf("斯特芙卡·科斯塔迪诺娃", "玛丽亚·拉西茨克涅", "穆塔兹·伊萨·巴尔希姆", "雅罗斯拉夫·亚努"), "体育", "穆塔兹·伊萨·巴尔希姆在2020年东京奥运会上与吉安马科·坦贝里共享跳高金牌，两人同意不进行加赛。"),
            es = LocalizedContent("¿Qué atleta ganó el título olímpico de salto de altura?", listOf("Stefka Kostadinova", "Mariya Lasitskene", "Mutaz Essa Barshim", "Jaroslav Janu"), "Deportes", "Mutaz Essa Barshim compartió la medalla de oro olímpica en salto de altura con Gianmarco Tamberi en los Juegos de Tokio 2020, después de que ambos atletas aceptaran no disputar un desempate.")
        ),
        BilingualQuestion(
            id = 50177, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film d'horreur a été adapté d'un roman de Stephen King?", listOf("Shining", "Carrie", "It", "Tous les ci-dessus"), "Cinéma", "Stephen King est l'un des auteurs les plus adaptés au cinéma, avec des classiques d'horreur comme Shining, Carrie et Ça, tous portés à l'écran."),
            en = LocalizedContent("Which horror movie was adapted from a Stephen King novel?", listOf("The Shining", "Carrie", "It", "All of the above"), "Cinema", "Stephen King is one of the most adapted authors in cinema, with horror classics like The Shining, Carrie, and It all brought to the screen."),
            zh = LocalizedContent("哪部恐怖电影改编自斯蒂芬·金的小说？", listOf("闪灵", "魔女嘉莉", "小丑回魂", "以上都是"), "电影", "斯蒂芬·金是电影改编最多的作家之一，像《闪灵》、《魔女嘉莉》和《小丑回魂》等恐怖经典都被搬上了银幕。"),
            es = LocalizedContent("¿Qué película de terror fue adaptada de una novela de Stephen King?", listOf("El resplandor", "Carrie", "It", "Todas las anteriores"), "Cine", "Stephen King es uno de los autores más adaptados al cine, con clásicos del terror como El resplandor, Carrie e It llevados a la pantalla.")
        ),
        BilingualQuestion(
            id = 50178, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur a écrit '1812 Overture'?", listOf("Tchaïkovski", "Chostakovitch", "Borodine", "Rimski-Korsakov"), "Musique", "Tchaïkovski a composé l'ouverture 1812 pour commémorer la victoire russe contre l'armée napoléonienne en 1812."),
            en = LocalizedContent("Which composer wrote the '1812 Overture'?", listOf("Tchaikovsky", "Shostakovich", "Borodin", "Rimsky-Korsakov"), "Music", "Tchaikovsky composed the 1812 Overture to commemorate the Russian victory against Napoleon's army in 1812."),
            zh = LocalizedContent("哪位作曲家创作了《1812序曲》？", listOf("柴可夫斯基", "肖斯塔科维奇", "鲍罗丁", "里姆斯基-科萨科夫"), "音乐", "柴可夫斯基创作了《1812序曲》以纪念俄国在1812年战胜拿破仑军队。"),
            es = LocalizedContent("¿Qué compositor escribió la 'Obertura 1812'?", listOf("Chaikovski", "Shostakóvich", "Borodín", "Rimski-Kórsakov"), "Musica", "Chaikovski compuso la Obertura 1812 para conmemorar la victoria rusa contra el ejército napoleónico en 1812.")
        ),
        BilingualQuestion(
            id = 50179, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel roi français a construit le Palais de Versailles?", listOf("Louis XIV", "Louis XV", "Louis XVI", "Louis XIII"), "Histoire", "Louis XIV, dit le Roi-Soleil, fit construire le palais de Versailles à partir de 1661 pour affirmer son pouvoir absolu et éloigner la noblesse de Paris."),
            en = LocalizedContent("Which French king built the Palace of Versailles?", listOf("Louis XIV", "Louis XV", "Louis XVI", "Louis XIII"), "History", "Louis XIV, known as the Sun King, had the Palace of Versailles built starting in 1661 to assert his absolute power and distance the nobility from Paris."),
            zh = LocalizedContent("哪位法国国王建造了凡尔赛宫？", listOf("路易十四", "路易十五", "路易十六", "路易十三"), "历史", "路易十四，即太阳王，从1661年开始建造凡尔赛宫，以彰显其绝对权力并使贵族远离巴黎。"),
            es = LocalizedContent("¿Qué rey francés construyó el Palacio de Versalles?", listOf("Luis XIV", "Luis XV", "Luis XVI", "Luis XIII"), "Historia", "Luis XIV, conocido como el Rey Sol, mandó construir el palacio de Versalles a partir de 1661 para afirmar su poder absoluto y alejar a la nobleza de París.")
        ),
        BilingualQuestion(
            id = 50180, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le gaz qui rend les ballons de baudruche flottants?", listOf("Hélium", "Hydrogène", "Azote", "Dioxyde de carbone"), "Science", "L'hélium est moins dense que l'air, ce qui permet aux ballons de s'élever. C'est un gaz inerte et non inflammable, contrairement à l'hydrogène."),
            en = LocalizedContent("Which gas makes balloons float?", listOf("Helium", "Hydrogen", "Nitrogen", "Carbon dioxide"), "Science", "Helium is less dense than air, allowing balloons to rise. It is an inert and non-flammable gas, unlike hydrogen."),
            zh = LocalizedContent("哪种气体能让气球漂浮？", listOf("氦气", "氢气", "氮气", "二氧化碳"), "科学", "氦气的密度低于空气，使气球能够上升。它是一种惰性且不易燃的气体，与氢气不同。"),
            es = LocalizedContent("¿Qué gas hace flotar los globos?", listOf("Helio", "Hidrógeno", "Nitrógeno", "Dióxido de carbono"), "Ciencia", "El helio es menos denso que el aire, lo que permite que los globos se eleven. Es un gas inerte y no inflamable, a diferencia del hidrógeno.")
        ),
        BilingualQuestion(
            id = 50181, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand système fluvial d'Amérique du Sud?", listOf("Parana", "Orinoco", "Amazone", "Rio Negro"), "Géographie", "L'Amazone est le plus grand système fluvial d'Amérique du Sud en volume d'eau et en longueur, traversant le Pérou, la Colombie et le Brésil avant de se jeter dans l'océan Atlantique."),
            en = LocalizedContent("What is the largest river system in South America?", listOf("Paraná", "Orinoco", "Amazon", "Rio Negro"), "Geography", "The Amazon is the largest river system in South America by water volume and length, flowing through Peru, Colombia, and Brazil before emptying into the Atlantic Ocean."),
            zh = LocalizedContent("南美洲最大的河流系统是什么？", listOf("巴拉那河", "奥里诺科河", "亚马逊河", "内格罗河"), "地理", "亚马逊河是南美洲水量和长度最大的河流系统，流经秘鲁、哥伦比亚和巴西，最终注入大西洋。"),
            es = LocalizedContent("¿Cuál es el sistema fluvial más grande de América del Sur?", listOf("Paraná", "Orinoco", "Amazonas", "Río Negro"), "Geografia", "El Amazonas es el sistema fluvial más grande de América del Sur en volumen de agua y longitud, atravesando Perú, Colombia y Brasil antes de desembocar en el océano Atlántico.")
        ),
        BilingualQuestion(
            id = 50182, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien temple du monde?", listOf("Angkor Wat", "Borobudur", "Göbekli Tepe", "Karnak"), "Culture", "Situé dans l'actuelle Turquie, Göbekli Tepe est un site néolithique datant d'environ 9600 avant notre ère, ce qui en fait le plus ancien temple connu."),
            en = LocalizedContent("What is the oldest temple in the world?", listOf("Angkor Wat", "Borobudur", "Göbekli Tepe", "Karnak"), "Culture", "Located in modern-day Turkey, Göbekli Tepe is a Neolithic site dating to around 9600 BCE, making it the oldest known temple."),
            zh = LocalizedContent("世界上最古老的寺庙是什么？", listOf("吴哥窟", "婆罗浮屠", "哥贝克力石阵", "卡纳克神庙"), "文化", "位于现今土耳其的哥贝克力石阵是一处新石器时代遗址，可追溯到约公元前9600年，是已知最古老的寺庙。"),
            es = LocalizedContent("¿Cuál es el templo más antiguo del mundo?", listOf("Angkor Wat", "Borobudur", "Göbekli Tepe", "Karnak"), "Cultura", "Ubicado en la actual Turquía, Göbekli Tepe es un sitio neolítico que data de alrededor del 9600 a.C., lo que lo convierte en el templo más antiguo conocido.")
        ),
        BilingualQuestion(
            id = 50183, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel marcheur olympique a remporté le titre de 20 km?", listOf("Liu Hong", "Javier Sotomayor", "Jefferson Pérez", "Irina Privalova"), "Sport", "Jefferson Pérez a remporté la médaille d'or du 20 km marche aux Jeux olympiques d'Atlanta en 1996, devenant ainsi le premier champion olympique de l'Équateur."),
            en = LocalizedContent("Which Olympic race walker won the 20 km title?", listOf("Liu Hong", "Javier Sotomayor", "Jefferson Pérez", "Irina Privalova"), "Sports", "Jefferson Pérez won the gold medal in the 20 km race walk at the 1996 Atlanta Olympics, becoming Ecuador's first Olympic champion."),
            zh = LocalizedContent("哪位奥运竞走运动员赢得了20公里冠军？", listOf("刘虹", "哈维尔·索托马约尔", "杰斐逊·佩雷斯", "伊琳娜·普里瓦洛娃"), "体育", "杰斐逊·佩雷斯在1996年亚特兰大奥运会上赢得20公里竞走金牌，成为厄瓜多尔首位奥运冠军。"),
            es = LocalizedContent("¿Qué marchador olímpico ganó el título de 20 km?", listOf("Liu Hong", "Javier Sotomayor", "Jefferson Pérez", "Irina Privalova"), "Deportes", "Jefferson Pérez ganó la medalla de oro en los 20 km marcha en los Juegos Olímpicos de Atlanta 1996, convirtiéndose en el primer campeón olímpico de Ecuador.")
        ),
        BilingualQuestion(
            id = 50184, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a créé 'Oppenheimer'?", listOf("Martin Scorsese", "Christopher Nolan", "Denis Villeneuve", "David Fincher"), "Cinéma", "Christopher Nolan a écrit et réalisé 'Oppenheimer', un film biographique sur le physicien J. Robert Oppenheimer, sorti en 2023."),
            en = LocalizedContent("Which director created 'Oppenheimer'?", listOf("Martin Scorsese", "Christopher Nolan", "Denis Villeneuve", "David Fincher"), "Cinema", "Christopher Nolan wrote and directed 'Oppenheimer', a biographical film about physicist J. Robert Oppenheimer, released in 2023."),
            zh = LocalizedContent("哪位导演创作了《奥本海默》？", listOf("马丁·斯科塞斯", "克里斯托弗·诺兰", "丹尼斯·维伦纽瓦", "大卫·芬奇"), "电影", "克里斯托弗·诺兰编剧并执导了《奥本海默》，这是一部关于物理学家J·罗伯特·奥本海默的传记电影，于2023年上映。"),
            es = LocalizedContent("¿Qué director creó 'Oppenheimer'?", listOf("Martin Scorsese", "Christopher Nolan", "Denis Villeneuve", "David Fincher"), "Cine", "Christopher Nolan escribió y dirigió 'Oppenheimer', una película biográfica sobre el físico J. Robert Oppenheimer, estrenada en 2023.")
        ),
        BilingualQuestion(
            id = 50185, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel rappeur français a créé l'album 'Musique Noire'?", listOf("Alpha Wann", "Laylow", "Nekfeu", "Gims"), "Musique", "Laylow a sorti l'album 'Musique Noire' en 2021, un projet conceptuel mêlant rap et influences électroniques qui a marqué sa discographie."),
            en = LocalizedContent("Which French rapper created the album 'Musique Noire'?", listOf("Alpha Wann", "Laylow", "Nekfeu", "Gims"), "Music", "Laylow released the album 'Musique Noire' in 2021, a conceptual project blending rap and electronic influences that marked his discography."),
            zh = LocalizedContent("哪位法国说唱歌手创作了专辑《Musique Noire》？", listOf("Alpha Wann", "Laylow", "Nekfeu", "Gims"), "音乐", "Laylow于2021年发行了专辑《Musique Noire》，这是一个融合说唱和电子音乐的概念项目，标志着他音乐生涯的重要作品。"),
            es = LocalizedContent("¿Qué rapero francés creó el álbum 'Musique Noire'?", listOf("Alpha Wann", "Laylow", "Nekfeu", "Gims"), "Musica", "Laylow lanzó el álbum 'Musique Noire' en 2021, un proyecto conceptual que mezcla rap e influencias electrónicas que marcó su discografía.")
        ),
        BilingualQuestion(
            id = 50186, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le mur de Berlin a-t-il été construit?", listOf("1960", "1961", "1962", "1963"), "Histoire", "Le mur de Berlin a été érigé en 1961 par la République démocratique allemande pour stopper l'exode massif de ses citoyens vers l'Ouest."),
            en = LocalizedContent("In which year was the Berlin Wall built?", listOf("1960", "1961", "1962", "1963"), "History", "The Berlin Wall was erected in 1961 by the German Democratic Republic to stop the mass exodus of its citizens to the West."),
            zh = LocalizedContent("柏林墙是哪一年建造的？", listOf("1960", "1961", "1962", "1963"), "历史", "柏林墙于1961年由德意志民主共和国建造，以阻止其公民大规模逃往西方。"),
            es = LocalizedContent("¿En qué año se construyó el Muro de Berlín?", listOf("1960", "1961", "1962", "1963"), "Historia", "El Muro de Berlín fue erigido en 1961 por la República Democrática Alemana para detener el éxodo masivo de sus ciudadanos hacia el Oeste.")
        ),
        BilingualQuestion(
            id = 50187, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus dense élément du tableau périodique?", listOf("Tungstène", "Or", "Plutonium", "Osmium"), "Science", "L'osmium est considéré comme l'élément le plus dense, avec une densité d'environ 22,59 g/cm³, devançant de peu l'iridium. Cette propriété est due à sa structure atomique compacte et à son poids atomique élevé."),
            en = LocalizedContent("What is the densest element on the periodic table?", listOf("Tungsten", "Gold", "Plutonium", "Osmium"), "Science", "Osmium is considered the densest element, with a density of about 22.59 g/cm³, slightly ahead of iridium. This property is due to its compact atomic structure and high atomic weight."),
            zh = LocalizedContent("元素周期表上密度最大的元素是什么？", listOf("钨", "金", "钚", "锇"), "科学", "锇被认为是密度最大的元素，密度约为22.59克/立方厘米，略高于铱。这一特性归因于其紧凑的原子结构和高原子量。"),
            es = LocalizedContent("¿Cuál es el elemento más denso de la tabla periódica?", listOf("Tungsteno", "Oro", "Plutonio", "Osmio"), "Ciencia", "El osmio es considerado el elemento más denso, con una densidad de aproximadamente 22,59 g/cm³, superando ligeramente al iridio. Esta propiedad se debe a su estructura atómica compacta y su alto peso atómico.")
        ),
        BilingualQuestion(
            id = 50188, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le point culminant du continent antarctique?", listOf("Mont Erebus", "Mont Vinson", "Mont Tyree", "Mont Shinn"), "Géographie", "Le mont Vinson, culminant à 4 892 mètres, est le sommet le plus élevé de l'Antarctique, situé dans la chaîne Sentinel des monts Ellsworth."),
            en = LocalizedContent("What is the highest point of the Antarctic continent?", listOf("Mount Erebus", "Mount Vinson", "Mount Tyree", "Mount Shinn"), "Geography", "Mount Vinson, at 4,892 meters, is the highest peak in Antarctica, located in the Sentinel Range of the Ellsworth Mountains."),
            zh = LocalizedContent("南极洲大陆的最高点是什么？", listOf("埃里伯斯山", "文森山", "泰里山", "希恩山"), "地理", "文森山海拔4892米，是南极洲的最高峰，位于埃尔斯沃思山脉的森蒂纳尔岭。"),
            es = LocalizedContent("¿Cuál es el punto más alto del continente antártico?", listOf("Monte Erebus", "Monte Vinson", "Monte Tyree", "Monte Shinn"), "Geografia", "El monte Vinson, con 4.892 metros, es el pico más alto de la Antártida, ubicado en la cordillera Sentinel de los montes Ellsworth.")
        ),
        BilingualQuestion(
            id = 50189, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand musée d'art du monde?", listOf("Louvre", "Metropolitan", "British Museum", "Vatican"), "Culture", "Le Louvre à Paris est le plus grand musée d'art du monde en termes de superficie et de collections, avec plus de 380 000 œuvres."),
            en = LocalizedContent("What is the largest art museum in the world?", listOf("Louvre", "Metropolitan", "British Museum", "Vatican"), "Culture", "The Louvre in Paris is the largest art museum in the world in terms of area and collections, with over 380,000 works."),
            zh = LocalizedContent("世界上最大的艺术博物馆是什么？", listOf("卢浮宫", "大都会艺术博物馆", "大英博物馆", "梵蒂冈博物馆"), "文化", "巴黎的卢浮宫是世界上面积和藏品量最大的艺术博物馆，拥有超过38万件作品。"),
            es = LocalizedContent("¿Cuál es el museo de arte más grande del mundo?", listOf("Louvre", "Metropolitan", "British Museum", "Vaticano"), "Cultura", "El Louvre en París es el museo de arte más grande del mundo en términos de superficie y colecciones, con más de 380.000 obras.")
        ),
        BilingualQuestion(
            id = 50190, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel judoka français a remporté un titre olympique?", listOf("Teddy Riner", "Nicolas Chilès", "Marie-Pierre Rixain", "Djamel Bouras"), "Sport", "Teddy Riner est le judoka français le plus titré, avec trois médailles d'or olympiques (2012, 2016 et en individuel en 2020)."),
            en = LocalizedContent("Which French judoka won an Olympic title?", listOf("Teddy Riner", "Nicolas Chilès", "Marie-Pierre Rixain", "Djamel Bouras"), "Sports", "Teddy Riner is the most decorated French judoka, with three Olympic gold medals (2012, 2016, and individual in 2020)."),
            zh = LocalizedContent("哪位法国柔道运动员赢得了奥运冠军？", listOf("泰迪·里纳", "尼古拉·希莱斯", "玛丽-皮埃尔·里赛因", "贾梅尔·布拉斯"), "体育", "泰迪·里纳是获得荣誉最多的法国柔道运动员，拥有三枚奥运金牌（2012年、2016年和2020年个人项目）。"),
            es = LocalizedContent("¿Qué yudoca francés ganó un título olímpico?", listOf("Teddy Riner", "Nicolas Chilès", "Marie-Pierre Rixain", "Djamel Bouras"), "Deportes", "Teddy Riner es el yudoca francés más laureado, con tres medallas de oro olímpicas (2012, 2016 e individual en 2020).")
        ),
        BilingualQuestion(
            id = 50191, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de super-héros a remporté l'Oscar du meilleur film en 2023?", listOf("Black Panther", "Everything Everywhere All at Once", "Doctor Strange", "The Marvels"), "Cinéma", "Everything Everywhere All at Once a remporté l'Oscar du meilleur film en 2023, devenant le premier film de super-héros à obtenir cette récompense, grâce à son mélange original d'action, de science-fiction et de drame familial."),
            en = LocalizedContent("Which superhero film won the Oscar for Best Picture in 2023?", listOf("Black Panther", "Everything Everywhere All at Once", "Doctor Strange", "The Marvels"), "Cinema", "Everything Everywhere All at Once won the Oscar for Best Picture in 2023, becoming the first superhero film to receive this award, thanks to its original blend of action, science fiction, and family drama."),
            zh = LocalizedContent("哪部超级英雄电影在2023年获得了奥斯卡最佳影片奖？", listOf("黑豹", "瞬息全宇宙", "奇异博士", "惊奇队长2"), "电影", "《瞬息全宇宙》在2023年获得了奥斯卡最佳影片奖，成为首部获得此奖项的超级英雄电影，这得益于其动作、科幻和家庭剧的原创融合。"),
            es = LocalizedContent("¿Qué película de superhéroes ganó el Óscar a la mejor película en 2023?", listOf("Black Panther", "Everything Everywhere All at Once", "Doctor Strange", "The Marvels"), "Cine", "Everything Everywhere All at Once ganó el Óscar a la mejor película en 2023, convirtiéndose en la primera película de superhéroes en recibir este premio, gracias a su original mezcla de acción, ciencia ficción y drama familiar.")
        ),
        BilingualQuestion(
            id = 50192, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel chanteur sud-coréen a créé 'Gangnam Style'?", listOf("T.O.P", "PSY", "Jay Park", "Yoon Mi-rae"), "Musique", "PSY, de son vrai nom Park Jae-sang, a connu un succès mondial en 2012 avec ce titre, devenu viral grâce à sa chorégraphie et son clip humoristique."),
            en = LocalizedContent("Which South Korean singer created 'Gangnam Style'?", listOf("T.O.P", "PSY", "Jay Park", "Yoon Mi-rae"), "Music", "PSY, whose real name is Park Jae-sang, achieved worldwide success in 2012 with this song, which went viral thanks to its choreography and humorous music video."),
            zh = LocalizedContent("哪位韩国歌手创作了《江南Style》？", listOf("T.O.P", "PSY", "朴宰范", "尹美莱"), "音乐", "PSY，本名朴载相，在2012年凭借这首歌取得了全球性的成功，因其舞蹈编排和幽默的音乐视频而走红。"),
            es = LocalizedContent("¿Qué cantante surcoreano creó 'Gangnam Style'?", listOf("T.O.P", "PSY", "Jay Park", "Yoon Mi-rae"), "Musica", "PSY, cuyo nombre real es Park Jae-sang, logró un éxito mundial en 2012 con este tema, que se volvió viral gracias a su coreografía y su divertido videoclip.")
        ),
        BilingualQuestion(
            id = 50193, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe a écrit 'Le Contrat social'?", listOf("Voltaire", "Jean-Jacques Rousseau", "Montesquieu", "Diderot"), "Histoire", "Philosophe des Lumières, Rousseau publie Le Contrat social en 1762, où il théorise la souveraineté du peuple et le pacte social comme fondement de la légitimité politique."),
            en = LocalizedContent("Which philosopher wrote 'The Social Contract'?", listOf("Voltaire", "Jean-Jacques Rousseau", "Montesquieu", "Diderot"), "History", "A philosopher of the Enlightenment, Rousseau published The Social Contract in 1762, in which he theorized the sovereignty of the people and the social pact as the foundation of political legitimacy."),
            zh = LocalizedContent("哪位哲学家写了《社会契约论》？", listOf("伏尔泰", "让-雅克·卢梭", "孟德斯鸠", "狄德罗"), "历史", "启蒙运动哲学家卢梭于1762年出版了《社会契约论》，他在书中阐述了人民主权和社会契约作为政治合法性基础的理论。"),
            es = LocalizedContent("¿Qué filósofo escribió 'El contrato social'?", listOf("Voltaire", "Jean-Jacques Rousseau", "Montesquieu", "Diderot"), "Historia", "Filósofo de la Ilustración, Rousseau publicó El contrato social en 1762, donde teoriza la soberanía del pueblo y el pacto social como fundamento de la legitimidad política.")
        ),
        BilingualQuestion(
            id = 50194, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien âge de la géologie?", listOf("Archéen", "Hadéen", "Protérozoïque", "Paléozoïque"), "Science", "L'Hadéen est la première ère de l'histoire de la Terre, s'étendant de sa formation il y a 4,6 milliards d'années jusqu'à environ 4 milliards d'années, avant l'apparition des premières roches solides conservées."),
            en = LocalizedContent("What is the oldest geological age?", listOf("Archean", "Hadean", "Proterozoic", "Paleozoic"), "Science", "The Hadean is the first era of Earth's history, spanning from its formation 4.6 billion years ago to about 4 billion years ago, before the appearance of the oldest preserved solid rocks."),
            zh = LocalizedContent("最古老的地质年代是什么？", listOf("太古宙", "冥古宙", "元古宙", "古生代"), "科学", "冥古宙是地球历史的第一个时期，从46亿年前地球形成持续到约40亿年前，在最早的固体岩石出现之前。"),
            es = LocalizedContent("¿Cuál es la era geológica más antigua?", listOf("Arcaico", "Hadeano", "Proterozoico", "Paleozoico"), "Ciencia", "El Hadeano es la primera era de la historia de la Tierra, que abarca desde su formación hace 4600 millones de años hasta hace unos 4000 millones de años, antes de la aparición de las rocas sólidas más antiguas conservadas.")
        ),
        BilingualQuestion(
            id = 50195, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand delta du monde?", listOf("Delta du Gange", "Delta du Mékong", "Delta du Mississipi", "Delta du Danube"), "Géographie", "Le delta du Gange, situé principalement au Bangladesh et en Inde, est le plus grand du monde en superficie, formé par les fleuves Gange et Brahmapoutre."),
            en = LocalizedContent("What is the largest delta in the world?", listOf("Ganges Delta", "Mekong Delta", "Mississippi Delta", "Danube Delta"), "Geography", "The Ganges Delta, located mainly in Bangladesh and India, is the largest delta in the world by area, formed by the Ganges and Brahmaputra rivers."),
            zh = LocalizedContent("世界上最大的三角洲是什么？", listOf("恒河三角洲", "湄公河三角洲", "密西西比河三角洲", "多瑙河三角洲"), "地理", "恒河三角洲主要位于孟加拉国和印度，由恒河和布拉马普特拉河冲积形成，是世界上面积最大的三角洲。"),
            es = LocalizedContent("¿Cuál es el delta más grande del mundo?", listOf("Delta del Ganges", "Delta del Mekong", "Delta del Misisipi", "Delta del Danubio"), "Geografia", "El delta del Ganges, ubicado principalmente en Bangladés y la India, es el más grande del mundo en superficie, formado por los ríos Ganges y Brahmaputra.")
        ),
        BilingualQuestion(
            id = 50196, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien sport olympique?", listOf("Course à pied", "Lutte", "Boxe", "Pentathlon"), "Culture", "La course à pied, notamment le stade (environ 192 mètres), était la seule épreuve des premiers Jeux olympiques antiques en 776 av. J.-C."),
            en = LocalizedContent("What is the oldest Olympic sport?", listOf("Running", "Wrestling", "Boxing", "Pentathlon"), "Culture", "Running, specifically the stadion (about 192 meters), was the only event at the first ancient Olympic Games in 776 BC."),
            zh = LocalizedContent("最古老的奥运项目是什么？", listOf("赛跑", "摔跤", "拳击", "五项全能"), "文化", "赛跑，特别是短跑（约192米），是公元前776年首届古代奥运会的唯一比赛项目。"),
            es = LocalizedContent("¿Cuál es el deporte olímpico más antiguo?", listOf("Carrera a pie", "Lucha", "Boxeo", "Pentatlón"), "Cultura", "La carrera a pie, específicamente el estadio (unos 192 metros), fue la única prueba en los primeros Juegos Olímpicos antiguos en el 776 a.C.")
        ),
        BilingualQuestion(
            id = 50197, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel équipe de baseball a remporté la Série mondiale 2022?", listOf("Houston Astros", "Los Angeles Dodgers", "Boston Red Sox", "New York Yankees"), "Sport", "Les Astros de Houston ont battu les Phillies de Philadelphie en six matchs pour remporter leur deuxième titre de Série mondiale, en 2022."),
            en = LocalizedContent("Which baseball team won the 2022 World Series?", listOf("Houston Astros", "Los Angeles Dodgers", "Boston Red Sox", "New York Yankees"), "Sports", "The Houston Astros defeated the Philadelphia Phillies in six games to win their second World Series title in 2022."),
            zh = LocalizedContent("哪支棒球队赢得了2022年世界大赛？", listOf("休斯顿太空人", "洛杉矶道奇", "波士顿红袜", "纽约洋基"), "体育", "休斯顿太空人在六场比赛中击败费城费城人，赢得了2022年的第二个世界大赛冠军。"),
            es = LocalizedContent("¿Qué equipo de béisbol ganó la Serie Mundial de 2022?", listOf("Houston Astros", "Los Angeles Dodgers", "Boston Red Sox", "New York Yankees"), "Deportes", "Los Astros de Houston derrotaron a los Phillies de Filadelfia en seis juegos para ganar su segundo título de la Serie Mundial en 2022.")
        ),
        BilingualQuestion(
            id = 50198, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a créé 'Le Cinquième Élément'?", listOf("Jean-Pierre Jeunet", "Luc Besson", "Mathieu Kassovitz", "Bong Joon-ho"), "Cinéma", "Luc Besson a réalisé et coécrit ce film de science-fiction sorti en 1997, avec Bruce Willis et Milla Jovovich."),
            en = LocalizedContent("Which director created 'The Fifth Element'?", listOf("Jean-Pierre Jeunet", "Luc Besson", "Mathieu Kassovitz", "Bong Joon-ho"), "Cinema", "Luc Besson directed and co-wrote this science fiction film released in 1997, starring Bruce Willis and Milla Jovovich."),
            zh = LocalizedContent("哪位导演创作了《第五元素》？", listOf("让-皮埃尔·热内", "吕克·贝松", "马修·卡索维茨", "奉俊昊"), "电影", "吕克·贝松执导并联合编剧了这部1997年上映的科幻电影，由布鲁斯·威利斯和米拉·乔沃维奇主演。"),
            es = LocalizedContent("¿Qué director creó 'El quinto elemento'?", listOf("Jean-Pierre Jeunet", "Luc Besson", "Mathieu Kassovitz", "Bong Joon-ho"), "Cine", "Luc Besson dirigió y coescribió esta película de ciencia ficción estrenada en 1997, protagonizada por Bruce Willis y Milla Jovovich.")
        ),
        BilingualQuestion(
            id = 50199, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel groupe de heavy metal a créé 'Master of Puppets'?", listOf("Black Sabbath", "Metallica", "Iron Maiden", "Judas Priest"), "Musique", "Metallica a sorti 'Master of Puppets' en 1986 sur leur troisième album du même nom, considéré comme un classique du thrash metal."),
            en = LocalizedContent("Which heavy metal band created 'Master of Puppets'?", listOf("Black Sabbath", "Metallica", "Iron Maiden", "Judas Priest"), "Music", "Metallica released 'Master of Puppets' in 1986 on their third album of the same name, considered a classic of thrash metal."),
            zh = LocalizedContent("哪支重金属乐队创作了《Master of Puppets》？", listOf("黑色安息日", "金属乐队", "铁娘子", "犹大圣徒"), "音乐", "金属乐队于1986年在他们的第三张同名专辑中发布了《Master of Puppets》，被认为是激流金属的经典之作。"),
            es = LocalizedContent("¿Qué banda de heavy metal creó 'Master of Puppets'?", listOf("Black Sabbath", "Metallica", "Iron Maiden", "Judas Priest"), "Musica", "Metallica lanzó 'Master of Puppets' en 1986 en su tercer álbum del mismo nombre, considerado un clásico del thrash metal.")
        ),
    )

    private fun part3(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 50200, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel conquérant a créé l'Empire mongoL?", listOf("Kublai Khan", "Gengis Khan", "Tamerlan", "Ögedei Khan"), "Histoire", "Gengis Khan a unifié les tribus mongoles au début du XIIIe siècle et a fondé l'Empire mongol, le plus vaste empire contigu de l'histoire."),
            en = LocalizedContent("Which conqueror created the Mongol Empire?", listOf("Kublai Khan", "Genghis Khan", "Tamerlane", "Ögedei Khan"), "History", "Genghis Khan united the Mongol tribes in the early 13th century and founded the Mongol Empire, the largest contiguous empire in history."),
            zh = LocalizedContent("哪位征服者建立了蒙古帝国？", listOf("忽必烈", "成吉思汗", "帖木儿", "窝阔台"), "历史", "成吉思汗在13世纪初统一了蒙古部落，建立了蒙古帝国，这是历史上最大的连续帝国。"),
            es = LocalizedContent("¿Qué conquistador creó el Imperio mongol?", listOf("Kublai Khan", "Gengis Khan", "Tamerlán", "Ögedei Khan"), "Historia", "Gengis Khan unificó las tribus mongolas a principios del siglo XIII y fundó el Imperio mongol, el imperio contiguo más extenso de la historia.")
        ),
        BilingualQuestion(
            id = 50201, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel équipe a remporté la Coupe du Monde de rugby en 2023?", listOf("Nouvelle-Zélande", "Afrique du Sud", "France", "Australie"), "Sport", "La France a remporté la Coupe du Monde de rugby en 2023 en battant la Nouvelle-Zélande en finale."),
            en = LocalizedContent("Which team won the Rugby World Cup in 2023?", listOf("New Zealand", "South Africa", "France", "Australia"), "Sports", "France won the Rugby World Cup in 2023 by defeating New Zealand in the final."),
            zh = LocalizedContent("哪支球队赢得了2023年橄榄球世界杯？", listOf("新西兰", "南非", "法国", "澳大利亚"), "体育", "法国队在决赛中击败新西兰队，赢得了2023年橄榄球世界杯。"),
            es = LocalizedContent("¿Qué equipo ganó la Copa del Mundo de rugby en 2023?", listOf("Nueva Zelanda", "Sudáfrica", "Francia", "Australia"), "Deportes", "Francia ganó la Copa del Mundo de rugby en 2023 al vencer a Nueva Zelanda en la final.")
        ),
        BilingualQuestion(
            id = 50202, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film a marqué le début de l'ère MCU?", listOf("Iron Man", "The Incredible Hulk", "Thor", "Captain America"), "Cinéma", "Iron Man, sorti en 2008, a lancé l'univers cinématographique Marvel avec la scène post-générique introduisant Nick Fury et l'initiative Avengers."),
            en = LocalizedContent("Which film marked the beginning of the MCU era?", listOf("Iron Man", "The Incredible Hulk", "Thor", "Captain America"), "Cinema", "Iron Man, released in 2008, launched the Marvel Cinematic Universe with the post-credits scene introducing Nick Fury and the Avengers initiative."),
            zh = LocalizedContent("哪部电影标志着MCU时代的开始？", listOf("钢铁侠", "无敌浩克", "雷神", "美国队长"), "电影", "2008年上映的《钢铁侠》开启了漫威电影宇宙，片尾彩蛋引入了尼克·弗瑞和复仇者计划。"),
            es = LocalizedContent("¿Qué película marcó el comienzo de la era del UCM?", listOf("Iron Man", "The Incredible Hulk", "Thor", "Captain America"), "Cine", "Iron Man, estrenada en 2008, lanzó el Universo Cinematográfico de Marvel con la escena post-créditos que presenta a Nick Fury y la iniciativa Vengadores.")
        ),
        BilingualQuestion(
            id = 50203, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel compositeur a écrit 'Clair de lune'?", listOf("Debussy", "Chopin", "Saint-Saëns", "Massenet"), "Musique", "Clair de lune est le troisième mouvement de la Suite bergamasque de Claude Debussy, composée entre 1890 et 1905."),
            en = LocalizedContent("Which composer wrote 'Clair de lune'?", listOf("Debussy", "Chopin", "Saint-Saëns", "Massenet"), "Music", "Clair de lune is the third movement of Claude Debussy's Suite bergamasque, composed between 1890 and 1905."),
            zh = LocalizedContent("哪位作曲家创作了《月光》？", listOf("德彪西", "肖邦", "圣桑", "马斯内"), "音乐", "《月光》是克劳德·德彪西《贝加莫组曲》的第三乐章，创作于1890年至1905年间。"),
            es = LocalizedContent("¿Qué compositor escribió 'Claro de luna'?", listOf("Debussy", "Chopin", "Saint-Saëns", "Massenet"), "Música", "Claro de luna es el tercer movimiento de la Suite bergamasque de Claude Debussy, compuesta entre 1890 y 1905.")
        ),
        BilingualQuestion(
            id = 50204, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année l'Inde a-t-elle obtenu son indépendance?", listOf("1945", "1946", "1947", "1948"), "Histoire", "L'indépendance de l'Inde a été proclamée le 15 août 1947, mettant fin à près de deux siècles de domination coloniale britannique."),
            en = LocalizedContent("In which year did India gain independence?", listOf("1945", "1946", "1947", "1948"), "History", "India's independence was proclaimed on August 15, 1947, ending nearly two centuries of British colonial rule."),
            zh = LocalizedContent("印度在哪一年获得独立？", listOf("1945", "1946", "1947", "1948"), "历史", "印度于1947年8月15日宣布独立，结束了近两个世纪的英国殖民统治。"),
            es = LocalizedContent("¿En qué año obtuvo la India su independencia?", listOf("1945", "1946", "1947", "1948"), "Historia", "La independencia de la India fue proclamada el 15 de agosto de 1947, poniendo fin a casi dos siglos de dominio colonial británico.")
        ),
        BilingualQuestion(
            id = 50205, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand type de cellule dans le corps humain?", listOf("Neurone", "Globule rouge", "Ovule", "Cellule intestinale"), "Science", "L'ovule est la plus grande cellule humaine, visible à l'œil nu avec un diamètre d'environ 0,1 millimètre, bien plus volumineuse que les spermatozoïdes ou les cellules sanguines."),
            en = LocalizedContent("What is the largest type of cell in the human body?", listOf("Neuron", "Red blood cell", "Ovum", "Intestinal cell"), "Science", "The ovum is the largest human cell, visible to the naked eye with a diameter of about 0.1 millimeters, much larger than sperm or blood cells."),
            zh = LocalizedContent("人体中最大的细胞类型是什么？", listOf("神经元", "红细胞", "卵子", "肠细胞"), "科学", "卵子是人体最大的细胞，直径约0.1毫米，肉眼可见，比精子或血细胞大得多。"),
            es = LocalizedContent("¿Cuál es el tipo de célula más grande del cuerpo humano?", listOf("Neurona", "Glóbulo rojo", "Óvulo", "Célula intestinal"), "Ciencia", "El óvulo es la célula humana más grande, visible a simple vista con un diámetro de aproximadamente 0,1 milímetros, mucho más grande que los espermatozoides o las células sanguíneas.")
        ),
        BilingualQuestion(
            id = 50206, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand pays en population d'Afrique?", listOf("Égypte", "Nigeria", "Éthiopie", "Tanzanie"), "Géographie", "Avec plus de 220 millions d'habitants, le Nigeria est le pays le plus peuplé d'Afrique, devant l'Éthiopie et l'Égypte."),
            en = LocalizedContent("Which is the most populous country in Africa?", listOf("Egypt", "Nigeria", "Ethiopia", "Tanzania"), "Geography", "With over 220 million inhabitants, Nigeria is the most populous country in Africa, ahead of Ethiopia and Egypt."),
            zh = LocalizedContent("非洲人口最多的国家是哪个？", listOf("埃及", "尼日利亚", "埃塞俄比亚", "坦桑尼亚"), "地理", "尼日利亚拥有超过2.2亿人口，是非洲人口最多的国家，领先于埃塞俄比亚和埃及。"),
            es = LocalizedContent("¿Cuál es el país más poblado de África?", listOf("Egipto", "Nigeria", "Etiopía", "Tanzania"), "Geografía", "Con más de 220 millones de habitantes, Nigeria es el país más poblado de África, por delante de Etiopía y Egipto.")
        ),
        BilingualQuestion(
            id = 50207, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien animal domestiqué par l'homme?", listOf("Chat", "Chien", "Cheval", "Mouton"), "Culture", "Le chien a été domestiqué il y a environ 15 000 à 40 000 ans, bien avant d'autres animaux comme les chèvres ou les moutons. Des preuves archéologiques et génétiques montrent qu'il descend du loup gris et a été le premier compagnon animal de l'homme."),
            en = LocalizedContent("What is the oldest animal domesticated by humans?", listOf("Cat", "Dog", "Horse", "Sheep"), "Culture", "The dog was domesticated about 15,000 to 40,000 years ago, long before other animals like goats or sheep. Archaeological and genetic evidence shows it descended from the gray wolf and was the first animal companion of humans."),
            zh = LocalizedContent("人类最早驯化的动物是什么？", listOf("猫", "狗", "马", "羊"), "文化", "狗在大约1.5万至4万年前被驯化，远早于山羊或绵羊等其他动物。考古和遗传证据表明，狗由灰狼驯化而来，是人类最早的动物伙伴。"),
            es = LocalizedContent("¿Cuál es el animal más antiguo domesticado por el ser humano?", listOf("Gato", "Perro", "Caballo", "Oveja"), "Cultura", "El perro fue domesticado hace aproximadamente 15.000 a 40.000 años, mucho antes que otros animales como cabras u ovejas. Evidencias arqueológicas y genéticas muestran que desciende del lobo gris y fue el primer compañero animal del ser humano.")
        ),
        BilingualQuestion(
            id = 50208, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel équipe de basketball a remporté le plus de titres NBA?", listOf("Lakers", "Celtics", "Bulls", "Warriors"), "Sport", "Les Celtics de Boston détiennent le record du plus grand nombre de titres NBA avec 18 championnats, dont le dernier remporté en 2024."),
            en = LocalizedContent("Which basketball team has won the most NBA titles?", listOf("Lakers", "Celtics", "Bulls", "Warriors"), "Sports", "The Boston Celtics hold the record for the most NBA championships with 18 titles, the most recent won in 2024."),
            zh = LocalizedContent("哪支篮球队赢得了最多的NBA总冠军？", listOf("湖人", "凯尔特人", "公牛", "勇士"), "体育", "波士顿凯尔特人队以18次总冠军保持着NBA夺冠次数最多的纪录，最近一次是在2024年。"),
            es = LocalizedContent("¿Qué equipo de baloncesto ha ganado más títulos de la NBA?", listOf("Lakers", "Celtics", "Bulls", "Warriors"), "Deportes", "Los Boston Celtics tienen el récord de más campeonatos de la NBA con 18 títulos, el último ganado en 2024.")
        ),
        BilingualQuestion(
            id = 50209, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film d'animation de Ghibli a remporté l'Oscar?", listOf("Spirited Away", "Howl's Moving Castle", "Arrietty", "Ponyo"), "Cinéma", "Spirited Away, réalisé par Hayao Miyazaki, a remporté l'Oscar du meilleur film d'animation en 2003, devenant ainsi le premier film non anglophone à gagner cette catégorie."),
            en = LocalizedContent("Which Ghibli animated film won an Oscar?", listOf("Spirited Away", "Howl's Moving Castle", "Arrietty", "Ponyo"), "Cinema", "Spirited Away, directed by Hayao Miyazaki, won the Oscar for Best Animated Feature in 2003, becoming the first non-English language film to win this category."),
            zh = LocalizedContent("哪部吉卜力动画电影获得了奥斯卡奖？", listOf("千与千寻", "哈尔的移动城堡", "借东西的小人阿莉埃蒂", "悬崖上的金鱼姬"), "电影", "宫崎骏执导的《千与千寻》在2003年获得了奥斯卡最佳动画长片奖，成为首部获得该奖项的非英语电影。"),
            es = LocalizedContent("¿Qué película de animación de Ghibli ganó un Oscar?", listOf("El viaje de Chihiro", "El castillo ambulante", "Arrietty", "Ponyo"), "Cine", "El viaje de Chihiro, dirigida por Hayao Miyazaki, ganó el Oscar a la mejor película de animación en 2003, convirtiéndose en la primera película no angloparlante en ganar esta categoría.")
        ),
        BilingualQuestion(
            id = 50210, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel chanteur britannique a créé 'God Save the Queen'?", listOf("Rolling Stones", "Sex Pistols", "The Who", "David Bowie"), "Musique", "Le groupe punk britannique Sex Pistols a sorti la chanson controversée \"God Save the Queen\" en 1977, pendant le jubilé d'argent de la reine Élisabeth II."),
            en = LocalizedContent("Which British singer created 'God Save the Queen'?", listOf("Rolling Stones", "Sex Pistols", "The Who", "David Bowie"), "Music", "The British punk band Sex Pistols released the controversial song \"God Save the Queen\" in 1977, during Queen Elizabeth II's Silver Jubilee."),
            zh = LocalizedContent("哪位英国歌手创作了《天佑女王》？", listOf("滚石乐队", "性手枪乐队", "谁人乐队", "大卫·鲍伊"), "音乐", "英国朋克乐队性手枪乐队于1977年女王伊丽莎白二世登基银禧纪念期间发行了争议歌曲《天佑女王》。"),
            es = LocalizedContent("¿Qué cantante británico creó 'God Save the Queen'?", listOf("Rolling Stones", "Sex Pistols", "The Who", "David Bowie"), "Musica", "La banda punk británica Sex Pistols lanzó la controvertida canción \"God Save the Queen\" en 1977, durante el jubileo de plata de la reina Isabel II.")
        ),
        BilingualQuestion(
            id = 50211, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien empire documenté?", listOf("Empire égyptien", "Empire babylonien", "Empire assyrien", "Empire romain"), "Histoire", "L'Empire babylonien, fondé au début du IIe millénaire avant J.-C., est considéré comme le plus ancien empire documenté grâce aux écrits cunéiformes et au célèbre Code d'Hammurabi."),
            en = LocalizedContent("What is the oldest documented empire?", listOf("Egyptian Empire", "Babylonian Empire", "Assyrian Empire", "Roman Empire"), "History", "The Babylonian Empire, founded in the early 2nd millennium BC, is considered the oldest documented empire thanks to cuneiform writings and the famous Code of Hammurabi."),
            zh = LocalizedContent("哪个是最早有记载的帝国？", listOf("埃及帝国", "巴比伦帝国", "亚述帝国", "罗马帝国"), "历史", "巴比伦帝国成立于公元前2000年初，因楔形文字和著名的汉谟拉比法典而被认为是最早有记载的帝国。"),
            es = LocalizedContent("¿Cuál es el imperio documentado más antiguo?", listOf("Imperio egipcio", "Imperio babilónico", "Imperio asirio", "Imperio romano"), "Historia", "El Imperio babilónico, fundado a principios del segundo milenio a.C., es considerado el imperio documentado más antiguo gracias a los escritos cuneiformes y al famoso Código de Hammurabi.")
        ),
        BilingualQuestion(
            id = 50212, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand type d'énergie renouvelable?", listOf("Éolienne", "Géothermique", "Hydroélectrique", "Solaire"), "Science", "L'hydroélectricité est la plus grande source d'énergie renouvelable au monde, représentant environ 60% de la production totale d'électricité renouvelable grâce à ses barrages et centrales hydrauliques."),
            en = LocalizedContent("What is the largest type of renewable energy?", listOf("Wind", "Geothermal", "Hydroelectric", "Solar"), "Science", "Hydroelectricity is the largest source of renewable energy in the world, accounting for about 60% of total renewable electricity generation thanks to its dams and hydro plants."),
            zh = LocalizedContent("哪种可再生能源规模最大？", listOf("风能", "地热能", "水力发电", "太阳能"), "科学", "水力发电是世界上最大的可再生能源来源，凭借其水坝和水电站，约占可再生电力总发电量的60%。"),
            es = LocalizedContent("¿Cuál es el tipo más grande de energía renovable?", listOf("Eólica", "Geotérmica", "Hidroeléctrica", "Solar"), "Ciencia", "La hidroelectricidad es la mayor fuente de energía renovable del mundo, representando aproximadamente el 60% de la generación total de electricidad renovable gracias a sus presas y centrales hidráulicas.")
        ),
        BilingualQuestion(
            id = 50213, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand pays sans accès à la mer?", listOf("Kazakhstan", "Mongolie", "Zambie", "Zimbabwe"), "Géographie", "Le Kazakhstan est le plus grand pays enclavé du monde, avec une superficie de plus de 2,7 millions de km², sans aucun accès direct à un océan."),
            en = LocalizedContent("What is the largest country without access to the sea?", listOf("Kazakhstan", "Mongolia", "Zambia", "Zimbabwe"), "Geography", "Kazakhstan is the largest landlocked country in the world, with an area of over 2.7 million km², without any direct access to an ocean."),
            zh = LocalizedContent("哪个是最大的内陆国？", listOf("哈萨克斯坦", "蒙古", "赞比亚", "津巴布韦"), "地理", "哈萨克斯坦是世界上最大的内陆国，面积超过270万平方公里，没有直接通往海洋的通道。"),
            es = LocalizedContent("¿Cuál es el país más grande sin acceso al mar?", listOf("Kazajistán", "Mongolia", "Zambia", "Zimbabue"), "Geografia", "Kazajistán es el país sin litoral más grande del mundo, con una superficie de más de 2,7 millones de km², sin acceso directo a un océano.")
        ),
        BilingualQuestion(
            id = 50214, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus vieux théâtre du monde?", listOf("Drury Lane", "Comedia dell'Arte", "Épidaure", "Teatro Olimpico"), "Culture", "Construit au IVe siècle avant J.-C., le théâtre d'Épidaure en Grèce est le plus ancien théâtre encore debout, réputé pour son acoustique exceptionnelle."),
            en = LocalizedContent("What is the oldest theater in the world?", listOf("Drury Lane", "Commedia dell'Arte", "Epidaurus", "Teatro Olimpico"), "Culture", "Built in the 4th century BC, the theater of Epidaurus in Greece is the oldest surviving theater, renowned for its exceptional acoustics."),
            zh = LocalizedContent("世界上最古老的剧院是哪个？", listOf("德鲁里巷剧院", "即兴喜剧", "埃皮达鲁斯剧场", "奥林匹克剧院"), "文化", "建于公元前4世纪的希腊埃皮达鲁斯剧场是现存最古老的剧院，以其卓越的音响效果而闻名。"),
            es = LocalizedContent("¿Cuál es el teatro más antiguo del mundo?", listOf("Drury Lane", "Comedia dell'Arte", "Epidauro", "Teatro Olímpico"), "Cultura", "Construido en el siglo IV a.C., el teatro de Epidauro en Grecia es el teatro más antiguo que se conserva, famoso por su excepcional acústica.")
        ),
        BilingualQuestion(
            id = 50215, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel nageur a remporté le plus de médailles olympiques?", listOf("Mark Spitz", "Michael Phelps", "Matt Biondi", "Shane Gould"), "Sport", "Michael Phelps détient le record du plus grand nombre de médailles olympiques remportées par un athlète, avec 28 médailles dont 23 en or, acquises lors des Jeux de 2004 à 2016."),
            en = LocalizedContent("Which swimmer has won the most Olympic medals?", listOf("Mark Spitz", "Michael Phelps", "Matt Biondi", "Shane Gould"), "Sports", "Michael Phelps holds the record for the most Olympic medals won by any athlete, with 28 medals including 23 golds, earned from the 2004 to 2016 Games."),
            zh = LocalizedContent("哪位游泳运动员获得奥运奖牌最多？", listOf("马克·斯皮茨", "迈克尔·菲尔普斯", "马特·比昂迪", "沙恩·古尔德"), "体育", "迈克尔·菲尔普斯保持着运动员获得奥运奖牌最多的纪录，共28枚奖牌，其中23枚金牌，来自2004年至2016年的奥运会。"),
            es = LocalizedContent("¿Qué nadador ha ganado más medallas olímpicas?", listOf("Mark Spitz", "Michael Phelps", "Matt Biondi", "Shane Gould"), "Deportes", "Michael Phelps tiene el récord de la mayor cantidad de medallas olímpicas ganadas por un atleta, con 28 medallas, incluidas 23 de oro, obtenidas en los Juegos de 2004 a 2016.")
        ),
        BilingualQuestion(
            id = 50216, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a créé la saga 'Back to the Future'?", listOf("Robert Zemeckis", "Steven Spielberg", "James Cameron", "Joe Dante"), "Cinéma", "Robert Zemeckis a coécrit et réalisé les trois films de la saga, sortis entre 1985 et 1990, avec une production de Steven Spielberg."),
            en = LocalizedContent("Which director created the 'Back to the Future' saga?", listOf("Robert Zemeckis", "Steven Spielberg", "James Cameron", "Joe Dante"), "Cinema", "Robert Zemeckis co-wrote and directed the three films of the saga, released between 1985 and 1990, with production by Steven Spielberg."),
            zh = LocalizedContent("哪位导演创作了《回到未来》系列？", listOf("罗伯特·泽米吉斯", "史蒂文·斯皮尔伯格", "詹姆斯·卡梅隆", "乔·丹特"), "电影", "罗伯特·泽米吉斯共同编剧并执导了该系列的三部电影，分别于1985年至1990年间上映，由史蒂文·斯皮尔伯格制作。"),
            es = LocalizedContent("¿Qué director creó la saga 'Regreso al futuro'?", listOf("Robert Zemeckis", "Steven Spielberg", "James Cameron", "Joe Dante"), "Cine", "Robert Zemeckis coescribió y dirigió las tres películas de la saga, estrenadas entre 1985 y 1990, con producción de Steven Spielberg.")
        ),
        BilingualQuestion(
            id = 50217, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel chanteur a créé 'Like a Virgin'?", listOf("Cyndi Lauper", "Madonna", "Janet Jackson", "Paula Abdul"), "Musique", "Madonna a sorti \"Like a Virgin\" en 1984 sur son deuxième album studio, et la chanson est devenue l'un de ses plus grands succès, symbolisant son image provocatrice et son ascension dans la pop culture."),
            en = LocalizedContent("Which singer created 'Like a Virgin'?", listOf("Cyndi Lauper", "Madonna", "Janet Jackson", "Paula Abdul"), "Music", "Madonna released \"Like a Virgin\" in 1984 on her second studio album, and the song became one of her biggest hits, symbolizing her provocative image and rise in pop culture."),
            zh = LocalizedContent("哪位歌手创作了《Like a Virgin》？", listOf("辛迪·劳帕", "麦当娜", "珍妮·杰克逊", "宝拉·阿巴杜"), "音乐", "麦当娜于1984年在她的第二张录音室专辑中发行了《Like a Virgin》，这首歌成为她最热门的歌曲之一，象征着她挑衅的形象和在流行文化中的崛起。"),
            es = LocalizedContent("¿Qué cantante creó 'Like a Virgin'?", listOf("Cyndi Lauper", "Madonna", "Janet Jackson", "Paula Abdul"), "Musica", "Madonna lanzó \"Like a Virgin\" en 1984 en su segundo álbum de estudio, y la canción se convirtió en uno de sus mayores éxitos, simbolizando su imagen provocativa y su ascenso en la cultura pop.")
        ),
        BilingualQuestion(
            id = 50218, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel événement a marqué le début de la Révolution française?", listOf("Prise de la Bastille", "Appel du Tiers-État", "Réunion des États généraux", "Nuit du 4 août"), "Histoire", "Le 14 juillet 1789, des Parisiens en colère prennent d'assaut la forteresse de la Bastille, symbole de l'autorité royale, déclenchant ainsi la Révolution française."),
            en = LocalizedContent("Which event marked the beginning of the French Revolution?", listOf("Storming of the Bastille", "Appeal of the Third Estate", "Meeting of the Estates-General", "Night of August 4"), "History", "On July 14, 1789, angry Parisians stormed the Bastille fortress, a symbol of royal authority, thus triggering the French Revolution."),
            zh = LocalizedContent("哪个事件标志着法国大革命的开始？", listOf("攻占巴士底狱", "第三等级呼吁", "三级会议召开", "八月四日之夜"), "历史", "1789年7月14日，愤怒的巴黎人攻占了巴士底狱，这座象征王权的堡垒，从而引发了法国大革命。"),
            es = LocalizedContent("¿Qué evento marcó el comienzo de la Revolución Francesa?", listOf("Toma de la Bastilla", "Llamamiento del Tercer Estado", "Reunión de los Estados Generales", "Noche del 4 de agosto"), "Historia", "El 14 de julio de 1789, parisinos enfurecidos asaltaron la fortaleza de la Bastilla, símbolo de la autoridad real, desencadenando así la Revolución Francesa.")
        ),
        BilingualQuestion(
            id = 50219, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus vieux fossile d'un être humain?", listOf("Lucy", "Homo erectus", "Homo habilis", "Homo neanderthalensis"), "Science", "Lucy, découverte en Éthiopie en 1974, est un fossile d’australopithèque vieux de 3,2 millions d’années, considéré comme l’un des plus anciens représentants de la lignée humaine."),
            en = LocalizedContent("What is the oldest fossil of a human being?", listOf("Lucy", "Homo erectus", "Homo habilis", "Homo neanderthalensis"), "Science", "Lucy, discovered in Ethiopia in 1974, is an australopithecine fossil 3.2 million years old, considered one of the oldest representatives of the human lineage."),
            zh = LocalizedContent("最古老的人类化石是什么？", listOf("露西", "直立人", "能人", "尼安德特人"), "科学", "1974年在埃塞俄比亚发现的露西是一具320万年前的南方古猿化石，被认为是人类谱系中最古老的代表之一。"),
            es = LocalizedContent("¿Cuál es el fósil más antiguo de un ser humano?", listOf("Lucy", "Homo erectus", "Homo habilis", "Homo neanderthalensis"), "Ciencia", "Lucy, descubierta en Etiopía en 1974, es un fósil de australopiteco de 3,2 millones de años, considerado uno de los representantes más antiguos del linaje humano.")
        ),
        BilingualQuestion(
            id = 50220, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le point le plus profond de l'océan?", listOf("Fosse des Mariannes", "Fosse de Kuril-Kamtchatka", "Fosse de Tonga", "Fosse de Porto Rico"), "Géographie", "La fosse des Mariannes, située dans l'océan Pacifique, atteint une profondeur de près de 11 000 mètres, ce qui en fait l'endroit le plus profond connu de la croûte terrestre."),
            en = LocalizedContent("What is the deepest point in the ocean?", listOf("Mariana Trench", "Kuril-Kamchatka Trench", "Tonga Trench", "Puerto Rico Trench"), "Geography", "The Mariana Trench, located in the Pacific Ocean, reaches a depth of nearly 11,000 meters, making it the deepest known point on Earth's crust."),
            zh = LocalizedContent("海洋中最深的点是什么？", listOf("马里亚纳海沟", "千岛-堪察加海沟", "汤加海沟", "波多黎各海沟"), "地理", "马里亚纳海沟位于太平洋，深度近11000米，是已知地壳最深点。"),
            es = LocalizedContent("¿Cuál es el punto más profundo del océano?", listOf("Fosa de las Marianas", "Fosa de Kuril-Kamchatka", "Fosa de Tonga", "Fosa de Puerto Rico"), "Geografía", "La fosa de las Marianas, ubicada en el océano Pacífico, alcanza una profundidad de casi 11 000 metros, siendo el punto más profundo conocido de la corteza terrestre.")
        ),
        BilingualQuestion(
            id = 50221, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien texte écrit connu?", listOf("Code de Hammourabi", "Tablettes sumériennes", "Papyrus égyptien", "Tablettes de l'Énuma Eliš"), "Culture", "Les tablettes sumériennes, gravées en écriture cunéiforme vers 3400 av. J.-C., sont les plus anciens textes écrits connus, découverts dans l'actuel Irak."),
            en = LocalizedContent("What is the oldest known written text?", listOf("Code of Hammurabi", "Sumerian tablets", "Egyptian papyrus", "Enuma Elish tablets"), "Culture", "The Sumerian tablets, inscribed in cuneiform around 3400 BC, are the oldest known written texts, discovered in present-day Iraq."),
            zh = LocalizedContent("已知最古老的文字是什么？", listOf("汉谟拉比法典", "苏美尔泥板", "埃及纸莎草", "埃努玛·埃利什泥板"), "文化", "苏美尔泥板约公元前3400年用楔形文字刻写，是已知最古老的文字，发现于今伊拉克。"),
            es = LocalizedContent("¿Cuál es el texto escrito más antiguo conocido?", listOf("Código de Hammurabi", "Tablas sumerias", "Papiro egipcio", "Tablas del Enuma Elish"), "Cultura", "Las tablas sumerias, grabadas en escritura cuneiforme hacia el 3400 a.C., son los textos escritos más antiguos conocidos, descubiertos en el actual Irak.")
        ),
        BilingualQuestion(
            id = 50222, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel coureur cycliste a remporté le plus de Tours de France?", listOf("Eddy Merckx", "Lance Armstrong", "Bernard Hinault", "Miguel Indurain"), "Sport", "Lance Armstrong a remporté sept Tours de France consécutifs de 1999 à 2005, un record, avant d'être disqualifié en 2012 pour dopage systématique."),
            en = LocalizedContent("Which cyclist has won the most Tour de France titles?", listOf("Eddy Merckx", "Lance Armstrong", "Bernard Hinault", "Miguel Indurain"), "Sports", "Lance Armstrong won seven consecutive Tour de France titles from 1999 to 2005, a record, before being disqualified in 2012 for systematic doping."),
            zh = LocalizedContent("哪位自行车手赢得了最多的环法自行车赛冠军？", listOf("埃迪·默克斯", "兰斯·阿姆斯特朗", "贝尔纳·伊诺", "米格尔·安杜兰"), "体育", "兰斯·阿姆斯特朗从1999年到2005年连续赢得七届环法冠军，创下纪录，后因系统性兴奋剂问题于2012年被取消资格。"),
            es = LocalizedContent("¿Qué ciclista ha ganado más Tours de Francia?", listOf("Eddy Merckx", "Lance Armstrong", "Bernard Hinault", "Miguel Indurain"), "Deportes", "Lance Armstrong ganó siete Tours de Francia consecutivos de 1999 a 2005, un récord, antes de ser descalificado en 2012 por dopaje sistemático.")
        ),
        BilingualQuestion(
            id = 50223, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film Netflix a remporté un Oscar du meilleur film?", listOf("The Irishman", "Roma", "The Power of the Dog", "Don't Look Up"), "Cinéma", "The Power of the Dog, réalisé par Jane Campion, a remporté l'Oscar du meilleur film en 2022, devenant le premier film Netflix à décrocher cette récompense."),
            en = LocalizedContent("Which Netflix film won an Oscar for Best Picture?", listOf("The Irishman", "Roma", "The Power of the Dog", "Don't Look Up"), "Cinema", "The Power of the Dog, directed by Jane Campion, won the Oscar for Best Picture in 2022, becoming the first Netflix film to achieve this award."),
            zh = LocalizedContent("哪部Netflix电影获得了奥斯卡最佳影片奖？", listOf("爱尔兰人", "罗马", "犬之力", "不要抬头"), "电影", "简·坎皮恩执导的《犬之力》在2022年获得奥斯卡最佳影片奖，成为首部获此殊荣的Netflix电影。"),
            es = LocalizedContent("¿Qué película de Netflix ganó un Oscar a la mejor película?", listOf("The Irishman", "Roma", "The Power of the Dog", "Don't Look Up"), "Cine", "The Power of the Dog, dirigida por Jane Campion, ganó el Oscar a la mejor película en 2022, convirtiéndose en la primera película de Netflix en obtener este premio.")
        ),
        BilingualQuestion(
            id = 50224, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel groupe de rock progressif a créé 'Wish You Were Here'?", listOf("Pink Floyd", "Yes", "Genesis", "Emerson Lake Palmer"), "Musique", "Pink Floyd a sorti l'album \"Wish You Were Here\" en 1975, dont la chanson titre est un hommage à leur ancien membre Syd Barrett, souffrant de troubles mentaux."),
            en = LocalizedContent("Which progressive rock band created 'Wish You Were Here'?", listOf("Pink Floyd", "Yes", "Genesis", "Emerson, Lake & Palmer"), "Music", "Pink Floyd released the album 'Wish You Were Here' in 1975, with the title track being a tribute to their former member Syd Barrett, who suffered from mental health issues."),
            zh = LocalizedContent("哪支前卫摇滚乐队创作了《Wish You Were Here》？", listOf("平克·弗洛伊德", "Yes", "创世纪", "艾默生、雷克与帕尔默"), "音乐", "平克·弗洛伊德于1975年发行专辑《Wish You Were Here》，同名曲致敬前成员西德·巴雷特，他患有精神疾病。"),
            es = LocalizedContent("¿Qué banda de rock progresivo creó 'Wish You Were Here'?", listOf("Pink Floyd", "Yes", "Genesis", "Emerson, Lake & Palmer"), "Música", "Pink Floyd lanzó el álbum 'Wish You Were Here' en 1975, cuya canción principal es un homenaje a su exmiembro Syd Barrett, quien sufría problemas mentales.")
        ),
        BilingualQuestion(
            id = 50225, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le nom de la première université au monde?", listOf("Université d'Al-Azhar", "Université de Bologne", "Université de Paris", "Université d'Oxford"), "Histoire", "Fondée en 970-972 au Caire, l'université d'Al-Azhar est souvent reconnue comme la plus ancienne université en activité continue au monde."),
            en = LocalizedContent("What was the name of the first university in the world?", listOf("Al-Azhar University", "University of Bologna", "University of Paris", "University of Oxford"), "History", "Founded in 970-972 in Cairo, Al-Azhar University is often recognized as the oldest continuously operating university in the world."),
            zh = LocalizedContent("世界上第一所大学叫什么？", listOf("爱资哈尔大学", "博洛尼亚大学", "巴黎大学", "牛津大学"), "历史", "爱资哈尔大学于970-972年在开罗成立，常被认为是世界上持续运作最古老的大学。"),
            es = LocalizedContent("¿Cuál fue el nombre de la primera universidad del mundo?", listOf("Universidad de Al-Azhar", "Universidad de Bolonia", "Universidad de París", "Universidad de Oxford"), "Historia", "Fundada en 970-972 en El Cairo, la Universidad de Al-Azhar es a menudo reconocida como la universidad en funcionamiento continuo más antigua del mundo.")
        ),
        BilingualQuestion(
            id = 50226, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac souterrain du monde?", listOf("Lac Vivi", "Lac Don Juan", "Lac Tigris", "Lac Erasmus"), "Science", "Le lac Vivi, situé en Namibie, est reconnu comme le plus grand lac souterrain du monde, découvert en 1986 dans la grotte de Dragon's Breath."),
            en = LocalizedContent("What is the largest underground lake in the world?", listOf("Lake Vivi", "Lake Don Juan", "Lake Tigris", "Lake Erasmus"), "Science", "Lake Vivi, located in Namibia, is recognized as the largest underground lake in the world, discovered in 1986 in Dragon's Breath Cave."),
            zh = LocalizedContent("世界上最大的地下湖是什么？", listOf("维维湖", "唐胡安湖", "底格里斯湖", "伊拉斯谟湖"), "科学", "维维湖位于纳米比亚，1986年在龙息洞被发现，被认为是世界上最大的地下湖。"),
            es = LocalizedContent("¿Cuál es el lago subterráneo más grande del mundo?", listOf("Lago Vivi", "Lago Don Juan", "Lago Tigris", "Lago Erasmus"), "Ciencia", "El lago Vivi, ubicado en Namibia, es reconocido como el lago subterráneo más grande del mundo, descubierto en 1986 en la cueva Dragon's Breath.")
        ),
        BilingualQuestion(
            id = 50227, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand détroit du monde?", listOf("Détroit de Béring", "Détroit de Magellan", "Pas-de-Calais", "Détroit de Drake"), "Géographie", "Le détroit de Drake, entre le cap Horn et l'Antarctique, est le plus large du monde avec environ 800 km, reliant les océans Atlantique et Pacifique."),
            en = LocalizedContent("What is the largest strait in the world?", listOf("Bering Strait", "Strait of Magellan", "Strait of Dover", "Drake Passage"), "Geography", "The Drake Passage, between Cape Horn and Antarctica, is the widest strait in the world at about 800 km, connecting the Atlantic and Pacific Oceans."),
            zh = LocalizedContent("世界上最大的海峡是什么？", listOf("白令海峡", "麦哲伦海峡", "多佛尔海峡", "德雷克海峡"), "地理", "德雷克海峡位于合恩角和南极洲之间，宽约800公里，是世界上最宽的海峡，连接大西洋和太平洋。"),
            es = LocalizedContent("¿Cuál es el estrecho más grande del mundo?", listOf("Estrecho de Bering", "Estrecho de Magallanes", "Paso de Calais", "Paso de Drake"), "Geografía", "El paso de Drake, entre el cabo de Hornos y la Antártida, es el estrecho más ancho del mundo con unos 800 km, conectando los océanos Atlántico y Pacífico.")
        ),
        BilingualQuestion(
            id = 50228, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand festival de musique du monde?", listOf("Tomorrowland", "Reading and Leeds", "Glastonbury", "Rock in Rio"), "Culture", "Rock in Rio détient le record du plus grand festival de musique au monde en termes d'affluence, avec plus de 700 000 spectateurs lors de son édition 2015 à Rio de Janeiro."),
            en = LocalizedContent("What is the largest music festival in the world?", listOf("Tomorrowland", "Reading and Leeds", "Glastonbury", "Rock in Rio"), "Culture", "Rock in Rio holds the record for the largest music festival in the world in terms of attendance, with over 700,000 spectators at its 2015 edition in Rio de Janeiro."),
            zh = LocalizedContent("世界上最大的音乐节是什么？", listOf("明日世界", "雷丁利兹", "格拉斯顿伯里", "里约摇滚"), "文化", "里约摇滚音乐节在出席人数上保持世界最大音乐节纪录，2015年里约热内卢届次有超过70万观众。"),
            es = LocalizedContent("¿Cuál es el festival de música más grande del mundo?", listOf("Tomorrowland", "Reading and Leeds", "Glastonbury", "Rock in Rio"), "Cultura", "Rock in Rio tiene el récord del festival de música más grande del mundo en términos de asistencia, con más de 700 000 espectadores en su edición de 2015 en Río de Janeiro.")
        ),
        BilingualQuestion(
            id = 50229, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel équipe de hockey a remporté le plus de Stanley Cups?", listOf("Toronto Maple Leafs", "Montreal Canadiens", "New York Rangers", "Boston Bruins"), "Sport", "Les Canadiens de Montréal ont remporté 24 Stanley Cups, un record dans la LNH, avec leur dernier titre en 1993."),
            en = LocalizedContent("Which hockey team has won the most Stanley Cups?", listOf("Toronto Maple Leafs", "Montreal Canadiens", "New York Rangers", "Boston Bruins"), "Sports", "The Montreal Canadiens have won 24 Stanley Cups, a record in the NHL, with their last title in 1993."),
            zh = LocalizedContent("哪支冰球队赢得了最多的斯坦利杯？", listOf("多伦多枫叶队", "蒙特利尔加拿大人队", "纽约游骑兵队", "波士顿棕熊队"), "体育", "蒙特利尔加拿大人队赢得了24次斯坦利杯，是NHL纪录，最近一次夺冠在1993年。"),
            es = LocalizedContent("¿Qué equipo de hockey ha ganado más Copas Stanley?", listOf("Toronto Maple Leafs", "Montreal Canadiens", "New York Rangers", "Boston Bruins"), "Deportes", "Los Canadiens de Montreal han ganado 24 Copas Stanley, un récord en la NHL, con su último título en 1993.")
        ),
        BilingualQuestion(
            id = 50230, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a créé 'Schindler's List'?", listOf("Roman Polanski", "Steven Spielberg", "Claude Lanzmann", "Agnieszka Holland"), "Cinéma", "Steven Spielberg a réalisé Schindler's List en 1993, s'inspirant du roman de Thomas Keneally sur Oskar Schindler, un industriel allemand ayant sauvé des Juifs pendant la Shoah."),
            en = LocalizedContent("Which director created 'Schindler's List'?", listOf("Roman Polanski", "Steven Spielberg", "Claude Lanzmann", "Agnieszka Holland"), "Cinema", "Steven Spielberg directed Schindler's List in 1993, based on Thomas Keneally's novel about Oskar Schindler, a German industrialist who saved Jews during the Holocaust."),
            zh = LocalizedContent("哪位导演创作了《辛德勒的名单》？", listOf("罗曼·波兰斯基", "史蒂文·斯皮尔伯格", "克洛德·朗兹曼", "阿格涅丝卡·霍兰"), "电影", "史蒂文·斯皮尔伯格于1993年执导了《辛德勒的名单》，该片改编自托马斯·肯尼利的小说，讲述德国工业家奥斯卡·辛德勒在大屠杀期间拯救犹太人的故事。"),
            es = LocalizedContent("¿Qué director creó 'La lista de Schindler'?", listOf("Roman Polanski", "Steven Spielberg", "Claude Lanzmann", "Agnieszka Holland"), "Cine", "Steven Spielberg dirigió La lista de Schindler en 1993, basada en la novela de Thomas Keneally sobre Oskar Schindler, un industrial alemán que salvó a judíos durante el Holocausto.")
        ),
        BilingualQuestion(
            id = 50231, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel rappeur a remporté le plus de Grammys?", listOf("Eminem", "Jay-Z", "Kanye West", "Lil Wayne"), "Musique", "Eminem détient le record du plus grand nombre de Grammy Awards remportés par un rappeur, avec 15 trophées."),
            en = LocalizedContent("Which rapper has won the most Grammys?", listOf("Eminem", "Jay-Z", "Kanye West", "Lil Wayne"), "Music", "Eminem holds the record for the most Grammy Awards won by a rapper, with 15 trophies."),
            zh = LocalizedContent("哪位说唱歌手获得格莱美奖最多？", listOf("埃米纳姆", "Jay-Z", "坎耶·韦斯特", "李尔·韦恩"), "音乐", "埃米纳姆保持着说唱歌手获得格莱美奖最多的纪录，共15座奖杯。"),
            es = LocalizedContent("¿Qué rapero ha ganado más Grammys?", listOf("Eminem", "Jay-Z", "Kanye West", "Lil Wayne"), "Musica", "Eminem tiene el récord de más premios Grammy ganados por un rapero, con 15 trofeos.")
        ),
        BilingualQuestion(
            id = 50232, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année le Titanic a-t-il coulé?", listOf("1910", "1911", "1912", "1913"), "Histoire", "Le Titanic a coulé lors de son voyage inaugural dans la nuit du 14 au 15 avril 1912, après avoir heurté un iceberg dans l'Atlantique Nord."),
            en = LocalizedContent("In which year did the Titanic sink?", listOf("1910", "1911", "1912", "1913"), "History", "The Titanic sank on its maiden voyage on the night of April 14-15, 1912, after hitting an iceberg in the North Atlantic."),
            zh = LocalizedContent("泰坦尼克号在哪一年沉没？", listOf("1910", "1911", "1912", "1913"), "历史", "泰坦尼克号在其处女航中于1912年4月14日至15日夜间撞上北大西洋的冰山后沉没。"),
            es = LocalizedContent("¿En qué año se hundió el Titanic?", listOf("1910", "1911", "1912", "1913"), "Historia", "El Titanic se hundió en su viaje inaugural la noche del 14 al 15 de abril de 1912, tras chocar contra un iceberg en el Atlántico Norte.")
        ),
        BilingualQuestion(
            id = 50233, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand type de crevette?", listOf("Crevette tigrée", "Crevette royale", "Crevette géante", "Crevette d'eau douce"), "Science", "La crevette géante, aussi appelée crevette tigrée géante, peut atteindre jusqu'à 33 centimètres de long, ce qui en fait la plus grande espèce de crevette connue."),
            en = LocalizedContent("What is the largest type of shrimp?", listOf("Tiger shrimp", "Royal shrimp", "Giant shrimp", "Freshwater shrimp"), "Science", "The giant shrimp, also called giant tiger shrimp, can reach up to 33 centimeters in length, making it the largest known shrimp species."),
            zh = LocalizedContent("最大的虾类是什么？", listOf("虎虾", "皇家虾", "巨虾", "淡水虾"), "科学", "巨虾，也称为巨虎虾，体长可达33厘米，是已知最大的虾类物种。"),
            es = LocalizedContent("¿Cuál es el tipo de camarón más grande?", listOf("Camarón tigre", "Camarón real", "Camarón gigante", "Camarón de agua dulce"), "Ciencia", "El camarón gigante, también llamado camarón tigre gigante, puede alcanzar hasta 33 centímetros de largo, lo que lo convierte en la especie de camarón más grande conocida.")
        ),
        BilingualQuestion(
            id = 50234, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac salé du monde?", listOf("Mer d'Aral", "Mer Caspienne", "Lac Salton", "Grand Lac Salé"), "Géographie", "La mer Caspienne est considérée comme le plus grand lac salé du monde en raison de sa superficie d'environ 371 000 km² et de son eau salée, bien qu'elle soit souvent appelée mer."),
            en = LocalizedContent("What is the largest salt lake in the world?", listOf("Aral Sea", "Caspian Sea", "Salton Sea", "Great Salt Lake"), "Geography", "The Caspian Sea is considered the largest salt lake in the world due to its area of about 371,000 km² and its saline water, although it is often called a sea."),
            zh = LocalizedContent("世界上最大的咸水湖是什么？", listOf("咸海", "里海", "索尔顿湖", "大盐湖"), "地理", "里海因其约37.1万平方公里的面积和咸水而被认为是世界上最大的咸水湖，尽管它常被称为海。"),
            es = LocalizedContent("¿Cuál es el lago salado más grande del mundo?", listOf("Mar de Aral", "Mar Caspio", "Lago Salton", "Gran Lago Salado"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 50235, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien amphithéâtre du monde?", listOf("Colosseum", "Amphithéâtre d'El Djem", "Théâtre de Dionysus", "Amphithéâtre d'Arles"), "Culture", "Construit au VIe siècle avant J.-C. sur le flanc sud de l'Acropole d'Athènes, le Théâtre de Dionysos est considéré comme le plus ancien amphithéâtre connu, berceau de la tragédie grecque."),
            en = LocalizedContent("What is the oldest amphitheater in the world?", listOf("Colosseum", "Amphitheatre of El Djem", "Theatre of Dionysus", "Amphitheatre of Arles"), "Culture", "Built in the 6th century BC on the southern slope of the Acropolis of Athens, the Theatre of Dionysus is considered the oldest known amphitheater, birthplace of Greek tragedy."),
            zh = LocalizedContent("世界上最古老的露天剧场是什么？", listOf("罗马斗兽场", "埃尔杰姆竞技场", "狄俄尼索斯剧场", "阿尔勒竞技场"), "文化", "狄俄尼索斯剧场建于公元前6世纪，位于雅典卫城南坡，被认为是已知最古老的露天剧场，是希腊悲剧的发源地。"),
            es = LocalizedContent("¿Cuál es el anfiteatro más antiguo del mundo?", listOf("Coliseo", "Anfiteatro de El Djem", "Teatro de Dionisio", "Anfiteatro de Arlés"), "Cultura", "Construido en el siglo VI a.C. en la ladera sur de la Acrópolis de Atenas, el Teatro de Dionisio es considerado el anfiteatro más antiguo conocido, cuna de la tragedia griega.")
        ),
        BilingualQuestion(
            id = 50236, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel golfeur a remporté le plus de PGA Tours?", listOf("Jack Nicklaus", "Tiger Woods", "Arnold Palmer", "Ben Hogan"), "Sport", "Tiger Woods détient le record du plus grand nombre de victoires sur le PGA Tour avec 82 titres, égalant Sam Snead."),
            en = LocalizedContent("Which golfer has won the most PGA Tour events?", listOf("Jack Nicklaus", "Tiger Woods", "Arnold Palmer", "Ben Hogan"), "Sports", "Tiger Woods holds the record for the most PGA Tour wins with 82 titles, tying Sam Snead."),
            zh = LocalizedContent("哪位高尔夫球手赢得的美巡赛冠军最多？", listOf("杰克·尼克劳斯", "泰格·伍兹", "阿诺德·帕尔默", "本·霍根"), "体育", "泰格·伍兹保持着美巡赛最多胜利的纪录，共82个冠军，与山姆·斯尼德持平。"),
            es = LocalizedContent("¿Qué golfista ha ganado más torneos del PGA Tour?", listOf("Jack Nicklaus", "Tiger Woods", "Arnold Palmer", "Ben Hogan"), "Deportes", "Tiger Woods tiene el récord de más victorias en el PGA Tour con 82 títulos, empatando con Sam Snead.")
        ),
        BilingualQuestion(
            id = 50237, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film de guerre a remporté le plus d'Oscars?", listOf("Saving Private Ryan", "War Horse", "1917", "All Quiet on the Western Front"), "Cinéma", "Saving Private Ryan a remporté cinq Oscars, dont celui du meilleur réalisateur pour Steven Spielberg. Il détient le record du film de guerre le plus récompensé aux Oscars."),
            en = LocalizedContent("Which war film has won the most Oscars?", listOf("Saving Private Ryan", "War Horse", "1917", "All Quiet on the Western Front"), "Cinema", "Saving Private Ryan won five Oscars, including Best Director for Steven Spielberg. It holds the record for the most Oscars won by a war film."),
            zh = LocalizedContent("哪部战争片获得奥斯卡奖最多？", listOf("拯救大兵瑞恩", "战马", "1917", "西线无战事"), "电影", "《拯救大兵瑞恩》获得了五项奥斯卡奖，包括史蒂文·斯皮尔伯格的最佳导演奖。它保持着战争片获得奥斯卡奖最多的纪录。"),
            es = LocalizedContent("¿Qué película de guerra ha ganado más Oscars?", listOf("Salvar al soldado Ryan", "War Horse", "1917", "Sin novedad en el frente"), "Cine", "Salvar al soldado Ryan ganó cinco Oscars, incluido el de Mejor Director para Steven Spielberg. Tiene el récord de más Oscars ganados por una película de guerra.")
        ),
        BilingualQuestion(
            id = 50238, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel compositeur a écrit 'The Four Seasons'?", listOf("Bach", "Vivaldi", "Haydn", "Mozart"), "Musique", "Antonio Vivaldi composa ce cycle de quatre concertos pour violon en 1723, chacun représentant une saison de l'année."),
            en = LocalizedContent("Which composer wrote 'The Four Seasons'?", listOf("Bach", "Vivaldi", "Haydn", "Mozart"), "Music", "Antonio Vivaldi composed this cycle of four violin concertos in 1723, each representing a season of the year."),
            zh = LocalizedContent("哪位作曲家创作了《四季》？", listOf("巴赫", "维瓦尔第", "海顿", "莫扎特"), "音乐", "安东尼奥·维瓦尔第于1723年创作了这组四部小提琴协奏曲，每部代表一年中的一个季节。"),
            es = LocalizedContent("¿Qué compositor escribió 'Las cuatro estaciones'?", listOf("Bach", "Vivaldi", "Haydn", "Mozart"), "Musica", "Antonio Vivaldi compuso este ciclo de cuatro conciertos para violín en 1723, cada uno representando una estación del año.")
        ),
        BilingualQuestion(
            id = 50239, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien document écrit découvert en Chine?", listOf("Oracle de Jiaguwen", "Tablettes de Shang", "Inscription sur os", "Traité de Zuozhuan"), "Histoire", "Les inscriptions sur os et carapaces de tortue, appelées Jiaguwen, datent de la dynastie Shang (vers 1200 av. J.-C.) et constituent les plus anciens écrits chinois connus, utilisés pour la divination."),
            en = LocalizedContent("What is the oldest written document discovered in China?", listOf("Oracle bone script", "Shang tablets", "Bone inscription", "Zuozhuan treatise"), "History", "The inscriptions on oracle bones and turtle shells, called Jiaguwen, date from the Shang dynasty (around 1200 BC) and are the earliest known Chinese writings, used for divination."),
            zh = LocalizedContent("中国发现的最早的文字记载是什么？", listOf("甲骨文", "商代刻板", "骨刻", "《左传》"), "历史", "刻在龟甲和兽骨上的文字，称为甲骨文，可追溯到商代（约公元前1200年），是中国已知最早的文字，用于占卜。"),
            es = LocalizedContent("¿Cuál es el documento escrito más antiguo descubierto en China?", listOf("Escritura en huesos oraculares", "Tablas Shang", "Inscripción en hueso", "Tratado Zuozhuan"), "Historia", "Las inscripciones en huesos oraculares y caparazones de tortuga, llamadas Jiaguwen, datan de la dinastía Shang (alrededor del 1200 a.C.) y son los escritos chinos más antiguos conocidos, utilizados para la adivinación.")
        ),
        BilingualQuestion(
            id = 50240, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand parc national du monde?", listOf("Parc du Serengeti", "Parc de Denali", "Parc du Nord-est Groenlandais", "Parc Yellowstone"), "Science", "Le Parc national du Nord-Est du Groenland couvre 972 000 km², soit plus que la superficie de la France et de l'Allemagne réunies. Créé en 1974, il protège une vaste région arctique inhabitée."),
            en = LocalizedContent("What is the largest national park in the world?", listOf("Serengeti National Park", "Denali National Park", "Northeast Greenland National Park", "Yellowstone National Park"), "Science", "Northeast Greenland National Park covers 972,000 km², larger than the combined area of France and Germany. Established in 1974, it protects a vast uninhabited Arctic region."),
            zh = LocalizedContent("世界上最大的国家公园是哪个？", listOf("塞伦盖蒂国家公园", "德纳里国家公园", "东北格陵兰国家公园", "黄石国家公园"), "科学", "东北格陵兰国家公园占地972,000平方公里，比法国和德国的总面积还大。它成立于1974年，保护着广阔的无人居住的北极地区。"),
            es = LocalizedContent("¿Cuál es el parque nacional más grande del mundo?", listOf("Parque Nacional del Serengeti", "Parque Nacional de Denali", "Parque Nacional del Noreste de Groenlandia", "Parque Nacional de Yellowstone"), "Ciencia", "El Parque Nacional del Noreste de Groenlandia cubre 972,000 km², más que la superficie combinada de Francia y Alemania. Creado en 1974, protege una vasta región ártica deshabitada.")
        ),
        BilingualQuestion(
            id = 50241, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand système de récifs coralliens?", listOf("Récif de Ningaloo", "Récif du Belize", "Grande Barrière de Corail", "Récifs des Galápagos"), "Géographie", "La Grande Barrière de Corail, située au large de l'Australie, s'étend sur plus de 2 300 kilomètres et est visible depuis l'espace, ce qui en fait le plus vaste système récifal du monde."),
            en = LocalizedContent("What is the largest coral reef system?", listOf("Ningaloo Reef", "Belize Barrier Reef", "Great Barrier Reef", "Galápagos Reefs"), "Geography", "The Great Barrier Reef, off the coast of Australia, stretches over 2,300 kilometers and is visible from space, making it the largest reef system in the world."),
            zh = LocalizedContent("最大的珊瑚礁系统是哪个？", listOf("宁加洛礁", "伯利兹堡礁", "大堡礁", "加拉帕戈斯礁"), "地理", "大堡礁位于澳大利亚海岸外，绵延超过2300公里，从太空中可见，是世界上最大的珊瑚礁系统。"),
            es = LocalizedContent("¿Cuál es el sistema de arrecifes de coral más grande?", listOf("Arrecife de Ningaloo", "Barrera de Coral de Belice", "Gran Barrera de Coral", "Arrecifes de Galápagos"), "Geografía", "La Gran Barrera de Coral, frente a la costa de Australia, se extiende más de 2,300 kilómetros y es visible desde el espacio, lo que la convierte en el sistema de arrecifes más grande del mundo.")
        ),
        BilingualQuestion(
            id = 50242, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien jeu de société connu?", listOf("Échecs", "Go", "Senet", "Jeu Royal d'Ur"), "Culture", "Senet est attesté dans des tombes égyptiennes datant d'environ 3100 avant J.-C., ce qui en fait le plus ancien jeu de société connu grâce à des preuves archéologiques."),
            en = LocalizedContent("What is the oldest known board game?", listOf("Chess", "Go", "Senet", "Royal Game of Ur"), "Culture", "Senet is attested in Egyptian tombs dating to around 3100 BC, making it the oldest known board game based on archaeological evidence."),
            zh = LocalizedContent("已知最古老的棋盘游戏是什么？", listOf("国际象棋", "围棋", "塞尼特", "乌尔皇家游戏"), "文化", "塞尼特在约公元前3100年的埃及墓葬中已有记载，根据考古证据，它是最古老的已知棋盘游戏。"),
            es = LocalizedContent("¿Cuál es el juego de mesa más antiguo conocido?", listOf("Ajedrez", "Go", "Senet", "Juego Real de Ur"), "Cultura", "Senet está atestiguado en tumbas egipcias que datan de alrededor del 3100 a.C., lo que lo convierte en el juego de mesa más antiguo conocido según evidencia arqueológica.")
        ),
        BilingualQuestion(
            id = 50243, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gymnaste a remporté le plus de médailles olympiques?", listOf("Nadia Comăneci", "Larisa Latynina", "Simone Biles", "Shannon Miller"), "Sport", "Larisa Latynina, gymnaste soviétique, détient le record avec 18 médailles olympiques (9 en or) remportées entre 1956 et 1964."),
            en = LocalizedContent("Which gymnast has won the most Olympic medals?", listOf("Nadia Comăneci", "Larisa Latynina", "Simone Biles", "Shannon Miller"), "Sports", "Larisa Latynina, a Soviet gymnast, holds the record with 18 Olympic medals (9 gold) won between 1956 and 1964."),
            zh = LocalizedContent("哪位体操运动员获得奥运奖牌最多？", listOf("纳迪亚·科马内奇", "拉里莎·拉蒂尼娜", "西蒙·拜尔斯", "香农·米勒"), "体育", "苏联体操运动员拉里莎·拉蒂尼娜在1956年至1964年间共获得18枚奥运奖牌（9枚金牌），保持着纪录。"),
            es = LocalizedContent("¿Qué gimnasta ha ganado más medallas olímpicas?", listOf("Nadia Comăneci", "Larisa Latynina", "Simone Biles", "Shannon Miller"), "Deportes", "Larisa Latynina, gimnasta soviética, tiene el récord con 18 medallas olímpicas (9 de oro) ganadas entre 1956 y 1964.")
        ),
        BilingualQuestion(
            id = 50244, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a créé la franchise 'James Bond'?", listOf("Sean Connery", "Eon Productions", "Albert Broccoli", "Terence Young"), "Cinéma", "Eon Productions est la société de production fondée par Albert R. Broccoli et Harry Saltzman, qui a produit la plupart des films James Bond depuis 1962."),
            en = LocalizedContent("Which filmmaker created the 'James Bond' franchise?", listOf("Sean Connery", "Eon Productions", "Albert Broccoli", "Terence Young"), "Cinema", "Eon Productions is the production company founded by Albert R. Broccoli and Harry Saltzman, which has produced most James Bond films since 1962."),
            zh = LocalizedContent("哪位电影制作人创造了“詹姆斯·邦德”系列？", listOf("肖恩·康纳利", "Eon制片公司", "阿尔伯特·布罗科利", "特伦斯·杨"), "电影", "Eon制片公司由阿尔伯特·R·布罗科利和哈里·萨尔茨曼创立，自1962年以来制作了大部分詹姆斯·邦德电影。"),
            es = LocalizedContent("¿Qué cineasta creó la franquicia de 'James Bond'?", listOf("Sean Connery", "Eon Productions", "Albert Broccoli", "Terence Young"), "Cine", "Eon Productions es la productora fundada por Albert R. Broccoli y Harry Saltzman, que ha producido la mayoría de las películas de James Bond desde 1962.")
        ),
        BilingualQuestion(
            id = 50245, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel chanteur a remporté le plus de Grammy Awards?", listOf("Aretha Franklin", "Beyoncé", "Elvis Presley", "Michael Jackson"), "Musique", "Aretha Franklin détient le record du plus grand nombre de Grammy Awards remportés par une chanteuse, avec 18 trophées, dont une récompense honorifique pour l'ensemble de sa carrière."),
            en = LocalizedContent("Which singer has won the most Grammy Awards?", listOf("Aretha Franklin", "Beyoncé", "Elvis Presley", "Michael Jackson"), "Music", "Aretha Franklin holds the record for the most Grammy Awards won by a female singer, with 18 trophies, including a honorary award for her lifetime career."),
            zh = LocalizedContent("哪位歌手获得格莱美奖最多？", listOf("艾瑞莎·弗兰克林", "碧昂丝", "埃尔维斯·普雷斯利", "迈克尔·杰克逊"), "音乐", "艾瑞莎·弗兰克林保持着女歌手获得格莱美奖最多的纪录，共18座奖杯，包括一项终身成就荣誉奖。"),
            es = LocalizedContent("¿Qué cantante ha ganado más premios Grammy?", listOf("Aretha Franklin", "Beyoncé", "Elvis Presley", "Michael Jackson"), "Música", "Aretha Franklin tiene el récord de más premios Grammy ganados por una cantante femenina, con 18 trofeos, incluyendo un premio honorífico por su trayectoria.")
        ),
        BilingualQuestion(
            id = 50246, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le premier empire du monde?", listOf("Empire assyrien", "Empire akkadien", "Empire babylonien", "Empire égyptien"), "Histoire", "L'Empire akkadien, fondé par Sargon d'Akkad vers 2334 av. J.-C., est considéré comme le premier empire de l'histoire car il a unifié pour la première fois plusieurs cités-États de Mésopotamie sous un seul gouvernement centralisé."),
            en = LocalizedContent("What was the first empire in the world?", listOf("Assyrian Empire", "Akkadian Empire", "Babylonian Empire", "Egyptian Empire"), "History", "The Akkadian Empire, founded by Sargon of Akkad around 2334 BC, is considered the first empire in history as it unified several Mesopotamian city-states under a single centralized government for the first time."),
            zh = LocalizedContent("世界上第一个帝国是什么？", listOf("亚述帝国", "阿卡德帝国", "巴比伦帝国", "埃及帝国"), "历史", "阿卡德帝国由萨尔贡大帝于公元前2334年左右建立，被认为是历史上第一个帝国，因为它首次将美索不达米亚的多个城邦统一在一个中央集权政府之下。"),
            es = LocalizedContent("¿Cuál fue el primer imperio del mundo?", listOf("Imperio asirio", "Imperio acadio", "Imperio babilónico", "Imperio egipcio"), "Historia", "El Imperio acadio, fundado por Sargón de Acad hacia el 2334 a.C., es considerado el primer imperio de la historia, ya que unificó por primera vez varias ciudades-estado mesopotámicas bajo un solo gobierno centralizado.")
        ),
        BilingualQuestion(
            id = 50247, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus rapide animal du monde?", listOf("Guépard", "Faucon pèlerin", "Dorade", "Avion supersonique"), "Science", "Le faucon pèlerin est l'animal le plus rapide du monde, atteignant plus de 300 km/h en piqué lors de ses chasses."),
            en = LocalizedContent("What is the fastest animal in the world?", listOf("Cheetah", "Peregrine falcon", "Dorado", "Supersonic jet"), "Science", "The peregrine falcon is the fastest animal in the world, reaching over 300 km/h in a dive while hunting."),
            zh = LocalizedContent("世界上速度最快的动物是什么？", listOf("猎豹", "游隼", "鲯鳅", "超音速飞机"), "科学", "游隼是世界上速度最快的动物，捕猎时俯冲速度超过300公里/小时。"),
            es = LocalizedContent("¿Cuál es el animal más rápido del mundo?", listOf("Guepardo", "Halcón peregrino", "Dorado", "Avión supersónico"), "Ciencia", "El halcón peregrino es el animal más rápido del mundo, alcanzando más de 300 km/h en picado durante la caza.")
        ),
        BilingualQuestion(
            id = 50248, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand désert polaire?", listOf("Désert du Kalahari", "Antarctique", "Désert du Gobi", "Désert de l'Atacama"), "Géographie", "L'Antarctique est considéré comme le plus grand désert polaire car il reçoit très peu de précipitations, moins de 50 mm par an en moyenne, ce qui en fait un désert de glace."),
            en = LocalizedContent("What is the largest polar desert?", listOf("Kalahari Desert", "Antarctica", "Gobi Desert", "Atacama Desert"), "Geography", "Antarctica is considered the largest polar desert because it receives very little precipitation, less than 50 mm per year on average, making it an ice desert."),
            zh = LocalizedContent("最大的极地沙漠是什么？", listOf("卡拉哈里沙漠", "南极洲", "戈壁沙漠", "阿塔卡马沙漠"), "地理", "南极洲被认为是最大的极地沙漠，因为它降水量极少，平均每年不到50毫米，是一个冰沙漠。"),
            es = LocalizedContent("¿Cuál es el desierto polar más grande?", listOf("Desierto del Kalahari", "Antártida", "Desierto del Gobi", "Desierto de Atacama"), "Geografía", "La Antártida es considerada el desierto polar más grande porque recibe muy poca precipitación, menos de 50 mm al año en promedio, lo que la convierte en un desierto de hielo.")
        ),
        BilingualQuestion(
            id = 50249, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien art mural connu?", listOf("Fresques de Pompéi", "Graffitis romains", "Peintures rupestres", "Mosaïques byzantines"), "Culture", "Les peintures rupestres, comme celles de la grotte Chauvet en France, datent de plus de 30 000 ans et sont les plus anciennes traces d'art mural découvertes."),
            en = LocalizedContent("What is the oldest known mural art?", listOf("Pompeii frescoes", "Roman graffiti", "Cave paintings", "Byzantine mosaics"), "Culture", "Cave paintings, such as those in the Chauvet Cave in France, date back over 30,000 years and are the oldest known traces of mural art discovered."),
            zh = LocalizedContent("已知最古老的壁画艺术是什么？", listOf("庞贝壁画", "罗马涂鸦", "洞穴壁画", "拜占庭马赛克"), "文化", "洞穴壁画，如法国肖维岩洞中的壁画，可追溯到3万多年前，是已发现的最古老的壁画艺术痕迹。"),
            es = LocalizedContent("¿Cuál es el arte mural más antiguo conocido?", listOf("Frescos de Pompeya", "Grafitis romanos", "Pinturas rupestres", "Mosaicos bizantinos"), "Cultura", "Las pinturas rupestres, como las de la cueva Chauvet en Francia, datan de más de 30,000 años y son las huellas más antiguas de arte mural descubiertas.")
        ),
        BilingualQuestion(
            id = 50250, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel équipe de football a remporté le plus de Ligues des Champions?", listOf("Milan AC", "Liverpool", "Bayern Munich", "Real Madrid"), "Sport", "Le Real Madrid détient le record avec 14 titres de Ligue des Champions, dont un triplé historique de 2016 à 2018 et cinq victoires entre 2014 et 2022."),
            en = LocalizedContent("Which football team has won the most Champions Leagues?", listOf("AC Milan", "Liverpool", "Bayern Munich", "Real Madrid"), "Sports", "Real Madrid holds the record with 14 Champions League titles, including a historic three-peat from 2016 to 2018 and five victories between 2014 and 2022."),
            zh = LocalizedContent("哪支足球队赢得了最多的欧冠冠军？", listOf("AC米兰", "利物浦", "拜仁慕尼黑", "皇家马德里"), "体育", "皇家马德里以14次欧冠冠军保持纪录，包括2016年至2018年的历史性三连冠以及2014年至2022年间的五次夺冠。"),
            es = LocalizedContent("¿Qué equipo de fútbol ha ganado más Ligas de Campeones?", listOf("AC Milan", "Liverpool", "Bayern Munich", "Real Madrid"), "Deportes", "El Real Madrid ostenta el récord con 14 títulos de la Liga de Campeones, incluyendo un triplete histórico de 2016 a 2018 y cinco victorias entre 2014 y 2022.")
        ),
        BilingualQuestion(
            id = 50251, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel acteur a joué le plus de rôles différents dans les films?", listOf("Meryl Streep", "Laurence Olivier", "Daniel Day-Lewis", "Jack Lemmon"), "Cinéma", "Meryl Streep détient le record du plus grand nombre de nominations aux Oscars (21) et a interprété une vaste gamme de rôles, allant de Margaret Thatcher à Miranda Priestly."),
            en = LocalizedContent("Which actor has played the most different roles in films?", listOf("Meryl Streep", "Laurence Olivier", "Daniel Day-Lewis", "Jack Lemmon"), "Cinema", "Meryl Streep holds the record for the most Oscar nominations (21) and has portrayed a wide range of roles, from Margaret Thatcher to Miranda Priestly."),
            zh = LocalizedContent("哪位演员在电影中扮演了最多不同的角色？", listOf("梅丽尔·斯特里普", "劳伦斯·奥利弗", "丹尼尔·戴-刘易斯", "杰克·莱蒙"), "电影", "梅丽尔·斯特里普保持着最多奥斯卡提名（21次）的纪录，并演绎了从玛格丽特·撒切尔到米兰达·普利斯特等广泛角色。"),
            es = LocalizedContent("¿Qué actor ha interpretado más papeles diferentes en películas?", listOf("Meryl Streep", "Laurence Olivier", "Daniel Day-Lewis", "Jack Lemmon"), "Cine", "Meryl Streep ostenta el récord de más nominaciones al Oscar (21) y ha interpretado una amplia gama de papeles, desde Margaret Thatcher hasta Miranda Priestly.")
        ),
        BilingualQuestion(
            id = 50252, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel musicien a créé la notation musicale moderne?", listOf("Guido d'Arezzo", "Claudio Monteverdi", "Georg Telemann", "Antonio Vivaldi"), "Musique", "Guido d'Arezzo, un moine italien du XIe siècle, a inventé la portée à quatre lignes et le système de solmisation (ut, ré, mi, fa, sol, la), fondements de la notation musicale moderne."),
            en = LocalizedContent("Which musician created modern musical notation?", listOf("Guido of Arezzo", "Claudio Monteverdi", "Georg Telemann", "Antonio Vivaldi"), "Music", "Guido of Arezzo, an 11th-century Italian monk, invented the four-line staff and the solmization system (ut, re, mi, fa, sol, la), foundations of modern musical notation."),
            zh = LocalizedContent("哪位音乐家创造了现代音乐记谱法？", listOf("圭多·达雷佐", "克劳迪奥·蒙特威尔第", "格奥尔格·泰勒曼", "安东尼奥·维瓦尔第"), "音乐", "11世纪的意大利僧侣圭多·达雷佐发明了四线谱和唱名法（ut、re、mi、fa、sol、la），这是现代音乐记谱法的基础。"),
            es = LocalizedContent("¿Qué músico creó la notación musical moderna?", listOf("Guido de Arezzo", "Claudio Monteverdi", "Georg Telemann", "Antonio Vivaldi"), "Música", "Guido de Arezzo, un monje italiano del siglo XI, inventó el pentagrama de cuatro líneas y el sistema de solmización (ut, re, mi, fa, sol, la), fundamentos de la notación musical moderna.")
        ),
        BilingualQuestion(
            id = 50253, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le plus grand empire romain?", listOf("Sous Jules César", "Sous Auguste", "Sous Trajan", "Sous Hadrien"), "Histoire", "Sous l'empereur Trajan, en 117 après J.-C., l'Empire romain atteint son extension maximale, s'étendant de l'Écosse au golfe Persique."),
            en = LocalizedContent("What was the largest Roman Empire?", listOf("Under Julius Caesar", "Under Augustus", "Under Trajan", "Under Hadrian"), "History", "Under Emperor Trajan, in 117 AD, the Roman Empire reached its maximum extent, stretching from Scotland to the Persian Gulf."),
            zh = LocalizedContent("罗马帝国在何时疆域最大？", listOf("尤利乌斯·凯撒时期", "奥古斯都时期", "图拉真时期", "哈德良时期"), "历史", "在图拉真皇帝统治下，公元117年，罗马帝国达到最大疆域，从苏格兰延伸至波斯湾。"),
            es = LocalizedContent("¿Cuál fue el mayor Imperio Romano?", listOf("Bajo Julio César", "Bajo Augusto", "Bajo Trajano", "Bajo Adriano"), "Historia", "Bajo el emperador Trajano, en el año 117 d.C., el Imperio Romano alcanzó su máxima extensión, desde Escocia hasta el golfo Pérsico.")
        ),
        BilingualQuestion(
            id = 50254, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand type de cellule vivante?", listOf("Cellule de nématode", "Œuf d'autruche", "Œuf de baleine", "Neurone géant"), "Science", "L'œuf d'autruche est une cellule unique, mesurant jusqu'à 15 centimètres de diamètre, ce qui en fait la plus grande cellule vivante connue."),
            en = LocalizedContent("What is the largest type of living cell?", listOf("Nematode cell", "Ostrich egg", "Whale egg", "Giant neuron"), "Science", "The ostrich egg is a single cell, measuring up to 15 centimeters in diameter, making it the largest known living cell."),
            zh = LocalizedContent("最大的活细胞类型是什么？", listOf("线虫细胞", "鸵鸟蛋", "鲸鱼卵", "巨型神经元"), "科学", "鸵鸟蛋是一个单细胞，直径可达15厘米，是已知最大的活细胞。"),
            es = LocalizedContent("¿Cuál es el tipo de célula viva más grande?", listOf("Célula de nematodo", "Huevo de avestruz", "Huevo de ballena", "Neurona gigante"), "Ciencia", "El huevo de avestruz es una sola célula, que mide hasta 15 centímetros de diámetro, lo que lo convierte en la célula viva más grande conocida.")
        ),
        BilingualQuestion(
            id = 50255, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand système montagneux du monde?", listOf("Alpes", "Chaîne de l'Himalaya", "Chaîne des Andes", "Montagnes Rocheuses"), "Géographie", "Les Andes s'étendent sur plus de 7 000 kilomètres le long de la côte ouest de l'Amérique du Sud, ce qui en fait la plus longue chaîne de montagnes continentale du monde."),
            en = LocalizedContent("What is the largest mountain system in the world?", listOf("Alps", "Himalayan Range", "Andes Range", "Rocky Mountains"), "Geography", "The Andes stretch over 7,000 kilometers along the west coast of South America, making it the longest continental mountain range in the world."),
            zh = LocalizedContent("世界上最大的山脉系统是什么？", listOf("阿尔卑斯山脉", "喜马拉雅山脉", "安第斯山脉", "落基山脉"), "地理", "安第斯山脉沿南美洲西海岸延伸超过7000公里，是世界上最长的大陆山脉。"),
            es = LocalizedContent("¿Cuál es el sistema montañoso más grande del mundo?", listOf("Alpes", "Cordillera del Himalaya", "Cordillera de los Andes", "Montañas Rocosas"), "Geografía", "Los Andes se extienden a lo largo de más de 7.000 kilómetros por la costa oeste de Sudamérica, lo que los convierte en la cadena montañosa continental más larga del mundo.")
        ),
        BilingualQuestion(
            id = 50256, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien théâtre grec?", listOf("Théâtre de Lerna", "Théâtre de Lonómée", "Théâtre de Dodone", "Théâtre d'Épidaure"), "Culture", "Construit au IVe siècle av. J.-C., le théâtre d'Épidaure est réputé pour son acoustique parfaite et son état de conservation exceptionnel, ce qui en fait le plus ancien théâtre grec encore debout."),
            en = LocalizedContent("What is the oldest Greek theater?", listOf("Theater of Lerna", "Theater of Lonómée", "Theater of Dodona", "Theater of Epidaurus"), "Culture", "Built in the 4th century BC, the Theater of Epidaurus is renowned for its perfect acoustics and exceptional state of preservation, making it the oldest Greek theater still standing."),
            zh = LocalizedContent("最古老的希腊剧院是哪个？", listOf("莱尔纳剧院", "洛诺梅剧院", "多多纳剧院", "埃皮达鲁斯剧院"), "文化", "建于公元前4世纪的埃皮达鲁斯剧院以其完美的音响效果和极佳的保存状态而闻名，是现存最古老的希腊剧院。"),
            es = LocalizedContent("¿Cuál es el teatro griego más antiguo?", listOf("Teatro de Lerna", "Teatro de Lonómée", "Teatro de Dodona", "Teatro de Epidauro"), "Cultura", "Construido en el siglo IV a.C., el Teatro de Epidauro es famoso por su acústica perfecta y su excepcional estado de conservación, lo que lo convierte en el teatro griego más antiguo que aún se mantiene en pie.")
        ),
        BilingualQuestion(
            id = 50257, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel coureur automobile a remporté le plus de Grand Prix?", listOf("Michael Schumacher", "Lewis Hamilton", "Juan Manuel Fangio", "Ayrton Senna"), "Sport", "Lewis Hamilton détient le record du nombre de victoires en Grand Prix de Formule 1, avec plus de 100 succès à son actif, dépassant Michael Schumacher."),
            en = LocalizedContent("Which racing driver has won the most Grands Prix?", listOf("Michael Schumacher", "Lewis Hamilton", "Juan Manuel Fangio", "Ayrton Senna"), "Sports", "Lewis Hamilton holds the record for the most Formula One Grand Prix victories, with over 100 wins to his name, surpassing Michael Schumacher."),
            zh = LocalizedContent("哪位赛车手赢得了最多的大奖赛？", listOf("迈克尔·舒马赫", "刘易斯·汉密尔顿", "胡安·曼努埃尔·方吉奥", "艾尔顿·塞纳"), "体育", "刘易斯·汉密尔顿保持着最多一级方程式大奖赛胜利的纪录，拥有超过100场胜利，超越了迈克尔·舒马赫。"),
            es = LocalizedContent("¿Qué piloto de carreras ha ganado más Grandes Premios?", listOf("Michael Schumacher", "Lewis Hamilton", "Juan Manuel Fangio", "Ayrton Senna"), "Deportes", "Lewis Hamilton ostenta el récord de más victorias en Grandes Premios de Fórmula 1, con más de 100 triunfos, superando a Michael Schumacher.")
        ),
        BilingualQuestion(
            id = 50258, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a créé 'Citizen Kane'?", listOf("Orson Welles", "John Ford", "Greed Griffith", "Charlie Chaplin"), "Cinéma", "Orson Welles a coécrit, réalisé et joué le rôle principal dans Citizen Kane, sorti en 1941, considéré comme l'un des plus grands films de l'histoire du cinéma."),
            en = LocalizedContent("Which director created 'Citizen Kane'?", listOf("Orson Welles", "John Ford", "Greed Griffith", "Charlie Chaplin"), "Cinema", "Orson Welles co-wrote, directed, and starred in Citizen Kane, released in 1941, considered one of the greatest films in cinema history."),
            zh = LocalizedContent("哪位导演创作了《公民凯恩》？", listOf("奥逊·威尔斯", "约翰·福特", "格里德·格里菲斯", "查理·卓别林"), "电影", "奥逊·威尔斯联合编剧、导演并主演了1941年上映的《公民凯恩》，该片被认为是电影史上最伟大的电影之一。"),
            es = LocalizedContent("¿Qué director creó 'Ciudadano Kane'?", listOf("Orson Welles", "John Ford", "Greed Griffith", "Charlie Chaplin"), "Cine", "Orson Welles coescribió, dirigió y protagonizó Ciudadano Kane, estrenada en 1941, considerada una de las mejores películas de la historia del cine.")
        ),
        BilingualQuestion(
            id = 50259, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe a enregistré 'Let It Be'?", listOf("Rolling Stones", "The Beatles", "The Who", "Led Zeppelin"), "Musique", "Let It Be est le dernier single des Beatles sorti en 1970, avant leur séparation officielle."),
            en = LocalizedContent("Which band recorded 'Let It Be'?", listOf("Rolling Stones", "The Beatles", "The Who", "Led Zeppelin"), "Music", "Let It Be is the last single by The Beatles, released in 1970, before their official breakup."),
            zh = LocalizedContent("哪个乐队录制了《Let It Be》？", listOf("滚石乐队", "披头士乐队", "谁人乐队", "齐柏林飞艇"), "音乐", "《Let It Be》是披头士乐队在1970年正式解散前发行的最后一首单曲。"),
            es = LocalizedContent("¿Qué banda grabó 'Let It Be'?", listOf("Rolling Stones", "The Beatles", "The Who", "Led Zeppelin"), "Música", "Let It Be es el último sencillo de The Beatles, lanzado en 1970, antes de su separación oficial.")
        ),
        BilingualQuestion(
            id = 50260, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le plus long empire de l'histoire?", listOf("Empire romain", "Empire byzantin", "Empire ottoman", "Empire égyptien"), "Histoire", "L'Empire byzantin a duré plus de 1 100 ans, de 330 à 1453, ce qui en fait le plus long empire de l'histoire."),
            en = LocalizedContent("What was the longest empire in history?", listOf("Roman Empire", "Byzantine Empire", "Ottoman Empire", "Egyptian Empire"), "History", "The Byzantine Empire lasted over 1,100 years, from 330 to 1453, making it the longest empire in history."),
            zh = LocalizedContent("历史上最长的帝国是哪个？", listOf("罗马帝国", "拜占庭帝国", "奥斯曼帝国", "埃及帝国"), "历史", "拜占庭帝国持续了1100多年，从330年到1453年，使其成为历史上最长的帝国。"),
            es = LocalizedContent("¿Cuál fue el imperio más largo de la historia?", listOf("Imperio romano", "Imperio bizantino", "Imperio otomano", "Imperio egipcio"), "Historia", "El Imperio bizantino duró más de 1.100 años, desde el 330 hasta 1453, lo que lo convierte en el imperio más largo de la historia.")
        ),
        BilingualQuestion(
            id = 50261, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand arachnide du monde?", listOf("Araignée de Goliath", "Solifuge géant", "Scorpion géant", "Acarien géant"), "Science", "L'araignée de Goliath (Theraphosa blondi) détient le record de masse et d'envergure parmi les arachnides, avec des pattes pouvant atteindre 30 centimètres."),
            en = LocalizedContent("What is the largest arachnid in the world?", listOf("Goliath birdeater", "Giant solifugid", "Giant scorpion", "Giant mite"), "Science", "The Goliath birdeater (Theraphosa blondi) holds the record for mass and leg span among arachnids, with legs reaching up to 30 centimeters."),
            zh = LocalizedContent("世界上最大的蛛形纲动物是什么？", listOf("歌利亚食鸟蛛", "巨型避日蛛", "巨型蝎子", "巨型螨虫"), "科学", "歌利亚食鸟蛛（Theraphosa blondi）在蛛形纲动物中拥有最大的质量和腿展，腿长可达30厘米。"),
            es = LocalizedContent("¿Cuál es el arácnido más grande del mundo?", listOf("Araña Goliat", "Solífugo gigante", "Escorpión gigante", "Ácaro gigante"), "Ciencia", "La araña Goliat (Theraphosa blondi) posee el récord de masa y envergadura entre los arácnidos, con patas que pueden alcanzar los 30 centímetros.")
        ),
        BilingualQuestion(
            id = 50262, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand plateau du monde?", listOf("Plateau du Tibet", "Plateau de l'Altaï", "Plateau d'Arménie", "Plateau du Deccan"), "Géographie", "Le plateau du Tibet, souvent appelé le toit du monde, culmine à environ 4 500 mètres d'altitude et s'étend sur plus de 2,5 millions de km², ce qui en fait le plus vaste et le plus haut plateau de la planète."),
            en = LocalizedContent("What is the largest plateau in the world?", listOf("Tibetan Plateau", "Altai Plateau", "Armenian Plateau", "Deccan Plateau"), "Geography", "The Tibetan Plateau, often called the roof of the world, averages about 4,500 meters in elevation and covers over 2.5 million km², making it the largest and highest plateau on Earth."),
            zh = LocalizedContent("世界上最大的高原是哪个？", listOf("青藏高原", "阿尔泰高原", "亚美尼亚高原", "德干高原"), "地理", "青藏高原常被称为世界屋脊，平均海拔约4500米，面积超过250万平方公里，是地球上最大最高的高原。"),
            es = LocalizedContent("¿Cuál es la meseta más grande del mundo?", listOf("Meseta del Tíbet", "Meseta de Altái", "Meseta de Armenia", "Meseta del Decán"), "Geografía", "La meseta del Tíbet, a menudo llamada el techo del mundo, tiene una altitud media de unos 4.500 metros y se extiende por más de 2,5 millones de km², lo que la convierte en la meseta más grande y alta del planeta.")
        ),
        BilingualQuestion(
            id = 50263, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien musée du monde?", listOf("Museo del Prado", "Louvre", "Metropolitan", "Ashmolean"), "Culture", "L'Ashmolean Museum, fondé en 1683 à l'Université d'Oxford, est considéré comme le premier musée public au monde. Il a ouvert ses portes pour exposer la collection d'antiquités et d'histoire naturelle d'Elias Ashmole."),
            en = LocalizedContent("What is the oldest museum in the world?", listOf("Museo del Prado", "Louvre", "Metropolitan", "Ashmolean"), "Culture", "The Ashmolean Museum, founded in 1683 at the University of Oxford, is considered the first public museum in the world. It opened to display Elias Ashmole's collection of antiquities and natural history."),
            zh = LocalizedContent("世界上最古老的博物馆是哪个？", listOf("普拉多博物馆", "卢浮宫", "大都会博物馆", "阿什莫林博物馆"), "文化", "阿什莫林博物馆成立于1683年，位于牛津大学，被认为是世界上第一个公共博物馆。它开放展示伊莱亚斯·阿什莫尔的古董和自然历史收藏。"),
            es = LocalizedContent("¿Cuál es el museo más antiguo del mundo?", listOf("Museo del Prado", "Louvre", "Metropolitan", "Ashmolean"), "Cultura", "El Museo Ashmolean, fundado en 1683 en la Universidad de Oxford, está considerado el primer museo público del mundo. Abrió sus puertas para exhibir la colección de antigüedades e historia natural de Elias Ashmole.")
        ),
        BilingualQuestion(
            id = 50264, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel équipe de rugby a remporté le plus de Tri Nations?", listOf("Afrique du Sud", "Nouvelle-Zélande", "Australie", "France"), "Sport", "La Nouvelle-Zélande a remporté le plus de Tri Nations (devenu The Rugby Championship) avec 16 titres, devant l'Australie et l'Afrique du Sud."),
            en = LocalizedContent("Which rugby team has won the most Tri Nations?", listOf("South Africa", "New Zealand", "Australia", "France"), "Sports", "New Zealand has won the most Tri Nations (now The Rugby Championship) with 16 titles, ahead of Australia and South Africa."),
            zh = LocalizedContent("哪支橄榄球队赢得了最多的三国赛冠军？", listOf("南非", "新西兰", "澳大利亚", "法国"), "体育", "新西兰赢得了最多的三国赛（现为橄榄球锦标赛）冠军，共16次，领先于澳大利亚和南非。"),
            es = LocalizedContent("¿Qué equipo de rugby ha ganado más Tri Nations?", listOf("Sudáfrica", "Nueva Zelanda", "Australia", "Francia"), "Deportes", "Nueva Zelanda ha ganado la mayor cantidad de Tri Nations (ahora The Rugby Championship) con 16 títulos, por delante de Australia y Sudáfrica.")
        ),
        BilingualQuestion(
            id = 50265, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film d'animation a remporté l'Oscar du meilleur film?", listOf("Beauty and the Beast", "Pinocchio", "Encanto", "Coco"), "Cinéma", "Beauty and the Beast est le premier film d'animation nommé pour l'Oscar du meilleur film en 1991, une catégorie alors dominée par les films en prise de vues réelles."),
            en = LocalizedContent("Which animated film won the Oscar for Best Picture?", listOf("Beauty and the Beast", "Pinocchio", "Encanto", "Coco"), "Cinema", "Beauty and the Beast is the first animated film nominated for the Oscar for Best Picture in 1991, a category then dominated by live-action films."),
            zh = LocalizedContent("哪部动画电影获得了奥斯卡最佳影片奖？", listOf("美女与野兽", "木偶奇遇记", "魔法满屋", "寻梦环游记"), "电影", "《美女与野兽》是第一部获得奥斯卡最佳影片提名的动画电影，于1991年获得提名，当时该类别由真人电影主导。"),
            es = LocalizedContent("¿Qué película de animación ganó el Oscar a la mejor película?", listOf("La bella y la bestia", "Pinocho", "Encanto", "Coco"), "Cine", "La bella y la bestia es la primera película de animación nominada al Oscar a la mejor película en 1991, una categoría entonces dominada por películas de imagen real.")
        ),
        BilingualQuestion(
            id = 50266, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel musicien classique était sourd?", listOf("Mozart", "Chopin", "Beethoven", "Bach"), "Musique", "Beethoven a commencé à perdre l'audition vers l'âge de 28 ans et est devenu complètement sourd dans les dernières années de sa vie, ce qui ne l'a pas empêché de composer des chefs-d'œuvre comme la Neuvième Symphonie."),
            en = LocalizedContent("Which classical musician was deaf?", listOf("Mozart", "Chopin", "Beethoven", "Bach"), "Music", "Beethoven began losing his hearing around age 28 and became completely deaf in his later years, which did not prevent him from composing masterpieces like the Ninth Symphony."),
            zh = LocalizedContent("哪位古典音乐家是聋人？", listOf("莫扎特", "肖邦", "贝多芬", "巴赫"), "音乐", "贝多芬在28岁左右开始失去听力，晚年完全失聪，但这并未阻止他创作出《第九交响曲》等杰作。"),
            es = LocalizedContent("¿Qué músico clásico era sordo?", listOf("Mozart", "Chopin", "Beethoven", "Bach"), "Música", "Beethoven comenzó a perder la audición alrededor de los 28 años y quedó completamente sordo en sus últimos años, lo que no le impidió componer obras maestras como la Novena Sinfonía.")
        ),
        BilingualQuestion(
            id = 50267, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a marqué la fin de l'Antiquité?", listOf("Chute de Rome", "Invasion des Barbares", "Fin de l'Empire romain d'Occident", "Bataille d'Adrianople"), "Histoire", "La chute de l'Empire romain d'Occident en 476 apr. J.-C., avec la déposition du dernier empereur Romulus Augustule, est traditionnellement considérée comme le point de bascule entre l'Antiquité et le Moyen Âge."),
            en = LocalizedContent("What event marked the end of Antiquity?", listOf("Fall of Rome", "Barbarian invasions", "Fall of the Western Roman Empire", "Battle of Adrianople"), "History", "The fall of the Western Roman Empire in 476 AD, with the deposition of the last emperor Romulus Augustulus, is traditionally considered the turning point between Antiquity and the Middle Ages."),
            zh = LocalizedContent("哪个事件标志着古代的结束？", listOf("罗马陷落", "蛮族入侵", "西罗马帝国灭亡", "阿德里安堡战役"), "历史", "公元476年西罗马帝国的灭亡，末代皇帝罗慕路斯·奥古斯都被废黜，传统上被视为古代与中世纪的分水岭。"),
            es = LocalizedContent("¿Qué evento marcó el fin de la Antigüedad?", listOf("Caída de Roma", "Invasiones bárbaras", "Fin del Imperio romano de Occidente", "Batalla de Adrianópolis"), "Historia", "La caída del Imperio romano de Occidente en el 476 d.C., con la deposición del último emperador Rómulo Augústulo, se considera tradicionalmente el punto de inflexión entre la Antigüedad y la Edad Media.")
        ),
        BilingualQuestion(
            id = 50269, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand cratère d'impact du monde?", listOf("Cratère de Chicxulub", "Cratère de Sudbury", "Cratère d'Acraman", "Cratère du Vrede"), "Géographie", "Le cratère de Sudbury, situé en Ontario au Canada, est le plus grand cratère d'impact connu sur Terre, avec un diamètre d'environ 130 kilomètres. Il s'est formé il y a environ 1,85 milliard d'années suite à la chute d'une météorite."),
            en = LocalizedContent("What is the largest impact crater in the world?", listOf("Chicxulub crater", "Sudbury crater", "Acraman crater", "Vredefort crater"), "Geography", "The Sudbury crater, located in Ontario, Canada, is the largest known impact crater on Earth, with a diameter of about 130 kilometers. It formed about 1.85 billion years ago from a meteorite impact."),
            zh = LocalizedContent("世界上最大的撞击坑是哪个？", listOf("希克苏鲁伯陨石坑", "萨德伯里陨石坑", "阿克拉曼陨石坑", "弗里德堡陨石坑"), "地理", "萨德伯里陨石坑位于加拿大安大略省，是地球上已知最大的撞击坑，直径约130公里，形成于约18.5亿年前的一次陨石撞击。"),
            es = LocalizedContent("¿Cuál es el cráter de impacto más grande del mundo?", listOf("Cráter de Chicxulub", "Cráter de Sudbury", "Cráter de Acraman", "Cráter de Vredefort"), "Geografía", "El cráter de Sudbury, ubicado en Ontario, Canadá, es el cráter de impacto más grande conocido en la Tierra, con un diámetro de unos 130 kilómetros. Se formó hace aproximadamente 1.850 millones de años por el impacto de un meteorito.")
        ),
        BilingualQuestion(
            id = 50270, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien calendrier connu?", listOf("Calendrier maya", "Calendrier égyptien", "Calendrier babylonien", "Calendrier chinois"), "Culture", "Le calendrier babylonien, datant d'environ 2000 av. J.-C., est considéré comme le plus ancien calendrier luni-solaire connu, basé sur les cycles de la Lune et du Soleil."),
            en = LocalizedContent("What is the oldest known calendar?", listOf("Mayan calendar", "Egyptian calendar", "Babylonian calendar", "Chinese calendar"), "Culture", "The Babylonian calendar, dating to around 2000 BC, is considered the oldest known lunisolar calendar, based on the cycles of the Moon and Sun."),
            zh = LocalizedContent("已知最古老的历法是哪个？", listOf("玛雅历", "埃及历", "巴比伦历", "中国历"), "文化", "巴比伦历可追溯到约公元前2000年，被认为是已知最古老的阴阳历，基于月亮和太阳的周期。"),
            es = LocalizedContent("¿Cuál es el calendario más antiguo conocido?", listOf("Calendario maya", "Calendario egipcio", "Calendario babilónico", "Calendario chino"), "Cultura", "El calendario babilónico, que data de alrededor del 2000 a.C., está considerado el calendario lunisolar más antiguo conocido, basado en los ciclos de la Luna y el Sol.")
        ),
        BilingualQuestion(
            id = 50272, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a créé la franchise 'Rocky'?", listOf("Steven Spielberg", "Martin Scorsese", "John G. Avildsen", "Sylvester Stallone"), "Cinéma", "John G. Avildsen a réalisé le premier film Rocky en 1976, remportant l'Oscar du meilleur film. Sylvester Stallone a écrit le scénario et joué le rôle-titre, mais c'est Avildsen qui a mis en scène ce classique du cinéma."),
            en = LocalizedContent("Which director created the 'Rocky' franchise?", listOf("Steven Spielberg", "Martin Scorsese", "John G. Avildsen", "Sylvester Stallone"), "Cinema", "John G. Avildsen directed the first Rocky film in 1976, winning the Academy Award for Best Picture. Sylvester Stallone wrote the screenplay and played the title role, but Avildsen directed this cinema classic."),
            zh = LocalizedContent("哪位导演创造了《洛奇》系列？", listOf("史蒂文·斯皮尔伯格", "马丁·斯科塞斯", "约翰·G·阿维尔森", "西尔维斯特·史泰龙"), "电影", "约翰·G·阿维尔森在1976年执导了第一部《洛奇》电影，并获得了奥斯卡最佳影片奖。西尔维斯特·史泰龙编写了剧本并扮演了主角，但阿维尔森执导了这部经典电影。"),
            es = LocalizedContent("¿Qué director creó la franquicia 'Rocky'?", listOf("Steven Spielberg", "Martin Scorsese", "John G. Avildsen", "Sylvester Stallone"), "Cine", "John G. Avildsen dirigió la primera película de Rocky en 1976, ganando el Oscar a la mejor película. Sylvester Stallone escribió el guion e interpretó el papel principal, pero Avildsen dirigió este clásico del cine.")
        ),
        BilingualQuestion(
            id = 50273, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel rappeur français est connu pour 'La Sueur de l'Effort'?", listOf("Booba", "Sexion d'Assaut", "Rohff", "Kool Shen"), "Musique", "Booba a sorti la chanson \"La Sueur de l'Effort\" sur son album \"Futur\" en 2012, un titre devenu emblématique de son style."),
            en = LocalizedContent("Which French rapper is known for 'La Sueur de l'Effort'?", listOf("Booba", "Sexion d'Assaut", "Rohff", "Kool Shen"), "Music", "Booba released the song 'La Sueur de l'Effort' on his album 'Futur' in 2012, a track that became emblematic of his style."),
            zh = LocalizedContent("哪位法国说唱歌手以《La Sueur de l'Effort》闻名？", listOf("Booba", "Sexion d'Assaut", "Rohff", "Kool Shen"), "音乐", "Booba在2012年的专辑《Futur》中发布了歌曲《La Sueur de l'Effort》，这首歌成为他风格的标志。"),
            es = LocalizedContent("¿Qué rapero francés es conocido por 'La Sueur de l'Effort'?", listOf("Booba", "Sexion d'Assaut", "Rohff", "Kool Shen"), "Musica", "Booba lanzó la canción 'La Sueur de l'Effort' en su álbum 'Futur' en 2012, un tema que se volvió emblemático de su estilo.")
        ),
        BilingualQuestion(
            id = 50274, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était l'année du premier vol d'un avion?", listOf("1900", "1901", "1902", "1903"), "Histoire", "Le premier vol motorisé et contrôlé d'un avion a été réalisé par les frères Wright le 17 décembre 1903 à Kitty Hawk, en Caroline du Nord."),
            en = LocalizedContent("What was the year of the first airplane flight?", listOf("1900", "1901", "1902", "1903"), "History", "The first powered, controlled airplane flight was made by the Wright brothers on December 17, 1903, at Kitty Hawk, North Carolina."),
            zh = LocalizedContent("第一架飞机飞行是在哪一年？", listOf("1900", "1901", "1902", "1903"), "历史", "莱特兄弟于1903年12月17日在北卡罗来纳州基蒂霍克进行了首次动力控制飞行。"),
            es = LocalizedContent("¿Cuál fue el año del primer vuelo de un avión?", listOf("1900", "1901", "1902", "1903"), "Historia", "El primer vuelo motorizado y controlado de un avión fue realizado por los hermanos Wright el 17 de diciembre de 1903 en Kitty Hawk, Carolina del Norte.")
        ),
        BilingualQuestion(
            id = 50275, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand poisson du monde?", listOf("Baleine bleue", "Baleine épaulard", "Grand blanc", "Requin baleine"), "Science", "Le requin baleine peut atteindre jusqu'à 18 mètres de long, ce qui en fait le plus grand poisson vivant, bien qu'il se nourrisse principalement de plancton."),
            en = LocalizedContent("What is the largest fish in the world?", listOf("Blue whale", "Killer whale", "Great white shark", "Whale shark"), "Science", "The whale shark can reach up to 18 meters in length, making it the largest living fish, although it primarily feeds on plankton."),
            zh = LocalizedContent("世界上最大的鱼是什么？", listOf("蓝鲸", "虎鲸", "大白鲨", "鲸鲨"), "科学", "鲸鲨可以长达18米，是现存最大的鱼类，尽管它主要以浮游生物为食。"),
            es = LocalizedContent("¿Cuál es el pez más grande del mundo?", listOf("Ballena azul", "Orca", "Tiburón blanco", "Tiburón ballena"), "Ciencia", "El tiburón ballena puede alcanzar hasta 18 metros de longitud, lo que lo convierte en el pez vivo más grande, aunque se alimenta principalmente de plancton.")
        ),
        BilingualQuestion(
            id = 50276, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand volcan actif du monde?", listOf("Mont Fuji", "Piton de la Fournaise", "Sakurajima", "Kilauea"), "Géographie", "Sakurajima, situé dans la préfecture de Kagoshima au Japon, est considéré comme l'un des volcans les plus actifs au monde, avec des éruptions quasi quotidiennes."),
            en = LocalizedContent("What is the largest active volcano in the world?", listOf("Mount Fuji", "Piton de la Fournaise", "Sakurajima", "Kilauea"), "Geography", "Sakurajima, located in Kagoshima Prefecture, Japan, is considered one of the most active volcanoes in the world, with almost daily eruptions."),
            zh = LocalizedContent("世界上最大的活火山是什么？", listOf("富士山", "富尔奈斯火山", "樱岛火山", "基拉韦厄火山"), "地理", "樱岛火山位于日本鹿儿岛县，被认为是世界上最活跃的火山之一，几乎每天都有喷发。"),
            es = LocalizedContent("¿Cuál es el volcán activo más grande del mundo?", listOf("Monte Fuji", "Pitón de la Fournaise", "Sakurajima", "Kilauea"), "Geografia", "Sakurajima, ubicado en la prefectura de Kagoshima, Japón, es considerado uno de los volcanes más activos del mundo, con erupciones casi diarias.")
        ),
        BilingualQuestion(
            id = 50277, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien temple bouddhiste du monde?", listOf("Temple de Bodh Gaya", "Temple du Dalada Maligawa", "Temple de Dambulla", "Temple de Anuradhapura"), "Culture", "Le temple de Anuradhapura, au Sri Lanka, est considéré comme le plus ancien temple bouddhiste car il abrite un arbre sacré issu de l'arbre sous lequel Bouddha atteignit l'illumination, planté en 288 av. J.-C."),
            en = LocalizedContent("What is the oldest Buddhist temple in the world?", listOf("Bodh Gaya Temple", "Temple of the Tooth", "Dambulla Temple", "Anuradhapura Temple"), "Culture", "The Anuradhapura Temple in Sri Lanka is considered the oldest Buddhist temple because it houses a sacred tree descended from the tree under which Buddha attained enlightenment, planted in 288 BC."),
            zh = LocalizedContent("世界上最古老的佛教寺庙是什么？", listOf("菩提伽耶寺", "佛牙寺", "丹布勒寺", "阿努拉德普勒寺"), "文化", "斯里兰卡的阿努拉德普勒寺被认为是最古老的佛教寺庙，因为它供奉着一棵圣树，这棵树源自佛陀成道的那棵树，种植于公元前288年。"),
            es = LocalizedContent("¿Cuál es el templo budista más antiguo del mundo?", listOf("Templo de Bodh Gaya", "Templo del Diente", "Templo de Dambulla", "Templo de Anuradhapura"), "Cultura", "El templo de Anuradhapura en Sri Lanka es considerado el templo budista más antiguo porque alberga un árbol sagrado descendiente del árbol bajo el cual Buda alcanzó la iluminación, plantado en el 288 a.C.")
        ),
        BilingualQuestion(
            id = 50278, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel équipe de football a remporté la Ligue des Champions le plus de fois?", listOf("Milan AC", "Liverpool", "Bayern Munich", "Real Madrid"), "Sport", "Le Real Madrid détient le record avec 14 titres en Ligue des Champions, loin devant les autres clubs européens."),
            en = LocalizedContent("Which football team has won the Champions League the most times?", listOf("AC Milan", "Liverpool", "Bayern Munich", "Real Madrid"), "Sports", "Real Madrid holds the record with 14 Champions League titles, far ahead of other European clubs."),
            zh = LocalizedContent("哪支足球队赢得欧冠次数最多？", listOf("AC米兰", "利物浦", "拜仁慕尼黑", "皇家马德里"), "体育", "皇家马德里以14次欧冠冠军保持纪录，远远领先于其他欧洲俱乐部。"),
            es = LocalizedContent("¿Qué equipo de fútbol ha ganado la Liga de Campeones más veces?", listOf("AC Milan", "Liverpool", "Bayern Múnich", "Real Madrid"), "Deportes", "El Real Madrid tiene el récord con 14 títulos de la Liga de Campeones, muy por delante de otros clubes europeos.")
        ),
        BilingualQuestion(
            id = 50279, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film a remporté le plus d'Oscars?", listOf("Ben-Hur", "Titanic", "The Lord of the Rings: The Return of the King", "West Side Story"), "Cinéma", "Le Retour du Roi a remporté 11 Oscars en 2004, égalant le record de Ben-Hur et Titanic, et devenant le seul film de fantasy à obtenir le prix du meilleur film."),
            en = LocalizedContent("Which film has won the most Oscars?", listOf("Ben-Hur", "Titanic", "The Lord of the Rings: The Return of the King", "West Side Story"), "Cinema", "The Return of the King won 11 Oscars in 2004, tying the record of Ben-Hur and Titanic, and becoming the only fantasy film to win Best Picture."),
            zh = LocalizedContent("哪部电影获得奥斯卡奖最多？", listOf("宾虚", "泰坦尼克号", "指环王：王者归来", "西区故事"), "电影", "《王者归来》在2004年获得了11项奥斯卡奖，追平了《宾虚》和《泰坦尼克号》的纪录，并成为唯一获得最佳影片的奇幻电影。"),
            es = LocalizedContent("¿Qué película ha ganado más premios Óscar?", listOf("Ben-Hur", "Titanic", "El Señor de los Anillos: El Retorno del Rey", "West Side Story"), "Cine", "El Retorno del Rey ganó 11 Óscar en 2004, empatando el récord de Ben-Hur y Titanic, y convirtiéndose en la única película de fantasía en ganar el premio a la mejor película.")
        ),
        BilingualQuestion(
            id = 50280, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel chanteur a créé 'Thriller'?", listOf("Prince", "Madonna", "Michael Jackson", "Prince"), "Musique", "Michael Jackson a sorti 'Thriller' en 1982 sur l'album du même nom, devenant l'un des clips les plus emblématiques de l'histoire de la musique."),
            en = LocalizedContent("Which singer created 'Thriller'?", listOf("Prince", "Madonna", "Michael Jackson", "Prince"), "Music", "Michael Jackson released 'Thriller' in 1982 on the album of the same name, becoming one of the most iconic music videos in history."),
            zh = LocalizedContent("哪位歌手创作了《Thriller》？", listOf("王子", "麦当娜", "迈克尔·杰克逊", "王子"), "音乐", "迈克尔·杰克逊于1982年发行了《Thriller》，同名专辑中的这首歌成为历史上最具标志性的音乐视频之一。"),
            es = LocalizedContent("¿Qué cantante creó 'Thriller'?", listOf("Prince", "Madonna", "Michael Jackson", "Prince"), "Musica", "Michael Jackson lanzó 'Thriller' en 1982 en el álbum del mismo nombre, convirtiéndose en uno de los videos musicales más icónicos de la historia.")
        ),
        BilingualQuestion(
            id = 50281, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était l'année de la fin de l'esclavage aux États-Unis?", listOf("1862", "1863", "1864", "1865"), "Histoire", "L'esclavage a officiellement pris fin aux États-Unis en 1865 avec l'adoption du 13e amendement à la Constitution, après la guerre de Sécession."),
            en = LocalizedContent("What was the year of the end of slavery in the United States?", listOf("1862", "1863", "1864", "1865"), "History", "Slavery officially ended in the United States in 1865 with the adoption of the 13th Amendment to the Constitution, after the Civil War."),
            zh = LocalizedContent("美国奴隶制结束是在哪一年？", listOf("1862", "1863", "1864", "1865"), "历史", "美国奴隶制于1865年正式结束，当时通过了宪法第13修正案，内战结束后。"),
            es = LocalizedContent("¿Cuál fue el año del fin de la esclavitud en los Estados Unidos?", listOf("1862", "1863", "1864", "1865"), "Historia", "La esclavitud terminó oficialmente en los Estados Unidos en 1865 con la adopción de la 13.ª Enmienda a la Constitución, después de la Guerra Civil.")
        ),
    )

    private fun part4(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 50282, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus profond endroit de l'Océan?", listOf("Fosse de Kuril-Kamchatka", "Fosse de Tonga", "Fosse des Mariannes", "Fosse de Porto Rico"), "Science", "La fosse des Mariannes, située dans l'océan Pacifique, atteint environ 11 034 mètres de profondeur à son point le plus bas, appelé le Challenger Deep."),
            en = LocalizedContent("What is the deepest place in the ocean?", listOf("Kuril-Kamchatka Trench", "Tonga Trench", "Mariana Trench", "Puerto Rico Trench"), "Science", "The Mariana Trench, located in the Pacific Ocean, reaches about 11,034 meters at its deepest point, called the Challenger Deep."),
            zh = LocalizedContent("海洋中最深的地方是哪里？", listOf("千岛-堪察加海沟", "汤加海沟", "马里亚纳海沟", "波多黎各海沟"), "科学", "马里亚纳海沟位于太平洋，其最深处挑战者深渊深度约为11034米。"),
            es = LocalizedContent("¿Cuál es el lugar más profundo del océano?", listOf("Fosa de Kuril-Kamchatka", "Fosa de Tonga", "Fosa de las Marianas", "Fosa de Puerto Rico"), "Ciencia", "La fosa de las Marianas, ubicada en el océano Pacífico, alcanza unos 11,034 metros en su punto más profundo, llamado el Abismo Challenger.")
        ),
        BilingualQuestion(
            id = 50283, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus long fleuve d'Afrique?", listOf("Zambèze", "Congo", "Nil", "Niger"), "Géographie", "Le Nil s'étend sur environ 6 650 km, traversant onze pays d'Afrique de l'Est et du Nord, ce qui en fait le plus long fleuve du continent."),
            en = LocalizedContent("What is the longest river in Africa?", listOf("Zambezi", "Congo", "Nile", "Niger"), "Geography", "The Nile stretches about 6,650 km, flowing through eleven countries in East and North Africa, making it the longest river on the continent."),
            zh = LocalizedContent("非洲最长的河流是哪条？", listOf("赞比西河", "刚果河", "尼罗河", "尼日尔河"), "地理", "尼罗河长约6650公里，流经东非和北非的十一个国家，是非洲最长的河流。"),
            es = LocalizedContent("¿Cuál es el río más largo de África?", listOf("Zambeze", "Congo", "Nilo", "Níger"), "Geografía", "El Nilo se extiende unos 6,650 km, atravesando once países del este y norte de África, lo que lo convierte en el río más largo del continente.")
        ),
        BilingualQuestion(
            id = 50284, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien tapis tissu?", listOf("Tapis de Pazyryk", "Tapis d'Isfahan", "Tapis d'Anatolie", "Tapis de Soie de Chine"), "Culture", "Découvert dans un kourgane gelé de l'Altaï sibérien, le tapis de Pazyryk date du Ve siècle avant J.-C. et est conservé au musée de l'Ermitage."),
            en = LocalizedContent("What is the oldest woven carpet?", listOf("Pazyryk Carpet", "Isfahan Carpet", "Anatolian Carpet", "Chinese Silk Carpet"), "Culture", "Discovered in a frozen kurgan in the Siberian Altai, the Pazyryk Carpet dates from the 5th century BC and is preserved in the Hermitage Museum."),
            zh = LocalizedContent("最古老的编织地毯是什么？", listOf("巴泽雷克地毯", "伊斯法罕地毯", "安纳托利亚地毯", "中国丝毯"), "文化", "巴泽雷克地毯发现于西伯利亚阿尔泰的一个冰冻墓冢中，可追溯到公元前5世纪，现藏于冬宫博物馆。"),
            es = LocalizedContent("¿Cuál es la alfombra tejida más antigua?", listOf("Alfombra de Pazyryk", "Alfombra de Isfahán", "Alfombra de Anatolia", "Alfombra de Seda China"), "Cultura", "Descubierta en un kurgan congelado en el Altái siberiano, la alfombra de Pazyryk data del siglo V a.C. y se conserva en el Museo del Hermitage.")
        ),
        BilingualQuestion(
            id = 50285, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel équipe de hockey remporté la Stanley Cup le plus de fois?", listOf("Toronto Maple Leafs", "Montreal Canadiens", "Boston Bruins", "New York Rangers"), "Sport", "Les Canadiens de Montréal ont remporté la Stanley Cup 24 fois, un record dans la LNH, avec leur dernier titre en 1993."),
            en = LocalizedContent("Which hockey team has won the Stanley Cup the most times?", listOf("Toronto Maple Leafs", "Montreal Canadiens", "Boston Bruins", "New York Rangers"), "Sports", "The Montreal Canadiens have won the Stanley Cup 24 times, a record in the NHL, with their last title in 1993."),
            zh = LocalizedContent("哪支冰球队赢得斯坦利杯次数最多？", listOf("多伦多枫叶队", "蒙特利尔加拿大人队", "波士顿棕熊队", "纽约游骑兵队"), "体育", "蒙特利尔加拿大人队共赢得24次斯坦利杯，是NHL纪录，最近一次夺冠是在1993年。"),
            es = LocalizedContent("¿Qué equipo de hockey ha ganado la Copa Stanley más veces?", listOf("Toronto Maple Leafs", "Montreal Canadiens", "Boston Bruins", "New York Rangers"), "Deportes", "Los Montreal Canadiens han ganado la Copa Stanley 24 veces, un récord en la NHL, con su último título en 1993.")
        ),
        BilingualQuestion(
            id = 50286, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a créé 'Forrest Gump'?", listOf("James Cameron", "Robert Zemeckis", "Steven Spielberg", "Martin Scorsese"), "Cinéma", "Robert Zemeckis a réalisé Forrest Gump en 1994, un film emblématique qui a remporté six Oscars, dont celui du meilleur film."),
            en = LocalizedContent("Which director created 'Forrest Gump'?", listOf("James Cameron", "Robert Zemeckis", "Steven Spielberg", "Martin Scorsese"), "Cinema", "Robert Zemeckis directed Forrest Gump in 1994, an iconic film that won six Oscars, including Best Picture."),
            zh = LocalizedContent("哪位导演创作了《阿甘正传》？", listOf("詹姆斯·卡梅隆", "罗伯特·泽米吉斯", "史蒂文·斯皮尔伯格", "马丁·斯科塞斯"), "电影", "罗伯特·泽米吉斯于1994年执导了《阿甘正传》，这部标志性电影获得了六项奥斯卡奖，包括最佳影片。"),
            es = LocalizedContent("¿Qué director creó 'Forrest Gump'?", listOf("James Cameron", "Robert Zemeckis", "Steven Spielberg", "Martin Scorsese"), "Cine", "Robert Zemeckis dirigió Forrest Gump en 1994, una película icónica que ganó seis premios Oscar, incluyendo Mejor Película.")
        ),
        BilingualQuestion(
            id = 50287, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe britannique de rock progressif a sorti l'album concept 'The Wall' en 1979 ?", listOf("Led Zeppelin", "Pink Floyd", "The Who", "Black Sabbath"), "Musique", "Pink Floyd a sorti The Wall en 1979, un album concept qui explore l'isolement et la guerre, devenu l'un des opéras rock les plus célèbres du groupe britannique."),
            en = LocalizedContent("Which British progressive rock band released the concept album 'The Wall' in 1979?", listOf("Led Zeppelin", "Pink Floyd", "The Who", "Black Sabbath"), "Music", "Pink Floyd released The Wall in 1979, a concept album exploring isolation and war, becoming one of the most famous rock operas by the British band."),
            zh = LocalizedContent("哪支英国前卫摇滚乐队在1979年发行了概念专辑《迷墙》？", listOf("齐柏林飞艇", "平克·弗洛伊德", "谁人乐队", "黑色安息日"), "音乐", "平克·弗洛伊德于1979年发行了《迷墙》，这张概念专辑探讨了孤立与战争，成为这支英国乐队最著名的摇滚歌剧之一。"),
            es = LocalizedContent("¿Qué banda británica de rock progresivo lanzó el álbum conceptual 'The Wall' en 1979?", listOf("Led Zeppelin", "Pink Floyd", "The Who", "Black Sabbath"), "Música", "Pink Floyd lanzó The Wall en 1979, un álbum conceptual que explora el aislamiento y la guerra, convirtiéndose en una de las óperas rock más famosas de la banda británica.")
        ),
        BilingualQuestion(
            id = 50288, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le plus long règne d'un monarque?", listOf("Napoléon", "Louis XIV", "Victoria", "Georges III"), "Histoire", "Louis XIV a régné 72 ans et 110 jours, de 1643 à 1715, ce qui en fait le plus long règne d'un monarque dans l'histoire mondiale."),
            en = LocalizedContent("What was the longest reign of a monarch?", listOf("Napoleon", "Louis XIV", "Victoria", "George III"), "History", "Louis XIV reigned for 72 years and 110 days, from 1643 to 1715, making it the longest reign of a monarch in world history."),
            zh = LocalizedContent("哪位君主的统治时间最长？", listOf("拿破仑", "路易十四", "维多利亚", "乔治三世"), "历史", "路易十四在位72年零110天，从1643年到1715年，是世界历史上在位时间最长的君主。"),
            es = LocalizedContent("¿Cuál fue el reinado más largo de un monarca?", listOf("Napoleón", "Luis XIV", "Victoria", "Jorge III"), "Historia", "Luis XIV reinó durante 72 años y 110 días, de 1643 a 1715, lo que lo convierte en el reinado más largo de un monarca en la historia mundial.")
        ),
        BilingualQuestion(
            id = 50289, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand arbre du monde?", listOf("General Sherman", "Hyperion", "Methuselah", "Sarv-e Abarkuh"), "Science", "Le General Sherman est un séquoia géant situé dans le parc national de Sequoia en Californie, considéré comme le plus grand arbre du monde en volume."),
            en = LocalizedContent("What is the largest tree in the world?", listOf("General Sherman", "Hyperion", "Methuselah", "Sarv-e Abarkuh"), "Science", "General Sherman is a giant sequoia located in Sequoia National Park in California, considered the largest tree in the world by volume."),
            zh = LocalizedContent("世界上最大的树是什么？", listOf("谢尔曼将军树", "亥伯龙树", "玛士撒拉树", "阿巴尔库树"), "科学", "谢尔曼将军树是一棵巨型红杉，位于加利福尼亚州的红杉国家公园，按体积计算被认为是世界上最大的树。"),
            es = LocalizedContent("¿Cuál es el árbol más grande del mundo?", listOf("General Sherman", "Hyperion", "Matusalén", "Sarv-e Abarkuh"), "Ciencia", "El General Sherman es una secuoya gigante ubicada en el Parque Nacional de las Secuoyas en California, considerada el árbol más grande del mundo por volumen.")
        ),
        BilingualQuestion(
            id = 50290, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de montagnes?", listOf("Suisse", "Népal", "Pakistann", "Chine"), "Géographie", "La Chine possède le plus grand nombre de montagnes en raison de sa vaste superficie et de la présence de chaînes majeures comme l'Himalaya, le Karakoram et le Kunlun."),
            en = LocalizedContent("Which country has the most mountains?", listOf("Switzerland", "Nepal", "Pakistan", "China"), "Geography", "China has the largest number of mountains due to its vast area and the presence of major ranges like the Himalayas, Karakoram, and Kunlun."),
            zh = LocalizedContent("哪个国家的山脉最多？", listOf("瑞士", "尼泊尔", "巴基斯坦", "中国"), "地理", "中国拥有最多的山脉，因为其广阔的领土和主要山脉如喜马拉雅山、喀喇昆仑山和昆仑山的存在。"),
            es = LocalizedContent("¿Qué país tiene más montañas?", listOf("Suiza", "Nepal", "Pakistán", "China"), "Geografía", "China tiene la mayor cantidad de montañas debido a su vasta superficie y la presencia de cadenas importantes como el Himalaya, el Karakórum y el Kunlun.")
        ),
        BilingualQuestion(
            id = 50291, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien carnaval du monde?", listOf("Carnaval de Venise", "Carnaval de Rio", "Carnaval de Cadix", "Carnaval de Binche"), "Culture", "Le Carnaval de Venise est attesté dès le XIIIe siècle, ce qui en fait le plus ancien carnaval encore célébré, avec des origines remontant à la République de Venise."),
            en = LocalizedContent("What is the oldest carnival in the world?", listOf("Venice Carnival", "Rio Carnival", "Cádiz Carnival", "Binche Carnival"), "Culture", "The Venice Carnival is attested as early as the 13th century, making it the oldest carnival still celebrated, with origins dating back to the Republic of Venice."),
            zh = LocalizedContent("世界上最古老的狂欢节是什么？", listOf("威尼斯狂欢节", "里约狂欢节", "加的斯狂欢节", "班什狂欢节"), "文化", "威尼斯狂欢节最早可追溯到13世纪，是仍在庆祝的最古老狂欢节，其起源可追溯到威尼斯共和国时期。"),
            es = LocalizedContent("¿Cuál es el carnaval más antiguo del mundo?", listOf("Carnaval de Venecia", "Carnaval de Río", "Carnaval de Cádiz", "Carnaval de Binche"), "Cultura", "El Carnaval de Venecia está atestiguado desde el siglo XIII, lo que lo convierte en el carnaval más antiguo que aún se celebra, con orígenes que se remontan a la República de Venecia.")
        ),
        BilingualQuestion(
            id = 50292, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel nageur a remporté le plus de médailles olympiques d'or?", listOf("Michael Phelps", "Mark Spitz", "Matt Biondi", "Carl Lewis"), "Sport", "Michael Phelps détient le record du plus grand nombre de médailles d'or olympiques avec 23 titres, remportés entre 2004 et 2016."),
            en = LocalizedContent("Which swimmer has won the most Olympic gold medals?", listOf("Michael Phelps", "Mark Spitz", "Matt Biondi", "Carl Lewis"), "Sports", "Michael Phelps holds the record for the most Olympic gold medals with 23 titles, won between 2004 and 2016."),
            zh = LocalizedContent("哪位游泳运动员获得最多奥运金牌？", listOf("迈克尔·菲尔普斯", "马克·斯皮茨", "马特·比昂迪", "卡尔·刘易斯"), "体育", "迈克尔·菲尔普斯以23枚金牌保持着奥运金牌最多纪录，这些金牌是在2004年至2016年间获得的。"),
            es = LocalizedContent("¿Qué nadador ha ganado más medallas de oro olímpicas?", listOf("Michael Phelps", "Mark Spitz", "Matt Biondi", "Carl Lewis"), "Deportes", "Michael Phelps ostenta el récord de más medallas de oro olímpicas con 23 títulos, ganados entre 2004 y 2016.")
        ),
        BilingualQuestion(
            id = 50293, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film documentaire a remporté l'Oscar?", listOf("Free Solo", "My Octopus Teacher", "All Quiet on the Western Front", "Drive My Car"), "Cinéma", "My Octopus Teacher a remporté l'Oscar du meilleur film documentaire en 2021, racontant l'amitié entre un plongeur et une pieuvre dans une forêt de kelp sud-africaine."),
            en = LocalizedContent("Which documentary film won the Oscar?", listOf("Free Solo", "My Octopus Teacher", "All Quiet on the Western Front", "Drive My Car"), "Cinema", "My Octopus Teacher won the Oscar for Best Documentary Feature in 2021, telling the story of a friendship between a diver and an octopus in a South African kelp forest."),
            zh = LocalizedContent("哪部纪录片获得了奥斯卡奖？", listOf("徒手攀岩", "我的章鱼老师", "西线无战事", "驾驶我的车"), "电影", "《我的章鱼老师》在2021年获得奥斯卡最佳纪录长片奖，讲述了一位潜水员与南非海藻林中的一只章鱼之间的友谊故事。"),
            es = LocalizedContent("¿Qué película documental ganó el Oscar?", listOf("Free Solo", "My Octopus Teacher", "All Quiet on the Western Front", "Drive My Car"), "Cine", "My Octopus Teacher ganó el Oscar al mejor documental en 2021, narrando la amistad entre un buceador y un pulpo en un bosque de algas sudafricano.")
        ),
        BilingualQuestion(
            id = 50294, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur a écrit 'Eine kleine Nachtmusik'?", listOf("Haydn", "Mozart", "Bach", "Beethoven"), "Musique", "Mozart a composé 'Eine kleine Nachtmusik' (Une petite musique de nuit) en 1787, une sérénade pour orchestre à cordes devenue l'une de ses œuvres les plus célèbres."),
            en = LocalizedContent("Which composer wrote 'Eine kleine Nachtmusik'?", listOf("Haydn", "Mozart", "Bach", "Beethoven"), "Music", "Mozart composed 'Eine kleine Nachtmusik' (A Little Night Music) in 1787, a serenade for string orchestra that became one of his most famous works."),
            zh = LocalizedContent("哪位作曲家创作了《小夜曲》？", listOf("海顿", "莫扎特", "巴赫", "贝多芬"), "音乐", "莫扎特于1787年创作了《小夜曲》（Eine kleine Nachtmusik），这是一首弦乐小夜曲，成为他最著名的作品之一。"),
            es = LocalizedContent("¿Qué compositor escribió 'Eine kleine Nachtmusik'?", listOf("Haydn", "Mozart", "Bach", "Beethoven"), "Musica", "Mozart compuso 'Eine kleine Nachtmusik' (Una pequeña música nocturna) en 1787, una serenata para orquesta de cuerdas que se convirtió en una de sus obras más famosas.")
        ),
        BilingualQuestion(
            id = 50295, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien traité de paix signé?", listOf("Traité de Westphalie", "Traité d'Utrecht", "Traité de Tordésillas", "Traité de Verdun"), "Histoire", "Signé en 1494 entre l'Espagne et le Portugal, ce traité partageait les terres découvertes hors d'Europe le long d'un méridien, sous l'arbitrage du pape. Il est reconnu comme le plus ancien traité de paix encore en vigueur."),
            en = LocalizedContent("What is the oldest signed peace treaty?", listOf("Treaty of Westphalia", "Treaty of Utrecht", "Treaty of Tordesillas", "Treaty of Verdun"), "History", "Signed in 1494 between Spain and Portugal, this treaty divided newly discovered lands outside Europe along a meridian, under papal arbitration. It is recognized as the oldest peace treaty still in effect."),
            zh = LocalizedContent("最古老的已签署和平条约是什么？", listOf("威斯特伐利亚和约", "乌得勒支和约", "托尔德西里亚斯条约", "凡尔登条约"), "历史", "该条约于1494年由西班牙和葡萄牙签署，在教皇仲裁下沿一条子午线划分欧洲以外新发现的土地。它被公认为仍然有效的最古老和平条约。"),
            es = LocalizedContent("¿Cuál es el tratado de paz firmado más antiguo?", listOf("Tratado de Westfalia", "Tratado de Utrecht", "Tratado de Tordesillas", "Tratado de Verdún"), "Historia", "Firmado en 1494 entre España y Portugal, este tratado dividió las tierras recién descubiertas fuera de Europa a lo largo de un meridiano, bajo el arbitraje del papa. Es reconocido como el tratado de paz más antiguo aún vigente.")
        ),
        BilingualQuestion(
            id = 50296, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus petit noyau atomique?", listOf("Atome d'hydrogène", "Atome d'hélium", "Noyau de deutérium", "Proton"), "Science", "Le noyau de l'atome d'hydrogène est constitué d'un seul proton, ce qui en fait le plus petit et le plus léger noyau atomique connu."),
            en = LocalizedContent("What is the smallest atomic nucleus?", listOf("Hydrogen atom", "Helium atom", "Deuterium nucleus", "Proton"), "Science", "The nucleus of a hydrogen atom consists of a single proton, making it the smallest and lightest known atomic nucleus."),
            zh = LocalizedContent("最小的原子核是什么？", listOf("氢原子", "氦原子", "氘核", "质子"), "科学", "氢原子的原子核由一个质子组成，使其成为已知最小最轻的原子核。"),
            es = LocalizedContent("¿Cuál es el núcleo atómico más pequeño?", listOf("Átomo de hidrógeno", "Átomo de helio", "Núcleo de deuterio", "Protón"), "Ciencia", "El núcleo del átomo de hidrógeno consiste en un solo protón, lo que lo convierte en el núcleo atómico más pequeño y ligero conocido.")
        ),
        BilingualQuestion(
            id = 50297, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand parc national d'Amérique du Nord?", listOf("Yellowstone", "Grand Canyon", "Denali", "Wrangell-St. Elias"), "Géographie", "Le parc national Wrangell-St. Elias, situé en Alaska, couvre plus de 53 000 km², ce qui en fait le plus vaste des États-Unis et d'Amérique du Nord."),
            en = LocalizedContent("What is the largest national park in North America?", listOf("Yellowstone", "Grand Canyon", "Denali", "Wrangell-St. Elias"), "Geography", "Wrangell-St. Elias National Park, located in Alaska, covers over 53,000 km², making it the largest in the United States and North America."),
            zh = LocalizedContent("北美最大的国家公园是哪个？", listOf("黄石", "大峡谷", "德纳里", "朗格尔-圣埃利亚斯"), "地理", "位于阿拉斯加的朗格尔-圣埃利亚斯国家公园面积超过53,000平方公里，是美国和北美最大的国家公园。"),
            es = LocalizedContent("¿Cuál es el parque nacional más grande de América del Norte?", listOf("Yellowstone", "Gran Cañón", "Denali", "Wrangell-St. Elias"), "Geografia", "El Parque Nacional Wrangell-St. Elias, ubicado en Alaska, cubre más de 53,000 km², lo que lo convierte en el más grande de Estados Unidos y América del Norte.")
        ),
        BilingualQuestion(
            id = 50298, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien festival de danse du monde?", listOf("Festival de danse d'Avignon", "Festival de danse de Jerash", "Festival de danse de Roc Amadour", "Festival de danse d'Ajaccio"), "Culture", "Le Festival de danse de Jerash, en Jordanie, est considéré comme le plus ancien festival de danse du monde, créé en 1981 dans le cadre des célébrations du site antique de Jerash."),
            en = LocalizedContent("What is the oldest dance festival in the world?", listOf("Avignon Dance Festival", "Jerash Dance Festival", "Roc Amadour Dance Festival", "Ajaccio Dance Festival"), "Culture", "The Jerash Dance Festival in Jordan is considered the oldest dance festival in the world, created in 1981 as part of the celebrations of the ancient site of Jerash."),
            zh = LocalizedContent("世界上最古老的舞蹈节是什么？", listOf("阿维尼翁舞蹈节", "杰拉什舞蹈节", "罗卡马杜尔舞蹈节", "阿雅克肖舞蹈节"), "文化", "约旦的杰拉什舞蹈节被认为是世界上最古老的舞蹈节，创建于1981年，作为杰拉什古城庆祝活动的一部分。"),
            es = LocalizedContent("¿Cuál es el festival de danza más antiguo del mundo?", listOf("Festival de danza de Avignon", "Festival de danza de Jerash", "Festival de danza de Roc Amadour", "Festival de danza de Ajaccio"), "Cultura", "El Festival de Danza de Jerash en Jordania es considerado el festival de danza más antiguo del mundo, creado en 1981 como parte de las celebraciones del sitio antiguo de Jerash.")
        ),
        BilingualQuestion(
            id = 50299, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel golfeur a remporté le plus de Majors?", listOf("Jack Nicklaus", "Tiger Woods", "Gary Player", "Arnold Palmer"), "Sport", "Jack Nicklaus détient le record du nombre de victoires en tournois majeurs avec 18 titres, un total inégalé dans l'histoire du golf professionnel."),
            en = LocalizedContent("Which golfer has won the most Majors?", listOf("Jack Nicklaus", "Tiger Woods", "Gary Player", "Arnold Palmer"), "Sports", "Jack Nicklaus holds the record for the most major championship wins with 18 titles, an unmatched total in professional golf history."),
            zh = LocalizedContent("哪位高尔夫球手赢得最多大满贯赛？", listOf("杰克·尼克劳斯", "泰格·伍兹", "加里·普莱尔", "阿诺德·帕尔默"), "体育", "杰克·尼克劳斯以18个大满贯冠军保持着最多大满贯赛胜利的纪录，这一总数在高尔夫职业历史上无人能及。"),
            es = LocalizedContent("¿Qué golfista ha ganado más Grandes?", listOf("Jack Nicklaus", "Tiger Woods", "Gary Player", "Arnold Palmer"), "Deportes", "Jack Nicklaus ostenta el récord de más victorias en torneos mayores con 18 títulos, un total sin igual en la historia del golf profesional.")
        ),
        BilingualQuestion(
            id = 50300, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a créé 'The Godfather'?", listOf("Francis Ford Coppola", "Martin Scorsese", "Martin Sheen", "Al Pacino"), "Cinéma", "Francis Ford Coppola a réalisé Le Parrain (The Godfather) en 1972, adapté du roman de Mario Puzo. Le film est devenu un classique du cinéma et a remporté trois Oscars."),
            en = LocalizedContent("Which director created 'The Godfather'?", listOf("Francis Ford Coppola", "Martin Scorsese", "Martin Sheen", "Al Pacino"), "Cinema", "Francis Ford Coppola directed The Godfather in 1972, adapted from Mario Puzo's novel. The film became a cinema classic and won three Oscars."),
            zh = LocalizedContent("哪位导演创作了《教父》？", listOf("弗朗西斯·福特·科波拉", "马丁·斯科塞斯", "马丁·辛", "阿尔·帕西诺"), "电影", "弗朗西斯·福特·科波拉于1972年执导了《教父》，改编自马里奥·普佐的小说。该片成为电影经典，并获得三项奥斯卡奖。"),
            es = LocalizedContent("¿Qué director creó 'El Padrino'?", listOf("Francis Ford Coppola", "Martin Scorsese", "Martin Sheen", "Al Pacino"), "Cine", "Francis Ford Coppola dirigió El Padrino en 1972, adaptada de la novela de Mario Puzo. La película se convirtió en un clásico del cine y ganó tres Oscars.")
        ),
        BilingualQuestion(
            id = 50301, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel rappeur français a créé 'Astérix'?", listOf("Booba", "Gims", "Gradur", "Oya"), "Musique", "Gims a choisi ce pseudonyme en référence au personnage de bande dessinée Astérix, lassé de son ancien nom de scène."),
            en = LocalizedContent("Which French rapper created 'Astérix'?", listOf("Booba", "Gims", "Gradur", "Oya"), "Music", "Gims chose this pseudonym in reference to the comic book character Astérix, tired of his former stage name."),
            zh = LocalizedContent("哪位法国说唱歌手创造了‘Astérix’？", listOf("布巴", "吉姆斯", "格拉杜尔", "奥亚"), "音乐", "吉姆斯选择了这个化名，参考了漫画人物阿斯泰利克斯，因为他厌倦了以前的艺名。"),
            es = LocalizedContent("¿Qué rapero francés creó 'Astérix'?", listOf("Booba", "Gims", "Gradur", "Oya"), "Musica", "Gims eligió este seudónimo en referencia al personaje de cómic Astérix, cansado de su antiguo nombre artístico.")
        ),
        BilingualQuestion(
            id = 50302, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien périodique publié?", listOf("Gazette de France", "Mercure Galant", "Journal des Savants", "Moniteur Universel"), "Histoire", "Le Journal des Savants, fondé en 1665, est considéré comme le plus ancien périodique encore publié, ayant précédé de peu les Philosophical Transactions de la Royal Society."),
            en = LocalizedContent("What is the oldest periodical still in publication?", listOf("Gazette de France", "Mercure Galant", "Journal des Savants", "Moniteur Universel"), "History", "The Journal des Savants, founded in 1665, is considered the oldest periodical still in publication, predating the Philosophical Transactions of the Royal Society by a few years."),
            zh = LocalizedContent("仍在出版的最古老的期刊是什么？", listOf("法国公报", "风雅信使", "学者报", "世界箴言报"), "历史", "《学者报》创刊于1665年，被认为是仍在出版的最古老期刊，比皇家学会的《哲学汇刊》早几年。"),
            es = LocalizedContent("¿Cuál es el periódico más antiguo que aún se publica?", listOf("Gazette de France", "Mercure Galant", "Journal des Savants", "Moniteur Universel"), "Historia", "El Journal des Savants, fundado en 1665, es considerado el periódico más antiguo que aún se publica, precediendo por poco a las Philosophical Transactions de la Royal Society.")
        ),
        BilingualQuestion(
            id = 50303, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand parc éolien du monde?", listOf("Parc éolien de Jaisalmer", "Parc éolien de Gansu", "Parc éolien de Roscoe", "Parc éolien de Hornsea"), "Science", "Situé au large des côtes britanniques, le parc éolien de Hornsea est le plus grand du monde en termes de capacité installée, avec plus de 1,2 gigawatt."),
            en = LocalizedContent("What is the largest wind farm in the world?", listOf("Jaisalmer Wind Park", "Gansu Wind Farm", "Roscoe Wind Farm", "Hornsea Wind Farm"), "Science", "Located off the British coast, the Hornsea Wind Farm is the largest in the world in terms of installed capacity, with over 1.2 gigawatts."),
            zh = LocalizedContent("世界上最大的风电场是什么？", listOf("杰伊瑟尔梅尔风电场", "甘肃风电场", "罗斯科风电场", "霍恩西风电场"), "科学", "位于英国海岸外的霍恩西风电场是世界上装机容量最大的风电场，超过1.2吉瓦。"),
            es = LocalizedContent("¿Cuál es el parque eólico más grande del mundo?", listOf("Parque eólico de Jaisalmer", "Parque eólico de Gansu", "Parque eólico de Roscoe", "Parque eólico de Hornsea"), "Ciencia", "Situado frente a la costa británica, el parque eólico de Hornsea es el más grande del mundo en términos de capacidad instalada, con más de 1,2 gigavatios.")
        ),
        BilingualQuestion(
            id = 50304, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand barrage du monde?", listOf("Barrage d'Assouan", "Barrage de Kariba", "Barrage des Trois-Gorges", "Barrage de Gariep"), "Géographie", "Le barrage des Trois-Gorges, situé sur le fleuve Yangtsé en Chine, détient le record mondial de capacité de production électrique avec 22 500 MW."),
            en = LocalizedContent("What is the largest dam in the world?", listOf("Aswan Dam", "Kariba Dam", "Three Gorges Dam", "Gariep Dam"), "Geography", "The Three Gorges Dam, located on the Yangtze River in China, holds the world record for electricity production capacity with 22,500 MW."),
            zh = LocalizedContent("世界上最大的水坝是什么？", listOf("阿斯旺大坝", "卡里巴大坝", "三峡大坝", "加里普大坝"), "地理", "位于中国长江上的三峡大坝以22,500兆瓦的发电容量保持着世界纪录。"),
            es = LocalizedContent("¿Cuál es la presa más grande del mundo?", listOf("Presa de Asuán", "Presa de Kariba", "Presa de las Tres Gargantas", "Presa de Gariep"), "Geografía", "La presa de las Tres Gargantas, situada en el río Yangtsé en China, ostenta el récord mundial de capacidad de producción eléctrica con 22.500 MW.")
        ),
        BilingualQuestion(
            id = 50305, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien jardin du monde?", listOf("Jardin du Taj Mahal", "Jardin de Versailles", "Jardin Impérial de Kyoto", "Jardin de l'Alhambra"), "Culture", "Le Jardin Impérial de Kyoto, au Japon, est considéré comme le plus ancien jardin du monde, ses origines remontant au 7e siècle. Il fait partie du Palais Impérial de Kyoto et a été conçu pour la résidence de l'empereur."),
            en = LocalizedContent("What is the oldest garden in the world?", listOf("Taj Mahal Garden", "Garden of Versailles", "Kyoto Imperial Garden", "Alhambra Garden"), "Culture", "The Kyoto Imperial Garden in Japan is considered the oldest garden in the world, with origins dating back to the 7th century. It is part of the Kyoto Imperial Palace and was designed for the emperor's residence."),
            zh = LocalizedContent("世界上最古老的花园是什么？", listOf("泰姬陵花园", "凡尔赛花园", "京都御苑", "阿尔罕布拉宫花园"), "文化", "日本京都御苑被认为是世界上最古老的花园，其起源可追溯到7世纪。它是京都御所的一部分，为天皇的居所而设计。"),
            es = LocalizedContent("¿Cuál es el jardín más antiguo del mundo?", listOf("Jardín del Taj Mahal", "Jardín de Versalles", "Jardín Imperial de Kioto", "Jardín de la Alhambra"), "Cultura", "El Jardín Imperial de Kioto en Japón es considerado el jardín más antiguo del mundo, con orígenes que se remontan al siglo VII. Forma parte del Palacio Imperial de Kioto y fue diseñado para la residencia del emperador.")
        ),
        BilingualQuestion(
            id = 50306, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel athlète a remporté le plus de médailles olympiques?", listOf("Michael Phelps", "Larisa Latynina", "Nadia Comăneci", "Mark Spitz"), "Sport", "Michael Phelps détient le record du plus grand nombre de médailles olympiques avec 28, dont 23 en or, accumulées entre 2004 et 2016 en natation."),
            en = LocalizedContent("Which athlete has won the most Olympic medals?", listOf("Michael Phelps", "Larisa Latynina", "Nadia Comăneci", "Mark Spitz"), "Sports", "Michael Phelps holds the record for the most Olympic medals with 28, including 23 gold, accumulated between 2004 and 2016 in swimming."),
            zh = LocalizedContent("哪位运动员获得奥运奖牌最多？", listOf("迈克尔·菲尔普斯", "拉里莎·拉蒂尼娜", "纳迪亚·科马内奇", "马克·斯皮茨"), "体育", "迈克尔·菲尔普斯以28枚奥运奖牌（包括23枚金牌）保持着纪录，这些奖牌是在2004年至2016年间的游泳项目中获得的。"),
            es = LocalizedContent("¿Qué atleta ha ganado más medallas olímpicas?", listOf("Michael Phelps", "Larisa Latynina", "Nadia Comăneci", "Mark Spitz"), "Deportes", "Michael Phelps ostenta el récord de más medallas olímpicas con 28, incluyendo 23 de oro, acumuladas entre 2004 y 2016 en natación.")
        ),
        BilingualQuestion(
            id = 50307, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a créé 'Psycho'?", listOf("Stanley Kubrick", "Alfred Hitchcock", "Roman Polanski", "David Fincher"), "Cinéma", "Alfred Hitchcock a réalisé Psycho en 1960, un film d'horreur psychologique devenu culte pour sa scène de douche et son twist final."),
            en = LocalizedContent("Which director created 'Psycho'?", listOf("Stanley Kubrick", "Alfred Hitchcock", "Roman Polanski", "David Fincher"), "Cinema", "Alfred Hitchcock directed Psycho in 1960, a psychological horror film that became iconic for its shower scene and twist ending."),
            zh = LocalizedContent("哪位导演创作了《惊魂记》？", listOf("斯坦利·库布里克", "阿尔弗雷德·希区柯克", "罗曼·波兰斯基", "大卫·芬奇"), "电影", "阿尔弗雷德·希区柯克于1960年执导了《惊魂记》，这部心理恐怖片因其浴室场景和反转结局而成为经典。"),
            es = LocalizedContent("¿Qué director creó 'Psicosis'?", listOf("Stanley Kubrick", "Alfred Hitchcock", "Roman Polanski", "David Fincher"), "Cine", "Alfred Hitchcock dirigió Psicosis en 1960, una película de terror psicológico que se volvió icónica por su escena de la ducha y su giro final.")
        ),
        BilingualQuestion(
            id = 50308, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe de rock alternatif a créé 'Smells Like Teen Spirit'?", listOf("Pearl Jam", "Nirvana", "Soundgarden", "Alice in Chains"), "Musique", "Nirvana a popularisé le mouvement grunge au début des années 1990 avec ce titre, devenu un hymne générationnel."),
            en = LocalizedContent("Which alternative rock band created 'Smells Like Teen Spirit'?", listOf("Pearl Jam", "Nirvana", "Soundgarden", "Alice in Chains"), "Music", "Nirvana popularized the grunge movement in the early 1990s with this song, which became a generational anthem."),
            zh = LocalizedContent("哪支另类摇滚乐队创作了《少年心气》？", listOf("珍珠果酱乐队", "涅槃乐队", "声音花园乐队", "爱丽丝囚徒乐队"), "音乐", "涅槃乐队在20世纪90年代初凭借这首歌推广了垃圾摇滚运动，它成为了一代人的颂歌。"),
            es = LocalizedContent("¿Qué banda de rock alternativo creó 'Smells Like Teen Spirit'?", listOf("Pearl Jam", "Nirvana", "Soundgarden", "Alice in Chains"), "Música", "Nirvana popularizó el movimiento grunge a principios de los años 90 con esta canción, que se convirtió en un himno generacional.")
        ),
        BilingualQuestion(
            id = 50309, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'année du début de la Révolution culturelle en Chine?", listOf("1964", "1965", "1966", "1967"), "Histoire", "Mao Zedong a lancé la Révolution culturelle en 1966 pour purger les éléments bourgeois du Parti communiste chinois et réaffirmer son idéologie."),
            en = LocalizedContent("What year did the Cultural Revolution begin in China?", listOf("1964", "1965", "1966", "1967"), "History", "Mao Zedong launched the Cultural Revolution in 1966 to purge bourgeois elements from the Chinese Communist Party and reaffirm his ideology."),
            zh = LocalizedContent("中国的文化大革命始于哪一年？", listOf("1964", "1965", "1966", "1967"), "历史", "毛泽东于1966年发动了文化大革命，以清除中国共产党内的资产阶级元素并重申其意识形态。"),
            es = LocalizedContent("¿En qué año comenzó la Revolución Cultural en China?", listOf("1964", "1965", "1966", "1967"), "Historia", "Mao Zedong lanzó la Revolución Cultural en 1966 para purgar los elementos burgueses del Partido Comunista Chino y reafirmar su ideología.")
        ),
        BilingualQuestion(
            id = 50310, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand mammifère terrestre?", listOf("Girafe", "Hippopotame", "Éléphant d'Afrique", "Rhinocéros"), "Science", "L'éléphant d'Afrique est le plus grand mammifère terrestre, avec un poids pouvant atteindre 6 tonnes et une hauteur de 4 mètres au garrot."),
            en = LocalizedContent("What is the largest land mammal?", listOf("Giraffe", "Hippopotamus", "African Elephant", "Rhinoceros"), "Science", "The African elephant is the largest land mammal, with a weight of up to 6 tons and a height of 4 meters at the shoulder."),
            zh = LocalizedContent("最大的陆地哺乳动物是什么？", listOf("长颈鹿", "河马", "非洲象", "犀牛"), "科学", "非洲象是最大的陆地哺乳动物，体重可达6吨，肩高4米。"),
            es = LocalizedContent("¿Cuál es el mamífero terrestre más grande?", listOf("Jirafa", "Hipopótamo", "Elefante africano", "Rinoceronte"), "Ciencia", "El elefante africano es el mamífero terrestre más grande, con un peso de hasta 6 toneladas y una altura de 4 metros a la cruz.")
        ),
        BilingualQuestion(
            id = 50311, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grande péninsule du monde?", listOf("Péninsule arabique", "Péninsule indienne", "Péninsule de Scandinavie", "Péninsule de l'Alaska"), "Géographie", "La péninsule indienne, également appelée sous-continent indien, est la plus grande péninsule du monde avec une superficie d'environ 4,5 millions de km²."),
            en = LocalizedContent("What is the largest peninsula in the world?", listOf("Arabian Peninsula", "Indian Peninsula", "Scandinavian Peninsula", "Alaska Peninsula"), "Geography", "The Indian Peninsula, also called the Indian subcontinent, is the largest peninsula in the world with an area of about 4.5 million km²."),
            zh = LocalizedContent("世界上最大的半岛是什么？", listOf("阿拉伯半岛", "印度半岛", "斯堪的纳维亚半岛", "阿拉斯加半岛"), "地理", "印度半岛，也称为印度次大陆，是世界上最大的半岛，面积约450万平方公里。"),
            es = LocalizedContent("¿Cuál es la península más grande del mundo?", listOf("Península arábiga", "Península india", "Península escandinava", "Península de Alaska"), "Geografía", "La península india, también llamada subcontinente indio, es la península más grande del mundo con una superficie de aproximadamente 4,5 millones de km².")
        ),
        BilingualQuestion(
            id = 50312, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien art de la guerre écrit?", listOf("Bhagavad-gita", "L'art de la guerre de Sun Tzu", "Traité d'équitation de Xénophon", "Stratagèmes de Frontin"), "Culture", "L'Art de la guerre de Sun Tzu, datant du Ve siècle av. J.-C., est le plus ancien traité militaire connu. Il a influencé la stratégie en Asie et en Occident."),
            en = LocalizedContent("What is the oldest written art of war?", listOf("Bhagavad Gita", "The Art of War by Sun Tzu", "Xenophon's On Horsemanship", "Frontinus' Stratagems"), "Culture", "Sun Tzu's The Art of War, dating from the 5th century BC, is the oldest known military treatise. It has influenced strategy in Asia and the West."),
            zh = LocalizedContent("最古老的战争艺术著作是什么？", listOf("《薄伽梵歌》", "《孙子兵法》", "色诺芬的《马术论》", "弗龙蒂努斯的《谋略》"), "文化", "孙子的《孙子兵法》成书于公元前5世纪，是已知最古老的军事著作，对东西方战略思想产生了深远影响。"),
            es = LocalizedContent("¿Cuál es el arte de la guerra escrito más antiguo?", listOf("Bhagavad-gita", "El arte de la guerra de Sun Tzu", "Tratado de equitación de Jenofonte", "Estratagemas de Frontino"), "Cultura", "El arte de la guerra de Sun Tzu, que data del siglo V a.C., es el tratado militar más antiguo conocido. Ha influido en la estrategia en Asia y Occidente.")
        ),
        BilingualQuestion(
            id = 50313, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel équipe de football remporté la Coupe du Monde le plus de fois?", listOf("France", "Italie", "Allemagne", "Brésil"), "Sport", "Le Brésil détient le record avec cinq titres mondiaux (1958, 1962, 1970, 1994, 2002), ce qui en fait la sélection la plus titrée de l'histoire de la Coupe du Monde de football."),
            en = LocalizedContent("Which football team has won the World Cup the most times?", listOf("France", "Italy", "Germany", "Brazil"), "Sports", "Brazil holds the record with five world titles (1958, 1962, 1970, 1994, 2002), making it the most successful team in World Cup history."),
            zh = LocalizedContent("哪支足球队赢得世界杯次数最多？", listOf("法国", "意大利", "德国", "巴西"), "体育", "巴西队以五次夺冠（1958、1962、1970、1994、2002）保持纪录，是世界杯历史上最成功的球队。"),
            es = LocalizedContent("¿Qué equipo de fútbol ha ganado la Copa del Mundo más veces?", listOf("Francia", "Italia", "Alemania", "Brasil"), "Deportes", "Brasil ostenta el récord con cinco títulos mundiales (1958, 1962, 1970, 1994, 2002), lo que lo convierte en la selección más exitosa en la historia de la Copa del Mundo.")
        ),
        BilingualQuestion(
            id = 50314, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a créé 'Blade Runner'?", listOf("Steven Spielberg", "Ridley Scott", "James Cameron", "David Cronenberg"), "Cinéma", "Ridley Scott a réalisé 'Blade Runner' en 1982, adapté du roman de Philip K. Dick, marquant un jalon du cinéma de science-fiction."),
            en = LocalizedContent("Which director created 'Blade Runner'?", listOf("Steven Spielberg", "Ridley Scott", "James Cameron", "David Cronenberg"), "Cinema", "Ridley Scott directed 'Blade Runner' in 1982, adapted from Philip K. Dick's novel, marking a milestone in science fiction cinema."),
            zh = LocalizedContent("哪位导演创作了《银翼杀手》？", listOf("史蒂文·斯皮尔伯格", "雷德利·斯科特", "詹姆斯·卡梅隆", "大卫·柯南伯格"), "电影", "雷德利·斯科特于1982年执导了《银翼杀手》，改编自菲利普·K·迪克的小说，成为科幻电影史上的里程碑。"),
            es = LocalizedContent("¿Qué director creó 'Blade Runner'?", listOf("Steven Spielberg", "Ridley Scott", "James Cameron", "David Cronenberg"), "Cine", "Ridley Scott dirigió 'Blade Runner' en 1982, adaptada de la novela de Philip K. Dick, marcando un hito en el cine de ciencia ficción.")
        ),
        BilingualQuestion(
            id = 50315, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien genre musical du monde?", listOf("Jazz", "Blues", "Folk", "Classique"), "Musique", "Le folk est considéré comme le plus ancien genre musical car il désigne la musique traditionnelle transmise oralement depuis la préhistoire, avant l'apparition des genres écrits ou enregistrés."),
            en = LocalizedContent("What is the oldest musical genre in the world?", listOf("Jazz", "Blues", "Folk", "Classical"), "Music", "Folk is considered the oldest musical genre as it refers to traditional music transmitted orally since prehistoric times, before written or recorded genres appeared."),
            zh = LocalizedContent("世界上最古老的音乐类型是什么？", listOf("爵士", "蓝调", "民谣", "古典"), "音乐", "民谣被认为是最古老的音乐类型，因为它指代自史前时期以来口头传播的传统音乐，早于书面或录制音乐的出现。"),
            es = LocalizedContent("¿Cuál es el género musical más antiguo del mundo?", listOf("Jazz", "Blues", "Folk", "Clásica"), "Música", "El folk se considera el género musical más antiguo, ya que se refiere a la música tradicional transmitida oralmente desde la prehistoria, antes de la aparición de géneros escritos o grabados.")
        ),
        BilingualQuestion(
            id = 50316, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien parlement du monde?", listOf("Althing d'Islande", "Parlement anglais", "Assemblée de Corfou", "Diète du Saint-Empire"), "Histoire", "L'Althing islandais, fondé en 930 à Thingvellir, est considéré comme le plus ancien parlement encore existant."),
            en = LocalizedContent("What is the oldest parliament in the world?", listOf("Althing of Iceland", "English Parliament", "Assembly of Corfu", "Diet of the Holy Roman Empire"), "History", "The Icelandic Althing, founded in 930 at Thingvellir, is considered the oldest existing parliament."),
            zh = LocalizedContent("世界上最古老的议会是什么？", listOf("冰岛阿尔庭", "英国议会", "科孚议会", "神圣罗马帝国议会"), "历史", "冰岛阿尔庭成立于930年，在辛格维利尔召开，被认为是现存最古老的议会。"),
            es = LocalizedContent("¿Cuál es el parlamento más antiguo del mundo?", listOf("Althing de Islandia", "Parlamento inglés", "Asamblea de Corfú", "Dieta del Sacro Imperio Romano Germánico"), "Historia", "El Althing islandés, fundado en 930 en Thingvellir, es considerado el parlamento existente más antiguo.")
        ),
        BilingualQuestion(
            id = 50317, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand animal qui ait jamais vécu?", listOf("Diplodocus", "Bruhathkayosaurus", "Baleine bleue", "Tyrannosaure"), "Science", "La baleine bleue détient le record de l'animal le plus lourd et le plus long jamais enregistré, pouvant atteindre 30 mètres et 200 tonnes."),
            en = LocalizedContent("What is the largest animal that has ever lived?", listOf("Diplodocus", "Bruhathkayosaurus", "Blue whale", "Tyrannosaurus"), "Science", "The blue whale holds the record for the heaviest and longest animal ever recorded, reaching up to 30 meters and 200 tons."),
            zh = LocalizedContent("有史以来最大的动物是什么？", listOf("梁龙", "巨体龙", "蓝鲸", "霸王龙"), "科学", "蓝鲸保持着有史以来最重和最长的动物纪录，体长可达30米，体重可达200吨。"),
            es = LocalizedContent("¿Cuál es el animal más grande que jamás haya existido?", listOf("Diplodocus", "Bruhathkayosaurus", "Ballena azul", "Tiranosaurio"), "Ciencia", "La ballena azul ostenta el récord del animal más pesado y más largo jamás registrado, pudiendo alcanzar 30 metros y 200 toneladas.")
        ),
        BilingualQuestion(
            id = 50318, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de fuseaux horaires?", listOf("Russie", "France", "Australie", "Canada"), "Géographie", "La France possède le plus de fuseaux horaires au monde grâce à ses territoires d'outre-mer répartis sur tous les océans, totalisant 12 fuseaux (incluant la revendication en Antarctique)."),
            en = LocalizedContent("Which country has the most time zones?", listOf("Russia", "France", "Australia", "Canada"), "Geography", "France has the most time zones in the world thanks to its overseas territories spread across all oceans, totaling 12 time zones (including the claim in Antarctica)."),
            zh = LocalizedContent("哪个国家拥有最多时区？", listOf("俄罗斯", "法国", "澳大利亚", "加拿大"), "地理", "法国因其海外领土遍布各大洋，拥有世界上最多的时区，共计12个（包括南极洲的宣称）。"),
            es = LocalizedContent("¿Qué país tiene más husos horarios?", listOf("Rusia", "Francia", "Australia", "Canadá"), "Geografía", "Francia posee la mayor cantidad de husos horarios del mundo gracias a sus territorios de ultramar repartidos por todos los océanos, totalizando 12 husos (incluyendo la reclamación en la Antártida).")
        ),
        BilingualQuestion(
            id = 50319, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien système de poids et mesures?", listOf("Système égyptien", "Système romain", "Système babylonien", "Système hindou"), "Culture", "Le système babylonien, développé en Mésopotamie vers 2000 av. J.-C., est considéré comme le plus ancien système de poids et mesures connu. Il utilisait des unités comme le shekel et le talent."),
            en = LocalizedContent("What is the oldest system of weights and measures?", listOf("Egyptian system", "Roman system", "Babylonian system", "Hindu system"), "Culture", "The Babylonian system, developed in Mesopotamia around 2000 BC, is considered the oldest known system of weights and measures. It used units such as the shekel and the talent."),
            zh = LocalizedContent("最古老的度量衡系统是什么？", listOf("埃及系统", "罗马系统", "巴比伦系统", "印度系统"), "文化", "巴比伦系统于公元前2000年左右在美索不达米亚发展起来，被认为是已知最古老的度量衡系统，使用谢克尔和塔兰特等单位。"),
            es = LocalizedContent("¿Cuál es el sistema de pesos y medidas más antiguo?", listOf("Sistema egipcio", "Sistema romano", "Sistema babilónico", "Sistema hindú"), "Cultura", "El sistema babilónico, desarrollado en Mesopotamia hacia el 2000 a.C., es considerado el sistema de pesos y medidas más antiguo conocido. Utilizaba unidades como el siclo y el talento.")
        ),
        BilingualQuestion(
            id = 50320, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel coureur de marathon a remporté le plus de titres?", listOf("Haile Gebrselassie", "Moses Kiptanui", "Mirna Valerio", "Eliud Kipchoge"), "Sport", "Eliud Kipchoge a remporté les Jeux olympiques de 2016 et 2020, ainsi que quatre marathons de Londres et quatre de Berlin, ce qui fait de lui le marathonien le plus titré de l'histoire."),
            en = LocalizedContent("Which marathon runner has won the most titles?", listOf("Haile Gebrselassie", "Moses Kiptanui", "Mirna Valerio", "Eliud Kipchoge"), "Sports", "Eliud Kipchoge has won the 2016 and 2020 Olympics, as well as four London Marathons and four Berlin Marathons, making him the most decorated marathon runner in history."),
            zh = LocalizedContent("哪位马拉松运动员赢得冠军最多？", listOf("海勒·格布雷西拉西耶", "摩西·基普塔努伊", "米尔娜·瓦莱里奥", "埃利乌德·基普乔格"), "体育", "埃利乌德·基普乔格赢得了2016年和2020年奥运会，以及四次伦敦马拉松和四次柏林马拉松，成为历史上获得荣誉最多的马拉松运动员。"),
            es = LocalizedContent("¿Qué corredor de maratón ha ganado más títulos?", listOf("Haile Gebrselassie", "Moses Kiptanui", "Mirna Valerio", "Eliud Kipchoge"), "Deportes", "Eliud Kipchoge ha ganado los Juegos Olímpicos de 2016 y 2020, así como cuatro maratones de Londres y cuatro de Berlín, lo que lo convierte en el maratonista más laureado de la historia.")
        ),
        BilingualQuestion(
            id = 50321, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film de comédie a remporté l'Oscar du meilleur film?", listOf("Singin' in the Rain", "Some Like It Hot", "The Artist", "It Happened One Night"), "Cinéma", "It Happened One Night (1934) fut le premier film de comédie à remporter l'Oscar du meilleur film, réalisant un rare grand chelem en remportant les cinq Oscars majeurs."),
            en = LocalizedContent("Which comedy film won the Oscar for Best Picture?", listOf("Singin' in the Rain", "Some Like It Hot", "The Artist", "It Happened One Night"), "Cinema", "It Happened One Night (1934) was the first comedy film to win the Oscar for Best Picture, achieving a rare grand slam by winning all five major Oscars."),
            zh = LocalizedContent("哪部喜剧电影获得了奥斯卡最佳影片奖？", listOf("《雨中曲》", "《热情似火》", "《艺术家》", "《一夜风流》"), "电影", "《一夜风流》（1934年）是第一部获得奥斯卡最佳影片奖的喜剧电影，并罕见地包揽了五项主要奥斯卡奖。"),
            es = LocalizedContent("¿Qué película de comedia ganó el Oscar a la Mejor Película?", listOf("Cantando bajo la lluvia", "Con faldas y a lo loco", "The Artist", "Sucedió una noche"), "Cine", "Sucedió una noche (1934) fue la primera película de comedia en ganar el Oscar a la Mejor Película, logrando un raro gran slam al ganar los cinco Oscar principales.")
        ),
        BilingualQuestion(
            id = 50322, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel musicien a joué du saxophone dans le jazz?", listOf("Miles Davis", "John Coltrane", "Ornette Coleman", "Tous les ci-dessus"), "Musique", "Le saxophone est un instrument emblématique du jazz, utilisé par de nombreux musiciens célèbres comme Charlie Parker, John Coltrane ou Sonny Rollins, ce qui rend la réponse \"Tous les ci-dessus\" valide si la question liste plusieurs noms."),
            en = LocalizedContent("Which musician played the saxophone in jazz?", listOf("Miles Davis", "John Coltrane", "Ornette Coleman", "All of the above"), "Music", "The saxophone is an iconic instrument in jazz, used by many famous musicians such as Charlie Parker, John Coltrane, or Sonny Rollins, making the answer \"All of the above\" valid if the question lists several names."),
            zh = LocalizedContent("哪位音乐家在爵士乐中演奏萨克斯管？", listOf("迈尔斯·戴维斯", "约翰·柯川", "奥内特·科尔曼", "以上都是"), "音乐", "萨克斯管是爵士乐中标志性的乐器，被许多著名音乐家如查理·帕克、约翰·柯川或桑尼·罗林斯使用，因此如果问题列出多个名字，答案“以上都是”是有效的。"),
            es = LocalizedContent("¿Qué músico tocó el saxofón en el jazz?", listOf("Miles Davis", "John Coltrane", "Ornette Coleman", "Todos los anteriores"), "Musica", "El saxofón es un instrumento emblemático del jazz, utilizado por muchos músicos famosos como Charlie Parker, John Coltrane o Sonny Rollins, lo que hace que la respuesta \"Todos los anteriores\" sea válida si la pregunta enumera varios nombres.")
        ),
        BilingualQuestion(
            id = 50323, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien empire de la Mésopotamie?", listOf("Empire akkadien", "Empire babylonien", "Empire assyrien", "Empire sumérien"), "Histoire", "Les Sumériens ont établi les premières cités-États en Mésopotamie vers 3500 av. J.-C., formant ainsi le plus ancien empire connu de cette région."),
            en = LocalizedContent("What is the oldest empire in Mesopotamia?", listOf("Akkadian Empire", "Babylonian Empire", "Assyrian Empire", "Sumerian Empire"), "History", "The Sumerians established the first city-states in Mesopotamia around 3500 BC, thus forming the oldest known empire in this region."),
            zh = LocalizedContent("美索不达米亚最古老的帝国是哪个？", listOf("阿卡德帝国", "巴比伦帝国", "亚述帝国", "苏美尔帝国"), "历史", "苏美尔人在公元前3500年左右建立了美索不达米亚最早的城邦，从而形成了该地区已知最古老的帝国。"),
            es = LocalizedContent("¿Cuál es el imperio más antiguo de Mesopotamia?", listOf("Imperio acadio", "Imperio babilónico", "Imperio asirio", "Imperio sumerio"), "Historia", "Los sumerios establecieron las primeras ciudades-estado en Mesopotamia alrededor del 3500 a.C., formando así el imperio más antiguo conocido de esta región.")
        ),
        BilingualQuestion(
            id = 50324, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac d'eau douce du monde?", listOf("Lac Supérieur", "Lac Baïkal", "Lac Malawi", "Lac Tanganyika"), "Science", "Le lac Supérieur est le plus grand lac d'eau douce du monde par sa superficie, avec environ 82 100 km², situé en Amérique du Nord entre les États-Unis et le Canada."),
            en = LocalizedContent("What is the largest freshwater lake in the world?", listOf("Lake Superior", "Lake Baikal", "Lake Malawi", "Lake Tanganyika"), "Science", "Lake Superior is the largest freshwater lake in the world by surface area, with about 82,100 km², located in North America between the United States and Canada."),
            zh = LocalizedContent("世界上最大的淡水湖是哪个？", listOf("苏必利尔湖", "贝加尔湖", "马拉维湖", "坦噶尼喀湖"), "科学", "苏必利尔湖是世界上面积最大的淡水湖，面积约82,100平方公里，位于北美洲的美国与加拿大之间。"),
            es = LocalizedContent("¿Cuál es el lago de agua dulce más grande del mundo?", listOf("Lago Superior", "Lago Baikal", "Lago Malawi", "Lago Tanganyika"), "Ciencia", "El lago Superior es el lago de agua dulce más grande del mundo por superficie, con aproximadamente 82,100 km², ubicado en América del Norte entre Estados Unidos y Canadá.")
        ),
        BilingualQuestion(
            id = 50325, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de lacs salés?", listOf("Canada", "Chine", "Russe", "États-Unis"), "Géographie", "Les États-Unis possèdent le plus grand nombre de lacs salés au monde, notamment dans le Grand Bassin, avec des exemples comme le Grand Lac Salé dans l'Utah."),
            en = LocalizedContent("Which country has the most salt lakes?", listOf("Canada", "China", "Russia", "United States"), "Geography", "The United States has the largest number of salt lakes in the world, especially in the Great Basin, with examples like the Great Salt Lake in Utah."),
            zh = LocalizedContent("哪个国家的盐湖最多？", listOf("加拿大", "中国", "俄罗斯", "美国"), "地理", "美国拥有世界上最多的盐湖，特别是在大盆地地区，例如犹他州的大盐湖。"),
            es = LocalizedContent("¿Qué país tiene más lagos salados?", listOf("Canadá", "China", "Rusia", "Estados Unidos"), "Geografia", "Estados Unidos posee la mayor cantidad de lagos salados del mundo, especialmente en la Gran Cuenca, con ejemplos como el Gran Lago Salado en Utah.")
        ),
        BilingualQuestion(
            id = 50326, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus ancien système d'écriture du monde?", listOf("Écriture égyptienne", "Écriture cunéiforme", "Écriture indienne", "Écriture chinoise"), "Culture", "L'écriture cunéiforme est apparue en Mésopotamie vers 3400 avant J.-C., gravée sur des tablettes d'argile par les Sumériens."),
            en = LocalizedContent("What is the oldest writing system in the world?", listOf("Egyptian writing", "Cuneiform", "Indian writing", "Chinese writing"), "Culture", "Cuneiform writing appeared in Mesopotamia around 3400 BC, inscribed on clay tablets by the Sumerians."),
            zh = LocalizedContent("世界上最古老的文字系统是什么？", listOf("埃及文字", "楔形文字", "印度文字", "中国文字"), "文化", "楔形文字出现在公元前3400年左右的美索不达米亚，由苏美尔人刻在泥板上。"),
            es = LocalizedContent("¿Cuál es el sistema de escritura más antiguo del mundo?", listOf("Escritura egipcia", "Escritura cuneiforme", "Escritura india", "Escritura china"), "Cultura", "La escritura cuneiforme apareció en Mesopotamia alrededor del 3400 a.C., grabada en tablillas de arcilla por los sumerios.")
        ),
        BilingualQuestion(
            id = 50327, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel lutteur a remporté le plus de titres WWE?", listOf("John Cena", "The Rock", "The Undertaker", "Triple H"), "Sport", "The Undertaker détient le record de 21 victoires consécutives à WrestleMania, le plus grand événement de la WWE, ce qui fait de lui le lutteur le plus titré de l'histoire de la fédération."),
            en = LocalizedContent("Which wrestler has won the most WWE titles?", listOf("John Cena", "The Rock", "The Undertaker", "Triple H"), "Sports", "The Undertaker holds the record of 21 consecutive victories at WrestleMania, the biggest WWE event, making him the most decorated wrestler in the federation's history."),
            zh = LocalizedContent("哪位摔跤手赢得了最多的WWE冠军头衔？", listOf("约翰·塞纳", "巨石强森", "送葬者", "Triple H"), "体育", "送葬者在WWE最大的赛事摔跤狂热大赛中保持了21连胜的纪录，这使他成为该联合会历史上最成功的摔跤手。"),
            es = LocalizedContent("¿Qué luchador ha ganado más títulos de la WWE?", listOf("John Cena", "The Rock", "The Undertaker", "Triple H"), "Deportes", "The Undertaker tiene el récord de 21 victorias consecutivas en WrestleMania, el evento más grande de la WWE, lo que lo convierte en el luchador más condecorado en la historia de la federación.")
        ),
        BilingualQuestion(
            id = 50328, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a créé 'Titanic'?", listOf("James Cameron", "Michael Bay", "Christopher Nolan", "Steven Spielberg"), "Cinéma", "James Cameron a écrit, réalisé et coproduit Titanic (1997), un drame romantique et catastrophe qui a remporté onze Oscars."),
            en = LocalizedContent("Which director created 'Titanic'?", listOf("James Cameron", "Michael Bay", "Christopher Nolan", "Steven Spielberg"), "Cinema", "James Cameron wrote, directed, and co-produced Titanic (1997), a romantic disaster drama that won eleven Oscars."),
            zh = LocalizedContent("哪位导演创作了《泰坦尼克号》？", listOf("詹姆斯·卡梅隆", "迈克尔·贝", "克里斯托弗·诺兰", "史蒂文·斯皮尔伯格"), "电影", "詹姆斯·卡梅隆编剧、导演并联合制作了《泰坦尼克号》（1997年），这部浪漫灾难片获得了十一项奥斯卡奖。"),
            es = LocalizedContent("¿Qué director creó 'Titanic'?", listOf("James Cameron", "Michael Bay", "Christopher Nolan", "Steven Spielberg"), "Cine", "James Cameron escribió, dirigió y coprodujo Titanic (1997), un drama romántico de catástrofes que ganó once premios Oscar.")
        ),
        BilingualQuestion(
            id = 50329, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien instrument de musique connu?", listOf("Flûte", "Lyre", "Harpe", "Cor"), "Musique", "La flûte est considérée comme le plus ancien instrument de musique connu, avec des spécimens en os et en ivoire datant d'environ 40 000 ans découverts dans la région du Jura souabe en Allemagne."),
            en = LocalizedContent("What is the oldest known musical instrument?", listOf("Flute", "Lyre", "Harp", "Horn"), "Music", "The flute is considered the oldest known musical instrument, with bone and ivory specimens dating back about 40,000 years discovered in the Swabian Jura region of Germany."),
            zh = LocalizedContent("已知最古老的乐器是什么？", listOf("笛子", "里拉琴", "竖琴", "号角"), "音乐", "笛子被认为是最古老的已知乐器，在德国施瓦本汝拉地区发现了约4万年前的骨制和象牙制笛子。"),
            es = LocalizedContent("¿Cuál es el instrumento musical más antiguo conocido?", listOf("Flauta", "Lira", "Arpa", "Cuerno"), "Musica", "La flauta es considerada el instrumento musical más antiguo conocido, con especímenes de hueso y marfil que datan de hace unos 40,000 años descubiertos en la región del Jura de Suabia en Alemania.")
        ),
        BilingualQuestion(
            id = 50330, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'année du début de la Grande Dépression?", listOf("1927", "1928", "1929", "1930"), "Histoire", "Le krach boursier de Wall Street en octobre 1929 est généralement considéré comme le déclencheur de la Grande Dépression, une crise économique mondiale qui a duré jusqu'à la fin des années 1930."),
            en = LocalizedContent("What year did the Great Depression begin?", listOf("1927", "1928", "1929", "1930"), "History", "The Wall Street stock market crash in October 1929 is generally considered the trigger of the Great Depression, a global economic crisis that lasted until the late 1930s."),
            zh = LocalizedContent("大萧条始于哪一年？", listOf("1927年", "1928年", "1929年", "1930年"), "历史", "1929年10月的华尔街股市崩盘通常被认为是大萧条的导火索，这是一场持续到1930年代末的全球经济危机。"),
            es = LocalizedContent("¿En qué año comenzó la Gran Depresión?", listOf("1927", "1928", "1929", "1930"), "Historia", "El colapso de la bolsa de Wall Street en octubre de 1929 se considera generalmente el desencadenante de la Gran Depresión, una crisis económica mundial que duró hasta finales de la década de 1930.")
        ),
        BilingualQuestion(
            id = 50331, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus petit virus connu?", listOf("Virus du rhume", "Virus de la polio", "Virus du norovirus", "Parvovirus"), "Science", "Le parvovirus est considéré comme le plus petit virus connu, avec un diamètre d'environ 18 à 26 nanomètres, soit bien plus petit que la plupart des autres virus."),
            en = LocalizedContent("What is the smallest known virus?", listOf("Common cold virus", "Polio virus", "Norovirus", "Parvovirus"), "Science", "Parvovirus is considered the smallest known virus, with a diameter of about 18 to 26 nanometers, much smaller than most other viruses."),
            zh = LocalizedContent("已知最小的病毒是什么？", listOf("感冒病毒", "脊髓灰质炎病毒", "诺如病毒", "细小病毒"), "科学", "细小病毒被认为是已知最小的病毒，直径约18至26纳米，比大多数其他病毒小得多。"),
            es = LocalizedContent("¿Cuál es el virus más pequeño conocido?", listOf("Virus del resfriado común", "Virus de la polio", "Norovirus", "Parvovirus"), "Ciencia", "El parvovirus es considerado el virus más pequeño conocido, con un diámetro de aproximadamente 18 a 26 nanómetros, mucho más pequeño que la mayoría de los otros virus.")
        ),
        BilingualQuestion(
            id = 50332, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand désert du monde?", listOf("Sahara", "Arabie", "Kalahari", "Antarctique"), "Géographie", "L'Antarctique est considéré comme le plus grand désert du monde car il reçoit très peu de précipitations, moins de 50 mm par an, ce qui correspond à la définition d'un désert."),
            en = LocalizedContent("What is the largest desert in the world?", listOf("Sahara", "Arabian", "Kalahari", "Antarctic"), "Geography", "Antarctica is considered the largest desert in the world because it receives very little precipitation, less than 50 mm per year, which fits the definition of a desert."),
            zh = LocalizedContent("世界上最大的沙漠是什么？", listOf("撒哈拉", "阿拉伯", "卡拉哈里", "南极"), "地理", "南极洲被认为是世界上最大的沙漠，因为它降水量极少，每年不到50毫米，符合沙漠的定义。"),
            es = LocalizedContent("¿Cuál es el desierto más grande del mundo?", listOf("Sahara", "Arábigo", "Kalahari", "Antártico"), "Geografía", "La Antártida es considerada el desierto más grande del mundo porque recibe muy poca precipitación, menos de 50 mm al año, lo que cumple con la definición de desierto.")
        ),
        BilingualQuestion(
            id = 50333, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien jeu olympique?", listOf("Athlétisme", "Lutte", "Boxe", "Hippisme"), "Culture", "L'athlétisme est considéré comme le plus ancien jeu olympique car il était présent dès les premiers Jeux olympiques antiques en 776 avant J.-C., avec notamment la course à pied."),
            en = LocalizedContent("What is the oldest Olympic sport?", listOf("Athletics", "Wrestling", "Boxing", "Equestrian"), "Culture", "Athletics is considered the oldest Olympic sport because it was present from the first ancient Olympic Games in 776 BC, notably including foot races."),
            zh = LocalizedContent("最古老的奥运项目是什么？", listOf("田径", "摔跤", "拳击", "马术"), "文化", "田径被认为是最古老的奥运项目，因为它从公元前776年的第一届古代奥运会就已存在，尤其是跑步项目。"),
            es = LocalizedContent("¿Cuál es el deporte olímpico más antiguo?", listOf("Atletismo", "Lucha", "Boxeo", "Hípica"), "Cultura", "El atletismo es considerado el deporte olímpico más antiguo porque estuvo presente desde los primeros Juegos Olímpicos antiguos en el 776 a.C., incluyendo carreras a pie.")
        ),
        BilingualQuestion(
            id = 50334, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel coureur a remporté le plus de marathons majeurs?", listOf("Eliud Kipchoge", "Dennis Kimetto", "Mary Keitany", "Edna Kiplagat"), "Sport", "Eliud Kipchoge a remporté 11 des 18 marathons majeurs auxquels il a participé, incluant quatre victoires à Londres et à Berlin, ce qui en fait le coureur le plus titré de l'histoire de ces courses prestigieuses."),
            en = LocalizedContent("Which runner has won the most major marathons?", listOf("Eliud Kipchoge", "Dennis Kimetto", "Mary Keitany", "Edna Kiplagat"), "Sports", "Eliud Kipchoge has won 11 of the 18 major marathons he has participated in, including four victories in London and Berlin, making him the most decorated runner in the history of these prestigious races."),
            zh = LocalizedContent("哪位跑者赢得了最多的大满贯马拉松？", listOf("埃利乌德·基普乔格", "丹尼斯·基梅托", "玛丽·凯塔尼", "埃德娜·基普拉加特"), "体育", "埃利乌德·基普乔格在参加的18场大满贯马拉松中赢得了11场，包括在伦敦和柏林的四次胜利，使他成为这些著名赛事历史上获奖最多的跑者。"),
            es = LocalizedContent("¿Qué corredor ha ganado más maratones importantes?", listOf("Eliud Kipchoge", "Dennis Kimetto", "Mary Keitany", "Edna Kiplagat"), "Deportes", "Eliud Kipchoge ha ganado 11 de los 18 maratones importantes en los que ha participado, incluyendo cuatro victorias en Londres y Berlín, lo que lo convierte en el corredor más laureado en la historia de estas prestigiosas carreras.")
        ),
        BilingualQuestion(
            id = 50335, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a créé '2001: A Space Odyssey'?", listOf("Ridley Scott", "Stanley Kubrick", "James Cameron", "Denis Villeneuve"), "Cinéma", "Stanley Kubrick a réalisé et coécrit ce film de science-fiction emblématique sorti en 1968, adapté d'une nouvelle d'Arthur C. Clarke."),
            en = LocalizedContent("Which director created '2001: A Space Odyssey'?", listOf("Ridley Scott", "Stanley Kubrick", "James Cameron", "Denis Villeneuve"), "Cinema", "Stanley Kubrick directed and co-wrote this iconic science fiction film released in 1968, adapted from a short story by Arthur C. Clarke."),
            zh = LocalizedContent("哪位导演创作了《2001太空漫游》？", listOf("雷德利·斯科特", "斯坦利·库布里克", "詹姆斯·卡梅隆", "丹尼斯·维伦纽瓦"), "电影", "斯坦利·库布里克执导并联合编剧了这部1968年上映的标志性科幻电影，改编自阿瑟·C·克拉克的短篇小说。"),
            es = LocalizedContent("¿Qué director creó '2001: Una odisea del espacio'?", listOf("Ridley Scott", "Stanley Kubrick", "James Cameron", "Denis Villeneuve"), "Cine", "Stanley Kubrick dirigió y coescribió esta icónica película de ciencia ficción estrenada en 1968, adaptada de un cuento de Arthur C. Clarke.")
        ),
        BilingualQuestion(
            id = 50336, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel chanteur a écrit la plupart de ses chansons?", listOf("Bob Dylan", "John Lennon", "Paul McCartney", "Tous les ci-dessus"), "Musique", "La question est piège car tous les chanteurs proposés ont écrit la plupart de leurs chansons, ce qui est le cas de nombreux artistes comme Bob Dylan, Leonard Cohen ou Serge Gainsbourg."),
            en = LocalizedContent("Which singer wrote most of their songs?", listOf("Bob Dylan", "John Lennon", "Paul McCartney", "All of the above"), "Music", "The question is a trick because all the proposed singers wrote most of their songs, which is the case for many artists like Bob Dylan, Leonard Cohen, or Serge Gainsbourg."),
            zh = LocalizedContent("哪位歌手创作了大部分自己的歌曲？", listOf("鲍勃·迪伦", "约翰·列侬", "保罗·麦卡特尼", "以上都是"), "音乐", "这个问题是个陷阱，因为所有提到的歌手都创作了大部分自己的歌曲，许多艺术家如鲍勃·迪伦、伦纳德·科恩或塞尔日·甘斯布也是如此。"),
            es = LocalizedContent("¿Qué cantante escribió la mayoría de sus canciones?", listOf("Bob Dylan", "John Lennon", "Paul McCartney", "Todos los anteriores"), "Música", "La pregunta es una trampa porque todos los cantantes propuestos escribieron la mayoría de sus canciones, como es el caso de muchos artistas como Bob Dylan, Leonard Cohen o Serge Gainsbourg.")
        ),
        BilingualQuestion(
            id = 50337, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'année du tremblement de terre de San Francisco?", listOf("1904", "1905", "1906", "1907"), "Histoire", "Le tremblement de terre de San Francisco a eu lieu le 18 avril 1906, causant des destructions massives et un incendie dévastateur dans la ville."),
            en = LocalizedContent("What year was the San Francisco earthquake?", listOf("1904", "1905", "1906", "1907"), "History", "The San Francisco earthquake occurred on April 18, 1906, causing massive destruction and a devastating fire in the city."),
            zh = LocalizedContent("旧金山大地震发生在哪一年？", listOf("1904", "1905", "1906", "1907"), "历史", "旧金山大地震发生在1906年4月18日，造成了巨大的破坏和一场毁灭性的大火。"),
            es = LocalizedContent("¿En qué año fue el terremoto de San Francisco?", listOf("1904", "1905", "1906", "1907"), "Historia", "El terremoto de San Francisco ocurrió el 18 de abril de 1906, causando una destrucción masiva y un incendio devastador en la ciudad.")
        ),
        BilingualQuestion(
            id = 50338, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus dense matériau connu?", listOf("Or", "Plutonium", "Osmium", "Uranium"), "Science", "L'osmium est le matériau le plus dense connu, avec une densité d'environ 22,59 g/cm³, dépassant légèrement l'iridium."),
            en = LocalizedContent("What is the densest known material?", listOf("Gold", "Plutonium", "Osmium", "Uranium"), "Science", "Osmium is the densest known material, with a density of about 22.59 g/cm³, slightly exceeding iridium."),
            zh = LocalizedContent("已知密度最大的材料是什么？", listOf("金", "钚", "锇", "铀"), "科学", "锇是已知密度最大的材料，密度约为22.59克/立方厘米，略高于铱。"),
            es = LocalizedContent("¿Cuál es el material más denso conocido?", listOf("Oro", "Plutonio", "Osmio", "Uranio"), "Ciencia", "El osmio es el material más denso conocido, con una densidad de aproximadamente 22.59 g/cm³, superando ligeramente al iridio.")
        ),
        BilingualQuestion(
            id = 50339, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand golfe du monde?", listOf("Golfe du Mexique", "Golfe de Bengale", "Golfe de Guinée", "Golfe du Pérou"), "Géographie", "Le golfe de Bengale, situé entre l'Inde et le Myanmar, est le plus grand golfe du monde avec une superficie d'environ 2,2 millions de km²."),
            en = LocalizedContent("What is the largest gulf in the world?", listOf("Gulf of Mexico", "Bay of Bengal", "Gulf of Guinea", "Gulf of Peru"), "Geography", "The Bay of Bengal, located between India and Myanmar, is the largest gulf in the world with an area of about 2.2 million km²."),
            zh = LocalizedContent("世界上最大的海湾是什么？", listOf("墨西哥湾", "孟加拉湾", "几内亚湾", "秘鲁湾"), "地理", "孟加拉湾位于印度和缅甸之间，是世界上最大的海湾，面积约220万平方公里。"),
            es = LocalizedContent("¿Cuál es el golfo más grande del mundo?", listOf("Golfo de México", "Golfo de Bengala", "Golfo de Guinea", "Golfo de Perú"), "Geografía", "El golfo de Bengala, situado entre India y Myanmar, es el golfo más grande del mundo con una superficie de aproximadamente 2.2 millones de km².")
        ),
        BilingualQuestion(
            id = 50340, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien roman du monde?", listOf("Le Conte de Genji", "Les Mille et Une Nuits", "L'Épopée de Gilgamesh", "L'Odyssée"), "Culture", "L'Épopée de Gilgamesh, écrite en sumérien sur des tablettes d'argile, date d'environ 2100 avant J.-C., ce qui en fait le plus ancien récit littéraire connu."),
            en = LocalizedContent("What is the oldest novel in the world?", listOf("The Tale of Genji", "One Thousand and One Nights", "The Epic of Gilgamesh", "The Odyssey"), "Culture", "The Epic of Gilgamesh, written in Sumerian on clay tablets, dates from around 2100 BC, making it the oldest known literary narrative."),
            zh = LocalizedContent("世界上最古老的小说是什么？", listOf("《源氏物语》", "《一千零一夜》", "《吉尔伽美什史诗》", "《奥德赛》"), "文化", "《吉尔伽美什史诗》用苏美尔语写在泥板上，可追溯到公元前2100年左右，是已知最古老的文学叙事作品。"),
            es = LocalizedContent("¿Cuál es la novela más antigua del mundo?", listOf("La historia de Genji", "Las mil y una noches", "La epopeya de Gilgamesh", "La Odisea"), "Cultura", "La epopeya de Gilgamesh, escrita en sumerio en tablillas de arcilla, data de alrededor del 2100 a.C., lo que la convierte en la narración literaria más antigua conocida.")
        ),
        BilingualQuestion(
            id = 50341, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel volleyeur a remporté le plus de titres mondiaux?", listOf("Giba", "Earvin Johnson", "Andrea Giani", "Sergey Tetyukhin"), "Sport", "Andrea Giani, joueur italien, détient le record avec quatre titres de champion du monde de volley-ball masculin (1990, 1994, 1998, 2002)."),
            en = LocalizedContent("Which volleyball player has won the most world titles?", listOf("Giba", "Earvin Johnson", "Andrea Giani", "Sergey Tetyukhin"), "Sports", "Andrea Giani, an Italian player, holds the record with four men's volleyball world championship titles (1990, 1994, 1998, 2002)."),
            zh = LocalizedContent("哪位排球运动员赢得了最多的世界冠军？", listOf("吉巴", "厄尔文·约翰逊", "安德烈亚·贾尼", "谢尔盖·特秋欣"), "体育", "意大利球员安德烈亚·贾尼保持着纪录，拥有四个男子排球世界冠军头衔（1990、1994、1998、2002）。"),
            es = LocalizedContent("¿Qué jugador de voleibol ha ganado más títulos mundiales?", listOf("Giba", "Earvin Johnson", "Andrea Giani", "Sergey Tetyukhin"), "Deportes", "Andrea Giani, jugador italiano, posee el récord con cuatro títulos de campeonato mundial de voleibol masculino (1990, 1994, 1998, 2002).")
        ),
        BilingualQuestion(
            id = 50342, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film a remporté l'Oscar du meilleur film en 2021?", listOf("Minari", "Sound of Metal", "Promising Young Woman", "Nomadland"), "Cinéma", "Nomadland, réalisé par Chloé Zhao, a remporté l'Oscar du meilleur film en 2021, devenant le premier film réalisé par une femme de couleur à gagner cette récompense."),
            en = LocalizedContent("Which film won the Academy Award for Best Picture in 2021?", listOf("Minari", "Sound of Metal", "Promising Young Woman", "Nomadland"), "Cinema", "Nomadland, directed by Chloé Zhao, won the Academy Award for Best Picture in 2021, becoming the first film directed by a woman of color to win this award."),
            zh = LocalizedContent("哪部电影在2021年获得了奥斯卡最佳影片奖？", listOf("米纳里", "金属之声", "前程似锦的女孩", "无依之地"), "电影", "由赵婷执导的《无依之地》在2021年获得了奥斯卡最佳影片奖，成为第一部由有色人种女性导演获得该奖项的电影。"),
            es = LocalizedContent("¿Qué película ganó el Óscar a la mejor película en 2021?", listOf("Minari", "Sound of Metal", "Promising Young Woman", "Nomadland"), "Cine", "Nomadland, dirigida por Chloé Zhao, ganó el Óscar a la mejor película en 2021, convirtiéndose en la primera película dirigida por una mujer de color en ganar este premio.")
        ),
        BilingualQuestion(
            id = 50343, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel compositeur a écrit 'The Magic Flute'?", listOf("Rossini", "Mozart", "Beethoven", "Verdi"), "Musique", "Mozart a composé 'La Flûte enchantée' (The Magic Flute) en 1791, un opéra en allemand mêlant conte et symbolisme maçonnique."),
            en = LocalizedContent("Which composer wrote 'The Magic Flute'?", listOf("Rossini", "Mozart", "Beethoven", "Verdi"), "Music", "Mozart composed 'The Magic Flute' in 1791, a German-language opera blending fairy tale and Masonic symbolism."),
            zh = LocalizedContent("哪位作曲家创作了《魔笛》？", listOf("罗西尼", "莫扎特", "贝多芬", "威尔第"), "音乐", "莫扎特于1791年创作了《魔笛》，这是一部融合童话和共济会象征主义的德语歌剧。"),
            es = LocalizedContent("¿Qué compositor escribió 'La flauta mágica'?", listOf("Rossini", "Mozart", "Beethoven", "Verdi"), "Musica", "Mozart compuso 'La flauta mágica' en 1791, una ópera en alemán que combina cuento de hadas y simbolismo masónico.")
        ),
        BilingualQuestion(
            id = 50344, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'année de la fin de la Guerre de Cent Ans?", listOf("1452", "1453", "1454", "1455"), "Histoire", "La guerre de Cent Ans s'achève en 1453 avec la bataille de Castillon, qui voit la défaite définitive des Anglais et la reprise de Bordeaux par les Français."),
            en = LocalizedContent("What year did the Hundred Years' War end?", listOf("1452", "1453", "1454", "1455"), "History", "The Hundred Years' War ended in 1453 with the Battle of Castillon, which saw the final defeat of the English and the recapture of Bordeaux by the French."),
            zh = LocalizedContent("百年战争在哪一年结束？", listOf("1452", "1453", "1454", "1455"), "历史", "百年战争于1453年以卡斯蒂永战役结束，英军最终战败，法国收复波尔多。"),
            es = LocalizedContent("¿En qué año terminó la Guerra de los Cien Años?", listOf("1452", "1453", "1454", "1455"), "Historia", "La Guerra de los Cien Años terminó en 1453 con la batalla de Castillon, que vio la derrota definitiva de los ingleses y la recuperación de Burdeos por los franceses.")
        ),
        BilingualQuestion(
            id = 50345, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand prédateur terrestre?", listOf("Lion", "Ours blanc", "Guépard", "Léopard"), "Science", "L'ours blanc est le plus grand prédateur terrestre, les mâles pouvant peser jusqu'à 700 kg et mesurer 3 mètres de long. Il chasse principalement les phoques sur la banquise arctique."),
            en = LocalizedContent("What is the largest terrestrial predator?", listOf("Lion", "Polar bear", "Cheetah", "Leopard"), "Science", "The polar bear is the largest terrestrial predator, with males weighing up to 700 kg and measuring 3 meters in length. It primarily hunts seals on the Arctic ice."),
            zh = LocalizedContent("最大的陆地捕食者是什么？", listOf("狮子", "北极熊", "猎豹", "豹子"), "科学", "北极熊是最大的陆地捕食者，雄性体重可达700公斤，身长3米。它们主要在北极冰层上捕食海豹。"),
            es = LocalizedContent("¿Cuál es el mayor depredador terrestre?", listOf("León", "Oso polar", "Guepardo", "Leopardo"), "Ciencia", "El oso polar es el mayor depredador terrestre, los machos pueden pesar hasta 700 kg y medir 3 metros de largo. Caza principalmente focas en el hielo ártico.")
        ),
        BilingualQuestion(
            id = 50346, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand fleuve d'Europe?", listOf("Rhin", "Danube", "Loire", "Volga"), "Géographie", "La Volga est le plus long fleuve d'Europe avec ses 3 530 km, traversant la Russie et se jetant dans la mer Caspienne."),
            en = LocalizedContent("What is the longest river in Europe?", listOf("Rhine", "Danube", "Loire", "Volga"), "Geography", "The Volga is the longest river in Europe at 3,530 km, flowing through Russia and emptying into the Caspian Sea."),
            zh = LocalizedContent("欧洲最长的河流是什么？", listOf("莱茵河", "多瑙河", "卢瓦尔河", "伏尔加河"), "地理", "伏尔加河全长3530公里，是欧洲最长的河流，流经俄罗斯并注入里海。"),
            es = LocalizedContent("¿Cuál es el río más largo de Europa?", listOf("Rin", "Danubio", "Loira", "Volga"), "Geografia", "El Volga es el río más largo de Europa con 3.530 km, atraviesa Rusia y desemboca en el mar Caspio.")
        ),
        BilingualQuestion(
            id = 50347, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien style architectural du monde?", listOf("Gothique", "Renaissance", "Égyptien", "Romain"), "Culture", "L'architecture égyptienne, avec ses pyramides et temples monumentaux, est considérée comme la plus ancienne car elle remonte à environ 3000 avant J.-C., bien avant les autres styles majeurs."),
            en = LocalizedContent("What is the oldest architectural style in the world?", listOf("Gothic", "Renaissance", "Egyptian", "Roman"), "Culture", "Egyptian architecture, with its monumental pyramids and temples, is considered the oldest, dating back to around 3000 BC, well before other major styles."),
            zh = LocalizedContent("世界上最古老的建筑风格是什么？", listOf("哥特式", "文艺复兴式", "埃及式", "罗马式"), "文化", "埃及建筑以其宏伟的金字塔和神庙而闻名，被认为是世界上最古老的建筑风格，可追溯到公元前3000年左右，远早于其他主要风格。"),
            es = LocalizedContent("¿Cuál es el estilo arquitectónico más antiguo del mundo?", listOf("Gótico", "Renacimiento", "Egipcio", "Romano"), "Cultura", "La arquitectura egipcia, con sus pirámides y templos monumentales, se considera la más antigua, ya que data de alrededor del 3000 a.C., mucho antes que otros estilos importantes.")
        ),
        BilingualQuestion(
            id = 50348, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel archère a remporté le plus de titres olympiques?", listOf("Huayuan Xu", "Ki Bo Bae", "Victoria Weston", "Yaylagul Ramazanova"), "Sport", "L'archère sud-coréenne Huayuan Xu a remporté quatre médailles d'or olympiques entre 2004 et 2012, ce qui constitue le record pour ce sport."),
            en = LocalizedContent("Which archer has won the most Olympic titles?", listOf("Huayuan Xu", "Ki Bo Bae", "Victoria Weston", "Yaylagul Ramazanova"), "Sports", "South Korean archer Huayuan Xu won four Olympic gold medals between 2004 and 2012, which is the record for this sport."),
            zh = LocalizedContent("哪位射箭运动员赢得了最多的奥运冠军？", listOf("徐华源", "奇甫倍", "维多利亚·韦斯顿", "亚拉古尔·拉马扎诺娃"), "体育", "韩国射箭运动员徐华源在2004年至2012年间赢得了四枚奥运金牌，这是该项目的纪录。"),
            es = LocalizedContent("¿Qué arquera ha ganado más títulos olímpicos?", listOf("Huayuan Xu", "Ki Bo Bae", "Victoria Weston", "Yaylagul Ramazanova"), "Deportes", "La arquera surcoreana Huayuan Xu ganó cuatro medallas de oro olímpicas entre 2004 y 2012, lo que constituye el récord para este deporte.")
        ),
        BilingualQuestion(
            id = 50349, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a créé 'Mulholland Drive'?", listOf("David Lynch", "Michael Mann", "Darren Aronofsky", "Denis Villeneuve"), "Cinéma", "David Lynch a réalisé Mulholland Drive, sorti en 2001, un film onirique et complexe qui a remporté le prix de la mise en scène à Cannes."),
            en = LocalizedContent("Which director created 'Mulholland Drive'?", listOf("David Lynch", "Michael Mann", "Darren Aronofsky", "Denis Villeneuve"), "Cinema", "David Lynch directed Mulholland Drive, released in 2001, a dreamlike and complex film that won the Best Director award at Cannes."),
            zh = LocalizedContent("哪位导演创作了《穆赫兰道》？", listOf("大卫·林奇", "迈克尔·曼", "达伦·阿伦诺夫斯基", "丹尼斯·维伦纽瓦"), "电影", "大卫·林奇执导了2001年上映的《穆赫兰道》，这是一部如梦似幻、情节复杂的电影，获得了戛纳电影节最佳导演奖。"),
            es = LocalizedContent("¿Qué director creó 'Mulholland Drive'?", listOf("David Lynch", "Michael Mann", "Darren Aronofsky", "Denis Villeneuve"), "Cine", "David Lynch dirigió Mulholland Drive, estrenada en 2001, una película onírica y compleja que ganó el premio a la mejor dirección en Cannes.")
        ),
        BilingualQuestion(
            id = 50350, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel musicien de jazz a joué de la trompette?", listOf("Miles Davis", "John Coltrane", "Monk Thelonious", "Charlie Parker"), "Musique", "Miles Davis est l'un des trompettistes de jazz les plus influents du XXe siècle, ayant marqué des courants comme le bebop, le cool jazz et le jazz modal."),
            en = LocalizedContent("Which jazz musician played the trumpet?", listOf("Miles Davis", "John Coltrane", "Thelonious Monk", "Charlie Parker"), "Music", "Miles Davis is one of the most influential jazz trumpeters of the 20th century, having shaped movements such as bebop, cool jazz, and modal jazz."),
            zh = LocalizedContent("哪位爵士音乐家演奏小号？", listOf("迈尔斯·戴维斯", "约翰·柯川", "塞隆尼斯·蒙克", "查理·帕克"), "音乐", "迈尔斯·戴维斯是20世纪最具影响力的爵士小号手之一，对比波普、冷爵士和调式爵士等流派产生了深远影响。"),
            es = LocalizedContent("¿Qué músico de jazz tocaba la trompeta?", listOf("Miles Davis", "John Coltrane", "Thelonious Monk", "Charlie Parker"), "Musica", "Miles Davis es uno de los trompetistas de jazz más influyentes del siglo XX, habiendo marcado corrientes como el bebop, el cool jazz y el jazz modal.")
        ),
        BilingualQuestion(
            id = 50351, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'année de la signature de la Magna Carta?", listOf("1213", "1214", "1215", "1216"), "Histoire", "La Magna Carta a été signée en 1215 par le roi Jean d'Angleterre sous la pression des barons rebelles, limitant le pouvoir royal et établissant des principes de justice."),
            en = LocalizedContent("What year was the Magna Carta signed?", listOf("1213", "1214", "1215", "1216"), "History", "The Magna Carta was signed in 1215 by King John of England under pressure from rebel barons, limiting royal power and establishing principles of justice."),
            zh = LocalizedContent("《大宪章》签署于哪一年？", listOf("1213", "1214", "1215", "1216"), "历史", "《大宪章》于1215年由英格兰国王约翰在反叛贵族的压力下签署，限制了王权并确立了正义原则。"),
            es = LocalizedContent("¿En qué año se firmó la Carta Magna?", listOf("1213", "1214", "1215", "1216"), "Historia", "La Carta Magna fue firmada en 1215 por el rey Juan de Inglaterra bajo la presión de los barones rebeldes, limitando el poder real y estableciendo principios de justicia.")
        ),
        BilingualQuestion(
            id = 50352, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus haut sommet sous-marin?", listOf("Pic Challenger", "Île de Pâques", "Mont Fuji", "Pic de l'Océan"), "Science", "Le Pic Challenger, situé dans la fosse des Mariannes, est le point le plus profond de l'océan, culminant à environ 10 994 mètres sous le niveau de la mer."),
            en = LocalizedContent("What is the highest underwater peak?", listOf("Challenger Deep", "Easter Island", "Mount Fuji", "Ocean Peak"), "Science", "Challenger Deep, located in the Mariana Trench, is the deepest point in the ocean, reaching approximately 10,994 meters below sea level."),
            zh = LocalizedContent("最高的海底山峰是什么？", listOf("挑战者深渊", "复活节岛", "富士山", "海洋峰"), "科学", "挑战者深渊位于马里亚纳海沟，是海洋中最深的点，深度约为海平面以下10,994米。"),
            es = LocalizedContent("¿Cuál es el pico submarino más alto?", listOf("Abismo Challenger", "Isla de Pascua", "Monte Fuji", "Pico del Océano"), "Ciencia", "El Abismo Challenger, ubicado en la Fosa de las Marianas, es el punto más profundo del océano, alcanzando aproximadamente 10,994 metros bajo el nivel del mar.")
        ),
        BilingualQuestion(
            id = 50353, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus petit continent?", listOf("Australie", "Nouvelle-Zélande", "Greenland", "Antarctica"), "Géographie", "L'Australie est considérée comme le plus petit continent en superficie terrestre, avec environ 8,6 millions de km², loin derrière l'Europe ou l'Antarctique."),
            en = LocalizedContent("What is the smallest continent?", listOf("Australia", "New Zealand", "Greenland", "Antarctica"), "Geography", "Australia is considered the smallest continent by land area, with about 8.6 million km², far behind Europe or Antarctica."),
            zh = LocalizedContent("最小的大洲是什么？", listOf("澳大利亚", "新西兰", "格陵兰", "南极洲"), "地理", "澳大利亚被认为是陆地面积最小的大洲，约860万平方公里，远小于欧洲或南极洲。"),
            es = LocalizedContent("¿Cuál es el continente más pequeño?", listOf("Australia", "Nueva Zelanda", "Groenlandia", "Antártida"), "Geografia", "Australia es considerada el continente más pequeño por superficie terrestre, con aproximadamente 8,6 millones de km², muy por detrás de Europa o la Antártida.")
        ),
        BilingualQuestion(
            id = 50354, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien orchestre du monde?", listOf("Orchestre de la Scala", "Orchestre Royal Concertgebouw", "Orchestre de Dresde", "Orchestre de Berlin"), "Culture", "Fondé en 1548, l'Orchestre de Dresde (Staatskapelle Dresden) est considéré comme le plus ancien orchestre encore en activité au monde."),
            en = LocalizedContent("What is the oldest orchestra in the world?", listOf("La Scala Orchestra", "Royal Concertgebouw Orchestra", "Dresden Orchestra", "Berlin Orchestra"), "Culture", "Founded in 1548, the Dresden Orchestra (Staatskapelle Dresden) is considered the oldest orchestra still active in the world."),
            zh = LocalizedContent("世界上最古老的管弦乐团是什么？", listOf("斯卡拉管弦乐团", "皇家音乐厅管弦乐团", "德累斯顿管弦乐团", "柏林管弦乐团"), "文化", "德累斯顿管弦乐团（德累斯顿国家管弦乐团）成立于1548年，被认为是世界上仍在活动的最古老管弦乐团。"),
            es = LocalizedContent("¿Cuál es la orquesta más antigua del mundo?", listOf("Orquesta de La Scala", "Orquesta Real del Concertgebouw", "Orquesta de Dresde", "Orquesta de Berlín"), "Cultura", "Fundada en 1548, la Orquesta de Dresde (Staatskapelle Dresden) es considerada la orquesta más antigua aún en activo del mundo.")
        ),
        BilingualQuestion(
            id = 50355, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel footballeur a remporté le Ballon d'Or le plus de fois?", listOf("Cristiano Ronaldo", "Lionel Messi", "Pelé", "Pélé"), "Sport", "Lionel Messi a remporté le Ballon d'Or à huit reprises, un record absolu, grâce à ses performances exceptionnelles avec le FC Barcelone et l'équipe d'Argentine."),
            en = LocalizedContent("Which footballer has won the Ballon d'Or the most times?", listOf("Cristiano Ronaldo", "Lionel Messi", "Pelé", "Pelé"), "Sports", "Lionel Messi has won the Ballon d'Or eight times, an absolute record, thanks to his exceptional performances with FC Barcelona and the Argentine national team."),
            zh = LocalizedContent("哪位足球运动员赢得金球奖次数最多？", listOf("克里斯蒂亚诺·罗纳尔多", "莱昂内尔·梅西", "贝利", "贝利"), "体育", "莱昂内尔·梅西八次赢得金球奖，是绝对纪录，这得益于他在巴塞罗那和阿根廷国家队的出色表现。"),
            es = LocalizedContent("¿Qué futbolista ha ganado el Balón de Oro más veces?", listOf("Cristiano Ronaldo", "Lionel Messi", "Pelé", "Pelé"), "Deportes", "Lionel Messi ha ganado el Balón de Oro ocho veces, un récord absoluto, gracias a sus excepcionales actuaciones con el FC Barcelona y la selección argentina.")
        ),
        BilingualQuestion(
            id = 50356, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a créé 'Intersteller'?", listOf("Denis Villeneuve", "Christopher Nolan", "James Cameron", "Steven Spielberg"), "Cinéma", "Christopher Nolan a réalisé et co-écrit Interstellar, sorti en 2014, un film de science-fiction explorant les voyages interstellaires et la relativité du temps."),
            en = LocalizedContent("Which director created 'Interstellar'?", listOf("Denis Villeneuve", "Christopher Nolan", "James Cameron", "Steven Spielberg"), "Cinema", "Christopher Nolan directed and co-wrote Interstellar, released in 2014, a science fiction film exploring interstellar travel and time relativity."),
            zh = LocalizedContent("哪位导演创作了《星际穿越》？", listOf("丹尼斯·维伦纽瓦", "克里斯托弗·诺兰", "詹姆斯·卡梅隆", "史蒂文·斯皮尔伯格"), "电影", "克里斯托弗·诺兰执导并联合编剧了2014年上映的《星际穿越》，一部探索星际旅行和时间相对论的科幻电影。"),
            es = LocalizedContent("¿Qué director creó 'Interstellar'?", listOf("Denis Villeneuve", "Christopher Nolan", "James Cameron", "Steven Spielberg"), "Cine", "Christopher Nolan dirigió y coescribió Interstellar, estrenada en 2014, una película de ciencia ficción que explora los viajes interestelares y la relatividad del tiempo.")
        ),
        BilingualQuestion(
            id = 50357, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel chanteur a créé 'Satisfaction'?", listOf("David Bowie", "The Rolling Stones", "Led Zeppelin", "Pink Floyd"), "Musique", "(I Can't Get No) Satisfaction est un tube planétaire des Rolling Stones, sorti en 1965. Le riff de guitare emblématique a été composé par Keith Richards."),
            en = LocalizedContent("Which singer created 'Satisfaction'?", listOf("David Bowie", "The Rolling Stones", "Led Zeppelin", "Pink Floyd"), "Music", "(I Can't Get No) Satisfaction is a global hit by The Rolling Stones, released in 1965. The iconic guitar riff was composed by Keith Richards."),
            zh = LocalizedContent("哪位歌手创作了《Satisfaction》？", listOf("大卫·鲍伊", "滚石乐队", "齐柏林飞艇", "平克·弗洛伊德"), "音乐", "《(I Can't Get No) Satisfaction》是滚石乐队于1965年发行的全球热门歌曲。标志性的吉他即兴重复段由基思·理查兹创作。"),
            es = LocalizedContent("¿Qué cantante creó 'Satisfaction'?", listOf("David Bowie", "The Rolling Stones", "Led Zeppelin", "Pink Floyd"), "Musica", "(I Can't Get No) Satisfaction es un éxito mundial de The Rolling Stones, lanzado en 1965. El icónico riff de guitarra fue compuesto por Keith Richards.")
        ),
        BilingualQuestion(
            id = 50358, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'année de la Révolution russe?", listOf("1916", "1917", "1918", "1919"), "Histoire", "La Révolution russe a eu lieu en 1917, marquant la chute du régime tsariste et l'arrivée au pouvoir des bolcheviks dirigés par Lénine."),
            en = LocalizedContent("What year was the Russian Revolution?", listOf("1916", "1917", "1918", "1919"), "History", "The Russian Revolution took place in 1917, marking the fall of the tsarist regime and the rise to power of the Bolsheviks led by Lenin."),
            zh = LocalizedContent("俄国革命发生在哪一年？", listOf("1916", "1917", "1918", "1919"), "历史", "俄国革命发生在1917年，标志着沙皇政权的垮台和列宁领导的布尔什维克上台。"),
            es = LocalizedContent("¿En qué año fue la Revolución Rusa?", listOf("1916", "1917", "1918", "1919"), "Historia", "La Revolución Rusa tuvo lugar en 1917, marcando la caída del régimen zarista y el ascenso al poder de los bolcheviques liderados por Lenin.")
        ),
        BilingualQuestion(
            id = 50359, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand organisme unicellulaire?", listOf("Amibe géante", "Paramèce", "Bactérie géante", "Plasmode de myxomycète"), "Science", "L'amibe géante, ou Chaos carolinense, peut mesurer jusqu'à 5 millimètres, ce qui en fait le plus grand organisme unicellulaire connu visible à l'œil nu."),
            en = LocalizedContent("What is the largest unicellular organism?", listOf("Giant amoeba", "Paramecium", "Giant bacterium", "Slime mold plasmodium"), "Science", "The giant amoeba, or Chaos carolinense, can measure up to 5 millimeters, making it the largest known unicellular organism visible to the naked eye."),
            zh = LocalizedContent("最大的单细胞生物是什么？", listOf("巨型变形虫", "草履虫", "巨型细菌", "黏菌原质团"), "科学", "巨型变形虫（Chaos carolinense）可长达5毫米，是已知最大的单细胞生物，肉眼可见。"),
            es = LocalizedContent("¿Cuál es el organismo unicelular más grande?", listOf("Ameba gigante", "Paramecio", "Bacteria gigante", "Plasmodio de moho mucilaginoso"), "Ciencia", "La ameba gigante, o Chaos carolinense, puede medir hasta 5 milímetros, lo que la convierte en el organismo unicelular más grande conocido visible a simple vista.")
        ),
        BilingualQuestion(
            id = 50360, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand île du continent africain?", listOf("Madagascar", "Zanzibar", "Île Maurice", "Île Sainte-Hélène"), "Géographie", "Madagascar, située dans l'océan Indien, est la plus grande île d'Afrique avec une superficie de 587 041 km², soit environ quatre fois la taille de la Grande-Bretagne."),
            en = LocalizedContent("What is the largest island in Africa?", listOf("Madagascar", "Zanzibar", "Mauritius", "Saint Helena"), "Geography", "Madagascar, located in the Indian Ocean, is the largest island in Africa with an area of 587,041 km², about four times the size of Great Britain."),
            zh = LocalizedContent("非洲最大的岛屿是什么？", listOf("马达加斯加", "桑给巴尔", "毛里求斯", "圣赫勒拿岛"), "地理", "马达加斯加位于印度洋，是非洲最大的岛屿，面积587,041平方公里，约为英国的四倍。"),
            es = LocalizedContent("¿Cuál es la isla más grande de África?", listOf("Madagascar", "Zanzíbar", "Mauricio", "Santa Elena"), "Geografia", "Madagascar, ubicada en el océano Índico, es la isla más grande de África con una superficie de 587,041 km², aproximadamente cuatro veces el tamaño de Gran Bretaña.")
        ),
        BilingualQuestion(
            id = 50361, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien système légal écrit?", listOf("Code de Hammourabi", "Lois de Justinien", "Dix Commandements", "Droit romain"), "Culture", "Le Code de Hammourabi, gravé sur une stèle de diorite vers 1750 av. J.-C. en Mésopotamie, est considéré comme le plus ancien recueil de lois écrites complet connu."),
            en = LocalizedContent("What is the oldest written legal system?", listOf("Code of Hammurabi", "Justinian's Laws", "Ten Commandments", "Roman Law"), "Culture", "The Code of Hammurabi, engraved on a diorite stele around 1750 BC in Mesopotamia, is considered the oldest known complete written law collection."),
            zh = LocalizedContent("最古老的成文法律体系是什么？", listOf("汉谟拉比法典", "查士丁尼法典", "十诫", "罗马法"), "文化", "汉谟拉比法典刻于约公元前1750年美索不达米亚的闪长岩石碑上，被认为是已知最古老的完整成文法律汇编。"),
            es = LocalizedContent("¿Cuál es el sistema legal escrito más antiguo?", listOf("Código de Hammurabi", "Leyes de Justiniano", "Diez Mandamientos", "Derecho romano"), "Cultura", "El Código de Hammurabi, grabado en una estela de diorita alrededor del 1750 a.C. en Mesopotamia, es considerado la colección de leyes escritas completas más antigua conocida.")
        ),
    )

    private fun part5(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 50362, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel cycliste a remporté le plus de Tours de France?", listOf("Eddy Merckx", "Bernard Hinault", "Lance Armstrong", "Miguel Indurain"), "Sport", "Lance Armstrong a remporté sept Tours de France consécutifs de 1999 à 2005, un record avant que ses titres ne soient annulés pour dopage en 2012."),
            en = LocalizedContent("Which cyclist has won the most Tour de France titles?", listOf("Eddy Merckx", "Bernard Hinault", "Lance Armstrong", "Miguel Indurain"), "Sports", "Lance Armstrong won seven consecutive Tour de France titles from 1999 to 2005, a record before his titles were annulled for doping in 2012."),
            zh = LocalizedContent("哪位自行车运动员赢得环法自行车赛次数最多？", listOf("艾迪·莫克斯", "伯纳德·伊诺", "兰斯·阿姆斯特朗", "米格尔·安杜兰"), "体育", "兰斯·阿姆斯特朗从1999年到2005年连续赢得七次环法冠军，这一纪录在2012年因兴奋剂被取消。"),
            es = LocalizedContent("¿Qué ciclista ha ganado más Tours de Francia?", listOf("Eddy Merckx", "Bernard Hinault", "Lance Armstrong", "Miguel Indurain"), "Deportes", "Lance Armstrong ganó siete Tours de Francia consecutivos de 1999 a 2005, un récord antes de que sus títulos fueran anulados por dopaje en 2012.")
        ),
        BilingualQuestion(
            id = 50363, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a créé 'The Matrix'?", listOf("Joel Silver", "The Wachowskis", "John Woo", "David Fincher"), "Cinéma", "Les Wachowskis ont coécrit et réalisé la trilogie Matrix, sortie à partir de 1999."),
            en = LocalizedContent("Which director created 'The Matrix'?", listOf("Joel Silver", "The Wachowskis", "John Woo", "David Fincher"), "Cinema", "The Wachowskis co-wrote and directed the Matrix trilogy, released starting in 1999."),
            zh = LocalizedContent("哪位导演创作了《黑客帝国》？", listOf("乔尔·西尔弗", "沃卓斯基姐妹", "吴宇森", "大卫·芬奇"), "电影", "沃卓斯基姐妹共同编剧并执导了《黑客帝国》三部曲，自1999年起上映。"),
            es = LocalizedContent("¿Qué director creó 'The Matrix'?", listOf("Joel Silver", "Los Wachowski", "John Woo", "David Fincher"), "Cine", "Los Wachowski coescribieron y dirigieron la trilogía Matrix, estrenada a partir de 1999.")
        ),
        BilingualQuestion(
            id = 50364, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur a écrit 'Requiem'?", listOf("Chopin", "Mozart", "Verdi", "Brahms"), "Musique", "Mozart a composé son Requiem en 1791, une œuvre inachevée à sa mort, commandée de manière anonyme par le comte Walsegg."),
            en = LocalizedContent("Which composer wrote 'Requiem'?", listOf("Chopin", "Mozart", "Verdi", "Brahms"), "Music", "Mozart composed his Requiem in 1791, an unfinished work at his death, commissioned anonymously by Count Walsegg."),
            zh = LocalizedContent("哪位作曲家创作了《安魂曲》？", listOf("肖邦", "莫扎特", "威尔第", "勃拉姆斯"), "音乐", "莫扎特于1791年创作了他的《安魂曲》，这部作品在他去世时未完成，由瓦尔塞格伯爵匿名委托。"),
            es = LocalizedContent("¿Qué compositor escribió el 'Réquiem'?", listOf("Chopin", "Mozart", "Verdi", "Brahms"), "Música", "Mozart compuso su Réquiem en 1791, una obra inacabada a su muerte, encargada anónimamente por el conde Walsegg.")
        ),
        BilingualQuestion(
            id = 50365, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'année de la chute du mur de Berlin?", listOf("1988", "1989", "1990", "1991"), "Histoire", "Le mur de Berlin est tombé le 9 novembre 1989, marquant la fin de la division de l'Allemagne et un symbole majeur de la chute du bloc communiste en Europe."),
            en = LocalizedContent("What year did the Berlin Wall fall?", listOf("1988", "1989", "1990", "1991"), "History", "The Berlin Wall fell on November 9, 1989, marking the end of Germany's division and a major symbol of the fall of the communist bloc in Europe."),
            zh = LocalizedContent("柏林墙倒塌于哪一年？", listOf("1988", "1989", "1990", "1991"), "历史", "柏林墙于1989年11月9日倒塌，标志着德国分裂的结束以及欧洲共产主义阵营垮台的重要象征。"),
            es = LocalizedContent("¿En qué año cayó el Muro de Berlín?", listOf("1988", "1989", "1990", "1991"), "Historia", "El Muro de Berlín cayó el 9 de noviembre de 1989, marcando el fin de la división de Alemania y un símbolo importante de la caída del bloque comunista en Europa.")
        ),
        BilingualQuestion(
            id = 50366, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand mammifère qui n'est pas une baleine?", listOf("Girafe", "Éléphant", "Hippopotame", "Ours polaire"), "Science", "L'éléphant d'Afrique est le plus grand mammifère terrestre, pesant jusqu'à 6 tonnes, ce qui en fait le plus grand mammifère non aquatique après les baleines."),
            en = LocalizedContent("What is the largest mammal that is not a whale?", listOf("Giraffe", "Elephant", "Hippopotamus", "Polar bear"), "Science", "The African elephant is the largest land mammal, weighing up to 6 tons, making it the largest non-aquatic mammal after whales."),
            zh = LocalizedContent("最大的非鲸类哺乳动物是什么？", listOf("长颈鹿", "大象", "河马", "北极熊"), "科学", "非洲象是最大的陆地哺乳动物，体重可达6吨，使其成为鲸类之后最大的非水生哺乳动物。"),
            es = LocalizedContent("¿Cuál es el mamífero más grande que no es una ballena?", listOf("Jirafa", "Elefante", "Hipopótamo", "Oso polar"), "Ciencia", "El elefante africano es el mamífero terrestre más grande, pesando hasta 6 toneladas, lo que lo convierte en el mamífero no acuático más grande después de las ballenas.")
        ),
        BilingualQuestion(
            id = 50367, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand archipel d'Océanie?", listOf("Îles Samoa", "Îles Fidji", "Îles Tonga", "Îles Marquises"), "Géographie", "Avec plus de 330 îles, l'archipel des Fidji est le plus vaste d'Océanie, dépassant en nombre les autres ensembles comme la Nouvelle-Zélande ou la Papouasie-Nouvelle-Guinée."),
            en = LocalizedContent("What is the largest archipelago in Oceania?", listOf("Samoa Islands", "Fiji Islands", "Tonga Islands", "Marquesas Islands"), "Geography", "With over 330 islands, the Fiji archipelago is the largest in Oceania, surpassing other groups like New Zealand or Papua New Guinea in number."),
            zh = LocalizedContent("大洋洲最大的群岛是哪个？", listOf("萨摩亚群岛", "斐济群岛", "汤加群岛", "马克萨斯群岛"), "地理", "斐济群岛拥有超过330个岛屿，是大洋洲最大的群岛，数量上超过新西兰或巴布亚新几内亚等其他群岛。"),
            es = LocalizedContent("¿Cuál es el archipiélago más grande de Oceanía?", listOf("Islas Samoa", "Islas Fiyi", "Islas Tonga", "Islas Marquesas"), "Geografía", "Con más de 330 islas, el archipiélago de Fiyi es el más grande de Oceanía, superando en número a otros conjuntos como Nueva Zelanda o Papúa Nueva Guinea.")
        ),
        BilingualQuestion(
            id = 50368, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien temple grec debout?", listOf("Parthenon", "Temple de Poséidon", "Temple d'Athéna Pronaia", "Temple de Thésée"), "Culture", "Le temple d'Héphaïstos, souvent appelé Théséion, est l'un des temples grecs antiques les mieux conservés, datant du Ve siècle av. J.-C. Il se dresse encore dans l'Agora d'Athènes."),
            en = LocalizedContent("What is the oldest standing Greek temple?", listOf("Parthenon", "Temple of Poseidon", "Temple of Athena Pronaia", "Temple of Theseus"), "Culture", "The Temple of Hephaestus, often called Theseion, is one of the best-preserved ancient Greek temples, dating from the 5th century BC. It still stands in the Athenian Agora."),
            zh = LocalizedContent("现存最古老的希腊神庙是哪座？", listOf("帕特农神庙", "波塞冬神庙", "雅典娜普罗纳亚神庙", "忒修斯神庙"), "文化", "赫菲斯托斯神庙，常被称为忒修斯神庙，是保存最完好的古希腊神庙之一，建于公元前5世纪，至今仍矗立在雅典古市集。"),
            es = LocalizedContent("¿Cuál es el templo griego más antiguo en pie?", listOf("Partenón", "Templo de Poseidón", "Templo de Atenea Pronaia", "Templo de Teseo"), "Cultura", "El Templo de Hefesto, a menudo llamado Teseion, es uno de los templos griegos antiguos mejor conservados, que data del siglo V a.C. Todavía se alza en el Ágora de Atenas.")
        ),
        BilingualQuestion(
            id = 50369, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel golfeur a remporté le Masters le plus de fois?", listOf("Jack Nicklaus", "Tiger Woods", "Arnold Palmer", "Ben Hogan"), "Sport", "Tiger Woods détient le record de victoires au Masters avec cinq titres (1997, 2001, 2002, 2005, 2019), égalant Jack Nicklaus."),
            en = LocalizedContent("Which golfer has won the Masters the most times?", listOf("Jack Nicklaus", "Tiger Woods", "Arnold Palmer", "Ben Hogan"), "Sports", "Tiger Woods holds the record for most Masters wins with five titles (1997, 2001, 2002, 2005, 2019), tying Jack Nicklaus."),
            zh = LocalizedContent("哪位高尔夫球手赢得美国大师赛次数最多？", listOf("杰克·尼克劳斯", "泰格·伍兹", "阿诺德·帕尔默", "本·霍根"), "体育", "泰格·伍兹以五次冠军（1997、2001、2002、2005、2019）保持美国大师赛获胜次数最多的纪录，与杰克·尼克劳斯持平。"),
            es = LocalizedContent("¿Qué golfista ha ganado el Masters más veces?", listOf("Jack Nicklaus", "Tiger Woods", "Arnold Palmer", "Ben Hogan"), "Deportes", "Tiger Woods tiene el récord de más victorias en el Masters con cinco títulos (1997, 2001, 2002, 2005, 2019), empatando con Jack Nicklaus.")
        ),
        BilingualQuestion(
            id = 50370, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a créé 'Minions'?", listOf("Pierre Coffin", "Ken Daurio", "Kyle Balda", "Tous les ci-dessus"), "Cinéma", "Les Minions ont été créés par plusieurs réalisateurs : Pierre Coffin, Kyle Balda et Chris Renaud, qui ont tous contribué à la saga."),
            en = LocalizedContent("Which director created 'Minions'?", listOf("Pierre Coffin", "Ken Daurio", "Kyle Balda", "All of the above"), "Cinema", "The Minions were created by several directors: Pierre Coffin, Kyle Balda, and Chris Renaud, all of whom contributed to the saga."),
            zh = LocalizedContent("哪位导演创作了《小黄人》？", listOf("皮埃尔·科芬", "肯·道里欧", "凯尔·巴尔达", "以上都是"), "电影", "小黄人是由多位导演创作的：皮埃尔·科芬、凯尔·巴尔达和克里斯·雷纳德，他们都为这一系列做出了贡献。"),
            es = LocalizedContent("¿Qué director creó 'Minions'?", listOf("Pierre Coffin", "Ken Daurio", "Kyle Balda", "Todos los anteriores"), "Cine", "Los Minions fueron creados por varios directores: Pierre Coffin, Kyle Balda y Chris Renaud, todos contribuyeron a la saga.")
        ),
        BilingualQuestion(
            id = 50371, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel musicien a créé 'Clair de lune'?", listOf("Debussy", "Chopin", "Saint-Saëns", "Massenet"), "Musique", "Clair de lune est la troisième pièce de la Suite bergamasque, composée par Claude Debussy en 1890 et publiée en 1905."),
            en = LocalizedContent("Which musician created 'Clair de lune'?", listOf("Debussy", "Chopin", "Saint-Saëns", "Massenet"), "Music", "Clair de lune is the third piece of the Suite bergamasque, composed by Claude Debussy in 1890 and published in 1905."),
            zh = LocalizedContent("哪位音乐家创作了《月光》？", listOf("德彪西", "肖邦", "圣桑", "马斯内"), "音乐", "《月光》是《贝加莫组曲》的第三首，由克劳德·德彪西于1890年创作，1905年出版。"),
            es = LocalizedContent("¿Qué músico creó 'Clair de lune'?", listOf("Debussy", "Chopin", "Saint-Saëns", "Massenet"), "Música", "Clair de lune es la tercera pieza de la Suite bergamasque, compuesta por Claude Debussy en 1890 y publicada en 1905.")
        ),
        BilingualQuestion(
            id = 50372, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'année du bombardement de Pearl Harbor?", listOf("1940", "1941", "1942", "1943"), "Histoire", "Le 7 décembre 1941, l'aviation japonaise attaque la base navale américaine de Pearl Harbor à Hawaï, provoquant l'entrée des États-Unis dans la Seconde Guerre mondiale."),
            en = LocalizedContent("What year was the bombing of Pearl Harbor?", listOf("1940", "1941", "1942", "1943"), "History", "On December 7, 1941, Japanese aircraft attacked the US naval base at Pearl Harbor, Hawaii, leading to the United States' entry into World War II."),
            zh = LocalizedContent("珍珠港事件发生在哪一年？", listOf("1940", "1941", "1942", "1943"), "历史", "1941年12月7日，日本飞机袭击了美国在夏威夷珍珠港的海军基地，导致美国加入第二次世界大战。"),
            es = LocalizedContent("¿En qué año fue el bombardeo de Pearl Harbor?", listOf("1940", "1941", "1942", "1943"), "Historia", "El 7 de diciembre de 1941, la aviación japonesa atacó la base naval estadounidense de Pearl Harbor en Hawái, provocando la entrada de Estados Unidos en la Segunda Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 50373, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand insecte du monde?", listOf("Coléoptère géant", "Bâton du diable", "Fourmi de velours", "Frelon géant"), "Science", "Le bâton du diable, ou phasme de Chan, peut atteindre 62 centimètres de long, ce qui en fait l'insecte le plus long du monde."),
            en = LocalizedContent("What is the largest insect in the world?", listOf("Giant beetle", "Devil's stick insect", "Velvet ant", "Giant hornet"), "Science", "The devil's stick insect, or Chan's stick insect, can reach 62 centimeters in length, making it the longest insect in the world."),
            zh = LocalizedContent("世界上最大的昆虫是什么？", listOf("巨型甲虫", "魔鬼竹节虫", "天鹅绒蚁", "大黄蜂"), "科学", "魔鬼竹节虫，或称陈氏竹节虫，体长可达62厘米，是世界上最长的昆虫。"),
            es = LocalizedContent("¿Cuál es el insecto más grande del mundo?", listOf("Escarabajo gigante", "Insecto palo del diablo", "Hormiga de terciopelo", "Avispón gigante"), "Ciencia", "El insecto palo del diablo, o fásmido de Chan, puede alcanzar 62 centímetros de largo, lo que lo convierte en el insecto más largo del mundo.")
        ),
        BilingualQuestion(
            id = 50374, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lagon du monde?", listOf("Grand Lagon Bleu", "Lagon de Rangiroa", "Grand Trou Bleu", "Lagon de Tahiti"), "Géographie", "Le Grand Lagon Bleu, situé en Nouvelle-Calédonie, est le plus grand lagon du monde avec une superficie de 24 000 km². Il est classé au patrimoine mondial de l'UNESCO pour sa biodiversité exceptionnelle."),
            en = LocalizedContent("What is the largest lagoon in the world?", listOf("Grand Blue Lagoon", "Rangiroa Lagoon", "Great Blue Hole", "Tahiti Lagoon"), "Geography", "The Grand Blue Lagoon, located in New Caledonia, is the largest lagoon in the world with an area of 24,000 km². It is a UNESCO World Heritage site for its exceptional biodiversity."),
            zh = LocalizedContent("世界上最大的泻湖是什么？", listOf("大蓝泻湖", "朗伊罗阿泻湖", "大蓝洞", "塔希提泻湖"), "地理", "大蓝泻湖位于新喀里多尼亚，面积24,000平方公里，是世界上最大的泻湖，因其卓越的生物多样性被列为联合国教科文组织世界遗产。"),
            es = LocalizedContent("¿Cuál es la laguna más grande del mundo?", listOf("Gran Laguna Azul", "Laguna de Rangiroa", "Gran Agujero Azul", "Laguna de Tahití"), "Geografía", "La Gran Laguna Azul, ubicada en Nueva Caledonia, es la laguna más grande del mundo con una superficie de 24,000 km². Está clasificada como Patrimonio de la Humanidad por la UNESCO por su excepcional biodiversidad.")
        ),
        BilingualQuestion(
            id = 50375, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien texte poétique du monde?", listOf("Iliade", "Épopée de Gilgamesh", "Odyssée", "Ramayana"), "Culture", "Rédigée en sumérien vers 2100 av. J.-C., l'Épopée de Gilgamesh est gravée sur des tablettes d'argile en Mésopotamie, ce qui en fait le plus ancien texte poétique connu."),
            en = LocalizedContent("What is the oldest poetic text in the world?", listOf("Iliad", "Epic of Gilgamesh", "Odyssey", "Ramayana"), "Culture", "Written in Sumerian around 2100 BC, the Epic of Gilgamesh is inscribed on clay tablets in Mesopotamia, making it the oldest known poetic text."),
            zh = LocalizedContent("世界上最古老的诗歌文本是什么？", listOf("《伊利亚特》", "《吉尔伽美什史诗》", "《奥德赛》", "《罗摩衍那》"), "文化", "《吉尔伽美什史诗》用苏美尔语写于公元前2100年左右，刻在美索不达米亚的泥板上，是已知最古老的诗歌文本。"),
            es = LocalizedContent("¿Cuál es el texto poético más antiguo del mundo?", listOf("Ilíada", "Épica de Gilgamesh", "Odisea", "Ramayana"), "Cultura", "Escrita en sumerio hacia el 2100 a.C., la Épica de Gilgamesh está grabada en tablillas de arcilla en Mesopotamia, lo que la convierte en el texto poético más antiguo conocido.")
        ),
        BilingualQuestion(
            id = 50376, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel sumo champion a remporté le plus de titres?", listOf("Hakuho", "Taiho", "Kakuseikatsu", "Wakanohana III"), "Sport", "Hakuho détient le record du plus grand nombre de championnats de sumo (45 titres de makuuchi), surpassant tous les autres lutteurs de l'histoire."),
            en = LocalizedContent("Which sumo champion has won the most titles?", listOf("Hakuho", "Taiho", "Kakuseikatsu", "Wakanohana III"), "Sports", "Hakuho holds the record for the most sumo championships (45 makuuchi titles), surpassing all other wrestlers in history."),
            zh = LocalizedContent("哪位相扑冠军赢得了最多的头衔？", listOf("白鹏", "大鹏", "觉胜活", "若乃花三世"), "体育", "白鹏保持着相扑冠军最多的纪录（45个幕内冠军），超越了历史上所有其他相扑选手。"),
            es = LocalizedContent("¿Qué campeón de sumo ha ganado más títulos?", listOf("Hakuho", "Taiho", "Kakuseikatsu", "Wakanohana III"), "Deportes", "Hakuho posee el récord de más campeonatos de sumo (45 títulos de makuuchi), superando a todos los demás luchadores de la historia.")
        ),
        BilingualQuestion(
            id = 50377, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a créé 'Joker'?", listOf("Darren Aronofsky", "Todd Phillips", "Denis Villeneuve", "Damien Chazelle"), "Cinéma", "Todd Phillips a réalisé le film Joker (2019), un drame psychologique sur les origines du célèbre ennemi de Batman, qui a remporté le Lion d'or à Venise."),
            en = LocalizedContent("Which director created 'Joker'?", listOf("Darren Aronofsky", "Todd Phillips", "Denis Villeneuve", "Damien Chazelle"), "Cinema", "Todd Phillips directed the film Joker (2019), a psychological drama about the origins of Batman's famous enemy, which won the Golden Lion at Venice."),
            zh = LocalizedContent("哪位导演创作了《小丑》？", listOf("达伦·阿伦诺夫斯基", "托德·菲利普斯", "丹尼斯·维伦纽瓦", "达米恩·查泽雷"), "电影", "托德·菲利普斯执导了电影《小丑》（2019），这是一部关于蝙蝠侠著名敌人起源的心理剧，获得了威尼斯金狮奖。"),
            es = LocalizedContent("¿Qué director creó 'Joker'?", listOf("Darren Aronofsky", "Todd Phillips", "Denis Villeneuve", "Damien Chazelle"), "Cine", "Todd Phillips dirigió la película Joker (2019), un drama psicológico sobre los orígenes del famoso enemigo de Batman, que ganó el León de Oro en Venecia.")
        ),
        BilingualQuestion(
            id = 50378, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le compositeur le plus joué au monde?", listOf("Mozart", "Beethoven", "Bach", "Brahms"), "Musique", "Bach est le compositeur le plus joué au monde car ses œuvres sont universellement utilisées dans l'éducation musicale, les concerts et les enregistrements, notamment grâce à leur structure polyphonique intemporelle."),
            en = LocalizedContent("What is the most performed composer in the world?", listOf("Mozart", "Beethoven", "Bach", "Brahms"), "Music", "Bach is the most performed composer in the world because his works are universally used in music education, concerts, and recordings, especially due to their timeless polyphonic structure."),
            zh = LocalizedContent("世界上演奏最多的作曲家是谁？", listOf("莫扎特", "贝多芬", "巴赫", "勃拉姆斯"), "音乐", "巴赫是世界上演奏最多的作曲家，因为他的作品被普遍用于音乐教育、音乐会和录音，尤其是其永恒的多声部结构。"),
            es = LocalizedContent("¿Cuál es el compositor más interpretado del mundo?", listOf("Mozart", "Beethoven", "Bach", "Brahms"), "Música", "Bach es el compositor más interpretado del mundo porque sus obras se utilizan universalmente en la educación musical, conciertos y grabaciones, especialmente gracias a su estructura polifónica atemporal.")
        ),
        BilingualQuestion(
            id = 50379, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'année de la Conférence de Yalta?", listOf("1943", "1944", "1945", "1946"), "Histoire", "La Conférence de Yalta a réuni les dirigeants des Alliés (Roosevelt, Churchill et Staline) en février 1945 pour planifier la fin de la Seconde Guerre mondiale et l'organisation de l'après-guerre."),
            en = LocalizedContent("What year was the Yalta Conference?", listOf("1943", "1944", "1945", "1946"), "History", "The Yalta Conference brought together Allied leaders (Roosevelt, Churchill, and Stalin) in February 1945 to plan the end of World War II and the post-war organization."),
            zh = LocalizedContent("雅尔塔会议是在哪一年？", listOf("1943", "1944", "1945", "1946"), "历史", "雅尔塔会议于1945年2月召开，盟国领导人（罗斯福、丘吉尔和斯大林）齐聚一堂，规划第二次世界大战的结束和战后安排。"),
            es = LocalizedContent("¿En qué año fue la Conferencia de Yalta?", listOf("1943", "1944", "1945", "1946"), "Historia", "La Conferencia de Yalta reunió a los líderes aliados (Roosevelt, Churchill y Stalin) en febrero de 1945 para planificar el fin de la Segunda Guerra Mundial y la organización de la posguerra.")
        ),
        BilingualQuestion(
            id = 50380, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand animal volant?", listOf("Faucon", "Aigle", "Albatros", "Vautour"), "Science", "L'albatros hurleur détient le record de la plus grande envergure parmi les oiseaux, pouvant atteindre 3,5 mètres, ce qui en fait le plus grand animal capable de voler."),
            en = LocalizedContent("What is the largest flying animal?", listOf("Falcon", "Eagle", "Albatross", "Vulture"), "Science", "The wandering albatross holds the record for the largest wingspan among birds, reaching up to 3.5 meters, making it the largest animal capable of flight."),
            zh = LocalizedContent("最大的飞行动物是什么？", listOf("猎鹰", "鹰", "信天翁", "秃鹫"), "科学", "漂泊信天翁拥有鸟类中最大的翼展，可达3.5米，是能够飞行的最大动物。"),
            es = LocalizedContent("¿Cuál es el animal volador más grande?", listOf("Halcón", "Águila", "Albatros", "Buitre"), "Ciencia", "El albatros errante posee el récord de la mayor envergadura entre las aves, alcanzando hasta 3,5 metros, lo que lo convierte en el animal más grande capaz de volar.")
        ),
        BilingualQuestion(
            id = 50381, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand lac d'Amérique du Nord?", listOf("Lac Supérieur", "Lac Michigan", "Lac Huron", "Grand Lac de l'Ours"), "Géographie", "Le lac Supérieur est le plus grand lac d'Amérique du Nord par sa superficie, situé entre les États-Unis et le Canada, et fait partie des Grands Lacs."),
            en = LocalizedContent("What is the largest lake in North America?", listOf("Lake Superior", "Lake Michigan", "Lake Huron", "Great Bear Lake"), "Geography", "Lake Superior is the largest lake in North America by surface area, located between the United States and Canada, and is part of the Great Lakes."),
            zh = LocalizedContent("北美最大的湖泊是什么？", listOf("苏必利尔湖", "密歇根湖", "休伦湖", "大熊湖"), "地理", "苏必利尔湖是北美面积最大的湖泊，位于美国和加拿大之间，是五大湖之一。"),
            es = LocalizedContent("¿Cuál es el lago más grande de América del Norte?", listOf("Lago Superior", "Lago Míchigan", "Lago Hurón", "Gran Lago del Oso"), "Geografía", "El lago Superior es el lago más grande de América del Norte por superficie, ubicado entre Estados Unidos y Canadá, y forma parte de los Grandes Lagos.")
        ),
        BilingualQuestion(
            id = 50382, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien cirque du monde?", listOf("Cirque du Soleil", "Ringling Bros", "Cirque Knie", "Astley's Amphitheatre"), "Culture", "Fondé à Londres en 1768 par Philip Astley, l'Astley's Amphitheatre est considéré comme le premier cirque moderne, où il présentait des numéros équestres et acrobatiques."),
            en = LocalizedContent("What is the oldest circus in the world?", listOf("Cirque du Soleil", "Ringling Bros", "Cirque Knie", "Astley's Amphitheatre"), "Culture", "Founded in London in 1768 by Philip Astley, Astley's Amphitheatre is considered the first modern circus, where he presented equestrian and acrobatic acts."),
            zh = LocalizedContent("世界上最古老的马戏团是哪个？", listOf("太阳马戏团", "林林兄弟马戏团", "克尼马戏团", "阿斯特利圆形剧场"), "文化", "由菲利普·阿斯特利于1768年在伦敦创立，阿斯特利圆形剧场被认为是第一个现代马戏团，他在那里表演马术和杂技节目。"),
            es = LocalizedContent("¿Cuál es el circo más antiguo del mundo?", listOf("Cirque du Soleil", "Ringling Bros", "Cirque Knie", "Astley's Amphitheatre"), "Cultura", "Fundado en Londres en 1768 por Philip Astley, el Astley's Amphitheatre es considerado el primer circo moderno, donde presentaba números ecuestres y acrobáticos.")
        ),
        BilingualQuestion(
            id = 50383, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel catcheur a remporté le plus de championnats WWE?", listOf("Undertaker", "John Cena", "Triple H", "The Rock"), "Sport", "The Undertaker détient le record du plus grand nombre de victoires à WrestleMania, avec 21 succès, mais il n'a pas remporté le plus de championnats WWE. Ce record appartient à John Cena ou Ric Flair, selon les titres comptés."),
            en = LocalizedContent("Which wrestler has won the most WWE championships?", listOf("Undertaker", "John Cena", "Triple H", "The Rock"), "Sports", "The Undertaker holds the record for most wins at WrestleMania, with 21 victories, but he has not won the most WWE championships. That record belongs to John Cena or Ric Flair, depending on which titles are counted."),
            zh = LocalizedContent("哪位摔跤手赢得了最多的WWE冠军？", listOf("送葬者", "约翰·塞纳", "Triple H", "巨石强森"), "体育", "送葬者保持着摔跤狂热大赛最多胜利的记录，共21场胜利，但他并没有赢得最多的WWE冠军。这一记录属于约翰·塞纳或瑞克·弗莱尔，具体取决于统计的冠军头衔。"),
            es = LocalizedContent("¿Qué luchador ha ganado más campeonatos de la WWE?", listOf("Undertaker", "John Cena", "Triple H", "The Rock"), "Deportes", "Undertaker tiene el récord de más victorias en WrestleMania, con 21 triunfos, pero no ha ganado la mayor cantidad de campeonatos de la WWE. Ese récord pertenece a John Cena o Ric Flair, según los títulos que se cuenten.")
        ),
        BilingualQuestion(
            id = 50384, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a créé 'La La Land'?", listOf("Ryan Coogler", "Damien Chazelle", "Barry Jenkins", "Bradley Cooper"), "Cinéma", "Damien Chazelle a écrit et réalisé La La Land, une comédie musicale sortie en 2016 qui a remporté six Oscars, dont celui du meilleur réalisateur, faisant de lui le plus jeune lauréat de cette catégorie."),
            en = LocalizedContent("Which director created 'La La Land'?", listOf("Ryan Coogler", "Damien Chazelle", "Barry Jenkins", "Bradley Cooper"), "Cinema", "Damien Chazelle wrote and directed La La Land, a musical released in 2016 that won six Oscars, including Best Director, making him the youngest winner in that category."),
            zh = LocalizedContent("哪位导演创作了《爱乐之城》？", listOf("瑞恩·库格勒", "达米恩·查泽雷", "巴里·詹金斯", "布莱德利·库珀"), "电影", "达米恩·查泽雷编剧并执导了《爱乐之城》，这部2016年上映的音乐剧获得了六项奥斯卡奖，包括最佳导演，使他成为该类别最年轻的获奖者。"),
            es = LocalizedContent("¿Qué director creó 'La La Land'?", listOf("Ryan Coogler", "Damien Chazelle", "Barry Jenkins", "Bradley Cooper"), "Cine", "Damien Chazelle escribió y dirigió La La Land, un musical estrenado en 2016 que ganó seis premios Oscar, incluyendo Mejor Director, convirtiéndolo en el ganador más joven de esa categoría.")
        ),
        BilingualQuestion(
            id = 50385, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel musicien a joué du violon classique?", listOf("Niccolò Paganini", "David Garrett", "Itzhak Perlman", "Tous les ci-dessus"), "Musique", "Le violon classique est un instrument pratiqué dans de nombreux genres musicaux, et des musiciens comme Lindsey Stirling, David Garrett ou Nigel Kennedy en ont joué, ce qui rend la réponse \"Tous les ci-dessus\" correcte si la liste incluait ces noms."),
            en = LocalizedContent("Which musician played classical violin?", listOf("Niccolò Paganini", "David Garrett", "Itzhak Perlman", "All of the above"), "Music", "Classical violin is an instrument practiced in many musical genres, and musicians like Lindsey Stirling, David Garrett, or Nigel Kennedy have played it, making the answer 'All of the above' correct if the list included those names."),
            zh = LocalizedContent("哪位音乐家演奏过古典小提琴？", listOf("尼科洛·帕格尼尼", "大卫·葛瑞特", "伊扎克·帕尔曼", "以上都是"), "音乐", "古典小提琴是一种在许多音乐流派中使用的乐器，像林赛·斯特林、大卫·葛瑞特或奈杰尔·肯尼迪等音乐家都演奏过它，因此如果列表包含这些名字，答案“以上都是”是正确的。"),
            es = LocalizedContent("¿Qué músico tocó el violín clásico?", listOf("Niccolò Paganini", "David Garrett", "Itzhak Perlman", "Todos los anteriores"), "Música", "El violín clásico es un instrumento practicado en muchos géneros musicales, y músicos como Lindsey Stirling, David Garrett o Nigel Kennedy lo han tocado, por lo que la respuesta 'Todos los anteriores' es correcta si la lista incluyera esos nombres.")
        ),
        BilingualQuestion(
            id = 50386, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'année de la fin de la Guerre du Golfe?", listOf("1990", "1991", "1992", "1993"), "Histoire", "La guerre du Golfe, déclenchée par l'invasion du Koweït par l'Irak, a pris fin en 1991 avec la victoire de la coalition menée par les États-Unis."),
            en = LocalizedContent("What year did the Gulf War end?", listOf("1990", "1991", "1992", "1993"), "History", "The Gulf War, triggered by Iraq's invasion of Kuwait, ended in 1991 with the victory of the US-led coalition."),
            zh = LocalizedContent("海湾战争在哪一年结束？", listOf("1990", "1991", "1992", "1993"), "历史", "海湾战争由伊拉克入侵科威特引发，于1991年以美国领导的联盟胜利告终。"),
            es = LocalizedContent("¿En qué año terminó la Guerra del Golfo?", listOf("1990", "1991", "1992", "1993"), "Historia", "La Guerra del Golfo, desencadenada por la invasión de Kuwait por parte de Irak, terminó en 1991 con la victoria de la coalición liderada por Estados Unidos.")
        ),
        BilingualQuestion(
            id = 50387, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand écosystème terrestre?", listOf("Savane", "Toundra", "Forêt tropicale", "Taïga"), "Science", "La taïga, aussi appelée forêt boréale, s'étend sur environ 17 millions de kilomètres carrés à travers la Russie, le Canada et la Scandinavie, ce qui en fait le plus vaste biome terrestre."),
            en = LocalizedContent("What is the largest terrestrial ecosystem?", listOf("Savanna", "Tundra", "Rainforest", "Taiga"), "Science", "The taiga, also called boreal forest, spans about 17 million square kilometers across Russia, Canada, and Scandinavia, making it the largest terrestrial biome."),
            zh = LocalizedContent("最大的陆地生态系统是什么？", listOf("稀树草原", "苔原", "热带雨林", "针叶林"), "科学", "针叶林，也称为北方森林，横跨俄罗斯、加拿大和斯堪的纳维亚半岛，面积约1700万平方公里，是最大的陆地生物群落。"),
            es = LocalizedContent("¿Cuál es el ecosistema terrestre más grande?", listOf("Sabana", "Tundra", "Selva tropical", "Taiga"), "Ciencia", "La taiga, también llamada bosque boreal, se extiende por unos 17 millones de kilómetros cuadrados a través de Rusia, Canadá y Escandinavia, lo que la convierte en el bioma terrestre más grande.")
        ),
        BilingualQuestion(
            id = 50388, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand État des États-Unis?", listOf("Texas", "Californie", "Alaska", "Montano"), "Géographie", "L'Alaska est le plus grand État des États-Unis en superficie, avec environ 1,7 million de kilomètres carrés, soit plus du double du Texas, le deuxième plus grand."),
            en = LocalizedContent("What is the largest state in the United States?", listOf("Texas", "California", "Alaska", "Montana"), "Geography", "Alaska is the largest state in the United States by area, with about 1.7 million square kilometers, more than twice the size of Texas, the second largest."),
            zh = LocalizedContent("美国最大的州是哪个？", listOf("德克萨斯州", "加利福尼亚州", "阿拉斯加州", "蒙大拿州"), "地理", "阿拉斯加州是美国面积最大的州，约170万平方公里，是第二大州德克萨斯州的两倍多。"),
            es = LocalizedContent("¿Cuál es el estado más grande de los Estados Unidos?", listOf("Texas", "California", "Alaska", "Montana"), "Geografía", "Alaska es el estado más grande de los Estados Unidos por área, con aproximadamente 1.7 millones de kilómetros cuadrados, más del doble del tamaño de Texas, el segundo más grande.")
        ),
        BilingualQuestion(
            id = 50389, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien musée d'art européen?", listOf("Uffizi", "Accademia", "Prado", "Louvre"), "Culture", "Les Offices à Florence, inaugurés en 1581, sont considérés comme le plus ancien musée d'art d'Europe, ouverts au public dès le XVIe siècle."),
            en = LocalizedContent("What is the oldest European art museum?", listOf("Uffizi", "Accademia", "Prado", "Louvre"), "Culture", "The Uffizi in Florence, inaugurated in 1581, is considered the oldest art museum in Europe, open to the public since the 16th century."),
            zh = LocalizedContent("最古老的欧洲艺术博物馆是哪个？", listOf("乌菲兹美术馆", "学院美术馆", "普拉多博物馆", "卢浮宫"), "文化", "佛罗伦萨的乌菲兹美术馆于1581年开放，被认为是欧洲最古老的艺术博物馆，自16世纪起向公众开放。"),
            es = LocalizedContent("¿Cuál es el museo de arte europeo más antiguo?", listOf("Uffizi", "Accademia", "Prado", "Louvre"), "Cultura", "Los Uffizi en Florencia, inaugurados en 1581, son considerados el museo de arte más antiguo de Europa, abiertos al público desde el siglo XVI.")
        ),
        BilingualQuestion(
            id = 50390, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel nageuse a remporté le plus de médailles olympiques?", listOf("Katie Ledecky", "Larisa Latynina", "Nadia Comăneci", "Simone Biles"), "Sport", "Katie Ledecky détient le record de médailles olympiques féminines en natation avec 14 podiums, dont 9 titres, accumulés entre 2012 et 2024."),
            en = LocalizedContent("Which swimmer has won the most Olympic medals?", listOf("Katie Ledecky", "Larisa Latynina", "Nadia Comăneci", "Simone Biles"), "Sports", "Katie Ledecky holds the record for most Olympic medals by a female swimmer with 14 podiums, including 9 golds, accumulated between 2012 and 2024."),
            zh = LocalizedContent("哪位游泳运动员赢得了最多的奥运奖牌？", listOf("凯蒂·莱德基", "拉里莎·拉蒂尼娜", "纳迪亚·科马内奇", "西蒙·拜尔斯"), "体育", "凯蒂·莱德基保持着女子游泳运动员奥运奖牌最多的记录，共14枚奖牌，包括9枚金牌，在2012年至2024年间获得。"),
            es = LocalizedContent("¿Qué nadadora ha ganado más medallas olímpicas?", listOf("Katie Ledecky", "Larisa Latynina", "Nadia Comăneci", "Simone Biles"), "Deportes", "Katie Ledecky tiene el récord de más medallas olímpicas en natación femenina con 14 podios, incluyendo 9 oros, acumulados entre 2012 y 2024.")
        ),
        BilingualQuestion(
            id = 50391, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a créé 'Tenet'?", listOf("Denis Villeneuve", "Christopher Nolan", "Steven Spielberg", "Michael Bay"), "Cinéma", "Christopher Nolan a écrit et réalisé Tenet, un film d'espionnage à suspense sorti en 2020, connu pour son concept d'inversion temporelle et ses séquences d'action complexes."),
            en = LocalizedContent("Which director created 'Tenet'?", listOf("Denis Villeneuve", "Christopher Nolan", "Steven Spielberg", "Michael Bay"), "Cinema", "Christopher Nolan wrote and directed Tenet, a spy thriller released in 2020, known for its concept of time inversion and complex action sequences."),
            zh = LocalizedContent("哪位导演创作了《信条》？", listOf("丹尼斯·维伦纽瓦", "克里斯托弗·诺兰", "史蒂文·斯皮尔伯格", "迈克尔·贝"), "电影", "克里斯托弗·诺兰编剧并执导了《信条》，一部2020年上映的间谍惊悚片，以其时间逆转的概念和复杂的动作场面而闻名。"),
            es = LocalizedContent("¿Qué director creó 'Tenet'?", listOf("Denis Villeneuve", "Christopher Nolan", "Steven Spielberg", "Michael Bay"), "Cine", "Christopher Nolan escribió y dirigió Tenet, un thriller de espías estrenado en 2020, conocido por su concepto de inversión temporal y complejas secuencias de acción.")
        ),
        BilingualQuestion(
            id = 50392, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel chanteur a enregistré 'Revolution'?", listOf("Rolling Stones", "The Beatles", "Led Zeppelin", "Pink Floyd"), "Musique", "La chanson 'Revolution' a été enregistrée par les Beatles en 1968, sortie en face B du single 'Hey Jude'."),
            en = LocalizedContent("Which artist recorded 'Revolution'?", listOf("Rolling Stones", "The Beatles", "Led Zeppelin", "Pink Floyd"), "Music", "The song 'Revolution' was recorded by the Beatles in 1968, released as the B-side of the single 'Hey Jude'."),
            zh = LocalizedContent("哪位歌手录制了《Revolution》？", listOf("滚石乐队", "披头士乐队", "齐柏林飞艇", "平克·弗洛伊德"), "音乐", "歌曲《Revolution》由披头士乐队于1968年录制，作为单曲《Hey Jude》的B面发行。"),
            es = LocalizedContent("¿Qué artista grabó 'Revolution'?", listOf("Rolling Stones", "The Beatles", "Led Zeppelin", "Pink Floyd"), "Musica", "La canción 'Revolution' fue grabada por los Beatles en 1968, lanzada como cara B del sencillo 'Hey Jude'.")
        ),
        BilingualQuestion(
            id = 50393, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'année de la signature du Traité de Versailles?", listOf("1918", "1919", "1920", "1921"), "Histoire", "Le Traité de Versailles, signé le 28 juin 1919, mit officiellement fin à la Première Guerre mondiale entre les Alliés et l'Allemagne."),
            en = LocalizedContent("What year was the Treaty of Versailles signed?", listOf("1918", "1919", "1920", "1921"), "History", "The Treaty of Versailles, signed on June 28, 1919, officially ended World War I between the Allies and Germany."),
            zh = LocalizedContent("《凡尔赛条约》签署于哪一年？", listOf("1918", "1919", "1920", "1921"), "历史", "《凡尔赛条约》于1919年6月28日签署，正式结束了协约国与德国之间的第一次世界大战。"),
            es = LocalizedContent("¿En qué año se firmó el Tratado de Versalles?", listOf("1918", "1919", "1920", "1921"), "Historia", "El Tratado de Versalles, firmado el 28 de junio de 1919, puso fin oficialmente a la Primera Guerra Mundial entre los Aliados y Alemania.")
        ),
        BilingualQuestion(
            id = 50394, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand type de dinosaure?", listOf("T-Rex", "Brachiosaurus", "Argentinosaurus", "Diplodocus"), "Science", "L'Argentinosaurus est considéré comme le plus grand dinosaure connu, avec une longueur estimée à 30-40 mètres et un poids de 60 à 100 tonnes, vivant au Crétacé en Argentine."),
            en = LocalizedContent("What is the largest type of dinosaur?", listOf("T-Rex", "Brachiosaurus", "Argentinosaurus", "Diplodocus"), "Science", "Argentinosaurus is considered the largest known dinosaur, with an estimated length of 30-40 meters and weight of 60-100 tons, living in the Cretaceous period in Argentina."),
            zh = LocalizedContent("最大的恐龙类型是什么？", listOf("霸王龙", "腕龙", "阿根廷龙", "梁龙"), "科学", "阿根廷龙被认为是已知最大的恐龙，估计长度30-40米，重量60-100吨，生活在白垩纪的阿根廷。"),
            es = LocalizedContent("¿Cuál es el tipo de dinosaurio más grande?", listOf("T-Rex", "Brachiosaurus", "Argentinosaurus", "Diplodocus"), "Ciencia", "El Argentinosaurus es considerado el dinosaurio más grande conocido, con una longitud estimada de 30-40 metros y un peso de 60-100 toneladas, que vivió en el Cretácico en Argentina.")
        ),
        BilingualQuestion(
            id = 50395, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand pays par superficie?", listOf("Canada", "États-Unis", "Chine", "Russie"), "Géographie", "La Russie s'étend sur environ 17,1 millions de kilomètres carrés, ce qui en fait le plus vaste pays du monde, couvrant près de 11 % des terres émergées."),
            en = LocalizedContent("What is the largest country by area?", listOf("Canada", "United States", "China", "Russia"), "Geography", "Russia spans about 17.1 million square kilometers, making it the largest country in the world, covering nearly 11% of the Earth's landmass."),
            zh = LocalizedContent("面积最大的国家是哪个？", listOf("加拿大", "美国", "中国", "俄罗斯"), "地理", "俄罗斯面积约1710万平方公里，是世界上最大的国家，覆盖了近11%的地球陆地面积。"),
            es = LocalizedContent("¿Cuál es el país más grande por superficie?", listOf("Canadá", "Estados Unidos", "China", "Rusia"), "Geografia", "Rusia se extiende sobre aproximadamente 17,1 millones de kilómetros cuadrados, lo que lo convierte en el país más grande del mundo, cubriendo casi el 11% de la superficie terrestre.")
        ),
        BilingualQuestion(
            id = 50396, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien festival de musique du monde?", listOf("Glastonbury", "Montreux Jazz Festival", "Salzburg Festival", "Bayreuth Festival"), "Culture", "Créé en 1876 par Richard Wagner, le Festival de Bayreuth est le plus ancien festival de musique encore en activité, dédié exclusivement à ses œuvres."),
            en = LocalizedContent("What is the oldest music festival in the world?", listOf("Glastonbury", "Montreux Jazz Festival", "Salzburg Festival", "Bayreuth Festival"), "Culture", "Founded in 1876 by Richard Wagner, the Bayreuth Festival is the oldest music festival still active, dedicated exclusively to his works."),
            zh = LocalizedContent("世界上最古老的音乐节是什么？", listOf("格拉斯顿伯里", "蒙特勒爵士音乐节", "萨尔茨堡音乐节", "拜罗伊特音乐节"), "文化", "拜罗伊特音乐节由理查德·瓦格纳于1876年创立，是仍在举办的最古老音乐节，专门演出他的作品。"),
            es = LocalizedContent("¿Cuál es el festival de música más antiguo del mundo?", listOf("Glastonbury", "Festival de Jazz de Montreux", "Festival de Salzburgo", "Festival de Bayreuth"), "Cultura", "Fundado en 1876 por Richard Wagner, el Festival de Bayreuth es el festival de música más antiguo aún en actividad, dedicado exclusivamente a sus obras.")
        ),
        BilingualQuestion(
            id = 50397, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel judoka a remporté le plus de médailles olympiques?", listOf("Teddy Riner", "Akinori Nakamura", "Ryoko Tani", "Hidehiko Yoshida"), "Sport", "Teddy Riner détient le record de médailles olympiques en judo avec cinq podiums, dont trois titres individuels et deux par équipes, ce qui fait de lui le judoka le plus décoré de l'histoire des Jeux."),
            en = LocalizedContent("Which judoka has won the most Olympic medals?", listOf("Teddy Riner", "Akinori Nakamura", "Ryoko Tani", "Hidehiko Yoshida"), "Sports", "Teddy Riner holds the record for Olympic medals in judo with five podiums, including three individual titles and two team medals, making him the most decorated judoka in Olympic history."),
            zh = LocalizedContent("哪位柔道运动员获得了最多的奥运奖牌？", listOf("泰迪·里内", "中村彰典", "田代凉子", "吉田秀彦"), "体育", "泰迪·里内以五枚奥运奖牌（包括三枚个人金牌和两枚团体奖牌）保持着柔道奥运奖牌纪录，是奥运历史上获得奖牌最多的柔道运动员。"),
            es = LocalizedContent("¿Qué judoka ha ganado más medallas olímpicas?", listOf("Teddy Riner", "Akinori Nakamura", "Ryoko Tani", "Hidehiko Yoshida"), "Deportes", "Teddy Riner tiene el récord de medallas olímpicas en judo con cinco podios, incluyendo tres títulos individuales y dos medallas por equipos, lo que lo convierte en el judoka más condecorado en la historia olímpica.")
        ),
        BilingualQuestion(
            id = 50398, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a créé 'A Clockwork Orange'?", listOf("Stanley Kubrick", "David Fincher", "Quentin Tarantino", "Darren Aronofsky"), "Cinéma", "Stanley Kubrick a réalisé A Clockwork Orange en 1971, adapté du roman d'Anthony Burgess. Le film est connu pour son esthétique provocante et sa bande-son classique."),
            en = LocalizedContent("Which director created 'A Clockwork Orange'?", listOf("Stanley Kubrick", "David Fincher", "Quentin Tarantino", "Darren Aronofsky"), "Cinema", "Stanley Kubrick directed A Clockwork Orange in 1971, adapted from Anthony Burgess's novel. The film is known for its provocative aesthetic and classical soundtrack."),
            zh = LocalizedContent("哪位导演创作了《发条橙》？", listOf("斯坦利·库布里克", "大卫·芬奇", "昆汀·塔伦蒂诺", "达伦·阿伦诺夫斯基"), "电影", "斯坦利·库布里克于1971年执导了《发条橙》，改编自安东尼·伯吉斯的小说。该片以其挑衅性的美学和古典配乐而闻名。"),
            es = LocalizedContent("¿Qué director creó 'La naranja mecánica'?", listOf("Stanley Kubrick", "David Fincher", "Quentin Tarantino", "Darren Aronofsky"), "Cine", "Stanley Kubrick dirigió La naranja mecánica en 1971, adaptada de la novela de Anthony Burgess. La película es conocida por su estética provocadora y su banda sonora clásica.")
        ),
        BilingualQuestion(
            id = 50399, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur a écrit 'The Rite of Spring'?", listOf("Debussy", "Stravinsky", "Bartók", "Shostakovich"), "Musique", "Igor Stravinsky a composé Le Sacre du printemps en 1913 pour les Ballets russes de Diaghilev. Sa première à Paris a provoqué l'un des plus célèbres scandales de l'histoire de la musique."),
            en = LocalizedContent("Which composer wrote 'The Rite of Spring'?", listOf("Debussy", "Stravinsky", "Bartók", "Shostakovich"), "Music", "Igor Stravinsky composed The Rite of Spring in 1913 for Diaghilev's Ballets Russes. Its premiere in Paris caused one of the most famous scandals in music history."),
            zh = LocalizedContent("哪位作曲家创作了《春之祭》？", listOf("德彪西", "斯特拉文斯基", "巴托克", "肖斯塔科维奇"), "音乐", "伊戈尔·斯特拉文斯基于1913年为佳吉列夫的俄罗斯芭蕾舞团创作了《春之祭》。其在巴黎的首演引发了音乐史上最著名的丑闻之一。"),
            es = LocalizedContent("¿Qué compositor escribió 'La consagración de la primavera'?", listOf("Debussy", "Stravinsky", "Bartók", "Shostakovich"), "Musica", "Igor Stravinsky compuso La consagración de la primavera en 1913 para los Ballets Rusos de Diaghilev. Su estreno en París provocó uno de los escándalos más famosos de la historia de la música.")
        ),
        BilingualQuestion(
            id = 50400, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'année de la Proclamation d'Émancipation?", listOf("1861", "1862", "1863", "1864"), "Histoire", "La Proclamation d'Émancipation, signée par Abraham Lincoln le 1er janvier 1863, déclarait libres les esclaves des États confédérés pendant la guerre de Sécession."),
            en = LocalizedContent("What year was the Emancipation Proclamation?", listOf("1861", "1862", "1863", "1864"), "History", "The Emancipation Proclamation, signed by Abraham Lincoln on January 1, 1863, declared slaves in Confederate states free during the American Civil War."),
            zh = LocalizedContent("《解放宣言》签署于哪一年？", listOf("1861", "1862", "1863", "1864"), "历史", "《解放宣言》由亚伯拉罕·林肯于1863年1月1日签署，宣布美国内战期间南方邦联各州的奴隶获得自由。"),
            es = LocalizedContent("¿En qué año fue la Proclamación de Emancipación?", listOf("1861", "1862", "1863", "1864"), "Historia", "La Proclamación de Emancipación, firmada por Abraham Lincoln el 1 de enero de 1863, declaró libres a los esclavos de los estados confederados durante la Guerra Civil estadounidense.")
        ),
        BilingualQuestion(
            id = 50401, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand écosystème aquatique?", listOf("Récif de corail", "Toundra", "Océan", "Lac Baïkal"), "Science", "L'océan couvre plus de 70% de la surface terrestre et abrite la majorité de la vie marine, ce qui en fait le plus vaste écosystème aquatique."),
            en = LocalizedContent("What is the largest aquatic ecosystem?", listOf("Coral reef", "Tundra", "Ocean", "Lake Baikal"), "Science", "The ocean covers over 70% of the Earth's surface and hosts the majority of marine life, making it the largest aquatic ecosystem."),
            zh = LocalizedContent("最大的水生生态系统是什么？", listOf("珊瑚礁", "苔原", "海洋", "贝加尔湖"), "科学", "海洋覆盖了地球表面70%以上，容纳了大部分海洋生物，是最大的水生生态系统。"),
            es = LocalizedContent("¿Cuál es el ecosistema acuático más grande?", listOf("Arrecife de coral", "Tundra", "Océano", "Lago Baikal"), "Ciencia", "El océano cubre más del 70% de la superficie terrestre y alberga la mayor parte de la vida marina, lo que lo convierte en el ecosistema acuático más grande.")
        ),
        BilingualQuestion(
            id = 50402, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand port du monde?", listOf("Port de Shanghai", "Port de Singapour", "Port de Rotterdam", "Port de Hong Kong"), "Géographie", "Le port de Shanghai est le plus grand port du monde en termes de trafic de conteneurs et de tonnage de marchandises depuis 2010, dépassant Singapour grâce à l'essor économique chinois."),
            en = LocalizedContent("What is the largest port in the world?", listOf("Port of Shanghai", "Port of Singapore", "Port of Rotterdam", "Port of Hong Kong"), "Geography", "The Port of Shanghai has been the world's largest port in terms of container traffic and cargo tonnage since 2010, surpassing Singapore due to China's economic growth."),
            zh = LocalizedContent("世界上最大的港口是哪个？", listOf("上海港", "新加坡港", "鹿特丹港", "香港港"), "地理", "自2010年以来，上海港在集装箱吞吐量和货物吨位方面一直是世界上最大的港口，凭借中国的经济增长超越了新加坡。"),
            es = LocalizedContent("¿Cuál es el puerto más grande del mundo?", listOf("Puerto de Shanghái", "Puerto de Singapur", "Puerto de Róterdam", "Puerto de Hong Kong"), "Geografía", "El puerto de Shanghái es el puerto más grande del mundo en términos de tráfico de contenedores y tonelaje de carga desde 2010, superando a Singapur gracias al crecimiento económico chino.")
        ),
        BilingualQuestion(
            id = 50403, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien manuscrit jamais découvert?", listOf("Codex Sinaiticus", "Manuscrits de la Mer Morte", "Tablettes d'Ebla", "Papyrus du Louvre"), "Culture", "Les tablettes d'Ebla, découvertes en Syrie dans les années 1970, datent du 3e millénaire avant J.-C. et constituent l'une des plus anciennes bibliothèques de manuscrits connues."),
            en = LocalizedContent("What is the oldest manuscript ever discovered?", listOf("Codex Sinaiticus", "Dead Sea Scrolls", "Ebla Tablets", "Louvre Papyrus"), "Culture", "The Ebla Tablets, discovered in Syria in the 1970s, date back to the 3rd millennium BC and constitute one of the oldest known manuscript libraries."),
            zh = LocalizedContent("有史以来发现的最古老的手稿是什么？", listOf("西奈抄本", "死海古卷", "埃布拉泥板", "卢浮宫纸莎草纸"), "文化", "埃布拉泥板于20世纪70年代在叙利亚发现，可追溯到公元前3千年，是已知最古老的手稿图书馆之一。"),
            es = LocalizedContent("¿Cuál es el manuscrito más antiguo jamás descubierto?", listOf("Códice Sinaítico", "Manuscritos del Mar Muerto", "Tablas de Ebla", "Papiro del Louvre"), "Cultura", "Las tablas de Ebla, descubiertas en Siria en la década de 1970, datan del tercer milenio a.C. y constituyen una de las bibliotecas de manuscritos más antiguas conocidas.")
        ),
        BilingualQuestion(
            id = 50404, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel footballeur français a remporté la Coupe du Monde?", listOf("Thierry Henry", "Zinédine Zidane", "Marcel Desailly", "Patrick Vieira"), "Sport", "Zinédine Zidane a marqué deux buts en finale de la Coupe du Monde 1998, permettant à la France de remporter son premier titre mondial face au Brésil."),
            en = LocalizedContent("Which French footballer won the World Cup?", listOf("Thierry Henry", "Zinedine Zidane", "Marcel Desailly", "Patrick Vieira"), "Sports", "Zinedine Zidane scored two goals in the 1998 World Cup final, allowing France to win its first world title against Brazil."),
            zh = LocalizedContent("哪位法国足球运动员赢得了世界杯？", listOf("蒂埃里·亨利", "齐内丁·齐达内", "马塞尔·德塞利", "帕特里克·维埃拉"), "体育", "齐内丁·齐达内在1998年世界杯决赛中攻入两球，帮助法国队击败巴西，赢得了首个世界冠军。"),
            es = LocalizedContent("¿Qué futbolista francés ganó la Copa del Mundo?", listOf("Thierry Henry", "Zinedine Zidane", "Marcel Desailly", "Patrick Vieira"), "Deportes", "Zinedine Zidane marcó dos goles en la final de la Copa del Mundo de 1998, permitiendo a Francia ganar su primer título mundial contra Brasil.")
        ),
        BilingualQuestion(
            id = 50405, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a créé 'Barbie'?", listOf("Amy Pascal", "Greta Gerwig", "Jon M. Chu", "Paul King"), "Cinéma", "Greta Gerwig a coécrit et réalisé le film Barbie, sorti en 2023, avec Margot Robbie dans le rôle-titre."),
            en = LocalizedContent("Which director created 'Barbie'?", listOf("Amy Pascal", "Greta Gerwig", "Jon M. Chu", "Paul King"), "Cinema", "Greta Gerwig co-wrote and directed the film Barbie, released in 2023, starring Margot Robbie in the title role."),
            zh = LocalizedContent("哪位导演创作了《芭比》？", listOf("艾米·帕斯卡尔", "格蕾塔·葛韦格", "朱浩伟", "保罗·金"), "电影", "格蕾塔·葛韦格共同编剧并执导了2023年上映的电影《芭比》，由玛格特·罗比主演。"),
            es = LocalizedContent("¿Qué director creó 'Barbie'?", listOf("Amy Pascal", "Greta Gerwig", "Jon M. Chu", "Paul King"), "Cine", "Greta Gerwig coescribió y dirigió la película Barbie, estrenada en 2023, con Margot Robbie en el papel principal.")
        ),
        BilingualQuestion(
            id = 50406, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel musicien a composé 'The Stars and Stripes Forever'?", listOf("John Philip Sousa", "George Gershwin", "Aaron Copland", "Leonard Bernstein"), "Musique", "John Philip Sousa, surnommé le \"Roi de la marche\", a composé ce morceau en 1896, devenu la marche nationale officielle des États-Unis."),
            en = LocalizedContent("Which musician composed 'The Stars and Stripes Forever'?", listOf("John Philip Sousa", "George Gershwin", "Aaron Copland", "Leonard Bernstein"), "Music", "John Philip Sousa, known as the 'March King', composed this piece in 1896, which became the official national march of the United States."),
            zh = LocalizedContent("哪位音乐家创作了《星条旗永不落》？", listOf("约翰·菲利普·苏萨", "乔治·格什温", "阿隆·科普兰", "伦纳德·伯恩斯坦"), "音乐", "约翰·菲利普·苏萨，被誉为“进行曲之王”，于1896年创作了这首曲子，后来成为美国的官方国家进行曲。"),
            es = LocalizedContent("¿Qué músico compuso 'The Stars and Stripes Forever'?", listOf("John Philip Sousa", "George Gershwin", "Aaron Copland", "Leonard Bernstein"), "Música", "John Philip Sousa, apodado el 'Rey de la marcha', compuso esta pieza en 1896, que se convirtió en la marcha nacional oficial de los Estados Unidos.")
        ),
        BilingualQuestion(
            id = 50407, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'année du début de la Réforme protestante?", listOf("1515", "1516", "1517", "1518"), "Histoire", "1517 marque l'affichage des 95 thèses de Martin Luther à Wittenberg, acte fondateur de la Réforme protestante contre les indulgences de l'Église catholique."),
            en = LocalizedContent("What year did the Protestant Reformation begin?", listOf("1515", "1516", "1517", "1518"), "History", "1517 marks the posting of Martin Luther's 95 Theses in Wittenberg, the founding act of the Protestant Reformation against the Catholic Church's indulgences."),
            zh = LocalizedContent("宗教改革始于哪一年？", listOf("1515年", "1516年", "1517年", "1518年"), "历史", "1517年，马丁·路德在维滕贝格张贴了《九十五条论纲》，这是反对天主教会赎罪券的宗教改革奠基之举。"),
            es = LocalizedContent("¿En qué año comenzó la Reforma Protestante?", listOf("1515", "1516", "1517", "1518"), "Historia", "1517 marca la publicación de las 95 tesis de Martín Lutero en Wittenberg, acto fundacional de la Reforma Protestante contra las indulgencias de la Iglesia Católica.")
        ),
        BilingualQuestion(
            id = 50408, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus profond lac du monde?", listOf("Lac Baïkal", "Lac Malawi", "Lac Tanganyika", "Crater Lake"), "Science", "Le lac Baïkal, situé en Sibérie, atteint une profondeur maximale de 1 642 mètres, ce qui en fait le lac le plus profond de la planète."),
            en = LocalizedContent("What is the deepest lake in the world?", listOf("Lake Baikal", "Lake Malawi", "Lake Tanganyika", "Crater Lake"), "Science", "Lake Baikal, located in Siberia, reaches a maximum depth of 1,642 meters, making it the deepest lake on the planet."),
            zh = LocalizedContent("世界上最深的湖泊是哪个？", listOf("贝加尔湖", "马拉维湖", "坦噶尼喀湖", "火山口湖"), "科学", "贝加尔湖位于西伯利亚，最大深度达1642米，是地球上最深的湖泊。"),
            es = LocalizedContent("¿Cuál es el lago más profundo del mundo?", listOf("Lago Baikal", "Lago Malawi", "Lago Tanganica", "Crater Lake"), "Ciencia", "El lago Baikal, situado en Siberia, alcanza una profundidad máxima de 1.642 metros, lo que lo convierte en el lago más profundo del planeta.")
        ),
        BilingualQuestion(
            id = 50409, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus haut plateau du monde?", listOf("Plateau du Tibet", "Plateau de l'Altaï", "Plateau de Colombie", "Plateau du Deccan"), "Géographie", "Le Plateau du Tibet, souvent appelé le toit du monde, culmine à environ 4 500 mètres d'altitude moyenne, ce qui en fait le plus haut et le plus vaste plateau de la planète."),
            en = LocalizedContent("What is the highest plateau in the world?", listOf("Tibetan Plateau", "Altai Plateau", "Columbia Plateau", "Deccan Plateau"), "Geography", "The Tibetan Plateau, often called the Roof of the World, has an average elevation of about 4,500 meters, making it the highest and largest plateau on Earth."),
            zh = LocalizedContent("世界上最高的高原是哪个？", listOf("青藏高原", "阿尔泰山脉", "哥伦比亚高原", "德干高原"), "地理", "青藏高原常被称为“世界屋脊”，平均海拔约4500米，是地球上最高、最大的高原。"),
            es = LocalizedContent("¿Cuál es la meseta más alta del mundo?", listOf("Meseta del Tíbet", "Meseta de Altái", "Meseta de Columbia", "Meseta del Decán"), "Geografía", "La meseta del Tíbet, a menudo llamada el techo del mundo, tiene una altitud media de unos 4.500 metros, lo que la convierte en la meseta más alta y extensa del planeta.")
        ),
        BilingualQuestion(
            id = 50410, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus ancien parc national du monde?", listOf("Parc de Virunga", "Parc Yellowstone", "Parc Royal de Bago", "Parc de Plitvice"), "Culture", "Créé en 1872, le parc national de Yellowstone, situé principalement dans le Wyoming, est officiellement reconnu comme le premier parc national au monde."),
            en = LocalizedContent("What is the oldest national park in the world?", listOf("Virunga National Park", "Yellowstone National Park", "Royal Bago Park", "Plitvice Lakes National Park"), "Culture", "Established in 1872, Yellowstone National Park, primarily located in Wyoming, is officially recognized as the first national park in the world."),
            zh = LocalizedContent("世界上最古老的国家公园是哪个？", listOf("维龙加国家公园", "黄石国家公园", "巴戈皇家公园", "普利特维采湖群国家公园"), "文化", "黄石国家公园成立于1872年，主要位于怀俄明州，被公认为世界上第一个国家公园。"),
            es = LocalizedContent("¿Cuál es el parque nacional más antiguo del mundo?", listOf("Parque Nacional de Virunga", "Parque Nacional de Yellowstone", "Parque Real de Bago", "Parque Nacional de los Lagos de Plitvice"), "Cultura", "Establecido en 1872, el Parque Nacional de Yellowstone, ubicado principalmente en Wyoming, es reconocido oficialmente como el primer parque nacional del mundo.")
        ),
        BilingualQuestion(
            id = 50411, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel coureur d'athlétisme a remporté 4 médailles d'or olympiques?", listOf("Jesse Owens", "Carl Lewis", "Usain Bolt", "Michael Johnson"), "Sport", "Carl Lewis a dominé le sprint et le saut en longueur dans les années 1980 et 1990, remportant neuf médailles d'or olympiques au total, dont quatre aux Jeux de Los Angeles en 1984."),
            en = LocalizedContent("Which track and field athlete won 4 Olympic gold medals?", listOf("Jesse Owens", "Carl Lewis", "Usain Bolt", "Michael Johnson"), "Sports", "Carl Lewis dominated sprinting and long jump in the 1980s and 1990s, winning a total of nine Olympic gold medals, including four at the 1984 Los Angeles Games."),
            zh = LocalizedContent("哪位田径运动员赢得了4枚奥运金牌？", listOf("杰西·欧文斯", "卡尔·刘易斯", "尤塞恩·博尔特", "迈克尔·约翰逊"), "体育", "卡尔·刘易斯在20世纪80年代和90年代统治了短跑和跳远项目，共获得九枚奥运金牌，其中四枚来自1984年洛杉矶奥运会。"),
            es = LocalizedContent("¿Qué atleta de atletismo ganó 4 medallas de oro olímpicas?", listOf("Jesse Owens", "Carl Lewis", "Usain Bolt", "Michael Johnson"), "Deportes", "Carl Lewis dominó las carreras de velocidad y el salto de longitud en las décadas de 1980 y 1990, ganando un total de nueve medallas de oro olímpicas, incluidas cuatro en los Juegos de Los Ángeles de 1984.")
        ),
        BilingualQuestion(
            id = 50412, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel réalisateur a créé 'Dune' (2021)?", listOf("David Lynch", "Denis Villeneuve", "Steven Spielberg", "Christopher Nolan"), "Cinéma", "Denis Villeneuve a adapté le roman de Frank Herbert avec une vision épique et immersive, sorti en 2021 après avoir réalisé 'Blade Runner 2049'."),
            en = LocalizedContent("Which director created 'Dune' (2021)?", listOf("David Lynch", "Denis Villeneuve", "Steven Spielberg", "Christopher Nolan"), "Cinema", "Denis Villeneuve adapted Frank Herbert's novel with an epic and immersive vision, released in 2021 after directing 'Blade Runner 2049'."),
            zh = LocalizedContent("哪位导演创作了《沙丘》（2021年）？", listOf("大卫·林奇", "丹尼斯·维伦纽瓦", "史蒂文·斯皮尔伯格", "克里斯托弗·诺兰"), "电影", "丹尼斯·维伦纽瓦以史诗般的沉浸式视野改编了弗兰克·赫伯特的小说，该片于2021年上映，此前他执导了《银翼杀手2049》。"),
            es = LocalizedContent("¿Qué director creó 'Dune' (2021)?", listOf("David Lynch", "Denis Villeneuve", "Steven Spielberg", "Christopher Nolan"), "Cine", "Denis Villeneuve adaptó la novela de Frank Herbert con una visión épica e inmersiva, estrenada en 2021 después de dirigir 'Blade Runner 2049'.")
        ),
        BilingualQuestion(
            id = 50413, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien groupe de rock du monde?", listOf("The Beatles", "The Rolling Stones", "The Who", "Led Zeppelin"), "Musique", "Le groupe The Who, formé en 1964 à Londres, est souvent considéré comme l'un des plus anciens groupes de rock encore en activité, bien que des formations antérieures existent."),
            en = LocalizedContent("What is the oldest rock band in the world?", listOf("The Beatles", "The Rolling Stones", "The Who", "Led Zeppelin"), "Music", "The Who, formed in 1964 in London, is often considered one of the oldest rock bands still active, although earlier groups exist."),
            zh = LocalizedContent("世界上最古老的摇滚乐队是哪个？", listOf("披头士", "滚石乐队", "谁人乐队", "齐柏林飞艇"), "音乐", "谁人乐队于1964年在伦敦成立，常被认为是仍在活动的最古老摇滚乐队之一，尽管存在更早的乐队。"),
            es = LocalizedContent("¿Cuál es la banda de rock más antigua del mundo?", listOf("The Beatles", "The Rolling Stones", "The Who", "Led Zeppelin"), "Musica", "The Who, formada en 1964 en Londres, a menudo se considera una de las bandas de rock más antiguas aún activas, aunque existen formaciones anteriores.")
        ),
        BilingualQuestion(
            id = 50414, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'année de la fin de l'Empire ottoman?", listOf("1920", "1921", "1922", "1923"), "Histoire", "L'Empire ottoman a officiellement pris fin en 1923, lorsque la République de Turquie a été proclamée après l'abolition du sultanat en 1922."),
            en = LocalizedContent("What year did the Ottoman Empire end?", listOf("1920", "1921", "1922", "1923"), "History", "The Ottoman Empire officially ended in 1923, when the Republic of Turkey was proclaimed after the abolition of the sultanate in 1922."),
            zh = LocalizedContent("奥斯曼帝国在哪一年结束？", listOf("1920", "1921", "1922", "1923"), "历史", "奥斯曼帝国于1923年正式结束，当时土耳其共和国在1922年废除苏丹制后宣告成立。"),
            es = LocalizedContent("¿En qué año terminó el Imperio Otomano?", listOf("1920", "1921", "1922", "1923"), "Historia", "El Imperio Otomano terminó oficialmente en 1923, cuando se proclamó la República de Turquía tras la abolición del sultanato en 1922.")
        ),
        BilingualQuestion(
            id = 50415, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand type de méduse?", listOf("Méduse boîte", "Méduse géante", "Méduse crinière de lion", "Méduse royale"), "Science", "La méduse crinière de lion (Cyanea capillata) détient le record de la plus grande méduse, avec un corps pouvant atteindre 2 mètres de diamètre et des tentacules s'étendant sur plus de 30 mètres."),
            en = LocalizedContent("What is the largest type of jellyfish?", listOf("Box jellyfish", "Giant jellyfish", "Lion's mane jellyfish", "Royal jellyfish"), "Science", "The lion's mane jellyfish (Cyanea capillata) holds the record for the largest jellyfish, with a body up to 2 meters in diameter and tentacles extending over 30 meters."),
            zh = LocalizedContent("最大的水母种类是什么？", listOf("箱水母", "巨型水母", "狮鬃水母", "皇家水母"), "科学", "狮鬃水母（Cyanea capillata）保持着最大水母的记录，身体直径可达2米，触手延伸超过30米。"),
            es = LocalizedContent("¿Cuál es el tipo de medusa más grande?", listOf("Medusa de caja", "Medusa gigante", "Medusa melena de león", "Medusa real"), "Ciencia", "La medusa melena de león (Cyanea capillata) tiene el récord de la medusa más grande, con un cuerpo de hasta 2 metros de diámetro y tentáculos que se extienden más de 30 metros.")
        ),
        BilingualQuestion(
            id = 50416, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand delta de la Méditerranée?", listOf("Delta du Nile", "Delta du Danube", "Delta du Rhône", "Delta de l'Èbre"), "Géographie", "Le delta du Nil, formé par le fleuve Nil à son embouchure dans la mer Méditerranée, est le plus grand de cette région avec une superficie d'environ 240 km²."),
            en = LocalizedContent("What is the largest delta in the Mediterranean?", listOf("Nile Delta", "Danube Delta", "Rhône Delta", "Ebro Delta"), "Geography", "The Nile Delta, formed by the Nile River at its mouth into the Mediterranean Sea, is the largest in this region with an area of about 240 km²."),
            zh = LocalizedContent("地中海最大的三角洲是哪个？", listOf("尼罗河三角洲", "多瑙河三角洲", "罗讷河三角洲", "埃布罗河三角洲"), "地理", "尼罗河三角洲由尼罗河注入地中海形成，是该地区最大的三角洲，面积约240平方公里。"),
            es = LocalizedContent("¿Cuál es el delta más grande del Mediterráneo?", listOf("Delta del Nilo", "Delta del Danubio", "Delta del Ródano", "Delta del Ebro"), "Geografia", "El delta del Nilo, formado por el río Nilo en su desembocadura en el mar Mediterráneo, es el más grande de esta región con una superficie de unos 240 km².")
        ),
        BilingualQuestion(
            id = 50417, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien jardin botaniste du monde?", listOf("Jardin Botanique de Padoue", "Jardin Botanique de Leyde", "Jardin Botanique de Londres", "Jardin Botanique de Lyon"), "Culture", "Fondé en 1545, le Jardin botanique de Padoue en Italie est le plus ancien jardin botanique universitaire encore à son emplacement d'origine."),
            en = LocalizedContent("What is the oldest botanical garden in the world?", listOf("Padua Botanical Garden", "Leiden Botanical Garden", "London Botanical Garden", "Lyon Botanical Garden"), "Culture", "Founded in 1545, the Padua Botanical Garden in Italy is the oldest university botanical garden still at its original location."),
            zh = LocalizedContent("世界上最古老的植物园是哪个？", listOf("帕多瓦植物园", "莱顿植物园", "伦敦植物园", "里昂植物园"), "文化", "意大利的帕多瓦植物园建于1545年，是仍在原址的最古老的大学植物园。"),
            es = LocalizedContent("¿Cuál es el jardín botánico más antiguo del mundo?", listOf("Jardín Botánico de Padua", "Jardín Botánico de Leiden", "Jardín Botánico de Londres", "Jardín Botánico de Lyon"), "Cultura", "Fundado en 1545, el Jardín Botánico de Padua en Italia es el jardín botánico universitario más antiguo que aún se encuentra en su ubicación original.")
        ),
        BilingualQuestion(
            id = 50418, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel équipe de cricket a remporté la Coupe du Monde le plus de fois?", listOf("Australie", "Inde", "Afrique du Sud", "Pakistan"), "Sport", "L'Australie détient le record avec six titres de Coupe du Monde de cricket (1987, 1999, 2003, 2007, 2015, 2023), soit deux de plus que les Antilles et l'Inde."),
            en = LocalizedContent("Which cricket team has won the World Cup the most times?", listOf("Australia", "India", "South Africa", "Pakistan"), "Sports", "Australia holds the record with six Cricket World Cup titles (1987, 1999, 2003, 2007, 2015, 2023), two more than the West Indies and India."),
            zh = LocalizedContent("哪支板球队赢得世界杯次数最多？", listOf("澳大利亚", "印度", "南非", "巴基斯坦"), "体育", "澳大利亚以六次板球世界杯冠军（1987、1999、2003、2007、2015、2023）保持纪录，比西印度群岛和印度多两次。"),
            es = LocalizedContent("¿Qué equipo de cricket ha ganado la Copa del Mundo más veces?", listOf("Australia", "India", "Sudáfrica", "Pakistán"), "Deportes", "Australia tiene el récord con seis títulos de la Copa del Mundo de Cricket (1987, 1999, 2003, 2007, 2015, 2023), dos más que las Indias Occidentales y la India.")
        ),
        BilingualQuestion(
            id = 50419, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a créé 'Nope'?", listOf("M. Night Shyamalan", "Jordan Peele", "Get Out", "Ari Aster"), "Cinéma", "Jordan Peele a réalisé 'Nope' en 2022, après ses films d'horreur sociale 'Get Out' et 'Us'."),
            en = LocalizedContent("Which director created 'Nope'?", listOf("M. Night Shyamalan", "Jordan Peele", "Get Out", "Ari Aster"), "Cinema", "Jordan Peele directed 'Nope' in 2022, following his social horror films 'Get Out' and 'Us'."),
            zh = LocalizedContent("哪位导演创作了《不》？", listOf("M·奈特·沙马兰", "乔丹·皮尔", "逃出绝命镇", "阿里·艾斯特"), "电影", "乔丹·皮尔在2022年执导了《不》，此前他执导了社会恐怖片《逃出绝命镇》和《我们》。"),
            es = LocalizedContent("¿Qué director creó 'Nope'?", listOf("M. Night Shyamalan", "Jordan Peele", "Get Out", "Ari Aster"), "Cine", "Jordan Peele dirigió 'Nope' en 2022, después de sus películas de terror social 'Get Out' y 'Us'.")
        ),
        BilingualQuestion(
            id = 50420, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel musicien a joué du piano dans le jazz?", listOf("Art Tatum", "Bill Evans", "Thelonious Monk", "Tous les ci-dessus"), "Musique", "Le jazz a été marqué par de nombreux pianistes célèbres comme Duke Ellington, Thelonious Monk ou Bill Evans, rendant impossible de n'en citer qu'un seul."),
            en = LocalizedContent("Which musician played piano in jazz?", listOf("Art Tatum", "Bill Evans", "Thelonious Monk", "All of the above"), "Music", "Jazz has been marked by many famous pianists like Duke Ellington, Thelonious Monk, or Bill Evans, making it impossible to name just one."),
            zh = LocalizedContent("哪位音乐家在爵士乐中弹奏钢琴？", listOf("阿特·塔图姆", "比尔·埃文斯", "塞隆尼斯·蒙克", "以上都是"), "音乐", "爵士乐有许多著名钢琴家，如艾灵顿公爵、塞隆尼斯·蒙克或比尔·埃文斯，因此无法只列举一位。"),
            es = LocalizedContent("¿Qué músico tocó el piano en el jazz?", listOf("Art Tatum", "Bill Evans", "Thelonious Monk", "Todos los anteriores"), "Musica", "El jazz ha sido marcado por muchos pianistas famosos como Duke Ellington, Thelonious Monk o Bill Evans, lo que hace imposible nombrar solo uno.")
        ),
        BilingualQuestion(
            id = 50421, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'année de la Révolution cubaine?", listOf("1957", "1958", "1959", "1960"), "Histoire", "La Révolution cubaine, menée par Fidel Castro et Che Guevara, a renversé le dictateur Fulgencio Batista le 1er janvier 1959."),
            en = LocalizedContent("What year was the Cuban Revolution?", listOf("1957", "1958", "1959", "1960"), "History", "The Cuban Revolution, led by Fidel Castro and Che Guevara, overthrew dictator Fulgencio Batista on January 1, 1959."),
            zh = LocalizedContent("古巴革命发生在哪一年？", listOf("1957", "1958", "1959", "1960"), "历史", "由菲德尔·卡斯特罗和切·格瓦拉领导的古巴革命于1959年1月1日推翻了独裁者富尔亨西奥·巴蒂斯塔。"),
            es = LocalizedContent("¿En qué año fue la Revolución Cubana?", listOf("1957", "1958", "1959", "1960"), "Historia", "La Revolución Cubana, liderada por Fidel Castro y Che Guevara, derrocó al dictador Fulgencio Batista el 1 de enero de 1959.")
        ),
        BilingualQuestion(
            id = 50422, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand type de tortue?", listOf("Tortue léopard", "Tortue géante des Galápagos", "Tortue alligator", "Tortue marine"), "Science", "La tortue géante des Galápagos peut peser plus de 400 kg et mesurer jusqu'à 1,8 mètre de long, ce qui en fait la plus grande espèce de tortue terrestre."),
            en = LocalizedContent("What is the largest type of turtle?", listOf("Leopard tortoise", "Galápagos giant tortoise", "Alligator snapping turtle", "Sea turtle"), "Science", "The Galápagos giant tortoise can weigh over 400 kg and measure up to 1.8 meters in length, making it the largest species of land tortoise."),
            zh = LocalizedContent("最大的龟类是什么？", listOf("豹纹陆龟", "加拉帕戈斯象龟", "鳄龟", "海龟"), "科学", "加拉帕戈斯象龟体重可超过400公斤，身长可达1.8米，是最大的陆龟物种。"),
            es = LocalizedContent("¿Cuál es el tipo de tortuga más grande?", listOf("Tortuga leopardo", "Tortuga gigante de Galápagos", "Tortuga caimán", "Tortuga marina"), "Ciencia", "La tortuga gigante de Galápagos puede pesar más de 400 kg y medir hasta 1,8 metros de largo, lo que la convierte en la especie de tortuga terrestre más grande.")
        ),
        BilingualQuestion(
            id = 50423, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac asiatique?", listOf("Lac Baïkal", "Lac Issyk-Kul", "Caspienne", "Lac d'Aral"), "Géographie", "La mer Caspienne, bien que nommée mer, est un lac salé endoréique. Avec une superficie d'environ 371 000 km², c'est le plus grand lac d'Asie et du monde."),
            en = LocalizedContent("What is the largest lake in Asia?", listOf("Lake Baikal", "Issyk-Kul", "Caspian Sea", "Aral Sea"), "Geography", "The Caspian Sea, although named a sea, is an endorheic salt lake. With an area of about 371,000 km², it is the largest lake in Asia and the world."),
            zh = LocalizedContent("亚洲最大的湖泊是什么？", listOf("贝加尔湖", "伊塞克湖", "里海", "咸海"), "地理", "里海虽然名为海，但实际上是一个内陆咸水湖。面积约37.1万平方公里，是亚洲乃至世界最大的湖泊。"),
            es = LocalizedContent("¿Cuál es el lago más grande de Asia?", listOf("Lago Baikal", "Lago Issyk-Kul", "Mar Caspio", "Mar de Aral"), "Geografía", "El mar Caspio, aunque llamado mar, es un lago salado endorreico. Con una superficie de aproximadamente 371.000 km², es el lago más grande de Asia y del mundo.")
        ),
        BilingualQuestion(
            id = 50424, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien film du monde?", listOf("L'Arrivée d'un train en gare de La Ciotat", "La Sortie de l'Usine Lumière à Lyon", "Panorama du Grand Canal de Venise", "La Vengeance du Nègrillon"), "Culture", "Tourné en 1895 par Louis Lumière, ce film d'une quarantaine de secondes est considéré comme la première projection publique payante de l'histoire du cinéma."),
            en = LocalizedContent("What is the oldest film in the world?", listOf("Arrival of a Train at La Ciotat", "Workers Leaving the Lumière Factory", "Panorama of the Grand Canal of Venice", "The Revenge of the Negro"), "Culture", "Filmed in 1895 by Louis Lumière, this 40-second film is considered the first public paid projection in cinema history."),
            zh = LocalizedContent("世界上最古老的电影是什么？", listOf("火车进站", "工厂大门", "威尼斯大运河全景", "黑人的复仇"), "文化", "由路易·卢米埃尔于1895年拍摄，这部约40秒的电影被认为是电影史上第一次公开付费放映。"),
            es = LocalizedContent("¿Cuál es la película más antigua del mundo?", listOf("Llegada de un tren a La Ciotat", "Salida de la fábrica Lumière en Lyon", "Panorama del Gran Canal de Venecia", "La venganza del negrito"), "Cultura", "Filmada en 1895 por Louis Lumière, esta película de unos cuarenta segundos es considerada la primera proyección pública de pago en la historia del cine.")
        ),
        BilingualQuestion(
            id = 50425, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel équipe de tennis féminin a remporté le plus de Fédération Coups?", listOf("États-Unis", "Australie", "Tchécoslovaquie", "Suède"), "Sport", "Les États-Unis détiennent le record du plus grand nombre de victoires en Fed Cup (aujourd'hui Billie Jean King Cup) avec 18 titres, devant la République tchèque et l'Australie."),
            en = LocalizedContent("Which women's tennis team has won the most Fed Cups?", listOf("United States", "Australia", "Czechoslovakia", "Sweden"), "Sports", "The United States holds the record for the most Fed Cup (now Billie Jean King Cup) victories with 18 titles, ahead of the Czech Republic and Australia."),
            zh = LocalizedContent("哪支女子网球队赢得了最多的联合会杯？", listOf("美国", "澳大利亚", "捷克斯洛伐克", "瑞典"), "体育", "美国队以18次夺冠保持着联合会杯（现比利·简·金杯）获胜次数最多的纪录，领先于捷克共和国和澳大利亚。"),
            es = LocalizedContent("¿Qué equipo de tenis femenino ha ganado más Copas Federación?", listOf("Estados Unidos", "Australia", "Checoslovaquia", "Suecia"), "Deportes", "Estados Unidos ostenta el récord de más victorias en la Fed Cup (ahora Billie Jean King Cup) con 18 títulos, por delante de la República Checa y Australia.")
        ),
        BilingualQuestion(
            id = 50426, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a créé 'Top Gun: Maverick'?", listOf("Joe Kosinski", "Tony Scott", "Martin Scorsese", "James Mangold"), "Cinéma", "Joe Kosinski a réalisé Top Gun: Maverick, sorti en 2022, succédant à Tony Scott qui avait mis en scène le premier opus en 1986."),
            en = LocalizedContent("Which director created 'Top Gun: Maverick'?", listOf("Joe Kosinski", "Tony Scott", "Martin Scorsese", "James Mangold"), "Cinema", "Joe Kosinski directed Top Gun: Maverick, released in 2022, succeeding Tony Scott who had directed the first film in 1986."),
            zh = LocalizedContent("哪位导演创作了《壮志凌云：独行侠》？", listOf("约瑟夫·科辛斯基", "托尼·斯科特", "马丁·斯科塞斯", "詹姆斯·曼高德"), "电影", "约瑟夫·科辛斯基执导了2022年上映的《壮志凌云：独行侠》，接替了1986年执导第一部的托尼·斯科特。"),
            es = LocalizedContent("¿Qué director creó 'Top Gun: Maverick'?", listOf("Joe Kosinski", "Tony Scott", "Martin Scorsese", "James Mangold"), "Cine", "Joe Kosinski dirigió Top Gun: Maverick, estrenada en 2022, sucediendo a Tony Scott que había dirigido la primera entrega en 1986.")
        ),
        BilingualQuestion(
            id = 50427, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le compositeur de 'Swan Lake'?", listOf("Tchaïkovski", "Delibes", "Prokofiev", "Stravinsky"), "Musique", "Tchaïkovski a composé 'Le Lac des cygnes' en 1875-1876 pour le Théâtre Bolchoï de Moscou. C'est l'un des ballets les plus célèbres du répertoire classique."),
            en = LocalizedContent("Who composed 'Swan Lake'?", listOf("Tchaikovsky", "Delibes", "Prokofiev", "Stravinsky"), "Music", "Tchaikovsky composed 'Swan Lake' in 1875-1876 for the Bolshoi Theatre in Moscow. It is one of the most famous ballets in the classical repertoire."),
            zh = LocalizedContent("谁创作了《天鹅湖》？", listOf("柴可夫斯基", "德利布", "普罗科菲耶夫", "斯特拉文斯基"), "音乐", "柴可夫斯基于1875-1876年为莫斯科大剧院创作了《天鹅湖》。它是古典剧目中最著名的芭蕾舞剧之一。"),
            es = LocalizedContent("¿Quién compuso 'El lago de los cisnes'?", listOf("Chaikovski", "Delibes", "Prokófiev", "Stravinski"), "Música", "Chaikovski compuso 'El lago de los cisnes' en 1875-1876 para el Teatro Bolshói de Moscú. Es uno de los ballets más famosos del repertorio clásico.")
        ),
        BilingualQuestion(
            id = 50428, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'année de la Chute de Jérusalem?", listOf("70 ap. J.-C.", "66 ap. J.-C.", "75 ap. J.-C.", "80 ap. J.-C."), "Histoire", "La chute de Jérusalem en 70 ap. J.-C. a eu lieu lors du siège mené par l'empereur romain Titus, aboutissant à la destruction du Second Temple."),
            en = LocalizedContent("What year was the Fall of Jerusalem?", listOf("70 AD", "66 AD", "75 AD", "80 AD"), "History", "The fall of Jerusalem in 70 AD occurred during the siege led by Roman emperor Titus, resulting in the destruction of the Second Temple."),
            zh = LocalizedContent("耶路撒冷陷落于哪一年？", listOf("公元70年", "公元66年", "公元75年", "公元80年"), "历史", "公元70年耶路撒冷陷落发生在罗马皇帝提图斯领导的围城期间，导致第二圣殿被毁。"),
            es = LocalizedContent("¿En qué año fue la caída de Jerusalén?", listOf("70 d.C.", "66 d.C.", "75 d.C.", "80 d.C."), "Historia", "La caída de Jerusalén en el año 70 d.C. ocurrió durante el asedio liderado por el emperador romano Tito, resultando en la destrucción del Segundo Templo.")
        ),
        BilingualQuestion(
            id = 50429, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand type de serpent?", listOf("Anaconda", "Python birman", "Boa constricteur", "Cobra royal"), "Science", "L'anaconda vert peut atteindre plus de 9 mètres et peser jusqu'à 250 kilos, ce qui en fait le serpent le plus lourd et massif du monde."),
            en = LocalizedContent("What is the largest type of snake?", listOf("Anaconda", "Burmese python", "Boa constrictor", "King cobra"), "Science", "The green anaconda can reach over 9 meters and weigh up to 250 kilos, making it the heaviest and most massive snake in the world."),
            zh = LocalizedContent("最大的蛇类是什么？", listOf("森蚺", "缅甸蟒", "红尾蚺", "眼镜王蛇"), "科学", "绿水蚺（森蚺）可长达9米以上，重达250公斤，是世界上最重、最庞大的蛇类。"),
            es = LocalizedContent("¿Cuál es el tipo de serpiente más grande?", listOf("Anaconda", "Pitón birmana", "Boa constrictora", "Cobra real"), "Ciencia", "La anaconda verde puede alcanzar más de 9 metros y pesar hasta 250 kilos, lo que la convierte en la serpiente más pesada y masiva del mundo.")
        ),
        BilingualQuestion(
            id = 50430, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand archipel du monde indien?", listOf("Maldives", "Seychelles", "Îles Andaman et Nicobar", "Lakshadweep"), "Géographie", "L'archipel des Andaman-et-Nicobar, situé dans le golfe du Bengale, est le plus vaste du monde indien avec plus de 500 îles. Il forme un territoire de l'Inde."),
            en = LocalizedContent("What is the largest archipelago in the Indian world?", listOf("Maldives", "Seychelles", "Andaman and Nicobar Islands", "Lakshadweep"), "Geography", "The Andaman and Nicobar archipelago, located in the Bay of Bengal, is the largest in the Indian world with over 500 islands. It forms a territory of India."),
            zh = LocalizedContent("印度洋地区最大的群岛是什么？", listOf("马尔代夫", "塞舌尔", "安达曼-尼科巴群岛", "拉克沙群岛"), "地理", "安达曼-尼科巴群岛位于孟加拉湾，拥有500多个岛屿，是印度洋地区最大的群岛，属于印度领土。"),
            es = LocalizedContent("¿Cuál es el archipiélago más grande del mundo indio?", listOf("Maldivas", "Seychelles", "Islas Andamán y Nicobar", "Laquedivas"), "Geografía", "El archipiélago de Andamán y Nicobar, situado en la bahía de Bengala, es el más grande del mundo indio con más de 500 islas. Forma un territorio de la India.")
        ),
        BilingualQuestion(
            id = 50431, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien système de notation musicale?", listOf("Notation grégorienne", "Notation arabe", "Notation chinoise", "Notation hindoue"), "Culture", "La notation grégorienne, apparue au IXe siècle, est le plus ancien système de notation musicale occidental encore utilisé, développé pour transcrire le chant liturgique de l'Église catholique."),
            en = LocalizedContent("What is the oldest musical notation system?", listOf("Gregorian notation", "Arabic notation", "Chinese notation", "Hindu notation"), "Culture", "Gregorian notation, appearing in the 9th century, is the oldest Western musical notation system still in use, developed to transcribe the liturgical chant of the Catholic Church."),
            zh = LocalizedContent("最古老的音乐记谱系统是什么？", listOf("格里高利记谱法", "阿拉伯记谱法", "中国记谱法", "印度记谱法"), "文化", "格里高利记谱法出现于9世纪，是仍在使用的西方最古老的音乐记谱系统，用于记录天主教会的礼仪圣歌。"),
            es = LocalizedContent("¿Cuál es el sistema de notación musical más antiguo?", listOf("Notación gregoriana", "Notación árabe", "Notación china", "Notación hindú"), "Cultura", "La notación gregoriana, aparecida en el siglo IX, es el sistema de notación musical occidental más antiguo aún en uso, desarrollado para transcribir el canto litúrgico de la Iglesia católica.")
        ),
        BilingualQuestion(
            id = 50432, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel joueur de hockey a remporté la Ligue nationale le plus de fois?", listOf("Wayne Gretzky", "Mario Lemieux", "Jaromir Jagr", "Bobby Orr"), "Sport", "Wayne Gretzky a remporté la Ligue nationale de hockey (LNH) à quatre reprises avec les Oilers d'Edmonton, un record pour le nombre de championnats remportés par un joueur."),
            en = LocalizedContent("Which hockey player has won the National League the most times?", listOf("Wayne Gretzky", "Mario Lemieux", "Jaromir Jagr", "Bobby Orr"), "Sports", "Wayne Gretzky won the National Hockey League (NHL) four times with the Edmonton Oilers, a record for the most championships won by a player."),
            zh = LocalizedContent("哪位冰球运动员赢得国家联盟次数最多？", listOf("韦恩·格雷茨基", "马里奥·勒米厄", "雅罗米尔·雅格尔", "博比·奥尔"), "体育", "韦恩·格雷茨基随埃德蒙顿油人队四次赢得国家冰球联盟（NHL）冠军，这是球员赢得冠军次数的纪录。"),
            es = LocalizedContent("¿Qué jugador de hockey ha ganado la Liga Nacional más veces?", listOf("Wayne Gretzky", "Mario Lemieux", "Jaromir Jagr", "Bobby Orr"), "Deportes", "Wayne Gretzky ganó la Liga Nacional de Hockey (NHL) cuatro veces con los Edmonton Oilers, un récord de campeonatos ganados por un jugador.")
        ),
        BilingualQuestion(
            id = 50433, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a créé 'The Farewell'?", listOf("Bong Joon-ho", "Lulu Wang", "Awkwafina", "John Cho"), "Cinéma", "Lulu Wang a réalisé 'The Farewell' en 2019, un film semi-autobiographique inspiré de sa propre expérience familiale."),
            en = LocalizedContent("Which director created 'The Farewell'?", listOf("Bong Joon-ho", "Lulu Wang", "Awkwafina", "John Cho"), "Cinema", "Lulu Wang directed 'The Farewell' in 2019, a semi-autobiographical film inspired by her own family experience."),
            zh = LocalizedContent("哪位导演创作了《别告诉她》？", listOf("奉俊昊", "王子逸", "奥卡菲娜", "约翰·赵"), "电影", "王子逸在2019年执导了《别告诉她》，这是一部半自传体电影，灵感来自她自己的家庭经历。"),
            es = LocalizedContent("¿Qué director creó 'The Farewell'?", listOf("Bong Joon-ho", "Lulu Wang", "Awkwafina", "John Cho"), "Cine", "Lulu Wang dirigió 'The Farewell' en 2019, una película semiautobiográfica inspirada en su propia experiencia familiar.")
        ),
        BilingualQuestion(
            id = 50434, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel musicien a créé 'Für Elise'?", listOf("Mozart", "Beethoven", "Bach", "Chopin"), "Musique", "Beethoven a composé 'Für Elise' en 1810, une de ses œuvres les plus célèbres pour piano, bien que la partition n'ait été publiée qu'après sa mort."),
            en = LocalizedContent("Which musician created 'Für Elise'?", listOf("Mozart", "Beethoven", "Bach", "Chopin"), "Music", "Beethoven composed 'Für Elise' in 1810, one of his most famous piano works, although the score was only published after his death."),
            zh = LocalizedContent("哪位音乐家创作了《致爱丽丝》？", listOf("莫扎特", "贝多芬", "巴赫", "肖邦"), "音乐", "贝多芬在1810年创作了《致爱丽丝》，这是他最著名的钢琴作品之一，尽管乐谱是在他去世后才出版的。"),
            es = LocalizedContent("¿Qué músico creó 'Para Elisa'?", listOf("Mozart", "Beethoven", "Bach", "Chopin"), "Música", "Beethoven compuso 'Para Elisa' en 1810, una de sus obras para piano más famosas, aunque la partitura no se publicó hasta después de su muerte.")
        ),
        BilingualQuestion(
            id = 50435, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'année de la Chute de Byzance?", listOf("1450", "1451", "1452", "1453"), "Histoire", "La chute de Constantinople aux mains des Ottomans en 1453 marque la fin de l'Empire byzantin et du Moyen Âge."),
            en = LocalizedContent("What is the year of the Fall of Byzantium?", listOf("1450", "1451", "1452", "1453"), "History", "The fall of Constantinople to the Ottomans in 1453 marks the end of the Byzantine Empire and the Middle Ages."),
            zh = LocalizedContent("拜占庭陷落是哪一年？", listOf("1450", "1451", "1452", "1453"), "历史", "1453年君士坦丁堡落入奥斯曼帝国之手，标志着拜占庭帝国和中世纪的结束。"),
            es = LocalizedContent("¿Cuál es el año de la Caída de Bizancio?", listOf("1450", "1451", "1452", "1453"), "Historia", "La caída de Constantinopla en manos de los otomanos en 1453 marca el fin del Imperio Bizantino y de la Edad Media.")
        ),
        BilingualQuestion(
            id = 50436, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand prédateur marin du monde?", listOf("Grand blanc", "Kraken", "Baleine épaulard", "Pieuvre géante"), "Science", "L'orque, aussi appelée épaulard, est le plus grand prédateur marin, se nourrissant de phoques, de poissons et même de grands cétacés."),
            en = LocalizedContent("What is the largest marine predator in the world?", listOf("Great white shark", "Kraken", "Killer whale", "Giant octopus"), "Science", "The orca, also known as the killer whale, is the largest marine predator, feeding on seals, fish, and even large cetaceans."),
            zh = LocalizedContent("世界上最大的海洋捕食者是什么？", listOf("大白鲨", "克拉肯", "虎鲸", "巨型章鱼"), "科学", "虎鲸，也称为杀人鲸，是最大的海洋捕食者，以海豹、鱼类甚至大型鲸类为食。"),
            es = LocalizedContent("¿Cuál es el mayor depredador marino del mundo?", listOf("Tiburón blanco", "Kraken", "Orca", "Pulpo gigante"), "Ciencia", "La orca, también conocida como ballena asesina, es el mayor depredador marino, alimentándose de focas, peces e incluso grandes cetáceos.")
        ),
        BilingualQuestion(
            id = 50437, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand île méditerranéenne?", listOf("Crète", "Chypre", "Sardaigne", "Sicile"), "Géographie", "La Sicile est la plus grande île de la mer Méditerranée, avec une superficie d'environ 25 700 km², surpassant la Sardaigne et Chypre."),
            en = LocalizedContent("What is the largest Mediterranean island?", listOf("Crete", "Cyprus", "Sardinia", "Sicily"), "Geography", "Sicily is the largest island in the Mediterranean Sea, with an area of about 25,700 km², surpassing Sardinia and Cyprus."),
            zh = LocalizedContent("地中海最大的岛屿是什么？", listOf("克里特岛", "塞浦路斯", "撒丁岛", "西西里岛"), "地理", "西西里岛是地中海最大的岛屿，面积约25,700平方公里，超过撒丁岛和塞浦路斯。"),
            es = LocalizedContent("¿Cuál es la isla mediterránea más grande?", listOf("Creta", "Chipre", "Cerdeña", "Sicilia"), "Geografía", "Sicilia es la isla más grande del mar Mediterráneo, con una superficie de aproximadamente 25.700 km², superando a Cerdeña y Chipre.")
        ),
        BilingualQuestion(
            id = 50438, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien traité musical écrit?", listOf("Traité de Guido d'Arezzo", "Traité de Zarlino", "Traité de Rameau", "Traité de Bach"), "Culture", "Le Traité de Guido d'Arezzo, rédigé au XIe siècle, est considéré comme le plus ancien traité musical complet connu, posant les bases du solfège moderne."),
            en = LocalizedContent("What is the oldest written musical treatise?", listOf("Treatise of Guido of Arezzo", "Treatise of Zarlino", "Treatise of Rameau", "Treatise of Bach"), "Culture", "The Treatise of Guido of Arezzo, written in the 11th century, is considered the oldest complete known musical treatise, laying the foundations of modern solfège."),
            zh = LocalizedContent("最古老的音乐论著是什么？", listOf("圭多·达雷佐的论著", "扎利诺的论著", "拉莫的论著", "巴赫的论著"), "文化", "圭多·达雷佐的论著写于11世纪，被认为是已知最完整的古老音乐论著，奠定了现代视唱练耳的基础。"),
            es = LocalizedContent("¿Cuál es el tratado musical escrito más antiguo?", listOf("Tratado de Guido de Arezzo", "Tratado de Zarlino", "Tratado de Rameau", "Tratado de Bach"), "Cultura", "El Tratado de Guido de Arezzo, escrito en el siglo XI, es considerado el tratado musical completo más antiguo conocido, sentando las bases del solfeo moderno.")
        ),
        BilingualQuestion(
            id = 50439, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel équipe de football américain a remporté le plus de Super Bowls?", listOf("Dallas Cowboys", "New England Patriots", "Pittsburgh Steelers", "Oakland Raiders"), "Sport", "Les Patriots de la Nouvelle-Angleterre ont remporté six Super Bowls, un record qu'ils partagent avec les Steelers de Pittsburgh."),
            en = LocalizedContent("Which American football team has won the most Super Bowls?", listOf("Dallas Cowboys", "New England Patriots", "Pittsburgh Steelers", "Oakland Raiders"), "Sports", "The New England Patriots have won six Super Bowls, a record they share with the Pittsburgh Steelers."),
            zh = LocalizedContent("哪支美式橄榄球队赢得超级碗次数最多？", listOf("达拉斯牛仔", "新英格兰爱国者", "匹兹堡钢人", "奥克兰突袭者"), "体育", "新英格兰爱国者队赢得了六次超级碗，与匹兹堡钢人队共享这一纪录。"),
            es = LocalizedContent("¿Qué equipo de fútbol americano ha ganado más Super Bowls?", listOf("Dallas Cowboys", "New England Patriots", "Pittsburgh Steelers", "Oakland Raiders"), "Deportes", "Los New England Patriots han ganado seis Super Bowls, un récord que comparten con los Pittsburgh Steelers.")
        ),
        BilingualQuestion(
            id = 50440, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a créé 'Eternals'?", listOf("Chloé Zhao", "Jane Campion", "Cary Joji Fukunaga", "Taika Waititi"), "Cinéma", "Chloé Zhao a réalisé 'Eternals' (2021) pour Marvel Studios, devenant la première réalisatrice asiatique à remporter l'Oscar du meilleur réalisateur pour 'Nomadland' (2020)."),
            en = LocalizedContent("Which director created 'Eternals'?", listOf("Chloé Zhao", "Jane Campion", "Cary Joji Fukunaga", "Taika Waititi"), "Cinema", "Chloé Zhao directed 'Eternals' (2021) for Marvel Studios, becoming the first Asian woman to win the Academy Award for Best Director for 'Nomadland' (2020)."),
            zh = LocalizedContent("哪位导演创作了《永恒族》？", listOf("赵婷", "简·坎皮恩", "凯瑞·福永", "塔伊加·维迪提"), "电影", "赵婷为漫威影业执导了《永恒族》（2021年），她凭借《无依之地》（2020年）成为首位获得奥斯卡最佳导演奖的亚洲女性。"),
            es = LocalizedContent("¿Qué director creó 'Eternals'?", listOf("Chloé Zhao", "Jane Campion", "Cary Joji Fukunaga", "Taika Waititi"), "Cine", "Chloé Zhao dirigió 'Eternals' (2021) para Marvel Studios, convirtiéndose en la primera directora asiática en ganar el Premio de la Academia al Mejor Director por 'Nomadland' (2020).")
        ),
        BilingualQuestion(
            id = 50441, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien style de blues?", listOf("Delta blues", "Texas blues", "Chicago blues", "Kansas City blues"), "Musique", "Le Delta blues est considéré comme le plus ancien style de blues, né dans le delta du Mississippi au début du XXe siècle, avec des pionniers comme Robert Johnson."),
            en = LocalizedContent("What is the oldest style of blues?", listOf("Delta blues", "Texas blues", "Chicago blues", "Kansas City blues"), "Music", "Delta blues is considered the oldest style of blues, originating in the Mississippi Delta in the early 20th century, with pioneers like Robert Johnson."),
            zh = LocalizedContent("最古老的蓝调风格是什么？", listOf("三角洲蓝调", "得克萨斯蓝调", "芝加哥蓝调", "堪萨斯城蓝调"), "音乐", "三角洲蓝调被认为是最古老的蓝调风格，起源于20世纪初的密西西比三角洲，代表人物有罗伯特·约翰逊。"),
            es = LocalizedContent("¿Cuál es el estilo más antiguo de blues?", listOf("Delta blues", "Texas blues", "Chicago blues", "Kansas City blues"), "Música", "El Delta blues es considerado el estilo más antiguo de blues, originado en el delta del Mississippi a principios del siglo XX, con pioneros como Robert Johnson.")
        ),
    )

    private fun part6(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 50442, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'année de la Prise de la Bastille?", listOf("1788", "1789", "1790", "1791"), "Histoire", "La prise de la Bastille, le 14 juillet 1789, marque le début de la Révolution française. Cet événement symbolise la fin de l'absolutisme et le soulèvement du peuple parisien contre l'Ancien Régime."),
            en = LocalizedContent("What year was the Storming of the Bastille?", listOf("1788", "1789", "1790", "1791"), "History", "The storming of the Bastille on July 14, 1789, marks the beginning of the French Revolution. This event symbolizes the end of absolutism and the uprising of the Parisian people against the Ancien Régime."),
            zh = LocalizedContent("攻占巴士底狱发生在哪一年？", listOf("1788", "1789", "1790", "1791"), "历史", "1789年7月14日攻占巴士底狱标志着法国大革命的开始。这一事件象征着绝对君主制的终结和巴黎人民对旧制度的起义。"),
            es = LocalizedContent("¿En qué año fue la Toma de la Bastilla?", listOf("1788", "1789", "1790", "1791"), "Historia", "La toma de la Bastilla el 14 de julio de 1789 marca el inicio de la Revolución Francesa. Este evento simboliza el fin del absolutismo y el levantamiento del pueblo parisino contra el Antiguo Régimen.")
        ),
        BilingualQuestion(
            id = 50443, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus rapide type de cellule?", listOf("Neurone", "Globule rouge", "Spermatozoïde", "Gamète"), "Science", "Le spermatozoïde est la cellule la plus rapide du corps humain, capable de se déplacer à environ 1 à 4 millimètres par minute grâce à son flagelle."),
            en = LocalizedContent("What is the fastest type of cell?", listOf("Neuron", "Red blood cell", "Sperm cell", "Gamete"), "Science", "The sperm cell is the fastest cell in the human body, capable of moving at about 1 to 4 millimeters per minute thanks to its flagellum."),
            zh = LocalizedContent("哪种细胞速度最快？", listOf("神经元", "红细胞", "精子", "配子"), "科学", "精子是人体中速度最快的细胞，凭借其鞭毛能够以每分钟约1到4毫米的速度移动。"),
            es = LocalizedContent("¿Cuál es el tipo de célula más rápido?", listOf("Neurona", "Glóbulo rojo", "Espermatozoide", "Gameto"), "Ciencia", "El espermatozoide es la célula más rápida del cuerpo humano, capaz de moverse a aproximadamente 1 a 4 milímetros por minuto gracias a su flagelo.")
        ),
        BilingualQuestion(
            id = 50444, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus long fleuve d'Asie?", listOf("Mékong", "Yangtsé", "Brahmapoutre", "Fleuve Jaune"), "Géographie", "Le Yangtsé, long de 6 300 km, traverse la Chine du Tibet à Shanghai. Il est le plus long fleuve d'Asie et le troisième du monde."),
            en = LocalizedContent("What is the longest river in Asia?", listOf("Mekong", "Yangtze", "Brahmaputra", "Yellow River"), "Geography", "The Yangtze, 6,300 km long, flows through China from Tibet to Shanghai. It is the longest river in Asia and the third longest in the world."),
            zh = LocalizedContent("亚洲最长的河流是什么？", listOf("湄公河", "长江", "雅鲁藏布江", "黄河"), "地理", "长江全长6300公里，从西藏流经中国至上海。它是亚洲最长的河流，世界第三长。"),
            es = LocalizedContent("¿Cuál es el río más largo de Asia?", listOf("Mekong", "Yangtsé", "Brahmaputra", "Río Amarillo"), "Geografía", "El Yangtsé, de 6.300 km de longitud, atraviesa China desde el Tíbet hasta Shanghái. Es el río más largo de Asia y el tercero del mundo.")
        ),
        BilingualQuestion(
            id = 50445, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus ancien poème épique connu?", listOf("Iliade", "Odyssée", "Épopée de Gilgamesh", "Ramayana"), "Culture", "L'Épopée de Gilgamesh, écrite en sumérien sur des tablettes d'argile, date d'environ 2100 avant J.-C., ce qui en fait le plus ancien poème épique connu."),
            en = LocalizedContent("What is the oldest known epic poem?", listOf("Iliad", "Odyssey", "Epic of Gilgamesh", "Ramayana"), "Culture", "The Epic of Gilgamesh, written in Sumerian on clay tablets, dates from around 2100 BC, making it the oldest known epic poem."),
            zh = LocalizedContent("已知最古老的史诗是什么？", listOf("《伊利亚特》", "《奥德赛》", "《吉尔伽美什史诗》", "《罗摩衍那》"), "文化", "《吉尔伽美什史诗》用苏美尔语写在泥板上，可追溯到约公元前2100年，是已知最古老的史诗。"),
            es = LocalizedContent("¿Cuál es el poema épico más antiguo conocido?", listOf("Ilíada", "Odisea", "Epopea de Gilgamesh", "Ramayana"), "Cultura", "La Epopeya de Gilgamesh, escrita en sumerio en tablillas de arcilla, data de alrededor del 2100 a.C., lo que la convierte en el poema épico más antiguo conocido.")
        ),
        BilingualQuestion(
            id = 50446, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel équipe de baseball remporté la Série mondiale le plus de fois?", listOf("New York Yankess", "Boston Red Sox", "Los Angeles Dodgers", "St. Louis Cardinals"), "Sport", "Les New York Yankees détiennent le record du plus grand nombre de victoires en Série mondiale, avec 27 titres remportés, loin devant les Cardinals de Saint-Louis (11 titres)."),
            en = LocalizedContent("Which baseball team has won the World Series the most times?", listOf("New York Yankees", "Boston Red Sox", "Los Angeles Dodgers", "St. Louis Cardinals"), "Sports", "The New York Yankees hold the record for the most World Series wins, with 27 titles, far ahead of the St. Louis Cardinals (11 titles)."),
            zh = LocalizedContent("哪支棒球队赢得世界大赛次数最多？", listOf("纽约洋基队", "波士顿红袜队", "洛杉矶道奇队", "圣路易斯红雀队"), "体育", "纽约洋基队保持着世界大赛获胜次数最多的纪录，共27次夺冠，远超圣路易斯红雀队（11次）。"),
            es = LocalizedContent("¿Qué equipo de béisbol ha ganado la Serie Mundial más veces?", listOf("New York Yankees", "Boston Red Sox", "Los Angeles Dodgers", "St. Louis Cardinals"), "Deportes", "Los New York Yankees tienen el récord de más victorias en la Serie Mundial, con 27 títulos, muy por delante de los St. Louis Cardinals (11 títulos).")
        ),
        BilingualQuestion(
            id = 50447, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a créé 'Everything Everywhere All at Once'?", listOf("Bong Joon-ho", "The Daniels", "Jordan Peele", "Denis Villeneuve"), "Cinéma", "Le film a été coréalisé par Daniel Kwan et Daniel Scheinert, connus professionnellement sous le nom de The Daniels."),
            en = LocalizedContent("Which director created 'Everything Everywhere All at Once'?", listOf("Bong Joon-ho", "The Daniels", "Jordan Peele", "Denis Villeneuve"), "Cinema", "The film was co-directed by Daniel Kwan and Daniel Scheinert, known professionally as The Daniels."),
            zh = LocalizedContent("哪位导演创作了《瞬息全宇宙》？", listOf("奉俊昊", "丹尼尔组合", "乔丹·皮尔", "丹尼斯·维伦纽瓦"), "电影", "这部电影由关家永和丹尼尔·施纳特联合执导，他们以“丹尼尔组合”的专业名称闻名。"),
            es = LocalizedContent("¿Qué director creó 'Todo a la vez en todas partes'?", listOf("Bong Joon-ho", "The Daniels", "Jordan Peele", "Denis Villeneuve"), "Cine", "La película fue codirigida por Daniel Kwan y Daniel Scheinert, conocidos profesionalmente como The Daniels.")
        ),
        BilingualQuestion(
            id = 50448, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien style de musique classique?", listOf("Baroque", "Renaissance", "Médiéval", "Antique"), "Musique", "La musique médiévale, composée entre le IXe et le XVe siècle, est la plus ancienne période de la musique classique occidentale, avec des formes comme le chant grégorien."),
            en = LocalizedContent("What is the oldest style of classical music?", listOf("Baroque", "Renaissance", "Medieval", "Ancient"), "Music", "Medieval music, composed between the 9th and 15th centuries, is the oldest period of Western classical music, with forms like Gregorian chant."),
            zh = LocalizedContent("最古老的古典音乐风格是什么？", listOf("巴洛克", "文艺复兴", "中世纪", "古代"), "音乐", "中世纪音乐创作于9至15世纪之间，是西方古典音乐最古老的时期，包括格里高利圣咏等形式。"),
            es = LocalizedContent("¿Cuál es el estilo más antiguo de música clásica?", listOf("Barroco", "Renacimiento", "Medieval", "Antiguo"), "Música", "La música medieval, compuesta entre los siglos IX y XV, es el período más antiguo de la música clásica occidental, con formas como el canto gregoriano.")
        ),
        BilingualQuestion(
            id = 50449, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'année du Traité de Versailles?", listOf("1918", "1919", "1920", "1921"), "Histoire", "Le Traité de Versailles, signé le 28 juin 1919, mit officiellement fin à la Première Guerre mondiale entre les Alliés et l'Allemagne."),
            en = LocalizedContent("What year was the Treaty of Versailles?", listOf("1918", "1919", "1920", "1921"), "History", "The Treaty of Versailles, signed on June 28, 1919, officially ended World War I between the Allies and Germany."),
            zh = LocalizedContent("《凡尔赛条约》签署于哪一年？", listOf("1918", "1919", "1920", "1921"), "历史", "《凡尔赛条约》于1919年6月28日签署，正式结束了协约国与德国之间的第一次世界大战。"),
            es = LocalizedContent("¿En qué año fue el Tratado de Versalles?", listOf("1918", "1919", "1920", "1921"), "Historia", "El Tratado de Versalles, firmado el 28 de junio de 1919, puso fin oficialmente a la Primera Guerra Mundial entre los Aliados y Alemania.")
        ),
        BilingualQuestion(
            id = 50450, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand type de chouette?", listOf("Chouette hulotte", "Chouette géante", "Chouette Harfang", "Chouette lapone"), "Science", "La chouette lapone est la plus grande espèce de chouette, avec une envergure pouvant atteindre 1,5 mètre, ce qui la distingue des autres rapaces nocturnes par sa taille imposante."),
            en = LocalizedContent("What is the largest type of owl?", listOf("Tawny owl", "Great owl", "Snowy owl", "Great grey owl"), "Science", "The great grey owl is the largest species of owl, with a wingspan that can reach 1.5 meters, distinguishing it from other nocturnal raptors by its imposing size."),
            zh = LocalizedContent("哪种猫头鹰体型最大？", listOf("灰林鸮", "巨鸮", "雪鸮", "乌林鸮"), "科学", "乌林鸮是最大的猫头鹰物种，翼展可达1.5米，以其庞大的体型区别于其他夜间猛禽。"),
            es = LocalizedContent("¿Cuál es el tipo de búho más grande?", listOf("Cárabo común", "Búho gigante", "Búho nival", "Cárabo lapón"), "Ciencia", "El cárabo lapón es la especie de búho más grande, con una envergadura que puede alcanzar 1,5 metros, distinguiéndose de otras rapaces nocturnas por su tamaño imponente.")
        ),
        BilingualQuestion(
            id = 50451, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand château du monde?", listOf("Château de Neuschwanstein", "Château de Malbork", "Château du Kremlin", "Château de Versailles"), "Géographie", "Le château de Malbork, en Pologne, est le plus grand château du monde en termes de superficie, construit par les chevaliers teutoniques au XIIIe siècle."),
            en = LocalizedContent("What is the largest castle in the world?", listOf("Neuschwanstein Castle", "Malbork Castle", "Kremlin Castle", "Palace of Versailles"), "Geography", "Malbork Castle in Poland is the largest castle in the world by area, built by the Teutonic Knights in the 13th century."),
            zh = LocalizedContent("世界上最大的城堡是什么？", listOf("新天鹅堡", "马尔堡城堡", "克里姆林宫", "凡尔赛宫"), "地理", "波兰的马尔堡城堡是世界上面积最大的城堡，由条顿骑士团在13世纪建造。"),
            es = LocalizedContent("¿Cuál es el castillo más grande del mundo?", listOf("Castillo de Neuschwanstein", "Castillo de Malbork", "Castillo del Kremlin", "Palacio de Versalles"), "Geografía", "El castillo de Malbork, en Polonia, es el castillo más grande del mundo en términos de superficie, construido por los caballeros teutónicos en el siglo XIII.")
        ),
        BilingualQuestion(
            id = 50452, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien sport olympique documenté?", listOf("Pentathlon", "Course à pied", "Lutte", "Boxe"), "Culture", "La course à pied est le plus ancien sport olympique documenté car elle était la seule épreuve des premiers Jeux olympiques antiques en 776 avant J.-C., où l'on courait sur un stade (environ 192 mètres)."),
            en = LocalizedContent("What is the oldest documented Olympic sport?", listOf("Pentathlon", "Foot race", "Wrestling", "Boxing"), "Culture", "The foot race is the oldest documented Olympic sport because it was the only event at the first ancient Olympic Games in 776 BC, where athletes ran one stadion (about 192 meters)."),
            zh = LocalizedContent("有记载的最古老的奥林匹克运动是什么？", listOf("五项全能", "赛跑", "摔跤", "拳击"), "文化", "赛跑是有记载的最古老的奥林匹克运动，因为它是公元前776年首届古代奥运会的唯一项目，运动员跑一个斯塔迪昂（约192米）。"),
            es = LocalizedContent("¿Cuál es el deporte olímpico documentado más antiguo?", listOf("Pentatlón", "Carrera a pie", "Lucha", "Boxeo"), "Cultura", "La carrera a pie es el deporte olímpico documentado más antiguo, ya que fue la única prueba en los primeros Juegos Olímpicos antiguos en el 776 a.C., donde se corría un estadio (unos 192 metros).")
        ),
        BilingualQuestion(
            id = 50453, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel équipe de basket-ball a remporté le plus de championnats NBA?", listOf("Los Angeles Lakers", "Boston Celtics", "Chicago Bulls", "Golden State Warriors"), "Sport", "Les Celtics de Boston détiennent le record avec 18 titres NBA, dont une série de huit victoires consécutives entre 1959 et 1966."),
            en = LocalizedContent("Which basketball team has won the most NBA championships?", listOf("Los Angeles Lakers", "Boston Celtics", "Chicago Bulls", "Golden State Warriors"), "Sports", "The Boston Celtics hold the record with 18 NBA titles, including a streak of eight consecutive wins between 1959 and 1966."),
            zh = LocalizedContent("哪支篮球队赢得了最多的NBA总冠军？", listOf("洛杉矶湖人队", "波士顿凯尔特人队", "芝加哥公牛队", "金州勇士队"), "体育", "波士顿凯尔特人队以18个NBA总冠军保持纪录，其中包括1959年至1966年间连续八次夺冠。"),
            es = LocalizedContent("¿Qué equipo de baloncesto ha ganado más campeonatos de la NBA?", listOf("Los Angeles Lakers", "Boston Celtics", "Chicago Bulls", "Golden State Warriors"), "Deportes", "Los Boston Celtics tienen el récord con 18 títulos de la NBA, incluyendo una racha de ocho victorias consecutivas entre 1959 y 1966.")
        ),
        BilingualQuestion(
            id = 50454, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a créé 'Past Lives'?", listOf("Celine Song", "Barry Jenkins", "Jane Campion", "Kelly Reichardt"), "Cinéma", "Celine Song a écrit et réalisé 'Past Lives' pour son premier long métrage, sorti en 2023."),
            en = LocalizedContent("Which director created 'Past Lives'?", listOf("Celine Song", "Barry Jenkins", "Jane Campion", "Kelly Reichardt"), "Cinema", "Celine Song wrote and directed 'Past Lives' as her feature film debut, released in 2023."),
            zh = LocalizedContent("哪位导演创作了《过往人生》？", listOf("席琳·宋", "巴里·詹金斯", "简·坎皮恩", "凯莉·雷查德"), "电影", "席琳·宋编剧并执导了《过往人生》，这是她的长片处女作，于2023年上映。"),
            es = LocalizedContent("¿Qué director creó 'Past Lives'?", listOf("Celine Song", "Barry Jenkins", "Jane Campion", "Kelly Reichardt"), "Cine", "Celine Song escribió y dirigió 'Past Lives' como su debut cinematográfico, estrenada en 2023.")
        ),
        BilingualQuestion(
            id = 50455, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur a écrit 'Gymnopédie'?", listOf("Satie", "Debussy", "Ravel", "Elte"), "Musique", "Erik Satie compose les trois Gymnopédies pour piano entre 1888 et 1895, des pièces au caractère lent et mélancolique inspirées de la Grèce antique."),
            en = LocalizedContent("Which composer wrote 'Gymnopédie'?", listOf("Satie", "Debussy", "Ravel", "Elte"), "Music", "Erik Satie composed the three Gymnopédies for piano between 1888 and 1895, pieces with a slow and melancholic character inspired by ancient Greece."),
            zh = LocalizedContent("哪位作曲家创作了《裸体歌舞》？", listOf("萨蒂", "德彪西", "拉威尔", "埃尔泰"), "音乐", "埃里克·萨蒂在1888年至1895年间创作了三首钢琴《裸体歌舞》，这些作品节奏缓慢、忧郁，灵感来自古希腊。"),
            es = LocalizedContent("¿Qué compositor escribió 'Gymnopédie'?", listOf("Satie", "Debussy", "Ravel", "Elte"), "Musica", "Erik Satie compuso las tres Gymnopédies para piano entre 1888 y 1895, piezas de carácter lento y melancólico inspiradas en la antigua Grecia.")
        ),
        BilingualQuestion(
            id = 50456, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'année du début de la Révolution française?", listOf("1787", "1788", "1789", "1790"), "Histoire", "Les États généraux convoqués en mai 1789 aboutissent à la prise de la Bastille le 14 juillet, marquant le début de la Révolution française."),
            en = LocalizedContent("What year did the French Revolution begin?", listOf("1787", "1788", "1789", "1790"), "History", "The Estates-General convened in May 1789 led to the storming of the Bastille on July 14, marking the beginning of the French Revolution."),
            zh = LocalizedContent("法国大革命始于哪一年？", listOf("1787年", "1788年", "1789年", "1790年"), "历史", "1789年5月召开的三级会议导致了7月14日攻占巴士底狱，标志着法国大革命的开始。"),
            es = LocalizedContent("¿En qué año comenzó la Revolución Francesa?", listOf("1787", "1788", "1789", "1790"), "Historia", "Los Estados Generales convocados en mayo de 1789 llevaron a la toma de la Bastilla el 14 de julio, marcando el inicio de la Revolución Francesa.")
        ),
        BilingualQuestion(
            id = 50457, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand rongeur du monde?", listOf("Castor", "Ragondin", "Capybara", "Porc-épic"), "Science", "Le capybara, originaire d'Amérique du Sud, peut peser jusqu'à 65 kg et mesurer 1,3 mètre de long, ce qui en fait le plus grand rongeur vivant."),
            en = LocalizedContent("What is the largest rodent in the world?", listOf("Beaver", "Coypu", "Capybara", "Porcupine"), "Science", "The capybara, native to South America, can weigh up to 65 kg and measure 1.3 meters in length, making it the largest living rodent."),
            zh = LocalizedContent("世界上最大的啮齿动物是什么？", listOf("河狸", "河鼠", "水豚", "豪猪"), "科学", "水豚原产于南美洲，体重可达65公斤，体长可达1.3米，是现存最大的啮齿动物。"),
            es = LocalizedContent("¿Cuál es el roedor más grande del mundo?", listOf("Castor", "Coipo", "Capibara", "Puercoespín"), "Ciencia", "El capibara, originario de Sudamérica, puede pesar hasta 65 kg y medir 1,3 metros de largo, lo que lo convierte en el roedor vivo más grande.")
        ),
        BilingualQuestion(
            id = 50458, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand gratte-ciel du monde?", listOf("Burj Khalifa", "Makkah Royal Clock Tower", "Shanghai Tower", "Abraj Al-Bait Clock Tower"), "Géographie", "Le Burj Khalifa à Dubaï mesure 828 mètres, dépassant tous les autres gratte-ciel depuis son inauguration en 2010."),
            en = LocalizedContent("What is the tallest skyscraper in the world?", listOf("Burj Khalifa", "Makkah Royal Clock Tower", "Shanghai Tower", "Abraj Al-Bait Clock Tower"), "Geography", "The Burj Khalifa in Dubai stands at 828 meters, surpassing all other skyscrapers since its inauguration in 2010."),
            zh = LocalizedContent("世界上最高的摩天大楼是什么？", listOf("哈利法塔", "麦加皇家钟塔饭店", "上海中心大厦", "阿布拉吉·阿尔拜特钟楼"), "地理", "迪拜的哈利法塔高828米，自2010年落成以来超过了所有其他摩天大楼。"),
            es = LocalizedContent("¿Cuál es el rascacielos más alto del mundo?", listOf("Burj Khalifa", "Makkah Royal Clock Tower", "Shanghai Tower", "Abraj Al-Bait Clock Tower"), "Geografia", "El Burj Khalifa en Dubái mide 828 metros, superando a todos los demás rascacielos desde su inauguración en 2010.")
        ),
        BilingualQuestion(
            id = 50459, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien art du combat du monde?", listOf("Lutte", "Boxe", "Kung Fu", "Judo"), "Culture", "Des représentations de lutte ont été découvertes dans des peintures rupestres vieilles de plus de 15 000 ans, ce qui en fait la plus ancienne forme de combat codifiée connue."),
            en = LocalizedContent("What is the oldest martial art in the world?", listOf("Wrestling", "Boxing", "Kung Fu", "Judo"), "Culture", "Depictions of wrestling have been found in cave paintings over 15,000 years old, making it the oldest known codified form of combat."),
            zh = LocalizedContent("世界上最古老的武术是什么？", listOf("摔跤", "拳击", "功夫", "柔道"), "文化", "在超过15000年前的洞穴壁画中发现了摔跤的描绘，使其成为已知最古老的规范化格斗形式。"),
            es = LocalizedContent("¿Cuál es el arte marcial más antiguo del mundo?", listOf("Lucha", "Boxeo", "Kung Fu", "Judo"), "Cultura", "Se han encontrado representaciones de lucha en pinturas rupestres de más de 15.000 años de antigüedad, lo que la convierte en la forma de combate codificada más antigua conocida.")
        ),
        BilingualQuestion(
            id = 50460, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel coureur d'endurance a remporté le plus d'ultras marathons?", listOf("Scott Jurek", "Yiannis Kouros", "Mirna Valerio", "Eliud Kipchoge"), "Sport", "Yiannis Kouros, coureur grec d'ultra-endurance, détient le record du plus grand nombre de victoires en ultras marathons, avec plus de 70 succès sur des distances extrêmes."),
            en = LocalizedContent("Which endurance runner has won the most ultramarathons?", listOf("Scott Jurek", "Yiannis Kouros", "Mirna Valerio", "Eliud Kipchoge"), "Sports", "Yiannis Kouros, a Greek ultra-endurance runner, holds the record for the most ultramarathon victories, with over 70 wins on extreme distances."),
            zh = LocalizedContent("哪位耐力跑运动员赢得了最多的超级马拉松？", listOf("斯科特·尤雷克", "扬尼斯·库罗斯", "米尔娜·瓦莱里奥", "埃利乌德·基普乔格"), "体育", "希腊超级耐力跑运动员扬尼斯·库罗斯保持着超级马拉松胜利次数最多的纪录，在极端距离上赢得了超过70场比赛。"),
            es = LocalizedContent("¿Qué corredor de resistencia ha ganado más ultramaratones?", listOf("Scott Jurek", "Yiannis Kouros", "Mirna Valerio", "Eliud Kipchoge"), "Deportes", "Yiannis Kouros, corredor griego de ultraresistencia, tiene el récord de más victorias en ultramaratones, con más de 70 triunfos en distancias extremas.")
        ),
        BilingualQuestion(
            id = 50461, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a créé 'All of Us Strangers'?", listOf("Andrew Haigh", "Bradley Cooper", "Adrian Lyne", "Barry Jenkins"), "Cinéma", "Andrew Haigh a écrit et réalisé ce drame fantastique sorti en 2023, adapté du roman japonais *Strangers* de Taichi Yamada."),
            en = LocalizedContent("Which director created 'All of Us Strangers'?", listOf("Andrew Haigh", "Bradley Cooper", "Adrian Lyne", "Barry Jenkins"), "Cinema", "Andrew Haigh wrote and directed this fantasy drama released in 2023, adapted from the Japanese novel *Strangers* by Taichi Yamada."),
            zh = LocalizedContent("哪位导演创作了《我们都是陌生人》？", listOf("安德鲁·海格", "布莱德利·库珀", "阿德里安·莱恩", "巴里·詹金斯"), "电影", "安德鲁·海格编剧并执导了这部2023年上映的奇幻剧情片，改编自山田太一的日本小说《陌生人》。"),
            es = LocalizedContent("¿Qué director creó 'All of Us Strangers'?", listOf("Andrew Haigh", "Bradley Cooper", "Adrian Lyne", "Barry Jenkins"), "Cine", "Andrew Haigh escribió y dirigió este drama fantástico estrenado en 2023, adaptado de la novela japonesa *Strangers* de Taichi Yamada.")
        ),
        BilingualQuestion(
            id = 50462, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien style de jazz?", listOf("Bebop", "Cool jazz", "New Orleans jazz", "Free jazz"), "Musique", "Le New Orleans jazz, né au début du XXe siècle à La Nouvelle-Orléans, est considéré comme le premier style de jazz, combinant ragtime, blues et fanfares."),
            en = LocalizedContent("What is the oldest style of jazz?", listOf("Bebop", "Cool jazz", "New Orleans jazz", "Free jazz"), "Music", "New Orleans jazz, born in the early 20th century in New Orleans, is considered the first style of jazz, combining ragtime, blues, and brass bands."),
            zh = LocalizedContent("最古老的爵士乐风格是什么？", listOf("比波普", "冷爵士", "新奥尔良爵士", "自由爵士"), "音乐", "新奥尔良爵士诞生于20世纪初的新奥尔良，融合了拉格泰姆、布鲁斯和铜管乐队，被认为是第一种爵士乐风格。"),
            es = LocalizedContent("¿Cuál es el estilo de jazz más antiguo?", listOf("Bebop", "Cool jazz", "New Orleans jazz", "Free jazz"), "Musica", "El New Orleans jazz, nacido a principios del siglo XX en Nueva Orleans, se considera el primer estilo de jazz, combinando ragtime, blues y bandas de metales.")
        ),
        BilingualQuestion(
            id = 50463, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'année de la Signature de la Déclaration des Droits de l'Homme?", listOf("1789", "1790", "1791", "1792"), "Histoire", "La Déclaration des Droits de l'Homme et du Citoyen a été adoptée le 26 août 1789, mais sa signature officielle par le roi Louis XVI a eu lieu en 1790."),
            en = LocalizedContent("What year was the Declaration of the Rights of Man signed?", listOf("1789", "1790", "1791", "1792"), "History", "The Declaration of the Rights of Man and of the Citizen was adopted on August 26, 1789, but its official signing by King Louis XVI took place in 1790."),
            zh = LocalizedContent("《人权宣言》签署于哪一年？", listOf("1789", "1790", "1791", "1792"), "历史", "《人权和公民权宣言》于1789年8月26日通过，但国王路易十六正式签署是在1790年。"),
            es = LocalizedContent("¿En qué año se firmó la Declaración de los Derechos del Hombre?", listOf("1789", "1790", "1791", "1792"), "Historia", "La Declaración de los Derechos del Hombre y del Ciudadano fue adoptada el 26 de agosto de 1789, pero su firma oficial por el rey Luis XVI tuvo lugar en 1790.")
        ),
        BilingualQuestion(
            id = 50464, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand amphibien du monde?", listOf("Salamandre géante", "Grenouille Goliath", "Triton crêté", "Sirène"), "Science", "La salamandre géante de Chine peut mesurer jusqu'à 1,8 mètre de long, ce qui en fait le plus grand amphibien connu."),
            en = LocalizedContent("What is the largest amphibian in the world?", listOf("Giant salamander", "Goliath frog", "Great crested newt", "Siren"), "Science", "The Chinese giant salamander can grow up to 1.8 meters long, making it the largest known amphibian."),
            zh = LocalizedContent("世界上最大的两栖动物是什么？", listOf("大鲵", "巨蛙", "冠蝾螈", "鳗螈"), "科学", "中国大鲵可长达1.8米，是已知最大的两栖动物。"),
            es = LocalizedContent("¿Cuál es el anfibio más grande del mundo?", listOf("Salamandra gigante", "Rana Goliat", "Tritón crestado", "Sirena"), "Ciencia", "La salamandra gigante china puede medir hasta 1,8 metros de largo, lo que la convierte en el anfibio más grande conocido.")
        ),
        BilingualQuestion(
            id = 50465, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac souterrain documenté?", listOf("Lac Vivi", "Lac d'Angelsea", "Lac Luna", "Lac Atacama"), "Géographie", "Le lac Vivi, situé en Thaïlande dans la grotte de Tham Luang, est reconnu comme le plus grand lac souterrain documenté au monde."),
            en = LocalizedContent("What is the largest documented underground lake?", listOf("Lake Vivi", "Angelsea Lake", "Lake Luna", "Atacama Lake"), "Geography", "Lake Vivi, located in Thailand's Tham Luang cave, is recognized as the largest documented underground lake in the world."),
            zh = LocalizedContent("有记载的最大地下湖是什么？", listOf("薇薇湖", "安格尔西湖", "月神湖", "阿塔卡马湖"), "地理", "位于泰国Tham Luang洞穴的薇薇湖被公认为世界上有记载的最大地下湖。"),
            es = LocalizedContent("¿Cuál es el lago subterráneo documentado más grande?", listOf("Lago Vivi", "Lago de Angelsea", "Lago Luna", "Lago Atacama"), "Geografia", "El lago Vivi, situado en la cueva Tham Luang en Tailandia, es reconocido como el lago subterráneo documentado más grande del mundo.")
        ),
        BilingualQuestion(
            id = 50466, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien instrument à cordes?", listOf("Harpe", "Lyre", "Qanun", "Sitar"), "Culture", "La lyre est considérée comme le plus ancien instrument à cordes connu, utilisée dès l'Antiquité en Mésopotamie et en Grèce antique, vers 3000 avant J.-C."),
            en = LocalizedContent("What is the oldest string instrument?", listOf("Harp", "Lyre", "Qanun", "Sitar"), "Culture", "The lyre is considered the oldest known string instrument, used since antiquity in Mesopotamia and ancient Greece, around 3000 BC."),
            zh = LocalizedContent("最古老的弦乐器是什么？", listOf("竖琴", "里拉琴", "卡农琴", "西塔琴"), "文化", "里拉琴被认为是最古老的已知弦乐器，早在公元前3000年左右的美索不达米亚和古希腊就已使用。"),
            es = LocalizedContent("¿Cuál es el instrumento de cuerda más antiguo?", listOf("Arpa", "Lira", "Qanun", "Sitar"), "Cultura", "La lira se considera el instrumento de cuerda más antiguo conocido, utilizado desde la antigüedad en Mesopotamia y la Grecia antigua, alrededor del 3000 a.C.")
        ),
        BilingualQuestion(
            id = 50467, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel équipe de tennis a remporté la Coupe Davis le plus de fois?", listOf("Australie", "Suède", "France", "États-Unis"), "Sport", "Les États-Unis détiennent le record du nombre de victoires en Coupe Davis avec 32 titres, loin devant l'Australie (28) et la France (10)."),
            en = LocalizedContent("Which tennis team has won the Davis Cup the most times?", listOf("Australia", "Sweden", "France", "United States"), "Sports", "The United States holds the record for the most Davis Cup victories with 32 titles, far ahead of Australia (28) and France (10)."),
            zh = LocalizedContent("哪支网球队赢得戴维斯杯次数最多？", listOf("澳大利亚", "瑞典", "法国", "美国"), "体育", "美国队以32次夺冠保持着戴维斯杯最多胜利纪录，远超澳大利亚（28次）和法国（10次）。"),
            es = LocalizedContent("¿Qué equipo de tenis ha ganado la Copa Davis más veces?", listOf("Australia", "Suecia", "Francia", "Estados Unidos"), "Deportes", "Estados Unidos tiene el récord de más victorias en la Copa Davis con 32 títulos, muy por delante de Australia (28) y Francia (10).")
        ),
        BilingualQuestion(
            id = 50468, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a créé 'The Holdovers'?", listOf("Alexander Payne", "Paul Thomas Anderson", "Noah Baumbach", "Kelly Reichardt"), "Cinéma", "Alexander Payne a réalisé 'The Holdovers', sorti en 2023, un drame se déroulant dans un pensionnat durant les vacances de Noël."),
            en = LocalizedContent("Which director created 'The Holdovers'?", listOf("Alexander Payne", "Paul Thomas Anderson", "Noah Baumbach", "Kelly Reichardt"), "Cinema", "Alexander Payne directed 'The Holdovers', released in 2023, a drama set in a boarding school during Christmas break."),
            zh = LocalizedContent("哪位导演创作了《留校联盟》？", listOf("亚历山大·佩恩", "保罗·托马斯·安德森", "诺亚·鲍姆巴赫", "凯莉·莱卡特"), "电影", "亚历山大·佩恩执导了2023年上映的《留校联盟》，这是一部以寄宿学校圣诞节假期为背景的剧情片。"),
            es = LocalizedContent("¿Qué director creó 'The Holdovers'?", listOf("Alexander Payne", "Paul Thomas Anderson", "Noah Baumbach", "Kelly Reichardt"), "Cine", "Alexander Payne dirigió 'The Holdovers', estrenada en 2023, un drama ambientado en un internado durante las vacaciones de Navidad.")
        ),
        BilingualQuestion(
            id = 50469, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel musicien a créé le concept d'album concept?", listOf("The Beatles", "Pink Floyd", "The Who", "Frank Zappa"), "Musique", "Le groupe The Who a popularisé le concept d'album concept avec leur opéra rock \"Tommy\" en 1969, une œuvre racontant une histoire cohérente sur l'ensemble de ses pistes."),
            en = LocalizedContent("Which musician created the concept of the concept album?", listOf("The Beatles", "Pink Floyd", "The Who", "Frank Zappa"), "Music", "The band The Who popularized the concept album with their rock opera 'Tommy' in 1969, a work telling a coherent story across its tracks."),
            zh = LocalizedContent("哪位音乐家创造了概念专辑的概念？", listOf("披头士", "平克·弗洛伊德", "谁人乐队", "弗兰克·扎帕"), "音乐", "谁人乐队在1969年凭借摇滚歌剧《汤米》推广了概念专辑的概念，这是一部在整张专辑中讲述连贯故事的作品。"),
            es = LocalizedContent("¿Qué músico creó el concepto de álbum conceptual?", listOf("The Beatles", "Pink Floyd", "The Who", "Frank Zappa"), "Musica", "La banda The Who popularizó el concepto de álbum conceptual con su ópera rock 'Tommy' en 1969, una obra que cuenta una historia coherente a lo largo de sus pistas.")
        ),
        BilingualQuestion(
            id = 50470, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'année de la Déclaration d'Indépendance?", listOf("1775", "1776", "1777", "1778"), "Histoire", "La Déclaration d'Indépendance des États-Unis a été adoptée par le Congrès continental le 4 juillet 1776, proclamant la séparation des treize colonies de la Grande-Bretagne."),
            en = LocalizedContent("What year was the Declaration of Independence?", listOf("1775", "1776", "1777", "1778"), "History", "The United States Declaration of Independence was adopted by the Continental Congress on July 4, 1776, proclaiming the separation of the thirteen colonies from Great Britain."),
            zh = LocalizedContent("《独立宣言》是哪一年？", listOf("1775", "1776", "1777", "1778"), "历史", "美国《独立宣言》于1776年7月4日由大陆会议通过，宣布十三个殖民地脱离大不列颠独立。"),
            es = LocalizedContent("¿En qué año fue la Declaración de Independencia?", listOf("1775", "1776", "1777", "1778"), "Historia", "La Declaración de Independencia de los Estados Unidos fue adoptada por el Congreso Continental el 4 de julio de 1776, proclamando la separación de las trece colonias de Gran Bretaña.")
        ),
        BilingualQuestion(
            id = 50471, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand type de grenouille?", listOf("Grenouille Goliath", "Grenouille taureau", "Grenouille verte", "Grenouille léopard"), "Science", "La grenouille Goliath, originaire d'Afrique de l'Ouest, peut mesurer jusqu'à 30 centimètres et peser plus de 3 kilogrammes, ce qui en fait la plus grande espèce de grenouille connue."),
            en = LocalizedContent("What is the largest type of frog?", listOf("Goliath frog", "Bullfrog", "Green frog", "Leopard frog"), "Science", "The Goliath frog, native to West Africa, can grow up to 30 centimeters and weigh over 3 kilograms, making it the largest known frog species."),
            zh = LocalizedContent("最大的青蛙种类是什么？", listOf("巨蛙", "牛蛙", "绿蛙", "豹蛙"), "科学", "原产于西非的巨蛙可长达30厘米，重逾3公斤，是已知最大的青蛙物种。"),
            es = LocalizedContent("¿Cuál es el tipo de rana más grande?", listOf("Rana Goliat", "Rana toro", "Rana verde", "Rana leopardo"), "Ciencia", "La rana Goliat, originaria de África Occidental, puede crecer hasta 30 centímetros y pesar más de 3 kilogramos, lo que la convierte en la especie de rana más grande conocida.")
        ),
        BilingualQuestion(
            id = 50472, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand musée du monde?", listOf("Louvre", "British Museum", "Metropolitan Museum", "Musée du Vatican"), "Géographie", "Le British Museum à Londres est considéré comme le plus grand musée du monde en termes de superficie d'exposition et de nombre d'objets, avec plus de 8 millions d'œuvres couvrant l'histoire humaine."),
            en = LocalizedContent("What is the largest museum in the world?", listOf("Louvre", "British Museum", "Metropolitan Museum", "Vatican Museums"), "Geography", "The British Museum in London is considered the largest museum in the world in terms of exhibition space and number of objects, with over 8 million works covering human history."),
            zh = LocalizedContent("世界上最大的博物馆是哪个？", listOf("卢浮宫", "大英博物馆", "大都会博物馆", "梵蒂冈博物馆"), "地理", "伦敦的大英博物馆在展览面积和藏品数量上被认为是世界上最大的博物馆，拥有超过800万件涵盖人类历史的作品。"),
            es = LocalizedContent("¿Cuál es el museo más grande del mundo?", listOf("Louvre", "Museo Británico", "Museo Metropolitano", "Museos Vaticanos"), "Geografía", "El Museo Británico en Londres es considerado el museo más grande del mundo en términos de superficie de exposición y número de objetos, con más de 8 millones de obras que abarcan la historia humana.")
        ),
        BilingualQuestion(
            id = 50473, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien instrument à vent?", listOf("Flûte", "Cor", "Trompette", "Trombone"), "Culture", "Des flûtes en os et en ivoire datant de plus de 40 000 ans ont été découvertes dans le sud de l'Allemagne, ce qui en fait les plus anciens instruments à vent connus."),
            en = LocalizedContent("What is the oldest wind instrument?", listOf("Flute", "Horn", "Trumpet", "Trombone"), "Culture", "Bone and ivory flutes dating back over 40,000 years have been discovered in southern Germany, making them the oldest known wind instruments."),
            zh = LocalizedContent("最古老的管乐器是什么？", listOf("长笛", "号角", "小号", "长号"), "文化", "在德国南部发现了超过4万年前的骨制和象牙制长笛，这使它们成为已知最古老的管乐器。"),
            es = LocalizedContent("¿Cuál es el instrumento de viento más antiguo?", listOf("Flauta", "Cuerno", "Trompeta", "Trombón"), "Cultura", "Se han descubierto flautas de hueso y marfil de más de 40.000 años en el sur de Alemania, lo que las convierte en los instrumentos de viento más antiguos conocidos.")
        ),
        BilingualQuestion(
            id = 50474, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel patineur de vitesse a remporté le plus de médailles olympiques?", listOf("Ireen Wüst", "Eric Heiden", "Cindy Klassen", "Bonnie Blair"), "Sport", "Ireen Wüst détient le record du plus grand nombre de médailles olympiques en patinage de vitesse, avec treize podiums remportés entre 2006 et 2022, dont six titres."),
            en = LocalizedContent("Which speed skater has won the most Olympic medals?", listOf("Ireen Wüst", "Eric Heiden", "Cindy Klassen", "Bonnie Blair"), "Sports", "Ireen Wüst holds the record for the most Olympic medals in speed skating, with thirteen podiums between 2006 and 2022, including six titles."),
            zh = LocalizedContent("哪位速度滑冰运动员获得的奥运奖牌最多？", listOf("伊雷妮·维斯特", "埃里克·海登", "辛迪·克拉森", "邦妮·布莱尔"), "体育", "伊雷妮·维斯特保持着速度滑冰奥运奖牌最多的纪录，在2006年至2022年间共获得13枚奖牌，其中包括6枚金牌。"),
            es = LocalizedContent("¿Qué patinador de velocidad ha ganado más medallas olímpicas?", listOf("Ireen Wüst", "Eric Heiden", "Cindy Klassen", "Bonnie Blair"), "Deportes", "Ireen Wüst tiene el récord de más medallas olímpicas en patinaje de velocidad, con trece podios entre 2006 y 2022, incluidos seis títulos.")
        ),
        BilingualQuestion(
            id = 50475, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur a créé 'Killers of the Flower Moon'?", listOf("Steven Spielberg", "Martin Scorsese", "Christopher Nolan", "Quentin Tarantino"), "Cinéma", "Martin Scorsese a réalisé ce film historique sorti en 2023, adapté du livre éponyme sur les meurtres des Osages dans les années 1920."),
            en = LocalizedContent("Which director created 'Killers of the Flower Moon'?", listOf("Steven Spielberg", "Martin Scorsese", "Christopher Nolan", "Quentin Tarantino"), "Cinema", "Martin Scorsese directed this historical film released in 2023, adapted from the eponymous book about the murders of the Osage in the 1920s."),
            zh = LocalizedContent("哪位导演创作了《花月杀手》？", listOf("史蒂文·斯皮尔伯格", "马丁·斯科塞斯", "克里斯托弗·诺兰", "昆汀·塔伦蒂诺"), "电影", "马丁·斯科塞斯执导了这部2023年上映的历史电影，改编自同名书籍，讲述了20世纪20年代奥塞奇族谋杀案。"),
            es = LocalizedContent("¿Qué director creó 'Killers of the Flower Moon'?", listOf("Steven Spielberg", "Martin Scorsese", "Christopher Nolan", "Quentin Tarantino"), "Cine", "Martin Scorsese dirigió esta película histórica estrenada en 2023, adaptada del libro homónimo sobre los asesinatos de los Osage en la década de 1920.")
        ),
        BilingualQuestion(
            id = 50477, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'année de l'Indépendance de la Belgique?", listOf("1829", "1830", "1831", "1832"), "Histoire", "La Belgique a proclamé son indépendance des Pays-Bas en 1830, après une révolution survenue à Bruxelles en août de cette même année."),
            en = LocalizedContent("What is the year of Belgium's independence?", listOf("1829", "1830", "1831", "1832"), "History", "Belgium proclaimed its independence from the Netherlands in 1830, following a revolution that occurred in Brussels in August of that year."),
            zh = LocalizedContent("比利时独立是哪一年？", listOf("1829", "1830", "1831", "1832"), "历史", "比利时于1830年宣布脱离荷兰独立，此前同年8月在布鲁塞尔爆发了一场革命。"),
            es = LocalizedContent("¿Cuál es el año de la independencia de Bélgica?", listOf("1829", "1830", "1831", "1832"), "Historia", "Bélgica proclamó su independencia de los Países Bajos en 1830, tras una revolución ocurrida en Bruselas en agosto de ese mismo año.")
        ),
        BilingualQuestion(
            id = 50478, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grande mutation génétique découverte?", listOf("Albinisme", "Polydactylie", "Gigantisme", "Nanisme"), "Science", "Le gigantisme résulte d'une mutation génétique rare affectant l'hypophyse, entraînant une surproduction d'hormone de croissance. Cette condition est considérée comme la plus grande mutation génétique en termes d'impact sur la taille corporelle."),
            en = LocalizedContent("What is the largest genetic mutation discovered?", listOf("Albinism", "Polydactyly", "Gigantism", "Dwarfism"), "Science", "Gigantism results from a rare genetic mutation affecting the pituitary gland, leading to overproduction of growth hormone. This condition is considered the largest genetic mutation in terms of impact on body size."),
            zh = LocalizedContent("发现的最大基因突变是什么？", listOf("白化病", "多指症", "巨人症", "侏儒症"), "科学", "巨人症是由影响脑垂体的罕见基因突变导致生长激素过度分泌引起的。这种疾病被认为是对体型影响最大的基因突变。"),
            es = LocalizedContent("¿Cuál es la mutación genética más grande descubierta?", listOf("Albinismo", "Polidactilia", "Gigantismo", "Enanismo"), "Ciencia", "El gigantismo resulta de una rara mutación genética que afecta la glándula pituitaria, provocando una sobreproducción de hormona de crecimiento. Esta condición se considera la mutación genética más grande en términos de impacto en el tamaño corporal.")
        ),
        BilingualQuestion(
            id = 50479, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand cimetière du monde?", listOf("Cimetière du Père Lachaise", "Cimetière de Arroios", "Cimetière de Wadi al-Salam", "Cimetière de Calvary"), "Géographie", "Situé à Nadjaf en Irak, le cimetière de Wadi al-Salam s'étend sur plusieurs kilomètres carrés et contient plus de cinq millions de tombes, ce qui en fait le plus vaste cimetière du monde."),
            en = LocalizedContent("What is the largest cemetery in the world?", listOf("Père Lachaise Cemetery", "Arroios Cemetery", "Wadi al-Salam Cemetery", "Calvary Cemetery"), "Geography", "Located in Najaf, Iraq, the Wadi al-Salam cemetery spans several square kilometers and contains over five million graves, making it the largest cemetery in the world."),
            zh = LocalizedContent("世界上最大的墓地是哪个？", listOf("拉雪兹神父公墓", "阿罗约斯公墓", "瓦迪萨拉姆公墓", "卡尔瓦里公墓"), "地理", "位于伊拉克纳杰夫的瓦迪萨拉姆公墓占地数平方公里，拥有超过500万座坟墓，是世界上最大的墓地。"),
            es = LocalizedContent("¿Cuál es el cementerio más grande del mundo?", listOf("Cementerio del Père Lachaise", "Cementerio de Arroios", "Cementerio de Wadi al-Salam", "Cementerio de Calvary"), "Geografía", "Situado en Nayaf, Irak, el cementerio de Wadi al-Salam se extiende por varios kilómetros cuadrados y contiene más de cinco millones de tumbas, lo que lo convierte en el cementerio más grande del mundo.")
        ),
        BilingualQuestion(
            id = 50480, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien festival de théâtre?", listOf("Festival d'Avignon", "Festival de Thespis", "Festival du Dionysia antique", "Festival de Delphi"), "Culture", "Le Festival du Dionysia antique, célébré à Athènes dès le VIe siècle avant J.-C., est considéré comme le plus ancien festival de théâtre en l'honneur du dieu Dionysos."),
            en = LocalizedContent("What is the oldest theatre festival?", listOf("Avignon Festival", "Thespis Festival", "Ancient Dionysia Festival", "Delphi Festival"), "Culture", "The Ancient Dionysia Festival, celebrated in Athens from the 6th century BC, is considered the oldest theatre festival, held in honor of the god Dionysus."),
            zh = LocalizedContent("最古老的戏剧节是什么？", listOf("阿维尼翁戏剧节", "泰斯庇斯戏剧节", "古代酒神节", "德尔斐戏剧节"), "文化", "古代酒神节始于公元前6世纪的雅典，被认为是世界上最古老的戏剧节，为纪念酒神狄俄尼索斯而举办。"),
            es = LocalizedContent("¿Cuál es el festival de teatro más antiguo?", listOf("Festival de Aviñón", "Festival de Thespis", "Festival de la Dionisia antigua", "Festival de Delfos"), "Cultura", "El Festival de la Dionisia antigua, celebrado en Atenas desde el siglo VI a.C., es considerado el festival de teatro más antiguo, en honor al dios Dioniso.")
        ),
        BilingualQuestion(
            id = 50481, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel équipe de volleyball a remporté le plus de championnats mondiaux?", listOf("Brésil", "Russie", "Italie", "Japon"), "Sport", "L'équipe de Russie (incluant l'URSS) détient le record avec six titres mondiaux, dont quatre sous l'ère soviétique."),
            en = LocalizedContent("Which volleyball team has won the most world championships?", listOf("Brazil", "Russia", "Italy", "Japan"), "Sports", "The Russian team (including the USSR) holds the record with six world titles, four of which were under the Soviet era."),
            zh = LocalizedContent("哪支排球队赢得的世界冠军最多？", listOf("巴西", "俄罗斯", "意大利", "日本"), "体育", "俄罗斯队（包括苏联）以六个世界冠军保持着纪录，其中四个是在苏联时期获得的。"),
            es = LocalizedContent("¿Qué equipo de voleibol ha ganado más campeonatos mundiales?", listOf("Brasil", "Rusia", "Italia", "Japón"), "Deportes", "El equipo de Rusia (incluyendo la URSS) tiene el récord con seis títulos mundiales, cuatro de ellos bajo la era soviética.")
        ),
        BilingualQuestion(
            id = 50482, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a créé 'American Fiction'?", listOf("Cord Jefferson", "Barry Jenkins", "Ryan Coogler", "Ava DuVernay"), "Cinéma", "Cord Jefferson a réalisé 'American Fiction', son premier long métrage, sorti en 2023 et adapté du roman 'Erasure' de Percival Everett."),
            en = LocalizedContent("Which director created 'American Fiction'?", listOf("Cord Jefferson", "Barry Jenkins", "Ryan Coogler", "Ava DuVernay"), "Cinema", "Cord Jefferson directed 'American Fiction', his first feature film, released in 2023 and adapted from the novel 'Erasure' by Percival Everett."),
            zh = LocalizedContent("哪位导演创作了《美国小说》？", listOf("科德·杰斐逊", "巴里·詹金斯", "瑞恩·库格勒", "艾娃·德约列"), "电影", "科德·杰斐逊执导了《美国小说》，这是他2023年上映的首部长片，改编自珀西瓦尔·埃弗雷特的小说《抹除》。"),
            es = LocalizedContent("¿Qué director creó 'American Fiction'?", listOf("Cord Jefferson", "Barry Jenkins", "Ryan Coogler", "Ava DuVernay"), "Cine", "Cord Jefferson dirigió 'American Fiction', su primer largometraje, estrenado en 2023 y adaptado de la novela 'Erasure' de Percival Everett.")
        ),
        BilingualQuestion(
            id = 50483, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le musicien le plus célèbre du 21ème siècle?", listOf("Beyoncé", "Drake", "Taylor Swift", "The Weeknd"), "Musique", "Taylor Swift cumule les records de ventes, de tournées et de récompenses, devenant l'artiste la plus écoutée mondialement sur les plateformes de streaming dans les années 2020."),
            en = LocalizedContent("Who is the most famous musician of the 21st century?", listOf("Beyoncé", "Drake", "Taylor Swift", "The Weeknd"), "Music", "Taylor Swift holds records in sales, tours, and awards, becoming the most streamed artist globally on streaming platforms in the 2020s."),
            zh = LocalizedContent("谁是21世纪最著名的音乐人？", listOf("碧昂丝", "德雷克", "泰勒·斯威夫特", "威肯"), "音乐", "泰勒·斯威夫特在销量、巡演和奖项方面创下纪录，成为2020年代全球流媒体平台上播放量最高的艺人。"),
            es = LocalizedContent("¿Quién es el músico más famoso del siglo XXI?", listOf("Beyoncé", "Drake", "Taylor Swift", "The Weeknd"), "Musica", "Taylor Swift acumula récords de ventas, giras y premios, convirtiéndose en la artista más escuchada a nivel mundial en plataformas de streaming en la década de 2020.")
        ),
        BilingualQuestion(
            id = 50484, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'année de la Révolution haïtienne?", listOf("1790", "1791", "1792", "1793"), "Histoire", "La Révolution haïtienne débute en 1791 avec une révolte d'esclaves dans la colonie française de Saint-Domingue, menant à l'indépendance d'Haïti en 1804."),
            en = LocalizedContent("What year did the Haitian Revolution start?", listOf("1790", "1791", "1792", "1793"), "History", "The Haitian Revolution began in 1791 with a slave revolt in the French colony of Saint-Domingue, leading to Haiti's independence in 1804."),
            zh = LocalizedContent("海地革命始于哪一年？", listOf("1790", "1791", "1792", "1793"), "历史", "海地革命始于1791年，法国殖民地圣多明各的奴隶起义，最终导致海地于1804年独立。"),
            es = LocalizedContent("¿En qué año comenzó la Revolución Haitiana?", listOf("1790", "1791", "1792", "1793"), "Historia", "La Revolución Haitiana comenzó en 1791 con una revuelta de esclavos en la colonia francesa de Saint-Domingue, que llevó a la independencia de Haití en 1804.")
        ),
        BilingualQuestion(
            id = 50485, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand type de lézard?", listOf("Varans de Komodo", "Iguane", "Crocodile", "Alligator"), "Science", "Le varan de Komodo, qui peut atteindre trois mètres de long et peser jusqu'à 90 kilos, est le plus grand lézard vivant connu."),
            en = LocalizedContent("What is the largest type of lizard?", listOf("Komodo dragon", "Iguana", "Crocodile", "Alligator"), "Science", "The Komodo dragon, which can reach three meters in length and weigh up to 90 kilograms, is the largest known living lizard."),
            zh = LocalizedContent("哪种蜥蜴体型最大？", listOf("科莫多巨蜥", "鬣蜥", "鳄鱼", "短吻鳄"), "科学", "科莫多巨蜥可长达三米，重达90公斤，是已知现存最大的蜥蜴。"),
            es = LocalizedContent("¿Cuál es el tipo de lagarto más grande?", listOf("Dragón de Komodo", "Iguana", "Cocodrilo", "Caimán"), "Ciencia", "El dragón de Komodo, que puede alcanzar tres metros de largo y pesar hasta 90 kilos, es el lagarto vivo más grande conocido.")
        ),
        BilingualQuestion(
            id = 50486, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réseau fluvial du monde?", listOf("Bassin de l'Amazone", "Bassin du Congo", "Bassin du Yangtze", "Bassin du Mississippi"), "Géographie", "Le bassin de l'Amazone est le plus grand réseau fluvial du monde en volume d'eau et en superficie, s'étendant sur environ 7 millions de km² à travers plusieurs pays d'Amérique du Sud."),
            en = LocalizedContent("What is the largest river system in the world?", listOf("Amazon Basin", "Congo Basin", "Yangtze Basin", "Mississippi Basin"), "Geography", "The Amazon Basin is the largest river system in the world by water volume and area, spanning about 7 million km² across several South American countries."),
            zh = LocalizedContent("世界上最大的河流系统是什么？", listOf("亚马逊河流域", "刚果河流域", "长江流域", "密西西比河流域"), "地理", "亚马逊河是水量和流域面积最大的河流系统，覆盖约700万平方公里，流经多个南美国家。"),
            es = LocalizedContent("¿Cuál es el sistema fluvial más grande del mundo?", listOf("Cuenca del Amazonas", "Cuenca del Congo", "Cuenca del Yangtsé", "Cuenca del Misisipi"), "Geografia", "La cuenca del Amazonas es el sistema fluvial más grande del mundo en volumen de agua y superficie, abarcando unos 7 millones de km² en varios países sudamericanos.")
        ),
        BilingualQuestion(
            id = 50487, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien type de danse?", listOf("Ballet", "Tango", "Waltz", "Danse rituelle"), "Culture", "Les danses rituelles, pratiquées dès la préhistoire lors de cérémonies chamaniques ou religieuses, sont considérées comme la forme la plus ancienne de danse."),
            en = LocalizedContent("What is the oldest type of dance?", listOf("Ballet", "Tango", "Waltz", "Ritual dance"), "Culture", "Ritual dances, practiced since prehistoric times in shamanic or religious ceremonies, are considered the oldest form of dance."),
            zh = LocalizedContent("最古老的舞蹈类型是什么？", listOf("芭蕾", "探戈", "华尔兹", "仪式舞蹈"), "文化", "仪式舞蹈自史前时期就在萨满或宗教仪式中实践，被认为是最古老的舞蹈形式。"),
            es = LocalizedContent("¿Cuál es el tipo de baile más antiguo?", listOf("Ballet", "Tango", "Vals", "Danza ritual"), "Cultura", "Las danzas rituales, practicadas desde la prehistoria en ceremonias chamánicas o religiosas, se consideran la forma más antigua de baile.")
        ),
        BilingualQuestion(
            id = 50488, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel athlète de track and field a remporté le plus de titres olympiques?", listOf("Carl Lewis", "Usain Bolt", "Jesse Owens", "Michael Johnson"), "Sport", "Carl Lewis a remporté 9 médailles d'or olympiques en athlétisme entre 1984 et 1996, un record masculin partagé avec Paavo Nurmi et Michael Phelps."),
            en = LocalizedContent("Which track and field athlete has won the most Olympic titles?", listOf("Carl Lewis", "Usain Bolt", "Jesse Owens", "Michael Johnson"), "Sports", "Carl Lewis won 9 Olympic gold medals in athletics between 1984 and 1996, a male record shared with Paavo Nurmi and Michael Phelps."),
            zh = LocalizedContent("哪位田径运动员赢得了最多的奥运冠军？", listOf("卡尔·刘易斯", "尤塞恩·博尔特", "杰西·欧文斯", "迈克尔·约翰逊"), "体育", "卡尔·刘易斯在1984年至1996年间赢得了9枚奥运田径金牌，与帕沃·努尔米和迈克尔·菲尔普斯共享男子纪录。"),
            es = LocalizedContent("¿Qué atleta de atletismo ha ganado más títulos olímpicos?", listOf("Carl Lewis", "Usain Bolt", "Jesse Owens", "Michael Johnson"), "Deportes", "Carl Lewis ganó 9 medallas de oro olímpicas en atletismo entre 1984 y 1996, un récord masculino compartido con Paavo Nurmi y Michael Phelps.")
        ),
        BilingualQuestion(
            id = 50489, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a créé 'The Iron Claw'?", listOf("Sean Durkin", "Brady Corbet", "Lynne Ramsay", "Claire Denis"), "Cinéma", "Sean Durkin est le réalisateur de ce film biographique sur la famille de catcheurs Von Erich, sorti en 2023."),
            en = LocalizedContent("Which director created 'The Iron Claw'?", listOf("Sean Durkin", "Brady Corbet", "Lynne Ramsay", "Claire Denis"), "Cinema", "Sean Durkin is the director of this biographical film about the Von Erich wrestling family, released in 2023."),
            zh = LocalizedContent("哪位导演创作了《铁爪》？", listOf("肖恩·德金", "布雷迪·科贝特", "琳恩·拉姆塞", "克莱尔·德尼"), "电影", "肖恩·德金是这部关于冯·埃里希摔跤家族传记片的导演，该片于2023年上映。"),
            es = LocalizedContent("¿Qué director creó 'The Iron Claw'?", listOf("Sean Durkin", "Brady Corbet", "Lynne Ramsay", "Claire Denis"), "Cine", "Sean Durkin es el director de esta película biográfica sobre la familia de luchadores Von Erich, estrenada en 2023.")
        ),
        BilingualQuestion(
            id = 50490, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien type de musique enregistrée?", listOf("Classical", "Blues", "Jazz", "Opéra"), "Musique", "Le premier enregistrement sonore connu est un extrait de l'opéra \"Les Cloches du Soir\" d'Édouard-Léon Scott de Martinville, réalisé en 1860 sur un phonautographe."),
            en = LocalizedContent("What is the oldest type of recorded music?", listOf("Classical", "Blues", "Jazz", "Opera"), "Music", "The earliest known sound recording is an excerpt from the opera 'Les Cloches du Soir' by Édouard-Léon Scott de Martinville, made in 1860 on a phonautograph."),
            zh = LocalizedContent("最古老的录音音乐类型是什么？", listOf("古典", "蓝调", "爵士", "歌剧"), "音乐", "已知最早的录音是爱德华-莱昂·斯科特·德·马丁维尔于1860年用声波记录仪录制的歌剧《晚钟》片段。"),
            es = LocalizedContent("¿Cuál es el tipo más antiguo de música grabada?", listOf("Clásica", "Blues", "Jazz", "Ópera"), "Musica", "La grabación sonora más antigua conocida es un fragmento de la ópera 'Les Cloches du Soir' de Édouard-Léon Scott de Martinville, realizada en 1860 con un fonautógrafo.")
        ),
        BilingualQuestion(
            id = 50491, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'année du Traité de Amiens?", listOf("1801", "1802", "1803", "1804"), "Histoire", "Le Traité d'Amiens, signé le 25 mars 1802, mit fin à la guerre entre la France et le Royaume-Uni, marquant une brève période de paix pendant les guerres napoléoniennes."),
            en = LocalizedContent("What year was the Treaty of Amiens signed?", listOf("1801", "1802", "1803", "1804"), "History", "The Treaty of Amiens, signed on March 25, 1802, ended the war between France and the United Kingdom, marking a brief period of peace during the Napoleonic Wars."),
            zh = LocalizedContent("《亚眠条约》签署于哪一年？", listOf("1801", "1802", "1803", "1804"), "历史", "《亚眠条约》于1802年3月25日签署，结束了法国与英国之间的战争，标志着拿破仑战争期间短暂的和平时期。"),
            es = LocalizedContent("¿En qué año se firmó el Tratado de Amiens?", listOf("1801", "1802", "1803", "1804"), "Historia", "El Tratado de Amiens, firmado el 25 de marzo de 1802, puso fin a la guerra entre Francia y el Reino Unido, marcando un breve período de paz durante las guerras napoleónicas.")
        ),
        BilingualQuestion(
            id = 50492, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand type de crustacé?", listOf("Araignée de mer géante", "Crabe royal", "Homard géant", "Kraken"), "Science", "Le crabe royal, notamment le crabe royal du Kamtchatka, peut atteindre une envergure de pattes de près de 1,8 mètre et peser jusqu'à 12 kg, ce qui en fait le plus grand crustacé."),
            en = LocalizedContent("What is the largest type of crustacean?", listOf("Giant spider crab", "King crab", "Giant lobster", "Kraken"), "Science", "The king crab, especially the Kamchatka king crab, can have a leg span of nearly 1.8 meters and weigh up to 12 kg, making it the largest crustacean."),
            zh = LocalizedContent("哪种甲壳动物体型最大？", listOf("巨型蜘蛛蟹", "帝王蟹", "巨型龙虾", "北海巨妖"), "科学", "帝王蟹，尤其是堪察加帝王蟹，腿展可达近1.8米，重达12公斤，是最大的甲壳动物。"),
            es = LocalizedContent("¿Cuál es el tipo de crustáceo más grande?", listOf("Cangrejo araña gigante", "Cangrejo real", "Langosta gigante", "Kraken"), "Ciencia", "El cangrejo real, especialmente el cangrejo real de Kamchatka, puede alcanzar una envergadura de patas de casi 1,8 metros y pesar hasta 12 kg, lo que lo convierte en el crustáceo más grande.")
        ),
        BilingualQuestion(
            id = 50493, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel immense canyon creuse par le fleuve Colorado est l'une des merveilles naturelles des Etats-Unis ?", listOf("Grand Canyon", "Zion Canyon", "Antelope Canyon", "Black Canyon"), "Géographie", "Le Grand Canyon, situé en Arizona, a été sculpté par le fleuve Colorado sur des millions d'années, atteignant jusqu'à 1 800 mètres de profondeur."),
            en = LocalizedContent("What immense canyon carved by the Colorado River is one of the natural wonders of the United States?", listOf("Grand Canyon", "Zion Canyon", "Antelope Canyon", "Black Canyon"), "Geography", "The Grand Canyon, located in Arizona, was sculpted by the Colorado River over millions of years, reaching depths of up to 1,800 meters."),
            zh = LocalizedContent("科罗拉多河冲刷出的哪个巨大峡谷是美国自然奇观之一？", listOf("大峡谷", "锡安峡谷", "羚羊峡谷", "黑峡谷"), "地理", "大峡谷位于亚利桑那州，由科罗拉多河经过数百万年冲刷而成，深度可达1800米。"),
            es = LocalizedContent("¿Qué inmenso cañón excavado por el río Colorado es una de las maravillas naturales de Estados Unidos?", listOf("Gran Cañón", "Cañón Zion", "Cañón Antelope", "Cañón Black"), "Geografía", "El Gran Cañón, ubicado en Arizona, fue esculpido por el río Colorado durante millones de años, alcanzando profundidades de hasta 1.800 metros.")
        ),
        BilingualQuestion(
            id = 50494, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien type de musique vocale?", listOf("Chant grégorien", "Gospel", "Blues", "Rock"), "Culture", "Le chant grégorien, développé à partir du IXe siècle, est considéré comme la plus ancienne forme de musique vocale liturgique occidentale codifiée, héritée des traditions juives et byzantines."),
            en = LocalizedContent("What is the oldest type of vocal music?", listOf("Gregorian chant", "Gospel", "Blues", "Rock"), "Culture", "Gregorian chant, developed from the 9th century, is considered the oldest codified form of Western liturgical vocal music, inherited from Jewish and Byzantine traditions."),
            zh = LocalizedContent("最古老的声乐类型是什么？", listOf("格里高利圣咏", "福音音乐", "蓝调", "摇滚"), "文化", "格里高利圣咏始于9世纪，被认为是西方最古老的规范化礼仪声乐形式，继承自犹太和拜占庭传统。"),
            es = LocalizedContent("¿Cuál es el tipo más antiguo de música vocal?", listOf("Canto gregoriano", "Gospel", "Blues", "Rock"), "Cultura", "El canto gregoriano, desarrollado a partir del siglo IX, es considerado la forma más antigua de música vocal litúrgica occidental codificada, heredada de las tradiciones judía y bizantina.")
        ),
        BilingualQuestion(
            id = 50495, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel équipe de hockey sur glace remporté le plus de Coupes Stanley?", listOf("Montreal Canadiens", "Toronto Maple Leafs", "New York Rangers", "Detroit Red Wings"), "Sport", "Les Canadiens de Montréal ont remporté 24 Coupes Stanley, soit le record absolu dans la LNH, devant les Maple Leafs de Toronto (13 titres)."),
            en = LocalizedContent("Which ice hockey team has won the most Stanley Cups?", listOf("Montreal Canadiens", "Toronto Maple Leafs", "New York Rangers", "Detroit Red Wings"), "Sports", "The Montreal Canadiens have won 24 Stanley Cups, the absolute record in the NHL, ahead of the Toronto Maple Leafs (13 titles)."),
            zh = LocalizedContent("哪支冰球队赢得了最多的斯坦利杯？", listOf("蒙特利尔加拿大人队", "多伦多枫叶队", "纽约游骑兵队", "底特律红翼队"), "体育", "蒙特利尔加拿大人队赢得了24次斯坦利杯，是NHL的绝对纪录，领先于多伦多枫叶队（13次冠军）。"),
            es = LocalizedContent("¿Qué equipo de hockey sobre hielo ha ganado más Copas Stanley?", listOf("Montreal Canadiens", "Toronto Maple Leafs", "New York Rangers", "Detroit Red Wings"), "Deportes", "Los Montreal Canadiens han ganado 24 Copas Stanley, el récord absoluto en la NHL, por delante de los Toronto Maple Leafs (13 títulos).")
        ),
        BilingualQuestion(
            id = 50496, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a créé 'The Zone of Interest'?", listOf("Jonathan Glazer", "Todd Field", "Justine Triet", "Charlotte Wells"), "Cinéma", "Jonathan Glazer a réalisé ce film en 2023, adapté du roman de Martin Amis, qui explore la vie quotidienne d'une famille nazie vivant juste à côté du camp d'Auschwitz."),
            en = LocalizedContent("Which director created 'The Zone of Interest'?", listOf("Jonathan Glazer", "Todd Field", "Justine Triet", "Charlotte Wells"), "Cinema", "Jonathan Glazer directed this 2023 film, adapted from Martin Amis's novel, which explores the daily life of a Nazi family living right next to Auschwitz."),
            zh = LocalizedContent("哪位导演创作了《利益区域》？", listOf("乔纳森·格雷泽", "托德·菲尔德", "茹斯汀·特里耶", "夏洛特·威尔斯"), "电影", "乔纳森·格雷泽执导了这部2023年的电影，改编自马丁·艾米斯的小说，探讨了一个纳粹家庭生活在奥斯维辛集中营隔壁的日常生活。"),
            es = LocalizedContent("¿Qué director creó 'The Zone of Interest'?", listOf("Jonathan Glazer", "Todd Field", "Justine Triet", "Charlotte Wells"), "Cine", "Jonathan Glazer dirigió esta película de 2023, adaptada de la novela de Martin Amis, que explora la vida cotidiana de una familia nazi que vive justo al lado del campo de Auschwitz.")
        ),
        BilingualQuestion(
            id = 50497, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le compositeur symphonique le plus joué?", listOf("Mozart", "Bach", "Beethoven", "Brahms"), "Musique", "Beethoven est le compositeur symphonique le plus joué grâce à la popularité intemporelle de ses neuf symphonies, notamment la Cinquième et la Neuvième, qui restent des piliers des répertoires d’orchestres du monde entier."),
            en = LocalizedContent("Who is the most performed symphonic composer?", listOf("Mozart", "Bach", "Beethoven", "Brahms"), "Music", "Beethoven is the most performed symphonic composer thanks to the timeless popularity of his nine symphonies, especially the Fifth and Ninth, which remain staples of orchestras worldwide."),
            zh = LocalizedContent("哪位交响乐作曲家被演奏得最多？", listOf("莫扎特", "巴赫", "贝多芬", "勃拉姆斯"), "音乐", "贝多芬是演奏最多的交响乐作曲家，他的九部交响曲，尤其是第五和第九，具有永恒的魅力，至今仍是世界各地乐团的保留曲目。"),
            es = LocalizedContent("¿Quién es el compositor sinfónico más interpretado?", listOf("Mozart", "Bach", "Beethoven", "Brahms"), "Música", "Beethoven es el compositor sinfónico más interpretado gracias a la popularidad atemporal de sus nueve sinfonías, especialmente la Quinta y la Novena, que siguen siendo pilares de los repertorios de orquestas de todo el mundo.")
        ),
        BilingualQuestion(
            id = 50498, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'année du Congrès de Vienne?", listOf("1813", "1814", "1815", "1816"), "Histoire", "Le Congrès de Vienne s'est tenu de septembre 1814 à juin 1815, avec sa clôture officielle le 9 juin 1815, pour redessiner les frontières européennes après les guerres napoléoniennes."),
            en = LocalizedContent("What year was the Congress of Vienna?", listOf("1813", "1814", "1815", "1816"), "History", "The Congress of Vienna took place from September 1814 to June 1815, officially closing on June 9, 1815, to redraw European borders after the Napoleonic Wars."),
            zh = LocalizedContent("维也纳会议是哪一年？", listOf("1813", "1814", "1815", "1816"), "历史", "维也纳会议于1814年9月至1815年6月举行，正式闭幕于1815年6月9日，旨在拿破仑战争后重新划定欧洲边界。"),
            es = LocalizedContent("¿En qué año fue el Congreso de Viena?", listOf("1813", "1814", "1815", "1816"), "Historia", "El Congreso de Viena se celebró de septiembre de 1814 a junio de 1815, con su cierre oficial el 9 de junio de 1815, para redibujar las fronteras europeas tras las guerras napoleónicas.")
        ),
        BilingualQuestion(
            id = 50499, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand type de papillon?", listOf("Papillon Alexandra", "Papillon lune atlas", "Grand Monarque", "Papillon Reine"), "Science", "Le papillon Alexandra (Ornithoptera alexandrae) est le plus grand papillon du monde, avec une envergure pouvant atteindre 28 centimètres. Il est endémique des forêts tropicales de Papouasie-Nouvelle-Guinée."),
            en = LocalizedContent("What is the largest type of butterfly?", listOf("Queen Alexandra's birdwing", "Atlas moth", "Great Monarch", "Queen butterfly"), "Science", "Queen Alexandra's birdwing (Ornithoptera alexandrae) is the largest butterfly in the world, with a wingspan reaching up to 28 centimeters. It is endemic to the tropical forests of Papua New Guinea."),
            zh = LocalizedContent("最大的蝴蝶种类是什么？", listOf("亚历山大鸟翼蝶", "乌桕大蚕蛾", "大君主斑蝶", "女王斑蝶"), "科学", "亚历山大鸟翼蝶（Ornithoptera alexandrae）是世界上最大的蝴蝶，翼展可达28厘米，是巴布亚新几内亚热带雨林的特有物种。"),
            es = LocalizedContent("¿Cuál es el tipo de mariposa más grande?", listOf("Mariposa alas de pájaro de la Reina Alexandra", "Polilla atlas", "Gran Monarca", "Mariposa Reina"), "Ciencia", "La mariposa alas de pájaro de la Reina Alexandra (Ornithoptera alexandrae) es la mariposa más grande del mundo, con una envergadura de hasta 28 centímetros. Es endémica de los bosques tropicales de Papúa Nueva Guinea.")
        ),
        BilingualQuestion(
            id = 50500, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand massif montagneux du monde?", listOf("Chaîne de l'Himalaya", "Montagnes Rocheuses", "Chaîne des Andes", "Alpes"), "Géographie", "La chaîne des Andes est le plus long massif montagneux continental du monde, s'étendant sur environ 7 000 kilomètres le long de la côte ouest de l'Amérique du Sud."),
            en = LocalizedContent("What is the largest mountain range in the world?", listOf("Himalayas", "Rocky Mountains", "Andes", "Alps"), "Geography", "The Andes is the longest continental mountain range in the world, stretching approximately 7,000 kilometers along the western coast of South America."),
            zh = LocalizedContent("世界上最大的山脉是什么？", listOf("喜马拉雅山脉", "落基山脉", "安第斯山脉", "阿尔卑斯山脉"), "地理", "安第斯山脉是世界上最长的大陆山脉，沿南美洲西海岸延伸约7000公里。"),
            es = LocalizedContent("¿Cuál es la cordillera más grande del mundo?", listOf("Himalaya", "Montañas Rocosas", "Andes", "Alpes"), "Geografía", "La cordillera de los Andes es la cadena montañosa continental más larga del mundo, extendiéndose aproximadamente 7.000 kilómetros a lo largo de la costa occidental de América del Sur.")
        ),
        BilingualQuestion(
            id = 50501, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien opéra jamais écrit?", listOf("La Traviata", "Don Giovanni", "L'Orfeo", "Le Mariage secret"), "Culture", "L'Orfeo, composé par Claudio Monteverdi en 1607, est considéré comme le premier opéra majeur de l'histoire, bien que des œuvres antérieures comme Dafne de Peri (1598) existent."),
            en = LocalizedContent("What is the oldest opera ever written?", listOf("La Traviata", "Don Giovanni", "L'Orfeo", "The Secret Marriage"), "Culture", "L'Orfeo, composed by Claudio Monteverdi in 1607, is considered the first major opera in history, although earlier works like Dafne by Peri (1598) exist."),
            zh = LocalizedContent("有史以来最古老的歌剧是什么？", listOf("茶花女", "唐·乔瓦尼", "奥菲欧", "秘婚记"), "文化", "克劳迪奥·蒙特威尔第于1607年创作的《奥菲欧》被认为是历史上第一部重要的歌剧，尽管更早的作品如佩里的《达芙妮》（1598年）也存在。"),
            es = LocalizedContent("¿Cuál es la ópera más antigua jamás escrita?", listOf("La Traviata", "Don Giovanni", "L'Orfeo", "El matrimonio secreto"), "Cultura", "L'Orfeo, compuesta por Claudio Monteverdi en 1607, es considerada la primera ópera importante de la historia, aunque existen obras anteriores como Dafne de Peri (1598).")
        ),
        BilingualQuestion(
            id = 50502, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel équipe de football remporté la Ligue des Champions 2024?", listOf("Real Madrid", "Manchester City", "Inter Milan", "Bayern Munich"), "Sport", "Le Real Madrid a battu le Borussia Dortmund 2-0 en finale à Wembley le 1er juin 2024, décrochant ainsi son 15e titre dans la compétition."),
            en = LocalizedContent("Which football team won the 2024 Champions League?", listOf("Real Madrid", "Manchester City", "Inter Milan", "Bayern Munich"), "Sports", "Real Madrid beat Borussia Dortmund 2-0 in the final at Wembley on June 1, 2024, securing their 15th title in the competition."),
            zh = LocalizedContent("哪支足球队赢得了2024年欧冠联赛？", listOf("皇家马德里", "曼彻斯特城", "国际米兰", "拜仁慕尼黑"), "体育", "皇家马德里在2024年6月1日温布利决赛中以2-0击败多特蒙德，赢得了他们的第15个欧冠冠军。"),
            es = LocalizedContent("¿Qué equipo de fútbol ganó la Liga de Campeones 2024?", listOf("Real Madrid", "Manchester City", "Inter de Milán", "Bayern Múnich"), "Deportes", "El Real Madrid venció al Borussia Dortmund 2-0 en la final en Wembley el 1 de junio de 2024, consiguiendo así su 15º título en la competición.")
        ),
        BilingualQuestion(
            id = 50504, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus vieux style de musique urbaine?", listOf("Rap", "Hip-hop", "Funk", "Disco"), "Musique", "Le funk est né dans les années 1960 aux États-Unis, mêlant rythmiques syncopées et soul, ce qui en fait l’un des premiers styles de musique urbaine moderne."),
            en = LocalizedContent("What is the oldest style of urban music?", listOf("Rap", "Hip-hop", "Funk", "Disco"), "Music", "Funk originated in the 1960s in the United States, blending syncopated rhythms and soul, making it one of the earliest modern urban music styles."),
            zh = LocalizedContent("最古老的城市音乐风格是什么？", listOf("说唱", "嘻哈", "放克", "迪斯科"), "音乐", "放克起源于20世纪60年代的美国，融合了切分节奏和灵魂乐，使其成为最早的现代城市音乐风格之一。"),
            es = LocalizedContent("¿Cuál es el estilo más antiguo de música urbana?", listOf("Rap", "Hip-hop", "Funk", "Disco"), "Musica", "El funk nació en la década de 1960 en Estados Unidos, combinando ritmos sincopados y soul, lo que lo convierte en uno de los primeros estilos de música urbana moderna.")
        ),
        BilingualQuestion(
            id = 50505, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'année de la Chute de Constantinople?", listOf("1450", "1451", "1452", "1453"), "Histoire", "La chute de Constantinople en 1453 marque la fin de l'Empire byzantin et le début de la domination ottomane dans la région."),
            en = LocalizedContent("What year was the Fall of Constantinople?", listOf("1450", "1451", "1452", "1453"), "History", "The fall of Constantinople in 1453 marked the end of the Byzantine Empire and the beginning of Ottoman domination in the region."),
            zh = LocalizedContent("君士坦丁堡陷落于哪一年？", listOf("1450", "1451", "1452", "1453"), "历史", "1453年君士坦丁堡的陷落标志着拜占庭帝国的终结和奥斯曼帝国在该地区统治的开始。"),
            es = LocalizedContent("¿En qué año fue la Caída de Constantinopla?", listOf("1450", "1451", "1452", "1453"), "Historia", "La caída de Constantinopla en 1453 marcó el fin del Imperio Bizantino y el inicio del dominio otomano en la región.")
        ),
        BilingualQuestion(
            id = 50506, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand type d'arachnide non-toxique?", listOf("Araignée de Goliath", "Scorpion géant", "Solifuge géant", "Tailipe"), "Science", "L'araignée de Goliath (Theraphosa blondi) est la plus grande espèce d'araignée au monde par son envergure et sa masse, pouvant atteindre 30 centimètres, et elle est considérée comme non-toxique pour l'homme malgré ses chélicères imposantes."),
            en = LocalizedContent("What is the largest non-toxic arachnid?", listOf("Goliath birdeater", "Giant scorpion", "Giant solifugid", "Tailipe"), "Science", "The Goliath birdeater (Theraphosa blondi) is the largest spider species in the world by wingspan and mass, reaching up to 30 centimeters, and is considered non-toxic to humans despite its imposing chelicerae."),
            zh = LocalizedContent("最大的无毒蛛形纲动物是什么？", listOf("歌利亚食鸟蛛", "巨型蝎子", "巨型避日蛛", "Tailipe"), "科学", "歌利亚食鸟蛛（Theraphosa blondi）是世界上体型最大的蜘蛛，翼展和重量均居首位，可达30厘米，尽管其螯肢令人畏惧，但对人类无毒。"),
            es = LocalizedContent("¿Cuál es el arácnido no tóxico más grande?", listOf("Araña Goliat", "Escorpión gigante", "Solífugo gigante", "Tailipe"), "Ciencia", "La araña Goliat (Theraphosa blondi) es la especie de araña más grande del mundo por envergadura y masa, alcanzando hasta 30 centímetros, y se considera no tóxica para los humanos a pesar de sus imponentes quelíceros.")
        ),
        BilingualQuestion(
            id = 50507, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand delta fluvial du monde?", listOf("Delta de l'Amazone", "Delta du Gange", "Delta du Mékong", "Delta du Mississippi"), "Géographie", "Le delta du Gange-Brahmapoutre, situé principalement au Bangladesh et en Inde, est le plus grand delta du monde en superficie. Il se forme par la confluence des fleuves Gange et Brahmapoutre avant de se jeter dans le golfe du Bengale."),
            en = LocalizedContent("What is the largest river delta in the world?", listOf("Amazon Delta", "Ganges Delta", "Mekong Delta", "Mississippi Delta"), "Geography", "The Ganges-Brahmaputra delta, located mainly in Bangladesh and India, is the largest delta in the world by area. It is formed by the confluence of the Ganges and Brahmaputra rivers before emptying into the Bay of Bengal."),
            zh = LocalizedContent("世界上最大的河流三角洲是什么？", listOf("亚马逊三角洲", "恒河三角洲", "湄公河三角洲", "密西西比三角洲"), "地理", "恒河-布拉马普特拉河三角洲主要位于孟加拉国和印度，是世界上面积最大的三角洲，由恒河和布拉马普特拉河汇合后注入孟加拉湾形成。"),
            es = LocalizedContent("¿Cuál es el delta fluvial más grande del mundo?", listOf("Delta del Amazonas", "Delta del Ganges", "Delta del Mekong", "Delta del Mississippi"), "Geografia", "El delta del Ganges-Brahmaputra, ubicado principalmente en Bangladesh y la India, es el delta más grande del mundo en superficie. Se forma por la confluencia de los ríos Ganges y Brahmaputra antes de desembocar en la bahía de Bengala.")
        ),
        BilingualQuestion(
            id = 50508, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien type de danse de cour?", listOf("Pavan", "Minuet", "Gavotte", "Menuet"), "Culture", "La pavan, danse lente et majestueuse, émergea en Italie au XVIe siècle et devint la danse de cour par excellence de la Renaissance européenne."),
            en = LocalizedContent("What is the oldest type of court dance?", listOf("Pavane", "Minuet", "Gavotte", "Menuet"), "Culture", "The pavane, a slow and majestic dance, emerged in Italy in the 16th century and became the quintessential court dance of the European Renaissance."),
            zh = LocalizedContent("最古老的宫廷舞蹈类型是什么？", listOf("帕凡舞", "小步舞", "加沃特舞", "小步舞"), "文化", "帕凡舞是一种缓慢而庄严的舞蹈，起源于16世纪的意大利，成为欧洲文艺复兴时期最具代表性的宫廷舞蹈。"),
            es = LocalizedContent("¿Cuál es el tipo más antiguo de danza cortesana?", listOf("Pavana", "Minueto", "Gavota", "Minueto"), "Cultura", "La pavana, una danza lenta y majestuosa, surgió en Italia en el siglo XVI y se convirtió en la danza cortesana por excelencia del Renacimiento europeo.")
        ),
        BilingualQuestion(
            id = 50509, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel athlète de saut en longueur a remporté le plus de titres mondiaux?", listOf("Carl Lewis", "Bob Beamon", "Sergei Bubka", "Kliment Voroshilov"), "Sport", "Carl Lewis a dominé le saut en longueur avec huit titres mondiaux, dont quatre aux championnats du monde d'athlétisme et quatre aux Jeux olympiques."),
            en = LocalizedContent("Which long jump athlete has won the most world titles?", listOf("Carl Lewis", "Bob Beamon", "Sergei Bubka", "Kliment Voroshilov"), "Sports", "Carl Lewis dominated the long jump with eight world titles, including four at the World Athletics Championships and four at the Olympic Games."),
            zh = LocalizedContent("哪位跳远运动员赢得了最多的世界冠军？", listOf("卡尔·刘易斯", "鲍勃·比蒙", "谢尔盖·布勃卡", "克利门特·伏罗希洛夫"), "体育", "卡尔·刘易斯在跳远项目上占据统治地位，共获得八个世界冠军，包括四个世界田径锦标赛冠军和四个奥运会冠军。"),
            es = LocalizedContent("¿Qué atleta de salto de longitud ha ganado más títulos mundiales?", listOf("Carl Lewis", "Bob Beamon", "Sergei Bubka", "Kliment Voroshilov"), "Deportes", "Carl Lewis dominó el salto de longitud con ocho títulos mundiales, incluyendo cuatro en los Campeonatos Mundiales de Atletismo y cuatro en los Juegos Olímpicos.")
        ),
        BilingualQuestion(
            id = 50510, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a créé 'Poor Things'?", listOf("Yorgos Lanthimos", "Jonathan Glazer", "Justine Triet", "Todd Field"), "Cinéma", "Yorgos Lanthimos a réalisé 'Poor Things' (2023), une comédie noire fantastique adaptée du roman d'Alasdair Gray, qui a remporté le Lion d'or à Venise."),
            en = LocalizedContent("Which director created 'Poor Things'?", listOf("Yorgos Lanthimos", "Jonathan Glazer", "Justine Triet", "Todd Field"), "Cinema", "Yorgos Lanthimos directed 'Poor Things' (2023), a dark fantasy comedy adapted from Alasdair Gray's novel, which won the Golden Lion at Venice."),
            zh = LocalizedContent("哪位导演创作了《可怜的东西》？", listOf("欧格斯·兰斯莫斯", "乔纳森·格雷泽", "茹斯汀·特里耶", "托德·菲尔德"), "电影", "欧格斯·兰斯莫斯执导了《可怜的东西》（2023），这是一部改编自阿拉斯代尔·格雷小说的黑暗奇幻喜剧，获得了威尼斯电影节金狮奖。"),
            es = LocalizedContent("¿Qué director creó 'Poor Things'?", listOf("Yorgos Lanthimos", "Jonathan Glazer", "Justine Triet", "Todd Field"), "Cine", "Yorgos Lanthimos dirigió 'Poor Things' (2023), una comedia fantástica oscura adaptada de la novela de Alasdair Gray, que ganó el León de Oro en Venecia.")
        ),
        BilingualQuestion(
            id = 50511, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien style de reggae?", listOf("Roots reggae", "Dancehall", "Ragga", "Ska"), "Musique", "Le ska est apparu dans les années 1950 en Jamaïque, combinant des rythmes caribéens avec du jazz et du R&B américain, et il a précédé et influencé le rocksteady puis le reggae."),
            en = LocalizedContent("What is the oldest style of reggae?", listOf("Roots reggae", "Dancehall", "Ragga", "Ska"), "Music", "Ska emerged in the 1950s in Jamaica, combining Caribbean rhythms with jazz and American R&B, and it preceded and influenced rocksteady and then reggae."),
            zh = LocalizedContent("最古老的雷鬼风格是什么？", listOf("根源雷鬼", "舞厅", "拉格", "斯卡"), "音乐", "斯卡起源于20世纪50年代的牙买加，融合了加勒比节奏、爵士乐和美国R&B，它先于并影响了摇滚steady和后来的雷鬼。"),
            es = LocalizedContent("¿Cuál es el estilo más antiguo de reggae?", listOf("Roots reggae", "Dancehall", "Ragga", "Ska"), "Musica", "El ska surgió en la década de 1950 en Jamaica, combinando ritmos caribeños con jazz y R&B estadounidense, y precedió e influyó en el rocksteady y luego en el reggae.")
        ),
        BilingualQuestion(
            id = 50513, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand type de poisson géant?", listOf("Tilapia géante", "Poisson-chat géant", "Arapaima", "Silure géant"), "Science", "L'arapaima, aussi appelé pirarucu, est le plus grand poisson d'eau douce d'Amérique du Sud, pouvant atteindre 3 mètres de long et 200 kg."),
            en = LocalizedContent("What is the largest type of giant fish?", listOf("Giant tilapia", "Giant catfish", "Arapaima", "Giant wels catfish"), "Science", "The arapaima, also known as pirarucu, is the largest freshwater fish in South America, reaching up to 3 meters in length and 200 kg."),
            zh = LocalizedContent("最大的巨型鱼类是什么？", listOf("巨型罗非鱼", "巨型鲶鱼", "巨骨舌鱼", "欧洲巨鲶"), "科学", "巨骨舌鱼，又称象鱼，是南美洲最大的淡水鱼，体长可达3米，重达200公斤。"),
            es = LocalizedContent("¿Cuál es el tipo más grande de pez gigante?", listOf("Tilapia gigante", "Bagre gigante", "Arapaima", "Siluro gigante"), "Ciencia", "El arapaima, también conocido como pirarucú, es el pez de agua dulce más grande de Sudamérica, alcanzando hasta 3 metros de largo y 200 kg.")
        ),
        BilingualQuestion(
            id = 50514, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand désert de sable du monde?", listOf("Sahara", "Désert arabique", "Désert de Kyzylkoum", "Désert de Gobi"), "Géographie", "Le Sahara est le plus grand désert de sable du monde, s'étendant sur environ 9,2 millions de km² en Afrique du Nord. Il dépasse largement les autres déserts de sable comme le Rub al-Khali en superficie."),
            en = LocalizedContent("What is the largest sand desert in the world?", listOf("Sahara", "Arabian Desert", "Kyzylkum Desert", "Gobi Desert"), "Geography", "The Sahara is the largest sand desert in the world, covering about 9.2 million km² in North Africa. It far surpasses other sand deserts like the Rub' al Khali in area."),
            zh = LocalizedContent("世界上最大的沙质沙漠是什么？", listOf("撒哈拉沙漠", "阿拉伯沙漠", "克孜勒库姆沙漠", "戈壁沙漠"), "地理", "撒哈拉沙漠是世界上最大的沙质沙漠，覆盖北非约920万平方公里，面积远超其他沙质沙漠如鲁卜哈利沙漠。"),
            es = LocalizedContent("¿Cuál es el desierto de arena más grande del mundo?", listOf("Sáhara", "Desierto arábigo", "Desierto de Kyzylkum", "Desierto de Gobi"), "Geografia", "El Sáhara es el desierto de arena más grande del mundo, con una extensión de aproximadamente 9,2 millones de km² en el norte de África. Supera ampliamente a otros desiertos de arena como el Rub al-Jali en superficie.")
        ),
        BilingualQuestion(
            id = 50515, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien style de musique de chambre?", listOf("Trio", "Quatuor à cordes", "Quintette", "Duo"), "Culture", "Le quatuor à cordes, avec deux violons, un alto et un violoncelle, s'est imposé comme le style de musique de chambre le plus ancien et le plus emblématique, notamment grâce à Haydn au XVIIIe siècle."),
            en = LocalizedContent("What is the oldest style of chamber music?", listOf("Trio", "String quartet", "Quintet", "Duo"), "Culture", "The string quartet, with two violins, a viola, and a cello, established itself as the oldest and most iconic style of chamber music, notably thanks to Haydn in the 18th century."),
            zh = LocalizedContent("最古老的室内乐风格是什么？", listOf("三重奏", "弦乐四重奏", "五重奏", "二重奏"), "文化", "弦乐四重奏由两把小提琴、一把中提琴和一把大提琴组成，是历史最悠久且最具代表性的室内乐风格，尤其得益于18世纪的海顿。"),
            es = LocalizedContent("¿Cuál es el estilo más antiguo de música de cámara?", listOf("Trío", "Cuarteto de cuerda", "Quinteto", "Dúo"), "Cultura", "El cuarteto de cuerda, con dos violines, una viola y un violonchelo, se consolidó como el estilo más antiguo y emblemático de música de cámara, gracias especialmente a Haydn en el siglo XVIII.")
        ),
        BilingualQuestion(
            id = 50516, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel équipe de tennis a remporté le plus de Billie Jean King Cups?", listOf("États-Unis", "Tchécoslovaquie", "Australie", "Grande-Bretagne"), "Sport", "Les États-Unis sont l'équipe la plus titrée de l'histoire de la Billie Jean King Cup, avec 18 victoires, dont la dernière en 2022."),
            en = LocalizedContent("Which tennis team has won the most Billie Jean King Cups?", listOf("United States", "Czechoslovakia", "Australia", "Great Britain"), "Sports", "The United States is the most successful team in Billie Jean King Cup history, with 18 titles, the most recent in 2022."),
            zh = LocalizedContent("哪支网球队赢得了最多的比利·简·金杯？", listOf("美国", "捷克斯洛伐克", "澳大利亚", "英国"), "体育", "美国是比利·简·金杯历史上最成功的队伍，共获得18次冠军，最近一次是在2022年。"),
            es = LocalizedContent("¿Qué equipo de tenis ha ganado más Copas Billie Jean King?", listOf("Estados Unidos", "Checoslovaquia", "Australia", "Gran Bretaña"), "Deportes", "Estados Unidos es el equipo más laureado en la historia de la Copa Billie Jean King, con 18 victorias, la última en 2022.")
        ),
        BilingualQuestion(
            id = 50517, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a créé 'Anatomy of a Fall'?", listOf("Justine Triet", "Claire Denis", "Lynne Ramsay", "Charlotte Wells"), "Cinéma", "Justine Triet a réalisé ce film, qui a remporté la Palme d'Or au Festival de Cannes 2023."),
            en = LocalizedContent("Which director created 'Anatomy of a Fall'?", listOf("Justine Triet", "Claire Denis", "Lynne Ramsay", "Charlotte Wells"), "Cinema", "Justine Triet directed this film, which won the Palme d'Or at the 2023 Cannes Film Festival."),
            zh = LocalizedContent("哪位导演创作了《坠楼死亡的剖析》？", listOf("茹斯汀·特里耶", "克莱尔·德尼", "琳恩·拉姆塞", "夏洛特·威尔斯"), "电影", "茹斯汀·特里耶执导了这部电影，该片在2023年戛纳电影节上获得了金棕榈奖。"),
            es = LocalizedContent("¿Qué director creó 'Anatomía de una caída'?", listOf("Justine Triet", "Claire Denis", "Lynne Ramsay", "Charlotte Wells"), "Cine", "Justine Triet dirigió esta película, que ganó la Palma de Oro en el Festival de Cannes de 2023.")
        ),
        BilingualQuestion(
            id = 50518, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien style de gospel?", listOf("Spirituals", "Gospel traditionnel", "Choir gospel", "Contemporary gospel"), "Musique", "Les spirituals sont nés au XVIIIe siècle parmi les esclaves afro-américains, mêlant chants de travail et hymnes religieux, bien avant l'émergence du gospel moderne au début du XXe siècle."),
            en = LocalizedContent("What is the oldest style of gospel music?", listOf("Spirituals", "Traditional gospel", "Choir gospel", "Contemporary gospel"), "Music", "Spirituals originated in the 18th century among African American slaves, blending work songs and religious hymns, well before the emergence of modern gospel in the early 20th century."),
            zh = LocalizedContent("最古老的福音音乐风格是什么？", listOf("灵歌", "传统福音", "合唱福音", "当代福音"), "音乐", "灵歌起源于18世纪的非裔美国奴隶中，融合了劳动歌曲和宗教赞美诗，远早于20世纪初现代福音音乐的出现。"),
            es = LocalizedContent("¿Cuál es el estilo más antiguo de música gospel?", listOf("Espirituales", "Gospel tradicional", "Gospel coral", "Gospel contemporáneo"), "Música", "Los espirituales surgieron en el siglo XVIII entre los esclavos afroamericanos, combinando cantos de trabajo e himnos religiosos, mucho antes de la aparición del gospel moderno a principios del siglo XX.")
        ),
        BilingualQuestion(
            id = 50519, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'année de la Chute de l'Empire romain d'Occident?", listOf("410", "456", "476", "500"), "Histoire", "En 476, le dernier empereur romain d'Occident, Romulus Augustule, est déposé par le chef barbare Odoacre, marquant traditionnellement la fin de l'Empire romain d'Occident."),
            en = LocalizedContent("What year was the Fall of the Western Roman Empire?", listOf("410", "456", "476", "500"), "History", "In 476, the last Western Roman Emperor, Romulus Augustulus, was deposed by the barbarian chieftain Odoacer, traditionally marking the end of the Western Roman Empire."),
            zh = LocalizedContent("西罗马帝国在哪一年灭亡？", listOf("410", "456", "476", "500"), "历史", "公元476年，西罗马帝国的最后一位皇帝罗慕路斯·奥古斯都被蛮族首领奥多亚塞废黜，传统上这标志着西罗马帝国的终结。"),
            es = LocalizedContent("¿En qué año ocurrió la Caída del Imperio Romano de Occidente?", listOf("410", "456", "476", "500"), "Historia", "En 476, el último emperador romano de Occidente, Rómulo Augústulo, fue depuesto por el jefe bárbaro Odoacro, marcando tradicionalmente el fin del Imperio Romano de Occidente.")
        ),
        BilingualQuestion(
            id = 50520, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand type de mante religieuse?", listOf("Mante géante", "Mante chinoise", "Mante indienne", "Mante africaine"), "Science", "La mante géante (Hierodula grandis) peut atteindre jusqu'à 12 centimètres, ce qui en fait la plus grande espèce de mante religieuse."),
            en = LocalizedContent("What is the largest type of praying mantis?", listOf("Giant mantis", "Chinese mantis", "Indian mantis", "African mantis"), "Science", "The giant mantis (Hierodula grandis) can reach up to 12 centimeters, making it the largest species of praying mantis."),
            zh = LocalizedContent("最大的螳螂种类是什么？", listOf("巨型螳螂", "中华螳螂", "印度螳螂", "非洲螳螂"), "科学", "巨型螳螂（Hierodula grandis）体长可达12厘米，是最大的螳螂物种。"),
            es = LocalizedContent("¿Cuál es el tipo más grande de mantis religiosa?", listOf("Mantis gigante", "Mantis china", "Mantis india", "Mantis africana"), "Ciencia", "La mantis gigante (Hierodula grandis) puede alcanzar hasta 12 centímetros, lo que la convierte en la especie más grande de mantis religiosa.")
        ),
        BilingualQuestion(
            id = 50521, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand système de grottes du monde?", listOf("Grottes de Carlsbad", "Grottes de Chauvet", "Système de Mammoth", "Grottes de Škocjan"), "Géographie", "Le Système de Mammoth, situé dans le Kentucky aux États-Unis, est le plus long réseau de grottes connu au monde avec plus de 676 kilomètres explorés."),
            en = LocalizedContent("What is the largest cave system in the world?", listOf("Carlsbad Caverns", "Chauvet Cave", "Mammoth Cave System", "Škocjan Caves"), "Geography", "The Mammoth Cave System, located in Kentucky, USA, is the longest known cave network in the world, with over 676 kilometers explored."),
            zh = LocalizedContent("世界上最大的洞穴系统是什么？", listOf("卡尔斯巴德洞窟", "肖维岩洞", "猛犸洞系统", "什科茨扬洞"), "地理", "猛犸洞系统位于美国肯塔基州，是已知世界上最长的洞穴网络，已探索长度超过676公里。"),
            es = LocalizedContent("¿Cuál es el sistema de cuevas más grande del mundo?", listOf("Cavernas de Carlsbad", "Cueva de Chauvet", "Sistema de la Cueva del Mamut", "Cuevas de Škocjan"), "Geografía", "El Sistema de la Cueva del Mamut, ubicado en Kentucky, EE. UU., es la red de cuevas más larga conocida en el mundo, con más de 676 kilómetros explorados.")
        ),
        BilingualQuestion(
            id = 50522, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien concerto jamais écrit?", listOf("Concerto Grosso", "Concerto pour violon", "Concerto pour piano", "Concerto pour cor"), "Culture", "Le Concerto Grosso, forme musicale baroque, est considéré comme le plus ancien type de concerto, apparu au XVIIe siècle avec des compositeurs comme Corelli."),
            en = LocalizedContent("What is the oldest concerto ever written?", listOf("Concerto Grosso", "Violin concerto", "Piano concerto", "Horn concerto"), "Culture", "The Concerto Grosso, a Baroque musical form, is considered the oldest type of concerto, emerging in the 17th century with composers like Corelli."),
            zh = LocalizedContent("有史以来最古老的协奏曲是什么？", listOf("大协奏曲", "小提琴协奏曲", "钢琴协奏曲", "圆号协奏曲"), "文化", "大协奏曲是一种巴洛克音乐形式，被认为是最古老的协奏曲类型，出现于17世纪，代表人物有科雷利。"),
            es = LocalizedContent("¿Cuál es el concierto más antiguo jamás escrito?", listOf("Concierto grosso", "Concierto para violín", "Concierto para piano", "Concierto para trompa"), "Cultura", "El concierto grosso, una forma musical barroca, se considera el tipo de concierto más antiguo, surgido en el siglo XVII con compositores como Corelli.")
        ),
        BilingualQuestion(
            id = 50523, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel équipe de handball a remporté le plus de championnats olympiques?", listOf("France", "Suède", "Russie", "Allemagne"), "Sport", "La Russie (y compris l'URSS) a remporté le plus de titres olympiques en handball, avec quatre médailles d'or masculines et une féminine."),
            en = LocalizedContent("Which handball team has won the most Olympic championships?", listOf("France", "Sweden", "Russia", "Germany"), "Sports", "Russia (including the USSR) has won the most Olympic titles in handball, with four men's gold medals and one women's."),
            zh = LocalizedContent("哪支手球队赢得了最多的奥运会冠军？", listOf("法国", "瑞典", "俄罗斯", "德国"), "体育", "俄罗斯（包括苏联）在奥运手球项目中获得了最多的金牌，男子四次，女子一次。"),
            es = LocalizedContent("¿Qué equipo de balonmano ha ganado más campeonatos olímpicos?", listOf("Francia", "Suecia", "Rusia", "Alemania"), "Deportes", "Rusia (incluyendo la URSS) ha ganado la mayor cantidad de títulos olímpicos en balonmano, con cuatro medallas de oro masculinas y una femenina.")
        ),
        BilingualQuestion(
            id = 50525, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien style de musique folklorique documenté?", listOf("Folk irlandais", "Folk écossais", "Musique folklorique chinoise", "Musique folklorique indienne"), "Musique", "La musique folklorique chinoise est considérée comme la plus ancienne documentée grâce à des textes et instruments datant de la dynastie Zhou (1046-256 av. J.-C.)."),
            en = LocalizedContent("What is the oldest documented style of folk music?", listOf("Irish folk", "Scottish folk", "Chinese folk music", "Indian folk music"), "Music", "Chinese folk music is considered the oldest documented, thanks to texts and instruments dating from the Zhou dynasty (1046-256 BC)."),
            zh = LocalizedContent("有记载的最古老的民间音乐风格是什么？", listOf("爱尔兰民间音乐", "苏格兰民间音乐", "中国民间音乐", "印度民间音乐"), "音乐", "中国民间音乐被认为是有记载的最古老的民间音乐，得益于周朝（公元前1046-256年）的文献和乐器。"),
            es = LocalizedContent("¿Cuál es el estilo más antiguo documentado de música folclórica?", listOf("Folclore irlandés", "Folclore escocés", "Música folclórica china", "Música folclórica india"), "Música", "La música folclórica china se considera la más antigua documentada, gracias a textos e instrumentos que datan de la dinastía Zhou (1046-256 a.C.).")
        ),
    )

    private fun part7(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 50526, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le langage de programmation créé par Guido van Rossum?", listOf("Java", "Python", "C++", "Go"), "Tech", "Guido van Rossum a créé Python à la fin des années 1980, et le langage a été publié pour la première fois en 1991."),
            en = LocalizedContent("What programming language was created by Guido van Rossum?", listOf("Java", "Python", "C++", "Go"), "Technology", "Guido van Rossum created Python in the late 1980s, and the language was first released in 1991."),
            zh = LocalizedContent("吉多·范罗苏姆创建了哪种编程语言？", listOf("Java", "Python", "C++", "Go"), "科技", "吉多·范罗苏姆在20世纪80年代末创建了Python，该语言于1991年首次发布。"),
            es = LocalizedContent("¿Qué lenguaje de programación fue creado por Guido van Rossum?", listOf("Java", "Python", "C++", "Go"), "Tecnología", "Guido van Rossum creó Python a finales de los años 80, y el lenguaje se publicó por primera vez en 1991.")
        ),
        BilingualQuestion(
            id = 50527, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année le premier iPhone a-t-il été lancé?", listOf("2005", "2007", "2009", "2011"), "Tech", "Steve Jobs a dévoilé le premier iPhone le 9 janvier 2007, et il a été mis en vente aux États-Unis le 29 juin de la même année."),
            en = LocalizedContent("In what year was the first iPhone launched?", listOf("2005", "2007", "2009", "2011"), "Technology", "Steve Jobs unveiled the first iPhone on January 9, 2007, and it went on sale in the United States on June 29 of the same year."),
            zh = LocalizedContent("第一代iPhone在哪一年发布？", listOf("2005", "2007", "2009", "2011"), "科技", "史蒂夫·乔布斯于2007年1月9日发布了第一代iPhone，同年6月29日在美国上市。"),
            es = LocalizedContent("¿En qué año se lanzó el primer iPhone?", listOf("2005", "2007", "2009", "2011"), "Tecnología", "Steve Jobs presentó el primer iPhone el 9 de enero de 2007, y salió a la venta en Estados Unidos el 29 de junio del mismo año.")
        ),
        BilingualQuestion(
            id = 50528, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de boutons une souris standard possède-t-elle?", listOf("1", "2", "3", "5"), "Tech", "La souris d'ordinateur standard comporte trois boutons : le clic gauche, le clic droit et la molette qui fait office de troisième bouton."),
            en = LocalizedContent("How many buttons does a standard mouse have?", listOf("1", "2", "3", "5"), "Technology", "A standard computer mouse has three buttons: left click, right click, and the scroll wheel which acts as a third button."),
            zh = LocalizedContent("标准鼠标有多少个按钮？", listOf("1", "2", "3", "5"), "科技", "标准电脑鼠标有三个按钮：左键、右键和滚轮（作为第三个按钮）。"),
            es = LocalizedContent("¿Cuántos botones tiene un ratón estándar?", listOf("1", "2", "3", "5"), "Tecnología", "Un ratón de ordenador estándar tiene tres botones: clic izquierdo, clic derecho y la rueda de desplazamiento que funciona como tercer botón.")
        ),
        BilingualQuestion(
            id = 50529, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que HTML?", listOf("Hyper Text Markup Language", "High Tech Marking Language", "Home Tool Modern Language", "Hyper Transfer Mark Logic"), "Tech", "HTML est l'acronyme de HyperText Markup Language, le langage standard utilisé pour créer et structurer le contenu des pages web."),
            en = LocalizedContent("What does HTML stand for?", listOf("Hyper Text Markup Language", "High Tech Marking Language", "Home Tool Modern Language", "Hyper Transfer Mark Logic"), "Technology", "HTML is an acronym for HyperText Markup Language, the standard language used to create and structure content on web pages."),
            zh = LocalizedContent("HTML代表什么？", listOf("超文本标记语言", "高科技标记语言", "家庭工具现代语言", "超传输标记逻辑"), "科技", "HTML是超文本标记语言的缩写，是用于创建和结构化网页内容的标准语言。"),
            es = LocalizedContent("¿Qué significa HTML?", listOf("Lenguaje de Marcado de Hipertexto", "Lenguaje de Marcado de Alta Tecnología", "Lenguaje Moderno de Herramientas del Hogar", "Lógica de Marcado de Hipertransferencia"), "Tecnología", "HTML es el acrónimo de HyperText Markup Language (Lenguaje de Marcado de Hipertexto), el lenguaje estándar utilizado para crear y estructurar el contenido de las páginas web.")
        ),
        BilingualQuestion(
            id = 50530, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le moteur de recherche le plus utilisé au monde?", listOf("Bing", "Yahoo", "Google", "DuckDuckGo"), "Tech", "Google domine le marché des moteurs de recherche avec plus de 90 % des parts, grâce à son algorithme performant et son indexation massive du web."),
            en = LocalizedContent("What is the most used search engine in the world?", listOf("Bing", "Yahoo", "Google", "DuckDuckGo"), "Technology", "Google dominates the search engine market with over 90% market share, thanks to its efficient algorithm and massive web indexing."),
            zh = LocalizedContent("世界上使用最多的搜索引擎是什么？", listOf("必应", "雅虎", "谷歌", "DuckDuckGo"), "科技", "谷歌凭借其高效的算法和庞大的网页索引，占据了搜索引擎市场超过90%的份额。"),
            es = LocalizedContent("¿Cuál es el motor de búsqueda más utilizado en el mundo?", listOf("Bing", "Yahoo", "Google", "DuckDuckGo"), "Tecnología", "Google domina el mercado de motores de búsqueda con más del 90% de cuota, gracias a su eficiente algoritmo y su masiva indexación web.")
        ),
        BilingualQuestion(
            id = 50531, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capacité d'un disque dur standard de 2023?", listOf("100 GB", "500 GB", "1 TB", "50 GB"), "Tech", "En 2023, le disque dur standard pour un ordinateur personnel offre 1 To de stockage, soit environ 1 000 Go, car c'est un bon équilibre entre coût et capacité pour la majorité des utilisateurs."),
            en = LocalizedContent("What is the capacity of a standard hard drive in 2023?", listOf("100 GB", "500 GB", "1 TB", "50 GB"), "Technology", "In 2023, the standard hard drive for a personal computer offers 1 TB of storage, about 1000 GB, as it provides a good balance between cost and capacity for most users."),
            zh = LocalizedContent("2023年标准硬盘的容量是多少？", listOf("100 GB", "500 GB", "1 TB", "50 GB"), "科技", "2023年，个人电脑的标准硬盘提供1 TB（约1000 GB）的存储空间，这在成本和容量之间取得了良好的平衡，适合大多数用户。"),
            es = LocalizedContent("¿Cuál es la capacidad de un disco duro estándar en 2023?", listOf("100 GB", "500 GB", "1 TB", "50 GB"), "Tecnología", "En 2023, el disco duro estándar para un ordenador personal ofrece 1 TB de almacenamiento, unos 1000 GB, ya que proporciona un buen equilibrio entre coste y capacidad para la mayoría de los usuarios.")
        ),
        BilingualQuestion(
            id = 50532, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le système d'exploitation créé par Apple?", listOf("Windows", "macOS", "Linux", "Android"), "Tech", "macOS est le système d'exploitation des ordinateurs Mac d'Apple, lancé en 2001 sous le nom de Mac OS X."),
            en = LocalizedContent("What is the operating system created by Apple?", listOf("Windows", "macOS", "Linux", "Android"), "Technology", "macOS is the operating system for Apple's Mac computers, launched in 2001 under the name Mac OS X."),
            zh = LocalizedContent("苹果公司创建的操作系统是什么？", listOf("Windows", "macOS", "Linux", "Android"), "科技", "macOS是苹果Mac电脑的操作系统，于2001年以Mac OS X的名称推出。"),
            es = LocalizedContent("¿Cuál es el sistema operativo creado por Apple?", listOf("Windows", "macOS", "Linux", "Android"), "Tecnología", "macOS es el sistema operativo de los ordenadores Mac de Apple, lanzado en 2001 con el nombre de Mac OS X.")
        ),
        BilingualQuestion(
            id = 50533, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien d'octets compose un kilobyte?", listOf("100", "512", "1000", "1024"), "Tech", "En informatique, un kilobyte correspond à 1024 octets car les données sont comptées en base binaire (2^10). Cette convention diffère du système décimal où kilo signifie 1000."),
            en = LocalizedContent("How many bytes make up a kilobyte?", listOf("100", "512", "1000", "1024"), "Technology", "In computing, a kilobyte equals 1024 bytes because data is counted in binary base (2^10). This convention differs from the decimal system where kilo means 1000."),
            zh = LocalizedContent("一千字节由多少字节组成？", listOf("100", "512", "1000", "1024"), "科技", "在计算机科学中，一千字节等于1024字节，因为数据以二进制（2^10）计数。这一惯例不同于十进制系统中千表示1000。"),
            es = LocalizedContent("¿Cuántos bytes componen un kilobyte?", listOf("100", "512", "1000", "1024"), "Tecnología", "En informática, un kilobyte equivale a 1024 bytes porque los datos se cuentan en base binaria (2^10). Esta convención difiere del sistema decimal donde kilo significa 1000.")
        ),
        BilingualQuestion(
            id = 50534, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le protocole sécurisé pour naviguer sur internet?", listOf("HTTP", "FTP", "HTTPS", "SMTP"), "Tech", "HTTPS est la version sécurisée du protocole HTTP, utilisant le chiffrement SSL/TLS pour protéger les données échangées entre le navigateur et le site web."),
            en = LocalizedContent("What is the secure protocol for browsing the internet?", listOf("HTTP", "FTP", "HTTPS", "SMTP"), "Technology", "HTTPS is the secure version of the HTTP protocol, using SSL/TLS encryption to protect data exchanged between the browser and the website."),
            zh = LocalizedContent("浏览互联网的安全协议是什么？", listOf("HTTP", "FTP", "HTTPS", "SMTP"), "科技", "HTTPS是HTTP协议的安全版本，使用SSL/TLS加密来保护浏览器和网站之间交换的数据。"),
            es = LocalizedContent("¿Cuál es el protocolo seguro para navegar por internet?", listOf("HTTP", "FTP", "HTTPS", "SMTP"), "Tecnología", "HTTPS es la versión segura del protocolo HTTP, que utiliza cifrado SSL/TLS para proteger los datos intercambiados entre el navegador y el sitio web.")
        ),
        BilingualQuestion(
            id = 50535, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'un algorithme?", listOf("Un type de virus", "Une suite d'instructions pour résoudre un problème", "Un composant électronique", "Un langage de programmation"), "Tech", "En informatique, un algorithme est une séquence d'opérations définies pas à pas pour accomplir une tâche ou résoudre un problème, comme trier des données ou calculer un itinéraire."),
            en = LocalizedContent("What is an algorithm?", listOf("A type of virus", "A sequence of instructions to solve a problem", "An electronic component", "A programming language"), "Technology", "In computing, an algorithm is a step-by-step sequence of operations defined to accomplish a task or solve a problem, such as sorting data or calculating a route."),
            zh = LocalizedContent("什么是算法？", listOf("一种病毒", "一系列解决问题的指令", "一种电子元件", "一种编程语言"), "科技", "在计算机科学中，算法是为完成某项任务或解决问题而定义的一系列逐步操作，例如对数据进行排序或计算路线。"),
            es = LocalizedContent("¿Qué es un algoritmo?", listOf("Un tipo de virus", "Una secuencia de instrucciones para resolver un problema", "Un componente electrónico", "Un lenguaje de programación"), "Tecnología", "En informática, un algoritmo es una secuencia de operaciones definidas paso a paso para realizar una tarea o resolver un problema, como ordenar datos o calcular una ruta.")
        ),
        BilingualQuestion(
            id = 50536, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nombre binaire équivalent à 10 en décimal?", listOf("1000", "1010", "1100", "1001"), "Tech", "10 en décimal vaut 1010 en binaire car il se décompose en 8+2, soit 1×2³ + 0×2² + 1×2¹ + 0×2⁰."),
            en = LocalizedContent("What is the binary equivalent of decimal 10?", listOf("1000", "1010", "1100", "1001"), "Technology", "Decimal 10 equals binary 1010 because it decomposes into 8+2, i.e., 1×2³ + 0×2² + 1×2¹ + 0×2⁰."),
            zh = LocalizedContent("十进制数10的二进制等价是什么？", listOf("1000", "1010", "1100", "1001"), "科技", "十进制10等于二进制1010，因为它分解为8+2，即1×2³ + 0×2² + 1×2¹ + 0×2⁰。"),
            es = LocalizedContent("¿Cuál es el equivalente binario del decimal 10?", listOf("1000", "1010", "1100", "1001"), "Tecnología", "El decimal 10 equivale al binario 1010 porque se descompone en 8+2, es decir, 1×2³ + 0×2² + 1×2¹ + 0×2⁰.")
        ),
        BilingualQuestion(
            id = 50537, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'IA?", listOf("Intelligence Artificielle", "Internet Automatisé", "Interface d'Application", "Intégration Avancée"), "Tech", "L'IA, ou Intelligence Artificielle, désigne la capacité d'une machine à imiter des fonctions cognitives humaines comme l'apprentissage et la résolution de problèmes. Ce terme a été popularisé dans les années 1950 par John McCarthy."),
            en = LocalizedContent("What is AI?", listOf("Artificial Intelligence", "Automated Internet", "Application Interface", "Advanced Integration"), "Technology", "AI, or Artificial Intelligence, refers to a machine's ability to imitate human cognitive functions such as learning and problem-solving. The term was popularized in the 1950s by John McCarthy."),
            zh = LocalizedContent("什么是AI？", listOf("人工智能", "自动化互联网", "应用程序接口", "高级集成"), "科技", "AI，即人工智能，指机器模仿人类认知功能（如学习和解决问题）的能力。该术语在20世纪50年代由约翰·麦卡锡推广。"),
            es = LocalizedContent("¿Qué es la IA?", listOf("Inteligencia Artificial", "Internet Automatizado", "Interfaz de Aplicación", "Integración Avanzada"), "Tecnología", "La IA, o Inteligencia Artificial, se refiere a la capacidad de una máquina para imitar funciones cognitivas humanas como el aprendizaje y la resolución de problemas. El término fue popularizado en la década de 1950 por John McCarthy.")
        ),
        BilingualQuestion(
            id = 50538, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel langage est utilisé pour les feuilles de style web?", listOf("CSS", "XML", "SQL", "JSON"), "Tech", "CSS (Cascading Style Sheets) est le langage standard pour décrire la présentation et la mise en forme des documents web, comme les couleurs, polices et dispositions."),
            en = LocalizedContent("Which language is used for web style sheets?", listOf("CSS", "XML", "SQL", "JSON"), "Technology", "CSS (Cascading Style Sheets) is the standard language for describing the presentation and formatting of web documents, such as colors, fonts, and layouts."),
            zh = LocalizedContent("哪种语言用于网页样式表？", listOf("CSS", "XML", "SQL", "JSON"), "科技", "CSS（层叠样式表）是描述网页文档呈现和格式（如颜色、字体和布局）的标准语言。"),
            es = LocalizedContent("¿Qué lenguaje se utiliza para las hojas de estilo web?", listOf("CSS", "XML", "SQL", "JSON"), "Tecnología", "CSS (Hojas de Estilo en Cascada) es el lenguaje estándar para describir la presentación y el formato de documentos web, como colores, fuentes y diseños.")
        ),
        BilingualQuestion(
            id = 50539, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le web a-t-il été inventé par Tim Berners-Lee?", listOf("1989", "1991", "1995", "1998"), "Tech", "Tim Berners-Lee a proposé le concept du World Wide Web en 1989, mais le premier site web a été mis en ligne en 1991."),
            en = LocalizedContent("In which year was the web invented by Tim Berners-Lee?", listOf("1989", "1991", "1995", "1998"), "Technology", "Tim Berners-Lee proposed the concept of the World Wide Web in 1989, but the first website went online in 1991."),
            zh = LocalizedContent("蒂姆·伯纳斯-李在哪一年发明了万维网？", listOf("1989", "1991", "1995", "1998"), "科技", "蒂姆·伯纳斯-李于1989年提出了万维网的概念，但第一个网站于1991年上线。"),
            es = LocalizedContent("¿En qué año inventó Tim Berners-Lee la web?", listOf("1989", "1991", "1995", "1998"), "Tecnología", "Tim Berners-Lee propuso el concepto de la World Wide Web en 1989, pero el primer sitio web se puso en línea en 1991.")
        ),
        BilingualQuestion(
            id = 50540, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'une API?", listOf("Application Programming Interface", "Advanced Personal Index", "Automated Process Integration", "Aggregated Platform Interface"), "Tech", "Une API est un ensemble de règles qui permet à deux applications logicielles de communiquer entre elles, comme un serveur de restaurant qui transmet les commandes des clients à la cuisine."),
            en = LocalizedContent("What is an API?", listOf("Application Programming Interface", "Advanced Personal Index", "Automated Process Integration", "Aggregated Platform Interface"), "Technology", "An API is a set of rules that allows two software applications to communicate with each other, like a restaurant server relaying customer orders to the kitchen."),
            zh = LocalizedContent("什么是API？", listOf("应用程序编程接口", "高级个人索引", "自动化流程集成", "聚合平台接口"), "科技", "API是一组规则，允许两个软件应用程序相互通信，就像餐厅服务员将顾客订单传递给厨房一样。"),
            es = LocalizedContent("¿Qué es una API?", listOf("Interfaz de Programación de Aplicaciones", "Índice Personal Avanzado", "Integración de Procesos Automatizados", "Interfaz de Plataforma Agregada"), "Tecnología", "Una API es un conjunto de reglas que permite que dos aplicaciones de software se comuniquen entre sí, como un camarero de restaurante que transmite los pedidos de los clientes a la cocina.")
        ),
        BilingualQuestion(
            id = 50541, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le cloud computing?", listOf("Calcul sur un ordinateur local", "Stockage et calcul via internet", "Un type de virus informatique", "Un navigateur web"), "Tech", "Le cloud computing désigne la mise à disposition de ressources informatiques (stockage, puissance de calcul) via internet, permettant d'éviter la gestion de serveurs physiques locaux."),
            en = LocalizedContent("What is cloud computing?", listOf("Computing on a local computer", "Storage and computing via the internet", "A type of computer virus", "A web browser"), "Technology", "Cloud computing refers to the on-demand availability of computing resources (storage, processing power) over the internet, avoiding the need to manage local physical servers."),
            zh = LocalizedContent("什么是云计算？", listOf("在本地计算机上计算", "通过互联网进行存储和计算", "一种计算机病毒", "一种网页浏览器"), "科技", "云计算指通过互联网按需提供计算资源（存储、处理能力），无需管理本地物理服务器。"),
            es = LocalizedContent("¿Qué es la computación en la nube?", listOf("Cálculo en un ordenador local", "Almacenamiento y cálculo a través de internet", "Un tipo de virus informático", "Un navegador web"), "Tecnología", "La computación en la nube se refiere a la disponibilidad bajo demanda de recursos informáticos (almacenamiento, potencia de procesamiento) a través de internet, evitando la necesidad de gestionar servidores físicos locales.")
        ),
        BilingualQuestion(
            id = 50542, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de pixels composent une image 4K?", listOf("1920x1080", "2560x1440", "3840x2160", "1280x720"), "Tech", "La résolution 4K standard est définie par 3840 pixels de large sur 2160 pixels de haut, soit environ 8,3 millions de pixels au total. Ce format est appelé Ultra HD."),
            en = LocalizedContent("How many pixels make up a 4K image?", listOf("1920x1080", "2560x1440", "3840x2160", "1280x720"), "Technology", "Standard 4K resolution is defined as 3840 pixels wide by 2160 pixels high, totaling about 8.3 million pixels. This format is called Ultra HD."),
            zh = LocalizedContent("4K图像由多少像素组成？", listOf("1920x1080", "2560x1440", "3840x2160", "1280x720"), "科技", "标准4K分辨率定义为3840像素宽、2160像素高，总计约830万像素。这种格式称为超高清。"),
            es = LocalizedContent("¿Cuántos píxeles componen una imagen 4K?", listOf("1920x1080", "2560x1440", "3840x2160", "1280x720"), "Tecnología", "La resolución 4K estándar se define como 3840 píxeles de ancho por 2160 píxeles de alto, totalizando aproximadamente 8,3 millones de píxeles. Este formato se llama Ultra HD.")
        ),
        BilingualQuestion(
            id = 50543, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que JavaScript?", listOf("Un langage de programmation pour le web", "Un système d'exploitation", "Un type de serveur", "Un protocole réseau"), "Tech", "JavaScript est un langage de programmation principalement utilisé pour rendre les pages web interactives, côté client. Créé en 1995, il est aujourd'hui essentiel au développement web moderne."),
            en = LocalizedContent("What is JavaScript?", listOf("A programming language for the web", "An operating system", "A type of server", "A network protocol"), "Technology", "JavaScript is a programming language primarily used to make web pages interactive on the client side. Created in 1995, it is now essential for modern web development."),
            zh = LocalizedContent("什么是JavaScript？", listOf("一种用于网页的编程语言", "一种操作系统", "一种服务器类型", "一种网络协议"), "科技", "JavaScript是一种主要用于在客户端使网页交互的编程语言。它创建于1995年，如今是现代网页开发的基础。"),
            es = LocalizedContent("¿Qué es JavaScript?", listOf("Un lenguaje de programación para la web", "Un sistema operativo", "Un tipo de servidor", "Un protocolo de red"), "Tecnología", "JavaScript es un lenguaje de programación utilizado principalmente para hacer páginas web interactivas en el lado del cliente. Creado en 1995, hoy es esencial para el desarrollo web moderno.")
        ),
        BilingualQuestion(
            id = 50544, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le fondateur de Microsoft?", listOf("Steve Jobs", "Bill Gates", "Mark Zuckerberg", "Larry Page"), "Tech", "Bill Gates a cofondé Microsoft avec Paul Allen en 1975, lançant ainsi l'un des plus grands éditeurs de logiciels au monde."),
            en = LocalizedContent("Who is the founder of Microsoft?", listOf("Steve Jobs", "Bill Gates", "Mark Zuckerberg", "Larry Page"), "Technology", "Bill Gates co-founded Microsoft with Paul Allen in 1975, launching one of the world's largest software companies."),
            zh = LocalizedContent("微软的创始人是谁？", listOf("史蒂夫·乔布斯", "比尔·盖茨", "马克·扎克伯格", "拉里·佩奇"), "科技", "比尔·盖茨于1975年与保罗·艾伦共同创立了微软，推出了世界上最大的软件公司之一。"),
            es = LocalizedContent("¿Quién es el fundador de Microsoft?", listOf("Steve Jobs", "Bill Gates", "Mark Zuckerberg", "Larry Page"), "Tecnología", "Bill Gates cofundó Microsoft con Paul Allen en 1975, lanzando una de las empresas de software más grandes del mundo.")
        ),
        BilingualQuestion(
            id = 50545, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le machine learning?", listOf("L'apprentissage automatique", "Un type de serveur", "Un câble réseau", "Un protocole FTP"), "Tech", "Le terme anglais \"machine learning\" a été officialisé en français comme \"apprentissage automatique\" par la Commission d'enrichissement de la langue française en 2017."),
            en = LocalizedContent("What is machine learning?", listOf("Automatic learning", "A type of server", "A network cable", "An FTP protocol"), "Technology", "The English term \"machine learning\" was officially adopted in French as \"apprentissage automatique\" by the Commission for the Enrichment of the French Language in 2017."),
            zh = LocalizedContent("什么是机器学习？", listOf("自动学习", "一种服务器类型", "一种网线", "一种FTP协议"), "科技", "英语术语\"machine learning\"于2017年被法语语言丰富委员会正式采纳为法语\"apprentissage automatique\"。"),
            es = LocalizedContent("¿Qué es el machine learning?", listOf("Aprendizaje automático", "Un tipo de servidor", "Un cable de red", "Un protocolo FTP"), "Tecnología", "El término inglés \"machine learning\" fue oficializado en francés como \"apprentissage automatique\" por la Comisión de Enriquecimiento de la Lengua Francesa en 2017.")
        ),
    )
}
