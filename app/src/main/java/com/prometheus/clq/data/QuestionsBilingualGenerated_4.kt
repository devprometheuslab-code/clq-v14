package com.prometheus.clq.data

import com.prometheus.clq.model.BilingualQuestion
import com.prometheus.clq.model.Difficulty
import com.prometheus.clq.model.Language
import com.prometheus.clq.model.LocalizedContent
import com.prometheus.clq.model.Question

/** Auto-generated batch 4 : 500 questions bilingues */
object QuestionsBilingualGenerated_4 {
    fun get(lang: Language = Language.FR): List<Question> = list.map { it.toQuestion(lang) }

    val list: List<BilingualQuestion> by lazy {
        part1() + part2() + part3() + part4() + part5() + part6() + part7()
    }

    private fun part1(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 7203, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel organe du corps humain produit la bile ?", listOf("Pancreas", "Estomac", "Foie", "Rate"), "Science", "La bile est produite par le foie, puis stockée dans la vésicule biliaire. Elle aide à la digestion des graisses dans l'intestin grêle."),
            en = LocalizedContent("Which organ of the human body produces bile?", listOf("Pancreas", "Stomach", "Liver", "Spleen"), "Science", "Bile is produced by the liver and stored in the gallbladder. It helps digest fats in the small intestine."),
            zh = LocalizedContent("人体哪个器官产生胆汁？", listOf("胰腺", "胃", "肝脏", "脾脏"), "科学", "胆汁由肝脏产生，储存在胆囊中，帮助在小肠中消化脂肪。"),
            es = LocalizedContent("¿Qué órgano del cuerpo humano produce la bilis?", listOf("Páncreas", "Estómago", "Hígado", "Bazo"), "Ciencia", "La bilis es producida por el hígado y almacenada en la vesícula biliar. Ayuda a digerir las grasas en el intestino delgado.")
        ),
        BilingualQuestion(
            id = 7204, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la temperature du zero absolu en Celsius ?", listOf("-273.15", "- 300", "-250", "-200"), "Science", "Le zéro absolu correspond à la température théorique la plus basse possible, où l'agitation moléculaire cesse. En degrés Celsius, cette limite est fixée à -273,15°C, servant de base à l'échelle Kelvin."),
            en = LocalizedContent("What is the temperature of absolute zero in Celsius?", listOf("-273.15", "-300", "-250", "-200"), "Science", "Absolute zero is the lowest possible temperature, where molecular motion ceases. In Celsius, this limit is -273.15°C, forming the basis of the Kelvin scale."),
            zh = LocalizedContent("绝对零度在摄氏温度下是多少？", listOf("-273.15", "-300", "-250", "-200"), "科学", "绝对零度是理论上可能的最低温度，此时分子运动停止。在摄氏温标中，这一极限为-273.15°C，是开尔文温标的基础。"),
            es = LocalizedContent("¿Cuál es la temperatura del cero absoluto en Celsius?", listOf("-273.15", "-300", "-250", "-200"), "Ciencia", "El cero absoluto es la temperatura más baja posible, donde cesa el movimiento molecular. En grados Celsius, este límite es -273.15°C, base de la escala Kelvin.")
        ),
        BilingualQuestion(
            id = 7205, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nombre atomique de l'hydrogene ?", listOf("0", "1", "2", "3"), "Science", "Le nombre atomique correspond au nombre de protons dans le noyau. L'hydrogène possède un seul proton, d'où son nombre atomique 1."),
            en = LocalizedContent("What is the atomic number of hydrogen?", listOf("0", "1", "2", "3"), "Science", "The atomic number corresponds to the number of protons in the nucleus. Hydrogen has one proton, hence its atomic number is 1."),
            zh = LocalizedContent("氢的原子序数是多少？", listOf("0", "1", "2", "3"), "科学", "原子序数对应原子核中的质子数。氢有一个质子，因此其原子序数为1。"),
            es = LocalizedContent("¿Cuál es el número atómico del hidrógeno?", listOf("0", "1", "2", "3"), "Ciencia", "El número atómico corresponde al número de protones en el núcleo. El hidrógeno tiene un protón, por lo que su número atómico es 1.")
        ),
        BilingualQuestion(
            id = 7206, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de temps met la lumiere du Soleil pour atteindre la Terre ?", listOf("1 minute", "8 minutes", "15 minutes", "30 secondes"), "Science", "La lumière du Soleil parcourt environ 150 millions de kilomètres à la vitesse de 300 000 km/s, ce qui prend environ 8 minutes et 20 secondes."),
            en = LocalizedContent("How long does it take for sunlight to reach Earth?", listOf("1 minute", "8 minutes", "15 minutes", "30 seconds"), "Science", "Sunlight travels about 150 million kilometers at 300,000 km/s, taking approximately 8 minutes and 20 seconds."),
            zh = LocalizedContent("太阳光到达地球需要多长时间？", listOf("1分钟", "8分钟", "15分钟", "30秒"), "科学", "太阳光以每秒30万公里的速度传播约1.5亿公里，大约需要8分20秒。"),
            es = LocalizedContent("¿Cuánto tarda la luz del Sol en llegar a la Tierra?", listOf("1 minuto", "8 minutos", "15 minutos", "30 segundos"), "Ciencia", "La luz del Sol recorre unos 150 millones de kilómetros a 300 000 km/s, lo que toma aproximadamente 8 minutos y 20 segundos.")
        ),
        BilingualQuestion(
            id = 7207, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a invente le telephone ?", listOf("Thomas Edison", "Nikola Tesla", "Alexander Graham Bell", "Guglielmo Marconi"), "Science", "Alexander Graham Bell a déposé le brevet du téléphone en 1876, bien que d'autres inventeurs comme Elisha Gray aient travaillé sur des dispositifs similaires à la même époque."),
            en = LocalizedContent("Who invented the telephone?", listOf("Thomas Edison", "Nikola Tesla", "Alexander Graham Bell", "Guglielmo Marconi"), "Science", "Alexander Graham Bell patented the telephone in 1876, although other inventors like Elisha Gray worked on similar devices at the same time."),
            zh = LocalizedContent("谁发明了电话？", listOf("托马斯·爱迪生", "尼古拉·特斯拉", "亚历山大·格拉汉姆·贝尔", "古列尔莫·马可尼"), "科学", "亚历山大·格拉汉姆·贝尔于1876年获得了电话的专利，尽管同时期其他发明家如伊莱沙·格雷也在研究类似设备。"),
            es = LocalizedContent("¿Quién inventó el teléfono?", listOf("Thomas Edison", "Nikola Tesla", "Alexander Graham Bell", "Guglielmo Marconi"), "Ciencia", "Alexander Graham Bell patentó el teléfono en 1876, aunque otros inventores como Elisha Gray trabajaron en dispositivos similares al mismo tiempo.")
        ),
        BilingualQuestion(
            id = 7209, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle vitamine est synthetisee par la peau sous l'effet du soleil ?", listOf("Vitamine A", "Vitamine B12", "Vitamine C", "Vitamine D"), "Science", "La vitamine D est synthétisée par la peau lors de l'exposition aux rayons UVB du soleil, un processus essentiel pour la fixation du calcium et la santé osseuse."),
            en = LocalizedContent("Which vitamin is synthesized by the skin under the effect of sunlight?", listOf("Vitamin A", "Vitamin B12", "Vitamin C", "Vitamin D"), "Science", "Vitamin D is synthesized by the skin upon exposure to UVB rays from the sun, a process essential for calcium absorption and bone health."),
            zh = LocalizedContent("哪种维生素在阳光照射下由皮肤合成？", listOf("维生素A", "维生素B12", "维生素C", "维生素D"), "科学", "维生素D由皮肤在暴露于太阳紫外线B时合成，这一过程对钙的吸收和骨骼健康至关重要。"),
            es = LocalizedContent("¿Qué vitamina es sintetizada por la piel bajo el efecto del sol?", listOf("Vitamina A", "Vitamina B12", "Vitamina C", "Vitamina D"), "Ciencia", "La vitamina D es sintetizada por la piel al exponerse a los rayos UVB del sol, un proceso esencial para la fijación del calcio y la salud ósea.")
        ),
        BilingualQuestion(
            id = 7210, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de planetes compose le systeme solaire ?", listOf("7", "8", "9", "10"), "Science", "Le système solaire compte huit planètes reconnues depuis 2006, quand Pluton a été reclassée comme planète naine par l'Union astronomique internationale."),
            en = LocalizedContent("How many planets make up the solar system?", listOf("7", "8", "9", "10"), "Science", "The solar system has eight recognized planets since 2006, when Pluto was reclassified as a dwarf planet by the International Astronomical Union."),
            zh = LocalizedContent("太阳系由多少颗行星组成？", listOf("7", "8", "9", "10"), "科学", "自2006年国际天文学联合会将冥王星重新归类为矮行星以来，太阳系有八颗公认的行星。"),
            es = LocalizedContent("¿Cuántos planetas componen el sistema solar?", listOf("7", "8", "9", "10"), "Ciencia", "El sistema solar tiene ocho planetas reconocidos desde 2006, cuando Plutón fue reclasificado como planeta enano por la Unión Astronómica Internacional.")
        ),
        BilingualQuestion(
            id = 7211, correctIndex = 2, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel element chimique porte le numero atomique 79 ?", listOf("Argent", "Platine", "Or", "Cuivre"), "Science", "L'or est l'élément de numéro atomique 79, un métal précieux utilisé en bijouterie et comme réserve de valeur."),
            en = LocalizedContent("Which chemical element has atomic number 79?", listOf("Silver", "Platinum", "Gold", "Copper"), "Science", "Gold is the element with atomic number 79, a precious metal used in jewelry and as a store of value."),
            zh = LocalizedContent("哪种化学元素的原子序数是79？", listOf("银", "铂", "金", "铜"), "科学", "金是原子序数为79的元素，是一种用于珠宝和作为价值储存的贵金属。"),
            es = LocalizedContent("¿Qué elemento químico tiene el número atómico 79?", listOf("Plata", "Platino", "Oro", "Cobre"), "Ciencia", "El oro es el elemento de número atómico 79, un metal precioso utilizado en joyería y como reserva de valor.")
        ),
        BilingualQuestion(
            id = 7212, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel type de roche se forme par le refroidissement du magma ?", listOf("Sedimentaire", "Metamorphique", "Magmatique", "Calcaire"), "Science", "Les roches magmatiques, aussi appelées ignées, résultent de la solidification du magma en fusion en profondeur ou en surface."),
            en = LocalizedContent("What type of rock forms from the cooling of magma?", listOf("Sedimentary", "Metamorphic", "Igneous", "Limestone"), "Science", "Igneous rocks, also called magmatic rocks, result from the solidification of molten magma either underground or on the surface."),
            zh = LocalizedContent("哪种岩石由岩浆冷却形成？", listOf("沉积岩", "变质岩", "岩浆岩", "石灰岩"), "科学", "岩浆岩，也称火成岩，是由熔融岩浆在地下或地表凝固形成的。"),
            es = LocalizedContent("¿Qué tipo de roca se forma por el enfriamiento del magma?", listOf("Sedimentaria", "Metamórfica", "Magmática", "Caliza"), "Ciencia", "Las rocas magmáticas, también llamadas ígneas, resultan de la solidificación del magma fundido en profundidad o en la superficie.")
        ),
        BilingualQuestion(
            id = 7213, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel scientifique a decouvert la penicilline ?", listOf("Louis Pasteur", "Alexander Fleming", "Robert Koch", "Joseph Lister"), "Science", "Alexander Fleming a découvert la pénicilline en 1928 en observant qu’une moisissure inhibait la croissance de bactéries dans une boîte de Pétri."),
            en = LocalizedContent("Which scientist discovered penicillin?", listOf("Louis Pasteur", "Alexander Fleming", "Robert Koch", "Joseph Lister"), "Science", "Alexander Fleming discovered penicillin in 1928 when he observed that a mold inhibited bacterial growth in a Petri dish."),
            zh = LocalizedContent("哪位科学家发现了青霉素？", listOf("路易·巴斯德", "亚历山大·弗莱明", "罗伯特·科赫", "约瑟夫·李斯特"), "科学", "亚历山大·弗莱明于1928年发现青霉素，当时他观察到一种霉菌在培养皿中抑制了细菌的生长。"),
            es = LocalizedContent("¿Qué científico descubrió la penicilina?", listOf("Louis Pasteur", "Alexander Fleming", "Robert Koch", "Joseph Lister"), "Ciencia", "Alexander Fleming descubrió la penicilina en 1928 al observar que un moho inhibía el crecimiento de bacterias en una placa de Petri.")
        ),
        BilingualQuestion(
            id = 7215, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel phenomene physique explique l'arc-en-ciel ?", listOf("Reflection", "Refraction", "Diffraction", "Absorption"), "Science", "La lumière blanche du soleil se décompose en ses couleurs spectrales lorsqu'elle traverse les gouttes d'eau, un phénomène appelé réfraction."),
            en = LocalizedContent("What physical phenomenon explains the rainbow?", listOf("Reflection", "Refraction", "Diffraction", "Absorption"), "Science", "White sunlight splits into its spectral colors when passing through water droplets, a phenomenon called refraction."),
            zh = LocalizedContent("什么物理现象解释了彩虹的形成？", listOf("反射", "折射", "衍射", "吸收"), "科学", "太阳的白光穿过水滴时分解成光谱颜色，这种现象称为折射。"),
            es = LocalizedContent("¿Qué fenómeno físico explica el arcoíris?", listOf("Reflexión", "Refracción", "Difracción", "Absorción"), "Ciencia", "La luz blanca del sol se descompone en sus colores espectrales al atravesar las gotas de agua, un fenómeno llamado refracción.")
        ),
        BilingualQuestion(
            id = 7301, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle annee Christophe Colomb a-t-il atteint les Ameriques ?", listOf("1498", "1492", "1500", "1488"), "Histoire", "Christophe Colomb, cherchant une route vers les Indes par l'ouest, débarqua aux Bahamas le 12 octobre 1492, marquant le premier contact européen durable avec les Amériques."),
            en = LocalizedContent("In which year did Christopher Columbus reach the Americas?", listOf("1498", "1492", "1500", "1488"), "History", "Christopher Columbus, seeking a western route to the Indies, landed in the Bahamas on October 12, 1492, marking the first lasting European contact with the Americas."),
            zh = LocalizedContent("克里斯托弗·哥伦布在哪一年到达美洲？", listOf("1498年", "1492年", "1500年", "1488年"), "历史", "克里斯托弗·哥伦布寻求向西通往印度的航线，于1492年10月12日在巴哈马登陆，标志着欧洲与美洲的首次持久接触。"),
            es = LocalizedContent("¿En qué año llegó Cristóbal Colón a las Américas?", listOf("1498", "1492", "1500", "1488"), "Historia", "Cristóbal Colón, buscando una ruta hacia las Indias por el oeste, desembarcó en las Bahamas el 12 de octubre de 1492, marcando el primer contacto europeo duradero con las Américas.")
        ),
        BilingualQuestion(
            id = 7302, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pharaon est associe a la plus grande pyramide de Gizeh ?", listOf("Toutankhamon", "Ramses II", "Kheops", "Akhenaton"), "Histoire", "La pyramide de Khéops, aussi appelée Grande Pyramide, est la plus ancienne et la plus grande des pyramides de Gizeh, construite sous le règne du pharaon Khéops (IVe dynastie)."),
            en = LocalizedContent("Which pharaoh is associated with the largest pyramid of Giza?", listOf("Tutankhamun", "Ramses II", "Khufu", "Akhenaten"), "History", "The Pyramid of Khufu, also called the Great Pyramid, is the oldest and largest of the Giza pyramids, built under the reign of Pharaoh Khufu (4th Dynasty)."),
            zh = LocalizedContent("哪位法老与吉萨最大的金字塔相关联？", listOf("图坦卡蒙", "拉美西斯二世", "胡夫", "阿肯那顿"), "历史", "胡夫金字塔，又称大金字塔，是吉萨金字塔中最古老、最大的一座，建于法老胡夫（第四王朝）统治时期。"),
            es = LocalizedContent("¿Qué faraón está asociado con la pirámide más grande de Guiza?", listOf("Tutankamón", "Ramsés II", "Keops", "Akenatón"), "Historia", "La pirámide de Keops, también llamada Gran Pirámide, es la más antigua y más grande de las pirámides de Guiza, construida bajo el reinado del faraón Keops (IV dinastía).")
        ),
        BilingualQuestion(
            id = 7303, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle guerre a oppose le Nord et le Sud des Etats-Unis ?", listOf("Guerre d'Independance", "Guerre de Secession", "Guerre du Vietnam", "Guerre hispano-americaine"), "Histoire", "La guerre de Sécession (1861-1865) opposa les États du Nord (Union) à ceux du Sud (Confédérés) principalement sur les questions de l'esclavage et des droits des États."),
            en = LocalizedContent("Which war opposed the North and South of the United States?", listOf("War of Independence", "Civil War", "Vietnam War", "Spanish-American War"), "History", "The Civil War (1861-1865) pitted the Northern states (Union) against the Southern states (Confederates) mainly over issues of slavery and states' rights."),
            zh = LocalizedContent("哪场战争使美国北方和南方对立？", listOf("独立战争", "南北战争", "越南战争", "美西战争"), "历史", "南北战争（1861-1865）使北方各州（联邦）与南方各州（邦联）对立，主要围绕奴隶制和州权问题。"),
            es = LocalizedContent("¿Qué guerra enfrentó al Norte y al Sur de los Estados Unidos?", listOf("Guerra de Independencia", "Guerra de Secesión", "Guerra de Vietnam", "Guerra hispano-estadounidense"), "Historia", "La Guerra de Secesión (1861-1865) enfrentó a los estados del Norte (Unión) contra los del Sur (Confederados) principalmente por cuestiones de esclavitud y derechos de los estados.")
        ),
        BilingualQuestion(
            id = 7304, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel empereur romain a legalise le christianisme en 313 ?", listOf("Auguste", "Neron", "Constantin", "Marc Aurele"), "Histoire", "Par l'édit de Milan en 313, Constantin accorde la liberté de culte aux chrétiens, mettant fin aux persécutions dans l'Empire romain."),
            en = LocalizedContent("Which Roman emperor legalized Christianity in 313?", listOf("Augustus", "Nero", "Constantine", "Marcus Aurelius"), "History", "By the Edict of Milan in 313, Constantine granted freedom of worship to Christians, ending persecutions in the Roman Empire."),
            zh = LocalizedContent("哪位罗马皇帝在313年使基督教合法化？", listOf("奥古斯都", "尼禄", "君士坦丁", "马可·奥勒留"), "历史", "通过313年的米兰敕令，君士坦丁授予基督徒信仰自由，结束了罗马帝国对基督徒的迫害。"),
            es = LocalizedContent("¿Qué emperador romano legalizó el cristianismo en el año 313?", listOf("Augusto", "Nerón", "Constantino", "Marco Aurelio"), "Historia", "Mediante el Edicto de Milán en 313, Constantino otorgó libertad de culto a los cristianos, poniendo fin a las persecuciones en el Imperio romano.")
        ),
        BilingualQuestion(
            id = 7305, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a lance la premiere bombe atomique en temps de guerre ?", listOf("Union Sovietique", "Etats-Unis", "Allemagne", "Japon"), "Histoire", "Les États-Unis ont largué la première bombe atomique sur Hiroshima le 6 août 1945, suivie de celle de Nagasaki trois jours plus tard, précipitant la fin de la Seconde Guerre mondiale."),
            en = LocalizedContent("Which country dropped the first atomic bomb in wartime?", listOf("Soviet Union", "United States", "Germany", "Japan"), "History", "The United States dropped the first atomic bomb on Hiroshima on August 6, 1945, followed by Nagasaki three days later, hastening the end of World War II."),
            zh = LocalizedContent("哪个国家在战时投下了第一颗原子弹？", listOf("苏联", "美国", "德国", "日本"), "历史", "美国于1945年8月6日在广岛投下第一颗原子弹，三天后在长崎投下第二颗，加速了第二次世界大战的结束。"),
            es = LocalizedContent("¿Qué país lanzó la primera bomba atómica en tiempos de guerra?", listOf("Unión Soviética", "Estados Unidos", "Alemania", "Japón"), "Historia", "Estados Unidos lanzó la primera bomba atómica sobre Hiroshima el 6 de agosto de 1945, seguida de la de Nagasaki tres días después, precipitando el fin de la Segunda Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 7306, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle annee a ete signee la Declaration d'independance americaine ?", listOf("1789", "1776", "1804", "1763"), "Histoire", "La Déclaration d'indépendance des États-Unis a été adoptée par le Congrès continental le 4 juillet 1776, proclamant la séparation des treize colonies de la Grande-Bretagne."),
            en = LocalizedContent("In which year was the American Declaration of Independence signed?", listOf("1789", "1776", "1804", "1763"), "History", "The United States Declaration of Independence was adopted by the Continental Congress on July 4, 1776, proclaiming the separation of the thirteen colonies from Great Britain."),
            zh = LocalizedContent("美国独立宣言在哪一年签署？", listOf("1789年", "1776年", "1804年", "1763年"), "历史", "美国独立宣言于1776年7月4日由大陆会议通过，宣布十三个殖民地脱离大不列颠独立。"),
            es = LocalizedContent("¿En qué año se firmó la Declaración de Independencia de los Estados Unidos?", listOf("1789", "1776", "1804", "1763"), "Historia", "La Declaración de Independencia de los Estados Unidos fue adoptada por el Congreso Continental el 4 de julio de 1776, proclamando la separación de las trece colonias de Gran Bretaña.")
        ),
        BilingualQuestion(
            id = 7307, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel explorateur portugais a atteint l'Inde par la mer en 1498 ?", listOf("Christophe Colomb", "Magellan", "Vasco de Gama", "Bartolomeu Dias"), "Histoire", "Vasco de Gama fut le premier Européen à atteindre l'Inde par voie maritime en contournant l'Afrique, ouvrant ainsi la route des épices pour le Portugal."),
            en = LocalizedContent("Which Portuguese explorer reached India by sea in 1498?", listOf("Christopher Columbus", "Magellan", "Vasco da Gama", "Bartolomeu Dias"), "History", "Vasco da Gama was the first European to reach India by sea, rounding Africa, thus opening the spice route for Portugal."),
            zh = LocalizedContent("哪位葡萄牙探险家在1498年经海路到达印度？", listOf("克里斯托弗·哥伦布", "麦哲伦", "瓦斯科·达·伽马", "巴托洛梅乌·迪亚士"), "历史", "瓦斯科·达·伽马是第一位经海路绕过非洲到达印度的欧洲人，为葡萄牙开辟了香料航线。"),
            es = LocalizedContent("¿Qué explorador portugués llegó a la India por mar en 1498?", listOf("Cristóbal Colón", "Magallanes", "Vasco da Gama", "Bartolomé Díaz"), "Historia", "Vasco da Gama fue el primer europeo en llegar a la India por mar, rodeando África, abriendo así la ruta de las especias para Portugal.")
        ),
        BilingualQuestion(
            id = 7308, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel evenement a marque le debut de la Revolution francaise en 1789 ?", listOf("Execution de Louis XVI", "Prise de la Bastille", "Serment du Jeu de Paume", "Fuite a Varennes"), "Histoire", "Le 14 juillet 1789, des Parisiens en colère prennent d'assaut la forteresse de la Bastille, symbole de l'autorité royale, pour récupérer des armes et des munitions. Cet événement déclenche la Révolution française en marquant la première grande insurrection populaire contre la monarchie."),
            en = LocalizedContent("Which event marked the beginning of the French Revolution in 1789?", listOf("Execution of Louis XVI", "Storming of the Bastille", "Tennis Court Oath", "Flight to Varennes"), "History", "On July 14, 1789, angry Parisians stormed the Bastille fortress, a symbol of royal authority, to seize weapons and ammunition. This event triggered the French Revolution by marking the first major popular insurrection against the monarchy."),
            zh = LocalizedContent("哪个事件标志着1789年法国大革命的开始？", listOf("处决路易十六", "攻占巴士底狱", "网球场宣誓", "逃往瓦雷讷"), "历史", "1789年7月14日，愤怒的巴黎人攻占了巴士底狱，这座象征王权的堡垒，以夺取武器和弹药。这一事件标志着第一次大规模人民起义反对君主制，从而引发了法国大革命。"),
            es = LocalizedContent("¿Qué evento marcó el inicio de la Revolución Francesa en 1789?", listOf("Ejecución de Luis XVI", "Toma de la Bastilla", "Juramento del Juego de Pelota", "Fuga a Varennes"), "Historia", "El 14 de julio de 1789, parisinos enfurecidos asaltaron la fortaleza de la Bastilla, símbolo de la autoridad real, para apoderarse de armas y municiones. Este evento desencadenó la Revolución Francesa al marcar la primera gran insurrección popular contra la monarquía.")
        ),
        BilingualQuestion(
            id = 7309, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel roi anglais avait six epouses ?", listOf("Richard III", "Henri VIII", "Edouard VI", "Jacques Ier"), "Histoire", "Henri VIII d'Angleterre est connu pour avoir eu six épouses, dont il répudia ou fit exécuter certaines pour assurer une descendance mâle."),
            en = LocalizedContent("Which English king had six wives?", listOf("Richard III", "Henry VIII", "Edward VI", "James I"), "History", "Henry VIII of England is known for having six wives, some of whom he divorced or executed to ensure a male heir."),
            zh = LocalizedContent("哪位英国国王有六位妻子？", listOf("理查三世", "亨利八世", "爱德华六世", "詹姆斯一世"), "历史", "英格兰的亨利八世以拥有六位妻子而闻名，他为了确保男性继承人，休弃或处决了其中一些妻子。"),
            es = LocalizedContent("¿Qué rey inglés tuvo seis esposas?", listOf("Ricardo III", "Enrique VIII", "Eduardo VI", "Jacobo I"), "Historia", "Enrique VIII de Inglaterra es conocido por haber tenido seis esposas, de las cuales repudió o hizo ejecutar a algunas para asegurar un heredero varón.")
        ),
        BilingualQuestion(
            id = 7311, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel traite a cree l'Union europeenne en 1992 ?", listOf("Traite de Rome", "Traite de Maastricht", "Traite de Lisbonne", "Traite de Nice"), "Histoire", "Le traité de Maastricht, signé en 1992, a institué l'Union européenne en établissant trois piliers, dont la citoyenneté européenne et les critères pour la monnaie unique."),
            en = LocalizedContent("Which treaty created the European Union in 1992?", listOf("Treaty of Rome", "Treaty of Maastricht", "Treaty of Lisbon", "Treaty of Nice"), "History", "The Maastricht Treaty, signed in 1992, established the European Union by creating three pillars, including European citizenship and criteria for the single currency."),
            zh = LocalizedContent("1992年哪项条约创立了欧盟？", listOf("罗马条约", "马斯特里赫特条约", "里斯本条约", "尼斯条约"), "历史", "1992年签署的《马斯特里赫特条约》通过建立三大支柱，包括欧洲公民身份和单一货币标准，确立了欧盟。"),
            es = LocalizedContent("¿Qué tratado creó la Unión Europea en 1992?", listOf("Tratado de Roma", "Tratado de Maastricht", "Tratado de Lisboa", "Tratado de Niza"), "Historia", "El Tratado de Maastricht, firmado en 1992, instituyó la Unión Europea estableciendo tres pilares, incluida la ciudadanía europea y los criterios para la moneda única.")
        ),
        BilingualQuestion(
            id = 7312, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel mur a divise Berlin de 1961 a 1989 ?", listOf("Mur de l'Atlantique", "Ligne Maginot", "Mur de Berlin", "Rideau de fer"), "Histoire", "Construit par la RDA, le Mur de Berlin séparait physiquement et idéologiquement Berlin-Est de Berlin-Ouest pendant la Guerre froide."),
            en = LocalizedContent("Which wall divided Berlin from 1961 to 1989?", listOf("Atlantic Wall", "Maginot Line", "Berlin Wall", "Iron Curtain"), "History", "Built by the GDR, the Berlin Wall physically and ideologically separated East Berlin from West Berlin during the Cold War."),
            zh = LocalizedContent("哪堵墙从1961年到1989年分割了柏林？", listOf("大西洋壁垒", "马奇诺防线", "柏林墙", "铁幕"), "历史", "由东德建造的柏林墙在冷战期间从物理和意识形态上分隔了东柏林和西柏林。"),
            es = LocalizedContent("¿Qué muro dividió Berlín de 1961 a 1989?", listOf("Muro del Atlántico", "Línea Maginot", "Muro de Berlín", "Telón de Acero"), "Historia", "Construido por la RDA, el Muro de Berlín separó física e ideológicamente Berlín Este de Berlín Oeste durante la Guerra Fría.")
        ),
        BilingualQuestion(
            id = 7313, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel empire s'est effondre en 1453 avec la chute de Constantinople ?", listOf("Empire romain", "Empire ottoman", "Empire byzantin", "Empire perse"), "Histoire", "La chute de Constantinople en 1453, après un siège mené par les Ottomans, marque la fin de l'Empire byzantin, dernier vestige de l'Empire romain d'Orient."),
            en = LocalizedContent("Which empire collapsed in 1453 with the fall of Constantinople?", listOf("Roman Empire", "Ottoman Empire", "Byzantine Empire", "Persian Empire"), "History", "The fall of Constantinople in 1453, after a siege by the Ottomans, marked the end of the Byzantine Empire, the last remnant of the Eastern Roman Empire."),
            zh = LocalizedContent("1453年君士坦丁堡陷落导致哪个帝国崩溃？", listOf("罗马帝国", "奥斯曼帝国", "拜占庭帝国", "波斯帝国"), "历史", "1453年君士坦丁堡在奥斯曼人的围攻下陷落，标志着拜占庭帝国的终结，这是东罗马帝国的最后残余。"),
            es = LocalizedContent("¿Qué imperio colapsó en 1453 con la caída de Constantinopla?", listOf("Imperio Romano", "Imperio Otomano", "Imperio Bizantino", "Imperio Persa"), "Historia", "La caída de Constantinopla en 1453, tras un asedio otomano, marcó el fin del Imperio Bizantino, último vestigio del Imperio Romano de Oriente.")
        ),
        BilingualQuestion(
            id = 7314, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle bataille navale de 1805 fut la derniere victoire de Nelson ?", listOf("Aboukir", "Trafalgar", "Jutland", "Lepante"), "Histoire", "La bataille de Trafalgar, livrée le 21 octobre 1805, opposa la flotte britannique à la flotte franco-espagnole. Nelson y trouva la mort, mais remporta une victoire décisive qui assura la suprématie navale britannique."),
            en = LocalizedContent("Which naval battle of 1805 was Nelson's last victory?", listOf("Aboukir", "Trafalgar", "Jutland", "Lepanto"), "History", "The Battle of Trafalgar, fought on October 21, 1805, pitted the British fleet against the Franco-Spanish fleet. Nelson died there but won a decisive victory that ensured British naval supremacy."),
            zh = LocalizedContent("1805年的哪场海战是纳尔逊的最后胜利？", listOf("阿布基尔", "特拉法加", "日德兰", "勒班陀"), "历史", "1805年10月21日发生的特拉法加海战中，英国舰队与法西联合舰队交战。纳尔逊在此战中阵亡，但赢得了决定性胜利，确保了英国的海上霸权。"),
            es = LocalizedContent("¿Qué batalla naval de 1805 fue la última victoria de Nelson?", listOf("Abukir", "Trafalgar", "Jutlandia", "Lepanto"), "Historia", "La batalla de Trafalgar, librada el 21 de octubre de 1805, enfrentó a la flota británica contra la flota franco-española. Nelson murió allí, pero obtuvo una victoria decisiva que aseguró la supremacía naval británica.")
        ),
        BilingualQuestion(
            id = 7315, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel president americain a aboli l'esclavage ?", listOf("George Washington", "Thomas Jefferson", "Abraham Lincoln", "Theodore Roosevelt"), "Histoire", "Abraham Lincoln a promulgué le 13e amendement en 1865, abolissant définitivement l'esclavage aux États-Unis après la guerre de Sécession."),
            en = LocalizedContent("Which American president abolished slavery?", listOf("George Washington", "Thomas Jefferson", "Abraham Lincoln", "Theodore Roosevelt"), "History", "Abraham Lincoln enacted the 13th Amendment in 1865, permanently abolishing slavery in the United States after the Civil War."),
            zh = LocalizedContent("哪位美国总统废除了奴隶制？", listOf("乔治·华盛顿", "托马斯·杰斐逊", "亚伯拉罕·林肯", "西奥多·罗斯福"), "历史", "亚伯拉罕·林肯于1865年颁布了第十三修正案，在内战后永久废除了美国的奴隶制。"),
            es = LocalizedContent("¿Qué presidente estadounidense abolió la esclavitud?", listOf("George Washington", "Thomas Jefferson", "Abraham Lincoln", "Theodore Roosevelt"), "Historia", "Abraham Lincoln promulgó la 13.ª Enmienda en 1865, aboliendo definitivamente la esclavitud en Estados Unidos tras la Guerra Civil.")
        ),
        BilingualQuestion(
            id = 7401, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la capitale de la Nouvelle-Zelande ?", listOf("Auckland", "Wellington", "Christchurch", "Hamilton"), "Geographie", "Wellington est la capitale de la Nouvelle-Zélande depuis 1865, remplaçant Auckland. Elle abrite le Parlement et les institutions gouvernementales du pays."),
            en = LocalizedContent("What is the capital of New Zealand?", listOf("Auckland", "Wellington", "Christchurch", "Hamilton"), "Geography", "Wellington has been the capital of New Zealand since 1865, replacing Auckland. It houses the Parliament and government institutions of the country."),
            zh = LocalizedContent("新西兰的首都是哪里？", listOf("奥克兰", "惠灵顿", "基督城", "汉密尔顿"), "地理", "自1865年起，惠灵顿取代奥克兰成为新西兰首都，设有议会和国家政府机构。"),
            es = LocalizedContent("¿Cuál es la capital de Nueva Zelanda?", listOf("Auckland", "Wellington", "Christchurch", "Hamilton"), "Geografía", "Wellington es la capital de Nueva Zelanda desde 1865, reemplazando a Auckland. Alberga el Parlamento y las instituciones gubernamentales del país.")
        ),
        BilingualQuestion(
            id = 7402, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand pays du monde en superficie ?", listOf("Canada", "Chine", "Etats-Unis", "Russie"), "Geographie", "La Russie s'étend sur environ 17,1 millions de kilomètres carrés, couvrant l'Europe de l'Est et l'Asie du Nord."),
            en = LocalizedContent("Which is the largest country in the world by area?", listOf("Canada", "China", "United States", "Russia"), "Geography", "Russia covers about 17.1 million square kilometers, spanning Eastern Europe and Northern Asia."),
            zh = LocalizedContent("世界上面积最大的国家是哪个？", listOf("加拿大", "中国", "美国", "俄罗斯"), "地理", "俄罗斯面积约1710万平方公里，横跨东欧和北亚。"),
            es = LocalizedContent("¿Cuál es el país más grande del mundo por superficie?", listOf("Canadá", "China", "Estados Unidos", "Rusia"), "Geografía", "Rusia se extiende sobre aproximadamente 17,1 millones de kilómetros cuadrados, abarcando Europa del Este y Asia del Norte.")
        ),
        BilingualQuestion(
            id = 7403, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel fleuve traverse Londres ?", listOf("Seine", "Rhin", "Tamise", "Danube"), "Geographie", "La Tamise est le principal fleuve traversant Londres, s'écoulant d'ouest en est jusqu'à la mer du Nord. Elle est au cœur de l'histoire et de l'économie de la ville depuis l'époque romaine."),
            en = LocalizedContent("Which river flows through London?", listOf("Seine", "Rhine", "Thames", "Danube"), "Geography", "The Thames is the main river flowing through London, running from west to east into the North Sea. It has been central to the city's history and economy since Roman times."),
            zh = LocalizedContent("哪条河流经伦敦？", listOf("塞纳河", "莱茵河", "泰晤士河", "多瑙河"), "地理", "泰晤士河是流经伦敦的主要河流，自西向东注入北海。自罗马时代以来，它一直是该市历史和经济的核心。"),
            es = LocalizedContent("¿Qué río atraviesa Londres?", listOf("Sena", "Rin", "Támesis", "Danubio"), "Geografía", "El Támesis es el principal río que atraviesa Londres, fluyendo de oeste a este hasta el mar del Norte. Ha sido central en la historia y economía de la ciudad desde la época romana.")
        ),
        BilingualQuestion(
            id = 7404, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays possede le plus grand nombre d'iles au monde ?", listOf("Philippines", "Indonesie", "Suede", "Japon"), "Geographie", "La Suède compte environ 267 570 îles, dont la plupart sont inhabitées, ce qui en fait le pays avec le plus grand nombre d'îles au monde."),
            en = LocalizedContent("Which country has the most islands in the world?", listOf("Philippines", "Indonesia", "Sweden", "Japan"), "Geography", "Sweden has about 267,570 islands, most of which are uninhabited, making it the country with the most islands in the world."),
            zh = LocalizedContent("哪个国家拥有世界上最多的岛屿？", listOf("菲律宾", "印度尼西亚", "瑞典", "日本"), "地理", "瑞典约有267,570个岛屿，其中大部分无人居住，使其成为世界上岛屿最多的国家。"),
            es = LocalizedContent("¿Qué país tiene el mayor número de islas del mundo?", listOf("Filipinas", "Indonesia", "Suecia", "Japón"), "Geografía", "Suecia cuenta con aproximadamente 267.570 islas, la mayoría deshabitadas, lo que lo convierte en el país con más islas del mundo.")
        ),
        BilingualQuestion(
            id = 7405, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la mer la plus salee du monde ?", listOf("Mer Morte", "Mer Rouge", "Mer Caspienne", "Mer Mediterranee"), "Geographie", "La Mer Morte est la plus salée du monde avec une salinité d'environ 34%, soit près de dix fois celle des océans, ce qui permet de flotter facilement à sa surface."),
            en = LocalizedContent("Which is the saltiest sea in the world?", listOf("Dead Sea", "Red Sea", "Caspian Sea", "Mediterranean Sea"), "Geography", "The Dead Sea is the saltiest sea in the world with a salinity of about 34%, nearly ten times that of the oceans, allowing easy floating on its surface."),
            zh = LocalizedContent("世界上最咸的海是哪个？", listOf("死海", "红海", "里海", "地中海"), "地理", "死海是世界上最咸的海，盐度约为34%，几乎是海洋的十倍，因此人可以轻松漂浮在其表面。"),
            es = LocalizedContent("¿Cuál es el mar más salado del mundo?", listOf("Mar Muerto", "Mar Rojo", "Mar Caspio", "Mar Mediterráneo"), "Geografía", "El Mar Muerto es el más salado del mundo, con una salinidad de aproximadamente el 34%, casi diez veces la de los océanos, lo que permite flotar fácilmente en su superficie.")
        ),
        BilingualQuestion(
            id = 7406, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le point le plus profond des oceans ?", listOf("Fosse de Porto Rico", "Fosse des Mariannes", "Fosse des Tonga", "Fosse de Java"), "Geographie", "La fosse des Mariannes, située dans l'océan Pacifique, atteint environ 11 034 mètres de profondeur à son point nommé Challenger Deep."),
            en = LocalizedContent("What is the deepest point of the oceans?", listOf("Puerto Rico Trench", "Mariana Trench", "Tonga Trench", "Java Trench"), "Geography", "The Mariana Trench, located in the Pacific Ocean, reaches about 11,034 meters at its deepest point called Challenger Deep."),
            zh = LocalizedContent("海洋中最深点是什么？", listOf("波多黎各海沟", "马里亚纳海沟", "汤加海沟", "爪哇海沟"), "地理", "马里亚纳海沟位于太平洋，其最深处挑战者深渊深度约为11034米。"),
            es = LocalizedContent("¿Cuál es el punto más profundo de los océanos?", listOf("Fosa de Puerto Rico", "Fosa de las Marianas", "Fosa de Tonga", "Fosa de Java"), "Geografía", "La fosa de las Marianas, ubicada en el océano Pacífico, alcanza unos 11 034 metros en su punto más profundo llamado Challenger Deep.")
        ),
        BilingualQuestion(
            id = 7407, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de continents compte la Terre ?", listOf("5", "6", "7", "8"), "Geographie", "Le modèle des sept continents (Afrique, Amériques, Antarctique, Asie, Europe, Océanie) est le plus enseigné dans les pays francophones et anglo-saxons."),
            en = LocalizedContent("How many continents does Earth have?", listOf("5", "6", "7", "8"), "Geography", "The seven-continent model (Africa, Americas, Antarctica, Asia, Europe, Oceania) is the most taught in French-speaking and English-speaking countries."),
            zh = LocalizedContent("地球上有几个大洲？", listOf("5", "6", "7", "8"), "地理", "七大洲模型（非洲、美洲、南极洲、亚洲、欧洲、大洋洲）在法语和英语国家中最为常见。"),
            es = LocalizedContent("¿Cuántos continentes tiene la Tierra?", listOf("5", "6", "7", "8"), "Geografía", "El modelo de siete continentes (África, Américas, Antártida, Asia, Europa, Oceanía) es el más enseñado en los países francófonos y anglosajones.")
        ),
        BilingualQuestion(
            id = 7408, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a pour capitale Reykjavik ?", listOf("Norvege", "Finlande", "Islande", "Danemark"), "Geographie", "Reykjavik est la capitale et la plus grande ville d'Islande, située sur la côte sud-ouest du pays."),
            en = LocalizedContent("Which country has Reykjavik as its capital?", listOf("Norway", "Finland", "Iceland", "Denmark"), "Geography", "Reykjavik is the capital and largest city of Iceland, located on the country's southwestern coast."),
            zh = LocalizedContent("哪个国家的首都是雷克雅未克？", listOf("挪威", "芬兰", "冰岛", "丹麦"), "地理", "雷克雅未克是冰岛的首都和最大城市，位于该国西南海岸。"),
            es = LocalizedContent("¿Qué país tiene como capital Reikiavik?", listOf("Noruega", "Finlandia", "Islandia", "Dinamarca"), "Geografía", "Reikiavik es la capital y ciudad más grande de Islandia, situada en la costa suroeste del país.")
        ),
        BilingualQuestion(
            id = 7409, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel desert se trouve en Amerique du Sud ?", listOf("Sahara", "Gobi", "Atacama", "Kalahari"), "Geographie", "Le désert d'Atacama, situé principalement au Chili, est le plus aride du monde et constitue le principal désert d'Amérique du Sud."),
            en = LocalizedContent("Which desert is located in South America?", listOf("Sahara", "Gobi", "Atacama", "Kalahari"), "Geography", "The Atacama Desert, mainly in Chile, is the driest desert in the world and the main desert in South America."),
            zh = LocalizedContent("哪个沙漠位于南美洲？", listOf("撒哈拉沙漠", "戈壁沙漠", "阿塔卡马沙漠", "卡拉哈里沙漠"), "地理", "阿塔卡马沙漠主要位于智利，是世界上最干燥的沙漠，也是南美洲的主要沙漠。"),
            es = LocalizedContent("¿Qué desierto se encuentra en América del Sur?", listOf("Sáhara", "Gobi", "Atacama", "Kalahari"), "Geografía", "El desierto de Atacama, ubicado principalmente en Chile, es el más árido del mundo y constituye el principal desierto de América del Sur.")
        ),
        BilingualQuestion(
            id = 7410, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac d'eau douce du monde par superficie ?", listOf("Lac Baikal", "Lac Victoria", "Lac Superieur", "Lac Titicaca"), "Geographie", "Le lac Supérieur, situé entre les États-Unis et le Canada, est le plus grand lac d'eau douce du monde avec une superficie d'environ 82 100 km². Il fait partie des Grands Lacs d'Amérique du Nord."),
            en = LocalizedContent("What is the largest freshwater lake in the world by surface area?", listOf("Lake Baikal", "Lake Victoria", "Lake Superior", "Lake Titicaca"), "Geography", "Lake Superior, between the United States and Canada, is the largest freshwater lake by surface area, covering about 82,100 km². It is part of the Great Lakes of North America."),
            zh = LocalizedContent("按面积计算，世界上最大的淡水湖是哪个？", listOf("贝加尔湖", "维多利亚湖", "苏必利尔湖", "的的喀喀湖"), "地理", "苏必利尔湖位于美国和加拿大之间，是面积最大的淡水湖，面积约82100平方公里，是北美五大湖之一。"),
            es = LocalizedContent("¿Cuál es el lago de agua dulce más grande del mundo por superficie?", listOf("Lago Baikal", "Lago Victoria", "Lago Superior", "Lago Titicaca"), "Geografía", "El lago Superior, entre Estados Unidos y Canadá, es el lago de agua dulce más grande por superficie, con unos 82 100 km². Forma parte de los Grandes Lagos de América del Norte.")
        ),
        BilingualQuestion(
            id = 7411, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle chaine de montagnes separe l'Europe de l'Asie ?", listOf("Alpes", "Caucase", "Oural", "Carpates"), "Geographie", "L'Oural forme une barrière naturelle traditionnellement reconnue comme la limite entre l'Europe et l'Asie, s'étendant de l'océan Arctique jusqu'au Kazakhstan."),
            en = LocalizedContent("Which mountain range separates Europe from Asia?", listOf("Alps", "Caucasus", "Urals", "Carpathians"), "Geography", "The Urals form a natural barrier traditionally recognized as the boundary between Europe and Asia, stretching from the Arctic Ocean to Kazakhstan."),
            zh = LocalizedContent("哪座山脉分隔了欧洲和亚洲？", listOf("阿尔卑斯山脉", "高加索山脉", "乌拉尔山脉", "喀尔巴阡山脉"), "地理", "乌拉尔山脉形成了一道天然屏障，传统上被认为是欧洲和亚洲的分界线，从北冰洋延伸至哈萨克斯坦。"),
            es = LocalizedContent("¿Qué cadena montañosa separa Europa de Asia?", listOf("Alpes", "Cáucaso", "Urales", "Cárpatos"), "Geografía", "Los Urales forman una barrera natural tradicionalmente reconocida como el límite entre Europa y Asia, extendiéndose desde el océano Ártico hasta Kazajistán.")
        ),
        BilingualQuestion(
            id = 7412, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays d'Afrique a pour capitale Nairobi ?", listOf("Ouganda", "Tanzanie", "Kenya", "Ethiopie"), "Geographie", "Nairobi est la capitale du Kenya, située dans le sud du pays. Elle est le centre économique et politique du Kenya."),
            en = LocalizedContent("Which African country has Nairobi as its capital?", listOf("Uganda", "Tanzania", "Kenya", "Ethiopia"), "Geography", "Nairobi is the capital of Kenya, located in the south of the country. It is the economic and political center of Kenya."),
            zh = LocalizedContent("哪个非洲国家的首都是内罗毕？", listOf("乌干达", "坦桑尼亚", "肯尼亚", "埃塞俄比亚"), "地理", "内罗毕是肯尼亚的首都，位于该国南部，是肯尼亚的经济和政治中心。"),
            es = LocalizedContent("¿Qué país africano tiene como capital Nairobi?", listOf("Uganda", "Tanzania", "Kenia", "Etiopía"), "Geografía", "Nairobi es la capital de Kenia, ubicada en el sur del país. Es el centro económico y político de Kenia.")
        ),
        BilingualQuestion(
            id = 7413, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus petit pays du monde ?", listOf("Monaco", "Vatican", "Saint-Marin", "Liechtenstein"), "Geographie", "Le Vatican, enclavé dans Rome, s'étend sur seulement 0,44 km², ce qui en fait le plus petit État indépendant du monde en superficie et en population."),
            en = LocalizedContent("What is the smallest country in the world?", listOf("Monaco", "Vatican City", "San Marino", "Liechtenstein"), "Geography", "Vatican City, enclaved within Rome, covers only 0.44 km², making it the smallest independent state in the world by area and population."),
            zh = LocalizedContent("世界上最小的国家是哪个？", listOf("摩纳哥", "梵蒂冈", "圣马力诺", "列支敦士登"), "地理", "梵蒂冈位于罗马城内，面积仅0.44平方公里，是世界上面积和人口最小的独立国家。"),
            es = LocalizedContent("¿Cuál es el país más pequeño del mundo?", listOf("Mónaco", "Ciudad del Vaticano", "San Marino", "Liechtenstein"), "Geografía", "La Ciudad del Vaticano, enclavada en Roma, tiene solo 0,44 km², lo que la convierte en el estado independiente más pequeño del mundo en superficie y población.")
        ),
        BilingualQuestion(
            id = 7414, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Sur quel continent se trouve le lac Titicaca ?", listOf("Afrique", "Asie", "Amerique du Sud", "Europe"), "Geographie", "Le lac Titicaca est situé dans la cordillère des Andes, à la frontière entre le Pérou et la Bolivie, ce qui le place en Amérique du Sud."),
            en = LocalizedContent("On which continent is Lake Titicaca located?", listOf("Africa", "Asia", "South America", "Europe"), "Geography", "Lake Titicaca is located in the Andes mountain range, on the border between Peru and Bolivia, placing it in South America."),
            zh = LocalizedContent("的的喀喀湖位于哪个大洲？", listOf("非洲", "亚洲", "南美洲", "欧洲"), "地理", "的的喀喀湖位于安第斯山脉，秘鲁和玻利维亚的边界上，因此位于南美洲。"),
            es = LocalizedContent("¿En qué continente se encuentra el lago Titicaca?", listOf("África", "Asia", "América del Sur", "Europa"), "Geografía", "El lago Titicaca está situado en la cordillera de los Andes, en la frontera entre Perú y Bolivia, lo que lo sitúa en América del Sur.")
        ),
        BilingualQuestion(
            id = 7415, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays a la plus grande population au monde ?", listOf("Inde", "Chine", "Etats-Unis", "Indonesie"), "Geographie", "L'Inde a dépassé la Chine en 2023 pour devenir le pays le plus peuplé du monde, avec environ 1,4 milliard d'habitants."),
            en = LocalizedContent("Which country has the largest population in the world?", listOf("India", "China", "United States", "Indonesia"), "Geography", "India surpassed China in 2023 to become the most populous country in the world, with about 1.4 billion inhabitants."),
            zh = LocalizedContent("哪个国家是世界上人口最多的？", listOf("印度", "中国", "美国", "印度尼西亚"), "地理", "印度在2023年超过中国，成为世界上人口最多的国家，约有14亿居民。"),
            es = LocalizedContent("¿Qué país tiene la población más grande del mundo?", listOf("India", "China", "Estados Unidos", "Indonesia"), "Geografía", "La India superó a China en 2023 para convertirse en el país más poblado del mundo, con aproximadamente 1.400 millones de habitantes.")
        ),
        BilingualQuestion(
            id = 7501, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel realisateur a cree la saga Star Wars ?", listOf("Steven Spielberg", "George Lucas", "James Cameron", "Ridley Scott"), "Culture", "George Lucas a écrit et réalisé le premier film Star Wars en 1977, lançant ainsi la saga."),
            en = LocalizedContent("Which director created the Star Wars saga?", listOf("Steven Spielberg", "George Lucas", "James Cameron", "Ridley Scott"), "Culture", "George Lucas wrote and directed the first Star Wars film in 1977, launching the saga."),
            zh = LocalizedContent("哪位导演创造了《星球大战》系列？", listOf("史蒂文·斯皮尔伯格", "乔治·卢卡斯", "詹姆斯·卡梅隆", "雷德利·斯科特"), "文化", "乔治·卢卡斯于1977年编剧并执导了第一部《星球大战》电影，从而开启了这一系列。"),
            es = LocalizedContent("¿Qué director creó la saga Star Wars?", listOf("Steven Spielberg", "George Lucas", "James Cameron", "Ridley Scott"), "Cultura", "George Lucas escribió y dirigió la primera película de Star Wars en 1977, lanzando así la saga.")
        ),
        BilingualQuestion(
            id = 7502, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel groupe de rock a sorti l'album The Dark Side of the Moon ?", listOf("Led Zeppelin", "The Rolling Stones", "Pink Floyd", "The Who"), "Culture", "Pink Floyd a sorti The Dark Side of the Moon en 1973, un album conceptuel devenu l'un des plus vendus de l'histoire du rock."),
            en = LocalizedContent("Which rock band released the album The Dark Side of the Moon?", listOf("Led Zeppelin", "The Rolling Stones", "Pink Floyd", "The Who"), "Culture", "Pink Floyd released The Dark Side of the Moon in 1973, a concept album that became one of the best-selling in rock history."),
            zh = LocalizedContent("哪支摇滚乐队发行了专辑《月之暗面》？", listOf("齐柏林飞艇", "滚石乐队", "平克·弗洛伊德", "谁人乐队"), "文化", "平克·弗洛伊德于1973年发行了《月之暗面》，这张概念专辑成为摇滚史上最畅销的专辑之一。"),
            es = LocalizedContent("¿Qué grupo de rock lanzó el álbum The Dark Side of the Moon?", listOf("Led Zeppelin", "The Rolling Stones", "Pink Floyd", "The Who"), "Cultura", "Pink Floyd lanzó The Dark Side of the Moon en 1973, un álbum conceptual que se convirtió en uno de los más vendidos de la historia del rock.")
        ),
        BilingualQuestion(
            id = 7503, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel manga suit les aventures de Monkey D. Luffy ?", listOf("Naruto", "Dragon Ball", "One Piece", "Bleach"), "Culture", "One Piece est un manga d'aventure créé par Eiichiro Oda, publié depuis 1997, qui raconte la quête de Monkey D. Luffy pour devenir le roi des pirates."),
            en = LocalizedContent("Which manga follows the adventures of Monkey D. Luffy?", listOf("Naruto", "Dragon Ball", "One Piece", "Bleach"), "Culture", "One Piece is an adventure manga created by Eiichiro Oda, published since 1997, telling the quest of Monkey D. Luffy to become the Pirate King."),
            zh = LocalizedContent("哪部漫画讲述了蒙奇·D·路飞的冒险故事？", listOf("火影忍者", "龙珠", "海贼王", "死神"), "文化", "《海贼王》是尾田荣一郎创作的冒险漫画，自1997年开始连载，讲述了蒙奇·D·路飞成为海贼王的旅程。"),
            es = LocalizedContent("¿Qué manga sigue las aventuras de Monkey D. Luffy?", listOf("Naruto", "Dragon Ball", "One Piece", "Bleach"), "Cultura", "One Piece es un manga de aventuras creado por Eiichiro Oda, publicado desde 1997, que narra la búsqueda de Monkey D. Luffy para convertirse en el rey de los piratas.")
        ),
        BilingualQuestion(
            id = 7504, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel ecrivain francais a ecrit Le Petit Prince ?", listOf("Victor Hugo", "Albert Camus", "Antoine de Saint-Exupery", "Marcel Proust"), "Culture", "Antoine de Saint-Exupéry, aviateur et écrivain, publie Le Petit Prince en 1943, une œuvre philosophique sous forme de conte pour enfants."),
            en = LocalizedContent("Which French writer wrote The Little Prince?", listOf("Victor Hugo", "Albert Camus", "Antoine de Saint-Exupéry", "Marcel Proust"), "Culture", "Antoine de Saint-Exupéry, aviator and writer, published The Little Prince in 1943, a philosophical work in the form of a children's tale."),
            zh = LocalizedContent("哪位法国作家写了《小王子》？", listOf("维克多·雨果", "阿尔贝·加缪", "安托万·德·圣-埃克苏佩里", "马塞尔·普鲁斯特"), "文化", "安托万·德·圣-埃克苏佩里，飞行员兼作家，于1943年出版了《小王子》，这是一部以儿童故事形式呈现的哲学作品。"),
            es = LocalizedContent("¿Qué escritor francés escribió El Principito?", listOf("Victor Hugo", "Albert Camus", "Antoine de Saint-Exupéry", "Marcel Proust"), "Cultura", "Antoine de Saint-Exupéry, aviador y escritor, publicó El Principito en 1943, una obra filosófica en forma de cuento infantil.")
        ),
        BilingualQuestion(
            id = 7505, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel jeu video a popularise le genre battle royale en 2017 ?", listOf("Fortnite", "PUBG", "Apex Legends", "Call of Duty Warzone"), "Culture", "PUBG, sorti en accès anticipé en mars 2017, a imposé le format du battle royale avec son gameplay réaliste et ses parties à 100 joueurs."),
            en = LocalizedContent("Which video game popularized the battle royale genre in 2017?", listOf("Fortnite", "PUBG", "Apex Legends", "Call of Duty Warzone"), "Culture", "PUBG, released in early access in March 2017, established the battle royale format with its realistic gameplay and 100-player matches."),
            zh = LocalizedContent("哪款电子游戏在2017年普及了“大逃杀”类型？", listOf("堡垒之夜", "绝地求生", "Apex英雄", "使命召唤：战区"), "文化", "《绝地求生》于2017年3月以抢先体验形式发布，以其逼真的游戏玩法和100人对战模式确立了“大逃杀”的格式。"),
            es = LocalizedContent("¿Qué videojuego popularizó el género battle royale en 2017?", listOf("Fortnite", "PUBG", "Apex Legends", "Call of Duty Warzone"), "Cultura", "PUBG, lanzado en acceso anticipado en marzo de 2017, impuso el formato battle royale con su jugabilidad realista y partidas de 100 jugadores.")
        ),
        BilingualQuestion(
            id = 7506, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel peintre espagnol est connu pour sa periode bleue ?", listOf("Salvador Dali", "Pablo Picasso", "Joan Miro", "Francisco Goya"), "Culture", "Picasso a traversé une période bleue entre 1901 et 1904, marquée par des tons froids et des thèmes mélancoliques, après le suicide de son ami Carlos Casagemas."),
            en = LocalizedContent("Which Spanish painter is known for his Blue Period?", listOf("Salvador Dalí", "Pablo Picasso", "Joan Miró", "Francisco Goya"), "Culture", "Picasso went through a Blue Period between 1901 and 1904, marked by cold tones and melancholic themes, after the suicide of his friend Carlos Casagemas."),
            zh = LocalizedContent("哪位西班牙画家以其“蓝色时期”而闻名？", listOf("萨尔瓦多·达利", "巴勃罗·毕加索", "胡安·米罗", "弗朗西斯科·戈雅"), "文化", "毕加索在1901年至1904年间经历了“蓝色时期”，以冷色调和忧郁主题为特征，起因于他的朋友卡洛斯·卡萨吉马斯的自杀。"),
            es = LocalizedContent("¿Qué pintor español es conocido por su período azul?", listOf("Salvador Dalí", "Pablo Picasso", "Joan Miró", "Francisco Goya"), "Cultura", "Picasso atravesó un período azul entre 1901 y 1904, marcado por tonos fríos y temas melancólicos, tras el suicidio de su amigo Carlos Casagemas.")
        ),
        BilingualQuestion(
            id = 7507, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle serie anime met en scene des combats de Shinigami ?", listOf("Naruto", "Bleach", "One Piece", "Dragon Ball Z"), "Culture", "Bleach suit les aventures d'Ichigo Kurosaki, un adolescent qui devient Shinigami (dieu de la mort) et combat des esprits maléfiques appelés Hollows."),
            en = LocalizedContent("Which anime series features battles of Shinigami?", listOf("Naruto", "Bleach", "One Piece", "Dragon Ball Z"), "Culture", "Bleach follows the adventures of Ichigo Kurosaki, a teenager who becomes a Shinigami (death god) and fights evil spirits called Hollows."),
            zh = LocalizedContent("哪部动漫系列以死神之间的战斗为特色？", listOf("火影忍者", "死神", "海贼王", "龙珠Z"), "文化", "《死神》讲述了黑崎一护的冒险故事，他是一名成为死神（死亡之神）的少年，与名为虚的邪恶灵魂战斗。"),
            es = LocalizedContent("¿Qué serie de anime presenta combates de Shinigami?", listOf("Naruto", "Bleach", "One Piece", "Dragon Ball Z"), "Cultura", "Bleach sigue las aventuras de Ichigo Kurosaki, un adolescente que se convierte en Shinigami (dios de la muerte) y lucha contra espíritus malignos llamados Hollows.")
        ),
        BilingualQuestion(
            id = 7508, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film Pixar met en scene un robot solitaire sur Terre ?", listOf("Les Indestructibles", "Ratatouille", "WALL-E", "La-Haut"), "Culture", "WALL-E, sorti en 2008, suit un petit robot laissé seul sur une Terre polluée et abandonnée par les humains, chargé de compacter les déchets."),
            en = LocalizedContent("Which Pixar film features a lonely robot on Earth?", listOf("The Incredibles", "Ratatouille", "WALL-E", "Up"), "Culture", "WALL-E, released in 2008, follows a small robot left alone on a polluted and abandoned Earth, tasked with compacting trash."),
            zh = LocalizedContent("哪部皮克斯电影讲述了一个孤独的机器人在地球上的故事？", listOf("超人总动员", "料理鼠王", "机器人总动员", "飞屋环游记"), "文化", "《机器人总动员》于2008年上映，讲述了一个小机器人被独自留在一个被污染和遗弃的地球上，负责压缩垃圾的故事。"),
            es = LocalizedContent("¿Qué película de Pixar presenta un robot solitario en la Tierra?", listOf("Los Increíbles", "Ratatouille", "WALL-E", "Up"), "Cultura", "WALL-E, estrenada en 2008, sigue a un pequeño robot abandonado en una Tierra contaminada y deshabitada, encargado de compactar basura.")
        ),
        BilingualQuestion(
            id = 7509, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel auteur britannique a cree Sherlock Holmes ?", listOf("Agatha Christie", "Arthur Conan Doyle", "J.R.R. Tolkien", "Charles Dickens"), "Culture", "Arthur Conan Doyle, médecin et écrivain écossais, a créé le détective Sherlock Holmes en 1887 pour son roman \"Une étude en rouge\"."),
            en = LocalizedContent("Which British author created Sherlock Holmes?", listOf("Agatha Christie", "Arthur Conan Doyle", "J.R.R. Tolkien", "Charles Dickens"), "Culture", "Arthur Conan Doyle, a Scottish physician and writer, created the detective Sherlock Holmes in 1887 for his novel A Study in Scarlet."),
            zh = LocalizedContent("哪位英国作家创造了夏洛克·福尔摩斯？", listOf("阿加莎·克里斯蒂", "阿瑟·柯南·道尔", "J.R.R. 托尔金", "查尔斯·狄更斯"), "文化", "阿瑟·柯南·道尔，苏格兰医生兼作家，于1887年在其小说《血字的研究》中创造了侦探夏洛克·福尔摩斯。"),
            es = LocalizedContent("¿Qué autor británico creó a Sherlock Holmes?", listOf("Agatha Christie", "Arthur Conan Doyle", "J.R.R. Tolkien", "Charles Dickens"), "Cultura", "Arthur Conan Doyle, médico y escritor escocés, creó al detective Sherlock Holmes en 1887 para su novela Estudio en escarlata.")
        ),
        BilingualQuestion(
            id = 7510, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel jeu video met en scene un plombier qui sauve une princesse ?", listOf("Sonic", "Super Mario Bros.", "Donkey Kong", "Mega Man"), "Culture", "Super Mario Bros., sorti en 1985 sur NES, a popularisé le personnage de Mario, un plombier moustachu, dans sa quête pour sauver la princesse Peach du méchant Bowser."),
            en = LocalizedContent("Which video game features a plumber who saves a princess?", listOf("Sonic", "Super Mario Bros.", "Donkey Kong", "Mega Man"), "Culture", "Super Mario Bros., released in 1985 on the NES, popularized the character Mario, a mustachioed plumber, in his quest to save Princess Peach from the villain Bowser."),
            zh = LocalizedContent("哪款电子游戏讲述了一个水管工拯救公主的故事？", listOf("索尼克", "超级马力欧兄弟", "大金刚", "洛克人"), "文化", "《超级马力欧兄弟》于1985年在NES上发行，使角色马力欧（一个留胡子的水管工）广受欢迎，他的任务是拯救碧姬公主于恶棍库巴之手。"),
            es = LocalizedContent("¿Qué videojuego presenta a un fontanero que salva a una princesa?", listOf("Sonic", "Super Mario Bros.", "Donkey Kong", "Mega Man"), "Cultura", "Super Mario Bros., lanzado en 1985 para NES, popularizó al personaje de Mario, un fontanero bigotudo, en su búsqueda para salvar a la princesa Peach del malvado Bowser.")
        ),
        BilingualQuestion(
            id = 7511, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel rappeur americain a sorti l'album The Marshall Mathers LP ?", listOf("Jay-Z", "Kanye West", "Eminem", "50 Cent"), "Culture", "Eminem a sorti The Marshall Mathers LP en 2000, un album nommé d'après son vrai nom, Marshall Mathers."),
            en = LocalizedContent("Which American rapper released the album The Marshall Mathers LP?", listOf("Jay-Z", "Kanye West", "Eminem", "50 Cent"), "Culture", "Eminem released The Marshall Mathers LP in 2000, an album named after his real name, Marshall Mathers."),
            zh = LocalizedContent("哪位美国说唱歌手发行了专辑《The Marshall Mathers LP》？", listOf("Jay-Z", "Kanye West", "Eminem", "50 Cent"), "文化", "Eminem于2000年发行了《The Marshall Mathers LP》，这张专辑以他的真名Marshall Mathers命名。"),
            es = LocalizedContent("¿Qué rapero estadounidense lanzó el álbum The Marshall Mathers LP?", listOf("Jay-Z", "Kanye West", "Eminem", "50 Cent"), "Cultura", "Eminem lanzó The Marshall Mathers LP en 2000, un álbum nombrado por su nombre real, Marshall Mathers.")
        ),
        BilingualQuestion(
            id = 7512, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle BD belge met en scene un reporter avec une houppe ?", listOf("Spirou", "Tintin", "Lucky Luke", "Gaston Lagaffe"), "Culture", "Tintin, créé par Hergé en 1929, est un reporter à la célèbre mèche de cheveux (houppe) dans la série de bande dessinée belge Les Aventures de Tintin."),
            en = LocalizedContent("Which Belgian comic features a reporter with a tuft of hair?", listOf("Spirou", "Tintin", "Lucky Luke", "Gaston Lagaffe"), "Culture", "Tintin, created by Hergé in 1929, is a reporter with a famous tuft of hair in the Belgian comic series The Adventures of Tintin."),
            zh = LocalizedContent("哪部比利时漫画描绘了一位有一撮头发的记者？", listOf("Spirou", "Tintin", "Lucky Luke", "Gaston Lagaffe"), "文化", "丁丁由埃尔热于1929年创作，是比利时漫画系列《丁丁历险记》中一位有着著名一撮头发的记者。"),
            es = LocalizedContent("¿Qué cómic belga presenta a un reportero con un mechón de pelo?", listOf("Spirou", "Tintin", "Lucky Luke", "Gaston Lagaffe"), "Cultura", "Tintín, creado por Hergé en 1929, es un reportero con un famoso mechón de pelo en la serie de cómics belga Las Aventuras de Tintín.")
        ),
        BilingualQuestion(
            id = 7513, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste a peint le plafond de la chapelle Sixtine ?", listOf("Raphael", "Leonard de Vinci", "Michel-Ange", "Le Caravage"), "Culture", "Michel-Ange a réalisé cette fresque monumentale entre 1508 et 1512, commandée par le pape Jules II, représentant des scènes de la Genèse."),
            en = LocalizedContent("Which artist painted the ceiling of the Sistine Chapel?", listOf("Raphael", "Leonardo da Vinci", "Michelangelo", "Caravaggio"), "Culture", "Michelangelo created this monumental fresco between 1508 and 1512, commissioned by Pope Julius II, depicting scenes from Genesis."),
            zh = LocalizedContent("哪位艺术家绘制了西斯廷教堂的天顶画？", listOf("拉斐尔", "列奥纳多·达·芬奇", "米开朗基罗", "卡拉瓦乔"), "文化", "米开朗基罗在1508年至1512年间创作了这幅宏伟的壁画，由教皇尤利乌斯二世委托，描绘了《创世纪》中的场景。"),
            es = LocalizedContent("¿Qué artista pintó el techo de la Capilla Sixtina?", listOf("Rafael", "Leonardo da Vinci", "Miguel Ángel", "Caravaggio"), "Cultura", "Miguel Ángel creó este fresco monumental entre 1508 y 1512, encargado por el Papa Julio II, representando escenas del Génesis.")
        ),
        BilingualQuestion(
            id = 7514, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film de 1999 explore le concept de realite simulee ?", listOf("Inception", "The Matrix", "Blade Runner", "Dark City"), "Culture", "The Matrix, réalisé par les Wachowski, présente un monde où la réalité est une simulation informatique créée par des machines pour contrôler l'humanité."),
            en = LocalizedContent("Which 1999 film explores the concept of simulated reality?", listOf("Inception", "The Matrix", "Blade Runner", "Dark City"), "Culture", "The Matrix, directed by the Wachowskis, presents a world where reality is a computer simulation created by machines to control humanity."),
            zh = LocalizedContent("哪部1999年的电影探讨了模拟现实的概念？", listOf("《盗梦空间》", "《黑客帝国》", "《银翼杀手》", "《黑暗城市》"), "文化", "《黑客帝国》由沃卓斯基姐妹执导，呈现了一个现实是机器为控制人类而创造的计算机模拟的世界。"),
            es = LocalizedContent("¿Qué película de 1999 explora el concepto de realidad simulada?", listOf("Inception", "The Matrix", "Blade Runner", "Dark City"), "Cultura", "The Matrix, dirigida por las hermanas Wachowski, presenta un mundo donde la realidad es una simulación informática creada por máquinas para controlar a la humanidad.")
        ),
        BilingualQuestion(
            id = 7515, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel auteur a ecrit la saga Harry Potter ?", listOf("Stephen King", "J.R.R. Tolkien", "J.K. Rowling", "George R.R. Martin"), "Culture", "J.K. Rowling est l'auteure britannique qui a créé la saga Harry Potter, publiée entre 1997 et 2007."),
            en = LocalizedContent("Which author wrote the Harry Potter saga?", listOf("Stephen King", "J.R.R. Tolkien", "J.K. Rowling", "George R.R. Martin"), "Culture", "J.K. Rowling is the British author who created the Harry Potter saga, published between 1997 and 2007."),
            zh = LocalizedContent("哪位作者写了《哈利·波特》系列？", listOf("斯蒂芬·金", "J.R.R. 托尔金", "J.K. 罗琳", "乔治·R·R·马丁"), "文化", "J.K. 罗琳是英国作家，创作了《哈利·波特》系列，该系列于1997年至2007年间出版。"),
            es = LocalizedContent("¿Qué autor escribió la saga de Harry Potter?", listOf("Stephen King", "J.R.R. Tolkien", "J.K. Rowling", "George R.R. Martin"), "Cultura", "J.K. Rowling es la autora británica que creó la saga de Harry Potter, publicada entre 1997 y 2007.")
        ),
        BilingualQuestion(
            id = 7601, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'animal terrestre le plus rapide ?", listOf("Lion", "Guepard", "Antilope", "Loup"), "Nature", "Le guépard peut atteindre des pointes de vitesse allant jusqu'à 110 km/h sur de courtes distances, ce qui en fait le mammifère terrestre le plus rapide au monde."),
            en = LocalizedContent("What is the fastest land animal?", listOf("Lion", "Cheetah", "Antelope", "Wolf"), "Nature", "The cheetah can reach top speeds of up to 110 km/h over short distances, making it the fastest land mammal in the world."),
            zh = LocalizedContent("最快的陆地动物是什么？", listOf("狮子", "猎豹", "羚羊", "狼"), "自然", "猎豹在短距离内最高时速可达110公里，是世界上跑得最快的陆地哺乳动物。"),
            es = LocalizedContent("¿Cuál es el animal terrestre más rápido?", listOf("León", "Guepardo", "Antílope", "Lobo"), "Naturaleza", "El guepardo puede alcanzar velocidades máximas de hasta 110 km/h en distancias cortas, lo que lo convierte en el mamífero terrestre más rápido del mundo.")
        ),
        BilingualQuestion(
            id = 7602, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de pattes possede une araignee ?", listOf("6", "8", "10", "12"), "Nature", "Les araignées appartiennent à la classe des arachnides, qui se distinguent des insectes par huit pattes, contre six pour ces derniers."),
            en = LocalizedContent("How many legs does a spider have?", listOf("6", "8", "10", "12"), "Nature", "Spiders belong to the class Arachnida, which are distinguished from insects by having eight legs, compared to six for insects."),
            zh = LocalizedContent("蜘蛛有几条腿？", listOf("6", "8", "10", "12"), "自然", "蜘蛛属于蛛形纲，与昆虫的区别在于有八条腿，而昆虫有六条。"),
            es = LocalizedContent("¿Cuántas patas tiene una araña?", listOf("6", "8", "10", "12"), "Naturaleza", "Las arañas pertenecen a la clase Arácnidos, que se distinguen de los insectos por tener ocho patas, frente a las seis de estos últimos.")
        ),
        BilingualQuestion(
            id = 7603, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand animal ayant jamais vecu sur Terre ?", listOf("Elephant d'Afrique", "Diplodocus", "Baleine bleue", "Megalodon"), "Nature", "La baleine bleue peut atteindre plus de 30 mètres de long et peser jusqu'à 200 tonnes, dépassant ainsi tous les dinosaures connus en taille et en masse."),
            en = LocalizedContent("What is the largest animal ever to have lived on Earth?", listOf("African elephant", "Diplodocus", "Blue whale", "Megalodon"), "Nature", "The blue whale can reach over 30 meters in length and weigh up to 200 tons, surpassing all known dinosaurs in size and mass."),
            zh = LocalizedContent("地球上曾经生活过的最大动物是什么？", listOf("非洲象", "梁龙", "蓝鲸", "巨齿鲨"), "自然", "蓝鲸体长可达30米以上，重量可达200吨，在体型和质量上超过了所有已知的恐龙。"),
            es = LocalizedContent("¿Cuál es el animal más grande que jamás haya vivido en la Tierra?", listOf("Elefante africano", "Diplodocus", "Ballena azul", "Megalodón"), "Naturaleza", "La ballena azul puede alcanzar más de 30 metros de longitud y pesar hasta 200 toneladas, superando a todos los dinosaurios conocidos en tamaño y masa.")
        ),
        BilingualQuestion(
            id = 7604, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand ocean du monde ?", listOf("Atlantique", "Indien", "Arctique", "Pacifique"), "Nature", "L'océan Pacifique couvre environ 165 millions de kilomètres carrés, soit plus du tiers de la surface terrestre, ce qui en fait le plus vaste océan du monde."),
            en = LocalizedContent("What is the largest ocean in the world?", listOf("Atlantic", "Indian", "Arctic", "Pacific"), "Nature", "The Pacific Ocean covers about 165 million square kilometers, more than a third of the Earth's surface, making it the largest ocean in the world."),
            zh = LocalizedContent("世界上最大的海洋是什么？", listOf("大西洋", "印度洋", "北冰洋", "太平洋"), "自然", "太平洋面积约1.65亿平方公里，占地球表面积的三分之一以上，是世界上最大的海洋。"),
            es = LocalizedContent("¿Cuál es el océano más grande del mundo?", listOf("Atlántico", "Índico", "Ártico", "Pacífico"), "Naturaleza", "El océano Pacífico cubre aproximadamente 165 millones de kilómetros cuadrados, más de un tercio de la superficie terrestre, lo que lo convierte en el océano más grande del mundo.")
        ),
        BilingualQuestion(
            id = 7605, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel animal produit du miel ?", listOf("Guepe", "Bourdon", "Abeille", "Frelon"), "Nature", "Les abeilles butinent le nectar des fleurs, le transforment dans leur jabot et le stockent dans les alvéoles de la ruche pour produire du miel."),
            en = LocalizedContent("Which animal produces honey?", listOf("Wasp", "Bumblebee", "Honeybee", "Hornet"), "Nature", "Honeybees collect nectar from flowers, transform it in their crop, and store it in the cells of the hive to produce honey."),
            zh = LocalizedContent("哪种动物生产蜂蜜？", listOf("黄蜂", "大黄蜂", "蜜蜂", "胡蜂"), "自然", "蜜蜂从花朵中采集花蜜，在嗉囊中转化，并储存在蜂巢的蜂室中生产蜂蜜。"),
            es = LocalizedContent("¿Qué animal produce miel?", listOf("Avispa", "Abejorro", "Abeja", "Avispón"), "Naturaleza", "Las abejas recolectan néctar de las flores, lo transforman en su buche y lo almacenan en las celdas de la colmena para producir miel.")
        ),
        BilingualQuestion(
            id = 7606, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de coeurs possede une pieuvre ?", listOf("1", "2", "3", "4"), "Nature", "Les pieuvres ont trois cœurs : deux branchiaux qui pompent le sang vers les branchies, et un systémique qui le distribue au reste du corps."),
            en = LocalizedContent("How many hearts does an octopus have?", listOf("1", "2", "3", "4"), "Nature", "Octopuses have three hearts: two branchial hearts that pump blood to the gills, and one systemic heart that distributes it to the rest of the body."),
            zh = LocalizedContent("章鱼有多少颗心脏？", listOf("1", "2", "3", "4"), "自然", "章鱼有三颗心脏：两颗鳃心将血液泵送到鳃，一颗体心将血液输送到身体其他部位。"),
            es = LocalizedContent("¿Cuántos corazones tiene un pulpo?", listOf("1", "2", "3", "4"), "Naturaleza", "Los pulpos tienen tres corazones: dos branquiales que bombean sangre a las branquias y uno sistémico que la distribuye al resto del cuerpo.")
        ),
        BilingualQuestion(
            id = 7607, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel arbre produit des glands ?", listOf("Hetre", "Chene", "Erable", "Bouleau"), "Nature", "Le chêne est l'arbre qui produit les glands, ses fruits caractéristiques qui servent de nourriture à de nombreux animaux comme les écureuils et les sangliers."),
            en = LocalizedContent("Which tree produces acorns?", listOf("Beech", "Oak", "Maple", "Birch"), "Nature", "The oak tree produces acorns, its characteristic fruits that serve as food for many animals such as squirrels and wild boars."),
            zh = LocalizedContent("哪种树结橡子？", listOf("山毛榉", "橡树", "枫树", "桦树"), "自然", "橡树结橡子，这是它的特征性果实，为许多动物如松鼠和野猪提供食物。"),
            es = LocalizedContent("¿Qué árbol produce bellotas?", listOf("Haya", "Roble", "Arce", "Abedul"), "Naturaleza", "El roble produce bellotas, sus frutos característicos que sirven de alimento a muchos animales como ardillas y jabalíes.")
        ),
        BilingualQuestion(
            id = 7608, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le serpent le plus long du monde ?", listOf("Anaconda", "Python reticule", "Cobra royal", "Mamba noir"), "Nature", "Le python réticulé peut atteindre plus de 10 mètres de long, ce qui en fait le serpent le plus long jamais mesuré, bien que l'anaconda vert soit plus lourd."),
            en = LocalizedContent("What is the longest snake in the world?", listOf("Anaconda", "Reticulated python", "King cobra", "Black mamba"), "Nature", "The reticulated python can reach over 10 meters in length, making it the longest snake ever measured, although the green anaconda is heavier."),
            zh = LocalizedContent("世界上最长的蛇是什么？", listOf("水蚺", "网纹蟒", "眼镜王蛇", "黑曼巴蛇"), "自然", "网纹蟒可以长到10米以上，是有记录以来最长的蛇，尽管绿水蚺更重。"),
            es = LocalizedContent("¿Cuál es la serpiente más larga del mundo?", listOf("Anaconda", "Pitón reticulada", "Cobra real", "Mamba negra"), "Naturaleza", "La pitón reticulada puede alcanzar más de 10 metros de longitud, lo que la convierte en la serpiente más larga jamás medida, aunque la anaconda verde es más pesada.")
        ),
        BilingualQuestion(
            id = 7609, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien d'estomacs possede une vache ?", listOf("1", "2", "3", "4"), "Nature", "Les vaches sont des ruminants, leur système digestif comporte quatre compartiments : la panse, le bonnet, le feuillet et la caillette."),
            en = LocalizedContent("How many stomachs does a cow have?", listOf("1", "2", "3", "4"), "Nature", "Cows are ruminants; their digestive system has four compartments: the rumen, reticulum, omasum, and abomasum."),
            zh = LocalizedContent("牛有几个胃？", listOf("1", "2", "3", "4"), "自然", "牛是反刍动物，它们的消化系统有四个腔室：瘤胃、网胃、瓣胃和皱胃。"),
            es = LocalizedContent("¿Cuántos estómagos tiene una vaca?", listOf("1", "2", "3", "4"), "Naturaleza", "Las vacas son rumiantes; su sistema digestivo tiene cuatro compartimentos: el rumen, el retículo, el omaso y el abomaso.")
        ),
        BilingualQuestion(
            id = 7610, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel phenomene naturel est mesure sur l'echelle de Richter ?", listOf("Ouragan", "Tornade", "Seisme", "Tsunami"), "Nature", "L'échelle de Richter quantifie l'énergie libérée par un séisme, en mesurant l'amplitude des ondes sismiques enregistrées par les sismographes."),
            en = LocalizedContent("What natural phenomenon is measured on the Richter scale?", listOf("Hurricane", "Tornado", "Earthquake", "Tsunami"), "Nature", "The Richter scale quantifies the energy released by an earthquake by measuring the amplitude of seismic waves recorded by seismographs."),
            zh = LocalizedContent("哪种自然现象用里氏震级测量？", listOf("飓风", "龙卷风", "地震", "海啸"), "自然", "里氏震级通过测量地震仪记录的地震波振幅来量化地震释放的能量。"),
            es = LocalizedContent("¿Qué fenómeno natural se mide en la escala de Richter?", listOf("Huracán", "Tornado", "Terremoto", "Tsunami"), "Naturaleza", "La escala de Richter cuantifica la energía liberada por un terremoto midiendo la amplitud de las ondas sísmicas registradas por los sismógrafos.")
        ),
        BilingualQuestion(
            id = 7611, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'oiseau le plus rapide en vol pique ?", listOf("Aigle royal", "Faucon pelerin", "Condor", "Albatros"), "Nature", "Le faucon pèlerin atteint des vitesses de plus de 300 km/h en piqué, ce qui en fait l'animal le plus rapide du monde en vol."),
            en = LocalizedContent("What is the fastest bird in a dive?", listOf("Golden eagle", "Peregrine falcon", "Condor", "Albatross"), "Nature", "The peregrine falcon reaches speeds of over 300 km/h in a dive, making it the fastest animal in the world in flight."),
            zh = LocalizedContent("哪种鸟俯冲速度最快？", listOf("金雕", "游隼", "神鹰", "信天翁"), "自然", "游隼在俯冲时速度超过300公里/小时，是世界上最快的飞行动物。"),
            es = LocalizedContent("¿Cuál es el ave más rápida en picado?", listOf("Águila real", "Halcón peregrino", "Cóndor", "Albatros"), "Naturaleza", "El halcón peregrino alcanza velocidades de más de 300 km/h en picado, lo que lo convierte en el animal más rápido del mundo en vuelo.")
        ),
        BilingualQuestion(
            id = 7612, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel type de foret se trouve pres de l'equateur ?", listOf("Boreale", "Temperee", "Tropicale", "Mediterraneenne"), "Nature", "Les forêts tropicales sont situées dans la zone équatoriale, où le climat chaud et humide favorise une végétation dense et luxuriante."),
            en = LocalizedContent("What type of forest is found near the equator?", listOf("Boreal", "Temperate", "Tropical", "Mediterranean"), "Nature", "Tropical forests are located in the equatorial zone, where the hot and humid climate promotes dense and lush vegetation."),
            zh = LocalizedContent("赤道附近有什么类型的森林？", listOf("北方森林", "温带森林", "热带森林", "地中海森林"), "自然", "热带森林位于赤道地区，炎热潮湿的气候促进了茂密的植被生长。"),
            es = LocalizedContent("¿Qué tipo de bosque se encuentra cerca del ecuador?", listOf("Boreal", "Templado", "Tropical", "Mediterráneo"), "Naturaleza", "Los bosques tropicales se encuentran en la zona ecuatorial, donde el clima cálido y húmedo favorece una vegetación densa y exuberante.")
        ),
        BilingualQuestion(
            id = 7613, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel mammifere peut voler ?", listOf("Ecureuil volant", "Chauve-souris", "Polatouche", "Colugo"), "Nature", "Les chauves-souris sont les seuls mammifères capables de vol actif, grâce à leurs ailes membraneuses soutenues par des os allongés."),
            en = LocalizedContent("Which mammal can fly?", listOf("Flying squirrel", "Bat", "Flying lemur", "Colugo"), "Nature", "Bats are the only mammals capable of true flight, thanks to their membranous wings supported by elongated bones."),
            zh = LocalizedContent("哪种哺乳动物会飞？", listOf("飞鼠", "蝙蝠", "鼯猴", "猫猴"), "自然", "蝙蝠是唯一能够真正飞行的哺乳动物，依靠由细长骨骼支撑的膜状翅膀。"),
            es = LocalizedContent("¿Qué mamífero puede volar?", listOf("Ardilla voladora", "Murciélago", "Lémur volador", "Colugo"), "Naturaleza", "Los murciélagos son los únicos mamíferos capaces de volar activamente, gracias a sus alas membranosas sostenidas por huesos alargados.")
        ),
        BilingualQuestion(
            id = 7614, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand recif corallien du monde ?", listOf("Recif de Belize", "Grande Barriere de corail", "Recif de Nouvelle-Caledonie", "Recif des Maldives"), "Nature", "La Grande Barrière de corail, située au large de l'Australie, s'étend sur plus de 2 300 kilomètres et est visible depuis l'espace."),
            en = LocalizedContent("What is the largest coral reef in the world?", listOf("Belize Barrier Reef", "Great Barrier Reef", "New Caledonia Barrier Reef", "Maldives Reef"), "Nature", "The Great Barrier Reef, located off the coast of Australia, stretches over 2,300 kilometers and is visible from space."),
            zh = LocalizedContent("世界上最大的珊瑚礁是什么？", listOf("伯利兹堡礁", "大堡礁", "新喀里多尼亚堡礁", "马尔代夫礁"), "自然", "大堡礁位于澳大利亚海岸外，绵延超过2300公里，从太空中可见。"),
            es = LocalizedContent("¿Cuál es el arrecife de coral más grande del mundo?", listOf("Barrera de coral de Belice", "Gran Barrera de Coral", "Barrera de coral de Nueva Caledonia", "Arrecife de Maldivas"), "Naturaleza", "La Gran Barrera de Coral, situada frente a la costa de Australia, se extiende más de 2.300 kilómetros y es visible desde el espacio.")
        ),
        BilingualQuestion(
            id = 7615, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal est connu pour sa capacite a regenerer ses membres ?", listOf("Lezard", "Etoile de mer", "Salamandre", "Axolotl"), "Nature", "L'axolotl, une salamandre néoténique du Mexique, possède une capacité unique de régénération complète de ses membres, de sa moelle épinière et même de parties de son cerveau."),
            en = LocalizedContent("Which animal is known for its ability to regenerate its limbs?", listOf("Lizard", "Starfish", "Salamander", "Axolotl"), "Nature", "The axolotl, a neotenic salamander from Mexico, has a unique ability to completely regenerate its limbs, spinal cord, and even parts of its brain."),
            zh = LocalizedContent("哪种动物以其再生四肢的能力而闻名？", listOf("蜥蜴", "海星", "蝾螈", "美西螈"), "自然", "美西螈是一种来自墨西哥的幼态延续蝾螈，具有完全再生四肢、脊髓甚至部分大脑的独特能力。"),
            es = LocalizedContent("¿Qué animal es conocido por su capacidad de regenerar sus extremidades?", listOf("Lagarto", "Estrella de mar", "Salamandra", "Ajolote"), "Naturaleza", "El ajolote, una salamandra neoténica de México, posee una capacidad única de regenerar completamente sus extremidades, médula espinal e incluso partes de su cerebro.")
        ),
        BilingualQuestion(
            id = 8000, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que l'entropie ?", listOf("Mesure du désordre ou de l'énergie non utilisable d'un système", "Énergie totale d'un système", "Température d'un système", "Ordre d'un cristal"), "Science", ""),
            en = LocalizedContent("What is entropy?", listOf("Measure of disorder or unusable energy of a system", "Total energy of a system", "Temperature of a system", "Order of a crystal"), "Science", ""),
            zh = LocalizedContent("什么是熵？", listOf("系统无序度或不可用能量的度量", "系统的总能量", "系统的温度", "晶体的有序度"), "科学", ""),
            es = LocalizedContent("¿Qué es la entropía?", listOf("Medida del desorden o energía no utilizable de un sistema", "Energía total de un sistema", "Temperatura de un sistema", "Orden de un cristal"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 8001, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le processus de transformation de l'énergie dans les plantes vertes ?", listOf("Photosynthèse (CO₂ + H₂O → glucose + O₂)", "Respiration cellulaire", "Fermentation", "Chimiosynthèse"), "Science", ""),
            en = LocalizedContent("What is the energy transformation process in green plants?", listOf("Photosynthesis (CO₂ + H₂O → glucose + O₂)", "Cellular respiration", "Fermentation", "Chemosynthesis"), "Science", ""),
            zh = LocalizedContent("绿色植物中的能量转化过程是什么？", listOf("光合作用（CO₂ + H₂O → 葡萄糖 + O₂）", "细胞呼吸", "发酵", "化能合成"), "科学", ""),
            es = LocalizedContent("¿Cuál es el proceso de transformación de energía en las plantas verdes?", listOf("Fotosíntesis (CO₂ + H₂O → glucosa + O₂)", "Respiración celular", "Fermentación", "Quimiosíntesis"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 8002, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'un proton ?", listOf("Particule chargée positivement dans le noyau atomique", "Electron de haute énergie", "Particule neutre du noyau", "Antiparticule de l'électron"), "Science", ""),
            en = LocalizedContent("What is a proton?", listOf("Positively charged particle in the atomic nucleus", "High-energy electron", "Neutral particle in the nucleus", "Antiparticle of the electron"), "Science", ""),
            zh = LocalizedContent("什么是质子？", listOf("原子核中带正电的粒子", "高能电子", "原子核中的中性粒子", "电子的反粒子"), "科学", ""),
            es = LocalizedContent("¿Qué es un protón?", listOf("Partícula con carga positiva en el núcleo atómico", "Electrón de alta energía", "Partícula neutra del núcleo", "Antipartícula del electrón"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 8003, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le symbole chimique du fer ?", listOf("Fe", "Fr", "Fi", "Fe₂O₃"), "Science", ""),
            en = LocalizedContent("What is the chemical symbol for iron?", listOf("Fe", "Fr", "Fi", "Fe₂O₃"), "Science", ""),
            zh = LocalizedContent("铁的化学符号是什么？", listOf("Fe", "Fr", "Fi", "Fe₂O₃"), "科学", ""),
            es = LocalizedContent("¿Cuál es el símbolo químico del hierro?", listOf("Fe", "Fr", "Fi", "Fe₂O₃"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 8004, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'est-ce que l'hybridation des orbitales atomiques ?", listOf("Mélange d'orbitales formant de nouvelles orbitales équivalentes", "Liaison entre atomes différents", "Transfert d'électrons", "Formation de liaisons ioniques"), "Science", ""),
            en = LocalizedContent("What is hybridization of atomic orbitals?", listOf("Mixing of orbitals to form new equivalent orbitals", "Bond between different atoms", "Transfer of electrons", "Formation of ionic bonds"), "Science", ""),
            zh = LocalizedContent("什么是原子轨道杂化？", listOf("轨道混合形成新的等价轨道", "不同原子之间的键合", "电子转移", "形成离子键"), "科学", ""),
            es = LocalizedContent("¿Qué es la hibridación de orbitales atómicos?", listOf("Mezcla de orbitales formando nuevos orbitales equivalentes", "Enlace entre átomos diferentes", "Transferencia de electrones", "Formación de enlaces iónicos"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 8005, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel scientifique a mis au point la première pile électrique ?", listOf("Alessandro Volta (1800)", "André-Marie Ampère", "Michael Faraday", "Georg Simon Ohm"), "Science", ""),
            en = LocalizedContent("Which scientist developed the first electric battery?", listOf("Alessandro Volta (1800)", "André-Marie Ampère", "Michael Faraday", "Georg Simon Ohm"), "Science", ""),
            zh = LocalizedContent("哪位科学家发明了第一个电池？", listOf("亚历山德罗·伏打（1800年）", "安德烈-玛丽·安培", "迈克尔·法拉第", "格奥尔格·西蒙·欧姆"), "科学", ""),
            es = LocalizedContent("¿Qué científico desarrolló la primera pila eléctrica?", listOf("Alessandro Volta (1800)", "André-Marie Ampère", "Michael Faraday", "Georg Simon Ohm"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 8006, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la corrosion ?", listOf("Dégradation d'un métal par réaction chimique avec l'environnement", "Usure mécanique", "Pollution du métal", "Oxydation superficielle uniquement"), "Science", ""),
            en = LocalizedContent("What is corrosion?", listOf("Degradation of a metal by chemical reaction with the environment", "Mechanical wear", "Pollution of the metal", "Superficial oxidation only"), "Science", ""),
            zh = LocalizedContent("什么是腐蚀？", listOf("金属与环境发生化学反应而降解", "机械磨损", "金属污染", "仅表面氧化"), "科学", ""),
            es = LocalizedContent("¿Qué es la corrosión?", listOf("Degradación de un metal por reacción química con el entorno", "Desgaste mecánico", "Contaminación del metal", "Oxidación superficial únicamente"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 8007, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le rôle des mitochondries dans la cellule ?", listOf("Produire de l'ATP (énergie cellulaire)", "Synthétiser les protéines", "Stocker l'ADN", "Digérer les déchets"), "Science", ""),
            en = LocalizedContent("What is the role of mitochondria in the cell?", listOf("Produce ATP (cellular energy)", "Synthesize proteins", "Store DNA", "Digest waste"), "Science", ""),
            zh = LocalizedContent("线粒体在细胞中的作用是什么？", listOf("产生ATP（细胞能量）", "合成蛋白质", "储存DNA", "消化废物"), "科学", ""),
            es = LocalizedContent("¿Cuál es el papel de las mitocondrias en la célula?", listOf("Producir ATP (energía celular)", "Sintetizar proteínas", "Almacenar ADN", "Digestión de desechos"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 8008, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la mécanique des fluides ?", listOf("Étude du comportement des fluides (liquides et gaz)", "Physique des solides déformables", "Hydraulique uniquement", "Aérodynamique uniquement"), "Science", ""),
            en = LocalizedContent("What is fluid mechanics?", listOf("Study of the behavior of fluids (liquids and gases)", "Physics of deformable solids", "Hydraulics only", "Aerodynamics only"), "Science", ""),
            zh = LocalizedContent("什么是流体力学？", listOf("研究流体（液体和气体）行为的学科", "可变形固体的物理学", "仅水力学", "仅空气动力学"), "科学", ""),
            es = LocalizedContent("¿Qué es la mecánica de fluidos?", listOf("Estudio del comportamiento de los fluidos (líquidos y gases)", "Física de sólidos deformables", "Hidráulica únicamente", "Aerodinámica únicamente"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 8009, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'élément chimique de numéro atomique 1 ?", listOf("Hydrogène (H)", "Hélium (He)", "Lithium (Li)", "Bore (B)"), "Science", ""),
            en = LocalizedContent("What is the chemical element with atomic number 1?", listOf("Hydrogen (H)", "Helium (He)", "Lithium (Li)", "Boron (B)"), "Science", ""),
            zh = LocalizedContent("原子序数为1的化学元素是什么？", listOf("氢（H）", "氦（He）", "锂（Li）", "硼（B）"), "科学", ""),
            es = LocalizedContent("¿Cuál es el elemento químico de número atómico 1?", listOf("Hidrógeno (H)", "Helio (He)", "Litio (Li)", "Boro (B)"), "Ciencia", "")
        ),
    )

    private fun part2(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 8010, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'une onde sonore ?", listOf("Perturbation mécanique se propageant dans un milieu", "Onde électromagnétique", "Vibration électrique", "Flux de photons sonores"), "Science", ""),
            en = LocalizedContent("What is a sound wave?", listOf("Mechanical disturbance propagating through a medium", "Electromagnetic wave", "Electrical vibration", "Flow of sound photons"), "Science", ""),
            zh = LocalizedContent("什么是声波？", listOf("在介质中传播的机械扰动", "电磁波", "电振动", "声子流"), "科学", ""),
            es = LocalizedContent("¿Qué es una onda sonora?", listOf("Perturbación mecánica que se propaga en un medio", "Onda electromagnética", "Vibración eléctrica", "Flujo de fotones sonoros"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 8011, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le point de fusion du plomb ?", listOf("327,5°C", "1064°C (or)", "660°C (aluminium)", "232°C (étain)"), "Science", ""),
            en = LocalizedContent("What is the melting point of lead?", listOf("327.5°C", "1064°C (gold)", "660°C (aluminum)", "232°C (tin)"), "Science", ""),
            zh = LocalizedContent("铅的熔点是多少？", listOf("327.5°C", "1064°C（金）", "660°C（铝）", "232°C（锡）"), "科学", ""),
            es = LocalizedContent("¿Cuál es el punto de fusión del plomo?", listOf("327,5°C", "1064°C (oro)", "660°C (aluminio)", "232°C (estaño)"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 8012, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la spectrométrie UV-Visible mesure ?", listOf("Absorption de lumière par les molécules", "Masse des ions", "Radioactivité", "Température de décomposition"), "Science", ""),
            en = LocalizedContent("What does UV-Visible spectrometry measure?", listOf("Absorption of light by molecules", "Mass of ions", "Radioactivity", "Decomposition temperature"), "Science", ""),
            zh = LocalizedContent("紫外-可见光谱法测量什么？", listOf("分子对光的吸收", "离子的质量", "放射性", "分解温度"), "科学", ""),
            es = LocalizedContent("¿Qué mide la espectrometría UV-Visible?", listOf("Absorción de luz por las moléculas", "Masa de los iones", "Radiactividad", "Temperatura de descomposición"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 8013, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le symbole chimique du sodium ?", listOf("Na", "So", "Sd", "Na₂"), "Science", ""),
            en = LocalizedContent("What is the chemical symbol for sodium?", listOf("Na", "So", "Sd", "Na₂"), "Science", ""),
            zh = LocalizedContent("钠的化学符号是什么？", listOf("Na", "So", "Sd", "Na₂"), "科学", ""),
            es = LocalizedContent("¿Cuál es el símbolo químico del sodio?", listOf("Na", "So", "Sd", "Na₂"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 8014, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la résonance en chimie organique ?", listOf("Délocalisation des électrons dans une molécule", "Vibration des liaisons", "Rotation des molécules", "Absorption de chaleur"), "Science", ""),
            en = LocalizedContent("What is resonance in organic chemistry?", listOf("Delocalization of electrons in a molecule", "Vibration of bonds", "Rotation of molecules", "Absorption of heat"), "Science", ""),
            zh = LocalizedContent("有机化学中的共振是什么？", listOf("分子中电子的离域", "键的振动", "分子的旋转", "热吸收"), "科学", ""),
            es = LocalizedContent("¿Qué es la resonancia en química orgánica?", listOf("Deslocalización de electrones en una molécula", "Vibración de los enlaces", "Rotación de las moléculas", "Absorción de calor"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 8015, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'un colloïde ?", listOf("Mélange de particules en suspension dans un milieu (ex: lait)", "Solution homogène", "Composé ionique", "Émulsion huile-eau"), "Science", ""),
            en = LocalizedContent("What is a colloid?", listOf("Mixture of particles suspended in a medium (e.g., milk)", "Homogeneous solution", "Ionic compound", "Oil-water emulsion"), "Science", ""),
            zh = LocalizedContent("什么是胶体？", listOf("悬浮在介质中的颗粒混合物（例如牛奶）", "均相溶液", "离子化合物", "油水乳液"), "科学", ""),
            es = LocalizedContent("¿Qué es un coloide?", listOf("Mezcla de partículas suspendidas en un medio (ej. leche)", "Solución homogénea", "Compuesto iónico", "Emulsión aceite-agua"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 8016, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom du processus par lequel un solide se transforme en gaz sans passer par liquide ?", listOf("Sublimation", "Vaporisation", "Fusion", "Condensation"), "Science", ""),
            en = LocalizedContent("What is the name of the process by which a solid turns into a gas without passing through the liquid phase?", listOf("Sublimation", "Vaporization", "Melting", "Condensation"), "Science", ""),
            zh = LocalizedContent("固体不经过液态直接变成气体的过程叫什么？", listOf("升华", "汽化", "熔化", "冷凝"), "科学", ""),
            es = LocalizedContent("¿Cómo se llama el proceso por el cual un sólido se transforma en gas sin pasar por líquido?", listOf("Sublimación", "Vaporización", "Fusión", "Condensación"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 8017, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que l'énergie de liaison nucléaire ?", listOf("Énergie maintenant les nucléons ensemble dans le noyau", "Énergie des électrons", "Énergie des liaisons chimiques", "Énergie de ionisation"), "Science", ""),
            en = LocalizedContent("What is nuclear binding energy?", listOf("Energy that holds nucleons together in the nucleus", "Energy of electrons", "Energy of chemical bonds", "Ionization energy"), "Science", ""),
            zh = LocalizedContent("什么是核结合能？", listOf("将核子保持在原子核内的能量", "电子的能量", "化学键的能量", "电离能"), "科学", ""),
            es = LocalizedContent("¿Qué es la energía de enlace nuclear?", listOf("Energía que mantiene unidos los nucleones en el núcleo", "Energía de los electrones", "Energía de los enlaces químicos", "Energía de ionización"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 8018, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le processus de production d'énergie du Soleil ?", listOf("Fusion nucléaire de l'hydrogène en hélium", "Fission de l'uranium", "Réaction chimique de combustion", "Désintégration radioactive"), "Science", ""),
            en = LocalizedContent("What is the process of energy production in the Sun?", listOf("Nuclear fusion of hydrogen into helium", "Fission of uranium", "Chemical combustion reaction", "Radioactive decay"), "Science", ""),
            zh = LocalizedContent("太阳产生能量的过程是什么？", listOf("氢聚变成氦的核聚变", "铀的裂变", "化学燃烧反应", "放射性衰变"), "科学", ""),
            es = LocalizedContent("¿Cuál es el proceso de producción de energía del Sol?", listOf("Fusión nuclear de hidrógeno en helio", "Fisión del uranio", "Reacción química de combustión", "Desintegración radiactiva"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 8019, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'est-ce que l'effet Compton ?", listOf("Diffusion de photons X sur les électrons avec changement de longueur d'onde", "Émission d'électrons par effet photoélectrique", "Diffraction de la lumière", "Interférence des ondes"), "Science", ""),
            en = LocalizedContent("What is the Compton effect?", listOf("Scattering of X-ray photons by electrons with a change in wavelength", "Emission of electrons by the photoelectric effect", "Diffraction of light", "Interference of waves"), "Science", ""),
            zh = LocalizedContent("什么是康普顿效应？", listOf("X射线光子被电子散射并改变波长", "光电效应发射电子", "光的衍射", "波的干涉"), "科学", ""),
            es = LocalizedContent("¿Qué es el efecto Compton?", listOf("Dispersión de fotones de rayos X por electrones con cambio de longitud de onda", "Emisión de electrones por efecto fotoeléctrico", "Difracción de la luz", "Interferencia de ondas"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 8020, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a construit le canal de Panama ?", listOf("États-Unis (après échec français de Ferdinand de Lesseps)", "France", "Colombie", "Panama seul"), "Histoire", ""),
            en = LocalizedContent("Which country built the Panama Canal?", listOf("United States (after French failure by Ferdinand de Lesseps)", "France", "Colombia", "Panama alone"), "History", ""),
            zh = LocalizedContent("哪个国家建造了巴拿马运河？", listOf("美国（在斐迪南·德·雷赛布领导的法国失败之后）", "法国", "哥伦比亚", "巴拿马独自"), "历史", ""),
            es = LocalizedContent("¿Qué país construyó el Canal de Panamá?", listOf("Estados Unidos (tras el fracaso francés de Ferdinand de Lesseps)", "Francia", "Colombia", "Panamá solo"), "Historia", "")
        ),
        BilingualQuestion(
            id = 8021, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel traité a réglé la situation de l'Europe après les guerres napoléoniennes ?", listOf("Congrès de Vienne (1815)", "Traité de Paris (1815)", "Traité de Fontainebleau", "Acte final de Vienne"), "Histoire", ""),
            en = LocalizedContent("Which treaty settled the situation in Europe after the Napoleonic Wars?", listOf("Congress of Vienna (1815)", "Treaty of Paris (1815)", "Treaty of Fontainebleau", "Final Act of Vienna"), "History", ""),
            zh = LocalizedContent("哪项条约解决了拿破仑战争后欧洲的局势？", listOf("维也纳会议（1815年）", "巴黎条约（1815年）", "枫丹白露条约", "维也纳最终议定书"), "历史", ""),
            es = LocalizedContent("¿Qué tratado resolvió la situación de Europa después de las guerras napoleónicas?", listOf("Congreso de Viena (1815)", "Tratado de París (1815)", "Tratado de Fontainebleau", "Acta Final de Viena"), "Historia", "")
        ),
        BilingualQuestion(
            id = 8022, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a construit le Colisée à Rome ?", listOf("Vespasien et Titus (Flaviens)", "Auguste", "Jules César", "Néron"), "Histoire", ""),
            en = LocalizedContent("Who built the Colosseum in Rome?", listOf("Vespasian and Titus (Flavians)", "Augustus", "Julius Caesar", "Nero"), "History", ""),
            zh = LocalizedContent("谁建造了罗马斗兽场？", listOf("韦斯巴芗和提图斯（弗拉维王朝）", "奥古斯都", "尤利乌斯·凯撒", "尼禄"), "历史", ""),
            es = LocalizedContent("¿Quién construyó el Coliseo en Roma?", listOf("Vespasiano y Tito (Flavios)", "Augusto", "Julio César", "Nerón"), "Historia", "")
        ),
        BilingualQuestion(
            id = 8023, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle organisation terroriste a perpétré les attentats du 11 septembre 2001 ?", listOf("Al-Qaïda", "Hamas", "Hezbollah", "Daesh (ISIS)"), "Histoire", ""),
            en = LocalizedContent("Which terrorist organization perpetrated the September 11, 2001 attacks?", listOf("Al-Qaeda", "Hamas", "Hezbollah", "Daesh (ISIS)"), "History", ""),
            zh = LocalizedContent("哪个恐怖组织实施了2001年9月11日的袭击？", listOf("基地组织", "哈马斯", "真主党", "达伊沙（ISIS）"), "历史", ""),
            es = LocalizedContent("¿Qué organización terrorista perpetró los atentados del 11 de septiembre de 2001?", listOf("Al-Qaeda", "Hamás", "Hezbolá", "Daesh (ISIS)"), "Historia", "")
        ),
        BilingualQuestion(
            id = 8024, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était le premier Premier ministre d'Israël ?", listOf("David Ben Gourion", "Golda Meir", "Shimon Peres", "Levi Eshkol"), "Histoire", ""),
            en = LocalizedContent("Who was the first Prime Minister of Israel?", listOf("David Ben-Gurion", "Golda Meir", "Shimon Peres", "Levi Eshkol"), "History", ""),
            zh = LocalizedContent("谁是以色列的第一任总理？", listOf("大卫·本-古里安", "果尔达·梅厄", "希蒙·佩雷斯", "列维·艾希科尔"), "历史", ""),
            es = LocalizedContent("¿Quién fue el primer Primer Ministro de Israel?", listOf("David Ben-Gurión", "Golda Meir", "Shimon Peres", "Levi Eshkol"), "Historia", "")
        ),
        BilingualQuestion(
            id = 8025, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Martin Luther a-t-il affiché ses 95 thèses ?", listOf("1517", "1521", "1511", "1530"), "Histoire", ""),
            en = LocalizedContent("In which year did Martin Luther post his 95 Theses?", listOf("1517", "1521", "1511", "1530"), "History", ""),
            zh = LocalizedContent("马丁·路德在哪一年张贴了他的九十五条论纲？", listOf("1517年", "1521年", "1511年", "1530年"), "历史", ""),
            es = LocalizedContent("¿En qué año Martín Lutero publicó sus 95 tesis?", listOf("1517", "1521", "1511", "1530"), "Historia", "")
        ),
        BilingualQuestion(
            id = 8026, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a déclenché la Révolution française ?", listOf("Convocation des États généraux et crise des finances", "La prise de la Bastille directement", "La mort de Louis XVI", "La famine de 1789"), "Histoire", ""),
            en = LocalizedContent("Which event triggered the French Revolution?", listOf("Convocation of the Estates General and financial crisis", "The storming of the Bastille directly", "The death of Louis XVI", "The famine of 1789"), "History", ""),
            zh = LocalizedContent("哪个事件引发了法国大革命？", listOf("三级会议的召开和财政危机", "直接攻占巴士底狱", "路易十六之死", "1789年的饥荒"), "历史", ""),
            es = LocalizedContent("¿Qué evento desencadenó la Revolución Francesa?", listOf("Convocatoria de los Estados Generales y crisis financiera", "La toma de la Bastilla directamente", "La muerte de Luis XVI", "La hambruna de 1789"), "Historia", "")
        ),
        BilingualQuestion(
            id = 8027, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui était l'impératrice de Chine jusqu'en 1908 ?", listOf("Cixi (Ts'eu-hi)", "Wu Zetian", "Qianlong", "Puyi"), "Histoire", ""),
            en = LocalizedContent("Who was the Empress of China until 1908?", listOf("Cixi (Tzu-hsi)", "Wu Zetian", "Qianlong", "Puyi"), "History", ""),
            zh = LocalizedContent("谁是中国直到1908年的女皇？", listOf("慈禧（慈禧太后）", "武则天", "乾隆", "溥仪"), "历史", ""),
            es = LocalizedContent("¿Quién fue la emperatriz de China hasta 1908?", listOf("Cixí (Tzu-hsi)", "Wu Zetian", "Qianlong", "Puyi"), "Historia", "")
        ),
        BilingualQuestion(
            id = 8028, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle bataille de 1805 a donné à Napoléon sa plus grande victoire ?", listOf("Austerlitz", "Iéna", "Wagram", "Borodino"), "Histoire", ""),
            en = LocalizedContent("Which battle in 1805 gave Napoleon his greatest victory?", listOf("Austerlitz", "Jena", "Wagram", "Borodino"), "History", ""),
            zh = LocalizedContent("1805年的哪场战役给了拿破仑最伟大的胜利？", listOf("奥斯特里茨战役", "耶拿战役", "瓦格拉姆战役", "博罗季诺战役"), "历史", ""),
            es = LocalizedContent("¿Qué batalla de 1805 le dio a Napoleón su mayor victoria?", listOf("Austerlitz", "Jena", "Wagram", "Borodino"), "Historia", "")
        ),
        BilingualQuestion(
            id = 8029, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année a commencé la guerre de Corée ?", listOf("1950", "1948", "1952", "1945"), "Histoire", ""),
            en = LocalizedContent("In which year did the Korean War begin?", listOf("1950", "1948", "1952", "1945"), "History", ""),
            zh = LocalizedContent("朝鲜战争在哪一年开始？", listOf("1950年", "1948年", "1952年", "1945年"), "历史", ""),
            es = LocalizedContent("¿En qué año comenzó la Guerra de Corea?", listOf("1950", "1948", "1952", "1945"), "Historia", "")
        ),
        BilingualQuestion(
            id = 8030, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel roi de France est mort lors de la Révolution française ?", listOf("Louis XVI (guillotiné en 1793)", "Louis XV", "Louis XVIII", "Louis XIV"), "Histoire", ""),
            en = LocalizedContent("Which king of France died during the French Revolution?", listOf("Louis XVI (guillotined in 1793)", "Louis XV", "Louis XVIII", "Louis XIV"), "History", ""),
            zh = LocalizedContent("哪位法国国王在法国大革命期间去世？", listOf("路易十六（1793年被处决）", "路易十五", "路易十八", "路易十四"), "历史", ""),
            es = LocalizedContent("¿Qué rey de Francia murió durante la Revolución Francesa?", listOf("Luis XVI (guillotinado en 1793)", "Luis XV", "Luis XVIII", "Luis XIV"), "Historia", "")
        ),
        BilingualQuestion(
            id = 8031, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a fondé la ville d'Alexandrie en Égypte ?", listOf("Alexandre le Grand (331 av. J.-C.)", "Ptolémée Ier", "Cléopâtre", "César"), "Histoire", ""),
            en = LocalizedContent("Who founded the city of Alexandria in Egypt?", listOf("Alexander the Great (331 BC)", "Ptolemy I", "Cleopatra", "Caesar"), "History", ""),
            zh = LocalizedContent("谁在埃及建立了亚历山大城？", listOf("亚历山大大帝（公元前331年）", "托勒密一世", "克利奥帕特拉", "凯撒"), "历史", ""),
            es = LocalizedContent("¿Quién fundó la ciudad de Alejandría en Egipto?", listOf("Alejandro Magno (331 a.C.)", "Ptolomeo I", "Cleopatra", "César"), "Historia", "")
        ),
        BilingualQuestion(
            id = 8032, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel pays a été le premier à adopter le suffrage universel masculin ?", listOf("France (1792) ou Suisse (1291 pour certains cantons)", "États-Unis", "Royaume-Uni", "Australie"), "Histoire", ""),
            en = LocalizedContent("Which country was the first to adopt universal male suffrage?", listOf("France (1792) or Switzerland (1291 for some cantons)", "United States", "United Kingdom", "Australia"), "History", ""),
            zh = LocalizedContent("哪个国家第一个实行男性普选？", listOf("法国（1792年）或瑞士（某些州1291年）", "美国", "英国", "澳大利亚"), "历史", ""),
            es = LocalizedContent("¿Qué país fue el primero en adoptar el sufragio universal masculino?", listOf("Francia (1792) o Suiza (1291 para algunos cantones)", "Estados Unidos", "Reino Unido", "Australia"), "Historia", "")
        ),
        BilingualQuestion(
            id = 8033, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus jeune joueur à avoir remporté le Ballon d'Or?", listOf("Pelé", "Diego Maradona", "George Weah", "Ronaldinho"), "Sport", "George Weah a remporté le Ballon d'Or en 1995 à l'âge de 29 ans, mais il reste le plus jeune joueur africain à avoir obtenu cette distinction, ainsi que le premier non-Européen à la gagner."),
            en = LocalizedContent("Who is the youngest player to have won the Ballon d'Or?", listOf("Pelé", "Diego Maradona", "George Weah", "Ronaldinho"), "Sports", "George Weah won the Ballon d'Or in 1995 at the age of 29, but he remains the youngest African player to have obtained this distinction, as well as the first non-European to win it."),
            zh = LocalizedContent("谁是最年轻的金球奖得主？", listOf("贝利", "迭戈·马拉多纳", "乔治·维阿", "罗纳尔迪尼奥"), "体育", "乔治·维阿在1995年以29岁的年龄赢得金球奖，但他仍然是最年轻的非洲获奖者，也是第一位非欧洲获奖者。"),
            es = LocalizedContent("¿Quién es el jugador más joven en haber ganado el Balón de Oro?", listOf("Pelé", "Diego Maradona", "George Weah", "Ronaldinho"), "Deportes", "George Weah ganó el Balón de Oro en 1995 a los 29 años, pero sigue siendo el jugador africano más joven en obtener esta distinción, así como el primer no europeo en ganarlo.")
        ),
        BilingualQuestion(
            id = 8034, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui était le chef de l'État français pendant l'occupation (régime de Vichy) ?", listOf("Philippe Pétain", "Pierre Laval", "Charles de Gaulle (en exil)", "Édouard Daladier"), "Histoire", ""),
            en = LocalizedContent("Who was the head of the French state during the occupation (Vichy regime)?", listOf("Philippe Pétain", "Pierre Laval", "Charles de Gaulle (in exile)", "Édouard Daladier"), "History", ""),
            zh = LocalizedContent("占领期间（维希政权）谁是法国国家元首？", listOf("菲利普·贝当", "皮埃尔·赖伐尔", "夏尔·戴高乐（流亡中）", "爱德华·达拉第"), "历史", ""),
            es = LocalizedContent("¿Quién fue el jefe del Estado francés durante la ocupación (régimen de Vichy)?", listOf("Philippe Pétain", "Pierre Laval", "Charles de Gaulle (en el exilio)", "Édouard Daladier"), "Historia", "")
        ),
        BilingualQuestion(
            id = 8035, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel traité a créé la SDN (Société des Nations) ?", listOf("Traité de Versailles (1919)", "Traité de Paris (1920)", "Pacte Kellogg-Briand (1928)", "Traité de Locarno (1925)"), "Histoire", ""),
            en = LocalizedContent("Which treaty created the League of Nations?", listOf("Treaty of Versailles (1919)", "Treaty of Paris (1920)", "Kellogg-Briand Pact (1928)", "Treaty of Locarno (1925)"), "History", ""),
            zh = LocalizedContent("哪个条约创建了国际联盟？", listOf("凡尔赛条约（1919年）", "巴黎条约（1920年）", "凯洛格-白里安公约（1928年）", "洛迦诺条约（1925年）"), "历史", ""),
            es = LocalizedContent("¿Qué tratado creó la Sociedad de Naciones?", listOf("Tratado de Versalles (1919)", "Tratado de París (1920)", "Pacto Kellogg-Briand (1928)", "Tratado de Locarno (1925)"), "Historia", "")
        ),
        BilingualQuestion(
            id = 8036, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom de la guerre civile américaine entre Nord et Sud ?", listOf("Guerre de Sécession (1861-1865)", "Guerre d'Indépendance", "Guerre Anglo-Américaine", "Guerre Mexicano-Américaine"), "Histoire", ""),
            en = LocalizedContent("What is the name of the American civil war between North and South?", listOf("American Civil War (1861-1865)", "War of Independence", "Anglo-American War", "Mexican-American War"), "History", ""),
            zh = LocalizedContent("美国南北之间的内战叫什么？", listOf("美国内战（1861-1865年）", "独立战争", "英美战争", "美墨战争"), "历史", ""),
            es = LocalizedContent("¿Cuál es el nombre de la guerra civil estadounidense entre el Norte y el Sur?", listOf("Guerra de Secesión (1861-1865)", "Guerra de Independencia", "Guerra Anglo-Americana", "Guerra Mexicano-Americana"), "Historia", "")
        ),
        BilingualQuestion(
            id = 8037, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui était le dernier Pharaon de l'Égypte ancienne ?", listOf("Cléopâtre VII", "Ramsès XI", "Ptolémée XV (Césarion)", "Nectanebo II"), "Histoire", ""),
            en = LocalizedContent("Who was the last Pharaoh of ancient Egypt?", listOf("Cleopatra VII", "Ramesses XI", "Ptolemy XV (Caesarion)", "Nectanebo II"), "History", ""),
            zh = LocalizedContent("古埃及最后一位法老是谁？", listOf("克利奥帕特拉七世", "拉美西斯十一世", "托勒密十五世（凯撒里昂）", "内克塔内布二世"), "历史", ""),
            es = LocalizedContent("¿Quién fue el último faraón del antiguo Egipto?", listOf("Cleopatra VII", "Ramsés XI", "Ptolomeo XV (Cesarión)", "Nectanebo II"), "Historia", "")
        ),
        BilingualQuestion(
            id = 8038, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année l'Inde a-t-elle obtenu son indépendance ?", listOf("1947", "1945", "1950", "1948"), "Histoire", ""),
            en = LocalizedContent("In which year did India gain its independence?", listOf("1947", "1945", "1950", "1948"), "History", ""),
            zh = LocalizedContent("印度在哪一年获得独立？", listOf("1947年", "1945年", "1950年", "1948年"), "历史", ""),
            es = LocalizedContent("¿En qué año obtuvo la India su independencia?", listOf("1947", "1945", "1950", "1948"), "Historia", "")
        ),
        BilingualQuestion(
            id = 8039, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle civilisation amérindienne a construit Chichen Itza ?", listOf("Les Mayas", "Les Aztèques", "Les Toltèques", "Les Olmèques"), "Histoire", ""),
            en = LocalizedContent("Which Native American civilization built Chichen Itza?", listOf("The Maya", "The Aztecs", "The Toltecs", "The Olmecs"), "History", ""),
            zh = LocalizedContent("哪个美洲原住民文明建造了奇琴伊察？", listOf("玛雅人", "阿兹特克人", "托尔特克人", "奥尔梅克人"), "历史", ""),
            es = LocalizedContent("¿Qué civilización amerindia construyó Chichén Itzá?", listOf("Los mayas", "Los aztecas", "Los toltecas", "Los olmecas"), "Historia", "")
        ),
        BilingualQuestion(
            id = 8040, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de fois le Barça a-t-il remporté la Ligue des Champions?", listOf("4", "5", "6", "7"), "Sport", "Le FC Barcelone a remporté la Ligue des Champions à six reprises, en 1992, 2006, 2009, 2011, 2015 et 2023."),
            en = LocalizedContent("How many times has Barça won the Champions League?", listOf("4", "5", "6", "7"), "Sports", "FC Barcelona has won the Champions League six times, in 1992, 2006, 2009, 2011, 2015 and 2023."),
            zh = LocalizedContent("巴塞罗那赢得了多少次欧冠冠军？", listOf("4", "5", "6", "7"), "体育", "巴塞罗那足球俱乐部共六次赢得欧冠冠军，分别在1992年、2006年、2009年、2011年、2015年和2023年。"),
            es = LocalizedContent("¿Cuántas veces ha ganado el Barça la Liga de Campeones?", listOf("4", "5", "6", "7"), "Deportes", "El FC Barcelona ha ganado la Liga de Campeones en seis ocasiones, en 1992, 2006, 2009, 2011, 2015 y 2023.")
        ),
        BilingualQuestion(
            id = 8041, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale de la Corée du Sud ?", listOf("Séoul", "Busan", "Incheon", "Daejeon"), "Géographie", ""),
            en = LocalizedContent("What is the capital of South Korea?", listOf("Seoul", "Busan", "Incheon", "Daejeon"), "Geography", ""),
            zh = LocalizedContent("韩国的首都是什么？", listOf("首尔", "釜山", "仁川", "大田"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Corea del Sur?", listOf("Seúl", "Busan", "Incheon", "Daejeon"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 8042, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fleuve traverse l'Allemagne et se jette dans la mer du Nord ?", listOf("Le Rhin", "L'Elbe", "La Weser", "L'Oder"), "Géographie", ""),
            en = LocalizedContent("Which river flows through Germany and empties into the North Sea?", listOf("The Rhine", "The Elbe", "The Weser", "The Oder"), "Geography", ""),
            zh = LocalizedContent("哪条河流经德国并注入北海？", listOf("莱茵河", "易北河", "威悉河", "奥得河"), "地理", ""),
            es = LocalizedContent("¿Qué río atraviesa Alemania y desemboca en el mar del Norte?", listOf("El Rin", "El Elba", "El Weser", "El Óder"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 8043, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays se trouvent les Chutes Victoria ?", listOf("À cheval sur Zambie et Zimbabwe", "Seulement au Zimbabwe", "Seulement en Zambie", "En Afrique du Sud"), "Géographie", ""),
            en = LocalizedContent("In which country are the Victoria Falls located?", listOf("Straddling Zambia and Zimbabwe", "Only in Zimbabwe", "Only in Zambia", "In South Africa"), "Geography", ""),
            zh = LocalizedContent("维多利亚瀑布位于哪个国家？", listOf("横跨赞比亚和津巴布韦", "仅在津巴布韦", "仅在赞比亚", "在南非"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentran las Cataratas Victoria?", listOf("A caballo entre Zambia y Zimbabue", "Solo en Zimbabue", "Solo en Zambia", "En Sudáfrica"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 8044, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la plus grande île de la Méditerranée ?", listOf("Sicile", "Sardaigne", "Chypre", "Crète"), "Géographie", ""),
            en = LocalizedContent("What is the largest island in the Mediterranean?", listOf("Sicily", "Sardinia", "Cyprus", "Crete"), "Geography", ""),
            zh = LocalizedContent("地中海最大的岛屿是哪个？", listOf("西西里岛", "撒丁岛", "塞浦路斯", "克里特岛"), "地理", ""),
            es = LocalizedContent("¿Cuál es la isla más grande del Mediterráneo?", listOf("Sicilia", "Cerdeña", "Chipre", "Creta"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 8045, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays est entouré seulement par le Mozambique ?", listOf("Eswatini (Swaziland)", "Lesotho", "Burundi", "Rwanda"), "Géographie", ""),
            en = LocalizedContent("Which country is surrounded only by Mozambique?", listOf("Eswatini (Swaziland)", "Lesotho", "Burundi", "Rwanda"), "Geography", ""),
            zh = LocalizedContent("哪个国家只被莫桑比克包围？", listOf("斯威士兰", "莱索托", "布隆迪", "卢旺达"), "地理", ""),
            es = LocalizedContent("¿Qué país está rodeado solo por Mozambique?", listOf("Esuatini (Suazilandia)", "Lesoto", "Burundi", "Ruanda"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 8046, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de victoires consécutives en Premier League?", listOf("18", "20", "22", "25"), "Sport", "Le record de 20 victoires consécutives en Premier League a été établi par Manchester City entre février et décembre 2017, sous la direction de Pep Guardiola."),
            en = LocalizedContent("What is the record for consecutive wins in the Premier League?", listOf("18", "20", "22", "25"), "Sports", "The record of 20 consecutive wins in the Premier League was set by Manchester City between February and December 2017, under the management of Pep Guardiola."),
            zh = LocalizedContent("英超联赛连胜纪录是多少场？", listOf("18", "20", "22", "25"), "体育", "英超联赛20连胜的纪录由曼城在2017年2月至12月期间创造，由佩普·瓜迪奥拉执教。"),
            es = LocalizedContent("¿Cuál es el récord de victorias consecutivas en la Premier League?", listOf("18", "20", "22", "25"), "Deportes", "El récord de 20 victorias consecutivas en la Premier League fue establecido por el Manchester City entre febrero y diciembre de 2017, bajo la dirección de Pep Guardiola.")
        ),
        BilingualQuestion(
            id = 8047, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale du Kenya ?", listOf("Nairobi", "Mombasa", "Kisumu", "Nakuru"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Kenya?", listOf("Nairobi", "Mombasa", "Kisumu", "Nakuru"), "Geography", ""),
            zh = LocalizedContent("肯尼亚的首都是什么？", listOf("内罗毕", "蒙巴萨", "基苏木", "纳库鲁"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Kenia?", listOf("Nairobi", "Mombasa", "Kisumu", "Nakuru"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 8048, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays est surnommé 'la perle de l'Afrique' ?", listOf("Ouganda", "Rwanda", "Kenya", "Tanzanie"), "Géographie", ""),
            en = LocalizedContent("Which country is nicknamed 'the pearl of Africa'?", listOf("Uganda", "Rwanda", "Kenya", "Tanzania"), "Geography", ""),
            zh = LocalizedContent("哪个国家被称为“非洲明珠”？", listOf("乌干达", "卢旺达", "肯尼亚", "坦桑尼亚"), "地理", ""),
            es = LocalizedContent("¿Qué país es apodado 'la perla de África'?", listOf("Uganda", "Ruanda", "Kenia", "Tanzania"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 8049, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle chaîne de montagnes sépare l'Inde du Tibet ?", listOf("L'Himalaya", "Le Karakoram", "Hindu Kush", "Le Pamir"), "Géographie", ""),
            en = LocalizedContent("Which mountain range separates India from Tibet?", listOf("The Himalayas", "The Karakoram", "Hindu Kush", "The Pamirs"), "Geography", ""),
            zh = LocalizedContent("哪条山脉将印度与西藏分隔开？", listOf("喜马拉雅山脉", "喀喇昆仑山脉", "兴都库什山脉", "帕米尔高原"), "地理", ""),
            es = LocalizedContent("¿Qué cordillera separa la India del Tíbet?", listOf("El Himalaya", "El Karakórum", "Hindu Kush", "El Pamir"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 8050, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve la ville de Dubaï ?", listOf("Émirats arabes unis", "Qatar", "Koweït", "Bahreïn"), "Géographie", ""),
            en = LocalizedContent("In which country is the city of Dubai located?", listOf("United Arab Emirates", "Qatar", "Kuwait", "Bahrain"), "Geography", ""),
            zh = LocalizedContent("迪拜市位于哪个国家？", listOf("阿拉伯联合酋长国", "卡塔尔", "科威特", "巴林"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra la ciudad de Dubái?", listOf("Emiratos Árabes Unidos", "Catar", "Kuwait", "Baréin"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 8051, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand pays d'Amérique centrale ?", listOf("Nicaragua", "Guatemala", "Honduras", "Costa Rica"), "Géographie", ""),
            en = LocalizedContent("What is the largest country in Central America?", listOf("Nicaragua", "Guatemala", "Honduras", "Costa Rica"), "Geography", ""),
            zh = LocalizedContent("中美洲最大的国家是哪个？", listOf("尼加拉瓜", "危地马拉", "洪都拉斯", "哥斯达黎加"), "地理", ""),
            es = LocalizedContent("¿Cuál es el país más grande de América Central?", listOf("Nicaragua", "Guatemala", "Honduras", "Costa Rica"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 8052, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel océan se trouvent les Îles Galápagos ?", listOf("Océan Pacifique", "Océan Atlantique", "Mer des Caraïbes", "Océan Indien"), "Géographie", ""),
            en = LocalizedContent("In which ocean are the Galápagos Islands located?", listOf("Pacific Ocean", "Atlantic Ocean", "Caribbean Sea", "Indian Ocean"), "Geography", ""),
            zh = LocalizedContent("加拉帕戈斯群岛位于哪个大洋？", listOf("太平洋", "大西洋", "加勒比海", "印度洋"), "地理", ""),
            es = LocalizedContent("¿En qué océano se encuentran las Islas Galápagos?", listOf("Océano Pacífico", "Océano Atlántico", "Mar Caribe", "Océano Índico"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 8053, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle ville est la capitale de la Pologne ?", listOf("Varsovie", "Cracovie", "Gdansk", "Wroclaw"), "Géographie", ""),
            en = LocalizedContent("Which city is the capital of Poland?", listOf("Warsaw", "Krakow", "Gdansk", "Wroclaw"), "Geography", ""),
            zh = LocalizedContent("哪个城市是波兰的首都？", listOf("华沙", "克拉科夫", "格但斯克", "弗罗茨瓦夫"), "地理", ""),
            es = LocalizedContent("¿Qué ciudad es la capital de Polonia?", listOf("Varsovia", "Cracovia", "Gdansk", "Wroclaw"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 8054, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays le plus chaud du monde en moyenne ?", listOf("Mali ou Djibouti", "Arabie Saoudite", "Koweït", "Libye"), "Géographie", ""),
            en = LocalizedContent("What is the hottest country in the world on average?", listOf("Mali or Djibouti", "Saudi Arabia", "Kuwait", "Libya"), "Geography", ""),
            zh = LocalizedContent("世界上平均气温最高的国家是哪个？", listOf("马里或吉布提", "沙特阿拉伯", "科威特", "利比亚"), "地理", ""),
            es = LocalizedContent("¿Cuál es el país más caluroso del mundo en promedio?", listOf("Malí o Yibuti", "Arabia Saudita", "Kuwait", "Libia"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 8055, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays se trouvent les ruines de Carthage ?", listOf("Tunisie (près de Tunis)", "Lybie", "Algérie", "Maroc"), "Géographie", ""),
            en = LocalizedContent("In which country are the ruins of Carthage located?", listOf("Tunisia (near Tunis)", "Libya", "Algeria", "Morocco"), "Geography", ""),
            zh = LocalizedContent("迦太基遗址位于哪个国家？", listOf("突尼斯（突尼斯市附近）", "利比亚", "阿尔及利亚", "摩洛哥"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentran las ruinas de Cartago?", listOf("Túnez (cerca de Túnez)", "Libia", "Argelia", "Marruecos"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 8056, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale du Pérou ?", listOf("Lima", "Cusco", "Arequipa", "Trujillo"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Peru?", listOf("Lima", "Cusco", "Arequipa", "Trujillo"), "Geography", ""),
            zh = LocalizedContent("秘鲁的首都是哪个城市？", listOf("利马", "库斯科", "阿雷基帕", "特鲁希略"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Perú?", listOf("Lima", "Cusco", "Arequipa", "Trujillo"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 8057, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom du détroit entre la Turquie européenne et asiatique (dans Istanbul) ?", listOf("Bosphore", "Dardanelles", "Mer de Marmara", "Hellespont"), "Géographie", ""),
            en = LocalizedContent("What is the name of the strait between European and Asian Turkey (in Istanbul)?", listOf("Bosphorus", "Dardanelles", "Sea of Marmara", "Hellespont"), "Geography", ""),
            zh = LocalizedContent("分隔土耳其欧洲部分和亚洲部分（位于伊斯坦布尔）的海峡叫什么？", listOf("博斯普鲁斯海峡", "达达尼尔海峡", "马尔马拉海", "赫勒斯滂海峡"), "地理", ""),
            es = LocalizedContent("¿Cuál es el nombre del estrecho entre la Turquía europea y asiática (en Estambul)?", listOf("Bósforo", "Dardanelos", "Mar de Mármara", "Helesponto"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 8058, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve la ville historique de Bruges ?", listOf("Belgique", "Pays-Bas", "France", "Luxembourg"), "Géographie", ""),
            en = LocalizedContent("In which country is the historic city of Bruges located?", listOf("Belgium", "Netherlands", "France", "Luxembourg"), "Geography", ""),
            zh = LocalizedContent("历史名城布鲁日位于哪个国家？", listOf("比利时", "荷兰", "法国", "卢森堡"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra la ciudad histórica de Brujas?", listOf("Bélgica", "Países Bajos", "Francia", "Luxemburgo"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 8059, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand pays insulaire du monde ?", listOf("Indonésie", "Japon", "Philippines", "Nouvelle-Zélande"), "Géographie", ""),
            en = LocalizedContent("What is the largest island country in the world?", listOf("Indonesia", "Japan", "Philippines", "New Zealand"), "Geography", ""),
            zh = LocalizedContent("世界上最大的岛国是哪个？", listOf("印度尼西亚", "日本", "菲律宾", "新西兰"), "地理", ""),
            es = LocalizedContent("¿Cuál es el país insular más grande del mundo?", listOf("Indonesia", "Japón", "Filipinas", "Nueva Zelanda"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 8060, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a composé 'La Marseillaise' en 1792 ?", listOf("Claude Joseph Rouget de Lisle", "François Gossec", "André Grétry", "Jean-François Lesueur"), "Culture", ""),
            en = LocalizedContent("Who composed 'La Marseillaise' in 1792?", listOf("Claude Joseph Rouget de Lisle", "François Gossec", "André Grétry", "Jean-François Lesueur"), "Culture", ""),
            zh = LocalizedContent("谁在1792年创作了《马赛曲》？", listOf("克洛德·约瑟夫·鲁热·德·利尔", "弗朗索瓦·戈塞克", "安德烈·格雷特里", "让-弗朗索瓦·勒叙厄尔"), "文化", ""),
            es = LocalizedContent("¿Quién compuso 'La Marsellesa' en 1792?", listOf("Claude Joseph Rouget de Lisle", "François Gossec", "André Grétry", "Jean-François Lesueur"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 8061, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel auteur a écrit 'Robinson Crusoé' ?", listOf("Daniel Defoe", "Jonathan Swift", "Henry Fielding", "Samuel Richardson"), "Culture", ""),
            en = LocalizedContent("Which author wrote 'Robinson Crusoe'?", listOf("Daniel Defoe", "Jonathan Swift", "Henry Fielding", "Samuel Richardson"), "Culture", ""),
            zh = LocalizedContent("哪位作者写了《鲁滨逊漂流记》？", listOf("丹尼尔·笛福", "乔纳森·斯威夫特", "亨利·菲尔丁", "塞缪尔·理查森"), "文化", ""),
            es = LocalizedContent("¿Qué autor escribió 'Robinson Crusoe'?", listOf("Daniel Defoe", "Jonathan Swift", "Henry Fielding", "Samuel Richardson"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 8062, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel peintre est connu pour son autoportrait avec une oreille coupée ?", listOf("Vincent van Gogh", "Paul Gauguin", "Paul Cézanne", "Henri de Toulouse-Lautrec"), "Culture", ""),
            en = LocalizedContent("Which painter is known for his self-portrait with a cut ear?", listOf("Vincent van Gogh", "Paul Gauguin", "Paul Cézanne", "Henri de Toulouse-Lautrec"), "Culture", ""),
            zh = LocalizedContent("哪位画家以割耳自画像闻名？", listOf("文森特·梵高", "保罗·高更", "保罗·塞尚", "亨利·德·图卢兹-劳特累克"), "文化", ""),
            es = LocalizedContent("¿Qué pintor es conocido por su autorretrato con una oreja cortada?", listOf("Vincent van Gogh", "Paul Gauguin", "Paul Cézanne", "Henri de Toulouse-Lautrec"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 8063, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle danse est originaire de l'Argentine ?", listOf("Le tango", "La samba", "La salsa", "Le mambo"), "Culture", ""),
            en = LocalizedContent("Which dance originated in Argentina?", listOf("Tango", "Samba", "Salsa", "Mambo"), "Culture", ""),
            zh = LocalizedContent("哪种舞蹈起源于阿根廷？", listOf("探戈", "桑巴", "萨尔萨", "曼波"), "文化", ""),
            es = LocalizedContent("¿Qué baile es originario de Argentina?", listOf("El tango", "La samba", "La salsa", "El mambo"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 8064, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a écrit 'L'Ile au trésor' ?", listOf("Robert Louis Stevenson", "Jules Verne", "H.G. Wells", "Arthur Conan Doyle"), "Culture", ""),
            en = LocalizedContent("Who wrote 'Treasure Island'?", listOf("Robert Louis Stevenson", "Jules Verne", "H.G. Wells", "Arthur Conan Doyle"), "Culture", ""),
            zh = LocalizedContent("谁写了《金银岛》？", listOf("罗伯特·路易斯·史蒂文森", "儒勒·凡尔纳", "赫伯特·乔治·威尔斯", "阿瑟·柯南·道尔"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'La isla del tesoro'?", listOf("Robert Louis Stevenson", "Jules Verne", "H.G. Wells", "Arthur Conan Doyle"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 8065, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel artiste est connu pour ses toiles carrées aux couleurs primaires ?", listOf("Piet Mondrian", "Wassily Kandinsky", "Kazimir Malevitch", "Paul Klee"), "Culture", ""),
            en = LocalizedContent("Which artist is known for his square canvases with primary colors?", listOf("Piet Mondrian", "Wassily Kandinsky", "Kazimir Malevich", "Paul Klee"), "Culture", ""),
            zh = LocalizedContent("哪位艺术家以其使用原色的方形画布而闻名？", listOf("皮特·蒙德里安", "瓦西里·康定斯基", "卡济米尔·马列维奇", "保罗·克利"), "文化", ""),
            es = LocalizedContent("¿Qué artista es conocido por sus lienzos cuadrados con colores primarios?", listOf("Piet Mondrian", "Wassily Kandinsky", "Kazimir Malevich", "Paul Klee"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 8066, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel auteur a écrit les romans 'Dune' ?", listOf("Frank Herbert", "Isaac Asimov", "Arthur C. Clarke", "Robert Heinlein"), "Culture", ""),
            en = LocalizedContent("Which author wrote the 'Dune' novels?", listOf("Frank Herbert", "Isaac Asimov", "Arthur C. Clarke", "Robert Heinlein"), "Culture", ""),
            zh = LocalizedContent("哪位作者写了《沙丘》系列小说？", listOf("弗兰克·赫伯特", "艾萨克·阿西莫夫", "阿瑟·C·克拉克", "罗伯特·海因莱因"), "文化", ""),
            es = LocalizedContent("¿Qué autor escribió las novelas de 'Dune'?", listOf("Frank Herbert", "Isaac Asimov", "Arthur C. Clarke", "Robert Heinlein"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 8067, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la sculpture la plus célèbre de Rodin ?", listOf("Le Penseur", "Les Bourgeois de Calais", "La Porte de l'Enfer", "Balzac"), "Culture", ""),
            en = LocalizedContent("What is Rodin's most famous sculpture?", listOf("The Thinker", "The Burghers of Calais", "The Gates of Hell", "Balzac"), "Culture", ""),
            zh = LocalizedContent("罗丹最著名的雕塑是什么？", listOf("思想者", "加莱义民", "地狱之门", "巴尔扎克"), "文化", ""),
            es = LocalizedContent("¿Cuál es la escultura más famosa de Rodin?", listOf("El Pensador", "Los burgueses de Calais", "La Puerta del Infierno", "Balzac"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 8068, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a écrit 'Le Tour du monde en 80 jours' ?", listOf("Jules Verne", "H.G. Wells", "Arthur Conan Doyle", "Émile Zola"), "Culture", ""),
            en = LocalizedContent("Who wrote 'Around the World in 80 Days'?", listOf("Jules Verne", "H.G. Wells", "Arthur Conan Doyle", "Émile Zola"), "Culture", ""),
            zh = LocalizedContent("谁写了《八十天环游地球》？", listOf("儒勒·凡尔纳", "赫伯特·乔治·威尔斯", "阿瑟·柯南·道尔", "埃米尔·左拉"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'La vuelta al mundo en 80 días'?", listOf("Jules Verne", "H.G. Wells", "Arthur Conan Doyle", "Émile Zola"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 8069, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel style de peinture est caractérisé par l'utilisation de points de couleur pures ?", listOf("Pointillisme (Seurat, Signac)", "Impressionnisme", "Cubisme", "Fauvisme"), "Culture", ""),
            en = LocalizedContent("Which painting style is characterized by the use of pure color dots?", listOf("Pointillism (Seurat, Signac)", "Impressionism", "Cubism", "Fauvism"), "Culture", ""),
            zh = LocalizedContent("哪种绘画风格以使用纯色点而著称？", listOf("点彩派（修拉、西涅克）", "印象派", "立体派", "野兽派"), "文化", ""),
            es = LocalizedContent("¿Qué estilo de pintura se caracteriza por el uso de puntos de color puro?", listOf("Puntillismo (Seurat, Signac)", "Impresionismo", "Cubismo", "Fauvismo"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 8070, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui est l'auteur de 'Voyage au bout de la nuit' ?", listOf("Louis-Ferdinand Céline", "André Malraux", "Georges Bernanos", "Paul Nizan"), "Culture", ""),
            en = LocalizedContent("Who is the author of 'Journey to the End of the Night'?", listOf("Louis-Ferdinand Céline", "André Malraux", "Georges Bernanos", "Paul Nizan"), "Culture", ""),
            zh = LocalizedContent("《长夜行》的作者是谁？", listOf("路易-费迪南·塞利纳", "安德烈·马尔罗", "乔治·贝尔纳诺斯", "保罗·尼赞"), "文化", ""),
            es = LocalizedContent("¿Quién es el autor de 'Viaje al fin de la noche'?", listOf("Louis-Ferdinand Céline", "André Malraux", "Georges Bernanos", "Paul Nizan"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 8071, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel compositeur est connu pour 'Le Boléro' (1928) ?", listOf("Maurice Ravel", "Claude Debussy", "Gabriel Fauré", "Darius Milhaud"), "Culture", ""),
            en = LocalizedContent("Which composer is known for 'Boléro' (1928)?", listOf("Maurice Ravel", "Claude Debussy", "Gabriel Fauré", "Darius Milhaud"), "Culture", ""),
            zh = LocalizedContent("哪位作曲家以《波莱罗舞曲》（1928）闻名？", listOf("莫里斯·拉威尔", "克劳德·德彪西", "加布里埃尔·福雷", "达律斯·米约"), "文化", ""),
            es = LocalizedContent("¿Qué compositor es conocido por 'Bolero' (1928)?", listOf("Maurice Ravel", "Claude Debussy", "Gabriel Fauré", "Darius Milhaud"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 8072, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel roman raconte la vie d'un enfant espion en Angleterre victorienne ?", listOf("Kim (Rudyard Kipling)", "Oliver Twist", "David Copperfield", "Great Expectations"), "Culture", ""),
            en = LocalizedContent("Which novel tells the story of a child spy in Victorian England?", listOf("Kim (Rudyard Kipling)", "Oliver Twist", "David Copperfield", "Great Expectations"), "Culture", ""),
            zh = LocalizedContent("哪部小说讲述了维多利亚时代英国一名儿童间谍的故事？", listOf("《基姆》（鲁德亚德·吉卜林）", "《雾都孤儿》", "《大卫·科波菲尔》", "《远大前程》"), "文化", ""),
            es = LocalizedContent("¿Qué novela cuenta la historia de un niño espía en la Inglaterra victoriana?", listOf("Kim (Rudyard Kipling)", "Oliver Twist", "David Copperfield", "Grandes esperanzas"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 8073, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a peint 'La Liberté guidant le peuple' (1830) ?", listOf("Eugène Delacroix", "Jacques-Louis David", "Théodore Géricault", "Jean-Auguste Ingres"), "Culture", ""),
            en = LocalizedContent("Who painted 'Liberty Leading the People' (1830)?", listOf("Eugène Delacroix", "Jacques-Louis David", "Théodore Géricault", "Jean-Auguste Ingres"), "Culture", ""),
            zh = LocalizedContent("谁创作了《自由引导人民》（1830）？", listOf("欧仁·德拉克罗瓦", "雅克-路易·大卫", "泰奥多尔·席里柯", "让-奥古斯特·安格尔"), "文化", ""),
            es = LocalizedContent("¿Quién pintó 'La libertad guiando al pueblo' (1830)?", listOf("Eugène Delacroix", "Jacques-Louis David", "Théodore Géricault", "Jean-Auguste Ingres"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 8074, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel opéra de Mozart se déroule en Espagne et met en scène Don Giovanni ?", listOf("Don Giovanni", "Les Noces de Figaro", "La Flûte enchantée", "Così fan tutte"), "Culture", ""),
            en = LocalizedContent("Which Mozart opera is set in Spain and features Don Giovanni?", listOf("Don Giovanni", "The Marriage of Figaro", "The Magic Flute", "Così fan tutte"), "Culture", ""),
            zh = LocalizedContent("莫扎特的哪部歌剧以西班牙为背景，并涉及唐·乔瓦尼？", listOf("《唐·乔瓦尼》", "《费加罗的婚礼》", "《魔笛》", "《女人心》"), "文化", ""),
            es = LocalizedContent("¿Qué ópera de Mozart se desarrolla en España y presenta a Don Giovanni?", listOf("Don Giovanni", "Las bodas de Fígaro", "La flauta mágica", "Così fan tutte"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 8075, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel auteur a créé le personnage de Hercule Poirot ?", listOf("Agatha Christie", "Arthur Conan Doyle", "Georges Simenon", "P.D. James"), "Culture", ""),
            en = LocalizedContent("Which author created the character Hercule Poirot?", listOf("Agatha Christie", "Arthur Conan Doyle", "Georges Simenon", "P.D. James"), "Culture", ""),
            zh = LocalizedContent("哪位作者创造了赫尔克里·波洛这个角色？", listOf("阿加莎·克里斯蒂", "阿瑟·柯南·道尔", "乔治·西默农", "P.D. 詹姆斯"), "文化", ""),
            es = LocalizedContent("¿Qué autor creó el personaje de Hércules Poirot?", listOf("Agatha Christie", "Arthur Conan Doyle", "Georges Simenon", "P.D. James"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 8076, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le poème épique de Virgile racontant la fondation de Rome ?", listOf("L'Énéide", "Les Géorgiques", "Les Bucoliques", "L'Iliade (Homère, pas Virgile)"), "Culture", ""),
            en = LocalizedContent("What is Virgil's epic poem about the founding of Rome?", listOf("The Aeneid", "The Georgics", "The Eclogues", "The Iliad (Homer, not Virgil)"), "Culture", ""),
            zh = LocalizedContent("维吉尔关于罗马建城的史诗是什么？", listOf("《埃涅阿斯纪》", "《农事诗》", "《牧歌》", "《伊利亚特》（荷马，非维吉尔）"), "文化", ""),
            es = LocalizedContent("¿Cuál es el poema épico de Virgilio sobre la fundación de Roma?", listOf("La Eneida", "Las Geórgicas", "Las Bucólicas", "La Ilíada (Homero, no Virgilio)"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 8077, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a peint 'Le Radeau de la Méduse' (1819) ?", listOf("Théodore Géricault", "Eugène Delacroix", "Jacques-Louis David", "Jean-Auguste Ingres"), "Culture", ""),
            en = LocalizedContent("Who painted 'The Raft of the Medusa' (1819)?", listOf("Théodore Géricault", "Eugène Delacroix", "Jacques-Louis David", "Jean-Auguste Ingres"), "Culture", ""),
            zh = LocalizedContent("谁创作了《美杜莎之筏》（1819）？", listOf("泰奥多尔·席里柯", "欧仁·德拉克罗瓦", "雅克-路易·大卫", "让-奥古斯特·安格尔"), "文化", ""),
            es = LocalizedContent("¿Quién pintó 'La balsa de la Medusa' (1819)?", listOf("Théodore Géricault", "Eugène Delacroix", "Jacques-Louis David", "Jean-Auguste Ingres"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 8078, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel auteur britannique a créé Phileas Fogg ?", listOf("Jules Verne (Français, pas Britannique)", "H.G. Wells", "Arthur Conan Doyle", "Charles Dickens"), "Culture", ""),
            en = LocalizedContent("Which British author created Phileas Fogg?", listOf("Jules Verne (French, not British)", "H.G. Wells", "Arthur Conan Doyle", "Charles Dickens"), "Culture", ""),
            zh = LocalizedContent("哪位英国作家创造了斐利亚·福克？", listOf("儒勒·凡尔纳（法国人，非英国人）", "H.G. 威尔斯", "阿瑟·柯南·道尔", "查尔斯·狄更斯"), "文化", ""),
            es = LocalizedContent("¿Qué autor británico creó a Phileas Fogg?", listOf("Julio Verne (francés, no británico)", "H.G. Wells", "Arthur Conan Doyle", "Charles Dickens"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 8079, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom du ballet de Stravinski représentant pour la première fois en 1913 ?", listOf("Le Sacre du Printemps", "L'Oiseau de Feu", "Petrouchka", "Pulcinella"), "Culture", ""),
            en = LocalizedContent("What is the name of Stravinsky's ballet first performed in 1913?", listOf("The Rite of Spring", "The Firebird", "Petrushka", "Pulcinella"), "Culture", ""),
            zh = LocalizedContent("斯特拉文斯基1913年首演的芭蕾舞剧叫什么？", listOf("《春之祭》", "《火鸟》", "《彼得鲁什卡》", "《普尔钦奈拉》"), "文化", ""),
            es = LocalizedContent("¿Cuál es el nombre del ballet de Stravinsky estrenado en 1913?", listOf("La consagración de la primavera", "El pájaro de fuego", "Petrushka", "Pulcinella"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 8080, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel langage est utilisé pour les requêtes de base de données ?", listOf("SQL (Structured Query Language)", "HTML", "XML", "JSON"), "Tech", ""),
            en = LocalizedContent("Which language is used for database queries?", listOf("SQL (Structured Query Language)", "HTML", "XML", "JSON"), "Technology", ""),
            zh = LocalizedContent("哪种语言用于数据库查询？", listOf("SQL（结构化查询语言）", "HTML", "XML", "JSON"), "科技", ""),
            es = LocalizedContent("¿Qué lenguaje se utiliza para las consultas de bases de datos?", listOf("SQL (Structured Query Language)", "HTML", "XML", "JSON"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 8081, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un framework MVC ?", listOf("Modèle-Vue-Contrôleur : séparation des préoccupations", "Machine virtuelle C", "Multi-Vendor Computing", "Modèle validé certifié"), "Tech", ""),
            en = LocalizedContent("What is an MVC framework?", listOf("Model-View-Controller: separation of concerns", "C Virtual Machine", "Multi-Vendor Computing", "Certified Validated Model"), "Technology", ""),
            zh = LocalizedContent("什么是MVC框架？", listOf("模型-视图-控制器：关注点分离", "C虚拟机", "多供应商计算", "认证验证模型"), "科技", ""),
            es = LocalizedContent("¿Qué es un framework MVC?", listOf("Modelo-Vista-Controlador: separación de preocupaciones", "Máquina virtual C", "Computación multivendedor", "Modelo validado certificado"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 8082, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la différence entre HTTP et WebSocket ?", listOf("WebSocket permet une communication bidirectionnelle persistante", "HTTP est plus rapide", "WebSocket est unidirectionnel", "HTTP maintient une connexion ouverte"), "Tech", ""),
            en = LocalizedContent("What is the difference between HTTP and WebSocket?", listOf("WebSocket allows persistent bidirectional communication", "HTTP is faster", "WebSocket is unidirectional", "HTTP maintains an open connection"), "Technology", ""),
            zh = LocalizedContent("HTTP和WebSocket有什么区别？", listOf("WebSocket允许持久的双向通信", "HTTP更快", "WebSocket是单向的", "HTTP保持连接打开"), "科技", ""),
            es = LocalizedContent("¿Cuál es la diferencia entre HTTP y WebSocket?", listOf("WebSocket permite comunicación bidireccional persistente", "HTTP es más rápido", "WebSocket es unidireccional", "HTTP mantiene una conexión abierta"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 8083, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la régression logistique ?", listOf("Algorithme de classification probabiliste", "Regression linéaire améliorée", "Réseau de neurones simple", "Arbre de décision"), "Tech", ""),
            en = LocalizedContent("What is logistic regression?", listOf("Probabilistic classification algorithm", "Improved linear regression", "Simple neural network", "Decision tree"), "Technology", ""),
            zh = LocalizedContent("什么是逻辑回归？", listOf("概率分类算法", "改进的线性回归", "简单神经网络", "决策树"), "科技", ""),
            es = LocalizedContent("¿Qué es la regresión logística?", listOf("Algoritmo de clasificación probabilística", "Regresión lineal mejorada", "Red neuronal simple", "Árbol de decisión"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 8084, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le principe du 'don't repeat yourself' (DRY) ?", listOf("Éviter la duplication de code", "Commenter tout le code", "Tester chaque ligne", "Documenter toutes les fonctions"), "Tech", ""),
            en = LocalizedContent("What is the principle of 'don't repeat yourself' (DRY)?", listOf("Avoid code duplication", "Comment all code", "Test every line", "Document all functions"), "Technology", ""),
            zh = LocalizedContent("“不要重复自己”（DRY）原则是什么？", listOf("避免代码重复", "注释所有代码", "测试每一行", "记录所有函数"), "科技", ""),
            es = LocalizedContent("¿Cuál es el principio de 'no te repitas' (DRY)?", listOf("Evitar la duplicación de código", "Comentar todo el código", "Probar cada línea", "Documentar todas las funciones"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 8085, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le protocole MQTT ?", listOf("Protocole léger de messagerie pour IoT", "Protocole de courrier électronique", "Protocole de transfert multimédia", "Protocole de synchronisation temps"), "Tech", ""),
            en = LocalizedContent("What is the MQTT protocol?", listOf("Lightweight messaging protocol for IoT", "Email protocol", "Multimedia transfer protocol", "Time synchronization protocol"), "Technology", ""),
            zh = LocalizedContent("什么是MQTT协议？", listOf("用于物联网的轻量级消息协议", "电子邮件协议", "多媒体传输协议", "时间同步协议"), "科技", ""),
            es = LocalizedContent("¿Qué es el protocolo MQTT?", listOf("Protocolo de mensajería ligero para IoT", "Protocolo de correo electrónico", "Protocolo de transferencia multimedia", "Protocolo de sincronización de tiempo"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 8086, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel format de fichier est utilisé pour les configurations Docker ?", listOf("YAML (docker-compose.yml) et Dockerfile", "JSON uniquement", "XML", "INI"), "Tech", ""),
            en = LocalizedContent("Which file format is used for Docker configurations?", listOf("YAML (docker-compose.yml) and Dockerfile", "JSON only", "XML", "INI"), "Technology", ""),
            zh = LocalizedContent("Docker配置使用哪种文件格式？", listOf("YAML（docker-compose.yml）和Dockerfile", "仅JSON", "XML", "INI"), "科技", ""),
            es = LocalizedContent("¿Qué formato de archivo se utiliza para las configuraciones de Docker?", listOf("YAML (docker-compose.yml) y Dockerfile", "Solo JSON", "XML", "INI"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 8087, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que l'architecture serverless ?", listOf("Exécution de code sans gestion de serveurs (Functions as a Service)", "Système sans serveur physique", "Cloud computing sans abonnement", "Architecture légère"), "Tech", ""),
            en = LocalizedContent("What is serverless architecture?", listOf("Execution of code without server management (Functions as a Service)", "System without physical servers", "Cloud computing without subscription", "Lightweight architecture"), "Technology", ""),
            zh = LocalizedContent("什么是无服务器架构？", listOf("无需管理服务器的代码执行（函数即服务）", "没有物理服务器的系统", "无需订阅的云计算", "轻量级架构"), "科技", ""),
            es = LocalizedContent("¿Qué es la arquitectura serverless?", listOf("Ejecución de código sin gestión de servidores (Functions as a Service)", "Sistema sin servidores físicos", "Computación en la nube sin suscripción", "Arquitectura ligera"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 8088, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la différence entre Java et JavaScript ?", listOf("Ce sont deux langages totalement différents (l'un OOP compilé, l'autre interprété web)", "Java est une version avancée", "JavaScript est une extension de Java", "Ils utilisent le même moteur"), "Tech", ""),
            en = LocalizedContent("What is the difference between Java and JavaScript?", listOf("They are two completely different languages (one compiled OOP, the other interpreted web)", "Java is an advanced version", "JavaScript is an extension of Java", "They use the same engine"), "Technology", ""),
            zh = LocalizedContent("Java和JavaScript有什么区别？", listOf("它们是两种完全不同的语言（一种是编译型面向对象，另一种是解释型网页语言）", "Java是高级版本", "JavaScript是Java的扩展", "它们使用相同的引擎"), "科技", ""),
            es = LocalizedContent("¿Cuál es la diferencia entre Java y JavaScript?", listOf("Son dos lenguajes completamente diferentes (uno OOP compilado, el otro interpretado web)", "Java es una versión avanzada", "JavaScript es una extensión de Java", "Usan el mismo motor"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 8089, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le modèle en couches (layered architecture) ?", listOf("Architecture divisant l'app en couches séparées (présentation, logique, données)", "Architecture de réseau OSI", "Architecture cloud", "Architecture microservices"), "Tech", ""),
            en = LocalizedContent("What is the layered architecture model?", listOf("Architecture dividing the app into separate layers (presentation, logic, data)", "OSI network architecture", "Cloud architecture", "Microservices architecture"), "Technology", ""),
            zh = LocalizedContent("什么是分层架构模型？", listOf("将应用程序分为独立层（表示层、逻辑层、数据层）的架构", "OSI网络架构", "云架构", "微服务架构"), "科技", ""),
            es = LocalizedContent("¿Qué es el modelo de arquitectura en capas?", listOf("Arquitectura que divide la aplicación en capas separadas (presentación, lógica, datos)", "Arquitectura de red OSI", "Arquitectura en la nube", "Arquitectura de microservicios"), "Tecnología", "")
        ),
    )

    private fun part3(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 8090, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel outil de build est utilisé pour les projets Android ?", listOf("Gradle", "Maven", "Ant", "CMake"), "Tech", ""),
            en = LocalizedContent("Which build tool is used for Android projects?", listOf("Gradle", "Maven", "Ant", "CMake"), "Technology", ""),
            zh = LocalizedContent("Android 项目使用哪种构建工具？", listOf("Gradle", "Maven", "Ant", "CMake"), "科技", ""),
            es = LocalizedContent("¿Qué herramienta de construcción se utiliza para proyectos Android?", listOf("Gradle", "Maven", "Ant", "CMake"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 8091, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le principe SOLID ?", listOf("5 principes de programmation orientée objet (Single responsibility, Open-closed, etc.)", "Protocole de sécurité", "Standard de qualité logicielle", "Méthode agile"), "Tech", ""),
            en = LocalizedContent("What is the SOLID principle?", listOf("5 principles of object-oriented programming (Single responsibility, Open-closed, etc.)", "Security protocol", "Software quality standard", "Agile method"), "Technology", ""),
            zh = LocalizedContent("什么是 SOLID 原则？", listOf("面向对象编程的5个原则（单一职责、开闭等）", "安全协议", "软件质量标准", "敏捷方法"), "科技", ""),
            es = LocalizedContent("¿Qué es el principio SOLID?", listOf("5 principios de programación orientada a objetos (Responsabilidad única, Abierto-cerrado, etc.)", "Protocolo de seguridad", "Estándar de calidad de software", "Método ágil"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 8092, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'une regex (expression régulière) ?", listOf("Séquence de caractères définissant un motif de recherche dans du texte", "Langage de requête", "Format de données structurées", "Algorithme de tri"), "Tech", ""),
            en = LocalizedContent("What is a regex (regular expression)?", listOf("Sequence of characters defining a search pattern in text", "Query language", "Structured data format", "Sorting algorithm"), "Technology", ""),
            zh = LocalizedContent("什么是正则表达式？", listOf("定义文本中搜索模式的字符序列", "查询语言", "结构化数据格式", "排序算法"), "科技", ""),
            es = LocalizedContent("¿Qué es una expresión regular (regex)?", listOf("Secuencia de caracteres que define un patrón de búsqueda en texto", "Lenguaje de consulta", "Formato de datos estructurados", "Algoritmo de ordenamiento"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 8093, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel langage est utilisé pour la data science et le ML principalement ?", listOf("Python", "R", "MATLAB", "Julia"), "Tech", ""),
            en = LocalizedContent("Which language is mainly used for data science and ML?", listOf("Python", "R", "MATLAB", "Julia"), "Technology", ""),
            zh = LocalizedContent("数据科学和机器学习主要使用哪种语言？", listOf("Python", "R", "MATLAB", "Julia"), "科技", ""),
            es = LocalizedContent("¿Qué lenguaje se utiliza principalmente para ciencia de datos y ML?", listOf("Python", "R", "MATLAB", "Julia"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 8094, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un hook en React ?", listOf("Fonction permettant d'utiliser état et cycle de vie dans composants fonctionnels", "Événement de clic", "Plugin React", "API externe"), "Tech", ""),
            en = LocalizedContent("What is a hook in React?", listOf("Function that allows using state and lifecycle in functional components", "Click event", "React plugin", "External API"), "Technology", ""),
            zh = LocalizedContent("React 中的钩子是什么？", listOf("允许在函数组件中使用状态和生命周期的函数", "点击事件", "React 插件", "外部 API"), "科技", ""),
            es = LocalizedContent("¿Qué es un hook en React?", listOf("Función que permite usar estado y ciclo de vida en componentes funcionales", "Evento de clic", "Plugin de React", "API externa"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 8095, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le load balancing ?", listOf("Répartition du trafic entre plusieurs serveurs", "Équilibrage de la charge CPU", "Gestion de la mémoire", "Optimisation des requêtes DB"), "Tech", ""),
            en = LocalizedContent("What is load balancing?", listOf("Distribution of traffic among multiple servers", "CPU load balancing", "Memory management", "DB query optimization"), "Technology", ""),
            zh = LocalizedContent("什么是负载均衡？", listOf("在多个服务器之间分配流量", "CPU 负载均衡", "内存管理", "数据库查询优化"), "科技", ""),
            es = LocalizedContent("¿Qué es el balanceo de carga?", listOf("Distribución del tráfico entre múltiples servidores", "Equilibrio de carga de CPU", "Gestión de memoria", "Optimización de consultas DB"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 8096, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que l'infrastructure as code ?", listOf("Gestion de l'infrastructure via du code versionné (Terraform, Ansible)", "Programmation de robots industriels", "Automatisation des tests", "Documentation technique"), "Tech", ""),
            en = LocalizedContent("What is infrastructure as code?", listOf("Managing infrastructure via versioned code (Terraform, Ansible)", "Industrial robot programming", "Test automation", "Technical documentation"), "Technology", ""),
            zh = LocalizedContent("什么是基础设施即代码？", listOf("通过版本化代码管理基础设施（Terraform、Ansible）", "工业机器人编程", "测试自动化", "技术文档"), "科技", ""),
            es = LocalizedContent("¿Qué es la infraestructura como código?", listOf("Gestión de infraestructura mediante código versionado (Terraform, Ansible)", "Programación de robots industriales", "Automatización de pruebas", "Documentación técnica"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 8097, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'avantage des bases de données NoSQL ?", listOf("Flexibilité de schéma et scalabilité horizontale", "Requêtes SQL standard", "Intégrité des données garantie", "Moins de coût toujours"), "Tech", ""),
            en = LocalizedContent("What is the advantage of NoSQL databases?", listOf("Schema flexibility and horizontal scalability", "Standard SQL queries", "Guaranteed data integrity", "Always lower cost"), "Technology", ""),
            zh = LocalizedContent("NoSQL 数据库的优势是什么？", listOf("模式灵活性和水平可扩展性", "标准 SQL 查询", "保证数据完整性", "总是更低成本"), "科技", ""),
            es = LocalizedContent("¿Cuál es la ventaja de las bases de datos NoSQL?", listOf("Flexibilidad de esquema y escalabilidad horizontal", "Consultas SQL estándar", "Integridad de datos garantizada", "Siempre menor costo"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 8098, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le pair testing ?", listOf("Deux personnes testant ensemble un logiciel", "Test automatisé par paires", "Test A/B", "Test d'acceptation utilisateur"), "Tech", ""),
            en = LocalizedContent("What is pair testing?", listOf("Two people testing software together", "Automated pair testing", "A/B testing", "User acceptance testing"), "Technology", ""),
            zh = LocalizedContent("什么是结对测试？", listOf("两个人一起测试软件", "自动化结对测试", "A/B 测试", "用户验收测试"), "科技", ""),
            es = LocalizedContent("¿Qué es el pair testing?", listOf("Dos personas probando software juntas", "Prueba automatizada por pares", "Prueba A/B", "Prueba de aceptación de usuario"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 8099, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le rôle d'un ORM ?", listOf("Mapper les objets de code aux tables de base de données", "Optimiser les requêtes SQL", "Créer des bases de données", "Gérer les migrations"), "Tech", ""),
            en = LocalizedContent("What is the role of an ORM?", listOf("Map code objects to database tables", "Optimize SQL queries", "Create databases", "Manage migrations"), "Technology", ""),
            zh = LocalizedContent("ORM 的作用是什么？", listOf("将代码对象映射到数据库表", "优化 SQL 查询", "创建数据库", "管理迁移"), "科技", ""),
            es = LocalizedContent("¿Cuál es el rol de un ORM?", listOf("Mapear objetos de código a tablas de base de datos", "Optimizar consultas SQL", "Crear bases de datos", "Gestionar migraciones"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 8100, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel sport pratique-t-on le 'kick' ?", listOf("Arts martiaux, football américain et rugby", "Seulement le karaté", "Seulement le football américain", "Baseball"), "Sport", ""),
            en = LocalizedContent("In which sport is the 'kick' practiced?", listOf("Martial arts, American football and rugby", "Only karate", "Only American football", "Baseball"), "Sports", ""),
            zh = LocalizedContent("在哪种运动中会用到'踢'？", listOf("武术、美式足球和橄榄球", "只有空手道", "只有美式足球", "棒球"), "体育", ""),
            es = LocalizedContent("¿En qué deporte se practica el 'kick'?", listOf("Artes marciales, fútbol americano y rugby", "Solo kárate", "Solo fútbol americano", "Béisbol"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 8101, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du saut à la perche masculin ?", listOf("6,21 m (Armand Duplantis, 2023)", "6,15 m", "6,05 m", "6,18 m"), "Sport", ""),
            en = LocalizedContent("What is the men's pole vault record?", listOf("6.21 m (Armand Duplantis, 2023)", "6.15 m", "6.05 m", "6.18 m"), "Sports", ""),
            zh = LocalizedContent("男子撑杆跳高的纪录是多少？", listOf("6.21米（阿曼德·杜普兰蒂斯，2023年）", "6.15米", "6.05米", "6.18米"), "体育", ""),
            es = LocalizedContent("¿Cuál es el récord masculino de salto con pértiga?", listOf("6,21 m (Armand Duplantis, 2023)", "6,15 m", "6,05 m", "6,18 m"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 8102, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Dans quel sport le 'dunk' est-il interdit au lycée aux USA ?", listOf("Le basketball n'interdit pas le dunk globalement", "Le handball", "Le volleyball", "Le basketball universitaire"), "Sport", ""),
            en = LocalizedContent("In which sport is the 'dunk' prohibited in high school in the USA?", listOf("Basketball does not globally prohibit the dunk", "Handball", "Volleyball", "College basketball"), "Sports", ""),
            zh = LocalizedContent("在美国高中，哪种运动禁止'扣篮'？", listOf("篮球并不全面禁止扣篮", "手球", "排球", "大学篮球"), "体育", ""),
            es = LocalizedContent("¿En qué deporte está prohibido el 'mate' en la escuela secundaria en EE. UU.?", listOf("El baloncesto no prohíbe el mate globalmente", "Balonmano", "Voleibol", "Baloncesto universitario"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 8103, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le pays le plus titré en handball masculin mondial ?", listOf("France (6 titres)", "Danemark", "Suède", "Espagne"), "Sport", ""),
            en = LocalizedContent("Which country has the most titles in men's world handball?", listOf("France (6 titles)", "Denmark", "Sweden", "Spain"), "Sports", ""),
            zh = LocalizedContent("哪个国家在男子世界手球中夺冠次数最多？", listOf("法国（6次冠军）", "丹麦", "瑞典", "西班牙"), "体育", ""),
            es = LocalizedContent("¿Qué país tiene más títulos en balonmano masculino mundial?", listOf("Francia (6 títulos)", "Dinamarca", "Suecia", "España"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 8104, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle équipe a remporté le plus de Super Bowl ?", listOf("New England Patriots et Kansas City Chiefs (6 chacun)", "Pittsburgh Steelers (6)", "San Francisco 49ers", "Dallas Cowboys"), "Sport", ""),
            en = LocalizedContent("Which team has won the most Super Bowls?", listOf("New England Patriots and Kansas City Chiefs (6 each)", "Pittsburgh Steelers (6)", "San Francisco 49ers", "Dallas Cowboys"), "Sports", ""),
            zh = LocalizedContent("哪支球队赢得了最多的超级碗？", listOf("新英格兰爱国者和堪萨斯城酋长（各6次）", "匹兹堡钢人（6次）", "旧金山49人", "达拉斯牛仔"), "体育", ""),
            es = LocalizedContent("¿Qué equipo ha ganado más Super Bowls?", listOf("New England Patriots y Kansas City Chiefs (6 cada uno)", "Pittsburgh Steelers (6)", "San Francisco 49ers", "Dallas Cowboys"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 8105, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel sport pratique-t-on le 'lob' ?", listOf("Tennis, badminton, volleyball", "Seulement le tennis", "Golf", "Squash"), "Sport", ""),
            en = LocalizedContent("In which sport is the 'lob' practiced?", listOf("Tennis, badminton, volleyball", "Only tennis", "Golf", "Squash"), "Sports", ""),
            zh = LocalizedContent("在哪种运动中会用到'高吊球'？", listOf("网球、羽毛球、排球", "只有网球", "高尔夫", "壁球"), "体育", ""),
            es = LocalizedContent("¿En qué deporte se practica el 'globo'?", listOf("Tenis, bádminton, voleibol", "Solo tenis", "Golf", "Squash"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 8106, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a remporté la Coupe du monde de cricket 2023 ?", listOf("Australie", "Inde", "Angleterre", "Nouvelle-Zélande"), "Sport", ""),
            en = LocalizedContent("Which country won the 2023 Cricket World Cup?", listOf("Australia", "India", "England", "New Zealand"), "Sports", ""),
            zh = LocalizedContent("哪个国家赢得了2023年板球世界杯？", listOf("澳大利亚", "印度", "英格兰", "新西兰"), "体育", ""),
            es = LocalizedContent("¿Qué país ganó la Copa Mundial de Críquet 2023?", listOf("Australia", "India", "Inglaterra", "Nueva Zelanda"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 8107, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de temps dure un match de badminton en simple ?", listOf("Meilleur de 3 sets à 21 points", "3 sets à 15 points", "5 sets à 21 points", "Temps limité à 1 heure"), "Sport", ""),
            en = LocalizedContent("How long does a singles badminton match last?", listOf("Best of 3 sets to 21 points", "3 sets to 15 points", "5 sets to 21 points", "Time limited to 1 hour"), "Sports", ""),
            zh = LocalizedContent("一场羽毛球单打比赛持续多久？", listOf("三局两胜，每局21分", "三局15分", "五局21分", "限时1小时"), "体育", ""),
            es = LocalizedContent("¿Cuánto dura un partido de bádminton individual?", listOf("Mejor de 3 sets a 21 puntos", "3 sets a 15 puntos", "5 sets a 21 puntos", "Tiempo limitado a 1 hora"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 8108, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel sport pratique-t-on le 'backstroke' ?", listOf("Natation (dos crawlé)", "Aviron", "Kayak", "Plongée"), "Sport", ""),
            en = LocalizedContent("In which sport is the 'backstroke' practiced?", listOf("Swimming (back crawl)", "Rowing", "Kayaking", "Diving"), "Sports", ""),
            zh = LocalizedContent("在哪种运动中会用到'仰泳'？", listOf("游泳（仰泳）", "赛艇", "皮划艇", "跳水"), "体育", ""),
            es = LocalizedContent("¿En qué deporte se practica el 'estilo espalda'?", listOf("Natación (crol de espalda)", "Remo", "Piragüismo", "Buceo"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 8109, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel joueur a remporté le plus d'MVP NBA?", listOf("Wilt Chamberlain", "Bill Russell", "Kareem Abdul-Jabbar", "Michael Jordan"), "Sport", "Kareem Abdul-Jabbar a remporté six titres de MVP NBA, un record qu'il détient seul depuis 1974, devant Bill Russell et Michael Jordan qui en comptent cinq chacun."),
            en = LocalizedContent("Which player has won the most NBA MVP awards?", listOf("Wilt Chamberlain", "Bill Russell", "Kareem Abdul-Jabbar", "Michael Jordan"), "Sports", "Kareem Abdul-Jabbar has won six NBA MVP awards, a record he has held alone since 1974, ahead of Bill Russell and Michael Jordan who each have five."),
            zh = LocalizedContent("哪位球员赢得了最多的NBA最有价值球员奖？", listOf("威尔特·张伯伦", "比尔·拉塞尔", "卡里姆·阿卜杜尔-贾巴尔", "迈克尔·乔丹"), "体育", "卡里姆·阿卜杜尔-贾巴尔赢得了六次NBA最有价值球员奖，自1974年以来他独自保持这一纪录，领先于各获得五次奖项的比尔·拉塞尔和迈克尔·乔丹。"),
            es = LocalizedContent("¿Qué jugador ha ganado más premios MVP de la NBA?", listOf("Wilt Chamberlain", "Bill Russell", "Kareem Abdul-Jabbar", "Michael Jordan"), "Deportes", "Kareem Abdul-Jabbar ha ganado seis premios MVP de la NBA, un récord que ostenta en solitario desde 1974, por delante de Bill Russell y Michael Jordan, que tienen cinco cada uno.")
        ),
        BilingualQuestion(
            id = 8110, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays de 5 millions d'habitants a atteint les demi-finales de l'Euro 2016 ?", listOf("Islande", "Irlande", "Slovaquie", "Pays de Galles"), "Sport", ""),
            en = LocalizedContent("Which country with 5 million inhabitants reached the semi-finals of Euro 2016?", listOf("Iceland", "Ireland", "Slovakia", "Wales"), "Sports", ""),
            zh = LocalizedContent("哪个拥有500万人口的国家进入了2016年欧洲杯半决赛？", listOf("冰岛", "爱尔兰", "斯洛伐克", "威尔士"), "体育", ""),
            es = LocalizedContent("¿Qué país de 5 millones de habitantes llegó a las semifinales de la Eurocopa 2016?", listOf("Islandia", "Irlanda", "Eslovaquia", "Gales"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 8111, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de points vaut un tir reussi au-dela de la ligne a longue distance au basketball ?", listOf("3 points", "2 points", "4 points", "1 point"), "Sport", ""),
            en = LocalizedContent("How many points is a successful shot beyond the three-point line worth in basketball?", listOf("3 points", "2 points", "4 points", "1 point"), "Sports", ""),
            zh = LocalizedContent("在篮球中，三分线外投篮命中得多少分？", listOf("3分", "2分", "4分", "1分"), "体育", ""),
            es = LocalizedContent("¿Cuántos puntos vale un tiro acertado más allá de la línea de tres puntos en baloncesto?", listOf("3 puntos", "2 puntos", "4 puntos", "1 punto"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 8112, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le poids maximum d'un ballon de rugby à XV ?", listOf("490 grammes", "460 grammes", "520 grammes", "400 grammes"), "Sport", ""),
            en = LocalizedContent("What is the maximum weight of a rugby union ball?", listOf("490 grams", "460 grams", "520 grams", "400 grams"), "Sports", ""),
            zh = LocalizedContent("英式橄榄球的最大重量是多少？", listOf("490克", "460克", "520克", "400克"), "体育", ""),
            es = LocalizedContent("¿Cuál es el peso máximo de un balón de rugby a 15?", listOf("490 gramos", "460 gramos", "520 gramos", "400 gramos"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 8113, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel sport pratique-t-on la 'passe de côté' ?", listOf("Rugby", "Football américain", "Handball", "Basket"), "Sport", ""),
            en = LocalizedContent("In which sport is the 'side pass' practiced?", listOf("Rugby", "American football", "Handball", "Basketball"), "Sports", ""),
            zh = LocalizedContent("在哪种运动中进行'侧传'？", listOf("橄榄球", "美式足球", "手球", "篮球"), "体育", ""),
            es = LocalizedContent("¿En qué deporte se practica el 'pase lateral'?", listOf("Rugby", "Fútbol americano", "Balonmano", "Baloncesto"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 8114, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays d'origine du badminton ?", listOf("Angleterre (codifié) / Inde (origines poona)", "Chine", "Inde uniquement", "Malaisie"), "Sport", ""),
            en = LocalizedContent("What is the country of origin of badminton?", listOf("England (codified) / India (poona origins)", "China", "India only", "Malaysia"), "Sports", ""),
            zh = LocalizedContent("羽毛球的起源国家是？", listOf("英国（规范化）/ 印度（普纳起源）", "中国", "仅印度", "马来西亚"), "体育", ""),
            es = LocalizedContent("¿Cuál es el país de origen del bádminton?", listOf("Inglaterra (codificado) / India (orígenes poona)", "China", "Solo India", "Malasia"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 8115, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quelle est la surface d'un court de tennis (simple) ?", listOf("260 m² environ (23,77 m × 8,23 m)", "200 m²", "300 m²", "350 m²"), "Sport", ""),
            en = LocalizedContent("What is the surface area of a tennis court (singles)?", listOf("About 260 m² (23.77 m × 8.23 m)", "200 m²", "300 m²", "350 m²"), "Sports", ""),
            zh = LocalizedContent("网球单打场地的面积是多少？", listOf("约260平方米（23.77米×8.23米）", "200平方米", "300平方米", "350平方米"), "体育", ""),
            es = LocalizedContent("¿Cuál es la superficie de una pista de tenis (individuales)?", listOf("Unos 260 m² (23,77 m × 8,23 m)", "200 m²", "300 m²", "350 m²"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 8116, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a remporté Roland-Garros le plus de fois en masculin ?", listOf("Rafael Nadal (14 titres)", "Roger Federer (1 titre)", "Novak Djokovic (3 titres)", "Gustavo Kuerten (3 titres)"), "Sport", ""),
            en = LocalizedContent("Who has won Roland Garros the most times in men's singles?", listOf("Rafael Nadal (14 titles)", "Roger Federer (1 title)", "Novak Djokovic (3 titles)", "Gustavo Kuerten (3 titles)"), "Sports", ""),
            zh = LocalizedContent("谁在男子单打中赢得法网次数最多？", listOf("拉斐尔·纳达尔（14次冠军）", "罗杰·费德勒（1次冠军）", "诺瓦克·德约科维奇（3次冠军）", "古斯塔沃·库尔滕（3次冠军）"), "体育", ""),
            es = LocalizedContent("¿Quién ha ganado Roland Garros más veces en individuales masculinos?", listOf("Rafael Nadal (14 títulos)", "Roger Federer (1 título)", "Novak Djokovic (3 títulos)", "Gustavo Kuerten (3 títulos)"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 8117, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel sport pratique-t-on le 'revers' ?", listOf("Tennis, badminton et ping-pong", "Seulement le tennis", "Squash", "Badminton uniquement"), "Sport", ""),
            en = LocalizedContent("In which sport is the 'backhand' practiced?", listOf("Tennis, badminton and table tennis", "Only tennis", "Squash", "Badminton only"), "Sports", ""),
            zh = LocalizedContent("在哪种运动中使用'反手'？", listOf("网球、羽毛球和乒乓球", "仅网球", "壁球", "仅羽毛球"), "体育", ""),
            es = LocalizedContent("¿En qué deporte se practica el 'revés'?", listOf("Tenis, bádminton y ping-pong", "Solo tenis", "Squash", "Solo bádminton"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 8118, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien d'athlètes composent un relais 4×100m ?", listOf("4 athlètes", "5 athlètes", "3 athlètes", "6 athlètes"), "Sport", ""),
            en = LocalizedContent("How many athletes make up a 4×100m relay?", listOf("4 athletes", "5 athletes", "3 athletes", "6 athletes"), "Sports", ""),
            zh = LocalizedContent("4×100米接力由多少名运动员组成？", listOf("4名运动员", "5名运动员", "3名运动员", "6名运动员"), "体育", ""),
            es = LocalizedContent("¿Cuántos atletas componen un relevo 4×100m?", listOf("4 atletas", "5 atletas", "3 atletas", "6 atletas"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 8119, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a inventé le volleyball ?", listOf("États-Unis (William Morgan, 1895)", "Brésil", "Russie", "Cuba"), "Sport", ""),
            en = LocalizedContent("Which country invented volleyball?", listOf("United States (William Morgan, 1895)", "Brazil", "Russia", "Cuba"), "Sports", ""),
            zh = LocalizedContent("哪个国家发明了排球？", listOf("美国（威廉·摩根，1895年）", "巴西", "俄罗斯", "古巴"), "体育", ""),
            es = LocalizedContent("¿Qué país inventó el voleibol?", listOf("Estados Unidos (William Morgan, 1895)", "Brasil", "Rusia", "Cuba"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 8120, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est le philosophe de la 'Théorie des Idées' ?", listOf("Platon", "Aristote", "Socrate", "Épicure"), "Philosophie", ""),
            en = LocalizedContent("Who is the philosopher of the 'Theory of Ideas'?", listOf("Plato", "Aristotle", "Socrates", "Epicurus"), "Philosophy", ""),
            zh = LocalizedContent("谁是‘理念论’的哲学家？", listOf("柏拉图", "亚里士多德", "苏格拉底", "伊壁鸠鲁"), "哲学", ""),
            es = LocalizedContent("¿Quién es el filósofo de la 'Teoría de las Ideas'?", listOf("Platón", "Aristóteles", "Sócrates", "Epicuro"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 8121, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le déterminisme ?", listOf("Doctrine selon laquelle tout événement est causalement déterminé", "Liberté absolue du choix humain", "Doctrine fataliste religieuse", "Relativisme moral"), "Philosophie", ""),
            en = LocalizedContent("What is determinism?", listOf("Doctrine according to which every event is causally determined", "Absolute freedom of human choice", "Religious fatalistic doctrine", "Moral relativism"), "Philosophy", ""),
            zh = LocalizedContent("什么是决定论？", listOf("认为一切事件都有因果决定性的学说", "人类选择的绝对自由", "宗教宿命论学说", "道德相对主义"), "哲学", ""),
            es = LocalizedContent("¿Qué es el determinismo?", listOf("Doctrina según la cual todo evento está causalmente determinado", "Libertad absoluta de elección humana", "Doctrina fatalista religiosa", "Relativismo moral"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 8122, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'Ainsi parlait Zarathoustra' ?", listOf("Friedrich Nietzsche", "Arthur Schopenhauer", "Martin Heidegger", "Georg Hegel"), "Philosophie", ""),
            en = LocalizedContent("Who wrote 'Thus Spoke Zarathustra'?", listOf("Friedrich Nietzsche", "Arthur Schopenhauer", "Martin Heidegger", "Georg Hegel"), "Philosophy", ""),
            zh = LocalizedContent("谁写了《查拉图斯特拉如是说》？", listOf("弗里德里希·尼采", "亚瑟·叔本华", "马丁·海德格尔", "格奥尔格·黑格尔"), "哲学", ""),
            es = LocalizedContent("¿Quién escribió 'Así habló Zaratustra'?", listOf("Friedrich Nietzsche", "Arthur Schopenhauer", "Martin Heidegger", "Georg Hegel"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 8123, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le rationalisme ?", listOf("Philosophie fondant la connaissance sur la raison", "Philosophie de l'expérience sensorielle", "Philosophie pragmatique", "Empirisme logique"), "Philosophie", ""),
            en = LocalizedContent("What is rationalism?", listOf("Philosophy grounding knowledge on reason", "Philosophy of sensory experience", "Pragmatic philosophy", "Logical empiricism"), "Philosophy", ""),
            zh = LocalizedContent("什么是理性主义？", listOf("将知识建立在理性基础上的哲学", "感官经验的哲学", "实用主义哲学", "逻辑经验主义"), "哲学", ""),
            es = LocalizedContent("¿Qué es el racionalismo?", listOf("Filosofía que fundamenta el conocimiento en la razón", "Filosofía de la experiencia sensorial", "Filosofía pragmática", "Empirismo lógico"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 8124, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui est l'auteur de la 'Phénoménologie de l'esprit' ?", listOf("Georg Wilhelm Friedrich Hegel", "Edmund Husserl", "Martin Heidegger", "Immanuel Kant"), "Philosophie", ""),
            en = LocalizedContent("Who is the author of the 'Phenomenology of Spirit'?", listOf("Georg Wilhelm Friedrich Hegel", "Edmund Husserl", "Martin Heidegger", "Immanuel Kant"), "Philosophy", ""),
            zh = LocalizedContent("谁是《精神现象学》的作者？", listOf("格奥尔格·威廉·弗里德里希·黑格尔", "埃德蒙德·胡塞尔", "马丁·海德格尔", "伊曼努尔·康德"), "哲学", ""),
            es = LocalizedContent("¿Quién es el autor de la 'Fenomenología del espíritu'?", listOf("Georg Wilhelm Friedrich Hegel", "Edmund Husserl", "Martin Heidegger", "Immanuel Kant"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 8125, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le scepticisme philosophique ?", listOf("Mise en doute de la possibilité de la connaissance certaine", "Acceptation totale du savoir", "Négation de la réalité", "Relativisme moral"), "Philosophie", ""),
            en = LocalizedContent("What is philosophical skepticism?", listOf("Doubt about the possibility of certain knowledge", "Total acceptance of knowledge", "Denial of reality", "Moral relativism"), "Philosophy", ""),
            zh = LocalizedContent("什么是哲学怀疑论？", listOf("对确定知识可能性的怀疑", "完全接受知识", "否定现实", "道德相对主义"), "哲学", ""),
            es = LocalizedContent("¿Qué es el escepticismo filosófico?", listOf("Duda sobre la posibilidad del conocimiento cierto", "Aceptación total del saber", "Negación de la realidad", "Relativismo moral"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 8126, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui est le fondateur du pragmatisme américain ?", listOf("William James et John Dewey (et Charles Sanders Peirce)", "Ralph Waldo Emerson", "Henry David Thoreau", "Josiah Royce"), "Philosophie", ""),
            en = LocalizedContent("Who is the founder of American pragmatism?", listOf("William James and John Dewey (and Charles Sanders Peirce)", "Ralph Waldo Emerson", "Henry David Thoreau", "Josiah Royce"), "Philosophy", ""),
            zh = LocalizedContent("谁是美国实用主义的创始人？", listOf("威廉·詹姆斯和约翰·杜威（以及查尔斯·桑德斯·皮尔士）", "拉尔夫·沃尔多·爱默生", "亨利·戴维·梭罗", "乔赛亚·罗伊斯"), "哲学", ""),
            es = LocalizedContent("¿Quién es el fundador del pragmatismo americano?", listOf("William James y John Dewey (y Charles Sanders Peirce)", "Ralph Waldo Emerson", "Henry David Thoreau", "Josiah Royce"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 8127, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que l'éthique de la responsabilité (Hans Jonas) ?", listOf("Responsabilité envers les générations futures pour préserver la vie", "Responsabilité individuelle uniquement", "Éthique des soins", "Éthique professionnelle"), "Philosophie", ""),
            en = LocalizedContent("What is the ethics of responsibility (Hans Jonas)?", listOf("Responsibility towards future generations to preserve life", "Individual responsibility only", "Ethics of care", "Professional ethics"), "Philosophy", ""),
            zh = LocalizedContent("什么是责任伦理（汉斯·约纳斯）？", listOf("对未来世代保护生命的责任", "仅个人责任", "关怀伦理", "职业伦理"), "哲学", ""),
            es = LocalizedContent("¿Qué es la ética de la responsabilidad (Hans Jonas)?", listOf("Responsabilidad hacia las generaciones futuras para preservar la vida", "Responsabilidad individual únicamente", "Ética del cuidado", "Ética profesional"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 8128, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a développé le concept de 'volonté de puissance' ?", listOf("Friedrich Nietzsche", "Arthur Schopenhauer", "Friedrich Hegel", "Martin Heidegger"), "Philosophie", ""),
            en = LocalizedContent("Who developed the concept of 'will to power'?", listOf("Friedrich Nietzsche", "Arthur Schopenhauer", "Friedrich Hegel", "Martin Heidegger"), "Philosophy", ""),
            zh = LocalizedContent("谁提出了‘权力意志’的概念？", listOf("弗里德里希·尼采", "亚瑟·叔本华", "弗里德里希·黑格尔", "马丁·海德格尔"), "哲学", ""),
            es = LocalizedContent("¿Quién desarrolló el concepto de 'voluntad de poder'?", listOf("Friedrich Nietzsche", "Arthur Schopenhauer", "Friedrich Hegel", "Martin Heidegger"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 8129, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la philosophie analytique cherche principalement ?", listOf("Clarté du langage et analyse logique des propositions", "Expérience mystique", "Sagesse pratique", "Compréhension de l'être"), "Philosophie", ""),
            en = LocalizedContent("What does analytic philosophy primarily seek?", listOf("Clarity of language and logical analysis of propositions", "Mystical experience", "Practical wisdom", "Understanding of being"), "Philosophy", ""),
            zh = LocalizedContent("分析哲学主要追求什么？", listOf("语言的清晰和命题的逻辑分析", "神秘体验", "实践智慧", "对存在的理解"), "哲学", ""),
            es = LocalizedContent("¿Qué busca principalmente la filosofía analítica?", listOf("Claridad del lenguaje y análisis lógico de las proposiciones", "Experiencia mística", "Sabiduría práctica", "Comprensión del ser"), "Filosofía", "")
        ),
        BilingualQuestion(
            id = 8130, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre de passes décisives en un match?", listOf("20", "21", "22", "25"), "Sport", "Le record de 21 passes décisives en un match a été établi par Scottie Pippen lors d'un match de NBA en 1994, un record qui tient toujours dans l'histoire de la ligue."),
            en = LocalizedContent("What is the record for the most assists in a single game?", listOf("20", "21", "22", "25"), "Sports", "The record of 21 assists in a single game was set by Scottie Pippen during an NBA game in 1994, a record that still stands in league history."),
            zh = LocalizedContent("单场比赛助攻数最多的纪录是多少？", listOf("20", "21", "22", "25"), "体育", "单场21次助攻的纪录由斯科蒂·皮蓬在1994年的一场NBA比赛中创造，这一纪录至今仍在联盟历史上保持。"),
            es = LocalizedContent("¿Cuál es el récord de más asistencias en un solo partido?", listOf("20", "21", "22", "25"), "Deportes", "El récord de 21 asistencias en un partido fue establecido por Scottie Pippen en un partido de la NBA en 1994, un récord que aún se mantiene en la historia de la liga.")
        ),
        BilingualQuestion(
            id = 8131, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le Spurs a-t-il remporté son premier championship?", listOf("1997", "1999", "2001", "2003"), "Sport", "Les San Antonio Spurs ont remporté leur premier titre NBA en 1999, en battant les New York Knicks en finale. Cette victoire marquait le début de l'ère Tim Duncan sous la direction de Gregg Popovich."),
            en = LocalizedContent("In what year did the Spurs win their first championship?", listOf("1997", "1999", "2001", "2003"), "Sports", "The San Antonio Spurs won their first NBA title in 1999, defeating the New York Knicks in the Finals. This victory marked the beginning of the Tim Duncan era under Gregg Popovich."),
            zh = LocalizedContent("马刺队在哪一年赢得了他们的第一个总冠军？", listOf("1997", "1999", "2001", "2003"), "体育", "圣安东尼奥马刺队在1999年赢得了他们的第一个NBA总冠军，在总决赛中击败了纽约尼克斯队。这场胜利标志着在格雷格·波波维奇领导下蒂姆·邓肯时代的开始。"),
            es = LocalizedContent("¿En qué año ganaron los Spurs su primer campeonato?", listOf("1997", "1999", "2001", "2003"), "Deportes", "Los San Antonio Spurs ganaron su primer título de la NBA en 1999, derrotando a los New York Knicks en las Finales. Esta victoria marcó el comienzo de la era de Tim Duncan bajo la dirección de Gregg Popovich.")
        ),
        BilingualQuestion(
            id = 8132, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de fois Malone a-t-il remporté le MVP?", listOf("1", "2", "3", "4"), "Sport", "Karl Malone a remporté le titre de MVP de la NBA à deux reprises, en 1997 et 1999, alors qu'il jouait pour le Utah Jazz."),
            en = LocalizedContent("How many times did Malone win the MVP?", listOf("1", "2", "3", "4"), "Sports", "Karl Malone won the NBA MVP award twice, in 1997 and 1999, while playing for the Utah Jazz."),
            zh = LocalizedContent("马龙赢得了多少次MVP？", listOf("1", "2", "3", "4"), "体育", "卡尔·马龙在效力犹他爵士队期间，于1997年和1999年两次获得NBA最有价值球员奖。"),
            es = LocalizedContent("¿Cuántas veces ganó Malone el MVP?", listOf("1", "2", "3", "4"), "Deportes", "Karl Malone ganó el premio MVP de la NBA dos veces, en 1997 y 1999, mientras jugaba para los Utah Jazz.")
        ),
        BilingualQuestion(
            id = 8133, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel joueur a le plus grand nombre de steals en carrière?", listOf("Michael Jordan", "John Stockton", "Karl Malone", "Charles Barkley"), "Sport", "John Stockton détient le record NBA de steals en carrière avec 3 265 interceptions, une marque qu'il a établie durant ses 19 saisons avec le Utah Jazz."),
            en = LocalizedContent("Which player has the most career steals?", listOf("Michael Jordan", "John Stockton", "Karl Malone", "Charles Barkley"), "Sports", "John Stockton holds the NBA record for career steals with 3,265, a mark he set during his 19 seasons with the Utah Jazz."),
            zh = LocalizedContent("哪位球员职业生涯抢断数最多？", listOf("迈克尔·乔丹", "约翰·斯托克顿", "卡尔·马龙", "查尔斯·巴克利"), "体育", "约翰·斯托克顿保持着NBA职业生涯抢断纪录，共3,265次，这一纪录是在他为犹他爵士队效力的19个赛季中创造的。"),
            es = LocalizedContent("¿Qué jugador tiene la mayor cantidad de robos en su carrera?", listOf("Michael Jordan", "John Stockton", "Karl Malone", "Charles Barkley"), "Deportes", "John Stockton posee el récord de la NBA de robos en su carrera con 3,265, una marca que estableció durante sus 19 temporadas con los Utah Jazz.")
        ),
        BilingualQuestion(
            id = 8134, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'ABA a-t-elle fusionné avec la NBA?", listOf("1974", "1976", "1978", "1980"), "Sport", "L'American Basketball Association (ABA) a cessé ses activités et quatre de ses équipes ont rejoint la NBA en 1976, marquant la fin de la rivalité entre les deux ligues."),
            en = LocalizedContent("In what year did the ABA merge with the NBA?", listOf("1974", "1976", "1978", "1980"), "Sports", "The American Basketball Association (ABA) ceased operations and four of its teams joined the NBA in 1976, marking the end of the rivalry between the two leagues."),
            zh = LocalizedContent("ABA在哪一年与NBA合并？", listOf("1974", "1976", "1978", "1980"), "体育", "美国篮球协会（ABA）于1976年停止运营，其四支球队加入NBA，标志着两个联盟之间竞争的结束。"),
            es = LocalizedContent("¿En qué año se fusionó la ABA con la NBA?", listOf("1974", "1976", "1978", "1980"), "Deportes", "La Asociación Estadounidense de Baloncesto (ABA) cesó sus operaciones y cuatro de sus equipos se unieron a la NBA en 1976, marcando el fin de la rivalidad entre las dos ligas.")
        ),
        BilingualQuestion(
            id = 8135, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois Isaiah Thomas a-t-il remporté le championship?", listOf("0", "1", "2", "3"), "Sport", "Isaiah Thomas n'a jamais gagné de titre NBA, malgré une carrière marquée par des performances individuelles remarquables comme ses 53 points en playoffs 2017."),
            en = LocalizedContent("How many times did Isaiah Thomas win the championship?", listOf("0", "1", "2", "3"), "Sports", "Isaiah Thomas never won an NBA title, despite a career marked by remarkable individual performances such as his 53 points in the 2017 playoffs."),
            zh = LocalizedContent("以赛亚·托马斯赢得了多少次总冠军？", listOf("0", "1", "2", "3"), "体育", "以赛亚·托马斯从未赢得过NBA总冠军，尽管他的职业生涯中有过出色的个人表现，例如2017年季后赛的53分。"),
            es = LocalizedContent("¿Cuántas veces ganó Isaiah Thomas el campeonato?", listOf("0", "1", "2", "3"), "Deportes", "Isaiah Thomas nunca ganó un título de la NBA, a pesar de una carrera marcada por actuaciones individuales notables como sus 53 puntos en los playoffs de 2017.")
        ),
        BilingualQuestion(
            id = 8136, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre de points en demi-finale?", listOf("60", "65", "70", "75"), "Sport", "Le record de 65 points en demi-finale a été établi par Michael Jordan lors du match 4 des playoffs NBA 1986 contre les Celtics de Boston."),
            en = LocalizedContent("What is the record for the most points in a semifinal game?", listOf("60", "65", "70", "75"), "Sports", "The record of 65 points in a semifinal game was set by Michael Jordan in Game 4 of the 1986 NBA playoffs against the Boston Celtics."),
            zh = LocalizedContent("半决赛单场最高得分纪录是多少？", listOf("60", "65", "70", "75"), "体育", "半决赛单场65分的纪录由迈克尔·乔丹在1986年NBA季后赛对阵波士顿凯尔特人队的第四场比赛中创造。"),
            es = LocalizedContent("¿Cuál es el récord de más puntos en un partido de semifinales?", listOf("60", "65", "70", "75"), "Deportes", "El récord de 65 puntos en un partido de semifinales fue establecido por Michael Jordan en el Juego 4 de los playoffs de la NBA de 1986 contra los Boston Celtics.")
        ),
        BilingualQuestion(
            id = 8137, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Magic Johnson et Bird ont-ils commencé leur rivalité?", listOf("1979", "1980", "1981", "1982"), "Sport", "Magic Johnson et Larry Bird se sont affrontés pour la première fois en finale NCAA en 1979, mais leur rivalité légendaire en NBA a débuté en 1980 lors des Finales NBA, où les Lakers de Johnson ont battu les Celtics de Bird."),
            en = LocalizedContent("In what year did Magic Johnson and Bird begin their rivalry?", listOf("1979", "1980", "1981", "1982"), "Sports", "Magic Johnson and Larry Bird first faced off in the 1979 NCAA Finals, but their legendary NBA rivalry began in 1980 during the NBA Finals, where Johnson's Lakers defeated Bird's Celtics."),
            zh = LocalizedContent("魔术师约翰逊和伯德在哪一年开始了他们的竞争？", listOf("1979", "1980", "1981", "1982"), "体育", "魔术师约翰逊和拉里·伯德首次在1979年NCAA总决赛中交手，但他们在NBA的传奇竞争始于1980年的NBA总决赛，当时约翰逊的湖人队击败了伯德的凯尔特人队。"),
            es = LocalizedContent("¿En qué año comenzaron su rivalidad Magic Johnson y Bird?", listOf("1979", "1980", "1981", "1982"), "Deportes", "Magic Johnson y Larry Bird se enfrentaron por primera vez en las Finales de la NCAA de 1979, pero su legendaria rivalidad en la NBA comenzó en 1980 durante las Finales de la NBA, donde los Lakers de Johnson derrotaron a los Celtics de Bird.")
        ),
        BilingualQuestion(
            id = 8138, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois Pat Riley a-t-il remporté le championship en tant que joueur?", listOf("1", "2", "3", "4"), "Sport", "Pat Riley a remporté le titre NBA en 1972 avec les Los Angeles Lakers, puis en 1980 et 1982 en tant que joueur des Lakers, totalisant trois championnats."),
            en = LocalizedContent("How many times did Pat Riley win the championship as a player?", listOf("1", "2", "3", "4"), "Sports", "Pat Riley won the NBA title in 1972 with the Los Angeles Lakers, and then in 1980 and 1982 as a player for the Lakers, totaling three championships."),
            zh = LocalizedContent("帕特·莱利作为球员赢得了多少次总冠军？", listOf("1", "2", "3", "4"), "体育", "帕特·莱利在1972年随洛杉矶湖人队赢得NBA总冠军，随后在1980年和1982年作为湖人球员再次夺冠，共获得三个总冠军。"),
            es = LocalizedContent("¿Cuántas veces ganó Pat Riley el campeonato como jugador?", listOf("1", "2", "3", "4"), "Deportes", "Pat Riley ganó el título de la NBA en 1972 con Los Angeles Lakers, y luego en 1980 y 1982 como jugador de los Lakers, totalizando tres campeonatos.")
        ),
        BilingualQuestion(
            id = 8139, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel joueur a le meilleur pourcentage de tirs libres en carrière?", listOf("Ray Allen", "Steve Nash", "Steph Curry", "Kevin Durant"), "Sport", "Steve Nash détient le record du meilleur pourcentage de lancers francs en carrière en NBA avec 90,4%, devant Mark Price et Stephen Curry."),
            en = LocalizedContent("Which player has the best career free throw percentage?", listOf("Ray Allen", "Steve Nash", "Steph Curry", "Kevin Durant"), "Sports", "Steve Nash holds the record for the best career free throw percentage in the NBA at 90.4%, ahead of Mark Price and Stephen Curry."),
            zh = LocalizedContent("哪位球员职业生涯罚球命中率最高？", listOf("雷·阿伦", "史蒂夫·纳什", "斯蒂芬·库里", "凯文·杜兰特"), "体育", "史蒂夫·纳什保持着NBA职业生涯罚球命中率最高的纪录，达到90.4%，领先于马克·普莱斯和斯蒂芬·库里。"),
            es = LocalizedContent("¿Qué jugador tiene el mejor porcentaje de tiros libres en su carrera?", listOf("Ray Allen", "Steve Nash", "Steph Curry", "Kevin Durant"), "Deportes", "Steve Nash posee el récord del mejor porcentaje de tiros libres en la carrera en la NBA con un 90.4%, por delante de Mark Price y Stephen Curry.")
        ),
        BilingualQuestion(
            id = 8140, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le All-Star Game a-t-il commencé?", listOf("1949", "1951", "1953", "1955"), "Sport", "Le premier All-Star Game de la NBA a eu lieu en 1951 au Boston Garden, opposant les meilleurs joueurs de la conférence Est à ceux de la conférence Ouest."),
            en = LocalizedContent("In what year did the All-Star Game begin?", listOf("1949", "1951", "1953", "1955"), "Sports", "The first NBA All-Star Game took place in 1951 at the Boston Garden, pitting the best players from the Eastern Conference against those from the Western Conference."),
            zh = LocalizedContent("全明星赛始于哪一年？", listOf("1949", "1951", "1953", "1955"), "体育", "首届NBA全明星赛于1951年在波士顿花园举行，由东部联盟最佳球员对阵西部联盟最佳球员。"),
            es = LocalizedContent("¿En qué año comenzó el Juego de las Estrellas?", listOf("1949", "1951", "1953", "1955"), "Deportes", "El primer Juego de las Estrellas de la NBA se celebró en 1951 en el Boston Garden, enfrentando a los mejores jugadores de la Conferencia Este contra los de la Conferencia Oeste.")
        ),
        BilingualQuestion(
            id = 8141, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de fois Scottie Pippen a-t-il remporté le championship?", listOf("5", "6", "7", "8"), "Sport", "Scottie Pippen a remporté six titres NBA avec les Chicago Bulls, tous aux côtés de Michael Jordan, lors des saisons 1990-1991, 1991-1992, 1992-1993, 1995-1996, 1996-1997 et 1997-1998."),
            en = LocalizedContent("How many times did Scottie Pippen win the championship?", listOf("5", "6", "7", "8"), "Sports", "Scottie Pippen won six NBA titles with the Chicago Bulls, all alongside Michael Jordan, in the 1990-1991, 1991-1992, 1992-1993, 1995-1996, 1996-1997, and 1997-1998 seasons."),
            zh = LocalizedContent("斯科蒂·皮蓬赢得了多少次总冠军？", listOf("5", "6", "7", "8"), "体育", "斯科蒂·皮蓬随芝加哥公牛队赢得了六次NBA总冠军，全部与迈克尔·乔丹一起，分别在1990-1991、1991-1992、1992-1993、1995-1996、1996-1997和1997-1998赛季。"),
            es = LocalizedContent("¿Cuántas veces ganó Scottie Pippen el campeonato?", listOf("5", "6", "7", "8"), "Deportes", "Scottie Pippen ganó seis títulos de la NBA con los Chicago Bulls, todos junto a Michael Jordan, en las temporadas 1990-1991, 1991-1992, 1992-1993, 1995-1996, 1996-1997 y 1997-1998.")
        ),
        BilingualQuestion(
            id = 8142, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre de rebonds en une saison?", listOf("1500", "1600", "1700", "1800"), "Sport", "Le record de 1700 rebonds en une saison NBA a été établi par Wilt Chamberlain en 1961-1962, une performance inégalée depuis."),
            en = LocalizedContent("What is the record for the most rebounds in a season?", listOf("1500", "1600", "1700", "1800"), "Sports", "The record of 1700 rebounds in an NBA season was set by Wilt Chamberlain in 1961-1962, a performance unmatched since."),
            zh = LocalizedContent("单赛季篮板球最高纪录是多少？", listOf("1500", "1600", "1700", "1800"), "体育", "NBA单赛季1700个篮板球的纪录由威尔特·张伯伦在1961-1962赛季创造，至今无人打破。"),
            es = LocalizedContent("¿Cuál es el récord de más rebotes en una temporada?", listOf("1500", "1600", "1700", "1800"), "Deportes", "El récord de 1700 rebotes en una temporada de la NBA fue establecido por Wilt Chamberlain en 1961-1962, una actuación no igualada desde entonces.")
        ),
        BilingualQuestion(
            id = 8143, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Draft NBA a-t-il commencé?", listOf("1961", "1963", "1965", "1967"), "Sport", "Le premier repêchage de la NBA a eu lieu en 1947, mais c'est en 1963 que le système moderne, avec des tours de sélection et un ordre basé sur les classements, a été officiellement adopté."),
            en = LocalizedContent("In what year did the NBA Draft begin?", listOf("1961", "1963", "1965", "1967"), "Sports", "The first NBA draft took place in 1947, but it was in 1963 that the modern system, with selection rounds and an order based on standings, was officially adopted."),
            zh = LocalizedContent("NBA选秀始于哪一年？", listOf("1961", "1963", "1965", "1967"), "体育", "首届NBA选秀于1947年举行，但现代选秀制度（包括多轮选择和基于战绩的选秀顺序）于1963年正式采用。"),
            es = LocalizedContent("¿En qué año comenzó el Draft de la NBA?", listOf("1961", "1963", "1965", "1967"), "Deportes", "El primer draft de la NBA tuvo lugar en 1947, pero fue en 1963 cuando se adoptó oficialmente el sistema moderno, con rondas de selección y un orden basado en las clasificaciones.")
        ),
        BilingualQuestion(
            id = 8144, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois Dennis Rodman a-t-il remporté le rebounding title?", listOf("5", "6", "7", "8"), "Sport", "Dennis Rodman a mené la NBA au rebond pendant sept saisons consécutives, de 1992 à 1998, un record pour un joueur non-pivot."),
            en = LocalizedContent("How many times did Dennis Rodman win the rebounding title?", listOf("5", "6", "7", "8"), "Sports", "Dennis Rodman led the NBA in rebounding for seven consecutive seasons, from 1992 to 1998, a record for a non-center player."),
            zh = LocalizedContent("丹尼斯·罗德曼赢得了多少次篮板王？", listOf("5", "6", "7", "8"), "体育", "丹尼斯·罗德曼连续七个赛季（1992年至1998年）领跑NBA篮板榜，这是非中锋球员的纪录。"),
            es = LocalizedContent("¿Cuántas veces ganó Dennis Rodman el título de rebotes?", listOf("5", "6", "7", "8"), "Deportes", "Dennis Rodman lideró la NBA en rebotes durante siete temporadas consecutivas, de 1992 a 1998, un récord para un jugador no pívot.")
        ),
        BilingualQuestion(
            id = 8145, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel joueur a le plus grand nombre de blocks en carrière?", listOf("Dikembe Mutombo", "Kareem Abdul-Jabbar", "Hakeem Olajuwon", "Mark Eaton"), "Sport", "Hakeem Olajuwon détient le record de blocks en carrière avec 3 830, devant Dikembe Mutombo. Il était réputé pour son agilité défensive et son timing exceptionnel sous le panier."),
            en = LocalizedContent("Which player has the most career blocks?", listOf("Dikembe Mutombo", "Kareem Abdul-Jabbar", "Hakeem Olajuwon", "Mark Eaton"), "Sports", "Hakeem Olajuwon holds the career blocks record with 3,830, ahead of Dikembe Mutombo. He was known for his defensive agility and exceptional timing under the basket."),
            zh = LocalizedContent("哪位球员职业生涯盖帽数最多？", listOf("迪肯贝·穆托姆博", "卡里姆·阿卜杜尔-贾巴尔", "哈基姆·奥拉朱旺", "马克·伊顿"), "体育", "哈基姆·奥拉朱旺以3830次盖帽保持职业生涯盖帽纪录，领先于迪肯贝·穆托姆博。他以防守灵活性和篮下出色的时机把握而闻名。"),
            es = LocalizedContent("¿Qué jugador tiene la mayor cantidad de tapones en su carrera?", listOf("Dikembe Mutombo", "Kareem Abdul-Jabbar", "Hakeem Olajuwon", "Mark Eaton"), "Deportes", "Hakeem Olajuwon posee el récord de tapones en carrera con 3,830, por delante de Dikembe Mutombo. Era conocido por su agilidad defensiva y su excepcional timing bajo el aro.")
        ),
        BilingualQuestion(
            id = 8146, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Jordan a-t-il remporté son premier MVP?", listOf("1987", "1988", "1989", "1991"), "Sport", "Michael Jordan a remporté son premier titre de MVP de la saison régulière en 1988, après une saison exceptionnelle où il a mené la ligue au scoring et été élu défenseur de l'année."),
            en = LocalizedContent("In what year did Jordan win his first MVP?", listOf("1987", "1988", "1989", "1991"), "Sports", "Michael Jordan won his first regular season MVP award in 1988, after an exceptional season where he led the league in scoring and was named Defensive Player of the Year."),
            zh = LocalizedContent("乔丹在哪一年赢得了他的第一个MVP？", listOf("1987", "1988", "1989", "1991"), "体育", "迈克尔·乔丹在1988年赢得了他的第一个常规赛MVP，此前他打出了一个非凡的赛季，领跑联盟得分榜并被评为年度最佳防守球员。"),
            es = LocalizedContent("¿En qué año ganó Jordan su primer MVP?", listOf("1987", "1988", "1989", "1991"), "Deportes", "Michael Jordan ganó su primer premio MVP de la temporada regular en 1988, tras una temporada excepcional en la que lideró la liga en anotación y fue nombrado Defensor del Año.")
        ),
        BilingualQuestion(
            id = 8147, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de fois l'équipe Redeem Team a-t-elle remporté l'or olympique?", listOf("1", "2", "3", "4"), "Sport", "Surnommée la \"Redeem Team\", l'équipe américaine de basket-ball masculin a remporté l'or aux Jeux de Pékin en 2008, après une déception en 2004."),
            en = LocalizedContent("How many times did the Redeem Team win Olympic gold?", listOf("1", "2", "3", "4"), "Sports", "Nicknamed the \"Redeem Team,\" the U.S. men's basketball team won gold at the 2008 Beijing Olympics, after a disappointment in 2004."),
            zh = LocalizedContent("救赎之队赢得了多少次奥运金牌？", listOf("1", "2", "3", "4"), "体育", "绰号“救赎之队”的美国男子篮球队在2008年北京奥运会上夺得金牌，此前在2004年遭遇失利。"),
            es = LocalizedContent("¿Cuántas veces ganó el Equipo de Redención el oro olímpico?", listOf("1", "2", "3", "4"), "Deportes", "Apodado el \"Equipo de Redención\", el equipo masculino de baloncesto de Estados Unidos ganó el oro en los Juegos Olímpicos de Pekín 2008, tras una decepción en 2004.")
        ),
        BilingualQuestion(
            id = 8148, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre de points en playoffs?", listOf("2000", "2100", "2200", "2300"), "Sport", "LeBron James détient ce record avec 2100 points cumulés en playoffs NBA. Il a dépassé Michael Jordan, qui avait le précédent record de 5987 points."),
            en = LocalizedContent("What is the record for the most points in the playoffs?", listOf("2000", "2100", "2200", "2300"), "Sports", "LeBron James holds this record with 2100 cumulative points in the NBA playoffs. He surpassed Michael Jordan, who had the previous record of 5987 points."),
            zh = LocalizedContent("季后赛总得分纪录是多少？", listOf("2000", "2100", "2200", "2300"), "体育", "勒布朗·詹姆斯以2100分保持NBA季后赛总得分纪录。他超越了此前由迈克尔·乔丹保持的5987分纪录。"),
            es = LocalizedContent("¿Cuál es el récord de más puntos en los playoffs?", listOf("2000", "2100", "2200", "2300"), "Deportes", "LeBron James posee este récord con 2100 puntos acumulados en los playoffs de la NBA. Superó a Michael Jordan, quien tenía el récord anterior de 5987 puntos.")
        ),
        BilingualQuestion(
            id = 8149, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Giannis Antetokounmpo a-t-il remporté son premier MVP?", listOf("2018", "2019", "2020", "2021"), "Sport", "Giannis Antetokounmpo a été élu MVP de la saison régulière NBA en 2019, après avoir mené les Bucks de Milwaukee au meilleur bilan de la ligue."),
            en = LocalizedContent("In what year did Giannis Antetokounmpo win his first MVP?", listOf("2018", "2019", "2020", "2021"), "Sports", "Giannis Antetokounmpo was named NBA regular season MVP in 2019, after leading the Milwaukee Bucks to the best record in the league."),
            zh = LocalizedContent("扬尼斯·阿德托昆博在哪一年赢得了他的第一个MVP？", listOf("2018", "2019", "2020", "2021"), "体育", "扬尼斯·阿德托昆博在2019年被评为NBA常规赛MVP，此前他带领密尔沃基雄鹿队取得了联盟最佳战绩。"),
            es = LocalizedContent("¿En qué año ganó Giannis Antetokounmpo su primer MVP?", listOf("2018", "2019", "2020", "2021"), "Deportes", "Giannis Antetokounmpo fue nombrado MVP de la temporada regular de la NBA en 2019, tras liderar a los Milwaukee Bucks al mejor récord de la liga.")
        ),
        BilingualQuestion(
            id = 8150, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le record du 100m hommes?", listOf("9.58s", "9.63s", "9.69s", "9.72s"), "Sport", "Le record du 100 mètres hommes est détenu par Usain Bolt, qui a couru en 9,58 secondes aux Championnats du monde d'athlétisme de 2009 à Berlin."),
            en = LocalizedContent("What is the men's 100m record?", listOf("9.58s", "9.63s", "9.69s", "9.72s"), "Sports", "The men's 100m record is held by Usain Bolt, who ran 9.58 seconds at the 2009 World Athletics Championships in Berlin."),
            zh = LocalizedContent("男子100米纪录是多少？", listOf("9.58秒", "9.63秒", "9.69秒", "9.72秒"), "体育", "男子100米纪录由尤塞恩·博尔特保持，他在2009年柏林世界田径锦标赛上跑出9.58秒。"),
            es = LocalizedContent("¿Cuál es el récord de los 100m masculinos?", listOf("9.58s", "9.63s", "9.69s", "9.72s"), "Deportes", "El récord de los 100 metros masculinos lo posee Usain Bolt, quien corrió en 9,58 segundos en el Campeonato Mundial de Atletismo de 2009 en Berlín.")
        ),
        BilingualQuestion(
            id = 8151, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui détient le record du 100m?", listOf("Tyson Gay", "Yohan Blake", "Usain Bolt", "Justin Gatlin"), "Sport", "Usain Bolt a établi le record du monde du 100 mètres en 9,58 secondes aux championnats du monde de 2009 à Berlin, performance jamais égalée depuis."),
            en = LocalizedContent("Who holds the 100m record?", listOf("Tyson Gay", "Yohan Blake", "Usain Bolt", "Justin Gatlin"), "Sports", "Usain Bolt set the world record for the 100 meters at 9.58 seconds at the 2009 World Championships in Berlin, a performance never equaled since."),
            zh = LocalizedContent("谁保持着100米纪录？", listOf("泰森·盖伊", "约汉·布雷克", "尤塞恩·博尔特", "贾斯汀·加特林"), "体育", "尤塞恩·博尔特在2009年柏林世锦赛上以9.58秒创造了100米世界纪录，至今无人打破。"),
            es = LocalizedContent("¿Quién posee el récord de los 100m?", listOf("Tyson Gay", "Yohan Blake", "Usain Bolt", "Justin Gatlin"), "Deportes", "Usain Bolt estableció el récord mundial de los 100 metros en 9,58 segundos en el Campeonato Mundial de 2009 en Berlín, una marca nunca igualada desde entonces.")
        ),
        BilingualQuestion(
            id = 8152, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 1500m hommes?", listOf("3:26", "3:27", "3:28", "3:29"), "Sport", "Le record du monde du 1500 mètres hommes est de 3 minutes et 26 secondes, établi par le Marocain Hicham El Guerrouj en 1998. Ce chrono reste inégalé depuis plus de 25 ans."),
            en = LocalizedContent("What is the men's 1500m record?", listOf("3:26", "3:27", "3:28", "3:29"), "Sports", "The men's 1500m world record is 3 minutes and 26 seconds, set by Moroccan Hicham El Guerrouj in 1998. This time has remained unbeaten for over 25 years."),
            zh = LocalizedContent("男子1500米纪录是多少？", listOf("3:26", "3:27", "3:28", "3:29"), "体育", "男子1500米世界纪录是3分26秒，由摩洛哥选手希沙姆·埃尔·盖鲁伊于1998年创造，这一成绩已保持超过25年未被打破。"),
            es = LocalizedContent("¿Cuál es el récord de los 1500m masculinos?", listOf("3:26", "3:27", "3:28", "3:29"), "Deportes", "El récord mundial de los 1500 metros masculinos es de 3 minutos y 26 segundos, establecido por el marroquí Hicham El Guerrouj en 1998. Esta marca permanece imbatida desde hace más de 25 años.")
        ),
        BilingualQuestion(
            id = 8153, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du marathon?", listOf("Eliud Kipchoge", "Dennis Kimetto", "Wilson Kipsang", "Kenenisa Bekele"), "Sport", "Le record officiel du marathon est détenu par le Kényan Eliud Kipchoge, qui a couru en 2 heures, 1 minute et 39 secondes lors du marathon de Berlin en 2022."),
            en = LocalizedContent("Who holds the marathon record?", listOf("Eliud Kipchoge", "Dennis Kimetto", "Wilson Kipsang", "Kenenisa Bekele"), "Sports", "The official marathon record is held by Kenyan Eliud Kipchoge, who ran 2 hours, 1 minute and 39 seconds at the Berlin Marathon in 2022."),
            zh = LocalizedContent("谁保持着马拉松纪录？", listOf("埃利乌德·基普乔格", "丹尼斯·基梅托", "威尔逊·基普桑", "凯内尼萨·贝克勒"), "体育", "官方马拉松纪录由肯尼亚选手埃利乌德·基普乔格保持，他在2022年柏林马拉松上跑出2小时1分39秒。"),
            es = LocalizedContent("¿Quién posee el récord de maratón?", listOf("Eliud Kipchoge", "Dennis Kimetto", "Wilson Kipsang", "Kenenisa Bekele"), "Deportes", "El récord oficial de maratón lo posee el keniano Eliud Kipchoge, quien corrió en 2 horas, 1 minuto y 39 segundos en el Maratón de Berlín de 2022.")
        ),
        BilingualQuestion(
            id = 8154, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le temps record du marathon?", listOf("2:01:39", "2:01:09", "2:00:25", "1:59:40"), "Sport", "Le record du monde du marathon est détenu par Kelvin Kiptum, qui a couru en 2:00:35 à Chicago en 2023, mais le temps de 2:01:09 correspond à l'ancien record d'Eliud Kipchoge établi à Berlin en 2022."),
            en = LocalizedContent("What is the marathon record time?", listOf("2:01:39", "2:01:09", "2:00:25", "1:59:40"), "Sports", "The marathon world record is held by Kelvin Kiptum, who ran 2:00:35 in Chicago in 2023, but the time 2:01:09 corresponds to Eliud Kipchoge's former record set in Berlin in 2022."),
            zh = LocalizedContent("马拉松纪录时间是多少？", listOf("2:01:39", "2:01:09", "2:00:25", "1:59:40"), "体育", "马拉松世界纪录由凯尔文·基普图姆保持，他在2023年芝加哥跑出2:00:35，但2:01:09对应的是埃利乌德·基普乔格2022年在柏林创造的先前纪录。"),
            es = LocalizedContent("¿Cuál es el tiempo récord de maratón?", listOf("2:01:39", "2:01:09", "2:00:25", "1:59:40"), "Deportes", "El récord mundial de maratón lo posee Kelvin Kiptum, quien corrió en 2:00:35 en Chicago en 2023, pero el tiempo de 2:01:09 corresponde al récord anterior de Eliud Kipchoge establecido en Berlín en 2022.")
        ),
        BilingualQuestion(
            id = 8155, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de médailles d'or Jesse Owens a-t-il remportées en 1936?", listOf("2", "3", "4", "5"), "Sport", "Aux Jeux olympiques de Berlin en 1936, Jesse Owens a remporté quatre médailles d'or dans les épreuves du 100 mètres, 200 mètres, saut en longueur et relais 4 x 100 mètres."),
            en = LocalizedContent("How many gold medals did Jesse Owens win in 1936?", listOf("2", "3", "4", "5"), "Sports", "At the 1936 Berlin Olympics, Jesse Owens won four gold medals in the 100 meters, 200 meters, long jump, and 4 x 100 meters relay."),
            zh = LocalizedContent("杰西·欧文斯在1936年赢得了多少枚金牌？", listOf("2", "3", "4", "5"), "体育", "在1936年柏林奥运会上，杰西·欧文斯赢得了四枚金牌，分别是100米、200米、跳远和4x100米接力。"),
            es = LocalizedContent("¿Cuántas medallas de oro ganó Jesse Owens en 1936?", listOf("2", "3", "4", "5"), "Deportes", "En los Juegos Olímpicos de Berlín de 1936, Jesse Owens ganó cuatro medallas de oro en las pruebas de 100 metros, 200 metros, salto de longitud y relevos 4 x 100 metros.")
        ),
        BilingualQuestion(
            id = 8156, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du saut en longueur hommes?", listOf("8.87m", "8.90m", "8.95m", "9.00m"), "Sport", "Le record du monde masculin du saut en longueur est de 8,90 mètres, établi par l'Américain Bob Beamon aux Jeux olympiques de Mexico en 1968. Ce record a tenu pendant 23 ans avant d'être battu par Mike Powell en 1991."),
            en = LocalizedContent("What is the men's long jump record?", listOf("8.87m", "8.90m", "8.95m", "9.00m"), "Sports", "The men's long jump world record is 8.90 meters, set by American Bob Beamon at the 1968 Mexico City Olympics. This record stood for 23 years before being broken by Mike Powell in 1991."),
            zh = LocalizedContent("男子跳远纪录是多少？", listOf("8.87米", "8.90米", "8.95米", "9.00米"), "体育", "男子跳远世界纪录是8.90米，由美国选手鲍勃·比蒙在1968年墨西哥城奥运会上创造。这一纪录保持了23年，直到1991年被迈克·鲍威尔打破。"),
            es = LocalizedContent("¿Cuál es el récord de salto de longitud masculino?", listOf("8.87m", "8.90m", "8.95m", "9.00m"), "Deportes", "El récord mundial de salto de longitud masculino es de 8,90 metros, establecido por el estadounidense Bob Beamon en los Juegos Olímpicos de México 1968. Esta marca duró 23 años hasta que fue superada por Mike Powell en 1991.")
        ),
        BilingualQuestion(
            id = 8157, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du saut en longueur?", listOf("Bob Beamon", "Mike Powell", "Carl Lewis", "Ivan Pedroso"), "Sport", "Mike Powell a établi le record du monde masculin du saut en longueur avec 8,95 mètres aux championnats du monde de Tokyo en 1991, dépassant l'ancien record de Bob Beamon."),
            en = LocalizedContent("Who holds the long jump record?", listOf("Bob Beamon", "Mike Powell", "Carl Lewis", "Ivan Pedroso"), "Sports", "Mike Powell set the men's long jump world record with 8.95 meters at the 1991 World Championships in Tokyo, surpassing Bob Beamon's previous record."),
            zh = LocalizedContent("谁保持着跳远纪录？", listOf("鲍勃·比蒙", "迈克·鲍威尔", "卡尔·刘易斯", "伊万·佩德罗索"), "体育", "迈克·鲍威尔在1991年东京世锦赛上以8.95米创造了男子跳远世界纪录，超越了鲍勃·比蒙之前的纪录。"),
            es = LocalizedContent("¿Quién posee el récord de salto de longitud?", listOf("Bob Beamon", "Mike Powell", "Carl Lewis", "Ivan Pedroso"), "Deportes", "Mike Powell estableció el récord mundial de salto de longitud masculino con 8,95 metros en el Campeonato Mundial de Tokio de 1991, superando el récord anterior de Bob Beamon.")
        ),
        BilingualQuestion(
            id = 8158, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du saut en hauteur hommes?", listOf("2.42m", "2.44m", "2.45m", "2.48m"), "Sport", "Le record du monde masculin du saut en hauteur est détenu par le Cubain Javier Sotomayor avec un saut à 2,45 mètres, établi le 27 juillet 1993 à Salamanque. La réponse 2,48 m est inexacte, car ce record n'a jamais été officiellement homologué."),
            en = LocalizedContent("What is the men's high jump record?", listOf("2.42m", "2.44m", "2.45m", "2.48m"), "Sports", "The men's high jump world record is held by Cuban Javier Sotomayor with a jump of 2.45 meters, set on July 27, 1993 in Salamanca. The answer 2.48m is inaccurate, as this record has never been officially ratified."),
            zh = LocalizedContent("男子跳高纪录是多少？", listOf("2.42米", "2.44米", "2.45米", "2.48米"), "体育", "男子跳高世界纪录由古巴选手哈维尔·索托马约尔保持，他在1993年7月27日于萨拉曼卡跳出了2.45米。2.48米的答案不准确，因为该纪录从未被正式认可。"),
            es = LocalizedContent("¿Cuál es el récord de salto de altura masculino?", listOf("2.42m", "2.44m", "2.45m", "2.48m"), "Deportes", "El récord mundial de salto de altura masculino lo posee el cubano Javier Sotomayor con un salto de 2,45 metros, establecido el 27 de julio de 1993 en Salamanca. La respuesta 2,48 m es inexacta, ya que esta marca nunca ha sido homologada oficialmente.")
        ),
        BilingualQuestion(
            id = 8159, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du saut en hauteur?", listOf("Javier Sotomayor", "Ivan Ukhov", "Mutaz Essa Barshim", "Hamish Kerr"), "Sport", "Le Cubain Javier Sotomayor a établi le record du monde du saut en hauteur le 27 juillet 1993 à Salamanque, avec un bond de 2,45 mètres, record toujours inégalé en 2024."),
            en = LocalizedContent("Who holds the high jump record?", listOf("Javier Sotomayor", "Ivan Ukhov", "Mutaz Essa Barshim", "Hamish Kerr"), "Sports", "Cuban Javier Sotomayor set the high jump world record on July 27, 1993 in Salamanca, with a leap of 2.45 meters, a record still unbeaten as of 2024."),
            zh = LocalizedContent("谁保持着跳高纪录？", listOf("哈维尔·索托马约尔", "伊万·乌霍夫", "穆塔兹·伊萨·巴尔希姆", "哈米什·克尔"), "体育", "古巴选手哈维尔·索托马约尔于1993年7月27日在萨拉曼卡创造了跳高世界纪录，跳出了2.45米，截至2024年这一纪录仍未被打破。"),
            es = LocalizedContent("¿Quién posee el récord de salto de altura?", listOf("Javier Sotomayor", "Ivan Ukhov", "Mutaz Essa Barshim", "Hamish Kerr"), "Deportes", "El cubano Javier Sotomayor estableció el récord mundial de salto de altura el 27 de julio de 1993 en Salamanca, con un salto de 2,45 metros, marca aún imbatida en 2024.")
        ),
        BilingualQuestion(
            id = 8160, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du triple saut hommes?", listOf("17.95m", "17.97m", "18.16m", "18.29m"), "Sport", "Le record du monde du triple saut masculin est détenu par l'Américain Jonathan Edwards avec 18,29 mètres, établi le 7 août 1995 aux championnats du monde de Göteborg."),
            en = LocalizedContent("What is the men's triple jump record?", listOf("17.95m", "17.97m", "18.16m", "18.29m"), "Sports", "The men's triple jump world record is held by American Jonathan Edwards with 18.29 meters, set on August 7, 1995 at the World Championships in Gothenburg."),
            zh = LocalizedContent("男子三级跳远的纪录是多少？", listOf("17.95米", "17.97米", "18.16米", "18.29米"), "体育", "男子三级跳远世界纪录由美国选手乔纳森·爱德华兹保持，成绩为18.29米，于1995年8月7日在哥德堡世锦赛上创造。"),
            es = LocalizedContent("¿Cuál es el récord de triple salto masculino?", listOf("17.95m", "17.97m", "18.16m", "18.29m"), "Deportes", "El récord mundial de triple salto masculino lo posee el estadounidense Jonathan Edwards con 18,29 metros, establecido el 7 de agosto de 1995 en los Campeonatos Mundiales de Gotemburgo.")
        ),
        BilingualQuestion(
            id = 8161, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du triple saut?", listOf("Jonathan Edwards", "Willie Banks", "Aleksandr Saneyev", "Yannick Bahui"), "Sport", "Jonathan Edwards a établi le record du monde du triple saut avec 18,29 mètres aux Championnats du monde de Göteborg en 1995, un record toujours inégalé en 2024."),
            en = LocalizedContent("Who holds the triple jump record?", listOf("Jonathan Edwards", "Willie Banks", "Aleksandr Saneyev", "Yannick Bahui"), "Sports", "Jonathan Edwards set the world record in triple jump with 18.29 meters at the 1995 World Championships in Gothenburg, a record still unbroken as of 2024."),
            zh = LocalizedContent("谁保持着三级跳远的纪录？", listOf("乔纳森·爱德华兹", "威利·班克斯", "亚历山大·萨涅耶夫", "扬尼克·巴胡伊"), "体育", "乔纳森·爱德华兹在1995年哥德堡世锦赛上以18.29米创造了三级跳远世界纪录，截至2024年仍未被打破。"),
            es = LocalizedContent("¿Quién posee el récord de triple salto?", listOf("Jonathan Edwards", "Willie Banks", "Aleksandr Saneyev", "Yannick Bahui"), "Deportes", "Jonathan Edwards estableció el récord mundial de triple salto con 18,29 metros en los Campeonatos Mundiales de 1995 en Gotemburgo, un récord aún imbatido en 2024.")
        ),
        BilingualQuestion(
            id = 8162, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du lancer du poids hommes?", listOf("23.12m", "23.30m", "23.37m", "23.56m"), "Sport", "Le record du monde masculin du lancer du poids est détenu par Ryan Crouser avec 23,56 mètres, établi le 27 mai 2023 à Eugene, aux États-Unis."),
            en = LocalizedContent("What is the men's shot put record?", listOf("23.12m", "23.30m", "23.37m", "23.56m"), "Sports", "The men's shot put world record is held by Ryan Crouser with 23.56 meters, set on May 27, 2023 in Eugene, USA."),
            zh = LocalizedContent("男子铅球的纪录是多少？", listOf("23.12米", "23.30米", "23.37米", "23.56米"), "体育", "男子铅球世界纪录由瑞安·克劳瑟保持，成绩为23.56米，于2023年5月27日在美国尤金创造。"),
            es = LocalizedContent("¿Cuál es el récord de lanzamiento de peso masculino?", listOf("23.12m", "23.30m", "23.37m", "23.56m"), "Deportes", "El récord mundial de lanzamiento de peso masculino lo posee Ryan Crouser con 23,56 metros, establecido el 27 de mayo de 2023 en Eugene, Estados Unidos.")
        ),
        BilingualQuestion(
            id = 8163, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du lancer du poids?", listOf("Ryan Crouser", "Joe Greene", "Udo Beyer", "Parry O'Brien"), "Sport", "L'Américain Ryan Crouser a établi le record du monde du lancer du poids avec un jet à 23,56 mètres en mai 2023, dépassant son propre précédent record."),
            en = LocalizedContent("Who holds the shot put record?", listOf("Ryan Crouser", "Joe Greene", "Udo Beyer", "Parry O'Brien"), "Sports", "American Ryan Crouser set the world record in shot put with a throw of 23.56 meters in May 2023, surpassing his own previous record."),
            zh = LocalizedContent("谁保持着铅球的纪录？", listOf("瑞安·克劳瑟", "乔·格林", "乌多·拜尔", "帕里·奥布莱恩"), "体育", "美国选手瑞安·克劳瑟在2023年5月以23.56米的成绩创造了铅球世界纪录，超越了他自己之前的纪录。"),
            es = LocalizedContent("¿Quién posee el récord de lanzamiento de peso?", listOf("Ryan Crouser", "Joe Greene", "Udo Beyer", "Parry O'Brien"), "Deportes", "El estadounidense Ryan Crouser estableció el récord mundial de lanzamiento de peso con un lanzamiento de 23,56 metros en mayo de 2023, superando su propio récord anterior.")
        ),
        BilingualQuestion(
            id = 8164, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du lancer du disque hommes?", listOf("70.15m", "70.20m", "74.08m", "74.88m"), "Sport", "Le record du monde masculin du lancer du disque est détenu par le Lituanien Mykolas Alekna avec 74,88 m, établi le 14 avril 2024 à Ramona, aux États-Unis."),
            en = LocalizedContent("What is the men's discus throw record?", listOf("70.15m", "70.20m", "74.08m", "74.88m"), "Sports", "The men's discus throw world record is held by Lithuanian Mykolas Alekna with 74.88 m, set on April 14, 2024 in Ramona, USA."),
            zh = LocalizedContent("男子铁饼的纪录是多少？", listOf("70.15米", "70.20米", "74.08米", "74.88米"), "体育", "男子铁饼世界纪录由立陶宛选手米科拉斯·阿莱克纳保持，成绩为74.88米，于2024年4月14日在美国拉莫纳创造。"),
            es = LocalizedContent("¿Cuál es el récord de lanzamiento de disco masculino?", listOf("70.15m", "70.20m", "74.08m", "74.88m"), "Deportes", "El récord mundial de lanzamiento de disco masculino lo posee el lituano Mykolas Alekna con 74,88 m, establecido el 14 de abril de 2024 en Ramona, Estados Unidos.")
        ),
        BilingualQuestion(
            id = 8165, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du lancer du disque?", listOf("Jurgen Schult", "Al Oerter", "Bogdan Pisarenko", "Virgilijus Alekna"), "Sport", "Jurgen Schult a établi le record du monde du lancer du disque masculin le 6 juin 1986 avec un jet à 74,08 mètres, performance qui tient toujours."),
            en = LocalizedContent("Who holds the discus throw record?", listOf("Jurgen Schult", "Al Oerter", "Bogdan Pisarenko", "Virgilijus Alekna"), "Sports", "Jurgen Schult set the men's discus throw world record on June 6, 1986 with a throw of 74.08 meters, a performance that still stands."),
            zh = LocalizedContent("谁保持着铁饼的纪录？", listOf("于尔根·舒尔特", "阿尔·奥特", "波格丹·皮萨连科", "维尔吉利尤斯·阿莱克纳"), "体育", "于尔根·舒尔特于1986年6月6日以74.08米的成绩创造了男子铁饼世界纪录，这一成绩至今仍未被打破。"),
            es = LocalizedContent("¿Quién posee el récord de lanzamiento de disco?", listOf("Jurgen Schult", "Al Oerter", "Bogdan Pisarenko", "Virgilijus Alekna"), "Deportes", "Jurgen Schult estableció el récord mundial de lanzamiento de disco masculino el 6 de junio de 1986 con un lanzamiento de 74,08 metros, una marca que aún se mantiene.")
        ),
        BilingualQuestion(
            id = 8166, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du lancer du javelot hommes?", listOf("98.40m", "98.48m", "98.66m", "99.83m"), "Sport", "Le record du monde masculin du lancer du javelot est détenu par Jan Železný avec un jet à 98,48 mètres, établi en 1996. La réponse 99,83 mètres est incorrecte."),
            en = LocalizedContent("What is the men's javelin throw record?", listOf("98.40m", "98.48m", "98.66m", "99.83m"), "Sports", "The men's javelin throw world record is held by Jan Železný with a throw of 98.48 meters, set in 1996. The answer 99.83 meters is incorrect."),
            zh = LocalizedContent("男子标枪的纪录是多少？", listOf("98.40米", "98.48米", "98.66米", "99.83米"), "体育", "男子标枪世界纪录由扬·泽莱兹尼保持，成绩为98.48米，于1996年创造。99.83米的答案不正确。"),
            es = LocalizedContent("¿Cuál es el récord de lanzamiento de jabalina masculino?", listOf("98.40m", "98.48m", "98.66m", "99.83m"), "Deportes", "El récord mundial de lanzamiento de jabalina masculino lo posee Jan Železný con un lanzamiento de 98,48 metros, establecido en 1996. La respuesta 99,83 metros es incorrecta.")
        ),
        BilingualQuestion(
            id = 8167, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du lancer du javelot?", listOf("Anderson Peters", "Neeraj Chopra", "Thomas Röhler", "Sergey Makarov"), "Sport", "Sergey Makarov détient le record du monde du lancer du javelot avec un jet de 98,48 mètres, réalisé en 1994 lors d'une compétition à Berlin."),
            en = LocalizedContent("Who holds the javelin throw record?", listOf("Anderson Peters", "Neeraj Chopra", "Thomas Röhler", "Sergey Makarov"), "Sports", "Sergey Makarov holds the world record in javelin throw with a throw of 98.48 meters, achieved in 1994 at a competition in Berlin."),
            zh = LocalizedContent("谁保持着标枪的纪录？", listOf("安德森·彼得斯", "尼拉杰·乔普拉", "托马斯·罗勒", "谢尔盖·马卡罗夫"), "体育", "谢尔盖·马卡罗夫以98.48米的成绩保持着标枪世界纪录，该成绩于1994年在柏林的一次比赛中创造。"),
            es = LocalizedContent("¿Quién posee el récord de lanzamiento de jabalina?", listOf("Anderson Peters", "Neeraj Chopra", "Thomas Röhler", "Sergey Makarov"), "Deportes", "Sergey Makarov posee el récord mundial de lanzamiento de jabalina con un lanzamiento de 98,48 metros, logrado en 1994 en una competición en Berlín.")
        ),
        BilingualQuestion(
            id = 8168, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 400m femmes?", listOf("47.60s", "48.25s", "48.63s", "49.13s"), "Sport", "Le record du monde du 400 mètres féminin est détenu par Marita Koch depuis 1985, avec un temps de 47,60 secondes établi à Canberra, en Australie."),
            en = LocalizedContent("What is the women's 400m record?", listOf("47.60s", "48.25s", "48.63s", "49.13s"), "Sports", "The women's 400 meters world record is held by Marita Koch since 1985, with a time of 47.60 seconds set in Canberra, Australia."),
            zh = LocalizedContent("女子400米的纪录是多少？", listOf("47.60秒", "48.25秒", "48.63秒", "49.13秒"), "体育", "女子400米世界纪录由玛丽塔·科赫自1985年保持，成绩为47.60秒，在澳大利亚堪培拉创造。"),
            es = LocalizedContent("¿Cuál es el récord de 400m femenino?", listOf("47.60s", "48.25s", "48.63s", "49.13s"), "Deportes", "El récord mundial de 400 metros femenino lo posee Marita Koch desde 1985, con un tiempo de 47,60 segundos establecido en Canberra, Australia.")
        ),
        BilingualQuestion(
            id = 8169, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 400m femmes?", listOf("Marita Koch", "Florence Griffith-Joyner", "Sanya Richards-Ross", "Christine Bottiglieri"), "Sport", "Marita Koch a établi le record du monde du 400 mètres féminin en 1985 avec un temps de 47,60 secondes, un record toujours inégalé aujourd'hui."),
            en = LocalizedContent("Who holds the women's 400m record?", listOf("Marita Koch", "Florence Griffith-Joyner", "Sanya Richards-Ross", "Christine Bottiglieri"), "Sports", "Marita Koch set the women's 400 meters world record in 1985 with a time of 47.60 seconds, a record still unbroken today."),
            zh = LocalizedContent("谁保持着女子400米的纪录？", listOf("玛丽塔·科赫", "弗洛伦斯·格里菲斯-乔伊娜", "桑娅·理查兹-罗斯", "克里斯蒂娜·博蒂列里"), "体育", "玛丽塔·科赫在1985年以47.60秒创造了女子400米世界纪录，这一纪录至今未被打破。"),
            es = LocalizedContent("¿Quién posee el récord de 400m femenino?", listOf("Marita Koch", "Florence Griffith-Joyner", "Sanya Richards-Ross", "Christine Bottiglieri"), "Deportes", "Marita Koch estableció el récord mundial de 400 metros femenino en 1985 con un tiempo de 47,60 segundos, un récord aún imbatido hoy.")
        ),
    )

    private fun part4(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 8170, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 200m femmes?", listOf("21.34s", "21.62s", "21.71s", "22.21s"), "Sport", "Le record du monde féminin du 200 mètres est détenu par Florence Griffith-Joyner, établi en 21,62 secondes lors des Jeux olympiques de Séoul en 1988."),
            en = LocalizedContent("What is the women's 200m record?", listOf("21.34s", "21.62s", "21.71s", "22.21s"), "Sports", "The women's 200m world record is held by Florence Griffith-Joyner, set at 21.62 seconds during the 1988 Seoul Olympics."),
            zh = LocalizedContent("女子200米纪录是多少？", listOf("21.34秒", "21.62秒", "21.71秒", "22.21秒"), "体育", "女子200米世界纪录由弗洛伦斯·格里菲斯-乔伊娜保持，她在1988年首尔奥运会上跑出21.62秒。"),
            es = LocalizedContent("¿Cuál es el récord de 200m femenino?", listOf("21.34s", "21.62s", "21.71s", "22.21s"), "Deportes", "El récord mundial femenino de 200 metros lo posee Florence Griffith-Joyner, establecido en 21,62 segundos durante los Juegos Olímpicos de Seúl 1988.")
        ),
        BilingualQuestion(
            id = 8171, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 200m femmes?", listOf("Florence Griffith-Joyner", "Marita Koch", "Christine Bottiglieri", "Sanya Richards-Ross"), "Sport", "Florence Griffith-Joyner a établi le record du monde du 200 mètres féminin en 21,34 secondes aux Jeux olympiques de Séoul en 1988, un temps qui n'a toujours pas été battu."),
            en = LocalizedContent("Who holds the women's 200m record?", listOf("Florence Griffith-Joyner", "Marita Koch", "Christine Bottiglieri", "Sanya Richards-Ross"), "Sports", "Florence Griffith-Joyner set the women's 200m world record at 21.34 seconds at the 1988 Seoul Olympics, a time that has not been beaten."),
            zh = LocalizedContent("谁保持着女子200米纪录？", listOf("弗洛伦斯·格里菲斯-乔伊娜", "玛丽塔·科赫", "克里斯汀·博蒂列里", "桑娅·理查兹-罗斯"), "体育", "弗洛伦斯·格里菲斯-乔伊娜在1988年首尔奥运会上以21.34秒创造了女子200米世界纪录，这一成绩至今未被打破。"),
            es = LocalizedContent("¿Quién posee el récord de 200m femenino?", listOf("Florence Griffith-Joyner", "Marita Koch", "Christine Bottiglieri", "Sanya Richards-Ross"), "Deportes", "Florence Griffith-Joyner estableció el récord mundial femenino de 200 metros en 21,34 segundos en los Juegos Olímpicos de Seúl 1988, tiempo que aún no ha sido superado.")
        ),
        BilingualQuestion(
            id = 8172, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 100m femmes?", listOf("10.49s", "10.61s", "10.70s", "10.82s"), "Sport", "Le record du 100 mètres féminin est détenu par Florence Griffith-Joyner, qui a couru en 10,49 secondes aux championnats américains de 1988."),
            en = LocalizedContent("What is the women's 100m record?", listOf("10.49s", "10.61s", "10.70s", "10.82s"), "Sports", "The women's 100m record is held by Florence Griffith-Joyner, who ran 10.49 seconds at the 1988 US Championships."),
            zh = LocalizedContent("女子100米纪录是多少？", listOf("10.49秒", "10.61秒", "10.70秒", "10.82秒"), "体育", "女子100米纪录由弗洛伦斯·格里菲斯-乔伊娜保持，她在1988年美国锦标赛上跑出10.49秒。"),
            es = LocalizedContent("¿Cuál es el récord de 100m femenino?", listOf("10.49s", "10.61s", "10.70s", "10.82s"), "Deportes", "El récord de 100 metros femenino lo posee Florence Griffith-Joyner, quien corrió en 10,49 segundos en los campeonatos estadounidenses de 1988.")
        ),
        BilingualQuestion(
            id = 8173, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 100m femmes?", listOf("Florence Griffith-Joyner", "Carmelita Jeter", "Marion Jones", "Christine Blocker"), "Sport", "Florence Griffith-Joyner a établi le record du monde du 100 mètres féminin en 10,49 secondes lors des sélections olympiques américaines de 1988 à Indianapolis, un temps qui n'a jamais été égalé depuis."),
            en = LocalizedContent("Who holds the women's 100m record?", listOf("Florence Griffith-Joyner", "Carmelita Jeter", "Marion Jones", "Christine Blocker"), "Sports", "Florence Griffith-Joyner set the women's 100m world record at 10.49 seconds during the 1988 US Olympic Trials in Indianapolis, a time that has never been equaled."),
            zh = LocalizedContent("谁保持着女子100米纪录？", listOf("弗洛伦斯·格里菲斯-乔伊娜", "卡梅莉塔·杰特", "玛丽昂·琼斯", "克里斯汀·布洛克"), "体育", "弗洛伦斯·格里菲斯-乔伊娜在1988年美国奥运选拔赛上以10.49秒创造了女子100米世界纪录，这一成绩从未被追平。"),
            es = LocalizedContent("¿Quién posee el récord de 100m femenino?", listOf("Florence Griffith-Joyner", "Carmelita Jeter", "Marion Jones", "Christine Blocker"), "Deportes", "Florence Griffith-Joyner estableció el récord mundial femenino de 100 metros en 10,49 segundos durante las pruebas olímpicas estadounidenses de 1988 en Indianápolis, tiempo que nunca ha sido igualado.")
        ),
        BilingualQuestion(
            id = 8174, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 1500m femmes?", listOf("3:50", "3:51", "3:52", "3:53"), "Sport", "Le record du monde féminin du 1500 mètres est détenu par Faith Kipyegon, établi en 3 minutes et 52 secondes exactement lors du meeting de Florence en 2023."),
            en = LocalizedContent("What is the women's 1500m record?", listOf("3:50", "3:51", "3:52", "3:53"), "Sports", "The women's 1500m world record is held by Faith Kipyegon, set at exactly 3 minutes and 52 seconds at the Florence meeting in 2023."),
            zh = LocalizedContent("女子1500米纪录是多少？", listOf("3:50", "3:51", "3:52", "3:53"), "体育", "女子1500米世界纪录由菲斯·基普耶贡保持，她在2023年佛罗伦萨赛上跑出3分52秒整。"),
            es = LocalizedContent("¿Cuál es el récord de 1500m femenino?", listOf("3:50", "3:51", "3:52", "3:53"), "Deportes", "El récord mundial femenino de 1500 metros lo posee Faith Kipyegon, establecido en exactamente 3 minutos y 52 segundos en la reunión de Florencia de 2023.")
        ),
        BilingualQuestion(
            id = 8175, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 1500m femmes?", listOf("Genzebe Dibaba", "Qu Yunxia", "Wang Junxia", "Hicham El Guerrouj"), "Sport", "La Chinoise Qu Yunxia a établi ce record du monde du 1500 mètres féminin le 11 septembre 1993 lors des Jeux nationaux chinois à Pékin, avec un temps de 3 minutes 50 secondes et 46 centièmes, qui tient toujours aujourd'hui."),
            en = LocalizedContent("Who holds the women's 1500m record?", listOf("Genzebe Dibaba", "Qu Yunxia", "Wang Junxia", "Hicham El Guerrouj"), "Sports", "Chinese runner Qu Yunxia set this women's 1500m world record on September 11, 1993 at the Chinese National Games in Beijing, with a time of 3 minutes 50 seconds and 46 hundredths, which still stands today."),
            zh = LocalizedContent("谁保持着女子1500米纪录？", listOf("根泽贝·迪巴巴", "曲云霞", "王军霞", "希查姆·埃尔·格鲁吉"), "体育", "中国选手曲云霞于1993年9月11日在北京举行的中国全国运动会上以3分50秒46创造了女子1500米世界纪录，这一纪录至今仍未被打破。"),
            es = LocalizedContent("¿Quién posee el récord de 1500m femenino?", listOf("Genzebe Dibaba", "Qu Yunxia", "Wang Junxia", "Hicham El Guerrouj"), "Deportes", "La china Qu Yunxia estableció este récord mundial femenino de 1500 metros el 11 de septiembre de 1993 en los Juegos Nacionales Chinos en Pekín, con un tiempo de 3 minutos 50 segundos y 46 centésimas, que aún se mantiene.")
        ),
        BilingualQuestion(
            id = 8176, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du marathon femmes?", listOf("2:15:25", "2:15:26", "2:14:04", "2:13:48"), "Sport", "Le record du marathon féminin est détenu par Ruth Chepngetich, qui a couru en 2:14:04 au Marathon de Chicago en 2024. Ce temps a battu le précédent record de Brigid Kosgei de plus d'une minute."),
            en = LocalizedContent("What is the women's marathon record?", listOf("2:15:25", "2:15:26", "2:14:04", "2:13:48"), "Sports", "The women's marathon record is held by Ruth Chepngetich, who ran 2:14:04 at the 2024 Chicago Marathon. This time beat the previous record by Brigid Kosgei by over a minute."),
            zh = LocalizedContent("女子马拉松纪录是多少？", listOf("2:15:25", "2:15:26", "2:14:04", "2:13:48"), "体育", "女子马拉松纪录由露丝·切普恩杰蒂奇保持，她在2024年芝加哥马拉松上跑出2:14:04。这一成绩比布里吉德·科斯盖之前的纪录快了一分多钟。"),
            es = LocalizedContent("¿Cuál es el récord de maratón femenino?", listOf("2:15:25", "2:15:26", "2:14:04", "2:13:48"), "Deportes", "El récord de maratón femenino lo posee Ruth Chepngetich, quien corrió en 2:14:04 en el Maratón de Chicago 2024. Este tiempo superó el récord anterior de Brigid Kosgei por más de un minuto.")
        ),
        BilingualQuestion(
            id = 8177, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du marathon femmes?", listOf("Paula Radcliffe", "Brigid Kosgei", "Mary Keitany", "Catherine Ndereba"), "Sport", "La Kényane Brigid Kosgei a établi le record du monde féminin du marathon en 2019 à Chicago, avec un temps de 2 heures 14 minutes et 4 secondes."),
            en = LocalizedContent("Who holds the women's marathon record?", listOf("Paula Radcliffe", "Brigid Kosgei", "Mary Keitany", "Catherine Ndereba"), "Sports", "Kenyan Brigid Kosgei set the women's marathon world record in 2019 in Chicago, with a time of 2 hours 14 minutes and 4 seconds."),
            zh = LocalizedContent("谁保持着女子马拉松纪录？", listOf("保拉·拉德克利夫", "布里吉德·科斯盖", "玛丽·凯塔尼", "凯瑟琳·恩德雷巴"), "体育", "肯尼亚选手布里吉德·科斯盖在2019年芝加哥马拉松上以2小时14分4秒创造了女子马拉松世界纪录。"),
            es = LocalizedContent("¿Quién posee el récord de maratón femenino?", listOf("Paula Radcliffe", "Brigid Kosgei", "Mary Keitany", "Catherine Ndereba"), "Deportes", "La keniana Brigid Kosgei estableció el récord mundial femenino de maratón en 2019 en Chicago, con un tiempo de 2 horas 14 minutos y 4 segundos.")
        ),
        BilingualQuestion(
            id = 8178, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de médailles Carl Lewis a-t-il remportées?", listOf("8", "9", "10", "11"), "Sport", "Carl Lewis a remporté 10 médailles olympiques (9 en or, 1 en argent) entre 1984 et 1996, principalement en sprint et en saut en longueur."),
            en = LocalizedContent("How many medals did Carl Lewis win?", listOf("8", "9", "10", "11"), "Sports", "Carl Lewis won 10 Olympic medals (9 gold, 1 silver) between 1984 and 1996, mainly in sprint and long jump."),
            zh = LocalizedContent("卡尔·刘易斯获得了多少枚奖牌？", listOf("8", "9", "10", "11"), "体育", "卡尔·刘易斯在1984年至1996年间获得了10枚奥运奖牌（9金1银），主要在短跑和跳远项目。"),
            es = LocalizedContent("¿Cuántas medallas ganó Carl Lewis?", listOf("8", "9", "10", "11"), "Deportes", "Carl Lewis ganó 10 medallas olímpicas (9 de oro, 1 de plata) entre 1984 y 1996, principalmente en velocidad y salto de longitud.")
        ),
        BilingualQuestion(
            id = 8179, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de médailles Paavo Nurmi a-t-il remportées?", listOf("9", "10", "11", "12"), "Sport", "Paavo Nurmi, surnommé le « Finlandais volant », a remporté 9 médailles d'or et 3 d'argent aux Jeux olympiques, mais son total officiel est souvent compté comme 10 médailles d'or en athlétisme."),
            en = LocalizedContent("How many medals did Paavo Nurmi win?", listOf("9", "10", "11", "12"), "Sports", "Paavo Nurmi, nicknamed the 'Flying Finn', won 9 gold and 3 silver medals at the Olympics, but his official total is often counted as 10 gold medals in athletics."),
            zh = LocalizedContent("帕沃·努尔米获得了多少枚奖牌？", listOf("9", "10", "11", "12"), "体育", "帕沃·努尔米，绰号“芬兰飞人”，在奥运会上获得了9枚金牌和3枚银牌，但官方统计通常计为10枚田径金牌。"),
            es = LocalizedContent("¿Cuántas medallas ganó Paavo Nurmi?", listOf("9", "10", "11", "12"), "Deportes", "Paavo Nurmi, apodado el 'Finlandés Volador', ganó 9 medallas de oro y 3 de plata en los Juegos Olímpicos, pero su total oficial a menudo se cuenta como 10 medallas de oro en atletismo.")
        ),
        BilingualQuestion(
            id = 8180, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 110m haies?", listOf("12.80s", "12.84s", "12.87s", "12.91s"), "Sport", "Le record du 110 mètres haies est détenu par l'Américain Aries Merritt, qui a couru en 12,80 secondes le 7 septembre 2012 à Bruxelles."),
            en = LocalizedContent("What is the 110m hurdles record?", listOf("12.80s", "12.84s", "12.87s", "12.91s"), "Sports", "The 110m hurdles record is held by American Aries Merritt, who ran 12.80 seconds on September 7, 2012 in Brussels."),
            zh = LocalizedContent("110米栏的纪录是多少？", listOf("12.80秒", "12.84秒", "12.87秒", "12.91秒"), "体育", "110米栏的世界纪录由美国选手阿里斯·梅里特保持，他在2012年9月7日于布鲁塞尔跑出12.80秒。"),
            es = LocalizedContent("¿Cuál es el récord de 110m vallas?", listOf("12.80s", "12.84s", "12.87s", "12.91s"), "Deportes", "El récord de 110 metros vallas lo posee el estadounidense Aries Merritt, quien corrió en 12,80 segundos el 7 de septiembre de 2012 en Bruselas.")
        ),
        BilingualQuestion(
            id = 8181, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 110m haies?", listOf("Aries Merritt", "David Oliver", "Liu Xiang", "Dayron Robles"), "Sport", "Aries Merritt a établi le record du monde du 110 mètres haies en 2012 avec un temps de 12,80 secondes, lors du meeting de Bruxelles."),
            en = LocalizedContent("Who holds the 110m hurdles record?", listOf("Aries Merritt", "David Oliver", "Liu Xiang", "Dayron Robles"), "Sports", "Aries Merritt set the world record in the 110m hurdles in 2012 with a time of 12.80 seconds at the Brussels meeting."),
            zh = LocalizedContent("谁保持着110米栏的纪录？", listOf("阿里斯·梅里特", "大卫·奥利弗", "刘翔", "戴龙·罗伯斯"), "体育", "阿里斯·梅里特在2012年布鲁塞尔站以12.80秒的成绩创造了110米栏世界纪录。"),
            es = LocalizedContent("¿Quién posee el récord de 110m vallas?", listOf("Aries Merritt", "David Oliver", "Liu Xiang", "Dayron Robles"), "Deportes", "Aries Merritt estableció el récord mundial de 110 metros vallas en 2012 con un tiempo de 12,80 segundos en la reunión de Bruselas.")
        ),
        BilingualQuestion(
            id = 8182, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 400m haies?", listOf("46.78s", "46.80s", "47.54s", "47.60s"), "Sport", "Le record du monde du 400 mètres haies masculin est détenu par le Norvégien Karsten Warholm en 46,80 secondes, établi lors des Jeux olympiques de Tokyo en 2021."),
            en = LocalizedContent("What is the 400m hurdles record?", listOf("46.78s", "46.80s", "47.54s", "47.60s"), "Sports", "The men's 400m hurdles world record is held by Norwegian Karsten Warholm in 46.80 seconds, set at the Tokyo 2021 Olympic Games."),
            zh = LocalizedContent("400米栏的纪录是多少？", listOf("46.78秒", "46.80秒", "47.54秒", "47.60秒"), "体育", "男子400米栏世界纪录由挪威选手卡斯滕·瓦霍尔姆保持，成绩为46.80秒，于2021年东京奥运会创造。"),
            es = LocalizedContent("¿Cuál es el récord de 400m vallas?", listOf("46.78s", "46.80s", "47.54s", "47.60s"), "Deportes", "El récord mundial masculino de 400 metros vallas lo posee el noruego Karsten Warholm con 46,80 segundos, establecido en los Juegos Olímpicos de Tokio 2021.")
        ),
        BilingualQuestion(
            id = 8183, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 400m haies?", listOf("Kevin Young", "Edwin Moses", "Karsten Warholm", "Danny Harris"), "Sport", "Le Norvégien Karsten Warholm a établi le record du monde du 400 mètres haies en 45,94 secondes aux Jeux olympiques de Tokyo en 2021, battant l'ancien record de Kevin Young qui datait de 1992."),
            en = LocalizedContent("Who holds the 400m hurdles record?", listOf("Kevin Young", "Edwin Moses", "Karsten Warholm", "Danny Harris"), "Sports", "Norwegian Karsten Warholm set the world record in the 400m hurdles at 45.94 seconds at the Tokyo 2021 Olympics, beating Kevin Young's previous record from 1992."),
            zh = LocalizedContent("谁保持着400米栏的纪录？", listOf("凯文·扬", "埃德温·摩西", "卡斯滕·瓦霍尔姆", "丹尼·哈里斯"), "体育", "挪威选手卡斯滕·瓦霍尔姆在2021年东京奥运会以45.94秒的成绩创造了400米栏世界纪录，打破了凯文·扬自1992年保持的纪录。"),
            es = LocalizedContent("¿Quién posee el récord de 400m vallas?", listOf("Kevin Young", "Edwin Moses", "Karsten Warholm", "Danny Harris"), "Deportes", "El noruego Karsten Warholm estableció el récord mundial de 400 metros vallas en 45,94 segundos en los Juegos Olímpicos de Tokio 2021, superando el anterior récord de Kevin Young de 1992.")
        ),
        BilingualQuestion(
            id = 8184, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du saut en longueur femmes?", listOf("7.52m", "7.49m", "7.48m", "7.45m"), "Sport", "Le record du monde féminin du saut en longueur est détenu par Galina Chistyakova avec un saut à 7,52 mètres, réalisé le 11 juin 1988 à Leningrad. Il s'agit du plus ancien record du monde d'athlétisme encore en vigueur."),
            en = LocalizedContent("What is the women's long jump record?", listOf("7.52m", "7.49m", "7.48m", "7.45m"), "Sports", "The women's long jump world record is held by Galina Chistyakova with a jump of 7.52 meters, achieved on June 11, 1988 in Leningrad. It is the oldest standing world record in athletics."),
            zh = LocalizedContent("女子跳远的纪录是多少？", listOf("7.52米", "7.49米", "7.48米", "7.45米"), "体育", "女子跳远世界纪录由加林娜·奇斯佳科娃保持，成绩为7.52米，于1988年6月11日在列宁格勒创造。这是田径史上保持时间最长的世界纪录。"),
            es = LocalizedContent("¿Cuál es el récord de salto de longitud femenino?", listOf("7.52m", "7.49m", "7.48m", "7.45m"), "Deportes", "El récord mundial femenino de salto de longitud lo posee Galina Chistyakova con un salto de 7,52 metros, realizado el 11 de junio de 1988 en Leningrado. Es el récord mundial de atletismo más antiguo aún vigente.")
        ),
        BilingualQuestion(
            id = 8185, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du saut en longueur femmes?", listOf("Galina Chistyakova", "Jackie Joyner-Kersee", "Heike Drechsler", "Brittney Reese"), "Sport", "Galina Chistyakova a établi le record du monde féminin du saut en longueur le 11 juin 1988 à Leningrad, avec un bond de 7,52 mètres, record toujours inégalé en 2024."),
            en = LocalizedContent("Who holds the women's long jump record?", listOf("Galina Chistyakova", "Jackie Joyner-Kersee", "Heike Drechsler", "Brittney Reese"), "Sports", "Galina Chistyakova set the women's long jump world record on June 11, 1988 in Leningrad with a leap of 7.52 meters, a record still unbroken as of 2024."),
            zh = LocalizedContent("谁保持着女子跳远的纪录？", listOf("加林娜·奇斯佳科娃", "杰基·乔伊娜-克西", "海克·德雷克斯勒", "布里特妮·里斯"), "体育", "加林娜·奇斯佳科娃于1988年6月11日在列宁格勒以7.52米的成绩创造了女子跳远世界纪录，该纪录至今未被打破。"),
            es = LocalizedContent("¿Quién posee el récord de salto de longitud femenino?", listOf("Galina Chistyakova", "Jackie Joyner-Kersee", "Heike Drechsler", "Brittney Reese"), "Deportes", "Galina Chistyakova estableció el récord mundial femenino de salto de longitud el 11 de junio de 1988 en Leningrado con un salto de 7,52 metros, récord aún imbatido en 2024.")
        ),
        BilingualQuestion(
            id = 8186, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du saut en hauteur femmes?", listOf("2.08m", "2.09m", "2.44m", "2.45m"), "Sport", "Le record du monde féminin du saut en hauteur est détenu par la Bulgare Stefka Kostadinova depuis 1987, avec un saut à 2,09 mètres lors des championnats du monde à Rome."),
            en = LocalizedContent("What is the women's high jump record?", listOf("2.08m", "2.09m", "2.44m", "2.45m"), "Sports", "The women's high jump world record is held by Bulgarian Stefka Kostadinova since 1987, with a jump of 2.09 meters at the World Championships in Rome."),
            zh = LocalizedContent("女子跳高的纪录是多少？", listOf("2.08米", "2.09米", "2.44米", "2.45米"), "体育", "女子跳高世界纪录由保加利亚选手斯特芙卡·科斯塔迪诺娃自1987年保持，成绩为2.09米，在罗马世锦赛上创造。"),
            es = LocalizedContent("¿Cuál es el récord de salto de altura femenino?", listOf("2.08m", "2.09m", "2.44m", "2.45m"), "Deportes", "El récord mundial femenino de salto de altura lo posee la búlgara Stefka Kostadinova desde 1987, con un salto de 2,09 metros en los Campeonatos Mundiales de Roma.")
        ),
        BilingualQuestion(
            id = 8187, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du saut en hauteur femmes?", listOf("Stefka Kostadinova", "Bevel Johnson-Thompson", "Mariya Lasitskene", "Louise Hazel"), "Sport", "Stefka Kostadinova a établi le record du monde féminin du saut en hauteur avec 2,09 mètres en 1987, un record toujours inégalé en compétition officielle."),
            en = LocalizedContent("Who holds the women's high jump record?", listOf("Stefka Kostadinova", "Bevel Johnson-Thompson", "Mariya Lasitskene", "Louise Hazel"), "Sports", "Stefka Kostadinova set the women's high jump world record with 2.09 meters in 1987, a record still unbroken in official competition."),
            zh = LocalizedContent("谁保持着女子跳高的纪录？", listOf("斯特芙卡·科斯塔迪诺娃", "贝维尔·约翰逊-汤普森", "玛丽亚·拉西茨克内", "路易丝·黑泽尔"), "体育", "斯特芙卡·科斯塔迪诺娃在1987年以2.09米的成绩创造了女子跳高世界纪录，该纪录在正式比赛中至今未被打破。"),
            es = LocalizedContent("¿Quién posee el récord de salto de altura femenino?", listOf("Stefka Kostadinova", "Bevel Johnson-Thompson", "Mariya Lasitskene", "Louise Hazel"), "Deportes", "Stefka Kostadinova estableció el récord mundial femenino de salto de altura con 2,09 metros en 1987, un récord aún imbatido en competición oficial.")
        ),
        BilingualQuestion(
            id = 8188, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du triple saut femmes?", listOf("15.50m", "15.40m", "15.39m", "15.35m"), "Sport", "Le record du monde féminin du triple saut est détenu par la Vénézuélienne Yulimar Rojas avec 15,67 mètres, établi en 2021. La réponse 15,39 mètres correspond à l'ancien record du monde de la Russe Tatyana Lebedeva, réalisé en 2004."),
            en = LocalizedContent("What is the women's triple jump record?", listOf("15.50m", "15.40m", "15.39m", "15.35m"), "Sports", "The women's triple jump world record is held by Venezuelan Yulimar Rojas with 15.67 meters, set in 2021. The answer 15.39m corresponds to the former world record by Russian Tatyana Lebedeva from 2004."),
            zh = LocalizedContent("女子三级跳远的纪录是多少？", listOf("15.50米", "15.40米", "15.39米", "15.35米"), "体育", "女子三级跳远世界纪录由委内瑞拉选手尤利马尔·罗哈斯保持，成绩为15.67米，于2021年创造。15.39米对应的是俄罗斯选手塔季扬娜·列别杰娃在2004年创造的前世界纪录。"),
            es = LocalizedContent("¿Cuál es el récord de triple salto femenino?", listOf("15.50m", "15.40m", "15.39m", "15.35m"), "Deportes", "El récord mundial femenino de triple salto lo posee la venezolana Yulimar Rojas con 15,67 metros, establecido en 2021. La respuesta 15,39m corresponde al anterior récord mundial de la rusa Tatyana Lebedeva de 2004.")
        ),
        BilingualQuestion(
            id = 8189, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du triple saut femmes?", listOf("Inessa Vankova", "Yolanda Chen", "Irina Galova", "Yamilé Martinez"), "Sport", "Inessa Kravets a établi le record du monde du triple saut féminin avec 15,50 mètres lors des championnats du monde de Göteborg en 1995, performance toujours inégalée."),
            en = LocalizedContent("Who holds the women's triple jump record?", listOf("Inessa Vankova", "Yolanda Chen", "Irina Galova", "Yamilé Martinez"), "Sports", "Inessa Kravets set the women's triple jump world record with 15.50 meters at the 1995 World Championships in Gothenburg, a performance still unmatched."),
            zh = LocalizedContent("谁保持着女子三级跳远的纪录？", listOf("伊内莎·克拉维茨", "约兰达·陈", "伊琳娜·加洛娃", "亚米莱·马丁内斯"), "体育", "伊内莎·克拉维茨在1995年哥德堡世锦赛以15.50米的成绩创造了女子三级跳远世界纪录，该成绩至今无人超越。"),
            es = LocalizedContent("¿Quién posee el récord de triple salto femenino?", listOf("Inessa Kravets", "Yolanda Chen", "Irina Galova", "Yamilé Martinez"), "Deportes", "Inessa Kravets estableció el récord mundial de triple salto femenino con 15,50 metros en los Campeonatos Mundiales de Gotemburgo en 1995, una marca aún imbatida.")
        ),
        BilingualQuestion(
            id = 8190, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du lancer du poids femmes?", listOf("22.41m", "22.50m", "22.63m", "22.70m"), "Sport", "Le record du monde féminin du lancer du poids est détenu par la Soviétique Natalya Lisovskaya, qui a réalisé un jet à 22,50 mètres le 7 juin 1987 à Moscou."),
            en = LocalizedContent("What is the women's shot put world record?", listOf("22.41m", "22.50m", "22.63m", "22.70m"), "Sports", "The women's shot put world record is held by Soviet Natalya Lisovskaya, who threw 22.50 meters on June 7, 1987 in Moscow."),
            zh = LocalizedContent("女子铅球的世界纪录是多少？", listOf("22.41米", "22.50米", "22.63米", "22.70米"), "体育", "女子铅球世界纪录由苏联选手娜塔莉亚·利索夫斯卡娅保持，她于1987年6月7日在莫斯科投出22.50米。"),
            es = LocalizedContent("¿Cuál es el récord mundial de lanzamiento de peso femenino?", listOf("22.41m", "22.50m", "22.63m", "22.70m"), "Deportes", "El récord mundial femenino de lanzamiento de peso lo posee la soviética Natalya Lisovskaya, quien lanzó 22,50 metros el 7 de junio de 1987 en Moscú.")
        ),
        BilingualQuestion(
            id = 8191, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du lancer du poids femmes?", listOf("Astrid Kumbernuss", "Larisa Peleshenko", "Svetla Mitkova", "Natalya Lisovskaya"), "Sport", "La lanceuse soviétique Natalya Lisovskaya a établi le record du monde féminin du lancer du poids le 7 juin 1987 à Moscou, avec un jet de 22,63 mètres, performance toujours inégalée."),
            en = LocalizedContent("Who holds the women's shot put world record?", listOf("Astrid Kumbernuss", "Larisa Peleshenko", "Svetla Mitkova", "Natalya Lisovskaya"), "Sports", "Soviet shot putter Natalya Lisovskaya set the women's world record on June 7, 1987 in Moscow with a throw of 22.63 meters, a performance still unmatched."),
            zh = LocalizedContent("谁保持着女子铅球的世界纪录？", listOf("阿斯特丽德·昆伯努斯", "拉里莎·佩列申科", "斯维特拉·米特科娃", "娜塔莉亚·利索夫斯卡娅"), "体育", "苏联铅球运动员娜塔莉亚·利索夫斯卡娅于1987年6月7日在莫斯科以22.63米的成绩创造了女子世界纪录，这一成绩至今未被打破。"),
            es = LocalizedContent("¿Quién posee el récord mundial de lanzamiento de peso femenino?", listOf("Astrid Kumbernuss", "Larisa Peleshenko", "Svetla Mitkova", "Natalya Lisovskaya"), "Deportes", "La lanzadora soviética Natalya Lisovskaya estableció el récord mundial femenino de lanzamiento de peso el 7 de junio de 1987 en Moscú con un lanzamiento de 22,63 metros, marca aún imbatida.")
        ),
        BilingualQuestion(
            id = 8192, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du lancer du disque femmes?", listOf("76.80m", "77.00m", "77.35m", "77.80m"), "Sport", "Le record du monde féminin du lancer du disque est de 77,35 mètres, établi par l'Allemande Gabriele Reinsch le 9 juillet 1988 à Neubrandenburg."),
            en = LocalizedContent("What is the women's discus throw world record?", listOf("76.80m", "77.00m", "77.35m", "77.80m"), "Sports", "The women's discus throw world record is 77.35 meters, set by German Gabriele Reinsch on July 9, 1988 in Neubrandenburg."),
            zh = LocalizedContent("女子铁饼的世界纪录是多少？", listOf("76.80米", "77.00米", "77.35米", "77.80米"), "体育", "女子铁饼世界纪录为77.35米，由德国选手加布里埃莱·赖因施于1988年7月9日在新勃兰登堡创造。"),
            es = LocalizedContent("¿Cuál es el récord mundial de lanzamiento de disco femenino?", listOf("76.80m", "77.00m", "77.35m", "77.80m"), "Deportes", "El récord mundial femenino de lanzamiento de disco es de 77,35 metros, establecido por la alemana Gabriele Reinsch el 9 de julio de 1988 en Neubrandenburg.")
        ),
        BilingualQuestion(
            id = 8193, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du lancer du disque femmes?", listOf("Gabriele Reinsch", "Tsvetanka Khristova", "Svetlana Krivelyova", "Natalya Sadova"), "Sport", "Gabriele Reinsch a établi le record du monde féminin du lancer du disque le 9 juillet 1988 à Neubrandenbourg, avec un jet à 76,80 mètres. Ce record n'a jamais été battu depuis."),
            en = LocalizedContent("Who holds the women's discus throw world record?", listOf("Gabriele Reinsch", "Tsvetanka Khristova", "Svetlana Krivelyova", "Natalya Sadova"), "Sports", "Gabriele Reinsch set the women's discus throw world record on July 9, 1988 in Neubrandenburg with a throw of 76.80 meters. This record has never been broken since."),
            zh = LocalizedContent("谁保持着女子铁饼的世界纪录？", listOf("加布里埃莱·赖因施", "茨维坦卡·赫里斯托娃", "斯维特兰娜·克里韦廖娃", "娜塔莉亚·萨多娃"), "体育", "加布里埃莱·赖因施于1988年7月9日在新勃兰登堡以76.80米的成绩创造了女子铁饼世界纪录，此后从未被打破。"),
            es = LocalizedContent("¿Quién posee el récord mundial de lanzamiento de disco femenino?", listOf("Gabriele Reinsch", "Tsvetanka Khristova", "Svetlana Krivelyova", "Natalya Sadova"), "Deportes", "Gabriele Reinsch estableció el récord mundial femenino de lanzamiento de disco el 9 de julio de 1988 en Neubrandenburg con un lanzamiento de 76,80 metros. Esta marca nunca ha sido superada desde entonces.")
        ),
        BilingualQuestion(
            id = 8194, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du lancer du javelot femmes?", listOf("71.70m", "72.28m", "72.40m", "73.36m"), "Sport", "Le record du monde féminin du lancer du javelot est détenu par l'athlète tchèque Barbora Špotáková avec un jet à 73,36 mètres, réalisé le 13 septembre 2008 à Stuttgart."),
            en = LocalizedContent("What is the women's javelin throw world record?", listOf("71.70m", "72.28m", "72.40m", "73.36m"), "Sports", "The women's javelin throw world record is held by Czech athlete Barbora Špotáková with a throw of 73.36 meters, achieved on September 13, 2008 in Stuttgart."),
            zh = LocalizedContent("女子标枪的世界纪录是多少？", listOf("71.70米", "72.28米", "72.40米", "73.36米"), "体育", "女子标枪世界纪录由捷克运动员巴尔博拉·什波塔科娃保持，她于2008年9月13日在斯图加特投出73.36米。"),
            es = LocalizedContent("¿Cuál es el récord mundial de lanzamiento de jabalina femenino?", listOf("71.70m", "72.28m", "72.40m", "73.36m"), "Deportes", "El récord mundial femenino de lanzamiento de jabalina lo posee la atleta checa Barbora Špotáková con un lanzamiento de 73,36 metros, realizado el 13 de septiembre de 2008 en Stuttgart.")
        ),
        BilingualQuestion(
            id = 8195, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du lancer du javelot femmes?", listOf("Barbora Spotakova", "Natalya Rogachenko", "Christina Obergföll", "Anja Richard"), "Sport", "Barbora Špotáková a établi le record du monde féminin du lancer du javelot avec un jet de 72,28 mètres en 2008, performance toujours inégalée."),
            en = LocalizedContent("Who holds the women's javelin throw world record?", listOf("Barbora Spotakova", "Natalya Rogachenko", "Christina Obergföll", "Anja Richard"), "Sports", "Barbora Špotáková set the women's javelin throw world record with a throw of 72.28 meters in 2008, a performance still unmatched."),
            zh = LocalizedContent("谁保持着女子标枪的世界纪录？", listOf("巴尔博拉·什波塔科娃", "娜塔莉亚·罗加琴科", "克里斯蒂娜·奥贝格福尔", "安雅·理查德"), "体育", "巴尔博拉·什波塔科娃在2008年以72.28米的成绩创造了女子标枪世界纪录，这一成绩至今未被打破。"),
            es = LocalizedContent("¿Quién posee el récord mundial de lanzamiento de jabalina femenino?", listOf("Barbora Spotakova", "Natalya Rogachenko", "Christina Obergföll", "Anja Richard"), "Deportes", "Barbora Špotáková estableció el récord mundial femenino de lanzamiento de jabalina con un lanzamiento de 72,28 metros en 2008, marca aún imbatida.")
        ),
        BilingualQuestion(
            id = 8196, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de médailles Florence Griffith-Joyner a-t-elle remportées en 1988?", listOf("3", "4", "5", "6"), "Sport", "Aux Jeux olympiques de Séoul en 1988, Florence Griffith-Joyner a remporté trois médailles d'or (100 m, 200 m, relais 4x100 m) et une médaille d'argent (relais 4x400 m), soit quatre médailles au total."),
            en = LocalizedContent("How many medals did Florence Griffith-Joyner win in 1988?", listOf("3", "4", "5", "6"), "Sports", "At the 1988 Seoul Olympics, Florence Griffith-Joyner won three gold medals (100m, 200m, 4x100m relay) and one silver medal (4x400m relay), totaling four medals."),
            zh = LocalizedContent("弗洛伦斯·格里菲斯-乔伊纳在1988年赢得了多少枚奖牌？", listOf("3", "4", "5", "6"), "体育", "在1988年首尔奥运会上，弗洛伦斯·格里菲斯-乔伊纳赢得了三枚金牌（100米、200米、4x100米接力）和一枚银牌（4x400米接力），共四枚奖牌。"),
            es = LocalizedContent("¿Cuántas medallas ganó Florence Griffith-Joyner en 1988?", listOf("3", "4", "5", "6"), "Deportes", "En los Juegos Olímpicos de Seúl 1988, Florence Griffith-Joyner ganó tres medallas de oro (100 m, 200 m, relevo 4x100 m) y una medalla de plata (relevo 4x400 m), totalizando cuatro medallas.")
        ),
        BilingualQuestion(
            id = 8197, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel athlète a remporté le plus de médailles olympiques?", listOf("Carl Lewis", "Paavo Nurmi", "Michael Phelps", "Larisa Latynina"), "Sport", "Michael Phelps détient le record du plus grand nombre de médailles olympiques avec 28, dont 23 en or, obtenues entre 2004 et 2016 en natation."),
            en = LocalizedContent("Which athlete has won the most Olympic medals?", listOf("Carl Lewis", "Paavo Nurmi", "Michael Phelps", "Larisa Latynina"), "Sports", "Michael Phelps holds the record for the most Olympic medals with 28, including 23 gold, achieved between 2004 and 2016 in swimming."),
            zh = LocalizedContent("哪位运动员赢得了最多的奥运奖牌？", listOf("卡尔·刘易斯", "帕沃·努尔米", "迈克尔·菲尔普斯", "拉里莎·拉蒂尼娜"), "体育", "迈克尔·菲尔普斯以28枚奥运奖牌（其中23枚金牌）保持着最多奥运奖牌的纪录，这些奖牌是在2004年至2016年间的游泳项目中获得的。"),
            es = LocalizedContent("¿Qué atleta ha ganado más medallas olímpicas?", listOf("Carl Lewis", "Paavo Nurmi", "Michael Phelps", "Larisa Latynina"), "Deportes", "Michael Phelps posee el récord de la mayor cantidad de medallas olímpicas con 28, incluyendo 23 de oro, obtenidas entre 2004 y 2016 en natación.")
        ),
        BilingualQuestion(
            id = 8198, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de Coupes du Monde d'athlétisme il y a-t-il eu?", listOf("10", "11", "12", "13"), "Sport", "La Coupe du Monde d'athlétisme s'est déroulée de 1977 à 2006, totalisant 11 éditions avant d'être remplacée par la Ligue de diamant."),
            en = LocalizedContent("How many IAAF World Cup in Athletics were there?", listOf("10", "11", "12", "13"), "Sports", "The IAAF World Cup in Athletics took place from 1977 to 2006, totaling 11 editions before being replaced by the Diamond League."),
            zh = LocalizedContent("国际田联世界杯田径赛举办了多少届？", listOf("10", "11", "12", "13"), "体育", "国际田联世界杯田径赛从1977年举办到2006年，共11届，之后被钻石联赛取代。"),
            es = LocalizedContent("¿Cuántas Copas del Mundo de Atletismo de la IAAF hubo?", listOf("10", "11", "12", "13"), "Deportes", "La Copa del Mundo de Atletismo de la IAAF se celebró desde 1977 hasta 2006, totalizando 11 ediciones antes de ser reemplazada por la Liga de Diamante.")
        ),
        BilingualQuestion(
            id = 8199, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Coupe du Monde d'athlétisme a-t-elle commencé?", listOf("1983", "1985", "1987", "1991"), "Sport", "La première édition de la Coupe du Monde d'athlétisme s'est tenue en 1983 à Helsinki, en Finlande, organisée par l'Association internationale des fédérations d'athlétisme (IAAF)."),
            en = LocalizedContent("In which year did the IAAF World Cup in Athletics start?", listOf("1983", "1985", "1987", "1991"), "Sports", "The first edition of the IAAF World Cup in Athletics was held in 1983 in Helsinki, Finland, organized by the International Association of Athletics Federations (IAAF)."),
            zh = LocalizedContent("国际田联世界杯田径赛始于哪一年？", listOf("1983", "1985", "1987", "1991"), "体育", "国际田联世界杯田径赛的第一届于1983年在芬兰赫尔辛基举行，由国际田径联合会（IAAF）组织。"),
            es = LocalizedContent("¿En qué año comenzó la Copa del Mundo de Atletismo de la IAAF?", listOf("1983", "1985", "1987", "1991"), "Deportes", "La primera edición de la Copa del Mundo de Atletismo de la IAAF se celebró en 1983 en Helsinki, Finlandia, organizada por la Asociación Internacional de Federaciones de Atletismo (IAAF).")
        ),
        BilingualQuestion(
            id = 8200, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de médailles d'or Michael Phelps a-t-il remportées?", listOf("20", "22", "23", "25"), "Sport", "Michael Phelps détient le record du plus grand nombre de médailles d'or olympiques, avec 23 titres remportés entre 2004 et 2016."),
            en = LocalizedContent("How many gold medals has Michael Phelps won?", listOf("20", "22", "23", "25"), "Sports", "Michael Phelps holds the record for the most Olympic gold medals, with 23 titles won between 2004 and 2016."),
            zh = LocalizedContent("迈克尔·菲尔普斯获得了多少枚金牌？", listOf("20", "22", "23", "25"), "体育", "迈克尔·菲尔普斯保持着奥运会金牌最多的纪录，在2004年至2016年间共获得23枚金牌。"),
            es = LocalizedContent("¿Cuántas medallas de oro ha ganado Michael Phelps?", listOf("20", "22", "23", "25"), "Deportes", "Michael Phelps posee el récord de más medallas de oro olímpicas, con 23 títulos ganados entre 2004 y 2016.")
        ),
        BilingualQuestion(
            id = 8201, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 100m nage libre hommes?", listOf("47.50s", "47.52s", "47.47s", "47.17s"), "Sport", "Le record du 100 mètres nage libre hommes est détenu par le nageur roumain David Popovici, établi en 2022 avec un temps de 47,17 secondes."),
            en = LocalizedContent("What is the men's 100m freestyle record?", listOf("47.50s", "47.52s", "47.47s", "47.17s"), "Sports", "The men's 100m freestyle record is held by Romanian swimmer David Popovici, set in 2022 with a time of 47.17 seconds."),
            zh = LocalizedContent("男子100米自由泳纪录是多少？", listOf("47.50秒", "47.52秒", "47.47秒", "47.17秒"), "体育", "男子100米自由泳纪录由罗马尼亚游泳运动员大卫·波波维奇保持，于2022年创下，成绩为47.17秒。"),
            es = LocalizedContent("¿Cuál es el récord de los 100 m estilo libre masculino?", listOf("47.50s", "47.52s", "47.47s", "47.17s"), "Deportes", "El récord de los 100 metros estilo libre masculino lo posee el nadador rumano David Popovici, establecido en 2022 con un tiempo de 47,17 segundos.")
        ),
        BilingualQuestion(
            id = 8202, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 100m nage libre hommes?", listOf("Caeleb Dressel", "Nathan Adrian", "Florent Manaudou", "Adam Peaty"), "Sport", "Caeleb Dressel a établi le record du monde du 100 mètres nage libre hommes en 2019, avec un temps de 46,96 secondes. Ce record a été réalisé lors des championnats du monde de natation à Gwangju, en Corée du Sud."),
            en = LocalizedContent("Who holds the men's 100m freestyle record?", listOf("Caeleb Dressel", "Nathan Adrian", "Florent Manaudou", "Adam Peaty"), "Sports", "Caeleb Dressel set the men's 100m freestyle world record in 2019, with a time of 46.96 seconds. This record was achieved at the World Aquatics Championships in Gwangju, South Korea."),
            zh = LocalizedContent("谁保持着男子100米自由泳纪录？", listOf("凯勒布·德雷塞尔", "内森·阿德里安", "弗洛朗·马纳杜", "亚当·皮蒂"), "体育", "凯勒布·德雷塞尔在2019年以46.96秒的成绩创造了男子100米自由泳世界纪录。该纪录是在韩国光州举行的世界游泳锦标赛上创造的。"),
            es = LocalizedContent("¿Quién posee el récord de los 100 m estilo libre masculino?", listOf("Caeleb Dressel", "Nathan Adrian", "Florent Manaudou", "Adam Peaty"), "Deportes", "Caeleb Dressel estableció el récord mundial de los 100 metros estilo libre masculino en 2019, con un tiempo de 46,96 segundos. Este récord se logró en los Campeonatos Mundiales de Natación en Gwangju, Corea del Sur.")
        ),
        BilingualQuestion(
            id = 8203, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 200m nage libre hommes?", listOf("1:43.50", "1:43.60", "1:44.22", "1:45.00"), "Sport", "Le record du 200 mètres nage libre hommes est détenu par le nageur roumain David Popovici, qui a réalisé 1:42.97 aux Championnats d'Europe de 2022."),
            en = LocalizedContent("What is the men's 200m freestyle record?", listOf("1:43.50", "1:43.60", "1:44.22", "1:45.00"), "Sports", "The men's 200m freestyle record is held by Romanian swimmer David Popovici, who achieved 1:42.97 at the 2022 European Championships."),
            zh = LocalizedContent("男子200米自由泳纪录是多少？", listOf("1:43.50", "1:43.60", "1:44.22", "1:45.00"), "体育", "男子200米自由泳纪录由罗马尼亚游泳运动员大卫·波波维奇保持，他在2022年欧洲锦标赛上游出1分42秒97。"),
            es = LocalizedContent("¿Cuál es el récord de los 200 m estilo libre masculino?", listOf("1:43.50", "1:43.60", "1:44.22", "1:45.00"), "Deportes", "El récord de los 200 metros estilo libre masculino lo posee el nadador rumano David Popovici, quien logró 1:42.97 en los Campeonatos Europeos de 2022.")
        ),
        BilingualQuestion(
            id = 8204, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 200m nage libre hommes?", listOf("Michael Phelps", "Paul Biedermann", "Yannick Agnèl", "Grant Hackett"), "Sport", "Le record du 200 mètres nage libre hommes est détenu par l'Allemand Paul Biedermann depuis les Championnats du monde 2009 à Rome, où il a nagé en 1 minute 42 secondes 00."),
            en = LocalizedContent("Who holds the men's 200m freestyle record?", listOf("Michael Phelps", "Paul Biedermann", "Yannick Agnèl", "Grant Hackett"), "Sports", "The men's 200m freestyle record is held by German Paul Biedermann since the 2009 World Championships in Rome, where he swam 1 minute 42 seconds 00."),
            zh = LocalizedContent("谁保持着男子200米自由泳纪录？", listOf("迈克尔·菲尔普斯", "保罗·比德尔曼", "扬尼克·阿涅尔", "格兰特·哈克特"), "体育", "男子200米自由泳纪录由德国选手保罗·比德尔曼保持，自2009年罗马世锦赛上他游出1分42秒00以来一直未被打破。"),
            es = LocalizedContent("¿Quién posee el récord de los 200 m estilo libre masculino?", listOf("Michael Phelps", "Paul Biedermann", "Yannick Agnèl", "Grant Hackett"), "Deportes", "El récord de los 200 metros estilo libre masculino lo posee el alemán Paul Biedermann desde los Campeonatos Mundiales de 2009 en Roma, donde nadó 1 minuto 42 segundos 00.")
        ),
        BilingualQuestion(
            id = 8205, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 400m nage libre hommes?", listOf("3:40.07", "3:40.85", "3:41.86", "3:42.08"), "Sport", "Le record du 400 mètres nage libre hommes est détenu par l'Allemand Paul Biedermann depuis les Championnats du monde 2009 à Rome, où il a nagé en 3:40.85."),
            en = LocalizedContent("What is the men's 400m freestyle record?", listOf("3:40.07", "3:40.85", "3:41.86", "3:42.08"), "Sports", "The men's 400m freestyle record is held by German Paul Biedermann since the 2009 World Championships in Rome, where he swam 3:40.85."),
            zh = LocalizedContent("男子400米自由泳纪录是多少？", listOf("3:40.07", "3:40.85", "3:41.86", "3:42.08"), "体育", "男子400米自由泳纪录由德国选手保罗·比德尔曼保持，自2009年罗马世锦赛上游出3分40秒85以来一直未被打破。"),
            es = LocalizedContent("¿Cuál es el récord de los 400 m estilo libre masculino?", listOf("3:40.07", "3:40.85", "3:41.86", "3:42.08"), "Deportes", "El récord de los 400 metros estilo libre masculino lo posee el alemán Paul Biedermann desde los Campeonatos Mundiales de 2009 en Roma, donde nadó 3:40.85.")
        ),
        BilingualQuestion(
            id = 8206, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 400m nage libre hommes?", listOf("Yang Sun", "Ian Thorpe", "Kieren Perkins", "Tom Dolan"), "Sport", "Le nageur chinois Sun Yang a établi le record du monde du 400 mètres nage libre hommes en 2012 aux Jeux olympiques de Londres, avec un temps de 3 minutes 40 secondes et 14 centièmes."),
            en = LocalizedContent("Who holds the men's 400m freestyle record?", listOf("Yang Sun", "Ian Thorpe", "Kieren Perkins", "Tom Dolan"), "Sports", "Chinese swimmer Sun Yang set the men's 400m freestyle world record in 2012 at the London Olympics, with a time of 3 minutes 40 seconds and 14 hundredths."),
            zh = LocalizedContent("谁保持着男子400米自由泳纪录？", listOf("孙杨", "伊恩·索普", "基伦·珀金斯", "汤姆·多兰"), "体育", "中国游泳运动员孙杨在2012年伦敦奥运会上以3分40秒14的成绩创造了男子400米自由泳世界纪录。"),
            es = LocalizedContent("¿Quién posee el récord de los 400 m estilo libre masculino?", listOf("Yang Sun", "Ian Thorpe", "Kieren Perkins", "Tom Dolan"), "Deportes", "El nadador chino Sun Yang estableció el récord mundial de los 400 metros estilo libre masculino en 2012 en los Juegos Olímpicos de Londres, con un tiempo de 3 minutos 40 segundos y 14 centésimas.")
        ),
        BilingualQuestion(
            id = 8207, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 1500m nage libre hommes?", listOf("14:30.67", "14:31.02", "14:34.56", "14:35.00"), "Sport", "Ce record a été établi par l'Américain Bobby Finke aux Jeux Olympiques de Paris 2024, battant l'ancien record de Sun Yang qui datait de 2012."),
            en = LocalizedContent("What is the men's 1500m freestyle record?", listOf("14:30.67", "14:31.02", "14:34.56", "14:35.00"), "Sports", "This record was set by American Bobby Finke at the 2024 Paris Olympics, breaking the previous record by Sun Yang from 2012."),
            zh = LocalizedContent("男子1500米自由泳纪录是多少？", listOf("14:30.67", "14:31.02", "14:34.56", "14:35.00"), "体育", "该纪录由美国选手鲍比·芬克在2024年巴黎奥运会上创造，打破了孙杨自2012年保持的前纪录。"),
            es = LocalizedContent("¿Cuál es el récord de los 1500 m estilo libre masculino?", listOf("14:30.67", "14:31.02", "14:34.56", "14:35.00"), "Deportes", "Este récord fue establecido por el estadounidense Bobby Finke en los Juegos Olímpicos de París 2024, superando el récord anterior de Sun Yang de 2012.")
        ),
        BilingualQuestion(
            id = 8208, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 1500m nage libre hommes?", listOf("Gregorio Paltrinieri", "Kieren Perkins", "Grant Hackett", "Jorg Hoffmann"), "Sport", "Gregorio Paltrinieri a établi le record du monde du 1500 mètres nage libre en 2016, lors des Championnats d'Europe de natation à Londres."),
            en = LocalizedContent("Who holds the men's 1500m freestyle record?", listOf("Gregorio Paltrinieri", "Kieren Perkins", "Grant Hackett", "Jorg Hoffmann"), "Sports", "Gregorio Paltrinieri set the men's 1500m freestyle world record in 2016 at the European Aquatics Championships in London."),
            zh = LocalizedContent("谁保持着男子1500米自由泳纪录？", listOf("格雷戈里奥·帕尔特里涅里", "基伦·珀金斯", "格兰特·哈克特", "约尔格·霍夫曼"), "体育", "格雷戈里奥·帕尔特里涅里在2016年伦敦欧洲游泳锦标赛上创造了男子1500米自由泳世界纪录。"),
            es = LocalizedContent("¿Quién posee el récord de los 1500 m estilo libre masculino?", listOf("Gregorio Paltrinieri", "Kieren Perkins", "Grant Hackett", "Jorg Hoffmann"), "Deportes", "Gregorio Paltrinieri estableció el récord mundial de los 1500 metros estilo libre masculino en 2016, durante los Campeonatos Europeos de Natación en Londres.")
        ),
        BilingualQuestion(
            id = 8209, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 100m brasse hommes?", listOf("56.88s", "57.00s", "57.13s", "57.30s"), "Sport", "Le record du 100 mètres brasse hommes est détenu par Adam Peaty, qui a réalisé 56,88 secondes aux championnats du monde 2019 à Gwangju."),
            en = LocalizedContent("What is the men's 100m breaststroke record?", listOf("56.88s", "57.00s", "57.13s", "57.30s"), "Sports", "The men's 100m breaststroke record is held by Adam Peaty, who achieved 56.88 seconds at the 2019 World Championships in Gwangju."),
            zh = LocalizedContent("男子100米蛙泳纪录是多少？", listOf("56.88秒", "57.00秒", "57.13秒", "57.30秒"), "体育", "男子100米蛙泳纪录由亚当·皮蒂保持，他在2019年光州世锦赛上游出56.88秒。"),
            es = LocalizedContent("¿Cuál es el récord de los 100 m braza masculino?", listOf("56.88s", "57.00s", "57.13s", "57.30s"), "Deportes", "El récord de los 100 metros braza masculino lo posee Adam Peaty, quien logró 56,88 segundos en los Campeonatos Mundiales de 2019 en Gwangju.")
        ),
        BilingualQuestion(
            id = 8210, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 100m brasse hommes?", listOf("Adam Peaty", "Kosuke Kitajima", "Brendan Hansen", "Ed Moses"), "Sport", "Le Britannique Adam Peaty a établi le record du monde du 100 mètres brasse hommes en 57,13 secondes aux Championnats du monde 2017 à Budapest."),
            en = LocalizedContent("Who holds the men's 100m breaststroke world record?", listOf("Adam Peaty", "Kosuke Kitajima", "Brendan Hansen", "Ed Moses"), "Sports", "British swimmer Adam Peaty set the men's 100m breaststroke world record at 57.13 seconds at the 2017 World Championships in Budapest."),
            zh = LocalizedContent("谁保持着男子100米蛙泳的世界纪录？", listOf("亚当·皮蒂", "北岛康介", "布伦丹·汉森", "埃德·摩西"), "体育", "英国游泳运动员亚当·皮蒂在2017年布达佩斯世锦赛上以57.13秒创造了男子100米蛙泳世界纪录。"),
            es = LocalizedContent("¿Quién tiene el récord mundial de 100 m braza masculino?", listOf("Adam Peaty", "Kosuke Kitajima", "Brendan Hansen", "Ed Moses"), "Deportes", "El nadador británico Adam Peaty estableció el récord mundial de 100 m braza masculino en 57,13 segundos en los Campeonatos Mundiales de 2017 en Budapest.")
        ),
        BilingualQuestion(
            id = 8211, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 200m brasse hommes?", listOf("2:06.67", "2:07.00", "2:07.51", "2:08.00"), "Sport", "Le record du monde du 200 mètres brasse hommes est détenu par le Russe Anton Chupkov, établi le 26 juillet 2019 aux championnats du monde de Gwangju."),
            en = LocalizedContent("What is the men's 200m breaststroke world record?", listOf("2:06.67", "2:07.00", "2:07.51", "2:08.00"), "Sports", "The men's 200m breaststroke world record is held by Russian Anton Chupkov, set on July 26, 2019 at the World Championships in Gwangju."),
            zh = LocalizedContent("男子200米蛙泳的世界纪录是多少？", listOf("2:06.67", "2:07.00", "2:07.51", "2:08.00"), "体育", "男子200米蛙泳世界纪录由俄罗斯选手安东·丘普科夫保持，于2019年7月26日在光州世锦赛上创造。"),
            es = LocalizedContent("¿Cuál es el récord mundial de 200 m braza masculino?", listOf("2:06.67", "2:07.00", "2:07.51", "2:08.00"), "Deportes", "El récord mundial de 200 m braza masculino lo posee el ruso Anton Chupkov, establecido el 26 de julio de 2019 en los Campeonatos Mundiales de Gwangju.")
        ),
        BilingualQuestion(
            id = 8212, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 200m brasse hommes?", listOf("Akihiro Yamaguchi", "Kosuke Kitajima", "Ed Moses", "Brendan Hansen"), "Sport", "Akihiro Yamaguchi a établi le record du monde du 200 m brasse hommes en 2012 aux championnats du Japon, avec un temps de 2 min 7 s 01."),
            en = LocalizedContent("Who holds the men's 200m breaststroke world record?", listOf("Akihiro Yamaguchi", "Kosuke Kitajima", "Ed Moses", "Brendan Hansen"), "Sports", "Akihiro Yamaguchi set the men's 200m breaststroke world record in 2012 at the Japanese Championships with a time of 2 min 7 s 01."),
            zh = LocalizedContent("谁保持着男子200米蛙泳的世界纪录？", listOf("山口明宏", "北岛康介", "埃德·摩西", "布伦丹·汉森"), "体育", "山口明宏在2012年日本锦标赛上以2分7秒01创造了男子200米蛙泳世界纪录。"),
            es = LocalizedContent("¿Quién tiene el récord mundial de 200 m braza masculino?", listOf("Akihiro Yamaguchi", "Kosuke Kitajima", "Ed Moses", "Brendan Hansen"), "Deportes", "Akihiro Yamaguchi estableció el récord mundial de 200 m braza masculino en 2012 en los Campeonatos de Japón con un tiempo de 2 min 7 s 01.")
        ),
        BilingualQuestion(
            id = 8213, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 100m dos hommes?", listOf("52.06s", "52.16s", "52.24s", "52.40s"), "Sport", "Le record du 100 mètres dos masculin est détenu par le nageur américain Ryan Murphy, qui a réalisé 52.16 secondes aux Jeux olympiques de Rio en 2016."),
            en = LocalizedContent("What is the men's 100m backstroke world record?", listOf("52.06s", "52.16s", "52.24s", "52.40s"), "Sports", "The men's 100m backstroke world record is held by American swimmer Ryan Murphy, who achieved 52.16 seconds at the 2016 Rio Olympics."),
            zh = LocalizedContent("男子100米仰泳的世界纪录是多少？", listOf("52.06秒", "52.16秒", "52.24秒", "52.40秒"), "体育", "男子100米仰泳世界纪录由美国游泳运动员瑞安·墨菲保持，他在2016年里约奥运会上游出了52.16秒。"),
            es = LocalizedContent("¿Cuál es el récord mundial de 100 m espalda masculino?", listOf("52.06s", "52.16s", "52.24s", "52.40s"), "Deportes", "El récord mundial de 100 m espalda masculino lo posee el nadador estadounidense Ryan Murphy, quien logró 52.16 segundos en los Juegos Olímpicos de Río 2016.")
        ),
        BilingualQuestion(
            id = 8214, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 100m dos hommes?", listOf("Caeleb Dressel", "Ryan Lochte", "Aaron Peirsol", "Florent Manaudou"), "Sport", "Caeleb Dressel a établi le record du monde du 100 mètres dos en 2021, mais il est surtout connu pour ses performances en nage libre et papillon. Ce record a depuis été battu par d'autres nageurs."),
            en = LocalizedContent("Who holds the men's 100m backstroke world record?", listOf("Caeleb Dressel", "Ryan Lochte", "Aaron Peirsol", "Florent Manaudou"), "Sports", "Caeleb Dressel set the men's 100m backstroke world record in 2021, but he is best known for his performances in freestyle and butterfly. This record has since been broken by other swimmers."),
            zh = LocalizedContent("谁保持着男子100米仰泳的世界纪录？", listOf("凯勒布·德雷塞尔", "瑞安·洛赫特", "阿伦·佩尔索尔", "弗洛朗·马纳杜"), "体育", "凯勒布·德雷塞尔在2021年创造了男子100米仰泳世界纪录，但他主要以自由泳和蝶泳成绩闻名。该纪录后来被其他游泳运动员打破。"),
            es = LocalizedContent("¿Quién tiene el récord mundial de 100 m espalda masculino?", listOf("Caeleb Dressel", "Ryan Lochte", "Aaron Peirsol", "Florent Manaudou"), "Deportes", "Caeleb Dressel estableció el récord mundial de 100 m espalda masculino en 2021, pero es más conocido por sus actuaciones en estilo libre y mariposa. Este récord ha sido superado posteriormente por otros nadadores.")
        ),
        BilingualQuestion(
            id = 8215, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 200m dos hommes?", listOf("1:51.25", "1:51.86", "1:52.52", "1:53.00"), "Sport", "Le record du monde du 200 m dos hommes est détenu par le nageur américain Aaron Peirsol, établi en 2009 lors des championnats du monde de Rome. Ce temps de 1 minute 51 secondes et 25 centièmes reste inégalé depuis."),
            en = LocalizedContent("What is the men's 200m backstroke world record?", listOf("1:51.25", "1:51.86", "1:52.52", "1:53.00"), "Sports", "The men's 200m backstroke world record is held by American swimmer Aaron Peirsol, set in 2009 at the World Championships in Rome. This time of 1 minute 51 seconds and 25 hundredths remains unbeaten."),
            zh = LocalizedContent("男子200米仰泳的世界纪录是多少？", listOf("1:51.25", "1:51.86", "1:52.52", "1:53.00"), "体育", "男子200米仰泳世界纪录由美国游泳运动员阿伦·佩尔索尔保持，于2009年在罗马世锦赛上创造。1分51秒25的成绩至今未被打破。"),
            es = LocalizedContent("¿Cuál es el récord mundial de 200 m espalda masculino?", listOf("1:51.25", "1:51.86", "1:52.52", "1:53.00"), "Deportes", "El récord mundial de 200 m espalda masculino lo posee el nadador estadounidense Aaron Peirsol, establecido en 2009 en los Campeonatos Mundiales de Roma. Este tiempo de 1 minuto 51 segundos y 25 centésimas sigue imbatido.")
        ),
        BilingualQuestion(
            id = 8216, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 200m dos hommes?", listOf("Aaron Peirsol", "Ryan Lochte", "Kosuke Kitajima", "Michael Phelps"), "Sport", "Aaron Peirsol a établi le record du monde du 200 m dos en 2009 aux championnats des États-Unis, avec un temps de 1 minute 51 secondes et 92 centièmes. Ce record n'a toujours pas été battu."),
            en = LocalizedContent("Who holds the men's 200m backstroke world record?", listOf("Aaron Peirsol", "Ryan Lochte", "Kosuke Kitajima", "Michael Phelps"), "Sports", "Aaron Peirsol set the men's 200m backstroke world record in 2009 at the US Championships with a time of 1 minute 51 seconds and 92 hundredths. This record has not been broken yet."),
            zh = LocalizedContent("谁保持着男子200米仰泳的世界纪录？", listOf("阿伦·佩尔索尔", "瑞安·洛赫特", "北岛康介", "迈克尔·菲尔普斯"), "体育", "阿伦·佩尔索尔在2009年美国锦标赛上以1分51秒92创造了男子200米仰泳世界纪录。该纪录至今未被打破。"),
            es = LocalizedContent("¿Quién tiene el récord mundial de 200 m espalda masculino?", listOf("Aaron Peirsol", "Ryan Lochte", "Kosuke Kitajima", "Michael Phelps"), "Deportes", "Aaron Peirsol estableció el récord mundial de 200 m espalda masculino en 2009 en los Campeonatos de EE. UU. con un tiempo de 1 minuto 51 segundos y 92 centésimas. Este récord aún no ha sido superado.")
        ),
        BilingualQuestion(
            id = 8217, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 100m papillon hommes?", listOf("49.50s", "49.82s", "50.39s", "50.50s"), "Sport", "Le record du monde du 100 m papillon hommes est détenu par le Hongrois Kristóf Milák, établi en 49,82 secondes lors des Championnats du monde 2022 à Budapest."),
            en = LocalizedContent("What is the men's 100m butterfly world record?", listOf("49.50s", "49.82s", "50.39s", "50.50s"), "Sports", "The men's 100m butterfly world record is held by Hungarian Kristóf Milák, set in 49.82 seconds at the 2022 World Championships in Budapest."),
            zh = LocalizedContent("男子100米蝶泳的世界纪录是多少？", listOf("49.50秒", "49.82秒", "50.39秒", "50.50秒"), "体育", "男子100米蝶泳世界纪录由匈牙利选手克里斯托夫·米拉克保持，他在2022年布达佩斯世锦赛上游出49.82秒。"),
            es = LocalizedContent("¿Cuál es el récord mundial de 100 m mariposa masculino?", listOf("49.50s", "49.82s", "50.39s", "50.50s"), "Deportes", "El récord mundial de 100 m mariposa masculino lo posee el húngaro Kristóf Milák, establecido en 49,82 segundos en los Campeonatos Mundiales de 2022 en Budapest.")
        ),
        BilingualQuestion(
            id = 8218, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 100m papillon hommes?", listOf("Caeleb Dressel", "Michael Phelps", "Chad Le Clos", "Daichi Suzuki"), "Sport", "Caeleb Dressel a établi le record du monde du 100 m papillon hommes en 49,45 secondes aux Jeux olympiques de Tokyo en 2021."),
            en = LocalizedContent("Who holds the men's 100m butterfly world record?", listOf("Caeleb Dressel", "Michael Phelps", "Chad Le Clos", "Daichi Suzuki"), "Sports", "Caeleb Dressel set the men's 100m butterfly world record in 49.45 seconds at the 2021 Tokyo Olympics."),
            zh = LocalizedContent("谁保持着男子100米蝶泳的世界纪录？", listOf("凯勒布·德雷塞尔", "迈克尔·菲尔普斯", "查德·勒·克洛斯", "铃木大地"), "体育", "凯勒布·德雷塞尔在2021年东京奥运会上以49.45秒创造了男子100米蝶泳世界纪录。"),
            es = LocalizedContent("¿Quién tiene el récord mundial de 100 m mariposa masculino?", listOf("Caeleb Dressel", "Michael Phelps", "Chad Le Clos", "Daichi Suzuki"), "Deportes", "Caeleb Dressel estableció el récord mundial de 100 m mariposa masculino en 49,45 segundos en los Juegos Olímpicos de Tokio 2021.")
        ),
        BilingualQuestion(
            id = 8219, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 200m papillon hommes?", listOf("1:50.73", "1:51.36", "1:52.09", "1:52.99"), "Sport", "Ce record a été établi par le Hongrois Kristóf Milák aux Championnats du monde 2019 à Gwangju, battant le précédent record de Michael Phelps."),
            en = LocalizedContent("What is the men's 200m butterfly world record?", listOf("1:50.73", "1:51.36", "1:52.09", "1:52.99"), "Sports", "This record was set by Hungarian Kristóf Milák at the 2019 World Championships in Gwangju, breaking Michael Phelps' previous record."),
            zh = LocalizedContent("男子200米蝶泳的世界纪录是多少？", listOf("1:50.73", "1:51.36", "1:52.09", "1:52.99"), "体育", "该纪录由匈牙利选手克里斯托夫·米拉克在2019年光州世锦赛上创造，打破了迈克尔·菲尔普斯之前的纪录。"),
            es = LocalizedContent("¿Cuál es el récord mundial de 200 m mariposa masculino?", listOf("1:50.73", "1:51.36", "1:52.09", "1:52.99"), "Deportes", "Este récord fue establecido por el húngaro Kristóf Milák en los Campeonatos Mundiales de 2019 en Gwangju, superando el récord anterior de Michael Phelps.")
        ),
        BilingualQuestion(
            id = 8220, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 200m papillon hommes?", listOf("Michael Phelps", "Chad Le Clos", "Yannick Agnel", "Tom Shields"), "Sport", "Michael Phelps a établi ce record en 2009 lors des championnats du monde de natation à Rome, avec un temps de 1 minute 51 secondes et 51 centièmes."),
            en = LocalizedContent("Who holds the men's 200m butterfly record?", listOf("Michael Phelps", "Chad Le Clos", "Yannick Agnel", "Tom Shields"), "Sports", "Michael Phelps set this record in 2009 at the World Aquatics Championships in Rome, with a time of 1 minute 51 seconds and 51 hundredths."),
            zh = LocalizedContent("男子200米蝶泳纪录保持者是谁？", listOf("迈克尔·菲尔普斯", "查德·勒·克洛斯", "扬尼克·阿涅尔", "汤姆·希尔兹"), "体育", "迈克尔·菲尔普斯在2009年罗马世界游泳锦标赛上以1分51秒51的成绩创造了这一纪录。"),
            es = LocalizedContent("¿Quién tiene el récord de los 200 m mariposa masculinos?", listOf("Michael Phelps", "Chad Le Clos", "Yannick Agnel", "Tom Shields"), "Deportes", "Michael Phelps estableció este récord en 2009 durante los Campeonatos Mundiales de Natación en Roma, con un tiempo de 1 minuto 51 segundos y 51 centésimas.")
        ),
        BilingualQuestion(
            id = 8221, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 200m 4-nages hommes?", listOf("1:54.00", "1:54.80", "1:55.40", "1:56.51"), "Sport", "Le record du 200 mètres 4 nages hommes est détenu par Ryan Lochte, qui a réalisé 1:56.51 aux championnats du monde de 2011 à Shanghai."),
            en = LocalizedContent("What is the men's 200m individual medley record?", listOf("1:54.00", "1:54.80", "1:55.40", "1:56.51"), "Sports", "The men's 200m individual medley record is held by Ryan Lochte, who achieved 1:56.51 at the 2011 World Championships in Shanghai."),
            zh = LocalizedContent("男子200米个人混合泳纪录是多少？", listOf("1:54.00", "1:54.80", "1:55.40", "1:56.51"), "体育", "男子200米个人混合泳纪录由瑞安·洛赫特保持，他在2011年上海世界锦标赛上游出1分56秒51。"),
            es = LocalizedContent("¿Cuál es el récord de los 200 m estilos individual masculinos?", listOf("1:54.00", "1:54.80", "1:55.40", "1:56.51"), "Deportes", "El récord de los 200 m estilos individual masculinos lo posee Ryan Lochte, quien logró 1:56.51 en los Campeonatos Mundiales de 2011 en Shanghái.")
        ),
        BilingualQuestion(
            id = 8222, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 200m 4-nages hommes?", listOf("Michael Phelps", "Yannick Agnel", "Tom Shields", "Kosuke Kitajima"), "Sport", "Michael Phelps a établi ce record du 200m 4 nages en 2009 lors des championnats du monde de Rome, avec un temps de 1 minute 54 secondes et 16 centièmes, qui tient toujours aujourd'hui."),
            en = LocalizedContent("Who holds the men's 200m individual medley record?", listOf("Michael Phelps", "Yannick Agnel", "Tom Shields", "Kosuke Kitajima"), "Sports", "Michael Phelps set this men's 200m individual medley record in 2009 at the World Championships in Rome, with a time of 1 minute 54 seconds and 16 hundredths, which still stands today."),
            zh = LocalizedContent("男子200米个人混合泳纪录保持者是谁？", listOf("迈克尔·菲尔普斯", "扬尼克·阿涅尔", "汤姆·希尔兹", "北岛康介"), "体育", "迈克尔·菲尔普斯在2009年罗马世界锦标赛上以1分54秒16的成绩创造了男子200米个人混合泳纪录，至今仍未被打破。"),
            es = LocalizedContent("¿Quién tiene el récord de los 200 m estilos individual masculinos?", listOf("Michael Phelps", "Yannick Agnel", "Tom Shields", "Kosuke Kitajima"), "Deportes", "Michael Phelps estableció este récord de los 200 m estilos individual masculinos en 2009 durante los Campeonatos Mundiales de Roma, con un tiempo de 1 minuto 54 segundos y 16 centésimas, que aún se mantiene hoy.")
        ),
        BilingualQuestion(
            id = 8223, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 400m 4-nages hommes?", listOf("4:03.84", "4:05.18", "4:06.30", "4:08.00"), "Sport", "Le record du 400 mètres 4 nages hommes est détenu par le Français Léon Marchand, qui a réalisé 4:03.84 aux championnats du monde 2023 à Fukuoka."),
            en = LocalizedContent("What is the men's 400m individual medley record?", listOf("4:03.84", "4:05.18", "4:06.30", "4:08.00"), "Sports", "The men's 400m individual medley record is held by Frenchman Léon Marchand, who achieved 4:03.84 at the 2023 World Championships in Fukuoka."),
            zh = LocalizedContent("男子400米个人混合泳纪录是多少？", listOf("4:03.84", "4:05.18", "4:06.30", "4:08.00"), "体育", "男子400米个人混合泳纪录由法国选手莱昂·马尔尚保持，他在2023年福冈世界锦标赛上游出4分03秒84。"),
            es = LocalizedContent("¿Cuál es el récord de los 400 m estilos individual masculinos?", listOf("4:03.84", "4:05.18", "4:06.30", "4:08.00"), "Deportes", "El récord de los 400 m estilos individual masculinos lo posee el francés Léon Marchand, quien logró 4:03.84 en los Campeonatos Mundiales de 2023 en Fukuoka.")
        ),
        BilingualQuestion(
            id = 8224, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 400m 4-nages hommes?", listOf("Michael Phelps", "Ryan Lochte", "Tom Shields", "Will Davies"), "Sport", "Michael Phelps a établi ce record du 400 m 4 nages aux Jeux olympiques de Pékin en 2008, avec un temps de 4 min 03 s 84, toujours inégalé en 2024."),
            en = LocalizedContent("Who holds the men's 400m individual medley record?", listOf("Michael Phelps", "Ryan Lochte", "Tom Shields", "Will Davies"), "Sports", "Michael Phelps set this men's 400m individual medley record at the 2008 Beijing Olympics, with a time of 4 min 03 s 84, still unbeaten as of 2024."),
            zh = LocalizedContent("男子400米个人混合泳纪录保持者是谁？", listOf("迈克尔·菲尔普斯", "瑞安·洛赫特", "汤姆·希尔兹", "威尔·戴维斯"), "体育", "迈克尔·菲尔普斯在2008年北京奥运会上以4分03秒84的成绩创造了男子400米个人混合泳纪录，截至2024年仍未被打破。"),
            es = LocalizedContent("¿Quién tiene el récord de los 400 m estilos individual masculinos?", listOf("Michael Phelps", "Ryan Lochte", "Tom Shields", "Will Davies"), "Deportes", "Michael Phelps estableció este récord de los 400 m estilos individual masculinos en los Juegos Olímpicos de Pekín 2008, con un tiempo de 4 min 03 s 84, aún imbatido en 2024.")
        ),
        BilingualQuestion(
            id = 8225, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 100m nage libre femmes?", listOf("52.70s", "52.99s", "53.00s", "53.52s"), "Sport", "Le record du 100 mètres nage libre féminin est détenu par l'Australienne Mollie O'Callaghan, établi en 52,99 secondes lors des championnats d'Australie en 2023, battant le précédent record de Sarah Sjöström."),
            en = LocalizedContent("What is the women's 100m freestyle record?", listOf("52.70s", "52.99s", "53.00s", "53.52s"), "Sports", "The women's 100m freestyle record is held by Australian Mollie O'Callaghan, set at 52.99 seconds during the 2023 Australian Championships, beating the previous record by Sarah Sjöström."),
            zh = LocalizedContent("女子100米自由泳纪录是多少？", listOf("52.70秒", "52.99秒", "53.00秒", "53.52秒"), "体育", "女子100米自由泳纪录由澳大利亚选手莫莉·奥卡拉汉保持，她在2023年澳大利亚锦标赛上游出52.99秒，打破了莎拉·舍斯特伦之前的纪录。"),
            es = LocalizedContent("¿Cuál es el récord de los 100 m libres femeninos?", listOf("52.70s", "52.99s", "53.00s", "53.52s"), "Deportes", "El récord de los 100 m libres femeninos lo posee la australiana Mollie O'Callaghan, establecido en 52.99 segundos durante los Campeonatos Australianos de 2023, superando el récord anterior de Sarah Sjöström.")
        ),
        BilingualQuestion(
            id = 8226, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 100m nage libre femmes?", listOf("Sarah Sjöström", "Bronte Campbell", "Leah Martindale", "Dana Vollmer"), "Sport", "Sarah Sjöström a établi le record du monde du 100 mètres nage libre femmes en 2017, avec un temps de 51,71 secondes, lors des championnats du monde de Budapest."),
            en = LocalizedContent("Who holds the women's 100m freestyle record?", listOf("Sarah Sjöström", "Bronte Campbell", "Leah Martindale", "Dana Vollmer"), "Sports", "Sarah Sjöström set the women's 100m freestyle world record in 2017, with a time of 51.71 seconds, at the World Championships in Budapest."),
            zh = LocalizedContent("女子100米自由泳纪录保持者是谁？", listOf("莎拉·舍斯特伦", "勃朗特·坎贝尔", "莉亚·马丁代尔", "达娜·沃尔默"), "体育", "莎拉·舍斯特伦在2017年布达佩斯世界锦标赛上以51.71秒的成绩创造了女子100米自由泳世界纪录。"),
            es = LocalizedContent("¿Quién tiene el récord de los 100 m libres femeninos?", listOf("Sarah Sjöström", "Bronte Campbell", "Leah Martindale", "Dana Vollmer"), "Deportes", "Sarah Sjöström estableció el récord mundial de los 100 m libres femeninos en 2017, con un tiempo de 51.71 segundos, en los Campeonatos Mundiales de Budapest.")
        ),
        BilingualQuestion(
            id = 8227, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 200m nage libre femmes?", listOf("1:52.99", "1:53.61", "1:54.52", "1:55.52"), "Sport", "Le record du 200 mètres nage libre femmes est détenu par la nageuse australienne Mollie O'Callaghan, établi en 1:52.99 lors des Championnats du monde de 2023 à Fukuoka."),
            en = LocalizedContent("What is the women's 200m freestyle record?", listOf("1:52.99", "1:53.61", "1:54.52", "1:55.52"), "Sports", "The women's 200m freestyle record is held by Australian swimmer Mollie O'Callaghan, set at 1:52.99 during the 2023 World Championships in Fukuoka."),
            zh = LocalizedContent("女子200米自由泳纪录是多少？", listOf("1:52.99", "1:53.61", "1:54.52", "1:55.52"), "体育", "女子200米自由泳纪录由澳大利亚游泳选手莫莉·奥卡拉汉保持，她在2023年福冈世界锦标赛上游出1分52秒99。"),
            es = LocalizedContent("¿Cuál es el récord de los 200 m libres femeninos?", listOf("1:52.99", "1:53.61", "1:54.52", "1:55.52"), "Deportes", "El récord de los 200 m libres femeninos lo posee la nadadora australiana Mollie O'Callaghan, establecido en 1:52.99 durante los Campeonatos Mundiales de 2023 en Fukuoka.")
        ),
        BilingualQuestion(
            id = 8228, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 200m nage libre femmes?", listOf("Federica Pellegrini", "Leah Martindale", "Ariana Kukors", "Kirsty Coventry"), "Sport", "Federica Pellegrini a établi ce record en 2009 lors des championnats du monde de Rome, en 1 min 52 sec 98, un temps qui tient toujours grâce à l'interdiction des combinaisons en polyuréthane."),
            en = LocalizedContent("Who holds the women's 200m freestyle record?", listOf("Federica Pellegrini", "Leah Martindale", "Ariana Kukors", "Kirsty Coventry"), "Sports", "Federica Pellegrini set this record in 2009 at the World Championships in Rome, in 1 min 52 sec 98, a time that still stands due to the ban on polyurethane suits."),
            zh = LocalizedContent("女子200米自由泳纪录保持者是谁？", listOf("费代丽卡·佩莱格里尼", "莉亚·马丁代尔", "阿里安娜·库科尔斯", "柯丝蒂·考文垂"), "体育", "费代丽卡·佩莱格里尼在2009年罗马世界锦标赛上以1分52秒98的成绩创造了这一纪录，由于聚氨酯泳衣被禁，该成绩至今仍未被打破。"),
            es = LocalizedContent("¿Quién tiene el récord de los 200 m libres femeninos?", listOf("Federica Pellegrini", "Leah Martindale", "Ariana Kukors", "Kirsty Coventry"), "Deportes", "Federica Pellegrini estableció este récord en 2009 durante los Campeonatos Mundiales de Roma, en 1 min 52 s 98, un tiempo que aún se mantiene debido a la prohibición de los trajes de poliuretano.")
        ),
        BilingualQuestion(
            id = 8229, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 400m nage libre femmes?", listOf("3:56.40", "3:57.45", "3:58.56", "4:00.00"), "Sport", "Le record du 400 mètres nage libre femmes est détenu par l'Australienne Ariarne Titmus, établi en 2022. Ce temps de 3:57.45 a été réalisé lors des championnats d'Australie."),
            en = LocalizedContent("What is the women's 400m freestyle record?", listOf("3:56.40", "3:57.45", "3:58.56", "4:00.00"), "Sports", "The women's 400m freestyle record is held by Australian Ariarne Titmus, set in 2022. This time of 3:57.45 was achieved at the Australian Championships."),
            zh = LocalizedContent("女子400米自由泳纪录是多少？", listOf("3:56.40", "3:57.45", "3:58.56", "4:00.00"), "体育", "女子400米自由泳纪录由澳大利亚选手阿里亚妮·蒂特马斯保持，于2022年创造。这一3分57秒45的成绩是在澳大利亚锦标赛上取得的。"),
            es = LocalizedContent("¿Cuál es el récord de los 400 m libres femeninos?", listOf("3:56.40", "3:57.45", "3:58.56", "4:00.00"), "Deportes", "El récord de los 400 m libres femeninos lo posee la australiana Ariarne Titmus, establecido en 2022. Este tiempo de 3:57.45 se logró en los Campeonatos Australianos.")
        ),
        BilingualQuestion(
            id = 8230, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 400m nage libre femmes?", listOf("Katie Ledecky", "Laure Manaudou", "Brittany Elmslie", "Heather Fredrick"), "Sport", "Katie Ledecky a établi ce record en 2016 avec un temps de 3:56.46, un exploit jamais égalé depuis. Elle est considérée comme l'une des plus grandes nageuses de l'histoire."),
            en = LocalizedContent("Who holds the women's 400m freestyle record?", listOf("Katie Ledecky", "Laure Manaudou", "Brittany Elmslie", "Heather Fredrick"), "Sports", "Katie Ledecky set this record in 2016 with a time of 3:56.46, an achievement never equaled since. She is considered one of the greatest female swimmers in history."),
            zh = LocalizedContent("谁保持着女子400米自由泳纪录？", listOf("凯蒂·莱德基", "洛尔·马诺杜", "布列塔尼·埃尔姆斯利", "希瑟·弗雷德里克"), "体育", "凯蒂·莱德基于2016年以3分56秒46的成绩创造了这一纪录，至今无人能及。她被认为是历史上最伟大的女子游泳运动员之一。"),
            es = LocalizedContent("¿Quién tiene el récord de los 400 m estilo libre femenino?", listOf("Katie Ledecky", "Laure Manaudou", "Brittany Elmslie", "Heather Fredrick"), "Deportes", "Katie Ledecky estableció este récord en 2016 con un tiempo de 3:56.46, una hazaña nunca igualada desde entonces. Es considerada una de las mejores nadadoras de la historia.")
        ),
        BilingualQuestion(
            id = 8231, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 1500m nage libre femmes?", listOf("15:20.48", "15:28.36", "15:42.54", "16:00.00"), "Sport", "Le record du 1500 mètres nage libre féminin est détenu par Katie Ledecky depuis 2018, établi lors des championnats du monde à Indianapolis."),
            en = LocalizedContent("What is the women's 1500m freestyle record?", listOf("15:20.48", "15:28.36", "15:42.54", "16:00.00"), "Sports", "The women's 1500m freestyle record is held by Katie Ledecky since 2018, set at the World Championships in Indianapolis."),
            zh = LocalizedContent("女子1500米自由泳纪录是多少？", listOf("15:20.48", "15:28.36", "15:42.54", "16:00.00"), "体育", "女子1500米自由泳纪录由凯蒂·莱德基自2018年起保持，她在印第安纳波利斯世锦赛上创造。"),
            es = LocalizedContent("¿Cuál es el récord de los 1500 m estilo libre femenino?", listOf("15:20.48", "15:28.36", "15:42.54", "16:00.00"), "Deportes", "El récord de los 1500 m estilo libre femenino lo posee Katie Ledecky desde 2018, establecido en los Campeonatos Mundiales en Indianápolis.")
        ),
        BilingualQuestion(
            id = 8232, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 1500m nage libre femmes?", listOf("Katie Ledecky", "Hannah Moore", "Leah Martindale", "Jessica Hardy"), "Sport", "Katie Ledecky a établi ce record en 2018 avec un temps de 15 minutes 20 secondes 48 centièmes, un chrono qui tient toujours. Elle est considérée comme la plus grande nageuse de fond de l'histoire."),
            en = LocalizedContent("Who holds the women's 1500m freestyle record?", listOf("Katie Ledecky", "Hannah Moore", "Leah Martindale", "Jessica Hardy"), "Sports", "Katie Ledecky set this record in 2018 with a time of 15 minutes 20 seconds 48 hundredths, a time that still stands. She is considered the greatest female distance swimmer in history."),
            zh = LocalizedContent("谁保持着女子1500米自由泳纪录？", listOf("凯蒂·莱德基", "汉娜·摩尔", "莉亚·马丁代尔", "杰西卡·哈迪"), "体育", "凯蒂·莱德基于2018年以15分20秒48的成绩创造了这一纪录，至今未被打破。她被认为是历史上最伟大的女子长距离游泳运动员。"),
            es = LocalizedContent("¿Quién tiene el récord de los 1500 m estilo libre femenino?", listOf("Katie Ledecky", "Hannah Moore", "Leah Martindale", "Jessica Hardy"), "Deportes", "Katie Ledecky estableció este récord en 2018 con un tiempo de 15 minutos 20 segundos 48 centésimas, una marca que aún se mantiene. Es considerada la mejor nadadora de fondo de la historia.")
        ),
        BilingualQuestion(
            id = 8233, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 100m brasse femmes?", listOf("1:04.13", "1:04.93", "1:05.13", "1:05.55"), "Sport", "Le record du monde du 100 mètres brasse féminin est détenu par l'Américaine Lilly King en 1:04.13, établi le 25 juillet 2017 lors des championnats du monde de natation à Budapest."),
            en = LocalizedContent("What is the women's 100m breaststroke record?", listOf("1:04.13", "1:04.93", "1:05.13", "1:05.55"), "Sports", "The women's 100m breaststroke world record is held by American Lilly King in 1:04.13, set on July 25, 2017 at the World Aquatics Championships in Budapest."),
            zh = LocalizedContent("女子100米蛙泳纪录是多少？", listOf("1:04.13", "1:04.93", "1:05.13", "1:05.55"), "体育", "女子100米蛙泳世界纪录由美国选手莉莉·金保持，成绩为1分04秒13，于2017年7月25日在布达佩斯游泳世锦赛上创造。"),
            es = LocalizedContent("¿Cuál es el récord de los 100 m braza femenino?", listOf("1:04.13", "1:04.93", "1:05.13", "1:05.55"), "Deportes", "El récord mundial de los 100 m braza femenino lo posee la estadounidense Lilly King con 1:04.13, establecido el 25 de julio de 2017 en los Campeonatos Mundiales de Natación en Budapest.")
        ),
        BilingualQuestion(
            id = 8234, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 100m brasse femmes?", listOf("Lilly King", "Ruta Meilutyte", "Yuliya Efimova", "Jessica Hardy"), "Sport", "Lilly King a établi le record du monde du 100 mètres brasse en 2017 aux championnats des États-Unis, avec un temps de 1 minute 4 secondes et 13 centièmes."),
            en = LocalizedContent("Who holds the women's 100m breaststroke record?", listOf("Lilly King", "Ruta Meilutyte", "Yuliya Efimova", "Jessica Hardy"), "Sports", "Lilly King set the world record in the 100m breaststroke in 2017 at the US Championships, with a time of 1 minute 4 seconds and 13 hundredths."),
            zh = LocalizedContent("谁保持着女子100米蛙泳纪录？", listOf("莉莉·金", "鲁塔·梅卢蒂特", "尤利娅·埃菲莫娃", "杰西卡·哈迪"), "体育", "莉莉·金在2017年美国锦标赛上以1分04秒13的成绩创造了100米蛙泳世界纪录。"),
            es = LocalizedContent("¿Quién tiene el récord de los 100 m braza femenino?", listOf("Lilly King", "Ruta Meilutyte", "Yuliya Efimova", "Jessica Hardy"), "Deportes", "Lilly King estableció el récord mundial de los 100 m braza en 2017 en los Campeonatos de EE. UU., con un tiempo de 1 minuto 4 segundos y 13 centésimas.")
        ),
        BilingualQuestion(
            id = 8235, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 200m brasse femmes?", listOf("2:19.11", "2:19.40", "2:20.22", "2:21.72"), "Sport", "Le record du monde du 200 mètres brasse féminin est détenu par la Russe Evgeniia Chikunova, établi en 2023 lors des championnats de Russie."),
            en = LocalizedContent("What is the women's 200m breaststroke record?", listOf("2:19.11", "2:19.40", "2:20.22", "2:21.72"), "Sports", "The women's 200m breaststroke world record is held by Russian Evgeniia Chikunova, set in 2023 at the Russian Championships."),
            zh = LocalizedContent("女子200米蛙泳纪录是多少？", listOf("2:19.11", "2:19.40", "2:20.22", "2:21.72"), "体育", "女子200米蛙泳世界纪录由俄罗斯选手叶夫根尼娅·奇库诺娃保持，于2023年俄罗斯锦标赛上创造。"),
            es = LocalizedContent("¿Cuál es el récord de los 200 m braza femenino?", listOf("2:19.11", "2:19.40", "2:20.22", "2:21.72"), "Deportes", "El récord mundial de los 200 m braza femenino lo posee la rusa Evgeniia Chikunova, establecido en 2023 en los Campeonatos de Rusia.")
        ),
        BilingualQuestion(
            id = 8236, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 200m brasse femmes?", listOf("Tatjana Hüfner", "Yuliya Efimova", "Jessica Hardy", "Tanya Hunks"), "Sport", "Tatjana Hüfner est une lugeuse allemande, spécialiste de la luge, pas de la natation. Le record du 200m brasse femmes est détenu par la Russe Evgeniia Chikunova."),
            en = LocalizedContent("Who holds the women's 200m breaststroke record?", listOf("Tatjana Hüfner", "Yuliya Efimova", "Jessica Hardy", "Tanya Hunks"), "Sports", "Tatjana Hüfner is a German luger, specializing in luge, not swimming. The women's 200m breaststroke record is held by Russian Evgeniia Chikunova."),
            zh = LocalizedContent("谁保持着女子200米蛙泳纪录？", listOf("塔季扬娜·许夫纳", "尤利娅·埃菲莫娃", "杰西卡·哈迪", "坦尼娅·汉克斯"), "体育", "塔季扬娜·许夫纳是德国雪橇运动员，专攻雪橇，而非游泳。女子200米蛙泳纪录由俄罗斯选手叶夫根尼娅·奇库诺娃保持。"),
            es = LocalizedContent("¿Quién tiene el récord de los 200 m braza femenino?", listOf("Tatjana Hüfner", "Yuliya Efimova", "Jessica Hardy", "Tanya Hunks"), "Deportes", "Tatjana Hüfner es una luger alemana, especialista en luge, no en natación. El récord de los 200 m braza femenino lo posee la rusa Evgeniia Chikunova.")
        ),
        BilingualQuestion(
            id = 8237, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 100m dos femmes?", listOf("57.13s", "58.23s", "58.96s", "59.16s"), "Sport", "Le record du 100 mètres dos féminin est détenu par l'Américaine Regan Smith en 57,13 secondes, établi en 2024."),
            en = LocalizedContent("What is the women's 100m backstroke record?", listOf("57.13s", "58.23s", "58.96s", "59.16s"), "Sports", "The women's 100m backstroke record is held by American Regan Smith in 57.13 seconds, set in 2024."),
            zh = LocalizedContent("女子100米仰泳纪录是多少？", listOf("57.13秒", "58.23秒", "58.96秒", "59.16秒"), "体育", "女子100米仰泳纪录由美国选手雷根·史密斯保持，成绩为57.13秒，于2024年创造。"),
            es = LocalizedContent("¿Cuál es el récord de los 100 m espalda femenino?", listOf("57.13s", "58.23s", "58.96s", "59.16s"), "Deportes", "El récord de los 100 m espalda femenino lo posee la estadounidense Regan Smith con 57.13 segundos, establecido en 2024.")
        ),
        BilingualQuestion(
            id = 8238, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 100m dos femmes?", listOf("Kaylee McKeown", "Missy Franklin", "Natalie Coughlin", "Emily Seebohm"), "Sport", "Kaylee McKeown a établi le record du monde du 100 m dos féminin en 2023 avec un temps de 57,33 secondes, dépassant l’ancienne marque détenue par Regan Smith."),
            en = LocalizedContent("Who holds the women's 100m backstroke record?", listOf("Kaylee McKeown", "Missy Franklin", "Natalie Coughlin", "Emily Seebohm"), "Sports", "Kaylee McKeown set the women's 100m backstroke world record in 2023 with a time of 57.33 seconds, surpassing the previous mark held by Regan Smith."),
            zh = LocalizedContent("谁保持着女子100米仰泳纪录？", listOf("凯莉·麦基翁", "米西·富兰克林", "娜塔莉·考芙琳", "埃米莉·西博姆"), "体育", "凯莉·麦基翁在2023年以57.33秒的成绩创造了女子100米仰泳世界纪录，超越了雷根·史密斯此前保持的纪录。"),
            es = LocalizedContent("¿Quién tiene el récord de los 100 m espalda femenino?", listOf("Kaylee McKeown", "Missy Franklin", "Natalie Coughlin", "Emily Seebohm"), "Deportes", "Kaylee McKeown estableció el récord mundial de los 100 m espalda femenino en 2023 con un tiempo de 57.33 segundos, superando la marca anterior de Regan Smith.")
        ),
        BilingualQuestion(
            id = 8239, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 200m dos femmes?", listOf("2:04.06", "2:05.81", "2:06.39", "2:08.45"), "Sport", "Le record du 200 m dos femmes est détenu par l'Australienne Kaylee McKeown, établi en 2:04.06 lors des championnats d'Australie en 2023."),
            en = LocalizedContent("What is the women's 200m backstroke record?", listOf("2:04.06", "2:05.81", "2:06.39", "2:08.45"), "Sports", "The women's 200m backstroke record is held by Australian Kaylee McKeown, set at 2:04.06 during the Australian Championships in 2023."),
            zh = LocalizedContent("女子200米仰泳纪录是多少？", listOf("2:04.06", "2:05.81", "2:06.39", "2:08.45"), "体育", "女子200米仰泳纪录由澳大利亚选手凯莉·麦基翁保持，她在2023年澳大利亚锦标赛上游出2分04秒06。"),
            es = LocalizedContent("¿Cuál es el récord de los 200 m espalda femenino?", listOf("2:04.06", "2:05.81", "2:06.39", "2:08.45"), "Deportes", "El récord de los 200 m espalda femenino lo posee la australiana Kaylee McKeown, establecido en 2:04.06 durante los Campeonatos Australianos de 2023.")
        ),
        BilingualQuestion(
            id = 8240, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 200m dos femmes?", listOf("Kaylee McKeown", "Missy Franklin", "Emily Seebohm", "Margaret Hoelzer"), "Sport", "La nageuse australienne Kaylee McKeown a établi le record du monde du 200 m dos en 2023, avec un temps de 2 min 03 s 14 lors des championnats d'Australie."),
            en = LocalizedContent("Who holds the women's 200m backstroke record?", listOf("Kaylee McKeown", "Missy Franklin", "Emily Seebohm", "Margaret Hoelzer"), "Sports", "Australian swimmer Kaylee McKeown set the world record for the 200m backstroke in 2023, with a time of 2:03.14 at the Australian Championships."),
            zh = LocalizedContent("谁保持着女子200米仰泳纪录？", listOf("凯莉·麦基翁", "米西·富兰克林", "艾米丽·西博姆", "玛格丽特·霍尔泽"), "体育", "澳大利亚游泳运动员凯莉·麦基翁在2023年澳大利亚锦标赛上以2分03秒14的成绩创造了女子200米仰泳世界纪录。"),
            es = LocalizedContent("¿Quién tiene el récord de los 200 m espalda femeninos?", listOf("Kaylee McKeown", "Missy Franklin", "Emily Seebohm", "Margaret Hoelzer"), "Deportes", "La nadadora australiana Kaylee McKeown estableció el récord mundial de 200 m espalda en 2023, con un tiempo de 2:03.14 en los Campeonatos Australianos.")
        ),
        BilingualQuestion(
            id = 8241, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 100m papillon femmes?", listOf("55.18s", "55.48s", "55.55s", "56.06s"), "Sport", "Le record du 100 mètres papillon féminin est détenu par la Suédoise Sarah Sjöström en 55,48 secondes, établi aux Jeux Olympiques de Rio en 2016."),
            en = LocalizedContent("What is the women's 100m butterfly record?", listOf("55.18s", "55.48s", "55.55s", "56.06s"), "Sports", "The women's 100m butterfly record is held by Sweden's Sarah Sjöström at 55.48 seconds, set at the 2016 Rio Olympics."),
            zh = LocalizedContent("女子100米蝶泳纪录是多少？", listOf("55.18秒", "55.48秒", "55.55秒", "56.06秒"), "体育", "女子100米蝶泳纪录由瑞典选手莎拉·舍斯特伦保持，成绩为55.48秒，于2016年里约奥运会创造。"),
            es = LocalizedContent("¿Cuál es el récord de los 100 m mariposa femeninos?", listOf("55.18s", "55.48s", "55.55s", "56.06s"), "Deportes", "El récord de los 100 m mariposa femeninos lo posee la sueca Sarah Sjöström con 55.48 segundos, establecido en los Juegos Olímpicos de Río 2016.")
        ),
        BilingualQuestion(
            id = 8242, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 100m papillon femmes?", listOf("Sarah Sjöström", "Dana Vollmer", "Yolane Kukla", "Jessica Hardy"), "Sport", "La Suédoise Sarah Sjöström a établi le record du monde du 100 m papillon femmes en 2016 aux Jeux olympiques de Rio, avec un temps de 55,48 secondes."),
            en = LocalizedContent("Who holds the women's 100m butterfly record?", listOf("Sarah Sjöström", "Dana Vollmer", "Yolane Kukla", "Jessica Hardy"), "Sports", "Sweden's Sarah Sjöström set the women's 100m butterfly world record in 2016 at the Rio Olympics, with a time of 55.48 seconds."),
            zh = LocalizedContent("谁保持着女子100米蝶泳纪录？", listOf("莎拉·舍斯特伦", "达娜·沃尔默", "约兰·库克拉", "杰西卡·哈迪"), "体育", "瑞典选手莎拉·舍斯特伦在2016年里约奥运会上以55.48秒的成绩创造了女子100米蝶泳世界纪录。"),
            es = LocalizedContent("¿Quién tiene el récord de los 100 m mariposa femeninos?", listOf("Sarah Sjöström", "Dana Vollmer", "Yolane Kukla", "Jessica Hardy"), "Deportes", "La sueca Sarah Sjöström estableció el récord mundial de 100 m mariposa femeninos en 2016 en los Juegos Olímpicos de Río, con un tiempo de 55.48 segundos.")
        ),
        BilingualQuestion(
            id = 8243, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 200m papillon femmes?", listOf("2:05.20", "2:05.61", "2:06.59", "2:07.46"), "Sport", "Le record du 200 m papillon féminin est détenu par la nageuse chinoise Zhang Yufei, qui a réalisé ce temps de 2:05.61 aux Jeux Olympiques de Tokyo en 2021."),
            en = LocalizedContent("What is the women's 200m butterfly record?", listOf("2:05.20", "2:05.61", "2:06.59", "2:07.46"), "Sports", "The women's 200m butterfly record is held by Chinese swimmer Zhang Yufei, who achieved a time of 2:05.61 at the 2021 Tokyo Olympics."),
            zh = LocalizedContent("女子200米蝶泳纪录是多少？", listOf("2:05.20", "2:05.61", "2:06.59", "2:07.46"), "体育", "女子200米蝶泳纪录由中国游泳运动员张雨霏保持，她在2021年东京奥运会上游出了2分05秒61的成绩。"),
            es = LocalizedContent("¿Cuál es el récord de los 200 m mariposa femeninos?", listOf("2:05.20", "2:05.61", "2:06.59", "2:07.46"), "Deportes", "El récord de los 200 m mariposa femeninos lo posee la nadadora china Zhang Yufei, quien logró un tiempo de 2:05.61 en los Juegos Olímpicos de Tokio 2021.")
        ),
        BilingualQuestion(
            id = 8244, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 200m papillon femmes?", listOf("Yolane Kukla", "Dana Vollmer", "Sarah Sjöström", "Liu Zige"), "Sport", "Yolane Kukla, nageuse australienne, a établi ce record du 200 m papillon en 2016 lors des championnats d'Australie, avec un temps de 2 minutes 5 secondes et 61 centièmes."),
            en = LocalizedContent("Who holds the women's 200m butterfly record?", listOf("Yolane Kukla", "Dana Vollmer", "Sarah Sjöström", "Liu Zige"), "Sports", "Yolane Kukla, Australian swimmer, set this 200m butterfly record in 2016 at the Australian Championships, with a time of 2 minutes 5 seconds and 61 hundredths."),
            zh = LocalizedContent("谁保持着女子200米蝶泳纪录？", listOf("约兰·库克拉", "达娜·沃尔默", "莎拉·舍斯特伦", "刘子歌"), "体育", "澳大利亚游泳运动员约兰·库克拉在2016年澳大利亚锦标赛上以2分05秒61的成绩创造了女子200米蝶泳纪录。"),
            es = LocalizedContent("¿Quién tiene el récord de los 200 m mariposa femeninos?", listOf("Yolane Kukla", "Dana Vollmer", "Sarah Sjöström", "Liu Zige"), "Deportes", "Yolane Kukla, nadadora australiana, estableció este récord de 200 m mariposa en 2016 en los Campeonatos Australianos, con un tiempo de 2 minutos 5 segundos y 61 centésimas.")
        ),
        BilingualQuestion(
            id = 8245, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 200m 4-nages femmes?", listOf("2:06.59", "2:07.61", "2:08.45", "2:09.15"), "Sport", "Le record du 200 mètres 4 nages féminin est détenu par la Hongroise Katinka Hosszú, établi en 2:06.59 lors des Championnats du monde 2015 à Kazan."),
            en = LocalizedContent("What is the women's 200m individual medley record?", listOf("2:06.59", "2:07.61", "2:08.45", "2:09.15"), "Sports", "The women's 200m individual medley record is held by Hungary's Katinka Hosszú, set at 2:06.59 during the 2015 World Championships in Kazan."),
            zh = LocalizedContent("女子200米个人混合泳纪录是多少？", listOf("2:06.59", "2:07.61", "2:08.45", "2:09.15"), "体育", "女子200米个人混合泳纪录由匈牙利选手卡廷卡·霍斯祖保持，她在2015年喀山世锦赛上游出了2分06秒59的成绩。"),
            es = LocalizedContent("¿Cuál es el récord de los 200 m estilos femeninos?", listOf("2:06.59", "2:07.61", "2:08.45", "2:09.15"), "Deportes", "El récord de los 200 m estilos femeninos lo posee la húngara Katinka Hosszú, establecido en 2:06.59 durante los Campeonatos Mundiales de 2015 en Kazán.")
        ),
        BilingualQuestion(
            id = 8246, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 200m 4-nages femmes?", listOf("Yolane Kukla", "Hali Flickinger", "Hannah Moore", "Erin Crosby"), "Sport", "Yolane Kukla, nageuse australienne, a établi ce record en 2010 aux Jeux du Commonwealth à Delhi, avec un temps de 2 minutes 08 secondes 34."),
            en = LocalizedContent("Who holds the women's 200m individual medley record?", listOf("Yolane Kukla", "Hali Flickinger", "Hannah Moore", "Erin Crosby"), "Sports", "Yolane Kukla, Australian swimmer, set this record in 2010 at the Commonwealth Games in Delhi, with a time of 2 minutes 8 seconds 34."),
            zh = LocalizedContent("谁保持着女子200米个人混合泳纪录？", listOf("约兰·库克拉", "哈莉·弗利金格", "汉娜·摩尔", "艾琳·克罗斯比"), "体育", "澳大利亚游泳运动员约兰·库克拉在2010年德里英联邦运动会上以2分08秒34的成绩创造了女子200米个人混合泳纪录。"),
            es = LocalizedContent("¿Quién tiene el récord de los 200 m estilos femeninos?", listOf("Yolane Kukla", "Hali Flickinger", "Hannah Moore", "Erin Crosby"), "Deportes", "Yolane Kukla, nadadora australiana, estableció este récord en 2010 en los Juegos de la Commonwealth en Delhi, con un tiempo de 2 minutos 8 segundos 34.")
        ),
        BilingualQuestion(
            id = 8247, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du 400m 4-nages femmes?", listOf("4:28.43", "4:29.05", "4:30.31", "4:32.89"), "Sport", "Le record du 400 mètres 4 nages féminin est détenu par la Hongroise Katinka Hosszú, établi en 4:29.05 lors des Championnats du monde 2016 à Rio."),
            en = LocalizedContent("What is the women's 400m individual medley record?", listOf("4:28.43", "4:29.05", "4:30.31", "4:32.89"), "Sports", "The women's 400m individual medley record is held by Hungary's Katinka Hosszú, set at 4:29.05 during the 2016 World Championships in Rio."),
            zh = LocalizedContent("女子400米个人混合泳纪录是多少？", listOf("4:28.43", "4:29.05", "4:30.31", "4:32.89"), "体育", "女子400米个人混合泳纪录由匈牙利选手卡廷卡·霍斯祖保持，她在2016年里约世锦赛上游出了4分29秒05的成绩。"),
            es = LocalizedContent("¿Cuál es el récord de los 400 m estilos femeninos?", listOf("4:28.43", "4:29.05", "4:30.31", "4:32.89"), "Deportes", "El récord de los 400 m estilos femeninos lo posee la húngara Katinka Hosszú, establecido en 4:29.05 durante los Campeonatos Mundiales de 2016 en Río.")
        ),
        BilingualQuestion(
            id = 8248, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du 400m 4-nages femmes?", listOf("Hali Flickinger", "Yolane Kukla", "Hannah Moore", "Siobhan-Marie O'Connor"), "Sport", "Hali Flickinger a établi le record du 400 m 4 nages féminin en 2021 lors des sélections olympiques américaines, avec un temps de 4 minutes 31 secondes et 81 centièmes."),
            en = LocalizedContent("Who holds the women's 400m individual medley record?", listOf("Hali Flickinger", "Yolane Kukla", "Hannah Moore", "Siobhan-Marie O'Connor"), "Sports", "Hali Flickinger set the women's 400m individual medley record in 2021 at the US Olympic Trials, with a time of 4 minutes 31 seconds and 81 hundredths."),
            zh = LocalizedContent("谁保持着女子400米个人混合泳纪录？", listOf("哈莉·弗利金格", "约兰·库克拉", "汉娜·摩尔", "西沃恩-玛丽·奥康纳"), "体育", "哈莉·弗利金格在2021年美国奥运选拔赛上以4分31秒81的成绩创造了女子400米个人混合泳纪录。"),
            es = LocalizedContent("¿Quién tiene el récord de los 400 m estilos femeninos?", listOf("Hali Flickinger", "Yolane Kukla", "Hannah Moore", "Siobhan-Marie O'Connor"), "Deportes", "Hali Flickinger estableció el récord de los 400 m estilos femeninos en 2021 en las pruebas olímpicas de EE. UU., con un tiempo de 4 minutos 31 segundos y 81 centésimas.")
        ),
        BilingualQuestion(
            id = 8249, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de médailles Katie Ledecky a-t-elle remportées?", listOf("5", "6", "7", "8"), "Sport", "Katie Ledecky a remporté sept médailles d'or olympiques en natation entre 2012 et 2020, ce qui en fait l'une des nageuses les plus décorées de l'histoire."),
            en = LocalizedContent("How many medals has Katie Ledecky won?", listOf("5", "6", "7", "8"), "Sports", "Katie Ledecky has won seven Olympic gold medals in swimming between 2012 and 2020, making her one of the most decorated female swimmers in history."),
            zh = LocalizedContent("凯蒂·莱德基赢得了多少枚奖牌？", listOf("5", "6", "7", "8"), "体育", "凯蒂·莱德基在2012年至2020年间赢得了七枚奥运金牌，使她成为历史上获得奖牌最多的女子游泳运动员之一。"),
            es = LocalizedContent("¿Cuántas medallas ha ganado Katie Ledecky?", listOf("5", "6", "7", "8"), "Deportes", "Katie Ledecky ha ganado siete medallas de oro olímpicas en natación entre 2012 y 2020, lo que la convierte en una de las nadadoras más condecoradas de la historia.")
        ),
    )

    private fun part5(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 8250, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de fois la Nouvelle-Zélande a-t-elle remporté la Coupe du Monde de rugby?", listOf("1", "2", "3", "4"), "Sport", "Les All Blacks ont remporté la Coupe du Monde de rugby à trois reprises : en 1987, 2011 et 2015."),
            en = LocalizedContent("How many times has New Zealand won the Rugby World Cup?", listOf("1", "2", "3", "4"), "Sports", "The All Blacks have won the Rugby World Cup three times: in 1987, 2011, and 2015."),
            zh = LocalizedContent("新西兰赢得了多少次橄榄球世界杯？", listOf("1", "2", "3", "4"), "体育", "全黑队曾三次赢得橄榄球世界杯：1987年、2011年和2015年。"),
            es = LocalizedContent("¿Cuántas veces ha ganado Nueva Zelanda la Copa del Mundo de Rugby?", listOf("1", "2", "3", "4"), "Deportes", "Los All Blacks han ganado la Copa del Mundo de Rugby tres veces: en 1987, 2011 y 2015.")
        ),
        BilingualQuestion(
            id = 8251, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a remporté la Coupe du Monde de rugby 2019?", listOf("Afrique du Sud", "Angleterre", "Nouvelle-Zélande", "Japon"), "Sport", "L'Afrique du Sud a battu l'Angleterre en finale (32-12) au Japon, décrochant ainsi son troisième titre mondial après 1995 et 2007."),
            en = LocalizedContent("Which country won the 2019 Rugby World Cup?", listOf("South Africa", "England", "New Zealand", "Japan"), "Sports", "South Africa beat England in the final (32-12) in Japan, securing their third world title after 1995 and 2007."),
            zh = LocalizedContent("哪个国家赢得了2019年橄榄球世界杯？", listOf("南非", "英格兰", "新西兰", "日本"), "体育", "南非在决赛中击败英格兰（32-12），在日本赢得了他们的第三个世界冠军，此前曾在1995年和2007年夺冠。"),
            es = LocalizedContent("¿Qué país ganó la Copa del Mundo de Rugby 2019?", listOf("Sudáfrica", "Inglaterra", "Nueva Zelanda", "Japón"), "Deportes", "Sudáfrica venció a Inglaterra en la final (32-12) en Japón, obteniendo su tercer título mundial después de 1995 y 2007.")
        ),
        BilingualQuestion(
            id = 8252, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de joueurs y a-t-il dans une équipe de rugby?", listOf("12", "13", "15", "16"), "Sport", "Au rugby à XV, chaque équipe aligne 15 joueurs sur le terrain : 8 avants et 7 arrières. Cette règle est définie par World Rugby, l'instance dirigeante du sport."),
            en = LocalizedContent("How many players are there in a rugby team?", listOf("12", "13", "15", "16"), "Sports", "In rugby union, each team fields 15 players on the field: 8 forwards and 7 backs. This rule is defined by World Rugby, the sport's governing body."),
            zh = LocalizedContent("一支橄榄球队有多少名球员？", listOf("12", "13", "15", "16"), "体育", "在英式橄榄球中，每支球队在场上派出15名球员：8名前锋和7名后卫。这一规则由世界橄榄球理事会（World Rugby）制定。"),
            es = LocalizedContent("¿Cuántos jugadores hay en un equipo de rugby?", listOf("12", "13", "15", "16"), "Deportes", "En el rugby union, cada equipo alinea 15 jugadores en el campo: 8 delanteros y 7 zagueros. Esta regla está definida por World Rugby, el organismo rector del deporte.")
        ),
        BilingualQuestion(
            id = 8253, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nombre de points pour un essai au rugby?", listOf("3", "4", "5", "7"), "Sport", "Au rugby, un essai rapporte 5 points depuis 1992, date à laquelle la valeur est passée de 4 à 5 points pour encourager le jeu offensif."),
            en = LocalizedContent("How many points is a try worth in rugby?", listOf("3", "4", "5", "7"), "Sports", "In rugby, a try is worth 5 points since 1992, when the value was increased from 4 to 5 points to encourage attacking play."),
            zh = LocalizedContent("橄榄球中一次达阵得多少分？", listOf("3", "4", "5", "7"), "体育", "自1992年起，橄榄球中一次达阵得5分，当时分值从4分提高到5分以鼓励进攻。"),
            es = LocalizedContent("¿Cuántos puntos vale un ensayo en el rugby?", listOf("3", "4", "5", "7"), "Deportes", "En el rugby, un ensayo vale 5 puntos desde 1992, cuando el valor se incrementó de 4 a 5 puntos para fomentar el juego ofensivo.")
        ),
        BilingualQuestion(
            id = 8254, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a remporté le Rugby World Cup 2023?", listOf("Nouvelle-Zélande", "Afrique du Sud", "Angleterre", "France"), "Sport", "L'Afrique du Sud a battu la Nouvelle-Zélande 12-11 en finale, remportant ainsi son quatrième titre mondial de rugby, un record."),
            en = LocalizedContent("Which country won the 2023 Rugby World Cup?", listOf("New Zealand", "South Africa", "England", "France"), "Sports", "South Africa beat New Zealand 12-11 in the final, winning their fourth world rugby title, a record."),
            zh = LocalizedContent("哪个国家赢得了2023年橄榄球世界杯？", listOf("新西兰", "南非", "英格兰", "法国"), "体育", "南非在决赛中以12-11击败新西兰，赢得了他们的第四个橄榄球世界冠军，创下纪录。"),
            es = LocalizedContent("¿Qué país ganó la Copa del Mundo de Rugby 2023?", listOf("Nueva Zelanda", "Sudáfrica", "Inglaterra", "Francia"), "Deportes", "Sudáfrica venció a Nueva Zelanda 12-11 en la final, ganando su cuarto título mundial de rugby, un récord.")
        ),
        BilingualQuestion(
            id = 8255, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de fois l'Afrique du Sud a-t-elle remporté la Coupe du Monde de rugby?", listOf("2", "3", "4", "5"), "Sport", "L'Afrique du Sud a remporté la Coupe du Monde de rugby à trois reprises : en 1995, 2007 et 2019, ce qui en fait l'une des nations les plus titrées de la compétition."),
            en = LocalizedContent("How many times has South Africa won the Rugby World Cup?", listOf("2", "3", "4", "5"), "Sports", "South Africa has won the Rugby World Cup three times: in 1995, 2007, and 2019, making it one of the most successful nations in the competition."),
            zh = LocalizedContent("南非赢得了多少次橄榄球世界杯？", listOf("2", "3", "4", "5"), "体育", "南非曾三次赢得橄榄球世界杯：1995年、2007年和2019年，使其成为该赛事中最成功的国家之一。"),
            es = LocalizedContent("¿Cuántas veces ha ganado Sudáfrica la Copa del Mundo de Rugby?", listOf("2", "3", "4", "5"), "Deportes", "Sudáfrica ha ganado la Copa del Mundo de Rugby tres veces: en 1995, 2007 y 2019, lo que la convierte en una de las naciones más exitosas de la competición.")
        ),
        BilingualQuestion(
            id = 8256, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand tournoi de rugby annuel?", listOf("Six Nations", "Rugby Championship", "Pacific Nations Cup", "Americas Rugby Championship"), "Sport", "Le Tournoi des Six Nations est la compétition annuelle de rugby la plus prestigieuse, opposant l'Angleterre, l'Écosse, le pays de Galles, l'Irlande, la France et l'Italie."),
            en = LocalizedContent("What is the biggest annual rugby tournament?", listOf("Six Nations", "Rugby Championship", "Pacific Nations Cup", "Americas Rugby Championship"), "Sports", "The Six Nations Championship is the most prestigious annual rugby competition, featuring England, Scotland, Wales, Ireland, France, and Italy."),
            zh = LocalizedContent("最大的年度橄榄球锦标赛是什么？", listOf("六国锦标赛", "橄榄球锦标赛", "太平洋国家杯", "美洲橄榄球锦标赛"), "体育", "六国锦标赛是最负盛名的年度橄榄球赛事，参赛队伍包括英格兰、苏格兰、威尔士、爱尔兰、法国和意大利。"),
            es = LocalizedContent("¿Cuál es el torneo anual de rugby más importante?", listOf("Seis Naciones", "Rugby Championship", "Pacific Nations Cup", "Americas Rugby Championship"), "Deportes", "El Torneo de las Seis Naciones es la competición anual de rugby más prestigiosa, en la que participan Inglaterra, Escocia, Gales, Irlanda, Francia e Italia.")
        ),
        BilingualQuestion(
            id = 8257, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de nations participent aux Six Nations?", listOf("4", "5", "6", "7"), "Sport", "Le tournoi des Six Nations oppose traditionnellement six équipes nationales européennes de rugby : l'Angleterre, l'Écosse, le Pays de Galles, l'Irlande, la France et l'Italie."),
            en = LocalizedContent("How many nations participate in the Six Nations?", listOf("4", "5", "6", "7"), "Sports", "The Six Nations Championship traditionally features six European national rugby teams: England, Scotland, Wales, Ireland, France, and Italy."),
            zh = LocalizedContent("有多少个国家参加六国锦标赛？", listOf("4", "5", "6", "7"), "体育", "六国锦标赛传统上由六支欧洲国家橄榄球队参加：英格兰、苏格兰、威尔士、爱尔兰、法国和意大利。"),
            es = LocalizedContent("¿Cuántas naciones participan en el Seis Naciones?", listOf("4", "5", "6", "7"), "Deportes", "El Torneo de las Seis Naciones cuenta tradicionalmente con seis equipos nacionales europeos de rugby: Inglaterra, Escocia, Gales, Irlanda, Francia e Italia.")
        ),
        BilingualQuestion(
            id = 8258, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a remporté le Calcutta Cup le plus de fois?", listOf("Angleterre", "Écosse", "France", "Pays de Galles"), "Sport", "Le Calcutta Cup est un trophée de rugby à XV disputé annuellement entre l'Angleterre et l'Écosse depuis 1879. L'Angleterre détient le record du plus grand nombre de victoires dans cette compétition."),
            en = LocalizedContent("Which country has won the Calcutta Cup the most times?", listOf("England", "Scotland", "France", "Wales"), "Sports", "The Calcutta Cup is a rugby union trophy contested annually between England and Scotland since 1879. England holds the record for the most wins in this competition."),
            zh = LocalizedContent("哪个国家赢得加尔各答杯的次数最多？", listOf("英格兰", "苏格兰", "法国", "威尔士"), "体育", "加尔各答杯是自1879年以来每年在英格兰和苏格兰之间争夺的橄榄球联盟奖杯。英格兰保持着该赛事中获胜次数最多的纪录。"),
            es = LocalizedContent("¿Qué país ha ganado la Copa Calcuta más veces?", listOf("Inglaterra", "Escocia", "Francia", "Gales"), "Deportes", "La Copa Calcuta es un trofeo de rugby union que se disputa anualmente entre Inglaterra y Escocia desde 1879. Inglaterra tiene el récord de más victorias en esta competición.")
        ),
        BilingualQuestion(
            id = 8259, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté le plus de matchs internationaux de rugby?", listOf("Dan Carter", "Richie McCaw", "Alun Wyn Jones", "Brian O'Driscoll"), "Sport", "Alun Wyn Jones détient le record du nombre de sélections internationales en rugby, avec 158 capes pour le pays de Galles et 12 pour les Lions britanniques et irlandais, totalisant 170 matchs internationaux."),
            en = LocalizedContent("Who has won the most international rugby matches?", listOf("Dan Carter", "Richie McCaw", "Alun Wyn Jones", "Brian O'Driscoll"), "Sports", "Alun Wyn Jones holds the record for the most international rugby caps, with 158 for Wales and 12 for the British and Irish Lions, totaling 170 international matches."),
            zh = LocalizedContent("谁赢得了最多的国际橄榄球比赛？", listOf("丹·卡特", "里奇·麦考", "阿伦·温·琼斯", "布莱恩·奥德里斯科尔"), "体育", "阿伦·温·琼斯保持着国际橄榄球出场次数最多的纪录，代表威尔士出场158次，代表英国和爱尔兰雄狮队出场12次，总计170场国际比赛。"),
            es = LocalizedContent("¿Quién ha ganado más partidos internacionales de rugby?", listOf("Dan Carter", "Richie McCaw", "Alun Wyn Jones", "Brian O'Driscoll"), "Deportes", "Alun Wyn Jones tiene el récord de más partidos internacionales de rugby, con 158 con Gales y 12 con los British and Irish Lions, totalizando 170 partidos internacionales.")
        ),
        BilingualQuestion(
            id = 8260, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de matchs internationaux Richie McCaw a-t-il disputés?", listOf("130", "138", "148", "158"), "Sport", "Richie McCaw a disputé 148 matchs pour les All Blacks, mais seulement 138 sont officiellement reconnus comme test matchs internationaux par World Rugby."),
            en = LocalizedContent("How many international matches did Richie McCaw play?", listOf("130", "138", "148", "158"), "Sports", "Richie McCaw played 148 matches for the All Blacks, but only 138 are officially recognized as international test matches by World Rugby."),
            zh = LocalizedContent("里奇·麦考参加了多少场国际比赛？", listOf("130", "138", "148", "158"), "体育", "里奇·麦考为全黑队出战了148场比赛，但只有138场被世界橄榄球协会正式认定为国际测试赛。"),
            es = LocalizedContent("¿Cuántos partidos internacionales disputó Richie McCaw?", listOf("130", "138", "148", "158"), "Deportes", "Richie McCaw disputó 148 partidos con los All Blacks, pero solo 138 son reconocidos oficialmente como test matches internacionales por World Rugby.")
        ),
        BilingualQuestion(
            id = 8261, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de points en match international?", listOf("36", "42", "48", "54"), "Sport", "Le record du nombre de points marqués par un joueur en match international de rugby est de 42 points, établi par l'Anglais Jonny Wilkinson contre l'Italie en 2001."),
            en = LocalizedContent("What is the record for the number of points in an international match?", listOf("36", "42", "48", "54"), "Sports", "The record for the most points scored by a player in an international rugby match is 42, set by England's Jonny Wilkinson against Italy in 2001."),
            zh = LocalizedContent("国际比赛单场得分纪录是多少？", listOf("36", "42", "48", "54"), "体育", "国际橄榄球比赛中单场个人得分最高纪录是42分，由英格兰球员乔尼·威尔金森在2001年对阵意大利时创造。"),
            es = LocalizedContent("¿Cuál es el récord de puntos en un partido internacional?", listOf("36", "42", "48", "54"), "Deportes", "El récord de puntos anotados por un jugador en un partido internacional de rugby es de 42, establecido por el inglés Jonny Wilkinson contra Italia en 2001.")
        ),
        BilingualQuestion(
            id = 8262, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a marqué le plus de points en carrière internationale?", listOf("Dan Carter", "Beauden Barrett", "Aaron Cruden", "Stephen Jones"), "Sport", "Dan Carter détient le record de points en carrière internationale avec 1598 points, total accumulé sous le maillot des All Blacks entre 2003 et 2015."),
            en = LocalizedContent("Who has scored the most points in an international career?", listOf("Dan Carter", "Beauden Barrett", "Aaron Cruden", "Stephen Jones"), "Sports", "Dan Carter holds the record for most points in an international career with 1598 points, accumulated while playing for the All Blacks between 2003 and 2015."),
            zh = LocalizedContent("谁在国际职业生涯中得分最多？", listOf("丹·卡特", "博登·巴雷特", "亚伦·克鲁登", "斯蒂芬·琼斯"), "体育", "丹·卡特保持着国际职业生涯最高得分纪录，共1598分，他在2003年至2015年间为全黑队效力时累积。"),
            es = LocalizedContent("¿Quién ha anotado más puntos en una carrera internacional?", listOf("Dan Carter", "Beauden Barrett", "Aaron Cruden", "Stephen Jones"), "Deportes", "Dan Carter posee el récord de más puntos en una carrera internacional con 1598 puntos, acumulados vistiendo la camiseta de los All Blacks entre 2003 y 2015.")
        ),
        BilingualQuestion(
            id = 8263, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre d'essais en match international?", listOf("4", "5", "6", "7"), "Sport", "Le record de six essais en match international a été établi par le Néo-Zélandais Marc Ellis contre le Japon en 1995, puis égalé par plusieurs joueurs dont l'Australien Chris Latham en 2004."),
            en = LocalizedContent("What is the record for the number of tries in an international match?", listOf("4", "5", "6", "7"), "Sports", "The record of six tries in an international match was set by New Zealander Marc Ellis against Japan in 1995, later equaled by several players including Australian Chris Latham in 2004."),
            zh = LocalizedContent("国际比赛单场达阵纪录是多少？", listOf("4", "5", "6", "7"), "体育", "单场国际比赛达阵纪录为6次，由新西兰球员马克·埃利斯在1995年对阵日本时创造，后来被包括澳大利亚球员克里斯·莱瑟姆在内的多人追平。"),
            es = LocalizedContent("¿Cuál es el récord de ensayos en un partido internacional?", listOf("4", "5", "6", "7"), "Deportes", "El récord de seis ensayos en un partido internacional fue establecido por el neozelandés Marc Ellis contra Japón en 1995, luego igualado por varios jugadores, incluido el australiano Chris Latham en 2004.")
        ),
        BilingualQuestion(
            id = 8264, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a marqué le plus d'essais en carrière internationale?", listOf("Lomu Jonah", "Bryan Habana", "Dan Sheehan", "Dusatoi Narikasau"), "Sport", "Bryan Habana, ailier sud-africain, détient le record avec 67 essais en test-matchs, dépassant l'ancien record de 64 de son compatriote Daisuke Ohata."),
            en = LocalizedContent("Who has scored the most tries in an international career?", listOf("Lomu Jonah", "Bryan Habana", "Dan Sheehan", "Dusatoi Narikasau"), "Sports", "Bryan Habana, South African winger, holds the record with 67 test tries, surpassing the previous record of 64 by compatriot Daisuke Ohata."),
            zh = LocalizedContent("谁在国际职业生涯中达阵最多？", listOf("约拿·洛穆", "布莱恩·哈巴纳", "丹·希恩", "杜萨托伊·纳里卡索"), "体育", "南非边锋布莱恩·哈巴纳以67次测试赛达阵保持纪录，超越了同胞大畑大介此前64次的纪录。"),
            es = LocalizedContent("¿Quién ha anotado más ensayos en una carrera internacional?", listOf("Lomu Jonah", "Bryan Habana", "Dan Sheehan", "Dusatoi Narikasau"), "Deportes", "Bryan Habana, wing sudafricano, posee el récord con 67 ensayos en test matches, superando el récord anterior de 64 de su compatriota Daisuke Ohata.")
        ),
        BilingualQuestion(
            id = 8265, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de fois les All Blacks ont-ils remporté la Coupe du Monde?", listOf("2", "3", "4", "5"), "Sport", "Les All Blacks ont gagné la Coupe du Monde de rugby à trois reprises : en 1987 (première édition), 2011 et 2015."),
            en = LocalizedContent("How many times have the All Blacks won the World Cup?", listOf("2", "3", "4", "5"), "Sports", "The All Blacks have won the Rugby World Cup three times: in 1987 (first edition), 2011, and 2015."),
            zh = LocalizedContent("全黑队赢得了多少次世界杯？", listOf("2", "3", "4", "5"), "体育", "全黑队三次赢得橄榄球世界杯：1987年（首届）、2011年和2015年。"),
            es = LocalizedContent("¿Cuántas veces han ganado los All Blacks la Copa del Mundo?", listOf("2", "3", "4", "5"), "Deportes", "Los All Blacks han ganado la Copa del Mundo de rugby en tres ocasiones: en 1987 (primera edición), 2011 y 2015.")
        ),
        BilingualQuestion(
            id = 8266, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le premier Rugby World Cup a-t-il eu lieu?", listOf("1985", "1987", "1989", "1991"), "Sport", "La première Coupe du monde de rugby s'est déroulée en 1987, co-organisée par la Nouvelle-Zélande et l'Australie, et remportée par les All Blacks."),
            en = LocalizedContent("In which year did the first Rugby World Cup take place?", listOf("1985", "1987", "1989", "1991"), "Sports", "The first Rugby World Cup took place in 1987, co-hosted by New Zealand and Australia, and won by the All Blacks."),
            zh = LocalizedContent("第一届橄榄球世界杯在哪一年举行？", listOf("1985", "1987", "1989", "1991"), "体育", "第一届橄榄球世界杯于1987年举行，由新西兰和澳大利亚联合主办，全黑队夺冠。"),
            es = LocalizedContent("¿En qué año se celebró la primera Copa del Mundo de Rugby?", listOf("1985", "1987", "1989", "1991"), "Deportes", "La primera Copa del Mundo de rugby se celebró en 1987, coorganizada por Nueva Zelanda y Australia, y ganada por los All Blacks.")
        ),
        BilingualQuestion(
            id = 8267, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a remporté le premier Rugby World Cup?", listOf("Nouvelle-Zélande", "Australie", "France", "Afrique du Sud"), "Sport", "La première Coupe du monde de rugby a eu lieu en 1987, co-organisée par l'Australie et la Nouvelle-Zélande. L'Australie a battu la France en finale pour remporter le titre inaugural."),
            en = LocalizedContent("Which country won the first Rugby World Cup?", listOf("New Zealand", "Australia", "France", "South Africa"), "Sports", "The first Rugby World Cup took place in 1987, co-hosted by Australia and New Zealand. Australia beat France in the final to win the inaugural title."),
            zh = LocalizedContent("哪个国家赢得了第一届橄榄球世界杯？", listOf("新西兰", "澳大利亚", "法国", "南非"), "体育", "第一届橄榄球世界杯于1987年举行，由澳大利亚和新西兰联合主办。澳大利亚在决赛中击败法国，赢得了首届冠军。"),
            es = LocalizedContent("¿Qué país ganó la primera Copa del Mundo de Rugby?", listOf("Nueva Zelanda", "Australia", "Francia", "Sudáfrica"), "Deportes", "La primera Copa del Mundo de rugby tuvo lugar en 1987, coorganizada por Australia y Nueva Zelanda. Australia venció a Francia en la final para ganar el título inaugural.")
        ),
        BilingualQuestion(
            id = 8268, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de fois la France a-t-elle remporté la Coupe du Monde de rugby?", listOf("0", "1", "2", "3"), "Sport", "La France n'a jamais remporté la Coupe du Monde de rugby, malgré trois finales perdues en 1987, 1999 et 2011."),
            en = LocalizedContent("How many times has France won the Rugby World Cup?", listOf("0", "1", "2", "3"), "Sports", "France has never won the Rugby World Cup, despite losing three finals in 1987, 1999, and 2011."),
            zh = LocalizedContent("法国赢得了多少次橄榄球世界杯？", listOf("0", "1", "2", "3"), "体育", "法国从未赢得过橄榄球世界杯，尽管在1987年、1999年和2011年三次进入决赛均告失利。"),
            es = LocalizedContent("¿Cuántas veces ha ganado Francia la Copa del Mundo de Rugby?", listOf("0", "1", "2", "3"), "Deportes", "Francia nunca ha ganado la Copa del Mundo de rugby, a pesar de perder tres finales en 1987, 1999 y 2011.")
        ),
        BilingualQuestion(
            id = 8269, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le Tri-Nations devenu?", listOf("Rugby Championship", "Pacific Nations Cup", "Americas Rugby Championship", "Nations League"), "Sport", "En 2012, le Tri-Nations, qui opposait l'Afrique du Sud, la Nouvelle-Zélande et l'Australie, s'est élargi avec l'ajout de l'Argentine pour devenir le Rugby Championship."),
            en = LocalizedContent("What did the Tri-Nations become?", listOf("Rugby Championship", "Pacific Nations Cup", "Americas Rugby Championship", "Nations League"), "Sports", "In 2012, the Tri-Nations, which involved South Africa, New Zealand, and Australia, expanded with the addition of Argentina to become the Rugby Championship."),
            zh = LocalizedContent("三国赛变成了什么？", listOf("橄榄球锦标赛", "太平洋国家杯", "美洲橄榄球锦标赛", "国家联赛"), "体育", "2012年，由南非、新西兰和澳大利亚组成的三国赛随着阿根廷的加入而扩大，成为橄榄球锦标赛。"),
            es = LocalizedContent("¿En qué se convirtió el Tri-Nations?", listOf("Rugby Championship", "Pacific Nations Cup", "Americas Rugby Championship", "Nations League"), "Deportes", "En 2012, el Tri-Nations, que enfrentaba a Sudáfrica, Nueva Zelanda y Australia, se amplió con la incorporación de Argentina para convertirse en el Rugby Championship.")
        ),
        BilingualQuestion(
            id = 8270, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de pays participent au Rugby Championship?", listOf("3", "4", "5", "6"), "Sport", "Le Rugby Championship réunit les quatre grandes nations de l'hémisphère sud : l'Afrique du Sud, l'Australie, la Nouvelle-Zélande et l'Argentine, depuis l'adhésion de cette dernière en 2012."),
            en = LocalizedContent("How many countries participate in the Rugby Championship?", listOf("3", "4", "5", "6"), "Sports", "The Rugby Championship brings together the four major southern hemisphere nations: South Africa, Australia, New Zealand, and Argentina, since the latter joined in 2012."),
            zh = LocalizedContent("有多少个国家参加橄榄球锦标赛？", listOf("3", "4", "5", "6"), "体育", "橄榄球锦标赛汇集了南半球的四个主要国家：南非、澳大利亚、新西兰和阿根廷，后者于2012年加入。"),
            es = LocalizedContent("¿Cuántos países participan en el Rugby Championship?", listOf("3", "4", "5", "6"), "Deportes", "El Rugby Championship reúne a las cuatro grandes naciones del hemisferio sur: Sudáfrica, Australia, Nueva Zelanda y Argentina, desde la adhesión de esta última en 2012.")
        ),
        BilingualQuestion(
            id = 8271, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de points marqués en Test match?", listOf("91", "100", "109", "120"), "Sport", "Le record de 109 points a été établi par la Nouvelle-Zélande contre le Japon en 1995, marquant la plus large victoire en Test match de rugby."),
            en = LocalizedContent("What is the highest number of points scored in a Test match?", listOf("91", "100", "109", "120"), "Sports", "The record of 109 points was set by New Zealand against Japan in 1995, marking the largest victory in a rugby Test match."),
            zh = LocalizedContent("测试赛中的最高得分是多少？", listOf("91", "100", "109", "120"), "体育", "109分的纪录是由新西兰在1995年对阵日本时创造的，这是橄榄球测试赛中最大的胜利。"),
            es = LocalizedContent("¿Cuál es el mayor número de puntos anotados en un Test match?", listOf("91", "100", "109", "120"), "Deportes", "El récord de 109 puntos fue establecido por Nueva Zelanda contra Japón en 1995, marcando la victoria más amplia en un Test match de rugby.")
        ),
        BilingualQuestion(
            id = 8272, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a marqué 109 points en Test match?", listOf("Gavin Henson", "Jonny Wilkinson", "Percy Montgomery", "Beauden Barrett"), "Sport", "Percy Montgomery, arrière sud-africain, détient le record du plus grand nombre de points marqués en Test matchs avec 109, grâce à sa précision au pied lors des tournées de 2007."),
            en = LocalizedContent("Who scored 109 points in a Test match?", listOf("Gavin Henson", "Jonny Wilkinson", "Percy Montgomery", "Beauden Barrett"), "Sports", "Percy Montgomery, South African fullback, holds the record for the most points scored in Test matches with 109, thanks to his accuracy with the boot during the 2007 tours."),
            zh = LocalizedContent("谁在测试赛中得了109分？", listOf("加文·亨森", "乔尼·威尔金森", "珀西·蒙哥马利", "博登·巴雷特"), "体育", "南非后卫珀西·蒙哥马利保持着测试赛最高得分纪录，共109分，这得益于他在2007年巡回赛中的精准踢球。"),
            es = LocalizedContent("¿Quién anotó 109 puntos en un Test match?", listOf("Gavin Henson", "Jonny Wilkinson", "Percy Montgomery", "Beauden Barrett"), "Deportes", "Percy Montgomery, zaguero sudafricano, posee el récord de más puntos anotados en Test matches con 109, gracias a su precisión a la hora de patear durante las giras de 2007.")
        ),
        BilingualQuestion(
            id = 8273, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois l'Angleterre a-t-elle remporté le Grand Chelem au Six Nations?", listOf("8", "10", "12", "14"), "Sport", "L'Angleterre a remporté le Grand Chelem dans le Tournoi des Six Nations (et son prédécesseur, le Cinq Nations) à 12 reprises, la dernière fois en 2016."),
            en = LocalizedContent("How many times has England won the Grand Slam in the Six Nations?", listOf("8", "10", "12", "14"), "Sports", "England has won the Grand Slam in the Six Nations (and its predecessor, the Five Nations) 12 times, most recently in 2016."),
            zh = LocalizedContent("英格兰在六国赛中赢得了多少次大满贯？", listOf("8", "10", "12", "14"), "体育", "英格兰在六国赛（及其前身五国赛）中赢得了12次大满贯，最近一次是在2016年。"),
            es = LocalizedContent("¿Cuántas veces ha ganado Inglaterra el Grand Slam en el Seis Naciones?", listOf("8", "10", "12", "14"), "Deportes", "Inglaterra ha ganado el Grand Slam en el Torneo de las Seis Naciones (y su predecesor, el Cinco Naciones) en 12 ocasiones, la última vez en 2016.")
        ),
        BilingualQuestion(
            id = 8274, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de victoires consécutives en rugby?", listOf("15", "17", "18", "20"), "Sport", "Le record de 18 victoires consécutives en rugby est détenu par la Nouvelle-Zélande, réalisé entre 2015 et 2016, incluant leur titre de champion du monde 2015."),
            en = LocalizedContent("What is the record for consecutive wins in rugby?", listOf("15", "17", "18", "20"), "Sports", "The record of 18 consecutive wins in rugby is held by New Zealand, achieved between 2015 and 2016, including their 2015 World Cup title."),
            zh = LocalizedContent("橄榄球连续获胜的纪录是多少？", listOf("15", "17", "18", "20"), "体育", "18连胜的纪录由新西兰保持，他们在2015年至2016年间取得，包括2015年世界杯冠军。"),
            es = LocalizedContent("¿Cuál es el récord de victorias consecutivas en rugby?", listOf("15", "17", "18", "20"), "Deportes", "El récord de 18 victorias consecutivas en rugby lo ostenta Nueva Zelanda, logrado entre 2015 y 2016, incluyendo su título de campeón del mundo en 2015.")
        ),
        BilingualQuestion(
            id = 8275, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a établi le record du nombre de victoires consécutives?", listOf("Nouvelle-Zélande", "Afrique du Sud", "Australie", "Angleterre"), "Sport", "L'équipe de rugby néo-zélandaise, les All Blacks, détient le record du plus grand nombre de victoires consécutives en test-matchs, avec 18 succès entre 2015 et 2016."),
            en = LocalizedContent("Who set the record for consecutive wins?", listOf("New Zealand", "South Africa", "Australia", "England"), "Sports", "The New Zealand rugby team, the All Blacks, holds the record for the most consecutive test match wins, with 18 successes between 2015 and 2016."),
            zh = LocalizedContent("谁创造了连续获胜的纪录？", listOf("新西兰", "南非", "澳大利亚", "英格兰"), "体育", "新西兰橄榄球队全黑队保持着测试赛连胜纪录，在2015年至2016年间取得了18连胜。"),
            es = LocalizedContent("¿Quién estableció el récord de victorias consecutivas?", listOf("Nueva Zelanda", "Sudáfrica", "Australia", "Inglaterra"), "Deportes", "El equipo de rugby de Nueva Zelanda, los All Blacks, posee el récord de más victorias consecutivas en test matches, con 18 éxitos entre 2015 y 2016.")
        ),
        BilingualQuestion(
            id = 8276, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois le Pays de Galles a-t-il remporté le Championnat de rugby?", listOf("20", "26", "27", "30"), "Sport", "Le Pays de Galles a remporté le Championnat des Six Nations (et ses prédécesseurs) 28 fois, mais le décompte officiel inclut 26 victoires dans le Tournoi des Cinq Nations avant son élargissement."),
            en = LocalizedContent("How many times has Wales won the Rugby Championship?", listOf("20", "26", "27", "30"), "Sports", "Wales has won the Six Nations Championship (and its predecessors) 28 times, but the official count includes 26 victories in the Five Nations before its expansion."),
            zh = LocalizedContent("威尔士赢得了多少次橄榄球锦标赛？", listOf("20", "26", "27", "30"), "体育", "威尔士赢得了28次六国锦标赛（及其前身），但官方统计包括在五国赛时期的26次胜利。"),
            es = LocalizedContent("¿Cuántas veces ha ganado Gales el Campeonato de Rugby?", listOf("20", "26", "27", "30"), "Deportes", "Gales ha ganado el Campeonato de las Seis Naciones (y sus predecesores) 28 veces, pero el recuento oficial incluye 26 victorias en el Torneo de las Cinco Naciones antes de su ampliación.")
        ),
        BilingualQuestion(
            id = 8277, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de ponts en carrière?", listOf("299", "304", "309", "315"), "Sport", "Le record de 304 ponts en carrière est détenu par le cycliste italien Mario Cipollini, spécialiste des sprints massifs, qui a remporté cette étape mythique du Tour de France."),
            en = LocalizedContent("What is the record for the number of career points?", listOf("299", "304", "309", "315"), "Sports", "The record of 304 career points is held by Italian cyclist Mario Cipollini, a specialist in mass sprints, who won this mythical stage of the Tour de France."),
            zh = LocalizedContent("职业生涯得分纪录是多少？", listOf("299", "304", "309", "315"), "体育", "304分的职业生涯纪录由意大利自行车手马里奥·奇波利尼保持，他是冲刺专家，赢得了环法自行车赛的这一传奇赛段。"),
            es = LocalizedContent("¿Cuál es el récord de puntos en la carrera?", listOf("299", "304", "309", "315"), "Deportes", "El récord de 304 puntos en la carrera lo ostenta el ciclista italiano Mario Cipollini, especialista en sprints masivos, quien ganó esta etapa mítica del Tour de Francia.")
        ),
        BilingualQuestion(
            id = 8278, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a marqué 309 points en carrière?", listOf("Dan Carter", "Jonny Wilkinson", "Aaron Cruden", "Stephen Jones"), "Sport", "Dan Carter est le meilleur marqueur de l'histoire du rugby international, totalisant 309 points sous le maillot des All Blacks, un record mondial."),
            en = LocalizedContent("Who scored 309 career points?", listOf("Dan Carter", "Jonny Wilkinson", "Aaron Cruden", "Stephen Jones"), "Sports", "Dan Carter is the top scorer in international rugby history, totaling 309 points for the All Blacks, a world record."),
            zh = LocalizedContent("谁在职业生涯中得了309分？", listOf("丹·卡特", "乔尼·威尔金森", "亚伦·克鲁登", "斯蒂芬·琼斯"), "体育", "丹·卡特是国际橄榄球历史上的最佳得分手，为全黑队总共得到309分，这是世界纪录。"),
            es = LocalizedContent("¿Quién anotó 309 puntos en su carrera?", listOf("Dan Carter", "Jonny Wilkinson", "Aaron Cruden", "Stephen Jones"), "Deportes", "Dan Carter es el máximo anotador en la historia del rugby internacional, totalizando 309 puntos con los All Blacks, un récord mundial.")
        ),
        BilingualQuestion(
            id = 8279, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois l'Irlande a-t-elle remporté le Grand Chelem?", listOf("2", "3", "4", "5"), "Sport", "L'Irlande a remporté le Grand Chelem du Tournoi des Six Nations pour la quatrième fois en 2023, après des victoires en 1948, 2009 et 2018."),
            en = LocalizedContent("How many times has Ireland won the Grand Slam?", listOf("2", "3", "4", "5"), "Sports", "Ireland won the Grand Slam of the Six Nations for the fourth time in 2023, after victories in 1948, 2009, and 2018."),
            zh = LocalizedContent("爱尔兰赢得了多少次大满贯？", listOf("2", "3", "4", "5"), "体育", "爱尔兰在2023年第四次赢得六国赛大满贯，此前在1948年、2009年和2018年也曾夺冠。"),
            es = LocalizedContent("¿Cuántas veces ha ganado Irlanda el Grand Slam?", listOf("2", "3", "4", "5"), "Deportes", "Irlanda ganó el Grand Slam del Torneo de las Seis Naciones por cuarta vez en 2023, después de victorias en 1948, 2009 y 2018.")
        ),
        BilingualQuestion(
            id = 8280, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre d'essais en carrière?", listOf("64", "69", "74", "79"), "Sport", "Le record du nombre d'essais en carrière en rugby à XV est détenu par le Japonais Daisuke Ohata, avec 69 essais inscrits entre 1996 et 2006."),
            en = LocalizedContent("What is the highest number of career tries?", listOf("64", "69", "74", "79"), "Sports", "The record for the most career tries in rugby union is held by Japan's Daisuke Ohata, with 69 tries scored between 1996 and 2006."),
            zh = LocalizedContent("职业生涯中最多达阵次数是多少？", listOf("64", "69", "74", "79"), "体育", "橄榄球联盟职业生涯达阵次数纪录由日本选手大畑大介保持，他在1996年至2006年间共取得69次达阵。"),
            es = LocalizedContent("¿Cuál es el mayor número de ensayos en una carrera?", listOf("64", "69", "74", "79"), "Deportes", "El récord de ensayos en la carrera de rugby union lo ostenta el japonés Daisuke Ohata, con 69 ensayos anotados entre 1996 y 2006.")
        ),
        BilingualQuestion(
            id = 8281, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a marqué le plus d'essais en carrière?", listOf("Bryan Habana", "Jonah Lomu", "David Campese", "Rory Underwood"), "Sport", "Bryan Habana détient le record du plus grand nombre d'essais marqués en test-matchs pour l'Afrique du Sud, avec 67 essais, dépassant ainsi d'autres légendes du rugby."),
            en = LocalizedContent("Who has scored the most career tries?", listOf("Bryan Habana", "Jonah Lomu", "David Campese", "Rory Underwood"), "Sports", "Bryan Habana holds the record for the most tries scored in test matches for South Africa, with 67 tries, surpassing other rugby legends."),
            zh = LocalizedContent("谁在职业生涯中达阵次数最多？", listOf("布莱恩·哈巴纳", "约拿·洛姆", "大卫·坎佩斯", "罗里·安德伍德"), "体育", "布莱恩·哈巴纳保持着南非队测试赛最多达阵纪录，共67次，超越了其他橄榄球传奇人物。"),
            es = LocalizedContent("¿Quién ha marcado más ensayos en su carrera?", listOf("Bryan Habana", "Jonah Lomu", "David Campese", "Rory Underwood"), "Deportes", "Bryan Habana ostenta el récord de más ensayos en partidos de prueba para Sudáfrica, con 67 ensayos, superando a otras leyendas del rugby.")
        ),
        BilingualQuestion(
            id = 8282, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'essais Bryan Habana a-t-il marqués?", listOf("64", "69", "74", "79"), "Sport", "Bryan Habana, ailier sud-africain, a inscrit 64 essais en 124 sélections avec les Springboks, ce qui fait de lui le deuxième meilleur marqueur de l'histoire du rugby international."),
            en = LocalizedContent("How many tries did Bryan Habana score?", listOf("64", "69", "74", "79"), "Sports", "Bryan Habana, South African winger, scored 64 tries in 124 caps for the Springboks, making him the second highest try scorer in international rugby history."),
            zh = LocalizedContent("布莱恩·哈巴纳取得了多少次达阵？", listOf("64", "69", "74", "79"), "体育", "南非边锋布莱恩·哈巴纳在代表跳羚队出战的124场比赛中取得64次达阵，成为国际橄榄球历史上第二高分手。"),
            es = LocalizedContent("¿Cuántos ensayos anotó Bryan Habana?", listOf("64", "69", "74", "79"), "Deportes", "Bryan Habana, ala sudafricano, anotó 64 ensayos en 124 partidos con los Springboks, lo que lo convierte en el segundo máximo anotador de ensayos en la historia del rugby internacional.")
        ),
        BilingualQuestion(
            id = 8283, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de matchs sans défaite?", listOf("17", "20", "25", "30"), "Sport", "Ce record de 25 matchs sans défaite appartient au Paris Saint-Germain en Ligue 1, établi lors de la saison 2015-2016 sous la direction de Laurent Blanc."),
            en = LocalizedContent("What is the record for the most consecutive matches without defeat?", listOf("17", "20", "25", "30"), "Sports", "This record of 25 matches without defeat belongs to Paris Saint-Germain in Ligue 1, set during the 2015-2016 season under Laurent Blanc."),
            zh = LocalizedContent("最长不败纪录是多少场？", listOf("17", "20", "25", "30"), "体育", "25场不败纪录由巴黎圣日耳曼在法甲联赛中创造，于2015-2016赛季在洛朗·布兰克执教下达成。"),
            es = LocalizedContent("¿Cuál es el récord de más partidos sin perder?", listOf("17", "20", "25", "30"), "Deportes", "Este récord de 25 partidos sin perder pertenece al Paris Saint-Germain en la Ligue 1, establecido durante la temporada 2015-2016 bajo la dirección de Laurent Blanc.")
        ),
        BilingualQuestion(
            id = 8284, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du nombre de matchs sans défaite?", listOf("Nouvelle-Zélande", "Afrique du Sud", "Australie", "Angleterre"), "Sport", "L'équipe de rugby néo-zélandaise, les All Blacks, détient ce record avec une série de 18 matchs sans défaite entre 2015 et 2016."),
            en = LocalizedContent("Who holds the record for the most consecutive matches without defeat?", listOf("New Zealand", "South Africa", "Australia", "England"), "Sports", "The New Zealand rugby team, the All Blacks, holds this record with a streak of 18 matches without defeat between 2015 and 2016."),
            zh = LocalizedContent("谁保持着最长不败纪录？", listOf("新西兰", "南非", "澳大利亚", "英格兰"), "体育", "新西兰橄榄球队全黑队保持着这一纪录，在2015年至2016年间取得了18场不败。"),
            es = LocalizedContent("¿Quién ostenta el récord de más partidos sin perder?", listOf("Nueva Zelanda", "Sudáfrica", "Australia", "Inglaterra"), "Deportes", "El equipo de rugby de Nueva Zelanda, los All Blacks, ostenta este récord con una racha de 18 partidos sin perder entre 2015 y 2016.")
        ),
        BilingualQuestion(
            id = 8285, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois les Lions britanniques et irlandais ont-ils remporté une tournée?", listOf("3", "4", "5", "6"), "Sport", "Les Lions britanniques et irlandais ont remporté quatre tournées complètes (victoire dans la série de test-matchs) depuis leur première tournée officielle en 1888. Leurs succès ont eu lieu en 1891 (Afrique du Sud), 1899 (Australie), 1974 (Afrique du Sud) et 2013 (Australie)."),
            en = LocalizedContent("How many times have the British and Irish Lions won a tour?", listOf("3", "4", "5", "6"), "Sports", "The British and Irish Lions have won four full tours (victory in the test series) since their first official tour in 1888. Their successes occurred in 1891 (South Africa), 1899 (Australia), 1974 (South Africa), and 2013 (Australia)."),
            zh = LocalizedContent("英国和爱尔兰雄狮队赢得了多少次巡回赛？", listOf("3", "4", "5", "6"), "体育", "英国和爱尔兰雄狮队自1888年首次正式巡回赛以来，共赢得了四次完整的巡回赛（测试系列赛胜利）。他们的成功发生在1891年（南非）、1899年（澳大利亚）、1974年（南非）和2013年（澳大利亚）。"),
            es = LocalizedContent("¿Cuántas veces han ganado los Leones Británicos e Irlandeses una gira?", listOf("3", "4", "5", "6"), "Deportes", "Los Leones Británicos e Irlandeses han ganado cuatro giras completas (victoria en la serie de pruebas) desde su primera gira oficial en 1888. Sus éxitos ocurrieron en 1891 (Sudáfrica), 1899 (Australia), 1974 (Sudáfrica) y 2013 (Australia).")
        ),
        BilingualQuestion(
            id = 8286, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le rugby à sept une compétition olympique depuis quelle année?", listOf("2014", "2015", "2016", "2017"), "Sport", "Le rugby à sept a fait son entrée aux Jeux Olympiques en 2016, à Rio de Janeiro, marquant le retour de ce sport au programme olympique après 92 ans d'absence."),
            en = LocalizedContent("Since what year has rugby sevens been an Olympic competition?", listOf("2014", "2015", "2016", "2017"), "Sports", "Rugby sevens made its Olympic debut in 2016, in Rio de Janeiro, marking the return of the sport to the Olympic program after a 92-year absence."),
            zh = LocalizedContent("七人制橄榄球从哪一年开始成为奥运会项目？", listOf("2014", "2015", "2016", "2017"), "体育", "七人制橄榄球于2016年在里约热内卢首次亮相奥运会，标志着这项运动在缺席92年后重返奥运舞台。"),
            es = LocalizedContent("¿Desde qué año el rugby a siete es una competición olímpica?", listOf("2014", "2015", "2016", "2017"), "Deportes", "El rugby a siete debutó en los Juegos Olímpicos en 2016, en Río de Janeiro, marcando el regreso de este deporte al programa olímpico después de 92 años de ausencia.")
        ),
        BilingualQuestion(
            id = 8287, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de joueurs y a-t-il dans le rugby à sept?", listOf("5", "6", "7", "8"), "Sport", "Le rugby à sept se joue avec sept joueurs par équipe sur le terrain, d'où son nom. C'est une variante du rugby à XV, avec des matchs plus courts et plus rapides."),
            en = LocalizedContent("How many players are there in rugby sevens?", listOf("5", "6", "7", "8"), "Sports", "Rugby sevens is played with seven players per team on the field, hence its name. It is a variant of rugby union, with shorter and faster matches."),
            zh = LocalizedContent("七人制橄榄球有多少名球员？", listOf("5", "6", "7", "8"), "体育", "七人制橄榄球每队场上七名球员，因此得名。它是英式橄榄球的一种变体，比赛时间更短、节奏更快。"),
            es = LocalizedContent("¿Cuántos jugadores hay en el rugby a siete?", listOf("5", "6", "7", "8"), "Deportes", "El rugby a siete se juega con siete jugadores por equipo en el campo, de ahí su nombre. Es una variante del rugby union, con partidos más cortos y rápidos.")
        ),
        BilingualQuestion(
            id = 8288, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand tournoi de rugby à sept?", listOf("Seven World Series", "Hong Kong Sevens", "IRB Sevens World Series", "All Africa Sevens"), "Sport", "Le Hong Kong Sevens est considéré comme le plus prestigieux tournoi de rugby à sept, organisé chaque année depuis 1976 et faisant partie du circuit mondial."),
            en = LocalizedContent("What is the biggest rugby sevens tournament?", listOf("Seven World Series", "Hong Kong Sevens", "IRB Sevens World Series", "All Africa Sevens"), "Sports", "The Hong Kong Sevens is considered the most prestigious rugby sevens tournament, held annually since 1976 and part of the world circuit."),
            zh = LocalizedContent("最大的七人制橄榄球赛事是什么？", listOf("七人制世界系列赛", "香港七人制橄榄球赛", "IRB七人制世界系列赛", "全非七人制橄榄球赛"), "体育", "香港七人制橄榄球赛被认为是最负盛名的七人制橄榄球赛事，自1976年起每年举办，是世界巡回赛的一部分。"),
            es = LocalizedContent("¿Cuál es el torneo más grande de rugby a siete?", listOf("Seven World Series", "Hong Kong Sevens", "IRB Sevens World Series", "All Africa Sevens"), "Deportes", "El Hong Kong Sevens es considerado el torneo de rugby a siete más prestigioso, celebrado anualmente desde 1976 y parte del circuito mundial.")
        ),
        BilingualQuestion(
            id = 8289, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois Jonah Lomu a-t-il remporté un essai en Coupe du Monde?", listOf("12", "15", "18", "21"), "Sport", "Jonah Lomu a marqué 15 essais en Coupe du Monde de rugby, un record à l'époque, mais le total de 18 inclut ses essais lors des matchs de qualification."),
            en = LocalizedContent("How many tries did Jonah Lomu score in the World Cup?", listOf("12", "15", "18", "21"), "Sports", "Jonah Lomu scored 15 tries in the Rugby World Cup, a record at the time, but the total of 18 includes his tries in qualifying matches."),
            zh = LocalizedContent("约拿·洛姆在世界杯上取得了多少次达阵？", listOf("12", "15", "18", "21"), "体育", "约拿·洛姆在橄榄球世界杯上取得了15次达阵，当时是纪录，但18次的总数包括他在资格赛中的达阵。"),
            es = LocalizedContent("¿Cuántos ensayos anotó Jonah Lomu en la Copa del Mundo?", listOf("12", "15", "18", "21"), "Deportes", "Jonah Lomu anotó 15 ensayos en la Copa del Mundo de Rugby, un récord en ese momento, pero el total de 18 incluye sus ensayos en partidos de clasificación.")
        ),
        BilingualQuestion(
            id = 8290, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de transformation en match?", listOf("5", "6", "7", "8"), "Sport", "Le record du plus grand nombre de transformations réussies lors d'un match de rugby est de 7, réalisé par plusieurs joueurs, dont Chris Paterson pour l'Écosse en 2007."),
            en = LocalizedContent("What is the highest number of conversions in a match?", listOf("5", "6", "7", "8"), "Sports", "The record for the most successful conversions in a rugby match is 7, achieved by several players, including Chris Paterson for Scotland in 2007."),
            zh = LocalizedContent("一场比赛中最多转换得分是多少？", listOf("5", "6", "7", "8"), "体育", "橄榄球比赛中成功转换得分的最高纪录是7次，由多名球员保持，包括2007年苏格兰队的克里斯·帕特森。"),
            es = LocalizedContent("¿Cuál es el mayor número de transformaciones en un partido?", listOf("5", "6", "7", "8"), "Deportes", "El récord de más transformaciones exitosas en un partido de rugby es de 7, logrado por varios jugadores, incluido Chris Paterson para Escocia en 2007.")
        ),
        BilingualQuestion(
            id = 8291, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a marqué 8 transformations en match?", listOf("Simon Mannix", "Farley Price", "Matt Burke", "Jonathan Sexton"), "Sport", "Simon Mannix, joueur de rugby néo-zélandais, a marqué 8 transformations lors d'un match pour le club de Pau en 1997, un record à l'époque."),
            en = LocalizedContent("Who scored 8 conversions in a match?", listOf("Simon Mannix", "Farley Price", "Matt Burke", "Jonathan Sexton"), "Sports", "Simon Mannix, a New Zealand rugby player, scored 8 conversions in a match for the club Pau in 1997, a record at the time."),
            zh = LocalizedContent("谁在一场比赛中完成了8次转换得分？", listOf("西蒙·曼尼克斯", "法利·普莱斯", "马特·伯克", "乔纳森·塞克斯顿"), "体育", "新西兰橄榄球运动员西蒙·曼尼克斯在1997年为波城俱乐部的一场比赛中完成了8次转换得分，当时创下了纪录。"),
            es = LocalizedContent("¿Quién marcó 8 transformaciones en un partido?", listOf("Simon Mannix", "Farley Price", "Matt Burke", "Jonathan Sexton"), "Deportes", "Simon Mannix, jugador de rugby neozelandés, marcó 8 transformaciones en un partido para el club Pau en 1997, un récord en ese momento.")
        ),
        BilingualQuestion(
            id = 8292, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois la Coupe du Monde de rugby féminin a-t-elle eu lieu?", listOf("4", "5", "6", "7"), "Sport", "La Coupe du monde de rugby féminin a été organisée pour la première fois en 1991, et la neuvième édition a eu lieu en 2021, ce qui porte le total à neuf éditions."),
            en = LocalizedContent("How many times has the Women's Rugby World Cup been held?", listOf("4", "5", "6", "7"), "Sports", "The Women's Rugby World Cup was first held in 1991, and the ninth edition took place in 2021, bringing the total to nine editions."),
            zh = LocalizedContent("女子橄榄球世界杯举办了多少届？", listOf("4", "5", "6", "7"), "体育", "女子橄榄球世界杯于1991年首次举办，第九届于2021年举行，总共九届。"),
            es = LocalizedContent("¿Cuántas veces se ha celebrado la Copa del Mundo de Rugby Femenino?", listOf("4", "5", "6", "7"), "Deportes", "La Copa del Mundo de Rugby Femenino se celebró por primera vez en 1991, y la novena edición tuvo lugar en 2021, lo que suma un total de nueve ediciones.")
        ),
        BilingualQuestion(
            id = 8293, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a remporté la Coupe du Monde de rugby féminin en 2022?", listOf("Nouvelle-Zélande", "Canada", "Angleterre", "États-Unis"), "Sport", "La Nouvelle-Zélande a remporté la Coupe du Monde de rugby féminin en 2022, battant l'Angleterre en finale."),
            en = LocalizedContent("Which country won the Women's Rugby World Cup in 2022?", listOf("New Zealand", "Canada", "England", "United States"), "Sports", "New Zealand won the Women's Rugby World Cup in 2022, defeating England in the final."),
            zh = LocalizedContent("哪个国家赢得了2022年女子橄榄球世界杯？", listOf("新西兰", "加拿大", "英格兰", "美国"), "体育", "新西兰在2022年赢得了女子橄榄球世界杯，在决赛中击败了英格兰。"),
            es = LocalizedContent("¿Qué país ganó la Copa del Mundo de Rugby Femenino en 2022?", listOf("Nueva Zelanda", "Canadá", "Inglaterra", "Estados Unidos"), "Deportes", "Nueva Zelanda ganó la Copa del Mundo de Rugby Femenino en 2022, derrotando a Inglaterra en la final.")
        ),
        BilingualQuestion(
            id = 8294, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel joueur a joué le plus de matchs pour les All Blacks?", listOf("Richie McCaw", "Alun Wyn Jones", "Dan Carter", "Brian O'Driscoll"), "Sport", "Richie McCaw détient le record du nombre de sélections avec les All Blacks, totalisant 148 matchs internationaux entre 2001 et 2015, dont 110 en tant que capitaine."),
            en = LocalizedContent("Which player has played the most matches for the All Blacks?", listOf("Richie McCaw", "Alun Wyn Jones", "Dan Carter", "Brian O'Driscoll"), "Sports", "Richie McCaw holds the record for the most caps for the All Blacks, totaling 148 international matches between 2001 and 2015, including 110 as captain."),
            zh = LocalizedContent("哪位球员为全黑队出场次数最多？", listOf("里奇·麦考", "阿伦·温·琼斯", "丹·卡特", "布莱恩·奥德里斯科尔"), "体育", "里奇·麦考保持着全黑队出场次数最多的纪录，在2001年至2015年间共参加了148场国际比赛，其中110场担任队长。"),
            es = LocalizedContent("¿Qué jugador ha disputado más partidos con los All Blacks?", listOf("Richie McCaw", "Alun Wyn Jones", "Dan Carter", "Brian O'Driscoll"), "Deportes", "Richie McCaw tiene el récord de más partidos internacionales con los All Blacks, totalizando 148 entre 2001 y 2015, 110 de ellos como capitán.")
        ),
        BilingualQuestion(
            id = 8295, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de matchs Alun Wyn Jones a-t-il disputés?", listOf("148", "156", "158", "165"), "Sport", "Alun Wyn Jones a disputé 158 matchs internationaux avec le pays de Galles et les Lions britanniques, un record mondial pour un joueur de rugby à XV."),
            en = LocalizedContent("How many matches has Alun Wyn Jones played?", listOf("148", "156", "158", "165"), "Sports", "Alun Wyn Jones has played 158 international matches for Wales and the British & Irish Lions, a world record for a rugby union player."),
            zh = LocalizedContent("阿伦·温·琼斯参加了多少场比赛？", listOf("148", "156", "158", "165"), "体育", "阿伦·温·琼斯为威尔士和英国及爱尔兰雄狮队参加了158场国际比赛，这是橄榄球联盟球员的世界纪录。"),
            es = LocalizedContent("¿Cuántos partidos ha disputado Alun Wyn Jones?", listOf("148", "156", "158", "165"), "Deportes", "Alun Wyn Jones ha disputado 158 partidos internacionales con Gales y los British & Irish Lions, un récord mundial para un jugador de rugby union.")
        ),
        BilingualQuestion(
            id = 8296, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus long match de rugby Test?", listOf("80 min", "100 min", "120 min", "140 min"), "Sport", "Le record du plus long match de rugby Test est de 120 minutes, établi lors d'une rencontre entre l'Angleterre et la Nouvelle-Zélande en 1997, incluant des prolongations."),
            en = LocalizedContent("What is the longest rugby Test match?", listOf("80 min", "100 min", "120 min", "140 min"), "Sports", "The record for the longest rugby Test match is 120 minutes, set during a match between England and New Zealand in 1997, including extra time."),
            zh = LocalizedContent("最长的橄榄球测试赛是多长时间？", listOf("80分钟", "100分钟", "120分钟", "140分钟"), "体育", "最长的橄榄球测试赛纪录是120分钟，在1997年英格兰对阵新西兰的比赛中创造，包括加时赛。"),
            es = LocalizedContent("¿Cuál es el partido de rugby Test más largo?", listOf("80 min", "100 min", "120 min", "140 min"), "Deportes", "El récord del partido de rugby Test más largo es de 120 minutos, establecido durante un encuentro entre Inglaterra y Nueva Zelanda en 1997, incluyendo tiempo extra.")
        ),
        BilingualQuestion(
            id = 8297, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté le plus de matchs internationaux?", listOf("Alun Wyn Jones", "Richie McCaw", "Brian O'Driscoll", "George Best"), "Sport", "Alun Wyn Jones détient le record du nombre de sélections internationales en rugby, avec 158 capes pour le pays de Galles et 12 pour les Lions britanniques et irlandais, totalisant 170 matchs internationaux."),
            en = LocalizedContent("Who has won the most international matches?", listOf("Alun Wyn Jones", "Richie McCaw", "Brian O'Driscoll", "George Best"), "Sports", "Alun Wyn Jones holds the record for the most international caps in rugby, with 158 for Wales and 12 for the British & Irish Lions, totaling 170 international matches."),
            zh = LocalizedContent("谁赢得了最多的国际比赛？", listOf("阿伦·温·琼斯", "里奇·麦考", "布莱恩·奥德里斯科尔", "乔治·贝斯特"), "体育", "阿伦·温·琼斯保持着橄榄球国际比赛出场次数最多的纪录，为威尔士出场158次，为英国及爱尔兰雄狮队出场12次，共170场国际比赛。"),
            es = LocalizedContent("¿Quién ha ganado más partidos internacionales?", listOf("Alun Wyn Jones", "Richie McCaw", "Brian O'Driscoll", "George Best"), "Deportes", "Alun Wyn Jones tiene el récord de más partidos internacionales en rugby, con 158 para Gales y 12 para los British & Irish Lions, totalizando 170 partidos internacionales.")
        ),
        BilingualQuestion(
            id = 8298, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de matchs Alun Wyn Jones a-t-il remportés?", listOf("139", "145", "155", "160"), "Sport", "Alun Wyn Jones détient le record du nombre de victoires en test-matchs avec 155 succès sous le maillot du pays de Galles et des Lions britanniques et irlandais."),
            en = LocalizedContent("How many matches has Alun Wyn Jones won?", listOf("139", "145", "155", "160"), "Sports", "Alun Wyn Jones holds the record for the most test match wins with 155 victories wearing the jersey of Wales and the British & Irish Lions."),
            zh = LocalizedContent("阿伦·温·琼斯赢了多少场比赛？", listOf("139", "145", "155", "160"), "体育", "阿伦·温·琼斯保持着测试赛获胜次数最多的纪录，身披威尔士和英国及爱尔兰雄狮队战袍取得了155场胜利。"),
            es = LocalizedContent("¿Cuántos partidos ha ganado Alun Wyn Jones?", listOf("139", "145", "155", "160"), "Deportes", "Alun Wyn Jones tiene el récord de más victorias en test matches con 155 triunfos vistiendo la camiseta de Gales y los British & Irish Lions.")
        ),
        BilingualQuestion(
            id = 8299, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de points en Six Nations?", listOf("143", "159", "175", "189"), "Sport", "Le record de 189 points a été établi par l'Angleterre en 2001, lors d'un Tournoi des Six Nations où elle a remporté le Grand Chelem."),
            en = LocalizedContent("What is the highest number of points in the Six Nations?", listOf("143", "159", "175", "189"), "Sports", "The record of 189 points was set by England in 2001, during a Six Nations tournament where they won the Grand Slam."),
            zh = LocalizedContent("六国赛中最高得分是多少？", listOf("143", "159", "175", "189"), "体育", "189分的纪录由英格兰队在2001年创造，当时他们赢得了六国赛的大满贯。"),
            es = LocalizedContent("¿Cuál es el mayor número de puntos en el Seis Naciones?", listOf("143", "159", "175", "189"), "Deportes", "El récord de 189 puntos fue establecido por Inglaterra en 2001, durante un Torneo de las Seis Naciones en el que ganaron el Grand Slam.")
        ),
        BilingualQuestion(
            id = 8300, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de fois Eddy Merckx a-t-il remporté le Tour de France?", listOf("3", "4", "5", "6"), "Sport", "Eddy Merckx a remporté le Tour de France à cinq reprises (1969, 1970, 1971, 1972 et 1974), ce qui fait de lui l'un des coureurs les plus titrés de l'histoire de la course."),
            en = LocalizedContent("How many times did Eddy Merckx win the Tour de France?", listOf("3", "4", "5", "6"), "Sports", "Eddy Merckx won the Tour de France five times (1969, 1970, 1971, 1972, and 1974), making him one of the most successful riders in the race's history."),
            zh = LocalizedContent("埃迪·默克斯赢得了多少次环法自行车赛？", listOf("3", "4", "5", "6"), "体育", "埃迪·默克斯五次赢得环法自行车赛（1969、1970、1971、1972和1974年），使他成为该赛事历史上最成功的车手之一。"),
            es = LocalizedContent("¿Cuántas veces ganó Eddy Merckx el Tour de Francia?", listOf("3", "4", "5", "6"), "Deportes", "Eddy Merckx ganó el Tour de Francia en cinco ocasiones (1969, 1970, 1971, 1972 y 1974), lo que lo convierte en uno de los ciclistas más exitosos en la historia de la carrera.")
        ),
        BilingualQuestion(
            id = 8301, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nombre de Prix Giro d'Italia remportés par un cycliste?", listOf("10", "12", "14", "15"), "Sport", "Le record du nombre de victoires au Giro d'Italia est détenu par Alfredo Binda, Fausto Coppi et Eddy Merckx, chacun avec cinq succès, et non douze."),
            en = LocalizedContent("What is the number of Giro d'Italia wins by a cyclist?", listOf("10", "12", "14", "15"), "Sports", "The record for most Giro d'Italia victories is held by Alfredo Binda, Fausto Coppi, and Eddy Merckx, each with five wins, not twelve."),
            zh = LocalizedContent("一位自行车手赢得环意自行车赛的次数是多少？", listOf("10", "12", "14", "15"), "体育", "环意自行车赛获胜次数最多的纪录由阿尔弗雷多·宾达、福斯托·科皮和埃迪·默克斯共同保持，每人五次，而非十二次。"),
            es = LocalizedContent("¿Cuál es el número de victorias en el Giro de Italia de un ciclista?", listOf("10", "12", "14", "15"), "Deportes", "El récord de más victorias en el Giro de Italia lo ostentan Alfredo Binda, Fausto Coppi y Eddy Merckx, cada uno con cinco triunfos, no doce.")
        ),
        BilingualQuestion(
            id = 8302, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté le plus d'éditions du Giro d'Italia?", listOf("Eddy Merckx", "Fausto Coppi", "Gino Bartali", "Giovanni Battaglin"), "Sport", "Fausto Coppi a remporté le Giro d'Italia à cinq reprises (1940, 1947, 1949, 1952, 1953), un record qu'il partage avec Alfredo Binda et Eddy Merckx."),
            en = LocalizedContent("Who has won the most editions of the Giro d'Italia?", listOf("Eddy Merckx", "Fausto Coppi", "Gino Bartali", "Giovanni Battaglin"), "Sports", "Fausto Coppi won the Giro d'Italia five times (1940, 1947, 1949, 1952, 1953), a record he shares with Alfredo Binda and Eddy Merckx."),
            zh = LocalizedContent("谁赢得了最多届的环意自行车赛？", listOf("埃迪·默克斯", "福斯托·科皮", "吉诺·巴塔利", "乔瓦尼·巴塔格林"), "体育", "福斯托·科皮五次赢得环意自行车赛（1940、1947、1949、1952、1953年），这一纪录他与阿尔弗雷多·宾达和埃迪·默克斯共同保持。"),
            es = LocalizedContent("¿Quién ha ganado más ediciones del Giro de Italia?", listOf("Eddy Merckx", "Fausto Coppi", "Gino Bartali", "Giovanni Battaglin"), "Deportes", "Fausto Coppi ganó el Giro de Italia en cinco ocasiones (1940, 1947, 1949, 1952, 1953), un récord que comparte con Alfredo Binda y Eddy Merckx.")
        ),
        BilingualQuestion(
            id = 8303, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois Fausto Coppi a-t-il remporté le Giro d'Italia?", listOf("3", "4", "5", "6"), "Sport", "Fausto Coppi a remporté le Giro d'Italia à cinq reprises (1940, 1947, 1949, 1952, 1953), ce qui le place parmi les coureurs les plus titrés de l'histoire de cette course."),
            en = LocalizedContent("How many times did Fausto Coppi win the Giro d'Italia?", listOf("3", "4", "5", "6"), "Sports", "Fausto Coppi won the Giro d'Italia five times (1940, 1947, 1949, 1952, 1953), placing him among the most successful riders in the race's history."),
            zh = LocalizedContent("福斯托·科皮赢得了多少次环意自行车赛？", listOf("3", "4", "5", "6"), "体育", "福斯托·科皮五次赢得环意自行车赛（1940、1947、1949、1952、1953年），使他成为该赛事历史上最成功的车手之一。"),
            es = LocalizedContent("¿Cuántas veces ganó Fausto Coppi el Giro de Italia?", listOf("3", "4", "5", "6"), "Deportes", "Fausto Coppi ganó el Giro de Italia en cinco ocasiones (1940, 1947, 1949, 1952, 1953), lo que lo sitúa entre los ciclistas más exitosos en la historia de la carrera.")
        ),
        BilingualQuestion(
            id = 8304, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nombre de Vuelta a Espana remportées par un cycliste?", listOf("2", "3", "4", "5"), "Sport", "Le record de victoires sur la Vuelta a Espana est détenu par trois cyclistes : Roberto Heras, Tony Rominger et Alberto Contador, chacun avec trois succès."),
            en = LocalizedContent("What is the number of Vuelta a España wins by a cyclist?", listOf("2", "3", "4", "5"), "Sports", "The record for most Vuelta a España victories is held by three cyclists: Roberto Heras, Tony Rominger, and Alberto Contador, each with three wins."),
            zh = LocalizedContent("一位自行车手赢得环西班牙自行车赛的次数是多少？", listOf("2", "3", "4", "5"), "体育", "环西班牙自行车赛获胜次数最多的纪录由三位车手共同保持：罗伯托·埃拉斯、托尼·罗明格和阿尔贝托·康塔多，每人三次。"),
            es = LocalizedContent("¿Cuál es el número de victorias en la Vuelta a España de un ciclista?", listOf("2", "3", "4", "5"), "Deportes", "El récord de más victorias en la Vuelta a España lo ostentan tres ciclistas: Roberto Heras, Tony Rominger y Alberto Contador, cada uno con tres triunfos.")
        ),
        BilingualQuestion(
            id = 8305, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté le plus d'éditions de la Vuelta a Espana?", listOf("Eddy Merckx", "Tony Rominger", "Roberto Heras", "Aristobulo Ochoa"), "Sport", "Tony Rominger a remporté la Vuelta a España à trois reprises (1992, 1993, 1994), un record qu'il partage avec Roberto Heras et Alberto Contador."),
            en = LocalizedContent("Who has won the most editions of the Vuelta a España?", listOf("Eddy Merckx", "Tony Rominger", "Roberto Heras", "Aristobulo Ochoa"), "Sports", "Tony Rominger won the Vuelta a España three times (1992, 1993, 1994), a record he shares with Roberto Heras and Alberto Contador."),
            zh = LocalizedContent("谁赢得了最多届的环西班牙自行车赛？", listOf("埃迪·默克斯", "托尼·罗明格", "罗伯托·埃拉斯", "阿里斯托布洛·奥乔亚"), "体育", "托尼·罗明格三次赢得环西班牙自行车赛（1992、1993、1994年），这一纪录他与罗伯托·埃拉斯和阿尔贝托·康塔多共同保持。"),
            es = LocalizedContent("¿Quién ha ganado más ediciones de la Vuelta a España?", listOf("Eddy Merckx", "Tony Rominger", "Roberto Heras", "Aristobulo Ochoa"), "Deportes", "Tony Rominger ganó la Vuelta a España en tres ocasiones (1992, 1993, 1994), un récord que comparte con Roberto Heras y Alberto Contador.")
        ),
        BilingualQuestion(
            id = 8306, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois Tony Rominger a-t-il remporté la Vuelta a Espana?", listOf("1", "2", "3", "4"), "Sport", "Le coureur cycliste suisse Tony Rominger a remporté la Vuelta a Espana à trois reprises, en 1992, 1993 et 1994, réalisant un triplé historique dans cette compétition."),
            en = LocalizedContent("How many times did Tony Rominger win the Vuelta a España?", listOf("1", "2", "3", "4"), "Sports", "Swiss cyclist Tony Rominger won the Vuelta a España three times, in 1992, 1993, and 1994, achieving a historic hat-trick in this competition."),
            zh = LocalizedContent("托尼·罗明格赢得了多少次环西班牙自行车赛？", listOf("1", "2", "3", "4"), "体育", "瑞士自行车手托尼·罗明格三次赢得环西班牙自行车赛，分别在1992、1993和1994年，在该赛事中实现了历史性的三连冠。"),
            es = LocalizedContent("¿Cuántas veces ganó Tony Rominger la Vuelta a España?", listOf("1", "2", "3", "4"), "Deportes", "El ciclista suizo Tony Rominger ganó la Vuelta a España en tres ocasiones, en 1992, 1993 y 1994, logrando un triplete histórico en esta competición.")
        ),
        BilingualQuestion(
            id = 8307, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le Triple Couronne du cyclisme sur route?", listOf("Tour de France, Giro d'Italia, Vuelta a Espana", "Classiques", "Mondiaux", "Jeux Olympiques"), "Sport", "Le Triple Couronne du cyclisme désigne la victoire sur les trois Grands Tours de la saison : le Tour de France, le Giro d'Italia et la Vuelta a España. C'est l'un des exploits les plus rares du cyclisme, réalisé par seulement sept coureurs dans l'histoire."),
            en = LocalizedContent("What is the Triple Crown of road cycling?", listOf("Tour de France, Giro d'Italia, Vuelta a España", "Classics", "World Championships", "Olympic Games"), "Sports", "The Triple Crown of cycling refers to winning the three Grand Tours of the season: the Tour de France, the Giro d'Italia, and the Vuelta a España. It is one of the rarest achievements in cycling, accomplished by only seven riders in history."),
            zh = LocalizedContent("公路自行车赛的三冠王是什么？", listOf("环法自行车赛、环意自行车赛、环西班牙自行车赛", "古典赛", "世界锦标赛", "奥运会"), "体育", "自行车三冠王指的是赢得赛季三大环赛：环法自行车赛、环意自行车赛和环西班牙自行车赛。这是自行车运动中最罕见的成就之一，历史上仅有七位车手完成。"),
            es = LocalizedContent("¿Cuál es la Triple Corona del ciclismo en ruta?", listOf("Tour de Francia, Giro de Italia, Vuelta a España", "Clásicas", "Campeonatos del Mundo", "Juegos Olímpicos"), "Deportes", "La Triple Corona del ciclismo se refiere a ganar las tres Grandes Vueltas de la temporada: el Tour de Francia, el Giro de Italia y la Vuelta a España. Es uno de los logros más raros del ciclismo, conseguido solo por siete corredores en la historia.")
        ),
        BilingualQuestion(
            id = 8308, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois Eddy Merckx a-t-il remporté les trois grandes boucles?", listOf("0", "1", "2", "3"), "Sport", "Eddy Merckx est le seul coureur à avoir remporté le Tour de France, le Giro et la Vuelta la même année, en 1974. Il a gagné chaque grand tour au moins cinq fois, mais ce triplé historique n'a été réalisé qu'une seule fois."),
            en = LocalizedContent("How many times did Eddy Merckx win the three Grand Tours?", listOf("0", "1", "2", "3"), "Sports", "Eddy Merckx is the only rider to have won the Tour de France, Giro, and Vuelta in the same year, in 1974. He won each Grand Tour at least five times, but this historic triple was achieved only once."),
            zh = LocalizedContent("埃迪·默克斯赢得了多少次三大环赛？", listOf("0", "1", "2", "3"), "体育", "埃迪·默克斯是唯一一位在同一年（1974年）赢得环法、环意和环西班牙的车手。他每项大环赛至少赢得五次，但这一历史性的三冠王仅实现过一次。"),
            es = LocalizedContent("¿Cuántas veces ganó Eddy Merckx las tres Grandes Vueltas?", listOf("0", "1", "2", "3"), "Deportes", "Eddy Merckx es el único ciclista que ha ganado el Tour de Francia, el Giro y la Vuelta en el mismo año, en 1974. Ganó cada Gran Vuelta al menos cinco veces, pero este triplete histórico solo se logró una vez.")
        ),
        BilingualQuestion(
            id = 8309, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre d'étapes gagnées au Tour de France?", listOf("28", "32", "34", "38"), "Sport", "Eddy Merckx détient ce record avec 34 victoires d'étapes sur le Tour de France, un total jamais égalé depuis ses années de domination dans les années 1970."),
            en = LocalizedContent("What is the record for the number of stage wins in the Tour de France?", listOf("28", "32", "34", "38"), "Sports", "Eddy Merckx holds this record with 34 stage wins in the Tour de France, a total never equaled since his dominant years in the 1970s."),
            zh = LocalizedContent("环法自行车赛赛段获胜次数的纪录是多少？", listOf("28", "32", "34", "38"), "体育", "埃迪·默克斯以34次环法赛段胜利保持这一纪录，自他在20世纪70年代的统治时期以来，这一总数从未被超越。"),
            es = LocalizedContent("¿Cuál es el récord de número de victorias de etapa en el Tour de Francia?", listOf("28", "32", "34", "38"), "Deportes", "Eddy Merckx ostenta este récord con 34 victorias de etapa en el Tour de Francia, un total nunca igualado desde sus años de dominio en la década de 1970.")
        ),
        BilingualQuestion(
            id = 8310, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a gagné le plus d'étapes au Tour de France?", listOf("Eddy Merckx", "Bernard Hinault", "Barry Hoban", "Serge Gini"), "Sport", "Bernard Hinault détient le record du nombre de victoires d'étapes sur le Tour de France avec 28 succès, un total inégalé depuis sa carrière dans les années 1970-1980."),
            en = LocalizedContent("Who has won the most stages in the Tour de France?", listOf("Eddy Merckx", "Bernard Hinault", "Barry Hoban", "Serge Gini"), "Sports", "Bernard Hinault holds the record for the most stage wins in the Tour de France with 28 victories, an unmatched total since his career in the 1970s-1980s."),
            zh = LocalizedContent("谁在环法自行车赛中赢得了最多的赛段？", listOf("埃迪·默克斯", "贝尔纳·伊诺", "巴里·霍班", "塞尔日·吉尼"), "体育", "贝尔纳·伊诺保持着环法自行车赛最多赛段胜利的纪录，共28次夺冠，自他1970-1980年代的职业生涯以来无人能及。"),
            es = LocalizedContent("¿Quién ha ganado más etapas en el Tour de Francia?", listOf("Eddy Merckx", "Bernard Hinault", "Barry Hoban", "Serge Gini"), "Deportes", "Bernard Hinault ostenta el récord de más victorias de etapa en el Tour de Francia con 28 triunfos, un total inigualable desde su carrera en las décadas de 1970 y 1980.")
        ),
        BilingualQuestion(
            id = 8311, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'étapes Barry Hoban a-t-il gagnées?", listOf("6", "8", "9", "10"), "Sport", "Barry Hoban, cycliste britannique, a remporté 8 étapes du Tour de France entre 1965 et 1975, plus une étape du Tour d'Espagne en 1967, soit un total de 9 victoires d'étape sur les Grands Tours."),
            en = LocalizedContent("How many stages did Barry Hoban win?", listOf("6", "8", "9", "10"), "Sports", "Barry Hoban, a British cyclist, won 8 stages of the Tour de France between 1965 and 1975, plus one stage of the Tour of Spain in 1967, totaling 9 stage wins in Grand Tours."),
            zh = LocalizedContent("巴里·霍班赢得了多少个赛段？", listOf("6", "8", "9", "10"), "体育", "英国自行车手巴里·霍班在1965年至1975年间赢得了8个环法赛段，加上1967年环西班牙赛的一个赛段，共在大环赛中取得9个赛段胜利。"),
            es = LocalizedContent("¿Cuántas etapas ganó Barry Hoban?", listOf("6", "8", "9", "10"), "Deportes", "Barry Hoban, ciclista británico, ganó 8 etapas del Tour de Francia entre 1965 y 1975, más una etapa de la Vuelta a España en 1967, totalizando 9 victorias de etapa en Grandes Vueltas.")
        ),
        BilingualQuestion(
            id = 8312, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de victoires en Classiques cyclistes?", listOf("20", "22", "25", "28"), "Sport", "Eddy Merckx détient le record avec 25 victoires en classiques cyclistes, un total inégalé depuis sa carrière dans les années 1960-1970."),
            en = LocalizedContent("What is the record for the number of wins in cycling classics?", listOf("20", "22", "25", "28"), "Sports", "Eddy Merckx holds the record with 25 wins in cycling classics, an unmatched total since his career in the 1960s-1970s."),
            zh = LocalizedContent("古典赛获胜次数的纪录是多少？", listOf("20", "22", "25", "28"), "体育", "埃迪·默克斯保持着25次古典赛胜利的纪录，自他1960-1970年代的职业生涯以来无人能及。"),
            es = LocalizedContent("¿Cuál es el récord de victorias en clásicas ciclistas?", listOf("20", "22", "25", "28"), "Deportes", "Eddy Merckx ostenta el récord con 25 victorias en clásicas ciclistas, un total inigualable desde su carrera en las décadas de 1960 y 1970.")
        ),
        BilingualQuestion(
            id = 8313, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté le plus de Classiques?", listOf("Eddy Merckx", "Bernard Hinault", "Rik Van Looy", "Fabian Cancellara"), "Sport", "Rik Van Looy, surnommé l'Empereur de Herentals, détient le record de victoires dans les classiques cyclistes avec 37 succès, dont notamment Paris-Roubaix et le Tour des Flandres."),
            en = LocalizedContent("Who has won the most classics?", listOf("Eddy Merckx", "Bernard Hinault", "Rik Van Looy", "Fabian Cancellara"), "Sports", "Rik Van Looy, nicknamed the Emperor of Herentals, holds the record for wins in cycling classics with 37 successes, including notably Paris-Roubaix and the Tour of Flanders."),
            zh = LocalizedContent("谁赢得了最多的古典赛？", listOf("埃迪·默克斯", "贝尔纳·伊诺", "里克·范·洛伊", "法比安·坎切拉拉"), "体育", "里克·范·洛伊，绰号“赫伦塔尔斯皇帝”，保持着37次古典赛胜利的纪录，其中包括著名的巴黎-鲁贝和环弗兰德斯赛。"),
            es = LocalizedContent("¿Quién ha ganado más clásicas?", listOf("Eddy Merckx", "Bernard Hinault", "Rik Van Looy", "Fabian Cancellara"), "Deportes", "Rik Van Looy, apodado el Emperador de Herentals, ostenta el récord de victorias en clásicas ciclistas con 37 triunfos, incluyendo notablemente la París-Roubaix y el Tour de Flandes.")
        ),
        BilingualQuestion(
            id = 8314, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de Classiques Eddy Merckx a-t-il remportées?", listOf("20", "22", "25", "28"), "Sport", "Eddy Merckx détient le record du nombre de victoires sur les cinq Monuments du cyclisme, avec un total de 19 succès, mais le terme \"Classiques\" inclut aussi d'autres courses d'un jour, portant son total à 25 victoires."),
            en = LocalizedContent("How many classics did Eddy Merckx win?", listOf("20", "22", "25", "28"), "Sports", "Eddy Merckx holds the record for the most wins in the five Monuments of cycling, with a total of 19 successes, but the term 'Classics' also includes other one-day races, bringing his total to 25 victories."),
            zh = LocalizedContent("埃迪·默克斯赢得了多少场古典赛？", listOf("20", "22", "25", "28"), "体育", "埃迪·默克斯保持着五大古典赛最多胜利的纪录，共19次夺冠，但“古典赛”一词还包括其他单日赛，使其总胜利数达到25次。"),
            es = LocalizedContent("¿Cuántas clásicas ganó Eddy Merckx?", listOf("20", "22", "25", "28"), "Deportes", "Eddy Merckx ostenta el récord de más victorias en los cinco Monumentos del ciclismo, con un total de 19 triunfos, pero el término 'Clásicas' también incluye otras carreras de un día, elevando su total a 25 victorias.")
        ),
        BilingualQuestion(
            id = 8315, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de Mondiaux remportés?", listOf("3", "4", "5", "6"), "Sport", "Le record du nombre de Mondiaux remportés est de 4, détenu par plusieurs nations comme le Brésil en football masculin."),
            en = LocalizedContent("What is the record for the number of World Championships won?", listOf("3", "4", "5", "6"), "Sports", "The record for the number of World Championships won is 4, held by several nations such as Brazil in men's football."),
            zh = LocalizedContent("赢得世界冠军次数的纪录是多少？", listOf("3", "4", "5", "6"), "体育", "赢得世界冠军次数的纪录是4次，由多个国家保持，例如巴西在男子足球领域。"),
            es = LocalizedContent("¿Cuál es el récord de Campeonatos del Mundo ganados?", listOf("3", "4", "5", "6"), "Deportes", "El récord de Campeonatos del Mundo ganados es de 4, ostentado por varias naciones como Brasil en fútbol masculino.")
        ),
        BilingualQuestion(
            id = 8316, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté le plus de Mondiaux?", listOf("Eddy Merckx", "Peter Sagan", "Rik Van Looy", "Giuseppe Saronni"), "Sport", "Peter Sagan détient le record du nombre de titres de champion du monde de cyclisme sur route, avec trois victoires en 2015, 2016 et 2017."),
            en = LocalizedContent("Who has won the most World Championships?", listOf("Eddy Merckx", "Peter Sagan", "Rik Van Looy", "Giuseppe Saronni"), "Sports", "Peter Sagan holds the record for the most world road race championships, with three victories in 2015, 2016, and 2017."),
            zh = LocalizedContent("谁赢得了最多的世界冠军？", listOf("埃迪·默克斯", "彼得·萨甘", "里克·范·洛伊", "朱塞佩·萨罗尼"), "体育", "彼得·萨甘保持着最多公路自行车世界冠军的纪录，在2015、2016和2017年三次夺冠。"),
            es = LocalizedContent("¿Quién ha ganado más Campeonatos del Mundo?", listOf("Eddy Merckx", "Peter Sagan", "Rik Van Looy", "Giuseppe Saronni"), "Deportes", "Peter Sagan ostenta el récord de más campeonatos del mundo de ciclismo en ruta, con tres victorias en 2015, 2016 y 2017.")
        ),
        BilingualQuestion(
            id = 8317, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de Mondiaux Peter Sagan a-t-il remportés?", listOf("1", "2", "3", "4"), "Sport", "Peter Sagan a remporté trois titres de champion du monde de cyclisme sur route, en 2015, 2016 et 2017, devenant ainsi le premier coureur à réaliser cet exploit trois années consécutives."),
            en = LocalizedContent("How many World Championships did Peter Sagan win?", listOf("1", "2", "3", "4"), "Sports", "Peter Sagan won three world road race championships, in 2015, 2016, and 2017, becoming the first rider to achieve this feat three years in a row."),
            zh = LocalizedContent("彼得·萨甘赢得了多少次世界冠军？", listOf("1", "2", "3", "4"), "体育", "彼得·萨甘在2015、2016和2017年三次赢得公路自行车世界冠军，成为首位连续三年实现这一壮举的车手。"),
            es = LocalizedContent("¿Cuántos Campeonatos del Mundo ganó Peter Sagan?", listOf("1", "2", "3", "4"), "Deportes", "Peter Sagan ganó tres campeonatos del mundo de ciclismo en ruta, en 2015, 2016 y 2017, convirtiéndose en el primer corredor en lograr esta hazaña tres años consecutivos.")
        ),
        BilingualQuestion(
            id = 8318, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le record du nombre de Tours de France remportés par un cycliste?", listOf("7", "8", "9", "10"), "Sport", "Eddy Merckx, Bernard Hinault, Miguel Indurain et Lance Armstrong détiennent ce record avec sept victoires chacun."),
            en = LocalizedContent("What is the record for the number of Tour de France wins by a cyclist?", listOf("7", "8", "9", "10"), "Sports", "Eddy Merckx, Bernard Hinault, Miguel Indurain, and Lance Armstrong share this record with seven victories each."),
            zh = LocalizedContent("一位自行车手赢得环法冠军次数的纪录是多少？", listOf("7", "8", "9", "10"), "体育", "埃迪·默克斯、贝尔纳·伊诺、米格尔·安杜兰和兰斯·阿姆斯特朗共同保持着七次夺冠的纪录。"),
            es = LocalizedContent("¿Cuál es el récord de victorias en el Tour de Francia por un ciclista?", listOf("7", "8", "9", "10"), "Deportes", "Eddy Merckx, Bernard Hinault, Miguel Indurain y Lance Armstrong comparten este récord con siete victorias cada uno.")
        ),
        BilingualQuestion(
            id = 8319, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de fois Lance Armstrong a-t-il remporté le Tour de France?", listOf("5", "6", "7", "8"), "Sport", "Lance Armstrong a remporté le Tour de France sept fois consécutives, de 1999 à 2005. Ces victoires ont été annulées en 2012 pour dopage, mais le décompte officiel reste de sept titres."),
            en = LocalizedContent("How many times did Lance Armstrong win the Tour de France?", listOf("5", "6", "7", "8"), "Sports", "Lance Armstrong won the Tour de France seven consecutive times, from 1999 to 2005. These victories were annulled in 2012 for doping, but the official count remains seven titles."),
            zh = LocalizedContent("兰斯·阿姆斯特朗赢了多少次环法自行车赛？", listOf("5", "6", "7", "8"), "体育", "兰斯·阿姆斯特朗从1999年到2005年连续七次赢得环法自行车赛。这些胜利在2012年因兴奋剂被取消，但官方统计仍为七个冠军。"),
            es = LocalizedContent("¿Cuántas veces ganó Lance Armstrong el Tour de Francia?", listOf("5", "6", "7", "8"), "Deportes", "Lance Armstrong ganó el Tour de Francia siete veces consecutivas, de 1999 a 2005. Estas victorias fueron anuladas en 2012 por dopaje, pero el recuento oficial sigue siendo de siete títulos.")
        ),
        BilingualQuestion(
            id = 8320, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de fois Greg LeMond a-t-il remporté le Tour de France?", listOf("2", "3", "4", "5"), "Sport", "Greg LeMond a remporté le Tour de France en 1986, 1989 et 1990, devenant le premier Américain à gagner cette course et l'un des rares à l'avoir fait trois fois."),
            en = LocalizedContent("How many times did Greg LeMond win the Tour de France?", listOf("2", "3", "4", "5"), "Sports", "Greg LeMond won the Tour de France in 1986, 1989, and 1990, becoming the first American to win the race and one of the few to have done so three times."),
            zh = LocalizedContent("格雷格·莱蒙德赢得过多少次环法自行车赛？", listOf("2", "3", "4", "5"), "体育", "格雷格·莱蒙德在1986年、1989年和1990年赢得了环法自行车赛，成为首位赢得该赛事的美国人，也是少数三次夺冠的车手之一。"),
            es = LocalizedContent("¿Cuántas veces ganó Greg LeMond el Tour de Francia?", listOf("2", "3", "4", "5"), "Deportes", "Greg LeMond ganó el Tour de Francia en 1986, 1989 y 1990, convirtiéndose en el primer estadounidense en ganar la carrera y uno de los pocos en hacerlo tres veces.")
        ),
        BilingualQuestion(
            id = 8321, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de jours en maillot jaune?", listOf("85", "95", "100", "110"), "Sport", "Ce record est détenu par Eddy Merckx, qui a porté le maillot jaune pendant 96 jours au total, mais le nombre de 100 jours est souvent cité en incluant les jours où il a porté le maillot jaune lors d'étapes non officielles ou en comptant les jours de course où il était leader virtuel."),
            en = LocalizedContent("What is the record for the number of days in the yellow jersey?", listOf("85", "95", "100", "110"), "Sports", "This record is held by Eddy Merckx, who wore the yellow jersey for 96 days in total, but the number 100 is often cited including days he wore the yellow jersey during unofficial stages or counting race days where he was virtual leader."),
            zh = LocalizedContent("身穿黄衫的天数纪录是多少？", listOf("85", "95", "100", "110"), "体育", "这项纪录由艾迪·莫克斯保持，他总共穿了96天黄衫，但100这个数字经常被引用，包括他在非正式赛段穿黄衫的天数或计算他作为虚拟领骑者的比赛天数。"),
            es = LocalizedContent("¿Cuál es el récord de días con el maillot amarillo?", listOf("85", "95", "100", "110"), "Deportes", "Este récord lo tiene Eddy Merckx, quien vistió el maillot amarillo durante 96 días en total, pero a menudo se cita el número 100 incluyendo días en que lo vistió en etapas no oficiales o contando días de carrera donde era líder virtual.")
        ),
        BilingualQuestion(
            id = 8322, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a porté le maillot jaune le plus long?", listOf("Eddy Merckx", "Bernard Hinault", "Lance Armstrong", "Annemiek Van Vleuten"), "Sport", "Eddy Merckx a porté le maillot jaune du Tour de France pendant 96 jours, un record inégalé. Il a dominé la course dans les années 1969-1974."),
            en = LocalizedContent("Who has worn the yellow jersey the longest?", listOf("Eddy Merckx", "Bernard Hinault", "Lance Armstrong", "Annemiek Van Vleuten"), "Sports", "Eddy Merckx wore the Tour de France yellow jersey for 96 days, an unmatched record. He dominated the race in the years 1969-1974."),
            zh = LocalizedContent("谁穿黄衫的时间最长？", listOf("艾迪·莫克斯", "伯纳德·伊诺", "兰斯·阿姆斯特朗", "安妮米克·范弗勒滕"), "体育", "艾迪·莫克斯穿了96天环法黄衫，这是一项无与伦比的纪录。他在1969年至1974年间统治了比赛。"),
            es = LocalizedContent("¿Quién ha vestido el maillot amarillo durante más tiempo?", listOf("Eddy Merckx", "Bernard Hinault", "Lance Armstrong", "Annemiek Van Vleuten"), "Deportes", "Eddy Merckx vistió el maillot amarillo del Tour de Francia durante 96 días, un récord inigualable. Dominó la carrera en los años 1969-1974.")
        ),
        BilingualQuestion(
            id = 8323, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de jours Eddy Merckx a-t-il porté le maillot jaune?", listOf("85", "95", "100", "105"), "Sport", "Eddy Merckx a porté le maillot jaune pendant 105 jours, un record historique dans le Tour de France, dépassant largement les autres coureurs de son époque."),
            en = LocalizedContent("How many days did Eddy Merckx wear the yellow jersey?", listOf("85", "95", "100", "105"), "Sports", "Eddy Merckx wore the yellow jersey for 105 days, a historic record in the Tour de France, far surpassing other riders of his era."),
            zh = LocalizedContent("艾迪·莫克斯穿了几天黄衫？", listOf("85", "95", "100", "105"), "体育", "艾迪·莫克斯穿了105天黄衫，这是环法历史上的纪录，远远超过了他同时代的其他车手。"),
            es = LocalizedContent("¿Cuántos días vistió Eddy Merckx el maillot amarillo?", listOf("85", "95", "100", "105"), "Deportes", "Eddy Merckx vistió el maillot amarillo durante 105 días, un récord histórico en el Tour de Francia, superando ampliamente a otros corredores de su época.")
        ),
        BilingualQuestion(
            id = 8324, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de victoires d'étapes par un coureur?", listOf("30", "34", "35", "38"), "Sport", "Ce record de 35 victoires d'étapes est détenu par Eddy Merckx, le cycliste belge surnommé le Cannibale, qui l'a établi sur le Tour de France entre 1969 et 1975."),
            en = LocalizedContent("What is the record for the number of stage wins by a rider?", listOf("30", "34", "35", "38"), "Sports", "This record of 35 stage wins is held by Eddy Merckx, the Belgian cyclist nicknamed the Cannibal, which he set on the Tour de France between 1969 and 1975."),
            zh = LocalizedContent("一位车手赢得赛段次数的纪录是多少？", listOf("30", "34", "35", "38"), "体育", "35次赛段胜利的纪录由比利时车手艾迪·莫克斯保持，他绰号“食人魔”，在1969年至1975年的环法自行车赛中创下。"),
            es = LocalizedContent("¿Cuál es el récord de victorias de etapa por un corredor?", listOf("30", "34", "35", "38"), "Deportes", "Este récord de 35 victorias de etapa lo tiene Eddy Merckx, el ciclista belga apodado el Caníbal, que lo estableció en el Tour de Francia entre 1969 y 1975.")
        ),
        BilingualQuestion(
            id = 8325, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté le plus d'étapes?", listOf("Eddy Merckx", "Bernard Hinault", "Barry Hoban", "André Leducq"), "Sport", "Eddy Merckx détient le record du plus grand nombre de victoires d'étapes sur le Tour de France avec 34 succès, un record inégalé depuis les années 1970."),
            en = LocalizedContent("Who has won the most stages?", listOf("Eddy Merckx", "Bernard Hinault", "Barry Hoban", "André Leducq"), "Sports", "Eddy Merckx holds the record for the most stage wins on the Tour de France with 34 successes, a record unmatched since the 1970s."),
            zh = LocalizedContent("谁赢得了最多的赛段？", listOf("艾迪·莫克斯", "伯纳德·伊诺", "巴里·霍班", "安德烈·勒迪克"), "体育", "艾迪·莫克斯以34次胜利保持着环法自行车赛最多赛段胜利的纪录，自1970年代以来无人能及。"),
            es = LocalizedContent("¿Quién ha ganado más etapas?", listOf("Eddy Merckx", "Bernard Hinault", "Barry Hoban", "André Leducq"), "Deportes", "Eddy Merckx tiene el récord de más victorias de etapa en el Tour de Francia con 34 éxitos, un récord inigualable desde la década de 1970.")
        ),
        BilingualQuestion(
            id = 8326, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'étapes Eddy Merckx a-t-il gagnées?", listOf("34", "35", "36", "38"), "Sport", "Eddy Merckx a remporté 35 étapes du Tour de France entre 1969 et 1975, un record qui tient toujours. Ce total inclut des victoires dans les sprints, les contre-la-montre et les étapes de montagne."),
            en = LocalizedContent("How many stages did Eddy Merckx win?", listOf("34", "35", "36", "38"), "Sports", "Eddy Merckx won 35 stages of the Tour de France between 1969 and 1975, a record that still stands. This total includes wins in sprints, time trials, and mountain stages."),
            zh = LocalizedContent("艾迪·莫克斯赢了多少个赛段？", listOf("34", "35", "36", "38"), "体育", "艾迪·莫克斯在1969年至1975年间赢得了35个环法赛段，这一纪录至今仍保持。这个总数包括冲刺、计时赛和山地赛段的胜利。"),
            es = LocalizedContent("¿Cuántas etapas ganó Eddy Merckx?", listOf("34", "35", "36", "38"), "Deportes", "Eddy Merckx ganó 35 etapas del Tour de Francia entre 1969 y 1975, un récord que aún se mantiene. Este total incluye victorias en sprints, contrarreloj y etapas de montaña.")
        ),
        BilingualQuestion(
            id = 8327, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de victoires en Grand Tours?", listOf("25", "27", "29", "31"), "Sport", "Eddy Merckx détient le record avec 11 victoires sur le Tour d'Italie, 5 sur le Tour de France et 5 sur le Tour d'Espagne, totalisant 21 succès. Le chiffre 29 est incorrect, car le record réel est de 21 victoires en Grands Tours."),
            en = LocalizedContent("What is the record for the number of Grand Tour wins?", listOf("25", "27", "29", "31"), "Sports", "Eddy Merckx holds the record with 11 wins on the Giro d'Italia, 5 on the Tour de France, and 5 on the Vuelta a España, totaling 21 successes. The number 29 is incorrect, as the actual record is 21 Grand Tour wins."),
            zh = LocalizedContent("赢得大环赛次数的纪录是多少？", listOf("25", "27", "29", "31"), "体育", "艾迪·莫克斯以11次环意、5次环法和5次环西胜利保持纪录，共21次夺冠。29这个数字不正确，实际纪录是21次大环赛胜利。"),
            es = LocalizedContent("¿Cuál es el récord de victorias en Grandes Vueltas?", listOf("25", "27", "29", "31"), "Deportes", "Eddy Merckx tiene el récord con 11 victorias en el Giro de Italia, 5 en el Tour de Francia y 5 en la Vuelta a España, totalizando 21 éxitos. El número 29 es incorrecto, ya que el récord real es de 21 victorias en Grandes Vueltas.")
        ),
        BilingualQuestion(
            id = 8328, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté le plus de Grand Tours?", listOf("Eddy Merckx", "Bernard Hinault", "Lance Armstrong", "Egan Bernal"), "Sport", "Bernard Hinault a remporté 5 Tours de France, 3 Tours d'Italie et 2 Tours d'Espagne, soit 10 Grands Tours au total, un record partagé avec Eddy Merckx."),
            en = LocalizedContent("Who has won the most Grand Tours?", listOf("Eddy Merckx", "Bernard Hinault", "Lance Armstrong", "Egan Bernal"), "Sports", "Bernard Hinault won 5 Tours de France, 3 Giros d'Italia, and 2 Vueltas a España, totaling 10 Grand Tours, a record shared with Eddy Merckx."),
            zh = LocalizedContent("谁赢得了最多的大环赛？", listOf("艾迪·莫克斯", "伯纳德·伊诺", "兰斯·阿姆斯特朗", "埃甘·贝纳尔"), "体育", "伯纳德·伊诺赢得了5次环法、3次环意和2次环西，共10次大环赛冠军，与艾迪·莫克斯共享纪录。"),
            es = LocalizedContent("¿Quién ha ganado más Grandes Vueltas?", listOf("Eddy Merckx", "Bernard Hinault", "Lance Armstrong", "Egan Bernal"), "Deportes", "Bernard Hinault ganó 5 Tours de Francia, 3 Giros de Italia y 2 Vueltas a España, totalizando 10 Grandes Vueltas, un récord compartido con Eddy Merckx.")
        ),
        BilingualQuestion(
            id = 8329, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de Grand Tours Bernard Hinault a-t-il remportés?", listOf("25", "27", "29", "31"), "Sport", "Bernard Hinault a remporté 5 Tours de France, 3 Tours d'Italie et 2 Tours d'Espagne, soit un total de 10 Grands Tours. Il est l'un des cinq coureurs à avoir gagné les trois Grands Tours au cours de sa carrière."),
            en = LocalizedContent("How many Grand Tours did Bernard Hinault win?", listOf("25", "27", "29", "31"), "Sports", "Bernard Hinault won 5 Tours de France, 3 Giros d'Italia, and 2 Vueltas a España, for a total of 10 Grand Tours. He is one of five riders to have won all three Grand Tours in his career."),
            zh = LocalizedContent("伯纳德·伊诺赢得了多少个大环赛？", listOf("25", "27", "29", "31"), "体育", "伯纳德·伊诺赢得了5次环法、3次环意和2次环西，共10次大环赛。他是职业生涯中赢得全部三大环赛的五位车手之一。"),
            es = LocalizedContent("¿Cuántas Grandes Vueltas ganó Bernard Hinault?", listOf("25", "27", "29", "31"), "Deportes", "Bernard Hinault ganó 5 Tours de Francia, 3 Giros de Italia y 2 Vueltas a España, totalizando 10 Grandes Vueltas. Es uno de los cinco corredores que han ganado las tres Grandes Vueltas en su carrera.")
        ),
    )

    private fun part6(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 8330, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de victoires en une saison?", listOf("36", "50", "54", "58"), "Sport", "En 2023, Novak Djokovic a établi un record de 54 victoires en une saison sur le circuit ATP, dépassant l'ancien record de 53 détenu par Roger Federer en 2006."),
            en = LocalizedContent("What is the record for the number of wins in a season?", listOf("36", "50", "54", "58"), "Sports", "In 2023, Novak Djokovic set a record of 54 wins in a season on the ATP tour, surpassing the previous record of 53 held by Roger Federer in 2006."),
            zh = LocalizedContent("单赛季获胜次数纪录是多少？", listOf("36", "50", "54", "58"), "体育", "2023年，诺瓦克·德约科维奇在ATP巡回赛上创造了单赛季54胜的纪录，超过了罗杰·费德勒在2006年保持的53胜纪录。"),
            es = LocalizedContent("¿Cuál es el récord de número de victorias en una temporada?", listOf("36", "50", "54", "58"), "Deportes", "En 2023, Novak Djokovic estableció un récord de 54 victorias en una temporada en el circuito ATP, superando el récord anterior de 53 que ostentaba Roger Federer en 2006.")
        ),
        BilingualQuestion(
            id = 8331, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté le plus de victoires en une saison?", listOf("Eddy Merckx", "Serge Gini", "Barry Hoban", "José Luis Trijueque"), "Sport", "En 1969, Eddy Merckx a remporté un record de 54 victoires en une saison cycliste, un exploit inégalé dans l'histoire du sport."),
            en = LocalizedContent("Who has won the most victories in a season?", listOf("Eddy Merckx", "Serge Gini", "Barry Hoban", "José Luis Trijueque"), "Sports", "In 1969, Eddy Merckx achieved a record of 54 victories in a cycling season, an unprecedented feat in the history of the sport."),
            zh = LocalizedContent("谁在一个赛季中赢得了最多的胜利？", listOf("埃迪·默克斯", "塞尔日·吉尼", "巴里·霍班", "何塞·路易斯·特里胡埃克"), "体育", "1969年，埃迪·默克斯在一个自行车赛季中取得了54场胜利的纪录，这是体育史上前所未有的成就。"),
            es = LocalizedContent("¿Quién ha conseguido más victorias en una temporada?", listOf("Eddy Merckx", "Serge Gini", "Barry Hoban", "José Luis Trijueque"), "Deportes", "En 1969, Eddy Merckx logró un récord de 54 victorias en una temporada ciclista, una hazaña sin precedentes en la historia del deporte.")
        ),
        BilingualQuestion(
            id = 8332, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de victoires Eddy Merckx a-t-il remportées en 1974?", listOf("36", "48", "54", "58"), "Sport", "En 1974, Eddy Merckx a réalisé l'une des saisons les plus dominantes de l'histoire du cyclisme, remportant 54 victoires, dont le Tour de France et le Giro."),
            en = LocalizedContent("How many victories did Eddy Merckx win in 1974?", listOf("36", "48", "54", "58"), "Sports", "In 1974, Eddy Merckx had one of the most dominant seasons in cycling history, winning 54 victories, including the Tour de France and the Giro."),
            zh = LocalizedContent("埃迪·默克斯在1974年赢得了多少场胜利？", listOf("36", "48", "54", "58"), "体育", "1974年，埃迪·默克斯经历了自行车历史上最具统治力的赛季之一，赢得了54场胜利，包括环法自行车赛和环意自行车赛。"),
            es = LocalizedContent("¿Cuántas victorias consiguió Eddy Merckx en 1974?", listOf("36", "48", "54", "58"), "Deportes", "En 1974, Eddy Merckx tuvo una de las temporadas más dominantes en la historia del ciclismo, ganando 54 victorias, incluyendo el Tour de Francia y el Giro.")
        ),
        BilingualQuestion(
            id = 8333, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le record du nombre de jours sans leader?", listOf("0", "1", "2", "3"), "Sport", "Le record de jours sans leader dans un tour cycliste est de zéro, car chaque jour de course a toujours un leader au classement général, même si le maillot change de porteur."),
            en = LocalizedContent("What is the record for the number of days without a leader?", listOf("0", "1", "2", "3"), "Sports", "The record for days without a leader in a cycling tour is zero, because every race day always has a leader in the general classification, even if the jersey changes hands."),
            zh = LocalizedContent("没有领先者的天数纪录是多少？", listOf("0", "1", "2", "3"), "体育", "自行车巡回赛中无领先者的天数纪录为零，因为每个比赛日总有一个总成绩领先者，即使领骑衫易主。"),
            es = LocalizedContent("¿Cuál es el récord de días sin líder?", listOf("0", "1", "2", "3"), "Deportes", "El récord de días sin líder en una vuelta ciclista es cero, porque cada día de carrera siempre hay un líder en la clasificación general, incluso si el maillot cambia de portador.")
        ),
        BilingualQuestion(
            id = 8334, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a porté le maillot rose le plus long au Giro?", listOf("Eddy Merckx", "Gino Bartali", "Fausto Coppi", "Gioanni Battaglin"), "Sport", "Gino Bartali a porté le maillot rose pendant 60 jours au total, un record dans l'histoire du Giro, grâce à ses trois victoires finales et ses nombreuses étapes en tête."),
            en = LocalizedContent("Who has worn the pink jersey the longest in the Giro?", listOf("Eddy Merckx", "Gino Bartali", "Fausto Coppi", "Gioanni Battaglin"), "Sports", "Gino Bartali wore the pink jersey for a total of 60 days, a record in Giro history, thanks to his three final victories and many stages in the lead."),
            zh = LocalizedContent("谁在环意赛中穿粉色领骑衫时间最长？", listOf("埃迪·默克斯", "吉诺·巴塔利", "福斯托·科皮", "乔瓦尼·巴塔格林"), "体育", "吉诺·巴塔利总共穿了60天粉色领骑衫，这是环意历史上的纪录，得益于他的三次最终胜利和多次领骑赛段。"),
            es = LocalizedContent("¿Quién ha llevado el maillot rosa más tiempo en el Giro?", listOf("Eddy Merckx", "Gino Bartali", "Fausto Coppi", "Gioanni Battaglin"), "Deportes", "Gino Bartali llevó el maillot rosa durante un total de 60 días, un récord en la historia del Giro, gracias a sus tres victorias finales y numerosas etapas al frente.")
        ),
        BilingualQuestion(
            id = 8335, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de victoires de montagne?", listOf("29", "34", "35", "38"), "Sport", "Le record du nombre de victoires de montagne lors d’une seule édition du Tour de France est de 35, établi par le coureur belge Eddy Merckx en 1969. Ce total reste inégalé dans l’histoire de la Grande Boucle."),
            en = LocalizedContent("What is the record for the number of mountain wins?", listOf("29", "34", "35", "38"), "Sports", "The record for the number of mountain stage wins in a single edition of the Tour de France is 35, set by Belgian rider Eddy Merckx in 1969. This total remains unmatched in the history of the Grande Boucle."),
            zh = LocalizedContent("山地赛段获胜次数纪录是多少？", listOf("29", "34", "35", "38"), "体育", "单届环法自行车赛中山地赛段获胜次数的纪录是35次，由比利时车手埃迪·默克斯在1969年创造。这一总数在环法历史上仍无人能及。"),
            es = LocalizedContent("¿Cuál es el récord de número de victorias de montaña?", listOf("29", "34", "35", "38"), "Deportes", "El récord de número de victorias de montaña en una sola edición del Tour de Francia es de 35, establecido por el ciclista belga Eddy Merckx en 1969. Este total sigue siendo inigualable en la historia de la Grande Boucle.")
        ),
        BilingualQuestion(
            id = 8336, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté le plus de victoires de montagne?", listOf("Eddy Merckx", "Bernard Hinault", "Lucien Van Impe", "Gino Bartali"), "Sport", "Lucien Van Impe détient le record du nombre de victoires au classement de la montagne du Tour de France, avec six titres de meilleur grimpeur remportés entre 1971 et 1983."),
            en = LocalizedContent("Who has won the most mountain victories?", listOf("Eddy Merckx", "Bernard Hinault", "Lucien Van Impe", "Gino Bartali"), "Sports", "Lucien Van Impe holds the record for the most wins in the mountains classification of the Tour de France, with six best climber titles won between 1971 and 1983."),
            zh = LocalizedContent("谁赢得了最多的山地赛段胜利？", listOf("埃迪·默克斯", "贝尔纳·伊诺", "吕西安·范因佩", "吉诺·巴塔利"), "体育", "吕西安·范因佩保持着环法自行车赛爬坡王分类最多获胜次数的纪录，他在1971年至1983年间赢得了六次最佳爬坡手称号。"),
            es = LocalizedContent("¿Quién ha conseguido más victorias de montaña?", listOf("Eddy Merckx", "Bernard Hinault", "Lucien Van Impe", "Gino Bartali"), "Deportes", "Lucien Van Impe posee el récord de más victorias en la clasificación de la montaña del Tour de Francia, con seis títulos de mejor escalador ganados entre 1971 y 1983.")
        ),
        BilingualQuestion(
            id = 8337, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de victoires de sprints?", listOf("15", "18", "20", "25"), "Sport", "Usain Bolt détient ce record avec 25 victoires en sprint aux championnats du monde d'athlétisme, sur 100 m, 200 m et relais 4x100 m."),
            en = LocalizedContent("What is the record for the number of sprint victories?", listOf("15", "18", "20", "25"), "Sports", "Usain Bolt holds this record with 25 sprint victories at the World Athletics Championships, in the 100 m, 200 m, and 4x100 m relay."),
            zh = LocalizedContent("短跑胜利次数纪录是多少？", listOf("15", "18", "20", "25"), "体育", "尤塞恩·博尔特在世界田径锦标赛上以25次短跑胜利保持着这一纪录，包括100米、200米和4x100米接力。"),
            es = LocalizedContent("¿Cuál es el récord de número de victorias en sprints?", listOf("15", "18", "20", "25"), "Deportes", "Usain Bolt posee este récord con 25 victorias en sprints en los Campeonatos Mundiales de Atletismo, en 100 m, 200 m y relevos 4x100 m.")
        ),
        BilingualQuestion(
            id = 8338, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté le plus de victoires de sprints?", listOf("Eddy Merckx", "Barry Hoban", "André Leducq", "André Darrigade"), "Sport", "Eddy Merckx détient le record du nombre de victoires de sprints dans le cyclisme sur route, notamment sur le Tour de France, grâce à sa polyvalence exceptionnelle de coureur complet."),
            en = LocalizedContent("Who has won the most sprint victories?", listOf("Eddy Merckx", "Barry Hoban", "André Leducq", "André Darrigade"), "Sports", "Eddy Merckx holds the record for the most sprint victories in road cycling, particularly on the Tour de France, thanks to his exceptional versatility as an all-round rider."),
            zh = LocalizedContent("谁赢得了最多的冲刺胜利？", listOf("埃迪·默克斯", "巴里·霍班", "安德烈·勒迪克", "安德烈·达里加德"), "体育", "埃迪·默克斯保持着公路自行车冲刺胜利次数最多的纪录，尤其是在环法自行车赛上，这得益于他作为全能车手的非凡多才多艺。"),
            es = LocalizedContent("¿Quién ha conseguido más victorias de sprint?", listOf("Eddy Merckx", "Barry Hoban", "André Leducq", "André Darrigade"), "Deportes", "Eddy Merckx posee el récord de más victorias de sprint en el ciclismo en ruta, particularmente en el Tour de Francia, gracias a su excepcional versatilidad como corredor completo.")
        ),
        BilingualQuestion(
            id = 8339, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de Tours cyclistes remportés?", listOf("8", "10", "12", "15"), "Sport", "Le record du nombre de victoires sur le Tour de France est détenu par Eddy Merckx, Bernard Hinault, Jacques Anquetil et Miguel Indurain, chacun avec 5 titres, ce qui donne un total de 10 victoires combinées pour les quatre cyclistes."),
            en = LocalizedContent("What is the record for the number of Tour de France wins?", listOf("8", "10", "12", "15"), "Sports", "The record for the number of Tour de France wins is held by Eddy Merckx, Bernard Hinault, Jacques Anquetil, and Miguel Indurain, each with 5 titles, giving a combined total of 10 victories for the four cyclists."),
            zh = LocalizedContent("环法自行车赛获胜次数纪录是多少？", listOf("8", "10", "12", "15"), "体育", "环法自行车赛获胜次数纪录由埃迪·默克斯、贝尔纳·伊诺、雅克·安克蒂尔和米格尔·安杜兰共同保持，每人5次夺冠，四位车手合计10次胜利。"),
            es = LocalizedContent("¿Cuál es el récord de número de Tours de Francia ganados?", listOf("8", "10", "12", "15"), "Deportes", "El récord de número de victorias en el Tour de Francia lo ostentan Eddy Merckx, Bernard Hinault, Jacques Anquetil y Miguel Indurain, cada uno con 5 títulos, lo que da un total combinado de 10 victorias para los cuatro ciclistas.")
        ),
        BilingualQuestion(
            id = 8340, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de victoires en Classics en une saison?", listOf("3", "4", "5", "6"), "Sport", "Le record de quatre victoires en Classics en une saison est détenu par plusieurs cyclistes, dont Eddy Merckx en 1969 et Tadej Pogačar en 2023."),
            en = LocalizedContent("What is the record for the number of Classics wins in a single season?", listOf("3", "4", "5", "6"), "Sports", "The record of four Classics wins in a single season is held by several cyclists, including Eddy Merckx in 1969 and Tadej Pogačar in 2023."),
            zh = LocalizedContent("单赛季古典赛获胜次数纪录是多少？", listOf("3", "4", "5", "6"), "体育", "单赛季四场古典赛胜利的纪录由多位车手保持，包括1969年的埃迪·默克斯和2023年的塔代伊·波加查。"),
            es = LocalizedContent("¿Cuál es el récord de victorias en Clásicas en una temporada?", listOf("3", "4", "5", "6"), "Deportes", "El récord de cuatro victorias en Clásicas en una temporada está en manos de varios ciclistas, entre ellos Eddy Merckx en 1969 y Tadej Pogačar en 2023.")
        ),
        BilingualQuestion(
            id = 8341, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté le plus de Classics en une saison?", listOf("Eddy Merckx", "Roger De Vlaeminck", "Tom Boonen", "Philippe Gilbert"), "Sport", "Eddy Merckx a remporté 13 classics en 1969, un record inégalé dans l'histoire du cyclisme."),
            en = LocalizedContent("Who has won the most Classics in a single season?", listOf("Eddy Merckx", "Roger De Vlaeminck", "Tom Boonen", "Philippe Gilbert"), "Sports", "Eddy Merckx won 13 classics in 1969, an unmatched record in cycling history."),
            zh = LocalizedContent("谁在单赛季赢得了最多的古典赛？", listOf("埃迪·默克斯", "罗杰·德·弗拉明克", "汤姆·布南", "菲利普·吉尔伯特"), "体育", "埃迪·默克斯在1969年赢得了13场古典赛，这是自行车历史上无与伦比的纪录。"),
            es = LocalizedContent("¿Quién ha ganado más Clásicas en una temporada?", listOf("Eddy Merckx", "Roger De Vlaeminck", "Tom Boonen", "Philippe Gilbert"), "Deportes", "Eddy Merckx ganó 13 clásicas en 1969, un récord sin igual en la historia del ciclismo.")
        ),
        BilingualQuestion(
            id = 8342, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de Classics Eddy Merckx a-t-il remportées en une saison?", listOf("3", "4", "5", "6"), "Sport", "En 1969, Eddy Merckx a remporté les quatre classiques \"Monuments\" (Milan-San Remo, Tour des Flandres, Liège-Bastogne-Liège et Paris-Roubaix), un exploit unique dans l'histoire du cyclisme."),
            en = LocalizedContent("How many Classics did Eddy Merckx win in a single season?", listOf("3", "4", "5", "6"), "Sports", "In 1969, Eddy Merckx won all four \"Monument\" classics (Milan-San Remo, Tour of Flanders, Liège-Bastogne-Liège, and Paris-Roubaix), a unique feat in cycling history."),
            zh = LocalizedContent("埃迪·默克斯在单赛季赢得了多少场古典赛？", listOf("3", "4", "5", "6"), "体育", "1969年，埃迪·默克斯赢得了全部四场“五大古典赛”（米兰-圣雷莫、环弗兰德斯、列日-巴斯通-列日和巴黎-鲁贝），这是自行车历史上独一无二的成就。"),
            es = LocalizedContent("¿Cuántas Clásicas ganó Eddy Merckx en una temporada?", listOf("3", "4", "5", "6"), "Deportes", "En 1969, Eddy Merckx ganó las cuatro clásicas \"Monumento\" (Milán-San Remo, Tour de Flandes, Lieja-Bastoña-Lieja y París-Roubaix), una hazaña única en la historia del ciclismo.")
        ),
        BilingualQuestion(
            id = 8343, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de victoires en Paris-Roubaix?", listOf("3", "4", "5", "6"), "Sport", "Le record du nombre de victoires sur Paris-Roubaix est détenu par le Belge Roger De Vlaeminck, qui a remporté la course à quatre reprises (1972, 1974, 1975, 1977)."),
            en = LocalizedContent("What is the record for the number of wins in Paris-Roubaix?", listOf("3", "4", "5", "6"), "Sports", "The record for the most wins in Paris-Roubaix is held by Belgian Roger De Vlaeminck, who won the race four times (1972, 1974, 1975, 1977)."),
            zh = LocalizedContent("巴黎-鲁贝获胜次数纪录是多少？", listOf("3", "4", "5", "6"), "体育", "巴黎-鲁贝获胜次数纪录由比利时车手罗杰·德·弗拉明克保持，他四次赢得该赛事（1972、1974、1975、1977）。"),
            es = LocalizedContent("¿Cuál es el récord de victorias en la París-Roubaix?", listOf("3", "4", "5", "6"), "Deportes", "El récord de victorias en la París-Roubaix lo ostenta el belga Roger De Vlaeminck, quien ganó la carrera cuatro veces (1972, 1974, 1975, 1977).")
        ),
        BilingualQuestion(
            id = 8344, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté le plus de Paris-Roubaix?", listOf("Roger De Vlaeminck", "Eddy Merckx", "Tom Boonen", "Philippe Gilbert"), "Sport", "Roger De Vlaeminck détient le record de victoires sur Paris-Roubaix avec quatre succès (1972, 1974, 1975, 1977), ce qui en fait le coureur le plus titré de l'histoire de cette classique cycliste."),
            en = LocalizedContent("Who has won the most Paris-Roubaix?", listOf("Roger De Vlaeminck", "Eddy Merckx", "Tom Boonen", "Philippe Gilbert"), "Sports", "Roger De Vlaeminck holds the record for most wins in Paris-Roubaix with four victories (1972, 1974, 1975, 1977), making him the most successful rider in the history of this classic."),
            zh = LocalizedContent("谁赢得了最多的巴黎-鲁贝？", listOf("罗杰·德·弗拉明克", "埃迪·默克斯", "汤姆·布南", "菲利普·吉尔伯特"), "体育", "罗杰·德·弗拉明克以四次胜利（1972、1974、1975、1977）保持着巴黎-鲁贝获胜次数纪录，使他成为这项古典赛历史上最成功的车手。"),
            es = LocalizedContent("¿Quién ha ganado más veces la París-Roubaix?", listOf("Roger De Vlaeminck", "Eddy Merckx", "Tom Boonen", "Philippe Gilbert"), "Deportes", "Roger De Vlaeminck ostenta el récord de más victorias en la París-Roubaix con cuatro triunfos (1972, 1974, 1975, 1977), lo que lo convierte en el corredor más laureado en la historia de esta clásica.")
        ),
        BilingualQuestion(
            id = 8345, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de Paris-Roubaix Roger De Vlaeminck a-t-il remportés?", listOf("3", "4", "5", "6"), "Sport", "Roger De Vlaeminck, surnommé \"le Gyproc\", a remporté Paris-Roubaix à quatre reprises (1972, 1974, 1975, 1977), un record qu'il partage avec Tom Boonen."),
            en = LocalizedContent("How many Paris-Roubaix did Roger De Vlaeminck win?", listOf("3", "4", "5", "6"), "Sports", "Roger De Vlaeminck, nicknamed \"the Gyproc\", won Paris-Roubaix four times (1972, 1974, 1975, 1977), a record he shares with Tom Boonen."),
            zh = LocalizedContent("罗杰·德·弗拉明克赢得了多少次巴黎-鲁贝？", listOf("3", "4", "5", "6"), "体育", "绰号“Gyproc”的罗杰·德·弗拉明克四次赢得巴黎-鲁贝（1972、1974、1975、1977），这一纪录与汤姆·布南共享。"),
            es = LocalizedContent("¿Cuántas veces ganó Roger De Vlaeminck la París-Roubaix?", listOf("3", "4", "5", "6"), "Deportes", "Roger De Vlaeminck, apodado \"el Gyproc\", ganó la París-Roubaix cuatro veces (1972, 1974, 1975, 1977), un récord que comparte con Tom Boonen.")
        ),
        BilingualQuestion(
            id = 8346, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de victoires au Tour de Flandre?", listOf("4", "5", "6", "7"), "Sport", "Le record de victoires au Tour de Flandre est détenu par le Belge Tom Boonen, qui a remporté l'épreuve à cinq reprises (2005, 2006, 2009, 2010, 2012). Il partage ce record avec son compatriote Johan Museeuw, également vainqueur cinq fois (1993, 1995, 1996, 1998, 1999)."),
            en = LocalizedContent("What is the record for the number of wins in the Tour of Flanders?", listOf("4", "5", "6", "7"), "Sports", "The record for wins in the Tour of Flanders is held by Belgian Tom Boonen, who won the event five times (2005, 2006, 2009, 2010, 2012). He shares this record with his compatriot Johan Museeuw, also a five-time winner (1993, 1995, 1996, 1998, 1999)."),
            zh = LocalizedContent("环弗兰德斯获胜次数纪录是多少？", listOf("4", "5", "6", "7"), "体育", "环弗兰德斯获胜次数纪录由比利时车手汤姆·布南保持，他五次赢得该赛事（2005、2006、2009、2010、2012）。他与同胞约翰·穆塞乌共享这一纪录，后者也五次获胜（1993、1995、1996、1998、1999）。"),
            es = LocalizedContent("¿Cuál es el récord de victorias en el Tour de Flandes?", listOf("4", "5", "6", "7"), "Deportes", "El récord de victorias en el Tour de Flandes lo ostenta el belga Tom Boonen, quien ganó la prueba cinco veces (2005, 2006, 2009, 2010, 2012). Comparte este récord con su compatriota Johan Museeuw, también ganador en cinco ocasiones (1993, 1995, 1996, 1998, 1999).")
        ),
        BilingualQuestion(
            id = 8347, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté le plus de Tours de Flandre?", listOf("Eddy Merckx", "Tom Boonen", "Johan Museeuw", "Roger De Vlaeminck"), "Sport", "Tom Boonen détient le record de victoires sur le Tour des Flandres avec quatre succès, en 2005, 2006, 2012 et 2013."),
            en = LocalizedContent("Who has won the most Tours of Flanders?", listOf("Eddy Merckx", "Tom Boonen", "Johan Museeuw", "Roger De Vlaeminck"), "Sports", "Tom Boonen holds the record for most wins in the Tour of Flanders with four victories, in 2005, 2006, 2012, and 2013."),
            zh = LocalizedContent("谁赢得了最多的环弗兰德斯？", listOf("埃迪·默克斯", "汤姆·布南", "约翰·穆塞乌", "罗杰·德·弗拉明克"), "体育", "汤姆·布南以四次胜利（2005、2006、2012、2013）保持着环弗兰德斯获胜次数纪录。"),
            es = LocalizedContent("¿Quién ha ganado más veces el Tour de Flandes?", listOf("Eddy Merckx", "Tom Boonen", "Johan Museeuw", "Roger De Vlaeminck"), "Deportes", "Tom Boonen ostenta el récord de más victorias en el Tour de Flandes con cuatro triunfos, en 2005, 2006, 2012 y 2013.")
        ),
        BilingualQuestion(
            id = 8348, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de Tours de Flandre Tom Boonen a-t-il remportés?", listOf("2", "3", "4", "5"), "Sport", "Tom Boonen a remporté le Tour des Flandres à trois reprises, en 2005, 2006 et 2012. Il est l'un des coureurs les plus titrés sur cette classique belge."),
            en = LocalizedContent("How many Tours of Flanders did Tom Boonen win?", listOf("2", "3", "4", "5"), "Sports", "Tom Boonen won the Tour of Flanders three times, in 2005, 2006, and 2012. He is one of the most successful riders in this Belgian classic."),
            zh = LocalizedContent("汤姆·布南赢得了多少次环弗兰德斯？", listOf("2", "3", "4", "5"), "体育", "汤姆·布南三次赢得环弗兰德斯，分别在2005、2006和2012年。他是这项比利时古典赛中最成功的车手之一。"),
            es = LocalizedContent("¿Cuántas veces ganó Tom Boonen el Tour de Flandes?", listOf("2", "3", "4", "5"), "Deportes", "Tom Boonen ganó el Tour de Flandes tres veces, en 2005, 2006 y 2012. Es uno de los corredores más laureados en esta clásica belga.")
        ),
        BilingualQuestion(
            id = 8349, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de victoires à Liège-Bastogne-Liège?", listOf("4", "5", "6", "7"), "Sport", "Eddy Merckx détient le record avec 5 victoires sur Liège-Bastogne-Liège, un exploit réalisé entre 1969 et 1975."),
            en = LocalizedContent("What is the record for the number of wins in Liège-Bastogne-Liège?", listOf("4", "5", "6", "7"), "Sports", "Eddy Merckx holds the record with 5 wins in Liège-Bastogne-Liège, a feat achieved between 1969 and 1975."),
            zh = LocalizedContent("列日-巴斯通-列日获胜次数纪录是多少？", listOf("4", "5", "6", "7"), "体育", "埃迪·默克斯以5次胜利保持着列日-巴斯通-列日的纪录，这一成就于1969年至1975年间达成。"),
            es = LocalizedContent("¿Cuál es el récord de victorias en la Lieja-Bastoña-Lieja?", listOf("4", "5", "6", "7"), "Deportes", "Eddy Merckx ostenta el récord con 5 victorias en la Lieja-Bastoña-Lieja, una hazaña lograda entre 1969 y 1975.")
        ),
        BilingualQuestion(
            id = 8350, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de matchs Muhammad Ali a-t-il remportés en boxe professionnelle?", listOf("56", "58", "60", "62"), "Sport", "Muhammad Ali a combattu 61 fois en boxe professionnelle, remportant 56 victoires, dont 37 par KO. Il a subi 5 défaites, principalement face à Joe Frazier, Ken Norton et Leon Spinks."),
            en = LocalizedContent("How many matches did Muhammad Ali win in professional boxing?", listOf("56", "58", "60", "62"), "Sports", "Muhammad Ali fought 61 times in professional boxing, winning 56 victories, including 37 by KO. He suffered 5 defeats, mainly against Joe Frazier, Ken Norton, and Leon Spinks."),
            zh = LocalizedContent("穆罕默德·阿里在职业拳击中赢得了多少场比赛？", listOf("56", "58", "60", "62"), "体育", "穆罕默德·阿里在职业拳击中打了61场比赛，赢得了56场胜利，其中37场击倒对手。他输了5场，主要输给乔·弗雷泽、肯·诺顿和莱昂·斯平克斯。"),
            es = LocalizedContent("¿Cuántos combates ganó Muhammad Ali en el boxeo profesional?", listOf("56", "58", "60", "62"), "Deportes", "Muhammad Ali peleó 61 veces en el boxeo profesional, ganando 56 victorias, incluyendo 37 por KO. Sufrió 5 derrotas, principalmente contra Joe Frazier, Ken Norton y Leon Spinks.")
        ),
        BilingualQuestion(
            id = 8351, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus long règne de champion du monde en boxe?", listOf("10", "12", "14", "16"), "Sport", "Le record du plus long règne de champion du monde de boxe est détenu par Joe Louis, qui a conservé son titre des poids lourds pendant 11 ans et 8 mois, soit environ 12 ans."),
            en = LocalizedContent("What is the record for the longest world champion reign in boxing?", listOf("10", "12", "14", "16"), "Sports", "The record for the longest world champion reign in boxing is held by Joe Louis, who kept his heavyweight title for 11 years and 8 months, approximately 12 years."),
            zh = LocalizedContent("拳击世界冠军最长统治纪录是多少年？", listOf("10", "12", "14", "16"), "体育", "拳击世界冠军最长统治纪录由乔·路易斯保持，他保持重量级冠军头衔11年8个月，约12年。"),
            es = LocalizedContent("¿Cuál es el récord del reinado más largo como campeón mundial en el boxeo?", listOf("10", "12", "14", "16"), "Deportes", "El récord del reinado más largo como campeón mundial de boxeo lo ostenta Joe Louis, quien mantuvo su título de peso pesado durante 11 años y 8 meses, aproximadamente 12 años.")
        ),
        BilingualQuestion(
            id = 8352, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a le plus long règne de champion du monde?", listOf("Joe Louis", "Muhammad Ali", "Lennox Lewis", "Evander Holyfield"), "Sport", "Joe Louis a détenu le titre de champion du monde des poids lourds de 1937 à 1949, soit 11 ans et 8 mois, un record de longévité pour un champion du monde de boxe."),
            en = LocalizedContent("Who has the longest world champion reign?", listOf("Joe Louis", "Muhammad Ali", "Lennox Lewis", "Evander Holyfield"), "Sports", "Joe Louis held the world heavyweight champion title from 1937 to 1949, a total of 11 years and 8 months, a longevity record for a world boxing champion."),
            zh = LocalizedContent("谁拥有最长的世界冠军统治期？", listOf("乔·路易斯", "穆罕默德·阿里", "伦诺克斯·刘易斯", "伊万德·霍利菲尔德"), "体育", "乔·路易斯从1937年到1949年保持世界重量级冠军头衔，共11年8个月，是拳击世界冠军的长期纪录。"),
            es = LocalizedContent("¿Quién tiene el reinado más largo como campeón mundial?", listOf("Joe Louis", "Muhammad Ali", "Lennox Lewis", "Evander Holyfield"), "Deportes", "Joe Louis ostentó el título de campeón mundial de peso pesado desde 1937 hasta 1949, un total de 11 años y 8 meses, un récord de longevidad para un campeón mundial de boxeo.")
        ),
        BilingualQuestion(
            id = 8353, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'années Joe Louis a-t-il régné comme champion?", listOf("10", "12", "14", "16"), "Sport", "Joe Louis a détenu le titre de champion du monde des poids lourds de 1937 à 1949, soit 11 ans et 8 mois, mais son règne est souvent arrondi à 14 ans en incluant sa période d'inactivité liée à la Seconde Guerre mondiale."),
            en = LocalizedContent("How many years did Joe Louis reign as champion?", listOf("10", "12", "14", "16"), "Sports", "Joe Louis held the world heavyweight champion title from 1937 to 1949, which is 11 years and 8 months, but his reign is often rounded to 14 years including his period of inactivity due to World War II."),
            zh = LocalizedContent("乔·路易斯作为冠军统治了多少年？", listOf("10", "12", "14", "16"), "体育", "乔·路易斯从1937年到1949年保持世界重量级冠军头衔，共11年8个月，但他的统治期常被四舍五入为14年，包括因二战导致的非活跃期。"),
            es = LocalizedContent("¿Cuántos años reinó Joe Louis como campeón?", listOf("10", "12", "14", "16"), "Deportes", "Joe Louis ostentó el título de campeón mundial de peso pesado desde 1937 hasta 1949, lo que son 11 años y 8 meses, pero su reinado a menudo se redondea a 14 años incluyendo su período de inactividad debido a la Segunda Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 8354, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de défenses de titre?", listOf("20", "25", "30", "32"), "Sport", "Le record de 30 défenses de titre est détenu par le boxeur Joe Louis, champion du monde des poids lourds de 1937 à 1949."),
            en = LocalizedContent("What is the record for the number of title defenses?", listOf("20", "25", "30", "32"), "Sports", "The record of 30 title defenses is held by boxer Joe Louis, world heavyweight champion from 1937 to 1949."),
            zh = LocalizedContent("冠军头衔卫冕次数的纪录是多少？", listOf("20", "25", "30", "32"), "体育", "30次卫冕的纪录由拳击手乔·路易斯保持，他是1937年至1949年的世界重量级冠军。"),
            es = LocalizedContent("¿Cuál es el récord de número de defensas del título?", listOf("20", "25", "30", "32"), "Deportes", "El récord de 30 defensas del título lo ostenta el boxeador Joe Louis, campeón mundial de peso pesado de 1937 a 1949.")
        ),
        BilingualQuestion(
            id = 8355, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a défendu le plus son titre?", listOf("Joe Louis", "Muhammad Ali", "Lennox Lewis", "Evander Holyfield"), "Sport", "Joe Louis a défendu son titre de champion du monde des poids lourds 25 fois, un record dans l'histoire de la boxe."),
            en = LocalizedContent("Who defended his title the most?", listOf("Joe Louis", "Muhammad Ali", "Lennox Lewis", "Evander Holyfield"), "Sports", "Joe Louis defended his world heavyweight champion title 25 times, a record in boxing history."),
            zh = LocalizedContent("谁卫冕冠军次数最多？", listOf("乔·路易斯", "穆罕默德·阿里", "伦诺克斯·刘易斯", "伊万德·霍利菲尔德"), "体育", "乔·路易斯卫冕世界重量级冠军头衔25次，是拳击史上的纪录。"),
            es = LocalizedContent("¿Quién defendió más su título?", listOf("Joe Louis", "Muhammad Ali", "Lennox Lewis", "Evander Holyfield"), "Deportes", "Joe Louis defendió su título de campeón mundial de peso pesado 25 veces, un récord en la historia del boxeo.")
        ),
        BilingualQuestion(
            id = 8356, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de défenses Joe Louis a-t-il effectuées?", listOf("20", "25", "30", "32"), "Sport", "Joe Louis, surnommé le Bombardier de Détroit, a défendu son titre de champion du monde des poids lourds à 32 reprises entre 1937 et 1949, un record dans la catégorie."),
            en = LocalizedContent("How many defenses did Joe Louis make?", listOf("20", "25", "30", "32"), "Sports", "Joe Louis, nicknamed the Brown Bomber, defended his world heavyweight champion title 32 times between 1937 and 1949, a record in the category."),
            zh = LocalizedContent("乔·路易斯进行了多少次卫冕？", listOf("20", "25", "30", "32"), "体育", "乔·路易斯，绰号“褐色轰炸机”，在1937年至1949年间卫冕世界重量级冠军头衔32次，是该类别的纪录。"),
            es = LocalizedContent("¿Cuántas defensas realizó Joe Louis?", listOf("20", "25", "30", "32"), "Deportes", "Joe Louis, apodado el Bombardero de Detroit, defendió su título de campeón mundial de peso pesado 32 veces entre 1937 y 1949, un récord en la categoría.")
        ),
        BilingualQuestion(
            id = 8357, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de titres mondiaux en boxe?", listOf("5", "6", "7", "8"), "Sport", "Le record de sept titres mondiaux en boxe est détenu par plusieurs légendes, dont Oscar De La Hoya et Manny Pacquiao, qui ont conquis des ceintures dans sept catégories de poids différentes."),
            en = LocalizedContent("What is the record for the number of world titles in boxing?", listOf("5", "6", "7", "8"), "Sports", "The record of seven world titles in boxing is held by several legends, including Oscar De La Hoya and Manny Pacquiao, who conquered belts in seven different weight classes."),
            zh = LocalizedContent("拳击世界冠军头衔数量的纪录是多少？", listOf("5", "6", "7", "8"), "体育", "七次世界冠军的纪录由多位传奇人物保持，包括奥斯卡·德拉·霍亚和曼尼·帕奎奥，他们在七个不同体重级别赢得了腰带。"),
            es = LocalizedContent("¿Cuál es el récord de número de títulos mundiales en el boxeo?", listOf("5", "6", "7", "8"), "Deportes", "El récord de siete títulos mundiales en el boxeo lo ostentan varias leyendas, incluyendo a Oscar De La Hoya y Manny Pacquiao, quienes conquistaron cinturones en siete categorías de peso diferentes.")
        ),
        BilingualQuestion(
            id = 8358, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté le plus de titres mondiaux?", listOf("Muhammad Ali", "Manny Pacquiao", "Oscar De La Hoya", "Henry Armstrong"), "Sport", "Henry Armstrong est le seul boxeur de l'histoire à avoir détenu simultanément les titres mondiaux dans trois catégories de poids différentes (poids plumes, légers et welters) en 1938."),
            en = LocalizedContent("Who won the most world titles?", listOf("Muhammad Ali", "Manny Pacquiao", "Oscar De La Hoya", "Henry Armstrong"), "Sports", "Henry Armstrong is the only boxer in history to have simultaneously held world titles in three different weight classes (featherweight, lightweight, and welterweight) in 1938."),
            zh = LocalizedContent("谁赢得了最多的世界冠军头衔？", listOf("穆罕默德·阿里", "曼尼·帕奎奥", "奥斯卡·德拉·霍亚", "亨利·阿姆斯特朗"), "体育", "亨利·阿姆斯特朗是历史上唯一一位同时在三个不同体重级别（羽量级、轻量级和次中量级）拥有世界冠军头衔的拳击手，发生在1938年。"),
            es = LocalizedContent("¿Quién ganó más títulos mundiales?", listOf("Muhammad Ali", "Manny Pacquiao", "Oscar De La Hoya", "Henry Armstrong"), "Deportes", "Henry Armstrong es el único boxeador en la historia que ha ostentado simultáneamente títulos mundiales en tres categorías de peso diferentes (peso pluma, ligero y wélter) en 1938.")
        ),
        BilingualQuestion(
            id = 8359, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de titres mondiaux Henry Armstrong a-t-il remportés?", listOf("5", "6", "7", "8"), "Sport", "Henry Armstrong est le seul boxeur de l'histoire à avoir détenu simultanément trois titres mondiaux dans des catégories différentes (poids plume, léger et welters) entre 1937 et 1938."),
            en = LocalizedContent("How many world titles did Henry Armstrong win?", listOf("5", "6", "7", "8"), "Sports", "Henry Armstrong is the only boxer in history to have simultaneously held three world titles in different weight classes (featherweight, lightweight, and welterweight) between 1937 and 1938."),
            zh = LocalizedContent("亨利·阿姆斯特朗赢得了多少个世界冠军头衔？", listOf("5", "6", "7", "8"), "体育", "亨利·阿姆斯特朗是历史上唯一一位在1937年至1938年间同时在三个不同体重级别（羽量级、轻量级和次中量级）拥有世界冠军头衔的拳击手。"),
            es = LocalizedContent("¿Cuántos títulos mundiales ganó Henry Armstrong?", listOf("5", "6", "7", "8"), "Deportes", "Henry Armstrong es el único boxeador en la historia que ha ostentado simultáneamente tres títulos mundiales en diferentes categorías de peso (peso pluma, ligero y wélter) entre 1937 y 1938.")
        ),
        BilingualQuestion(
            id = 8360, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre de matchs sans défaite?", listOf("50", "60", "70", "80"), "Sport", "Le record de 60 matchs sans défaite a été établi par le club brésilien de Flamengo entre 2019 et 2020, toutes compétitions confondues."),
            en = LocalizedContent("What is the record for the most consecutive matches without defeat?", listOf("50", "60", "70", "80"), "Sports", "The record of 60 matches without defeat was set by the Brazilian club Flamengo between 2019 and 2020, across all competitions."),
            zh = LocalizedContent("最长不败纪录是多少场比赛？", listOf("50", "60", "70", "80"), "体育", "60场不败纪录由巴西弗拉门戈俱乐部在2019年至2020年间创造，涵盖所有赛事。"),
            es = LocalizedContent("¿Cuál es el récord de más partidos consecutivos sin perder?", listOf("50", "60", "70", "80"), "Deportes", "El récord de 60 partidos sin perder fue establecido por el club brasileño Flamengo entre 2019 y 2020, en todas las competiciones.")
        ),
        BilingualQuestion(
            id = 8361, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a le plus long palmarès sans défaite?", listOf("Rocky Marciano", "Joe Calzaghe", "Lennox Lewis", "Muhammad Ali"), "Sport", "Rocky Marciano, boxeur américain poids lourds, a pris sa retraite invaincu en 1956 avec un bilan de 49 victoires, dont 43 par KO, ce qui constitue le plus long palmarès sans défaite de l'histoire de la boxe professionnelle."),
            en = LocalizedContent("Who has the longest undefeated record?", listOf("Rocky Marciano", "Joe Calzaghe", "Lennox Lewis", "Muhammad Ali"), "Sports", "Rocky Marciano, American heavyweight boxer, retired undefeated in 1956 with a record of 49 wins, including 43 by KO, which is the longest undefeated record in professional boxing history."),
            zh = LocalizedContent("谁拥有最长的不败纪录？", listOf("洛奇·马西亚诺", "乔·卡尔扎合", "伦诺克斯·刘易斯", "穆罕默德·阿里"), "体育", "美国重量级拳击手洛奇·马西亚诺于1956年以49胜（其中43次KO）的不败战绩退役，这是职业拳击史上最长的不败纪录。"),
            es = LocalizedContent("¿Quién tiene el récord invicto más largo?", listOf("Rocky Marciano", "Joe Calzaghe", "Lennox Lewis", "Muhammad Ali"), "Deportes", "Rocky Marciano, boxeador estadounidense de peso pesado, se retiró invicto en 1956 con un récord de 49 victorias, incluyendo 43 por KO, lo que constituye el récord invicto más largo en la historia del boxeo profesional.")
        ),
        BilingualQuestion(
            id = 8362, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de matchs Rocky Marciano a-t-il remportés sans défaite?", listOf("47", "48", "49", "50"), "Sport", "Rocky Marciano a pris sa retraite en 1956 avec un bilan parfait de 49 victoires, dont 43 par KO, ce qui reste le meilleur palmarès invaincu chez les poids lourds."),
            en = LocalizedContent("How many matches did Rocky Marciano win without defeat?", listOf("47", "48", "49", "50"), "Sports", "Rocky Marciano retired in 1956 with a perfect record of 49 wins, including 43 by KO, which remains the best undefeated record among heavyweights."),
            zh = LocalizedContent("洛奇·马西亚诺不败获胜了多少场比赛？", listOf("47", "48", "49", "50"), "体育", "洛奇·马西亚诺于1956年以49胜（其中43次KO）的完美战绩退役，这仍然是重量级拳手中最佳的不败纪录。"),
            es = LocalizedContent("¿Cuántos combates ganó Rocky Marciano sin perder?", listOf("47", "48", "49", "50"), "Deportes", "Rocky Marciano se retiró en 1956 con un récord perfecto de 49 victorias, incluyendo 43 por KO, que sigue siendo el mejor récord invicto entre los pesos pesados.")
        ),
        BilingualQuestion(
            id = 8363, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre de championnats du monde?", listOf("8", "9", "10", "11"), "Sport", "Le record de neuf titres mondiaux est détenu par le judoka Teddy Riner, qui a remporté son neuvième championnat du monde en 2017."),
            en = LocalizedContent("What is the record for the most world championships?", listOf("8", "9", "10", "11"), "Sports", "The record of nine world titles is held by judoka Teddy Riner, who won his ninth world championship in 2017."),
            zh = LocalizedContent("最多世界冠军纪录是多少个？", listOf("8", "9", "10", "11"), "体育", "九个世界冠军的纪录由柔道运动员泰迪·里纳保持，他在2017年赢得了第九个世界冠军。"),
            es = LocalizedContent("¿Cuál es el récord de más campeonatos mundiales?", listOf("8", "9", "10", "11"), "Deportes", "El récord de nueve títulos mundiales lo posee el judoka Teddy Riner, quien ganó su noveno campeonato mundial en 2017.")
        ),
        BilingualQuestion(
            id = 8364, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté le plus de championnats du monde?", listOf("Oscar De La Hoya", "Manny Pacquiao", "Muhammad Ali", "Sugar Ray Leonard"), "Sport", "Manny Pacquiao détient le record du plus grand nombre de championnats du monde de boxe dans huit catégories de poids différentes, un exploit unique dans l'histoire de ce sport."),
            en = LocalizedContent("Who has won the most world championships?", listOf("Oscar De La Hoya", "Manny Pacquiao", "Muhammad Ali", "Sugar Ray Leonard"), "Sports", "Manny Pacquiao holds the record for the most world championships in boxing across eight different weight classes, a unique feat in the history of the sport."),
            zh = LocalizedContent("谁赢得了最多的世界冠军？", listOf("奥斯卡·德拉·霍亚", "曼尼·帕奎奥", "穆罕默德·阿里", "舒格·雷·伦纳德"), "体育", "曼尼·帕奎奥保持着在八个不同体重级别中获得最多世界拳击冠军的纪录，这是该运动历史上独一无二的成就。"),
            es = LocalizedContent("¿Quién ha ganado más campeonatos mundiales?", listOf("Óscar de la Hoya", "Manny Pacquiao", "Muhammad Ali", "Sugar Ray Leonard"), "Deportes", "Manny Pacquiao posee el récord de más campeonatos mundiales de boxeo en ocho categorías de peso diferentes, una hazaña única en la historia de este deporte.")
        ),
        BilingualQuestion(
            id = 8365, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de championnats Manny Pacquiao a-t-il remportés?", listOf("8", "9", "10", "11"), "Sport", "Manny Pacquiao est le seul boxeur de l'histoire à avoir remporté des titres mondiaux dans huit catégories de poids différentes, de la mouche aux super-welters."),
            en = LocalizedContent("How many championships has Manny Pacquiao won?", listOf("8", "9", "10", "11"), "Sports", "Manny Pacquiao is the only boxer in history to have won world titles in eight different weight classes, from flyweight to super welterweight."),
            zh = LocalizedContent("曼尼·帕奎奥赢得了多少个冠军？", listOf("8", "9", "10", "11"), "体育", "曼尼·帕奎奥是历史上唯一一位在八个不同体重级别（从蝇量级到超次中量级）赢得世界冠军的拳击手。"),
            es = LocalizedContent("¿Cuántos campeonatos ha ganado Manny Pacquiao?", listOf("8", "9", "10", "11"), "Deportes", "Manny Pacquiao es el único boxeador en la historia que ha ganado títulos mundiales en ocho categorías de peso diferentes, desde peso mosca hasta superwelter.")
        ),
        BilingualQuestion(
            id = 8366, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre de victoires par KO?", listOf("42", "50", "58", "60"), "Sport", "Le record du plus grand nombre de victoires par KO en boxe professionnelle est détenu par le Cubain Omar Narvaez, avec 58 KOs. Ce total inclut des combats dans les années 1990 et 2000."),
            en = LocalizedContent("What is the record for the most wins by KO?", listOf("42", "50", "58", "60"), "Sports", "The record for the most wins by KO in professional boxing is held by Cuban Omar Narvaez, with 58 KOs. This total includes fights in the 1990s and 2000s."),
            zh = LocalizedContent("最多KO获胜纪录是多少？", listOf("42", "50", "58", "60"), "体育", "职业拳击中最多KO获胜纪录由古巴选手奥马尔·纳瓦埃斯保持，共58次KO。这一总数包括1990年代和2000年代的比赛。"),
            es = LocalizedContent("¿Cuál es el récord de más victorias por KO?", listOf("42", "50", "58", "60"), "Deportes", "El récord de más victorias por KO en el boxeo profesional lo posee el cubano Omar Narváez, con 58 KOs. Este total incluye combates de las décadas de 1990 y 2000.")
        ),
        BilingualQuestion(
            id = 8367, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a le plus de victoires par KO?", listOf("Joe Louis", "Muhammad Ali", "Lennox Lewis", "George Foreman"), "Sport", "Joe Louis détient le record du plus grand nombre de victoires par KO dans l'histoire de la boxe poids lourds, avec 52 KO en 69 combats professionnels."),
            en = LocalizedContent("Who has the most wins by KO?", listOf("Joe Louis", "Muhammad Ali", "Lennox Lewis", "George Foreman"), "Sports", "Joe Louis holds the record for the most wins by KO in heavyweight boxing history, with 52 KOs in 69 professional fights."),
            zh = LocalizedContent("谁拥有最多的KO获胜次数？", listOf("乔·路易斯", "穆罕默德·阿里", "伦诺克斯·刘易斯", "乔治·福尔曼"), "体育", "乔·路易斯保持着重量级拳击史上最多KO获胜纪录，在69场职业比赛中取得52次KO。"),
            es = LocalizedContent("¿Quién tiene más victorias por KO?", listOf("Joe Louis", "Muhammad Ali", "Lennox Lewis", "George Foreman"), "Deportes", "Joe Louis posee el récord de más victorias por KO en la historia del boxeo de peso pesado, con 52 KOs en 69 combates profesionales.")
        ),
        BilingualQuestion(
            id = 8368, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de KO Joe Louis a-t-il enregistrés?", listOf("42", "50", "58", "60"), "Sport", "Joe Louis a remporté 58 de ses 69 victoires par KO, un record dans la catégorie des poids lourds, ce qui lui a valu le surnom de \"Bomber de Detroit\"."),
            en = LocalizedContent("How many KOs did Joe Louis record?", listOf("42", "50", "58", "60"), "Sports", "Joe Louis won 58 of his 69 victories by KO, a record in the heavyweight division, earning him the nickname \"The Bomber of Detroit.\""),
            zh = LocalizedContent("乔·路易斯记录了多少次KO？", listOf("42", "50", "58", "60"), "体育", "乔·路易斯在69场胜利中有58次通过KO获胜，这是重量级拳击的纪录，为他赢得了“底特律轰炸机”的绰号。"),
            es = LocalizedContent("¿Cuántos KOs registró Joe Louis?", listOf("42", "50", "58", "60"), "Deportes", "Joe Louis ganó 58 de sus 69 victorias por KO, un récord en la categoría de peso pesado, lo que le valió el apodo de \"El Bombardero de Detroit\".")
        ),
        BilingualQuestion(
            id = 8369, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus long combat?", listOf("75", "100", "110", "120"), "Sport", "Le record du plus long combat de boxe est de 110 rounds, disputé en 1893 entre Andy Bowen et Jack Burke, durant 7 heures et 19 minutes sans vainqueur déclaré."),
            en = LocalizedContent("What is the record for the longest fight?", listOf("75", "100", "110", "120"), "Sports", "The record for the longest boxing match is 110 rounds, fought in 1893 between Andy Bowen and Jack Burke, lasting 7 hours and 19 minutes with no declared winner."),
            zh = LocalizedContent("最长比赛纪录是多少回合？", listOf("75", "100", "110", "120"), "体育", "最长拳击比赛纪录为110回合，于1893年由安迪·鲍文和杰克·伯克进行，持续7小时19分钟，未决出胜者。"),
            es = LocalizedContent("¿Cuál es el récord del combate más largo?", listOf("75", "100", "110", "120"), "Deportes", "El récord del combate de boxeo más largo es de 110 asaltos, disputado en 1893 entre Andy Bowen y Jack Burke, con una duración de 7 horas y 19 minutos sin un ganador declarado.")
        ),
        BilingualQuestion(
            id = 8370, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel match est connu comme le \"Fight of the Century\"?", listOf("Ali vs Frazier I", "Ali vs Foreman", "Ali vs Cleveland Williams", "Ali vs Terrell"), "Sport", "Le combat entre Muhammad Ali et Joe Frazier en 1971 au Madison Square Garden est surnommé le \"Fight of the Century\" car il opposait deux champions invaincus pour le titre mondial des poids lourds, attirant une audience télévisée record."),
            en = LocalizedContent("Which match is known as the \"Fight of the Century\"?", listOf("Ali vs Frazier I", "Ali vs Foreman", "Ali vs Cleveland Williams", "Ali vs Terrell"), "Sports", "The fight between Muhammad Ali and Joe Frazier in 1971 at Madison Square Garden is called the \"Fight of the Century\" because it pitted two undefeated champions for the world heavyweight title, attracting a record television audience."),
            zh = LocalizedContent("哪场比赛被称为“世纪之战”？", listOf("阿里对弗雷泽一世", "阿里对福尔曼", "阿里对克利夫兰·威廉姆斯", "阿里对特雷尔"), "体育", "1971年穆罕默德·阿里与乔·弗雷泽在麦迪逊广场花园的比赛被称为“世纪之战”，因为这是两位不败冠军争夺世界重量级拳王头衔，吸引了创纪录的电视观众。"),
            es = LocalizedContent("¿Qué combate es conocido como el \"Pelea del Siglo\"?", listOf("Ali vs Frazier I", "Ali vs Foreman", "Ali vs Cleveland Williams", "Ali vs Terrell"), "Deportes", "La pelea entre Muhammad Ali y Joe Frazier en 1971 en el Madison Square Garden es apodada la \"Pelea del Siglo\" porque enfrentó a dos campeones invictos por el título mundial de peso pesado, atrayendo una audiencia televisiva récord.")
        ),
        BilingualQuestion(
            id = 8371, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre de défenses consécutives?", listOf("10", "15", "18", "20"), "Sport", "Le record de 18 défenses consécutives est détenu par le boxeur Floyd Mayweather Jr., qui a remporté tous ses combats professionnels entre 1996 et 2015 sans défaite."),
            en = LocalizedContent("What is the record for the most consecutive defenses?", listOf("10", "15", "18", "20"), "Sports", "The record of 18 consecutive defenses is held by boxer Floyd Mayweather Jr., who won all his professional fights between 1996 and 2015 without defeat."),
            zh = LocalizedContent("连续卫冕次数最多的纪录是多少？", listOf("10", "15", "18", "20"), "体育", "18次连续卫冕的纪录由拳击手弗洛伊德·梅威瑟保持，他在1996年至2015年间赢得了所有职业比赛，未尝败绩。"),
            es = LocalizedContent("¿Cuál es el récord de más defensas consecutivas?", listOf("10", "15", "18", "20"), "Deportes", "El récord de 18 defensas consecutivas lo posee el boxeador Floyd Mayweather Jr., quien ganó todas sus peleas profesionales entre 1996 y 2015 sin derrota.")
        ),
        BilingualQuestion(
            id = 8372, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a défendu le plus son titre consécutivement?", listOf("Joe Louis", "Muhammad Ali", "Lennox Lewis", "Evander Holyfield"), "Sport", "Joe Louis a défendu son titre de champion du monde des poids lourds 25 fois consécutives entre 1937 et 1949, un record inégalé dans l'histoire de la boxe."),
            en = LocalizedContent("Who has defended their title the most consecutively?", listOf("Joe Louis", "Muhammad Ali", "Lennox Lewis", "Evander Holyfield"), "Sports", "Joe Louis defended his world heavyweight title 25 consecutive times between 1937 and 1949, an unmatched record in boxing history."),
            zh = LocalizedContent("谁连续卫冕次数最多？", listOf("乔·路易斯", "穆罕默德·阿里", "伦诺克斯·刘易斯", "伊万德·霍利菲尔德"), "体育", "乔·路易斯在1937年至1949年间连续25次卫冕世界重量级拳王头衔，这是拳击史上无与伦比的纪录。"),
            es = LocalizedContent("¿Quién ha defendido su título más veces consecutivas?", listOf("Joe Louis", "Muhammad Ali", "Lennox Lewis", "Evander Holyfield"), "Deportes", "Joe Louis defendió su título de campeón mundial de peso pesado 25 veces consecutivas entre 1937 y 1949, un récord sin igual en la historia del boxeo.")
        ),
        BilingualQuestion(
            id = 8373, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de défenses consécutives Joe Louis a-t-il effectuées?", listOf("10", "15", "18", "20"), "Sport", "Joe Louis, surnommé le \"Bombardier de Détroit\", a défendu son titre de champion du monde des poids lourds 25 fois, mais le record de 18 défenses consécutives fait référence à une série spécifique entre 1937 et 1949, avant sa retraite temporaire."),
            en = LocalizedContent("How many consecutive defenses did Joe Louis have?", listOf("10", "15", "18", "20"), "Sports", "Joe Louis, nicknamed the \"Brown Bomber,\" defended his world heavyweight title 25 times, but the record of 18 consecutive defenses refers to a specific streak between 1937 and 1949 before his temporary retirement."),
            zh = LocalizedContent("乔·路易斯连续卫冕了多少次？", listOf("10", "15", "18", "20"), "体育", "乔·路易斯，绰号“褐色轰炸机”，曾25次卫冕世界重量级拳王头衔，但18次连续卫冕的纪录指的是1937年至1949年间的一段特定连胜，之后他暂时退役。"),
            es = LocalizedContent("¿Cuántas defensas consecutivas tuvo Joe Louis?", listOf("10", "15", "18", "20"), "Deportes", "Joe Louis, apodado el \"Bombardero Marrón\", defendió su título mundial de peso pesado 25 veces, pero el récord de 18 defensas consecutivas se refiere a una racha específica entre 1937 y 1949, antes de su retiro temporal.")
        ),
        BilingualQuestion(
            id = 8374, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre de victoires en carrière?", listOf("58", "68", "70", "78"), "Sport", "Ce record de 78 victoires en carrière est détenu par le pilote de Formule 1 Lewis Hamilton, surpassant l'ancien record de Michael Schumacher (91 victoires)."),
            en = LocalizedContent("What is the record for the most career wins?", listOf("58", "68", "70", "78"), "Sports", "This record of 78 career wins is held by Formula 1 driver Lewis Hamilton, surpassing the previous record of Michael Schumacher (91 wins)."),
            zh = LocalizedContent("职业生涯获胜次数最多的纪录是多少？", listOf("58", "68", "70", "78"), "体育", "78次职业生涯获胜的纪录由一级方程式赛车手刘易斯·汉密尔顿保持，超越了迈克尔·舒马赫之前的纪录（91胜）。"),
            es = LocalizedContent("¿Cuál es el récord de más victorias en la carrera?", listOf("58", "68", "70", "78"), "Deportes", "Este récord de 78 victorias en la carrera lo posee el piloto de Fórmula 1 Lewis Hamilton, superando el récord anterior de Michael Schumacher (91 victorias).")
        ),
        BilingualQuestion(
            id = 8375, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a le plus de victoires en carrière?", listOf("Muhammad Ali", "Archie Moore", "Joe Louis", "Jack Johnson"), "Sport", "Archie Moore détient le record du plus grand nombre de victoires en carrière chez les boxeurs professionnels, avec 186 succès entre 1935 et 1963."),
            en = LocalizedContent("Who has the most career wins?", listOf("Muhammad Ali", "Archie Moore", "Joe Louis", "Jack Johnson"), "Sports", "Archie Moore holds the record for the most career wins among professional boxers, with 186 successes between 1935 and 1963."),
            zh = LocalizedContent("谁拥有最多的职业生涯胜利？", listOf("穆罕默德·阿里", "阿奇·穆尔", "乔·路易斯", "杰克·约翰逊"), "体育", "阿奇·穆尔保持着职业拳击手职业生涯获胜次数最多的纪录，在1935年至1963年间取得了186场胜利。"),
            es = LocalizedContent("¿Quién tiene más victorias en la carrera?", listOf("Muhammad Ali", "Archie Moore", "Joe Louis", "Jack Johnson"), "Deportes", "Archie Moore posee el récord de más victorias en la carrera entre los boxeadores profesionales, con 186 éxitos entre 1935 y 1963.")
        ),
        BilingualQuestion(
            id = 8376, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de victoires Archie Moore a-t-il enregistrées?", listOf("185", "195", "205", "215"), "Sport", "Archie Moore détient le record du plus grand nombre de victoires par KO chez les boxeurs professionnels, avec 145 KO, et un total de 205 victoires en carrière."),
            en = LocalizedContent("How many wins did Archie Moore record?", listOf("185", "195", "205", "215"), "Sports", "Archie Moore holds the record for the most wins by KO among professional boxers, with 145 KOs, and a total of 205 career wins."),
            zh = LocalizedContent("阿奇·穆尔记录了多少场胜利？", listOf("185", "195", "205", "215"), "体育", "阿奇·穆尔保持着职业拳击手KO获胜次数最多的纪录，有145次KO，职业生涯总胜场为205场。"),
            es = LocalizedContent("¿Cuántas victorias registró Archie Moore?", listOf("185", "195", "205", "215"), "Deportes", "Archie Moore posee el récord de más victorias por KO entre los boxeadores profesionales, con 145 KOs, y un total de 205 victorias en su carrera.")
        ),
        BilingualQuestion(
            id = 8377, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre de défaites?", listOf("15", "20", "25", "30"), "Sport", "Le record du plus grand nombre de défaites en championnat professionnel est détenu par le club de football anglais Derby County, avec 25 revers lors de la saison 2007-2008 de Premier League."),
            en = LocalizedContent("What is the record for the most losses?", listOf("15", "20", "25", "30"), "Sports", "The record for the most losses in a professional league is held by English football club Derby County, with 25 defeats during the 2007-2008 Premier League season."),
            zh = LocalizedContent("最多失利纪录是多少？", listOf("15", "20", "25", "30"), "体育", "职业联赛中最多失利的纪录由英格兰足球俱乐部德比郡保持，在2007-2008赛季英超联赛中遭遇25场失利。"),
            es = LocalizedContent("¿Cuál es el récord de más derrotas?", listOf("15", "20", "25", "30"), "Deportes", "El récord de más derrotas en una liga profesional lo posee el club de fútbol inglés Derby County, con 25 reveses durante la temporada 2007-2008 de la Premier League.")
        ),
        BilingualQuestion(
            id = 8378, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a le plus de défaites dans les records?", listOf("John Kaplan", "Joe Erskine", "Andy Baker", "Bill Hartman"), "Sport", "John Kaplan détient le record du plus grand nombre de défaites en boxe professionnelle, avec 101 revers sur 135 combats entre 1946 et 1961."),
            en = LocalizedContent("Who has the most losses in the records?", listOf("John Kaplan", "Joe Erskine", "Andy Baker", "Bill Hartman"), "Sports", "John Kaplan holds the record for the most losses in professional boxing, with 101 defeats in 135 fights between 1946 and 1961."),
            zh = LocalizedContent("谁在纪录中拥有最多的失利？", listOf("约翰·卡普兰", "乔·厄斯金", "安迪·贝克", "比尔·哈特曼"), "体育", "约翰·卡普兰保持着职业拳击最多失利的纪录，在1946年至1961年间的135场比赛中遭遇101场失利。"),
            es = LocalizedContent("¿Quién tiene más derrotas en los récords?", listOf("John Kaplan", "Joe Erskine", "Andy Baker", "Bill Hartman"), "Deportes", "John Kaplan posee el récord de más derrotas en el boxeo profesional, con 101 reveses en 135 combates entre 1946 y 1961.")
        ),
        BilingualQuestion(
            id = 8379, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand poids pour un champion?", listOf("230 lb", "240 lb", "250 lb", "265 lb"), "Sport", "Le record du plus grand poids pour un champion de boxe poids lourd est détenu par le Britannique Tyson Fury, qui pesait environ 250 livres (113 kg) lors de son combat contre Deontay Wilder en 2020."),
            en = LocalizedContent("What is the record for the heaviest weight for a champion?", listOf("230 lb", "240 lb", "250 lb", "265 lb"), "Sports", "The record for the heaviest weight for a heavyweight boxing champion is held by Briton Tyson Fury, who weighed about 250 pounds (113 kg) during his fight against Deontay Wilder in 2020."),
            zh = LocalizedContent("冠军最重体重的纪录是多少？", listOf("230磅", "240磅", "250磅", "265磅"), "体育", "重量级拳击冠军最重体重的纪录由英国人泰森·富里保持，他在2020年对阵德昂泰·维尔德的比赛中体重约为250磅（113公斤）。"),
            es = LocalizedContent("¿Cuál es el récord del peso más pesado para un campeón?", listOf("230 lb", "240 lb", "250 lb", "265 lb"), "Deportes", "El récord del peso más pesado para un campeón de boxeo de peso pesado lo posee el británico Tyson Fury, que pesaba alrededor de 250 libras (113 kg) durante su combate contra Deontay Wilder en 2020.")
        ),
        BilingualQuestion(
            id = 8380, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel combattant a pesé le plus?", listOf("Mohammad Ali", "George Foreman", "Tyson Fury", "Lennox Lewis"), "Sport", "Tyson Fury est le plus lourd des combattants cités, son poids de combat atteignant régulièrement plus de 120 kg, ce qui le place au-dessus de la catégorie des poids lourds."),
            en = LocalizedContent("Which fighter weighed the most?", listOf("Muhammad Ali", "George Foreman", "Tyson Fury", "Lennox Lewis"), "Sports", "Tyson Fury is the heaviest among the listed fighters, with his fighting weight regularly exceeding 120 kg, placing him above the heavyweight division."),
            zh = LocalizedContent("哪位拳击手体重最重？", listOf("穆罕默德·阿里", "乔治·福尔曼", "泰森·富里", "伦诺克斯·刘易斯"), "体育", "泰森·富里是所列拳击手中最重的，他的比赛体重经常超过120公斤，使他处于重量级之上。"),
            es = LocalizedContent("¿Qué peleador pesó más?", listOf("Muhammad Ali", "George Foreman", "Tyson Fury", "Lennox Lewis"), "Deportes", "Tyson Fury es el más pesado de los peleadores mencionados, con un peso de combate que alcanza regularmente más de 120 kg, colocándolo por encima de la categoría de pesos pesados.")
        ),
        BilingualQuestion(
            id = 8381, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus jeune champion du monde?", listOf("Mike Tyson", "Floyd Mayweather", "Manny Pacquiao", "Oscar De La Hoya"), "Sport", "Mike Tyson est devenu champion du monde poids lourds à 20 ans en 1986, ce qui reste le record de précocité pour un champion du monde de boxe."),
            en = LocalizedContent("Who is the youngest world champion?", listOf("Mike Tyson", "Floyd Mayweather", "Manny Pacquiao", "Oscar De La Hoya"), "Sports", "Mike Tyson became world heavyweight champion at age 20 in 1986, which remains the record for the youngest world champion in boxing."),
            zh = LocalizedContent("谁是最年轻的世界冠军？", listOf("迈克·泰森", "弗洛伊德·梅威瑟", "曼尼·帕奎奥", "奥斯卡·德拉·霍亚"), "体育", "迈克·泰森在1986年20岁时成为世界重量级冠军，这仍然是拳击史上最年轻的世界冠军纪录。"),
            es = LocalizedContent("¿Quién es el campeón mundial más joven?", listOf("Mike Tyson", "Floyd Mayweather", "Manny Pacquiao", "Oscar De La Hoya"), "Deportes", "Mike Tyson se convirtió en campeón mundial de peso pesado a los 20 años en 1986, lo que sigue siendo el récord de precocidad para un campeón mundial de boxeo.")
        ),
        BilingualQuestion(
            id = 8382, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel âge avait Mike Tyson quand il est devenu champion?", listOf("18", "19", "20", "21"), "Sport", "Mike Tyson a battu Trevor Berbick le 22 novembre 1986 pour devenir le plus jeune champion du monde poids lourds de l'histoire, à 20 ans et 4 mois."),
            en = LocalizedContent("How old was Mike Tyson when he became champion?", listOf("18", "19", "20", "21"), "Sports", "Mike Tyson defeated Trevor Berbick on November 22, 1986, to become the youngest world heavyweight champion in history, at 20 years and 4 months."),
            zh = LocalizedContent("迈克·泰森成为冠军时多大？", listOf("18", "19", "20", "21"), "体育", "迈克·泰森于1986年11月22日击败特雷弗·伯比克，以20岁零4个月的年龄成为历史上最年轻的世界重量级冠军。"),
            es = LocalizedContent("¿Qué edad tenía Mike Tyson cuando se convirtió en campeón?", listOf("18", "19", "20", "21"), "Deportes", "Mike Tyson derrotó a Trevor Berbick el 22 de noviembre de 1986 para convertirse en el campeón mundial de peso pesado más joven de la historia, con 20 años y 4 meses.")
        ),
        BilingualQuestion(
            id = 8383, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus vieux champion du monde?", listOf("George Foreman", "Joe Louis", "Evander Holyfield", "Larry Holmes"), "Sport", "George Foreman est devenu champion du monde des poids lourds à 45 ans en 1994, battant Michael Moorer, ce qui fait de lui le plus vieux champion du monde de boxe."),
            en = LocalizedContent("Who is the oldest world champion?", listOf("George Foreman", "Joe Louis", "Evander Holyfield", "Larry Holmes"), "Sports", "George Foreman became world heavyweight champion at age 45 in 1994, defeating Michael Moorer, making him the oldest world champion in boxing."),
            zh = LocalizedContent("谁是最年长的世界冠军？", listOf("乔治·福尔曼", "乔·路易斯", "伊万德·霍利菲尔德", "拉里·霍姆斯"), "体育", "乔治·福尔曼在1994年45岁时击败迈克尔·穆勒成为世界重量级冠军，这使他成为拳击史上最年长的世界冠军。"),
            es = LocalizedContent("¿Quién es el campeón mundial más viejo?", listOf("George Foreman", "Joe Louis", "Evander Holyfield", "Larry Holmes"), "Deportes", "George Foreman se convirtió en campeón mundial de peso pesado a los 45 años en 1994, derrotando a Michael Moorer, lo que lo convierte en el campeón mundial de boxeo más viejo.")
        ),
        BilingualQuestion(
            id = 8384, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel âge avait George Foreman quand il a retrouvé son titre?", listOf("45", "46", "48", "50"), "Sport", "George Foreman avait 45 ans lorsqu'il a reconquis le titre de champion du monde poids lourds en battant Michael Moorer en 1994, devenant ainsi le plus vieux boxeur à remporter ce titre."),
            en = LocalizedContent("How old was George Foreman when he regained his title?", listOf("45", "46", "48", "50"), "Sports", "George Foreman was 45 years old when he regained the world heavyweight title by defeating Michael Moorer in 1994, becoming the oldest boxer to win that title."),
            zh = LocalizedContent("乔治·福尔曼重夺冠军时多大？", listOf("45", "46", "48", "50"), "体育", "乔治·福尔曼在1994年击败迈克尔·穆勒重夺世界重量级冠军时45岁，成为赢得该头衔最年长的拳击手。"),
            es = LocalizedContent("¿Qué edad tenía George Foreman cuando recuperó su título?", listOf("45", "46", "48", "50"), "Deportes", "George Foreman tenía 45 años cuando recuperó el título mundial de peso pesado al derrotar a Michael Moorer en 1994, convirtiéndose en el boxeador más viejo en ganar ese título.")
        ),
        BilingualQuestion(
            id = 8385, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre de victoires par UD?", listOf("20", "25", "30", "35"), "Sport", "Ce record est détenu par le boxeur Ricardo López, qui a remporté 30 de ses 51 combats par décision unanime, sans jamais perdre un seul round sur les cartes des juges."),
            en = LocalizedContent("What is the record for the most wins by UD?", listOf("20", "25", "30", "35"), "Sports", "This record is held by boxer Ricardo López, who won 30 of his 51 fights by unanimous decision, never losing a single round on the judges' scorecards."),
            zh = LocalizedContent("最多一致判定胜利的纪录是多少？", listOf("20", "25", "30", "35"), "体育", "这项纪录由拳击手里卡多·洛佩兹保持，他在51场比赛中以一致判定赢得了30场，从未在裁判记分卡上输掉一个回合。"),
            es = LocalizedContent("¿Cuál es el récord de más victorias por decisión unánime?", listOf("20", "25", "30", "35"), "Deportes", "Este récord lo posee el boxeador Ricardo López, quien ganó 30 de sus 51 combates por decisión unánime, sin perder nunca un solo asalto en las tarjetas de los jueces.")
        ),
        BilingualQuestion(
            id = 8386, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre d'années sans défaite?", listOf("10", "15", "20", "25"), "Sport", "Le record de 20 ans sans défaite est détenu par le club de football écossais Celtic Glasgow, qui n'a pas perdu un match à domicile en championnat entre 1901 et 1921."),
            en = LocalizedContent("What is the record for the most years without defeat?", listOf("10", "15", "20", "25"), "Sports", "The record of 20 years without defeat is held by the Scottish football club Celtic Glasgow, which did not lose a home league match between 1901 and 1921."),
            zh = LocalizedContent("最长不败年数的纪录是多少？", listOf("10", "15", "20", "25"), "体育", "20年不败的纪录由苏格兰足球俱乐部凯尔特人保持，他们在1901年至1921年间没有输过一场主场联赛比赛。"),
            es = LocalizedContent("¿Cuál es el récord de más años sin derrota?", listOf("10", "15", "20", "25"), "Deportes", "El récord de 20 años sin derrota lo posee el club de fútbol escocés Celtic Glasgow, que no perdió un partido de liga en casa entre 1901 y 1921.")
        ),
        BilingualQuestion(
            id = 8387, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a eu la plus longue série sans défaite?", listOf("Joe Calzaghe", "Joe Louis", "Muhammad Ali", "Rocky Marciano"), "Sport", "Joe Calzaghe, boxeur gallois invaincu, a pris sa retraite avec 46 victoires consécutives, un record dans l'histoire de la boxe professionnelle pour un champion du monde."),
            en = LocalizedContent("Who had the longest undefeated streak?", listOf("Joe Calzaghe", "Joe Louis", "Muhammad Ali", "Rocky Marciano"), "Sports", "Joe Calzaghe, an undefeated Welsh boxer, retired with 46 consecutive victories, a record in professional boxing history for a world champion."),
            zh = LocalizedContent("谁拥有最长的不败纪录？", listOf("乔·卡尔扎合", "乔·路易斯", "穆罕默德·阿里", "洛奇·马西亚诺"), "体育", "威尔士不败拳击手乔·卡尔扎合以46连胜退役，这是职业拳击史上世界冠军的纪录。"),
            es = LocalizedContent("¿Quién tuvo la racha más larga sin derrota?", listOf("Joe Calzaghe", "Joe Louis", "Muhammad Ali", "Rocky Marciano"), "Deportes", "Joe Calzaghe, boxeador galés invicto, se retiró con 46 victorias consecutivas, un récord en la historia del boxeo profesional para un campeón mundial.")
        ),
        BilingualQuestion(
            id = 8388, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre de matchs en une année?", listOf("15", "18", "20", "25"), "Sport", "Le record du plus grand nombre de matchs en une année est détenu par le joueur de tennis Rafael Nadal, qui a disputé 20 finales en 2006."),
            en = LocalizedContent("What is the record for the most matches in a year?", listOf("15", "18", "20", "25"), "Sports", "The record for the most matches in a year is held by tennis player Rafael Nadal, who played 20 finals in 2006."),
            zh = LocalizedContent("一年内最多比赛的纪录是多少？", listOf("15", "18", "20", "25"), "体育", "一年内最多比赛的纪录由网球运动员拉斐尔·纳达尔保持，他在2006年打了20场决赛。"),
            es = LocalizedContent("¿Cuál es el récord de más partidos en un año?", listOf("15", "18", "20", "25"), "Deportes", "El récord de más partidos en un año lo posee el tenista Rafael Nadal, quien disputó 20 finales en 2006.")
        ),
        BilingualQuestion(
            id = 8389, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a combattu le plus en une année?", listOf("Joe Louis", "Muhammad Ali", "Sugar Ray Robinson", "Jack Dempsey"), "Sport", "Sugar Ray Robinson détient le record du plus grand nombre de combats professionnels en une seule année, avec 22 combats en 1951, dont 21 victoires et un match nul."),
            en = LocalizedContent("Who fought the most in a year?", listOf("Joe Louis", "Muhammad Ali", "Sugar Ray Robinson", "Jack Dempsey"), "Sports", "Sugar Ray Robinson holds the record for the most professional fights in a single year, with 22 fights in 1951, including 21 wins and one draw."),
            zh = LocalizedContent("谁在一年内比赛最多？", listOf("乔·路易斯", "穆罕默德·阿里", "舒格·雷·罗宾逊", "杰克·登普西"), "体育", "舒格·雷·罗宾逊保持着单年职业比赛最多的纪录，1951年共22场比赛，包括21胜1平。"),
            es = LocalizedContent("¿Quién peleó más en un año?", listOf("Joe Louis", "Muhammad Ali", "Sugar Ray Robinson", "Jack Dempsey"), "Deportes", "Sugar Ray Robinson posee el récord de más combates profesionales en un solo año, con 22 peleas en 1951, incluyendo 21 victorias y un empate.")
        ),
        BilingualQuestion(
            id = 8390, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre de titres par divisions?", listOf("6", "7", "8", "9"), "Sport", "Le record de huit titres par divisions est détenu par le boxeur américain Henry Armstrong, qui a été champion du monde dans trois catégories de poids différentes dans les années 1930."),
            en = LocalizedContent("What is the record for the most titles in different divisions?", listOf("6", "7", "8", "9"), "Sports", "The record of eight titles in different divisions is held by American boxer Henry Armstrong, who was world champion in three weight classes in the 1930s."),
            zh = LocalizedContent("在不同级别中获得最多冠军头衔的记录是多少？", listOf("6", "7", "8", "9"), "体育", "八个不同级别冠军头衔的记录由美国拳击手亨利·阿姆斯特朗保持，他在1930年代曾获得三个不同体重级别的世界冠军。"),
            es = LocalizedContent("¿Cuál es el récord de más títulos en diferentes divisiones?", listOf("6", "7", "8", "9"), "Deportes", "El récord de ocho títulos en diferentes divisiones lo posee el boxeador estadounidense Henry Armstrong, quien fue campeón mundial en tres categorías de peso diferentes en la década de 1930.")
        ),
        BilingualQuestion(
            id = 8391, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté le plus de titres dans différentes divisions?", listOf("Oscar De La Hoya", "Manny Pacquiao", "Muhammad Ali", "Henry Armstrong"), "Sport", "Manny Pacquiao est le seul boxeur de l'histoire à avoir remporté des titres mondiaux dans huit catégories de poids différentes, des poids mouches aux super-welters."),
            en = LocalizedContent("Who has won the most titles in different divisions?", listOf("Oscar De La Hoya", "Manny Pacquiao", "Muhammad Ali", "Henry Armstrong"), "Sports", "Manny Pacquiao is the only boxer in history to have won world titles in eight different weight classes, from flyweight to super welterweight."),
            zh = LocalizedContent("谁在不同级别中赢得了最多的冠军头衔？", listOf("奥斯卡·德拉·霍亚", "曼尼·帕奎奥", "穆罕默德·阿里", "亨利·阿姆斯特朗"), "体育", "曼尼·帕奎奥是历史上唯一一位在八个不同体重级别（从蝇量级到超次中量级）赢得世界冠军的拳击手。"),
            es = LocalizedContent("¿Quién ha ganado más títulos en diferentes divisiones?", listOf("Óscar de la Hoya", "Manny Pacquiao", "Muhammad Ali", "Henry Armstrong"), "Deportes", "Manny Pacquiao es el único boxeador en la historia que ha ganado títulos mundiales en ocho categorías de peso diferentes, desde peso mosca hasta superwelter.")
        ),
        BilingualQuestion(
            id = 8392, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de titres dans différentes divisions Manny Pacquiao a-t-il remportés?", listOf("6", "7", "8", "9"), "Sport", "Manny Pacquiao est le seul boxeur de l'histoire à avoir remporté des titres mondiaux dans huit divisions de poids différentes, de la catégorie des poids mouche à celle des super-welters."),
            en = LocalizedContent("How many titles in different divisions has Manny Pacquiao won?", listOf("6", "7", "8", "9"), "Sports", "Manny Pacquiao is the only boxer in history to have won world titles in eight different weight divisions, from flyweight to super welterweight."),
            zh = LocalizedContent("曼尼·帕奎奥在不同级别中赢得了多少个冠军头衔？", listOf("6", "7", "8", "9"), "体育", "曼尼·帕奎奥是历史上唯一一位在八个不同体重级别（从蝇量级到超次中量级）赢得世界冠军的拳击手。"),
            es = LocalizedContent("¿Cuántos títulos en diferentes divisiones ha ganado Manny Pacquiao?", listOf("6", "7", "8", "9"), "Deportes", "Manny Pacquiao es el único boxeador en la historia que ha ganado títulos mundiales en ocho divisiones de peso diferentes, desde peso mosca hasta superwelter.")
        ),
        BilingualQuestion(
            id = 8393, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus gros payday?", listOf("750 millions", "900 millions", "1 milliard", "1,2 milliard"), "Sport", "Le plus gros gain de l'histoire du sport a été remporté par le boxeur Floyd Mayweather pour son combat contre Conor McGregor en 2017, incluant les recettes du pay-per-view."),
            en = LocalizedContent("What is the record for the biggest payday?", listOf("750 million", "900 million", "1 billion", "1.2 billion"), "Sports", "The biggest payday in sports history was earned by boxer Floyd Mayweather for his fight against Conor McGregor in 2017, including pay-per-view revenue."),
            zh = LocalizedContent("最高单场收入的记录是多少？", listOf("7.5亿", "9亿", "10亿", "12亿"), "体育", "体育史上最高单场收入由拳击手弗洛伊德·梅威瑟在2017年与康纳·麦格雷戈的比赛中获得，包括按次付费收入。"),
            es = LocalizedContent("¿Cuál es el récord de mayor pago?", listOf("750 millones", "900 millones", "1 billón", "1.2 billones"), "Deportes", "El mayor pago en la historia del deporte lo obtuvo el boxeador Floyd Mayweather por su pelea contra Conor McGregor en 2017, incluyendo los ingresos de pago por evento.")
        ),
        BilingualQuestion(
            id = 8394, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel combat a généré le plus d'argent?", listOf("Mayweather vs Pacquiao", "Mayweather vs McGregor", "Ali vs Foreman", "Hearns vs Hagler"), "Sport", "Le combat de boxe entre Floyd Mayweather et Conor McGregor en 2017 a battu des records de revenus, générant environ 600 millions de dollars grâce aux ventes de billets et au pay-per-view."),
            en = LocalizedContent("Which fight generated the most money?", listOf("Mayweather vs Pacquiao", "Mayweather vs McGregor", "Ali vs Foreman", "Hearns vs Hagler"), "Sports", "The boxing match between Floyd Mayweather and Conor McGregor in 2017 broke revenue records, generating about $600 million through ticket sales and pay-per-view."),
            zh = LocalizedContent("哪场比赛创造了最高收入？", listOf("梅威瑟 vs 帕奎奥", "梅威瑟 vs 麦格雷戈", "阿里 vs 福尔曼", "赫恩斯 vs 哈格勒"), "体育", "2017年弗洛伊德·梅威瑟与康纳·麦格雷戈的拳击比赛打破了收入纪录，通过门票销售和按次付费产生了约6亿美元。"),
            es = LocalizedContent("¿Qué pelea generó más dinero?", listOf("Mayweather vs Pacquiao", "Mayweather vs McGregor", "Ali vs Foreman", "Hearns vs Hagler"), "Deportes", "La pelea de boxeo entre Floyd Mayweather y Conor McGregor en 2017 rompió récords de ingresos, generando alrededor de 600 millones de dólares en ventas de entradas y pago por evento.")
        ),
        BilingualQuestion(
            id = 8395, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre de victoires en défense?", listOf("30", "32", "35", "40"), "Sport", "Ce record de 32 victoires consécutives en défense est détenu par le lutteur américain Dan Gable, réalisé entre 1968 et 1970 aux Jeux olympiques et aux championnats du monde."),
            en = LocalizedContent("What is the record for the most consecutive title defenses?", listOf("30", "32", "35", "40"), "Sports", "The record of 32 consecutive title defenses is held by American wrestler Dan Gable, achieved between 1968 and 1970 at the Olympics and World Championships."),
            zh = LocalizedContent("连续卫冕冠军次数最多的记录是多少？", listOf("30", "32", "35", "40"), "体育", "32次连续卫冕的记录由美国摔跤手丹·盖布尔保持，他在1968年至1970年间的奥运会和世锦赛中实现。"),
            es = LocalizedContent("¿Cuál es el récord de más defensas consecutivas del título?", listOf("30", "32", "35", "40"), "Deportes", "El récord de 32 defensas consecutivas del título lo posee el luchador estadounidense Dan Gable, logrado entre 1968 y 1970 en los Juegos Olímpicos y Campeonatos Mundiales.")
        ),
        BilingualQuestion(
            id = 8396, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus court KO?", listOf("3s", "5s", "10s", "15s"), "Sport", "Le KO le plus rapide de l'histoire de la boxe a été réalisé par Curtis Cokes en 5 secondes, bien que ce record soit parfois contesté. Le record officiel reconnu par le Guinness World Records est de 7 secondes, établi par Mike Collins en 1947."),
            en = LocalizedContent("What is the record for the fastest KO?", listOf("3s", "5s", "10s", "15s"), "Sports", "The fastest KO in boxing history was achieved by Curtis Cokes in 5 seconds, though this record is sometimes disputed. The official record recognized by Guinness World Records is 7 seconds, set by Mike Collins in 1947."),
            zh = LocalizedContent("最快KO的记录是多少？", listOf("3秒", "5秒", "10秒", "15秒"), "体育", "拳击史上最快的KO由柯蒂斯·科克斯在5秒内完成，尽管这一记录有时存在争议。吉尼斯世界纪录认可的官方记录是7秒，由迈克·柯林斯在1947年创造。"),
            es = LocalizedContent("¿Cuál es el récord del KO más rápido?", listOf("3s", "5s", "10s", "15s"), "Deportes", "El KO más rápido en la historia del boxeo lo logró Curtis Cokes en 5 segundos, aunque este récord a veces es disputado. El récord oficial reconocido por Guinness World Records es de 7 segundos, establecido por Mike Collins en 1947.")
        ),
        BilingualQuestion(
            id = 8397, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de combats disputés en carrière?", listOf("300", "350", "400", "450"), "Sport", "Ce record est détenu par le boxeur mexicain Julio César Chávez, qui a combattu 115 fois en carrière. Le nombre de 400 combats est une exagération, car aucun boxeur professionnel n'a atteint ce total, le record réel étant de 115 combats pour Chávez."),
            en = LocalizedContent("What is the record for the number of fights in a career?", listOf("300", "350", "400", "450"), "Sports", "This record is held by Mexican boxer Julio César Chávez, who fought 115 times in his career. The number of 400 fights is an exaggeration, as no professional boxer has reached that total; the actual record is 115 fights for Chávez."),
            zh = LocalizedContent("职业生涯比赛场次最多的记录是多少？", listOf("300", "350", "400", "450"), "体育", "这一记录由墨西哥拳击手胡里奥·塞萨尔·查韦斯保持，他职业生涯共进行了115场比赛。400场比赛的数字是夸张的，因为没有职业拳击手达到过这个总数，实际记录是查韦斯的115场。"),
            es = LocalizedContent("¿Cuál es el récord de número de peleas en una carrera?", listOf("300", "350", "400", "450"), "Deportes", "Este récord lo posee el boxeador mexicano Julio César Chávez, quien peleó 115 veces en su carrera. El número de 400 peleas es una exageración, ya que ningún boxeador profesional ha alcanzado ese total; el récord real es de 115 peleas para Chávez.")
        ),
        BilingualQuestion(
            id = 8398, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a disputé le plus de combats?", listOf("Archie Moore", "Jack Dempsey", "Muhammad Ali", "Joe Louis"), "Sport", "Archie Moore détient le record du plus grand nombre de combats professionnels en boxe, avec 234 combats officiellement reconnus, s'étalant de 1935 à 1963."),
            en = LocalizedContent("Who has fought the most fights?", listOf("Archie Moore", "Jack Dempsey", "Muhammad Ali", "Joe Louis"), "Sports", "Archie Moore holds the record for the most professional boxing fights, with 234 officially recognized bouts, spanning from 1935 to 1963."),
            zh = LocalizedContent("谁参加了最多的比赛？", listOf("阿奇·穆尔", "杰克·登普西", "穆罕默德·阿里", "乔·路易斯"), "体育", "阿奇·穆尔保持着职业拳击比赛场次最多的记录，共有234场官方认可的比赛，时间跨度从1935年到1963年。"),
            es = LocalizedContent("¿Quién ha peleado más combates?", listOf("Archie Moore", "Jack Dempsey", "Muhammad Ali", "Joe Louis"), "Deportes", "Archie Moore posee el récord de más peleas de boxeo profesional, con 234 combates oficialmente reconocidos, desde 1935 hasta 1963.")
        ),
        BilingualQuestion(
            id = 8399, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre de victoires par Décision?", listOf("30", "32", "35", "38"), "Sport", "Le boxeur Julio César Chávez détient ce record avec 35 victoires par décision, principalement en raison de son style technique et de sa longévité exceptionnelle dans les rings de boxe professionnelle."),
            en = LocalizedContent("What is the record for the most wins by decision?", listOf("30", "32", "35", "38"), "Sports", "Boxer Julio César Chávez holds this record with 35 wins by decision, mainly due to his technical style and exceptional longevity in professional boxing rings."),
            zh = LocalizedContent("以判定获胜次数最多的记录是多少？", listOf("30", "32", "35", "38"), "体育", "拳击手胡里奥·塞萨尔·查韦斯以35次判定获胜保持着这一记录，这主要归功于他的技术风格和职业拳击生涯中非凡的持久力。"),
            es = LocalizedContent("¿Cuál es el récord de más victorias por decisión?", listOf("30", "32", "35", "38"), "Deportes", "El boxeador Julio César Chávez posee este récord con 35 victorias por decisión, principalmente debido a su estilo técnico y su excepcional longevidad en los rings de boxeo profesional.")
        ),
        BilingualQuestion(
            id = 8400, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année les premiers Jeux Olympiques modernes ont-ils eu lieu?", listOf("1892", "1896", "1900", "1904"), "Sport", "Organisés par Pierre de Coubertin, les premiers Jeux Olympiques modernes se sont tenus à Athènes en 1896, marquant le renouveau de la tradition antique."),
            en = LocalizedContent("In which year did the first modern Olympic Games take place?", listOf("1892", "1896", "1900", "1904"), "Sports", "Organized by Pierre de Coubertin, the first modern Olympic Games were held in Athens in 1896, marking the revival of the ancient tradition."),
            zh = LocalizedContent("第一届现代奥运会在哪一年举行？", listOf("1892", "1896", "1900", "1904"), "体育", "由皮埃尔·德·顾拜旦组织，第一届现代奥运会于1896年在雅典举行，标志着古代传统的复兴。"),
            es = LocalizedContent("¿En qué año se celebraron los primeros Juegos Olímpicos modernos?", listOf("1892", "1896", "1900", "1904"), "Deportes", "Organizados por Pierre de Coubertin, los primeros Juegos Olímpicos modernos se celebraron en Atenas en 1896, marcando el renacimiento de la tradición antigua.")
        ),
        BilingualQuestion(
            id = 8401, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays a accueilli les premiers Jeux Olympiques modernes?", listOf("France", "Royaume-Uni", "Grèce", "États-Unis"), "Sport", "Les premiers Jeux Olympiques modernes ont eu lieu à Athènes en 1896, organisés par Pierre de Coubertin, en hommage aux Jeux antiques nés en Grèce."),
            en = LocalizedContent("Which country hosted the first modern Olympic Games?", listOf("France", "United Kingdom", "Greece", "United States"), "Sports", "The first modern Olympic Games took place in Athens in 1896, organized by Pierre de Coubertin, as a tribute to the ancient Games born in Greece."),
            zh = LocalizedContent("哪个国家举办了第一届现代奥运会？", listOf("法国", "英国", "希腊", "美国"), "体育", "第一届现代奥运会于1896年在雅典举行，由皮埃尔·德·顾拜旦组织，以纪念起源于希腊的古代奥运会。"),
            es = LocalizedContent("¿Qué país acogió los primeros Juegos Olímpicos modernos?", listOf("Francia", "Reino Unido", "Grecia", "Estados Unidos"), "Deportes", "Los primeros Juegos Olímpicos modernos tuvieron lugar en Atenas en 1896, organizados por Pierre de Coubertin, en homenaje a los Juegos antiguos nacidos en Grecia.")
        ),
        BilingualQuestion(
            id = 8402, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois les Jeux Olympiques ont-ils eu lieu?", listOf("28", "29", "30", "32"), "Sport", "Les Jeux Olympiques modernes ont été organisés 29 fois entre 1896 et 2024, incluant les éditions annulées en 1916, 1940 et 1944 en raison des guerres mondiales."),
            en = LocalizedContent("How many times have the Olympic Games been held?", listOf("28", "29", "30", "32"), "Sports", "The modern Olympic Games have been held 29 times between 1896 and 2024, including the editions canceled in 1916, 1940, and 1944 due to world wars."),
            zh = LocalizedContent("奥运会举办了多少届？", listOf("28", "29", "30", "32"), "体育", "现代奥运会从1896年到2024年共举办了29届，包括因世界大战而取消的1916年、1940年和1944年。"),
            es = LocalizedContent("¿Cuántas veces se han celebrado los Juegos Olímpicos?", listOf("28", "29", "30", "32"), "Deportes", "Los Juegos Olímpicos modernos se han celebrado 29 veces entre 1896 y 2024, incluyendo las ediciones canceladas en 1916, 1940 y 1944 debido a las guerras mundiales.")
        ),
        BilingualQuestion(
            id = 8403, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel athlète a remporté le plus de médailles olympiques?", listOf("Carl Lewis", "Paavo Nurmi", "Michael Phelps", "Larisa Latynina"), "Sport", "Michael Phelps détient le record du plus grand nombre de médailles olympiques avec 28, dont 23 en or, obtenues entre 2004 et 2016 en natation."),
            en = LocalizedContent("Which athlete has won the most Olympic medals?", listOf("Carl Lewis", "Paavo Nurmi", "Michael Phelps", "Larisa Latynina"), "Sports", "Michael Phelps holds the record for the most Olympic medals with 28, including 23 gold, achieved between 2004 and 2016 in swimming."),
            zh = LocalizedContent("哪位运动员获得奥运奖牌最多？", listOf("卡尔·刘易斯", "帕沃·努尔米", "迈克尔·菲尔普斯", "拉里莎·拉蒂尼娜"), "体育", "迈克尔·菲尔普斯以28枚奥运奖牌（其中23枚金牌）保持纪录，这些奖牌是在2004年至2016年游泳项目中获得的。"),
            es = LocalizedContent("¿Qué atleta ha ganado más medallas olímpicas?", listOf("Carl Lewis", "Paavo Nurmi", "Michael Phelps", "Larisa Latynina"), "Deportes", "Michael Phelps posee el récord de más medallas olímpicas con 28, incluyendo 23 de oro, obtenidas entre 2004 y 2016 en natación.")
        ),
        BilingualQuestion(
            id = 8404, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de médailles Michael Phelps a-t-il remportées?", listOf("20", "22", "23", "28"), "Sport", "Michael Phelps détient le record du plus grand nombre de médailles olympiques, avec 23 titres obtenus entre 2004 et 2016, dont 18 en or."),
            en = LocalizedContent("How many medals has Michael Phelps won?", listOf("20", "22", "23", "28"), "Sports", "Michael Phelps holds the record for the most Olympic medals, with 23 titles achieved between 2004 and 2016, including 18 gold."),
            zh = LocalizedContent("迈克尔·菲尔普斯获得了多少枚奖牌？", listOf("20", "22", "23", "28"), "体育", "迈克尔·菲尔普斯以23枚奥运奖牌保持纪录，这些奖牌是在2004年至2016年获得的，其中18枚金牌。"),
            es = LocalizedContent("¿Cuántas medallas ha ganado Michael Phelps?", listOf("20", "22", "23", "28"), "Deportes", "Michael Phelps posee el récord de más medallas olímpicas, con 23 títulos obtenidos entre 2004 y 2016, incluyendo 18 de oro.")
        ),
        BilingualQuestion(
            id = 8405, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus grand nombre de médailles d'or?", listOf("20", "22", "23", "28"), "Sport", "Michael Phelps détient ce record avec 28 médailles olympiques, dont 23 en or, obtenues entre 2004 et 2016."),
            en = LocalizedContent("What is the record for the most gold medals?", listOf("20", "22", "23", "28"), "Sports", "Michael Phelps holds this record with 28 Olympic medals, including 23 gold, achieved between 2004 and 2016."),
            zh = LocalizedContent("金牌最多的纪录是多少？", listOf("20", "22", "23", "28"), "体育", "迈克尔·菲尔普斯以28枚奥运奖牌（其中23枚金牌）保持这一纪录，这些奖牌是在2004年至2016年获得的。"),
            es = LocalizedContent("¿Cuál es el récord de más medallas de oro?", listOf("20", "22", "23", "28"), "Deportes", "Michael Phelps posee este récord con 28 medallas olímpicas, incluyendo 23 de oro, obtenidas entre 2004 y 2016.")
        ),
        BilingualQuestion(
            id = 8406, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du plus grand nombre de médailles d'or?", listOf("Michael Phelps", "Carl Lewis", "Paavo Nurmi", "Usain Bolt"), "Sport", "Michael Phelps détient le record avec 23 médailles d'or olympiques, obtenues entre 2004 et 2016, principalement en natation."),
            en = LocalizedContent("Who holds the record for the most gold medals?", listOf("Michael Phelps", "Carl Lewis", "Paavo Nurmi", "Usain Bolt"), "Sports", "Michael Phelps holds the record with 23 Olympic gold medals, achieved between 2004 and 2016, primarily in swimming."),
            zh = LocalizedContent("谁保持着金牌最多的纪录？", listOf("迈克尔·菲尔普斯", "卡尔·刘易斯", "帕沃·努尔米", "尤塞恩·博尔特"), "体育", "迈克尔·菲尔普斯以23枚奥运金牌保持纪录，这些金牌是在2004年至2016年主要从游泳项目中获得的。"),
            es = LocalizedContent("¿Quién posee el récord de más medallas de oro?", listOf("Michael Phelps", "Carl Lewis", "Paavo Nurmi", "Usain Bolt"), "Deportes", "Michael Phelps posee el récord con 23 medallas de oro olímpicas, obtenidas entre 2004 y 2016, principalmente en natación.")
        ),
        BilingualQuestion(
            id = 8407, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de médailles d'or Michael Phelps a-t-il remportées?", listOf("20", "22", "23", "28"), "Sport", "Michael Phelps détient le record du plus grand nombre de médailles d'or olympiques, avec 23 titres remportés entre 2004 et 2016, principalement en natation."),
            en = LocalizedContent("How many gold medals has Michael Phelps won?", listOf("20", "22", "23", "28"), "Sports", "Michael Phelps holds the record for the most Olympic gold medals, with 23 titles won between 2004 and 2016, primarily in swimming."),
            zh = LocalizedContent("迈克尔·菲尔普斯获得了多少枚金牌？", listOf("20", "22", "23", "28"), "体育", "迈克尔·菲尔普斯以23枚奥运金牌保持纪录，这些金牌是在2004年至2016年主要从游泳项目中获得的。"),
            es = LocalizedContent("¿Cuántas medallas de oro ha ganado Michael Phelps?", listOf("20", "22", "23", "28"), "Deportes", "Michael Phelps posee el récord de más medallas de oro olímpicas, con 23 títulos ganados entre 2004 y 2016, principalmente en natación.")
        ),
        BilingualQuestion(
            id = 8408, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus jeune médaillé d'or olympique?", listOf("10", "11", "12", "13"), "Sport", "Le record est détenu par le plongeur chinois Fu Mingxia, qui a remporté l'or aux Jeux de Barcelone en 1992 à l'âge de 13 ans, mais la catégorie d'âge officielle est de 12 ans pour certains sports comme la gymnastique."),
            en = LocalizedContent("What is the record for the youngest Olympic gold medalist?", listOf("10", "11", "12", "13"), "Sports", "The record is held by Chinese diver Fu Mingxia, who won gold at the 1992 Barcelona Games at age 13, but the official age category is 12 for some sports like gymnastics."),
            zh = LocalizedContent("最年轻的奥运金牌得主纪录是多少岁？", listOf("10", "11", "12", "13"), "体育", "该纪录由中国跳水运动员伏明霞保持，她在1992年巴塞罗那奥运会上以13岁之龄夺得金牌，但某些项目如体操的官方年龄类别是12岁。"),
            es = LocalizedContent("¿Cuál es el récord del medallista de oro olímpico más joven?", listOf("10", "11", "12", "13"), "Deportes", "El récord lo posee la clavadista china Fu Mingxia, quien ganó el oro en los Juegos de Barcelona 1992 a los 13 años, pero la categoría de edad oficial es de 12 años para algunos deportes como la gimnasia.")
        ),
        BilingualQuestion(
            id = 8409, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui est le plus jeune médaillé d'or olympique?", listOf("Dimitrios Loundras", "Dimitris Loundras", "Kyoko Iwasaki", "Marjorie Gestring"), "Sport", "Marjorie Gestring a remporté l'or en plongeon aux Jeux de Berlin en 1936 à l'âge de 13 ans, ce qui en fait la plus jeune médaillée d'or olympique de l'histoire."),
            en = LocalizedContent("Who is the youngest Olympic gold medalist?", listOf("Dimitrios Loundras", "Dimitris Loundras", "Kyoko Iwasaki", "Marjorie Gestring"), "Sports", "Marjorie Gestring won gold in diving at the 1936 Berlin Games at age 13, making her the youngest Olympic gold medalist in history."),
            zh = LocalizedContent("谁是最年轻的奥运金牌得主？", listOf("迪米特里奥斯·隆德拉斯", "迪米特里斯·隆德拉斯", "岩崎恭子", "玛乔丽·格斯特林"), "体育", "玛乔丽·格斯特林在1936年柏林奥运会上以13岁之龄获得跳水金牌，成为历史上最年轻的奥运金牌得主。"),
            es = LocalizedContent("¿Quién es el medallista de oro olímpico más joven?", listOf("Dimitrios Loundras", "Dimitris Loundras", "Kyoko Iwasaki", "Marjorie Gestring"), "Deportes", "Marjorie Gestring ganó el oro en clavados en los Juegos de Berlín 1936 a los 13 años, convirtiéndose en la medallista de oro olímpica más joven de la historia.")
        ),
    )

    private fun part7(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 8410, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du plus vieux médaillé d'or olympique?", listOf("70", "72", "74", "80"), "Sport", "Le tireur suédois Oscar Swahn a remporté sa dernière médaille d'or olympique en 1912 à l'âge de 64 ans, mais le record est détenu par le tireur suédois Oscar Swahn (non, c'est 74 ans) : en réalité, le record du plus vieux médaillé d'or olympique est de 74 ans, détenu par le cavalier suédois Carl Magnus Swahn (ou plutôt par le tireur Oscar Swahn à 64 ans, mais le record à 74 ans est celui du cav..."),
            en = LocalizedContent("What is the record for the oldest Olympic gold medalist?", listOf("70", "72", "74", "80"), "Sports", "Swedish shooter Oscar Swahn won his last Olympic gold medal in 1912 at age 64, but the record is held by Swedish shooter Oscar Swahn (no, it's 74 years): actually, the record for the oldest Olympic gold medalist is 74 years, held by Swedish equestrian Carl Magnus Swahn (or rather by shooter Oscar Swahn at 64, but the record at 74 is that of...)."),
            zh = LocalizedContent("最年长的奥运金牌得主的纪录是多少？", listOf("70", "72", "74", "80"), "体育", "瑞典射击运动员奥斯卡·斯瓦恩在1912年以64岁之龄赢得最后一枚奥运金牌，但纪录保持者是瑞典射击运动员奥斯卡·斯瓦恩（不，是74岁）：实际上，最年长奥运金牌得主的纪录是74岁，由瑞典马术运动员卡尔·马格努斯·斯瓦恩（或者更确切地说，射击运动员奥斯卡·斯瓦恩在64岁时，但74岁的纪录是...）保持。"),
            es = LocalizedContent("¿Cuál es el récord del medallista de oro olímpico más longevo?", listOf("70", "72", "74", "80"), "Deportes", "El tirador sueco Oscar Swahn ganó su última medalla de oro olímpica en 1912 a los 64 años, pero el récord lo tiene el tirador sueco Oscar Swahn (no, son 74 años): en realidad, el récord del medallista de oro olímpico más longevo es de 74 años, en poder del jinete sueco Carl Magnus Swahn (o más bien del tirador Oscar Swahn a los 64 años, pero el récord a los 74 es el de...).")
        ),
        BilingualQuestion(
            id = 8411, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui est le plus vieux médaillé d'or olympique?", listOf("Oscar Swahn", "Dimitrios Loundras", "Sushi Marjorie Gestring", "Kyoko Iwasaki"), "Sport", "Le tireur sportif suédois Oscar Swahn a remporté sa dernière médaille d'or olympique à 64 ans lors des Jeux de 1912 à Stockholm, ce qui fait de lui le médaillé d'or le plus âgé de l'histoire des Jeux olympiques modernes."),
            en = LocalizedContent("Who is the oldest Olympic gold medalist?", listOf("Oscar Swahn", "Dimitrios Loundras", "Sushi Marjorie Gestring", "Kyoko Iwasaki"), "Sports", "Swedish sport shooter Oscar Swahn won his last Olympic gold medal at age 64 at the 1912 Stockholm Games, making him the oldest gold medalist in modern Olympic history."),
            zh = LocalizedContent("谁是最年长的奥运金牌得主？", listOf("奥斯卡·斯瓦恩", "迪米特里奥斯·隆德拉斯", "苏西·玛乔丽·格斯特林", "岩崎恭子"), "体育", "瑞典射击运动员奥斯卡·斯瓦恩在1912年斯德哥尔摩奥运会上以64岁之龄赢得最后一枚奥运金牌，使他成为现代奥运史上最年长的金牌得主。"),
            es = LocalizedContent("¿Quién es el medallista de oro olímpico más longevo?", listOf("Oscar Swahn", "Dimitrios Loundras", "Sushi Marjorie Gestring", "Kyoko Iwasaki"), "Deportes", "El tirador deportivo sueco Oscar Swahn ganó su última medalla de oro olímpica a los 64 años en los Juegos de 1912 en Estocolmo, lo que lo convierte en el medallista de oro más longevo en la historia de los Juegos Olímpicos modernos.")
        ),
        BilingualQuestion(
            id = 8412, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois les Jeux Olympiques d'été ont-ils été annulés?", listOf("1", "2", "3", "4"), "Sport", "Les Jeux Olympiques d'été ont été annulés trois fois en raison des guerres mondiales : en 1916 (Berlin), 1940 (Tokyo/Helsinki) et 1944 (Londres)."),
            en = LocalizedContent("How many times have the Summer Olympic Games been canceled?", listOf("1", "2", "3", "4"), "Sports", "The Summer Olympic Games have been canceled three times due to world wars: in 1916 (Berlin), 1940 (Tokyo/Helsinki), and 1944 (London)."),
            zh = LocalizedContent("夏季奥运会曾被取消过多少次？", listOf("1", "2", "3", "4"), "体育", "夏季奥运会因世界大战被取消过三次：1916年（柏林）、1940年（东京/赫尔辛基）和1944年（伦敦）。"),
            es = LocalizedContent("¿Cuántas veces se han cancelado los Juegos Olímpicos de Verano?", listOf("1", "2", "3", "4"), "Deportes", "Los Juegos Olímpicos de Verano se han cancelado tres veces debido a las guerras mundiales: en 1916 (Berlín), 1940 (Tokio/Helsinki) y 1944 (Londres).")
        ),
        BilingualQuestion(
            id = 8413, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année les Jeux Olympiques ont-ils été annulés?", listOf("1940, 1944", "1916, 1940, 1944", "1920, 1940, 1944", "1940, 1944, 1948"), "Sport", "Les Jeux Olympiques ont été annulés en 1916 à cause de la Première Guerre mondiale, puis en 1940 et 1944 en raison de la Seconde Guerre mondiale."),
            en = LocalizedContent("In which years were the Olympic Games canceled?", listOf("1940, 1944", "1916, 1940, 1944", "1920, 1940, 1944", "1940, 1944, 1948"), "Sports", "The Olympic Games were canceled in 1916 due to World War I, and then in 1940 and 1944 due to World War II."),
            zh = LocalizedContent("奥运会在哪些年份被取消？", listOf("1940, 1944", "1916, 1940, 1944", "1920, 1940, 1944", "1940, 1944, 1948"), "体育", "奥运会因第一次世界大战在1916年被取消，随后因第二次世界大战在1940年和1944年被取消。"),
            es = LocalizedContent("¿En qué años se cancelaron los Juegos Olímpicos?", listOf("1940, 1944", "1916, 1940, 1944", "1920, 1940, 1944", "1940, 1944, 1948"), "Deportes", "Los Juegos Olímpicos se cancelaron en 1916 debido a la Primera Guerra Mundial, y luego en 1940 y 1944 debido a la Segunda Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 8414, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel athlète a remporté le plus de médailles d'or consécutives?", listOf("Usain Bolt", "Carl Lewis", "Paavo Nurmi", "Ray Ewry"), "Sport", "Ray Ewry, spécialiste des sauts sans élan, a remporté 8 médailles d'or aux Jeux olympiques de 1900 à 1908, un record de titres consécutifs dans l'histoire olympique."),
            en = LocalizedContent("Which athlete has won the most consecutive gold medals?", listOf("Usain Bolt", "Carl Lewis", "Paavo Nurmi", "Ray Ewry"), "Sports", "Ray Ewry, a specialist in standing jumps, won 8 gold medals at the Olympic Games from 1900 to 1908, a record of consecutive titles in Olympic history."),
            zh = LocalizedContent("哪位运动员赢得了最多的连续金牌？", listOf("尤塞恩·博尔特", "卡尔·刘易斯", "帕沃·努尔米", "雷·尤里"), "体育", "雷·尤里，立定跳远专家，在1900年至1908年的奥运会上赢得了8枚金牌，这是奥运史上连续夺冠的纪录。"),
            es = LocalizedContent("¿Qué atleta ha ganado más medallas de oro consecutivas?", listOf("Usain Bolt", "Carl Lewis", "Paavo Nurmi", "Ray Ewry"), "Deportes", "Ray Ewry, especialista en saltos sin impulso, ganó 8 medallas de oro en los Juegos Olímpicos de 1900 a 1908, un récord de títulos consecutivos en la historia olímpica.")
        ),
        BilingualQuestion(
            id = 8415, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de médailles d'or Ray Ewry a-t-il remportées?", listOf("6", "8", "10", "12"), "Sport", "Ray Ewry, atteint de poliomyélite dans son enfance, a dominé les sauts sans élan aux Jeux olympiques de 1900 à 1908, remportant 10 médailles d'or."),
            en = LocalizedContent("How many gold medals did Ray Ewry win?", listOf("6", "8", "10", "12"), "Sports", "Ray Ewry, who had polio as a child, dominated the standing jumps at the Olympic Games from 1900 to 1908, winning 10 gold medals."),
            zh = LocalizedContent("雷·尤里赢得了多少枚金牌？", listOf("6", "8", "10", "12"), "体育", "雷·尤里童年患有小儿麻痹症，在1900年至1908年的奥运会上称霸立定跳远项目，赢得了10枚金牌。"),
            es = LocalizedContent("¿Cuántas medallas de oro ganó Ray Ewry?", listOf("6", "8", "10", "12"), "Deportes", "Ray Ewry, que padeció polio en su infancia, dominó los saltos sin impulso en los Juegos Olímpicos de 1900 a 1908, ganando 10 medallas de oro.")
        ),
        BilingualQuestion(
            id = 8416, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de participations olympiques?", listOf("4", "5", "6", "7"), "Sport", "Plusieurs athlètes ont participé à six Jeux Olympiques, comme le cavalier canadien Ian Millar ou la judokate française Teddy Riner, ce qui constitue le record actuel."),
            en = LocalizedContent("What is the record for the most Olympic participations?", listOf("4", "5", "6", "7"), "Sports", "Several athletes have participated in six Olympic Games, such as Canadian equestrian Ian Millar or French judoka Teddy Riner, which is the current record."),
            zh = LocalizedContent("参加奥运会次数最多的纪录是多少？", listOf("4", "5", "6", "7"), "体育", "多位运动员参加了六届奥运会，如加拿大马术运动员伊恩·米勒或法国柔道运动员泰迪·里内，这是目前的纪录。"),
            es = LocalizedContent("¿Cuál es el récord de mayor número de participaciones olímpicas?", listOf("4", "5", "6", "7"), "Deportes", "Varios atletas han participado en seis Juegos Olímpicos, como el jinete canadiense Ian Millar o la judoka francesa Teddy Riner, lo que constituye el récord actual.")
        ),
        BilingualQuestion(
            id = 8417, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a participé le plus aux Jeux Olympiques?", listOf("Ian Thorpe", "Vitaly Scherbo", "Ghislain Toro", "Carl Lewis"), "Sport", "Le cavalier chilien Ghislain Toro détient le record du plus grand nombre de participations aux Jeux Olympiques, avec 13 éditions entre 1972 et 2020."),
            en = LocalizedContent("Who has participated in the most Olympic Games?", listOf("Ian Thorpe", "Vitaly Scherbo", "Ghislain Toro", "Carl Lewis"), "Sports", "Chilean equestrian Ghislain Toro holds the record for the most Olympic Games participations, with 13 editions between 1972 and 2020."),
            zh = LocalizedContent("谁参加奥运会的次数最多？", listOf("伊恩·索普", "维塔利·谢尔博", "吉斯兰·托罗", "卡尔·刘易斯"), "体育", "智利马术运动员吉斯兰·托罗保持着参加奥运会次数最多的纪录，从1972年到2020年共参加了13届。"),
            es = LocalizedContent("¿Quién ha participado en más Juegos Olímpicos?", listOf("Ian Thorpe", "Vitaly Scherbo", "Ghislain Toro", "Carl Lewis"), "Deportes", "El jinete chileno Ghislain Toro tiene el récord de mayor número de participaciones en los Juegos Olímpicos, con 13 ediciones entre 1972 y 2020.")
        ),
        BilingualQuestion(
            id = 8418, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois Ian Thorpe a-t-il participé?", listOf("3", "4", "5", "6"), "Sport", "Ian Thorpe a participé à quatre éditions des Jeux Olympiques : Sydney 2000, Athènes 2004, Pékin 2008 et Londres 2012, totalisant cinq médailles d'or."),
            en = LocalizedContent("How many times did Ian Thorpe participate?", listOf("3", "4", "5", "6"), "Sports", "Ian Thorpe participated in four editions of the Olympic Games: Sydney 2000, Athens 2004, Beijing 2008, and London 2012, totaling five gold medals."),
            zh = LocalizedContent("伊恩·索普参加了多少次？", listOf("3", "4", "5", "6"), "体育", "伊恩·索普参加了四届奥运会：2000年悉尼、2004年雅典、2008年北京和2012年伦敦，共获得五枚金牌。"),
            es = LocalizedContent("¿Cuántas veces participó Ian Thorpe?", listOf("3", "4", "5", "6"), "Deportes", "Ian Thorpe participó en cuatro ediciones de los Juegos Olímpicos: Sídney 2000, Atenas 2004, Pekín 2008 y Londres 2012, totalizando cinco medallas de oro.")
        ),
        BilingualQuestion(
            id = 8419, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a accueilli les plus de Jeux Olympiques d'été?", listOf("France", "États-Unis", "Royaume-Uni", "Australie"), "Sport", "Les États-Unis ont accueilli les Jeux Olympiques d'été à quatre reprises : Saint-Louis en 1904, Los Angeles en 1932 et 1984, et Atlanta en 1996, ce qui en fait le pays hôte le plus fréquent."),
            en = LocalizedContent("Which country has hosted the most Summer Olympic Games?", listOf("France", "United States", "United Kingdom", "Australia"), "Sports", "The United States has hosted the Summer Olympic Games four times: St. Louis in 1904, Los Angeles in 1932 and 1984, and Atlanta in 1996, making it the most frequent host country."),
            zh = LocalizedContent("哪个国家举办夏季奥运会的次数最多？", listOf("法国", "美国", "英国", "澳大利亚"), "体育", "美国举办了四次夏季奥运会：1904年圣路易斯、1932年和1984年洛杉矶、1996年亚特兰大，是举办次数最多的国家。"),
            es = LocalizedContent("¿Qué país ha acogido más Juegos Olímpicos de Verano?", listOf("Francia", "Estados Unidos", "Reino Unido", "Australia"), "Deportes", "Estados Unidos ha acogido los Juegos Olímpicos de Verano en cuatro ocasiones: San Luis en 1904, Los Ángeles en 1932 y 1984, y Atlanta en 1996, lo que lo convierte en el país anfitrión más frecuente.")
        ),
        BilingualQuestion(
            id = 8420, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de médailles en une journée olympique?", listOf("5", "6", "7", "8"), "Sport", "Ce record est détenu par le nageur américain Michael Phelps, qui a remporté 7 médailles (dont 5 en or) lors d'une seule journée des Jeux olympiques de 2008 à Pékin."),
            en = LocalizedContent("What is the record for the number of medals in a single Olympic day?", listOf("5", "6", "7", "8"), "Sports", "This record is held by American swimmer Michael Phelps, who won 7 medals (including 5 gold) in a single day at the 2008 Beijing Olympics."),
            zh = LocalizedContent("单届奥运会一天内获得奖牌数量的纪录是多少？", listOf("5", "6", "7", "8"), "体育", "这一纪录由美国游泳运动员迈克尔·菲尔普斯保持，他在2008年北京奥运会的一天内获得了7枚奖牌（其中5枚金牌）。"),
            es = LocalizedContent("¿Cuál es el récord de medallas en un solo día olímpico?", listOf("5", "6", "7", "8"), "Deportes", "Este récord lo posee el nadador estadounidense Michael Phelps, quien ganó 7 medallas (5 de oro) en un solo día de los Juegos Olímpicos de Pekín 2008.")
        ),
        BilingualQuestion(
            id = 8421, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de médailles remportées par un pays?", listOf("200", "250", "300", "350"), "Sport", "Les États-Unis ont accumulé plus de 3 000 médailles olympiques au total, mais le record de 300 médailles lors d’une seule édition est détenu par la Chine aux Jeux paralympiques de 2022."),
            en = LocalizedContent("What is the record for the number of medals won by a country?", listOf("200", "250", "300", "350"), "Sports", "The United States has accumulated over 3,000 Olympic medals in total, but the record of 300 medals in a single edition is held by China at the 2022 Paralympic Games."),
            zh = LocalizedContent("一个国家获得奖牌数量的纪录是多少？", listOf("200", "250", "300", "350"), "体育", "美国累计获得超过3000枚奥运奖牌，但单届300枚奖牌的纪录由中国在2022年残奥会上保持。"),
            es = LocalizedContent("¿Cuál es el récord de medallas ganadas por un país?", listOf("200", "250", "300", "350"), "Deportes", "Estados Unidos ha acumulado más de 3.000 medallas olímpicas en total, pero el récord de 300 medallas en una sola edición lo tiene China en los Juegos Paralímpicos de 2022.")
        ),
        BilingualQuestion(
            id = 8422, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a remporté le plus de médailles olympiques?", listOf("Royaume-Uni", "Russie", "États-Unis", "Allemagne"), "Sport", "Les États-Unis dominent le classement historique des médailles olympiques avec plus de 2 600 médailles, grâce à leur forte participation et leurs performances dans des sports comme l'athlétisme et la natation."),
            en = LocalizedContent("Which country has won the most Olympic medals?", listOf("United Kingdom", "Russia", "United States", "Germany"), "Sports", "The United States dominates the historical Olympic medal table with over 2,600 medals, thanks to strong participation and performances in sports like athletics and swimming."),
            zh = LocalizedContent("哪个国家获得的奥运奖牌最多？", listOf("英国", "俄罗斯", "美国", "德国"), "体育", "美国以超过2600枚奖牌在历史奥运奖牌榜上领先，得益于其在田径和游泳等项目上的强劲参与和表现。"),
            es = LocalizedContent("¿Qué país ha ganado más medallas olímpicas?", listOf("Reino Unido", "Rusia", "Estados Unidos", "Alemania"), "Deportes", "Estados Unidos domina la tabla histórica de medallas olímpicas con más de 2.600 medallas, gracias a su fuerte participación y rendimiento en deportes como atletismo y natación.")
        ),
        BilingualQuestion(
            id = 8423, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de médailles d'or remportées par un pays?", listOf("100", "150", "200", "250"), "Sport", "Les États-Unis ont remporté 200 médailles d'or aux Jeux olympiques d'hiver de 2022 à Pékin, établissant un record pour le plus grand nombre de médailles d'or obtenues par un pays lors d'une seule édition des Jeux."),
            en = LocalizedContent("What is the record for the number of gold medals won by a country?", listOf("100", "150", "200", "250"), "Sports", "The United States won 200 gold medals at the 2022 Winter Olympics in Beijing, setting a record for the most gold medals by a country in a single edition of the Games."),
            zh = LocalizedContent("一个国家获得金牌数量的纪录是多少？", listOf("100", "150", "200", "250"), "体育", "美国在2022年北京冬奥会上获得200枚金牌，创下单个国家在一届奥运会上获得最多金牌的纪录。"),
            es = LocalizedContent("¿Cuál es el récord de medallas de oro ganadas por un país?", listOf("100", "150", "200", "250"), "Deportes", "Estados Unidos ganó 200 medallas de oro en los Juegos Olímpicos de Invierno de Pekín 2022, estableciendo un récord de más medallas de oro obtenidas por un país en una sola edición de los Juegos.")
        ),
        BilingualQuestion(
            id = 8424, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a remporté le plus de médailles d'or?", listOf("Russie", "Allemagne", "États-Unis", "Royaume-Uni"), "Sport", "Les États-Unis dominent le classement historique des médailles d'or aux Jeux Olympiques, avec plus de 1 000 titres obtenus depuis 1896, loin devant les autres nations."),
            en = LocalizedContent("Which country has won the most gold medals?", listOf("Russia", "Germany", "United States", "United Kingdom"), "Sports", "The United States dominates the historical gold medal table at the Olympic Games, with over 1,000 titles since 1896, far ahead of other nations."),
            zh = LocalizedContent("哪个国家获得的金牌最多？", listOf("俄罗斯", "德国", "美国", "英国"), "体育", "美国在奥运会历史金牌榜上领先，自1896年以来获得超过1000枚金牌，远超其他国家。"),
            es = LocalizedContent("¿Qué país ha ganado más medallas de oro?", listOf("Rusia", "Alemania", "Estados Unidos", "Reino Unido"), "Deportes", "Estados Unidos domina la tabla histórica de medallas de oro en los Juegos Olímpicos, con más de 1.000 títulos desde 1896, muy por delante de otras naciones.")
        ),
        BilingualQuestion(
            id = 8425, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de fois Usain Bolt a-t-il remporté l'or au 100m?", listOf("2", "3", "4", "5"), "Sport", "Usain Bolt a remporté l'or olympique du 100 mètres aux Jeux de Pékin en 2008, de Londres en 2012 et de Rio en 2016, soit trois titres consécutifs."),
            en = LocalizedContent("How many times has Usain Bolt won gold in the 100m?", listOf("2", "3", "4", "5"), "Sports", "Usain Bolt won Olympic gold in the 100 meters at the 2008 Beijing Games, 2012 London Games, and 2016 Rio Games, a total of three consecutive titles."),
            zh = LocalizedContent("尤塞恩·博尔特在100米项目上获得过多少次金牌？", listOf("2", "3", "4", "5"), "体育", "尤塞恩·博尔特在2008年北京奥运会、2012年伦敦奥运会和2016年里约奥运会上获得了100米金牌，共三次连续夺冠。"),
            es = LocalizedContent("¿Cuántas veces ha ganado Usain Bolt el oro en los 100m?", listOf("2", "3", "4", "5"), "Deportes", "Usain Bolt ganó el oro olímpico en los 100 metros en los Juegos de Pekín 2008, Londres 2012 y Río 2016, tres títulos consecutivos.")
        ),
        BilingualQuestion(
            id = 8426, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record olympique du 100m hommes?", listOf("9.58s", "9.63s", "9.69s", "9.95s"), "Sport", "Ce record a été établi par le Jamaïcain Usain Bolt lors des Jeux olympiques de Pékin en 2008, où il a couru le 100 mètres en 9,69 secondes, mais le record officiel est de 9,63 secondes, réalisé aux Jeux de Londres en 2012."),
            en = LocalizedContent("What is the Olympic record for the men's 100m?", listOf("9.58s", "9.63s", "9.69s", "9.95s"), "Sports", "This record was set by Jamaican Usain Bolt at the 2008 Beijing Olympics, where he ran 100 meters in 9.69 seconds, but the official record is 9.63 seconds, achieved at the 2012 London Games."),
            zh = LocalizedContent("男子100米奥运纪录是多少？", listOf("9.58秒", "9.63秒", "9.69秒", "9.95秒"), "体育", "这一纪录由牙买加选手尤塞恩·博尔特在2008年北京奥运会上创造，当时他跑出9.69秒，但官方纪录是9.63秒，是在2012年伦敦奥运会上实现的。"),
            es = LocalizedContent("¿Cuál es el récord olímpico de los 100m masculinos?", listOf("9.58s", "9.63s", "9.69s", "9.95s"), "Deportes", "Este récord fue establecido por el jamaicano Usain Bolt en los Juegos Olímpicos de Pekín 2008, donde corrió los 100 metros en 9,69 segundos, pero el récord oficial es de 9,63 segundos, logrado en los Juegos de Londres 2012.")
        ),
        BilingualQuestion(
            id = 8427, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui détient le record olympique du 100m hommes?", listOf("Usain Bolt", "Yohan Blake", "Tyson Gay", "Donovan Bailey"), "Sport", "Usain Bolt a établi le record olympique du 100 mètres hommes en 9,63 secondes lors des Jeux de Londres en 2012, performance qu'il n'a pas améliorée par la suite."),
            en = LocalizedContent("Who holds the Olympic record for the men's 100m?", listOf("Usain Bolt", "Yohan Blake", "Tyson Gay", "Donovan Bailey"), "Sports", "Usain Bolt set the Olympic record for the men's 100 meters at 9.63 seconds at the 2012 London Games, a performance he did not improve upon later."),
            zh = LocalizedContent("谁保持着男子100米奥运纪录？", listOf("尤塞恩·博尔特", "约汉·布雷克", "泰森·盖伊", "多诺万·贝利"), "体育", "尤塞恩·博尔特在2012年伦敦奥运会上以9.63秒创造了男子100米奥运纪录，此后他未能再提高这一成绩。"),
            es = LocalizedContent("¿Quién posee el récord olímpico de los 100m masculinos?", listOf("Usain Bolt", "Yohan Blake", "Tyson Gay", "Donovan Bailey"), "Deportes", "Usain Bolt estableció el récord olímpico de los 100 metros masculinos en 9,63 segundos en los Juegos de Londres 2012, una marca que no mejoró posteriormente.")
        ),
        BilingualQuestion(
            id = 8428, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record olympique du marathon hommes?", listOf("2:03:23", "2:06:32", "2:08:16", "2:10:00"), "Sport", "Le record olympique du marathon masculin a été établi par le Kényan Samuel Wanjiru aux Jeux de Pékin en 2008, avec un temps de 2:06:32. Cette performance reste inégalée car les parcours olympiques varient et ne sont pas toujours aussi rapides."),
            en = LocalizedContent("What is the Olympic record for the men's marathon?", listOf("2:03:23", "2:06:32", "2:08:16", "2:10:00"), "Sports", "The Olympic record for the men's marathon was set by Kenyan Samuel Wanjiru at the 2008 Beijing Games, with a time of 2:06:32. This performance remains unmatched as Olympic courses vary and are not always as fast."),
            zh = LocalizedContent("男子马拉松奥运纪录是多少？", listOf("2:03:23", "2:06:32", "2:08:16", "2:10:00"), "体育", "男子马拉松奥运纪录由肯尼亚选手塞缪尔·万吉鲁在2008年北京奥运会上创造，成绩为2:06:32。这一成绩至今未被打破，因为奥运赛道各不相同，并非总是那么快。"),
            es = LocalizedContent("¿Cuál es el récord olímpico del maratón masculino?", listOf("2:03:23", "2:06:32", "2:08:16", "2:10:00"), "Deportes", "El récord olímpico del maratón masculino fue establecido por el keniano Samuel Wanjiru en los Juegos de Pekín 2008, con un tiempo de 2:06:32. Esta marca sigue imbatida ya que los recorridos olímpicos varían y no siempre son tan rápidos.")
        ),
        BilingualQuestion(
            id = 8429, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record olympique du marathon?", listOf("Eliud Kipchoge", "Samuel Wanjiru", "Yuri Kakorin", "Gezahegne Abera"), "Sport", "Eliud Kipchoge a établi le record olympique du marathon en 2h08m38s lors des Jeux de Tokyo en 2021, où il a remporté la médaille d'or."),
            en = LocalizedContent("Who holds the Olympic record for the marathon?", listOf("Eliud Kipchoge", "Samuel Wanjiru", "Yuri Kakorin", "Gezahegne Abera"), "Sports", "Eliud Kipchoge set the Olympic record for the marathon at 2h08m38s at the 2021 Tokyo Games, where he won the gold medal."),
            zh = LocalizedContent("谁保持着马拉松奥运纪录？", listOf("埃利乌德·基普乔格", "塞缪尔·万吉鲁", "尤里·卡科林", "格扎赫涅·阿贝拉"), "体育", "埃利乌德·基普乔格在2021年东京奥运会上以2小时08分38秒创造了马拉松奥运纪录，并夺得金牌。"),
            es = LocalizedContent("¿Quién posee el récord olímpico del maratón?", listOf("Eliud Kipchoge", "Samuel Wanjiru", "Yuri Kakorin", "Gezahegne Abera"), "Deportes", "Eliud Kipchoge estableció el récord olímpico del maratón en 2h08m38s durante los Juegos de Tokio 2021, donde ganó la medalla de oro.")
        ),
    )
}
