package com.prometheus.clq.data

import com.prometheus.clq.model.BilingualQuestion
import com.prometheus.clq.model.Difficulty
import com.prometheus.clq.model.Language
import com.prometheus.clq.model.LocalizedContent
import com.prometheus.clq.model.Question

/** Auto-generated batch 14 : 500 questions bilingues */
object QuestionsBilingualGenerated_14 {
    fun get(lang: Language = Language.FR): List<Question> = list.map { it.toQuestion(lang) }

    val list: List<BilingualQuestion> by lazy {
        part1() + part2() + part3() + part4() + part5() + part6() + part7()
    }

    private fun part1(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 13209, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La Déclaration d'indépendance américaine date de?", listOf("1775", "1776", "1777", "1778"), "Histoire", "Adoptée le 4 juillet 1776 par le Congrès continental, elle proclame la séparation des treize colonies britanniques et la naissance des États-Unis."),
            en = LocalizedContent("When was the American Declaration of Independence signed?", listOf("1775", "1776", "1777", "1778"), "History", "Adopted on July 4, 1776 by the Continental Congress, it proclaimed the separation of the thirteen British colonies and the birth of the United States."),
            zh = LocalizedContent("美国独立宣言签署于哪一年？", listOf("1775年", "1776年", "1777年", "1778年"), "历史", "1776年7月4日由大陆会议通过，宣布十三个英国殖民地脱离英国，美利坚合众国诞生。"),
            es = LocalizedContent("¿De qué año data la Declaración de Independencia de los Estados Unidos?", listOf("1775", "1776", "1777", "1778"), "Historia", "Adoptada el 4 de julio de 1776 por el Congreso Continental, proclamó la separación de las trece colonias británicas y el nacimiento de los Estados Unidos.")
        ),
        BilingualQuestion(
            id = 13210, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a signé principalement la Déclaration d'indépendance américaine?", listOf("George Washington", "Benjamin Franklin", "Thomas Jefferson", "Adams"), "Histoire", "Thomas Jefferson, alors délégué de la Virginie, fut le principal rédacteur du texte de la Déclaration d'indépendance, adoptée le 4 juillet 1776."),
            en = LocalizedContent("Who primarily signed the American Declaration of Independence?", listOf("George Washington", "Benjamin Franklin", "Thomas Jefferson", "Adams"), "History", "Thomas Jefferson, then a delegate from Virginia, was the principal author of the Declaration of Independence, adopted on July 4, 1776."),
            zh = LocalizedContent("谁主要签署了美国独立宣言？", listOf("乔治·华盛顿", "本杰明·富兰克林", "托马斯·杰斐逊", "亚当斯"), "历史", "托马斯·杰斐逊，当时是弗吉尼亚州的代表，是独立宣言的主要起草人，该宣言于1776年7月4日通过。"),
            es = LocalizedContent("¿Quién firmó principalmente la Declaración de Independencia de los Estados Unidos?", listOf("George Washington", "Benjamin Franklin", "Thomas Jefferson", "Adams"), "Historia", "Thomas Jefferson, entonces delegado de Virginia, fue el principal redactor del texto de la Declaración de Independencia, adoptada el 4 de julio de 1776.")
        ),
        BilingualQuestion(
            id = 13211, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Les Croisades étaient dirigées contre le pouvoir?", listOf("Ottoman", "Mongol", "Arabe", "Perse"), "Histoire", "Les Croisades étaient des expéditions militaires chrétiennes visant à reprendre Jérusalem et d'autres lieux saints, alors sous contrôle musulman, principalement dirigé par les Arabes."),
            en = LocalizedContent("The Crusades were directed against which power?", listOf("Ottoman", "Mongol", "Arab", "Persian"), "History", "The Crusades were Christian military expeditions aimed at recapturing Jerusalem and other holy sites, then under Muslim control, primarily led by Arabs."),
            zh = LocalizedContent("十字军东征是针对哪个势力的？", listOf("奥斯曼", "蒙古", "阿拉伯", "波斯"), "历史", "十字军东征是基督教军事远征，旨在夺回耶路撒冷和其他圣地，当时这些地方处于穆斯林控制下，主要由阿拉伯人领导。"),
            es = LocalizedContent("¿Las Cruzadas estaban dirigidas contra qué poder?", listOf("Otomano", "Mongol", "Árabe", "Persa"), "Historia", "Las Cruzadas fueron expediciones militares cristianas para recuperar Jerusalén y otros lugares sagrados, entonces bajo control musulmán, principalmente liderado por los árabes.")
        ),
        BilingualQuestion(
            id = 13212, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La première Croisade débuta en?", listOf("1095", "1096", "1097", "1098"), "Histoire", "L'appel à la croisade fut lancé par le pape Urbain II lors du concile de Clermont en novembre 1095."),
            en = LocalizedContent("When did the First Crusade begin?", listOf("1095", "1096", "1097", "1098"), "History", "The call for the crusade was launched by Pope Urban II at the Council of Clermont in November 1095."),
            zh = LocalizedContent("第一次十字军东征始于哪一年？", listOf("1095年", "1096年", "1097年", "1098年"), "历史", "教皇乌尔班二世在1095年11月的克莱蒙会议上发起了十字军东征的号召。"),
            es = LocalizedContent("¿En qué año comenzó la Primera Cruzada?", listOf("1095", "1096", "1097", "1098"), "Historia", "El llamamiento a la cruzada fue lanzado por el papa Urbano II en el Concilio de Clermont en noviembre de 1095.")
        ),
        BilingualQuestion(
            id = 13213, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle Croisade reprit Jérusalem en 1187?", listOf("Deuxième", "Troisième", "Quatrième", "Cinquième"), "Histoire", "La troisième croisade (1189-1192) fut lancée après la prise de Jérusalem par Saladin en 1187, mais elle échoua à reprendre la ville."),
            en = LocalizedContent("Which Crusade recaptured Jerusalem in 1187?", listOf("Second", "Third", "Fourth", "Fifth"), "History", "The Third Crusade (1189-1192) was launched after Saladin's capture of Jerusalem in 1187, but it failed to recapture the city."),
            zh = LocalizedContent("哪次十字军东征在1187年夺回了耶路撒冷？", listOf("第二次", "第三次", "第四次", "第五次"), "历史", "第三次十字军东征（1189-1192）是在萨拉丁于1187年占领耶路撒冷后发起的，但未能夺回该城。"),
            es = LocalizedContent("¿Qué Cruzada recuperó Jerusalén en 1187?", listOf("Segunda", "Tercera", "Cuarta", "Quinta"), "Historia", "La Tercera Cruzada (1189-1192) se lanzó tras la toma de Jerusalén por Saladino en 1187, pero fracasó en recuperar la ciudad.")
        ),
        BilingualQuestion(
            id = 13214, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'Empire mongol s'effondra finalement au?", listOf("14e siècle", "15e siècle", "16e siècle", "17e siècle"), "Histoire", "L'Empire mongol, après son apogée au 13e siècle, se fragmenta en plusieurs khanats rivaux qui déclinèrent progressivement, et la dernière entité mongole unifiée, la dynastie Yuan en Chine, tomba en 1368, marquant la fin effective de l'empire au début du 15e siècle."),
            en = LocalizedContent("The Mongol Empire finally collapsed in which century?", listOf("14th century", "15th century", "16th century", "17th century"), "History", "The Mongol Empire, after its peak in the 13th century, fragmented into rival khanates that gradually declined, and the last unified Mongol entity, the Yuan dynasty in China, fell in 1368, marking the effective end of the empire by the early 15th century."),
            zh = LocalizedContent("蒙古帝国最终在哪个世纪崩溃？", listOf("14世纪", "15世纪", "16世纪", "17世纪"), "历史", "蒙古帝国在13世纪达到顶峰后，分裂为相互竞争的汗国并逐渐衰落，最后一个统一的蒙古政权——中国的元朝于1368年灭亡，标志着帝国在15世纪初实际终结。"),
            es = LocalizedContent("¿El Imperio mongol colapsó finalmente en qué siglo?", listOf("Siglo XIV", "Siglo XV", "Siglo XVI", "Siglo XVII"), "Historia", "El Imperio mongol, tras su apogeo en el siglo XIII, se fragmentó en kanatos rivales que declinaron gradualmente, y la última entidad mongola unificada, la dinastía Yuan en China, cayó en 1368, marcando el fin efectivo del imperio a principios del siglo XV.")
        ),
        BilingualQuestion(
            id = 13215, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le Bushido était le code des?", listOf("Guerriers ottomans", "Samourais japonais", "Chevaliers croisés", "Guerriers mongols"), "Histoire", "Le Bushido, signifiant la voie du guerrier, était le code moral et éthique suivi par les samouraïs au Japon féodal."),
            en = LocalizedContent("Bushido was the code of the?", listOf("Ottoman warriors", "Japanese samurai", "Crusader knights", "Mongol warriors"), "History", "Bushido, meaning 'the way of the warrior', was the moral and ethical code followed by samurai in feudal Japan."),
            zh = LocalizedContent("武士道是哪个群体的准则？", listOf("奥斯曼战士", "日本武士", "十字军骑士", "蒙古战士"), "历史", "武士道意为“武士之道”，是日本封建时代武士遵循的道德和行为准则。"),
            es = LocalizedContent("¿El Bushido era el código de los?", listOf("Guerreros otomanos", "Samuráis japoneses", "Caballeros cruzados", "Guerreros mongoles"), "Historia", "El Bushido, que significa 'el camino del guerrero', era el código moral y ético seguido por los samuráis en el Japón feudal.")
        ),
        BilingualQuestion(
            id = 13216, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Grande Mosquée bleue fut construite à?", listOf("Damas", "Istanbul", "Le Caire", "Bagdad"), "Histoire", "La mosquée bleue, ou Sultanahmet, fut construite à Istanbul sous le règne d'Ahmed Ier, entre 1609 et 1616."),
            en = LocalizedContent("The Great Blue Mosque was built in?", listOf("Damascus", "Istanbul", "Cairo", "Baghdad"), "History", "The Blue Mosque, or Sultanahmet Mosque, was built in Istanbul under the reign of Ahmed I, between 1609 and 1616."),
            zh = LocalizedContent("蓝色清真寺建于哪里？", listOf("大马士革", "伊斯坦布尔", "开罗", "巴格达"), "历史", "蓝色清真寺，又称苏丹艾哈迈德清真寺，建于伊斯坦布尔，在艾哈迈德一世统治期间，于1609年至1616年建成。"),
            es = LocalizedContent("¿La Gran Mezquita Azul fue construida en?", listOf("Damasco", "Estambul", "El Cairo", "Bagdad"), "Historia", "La Mezquita Azul, o Mezquita del Sultán Ahmed, fue construida en Estambul bajo el reinado de Ahmed I, entre 1609 y 1616.")
        ),
        BilingualQuestion(
            id = 13217, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel empire contrôlait le détroit de Bosphore au 15e siècle?", listOf("Byzance", "Ottoman", "Génois", "Vénitien"), "Histoire", "L'Empire ottoman a conquis Constantinople en 1453, prenant ainsi le contrôle du détroit de Bosphore, une voie stratégique entre l'Europe et l'Asie."),
            en = LocalizedContent("Which empire controlled the Bosphorus Strait in the 15th century?", listOf("Byzantine", "Ottoman", "Genoese", "Venetian"), "History", "The Ottoman Empire conquered Constantinople in 1453, thus taking control of the Bosphorus Strait, a strategic waterway between Europe and Asia."),
            zh = LocalizedContent("15世纪哪个帝国控制了博斯普鲁斯海峡？", listOf("拜占庭", "奥斯曼", "热那亚", "威尼斯"), "历史", "奥斯曼帝国于1453年征服君士坦丁堡，从而控制了博斯普鲁斯海峡，这是连接欧洲和亚洲的战略水道。"),
            es = LocalizedContent("¿Qué imperio controlaba el estrecho del Bósforo en el siglo XV?", listOf("Bizantino", "Otomano", "Genovés", "Venecino"), "Historia", "El Imperio otomano conquistó Constantinopla en 1453, tomando así el control del estrecho del Bósforo, una vía estratégica entre Europa y Asia.")
        ),
        BilingualQuestion(
            id = 13218, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La dynastie Ming en Chine succéda à?", listOf("Yuan", "Song", "Tang", "Han"), "Histoire", "La dynastie Ming a renversé la dynastie Yuan, d'origine mongole, fondée par Kubilai Khan, mettant fin à la domination mongole sur la Chine."),
            en = LocalizedContent("The Ming dynasty in China succeeded which dynasty?", listOf("Yuan", "Song", "Tang", "Han"), "History", "The Ming dynasty overthrew the Yuan dynasty, of Mongol origin, founded by Kublai Khan, ending Mongol rule over China."),
            zh = LocalizedContent("中国明朝取代了哪个朝代？", listOf("元朝", "宋朝", "唐朝", "汉朝"), "历史", "明朝推翻了由忽必烈建立的蒙古元朝，结束了蒙古对中国的统治。"),
            es = LocalizedContent("¿La dinastía Ming en China sucedió a qué dinastía?", listOf("Yuan", "Song", "Tang", "Han"), "Historia", "La dinastía Ming derrocó a la dinastía Yuan, de origen mongol, fundada por Kublai Khan, poniendo fin al dominio mongol sobre China.")
        ),
        BilingualQuestion(
            id = 13219, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les samourais disparurent en tant que classe au?", listOf("17e siècle", "18e siècle", "19e siècle", "20e siècle"), "Histoire", "La restauration de Meiji en 1868 abolit le système féodal et les privilèges des samouraïs, mettant fin à leur existence en tant que classe sociale distincte au 19e siècle."),
            en = LocalizedContent("The samurai disappeared as a class in the?", listOf("17th century", "18th century", "19th century", "20th century"), "History", "The Meiji Restoration in 1868 abolished the feudal system and samurai privileges, ending their existence as a distinct social class in the 19th century."),
            zh = LocalizedContent("武士作为一个阶级消失于？", listOf("17世纪", "18世纪", "19世纪", "20世纪"), "历史", "1868年的明治维新废除了封建制度和武士特权，使武士作为一个独特的社会阶级在19世纪终结。"),
            es = LocalizedContent("Los samuráis desaparecieron como clase en el?", listOf("siglo XVII", "siglo XVIII", "siglo XIX", "siglo XX"), "Historia", "La Restauración Meiji en 1868 abolió el sistema feudal y los privilegios de los samuráis, poniendo fin a su existencia como clase social distinta en el siglo XIX.")
        ),
        BilingualQuestion(
            id = 13220, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle ville fut le siège principal de l'Empire byzantin?", listOf("Athènes", "Constantinople", "Rome", "Ankara"), "Histoire", "Constantinople, fondée par Constantin Ier en 330, fut la capitale de l'Empire byzantin jusqu'à sa chute en 1453, servant de centre politique, économique et religieux."),
            en = LocalizedContent("Which city was the main seat of the Byzantine Empire?", listOf("Athens", "Constantinople", "Rome", "Ankara"), "History", "Constantinople, founded by Constantine I in 330, was the capital of the Byzantine Empire until its fall in 1453, serving as the political, economic, and religious center."),
            zh = LocalizedContent("哪座城市是拜占庭帝国的主要所在地？", listOf("雅典", "君士坦丁堡", "罗马", "安卡拉"), "历史", "君士坦丁堡由君士坦丁一世于330年建立，是拜占庭帝国的首都，直至1453年陷落，一直是政治、经济和宗教中心。"),
            es = LocalizedContent("¿Qué ciudad fue la sede principal del Imperio Bizantino?", listOf("Atenas", "Constantinopla", "Roma", "Ankara"), "Historia", "Constantinopla, fundada por Constantino I en 330, fue la capital del Imperio Bizantino hasta su caída en 1453, sirviendo como centro político, económico y religioso.")
        ),
        BilingualQuestion(
            id = 13221, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le code de Hammurabi appartenait à quel peuple?", listOf("Égyptiens", "Babyloniens", "Perses", "Hindous"), "Histoire", "Hammurabi était le sixième roi de la première dynastie babylonienne, et son code de lois est l'un des plus anciens ensembles juridiques connus, rédigé en akkadien vers 1750 av. J.-C."),
            en = LocalizedContent("The Code of Hammurabi belonged to which people?", listOf("Egyptians", "Babylonians", "Persians", "Hindus"), "History", "Hammurabi was the sixth king of the First Babylonian Dynasty, and his law code is one of the oldest known legal codes, written in Akkadian around 1750 BC."),
            zh = LocalizedContent("汉谟拉比法典属于哪个民族？", listOf("埃及人", "巴比伦人", "波斯人", "印度人"), "历史", "汉谟拉比是第一巴比伦王朝的第六位国王，他的法典是已知最古老的法典之一，约公元前1750年用阿卡德语写成。"),
            es = LocalizedContent("El Código de Hammurabi pertenecía a qué pueblo?", listOf("Egipcios", "Babilonios", "Persas", "Hindúes"), "Historia", "Hammurabi fue el sexto rey de la primera dinastía babilónica, y su código de leyes es uno de los conjuntos legales más antiguos conocidos, redactado en acadio hacia 1750 a.C.")
        ),
        BilingualQuestion(
            id = 13222, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les croisades ont duré approximativement?", listOf("100 ans", "150 ans", "200 ans", "300 ans"), "Histoire", "La première croisade a été lancée en 1096 et la dernière grande expédition, la neuvième croisade, s'est achevée en 1272, soit une période d'environ 200 ans."),
            en = LocalizedContent("The Crusades lasted approximately?", listOf("100 years", "150 years", "200 years", "300 years"), "History", "The First Crusade was launched in 1096 and the last major expedition, the Ninth Crusade, ended in 1272, a period of about 200 years."),
            zh = LocalizedContent("十字军东征大约持续了？", listOf("100年", "150年", "200年", "300年"), "历史", "第一次十字军东征始于1096年，最后一次大规模远征（第九次十字军东征）于1272年结束，历时约200年。"),
            es = LocalizedContent("Las Cruzadas duraron aproximadamente?", listOf("100 años", "150 años", "200 años", "300 años"), "Historia", "La Primera Cruzada se lanzó en 1096 y la última gran expedición, la Novena Cruzada, finalizó en 1272, un período de unos 200 años.")
        ),
        BilingualQuestion(
            id = 13223, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était le prétexte principal des Croisades?", listOf("Expansion commerciale", "Récupérer la Terre Sainte", "Colonisation", "Exploration"), "Histoire", "Les Croisades étaient des expéditions militaires lancées par les chrétiens d'Occident à partir de 1095, officiellement pour reprendre Jérusalem et les lieux saints aux musulmans."),
            en = LocalizedContent("What was the main pretext of the Crusades?", listOf("Commercial expansion", "Recover the Holy Land", "Colonization", "Exploration"), "History", "The Crusades were military expeditions launched by Western Christians starting in 1095, officially to retake Jerusalem and the holy sites from Muslims."),
            zh = LocalizedContent("十字军东征的主要借口是什么？", listOf("商业扩张", "收复圣地", "殖民", "探险"), "历史", "十字军东征是西方基督徒从1095年开始发起的军事远征，官方目的是从穆斯林手中夺回耶路撒冷和圣地。"),
            es = LocalizedContent("¿Cuál fue el pretexto principal de las Cruzadas?", listOf("Expansión comercial", "Recuperar Tierra Santa", "Colonización", "Exploración"), "Historia", "Las Cruzadas fueron expediciones militares lanzadas por los cristianos occidentales a partir de 1095, oficialmente para recuperar Jerusalén y los lugares sagrados de los musulmanes.")
        ),
        BilingualQuestion(
            id = 13224, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("L'indépendance des États-Unis causa une rupture avec?", listOf("La Francce", "L'Espagne", "L'Angleterre", "La Hollande"), "Histoire", "La guerre d'indépendance américaine (1775-1783) opposa les Treize colonies à leur métropole, le Royaume de Grande-Bretagne, menant à la rupture officielle avec l'Angleterre."),
            en = LocalizedContent("The independence of the United States caused a break with?", listOf("France", "Spain", "England", "Holland"), "History", "The American Revolutionary War (1775-1783) pitted the Thirteen Colonies against their mother country, the Kingdom of Great Britain, leading to a formal break with England."),
            zh = LocalizedContent("美国的独立导致了与哪个国家的决裂？", listOf("法国", "西班牙", "英国", "荷兰"), "历史", "美国独立战争（1775-1783）使十三个殖民地与其母国大不列颠王国对抗，最终导致与英国的正式决裂。"),
            es = LocalizedContent("La independencia de Estados Unidos causó una ruptura con?", listOf("Francia", "España", "Inglaterra", "Holanda"), "Historia", "La Guerra de Independencia de Estados Unidos (1775-1783) enfrentó a las Trece Colonias con su metrópoli, el Reino de Gran Bretaña, llevando a la ruptura oficial con Inglaterra.")
        ),
        BilingualQuestion(
            id = 13225, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Marco Polo voyagea en Chine durant l'Empire?", listOf("Ming", "Tang", "Yuan", "Song"), "Histoire", "Marco Polo atteignit la Chine sous la dynastie mongole des Yuan, fondée par Kubilai Khan, petit-fils de Gengis Khan."),
            en = LocalizedContent("Marco Polo traveled to China during the Empire?", listOf("Ming", "Tang", "Yuan", "Song"), "History", "Marco Polo reached China under the Mongol Yuan dynasty, founded by Kublai Khan, grandson of Genghis Khan."),
            zh = LocalizedContent("马可·波罗在哪个帝国时期旅行到中国？", listOf("明朝", "唐朝", "元朝", "宋朝"), "历史", "马可·波罗在蒙古元朝时期到达中国，元朝由成吉思汗的孙子忽必烈建立。"),
            es = LocalizedContent("Marco Polo viajó a China durante el Imperio?", listOf("Ming", "Tang", "Yuan", "Song"), "Historia", "Marco Polo llegó a China bajo la dinastía mongola Yuan, fundada por Kublai Kan, nieto de Gengis Kan.")
        ),
        BilingualQuestion(
            id = 13226, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La chute de Constantinople en 1453 marqua le début du déclin de?", listOf("Byzance", "Rome", "La Perse", "La Grèce"), "Histoire", "La prise de Constantinople par les Ottomans en 1453 mit fin à l'Empire byzantin, entamant son déclin définitif après des siècles de rétrécissement territorial."),
            en = LocalizedContent("The fall of Constantinople in 1453 marked the beginning of the decline of?", listOf("Byzantium", "Rome", "Persia", "Greece"), "History", "The capture of Constantinople by the Ottomans in 1453 ended the Byzantine Empire, initiating its final decline after centuries of territorial shrinkage."),
            zh = LocalizedContent("1453年君士坦丁堡的陷落标志着哪个帝国的衰落开始？", listOf("拜占庭", "罗马", "波斯", "希腊"), "历史", "1453年奥斯曼人攻占君士坦丁堡结束了拜占庭帝国，在几个世纪的领土萎缩后，开始了其最终的衰落。"),
            es = LocalizedContent("La caída de Constantinopla en 1453 marcó el inicio del declive de?", listOf("Bizancio", "Roma", "Persia", "Grecia"), "Historia", "La toma de Constantinopla por los otomanos en 1453 puso fin al Imperio Bizantino, iniciando su declive definitivo tras siglos de reducción territorial.")
        ),
        BilingualQuestion(
            id = 13227, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel traité reconnut l'indépendance américaine?", listOf("Traité de Paris 1763", "Traité de Paris 1783", "Traité de Versailles", "Traité de Westphalie"), "Histoire", "Le traité de Paris de 1783 mit fin à la guerre d'indépendance américaine, officialisant la reconnaissance de la souveraineté des États-Unis par la Grande-Bretagne."),
            en = LocalizedContent("Which treaty recognized American independence?", listOf("Treaty of Paris 1763", "Treaty of Paris 1783", "Treaty of Versailles", "Treaty of Westphalia"), "History", "The Treaty of Paris of 1783 ended the American Revolutionary War, formalizing Great Britain's recognition of the sovereignty of the United States."),
            zh = LocalizedContent("哪个条约承认了美国独立？", listOf("1763年巴黎条约", "1783年巴黎条约", "凡尔赛条约", "威斯特伐利亚条约"), "历史", "1783年的巴黎条约结束了美国独立战争，正式确认了英国对美国主权的承认。"),
            es = LocalizedContent("¿Qué tratado reconoció la independencia estadounidense?", listOf("Tratado de París 1763", "Tratado de París 1783", "Tratado de Versalles", "Tratado de Westfalia"), "Historia", "El Tratado de París de 1783 puso fin a la Guerra de Independencia de Estados Unidos, formalizando el reconocimiento de la soberanía de los Estados Unidos por parte de Gran Bretaña.")
        ),
        BilingualQuestion(
            id = 13228, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Japon féodal était divisé entre plusieurs?", listOf("Rois", "Daimyo", "Empereurs", "Patriarches"), "Histoire", "Le Japon féodal était divisé en plusieurs fiefs gouvernés par des seigneurs locaux appelés daimyo, qui détenaient un pouvoir militaire et économique important."),
            en = LocalizedContent("Feudal Japan was divided among several?", listOf("Kings", "Daimyo", "Emperors", "Patriarchs"), "History", "Feudal Japan was divided into several fiefs governed by local lords called daimyo, who held significant military and economic power."),
            zh = LocalizedContent("封建时期的日本被分割为多个？", listOf("国王", "大名", "天皇", "族长"), "历史", "封建时期的日本被分割为多个由地方领主（称为大名）统治的封地，这些大名拥有重要的军事和经济权力。"),
            es = LocalizedContent("El Japón feudal estaba dividido entre varios?", listOf("Reyes", "Daimyo", "Emperadores", "Patriarcas"), "Historia", "El Japón feudal estaba dividido en varios feudos gobernados por señores locales llamados daimyo, que poseían un importante poder militar y económico.")
        ),
        BilingualQuestion(
            id = 13229, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a unifiée le Japon à la fin du 16e siècle?", listOf("Tokugawa", "Oda Nobunaga", "Toyotomi", "Ashikaga"), "Histoire", "Oda Nobunaga a amorcé l'unification du Japon en brisant le pouvoir des seigneurs de la guerre féodaux, mais c'est son successeur Toyotomi Hideyoshi qui l'a achevée."),
            en = LocalizedContent("Who unified Japan at the end of the 16th century?", listOf("Tokugawa", "Oda Nobunaga", "Toyotomi", "Ashikaga"), "History", "Oda Nobunaga began the unification of Japan by breaking the power of feudal warlords, but it was his successor Toyotomi Hideyoshi who completed it."),
            zh = LocalizedContent("谁在16世纪末统一了日本？", listOf("德川", "织田信长", "丰臣", "足利"), "历史", "织田信长通过打破封建军阀的权力开始了日本的统一，但完成统一的是他的继任者丰臣秀吉。"),
            es = LocalizedContent("¿Quién unificó Japón a finales del siglo XVI?", listOf("Tokugawa", "Oda Nobunaga", "Toyotomi", "Ashikaga"), "Historia", "Oda Nobunaga inició la unificación de Japón rompiendo el poder de los señores feudales, pero fue su sucesor Toyotomi Hideyoshi quien la completó.")
        ),
        BilingualQuestion(
            id = 13230, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La Pax Romana était l'époque de paix en?", listOf("Empire byzantin", "Empire ottoman", "Empire romain", "Empire mongol"), "Histoire", "La Pax Romana désigne la longue période de stabilité et de prospérité imposée par l'Empire romain dans le bassin méditerranéen, principalement sous le règne d'Auguste et de ses successeurs."),
            en = LocalizedContent("The Pax Romana was a period of peace in?", listOf("Byzantine Empire", "Ottoman Empire", "Roman Empire", "Mongol Empire"), "History", "The Pax Romana refers to the long period of stability and prosperity imposed by the Roman Empire in the Mediterranean basin, mainly under the reign of Augustus and his successors."),
            zh = LocalizedContent("罗马和平是哪个帝国的和平时期？", listOf("拜占庭帝国", "奥斯曼帝国", "罗马帝国", "蒙古帝国"), "历史", "罗马和平指的是罗马帝国在地中海盆地带来的长期稳定与繁荣时期，主要是在奥古斯都及其继任者的统治下。"),
            es = LocalizedContent("La Pax Romana fue un período de paz en?", listOf("Imperio bizantino", "Imperio otomano", "Imperio romano", "Imperio mongol"), "Historia", "La Pax Romana se refiere al largo período de estabilidad y prosperidad impuesto por el Imperio romano en la cuenca mediterránea, principalmente bajo el reinado de Augusto y sus sucesores.")
        ),
        BilingualQuestion(
            id = 13231, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel philosophe grec influença les croisades?", listOf("Platon", "Aristote", "Socrate", "Les Pères de l'Église"), "Histoire", "Les Pères de l'Église, comme saint Augustin, ont théorisé la guerre juste, ce qui a influencé la justification religieuse des croisades."),
            en = LocalizedContent("Which Greek philosopher influenced the Crusades?", listOf("Plato", "Aristotle", "Socrates", "Church Fathers"), "History", "The Church Fathers, like Saint Augustine, theorized just war, which influenced the religious justification of the Crusades."),
            zh = LocalizedContent("哪位希腊哲学家影响了十字军东征？", listOf("柏拉图", "亚里士多德", "苏格拉底", "教父"), "历史", "教父们，如圣奥古斯丁，提出了正义战争的理论，这影响了十字军东征的宗教正当性。"),
            es = LocalizedContent("¿Qué filósofo griego influyó en las Cruzadas?", listOf("Platón", "Aristóteles", "Sócrates", "Padres de la Iglesia"), "Historia", "Los Padres de la Iglesia, como San Agustín, teorizaron la guerra justa, lo que influyó en la justificación religiosa de las Cruzadas.")
        ),
        BilingualQuestion(
            id = 13232, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'Empire des Hasmonéens relevait de la région?", listOf("Égypte", "Mésopotamie", "Judée", "Syrie"), "Histoire", "Les Hasmonéens ont dirigé un royaume indépendant en Judée après la révolte des Maccabées contre l'Empire séleucide, au IIe siècle avant J.-C."),
            en = LocalizedContent("The Hasmonean Empire was located in which region?", listOf("Egypt", "Mesopotamia", "Judea", "Syria"), "History", "The Hasmoneans ruled an independent kingdom in Judea after the Maccabean revolt against the Seleucid Empire in the 2nd century BC."),
            zh = LocalizedContent("哈斯蒙尼帝国位于哪个地区？", listOf("埃及", "美索不达米亚", "犹太地", "叙利亚"), "历史", "哈斯蒙尼家族在公元前2世纪马加比家族反抗塞琉古帝国后，在犹太地建立了一个独立王国。"),
            es = LocalizedContent("El Imperio asmoneo se encontraba en la región de?", listOf("Egipto", "Mesopotamia", "Judea", "Siria"), "Historia", "Los asmoneos gobernaron un reino independiente en Judea tras la revuelta de los macabeos contra el Imperio seléucida en el siglo II a.C.")
        ),
        BilingualQuestion(
            id = 13233, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était Saladin lors des Croisades?", listOf("Un croisé", "Un leader musulman", "Un pape", "Un chevalier"), "Histoire", "Saladin, de son vrai nom Salah al-Din, fut le sultan d'Égypte et de Syrie qui unifia les forces musulmanes et reprit Jérusalem aux croisés en 1187."),
            en = LocalizedContent("Who was Saladin during the Crusades?", listOf("A crusader", "A Muslim leader", "A pope", "A knight"), "History", "Saladin, real name Salah al-Din, was the Sultan of Egypt and Syria who united Muslim forces and recaptured Jerusalem from the crusaders in 1187."),
            zh = LocalizedContent("萨拉丁在十字军东征期间是谁？", listOf("十字军战士", "穆斯林领袖", "教皇", "骑士"), "历史", "萨拉丁，本名萨拉赫丁，是埃及和叙利亚的苏丹，他统一了穆斯林军队，并于1187年从十字军手中收复了耶路撒冷。"),
            es = LocalizedContent("¿Quién fue Saladino durante las Cruzadas?", listOf("Un cruzado", "Un líder musulmán", "Un papa", "Un caballero"), "Historia", "Saladino, de nombre real Salah al-Din, fue el sultán de Egipto y Siria que unificó las fuerzas musulmanas y recuperó Jerusalén de los cruzados en 1187.")
        ),
        BilingualQuestion(
            id = 13234, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La période Heian au Japon correspondait à l'époque du?", listOf("Moyen Âge en Europe", "Renaissance", "Antiquité tardive", "Époque moderne"), "Histoire", "La période Heian (794-1185) correspond à l'apogée de la cour impériale japonaise, contemporaine du Moyen Âge européen (Ve-XVe siècle)."),
            en = LocalizedContent("The Heian period in Japan corresponded to which era?", listOf("Middle Ages in Europe", "Renaissance", "Late Antiquity", "Early Modern period"), "History", "The Heian period (794-1185) was the peak of the Japanese imperial court, contemporary with the European Middle Ages (5th-15th century)."),
            zh = LocalizedContent("日本的平安时代对应哪个时期？", listOf("欧洲中世纪", "文艺复兴", "古典时代晚期", "近代早期"), "历史", "平安时代（794-1185）是日本宫廷文化的鼎盛时期，与欧洲中世纪（5-15世纪）同期。"),
            es = LocalizedContent("El período Heian en Japón correspondió a la época del?", listOf("Edad Media en Europa", "Renacimiento", "Antigüedad tardía", "Edad Moderna"), "Historia", "El período Heian (794-1185) fue el apogeo de la corte imperial japonesa, contemporáneo de la Edad Media europea (siglos V-XV).")
        ),
        BilingualQuestion(
            id = 13235, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Shogunat Tokugawa dura?", listOf("100 ans", "150 ans", "250 ans", "300 ans"), "Histoire", "Le shogunat Tokugawa, fondé en 1603 par Tokugawa Ieyasu, maintint une paix et un isolement du Japon jusqu'à sa chute en 1868, soit environ 250 ans."),
            en = LocalizedContent("The Tokugawa Shogunate lasted?", listOf("100 years", "150 years", "250 years", "300 years"), "History", "The Tokugawa shogunate, founded in 1603 by Tokugawa Ieyasu, maintained peace and isolation in Japan until its fall in 1868, about 250 years."),
            zh = LocalizedContent("德川幕府持续了多久？", listOf("100年", "150年", "250年", "300年"), "历史", "德川幕府由德川家康于1603年建立，维持了日本的和平与锁国状态，直到1868年倒台，约250年。"),
            es = LocalizedContent("El shogunato Tokugawa duró?", listOf("100 años", "150 años", "250 años", "300 años"), "Historia", "El shogunato Tokugawa, fundado en 1603 por Tokugawa Ieyasu, mantuvo la paz y el aislamiento de Japón hasta su caída en 1868, unos 250 años.")
        ),
        BilingualQuestion(
            id = 13236, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Constantinople était aussi appelée?", listOf("Byzance", "Ankara", "Damas", "Jérusalem"), "Histoire", "Constantinople fut fondée sur le site de l'ancienne cité grecque de Byzance, fondée vers 660 av. J.-C."),
            en = LocalizedContent("Constantinople was also called?", listOf("Byzantium", "Ankara", "Damascus", "Jerusalem"), "History", "Constantinople was founded on the site of the ancient Greek city of Byzantium, founded around 660 BC."),
            zh = LocalizedContent("君士坦丁堡也被称为？", listOf("拜占庭", "安卡拉", "大马士革", "耶路撒冷"), "历史", "君士坦丁堡建于古希腊城市拜占庭的旧址上，拜占庭约建于公元前660年。"),
            es = LocalizedContent("Constantinopla también era llamada?", listOf("Bizancio", "Ankara", "Damasco", "Jerusalén"), "Historia", "Constantinopla fue fundada en el sitio de la antigua ciudad griega de Bizancio, fundada hacia el 660 a.C.")
        ),
        BilingualQuestion(
            id = 13237, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'armée janissaire servait l'Empire?", listOf("Byzantin", "Ottoman", "Mongol", "Perse"), "Histoire", "Les janissaires formaient l'élite de l'infanterie de l'Empire ottoman, recrutés initialement via le système du devchirmé."),
            en = LocalizedContent("The Janissary army served which Empire?", listOf("Byzantine", "Ottoman", "Mongol", "Persian"), "History", "The Janissaries formed the elite infantry of the Ottoman Empire, initially recruited through the devshirme system."),
            zh = LocalizedContent("耶尼切里军队服务于哪个帝国？", listOf("拜占庭帝国", "奥斯曼帝国", "蒙古帝国", "波斯帝国"), "历史", "耶尼切里是奥斯曼帝国的精锐步兵，最初通过德夫希尔梅制度招募。"),
            es = LocalizedContent("El ejército de jenízaros servía al Imperio?", listOf("Bizantino", "Otomano", "Mongol", "Persa"), "Historia", "Los jenízaros formaban la infantería de élite del Imperio otomano, reclutados inicialmente mediante el sistema del devshirme.")
        ),
        BilingualQuestion(
            id = 13238, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui fut le premier Président des États-Unis?", listOf("Thomas Jefferson", "George Washington", "Benjamin Franklin", "John Adams"), "Histoire", "George Washington fut le premier président des États-Unis, élu en 1789 après avoir dirigé l'armée continentale durant la guerre d'indépendance et présidé la Convention constitutionnelle."),
            en = LocalizedContent("Who was the first President of the United States?", listOf("Thomas Jefferson", "George Washington", "Benjamin Franklin", "John Adams"), "History", "George Washington was the first president of the United States, elected in 1789 after leading the Continental Army during the Revolutionary War and presiding over the Constitutional Convention."),
            zh = LocalizedContent("谁是美国第一任总统？", listOf("托马斯·杰斐逊", "乔治·华盛顿", "本杰明·富兰克林", "约翰·亚当斯"), "历史", "乔治·华盛顿是美国第一任总统，于1789年当选，此前他领导大陆军进行独立战争并主持了制宪会议。"),
            es = LocalizedContent("¿Quién fue el primer presidente de los Estados Unidos?", listOf("Thomas Jefferson", "George Washington", "Benjamin Franklin", "John Adams"), "Historia", "George Washington fue el primer presidente de los Estados Unidos, elegido en 1789 tras liderar el Ejército Continental durante la Guerra de Independencia y presidir la Convención Constitucional.")
        ),
        BilingualQuestion(
            id = 13239, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La Grande Muraille de Chine défendait contre?", listOf("Les Mongols", "Les Arabes", "Les Européens", "Les Indiens"), "Histoire", "La Grande Muraille a été principalement construite et renforcée sous la dynastie Ming pour se protéger des invasions mongoles venues du nord."),
            en = LocalizedContent("The Great Wall of China defended against?", listOf("The Mongols", "The Arabs", "The Europeans", "The Indians"), "History", "The Great Wall was mainly built and reinforced under the Ming dynasty to protect against Mongol invasions from the north."),
            zh = LocalizedContent("中国的长城防御的是？", listOf("蒙古人", "阿拉伯人", "欧洲人", "印度人"), "历史", "长城主要是在明朝修建和加固的，目的是防御来自北方的蒙古入侵。"),
            es = LocalizedContent("La Gran Muralla China defendía contra?", listOf("Los mongoles", "Los árabes", "Los europeos", "Los indios"), "Historia", "La Gran Muralla fue construida y reforzada principalmente bajo la dinastía Ming para protegerse de las invasiones mongolas del norte.")
        ),
        BilingualQuestion(
            id = 13240, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien texte connu du Japon?", listOf("Kojiki", "Nihon Shoki", "Man'yōshū", "Ise Monogatari"), "Histoire", "Le Kojiki, achevé en 712, est le plus ancien recueil de mythes, légendes et chroniques historiques du Japon, compilé sur ordre de l'impératrice Gemmei."),
            en = LocalizedContent("What is the oldest known text of Japan?", listOf("Kojiki", "Nihon Shoki", "Man'yōshū", "Ise Monogatari"), "History", "The Kojiki, completed in 712, is the oldest collection of myths, legends, and historical chronicles of Japan, compiled by order of Empress Gemmei."),
            zh = LocalizedContent("日本已知最古老的文献是什么？", listOf("古事记", "日本书纪", "万叶集", "伊势物语"), "历史", "《古事记》完成于712年，是日本最古老的神话、传说和历史编年史汇编，由元明天皇下令编纂。"),
            es = LocalizedContent("¿Cuál es el texto más antiguo conocido de Japón?", listOf("Kojiki", "Nihon Shoki", "Man'yōshū", "Ise Monogatari"), "Historia", "El Kojiki, completado en 712, es la colección más antigua de mitos, leyendas y crónicas históricas de Japón, compilada por orden de la emperatriz Gemmei.")
        ),
        BilingualQuestion(
            id = 13241, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'Inquisition espagnole poursuivait quels groupes?", listOf("Hérétiques", "Juifs et musulmans", "Protestants", "Tous les précédents"), "Histoire", "L'Inquisition espagnole visait initialement les juifs convertis soupçonnés de crypto-judaïsme, puis s'est étendue aux musulmans convertis, aux protestants et à d'autres hérétiques, ainsi qu'aux blasphémateurs et sorciers."),
            en = LocalizedContent("The Spanish Inquisition pursued which groups?", listOf("Heretics", "Jews and Muslims", "Protestants", "All of the above"), "History", "The Spanish Inquisition initially targeted converted Jews suspected of crypto-Judaism, then extended to converted Muslims, Protestants, and other heretics, as well as blasphemers and witches."),
            zh = LocalizedContent("西班牙宗教裁判所追捕哪些群体？", listOf("异端", "犹太人和穆斯林", "新教徒", "以上所有"), "历史", "西班牙宗教裁判所最初针对被怀疑秘密信奉犹太教的皈依犹太人，后来扩展到皈依的穆斯林、新教徒和其他异端，以及亵渎者和巫师。"),
            es = LocalizedContent("La Inquisición española perseguía a qué grupos?", listOf("Herejes", "Judíos y musulmanes", "Protestantes", "Todos los anteriores"), "Historia", "La Inquisición española inicialmente apuntó a judíos conversos sospechosos de criptojudaísmo, luego se extendió a musulmanes conversos, protestantes y otros herejes, así como a blasfemos y brujos.")
        ),
        BilingualQuestion(
            id = 13242, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'impact des Croisades inclut?", listOf("Échanges commerciaux", "Conflits religieux", "Avancées culturelles", "Tout ce qui précède"), "Histoire", "Les Croisades ont eu des conséquences multiples et durables : échanges culturels et commerciaux entre Orient et Occident, affaiblissement de l'Empire byzantin, et montée de la méfiance entre chrétiens et musulmans."),
            en = LocalizedContent("The impact of the Crusades includes?", listOf("Trade exchanges", "Religious conflicts", "Cultural advances", "All of the above"), "History", "The Crusades had multiple and lasting consequences: cultural and commercial exchanges between East and West, weakening of the Byzantine Empire, and rise of mistrust between Christians and Muslims."),
            zh = LocalizedContent("十字军东征的影响包括？", listOf("贸易交流", "宗教冲突", "文化进步", "以上所有"), "历史", "十字军东征产生了多重而持久的影响：东西方之间的文化和商业交流、拜占庭帝国的削弱，以及基督徒和穆斯林之间不信任的加剧。"),
            es = LocalizedContent("El impacto de las Cruzadas incluye?", listOf("Intercambios comerciales", "Conflictos religiosos", "Avances culturales", "Todo lo anterior"), "Historia", "Las Cruzadas tuvieron consecuencias múltiples y duraderas: intercambios culturales y comerciales entre Oriente y Occidente, debilitamiento del Imperio bizantino y aumento de la desconfianza entre cristianos y musulmanes.")
        ),
        BilingualQuestion(
            id = 13243, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel sultan ottoman conquit Constantinople?", listOf("Murad II", "Mehmed II", "Sélim I", "Süleyman"), "Histoire", "Mehmed II, dit le Conquérant, prit Constantinople en 1453, mettant fin à l'Empire byzantin et faisant de la ville la nouvelle capitale ottomane."),
            en = LocalizedContent("Which Ottoman sultan conquered Constantinople?", listOf("Murad II", "Mehmed II", "Selim I", "Suleiman"), "History", "Mehmed II, called the Conqueror, took Constantinople in 1453, ending the Byzantine Empire and making the city the new Ottoman capital."),
            zh = LocalizedContent("哪位奥斯曼苏丹征服了君士坦丁堡？", listOf("穆拉德二世", "穆罕默德二世", "塞利姆一世", "苏莱曼"), "历史", "穆罕默德二世，被称为征服者，于1453年攻占君士坦丁堡，结束了拜占庭帝国，并将该城定为新的奥斯曼首都。"),
            es = LocalizedContent("¿Qué sultán otomano conquistó Constantinopla?", listOf("Murad II", "Mehmed II", "Selim I", "Suleimán"), "Historia", "Mehmed II, llamado el Conquistador, tomó Constantinopla en 1453, poniendo fin al Imperio bizantino y convirtiendo la ciudad en la nueva capital otomana.")
        ),
        BilingualQuestion(
            id = 13244, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La chute de l'Empire mongol en Chine conduisit à?", listOf("La dynastie Ming", "La dynastie Qing", "La dynastie Yuan", "La dynastie Han"), "Histoire", "La chute de la dynastie mongole des Yuan en 1368 permit à Zhu Yuanzhang de fonder la dynastie Ming, qui rétablit le pouvoir chinois Han."),
            en = LocalizedContent("The fall of the Mongol Empire in China led to?", listOf("The Ming dynasty", "The Qing dynasty", "The Yuan dynasty", "The Han dynasty"), "History", "The fall of the Mongol Yuan dynasty in 1368 allowed Zhu Yuanzhang to found the Ming dynasty, which restored Han Chinese rule."),
            zh = LocalizedContent("蒙古帝国在中国的灭亡导致了？", listOf("明朝", "清朝", "元朝", "汉朝"), "历史", "1368年蒙古元朝的灭亡使朱元璋得以建立明朝，恢复了汉人的统治。"),
            es = LocalizedContent("La caída del Imperio mongol en China condujo a?", listOf("La dinastía Ming", "La dinastía Qing", "La dinastía Yuan", "La dinastía Han"), "Historia", "La caída de la dinastía mongola Yuan en 1368 permitió a Zhu Yuanzhang fundar la dinastía Ming, que restauró el poder chino Han.")
        ),
        BilingualQuestion(
            id = 13245, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Les samouraïs servaient quel seigneur au Japon féodal?", listOf("Le Shogun", "Le Daimyo", "L'Empereur", "Le Dairi"), "Histoire", "Au Japon féodal, les samouraïs étaient au service d'un daimyo, un puissant seigneur terrien, en échange de terres et de protection."),
            en = LocalizedContent("Samurai served which lord in feudal Japan?", listOf("The Shogun", "The Daimyo", "The Emperor", "The Dairi"), "History", "In feudal Japan, samurai served a daimyo, a powerful land-owning lord, in exchange for land and protection."),
            zh = LocalizedContent("在日本封建时代，武士为哪位领主服务？", listOf("将军", "大名", "天皇", "内里"), "历史", "在日本封建时代，武士为大名服务，大名是拥有土地的强大领主，武士以效忠换取土地和保护。"),
            es = LocalizedContent("Los samuráis servían a qué señor en el Japón feudal?", listOf("El Shogun", "El Daimyo", "El Emperador", "El Dairi"), "Historia", "En el Japón feudal, los samuráis servían a un daimyo, un poderoso señor terrateniente, a cambio de tierras y protección.")
        ),
        BilingualQuestion(
            id = 13246, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Réforme protestante débuta par?", listOf("Wycliffe", "Hus", "Luther", "Calvin"), "Histoire", "En 1517, Martin Luther publie ses 95 thèses contre les indulgences, acte fondateur de la Réforme protestante."),
            en = LocalizedContent("The Protestant Reformation began with?", listOf("Wycliffe", "Hus", "Luther", "Calvin"), "History", "In 1517, Martin Luther published his 95 Theses against indulgences, the founding act of the Protestant Reformation."),
            zh = LocalizedContent("宗教改革始于？", listOf("威克里夫", "胡斯", "路德", "加尔文"), "历史", "1517年，马丁·路德发表了反对赎罪券的《九十五条论纲》，这是宗教改革的奠基之举。"),
            es = LocalizedContent("La Reforma protestante comenzó con?", listOf("Wycliffe", "Hus", "Lutero", "Calvino"), "Historia", "En 1517, Martín Lutero publicó sus 95 tesis contra las indulgencias, acto fundacional de la Reforma protestante.")
        ),
        BilingualQuestion(
            id = 13247, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le Suez fut creusé pour relier?", listOf("Méditerranée et Mer Rouge", "Rhin et Danube", "Mer Noire et Mer Caspienne", "Manche et Atlantique"), "Histoire", "Le canal de Suez, inauguré en 1869, relie la mer Méditerranée à la mer Rouge, offrant une route maritime directe entre l'Europe et l'Asie sans contourner l'Afrique."),
            en = LocalizedContent("The Suez Canal was dug to connect?", listOf("Mediterranean and Red Sea", "Rhine and Danube", "Black Sea and Caspian Sea", "English Channel and Atlantic"), "History", "The Suez Canal, inaugurated in 1869, connects the Mediterranean Sea to the Red Sea, providing a direct maritime route between Europe and Asia without rounding Africa."),
            zh = LocalizedContent("苏伊士运河的开凿是为了连接？", listOf("地中海和红海", "莱茵河和多瑙河", "黑海和里海", "英吉利海峡和大西洋"), "历史", "苏伊士运河于1869年通航，连接地中海和红海，提供了欧洲和亚洲之间的直接海上航线，无需绕行非洲。"),
            es = LocalizedContent("El canal de Suez fue excavado para conectar?", listOf("Mediterráneo y Mar Rojo", "Rin y Danubio", "Mar Negro y Mar Caspio", "Canal de la Mancha y Atlántico"), "Historia", "El canal de Suez, inaugurado en 1869, conecta el mar Mediterráneo con el mar Rojo, ofreciendo una ruta marítima directa entre Europa y Asia sin rodear África.")
        ),
        BilingualQuestion(
            id = 13248, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le massacre de la Barthélemy impliqua?", listOf("Catholiques et protestants", "Musulmans et chrétiens", "Juifs et chrétiens", "Hérétiques et papistes"), "Histoire", "Le massacre de la Saint-Barthélemy, en 1572, fut une tuerie de protestants (huguenots) ordonnée par les catholiques à Paris, puis dans toute la France."),
            en = LocalizedContent("The St. Bartholomew's Day massacre involved?", listOf("Catholics and Protestants", "Muslims and Christians", "Jews and Christians", "Heretics and papists"), "History", "The St. Bartholomew's Day massacre in 1572 was a slaughter of Protestants (Huguenots) ordered by Catholics in Paris, then throughout France."),
            zh = LocalizedContent("圣巴托罗缪大屠杀涉及？", listOf("天主教徒和新教徒", "穆斯林和基督徒", "犹太人和基督徒", "异端和教皇派"), "历史", "1572年的圣巴托罗缪大屠杀是天主教徒在巴黎下令屠杀新教徒（胡格诺派），随后蔓延到法国全境。"),
            es = LocalizedContent("La masacre de San Bartolomé involucró a?", listOf("Católicos y protestantes", "Musulmanes y cristianos", "Judíos y cristianos", "Herejes y papistas"), "Historia", "La masacre de San Bartolomé en 1572 fue una matanza de protestantes (hugonotes) ordenada por los católicos en París, y luego en toda Francia.")
        ),
        BilingualQuestion(
            id = 13249, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Lequel de ces empires n'a PAS été mentionné ici?", listOf("Égyptien", "Ottoman", "Byzantin", "Mongol"), "Histoire", "L'empire égyptien n'a pas été mentionné dans le quiz, contrairement aux autres empires cités dans la question."),
            en = LocalizedContent("Which of these empires was NOT mentioned here?", listOf("Egyptian", "Ottoman", "Byzantine", "Mongol"), "History", "The Egyptian empire was not mentioned in the quiz, unlike the other empires cited in the question."),
            zh = LocalizedContent("以下哪个帝国在此处未被提及？", listOf("埃及", "奥斯曼", "拜占庭", "蒙古"), "历史", "埃及帝国在测验中未被提及，而问题中引用的其他帝国则被提及。"),
            es = LocalizedContent("¿Cuál de estos imperios NO fue mencionado aquí?", listOf("Egipcio", "Otomano", "Bizantino", "Mongol"), "Historia", "El imperio egipcio no fue mencionado en el cuestionario, a diferencia de los otros imperios citados en la pregunta.")
        ),
        BilingualQuestion(
            id = 13250, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Le Pôle Nord géographique se situe à?", listOf("45°N", "60°N", "75°N", "90°N"), "Géographie", "Le Pôle Nord géographique est le point le plus septentrional de la Terre, situé à l'intersection de l'axe de rotation terrestre avec la surface, ce qui correspond à la latitude 90° Nord."),
            en = LocalizedContent("The geographic North Pole is located at?", listOf("45°N", "60°N", "75°N", "90°N"), "Geography", "The geographic North Pole is the northernmost point on Earth, located at the intersection of Earth's axis of rotation with the surface, corresponding to latitude 90° North."),
            zh = LocalizedContent("地理北极位于？", listOf("45°N", "60°N", "75°N", "90°N"), "地理", "地理北极是地球最北端的点，位于地球自转轴与表面的交点，对应北纬90度。"),
            es = LocalizedContent("¿El Polo Norte geográfico se encuentra en?", listOf("45°N", "60°N", "75°N", "90°N"), "Geografia", "El Polo Norte geográfico es el punto más septentrional de la Tierra, ubicado en la intersección del eje de rotación terrestre con la superficie, correspondiente a la latitud 90° Norte.")
        ),
        BilingualQuestion(
            id = 13251, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("L'Antarctique est un continent. Vrai ou Faux?", listOf("Vrai", "Faux", "Partiellement", "Débattu"), "Géographie", "L'Antarctique est bien un continent, le cinquième par sa superficie, recouvert de glace et entouré par l'océan Austral. Il se distingue de l'Arctique, qui est une banquise."),
            en = LocalizedContent("Antarctica is a continent. True or False?", listOf("True", "False", "Partially", "Debated"), "Geography", "Antarctica is indeed a continent, the fifth largest by area, covered in ice and surrounded by the Southern Ocean. It is distinct from the Arctic, which is an ice cap."),
            zh = LocalizedContent("南极洲是一个大陆。对还是错？", listOf("对", "错", "部分", "有争议"), "地理", "南极洲确实是一个大陆，按面积排名第五，被冰覆盖，周围是南大洋。它与北极不同，北极是冰盖。"),
            es = LocalizedContent("La Antártida es un continente. ¿Verdadero o Falso?", listOf("Verdadero", "Falso", "Parcialmente", "Debatido"), "Geografia", "La Antártida es efectivamente un continente, el quinto por superficie, cubierto de hielo y rodeado por el Océano Austral. Se distingue del Ártico, que es una capa de hielo.")
        ),
        BilingualQuestion(
            id = 13252, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'océan qui entoure l'Antarctique?", listOf("Atlantique", "Indien", "Océan Glacial Austral", "Pacifique"), "Géographie", "L'océan Glacial Austral est le nom officiel donné à la masse d'eau entourant le continent Antarctique, reconnu comme le quatrième plus grand océan du monde."),
            en = LocalizedContent("Which ocean surrounds Antarctica?", listOf("Atlantic", "Indian", "Southern Ocean", "Pacific"), "Geography", "The Southern Ocean is the official name given to the body of water surrounding the Antarctic continent, recognized as the fourth largest ocean in the world."),
            zh = LocalizedContent("哪个大洋环绕南极洲？", listOf("大西洋", "印度洋", "南大洋", "太平洋"), "地理", "南大洋是环绕南极大陆的水域的官方名称，被公认为世界第四大洋。"),
            es = LocalizedContent("¿Qué océano rodea la Antártida?", listOf("Atlántico", "Índico", "Océano Austral", "Pacífico"), "Geografia", "El Océano Austral es el nombre oficial dado a la masa de agua que rodea el continente antártico, reconocido como el cuarto océano más grande del mundo.")
        ),
        BilingualQuestion(
            id = 13253, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'archipel de la Polynésie compte combien d'îles aproximativement?", listOf("100", "300", "1000", "3000"), "Géographie", "La Polynésie est un vaste ensemble d'îles dispersées dans l'océan Pacifique, comprenant environ 3000 îles et atolls, dont les plus connus sont Tahiti, Bora Bora et les Marquises."),
            en = LocalizedContent("How many islands approximately does the Polynesian archipelago have?", listOf("100", "300", "1000", "3000"), "Geography", "Polynesia is a vast group of islands scattered in the Pacific Ocean, comprising about 3000 islands and atolls, the most famous of which are Tahiti, Bora Bora, and the Marquesas."),
            zh = LocalizedContent("波利尼西亚群岛大约有多少个岛屿？", listOf("100", "300", "1000", "3000"), "地理", "波利尼西亚是散布在太平洋中的广阔群岛，包括约3000个岛屿和环礁，其中最著名的是塔希提岛、波拉波拉岛和马克萨斯群岛。"),
            es = LocalizedContent("¿Cuántas islas aproximadamente tiene el archipiélago de la Polinesia?", listOf("100", "300", "1000", "3000"), "Geografia", "La Polinesia es un vasto conjunto de islas dispersas en el océano Pacífico, que comprende aproximadamente 3000 islas y atolones, siendo las más conocidas Tahití, Bora Bora y las Marquesas.")
        ),
        BilingualQuestion(
            id = 13254, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Le détroit de Gibraltar sépare l'Europe et l'?", listOf("Asie", "Afrique", "Océanie", "Amérique"), "Géographie", "Le détroit de Gibraltar relie la mer Méditerranée à l'océan Atlantique et constitue la frontière naturelle entre le continent européen (Espagne) et le continent africain (Maroc)."),
            en = LocalizedContent("The Strait of Gibraltar separates Europe and?", listOf("Asia", "Africa", "Oceania", "America"), "Geography", "The Strait of Gibraltar connects the Mediterranean Sea to the Atlantic Ocean and forms the natural border between the European continent (Spain) and the African continent (Morocco)."),
            zh = LocalizedContent("直布罗陀海峡分隔欧洲和？", listOf("亚洲", "非洲", "大洋洲", "美洲"), "地理", "直布罗陀海峡连接地中海和大西洋，是欧洲大陆（西班牙）和非洲大陆（摩洛哥）之间的天然边界。"),
            es = LocalizedContent("El estrecho de Gibraltar separa Europa y?", listOf("Asia", "África", "Oceanía", "América"), "Geografia", "El estrecho de Gibraltar conecta el mar Mediterráneo con el océano Atlántico y constituye la frontera natural entre el continente europeo (España) y el continente africano (Marruecos).")
        ),
        BilingualQuestion(
            id = 13255, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le Cap Horn est le point sud de quel continent?", listOf("Australie", "Afrique", "Amérique du Sud", "Antarctique"), "Géographie", "Le Cap Horn se situe à l'extrémité de l'archipel de la Terre de Feu, au sud du Chili, ce qui en fait le point le plus méridional de l'Amérique du Sud."),
            en = LocalizedContent("Cape Horn is the southern point of which continent?", listOf("Australia", "Africa", "South America", "Antarctica"), "Geography", "Cape Horn is located at the tip of the Tierra del Fuego archipelago, south of Chile, making it the southernmost point of South America."),
            zh = LocalizedContent("合恩角是哪个大陆的最南端？", listOf("澳大利亚", "非洲", "南美洲", "南极洲"), "地理", "合恩角位于智利南部火地岛群岛的顶端，是南美洲的最南端。"),
            es = LocalizedContent("¿El Cabo de Hornos es el punto sur de qué continente?", listOf("Australia", "África", "América del Sur", "Antártida"), "Geografia", "El Cabo de Hornos se encuentra en el extremo del archipiélago de Tierra del Fuego, al sur de Chile, lo que lo convierte en el punto más meridional de América del Sur.")
        ),
        BilingualQuestion(
            id = 13256, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le golfe Persique sépare l'Iran de la?", listOf("Mer Rouge", "Péninsule arabique", "Mer Caspienne", "Mer d'Oman"), "Géographie", "Le golfe Persique est bordé au sud-ouest par la péninsule arabique, qui regroupe l'Arabie saoudite, le Yémen, Oman et d'autres pays."),
            en = LocalizedContent("The Persian Gulf separates Iran from the?", listOf("Red Sea", "Arabian Peninsula", "Caspian Sea", "Sea of Oman"), "Geography", "The Persian Gulf is bordered to the southwest by the Arabian Peninsula, which includes Saudi Arabia, Yemen, Oman, and other countries."),
            zh = LocalizedContent("波斯湾将伊朗与什么分开？", listOf("红海", "阿拉伯半岛", "里海", "阿曼海"), "地理", "波斯湾西南部与阿拉伯半岛接壤，阿拉伯半岛包括沙特阿拉伯、也门、阿曼等国。"),
            es = LocalizedContent("¿El golfo Pérsico separa Irán de?", listOf("Mar Rojo", "Península arábiga", "Mar Caspio", "Mar de Omán"), "Geografia", "El golfo Pérsico está bordeado al suroeste por la península arábiga, que incluye Arabia Saudita, Yemen, Omán y otros países.")
        ),
        BilingualQuestion(
            id = 13257, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La baie de Hudson est située au?", listOf("Canada", "Sibérie", "Groenland", "Alaska"), "Géographie", "La baie d'Hudson est une grande mer intérieure située dans le nord-est du Canada, bordée par les provinces du Manitoba, de l'Ontario et du Québec."),
            en = LocalizedContent("Hudson Bay is located in?", listOf("Canada", "Siberia", "Greenland", "Alaska"), "Geography", "Hudson Bay is a large inland sea located in northeastern Canada, bordered by the provinces of Manitoba, Ontario, and Quebec."),
            zh = LocalizedContent("哈德逊湾位于？", listOf("加拿大", "西伯利亚", "格陵兰", "阿拉斯加"), "地理", "哈德逊湾是位于加拿大东北部的一个大型内陆海，与马尼托巴省、安大略省和魁北克省接壤。"),
            es = LocalizedContent("¿La bahía de Hudson está situada en?", listOf("Canadá", "Siberia", "Groenlandia", "Alaska"), "Geografia", "La bahía de Hudson es un gran mar interior ubicado en el noreste de Canadá, bordeado por las provincias de Manitoba, Ontario y Quebec.")
        ),
        BilingualQuestion(
            id = 13258, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'Islande est-elle un archipel ou une seule île?", listOf("Archipel", "Une seule île", "Deux îles", "Cela dépend"), "Géographie", "L'Islande est un archipel car elle est entourée de nombreuses petites îles, comme les îles Vestmann, en plus de l'île principale."),
            en = LocalizedContent("Is Iceland an archipelago or a single island?", listOf("Archipelago", "Single island", "Two islands", "It depends"), "Geography", "Iceland is an archipelago because it is surrounded by many small islands, such as the Vestmann Islands, in addition to the main island."),
            zh = LocalizedContent("冰岛是群岛还是单个岛屿？", listOf("群岛", "单个岛屿", "两个岛屿", "视情况而定"), "地理", "冰岛是一个群岛，因为除了主岛外，它周围还有许多小岛，如韦斯特曼纳群岛。"),
            es = LocalizedContent("¿Islandia es un archipiélago o una sola isla?", listOf("Archipiélago", "Una sola isla", "Dos islas", "Depende"), "Geografia", "Islandia es un archipiélago porque está rodeada de muchas islas pequeñas, como las islas Vestmann, además de la isla principal.")
        ),
        BilingualQuestion(
            id = 13259, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les Îles Féroé appartiennent à quel pays?", listOf("Islande", "Danemark", "Suède", "Norvège"), "Géographie", "Les Îles Féroé sont un territoire autonome du Royaume du Danemark depuis 1948, tout en conservant leur propre gouvernement et leur drapeau."),
            en = LocalizedContent("Which country do the Faroe Islands belong to?", listOf("Iceland", "Denmark", "Sweden", "Norway"), "Geography", "The Faroe Islands have been a self-governing territory of the Kingdom of Denmark since 1948, while retaining their own government and flag."),
            zh = LocalizedContent("法罗群岛属于哪个国家？", listOf("冰岛", "丹麦", "瑞典", "挪威"), "地理", "法罗群岛自1948年起是丹麦王国的自治领土，同时拥有自己的政府和旗帜。"),
            es = LocalizedContent("¿A qué país pertenecen las Islas Feroe?", listOf("Islandia", "Dinamarca", "Suecia", "Noruega"), "Geografia", "Las Islas Feroe son un territorio autónomo del Reino de Dinamarca desde 1948, manteniendo su propio gobierno y bandera.")
        ),
        BilingualQuestion(
            id = 13260, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le détroit de Béring sépare la Russie de?", listOf("Canada", "Alaska", "Groenland", "Islande"), "Géographie", "Le détroit de Béring sépare la Russie de l'Alaska, qui est un État des États-Unis."),
            en = LocalizedContent("The Bering Strait separates Russia from?", listOf("Canada", "Alaska", "Greenland", "Iceland"), "Geography", "The Bering Strait separates Russia from Alaska, which is a state of the United States."),
            zh = LocalizedContent("白令海峡将俄罗斯与什么分开？", listOf("加拿大", "阿拉斯加", "格陵兰", "冰岛"), "地理", "白令海峡将俄罗斯与阿拉斯加分开，阿拉斯加是美国的一个州。"),
            es = LocalizedContent("El estrecho de Bering separa Rusia de?", listOf("Canadá", "Alaska", "Groenlandia", "Islandia"), "Geografia", "El estrecho de Bering separa Rusia de Alaska, que es un estado de los Estados Unidos.")
        ),
        BilingualQuestion(
            id = 13261, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le golfe du Mexique est bordé par?", listOf("États-Unis uniquement", "États-Unis et Mexique", "États-Unis, Mexique et Cuba", "États-Unis, Mexique et Canada"), "Géographie", "Le golfe du Mexique est bordé au nord par les États-Unis, à l'ouest et au sud par le Mexique, et au sud-est par l'île de Cuba."),
            en = LocalizedContent("The Gulf of Mexico is bordered by?", listOf("United States only", "United States and Mexico", "United States, Mexico and Cuba", "United States, Mexico and Canada"), "Geography", "The Gulf of Mexico is bordered to the north by the United States, to the west and south by Mexico, and to the southeast by the island of Cuba."),
            zh = LocalizedContent("墨西哥湾与哪些国家接壤？", listOf("仅美国", "美国和墨西哥", "美国、墨西哥和古巴", "美国、墨西哥和加拿大"), "地理", "墨西哥湾北接美国，西和南接墨西哥，东南接古巴岛。"),
            es = LocalizedContent("El golfo de México está bordeado por?", listOf("Solo Estados Unidos", "Estados Unidos y México", "Estados Unidos, México y Cuba", "Estados Unidos, México y Canadá"), "Geografia", "El golfo de México limita al norte con Estados Unidos, al oeste y sur con México, y al sureste con la isla de Cuba.")
        ),
        BilingualQuestion(
            id = 13262, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La baie de la Thaïlande borde la côte de?", listOf("Malaisie", "Thaïlande", "Cambodge", "Tous les trois"), "Géographie", "La baie de Thaïlande est bordée par la Thaïlande, le Cambodge et le Vietnam, ces trois pays partageant son littoral."),
            en = LocalizedContent("The Gulf of Thailand borders the coast of?", listOf("Malaysia", "Thailand", "Cambodia", "All three"), "Geography", "The Gulf of Thailand is bordered by Thailand, Cambodia, and Vietnam, all three sharing its coastline."),
            zh = LocalizedContent("泰国湾与哪些国家的海岸接壤？", listOf("马来西亚", "泰国", "柬埔寨", "以上所有"), "地理", "泰国湾与泰国、柬埔寨和越南接壤，这三个国家共享其海岸线。"),
            es = LocalizedContent("El golfo de Tailandia bordea la costa de?", listOf("Malasia", "Tailandia", "Camboya", "Los tres"), "Geografia", "El golfo de Tailandia está bordeado por Tailandia, Camboya y Vietnam, los tres comparten su costa.")
        ),
        BilingualQuestion(
            id = 13263, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le cap de Bonne-Espérance est en?", listOf("Angola", "Afrique du Sud", "Namibie", "Mozambique"), "Géographie", "Le cap de Bonne-Espérance est situé à l'extrémité sud-ouest de l'Afrique, dans la province du Cap-Occidental en Afrique du Sud."),
            en = LocalizedContent("The Cape of Good Hope is in?", listOf("Angola", "South Africa", "Namibia", "Mozambique"), "Geography", "The Cape of Good Hope is located at the southwestern tip of Africa, in the Western Cape province of South Africa."),
            zh = LocalizedContent("好望角位于？", listOf("安哥拉", "南非", "纳米比亚", "莫桑比克"), "地理", "好望角位于非洲西南端，南非的西开普省。"),
            es = LocalizedContent("El cabo de Buena Esperanza está en?", listOf("Angola", "Sudáfrica", "Namibia", "Mozambique"), "Geografia", "El cabo de Buena Esperanza se encuentra en el extremo suroeste de África, en la provincia del Cabo Occidental de Sudáfrica.")
        ),
        BilingualQuestion(
            id = 13264, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'archipel de Galápagos appartient à?", listOf("Pérou", "Chili", "Équateur", "Colombie"), "Géographie", "L'archipel des Galápagos est situé dans l'océan Pacifique, à environ 1 000 kilomètres des côtes de l'Équateur, pays auquel il appartient politiquement depuis 1832."),
            en = LocalizedContent("The Galápagos Islands belong to?", listOf("Peru", "Chile", "Ecuador", "Colombia"), "Geography", "The Galápagos Islands are located in the Pacific Ocean, about 1,000 kilometers off the coast of Ecuador, to which they have politically belonged since 1832."),
            zh = LocalizedContent("加拉帕戈斯群岛属于？", listOf("秘鲁", "智利", "厄瓜多尔", "哥伦比亚"), "地理", "加拉帕戈斯群岛位于太平洋，距厄瓜多尔海岸约1000公里，自1832年起政治上属于厄瓜多尔。"),
            es = LocalizedContent("Las islas Galápagos pertenecen a?", listOf("Perú", "Chile", "Ecuador", "Colombia"), "Geografia", "Las islas Galápagos están ubicadas en el océano Pacífico, a unos 1.000 kilómetros de la costa de Ecuador, país al que pertenecen políticamente desde 1832.")
        ),
        BilingualQuestion(
            id = 13265, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La mer du Nord est entourée par?", listOf("France et Angleterre", "Scandinavie et Angleterre", "Allemagne et Danemark", "Tous les précédents"), "Géographie", "La mer du Nord borde le Royaume-Uni, la Norvège, le Danemark, l'Allemagne, les Pays-Bas, la Belgique et la France, donc toutes ces réponses sont correctes."),
            en = LocalizedContent("The North Sea is surrounded by?", listOf("France and England", "Scandinavia and England", "Germany and Denmark", "All of the above"), "Geography", "The North Sea borders the United Kingdom, Norway, Denmark, Germany, the Netherlands, Belgium, and France, so all these answers are correct."),
            zh = LocalizedContent("北海被哪些地区包围？", listOf("法国和英格兰", "斯堪的纳维亚和英格兰", "德国和丹麦", "以上所有"), "地理", "北海与英国、挪威、丹麦、德国、荷兰、比利时和法国接壤，因此所有这些答案都是正确的。"),
            es = LocalizedContent("El mar del Norte está rodeado por?", listOf("Francia e Inglaterra", "Escandinavia e Inglaterra", "Alemania y Dinamarca", "Todos los anteriores"), "Geografia", "El mar del Norte limita con Reino Unido, Noruega, Dinamarca, Alemania, Países Bajos, Bélgica y Francia, por lo que todas estas respuestas son correctas.")
        ),
        BilingualQuestion(
            id = 13266, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le détroit de Malacca relie quel océan à quel océan?", listOf("Atlantique-Pacifique", "Indien-Pacifique", "Atlantique-Indien", "Arctique-Atlantique"), "Géographie", "Le détroit de Malacca est une voie maritime clé entre l'océan Indien et l'océan Pacifique, située entre la péninsule Malaise et l'île indonésienne de Sumatra."),
            en = LocalizedContent("The Strait of Malacca connects which ocean to which ocean?", listOf("Atlantic-Pacific", "Indian-Pacific", "Atlantic-Indian", "Arctic-Atlantic"), "Geography", "The Strait of Malacca is a key maritime route between the Indian Ocean and the Pacific Ocean, located between the Malay Peninsula and the Indonesian island of Sumatra."),
            zh = LocalizedContent("马六甲海峡连接哪两个大洋？", listOf("大西洋-太平洋", "印度洋-太平洋", "大西洋-印度洋", "北冰洋-大西洋"), "地理", "马六甲海峡是连接印度洋和太平洋的重要海上通道，位于马来半岛和印度尼西亚苏门答腊岛之间。"),
            es = LocalizedContent("El estrecho de Malaca conecta ¿qué océano con qué océano?", listOf("Atlántico-Pacífico", "Índico-Pacífico", "Atlántico-Índico", "Ártico-Atlántico"), "Geografia", "El estrecho de Malaca es una ruta marítima clave entre el océano Índico y el océano Pacífico, situado entre la península malaya y la isla indonesia de Sumatra.")
        ),
        BilingualQuestion(
            id = 13267, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'île de Madagascar appartient à quel pays?", listOf("Afrique du Sud", "Mozambique", "Madagascar", "C'est un état indépendant"), "Géographie", "Madagascar est un État souverain depuis son indépendance de la France en 1960, et ne fait partie d'aucun autre pays."),
            en = LocalizedContent("The island of Madagascar belongs to which country?", listOf("South Africa", "Mozambique", "Madagascar", "It is an independent state"), "Geography", "Madagascar has been a sovereign state since its independence from France in 1960, and is not part of any other country."),
            zh = LocalizedContent("马达加斯加岛属于哪个国家？", listOf("南非", "莫桑比克", "马达加斯加", "它是一个独立国家"), "地理", "马达加斯加自1960年从法国独立以来一直是一个主权国家，不属于任何其他国家。"),
            es = LocalizedContent("La isla de Madagascar pertenece a qué país?", listOf("Sudáfrica", "Mozambique", "Madagascar", "Es un estado independiente"), "Geografia", "Madagascar es un estado soberano desde su independencia de Francia en 1960, y no forma parte de ningún otro país.")
        ),
        BilingualQuestion(
            id = 13268, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le golfe d'Aden borde qui?", listOf("Arabie Saoudite et Somalie", "Yémen et Somalie", "Érythrée et Djibouti", "Tous les précédents"), "Géographie", "Le golfe d'Aden sépare la corne de l'Afrique de la péninsule arabique, avec le Yémen au nord et la Somalie au sud."),
            en = LocalizedContent("The Gulf of Aden borders who?", listOf("Saudi Arabia and Somalia", "Yemen and Somalia", "Eritrea and Djibouti", "All of the above"), "Geography", "The Gulf of Aden separates the Horn of Africa from the Arabian Peninsula, with Yemen to the north and Somalia to the south."),
            zh = LocalizedContent("亚丁湾与哪些国家接壤？", listOf("沙特阿拉伯和索马里", "也门和索马里", "厄立特里亚和吉布提", "以上所有"), "地理", "亚丁湾将非洲之角与阿拉伯半岛分开，北面是也门，南面是索马里。"),
            es = LocalizedContent("El golfo de Adén limita con quién?", listOf("Arabia Saudita y Somalia", "Yemen y Somalia", "Eritrea y Yibuti", "Todos los anteriores"), "Geografia", "El golfo de Adén separa el Cuerno de África de la península arábiga, con Yemen al norte y Somalia al sur.")
        ),
        BilingualQuestion(
            id = 13269, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le détroit du Bosphore relie quel deux mers?", listOf("Adriatique-Égée", "Noire-Méditerranée", "Noire-Marmara", "Marmara-Égée"), "Géographie", "Le détroit du Bosphore relie la mer Noire à la mer de Marmara, séparant l'Europe de l'Asie et traversant Istanbul."),
            en = LocalizedContent("Which two seas does the Bosphorus Strait connect?", listOf("Adriatic-Aegean", "Black-Mediterranean", "Black-Marmara", "Marmara-Aegean"), "Geography", "The Bosphorus Strait connects the Black Sea to the Sea of Marmara, separating Europe from Asia and passing through Istanbul."),
            zh = LocalizedContent("博斯普鲁斯海峡连接哪两个海？", listOf("亚得里亚海-爱琴海", "黑海-地中海", "黑海-马尔马拉海", "马尔马拉海-爱琴海"), "地理", "博斯普鲁斯海峡连接黑海和马尔马拉海，分隔欧洲和亚洲，穿过伊斯坦布尔。"),
            es = LocalizedContent("¿Qué dos mares conecta el estrecho del Bósforo?", listOf("Adriático-Egeo", "Negro-Mediterráneo", "Negro-Mármara", "Mármara-Egeo"), "Geografía", "El estrecho del Bósforo conecta el mar Negro con el mar de Mármara, separando Europa de Asia y atravesando Estambul.")
        ),
        BilingualQuestion(
            id = 13270, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'archipel des Malouines appartient à?", listOf("Argentine", "Royaume-Uni", "Chili", "Débattu"), "Géographie", "Les îles Malouines sont un territoire britannique d'outre-mer, bien que l'Argentine en revendique la souveraineté."),
            en = LocalizedContent("The Falkland Islands archipelago belongs to?", listOf("Argentina", "United Kingdom", "Chile", "Disputed"), "Geography", "The Falkland Islands are a British Overseas Territory, although Argentina claims sovereignty over them."),
            zh = LocalizedContent("马尔维纳斯群岛属于？", listOf("阿根廷", "英国", "智利", "有争议"), "地理", "马尔维纳斯群岛是英国海外领土，尽管阿根廷声称对其拥有主权。"),
            es = LocalizedContent("El archipiélago de las Malvinas pertenece a?", listOf("Argentina", "Reino Unido", "Chile", "En disputa"), "Geografía", "Las islas Malvinas son un territorio británico de ultramar, aunque Argentina reclama su soberanía.")
        ),
        BilingualQuestion(
            id = 13271, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le cap Nord est le point nord de la Scandinavie. Vrai ou Faux?", listOf("Vrai", "Faux", "Partiellement", "Débattu"), "Géographie", "Le cap Nord, situé sur l'île de Magerøya en Norvège, est généralement considéré comme le point le plus septentrional de la Scandinavie accessible au public."),
            en = LocalizedContent("North Cape is the northernmost point of Scandinavia. True or False?", listOf("True", "False", "Partially", "Disputed"), "Geography", "North Cape, located on the island of Magerøya in Norway, is generally considered the northernmost point of Scandinavia accessible to the public."),
            zh = LocalizedContent("北角是斯堪的纳维亚半岛的最北点。对还是错？", listOf("对", "错", "部分正确", "有争议"), "地理", "北角位于挪威马格尔岛，通常被认为是斯堪的纳维亚半岛向公众开放的最北点。"),
            es = LocalizedContent("El Cabo Norte es el punto más septentrional de Escandinavia. ¿Verdadero o Falso?", listOf("Verdadero", "Falso", "Parcialmente", "En disputa"), "Geografía", "El Cabo Norte, situado en la isla de Magerøya en Noruega, se considera generalmente el punto más septentrional de Escandinavia accesible al público.")
        ),
        BilingualQuestion(
            id = 13272, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Terre de Feu est partagée entre la Patagonie et?", listOf("L'Uruguay", "Le Chili", "L'Argentine", "Les Malouines"), "Géographie", "La Terre de Feu est un archipel situé à l'extrémité sud de l'Amérique du Sud, partagé entre le Chili et l'Argentine. La Patagonie est une région qui s'étend sur ces deux pays, mais la question oppose la Patagonie à l'Argentine pour désigner l'autre partie du territoire."),
            en = LocalizedContent("Tierra del Fuego is shared between Patagonia and?", listOf("Uruguay", "Chile", "Argentina", "Falklands"), "Geography", "Tierra del Fuego is an archipelago at the southern tip of South America, shared between Chile and Argentina. Patagonia is a region spanning both countries, but the question contrasts Patagonia with Argentina to designate the other part of the territory."),
            zh = LocalizedContent("火地岛由巴塔哥尼亚和哪个地区共享？", listOf("乌拉圭", "智利", "阿根廷", "马尔维纳斯群岛"), "地理", "火地岛是南美洲南端的一个群岛，由智利和阿根廷共享。巴塔哥尼亚是一个横跨两国的地区，但问题将巴塔哥尼亚与阿根廷对比以指定领土的另一部分。"),
            es = LocalizedContent("La Tierra del Fuego se comparte entre la Patagonia y?", listOf("Uruguay", "Chile", "Argentina", "Malvinas"), "Geografía", "La Tierra del Fuego es un archipiélago en el extremo sur de América del Sur, compartido entre Chile y Argentina. La Patagonia es una región que abarca ambos países, pero la pregunta contrasta la Patagonia con Argentina para designar la otra parte del territorio.")
        ),
        BilingualQuestion(
            id = 13273, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'île de Bornéo est partagée par combien de pays?", listOf("2", "3", "4", "5"), "Géographie", "Bornéo est partagée entre l'Indonésie, la Malaisie et le Brunei."),
            en = LocalizedContent("The island of Borneo is shared by how many countries?", listOf("2", "3", "4", "5"), "Geography", "Borneo is shared between Indonesia, Malaysia, and Brunei."),
            zh = LocalizedContent("婆罗洲岛由几个国家共享？", listOf("2", "3", "4", "5"), "地理", "婆罗洲由印度尼西亚、马来西亚和文莱共享。"),
            es = LocalizedContent("La isla de Borneo es compartida por ¿cuántos países?", listOf("2", "3", "4", "5"), "Geografía", "Borneo es compartida entre Indonesia, Malasia y Brunéi.")
        ),
        BilingualQuestion(
            id = 13274, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le détroit de Kerch sépare la Russie de?", listOf("Géorgie", "Crimée", "Ukraine", "Turquie"), "Géographie", "Le détroit de Kerch relie la mer Noire à la mer d'Azov et sépare la péninsule de Crimée (annexée par la Russie) de la Russie continentale, avec l'Ukraine située à l'ouest."),
            en = LocalizedContent("The Kerch Strait separates Russia from?", listOf("Georgia", "Crimea", "Ukraine", "Turkey"), "Geography", "The Kerch Strait connects the Black Sea to the Sea of Azov and separates the Crimean Peninsula (annexed by Russia) from mainland Russia, with Ukraine located to the west."),
            zh = LocalizedContent("刻赤海峡将俄罗斯与哪个地区分开？", listOf("格鲁吉亚", "克里米亚", "乌克兰", "土耳其"), "地理", "刻赤海峡连接黑海和亚速海，将克里米亚半岛（被俄罗斯吞并）与俄罗斯大陆分开，乌克兰位于西部。"),
            es = LocalizedContent("El estrecho de Kerch separa a Rusia de?", listOf("Georgia", "Crimea", "Ucrania", "Turquía"), "Geografía", "El estrecho de Kerch conecta el mar Negro con el mar de Azov y separa la península de Crimea (anexionada por Rusia) de la Rusia continental, con Ucrania al oeste.")
        ),
        BilingualQuestion(
            id = 13275, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'Afrique du Nord inclut le cap de Bonne-Espérance. Vrai ou Faux?", listOf("Vrai", "Faux", "Partiellement", "Débattu"), "Géographie", "Le cap de Bonne-Espérance se situe à l'extrémité sud-ouest de l'Afrique du Sud, en Afrique australe, bien loin de l'Afrique du Nord qui englobe des pays comme le Maroc ou l'Algérie."),
            en = LocalizedContent("North Africa includes the Cape of Good Hope. True or False?", listOf("True", "False", "Partially", "Disputed"), "Geography", "The Cape of Good Hope is located at the southwestern tip of South Africa, in Southern Africa, far from North Africa which includes countries like Morocco or Algeria."),
            zh = LocalizedContent("北非包括好望角。对还是错？", listOf("对", "错", "部分正确", "有争议"), "地理", "好望角位于南非西南端，属于南部非洲，远离包括摩洛哥或阿尔及利亚等国的北非。"),
            es = LocalizedContent("El norte de África incluye el cabo de Buena Esperanza. ¿Verdadero o Falso?", listOf("Verdadero", "Falso", "Parcialmente", "En disputa"), "Geografía", "El cabo de Buena Esperanza se encuentra en el extremo suroeste de Sudáfrica, en el sur de África, muy lejos del norte de África que incluye países como Marruecos o Argelia.")
        ),
        BilingualQuestion(
            id = 13276, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'archipel de la Micronésie est composé de combien d'îles?", listOf("Centaines", "Milliers", "Dizaines", "Centaine"), "Géographie", "La Micronésie est une région du Pacifique comptant plus de 2 000 îles, souvent dispersées en petits atolls et archipels."),
            en = LocalizedContent("The Micronesia archipelago consists of how many islands?", listOf("Hundreds", "Thousands", "Dozens", "Hundred"), "Geography", "Micronesia is a region in the Pacific with over 2,000 islands, often scattered in small atolls and archipelagos."),
            zh = LocalizedContent("密克罗尼西亚群岛由多少个岛屿组成？", listOf("数百个", "数千个", "几十个", "一百个"), "地理", "密克罗尼西亚是太平洋的一个区域，拥有超过2000个岛屿，通常分散在小环礁和群岛中。"),
            es = LocalizedContent("El archipiélago de Micronesia está compuesto por ¿cuántas islas?", listOf("Cientos", "Miles", "Decenas", "Cien"), "Geografía", "Micronesia es una región del Pacífico con más de 2.000 islas, a menudo dispersas en pequeños atolones y archipiélagos.")
        ),
        BilingualQuestion(
            id = 13277, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le golfe du Saint-Laurent est au?", listOf("Québec", "Canada atlantique", "Terre-Neuve", "Nouvelle-Écosse"), "Géographie", "Le golfe du Saint-Laurent baigne les provinces du Nouveau-Brunswick, de la Nouvelle-Écosse, de l'Île-du-Prince-Édouard et de Terre-Neuve-et-Labrador, qui forment la région du Canada atlantique."),
            en = LocalizedContent("The Gulf of St. Lawrence is in?", listOf("Quebec", "Atlantic Canada", "Newfoundland", "Nova Scotia"), "Geography", "The Gulf of St. Lawrence borders the provinces of New Brunswick, Nova Scotia, Prince Edward Island, and Newfoundland and Labrador, which form the Atlantic Canada region."),
            zh = LocalizedContent("圣劳伦斯湾位于？", listOf("魁北克", "加拿大大西洋地区", "纽芬兰", "新斯科舍"), "地理", "圣劳伦斯湾濒临新不伦瑞克省、新斯科舍省、爱德华王子岛省和纽芬兰与拉布拉多省，这些省份构成了加拿大大西洋地区。"),
            es = LocalizedContent("El golfo de San Lorenzo está en?", listOf("Quebec", "Canadá atlántico", "Terranova", "Nueva Escocia"), "Geografía", "El golfo de San Lorenzo baña las provincias de Nuevo Brunswick, Nueva Escocia, Isla del Príncipe Eduardo y Terranova y Labrador, que forman la región del Canadá atlántico.")
        ),
        BilingualQuestion(
            id = 13278, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'île de Nouvelle-Zélande comporte combien d'îles principales?", listOf("1", "2", "3", "4"), "Géographie", "La Nouvelle-Zélande est composée de deux îles principales : l'île du Nord et l'île du Sud, séparées par le détroit de Cook."),
            en = LocalizedContent("How many main islands does New Zealand consist of?", listOf("1", "2", "3", "4"), "Geography", "New Zealand consists of two main islands: the North Island and the South Island, separated by the Cook Strait."),
            zh = LocalizedContent("新西兰由几个主要岛屿组成？", listOf("1", "2", "3", "4"), "地理", "新西兰由两个主要岛屿组成：北岛和南岛，由库克海峡分隔。"),
            es = LocalizedContent("¿De cuántas islas principales se compone Nueva Zelanda?", listOf("1", "2", "3", "4"), "Geografía", "Nueva Zelanda se compone de dos islas principales: la isla del Norte y la isla del Sur, separadas por el estrecho de Cook.")
        ),
        BilingualQuestion(
            id = 13279, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le cap York est le point nord de l'?", listOf("Australie", "Afrique", "Amérique du Sud", "Nouvelle-Zélande"), "Géographie", "Le cap York est situé à l'extrémité nord de la péninsule du cap York, dans l'État du Queensland, en Australie."),
            en = LocalizedContent("Cape York is the northernmost point of?", listOf("Australia", "Africa", "South America", "New Zealand"), "Geography", "Cape York is located at the northern tip of the Cape York Peninsula in Queensland, Australia."),
            zh = LocalizedContent("约克角是哪个国家的最北端？", listOf("澳大利亚", "非洲", "南美洲", "新西兰"), "地理", "约克角位于澳大利亚昆士兰州约克角半岛的北端。"),
            es = LocalizedContent("¿El cabo York es el punto más septentrional de?", listOf("Australia", "África", "América del Sur", "Nueva Zelanda"), "Geografía", "El cabo York se encuentra en el extremo norte de la península del Cabo York, en el estado de Queensland, Australia.")
        ),
        BilingualQuestion(
            id = 13280, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'océan Arctique est glacé. Combien de pays riverains?", listOf("4", "5", "6", "7"), "Géographie", "Les cinq pays riverains de l'océan Arctique sont le Canada, le Danemark (via le Groenland), la Norvège, la Russie et les États-Unis."),
            en = LocalizedContent("The Arctic Ocean is frozen. How many bordering countries?", listOf("4", "5", "6", "7"), "Geography", "The five countries bordering the Arctic Ocean are Canada, Denmark (via Greenland), Norway, Russia, and the United States."),
            zh = LocalizedContent("北冰洋是冰冻的。有多少个沿岸国家？", listOf("4", "5", "6", "7"), "地理", "北冰洋的五个沿岸国家是加拿大、丹麦（通过格陵兰）、挪威、俄罗斯和美国。"),
            es = LocalizedContent("El océano Ártico está helado. ¿Cuántos países ribereños?", listOf("4", "5", "6", "7"), "Geografía", "Los cinco países ribereños del océano Ártico son Canadá, Dinamarca (a través de Groenlandia), Noruega, Rusia y Estados Unidos.")
        ),
        BilingualQuestion(
            id = 13281, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les îles Åland appartiennent à?", listOf("Suède", "Finlande", "Norvège", "Danemark"), "Géographie", "L'archipel d'Åland est une région autonome et démilitarisée de la Finlande, avec une population majoritairement suédophone."),
            en = LocalizedContent("The Åland Islands belong to?", listOf("Sweden", "Finland", "Norway", "Denmark"), "Geography", "The Åland archipelago is an autonomous and demilitarized region of Finland, with a Swedish-speaking majority."),
            zh = LocalizedContent("奥兰群岛属于哪个国家？", listOf("瑞典", "芬兰", "挪威", "丹麦"), "地理", "奥兰群岛是芬兰的一个自治和非军事化地区，人口以瑞典语为主。"),
            es = LocalizedContent("¿Las islas Åland pertenecen a?", listOf("Suecia", "Finlandia", "Noruega", "Dinamarca"), "Geografía", "El archipiélago de Åland es una región autónoma y desmilitarizada de Finlandia, con una población mayoritariamente suecohablante.")
        ),
        BilingualQuestion(
            id = 13282, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le détroit de Tartaria existe-t-il?", listOf("Oui", "Non", "Historiquement", "C'est un mythe"), "Géographie", "Le détroit de Tartarie est une invention cartographique apparue sur certaines cartes du XVIe au XVIIIe siècle, censée séparer l'Asie de l'Amérique du Nord, mais il n'a jamais existé dans la réalité."),
            en = LocalizedContent("Does the Strait of Tartary exist?", listOf("Yes", "No", "Historically", "It's a myth"), "Geography", "The Strait of Tartary is a cartographic invention that appeared on some maps from the 16th to 18th centuries, supposedly separating Asia from North America, but it never existed in reality."),
            zh = LocalizedContent("鞑靼海峡存在吗？", listOf("是", "否", "历史上存在", "这是一个神话"), "地理", "鞑靼海峡是16至18世纪一些地图上出现的制图发明，据称分隔亚洲和北美洲，但现实中从未存在过。"),
            es = LocalizedContent("¿Existe el estrecho de Tartaria?", listOf("Sí", "No", "Históricamente", "Es un mito"), "Geografía", "El estrecho de Tartaria es una invención cartográfica que apareció en algunos mapas de los siglos XVI al XVIII, supuestamente separando Asia de América del Norte, pero nunca existió en la realidad.")
        ),
        BilingualQuestion(
            id = 13283, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'île de Ceylan s'appelle maintenant?", listOf("Chypre", "Sri Lanka", "Taïwan", "Maldives"), "Géographie", "Ceylan a été renommé Sri Lanka en 1972, après son indépendance du Royaume-Uni, pour refléter son héritage culturel local."),
            en = LocalizedContent("The island of Ceylon is now called?", listOf("Cyprus", "Sri Lanka", "Taiwan", "Maldives"), "Geography", "Ceylon was renamed Sri Lanka in 1972, after its independence from the United Kingdom, to reflect its local cultural heritage."),
            zh = LocalizedContent("锡兰岛现在叫什么？", listOf("塞浦路斯", "斯里兰卡", "台湾", "马尔代夫"), "地理", "锡兰于1972年更名为斯里兰卡，以反映其当地文化遗产。"),
            es = LocalizedContent("¿La isla de Ceilán se llama ahora?", listOf("Chipre", "Sri Lanka", "Taiwán", "Maldivas"), "Geografía", "Ceilán fue renombrado Sri Lanka en 1972, después de su independencia del Reino Unido, para reflejar su herencia cultural local.")
        ),
        BilingualQuestion(
            id = 13284, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le golfe du Tonkin borde quel pays?", listOf("Thaïlande", "Laos", "Viêt-Nam", "Cambodge"), "Géographie", "Le golfe du Tonkin est situé au large des côtes du nord du Viêt-Nam, ainsi que de la Chine. Il tire son nom de la région historique du Tonkin, qui correspond au nord du Viêt-Nam actuel."),
            en = LocalizedContent("The Gulf of Tonkin borders which country?", listOf("Thailand", "Laos", "Vietnam", "Cambodia"), "Geography", "The Gulf of Tonkin is located off the coast of northern Vietnam, as well as China. It takes its name from the historical region of Tonkin, which corresponds to present-day northern Vietnam."),
            zh = LocalizedContent("北部湾与哪个国家接壤？", listOf("泰国", "老挝", "越南", "柬埔寨"), "地理", "北部湾位于越南北部沿海以及中国沿海。其名称来源于历史上的东京地区，即现在的越南北部。"),
            es = LocalizedContent("¿El golfo de Tonkín bordea qué país?", listOf("Tailandia", "Laos", "Vietnam", "Camboya"), "Geografía", "El golfo de Tonkín está situado frente a las costas del norte de Vietnam, así como de China. Toma su nombre de la región histórica de Tonkín, que corresponde al norte del Vietnam actual.")
        ),
        BilingualQuestion(
            id = 13285, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'archipel de Zanzibar appartient à?", listOf("Kenya", "Tanzanie", "Mozambique", "Madagascar"), "Géographie", "Zanzibar est un archipel semi-autonome qui fait partie de la République unie de Tanzanie depuis 1964, après la fusion du Tanganyika et de Zanzibar."),
            en = LocalizedContent("The Zanzibar archipelago belongs to?", listOf("Kenya", "Tanzania", "Mozambique", "Madagascar"), "Geography", "Zanzibar is a semi-autonomous archipelago that has been part of the United Republic of Tanzania since 1964, after the merger of Tanganyika and Zanzibar."),
            zh = LocalizedContent("桑给巴尔群岛属于哪个国家？", listOf("肯尼亚", "坦桑尼亚", "莫桑比克", "马达加斯加"), "地理", "桑给巴尔是一个半自治的群岛，自1964年坦噶尼喀和桑给巴尔合并后，成为坦桑尼亚联合共和国的一部分。"),
            es = LocalizedContent("¿El archipiélago de Zanzíbar pertenece a?", listOf("Kenia", "Tanzania", "Mozambique", "Madagascar"), "Geografía", "Zanzíbar es un archipiélago semiautónomo que forma parte de la República Unida de Tanzania desde 1964, tras la fusión de Tanganica y Zanzíbar.")
        ),
        BilingualQuestion(
            id = 13286, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le cap Agulhas est le point sud-est de l'?", listOf("Afrique du Sud", "Afrique", "Madagascar", "Océan Indien"), "Géographie", "Le cap Agulhas est le point le plus méridional du continent africain, situé en Afrique du Sud, où les océans Atlantique et Indien se rencontrent officiellement."),
            en = LocalizedContent("Cape Agulhas is the southernmost point of?", listOf("South Africa", "Africa", "Madagascar", "Indian Ocean"), "Geography", "Cape Agulhas is the southernmost point of the African continent, located in South Africa, where the Atlantic and Indian Oceans officially meet."),
            zh = LocalizedContent("厄加勒斯角是哪个地区的最南端？", listOf("南非", "非洲", "马达加斯加", "印度洋"), "地理", "厄加勒斯角是非洲大陆的最南端，位于南非，是大西洋和印度洋的正式交汇点。"),
            es = LocalizedContent("¿El cabo Agulhas es el punto más meridional de?", listOf("Sudáfrica", "África", "Madagascar", "Océano Índico"), "Geografía", "El cabo Agulhas es el punto más meridional del continente africano, situado en Sudáfrica, donde los océanos Atlántico e Índico se encuentran oficialmente.")
        ),
        BilingualQuestion(
            id = 13287, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les îles Maldives sont composées de combien d'îles?", listOf("100", "500", "1000", "2000"), "Géographie", "Les Maldives sont un archipel de l'océan Indien comprenant environ 1 200 îles, regroupées en 26 atolls. Le nombre de 2 000 est souvent cité en incluant les îlots et bancs de sable."),
            en = LocalizedContent("The Maldives islands are composed of how many islands?", listOf("100", "500", "1000", "2000"), "Geography", "The Maldives is an archipelago in the Indian Ocean comprising about 1,200 islands, grouped into 26 atolls. The number 2,000 is often cited including islets and sandbanks."),
            zh = LocalizedContent("马尔代夫群岛由多少个岛屿组成？", listOf("100", "500", "1000", "2000"), "地理", "马尔代夫是印度洋上的一个群岛，由约1200个岛屿组成，分为26个环礁。包括小岛和沙洲在内，常被引用的数字是2000。"),
            es = LocalizedContent("¿Las islas Maldivas están compuestas por cuántas islas?", listOf("100", "500", "1000", "2000"), "Geografía", "Las Maldivas son un archipiélago en el océano Índico que comprende alrededor de 1.200 islas, agrupadas en 26 atolones. El número de 2.000 se cita a menudo incluyendo islotes y bancos de arena.")
        ),
        BilingualQuestion(
            id = 13288, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le détroit de Tiran sépare l'Égypte et?", listOf("Arabie Saoudite", "Israël", "Jordanie", "Liban"), "Géographie", "Le détroit de Tiran, situé à l'entrée du golfe d'Aqaba, sépare la péninsule du Sinaï égyptienne de la côte nord-ouest de l'Arabie Saoudite."),
            en = LocalizedContent("The Strait of Tiran separates Egypt and?", listOf("Saudi Arabia", "Israel", "Jordan", "Lebanon"), "Geography", "The Strait of Tiran, located at the entrance to the Gulf of Aqaba, separates the Egyptian Sinai Peninsula from the northwestern coast of Saudi Arabia."),
            zh = LocalizedContent("蒂朗海峡分隔埃及和哪个国家？", listOf("沙特阿拉伯", "以色列", "约旦", "黎巴嫩"), "地理", "蒂朗海峡位于亚喀巴湾入口处，分隔埃及西奈半岛和沙特阿拉伯西北海岸。"),
            es = LocalizedContent("¿El estrecho de Tirán separa Egipto y?", listOf("Arabia Saudita", "Israel", "Jordania", "Líbano"), "Geografía", "El estrecho de Tirán, situado en la entrada del golfo de Áqaba, separa la península del Sinaí egipcia de la costa noroeste de Arabia Saudita.")
        ),
    )

    private fun part2(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 13289, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'archipel de la Sonde inclut Sumatra et?", listOf("Bornéo", "Sulawesi", "Java", "Tous les précédents"), "Géographie", "L'archipel de la Sonde comprend les grandes îles de Sumatra, Java, Bornéo, Sulawesi et Timor, ainsi que des milliers d'îles plus petites, donc toutes les options proposées en font partie."),
            en = LocalizedContent("The Sunda Archipelago includes Sumatra and?", listOf("Borneo", "Sulawesi", "Java", "All of the above"), "Geography", "The Sunda Archipelago comprises the major islands of Sumatra, Java, Borneo, Sulawesi, and Timor, along with thousands of smaller islands, so all the proposed options are part of it."),
            zh = LocalizedContent("巽他群岛包括苏门答腊和？", listOf("婆罗洲", "苏拉威西", "爪哇", "以上所有"), "地理", "巽他群岛包括苏门答腊、爪哇、婆罗洲、苏拉威西和帝汶等大岛，以及数千个小岛，因此所有选项都是其中的一部分。"),
            es = LocalizedContent("El archipiélago de la Sonda incluye Sumatra y?", listOf("Borneo", "Célebes", "Java", "Todos los anteriores"), "Geografía", "El archipiélago de la Sonda comprende las grandes islas de Sumatra, Java, Borneo, Célebes y Timor, junto con miles de islas más pequeñas, por lo que todas las opciones propuestas forman parte de él.")
        ),
        BilingualQuestion(
            id = 13290, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le cap Lizard est le point sud-est de?", listOf("Irlande", "Cornouailles anglaise", "Pays de Galles", "Écosse"), "Géographie", "Le cap Lizard marque l'extrémité sud-est de la péninsule de Cornouailles, en Angleterre, et constitue le point le plus méridional de l'île de Grande-Bretagne."),
            en = LocalizedContent("Lizard Point is the southeastern point of?", listOf("Ireland", "English Cornwall", "Wales", "Scotland"), "Geography", "Lizard Point marks the southeastern tip of the Cornwall peninsula in England and is the southernmost point of the island of Great Britain."),
            zh = LocalizedContent("利泽德角是哪个地区的东南端？", listOf("爱尔兰", "英格兰康沃尔", "威尔士", "苏格兰"), "地理", "利泽德角标志着英格兰康沃尔半岛的东南端，也是大不列颠岛的最南端。"),
            es = LocalizedContent("El cabo Lizard es el punto sureste de?", listOf("Irlanda", "Cornualles inglesa", "Gales", "Escocia"), "Geografía", "El cabo Lizard marca el extremo sureste de la península de Cornualles en Inglaterra y es el punto más meridional de la isla de Gran Bretaña.")
        ),
        BilingualQuestion(
            id = 13291, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le golfe d'Arabie est aussi appelé golfe?", listOf("Persique", "Arabe", "Californie", "Mexique"), "Géographie", "Le golfe Persique est le nom historique et officiel de cette étendue d'eau située entre l'Iran et la péninsule arabique, reconnu par les Nations unies et les organisations internationales."),
            en = LocalizedContent("The Arabian Gulf is also called the?", listOf("Persian Gulf", "Arabian Gulf", "Gulf of California", "Gulf of Mexico"), "Geography", "The Persian Gulf is the historical and official name of this body of water between Iran and the Arabian Peninsula, recognized by the United Nations and international organizations."),
            zh = LocalizedContent("阿拉伯湾也被称为？", listOf("波斯湾", "阿拉伯湾", "加利福尼亚湾", "墨西哥湾"), "地理", "波斯湾是位于伊朗和阿拉伯半岛之间的这片水域的历史和官方名称，得到联合国和国际组织的承认。"),
            es = LocalizedContent("El golfo de Arabia también se llama golfo?", listOf("Pérsico", "Árabe", "de California", "de México"), "Geografía", "El golfo Pérsico es el nombre histórico y oficial de esta masa de agua entre Irán y la península arábiga, reconocido por las Naciones Unidas y las organizaciones internacionales.")
        ),
        BilingualQuestion(
            id = 13292, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'île de Chypre est divisée entre?", listOf("Grèce et Turquie", "Grèce et Chypre du Nord", "Chypre grecque et turque", "Tous les précédents"), "Géographie", "Depuis l'invasion turque de 1974, l'île est séparée entre la République de Chypre (grecque) au sud et la République turque de Chypre du Nord (non reconnue internationalement) au nord."),
            en = LocalizedContent("The island of Cyprus is divided between?", listOf("Greece and Turkey", "Greece and Northern Cyprus", "Greek and Turkish Cyprus", "All of the above"), "Geography", "Since the Turkish invasion of 1974, the island has been split between the Republic of Cyprus (Greek) in the south and the Turkish Republic of Northern Cyprus (not internationally recognized) in the north."),
            zh = LocalizedContent("塞浦路斯岛被分割为？", listOf("希腊和土耳其", "希腊和北塞浦路斯", "希族塞人和土族塞人", "以上所有"), "地理", "自1974年土耳其入侵以来，该岛被分为南部的塞浦路斯共和国（希族）和北部的北塞浦路斯土耳其共和国（未获国际承认）。"),
            es = LocalizedContent("La isla de Chipre está dividida entre?", listOf("Grecia y Turquía", "Grecia y Chipre del Norte", "Chipre griega y turca", "Todos los anteriores"), "Geografía", "Desde la invasión turca de 1974, la isla está dividida entre la República de Chipre (griega) al sur y la República Turca de Chipre del Norte (no reconocida internacionalmente) al norte.")
        ),
        BilingualQuestion(
            id = 13293, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le détroit de Palk sépare l'Inde de?", listOf("Sri Lanka", "Bangladesh", "Birmanie", "Thaïlande"), "Géographie", "Le détroit de Palk relie le golfe du Bengale au golfe de Mannar et sépare l'État indien du Tamil Nadu du Sri Lanka."),
            en = LocalizedContent("The Palk Strait separates India from?", listOf("Sri Lanka", "Bangladesh", "Myanmar", "Thailand"), "Geography", "The Palk Strait connects the Bay of Bengal to the Gulf of Mannar and separates the Indian state of Tamil Nadu from Sri Lanka."),
            zh = LocalizedContent("保克海峡将印度与？分开", listOf("斯里兰卡", "孟加拉国", "缅甸", "泰国"), "地理", "保克海峡连接孟加拉湾和马纳尔湾，将印度泰米尔纳德邦与斯里兰卡分开。"),
            es = LocalizedContent("El estrecho de Palk separa la India de?", listOf("Sri Lanka", "Bangladés", "Birmania", "Tailandia"), "Geografía", "El estrecho de Palk conecta la bahía de Bengala con el golfo de Mannar y separa el estado indio de Tamil Nadu de Sri Lanka.")
        ),
        BilingualQuestion(
            id = 13294, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'archipel de Lofoten appartient à?", listOf("Suède", "Finlande", "Norvège", "Islande"), "Géographie", "L'archipel de Lofoten est situé au large de la côte nord-ouest de la Norvège, dans la mer de Norvège. Il fait partie du comté de Nordland, en Norvège."),
            en = LocalizedContent("The Lofoten archipelago belongs to?", listOf("Sweden", "Finland", "Norway", "Iceland"), "Geography", "The Lofoten archipelago is located off the northwestern coast of Norway in the Norwegian Sea. It is part of Nordland county in Norway."),
            zh = LocalizedContent("罗弗敦群岛属于？", listOf("瑞典", "芬兰", "挪威", "冰岛"), "地理", "罗弗敦群岛位于挪威西北海岸外的挪威海，是挪威诺尔兰郡的一部分。"),
            es = LocalizedContent("El archipiélago de Lofoten pertenece a?", listOf("Suecia", "Finlandia", "Noruega", "Islandia"), "Geografía", "El archipiélago de Lofoten está situado frente a la costa noroeste de Noruega en el mar de Noruega. Forma parte del condado de Nordland en Noruega.")
        ),
        BilingualQuestion(
            id = 13295, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le cap Racha est en?", listOf("Russie", "Géorgie", "Turquie", "Bulgarie"), "Géographie", "Le cap Racha est situé sur la côte de la mer Noire, dans la péninsule de Crimée, qui est un territoire disputé mais actuellement contrôlé par la Russie."),
            en = LocalizedContent("Cape Racha is in?", listOf("Russia", "Georgia", "Turkey", "Bulgaria"), "Geography", "Cape Racha is located on the Black Sea coast in the Crimean Peninsula, which is a disputed territory but currently controlled by Russia."),
            zh = LocalizedContent("拉恰角位于？", listOf("俄罗斯", "格鲁吉亚", "土耳其", "保加利亚"), "地理", "拉恰角位于克里米亚半岛的黑海沿岸，该地区存在争议，但目前由俄罗斯控制。"),
            es = LocalizedContent("El cabo Racha está en?", listOf("Rusia", "Georgia", "Turquía", "Bulgaria"), "Geografía", "El cabo Racha está situado en la costa del mar Negro en la península de Crimea, un territorio en disputa pero actualmente controlado por Rusia.")
        ),
        BilingualQuestion(
            id = 13296, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le golfe de Gascogne borde?", listOf("France et Espagne", "France et Portugal", "Espagne et Portugal", "Irlande et France"), "Géographie", "Le golfe de Gascogne est une partie de l'océan Atlantique située au sud-ouest de la France et au nord de l'Espagne."),
            en = LocalizedContent("The Bay of Biscay borders?", listOf("France and Spain", "France and Portugal", "Spain and Portugal", "Ireland and France"), "Geography", "The Bay of Biscay is a part of the Atlantic Ocean located southwest of France and north of Spain."),
            zh = LocalizedContent("比斯开湾毗邻？", listOf("法国和西班牙", "法国和葡萄牙", "西班牙和葡萄牙", "爱尔兰和法国"), "地理", "比斯开湾是大西洋的一部分，位于法国西南部和西班牙北部。"),
            es = LocalizedContent("El golfo de Vizcaya limita con?", listOf("Francia y España", "Francia y Portugal", "España y Portugal", "Irlanda y Francia"), "Geografía", "El golfo de Vizcaya es una parte del océano Atlántico situada al suroeste de Francia y al norte de España.")
        ),
        BilingualQuestion(
            id = 13297, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("L'île de Corsica appartient à?", listOf("Italie", "France", "Espagne", "Suisse"), "Géographie", "Corsica est le nom italien et corse de la Corse, une île de la mer Méditerranée qui est une collectivité territoriale française depuis 1768."),
            en = LocalizedContent("The island of Corsica belongs to?", listOf("Italy", "France", "Spain", "Switzerland"), "Geography", "Corsica is an island in the Mediterranean Sea that has been a French territorial collectivity since 1768."),
            zh = LocalizedContent("科西嘉岛属于？", listOf("意大利", "法国", "西班牙", "瑞士"), "地理", "科西嘉岛是地中海中的一个岛屿，自1768年起成为法国的领土集体。"),
            es = LocalizedContent("La isla de Córcega pertenece a?", listOf("Italia", "Francia", "España", "Suiza"), "Geografía", "Córcega es una isla en el mar Mediterráneo que es una colectividad territorial francesa desde 1768.")
        ),
        BilingualQuestion(
            id = 13298, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le détroit de Davis sépare le Canada du?", listOf("Groenland", "Labrador", "Terre-Neuve", "Archnichipel canadien"), "Géographie", "Le détroit de Davis est un bras de mer situé entre l'île de Baffin (Canada) et le Groenland, reliant la mer du Labrador à la mer de Baffin."),
            en = LocalizedContent("The Davis Strait separates Canada from?", listOf("Greenland", "Labrador", "Newfoundland", "Canadian Archipelago"), "Geography", "The Davis Strait is a sea arm between Baffin Island (Canada) and Greenland, connecting the Labrador Sea to the Baffin Bay."),
            zh = LocalizedContent("戴维斯海峡将加拿大与？分开", listOf("格陵兰", "拉布拉多", "纽芬兰", "加拿大群岛"), "地理", "戴维斯海峡是位于巴芬岛（加拿大）和格陵兰之间的海峡，连接拉布拉多海和巴芬湾。"),
            es = LocalizedContent("El estrecho de Davis separa Canadá de?", listOf("Groenlandia", "Labrador", "Terranova", "Archipiélago canadiense"), "Geografía", "El estrecho de Davis es un brazo de mar entre la isla de Baffin (Canadá) y Groenlandia, que conecta el mar de Labrador con la bahía de Baffin.")
        ),
        BilingualQuestion(
            id = 13299, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'archipel de Vanuatu est situé où?", listOf("Polynésie", "Mélanésie", "Micronésie", "Océanie du Sud"), "Géographie", "Vanuatu fait partie de la région océanienne de la Mélanésie, située dans le Pacifique Sud, au nord-est de l'Australie."),
            en = LocalizedContent("Where is the Vanuatu archipelago located?", listOf("Polynesia", "Melanesia", "Micronesia", "South Oceania"), "Geography", "Vanuatu is part of the Oceanian region of Melanesia, located in the South Pacific, northeast of Australia."),
            zh = LocalizedContent("瓦努阿图群岛位于哪里？", listOf("波利尼西亚", "美拉尼西亚", "密克罗尼西亚", "南大洋洲"), "地理", "瓦努阿图属于大洋洲的美拉尼西亚地区，位于南太平洋，澳大利亚东北部。"),
            es = LocalizedContent("¿Dónde se encuentra el archipiélago de Vanuatu?", listOf("Polinesia", "Melanesia", "Micronesia", "Oceanía del Sur"), "Geografia", "Vanuatu forma parte de la región oceánica de Melanesia, situada en el Pacífico Sur, al noreste de Australia.")
        ),
        BilingualQuestion(
            id = 13300, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Les champignons appartiennent à quel groupe vivant?", listOf("Plantes", "Animaux", "Protistes", "Fungi"), "Nature", "Les champignons forment leur propre règne biologique, les Fungi, distinct des plantes et des animaux, car ils possèdent des parois cellulaires de chitine et se nourrissent par absorption."),
            en = LocalizedContent("Which living group do mushrooms belong to?", listOf("Plants", "Animals", "Protists", "Fungi"), "Nature", "Mushrooms form their own biological kingdom, Fungi, distinct from plants and animals, as they have chitin cell walls and obtain nutrients by absorption."),
            zh = LocalizedContent("蘑菇属于哪个生物类群？", listOf("植物", "动物", "原生生物", "真菌"), "自然", "蘑菇构成自己的生物界——真菌界，与植物和动物不同，因为它们具有几丁质细胞壁并通过吸收获取营养。"),
            es = LocalizedContent("¿A qué grupo de seres vivos pertenecen los hongos?", listOf("Plantas", "Animales", "Protistas", "Hongos"), "Naturaleza", "Los hongos forman su propio reino biológico, Fungi, distinto de las plantas y los animales, ya que poseen paredes celulares de quitina y se nutren por absorción.")
        ),
        BilingualQuestion(
            id = 13301, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Comment se reproduisent principalement les champignons?", listOf("Graines", "Spores", "Bourgeons", "Division cellulaire"), "Nature", "Les champignons se reproduisent principalement via des spores, des cellules reproductrices microscopiques libérées dans l'environnement pour germer et former de nouveaux individus."),
            en = LocalizedContent("How do mushrooms primarily reproduce?", listOf("Seeds", "Spores", "Budding", "Cell division"), "Nature", "Mushrooms primarily reproduce via spores, microscopic reproductive cells released into the environment to germinate and form new individuals."),
            zh = LocalizedContent("蘑菇主要通过什么方式繁殖？", listOf("种子", "孢子", "出芽", "细胞分裂"), "自然", "蘑菇主要通过孢子繁殖，孢子是微小的生殖细胞，释放到环境中萌发形成新个体。"),
            es = LocalizedContent("¿Cómo se reproducen principalmente los hongos?", listOf("Semillas", "Esporas", "Gemación", "División celular"), "Naturaleza", "Los hongos se reproducen principalmente mediante esporas, células reproductoras microscópicas liberadas al ambiente para germinar y formar nuevos individuos.")
        ),
        BilingualQuestion(
            id = 13302, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Les coraux sont des animaux ou des plantes?", listOf("Animaux", "Plantes", "Protistes", "Fungi"), "Nature", "Les coraux sont des animaux marins appartenant à l'embranchement des cnidaires, comme les méduses. Ils vivent en colonies et construisent des squelettes calcaires."),
            en = LocalizedContent("Are corals animals or plants?", listOf("Animals", "Plants", "Protists", "Fungi"), "Nature", "Corals are marine animals belonging to the phylum Cnidaria, like jellyfish. They live in colonies and build calcareous skeletons."),
            zh = LocalizedContent("珊瑚是动物还是植物？", listOf("动物", "植物", "原生生物", "真菌"), "自然", "珊瑚是海洋动物，属于刺胞动物门，与水母类似。它们群居并构建钙质骨骼。"),
            es = LocalizedContent("¿Los corales son animales o plantas?", listOf("Animales", "Plantas", "Protistas", "Hongos"), "Naturaleza", "Los corales son animales marinos pertenecientes al filo Cnidaria, como las medusas. Viven en colonias y construyen esqueletos calcáreos.")
        ),
        BilingualQuestion(
            id = 13303, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les coraux forment des récifs en association avec?", listOf("Diatomées", "Algues zooxanthelles", "Bactéries", "Virus"), "Nature", "Les coraux vivent en symbiose avec des algues microscopiques appelées zooxanthelles, qui leur fournissent l'énergie nécessaire à la construction de leur squelette calcaire, formant ainsi les récifs."),
            en = LocalizedContent("Corals form reefs in association with?", listOf("Diatoms", "Zooxanthellae algae", "Bacteria", "Viruses"), "Nature", "Corals live in symbiosis with microscopic algae called zooxanthellae, which provide the energy needed to build their calcareous skeleton, thus forming reefs."),
            zh = LocalizedContent("珊瑚与什么共生形成礁石？", listOf("硅藻", "虫黄藻", "细菌", "病毒"), "自然", "珊瑚与称为虫黄藻的微型藻类共生，这些藻类为珊瑚提供构建钙质骨骼所需的能量，从而形成礁石。"),
            es = LocalizedContent("¿Los corales forman arrecifes en asociación con?", listOf("Diatomeas", "Algas zooxantelas", "Bacterias", "Virus"), "Naturaleza", "Los corales viven en simbiosis con algas microscópicas llamadas zooxantelas, que les proporcionan la energía necesaria para construir su esqueleto calcáreo, formando así los arrecifes.")
        ),
        BilingualQuestion(
            id = 13304, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Les bactéries sont unicellulaires. Possèdent-elles un noyau?", listOf("Oui", "Non", "Parfois", "Débattu"), "Nature", "Les bactéries sont des organismes procaryotes, ce qui signifie qu'elles n'ont pas de noyau délimité par une membrane. Leur matériel génétique est libre dans le cytoplasme."),
            en = LocalizedContent("Bacteria are unicellular. Do they have a nucleus?", listOf("Yes", "No", "Sometimes", "Debated"), "Nature", "Bacteria are prokaryotic organisms, meaning they lack a membrane-bound nucleus. Their genetic material is free in the cytoplasm."),
            zh = LocalizedContent("细菌是单细胞生物。它们有细胞核吗？", listOf("有", "没有", "有时有", "有争议"), "自然", "细菌是原核生物，意味着它们没有膜包裹的细胞核。它们的遗传物质游离在细胞质中。"),
            es = LocalizedContent("Las bacterias son unicelulares. ¿Tienen núcleo?", listOf("Sí", "No", "A veces", "Debatido"), "Naturaleza", "Las bacterias son organismos procariotas, lo que significa que carecen de núcleo delimitado por una membrana. Su material genético está libre en el citoplasma.")
        ),
        BilingualQuestion(
            id = 13305, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La paroi cellulaire bactérienne est composée de?", listOf("Cellullose", "Peptidoglycane", "Lipides", "Protéines"), "Nature", "Le peptidoglycane est un polymère unique aux bactéries, formé de sucres et d'acides aminés, qui confère rigidité et protection à leur paroi cellulaire."),
            en = LocalizedContent("The bacterial cell wall is composed of?", listOf("Cellulose", "Peptidoglycan", "Lipids", "Proteins"), "Nature", "Peptidoglycan is a polymer unique to bacteria, made of sugars and amino acids, which provides rigidity and protection to their cell wall."),
            zh = LocalizedContent("细菌细胞壁由什么组成？", listOf("纤维素", "肽聚糖", "脂质", "蛋白质"), "自然", "肽聚糖是细菌特有的聚合物，由糖和氨基酸组成，为细胞壁提供刚性和保护。"),
            es = LocalizedContent("¿De qué está compuesta la pared celular bacteriana?", listOf("Celulosa", "Peptidoglicano", "Lípidos", "Proteínas"), "Naturaleza", "El peptidoglicano es un polímero único de las bacterias, formado por azúcares y aminoácidos, que proporciona rigidez y protección a su pared celular.")
        ),
        BilingualQuestion(
            id = 13306, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Les algues vertes sont des?", listOf("Bactéries", "Protistes", "Plantes", "Fungi"), "Nature", "Les algues vertes sont classées dans le règne végétal car elles réalisent la photosynthèse grâce à la chlorophylle."),
            en = LocalizedContent("Green algae are?", listOf("Bacteria", "Protists", "Plants", "Fungi"), "Nature", "Green algae are classified in the plant kingdom because they perform photosynthesis using chlorophyll."),
            zh = LocalizedContent("绿藻属于？", listOf("细菌", "原生生物", "植物", "真菌"), "自然", "绿藻被归类为植物界，因为它们利用叶绿素进行光合作用。"),
            es = LocalizedContent("¿Las algas verdes son?", listOf("Bacterias", "Protistas", "Plantas", "Hongos"), "Naturaleza", "Las algas verdes se clasifican en el reino vegetal porque realizan la fotosíntesis gracias a la clorofila.")
        ),
        BilingualQuestion(
            id = 13307, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Comment se reproduisent les algues principalement?", listOf("Graines", "Spores", "Scission binaire", "Toutes les méthodes"), "Nature", "Les algues peuvent se reproduire de manière asexuée par division cellulaire ou fragmentation, et sexuée par la fusion de gamètes, selon les espèces et les conditions environnementales."),
            en = LocalizedContent("How do algae primarily reproduce?", listOf("Seeds", "Spores", "Binary fission", "All methods"), "Nature", "Algae can reproduce asexually by cell division or fragmentation, and sexually by gamete fusion, depending on species and environmental conditions."),
            zh = LocalizedContent("藻类主要通过什么方式繁殖？", listOf("种子", "孢子", "二分裂", "所有方法"), "自然", "藻类可以通过细胞分裂或碎片化进行无性繁殖，也可以通过配子融合进行有性繁殖，具体取决于物种和环境条件。"),
            es = LocalizedContent("¿Cómo se reproducen principalmente las algas?", listOf("Semillas", "Esporas", "Fisión binaria", "Todos los métodos"), "Naturaleza", "Las algas pueden reproducirse asexualmente por división celular o fragmentación, y sexualmente por fusión de gametos, según la especie y las condiciones ambientales.")
        ),
        BilingualQuestion(
            id = 13308, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Les parasites vivent sur ou dans un?", listOf("Prédateur", "Hôte", "Proie", "Symbionte"), "Nature", "Un parasite dépend d'un autre organisme, appelé hôte, pour se nourrir et se reproduire, souvent au détriment de ce dernier."),
            en = LocalizedContent("Parasites live on or in a?", listOf("Predator", "Host", "Prey", "Symbiont"), "Nature", "A parasite depends on another organism, called the host, for nourishment and reproduction, often to the detriment of the host."),
            zh = LocalizedContent("寄生虫生活在什么生物之上或之内？", listOf("捕食者", "宿主", "猎物", "共生体"), "自然", "寄生虫依赖另一种生物（称为宿主）获取营养和繁殖，通常对宿主有害。"),
            es = LocalizedContent("¿Los parásitos viven sobre o dentro de un?", listOf("Depredador", "Huésped", "Presa", "Simbionte"), "Naturaleza", "Un parásito depende de otro organismo, llamado huésped, para alimentarse y reproducirse, a menudo en detrimento de este.")
        ),
        BilingualQuestion(
            id = 13309, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La relation parasitaire est un exemple de?", listOf("Symbiose", "Prédation", "Compétition", "Mutualisme"), "Nature", "En biologie, la symbiose désigne toute interaction durable entre deux organismes, incluant le parasitisme où l'un profite au détriment de l'autre."),
            en = LocalizedContent("The parasitic relationship is an example of?", listOf("Symbiosis", "Predation", "Competition", "Mutualism"), "Nature", "In biology, symbiosis refers to any long-term interaction between two organisms, including parasitism where one benefits at the expense of the other."),
            zh = LocalizedContent("寄生关系是以下哪种关系的例子？", listOf("共生", "捕食", "竞争", "互利共生"), "自然", "在生物学中，共生指两个生物体之间的任何长期相互作用，包括一方受益而另一方受损的寄生关系。"),
            es = LocalizedContent("¿La relación parasitaria es un ejemplo de?", listOf("Simbiosis", "Depredación", "Competencia", "Mutualismo"), "Naturaleza", "En biología, la simbiosis se refiere a cualquier interacción duradera entre dos organismos, incluyendo el parasitismo donde uno se beneficia a expensas del otro.")
        ),
        BilingualQuestion(
            id = 13310, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La symbiose entre racine et champignon s'appelle?", listOf("Parasitisme", "Mycorhize", "Épiphytisme", "Commensalisme"), "Nature", "Le terme mycorhize désigne l'association symbiotique entre les racines d'une plante et un champignon, permettant un échange de nutriments bénéfique aux deux organismes."),
            en = LocalizedContent("The symbiosis between root and fungus is called?", listOf("Parasitism", "Mycorrhiza", "Epiphytism", "Commensalism"), "Nature", "The term mycorrhiza refers to the symbiotic association between plant roots and a fungus, allowing a beneficial exchange of nutrients for both organisms."),
            zh = LocalizedContent("根与真菌之间的共生称为？", listOf("寄生", "菌根", "附生", "偏利共生"), "自然", "菌根一词指植物根系与真菌之间的共生联合，使双方能够进行有益的营养交换。"),
            es = LocalizedContent("¿La simbiosis entre raíz y hongo se llama?", listOf("Parasitismo", "Micorriza", "Epifitismo", "Comensalismo"), "Naturaleza", "El término micorriza se refiere a la asociación simbiótica entre las raíces de una planta y un hongo, permitiendo un intercambio beneficioso de nutrientes para ambos organismos.")
        ),
        BilingualQuestion(
            id = 13311, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La symbiose lichen résulte de l'association de quel et quoi?", listOf("Algue et bactérie", "Algue et champignon", "Bactérie et champignon", "Virus et cellule"), "Nature", "Le lichen est un organisme composite issu de la symbiose entre un champignon et une algue (ou une cyanobactérie), où le champignon fournit un abri et l'algue produit de la nourriture par photosynthèse."),
            en = LocalizedContent("Lichen symbiosis results from the association of what and what?", listOf("Alga and bacterium", "Alga and fungus", "Bacterium and fungus", "Virus and cell"), "Nature", "Lichen is a composite organism resulting from symbiosis between a fungus and an alga (or cyanobacterium), where the fungus provides shelter and the alga produces food through photosynthesis."),
            zh = LocalizedContent("地衣共生是由什么和什么的结合产生的？", listOf("藻类和细菌", "藻类和真菌", "细菌和真菌", "病毒和细胞"), "自然", "地衣是一种复合生物，由真菌与藻类（或蓝细菌）共生形成，真菌提供庇护，藻类通过光合作用制造食物。"),
            es = LocalizedContent("¿La simbiosis del liquen resulta de la asociación de qué y qué?", listOf("Alga y bacteria", "Alga y hongo", "Bacteria y hongo", "Virus y célula"), "Naturaleza", "El liquen es un organismo compuesto resultante de la simbiosis entre un hongo y un alga (o cianobacteria), donde el hongo proporciona refugio y el alga produce alimento mediante fotosíntesis.")
        ),
        BilingualQuestion(
            id = 13312, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Les biomes terrestres incluent tous sauf?", listOf("Toundra", "Savane", "Océan", "Désert"), "Nature", "Les biomes terrestres sont définis par leurs écosystèmes sur terre ferme, comme les forêts ou les déserts. L'océan est un biome aquatique, pas terrestre."),
            en = LocalizedContent("Terrestrial biomes include all except?", listOf("Tundra", "Savanna", "Ocean", "Desert"), "Nature", "Terrestrial biomes are defined by their ecosystems on land, such as forests or deserts. The ocean is an aquatic biome, not terrestrial."),
            zh = LocalizedContent("陆地生物群落包括以下所有，除了？", listOf("苔原", "稀树草原", "海洋", "沙漠"), "自然", "陆地生物群落由陆地上的生态系统定义，如森林或沙漠。海洋是水生生物群落，而非陆地。"),
            es = LocalizedContent("Los biomas terrestres incluyen todos excepto?", listOf("Tundra", "Sabana", "Océano", "Desierto"), "Naturaleza", "Los biomas terrestres se definen por sus ecosistemas en tierra firme, como bosques o desiertos. El océano es un bioma acuático, no terrestre.")
        ),
        BilingualQuestion(
            id = 13313, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le biome de toundra se caractérise par?", listOf("Froid extrême", "Peu de précipitations", "Permafrost", "Tous les précédents"), "Nature", "La toundra est définie par un climat froid, un sol gelé (pergélisol), une végétation basse et une courte saison de croissance, ce qui rend toutes les caractéristiques précédentes correctes."),
            en = LocalizedContent("The tundra biome is characterized by?", listOf("Extreme cold", "Low precipitation", "Permafrost", "All of the above"), "Nature", "Tundra is defined by a cold climate, frozen soil (permafrost), low vegetation, and a short growing season, making all previous characteristics correct."),
            zh = LocalizedContent("苔原生物群落的特征是？", listOf("极端寒冷", "降水少", "永久冻土", "以上所有"), "自然", "苔原以寒冷气候、冻土（永久冻土）、低矮植被和短生长季为特征，因此以上所有特征都正确。"),
            es = LocalizedContent("¿El bioma de tundra se caracteriza por?", listOf("Frío extremo", "Bajas precipitaciones", "Permafrost", "Todos los anteriores"), "Naturaleza", "La tundra se define por un clima frío, suelo congelado (permafrost), vegetación baja y una corta temporada de crecimiento, lo que hace que todas las características anteriores sean correctas.")
        ),
        BilingualQuestion(
            id = 13314, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le biome de taïga est aussi appelé forêt?", listOf("Tropicale", "Tempérée", "Boréale", "Méditerranéenne"), "Nature", "La taïga est une forêt de conifères située dans les régions froides de l'hémisphère nord, ce qui lui vaut le nom de forêt boréale."),
            en = LocalizedContent("The taiga biome is also called forest?", listOf("Tropical", "Temperate", "Boreal", "Mediterranean"), "Nature", "Taiga is a coniferous forest located in cold regions of the northern hemisphere, hence it is also called boreal forest."),
            zh = LocalizedContent("泰加林生物群落也被称为？", listOf("热带雨林", "温带森林", "北方森林", "地中海森林"), "自然", "泰加林是位于北半球寒冷地区的针叶林，因此也被称为北方森林。"),
            es = LocalizedContent("¿El bioma de taiga también se llama bosque?", listOf("Tropical", "Templado", "Boreal", "Mediterráneo"), "Naturaleza", "La taiga es un bosque de coníferas ubicado en regiones frías del hemisferio norte, por lo que también se llama bosque boreal.")
        ),
        BilingualQuestion(
            id = 13315, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Les champignons décomposeurs jouent un rôle crucial de?", listOf("Prédateur", "Producteur", "Nettoyeur", "Compétiteur"), "Nature", "Ils transforment la matière organique morte en éléments nutritifs pour le sol, agissant ainsi comme les recycleurs et nettoyeurs naturels des écosystèmes."),
            en = LocalizedContent("Decomposer fungi play a crucial role as?", listOf("Predator", "Producer", "Cleaner", "Competitor"), "Nature", "They transform dead organic matter into nutrients for the soil, thus acting as natural recyclers and cleaners of ecosystems."),
            zh = LocalizedContent("分解真菌扮演着至关重要的什么角色？", listOf("捕食者", "生产者", "清洁者", "竞争者"), "自然", "它们将死亡的有机物质转化为土壤养分，从而充当生态系统的天然回收者和清洁者。"),
            es = LocalizedContent("¿Los hongos descomponedores juegan un papel crucial como?", listOf("Depredador", "Productor", "Limpiador", "Competidor"), "Naturaleza", "Transforman la materia orgánica muerta en nutrientes para el suelo, actuando así como recicladores y limpiadores naturales de los ecosistemas.")
        ),
        BilingualQuestion(
            id = 13316, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le mycélium est la partie du champignon qui?", listOf("Produit les spores", "Se reproduit", "Absorbe les nutriments", "Libère les spores"), "Nature", "Le mycélium est un réseau de filaments souterrains qui permet au champignon de décomposer la matière organique et d'absorber les nutriments nécessaires à sa croissance."),
            en = LocalizedContent("Mycelium is the part of the fungus that?", listOf("Produces spores", "Reproduces", "Absorbs nutrients", "Releases spores"), "Nature", "Mycelium is a network of underground filaments that allows the fungus to decompose organic matter and absorb nutrients necessary for its growth."),
            zh = LocalizedContent("菌丝体是真菌的哪一部分？", listOf("产生孢子", "繁殖", "吸收营养", "释放孢子"), "自然", "菌丝体是由地下菌丝组成的网络，使真菌能够分解有机物质并吸收生长所需的营养。"),
            es = LocalizedContent("¿El micelio es la parte del hongo que?", listOf("Produce esporas", "Se reproduce", "Absorbe nutrientes", "Libera esporas"), "Naturaleza", "El micelio es una red de filamentos subterráneos que permite al hongo descomponer materia orgánica y absorber los nutrientes necesarios para su crecimiento.")
        ),
        BilingualQuestion(
            id = 13317, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les basidiomycètes produisent les spores dans??", listOf("Sporanges", "Basides", "Asques", "Zoospores"), "Nature", "Les basidiomycètes, un groupe de champignons, produisent leurs spores sexuées sur des cellules spécialisées appelées basides, situées généralement à la surface des lames des champignons."),
            en = LocalizedContent("Basidiomycetes produce spores in?", listOf("Sporangia", "Basidia", "Asci", "Zoospores"), "Nature", "Basidiomycetes, a group of fungi, produce their sexual spores on specialized cells called basidia, usually located on the surface of mushroom gills."),
            zh = LocalizedContent("担子菌在什么结构中产生孢子？", listOf("孢子囊", "担子", "子囊", "游动孢子"), "自然", "担子菌是一类真菌，它们在称为担子的特化细胞上产生有性孢子，通常位于蘑菇菌褶的表面。"),
            es = LocalizedContent("¿Los basidiomicetos producen esporas en?", listOf("Esporangios", "Basidios", "Ascos", "Zoosporas"), "Naturaleza", "Los basidiomicetos, un grupo de hongos, producen sus esporas sexuales en células especializadas llamadas basidios, generalmente ubicadas en la superficie de las láminas de los hongos.")
        ),
        BilingualQuestion(
            id = 13318, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les ascomycètes sont les champignons qui?", listOf("Forment des cordes", "Produisent des asques", "Vivent sur le sol", "Parasitent les arbres"), "Nature", "Les ascomycètes forment le plus grand embranchement des champignons, caractérisé par la production de spores sexuées dans des cellules spécialisées appelées asques."),
            en = LocalizedContent("Ascomycetes are fungi that?", listOf("Form cords", "Produce asci", "Live on soil", "Parasitize trees"), "Nature", "Ascomycetes form the largest phylum of fungi, characterized by the production of sexual spores in specialized cells called asci."),
            zh = LocalizedContent("子囊菌是以下哪种真菌？", listOf("形成菌索", "产生子囊", "生活在土壤中", "寄生于树木"), "自然", "子囊菌是真菌中最大的门，其特征是在称为子囊的特化细胞中产生有性孢子。"),
            es = LocalizedContent("¿Los ascomicetos son hongos que?", listOf("Forman cuerdas", "Producen ascos", "Viven en el suelo", "Parasitan árboles"), "Naturaleza", "Los ascomicetos forman el filo más grande de hongos, caracterizado por la producción de esporas sexuales en células especializadas llamadas ascos.")
        ),
        BilingualQuestion(
            id = 13319, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La formation de polypes coralliens demande?", listOf("Quelques jours", "Quelques années", "Plusieurs siècles", "Plusieurs millénaires"), "Nature", "Les polypes coralliens sécrètent du carbonate de calcium pour former leur squelette, un processus extrêmement lent qui prend plusieurs siècles pour créer des récifs massifs."),
            en = LocalizedContent("The formation of coral polyps requires?", listOf("A few days", "A few years", "Several centuries", "Several millennia"), "Nature", "Coral polyps secrete calcium carbonate to form their skeleton, an extremely slow process that takes several centuries to create massive reefs."),
            zh = LocalizedContent("珊瑚息肉的形成需要？", listOf("几天", "几年", "几个世纪", "几千年"), "自然", "珊瑚息肉分泌碳酸钙形成骨骼，这是一个极其缓慢的过程，需要几个世纪才能形成巨大的珊瑚礁。"),
            es = LocalizedContent("¿La formación de pólipos de coral requiere?", listOf("Unos días", "Unos años", "Varios siglos", "Varios milenios"), "Naturaleza", "Los pólipos de coral secretan carbonato de calcio para formar su esqueleto, un proceso extremadamente lento que toma varios siglos para crear arrecifes masivos.")
        ),
        BilingualQuestion(
            id = 13320, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le blanchiment des coraux est causé par?", listOf("Pollution", "Augmentation de température", "Acidification", "Tous les précédents"), "Nature", "Le blanchiment des coraux résulte d'une combinaison de facteurs : l'augmentation de la température de l'eau, la pollution et l'acidification des océans, qui stressent les coraux et les poussent à expulser leurs algues symbiotiques."),
            en = LocalizedContent("Coral bleaching is caused by?", listOf("Pollution", "Temperature increase", "Acidification", "All of the above"), "Nature", "Coral bleaching results from a combination of factors: increased water temperature, pollution, and ocean acidification, which stress corals and cause them to expel their symbiotic algae."),
            zh = LocalizedContent("珊瑚白化是由什么引起的？", listOf("污染", "温度升高", "酸化", "以上所有"), "自然", "珊瑚白化是多种因素共同作用的结果：水温升高、污染和海洋酸化，这些因素使珊瑚受到压力，导致它们排出共生藻类。"),
            es = LocalizedContent("¿El blanqueamiento de los corales es causado por?", listOf("Contaminación", "Aumento de temperatura", "Acidificación", "Todos los anteriores"), "Naturaleza", "El blanqueamiento de los corales resulta de una combinación de factores: el aumento de la temperatura del agua, la contaminación y la acidificación de los océanos, que estresan a los corales y los llevan a expulsar sus algas simbióticas.")
        ),
        BilingualQuestion(
            id = 13321, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Les bactéries photosynthétiques produisent de l'?", listOf("Azote", "Oxygène", "Méthane", "Dioxyde de carbone"), "Nature", "Les bactéries photosynthétiques, comme les cyanobactéries, utilisent la lumière solaire pour convertir le dioxyde de carbone et l'eau en énergie, libérant de l'oxygène comme sous-produit."),
            en = LocalizedContent("Photosynthetic bacteria produce?", listOf("Nitrogen", "Oxygen", "Methane", "Carbon dioxide"), "Nature", "Photosynthetic bacteria, such as cyanobacteria, use sunlight to convert carbon dioxide and water into energy, releasing oxygen as a byproduct."),
            zh = LocalizedContent("光合细菌产生？", listOf("氮气", "氧气", "甲烷", "二氧化碳"), "自然", "光合细菌，如蓝细菌，利用阳光将二氧化碳和水转化为能量，并释放氧气作为副产品。"),
            es = LocalizedContent("¿Las bacterias fotosintéticas producen?", listOf("Nitrógeno", "Oxígeno", "Metano", "Dióxido de carbono"), "Naturaleza", "Las bacterias fotosintéticas, como las cianobacterias, utilizan la luz solar para convertir dióxido de carbono y agua en energía, liberando oxígeno como subproducto.")
        ),
        BilingualQuestion(
            id = 13322, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La conjugaison bactérienne est un processus de?", listOf("Reproduction", "Transfert d'ADN", "Respiration", "Photosynthèse"), "Nature", "La conjugaison bactérienne permet le transfert d'ADN d'une bactérie donneuse à une bactérie receveuse via un pilus, favorisant la diversité génétique."),
            en = LocalizedContent("Bacterial conjugation is a process of?", listOf("Reproduction", "DNA transfer", "Respiration", "Photosynthesis"), "Nature", "Bacterial conjugation allows the transfer of DNA from a donor bacterium to a recipient bacterium via a pilus, promoting genetic diversity."),
            zh = LocalizedContent("细菌接合是一个什么过程？", listOf("繁殖", "DNA转移", "呼吸", "光合作用"), "自然", "细菌接合允许通过菌毛将DNA从供体细菌转移到受体细菌，促进遗传多样性。"),
            es = LocalizedContent("¿La conjugación bacteriana es un proceso de?", listOf("Reproducción", "Transferencia de ADN", "Respiración", "Fotosíntesis"), "Naturaleza", "La conjugación bacteriana permite la transferencia de ADN de una bacteria donante a una bacteria receptora a través de un pilus, favoreciendo la diversidad genética.")
        ),
        BilingualQuestion(
            id = 13323, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les algues calcaires construisent les récifs par sécrétions de?", listOf("Calcite", "Aragonite", "Carbonate de calcium", "Tous les précédents"), "Nature", "Les algues calcaires sécrètent du carbonate de calcium sous forme d'aragonite, de calcite et de magnésium, contribuant ainsi à la construction des récifs coralliens."),
            en = LocalizedContent("Calcareous algae build reefs by secreting?", listOf("Calcite", "Aragonite", "Calcium carbonate", "All of the above"), "Nature", "Calcareous algae secrete calcium carbonate in the form of aragonite, calcite, and magnesium, thus contributing to the construction of coral reefs."),
            zh = LocalizedContent("钙质藻类通过分泌什么来建造礁石？", listOf("方解石", "文石", "碳酸钙", "以上所有"), "自然", "钙质藻类分泌碳酸钙，形式包括文石、方解石和镁，从而有助于珊瑚礁的构建。"),
            es = LocalizedContent("¿Las algas calcáreas construyen los arrecifes mediante secreciones de?", listOf("Calcita", "Aragonita", "Carbonato de calcio", "Todos los anteriores"), "Naturaleza", "Las algas calcáreas secretan carbonato de calcio en forma de aragonita, calcita y magnesio, contribuyendo así a la construcción de los arrecifes de coral.")
        ),
        BilingualQuestion(
            id = 13324, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le plasmodesme est un pore de connexion entre?", listOf("Cellules du même organisme", "Cellules d'organismes différents", "Noyau et cytoplasme", "Chloroplaste et mitochondrie"), "Nature", "Le plasmodesme est un canal microscopique qui traverse les parois cellulaires des végétaux, permettant les échanges entre cellules adjacentes d'un même organisme."),
            en = LocalizedContent("A plasmodesma is a connection pore between?", listOf("Cells of the same organism", "Cells of different organisms", "Nucleus and cytoplasm", "Chloroplast and mitochondrion"), "Nature", "A plasmodesma is a microscopic channel that traverses the cell walls of plants, allowing exchanges between adjacent cells of the same organism."),
            zh = LocalizedContent("胞间连丝是连接什么的孔？", listOf("同一生物体的细胞", "不同生物体的细胞", "细胞核和细胞质", "叶绿体和线粒体"), "自然", "胞间连丝是一种穿过植物细胞壁的微小通道，允许同一生物体相邻细胞之间的交换。"),
            es = LocalizedContent("¿Un plasmodesmo es un poro de conexión entre?", listOf("Células del mismo organismo", "Células de organismos diferentes", "Núcleo y citoplasma", "Cloroplasto y mitocondria"), "Naturaleza", "El plasmodesmo es un canal microscópico que atraviesa las paredes celulares de las plantas, permitiendo los intercambios entre células adyacentes de un mismo organismo.")
        ),
        BilingualQuestion(
            id = 13325, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les spirochètes sont des bactéries de forme?", listOf("Sphérique", "Bacille", "Spirale", "Fusiforme"), "Nature", "Le terme \"spirochète\" vient du grec \"speira\" (spirale) et \"chaite\" (cheveu), désignant leur forme hélicoïdale caractéristique."),
            en = LocalizedContent("Spirochetes are bacteria of what shape?", listOf("Spherical", "Rod-shaped", "Spiral", "Fusiform"), "Nature", "The term \"spirochete\" comes from the Greek \"speira\" (spiral) and \"chaite\" (hair), referring to their characteristic helical shape."),
            zh = LocalizedContent("螺旋体是什么形状的细菌？", listOf("球形", "杆状", "螺旋形", "梭形"), "自然", "“螺旋体”一词源自希腊语“speira”（螺旋）和“chaite”（毛发），指其特有的螺旋形状。"),
            es = LocalizedContent("¿Las espiroquetas son bacterias de forma?", listOf("Esférica", "Bacilar", "Espiral", "Fusiforme"), "Naturaleza", "El término \"espiroqueta\" proviene del griego \"speira\" (espiral) y \"chaite\" (cabello), refiriéndose a su forma helicoidal característica.")
        ),
        BilingualQuestion(
            id = 13326, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les archées diffèrent des bactéries par la?", listOf("Forme", "Reproduction", "Composition membranaire", "Localisation"), "Nature", "Les archées possèdent des lipides membranaires aux chaînes carbonées ramifiées liées par des liaisons éther, contrairement aux bactéries dont les membranes sont composées d'acides gras à liaisons ester."),
            en = LocalizedContent("Archaea differ from bacteria in?", listOf("Shape", "Reproduction", "Membrane composition", "Location"), "Nature", "Archaea have membrane lipids with branched carbon chains linked by ether bonds, unlike bacteria whose membranes are composed of fatty acids with ester bonds."),
            zh = LocalizedContent("古菌与细菌的区别在于？", listOf("形状", "繁殖", "膜组成", "位置"), "自然", "古菌的膜脂具有由醚键连接的支链碳链，而细菌的膜由酯键连接的脂肪酸组成。"),
            es = LocalizedContent("¿Las arqueas difieren de las bacterias en?", listOf("Forma", "Reproducción", "Composición de la membrana", "Localización"), "Naturaleza", "Las arqueas poseen lípidos de membrana con cadenas carbonadas ramificadas unidas por enlaces éter, a diferencia de las bacterias cuyas membranas están compuestas de ácidos grasos con enlaces éster.")
        ),
        BilingualQuestion(
            id = 13327, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le zooplancton du récif corallien inclut?", listOf("Copépodes", "Larves de poisson", "Crustacés minuscules", "Tous les précédents"), "Nature", "Le zooplancton des récifs coralliens est très diversifié et comprend des larves de poissons, des crustacés microscopiques et des méduses, entre autres organismes."),
            en = LocalizedContent("Coral reef zooplankton includes?", listOf("Copepods", "Fish larvae", "Tiny crustaceans", "All of the above"), "Nature", "Coral reef zooplankton is highly diverse and includes fish larvae, microscopic crustaceans, and jellyfish, among other organisms."),
            zh = LocalizedContent("珊瑚礁浮游动物包括？", listOf("桡足类", "鱼幼虫", "微小的甲壳动物", "以上所有"), "自然", "珊瑚礁浮游动物非常多样化，包括鱼幼虫、微小的甲壳动物和水母等生物。"),
            es = LocalizedContent("¿El zooplancton del arrecife de coral incluye?", listOf("Copépodos", "Larvas de pez", "Crustáceos diminutos", "Todos los anteriores"), "Naturaleza", "El zooplancton de los arrecifes de coral es muy diverso e incluye larvas de peces, crustáceos microscópicos y medusas, entre otros organismos.")
        ),
        BilingualQuestion(
            id = 13328, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La chlorophylle est le pigment principal de la?", listOf("Photosynthèse", "Respiration", "Reproduction", "Croissance"), "Nature", "La chlorophylle capte l'énergie lumineuse nécessaire à la photosynthèse, processus par lequel les plantes transforment le dioxyde de carbone et l'eau en glucose et oxygène."),
            en = LocalizedContent("Chlorophyll is the main pigment of?", listOf("Photosynthesis", "Respiration", "Reproduction", "Growth"), "Nature", "Chlorophyll captures the light energy necessary for photosynthesis, the process by which plants convert carbon dioxide and water into glucose and oxygen."),
            zh = LocalizedContent("叶绿素是哪个过程的主要色素？", listOf("光合作用", "呼吸作用", "繁殖", "生长"), "自然", "叶绿素捕获光合作用所需的光能，光合作用是植物将二氧化碳和水转化为葡萄糖和氧气的过程。"),
            es = LocalizedContent("¿La clorofila es el pigmento principal de?", listOf("Fotosíntesis", "Respiración", "Reproducción", "Crecimiento"), "Naturaleza", "La clorofila capta la energía lumínica necesaria para la fotosíntesis, proceso mediante el cual las plantas convierten dióxido de carbono y agua en glucosa y oxígeno.")
        ),
        BilingualQuestion(
            id = 13329, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les algues rouges doivent leur couleur à la phyco...?", listOf("Mycine", "Érythrine", "Billine", "Anthocyane"), "Nature", "La phycoérythrine, un pigment rouge, est responsable de la couleur des algues rouges, leur permettant de capter la lumière bleue en profondeur."),
            en = LocalizedContent("Red algae owe their color to phyco...?", listOf("Mycin", "Erythrin", "Billin", "Anthocyanin"), "Nature", "Phycoerythrin, a red pigment, is responsible for the color of red algae, allowing them to capture blue light in deep waters."),
            zh = LocalizedContent("红藻的颜色归因于藻红...？", listOf("霉素", "红素", "胆素", "花青素"), "自然", "藻红蛋白是一种红色色素，使红藻呈现红色，并帮助它们在深水中捕捉蓝光。"),
            es = LocalizedContent("¿Las algas rojas deben su color a la fico...?", listOf("Micina", "Eritrina", "Bilina", "Antocianina"), "Naturaleza", "La ficoeritrina, un pigmento rojo, es responsable del color de las algas rojas, permitiéndoles captar la luz azul en aguas profundas.")
        ),
        BilingualQuestion(
            id = 13330, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le parasite Plasmodium cause la?", listOf("Dengue", "Malaria", "Fièvre jaune", "Zika"), "Nature", "Plasmodium est un parasite transmis par la piqûre de moustiques Anophèles, qui provoque la malaria (ou paludisme), une maladie infectieuse grave."),
            en = LocalizedContent("The parasite Plasmodium causes?", listOf("Dengue", "Malaria", "Yellow fever", "Zika"), "Nature", "Plasmodium is a parasite transmitted by the bite of Anopheles mosquitoes, causing malaria, a serious infectious disease."),
            zh = LocalizedContent("寄生虫疟原虫引起？", listOf("登革热", "疟疾", "黄热病", "寨卡"), "自然", "疟原虫是通过按蚊叮咬传播的寄生虫，引起疟疾，一种严重的传染病。"),
            es = LocalizedContent("¿El parásito Plasmodium causa?", listOf("Dengue", "Malaria", "Fiebre amarilla", "Zika"), "Naturaleza", "Plasmodium es un parásito transmitido por la picadura de mosquitos Anopheles, que causa la malaria, una enfermedad infecciosa grave.")
        ),
        BilingualQuestion(
            id = 13331, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La trypanosome est un parasite causant la??", listOf("Malaria", "Maladie du sommeil", "Trypanosomose", "Maladie de Chagas"), "Nature", "Transmise par la mouche tsé-tsé, la trypanosome provoque la maladie du sommeil, une infection parasitaire touchant principalement l'Afrique subsaharienne."),
            en = LocalizedContent("Trypanosome is a parasite causing?", listOf("Malaria", "Sleeping sickness", "Trypanosomiasis", "Chagas disease"), "Nature", "Transmitted by the tsetse fly, trypanosome causes sleeping sickness, a parasitic infection mainly affecting sub-Saharan Africa."),
            zh = LocalizedContent("锥虫是一种寄生虫，引起？", listOf("疟疾", "昏睡病", "锥虫病", "恰加斯病"), "自然", "锥虫通过采采蝇传播，引起昏睡病，一种主要影响撒哈拉以南非洲的寄生虫感染。"),
            es = LocalizedContent("¿El tripanosoma es un parásito que causa?", listOf("Malaria", "Enfermedad del sueño", "Tripanosomiasis", "Enfermedad de Chagas"), "Naturaleza", "Transmitido por la mosca tsetsé, el tripanosoma causa la enfermedad del sueño, una infección parasitaria que afecta principalmente al África subsahariana.")
        ),
        BilingualQuestion(
            id = 13332, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les nématodes parasitaires comprennent?", listOf("Ascaris", "Ankylostome", "Filaria", "Tous les précédents"), "Nature", "Les nématodes parasitaires incluent des espèces affectant les plantes, les animaux et les humains, comme les ascaris ou les ankylostomes, ce qui justifie la réponse \"Tous les précédents\"."),
            en = LocalizedContent("Parasitic nematodes include?", listOf("Ascaris", "Hookworm", "Filaria", "All of the above"), "Nature", "Parasitic nematodes include species affecting plants, animals, and humans, such as ascaris or hookworms, justifying the answer 'All of the above'."),
            zh = LocalizedContent("寄生线虫包括？", listOf("蛔虫", "钩虫", "丝虫", "以上所有"), "自然", "寄生线虫包括影响植物、动物和人类的物种，如蛔虫或钩虫，因此答案为“以上所有”。"),
            es = LocalizedContent("¿Los nematodos parásitos incluyen?", listOf("Ascaris", "Anquilostoma", "Filarias", "Todos los anteriores"), "Naturaleza", "Los nematodos parásitos incluyen especies que afectan plantas, animales y humanos, como áscaris o anquilostomas, lo que justifica la respuesta 'Todos los anteriores'.")
        ),
        BilingualQuestion(
            id = 13333, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La photosynthèse utilise l'énergie de??", listOf("Chaleur", "Lumière", "Chimie", "Électricité"), "Nature", "La photosynthèse est le processus par lequel les plantes transforment l'énergie lumineuse en énergie chimique, principalement grâce à la chlorophylle."),
            en = LocalizedContent("Photosynthesis uses energy from?", listOf("Heat", "Light", "Chemistry", "Electricity"), "Nature", "Photosynthesis is the process by which plants convert light energy into chemical energy, mainly through chlorophyll."),
            zh = LocalizedContent("光合作用利用来自？的能量", listOf("热", "光", "化学", "电"), "自然", "光合作用是植物将光能转化为化学能的过程，主要依靠叶绿素。"),
            es = LocalizedContent("¿La fotosíntesis utiliza energía de?", listOf("Calor", "Luz", "Química", "Electricidad"), "Naturaleza", "La fotosíntesis es el proceso mediante el cual las plantas convierten la energía lumínica en energía química, principalmente gracias a la clorofila.")
        ),
        BilingualQuestion(
            id = 13334, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La chimiolithotrophie est une stratégie de??", listOf("Photosynthèse", "Métabolisme chimique", "Fermentation", "Respiration"), "Nature", "La chimiolithotrophie désigne un type de métabolisme où des organismes tirent leur énergie de l'oxydation de composés chimiques inorganiques, comme le soufre ou le fer, plutôt que de la lumière."),
            en = LocalizedContent("Chemolithotrophy is a strategy of?", listOf("Photosynthesis", "Chemical metabolism", "Fermentation", "Respiration"), "Nature", "Chemolithotrophy refers to a type of metabolism where organisms derive energy from the oxidation of inorganic chemical compounds, such as sulfur or iron, rather than from light."),
            zh = LocalizedContent("化能无机营养是一种？策略", listOf("光合作用", "化学代谢", "发酵", "呼吸"), "自然", "化能无机营养是指生物通过氧化无机化合物（如硫或铁）获取能量的代谢方式，而非依赖光能。"),
            es = LocalizedContent("¿La quimiolitotrofía es una estrategia de?", listOf("Fotosíntesis", "Metabolismo químico", "Fermentación", "Respiración"), "Naturaleza", "La quimiolitotrofía se refiere a un tipo de metabolismo en el que los organismos obtienen energía de la oxidación de compuestos químicos inorgánicos, como azufre o hierro, en lugar de la luz.")
        ),
        BilingualQuestion(
            id = 13335, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les ectomycorrhizes enveloppent les racines de??", listOf("Couche blanche", "Filet blanc", "Réseau dense", "Sheath"), "Nature", "Les ectomycorhizes forment un manteau fongique autour des racines, souvent de couleur blanche, qui facilite les échanges nutritifs entre le champignon et la plante."),
            en = LocalizedContent("Ectomycorrhizae envelop roots with?", listOf("White layer", "White net", "Dense network", "Sheath"), "Nature", "Ectomycorrhizae form a fungal mantle around roots, often white in color, which facilitates nutrient exchange between the fungus and the plant."),
            zh = LocalizedContent("外生菌根用？包裹根部", listOf("白色层", "白色网", "密集网络", "鞘"), "自然", "外生菌根在根部周围形成真菌套，通常为白色，促进真菌与植物之间的营养交换。"),
            es = LocalizedContent("¿Las ectomicorrizas envuelven las raíces con?", listOf("Capa blanca", "Red blanca", "Red densa", "Vaina"), "Naturaleza", "Las ectomicorrizas forman un manto fúngico alrededor de las raíces, a menudo de color blanco, que facilita el intercambio de nutrientes entre el hongo y la planta.")
        ),
        BilingualQuestion(
            id = 13336, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les endomycorrhizes pénètrent les cellules racinaires. Vrai ou Faux?", listOf("Vrai", "Faux", "Rarement", "Toujours"), "Nature", "Les endomycorhizes, contrairement aux ectomycorhizes, forment des structures intracellulaires comme des arbuscules à l'intérieur des cellules racinaires, ce qui facilite les échanges nutritifs."),
            en = LocalizedContent("Endomycorrhizae penetrate root cells. True or False?", listOf("True", "False", "Rarely", "Always"), "Nature", "Endomycorrhizae, unlike ectomycorrhizae, form intracellular structures such as arbuscules inside root cells, facilitating nutrient exchange."),
            zh = LocalizedContent("内生菌根穿透根细胞。对还是错？", listOf("对", "错", "很少", "总是"), "自然", "与外生菌根不同，内生菌根在根细胞内形成丛枝等细胞内结构，促进营养交换。"),
            es = LocalizedContent("¿Las endomicorrizas penetran las células de las raíces? ¿Verdadero o Falso?", listOf("Verdadero", "Falso", "Raramente", "Siempre"), "Naturaleza", "Las endomicorrizas, a diferencia de las ectomicorrizas, forman estructuras intracelulares como arbúsculos dentro de las células de las raíces, facilitando el intercambio de nutrientes.")
        ),
        BilingualQuestion(
            id = 13337, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le thalus lichénique est composé de?", listOf("Cordes fongiques", "Filaments d'algue", "Hyphe et algue", "Spores et hyphes"), "Nature", "Le lichen est un organisme symbiotique formé par l'association d'un champignon (hyphes) et d'une algue, constituant ainsi le thalle lichénique."),
            en = LocalizedContent("The lichen thallus is composed of?", listOf("Fungal cords", "Algal filaments", "Hyphae and alga", "Spores and hyphae"), "Nature", "Lichen is a symbiotic organism formed by the association of a fungus (hyphae) and an alga, constituting the lichen thallus."),
            zh = LocalizedContent("地衣叶状体由？组成", listOf("真菌索", "藻类丝状体", "菌丝和藻类", "孢子和菌丝"), "自然", "地衣是由真菌（菌丝）和藻类共生形成的有机体，构成地衣叶状体。"),
            es = LocalizedContent("¿El talo liquénico está compuesto por?", listOf("Cuerdas fúngicas", "Filamentos de alga", "Hifas y alga", "Esporas e hifas"), "Naturaleza", "El liquen es un organismo simbiótico formado por la asociación de un hongo (hifas) y un alga, constituyendo el talo liquénico.")
        ),
        BilingualQuestion(
            id = 13338, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Les lichens sont indicateurs de??", listOf("Pollens", "Pollution", "Âge du sol", "Humidity"), "Nature", "Les lichens sont très sensibles à la qualité de l'air, notamment aux composés soufrés et azotés, ce qui en fait des bio-indicateurs fiables de la pollution atmosphérique."),
            en = LocalizedContent("Lichens are indicators of?", listOf("Pollen", "Pollution", "Soil age", "Humidity"), "Nature", "Lichens are very sensitive to air quality, especially sulfur and nitrogen compounds, making them reliable bioindicators of atmospheric pollution."),
            zh = LocalizedContent("地衣是？的指示物", listOf("花粉", "污染", "土壤年龄", "湿度"), "自然", "地衣对空气质量非常敏感，尤其是硫和氮化合物，因此它们是大气污染的可靠生物指示物。"),
            es = LocalizedContent("¿Los líquenes son indicadores de?", listOf("Polen", "Contaminación", "Edad del suelo", "Humedad"), "Naturaleza", "Los líquenes son muy sensibles a la calidad del aire, especialmente a los compuestos de azufre y nitrógeno, lo que los convierte en bioindicadores fiables de la contaminación atmosférica.")
        ),
        BilingualQuestion(
            id = 13339, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le biome de savane se caractérise par?", listOf("Graminées et arbres épars", "Arbres denses", "Absence de végétation", "Herbivores carnivores"), "Nature", "La savane est un biome tropical où les précipitations sont trop faibles pour soutenir une forêt dense, mais suffisantes pour empêcher un désert, favorisant ainsi les graminées et quelques arbres dispersés."),
            en = LocalizedContent("The savanna biome is characterized by?", listOf("Grasses and scattered trees", "Dense trees", "Lack of vegetation", "Carnivorous herbivores"), "Nature", "The savanna is a tropical biome where rainfall is too low to support a dense forest but sufficient to prevent a desert, thus favoring grasses and a few scattered trees."),
            zh = LocalizedContent("热带稀树草原生物群落的特点是？", listOf("草和稀疏的树木", "茂密的树木", "缺乏植被", "食草食肉动物"), "自然", "热带稀树草原是一种热带生物群落，降雨量太低无法支持茂密的森林，但足以防止沙漠化，因此有利于草和少量分散的树木生长。"),
            es = LocalizedContent("¿El bioma de sabana se caracteriza por?", listOf("Hierbas y árboles dispersos", "Árboles densos", "Ausencia de vegetación", "Herbívoros carnívoros"), "Naturaleza", "La sabana es un bioma tropical donde las precipitaciones son demasiado bajas para sostener un bosque denso, pero suficientes para evitar un desierto, favoreciendo así hierbas y algunos árboles dispersos.")
        ),
        BilingualQuestion(
            id = 13340, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La forêt tropicale humide couvre approximativement combien de l'Terre?", listOf("5%", "10%", "15%", "20%"), "Nature", "Les forêts tropicales humides ne couvrent qu'environ 10% de la surface terrestre, mais elles abritent plus de la moitié des espèces animales et végétales de la planète."),
            en = LocalizedContent("Tropical rainforest covers approximately how much of the Earth?", listOf("5%", "10%", "15%", "20%"), "Nature", "Tropical rainforests cover only about 10% of the Earth's land surface, yet they harbor more than half of the planet's animal and plant species."),
            zh = LocalizedContent("热带雨林大约覆盖地球的多少？", listOf("5%", "10%", "15%", "20%"), "自然", "热带雨林仅覆盖地球陆地表面的约10%，但却拥有地球上超过一半的动植物物种。"),
            es = LocalizedContent("¿La selva tropical cubre aproximadamente cuánto de la Tierra?", listOf("5%", "10%", "15%", "20%"), "Naturaleza", "Las selvas tropicales cubren solo alrededor del 10% de la superficie terrestre, pero albergan más de la mitad de las especies animales y vegetales del planeta.")
        ),
        BilingualQuestion(
            id = 13341, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Les biomes aquatiques freshwater incluent?", listOf("Lacs", "Rivières", "Marais", "Tous les précédents"), "Nature", "Les biomes d'eau douce regroupent les lacs, rivières, étangs et zones humides, car ils partagent une faible salinité et des écosystèmes interconnectés."),
            en = LocalizedContent("Freshwater aquatic biomes include?", listOf("Lakes", "Rivers", "Marshes", "All of the above"), "Nature", "Freshwater biomes include lakes, rivers, ponds, and wetlands, as they share low salinity and interconnected ecosystems."),
            zh = LocalizedContent("淡水水生生物群落包括？", listOf("湖泊", "河流", "沼泽", "以上所有"), "自然", "淡水生物群落包括湖泊、河流、池塘和湿地，因为它们具有低盐度和相互关联的生态系统。"),
            es = LocalizedContent("¿Los biomas acuáticos de agua dulce incluyen?", listOf("Lagos", "Ríos", "Pantanos", "Todos los anteriores"), "Naturaleza", "Los biomas de agua dulce incluyen lagos, ríos, estanques y humedales, ya que comparten baja salinidad y ecosistemas interconectados.")
        ),
        BilingualQuestion(
            id = 13342, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'estuaire est une zone de mélange entre l'eau?", listOf("Douce et salée", "Chaude et froide", "Stagnante et courante", "Superficielle et profonde"), "Nature", "L'estuaire est la zone de transition où un fleuve d'eau douce rencontre l'eau salée de la mer, créant un mélange appelé eau saumâtre."),
            en = LocalizedContent("An estuary is a mixing zone between?", listOf("Fresh and salt water", "Warm and cold water", "Stagnant and flowing water", "Surface and deep water"), "Nature", "An estuary is the transition zone where a freshwater river meets the saltwater of the sea, creating a mixture called brackish water."),
            zh = LocalizedContent("河口是哪种水的混合区域？", listOf("淡水和咸水", "热水和冷水", "死水和活水", "表层水和深层水"), "自然", "河口是淡水河流与海水相遇的过渡区域，形成称为半咸水的混合物。"),
            es = LocalizedContent("¿El estuario es una zona de mezcla entre agua?", listOf("Dulce y salada", "Caliente y fría", "Estancada y corriente", "Superficial y profunda"), "Naturaleza", "El estuario es la zona de transición donde un río de agua dulce se encuentra con el agua salada del mar, creando una mezcla llamada agua salobre.")
        ),
        BilingualQuestion(
            id = 13343, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les bioluminescentes bactéries produisent de la lumière par??", listOf("Photosynthèse", "Chimioluminescence", "Fluorescence", "Réflexion"), "Nature", "La lumière produite par les bactéries bioluminescentes résulte d'une réaction chimique impliquant une enzyme appelée luciférase, qui oxyde un substrat (la luciférine) en émettant de l'énergie lumineuse. Ce processus est un exemple de chimioluminescence, où l'énergie chimique est convertie directement en lumière sans chaleur."),
            en = LocalizedContent("Bioluminescent bacteria produce light through?", listOf("Photosynthesis", "Chemiluminescence", "Fluorescence", "Reflection"), "Nature", "The light produced by bioluminescent bacteria results from a chemical reaction involving an enzyme called luciferase, which oxidizes a substrate (luciferin) emitting light energy. This process is an example of chemiluminescence, where chemical energy is directly converted into light without heat."),
            zh = LocalizedContent("生物发光细菌通过什么产生光？", listOf("光合作用", "化学发光", "荧光", "反射"), "自然", "生物发光细菌产生的光来自一种化学反应，涉及一种称为荧光素酶的酶，它氧化底物（荧光素）并发出光能。这个过程是化学发光的一个例子，化学能直接转化为光而不产生热量。"),
            es = LocalizedContent("¿Las bacterias bioluminiscentes producen luz mediante?", listOf("Fotosíntesis", "Quimioluminiscencia", "Fluorescencia", "Reflexión"), "Naturaleza", "La luz producida por las bacterias bioluminiscentes resulta de una reacción química que involucra una enzima llamada luciferasa, que oxida un sustrato (luciferina) emitiendo energía luminosa. Este proceso es un ejemplo de quimioluminiscencia, donde la energía química se convierte directamente en luz sin calor.")
        ),
        BilingualQuestion(
            id = 13344, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les mouches du vinaigre hébergent des bactéries dans leur??", listOf("Estomac", "Intestin", "Symbiontes", "Tous les organes"), "Nature", "Les mouches du vinaigre entretiennent une relation symbiotique avec des bactéries, notamment Wolbachia, qui vivent dans leurs cellules et influencent leur reproduction."),
            en = LocalizedContent("Fruit flies harbor bacteria in their?", listOf("Stomach", "Intestine", "Symbionts", "All organs"), "Nature", "Fruit flies maintain a symbiotic relationship with bacteria, notably Wolbachia, which live inside their cells and influence their reproduction."),
            zh = LocalizedContent("果蝇在其什么中携带细菌？", listOf("胃", "肠道", "共生体", "所有器官"), "自然", "果蝇与细菌（特别是沃尔巴克氏体）保持共生关系，这些细菌生活在它们的细胞内并影响其繁殖。"),
            es = LocalizedContent("¿Las moscas de la fruta albergan bacterias en su?", listOf("Estómago", "Intestino", "Simbiontes", "Todos los órganos"), "Naturaleza", "Las moscas de la fruta mantienen una relación simbiótica con bacterias, especialmente Wolbachia, que viven dentro de sus células e influyen en su reproducción.")
        ),
        BilingualQuestion(
            id = 13345, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La relation anemone-clownfish est un exemple de??", listOf("Prédation", "Mutualisme", "Parasitisme", "Commensalisme"), "Nature", "Le poisson-clown trouve refuge dans les tentacules de l'anémone, qui le protège des prédateurs, tandis que le poisson nettoie l'anémone et l'aère en nageant. Cette interaction bénéfique aux deux espèces est un cas classique de mutualisme."),
            en = LocalizedContent("The anemone-clownfish relationship is an example of?", listOf("Predation", "Mutualism", "Parasitism", "Commensalism"), "Nature", "The clownfish finds refuge in the anemone's tentacles, which protect it from predators, while the fish cleans the anemone and aerates it by swimming. This mutually beneficial interaction is a classic case of mutualism."),
            zh = LocalizedContent("海葵-小丑鱼的关系是哪种关系的例子？", listOf("捕食", "互利共生", "寄生", "偏利共生"), "自然", "小丑鱼在海葵的触手中找到庇护所，海葵保护它免受捕食者侵害，而小丑鱼则清洁海葵并通过游动为其增氧。这种对双方都有益的互动是互利共生的经典案例。"),
            es = LocalizedContent("¿La relación anémona-pez payaso es un ejemplo de?", listOf("Depredación", "Mutualismo", "Parasitismo", "Comensalismo"), "Naturaleza", "El pez payaso encuentra refugio en los tentáculos de la anémona, que lo protege de los depredadores, mientras que el pez limpia la anémona y la airea al nadar. Esta interacción beneficiosa para ambas especies es un caso clásico de mutualismo.")
        ),
        BilingualQuestion(
            id = 13346, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les arthropodes hébergent combien de bactéries?", listOf("Centaines", "Milliers", "Millions", "Milliards"), "Nature", "Les arthropodes, comme les insectes, abritent des milliards de bactéries symbiotiques dans leur microbiote intestinal, essentiel à leur digestion et défense immunitaire."),
            en = LocalizedContent("Arthropods harbor how many bacteria?", listOf("Hundreds", "Thousands", "Millions", "Billions"), "Nature", "Arthropods, such as insects, harbor billions of symbiotic bacteria in their gut microbiota, essential for digestion and immune defense."),
            zh = LocalizedContent("节肢动物携带多少细菌？", listOf("数百", "数千", "数百万", "数十亿"), "自然", "节肢动物（如昆虫）在其肠道微生物群中携带数十亿共生细菌，这些细菌对消化和免疫防御至关重要。"),
            es = LocalizedContent("¿Los artrópodos albergan cuántas bacterias?", listOf("Cientos", "Miles", "Millones", "Miles de millones"), "Naturaleza", "Los artrópodos, como los insectos, albergan miles de millones de bacterias simbióticas en su microbiota intestinal, esenciales para la digestión y la defensa inmunitaria.")
        ),
        BilingualQuestion(
            id = 13347, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les biofilms bactériens présentent une résistance accrue aux??", listOf("Antibiotiques", "Antiseptiques", "Système immunitaire", "Tous les précédents"), "Nature", "Les biofilms bactériens sont des communautés structurées de bactéries enrobées dans une matrice protectrice, ce qui les rend résistants aux antibiotiques, aux désinfectants et au système immunitaire."),
            en = LocalizedContent("Bacterial biofilms show increased resistance to?", listOf("Antibiotics", "Antiseptics", "Immune system", "All of the above"), "Nature", "Bacterial biofilms are structured communities of bacteria encased in a protective matrix, making them resistant to antibiotics, disinfectants, and the immune system."),
            zh = LocalizedContent("细菌生物膜对什么表现出增强的抵抗力？", listOf("抗生素", "消毒剂", "免疫系统", "以上所有"), "自然", "细菌生物膜是被保护性基质包裹的细菌结构化群落，使它们对抗生素、消毒剂和免疫系统具有抵抗力。"),
            es = LocalizedContent("¿Las biopelículas bacterianas presentan una resistencia aumentada a?", listOf("Antibióticos", "Antisépticos", "Sistema inmunitario", "Todos los anteriores"), "Naturaleza", "Las biopelículas bacterianas son comunidades estructuradas de bacterias envueltas en una matriz protectora, lo que las hace resistentes a antibióticos, desinfectantes y al sistema inmunitario.")
        ),
        BilingualQuestion(
            id = 13348, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les champignons endomycètes produisent les spores dans??", listOf("Sporanges", "Basides", "Asques", "Zoosporanges"), "Nature", "Les champignons endomycètes, aussi appelés ascomycètes, produisent leurs spores sexuées dans des cellules spécialisées en forme de sac appelées asques."),
            en = LocalizedContent("Endomycete fungi produce spores in?", listOf("Sporangia", "Basidia", "Asci", "Zoosporangia"), "Nature", "Endomycete fungi, also called ascomycetes, produce their sexual spores in specialized sac-like cells called asci."),
            zh = LocalizedContent("内囊霉目真菌在什么中产生孢子？", listOf("孢子囊", "担子", "子囊", "游动孢子囊"), "自然", "内囊霉目真菌，也称为子囊菌，在称为子囊的专门囊状细胞中产生有性孢子。"),
            es = LocalizedContent("¿Los hongos endomicetos producen esporas en?", listOf("Esporangios", "Basidios", "Ascos", "Zoosporangios"), "Naturaleza", "Los hongos endomicetos, también llamados ascomicetos, producen sus esporas sexuales en células especializadas en forma de saco llamadas ascas.")
        ),
        BilingualQuestion(
            id = 13349, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le transfert horizontal de gènes entre espèces bactériennes est un?", listOf("Mythe", "Phénomène rare", "Phénomène courant", "Processus limité"), "Nature", "Les bactéries échangent fréquemment du matériel génétique via la conjugaison, la transformation ou la transduction, ce qui rend ce transfert horizontal courant dans leur adaptation rapide à l'environnement."),
            en = LocalizedContent("Horizontal gene transfer between bacterial species is a?", listOf("Myth", "Rare phenomenon", "Common phenomenon", "Limited process"), "Nature", "Bacteria frequently exchange genetic material via conjugation, transformation, or transduction, making horizontal transfer common in their rapid adaptation to the environment."),
            zh = LocalizedContent("细菌物种间的水平基因转移是一种？", listOf("神话", "罕见现象", "常见现象", "有限过程"), "自然", "细菌通过接合、转化或转导频繁交换遗传物质，这使得水平转移在其快速适应环境的过程中很常见。"),
            es = LocalizedContent("La transferencia horizontal de genes entre especies bacterianas es un?", listOf("Mito", "Fenómeno raro", "Fenómeno común", "Proceso limitado"), "Naturaleza", "Las bacterias intercambian material genético con frecuencia mediante conjugación, transformación o transducción, lo que hace que la transferencia horizontal sea común en su rápida adaptación al medio ambiente.")
        ),
        BilingualQuestion(
            id = 13350, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("L'opéra est un art dramatique combinant musique et??", listOf("Danse", "Théâtre", "Chant", "Tous les précédents"), "Culture", "L'opéra combine musique, chant, mise en scène, décors et parfois danse, ce qui en fait un art total intégrant tous ces éléments."),
            en = LocalizedContent("Opera is a dramatic art combining music and??", listOf("Dance", "Theater", "Singing", "All of the above"), "Culture", "Opera combines music, singing, staging, sets, and sometimes dance, making it a total art form integrating all these elements."),
            zh = LocalizedContent("歌剧是一种结合音乐和？？的戏剧艺术。", listOf("舞蹈", "戏剧", "歌唱", "以上所有"), "文化", "歌剧结合了音乐、歌唱、舞台、布景，有时还有舞蹈，使其成为一种融合所有这些元素的综合艺术形式。"),
            es = LocalizedContent("La ópera es un arte dramático que combina música y??", listOf("Danza", "Teatro", "Canto", "Todos los anteriores"), "Cultura", "La ópera combina música, canto, puesta en escena, decorados y a veces danza, lo que la convierte en un arte total que integra todos estos elementos.")
        ),
        BilingualQuestion(
            id = 13351, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a produit les plus grands opéras du 18e siècle?", listOf("France", "Italie", "Allemagne", "Angleterre"), "Culture", "L'opéra est né en Italie au XVIIe siècle, et au XVIIIe siècle, des compositeurs italiens comme Haendel, Vivaldi et Mozart (pour ses opéras italiens) ont dominé ce genre musical."),
            en = LocalizedContent("Which country produced the greatest operas of the 18th century?", listOf("France", "Italy", "Germany", "England"), "Culture", "Opera was born in Italy in the 17th century, and in the 18th century, Italian composers like Handel, Vivaldi, and Mozart (for his Italian operas) dominated the genre."),
            zh = LocalizedContent("哪个国家产生了18世纪最伟大的歌剧？", listOf("法国", "意大利", "德国", "英格兰"), "文化", "歌剧诞生于17世纪的意大利，在18世纪，意大利作曲家如亨德尔、维瓦尔第和莫扎特（以其意大利歌剧）主导了这一流派。"),
            es = LocalizedContent("¿Qué país produjo las mejores óperas del siglo XVIII?", listOf("Francia", "Italia", "Alemania", "Inglaterra"), "Cultura", "La ópera nació en Italia en el siglo XVII, y en el siglo XVIII, compositores italianos como Haendel, Vivaldi y Mozart (por sus óperas italianas) dominaron este género.")
        ),
        BilingualQuestion(
            id = 13352, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le ballet est un art du mouvement corporel. Depuis quand?", listOf("15e siècle", "16e siècle", "17e siècle", "18e siècle"), "Culture", "Le ballet codifié apparaît à la cour d'Italie puis de France au 16e siècle, notamment avec le \"Ballet comique de la reine\" en 1581."),
            en = LocalizedContent("Ballet is an art of body movement. Since when?", listOf("15th century", "16th century", "17th century", "18th century"), "Culture", "Codified ballet appeared in the courts of Italy and then France in the 16th century, notably with the 'Ballet comique de la reine' in 1581."),
            zh = LocalizedContent("芭蕾是一种身体运动的艺术。从什么时候开始？", listOf("15世纪", "16世纪", "17世纪", "18世纪"), "文化", "规范化的芭蕾出现在16世纪的意大利和法国宫廷，特别是1581年的《王后喜剧芭蕾》。"),
            es = LocalizedContent("El ballet es un arte del movimiento corporal. ¿Desde cuándo?", listOf("Siglo XV", "Siglo XVI", "Siglo XVII", "Siglo XVIII"), "Cultura", "El ballet codificado apareció en las cortes de Italia y luego de Francia en el siglo XVI, notablemente con el 'Ballet cómico de la reina' en 1581.")
        ),
        BilingualQuestion(
            id = 13353, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel ballet de Tchaïkovski est le plus célèbre?", listOf("Roméo et Juliet", "Le Lac des cygnes", "Casse-Noisette", "La Belle au bois dormant"), "Culture", "Le Lac des cygnes est le ballet le plus célèbre de Tchaïkovski, créé en 1877, et reste une œuvre emblématique du répertoire classique grâce à sa musique et son histoire tragique."),
            en = LocalizedContent("Which Tchaikovsky ballet is the most famous?", listOf("Romeo and Juliet", "Swan Lake", "The Nutcracker", "The Sleeping Beauty"), "Culture", "Swan Lake is Tchaikovsky's most famous ballet, created in 1877, and remains an emblematic work of the classical repertoire thanks to its music and tragic story."),
            zh = LocalizedContent("柴可夫斯基的哪部芭蕾舞剧最著名？", listOf("罗密欧与朱丽叶", "天鹅湖", "胡桃夹子", "睡美人"), "文化", "《天鹅湖》是柴可夫斯基最著名的芭蕾舞剧，创作于1877年，因其音乐和悲剧故事而成为古典剧目中的标志性作品。"),
            es = LocalizedContent("¿Qué ballet de Tchaikovsky es el más famoso?", listOf("Romeo y Julieta", "El lago de los cisnes", "El cascanueces", "La bella durmiente"), "Cultura", "El lago de los cisnes es el ballet más famoso de Tchaikovsky, creado en 1877, y sigue siendo una obra emblemática del repertorio clásico gracias a su música y su historia trágica.")
        ),
        BilingualQuestion(
            id = 13354, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le théâtre grec antique utilisait des?", listOf("Masques", "Maquillage", "Perruques", "Costumes amples"), "Culture", "Les acteurs du théâtre grec antique portaient des masques pour incarner différents personnages et amplifier leur voix dans les grands amphithéâtres."),
            en = LocalizedContent("Ancient Greek theater used?", listOf("Masks", "Makeup", "Wigs", "Loose costumes"), "Culture", "Actors in ancient Greek theater wore masks to portray different characters and amplify their voices in large amphitheaters."),
            zh = LocalizedContent("古希腊戏剧使用？", listOf("面具", "化妆", "假发", "宽松服装"), "文化", "古希腊戏剧的演员佩戴面具来扮演不同角色，并在大型露天剧场中放大声音。"),
            es = LocalizedContent("El teatro griego antiguo utilizaba?", listOf("Máscaras", "Maquillaje", "Pelucas", "Vestimentas holgadas"), "Cultura", "Los actores del teatro griego antiguo usaban máscaras para interpretar diferentes personajes y amplificar su voz en los grandes anfiteatros.")
        ),
        BilingualQuestion(
            id = 13355, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Comédie italienne (Commedia dell'arte) utilisait des personnages??", listOf("Historiques", "Archétypaux stéréotypés", "Royaux", "Mythologiques"), "Culture", "La Commedia dell'arte reposait sur des personnages fixes et reconnaissables comme Arlequin, Pantalone ou Colombine, chacun avec un costume, un masque et des traits de caractère immuables."),
            en = LocalizedContent("Italian Comedy (Commedia dell'arte) used characters??", listOf("Historical", "Archetypal stereotyped", "Royal", "Mythological"), "Culture", "Commedia dell'arte relied on fixed, recognizable characters like Harlequin, Pantalone, or Colombina, each with a costume, mask, and unchanging character traits."),
            zh = LocalizedContent("意大利喜剧（即兴喜剧）使用的人物是？？", listOf("历史人物", "原型刻板人物", "皇室人物", "神话人物"), "文化", "即兴喜剧依赖于固定且可识别的人物，如哈勒昆、潘塔隆内或科隆比娜，每个角色都有特定的服装、面具和不变的性格特征。"),
            es = LocalizedContent("La Comedia italiana (Commedia dell'arte) utilizaba personajes??", listOf("Históricos", "Arquetípicos estereotipados", "Reales", "Mitológicos"), "Cultura", "La Commedia dell'arte se basaba en personajes fijos y reconocibles como Arlequín, Pantalone o Colombina, cada uno con un vestuario, máscara y rasgos de carácter inmutables.")
        ),
        BilingualQuestion(
            id = 13356, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Shakespeare a écrit ses pièces en quelle langue?", listOf("Latin", "Français", "Anglais élisabéthain", "Grec"), "Culture", "Shakespeare écrivait à l'époque élisabéthaine, où l'anglais différait de l'anglais moderne dans son vocabulaire et sa grammaire."),
            en = LocalizedContent("Shakespeare wrote his plays in which language?", listOf("Latin", "French", "Elizabethan English", "Greek"), "Culture", "Shakespeare wrote in the Elizabethan era, where English differed from modern English in vocabulary and grammar."),
            zh = LocalizedContent("莎士比亚用什么语言写他的戏剧？", listOf("拉丁语", "法语", "伊丽莎白时代英语", "希腊语"), "文化", "莎士比亚在伊丽莎白时代写作，当时的英语在词汇和语法上与现代英语不同。"),
            es = LocalizedContent("¿Shakespeare escribió sus obras en qué idioma?", listOf("Latín", "Francés", "Inglés isabelino", "Griego"), "Cultura", "Shakespeare escribió en la época isabelina, donde el inglés difería del inglés moderno en vocabulario y gramática.")
        ),
        BilingualQuestion(
            id = 13357, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La sculpture grecque antique a atteint son sommet à la période??", listOf("Archaïque", "Classique", "Hellénistique", "Romaine"), "Culture", "La période classique (Ve-IVe siècles av. J.-C.) est considérée comme l'apogée de la sculpture grecque, marquée par la recherche d'harmonie, de proportion et de naturalisme, avec des artistes comme Phidias ou Polyclète."),
            en = LocalizedContent("Ancient Greek sculpture reached its peak in the?? period", listOf("Archaic", "Classical", "Hellenistic", "Roman"), "Culture", "The Classical period (5th-4th centuries BC) is considered the peak of Greek sculpture, marked by the pursuit of harmony, proportion, and naturalism, with artists like Phidias and Polyclitus."),
            zh = LocalizedContent("古希腊雕塑在？？时期达到顶峰。", listOf("古风时期", "古典时期", "希腊化时期", "罗马时期"), "文化", "古典时期（公元前5-4世纪）被认为是希腊雕塑的巅峰，以追求和谐、比例和自然主义为标志，代表艺术家有菲迪亚斯和波利克里托斯。"),
            es = LocalizedContent("La escultura griega antigua alcanzó su apogeo en el período??", listOf("Arcaico", "Clásico", "Helenístico", "Romano"), "Cultura", "El período clásico (siglos V-IV a.C.) se considera el apogeo de la escultura griega, marcado por la búsqueda de armonía, proporción y naturalismo, con artistas como Fidias o Policleto.")
        ),
        BilingualQuestion(
            id = 13358, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le David de Michel-Ange est une sculpture de la Renaissance??", listOf("Italienne", "Française", "Flamande", "Espagnole"), "Culture", "Michel-Ange, artiste majeur de la Renaissance, a sculpté le David à Florence, en Italie, entre 1501 et 1504."),
            en = LocalizedContent("Michelangelo's David is a Renaissance sculpture??", listOf("Italian", "French", "Flemish", "Spanish"), "Culture", "Michelangelo, a major Renaissance artist, sculpted David in Florence, Italy, between 1501 and 1504."),
            zh = LocalizedContent("米开朗基罗的大卫是？？文艺复兴时期的雕塑。", listOf("意大利", "法国", "佛兰德", "西班牙"), "文化", "米开朗基罗是文艺复兴时期的重要艺术家，于1501年至1504年在意大利佛罗伦萨雕刻了大卫像。"),
            es = LocalizedContent("El David de Miguel Ángel es una escultura del Renacimiento??", listOf("Italiano", "Francés", "Flamenco", "Español"), "Cultura", "Miguel Ángel, artista destacado del Renacimiento, esculpió el David en Florencia, Italia, entre 1501 y 1504.")
        ),
        BilingualQuestion(
            id = 13359, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La céramique grecque antique inclut le style??", listOf("À figures rouges", "À figures noires", "Polychrome", "A et B"), "Culture", "La céramique grecque antique se divise principalement entre le style à figures noires (figures sombres sur fond clair) et le style à figures rouges (figures claires sur fond sombre), tous deux majeurs dans l'art grec."),
            en = LocalizedContent("Ancient Greek pottery includes the style?", listOf("Red-figure", "Black-figure", "Polychrome", "A and B"), "Culture", "Ancient Greek pottery is mainly divided into the black-figure style (dark figures on light background) and the red-figure style (light figures on dark background), both major in Greek art."),
            zh = LocalizedContent("古希腊陶器包括哪种风格？", listOf("红绘风格", "黑绘风格", "彩色风格", "A和B"), "文化", "古希腊陶器主要分为黑绘风格（深色人物在浅色背景上）和红绘风格（浅色人物在深色背景上），两者都是希腊艺术的重要风格。"),
            es = LocalizedContent("La cerámica griega antigua incluye el estilo?", listOf("Figuras rojas", "Figuras negras", "Policromado", "A y B"), "Cultura", "La cerámica griega antigua se divide principalmente en el estilo de figuras negras (figuras oscuras sobre fondo claro) y el estilo de figuras rojas (figuras claras sobre fondo oscuro), ambos importantes en el arte griego.")
        ),
        BilingualQuestion(
            id = 13360, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La calligraphie est un art d'écriture particulièrement développé en??", listOf("Occident", "Asie de l'Est", "Moyen-Orient", "Afrique du Nord"), "Culture", "La calligraphie est un art majeur en Asie de l'Est, notamment en Chine, au Japon et en Corée, où elle est pratiquée depuis des siècles avec des outils comme le pinceau et l'encre."),
            en = LocalizedContent("Calligraphy is an art of writing particularly developed in?", listOf("West", "East Asia", "Middle East", "North Africa"), "Culture", "Calligraphy is a major art in East Asia, especially in China, Japan, and Korea, where it has been practiced for centuries with tools like brush and ink."),
            zh = LocalizedContent("书法是一种特别在哪个地区发展的书写艺术？", listOf("西方", "东亚", "中东", "北非"), "文化", "书法是东亚的一门重要艺术，特别是在中国、日本和韩国，几个世纪以来一直使用毛笔和墨水等工具进行练习。"),
            es = LocalizedContent("La caligrafía es un arte de escritura particularmente desarrollado en?", listOf("Occidente", "Asia Oriental", "Oriente Medio", "África del Norte"), "Cultura", "La caligrafía es un arte importante en Asia Oriental, especialmente en China, Japón y Corea, donde se ha practicado durante siglos con herramientas como el pincel y la tinta.")
        ),
        BilingualQuestion(
            id = 13361, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La calligraphie arabe utilise une écriture??", listOf("Carrée", "Cursive", "Géométrique", "Tous les styles"), "Culture", "La calligraphie arabe regroupe plusieurs styles d'écriture, comme le coufique, le naskh ou le thuluth, chacun ayant ses propres règles esthétiques."),
            en = LocalizedContent("Arabic calligraphy uses a script?", listOf("Square", "Cursive", "Geometric", "All styles"), "Culture", "Arabic calligraphy encompasses several writing styles, such as Kufic, Naskh, or Thuluth, each with its own aesthetic rules."),
            zh = LocalizedContent("阿拉伯书法使用哪种字体？", listOf("方形", "草书", "几何形", "所有风格"), "文化", "阿拉伯书法包含多种书写风格，如库法体、纳斯赫体或苏鲁斯体，每种都有其独特的审美规则。"),
            es = LocalizedContent("La caligrafía árabe utiliza una escritura?", listOf("Cuadrada", "Cursiva", "Geométrica", "Todos los estilos"), "Cultura", "La caligrafía árabe agrupa varios estilos de escritura, como el cúfico, el naskh o el zuluz, cada uno con sus propias reglas estéticas.")
        ),
        BilingualQuestion(
            id = 13362, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le tatouage traditionnel japonais (irezumi) utilise quels pigments?", listOf("Naturels", "Chimiques", "Historiquement naturels", "Modernes synthétiques"), "Culture", "L’encre traditionnelle irezumi était fabriquée à partir de pigments naturels, comme le noir de carbone ou des minéraux, avant l’arrivée des encres synthétiques modernes."),
            en = LocalizedContent("Traditional Japanese tattoo (irezumi) uses what pigments?", listOf("Natural", "Chemical", "Historically natural", "Modern synthetic"), "Culture", "Traditional irezumi ink was made from natural pigments, such as carbon black or minerals, before the advent of modern synthetic inks."),
            zh = LocalizedContent("传统日本纹身（irezumi）使用什么颜料？", listOf("天然", "化学", "历史上天然", "现代合成"), "文化", "传统irezumi墨水由天然颜料制成，如碳黑或矿物，直到现代合成墨水出现之前。"),
            es = LocalizedContent("El tatuaje tradicional japonés (irezumi) utiliza qué pigmentos?", listOf("Naturales", "Químicos", "Históricamente naturales", "Sintéticos modernos"), "Cultura", "La tinta tradicional irezumi se fabricaba con pigmentos naturales, como negro de carbón o minerales, antes de la llegada de las tintas sintéticas modernas.")
        ),
        BilingualQuestion(
            id = 13363, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le tatouage polynésien raconte l'histoire du porteur. Vrai ou Faux?", listOf("Vrai", "Faux", "Partiellement", "Débattu"), "Culture", "Dans la culture polynésienne, chaque motif et placement du tatouage a une signification précise, retraçant la généalogie, les exploits et le statut social de la personne."),
            en = LocalizedContent("Polynesian tattoo tells the story of the wearer. True or False?", listOf("True", "False", "Partially", "Debated"), "Culture", "In Polynesian culture, each motif and placement of the tattoo has a specific meaning, tracing the genealogy, exploits, and social status of the person."),
            zh = LocalizedContent("波利尼西亚纹身讲述佩戴者的故事。对还是错？", listOf("对", "错", "部分", "有争议"), "文化", "在波利尼西亚文化中，每个纹身图案和位置都有特定含义，追溯个人的家谱、功绩和社会地位。"),
            es = LocalizedContent("El tatuaje polinesio cuenta la historia del portador. ¿Verdadero o Falso?", listOf("Verdadero", "Falso", "Parcialmente", "Debatido"), "Cultura", "En la cultura polinesia, cada motivo y ubicación del tatuaje tiene un significado preciso, trazando la genealogía, hazañas y estatus social de la persona.")
        ),
        BilingualQuestion(
            id = 13364, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le cirque moderne débuta au??", listOf("17e siècle", "18e siècle", "19e siècle", "20e siècle"), "Culture", "Le cirque moderne tel qu'on le connaît, avec chapiteau et numéros équestres, a été inventé à Londres par Philip Astley dans les années 1770, ce qui correspond au 18e siècle."),
            en = LocalizedContent("The modern circus began in the?", listOf("17th century", "18th century", "19th century", "20th century"), "Culture", "The modern circus as we know it, with a big top and equestrian acts, was invented in London by Philip Astley in the 1770s, which corresponds to the 18th century."),
            zh = LocalizedContent("现代马戏团始于哪个世纪？", listOf("17世纪", "18世纪", "19世纪", "20世纪"), "文化", "现代马戏团，包括大帐篷和马术表演，由菲利普·阿斯特利于1770年代在伦敦发明，对应18世纪。"),
            es = LocalizedContent("El circo moderno comenzó en el?", listOf("Siglo XVII", "Siglo XVIII", "Siglo XIX", "Siglo XX"), "Cultura", "El circo moderno tal como lo conocemos, con carpa y números ecuestres, fue inventado en Londres por Philip Astley en la década de 1770, lo que corresponde al siglo XVIII.")
        ),
        BilingualQuestion(
            id = 13365, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le Cirque du Soleil provient de quel pays?", listOf("Usa", "France", "Canada", "Mexique"), "Culture", "Fondé en 1984 par Guy Laliberté et Daniel Gauthier à Baie-Saint-Paul, au Québec, le Cirque du Soleil est une entreprise canadienne."),
            en = LocalizedContent("Cirque du Soleil originates from which country?", listOf("USA", "France", "Canada", "Mexico"), "Culture", "Founded in 1984 by Guy Laliberté and Daniel Gauthier in Baie-Saint-Paul, Quebec, Cirque du Soleil is a Canadian company."),
            zh = LocalizedContent("太阳马戏团来自哪个国家？", listOf("美国", "法国", "加拿大", "墨西哥"), "文化", "太阳马戏团由盖·拉利伯特和丹尼尔·高蒂尔于1984年在魁北克省拜圣保罗创立，是一家加拿大公司。"),
            es = LocalizedContent("El Cirque du Soleil proviene de qué país?", listOf("EE.UU.", "Francia", "Canadá", "México"), "Cultura", "Fundado en 1984 por Guy Laliberté y Daniel Gauthier en Baie-Saint-Paul, Quebec, el Cirque du Soleil es una empresa canadiense.")
        ),
        BilingualQuestion(
            id = 13366, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'acrobatie circassienne inclut??", listOf("Jonglerie", "Trapèze", "Équilibre", "Tous les précédents"), "Culture", "L'acrobatie circassienne englobe diverses disciplines comme les sauts, les pyramides humaines, les équilibres et les portés, donc toutes les options proposées sont correctes."),
            en = LocalizedContent("Circus acrobatics includes?", listOf("Juggling", "Trapeze", "Balance", "All of the above"), "Culture", "Circus acrobatics encompasses various disciplines such as jumps, human pyramids, balances, and lifts, so all the proposed options are correct."),
            zh = LocalizedContent("马戏杂技包括？", listOf("杂耍", "空中飞人", "平衡", "以上所有"), "文化", "马戏杂技涵盖多种项目，如跳跃、叠人塔、平衡和托举，因此所有选项都是正确的。"),
            es = LocalizedContent("La acrobacia circense incluye?", listOf("Malabarismo", "Trapecio", "Equilibrio", "Todos los anteriores"), "Cultura", "La acrobacia circense abarca diversas disciplinas como saltos, pirámides humanas, equilibrios y portes, por lo que todas las opciones propuestas son correctas.")
        ),
        BilingualQuestion(
            id = 13367, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La pantomime est un art du théâtre utilisant??", listOf("Parole", "Silence avec gestes", "Danse", "Musique"), "Culture", "La pantomime repose sur l'expression corporelle et les gestes pour raconter une histoire, sans paroles ni sons."),
            en = LocalizedContent("Pantomime is a theatrical art using?", listOf("Speech", "Silence with gestures", "Dance", "Music"), "Culture", "Pantomime relies on body expression and gestures to tell a story, without words or sounds."),
            zh = LocalizedContent("哑剧是一种使用什么的戏剧艺术？", listOf("言语", "无声手势", "舞蹈", "音乐"), "文化", "哑剧依靠身体表达和手势来讲述故事，不使用言语或声音。"),
            es = LocalizedContent("La pantomima es un arte teatral que utiliza?", listOf("Palabra", "Silencio con gestos", "Danza", "Música"), "Cultura", "La pantomima se basa en la expresión corporal y los gestos para contar una historia, sin palabras ni sonidos.")
        ),
        BilingualQuestion(
            id = 13368, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Marcel Marceau était un maître de la??", listOf("Danse", "Pantomime", "Théâtre", "Cirque"), "Culture", "Marcel Marceau est mondialement reconnu pour avoir popularisé l'art du mime, ou pantomime, notamment à travers son personnage de Bip."),
            en = LocalizedContent("Marcel Marceau was a master of?", listOf("Dance", "Pantomime", "Theatre", "Circus"), "Culture", "Marcel Marceau is globally recognized for popularizing the art of mime, or pantomime, notably through his character Bip."),
            zh = LocalizedContent("马塞尔·马索是哪种艺术的大师？", listOf("舞蹈", "哑剧", "戏剧", "马戏"), "文化", "马塞尔·马索因推广哑剧艺术而闻名全球，尤其是通过他的角色“比普”。"),
            es = LocalizedContent("Marcel Marceau fue un maestro de la?", listOf("Danza", "Pantomima", "Teatro", "Circo"), "Cultura", "Marcel Marceau es reconocido mundialmente por haber popularizado el arte del mimo, o pantomima, especialmente a través de su personaje Bip.")
        ),
    )

    private fun part3(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 13369, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Comédia francese se joue au Théâtre??", listOf("Des Variétés", "Français", "du Palais-Royal", "de la Sourdière"), "Culture", "La Comédie-Française, aussi appelée le Théâtre-Français, est une institution théâtrale nationale située à Paris. Elle tire son nom de la langue française et de son répertoire classique."),
            en = LocalizedContent("The Comédie-Française is performed at the Théâtre??", listOf("des Variétés", "Français", "du Palais-Royal", "de la Sourdière"), "Culture", "The Comédie-Française, also known as the Théâtre-Français, is a national theater institution located in Paris. It takes its name from the French language and its classical repertoire."),
            zh = LocalizedContent("法兰西喜剧院在哪个剧院演出？", listOf("Variétés剧院", "法兰西剧院", "皇宫剧院", "Sourdière剧院"), "文化", "法兰西喜剧院，又称法兰西剧院，是位于巴黎的国家剧院机构。其名称源自法语及其经典剧目。"),
            es = LocalizedContent("La Comédie-Française se representa en el Teatro??", listOf("de las Variedades", "Francés", "del Palacio Real", "de la Sourdière"), "Cultura", "La Comédie-Française, también llamada Teatro-Francés, es una institución teatral nacional situada en París. Toma su nombre del idioma francés y de su repertorio clásico.")
        ),
        BilingualQuestion(
            id = 13370, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le théâtre du Grand Guignol était connu pour??", listOf("Horreur et gore", "Tragédie", "Comédie légère", "Farce"), "Culture", "Fondé à Paris en 1897, ce théâtre se spécialisait dans des pièces naturalistes mettant en scène des meurtres, tortures et violences graphiques, d'où son nom devenu synonyme d'horreur."),
            en = LocalizedContent("The Grand Guignol theater was known for??", listOf("Horror and gore", "Tragedy", "Light comedy", "Farce"), "Culture", "Founded in Paris in 1897, this theater specialized in naturalistic plays featuring murders, tortures, and graphic violence, hence its name becoming synonymous with horror."),
            zh = LocalizedContent("大吉尼奥尔剧院以什么闻名？", listOf("恐怖与血腥", "悲剧", "轻喜剧", "闹剧"), "文化", "该剧院于1897年在巴黎成立，专门上演自然主义戏剧，内容涉及谋杀、酷刑和暴力画面，因此其名称成为恐怖的代名词。"),
            es = LocalizedContent("El teatro Grand Guignol era conocido por??", listOf("Horror y sangre", "Tragedia", "Comedia ligera", "Farsa"), "Cultura", "Fundado en París en 1897, este teatro se especializaba en obras naturalistas que representaban asesinatos, torturas y violencia gráfica, de ahí que su nombre se haya convertido en sinónimo de horror.")
        ),
        BilingualQuestion(
            id = 13371, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Molière écrivait ses pièces en quelle langue?", listOf("Latin", "Français", "Italien", "Grec"), "Culture", "Molière, dramaturge du XVIIe siècle, écrivait en français, la langue de la cour et de la littérature de son époque."),
            en = LocalizedContent("Molière wrote his plays in which language?", listOf("Latin", "French", "Italian", "Greek"), "Culture", "Molière, a 17th-century playwright, wrote in French, the language of the court and literature of his time."),
            zh = LocalizedContent("莫里哀用什么语言写剧本？", listOf("拉丁语", "法语", "意大利语", "希腊语"), "文化", "莫里哀是17世纪的剧作家，用法语写作，这是当时宫廷和文学的语言。"),
            es = LocalizedContent("Molière escribía sus obras en qué idioma?", listOf("Latín", "Francés", "Italiano", "Griego"), "Cultura", "Molière, dramaturgo del siglo XVII, escribía en francés, la lengua de la corte y la literatura de su época.")
        ),
        BilingualQuestion(
            id = 13372, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Sculpture Renaissance italienne se concentrait sur??", listOf("Abstraction", "Réalisme et anatomie", "Géométrie", "Symbolisme"), "Culture", "La sculpture de la Renaissance italienne s'inspirait de l'art antique et des études anatomiques, visant à représenter le corps humain avec précision et naturalisme."),
            en = LocalizedContent("Italian Renaissance sculpture focused on??", listOf("Abstraction", "Realism and anatomy", "Geometry", "Symbolism"), "Culture", "Italian Renaissance sculpture drew inspiration from ancient art and anatomical studies, aiming to represent the human body with precision and naturalism."),
            zh = LocalizedContent("意大利文艺复兴雕塑侧重于什么？", listOf("抽象", "写实与解剖学", "几何", "象征主义"), "文化", "意大利文艺复兴雕塑借鉴了古代艺术和解剖学研究，旨在精确而自然地表现人体。"),
            es = LocalizedContent("La escultura del Renacimiento italiano se centraba en??", listOf("Abstracción", "Realismo y anatomía", "Geometría", "Simbolismo"), "Cultura", "La escultura del Renacimiento italiano se inspiraba en el arte antiguo y los estudios anatómicos, buscando representar el cuerpo humano con precisión y naturalismo.")
        ),
        BilingualQuestion(
            id = 13373, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Donatello était un sculpteur de la Renaissance en??", listOf("France", "Italie", "Flandre", "Espagne"), "Culture", "Donatello était un sculpteur majeur de la première Renaissance, actif principalement à Florence et dans d'autres cités italiennes."),
            en = LocalizedContent("Donatello was a Renaissance sculptor in??", listOf("France", "Italy", "Flanders", "Spain"), "Culture", "Donatello was a major sculptor of the early Renaissance, active mainly in Florence and other Italian cities."),
            zh = LocalizedContent("多纳泰罗是哪个国家的文艺复兴雕塑家？", listOf("法国", "意大利", "佛兰德", "西班牙"), "文化", "多纳泰罗是早期文艺复兴的重要雕塑家，主要活跃于佛罗伦萨及其他意大利城市。"),
            es = LocalizedContent("Donatello fue un escultor del Renacimiento en??", listOf("Francia", "Italia", "Flandes", "España"), "Cultura", "Donatello fue un escultor importante del primer Renacimiento, activo principalmente en Florencia y otras ciudades italianas.")
        ),
        BilingualQuestion(
            id = 13374, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La céramique médiévale blanche et bleue provient de??", listOf("Japon", "Chine", "Perse", "Espagne"), "Culture", "La céramique blanche et bleue, caractéristique de la porcelaine chinoise, a été perfectionnée sous la dynastie Yuan et Ming avant d'être exportée en Europe."),
            en = LocalizedContent("Medieval white and blue ceramics come from??", listOf("Japan", "China", "Persia", "Spain"), "Culture", "White and blue ceramics, characteristic of Chinese porcelain, were perfected under the Yuan and Ming dynasties before being exported to Europe."),
            zh = LocalizedContent("中世纪白蓝陶瓷源自哪里？", listOf("日本", "中国", "波斯", "西班牙"), "文化", "白蓝陶瓷是中国瓷器的特色，在元明时期得到完善，随后出口到欧洲。"),
            es = LocalizedContent("La cerámica medieval blanca y azul proviene de??", listOf("Japón", "China", "Persia", "España"), "Cultura", "La cerámica blanca y azul, característica de la porcelana china, fue perfeccionada bajo las dinastías Yuan y Ming antes de ser exportada a Europa.")
        ),
        BilingualQuestion(
            id = 13375, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les porcelaines de Delft imitaient le style??", listOf("Chinois", "Japonais", "Persan", "Turc"), "Culture", "Les porcelaines de Delft, produites aux Pays-Bas à partir du XVIIe siècle, imitaient le style des porcelaines chinoises importées par la Compagnie néerlandaise des Indes orientales."),
            en = LocalizedContent("Delftware imitated the style of??", listOf("Chinese", "Japanese", "Persian", "Turkish"), "Culture", "Delftware, produced in the Netherlands from the 17th century, imitated the style of Chinese porcelain imported by the Dutch East India Company."),
            zh = LocalizedContent("代尔夫特陶器模仿了什么风格？", listOf("中国", "日本", "波斯", "土耳其"), "文化", "代尔夫特陶器自17世纪在荷兰生产，模仿了荷兰东印度公司进口的中国瓷器风格。"),
            es = LocalizedContent("La loza de Delft imitaba el estilo??", listOf("Chino", "Japonés", "Persa", "Turco"), "Cultura", "La loza de Delft, producida en los Países Bajos a partir del siglo XVII, imitaba el estilo de la porcelana china importada por la Compañía Neerlandesa de las Indias Orientales.")
        ),
        BilingualQuestion(
            id = 13376, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le Kabuki est un art dramatique du??", listOf("Japon", "Chine", "Thaïlande", "Viêt-Nam"), "Culture", "Le Kabuki est une forme de théâtre traditionnel japonais, mêlant chant, danse et jeu d'acteur, apparu au début de l'époque d'Edo."),
            en = LocalizedContent("Kabuki is a dramatic art from??", listOf("Japan", "China", "Thailand", "Vietnam"), "Culture", "Kabuki is a form of traditional Japanese theater, combining song, dance, and acting, which emerged in the early Edo period."),
            zh = LocalizedContent("歌舞伎是哪个国家的戏剧艺术？", listOf("日本", "中国", "泰国", "越南"), "文化", "歌舞伎是一种日本传统戏剧形式，融合了歌唱、舞蹈和表演，起源于江户时代初期。"),
            es = LocalizedContent("El Kabuki es un arte dramático de??", listOf("Japón", "China", "Tailandia", "Vietnam"), "Cultura", "El Kabuki es una forma de teatro tradicional japonés que combina canto, danza y actuación, surgido a principios del período Edo.")
        ),
        BilingualQuestion(
            id = 13377, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Kabuki utilise traditionally quels acteurs?", listOf("Hommes et femmes", "Seulement hommes", "Seulement femmes", "Cela a varié"), "Culture", "Le Kabuki, théâtre traditionnel japonais né au XVIIe siècle, interdit la présence des femmes sur scène depuis 1629 pour des raisons morales, les rôles féminins étant joués par des acteurs masculins spécialisés (onnagata)."),
            en = LocalizedContent("Kabuki traditionally uses which actors?", listOf("Men and women", "Only men", "Only women", "It has varied"), "Culture", "Kabuki, a traditional Japanese theater born in the 17th century, banned women from the stage in 1629 for moral reasons, with female roles played by specialized male actors (onnagata)."),
            zh = LocalizedContent("歌舞伎传统上使用哪些演员？", listOf("男女演员", "仅男演员", "仅女演员", "曾有变化"), "文化", "歌舞伎是17世纪诞生的日本传统戏剧，1629年因道德原因禁止女性登台，女性角色由专门的男演员（女形）扮演。"),
            es = LocalizedContent("El Kabuki tradicionalmente utiliza qué actores?", listOf("Hombres y mujeres", "Solo hombres", "Solo mujeres", "Ha variado"), "Cultura", "El Kabuki, teatro tradicional japonés nacido en el siglo XVII, prohibió la presencia de mujeres en el escenario desde 1629 por razones morales, interpretando los roles femeninos actores masculinos especializados (onnagata).")
        ),
        BilingualQuestion(
            id = 13378, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Noh est un art dramatique japonais ancien et??", listOf("Rapide", "Lent et poétique", "Comique", "Bruyant"), "Culture", "Le Noh se caractérise par des mouvements lents et stylisés, accompagnés de chants et de musique, visant à créer une atmosphère poétique et méditative."),
            en = LocalizedContent("Noh is an ancient Japanese dramatic art that is??", listOf("Fast", "Slow and poetic", "Comic", "Loud"), "Culture", "Noh is characterized by slow, stylized movements, accompanied by chants and music, aiming to create a poetic and meditative atmosphere."),
            zh = LocalizedContent("能乐是一种古老的日本戏剧艺术，特点是？", listOf("快速", "缓慢而富有诗意", "喜剧", "喧闹"), "文化", "能乐以缓慢而风格化的动作、吟唱和音乐为特点，旨在营造诗意和冥想的氛围。"),
            es = LocalizedContent("El Noh es un arte dramático japonés antiguo que es??", listOf("Rápido", "Lento y poético", "Cómico", "Ruidoso"), "Cultura", "El Noh se caracteriza por movimientos lentos y estilizados, acompañados de cantos y música, con el objetivo de crear una atmósfera poética y meditativa.")
        ),
        BilingualQuestion(
            id = 13379, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'art du henna est traditionnel en??", listOf("Asie du Sud", "Moyen-Orient", "Afrique du Nord", "Tous les précédents"), "Culture", "Le henna est traditionnellement utilisé en Inde, au Pakistan, au Bangladesh et au Sri Lanka pour les célébrations comme les mariages, ainsi qu’au Moyen-Orient et en Afrique du Nord."),
            en = LocalizedContent("The art of henna is traditional in??", listOf("South Asia", "Middle East", "North Africa", "All of the above"), "Culture", "Henna is traditionally used in India, Pakistan, Bangladesh, and Sri Lanka for celebrations like weddings, as well as in the Middle East and North Africa."),
            zh = LocalizedContent("海娜艺术传统上流行于??", listOf("南亚", "中东", "北非", "以上所有"), "文化", "海娜传统上用于印度、巴基斯坦、孟加拉国和斯里兰卡的婚礼等庆祝活动，也流行于中东和北非。"),
            es = LocalizedContent("El arte de la henna es tradicional en??", listOf("Asia del Sur", "Oriente Medio", "Norte de África", "Todos los anteriores"), "Cultura", "La henna se usa tradicionalmente en India, Pakistán, Bangladés y Sri Lanka para celebraciones como bodas, así como en Oriente Medio y el Norte de África.")
        ),
        BilingualQuestion(
            id = 13380, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La calligraphie chinoise utilise le??", listOf("Stylo", "Pinceau", "Plume", "Crayon"), "Culture", "L’outil traditionnel de la calligraphie chinoise est le pinceau, utilisé avec de l’encre de Chine sur du papier de riz ou de la soie."),
            en = LocalizedContent("Chinese calligraphy uses the??", listOf("Pen", "Brush", "Quill", "Pencil"), "Culture", "The traditional tool for Chinese calligraphy is the brush, used with Chinese ink on rice paper or silk."),
            zh = LocalizedContent("中国书法使用??", listOf("钢笔", "毛笔", "羽毛笔", "铅笔"), "文化", "中国书法的传统工具是毛笔，配合墨汁在宣纸或丝绸上书写。"),
            es = LocalizedContent("La caligrafía china utiliza el??", listOf("Bolígrafo", "Pincel", "Pluma", "Lápiz"), "Cultura", "La herramienta tradicional de la caligrafía china es el pincel, usado con tinta china sobre papel de arroz o seda.")
        ),
        BilingualQuestion(
            id = 13381, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Bunraku est un art de marionnettes??", listOf("Coréen", "Thaï", "Japonais", "Indonésien"), "Culture", "Le bunraku est une forme de théâtre de marionnettes traditionnelle originaire du Japon, apparue au XVIIe siècle à Osaka."),
            en = LocalizedContent("Bunraku is a puppet art from??", listOf("Korea", "Thailand", "Japan", "Indonesia"), "Culture", "Bunraku is a traditional form of puppet theater originating in Japan, emerging in the 17th century in Osaka."),
            zh = LocalizedContent("文乐是一种??的木偶艺术", listOf("韩国", "泰国", "日本", "印度尼西亚"), "文化", "文乐是一种传统的木偶戏剧形式，起源于日本，17世纪在大阪兴起。"),
            es = LocalizedContent("El Bunraku es un arte de marionetas??", listOf("Coreano", "Tailandés", "Japonés", "Indonesio"), "Cultura", "El bunraku es una forma tradicional de teatro de marionetas originaria de Japón, que surgió en el siglo XVII en Osaka.")
        ),
        BilingualQuestion(
            id = 13382, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'art corporel body painting utilise??", listOf("Peintures temporaires", "Maquillage", "Pigments naturels", "Tous les précédents"), "Culture", "Le body painting peut utiliser de la peinture corporelle, des pinceaux, des éponges et d'autres outils, ainsi que des techniques comme l'aérographe, englobant ainsi tous les éléments précédents."),
            en = LocalizedContent("Body painting art uses??", listOf("Temporary paints", "Makeup", "Natural pigments", "All of the above"), "Culture", "Body painting can use body paint, brushes, sponges, and other tools, as well as techniques like airbrushing, thus encompassing all the previous elements."),
            zh = LocalizedContent("人体彩绘艺术使用??", listOf("临时颜料", "化妆品", "天然色素", "以上所有"), "文化", "人体彩绘可以使用人体颜料、刷子、海绵等工具，以及喷枪等技术，因此包含以上所有元素。"),
            es = LocalizedContent("El arte del body painting utiliza??", listOf("Pinturas temporales", "Maquillaje", "Pigmentos naturales", "Todos los anteriores"), "Cultura", "El body painting puede usar pintura corporal, pinceles, esponjas y otras herramientas, así como técnicas como el aerógrafo, abarcando así todos los elementos anteriores.")
        ),
        BilingualQuestion(
            id = 13383, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le scarification est une pratique traditionnelle en??", listOf("Afrique", "Asie", "Océanie", "Amérique"), "Culture", "La scarification est une pratique ancestrale répandue dans de nombreuses ethnies africaines, servant de marque d'identité, de rite de passage ou d'ornement corporel."),
            en = LocalizedContent("Scarification is a traditional practice in??", listOf("Africa", "Asia", "Oceania", "America"), "Culture", "Scarification is an ancient practice widespread in many African ethnic groups, serving as a mark of identity, rite of passage, or body ornament."),
            zh = LocalizedContent("疤痕纹身是??的传统习俗", listOf("非洲", "亚洲", "大洋洲", "美洲"), "文化", "疤痕纹身是一种古老的习俗，广泛存在于许多非洲族群中，作为身份标志、成人礼或身体装饰。"),
            es = LocalizedContent("La escarificación es una práctica tradicional en??", listOf("África", "Asia", "Oceanía", "América"), "Cultura", "La escarificación es una práctica ancestral extendida en muchas etnias africanas, que sirve como marca de identidad, rito de paso o adorno corporal.")
        ),
        BilingualQuestion(
            id = 13384, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La broderie dentelle-à-l'aiguille vient de??", listOf("Venise", "Bruxelles", "Alençon", "Bruges"), "Culture", "La broderie dentelle-à-l'aiguille est une technique née à Venise au XVIe siècle, où elle était prisée pour sa finesse et utilisée dans les vêtements et le linge d'église."),
            en = LocalizedContent("Needle lace embroidery comes from??", listOf("Venice", "Brussels", "Alençon", "Bruges"), "Culture", "Needle lace embroidery is a technique born in Venice in the 16th century, prized for its fineness and used in clothing and church linens."),
            zh = LocalizedContent("针绣花边刺绣起源于??", listOf("威尼斯", "布鲁塞尔", "阿朗松", "布鲁日"), "文化", "针绣花边是一种起源于16世纪威尼斯的工艺，以其精细著称，用于服装和教堂亚麻布。"),
            es = LocalizedContent("El bordado de encaje de aguja proviene de??", listOf("Venecia", "Bruselas", "Alençon", "Brujas"), "Cultura", "El bordado de encaje de aguja es una técnica nacida en Venecia en el siglo XVI, apreciada por su fineza y utilizada en ropa y ropa de iglesia.")
        ),
        BilingualQuestion(
            id = 13385, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le tissage Navajo est une tradition amérindienne de??", listOf("Poterie", "Textiles", "Sculpture", "Peinture"), "Culture", "Le tissage Navajo est une pratique ancestrale de création de couvertures, tapis et vêtements, utilisant des métiers à tisser verticaux et des motifs géométriques symboliques."),
            en = LocalizedContent("Navajo weaving is a Native American tradition of??", listOf("Pottery", "Textiles", "Sculpture", "Painting"), "Culture", "Navajo weaving is an ancestral practice of creating blankets, rugs, and clothing, using vertical looms and symbolic geometric patterns."),
            zh = LocalizedContent("纳瓦霍编织是美洲原住民??的传统", listOf("陶器", "纺织品", "雕塑", "绘画"), "文化", "纳瓦霍编织是一种制作毯子、地毯和服装的古老技艺，使用立式织布机和象征性的几何图案。"),
            es = LocalizedContent("El tejido navajo es una tradición nativa americana de??", listOf("Alfarería", "Textiles", "Escultura", "Pintura"), "Cultura", "El tejido navajo es una práctica ancestral de creación de mantas, alfombras y ropa, utilizando telares verticales y patrones geométricos simbólicos.")
        ),
        BilingualQuestion(
            id = 13386, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La céramique Raku provient du??", listOf("Japon", "Chine", "Corée", "Thaïlande"), "Culture", "Le Raku est une technique de céramique développée au Japon au XVIe siècle, associée à la cérémonie du thé zen."),
            en = LocalizedContent("Raku pottery comes from??", listOf("Japan", "China", "Korea", "Thailand"), "Culture", "Raku is a pottery technique developed in Japan in the 16th century, associated with the Zen tea ceremony."),
            zh = LocalizedContent("乐烧陶器起源于??", listOf("日本", "中国", "韩国", "泰国"), "文化", "乐烧是一种16世纪在日本发展起来的陶艺技术，与禅宗茶道相关。"),
            es = LocalizedContent("La cerámica Raku proviene de??", listOf("Japón", "China", "Corea", "Tailandia"), "Cultura", "El Raku es una técnica de cerámica desarrollada en Japón en el siglo XVI, asociada con la ceremonia del té zen.")
        ),
        BilingualQuestion(
            id = 13387, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le théâtre Kathak kal provient de quelle région?", listOf("Inde du Nord", "Inde du Sud", "Bangladesh", "Pakistan"), "Culture", "Le Kathakali est une forme de théâtre dansé originaire du Kerala, en Inde du Sud, tandis que le Kathak, qui lui est souvent confondu, est une danse classique de l'Inde du Nord."),
            en = LocalizedContent("Kathakali theater originates from which region?", listOf("North India", "South India", "Bangladesh", "Pakistan"), "Culture", "Kathakali is a dance-drama form originating from Kerala in South India, while Kathak, often confused with it, is a classical dance from North India."),
            zh = LocalizedContent("卡塔卡利戏剧起源于哪个地区？", listOf("北印度", "南印度", "孟加拉国", "巴基斯坦"), "文化", "卡塔卡利是一种起源于印度南部喀拉拉邦的舞蹈戏剧形式，而常与之混淆的卡塔克是北印度的古典舞蹈。"),
            es = LocalizedContent("El teatro Kathakali se origina en qué región?", listOf("India del Norte", "India del Sur", "Bangladés", "Pakistán"), "Cultura", "El Kathakali es una forma de teatro danzado originaria de Kerala, en el sur de la India, mientras que el Kathak, a menudo confundido con él, es una danza clásica del norte de la India.")
        ),
        BilingualQuestion(
            id = 13388, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La danse Bharatanatyam est une danse classique de l'??", listOf("Inde du Nord", "Inde du Sud", "Sri Lanka", "Indonésie"), "Culture", "Le Bharatanatyam est une danse classique originaire du Tamil Nadu, dans le sud de l'Inde, reconnue pour ses mouvements précis et ses expressions narratives."),
            en = LocalizedContent("Bharatanatyam dance is a classical dance from??", listOf("North India", "South India", "Sri Lanka", "Indonesia"), "Culture", "Bharatanatyam is a classical dance originating from Tamil Nadu in South India, known for its precise movements and narrative expressions."),
            zh = LocalizedContent("婆罗多舞是??的古典舞蹈", listOf("北印度", "南印度", "斯里兰卡", "印度尼西亚"), "文化", "婆罗多舞是一种起源于印度南部泰米尔纳德邦的古典舞蹈，以其精准的动作和叙事表达而闻名。"),
            es = LocalizedContent("La danza Bharatanatyam es una danza clásica de??", listOf("India del Norte", "India del Sur", "Sri Lanka", "Indonesia"), "Cultura", "El Bharatanatyam es una danza clásica originaria de Tamil Nadu, en el sur de la India, reconocida por sus movimientos precisos y expresiones narrativas.")
        ),
        BilingualQuestion(
            id = 13389, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le théâtre Peking Opera est un art dramatique du??", listOf("Japon", "Chine", "Corée", "Thaïlande"), "Culture", "Le Peking Opera, ou opéra de Pékin, est une forme d’art dramatique traditionnel chinois mêlant chant, danse et acrobaties."),
            en = LocalizedContent("Peking Opera is a dramatic art form from which country?", listOf("Japan", "China", "Korea", "Thailand"), "Culture", "Peking Opera, or Beijing opera, is a traditional Chinese dramatic art form combining singing, dance, and acrobatics."),
            zh = LocalizedContent("京剧是哪个国家的戏剧艺术？", listOf("日本", "中国", "韩国", "泰国"), "文化", "京剧是一种中国传统戏剧艺术，融合了唱、舞和杂技。"),
            es = LocalizedContent("La Ópera de Pekín es un arte dramático de ¿qué país?", listOf("Japón", "China", "Corea", "Tailandia"), "Cultura", "La Ópera de Pekín es una forma de arte dramático tradicional chino que combina canto, danza y acrobacias.")
        ),
        BilingualQuestion(
            id = 13390, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le maquillage d'opéra Peking utilise des motifs appelés??", listOf("Lianpu", "Yuanpu", "Facepu", "Taipu"), "Culture", "Le Lianpu désigne les motifs de maquillage codifiés de l'opéra de Pékin, chaque couleur et dessin symbolisant le caractère du personnage (héros, traître, etc.)."),
            en = LocalizedContent("Peking Opera makeup uses patterns called?", listOf("Lianpu", "Yuanpu", "Facepu", "Taipu"), "Culture", "Lianpu refers to the codified makeup patterns of Peking Opera, where each color and design symbolizes the character's personality (hero, villain, etc.)."),
            zh = LocalizedContent("京剧脸谱使用的图案称为？", listOf("脸谱", "元谱", "面谱", "台谱"), "文化", "脸谱是京剧程式化的化妆图案，每种颜色和设计都象征角色的性格（英雄、奸臣等）。"),
            es = LocalizedContent("El maquillaje de la Ópera de Pekín utiliza patrones llamados?", listOf("Lianpu", "Yuanpu", "Facepu", "Taipu"), "Cultura", "Lianpu se refiere a los patrones de maquillaje codificados de la Ópera de Pekín, donde cada color y diseño simboliza el carácter del personaje (héroe, traidor, etc.).")
        ),
        BilingualQuestion(
            id = 13391, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'art du Graffiti provient du??", listOf("Brooklyn", "Los Angeles", "Chicago", "New York"), "Culture", "Le graffiti moderne est né dans les années 1970 à New York, où des jeunes des quartiers populaires taguaient les murs et les métros pour marquer leur territoire et exprimer leur identité."),
            en = LocalizedContent("The art of Graffiti originated from?", listOf("Brooklyn", "Los Angeles", "Chicago", "New York"), "Culture", "Modern graffiti was born in the 1970s in New York, where young people from working-class neighborhoods tagged walls and subways to mark territory and express identity."),
            zh = LocalizedContent("涂鸦艺术起源于？", listOf("布鲁克林", "洛杉矶", "芝加哥", "纽约"), "文化", "现代涂鸦艺术诞生于20世纪70年代的纽约，来自平民社区的年轻人在地铁和墙壁上涂鸦，以标记领地和表达身份。"),
            es = LocalizedContent("El arte del Graffiti se originó en?", listOf("Brooklyn", "Los Ángeles", "Chicago", "Nueva York"), "Cultura", "El graffiti moderno nació en la década de 1970 en Nueva York, donde jóvenes de barrios populares pintaban paredes y metros para marcar territorio y expresar su identidad.")
        ),
        BilingualQuestion(
            id = 13392, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La Street Art utilise des techniques comme??", listOf("Peinture", "Pochoir", "Collage", "Tous les précédents"), "Culture", "Le street art englobe diverses techniques comme le pochoir, la peinture au rouleau, les collages, les mosaïques et le graffiti, ce qui rend la réponse \"Tous les précédents\" correcte."),
            en = LocalizedContent("Street Art uses techniques like?", listOf("Painting", "Stencil", "Collage", "All of the above"), "Culture", "Street art encompasses various techniques such as stencil, roller painting, collages, mosaics, and graffiti, making 'All of the above' correct."),
            zh = LocalizedContent("街头艺术使用的技术包括？", listOf("绘画", "模板", "拼贴", "以上所有"), "文化", "街头艺术包含多种技术，如模板、滚筒绘画、拼贴、马赛克和涂鸦，因此“以上所有”正确。"),
            es = LocalizedContent("El arte callejero utiliza técnicas como?", listOf("Pintura", "Plantilla", "Collage", "Todos los anteriores"), "Cultura", "El arte callejero abarca diversas técnicas como plantilla, pintura con rodillo, collages, mosaicos y graffiti, por lo que 'Todos los anteriores' es correcto.")
        ),
        BilingualQuestion(
            id = 13393, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Dadaïsme était un mouvement artistique du??", listOf("18e siècle", "19e siècle", "20e siècle (début)", "20e siècle (milieu)"), "Culture", "Le Dadaïsme est né pendant la Première Guerre mondiale, vers 1916, et s'est développé dans les années 1920, ce qui le place au début du 20e siècle."),
            en = LocalizedContent("Dadaism was an artistic movement of the?", listOf("18th century", "19th century", "20th century (early)", "20th century (mid)"), "Culture", "Dadaism emerged during World War I, around 1916, and developed in the 1920s, placing it in the early 20th century."),
            zh = LocalizedContent("达达主义是哪个时期的艺术运动？", listOf("18世纪", "19世纪", "20世纪（早期）", "20世纪（中期）"), "文化", "达达主义诞生于第一次世界大战期间，约1916年，并在20世纪20年代发展，因此属于20世纪早期。"),
            es = LocalizedContent("El dadaísmo fue un movimiento artístico del?", listOf("siglo XVIII", "siglo XIX", "siglo XX (principios)", "siglo XX (mediados)"), "Cultura", "El dadaísmo nació durante la Primera Guerra Mundial, alrededor de 1916, y se desarrolló en la década de 1920, situándolo a principios del siglo XX.")
        ),
        BilingualQuestion(
            id = 13394, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le Surréalisme explorait l'??", listOf("Réalité", "Inconscient", "Logique", "Raison"), "Culture", "André Breton, chef de file du surréalisme, définit le mouvement comme un automatisme psychique pur visant à exprimer le fonctionnement réel de la pensée, en l'absence de tout contrôle exercé par la raison."),
            en = LocalizedContent("Surrealism explored the?", listOf("Reality", "Unconscious", "Logic", "Reason"), "Culture", "André Breton, leader of surrealism, defined the movement as pure psychic automatism aiming to express the true functioning of thought, free from any control by reason."),
            zh = LocalizedContent("超现实主义探索的是？", listOf("现实", "潜意识", "逻辑", "理性"), "文化", "超现实主义领袖安德烈·布勒东将运动定义为纯粹的心理自动主义，旨在表达思想的真实运作，不受任何理性控制。"),
            es = LocalizedContent("El surrealismo exploraba el?", listOf("Realidad", "Inconsciente", "Lógica", "Razón"), "Cultura", "André Breton, líder del surrealismo, definió el movimiento como un automatismo psíquico puro destinado a expresar el funcionamiento real del pensamiento, libre de todo control de la razón.")
        ),
        BilingualQuestion(
            id = 13395, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'art Abstrait rejetait la??", listOf("Couleur", "Forme", "Représentation réaliste", "Texture"), "Culture", "L'art abstrait s'est développé au début du XXe siècle en rompant avec la figuration et la représentation du monde visible, privilégiant formes, couleurs et émotions pures."),
            en = LocalizedContent("Abstract Art rejected?", listOf("Color", "Form", "Realistic representation", "Texture"), "Culture", "Abstract art developed in the early 20th century by breaking with figuration and representation of the visible world, favoring pure forms, colors, and emotions."),
            zh = LocalizedContent("抽象艺术拒绝的是？", listOf("色彩", "形式", "写实再现", "质感"), "文化", "抽象艺术在20世纪初发展起来，打破了具象和对可见世界的再现，偏爱纯粹的形式、色彩和情感。"),
            es = LocalizedContent("El arte abstracto rechazaba la?", listOf("Color", "Forma", "Representación realista", "Textura"), "Cultura", "El arte abstracto se desarrolló a principios del siglo XX rompiendo con la figuración y la representación del mundo visible, privilegiando formas, colores y emociones puras.")
        ),
        BilingualQuestion(
            id = 13396, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le Pop Art utilisait des images de??", listOf("Nature", "Culture populaire", "Histoire", "Religion"), "Culture", "Le Pop Art s'est développé dans les années 1950-1960 en s'inspirant des objets et symboles de la société de consommation, comme les publicités, les bandes dessinées ou les stars médiatiques."),
            en = LocalizedContent("Pop Art used images from?", listOf("Nature", "Popular culture", "History", "Religion"), "Culture", "Pop Art developed in the 1950s-1960s, drawing inspiration from objects and symbols of consumer society, such as advertisements, comics, and media stars."),
            zh = LocalizedContent("波普艺术使用的图像来自？", listOf("自然", "流行文化", "历史", "宗教"), "文化", "波普艺术在20世纪50-60年代发展起来，从消费社会的物品和符号中汲取灵感，如广告、漫画和媒体明星。"),
            es = LocalizedContent("El arte pop utilizaba imágenes de?", listOf("Naturaleza", "Cultura popular", "Historia", "Religión"), "Cultura", "El arte pop se desarrolló en las décadas de 1950-1960 inspirándose en objetos y símbolos de la sociedad de consumo, como anuncios, cómics y estrellas mediáticas.")
        ),
        BilingualQuestion(
            id = 13397, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Andy Warhol était un artiste Pop connu pour??", listOf("Sculptures", "Lithographies", "Sérigraphies", "Peintures abstraites"), "Culture", "Andy Warhol a popularisé la sérigraphie dans les années 1960 pour reproduire en série des images de consommation, comme les boîtes de soupe Campbell ou les portraits de Marilyn Monroe."),
            en = LocalizedContent("Andy Warhol was a Pop artist known for?", listOf("Sculptures", "Lithographs", "Screen prints", "Abstract paintings"), "Culture", "Andy Warhol popularized screen printing in the 1960s to mass-produce consumer images, like Campbell's soup cans or Marilyn Monroe portraits."),
            zh = LocalizedContent("安迪·沃霍尔是一位以什么闻名的波普艺术家？", listOf("雕塑", "石版画", "丝网印刷", "抽象画"), "文化", "安迪·沃霍尔在20世纪60年代推广了丝网印刷，用于批量复制消费图像，如金宝汤罐头或玛丽莲·梦露肖像。"),
            es = LocalizedContent("Andy Warhol fue un artista pop conocido por?", listOf("Esculturas", "Litografías", "Serigrafías", "Pinturas abstractas"), "Cultura", "Andy Warhol popularizó la serigrafía en la década de 1960 para reproducir en serie imágenes de consumo, como las latas de sopa Campbell o los retratos de Marilyn Monroe.")
        ),
        BilingualQuestion(
            id = 13398, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'art minimaliste se concentre sur??", listOf("Complexité", "Ornamentation", "Formes simples", "Détails"), "Culture", "L'art minimaliste, apparu dans les années 1960, rejette l'expressionnisme et l'ornementation pour se concentrer sur des formes géométriques simples, des couleurs unies et des matériaux industriels."),
            en = LocalizedContent("Minimalist art focuses on?", listOf("Complexity", "Ornamentation", "Simple forms", "Details"), "Culture", "Minimalist art, emerging in the 1960s, rejects expressionism and ornamentation to focus on simple geometric forms, solid colors, and industrial materials."),
            zh = LocalizedContent("极简主义艺术专注于？", listOf("复杂性", "装饰", "简单形式", "细节"), "文化", "极简主义艺术出现于20世纪60年代，拒绝表现主义和装饰，专注于简单的几何形式、纯色和工业材料。"),
            es = LocalizedContent("El arte minimalista se centra en?", listOf("Complejidad", "Ornamentación", "Formas simples", "Detalles"), "Cultura", "El arte minimalista, surgido en la década de 1960, rechaza el expresionismo y la ornamentación para centrarse en formas geométricas simples, colores sólidos y materiales industriales.")
        ),
        BilingualQuestion(
            id = 13399, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Bansky est un artiste contemporain connu pour ses??", listOf("Sculptures", "Graffitis politiques", "Peintures", "Installations"), "Culture", "Banksy réalise des pochoirs muraux satiriques sur des thèmes comme la guerre ou le capitalisme, ce qui en fait des graffitis politiques."),
            en = LocalizedContent("Banksy is a contemporary artist known for his??", listOf("Sculptures", "Political graffiti", "Paintings", "Installations"), "Culture", "Banksy creates satirical wall stencils on themes such as war or capitalism, making them political graffiti."),
            zh = LocalizedContent("班克西是一位当代艺术家，以其什么而闻名？", listOf("雕塑", "政治涂鸦", "绘画", "装置艺术"), "文化", "班克西创作关于战争或资本主义等主题的讽刺性墙面模板，因此属于政治涂鸦。"),
            es = LocalizedContent("Banksy es un artista contemporáneo conocido por sus??", listOf("Esculturas", "Grafitis políticos", "Pinturas", "Instalaciones"), "Cultura", "Banksy realiza esténciles murales satíricos sobre temas como la guerra o el capitalismo, lo que los convierte en grafitis políticos.")
        ),
        BilingualQuestion(
            id = 20001, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe a chanté 'Bohemian Rhapsody' ?", listOf("Queen", "The Beatles", "Led Zeppelin", "Pink Floyd"), "Musique", "Queen a sorti Bohemian Rhapsody en 1975 sur l'album A Night at the Opera. La chanson est devenue un immense succès mondial et un classique du rock."),
            en = LocalizedContent("Which group sang 'Bohemian Rhapsody'?", listOf("Queen", "The Beatles", "Led Zeppelin", "Pink Floyd"), "Music", "Queen released Bohemian Rhapsody in 1975 on the album A Night at the Opera. The song became a huge global success and a rock classic."),
            zh = LocalizedContent("哪个乐队演唱了《波西米亚狂想曲》？", listOf("皇后乐队", "披头士乐队", "齐柏林飞艇乐队", "平克·弗洛伊德乐队"), "音乐", "皇后乐队于1975年在专辑《歌剧之夜》中发行了《波西米亚狂想曲》。这首歌成为全球巨大成功和摇滚经典。"),
            es = LocalizedContent("¿Qué grupo cantó 'Bohemian Rhapsody'?", listOf("Queen", "The Beatles", "Led Zeppelin", "Pink Floyd"), "Musica", "Queen lanzó Bohemian Rhapsody en 1975 en el álbum A Night at the Opera. La canción se convirtió en un gran éxito mundial y un clásico del rock.")
        ),
        BilingualQuestion(
            id = 20002, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de touches possède un piano standard ?", listOf("88", "76", "92", "84"), "Musique", "Le piano standard compte 88 touches, soit 52 blanches et 36 noires, une norme établie depuis la fin du XIXe siècle pour couvrir toute la tessiture musicale."),
            en = LocalizedContent("How many keys does a standard piano have?", listOf("88", "76", "92", "84"), "Music", "The standard piano has 88 keys, 52 white and 36 black, a norm established since the late 19th century to cover the full musical range."),
            zh = LocalizedContent("标准钢琴有多少个琴键？", listOf("88", "76", "92", "84"), "音乐", "标准钢琴有88个琴键，52个白键和36个黑键，这是自19世纪末以来为覆盖全部音域而确立的标准。"),
            es = LocalizedContent("¿Cuántas teclas tiene un piano estándar?", listOf("88", "76", "92", "84"), "Musica", "El piano estándar tiene 88 teclas, 52 blancas y 36 negras, una norma establecida desde finales del siglo XIX para cubrir toda la tesitura musical.")
        ),
        BilingualQuestion(
            id = 20003, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel instrument de musique a 47 cordes ?", listOf("La harpe", "Le clavecin", "La guitare classique", "Le luth"), "Musique", "La harpe de concert standard possède 47 cordes, ce qui lui permet de couvrir une large gamme de notes allant du do grave au sol aigu."),
            en = LocalizedContent("Which musical instrument has 47 strings?", listOf("The harp", "The harpsichord", "The classical guitar", "The lute"), "Music", "The standard concert harp has 47 strings, allowing it to cover a wide range of notes from low C to high G."),
            zh = LocalizedContent("哪种乐器有47根弦？", listOf("竖琴", "羽管键琴", "古典吉他", "鲁特琴"), "音乐", "标准音乐会竖琴有47根弦，使其能够覆盖从低音C到高音G的广泛音域。"),
            es = LocalizedContent("¿Qué instrumento musical tiene 47 cuerdas?", listOf("El arpa", "El clavecín", "La guitarra clásica", "El laúd"), "Musica", "El arpa de concierto estándar tiene 47 cuerdas, lo que le permite cubrir una amplia gama de notas desde el do grave hasta el sol agudo.")
        ),
        BilingualQuestion(
            id = 20005, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le tempo standard d'un Andante ?", listOf("76-108 BPM", "120-156 BPM", "40-60 BPM", "160-200 BPM"), "Musique", "L'andante est un tempo modéré, souvent décrit comme un rythme de marche, et sa plage standard de 76 à 108 battements par minute est définie par la notation musicale classique."),
            en = LocalizedContent("What is the standard tempo of an Andante?", listOf("76-108 BPM", "120-156 BPM", "40-60 BPM", "160-200 BPM"), "Music", "Andante is a moderate tempo, often described as a walking pace, and its standard range of 76 to 108 beats per minute is defined by classical music notation."),
            zh = LocalizedContent("行板的标准速度是多少？", listOf("76-108 BPM", "120-156 BPM", "40-60 BPM", "160-200 BPM"), "音乐", "行板是一种中等速度，常被描述为步行节奏，其标准范围每分钟76到108拍由古典音乐记谱法定义。"),
            es = LocalizedContent("¿Cuál es el tempo estándar de un Andante?", listOf("76-108 BPM", "120-156 BPM", "40-60 BPM", "160-200 BPM"), "Musica", "El andante es un tempo moderado, a menudo descrito como un ritmo de marcha, y su rango estándar de 76 a 108 pulsaciones por minuto está definido por la notación musical clásica.")
        ),
        BilingualQuestion(
            id = 20006, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel chanteur français est surnommé 'L'Aznavour de la chanson' ?", listOf("Charles Aznavour", "Jacques Brel", "Serge Gainsbourg", "Claude François"), "Musique", "Charles Aznavour est lui-même le chanteur français désigné par ce surnom, car il est une icône de la chanson française."),
            en = LocalizedContent("Which French singer is nicknamed 'The Aznavour of song'?", listOf("Charles Aznavour", "Jacques Brel", "Serge Gainsbourg", "Claude François"), "Music", "Charles Aznavour himself is the French singer designated by this nickname, as he is an icon of French chanson."),
            zh = LocalizedContent("哪位法国歌手被称为“香颂的阿兹纳武尔”？", listOf("查尔斯·阿兹纳武尔", "雅克·布雷尔", "塞尔日·甘斯布", "克洛德·弗朗索瓦"), "音乐", "查尔斯·阿兹纳武尔本人就是被这个绰号指代的法国歌手，因为他是法国香颂的偶像。"),
            es = LocalizedContent("¿Qué cantante francés es apodado 'El Aznavour de la canción'?", listOf("Charles Aznavour", "Jacques Brel", "Serge Gainsbourg", "Claude François"), "Musica", "Charles Aznavour es el propio cantante francés designado por este apodo, ya que es un icono de la canción francesa.")
        ),
        BilingualQuestion(
            id = 20008, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel genre musical est né à la Nouvelle-Orléans ?", listOf("Le jazz", "Le blues", "Le rock", "Le country"), "Musique", "La Nouvelle-Orléans est considérée comme le berceau du jazz, né au début du XXe siècle du mélange des musiques africaines, européennes et du blues."),
            en = LocalizedContent("Which music genre was born in New Orleans?", listOf("Jazz", "Blues", "Rock", "Country"), "Music", "New Orleans is considered the birthplace of jazz, born in the early 20th century from a mix of African, European, and blues music."),
            zh = LocalizedContent("哪种音乐流派诞生于新奥尔良？", listOf("爵士乐", "蓝调", "摇滚乐", "乡村音乐"), "音乐", "新奥尔良被认为是爵士乐的发源地，爵士乐诞生于20世纪初，融合了非洲、欧洲和蓝调音乐。"),
            es = LocalizedContent("¿Qué género musical nació en Nueva Orleans?", listOf("El jazz", "El blues", "El rock", "El country"), "Musica", "Nueva Orleans es considerada la cuna del jazz, nacido a principios del siglo XX de la mezcla de músicas africanas, europeas y del blues.")
        ),
        BilingualQuestion(
            id = 20009, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel rappeur français a sorti l'album 'Civilisation' ?", listOf("Orelsan", "Nekfeu", "Booba", "PNL"), "Musique", "Orelsan a sorti l'album \"Civilisation\" en 2021, après une longue absence. Ce disque a remporté plusieurs Victoires de la musique."),
            en = LocalizedContent("Which French rapper released the album 'Civilisation'?", listOf("Orelsan", "Nekfeu", "Booba", "PNL"), "Music", "Orelsan released the album 'Civilisation' in 2021, after a long absence. This record won several Victoires de la Musique awards."),
            zh = LocalizedContent("哪位法国说唱歌手发行了专辑《文明》？", listOf("奥雷尔桑", "内克弗", "布巴", "PNL"), "音乐", "奥雷尔桑在2021年发行了专辑《文明》，此前他长期缺席。这张唱片赢得了多项法国音乐胜利奖。"),
            es = LocalizedContent("¿Qué rapero francés lanzó el álbum 'Civilisation'?", listOf("Orelsan", "Nekfeu", "Booba", "PNL"), "Musica", "Orelsan lanzó el álbum 'Civilisation' en 2021, tras una larga ausencia. Este disco ganó varios premios Victoires de la Musique.")
        ),
        BilingualQuestion(
            id = 20010, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel compositeur a écrit 'Le Lac des cygnes' ?", listOf("Tchaïkovski", "Stravinsky", "Prokofiev", "Rimski-Korsakov"), "Musique", "Tchaïkovski a composé Le Lac des cygnes en 1875-1876 pour le ballet du Théâtre Bolchoï à Moscou. C'est l'un des ballets les plus célèbres de l'histoire de la musique classique."),
            en = LocalizedContent("Which composer wrote 'Swan Lake'?", listOf("Tchaikovsky", "Stravinsky", "Prokofiev", "Rimsky-Korsakov"), "Music", "Tchaikovsky composed Swan Lake in 1875-1876 for the ballet of the Bolshoi Theatre in Moscow. It is one of the most famous ballets in classical music history."),
            zh = LocalizedContent("哪位作曲家创作了《天鹅湖》？", listOf("柴可夫斯基", "斯特拉文斯基", "普罗科菲耶夫", "里姆斯基-科萨科夫"), "音乐", "柴可夫斯基于1875-1876年为莫斯科大剧院的芭蕾舞剧创作了《天鹅湖》。它是古典音乐史上最著名的芭蕾舞剧之一。"),
            es = LocalizedContent("¿Qué compositor escribió 'El lago de los cisnes'?", listOf("Chaikovski", "Stravinski", "Prokófiev", "Rimski-Kórsakov"), "Musica", "Chaikovski compuso El lago de los cisnes en 1875-1876 para el ballet del Teatro Bolshói de Moscú. Es uno de los ballets más famosos de la historia de la música clásica.")
        ),
        BilingualQuestion(
            id = 20011, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle note de musique correspond au 'La' de référence ?", listOf("440 Hz", "520 Hz", "380 Hz", "460 Hz"), "Musique", "Le La de référence est fixé à 440 Hz depuis une conférence internationale en 1939, standard adopté pour accorder les instruments de musique."),
            en = LocalizedContent("Which musical note corresponds to the reference 'A'?", listOf("440 Hz", "520 Hz", "380 Hz", "460 Hz"), "Music", "The reference A is set at 440 Hz since an international conference in 1939, a standard adopted for tuning musical instruments."),
            zh = LocalizedContent("哪个音符对应标准音高“A”？", listOf("440赫兹", "520赫兹", "380赫兹", "460赫兹"), "音乐", "自1939年一次国际会议以来，标准音高A被设定为440赫兹，这是用于调音乐器的标准。"),
            es = LocalizedContent("¿Qué nota musical corresponde al 'La' de referencia?", listOf("440 Hz", "520 Hz", "380 Hz", "460 Hz"), "Musica", "El La de referencia se fijó en 440 Hz desde una conferencia internacional en 1939, estándar adoptado para afinar los instrumentos musicales.")
        ),
        BilingualQuestion(
            id = 20012, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel groupe a vendu le plus d'albums dans l'histoire ?", listOf("The Beatles", "Led Zeppelin", "Pink Floyd", "Eagles"), "Musique", "Les Beatles ont vendu plus de 600 millions d'albums dans le monde, un record inégalé grâce à leur popularité massive dans les années 1960 et leur influence durable."),
            en = LocalizedContent("Which band has sold the most albums in history?", listOf("The Beatles", "Led Zeppelin", "Pink Floyd", "Eagles"), "Music", "The Beatles have sold over 600 million albums worldwide, an unmatched record due to their massive popularity in the 1960s and lasting influence."),
            zh = LocalizedContent("历史上哪个乐队专辑销量最高？", listOf("披头士", "齐柏林飞艇", "平克·弗洛伊德", "老鹰乐队"), "音乐", "披头士在全球售出超过6亿张专辑，这一纪录无人能及，得益于他们在1960年代的巨大人气和持久影响力。"),
            es = LocalizedContent("¿Qué banda ha vendido más álbumes en la historia?", listOf("The Beatles", "Led Zeppelin", "Pink Floyd", "Eagles"), "Musica", "The Beatles han vendido más de 600 millones de álbumes en todo el mundo, un récord inigualado gracias a su enorme popularidad en los años 60 y su influencia duradera.")
        ),
        BilingualQuestion(
            id = 20013, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel instrument est surnommé le 'roi des instruments' ?", listOf("L'orgue", "Le piano", "Le violon", "La trompette"), "Musique", "L'orgue est surnommé le « roi des instruments » en raison de sa puissance sonore, de sa complexité mécanique et de son rôle central dans la musique liturgique et classique."),
            en = LocalizedContent("Which instrument is nicknamed the 'king of instruments'?", listOf("Organ", "Piano", "Violin", "Trumpet"), "Music", "The organ is called the 'king of instruments' due to its powerful sound, mechanical complexity, and central role in liturgical and classical music."),
            zh = LocalizedContent("哪种乐器被称为“乐器之王”？", listOf("管风琴", "钢琴", "小提琴", "小号"), "音乐", "管风琴因其强大的音色、机械复杂性以及在宗教和古典音乐中的核心地位而被称为“乐器之王”。"),
            es = LocalizedContent("¿Qué instrumento es apodado el 'rey de los instrumentos'?", listOf("El órgano", "El piano", "El violín", "La trompeta"), "Musica", "El órgano es llamado el 'rey de los instrumentos' por su potencia sonora, complejidad mecánica y papel central en la música litúrgica y clásica.")
        ),
        BilingualQuestion(
            id = 20014, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année est sorti l'album 'Thriller' de Michael Jackson ?", listOf("1982", "1984", "1980", "1986"), "Musique", "L'album 'Thriller' est sorti le 30 novembre 1982, devenant l'album le plus vendu de tous les temps avec des titres comme 'Billie Jean' et 'Beat It'."),
            en = LocalizedContent("In which year was Michael Jackson's album 'Thriller' released?", listOf("1982", "1984", "1980", "1986"), "Music", "The album 'Thriller' was released on November 30, 1982, becoming the best-selling album of all time with hits like 'Billie Jean' and 'Beat It'."),
            zh = LocalizedContent("迈克尔·杰克逊的专辑《Thriller》是哪一年发行的？", listOf("1982", "1984", "1980", "1986"), "音乐", "专辑《Thriller》于1982年11月30日发行，成为有史以来最畅销的专辑，其中包括《Billie Jean》和《Beat It》等热门歌曲。"),
            es = LocalizedContent("¿En qué año se lanzó el álbum 'Thriller' de Michael Jackson?", listOf("1982", "1984", "1980", "1986"), "Musica", "El álbum 'Thriller' se lanzó el 30 de noviembre de 1982, convirtiéndose en el álbum más vendido de todos los tiempos con éxitos como 'Billie Jean' y 'Beat It'.")
        ),
        BilingualQuestion(
            id = 20015, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel musicien a popularisé la guitare électrique ?", listOf("Jimi Hendrix", "Eric Clapton", "Chuck Berry", "B.B. King"), "Musique", "Jimi Hendrix a révolutionné le jeu de la guitare électrique dans les années 1960 avec son style innovant et ses effets sonores, devenant une icône du rock."),
            en = LocalizedContent("Which musician popularized the electric guitar?", listOf("Jimi Hendrix", "Eric Clapton", "Chuck Berry", "B.B. King"), "Music", "Jimi Hendrix revolutionized electric guitar playing in the 1960s with his innovative style and sound effects, becoming a rock icon."),
            zh = LocalizedContent("哪位音乐家普及了电吉他？", listOf("吉米·亨德里克斯", "埃里克·克莱普顿", "查克·贝里", "B.B.金"), "音乐", "吉米·亨德里克斯在1960年代以其创新风格和音效革新了电吉他演奏，成为摇滚偶像。"),
            es = LocalizedContent("¿Qué músico popularizó la guitarra eléctrica?", listOf("Jimi Hendrix", "Eric Clapton", "Chuck Berry", "B.B. King"), "Musica", "Jimi Hendrix revolucionó el toque de la guitarra eléctrica en los años 60 con su estilo innovador y efectos de sonido, convirtiéndose en un icono del rock.")
        ),
        BilingualQuestion(
            id = 20016, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de mouvements a généralement une symphonie classique ?", listOf("4", "3", "5", "2"), "Musique", "La symphonie classique, notamment chez Haydn et Mozart, est structurée en quatre mouvements contrastants : un allegro, un adagio, un menuet ou scherzo, et un finale rapide."),
            en = LocalizedContent("How many movements does a classical symphony typically have?", listOf("4", "3", "5", "2"), "Music", "The classical symphony, especially by Haydn and Mozart, is structured in four contrasting movements: an allegro, an adagio, a minuet or scherzo, and a fast finale."),
            zh = LocalizedContent("古典交响曲通常有几个乐章？", listOf("4", "3", "5", "2"), "音乐", "古典交响曲，尤其是海顿和莫扎特的作品，通常由四个对比鲜明的乐章组成：快板、慢板、小步舞曲或谐谑曲，以及快速的终曲。"),
            es = LocalizedContent("¿Cuántos movimientos tiene generalmente una sinfonía clásica?", listOf("4", "3", "5", "2"), "Musica", "La sinfonía clásica, especialmente en Haydn y Mozart, se estructura en cuatro movimientos contrastantes: un allegro, un adagio, un minueto o scherzo, y un finale rápido.")
        ),
        BilingualQuestion(
            id = 20017, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel DJ français a produit 'Interstella 5555' avec les Daft Punk ?", listOf("Daft Punk eux-mêmes", "David Guetta", "Martin Solveig", "Bob Sinclar"), "Musique", "Le film d'animation Interstella 5555 est une adaptation visuelle de l'album Discovery, produit et réalisé par les Daft Punk eux-mêmes, sans DJ extérieur."),
            en = LocalizedContent("Which French DJ produced 'Interstella 5555' with Daft Punk?", listOf("Daft Punk themselves", "David Guetta", "Martin Solveig", "Bob Sinclar"), "Music", "The animated film Interstella 5555 is a visual adaptation of the album Discovery, produced and directed by Daft Punk themselves, without an external DJ."),
            zh = LocalizedContent("哪位法国DJ与Daft Punk合作制作了《Interstella 5555》？", listOf("Daft Punk本人", "大卫·库塔", "马丁·索尔维格", "鲍勃·辛克拉"), "音乐", "动画电影《Interstella 5555》是专辑《Discovery》的视觉改编版，由Daft Punk亲自制作和导演，没有外部DJ参与。"),
            es = LocalizedContent("¿Qué DJ francés produjo 'Interstella 5555' con Daft Punk?", listOf("Los propios Daft Punk", "David Guetta", "Martin Solveig", "Bob Sinclar"), "Musica", "La película de animación Interstella 5555 es una adaptación visual del álbum Discovery, producida y dirigida por los propios Daft Punk, sin DJ externo.")
        ),
        BilingualQuestion(
            id = 20018, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le vrai nom d'Eminem ?", listOf("Marshall Mathers", "Curtis Jackson", "Andre Young", "Shawn Carter"), "Musique", "Marshall Mathers est le nom de naissance du rappeur, qu'il utilise comme nom de scène dans son album The Marshall Mathers LP."),
            en = LocalizedContent("What is Eminem's real name?", listOf("Marshall Mathers", "Curtis Jackson", "Andre Young", "Shawn Carter"), "Music", "Marshall Mathers is the rapper's birth name, which he uses as a stage name in his album The Marshall Mathers LP."),
            zh = LocalizedContent("埃米纳姆的真名是什么？", listOf("马歇尔·马瑟斯", "柯蒂斯·杰克逊", "安德烈·杨", "肖恩·卡特"), "音乐", "马歇尔·马瑟斯是这位说唱歌手的本名，他在专辑《The Marshall Mathers LP》中将其用作艺名。"),
            es = LocalizedContent("¿Cuál es el nombre real de Eminem?", listOf("Marshall Mathers", "Curtis Jackson", "Andre Young", "Shawn Carter"), "Musica", "Marshall Mathers es el nombre de nacimiento del rapero, que utiliza como nombre artístico en su álbum The Marshall Mathers LP.")
        ),
        BilingualQuestion(
            id = 20019, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel opéra commence par 'La donna è mobile' ?", listOf("Rigoletto", "La Traviata", "Aida", "Carmen"), "Musique", "Cet air célèbre est chanté par le duc de Mantoue dans l'acte III de Rigoletto, opéra de Giuseppe Verdi créé en 1851."),
            en = LocalizedContent("Which opera begins with 'La donna è mobile'?", listOf("Rigoletto", "La Traviata", "Aida", "Carmen"), "Music", "This famous aria is sung by the Duke of Mantua in Act III of Rigoletto, an opera by Giuseppe Verdi premiered in 1851."),
            zh = LocalizedContent("哪部歌剧以《女人善变》开头？", listOf("弄臣", "茶花女", "阿依达", "卡门"), "音乐", "这首著名的咏叹调由曼图亚公爵在歌剧《弄臣》第三幕中演唱，该歌剧由朱塞佩·威尔第创作，于1851年首演。"),
            es = LocalizedContent("¿Qué ópera comienza con 'La donna è mobile'?", listOf("Rigoletto", "La Traviata", "Aida", "Carmen"), "Musica", "Esta famosa aria es cantada por el duque de Mantua en el acto III de Rigoletto, ópera de Giuseppe Verdi estrenada en 1851.")
        ),
        BilingualQuestion(
            id = 20020, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a inventé le karaoké ?", listOf("Le Japon", "La Corée du Sud", "Les États-Unis", "Les Philippines"), "Musique", "Le karaoké a été inventé par le musicien japonais Daisuke Inoue en 1971 à Kobe, au Japon."),
            en = LocalizedContent("Which country invented karaoke?", listOf("Japan", "South Korea", "United States", "Philippines"), "Music", "Karaoke was invented by Japanese musician Daisuke Inoue in 1971 in Kobe, Japan."),
            zh = LocalizedContent("哪个国家发明了卡拉OK？", listOf("日本", "韩国", "美国", "菲律宾"), "音乐", "卡拉OK由日本音乐家井上大佑于1971年在日本神户发明。"),
            es = LocalizedContent("¿Qué país inventó el karaoke?", listOf("Japón", "Corea del Sur", "Estados Unidos", "Filipinas"), "Musica", "El karaoke fue inventado por el músico japonés Daisuke Inoue en 1971 en Kobe, Japón.")
        ),
        BilingualQuestion(
            id = 20021, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle chanteuse est surnommée 'Queen B' ?", listOf("Beyoncé", "Britney Spears", "Billie Eilish", "Barbara Streisand"), "Musique", "Beyoncé est souvent appelée Queen B par ses fans et les médias, un surnom qui reflète son statut d'icône mondiale de la musique pop et R&B."),
            en = LocalizedContent("Which singer is nicknamed 'Queen B'?", listOf("Beyoncé", "Britney Spears", "Billie Eilish", "Barbra Streisand"), "Music", "Beyoncé is often called Queen B by her fans and the media, a nickname reflecting her status as a global pop and R&B icon."),
            zh = LocalizedContent("哪位歌手被称为“Queen B”？", listOf("碧昂丝", "布兰妮·斯皮尔斯", "比莉·艾利什", "芭芭拉·史翠珊"), "音乐", "碧昂丝常被粉丝和媒体称为Queen B，这个昵称反映了她在全球流行和R&B音乐界的偶像地位。"),
            es = LocalizedContent("¿Qué cantante es apodada 'Queen B'?", listOf("Beyoncé", "Britney Spears", "Billie Eilish", "Barbra Streisand"), "Musica", "Beyoncé es a menudo llamada Queen B por sus fans y los medios, un apodo que refleja su estatus como icono mundial de la música pop y R&B.")
        ),
        BilingualQuestion(
            id = 20022, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel instrument est à la base du reggae ?", listOf("La guitare basse", "La batterie", "Le piano", "Le saxophone"), "Musique", "La guitare basse est l'instrument fondamental du reggae car elle assure la ligne rythmique et mélodique principale, souvent en contrepoint avec la batterie, créant le groove caractéristique du genre."),
            en = LocalizedContent("Which instrument is the basis of reggae?", listOf("Bass guitar", "Drums", "Piano", "Saxophone"), "Music", "The bass guitar is the fundamental instrument of reggae as it provides the main rhythmic and melodic line, often in counterpoint with the drums, creating the characteristic groove of the genre."),
            zh = LocalizedContent("哪种乐器是雷鬼音乐的基础？", listOf("低音吉他", "鼓", "钢琴", "萨克斯管"), "音乐", "低音吉他是雷鬼音乐的基础乐器，因为它提供主要的节奏和旋律线，通常与鼓形成对位，创造出该流派特有的律动。"),
            es = LocalizedContent("¿Qué instrumento es la base del reggae?", listOf("El bajo", "La batería", "El piano", "El saxofón"), "Música", "El bajo es el instrumento fundamental del reggae, ya que proporciona la línea rítmica y melódica principal, a menudo en contrapunto con la batería, creando el groove característico del género.")
        ),
        BilingualQuestion(
            id = 20023, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("De quel pays vient le fado ?", listOf("Le Portugal", "L'Espagne", "Le Brésil", "L'Italie"), "Musique", "Le fado est un genre musical traditionnel portugais, reconnu comme patrimoine culturel immatériel de l'humanité par l'UNESCO."),
            en = LocalizedContent("Which country does fado come from?", listOf("Portugal", "Spain", "Brazil", "Italy"), "Music", "Fado is a traditional Portuguese music genre, recognized as an intangible cultural heritage of humanity by UNESCO."),
            zh = LocalizedContent("法朵音乐来自哪个国家？", listOf("葡萄牙", "西班牙", "巴西", "意大利"), "音乐", "法朵是葡萄牙的传统音乐流派，被联合国教科文组织认定为人类非物质文化遗产。"),
            es = LocalizedContent("¿De qué país proviene el fado?", listOf("Portugal", "España", "Brasil", "Italia"), "Música", "El fado es un género musical tradicional portugués, reconocido como patrimonio cultural inmaterial de la humanidad por la UNESCO.")
        ),
        BilingualQuestion(
            id = 20025, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel artiste a chanté 'Imagine' ?", listOf("John Lennon", "Paul McCartney", "Bob Dylan", "Elton John"), "Musique", "John Lennon a écrit et interprété 'Imagine' en 1971, une chanson devenue un hymne mondial pour la paix."),
            en = LocalizedContent("Which artist sang 'Imagine'?", listOf("John Lennon", "Paul McCartney", "Bob Dylan", "Elton John"), "Music", "John Lennon wrote and performed 'Imagine' in 1971, a song that became a global anthem for peace."),
            zh = LocalizedContent("哪位艺术家演唱了《想象》？", listOf("约翰·列侬", "保罗·麦卡特尼", "鲍勃·迪伦", "埃尔顿·约翰"), "音乐", "约翰·列侬于1971年创作并演唱了《想象》，这首歌成为全球和平的颂歌。"),
            es = LocalizedContent("¿Qué artista cantó 'Imagine'?", listOf("John Lennon", "Paul McCartney", "Bob Dylan", "Elton John"), "Música", "John Lennon escribió e interpretó 'Imagine' en 1971, una canción que se convirtió en un himno mundial por la paz.")
        ),
        BilingualQuestion(
            id = 20026, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Comment s'appelle la technique de chant sans paroles utilisée en jazz ?", listOf("Le scat", "Le beatbox", "Le yodel", "Le falsetto"), "Musique", "Le scat est une technique vocale jazz où le chanteur improvise des syllabes et des sons sans signification, popularisée par des artistes comme Louis Armstrong."),
            en = LocalizedContent("What is the name of the wordless singing technique used in jazz?", listOf("Scat", "Beatbox", "Yodel", "Falsetto"), "Music", "Scat is a jazz vocal technique where the singer improvises meaningless syllables and sounds, popularized by artists like Louis Armstrong."),
            zh = LocalizedContent("爵士乐中使用的无词演唱技巧叫什么？", listOf("拟声唱法", "节奏口技", "约德尔唱法", "假声"), "音乐", "拟声唱法是一种爵士声乐技巧，歌手即兴演唱无意义的音节和声音，由路易斯·阿姆斯特朗等艺术家推广。"),
            es = LocalizedContent("¿Cómo se llama la técnica de canto sin palabras utilizada en el jazz?", listOf("Scat", "Beatbox", "Yodel", "Falsete"), "Música", "El scat es una técnica vocal de jazz en la que el cantante improvisa sílabas y sonidos sin significado, popularizada por artistas como Louis Armstrong.")
        ),
        BilingualQuestion(
            id = 20027, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien instrument de musique connu ?", listOf("La flûte en os", "Le tambour", "La lyre", "La corne"), "Musique", "La flûte en os, découverte dans des grottes en Allemagne, date d'environ 40 000 ans et a été fabriquée par l'homme de Néandertal."),
            en = LocalizedContent("What is the oldest known musical instrument?", listOf("Bone flute", "Drum", "Lyre", "Horn"), "Music", "The bone flute, discovered in caves in Germany, dates back about 40,000 years and was made by Neanderthals."),
            zh = LocalizedContent("已知最古老的乐器是什么？", listOf("骨笛", "鼓", "里拉琴", "号角"), "音乐", "在德国洞穴中发现的骨笛约有4万年历史，由尼安德特人制作。"),
            es = LocalizedContent("¿Cuál es el instrumento musical más antiguo conocido?", listOf("Flauta de hueso", "Tambor", "Lira", "Cuerno"), "Música", "La flauta de hueso, descubierta en cuevas de Alemania, data de hace unos 40.000 años y fue fabricada por neandertales.")
        ),
        BilingualQuestion(
            id = 20028, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur russe a écrit 'L'Oiseau de feu' ?", listOf("Igor Stravinsky", "Sergueï Rachmaninov", "Dmitri Chostakovitch", "Sergueï Prokofiev"), "Musique", "Igor Stravinsky a composé L'Oiseau de feu en 1910 pour les Ballets russes de Diaghilev, ce qui l'a rendu célèbre du jour au lendemain."),
            en = LocalizedContent("Which Russian composer wrote 'The Firebird'?", listOf("Igor Stravinsky", "Sergei Rachmaninoff", "Dmitri Shostakovich", "Sergei Prokofiev"), "Music", "Igor Stravinsky composed The Firebird in 1910 for Diaghilev's Ballets Russes, which made him famous overnight."),
            zh = LocalizedContent("哪位俄罗斯作曲家创作了《火鸟》？", listOf("伊戈尔·斯特拉文斯基", "谢尔盖·拉赫玛尼诺夫", "德米特里·肖斯塔科维奇", "谢尔盖·普罗科菲耶夫"), "音乐", "伊戈尔·斯特拉文斯基于1910年为佳吉列夫的俄罗斯芭蕾舞团创作了《火鸟》，这使他一夜成名。"),
            es = LocalizedContent("¿Qué compositor ruso escribió 'El pájaro de fuego'?", listOf("Igor Stravinsky", "Serguéi Rajmáninov", "Dmitri Shostakóvich", "Serguéi Prokófiev"), "Música", "Igor Stravinsky compuso El pájaro de fuego en 1910 para los Ballets Rusos de Diáguilev, lo que le hizo famoso de la noche a la mañana.")
        ),
        BilingualQuestion(
            id = 20029, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel festival de musique se tient à Glastonbury ?", listOf("Un festival de rock et pop", "Un festival de jazz", "Un festival de classique", "Un festival d'opéra"), "Musique", "Le festival de Glastonbury, créé en 1970, est principalement dédié au rock et à la pop, bien qu'il inclue aussi d'autres genres musicaux."),
            en = LocalizedContent("What music festival is held at Glastonbury?", listOf("A rock and pop festival", "A jazz festival", "A classical festival", "An opera festival"), "Music", "The Glastonbury Festival, founded in 1970, is primarily a rock and pop festival, though it also includes other music genres."),
            zh = LocalizedContent("格拉斯顿伯里举办什么音乐节？", listOf("摇滚和流行音乐节", "爵士音乐节", "古典音乐节", "歌剧节"), "音乐", "格拉斯顿伯里音乐节始于1970年，主要是摇滚和流行音乐节，但也包括其他音乐类型。"),
            es = LocalizedContent("¿Qué festival de música se celebra en Glastonbury?", listOf("Un festival de rock y pop", "Un festival de jazz", "Un festival de música clásica", "Un festival de ópera"), "Música", "El Festival de Glastonbury, fundado en 1970, es principalmente un festival de rock y pop, aunque también incluye otros géneros musicales.")
        ),
        BilingualQuestion(
            id = 20030, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la tessiture vocale la plus grave chez l'homme ?", listOf("Basse", "Baryton", "Ténor", "Contre-ténor"), "Musique", "La basse est la voix masculine la plus grave, située en dessous du baryton et du ténor."),
            en = LocalizedContent("What is the lowest vocal range in men?", listOf("Bass", "Baritone", "Tenor", "Countertenor"), "Music", "Bass is the lowest male voice, below baritone and tenor."),
            zh = LocalizedContent("男性最低的音域是什么？", listOf("男低音", "男中音", "男高音", "假声男高音"), "音乐", "男低音是最低的男性嗓音，低于男中音和男高音。"),
            es = LocalizedContent("¿Cuál es el rango vocal más grave en los hombres?", listOf("Bajo", "Barítono", "Tenor", "Contratenor"), "Música", "El bajo es la voz masculina más grave, por debajo del barítono y el tenor.")
        ),
        BilingualQuestion(
            id = 20031, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe a chanté 'Stairway to Heaven' ?", listOf("Led Zeppelin", "Pink Floyd", "Deep Purple", "Black Sabbath"), "Musique", "Led Zeppelin a sorti ce morceau emblématique en 1971 sur l'album Led Zeppelin IV, devenu l'un des titres les plus célèbres du rock."),
            en = LocalizedContent("Which band sang 'Stairway to Heaven'?", listOf("Led Zeppelin", "Pink Floyd", "Deep Purple", "Black Sabbath"), "Music", "Led Zeppelin released this iconic track in 1971 on the album Led Zeppelin IV, becoming one of the most famous rock songs."),
            zh = LocalizedContent("哪个乐队演唱了《天堂的阶梯》？", listOf("齐柏林飞艇", "平克·弗洛伊德", "深紫", "黑色安息日"), "音乐", "齐柏林飞艇于1971年在专辑《Led Zeppelin IV》中发布了这首标志性曲目，成为最著名的摇滚歌曲之一。"),
            es = LocalizedContent("¿Qué banda cantó 'Stairway to Heaven'?", listOf("Led Zeppelin", "Pink Floyd", "Deep Purple", "Black Sabbath"), "Música", "Led Zeppelin lanzó este tema icónico en 1971 en el álbum Led Zeppelin IV, convirtiéndose en una de las canciones de rock más famosas.")
        ),
        BilingualQuestion(
            id = 20032, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la gamme pentatonique ?", listOf("Une gamme à 5 notes", "Une gamme à 7 notes", "Une gamme à 12 notes", "Une gamme à 3 notes"), "Musique", "Le terme \"pentatonique\" vient du grec \"penta\" (cinq) et \"tonos\" (ton), désignant une gamme musicale composée de cinq notes par octave, contrairement aux gammes heptatoniques classiques à sept notes."),
            en = LocalizedContent("What is the pentatonic scale?", listOf("A 5-note scale", "A 7-note scale", "A 12-note scale", "A 3-note scale"), "Music", "The term 'pentatonic' comes from Greek 'penta' (five) and 'tonos' (tone), referring to a musical scale with five notes per octave, unlike the classical heptatonic scales with seven notes."),
            zh = LocalizedContent("什么是五声音阶？", listOf("5个音的音阶", "7个音的音阶", "12个音的音阶", "3个音的音阶"), "音乐", "“五声”一词源自希腊语“penta”（五）和“tonos”（音），指每八度有五个音的音阶，不同于经典的七声音阶。"),
            es = LocalizedContent("¿Qué es la escala pentatónica?", listOf("Una escala de 5 notas", "Una escala de 7 notas", "Una escala de 12 notas", "Una escala de 3 notas"), "Música", "El término 'pentatónica' proviene del griego 'penta' (cinco) y 'tonos' (tono), refiriéndose a una escala musical de cinco notas por octava, a diferencia de las escalas heptatónicas clásicas de siete notas.")
        ),
        BilingualQuestion(
            id = 20033, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel chanteur français est l'interprète de 'Ne me quitte pas' ?", listOf("Jacques Brel", "Édith Piaf", "Georges Brassens", "Léo Ferré"), "Musique", "Jacques Brel a écrit et interprété 'Ne me quitte pas' en 1959, une chanson devenue un classique de la chanson francophone."),
            en = LocalizedContent("Which French singer performed 'Ne me quitte pas'?", listOf("Jacques Brel", "Édith Piaf", "Georges Brassens", "Léo Ferré"), "Music", "Jacques Brel wrote and performed 'Ne me quitte pas' in 1959, a song that became a classic of French-language music."),
            zh = LocalizedContent("哪位法国歌手演唱了《Ne me quitte pas》？", listOf("雅克·布雷尔", "伊迪丝·琵雅芙", "乔治·布拉桑", "莱奥·费雷"), "音乐", "雅克·布雷尔于1959年创作并演唱了《Ne me quitte pas》，这首歌成为法语歌曲的经典之作。"),
            es = LocalizedContent("¿Qué cantante francés interpretó 'Ne me quitte pas'?", listOf("Jacques Brel", "Édith Piaf", "Georges Brassens", "Léo Ferré"), "Música", "Jacques Brel escribió e interpretó 'Ne me quitte pas' en 1959, una canción que se convirtió en un clásico de la canción francófona.")
        ),
        BilingualQuestion(
            id = 20034, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom de la famille d'instruments à laquelle appartient le tuba ?", listOf("Les cuivres", "Les bois", "Les cordes", "Les percussions"), "Musique", "Le tuba est un instrument à vent en métal dont le son est produit par la vibration des lèvres dans une embouchure, ce qui le classe dans la famille des cuivres."),
            en = LocalizedContent("What is the name of the instrument family to which the tuba belongs?", listOf("Brass", "Woodwinds", "Strings", "Percussion"), "Music", "The tuba is a metal wind instrument whose sound is produced by the vibration of the lips in a mouthpiece, classifying it in the brass family."),
            zh = LocalizedContent("大号属于哪一类乐器家族？", listOf("铜管乐器", "木管乐器", "弦乐器", "打击乐器"), "音乐", "大号是一种金属管乐器，声音通过嘴唇在吹嘴中振动产生，因此属于铜管乐器家族。"),
            es = LocalizedContent("¿Cuál es el nombre de la familia de instrumentos a la que pertenece la tuba?", listOf("Los metales", "Las maderas", "Las cuerdas", "La percusión"), "Música", "La tuba es un instrumento de viento metálico cuyo sonido se produce por la vibración de los labios en una boquilla, lo que la clasifica en la familia de los metales.")
        ),
        BilingualQuestion(
            id = 20035, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel DJ suédois, décédé en 2018, était connu pour 'Levels' ?", listOf("Avicii", "Swedish House Mafia", "Alesso", "Zedd"), "Musique", "Avicii, de son vrai nom Tim Bergling, a popularisé la musique électronique avec son tube 'Levels' en 2011, avant de se suicider en 2018 à 28 ans."),
            en = LocalizedContent("Which Swedish DJ, who died in 2018, was known for 'Levels'?", listOf("Avicii", "Swedish House Mafia", "Alesso", "Zedd"), "Music", "Avicii, real name Tim Bergling, popularized electronic music with his hit 'Levels' in 2011, before committing suicide in 2018 at age 28."),
            zh = LocalizedContent("哪位瑞典DJ于2018年去世，以《Levels》闻名？", listOf("艾维奇", "瑞典浩室黑手党", "阿莱索", "捷德"), "音乐", "艾维奇，本名蒂姆·伯格林，凭借2011年的热门歌曲《Levels》推广了电子音乐，后于2018年自杀，年仅28岁。"),
            es = LocalizedContent("¿Qué DJ sueco, fallecido en 2018, era conocido por 'Levels'?", listOf("Avicii", "Swedish House Mafia", "Alesso", "Zedd"), "Música", "Avicii, cuyo nombre real era Tim Bergling, popularizó la música electrónica con su éxito 'Levels' en 2011, antes de suicidarse en 2018 a los 28 años.")
        ),
        BilingualQuestion(
            id = 20036, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la clé la plus utilisée en musique classique ?", listOf("Clé de sol", "Clé de fa", "Clé d'ut", "Clé de ré"), "Musique", "La clé de sol est la plus courante car elle permet de noter les notes aiguës, utilisées par la majorité des instruments (violon, flûte, main droite du piano) et des voix féminines."),
            en = LocalizedContent("What is the most commonly used clef in classical music?", listOf("Treble clef", "Bass clef", "Alto clef", "Tenor clef"), "Music", "The treble clef is the most common because it allows notation of high notes, used by most instruments (violin, flute, right hand of piano) and female voices."),
            zh = LocalizedContent("古典音乐中最常用的谱号是什么？", listOf("高音谱号", "低音谱号", "中音谱号", "次中音谱号"), "音乐", "高音谱号最为常见，因为它可以记录高音，被大多数乐器（小提琴、长笛、钢琴右手）和女声使用。"),
            es = LocalizedContent("¿Cuál es la clave más utilizada en la música clásica?", listOf("Clave de sol", "Clave de fa", "Clave de do", "Clave de re"), "Música", "La clave de sol es la más común porque permite anotar las notas agudas, utilizadas por la mayoría de los instrumentos (violín, flauta, mano derecha del piano) y las voces femeninas.")
        ),
        BilingualQuestion(
            id = 20037, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel rappeur américain a sorti 'The Slim Shady LP' ?", listOf("Eminem", "Jay-Z", "Nas", "50 Cent"), "Musique", "Eminem a sorti 'The Slim Shady LP' en 1999, son premier album sur un label majeur, qui a lancé sa carrière avec le personnage provocateur de Slim Shady."),
            en = LocalizedContent("Which American rapper released 'The Slim Shady LP'?", listOf("Eminem", "Jay-Z", "Nas", "50 Cent"), "Music", "Eminem released 'The Slim Shady LP' in 1999, his first album on a major label, which launched his career with the provocative Slim Shady persona."),
            zh = LocalizedContent("哪位美国说唱歌手发行了《The Slim Shady LP》？", listOf("埃米纳姆", "Jay-Z", "纳斯", "50美分"), "音乐", "埃米纳姆于1999年发行了《The Slim Shady LP》，这是他签约大厂牌后的首张专辑，凭借挑衅性的Slim Shady角色开启了他的职业生涯。"),
            es = LocalizedContent("¿Qué rapero estadounidense lanzó 'The Slim Shady LP'?", listOf("Eminem", "Jay-Z", "Nas", "50 Cent"), "Música", "Eminem lanzó 'The Slim Shady LP' en 1999, su primer álbum en un sello importante, que lanzó su carrera con el provocador personaje de Slim Shady.")
        ),
        BilingualQuestion(
            id = 20038, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel instrument africain est un piano à pouces ?", listOf("Le kalimba (mbira)", "Le djembé", "Le balafon", "La kora"), "Musique", "Le kalimba, aussi appelé mbira, est un instrument à lamelles pincées avec les pouces, originaire d'Afrique subsaharienne, où il est utilisé dans les traditions musicales et spirituelles."),
            en = LocalizedContent("Which African instrument is a thumb piano?", listOf("Kalimba (mbira)", "Djembe", "Balafon", "Kora"), "Music", "The kalimba, also called mbira, is a lamellophone played with the thumbs, originating from sub-Saharan Africa, where it is used in musical and spiritual traditions."),
            zh = LocalizedContent("哪种非洲乐器是拇指钢琴？", listOf("卡林巴（姆比拉）", "金贝鼓", "巴拉风", "科拉琴"), "音乐", "卡林巴，也称为姆比拉，是一种用拇指拨动弹片的乐器，起源于撒哈拉以南非洲，用于音乐和精神传统。"),
            es = LocalizedContent("¿Qué instrumento africano es un piano de pulgares?", listOf("El kalimba (mbira)", "El djembe", "El balafón", "La kora"), "Música", "El kalimba, también llamado mbira, es un instrumento de láminas pulsadas con los pulgares, originario del África subsahariana, donde se utiliza en tradiciones musicales y espirituales.")
        ),
        BilingualQuestion(
            id = 20039, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel compositeur a écrit l'Hymne à la Joie ?", listOf("Beethoven", "Mozart", "Haydn", "Schubert"), "Musique", "L'Hymne à la Joie est le dernier mouvement de la Neuvième Symphonie de Beethoven, composée en 1824, et est devenu l'hymne officiel de l'Union européenne."),
            en = LocalizedContent("Which composer wrote the 'Ode to Joy'?", listOf("Beethoven", "Mozart", "Haydn", "Schubert"), "Music", "The 'Ode to Joy' is the final movement of Beethoven's Ninth Symphony, composed in 1824, and became the official anthem of the European Union."),
            zh = LocalizedContent("哪位作曲家创作了《欢乐颂》？", listOf("贝多芬", "莫扎特", "海顿", "舒伯特"), "音乐", "《欢乐颂》是贝多芬第九交响曲的终乐章，创作于1824年，后来成为欧盟的官方盟歌。"),
            es = LocalizedContent("¿Qué compositor escribió el 'Himno a la Alegría'?", listOf("Beethoven", "Mozart", "Haydn", "Schubert"), "Música", "El 'Himno a la Alegría' es el último movimiento de la Novena Sinfonía de Beethoven, compuesta en 1824, y se convirtió en el himno oficial de la Unión Europea.")
        ),
        BilingualQuestion(
            id = 20040, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle chanteuse a interprété 'La Vie en rose' ?", listOf("Édith Piaf", "Dalida", "Mireille Mathieu", "Barbara"), "Musique", "Édith Piaf a popularisé cette chanson en 1946, dont elle a écrit les paroles. C'est devenu l'un de ses titres emblématiques et un standard de la chanson française."),
            en = LocalizedContent("Which singer performed 'La Vie en rose'?", listOf("Édith Piaf", "Dalida", "Mireille Mathieu", "Barbara"), "Music", "Édith Piaf popularized this song in 1946, for which she wrote the lyrics. It became one of her signature songs and a standard of French chanson."),
            zh = LocalizedContent("哪位歌手演唱了《La Vie en rose》？", listOf("伊迪丝·琵雅芙", "达丽达", "米雷耶·马蒂厄", "芭芭拉"), "音乐", "伊迪丝·琵雅芙于1946年推广了这首歌，她亲自作词。这首歌成为她的标志性曲目之一，也是法国香颂的经典。"),
            es = LocalizedContent("¿Qué cantante interpretó 'La Vie en rose'?", listOf("Édith Piaf", "Dalida", "Mireille Mathieu", "Barbara"), "Música", "Édith Piaf popularizó esta canción en 1946, de la que escribió la letra. Se convirtió en uno de sus temas emblemáticos y un estándar de la canción francesa.")
        ),
        BilingualQuestion(
            id = 20041, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel genre musical est caractérisé par le 'drop' ?", listOf("L'EDM (musique électronique)", "Le jazz", "Le blues", "Le classique"), "Musique", "Dans l'EDM, le 'drop' désigne le moment où le rythme et la mélodie atteignent leur intensité maximale après une montée progressive, un élément clé du genre."),
            en = LocalizedContent("Which music genre is characterized by the 'drop'?", listOf("EDM (electronic music)", "Jazz", "Blues", "Classical"), "Music", "In EDM, the 'drop' refers to the moment when the rhythm and melody reach their maximum intensity after a gradual build-up, a key element of the genre."),
            zh = LocalizedContent("哪种音乐类型以“drop”为特征？", listOf("电子舞曲（电子音乐）", "爵士乐", "蓝调", "古典音乐"), "音乐", "在电子舞曲中，“drop”指的是节奏和旋律在逐渐上升后达到最大强度的时刻，是该类型的关键元素。"),
            es = LocalizedContent("¿Qué género musical se caracteriza por el 'drop'?", listOf("EDM (música electrónica)", "Jazz", "Blues", "Clásica"), "Música", "En el EDM, el 'drop' se refiere al momento en que el ritmo y la melodía alcanzan su máxima intensidad después de una subida gradual, un elemento clave del género.")
        ),
        BilingualQuestion(
            id = 20042, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel artiste a peint en écoutant du jazz, donnant naissance au terme 'jazz painting' ?", listOf("Piet Mondrian", "Pablo Picasso", "Henri Matisse", "Jackson Pollock"), "Musique", "Piet Mondrian, fasciné par le jazz et le boogie-woogie, a créé des toiles comme Broadway Boogie-Woogie, où les rythmes syncopés ont inspiré ses compositions géométriques, popularisant ainsi le terme jazz painting."),
            en = LocalizedContent("Which artist painted while listening to jazz, giving rise to the term 'jazz painting'?", listOf("Piet Mondrian", "Pablo Picasso", "Henri Matisse", "Jackson Pollock"), "Music", "Piet Mondrian, fascinated by jazz and boogie-woogie, created canvases like Broadway Boogie-Woogie, where syncopated rhythms inspired his geometric compositions, thus popularizing the term jazz painting."),
            zh = LocalizedContent("哪位艺术家在听爵士乐时作画，从而产生了“爵士绘画”一词？", listOf("皮特·蒙德里安", "巴勃罗·毕加索", "亨利·马蒂斯", "杰克逊·波洛克"), "音乐", "皮特·蒙德里安对爵士乐和布吉伍吉音乐着迷，创作了如《百老汇布吉伍吉》等画作，其中切分节奏启发了几何构图，从而推广了“爵士绘画”一词。"),
            es = LocalizedContent("¿Qué artista pintó mientras escuchaba jazz, dando origen al término 'jazz painting'?", listOf("Piet Mondrian", "Pablo Picasso", "Henri Matisse", "Jackson Pollock"), "Música", "Piet Mondrian, fascinado por el jazz y el boogie-woogie, creó lienzos como Broadway Boogie-Woogie, donde los ritmos sincopados inspiraron sus composiciones geométricas, popularizando así el término jazz painting.")
        ),
        BilingualQuestion(
            id = 20043, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de dièses a la tonalité de Sol majeur ?", listOf("1", "2", "3", "0"), "Musique", "La tonalité de Sol majeur comporte un dièse, le fa dièse, car elle suit le cycle des quintes où le sol est la quinte de do majeur."),
            en = LocalizedContent("How many sharps does the key of G major have?", listOf("1", "2", "3", "0"), "Music", "The key of G major has one sharp, F-sharp, as it follows the circle of fifths where G is the fifth of C major."),
            zh = LocalizedContent("G大调有几个升号？", listOf("1", "2", "3", "0"), "音乐", "G大调有一个升号，即升F，因为它遵循五度循环，G是C大调的五度音。"),
            es = LocalizedContent("¿Cuántos sostenidos tiene la tonalidad de Sol mayor?", listOf("1", "2", "3", "0"), "Música", "La tonalidad de Sol mayor tiene un sostenido, fa sostenido, ya que sigue el ciclo de quintas donde Sol es la quinta de Do mayor.")
        ),
        BilingualQuestion(
            id = 20044, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel groupe de K-pop a battu des records sur YouTube ?", listOf("BTS", "BLACKPINK", "EXO", "TWICE"), "Musique", "BTS détient plusieurs records sur YouTube, notamment celui de la vidéo la plus visionnée en 24 heures avec \"Butter\"."),
            en = LocalizedContent("Which K-pop group broke records on YouTube?", listOf("BTS", "BLACKPINK", "EXO", "TWICE"), "Music", "BTS holds several YouTube records, including the most-viewed video in 24 hours with \"Butter\"."),
            zh = LocalizedContent("哪个K-pop组合在YouTube上打破了纪录？", listOf("BTS", "BLACKPINK", "EXO", "TWICE"), "音乐", "BTS在YouTube上拥有多项纪录，包括凭借《Butter》创下的24小时内观看次数最多的视频。"),
            es = LocalizedContent("¿Qué grupo de K-pop rompió récords en YouTube?", listOf("BTS", "BLACKPINK", "EXO", "TWICE"), "Música", "BTS tiene varios récords en YouTube, incluido el video más visto en 24 horas con \"Butter\".")
        ),
        BilingualQuestion(
            id = 20045, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le tempo d'un Allegro ?", listOf("120-156 BPM", "60-80 BPM", "40-60 BPM", "80-108 BPM"), "Musique", "Allegro est un terme musical italien indiquant un tempo rapide et vif, généralement situé entre 120 et 156 battements par minute (BPM)."),
            en = LocalizedContent("What is the tempo of an Allegro?", listOf("120-156 BPM", "60-80 BPM", "40-60 BPM", "80-108 BPM"), "Music", "Allegro is an Italian musical term indicating a fast and lively tempo, typically between 120 and 156 beats per minute (BPM)."),
            zh = LocalizedContent("快板（Allegro）的速度是多少？", listOf("120-156 BPM", "60-80 BPM", "40-60 BPM", "80-108 BPM"), "音乐", "快板是一个意大利音乐术语，表示快速活泼的速度，通常在每分钟120到156拍之间。"),
            es = LocalizedContent("¿Cuál es el tempo de un Allegro?", listOf("120-156 BPM", "60-80 BPM", "40-60 BPM", "80-108 BPM"), "Música", "Allegro es un término musical italiano que indica un tempo rápido y vivo, generalmente entre 120 y 156 pulsaciones por minuto (BPM).")
        ),
        BilingualQuestion(
            id = 20046, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel instrument utilise un anche double ?", listOf("Le hautbois", "La clarinette", "La flûte traversière", "Le saxophone"), "Musique", "Le hautbois utilise une anche double, composée de deux lamelles de roseau qui vibrent l'une contre l'autre, contrairement aux anches simples comme celle de la clarinette."),
            en = LocalizedContent("Which instrument uses a double reed?", listOf("Oboe", "Clarinet", "Flute", "Saxophone"), "Music", "The oboe uses a double reed, consisting of two blades of cane that vibrate against each other, unlike single reeds such as that of the clarinet."),
            zh = LocalizedContent("哪种乐器使用双簧片？", listOf("双簧管", "单簧管", "长笛", "萨克斯管"), "音乐", "双簧管使用双簧片，由两片芦苇片相互振动发声，与单簧管等单簧片乐器不同。"),
            es = LocalizedContent("¿Qué instrumento utiliza una caña doble?", listOf("El oboe", "El clarinete", "La flauta travesera", "El saxofón"), "Música", "El oboe utiliza una caña doble, compuesta por dos láminas de caña que vibran entre sí, a diferencia de las cañas simples como la del clarinete.")
        ),
        BilingualQuestion(
            id = 20047, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel chanteur a popularisé le reggaeton ?", listOf("Daddy Yankee", "Bad Bunny", "J Balvin", "Maluma"), "Musique", "Daddy Yankee est largement considéré comme le pionnier du reggaeton moderne, notamment grâce à son tube international \"Gasolina\" en 2004."),
            en = LocalizedContent("Which singer popularized reggaeton?", listOf("Daddy Yankee", "Bad Bunny", "J Balvin", "Maluma"), "Music", "Daddy Yankee is widely considered the pioneer of modern reggaeton, especially with his international hit \"Gasolina\" in 2004."),
            zh = LocalizedContent("哪位歌手推广了雷鬼动（reggaeton）？", listOf("洋基老爹", "坏痞兔", "J·巴尔文", "马鲁马"), "音乐", "洋基老爹被广泛认为是现代雷鬼动的先驱，尤其是他2004年的国际热门歌曲《Gasolina》。"),
            es = LocalizedContent("¿Qué cantante popularizó el reguetón?", listOf("Daddy Yankee", "Bad Bunny", "J Balvin", "Maluma"), "Música", "Daddy Yankee es ampliamente considerado el pionero del reguetón moderno, especialmente con su éxito internacional \"Gasolina\" en 2004.")
        ),
        BilingualQuestion(
            id = 20048, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la durée d'une ronde en musique ?", listOf("4 temps", "2 temps", "1 temps", "8 temps"), "Musique", "La ronde est la figure de note la plus longue utilisée dans la musique mesurée, et sa durée standard est de quatre temps dans une mesure à 4/4."),
            en = LocalizedContent("What is the duration of a whole note in music?", listOf("4 beats", "2 beats", "1 beat", "8 beats"), "Music", "The whole note is the longest note value commonly used in measured music, and its standard duration is four beats in 4/4 time."),
            zh = LocalizedContent("全音符在音乐中的时值是多少？", listOf("4拍", "2拍", "1拍", "8拍"), "音乐", "全音符是常用音符中最长的，在4/4拍中标准时值为四拍。"),
            es = LocalizedContent("¿Cuál es la duración de una redonda en música?", listOf("4 tiempos", "2 tiempos", "1 tiempo", "8 tiempos"), "Música", "La redonda es la figura de nota más larga utilizada en la música medida, y su duración estándar es de cuatro tiempos en un compás de 4/4.")
        ),
        BilingualQuestion(
            id = 20049, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel musicien aveugle a révolutionné le R&B ?", listOf("Stevie Wonder", "Ray Charles", "Andrea Bocelli", "José Feliciano"), "Musique", "Stevie Wonder, aveugle de naissance, a transformé le R&B dans les années 1970 en fusionnant funk, soul et synthétiseurs, avec des albums majeurs comme Innervisions et Songs in the Key of Life."),
            en = LocalizedContent("Which blind musician revolutionized R&B?", listOf("Stevie Wonder", "Ray Charles", "Andrea Bocelli", "José Feliciano"), "Music", "Stevie Wonder, blind from birth, transformed R&B in the 1970s by blending funk, soul, and synthesizers, with landmark albums like Innervisions and Songs in the Key of Life."),
            zh = LocalizedContent("哪位盲人音乐家革新了R&B？", listOf("史蒂维·旺德", "雷·查尔斯", "安德烈·波切利", "何塞·费利西亚诺"), "音乐", "史蒂维·旺德天生失明，在20世纪70年代通过融合放克、灵魂乐和合成器革新了R&B，代表作包括《Innervisions》和《Songs in the Key of Life》。"),
            es = LocalizedContent("¿Qué músico ciego revolucionó el R&B?", listOf("Stevie Wonder", "Ray Charles", "Andrea Bocelli", "José Feliciano"), "Música", "Stevie Wonder, ciego de nacimiento, transformó el R&B en la década de 1970 fusionando funk, soul y sintetizadores, con álbumes emblemáticos como Innervisions y Songs in the Key of Life.")
        ),
        BilingualQuestion(
            id = 20050, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel compositeur minimaliste a écrit 'Music for 18 Musicians' ?", listOf("Steve Reich", "Philip Glass", "Terry Riley", "John Adams"), "Musique", "Steve Reich, figure majeure du minimalisme américain, a composé cette œuvre emblématique en 1976, marquée par des motifs répétitifs et des déphasages rythmiques."),
            en = LocalizedContent("Which minimalist composer wrote 'Music for 18 Musicians'?", listOf("Steve Reich", "Philip Glass", "Terry Riley", "John Adams"), "Music", "Steve Reich, a major figure of American minimalism, composed this iconic work in 1976, characterized by repetitive patterns and rhythmic phasing."),
            zh = LocalizedContent("哪位极简主义作曲家创作了《为18位音乐家而作的音乐》？", listOf("史蒂夫·赖希", "菲利普·格拉斯", "特里·赖利", "约翰·亚当斯"), "音乐", "史蒂夫·赖希是美国极简主义的重要人物，于1976年创作了这部标志性作品，以重复模式和节奏相位为特点。"),
            es = LocalizedContent("¿Qué compositor minimalista escribió 'Music for 18 Musicians'?", listOf("Steve Reich", "Philip Glass", "Terry Riley", "John Adams"), "Música", "Steve Reich, figura importante del minimalismo estadounidense, compuso esta obra emblemática en 1976, caracterizada por patrones repetitivos y desfases rítmicos.")
        ),
        BilingualQuestion(
            id = 20101, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est le roi des dieux dans la mythologie grecque ?", listOf("Zeus", "Poséidon", "Hadès", "Arès"), "Mythologie", "Zeus est le souverain de l'Olympe et le dieu du ciel et de la foudre dans la mythologie grecque, ayant renversé son père Cronos pour devenir le roi des dieux."),
            en = LocalizedContent("Who is the king of the gods in Greek mythology?", listOf("Zeus", "Poseidon", "Hades", "Ares"), "Mythology", "Zeus is the ruler of Olympus and the god of the sky and thunder in Greek mythology, having overthrown his father Cronus to become king of the gods."),
            zh = LocalizedContent("希腊神话中的众神之王是谁？", listOf("宙斯", "波塞冬", "哈迪斯", "阿瑞斯"), "神话", "宙斯是奥林匹斯山的统治者，希腊神话中的天空与雷电之神，他推翻了父亲克洛诺斯成为众神之王。"),
            es = LocalizedContent("¿Quién es el rey de los dioses en la mitología griega?", listOf("Zeus", "Poseidón", "Hades", "Ares"), "Mitología", "Zeus es el soberano del Olimpo y el dios del cielo y el trueno en la mitología griega, que derrocó a su padre Cronos para convertirse en rey de los dioses.")
        ),
        BilingualQuestion(
            id = 20102, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel héros grec a tué la Méduse ?", listOf("Persée", "Héraclès", "Thésée", "Achille"), "Mythologie", "Persée a décapité Méduse, la seule Gorgone mortelle, avec l'aide d'objets magiques offerts par les dieux, notamment un bouclier poli pour éviter son regard pétrifiant."),
            en = LocalizedContent("Which Greek hero killed Medusa?", listOf("Perseus", "Heracles", "Theseus", "Achilles"), "Mythology", "Perseus beheaded Medusa, the only mortal Gorgon, with the help of magical objects given by the gods, including a polished shield to avoid her petrifying gaze."),
            zh = LocalizedContent("哪位希腊英雄杀死了美杜莎？", listOf("珀尔修斯", "赫拉克勒斯", "忒修斯", "阿喀琉斯"), "神话", "珀尔修斯借助众神赐予的神奇物品斩下了美杜莎的头颅，美杜莎是唯一会死的戈耳工，他用一面抛光盾牌避免被她的石化目光击中。"),
            es = LocalizedContent("¿Qué héroe griego mató a Medusa?", listOf("Perseo", "Heracles", "Teseo", "Aquiles"), "Mitología", "Perseo decapitó a Medusa, la única Gorgona mortal, con la ayuda de objetos mágicos dados por los dioses, incluido un escudo pulido para evitar su mirada petrificante.")
        ),
    )

    private fun part4(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 20103, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Comment s'appelle le fleuve des Enfers grecs ?", listOf("Le Styx", "Le Léthé", "L'Achéron", "Le Phlégéthon"), "Mythologie", "Le Styx est le principal fleuve des Enfers dans la mythologie grecque, souvent décrit comme une barrière entre le monde des vivants et celui des morts."),
            en = LocalizedContent("What is the name of the river of the Greek Underworld?", listOf("Styx", "Lethe", "Acheron", "Phlegethon"), "Mythology", "The Styx is the main river of the Underworld in Greek mythology, often described as a barrier between the world of the living and the dead."),
            zh = LocalizedContent("希腊冥界的河流叫什么？", listOf("斯提克斯河", "勒忒河", "阿刻戎河", "弗勒格通河"), "神话", "斯提克斯河是希腊神话中冥界的主要河流，常被描述为生者与死者世界之间的屏障。"),
            es = LocalizedContent("¿Cómo se llama el río del Inframundo griego?", listOf("Estigia", "Lete", "Aqueronte", "Flegetonte"), "Mitología", "La Estigia es el principal río del Inframundo en la mitología griega, a menudo descrito como una barrera entre el mundo de los vivos y el de los muertos.")
        ),
        BilingualQuestion(
            id = 20104, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est le dieu nordique du tonnerre ?", listOf("Thor", "Odin", "Loki", "Freyr"), "Mythologie", "Thor est le dieu du tonnerre dans la mythologie nordique, armé de son marteau Mjöllnir. Il est le fils d'Odin et protège les humains et les dieux contre les géants."),
            en = LocalizedContent("Who is the Norse god of thunder?", listOf("Thor", "Odin", "Loki", "Freyr"), "Mythology", "Thor is the god of thunder in Norse mythology, armed with his hammer Mjölnir. He is the son of Odin and protects humans and gods against giants."),
            zh = LocalizedContent("北欧神话中的雷神是谁？", listOf("托尔", "奥丁", "洛基", "弗雷"), "神话", "托尔是北欧神话中的雷神，手持雷神之锤妙尔尼尔。他是奥丁之子，保护人类和众神免受巨人侵害。"),
            es = LocalizedContent("¿Quién es el dios nórdico del trueno?", listOf("Thor", "Odín", "Loki", "Freyr"), "Mitología", "Thor es el dios del trueno en la mitología nórdica, armado con su martillo Mjölnir. Es hijo de Odín y protege a humanos y dioses contra los gigantes.")
        ),
        BilingualQuestion(
            id = 20105, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de travaux Héraclès a-t-il dû accomplir ?", listOf("12", "10", "7", "15"), "Mythologie", "Héraclès a dû accomplir douze travaux pour expier le meurtre de ses enfants, ordonnés par l'oracle de Delphes. Ces épreuves incluent des exploits comme tuer le lion de Némée ou nettoyer les écuries d'Augias."),
            en = LocalizedContent("How many labors did Heracles have to accomplish?", listOf("12", "10", "7", "15"), "Mythology", "Heracles had to accomplish twelve labors to atone for the murder of his children, ordered by the Oracle of Delphi. These trials include feats like killing the Nemean lion or cleaning the Augean stables."),
            zh = LocalizedContent("赫拉克勒斯必须完成多少项任务？", listOf("12", "10", "7", "15"), "神话", "赫拉克勒斯必须完成十二项任务，以赎罪杀害自己孩子的罪行，这些任务由德尔斐神谕指定。这些考验包括杀死涅墨亚狮子或清扫奥革阿斯的牛棚等壮举。"),
            es = LocalizedContent("¿Cuántos trabajos tuvo que realizar Heracles?", listOf("12", "10", "7", "15"), "Mitología", "Heracles tuvo que realizar doce trabajos para expiar el asesinato de sus hijos, ordenados por el oráculo de Delfos. Estas pruebas incluyen hazañas como matar al león de Nemea o limpiar los establos de Augías.")
        ),
        BilingualQuestion(
            id = 20106, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel monstre gardait le labyrinthe de Crète ?", listOf("Le Minotaure", "Le Sphinx", "L'Hydre", "Cerbère"), "Mythologie", "Le Minotaure, créature mi-homme mi-taureau, était enfermé dans le labyrinthe construit par Dédale pour le roi Minos, et se nourrissait de jeunes Athéniens."),
            en = LocalizedContent("Which monster guarded the Labyrinth of Crete?", listOf("The Minotaur", "The Sphinx", "The Hydra", "Cerberus"), "Mythology", "The Minotaur, a creature half-man half-bull, was imprisoned in the labyrinth built by Daedalus for King Minos, and fed on young Athenians."),
            zh = LocalizedContent("哪个怪物守卫着克里特岛的迷宫？", listOf("弥诺陶洛斯", "斯芬克斯", "许德拉", "刻耳柏洛斯"), "神话", "弥诺陶洛斯是一种半人半牛的怪物，被关在代达罗斯为米诺斯王建造的迷宫中，以年轻的雅典人为食。"),
            es = LocalizedContent("¿Qué monstruo guardaba el Laberinto de Creta?", listOf("El Minotauro", "La Esfinge", "La Hidra", "Cerbero"), "Mitología", "El Minotauro, criatura mitad hombre mitad toro, estaba encerrado en el laberinto construido por Dédalo para el rey Minos, y se alimentaba de jóvenes atenienses.")
        ),
        BilingualQuestion(
            id = 20107, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est le passeur des morts dans la mythologie grecque ?", listOf("Charon", "Hermès", "Hadès", "Thanatos"), "Mythologie", "Charon est le nocher des Enfers chargé de faire traverser le Styx aux âmes des défunts, en échange d'une obole placée dans leur bouche."),
            en = LocalizedContent("Who is the ferryman of the dead in Greek mythology?", listOf("Charon", "Hermes", "Hades", "Thanatos"), "Mythology", "Charon is the ferryman of the Underworld who transports the souls of the deceased across the Styx, in exchange for an obol placed in their mouth."),
            zh = LocalizedContent("希腊神话中冥界的渡神是谁？", listOf("卡戎", "赫尔墨斯", "哈迪斯", "塔纳托斯"), "神话", "卡戎是冥界的渡神，负责将亡魂渡过斯提克斯河，作为交换，亡者口中需放一枚银币。"),
            es = LocalizedContent("¿Quién es el barquero de los muertos en la mitología griega?", listOf("Caronte", "Hermes", "Hades", "Tánatos"), "Mitología", "Caronte es el barquero del Inframundo encargado de transportar las almas de los difuntos a través de la Estigia, a cambio de un óbolo colocado en su boca.")
        ),
        BilingualQuestion(
            id = 20108, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel arbre sacré est associé à Odin ?", listOf("Yggdrasil (le frêne)", "Le chêne", "Le bouleau", "L'if"), "Mythologie", "Yggdrasil est l'arbre-monde de la mythologie nordique, un frêne géant dont les branches relient les neuf mondes et sous lequel Odin se pendit pour acquérir la sagesse des runes."),
            en = LocalizedContent("Which sacred tree is associated with Odin?", listOf("Yggdrasil (the ash)", "The oak", "The birch", "The yew"), "Mythology", "Yggdrasil is the world tree of Norse mythology, a giant ash tree whose branches connect the nine worlds and under which Odin hanged himself to gain the wisdom of the runes."),
            zh = LocalizedContent("哪棵圣树与奥丁相关？", listOf("世界树（白蜡树）", "橡树", "桦树", "紫杉"), "神话", "世界树是北欧神话中的世界之树，一棵巨大的白蜡树，其树枝连接九个世界，奥丁曾在其下自缢以获取卢恩文字的智慧。"),
            es = LocalizedContent("¿Qué árbol sagrado está asociado con Odín?", listOf("Yggdrasil (el fresno)", "El roble", "El abedul", "El tejo"), "Mitología", "Yggdrasil es el árbol del mundo de la mitología nórdica, un fresno gigante cuyas ramas conectan los nueve mundos y bajo el cual Odín se colgó para adquirir la sabiduría de las runas.")
        ),
        BilingualQuestion(
            id = 20109, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a ouvert la boîte qui a libéré tous les maux ?", listOf("Pandore", "Hélène", "Médée", "Circé"), "Mythologie", "Dans la mythologie grecque, Pandore, la première femme créée par les dieux, ouvrit une jarre (souvent appelée boîte) qui libéra tous les maux sur l'humanité, ne laissant que l'espoir à l'intérieur."),
            en = LocalizedContent("Who opened the box that released all evils?", listOf("Pandora", "Helen", "Medea", "Circe"), "Mythology", "In Greek mythology, Pandora, the first woman created by the gods, opened a jar (often called a box) that released all evils upon humanity, leaving only hope inside."),
            zh = LocalizedContent("谁打开了释放所有灾祸的盒子？", listOf("潘多拉", "海伦", "美狄亚", "喀耳刻"), "神话", "在希腊神话中，潘多拉是众神创造的第一位女性，她打开了一个罐子（常被称为盒子），释放了人间所有灾祸，只留下了希望在里面。"),
            es = LocalizedContent("¿Quién abrió la caja que liberó todos los males?", listOf("Pandora", "Helena", "Medea", "Circe"), "Mitología", "En la mitología griega, Pandora, la primera mujer creada por los dioses, abrió una jarra (a menudo llamada caja) que liberó todos los males sobre la humanidad, dejando solo la esperanza dentro.")
        ),
        BilingualQuestion(
            id = 20110, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel dieu égyptien a une tête de chacal ?", listOf("Anubis", "Horus", "Seth", "Thot"), "Mythologie", "Anubis est le dieu égyptien de la momification et de l'au-delà, représenté avec une tête de chacal en raison de l'association de cet animal avec les nécropoles."),
            en = LocalizedContent("Which Egyptian god has a jackal head?", listOf("Anubis", "Horus", "Seth", "Thoth"), "Mythology", "Anubis is the Egyptian god of mummification and the afterlife, depicted with a jackal head due to the association of this animal with necropolises."),
            zh = LocalizedContent("哪个埃及神祇有胡狼头？", listOf("阿努比斯", "荷鲁斯", "赛特", "托特"), "神话", "阿努比斯是埃及的木乃伊制作和来世之神，常被描绘成胡狼头，因为这种动物与墓地有关。"),
            es = LocalizedContent("¿Qué dios egipcio tiene cabeza de chacal?", listOf("Anubis", "Horus", "Seth", "Thot"), "Mitología", "Anubis es el dios egipcio de la momificación y el más allá, representado con cabeza de chacal debido a la asociación de este animal con las necrópolis.")
        ),
        BilingualQuestion(
            id = 20111, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans la mythologie nordique, qu'est-ce que le Ragnarök ?", listOf("La fin du monde", "Le paradis des guerriers", "La création de l'univers", "Le banquet des dieux"), "Mythologie", "Dans la mythologie nordique, le Ragnarök est une série d'événements prophétiques incluant une grande bataille, la mort de nombreux dieux, et la destruction du monde par le feu et l'eau, avant sa renaissance."),
            en = LocalizedContent("In Norse mythology, what is Ragnarök?", listOf("The end of the world", "The paradise of warriors", "The creation of the universe", "The banquet of the gods"), "Mythology", "In Norse mythology, Ragnarök is a series of prophesied events including a great battle, the death of many gods, and the destruction of the world by fire and water, before its rebirth."),
            zh = LocalizedContent("在北欧神话中，诸神黄昏是什么？", listOf("世界末日", "战士的天堂", "宇宙的创造", "众神的宴会"), "神话", "在北欧神话中，诸神黄昏是一系列预言的事件，包括一场大战、众神之死，以及世界被火与水毁灭，之后重生。"),
            es = LocalizedContent("En la mitología nórdica, ¿qué es el Ragnarök?", listOf("El fin del mundo", "El paraíso de los guerreros", "La creación del universo", "El banquete de los dioses"), "Mitología", "En la mitología nórdica, el Ragnarök es una serie de eventos profetizados que incluyen una gran batalla, la muerte de muchos dioses y la destrucción del mundo por fuego y agua, antes de su renacimiento.")
        ),
        BilingualQuestion(
            id = 20112, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel héros troyen portait Anchise sur son dos ?", listOf("Énée", "Hector", "Pâris", "Priam"), "Mythologie", "Dans la mythologie grecque et romaine, Énée a sauvé son père Anchise de la ville en flammes de Troie en le portant sur ses épaules."),
            en = LocalizedContent("Which Trojan hero carried Anchises on his back?", listOf("Aeneas", "Hector", "Paris", "Priam"), "Mythology", "In Greek and Roman mythology, Aeneas saved his father Anchises from the burning city of Troy by carrying him on his shoulders."),
            zh = LocalizedContent("哪位特洛伊英雄背着安喀塞斯？", listOf("埃涅阿斯", "赫克托耳", "帕里斯", "普里阿摩斯"), "神话", "在希腊和罗马神话中，埃涅阿斯将父亲安喀塞斯扛在肩上，从燃烧的特洛伊城中救出。"),
            es = LocalizedContent("¿Qué héroe troyano llevó a Anquises sobre su espalda?", listOf("Eneas", "Héctor", "Paris", "Príamo"), "Mitología", "En la mitología griega y romana, Eneas salvó a su padre Anquises de la ciudad en llamas de Troya llevándolo sobre sus hombros.")
        ),
        BilingualQuestion(
            id = 20113, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est la déesse grecque de la sagesse ?", listOf("Athéna", "Artémis", "Aphrodite", "Héra"), "Mythologie", "Athéna, fille de Zeus, est née armée de son crâne et incarne la sagesse, la stratégie militaire et les arts. Elle est la déesse protectrice d'Athènes."),
            en = LocalizedContent("Who is the Greek goddess of wisdom?", listOf("Athena", "Artemis", "Aphrodite", "Hera"), "Mythology", "Athena, daughter of Zeus, was born armed from his skull and embodies wisdom, military strategy, and the arts. She is the patron goddess of Athens."),
            zh = LocalizedContent("谁是希腊的智慧女神？", listOf("雅典娜", "阿尔忒弥斯", "阿佛洛狄忒", "赫拉"), "神话", "雅典娜是宙斯的女儿，从宙斯的头颅中全副武装地诞生，代表智慧、军事策略和艺术。她是雅典的守护神。"),
            es = LocalizedContent("¿Quién es la diosa griega de la sabiduría?", listOf("Atenea", "Artemisa", "Afrodita", "Hera"), "Mitología", "Atenea, hija de Zeus, nació armada de su cráneo y encarna la sabiduría, la estrategia militar y las artes. Es la diosa protectora de Atenas.")
        ),
        BilingualQuestion(
            id = 20114, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel titan portait le monde sur ses épaules ?", listOf("Atlas", "Cronos", "Prométhée", "Hypérion"), "Mythologie", "Atlas, condamné par Zeus à soutenir la voûte céleste, est souvent représenté portant le globe terrestre sur ses épaules."),
            en = LocalizedContent("Which titan held the world on his shoulders?", listOf("Atlas", "Cronus", "Prometheus", "Hyperion"), "Mythology", "Atlas, condemned by Zeus to support the heavens, is often depicted carrying the globe on his shoulders."),
            zh = LocalizedContent("哪位泰坦用肩膀扛着世界？", listOf("阿特拉斯", "克洛诺斯", "普罗米修斯", "许珀里翁"), "神话", "阿特拉斯被宙斯惩罚支撑天空，常被描绘为用肩膀扛着地球。"),
            es = LocalizedContent("¿Qué titán sostenía el mundo sobre sus hombros?", listOf("Atlas", "Cronos", "Prometeo", "Hiperión"), "Mitología", "Atlas, condenado por Zeus a sostener la bóveda celeste, a menudo se representa llevando el globo terráqueo sobre sus hombros.")
        ),
        BilingualQuestion(
            id = 20115, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Comment s'appelle le loup géant de la mythologie nordique ?", listOf("Fenrir", "Sköll", "Hati", "Garm"), "Mythologie", "Fenrir est le loup monstrueux, fils de Loki, dont la prophétie annonce qu'il dévorera Odin lors du Ragnarök."),
            en = LocalizedContent("What is the name of the giant wolf in Norse mythology?", listOf("Fenrir", "Sköll", "Hati", "Garm"), "Mythology", "Fenrir is the monstrous wolf, son of Loki, whose prophecy says he will devour Odin during Ragnarök."),
            zh = LocalizedContent("北欧神话中的巨狼叫什么名字？", listOf("芬里尔", "斯库尔", "哈提", "加姆"), "神话", "芬里尔是洛基的儿子，一只 monstrous 的狼，预言称他将在诸神黄昏时吞噬奥丁。"),
            es = LocalizedContent("¿Cómo se llama el lobo gigante de la mitología nórdica?", listOf("Fenrir", "Sköll", "Hati", "Garm"), "Mitología", "Fenrir es el lobo monstruoso, hijo de Loki, cuya profecía anuncia que devorará a Odín durante el Ragnarök.")
        ),
        BilingualQuestion(
            id = 20116, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel dieu hindou a une tête d'éléphant ?", listOf("Ganesh", "Vishnou", "Shiva", "Brahma"), "Mythologie", "Ganesh est le dieu hindou de la sagesse et de l'abondance, reconnaissable à sa tête d'éléphant, symbole de sa naissance légendaire après que Shiva lui a tranché la tête et l'a remplacée par celle d'un éléphant."),
            en = LocalizedContent("Which Hindu god has an elephant head?", listOf("Ganesh", "Vishnu", "Shiva", "Brahma"), "Mythology", "Ganesh is the Hindu god of wisdom and abundance, recognizable by his elephant head, symbolizing his legendary birth after Shiva cut off his head and replaced it with that of an elephant."),
            zh = LocalizedContent("哪位印度神有象头？", listOf("伽内什", "毗湿奴", "湿婆", "梵天"), "神话", "伽内什是印度教的智慧与丰饶之神，以象头为特征，象征其传奇诞生：湿婆砍下他的头后换上了象头。"),
            es = LocalizedContent("¿Qué dios hindú tiene cabeza de elefante?", listOf("Ganesha", "Visnú", "Shivá", "Bráhma"), "Mitología", "Ganesha es el dios hindú de la sabiduría y la abundancia, reconocible por su cabeza de elefante, símbolo de su nacimiento legendario tras que Shivá le cortara la cabeza y la reemplazara por la de un elefante.")
        ),
        BilingualQuestion(
            id = 20117, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a volé le feu pour le donner aux humains ?", listOf("Prométhée", "Épiméthée", "Hermès", "Héphaïstos"), "Mythologie", "Dans la mythologie grecque, Prométhée, un Titan, déroba le feu sacré de l'Olympe pour l'offrir aux mortels, défiant ainsi la volonté de Zeus."),
            en = LocalizedContent("Who stole fire to give it to humans?", listOf("Prometheus", "Epimetheus", "Hermes", "Hephaestus"), "Mythology", "In Greek mythology, Prometheus, a Titan, stole sacred fire from Olympus to give it to mortals, defying Zeus's will."),
            zh = LocalizedContent("谁偷了火种送给人类？", listOf("普罗米修斯", "厄庇墨透斯", "赫尔墨斯", "赫菲斯托斯"), "神话", "在希腊神话中，泰坦普罗米修斯从奥林匹斯山盗取圣火送给凡人，违抗了宙斯的意志。"),
            es = LocalizedContent("¿Quién robó el fuego para dárselo a los humanos?", listOf("Prometeo", "Epimeteo", "Hermes", "Hefesto"), "Mitología", "En la mitología griega, Prometeo, un Titán, robó el fuego sagrado del Olimpo para ofrecérselo a los mortales, desafiando la voluntad de Zeus.")
        ),
        BilingualQuestion(
            id = 20118, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du marteau de Thor ?", listOf("Mjöllnir", "Gungnir", "Gram", "Tyrfing"), "Mythologie", "Mjöllnir est le marteau légendaire du dieu nordique Thor, forgé par les nains Brokk et Eitri, et capable de lancer des éclairs et de revenir dans sa main."),
            en = LocalizedContent("What is the name of Thor's hammer?", listOf("Mjölnir", "Gungnir", "Gram", "Tyrfing"), "Mythology", "Mjölnir is the legendary hammer of the Norse god Thor, forged by the dwarves Brokk and Eitri, capable of throwing lightning and returning to his hand."),
            zh = LocalizedContent("托尔的锤子叫什么名字？", listOf("妙尔尼尔", "冈格尼尔", "格拉姆", "提尔锋"), "神话", "妙尔尼尔是北欧神托尔的传奇锤子，由矮人布洛克和伊特里锻造，能投掷闪电并回到手中。"),
            es = LocalizedContent("¿Cómo se llama el martillo de Thor?", listOf("Mjolnir", "Gungnir", "Gram", "Tyrfing"), "Mitología", "Mjolnir es el martillo legendario del dios nórdico Thor, forjado por los enanos Brokk y Eitri, capaz de lanzar rayos y volver a su mano.")
        ),
        BilingualQuestion(
            id = 20119, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de têtes avait l'Hydre de Lerne ?", listOf("9 (qui repoussaient)", "7", "5", "12"), "Mythologie", "L'Hydre de Lerne, créature de la mythologie grecque, possédait neuf têtes, dont une immortelle, et chaque tête coupée repoussait."),
            en = LocalizedContent("How many heads did the Lernaean Hydra have?", listOf("9 (which regrew)", "7", "5", "12"), "Mythology", "The Lernaean Hydra, a creature in Greek mythology, had nine heads, one of which was immortal, and each cut head would regrow."),
            zh = LocalizedContent("勒拿九头蛇有几个头？", listOf("9个（会再生）", "7个", "5个", "12个"), "神话", "勒拿九头蛇是希腊神话中的生物，有九个头，其中一个是不死的，每个被砍下的头都会再生。"),
            es = LocalizedContent("¿Cuántas cabezas tenía la Hidra de Lerna?", listOf("9 (que volvían a crecer)", "7", "5", "12"), "Mitología", "La Hidra de Lerna, criatura de la mitología griega, poseía nueve cabezas, una de ellas inmortal, y cada cabeza cortada volvía a crecer.")
        ),
        BilingualQuestion(
            id = 20120, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel dieu grec est le messager des dieux ?", listOf("Hermès", "Apollon", "Arès", "Dionysos"), "Mythologie", "Hermès est le messager des dieux dans la mythologie grecque, connu pour sa rapidité et son rôle de guide des âmes vers les enfers."),
            en = LocalizedContent("Which Greek god is the messenger of the gods?", listOf("Hermes", "Apollo", "Ares", "Dionysus"), "Mythology", "Hermes is the messenger of the gods in Greek mythology, known for his speed and his role as guide of souls to the underworld."),
            zh = LocalizedContent("哪位希腊神是众神的信使？", listOf("赫尔墨斯", "阿波罗", "阿瑞斯", "狄俄尼索斯"), "神话", "赫尔墨斯是希腊神话中众神的信使，以速度著称，并担任灵魂引渡者前往冥界。"),
            es = LocalizedContent("¿Qué dios griego es el mensajero de los dioses?", listOf("Hermes", "Apolo", "Ares", "Dioniso"), "Mitología", "Hermes es el mensajero de los dioses en la mitología griega, conocido por su velocidad y su papel como guía de las almas hacia el inframundo.")
        ),
        BilingualQuestion(
            id = 20121, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Dans la mythologie japonaise, quelle déesse du soleil se cache dans une grotte ?", listOf("Amaterasu", "Tsukuyomi", "Susanoo", "Izanami"), "Mythologie", "Amaterasu, déesse shinto du soleil, se cacha dans la grotte d'Ama-no-Iwato après une dispute avec son frère Susanoo, plongeant le monde dans l'obscurité."),
            en = LocalizedContent("In Japanese mythology, which sun goddess hides in a cave?", listOf("Amaterasu", "Tsukuyomi", "Susanoo", "Izanami"), "Mythology", "Amaterasu, the Shinto sun goddess, hid in the cave of Ama-no-Iwato after a quarrel with her brother Susanoo, plunging the world into darkness."),
            zh = LocalizedContent("在日本神话中，哪位太阳女神躲在山洞里？", listOf("天照大神", "月读命", "须佐之男命", "伊邪那美"), "神话", "天照大神是神道教的太阳女神，在与弟弟须佐之男命争吵后躲进天岩户洞穴，使世界陷入黑暗。"),
            es = LocalizedContent("En la mitología japonesa, ¿qué diosa del sol se esconde en una cueva?", listOf("Amaterasu", "Tsukuyomi", "Susanoo", "Izanami"), "Mitología", "Amaterasu, diosa sintoísta del sol, se escondió en la cueva de Ama-no-Iwato tras una disputa con su hermano Susanoo, sumiendo al mundo en la oscuridad.")
        ),
        BilingualQuestion(
            id = 20122, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel monstre grec avait un corps de lion et un visage de femme ?", listOf("Le Sphinx", "La Chimère", "Le Minotaure", "L'Hydre"), "Mythologie", "Le Sphinx, figure de la mythologie grecque, terrorisait Thèbes en posant une énigme aux voyageurs et dévorait ceux qui ne trouvaient pas la réponse."),
            en = LocalizedContent("Which Greek monster had a lion's body and a woman's face?", listOf("The Sphinx", "The Chimera", "The Minotaur", "The Hydra"), "Mythology", "The Sphinx, a figure in Greek mythology, terrorized Thebes by posing a riddle to travelers and devouring those who could not answer."),
            zh = LocalizedContent("哪个希腊怪物有狮身和女人脸？", listOf("斯芬克斯", "喀迈拉", "弥诺陶洛斯", "九头蛇"), "神话", "斯芬克斯是希腊神话中的形象，通过向路人出谜语来恐吓底比斯，并吞噬无法回答的人。"),
            es = LocalizedContent("¿Qué monstruo griego tenía cuerpo de león y rostro de mujer?", listOf("La Esfinge", "La Quimera", "El Minotauro", "La Hidra"), "Mitología", "La Esfinge, figura de la mitología griega, aterrorizaba Tebas planteando un acertijo a los viajeros y devoraba a quienes no encontraban la respuesta.")
        ),
        BilingualQuestion(
            id = 20123, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est le dieu grec de la mer ?", listOf("Poséidon", "Zeus", "Arès", "Apollon"), "Mythologie", "Poséidon est le dieu grec de la mer, des tremblements de terre et des chevaux, frère de Zeus et d’Hadès. Il est souvent représenté avec un trident, symbole de sa puissance sur les océans."),
            en = LocalizedContent("Who is the Greek god of the sea?", listOf("Poseidon", "Zeus", "Ares", "Apollo"), "Mythology", "Poseidon is the Greek god of the sea, earthquakes, and horses, brother of Zeus and Hades. He is often depicted with a trident, symbol of his power over the oceans."),
            zh = LocalizedContent("谁是希腊神话中的海神？", listOf("波塞冬", "宙斯", "阿瑞斯", "阿波罗"), "神话", "波塞冬是希腊神话中的海神、地震神和马神，是宙斯和哈迪斯的兄弟。他通常被描绘为手持三叉戟，象征他对海洋的统治力。"),
            es = LocalizedContent("¿Quién es el dios griego del mar?", listOf("Poseidón", "Zeus", "Ares", "Apolo"), "Mitología", "Poseidón es el dios griego del mar, los terremotos y los caballos, hermano de Zeus y Hades. A menudo se le representa con un tridente, símbolo de su poder sobre los océanos.")
        ),
        BilingualQuestion(
            id = 20124, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel héros a navigué pour chercher la Toison d'or ?", listOf("Jason", "Ulysse", "Thésée", "Persée"), "Mythologie", "Jason est le héros de la mythologie grecque qui, avec les Argonautes, a entrepris la quête de la Toison d'or pour reconquérir le trône d'Iolcos."),
            en = LocalizedContent("Which hero sailed to seek the Golden Fleece?", listOf("Jason", "Odysseus", "Theseus", "Perseus"), "Mythology", "Jason is the hero of Greek mythology who, with the Argonauts, undertook the quest for the Golden Fleece to reclaim the throne of Iolcus."),
            zh = LocalizedContent("哪位英雄航行寻找金羊毛？", listOf("伊阿宋", "奥德修斯", "忒修斯", "珀尔修斯"), "神话", "伊阿宋是希腊神话中的英雄，他与阿尔戈英雄们一起踏上了寻找金羊毛的旅程，以夺回伊奥尔科斯的王位。"),
            es = LocalizedContent("¿Qué héroe navegó en busca del Vellocino de Oro?", listOf("Jasón", "Ulises", "Teseo", "Perseo"), "Mitología", "Jasón es el héroe de la mitología griega que, junto con los argonautas, emprendió la búsqueda del Vellocino de Oro para recuperar el trono de Yolco.")
        ),
        BilingualQuestion(
            id = 20125, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel animal était sacré pour les Égyptiens ?", listOf("Le chat", "Le chien", "Le cheval", "L'aigle"), "Mythologie", "Les Égyptiens vénéraient les chats comme des incarnations de la déesse Bastet, protectrice du foyer et de la fertilité. Tuer un chat était un crime passible de la peine de mort."),
            en = LocalizedContent("Which animal was sacred to the Egyptians?", listOf("The cat", "The dog", "The horse", "The eagle"), "Mythology", "The Egyptians revered cats as incarnations of the goddess Bastet, protector of the home and fertility. Killing a cat was a crime punishable by death."),
            zh = LocalizedContent("哪种动物对埃及人是神圣的？", listOf("猫", "狗", "马", "鹰"), "神话", "埃及人将猫视为女神芭丝特（Bastet）的化身，她是家庭和生育的保护神。杀死猫是死罪。"),
            es = LocalizedContent("¿Qué animal era sagrado para los egipcios?", listOf("El gato", "El perro", "El caballo", "El águila"), "Mitología", "Los egipcios veneraban a los gatos como encarnaciones de la diosa Bastet, protectora del hogar y la fertilidad. Matar a un gato era un delito castigado con la muerte.")
        ),
        BilingualQuestion(
            id = 20126, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Comment se nomme le paradis des guerriers dans la mythologie nordique ?", listOf("Le Valhalla", "L'Asgard", "Le Niflheim", "Le Midgard"), "Mythologie", "Le Valhalla est le grand hall d'Odin où les guerriers morts au combat, les Einherjar, festoient et s'entraînent en attendant le Ragnarök."),
            en = LocalizedContent("What is the name of the warriors' paradise in Norse mythology?", listOf("Valhalla", "Asgard", "Niflheim", "Midgard"), "Mythology", "Valhalla is Odin's great hall where warriors who died in battle, the Einherjar, feast and train while awaiting Ragnarök."),
            zh = LocalizedContent("北欧神话中战士的天堂叫什么？", listOf("瓦尔哈拉", "阿斯加德", "尼福尔海姆", "米德加德"), "神话", "瓦尔哈拉是奥丁的大殿，战死的勇士（英灵战士）在此宴饮和训练，等待诸神黄昏的到来。"),
            es = LocalizedContent("¿Cómo se llama el paraíso de los guerreros en la mitología nórdica?", listOf("El Valhalla", "Asgard", "Niflheim", "Midgard"), "Mitología", "El Valhalla es el gran salón de Odín donde los guerreros muertos en combate, los einherjar, festejan y entrenan mientras esperan el Ragnarök.")
        ),
        BilingualQuestion(
            id = 20127, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel dieu romain correspond à Arès ?", listOf("Mars", "Mercure", "Jupiter", "Neptune"), "Mythologie", "Mars est l'équivalent romain d'Arès, le dieu grec de la guerre, dans le cadre de l'assimilation des panthéons grec et romain."),
            en = LocalizedContent("Which Roman god corresponds to Ares?", listOf("Mars", "Mercury", "Jupiter", "Neptune"), "Mythology", "Mars is the Roman equivalent of Ares, the Greek god of war, as part of the assimilation of the Greek and Roman pantheons."),
            zh = LocalizedContent("哪位罗马神祇对应阿瑞斯？", listOf("马尔斯", "墨丘利", "朱庇特", "尼普顿"), "神话", "马尔斯是阿瑞斯（希腊战神）的罗马对应神，这是希腊和罗马神系融合的一部分。"),
            es = LocalizedContent("¿Qué dios romano corresponde a Ares?", listOf("Marte", "Mercurio", "Júpiter", "Neptuno"), "Mitología", "Marte es el equivalente romano de Ares, el dios griego de la guerra, como parte de la asimilación de los panteones griego y romano.")
        ),
        BilingualQuestion(
            id = 20128, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle créature mythique renaît de ses cendres ?", listOf("Le phénix", "Le dragon", "Le griffon", "La licorne"), "Mythologie", "Le phénix est un oiseau légendaire de la mythologie grecque et égyptienne, célèbre pour son cycle de renaissance où il renaît de ses propres cendres après s'être consumé par le feu."),
            en = LocalizedContent("Which mythical creature is reborn from its ashes?", listOf("The phoenix", "The dragon", "The griffin", "The unicorn"), "Mythology", "The phoenix is a legendary bird from Greek and Egyptian mythology, famous for its cycle of rebirth where it rises from its own ashes after being consumed by fire."),
            zh = LocalizedContent("哪种神话生物能从灰烬中重生？", listOf("凤凰", "龙", "狮鹫", "独角兽"), "神话", "凤凰是希腊和埃及神话中的传奇鸟类，以其重生循环而闻名：它在火焰中自焚，然后从灰烬中重生。"),
            es = LocalizedContent("¿Qué criatura mítica renace de sus cenizas?", listOf("El fénix", "El dragón", "El grifo", "El unicornio"), "Mitología", "El fénix es un ave legendaria de la mitología griega y egipcia, famosa por su ciclo de renacimiento en el que resurge de sus propias cenizas tras consumirse en el fuego.")
        ),
        BilingualQuestion(
            id = 20129, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a coupé le nœud gordien ?", listOf("Alexandre le Grand", "Ulysse", "Achille", "Héraclès"), "Mythologie", "Selon la légende, quiconque dénouait le nœud gordien deviendrait maître de l'Asie. Alexandre le Grand le trancha d'un coup d'épée, réalisant ainsi la prophétie."),
            en = LocalizedContent("Who cut the Gordian knot?", listOf("Alexander the Great", "Odysseus", "Achilles", "Heracles"), "Mythology", "According to legend, whoever untied the Gordian knot would become master of Asia. Alexander the Great cut it with a stroke of his sword, thus fulfilling the prophecy."),
            zh = LocalizedContent("谁斩断了戈尔迪乌姆之结？", listOf("亚历山大大帝", "奥德修斯", "阿喀琉斯", "赫拉克勒斯"), "神话", "传说中，谁能解开戈尔迪乌姆之结，谁就能成为亚洲之王。亚历山大大帝一剑将其斩断，从而实现了预言。"),
            es = LocalizedContent("¿Quién cortó el nudo gordiano?", listOf("Alejandro Magno", "Ulises", "Aquiles", "Heracles"), "Mitología", "Según la leyenda, quien desatara el nudo gordiano se convertiría en señor de Asia. Alejandro Magno lo cortó de un tajo con su espada, cumpliendo así la profecía.")
        ),
        BilingualQuestion(
            id = 20130, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quelle déesse aztèque représente la lune ?", listOf("Coyolxauhqui", "Coatlicue", "Tlazolteotl", "Xochiquetzal"), "Mythologie", "Coyolxauhqui est la déesse aztèque de la lune, dont le nom signifie \"celle qui se pare de cloches\". Elle est célèbre pour avoir été démembrée par son frère Huitzilopochtli, le dieu du soleil."),
            en = LocalizedContent("Which Aztec goddess represents the moon?", listOf("Coyolxauhqui", "Coatlicue", "Tlazolteotl", "Xochiquetzal"), "Mythology", "Coyolxauhqui is the Aztec goddess of the moon, whose name means 'she who adorns herself with bells.' She is famous for being dismembered by her brother Huitzilopochtli, the sun god."),
            zh = LocalizedContent("哪位阿兹特克女神代表月亮？", listOf("科约尔绍基", "科阿特利库埃", "特拉佐尔特奥特尔", "索奇克察尔"), "神话", "科约尔绍基是阿兹特克的月亮女神，其名字意为“佩戴铃铛者”。她因被其兄弟太阳神惠齐洛波奇特利肢解而闻名。"),
            es = LocalizedContent("¿Qué diosa azteca representa la luna?", listOf("Coyolxauhqui", "Coatlicue", "Tlazolteotl", "Xochiquetzal"), "Mitología", "Coyolxauhqui es la diosa azteca de la luna, cuyo nombre significa 'la que se adorna con cascabeles'. Es famosa por haber sido desmembrada por su hermano Huitzilopochtli, el dios del sol.")
        ),
        BilingualQuestion(
            id = 20131, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom du serpent mondial dans la mythologie nordique ?", listOf("Jörmungandr", "Níðhöggr", "Fáfnir", "Apep"), "Mythologie", "Jörmungandr est le serpent géant qui entoure Midgard, le monde des humains, en se mordant la queue. Il est l’un des trois enfants de Loki et combat Thor lors du Ragnarök."),
            en = LocalizedContent("What is the name of the world serpent in Norse mythology?", listOf("Jörmungandr", "Níðhöggr", "Fáfnir", "Apep"), "Mythology", "Jörmungandr is the giant serpent that encircles Midgard, the world of humans, biting its own tail. It is one of Loki's three children and fights Thor during Ragnarök."),
            zh = LocalizedContent("北欧神话中的世界之蛇叫什么？", listOf("耶梦加得", "尼德霍格", "法夫尼尔", "阿波菲斯"), "神话", "耶梦加得是环绕人类世界米德加德的巨蛇，咬住自己的尾巴。它是洛基的三个孩子之一，在诸神黄昏中与托尔战斗。"),
            es = LocalizedContent("¿Cuál es el nombre de la serpiente del mundo en la mitología nórdica?", listOf("Jörmungandr", "Níðhöggr", "Fáfnir", "Apep"), "Mitología", "Jörmungandr es la serpiente gigante que rodea Midgard, el mundo de los humanos, mordiéndose la cola. Es uno de los tres hijos de Loki y lucha contra Thor durante el Ragnarök.")
        ),
        BilingualQuestion(
            id = 20132, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel dieu égyptien est associé au soleil ?", listOf("Râ", "Osiris", "Anubis", "Seth"), "Mythologie", "Râ est le dieu solaire majeur de la mythologie égyptienne, souvent représenté avec une tête de faucon surmontée d'un disque solaire."),
            en = LocalizedContent("Which Egyptian god is associated with the sun?", listOf("Ra", "Osiris", "Anubis", "Seth"), "Mythology", "Ra is the major sun god in Egyptian mythology, often depicted with a falcon head surmounted by a solar disk."),
            zh = LocalizedContent("哪位埃及神祇与太阳相关？", listOf("拉", "奥西里斯", "阿努比斯", "赛特"), "神话", "拉是埃及神话中的主要太阳神，常被描绘为鹰头，头顶太阳圆盘。"),
            es = LocalizedContent("¿Qué dios egipcio está asociado con el sol?", listOf("Ra", "Osiris", "Anubis", "Seth"), "Mitología", "Ra es el dios solar principal de la mitología egipcia, a menudo representado con cabeza de halcón coronada por un disco solar.")
        ),
        BilingualQuestion(
            id = 20133, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est l'épouse de Zeus dans la mythologie grecque ?", listOf("Héra", "Athéna", "Aphrodite", "Déméter"), "Mythologie", "Héra est la déesse du mariage et de la famille, sœur et épouse légitime de Zeus, roi des dieux de l'Olympe."),
            en = LocalizedContent("Who is the wife of Zeus in Greek mythology?", listOf("Hera", "Athena", "Aphrodite", "Demeter"), "Mythology", "Hera is the goddess of marriage and family, sister and lawful wife of Zeus, king of the Olympian gods."),
            zh = LocalizedContent("在希腊神话中，宙斯的妻子是谁？", listOf("赫拉", "雅典娜", "阿佛洛狄忒", "德墨忒尔"), "神话", "赫拉是婚姻和家庭女神，是奥林匹斯众神之王宙斯的姐妹和合法妻子。"),
            es = LocalizedContent("¿Quién es la esposa de Zeus en la mitología griega?", listOf("Hera", "Atenea", "Afrodita", "Deméter"), "Mitología", "Hera es la diosa del matrimonio y la familia, hermana y esposa legítima de Zeus, rey de los dioses del Olimpo.")
        ),
        BilingualQuestion(
            id = 20134, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle nymphe s'est transformée en laurier pour échapper à Apollon ?", listOf("Daphné", "Écho", "Syrinx", "Calypso"), "Mythologie", "Dans la mythologie grecque, Daphné est une nymphe poursuivie par Apollon, qui la transforme en laurier pour lui échapper, faisant de cet arbre un symbole sacré pour le dieu."),
            en = LocalizedContent("Which nymph turned into a laurel tree to escape Apollo?", listOf("Daphne", "Echo", "Syrinx", "Calypso"), "Mythology", "In Greek mythology, Daphne is a nymph pursued by Apollo, who transforms her into a laurel tree to escape him, making this tree a sacred symbol for the god."),
            zh = LocalizedContent("哪位宁芙为了躲避阿波罗而变成了月桂树？", listOf("达芙妮", "厄科", "绪任克斯", "卡吕普索"), "神话", "在希腊神话中，达芙妮是一位被阿波罗追逐的宁芙，为了逃脱而变成月桂树，使这棵树成为阿波罗的神圣象征。"),
            es = LocalizedContent("¿Qué ninfa se transformó en laurel para escapar de Apolo?", listOf("Dafne", "Eco", "Siringa", "Calipso"), "Mitología", "En la mitología griega, Dafne es una ninfa perseguida por Apolo, quien la transforma en laurel para escapar de él, convirtiendo este árbol en un símbolo sagrado para el dios.")
        ),
        BilingualQuestion(
            id = 20135, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel roi a eu le pouvoir de transformer tout en or ?", listOf("Midas", "Crésus", "Priam", "Agamemnon"), "Mythologie", "Dans la mythologie grecque, le roi Midas reçut de Dionysos le pouvoir de transformer en or tout ce qu'il touchait, un don qui devint une malédiction lorsqu'il ne put plus manger ni boire."),
            en = LocalizedContent("Which king had the power to turn everything into gold?", listOf("Midas", "Croesus", "Priam", "Agamemnon"), "Mythology", "In Greek mythology, King Midas received from Dionysus the power to turn everything he touched into gold, a gift that became a curse when he could no longer eat or drink."),
            zh = LocalizedContent("哪位国王拥有将一切变成黄金的能力？", listOf("迈达斯", "克罗伊斯", "普里阿摩斯", "阿伽门农"), "神话", "在希腊神话中，迈达斯国王从狄俄尼索斯那里获得了点石成金的能力，这份礼物在他无法进食和饮水时变成了诅咒。"),
            es = LocalizedContent("¿Qué rey tenía el poder de convertir todo en oro?", listOf("Midas", "Creso", "Príamo", "Agamenón"), "Mitología", "En la mitología griega, el rey Midas recibió de Dioniso el poder de convertir en oro todo lo que tocaba, un don que se convirtió en maldición cuando ya no pudo comer ni beber.")
        ),
        BilingualQuestion(
            id = 20136, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans la mythologie celtique, qu'est-ce que l'Avalon ?", listOf("L'île des pommes / paradis", "Le monde souterrain", "La forêt sacrée", "Le lac enchanté"), "Mythologie", "Dans la mythologie celtique, Avalon est une île légendaire associée aux pommes, symbole d'immortalité, et considérée comme un paradis ou un royaume des dieux."),
            en = LocalizedContent("In Celtic mythology, what is Avalon?", listOf("The island of apples / paradise", "The underworld", "The sacred forest", "The enchanted lake"), "Mythology", "In Celtic mythology, Avalon is a legendary island associated with apples, a symbol of immortality, and considered a paradise or realm of the gods."),
            zh = LocalizedContent("在凯尔特神话中，阿瓦隆是什么？", listOf("苹果岛 / 天堂", "冥界", "神圣森林", "魔法湖"), "神话", "在凯尔特神话中，阿瓦隆是一个与苹果相关的传奇岛屿，苹果象征永生，被视为天堂或众神的领域。"),
            es = LocalizedContent("En la mitología celta, ¿qué es el Avalon?", listOf("La isla de las manzanas / paraíso", "El inframundo", "El bosque sagrado", "El lago encantado"), "Mitología", "En la mitología celta, Avalon es una isla legendaria asociada con las manzanas, símbolo de inmortalidad, y considerada un paraíso o reino de los dioses.")
        ),
        BilingualQuestion(
            id = 20137, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel héros grec est invulnérable sauf au talon ?", listOf("Achille", "Héraclès", "Persée", "Ajax"), "Mythologie", "Selon la mythologie grecque, sa mère Thétis le plongea dans le Styx pour le rendre invulnérable, mais le talon par lequel elle le tenait resta vulnérable."),
            en = LocalizedContent("Which Greek hero is invulnerable except for his heel?", listOf("Achilles", "Heracles", "Perseus", "Ajax"), "Mythology", "According to Greek mythology, his mother Thetis dipped him in the River Styx to make him invulnerable, but the heel by which she held him remained vulnerable."),
            zh = LocalizedContent("哪位希腊英雄除了脚踝外刀枪不入？", listOf("阿喀琉斯", "赫拉克勒斯", "珀尔修斯", "埃阿斯"), "神话", "根据希腊神话，他的母亲忒提斯将他浸入冥河以使他刀枪不入，但她握住的脚踝处仍是弱点。"),
            es = LocalizedContent("¿Qué héroe griego es invulnerable excepto en el talón?", listOf("Aquiles", "Heracles", "Perseo", "Áyax"), "Mitología", "Según la mitología griega, su madre Tetis lo sumergió en el río Estigia para hacerlo invulnerable, pero el talón por donde lo sostuvo permaneció vulnerable.")
        ),
        BilingualQuestion(
            id = 20138, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est le dieu nordique de la ruse et du chaos ?", listOf("Loki", "Thor", "Odin", "Tyr"), "Mythologie", "Loki est une figure majeure de la mythologie nordique, connu pour ses farces, ses tromperies et son rôle perturbateur parmi les dieux d'Asgard."),
            en = LocalizedContent("Who is the Norse god of mischief and chaos?", listOf("Loki", "Thor", "Odin", "Tyr"), "Mythology", "Loki is a major figure in Norse mythology, known for his pranks, deceptions, and disruptive role among the gods of Asgard."),
            zh = LocalizedContent("谁是北欧神话中恶作剧和混乱之神？", listOf("洛基", "托尔", "奥丁", "提尔"), "神话", "洛基是北欧神话中的重要人物，以其恶作剧、欺骗和在阿斯加德众神中的破坏性角色而闻名。"),
            es = LocalizedContent("¿Quién es el dios nórdico de la travesura y el caos?", listOf("Loki", "Thor", "Odín", "Tyr"), "Mitología", "Loki es una figura importante en la mitología nórdica, conocido por sus bromas, engaños y papel perturbador entre los dioses de Asgard.")
        ),
        BilingualQuestion(
            id = 20139, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel oiseau mythique indien est le véhicule de Vishnou ?", listOf("Garuda", "Hamsa", "Jatayu", "Sampati"), "Mythologie", "Dans la mythologie hindoue, Garuda est un immense oiseau divin, souvent représenté avec un corps d'homme et des ailes d'aigle, qui sert de monture (vahana) au dieu Vishnou."),
            en = LocalizedContent("Which mythical Indian bird is the vehicle of Vishnu?", listOf("Garuda", "Hamsa", "Jatayu", "Sampati"), "Mythology", "In Hindu mythology, Garuda is a giant divine bird, often depicted with a human body and eagle wings, serving as the mount (vahana) of the god Vishnu."),
            zh = LocalizedContent("哪种印度神话中的鸟类是毗湿奴的坐骑？", listOf("迦楼罗", "汉萨", "阇陀优", "桑帕提"), "神话", "在印度神话中，迦楼罗是一种巨大的神鸟，常被描绘为人身鹰翼，是毗湿奴神的坐骑（vahana）。"),
            es = LocalizedContent("¿Qué ave mítica india es el vehículo de Vishnú?", listOf("Garuda", "Hamsa", "Yatayu", "Sampati"), "Mitología", "En la mitología hindú, Garuda es un ave divina gigante, a menudo representada con cuerpo humano y alas de águila, que sirve como montura (vahana) del dios Vishnú.")
        ),
        BilingualQuestion(
            id = 20140, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de Muses existait-il dans la mythologie grecque ?", listOf("9", "7", "12", "3"), "Mythologie", "Dans la mythologie grecque, les neuf Muses sont les filles de Zeus et de Mnémosyne, chacune présidant à un art ou une science (comme l'épopée, l'histoire ou la danse)."),
            en = LocalizedContent("How many Muses were there in Greek mythology?", listOf("9", "7", "12", "3"), "Mythology", "In Greek mythology, the nine Muses are the daughters of Zeus and Mnemosyne, each presiding over an art or science (such as epic poetry, history, or dance)."),
            zh = LocalizedContent("希腊神话中有几位缪斯？", listOf("9", "7", "12", "3"), "神话", "在希腊神话中，九位缪斯是宙斯和谟涅摩绪涅的女儿，每位掌管一门艺术或科学（如史诗、历史或舞蹈）。"),
            es = LocalizedContent("¿Cuántas Musas había en la mitología griega?", listOf("9", "7", "12", "3"), "Mitología", "En la mitología griega, las nueve Musas son hijas de Zeus y Mnemósine, cada una preside un arte o ciencia (como la épica, la historia o la danza).")
        ),
        BilingualQuestion(
            id = 20141, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le dieu grec du vin ?", listOf("Dionysos", "Apollon", "Pan", "Hermès"), "Mythologie", "Dionysos est le dieu grec du vin, de la vigne et de l'ivresse, souvent associé aux fêtes et au théâtre."),
            en = LocalizedContent("Who is the Greek god of wine?", listOf("Dionysus", "Apollo", "Pan", "Hermes"), "Mythology", "Dionysus is the Greek god of wine, vineyards, and intoxication, often associated with festivities and theater."),
            zh = LocalizedContent("谁是希腊神话中的酒神？", listOf("狄俄尼索斯", "阿波罗", "潘", "赫尔墨斯"), "神话", "狄俄尼索斯是希腊神话中的酒神、葡萄种植和陶醉之神，常与节日和戏剧相关联。"),
            es = LocalizedContent("¿Quién es el dios griego del vino?", listOf("Dioniso", "Apolo", "Pan", "Hermes"), "Mitología", "Dioniso es el dios griego del vino, la vid y la embriaguez, a menudo asociado con las fiestas y el teatro.")
        ),
        BilingualQuestion(
            id = 20142, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Comment se nomme la Valkyrie principale de la mythologie nordique ?", listOf("Brynhildr", "Freyja", "Sif", "Idunn"), "Mythologie", "Brynhildr est la plus célèbre des Valkyries, apparaissant dans la légende des Nibelungen et la saga de Sigurd, où elle est punie pour désobéissance en étant plongée dans un sommeil magique."),
            en = LocalizedContent("What is the name of the main Valkyrie in Norse mythology?", listOf("Brynhildr", "Freyja", "Sif", "Idunn"), "Mythology", "Brynhildr is the most famous of the Valkyries, appearing in the legend of the Nibelungs and the saga of Sigurd, where she is punished for disobedience by being put into a magical sleep."),
            zh = LocalizedContent("北欧神话中主要的女武神叫什么？", listOf("布伦希尔德", "芙蕾雅", "西芙", "伊登"), "神话", "布伦希尔德是最著名的女武神，出现在尼伯龙根传说和西格德传奇中，因不服从命令而被施以魔法沉睡作为惩罚。"),
            es = LocalizedContent("¿Cómo se llama la Valkiria principal de la mitología nórdica?", listOf("Brunilda", "Freyja", "Sif", "Idunn"), "Mitología", "Brunilda es la más famosa de las Valkirias, aparece en la leyenda de los Nibelungos y la saga de Sigurd, donde es castigada por desobediencia siendo sumergida en un sueño mágico.")
        ),
        BilingualQuestion(
            id = 20143, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel monstre vivait au fond du lac de Lerne ?", listOf("L'Hydre", "Le Léviathan", "Scylla", "Charybde"), "Mythologie", "Dans la mythologie grecque, l'Hydre de Lerne était un serpent d'eau à plusieurs têtes vivant dans le lac de Lerne. Elle fut tuée par Héraclès lors de son deuxième travail."),
            en = LocalizedContent("Which monster lived at the bottom of the Lake of Lerna?", listOf("The Hydra", "Leviathan", "Scylla", "Charybdis"), "Mythology", "In Greek mythology, the Lernaean Hydra was a multi-headed water serpent living in the Lake of Lerna. It was killed by Heracles as his second labor."),
            zh = LocalizedContent("哪个怪物生活在勒拿湖底？", listOf("九头蛇", "利维坦", "斯库拉", "卡律布狄斯"), "神话", "在希腊神话中，勒拿九头蛇是一种多头水蛇，生活在勒拿湖中。它在赫拉克勒斯的第二项任务中被杀死。"),
            es = LocalizedContent("¿Qué monstruo vivía en el fondo del lago de Lerna?", listOf("La Hidra", "Leviatán", "Escila", "Caribdis"), "Mitología", "En la mitología griega, la Hidra de Lerna era una serpiente acuática de múltiples cabezas que vivía en el lago de Lerna. Fue asesinada por Heracles en su segundo trabajo.")
        ),
        BilingualQuestion(
            id = 20144, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel dieu mésopotamien est le héros de la première épopée connue ?", listOf("Gilgamesh", "Enkidu", "Marduk", "Enlil"), "Mythologie", "L'Épopée de Gilgamesh, écrite en cunéiforme sur des tablettes d'argile, est considérée comme la plus ancienne œuvre littéraire majeure connue, et elle raconte les aventures du roi légendaire Gilgamesh d'Uruk."),
            en = LocalizedContent("Which Mesopotamian god is the hero of the first known epic?", listOf("Gilgamesh", "Enkidu", "Marduk", "Enlil"), "Mythology", "The Epic of Gilgamesh, written in cuneiform on clay tablets, is considered the oldest known major literary work, and it recounts the adventures of the legendary king Gilgamesh of Uruk."),
            zh = LocalizedContent("哪位美索不达米亚神祇是已知第一部史诗的主人公？", listOf("吉尔伽美什", "恩奇都", "马尔杜克", "恩利尔"), "神话", "《吉尔伽美什史诗》以楔形文字写在泥板上，被认为是最早已知的重要文学作品，讲述了乌鲁克传奇国王吉尔伽美什的冒险故事。"),
            es = LocalizedContent("¿Qué dios mesopotámico es el héroe de la primera epopeya conocida?", listOf("Gilgamesh", "Enkidu", "Marduk", "Enlil"), "Mitología", "La Epopeya de Gilgamesh, escrita en cuneiforme sobre tablillas de arcilla, es considerada la obra literaria importante más antigua conocida, y narra las aventuras del legendario rey Gilgamesh de Uruk.")
        ),
        BilingualQuestion(
            id = 20145, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la boisson des dieux grecs ?", listOf("Le nectar", "L'ambroisie", "L'hydromel", "Le vin"), "Mythologie", "Dans la mythologie grecque, le nectar est la boisson divine qui confère l'immortalité aux dieux de l'Olympe, souvent accompagnée de l'ambroisie, leur nourriture."),
            en = LocalizedContent("What is the drink of the Greek gods?", listOf("Nectar", "Ambrosia", "Mead", "Wine"), "Mythology", "In Greek mythology, nectar is the divine drink that confers immortality to the gods of Olympus, often accompanied by ambrosia, their food."),
            zh = LocalizedContent("希腊诸神的饮品是什么？", listOf("琼浆", "仙馔", "蜂蜜酒", "葡萄酒"), "神话", "在希腊神话中，琼浆是赋予奥林匹斯众神不朽的神圣饮品，通常与他们的食物仙馔相伴。"),
            es = LocalizedContent("¿Cuál es la bebida de los dioses griegos?", listOf("El néctar", "La ambrosía", "El hidromiel", "El vino"), "Mitología", "En la mitología griega, el néctar es la bebida divina que confiere inmortalidad a los dioses del Olimpo, a menudo acompañada de la ambrosía, su alimento.")
        ),
        BilingualQuestion(
            id = 20146, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel dieu aztèque est le serpent à plumes ?", listOf("Quetzalcoatl", "Huitzilopochtli", "Tezcatlipoca", "Tlaloc"), "Mythologie", "Quetzalcoatl est l'une des divinités majeures des panthéons mésoaméricains, associé au vent, à la connaissance et à la création, et son nom signifie littéralement serpent à plumes en nahuatl."),
            en = LocalizedContent("Which Aztec god is the feathered serpent?", listOf("Quetzalcoatl", "Huitzilopochtli", "Tezcatlipoca", "Tlaloc"), "Mythology", "Quetzalcoatl is one of the major deities of Mesoamerican pantheons, associated with wind, knowledge, and creation, and his name literally means feathered serpent in Nahuatl."),
            zh = LocalizedContent("哪位阿兹特克神祇是羽蛇神？", listOf("克察尔科亚特尔", "维齐洛波奇特利", "特斯卡特利波卡", "特拉洛克"), "神话", "克察尔科亚特尔是中美洲万神殿中的主要神祇之一，与风、知识和创造相关，他的名字在纳瓦特尔语中字面意思是羽蛇。"),
            es = LocalizedContent("¿Qué dios azteca es la serpiente emplumada?", listOf("Quetzalcóatl", "Huitzilopochtli", "Tezcatlipoca", "Tláloc"), "Mitología", "Quetzalcóatl es una de las principales deidades de los panteones mesoamericanos, asociado con el viento, el conocimiento y la creación, y su nombre significa literalmente serpiente emplumada en náhuatl.")
        ),
        BilingualQuestion(
            id = 20147, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a tué le dragon Fáfnir dans la mythologie nordique ?", listOf("Sigurd (Siegfried)", "Thor", "Beowulf", "Ragnar"), "Mythologie", "Sigurd, héros de la mythologie nordique, tua le dragon Fáfnir en creusant une fosse et en le frappant au cœur, après avoir été conseillé par Odin."),
            en = LocalizedContent("Who killed the dragon Fafnir in Norse mythology?", listOf("Sigurd (Siegfried)", "Thor", "Beowulf", "Ragnar"), "Mythology", "Sigurd, hero of Norse mythology, killed the dragon Fafnir by digging a pit and striking him in the heart, after being advised by Odin."),
            zh = LocalizedContent("在北欧神话中，谁杀死了龙法夫尼尔？", listOf("西格德（齐格弗里德）", "托尔", "贝奥武夫", "拉格纳"), "神话", "北欧神话英雄西格德在奥丁的建议下，挖了一个坑并刺中龙法夫尼尔的心脏，将其杀死。"),
            es = LocalizedContent("¿Quién mató al dragón Fáfnir en la mitología nórdica?", listOf("Sigurd (Sigfrido)", "Thor", "Beowulf", "Ragnar"), "Mitología", "Sigurd, héroe de la mitología nórdica, mató al dragón Fáfnir cavando un foso y golpeándolo en el corazón, después de ser aconsejado por Odín.")
        ),
        BilingualQuestion(
            id = 20148, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel animal accompagne souvent Athéna ?", listOf("La chouette", "L'aigle", "Le serpent", "Le lion"), "Mythologie", "Dans la mythologie grecque, la chouette est l'attribut d'Athéna, déesse de la sagesse, symbolisant la connaissance et la clairvoyance."),
            en = LocalizedContent("Which animal often accompanies Athena?", listOf("The owl", "The eagle", "The snake", "The lion"), "Mythology", "In Greek mythology, the owl is the attribute of Athena, goddess of wisdom, symbolizing knowledge and foresight."),
            zh = LocalizedContent("哪种动物经常伴随雅典娜？", listOf("猫头鹰", "鹰", "蛇", "狮子"), "神话", "在希腊神话中，猫头鹰是智慧女神雅典娜的象征，代表知识和远见。"),
            es = LocalizedContent("¿Qué animal acompaña a menudo a Atenea?", listOf("El búho", "El águila", "La serpiente", "El león"), "Mitología", "En la mitología griega, el búho es el atributo de Atenea, diosa de la sabiduría, que simboliza el conocimiento y la clarividencia.")
        ),
        BilingualQuestion(
            id = 20149, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que l'Olympe dans la mythologie grecque ?", listOf("La montagne des dieux", "Le monde souterrain", "L'île des bienheureux", "La mer"), "Mythologie", "Dans la mythologie grecque, l'Olympe est le plus haut sommet de Grèce, considéré comme la demeure des douze dieux principaux, où ils vivent sous la direction de Zeus."),
            en = LocalizedContent("What is Olympus in Greek mythology?", listOf("The mountain of the gods", "The underworld", "The Isle of the Blessed", "The sea"), "Mythology", "In Greek mythology, Olympus is the highest mountain in Greece, considered the home of the twelve principal gods, where they live under the leadership of Zeus."),
            zh = LocalizedContent("在希腊神话中，奥林匹斯是什么？", listOf("众神之山", "冥界", "福岛", "海洋"), "神话", "在希腊神话中，奥林匹斯是希腊最高的山峰，被认为是十二主神的居所，他们在宙斯的领导下生活在那里。"),
            es = LocalizedContent("¿Qué es el Olimpo en la mitología griega?", listOf("La montaña de los dioses", "El inframundo", "La isla de los bienaventurados", "El mar"), "Mitología", "En la mitología griega, el Olimpo es la montaña más alta de Grecia, considerada el hogar de los doce dioses principales, donde viven bajo el liderazgo de Zeus.")
        ),
        BilingualQuestion(
            id = 20150, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fils de Poséidon était un cyclope ?", listOf("Polyphème", "Arion", "Triton", "Orion"), "Mythologie", "Dans la mythologie grecque, Polyphème est le plus célèbre des cyclopes, fils de Poséidon et de la nymphe Thoosa. Il apparaît notamment dans l'Odyssée d'Homère, où il est aveuglé par Ulysse."),
            en = LocalizedContent("Which son of Poseidon was a cyclops?", listOf("Polyphemus", "Arion", "Triton", "Orion"), "Mythology", "In Greek mythology, Polyphemus is the most famous of the cyclopes, son of Poseidon and the nymph Thoosa. He appears notably in Homer's Odyssey, where he is blinded by Odysseus."),
            zh = LocalizedContent("波塞冬的哪个儿子是独眼巨人？", listOf("波吕斐摩斯", "阿里翁", "特里同", "俄里翁"), "神话", "在希腊神话中，波吕斐摩斯是最著名的独眼巨人，是波塞冬和宁芙托俄萨的儿子。他特别出现在荷马的《奥德赛》中，被奥德修斯弄瞎。"),
            es = LocalizedContent("¿Qué hijo de Poseidón era un cíclope?", listOf("Polifemo", "Arion", "Tritón", "Orión"), "Mitología", "En la mitología griega, Polifemo es el más famoso de los cíclopes, hijo de Poseidón y la ninfa Toosa. Aparece notablemente en la Odisea de Homero, donde es cegado por Odiseo.")
        ),
        BilingualQuestion(
            id = 20202, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de pattes a une araignée ?", listOf("8", "6", "10", "12"), "Nature", "Les araignées appartiennent à la classe des arachnides, qui se distinguent des insectes par leurs huit pattes, contre six pour ces derniers."),
            en = LocalizedContent("How many legs does a spider have?", listOf("8", "6", "10", "12"), "Nature", "Spiders belong to the class Arachnida, which are distinguished from insects by having eight legs, compared to six for insects."),
            zh = LocalizedContent("蜘蛛有几条腿？", listOf("8", "6", "10", "12"), "自然", "蜘蛛属于蛛形纲，与昆虫的区别在于有八条腿，而昆虫有六条。"),
            es = LocalizedContent("¿Cuántas patas tiene una araña?", listOf("8", "6", "10", "12"), "Naturaleza", "Las arañas pertenecen a la clase de los arácnidos, que se distinguen de los insectos por tener ocho patas, frente a seis de estos últimos.")
        ),
        BilingualQuestion(
            id = 20203, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand mammifère marin ?", listOf("La baleine bleue", "Le cachalot", "L'orque", "Le requin-baleine"), "Nature", "La baleine bleue est le plus grand mammifère marin, pouvant atteindre 30 mètres de long et peser jusqu'à 200 tonnes, dépassant ainsi tous les autres animaux marins en taille."),
            en = LocalizedContent("What is the largest marine mammal?", listOf("Blue whale", "Sperm whale", "Orca", "Whale shark"), "Nature", "The blue whale is the largest marine mammal, reaching up to 30 meters in length and weighing up to 200 tons, surpassing all other marine animals in size."),
            zh = LocalizedContent("最大的海洋哺乳动物是什么？", listOf("蓝鲸", "抹香鲸", "虎鲸", "鲸鲨"), "自然", "蓝鲸是最大的海洋哺乳动物，体长可达30米，重达200吨，体型超过所有其他海洋动物。"),
            es = LocalizedContent("¿Cuál es el mamífero marino más grande?", listOf("La ballena azul", "El cachalote", "La orca", "El tiburón ballena"), "Naturaleza", "La ballena azul es el mamífero marino más grande, alcanzando hasta 30 metros de largo y pesando hasta 200 toneladas, superando en tamaño a todos los demás animales marinos.")
        ),
        BilingualQuestion(
            id = 20204, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de temps vit en moyenne une tortue géante des Galápagos ?", listOf("Plus de 100 ans", "50 ans", "30 ans", "200 ans"), "Nature", "Les tortues géantes des Galápagos sont parmi les animaux les plus longévifs, avec une espérance de vie dépassant souvent 100 ans, et certains spécimens atteignent 150 ans. Leur métabolisme lent et leur habitat protégé contribuent à cette longévité exceptionnelle."),
            en = LocalizedContent("How long does a Galápagos giant tortoise live on average?", listOf("Over 100 years", "50 years", "30 years", "200 years"), "Nature", "Galápagos giant tortoises are among the longest-lived animals, with a lifespan often exceeding 100 years, and some specimens reaching 150 years. Their slow metabolism and protected habitat contribute to this exceptional longevity."),
            zh = LocalizedContent("加拉帕戈斯象龟平均能活多久？", listOf("超过100年", "50年", "30年", "200年"), "自然", "加拉帕戈斯象龟是寿命最长的动物之一，寿命通常超过100年，有些个体可达150年。它们的新陈代谢缓慢和受保护的栖息地促成了这种非凡的长寿。"),
            es = LocalizedContent("¿Cuánto vive en promedio una tortuga gigante de Galápagos?", listOf("Más de 100 años", "50 años", "30 años", "200 años"), "Naturaleza", "Las tortugas gigantes de Galápagos se encuentran entre los animales más longevos, con una esperanza de vida que a menudo supera los 100 años, y algunos ejemplares alcanzan los 150 años. Su metabolismo lento y su hábitat protegido contribuyen a esta longevidad excepcional.")
        ),
        BilingualQuestion(
            id = 20205, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel arbre peut vivre le plus longtemps ?", listOf("Le pin Bristlecone (5000 ans)", "Le séquoia (3000 ans)", "Le chêne (1000 ans)", "Le baobab (2000 ans)"), "Nature", "Le pin Bristlecone, notamment le Pinus longaeva, est l’arbre non clonal le plus vieux au monde, certains spécimens dépassant 4 800 ans, grâce à sa croissance lente et à son adaptation aux conditions extrêmes."),
            en = LocalizedContent("Which tree can live the longest?", listOf("Bristlecone pine (5000 years)", "Sequoia (3000 years)", "Oak (1000 years)", "Baobab (2000 years)"), "Nature", "The bristlecone pine, especially Pinus longaeva, is the oldest non-clonal tree in the world, with some specimens exceeding 4,800 years, thanks to its slow growth and adaptation to extreme conditions."),
            zh = LocalizedContent("哪种树能活最久？", listOf("刺果松（5000年）", "红杉（3000年）", "橡树（1000年）", "猴面包树（2000年）"), "自然", "刺果松，特别是长寿松，是世界上最长寿的非克隆树，有些个体超过4800年，这得益于其缓慢的生长和对极端条件的适应。"),
            es = LocalizedContent("¿Qué árbol puede vivir más tiempo?", listOf("Pino bristlecone (5000 años)", "Secuoya (3000 años)", "Roble (1000 años)", "Baobab (2000 años)"), "Naturaleza", "El pino bristlecone, especialmente Pinus longaeva, es el árbol no clonal más antiguo del mundo, con algunos ejemplares que superan los 4.800 años, gracias a su crecimiento lento y adaptación a condiciones extremas.")
        ),
        BilingualQuestion(
            id = 20206, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus petit oiseau du monde ?", listOf("Le colibri-abeille", "Le roitelet", "Le mésange bleue", "Le troglodyte"), "Nature", "Le colibri-abeille, endémique de Cuba, mesure environ 5 à 6 centimètres de long et pèse moins de 2 grammes, ce qui en fait le plus petit oiseau du monde."),
            en = LocalizedContent("What is the smallest bird in the world?", listOf("Bee hummingbird", "Goldcrest", "Blue tit", "Wren"), "Nature", "The bee hummingbird, endemic to Cuba, measures about 5 to 6 centimeters in length and weighs less than 2 grams, making it the smallest bird in the world."),
            zh = LocalizedContent("世界上最小的鸟是什么？", listOf("吸蜜蜂鸟", "戴菊", "蓝山雀", "鹪鹩"), "自然", "吸蜜蜂鸟是古巴特有的鸟类，体长约5到6厘米，体重不到2克，是世界上最小的鸟。"),
            es = LocalizedContent("¿Cuál es el ave más pequeña del mundo?", listOf("Colibrí abeja", "Reyezuelo", "Herrerillo común", "Chochín"), "Naturaleza", "El colibrí abeja, endémico de Cuba, mide entre 5 y 6 centímetros de largo y pesa menos de 2 gramos, lo que lo convierte en el ave más pequeña del mundo.")
        ),
        BilingualQuestion(
            id = 20207, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'yeux a une abeille ?", listOf("5", "2", "4", "8"), "Nature", "Les abeilles possèdent deux grands yeux composés et trois petits yeux simples (ocelles) sur le sommet de la tête, ce qui leur donne un total de cinq yeux."),
            en = LocalizedContent("How many eyes does a bee have?", listOf("5", "2", "4", "8"), "Nature", "Bees have two large compound eyes and three small simple eyes (ocelli) on the top of their head, giving them a total of five eyes."),
            zh = LocalizedContent("蜜蜂有多少只眼睛？", listOf("5", "2", "4", "8"), "自然", "蜜蜂有两只大的复眼和三只小的单眼（眼点）位于头顶，总共五只眼睛。"),
            es = LocalizedContent("¿Cuántos ojos tiene una abeja?", listOf("5", "2", "4", "8"), "Naturaleza", "Las abejas tienen dos grandes ojos compuestos y tres pequeños ojos simples (ocelos) en la parte superior de la cabeza, lo que les da un total de cinco ojos.")
        ),
        BilingualQuestion(
            id = 20208, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel champignon est le plus mortel en France ?", listOf("L'amanite phalloïde", "L'amanite tue-mouches", "Le bolet satan", "La gyromitre"), "Nature", "L'amanite phalloïde est responsable de la majorité des intoxications mortelles par champignons en France. Son poison, l'amanitine, détruit le foie et les reins de manière irréversible."),
            en = LocalizedContent("Which mushroom is the deadliest in France?", listOf("Death cap", "Fly agaric", "Satan's bolete", "False morel"), "Nature", "The death cap is responsible for the majority of fatal mushroom poisonings in France. Its poison, amanitin, irreversibly destroys the liver and kidneys."),
            zh = LocalizedContent("法国最致命的蘑菇是什么？", listOf("毒鹅膏", "毒蝇伞", "魔牛肝菌", "鹿花菌"), "自然", "毒鹅膏是法国大多数致命蘑菇中毒事件的元凶。其毒素鹅膏毒肽会不可逆地破坏肝脏和肾脏。"),
            es = LocalizedContent("¿Qué hongo es el más mortal en Francia?", listOf("Amanita faloides", "Amanita muscaria", "Boleto satánico", "Gyromitra"), "Naturaleza", "La amanita faloides es responsable de la mayoría de las intoxicaciones mortales por hongos en Francia. Su veneno, la amanitina, destruye el hígado y los riñones de forma irreversible.")
        ),
        BilingualQuestion(
            id = 20210, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de litres d'eau un éléphant peut-il boire par jour ?", listOf("200 litres", "50 litres", "100 litres", "500 litres"), "Nature", "Un éléphant adulte peut boire jusqu'à 200 litres d'eau par jour pour s'hydrater et réguler sa température corporelle, notamment dans les savanes africaines où les ressources en eau sont parfois rares."),
            en = LocalizedContent("How many liters of water can an elephant drink per day?", listOf("200 liters", "50 liters", "100 liters", "500 liters"), "Nature", "An adult elephant can drink up to 200 liters of water per day to hydrate and regulate its body temperature, especially in African savannas where water resources are sometimes scarce."),
            zh = LocalizedContent("一头大象每天能喝多少升水？", listOf("200升", "50升", "100升", "500升"), "自然", "一头成年大象每天可饮用多达200升水，以补充水分和调节体温，尤其是在水资源有时稀缺的非洲稀树草原。"),
            es = LocalizedContent("¿Cuántos litros de agua puede beber un elefante al día?", listOf("200 litros", "50 litros", "100 litros", "500 litros"), "Naturaleza", "Un elefante adulto puede beber hasta 200 litros de agua al día para hidratarse y regular su temperatura corporal, especialmente en las sabanas africanas donde los recursos hídricos a veces son escasos.")
        ),
        BilingualQuestion(
            id = 20211, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle fleur s'ouvre la nuit et se referme le jour ?", listOf("La belle-de-nuit", "Le tournesol", "La rose", "Le lys"), "Nature", "La belle-de-nuit, ou Mirabilis jalapa, doit son nom à ses fleurs qui s’épanouissent en fin d’après-midi et restent ouvertes toute la nuit."),
            en = LocalizedContent("Which flower opens at night and closes during the day?", listOf("Four o'clock flower", "Sunflower", "Rose", "Lily"), "Nature", "The four o'clock flower, or Mirabilis jalapa, gets its name from its flowers that bloom in the late afternoon and remain open all night."),
            zh = LocalizedContent("哪种花在夜间开放，白天闭合？", listOf("紫茉莉", "向日葵", "玫瑰", "百合"), "自然", "紫茉莉，又名Mirabilis jalapa，因其花朵在傍晚开放并整夜盛开而得名。"),
            es = LocalizedContent("¿Qué flor se abre por la noche y se cierra durante el día?", listOf("Dondiego de noche", "Girasol", "Rosa", "Lirio"), "Naturaleza", "El dondiego de noche, o Mirabilis jalapa, debe su nombre a sus flores que se abren al final de la tarde y permanecen abiertas toda la noche.")
        ),
        BilingualQuestion(
            id = 20212, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel insecte produit de la soie ?", listOf("Le ver à soie (Bombyx)", "L'araignée", "La cochenille", "Le papillon"), "Nature", "Le ver à soie, ou Bombyx mori, est la chenille d’un papillon domestiqué spécifiquement pour la production de soie. Il file un cocon de fil de soie pour se nymphoser, fil que l’on récolte et dévide pour fabriquer le textile."),
            en = LocalizedContent("Which insect produces silk?", listOf("Silkworm (Bombyx)", "Spider", "Cochineal", "Butterfly"), "Nature", "The silkworm, or Bombyx mori, is the caterpillar of a domesticated moth specifically bred for silk production. It spins a silk cocoon to pupate, which is harvested and unwound to make the textile."),
            zh = LocalizedContent("哪种昆虫产丝？", listOf("蚕（家蚕）", "蜘蛛", "胭脂虫", "蝴蝶"), "自然", "蚕，即家蚕，是一种专门为产丝而驯化的蛾的幼虫。它吐丝结茧以化蛹，人们收集并抽丝来制作纺织品。"),
            es = LocalizedContent("¿Qué insecto produce seda?", listOf("Gusano de seda (Bombyx)", "Araña", "Cochinilla", "Mariposa"), "Naturaleza", "El gusano de seda, o Bombyx mori, es la oruga de una polilla domesticada específicamente para la producción de seda. Teje un capullo de seda para pupar, que se recolecta y se devana para fabricar el textil.")
        ),
        BilingualQuestion(
            id = 20213, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le poisson le plus rapide de l'océan ?", listOf("Le voilier (110 km/h)", "Le thon (80 km/h)", "L'espadon (90 km/h)", "Le barracuda (60 km/h)"), "Nature", "Le voilier peut atteindre 110 km/h grâce à sa grande nageoire dorsale qui se replie pour réduire la traînée et à son corps fuselé."),
            en = LocalizedContent("What is the fastest fish in the ocean?", listOf("Sailfish (110 km/h)", "Tuna (80 km/h)", "Swordfish (90 km/h)", "Barracuda (60 km/h)"), "Nature", "The sailfish can reach 110 km/h thanks to its large dorsal fin that folds down to reduce drag and its streamlined body."),
            zh = LocalizedContent("海洋中速度最快的鱼是什么？", listOf("旗鱼（110公里/小时）", "金枪鱼（80公里/小时）", "剑鱼（90公里/小时）", "梭鱼（60公里/小时）"), "自然", "旗鱼可达110公里/小时，这得益于其巨大的背鳍可折叠以减少阻力，以及流线型的身体。"),
            es = LocalizedContent("¿Cuál es el pez más rápido del océano?", listOf("Pez vela (110 km/h)", "Atún (80 km/h)", "Pez espada (90 km/h)", "Barracuda (60 km/h)"), "Naturaleza", "El pez vela puede alcanzar 110 km/h gracias a su gran aleta dorsal que se pliega para reducir la resistencia y su cuerpo aerodinámico.")
        ),
        BilingualQuestion(
            id = 20214, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de pattes a un mille-pattes en réalité ?", listOf("Entre 30 et 354", "Exactement 1000", "Entre 500 et 750", "Moins de 20"), "Nature", "Le nom \"mille-pattes\" est trompeur : aucune espèce n'atteint ce nombre. Le record se situe entre 30 et 354 pattes selon l'espèce, car leur nombre varie avec l'âge et la segmentation du corps."),
            en = LocalizedContent("How many legs does a millipede actually have?", listOf("Between 30 and 354", "Exactly 1000", "Between 500 and 750", "Less than 20"), "Nature", "The name \"millipede\" is misleading: no species reaches that number. The record is between 30 and 354 legs depending on the species, as their number varies with age and body segmentation."),
            zh = LocalizedContent("千足虫实际上有多少条腿？", listOf("30到354条之间", "正好1000条", "500到750条之间", "少于20条"), "自然", "“千足虫”这个名字具有误导性：没有物种能达到这个数字。根据物种不同，腿的数量在30到354条之间，因为腿的数量随年龄和身体分节而变化。"),
            es = LocalizedContent("¿Cuántas patas tiene realmente un milpiés?", listOf("Entre 30 y 354", "Exactamente 1000", "Entre 500 y 750", "Menos de 20"), "Naturaleza", "El nombre \"milpiés\" es engañoso: ninguna especie alcanza ese número. El récord está entre 30 y 354 patas según la especie, ya que su número varía con la edad y la segmentación del cuerpo.")
        ),
        BilingualQuestion(
            id = 20215, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel animal peut dormir debout ?", listOf("Le cheval", "Le chat", "Le chien", "Le lapin"), "Nature", "Les chevaux possèdent un système de verrouillage dans leurs pattes appelé \"appareil de soutien\", leur permettant de dormir debout sans s'effondrer. Cela leur offre une meilleure vigilance face aux prédateurs."),
            en = LocalizedContent("Which animal can sleep standing up?", listOf("Horse", "Cat", "Dog", "Rabbit"), "Nature", "Horses have a locking system in their legs called the \"stay apparatus,\" allowing them to sleep standing up without collapsing. This provides better vigilance against predators."),
            zh = LocalizedContent("哪种动物可以站着睡觉？", listOf("马", "猫", "狗", "兔子"), "自然", "马的腿部有一种称为“锁定装置”的系统，使它们能够站着睡觉而不倒下。这使它们能更好地警惕捕食者。"),
            es = LocalizedContent("¿Qué animal puede dormir de pie?", listOf("El caballo", "El gato", "El perro", "El conejo"), "Naturaleza", "Los caballos poseen un sistema de bloqueo en sus patas llamado \"aparato de sostén\", que les permite dormir de pie sin derrumbarse. Esto les proporciona una mejor vigilancia frente a los depredadores.")
        ),
        BilingualQuestion(
            id = 20216, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand organe d'un arbre ?", listOf("Les racines", "Le tronc", "Les feuilles", "L'écorce"), "Nature", "Les racines d'un arbre constituent son plus grand organe car elles s'étendent souvent bien au-delà du houppier, formant un réseau souterrain parfois plus volumineux que la partie visible."),
            en = LocalizedContent("What is the largest organ of a tree?", listOf("Roots", "Trunk", "Leaves", "Bark"), "Nature", "The roots of a tree constitute its largest organ because they often extend far beyond the crown, forming an underground network sometimes larger than the visible part."),
            zh = LocalizedContent("树最大的器官是什么？", listOf("根", "树干", "叶子", "树皮"), "自然", "树的根是其最大的器官，因为它们通常延伸到树冠之外很远，形成的地下网络有时比可见部分还要大。"),
            es = LocalizedContent("¿Cuál es el órgano más grande de un árbol?", listOf("Las raíces", "El tronco", "Las hojas", "La corteza"), "Naturaleza", "Las raíces de un árbol constituyen su órgano más grande, ya que a menudo se extienden mucho más allá de la copa, formando una red subterránea a veces más voluminosa que la parte visible.")
        ),
        BilingualQuestion(
            id = 20217, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal a les empreintes digitales similaires à celles de l'homme ?", listOf("Le koala", "Le singe", "Le raton laveur", "Le panda"), "Nature", "Les koalas possèdent des crêtes papillaires sur leurs doigts, formant des motifs uniques et complexes, très semblables aux empreintes digitales humaines."),
            en = LocalizedContent("Which animal has fingerprints similar to humans?", listOf("Koala", "Monkey", "Raccoon", "Panda"), "Nature", "Koalas have papillary ridges on their fingers, forming unique and complex patterns very similar to human fingerprints."),
            zh = LocalizedContent("哪种动物的指纹与人类相似？", listOf("考拉", "猴子", "浣熊", "熊猫"), "自然", "考拉的手指上有乳头状脊线，形成独特而复杂的图案，与人类的指纹非常相似。"),
            es = LocalizedContent("¿Qué animal tiene huellas dactilares similares a las humanas?", listOf("El koala", "El mono", "El mapache", "El panda"), "Naturaleza", "Los koalas poseen crestas papilares en sus dedos, formando patrones únicos y complejos, muy similares a las huellas dactilares humanas.")
        ),
        BilingualQuestion(
            id = 20218, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de cœurs a une pieuvre ?", listOf("3", "1", "2", "5"), "Nature", "Les pieuvres ont trois cœurs : deux branchiaux qui pompent le sang vers les branchies et un systémique qui l'envoie vers le reste du corps."),
            en = LocalizedContent("How many hearts does an octopus have?", listOf("3", "1", "2", "5"), "Nature", "Octopuses have three hearts: two branchial hearts that pump blood to the gills and one systemic heart that sends it to the rest of the body."),
            zh = LocalizedContent("章鱼有几个心脏？", listOf("3", "1", "2", "5"), "自然", "章鱼有三个心脏：两个鳃心将血液泵送到鳃，一个体心将血液输送到身体其他部位。"),
            es = LocalizedContent("¿Cuántos corazones tiene un pulpo?", listOf("3", "1", "2", "5"), "Naturaleza", "Los pulpos tienen tres corazones: dos branquiales que bombean sangre a las branquias y uno sistémico que la envía al resto del cuerpo.")
        ),
        BilingualQuestion(
            id = 20219, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le seul continent sans désert ?", listOf("L'Europe", "L'Amérique du Sud", "L'Asie", "L'Océanie"), "Nature", "L'Europe est le seul continent dépourvu de désert aride, car son climat tempéré et ses précipitations régulières empêchent la formation de vastes zones de sable ou de roches sèches."),
            en = LocalizedContent("Which is the only continent without a desert?", listOf("Europe", "South America", "Asia", "Oceania"), "Nature", "Europe is the only continent without an arid desert, as its temperate climate and regular rainfall prevent the formation of vast areas of sand or dry rocks."),
            zh = LocalizedContent("哪个是唯一没有沙漠的大洲？", listOf("欧洲", "南美洲", "亚洲", "大洋洲"), "自然", "欧洲是唯一没有干旱沙漠的大洲，因为其温带气候和定期降水阻止了广阔沙地或干燥岩石区域的形成。"),
            es = LocalizedContent("¿Cuál es el único continente sin desierto?", listOf("Europa", "América del Sur", "Asia", "Oceanía"), "Naturaleza", "Europa es el único continente sin desierto árido, ya que su clima templado y sus precipitaciones regulares impiden la formación de vastas zonas de arena o rocas secas.")
        ),
        BilingualQuestion(
            id = 20220, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus petit mammifère du monde ?", listOf("La musaraigne étrusque", "Le colibri", "La chauve-souris bourdon", "La souris pygmée"), "Nature", "La musaraigne étrusque pèse en moyenne 1,8 gramme et mesure environ 3,5 centimètres de long, ce qui en fait le plus petit mammifère connu par sa masse corporelle."),
            en = LocalizedContent("What is the smallest mammal in the world?", listOf("Etruscan shrew", "Hummingbird", "Bumblebee bat", "Pygmy mouse"), "Nature", "The Etruscan shrew weighs on average 1.8 grams and measures about 3.5 centimeters in length, making it the smallest known mammal by body mass."),
            zh = LocalizedContent("世界上最小的哺乳动物是什么？", listOf("小臭鼩", "蜂鸟", "大黄蜂蝙蝠", "侏儒鼠"), "自然", "小臭鼩平均重1.8克，长约3.5厘米，按体重计算是已知最小的哺乳动物。"),
            es = LocalizedContent("¿Cuál es el mamífero más pequeño del mundo?", listOf("La musaraña etrusca", "El colibrí", "El murciélago abejorro", "El ratón pigmeo"), "Naturaleza", "La musaraña etrusca pesa en promedio 1,8 gramos y mide aproximadamente 3,5 centímetros de largo, lo que la convierte en el mamífero más pequeño conocido por su masa corporal.")
        ),
        BilingualQuestion(
            id = 20221, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de temps un caméléon met-il pour changer de couleur ?", listOf("20 secondes environ", "1 seconde", "5 minutes", "1 heure"), "Nature", "Le changement de couleur chez le caméléon est un processus physiologique lent, contrôlé par des cellules cutanées appelées chromatophores, qui nécessite environ 20 secondes pour se réaliser complètement."),
            en = LocalizedContent("How long does it take for a chameleon to change color?", listOf("About 20 seconds", "1 second", "5 minutes", "1 hour"), "Nature", "Color change in chameleons is a slow physiological process, controlled by skin cells called chromatophores, which takes about 20 seconds to complete."),
            zh = LocalizedContent("变色龙变色需要多长时间？", listOf("大约20秒", "1秒", "5分钟", "1小时"), "自然", "变色龙的变色是一个缓慢的生理过程，由称为色素细胞的皮肤细胞控制，大约需要20秒才能完成。"),
            es = LocalizedContent("¿Cuánto tiempo tarda un camaleón en cambiar de color?", listOf("Unos 20 segundos", "1 segundo", "5 minutos", "1 hora"), "Naturaleza", "El cambio de color en los camaleones es un proceso fisiológico lento, controlado por células cutáneas llamadas cromatóforos, que tarda aproximadamente 20 segundos en completarse.")
        ),
        BilingualQuestion(
            id = 20222, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gaz produit l'effet de serre le plus puissant ?", listOf("Le méthane", "Le CO2", "L'ozone", "La vapeur d'eau"), "Nature", "Le méthane a un potentiel de réchauffement global environ 28 fois supérieur à celui du CO₂ sur 100 ans, ce qui en fait le gaz à effet de serre le plus puissant, bien qu'il soit moins abondant."),
            en = LocalizedContent("Which gas produces the most powerful greenhouse effect?", listOf("Methane", "CO2", "Ozone", "Water vapor"), "Nature", "Methane has a global warming potential about 28 times greater than CO₂ over 100 years, making it the most powerful greenhouse gas, although it is less abundant."),
            zh = LocalizedContent("哪种气体产生的温室效应最强？", listOf("甲烷", "二氧化碳", "臭氧", "水蒸气"), "自然", "甲烷在100年内的全球变暖潜能值约为二氧化碳的28倍，使其成为最强的温室气体，尽管其含量较少。"),
            es = LocalizedContent("¿Qué gas produce el efecto invernadero más potente?", listOf("El metano", "El CO2", "El ozono", "El vapor de agua"), "Naturaleza", "El metano tiene un potencial de calentamiento global aproximadamente 28 veces superior al del CO₂ en 100 años, lo que lo convierte en el gas de efecto invernadero más potente, aunque es menos abundante.")
        ),
        BilingualQuestion(
            id = 20224, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de cerveaux a un poulpe ?", listOf("9", "1", "3", "5"), "Nature", "Le poulpe possède un cerveau principal et huit ganglions nerveux situés dans chacun de ses bras, ce qui lui confère une intelligence répartie et une grande autonomie des tentacules."),
            en = LocalizedContent("How many brains does an octopus have?", listOf("9", "1", "3", "5"), "Nature", "The octopus has one main brain and eight nerve ganglia located in each of its arms, giving it distributed intelligence and great autonomy of the tentacles."),
            zh = LocalizedContent("章鱼有几个大脑？", listOf("9", "1", "3", "5"), "自然", "章鱼有一个主脑和八个位于每条触手中的神经节，使其具有分布式智能和触手的自主性。"),
            es = LocalizedContent("¿Cuántos cerebros tiene un pulpo?", listOf("9", "1", "3", "5"), "Naturaleza", "El pulpo posee un cerebro principal y ocho ganglios nerviosos situados en cada uno de sus brazos, lo que le confiere una inteligencia distribuida y una gran autonomía de los tentáculos.")
        ),
        BilingualQuestion(
            id = 20225, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus long fleuve d'Afrique ?", listOf("Le Nil", "Le Congo", "Le Niger", "Le Zambèze"), "Nature", "Le Nil s'étend sur environ 6 650 kilomètres, traversant onze pays d'Afrique de l'Est et du Nord-Est, ce qui en fait le plus long fleuve du continent africain."),
            en = LocalizedContent("What is the longest river in Africa?", listOf("The Nile", "The Congo", "The Niger", "The Zambezi"), "Nature", "The Nile stretches about 6,650 kilometers, crossing eleven countries in East and Northeast Africa, making it the longest river on the African continent."),
            zh = LocalizedContent("非洲最长的河流是什么？", listOf("尼罗河", "刚果河", "尼日尔河", "赞比西河"), "自然", "尼罗河长约6650公里，流经东非和东北非的十一个国家，是非洲大陆最长的河流。"),
            es = LocalizedContent("¿Cuál es el río más largo de África?", listOf("El Nilo", "El Congo", "El Níger", "El Zambeze"), "Naturaleza", "El Nilo se extiende aproximadamente 6.650 kilómetros, atravesando once países de África Oriental y Nororiental, lo que lo convierte en el río más largo del continente africano.")
        ),
        BilingualQuestion(
            id = 20226, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel animal est le symbole du WWF ?", listOf("Le panda géant", "L'ours polaire", "Le tigre", "La baleine"), "Nature", "Le panda géant est l'emblème du WWF depuis sa création en 1961, car cet animal menacé d'extinction symbolise parfaitement la mission de l'organisation pour la protection de la faune sauvage."),
            en = LocalizedContent("Which animal is the symbol of WWF?", listOf("Giant panda", "Polar bear", "Tiger", "Whale"), "Nature", "The giant panda has been the emblem of WWF since its creation in 1961, as this endangered animal perfectly symbolizes the organization's mission to protect wildlife."),
            zh = LocalizedContent("哪个动物是世界自然基金会的象征？", listOf("大熊猫", "北极熊", "老虎", "鲸鱼"), "自然", "大熊猫自1961年世界自然基金会成立以来一直是其标志，因为这种濒危动物完美地体现了该组织保护野生动物的使命。"),
            es = LocalizedContent("¿Qué animal es el símbolo del WWF?", listOf("El panda gigante", "El oso polar", "El tigre", "La ballena"), "Naturaleza", "El panda gigante es el emblema del WWF desde su creación en 1961, ya que este animal amenazado de extinción simboliza perfectamente la misión de la organización para la protección de la fauna salvaje.")
        ),
        BilingualQuestion(
            id = 20227, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la plus grande forêt tropicale du monde ?", listOf("L'Amazonie", "Le bassin du Congo", "Bornéo", "La forêt de Daintree"), "Nature", "L'Amazonie s'étend sur environ 5,5 millions de km², traversant neuf pays d'Amérique du Sud, ce qui en fait la plus vaste forêt tropicale de la planète."),
            en = LocalizedContent("What is the largest tropical rainforest in the world?", listOf("Amazon", "Congo Basin", "Borneo", "Daintree Rainforest"), "Nature", "The Amazon spans approximately 5.5 million km², crossing nine South American countries, making it the largest tropical rainforest on the planet."),
            zh = LocalizedContent("世界上最大的热带雨林是什么？", listOf("亚马逊雨林", "刚果盆地", "婆罗洲", "丹特里雨林"), "自然", "亚马逊雨林面积约550万平方公里，横跨南美洲九个国家，是地球上最大的热带雨林。"),
            es = LocalizedContent("¿Cuál es la selva tropical más grande del mundo?", listOf("El Amazonas", "La cuenca del Congo", "Borneo", "El bosque de Daintree"), "Naturaleza", "El Amazonas se extiende por aproximadamente 5,5 millones de km², atravesando nueve países de América del Sur, lo que lo convierte en la selva tropical más grande del planeta.")
        ),
        BilingualQuestion(
            id = 20228, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal migre la plus longue distance ?", listOf("La sterne arctique", "La baleine grise", "Le papillon monarque", "Le caribou"), "Nature", "La sterne arctique effectue une migration annuelle de l'Arctique à l'Antarctique, parcourant environ 70 000 kilomètres, soit la plus longue distance de tous les animaux."),
            en = LocalizedContent("Which animal migrates the longest distance?", listOf("Arctic tern", "Gray whale", "Monarch butterfly", "Caribou"), "Nature", "The Arctic tern makes an annual migration from the Arctic to the Antarctic, covering about 70,000 kilometers, the longest distance of any animal."),
            zh = LocalizedContent("哪种动物迁徙距离最长？", listOf("北极燕鸥", "灰鲸", "帝王蝶", "驯鹿"), "自然", "北极燕鸥每年从北极迁徙到南极，行程约7万公里，是所有动物中迁徙距离最长的。"),
            es = LocalizedContent("¿Qué animal migra la distancia más larga?", listOf("El charrán ártico", "La ballena gris", "La mariposa monarca", "El caribú"), "Naturaleza", "El charrán ártico realiza una migración anual desde el Ártico hasta la Antártida, recorriendo aproximadamente 70.000 kilómetros, la distancia más larga de todos los animales.")
        ),
        BilingualQuestion(
            id = 20229, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le seul mammifère capable de voler véritablement ?", listOf("La chauve-souris", "L'écureuil volant", "Le colugo", "Le sucre glider"), "Nature", "Les chauves-souris sont les seuls mammifères capables de vol actif grâce à leurs ailes formées d'une membrane cutanée, contrairement aux autres mammifères volants comme les écureuils qui ne font que planer."),
            en = LocalizedContent("What is the only mammal capable of true flight?", listOf("Bat", "Flying squirrel", "Colugo", "Sugar glider"), "Nature", "Bats are the only mammals capable of active flight thanks to their wings formed by a skin membrane, unlike other flying mammals like squirrels that only glide."),
            zh = LocalizedContent("唯一能真正飞行的哺乳动物是什么？", listOf("蝙蝠", "飞鼠", "鼯猴", "蜜袋鼯"), "自然", "蝙蝠是唯一能够主动飞行的哺乳动物，它们的翅膀由皮肤膜形成，而其他会飞的哺乳动物如飞鼠只能滑翔。"),
            es = LocalizedContent("¿Cuál es el único mamífero capaz de volar realmente?", listOf("El murciélago", "La ardilla voladora", "El colugo", "El petauro del azúcar"), "Naturaleza", "Los murciélagos son los únicos mamíferos capaces de vuelo activo gracias a sus alas formadas por una membrana cutánea, a diferencia de otros mamíferos voladores como las ardillas que solo planean.")
        ),
        BilingualQuestion(
            id = 20230, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de dents un requin peut-il avoir au cours de sa vie ?", listOf("Plus de 30 000", "Environ 500", "Environ 5 000", "Environ 100"), "Nature", "Les requins perdent et remplacent continuellement leurs dents tout au long de leur vie, certaines espèces pouvant renouveler jusqu'à 30 000 dents en cumulé."),
            en = LocalizedContent("How many teeth can a shark have in its lifetime?", listOf("Over 30,000", "About 500", "About 5,000", "About 100"), "Nature", "Sharks continuously lose and replace their teeth throughout their lives, with some species replacing up to 30,000 teeth in total."),
            zh = LocalizedContent("一条鲨鱼一生中能有多少颗牙齿？", listOf("超过3万颗", "大约500颗", "大约5000颗", "大约100颗"), "自然", "鲨鱼一生中不断脱落并更换牙齿，某些物种累计可更换多达3万颗牙齿。"),
            es = LocalizedContent("¿Cuántos dientes puede tener un tiburón a lo largo de su vida?", listOf("Más de 30.000", "Alrededor de 500", "Alrededor de 5.000", "Alrededor de 100"), "Naturaleza", "Los tiburones pierden y reemplazan continuamente sus dientes a lo largo de su vida, y algunas especies pueden renovar hasta 30.000 dientes en total.")
        ),
        BilingualQuestion(
            id = 20231, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle plante carnivore est la plus connue ?", listOf("La dionée attrape-mouches", "Le népenthès", "La sarracénie", "La drosera"), "Nature", "La dionée attrape-mouches est la plus célèbre des plantes carnivores en raison de son mécanisme spectaculaire de piège à mâchoires, qui se referme en une fraction de seconde sur ses proies."),
            en = LocalizedContent("Which carnivorous plant is the most well-known?", listOf("Venus flytrap", "Nepenthes", "Sarracenia", "Drosera"), "Nature", "The Venus flytrap is the most famous carnivorous plant due to its spectacular jaw-like trap mechanism, which closes in a fraction of a second on its prey."),
            zh = LocalizedContent("哪种食肉植物最著名？", listOf("捕蝇草", "猪笼草", "瓶子草", "茅膏菜"), "自然", "捕蝇草是最著名的食肉植物，因为它具有壮观的捕虫夹机制，能在瞬间闭合捕捉猎物。"),
            es = LocalizedContent("¿Qué planta carnívora es la más conocida?", listOf("La Venus atrapamoscas", "La Nepenthes", "La Sarracenia", "La Drosera"), "Naturaleza", "La Venus atrapamoscas es la más famosa de las plantas carnívoras debido a su espectacular mecanismo de trampa de mandíbulas, que se cierra en una fracción de segundo sobre sus presas.")
        ),
        BilingualQuestion(
            id = 20232, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le volcan le plus actif du monde ?", listOf("Le Kilauea (Hawaï)", "L'Etna (Italie)", "Le Stromboli (Italie)", "Le Piton de la Fournaise"), "Nature", "Le Kilauea est considéré comme le volcan le plus actif du monde en raison de ses éruptions quasi continues depuis 1983, avec des coulées de lave fréquentes qui modifient régulièrement le paysage de l'île d'Hawaï."),
            en = LocalizedContent("What is the most active volcano in the world?", listOf("Kilauea (Hawaii)", "Mount Etna (Italy)", "Stromboli (Italy)", "Piton de la Fournaise"), "Nature", "Kilauea is considered the most active volcano in the world due to its nearly continuous eruptions since 1983, with frequent lava flows that regularly reshape the landscape of the Big Island of Hawaii."),
            zh = LocalizedContent("世界上最活跃的火山是什么？", listOf("基拉韦厄火山（夏威夷）", "埃特纳火山（意大利）", "斯特龙博利火山（意大利）", "富尔奈斯火山"), "自然", "基拉韦厄火山被认为是世界上最活跃的火山，自1983年以来几乎持续喷发，频繁的熔岩流不断改变夏威夷大岛的地貌。"),
            es = LocalizedContent("¿Cuál es el volcán más activo del mundo?", listOf("El Kilauea (Hawái)", "El Etna (Italia)", "El Stromboli (Italia)", "El Piton de la Fournaise"), "Naturaleza", "El Kilauea es considerado el volcán más activo del mundo debido a sus erupciones casi continuas desde 1983, con frecuentes coladas de lava que modifican regularmente el paisaje de la isla de Hawái.")
        ),
        BilingualQuestion(
            id = 20233, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal produit la substance la plus venimeuse ?", listOf("La méduse-boîte", "Le serpent Taïpan", "La grenouille poison", "Le scorpion"), "Nature", "Le venin de la méduse-boîte, présent dans ses tentacules, est considéré comme le plus mortel au monde, pouvant tuer un humain en quelques minutes."),
            en = LocalizedContent("Which animal produces the most venomous substance?", listOf("Box jellyfish", "Taipan snake", "Poison dart frog", "Scorpion"), "Nature", "The venom of the box jellyfish, found in its tentacles, is considered the most deadly in the world, capable of killing a human in minutes."),
            zh = LocalizedContent("哪种动物产生的物质毒性最强？", listOf("箱形水母", "太攀蛇", "箭毒蛙", "蝎子"), "自然", "箱形水母触手中的毒液被认为是世界上最致命的，能在几分钟内杀死一个人。"),
            es = LocalizedContent("¿Qué animal produce la sustancia más venenosa?", listOf("La medusa de caja", "La serpiente taipán", "La rana venenosa", "El escorpión"), "Naturaleza", "El veneno de la medusa de caja, presente en sus tentáculos, es considerado el más mortal del mundo, capaz de matar a un humano en minutos.")
        ),
        BilingualQuestion(
            id = 20234, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien pèse approximativement un cerveau humain adulte ?", listOf("1,4 kg", "0,5 kg", "2,5 kg", "3 kg"), "Nature", "Le cerveau humain adulte pèse en moyenne entre 1,3 et 1,4 kg, soit environ 2% du poids total du corps. Ce poids varie légèrement selon le sexe et la taille de l'individu."),
            en = LocalizedContent("Approximately how much does an adult human brain weigh?", listOf("1.4 kg", "0.5 kg", "2.5 kg", "3 kg"), "Nature", "The adult human brain weighs on average between 1.3 and 1.4 kg, about 2% of total body weight. This weight varies slightly depending on the individual's sex and size."),
            zh = LocalizedContent("成年人类大脑大约重多少？", listOf("1.4公斤", "0.5公斤", "2.5公斤", "3公斤"), "自然", "成年人类大脑平均重量在1.3到1.4公斤之间，约占体重的2%。这个重量因个体的性别和体型略有差异。"),
            es = LocalizedContent("¿Cuánto pesa aproximadamente un cerebro humano adulto?", listOf("1,4 kg", "0,5 kg", "2,5 kg", "3 kg"), "Naturaleza", "El cerebro humano adulto pesa en promedio entre 1,3 y 1,4 kg, aproximadamente el 2% del peso total del cuerpo. Este peso varía ligeramente según el sexo y la talla del individuo.")
        ),
        BilingualQuestion(
            id = 20235, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'écosystème le plus productif de la planète ?", listOf("Les récifs coralliens", "Les forêts tropicales", "Les prairies", "Les océans profonds"), "Nature", "Les récifs coralliens abritent une biodiversité extrêmement dense et des taux de photosynthèse élevés, ce qui en fait les écosystèmes les plus productifs par mètre carré, surpassant même les forêts tropicales."),
            en = LocalizedContent("What is the most productive ecosystem on the planet?", listOf("Coral reefs", "Tropical forests", "Grasslands", "Deep oceans"), "Nature", "Coral reefs harbor extremely dense biodiversity and high rates of photosynthesis, making them the most productive ecosystems per square meter, surpassing even tropical forests."),
            zh = LocalizedContent("地球上生产力最高的生态系统是什么？", listOf("珊瑚礁", "热带森林", "草原", "深海"), "自然", "珊瑚礁拥有极其密集的生物多样性和高光合作用率，使其成为每平方米生产力最高的生态系统，甚至超过热带森林。"),
            es = LocalizedContent("¿Cuál es el ecosistema más productivo del planeta?", listOf("Los arrecifes de coral", "Los bosques tropicales", "Las praderas", "Los océanos profundos"), "Naturaleza", "Los arrecifes de coral albergan una biodiversidad extremadamente densa y altas tasas de fotosíntesis, lo que los convierte en los ecosistemas más productivos por metro cuadrado, superando incluso a los bosques tropicales.")
        ),
    )

    private fun part5(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 20236, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal utilise des outils dans la nature ?", listOf("Le corbeau", "Le lion", "L'éléphant", "Le dauphin"), "Nature", "Les corbeaux, notamment les corbeaux de Nouvelle-Calédonie, sont célèbres pour fabriquer et utiliser des brindilles afin d’extraire des insectes de troncs d’arbres."),
            en = LocalizedContent("Which animal uses tools in nature?", listOf("Crow", "Lion", "Elephant", "Dolphin"), "Nature", "Crows, especially New Caledonian crows, are famous for making and using twigs to extract insects from tree trunks."),
            zh = LocalizedContent("哪种动物在自然界中使用工具？", listOf("乌鸦", "狮子", "大象", "海豚"), "自然", "乌鸦，特别是新喀里多尼亚乌鸦，以制造和使用树枝从树干中提取昆虫而闻名。"),
            es = LocalizedContent("¿Qué animal utiliza herramientas en la naturaleza?", listOf("El cuervo", "El león", "El elefante", "El delfín"), "Naturaleza", "Los cuervos, especialmente los cuervos de Nueva Caledonia, son famosos por fabricar y usar ramitas para extraer insectos de los troncos de los árboles.")
        ),
        BilingualQuestion(
            id = 20237, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'espèces de fourmis existent environ ?", listOf("Plus de 22 000", "Environ 1 000", "Environ 5 000", "Plus de 100 000"), "Nature", "Le nombre exact d'espèces de fourmis est difficile à établir, mais les estimations actuelles dépassent les 22 000 espèces décrites, avec potentiellement autant d'espèces non encore découvertes."),
            en = LocalizedContent("Approximately how many species of ants exist?", listOf("Over 22,000", "About 1,000", "About 5,000", "Over 100,000"), "Nature", "The exact number of ant species is difficult to determine, but current estimates exceed 22,000 described species, with potentially as many undiscovered."),
            zh = LocalizedContent("大约有多少种蚂蚁？", listOf("超过22,000种", "约1,000种", "约5,000种", "超过100,000种"), "自然", "蚂蚁的确切种类数难以确定，但目前的估计已超过22,000种已描述的物种，可能还有同样多的未发现物种。"),
            es = LocalizedContent("¿Cuántas especies de hormigas existen aproximadamente?", listOf("Más de 22,000", "Alrededor de 1,000", "Alrededor de 5,000", "Más de 100,000"), "Naturaleza", "El número exacto de especies de hormigas es difícil de establecer, pero las estimaciones actuales superan las 22,000 especies descritas, con potencialmente tantas especies no descubiertas.")
        ),
        BilingualQuestion(
            id = 20238, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel phénomène naturel cause les aurores boréales ?", listOf("Le vent solaire frappant la magnétosphère", "La réflexion de la lumière lunaire", "Les éruptions volcaniques", "Les courants marins"), "Nature", "Les aurores boréales se produisent lorsque des particules chargées du vent solaire sont guidées par le champ magnétique terrestre vers les pôles, où elles entrent en collision avec les gaz de l'atmosphère, produisant des lumières colorées."),
            en = LocalizedContent("What natural phenomenon causes the aurora borealis?", listOf("Solar wind hitting the magnetosphere", "Reflection of moonlight", "Volcanic eruptions", "Ocean currents"), "Nature", "Aurora borealis occurs when charged particles from the solar wind are guided by Earth's magnetic field toward the poles, where they collide with atmospheric gases, producing colorful lights."),
            zh = LocalizedContent("什么自然现象导致北极光？", listOf("太阳风撞击磁层", "月光的反射", "火山喷发", "洋流"), "自然", "北极光发生时，太阳风中的带电粒子被地球磁场引导至两极，与大气中的气体碰撞，产生彩色光芒。"),
            es = LocalizedContent("¿Qué fenómeno natural causa las auroras boreales?", listOf("El viento solar golpeando la magnetosfera", "La reflexión de la luz lunar", "Las erupciones volcánicas", "Las corrientes marinas"), "Naturaleza", "Las auroras boreales ocurren cuando partículas cargadas del viento solar son guiadas por el campo magnético terrestre hacia los polos, donde chocan con los gases de la atmósfera, produciendo luces de colores.")
        ),
        BilingualQuestion(
            id = 20239, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le félin le plus menacé au monde ?", listOf("Le lynx ibérique", "Le tigre de Sumatra", "Le léopard des neiges", "Le guépard asiatique"), "Nature", "Le lynx ibérique est considéré comme le félin le plus menacé au monde en raison de la destruction de son habitat et du déclin de sa principale proie, le lapin de garenne, avec moins de 200 individus adultes dans la nature au début des années 2000."),
            en = LocalizedContent("Which is the most endangered feline in the world?", listOf("Iberian lynx", "Sumatran tiger", "Snow leopard", "Asiatic cheetah"), "Nature", "The Iberian lynx is considered the most endangered feline in the world due to habitat destruction and decline of its main prey, the European rabbit, with fewer than 200 adults in the wild in the early 2000s."),
            zh = LocalizedContent("世界上最濒危的猫科动物是什么？", listOf("伊比利亚猞猁", "苏门答腊虎", "雪豹", "亚洲猎豹"), "自然", "伊比利亚猞猁被认为是世界上最濒危的猫科动物，原因是栖息地破坏和其主要猎物欧洲兔的减少，21世纪初野外成年个体不足200只。"),
            es = LocalizedContent("¿Cuál es el felino más amenazado del mundo?", listOf("El lince ibérico", "El tigre de Sumatra", "El leopardo de las nieves", "El guepardo asiático"), "Naturaleza", "El lince ibérico es considerado el felino más amenazado del mundo debido a la destrucción de su hábitat y la disminución de su principal presa, el conejo europeo, con menos de 200 individuos adultos en libertad a principios de la década de 2000.")
        ),
        BilingualQuestion(
            id = 20240, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus vieil organisme vivant connu ?", listOf("Un champignon (Armillaria) de 2400 ans", "Un séquoia de 3000 ans", "Une méduse immortelle", "Un pin Bristlecone de 5000 ans"), "Nature", "L'Armillaria ostoyae, un champignon parasite des racines d'arbres, forme un réseau souterrain continu dans l'Oregon, estimé à 2400 ans, ce qui en fait l'organisme vivant le plus ancien connu."),
            en = LocalizedContent("What is the oldest known living organism?", listOf("A fungus (Armillaria) 2400 years old", "A sequoia 3000 years old", "An immortal jellyfish", "A bristlecone pine 5000 years old"), "Nature", "Armillaria ostoyae, a parasitic fungus on tree roots, forms a continuous underground network in Oregon estimated to be 2400 years old, making it the oldest known living organism."),
            zh = LocalizedContent("已知最古老的生物体是什么？", listOf("一种2400年的真菌（蜜环菌）", "一棵3000年的红杉", "一种永生水母", "一棵5000年的狐尾松"), "自然", "蜜环菌（Armillaria ostoyae）是一种寄生在树根上的真菌，在俄勒冈州形成一个连续的地下网络，估计有2400年历史，是已知最古老的生物体。"),
            es = LocalizedContent("¿Cuál es el organismo vivo más antiguo conocido?", listOf("Un hongo (Armillaria) de 2400 años", "Una secuoya de 3000 años", "Una medusa inmortal", "Un pino bristlecone de 5000 años"), "Naturaleza", "Armillaria ostoyae, un hongo parásito de las raíces de los árboles, forma una red subterránea continua en Oregón estimada en 2400 años, lo que lo convierte en el organismo vivo más antiguo conocido.")
        ),
        BilingualQuestion(
            id = 20301, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de pays composent l'Union européenne (2024) ?", listOf("27", "28", "25", "30"), "Politique", "L'Union européenne compte 27 États membres depuis le retrait du Royaume-Uni en 2020. Ce nombre est stable en 2024, sans nouvel élargissement ou départ récent."),
            en = LocalizedContent("How many countries make up the European Union (2024)?", listOf("27", "28", "25", "30"), "Politics", "The European Union has 27 member states since the withdrawal of the United Kingdom in 2020. This number is stable in 2024, with no recent enlargement or departure."),
            zh = LocalizedContent("欧盟由多少个国家组成（2024年）？", listOf("27", "28", "25", "30"), "政治", "自2020年英国脱欧以来，欧盟有27个成员国。2024年这一数字保持稳定，没有新的扩大或退出。"),
            es = LocalizedContent("¿Cuántos países componen la Unión Europea (2024)?", listOf("27", "28", "25", "30"), "Política", "La Unión Europea tiene 27 estados miembros desde la retirada del Reino Unido en 2020. Este número es estable en 2024, sin nuevas ampliaciones o salidas recientes.")
        ),
        BilingualQuestion(
            id = 20302, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le siège du Parlement européen ?", listOf("Strasbourg", "Bruxelles", "Luxembourg", "La Haye"), "Politique", "Strasbourg est le siège officiel du Parlement européen, où se tiennent les sessions plénières, tandis que les commissions se réunissent à Bruxelles."),
            en = LocalizedContent("Where is the seat of the European Parliament?", listOf("Strasbourg", "Brussels", "Luxembourg", "The Hague"), "Politics", "Strasbourg is the official seat of the European Parliament, where plenary sessions are held, while committees meet in Brussels."),
            zh = LocalizedContent("欧洲议会的所在地在哪里？", listOf("斯特拉斯堡", "布鲁塞尔", "卢森堡", "海牙"), "政治", "斯特拉斯堡是欧洲议会的正式所在地，全体会议在此举行，而委员会会议在布鲁塞尔召开。"),
            es = LocalizedContent("¿Dónde está la sede del Parlamento Europeo?", listOf("Estrasburgo", "Bruselas", "Luxemburgo", "La Haya"), "Política", "Estrasburgo es la sede oficial del Parlamento Europeo, donde se celebran las sesiones plenarias, mientras que las comisiones se reúnen en Bruselas.")
        ),
        BilingualQuestion(
            id = 20303, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de membres permanents siègent au Conseil de sécurité de l'ONU ?", listOf("5", "10", "7", "15"), "Politique", "Le Conseil de sécurité de l'ONU compte cinq membres permanents : les États-Unis, la Russie, la Chine, le Royaume-Uni et la France, chacun disposant d'un droit de veto."),
            en = LocalizedContent("How many permanent members sit on the UN Security Council?", listOf("5", "10", "7", "15"), "Politics", "The UN Security Council has five permanent members: the United States, Russia, China, the United Kingdom, and France, each with veto power."),
            zh = LocalizedContent("联合国安理会有多少常任理事国？", listOf("5", "10", "7", "15"), "政治", "联合国安理会有五个常任理事国：美国、俄罗斯、中国、英国和法国，每个国家都拥有否决权。"),
            es = LocalizedContent("¿Cuántos miembros permanentes tiene el Consejo de Seguridad de la ONU?", listOf("5", "10", "7", "15"), "Política", "El Consejo de Seguridad de la ONU tiene cinco miembros permanentes: Estados Unidos, Rusia, China, Reino Unido y Francia, cada uno con derecho a veto.")
        ),
        BilingualQuestion(
            id = 20304, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a le plus vieux parlement du monde encore en activité ?", listOf("L'Islande (Althing)", "Le Royaume-Uni", "La Grèce", "La Suisse"), "Politique", "L'Althing islandais a été fondé en 930 après J.-C., ce qui en fait la plus ancienne assemblée parlementaire encore en activité."),
            en = LocalizedContent("Which country has the oldest parliament in the world still in operation?", listOf("Iceland (Althing)", "United Kingdom", "Greece", "Switzerland"), "Politics", "The Icelandic Althing was founded in 930 AD, making it the oldest parliamentary assembly still in operation."),
            zh = LocalizedContent("哪个国家拥有世界上仍在运作的最古老的议会？", listOf("冰岛（阿尔庭）", "英国", "希腊", "瑞士"), "政治", "冰岛的阿尔庭成立于公元930年，是仍在运作的最古老的议会。"),
            es = LocalizedContent("¿Qué país tiene el parlamento más antiguo del mundo aún en funcionamiento?", listOf("Islandia (Althing)", "Reino Unido", "Grecia", "Suiza"), "Política", "El Althing islandés fue fundado en el año 930 d.C., lo que lo convierte en la asamblea parlamentaria más antigua aún en funcionamiento.")
        ),
        BilingualQuestion(
            id = 20305, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a été le premier secrétaire général de l'ONU ?", listOf("Trygve Lie", "Dag Hammarskjöld", "U Thant", "Kurt Waldheim"), "Politique", "Trygve Lie, un diplomate norvégien, a été le premier à occuper ce poste de 1946 à 1952, après la création de l'ONU en 1945."),
            en = LocalizedContent("Who was the first Secretary-General of the UN?", listOf("Trygve Lie", "Dag Hammarskjöld", "U Thant", "Kurt Waldheim"), "Politics", "Trygve Lie, a Norwegian diplomat, was the first to hold this post from 1946 to 1952, after the creation of the UN in 1945."),
            zh = LocalizedContent("谁是联合国第一任秘书长？", listOf("特里格夫·赖伊", "达格·哈马舍尔德", "吴丹", "库尔特·瓦尔德海姆"), "政治", "挪威外交官特里格夫·赖伊在1945年联合国成立后，于1946年至1952年担任第一任秘书长。"),
            es = LocalizedContent("¿Quién fue el primer Secretario General de la ONU?", listOf("Trygve Lie", "Dag Hammarskjöld", "U Thant", "Kurt Waldheim"), "Política", "Trygve Lie, un diplomático noruego, fue el primero en ocupar este cargo de 1946 a 1952, tras la creación de la ONU en 1945.")
        ),
        BilingualQuestion(
            id = 20307, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel président américain a démissionné suite au Watergate ?", listOf("Richard Nixon", "Gerald Ford", "Lyndon Johnson", "Jimmy Carter"), "Politique", "Richard Nixon a démissionné en 1974 pour éviter une procédure de destitution après le scandale du Watergate, où son administration avait espionné le siège du Parti démocrate."),
            en = LocalizedContent("Which US president resigned after Watergate?", listOf("Richard Nixon", "Gerald Ford", "Lyndon Johnson", "Jimmy Carter"), "Politics", "Richard Nixon resigned in 1974 to avoid impeachment proceedings after the Watergate scandal, in which his administration had spied on the Democratic Party headquarters."),
            zh = LocalizedContent("哪位美国总统因水门事件辞职？", listOf("理查德·尼克松", "杰拉尔德·福特", "林登·约翰逊", "吉米·卡特"), "政治", "理查德·尼克松于1974年辞职，以避免因水门事件（其政府曾窃听民主党总部）而被弹劾。"),
            es = LocalizedContent("¿Qué presidente estadounidense dimitió tras el Watergate?", listOf("Richard Nixon", "Gerald Ford", "Lyndon Johnson", "Jimmy Carter"), "Política", "Richard Nixon dimitió en 1974 para evitar un proceso de destitución tras el escándalo del Watergate, en el que su administración había espiado la sede del Partido Demócrata.")
        ),
        BilingualQuestion(
            id = 20308, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'amendements contient la Constitution américaine ?", listOf("27", "10", "25", "33"), "Politique", "La Constitution américaine a été amendée 27 fois depuis son adoption en 1787, les dix premiers amendements formant la Déclaration des droits."),
            en = LocalizedContent("How many amendments does the US Constitution contain?", listOf("27", "10", "25", "33"), "Politics", "The US Constitution has been amended 27 times since its adoption in 1787, with the first ten amendments forming the Bill of Rights."),
            zh = LocalizedContent("美国宪法包含多少条修正案？", listOf("27", "10", "25", "33"), "政治", "美国宪法自1787年通过以来已修改27次，前十条修正案构成《权利法案》。"),
            es = LocalizedContent("¿Cuántas enmiendas contiene la Constitución de Estados Unidos?", listOf("27", "10", "25", "33"), "Política", "La Constitución de Estados Unidos ha sido enmendada 27 veces desde su adopción en 1787, siendo las diez primeras enmiendas la Declaración de Derechos.")
        ),
        BilingualQuestion(
            id = 20309, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le système politique du Royaume-Uni ?", listOf("Monarchie constitutionnelle parlementaire", "République fédérale", "Monarchie absolue", "République présidentielle"), "Politique", "Le Royaume-Uni est une monarchie constitutionnelle où le roi ou la reine est le chef d'État, mais le pouvoir est exercé par un parlement élu, ce qui en fait une démocratie parlementaire."),
            en = LocalizedContent("What is the political system of the United Kingdom?", listOf("Constitutional parliamentary monarchy", "Federal republic", "Absolute monarchy", "Presidential republic"), "Politics", "The United Kingdom is a constitutional monarchy where the king or queen is the head of state, but power is exercised by an elected parliament, making it a parliamentary democracy."),
            zh = LocalizedContent("英国的政治体制是什么？", listOf("议会制君主立宪制", "联邦共和国", "绝对君主制", "总统制共和国"), "政治", "英国是君主立宪制国家，国王或女王是国家元首，但权力由选举产生的议会行使，因此是议会民主制。"),
            es = LocalizedContent("¿Cuál es el sistema político del Reino Unido?", listOf("Monarquía constitucional parlamentaria", "República federal", "Monarquía absoluta", "República presidencialista"), "Política", "El Reino Unido es una monarquía constitucional donde el rey o la reina es el jefe de Estado, pero el poder lo ejerce un parlamento elegido, lo que lo convierte en una democracia parlamentaria.")
        ),
        BilingualQuestion(
            id = 20310, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a été la première femme Premier ministre au monde ?", listOf("Sirimavo Bandaranaike (Sri Lanka)", "Margaret Thatcher", "Golda Meir", "Indira Gandhi"), "Politique", "Sirimavo Bandaranaike est devenue Première ministre de Sri Lanka en 1960, après l'assassinat de son mari, ce qui en fait la première femme à occuper ce poste dans le monde."),
            en = LocalizedContent("Who was the first female Prime Minister in the world?", listOf("Sirimavo Bandaranaike (Sri Lanka)", "Margaret Thatcher", "Golda Meir", "Indira Gandhi"), "Politics", "Sirimavo Bandaranaike became Prime Minister of Sri Lanka in 1960 after her husband's assassination, making her the first woman to hold that office in the world."),
            zh = LocalizedContent("谁是世界上第一位女总理？", listOf("西丽玛沃·班达拉奈克（斯里兰卡）", "玛格丽特·撒切尔", "果尔达·梅厄", "英迪拉·甘地"), "政治", "西丽玛沃·班达拉奈克于1960年在其丈夫遇刺后成为斯里兰卡总理，成为世界上第一位担任该职务的女性。"),
            es = LocalizedContent("¿Quién fue la primera mujer primera ministra del mundo?", listOf("Sirimavo Bandaranaike (Sri Lanka)", "Margaret Thatcher", "Golda Meir", "Indira Gandhi"), "Política", "Sirimavo Bandaranaike se convirtió en primera ministra de Sri Lanka en 1960 tras el asesinato de su marido, siendo la primera mujer en ocupar ese cargo en el mundo.")
        ),
        BilingualQuestion(
            id = 20311, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de républiques la France a-t-elle connues ?", listOf("5", "4", "3", "6"), "Politique", "Depuis la Révolution française, la France a connu cinq régimes républicains, la Cinquième République étant celle établie en 1958 et toujours en vigueur."),
            en = LocalizedContent("How many republics has France had?", listOf("5", "4", "3", "6"), "Politics", "Since the French Revolution, France has had five republican regimes, with the Fifth Republic established in 1958 and still in force."),
            zh = LocalizedContent("法国经历过几个共和国？", listOf("5", "4", "3", "6"), "政治", "自法国大革命以来，法国经历了五个共和政体，第五共和国成立于1958年并延续至今。"),
            es = LocalizedContent("¿Cuántas repúblicas ha tenido Francia?", listOf("5", "4", "3", "6"), "Política", "Desde la Revolución Francesa, Francia ha tenido cinco regímenes republicanos, siendo la Quinta República establecida en 1958 y aún vigente.")
        ),
        BilingualQuestion(
            id = 20312, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel traité a fondé la Communauté économique européenne ?", listOf("Le traité de Rome (1957)", "Le traité de Maastricht", "Le traité de Lisbonne", "Le traité de Paris"), "Politique", "Le traité de Rome, signé en 1957 par six pays, a institué la Communauté économique européenne (CEE) en créant un marché commun et des politiques économiques communes."),
            en = LocalizedContent("Which treaty founded the European Economic Community?", listOf("Treaty of Rome (1957)", "Treaty of Maastricht", "Treaty of Lisbon", "Treaty of Paris"), "Politics", "The Treaty of Rome, signed in 1957 by six countries, established the European Economic Community (EEC) by creating a common market and common economic policies."),
            zh = LocalizedContent("哪个条约创立了欧洲经济共同体？", listOf("《罗马条约》（1957年）", "《马斯特里赫特条约》", "《里斯本条约》", "《巴黎条约》"), "政治", "1957年由六国签署的《罗马条约》建立了欧洲经济共同体（EEC），创建了共同市场和共同经济政策。"),
            es = LocalizedContent("¿Qué tratado fundó la Comunidad Económica Europea?", listOf("Tratado de Roma (1957)", "Tratado de Maastricht", "Tratado de Lisboa", "Tratado de París"), "Política", "El Tratado de Roma, firmado en 1957 por seis países, instituyó la Comunidad Económica Europea (CEE) creando un mercado común y políticas económicas comunes.")
        ),
        BilingualQuestion(
            id = 20313, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays pratique la démocratie directe avec des référendums fréquents ?", listOf("La Suisse", "La Suède", "Les Pays-Bas", "Le Danemark"), "Politique", "La Suisse est un cas unique au monde où les citoyens peuvent voter plusieurs fois par an sur des lois et des modifications constitutionnelles via des référendums et des initiatives populaires, ce qui en fait un exemple de démocratie directe."),
            en = LocalizedContent("Which country practices direct democracy with frequent referendums?", listOf("Switzerland", "Sweden", "Netherlands", "Denmark"), "Politics", "Switzerland is unique in the world where citizens can vote several times a year on laws and constitutional amendments via referendums and popular initiatives, making it an example of direct democracy."),
            zh = LocalizedContent("哪个国家实行直接民主，频繁举行公投？", listOf("瑞士", "瑞典", "荷兰", "丹麦"), "政治", "瑞士是世界上独一无二的国家，公民每年可通过公投和人民倡议多次对法律和宪法修正案进行投票，是直接民主的典范。"),
            es = LocalizedContent("¿Qué país practica la democracia directa con referendos frecuentes?", listOf("Suiza", "Suecia", "Países Bajos", "Dinamarca"), "Política", "Suiza es un caso único en el mundo donde los ciudadanos pueden votar varias veces al año sobre leyes y modificaciones constitucionales mediante referendos e iniciativas populares, siendo un ejemplo de democracia directa.")
        ),
        BilingualQuestion(
            id = 20314, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est le fondateur de la Croix-Rouge ?", listOf("Henry Dunant", "Florence Nightingale", "Albert Schweitzer", "Fridtjof Nansen"), "Politique", "Henry Dunant, homme d'affaires suisse, a fondé la Croix-Rouge en 1863 après avoir été marqué par les souffrances des soldats blessés lors de la bataille de Solférino en 1859."),
            en = LocalizedContent("Who is the founder of the Red Cross?", listOf("Henry Dunant", "Florence Nightingale", "Albert Schweitzer", "Fridtjof Nansen"), "Politics", "Henry Dunant, a Swiss businessman, founded the Red Cross in 1863 after being moved by the suffering of wounded soldiers at the Battle of Solferino in 1859."),
            zh = LocalizedContent("谁是红十字会的创始人？", listOf("亨利·杜南", "弗洛伦斯·南丁格尔", "阿尔伯特·施韦泽", "弗里德约夫·南森"), "政治", "瑞士商人亨利·杜南在1859年索尔费里诺战役中目睹伤兵痛苦后，于1863年创立了红十字会。"),
            es = LocalizedContent("¿Quién es el fundador de la Cruz Roja?", listOf("Henry Dunant", "Florence Nightingale", "Albert Schweitzer", "Fridtjof Nansen"), "Política", "Henry Dunant, empresario suizo, fundó la Cruz Roja en 1863 tras conmoverse por el sufrimiento de los soldados heridos en la batalla de Solferino en 1859.")
        ),
        BilingualQuestion(
            id = 20315, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel organe de l'ONU peut imposer des sanctions internationales ?", listOf("Le Conseil de sécurité", "L'Assemblée générale", "La Cour internationale de Justice", "Le Secrétariat"), "Politique", "Le Conseil de sécurité de l'ONU est le seul organe habilité à adopter des résolutions contraignantes, y compris des sanctions économiques ou militaires, pour maintenir la paix et la sécurité internationales."),
            en = LocalizedContent("Which UN body can impose international sanctions?", listOf("Security Council", "General Assembly", "International Court of Justice", "Secretariat"), "Politics", "The UN Security Council is the only body authorized to adopt binding resolutions, including economic or military sanctions, to maintain international peace and security."),
            zh = LocalizedContent("联合国哪个机构可以实施国际制裁？", listOf("安全理事会", "大会", "国际法院", "秘书处"), "政治", "联合国安理会是唯一有权通过具有约束力的决议（包括经济或军事制裁）以维护国际和平与安全的机构。"),
            es = LocalizedContent("¿Qué órgano de la ONU puede imponer sanciones internacionales?", listOf("Consejo de Seguridad", "Asamblea General", "Corte Internacional de Justicia", "Secretaría"), "Política", "El Consejo de Seguridad de la ONU es el único órgano facultado para adoptar resoluciones vinculantes, incluidas sanciones económicas o militares, para mantener la paz y la seguridad internacionales.")
        ),
        BilingualQuestion(
            id = 20316, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel leader a mené la lutte anti-apartheid en Afrique du Sud ?", listOf("Nelson Mandela", "Desmond Tutu", "Steve Biko", "Thabo Mbeki"), "Politique", "Nelson Mandela a été une figure centrale de l'opposition au régime d'apartheid en Afrique du Sud, dirigeant le Congrès national africain (ANC) et passant 27 ans en prison avant de devenir le premier président noir du pays en 1994."),
            en = LocalizedContent("Which leader led the anti-apartheid struggle in South Africa?", listOf("Nelson Mandela", "Desmond Tutu", "Steve Biko", "Thabo Mbeki"), "Politics", "Nelson Mandela was a central figure in the opposition to apartheid in South Africa, leading the African National Congress (ANC) and spending 27 years in prison before becoming the country's first black president in 1994."),
            zh = LocalizedContent("哪位领导人领导了南非的反种族隔离斗争？", listOf("纳尔逊·曼德拉", "德斯蒙德·图图", "史蒂夫·比科", "塔博·姆贝基"), "政治", "纳尔逊·曼德拉是南非反对种族隔离制度的核心人物，领导非洲人国民大会（ANC），在狱中度过27年，于1994年成为该国首位黑人总统。"),
            es = LocalizedContent("¿Qué líder lideró la lucha contra el apartheid en Sudáfrica?", listOf("Nelson Mandela", "Desmond Tutu", "Steve Biko", "Thabo Mbeki"), "Política", "Nelson Mandela fue una figura central en la oposición al régimen del apartheid en Sudáfrica, liderando el Congreso Nacional Africano (ANC) y pasando 27 años en prisión antes de convertirse en el primer presidente negro del país en 1994.")
        ),
        BilingualQuestion(
            id = 20318, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année l'ONU a-t-elle été fondée ?", listOf("1945", "1948", "1942", "1950"), "Politique", "L'ONU a été créée le 24 octobre 1945, après la Seconde Guerre mondiale, pour remplacer la Société des Nations et promouvoir la paix et la coopération internationale."),
            en = LocalizedContent("In which year was the UN founded?", listOf("1945", "1948", "1942", "1950"), "Politics", "The UN was created on October 24, 1945, after World War II, to replace the League of Nations and promote peace and international cooperation."),
            zh = LocalizedContent("联合国成立于哪一年？", listOf("1945", "1948", "1942", "1950"), "政治", "联合国于1945年10月24日成立，旨在二战后取代国际联盟，促进和平与国际合作。"),
            es = LocalizedContent("¿En qué año se fundó la ONU?", listOf("1945", "1948", "1942", "1950"), "Política", "La ONU fue creada el 24 de octubre de 1945, después de la Segunda Guerra Mundial, para reemplazar a la Sociedad de Naciones y promover la paz y la cooperación internacional.")
        ),
        BilingualQuestion(
            id = 20319, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a le droit de veto au Conseil de sécurité de l'ONU parmi ceux-ci ?", listOf("La France", "L'Allemagne", "Le Japon", "Le Brésil"), "Politique", "La France est l’un des cinq membres permanents du Conseil de sécurité de l’ONU, avec les États-Unis, le Royaume-Uni, la Russie et la Chine, ce qui lui confère un droit de veto."),
            en = LocalizedContent("Which country has veto power in the UN Security Council among these?", listOf("France", "Germany", "Japan", "Brazil"), "Politics", "France is one of the five permanent members of the UN Security Council, along with the United States, the United Kingdom, Russia, and China, which grants it veto power."),
            zh = LocalizedContent("以下哪个国家在联合国安理会拥有否决权？", listOf("法国", "德国", "日本", "巴西"), "政治", "法国是联合国安理会五个常任理事国之一，与美国、英国、俄罗斯和中国并列，因此拥有否决权。"),
            es = LocalizedContent("¿Qué país tiene derecho a veto en el Consejo de Seguridad de la ONU entre estos?", listOf("Francia", "Alemania", "Japón", "Brasil"), "Política", "Francia es uno de los cinco miembros permanentes del Consejo de Seguridad de la ONU, junto con Estados Unidos, Reino Unido, Rusia y China, lo que le otorga derecho a veto.")
        ),
        BilingualQuestion(
            id = 20320, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la séparation des pouvoirs selon Montesquieu ?", listOf("Exécutif, législatif, judiciaire", "Militaire, civil, religieux", "Fédéral, régional, local", "Royal, aristocratique, populaire"), "Politique", "Montesquieu distingue trois fonctions dans l'État pour éviter les abus de pouvoir : exécuter les lois, les voter et juger leurs infractions. Ce modèle inspire la plupart des démocraties modernes."),
            en = LocalizedContent("What is the separation of powers according to Montesquieu?", listOf("Executive, legislative, judicial", "Military, civil, religious", "Federal, regional, local", "Royal, aristocratic, popular"), "Politics", "Montesquieu distinguishes three functions in the state to prevent abuses of power: executing laws, making laws, and judging their infractions. This model inspires most modern democracies."),
            zh = LocalizedContent("根据孟德斯鸠，什么是三权分立？", listOf("行政、立法、司法", "军事、民事、宗教", "联邦、地区、地方", "王室、贵族、平民"), "政治", "孟德斯鸠将国家权力分为三种职能以防止权力滥用：执行法律、制定法律和审判违法行为。这一模式启发了大多数现代民主国家。"),
            es = LocalizedContent("¿Qué es la separación de poderes según Montesquieu?", listOf("Ejecutivo, legislativo, judicial", "Militar, civil, religioso", "Federal, regional, local", "Real, aristocrático, popular"), "Política", "Montesquieu distingue tres funciones en el Estado para evitar abusos de poder: ejecutar las leyes, hacer las leyes y juzgar sus infracciones. Este modelo inspira a la mayoría de las democracias modernas.")
        ),
        BilingualQuestion(
            id = 20321, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel président français a instauré la Ve République ?", listOf("Charles de Gaulle", "François Mitterrand", "Georges Pompidou", "René Coty"), "Politique", "Charles de Gaulle a instauré la Ve République en 1958, en rédigeant une nouvelle Constitution pour remplacer la IVe République, affaiblie par l'instabilité politique et la guerre d'Algérie."),
            en = LocalizedContent("Which French president established the Fifth Republic?", listOf("Charles de Gaulle", "François Mitterrand", "Georges Pompidou", "René Coty"), "Politics", "Charles de Gaulle established the Fifth Republic in 1958 by drafting a new Constitution to replace the Fourth Republic, weakened by political instability and the Algerian War."),
            zh = LocalizedContent("哪位法国总统建立了第五共和国？", listOf("夏尔·戴高乐", "弗朗索瓦·密特朗", "乔治·蓬皮杜", "勒内·科蒂"), "政治", "夏尔·戴高乐于1958年建立了第五共和国，起草了新宪法以取代因政治不稳定和阿尔及利亚战争而削弱的第四共和国。"),
            es = LocalizedContent("¿Qué presidente francés instauró la Quinta República?", listOf("Charles de Gaulle", "François Mitterrand", "Georges Pompidou", "René Coty"), "Política", "Charles de Gaulle instauró la Quinta República en 1958, redactando una nueva Constitución para reemplazar la Cuarta República, debilitada por la inestabilidad política y la guerra de Argelia.")
        ),
        BilingualQuestion(
            id = 20322, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de sénateurs siègent au Sénat américain ?", listOf("100", "50", "435", "150"), "Politique", "Le Sénat américain compte 100 membres, car chaque État, quelle que soit sa population, élit deux sénateurs. Les États-Unis comprennent 50 États, ce qui donne 50 × 2 = 100 sénateurs."),
            en = LocalizedContent("How many senators sit in the US Senate?", listOf("100", "50", "435", "150"), "Politics", "The US Senate has 100 members because each state, regardless of population, elects two senators. The United States has 50 states, so 50 × 2 = 100 senators."),
            zh = LocalizedContent("美国参议院有多少名参议员？", listOf("100", "50", "435", "150"), "政治", "美国参议院有100名成员，因为每个州无论人口多少都选举两名参议员。美国有50个州，所以50×2=100名参议员。"),
            es = LocalizedContent("¿Cuántos senadores hay en el Senado de EE. UU.?", listOf("100", "50", "435", "150"), "Política", "El Senado de EE. UU. tiene 100 miembros porque cada estado, independientemente de su población, elige dos senadores. Estados Unidos tiene 50 estados, por lo que 50 × 2 = 100 senadores.")
        ),
        BilingualQuestion(
            id = 20323, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel mouvement politique est né de la Révolution française ?", listOf("Gauche et Droite (placement dans l'assemblée)", "Le communisme", "Le fascisme", "L'anarchisme"), "Politique", "Lors de la Révolution française, les députés siégeant à gauche du président de l'Assemblée nationale étaient favorables aux réformes radicales, tandis que ceux à droite défendaient l'ordre établi, donnant naissance aux concepts politiques de gauche et de droite."),
            en = LocalizedContent("Which political movement was born from the French Revolution?", listOf("Left and Right (seating in the assembly)", "Communism", "Fascism", "Anarchism"), "Politics", "During the French Revolution, deputies seated to the left of the president of the National Assembly favored radical reforms, while those on the right defended the established order, giving rise to the political concepts of left and right."),
            zh = LocalizedContent("法国大革命催生了哪种政治运动？", listOf("左派和右派（议会中的座位安排）", "共产主义", "法西斯主义", "无政府主义"), "政治", "法国大革命期间，坐在国民议会主席左侧的议员支持激进改革，而右侧的议员捍卫既定秩序，从而产生了左派和右派的政治概念。"),
            es = LocalizedContent("¿Qué movimiento político nació de la Revolución Francesa?", listOf("Izquierda y Derecha (ubicación en la asamblea)", "El comunismo", "El fascismo", "El anarquismo"), "Política", "Durante la Revolución Francesa, los diputados sentados a la izquierda del presidente de la Asamblea Nacional favorecían reformas radicales, mientras que los de la derecha defendían el orden establecido, dando origen a los conceptos políticos de izquierda y derecha.")
        ),
        BilingualQuestion(
            id = 20324, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays est le plus peuplé du monde ?", listOf("L'Inde", "La Chine", "Les États-Unis", "L'Indonésie"), "Politique", "L'Inde a dépassé la Chine en 2023 pour devenir le pays le plus peuplé du monde, avec environ 1,4 milliard d'habitants."),
            en = LocalizedContent("Which country is the most populous in the world?", listOf("India", "China", "United States", "Indonesia"), "Politics", "India surpassed China in 2023 to become the world's most populous country, with about 1.4 billion inhabitants."),
            zh = LocalizedContent("世界上人口最多的国家是哪个？", listOf("印度", "中国", "美国", "印度尼西亚"), "政治", "印度在2023年超过中国，成为世界上人口最多的国家，约有14亿居民。"),
            es = LocalizedContent("¿Qué país es el más poblado del mundo?", listOf("India", "China", "Estados Unidos", "Indonesia"), "Política", "India superó a China en 2023 para convertirse en el país más poblado del mundo, con aproximadamente 1.400 millones de habitantes.")
        ),
        BilingualQuestion(
            id = 20325, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'âge minimum pour être président aux États-Unis ?", listOf("35 ans", "30 ans", "40 ans", "25 ans"), "Politique", "La Constitution américaine fixe à 35 ans l'âge minimum pour être président, une condition établie pour garantir une maturité et une expérience suffisantes."),
            en = LocalizedContent("What is the minimum age to be president in the United States?", listOf("35 years", "30 years", "40 years", "25 years"), "Politics", "The US Constitution sets the minimum age for president at 35, a condition established to ensure sufficient maturity and experience."),
            zh = LocalizedContent("在美国，担任总统的最低年龄是多少？", listOf("35岁", "30岁", "40岁", "25岁"), "政治", "美国宪法规定总统的最低年龄为35岁，这一条件旨在确保足够的成熟度和经验。"),
            es = LocalizedContent("¿Cuál es la edad mínima para ser presidente en Estados Unidos?", listOf("35 años", "30 años", "40 años", "25 años"), "Política", "La Constitución de EE. UU. establece la edad mínima para ser presidente en 35 años, una condición establecida para garantizar suficiente madurez y experiencia.")
        ),
        BilingualQuestion(
            id = 20326, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le G7 ?", listOf("Un forum de 7 pays industrialisés", "Un traité commercial", "Une alliance militaire", "Un organisme de l'ONU"), "Politique", "Le G7 est un groupe informel réunissant les sept plus grandes économies avancées du monde (États-Unis, Japon, Allemagne, France, Royaume-Uni, Italie et Canada) pour discuter de questions économiques et politiques internationales."),
            en = LocalizedContent("What is the G7?", listOf("A forum of 7 industrialized countries", "A trade treaty", "A military alliance", "A UN agency"), "Politics", "The G7 is an informal group bringing together the seven largest advanced economies in the world (United States, Japan, Germany, France, United Kingdom, Italy, and Canada) to discuss international economic and political issues."),
            zh = LocalizedContent("什么是G7？", listOf("七个工业化国家的论坛", "一项贸易条约", "一个军事联盟", "一个联合国机构"), "政治", "G7是一个非正式集团，汇集了世界上七个最大的发达经济体（美国、日本、德国、法国、英国、意大利和加拿大），讨论国际经济和政治问题。"),
            es = LocalizedContent("¿Qué es el G7?", listOf("Un foro de 7 países industrializados", "Un tratado comercial", "Una alianza militar", "Un organismo de la ONU"), "Política", "El G7 es un grupo informal que reúne a las siete economías avanzadas más grandes del mundo (Estados Unidos, Japón, Alemania, Francia, Reino Unido, Italia y Canadá) para discutir cuestiones económicas y políticas internacionales.")
        ),
        BilingualQuestion(
            id = 20327, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom du parlement allemand ?", listOf("Le Bundestag", "Le Reichstag", "Le Bundesrat", "Le Landtag"), "Politique", "Le Bundestag est l'assemblée parlementaire fédérale allemande, élue au suffrage universel direct, et constitue la chambre basse du système bicaméral allemand."),
            en = LocalizedContent("What is the name of the German parliament?", listOf("Bundestag", "Reichstag", "Bundesrat", "Landtag"), "Politics", "The Bundestag is the federal parliamentary assembly of Germany, elected by direct universal suffrage, and constitutes the lower house of the German bicameral system."),
            zh = LocalizedContent("德国议会的名称是什么？", listOf("联邦议院", "国会大厦", "联邦参议院", "州议会"), "政治", "联邦议院是德国的联邦议会，由直接普选产生，是德国两院制体系中的下议院。"),
            es = LocalizedContent("¿Cuál es el nombre del parlamento alemán?", listOf("Bundestag", "Reichstag", "Bundesrat", "Landtag"), "Política", "El Bundestag es la asamblea parlamentaria federal de Alemania, elegida por sufragio universal directo, y constituye la cámara baja del sistema bicameral alemán.")
        ),
        BilingualQuestion(
            id = 20328, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année les femmes ont-elles obtenu le droit de vote en France ?", listOf("1944", "1936", "1918", "1952"), "Politique", "Le droit de vote a été accordé aux femmes françaises par l'ordonnance du 21 avril 1944, signée par le général de Gaulle. Elles ont voté pour la première fois lors des élections municipales de 1945."),
            en = LocalizedContent("In which year did women obtain the right to vote in France?", listOf("1944", "1936", "1918", "1952"), "Politics", "The right to vote was granted to French women by the ordinance of April 21, 1944, signed by General de Gaulle. They voted for the first time in the municipal elections of 1945."),
            zh = LocalizedContent("法国女性在哪一年获得了选举权？", listOf("1944", "1936", "1918", "1952"), "政治", "法国女性的选举权由戴高乐将军于1944年4月21日签署的法令授予。她们在1945年的市政选举中首次投票。"),
            es = LocalizedContent("¿En qué año obtuvieron las mujeres el derecho al voto en Francia?", listOf("1944", "1936", "1918", "1952"), "Política", "El derecho al voto fue otorgado a las mujeres francesas por la ordenanza del 21 de abril de 1944, firmada por el general De Gaulle. Votaron por primera vez en las elecciones municipales de 1945.")
        ),
        BilingualQuestion(
            id = 20329, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le siège de la Cour internationale de Justice ?", listOf("La Haye", "Genève", "New York", "Bruxelles"), "Politique", "La Cour internationale de Justice, principal organe judiciaire des Nations Unies, a son siège au Palais de la Paix à La Haye, aux Pays-Bas."),
            en = LocalizedContent("What is the seat of the International Court of Justice?", listOf("The Hague", "Geneva", "New York", "Brussels"), "Politics", "The International Court of Justice, the principal judicial organ of the United Nations, is seated at the Peace Palace in The Hague, Netherlands."),
            zh = LocalizedContent("国际法院的所在地是哪里？", listOf("海牙", "日内瓦", "纽约", "布鲁塞尔"), "政治", "国际法院是联合国的主要司法机关，其所在地为荷兰海牙的和平宫。"),
            es = LocalizedContent("¿Cuál es la sede de la Corte Internacional de Justicia?", listOf("La Haya", "Ginebra", "Nueva York", "Bruselas"), "Política", "La Corte Internacional de Justicia, principal órgano judicial de las Naciones Unidas, tiene su sede en el Palacio de la Paz en La Haya, Países Bajos.")
        ),
        BilingualQuestion(
            id = 20330, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel type de régime est une théocratie ?", listOf("Un régime dirigé selon des principes religieux", "Un régime militaire", "Un régime démocratique", "Un régime monarchique"), "Politique", "Dans une théocratie, le pouvoir politique est exercé par des autorités religieuses ou au nom d'une divinité, les lois étant fondées sur des textes sacrés."),
            en = LocalizedContent("What type of regime is a theocracy?", listOf("A regime governed according to religious principles", "A military regime", "A democratic regime", "A monarchical regime"), "Politics", "In a theocracy, political power is exercised by religious authorities or in the name of a deity, with laws based on sacred texts."),
            zh = LocalizedContent("神权政体是一种什么类型的政权？", listOf("根据宗教原则统治的政权", "军事政权", "民主政权", "君主政权"), "政治", "在神权政体中，政治权力由宗教权威或以上帝的名义行使，法律基于神圣文本。"),
            es = LocalizedContent("¿Qué tipo de régimen es una teocracia?", listOf("Un régimen gobernado según principios religiosos", "Un régimen militar", "Un régimen democrático", "Un régimen monárquico"), "Política", "En una teocracia, el poder político es ejercido por autoridades religiosas o en nombre de una divinidad, basándose las leyes en textos sagrados.")
        ),
        BilingualQuestion(
            id = 20331, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a prononcé 'I have a dream' ?", listOf("Martin Luther King Jr.", "Malcolm X", "Barack Obama", "John F. Kennedy"), "Politique", "Martin Luther King Jr. a prononcé ce discours le 28 août 1963 lors de la marche pour l'emploi et la liberté à Washington, devenant un symbole majeur du mouvement des droits civiques aux États-Unis."),
            en = LocalizedContent("Who delivered 'I have a dream'?", listOf("Martin Luther King Jr.", "Malcolm X", "Barack Obama", "John F. Kennedy"), "Politics", "Martin Luther King Jr. delivered this speech on August 28, 1963, during the March on Washington for Jobs and Freedom, becoming a major symbol of the civil rights movement in the United States."),
            zh = LocalizedContent("谁发表了“我有一个梦想”的演讲？", listOf("马丁·路德·金", "马尔科姆·X", "巴拉克·奥巴马", "约翰·F·肯尼迪"), "政治", "马丁·路德·金于1963年8月28日在华盛顿的就业与自由游行中发表了这一演讲，成为美国民权运动的重要象征。"),
            es = LocalizedContent("¿Quién pronunció 'I have a dream'?", listOf("Martin Luther King Jr.", "Malcolm X", "Barack Obama", "John F. Kennedy"), "Política", "Martin Luther King Jr. pronunció este discurso el 28 de agosto de 1963 durante la marcha por el empleo y la libertad en Washington, convirtiéndose en un símbolo importante del movimiento por los derechos civiles en Estados Unidos.")
        ),
        BilingualQuestion(
            id = 20332, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de pays sont membres de l'ONU (2024) ?", listOf("193", "150", "200", "180"), "Politique", "L'ONU comptait 193 États membres en 2024, ce qui correspond à la quasi-totalité des nations souveraines reconnues internationalement. Le Soudan du Sud a été le dernier pays admis, en 2011."),
            en = LocalizedContent("How many countries are members of the UN (2024)?", listOf("193", "150", "200", "180"), "Politics", "The UN had 193 member states in 2024, which corresponds to almost all internationally recognized sovereign nations. South Sudan was the last country admitted, in 2011."),
            zh = LocalizedContent("联合国有多少个成员国（2024年）？", listOf("193", "150", "200", "180"), "政治", "截至2024年，联合国有193个成员国，这几乎涵盖了所有国际公认的主权国家。南苏丹是最后一个加入的国家，于2011年加入。"),
            es = LocalizedContent("¿Cuántos países son miembros de la ONU (2024)?", listOf("193", "150", "200", "180"), "Política", "La ONU contaba con 193 estados miembros en 2024, lo que corresponde a casi todas las naciones soberanas reconocidas internacionalmente. Sudán del Sur fue el último país admitido, en 2011.")
        ),
        BilingualQuestion(
            id = 20333, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien État souverain d'Europe ?", listOf("Saint-Marin", "Le Vatican", "Monaco", "Le Liechtenstein"), "Politique", "Saint-Marin a été fondé en 301 après J.-C. et sa constitution date de 1600, ce qui en fait la plus ancienne république et le plus vieil État souverain d'Europe encore existant."),
            en = LocalizedContent("What is the oldest sovereign state in Europe?", listOf("San Marino", "Vatican City", "Monaco", "Liechtenstein"), "Politics", "San Marino was founded in 301 AD and its constitution dates from 1600, making it the oldest republic and the oldest sovereign state in Europe still in existence."),
            zh = LocalizedContent("欧洲最古老的主权国家是哪个？", listOf("圣马力诺", "梵蒂冈", "摩纳哥", "列支敦士登"), "政治", "圣马力诺成立于公元301年，其宪法可追溯到1600年，使其成为欧洲现存最古老的共和国和最古老的主权国家。"),
            es = LocalizedContent("¿Cuál es el estado soberano más antiguo de Europa?", listOf("San Marino", "El Vaticano", "Mónaco", "Liechtenstein"), "Política", "San Marino fue fundado en el año 301 d.C. y su constitución data de 1600, lo que la convierte en la república más antigua y el estado soberano más antiguo de Europa aún existente.")
        ),
        BilingualQuestion(
            id = 20334, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel président américain a ordonné le bombardement d'Hiroshima ?", listOf("Harry Truman", "Franklin Roosevelt", "Dwight Eisenhower", "John F. Kennedy"), "Politique", "Harry Truman était le président des États-Unis en août 1945, lorsqu'il a autorisé l'utilisation de la bombe atomique sur Hiroshima pour mettre fin à la Seconde Guerre mondiale."),
            en = LocalizedContent("Which US president ordered the bombing of Hiroshima?", listOf("Harry Truman", "Franklin Roosevelt", "Dwight Eisenhower", "John F. Kennedy"), "Politics", "Harry Truman was the President of the United States in August 1945, when he authorized the use of the atomic bomb on Hiroshima to end World War II."),
            zh = LocalizedContent("哪位美国总统下令轰炸广岛？", listOf("哈里·杜鲁门", "富兰克林·罗斯福", "德怀特·艾森豪威尔", "约翰·F·肯尼迪"), "政治", "哈里·杜鲁门在1945年8月担任美国总统，他授权在广岛使用原子弹以结束第二次世界大战。"),
            es = LocalizedContent("¿Qué presidente estadounidense ordenó el bombardeo de Hiroshima?", listOf("Harry Truman", "Franklin Roosevelt", "Dwight Eisenhower", "John F. Kennedy"), "Política", "Harry Truman era el presidente de los Estados Unidos en agosto de 1945, cuando autorizó el uso de la bomba atómica sobre Hiroshima para poner fin a la Segunda Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 20335, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le droit d'habeas corpus ?", listOf("Le droit de ne pas être détenu sans jugement", "Le droit de vote", "Le droit à la propriété", "Le droit de grâce"), "Politique", "L'habeas corpus est un principe juridique fondamental du droit anglo-saxon qui protège contre les détentions arbitraires en exigeant qu'un détenu soit présenté rapidement devant un juge."),
            en = LocalizedContent("What is the right of habeas corpus?", listOf("The right not to be detained without trial", "The right to vote", "The right to property", "The right to pardon"), "Politics", "Habeas corpus is a fundamental legal principle in Anglo-Saxon law that protects against arbitrary detention by requiring that a detainee be brought before a judge promptly."),
            zh = LocalizedContent("人身保护令的权利是什么？", listOf("未经审判不被拘留的权利", "选举权", "财产权", "赦免权"), "政治", "人身保护令是英美法系中的一项基本法律原则，通过要求将被拘留者迅速带见法官来保护个人免受任意拘留。"),
            es = LocalizedContent("¿Qué es el derecho de hábeas corpus?", listOf("El derecho a no ser detenido sin juicio", "El derecho al voto", "El derecho a la propiedad", "El derecho de indulto"), "Política", "El hábeas corpus es un principio jurídico fundamental del derecho anglosajón que protege contra detenciones arbitrarias al exigir que un detenido sea presentado rápidamente ante un juez.")
        ),
        BilingualQuestion(
            id = 20336, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel pays a aboli la peine de mort en premier ?", listOf("Le Venezuela (1863)", "La France (1981)", "Le Royaume-Uni (1965)", "La Suède (1921)"), "Politique", "Le Venezuela a aboli la peine de mort en 1863 pour tous les crimes, devenant ainsi le premier pays au monde à le faire, bien avant les nations européennes."),
            en = LocalizedContent("Which country abolished the death penalty first?", listOf("Venezuela (1863)", "France (1981)", "United Kingdom (1965)", "Sweden (1921)"), "Politics", "Venezuela abolished the death penalty in 1863 for all crimes, becoming the first country in the world to do so, well before European nations."),
            zh = LocalizedContent("哪个国家最先废除死刑？", listOf("委内瑞拉（1863年）", "法国（1981年）", "英国（1965年）", "瑞典（1921年）"), "政治", "委内瑞拉于1863年废除了所有犯罪的死刑，成为世界上第一个这样做的国家，远早于欧洲国家。"),
            es = LocalizedContent("¿Qué país abolió la pena de muerte primero?", listOf("Venezuela (1863)", "Francia (1981)", "Reino Unido (1965)", "Suecia (1921)"), "Política", "Venezuela abolió la pena de muerte en 1863 para todos los delitos, convirtiéndose en el primer país del mundo en hacerlo, mucho antes que las naciones europeas.")
        ),
        BilingualQuestion(
            id = 20337, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom de la chambre basse du parlement français ?", listOf("L'Assemblée nationale", "Le Sénat", "Le Conseil constitutionnel", "Le Conseil d'État"), "Politique", "Le Parlement français est bicaméral, et l'Assemblée nationale, élue au suffrage universel direct, constitue la chambre basse, par opposition au Sénat qui est la chambre haute."),
            en = LocalizedContent("What is the name of the lower house of the French parliament?", listOf("National Assembly", "Senate", "Constitutional Council", "Council of State"), "Politics", "The French Parliament is bicameral, and the National Assembly, elected by direct universal suffrage, constitutes the lower house, as opposed to the Senate which is the upper house."),
            zh = LocalizedContent("法国议会的下议院叫什么？", listOf("国民议会", "参议院", "宪法委员会", "国务委员会"), "政治", "法国议会是两院制，国民议会通过直接普选产生，构成下议院，而参议院是上议院。"),
            es = LocalizedContent("¿Cuál es el nombre de la cámara baja del parlamento francés?", listOf("Asamblea Nacional", "Senado", "Consejo Constitucional", "Consejo de Estado"), "Política", "El Parlamento francés es bicameral, y la Asamblea Nacional, elegida por sufragio universal directo, constituye la cámara baja, en oposición al Senado que es la cámara alta.")
        ),
        BilingualQuestion(
            id = 20338, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel accord international vise à limiter le réchauffement climatique ?", listOf("L'Accord de Paris (2015)", "Le Protocole de Kyoto", "Le Sommet de Rio", "L'Accord de Copenhague"), "Politique", "Adopté en 2015 lors de la COP21, l'Accord de Paris engage les pays signataires à maintenir l'augmentation de la température mondiale bien en dessous de 2°C par rapport à l'ère préindustrielle."),
            en = LocalizedContent("Which international agreement aims to limit global warming?", listOf("The Paris Agreement (2015)", "The Kyoto Protocol", "The Rio Summit", "The Copenhagen Accord"), "Politics", "Adopted in 2015 at COP21, the Paris Agreement commits signatory countries to keep the global temperature rise well below 2°C above pre-industrial levels."),
            zh = LocalizedContent("哪项国际协议旨在限制全球变暖？", listOf("《巴黎协定》（2015年）", "《京都议定书》", "里约峰会", "哥本哈根协议"), "政治", "2015年在COP21上通过的《巴黎协定》要求签署国将全球气温升幅控制在工业化前水平以上2°C以内。"),
            es = LocalizedContent("¿Qué acuerdo internacional tiene como objetivo limitar el calentamiento global?", listOf("El Acuerdo de París (2015)", "El Protocolo de Kioto", "La Cumbre de Río", "El Acuerdo de Copenhague"), "Política", "Adoptado en 2015 durante la COP21, el Acuerdo de París compromete a los países firmantes a mantener el aumento de la temperatura mundial muy por debajo de 2°C respecto a la era preindustrial.")
        ),
        BilingualQuestion(
            id = 20339, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel État est un État-cité ?", listOf("Singapour", "Le Luxembourg", "Andorre", "Malte"), "Politique", "Singapour est une cité-État souveraine, ce qui signifie que son territoire se limite à une seule ville et ses banlieues, sans division en régions ou États fédérés."),
            en = LocalizedContent("Which state is a city-state?", listOf("Singapore", "Luxembourg", "Andorra", "Malta"), "Politics", "Singapore is a sovereign city-state, meaning its territory is limited to a single city and its suburbs, without division into regions or federated states."),
            zh = LocalizedContent("哪个国家是城邦？", listOf("新加坡", "卢森堡", "安道尔", "马耳他"), "政治", "新加坡是一个主权城邦，其领土仅限于一个城市及其郊区，没有划分为地区或联邦州。"),
            es = LocalizedContent("¿Qué estado es una ciudad-estado?", listOf("Singapur", "Luxemburgo", "Andorra", "Malta"), "Política", "Singapur es una ciudad-estado soberana, lo que significa que su territorio se limita a una sola ciudad y sus suburbios, sin división en regiones o estados federados.")
        ),
        BilingualQuestion(
            id = 20340, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la durée d'un mandat présidentiel en France ?", listOf("5 ans", "4 ans", "6 ans", "7 ans"), "Politique", "Le mandat présidentiel est de 5 ans depuis le référendum de 2000, qui a réduit la durée de 7 à 5 ans pour aligner le mandat sur celui des législatives."),
            en = LocalizedContent("What is the length of a presidential term in France?", listOf("5 years", "4 years", "6 years", "7 years"), "Politics", "The presidential term is 5 years since the 2000 referendum, which reduced the term from 7 to 5 years to align it with the legislative elections."),
            zh = LocalizedContent("法国总统的任期是多久？", listOf("5年", "4年", "6年", "7年"), "政治", "自2000年公投以来，总统任期改为5年，从7年缩短至5年，以便与立法选举保持一致。"),
            es = LocalizedContent("¿Cuál es la duración del mandato presidencial en Francia?", listOf("5 años", "4 años", "6 años", "7 años"), "Política", "El mandato presidencial es de 5 años desde el referéndum de 2000, que redujo la duración de 7 a 5 años para alinearlo con las elecciones legislativas.")
        ),
        BilingualQuestion(
            id = 20402, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel roman commence par 'Longtemps, je me suis couché de bonne heure' ?", listOf("Du côté de chez Swann (Proust)", "L'Étranger (Camus)", "Madame Bovary (Flaubert)", "Le Rouge et le Noir (Stendhal)"), "Littérature", "C'est la phrase d'ouverture de *Du côté de chez Swann*, le premier volume de *À la recherche du temps perdu* de Marcel Proust."),
            en = LocalizedContent("Which novel begins with 'For a long time, I used to go to bed early'?", listOf("Swann's Way (Proust)", "The Stranger (Camus)", "Madame Bovary (Flaubert)", "The Red and the Black (Stendhal)"), "Literature", "This is the opening sentence of *Swann's Way*, the first volume of *In Search of Lost Time* by Marcel Proust."),
            zh = LocalizedContent("哪部小说以“长期以来，我都是早早就上床了”开头？", listOf("《在斯万家那边》（普鲁斯特）", "《局外人》（加缪）", "《包法利夫人》（福楼拜）", "《红与黑》（司汤达）"), "文学", "这是马塞尔·普鲁斯特《追忆似水年华》第一卷《在斯万家那边》的开篇句。"),
            es = LocalizedContent("¿Qué novela comienza con 'Mucho tiempo me he acostado temprano'?", listOf("Por el camino de Swann (Proust)", "El extranjero (Camus)", "Madame Bovary (Flaubert)", "Rojo y negro (Stendhal)"), "Literatura", "Es la frase inicial de *Por el camino de Swann*, el primer volumen de *En busca del tiempo perdido* de Marcel Proust.")
        ),
        BilingualQuestion(
            id = 20404, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel auteur français a écrit 'Le Petit Prince' ?", listOf("Antoine de Saint-Exupéry", "Albert Camus", "André Malraux", "Jean-Paul Sartre"), "Littérature", "Antoine de Saint-Exupéry, aviateur et écrivain, publie 'Le Petit Prince' en 1943, une œuvre poétique et philosophique devenue un classique mondial de la littérature jeunesse."),
            en = LocalizedContent("Which French author wrote 'The Little Prince'?", listOf("Antoine de Saint-Exupéry", "Albert Camus", "André Malraux", "Jean-Paul Sartre"), "Literature", "Antoine de Saint-Exupéry, aviator and writer, published 'The Little Prince' in 1943, a poetic and philosophical work that became a global classic of children's literature."),
            zh = LocalizedContent("哪位法国作家写了《小王子》？", listOf("安托万·德·圣-埃克苏佩里", "阿尔贝·加缪", "安德烈·马尔罗", "让-保罗·萨特"), "文学", "飞行员兼作家安托万·德·圣-埃克苏佩里于1943年出版了《小王子》，这部诗意而富有哲理的作品成为全球儿童文学经典。"),
            es = LocalizedContent("¿Qué autor francés escribió 'El Principito'?", listOf("Antoine de Saint-Exupéry", "Albert Camus", "André Malraux", "Jean-Paul Sartre"), "Literatura", "Antoine de Saint-Exupéry, aviador y escritor, publicó 'El Principito' en 1943, una obra poética y filosófica convertida en un clásico mundial de la literatura infantil.")
        ),
        BilingualQuestion(
            id = 20405, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel poète a écrit 'Les Fleurs du mal' ?", listOf("Charles Baudelaire", "Arthur Rimbaud", "Paul Verlaine", "Victor Hugo"), "Littérature", "Charles Baudelaire a publié ce recueil majeur de la poésie française en 1857, ce qui lui a valu un procès pour outrage à la morale publique."),
            en = LocalizedContent("Which poet wrote 'Les Fleurs du mal'?", listOf("Charles Baudelaire", "Arthur Rimbaud", "Paul Verlaine", "Victor Hugo"), "Literature", "Charles Baudelaire published this major collection of French poetry in 1857, which led to a trial for offending public morality."),
            zh = LocalizedContent("哪位诗人写了《恶之花》？", listOf("夏尔·波德莱尔", "阿蒂尔·兰波", "保罗·魏尔伦", "维克多·雨果"), "文学", "夏尔·波德莱尔于1857年出版了这部法国诗歌的重要诗集，因此被控冒犯公共道德而受审。"),
            es = LocalizedContent("¿Qué poeta escribió 'Las flores del mal'?", listOf("Charles Baudelaire", "Arthur Rimbaud", "Paul Verlaine", "Victor Hugo"), "Literatura", "Charles Baudelaire publicó esta importante colección de la poesía francesa en 1857, lo que le valió un juicio por ultraje a la moral pública.")
        ),
        BilingualQuestion(
            id = 20406, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a écrit '1984' ?", listOf("George Orwell", "Aldous Huxley", "Ray Bradbury", "Isaac Asimov"), "Littérature", "George Orwell, de son vrai nom Eric Blair, a publié 1984 en 1949, une dystopie dénonçant les régimes totalitaires et la surveillance de masse."),
            en = LocalizedContent("Who wrote '1984'?", listOf("George Orwell", "Aldous Huxley", "Ray Bradbury", "Isaac Asimov"), "Literature", "George Orwell, real name Eric Blair, published 1984 in 1949, a dystopia denouncing totalitarian regimes and mass surveillance."),
            zh = LocalizedContent("谁写了《1984》？", listOf("乔治·奥威尔", "奥尔德斯·赫胥黎", "雷·布拉德伯里", "艾萨克·阿西莫夫"), "文学", "乔治·奥威尔（原名埃里克·布莱尔）于1949年出版了《1984》，这是一部谴责极权主义和大规模监控的反乌托邦小说。"),
            es = LocalizedContent("¿Quién escribió '1984'?", listOf("George Orwell", "Aldous Huxley", "Ray Bradbury", "Isaac Asimov"), "Literatura", "George Orwell, cuyo nombre real era Eric Blair, publicó 1984 en 1949, una distopía que denuncia los regímenes totalitarios y la vigilancia masiva.")
        ),
        BilingualQuestion(
            id = 20407, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel dramaturge a écrit 'Hamlet' ?", listOf("William Shakespeare", "Molière", "Oscar Wilde", "Christopher Marlowe"), "Littérature", "William Shakespeare est l'auteur de la tragédie 'Hamlet', écrite entre 1599 et 1601, considérée comme l'une des œuvres les plus influentes de la littérature anglaise."),
            en = LocalizedContent("Which playwright wrote 'Hamlet'?", listOf("William Shakespeare", "Molière", "Oscar Wilde", "Christopher Marlowe"), "Literature", "William Shakespeare is the author of the tragedy 'Hamlet', written between 1599 and 1601, considered one of the most influential works in English literature."),
            zh = LocalizedContent("哪位剧作家写了《哈姆雷特》？", listOf("威廉·莎士比亚", "莫里哀", "奥斯卡·王尔德", "克里斯托弗·马洛"), "文学", "威廉·莎士比亚是悲剧《哈姆雷特》的作者，该剧创作于1599年至1601年间，被认为是英国文学中最具影响力的作品之一。"),
            es = LocalizedContent("¿Qué dramaturgo escribió 'Hamlet'?", listOf("William Shakespeare", "Molière", "Oscar Wilde", "Christopher Marlowe"), "Literatura", "William Shakespeare es el autor de la tragedia 'Hamlet', escrita entre 1599 y 1601, considerada una de las obras más influyentes de la literatura inglesa.")
        ),
        BilingualQuestion(
            id = 20409, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel mouvement littéraire est associé à Zola ?", listOf("Le naturalisme", "Le romantisme", "Le symbolisme", "Le surréalisme"), "Littérature", "Émile Zola est le chef de file du naturalisme, un mouvement littéraire qui vise à appliquer la méthode expérimentale des sciences à l'écriture romanesque."),
            en = LocalizedContent("Which literary movement is associated with Zola?", listOf("Naturalism", "Romanticism", "Symbolism", "Surrealism"), "Literature", "Émile Zola is the leading figure of naturalism, a literary movement that aims to apply the experimental method of science to novel writing."),
            zh = LocalizedContent("哪个文学运动与左拉相关？", listOf("自然主义", "浪漫主义", "象征主义", "超现实主义"), "文学", "埃米尔·左拉是自然主义的领军人物，这一文学运动旨在将科学的实验方法应用于小说创作。"),
            es = LocalizedContent("¿Qué movimiento literario está asociado con Zola?", listOf("El naturalismo", "El romanticismo", "El simbolismo", "El surrealismo"), "Literatura", "Émile Zola es el líder del naturalismo, un movimiento literario que busca aplicar el método experimental de las ciencias a la escritura novelística.")
        ),
        BilingualQuestion(
            id = 20411, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel prix littéraire est le plus prestigieux en France ?", listOf("Le prix Goncourt", "Le prix Femina", "Le prix Renaudot", "Le prix Médicis"), "Littérature", "Fondé en 1903 par le testament d'Edmond de Goncourt, ce prix récompense chaque année le meilleur roman en prose française et bénéficie d'une immense couverture médiatique, ce qui en fait le plus convoité et le plus vendeur des prix littéraires français."),
            en = LocalizedContent("Which literary prize is the most prestigious in France?", listOf("The Prix Goncourt", "The Prix Femina", "The Prix Renaudot", "The Prix Médicis"), "Literature", "Founded in 1903 by the will of Edmond de Goncourt, this prize awards the best novel in French prose each year and enjoys immense media coverage, making it the most coveted and best-selling of French literary prizes."),
            zh = LocalizedContent("法国最负盛名的文学奖是哪个？", listOf("龚古尔奖", "费米娜奖", "勒诺多奖", "美第奇奖"), "文学", "根据埃德蒙·德·龚古尔的遗嘱于1903年创立，该奖项每年颁发给最佳法语散文小说，享有巨大的媒体关注，使其成为法国最令人垂涎且销量最高的文学奖。"),
            es = LocalizedContent("¿Cuál es el premio literario más prestigioso en Francia?", listOf("El Premio Goncourt", "El Premio Femina", "El Premio Renaudot", "El Premio Médicis"), "Literatura", "Fundado en 1903 por el testamento de Edmond de Goncourt, este premio galardona cada año a la mejor novela en prosa francesa y goza de una inmensa cobertura mediática, lo que lo convierte en el más codiciado y vendido de los premios literarios franceses.")
        ),
        BilingualQuestion(
            id = 20413, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel roman de Camus met en scène Meursault ?", listOf("L'Étranger", "La Peste", "La Chute", "L'Exil et le Royaume"), "Littérature", "Meursault est le narrateur et personnage principal de L'Étranger, roman d'Albert Camus publié en 1942, qui illustre la philosophie de l'absurde."),
            en = LocalizedContent("Which novel by Camus features Meursault?", listOf("The Stranger", "The Plague", "The Fall", "Exile and the Kingdom"), "Literature", "Meursault is the narrator and main character of The Stranger, a novel by Albert Camus published in 1942, which illustrates the philosophy of the absurd."),
            zh = LocalizedContent("加缪的哪部小说以默尔索为主角？", listOf("《局外人》", "《鼠疫》", "《堕落》", "《流亡与王国》"), "文学", "默尔索是《局外人》的叙述者和主角，这部阿尔贝·加缪于1942年出版的小说体现了荒诞哲学。"),
            es = LocalizedContent("¿Qué novela de Camus presenta a Meursault?", listOf("El extranjero", "La peste", "La caída", "El exilio y el reino"), "Literatura", "Meursault es el narrador y personaje principal de El extranjero, novela de Albert Camus publicada en 1942, que ilustra la filosofía del absurdo.")
        ),
        BilingualQuestion(
            id = 20415, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel roman dystopique décrit un 'Meilleur des mondes' ?", listOf("Le Meilleur des mondes (Huxley)", "1984 (Orwell)", "Fahrenheit 451 (Bradbury)", "Nous (Zamiatine)"), "Littérature", "Le Meilleur des mondes est un roman d'Aldous Huxley publié en 1932, qui dépeint une société futuriste où les humains sont conditionnés dès la naissance pour maintenir une stabilité sociale."),
            en = LocalizedContent("Which dystopian novel describes a 'Brave New World'?", listOf("Brave New World (Huxley)", "1984 (Orwell)", "Fahrenheit 451 (Bradbury)", "We (Zamyatin)"), "Literature", "Brave New World is a novel by Aldous Huxley published in 1932, depicting a futuristic society where humans are conditioned from birth to maintain social stability."),
            zh = LocalizedContent("哪部反乌托邦小说描述了“美丽新世界”？", listOf("《美丽新世界》（赫胥黎）", "《1984》（奥威尔）", "《华氏451度》（布拉德伯里）", "《我们》（扎米亚京）"), "文学", "《美丽新世界》是奥尔德斯·赫胥黎于1932年出版的小说，描绘了一个未来社会，人类从出生起就被条件化以维持社会稳定。"),
            es = LocalizedContent("¿Qué novela distópica describe un 'Un mundo feliz'?", listOf("Un mundo feliz (Huxley)", "1984 (Orwell)", "Fahrenheit 451 (Bradbury)", "Nosotros (Zamyatin)"), "Literatura", "Un mundo feliz es una novela de Aldous Huxley publicada en 1932, que describe una sociedad futurista donde los humanos son condicionados desde el nacimiento para mantener la estabilidad social.")
        ),
        BilingualQuestion(
            id = 20416, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel auteur japonais a écrit 'Kafka sur le rivage' ?", listOf("Haruki Murakami", "Yukio Mishima", "Yasunari Kawabata", "Kenji Miyazawa"), "Littérature", "Haruki Murakami est l'auteur de ce roman publié en 2002, mêlant réalisme magique et références à la culture pop."),
            en = LocalizedContent("Which Japanese author wrote 'Kafka on the Shore'?", listOf("Haruki Murakami", "Yukio Mishima", "Yasunari Kawabata", "Kenji Miyazawa"), "Literature", "Haruki Murakami is the author of this novel published in 2002, blending magical realism with references to pop culture."),
            zh = LocalizedContent("哪位日本作家写了《海边的卡夫卡》？", listOf("村上春树", "三岛由纪夫", "川端康成", "宫泽贤治"), "文学", "村上春树是这部2002年出版的小说的作者，融合了魔幻现实主义与流行文化元素。"),
            es = LocalizedContent("¿Qué autor japonés escribió 'Kafka en la orilla'?", listOf("Haruki Murakami", "Yukio Mishima", "Yasunari Kawabata", "Kenji Miyazawa"), "Literatura", "Haruki Murakami es el autor de esta novela publicada en 2002, que combina realismo mágico con referencias a la cultura pop.")
        ),
        BilingualQuestion(
            id = 20417, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a écrit 'Les Trois Mousquetaires' ?", listOf("Alexandre Dumas", "Victor Hugo", "Jules Verne", "Honoré de Balzac"), "Littérature", "Alexandre Dumas a publié ce roman d'aventures historique en feuilleton en 1844, avec la collaboration d'Auguste Maquet."),
            en = LocalizedContent("Who wrote 'The Three Musketeers'?", listOf("Alexandre Dumas", "Victor Hugo", "Jules Verne", "Honoré de Balzac"), "Literature", "Alexandre Dumas published this historical adventure novel as a serial in 1844, with the collaboration of Auguste Maquet."),
            zh = LocalizedContent("谁写了《三个火枪手》？", listOf("大仲马", "维克多·雨果", "儒勒·凡尔纳", "奥诺雷·德·巴尔扎克"), "文学", "大仲马于1844年以连载形式出版了这部历史冒险小说，与奥古斯特·马凯合作完成。"),
            es = LocalizedContent("¿Quién escribió 'Los tres mosqueteros'?", listOf("Alexandre Dumas", "Victor Hugo", "Jules Verne", "Honoré de Balzac"), "Literatura", "Alexandre Dumas publicó esta novela de aventuras histórica por entregas en 1844, con la colaboración de Auguste Maquet.")
        ),
        BilingualQuestion(
            id = 20418, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel mouvement littéraire André Breton a-t-il fondé ?", listOf("Le surréalisme", "Le dadaïsme", "L'existentialisme", "Le symbolisme"), "Littérature", "André Breton a publié le Manifeste du surréalisme en 1924, définissant ce mouvement qui prône l'expression du fonctionnement réel de la pensée, en l'absence de tout contrôle exercé par la raison."),
            en = LocalizedContent("Which literary movement did André Breton found?", listOf("Surrealism", "Dadaism", "Existentialism", "Symbolism"), "Literature", "André Breton published the Surrealist Manifesto in 1924, defining this movement that advocates for the expression of the actual functioning of thought, free from any control by reason."),
            zh = LocalizedContent("安德烈·布勒东创立了哪个文学运动？", listOf("超现实主义", "达达主义", "存在主义", "象征主义"), "文学", "安德烈·布勒东于1924年发表了《超现实主义宣言》，定义了这一运动，主张表达思想的真实运作，不受任何理性控制。"),
            es = LocalizedContent("¿Qué movimiento literario fundó André Breton?", listOf("Surrealismo", "Dadaísmo", "Existencialismo", "Simbolismo"), "Literatura", "André Breton publicó el Manifiesto Surrealista en 1924, definiendo este movimiento que aboga por la expresión del funcionamiento real del pensamiento, libre de todo control de la razón.")
        ),
        BilingualQuestion(
            id = 20419, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de livres composent 'À la recherche du temps perdu' de Proust ?", listOf("7", "5", "10", "3"), "Littérature", "Originellement conçue comme un cycle de trois romans, l'œuvre de Proust s'est développée en sept tomes publiés entre 1913 et 1927, dont les titres incluent *Du côté de chez Swann* et *Le Temps retrouvé*."),
            en = LocalizedContent("How many books make up Proust's 'In Search of Lost Time'?", listOf("7", "5", "10", "3"), "Literature", "Originally conceived as a cycle of three novels, Proust's work expanded into seven volumes published between 1913 and 1927, including titles such as *Swann's Way* and *Time Regained*."),
            zh = LocalizedContent("普鲁斯特的《追忆似水年华》由多少卷组成？", listOf("7", "5", "10", "3"), "文学", "最初构思为三部曲，普鲁斯特的作品扩展为七卷，于1913年至1927年间出版，包括《在斯万家那边》和《重现的时光》等。"),
            es = LocalizedContent("¿Cuántos libros componen 'En busca del tiempo perdido' de Proust?", listOf("7", "5", "10", "3"), "Literatura", "Originalmente concebida como un ciclo de tres novelas, la obra de Proust se expandió a siete tomos publicados entre 1913 y 1927, que incluyen títulos como *Por el camino de Swann* y *El tiempo recobrado*.")
        ),
        BilingualQuestion(
            id = 20421, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe a écrit 'La Nausée' ?", listOf("Jean-Paul Sartre", "Albert Camus", "Simone de Beauvoir", "Maurice Merleau-Ponty"), "Littérature", "Jean-Paul Sartre a publié \"La Nausée\" en 1938, un roman philosophique qui explore l'absurdité de l'existence et le concept de contingence, préfigurant son œuvre existentialiste majeure \"L'Être et le Néant\"."),
            en = LocalizedContent("Which philosopher wrote 'Nausea'?", listOf("Jean-Paul Sartre", "Albert Camus", "Simone de Beauvoir", "Maurice Merleau-Ponty"), "Literature", "Jean-Paul Sartre published 'Nausea' in 1938, a philosophical novel that explores the absurdity of existence and the concept of contingency, foreshadowing his major existentialist work 'Being and Nothingness'."),
            zh = LocalizedContent("哪位哲学家写了《恶心》？", listOf("让-保罗·萨特", "阿尔贝·加缪", "西蒙娜·德·波伏娃", "莫里斯·梅洛-庞蒂"), "文学", "让-保罗·萨特于1938年出版了《恶心》，这部哲学小说探讨了存在的荒诞性和偶然性概念，预示了他后来的存在主义巨著《存在与虚无》。"),
            es = LocalizedContent("¿Qué filósofo escribió 'La náusea'?", listOf("Jean-Paul Sartre", "Albert Camus", "Simone de Beauvoir", "Maurice Merleau-Ponty"), "Literatura", "Jean-Paul Sartre publicó 'La náusea' en 1938, una novela filosófica que explora el absurdo de la existencia y el concepto de contingencia, anticipando su obra existencialista mayor 'El ser y la nada'.")
        ),
        BilingualQuestion(
            id = 20422, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel auteur a inventé le mot 'utopie' ?", listOf("Thomas More", "Francis Bacon", "Platon", "Voltaire"), "Littérature", "Thomas More a forgé le terme utopie en 1516 pour le titre de son ouvrage décrivant une société idéale, combinant le grec ou-topos (lieu qui n'existe pas) et eu-topos (lieu heureux)."),
            en = LocalizedContent("Which author invented the word 'utopia'?", listOf("Thomas More", "Francis Bacon", "Plato", "Voltaire"), "Literature", "Thomas More coined the term utopia in 1516 for the title of his work describing an ideal society, combining the Greek ou-topos (no place) and eu-topos (good place)."),
            zh = LocalizedContent("哪位作者创造了“乌托邦”一词？", listOf("托马斯·莫尔", "弗朗西斯·培根", "柏拉图", "伏尔泰"), "文学", "托马斯·莫尔于1516年在其描述理想社会的著作标题中创造了“乌托邦”一词，结合了希腊语ou-topos（不存在的地方）和eu-topos（美好的地方）。"),
            es = LocalizedContent("¿Qué autor inventó la palabra 'utopía'?", listOf("Tomás Moro", "Francis Bacon", "Platón", "Voltaire"), "Literatura", "Tomás Moro acuñó el término utopía en 1516 para el título de su obra que describe una sociedad ideal, combinando el griego ou-topos (lugar que no existe) y eu-topos (lugar bueno).")
        ),
        BilingualQuestion(
            id = 20423, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a écrit 'Le Seigneur des anneaux' ?", listOf("J.R.R. Tolkien", "C.S. Lewis", "George R.R. Martin", "Terry Pratchett"), "Littérature", "J.R.R. Tolkien, philologue et professeur à Oxford, a publié 'Le Seigneur des anneaux' entre 1954 et 1955, créant un univers de fantasy complet avec ses langues et son histoire."),
            en = LocalizedContent("Who wrote 'The Lord of the Rings'?", listOf("J.R.R. Tolkien", "C.S. Lewis", "George R.R. Martin", "Terry Pratchett"), "Literature", "J.R.R. Tolkien, a philologist and professor at Oxford, published 'The Lord of the Rings' between 1954 and 1955, creating a complete fantasy universe with its own languages and history."),
            zh = LocalizedContent("谁写了《魔戒》？", listOf("J.R.R. 托尔金", "C.S. 刘易斯", "乔治·R·R·马丁", "特里·普拉切特"), "文学", "J.R.R. 托尔金，牛津大学的语言学家和教授，于1954年至1955年间出版了《魔戒》，创造了一个拥有自己语言和历史的完整奇幻世界。"),
            es = LocalizedContent("¿Quién escribió 'El Señor de los Anillos'?", listOf("J.R.R. Tolkien", "C.S. Lewis", "George R.R. Martin", "Terry Pratchett"), "Literatura", "J.R.R. Tolkien, filólogo y profesor en Oxford, publicó 'El Señor de los Anillos' entre 1954 y 1955, creando un universo fantástico completo con sus propias lenguas e historia.")
        ),
        BilingualQuestion(
            id = 20424, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel roman de Flaubert a été censuré pour immoralité ?", listOf("Madame Bovary", "L'Éducation sentimentale", "Salammbô", "Bouvard et Pécuchet"), "Littérature", "Madame Bovary a été censuré pour immoralité en 1857, car ses descriptions de l'adultère et du suicide étaient jugées contraires aux bonnes mœurs. Flaubert fut acquitté, mais le procès contribua à la célébrité du roman."),
            en = LocalizedContent("Which novel by Flaubert was censored for immorality?", listOf("Madame Bovary", "Sentimental Education", "Salammbô", "Bouvard and Pécuchet"), "Literature", "Madame Bovary was censored for immorality in 1857, as its descriptions of adultery and suicide were deemed contrary to public morals. Flaubert was acquitted, but the trial contributed to the novel's fame."),
            zh = LocalizedContent("福楼拜的哪部小说因不道德被审查？", listOf("《包法利夫人》", "《情感教育》", "《萨朗波》", "《布瓦尔和佩库歇》"), "文学", "《包法利夫人》于1857年因不道德被审查，因为其对通奸和自杀的描述被认为有伤风化。福楼拜被判无罪，但这场审判反而使小说名声大噪。"),
            es = LocalizedContent("¿Qué novela de Flaubert fue censurada por inmoralidad?", listOf("Madame Bovary", "La educación sentimental", "Salambó", "Bouvard y Pécuchet"), "Literatura", "Madame Bovary fue censurada por inmoralidad en 1857, ya que sus descripciones del adulterio y el suicidio se consideraban contrarias a las buenas costumbres. Flaubert fue absuelto, pero el juicio contribuyó a la fama de la novela.")
        ),
        BilingualQuestion(
            id = 20425, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel poète français a écrit 'Le Bateau ivre' à 16 ans ?", listOf("Arthur Rimbaud", "Paul Verlaine", "Stéphane Mallarmé", "Charles Baudelaire"), "Littérature", "Arthur Rimbaud, prodige de la poésie française, a composé 'Le Bateau ivre' en 1871, à l'âge de 16 ans, marquant ainsi son génie précoce et sa rupture avec les formes poétiques traditionnelles."),
            en = LocalizedContent("Which French poet wrote 'The Drunken Boat' at age 16?", listOf("Arthur Rimbaud", "Paul Verlaine", "Stéphane Mallarmé", "Charles Baudelaire"), "Literature", "Arthur Rimbaud, a prodigy of French poetry, composed 'The Drunken Boat' in 1871 at the age of 16, marking his early genius and break with traditional poetic forms."),
            zh = LocalizedContent("哪位法国诗人在16岁时创作了《醉舟》？", listOf("阿尔蒂尔·兰波", "保罗·魏尔伦", "斯特凡·马拉美", "夏尔·波德莱尔"), "文学", "阿尔蒂尔·兰波，法国诗歌天才，于1871年16岁时创作了《醉舟》，标志着他早熟的才华和对传统诗歌形式的突破。"),
            es = LocalizedContent("¿Qué poeta francés escribió 'El barco ebrio' a los 16 años?", listOf("Arthur Rimbaud", "Paul Verlaine", "Stéphane Mallarmé", "Charles Baudelaire"), "Literatura", "Arthur Rimbaud, prodigio de la poesía francesa, compuso 'El barco ebrio' en 1871 a los 16 años, marcando su genio precoz y su ruptura con las formas poéticas tradicionales.")
        ),
        BilingualQuestion(
            id = 20426, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'Fahrenheit 451' ?", listOf("Ray Bradbury", "George Orwell", "Aldous Huxley", "Philip K. Dick"), "Littérature", "Ray Bradbury a publié ce roman de science-fiction dystopique en 1953, dénonçant la censure et l'aliénation par les médias de masse."),
            en = LocalizedContent("Who wrote 'Fahrenheit 451'?", listOf("Ray Bradbury", "George Orwell", "Aldous Huxley", "Philip K. Dick"), "Literature", "Ray Bradbury published this dystopian science fiction novel in 1953, denouncing censorship and alienation by mass media."),
            zh = LocalizedContent("谁写了《华氏451度》？", listOf("雷·布拉德伯里", "乔治·奥威尔", "奥尔德斯·赫胥黎", "菲利普·K·迪克"), "文学", "雷·布拉德伯里于1953年出版了这部反乌托邦科幻小说，谴责审查制度和大众媒体的异化作用。"),
            es = LocalizedContent("¿Quién escribió 'Fahrenheit 451'?", listOf("Ray Bradbury", "George Orwell", "Aldous Huxley", "Philip K. Dick"), "Literatura", "Ray Bradbury publicó esta novela distópica de ciencia ficción en 1953, denunciando la censura y la alienación por los medios de comunicación masivos.")
        ),
        BilingualQuestion(
            id = 20427, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel auteur africain a écrit 'Les Soleils des indépendances' ?", listOf("Ahmadou Kourouma", "Chinua Achebe", "Léopold Sédar Senghor", "Wole Soyinka"), "Littérature", "Ahmadou Kourouma, écrivain ivoirien, a publié ce roman en 1968, devenu un classique de la littérature africaine pour sa critique acerbe des régimes postcoloniaux."),
            en = LocalizedContent("Which African author wrote 'The Suns of Independence'?", listOf("Ahmadou Kourouma", "Chinua Achebe", "Léopold Sédar Senghor", "Wole Soyinka"), "Literature", "Ahmadou Kourouma, an Ivorian writer, published this novel in 1968, which became a classic of African literature for its sharp critique of postcolonial regimes."),
            zh = LocalizedContent("哪位非洲作家写了《独立之阳》？", listOf("阿马杜·库鲁马", "钦努阿·阿契贝", "莱奥波尔德·塞达·桑戈尔", "沃莱·索因卡"), "文学", "阿马杜·库鲁马，科特迪瓦作家，于1968年出版这部小说，因其对后殖民政权的尖锐批评而成为非洲文学的经典。"),
            es = LocalizedContent("¿Qué autor africano escribió 'Los soles de las independencias'?", listOf("Ahmadou Kourouma", "Chinua Achebe", "Léopold Sédar Senghor", "Wole Soyinka"), "Literatura", "Ahmadou Kourouma, escritor marfileño, publicó esta novela en 1968, convertida en un clásico de la literatura africana por su crítica mordaz a los regímenes poscoloniales.")
        ),
        BilingualQuestion(
            id = 20428, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel personnage de Molière est un avare célèbre ?", listOf("Harpagon", "Tartuffe", "Alceste", "Scapin"), "Littérature", "Harpagon est le personnage principal de la pièce *L'Avare* de Molière, dont le nom est devenu synonyme d'avarice dans la culture française."),
            en = LocalizedContent("Which Molière character is a famous miser?", listOf("Harpagon", "Tartuffe", "Alceste", "Scapin"), "Literature", "Harpagon is the main character of Molière's play *The Miser*, whose name has become synonymous with avarice in French culture."),
            zh = LocalizedContent("莫里哀的哪个人物是著名的吝啬鬼？", listOf("阿巴贡", "答尔丢夫", "阿尔塞斯特", "斯卡潘"), "文学", "阿巴贡是莫里哀戏剧《吝啬鬼》的主角，其名字在法国文化中已成为贪婪的代名词。"),
            es = LocalizedContent("¿Qué personaje de Molière es un avaro famoso?", listOf("Harpagón", "Tartufo", "Alceste", "Escapín"), "Literatura", "Harpagón es el personaje principal de la obra *El avaro* de Molière, cuyo nombre se ha convertido en sinónimo de avaricia en la cultura francesa.")
        ),
        BilingualQuestion(
            id = 20429, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel prix Nobel de littérature Bob Dylan a-t-il reçu ?", listOf("2016", "2010", "2018", "2014"), "Littérature", "Bob Dylan a reçu le prix Nobel de littérature en 2016 pour avoir créé de nouvelles expressions poétiques au sein de la grande tradition de la chanson américaine."),
            en = LocalizedContent("In which year did Bob Dylan receive the Nobel Prize in Literature?", listOf("2016", "2010", "2018", "2014"), "Literature", "Bob Dylan received the Nobel Prize in Literature in 2016 for having created new poetic expressions within the great American song tradition."),
            zh = LocalizedContent("鲍勃·迪伦在哪一年获得诺贝尔文学奖？", listOf("2016", "2010", "2018", "2014"), "文学", "鲍勃·迪伦于2016年获得诺贝尔文学奖，以表彰他在伟大的美国歌曲传统中创造了新的诗意表达。"),
            es = LocalizedContent("¿En qué año recibió Bob Dylan el Premio Nobel de Literatura?", listOf("2016", "2010", "2018", "2014"), "Literatura", "Bob Dylan recibió el Premio Nobel de Literatura en 2016 por haber creado nuevas expresiones poéticas dentro de la gran tradición de la canción estadounidense.")
        ),
        BilingualQuestion(
            id = 20431, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel genre littéraire est 'Le Roman de Renart' ?", listOf("La fable animalière satirique", "Le roman courtois", "L'épopée", "La chanson de geste"), "Littérature", "'Le Roman de Renart' est un ensemble de récits médiévaux mettant en scène des animaux anthropomorphes, notamment le rusé renard Renart, pour critiquer la société et les puissants, ce qui en fait une fable animalière satirique."),
            en = LocalizedContent("What literary genre is 'The Romance of Reynard'?", listOf("Satirical animal fable", "Courtly romance", "Epic", "Chanson de geste"), "Literature", "'The Romance of Reynard' is a collection of medieval tales featuring anthropomorphic animals, notably the cunning fox Reynard, to critique society and the powerful, making it a satirical animal fable."),
            zh = LocalizedContent("《列那狐的故事》属于哪种文学体裁？", listOf("讽刺动物寓言", "骑士爱情小说", "史诗", "武功歌"), "文学", "《列那狐的故事》是一部中世纪故事集，以拟人化的动物为主角，特别是狡猾的狐狸列那，来讽刺社会和权贵，因此属于讽刺动物寓言。"),
            es = LocalizedContent("¿Qué género literario es 'El Roman de Renart'?", listOf("Fábula animal satírica", "Novela cortés", "Épica", "Cantar de gesta"), "Literatura", "'El Roman de Renart' es un conjunto de relatos medievales con animales antropomórficos, especialmente el astuto zorro Renart, para criticar la sociedad y los poderosos, lo que lo convierte en una fábula animal satírica.")
        ),
        BilingualQuestion(
            id = 20432, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a écrit 'Le Comte de Monte-Cristo' ?", listOf("Alexandre Dumas", "Victor Hugo", "Honoré de Balzac", "Théophile Gautier"), "Littérature", "Alexandre Dumas a publié ce roman d'aventure en feuilleton entre 1844 et 1846, s'inspirant d'une histoire vraie de vengeance et d'injustice."),
            en = LocalizedContent("Who wrote 'The Count of Monte Cristo'?", listOf("Alexandre Dumas", "Victor Hugo", "Honoré de Balzac", "Théophile Gautier"), "Literature", "Alexandre Dumas published this adventure novel as a serial between 1844 and 1846, inspired by a true story of revenge and injustice."),
            zh = LocalizedContent("谁写了《基督山伯爵》？", listOf("大仲马", "维克多·雨果", "奥诺雷·德·巴尔扎克", "泰奥菲尔·戈蒂埃"), "文学", "大仲马于1844年至1846年间以连载形式出版了这部冒险小说，灵感来源于一个关于复仇与不公的真实故事。"),
            es = LocalizedContent("¿Quién escribió 'El conde de Montecristo'?", listOf("Alexandre Dumas", "Victor Hugo", "Honoré de Balzac", "Théophile Gautier"), "Literatura", "Alexandre Dumas publicó esta novela de aventuras por entregas entre 1844 y 1846, inspirándose en una historia real de venganza e injusticia.")
        ),
        BilingualQuestion(
            id = 20433, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel auteur est le père de la science-fiction française ?", listOf("Jules Verne", "H.G. Wells", "Isaac Asimov", "Voltaire"), "Littérature", "Jules Verne est considéré comme le père de la science-fiction française grâce à ses romans d'anticipation comme \"Voyage au centre de la Terre\" et \"Vingt mille lieues sous les mers\"."),
            en = LocalizedContent("Which author is the father of French science fiction?", listOf("Jules Verne", "H.G. Wells", "Isaac Asimov", "Voltaire"), "Literature", "Jules Verne is considered the father of French science fiction thanks to his visionary novels like 'Journey to the Center of the Earth' and 'Twenty Thousand Leagues Under the Sea'."),
            zh = LocalizedContent("哪位作家是法国科幻小说之父？", listOf("儒勒·凡尔纳", "H.G.威尔斯", "艾萨克·阿西莫夫", "伏尔泰"), "文学", "儒勒·凡尔纳因其《地心游记》和《海底两万里》等前瞻性小说而被视为法国科幻小说之父。"),
            es = LocalizedContent("¿Qué autor es el padre de la ciencia ficción francesa?", listOf("Julio Verne", "H.G. Wells", "Isaac Asimov", "Voltaire"), "Literatura", "Julio Verne es considerado el padre de la ciencia ficción francesa gracias a sus novelas de anticipación como 'Viaje al centro de la Tierra' y 'Veinte mil leguas de viaje submarino'.")
        ),
        BilingualQuestion(
            id = 20434, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de pièces Shakespeare a-t-il écrites environ ?", listOf("37", "20", "50", "15"), "Littérature", "Le canon shakespearien reconnu par les spécialistes comprend 37 pièces, dont 36 publiées dans le Premier Folio de 1623 et une ajoutée ultérieurement, Périclès."),
            en = LocalizedContent("How many plays did Shakespeare write approximately?", listOf("37", "20", "50", "15"), "Literature", "The Shakespearean canon recognized by scholars includes 37 plays, of which 36 were published in the First Folio of 1623 and one added later, Pericles."),
            zh = LocalizedContent("莎士比亚大约写了多少部戏剧？", listOf("37", "20", "50", "15"), "文学", "学者公认的莎士比亚作品集包括37部戏剧，其中36部收录于1623年的《第一对开本》，后来增加了《泰尔亲王佩里克利斯》。"),
            es = LocalizedContent("¿Cuántas obras escribió Shakespeare aproximadamente?", listOf("37", "20", "50", "15"), "Literatura", "El canon shakesperiano reconocido por los especialistas comprende 37 obras, de las cuales 36 fueron publicadas en el Primer Folio de 1623 y una añadida posteriormente, Pericles.")
        ),
        BilingualQuestion(
            id = 20435, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel mouvement le poème 'Liberté' de Paul Éluard représente-t-il ?", listOf("La Résistance", "Le surréalisme", "Le dadaïsme", "Le romantisme"), "Littérature", "Publié clandestinement en 1942, ce poème fut parachuté par les avions alliés pour soutenir la lutte contre l'occupation nazie, devenant un symbole majeur de la Résistance française."),
            en = LocalizedContent("Which movement does Paul Éluard's poem 'Liberté' represent?", listOf("The Resistance", "Surrealism", "Dadaism", "Romanticism"), "Literature", "Published clandestinely in 1942, this poem was airdropped by Allied planes to support the fight against Nazi occupation, becoming a major symbol of the French Resistance."),
            zh = LocalizedContent("保罗·艾吕雅的诗《自由》代表了哪个运动？", listOf("抵抗运动", "超现实主义", "达达主义", "浪漫主义"), "文学", "这首诗于1942年秘密出版，由盟军飞机空投以支持反抗纳粹占领的斗争，成为法国抵抗运动的重要象征。"),
            es = LocalizedContent("¿Qué movimiento representa el poema 'Libertad' de Paul Éluard?", listOf("La Resistencia", "El surrealismo", "El dadaísmo", "El romanticismo"), "Literatura", "Publicado clandestinamente en 1942, este poema fue lanzado en paracaídas por aviones aliados para apoyar la lucha contra la ocupación nazi, convirtiéndose en un símbolo importante de la Resistencia francesa.")
        ),
        BilingualQuestion(
            id = 20436, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'Le Meilleur des mondes' ?", listOf("Aldous Huxley", "George Orwell", "Philip K. Dick", "Ray Bradbury"), "Littérature", "Aldous Huxley a publié ce roman dystopique en 1932, décrivant une société future technocratique et totalitaire."),
            en = LocalizedContent("Who wrote 'Brave New World'?", listOf("Aldous Huxley", "George Orwell", "Philip K. Dick", "Ray Bradbury"), "Literature", "Aldous Huxley published this dystopian novel in 1932, depicting a future technocratic and totalitarian society."),
            zh = LocalizedContent("谁写了《美丽新世界》？", listOf("奥尔德斯·赫胥黎", "乔治·奥威尔", "菲利普·K·迪克", "雷·布拉德伯里"), "文学", "奥尔德斯·赫胥黎于1932年出版了这部反乌托邦小说，描绘了一个未来技术官僚和极权主义的社会。"),
            es = LocalizedContent("¿Quién escribió 'Un mundo feliz'?", listOf("Aldous Huxley", "George Orwell", "Philip K. Dick", "Ray Bradbury"), "Literatura", "Aldous Huxley publicó esta novela distópica en 1932, describiendo una sociedad futura tecnocrática y totalitaria.")
        ),
        BilingualQuestion(
            id = 20437, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel roman de Mary Shelley est considéré comme le premier roman de SF ?", listOf("Frankenstein", "Dracula", "Le Dernier Homme", "Mathilda"), "Littérature", "Frankenstein, publié en 1818, est souvent cité comme le premier roman de science-fiction car il explore la création artificielle de la vie par la science, un thème fondateur du genre."),
            en = LocalizedContent("Which novel by Mary Shelley is considered the first science fiction novel?", listOf("Frankenstein", "Dracula", "The Last Man", "Mathilda"), "Literature", "Frankenstein, published in 1818, is often cited as the first science fiction novel because it explores the artificial creation of life through science, a founding theme of the genre."),
            zh = LocalizedContent("玛丽·雪莱的哪部小说被认为是第一部科幻小说？", listOf("弗兰肯斯坦", "德古拉", "最后一个人", "玛蒂尔达"), "文学", "《弗兰肯斯坦》出版于1818年，常被认为是第一部科幻小说，因为它探讨了通过科学人工创造生命，这是该类型的奠基主题。"),
            es = LocalizedContent("¿Qué novela de Mary Shelley se considera la primera novela de ciencia ficción?", listOf("Frankenstein", "Drácula", "El último hombre", "Mathilda"), "Literatura", "Frankenstein, publicada en 1818, a menudo se cita como la primera novela de ciencia ficción porque explora la creación artificial de la vida mediante la ciencia, un tema fundacional del género.")
        ),
        BilingualQuestion(
            id = 20438, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel auteur a créé le commissaire Maigret ?", listOf("Georges Simenon", "Agatha Christie", "Maurice Leblanc", "Gaston Leroux"), "Littérature", "Georges Simenon a créé le commissaire Maigret en 1931 avec le roman \"Pietr-le-Letton\". Ce personnage emblématique apparaît dans 75 romans et 28 nouvelles de l'écrivain belge."),
            en = LocalizedContent("Which author created Inspector Maigret?", listOf("Georges Simenon", "Agatha Christie", "Maurice Leblanc", "Gaston Leroux"), "Literature", "Georges Simenon created Inspector Maigret in 1931 with the novel 'Pietr the Latvian'. This iconic character appears in 75 novels and 28 short stories by the Belgian writer."),
            zh = LocalizedContent("哪位作家创造了梅格雷探长？", listOf("乔治·西默农", "阿加莎·克里斯蒂", "莫里斯·勒布朗", "加斯东·勒鲁"), "文学", "乔治·西默农于1931年通过小说《拉脱维亚人皮埃尔》创造了梅格雷探长。这个标志性人物出现在这位比利时作家的75部小说和28篇短篇小说中。"),
            es = LocalizedContent("¿Qué autor creó al comisario Maigret?", listOf("Georges Simenon", "Agatha Christie", "Maurice Leblanc", "Gaston Leroux"), "Literatura", "Georges Simenon creó al comisario Maigret en 1931 con la novela 'Pietr el letón'. Este personaje emblemático aparece en 75 novelas y 28 cuentos del escritor belga.")
        ),
        BilingualQuestion(
            id = 20439, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel roman commence par 'Aujourd'hui, maman est morte' ?", listOf("L'Étranger de Camus", "La Nausée de Sartre", "La Peste de Camus", "Les Mots de Sartre"), "Littérature", "Albert Camus ouvre L'Étranger par cette phrase emblématique, marquant le ton détaché et absurde du personnage de Meursault face à la mort de sa mère."),
            en = LocalizedContent("Which novel begins with 'Mother died today'?", listOf("The Stranger by Camus", "Nausea by Sartre", "The Plague by Camus", "The Words by Sartre"), "Literature", "Albert Camus opens The Stranger with this iconic sentence, setting the detached and absurd tone of the character Meursault facing his mother's death."),
            zh = LocalizedContent("哪部小说以'今天，妈妈死了'开头？", listOf("加缪的《局外人》", "萨特的《恶心》", "加缪的《鼠疫》", "萨特的《词语》"), "文学", "阿尔贝·加缪以这句标志性的话开篇《局外人》，奠定了主人公默尔索面对母亲死亡时疏离和荒谬的基调。"),
            es = LocalizedContent("¿Qué novela comienza con 'Hoy ha muerto mamá'?", listOf("El extranjero de Camus", "La náusea de Sartre", "La peste de Camus", "Las palabras de Sartre"), "Literatura", "Albert Camus abre El extranjero con esta frase emblemática, marcando el tono distante y absurdo del personaje Meursault ante la muerte de su madre.")
        ),
        BilingualQuestion(
            id = 20440, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle autrice a écrit 'Le Deuxième Sexe' ?", listOf("Simone de Beauvoir", "Virginia Woolf", "Marguerite Duras", "George Sand"), "Littérature", "Simone de Beauvoir a publié \"Le Deuxième Sexe\" en 1949, un essai fondateur du féminisme moderne qui analyse la condition des femmes à travers l'histoire et la société."),
            en = LocalizedContent("Which author wrote 'The Second Sex'?", listOf("Simone de Beauvoir", "Virginia Woolf", "Marguerite Duras", "George Sand"), "Literature", "Simone de Beauvoir published 'The Second Sex' in 1949, a foundational essay of modern feminism that analyzes the condition of women throughout history and society."),
            zh = LocalizedContent("哪位女作家写了《第二性》？", listOf("西蒙娜·德·波伏娃", "弗吉尼亚·伍尔夫", "玛格丽特·杜拉斯", "乔治·桑"), "文学", "西蒙娜·德·波伏娃于1949年出版了《第二性》，这是一部现代女权主义的奠基性论文，分析了历史上和社会中女性的状况。"),
            es = LocalizedContent("¿Qué autora escribió 'El segundo sexo'?", listOf("Simone de Beauvoir", "Virginia Woolf", "Marguerite Duras", "George Sand"), "Literatura", "Simone de Beauvoir publicó 'El segundo sexo' en 1949, un ensayo fundacional del feminismo moderno que analiza la condición de las mujeres a través de la historia y la sociedad.")
        ),
        BilingualQuestion(
            id = 20502, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est considéré comme le père de l'économie moderne ?", listOf("Adam Smith", "Karl Marx", "John Maynard Keynes", "David Ricardo"), "Économie", "Adam Smith a posé les bases de la pensée économique classique avec son ouvrage \"La Richesse des nations\" en 1776, où il a introduit des concepts clés comme la main invisible et la division du travail."),
            en = LocalizedContent("Who is considered the father of modern economics?", listOf("Adam Smith", "Karl Marx", "John Maynard Keynes", "David Ricardo"), "Economics", "Adam Smith laid the foundations of classical economic thought with his work 'The Wealth of Nations' in 1776, where he introduced key concepts like the invisible hand and division of labor."),
            zh = LocalizedContent("谁被认为是现代经济学之父？", listOf("亚当·斯密", "卡尔·马克思", "约翰·梅纳德·凯恩斯", "大卫·李嘉图"), "经济", "亚当·斯密于1776年在其著作《国富论》中奠定了古典经济思想的基础，提出了看不见的手和劳动分工等关键概念。"),
            es = LocalizedContent("¿Quién es considerado el padre de la economía moderna?", listOf("Adam Smith", "Karl Marx", "John Maynard Keynes", "David Ricardo"), "Economía", "Adam Smith sentó las bases del pensamiento económico clásico con su obra 'La riqueza de las naciones' en 1776, donde introdujo conceptos clave como la mano invisible y la división del trabajo.")
        ),
        BilingualQuestion(
            id = 20504, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle monnaie est utilisée au Japon ?", listOf("Le yen", "Le won", "Le yuan", "Le ringgit"), "Économie", "Le yen est la monnaie officielle du Japon depuis 1871, émise par la Banque du Japon. Son symbole ¥ et son code ISO JPY sont reconnus internationalement."),
            en = LocalizedContent("Which currency is used in Japan?", listOf("Yen", "Won", "Yuan", "Ringgit"), "Economics", "The yen has been the official currency of Japan since 1871, issued by the Bank of Japan. Its symbol ¥ and ISO code JPY are internationally recognized."),
            zh = LocalizedContent("日本使用什么货币？", listOf("日元", "韩元", "人民币", "林吉特"), "经济", "日元自1871年起成为日本的官方货币，由日本银行发行。其符号¥和ISO代码JPY在国际上得到认可。"),
            es = LocalizedContent("¿Qué moneda se utiliza en Japón?", listOf("El yen", "El won", "El yuan", "El ringgit"), "Economía", "El yen es la moneda oficial de Japón desde 1871, emitida por el Banco de Japón. Su símbolo ¥ y código ISO JPY son reconocidos internacionalmente.")
        ),
        BilingualQuestion(
            id = 20505, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'une récession économique ?", listOf("Deux trimestres consécutifs de croissance négative", "Une hausse du chômage", "Une baisse de la bourse", "Une crise bancaire"), "Économie", "La définition technique la plus courante d'une récession est une baisse du produit intérieur brut (PIB) pendant au moins deux trimestres consécutifs."),
            en = LocalizedContent("What is an economic recession?", listOf("Two consecutive quarters of negative growth", "A rise in unemployment", "A stock market decline", "A banking crisis"), "Economics", "The most common technical definition of a recession is a decline in gross domestic product (GDP) for at least two consecutive quarters."),
            zh = LocalizedContent("什么是经济衰退？", listOf("连续两个季度的负增长", "失业率上升", "股市下跌", "银行危机"), "经济", "经济衰退最常用的技术定义是国内生产总值（GDP）连续至少两个季度下降。"),
            es = LocalizedContent("¿Qué es una recesión económica?", listOf("Dos trimestres consecutivos de crecimiento negativo", "Un aumento del desempleo", "Una caída de la bolsa", "Una crisis bancaria"), "Economía", "La definición técnica más común de una recesión es una disminución del producto interior bruto (PIB) durante al menos dos trimestres consecutivos.")
        ),
        BilingualQuestion(
            id = 20506, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle institution fixe les taux d'intérêt dans la zone euro ?", listOf("La BCE", "La Fed", "Le FMI", "La Banque mondiale"), "Économie", "La Banque centrale européenne (BCE) est responsable de la politique monétaire de la zone euro, incluant la fixation des taux d'intérêt directeurs pour contrôler l'inflation et soutenir l'économie."),
            en = LocalizedContent("Which institution sets interest rates in the eurozone?", listOf("The ECB", "The Fed", "The IMF", "The World Bank"), "Economics", "The European Central Bank (ECB) is responsible for the monetary policy of the eurozone, including setting key interest rates to control inflation and support the economy."),
            zh = LocalizedContent("哪个机构设定欧元区的利率？", listOf("欧洲央行", "美联储", "国际货币基金组织", "世界银行"), "经济", "欧洲中央银行（ECB）负责欧元区的货币政策，包括设定关键利率以控制通胀和支持经济。"),
            es = LocalizedContent("¿Qué institución fija los tipos de interés en la zona euro?", listOf("El BCE", "La Fed", "El FMI", "El Banco Mundial"), "Economía", "El Banco Central Europeo (BCE) es responsable de la política monetaria de la zona euro, incluyendo la fijación de los tipos de interés clave para controlar la inflación y apoyar la economía.")
        ),
        BilingualQuestion(
            id = 20507, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année a eu lieu le krach de Wall Street ?", listOf("1929", "1933", "1920", "1937"), "Économie", "Le krach boursier de Wall Street a débuté le jeudi 24 octobre 1929, marquant le début de la Grande Dépression, la plus grave crise économique du XXe siècle."),
            en = LocalizedContent("In which year did the Wall Street crash occur?", listOf("1929", "1933", "1920", "1937"), "Economics", "The Wall Street stock market crash began on Thursday, October 24, 1929, marking the start of the Great Depression, the most severe economic crisis of the 20th century."),
            zh = LocalizedContent("华尔街崩盘发生在哪一年？", listOf("1929", "1933", "1920", "1937"), "经济", "华尔街股市崩盘始于1929年10月24日星期四，标志着大萧条的开始，这是20世纪最严重的经济危机。"),
            es = LocalizedContent("¿En qué año ocurrió el crac de Wall Street?", listOf("1929", "1933", "1920", "1937"), "Economía", "El crac bursátil de Wall Street comenzó el jueves 24 de octubre de 1929, marcando el inicio de la Gran Depresión, la crisis económica más grave del siglo XX.")
        ),
    )

    private fun part6(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 20509, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel économiste est associé au keynésianisme ?", listOf("John Maynard Keynes", "Milton Friedman", "Friedrich Hayek", "Adam Smith"), "Économie", "John Maynard Keynes a fondé cette école de pensée économique dans les années 1930, prônant l'intervention de l'État pour réguler l'économie et lutter contre le chômage."),
            en = LocalizedContent("Which economist is associated with Keynesianism?", listOf("John Maynard Keynes", "Milton Friedman", "Friedrich Hayek", "Adam Smith"), "Economics", "John Maynard Keynes founded this school of economic thought in the 1930s, advocating state intervention to regulate the economy and combat unemployment."),
            zh = LocalizedContent("哪位经济学家与凯恩斯主义相关？", listOf("约翰·梅纳德·凯恩斯", "米尔顿·弗里德曼", "弗里德里希·哈耶克", "亚当·斯密"), "经济", "约翰·梅纳德·凯恩斯在20世纪30年代创立了这一经济学派，主张国家干预以调节经济并应对失业。"),
            es = LocalizedContent("¿Qué economista está asociado con el keynesianismo?", listOf("John Maynard Keynes", "Milton Friedman", "Friedrich Hayek", "Adam Smith"), "Economía", "John Maynard Keynes fundó esta escuela de pensamiento económico en la década de 1930, abogando por la intervención estatal para regular la economía y combatir el desempleo.")
        ),
        BilingualQuestion(
            id = 20510, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la monnaie du Royaume-Uni ?", listOf("La livre sterling", "L'euro", "Le dollar", "Le franc"), "Économie", "La livre sterling, souvent appelée livre, est la monnaie officielle du Royaume-Uni depuis des siècles, utilisée dans ses quatre nations constitutives."),
            en = LocalizedContent("What is the currency of the United Kingdom?", listOf("Pound sterling", "Euro", "Dollar", "Franc"), "Economics", "The pound sterling, often called the pound, has been the official currency of the United Kingdom for centuries, used in its four constituent nations."),
            zh = LocalizedContent("英国的货币是什么？", listOf("英镑", "欧元", "美元", "法郎"), "经济", "英镑，通常称为镑，几个世纪以来一直是英国的官方货币，在其四个构成国中使用。"),
            es = LocalizedContent("¿Cuál es la moneda del Reino Unido?", listOf("La libra esterlina", "El euro", "El dólar", "El franco"), "Economía", "La libra esterlina, a menudo llamada libra, ha sido la moneda oficial del Reino Unido durante siglos, utilizada en sus cuatro naciones constitutivas.")
        ),
        BilingualQuestion(
            id = 20511, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Que signifie le terme 'bulle spéculative' ?", listOf("Une hausse des prix déconnectée de la valeur réelle", "Un investissement très rentable", "Une crise bancaire", "Un effondrement monétaire"), "Économie", "Une bulle spéculative se forme quand les prix d'un actif (immobilier, actions) montent bien au-delà de sa valeur fondamentale, portés par un engouement irrationnel et des achats spéculatifs, avant de s'effondrer brutalement."),
            en = LocalizedContent("What does the term 'speculative bubble' mean?", listOf("A price increase disconnected from real value", "A very profitable investment", "A banking crisis", "A monetary collapse"), "Economics", "A speculative bubble forms when the prices of an asset (real estate, stocks) rise well above its fundamental value, driven by irrational exuberance and speculative buying, before collapsing abruptly."),
            zh = LocalizedContent("术语“投机泡沫”是什么意思？", listOf("价格脱离实际价值的上涨", "一项非常有利可图的投资", "一场银行危机", "货币崩溃"), "经济", "投机泡沫是指资产（房地产、股票）的价格远高于其基本价值，由非理性繁荣和投机性购买推动，然后突然崩溃。"),
            es = LocalizedContent("¿Qué significa el término 'burbuja especulativa'?", listOf("Un aumento de precios desconectado del valor real", "Una inversión muy rentable", "Una crisis bancaria", "Un colapso monetario"), "Economía", "Una burbuja especulativa se forma cuando los precios de un activo (inmuebles, acciones) suben muy por encima de su valor fundamental, impulsados por un entusiasmo irracional y compras especulativas, antes de colapsar bruscamente.")
        ),
        BilingualQuestion(
            id = 20512, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays a le PIB le plus élevé au monde ?", listOf("Les États-Unis", "La Chine", "Le Japon", "L'Allemagne"), "Économie", "Les États-Unis possèdent la plus grande économie mondiale, avec un PIB dépassant les 25 000 milliards de dollars, grâce à leur domination dans les services, la technologie et la consommation intérieure."),
            en = LocalizedContent("Which country has the highest GDP in the world?", listOf("The United States", "China", "Japan", "Germany"), "Economics", "The United States has the largest economy in the world, with a GDP exceeding $25 trillion, thanks to its dominance in services, technology, and domestic consumption."),
            zh = LocalizedContent("哪个国家的GDP全球最高？", listOf("美国", "中国", "日本", "德国"), "经济", "美国拥有全球最大的经济体，GDP超过25万亿美元，得益于其在服务业、科技和国内消费方面的主导地位。"),
            es = LocalizedContent("¿Qué país tiene el PIB más alto del mundo?", listOf("Estados Unidos", "China", "Japón", "Alemania"), "Economía", "Estados Unidos posee la economía más grande del mundo, con un PIB que supera los 25 billones de dólares, gracias a su dominio en servicios, tecnología y consumo interno.")
        ),
        BilingualQuestion(
            id = 20513, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que l'offre et la demande ?", listOf("Le mécanisme de fixation des prix sur un marché", "Un contrat commercial", "Un système de distribution", "Un index boursier"), "Économie", "En économie, l'offre et la demande sont les forces qui interagissent sur un marché pour déterminer le prix d'équilibre d'un bien ou d'un service."),
            en = LocalizedContent("What is supply and demand?", listOf("The mechanism for setting prices in a market", "A commercial contract", "A distribution system", "A stock market index"), "Economics", "In economics, supply and demand are the forces that interact in a market to determine the equilibrium price of a good or service."),
            zh = LocalizedContent("什么是供给和需求？", listOf("市场上价格决定的机制", "一份商业合同", "一个分配系统", "一个股票指数"), "经济", "在经济学中，供给和需求是在市场上相互作用以确定商品或服务均衡价格的力量。"),
            es = LocalizedContent("¿Qué es la oferta y la demanda?", listOf("El mecanismo de fijación de precios en un mercado", "Un contrato comercial", "Un sistema de distribución", "Un índice bursátil"), "Economía", "En economía, la oferta y la demanda son las fuerzas que interactúan en un mercado para determinar el precio de equilibrio de un bien o servicio.")
        ),
        BilingualQuestion(
            id = 20514, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le rôle du FMI ?", listOf("Promouvoir la stabilité financière internationale", "Financer les guerres", "Gérer les douanes mondiales", "Fixer les prix du pétrole"), "Économie", "Le FMI a été créé en 1944 pour surveiller le système monétaire mondial et éviter les crises financières, en offrant des prêts aux pays en difficulté et en conseillant des politiques économiques."),
            en = LocalizedContent("What is the role of the IMF?", listOf("Promote international financial stability", "Finance wars", "Manage global customs", "Set oil prices"), "Economics", "The IMF was created in 1944 to monitor the global monetary system and prevent financial crises, by offering loans to countries in difficulty and advising on economic policies."),
            zh = LocalizedContent("国际货币基金组织（IMF）的作用是什么？", listOf("促进国际金融稳定", "资助战争", "管理全球海关", "设定石油价格"), "经济", "国际货币基金组织成立于1944年，旨在监督全球货币体系并防止金融危机，通过向困难国家提供贷款并就经济政策提供建议。"),
            es = LocalizedContent("¿Cuál es el papel del FMI?", listOf("Promover la estabilidad financiera internacional", "Financiar guerras", "Gestionar las aduanas mundiales", "Fijar los precios del petróleo"), "Economía", "El FMI fue creado en 1944 para supervisar el sistema monetario mundial y prevenir crisis financieras, ofreciendo préstamos a países en dificultades y asesorando sobre políticas económicas.")
        ),
        BilingualQuestion(
            id = 20516, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la principale bourse mondiale par capitalisation ?", listOf("Le NYSE (New York Stock Exchange)", "Le NASDAQ", "Le LSE (Londres)", "Le TSE (Tokyo)"), "Économie", "Le NYSE est la plus grande bourse du monde en termes de capitalisation boursière totale, dépassant largement le Nasdaq et les bourses asiatiques comme le Tokyo Stock Exchange."),
            en = LocalizedContent("What is the world's largest stock exchange by market capitalization?", listOf("The NYSE (New York Stock Exchange)", "The NASDAQ", "The LSE (London)", "The TSE (Tokyo)"), "Economics", "The NYSE is the largest stock exchange in the world in terms of total market capitalization, far surpassing the Nasdaq and Asian exchanges like the Tokyo Stock Exchange."),
            zh = LocalizedContent("按市值计算，全球最大的证券交易所是哪个？", listOf("纽约证券交易所（NYSE）", "纳斯达克（NASDAQ）", "伦敦证券交易所（LSE）", "东京证券交易所（TSE）"), "经济", "纽约证券交易所是全球市值最大的证券交易所，远超纳斯达克和东京证券交易所等亚洲交易所。"),
            es = LocalizedContent("¿Cuál es la principal bolsa de valores del mundo por capitalización?", listOf("El NYSE (Bolsa de Nueva York)", "El NASDAQ", "El LSE (Londres)", "El TSE (Tokio)"), "Economía", "El NYSE es la bolsa de valores más grande del mundo en términos de capitalización bursátil total, superando ampliamente al Nasdaq y a las bolsas asiáticas como la Bolsa de Tokio.")
        ),
        BilingualQuestion(
            id = 20517, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le commerce équitable ?", listOf("Un commerce garantissant un prix juste aux producteurs", "Un commerce sans taxes", "Un échange entre pays riches", "Un système de troc"), "Économie", "Le commerce équitable vise à assurer une rémunération décente aux producteurs des pays en développement, souvent marginalisés dans les échanges mondiaux. Ce système fixe un prix minimum garanti pour leurs produits, au-delà des fluctuations du marché classique."),
            en = LocalizedContent("What is fair trade?", listOf("Trade guaranteeing a fair price to producers", "Tax-free trade", "Exchange between rich countries", "A barter system"), "Economics", "Fair trade aims to ensure decent remuneration for producers in developing countries, often marginalized in global trade. This system sets a guaranteed minimum price for their products, beyond the fluctuations of the conventional market."),
            zh = LocalizedContent("什么是公平贸易？", listOf("保证生产者公平价格的贸易", "免税贸易", "富国之间的交换", "以物易物系统"), "经济", "公平贸易旨在确保发展中国家生产者的体面报酬，这些生产者往往在全球贸易中被边缘化。该系统为其产品设定有保障的最低价格，不受传统市场波动的影响。"),
            es = LocalizedContent("¿Qué es el comercio justo?", listOf("Un comercio que garantiza un precio justo a los productores", "Un comercio sin impuestos", "Un intercambio entre países ricos", "Un sistema de trueque"), "Economía", "El comercio justo busca asegurar una remuneración digna a los productores de países en desarrollo, a menudo marginados en los intercambios mundiales. Este sistema fija un precio mínimo garantizado para sus productos, más allá de las fluctuaciones del mercado convencional.")
        ),
        BilingualQuestion(
            id = 20518, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel accord a créé la zone de libre-échange nord-américaine ?", listOf("L'ALENA (NAFTA)", "Le TAFTA", "Le MERCOSUR", "L'ASEAN"), "Économie", "L'Accord de libre-échange nord-américain (ALENA), signé en 1994 entre les États-Unis, le Canada et le Mexique, a supprimé la plupart des barrières tarifaires entre ces trois pays. Il a été remplacé en 2020 par l'AEUMC (USMCA)."),
            en = LocalizedContent("Which agreement created the North American free trade zone?", listOf("NAFTA", "TTIP", "MERCOSUR", "ASEAN"), "Economics", "The North American Free Trade Agreement (NAFTA), signed in 1994 between the United States, Canada, and Mexico, eliminated most tariff barriers between these three countries. It was replaced in 2020 by the USMCA."),
            zh = LocalizedContent("哪个协议创建了北美自由贸易区？", listOf("北美自由贸易协定（NAFTA）", "跨大西洋贸易与投资伙伴协议（TTIP）", "南方共同市场（MERCOSUR）", "东南亚国家联盟（ASEAN）"), "经济", "北美自由贸易协定（NAFTA）于1994年由美国、加拿大和墨西哥签署，取消了这三个国家之间的大部分关税壁垒。它于2020年被美墨加协定（USMCA）取代。"),
            es = LocalizedContent("¿Qué acuerdo creó la zona de libre comercio de América del Norte?", listOf("El TLCAN (NAFTA)", "El TAFTA", "El MERCOSUR", "La ASEAN"), "Economía", "El Tratado de Libre Comercio de América del Norte (TLCAN), firmado en 1994 entre Estados Unidos, Canadá y México, eliminó la mayoría de las barreras arancelarias entre estos tres países. Fue reemplazado en 2020 por el T-MEC (USMCA).")
        ),
        BilingualQuestion(
            id = 20519, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la dette publique ?", listOf("L'ensemble des emprunts d'un État", "Le budget de l'État", "Les impôts collectés", "Le déficit commercial"), "Économie", "La dette publique désigne le total des sommes empruntées par l'État auprès d'investisseurs (banques, particuliers, autres pays) pour financer ses dépenses lorsqu'elles dépassent ses recettes."),
            en = LocalizedContent("What is public debt?", listOf("The total borrowings of a state", "The state budget", "Taxes collected", "The trade deficit"), "Economics", "Public debt refers to the total amount borrowed by the state from investors (banks, individuals, other countries) to finance its expenditures when they exceed its revenues."),
            zh = LocalizedContent("什么是公共债务？", listOf("一个国家的总借款", "国家预算", "征收的税收", "贸易逆差"), "经济", "公共债务是指国家从投资者（银行、个人、其他国家）借入的总金额，用于在其支出超过收入时为其提供资金。"),
            es = LocalizedContent("¿Qué es la deuda pública?", listOf("El conjunto de préstamos de un Estado", "El presupuesto del Estado", "Los impuestos recaudados", "El déficit comercial"), "Economía", "La deuda pública designa el total de las sumas prestadas por el Estado a inversores (bancos, particulares, otros países) para financiar sus gastos cuando estos superan sus ingresos.")
        ),
        BilingualQuestion(
            id = 20520, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle crypto-monnaie a été créée en premier ?", listOf("Bitcoin", "Ethereum", "Litecoin", "Ripple"), "Économie", "Bitcoin a été lancé en 2009 par une personne ou un groupe sous le pseudonyme Satoshi Nakamoto, ce qui en fait la première crypto-monnaie décentralisée."),
            en = LocalizedContent("Which cryptocurrency was created first?", listOf("Bitcoin", "Ethereum", "Litecoin", "Ripple"), "Economy", "Bitcoin was launched in 2009 by a person or group under the pseudonym Satoshi Nakamoto, making it the first decentralized cryptocurrency."),
            zh = LocalizedContent("哪种加密货币最先被创造？", listOf("比特币", "以太坊", "莱特币", "瑞波币"), "经济", "比特币于2009年由化名为中本聪的个人或团体推出，成为第一种去中心化的加密货币。"),
            es = LocalizedContent("¿Qué criptomoneda se creó primero?", listOf("Bitcoin", "Ethereum", "Litecoin", "Ripple"), "Economía", "Bitcoin fue lanzado en 2009 por una persona o grupo bajo el seudónimo Satoshi Nakamoto, convirtiéndose en la primera criptomoneda descentralizada.")
        ),
        BilingualQuestion(
            id = 20521, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'Le Capital' ?", listOf("Karl Marx", "Adam Smith", "Friedrich Engels", "Max Weber"), "Économie", "Publié en 1867, cet ouvrage fondateur du marxisme analyse le mode de production capitaliste et ses contradictions, posant les bases de la critique de l'économie politique."),
            en = LocalizedContent("Who wrote 'Das Kapital'?", listOf("Karl Marx", "Adam Smith", "Friedrich Engels", "Max Weber"), "Economy", "Published in 1867, this foundational work of Marxism analyzes the capitalist mode of production and its contradictions, laying the groundwork for the critique of political economy."),
            zh = LocalizedContent("谁写了《资本论》？", listOf("卡尔·马克思", "亚当·斯密", "弗里德里希·恩格斯", "马克斯·韦伯"), "经济", "这部马克思主义奠基之作于1867年出版，分析了资本主义生产方式及其矛盾，为政治经济学批判奠定了基础。"),
            es = LocalizedContent("¿Quién escribió 'El Capital'?", listOf("Karl Marx", "Adam Smith", "Friedrich Engels", "Max Weber"), "Economía", "Publicado en 1867, esta obra fundacional del marxismo analiza el modo de producción capitalista y sus contradicciones, sentando las bases de la crítica de la economía política.")
        ),
        BilingualQuestion(
            id = 20522, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le taux de change ?", listOf("La valeur d'une monnaie par rapport à une autre", "Le taux d'intérêt bancaire", "Le coût de la vie", "L'inflation annuelle"), "Économie", "Le taux de change est le prix d'une devise exprimé dans une autre, permettant les échanges internationaux et le calcul des importations/exportations."),
            en = LocalizedContent("What is the exchange rate?", listOf("The value of one currency relative to another", "The bank interest rate", "The cost of living", "Annual inflation"), "Economy", "The exchange rate is the price of one currency expressed in another, enabling international trade and the calculation of imports/exports."),
            zh = LocalizedContent("什么是汇率？", listOf("一种货币相对于另一种货币的价值", "银行利率", "生活成本", "年通货膨胀率"), "经济", "汇率是一种货币以另一种货币表示的价格，使国际贸易以及进出口计算成为可能。"),
            es = LocalizedContent("¿Qué es el tipo de cambio?", listOf("El valor de una moneda en relación con otra", "La tasa de interés bancaria", "El costo de vida", "La inflación anual"), "Economía", "El tipo de cambio es el precio de una divisa expresado en otra, permitiendo el comercio internacional y el cálculo de importaciones/exportaciones.")
        ),
        BilingualQuestion(
            id = 20523, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays est le plus grand exportateur mondial ?", listOf("La Chine", "Les États-Unis", "L'Allemagne", "Le Japon"), "Économie", "La Chine est le premier exportateur mondial depuis 2009, dépassant l'Allemagne, grâce à son rôle d'usine du monde et à sa production massive de biens manufacturés."),
            en = LocalizedContent("Which country is the world's largest exporter?", listOf("China", "The United States", "Germany", "Japan"), "Economy", "China has been the world's largest exporter since 2009, surpassing Germany, thanks to its role as the world's factory and massive production of manufactured goods."),
            zh = LocalizedContent("哪个国家是世界上最大的出口国？", listOf("中国", "美国", "德国", "日本"), "经济", "自2009年以来，中国一直是世界上最大的出口国，超过德国，这得益于其作为世界工厂的角色以及大量制成品的生产。"),
            es = LocalizedContent("¿Qué país es el mayor exportador mundial?", listOf("China", "Estados Unidos", "Alemania", "Japón"), "Economía", "China es el mayor exportador mundial desde 2009, superando a Alemania, gracias a su papel como fábrica del mundo y su producción masiva de bienes manufacturados.")
        ),
        BilingualQuestion(
            id = 20524, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'un monopole ?", listOf("Un seul vendeur sur un marché", "Plusieurs vendeurs en concurrence", "Un marché avec deux acteurs", "Un cartel de prix"), "Économie", "Un monopole désigne une situation où une seule entreprise ou entité contrôle l'offre d'un bien ou service, sans concurrent direct sur le marché."),
            en = LocalizedContent("What is a monopoly?", listOf("A single seller in a market", "Multiple sellers competing", "A market with two players", "A price cartel"), "Economy", "A monopoly refers to a situation where a single company or entity controls the supply of a good or service, with no direct competitors in the market."),
            zh = LocalizedContent("什么是垄断？", listOf("市场上只有一个卖家", "多个卖家竞争", "有两个参与者的市场", "价格卡特尔"), "经济", "垄断是指单一公司或实体控制某种商品或服务的供应，市场上没有直接竞争对手的情况。"),
            es = LocalizedContent("¿Qué es un monopolio?", listOf("Un solo vendedor en un mercado", "Varios vendedores compitiendo", "Un mercado con dos actores", "Un cártel de precios"), "Economía", "Un monopolio se refiere a una situación en la que una sola empresa o entidad controla la oferta de un bien o servicio, sin competidores directos en el mercado.")
        ),
        BilingualQuestion(
            id = 20525, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle crise a secoué le monde en 2008 ?", listOf("La crise des subprimes", "La crise de l'euro", "La crise pétrolière", "La crise asiatique"), "Économie", "La crise des subprimes est née de l'effondrement du marché immobilier américain, où des prêts hypothécaires à risque ont été massivement accordés puis revendus sous forme de produits financiers toxiques, provoquant une récession mondiale."),
            en = LocalizedContent("Which crisis shook the world in 2008?", listOf("The subprime crisis", "The euro crisis", "The oil crisis", "The Asian crisis"), "Economy", "The subprime crisis originated from the collapse of the US housing market, where risky mortgages were massively granted and then resold as toxic financial products, triggering a global recession."),
            zh = LocalizedContent("2008年哪场危机震撼了世界？", listOf("次贷危机", "欧元危机", "石油危机", "亚洲金融危机"), "经济", "次贷危机源于美国房地产市场的崩溃，高风险抵押贷款被大量发放，然后作为有毒金融产品转售，引发了全球衰退。"),
            es = LocalizedContent("¿Qué crisis sacudió al mundo en 2008?", listOf("La crisis de las subprime", "La crisis del euro", "La crisis del petróleo", "La crisis asiática"), "Economía", "La crisis de las subprime se originó por el colapso del mercado inmobiliario estadounidense, donde se concedieron masivamente hipotecas de alto riesgo que luego se revendieron como productos financieros tóxicos, provocando una recesión mundial.")
        ),
        BilingualQuestion(
            id = 20526, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel économiste a théorisé la 'main invisible' ?", listOf("Adam Smith", "David Ricardo", "John Stuart Mill", "Thomas Malthus"), "Économie", "Adam Smith a introduit ce concept dans son ouvrage *La Richesse des nations* (1776) pour décrire comment les actions individuelles guidées par l'intérêt personnel peuvent indirectement bénéficier à l'ensemble de la société."),
            en = LocalizedContent("Which economist theorized the 'invisible hand'?", listOf("Adam Smith", "David Ricardo", "John Stuart Mill", "Thomas Malthus"), "Economy", "Adam Smith introduced this concept in his work *The Wealth of Nations* (1776) to describe how individual actions guided by self-interest can indirectly benefit society as a whole."),
            zh = LocalizedContent("哪位经济学家提出了“看不见的手”理论？", listOf("亚当·斯密", "大卫·李嘉图", "约翰·斯图尔特·密尔", "托马斯·马尔萨斯"), "经济", "亚当·斯密在其著作《国富论》（1776年）中引入了这一概念，用以描述由自身利益引导的个人行为如何间接地惠及整个社会。"),
            es = LocalizedContent("¿Qué economista teorizó la 'mano invisible'?", listOf("Adam Smith", "David Ricardo", "John Stuart Mill", "Thomas Malthus"), "Economía", "Adam Smith introdujo este concepto en su obra *La riqueza de las naciones* (1776) para describir cómo las acciones individuales guiadas por el interés propio pueden beneficiar indirectamente a toda la sociedad.")
        ),
        BilingualQuestion(
            id = 20527, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le PIB par habitant ?", listOf("Le PIB divisé par le nombre d'habitants", "Le revenu moyen par ménage", "Le salaire minimum national", "La production par entreprise"), "Économie", "Le PIB par habitant permet de mesurer le niveau de vie moyen d'un pays en rapportant la production totale de richesses à sa population."),
            en = LocalizedContent("What is GDP per capita?", listOf("GDP divided by the number of inhabitants", "Average household income", "National minimum wage", "Production per company"), "Economy", "GDP per capita measures the average standard of living in a country by relating total wealth production to its population."),
            zh = LocalizedContent("什么是人均GDP？", listOf("GDP除以居民人数", "家庭平均收入", "国家最低工资", "每家公司产量"), "经济", "人均GDP通过将总财富生产与其人口联系起来，衡量一个国家的平均生活水平。"),
            es = LocalizedContent("¿Qué es el PIB per cápita?", listOf("El PIB dividido por el número de habitantes", "El ingreso promedio por hogar", "El salario mínimo nacional", "La producción por empresa"), "Economía", "El PIB per cápita mide el nivel de vida promedio de un país al relacionar la producción total de riqueza con su población.")
        ),
        BilingualQuestion(
            id = 20528, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel indice boursier français est le plus connu ?", listOf("Le CAC 40", "Le SBF 120", "Le DAX", "Le FTSE"), "Économie", "Le CAC 40 est l'indice boursier de référence de la Bourse de Paris, regroupant les 40 plus grandes capitalisations françaises cotées sur Euronext Paris."),
            en = LocalizedContent("Which French stock market index is the most well-known?", listOf("The CAC 40", "The SBF 120", "The DAX", "The FTSE"), "Economy", "The CAC 40 is the benchmark stock market index of the Paris Stock Exchange, comprising the 40 largest French market capitalizations listed on Euronext Paris."),
            zh = LocalizedContent("哪个法国股票指数最为知名？", listOf("CAC 40指数", "SBF 120指数", "DAX指数", "FTSE指数"), "经济", "CAC 40是巴黎证券交易所的基准股票指数，包含在巴黎泛欧交易所上市的40家最大的法国市值公司。"),
            es = LocalizedContent("¿Qué índice bursátil francés es el más conocido?", listOf("El CAC 40", "El SBF 120", "El DAX", "El FTSE"), "Economía", "El CAC 40 es el índice bursátil de referencia de la Bolsa de París, que agrupa las 40 mayores capitalizaciones francesas cotizadas en Euronext París.")
        ),
        BilingualQuestion(
            id = 20530, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel concept économique Thomas Piketty a-t-il popularisé ?", listOf("Les inégalités de patrimoine (r>g)", "La courbe de Laffer", "L'avantage comparatif", "La destruction créatrice"), "Économie", "Dans son ouvrage Le Capital au XXIe siècle, Thomas Piketty a démontré que le taux de rendement du capital (r) tend à être supérieur au taux de croissance économique (g), ce qui accroît mécaniquement les inégalités de patrimoine."),
            en = LocalizedContent("Which economic concept did Thomas Piketty popularize?", listOf("Wealth inequality (r > g)", "The Laffer curve", "Comparative advantage", "Creative destruction"), "Economy", "In his work *Capital in the Twenty-First Century*, Thomas Piketty demonstrated that the rate of return on capital (r) tends to be higher than the economic growth rate (g), which mechanically increases wealth inequality."),
            zh = LocalizedContent("托马斯·皮凯蒂推广了哪个经济概念？", listOf("财富不平等（r > g）", "拉弗曲线", "比较优势", "创造性破坏"), "经济", "在其著作《21世纪资本论》中，托马斯·皮凯蒂证明了资本回报率（r）往往高于经济增长率（g），这机械地加剧了财富不平等。"),
            es = LocalizedContent("¿Qué concepto económico popularizó Thomas Piketty?", listOf("La desigualdad de riqueza (r > g)", "La curva de Laffer", "La ventaja comparativa", "La destrucción creativa"), "Economía", "En su obra *El capital en el siglo XXI*, Thomas Piketty demostró que la tasa de rendimiento del capital (r) tiende a ser superior a la tasa de crecimiento económico (g), lo que incrementa mecánicamente la desigualdad de riqueza.")
        ),
        BilingualQuestion(
            id = 20601, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est le père de la psychanalyse ?", listOf("Sigmund Freud", "Carl Jung", "Jacques Lacan", "Alfred Adler"), "Sciences Humaines", "Sigmund Freud a développé la psychanalyse à la fin du XIXe siècle, en introduisant des concepts clés comme l'inconscient, la sexualité infantile et l'interprétation des rêves."),
            en = LocalizedContent("Who is the father of psychoanalysis?", listOf("Sigmund Freud", "Carl Jung", "Jacques Lacan", "Alfred Adler"), "Human Sciences", "Sigmund Freud developed psychoanalysis in the late 19th century, introducing key concepts such as the unconscious, infantile sexuality, and dream interpretation."),
            zh = LocalizedContent("谁是精神分析之父？", listOf("西格蒙德·弗洛伊德", "卡尔·荣格", "雅克·拉康", "阿尔弗雷德·阿德勒"), "人文科学", "西格蒙德·弗洛伊德在19世纪末发展了精神分析，引入了潜意识、幼儿性欲和梦的解析等关键概念。"),
            es = LocalizedContent("¿Quién es el padre del psicoanálisis?", listOf("Sigmund Freud", "Carl Jung", "Jacques Lacan", "Alfred Adler"), "Ciencias Humanas", "Sigmund Freud desarrolló el psicoanálisis a finales del siglo XIX, introduciendo conceptos clave como el inconsciente, la sexualidad infantil y la interpretación de los sueños.")
        ),
        BilingualQuestion(
            id = 20602, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la pyramide de Maslow ?", listOf("La hiérarchie des besoins humains", "Une technique de management", "Un modèle économique", "Un type d'architecture"), "Sciences Humaines", "La pyramide de Maslow classe les besoins humains par ordre de priorité, des besoins physiologiques de base jusqu'à l'accomplissement de soi, selon le psychologue Abraham Maslow."),
            en = LocalizedContent("What is Maslow's pyramid?", listOf("The hierarchy of human needs", "A management technique", "An economic model", "A type of architecture"), "Human Sciences", "Maslow's pyramid classifies human needs by priority, from basic physiological needs to self-actualization, according to psychologist Abraham Maslow."),
            zh = LocalizedContent("什么是马斯洛金字塔？", listOf("人类需求层次", "一种管理技术", "一种经济模型", "一种建筑类型"), "人文科学", "马斯洛金字塔根据心理学家亚伯拉罕·马斯洛的理论，将人类需求按优先级从基本生理需求到自我实现进行分类。"),
            es = LocalizedContent("¿Qué es la pirámide de Maslow?", listOf("La jerarquía de las necesidades humanas", "Una técnica de gestión", "Un modelo económico", "Un tipo de arquitectura"), "Ciencias Humanas", "La pirámide de Maslow clasifica las necesidades humanas por orden de prioridad, desde las necesidades fisiológicas básicas hasta la autorrealización, según el psicólogo Abraham Maslow.")
        ),
        BilingualQuestion(
            id = 20603, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel sociologue a écrit 'Le Suicide' ?", listOf("Émile Durkheim", "Max Weber", "Pierre Bourdieu", "Marcel Mauss"), "Sciences Humaines", "Émile Durkheim a publié 'Le Suicide' en 1897, une étude fondatrice qui analyse le taux de suicide comme un fait social lié à l'intégration et à la régulation sociales."),
            en = LocalizedContent("Which sociologist wrote 'Suicide'?", listOf("Émile Durkheim", "Max Weber", "Pierre Bourdieu", "Marcel Mauss"), "Human Sciences", "Émile Durkheim published 'Suicide' in 1897, a foundational study analyzing suicide rates as a social fact linked to social integration and regulation."),
            zh = LocalizedContent("哪位社会学家写了《自杀论》？", listOf("埃米尔·涂尔干", "马克斯·韦伯", "皮埃尔·布迪厄", "马塞尔·莫斯"), "人文科学", "埃米尔·涂尔干于1897年出版了《自杀论》，这是一项开创性研究，将自杀率分析为与社会整合和规范相关的社会事实。"),
            es = LocalizedContent("¿Qué sociólogo escribió 'El suicidio'?", listOf("Émile Durkheim", "Max Weber", "Pierre Bourdieu", "Marcel Mauss"), "Ciencias Humanas", "Émile Durkheim publicó 'El suicidio' en 1897, un estudio fundacional que analiza la tasa de suicidio como un hecho social vinculado a la integración y regulación sociales.")
        ),
        BilingualQuestion(
            id = 20604, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'étudie l'anthropologie ?", listOf("L'humain dans ses dimensions culturelles et biologiques", "Les animaux", "Les minéraux", "Les plantes"), "Sciences Humaines", "L'anthropologie se distingue des autres sciences humaines par son approche holistique, combinant l'étude des aspects culturels (comme les langues, les coutumes) et biologiques (comme l'évolution physique) de l'humanité."),
            en = LocalizedContent("What does anthropology study?", listOf("Humans in their cultural and biological dimensions", "Animals", "Minerals", "Plants"), "Human Sciences", "Anthropology distinguishes itself from other human sciences by its holistic approach, combining the study of cultural aspects (such as languages, customs) and biological aspects (such as physical evolution) of humanity."),
            zh = LocalizedContent("人类学研究什么？", listOf("人类的文化和生物维度", "动物", "矿物", "植物"), "人文科学", "人类学以其整体性方法区别于其他人文科学，结合了人类文化方面（如语言、习俗）和生物方面（如身体进化）的研究。"),
            es = LocalizedContent("¿Qué estudia la antropología?", listOf("El ser humano en sus dimensiones culturales y biológicas", "Los animales", "Los minerales", "Las plantas"), "Ciencias Humanas", "La antropología se distingue de otras ciencias humanas por su enfoque holístico, combinando el estudio de aspectos culturales (como lenguas, costumbres) y biológicos (como la evolución física) de la humanidad.")
        ),
        BilingualQuestion(
            id = 20605, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a développé la théorie des intelligences multiples ?", listOf("Howard Gardner", "Jean Piaget", "Lev Vygotsky", "B.F. Skinner"), "Sciences Humaines", "Howard Gardner, psychologue du développement, a proposé cette théorie en 1983 dans son livre Frames of Mind, remettant en cause la vision unique de l'intelligence mesurée par les tests de QI."),
            en = LocalizedContent("Who developed the theory of multiple intelligences?", listOf("Howard Gardner", "Jean Piaget", "Lev Vygotsky", "B.F. Skinner"), "Human Sciences", "Howard Gardner, a developmental psychologist, proposed this theory in 1983 in his book Frames of Mind, challenging the single view of intelligence measured by IQ tests."),
            zh = LocalizedContent("谁提出了多元智能理论？", listOf("霍华德·加德纳", "让·皮亚杰", "列夫·维果茨基", "B.F. 斯金纳"), "人文科学", "发展心理学家霍华德·加德纳于1983年在其著作《智能的结构》中提出了这一理论，挑战了由智商测试衡量的单一智力观。"),
            es = LocalizedContent("¿Quién desarrolló la teoría de las inteligencias múltiples?", listOf("Howard Gardner", "Jean Piaget", "Lev Vygotsky", "B.F. Skinner"), "Ciencias Humanas", "Howard Gardner, psicólogo del desarrollo, propuso esta teoría en 1983 en su libro Frames of Mind, cuestionando la visión única de la inteligencia medida por los tests de CI.")
        ),
        BilingualQuestion(
            id = 20606, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le QI ?", listOf("Le quotient intellectuel", "Le questionnaire individuel", "La qualité informatique", "Le quotient d'innovation"), "Sciences Humaines", "Le QI, ou quotient intellectuel, est un score issu de tests standardisés conçus pour mesurer certaines capacités cognitives comme le raisonnement logique et la résolution de problèmes."),
            en = LocalizedContent("What is IQ?", listOf("Intelligence quotient", "Individual questionnaire", "Information quality", "Innovation quotient"), "Human Sciences", "IQ, or intelligence quotient, is a score from standardized tests designed to measure certain cognitive abilities such as logical reasoning and problem-solving."),
            zh = LocalizedContent("什么是智商？", listOf("智力商数", "个人问卷", "信息质量", "创新商数"), "人文科学", "智商（IQ）是来自标准化测试的分数，旨在衡量逻辑推理和问题解决等某些认知能力。"),
            es = LocalizedContent("¿Qué es el CI?", listOf("Cociente intelectual", "Cuestionario individual", "Calidad informática", "Cociente de innovación"), "Ciencias Humanas", "El CI, o cociente intelectual, es una puntuación de pruebas estandarizadas diseñadas para medir ciertas capacidades cognitivas como el razonamiento lógico y la resolución de problemas.")
        ),
        BilingualQuestion(
            id = 20607, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel psychologue est connu pour l'expérience du petit Albert ?", listOf("John Watson", "B.F. Skinner", "Ivan Pavlov", "Carl Rogers"), "Sciences Humaines", "John Watson, fondateur du behaviorisme, a mené l'expérience du petit Albert en 1920 pour démontrer le conditionnement classique des peurs chez l'humain."),
            en = LocalizedContent("Which psychologist is known for the Little Albert experiment?", listOf("John Watson", "B.F. Skinner", "Ivan Pavlov", "Carl Rogers"), "Human Sciences", "John Watson, founder of behaviorism, conducted the Little Albert experiment in 1920 to demonstrate classical conditioning of fears in humans."),
            zh = LocalizedContent("哪位心理学家因小阿尔伯特实验而闻名？", listOf("约翰·华生", "B.F. 斯金纳", "伊万·巴甫洛夫", "卡尔·罗杰斯"), "人文科学", "行为主义创始人约翰·华生于1920年进行了小阿尔伯特实验，以证明人类恐惧的经典条件作用。"),
            es = LocalizedContent("¿Qué psicólogo es conocido por el experimento del pequeño Albert?", listOf("John Watson", "B.F. Skinner", "Ivan Pavlov", "Carl Rogers"), "Ciencias Humanas", "John Watson, fundador del conductismo, realizó el experimento del pequeño Albert en 1920 para demostrar el condicionamiento clásico de los miedos en humanos.")
        ),
        BilingualQuestion(
            id = 20609, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a théorisé les stades du développement cognitif chez l'enfant ?", listOf("Jean Piaget", "Sigmund Freud", "Erik Erikson", "Lawrence Kohlberg"), "Sciences Humaines", "Jean Piaget, psychologue suisse, a élaboré une théorie détaillant quatre stades du développement cognitif de l'enfant, de la naissance à l'adolescence."),
            en = LocalizedContent("Who theorized the stages of cognitive development in children?", listOf("Jean Piaget", "Sigmund Freud", "Erik Erikson", "Lawrence Kohlberg"), "Human Sciences", "Jean Piaget, a Swiss psychologist, developed a theory detailing four stages of cognitive development in children from birth to adolescence."),
            zh = LocalizedContent("谁提出了儿童认知发展阶段理论？", listOf("让·皮亚杰", "西格蒙德·弗洛伊德", "埃里克·埃里克森", "劳伦斯·科尔伯格"), "人文科学", "瑞士心理学家让·皮亚杰提出了一种理论，详细描述了从出生到青春期的四个儿童认知发展阶段。"),
            es = LocalizedContent("¿Quién teorizó las etapas del desarrollo cognitivo en los niños?", listOf("Jean Piaget", "Sigmund Freud", "Erik Erikson", "Lawrence Kohlberg"), "Ciencias Humanas", "Jean Piaget, psicólogo suizo, elaboró una teoría que detalla cuatro etapas del desarrollo cognitivo del niño, desde el nacimiento hasta la adolescencia.")
        ),
        BilingualQuestion(
            id = 20610, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'ethnographie ?", listOf("L'étude descriptive des cultures par immersion", "L'étude des langues anciennes", "L'étude des races", "L'étude de la géographie humaine"), "Sciences Humaines", "L'ethnographie repose sur l'observation participante et l'immersion prolongée du chercheur au sein d'une communauté pour décrire ses pratiques culturelles de l'intérieur."),
            en = LocalizedContent("What is ethnography?", listOf("The descriptive study of cultures through immersion", "The study of ancient languages", "The study of races", "The study of human geography"), "Human Sciences", "Ethnography relies on participant observation and prolonged immersion of the researcher within a community to describe its cultural practices from within."),
            zh = LocalizedContent("什么是民族志？", listOf("通过沉浸式体验对文化进行描述性研究", "古代语言研究", "种族研究", "人文地理研究"), "人文科学", "民族志依赖于研究者在社区内的参与观察和长期沉浸，从内部描述其文化实践。"),
            es = LocalizedContent("¿Qué es la etnografía?", listOf("El estudio descriptivo de las culturas mediante inmersión", "El estudio de las lenguas antiguas", "El estudio de las razas", "El estudio de la geografía humana"), "Ciencias Humanas", "La etnografía se basa en la observación participante y la inmersión prolongada del investigador en una comunidad para describir sus prácticas culturales desde dentro.")
        ),
        BilingualQuestion(
            id = 20611, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel sociologue français a théorisé le 'capital culturel' ?", listOf("Pierre Bourdieu", "Émile Durkheim", "Raymond Aron", "Marcel Mauss"), "Sciences Humaines", "Pierre Bourdieu a développé ce concept dans les années 1970 pour expliquer comment les connaissances, compétences et dispositions culturelles transmises par la famille et l'école reproduisent les inégalités sociales."),
            en = LocalizedContent("Which French sociologist theorized 'cultural capital'?", listOf("Pierre Bourdieu", "Émile Durkheim", "Raymond Aron", "Marcel Mauss"), "Human Sciences", "Pierre Bourdieu developed this concept in the 1970s to explain how cultural knowledge, skills, and dispositions transmitted by family and school reproduce social inequalities."),
            zh = LocalizedContent("哪位法国社会学家提出了“文化资本”理论？", listOf("皮埃尔·布迪厄", "埃米尔·涂尔干", "雷蒙·阿隆", "马塞尔·莫斯"), "人文科学", "皮埃尔·布迪厄在20世纪70年代提出了这一概念，用以解释由家庭和学校传递的文化知识、技能和性情如何再生产社会不平等。"),
            es = LocalizedContent("¿Qué sociólogo francés teorizó el 'capital cultural'?", listOf("Pierre Bourdieu", "Émile Durkheim", "Raymond Aron", "Marcel Mauss"), "Ciencias Humanas", "Pierre Bourdieu desarrolló este concepto en la década de 1970 para explicar cómo los conocimientos, habilidades y disposiciones culturales transmitidos por la familia y la escuela reproducen las desigualdades sociales.")
        ),
        BilingualQuestion(
            id = 20612, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le conditionnement pavlovien ?", listOf("Association d'un stimulus neutre à une réponse réflexe", "Un dressage animal", "Une technique thérapeutique", "Un type de réflexe inné"), "Sciences Humaines", "Le physiologiste russe Ivan Pavlov a démontré ce mécanisme en faisant saliver des chiens au son d'une cloche, associé à la présentation de nourriture."),
            en = LocalizedContent("What is Pavlovian conditioning?", listOf("Association of a neutral stimulus with a reflex response", "Animal training", "A therapeutic technique", "A type of innate reflex"), "Human Sciences", "Russian physiologist Ivan Pavlov demonstrated this mechanism by making dogs salivate at the sound of a bell, associated with the presentation of food."),
            zh = LocalizedContent("什么是巴甫洛夫条件反射？", listOf("将中性刺激与反射反应关联", "动物训练", "一种治疗技术", "一种先天反射"), "人文科学", "俄罗斯生理学家伊万·巴甫洛夫通过将铃声与食物呈现相关联，使狗听到铃声就流口水，从而证明了这一机制。"),
            es = LocalizedContent("¿Qué es el condicionamiento pavloviano?", listOf("Asociación de un estímulo neutro con una respuesta refleja", "Un adiestramiento animal", "Una técnica terapéutica", "Un tipo de reflejo innato"), "Ciencias Humanas", "El fisiólogo ruso Iván Pavlov demostró este mecanismo haciendo salivar a perros al sonido de una campana, asociado a la presentación de comida.")
        ),
        BilingualQuestion(
            id = 20613, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a fondé la linguistique structurale ?", listOf("Ferdinand de Saussure", "Noam Chomsky", "Roman Jakobson", "Claude Lévi-Strauss"), "Sciences Humaines", "Ferdinand de Saussure est considéré comme le père de la linguistique structurale grâce à son ouvrage posthume \"Cours de linguistique générale\" (1916), qui a révolutionné l'étude du langage en mettant l'accent sur la structure et les relations entre les éléments linguistiques."),
            en = LocalizedContent("Who founded structural linguistics?", listOf("Ferdinand de Saussure", "Noam Chomsky", "Roman Jakobson", "Claude Lévi-Strauss"), "Human Sciences", "Ferdinand de Saussure is considered the father of structural linguistics thanks to his posthumous work \"Course in General Linguistics\" (1916), which revolutionized the study of language by emphasizing structure and relationships between linguistic elements."),
            zh = LocalizedContent("谁创立了结构语言学？", listOf("费尔迪南·德·索绪尔", "诺姆·乔姆斯基", "罗曼·雅各布森", "克洛德·列维-斯特劳斯"), "人文科学", "费尔迪南·德·索绪尔因其遗作《普通语言学教程》（1916年）而被视为结构语言学之父，该著作通过强调语言结构及语言元素之间的关系，革新了语言研究。"),
            es = LocalizedContent("¿Quién fundó la lingüística estructural?", listOf("Ferdinand de Saussure", "Noam Chomsky", "Roman Jakobson", "Claude Lévi-Strauss"), "Ciencias Humanas", "Ferdinand de Saussure es considerado el padre de la lingüística estructural gracias a su obra póstuma \"Curso de lingüística general\" (1916), que revolucionó el estudio del lenguaje al enfatizar la estructura y las relaciones entre los elementos lingüísticos.")
        ),
        BilingualQuestion(
            id = 20614, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la dissonance cognitive ?", listOf("Le malaise causé par des croyances contradictoires", "Un trouble de la mémoire", "Un type de schizophrénie", "Une technique de persuasion"), "Sciences Humaines", "Théorisée par Leon Festinger en 1957, la dissonance cognitive décrit l'inconfort mental ressenti lorsqu'une personne tient simultanément deux idées, croyances ou opinions qui entrent en conflit."),
            en = LocalizedContent("What is cognitive dissonance?", listOf("The discomfort caused by contradictory beliefs", "A memory disorder", "A type of schizophrenia", "A persuasion technique"), "Human Sciences", "Theorized by Leon Festinger in 1957, cognitive dissonance describes the mental discomfort experienced when a person holds two conflicting ideas, beliefs, or opinions simultaneously."),
            zh = LocalizedContent("什么是认知失调？", listOf("由矛盾信念引起的不适", "一种记忆障碍", "一种精神分裂症", "一种说服技巧"), "人文科学", "由利昂·费斯廷格于1957年提出理论，认知失调描述了一个人同时持有两种相互冲突的想法、信念或观点时所经历的心理不适。"),
            es = LocalizedContent("¿Qué es la disonancia cognitiva?", listOf("El malestar causado por creencias contradictorias", "Un trastorno de la memoria", "Un tipo de esquizofrenia", "Una técnica de persuasión"), "Ciencias Humanas", "Teorizada por Leon Festinger en 1957, la disonancia cognitiva describe la incomodidad mental que se siente cuando una persona sostiene simultáneamente dos ideas, creencias u opiniones en conflicto.")
        ),
        BilingualQuestion(
            id = 20615, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a réalisé l'expérience de Milgram sur l'obéissance ?", listOf("Stanley Milgram", "Philip Zimbardo", "Solomon Asch", "Albert Bandura"), "Sciences Humaines", "Stanley Milgram, psychologue américain, a conçu cette expérience dans les années 1960 pour étudier la soumission à l'autorité, où des participants administraient des chocs électriques fictifs à un acteur."),
            en = LocalizedContent("Who conducted the Milgram experiment on obedience?", listOf("Stanley Milgram", "Philip Zimbardo", "Solomon Asch", "Albert Bandura"), "Human Sciences", "Stanley Milgram, an American psychologist, designed this experiment in the 1960s to study submission to authority, where participants administered fake electric shocks to an actor."),
            zh = LocalizedContent("谁进行了关于服从的米尔格拉姆实验？", listOf("斯坦利·米尔格拉姆", "菲利普·津巴多", "所罗门·阿希", "阿尔伯特·班杜拉"), "人文科学", "美国心理学家斯坦利·米尔格拉姆在20世纪60年代设计了这一实验，研究对权威的服从，参与者向一名演员施加假电击。"),
            es = LocalizedContent("¿Quién realizó el experimento de Milgram sobre la obediencia?", listOf("Stanley Milgram", "Philip Zimbardo", "Solomon Asch", "Albert Bandura"), "Ciencias Humanas", "Stanley Milgram, psicólogo estadounidense, diseñó este experimento en la década de 1960 para estudiar la sumisión a la autoridad, donde los participantes administraban descargas eléctricas falsas a un actor.")
        ),
        BilingualQuestion(
            id = 20616, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'effet Pygmalion ?", listOf("Les attentes influencent positivement la performance", "Un effet de groupe", "Un phénomène de rejet", "Un biais de mémoire"), "Sciences Humaines", "Découvert par Robert Rosenthal et Lenore Jacobson, cet effet montre que les attentes élevées d'un enseignant envers ses élèves améliorent leurs résultats scolaires."),
            en = LocalizedContent("What is the Pygmalion effect?", listOf("Expectations positively influence performance", "A group effect", "A rejection phenomenon", "A memory bias"), "Human Sciences", "Discovered by Robert Rosenthal and Lenore Jacobson, this effect shows that high expectations from a teacher towards their students improve their academic results."),
            zh = LocalizedContent("什么是皮格马利翁效应？", listOf("期望对表现产生积极影响", "一种群体效应", "一种排斥现象", "一种记忆偏差"), "人文科学", "由罗伯特·罗森塔尔和勒诺·雅各布森发现，这一效应表明教师对学生的高期望会提高他们的学业成绩。"),
            es = LocalizedContent("¿Qué es el efecto Pigmalión?", listOf("Las expectativas influyen positivamente en el rendimiento", "Un efecto de grupo", "Un fenómeno de rechazo", "Un sesgo de memoria"), "Ciencias Humanas", "Descubierto por Robert Rosenthal y Lenore Jacobson, este efecto muestra que las altas expectativas de un maestro hacia sus alumnos mejoran sus resultados académicos.")
        ),
        BilingualQuestion(
            id = 20617, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel courant de pensée B.F. Skinner représente-t-il ?", listOf("Le béhaviorisme", "La psychanalyse", "L'humanisme", "Le cognitivisme"), "Sciences Humaines", "B.F. Skinner est le principal représentant du béhaviorisme radical, un courant de la psychologie qui se concentre sur l'étude des comportements observables et rejetant l'introspection."),
            en = LocalizedContent("Which school of thought does B.F. Skinner represent?", listOf("Behaviorism", "Psychoanalysis", "Humanism", "Cognitivism"), "Human Sciences", "B.F. Skinner is the main representative of radical behaviorism, a school of psychology that focuses on the study of observable behaviors and rejects introspection."),
            zh = LocalizedContent("B.F. 斯金纳代表哪个思想流派？", listOf("行为主义", "精神分析", "人本主义", "认知主义"), "人文科学", "B.F. 斯金纳是激进行为主义的主要代表，这一心理学流派专注于研究可观察的行为，并拒绝内省。"),
            es = LocalizedContent("¿Qué corriente de pensamiento representa B.F. Skinner?", listOf("El conductismo", "El psicoanálisis", "El humanismo", "El cognitivismo"), "Ciencias Humanas", "B.F. Skinner es el principal representante del conductismo radical, una corriente de la psicología que se centra en el estudio de los comportamientos observables y rechaza la introspección.")
        ),
        BilingualQuestion(
            id = 20619, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a développé la théorie de l'attachement ?", listOf("John Bowlby", "Sigmund Freud", "Jean Piaget", "Mary Ainsworth"), "Sciences Humaines", "John Bowlby, un psychiatre et psychanalyste britannique, a formulé la théorie de l'attachement dans les années 1950-1960, en étudiant les liens affectifs entre les enfants et leurs figures parentales."),
            en = LocalizedContent("Who developed the attachment theory?", listOf("John Bowlby", "Sigmund Freud", "Jean Piaget", "Mary Ainsworth"), "Human Sciences", "John Bowlby, a British psychiatrist and psychoanalyst, formulated the attachment theory in the 1950s-1960s, studying the emotional bonds between children and their parental figures."),
            zh = LocalizedContent("谁发展了依恋理论？", listOf("约翰·鲍尔比", "西格蒙德·弗洛伊德", "让·皮亚杰", "玛丽·安斯沃思"), "人文科学", "英国精神病学家和精神分析学家约翰·鲍尔比在20世纪50-60年代提出了依恋理论，研究儿童与其父母形象之间的情感纽带。"),
            es = LocalizedContent("¿Quién desarrolló la teoría del apego?", listOf("John Bowlby", "Sigmund Freud", "Jean Piaget", "Mary Ainsworth"), "Ciencias Humanas", "John Bowlby, psiquiatra y psicoanalista británico, formuló la teoría del apego en las décadas de 1950-1960, estudiando los vínculos afectivos entre los niños y sus figuras parentales.")
        ),
        BilingualQuestion(
            id = 20620, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le structuralisme en anthropologie ?", listOf("L'étude des structures universelles de la pensée humaine", "L'étude des bâtiments", "L'analyse des structures sociales", "La classification des langues"), "Sciences Humaines", "Le structuralisme, développé par Claude Lévi-Strauss, postule que les phénomènes culturels (mythes, parenté) sont organisés par des structures mentales inconscientes et universelles, communes à toute l'humanité."),
            en = LocalizedContent("What is structuralism in anthropology?", listOf("The study of universal structures of human thought", "The study of buildings", "The analysis of social structures", "The classification of languages"), "Human Sciences", "Structuralism, developed by Claude Lévi-Strauss, posits that cultural phenomena (myths, kinship) are organized by unconscious and universal mental structures, common to all humanity."),
            zh = LocalizedContent("人类学中的结构主义是什么？", listOf("研究人类思维的普遍结构", "研究建筑", "分析社会结构", "语言分类"), "人文科学", "由克洛德·列维-斯特劳斯发展的结构主义认为，文化现象（神话、亲属关系）是由无意识且普遍的思维结构组织的，这些结构为全人类所共有。"),
            es = LocalizedContent("¿Qué es el estructuralismo en antropología?", listOf("El estudio de las estructuras universales del pensamiento humano", "El estudio de los edificios", "El análisis de las estructuras sociales", "La clasificación de las lenguas"), "Ciencias Humanas", "El estructuralismo, desarrollado por Claude Lévi-Strauss, postula que los fenómenos culturales (mitos, parentesco) están organizados por estructuras mentales inconscientes y universales, comunes a toda la humanidad.")
        ),
        BilingualQuestion(
            id = 20621, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel test psychologique utilise des taches d'encre ?", listOf("Le test de Rorschach", "Le test de QI", "Le MMPI", "Le test TAT"), "Sciences Humaines", "Le test de Rorschach, développé par le psychiatre suisse Hermann Rorschach dans les années 1920, utilise des planches de taches d'encre symétriques pour analyser la perception et les traits de personnalité des sujets."),
            en = LocalizedContent("Which psychological test uses inkblots?", listOf("The Rorschach test", "The IQ test", "The MMPI", "The TAT test"), "Human Sciences", "The Rorschach test, developed by Swiss psychiatrist Hermann Rorschach in the 1920s, uses symmetrical inkblot plates to analyze subjects' perception and personality traits."),
            zh = LocalizedContent("哪种心理测试使用墨迹？", listOf("罗夏测试", "智商测试", "MMPI", "TAT测试"), "人文科学", "罗夏测试由瑞士精神病学家赫尔曼·罗夏在20世纪20年代开发，使用对称的墨迹图板来分析受试者的感知和人格特质。"),
            es = LocalizedContent("¿Qué prueba psicológica utiliza manchas de tinta?", listOf("El test de Rorschach", "El test de CI", "El MMPI", "El test TAT"), "Ciencias Humanas", "El test de Rorschach, desarrollado por el psiquiatra suizo Hermann Rorschach en la década de 1920, utiliza láminas de manchas de tinta simétricas para analizar la percepción y los rasgos de personalidad de los sujetos.")
        ),
        BilingualQuestion(
            id = 20622, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a écrit 'Tristes Tropiques' ?", listOf("Claude Lévi-Strauss", "Marcel Mauss", "Bronisław Malinowski", "Margaret Mead"), "Sciences Humaines", "Claude Lévi-Strauss, anthropologue français, a publié 'Tristes Tropiques' en 1955, un récit autobiographique mêlant observations ethnographiques de ses voyages au Brésil et réflexions sur la condition humaine."),
            en = LocalizedContent("Who wrote 'Tristes Tropiques'?", listOf("Claude Lévi-Strauss", "Marcel Mauss", "Bronisław Malinowski", "Margaret Mead"), "Human Sciences", "Claude Lévi-Strauss, French anthropologist, published 'Tristes Tropiques' in 1955, an autobiographical narrative mixing ethnographic observations from his travels in Brazil and reflections on the human condition."),
            zh = LocalizedContent("谁写了《忧郁的热带》？", listOf("克洛德·列维-斯特劳斯", "马塞尔·莫斯", "布罗尼斯拉夫·马林诺夫斯基", "玛格丽特·米德"), "人文科学", "法国人类学家克洛德·列维-斯特劳斯于1955年出版了《忧郁的热带》，这是一部自传体叙述，融合了他在巴西旅行中的人种学观察以及对人类状况的反思。"),
            es = LocalizedContent("¿Quién escribió 'Tristes trópicos'?", listOf("Claude Lévi-Strauss", "Marcel Mauss", "Bronisław Malinowski", "Margaret Mead"), "Ciencias Humanas", "Claude Lévi-Strauss, antropólogo francés, publicó 'Tristes trópicos' en 1955, un relato autobiográfico que mezcla observaciones etnográficas de sus viajes a Brasil y reflexiones sobre la condición humana.")
        ),
        BilingualQuestion(
            id = 20623, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que l'empathie ?", listOf("La capacité à ressentir les émotions d'autrui", "Le désir de dominer", "L'indifférence aux autres", "La peur du jugement"), "Sciences Humaines", "L'empathie implique de comprendre et partager les sentiments d'une autre personne, contrairement à la sympathie qui est simplement une réaction de compassion."),
            en = LocalizedContent("What is empathy?", listOf("The ability to feel the emotions of others", "The desire to dominate", "Indifference to others", "Fear of judgment"), "Human Sciences", "Empathy involves understanding and sharing the feelings of another person, unlike sympathy which is merely a reaction of compassion."),
            zh = LocalizedContent("什么是同理心？", listOf("感受他人情绪的能力", "支配的欲望", "对他人的冷漠", "害怕被评判"), "人文科学", "同理心涉及理解和分享他人的感受，而同情心仅仅是一种怜悯的反应。"),
            es = LocalizedContent("¿Qué es la empatía?", listOf("La capacidad de sentir las emociones de los demás", "El deseo de dominar", "La indiferencia hacia los demás", "El miedo al juicio"), "Ciencias Humanas", "La empatía implica comprender y compartir los sentimientos de otra persona, a diferencia de la simpatía que es simplemente una reacción de compasión.")
        ),
        BilingualQuestion(
            id = 20624, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept central de la psychologie positive ?", listOf("Le bien-être et l'épanouissement", "Les troubles mentaux", "Les traumatismes", "L'inconscient"), "Sciences Humaines", "La psychologie positive, fondée par Martin Seligman, se concentre sur l'étude des forces et des vertus qui permettent aux individus et aux communautés de s'épanouir, plutôt que sur les pathologies."),
            en = LocalizedContent("What is the central concept of positive psychology?", listOf("Well-being and flourishing", "Mental disorders", "Traumas", "The unconscious"), "Human Sciences", "Positive psychology, founded by Martin Seligman, focuses on the study of strengths and virtues that enable individuals and communities to thrive, rather than on pathologies."),
            zh = LocalizedContent("积极心理学的核心概念是什么？", listOf("幸福和蓬勃发展", "精神障碍", "创伤", "潜意识"), "人文科学", "积极心理学由马丁·塞利格曼创立，专注于研究使个人和社区蓬勃发展的优势和美德，而非病理学。"),
            es = LocalizedContent("¿Cuál es el concepto central de la psicología positiva?", listOf("El bienestar y la realización", "Los trastornos mentales", "Los traumas", "El inconsciente"), "Ciencias Humanas", "La psicología positiva, fundada por Martin Seligman, se centra en el estudio de las fortalezas y virtudes que permiten a individuos y comunidades prosperar, en lugar de las patologías.")
        ),
        BilingualQuestion(
            id = 20625, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé l'expérience de Stanford sur les prisons ?", listOf("Philip Zimbardo", "Stanley Milgram", "Solomon Asch", "Albert Bandura"), "Sciences Humaines", "Philip Zimbardo, psychologue américain, a conçu cette étude en 1971 pour examiner les effets psychologiques du pouvoir et de l'autorité en milieu carcéral simulé."),
            en = LocalizedContent("Who created the Stanford prison experiment?", listOf("Philip Zimbardo", "Stanley Milgram", "Solomon Asch", "Albert Bandura"), "Human Sciences", "Philip Zimbardo, an American psychologist, designed this study in 1971 to examine the psychological effects of power and authority in a simulated prison environment."),
            zh = LocalizedContent("谁创建了斯坦福监狱实验？", listOf("菲利普·津巴多", "斯坦利·米尔格拉姆", "所罗门·阿希", "阿尔伯特·班杜拉"), "人文科学", "美国心理学家菲利普·津巴多于1971年设计了这项研究，以考察模拟监狱环境中权力和权威的心理影响。"),
            es = LocalizedContent("¿Quién creó el experimento de la prisión de Stanford?", listOf("Philip Zimbardo", "Stanley Milgram", "Solomon Asch", "Albert Bandura"), "Ciencias Humanas", "Philip Zimbardo, psicólogo estadounidense, diseñó este estudio en 1971 para examinar los efectos psicológicos del poder y la autoridad en un entorno carcelario simulado.")
        ),
        BilingualQuestion(
            id = 20701, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel philosophe a dit 'Je pense, donc je suis' ?", listOf("René Descartes", "Blaise Pascal", "Voltaire", "Jean-Jacques Rousseau"), "Philosophie", "Cette phrase est le point de départ de la méthode de René Descartes, qui cherchait une vérité indubitable en doutant de tout. Elle apparaît dans son Discours de la méthode (1637)."),
            en = LocalizedContent("Which philosopher said 'I think, therefore I am'?", listOf("René Descartes", "Blaise Pascal", "Voltaire", "Jean-Jacques Rousseau"), "Philosophy", "This phrase is the starting point of René Descartes' method, who sought an indubitable truth by doubting everything. It appears in his Discourse on the Method (1637)."),
            zh = LocalizedContent("哪位哲学家说过“我思故我在”？", listOf("勒内·笛卡尔", "布莱兹·帕斯卡", "伏尔泰", "让-雅克·卢梭"), "哲学", "这句话是勒内·笛卡尔方法的起点，他通过怀疑一切来寻找不容置疑的真理。它出现在他的《方法论》（1637年）中。"),
            es = LocalizedContent("¿Qué filósofo dijo 'Pienso, luego existo'?", listOf("René Descartes", "Blaise Pascal", "Voltaire", "Jean-Jacques Rousseau"), "Filosofía", "Esta frase es el punto de partida del método de René Descartes, quien buscaba una verdad indudable dudando de todo. Aparece en su Discurso del método (1637).")
        ),
        BilingualQuestion(
            id = 20702, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe grec a enseigné dans l'Académie ?", listOf("Platon", "Aristote", "Socrate", "Épicure"), "Philosophie", "Platon fonda l'Académie à Athènes vers 387 av. J.-C., une école philosophique majeure où il enseigna jusqu'à sa mort."),
            en = LocalizedContent("Which Greek philosopher taught at the Academy?", listOf("Plato", "Aristotle", "Socrates", "Epicurus"), "Philosophy", "Plato founded the Academy in Athens around 387 BC, a major philosophical school where he taught until his death."),
            zh = LocalizedContent("哪位希腊哲学家在学园授课？", listOf("柏拉图", "亚里士多德", "苏格拉底", "伊壁鸠鲁"), "哲学", "柏拉图于公元前387年左右在雅典创立了学园，这是一所重要的哲学学校，他一直在那里教学直至去世。"),
            es = LocalizedContent("¿Qué filósofo griego enseñó en la Academia?", listOf("Platón", "Aristóteles", "Sócrates", "Epicuro"), "Filosofía", "Platón fundó la Academia en Atenas alrededor del 387 a.C., una importante escuela filosófica donde enseñó hasta su muerte.")
        ),
        BilingualQuestion(
            id = 20704, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe a écrit 'Le Prince' ?", listOf("Machiavel", "Hobbes", "Locke", "Rousseau"), "Philosophie", "Nicolas Machiavel a rédigé \"Le Prince\" en 1513, un traité politique qui analyse les moyens de conquérir et de maintenir le pouvoir, souvent associé à la notion de machiavélisme."),
            en = LocalizedContent("Which philosopher wrote 'The Prince'?", listOf("Machiavelli", "Hobbes", "Locke", "Rousseau"), "Philosophy", "Niccolò Machiavelli wrote 'The Prince' in 1513, a political treatise analyzing the means to conquer and maintain power, often associated with the notion of Machiavellianism."),
            zh = LocalizedContent("哪位哲学家写了《君主论》？", listOf("马基雅维利", "霍布斯", "洛克", "卢梭"), "哲学", "尼可罗·马基雅维利于1513年撰写了《君主论》，这是一部分析征服和维持权力手段的政治论著，常与马基雅维利主义的概念相关联。"),
            es = LocalizedContent("¿Qué filósofo escribió 'El Príncipe'?", listOf("Maquiavelo", "Hobbes", "Locke", "Rousseau"), "Filosofía", "Nicolás Maquiavelo escribió 'El Príncipe' en 1513, un tratado político que analiza los medios para conquistar y mantener el poder, a menudo asociado con la noción de maquiavelismo.")
        ),
        BilingualQuestion(
            id = 20705, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a fondé le stoïcisme ?", listOf("Zénon de Kition", "Épicure", "Diogène", "Aristote"), "Philosophie", "Zénon de Kition, un philosophe grec du IVe siècle avant J.-C., a fondé l'école stoïcienne à Athènes vers 300 av. J.-C., en enseignant que la vertu et la raison sont les clés du bonheur."),
            en = LocalizedContent("Who founded Stoicism?", listOf("Zeno of Citium", "Epicurus", "Diogenes", "Aristotle"), "Philosophy", "Zeno of Citium, a Greek philosopher of the 4th century BC, founded the Stoic school in Athens around 300 BC, teaching that virtue and reason are the keys to happiness."),
            zh = LocalizedContent("谁创立了斯多葛主义？", listOf("基提翁的芝诺", "伊壁鸠鲁", "第欧根尼", "亚里士多德"), "哲学", "基提翁的芝诺，一位公元前4世纪的希腊哲学家，于公元前300年左右在雅典创立了斯多葛学派，教导美德和理性是幸福的关键。"),
            es = LocalizedContent("¿Quién fundó el estoicismo?", listOf("Zenón de Citio", "Epicuro", "Diógenes", "Aristóteles"), "Filosofía", "Zenón de Citio, un filósofo griego del siglo IV a.C., fundó la escuela estoica en Atenas alrededor del 300 a.C., enseñando que la virtud y la razón son las claves de la felicidad.")
        ),
        BilingualQuestion(
            id = 20706, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel concept Nietzsche a-t-il développé avec le 'surhomme' ?", listOf("Le dépassement de soi et la création de valeurs", "La supériorité physique", "Le pouvoir politique", "La domination militaire"), "Philosophie", "Pour Nietzsche, le surhomme (Übermensch) représente l'individu qui se dépasse sans cesse et crée ses propres valeurs, s'opposant ainsi au conformisme moral et à la passivité du dernier homme."),
            en = LocalizedContent("What concept did Nietzsche develop with the 'overman'?", listOf("Self-overcoming and the creation of values", "Physical superiority", "Political power", "Military domination"), "Philosophy", "For Nietzsche, the overman (Übermensch) represents the individual who constantly surpasses himself and creates his own values, thus opposing moral conformism and the passivity of the last man."),
            zh = LocalizedContent("尼采通过“超人”发展了哪个概念？", listOf("自我超越和创造价值", "身体优越性", "政治权力", "军事统治"), "哲学", "对尼采来说，超人（Übermensch）代表不断超越自我并创造自身价值的个体，从而反对道德顺从和末人的被动性。"),
            es = LocalizedContent("¿Qué concepto desarrolló Nietzsche con el 'superhombre'?", listOf("La superación de uno mismo y la creación de valores", "La superioridad física", "El poder político", "La dominación militar"), "Filosofía", "Para Nietzsche, el superhombre (Übermensch) representa al individuo que se supera constantemente y crea sus propios valores, oponiéndose así al conformismo moral y a la pasividad del último hombre.")
        ),
        BilingualQuestion(
            id = 20707, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'allégorie de la caverne de Platon ?", listOf("Une métaphore sur l'illusion et la connaissance", "Un mythe sur la création du monde", "Une histoire sur la justice", "Un poème sur l'amour"), "Philosophie", "Dans La République, Platon imagine des prisonniers enchaînés dans une caverne ne voyant que des ombres, symbolisant l'ignorance humaine. La sortie vers la lumière représente l'accès à la connaissance et à la réalité véritable."),
            en = LocalizedContent("What is Plato's allegory of the cave?", listOf("A metaphor about illusion and knowledge", "A myth about the creation of the world", "A story about justice", "A poem about love"), "Philosophy", "In The Republic, Plato imagines prisoners chained in a cave seeing only shadows, symbolizing human ignorance. The exit towards the light represents access to knowledge and true reality."),
            zh = LocalizedContent("柏拉图的洞穴寓言是什么？", listOf("关于幻觉和知识的隐喻", "关于世界创造的神话", "关于正义的故事", "关于爱的诗"), "哲学", "在《理想国》中，柏拉图想象囚徒被锁在洞穴中，只能看到影子，象征着人类的无知。走向光明的出口代表着获得知识和真实现实。"),
            es = LocalizedContent("¿Qué es la alegoría de la caverna de Platón?", listOf("Una metáfora sobre la ilusión y el conocimiento", "Un mito sobre la creación del mundo", "Una historia sobre la justicia", "Un poema sobre el amor"), "Filosofía", "En La República, Platón imagina prisioneros encadenados en una caverna que solo ven sombras, simbolizando la ignorancia humana. La salida hacia la luz representa el acceso al conocimiento y a la realidad verdadera.")
        ),
        BilingualQuestion(
            id = 20708, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe a écrit 'Critique de la raison pure' ?", listOf("Emmanuel Kant", "Georg Hegel", "Arthur Schopenhauer", "Ludwig Wittgenstein"), "Philosophie", "Emmanuel Kant a publié la *Critique de la raison pure* en 1781, une œuvre fondatrice qui examine les limites et les possibilités de la connaissance humaine sans recourir à l'expérience."),
            en = LocalizedContent("Which philosopher wrote 'Critique of Pure Reason'?", listOf("Immanuel Kant", "Georg Hegel", "Arthur Schopenhauer", "Ludwig Wittgenstein"), "Philosophy", "Immanuel Kant published the *Critique of Pure Reason* in 1781, a foundational work that examines the limits and possibilities of human knowledge without recourse to experience."),
            zh = LocalizedContent("哪位哲学家写了《纯粹理性批判》？", listOf("伊曼努尔·康德", "格奥尔格·黑格尔", "亚瑟·叔本华", "路德维希·维特根斯坦"), "哲学", "伊曼努尔·康德于1781年出版了《纯粹理性批判》，这是一部基础性著作，考察了人类知识在不依赖经验的情况下的界限和可能性。"),
            es = LocalizedContent("¿Qué filósofo escribió 'Crítica de la razón pura'?", listOf("Immanuel Kant", "Georg Hegel", "Arthur Schopenhauer", "Ludwig Wittgenstein"), "Filosofía", "Immanuel Kant publicó la *Crítica de la razón pura* en 1781, una obra fundacional que examina los límites y posibilidades del conocimiento humano sin recurrir a la experiencia.")
        ),
        BilingualQuestion(
            id = 20709, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'utilitarisme ?", listOf("Le plus grand bonheur pour le plus grand nombre", "La recherche du plaisir individuel", "Le respect absolu des règles", "L'obéissance à Dieu"), "Philosophie", "L'utilitarisme, fondé par Jeremy Bentham et John Stuart Mill, évalue la moralité d'une action en fonction de sa capacité à maximiser le bien-être général. Le principe du plus grand bonheur pour le plus grand nombre en est le critère central."),
            en = LocalizedContent("What is utilitarianism?", listOf("The greatest happiness for the greatest number", "The pursuit of individual pleasure", "Absolute adherence to rules", "Obedience to God"), "Philosophy", "Utilitarianism, founded by Jeremy Bentham and John Stuart Mill, evaluates the morality of an action based on its ability to maximize general well-being. The principle of the greatest happiness for the greatest number is its central criterion."),
            zh = LocalizedContent("什么是功利主义？", listOf("最大多数人的最大幸福", "追求个人快乐", "绝对遵守规则", "服从上帝"), "哲学", "功利主义由杰里米·边沁和约翰·斯图尔特·密尔创立，根据行动最大化总体福祉的能力来评估其道德性。最大多数人的最大幸福原则是其核心标准。"),
            es = LocalizedContent("¿Qué es el utilitarismo?", listOf("La mayor felicidad para el mayor número", "La búsqueda del placer individual", "El respeto absoluto de las reglas", "La obediencia a Dios"), "Filosofía", "El utilitarismo, fundado por Jeremy Bentham y John Stuart Mill, evalúa la moralidad de una acción según su capacidad para maximizar el bienestar general. El principio de la mayor felicidad para el mayor número es su criterio central.")
        ),
        BilingualQuestion(
            id = 20710, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel philosophe vivait dans un tonneau ?", listOf("Diogène de Sinope", "Socrate", "Platon", "Épicure"), "Philosophie", "Diogène de Sinope, figure emblématique de l'école cynique, choisissait de vivre dans un tonneau pour illustrer son mépris des conventions sociales et des besoins matériels."),
            en = LocalizedContent("Which philosopher lived in a barrel?", listOf("Diogenes of Sinope", "Socrates", "Plato", "Epicurus"), "Philosophy", "Diogenes of Sinope, an emblematic figure of the Cynic school, chose to live in a barrel to illustrate his contempt for social conventions and material needs."),
            zh = LocalizedContent("哪位哲学家住在木桶里？", listOf("锡诺普的第欧根尼", "苏格拉底", "柏拉图", "伊壁鸠鲁"), "哲学", "锡诺普的第欧根尼是犬儒学派代表人物，他选择住在木桶里以表达对社会习俗和物质需求的蔑视。"),
            es = LocalizedContent("¿Qué filósofo vivía en un tonel?", listOf("Diógenes de Sinope", "Sócrates", "Platón", "Epicuro"), "Filosofía", "Diógenes de Sinope, figura emblemática de la escuela cínica, eligió vivir en un tonel para ilustrar su desprecio por las convenciones sociales y las necesidades materiales.")
        ),
        BilingualQuestion(
            id = 20711, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a développé le concept de 'contrat social' ?", listOf("Jean-Jacques Rousseau", "Thomas Hobbes", "John Locke", "Montesquieu"), "Philosophie", "Dans son ouvrage majeur *Du contrat social* (1762), Rousseau théorise que la légitimité de l'autorité politique repose sur un pacte entre les citoyens, où chacun aliène ses droits naturels au profit de la volonté générale."),
            en = LocalizedContent("Who developed the concept of the 'social contract'?", listOf("Jean-Jacques Rousseau", "Thomas Hobbes", "John Locke", "Montesquieu"), "Philosophy", "In his major work *The Social Contract* (1762), Rousseau theorizes that the legitimacy of political authority rests on a pact among citizens, where each alienates their natural rights in favor of the general will."),
            zh = LocalizedContent("谁提出了“社会契约”的概念？", listOf("让-雅克·卢梭", "托马斯·霍布斯", "约翰·洛克", "孟德斯鸠"), "哲学", "在其主要著作《社会契约论》（1762年）中，卢梭提出政治权威的合法性建立在公民之间的契约之上，每个人将其自然权利让渡给公意。"),
            es = LocalizedContent("¿Quién desarrolló el concepto de 'contrato social'?", listOf("Jean-Jacques Rousseau", "Thomas Hobbes", "John Locke", "Montesquieu"), "Filosofía", "En su obra principal *El contrato social* (1762), Rousseau teoriza que la legitimidad de la autoridad política descansa en un pacto entre los ciudadanos, donde cada uno aliena sus derechos naturales en favor de la voluntad general.")
        ),
        BilingualQuestion(
            id = 20712, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel philosophe a été condamné à boire la ciguë ?", listOf("Socrate", "Platon", "Aristote", "Diogène"), "Philosophie", "Socrate a été condamné à mort par la cité d'Athènes en 399 av. J.-C. pour impiété et corruption de la jeunesse, et a exécuté sa peine en buvant une coupe de ciguë."),
            en = LocalizedContent("Which philosopher was condemned to drink hemlock?", listOf("Socrates", "Plato", "Aristotle", "Diogenes"), "Philosophy", "Socrates was sentenced to death by the city of Athens in 399 BC for impiety and corrupting the youth, and he carried out the sentence by drinking a cup of hemlock."),
            zh = LocalizedContent("哪位哲学家被判处饮毒芹汁？", listOf("苏格拉底", "柏拉图", "亚里士多德", "第欧根尼"), "哲学", "苏格拉底于公元前399年被雅典城邦以不敬神和败坏青年罪判处死刑，他通过饮下一杯毒芹汁执行了判决。"),
            es = LocalizedContent("¿Qué filósofo fue condenado a beber cicuta?", listOf("Sócrates", "Platón", "Aristóteles", "Diógenes"), "Filosofía", "Sócrates fue condenado a muerte por la ciudad de Atenas en el 399 a.C. por impiedad y corrupción de la juventud, y ejecutó la pena bebiendo una copa de cicuta.")
        ),
        BilingualQuestion(
            id = 20714, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel philosophe a écrit 'Être et Temps' ?", listOf("Martin Heidegger", "Jean-Paul Sartre", "Edmund Husserl", "Hannah Arendt"), "Philosophie", "Martin Heidegger a publié Être et Temps en 1927, une œuvre majeure de la philosophie existentielle et phénoménologique qui interroge le sens de l'être."),
            en = LocalizedContent("Which philosopher wrote 'Being and Time'?", listOf("Martin Heidegger", "Jean-Paul Sartre", "Edmund Husserl", "Hannah Arendt"), "Philosophy", "Martin Heidegger published Being and Time in 1927, a major work of existential and phenomenological philosophy that questions the meaning of being."),
            zh = LocalizedContent("哪位哲学家写了《存在与时间》？", listOf("马丁·海德格尔", "让-保罗·萨特", "埃德蒙·胡塞尔", "汉娜·阿伦特"), "哲学", "马丁·海德格尔于1927年出版了《存在与时间》，这是一部存在主义和现象学哲学的重要著作，探讨了存在的意义。"),
            es = LocalizedContent("¿Qué filósofo escribió 'Ser y tiempo'?", listOf("Martin Heidegger", "Jean-Paul Sartre", "Edmund Husserl", "Hannah Arendt"), "Filosofía", "Martin Heidegger publicó Ser y tiempo en 1927, una obra mayor de la filosofía existencial y fenomenológica que interroga el sentido del ser.")
        ),
        BilingualQuestion(
            id = 20715, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le paradoxe du bateau de Thésée ?", listOf("Un objet reste-t-il le même si toutes ses parties sont remplacées ?", "Peut-on voyager dans le temps ?", "Existe-t-il un dieu ?", "Le monde est-il réel ?"), "Philosophie", "Ce paradoxe, posé par Plutarque, interroge l'identité d'un objet à travers le temps : si l'on remplace une à une toutes les planches du navire de Thésée, est-ce toujours le même bateau ?"),
            en = LocalizedContent("What is the paradox of Theseus's ship?", listOf("Does an object remain the same if all its parts are replaced?", "Can we travel in time?", "Does God exist?", "Is the world real?"), "Philosophy", "This paradox, posed by Plutarch, questions the identity of an object over time: if one replaces one by one all the planks of Theseus's ship, is it still the same ship?"),
            zh = LocalizedContent("忒修斯之船悖论是什么？", listOf("如果一个物体的所有部分都被替换，它还是原来的物体吗？", "我们能穿越时间吗？", "上帝存在吗？", "世界是真实的吗？"), "哲学", "这个由普鲁塔克提出的悖论质疑物体在时间中的同一性：如果逐一替换忒修斯船的所有木板，它还是同一艘船吗？"),
            es = LocalizedContent("¿Qué es la paradoja del barco de Teseo?", listOf("¿Un objeto sigue siendo el mismo si se reemplazan todas sus partes?", "¿Podemos viajar en el tiempo?", "¿Existe Dios?", "¿Es real el mundo?"), "Filosofía", "Esta paradoja, planteada por Plutarco, cuestiona la identidad de un objeto a través del tiempo: si se reemplazan una a una todas las tablas del barco de Teseo, ¿sigue siendo el mismo barco?")
        ),
        BilingualQuestion(
            id = 20716, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel philosophe a développé la dialectique hégélienne ?", listOf("Georg Wilhelm Friedrich Hegel", "Karl Marx", "Friedrich Engels", "Ludwig Feuerbach"), "Philosophie", "Georg Wilhelm Friedrich Hegel a formalisé la dialectique comme un processus triadique (thèse, antithèse, synthèse) dans son œuvre majeure, la Phénoménologie de l'esprit."),
            en = LocalizedContent("Which philosopher developed the Hegelian dialectic?", listOf("Georg Wilhelm Friedrich Hegel", "Karl Marx", "Friedrich Engels", "Ludwig Feuerbach"), "Philosophy", "Georg Wilhelm Friedrich Hegel formalized the dialectic as a triadic process (thesis, antithesis, synthesis) in his major work, the Phenomenology of Spirit."),
            zh = LocalizedContent("哪位哲学家发展了黑格尔辩证法？", listOf("格奥尔格·威廉·弗里德里希·黑格尔", "卡尔·马克思", "弗里德里希·恩格斯", "路德维希·费尔巴哈"), "哲学", "格奥尔格·威廉·弗里德里希·黑格尔在其主要著作《精神现象学》中将辩证法形式化为一个三元过程（正题、反题、合题）。"),
            es = LocalizedContent("¿Qué filósofo desarrolló la dialéctica hegeliana?", listOf("Georg Wilhelm Friedrich Hegel", "Karl Marx", "Friedrich Engels", "Ludwig Feuerbach"), "Filosofía", "Georg Wilhelm Friedrich Hegel formalizó la dialéctica como un proceso triádico (tesis, antítesis, síntesis) en su obra mayor, la Fenomenología del espíritu.")
        ),
        BilingualQuestion(
            id = 20718, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel philosophe a écrit 'Le mythe de Sisyphe' ?", listOf("Albert Camus", "Jean-Paul Sartre", "Simone de Beauvoir", "Maurice Merleau-Ponty"), "Philosophie", "Albert Camus a publié *Le Mythe de Sisyphe* en 1942, un essai qui expose sa philosophie de l'absurde, en prenant le mythe de Sisyphe comme métaphore de la condition humaine."),
            en = LocalizedContent("Which philosopher wrote 'The Myth of Sisyphus'?", listOf("Albert Camus", "Jean-Paul Sartre", "Simone de Beauvoir", "Maurice Merleau-Ponty"), "Philosophy", "Albert Camus published *The Myth of Sisyphus* in 1942, an essay that expounds his philosophy of the absurd, using the myth of Sisyphus as a metaphor for the human condition."),
            zh = LocalizedContent("哪位哲学家写了《西西弗神话》？", listOf("阿尔贝·加缪", "让-保罗·萨特", "西蒙娜·德·波伏娃", "莫里斯·梅洛-庞蒂"), "哲学", "阿尔贝·加缪于1942年出版了《西西弗神话》，这是一篇阐述其荒诞哲学的散文，以西西弗神话作为人类处境的隐喻。"),
            es = LocalizedContent("¿Qué filósofo escribió 'El mito de Sísifo'?", listOf("Albert Camus", "Jean-Paul Sartre", "Simone de Beauvoir", "Maurice Merleau-Ponty"), "Filosofía", "Albert Camus publicó *El mito de Sísifo* en 1942, un ensayo que expone su filosofía del absurdo, tomando el mito de Sísifo como metáfora de la condición humana.")
        ),
        BilingualQuestion(
            id = 20719, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'est-ce que le solipsisme ?", listOf("Seul mon esprit est certain d'exister", "Tout est matière", "Dieu est en tout", "L'univers est infini"), "Philosophie", "Le solipsisme est une position philosophique radicale qui affirme que la seule certitude est l'existence de son propre esprit, le monde extérieur et les autres consciences n'étant que des constructions possibles."),
            en = LocalizedContent("What is solipsism?", listOf("Only my mind is certain to exist", "Everything is matter", "God is in everything", "The universe is infinite"), "Philosophy", "Solipsism is a radical philosophical position that asserts the only certainty is the existence of one's own mind, with the external world and other minds being merely possible constructions."),
            zh = LocalizedContent("什么是唯我论？", listOf("只有我的心灵确定存在", "一切都是物质", "上帝存在于万物之中", "宇宙是无限的"), "哲学", "唯我论是一种激进的哲学立场，声称唯一确定的是自己心灵的存在，外部世界和其他意识只是可能的构造。"),
            es = LocalizedContent("¿Qué es el solipsismo?", listOf("Solo mi mente es cierta de existir", "Todo es materia", "Dios está en todo", "El universo es infinito"), "Filosofía", "El solipsismo es una posición filosófica radical que afirma que la única certeza es la existencia de la propia mente, siendo el mundo exterior y las demás conciencias meras construcciones posibles.")
        ),
        BilingualQuestion(
            id = 20720, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel philosophe a inventé la notion de 'volonté de puissance' ?", listOf("Friedrich Nietzsche", "Arthur Schopenhauer", "Søren Kierkegaard", "Martin Heidegger"), "Philosophie", "Friedrich Nietzsche a développé ce concept dans ses œuvres tardives, notamment dans Ainsi parlait Zarathoustra, pour décrire une force fondamentale d'affirmation et de dépassement de soi qui anime tous les êtres vivants."),
            en = LocalizedContent("Which philosopher invented the notion of 'will to power'?", listOf("Friedrich Nietzsche", "Arthur Schopenhauer", "Søren Kierkegaard", "Martin Heidegger"), "Philosophy", "Friedrich Nietzsche developed this concept in his later works, notably in Thus Spoke Zarathustra, to describe a fundamental force of affirmation and self-overcoming that animates all living beings."),
            zh = LocalizedContent("哪位哲学家提出了“权力意志”的概念？", listOf("弗里德里希·尼采", "亚瑟·叔本华", "索伦·克尔凯郭尔", "马丁·海德格尔"), "哲学", "弗里德里希·尼采在其晚期著作中，特别是在《查拉图斯特拉如是说》中，发展了这一概念，用以描述一种驱动所有生命体的肯定和自我超越的基本力量。"),
            es = LocalizedContent("¿Qué filósofo inventó la noción de 'voluntad de poder'?", listOf("Friedrich Nietzsche", "Arthur Schopenhauer", "Søren Kierkegaard", "Martin Heidegger"), "Filosofía", "Friedrich Nietzsche desarrolló este concepto en sus obras tardías, especialmente en Así habló Zaratustra, para describir una fuerza fundamental de afirmación y superación de sí mismo que anima a todos los seres vivos.")
        ),
        BilingualQuestion(
            id = 20722, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel penseur chinois est le fondateur du taoïsme ?", listOf("Lao Tseu", "Confucius", "Mencius", "Zhuangzi"), "Philosophie", "Lao Tseu est considéré comme le fondateur du taoïsme, une philosophie chinoise antique centrée sur le concept de Dao (la Voie). Son ouvrage principal, le Tao Te King, pose les bases de cette tradition spirituelle et morale."),
            en = LocalizedContent("Which Chinese thinker is the founder of Taoism?", listOf("Lao Tzu", "Confucius", "Mencius", "Zhuangzi"), "Philosophy", "Lao Tzu is considered the founder of Taoism, an ancient Chinese philosophy centered on the concept of Dao (the Way). His main work, the Tao Te Ching, lays the foundation for this spiritual and moral tradition."),
            zh = LocalizedContent("哪位中国思想家是道教的创始人？", listOf("老子", "孔子", "孟子", "庄子"), "哲学", "老子被认为是道教的创始人，这是一种以道（道路）概念为中心的古老中国哲学。他的主要著作《道德经》奠定了这一精神和道德传统的基础。"),
            es = LocalizedContent("¿Qué pensador chino es el fundador del taoísmo?", listOf("Lao Tse", "Confucio", "Mencius", "Zhuangzi"), "Filosofía", "Lao Tse es considerado el fundador del taoísmo, una antigua filosofía china centrada en el concepto del Dao (el Camino). Su obra principal, el Tao Te King, sienta las bases de esta tradición espiritual y moral.")
        ),
        BilingualQuestion(
            id = 20723, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel concept Simone de Beauvoir a-t-elle développé ?", listOf("On ne naît pas femme, on le devient", "L'existence précède l'essence", "L'homme est un loup pour l'homme", "Je pense donc je suis"), "Philosophie", "Simone de Beauvoir a développé ce concept dans Le Deuxième Sexe (1949) pour affirmer que la condition féminine est une construction sociale et culturelle, et non une essence biologique."),
            en = LocalizedContent("Which concept did Simone de Beauvoir develop?", listOf("One is not born, but rather becomes, a woman", "Existence precedes essence", "Man is a wolf to man", "I think, therefore I am"), "Philosophy", "Simone de Beauvoir developed this concept in The Second Sex (1949) to assert that the female condition is a social and cultural construction, not a biological essence."),
            zh = LocalizedContent("西蒙娜·德·波伏娃提出了哪个概念？", listOf("女人不是天生的，而是后天形成的", "存在先于本质", "人对人是狼", "我思故我在"), "哲学", "西蒙娜·德·波伏娃在《第二性》（1949年）中提出了这一概念，主张女性状况是一种社会和文化建构，而非生物本质。"),
            es = LocalizedContent("¿Qué concepto desarrolló Simone de Beauvoir?", listOf("No se nace mujer, se llega a serlo", "La existencia precede a la esencia", "El hombre es un lobo para el hombre", "Pienso, luego existo"), "Filosofía", "Simone de Beauvoir desarrolló este concepto en El segundo sexo (1949) para afirmar que la condición femenina es una construcción social y cultural, no una esencia biológica.")
        ),
        BilingualQuestion(
            id = 20724, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le matérialisme dialectique ?", listOf("La philosophie de Marx basée sur les contradictions matérielles", "Une religion", "Une théorie physique", "Un mouvement artistique"), "Philosophie", "Le matérialisme dialectique, développé par Marx et Engels, combine la dialectique hégélienne (thèse, antithèse, synthèse) à une vision matérialiste de l'histoire, où les contradictions économiques et sociales sont le moteur du changement."),
            en = LocalizedContent("What is dialectical materialism?", listOf("Marx's philosophy based on material contradictions", "A religion", "A physical theory", "An artistic movement"), "Philosophy", "Dialectical materialism, developed by Marx and Engels, combines Hegelian dialectics (thesis, antithesis, synthesis) with a materialist view of history, where economic and social contradictions drive change."),
            zh = LocalizedContent("什么是辩证唯物主义？", listOf("马克思基于物质矛盾的哲学", "一种宗教", "一种物理理论", "一种艺术运动"), "哲学", "辩证唯物主义由马克思和恩格斯发展，将黑格尔辩证法（正题、反题、合题）与唯物主义历史观相结合，其中经济和社会矛盾是变革的动力。"),
            es = LocalizedContent("¿Qué es el materialismo dialéctico?", listOf("La filosofía de Marx basada en las contradicciones materiales", "Una religión", "Una teoría física", "Un movimiento artístico"), "Filosofía", "El materialismo dialéctico, desarrollado por Marx y Engels, combina la dialéctica hegeliana (tesis, antítesis, síntesis) con una visión materialista de la historia, donde las contradicciones económicas y sociales son el motor del cambio.")
        ),
        BilingualQuestion(
            id = 20725, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel philosophe a écrit 'Éthique à Nicomaque' ?", listOf("Aristote", "Platon", "Socrate", "Épicure"), "Philosophie", "Aristote a rédigé l'Éthique à Nicomaque, un ouvrage majeur de philosophie morale dédié à son fils Nicomaque, où il expose sa conception de la vertu et de la vie bonne."),
            en = LocalizedContent("Which philosopher wrote 'Nicomachean Ethics'?", listOf("Aristotle", "Plato", "Socrates", "Epicurus"), "Philosophy", "Aristotle wrote the Nicomachean Ethics, a major work of moral philosophy dedicated to his son Nicomachus, in which he expounds his conception of virtue and the good life."),
            zh = LocalizedContent("哪位哲学家写了《尼各马可伦理学》？", listOf("亚里士多德", "柏拉图", "苏格拉底", "伊壁鸠鲁"), "哲学", "亚里士多德撰写了《尼各马可伦理学》，这是一部重要的道德哲学著作，献给他的儿子尼各马可，其中阐述了他对美德和美好生活的看法。"),
            es = LocalizedContent("¿Qué filósofo escribió la 'Ética a Nicómaco'?", listOf("Aristóteles", "Platón", "Sócrates", "Epicuro"), "Filosofía", "Aristóteles redactó la Ética a Nicómaco, una obra mayor de filosofía moral dedicada a su hijo Nicómaco, donde expone su concepción de la virtud y la vida buena.")
        ),
        BilingualQuestion(
            id = 21002, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays a remporté le plus de Coupes du monde de football ?", listOf("Le Brésil", "L'Allemagne", "L'Italie", "L'Argentine"), "Sport", "Le Brésil détient le record avec cinq titres mondiaux (1958, 1962, 1970, 1994, 2002), ce qui en fait la nation la plus titrée de l'histoire de la Coupe du monde de football."),
            en = LocalizedContent("Which country has won the most FIFA World Cups?", listOf("Brazil", "Germany", "Italy", "Argentina"), "Sports", "Brazil holds the record with five world titles (1958, 1962, 1970, 1994, 2002), making it the most successful nation in World Cup history."),
            zh = LocalizedContent("哪个国家赢得了最多的世界杯足球赛冠军？", listOf("巴西", "德国", "意大利", "阿根廷"), "体育", "巴西以五次世界冠军（1958、1962、1970、1994、2002）保持纪录，成为世界杯历史上最成功的国家。"),
            es = LocalizedContent("¿Qué país ha ganado más Copas del Mundo de fútbol?", listOf("Brasil", "Alemania", "Italia", "Argentina"), "Deportes", "Brasil ostenta el récord con cinco títulos mundiales (1958, 1962, 1970, 1994, 2002), lo que lo convierte en la nación más laureada de la historia de la Copa del Mundo.")
        ),
        BilingualQuestion(
            id = 21004, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel nageur a remporté 23 médailles d'or olympiques ?", listOf("Michael Phelps", "Ian Thorpe", "Mark Spitz", "Ryan Lochte"), "Sport", "Michael Phelps détient le record du plus grand nombre de médailles d'or olympiques, avec 23 titres remportés entre 2004 et 2016, principalement en natation."),
            en = LocalizedContent("Which swimmer has won 23 Olympic gold medals?", listOf("Michael Phelps", "Ian Thorpe", "Mark Spitz", "Ryan Lochte"), "Sports", "Michael Phelps holds the record for the most Olympic gold medals, with 23 titles won between 2004 and 2016, primarily in swimming."),
            zh = LocalizedContent("哪位游泳运动员赢得了23枚奥运金牌？", listOf("迈克尔·菲尔普斯", "伊恩·索普", "马克·斯皮茨", "瑞安·洛赫特"), "体育", "迈克尔·菲尔普斯保持着奥运金牌最多的纪录，在2004年至2016年间赢得了23枚金牌，主要来自游泳项目。"),
            es = LocalizedContent("¿Qué nadador ha ganado 23 medallas de oro olímpicas?", listOf("Michael Phelps", "Ian Thorpe", "Mark Spitz", "Ryan Lochte"), "Deportes", "Michael Phelps ostenta el récord del mayor número de medallas de oro olímpicas, con 23 títulos ganados entre 2004 y 2016, principalmente en natación.")
        ),
        BilingualQuestion(
            id = 21005, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année les premiers Jeux Olympiques modernes ont-ils eu lieu ?", listOf("1896", "1900", "1888", "1912"), "Sport", "Les premiers Jeux Olympiques modernes ont été organisés à Athènes en 1896, sous l'impulsion de Pierre de Coubertin."),
            en = LocalizedContent("In which year did the first modern Olympic Games take place?", listOf("1896", "1900", "1888", "1912"), "Sports", "The first modern Olympic Games were held in Athens in 1896, initiated by Pierre de Coubertin."),
            zh = LocalizedContent("第一届现代奥运会在哪一年举行？", listOf("1896", "1900", "1888", "1912"), "体育", "第一届现代奥运会于1896年在雅典举行，由皮埃尔·德·顾拜旦发起。"),
            es = LocalizedContent("¿En qué año tuvieron lugar los primeros Juegos Olímpicos modernos?", listOf("1896", "1900", "1888", "1912"), "Deportes", "Los primeros Juegos Olímpicos modernos se celebraron en Atenas en 1896, por iniciativa de Pierre de Coubertin.")
        ),
        BilingualQuestion(
            id = 21006, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel sport se joue avec un volant ?", listOf("Le badminton", "Le tennis", "Le squash", "Le ping-pong"), "Sport", "Au badminton, le projectile utilisé est un volant, aussi appelé plume, qui est frappé avec une raquette par-dessus un filet."),
            en = LocalizedContent("Which sport is played with a shuttlecock?", listOf("Badminton", "Tennis", "Squash", "Table tennis"), "Sports", "In badminton, the projectile used is a shuttlecock, also called a birdie, which is hit with a racket over a net."),
            zh = LocalizedContent("哪种运动使用羽毛球？", listOf("羽毛球", "网球", "壁球", "乒乓球"), "体育", "在羽毛球运动中，使用的投射物是羽毛球，也称为毽子，用球拍击打过网。"),
            es = LocalizedContent("¿Qué deporte se juega con un volante?", listOf("Bádminton", "Tenis", "Squash", "Ping-pong"), "Deportes", "En el bádminton, el proyectil utilizado es un volante, también llamado pluma, que se golpea con una raqueta por encima de una red.")
        ),
        BilingualQuestion(
            id = 21007, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel footballeur est surnommé 'CR7' ?", listOf("Cristiano Ronaldo", "Carlos Roberto", "Christian Roldan", "César Ramos"), "Sport", "CR7 est le surnom de Cristiano Ronaldo, combinant ses initiales (CR) et son numéro de maillot fétiche (7), qu'il porte depuis son passage à Manchester United."),
            en = LocalizedContent("Which footballer is nicknamed 'CR7'?", listOf("Cristiano Ronaldo", "Carlos Roberto", "Christian Roldan", "César Ramos"), "Sports", "CR7 is the nickname of Cristiano Ronaldo, combining his initials (CR) and his favorite jersey number (7), which he has worn since his time at Manchester United."),
            zh = LocalizedContent("哪位足球运动员的绰号是'CR7'？", listOf("克里斯蒂亚诺·罗纳尔多", "卡洛斯·罗伯托", "克里斯蒂安·罗尔丹", "塞萨尔·拉莫斯"), "体育", "CR7是克里斯蒂亚诺·罗纳尔多的绰号，结合了他的姓名首字母（CR）和他钟爱的球衣号码（7），自他在曼联时期起就一直穿着。"),
            es = LocalizedContent("¿Qué futbolista es apodado 'CR7'?", listOf("Cristiano Ronaldo", "Carlos Roberto", "Christian Roldan", "César Ramos"), "Deportes", "CR7 es el apodo de Cristiano Ronaldo, combinando sus iniciales (CR) y su número de camiseta favorito (7), que ha llevado desde su paso por el Manchester United.")
        ),
        BilingualQuestion(
            id = 21008, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de sets faut-il gagner pour remporter un match de tennis masculin en Grand Chelem ?", listOf("3", "2", "5", "4"), "Sport", "Dans les tournois du Grand Chelem, les matchs masculins se jouent au meilleur des cinq sets, il faut donc en gagner trois pour l'emporter."),
            en = LocalizedContent("How many sets must be won to win a men's tennis match in a Grand Slam?", listOf("3", "2", "5", "4"), "Sports", "In Grand Slam tournaments, men's matches are played as best of five sets, so three sets must be won to win the match."),
            zh = LocalizedContent("在大满贯男子网球比赛中，需要赢多少盘才能获胜？", listOf("3", "2", "5", "4"), "体育", "在大满贯赛事中，男子比赛采用五盘三胜制，因此需要赢三盘才能获胜。"),
            es = LocalizedContent("¿Cuántos sets hay que ganar para ganar un partido de tenis masculino en un Grand Slam?", listOf("3", "2", "5", "4"), "Deportes", "En los torneos de Grand Slam, los partidos masculinos se juegan al mejor de cinco sets, por lo que hay que ganar tres para llevarse el partido.")
        ),
        BilingualQuestion(
            id = 21010, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le record du monde du 100m hommes (2024) ?", listOf("9,58 s (Usain Bolt)", "9,69 s", "9,72 s", "9,84 s"), "Sport", "Usain Bolt a établi ce record du monde du 100 mètres en 9,58 secondes lors des championnats du monde d'athlétisme de Berlin en 2009. Aucun athlète ne l'a battu depuis."),
            en = LocalizedContent("What is the men's 100m world record (2024)?", listOf("9.58 s (Usain Bolt)", "9.69 s", "9.72 s", "9.84 s"), "Sports", "Usain Bolt set this 100-meter world record of 9.58 seconds at the 2009 World Athletics Championships in Berlin. No athlete has beaten it since."),
            zh = LocalizedContent("男子100米世界纪录是多少（2024年）？", listOf("9.58秒（尤塞恩·博尔特）", "9.69秒", "9.72秒", "9.84秒"), "体育", "尤塞恩·博尔特在2009年柏林世界田径锦标赛上创造了9.58秒的100米世界纪录。此后无人打破。"),
            es = LocalizedContent("¿Cuál es el récord mundial de 100 m masculino (2024)?", listOf("9,58 s (Usain Bolt)", "9,69 s", "9,72 s", "9,84 s"), "Deportes", "Usain Bolt estableció este récord mundial de 100 metros en 9,58 segundos en los Campeonatos Mundiales de Atletismo de Berlín en 2009. Ningún atleta lo ha superado desde entonces.")
        ),
        BilingualQuestion(
            id = 21011, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel sport est surnommé 'le sport roi' ?", listOf("Le football", "Le basketball", "Le tennis", "L'athlétisme"), "Sport", "Le football est surnommé le sport roi en raison de sa popularité mondiale et du nombre élevé de pratiquants et de spectateurs, bien que d'autres sports comme le cyclisme aient aussi des surnoms prestigieux."),
            en = LocalizedContent("Which sport is nicknamed 'the king of sports'?", listOf("Football", "Basketball", "Tennis", "Athletics"), "Sports", "Football is nicknamed the king of sports due to its global popularity and high number of players and spectators, although other sports like cycling also have prestigious nicknames."),
            zh = LocalizedContent("哪项运动被称为“运动之王”？", listOf("足球", "篮球", "网球", "田径"), "体育", "足球因其全球普及度和庞大的参与及观赛人数而被称为运动之王，尽管其他运动如自行车也有尊称。"),
            es = LocalizedContent("¿Qué deporte es apodado 'el rey de los deportes'?", listOf("El fútbol", "El baloncesto", "El tenis", "El atletismo"), "Deportes", "El fútbol es apodado el rey de los deportes debido a su popularidad mundial y al alto número de practicantes y espectadores, aunque otros deportes como el ciclismo también tienen apodos prestigiosos.")
        ),
        BilingualQuestion(
            id = 21012, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de trous comporte un parcours de golf standard ?", listOf("18", "9", "12", "21"), "Sport", "Un parcours de golf standard est composé de 18 trous, une norme établie par le Royal and Ancient Golf Club de St Andrews en 1764."),
            en = LocalizedContent("How many holes does a standard golf course have?", listOf("18", "9", "12", "21"), "Sports", "A standard golf course consists of 18 holes, a norm established by the Royal and Ancient Golf Club of St Andrews in 1764."),
            zh = LocalizedContent("标准高尔夫球场有多少个洞？", listOf("18", "9", "12", "21"), "体育", "标准高尔夫球场由18个洞组成，这一规范由圣安德鲁斯皇家古老高尔夫俱乐部于1764年确立。"),
            es = LocalizedContent("¿Cuántos hoyos tiene un campo de golf estándar?", listOf("18", "9", "12", "21"), "Deportes", "Un campo de golf estándar consta de 18 hoyos, una norma establecida por el Real y Antiguo Club de Golf de St Andrews en 1764.")
        ),
        BilingualQuestion(
            id = 21013, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel cycliste a remporté 5 Tours de France consécutifs ?", listOf("Miguel Indurain", "Eddy Merckx", "Lance Armstrong", "Bernard Hinault"), "Sport", "Miguel Indurain a dominé le Tour de France de 1991 à 1995, devenant le premier coureur à remporter cinq éditions consécutives."),
            en = LocalizedContent("Which cyclist won 5 consecutive Tour de France titles?", listOf("Miguel Indurain", "Eddy Merckx", "Lance Armstrong", "Bernard Hinault"), "Sports", "Miguel Indurain dominated the Tour de France from 1991 to 1995, becoming the first rider to win five consecutive editions."),
            zh = LocalizedContent("哪位自行车手连续五次赢得环法自行车赛？", listOf("米格尔·安杜兰", "埃迪·莫克斯", "兰斯·阿姆斯特朗", "贝尔纳·伊诺"), "体育", "米格尔·安杜兰从1991年到1995年统治了环法自行车赛，成为首位连续五次夺冠的车手。"),
            es = LocalizedContent("¿Qué ciclista ganó 5 Tour de Francia consecutivos?", listOf("Miguel Indurain", "Eddy Merckx", "Lance Armstrong", "Bernard Hinault"), "Deportes", "Miguel Indurain dominó el Tour de Francia de 1991 a 1995, convirtiéndose en el primer corredor en ganar cinco ediciones consecutivas.")
        ),
        BilingualQuestion(
            id = 21014, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel sport utilise-t-on un fleuret ?", listOf("L'escrime", "Le kendo", "Le cricket", "Le hockey"), "Sport", "Le fleuret est l'une des trois armes utilisées en escrime, avec l'épée et le sabre, et se distingue par sa lame fine et flexible."),
            en = LocalizedContent("In which sport is a foil used?", listOf("Fencing", "Kendo", "Cricket", "Hockey"), "Sports", "The foil is one of the three weapons used in fencing, along with the épée and sabre, and is distinguished by its thin, flexible blade."),
            zh = LocalizedContent("哪项运动使用花剑？", listOf("击剑", "剑道", "板球", "曲棍球"), "体育", "花剑是击剑中使用的三种武器之一，与重剑和佩剑并列，其特点是剑身细而柔韧。"),
            es = LocalizedContent("¿En qué deporte se utiliza un florete?", listOf("La esgrima", "El kendo", "El críquet", "El hockey"), "Deportes", "El florete es una de las tres armas utilizadas en esgrima, junto con la espada y el sable, y se distingue por su hoja fina y flexible.")
        ),
        BilingualQuestion(
            id = 21015, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays organise la Liga (football) ?", listOf("L'Espagne", "L'Italie", "Le Portugal", "La France"), "Sport", "La Liga est le championnat de football professionnel de première division en Espagne, géré par la Ligue de football professionnel espagnole."),
            en = LocalizedContent("Which country organizes La Liga (football)?", listOf("Spain", "Italy", "Portugal", "France"), "Sports", "La Liga is the top professional football division in Spain, managed by the Spanish Professional Football League."),
            zh = LocalizedContent("哪个国家组织西甲联赛（足球）？", listOf("西班牙", "意大利", "葡萄牙", "法国"), "体育", "西甲是西班牙顶级职业足球联赛，由西班牙职业足球联盟管理。"),
            es = LocalizedContent("¿Qué país organiza La Liga (fútbol)?", listOf("España", "Italia", "Portugal", "Francia"), "Deportes", "La Liga es la máxima categoría del fútbol profesional en España, gestionada por la Liga de Fútbol Profesional española.")
        ),
        BilingualQuestion(
            id = 21016, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien pèse un ballon de basket réglementaire (hommes) ?", listOf("600-650 g", "400-450 g", "700-750 g", "500-550 g"), "Sport", "Le poids réglementaire d'un ballon de basket masculin est fixé entre 600 et 650 grammes par la FIBA et la NBA, avec une circonférence de 75 à 78 cm."),
            en = LocalizedContent("How much does a regulation men's basketball weigh?", listOf("600-650 g", "400-450 g", "700-750 g", "500-550 g"), "Sports", "The regulation weight of a men's basketball is set between 600 and 650 grams by FIBA and the NBA, with a circumference of 75 to 78 cm."),
            zh = LocalizedContent("标准男子篮球重多少？", listOf("600-650克", "400-450克", "700-750克", "500-550克"), "体育", "国际篮联和NBA规定男子篮球的标准重量为600至650克，周长为75至78厘米。"),
            es = LocalizedContent("¿Cuánto pesa un balón de baloncesto reglamentario (hombres)?", listOf("600-650 g", "400-450 g", "700-750 g", "500-550 g"), "Deportes", "El peso reglamentario de un balón de baloncesto masculino está fijado entre 600 y 650 gramos por la FIBA y la NBA, con una circunferencia de 75 a 78 cm.")
        ),
        BilingualQuestion(
            id = 21017, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel sport d'hiver combine ski de fond et tir à la carabine ?", listOf("Le biathlon", "Le combiné nordique", "Le ski joëring", "Le pentathlon moderne"), "Sport", "Le biathlon est un sport d'hiver qui mélange endurance et précision : les athlètes enchaînent des tours de ski de fond et s'arrêtent pour tirer à la carabine sur des cibles."),
            en = LocalizedContent("Which winter sport combines cross-country skiing and rifle shooting?", listOf("Biathlon", "Nordic combined", "Skijoring", "Modern pentathlon"), "Sports", "Biathlon is a winter sport that mixes endurance and precision: athletes alternate laps of cross-country skiing with stops to shoot a rifle at targets."),
            zh = LocalizedContent("哪项冬季运动结合了越野滑雪和步枪射击？", listOf("冬季两项", "北欧两项", "滑雪牵引", "现代五项"), "体育", "冬季两项是一项结合耐力与精准度的冬季运动：运动员交替进行越野滑雪和步枪射击。"),
            es = LocalizedContent("¿Qué deporte de invierno combina esquí de fondo y tiro con rifle?", listOf("El biatlón", "La combinada nórdica", "El skijoring", "El pentatlón moderno"), "Deportes", "El biatlón es un deporte de invierno que mezcla resistencia y precisión: los atletas alternan vueltas de esquí de fondo con paradas para disparar con rifle a blancos.")
        ),
        BilingualQuestion(
            id = 21018, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel joueur de basket est surnommé 'King James' ?", listOf("LeBron James", "Michael Jordan", "Kobe Bryant", "Stephen Curry"), "Sport", "LeBron James est surnommé 'King James' en raison de son statut de superstar de la NBA, un titre qui évoque à la fois son nom de famille et sa domination sur le terrain."),
            en = LocalizedContent("Which basketball player is nicknamed 'King James'?", listOf("LeBron James", "Michael Jordan", "Kobe Bryant", "Stephen Curry"), "Sports", "LeBron James is nicknamed 'King James' due to his superstar status in the NBA, a title that evokes both his last name and his dominance on the court."),
            zh = LocalizedContent("哪位篮球运动员被称为“小皇帝”？", listOf("勒布朗·詹姆斯", "迈克尔·乔丹", "科比·布莱恩特", "斯蒂芬·库里"), "体育", "勒布朗·詹姆斯因其在NBA的超级巨星地位而被称为“小皇帝”，这个绰号既呼应了他的姓氏，也体现了他在场上的统治力。"),
            es = LocalizedContent("¿Qué jugador de baloncesto es apodado 'King James'?", listOf("LeBron James", "Michael Jordan", "Kobe Bryant", "Stephen Curry"), "Deportes", "LeBron James es apodado 'King James' debido a su estatus de superestrella en la NBA, un título que evoca tanto su apellido como su dominio en la cancha.")
        ),
        BilingualQuestion(
            id = 21019, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel sport pratique-t-on un 'smash' ?", listOf("Le volleyball et le badminton", "Le football", "Le rugby", "L'athlétisme"), "Sport", "Le smash est un geste technique commun au volleyball et au badminton, où le joueur frappe violemment le ballon ou le volant vers le sol adverse pour marquer un point."),
            en = LocalizedContent("In which sport is a 'smash' performed?", listOf("Volleyball and badminton", "Football", "Rugby", "Athletics"), "Sports", "The smash is a technical move common to volleyball and badminton, where the player forcefully hits the ball or shuttlecock towards the opponent's floor to score a point."),
            zh = LocalizedContent("哪项运动中有“扣杀”？", listOf("排球和羽毛球", "足球", "橄榄球", "田径"), "体育", "扣杀是排球和羽毛球中常见的技术动作，球员用力将球或羽毛球击向对方场地以得分。"),
            es = LocalizedContent("¿En qué deporte se realiza un 'smash'?", listOf("El voleibol y el bádminton", "El fútbol", "El rugby", "El atletismo"), "Deportes", "El smash es un gesto técnico común al voleibol y al bádminton, donde el jugador golpea violentamente el balón o el volante hacia el suelo contrario para anotar un punto.")
        ),
    )

    private fun part7(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 21020, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays a remporté la Coupe du monde de football 2022 ?", listOf("L'Argentine", "La France", "Le Brésil", "La Croatie"), "Sport", "L'Argentine a battu la France en finale (3-3, 4-2 aux tirs au but) le 18 décembre 2022 au Qatar, offrant à Lionel Messi son premier titre mondial."),
            en = LocalizedContent("Which country won the 2022 FIFA World Cup?", listOf("Argentina", "France", "Brazil", "Croatia"), "Sports", "Argentina defeated France in the final (3-3, 4-2 on penalties) on December 18, 2022 in Qatar, giving Lionel Messi his first world title."),
            zh = LocalizedContent("哪个国家赢得了2022年世界杯足球赛？", listOf("阿根廷", "法国", "巴西", "克罗地亚"), "体育", "阿根廷在2022年12月18日于卡塔尔举行的决赛中击败法国（3-3，点球4-2），为莱昂内尔·梅西赢得了他的第一个世界冠军。"),
            es = LocalizedContent("¿Qué país ganó la Copa Mundial de Fútbol de 2022?", listOf("Argentina", "Francia", "Brasil", "Croacia"), "Deportes", "Argentina derrotó a Francia en la final (3-3, 4-2 en penales) el 18 de diciembre de 2022 en Catar, otorgando a Lionel Messi su primer título mundial.")
        ),
        BilingualQuestion(
            id = 21021, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel art martial japonais utilise des prises et projections ?", listOf("Le judo", "Le karaté", "L'aïkido", "Le sumo"), "Sport", "Le judo a été créé par Jigoro Kano en 1882 et se distingue par l'utilisation de techniques de projection et de contrôle au sol, sans coups ni armes."),
            en = LocalizedContent("Which Japanese martial art uses throws and pins?", listOf("Judo", "Karate", "Aikido", "Sumo"), "Sports", "Judo was created by Jigoro Kano in 1882 and is distinguished by the use of throwing and ground control techniques, without strikes or weapons."),
            zh = LocalizedContent("哪种日本武术使用投技和压制技？", listOf("柔道", "空手道", "合气道", "相扑"), "体育", "柔道由嘉纳治五郎于1882年创立，以使用投技和地面控制技术为特色，不使用打击或武器。"),
            es = LocalizedContent("¿Qué arte marcial japonés utiliza lanzamientos y sumisiones?", listOf("Judo", "Kárate", "Aikido", "Sumo"), "Deportes", "El judo fue creado por Jigoro Kano en 1882 y se distingue por el uso de técnicas de proyección y control en el suelo, sin golpes ni armas.")
        ),
        BilingualQuestion(
            id = 21022, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de points vaut un touchdown au football américain ?", listOf("6", "7", "3", "4"), "Sport", "Au football américain, un touchdown est marqué lorsqu'un joueur porte le ballon dans la zone d'en-but adverse ou y attrape une passe, ce qui rapporte 6 points."),
            en = LocalizedContent("How many points is a touchdown worth in American football?", listOf("6", "7", "3", "4"), "Sports", "In American football, a touchdown is scored when a player carries the ball into the opponent's end zone or catches a pass there, earning 6 points."),
            zh = LocalizedContent("在美式橄榄球中，一次达阵得多少分？", listOf("6", "7", "3", "4"), "体育", "在美式橄榄球中，当球员将球带入对方端区或在端区内接住传球时即达阵，得6分。"),
            es = LocalizedContent("¿Cuántos puntos vale un touchdown en el fútbol americano?", listOf("6", "7", "3", "4"), "Deportes", "En el fútbol americano, un touchdown se anota cuando un jugador lleva el balón a la zona de anotación contraria o atrapa un pase allí, lo que otorga 6 puntos.")
        ),
        BilingualQuestion(
            id = 21023, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le Grand Chelem de tennis en terre battue ?", listOf("Roland-Garros", "Wimbledon", "L'US Open", "L'Open d'Australie"), "Sport", "Roland-Garros, aussi appelé Internationaux de France, est le tournoi du Grand Chelem disputé sur terre battue. Il se tient chaque année à Paris."),
            en = LocalizedContent("Which tennis Grand Slam is played on clay?", listOf("Roland Garros", "Wimbledon", "US Open", "Australian Open"), "Sports", "Roland Garros, also known as the French Open, is the Grand Slam tournament played on clay. It is held annually in Paris."),
            zh = LocalizedContent("哪个网球大满贯赛事在红土上进行？", listOf("法国网球公开赛", "温布尔登网球锦标赛", "美国网球公开赛", "澳大利亚网球公开赛"), "体育", "法国网球公开赛，又称罗兰·加洛斯，是在红土上进行的大满贯赛事，每年在巴黎举行。"),
            es = LocalizedContent("¿Qué Grand Slam de tenis se juega en tierra batida?", listOf("Roland Garros", "Wimbledon", "Abierto de Estados Unidos", "Abierto de Australia"), "Deportes", "Roland Garros, también conocido como el Abierto de Francia, es el torneo del Grand Slam que se disputa en tierra batida. Se celebra anualmente en París.")
        ),
        BilingualQuestion(
            id = 21024, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel boxeur est surnommé 'The Greatest' ?", listOf("Mohamed Ali", "Mike Tyson", "Floyd Mayweather", "Manny Pacquiao"), "Sport", "Mohamed Ali s'est lui-même attribué ce surnom après sa victoire contre Sonny Liston en 1964, et il est devenu indissociable de son héritage de champion charismatique et engagé."),
            en = LocalizedContent("Which boxer is nicknamed 'The Greatest'?", listOf("Muhammad Ali", "Mike Tyson", "Floyd Mayweather", "Manny Pacquiao"), "Sports", "Muhammad Ali gave himself this nickname after his victory over Sonny Liston in 1964, and it became inseparable from his legacy as a charismatic and committed champion."),
            zh = LocalizedContent("哪位拳击手绰号'最伟大的人'？", listOf("穆罕默德·阿里", "迈克·泰森", "弗洛伊德·梅威瑟", "曼尼·帕奎奥"), "体育", "穆罕默德·阿里在1964年击败索尼·利斯顿后自称这个绰号，它成为他作为富有魅力和坚定信念的冠军的遗产中不可分割的一部分。"),
            es = LocalizedContent("¿Qué boxeador es apodado 'El Más Grande'?", listOf("Muhammad Ali", "Mike Tyson", "Floyd Mayweather", "Manny Pacquiao"), "Deportes", "Muhammad Ali se autodenominó así tras su victoria sobre Sonny Liston en 1964, y se volvió inseparable de su legado como campeón carismático y comprometido.")
        ),
        BilingualQuestion(
            id = 21025, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel sport utilise-t-on un 'puck' ?", listOf("Le hockey sur glace", "Le hockey sur gazon", "Le curling", "Le lacrosse"), "Sport", "Le puck est un disque de caoutchouc vulcanisé utilisé au hockey sur glace, où les joueurs le frappent avec leurs crosses pour marquer des buts."),
            en = LocalizedContent("In which sport is a 'puck' used?", listOf("Ice hockey", "Field hockey", "Curling", "Lacrosse"), "Sports", "The puck is a vulcanized rubber disc used in ice hockey, where players hit it with their sticks to score goals."),
            zh = LocalizedContent("哪种运动使用'冰球'？", listOf("冰球", "曲棍球", "冰壶", "长曲棍球"), "体育", "冰球是一种硫化橡胶圆盘，用于冰球运动，球员用球杆击打它来得分。"),
            es = LocalizedContent("¿En qué deporte se utiliza un 'puck'?", listOf("Hockey sobre hielo", "Hockey sobre césped", "Curling", "Lacrosse"), "Deportes", "El puck es un disco de caucho vulcanizado utilizado en el hockey sobre hielo, donde los jugadores lo golpean con sus palos para marcar goles.")
        ),
        BilingualQuestion(
            id = 21026, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pilote de F1 détient le record de victoires en Grand Prix ?", listOf("Lewis Hamilton", "Michael Schumacher", "Ayrton Senna", "Sebastian Vettel"), "Sport", "Lewis Hamilton détient le record absolu de victoires en Formule 1 avec 103 succès, dépassant le précédent record de Michael Schumacher (91 victoires)."),
            en = LocalizedContent("Which F1 driver holds the record for most Grand Prix wins?", listOf("Lewis Hamilton", "Michael Schumacher", "Ayrton Senna", "Sebastian Vettel"), "Sports", "Lewis Hamilton holds the absolute record for wins in Formula 1 with 103 victories, surpassing the previous record of Michael Schumacher (91 wins)."),
            zh = LocalizedContent("哪位F1车手保持着大奖赛获胜次数最多的纪录？", listOf("刘易斯·汉密尔顿", "迈克尔·舒马赫", "艾尔顿·塞纳", "塞巴斯蒂安·维特尔"), "体育", "刘易斯·汉密尔顿以103场胜利保持着F1获胜次数的绝对纪录，超过了迈克尔·舒马赫之前的纪录（91胜）。"),
            es = LocalizedContent("¿Qué piloto de F1 tiene el récord de más victorias en Grandes Premios?", listOf("Lewis Hamilton", "Michael Schumacher", "Ayrton Senna", "Sebastian Vettel"), "Deportes", "Lewis Hamilton tiene el récord absoluto de victorias en Fórmula 1 con 103 triunfos, superando el récord anterior de Michael Schumacher (91 victorias).")
        ),
        BilingualQuestion(
            id = 21027, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel sport est pratiqué dans le Tour de France ?", listOf("Le cyclisme sur route", "La course à pied", "La natation", "Le triathlon"), "Sport", "Le Tour de France est une compétition cycliste par étapes créée en 1903, où les participants parcourent environ 3 500 kilomètres sur routes."),
            en = LocalizedContent("Which sport is practiced in the Tour de France?", listOf("Road cycling", "Running", "Swimming", "Triathlon"), "Sports", "The Tour de France is a stage cycling race created in 1903, where participants cover approximately 3,500 kilometers on roads."),
            zh = LocalizedContent("环法自行车赛进行的是哪项运动？", listOf("公路自行车", "跑步", "游泳", "铁人三项"), "体育", "环法自行车赛是一项创立于1903年的分段自行车赛，参赛者需在公路上骑行约3500公里。"),
            es = LocalizedContent("¿Qué deporte se practica en el Tour de Francia?", listOf("Ciclismo en ruta", "Carrera a pie", "Natación", "Triatlón"), "Deportes", "El Tour de Francia es una competición ciclista por etapas creada en 1903, donde los participantes recorren aproximadamente 3.500 kilómetros en carretera.")
        ),
        BilingualQuestion(
            id = 21028, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien dure un match de football en temps réglementaire ?", listOf("90 minutes", "80 minutes", "120 minutes", "60 minutes"), "Sport", "Un match de football se compose de deux mi-temps de 45 minutes chacune, soit 90 minutes au total. C'est la durée standard fixée par les règles du jeu."),
            en = LocalizedContent("How long does a football match last in regular time?", listOf("90 minutes", "80 minutes", "120 minutes", "60 minutes"), "Sports", "A football match consists of two halves of 45 minutes each, totaling 90 minutes. This is the standard duration set by the rules of the game."),
            zh = LocalizedContent("一场足球比赛的常规时间有多长？", listOf("90分钟", "80分钟", "120分钟", "60分钟"), "体育", "一场足球比赛由两个45分钟的半场组成，共90分钟。这是比赛规则规定的标准时长。"),
            es = LocalizedContent("¿Cuánto dura un partido de fútbol en tiempo reglamentario?", listOf("90 minutos", "80 minutos", "120 minutos", "60 minutos"), "Deportes", "Un partido de fútbol consta de dos tiempos de 45 minutos cada uno, totalizando 90 minutos. Es la duración estándar establecida por las reglas del juego.")
        ),
        BilingualQuestion(
            id = 21029, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays domine traditionnellement le sumo ?", listOf("Le Japon", "La Chine", "La Corée du Sud", "La Mongolie"), "Sport", "Le sumo est un sport de lutte rituel originaire du Japon, où il est considéré comme un art martial national et une tradition ancestrale."),
            en = LocalizedContent("Which country traditionally dominates sumo?", listOf("Japan", "China", "South Korea", "Mongolia"), "Sports", "Sumo is a ritual wrestling sport originating from Japan, where it is considered a national martial art and an ancestral tradition."),
            zh = LocalizedContent("哪个国家传统上主导相扑运动？", listOf("日本", "中国", "韩国", "蒙古"), "体育", "相扑是一种起源于日本的仪式性摔跤运动，被视为国技和古老传统。"),
            es = LocalizedContent("¿Qué país domina tradicionalmente el sumo?", listOf("Japón", "China", "Corea del Sur", "Mongolia"), "Deportes", "El sumo es un deporte de lucha ritual originario de Japón, donde se considera un arte marcial nacional y una tradición ancestral.")
        ),
        BilingualQuestion(
            id = 21030, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle épreuve d'athlétisme combine 10 disciplines ?", listOf("Le décathlon", "L'heptathlon", "Le pentathlon", "Le triathlon"), "Sport", "Le décathlon est une épreuve masculine combinant dix disciplines d'athlétisme réparties sur deux jours, incluant courses, sauts et lancers."),
            en = LocalizedContent("Which athletics event combines 10 disciplines?", listOf("Decathlon", "Heptathlon", "Pentathlon", "Triathlon"), "Sports", "The decathlon is a men's event combining ten athletics disciplines spread over two days, including running, jumping, and throwing."),
            zh = LocalizedContent("哪项田径运动包含10个项目？", listOf("十项全能", "七项全能", "五项全能", "三项全能"), "体育", "十项全能是一项男子项目，包含十个田径项目，分两天进行，包括跑步、跳跃和投掷。"),
            es = LocalizedContent("¿Qué prueba de atletismo combina 10 disciplinas?", listOf("Decatlón", "Heptatlón", "Pentatlón", "Triatlón"), "Deportes", "El decatlón es una prueba masculina que combina diez disciplinas de atletismo repartidas en dos días, incluyendo carreras, saltos y lanzamientos.")
        ),
        BilingualQuestion(
            id = 21101, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film a remporté le plus d'Oscars dans l'histoire ?", listOf("Ben-Hur, Titanic et Le Seigneur des anneaux (11)", "Titanic (12)", "La La Land (10)", "Forrest Gump (9)"), "Cinéma", "Ben-Hur (1959), Titanic (1997) et Le Seigneur des anneaux : Le Retour du roi (2003) détiennent le record avec 11 Oscars chacun, un exploit inégalé depuis."),
            en = LocalizedContent("Which film has won the most Oscars in history?", listOf("Ben-Hur, Titanic and The Lord of the Rings (11)", "Titanic (12)", "La La Land (10)", "Forrest Gump (9)"), "Cinema", "Ben-Hur (1959), Titanic (1997) and The Lord of the Rings: The Return of the King (2003) each hold the record with 11 Oscars, an unmatched feat."),
            zh = LocalizedContent("历史上哪部电影获得奥斯卡奖最多？", listOf("《宾虚》、《泰坦尼克号》和《指环王》（11项）", "《泰坦尼克号》（12项）", "《爱乐之城》（10项）", "《阿甘正传》（9项）"), "电影", "《宾虚》（1959）、《泰坦尼克号》（1997）和《指环王：王者归来》（2003）各获得11项奥斯卡奖，并列历史最高纪录。"),
            es = LocalizedContent("¿Qué película ha ganado más Óscars en la historia?", listOf("Ben-Hur, Titanic y El Señor de los Anillos (11)", "Titanic (12)", "La La Land (10)", "Forrest Gump (9)"), "Cine", "Ben-Hur (1959), Titanic (1997) y El Señor de los Anillos: El Retorno del Rey (2003) ostentan el récord con 11 Óscars cada una, una hazaña inigualada.")
        ),
        BilingualQuestion(
            id = 21102, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a réalisé 'Inception' ?", listOf("Christopher Nolan", "Steven Spielberg", "Ridley Scott", "James Cameron"), "Cinéma", "Christopher Nolan a écrit et réalisé ce film de science-fiction sorti en 2010, explorant les rêves et la manipulation de l'esprit."),
            en = LocalizedContent("Who directed 'Inception'?", listOf("Christopher Nolan", "Steven Spielberg", "Ridley Scott", "James Cameron"), "Cinema", "Christopher Nolan wrote and directed this 2010 science fiction film exploring dreams and mind manipulation."),
            zh = LocalizedContent("谁执导了《盗梦空间》？", listOf("克里斯托弗·诺兰", "史蒂文·斯皮尔伯格", "雷德利·斯科特", "詹姆斯·卡梅隆"), "电影", "克里斯托弗·诺兰编剧并执导了这部2010年的科幻电影，探索梦境和思维操控。"),
            es = LocalizedContent("¿Quién dirigió 'Origen'?", listOf("Christopher Nolan", "Steven Spielberg", "Ridley Scott", "James Cameron"), "Cine", "Christopher Nolan escribió y dirigió esta película de ciencia ficción de 2010 que explora los sueños y la manipulación mental.")
        ),
        BilingualQuestion(
            id = 21103, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur incarne Jack Sparrow ?", listOf("Johnny Depp", "Orlando Bloom", "Brad Pitt", "Robert Downey Jr."), "Cinéma", "Johnny Depp a interprété le capitaine Jack Sparrow dans la saga Pirates des Caraïbes, un rôle emblématique qui lui a valu une nomination aux Oscars."),
            en = LocalizedContent("Which actor plays Jack Sparrow?", listOf("Johnny Depp", "Orlando Bloom", "Brad Pitt", "Robert Downey Jr."), "Cinema", "Johnny Depp portrayed Captain Jack Sparrow in the Pirates of the Caribbean saga, an iconic role that earned him an Oscar nomination."),
            zh = LocalizedContent("哪位演员饰演杰克·斯派罗？", listOf("约翰尼·德普", "奥兰多·布鲁姆", "布拉德·皮特", "小罗伯特·唐尼"), "电影", "约翰尼·德普在《加勒比海盗》系列中饰演杰克·斯派罗船长，这一标志性角色为他赢得了奥斯卡提名。"),
            es = LocalizedContent("¿Qué actor interpreta a Jack Sparrow?", listOf("Johnny Depp", "Orlando Bloom", "Brad Pitt", "Robert Downey Jr."), "Cine", "Johnny Depp interpretó al capitán Jack Sparrow en la saga Piratas del Caribe, un papel icónico que le valió una nominación al Óscar.")
        ),
        BilingualQuestion(
            id = 21104, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film d'animation Pixar met en scène un poisson-clown ?", listOf("Le Monde de Nemo", "Ratatouille", "Cars", "Les Indestructibles"), "Cinéma", "Le Monde de Nemo, sorti en 2003, raconte l'histoire de Marin, un poisson-clown, qui traverse l'océan pour retrouver son fils Nemo, capturé par un plongeur."),
            en = LocalizedContent("Which Pixar animated film features a clownfish?", listOf("Finding Nemo", "Ratatouille", "Cars", "The Incredibles"), "Cinema", "Finding Nemo, released in 2003, tells the story of Marlin, a clownfish, who crosses the ocean to find his son Nemo, captured by a diver."),
            zh = LocalizedContent("哪部皮克斯动画电影以小丑鱼为主角？", listOf("《海底总动员》", "《料理鼠王》", "《赛车总动员》", "《超人总动员》"), "电影", "2003年上映的《海底总动员》讲述了小丑鱼马林穿越海洋寻找被潜水员抓走的儿子尼莫的故事。"),
            es = LocalizedContent("¿Qué película de animación de Pixar presenta un pez payaso?", listOf("Buscando a Nemo", "Ratatouille", "Cars", "Los Increíbles"), "Cine", "Buscando a Nemo, estrenada en 2003, cuenta la historia de Marlin, un pez payaso, que cruza el océano para encontrar a su hijo Nemo, capturado por un buceador.")
        ),
        BilingualQuestion(
            id = 21105, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réalisateur français a tourné 'Le Fabuleux Destin d'Amélie Poulain' ?", listOf("Jean-Pierre Jeunet", "Luc Besson", "François Truffaut", "Jean-Luc Godard"), "Cinéma", "Jean-Pierre Jeunet a réalisé ce film sorti en 2001, qui a connu un succès international et a remporté plusieurs César."),
            en = LocalizedContent("Which French director made 'Amélie'?", listOf("Jean-Pierre Jeunet", "Luc Besson", "François Truffaut", "Jean-Luc Godard"), "Cinema", "Jean-Pierre Jeunet directed this 2001 film, which achieved international success and won several César Awards."),
            zh = LocalizedContent("哪位法国导演执导了《天使爱美丽》？", listOf("让-皮埃尔·热内", "吕克·贝松", "弗朗索瓦·特吕弗", "让-吕克·戈达尔"), "电影", "让-皮埃尔·热内执导了这部2001年的电影，该片获得了国际成功并赢得了多项凯撒奖。"),
            es = LocalizedContent("¿Qué director francés realizó 'Amélie'?", listOf("Jean-Pierre Jeunet", "Luc Besson", "François Truffaut", "Jean-Luc Godard"), "Cine", "Jean-Pierre Jeunet dirigió esta película de 2001, que logró éxito internacional y ganó varios premios César.")
        ),
        BilingualQuestion(
            id = 21106, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année est sorti le premier 'Star Wars' ?", listOf("1977", "1980", "1975", "1983"), "Cinéma", "Le premier film de la saga Star Wars, intitulé \"Un nouvel espoir\", est sorti en 1977, marquant le début de l'une des franchises les plus emblématiques du cinéma."),
            en = LocalizedContent("In which year was the first 'Star Wars' released?", listOf("1977", "1980", "1975", "1983"), "Cinema", "The first Star Wars film, titled 'A New Hope', was released in 1977, marking the beginning of one of the most iconic franchises in cinema."),
            zh = LocalizedContent("第一部《星球大战》在哪一年上映？", listOf("1977年", "1980年", "1975年", "1983年"), "电影", "第一部《星球大战》电影《新希望》于1977年上映，标志着电影史上最具标志性系列之一的开始。"),
            es = LocalizedContent("¿En qué año se estrenó la primera 'Star Wars'?", listOf("1977", "1980", "1975", "1983"), "Cine", "La primera película de Star Wars, titulada 'Una nueva esperanza', se estrenó en 1977, marcando el inicio de una de las franquicias más emblemáticas del cine.")
        ),
        BilingualQuestion(
            id = 21107, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur a joué dans 'Fight Club' et 'Seven' ?", listOf("Brad Pitt", "Edward Norton", "George Clooney", "Matt Damon"), "Cinéma", "Brad Pitt a joué dans Fight Club (1999) et Seven (1995), deux films cultes réalisés par David Fincher."),
            en = LocalizedContent("Which actor starred in 'Fight Club' and 'Seven'?", listOf("Brad Pitt", "Edward Norton", "George Clooney", "Matt Damon"), "Cinema", "Brad Pitt starred in Fight Club (1999) and Seven (1995), two cult films directed by David Fincher."),
            zh = LocalizedContent("哪位演员出演了《搏击俱乐部》和《七宗罪》？", listOf("布拉德·皮特", "爱德华·诺顿", "乔治·克鲁尼", "马特·达蒙"), "电影", "布拉德·皮特出演了大卫·芬奇执导的两部经典电影《搏击俱乐部》（1999）和《七宗罪》（1995）。"),
            es = LocalizedContent("¿Qué actor protagonizó 'El club de la lucha' y 'Seven'?", listOf("Brad Pitt", "Edward Norton", "George Clooney", "Matt Damon"), "Cine", "Brad Pitt protagonizó El club de la lucha (1999) y Seven (1995), dos películas de culto dirigidas por David Fincher.")
        ),
        BilingualQuestion(
            id = 21108, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film détient le record du box-office mondial ?", listOf("Avatar (2009)", "Avengers: Endgame", "Titanic", "Star Wars: Le Réveil de la Force"), "Cinéma", "Avec 2,9 milliards de dollars de recettes, Avatar de James Cameron a dépassé Titanic en 2010 pour devenir le plus gros succès commercial de l'histoire du cinéma."),
            en = LocalizedContent("Which film holds the worldwide box office record?", listOf("Avatar (2009)", "Avengers: Endgame", "Titanic", "Star Wars: The Force Awakens"), "Cinema", "With $2.9 billion in revenue, James Cameron's Avatar surpassed Titanic in 2010 to become the highest-grossing film in cinema history."),
            zh = LocalizedContent("哪部电影保持着全球票房纪录？", listOf("《阿凡达》（2009）", "《复仇者联盟4：终局之战》", "《泰坦尼克号》", "《星球大战：原力觉醒》"), "电影", "詹姆斯·卡梅隆的《阿凡达》以29亿美元的票房收入，在2010年超越《泰坦尼克号》，成为电影史上最卖座的电影。"),
            es = LocalizedContent("¿Qué película ostenta el récord de taquilla mundial?", listOf("Avatar (2009)", "Avengers: Endgame", "Titanic", "Star Wars: El Despertar de la Fuerza"), "Cine", "Con 2.900 millones de dólares de recaudación, Avatar de James Cameron superó a Titanic en 2010 para convertirse en el mayor éxito comercial de la historia del cine.")
        ),
        BilingualQuestion(
            id = 21110, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel studio d'animation japonais a créé 'Le Voyage de Chihiro' ?", listOf("Studio Ghibli", "Toei Animation", "Madhouse", "Sunrise"), "Cinéma", "Fondé par Hayao Miyazaki et Isao Takahata, le Studio Ghibli a produit ce film acclamé, qui a remporté l'Oscar du meilleur film d'animation en 2003."),
            en = LocalizedContent("Which Japanese animation studio created 'Spirited Away'?", listOf("Studio Ghibli", "Toei Animation", "Madhouse", "Sunrise"), "Cinema", "Founded by Hayao Miyazaki and Isao Takahata, Studio Ghibli produced this acclaimed film, which won the Oscar for Best Animated Feature in 2003."),
            zh = LocalizedContent("哪家日本动画工作室创作了《千与千寻》？", listOf("吉卜力工作室", "东映动画", "疯屋", "日升"), "电影", "由宫崎骏和高畑勋创立的吉卜力工作室制作了这部广受好评的电影，该片在2003年获得了奥斯卡最佳动画长片奖。"),
            es = LocalizedContent("¿Qué estudio de animación japonés creó 'El viaje de Chihiro'?", listOf("Studio Ghibli", "Toei Animation", "Madhouse", "Sunrise"), "Cine", "Fundado por Hayao Miyazaki e Isao Takahata, Studio Ghibli produjo esta aclamada película, que ganó el Óscar a la mejor película de animación en 2003.")
        ),
    )
}
