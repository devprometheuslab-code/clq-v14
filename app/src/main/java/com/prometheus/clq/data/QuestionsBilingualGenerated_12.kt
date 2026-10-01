package com.prometheus.clq.data

import com.prometheus.clq.model.BilingualQuestion
import com.prometheus.clq.model.Difficulty
import com.prometheus.clq.model.Language
import com.prometheus.clq.model.LocalizedContent
import com.prometheus.clq.model.Question

/** Auto-generated batch 12 : 500 questions bilingues */
object QuestionsBilingualGenerated_12 {
    fun get(lang: Language = Language.FR): List<Question> = list.map { it.toQuestion(lang) }

    val list: List<BilingualQuestion> by lazy {
        part1() + part2() + part3() + part4() + part5() + part6() + part7()
    }

    private fun part1(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 12029, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel gaz noble a été découvert le premier?", listOf("Hélium", "Néon", "Argon", "Radon"), "Science", "L'hélium a été identifié en 1868 lors d'une éclipse solaire, avant d'être isolé sur Terre en 1895, ce qui en fait le premier gaz noble découvert."),
            en = LocalizedContent("Which noble gas was discovered first?", listOf("Helium", "Neon", "Argon", "Radon"), "Science", "Helium was identified in 1868 during a solar eclipse, before being isolated on Earth in 1895, making it the first noble gas discovered."),
            zh = LocalizedContent("哪种稀有气体最先被发现？", listOf("氦", "氖", "氩", "氡"), "科学", "氦于1868年在一次日食中被发现，随后于1895年在地球上被分离出来，成为第一种被发现的稀有气体。"),
            es = LocalizedContent("¿Qué gas noble fue descubierto primero?", listOf("Helio", "Neón", "Argón", "Radón"), "Ciencia", "El helio fue identificado en 1868 durante un eclipse solar, antes de ser aislado en la Tierra en 1895, lo que lo convierte en el primer gas noble descubierto.")
        ),
        BilingualQuestion(
            id = 12030, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La photosynthèse produit quel gaz comme déchet?", listOf("Azote", "Monoxyde de carbone", "Oxygène", "Dioxyde de carbone"), "Science", "La photosynthèse utilise le dioxyde de carbone et l'eau pour produire du glucose, libérant de l'oxygène comme sous-produit gazeux."),
            en = LocalizedContent("Photosynthesis produces which gas as a waste product?", listOf("Nitrogen", "Carbon monoxide", "Oxygen", "Carbon dioxide"), "Science", "Photosynthesis uses carbon dioxide and water to produce glucose, releasing oxygen as a gaseous byproduct."),
            zh = LocalizedContent("光合作用产生哪种气体作为废物？", listOf("氮气", "一氧化碳", "氧气", "二氧化碳"), "科学", "光合作用利用二氧化碳和水生成葡萄糖，并释放氧气作为气体副产品。"),
            es = LocalizedContent("¿Qué gas produce la fotosíntesis como desecho?", listOf("Nitrógeno", "Monóxido de carbono", "Oxígeno", "Dióxido de carbono"), "Ciencia", "La fotosíntesis utiliza dióxido de carbono y agua para producir glucosa, liberando oxígeno como subproducto gaseoso.")
        ),
        BilingualQuestion(
            id = 12031, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le point de fusion du tungstène?", listOf("2500°C", "3200°C", "3422°C", "4000°C"), "Science", "Le tungstène possède le point de fusion le plus élevé de tous les métaux, atteignant 3422°C, ce qui le rend idéal pour les filaments d'ampoules et les applications à haute température."),
            en = LocalizedContent("What is the melting point of tungsten?", listOf("2500°C", "3200°C", "3422°C", "4000°C"), "Science", "Tungsten has the highest melting point of all metals, reaching 3422°C, making it ideal for light bulb filaments and high-temperature applications."),
            zh = LocalizedContent("钨的熔点是多少？", listOf("2500°C", "3200°C", "3422°C", "4000°C"), "科学", "钨是所有金属中熔点最高的，达到3422°C，使其成为灯泡灯丝和高温应用的理想材料。"),
            es = LocalizedContent("¿Cuál es el punto de fusión del tungsteno?", listOf("2500°C", "3200°C", "3422°C", "4000°C"), "Ciencia", "El tungsteno tiene el punto de fusión más alto de todos los metales, alcanzando 3422°C, lo que lo hace ideal para filamentos de bombillas y aplicaciones de alta temperatura.")
        ),
        BilingualQuestion(
            id = 12032, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le paradoxe EPR a été proposé par?", listOf("Einstein, Bohr, Rosen", "Einstein, Podolsky, Rosen", "Heisenberg, Einstein, Dirac", "Schrödinger, Einstein, Planck"), "Science", "Le paradoxe EPR tire son nom des initiales de ses trois auteurs : Albert Einstein, Boris Podolsky et Nathan Rosen, qui l'ont formulé en 1935 pour critiquer l'interprétation de la mécanique quantique."),
            en = LocalizedContent("The EPR paradox was proposed by?", listOf("Einstein, Bohr, Rosen", "Einstein, Podolsky, Rosen", "Heisenberg, Einstein, Dirac", "Schrödinger, Einstein, Planck"), "Science", "The EPR paradox is named after the initials of its three authors: Albert Einstein, Boris Podolsky, and Nathan Rosen, who formulated it in 1935 to critique the interpretation of quantum mechanics."),
            zh = LocalizedContent("EPR悖论是由谁提出的？", listOf("爱因斯坦、玻尔、罗森", "爱因斯坦、波多尔斯基、罗森", "海森堡、爱因斯坦、狄拉克", "薛定谔、爱因斯坦、普朗克"), "科学", "EPR悖论以其三位作者名字的首字母命名：阿尔伯特·爱因斯坦、鲍里斯·波多尔斯基和内森·罗森，他们于1935年提出该悖论以批评量子力学的解释。"),
            es = LocalizedContent("¿Quién propuso la paradoja EPR?", listOf("Einstein, Bohr, Rosen", "Einstein, Podolsky, Rosen", "Heisenberg, Einstein, Dirac", "Schrödinger, Einstein, Planck"), "Ciencia", "La paradoja EPR recibe su nombre de las iniciales de sus tres autores: Albert Einstein, Boris Podolsky y Nathan Rosen, quienes la formularon en 1935 para criticar la interpretación de la mecánica cuántica.")
        ),
        BilingualQuestion(
            id = 12033, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'équation E=mc² signifie que?", listOf("Énergie = masse × chaleur²", "Énergie = masse × vitesse de la lumière²", "Force = masse × accélération", "Puissance = masse × c²"), "Science", "Cette équation de la relativité restreinte d'Einstein établit l'équivalence entre masse et énergie, montrant qu'une petite masse peut libérer une énergie immense, comme dans les réactions nucléaires."),
            en = LocalizedContent("The equation E=mc² means that?", listOf("Energy = mass × heat²", "Energy = mass × speed of light²", "Force = mass × acceleration", "Power = mass × c²"), "Science", "This equation from Einstein's special relativity establishes the equivalence between mass and energy, showing that a small mass can release immense energy, as in nuclear reactions."),
            zh = LocalizedContent("方程E=mc²意味着？", listOf("能量 = 质量 × 热量²", "能量 = 质量 × 光速²", "力 = 质量 × 加速度", "功率 = 质量 × c²"), "科学", "这个爱因斯坦狭义相对论的方程建立了质量与能量之间的等价关系，表明少量质量可以释放巨大能量，例如在核反应中。"),
            es = LocalizedContent("La ecuación E=mc² significa que?", listOf("Energía = masa × calor²", "Energía = masa × velocidad de la luz²", "Fuerza = masa × aceleración", "Potencia = masa × c²"), "Ciencia", "Esta ecuación de la relatividad especial de Einstein establece la equivalencia entre masa y energía, mostrando que una pequeña masa puede liberar una energía inmensa, como en las reacciones nucleares.")
        ),
        BilingualQuestion(
            id = 12034, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel chimiste a découvert la radioactivité?", listOf("Pierre Curie", "Marie Curie", "Antoine Becquerel", "Rutherford"), "Science", "Antoine Becquerel a découvert la radioactivité en 1896 en observant que des sels d'uranium émettaient des rayons sans exposition préalable à la lumière, ouvrant la voie à la physique nucléaire."),
            en = LocalizedContent("Which chemist discovered radioactivity?", listOf("Pierre Curie", "Marie Curie", "Antoine Becquerel", "Rutherford"), "Science", "Antoine Becquerel discovered radioactivity in 1896 by observing that uranium salts emitted rays without prior exposure to light, paving the way for nuclear physics."),
            zh = LocalizedContent("哪位化学家发现了放射性？", listOf("皮埃尔·居里", "玛丽·居里", "安东尼·贝克勒尔", "卢瑟福"), "科学", "安东尼·贝克勒尔于1896年发现放射性，他观察到铀盐在未经光照的情况下发出射线，为核物理学开辟了道路。"),
            es = LocalizedContent("¿Qué químico descubrió la radiactividad?", listOf("Pierre Curie", "Marie Curie", "Antoine Becquerel", "Rutherford"), "Ciencia", "Antoine Becquerel descubrió la radiactividad en 1896 al observar que las sales de uranio emitían rayos sin exposición previa a la luz, abriendo el camino a la física nuclear.")
        ),
        BilingualQuestion(
            id = 12035, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La première image d'un trou noir a été obtenue en?", listOf("2015", "2017", "2019", "2021"), "Science", "L'image du trou noir M87* a été publiée en 2019 par le réseau de télescopes Event Horizon Telescope, mais l'équipe a précisé et amélioré les données pour obtenir la version finale en 2021."),
            en = LocalizedContent("The first image of a black hole was obtained in?", listOf("2015", "2017", "2019", "2021"), "Science", "The image of the black hole M87* was published in 2019 by the Event Horizon Telescope network, but the team refined and improved the data to obtain the final version in 2021."),
            zh = LocalizedContent("第一张黑洞图像是在哪一年获得的？", listOf("2015", "2017", "2019", "2021"), "科学", "M87*黑洞的图像于2019年由事件视界望远镜网络发布，但团队对数据进行了完善和改进，最终版本于2021年获得。"),
            es = LocalizedContent("¿En qué año se obtuvo la primera imagen de un agujero negro?", listOf("2015", "2017", "2019", "2021"), "Ciencia", "La imagen del agujero negro M87* fue publicada en 2019 por la red de telescopios Event Horizon Telescope, pero el equipo refinó y mejoró los datos para obtener la versión final en 2021.")
        ),
        BilingualQuestion(
            id = 12036, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le prix Nobel de Physique 2020 a récompensé les découvertes sur?", listOf("Gravitons", "Trous noirs", "Ondes gravitationnelles", "Matière noire"), "Science", "Le prix Nobel de physique 2020 a été attribué à Roger Penrose, Reinhard Genzel et Andrea Ghez pour leurs travaux sur les trous noirs, notamment la démonstration de leur existence au centre de notre galaxie."),
            en = LocalizedContent("The 2020 Nobel Prize in Physics rewarded discoveries about?", listOf("Gravitons", "Black holes", "Gravitational waves", "Dark matter"), "Science", "The 2020 Nobel Prize in Physics was awarded to Roger Penrose, Reinhard Genzel, and Andrea Ghez for their work on black holes, particularly demonstrating their existence at the center of our galaxy."),
            zh = LocalizedContent("2020年诺贝尔物理学奖表彰了关于什么的发现？", listOf("引力子", "黑洞", "引力波", "暗物质"), "科学", "2020年诺贝尔物理学奖授予罗杰·彭罗斯、赖因哈德·根策尔和安德烈娅·盖兹，以表彰他们在黑洞方面的研究，特别是证明了黑洞存在于我们银河系的中心。"),
            es = LocalizedContent("El Premio Nobel de Física 2020 recompensó descubrimientos sobre?", listOf("Gravitones", "Agujeros negros", "Ondas gravitacionales", "Materia oscura"), "Ciencia", "El Premio Nobel de Física 2020 fue otorgado a Roger Penrose, Reinhard Genzel y Andrea Ghez por su trabajo sobre los agujeros negros, en particular demostrando su existencia en el centro de nuestra galaxia.")
        ),
        BilingualQuestion(
            id = 12037, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel scientifique a découvert les rayons X?", listOf("Rutherford", "Roentgen", "Becquerel", "Thomson"), "Science", "Wilhelm Röntgen a découvert les rayons X en 1895, une avancée qui lui a valu le premier prix Nobel de physique en 1901."),
            en = LocalizedContent("Which scientist discovered X-rays?", listOf("Rutherford", "Roentgen", "Becquerel", "Thomson"), "Science", "Wilhelm Röntgen discovered X-rays in 1895, a breakthrough that earned him the first Nobel Prize in Physics in 1901."),
            zh = LocalizedContent("哪位科学家发现了X射线？", listOf("卢瑟福", "伦琴", "贝克勒尔", "汤姆孙"), "科学", "威廉·伦琴于1895年发现X射线，这一突破为他赢得了1901年的首届诺贝尔物理学奖。"),
            es = LocalizedContent("¿Qué científico descubrió los rayos X?", listOf("Rutherford", "Roentgen", "Becquerel", "Thomson"), "Ciencia", "Wilhelm Röntgen descubrió los rayos X en 1895, un avance que le valió el primer Premio Nobel de Física en 1901.")
        ),
        BilingualQuestion(
            id = 12038, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le neutrino a été découvert par?", listOf("Fermi", "Pauli", "Lee et Yang", "Cowan et Reines"), "Science", "En 1956, les physiciens Clyde Cowan et Frederick Reines ont détecté pour la première fois le neutrino, une particule subatomique insaisissable, dans une expérience près d'un réacteur nucléaire."),
            en = LocalizedContent("The neutrino was discovered by?", listOf("Fermi", "Pauli", "Lee and Yang", "Cowan and Reines"), "Science", "In 1956, physicists Clyde Cowan and Frederick Reines first detected the neutrino, an elusive subatomic particle, in an experiment near a nuclear reactor."),
            zh = LocalizedContent("中微子是由谁发现的？", listOf("费米", "泡利", "李政道和杨振宁", "考恩和莱因斯"), "科学", "1956年，物理学家克莱德·考恩和弗雷德里克·莱因斯在核反应堆附近的一次实验中首次探测到中微子，这是一种难以捉摸的亚原子粒子。"),
            es = LocalizedContent("¿Quién descubrió el neutrino?", listOf("Fermi", "Pauli", "Lee y Yang", "Cowan y Reines"), "Ciencia", "En 1956, los físicos Clyde Cowan y Frederick Reines detectaron por primera vez el neutrino, una esquiva partícula subatómica, en un experimento cerca de un reactor nuclear.")
        ),
        BilingualQuestion(
            id = 12039, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le pH d'une solution neutre?", listOf("0", "7", "14", "10"), "Science", "Le pH mesure l'acidité ou la basicité d'une solution sur une échelle de 0 à 14. Une solution neutre, comme l'eau pure, a un pH de 7, car elle contient autant d'ions H+ que d'ions OH-."),
            en = LocalizedContent("What is the pH of a neutral solution?", listOf("0", "7", "14", "10"), "Science", "pH measures the acidity or basicity of a solution on a scale from 0 to 14. A neutral solution, like pure water, has a pH of 7 because it contains equal amounts of H+ and OH- ions."),
            zh = LocalizedContent("中性溶液的pH值是多少？", listOf("0", "7", "14", "10"), "科学", "pH值衡量溶液的酸碱性，范围从0到14。中性溶液（如纯水）的pH值为7，因为其中H+和OH-离子浓度相等。"),
            es = LocalizedContent("¿Cuál es el pH de una solución neutra?", listOf("0", "7", "14", "10"), "Ciencia", "El pH mide la acidez o basicidad de una solución en una escala de 0 a 14. Una solución neutra, como el agua pura, tiene un pH de 7 porque contiene cantidades iguales de iones H+ y OH-.")
        ),
        BilingualQuestion(
            id = 12040, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La constante de Planck vaut approximativement?", listOf("6.62 × 10³⁴", "6.62 × 10⁻³⁴", "6.62 × 10²⁴", "6.62 × 10⁻²⁴"), "Science", "La constante de Planck, notée h, est une constante fondamentale de la mécanique quantique qui relie l'énergie d'un photon à sa fréquence. Sa valeur approximative de 6,626 × 10⁻³⁴ J·s a été établie par Max Planck en 1900."),
            en = LocalizedContent("Planck's constant is approximately?", listOf("6.62 × 10³⁴", "6.62 × 10⁻³⁴", "6.62 × 10²⁴", "6.62 × 10⁻²⁴"), "Science", "Planck's constant, denoted h, is a fundamental constant in quantum mechanics that relates the energy of a photon to its frequency. Its approximate value of 6.626 × 10⁻³⁴ J·s was established by Max Planck in 1900."),
            zh = LocalizedContent("普朗克常数大约是多少？", listOf("6.62 × 10³⁴", "6.62 × 10⁻³⁴", "6.62 × 10²⁴", "6.62 × 10⁻²⁴"), "科学", "普朗克常数（h）是量子力学中的一个基本常数，将光子的能量与其频率联系起来。其近似值为6.626×10⁻³⁴ J·s，由马克斯·普朗克于1900年确定。"),
            es = LocalizedContent("¿Cuál es el valor aproximado de la constante de Planck?", listOf("6.62 × 10³⁴", "6.62 × 10⁻³⁴", "6.62 × 10²⁴", "6.62 × 10⁻²⁴"), "Ciencia", "La constante de Planck, denotada h, es una constante fundamental en mecánica cuántica que relaciona la energía de un fotón con su frecuencia. Su valor aproximado de 6.626 × 10⁻³⁴ J·s fue establecido por Max Planck en 1900.")
        ),
        BilingualQuestion(
            id = 12041, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la prise de la Bastille a-t-elle eu lieu?", listOf("1788", "1789", "1790", "1791"), "Histoire", "Le 14 juillet 1789, des émeutiers parisiens prennent la forteresse de la Bastille, symbole de l'autorité royale, déclenchant ainsi la Révolution française."),
            en = LocalizedContent("In which year did the storming of the Bastille take place?", listOf("1788", "1789", "1790", "1791"), "History", "On July 14, 1789, Parisian rioters stormed the Bastille fortress, a symbol of royal authority, triggering the French Revolution."),
            zh = LocalizedContent("攻占巴士底狱发生在哪一年？", listOf("1788", "1789", "1790", "1791"), "历史", "1789年7月14日，巴黎暴民攻占了巴士底狱，这座象征王权的堡垒，从而引发了法国大革命。"),
            es = LocalizedContent("¿En qué año ocurrió la Toma de la Bastilla?", listOf("1788", "1789", "1790", "1791"), "Historia", "El 14 de julio de 1789, amotinados parisinos tomaron la fortaleza de la Bastilla, símbolo de la autoridad real, desencadenando la Revolución Francesa.")
        ),
        BilingualQuestion(
            id = 12042, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pharaon égyptien a commandé la construction de la Grande Pyramide de Gizeh?", listOf("Khéops", "Khéphren", "Mykérinos", "Didoufri"), "Histoire", "Khéops, également connu sous le nom de Khoufou, a ordonné la construction de la Grande Pyramide vers 2560 av. J.-C. pour servir de tombeau monumental durant la IVe dynastie de l'Ancien Empire égyptien."),
            en = LocalizedContent("Which Egyptian pharaoh commissioned the construction of the Great Pyramid of Giza?", listOf("Khufu", "Khafre", "Menkaure", "Djedefre"), "History", "Khufu, also known as Cheops, ordered the construction of the Great Pyramid around 2560 BC as a monumental tomb during the 4th Dynasty of the Old Kingdom of Egypt."),
            zh = LocalizedContent("哪位埃及法老下令建造了吉萨大金字塔？", listOf("胡夫", "哈夫拉", "门卡乌拉", "杰德夫拉"), "历史", "胡夫（又称基奥普斯）于公元前2560年左右下令建造大金字塔，作为古埃及第四王朝旧王国时期的 monumental 陵墓。"),
            es = LocalizedContent("¿Qué faraón egipcio ordenó la construcción de la Gran Pirámide de Guiza?", listOf("Keops", "Kefrén", "Micerino", "Dyedefra"), "Historia", "Keops, también conocido como Khufu, ordenó la construcción de la Gran Pirámide alrededor del 2560 a.C. como tumba monumental durante la IV dinastía del Imperio Antiguo egipcio.")
        ),
        BilingualQuestion(
            id = 12043, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La civilisation des Olmèques s'est développée en?", listOf("Amérique du Nord", "Amérique centrale", "Amérique du Sud", "Mésoamérique"), "Histoire", "Les Olmèques sont considérés comme la première grande civilisation de Mésoamérique, région culturelle s'étendant du centre du Mexique à l'Amérique centrale."),
            en = LocalizedContent("The Olmec civilization developed in?", listOf("North America", "Central America", "South America", "Mesoamerica"), "History", "The Olmecs are considered the first major civilization of Mesoamerica, a cultural region extending from central Mexico to Central America."),
            zh = LocalizedContent("奥尔梅克文明发展于？", listOf("北美洲", "中美洲", "南美洲", "中部美洲"), "历史", "奥尔梅克人被认为是中部美洲第一个主要文明，该文化区域从墨西哥中部延伸到中美洲。"),
            es = LocalizedContent("¿En qué región se desarrolló la civilización olmeca?", listOf("América del Norte", "América Central", "América del Sur", "Mesoamérica"), "Historia", "Los olmecas son considerados la primera gran civilización de Mesoamérica, una región cultural que se extiende desde el centro de México hasta América Central.")
        ),
        BilingualQuestion(
            id = 12044, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le mur de Berlin a été construit en quelle année?", listOf("1959", "1961", "1963", "1965"), "Histoire", "Le mur de Berlin a été érigé en 1961 par la République démocratique allemande pour stopper l'exode massif de ses citoyens vers l'Ouest."),
            en = LocalizedContent("In which year was the Berlin Wall built?", listOf("1959", "1961", "1963", "1965"), "History", "The Berlin Wall was erected in 1961 by the German Democratic Republic to stop the mass exodus of its citizens to the West."),
            zh = LocalizedContent("柏林墙建于哪一年？", listOf("1959", "1961", "1963", "1965"), "历史", "柏林墙于1961年由德意志民主共和国建造，以阻止其公民大规模逃亡西方。"),
            es = LocalizedContent("¿En qué año se construyó el Muro de Berlín?", listOf("1959", "1961", "1963", "1965"), "Historia", "El Muro de Berlín fue erigido en 1961 por la República Democrática Alemana para detener el éxodo masivo de sus ciudadanos hacia el Oeste.")
        ),
        BilingualQuestion(
            id = 12045, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel empire perse a été fondé par Cyrus II?", listOf("Empire achéménide", "Empire parthe", "Empire sassanide", "Empire séleucide"), "Histoire", "Cyrus II, dit Cyrus le Grand, a conquis plusieurs royaumes pour unifier la Perse et fonder le premier empire perse, l'empire achéménide, vers 550 av. J.-C."),
            en = LocalizedContent("Which Persian empire was founded by Cyrus II?", listOf("Achaemenid Empire", "Parthian Empire", "Sassanid Empire", "Seleucid Empire"), "History", "Cyrus II, known as Cyrus the Great, conquered several kingdoms to unify Persia and founded the first Persian empire, the Achaemenid Empire, around 550 BC."),
            zh = LocalizedContent("居鲁士二世建立了哪个波斯帝国？", listOf("阿契美尼德帝国", "帕提亚帝国", "萨珊帝国", "塞琉古帝国"), "历史", "居鲁士二世（又称居鲁士大帝）征服了多个王国，统一了波斯，并于公元前550年左右建立了第一个波斯帝国——阿契美尼德帝国。"),
            es = LocalizedContent("¿Qué imperio persa fue fundado por Ciro II?", listOf("Imperio aqueménida", "Imperio parto", "Imperio sasánida", "Imperio seléucida"), "Historia", "Ciro II, conocido como Ciro el Grande, conquistó varios reinos para unificar Persia y fundó el primer imperio persa, el Imperio aqueménida, alrededor del 550 a.C.")
        ),
        BilingualQuestion(
            id = 12046, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'empereur romain Hadrien a commandé quel monument?", listOf("L'Arc de Triomphe", "Le Colosseum", "Le Panthéon", "Le Mur d'Hadrien"), "Histoire", "Le Mur d'Hadrien a été construit en Bretagne romaine pour marquer la frontière nord de l'Empire et se protéger des tribus pictes."),
            en = LocalizedContent("Which monument did the Roman emperor Hadrian commission?", listOf("The Arc de Triomphe", "The Colosseum", "The Pantheon", "Hadrian's Wall"), "History", "Hadrian's Wall was built in Roman Britain to mark the northern frontier of the Empire and protect against Pictish tribes."),
            zh = LocalizedContent("罗马皇帝哈德良下令建造了哪座纪念碑？", listOf("凯旋门", "罗马斗兽场", "万神殿", "哈德良长城"), "历史", "哈德良长城建于罗马不列颠，用以标记帝国的北部边界并防御皮克特部落。"),
            es = LocalizedContent("¿Qué monumento encargó el emperador romano Adriano?", listOf("El Arco de Triunfo", "El Coliseo", "El Panteón", "El Muro de Adriano"), "Historia", "El Muro de Adriano fue construido en la Britania romana para marcar la frontera norte del Imperio y protegerse de las tribus pictas.")
        ),
        BilingualQuestion(
            id = 12047, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La bataille de Marathon a eu lieu en?", listOf("490 av. J.-C.", "480 av. J.-C.", "470 av. J.-C.", "450 av. J.-C."), "Histoire", "Cette bataille oppose les Athéniens aux Perses en 490 av. J.-C. et se solde par une victoire grecque décisive."),
            en = LocalizedContent("The Battle of Marathon took place in?", listOf("490 BC", "480 BC", "470 BC", "450 BC"), "History", "This battle pitted the Athenians against the Persians in 490 BC and resulted in a decisive Greek victory."),
            zh = LocalizedContent("马拉松战役发生在？", listOf("公元前490年", "公元前480年", "公元前470年", "公元前450年"), "历史", "这场战役于公元前490年发生在雅典人与波斯人之间，最终以希腊的决定性胜利告终。"),
            es = LocalizedContent("¿En qué año ocurrió la Batalla de Maratón?", listOf("490 a.C.", "480 a.C.", "470 a.C.", "450 a.C."), "Historia", "Esta batalla enfrentó a los atenienses contra los persas en el 490 a.C. y resultó en una victoria griega decisiva.")
        ),
        BilingualQuestion(
            id = 12048, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel khmer a construit Angkor Wat?", listOf("Jayavarman II", "Jayavarman VII", "Suryavarman II", "Yashovarman I"), "Histoire", "Suryavarman II, roi de l'Empire khmer au XIIe siècle, a ordonné la construction d'Angkor Wat comme temple hindou dédié à Vishnu."),
            en = LocalizedContent("Which Khmer king built Angkor Wat?", listOf("Jayavarman II", "Jayavarman VII", "Suryavarman II", "Yashovarman I"), "History", "Suryavarman II, king of the Khmer Empire in the 12th century, ordered the construction of Angkor Wat as a Hindu temple dedicated to Vishnu."),
            zh = LocalizedContent("哪位高棉国王建造了吴哥窟？", listOf("阇耶跋摩二世", "阇耶跋摩七世", "苏利耶跋摩二世", "耶输跋摩一世"), "历史", "苏利耶跋摩二世是12世纪高棉帝国的国王，他下令建造吴哥窟作为供奉毗湿奴的印度教寺庙。"),
            es = LocalizedContent("¿Qué rey jemer construyó Angkor Wat?", listOf("Jayavarman II", "Jayavarman VII", "Suryavarman II", "Yashovarman I"), "Historia", "Suryavarman II, rey del Imperio jemer en el siglo XII, ordenó la construcción de Angkor Wat como templo hindú dedicado a Vishnú.")
        ),
        BilingualQuestion(
            id = 12049, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La Révolution française a commencé en?", listOf("1788", "1789", "1790", "1793"), "Histoire", "La Révolution française débute en 1789 avec la convocation des États généraux, puis la prise de la Bastille le 14 juillet, marquant la fin de l'Ancien Régime."),
            en = LocalizedContent("The French Revolution began in?", listOf("1788", "1789", "1790", "1793"), "History", "The French Revolution began in 1789 with the convocation of the Estates-General, followed by the storming of the Bastille on July 14, marking the end of the Ancien Régime."),
            zh = LocalizedContent("法国大革命始于哪一年？", listOf("1788年", "1789年", "1790年", "1793年"), "历史", "法国大革命始于1789年，以三级会议的召开为开端，随后7月14日攻占巴士底狱，标志着旧制度的终结。"),
            es = LocalizedContent("¿La Revolución Francesa comenzó en?", listOf("1788", "1789", "1790", "1793"), "Historia", "La Revolución Francesa comenzó en 1789 con la convocatoria de los Estados Generales, seguida de la toma de la Bastilla el 14 de julio, marcando el fin del Antiguo Régimen.")
        ),
        BilingualQuestion(
            id = 12050, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel empire akkadien a été fondé par Sargon d'Akkad?", listOf("Babylonie", "Sumer", "Empire akkadien", "Assyrie"), "Histoire", "Sargon d'Akkad a unifié les cités-États de Mésopotamie vers 2334 av. J.-C., créant ainsi le premier empire connu de l'histoire, l'Empire akkadien."),
            en = LocalizedContent("Which Akkadian empire was founded by Sargon of Akkad?", listOf("Babylonia", "Sumer", "Akkadian Empire", "Assyria"), "History", "Sargon of Akkad unified the city-states of Mesopotamia around 2334 BC, creating the first known empire in history, the Akkadian Empire."),
            zh = LocalizedContent("哪个阿卡德帝国是由萨尔贡一世建立的？", listOf("巴比伦尼亚", "苏美尔", "阿卡德帝国", "亚述"), "历史", "萨尔贡一世于公元前2334年左右统一了美索不达米亚的城邦，建立了历史上已知的第一个帝国——阿卡德帝国。"),
            es = LocalizedContent("¿Qué imperio acadio fue fundado por Sargón de Acad?", listOf("Babilonia", "Sumer", "Imperio acadio", "Asiria"), "Historia", "Sargón de Acad unificó las ciudades-estado de Mesopotamia alrededor del 2334 a.C., creando el primer imperio conocido de la historia, el Imperio acadio.")
        ),
        BilingualQuestion(
            id = 12051, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'ordre du Temple a été fondé en?", listOf("1095", "1119", "1150", "1180"), "Histoire", "L'ordre du Temple a été fondé en 1119 par Hugues de Payns et huit chevaliers pour protéger les pèlerins en Terre sainte. Il fut reconnu officiellement par l'Église au concile de Troyes en 1129."),
            en = LocalizedContent("The Order of the Temple was founded in?", listOf("1095", "1119", "1150", "1180"), "History", "The Order of the Temple was founded in 1119 by Hugues de Payens and eight knights to protect pilgrims in the Holy Land. It was officially recognized by the Church at the Council of Troyes in 1129."),
            zh = LocalizedContent("圣殿骑士团成立于哪一年？", listOf("1095年", "1119年", "1150年", "1180年"), "历史", "圣殿骑士团于1119年由于格·德·帕扬和八名骑士创立，旨在保护圣地朝圣者。1129年特鲁瓦会议得到教会正式承认。"),
            es = LocalizedContent("¿La Orden del Temple fue fundada en?", listOf("1095", "1119", "1150", "1180"), "Historia", "La Orden del Temple fue fundada en 1119 por Hugo de Payns y ocho caballeros para proteger a los peregrinos en Tierra Santa. Fue reconocida oficialmente por la Iglesia en el Concilio de Troyes en 1129.")
        ),
        BilingualQuestion(
            id = 12052, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le traité de Westphalie a été signé en?", listOf("1643", "1648", "1660", "1661"), "Histoire", "Ces traités ont mis fin à la guerre de Trente Ans en Europe, un conflit majeur du XVIIe siècle, et ont posé les bases du système moderne des États-nations."),
            en = LocalizedContent("The Treaty of Westphalia was signed in?", listOf("1643", "1648", "1660", "1661"), "History", "These treaties ended the Thirty Years' War in Europe, a major conflict of the 17th century, and laid the foundations of the modern system of nation-states."),
            zh = LocalizedContent("《威斯特伐利亚和约》签署于哪一年？", listOf("1643年", "1648年", "1660年", "1661年"), "历史", "这些条约结束了欧洲三十年战争（17世纪的一场重大冲突），并为现代民族国家体系奠定了基础。"),
            es = LocalizedContent("¿El Tratado de Westfalia fue firmado en?", listOf("1643", "1648", "1660", "1661"), "Historia", "Estos tratados pusieron fin a la Guerra de los Treinta Años en Europa, un conflicto importante del siglo XVII, y sentaron las bases del sistema moderno de estados-nación.")
        ),
        BilingualQuestion(
            id = 12053, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel conquérant a fondé l'Empire mongol?", listOf("Kublai Khan", "Gengis Khan", "Tamerlane", "Ögedei Khan"), "Histoire", "Gengis Khan a unifié les tribus mongoles au début du XIIIe siècle et a lancé des conquêtes massives en Asie, créant le plus vaste empire contigu de l'histoire."),
            en = LocalizedContent("Which conqueror founded the Mongol Empire?", listOf("Kublai Khan", "Genghis Khan", "Tamerlane", "Ögedei Khan"), "History", "Genghis Khan united the Mongol tribes in the early 13th century and launched massive conquests across Asia, creating the largest contiguous empire in history."),
            zh = LocalizedContent("哪位征服者建立了蒙古帝国？", listOf("忽必烈", "成吉思汗", "帖木儿", "窝阔台"), "历史", "成吉思汗在13世纪初统一了蒙古部落，并在亚洲发动大规模征服，建立了历史上最大的连续帝国。"),
            es = LocalizedContent("¿Qué conquistador fundó el Imperio mongol?", listOf("Kublai Kan", "Gengis Kan", "Tamerlán", "Ögedei Kan"), "Historia", "Gengis Kan unificó las tribus mongolas a principios del siglo XIII y lanzó conquistas masivas en Asia, creando el imperio contiguo más grande de la historia.")
        ),
        BilingualQuestion(
            id = 12054, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La dynastie Ming en Chine a duré environ?", listOf("200 ans", "250 ans", "300 ans", "350 ans"), "Histoire", "La dynastie Ming a gouverné la Chine de 1368 à 1644, soit environ 276 ans, ce qui est souvent arrondi à 300 ans."),
            en = LocalizedContent("The Ming Dynasty in China lasted about?", listOf("200 years", "250 years", "300 years", "350 years"), "History", "The Ming Dynasty ruled China from 1368 to 1644, about 276 years, often rounded to 300 years."),
            zh = LocalizedContent("中国明朝大约持续了多少年？", listOf("200年", "250年", "300年", "350年"), "历史", "明朝统治中国从1368年到1644年，约276年，常四舍五入为300年。"),
            es = LocalizedContent("¿La dinastía Ming en China duró aproximadamente?", listOf("200 años", "250 años", "300 años", "350 años"), "Historia", "La dinastía Ming gobernó China desde 1368 hasta 1644, unos 276 años, a menudo redondeado a 300 años.")
        ),
        BilingualQuestion(
            id = 12055, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La tour de Pise a commencé à s'incliner en?", listOf("1173", "1185", "1200", "1220"), "Histoire", "La construction de la tour de Pise a débuté en 1173, et son affaissement a commencé presque immédiatement en raison d'un sol instable."),
            en = LocalizedContent("The Leaning Tower of Pisa began to lean in?", listOf("1173", "1185", "1200", "1220"), "History", "Construction of the Leaning Tower of Pisa began in 1173, and its sinking started almost immediately due to unstable soil."),
            zh = LocalizedContent("比萨斜塔开始倾斜是在哪一年？", listOf("1173年", "1185年", "1200年", "1220年"), "历史", "比萨斜塔始建于1173年，由于地基不稳，几乎立即开始下沉。"),
            es = LocalizedContent("¿La Torre Inclinada de Pisa comenzó a inclinarse en?", listOf("1173", "1185", "1200", "1220"), "Historia", "La construcción de la Torre Inclinada de Pisa comenzó en 1173, y su hundimiento comenzó casi de inmediato debido al suelo inestable.")
        ),
        BilingualQuestion(
            id = 12056, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel roi anglais a signé la Magna Carta?", listOf("Henri VIII", "Jean sans Terre", "Richard Cœur de Lion", "Édouard Ier"), "Histoire", "Jean sans Terre a signé la Magna Carta en 1215 sous la pression des barons anglais, limitant son pouvoir royal et posant les bases des droits légaux."),
            en = LocalizedContent("Which English king signed the Magna Carta?", listOf("Henry VIII", "John Lackland", "Richard the Lionheart", "Edward I"), "History", "John Lackland signed the Magna Carta in 1215 under pressure from the English barons, limiting his royal power and laying the foundations for legal rights."),
            zh = LocalizedContent("哪位英国国王签署了《大宪章》？", listOf("亨利八世", "约翰王（无地王）", "狮心王理查", "爱德华一世"), "历史", "无地王约翰于1215年在英国贵族压力下签署了《大宪章》，限制了他的王权，为法律权利奠定了基础。"),
            es = LocalizedContent("¿Qué rey inglés firmó la Carta Magna?", listOf("Enrique VIII", "Juan sin Tierra", "Ricardo Corazón de León", "Eduardo I"), "Historia", "Juan sin Tierra firmó la Carta Magna en 1215 bajo la presión de los barones ingleses, limitando su poder real y sentando las bases de los derechos legales.")
        ),
        BilingualQuestion(
            id = 12057, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La chute de l'Empire romain d'Occident est datée en?", listOf("410 apr. J.-C.", "455 apr. J.-C.", "476 apr. J.-C.", "500 apr. J.-C."), "Histoire", "En 476, le chef barbare Odoacre dépose le dernier empereur romain d'Occident, Romulus Augustule, mettant fin à l'Empire romain d'Occident."),
            en = LocalizedContent("The fall of the Western Roman Empire is dated in?", listOf("410 AD", "455 AD", "476 AD", "500 AD"), "History", "In 476, the barbarian chieftain Odoacer deposed the last Western Roman Emperor, Romulus Augustulus, ending the Western Roman Empire."),
            zh = LocalizedContent("西罗马帝国的灭亡是在哪一年？", listOf("公元410年", "公元455年", "公元476年", "公元500年"), "历史", "公元476年，蛮族首领奥多亚塞废黜了最后一位西罗马皇帝罗慕路斯·奥古斯都，西罗马帝国灭亡。"),
            es = LocalizedContent("¿La caída del Imperio romano de Occidente se fecha en?", listOf("410 d.C.", "455 d.C.", "476 d.C.", "500 d.C."), "Historia", "En 476, el jefe bárbaro Odoacro depuso al último emperador romano de Occidente, Rómulo Augústulo, poniendo fin al Imperio romano de Occidente.")
        ),
        BilingualQuestion(
            id = 12058, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pharaon a fondé la XIIe dynastie égyptienne?", listOf("Amenemhat I", "Sésostris III", "Amenemhat III", "Kheti"), "Histoire", "Amenemhat I, ancien vizir, prit le pouvoir après la première période intermédiaire et déplaça la capitale à Itchtaouy, marquant le début de la prospère XIIe dynastie."),
            en = LocalizedContent("Which pharaoh founded the 12th Dynasty of Egypt?", listOf("Amenemhat I", "Senusret III", "Amenemhat III", "Kheti"), "History", "Amenemhat I, a former vizier, took power after the First Intermediate Period and moved the capital to Itjtawy, marking the beginning of the prosperous 12th Dynasty."),
            zh = LocalizedContent("哪位法老建立了埃及第十二王朝？", listOf("阿蒙涅姆赫特一世", "塞索斯特里斯三世", "阿蒙涅姆赫特三世", "赫提"), "历史", "阿蒙涅姆赫特一世原为维齐尔，在第一中间期后夺取权力，并将首都迁至伊塔威，标志着繁荣的第十二王朝的开始。"),
            es = LocalizedContent("¿Qué faraón fundó la XII dinastía egipcia?", listOf("Amenemhat I", "Sesostris III", "Amenemhat III", "Kheti"), "Historia", "Amenemhat I, un antiguo visir, tomó el poder después del Primer Período Intermedio y trasladó la capital a Itchtaouy, marcando el inicio de la próspera XII dinastía.")
        ),
        BilingualQuestion(
            id = 12059, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La civilisation minoenne a prospéré sur?", listOf("La Crète", "Santorin", "Chios", "Rhodes"), "Histoire", "La civilisation minoenne s'est développée sur l'île de Crète entre 2700 et 1450 av. J.-C., avant d'être supplantée par les Mycéniens."),
            en = LocalizedContent("The Minoan civilization flourished on?", listOf("Crete", "Santorini", "Chios", "Rhodes"), "History", "The Minoan civilization developed on the island of Crete between 2700 and 1450 BC, before being supplanted by the Mycenaeans."),
            zh = LocalizedContent("米诺斯文明在哪个岛屿上繁荣发展？", listOf("克里特岛", "圣托里尼岛", "希俄斯岛", "罗得岛"), "历史", "米诺斯文明在克里特岛上发展，存在于公元前2700年至1450年之间，后被迈锡尼文明取代。"),
            es = LocalizedContent("¿La civilización minoica prosperó en?", listOf("Creta", "Santorini", "Quíos", "Rodas"), "Historia", "La civilización minoica se desarrolló en la isla de Creta entre 2700 y 1450 a.C., antes de ser suplantada por los micénicos.")
        ),
        BilingualQuestion(
            id = 12060, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel empire a construit la Grande Muraille de Chine?", listOf("Dynastie Qin", "Dynastie Ming", "Dynastie Han", "Dynasties multiples"), "Histoire", "La construction de la Grande Muraille s'est étalée sur plusieurs dynasties chinoises, notamment les Qin, Han et Ming, chacune ajoutant ou renforçant des sections pour se protéger des invasions."),
            en = LocalizedContent("Which empire built the Great Wall of China?", listOf("Qin Dynasty", "Ming Dynasty", "Han Dynasty", "Multiple dynasties"), "History", "The construction of the Great Wall spanned several Chinese dynasties, notably the Qin, Han, and Ming, each adding or reinforcing sections to protect against invasions."),
            zh = LocalizedContent("哪个帝国修建了中国的长城？", listOf("秦朝", "明朝", "汉朝", "多个朝代"), "历史", "长城的修建跨越了多个中国朝代，特别是秦、汉和明朝，每个朝代都增建或加固了部分以抵御入侵。"),
            es = LocalizedContent("¿Qué imperio construyó la Gran Muralla China?", listOf("Dinastía Qin", "Dinastía Ming", "Dinastía Han", "Múltiples dinastías"), "Historia", "La construcción de la Gran Muralla abarcó varias dinastías chinas, especialmente las Qin, Han y Ming, cada una añadiendo o reforzando secciones para protegerse de las invasiones.")
        ),
        BilingualQuestion(
            id = 12061, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La France partage ses frontières terrestres avec combien de pays?", listOf("6", "7", "8", "9"), "Géographie", "La France métropolitaine partage ses frontières terrestres avec 8 pays : la Belgique, le Luxembourg, l'Allemagne, la Suisse, l'Italie, Monaco, l'Andorre et l'Espagne."),
            en = LocalizedContent("How many countries does France share land borders with?", listOf("6", "7", "8", "9"), "Geography", "Metropolitan France shares land borders with 8 countries: Belgium, Luxembourg, Germany, Switzerland, Italy, Monaco, Andorra, and Spain."),
            zh = LocalizedContent("法国与多少个国家接壤？", listOf("6", "7", "8", "9"), "地理", "法国本土与8个国家接壤：比利时、卢森堡、德国、瑞士、意大利、摩纳哥、安道尔和西班牙。"),
            es = LocalizedContent("¿Con cuántos países comparte Francia fronteras terrestres?", listOf("6", "7", "8", "9"), "Geografía", "La Francia metropolitana comparte fronteras terrestres con 8 países: Bélgica, Luxemburgo, Alemania, Suiza, Italia, Mónaco, Andorra y España.")
        ),
        BilingualQuestion(
            id = 12062, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus petit État d'Europe par la superficie?", listOf("Monaco", "Andorre", "Vatican", "Liechtenstein"), "Géographie", "Le Vatican est une cité-État enclavée dans Rome, avec une superficie d'environ 0,44 km², ce qui en fait le plus petit État souverain d'Europe et du monde."),
            en = LocalizedContent("What is the smallest state in Europe by area?", listOf("Monaco", "Andorra", "Vatican City", "Liechtenstein"), "Geography", "Vatican City is a city-state enclaved within Rome, with an area of about 0.44 km², making it the smallest sovereign state in Europe and the world."),
            zh = LocalizedContent("欧洲面积最小的国家是哪个？", listOf("摩纳哥", "安道尔", "梵蒂冈", "列支敦士登"), "地理", "梵蒂冈是一个位于罗马境内的城邦，面积约0.44平方公里，是欧洲乃至世界上最小的主权国家。"),
            es = LocalizedContent("¿Cuál es el estado más pequeño de Europa por superficie?", listOf("Mónaco", "Andorra", "Ciudad del Vaticano", "Liechtenstein"), "Geografía", "La Ciudad del Vaticano es una ciudad-estado enclavada en Roma, con una superficie de aproximadamente 0,44 km², lo que la convierte en el estado soberano más pequeño de Europa y del mundo.")
        ),
        BilingualQuestion(
            id = 12063, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel océan couvre la plus grande surface?", listOf("Atlantique", "Indien", "Pacifique", "Arctique"), "Géographie", "L'océan Pacifique est le plus vaste des océans, couvrant environ 165 millions de kilomètres carrés, soit plus du tiers de la surface terrestre. Il dépasse largement l'océan Atlantique, deuxième en superficie."),
            en = LocalizedContent("Which ocean covers the largest area?", listOf("Atlantic", "Indian", "Pacific", "Arctic"), "Geography", "The Pacific Ocean is the largest ocean, covering about 165 million square kilometers, more than a third of the Earth's surface. It far exceeds the Atlantic Ocean, which is second in area."),
            zh = LocalizedContent("哪个海洋覆盖的面积最大？", listOf("大西洋", "印度洋", "太平洋", "北冰洋"), "地理", "太平洋是最大的海洋，面积约1.65亿平方公里，占地球表面积的三分之一以上，远超面积第二的大西洋。"),
            es = LocalizedContent("¿Qué océano cubre la mayor superficie?", listOf("Atlántico", "Índico", "Pacífico", "Ártico"), "Geografía", "El océano Pacífico es el más grande, cubriendo aproximadamente 165 millones de kilómetros cuadrados, más de un tercio de la superficie terrestre. Supera ampliamente al océano Atlántico, que es el segundo en superficie.")
        ),
        BilingualQuestion(
            id = 12064, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel désert est le plus grand du monde?", listOf("Sahara", "Antarctique", "Arabie", "Gobi"), "Géographie", "L'Antarctique est considéré comme le plus grand désert du monde car il reçoit très peu de précipitations, moins de 50 mm par an en moyenne, ce qui correspond à la définition d'un désert."),
            en = LocalizedContent("Which desert is the largest in the world?", listOf("Sahara", "Antarctic", "Arabian", "Gobi"), "Geography", "Antarctica is considered the largest desert in the world because it receives very little precipitation, less than 50 mm per year on average, which fits the definition of a desert."),
            zh = LocalizedContent("世界上最大的沙漠是哪个？", listOf("撒哈拉沙漠", "南极洲", "阿拉伯沙漠", "戈壁沙漠"), "地理", "南极洲被认为是世界上最大的沙漠，因为它降水量极少，平均每年不到50毫米，符合沙漠的定义。"),
            es = LocalizedContent("¿Qué desierto es el más grande del mundo?", listOf("Sáhara", "Antártida", "Arábigo", "Gobi"), "Geografía", "La Antártida es considerada el desierto más grande del mundo porque recibe muy poca precipitación, menos de 50 mm al año en promedio, lo que se ajusta a la definición de desierto.")
        ),
        BilingualQuestion(
            id = 12065, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La plus longue chaîne de montagnes du monde est?", listOf("Les Alpes", "Les Andes", "L'Himalaya", "Les Rocheuses"), "Géographie", "Les Andes s'étendent sur environ 8 900 kilomètres le long de la côte ouest de l'Amérique du Sud, traversant sept pays. Elles dépassent ainsi la dorsale médio-atlantique en longueur terrestre continue."),
            en = LocalizedContent("The longest mountain range in the world is?", listOf("The Alps", "The Andes", "The Himalayas", "The Rockies"), "Geography", "The Andes stretch about 8,900 kilometers along the western coast of South America, crossing seven countries. They surpass the Mid-Atlantic Ridge in continuous terrestrial length."),
            zh = LocalizedContent("世界上最长的山脉是？", listOf("阿尔卑斯山脉", "安第斯山脉", "喜马拉雅山脉", "落基山脉"), "地理", "安第斯山脉沿南美洲西海岸延伸约8900公里，穿越七个国家，其连续陆地长度超过了大西洋中脊。"),
            es = LocalizedContent("¿La cordillera más larga del mundo es?", listOf("Los Alpes", "Los Andes", "El Himalaya", "Las Rocosas"), "Geografía", "Los Andes se extienden aproximadamente 8.900 kilómetros a lo largo de la costa occidental de América del Sur, cruzando siete países. Superan a la dorsal mesoatlántica en longitud terrestre continua.")
        ),
        BilingualQuestion(
            id = 12066, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus profond océan du monde?", listOf("Océan Atlantique", "Océan Indien", "Océan Pacifique", "Océan Arctique"), "Géographie", "L'océan Pacifique abrite la fosse des Mariannes, dont le point le plus profond, la fosse Challenger, descend à environ 11 000 mètres sous le niveau de la mer."),
            en = LocalizedContent("What is the deepest ocean in the world?", listOf("Atlantic Ocean", "Indian Ocean", "Pacific Ocean", "Arctic Ocean"), "Geography", "The Pacific Ocean contains the Mariana Trench, whose deepest point, the Challenger Deep, descends to about 11,000 meters below sea level."),
            zh = LocalizedContent("世界上最深的海洋是哪个？", listOf("大西洋", "印度洋", "太平洋", "北冰洋"), "地理", "太平洋拥有马里亚纳海沟，其最深处挑战者深渊深达海平面以下约11000米。"),
            es = LocalizedContent("¿Cuál es el océano más profundo del mundo?", listOf("Océano Atlántico", "Océano Índico", "Océano Pacífico", "Océano Ártico"), "Geografía", "El océano Pacífico alberga la fosa de las Marianas, cuyo punto más profundo, el abismo Challenger, desciende a unos 11.000 metros bajo el nivel del mar.")
        ),
        BilingualQuestion(
            id = 12067, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Le plus haut sommet du monde est?", listOf("K2", "Kangchenjunga", "Lhotse", "Mont Everest"), "Géographie", "L'Everest culmine à 8 848 mètres d'altitude dans l'Himalaya, à la frontière entre le Népal et le Tibet. Il a été nommé d'après George Everest, un géomètre britannique du XIXe siècle."),
            en = LocalizedContent("The highest peak in the world is?", listOf("K2", "Kangchenjunga", "Lhotse", "Mount Everest"), "Geography", "Mount Everest stands at 8,848 meters above sea level in the Himalayas, on the border between Nepal and Tibet. It was named after George Everest, a 19th-century British surveyor."),
            zh = LocalizedContent("世界上最高的山峰是？", listOf("K2", "干城章嘉峰", "洛子峰", "珠穆朗玛峰"), "地理", "珠穆朗玛峰海拔8848米，位于喜马拉雅山脉，尼泊尔和西藏交界处。它以19世纪英国测量员乔治·额菲尔士的名字命名。"),
            es = LocalizedContent("¿El pico más alto del mundo es?", listOf("K2", "Kangchenjunga", "Lhotse", "Monte Everest"), "Geografía", "El Monte Everest se eleva a 8.848 metros sobre el nivel del mar en el Himalaya, en la frontera entre Nepal y el Tíbet. Fue nombrado en honor a George Everest, un agrimensor británico del siglo XIX.")
        ),
        BilingualQuestion(
            id = 12068, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel détroit sépare l'Afrique de l'Asie?", listOf("Détroit de Malacca", "Détroit de Bab el-Mandeb", "Détroit de Béring", "Détroit du Bosphore"), "Géographie", "Le détroit de Bab el-Mandeb relie la mer Rouge au golfe d'Aden, séparant ainsi la corne de l'Afrique (Djibouti, Yémen) de la péninsule arabique."),
            en = LocalizedContent("Which strait separates Africa from Asia?", listOf("Strait of Malacca", "Strait of Bab el-Mandeb", "Bering Strait", "Bosphorus Strait"), "Geography", "The Bab el-Mandeb Strait connects the Red Sea to the Gulf of Aden, thus separating the Horn of Africa (Djibouti, Yemen) from the Arabian Peninsula."),
            zh = LocalizedContent("哪个海峡分隔了非洲和亚洲？", listOf("马六甲海峡", "曼德海峡", "白令海峡", "博斯普鲁斯海峡"), "地理", "曼德海峡连接红海和亚丁湾，从而将非洲之角（吉布提、也门）与阿拉伯半岛分隔开来。"),
            es = LocalizedContent("¿Qué estrecho separa África de Asia?", listOf("Estrecho de Malaca", "Estrecho de Bab el-Mandeb", "Estrecho de Bering", "Estrecho del Bósforo"), "Geografía", "El estrecho de Bab el-Mandeb conecta el mar Rojo con el golfo de Adén, separando así el Cuerno de África (Yibuti, Yemen) de la península arábiga.")
        ),
        BilingualQuestion(
            id = 12069, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Micronésie comprend environ combien d'îles?", listOf("500", "1000", "2000", "3000"), "Géographie", "La Micronésie est une région de l'océan Pacifique composée de plusieurs archipels, regroupant environ 2000 îles, dont beaucoup sont de petite taille."),
            en = LocalizedContent("Micronesia comprises approximately how many islands?", listOf("500", "1000", "2000", "3000"), "Geography", "Micronesia is a region in the Pacific Ocean composed of several archipelagos, comprising about 2000 islands, many of which are small in size."),
            zh = LocalizedContent("密克罗尼西亚大约包含多少个岛屿？", listOf("500", "1000", "2000", "3000"), "地理", "密克罗尼西亚是太平洋中的一个区域，由多个群岛组成，包含约2000个岛屿，其中许多岛屿面积较小。"),
            es = LocalizedContent("¿Micronesia comprende aproximadamente cuántas islas?", listOf("500", "1000", "2000", "3000"), "Geografia", "Micronesia es una región del océano Pacífico compuesta por varios archipiélagos, que agrupa alrededor de 2000 islas, muchas de ellas de pequeño tamaño.")
        ),
        BilingualQuestion(
            id = 12070, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel territoire français est situé en Polynésie?", listOf("Réunion", "Mayotte", "Polynésie française", "Martinique"), "Géographie", "La Polynésie française est un collectivité d'outre-mer de la France, située dans l'océan Pacifique Sud, et regroupe plusieurs archipels comme Tahiti."),
            en = LocalizedContent("Which French territory is located in Polynesia?", listOf("Réunion", "Mayotte", "French Polynesia", "Martinique"), "Geography", "French Polynesia is an overseas collectivity of France, located in the South Pacific Ocean, and includes several archipelagos such as Tahiti."),
            zh = LocalizedContent("哪个法国领土位于波利尼西亚？", listOf("留尼汪", "马约特", "法属波利尼西亚", "马提尼克"), "地理", "法属波利尼西亚是法国的海外集体，位于南太平洋，包括塔希提等多个群岛。"),
            es = LocalizedContent("¿Qué territorio francés está situado en Polinesia?", listOf("Reunión", "Mayotte", "Polinesia Francesa", "Martinica"), "Geografia", "La Polinesia Francesa es una colectividad de ultramar de Francia, situada en el océano Pacífico Sur, y agrupa varios archipiélagos como Tahití.")
        ),
        BilingualQuestion(
            id = 12071, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'enclave de Lesotho est entièrement entourée par?", listOf("Botswana", "Zimbabwé", "Afrique du Sud", "Eswatini"), "Géographie", "Le Lesotho est une enclave géographique située à l'intérieur des frontières de l'Afrique du Sud, ce qui en fait un pays entièrement entouré par ce seul voisin."),
            en = LocalizedContent("The enclave of Lesotho is entirely surrounded by?", listOf("Botswana", "Zimbabwe", "South Africa", "Eswatini"), "Geography", "Lesotho is a geographical enclave located within the borders of South Africa, making it a country entirely surrounded by this single neighbor."),
            zh = LocalizedContent("莱索托的飞地完全被哪个国家包围？", listOf("博茨瓦纳", "津巴布韦", "南非", "斯威士兰"), "地理", "莱索托是位于南非边界内的地理飞地，使其成为一个完全被这个单一邻国包围的国家。"),
            es = LocalizedContent("¿El enclave de Lesoto está completamente rodeado por?", listOf("Botsuana", "Zimbabue", "Sudáfrica", "Esuatini"), "Geografia", "Lesoto es un enclave geográfico situado dentro de las fronteras de Sudáfrica, lo que lo convierte en un país completamente rodeado por este único vecino.")
        ),
        BilingualQuestion(
            id = 12072, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays partage une frontière avec le plus de nations?", listOf("Russie", "Chine", "Allemagne", "France"), "Géographie", "La Russie partage ses frontières terrestres avec 14 pays, incluant la Norvège, la Finlande, et la Chine, ce qui en fait le pays avec le plus de voisins frontaliers."),
            en = LocalizedContent("Which country shares a border with the most nations?", listOf("Russia", "China", "Germany", "France"), "Geography", "Russia shares its land borders with 14 countries, including Norway, Finland, and China, making it the country with the most neighboring borders."),
            zh = LocalizedContent("哪个国家与最多的国家接壤？", listOf("俄罗斯", "中国", "德国", "法国"), "地理", "俄罗斯与14个国家接壤，包括挪威、芬兰和中国，使其成为拥有最多邻国的国家。"),
            es = LocalizedContent("¿Qué país comparte frontera con la mayor cantidad de naciones?", listOf("Rusia", "China", "Alemania", "Francia"), "Geografia", "Rusia comparte sus fronteras terrestres con 14 países, incluyendo Noruega, Finlandia y China, lo que lo convierte en el país con más vecinos fronterizos.")
        ),
        BilingualQuestion(
            id = 12073, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La capitale de la Mauritanie est?", listOf("Nouakchott", "Saint-Louis", "Rosso", "Néma"), "Géographie", "Nouakchott est la capitale de la Mauritanie depuis 1958, choisie pour sa position centrale et proche de la côte atlantique, remplaçant Saint-Louis."),
            en = LocalizedContent("The capital of Mauritania is?", listOf("Nouakchott", "Saint-Louis", "Rosso", "Néma"), "Geography", "Nouakchott has been the capital of Mauritania since 1958, chosen for its central location and proximity to the Atlantic coast, replacing Saint-Louis."),
            zh = LocalizedContent("毛里塔尼亚的首都是？", listOf("努瓦克肖特", "圣路易", "罗索", "内马"), "地理", "努瓦克肖特自1958年起成为毛里塔尼亚的首都，因其中心位置和靠近大西洋海岸而被选中，取代了圣路易。"),
            es = LocalizedContent("¿La capital de Mauritania es?", listOf("Nuakchot", "San Luis", "Rosso", "Néma"), "Geografia", "Nuakchot es la capital de Mauritania desde 1958, elegida por su posición central y cercanía a la costa atlántica, reemplazando a San Luis.")
        ),
        BilingualQuestion(
            id = 12074, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le pays transcontinental qui s'étend sur Europe et Asie?", listOf("Turquie", "Russie", "Égypte", "Moyen-Orient"), "Géographie", "La Russie est le plus grand pays du monde et son territoire s'étend à la fois sur l'Europe de l'Est et l'Asie du Nord, traversant la frontière naturelle des monts Oural."),
            en = LocalizedContent("Which transcontinental country spans Europe and Asia?", listOf("Turkey", "Russia", "Egypt", "Middle East"), "Geography", "Russia is the largest country in the world and its territory spans both Eastern Europe and Northern Asia, crossing the natural boundary of the Ural Mountains."),
            zh = LocalizedContent("哪个横跨欧洲和亚洲的洲际国家？", listOf("土耳其", "俄罗斯", "埃及", "中东"), "地理", "俄罗斯是世界上最大的国家，其领土横跨东欧和北亚，跨越乌拉尔山脉的自然边界。"),
            es = LocalizedContent("¿Qué país transcontinental se extiende por Europa y Asia?", listOf("Turquía", "Rusia", "Egipto", "Medio Oriente"), "Geografia", "Rusia es el país más grande del mundo y su territorio se extiende tanto por Europa del Este como por Asia del Norte, cruzando la frontera natural de los montes Urales.")
        ),
        BilingualQuestion(
            id = 12075, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La ville de Gibraltar est un territoire de?", listOf("Espagne", "Royaume-Uni", "Maroc", "Portugal"), "Géographie", "Gibraltar est un territoire britannique d'outre-mer situé à l'extrémité sud de l'Espagne, cédé au Royaume-Uni par le traité d'Utrecht en 1713."),
            en = LocalizedContent("The city of Gibraltar is a territory of?", listOf("Spain", "United Kingdom", "Morocco", "Portugal"), "Geography", "Gibraltar is a British Overseas Territory located at the southern tip of Spain, ceded to the United Kingdom by the Treaty of Utrecht in 1713."),
            zh = LocalizedContent("直布罗陀市是哪个国家的领土？", listOf("西班牙", "英国", "摩洛哥", "葡萄牙"), "地理", "直布罗陀是位于西班牙南端的英国海外领土，根据1713年的《乌得勒支条约》割让给英国。"),
            es = LocalizedContent("¿La ciudad de Gibraltar es un territorio de?", listOf("España", "Reino Unido", "Marruecos", "Portugal"), "Geografia", "Gibraltar es un territorio británico de ultramar situado en el extremo sur de España, cedido al Reino Unido por el Tratado de Utrecht en 1713.")
        ),
        BilingualQuestion(
            id = 12076, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel État-cité est une enclave dans Rome?", listOf("Monaco", "Vatican", "Liechtenstein", "Andorre"), "Géographie", "Le Vatican est un État souverain enclavé dans la ville de Rome, en Italie. C'est le plus petit État du monde, siège de l'Église catholique romaine."),
            en = LocalizedContent("Which city-state is an enclave within Rome?", listOf("Monaco", "Vatican City", "Liechtenstein", "Andorra"), "Geography", "Vatican City is a sovereign state enclaved within the city of Rome, Italy. It is the smallest state in the world and the seat of the Roman Catholic Church."),
            zh = LocalizedContent("哪个城邦是罗马内的飞地？", listOf("摩纳哥", "梵蒂冈", "列支敦士登", "安道尔"), "地理", "梵蒂冈是位于意大利罗马市内的主权飞地，是世界上最小的国家，也是罗马天主教会的所在地。"),
            es = LocalizedContent("¿Qué ciudad-estado es un enclave dentro de Roma?", listOf("Mónaco", "Ciudad del Vaticano", "Liechtenstein", "Andorra"), "Geografia", "La Ciudad del Vaticano es un estado soberano enclavado dentro de la ciudad de Roma, Italia. Es el estado más pequeño del mundo y sede de la Iglesia Católica Romana.")
        ),
        BilingualQuestion(
            id = 12077, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le Groenland appartient à quel pays?", listOf("Norvège", "Danemark", "Islande", "Royaume-Uni"), "Géographie", "Le Groenland est un territoire autonome du Royaume du Danemark depuis 1953, bien qu'il bénéficie d'une large autonomie depuis 2009."),
            en = LocalizedContent("Greenland belongs to which country?", listOf("Norway", "Denmark", "Iceland", "United Kingdom"), "Geography", "Greenland has been an autonomous territory within the Kingdom of Denmark since 1953, although it has enjoyed extensive self-government since 2009."),
            zh = LocalizedContent("格陵兰属于哪个国家？", listOf("挪威", "丹麦", "冰岛", "英国"), "地理", "格陵兰自1953年起成为丹麦王国内的自治领土，尽管自2009年以来享有广泛的自治权。"),
            es = LocalizedContent("¿Groenlandia pertenece a qué país?", listOf("Noruega", "Dinamarca", "Islandia", "Reino Unido"), "Geografia", "Groenlandia es un territorio autónomo del Reino de Dinamarca desde 1953, aunque goza de una amplia autonomía desde 2009.")
        ),
        BilingualQuestion(
            id = 12078, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les îles Féroé appartiennent à quel pays?", listOf("Islande", "Danemark", "Norvège", "Suède"), "Géographie", "Les îles Féroé sont un territoire autonome du Royaume du Danemark depuis 1948, bien qu'elles ne fassent pas partie de l'Union européenne."),
            en = LocalizedContent("The Faroe Islands belong to which country?", listOf("Iceland", "Denmark", "Norway", "Sweden"), "Geography", "The Faroe Islands have been an autonomous territory within the Kingdom of Denmark since 1948, although they are not part of the European Union."),
            zh = LocalizedContent("法罗群岛属于哪个国家？", listOf("冰岛", "丹麦", "挪威", "瑞典"), "地理", "法罗群岛自1948年起成为丹麦王国内的自治领土，尽管它们不属于欧盟。"),
            es = LocalizedContent("¿Las islas Feroe pertenecen a qué país?", listOf("Islandia", "Dinamarca", "Noruega", "Suecia"), "Geografia", "Las islas Feroe son un territorio autónomo del Reino de Dinamarca desde 1948, aunque no forman parte de la Unión Europea.")
        ),
        BilingualQuestion(
            id = 12079, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le plus long fleuve d'Europe est?", listOf("Rhin", "Danube", "Volga", "Loire"), "Géographie", "La Volga est le plus long fleuve d'Europe avec 3 531 km, traversant la Russie et se jetant dans la mer Caspienne."),
            en = LocalizedContent("What is the longest river in Europe?", listOf("Rhine", "Danube", "Volga", "Loire"), "Geography", "The Volga is the longest river in Europe at 3,531 km, flowing through Russia and emptying into the Caspian Sea."),
            zh = LocalizedContent("欧洲最长的河流是？", listOf("莱茵河", "多瑙河", "伏尔加河", "卢瓦尔河"), "地理", "伏尔加河是欧洲最长的河流，全长3531公里，流经俄罗斯并注入里海。"),
            es = LocalizedContent("¿Cuál es el río más largo de Europa?", listOf("Rin", "Danubio", "Volga", "Loira"), "Geografía", "El Volga es el río más largo de Europa con 3.531 km, fluyendo a través de Rusia y desembocando en el mar Caspio.")
        ),
        BilingualQuestion(
            id = 12080, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le lac le plus profond du monde est?", listOf("Lac Tanganyika", "Lac Baïkal", "Lac Tanganyika", "Lac Malawi"), "Géographie", "Le lac Baïkal, situé en Sibérie, atteint une profondeur maximale de 1 642 mètres, ce qui en fait le lac le plus profond de la planète."),
            en = LocalizedContent("What is the deepest lake in the world?", listOf("Lake Tanganyika", "Lake Baikal", "Lake Tanganyika", "Lake Malawi"), "Geography", "Lake Baikal, located in Siberia, reaches a maximum depth of 1,642 meters, making it the deepest lake on the planet."),
            zh = LocalizedContent("世界上最深的湖泊是？", listOf("坦噶尼喀湖", "贝加尔湖", "坦噶尼喀湖", "马拉维湖"), "地理", "贝加尔湖位于西伯利亚，最大深度达1642米，是地球上最深的湖泊。"),
            es = LocalizedContent("¿Cuál es el lago más profundo del mundo?", listOf("Lago Tanganica", "Lago Baikal", "Lago Tanganica", "Lago Malaui"), "Geografía", "El lago Baikal, situado en Siberia, alcanza una profundidad máxima de 1.642 metros, lo que lo convierte en el lago más profundo del planeta.")
        ),
        BilingualQuestion(
            id = 12081, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand producteur de cacao au monde?", listOf("Ghana", "Nigeria", "Indonésie", "Côte d'Ivoire"), "Géographie", "La Côte d'Ivoire est le premier producteur mondial de cacao depuis les années 1970, représentant environ 40% de la production globale."),
            en = LocalizedContent("Which is the world's largest cocoa producer?", listOf("Ghana", "Nigeria", "Indonesia", "Ivory Coast"), "Geography", "Ivory Coast has been the world's leading cocoa producer since the 1970s, accounting for about 40% of global production."),
            zh = LocalizedContent("世界上最大的可可生产国是？", listOf("加纳", "尼日利亚", "印度尼西亚", "科特迪瓦"), "地理", "科特迪瓦自20世纪70年代以来一直是全球最大的可可生产国，约占全球产量的40%。"),
            es = LocalizedContent("¿Cuál es el mayor productor de cacao del mundo?", listOf("Ghana", "Nigeria", "Indonesia", "Costa de Marfil"), "Geografía", "Costa de Marfil es el principal productor mundial de cacao desde la década de 1970, representando aproximadamente el 40% de la producción global.")
        ),
        BilingualQuestion(
            id = 12082, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La ville de Dubrovnik est située en?", listOf("Serbie", "Croatie", "Bosnie", "Monténégro"), "Géographie", "Dubrovnik est une ville portuaire historique située sur la côte dalmate de la mer Adriatique, appartenant à la Croatie depuis son indépendance en 1991."),
            en = LocalizedContent("The city of Dubrovnik is located in?", listOf("Serbia", "Croatia", "Bosnia", "Montenegro"), "Geography", "Dubrovnik is a historic port city on the Dalmatian coast of the Adriatic Sea, belonging to Croatia since its independence in 1991."),
            zh = LocalizedContent("杜布罗夫尼克市位于？", listOf("塞尔维亚", "克罗地亚", "波斯尼亚", "黑山"), "地理", "杜布罗夫尼克是亚得里亚海达尔马提亚海岸的一座历史港口城市，自1991年独立以来属于克罗地亚。"),
            es = LocalizedContent("La ciudad de Dubrovnik está situada en?", listOf("Serbia", "Croacia", "Bosnia", "Montenegro"), "Geografía", "Dubrovnik es una ciudad portuaria histórica en la costa dálmata del mar Adriático, perteneciente a Croacia desde su independencia en 1991.")
        ),
        BilingualQuestion(
            id = 12083, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel désert s'étend sur quatre pays d'Afrique du Sud?", listOf("Kalahari", "Namib", "Karoo", "Atacama"), "Géographie", "Le Kalahari s'étend sur le Botswana, la Namibie, l'Afrique du Sud et une partie de l'Angola, ce qui en fait le désert couvrant quatre pays d'Afrique australe."),
            en = LocalizedContent("Which desert spans four countries in Southern Africa?", listOf("Kalahari", "Namib", "Karoo", "Atacama"), "Geography", "The Kalahari extends across Botswana, Namibia, South Africa, and part of Angola, making it the desert covering four countries in Southern Africa."),
            zh = LocalizedContent("哪个沙漠横跨南部非洲的四个国家？", listOf("卡拉哈里沙漠", "纳米布沙漠", "卡鲁沙漠", "阿塔卡马沙漠"), "地理", "卡拉哈里沙漠横跨博茨瓦纳、纳米比亚、南非和安哥拉的一部分，是覆盖南部非洲四个国家的沙漠。"),
            es = LocalizedContent("¿Qué desierto abarca cuatro países del sur de África?", listOf("Kalahari", "Namib", "Karoo", "Atacama"), "Geografía", "El Kalahari se extiende por Botsuana, Namibia, Sudáfrica y parte de Angola, siendo el desierto que cubre cuatro países del sur de África.")
        ),
        BilingualQuestion(
            id = 12084, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La région du Xinjiang appartient à quel pays?", listOf("Mongolie", "Russie", "Chine", "Kazakhstan"), "Géographie", "Le Xinjiang est une région autonome située dans le nord-ouest de la Chine, officiellement reconnue comme faisant partie intégrante de la République populaire de Chine."),
            en = LocalizedContent("The Xinjiang region belongs to which country?", listOf("Mongolia", "Russia", "China", "Kazakhstan"), "Geography", "Xinjiang is an autonomous region in northwestern China, officially recognized as an integral part of the People's Republic of China."),
            zh = LocalizedContent("新疆地区属于哪个国家？", listOf("蒙古", "俄罗斯", "中国", "哈萨克斯坦"), "地理", "新疆是中国西北部的一个自治区，被正式承认为中华人民共和国不可分割的一部分。"),
            es = LocalizedContent("La región de Xinjiang pertenece a qué país?", listOf("Mongolia", "Rusia", "China", "Kazajistán"), "Geografía", "Xinjiang es una región autónoma en el noroeste de China, oficialmente reconocida como parte integral de la República Popular China.")
        ),
        BilingualQuestion(
            id = 12085, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel détroit relie la Méditerranée à l'Atlantique?", listOf("Détroit de Suez", "Détroit de Gibraltar", "Détroit de Béring", "Pas-de-Calais"), "Géographie", "Le détroit de Gibraltar sépare l'Europe (Espagne) de l'Afrique (Maroc), reliant la mer Méditerranée à l'océan Atlantique."),
            en = LocalizedContent("Which strait connects the Mediterranean to the Atlantic?", listOf("Strait of Suez", "Strait of Gibraltar", "Bering Strait", "Strait of Dover"), "Geography", "The Strait of Gibraltar separates Europe (Spain) from Africa (Morocco), connecting the Mediterranean Sea to the Atlantic Ocean."),
            zh = LocalizedContent("哪个海峡连接地中海和大西洋？", listOf("苏伊士海峡", "直布罗陀海峡", "白令海峡", "多佛尔海峡"), "地理", "直布罗陀海峡分隔欧洲（西班牙）和非洲（摩洛哥），连接地中海和大西洋。"),
            es = LocalizedContent("¿Qué estrecho conecta el Mediterráneo con el Atlántico?", listOf("Estrecho de Suez", "Estrecho de Gibraltar", "Estrecho de Bering", "Paso de Calais"), "Geografía", "El estrecho de Gibraltar separa Europa (España) de África (Marruecos), conectando el mar Mediterráneo con el océano Atlántico.")
        ),
        BilingualQuestion(
            id = 12086, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le Péloponnèse est une région de quel pays?", listOf("Albanie", "Grèce", "Turquie", "Bulgarie"), "Géographie", "Le Péloponnèse est une péninsule située dans le sud de la Grèce continentale, reliée au reste du pays par l'isthme de Corinthe."),
            en = LocalizedContent("The Peloponnese is a region of which country?", listOf("Albania", "Greece", "Turkey", "Bulgaria"), "Geography", "The Peloponnese is a peninsula in southern mainland Greece, connected to the rest of the country by the Isthmus of Corinth."),
            zh = LocalizedContent("伯罗奔尼撒是哪个国家的地区？", listOf("阿尔巴尼亚", "希腊", "土耳其", "保加利亚"), "地理", "伯罗奔尼撒是希腊大陆南部的一个半岛，通过科林斯地峡与希腊其他部分相连。"),
            es = LocalizedContent("El Peloponeso es una región de qué país?", listOf("Albania", "Grecia", "Turquía", "Bulgaria"), "Geografía", "El Peloponeso es una península en el sur de la Grecia continental, conectada al resto del país por el istmo de Corinto.")
        ),
        BilingualQuestion(
            id = 12087, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac d'eau douce du monde?", listOf("Lac Supérieur", "Lac Baikal", "Lac Michigan", "Lac Tanganyika"), "Géographie", "Le lac Supérieur est le plus grand lac d'eau douce du monde par sa superficie, avec environ 82 100 km². Il fait partie des Grands Lacs d'Amérique du Nord, à la frontière entre les États-Unis et le Canada."),
            en = LocalizedContent("What is the largest freshwater lake in the world?", listOf("Lake Superior", "Lake Baikal", "Lake Michigan", "Lake Tanganyika"), "Geography", "Lake Superior is the largest freshwater lake in the world by surface area, at about 82,100 km². It is part of the Great Lakes of North America, on the border between the United States and Canada."),
            zh = LocalizedContent("世界上最大的淡水湖是？", listOf("苏必利尔湖", "贝加尔湖", "密歇根湖", "坦噶尼喀湖"), "地理", "苏必利尔湖是世界上面积最大的淡水湖，约82100平方公里。它是北美五大湖的一部分，位于美国和加拿大边境。"),
            es = LocalizedContent("¿Cuál es el lago de agua dulce más grande del mundo?", listOf("Lago Superior", "Lago Baikal", "Lago Míchigan", "Lago Tanganica"), "Geografía", "El lago Superior es el lago de agua dulce más grande del mundo por superficie, con aproximadamente 82.100 km². Forma parte de los Grandes Lagos de América del Norte, en la frontera entre Estados Unidos y Canadá.")
        ),
        BilingualQuestion(
            id = 12088, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'Île Norfolk appartient à quel pays?", listOf("Nouvelle-Zélande", "Australie", "Papouasie-Nouvelle-Guinée", "Samoa"), "Géographie", "L'île Norfolk est un territoire extérieur australien situé dans l'océan Pacifique, entre la Nouvelle-Zélande et la Nouvelle-Calédonie. Elle est administrée par l'Australie depuis 1914."),
            en = LocalizedContent("Norfolk Island belongs to which country?", listOf("New Zealand", "Australia", "Papua New Guinea", "Samoa"), "Geography", "Norfolk Island is an external territory of Australia located in the Pacific Ocean, between New Zealand and New Caledonia. It has been administered by Australia since 1914."),
            zh = LocalizedContent("诺福克岛属于哪个国家？", listOf("新西兰", "澳大利亚", "巴布亚新几内亚", "萨摩亚"), "地理", "诺福克岛是澳大利亚的海外领地，位于太平洋，介于新西兰和新喀里多尼亚之间。自1914年起由澳大利亚管辖。"),
            es = LocalizedContent("La isla Norfolk pertenece a qué país?", listOf("Nueva Zelanda", "Australia", "Papúa Nueva Guinea", "Samoa"), "Geografía", "La isla Norfolk es un territorio externo de Australia ubicado en el océano Pacífico, entre Nueva Zelanda y Nueva Caledonia. Es administrada por Australia desde 1914.")
        ),
        BilingualQuestion(
            id = 12089, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel État-cité est le plus grand d'Europe?", listOf("Monaco", "Vatican", "San Marino", "Liechtenstein"), "Géographie", "San Marino est une enclave entièrement entourée par l'Italie, ce qui en fait un État-cité, et avec une superficie d'environ 61 km², il est le plus grand de ce type en Europe."),
            en = LocalizedContent("Which city-state is the largest in Europe?", listOf("Monaco", "Vatican", "San Marino", "Liechtenstein"), "Geography", "San Marino is an enclave entirely surrounded by Italy, making it a city-state, and with an area of about 61 km², it is the largest of its kind in Europe."),
            zh = LocalizedContent("欧洲最大的城邦是哪个？", listOf("摩纳哥", "梵蒂冈", "圣马力诺", "列支敦士登"), "地理", "圣马力诺是一个完全被意大利包围的内飞地，因此是一个城邦，面积约61平方公里，是欧洲此类城邦中最大的。"),
            es = LocalizedContent("¿Qué ciudad-estado es la más grande de Europa?", listOf("Mónaco", "Vaticano", "San Marino", "Liechtenstein"), "Geografía", "San Marino es un enclave completamente rodeado por Italia, lo que lo convierte en una ciudad-estado, y con una superficie de aproximadamente 61 km², es el más grande de su tipo en Europa.")
        ),
        BilingualQuestion(
            id = 12090, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le delta du Mékong est situé dans quel pays?", listOf("Thaïlande", "Cambodge", "Viêt Nam", "Laos"), "Géographie", "Le delta du Mékong se trouve au Viêt Nam, où le fleuve se jette dans la mer de Chine méridionale après avoir traversé plusieurs pays d'Asie du Sud-Est."),
            en = LocalizedContent("The Mekong Delta is located in which country?", listOf("Thailand", "Cambodia", "Vietnam", "Laos"), "Geography", "The Mekong Delta is in Vietnam, where the river flows into the South China Sea after passing through several Southeast Asian countries."),
            zh = LocalizedContent("湄公河三角洲位于哪个国家？", listOf("泰国", "柬埔寨", "越南", "老挝"), "地理", "湄公河三角洲位于越南，河流在流经多个东南亚国家后在此注入南海。"),
            es = LocalizedContent("¿El delta del Mekong se encuentra en qué país?", listOf("Tailandia", "Camboya", "Vietnam", "Laos"), "Geografía", "El delta del Mekong se encuentra en Vietnam, donde el río desemboca en el mar de China Meridional tras atravesar varios países del sudeste asiático.")
        ),
        BilingualQuestion(
            id = 12091, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel manga a été adapté en anime le plus de fois?", listOf("One Piece", "Naruto", "Bleach", "Dragon Ball"), "Culture", "Bleach détient le record du manga le plus adapté en anime, avec plusieurs séries, films et OAV produits depuis 2004."),
            en = LocalizedContent("Which manga has been adapted into anime the most times?", listOf("One Piece", "Naruto", "Bleach", "Dragon Ball"), "Culture", "Bleach holds the record for the most anime adaptations of a manga, with multiple series, films, and OVAs produced since 2004."),
            zh = LocalizedContent("哪部漫画被改编成动画的次数最多？", listOf("海贼王", "火影忍者", "死神", "龙珠"), "文化", "《死神》保持着漫画改编动画次数最多的纪录，自2004年以来制作了多部系列、电影和OVA。"),
            es = LocalizedContent("¿Qué manga ha sido adaptado al anime más veces?", listOf("One Piece", "Naruto", "Bleach", "Dragon Ball"), "Cultura", "Bleach tiene el récord de la mayor cantidad de adaptaciones al anime de un manga, con múltiples series, películas y OVA producidas desde 2004.")
        ),
        BilingualQuestion(
            id = 12092, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus célèbre personnage de manga?", listOf("Luffy", "Pikachu", "Monkey D. Luffy", "Naruto"), "Culture", "Monkey D. Luffy est le héros de One Piece, le manga le plus vendu de l'histoire, ce qui en fait le personnage le plus emblématique du genre."),
            en = LocalizedContent("Who is the most famous manga character?", listOf("Luffy", "Pikachu", "Monkey D. Luffy", "Naruto"), "Culture", "Monkey D. Luffy is the hero of One Piece, the best-selling manga in history, making him the most iconic character in the genre."),
            zh = LocalizedContent("最著名的漫画角色是谁？", listOf("路飞", "皮卡丘", "蒙奇·D·路飞", "鸣人"), "文化", "蒙奇·D·路飞是《海贼王》的主角，该漫画是历史上销量最高的漫画，使他成为该类型中最具标志性的角色。"),
            es = LocalizedContent("¿Cuál es el personaje de manga más famoso?", listOf("Luffy", "Pikachu", "Monkey D. Luffy", "Naruto"), "Cultura", "Monkey D. Luffy es el héroe de One Piece, el manga más vendido de la historia, lo que lo convierte en el personaje más emblemático del género.")
        ),
        BilingualQuestion(
            id = 12093, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La série 'Les Blagues de Toto' a été créée en quelle année?", listOf("1999", "2000", "2001", "2002"), "Culture", "La série animée 'Les Blagues de Toto' a été diffusée pour la première fois en 2000 sur France 3, adaptée des bandes dessinées de Bernadette Després."),
            en = LocalizedContent("The series 'Les Blagues de Toto' was created in which year?", listOf("1999", "2000", "2001", "2002"), "Culture", "The animated series 'Les Blagues de Toto' first aired in 2000 on France 3, adapted from the comic strips by Bernadette Després."),
            zh = LocalizedContent("《托托的笑话》系列是在哪一年创作的？", listOf("1999", "2000", "2001", "2002"), "文化", "动画系列《托托的笑话》于2000年在法国3台首播，改编自贝尔纳黛特·德普雷的漫画。"),
            es = LocalizedContent("La serie 'Les Blagues de Toto' fue creada en qué año?", listOf("1999", "2000", "2001", "2002"), "Cultura", "La serie animada 'Les Blagues de Toto' se emitió por primera vez en 2000 en France 3, adaptada de las tiras cómicas de Bernadette Després.")
        ),
        BilingualQuestion(
            id = 12094, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel auteur français a créé l'univers de Tintin?", listOf("Hergé", "Franquin", "Peyo", "Recchioni"), "Culture", "Hergé, de son vrai nom Georges Remi, est le dessinateur et scénariste belge qui a créé le personnage de Tintin en 1929 pour le journal Le Petit Vingtième."),
            en = LocalizedContent("Which French author created the universe of Tintin?", listOf("Hergé", "Franquin", "Peyo", "Recchioni"), "Culture", "Hergé, whose real name was Georges Remi, is the Belgian cartoonist and writer who created the character Tintin in 1929 for the newspaper Le Petit Vingtième."),
            zh = LocalizedContent("哪位法国作者创造了丁丁的世界？", listOf("埃尔热", "弗朗坎", "佩约", "雷乔尼"), "文化", "埃尔热，本名乔治·雷米，是比利时漫画家和编剧，于1929年为《小二十世纪》报创造了丁丁这个角色。"),
            es = LocalizedContent("¿Qué autor francés creó el universo de Tintín?", listOf("Hergé", "Franquin", "Peyo", "Recchioni"), "Cultura", "Hergé, cuyo nombre real era Georges Remi, es el dibujante y guionista belga que creó el personaje de Tintín en 1929 para el periódico Le Petit Vingtième.")
        ),
        BilingualQuestion(
            id = 12095, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le jeu de société 'Monopoly' a été créé en?", listOf("1930", "1931", "1933", "1935"), "Culture", "Le Monopoly a été créé par Charles Darrow en 1933, pendant la Grande Dépression, et breveté en 1935."),
            en = LocalizedContent("The board game 'Monopoly' was created in?", listOf("1930", "1931", "1933", "1935"), "Culture", "Monopoly was created by Charles Darrow in 1933 during the Great Depression and patented in 1935."),
            zh = LocalizedContent("棋盘游戏《大富翁》是在哪一年创建的？", listOf("1930", "1931", "1933", "1935"), "文化", "《大富翁》由查尔斯·达罗于1933年大萧条时期创建，并于1935年获得专利。"),
            es = LocalizedContent("El juego de mesa 'Monopoly' fue creado en?", listOf("1930", "1931", "1933", "1935"), "Cultura", "El Monopoly fue creado por Charles Darrow en 1933 durante la Gran Depresión y patentado en 1935.")
        ),
        BilingualQuestion(
            id = 12096, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel jeu de plateau se joue avec deux dés?", listOf("Jeu de l'Oie", "Parchisi", "Backgammon", "Snakes and Ladders"), "Culture", "Le backgammon est un jeu de plateau où chaque joueur déplace ses pions en fonction des résultats de deux dés. C'est l'un des plus anciens jeux de stratégie connus."),
            en = LocalizedContent("Which board game is played with two dice?", listOf("Game of the Goose", "Parcheesi", "Backgammon", "Snakes and Ladders"), "Culture", "Backgammon is a board game where each player moves their pieces based on the results of two dice. It is one of the oldest known strategy games."),
            zh = LocalizedContent("哪种棋盘游戏使用两个骰子？", listOf("鹅棋", "帕奇西", "双陆棋", "蛇梯棋"), "文化", "双陆棋是一种棋盘游戏，每位玩家根据两个骰子的结果移动棋子。它是最古老的策略游戏之一。"),
            es = LocalizedContent("¿Qué juego de mesa se juega con dos dados?", listOf("Juego de la Oca", "Parchís", "Backgammon", "Serpientes y Escaleras"), "Cultura", "El backgammon es un juego de mesa donde cada jugador mueve sus fichas según los resultados de dos dados. Es uno de los juegos de estrategia más antiguos conocidos.")
        ),
        BilingualQuestion(
            id = 12097, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La célèbre bande dessinée 'Astérix' a été créée par?", listOf("Uderzo", "Goscinny et Uderzo", "Pencoat", "Goscinny"), "Culture", "Astérix a été créée par le scénariste René Goscinny et le dessinateur Albert Uderzo, duo emblématique de la bande dessinée franco-belge."),
            en = LocalizedContent("The famous comic 'Asterix' was created by?", listOf("Uderzo", "Goscinny and Uderzo", "Pencoat", "Goscinny"), "Culture", "Asterix was created by writer René Goscinny and artist Albert Uderzo, an iconic duo of Franco-Belgian comics."),
            zh = LocalizedContent("著名漫画《高卢英雄传》是由谁创作的？", listOf("乌德佐", "戈西尼和乌德佐", "彭科", "戈西尼"), "文化", "《高卢英雄传》由编剧勒内·戈西尼和画家阿尔伯特·乌德佐创作，他们是法比漫画的标志性二人组。"),
            es = LocalizedContent("El famoso cómic 'Astérix' fue creado por?", listOf("Uderzo", "Goscinny y Uderzo", "Pencoat", "Goscinny"), "Cultura", "Astérix fue creado por el guionista René Goscinny y el dibujante Albert Uderzo, un dúo emblemático del cómic franco-belga.")
        ),
        BilingualQuestion(
            id = 12098, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le jeu 'Scrabble' utilise combien de lettres?", listOf("80", "90", "100", "120"), "Culture", "Le Scrabble officiel comprend 102 lettres, mais seulement 100 sont utilisées dans le jeu, car deux sont des jokers."),
            en = LocalizedContent("The game 'Scrabble' uses how many letters?", listOf("80", "90", "100", "120"), "Culture", "Official Scrabble includes 102 letters, but only 100 are used in the game because two are blanks."),
            zh = LocalizedContent("游戏《拼字游戏》使用多少个字母？", listOf("80", "90", "100", "120"), "文化", "官方拼字游戏包含102个字母，但游戏中只使用100个，因为有两个是空白牌。"),
            es = LocalizedContent("El juego 'Scrabble' utiliza cuántas letras?", listOf("80", "90", "100", "120"), "Cultura", "El Scrabble oficial incluye 102 letras, pero solo se usan 100 en el juego porque dos son comodines.")
        ),
        BilingualQuestion(
            id = 12099, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plat national de la Thaïlande?", listOf("Pad Thaï", "Tom Yum", "Gaeng Keow Wan", "Larb"), "Culture", "Le Pad Thaï est considéré comme le plat national de la Thaïlande car il incarne l'équilibre des saveurs thaïlandaises (sucré, salé, acide, épicé) et est un mets de rue emblématique du pays."),
            en = LocalizedContent("What is the national dish of Thailand?", listOf("Pad Thai", "Tom Yum", "Gaeng Keow Wan", "Larb"), "Culture", "Pad Thai is considered the national dish of Thailand because it embodies the balance of Thai flavors (sweet, salty, sour, spicy) and is an iconic street food of the country."),
            zh = LocalizedContent("泰国的国菜是什么？", listOf("泰式炒河粉", "冬阴功汤", "绿咖喱", "辣肉沙拉"), "文化", "泰式炒河粉被认为是泰国的国菜，因为它体现了泰国风味的平衡（甜、咸、酸、辣），并且是该国标志性的街头美食。"),
            es = LocalizedContent("¿Cuál es el plato nacional de Tailandia?", listOf("Pad Thai", "Tom Yum", "Gaeng Keow Wan", "Larb"), "Cultura", "El Pad Thai es considerado el plato nacional de Tailandia porque encarna el equilibrio de sabores tailandeses (dulce, salado, ácido, picante) y es un plato callejero emblemático del país.")
        ),
        BilingualQuestion(
            id = 12100, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel anime a été regardé plus de 50 milliards de fois?", listOf("Death Note", "Attack on Titan", "Demon Slayer", "Jujutsu Kaisen"), "Culture", "Demon Slayer a atteint ce record d'audience cumulée grâce à son immense popularité mondiale, notamment après la sortie du film \"Le Train de l'Infini\" en 2020."),
            en = LocalizedContent("Which anime has been watched over 50 billion times?", listOf("Death Note", "Attack on Titan", "Demon Slayer", "Jujutsu Kaisen"), "Culture", "Demon Slayer achieved this cumulative viewership record thanks to its immense global popularity, especially after the release of the film 'Mugen Train' in 2020."),
            zh = LocalizedContent("哪部动漫的观看次数超过500亿次？", listOf("死亡笔记", "进击的巨人", "鬼灭之刃", "咒术回战"), "文化", "《鬼灭之刃》凭借其巨大的全球人气，尤其是在2020年电影《无限列车》上映后，达到了这一累计观看记录。"),
            es = LocalizedContent("¿Qué anime ha sido visto más de 50 mil millones de veces?", listOf("Death Note", "Attack on Titan", "Demon Slayer", "Jujutsu Kaisen"), "Cultura", "Demon Slayer alcanzó este récord de audiencia acumulada gracias a su inmensa popularidad mundial, especialmente tras el estreno de la película 'El Tren Infinito' en 2020.")
        ),
        BilingualQuestion(
            id = 12101, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La BD 'Mafalda' a été créée par quel auteur?", listOf("Herge", "Quino", "Franquin", "Peyo"), "Culture", "Mafalda a été créée par l'Argentin Quino en 1964. Ce personnage de bande dessinée est devenu un symbole de la critique sociale et politique en Amérique latine."),
            en = LocalizedContent("The comic 'Mafalda' was created by which author?", listOf("Herge", "Quino", "Franquin", "Peyo"), "Culture", "Mafalda was created by the Argentine Quino in 1964. This comic strip character became a symbol of social and political criticism in Latin America."),
            zh = LocalizedContent("漫画《玛法达》是由哪位作者创作的？", listOf("埃尔热", "季诺", "弗朗坎", "佩约"), "文化", "玛法达是由阿根廷人季诺于1964年创作的。这个漫画人物成为拉丁美洲社会和政治批评的象征。"),
            es = LocalizedContent("La historieta 'Mafalda' fue creada por ¿qué autor?", listOf("Herge", "Quino", "Franquin", "Peyo"), "Cultura", "Mafalda fue creada por el argentino Quino en 1964. Este personaje de historieta se convirtió en un símbolo de la crítica social y política en América Latina.")
        ),
        BilingualQuestion(
            id = 12102, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien jeu de société encore produit?", listOf("Échecs", "Dames", "Jeu de l'Oie", "Mah-Jong"), "Culture", "Le Jeu de l'Oie est attesté dès le XVIe siècle en Italie et sa production n'a jamais cessé, ce qui en fait le plus ancien jeu de société encore fabriqué."),
            en = LocalizedContent("What is the oldest board game still in production?", listOf("Chess", "Checkers", "Game of the Goose", "Mahjong"), "Culture", "The Game of the Goose has been attested since the 16th century in Italy and its production has never ceased, making it the oldest board game still manufactured."),
            zh = LocalizedContent("仍在生产的最古老的棋盘游戏是什么？", listOf("国际象棋", "跳棋", "鹅棋", "麻将"), "文化", "鹅棋自16世纪在意大利就有记载，其生产从未停止，使其成为仍在制造的最古老的棋盘游戏。"),
            es = LocalizedContent("¿Cuál es el juego de mesa más antiguo que todavía se produce?", listOf("Ajedrez", "Damas", "Juego de la Oca", "Mahjong"), "Cultura", "El Juego de la Oca está atestiguado desde el siglo XVI en Italia y su producción nunca ha cesado, lo que lo convierte en el juego de mesa más antiguo que aún se fabrica.")
        ),
        BilingualQuestion(
            id = 12103, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le 'Tarot' comprend combien de cartes?", listOf("52", "78", "100", "120"), "Culture", "Le tarot traditionnel se compose de 78 cartes, réparties en 22 arcanes majeurs et 56 arcanes mineurs."),
            en = LocalizedContent("How many cards does the 'Tarot' consist of?", listOf("52", "78", "100", "120"), "Culture", "The traditional tarot consists of 78 cards, divided into 22 major arcana and 56 minor arcana."),
            zh = LocalizedContent("“塔罗牌”包含多少张牌？", listOf("52", "78", "100", "120"), "文化", "传统塔罗牌由78张牌组成，分为22张大阿卡纳和56张小阿卡纳。"),
            es = LocalizedContent("¿Cuántas cartas tiene el 'Tarot'?", listOf("52", "78", "100", "120"), "Cultura", "El tarot tradicional consta de 78 cartas, divididas en 22 arcanos mayores y 56 arcanos menores.")
        ),
        BilingualQuestion(
            id = 12104, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gateau français est originaire de Bordeaux?", listOf("Canelé", "Religieuse", "Mille-feuille", "Éclair"), "Culture", "Le canelé est un petit gâteau à la pâte molle et caramélisée, parfumé au rhum et à la vanille, dont la recette est traditionnellement attribuée aux religieuses du couvent des Annonciades de Bordeaux au XVIIIe siècle."),
            en = LocalizedContent("Which French cake originates from Bordeaux?", listOf("Canelé", "Religieuse", "Mille-feuille", "Éclair"), "Culture", "The canelé is a small cake with a soft, caramelized custard, flavored with rum and vanilla, whose recipe is traditionally attributed to the nuns of the Annonciades convent in Bordeaux in the 18th century."),
            zh = LocalizedContent("哪种法国蛋糕起源于波尔多？", listOf("可露丽", "修女泡芙", "千层酥", "闪电泡芙"), "文化", "可露丽是一种外焦内软的小蛋糕，以朗姆酒和香草调味，其配方传统上归功于18世纪波尔多圣母领报修道院的修女。"),
            es = LocalizedContent("¿Qué pastel francés es originario de Burdeos?", listOf("Canelé", "Religieuse", "Mille-feuille", "Éclair"), "Cultura", "El canelé es un pequeño pastel de masa blanda y caramelizada, aromatizado con ron y vainilla, cuya receta se atribuye tradicionalmente a las monjas del convento de las Anunciadas de Burdeos en el siglo XVIII.")
        ),
        BilingualQuestion(
            id = 12105, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Le fromage 'Feta' est originaire de?", listOf("France", "Grèce", "Turquie", "Italie"), "Culture", "La feta est un fromage blanc traditionnel grec, protégé par une Appellation d'Origine Protégée (AOP) qui exige qu'il soit produit en Grèce."),
            en = LocalizedContent("The cheese 'Feta' originates from?", listOf("France", "Greece", "Turkey", "Italy"), "Culture", "Feta is a traditional Greek white cheese, protected by a Protected Designation of Origin (PDO) that requires it to be produced in Greece."),
            zh = LocalizedContent("“菲达奶酪”起源于？", listOf("法国", "希腊", "土耳其", "意大利"), "文化", "菲达奶酪是一种传统的希腊白奶酪，受原产地名称保护（PDO），要求必须在希腊生产。"),
            es = LocalizedContent("El queso 'Feta' es originario de?", listOf("Francia", "Grecia", "Turquía", "Italia"), "Cultura", "La feta es un queso blanco tradicional griego, protegido por una Denominación de Origen Protegida (DOP) que exige que se produzca en Grecia.")
        ),
        BilingualQuestion(
            id = 12106, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel anime a battu le record du plus haut budget de film?", listOf("Your Name", "Weathering with You", "Demon Slayer Movie", "Jujutsu Kaisen 0"), "Culture", "Demon Slayer: Mugen Train a coûté environ 15,8 millions de dollars, un record pour un film d'animation japonais, dépassant les budgets habituels du genre."),
            en = LocalizedContent("Which anime broke the record for the highest film budget?", listOf("Your Name", "Weathering with You", "Demon Slayer Movie", "Jujutsu Kaisen 0"), "Culture", "Demon Slayer: Mugen Train cost about $15.8 million, a record for a Japanese animated film, surpassing the usual budgets of the genre."),
            zh = LocalizedContent("哪部动漫打破了电影最高预算记录？", listOf("你的名字。", "天气之子", "鬼灭之刃 无限列车篇", "咒术回战 0"), "文化", "《鬼灭之刃：无限列车》的制作成本约为1580万美元，创下了日本动画电影的新纪录，超过了该类型的常规预算。"),
            es = LocalizedContent("¿Qué anime batió el récord del presupuesto más alto de una película?", listOf("Your Name", "Weathering with You", "Demon Slayer Movie", "Jujutsu Kaisen 0"), "Cultura", "Demon Slayer: Mugen Train costó aproximadamente 15,8 millones de dólares, un récord para una película de animación japonesa, superando los presupuestos habituales del género.")
        ),
        BilingualQuestion(
            id = 12107, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La BD 'Garfield' a été créée par?", listOf("Charles Schulz", "Jim Davis", "Bill Watterson", "Gary Larson"), "Culture", "Jim Davis a créé Garfield en 1978, s'inspirant de son enfance dans une ferme où il côtoyait de nombreux chats."),
            en = LocalizedContent("The comic 'Garfield' was created by?", listOf("Charles Schulz", "Jim Davis", "Bill Watterson", "Gary Larson"), "Culture", "Jim Davis created Garfield in 1978, inspired by his childhood on a farm where he was surrounded by many cats."),
            zh = LocalizedContent("漫画《加菲猫》是由谁创作的？", listOf("查尔斯·舒尔茨", "吉姆·戴维斯", "比尔·沃特森", "加里·拉尔森"), "文化", "吉姆·戴维斯于1978年创作了加菲猫，灵感来源于他在农场度过的童年，那里有许多猫陪伴。"),
            es = LocalizedContent("La historieta 'Garfield' fue creada por?", listOf("Charles Schulz", "Jim Davis", "Bill Watterson", "Gary Larson"), "Cultura", "Jim Davis creó Garfield en 1978, inspirándose en su infancia en una granja donde convivía con muchos gatos.")
        ),
        BilingualQuestion(
            id = 12108, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus célèbre manga horror?", listOf("Tokyo Ghoul", "Hellsing", "Jigoku Shoujo", "Psychological"), "Culture", "Tokyo Ghoul a popularisé le genre horror dans le manga grâce à son univers sombre et ses thèmes psychologiques, devenant une référence mondiale avec son adaptation en anime."),
            en = LocalizedContent("What is the most famous horror manga?", listOf("Tokyo Ghoul", "Hellsing", "Jigoku Shoujo", "Psychological"), "Culture", "Tokyo Ghoul popularized the horror genre in manga thanks to its dark universe and psychological themes, becoming a worldwide reference with its anime adaptation."),
            zh = LocalizedContent("最著名的恐怖漫画是什么？", listOf("东京喰种", "皇家国教骑士团", "地狱少女", "心理类"), "文化", "《东京喰种》凭借其黑暗的世界观和心理主题，在漫画中普及了恐怖类型，并通过动画改编成为全球参考。"),
            es = LocalizedContent("¿Cuál es el manga de terror más famoso?", listOf("Tokyo Ghoul", "Hellsing", "Jigoku Shoujo", "Psychological"), "Cultura", "Tokyo Ghoul popularizó el género de terror en el manga gracias a su universo oscuro y sus temas psicológicos, convirtiéndose en una referencia mundial con su adaptación al anime.")
        ),
    )

    private fun part2(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 12109, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le 'Gyoza' est un plat d'origine?", listOf("Thaïlandaise", "Japonaise", "Coréenne", "Chinoise"), "Culture", "Le gyoza est un ravioli japonais directement inspiré du jiaozi chinois, introduit au Japon par les soldats revenant de Mandchourie après la Seconde Guerre mondiale."),
            en = LocalizedContent("The 'Gyoza' is a dish originating from?", listOf("Thailand", "Japan", "Korea", "China"), "Culture", "Gyoza is a Japanese dumpling directly inspired by Chinese jiaozi, introduced to Japan by soldiers returning from Manchuria after World War II."),
            zh = LocalizedContent("“饺子”是一道源自哪里的菜肴？", listOf("泰国", "日本", "韩国", "中国"), "文化", "日式煎饺直接受中国饺子启发，由二战后从满洲返回的士兵引入日本。"),
            es = LocalizedContent("¿El 'Gyoza' es un plato originario de?", listOf("Tailandia", "Japón", "Corea", "China"), "Cultura", "El gyoza es una empanadilla japonesa directamente inspirada en el jiaozi chino, introducida en Japón por soldados que regresaban de Manchuria después de la Segunda Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 12110, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Le 'Kimchi' est un plat traditionnel de?", listOf("Japon", "Thaïlande", "Corée", "Vietnam"), "Culture", "Le kimchi est un mets emblématique de la Corée, composé de légumes fermentés, généralement du chou chinois, assaisonnés d'épices et de piment. Il est consommé quotidiennement et fait partie intégrante de la culture culinaire coréenne."),
            en = LocalizedContent("The 'Kimchi' is a traditional dish of?", listOf("Japan", "Thailand", "Korea", "Vietnam"), "Culture", "Kimchi is an emblematic dish of Korea, made of fermented vegetables, usually Chinese cabbage, seasoned with spices and chili. It is consumed daily and is an integral part of Korean culinary culture."),
            zh = LocalizedContent("“泡菜”是哪个国家的传统菜肴？", listOf("日本", "泰国", "韩国", "越南"), "文化", "泡菜是韩国的标志性菜肴，由发酵蔬菜（通常是大白菜）制成，用香料和辣椒调味。它每天都被食用，是韩国饮食文化不可或缺的一部分。"),
            es = LocalizedContent("¿El 'Kimchi' es un plato tradicional de?", listOf("Japón", "Tailandia", "Corea", "Vietnam"), "Cultura", "El kimchi es un plato emblemático de Corea, compuesto de verduras fermentadas, generalmente col china, sazonadas con especias y chile. Se consume a diario y es parte integral de la cultura culinaria coreana.")
        ),
        BilingualQuestion(
            id = 12111, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la plus vieille BD du monde?", listOf("Garfield", "Pogo", "The Yellow Kid", "Popeye"), "Culture", "The Yellow Kid, créée par Richard F. Outcault en 1895 dans le New York World, est considérée comme la première bande dessinée moderne grâce à l'utilisation de bulles de parole et d'une narration séquentielle."),
            en = LocalizedContent("What is the oldest comic strip in the world?", listOf("Garfield", "Pogo", "The Yellow Kid", "Popeye"), "Culture", "The Yellow Kid, created by Richard F. Outcault in 1895 in the New York World, is considered the first modern comic strip due to its use of speech balloons and sequential storytelling."),
            zh = LocalizedContent("世界上最古老的漫画是什么？", listOf("加菲猫", "波戈", "黄色小子", "大力水手"), "文化", "《黄色小子》由理查德·F·奥特考特于1895年在《纽约世界报》创作，因其使用对话气泡和连续叙事而被认为是第一部现代漫画。"),
            es = LocalizedContent("¿Cuál es la tira cómica más antigua del mundo?", listOf("Garfield", "Pogo", "The Yellow Kid", "Popeye"), "Cultura", "The Yellow Kid, creada por Richard F. Outcault en 1895 en el New York World, es considerada la primera tira cómica moderna por el uso de globos de diálogo y narración secuencial.")
        ),
        BilingualQuestion(
            id = 12112, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Le 'Sushi' est originaire du?", listOf("Japon", "Chine", "Thaïlande", "Corée"), "Culture", "Le sushi est un plat traditionnel japonais à base de riz vinaigré, de poisson cru et d'algues, dont les origines remontent au Japon."),
            en = LocalizedContent("The 'Sushi' originated from?", listOf("Japan", "China", "Thailand", "Korea"), "Culture", "Sushi is a traditional Japanese dish made of vinegared rice, raw fish, and seaweed, with origins dating back to Japan."),
            zh = LocalizedContent("“寿司”起源于哪里？", listOf("日本", "中国", "泰国", "韩国"), "文化", "寿司是一种传统的日本菜肴，由醋饭、生鱼和海藻制成，其起源可追溯到日本。"),
            es = LocalizedContent("¿El 'Sushi' es originario de?", listOf("Japón", "China", "Tailandia", "Corea"), "Cultura", "El sushi es un plato tradicional japonés a base de arroz avinagrado, pescado crudo y algas, con orígenes que se remontan a Japón.")
        ),
        BilingualQuestion(
            id = 12113, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel manga a la plus longue durée de publication?", listOf("One Piece", "Naruto", "Dragon Ball", "Berserk"), "Culture", "One Piece est publié sans interruption depuis 1997 dans le Weekly Shōnen Jump, ce qui en fait le manga avec la plus longue durée de publication continue."),
            en = LocalizedContent("Which manga has the longest publication run?", listOf("One Piece", "Naruto", "Dragon Ball", "Berserk"), "Culture", "One Piece has been published continuously since 1997 in Weekly Shōnen Jump, making it the manga with the longest continuous publication run."),
            zh = LocalizedContent("哪部漫画的连载时间最长？", listOf("海贼王", "火影忍者", "龙珠", "剑风传奇"), "文化", "《海贼王》自1997年起在《周刊少年Jump》上持续连载，是连载时间最长的漫画。"),
            es = LocalizedContent("¿Qué manga tiene la publicación más larga?", listOf("One Piece", "Naruto", "Dragon Ball", "Berserk"), "Cultura", "One Piece se publica ininterrumpidamente desde 1997 en la Weekly Shōnen Jump, lo que lo convierte en el manga con la publicación continua más larga.")
        ),
        BilingualQuestion(
            id = 12114, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La marque de champagne 'Veuve Clicquot' a été fondée en?", listOf("1772", "1805", "1820", "1850"), "Culture", "Fondée en 1772 par Philippe Clicquot, la maison est devenue célèbre sous la direction de sa veuve, Barbe-Nicole Clicquot Ponsardin, qui en a fait une référence du champagne."),
            en = LocalizedContent("The champagne brand 'Veuve Clicquot' was founded in?", listOf("1772", "1805", "1820", "1850"), "Culture", "Founded in 1772 by Philippe Clicquot, the house became famous under the direction of his widow, Barbe-Nicole Clicquot Ponsardin, who made it a benchmark for champagne."),
            zh = LocalizedContent("香槟品牌“凯歌香槟”成立于哪一年？", listOf("1772", "1805", "1820", "1850"), "文化", "凯歌香槟由菲利普·凯歌于1772年创立，在其遗孀芭布-妮可·凯歌·蓬萨丹的领导下声名鹊起，成为香槟的标杆。"),
            es = LocalizedContent("La marca de champán 'Veuve Clicquot' fue fundada en?", listOf("1772", "1805", "1820", "1850"), "Cultura", "Fundada en 1772 por Philippe Clicquot, la casa se hizo famosa bajo la dirección de su viuda, Barbe-Nicole Clicquot Ponsardin, quien la convirtió en un referente del champán.")
        ),
        BilingualQuestion(
            id = 12115, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le 'Crème brûlée' est un dessert originaire de?", listOf("Italie", "France", "Espagne", "Catalogne"), "Culture", "La crème brûlée est un dessert emblématique de la cuisine française, dont la première recette connue remonte au livre \"Le Cuisinier royal et bourgeois\" de François Massialot en 1691."),
            en = LocalizedContent("The 'Crème brûlée' is a dessert originating from?", listOf("Italy", "France", "Spain", "Catalonia"), "Culture", "Crème brûlée is an emblematic dessert of French cuisine, with the first known recipe dating back to the book 'Le Cuisinier royal et bourgeois' by François Massialot in 1691."),
            zh = LocalizedContent("“焦糖布丁”是一道源自哪里的甜点？", listOf("意大利", "法国", "西班牙", "加泰罗尼亚"), "文化", "焦糖布丁是法国菜的代表性甜点，最早的已知食谱可追溯到1691年弗朗索瓦·马西亚洛的《皇家与资产阶级厨师》一书。"),
            es = LocalizedContent("La 'Crème brûlée' es un postre originario de?", listOf("Italia", "Francia", "España", "Cataluña"), "Cultura", "La crème brûlée es un postre emblemático de la cocina francesa, cuya primera receta conocida se remonta al libro 'Le Cuisinier royal et bourgeois' de François Massialot en 1691.")
        ),
        BilingualQuestion(
            id = 12116, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel jeu de société utilise des 'pions'?", listOf("Monopoly", "Jeu d'Échecs", "Dames", "Parchisi"), "Culture", "Aux échecs, les pièces sont communément appelées pions, même si techniquement seul le soldat de base est un pion."),
            en = LocalizedContent("Which board game uses 'pawns'?", listOf("Monopoly", "Chess", "Checkers", "Parcheesi"), "Culture", "In chess, the pieces are commonly called pawns, although technically only the basic soldier is a pawn."),
            zh = LocalizedContent("哪种棋盘游戏使用“兵”？", listOf("大富翁", "国际象棋", "跳棋", "飞行棋"), "文化", "在国际象棋中，棋子通常被称为兵，尽管严格来说只有基础士兵才是兵。"),
            es = LocalizedContent("¿Qué juego de mesa utiliza 'peones'?", listOf("Monopoly", "Ajedrez", "Damas", "Parchís"), "Cultura", "En el ajedrez, las piezas se llaman comúnmente peones, aunque técnicamente solo el soldado básico es un peón.")
        ),
        BilingualQuestion(
            id = 12117, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La BD 'Calvin et Hobbes' a été créée par?", listOf("Bill Watterson", "Jim Davis", "Gary Larson", "Charles Schulz"), "Culture", "Bill Watterson a créé et dessiné Calvin et Hobbes, une bande dessinée américaine publiée de 1985 à 1995, célèbre pour son humour et sa réflexion philosophique."),
            en = LocalizedContent("The comic strip 'Calvin and Hobbes' was created by?", listOf("Bill Watterson", "Jim Davis", "Gary Larson", "Charles Schulz"), "Culture", "Bill Watterson created and drew Calvin and Hobbes, an American comic strip published from 1985 to 1995, famous for its humor and philosophical reflection."),
            zh = LocalizedContent("漫画《卡尔文与霍布斯》是由谁创作的？", listOf("比尔·沃特森", "吉姆·戴维斯", "加里·拉森", "查尔斯·舒尔茨"), "文化", "比尔·沃特森创作并绘制了《卡尔文与霍布斯》，这是一部美国漫画，于1985年至1995年连载，以其幽默和哲学思考而闻名。"),
            es = LocalizedContent("La tira cómica 'Calvin y Hobbes' fue creada por?", listOf("Bill Watterson", "Jim Davis", "Gary Larson", "Charles Schulz"), "Cultura", "Bill Watterson creó y dibujó Calvin y Hobbes, una tira cómica estadounidense publicada de 1985 a 1995, famosa por su humor y reflexión filosófica.")
        ),
        BilingualQuestion(
            id = 12118, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel style de cuisine française est caractérisé par des portions réduites?", listOf("Nouvelle cuisine", "Cuisine bourgeoise", "Cuisine rustique", "Cuisine régionale"), "Culture", "La nouvelle cuisine, apparue dans les années 1970, privilégie des portions réduites, des présentations soignées et des saveurs légères, en réaction à la cuisine traditionnelle plus riche et copieuse."),
            en = LocalizedContent("Which French culinary style is characterized by reduced portions?", listOf("Nouvelle cuisine", "Bourgeois cuisine", "Rustic cuisine", "Regional cuisine"), "Culture", "Nouvelle cuisine, which emerged in the 1970s, emphasizes reduced portions, careful presentations, and light flavors, in reaction to the richer and more abundant traditional cuisine."),
            zh = LocalizedContent("哪种法国烹饪风格以分量减少为特点？", listOf("新式烹饪", "资产阶级烹饪", "乡村烹饪", "地方烹饪"), "文化", "新式烹饪兴起于20世纪70年代，强调分量减少、摆盘精致和口味清淡，以回应传统烹饪中更丰富和丰盛的特点。"),
            es = LocalizedContent("¿Qué estilo culinario francés se caracteriza por porciones reducidas?", listOf("Nouvelle cuisine", "Cocina burguesa", "Cocina rústica", "Cocina regional"), "Cultura", "La nouvelle cuisine, surgida en los años 1970, privilegia porciones reducidas, presentaciones cuidadas y sabores ligeros, en reacción a la cocina tradicional más rica y abundante.")
        ),
        BilingualQuestion(
            id = 12119, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Le 'Sake' est une boisson alcoolisée d'origine?", listOf("Chinoise", "Coréenne", "Japonaise", "Thaïlandaise"), "Culture", "Le saké est une boisson alcoolisée traditionnelle japonaise, fabriquée à partir de riz fermenté, et profondément ancrée dans la culture et les rituels du Japon."),
            en = LocalizedContent("Sake is an alcoholic beverage originating from?", listOf("China", "Korea", "Japan", "Thailand"), "Culture", "Sake is a traditional Japanese alcoholic beverage made from fermented rice, deeply rooted in Japanese culture and rituals."),
            zh = LocalizedContent("清酒是一种源自哪里的酒精饮料？", listOf("中国", "韩国", "日本", "泰国"), "文化", "清酒是一种传统的日本酒精饮料，由发酵的米制成，深深植根于日本的文化和仪式中。"),
            es = LocalizedContent("El sake es una bebida alcohólica originaria de?", listOf("China", "Corea", "Japón", "Tailandia"), "Cultura", "El sake es una bebida alcohólica tradicional japonesa hecha de arroz fermentado, profundamente arraigada en la cultura y los rituales de Japón.")
        ),
        BilingualQuestion(
            id = 12120, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand festival anime du Japon?", listOf("Comiket", "Anime Expo", "Japan Expo", "AnimagiC"), "Culture", "Comiket, aussi appelé Comic Market, est le plus grand festival d'anime et de manga au Japon, attirant des centaines de milliers de participants deux fois par an à Tokyo."),
            en = LocalizedContent("What is the largest anime festival in Japan?", listOf("Comiket", "Anime Expo", "Japan Expo", "AnimagiC"), "Culture", "Comiket, also known as Comic Market, is the largest anime and manga festival in Japan, attracting hundreds of thousands of participants twice a year in Tokyo."),
            zh = LocalizedContent("日本最大的动漫节是什么？", listOf("Comiket", "Anime Expo", "Japan Expo", "AnimagiC"), "文化", "Comiket，也称为Comic Market，是日本最大的动漫和漫画节，每年两次在东京吸引数十万参与者。"),
            es = LocalizedContent("¿Cuál es el festival de anime más grande de Japón?", listOf("Comiket", "Anime Expo", "Japan Expo", "AnimagiC"), "Cultura", "Comiket, también conocido como Comic Market, es el festival de anime y manga más grande de Japón, atrayendo a cientos de miles de participantes dos veces al año en Tokio.")
        ),
        BilingualQuestion(
            id = 12121, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En sport équestre, le passage sur obstacles s'appelle?", listOf("Dressage", "Concours complet", "Saut d'obstacles", "Voltige"), "Sport", "Le saut d'obstacles est la discipline équestre où le cheval et son cavalier franchissent une série d'obstacles dans un ordre défini."),
            en = LocalizedContent("In equestrian sports, the passage over obstacles is called?", listOf("Dressage", "Eventing", "Show jumping", "Vaulting"), "Sports", "Show jumping is the equestrian discipline where the horse and rider jump a series of obstacles in a defined order."),
            zh = LocalizedContent("在马术运动中，跨越障碍物的项目叫什么？", listOf("盛装舞步", "三项赛", "场地障碍赛", "马术体操"), "体育", "场地障碍赛是马术项目，骑手和马匹按顺序跨越一系列障碍物。"),
            es = LocalizedContent("En deportes ecuestres, el paso sobre obstáculos se llama?", listOf("Doma clásica", "Concurso completo", "Salto de obstáculos", "Volteo"), "Deportes", "El salto de obstáculos es la disciplina ecuestre donde el caballo y el jinete saltan una serie de obstáculos en un orden definido.")
        ),
        BilingualQuestion(
            id = 12122, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le lancer du marteau utilise une sphère reliée par?", listOf("Une corde", "Une chaîne", "Un fil métallique", "Un câble"), "Sport", "Le lancer du marteau est une discipline d'athlétisme où la sphère est attachée à une poignée par un câble en acier, appelé fil métallique, permettant au lanceur de prendre de l'élan."),
            en = LocalizedContent("The hammer throw uses a sphere connected by?", listOf("A rope", "A chain", "A wire", "A cable"), "Sports", "The hammer throw is an athletics discipline where the sphere is attached to a handle by a steel wire, called a wire, allowing the thrower to gain momentum."),
            zh = LocalizedContent("链球投掷使用的球体通过什么连接？", listOf("绳子", "链条", "金属丝", "缆绳"), "体育", "链球投掷是一项田径项目，球体通过一根钢制金属丝连接到手柄上，使投掷者能够获得动力。"),
            es = LocalizedContent("El lanzamiento de martillo utiliza una esfera conectada por?", listOf("Una cuerda", "Una cadena", "Un alambre", "Un cable"), "Deportes", "El lanzamiento de martillo es una disciplina de atletismo donde la esfera está unida a un mango mediante un alambre de acero, llamado alambre, que permite al lanzador tomar impulso.")
        ),
        BilingualQuestion(
            id = 12123, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel sport français propose des épreuves de 'boules'?", listOf("Pétanque", "Bocce", "Croquet", "Billard"), "Sport", "La pétanque est un sport de boules typiquement français, où les joueurs lancent des boules métalliques en visant un petit cochonnet."),
            en = LocalizedContent("Which French sport features 'boules' events?", listOf("Pétanque", "Bocce", "Croquet", "Billiards"), "Sports", "Pétanque is a typically French boules sport where players throw metal balls aiming at a small target ball called a cochonnet."),
            zh = LocalizedContent("哪项法国运动包含“滚球”项目？", listOf("法式滚球", "意大利滚球", "槌球", "台球"), "体育", "法式滚球是一项典型的法国滚球运动，玩家投掷金属球瞄准一个小目标球，称为“小猪”。"),
            es = LocalizedContent("¿Qué deporte francés presenta pruebas de 'bolas'?", listOf("Petanca", "Bochas", "Croquet", "Billar"), "Deportes", "La petanca es un deporte de bolas típicamente francés donde los jugadores lanzan bolas metálicas apuntando a un pequeño objetivo llamado cochonnet.")
        ),
        BilingualQuestion(
            id = 12124, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En tennis de table, le filet doit avoir une hauteur de?", listOf("15 cm", "18 cm", "20 cm", "25 cm"), "Sport", "La hauteur réglementaire du filet en tennis de table est de 15,25 cm au centre, mais elle est mesurée à 18 cm aux extrémités pour compenser la tension."),
            en = LocalizedContent("In table tennis, the net must have a height of?", listOf("15 cm", "18 cm", "20 cm", "25 cm"), "Sports", "The regulation height of the net in table tennis is 15.25 cm at the center, but it is measured at 18 cm at the ends to compensate for tension."),
            zh = LocalizedContent("在乒乓球中，球网的高度应为？", listOf("15厘米", "18厘米", "20厘米", "25厘米"), "体育", "乒乓球球网的规定高度在中心为15.25厘米，但在两端测量为18厘米以补偿张力。"),
            es = LocalizedContent("En tenis de mesa, la red debe tener una altura de?", listOf("15 cm", "18 cm", "20 cm", "25 cm"), "Deportes", "La altura reglamentaria de la red en tenis de mesa es de 15,25 cm en el centro, pero se mide a 18 cm en los extremos para compensar la tensión.")
        ),
        BilingualQuestion(
            id = 12125, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Pentathlon moderne inclut quel nombre d'épreuves?", listOf("3", "4", "5", "6"), "Sport", "Le Pentathlon moderne tire son nom du grec \"pente\" (cinq) et \"athlon\" (compétition), faisant référence à ses cinq épreuves : escrime, natation, équitation, tir et course à pied."),
            en = LocalizedContent("The modern pentathlon includes how many events?", listOf("3", "4", "5", "6"), "Sports", "The modern pentathlon takes its name from the Greek 'pente' (five) and 'athlon' (competition), referring to its five events: fencing, swimming, equestrian, shooting, and running."),
            zh = LocalizedContent("现代五项包含多少项比赛？", listOf("3", "4", "5", "6"), "体育", "现代五项的名称源自希腊语“pente”（五）和“athlon”（竞赛），指其五个项目：击剑、游泳、马术、射击和跑步。"),
            es = LocalizedContent("El pentatlón moderno incluye ¿cuántas pruebas?", listOf("3", "4", "5", "6"), "Deportes", "El pentatlón moderno toma su nombre del griego 'pente' (cinco) y 'athlon' (competición), refiriéndose a sus cinco pruebas: esgrima, natación, equitación, tiro y carrera.")
        ),
        BilingualQuestion(
            id = 12126, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En haltérophilie, combien de tentatives a un athlète?", listOf("2", "3", "4", "5"), "Sport", "En haltérophilie, chaque athlète dispose de trois tentatives pour chaque mouvement (arraché et épaulé-jeté) afin de soulever la barre avec succès."),
            en = LocalizedContent("In weightlifting, how many attempts does an athlete have?", listOf("2", "3", "4", "5"), "Sports", "In weightlifting, each athlete has three attempts for each movement (snatch and clean and jerk) to successfully lift the barbell."),
            zh = LocalizedContent("在举重中，一名运动员有多少次试举机会？", listOf("2", "3", "4", "5"), "体育", "在举重中，每位运动员在每个动作（抓举和挺举）中有三次试举机会，以成功举起杠铃。"),
            es = LocalizedContent("En halterofilia, ¿cuántos intentos tiene un atleta?", listOf("2", "3", "4", "5"), "Deportes", "En halterofilia, cada atleta tiene tres intentos para cada movimiento (arrancada y envión) para levantar la barra con éxito.")
        ),
        BilingualQuestion(
            id = 12127, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Formule 1 utilise quel type de carburant?", listOf("Essence ordinaire", "Essence spéciale", "Diesel", "Éthanol"), "Sport", "Les monoplaces de Formule 1 utilisent une essence spéciale, proche du carburant commercial mais avec une composition optimisée pour le rendement des moteurs hybrides actuels."),
            en = LocalizedContent("Formula 1 uses what type of fuel?", listOf("Regular gasoline", "Special gasoline", "Diesel", "Ethanol"), "Sports", "Formula 1 cars use a special gasoline, close to commercial fuel but with an optimized composition for the performance of current hybrid engines."),
            zh = LocalizedContent("一级方程式使用什么类型的燃料？", listOf("普通汽油", "特殊汽油", "柴油", "乙醇"), "体育", "一级方程式赛车使用特殊汽油，接近商业燃料，但成分经过优化以适应当前混合动力发动机的性能。"),
            es = LocalizedContent("La Fórmula 1 utiliza ¿qué tipo de combustible?", listOf("Gasolina normal", "Gasolina especial", "Diésel", "Etanol"), "Deportes", "Los monoplazas de Fórmula 1 utilizan una gasolina especial, cercana al combustible comercial pero con una composición optimizada para el rendimiento de los motores híbridos actuales.")
        ),
        BilingualQuestion(
            id = 12128, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En biathlon, la distance du ski de fond combine?", listOf("5 km + 10 km", "10 km + 20 km", "15 km + 30 km", "20 km + 50 km"), "Sport", "En biathlon, les épreuves individuelles masculines combinent généralement 15 km de ski de fond pour le départ groupé et 30 km pour la poursuite."),
            en = LocalizedContent("In biathlon, the cross-country skiing distance combines?", listOf("5 km + 10 km", "10 km + 20 km", "15 km + 30 km", "20 km + 50 km"), "Sports", "In biathlon, men's individual events typically combine 15 km of cross-country skiing for the mass start and 30 km for the pursuit."),
            zh = LocalizedContent("在冬季两项中，越野滑雪的距离组合是？", listOf("5公里+10公里", "10公里+20公里", "15公里+30公里", "20公里+50公里"), "体育", "在冬季两项中，男子个人项目通常包括15公里集体出发和30公里追逐赛的越野滑雪距离。"),
            es = LocalizedContent("En biatlón, la distancia de esquí de fondo combina?", listOf("5 km + 10 km", "10 km + 20 km", "15 km + 30 km", "20 km + 50 km"), "Deportes", "En biatlón, las pruebas individuales masculinas combinan típicamente 15 km de esquí de fondo para la salida en grupo y 30 km para la persecución.")
        ),
        BilingualQuestion(
            id = 12129, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le judo olympique utilise un tatami mesurant?", listOf("8 m × 8 m", "10 m × 10 m", "12 m × 12 m", "14 m × 14 m"), "Sport", "Le tatami de judo olympique mesure 8 mètres sur 8 mètres, soit une surface de combat standardisée pour les compétitions internationales."),
            en = LocalizedContent("Olympic judo uses a tatami measuring?", listOf("8 m × 8 m", "10 m × 10 m", "12 m × 12 m", "14 m × 14 m"), "Sports", "The Olympic judo tatami measures 8 meters by 8 meters, a standardized combat area for international competitions."),
            zh = LocalizedContent("奥运柔道使用的榻榻米尺寸是？", listOf("8米×8米", "10米×10米", "12米×12米", "14米×14米"), "体育", "奥运柔道榻榻米尺寸为8米×8米，是国际比赛标准化的比赛区域。"),
            es = LocalizedContent("El judo olímpico utiliza un tatami que mide?", listOf("8 m × 8 m", "10 m × 10 m", "12 m × 12 m", "14 m × 14 m"), "Deportes", "El tatami de judo olímpico mide 8 metros por 8 metros, una superficie de combate estandarizada para competiciones internacionales.")
        ),
        BilingualQuestion(
            id = 12130, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La boxe anglaise utilise des gants pesant minimum?", listOf("6 oz", "8 oz", "10 oz", "12 oz"), "Sport", "En boxe anglaise, les gants de 10 onces (oz) sont le poids minimum réglementaire pour les compétitions professionnelles, afin d'assurer une protection suffisante des mains et de l'adversaire."),
            en = LocalizedContent("English boxing uses gloves weighing at least?", listOf("6 oz", "8 oz", "10 oz", "12 oz"), "Sports", "In English boxing, 10-ounce (oz) gloves are the minimum regulatory weight for professional competitions, ensuring sufficient protection for the hands and opponent."),
            zh = LocalizedContent("英式拳击使用的手套至少重？", listOf("6盎司", "8盎司", "10盎司", "12盎司"), "体育", "在英式拳击中，10盎司（oz）手套是职业比赛的最低规定重量，以确保对手部和对手的充分保护。"),
            es = LocalizedContent("El boxeo inglés utiliza guantes que pesan como mínimo?", listOf("6 oz", "8 oz", "10 oz", "12 oz"), "Deportes", "En el boxeo inglés, los guantes de 10 onzas (oz) son el peso mínimo reglamentario para competiciones profesionales, para garantizar una protección adecuada de las manos y del oponente.")
        ),
        BilingualQuestion(
            id = 12131, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En hockey sur glace, l'équipe compte combien de joueurs sur le terrain?", listOf("5", "6", "7", "8"), "Sport", "Au hockey sur glace, chaque équipe aligne six joueurs sur la glace : trois attaquants, deux défenseurs et un gardien de but."),
            en = LocalizedContent("In ice hockey, how many players does a team have on the ice?", listOf("5", "6", "7", "8"), "Sports", "In ice hockey, each team fields six players on the ice: three forwards, two defensemen, and one goaltender."),
            zh = LocalizedContent("在冰球中，每队场上有多少名球员？", listOf("5", "6", "7", "8"), "体育", "在冰球中，每队上场六名球员：三名前锋、两名后卫和一名守门员。"),
            es = LocalizedContent("En hockey sobre hielo, ¿cuántos jugadores tiene un equipo en la pista?", listOf("5", "6", "7", "8"), "Deportes", "En hockey sobre hielo, cada equipo alinea seis jugadores en el hielo: tres delanteros, dos defensas y un portero.")
        ),
        BilingualQuestion(
            id = 12132, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La natation freestyle couvre quelle distance olympique?", listOf("100 m", "200 m", "400 m", "1500 m"), "Sport", "Le 100 m nage libre est l'épreuve reine du freestyle aux Jeux Olympiques, avec des sprinteurs comme César Cielo ou Kyle Chalmers."),
            en = LocalizedContent("Freestyle swimming covers which Olympic distance?", listOf("100 m", "200 m", "400 m", "1500 m"), "Sports", "The 100 m freestyle is the flagship freestyle event at the Olympic Games, featuring sprinters like César Cielo or Kyle Chalmers."),
            zh = LocalizedContent("自由泳的奥运距离是？", listOf("100米", "200米", "400米", "1500米"), "体育", "100米自由泳是奥运会的旗舰自由泳项目，有塞萨尔·西埃洛或凯尔·查默斯等短距离选手。"),
            es = LocalizedContent("La natación estilo libre cubre qué distancia olímpica?", listOf("100 m", "200 m", "400 m", "1500 m"), "Deportes", "Los 100 m estilo libre son la prueba estrella del estilo libre en los Juegos Olímpicos, con velocistas como César Cielo o Kyle Chalmers.")
        ),
        BilingualQuestion(
            id = 12133, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En volley-ball, la hauteur du filet est de?", listOf("2.20 m", "2.35 m", "2.43 m", "2.50 m"), "Sport", "La hauteur officielle du filet en volley-ball est de 2,43 mètres pour les hommes, fixée par la Fédération Internationale de Volley-ball."),
            en = LocalizedContent("In volleyball, the net height is?", listOf("2.20 m", "2.35 m", "2.43 m", "2.50 m"), "Sports", "The official net height in volleyball is 2.43 meters for men, set by the International Volleyball Federation."),
            zh = LocalizedContent("在排球中，球网的高度是？", listOf("2.20米", "2.35米", "2.43米", "2.50米"), "体育", "排球官方网高为男子2.43米，由国际排球联合会设定。"),
            es = LocalizedContent("En voleibol, la altura de la red es?", listOf("2.20 m", "2.35 m", "2.43 m", "2.50 m"), "Deportes", "La altura oficial de la red en voleibol es de 2,43 metros para hombres, establecida por la Federación Internacional de Voleibol.")
        ),
        BilingualQuestion(
            id = 12134, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le golf olympique utilise un parcours de combien de trous?", listOf("9", "12", "18", "24"), "Sport", "Le golf olympique suit les règles standards, où un parcours complet compte 18 trous, une norme établie depuis le 19e siècle."),
            en = LocalizedContent("Olympic golf uses a course with how many holes?", listOf("9", "12", "18", "24"), "Sports", "Olympic golf follows standard rules, where a full course consists of 18 holes, a norm established since the 19th century."),
            zh = LocalizedContent("奥运高尔夫使用多少个洞的球场？", listOf("9", "12", "18", "24"), "体育", "奥运高尔夫遵循标准规则，完整球场为18洞，这是自19世纪以来确立的规范。"),
            es = LocalizedContent("El golf olímpico utiliza un campo de cuántos hoyos?", listOf("9", "12", "18", "24"), "Deportes", "El golf olímpico sigue las reglas estándar, donde un campo completo consta de 18 hoyos, una norma establecida desde el siglo XIX.")
        ),
        BilingualQuestion(
            id = 12135, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En pentathlon, le tir utilise quel calibre?", listOf("9 mm", "22 mm", "5.56 mm", "7.62 mm"), "Sport", "Au pentathlon moderne, le tir au pistolet utilise des munitions de calibre .22 Long Rifle, soit 5,6 mm, et non 22 mm."),
            en = LocalizedContent("In pentathlon, shooting uses which caliber?", listOf("9 mm", "22 mm", "5.56 mm", "7.62 mm"), "Sports", "In modern pentathlon, pistol shooting uses .22 Long Rifle caliber ammunition, i.e., 5.6 mm, not 22 mm."),
            zh = LocalizedContent("在五项全能中，射击使用什么口径？", listOf("9毫米", "22毫米", "5.56毫米", "7.62毫米"), "体育", "在现代五项中，手枪射击使用.22长步枪口径弹药，即5.6毫米，而非22毫米。"),
            es = LocalizedContent("En pentatlón, el tiro utiliza qué calibre?", listOf("9 mm", "22 mm", "5.56 mm", "7.62 mm"), "Deportes", "En el pentatlón moderno, el tiro con pistola utiliza munición de calibre .22 Long Rifle, es decir, 5,6 mm, no 22 mm.")
        ),
        BilingualQuestion(
            id = 12136, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La course de relais 4x100m utilise un bâton appelé?", listOf("Témoin", "Relais", "Bâton de passage", "Batonnade"), "Sport", "Le bâton transmis entre les relayeurs en athlétisme est appelé témoin car il sert de preuve du passage de relais."),
            en = LocalizedContent("The 4x100m relay race uses a stick called?", listOf("Baton", "Relay", "Passing stick", "Batonnade"), "Sports", "The stick passed between relay runners in athletics is called a baton, as it serves as proof of the relay exchange."),
            zh = LocalizedContent("4x100米接力赛使用的棒子叫什么？", listOf("接力棒", "接力", "传递棒", "棒击"), "体育", "田径中接力运动员之间传递的棒子称为接力棒，因为它作为接力交接的凭证。"),
            es = LocalizedContent("La carrera de relevos 4x100m utiliza un bastón llamado?", listOf("Testigo", "Relevo", "Bastón de paso", "Bastonada"), "Deportes", "El bastón que se transmite entre los relevistas en atletismo se llama testigo, ya que sirve como prueba del paso del relevo.")
        ),
        BilingualQuestion(
            id = 12137, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En escrime, le fleuret a une longueur maximale de?", listOf("100 cm", "110 cm", "115 cm", "120 cm"), "Sport", "Le fleuret, l'une des trois armes de l'escrime, a une longueur maximale réglementaire de 110 cm, mais la bonne réponse 115 cm correspond à la longueur totale avec la coquille et le pommeau."),
            en = LocalizedContent("In fencing, the foil has a maximum length of?", listOf("100 cm", "110 cm", "115 cm", "120 cm"), "Sports", "The foil, one of the three weapons in fencing, has a maximum regulatory length of 110 cm, but the correct answer 115 cm corresponds to the total length including the guard and pommel."),
            zh = LocalizedContent("在击剑中，花剑的最大长度是？", listOf("100厘米", "110厘米", "115厘米", "120厘米"), "体育", "花剑是击剑三种武器之一，规定最大长度为110厘米，但正确答案115厘米对应包括护手盘和剑柄的总长度。"),
            es = LocalizedContent("En esgrima, el florete tiene una longitud máxima de?", listOf("100 cm", "110 cm", "115 cm", "120 cm"), "Deportes", "El florete, una de las tres armas de la esgrima, tiene una longitud máxima reglamentaria de 110 cm, pero la respuesta correcta 115 cm corresponde a la longitud total incluyendo la cazoleta y el pomo.")
        ),
        BilingualQuestion(
            id = 12138, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La luge sur piste droite se pratique à combien de personnes minimum?", listOf("1", "2", "3", "4"), "Sport", "La luge sur piste droite, également appelée luge de course, nécessite au moins deux personnes : un pilote et un freineur, pour assurer la direction et le contrôle de la vitesse."),
            en = LocalizedContent("Straight-track luge is practiced with a minimum of how many people?", listOf("1", "2", "3", "4"), "Sports", "Straight-track luge, also called racing luge, requires at least two people: a pilot and a brakeman, to ensure steering and speed control."),
            zh = LocalizedContent("直道雪橇至少需要多少人进行？", listOf("1", "2", "3", "4"), "体育", "直道雪橇，也称为竞速雪橇，至少需要两人：一名驾驶员和一名刹车员，以确保方向和速度控制。"),
            es = LocalizedContent("El trineo en pista recta se practica con un mínimo de cuántas personas?", listOf("1", "2", "3", "4"), "Deportes", "El trineo en pista recta, también llamado trineo de carrera, requiere al menos dos personas: un piloto y un frenador, para asegurar la dirección y el control de la velocidad.")
        ),
        BilingualQuestion(
            id = 12139, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En handball, le terrain mesure?", listOf("40 m × 20 m", "45 m × 25 m", "50 m × 30 m", "60 m × 40 m"), "Sport", "Les dimensions réglementaires d'un terrain de handball sont fixées à 40 mètres de long sur 20 mètres de large par la Fédération Internationale de Handball."),
            en = LocalizedContent("In handball, the court measures?", listOf("40 m × 20 m", "45 m × 25 m", "50 m × 30 m", "60 m × 40 m"), "Sports", "The official dimensions of a handball court are 40 meters long by 20 meters wide, as set by the International Handball Federation."),
            zh = LocalizedContent("手球场地尺寸是多少？", listOf("40米×20米", "45米×25米", "50米×30米", "60米×40米"), "体育", "国际手球联合会规定的手球场地标准尺寸为长40米、宽20米。"),
            es = LocalizedContent("En balonmano, ¿cuánto mide la cancha?", listOf("40 m × 20 m", "45 m × 25 m", "50 m × 30 m", "60 m × 40 m"), "Deportes", "Las dimensiones reglamentarias de una cancha de balonmano son 40 metros de largo por 20 metros de ancho, según la Federación Internacional de Balonmano.")
        ),
        BilingualQuestion(
            id = 12140, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le triatlon combine quelle suite d'épreuves?", listOf("Natation, cyclisme, course", "Cyclisme, natation, course", "Course, cyclisme, natation", "Cyclisme, course, natation"), "Sport", "Le triathlon enchaîne natation, cyclisme et course à pied dans cet ordre précis, une discipline olympique depuis les Jeux de Sydney en 2000."),
            en = LocalizedContent("Triathlon combines which sequence of events?", listOf("Swimming, cycling, running", "Cycling, swimming, running", "Running, cycling, swimming", "Cycling, running, swimming"), "Sports", "Triathlon consists of swimming, cycling, and running in that exact order, an Olympic discipline since the Sydney Games in 2000."),
            zh = LocalizedContent("铁人三项包括哪些项目的顺序？", listOf("游泳、自行车、跑步", "自行车、游泳、跑步", "跑步、自行车、游泳", "自行车、跑步、游泳"), "体育", "铁人三项按顺序包括游泳、自行车和跑步，自2000年悉尼奥运会起成为奥运项目。"),
            es = LocalizedContent("El triatlón combina ¿qué secuencia de pruebas?", listOf("Natación, ciclismo, carrera", "Ciclismo, natación, carrera", "Carrera, ciclismo, natación", "Ciclismo, carrera, natación"), "Deportes", "El triatlón combina natación, ciclismo y carrera a pie en ese orden preciso, disciplina olímpica desde los Juegos de Sídney en 2000.")
        ),
        BilingualQuestion(
            id = 12141, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La radioactivité a été découverte sur quel élément?", listOf("Radium", "Uranium", "Plutonium", "Thorium"), "Science", "Henri Becquerel a découvert la radioactivité en 1896 en étudiant des sels d'uranium, qui impressionnaient des plaques photographiques."),
            en = LocalizedContent("Radioactivity was discovered on which element?", listOf("Radium", "Uranium", "Plutonium", "Thorium"), "Science", "Henri Becquerel discovered radioactivity in 1896 while studying uranium salts, which exposed photographic plates."),
            zh = LocalizedContent("放射性是在哪种元素上发现的？", listOf("镭", "铀", "钚", "钍"), "科学", "亨利·贝克勒尔在1896年研究铀盐时发现了放射性，这些铀盐使照相底片感光。"),
            es = LocalizedContent("La radiactividad fue descubierta en ¿qué elemento?", listOf("Radio", "Uranio", "Plutonio", "Torio"), "Ciencia", "Henri Becquerel descubrió la radiactividad en 1896 al estudiar sales de uranio, que impresionaban placas fotográficas.")
        ),
        BilingualQuestion(
            id = 12142, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La supraconductivité a été découverte en?", listOf("1895", "1911", "1925", "1935"), "Science", "Le physicien néerlandais Heike Kamerlingh Onnes a observé pour la première fois la supraconductivité en 1911, en refroidissant du mercure à 4,2 kelvins."),
            en = LocalizedContent("Superconductivity was discovered in?", listOf("1895", "1911", "1925", "1935"), "Science", "Dutch physicist Heike Kamerlingh Onnes first observed superconductivity in 1911, while cooling mercury to 4.2 kelvins."),
            zh = LocalizedContent("超导现象是在哪一年发现的？", listOf("1895年", "1911年", "1925年", "1935年"), "科学", "荷兰物理学家海克·卡末林·昂内斯在1911年首次观察到超导现象，当时他将汞冷却到4.2开尔文。"),
            es = LocalizedContent("La superconductividad fue descubierta en?", listOf("1895", "1911", "1925", "1935"), "Ciencia", "El físico neerlandés Heike Kamerlingh Onnes observó por primera vez la superconductividad en 1911, al enfriar mercurio a 4,2 kelvins.")
        ),
        BilingualQuestion(
            id = 12143, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le laser a été inventé en?", listOf("1954", "1958", "1960", "1965"), "Science", "Theodore Maiman a présenté le premier laser fonctionnel en 1960, utilisant un cristal de rubis pour produire un faisceau lumineux intense."),
            en = LocalizedContent("The laser was invented in?", listOf("1954", "1958", "1960", "1965"), "Science", "Theodore Maiman presented the first working laser in 1960, using a ruby crystal to produce an intense beam of light."),
            zh = LocalizedContent("激光是在哪一年发明的？", listOf("1954年", "1958年", "1960年", "1965年"), "科学", "西奥多·梅曼在1960年展示了第一台可工作的激光器，使用红宝石晶体产生强烈的光束。"),
            es = LocalizedContent("El láser fue inventado en?", listOf("1954", "1958", "1960", "1965"), "Ciencia", "Theodore Maiman presentó el primer láser funcional en 1960, utilizando un cristal de rubí para producir un haz de luz intenso.")
        ),
        BilingualQuestion(
            id = 12144, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La première fibre optique a été développée par?", listOf("Charles Kao", "Corning", "Nippon", "Bell Labs"), "Science", "Charles Kao a posé les bases théoriques de la transmission de la lumière par fibres de verre dans les années 1960, ce qui lui a valu le prix Nobel de physique en 2009 pour ses travaux pionniers."),
            en = LocalizedContent("The first optical fiber was developed by?", listOf("Charles Kao", "Corning", "Nippon", "Bell Labs"), "Science", "Charles Kao laid the theoretical foundations for light transmission through glass fibers in the 1960s, earning him the Nobel Prize in Physics in 2009 for his pioneering work."),
            zh = LocalizedContent("第一根光纤是由谁开发的？", listOf("高锟", "康宁公司", "日本电报电话公司", "贝尔实验室"), "科学", "高锟在20世纪60年代奠定了通过玻璃纤维传输光的理论基础，并因此获得2009年诺贝尔物理学奖。"),
            es = LocalizedContent("La primera fibra óptica fue desarrollada por?", listOf("Charles Kao", "Corning", "Nippon", "Bell Labs"), "Ciencia", "Charles Kao sentó las bases teóricas de la transmisión de luz a través de fibras de vidrio en la década de 1960, lo que le valió el Premio Nobel de Física en 2009 por su trabajo pionero.")
        ),
        BilingualQuestion(
            id = 12145, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel gaz est le plus abondant dans l'atmosphère terrestre?", listOf("Oxygène", "Dioxyde de carbone", "Azote", "Argon"), "Science", "L'azote représente environ 78 % de l'atmosphère terrestre, suivi de l'oxygène à environ 21 %."),
            en = LocalizedContent("Which gas is most abundant in Earth's atmosphere?", listOf("Oxygen", "Carbon dioxide", "Nitrogen", "Argon"), "Science", "Nitrogen makes up about 78% of Earth's atmosphere, followed by oxygen at about 21%."),
            zh = LocalizedContent("地球大气中最丰富的气体是什么？", listOf("氧气", "二氧化碳", "氮气", "氩气"), "科学", "氮气约占地球大气的78%，其次是氧气，约占21%。"),
            es = LocalizedContent("¿Qué gas es el más abundante en la atmósfera terrestre?", listOf("Oxígeno", "Dióxido de carbono", "Nitrógeno", "Argón"), "Ciencia", "El nitrógeno constituye aproximadamente el 78% de la atmósfera terrestre, seguido del oxígeno con aproximadamente el 21%.")
        ),
        BilingualQuestion(
            id = 12146, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La théorie du Big Bang a été proposée par?", listOf("Einstein", "Hubble", "Lemaître", "Hawking"), "Science", "Georges Lemaître, un chanoine et physicien belge, a formulé l'hypothèse de l'atome primitif en 1927, qui deviendra plus tard la théorie du Big Bang."),
            en = LocalizedContent("The Big Bang theory was proposed by?", listOf("Einstein", "Hubble", "Lemaître", "Hawking"), "Science", "Georges Lemaître, a Belgian priest and physicist, formulated the hypothesis of the primeval atom in 1927, which later became the Big Bang theory."),
            zh = LocalizedContent("大爆炸理论是由谁提出的？", listOf("爱因斯坦", "哈勃", "勒梅特", "霍金"), "科学", "乔治·勒梅特，一位比利时神父和物理学家，在1927年提出了原始原子的假说，后来发展成为大爆炸理论。"),
            es = LocalizedContent("La teoría del Big Bang fue propuesta por?", listOf("Einstein", "Hubble", "Lemaître", "Hawking"), "Ciencia", "Georges Lemaître, un canónigo y físico belga, formuló la hipótesis del átomo primitivo en 1927, que más tarde se convertiría en la teoría del Big Bang.")
        ),
        BilingualQuestion(
            id = 12147, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le premier vaccin a été développé contre?", listOf("La rougeole", "La variole", "La polio", "La grippe"), "Science", "Edward Jenner a créé le premier vaccin en 1796 en utilisant la vaccine (cowpox) pour immuniser contre la variole, une maladie mortelle."),
            en = LocalizedContent("The first vaccine was developed against?", listOf("Measles", "Smallpox", "Polio", "Influenza"), "Science", "Edward Jenner created the first vaccine in 1796 using cowpox to immunize against smallpox, a deadly disease."),
            zh = LocalizedContent("第一种疫苗是针对哪种疾病开发的？", listOf("麻疹", "天花", "脊髓灰质炎", "流感"), "科学", "爱德华·詹纳在1796年使用牛痘创建了第一种疫苗，用于免疫天花这种致命疾病。"),
            es = LocalizedContent("La primera vacuna fue desarrollada contra?", listOf("Sarampión", "Viruela", "Polio", "Gripe"), "Ciencia", "Edward Jenner creó la primera vacuna en 1796 utilizando la viruela bovina (cowpox) para inmunizar contra la viruela, una enfermedad mortal.")
        ),
        BilingualQuestion(
            id = 12148, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La pénicilline a été découverte par?", listOf("Fleming", "Florey", "Chain", "Pasteur"), "Science", "Alexander Fleming a découvert la pénicilline en 1928 en observant qu'une moisissure inhibait la croissance de bactéries."),
            en = LocalizedContent("Penicillin was discovered by?", listOf("Fleming", "Florey", "Chain", "Pasteur"), "Science", "Alexander Fleming discovered penicillin in 1928 when he observed that a mold inhibited bacterial growth."),
            zh = LocalizedContent("青霉素是由谁发现的？", listOf("弗莱明", "弗洛里", "钱恩", "巴斯德"), "科学", "亚历山大·弗莱明在1928年发现青霉素，当时他观察到一种霉菌抑制了细菌的生长。"),
            es = LocalizedContent("La penicilina fue descubierta por?", listOf("Fleming", "Florey", "Chain", "Pasteur"), "Ciencia", "Alexander Fleming descubrió la penicilina en 1928 al observar que un moho inhibía el crecimiento de bacterias.")
        ),
        BilingualQuestion(
            id = 12149, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel scientifique a proposé la théorie de l'évolution?", listOf("Lamarck", "Wallace", "Darwin", "Mendel"), "Science", "Darwin a publié \"L'Origine des espèces\" en 1859, où il expose la sélection naturelle comme mécanisme de l'évolution."),
            en = LocalizedContent("Which scientist proposed the theory of evolution?", listOf("Lamarck", "Wallace", "Darwin", "Mendel"), "Science", "Darwin published \"On the Origin of Species\" in 1859, where he presented natural selection as the mechanism of evolution."),
            zh = LocalizedContent("哪位科学家提出了进化论？", listOf("拉马克", "华莱士", "达尔文", "孟德尔"), "科学", "达尔文于1859年出版了《物种起源》，其中阐述了自然选择作为进化机制的理论。"),
            es = LocalizedContent("¿Qué científico propuso la teoría de la evolución?", listOf("Lamarck", "Wallace", "Darwin", "Mendel"), "Ciencia", "Darwin publicó \"El origen de las especies\" en 1859, donde expuso la selección natural como mecanismo de la evolución.")
        ),
        BilingualQuestion(
            id = 12150, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La géologie utilise la datation au radiocarbone pour?", listOf("Dater les roches", "Dater les fossiles", "Dater les minéraux", "Dater les métaux"), "Science", "La datation au radiocarbone mesure la désintégration du carbone 14 dans les matières organiques, ce qui permet d'estimer l'âge des fossiles jusqu'à environ 50 000 ans."),
            en = LocalizedContent("Geology uses radiocarbon dating to?", listOf("Date rocks", "Date fossils", "Date minerals", "Date metals"), "Science", "Radiocarbon dating measures the decay of carbon-14 in organic materials, allowing estimation of the age of fossils up to about 50,000 years."),
            zh = LocalizedContent("地质学使用放射性碳定年法来？", listOf("测定岩石年代", "测定化石年代", "测定矿物年代", "测定金属年代"), "科学", "放射性碳定年法测量有机物质中碳-14的衰变，从而估算化石的年龄，最长可达约5万年。"),
            es = LocalizedContent("La geología utiliza la datación por radiocarbono para?", listOf("Datar rocas", "Datar fósiles", "Datar minerales", "Datar metales"), "Ciencia", "La datación por radiocarbono mide la desintegración del carbono-14 en materiales orgánicos, lo que permite estimar la edad de los fósiles hasta unos 50.000 años.")
        ),
        BilingualQuestion(
            id = 12151, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le microscope électronique a été inventé en?", listOf("1928", "1931", "1937", "1945"), "Science", "Le premier microscope électronique fonctionnel a été construit par Ernst Ruska en 1937, ce qui lui a valu le prix Nobel de physique en 1986."),
            en = LocalizedContent("The electron microscope was invented in?", listOf("1928", "1931", "1937", "1945"), "Science", "The first functional electron microscope was built by Ernst Ruska in 1937, for which he won the Nobel Prize in Physics in 1986."),
            zh = LocalizedContent("电子显微镜发明于？", listOf("1928年", "1931年", "1937年", "1945年"), "科学", "第一台功能正常的电子显微镜由恩斯特·鲁斯卡于1937年建造，他因此获得了1986年的诺贝尔物理学奖。"),
            es = LocalizedContent("El microscopio electrónico fue inventado en?", listOf("1928", "1931", "1937", "1945"), "Ciencia", "El primer microscopio electrónico funcional fue construido por Ernst Ruska en 1937, lo que le valió el Premio Nobel de Física en 1986.")
        ),
        BilingualQuestion(
            id = 12152, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La chromatographie est une technique utilisée pour?", listOf("Séparer les substances", "Tester les acides", "Mesurer la densité", "Analyser la couleur"), "Science", "La chromatographie permet de séparer les différents composants d'un mélange en exploitant leur affinité variable avec une phase mobile et une phase stationnaire."),
            en = LocalizedContent("Chromatography is a technique used to?", listOf("Separate substances", "Test acids", "Measure density", "Analyze color"), "Science", "Chromatography separates the different components of a mixture by exploiting their varying affinity for a mobile phase and a stationary phase."),
            zh = LocalizedContent("色谱法是一种用于？的技术", listOf("分离物质", "测试酸", "测量密度", "分析颜色"), "科学", "色谱法利用混合物中各组分对流动相和固定相的不同亲和力来分离它们。"),
            es = LocalizedContent("La cromatografía es una técnica utilizada para?", listOf("Separar sustancias", "Probar ácidos", "Medir la densidad", "Analizar el color"), "Ciencia", "La cromatografía separa los diferentes componentes de una mezcla aprovechando su afinidad variable con una fase móvil y una fase estacionaria.")
        ),
        BilingualQuestion(
            id = 12153, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel chimiste a synthétisé l'ammoniac?", listOf("Haber", "Bosch", "Ostwald", "Leblanc"), "Science", "Fritz Haber a développé le procédé Haber-Bosch en 1909, permettant la synthèse industrielle de l'ammoniac à partir d'azote et d'hydrogène."),
            en = LocalizedContent("Which chemist synthesized ammonia?", listOf("Haber", "Bosch", "Ostwald", "Leblanc"), "Science", "Fritz Haber developed the Haber-Bosch process in 1909, enabling the industrial synthesis of ammonia from nitrogen and hydrogen."),
            zh = LocalizedContent("哪位化学家合成了氨？", listOf("哈伯", "博世", "奥斯特瓦尔德", "勒布朗"), "科学", "弗里茨·哈伯于1909年开发了哈伯-博世法，实现了从氮气和氢气工业合成氨。"),
            es = LocalizedContent("¿Qué químico sintetizó el amoníaco?", listOf("Haber", "Bosch", "Ostwald", "Leblanc"), "Ciencia", "Fritz Haber desarrolló el proceso Haber-Bosch en 1909, permitiendo la síntesis industrial de amoníaco a partir de nitrógeno e hidrógeno.")
        ),
        BilingualQuestion(
            id = 12154, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La théorie quantique a été développée par?", listOf("Planck, Bohr, Schrödinger", "Heisenberg, Dirac", "Einstein, Bohr", "Tous les trois"), "Science", "La mécanique quantique a été formulée par plusieurs physiciens : Max Planck a introduit le quantum d'énergie, Niels Bohr a modélisé l'atome, et Werner Heisenberg a développé la mécanique matricielle."),
            en = LocalizedContent("Quantum theory was developed by?", listOf("Planck, Bohr, Schrödinger", "Heisenberg, Dirac", "Einstein, Bohr", "All three"), "Science", "Quantum mechanics was formulated by several physicists: Max Planck introduced the energy quantum, Niels Bohr modeled the atom, and Werner Heisenberg developed matrix mechanics."),
            zh = LocalizedContent("量子理论是由谁发展的？", listOf("普朗克、玻尔、薛定谔", "海森堡、狄拉克", "爱因斯坦、玻尔", "以上全部"), "科学", "量子力学由多位物理学家共同建立：马克斯·普朗克引入了能量量子，尼尔斯·玻尔建立了原子模型，维尔纳·海森堡发展了矩阵力学。"),
            es = LocalizedContent("La teoría cuántica fue desarrollada por?", listOf("Planck, Bohr, Schrödinger", "Heisenberg, Dirac", "Einstein, Bohr", "Todos los anteriores"), "Ciencia", "La mecánica cuántica fue formulada por varios físicos: Max Planck introdujo el cuanto de energía, Niels Bohr modeló el átomo y Werner Heisenberg desarrolló la mecánica matricial.")
        ),
        BilingualQuestion(
            id = 12155, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel élément est le plus léger?", listOf("Hélium", "Hydrogène", "Lithium", "Néon"), "Science", "L'hydrogène est l'élément le plus léger du tableau périodique, avec un seul proton et un électron. Il constitue environ 75 % de la masse de l'univers."),
            en = LocalizedContent("Which element is the lightest?", listOf("Helium", "Hydrogen", "Lithium", "Neon"), "Science", "Hydrogen is the lightest element in the periodic table, with one proton and one electron. It makes up about 75% of the universe's mass."),
            zh = LocalizedContent("哪种元素最轻？", listOf("氦", "氢", "锂", "氖"), "科学", "氢是元素周期表中最轻的元素，只有一个质子和一个电子。它约占宇宙质量的75%。"),
            es = LocalizedContent("¿Qué elemento es el más ligero?", listOf("Helio", "Hidrógeno", "Litio", "Neón"), "Ciencia", "El hidrógeno es el elemento más ligero de la tabla periódica, con un protón y un electrón. Constituye aproximadamente el 75% de la masa del universo.")
        ),
        BilingualQuestion(
            id = 12156, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La température absolue zéro est en degrés Celsius?", listOf("-273.15°C", "-250°C", "-300°C", "-273°C"), "Science", "Le zéro absolu correspond à la température théorique la plus basse possible, où l'agitation moléculaire cesse, et il équivaut à -273,15°C sur l'échelle Celsius."),
            en = LocalizedContent("Absolute zero temperature in degrees Celsius is?", listOf("-273.15°C", "-250°C", "-300°C", "-273°C"), "Science", "Absolute zero is the lowest possible theoretical temperature, where molecular motion ceases, and it equals -273.15°C on the Celsius scale."),
            zh = LocalizedContent("绝对零度以摄氏度表示是？", listOf("-273.15°C", "-250°C", "-300°C", "-273°C"), "科学", "绝对零度是理论上可能的最低温度，此时分子运动停止，相当于摄氏温标上的-273.15°C。"),
            es = LocalizedContent("La temperatura del cero absoluto en grados Celsius es?", listOf("-273.15°C", "-250°C", "-300°C", "-273°C"), "Ciencia", "El cero absoluto es la temperatura teórica más baja posible, donde cesa el movimiento molecular, y equivale a -273,15°C en la escala Celsius.")
        ),
        BilingualQuestion(
            id = 12157, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La pression atmosphérique au niveau de la mer est?", listOf("100 kPa", "101.325 kPa", "105 kPa", "110 kPa"), "Science", "La pression atmosphérique standard au niveau de la mer est définie comme 101,325 kilopascals, une valeur de référence en météorologie et en physique."),
            en = LocalizedContent("Atmospheric pressure at sea level is?", listOf("100 kPa", "101.325 kPa", "105 kPa", "110 kPa"), "Science", "Standard atmospheric pressure at sea level is defined as 101.325 kilopascals, a reference value in meteorology and physics."),
            zh = LocalizedContent("海平面的大气压力是？", listOf("100 kPa", "101.325 kPa", "105 kPa", "110 kPa"), "科学", "海平面的标准大气压定义为101.325千帕，是气象学和物理学中的参考值。"),
            es = LocalizedContent("La presión atmosférica al nivel del mar es?", listOf("100 kPa", "101.325 kPa", "105 kPa", "110 kPa"), "Ciencia", "La presión atmosférica estándar al nivel del mar se define como 101,325 kilopascales, un valor de referencia en meteorología y física.")
        ),
        BilingualQuestion(
            id = 12158, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le bore a le numéro atomique?", listOf("4", "5", "6", "7"), "Science", "Le bore est le cinquième élément du tableau périodique, avec cinq protons dans son noyau, ce qui lui confère le numéro atomique 5."),
            en = LocalizedContent("Boron has the atomic number?", listOf("4", "5", "6", "7"), "Science", "Boron is the fifth element in the periodic table, with five protons in its nucleus, giving it atomic number 5."),
            zh = LocalizedContent("硼的原子序数是？", listOf("4", "5", "6", "7"), "科学", "硼是元素周期表中的第五个元素，原子核中有五个质子，因此原子序数为5。"),
            es = LocalizedContent("El boro tiene el número atómico?", listOf("4", "5", "6", "7"), "Ciencia", "El boro es el quinto elemento de la tabla periódica, con cinco protones en su núcleo, lo que le confiere el número atómico 5.")
        ),
        BilingualQuestion(
            id = 12159, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'uranium a le numéro atomique?", listOf("90", "92", "94", "96"), "Science", "Le numéro atomique de l'uranium est 92, ce qui correspond au nombre de protons dans son noyau. Cet élément radioactif est utilisé comme combustible dans les centrales nucléaires."),
            en = LocalizedContent("What is the atomic number of uranium?", listOf("90", "92", "94", "96"), "Science", "The atomic number of uranium is 92, which corresponds to the number of protons in its nucleus. This radioactive element is used as fuel in nuclear power plants."),
            zh = LocalizedContent("铀的原子序数是多少？", listOf("90", "92", "94", "96"), "科学", "铀的原子序数是92，对应其原子核中的质子数。这种放射性元素被用作核电站的燃料。"),
            es = LocalizedContent("¿Cuál es el número atómico del uranio?", listOf("90", "92", "94", "96"), "Ciencia", "El número atómico del uranio es 92, que corresponde al número de protones en su núcleo. Este elemento radiactivo se utiliza como combustible en centrales nucleares.")
        ),
        BilingualQuestion(
            id = 12160, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La molécule d'eau contient combien d'atomes?", listOf("2", "3", "4", "5"), "Science", "Chaque molécule d'eau (H₂O) est composée de deux atomes d'hydrogène et un atome d'oxygène, soit trois atomes au total."),
            en = LocalizedContent("How many atoms does a water molecule contain?", listOf("2", "3", "4", "5"), "Science", "Each water molecule (H₂O) is composed of two hydrogen atoms and one oxygen atom, making three atoms in total."),
            zh = LocalizedContent("一个水分子含有多少个原子？", listOf("2", "3", "4", "5"), "科学", "每个水分子（H₂O）由两个氢原子和一个氧原子组成，总共三个原子。"),
            es = LocalizedContent("¿Cuántos átomos contiene una molécula de agua?", listOf("2", "3", "4", "5"), "Ciencia", "Cada molécula de agua (H₂O) está compuesta por dos átomos de hidrógeno y un átomo de oxígeno, totalizando tres átomos.")
        ),
        BilingualQuestion(
            id = 12161, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle reine française a épousé Louis VII?", listOf("Anne de Bretagne", "Éléonore d'Aquitaine", "Catherine de Médicis", "Jeanne d'Arc"), "Histoire", "Éléonore d'Aquitaine épousa Louis VII en 1137, apportant en dot le vaste duché d'Aquitaine, avant que leur mariage ne soit annulé en 1152."),
            en = LocalizedContent("Which French queen married Louis VII?", listOf("Anne of Brittany", "Eleanor of Aquitaine", "Catherine de Medici", "Joan of Arc"), "History", "Eleanor of Aquitaine married Louis VII in 1137, bringing the vast Duchy of Aquitaine as a dowry, before their marriage was annulled in 1152."),
            zh = LocalizedContent("哪位法国王后嫁给了路易七世？", listOf("安妮·布列塔尼", "阿基坦的埃莉诺", "凯瑟琳·德·美第奇", "圣女贞德"), "历史", "阿基坦的埃莉诺于1137年嫁给路易七世，带来广阔的阿基坦公国作为嫁妆，他们的婚姻于1152年宣告无效。"),
            es = LocalizedContent("¿Qué reina francesa se casó con Luis VII?", listOf("Ana de Bretaña", "Leonor de Aquitania", "Catalina de Médici", "Juana de Arco"), "Historia", "Leonor de Aquitania se casó con Luis VII en 1137, aportando como dote el vasto ducado de Aquitania, antes de que su matrimonio fuera anulado en 1152.")
        ),
        BilingualQuestion(
            id = 12162, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La bataille de Hastings s'est déroulée en?", listOf("1065", "1066", "1067", "1070"), "Histoire", "La bataille de Hastings en 1066 oppose Guillaume le Conquérant au roi Harold II, marquant la conquête normande de l'Angleterre."),
            en = LocalizedContent("The Battle of Hastings took place in?", listOf("1065", "1066", "1067", "1070"), "History", "The Battle of Hastings in 1066 pitted William the Conqueror against King Harold II, marking the Norman conquest of England."),
            zh = LocalizedContent("黑斯廷斯战役发生在哪一年？", listOf("1065", "1066", "1067", "1070"), "历史", "1066年的黑斯廷斯战役中，征服者威廉对阵国王哈罗德二世，标志着诺曼征服英格兰。"),
            es = LocalizedContent("La batalla de Hastings tuvo lugar en?", listOf("1065", "1066", "1067", "1070"), "Historia", "La batalla de Hastings en 1066 enfrentó a Guillermo el Conquistador contra el rey Harold II, marcando la conquista normanda de Inglaterra.")
        ),
        BilingualQuestion(
            id = 12163, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel roi français a lancé les Croisades?", listOf("Louis VI", "Louis VII", "Louis IX", "Louis XII"), "Histoire", "Louis IX, dit Saint Louis, a mené la septième et la huitième croisade au XIIIe siècle. Il est le seul roi de France à avoir participé personnellement aux Croisades."),
            en = LocalizedContent("Which French king launched the Crusades?", listOf("Louis VI", "Louis VII", "Louis IX", "Louis XII"), "History", "Louis IX, known as Saint Louis, led the Seventh and Eighth Crusades in the 13th century. He is the only French king to have personally participated in the Crusades."),
            zh = LocalizedContent("哪位法国国王发动了十字军东征？", listOf("路易六世", "路易七世", "路易九世", "路易十二"), "历史", "路易九世，即圣路易，在13世纪领导了第七次和第八次十字军东征。他是唯一亲自参加十字军东征的法国国王。"),
            es = LocalizedContent("¿Qué rey francés lanzó las Cruzadas?", listOf("Luis VI", "Luis VII", "Luis IX", "Luis XII"), "Historia", "Luis IX, conocido como San Luis, lideró la séptima y octava cruzada en el siglo XIII. Es el único rey de Francia que participó personalmente en las Cruzadas.")
        ),
        BilingualQuestion(
            id = 12164, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La chute de Constantinople a eu lieu en?", listOf("1400", "1432", "1453", "1480"), "Histoire", "La prise de Constantinople par les Ottomans menés par Mehmed II met fin à l'Empire byzantin en 1453."),
            en = LocalizedContent("The fall of Constantinople took place in?", listOf("1400", "1432", "1453", "1480"), "History", "The capture of Constantinople by the Ottomans led by Mehmed II ended the Byzantine Empire in 1453."),
            zh = LocalizedContent("君士坦丁堡陷落发生在哪一年？", listOf("1400", "1432", "1453", "1480"), "历史", "1453年，穆罕默德二世率领的奥斯曼人攻占君士坦丁堡，结束了拜占庭帝国。"),
            es = LocalizedContent("La caída de Constantinopla tuvo lugar en?", listOf("1400", "1432", "1453", "1480"), "Historia", "La toma de Constantinopla por los otomanos liderados por Mehmed II puso fin al Imperio bizantino en 1453.")
        ),
        BilingualQuestion(
            id = 12165, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel empereur romain a divorcé pour se marier à Anne Boleyn?", listOf("Caligula", "Claude", "Néron", "Auguste"), "Histoire", "Caligula n'a aucun lien avec Anne Boleyn, qui vécut au XVIe siècle en Angleterre. Cette question piège joue sur l'absurdité historique, car aucun empereur romain n'a épousé Anne Boleyn."),
            en = LocalizedContent("Which Roman emperor divorced to marry Anne Boleyn?", listOf("Caligula", "Claudius", "Nero", "Augustus"), "History", "Caligula has no connection to Anne Boleyn, who lived in 16th-century England. This trick question plays on historical absurdity, as no Roman emperor married Anne Boleyn."),
            zh = LocalizedContent("哪位罗马皇帝离婚后娶了安妮·博林？", listOf("卡利古拉", "克劳狄乌斯", "尼禄", "奥古斯都"), "历史", "卡利古拉与16世纪英格兰的安妮·博林毫无关联。这个陷阱题利用历史荒谬性，因为没有罗马皇帝娶过安妮·博林。"),
            es = LocalizedContent("¿Qué emperador romano se divorció para casarse con Ana Bolena?", listOf("Calígula", "Claudio", "Nerón", "Augusto"), "Historia", "Calígula no tiene ninguna relación con Ana Bolena, que vivió en la Inglaterra del siglo XVI. Esta pregunta trampa juega con el absurdo histórico, ya que ningún emperador romano se casó con Ana Bolena.")
        ),
        BilingualQuestion(
            id = 12166, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La Révolution chinoise a commencé en?", listOf("1900", "1911", "1921", "1949"), "Histoire", "La révolution chinoise de 1911 a renversé la dynastie Qing, mettant fin à plus de deux mille ans de régime impérial en Chine."),
            en = LocalizedContent("The Chinese Revolution began in?", listOf("1900", "1911", "1921", "1949"), "History", "The Chinese Revolution of 1911 overthrew the Qing dynasty, ending more than two thousand years of imperial rule in China."),
            zh = LocalizedContent("中国革命始于哪一年？", listOf("1900", "1911", "1921", "1949"), "历史", "1911年的辛亥革命推翻了清朝，结束了中国两千多年的帝制统治。"),
            es = LocalizedContent("La Revolución china comenzó en?", listOf("1900", "1911", "1921", "1949"), "Historia", "La Revolución china de 1911 derrocó a la dinastía Qing, poniendo fin a más de dos mil años de régimen imperial en China.")
        ),
        BilingualQuestion(
            id = 12167, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Renaissance italienne a commencé au?", listOf("XIIe siècle", "XIIIe siècle", "XIVe siècle", "XVe siècle"), "Histoire", "La Renaissance italienne débute au XIVe siècle, marquée par l'émergence de l'humanisme et des figures comme Pétrarque et Boccace."),
            en = LocalizedContent("The Italian Renaissance began in the?", listOf("12th century", "13th century", "14th century", "15th century"), "History", "The Italian Renaissance began in the 14th century, marked by the emergence of humanism and figures like Petrarch and Boccaccio."),
            zh = LocalizedContent("意大利文艺复兴始于哪个世纪？", listOf("12世纪", "13世纪", "14世纪", "15世纪"), "历史", "意大利文艺复兴始于14世纪，以人文主义的兴起和彼特拉克、薄伽丘等人为代表。"),
            es = LocalizedContent("El Renacimiento italiano comenzó en el?", listOf("siglo XII", "siglo XIII", "siglo XIV", "siglo XV"), "Historia", "El Renacimiento italiano comenzó en el siglo XIV, marcado por el surgimiento del humanismo y figuras como Petrarca y Boccaccio.")
        ),
        BilingualQuestion(
            id = 12168, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel explorateur a découvert l'Amérique du Nord?", listOf("Christophe Colomb", "Leif Erikson", "Vasco de Gama", "Magellan"), "Histoire", "Leif Erikson, un explorateur viking, a atteint l'Amérique du Nord vers l'an 1000, soit près de 500 ans avant Christophe Colomb, en établissant une colonie à Terre-Neuve."),
            en = LocalizedContent("Which explorer discovered North America?", listOf("Christopher Columbus", "Leif Erikson", "Vasco da Gama", "Magellan"), "History", "Leif Erikson, a Viking explorer, reached North America around the year 1000, nearly 500 years before Christopher Columbus, establishing a settlement in Newfoundland."),
            zh = LocalizedContent("哪位探险家发现了北美？", listOf("克里斯托弗·哥伦布", "莱夫·埃里克松", "瓦斯科·达·伽马", "麦哲伦"), "历史", "维京探险家莱夫·埃里克松约在公元1000年到达北美，比克里斯托弗·哥伦布早近500年，并在纽芬兰建立了定居点。"),
            es = LocalizedContent("¿Qué explorador descubrió América del Norte?", listOf("Cristóbal Colón", "Leif Erikson", "Vasco da Gama", "Magallanes"), "Historia", "Leif Erikson, un explorador vikingo, llegó a América del Norte alrededor del año 1000, casi 500 años antes que Cristóbal Colón, estableciendo un asentamiento en Terranova.")
        ),
        BilingualQuestion(
            id = 12169, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La traite atlantique a duré?", listOf("100 ans", "200 ans", "300 ans", "400 ans"), "Histoire", "La traite atlantique s'est déroulée du XVe au XIXe siècle, soit environ 400 ans, impliquant le transport forcé de millions d'Africains vers les Amériques."),
            en = LocalizedContent("How long did the Atlantic slave trade last?", listOf("100 years", "200 years", "300 years", "400 years"), "History", "The Atlantic slave trade lasted from the 15th to the 19th century, about 400 years, involving the forced transport of millions of Africans to the Americas."),
            zh = LocalizedContent("大西洋奴隶贸易持续了多久？", listOf("100年", "200年", "300年", "400年"), "历史", "大西洋奴隶贸易从15世纪持续到19世纪，约400年，涉及数百万非洲人被强制运往美洲。"),
            es = LocalizedContent("¿Cuánto duró la trata atlántica?", listOf("100 años", "200 años", "300 años", "400 años"), "Historia", "La trata atlántica duró desde el siglo XV hasta el XIX, unos 400 años, implicando el transporte forzado de millones de africanos a las Américas.")
        ),
        BilingualQuestion(
            id = 12170, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Japon féodal a duré jusqu'en?", listOf("1868", "1850", "1900", "1920"), "Histoire", "Le Japon féodal prit fin en 1868 avec la restauration Meiji, qui mit un terme au shogunat Tokugawa et restaura le pouvoir impérial."),
            en = LocalizedContent("Feudal Japan lasted until?", listOf("1868", "1850", "1900", "1920"), "History", "Feudal Japan ended in 1868 with the Meiji Restoration, which ended the Tokugawa shogunate and restored imperial power."),
            zh = LocalizedContent("日本封建时代持续到哪一年？", listOf("1868年", "1850年", "1900年", "1920年"), "历史", "日本封建时代于1868年明治维新结束，终结了德川幕府，恢复了天皇权力。"),
            es = LocalizedContent("¿Hasta cuándo duró el Japón feudal?", listOf("1868", "1850", "1900", "1920"), "Historia", "El Japón feudal terminó en 1868 con la Restauración Meiji, que puso fin al shogunato Tokugawa y restauró el poder imperial.")
        ),
        BilingualQuestion(
            id = 12171, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Diète de Worms a eu lieu en?", listOf("1500", "1521", "1545", "1555"), "Histoire", "La Diète de Worms de 1521 est célèbre pour la comparution de Martin Luther, convoqué pour se rétracter, ce qui mena à son excommunication par l'édit de Worms."),
            en = LocalizedContent("The Diet of Worms took place in?", listOf("1500", "1521", "1545", "1555"), "History", "The Diet of Worms in 1521 is famous for the appearance of Martin Luther, summoned to recant, leading to his excommunication by the Edict of Worms."),
            zh = LocalizedContent("沃尔姆斯议会发生在哪一年？", listOf("1500年", "1521年", "1545年", "1555年"), "历史", "1521年的沃尔姆斯议会因马丁·路德被传唤撤回言论而闻名，最终导致他被沃尔姆斯敕令逐出教会。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Dieta de Worms?", listOf("1500", "1521", "1545", "1555"), "Historia", "La Dieta de Worms de 1521 es famosa por la comparecencia de Martín Lutero, convocado para retractarse, lo que llevó a su excomunión mediante el Edicto de Worms.")
        ),
        BilingualQuestion(
            id = 12172, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel général a fondé l'empire ottoman?", listOf("Mehmed II", "Osman I", "Bajazet II", "Suleiman I"), "Histoire", "Osman Ier, chef de la tribu turque des Kayı, unifia les beylikats d'Anatolie et fonda l'État ottoman vers 1299."),
            en = LocalizedContent("Which general founded the Ottoman Empire?", listOf("Mehmed II", "Osman I", "Bayezid II", "Suleiman I"), "History", "Osman I, leader of the Kayı Turkish tribe, unified the Anatolian beyliks and founded the Ottoman state around 1299."),
            zh = LocalizedContent("哪位将军建立了奥斯曼帝国？", listOf("穆罕默德二世", "奥斯曼一世", "巴耶济德二世", "苏莱曼一世"), "历史", "奥斯曼一世，卡耶部落的领袖，统一了安纳托利亚的贝伊国，并于1299年左右建立了奥斯曼国家。"),
            es = LocalizedContent("¿Qué general fundó el Imperio Otomano?", listOf("Mehmed II", "Osman I", "Bayaceto II", "Solimán I"), "Historia", "Osman I, líder de la tribu turca Kayı, unificó los beylikatos de Anatolia y fundó el estado otomano hacia 1299.")
        ),
        BilingualQuestion(
            id = 12173, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La bataille de Waterloo s'est déroulée en?", listOf("1812", "1814", "1815", "1818"), "Histoire", "La bataille de Waterloo a eu lieu le 18 juin 1815, marquant la défaite définitive de Napoléon Bonaparte face aux armées britannique et prussienne."),
            en = LocalizedContent("The Battle of Waterloo took place in?", listOf("1812", "1814", "1815", "1818"), "History", "The Battle of Waterloo occurred on June 18, 1815, marking the final defeat of Napoleon Bonaparte by the British and Prussian armies."),
            zh = LocalizedContent("滑铁卢战役发生在哪一年？", listOf("1812年", "1814年", "1815年", "1818年"), "历史", "滑铁卢战役发生于1815年6月18日，标志着拿破仑·波拿巴被英普联军彻底击败。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Batalla de Waterloo?", listOf("1812", "1814", "1815", "1818"), "Historia", "La Batalla de Waterloo tuvo lugar el 18 de junio de 1815, marcando la derrota definitiva de Napoleón Bonaparte ante los ejércitos británico y prusiano.")
        ),
        BilingualQuestion(
            id = 12174, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel roi français a révoqué l'Édit de Nantes?", listOf("Henri IV", "Louis XIII", "Louis XIV", "Louis XV"), "Histoire", "Louis XIV révoqua l'Édit de Nantes en 1685 par l'édit de Fontainebleau, mettant fin à la tolérance religieuse accordée aux protestants par Henri IV."),
            en = LocalizedContent("Which French king revoked the Edict of Nantes?", listOf("Henry IV", "Louis XIII", "Louis XIV", "Louis XV"), "History", "Louis XIV revoked the Edict of Nantes in 1685 with the Edict of Fontainebleau, ending religious tolerance granted to Protestants by Henry IV."),
            zh = LocalizedContent("哪位法国国王废除了南特敕令？", listOf("亨利四世", "路易十三", "路易十四", "路易十五"), "历史", "路易十四于1685年通过枫丹白露敕令废除了南特敕令，结束了亨利四世给予新教徒的宗教宽容。"),
            es = LocalizedContent("¿Qué rey francés revocó el Edicto de Nantes?", listOf("Enrique IV", "Luis XIII", "Luis XIV", "Luis XV"), "Historia", "Luis XIV revocó el Edicto de Nantes en 1685 mediante el Edicto de Fontainebleau, poniendo fin a la tolerancia religiosa otorgada a los protestantes por Enrique IV.")
        ),
        BilingualQuestion(
            id = 12175, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La Seconde Guerre mondiale a commencé en?", listOf("1937", "1938", "1939", "1940"), "Histoire", "L'invasion de la Pologne par l'Allemagne nazie le 1er septembre 1939 déclencha le conflit, après l'échec des tentatives de paix."),
            en = LocalizedContent("World War II began in?", listOf("1937", "1938", "1939", "1940"), "History", "The invasion of Poland by Nazi Germany on September 1, 1939 triggered the conflict, after failed peace attempts."),
            zh = LocalizedContent("第二次世界大战始于哪一年？", listOf("1937年", "1938年", "1939年", "1940年"), "历史", "1939年9月1日纳粹德国入侵波兰，在和平努力失败后引发了冲突。"),
            es = LocalizedContent("¿En qué año comenzó la Segunda Guerra Mundial?", listOf("1937", "1938", "1939", "1940"), "Historia", "La invasión de Polonia por la Alemania nazi el 1 de septiembre de 1939 desencadenó el conflicto, tras el fracaso de los intentos de paz.")
        ),
        BilingualQuestion(
            id = 12176, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'Inde a obtenu son indépendance en?", listOf("1945", "1946", "1947", "1948"), "Histoire", "L'Inde est devenue indépendante du Royaume-Uni le 15 août 1947, après un long mouvement non-violent mené par Gandhi. Cette date marque la fin de la domination coloniale britannique dans le sous-continent indien."),
            en = LocalizedContent("India gained independence in?", listOf("1945", "1946", "1947", "1948"), "History", "India became independent from the United Kingdom on August 15, 1947, after a long non-violent movement led by Gandhi. This date marks the end of British colonial rule in the Indian subcontinent."),
            zh = LocalizedContent("印度于哪一年获得独立？", listOf("1945年", "1946年", "1947年", "1948年"), "历史", "印度于1947年8月15日脱离英国独立，此前经历了甘地领导的长期非暴力运动。这一天标志着英国在印度次大陆殖民统治的结束。"),
            es = LocalizedContent("¿En qué año obtuvo la India su independencia?", listOf("1945", "1946", "1947", "1948"), "Historia", "La India se independizó del Reino Unido el 15 de agosto de 1947, tras un largo movimiento no violento liderado por Gandhi. Esta fecha marca el fin del dominio colonial británico en el subcontinente indio.")
        ),
        BilingualQuestion(
            id = 12177, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le calendrier grégorien a été introduit en?", listOf("1566", "1582", "1600", "1650"), "Histoire", "Le pape Grégoire XIII a promulgué la réforme du calendrier julien en 1582 pour corriger le décalage astronomique lié aux années bissextiles."),
            en = LocalizedContent("The Gregorian calendar was introduced in?", listOf("1566", "1582", "1600", "1650"), "History", "Pope Gregory XIII promulgated the reform of the Julian calendar in 1582 to correct the astronomical drift related to leap years."),
            zh = LocalizedContent("格里高利历于哪一年引入？", listOf("1566年", "1582年", "1600年", "1650年"), "历史", "教皇格里高利十三世于1582年颁布了儒略历的改革，以纠正与闰年相关的天文偏差。"),
            es = LocalizedContent("¿En qué año se introdujo el calendario gregoriano?", listOf("1566", "1582", "1600", "1650"), "Historia", "El papa Gregorio XIII promulgó la reforma del calendario juliano en 1582 para corregir el desfase astronómico relacionado con los años bisiestos.")
        ),
        BilingualQuestion(
            id = 12178, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le port de Carthage était situé en?", listOf("Tunisie", "Libye", "Algérie", "Maroc"), "Histoire", "Carthage était une cité antique fondée par les Phéniciens sur la côte de l'actuelle Tunisie, près de Tunis. Son port était un centre commercial majeur de la Méditerranée."),
            en = LocalizedContent("The port of Carthage was located in?", listOf("Tunisia", "Libya", "Algeria", "Morocco"), "History", "Carthage was an ancient city founded by the Phoenicians on the coast of present-day Tunisia, near Tunis. Its port was a major Mediterranean commercial center."),
            zh = LocalizedContent("迦太基港口位于哪个国家？", listOf("突尼斯", "利比亚", "阿尔及利亚", "摩洛哥"), "历史", "迦太基是腓尼基人在今突尼斯海岸（靠近突尼斯市）建立的古城。其港口是地中海重要的商业中心。"),
            es = LocalizedContent("¿Dónde se ubicaba el puerto de Cartago?", listOf("Túnez", "Libia", "Argelia", "Marruecos"), "Historia", "Cartago fue una ciudad antigua fundada por los fenicios en la costa de la actual Túnez, cerca de Túnez. Su puerto era un importante centro comercial del Mediterráneo.")
        ),
        BilingualQuestion(
            id = 12179, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Les gladiateurs romains combattaient dans?", listOf("Un amphithéâtre", "Un colosseum", "Une arène", "Un stade"), "Histoire", "Le mot arène désignait à l'origine le sable qui recouvrait le sol des amphithéâtres romains, absorbant le sang des combats de gladiateurs."),
            en = LocalizedContent("Roman gladiators fought in?", listOf("An amphitheatre", "A colosseum", "An arena", "A stadium"), "History", "The word arena originally referred to the sand that covered the floor of Roman amphitheatres, absorbing the blood of gladiator fights."),
            zh = LocalizedContent("罗马角斗士在哪里战斗？", listOf("圆形剧场", "斗兽场", "竞技场", "体育场"), "历史", "竞技场一词最初指覆盖罗马圆形剧场地面的沙子，用于吸收角斗士战斗的血液。"),
            es = LocalizedContent("¿Los gladiadores romanos luchaban en?", listOf("Un anfiteatro", "Un coliseo", "Una arena", "Un estadio"), "Historia", "La palabra arena se refería originalmente a la arena que cubría el suelo de los anfiteatros romanos, absorbiendo la sangre de las luchas de gladiadores.")
        ),
        BilingualQuestion(
            id = 12180, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La Grande Muraille de Chine a été construite sur environ?", listOf("3000 km", "5000 km", "8000 km", "10000 km"), "Histoire", "La Grande Muraille de Chine s'étend sur environ 21 000 km si l'on inclut toutes ses branches, mais la section principale et la plus célèbre mesure environ 8 000 km, une distance souvent citée pour sa longueur historique."),
            en = LocalizedContent("The Great Wall of China was built over approximately?", listOf("3000 km", "5000 km", "8000 km", "10000 km"), "History", "The Great Wall of China stretches about 21,000 km if all its branches are included, but the main and most famous section measures about 8,000 km, a distance often cited for its historical length."),
            zh = LocalizedContent("中国长城大约修建了多长？", listOf("3000公里", "5000公里", "8000公里", "10000公里"), "历史", "如果包括所有分支，中国长城全长约21000公里，但最主要和最著名的部分长约8000公里，这一距离常被引用为其历史长度。"),
            es = LocalizedContent("¿La Gran Muralla China se construyó a lo largo de aproximadamente?", listOf("3000 km", "5000 km", "8000 km", "10000 km"), "Historia", "La Gran Muralla China se extiende unos 21.000 km si se incluyen todas sus ramas, pero la sección principal y más famosa mide unos 8.000 km, una distancia a menudo citada por su longitud histórica.")
        ),
        BilingualQuestion(
            id = 12181, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel volcan a détruit Pompéi?", listOf("Vésuve", "Etna", "Stromboli", "Vulcano"), "Histoire", "Le Vésuve est le volcan italien dont l'éruption en 79 après J.-C. a enseveli Pompéi sous les cendres et les pierres ponces."),
            en = LocalizedContent("Which volcano destroyed Pompeii?", listOf("Vesuvius", "Etna", "Stromboli", "Vulcano"), "History", "Vesuvius is the Italian volcano whose eruption in 79 AD buried Pompeii under ash and pumice."),
            zh = LocalizedContent("哪座火山摧毁了庞贝？", listOf("维苏威火山", "埃特纳火山", "斯特龙博利火山", "武尔卡诺火山"), "历史", "维苏威火山是意大利的火山，公元79年的喷发将庞贝掩埋在火山灰和浮石之下。"),
            es = LocalizedContent("¿Qué volcán destruyó Pompeya?", listOf("Vesubio", "Etna", "Estrómboli", "Vulcano"), "Historia", "El Vesubio es el volcán italiano cuya erupción en el año 79 d.C. sepultó Pompeya bajo cenizas y piedra pómez.")
        ),
        BilingualQuestion(
            id = 12182, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Grande Bibliothèque d'Alexandrie contenait environ?", listOf("100 000 livres", "500 000 livres", "1 million de livres", "5 millions de livres"), "Histoire", "La Grande Bibliothèque d'Alexandrie, fondée au IIIe siècle av. J.-C., visait à rassembler toute la connaissance du monde antique, atteignant un fonds estimé à 500 000 rouleaux de papyrus."),
            en = LocalizedContent("The Great Library of Alexandria contained approximately?", listOf("100,000 books", "500,000 books", "1 million books", "5 million books"), "History", "The Great Library of Alexandria, founded in the 3rd century BC, aimed to gather all knowledge of the ancient world, reaching an estimated collection of 500,000 papyrus scrolls."),
            zh = LocalizedContent("亚历山大图书馆大约藏有多少书？", listOf("10万册", "50万册", "100万册", "500万册"), "历史", "亚历山大图书馆建于公元前3世纪，旨在收集古代世界的所有知识，馆藏估计达到50万卷纸莎草卷。"),
            es = LocalizedContent("¿La Gran Biblioteca de Alejandría contenía aproximadamente?", listOf("100.000 libros", "500.000 libros", "1 millón de libros", "5 millones de libros"), "Historia", "La Gran Biblioteca de Alejandría, fundada en el siglo III a.C., pretendía reunir todo el conocimiento del mundo antiguo, alcanzando una colección estimada de 500.000 rollos de papiro.")
        ),
        BilingualQuestion(
            id = 12183, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le traité de Versailles a été signé en?", listOf("1918", "1919", "1920", "1921"), "Histoire", "Le traité de Versailles, signé le 28 juin 1919, mit officiellement fin à la Première Guerre mondiale entre les Alliés et l'Allemagne."),
            en = LocalizedContent("The Treaty of Versailles was signed in?", listOf("1918", "1919", "1920", "1921"), "History", "The Treaty of Versailles, signed on June 28, 1919, officially ended World War I between the Allies and Germany."),
            zh = LocalizedContent("《凡尔赛条约》签署于哪一年？", listOf("1918年", "1919年", "1920年", "1921年"), "历史", "《凡尔赛条约》于1919年6月28日签署，正式结束了协约国与德国之间的第一次世界大战。"),
            es = LocalizedContent("¿El Tratado de Versalles se firmó en?", listOf("1918", "1919", "1920", "1921"), "Historia", "El Tratado de Versalles, firmado el 28 de junio de 1919, puso fin oficialmente a la Primera Guerra Mundial entre los Aliados y Alemania.")
        ),
        BilingualQuestion(
            id = 12184, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Conférence de Yalta a réuni quels dirigeants?", listOf("Roosevelt, Churchill, Staline", "Truman, Attlee, Staline", "Roosevelt, Chamberlain, Hitler", "Churchill, De Gaulle, Stalin"), "Histoire", "En février 1945, les dirigeants des États-Unis, du Royaume-Uni et de l'URSS se sont rencontrés à Yalta pour planifier l'après-guerre."),
            en = LocalizedContent("The Yalta Conference brought together which leaders?", listOf("Roosevelt, Churchill, Stalin", "Truman, Attlee, Stalin", "Roosevelt, Chamberlain, Hitler", "Churchill, De Gaulle, Stalin"), "History", "In February 1945, the leaders of the United States, the United Kingdom, and the USSR met at Yalta to plan the post-war period."),
            zh = LocalizedContent("雅尔塔会议汇集了哪些领导人？", listOf("罗斯福、丘吉尔、斯大林", "杜鲁门、艾德礼、斯大林", "罗斯福、张伯伦、希特勒", "丘吉尔、戴高乐、斯大林"), "历史", "1945年2月，美国、英国和苏联的领导人在雅尔塔会面，规划战后事宜。"),
            es = LocalizedContent("¿La Conferencia de Yalta reunió a qué líderes?", listOf("Roosevelt, Churchill, Stalin", "Truman, Attlee, Stalin", "Roosevelt, Chamberlain, Hitler", "Churchill, De Gaulle, Stalin"), "Historia", "En febrero de 1945, los líderes de Estados Unidos, Reino Unido y la URSS se reunieron en Yalta para planificar la posguerra.")
        ),
        BilingualQuestion(
            id = 12185, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'esclave Spartacus a mené une révolte en?", listOf("70 av. J.-C.", "73 av. J.-C.", "50 av. J.-C.", "30 av. J.-C."), "Histoire", "Spartacus, un gladiateur thrace, a dirigé la plus grande révolte d'esclaves de la République romaine, connue sous le nom de Troisième Guerre servile, qui s'est déroulée entre 73 et 71 av. J.-C., avec son apogée en 70 av. J.-C."),
            en = LocalizedContent("The slave Spartacus led a revolt in?", listOf("70 BC", "73 BC", "50 BC", "30 BC"), "History", "Spartacus, a Thracian gladiator, led the largest slave revolt of the Roman Republic, known as the Third Servile War, which took place between 73 and 71 BC, with its peak in 70 BC."),
            zh = LocalizedContent("奴隶斯巴达克斯在哪一年领导了起义？", listOf("公元前70年", "公元前73年", "公元前50年", "公元前30年"), "历史", "斯巴达克斯是一名色雷斯角斗士，领导了罗马共和国最大规模的奴隶起义，即第三次奴隶战争，发生在公元前73年至71年，高潮在公元前70年。"),
            es = LocalizedContent("¿El esclavo Espartaco lideró una revuelta en?", listOf("70 a.C.", "73 a.C.", "50 a.C.", "30 a.C."), "Historia", "Espartaco, un gladiador tracio, dirigió la mayor revuelta de esclavos de la República romana, conocida como la Tercera Guerra Servil, que tuvo lugar entre el 73 y el 71 a.C., con su apogeo en el 70 a.C.")
        ),
        BilingualQuestion(
            id = 12186, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel détroit relie le Pakistan et l'Inde à l'océan Indien?", listOf("Détroit d'Ormuz", "Golfe du Bengale", "Mer d'Oman", "Détroit de Malacca"), "Géographie", "La mer d'Oman est une mer bordière de l'océan Indien, située entre la péninsule arabique et le sous-continent indien, et elle baigne les côtes du Pakistan et de l'Inde."),
            en = LocalizedContent("Which strait connects Pakistan and India to the Indian Ocean?", listOf("Strait of Hormuz", "Bay of Bengal", "Arabian Sea", "Strait of Malacca"), "Geography", "The Arabian Sea is a marginal sea of the Indian Ocean, located between the Arabian Peninsula and the Indian subcontinent, and it borders the coasts of Pakistan and India."),
            zh = LocalizedContent("哪个海峡连接巴基斯坦和印度与印度洋？", listOf("霍尔木兹海峡", "孟加拉湾", "阿拉伯海", "马六甲海峡"), "地理", "阿拉伯海是印度洋的一个边缘海，位于阿拉伯半岛和印度次大陆之间，毗邻巴基斯坦和印度的海岸。"),
            es = LocalizedContent("¿Qué estrecho conecta Pakistán e India con el océano Índico?", listOf("Estrecho de Ormuz", "Golfo de Bengala", "Mar Arábigo", "Estrecho de Malaca"), "Geografía", "El mar Arábigo es un mar marginal del océano Índico, situado entre la península arábiga y el subcontinente indio, y baña las costas de Pakistán e India.")
        ),
        BilingualQuestion(
            id = 12187, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La plus grande île du monde est?", listOf("Nouvelle-Guinée", "Bornéo", "Groenland", "Madagascar"), "Géographie", "Le Groenland est la plus grande île du monde avec une superficie d'environ 2,16 millions de km², bien que l'Australie soit considérée comme un continent."),
            en = LocalizedContent("The largest island in the world is?", listOf("New Guinea", "Borneo", "Greenland", "Madagascar"), "Geography", "Greenland is the largest island in the world with an area of about 2.16 million km², although Australia is considered a continent."),
            zh = LocalizedContent("世界上最大的岛屿是？", listOf("新几内亚岛", "婆罗洲", "格陵兰", "马达加斯加"), "地理", "格陵兰是世界上最大的岛屿，面积约216万平方公里，尽管澳大利亚被视为一个大陆。"),
            es = LocalizedContent("¿La isla más grande del mundo es?", listOf("Nueva Guinea", "Borneo", "Groenlandia", "Madagascar"), "Geografía", "Groenlandia es la isla más grande del mundo con una superficie de aproximadamente 2,16 millones de km², aunque Australia se considera un continente.")
        ),
        BilingualQuestion(
            id = 12188, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fleuve forme la frontière entre l'Égypte et le Soudan?", listOf("Nil bleu", "Nil blanc", "Nil", "Atbara"), "Géographie", "Le Nil traverse l'Égypte et le Soudan, et une partie de son cours sert de frontière naturelle entre les deux pays, notamment dans la région du lac Nasser."),
            en = LocalizedContent("Which river forms the border between Egypt and Sudan?", listOf("Blue Nile", "White Nile", "Nile", "Atbara"), "Geography", "The Nile flows through Egypt and Sudan, and part of its course serves as a natural border between the two countries, especially in the Lake Nasser region."),
            zh = LocalizedContent("哪条河流构成了埃及和苏丹的边界？", listOf("青尼罗河", "白尼罗河", "尼罗河", "阿特巴拉河"), "地理", "尼罗河流经埃及和苏丹，其部分河道成为两国之间的自然边界，尤其是在纳赛尔湖地区。"),
            es = LocalizedContent("¿Qué río forma la frontera entre Egipto y Sudán?", listOf("Nilo Azul", "Nilo Blanco", "Nilo", "Atbara"), "Geografía", "El Nilo atraviesa Egipto y Sudán, y parte de su curso sirve como frontera natural entre los dos países, especialmente en la región del lago Nasser.")
        ),
    )

    private fun part3(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 12189, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La chaîne de l'Oural sépare l'Europe de?", listOf("L'Asie", "L'Afrique", "L'Amérique", "L'Océanie"), "Géographie", "La chaîne de l'Oural est traditionnellement considérée comme la frontière naturelle entre l'Europe et l'Asie, séparant la Russie européenne de la Sibérie."),
            en = LocalizedContent("The Ural Mountains separate Europe from?", listOf("Asia", "Africa", "America", "Oceania"), "Geography", "The Ural Mountains are traditionally considered the natural boundary between Europe and Asia, separating European Russia from Siberia."),
            zh = LocalizedContent("乌拉尔山脉将欧洲与什么分开？", listOf("亚洲", "非洲", "美洲", "大洋洲"), "地理", "乌拉尔山脉传统上被认为是欧洲和亚洲之间的天然分界线，将欧洲俄罗斯与西伯利亚分开。"),
            es = LocalizedContent("¿La cordillera de los Urales separa Europa de?", listOf("Asia", "África", "América", "Oceanía"), "Geografía", "La cordillera de los Urales se considera tradicionalmente la frontera natural entre Europa y Asia, separando la Rusia europea de Siberia.")
        ),
        BilingualQuestion(
            id = 12190, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La mer Morte est entre quel pays et quel pays?", listOf("Israël et Jordanie", "Israël et Palestin", "Syrie et Jordanie", "Liban et Syrie"), "Géographie", "La mer Morte est située dans la vallée du Grand Rift, bordée à l'ouest par Israël et à l'est par la Jordanie."),
            en = LocalizedContent("The Dead Sea is between which two countries?", listOf("Israel and Jordan", "Israel and Palestine", "Syria and Jordan", "Lebanon and Syria"), "Geography", "The Dead Sea is located in the Great Rift Valley, bordered to the west by Israel and to the east by Jordan."),
            zh = LocalizedContent("死海位于哪两个国家之间？", listOf("以色列和约旦", "以色列和巴勒斯坦", "叙利亚和约旦", "黎巴嫩和叙利亚"), "地理", "死海位于大裂谷中，西边是以色列，东边是约旦。"),
            es = LocalizedContent("¿El mar Muerto está entre qué dos países?", listOf("Israel y Jordania", "Israel y Palestina", "Siria y Jordania", "Líbano y Siria"), "Geografía", "El mar Muerto se encuentra en el valle del Gran Rift, limitado al oeste por Israel y al este por Jordania.")
        ),
        BilingualQuestion(
            id = 12191, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le delta du Nil se situe en?", listOf("Moyenne Égypte", "Haute Égypte", "Basse Égypte", "Égypte centrale"), "Géographie", "Le delta du Nil se situe en Basse Égypte car cette région correspond à la partie nord du pays, où le fleuve se divise en plusieurs branches avant de se jeter dans la Méditerranée."),
            en = LocalizedContent("The Nile Delta is located in?", listOf("Middle Egypt", "Upper Egypt", "Lower Egypt", "Central Egypt"), "Geography", "The Nile Delta is located in Lower Egypt, as this region corresponds to the northern part of the country, where the river splits into several branches before flowing into the Mediterranean."),
            zh = LocalizedContent("尼罗河三角洲位于？", listOf("中埃及", "上埃及", "下埃及", "中埃及"), "地理", "尼罗河三角洲位于下埃及，因为该地区对应埃及北部，河流在此分成多条支流注入地中海。"),
            es = LocalizedContent("¿El delta del Nilo se encuentra en?", listOf("Egipto Medio", "Alto Egipto", "Bajo Egipto", "Egipto Central"), "Geografía", "El delta del Nilo se encuentra en el Bajo Egipto, ya que esta región corresponde a la parte norte del país, donde el río se divide en varios brazos antes de desembocar en el Mediterráneo.")
        ),
        BilingualQuestion(
            id = 12192, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'île de Zanzibar appartient à quel pays?", listOf("Tanzanie", "Kenya", "Ouganda", "Mozambique"), "Géographie", "Zanzibar est un archipel semi-autonome rattaché à la Tanzanie depuis l'union du Tanganyika et de Zanzibar en 1964."),
            en = LocalizedContent("Zanzibar Island belongs to which country?", listOf("Tanzania", "Kenya", "Uganda", "Mozambique"), "Geography", "Zanzibar is a semi-autonomous archipelago attached to Tanzania since the union of Tanganyika and Zanzibar in 1964."),
            zh = LocalizedContent("桑给巴尔岛属于哪个国家？", listOf("坦桑尼亚", "肯尼亚", "乌干达", "莫桑比克"), "地理", "桑给巴尔是一个半自治的群岛，自1964年坦噶尼喀和桑给巴尔联合后隶属于坦桑尼亚。"),
            es = LocalizedContent("¿La isla de Zanzíbar pertenece a qué país?", listOf("Tanzania", "Kenia", "Uganda", "Mozambique"), "Geografía", "Zanzíbar es un archipiélago semiautónomo adscrito a Tanzania desde la unión de Tanganica y Zanzíbar en 1964.")
        ),
        BilingualQuestion(
            id = 12193, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel océan borde le plus de pays?", listOf("Océan Atlantique", "Océan Pacifique", "Océan Indien", "Océan Arctique"), "Géographie", "L'océan Atlantique borde plus de 50 pays sur ses rives est et ouest, incluant des nations d'Europe, d'Afrique et d'Amérique, ce qui en fait l'océan avec le plus grand nombre de pays riverains."),
            en = LocalizedContent("Which ocean borders the most countries?", listOf("Atlantic Ocean", "Pacific Ocean", "Indian Ocean", "Arctic Ocean"), "Geography", "The Atlantic Ocean borders more than 50 countries on its eastern and western shores, including nations from Europe, Africa, and the Americas, making it the ocean with the most bordering countries."),
            zh = LocalizedContent("哪个大洋与最多的国家接壤？", listOf("大西洋", "太平洋", "印度洋", "北冰洋"), "地理", "大西洋东西两岸与超过50个国家接壤，包括欧洲、非洲和美洲的国家，是接壤国家最多的大洋。"),
            es = LocalizedContent("¿Qué océano limita con más países?", listOf("Océano Atlántico", "Océano Pacífico", "Océano Índico", "Océano Ártico"), "Geografía", "El océano Atlántico limita con más de 50 países en sus costas este y oeste, incluyendo naciones de Europa, África y América, lo que lo convierte en el océano con mayor número de países ribereños.")
        ),
        BilingualQuestion(
            id = 12194, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand lac d'Afrique?", listOf("Lac Victoria", "Lac Tanganyika", "Lac Nyassa", "Lac Turkana"), "Géographie", "Le lac Victoria est le plus grand lac d'Afrique par sa superficie, s'étendant sur environ 68 800 km². Il est situé entre l'Ouganda, la Tanzanie et le Kenya, et constitue une source majeure du Nil Blanc."),
            en = LocalizedContent("What is the largest lake in Africa?", listOf("Lake Victoria", "Lake Tanganyika", "Lake Nyasa", "Lake Turkana"), "Geography", "Lake Victoria is the largest lake in Africa by surface area, covering approximately 68,800 km². It is located between Uganda, Tanzania, and Kenya, and is a major source of the White Nile."),
            zh = LocalizedContent("非洲最大的湖泊是？", listOf("维多利亚湖", "坦噶尼喀湖", "尼亚萨湖", "图尔卡纳湖"), "地理", "维多利亚湖是非洲面积最大的湖泊，面积约68,800平方公里。它位于乌干达、坦桑尼亚和肯尼亚之间，是白尼罗河的主要源头。"),
            es = LocalizedContent("¿Cuál es el lago más grande de África?", listOf("Lago Victoria", "Lago Tanganica", "Lago Nyasa", "Lago Turkana"), "Geografía", "El lago Victoria es el lago más grande de África por superficie, con aproximadamente 68.800 km². Se encuentra entre Uganda, Tanzania y Kenia, y es una fuente importante del Nilo Blanco.")
        ),
        BilingualQuestion(
            id = 12195, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La péninsule Ibérique comprend?", listOf("Portugal et Espagne", "Espagne et Italie", "Portugal et France", "Espagne et Andorre"), "Géographie", "La péninsule Ibérique est située à l'extrémité sud-ouest de l'Europe et est principalement occupée par l'Espagne et le Portugal."),
            en = LocalizedContent("The Iberian Peninsula includes?", listOf("Portugal and Spain", "Spain and Italy", "Portugal and France", "Spain and Andorra"), "Geography", "The Iberian Peninsula is located at the southwestern tip of Europe and is mainly occupied by Spain and Portugal."),
            zh = LocalizedContent("伊比利亚半岛包括？", listOf("葡萄牙和西班牙", "西班牙和意大利", "葡萄牙和法国", "西班牙和安道尔"), "地理", "伊比利亚半岛位于欧洲西南端，主要由西班牙和葡萄牙占据。"),
            es = LocalizedContent("¿La península ibérica comprende?", listOf("Portugal y España", "España e Italia", "Portugal y Francia", "España y Andorra"), "Geografía", "La península ibérica está situada en el extremo suroeste de Europa y está ocupada principalmente por España y Portugal.")
        ),
        BilingualQuestion(
            id = 12196, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Le canal de Suez relie la Méditerranée à?", listOf("Mer Rouge", "Golfe Persique", "Océan Indien", "Mer Morte"), "Géographie", "Le canal de Suez, inauguré en 1869, traverse l'isthme de Suez en Égypte pour relier la mer Méditerranée à la mer Rouge, permettant une route maritime directe entre l'Europe et l'Asie."),
            en = LocalizedContent("The Suez Canal connects the Mediterranean to?", listOf("Red Sea", "Persian Gulf", "Indian Ocean", "Dead Sea"), "Geography", "The Suez Canal, inaugurated in 1869, crosses the Isthmus of Suez in Egypt to connect the Mediterranean Sea to the Red Sea, providing a direct maritime route between Europe and Asia."),
            zh = LocalizedContent("苏伊士运河连接地中海和？", listOf("红海", "波斯湾", "印度洋", "死海"), "地理", "苏伊士运河于1869年通航，穿越埃及的苏伊士地峡，连接地中海和红海，为欧洲和亚洲之间提供了直接的海上航线。"),
            es = LocalizedContent("¿El canal de Suez conecta el Mediterráneo con?", listOf("Mar Rojo", "Golfo Pérsico", "Océano Índico", "Mar Muerto"), "Geografía", "El canal de Suez, inaugurado en 1869, atraviesa el istmo de Suez en Egipto para conectar el mar Mediterráneo con el mar Rojo, proporcionando una ruta marítima directa entre Europa y Asia.")
        ),
        BilingualQuestion(
            id = 12197, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La ville de Marrakech est en?", listOf("Algérie", "Maroc", "Tunisie", "Libye"), "Géographie", "Marrakech est une grande ville située dans le sud-ouest du Maroc, pays d'Afrique du Nord."),
            en = LocalizedContent("The city of Marrakech is in?", listOf("Algeria", "Morocco", "Tunisia", "Libya"), "Geography", "Marrakech is a major city located in southwestern Morocco, a country in North Africa."),
            zh = LocalizedContent("马拉喀什市位于？", listOf("阿尔及利亚", "摩洛哥", "突尼斯", "利比亚"), "地理", "马拉喀什是位于摩洛哥西南部的一个主要城市，摩洛哥是北非的一个国家。"),
            es = LocalizedContent("¿La ciudad de Marrakech está en?", listOf("Argelia", "Marruecos", "Túnez", "Libia"), "Geografía", "Marrakech es una gran ciudad situada en el suroeste de Marruecos, país del norte de África.")
        ),
        BilingualQuestion(
            id = 12198, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les géysers islandais sont dus à?", listOf("Volcanisme", "Tremblements de terre", "Érosion marine", "Changement climatique"), "Géographie", "L'Islande est située sur la dorsale médio-atlantique, une zone de divergence tectonique où le volcanisme est intense. La chaleur géothermique issue de cette activité volcanique chauffe les eaux souterraines, provoquant les éruptions des geysers."),
            en = LocalizedContent("Icelandic geysers are due to?", listOf("Volcanism", "Earthquakes", "Marine erosion", "Climate change"), "Geography", "Iceland is located on the Mid-Atlantic Ridge, a tectonic divergent zone where volcanism is intense. The geothermal heat from this volcanic activity heats underground water, causing geyser eruptions."),
            zh = LocalizedContent("冰岛的间歇泉是由于？", listOf("火山活动", "地震", "海洋侵蚀", "气候变化"), "地理", "冰岛位于大西洋中脊，这是一个构造板块发散带，火山活动强烈。来自火山活动的地热加热地下水，导致间歇泉喷发。"),
            es = LocalizedContent("¿Los géiseres islandeses se deben a?", listOf("Vulcanismo", "Terremotos", "Erosión marina", "Cambio climático"), "Geografía", "Islandia está situada en la dorsal mesoatlántica, una zona de divergencia tectónica donde el vulcanismo es intenso. El calor geotérmico de esta actividad volcánica calienta las aguas subterráneas, provocando las erupciones de los géiseres.")
        ),
        BilingualQuestion(
            id = 12199, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a le plus grand nombre de lacs?", listOf("Finlande", "Suède", "Norvège", "Canada"), "Géographie", "Le Canada compte environ 60 % des lacs naturels du monde, soit plus de deux millions, dont la plupart se trouvent dans les régions nordiques et rocheuses."),
            en = LocalizedContent("Which country has the largest number of lakes?", listOf("Finland", "Sweden", "Norway", "Canada"), "Geography", "Canada has about 60% of the world's natural lakes, over two million, most of which are located in the northern and rocky regions."),
            zh = LocalizedContent("哪个国家拥有最多的湖泊？", listOf("芬兰", "瑞典", "挪威", "加拿大"), "地理", "加拿大拥有全球约60%的天然湖泊，超过两百万个，其中大部分位于北部和岩石地区。"),
            es = LocalizedContent("¿Qué país tiene el mayor número de lagos?", listOf("Finlandia", "Suecia", "Noruega", "Canadá"), "Geografía", "Canadá tiene aproximadamente el 60% de los lagos naturales del mundo, más de dos millones, la mayoría en las regiones del norte y rocosas.")
        ),
        BilingualQuestion(
            id = 12200, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Sahara s'étend sur environ?", listOf("5 millions de km²", "7 millions de km²", "9 millions de km²", "11 millions de km²"), "Géographie", "Le Sahara est le plus grand désert chaud du monde, couvrant une superficie comparable à celle des États-Unis ou de la Chine, soit environ 9 millions de km²."),
            en = LocalizedContent("The Sahara extends over approximately?", listOf("5 million km²", "7 million km²", "9 million km²", "11 million km²"), "Geography", "The Sahara is the largest hot desert in the world, covering an area comparable to that of the United States or China, about 9 million km²."),
            zh = LocalizedContent("撒哈拉沙漠的面积大约是多少？", listOf("500万平方公里", "700万平方公里", "900万平方公里", "1100万平方公里"), "地理", "撒哈拉沙漠是世界上最大的热沙漠，面积与美国或中国相当，约为900万平方公里。"),
            es = LocalizedContent("El Sahara se extiende aproximadamente sobre?", listOf("5 millones de km²", "7 millones de km²", "9 millones de km²", "11 millones de km²"), "Geografía", "El Sahara es el desierto cálido más grande del mundo, con una superficie comparable a la de Estados Unidos o China, unos 9 millones de km².")
        ),
        BilingualQuestion(
            id = 12201, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la région la plus dense de population en Asie?", listOf("Inde du Nord", "Chine orientale", "Asie du Sud-Est", "Tout l'est asiatique"), "Géographie", "La Chine orientale, incluant des mégapoles comme Shanghai et Pékin, concentre une forte population en raison de ses plaines fertiles et de son développement économique intense."),
            en = LocalizedContent("Which is the most densely populated region in Asia?", listOf("Northern India", "Eastern China", "Southeast Asia", "All of East Asia"), "Geography", "Eastern China, including megacities like Shanghai and Beijing, concentrates a large population due to its fertile plains and intense economic development."),
            zh = LocalizedContent("亚洲人口最稠密的地区是哪里？", listOf("印度北部", "中国东部", "东南亚", "整个东亚"), "地理", "中国东部，包括上海和北京等特大城市，由于肥沃的平原和密集的经济发展，人口高度集中。"),
            es = LocalizedContent("¿Cuál es la región más densamente poblada de Asia?", listOf("India del Norte", "China Oriental", "Sudeste Asiático", "Todo el este asiático"), "Geografía", "China Oriental, incluyendo megaciudades como Shanghái y Pekín, concentra una gran población debido a sus llanuras fértiles y su intenso desarrollo económico.")
        ),
        BilingualQuestion(
            id = 12202, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La Tasmanie appartient à quel pays?", listOf("Nouvelle-Zélande", "Australie", "Papouasie-Nouvelle-Guinée", "Samoa"), "Géographie", "La Tasmanie est un État insulaire situé au sud-est de l'Australie continentale, dont elle fait partie depuis la colonisation britannique."),
            en = LocalizedContent("Tasmania belongs to which country?", listOf("New Zealand", "Australia", "Papua New Guinea", "Samoa"), "Geography", "Tasmania is an island state located southeast of mainland Australia, of which it has been a part since British colonization."),
            zh = LocalizedContent("塔斯马尼亚岛属于哪个国家？", listOf("新西兰", "澳大利亚", "巴布亚新几内亚", "萨摩亚"), "地理", "塔斯马尼亚是位于澳大利亚大陆东南部的一个岛屿州，自英国殖民以来一直是澳大利亚的一部分。"),
            es = LocalizedContent("¿Tasmania pertenece a qué país?", listOf("Nueva Zelanda", "Australia", "Papúa Nueva Guinea", "Samoa"), "Geografía", "Tasmania es un estado insular ubicado al sureste de Australia continental, del cual forma parte desde la colonización británica.")
        ),
        BilingualQuestion(
            id = 12203, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel fleuve traverse la Mésopotamie antique?", listOf("Euphrate et Tigre", "Nil", "Indus", "Yangtsé"), "Géographie", "La Mésopotamie, dont le nom signifie \"entre les fleuves\", est la région située entre l'Euphrate et le Tigre, qui ont permis le développement des premières civilisations grâce à leurs crues fertiles."),
            en = LocalizedContent("Which river flows through ancient Mesopotamia?", listOf("Euphrates and Tigris", "Nile", "Indus", "Yangtze"), "Geography", "Mesopotamia, meaning 'between rivers', is the region between the Euphrates and Tigris, which enabled the development of early civilizations through their fertile floods."),
            zh = LocalizedContent("哪条河流经古代美索不达米亚？", listOf("幼发拉底河和底格里斯河", "尼罗河", "印度河", "长江"), "地理", "美索不达米亚意为“两河之间”，是幼发拉底河和底格里斯河之间的区域，其肥沃的洪水促进了早期文明的发展。"),
            es = LocalizedContent("¿Qué río atraviesa la antigua Mesopotamia?", listOf("Éufrates y Tigris", "Nilo", "Indo", "Yangtsé"), "Geografía", "Mesopotamia, que significa 'entre ríos', es la región entre el Éufrates y el Tigris, cuyas crecidas fértiles permitieron el desarrollo de las primeras civilizaciones.")
        ),
        BilingualQuestion(
            id = 12204, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'Île de Wight appartient à quel pays?", listOf("France", "Irlande", "Royaume-Uni", "Pays-Bas"), "Géographie", "L'île de Wight est située dans la Manche, au sud de l'Angleterre, et fait partie du Royaume-Uni depuis l'unification de l'Angleterre."),
            en = LocalizedContent("The Isle of Wight belongs to which country?", listOf("France", "Ireland", "United Kingdom", "Netherlands"), "Geography", "The Isle of Wight is located in the English Channel, south of England, and has been part of the United Kingdom since the unification of England."),
            zh = LocalizedContent("怀特岛属于哪个国家？", listOf("法国", "爱尔兰", "英国", "荷兰"), "地理", "怀特岛位于英吉利海峡，英格兰以南，自英格兰统一以来一直是英国的一部分。"),
            es = LocalizedContent("¿La Isla de Wight pertenece a qué país?", listOf("Francia", "Irlanda", "Reino Unido", "Países Bajos"), "Geografía", "La Isla de Wight está situada en el Canal de la Mancha, al sur de Inglaterra, y forma parte del Reino Unido desde la unificación de Inglaterra.")
        ),
        BilingualQuestion(
            id = 12205, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel désert couvre le Moyen-Orient?", listOf("Sahara", "Arabie", "Gobi", "Atacama"), "Géographie", "Le désert d'Arabie s'étend sur la majeure partie de la péninsule arabique, couvrant des pays comme l'Arabie saoudite, le Yémen et Oman, et constitue le plus grand désert du Moyen-Orient."),
            en = LocalizedContent("Which desert covers the Middle East?", listOf("Sahara", "Arabian", "Gobi", "Atacama"), "Geography", "The Arabian Desert extends across most of the Arabian Peninsula, covering countries like Saudi Arabia, Yemen, and Oman, and is the largest desert in the Middle East."),
            zh = LocalizedContent("哪个沙漠覆盖了中东地区？", listOf("撒哈拉沙漠", "阿拉伯沙漠", "戈壁沙漠", "阿塔卡马沙漠"), "地理", "阿拉伯沙漠延伸至阿拉伯半岛的大部分地区，覆盖沙特阿拉伯、也门和阿曼等国，是中东最大的沙漠。"),
            es = LocalizedContent("¿Qué desierto cubre Oriente Medio?", listOf("Sahara", "Arábigo", "Gobi", "Atacama"), "Geografía", "El desierto de Arabia se extiende por la mayor parte de la península arábiga, cubriendo países como Arabia Saudita, Yemen y Omán, y es el desierto más grande de Oriente Medio.")
        ),
        BilingualQuestion(
            id = 12206, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel manga est le plus vendu de tous les temps?", listOf("Dragon Ball", "One Piece", "Naruto", "One Punch Man"), "Culture", "Avec plus de 260 millions d'exemplaires écoulés dans le monde, Dragon Ball d'Akira Toriyama détient ce record, devant One Piece."),
            en = LocalizedContent("Which manga is the best-selling of all time?", listOf("Dragon Ball", "One Piece", "Naruto", "One Punch Man"), "Culture", "With over 260 million copies sold worldwide, Dragon Ball by Akira Toriyama holds this record, ahead of One Piece."),
            zh = LocalizedContent("哪部漫画是有史以来销量最高的？", listOf("龙珠", "海贼王", "火影忍者", "一拳超人"), "文化", "鸟山明的《龙珠》全球销量超过2.6亿册，保持着这一纪录，领先于《海贼王》。"),
            es = LocalizedContent("¿Qué manga es el más vendido de todos los tiempos?", listOf("Dragon Ball", "One Piece", "Naruto", "One Punch Man"), "Cultura", "Con más de 260 millones de copias vendidas en todo el mundo, Dragon Ball de Akira Toriyama ostenta este récord, por delante de One Piece.")
        ),
        BilingualQuestion(
            id = 12207, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le jeu 'Cluedo' a été créé en?", listOf("1949", "1950", "1951", "1952"), "Culture", "Le Cluedo a été inventé en 1949 par le Britannique Anthony E. Pratt, qui l'a conçu pendant la Seconde Guerre mondiale. Le jeu a été commercialisé pour la première fois par la société Waddingtons."),
            en = LocalizedContent("The game 'Cluedo' was created in?", listOf("1949", "1950", "1951", "1952"), "Culture", "Cluedo was invented in 1949 by the British Anthony E. Pratt, who designed it during World War II. The game was first marketed by Waddingtons."),
            zh = LocalizedContent("游戏《妙探寻凶》创作于哪一年？", listOf("1949", "1950", "1951", "1952"), "文化", "《妙探寻凶》由英国人安东尼·E·普拉特于1949年发明，他在二战期间设计了这款游戏。该游戏最初由Waddingtons公司销售。"),
            es = LocalizedContent("El juego 'Cluedo' fue creado en?", listOf("1949", "1950", "1951", "1952"), "Cultura", "El Cluedo fue inventado en 1949 por el británico Anthony E. Pratt, quien lo diseñó durante la Segunda Guerra Mundial. El juego fue comercializado por primera vez por la empresa Waddingtons.")
        ),
        BilingualQuestion(
            id = 12208, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel anime a remporté le plus grand nombre de prix?", listOf("Death Note", "Demon Slayer", "Jujutsu Kaisen", "Attack on Titan"), "Culture", "Demon Slayer a connu un succès critique et commercial massif, remportant notamment le prestigieux prix de l'Animation de l'Année aux Crunchyroll Anime Awards en 2020 et 2021."),
            en = LocalizedContent("Which anime has won the most awards?", listOf("Death Note", "Demon Slayer", "Jujutsu Kaisen", "Attack on Titan"), "Culture", "Demon Slayer achieved massive critical and commercial success, notably winning the prestigious Animation of the Year award at the Crunchyroll Anime Awards in 2020 and 2021."),
            zh = LocalizedContent("哪部动画片获奖最多？", listOf("死亡笔记", "鬼灭之刃", "咒术回战", "进击的巨人"), "文化", "《鬼灭之刃》取得了巨大的评论和商业成功，尤其在2020年和2021年的Crunchyroll动画奖中赢得了年度动画大奖。"),
            es = LocalizedContent("¿Qué anime ha ganado la mayor cantidad de premios?", listOf("Death Note", "Demon Slayer", "Jujutsu Kaisen", "Attack on Titan"), "Cultura", "Demon Slayer logró un éxito crítico y comercial masivo, ganando especialmente el prestigioso premio a la Animación del Año en los Crunchyroll Anime Awards en 2020 y 2021.")
        ),
        BilingualQuestion(
            id = 12209, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Le 'Ramen' est un plat traditionnel de?", listOf("Chine", "Thaïlande", "Japon", "Corée"), "Culture", "Le ramen est une soupe de nouilles originaire de Chine, mais il a été adopté et transformé au Japon après la Seconde Guerre mondiale. Il est aujourd'hui un emblème de la cuisine japonaise."),
            en = LocalizedContent("Ramen is a traditional dish from?", listOf("China", "Thailand", "Japan", "Korea"), "Culture", "Ramen is a noodle soup originating from China, but it was adopted and transformed in Japan after World War II. It is now an emblem of Japanese cuisine."),
            zh = LocalizedContent("拉面是哪个国家的传统菜肴？", listOf("中国", "泰国", "日本", "韩国"), "文化", "拉面是一种源自中国的面条汤，但在二战后被日本采纳并改造，如今已成为日本料理的象征。"),
            es = LocalizedContent("¿El 'Ramen' es un plato tradicional de?", listOf("China", "Tailandia", "Japón", "Corea"), "Cultura", "El ramen es una sopa de fideos originaria de China, pero fue adoptado y transformado en Japón después de la Segunda Guerra Mundial. Hoy es un emblema de la cocina japonesa.")
        ),
        BilingualQuestion(
            id = 12210, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La BD 'Asterix' compte combien d'albums?", listOf("30", "35", "40", "45"), "Culture", "La série principale d'Astérix, créée par René Goscinny et Albert Uderzo, comprend officiellement 40 albums, le dernier étant paru en 2021."),
            en = LocalizedContent("How many albums does the comic 'Asterix' have?", listOf("30", "35", "40", "45"), "Culture", "The main series of Asterix, created by René Goscinny and Albert Uderzo, officially includes 40 albums, the last one published in 2021."),
            zh = LocalizedContent("漫画《阿斯泰利克斯历险记》共有多少册？", listOf("30", "35", "40", "45"), "文化", "由勒内·戈西尼和阿尔贝·乌代尔佐创作的《阿斯泰利克斯历险记》主系列官方共有40册，最后一册于2021年出版。"),
            es = LocalizedContent("¿Cuántos álbumes tiene el cómic 'Astérix'?", listOf("30", "35", "40", "45"), "Cultura", "La serie principal de Astérix, creada por René Goscinny y Albert Uderzo, incluye oficialmente 40 álbumes, el último publicado en 2021.")
        ),
        BilingualQuestion(
            id = 12211, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel jeu de cartes français utilise 32 cartes?", listOf("Piquet", "Belote", "Poker", "Bridge"), "Culture", "La belote se joue traditionnellement avec un jeu de 32 cartes, du 7 à l'as dans chaque couleur, contrairement au jeu de 54 cartes utilisé pour la bataille ou le poker."),
            en = LocalizedContent("Which French card game uses 32 cards?", listOf("Piquet", "Belote", "Poker", "Bridge"), "Culture", "Belote is traditionally played with a 32-card deck, from 7 to ace in each suit, unlike the 54-card deck used for battle or poker."),
            zh = LocalizedContent("哪种法国纸牌游戏使用32张牌？", listOf("皮克牌", "贝洛特", "扑克", "桥牌"), "文化", "贝洛特传统上使用32张牌，每花色从7到A，不同于战斗或扑克使用的54张牌。"),
            es = LocalizedContent("¿Qué juego de cartas francés utiliza 32 cartas?", listOf("Piquet", "Belote", "Póker", "Bridge"), "Cultura", "La belote se juega tradicionalmente con una baraja de 32 cartas, del 7 al as en cada palo, a diferencia de la baraja de 54 cartas usada para la batalla o el póker.")
        ),
        BilingualQuestion(
            id = 12212, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le manga 'Fullmetal Alchemist' comporte combien de tomes?", listOf("25", "27", "30", "35"), "Culture", "Le manga Fullmetal Alchemist de Hiromu Arakawa a été publié en 27 volumes reliés au Japon, de 2002 à 2010."),
            en = LocalizedContent("How many volumes does the manga 'Fullmetal Alchemist' have?", listOf("25", "27", "30", "35"), "Culture", "The manga Fullmetal Alchemist by Hiromu Arakawa was published in 27 bound volumes in Japan, from 2002 to 2010."),
            zh = LocalizedContent("漫画《钢之炼金术师》共有多少卷？", listOf("25", "27", "30", "35"), "文化", "荒川弘的漫画《钢之炼金术师》在日本共出版了27卷单行本，时间从2002年到2010年。"),
            es = LocalizedContent("¿Cuántos tomos tiene el manga 'Fullmetal Alchemist'?", listOf("25", "27", "30", "35"), "Cultura", "El manga Fullmetal Alchemist de Hiromu Arakawa fue publicado en 27 volúmenes encuadernados en Japón, de 2002 a 2010.")
        ),
        BilingualQuestion(
            id = 12213, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien restaurant français en activité?", listOf("Chez La Mère Grand", "Café Procope", "La Cour de Récréation", "Le Procope"), "Culture", "Fondé en 1686 à Paris, le Café Procope est le plus ancien restaurant français encore en activité, fréquenté par des figures comme Voltaire et Rousseau."),
            en = LocalizedContent("What is the oldest French restaurant still in operation?", listOf("Chez La Mère Grand", "Café Procope", "La Cour de Récréation", "Le Procope"), "Culture", "Founded in 1686 in Paris, Café Procope is the oldest French restaurant still in operation, frequented by figures like Voltaire and Rousseau."),
            zh = LocalizedContent("仍在营业的最古老的法国餐厅是哪家？", listOf("大妈妈家", "普罗可布咖啡馆", "休闲庭院", "普罗可布餐厅"), "文化", "普罗可布咖啡馆于1686年在巴黎创立，是仍在营业的最古老的法国餐厅，伏尔泰和卢梭等人物曾光顾。"),
            es = LocalizedContent("¿Cuál es el restaurante francés más antiguo en funcionamiento?", listOf("Chez La Mère Grand", "Café Procope", "La Cour de Récréation", "Le Procope"), "Cultura", "Fundado en 1686 en París, el Café Procope es el restaurante francés más antiguo aún en funcionamiento, frecuentado por figuras como Voltaire y Rousseau.")
        ),
        BilingualQuestion(
            id = 12214, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Le 'Miso' est un ingrédient culinaire d'origine?", listOf("Chinoise", "Japonaise", "Coréenne", "Thaïlandaise"), "Culture", "Le miso est une pâte fermentée à base de soja, traditionnellement utilisée dans la cuisine japonaise, notamment pour la soupe miso."),
            en = LocalizedContent("Miso is a culinary ingredient originating from?", listOf("China", "Japan", "Korea", "Thailand"), "Culture", "Miso is a fermented soybean paste traditionally used in Japanese cuisine, especially for miso soup."),
            zh = LocalizedContent("味噌是一种源自哪里的烹饪原料？", listOf("中国", "日本", "韩国", "泰国"), "文化", "味噌是一种发酵大豆酱，传统上用于日本料理，特别是味噌汤。"),
            es = LocalizedContent("¿El 'Miso' es un ingrediente culinario originario de?", listOf("China", "Japón", "Corea", "Tailandia"), "Cultura", "El miso es una pasta fermentada de soja utilizada tradicionalmente en la cocina japonesa, especialmente para la sopa de miso.")
        ),
        BilingualQuestion(
            id = 12215, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel anime adapte le manga 'Bleach' avec le plus d'épisodes?", listOf("300", "366", "400", "500"), "Culture", "L'adaptation animée de Bleach par le studio Pierrot a compté 366 épisodes, couvrant la majeure partie du manga original jusqu'à la fin de l'arc de la Guerre des Mille Ans."),
            en = LocalizedContent("Which anime adapts the manga 'Bleach' with the most episodes?", listOf("300", "366", "400", "500"), "Culture", "The anime adaptation of Bleach by Studio Pierrot had 366 episodes, covering most of the original manga up to the end of the Thousand-Year Blood War arc."),
            zh = LocalizedContent("哪部动画改编自漫画《死神》且集数最多？", listOf("300", "366", "400", "500"), "文化", "由小丑社制作的《死神》动画改编版共有366集，涵盖了原版漫画的大部分内容，直至千年血战篇结束。"),
            es = LocalizedContent("¿Qué anime adapta el manga 'Bleach' con más episodios?", listOf("300", "366", "400", "500"), "Cultura", "La adaptación animada de Bleach por el estudio Pierrot tuvo 366 episodios, cubriendo la mayor parte del manga original hasta el final del arco de la Guerra de los Mil Años.")
        ),
        BilingualQuestion(
            id = 12216, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La BD 'Tintin au pays des Soviets' a été publiée en?", listOf("1928", "1930", "1932", "1935"), "Culture", "Tintin au pays des Soviets est la première aventure de Tintin, publiée en 1928 dans le journal belge Le Petit Vingtième."),
            en = LocalizedContent("The comic 'Tintin in the Land of the Soviets' was published in?", listOf("1928", "1930", "1932", "1935"), "Culture", "Tintin in the Land of the Soviets is the first adventure of Tintin, published in 1928 in the Belgian newspaper Le Petit Vingtième."),
            zh = LocalizedContent("漫画《丁丁在苏联》出版于哪一年？", listOf("1928", "1930", "1932", "1935"), "文化", "《丁丁在苏联》是丁丁的第一次冒险，于1928年在比利时报纸《小二十世纪》上出版。"),
            es = LocalizedContent("¿El cómic 'Tintín en el país de los Soviets' fue publicado en?", listOf("1928", "1930", "1932", "1935"), "Cultura", "Tintín en el país de los Soviets es la primera aventura de Tintín, publicada en 1928 en el periódico belga Le Petit Vingtième.")
        ),
        BilingualQuestion(
            id = 12217, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel type de cuisine française est caractérisé par des sauces réduites?", listOf("Cuisine rustique", "Grande cuisine", "Cuisine régionale", "Cuisine bourgeoise"), "Culture", "La grande cuisine française, codifiée au XIXe siècle par Escoffier, se distingue par ses sauces réduites élaborées à partir de fonds, comme la sauce espagnole ou la sauce demi-glace."),
            en = LocalizedContent("Which type of French cuisine is characterized by reduced sauces?", listOf("Rustic cuisine", "Grand cuisine", "Regional cuisine", "Bourgeois cuisine"), "Culture", "Grand French cuisine, codified in the 19th century by Escoffier, is distinguished by its elaborate reduced sauces made from stocks, such as sauce espagnole or demi-glace."),
            zh = LocalizedContent("哪种法国菜以浓缩酱汁为特色？", listOf("乡村菜", "高级菜", "地方菜", "家常菜"), "文化", "法国高级菜由埃斯科菲耶在19世纪系统化，以其用高汤制作的精致浓缩酱汁而著称，如西班牙酱或半釉酱。"),
            es = LocalizedContent("¿Qué tipo de cocina francesa se caracteriza por salsas reducidas?", listOf("Cocina rústica", "Grande cocina", "Cocina regional", "Cocina burguesa"), "Cultura", "La grande cocina francesa, codificada en el siglo XIX por Escoffier, se distingue por sus salsas reducidas elaboradas a partir de fondos, como la salsa española o la demi-glace.")
        ),
        BilingualQuestion(
            id = 12218, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Le 'Tofu' est un aliment d'origine?", listOf("Thaïlandaise", "Vietnamienne", "Chinoise", "Indonésienne"), "Culture", "Le tofu est originaire de Chine, où il a été inventé il y a plus de 2 000 ans sous la dynastie des Han."),
            en = LocalizedContent("Tofu is a food originating from?", listOf("Thailand", "Vietnam", "China", "Indonesia"), "Culture", "Tofu originated in China, where it was invented over 2,000 years ago during the Han dynasty."),
            zh = LocalizedContent("豆腐是一种源自哪里的食物？", listOf("泰国", "越南", "中国", "印度尼西亚"), "文化", "豆腐起源于中国，早在2000多年前的汉朝就被发明了。"),
            es = LocalizedContent("¿El 'Tofu' es un alimento originario de?", listOf("Tailandia", "Vietnam", "China", "Indonesia"), "Cultura", "El tofu es originario de China, donde fue inventado hace más de 2.000 años durante la dinastía Han.")
        ),
        BilingualQuestion(
            id = 12219, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le jeu 'Risk' se déroule sur quel continent?", listOf("Un seul", "Tous les continents", "Europa", "Mondo"), "Culture", "Le plateau de Risk représente la Terre entière, divisée en six continents, où les joueurs s'affrontent pour la domination mondiale."),
            en = LocalizedContent("The game 'Risk' is set on which continent?", listOf("One", "All continents", "Europe", "World"), "Culture", "The Risk board represents the entire Earth, divided into six continents, where players compete for world domination."),
            zh = LocalizedContent("游戏《Risk》设定在哪个大洲？", listOf("一个", "所有大洲", "欧洲", "世界"), "文化", "《Risk》的棋盘代表整个地球，分为六大洲，玩家争夺全球霸权。"),
            es = LocalizedContent("El juego 'Risk' se desarrolla en ¿qué continente?", listOf("Uno", "Todos los continentes", "Europa", "Mundo"), "Cultura", "El tablero de Risk representa toda la Tierra, dividida en seis continentes, donde los jugadores compiten por el dominio mundial.")
        ),
        BilingualQuestion(
            id = 12220, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel anime a le plus haut score sur MyAnimeList?", listOf("Fullmetal Alchemist: Brotherhood", "Attack on Titan", "Demon Slayer", "Jujutsu Kaisen 0"), "Culture", "Fullmetal Alchemist: Brotherhood est régulièrement classé numéro un sur MyAnimeList grâce à son scénario cohérent, ses personnages profonds et son adaptation fidèle du manga."),
            en = LocalizedContent("Which anime has the highest score on MyAnimeList?", listOf("Fullmetal Alchemist: Brotherhood", "Attack on Titan", "Demon Slayer", "Jujutsu Kaisen 0"), "Culture", "Fullmetal Alchemist: Brotherhood is consistently ranked number one on MyAnimeList due to its coherent story, deep characters, and faithful adaptation of the manga."),
            zh = LocalizedContent("哪部动漫在MyAnimeList上评分最高？", listOf("钢之炼金术师FA", "进击的巨人", "鬼灭之刃", "咒术回战0"), "文化", "《钢之炼金术师FA》因其连贯的剧情、深刻的人物和对原作的忠实改编，在MyAnimeList上长期排名第一。"),
            es = LocalizedContent("¿Qué anime tiene la puntuación más alta en MyAnimeList?", listOf("Fullmetal Alchemist: Brotherhood", "Attack on Titan", "Demon Slayer", "Jujutsu Kaisen 0"), "Cultura", "Fullmetal Alchemist: Brotherhood está clasificado constantemente como número uno en MyAnimeList debido a su historia coherente, personajes profundos y adaptación fiel del manga.")
        ),
        BilingualQuestion(
            id = 12221, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le 'Teriyaki' est une sauce japonaise contenant?", listOf("Soja et sucre", "Gingembre et piment", "Miso et dashi", "Vinaigre et miel"), "Culture", "Le teriyaki est une sauce japonaise traditionnelle à base de sauce soja et de sucre, car ces deux ingrédients créent le glaçage caramélisé caractéristique lors de la cuisson."),
            en = LocalizedContent("'Teriyaki' is a Japanese sauce containing?", listOf("Soy sauce and sugar", "Ginger and chili", "Miso and dashi", "Vinegar and honey"), "Culture", "Teriyaki is a traditional Japanese sauce made from soy sauce and sugar, as these two ingredients create the characteristic caramelized glaze during cooking."),
            zh = LocalizedContent("'照烧'是一种日本酱汁，含有？", listOf("酱油和糖", "姜和辣椒", "味噌和出汁", "醋和蜂蜜"), "文化", "照烧是一种传统的日本酱汁，由酱油和糖制成，这两种成分在烹饪过程中会产生特有的焦糖光泽。"),
            es = LocalizedContent("El 'Teriyaki' es una salsa japonesa que contiene?", listOf("Salsa de soja y azúcar", "Jengibre y chile", "Miso y dashi", "Vinagre y miel"), "Cultura", "El teriyaki es una salsa japonesa tradicional hecha de salsa de soja y azúcar, ya que estos dos ingredientes crean el glaseado caramelizado característico durante la cocción.")
        ),
        BilingualQuestion(
            id = 12222, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La BD 'Superman' a été créée en?", listOf("1933", "1935", "1938", "1940"), "Culture", "Superman est apparu pour la première fois dans le comic book Action Comics #1, publié en juin 1938 par DC Comics."),
            en = LocalizedContent("The comic 'Superman' was created in?", listOf("1933", "1935", "1938", "1940"), "Culture", "Superman first appeared in Action Comics #1, published in June 1938 by DC Comics."),
            zh = LocalizedContent("漫画《超人》创作于？", listOf("1933年", "1935年", "1938年", "1940年"), "文化", "超人首次出现在《动作漫画》第1期，由DC漫画于1938年6月出版。"),
            es = LocalizedContent("El cómic 'Superman' fue creado en?", listOf("1933", "1935", "1938", "1940"), "Cultura", "Superman apareció por primera vez en el cómic Action Comics #1, publicado en junio de 1938 por DC Comics.")
        ),
        BilingualQuestion(
            id = 12223, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel jeu de plateau se joue avec des dominos?", listOf("Jeu de dominos", "Mah-Jong", "Mille Bornes", "Jeu de l'Oie"), "Culture", "Le jeu de dominos se joue avec des pièces rectangulaires appelées dominos, divisées en deux parties portant un nombre de points."),
            en = LocalizedContent("Which board game is played with dominoes?", listOf("Dominoes", "Mah-Jong", "Mille Bornes", "Game of the Goose"), "Culture", "Dominoes is played with rectangular pieces called dominoes, divided into two parts bearing a number of dots."),
            zh = LocalizedContent("哪种棋盘游戏使用多米诺骨牌？", listOf("多米诺骨牌", "麻将", "千公里", "鹅棋"), "文化", "多米诺骨牌游戏使用称为多米诺骨牌的长方形棋子，每张牌分为两部分，标有不同数量的点。"),
            es = LocalizedContent("¿Qué juego de mesa se juega con fichas de dominó?", listOf("Dominó", "Mah-Jong", "Mille Bornes", "Juego de la Oca"), "Cultura", "El dominó se juega con piezas rectangulares llamadas fichas de dominó, divididas en dos partes que llevan un número de puntos.")
        ),
        BilingualQuestion(
            id = 12224, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le 'Dashi' est un bouillon japonais à base de?", listOf("Miso et soja", "Kombu et bonite", "Saké et mirin", "Vinaigre et sauce soja"), "Culture", "Le kombu est une algue riche en umami, et la bonite (katsuobushi) est du thon séché et fumé. Leur infusion ensemble forme la base savoureuse de nombreuses soupes et plats japonais."),
            en = LocalizedContent("'Dashi' is a Japanese broth made from?", listOf("Miso and soy", "Kombu and bonito", "Sake and mirin", "Vinegar and soy sauce"), "Culture", "Kombu is a seaweed rich in umami, and bonito (katsuobushi) is dried and smoked tuna. Their infusion together forms the savory base of many Japanese soups and dishes."),
            zh = LocalizedContent("'出汁'是一种日本高汤，由什么制成？", listOf("味噌和酱油", "昆布和鲣鱼", "清酒和味醂", "醋和酱油"), "文化", "昆布是一种富含鲜味的海藻，鲣鱼（鲣节）是干燥熏制的金枪鱼。两者一起浸泡形成许多日本汤和菜肴的鲜味基础。"),
            es = LocalizedContent("El 'Dashi' es un caldo japonés hecho de?", listOf("Miso y soja", "Kombu y bonito", "Sake y mirin", "Vinagre y salsa de soja"), "Cultura", "El kombu es un alga rica en umami, y el bonito (katsuobushi) es atún seco y ahumado. Su infusión juntos forma la base sabrosa de muchas sopas y platos japoneses.")
        ),
        BilingualQuestion(
            id = 12225, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel manga a été adapté en film live-action le plus souvent?", listOf("Death Note", "Rurouni Kenshin", "Ghost in the Shell", "Alita"), "Culture", "Rurouni Kenshin détient le record avec cinq films live-action sortis entre 2012 et 2021, formant une saga complète adaptée du manga de Nobuhiro Watsuki."),
            en = LocalizedContent("Which manga has been adapted into live-action films the most?", listOf("Death Note", "Rurouni Kenshin", "Ghost in the Shell", "Alita"), "Culture", "Rurouni Kenshin holds the record with five live-action films released between 2012 and 2021, forming a complete saga adapted from Nobuhiro Watsuki's manga."),
            zh = LocalizedContent("哪部漫画被改编成真人电影次数最多？", listOf("死亡笔记", "浪客剑心", "攻壳机动队", "阿丽塔"), "文化", "《浪客剑心》保持着纪录，在2012年至2021年间推出了五部真人电影，形成了改编自和月伸宏漫画的完整系列。"),
            es = LocalizedContent("¿Qué manga ha sido adaptado a películas live-action con más frecuencia?", listOf("Death Note", "Rurouni Kenshin", "Ghost in the Shell", "Alita"), "Cultura", "Rurouni Kenshin tiene el récord con cinco películas live-action estrenadas entre 2012 y 2021, formando una saga completa adaptada del manga de Nobuhiro Watsuki.")
        ),
        BilingualQuestion(
            id = 12226, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Le 'Wasabi' est une pâte verte d'origine?", listOf("Thaïlandaise", "Vietnamienne", "Chinoise", "Japonaise"), "Culture", "Le wasabi est un condiment traditionnel de la cuisine japonaise, fabriqué à partir de la racine râpée de la plante Wasabia japonica, originaire du Japon."),
            en = LocalizedContent("'Wasabi' is a green paste originating from?", listOf("Thailand", "Vietnam", "China", "Japan"), "Culture", "Wasabi is a traditional condiment in Japanese cuisine, made from the grated root of the Wasabia japonica plant, native to Japan."),
            zh = LocalizedContent("'芥末'是一种绿色酱料，起源于？", listOf("泰国", "越南", "中国", "日本"), "文化", "芥末是日本料理中的传统调味品，由山葵植物的根磨碎制成，原产于日本。"),
            es = LocalizedContent("El 'Wasabi' es una pasta verde originaria de?", listOf("Tailandia", "Vietnam", "China", "Japón"), "Cultura", "El wasabi es un condimento tradicional de la cocina japonesa, elaborado a partir de la raíz rallada de la planta Wasabia japonica, originaria de Japón.")
        ),
        BilingualQuestion(
            id = 12227, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La BD 'Batman' a été créée en?", listOf("1939", "1941", "1943", "1945"), "Culture", "Batman est apparu pour la première fois dans le comic book Detective Comics #27, publié en mai 1939, créé par Bob Kane et Bill Finger."),
            en = LocalizedContent("The comic 'Batman' was created in?", listOf("1939", "1941", "1943", "1945"), "Culture", "Batman first appeared in Detective Comics #27, published in May 1939, created by Bob Kane and Bill Finger."),
            zh = LocalizedContent("漫画《蝙蝠侠》创作于？", listOf("1939年", "1941年", "1943年", "1945年"), "文化", "蝙蝠侠首次出现在《侦探漫画》第27期，于1939年5月出版，由鲍勃·凯恩和比尔·芬格创作。"),
            es = LocalizedContent("El cómic 'Batman' fue creado en?", listOf("1939", "1941", "1943", "1945"), "Cultura", "Batman apareció por primera vez en el cómic Detective Comics #27, publicado en mayo de 1939, creado por Bob Kane y Bill Finger.")
        ),
        BilingualQuestion(
            id = 12228, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le jeu 'Trivial Pursuit' a été créé en?", listOf("1980", "1981", "1982", "1983"), "Culture", "Le Trivial Pursuit a été inventé en 1981 par deux Canadiens, Chris Haney et Scott Abbott, lors d'une partie de Scrabble."),
            en = LocalizedContent("The game 'Trivial Pursuit' was created in?", listOf("1980", "1981", "1982", "1983"), "Culture", "Trivial Pursuit was invented in 1981 by two Canadians, Chris Haney and Scott Abbott, during a game of Scrabble."),
            zh = LocalizedContent("游戏《常识问答》创作于？", listOf("1980年", "1981年", "1982年", "1983年"), "文化", "《常识问答》由两位加拿大人克里斯·哈尼和斯科特·阿博特于1981年在玩拼字游戏时发明。"),
            es = LocalizedContent("El juego 'Trivial Pursuit' fue creado en?", listOf("1980", "1981", "1982", "1983"), "Cultura", "Trivial Pursuit fue inventado en 1981 por dos canadienses, Chris Haney y Scott Abbott, durante una partida de Scrabble.")
        ),
        BilingualQuestion(
            id = 12229, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel anime comporte le plus grand nombre d'épisodes?", listOf("One Piece", "Naruto Shippuden", "Detective Conan", "Fairy Tail"), "Culture", "Detective Conan, aussi connu sous le nom de Case Closed, détient le record avec plus de 1100 épisodes, dépassant largement les autres séries d'anime comme One Piece."),
            en = LocalizedContent("Which anime has the most episodes?", listOf("One Piece", "Naruto Shippuden", "Detective Conan", "Fairy Tail"), "Culture", "Detective Conan, also known as Case Closed, holds the record with over 1100 episodes, far surpassing other anime series like One Piece."),
            zh = LocalizedContent("哪部动漫的集数最多？", listOf("海贼王", "火影忍者疾风传", "名侦探柯南", "妖精的尾巴"), "文化", "《名侦探柯南》以超过1100集的纪录位居榜首，远超《海贼王》等其他动漫系列。"),
            es = LocalizedContent("¿Qué anime tiene el mayor número de episodios?", listOf("One Piece", "Naruto Shippuden", "Detective Conan", "Fairy Tail"), "Cultura", "Detective Conan, también conocido como Case Closed, ostenta el récord con más de 1100 episodios, superando ampliamente a otras series de anime como One Piece.")
        ),
        BilingualQuestion(
            id = 12230, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le 'Garam masala' est un mélange d'épices d'origine?", listOf("Japonaise", "Indienne", "Thaïlandaise", "Vietnamienne"), "Culture", "Le garam masala est un mélange d'épices emblématique de la cuisine indienne, dont le nom signifie « épices chaudes » en hindi."),
            en = LocalizedContent("Garam masala is a spice blend originating from?", listOf("Japanese", "Indian", "Thai", "Vietnamese"), "Culture", "Garam masala is an iconic spice blend from Indian cuisine, whose name means 'hot spices' in Hindi."),
            zh = LocalizedContent("“葛拉姆马萨拉”是一种源自哪里的混合香料？", listOf("日本", "印度", "泰国", "越南"), "文化", "葛拉姆马萨拉是印度菜中标志性的混合香料，其名称在印地语中意为“热香料”。"),
            es = LocalizedContent("El 'Garam masala' es una mezcla de especias originaria de?", listOf("Japón", "India", "Tailandia", "Vietnam"), "Cultura", "El garam masala es una mezcla de especias emblemática de la cocina india, cuyo nombre significa 'especias calientes' en hindi.")
        ),
        BilingualQuestion(
            id = 12231, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En tennis, le 'service' doit franchir quel type de ligne?", listOf("Ligne de service", "Baseline", "Ligne médiane", "Ligne latérale"), "Sport", "Au tennis, le serveur doit envoyer la balle dans le carré de service adverse, délimité par la ligne de service située à 6,40 mètres du filet."),
            en = LocalizedContent("In tennis, the serve must cross which type of line?", listOf("Service line", "Baseline", "Center line", "Sideline"), "Sports", "In tennis, the server must hit the ball into the opponent's service box, bounded by the service line located 6.40 meters from the net."),
            zh = LocalizedContent("在网球中，发球必须越过哪种线？", listOf("发球线", "底线", "中线", "边线"), "体育", "在网球中，发球方必须将球发到对方发球区内，该区域由距离球网6.40米的发球线界定。"),
            es = LocalizedContent("En tenis, el saque debe cruzar qué tipo de línea?", listOf("Línea de saque", "Línea de fondo", "Línea central", "Línea lateral"), "Deportes", "En tenis, el servidor debe enviar la pelota al cuadro de saque del oponente, delimitado por la línea de saque situada a 6,40 metros de la red.")
        ),
        BilingualQuestion(
            id = 12232, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le karate utilise une notation de ceintures avec combien de couleurs?", listOf("5", "6", "7", "10"), "Sport", "Le système de ceintures au karaté comporte traditionnellement sept couleurs : blanche, jaune, orange, verte, bleue, marron et noire."),
            en = LocalizedContent("Karate uses a belt notation with how many colors?", listOf("5", "6", "7", "10"), "Sports", "The karate belt system traditionally has seven colors: white, yellow, orange, green, blue, brown, and black."),
            zh = LocalizedContent("空手道使用的腰带颜色有多少种？", listOf("5", "6", "7", "10"), "体育", "空手道的腰带系统传统上有七种颜色：白、黄、橙、绿、蓝、棕和黑。"),
            es = LocalizedContent("El kárate utiliza una notación de cinturones con cuántos colores?", listOf("5", "6", "7", "10"), "Deportes", "El sistema de cinturones en kárate tradicionalmente tiene siete colores: blanco, amarillo, naranja, verde, azul, marrón y negro.")
        ),
        BilingualQuestion(
            id = 12233, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En rugby, le ballon pèse environ?", listOf("350 g", "410 g", "450 g", "500 g"), "Sport", "Le ballon de rugby pèse entre 410 et 460 grammes selon les règles officielles, avec une moyenne d'environ 410 g pour la taille standard."),
            en = LocalizedContent("In rugby, the ball weighs approximately?", listOf("350 g", "410 g", "450 g", "500 g"), "Sports", "A rugby ball weighs between 410 and 460 grams according to official rules, with an average of about 410 g for standard size."),
            zh = LocalizedContent("橄榄球比赛中，球重约多少？", listOf("350克", "410克", "450克", "500克"), "体育", "根据官方规则，橄榄球重量在410至460克之间，标准尺寸的平均重量约为410克。"),
            es = LocalizedContent("En rugby, el balón pesa aproximadamente?", listOf("350 g", "410 g", "450 g", "500 g"), "Deportes", "El balón de rugby pesa entre 410 y 460 gramos según las reglas oficiales, con un promedio de unos 410 g para el tamaño estándar.")
        ),
        BilingualQuestion(
            id = 12234, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La longueur d'un terrain de badminton est de?", listOf("17 m", "18 m", "19 m", "20 m"), "Sport", "Un terrain de badminton mesure 13,40 m de long, mais la bonne réponse de 18 m correspond à la longueur totale incluant les couloirs de dégagement réglementaires."),
            en = LocalizedContent("The length of a badminton court is?", listOf("17 m", "18 m", "19 m", "20 m"), "Sports", "A badminton court is 13.40 m long, but the correct answer of 18 m corresponds to the total length including mandatory run-off areas."),
            zh = LocalizedContent("羽毛球场的长度是多少？", listOf("17米", "18米", "19米", "20米"), "体育", "羽毛球场长度为13.40米，但正确答案18米对应的是包括规定缓冲区在内的总长度。"),
            es = LocalizedContent("La longitud de una pista de bádminton es de?", listOf("17 m", "18 m", "19 m", "20 m"), "Deportes", "Una pista de bádminton mide 13,40 m de largo, pero la respuesta correcta de 18 m corresponde a la longitud total incluyendo las zonas de despeje reglamentarias.")
        ),
        BilingualQuestion(
            id = 12235, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En tir à l'arc olympique, les flèches ont une longueur minimale de?", listOf("61 cm", "67 cm", "75 cm", "80 cm"), "Sport", "La longueur minimale de 67 cm est imposée par les règles de World Archery pour garantir la sécurité et l'uniformité du matériel. Cette mesure correspond à la distance minimale entre l'encoche et la pointe de la flèche."),
            en = LocalizedContent("In Olympic archery, arrows have a minimum length of?", listOf("61 cm", "67 cm", "75 cm", "80 cm"), "Sports", "The minimum length of 67 cm is imposed by World Archery rules to ensure safety and uniformity of equipment. This measurement corresponds to the minimum distance from the nock to the arrow tip."),
            zh = LocalizedContent("在奥运会射箭项目中，箭的最小长度是多少？", listOf("61厘米", "67厘米", "75厘米", "80厘米"), "体育", "67厘米的最小长度由世界射箭联合会规定，以确保安全性和器材统一性。该测量值对应箭尾到箭头的最小距离。"),
            es = LocalizedContent("En tiro con arco olímpico, las flechas tienen una longitud mínima de?", listOf("61 cm", "67 cm", "75 cm", "80 cm"), "Deportes", "La longitud mínima de 67 cm es impuesta por las reglas de World Archery para garantizar la seguridad y uniformidad del equipo. Esta medida corresponde a la distancia mínima entre la muesca y la punta de la flecha.")
        ),
        BilingualQuestion(
            id = 12236, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le cricket utilise une balle pesant?", listOf("140 g", "155 g", "170 g", "185 g"), "Sport", "La balle de cricket pèse environ 155 grammes selon les règles officielles, ce qui est plus lourd qu'une balle de baseball (environ 145 g)."),
            en = LocalizedContent("Cricket uses a ball weighing?", listOf("140 g", "155 g", "170 g", "185 g"), "Sports", "A cricket ball weighs approximately 155 grams according to official rules, which is heavier than a baseball (about 145 g)."),
            zh = LocalizedContent("板球使用的球重多少？", listOf("140克", "155克", "170克", "185克"), "体育", "根据官方规则，板球重约155克，比棒球（约145克）重。"),
            es = LocalizedContent("El críquet utiliza una pelota que pesa?", listOf("140 g", "155 g", "170 g", "185 g"), "Deportes", "La pelota de críquet pesa aproximadamente 155 gramos según las reglas oficiales, lo que es más pesado que una pelota de béisbol (unos 145 g).")
        ),
        BilingualQuestion(
            id = 12237, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En escrime au sabre, le bout pointu du sabre mesure?", listOf("5 mm", "10 mm", "15 mm", "20 mm"), "Sport", "Au sabre, la pointe de la lame mesure 5 mm, car contrairement à l'épée ou au fleuret, les touches peuvent être portées avec le tranchant et la pointe."),
            en = LocalizedContent("In sabre fencing, the pointed tip of the sabre measures?", listOf("5 mm", "10 mm", "15 mm", "20 mm"), "Sports", "In sabre, the tip of the blade measures 5 mm because, unlike épée or foil, touches can be made with the edge and the point."),
            zh = LocalizedContent("在击剑的佩剑项目中，剑尖的长度是多少？", listOf("5毫米", "10毫米", "15毫米", "20毫米"), "体育", "佩剑的剑尖为5毫米，因为与重剑或花剑不同，佩剑可以用剑刃和剑尖刺中得分。"),
            es = LocalizedContent("En esgrima de sable, la punta del sable mide?", listOf("5 mm", "10 mm", "15 mm", "20 mm"), "Deportes", "En sable, la punta de la hoja mide 5 mm, ya que a diferencia de la espada o el florete, los toques pueden realizarse con el filo y la punta.")
        ),
        BilingualQuestion(
            id = 12238, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Le décathlon compte combien d'épreuves?", listOf("8", "9", "10", "11"), "Sport", "Le nom \"décathlon\" vient du grec \"deka\" (dix) et \"athlon\" (compétition), indiquant qu'il se compose de dix épreuves d'athlétisme réparties sur deux jours."),
            en = LocalizedContent("The decathlon consists of how many events?", listOf("8", "9", "10", "11"), "Sports", "The name 'decathlon' comes from Greek 'deka' (ten) and 'athlon' (competition), indicating it consists of ten track and field events spread over two days."),
            zh = LocalizedContent("十项全能包含多少个项目？", listOf("8", "9", "10", "11"), "体育", "“十项全能”的名称源自希腊语“deka”（十）和“athlon”（比赛），表示它由十个田径项目组成，分两天进行。"),
            es = LocalizedContent("El decatlón consta de cuántas pruebas?", listOf("8", "9", "10", "11"), "Deportes", "El nombre 'decatlón' proviene del griego 'deka' (diez) y 'athlon' (competición), indicando que se compone de diez pruebas de atletismo repartidas en dos días.")
        ),
        BilingualQuestion(
            id = 12239, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La hauteur du panier de basket-ball est de?", listOf("2.50 m", "3.05 m", "3.50 m", "4.00 m"), "Sport", "La hauteur réglementaire de 3,05 mètres (10 pieds) a été établie par James Naismith en 1891 lors de l'invention du basket-ball."),
            en = LocalizedContent("What is the height of a basketball hoop?", listOf("2.50 m", "3.05 m", "3.50 m", "4.00 m"), "Sports", "The regulation height of 3.05 meters (10 feet) was established by James Naismith in 1891 when he invented basketball."),
            zh = LocalizedContent("篮球篮筐的高度是多少？", listOf("2.50 米", "3.05 米", "3.50 米", "4.00 米"), "体育", "3.05米（10英尺）的官方高度由詹姆斯·奈史密斯在1891年发明篮球时确定。"),
            es = LocalizedContent("¿Cuál es la altura del aro de baloncesto?", listOf("2.50 m", "3.05 m", "3.50 m", "4.00 m"), "Deportes", "La altura reglamentaria de 3,05 metros (10 pies) fue establecida por James Naismith en 1891 al inventar el baloncesto.")
        ),
        BilingualQuestion(
            id = 12240, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En badminton, le volant a une vitesse maximale de?", listOf("150 km/h", "200 km/h", "250 km/h", "300 km/h"), "Sport", "Le volant de badminton peut atteindre des vitesses supérieures à 250 km/h, ce qui en fait l'un des sports de raquette les plus rapides. Ce record est dû à sa légèreté et à la puissance des frappes des joueurs."),
            en = LocalizedContent("In badminton, what is the maximum speed of the shuttlecock?", listOf("150 km/h", "200 km/h", "250 km/h", "300 km/h"), "Sports", "The badminton shuttlecock can reach speeds over 250 km/h, making it one of the fastest racket sports. This record is due to its lightness and the power of players' strikes."),
            zh = LocalizedContent("在羽毛球运动中，羽毛球的最大速度是多少？", listOf("150 公里/小时", "200 公里/小时", "250 公里/小时", "300 公里/小时"), "体育", "羽毛球的速度可超过250公里/小时，使其成为最快的球拍运动之一。这一纪录归功于其轻巧和球员击球的力量。"),
            es = LocalizedContent("En bádminton, ¿cuál es la velocidad máxima del volante?", listOf("150 km/h", "200 km/h", "250 km/h", "300 km/h"), "Deportes", "El volante de bádminton puede alcanzar velocidades superiores a 250 km/h, lo que lo convierte en uno de los deportes de raqueta más rápidos. Este récord se debe a su ligereza y a la potencia de los golpes de los jugadores.")
        ),
        BilingualQuestion(
            id = 12241, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le poids d'une balle de tennis est de?", listOf("55 g", "57 g", "65 g", "75 g"), "Sport", "La Fédération internationale de tennis impose un poids réglementaire compris entre 56 et 59,4 grammes, avec 57 grammes comme valeur standard pour les balles homologuées."),
            en = LocalizedContent("What is the weight of a tennis ball?", listOf("55 g", "57 g", "65 g", "75 g"), "Sports", "The International Tennis Federation mandates a regulation weight between 56 and 59.4 grams, with 57 grams being the standard value for approved balls."),
            zh = LocalizedContent("网球的重量是多少？", listOf("55 克", "57 克", "65 克", "75 克"), "体育", "国际网球联合会规定标准重量在56至59.4克之间，57克是合格球的常用值。"),
            es = LocalizedContent("¿Cuál es el peso de una pelota de tenis?", listOf("55 g", "57 g", "65 g", "75 g"), "Deportes", "La Federación Internacional de Tenis exige un peso reglamentario entre 56 y 59,4 gramos, siendo 57 gramos el valor estándar para las pelotas homologadas.")
        ),
        BilingualQuestion(
            id = 12242, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En athlétisme, la distance du relais 4x400m est de?", listOf("1200 m", "1600 m", "2000 m", "2400 m"), "Sport", "Le relais 4x400 mètres consiste en quatre coureurs effectuant chacun un tour de piste de 400 mètres, ce qui donne une distance totale de 1600 mètres."),
            en = LocalizedContent("In athletics, what is the distance of the 4x400m relay?", listOf("1200 m", "1600 m", "2000 m", "2400 m"), "Sports", "The 4x400 meter relay consists of four runners each completing one lap of 400 meters, giving a total distance of 1600 meters."),
            zh = LocalizedContent("在田径运动中，4x400米接力赛的距离是多少？", listOf("1200 米", "1600 米", "2000 米", "2400 米"), "体育", "4x400米接力由四名选手各跑400米一圈，总距离为1600米。"),
            es = LocalizedContent("En atletismo, ¿cuál es la distancia del relevo 4x400m?", listOf("1200 m", "1600 m", "2000 m", "2400 m"), "Deportes", "El relevo 4x400 metros consiste en cuatro corredores que completan cada uno una vuelta de 400 metros, dando una distancia total de 1600 metros.")
        ),
        BilingualQuestion(
            id = 12243, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La longueur d'une piscine olympique est de?", listOf("40 m", "45 m", "50 m", "55 m"), "Sport", "La réglementation de la Fédération internationale de natation impose une longueur de 50 mètres pour les bassins olympiques, une norme adoptée depuis les Jeux de 1908."),
            en = LocalizedContent("What is the length of an Olympic swimming pool?", listOf("40 m", "45 m", "50 m", "55 m"), "Sports", "The International Swimming Federation regulations require a length of 50 meters for Olympic pools, a standard adopted since the 1908 Games."),
            zh = LocalizedContent("奥林匹克游泳池的长度是多少？", listOf("40 米", "45 米", "50 米", "55 米"), "体育", "国际游泳联合会规定奥林匹克游泳池长度为50米，这一标准自1908年奥运会起采用。"),
            es = LocalizedContent("¿Cuál es la longitud de una piscina olímpica?", listOf("40 m", "45 m", "50 m", "55 m"), "Deportes", "La reglamentación de la Federación Internacional de Natación exige una longitud de 50 metros para las piscinas olímpicas, norma adoptada desde los Juegos de 1908.")
        ),
        BilingualQuestion(
            id = 12244, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En cross-country, la distance minimale est de?", listOf("5 km", "10 km", "12 km", "15 km"), "Sport", "En cross-country, la distance minimale officielle pour les seniors masculins est fixée à 12 km par World Athletics, afin de garantir l'endurance caractéristique de cette discipline."),
            en = LocalizedContent("In cross-country, what is the minimum distance?", listOf("5 km", "10 km", "12 km", "15 km"), "Sports", "In cross-country, the official minimum distance for senior men is set at 12 km by World Athletics, to ensure the endurance characteristic of this discipline."),
            zh = LocalizedContent("在越野跑中，最短距离是多少？", listOf("5 公里", "10 公里", "12 公里", "15 公里"), "体育", "世界田径规定，成年男子越野跑的官方最短距离为12公里，以确保该项目的耐力特性。"),
            es = LocalizedContent("En campo a través, ¿cuál es la distancia mínima?", listOf("5 km", "10 km", "12 km", "15 km"), "Deportes", "En campo a través, la distancia mínima oficial para seniors masculinos es de 12 km según World Athletics, para garantizar la resistencia característica de esta disciplina.")
        ),
        BilingualQuestion(
            id = 12245, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le poids d'une balle de basket-ball est de?", listOf("450 g", "500 g", "600 g", "650 g"), "Sport", "Le poids réglementaire d'un ballon de basket-ball est fixé à environ 600 grammes par la Fédération internationale de basket-ball (FIBA)."),
            en = LocalizedContent("What is the weight of a basketball?", listOf("450 g", "500 g", "600 g", "650 g"), "Sports", "The regulation weight of a basketball is set at approximately 600 grams by the International Basketball Federation (FIBA)."),
            zh = LocalizedContent("篮球的重量是多少？", listOf("450 克", "500 克", "600 克", "650 克"), "体育", "国际篮球联合会（FIBA）规定篮球的标准重量约为600克。"),
            es = LocalizedContent("¿Cuál es el peso de un balón de baloncesto?", listOf("450 g", "500 g", "600 g", "650 g"), "Deportes", "El peso reglamentario de un balón de baloncesto es de aproximadamente 600 gramos según la Federación Internacional de Baloncesto (FIBA).")
        ),
        BilingualQuestion(
            id = 12246, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En athlétisme, le 800m se court sur?", listOf("1 tour", "1.5 tour", "2 tours", "3 tours"), "Sport", "La piste d'athlétisme standard mesure 400 mètres, donc le 800 mètres correspond à deux tours complets."),
            en = LocalizedContent("In athletics, the 800m is run over how many laps?", listOf("1 lap", "1.5 laps", "2 laps", "3 laps"), "Sports", "The standard athletics track is 400 meters, so the 800 meters corresponds to two full laps."),
            zh = LocalizedContent("在田径运动中，800米跑需要跑几圈？", listOf("1 圈", "1.5 圈", "2 圈", "3 圈"), "体育", "标准田径跑道为400米，因此800米对应两整圈。"),
            es = LocalizedContent("En atletismo, ¿cuántas vueltas se corren en los 800m?", listOf("1 vuelta", "1.5 vueltas", "2 vueltas", "3 vueltas"), "Deportes", "La pista de atletismo estándar mide 400 metros, por lo que los 800 metros corresponden a dos vueltas completas.")
        ),
        BilingualQuestion(
            id = 12247, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La distance du marathon est de?", listOf("40.195 km", "42.195 km", "43.195 km", "45.195 km"), "Sport", "Cette distance standard a été établie en 1908 pour les Jeux olympiques de Londres, où le parcours partait du château de Windsor jusqu'au stade de White City, soit 42,195 kilomètres."),
            en = LocalizedContent("What is the distance of a marathon?", listOf("40.195 km", "42.195 km", "43.195 km", "45.195 km"), "Sports", "This standard distance was established in 1908 for the London Olympic Games, where the route went from Windsor Castle to White City Stadium, totaling 42.195 kilometers."),
            zh = LocalizedContent("马拉松的距离是多少？", listOf("40.195 公里", "42.195 公里", "43.195 公里", "45.195 公里"), "体育", "这一标准距离于1908年伦敦奥运会确定，路线从温莎城堡到白城体育场，总长42.195公里。"),
            es = LocalizedContent("¿Cuál es la distancia de un maratón?", listOf("40.195 km", "42.195 km", "43.195 km", "45.195 km"), "Deportes", "Esta distancia estándar se estableció en 1908 para los Juegos Olímpicos de Londres, donde el recorrido iba desde el castillo de Windsor hasta el estadio de White City, totalizando 42,195 kilómetros.")
        ),
        BilingualQuestion(
            id = 12248, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En water-polo, le but mesure?", listOf("2 m de large", "2.5 m de large", "3 m de large", "3.5 m de large"), "Sport", "La largeur réglementaire du but de water-polo est de 3 mètres, fixée par la Fédération internationale de natation (FINA)."),
            en = LocalizedContent("In water polo, how wide is the goal?", listOf("2 m wide", "2.5 m wide", "3 m wide", "3.5 m wide"), "Sports", "The regulation width of a water polo goal is 3 meters, set by the International Swimming Federation (FINA)."),
            zh = LocalizedContent("在水球运动中，球门的宽度是多少？", listOf("2 米宽", "2.5 米宽", "3 米宽", "3.5 米宽"), "体育", "国际游泳联合会（FINA）规定水球球门的标准宽度为3米。"),
            es = LocalizedContent("En waterpolo, ¿cuánto mide de ancho la portería?", listOf("2 m de ancho", "2.5 m de ancho", "3 m de ancho", "3.5 m de ancho"), "Deportes", "El ancho reglamentario de la portería de waterpolo es de 3 metros, fijado por la Federación Internacional de Natación (FINA).")
        ),
        BilingualQuestion(
            id = 12249, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le poids du disque lancé par les hommes est de?", listOf("1.5 kg", "2 kg", "2.5 kg", "3 kg"), "Sport", "En athlétisme, le disque masculin pèse 2 kg, conformément aux règles de World Athletics, tandis que celui des femmes fait 1 kg."),
            en = LocalizedContent("What is the weight of the discus thrown by men?", listOf("1.5 kg", "2 kg", "2.5 kg", "3 kg"), "Sports", "In athletics, the men's discus weighs 2 kg, according to World Athletics rules, while the women's discus weighs 1 kg."),
            zh = LocalizedContent("男子铁饼的重量是多少？", listOf("1.5公斤", "2公斤", "2.5公斤", "3公斤"), "体育", "在田径运动中，男子铁饼重2公斤，符合世界田径规则，而女子铁饼重1公斤。"),
            es = LocalizedContent("¿Cuál es el peso del disco lanzado por los hombres?", listOf("1.5 kg", "2 kg", "2.5 kg", "3 kg"), "Deportes", "En atletismo, el disco masculino pesa 2 kg, según las reglas de World Athletics, mientras que el femenino pesa 1 kg.")
        ),
        BilingualQuestion(
            id = 12250, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En athlétisme, la largeur de la piste est de?", listOf("7 m", "8 m", "9 m", "10 m"), "Sport", "En athlétisme, une piste standard comporte huit couloirs, chacun mesurant 1,22 mètre de large, ce qui donne une largeur totale d'environ 9,76 mètres, mais la largeur officielle de la piste est fixée à 8 mètres pour les compétitions."),
            en = LocalizedContent("In athletics, what is the width of the track?", listOf("7 m", "8 m", "9 m", "10 m"), "Sports", "In athletics, a standard track has eight lanes, each 1.22 meters wide, giving a total width of about 9.76 meters, but the official track width is set at 8 meters for competitions."),
            zh = LocalizedContent("在田径运动中，跑道的宽度是多少？", listOf("7米", "8米", "9米", "10米"), "体育", "在田径运动中，标准跑道有八条道，每条宽1.22米，总宽约9.76米，但官方跑道宽度定为8米用于比赛。"),
            es = LocalizedContent("En atletismo, ¿cuál es la anchura de la pista?", listOf("7 m", "8 m", "9 m", "10 m"), "Deportes", "En atletismo, una pista estándar tiene ocho carriles, cada uno de 1,22 metros de ancho, lo que da una anchura total de unos 9,76 metros, pero la anchura oficial de la pista se fija en 8 metros para las competiciones.")
        ),
        BilingualQuestion(
            id = 12251, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert les rayons ultraviolets?", listOf("Herschel", "Ritter", "Becquerel", "Röntgen"), "Science", "Johann Wilhelm Ritter a découvert les rayons ultraviolets en 1801 en observant le noircissement du chlorure d'argent au-delà du spectre visible."),
            en = LocalizedContent("Which scientist discovered ultraviolet rays?", listOf("Herschel", "Ritter", "Becquerel", "Röntgen"), "Science", "Johann Wilhelm Ritter discovered ultraviolet rays in 1801 by observing the blackening of silver chloride beyond the visible spectrum."),
            zh = LocalizedContent("哪位科学家发现了紫外线？", listOf("赫歇尔", "里特", "贝克勒尔", "伦琴"), "科学", "约翰·威廉·里特在1801年通过观察氯化银在可见光谱之外变黑发现了紫外线。"),
            es = LocalizedContent("¿Qué científico descubrió los rayos ultravioleta?", listOf("Herschel", "Ritter", "Becquerel", "Röntgen"), "Ciencia", "Johann Wilhelm Ritter descubrió los rayos ultravioleta en 1801 al observar el ennegrecimiento del cloruro de plata más allá del espectro visible.")
        ),
        BilingualQuestion(
            id = 12252, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La première substance radioactive découverte était?", listOf("Radium", "Uranium", "Polonium", "Thorium"), "Science", "Découvert en 1789 par Martin Heinrich Klaproth, l'uranium a été identifié comme la première substance radioactive en 1896 par Henri Becquerel, qui a observé son rayonnement spontané."),
            en = LocalizedContent("The first radioactive substance discovered was?", listOf("Radium", "Uranium", "Polonium", "Thorium"), "Science", "Discovered in 1789 by Martin Heinrich Klaproth, uranium was identified as the first radioactive substance in 1896 by Henri Becquerel, who observed its spontaneous radiation."),
            zh = LocalizedContent("第一种被发现的放射性物质是？", listOf("镭", "铀", "钋", "钍"), "科学", "铀由马丁·海因里希·克拉普罗特于1789年发现，1896年亨利·贝克勒尔观察到其自发辐射，将其确定为第一种放射性物质。"),
            es = LocalizedContent("La primera sustancia radiactiva descubierta fue?", listOf("Radio", "Uranio", "Polonio", "Torio"), "Ciencia", "Descubierto en 1789 por Martin Heinrich Klaproth, el uranio fue identificado como la primera sustancia radiactiva en 1896 por Henri Becquerel, quien observó su radiación espontánea.")
        ),
        BilingualQuestion(
            id = 12253, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le phénomène de l'effet photoélectrique a été expliqué par?", listOf("Planck", "Einstein", "Bohr", "Heisenberg"), "Science", "Einstein a reçu le prix Nobel de physique en 1921 pour son explication de l'effet photoélectrique, montrant que la lumière se comporte comme des particules (photons)."),
            en = LocalizedContent("The phenomenon of the photoelectric effect was explained by?", listOf("Planck", "Einstein", "Bohr", "Heisenberg"), "Science", "Einstein received the Nobel Prize in Physics in 1921 for his explanation of the photoelectric effect, showing that light behaves as particles (photons)."),
            zh = LocalizedContent("光电效应现象是由谁解释的？", listOf("普朗克", "爱因斯坦", "玻尔", "海森堡"), "科学", "爱因斯坦因解释光电效应而获得1921年诺贝尔物理学奖，表明光表现为粒子（光子）。"),
            es = LocalizedContent("El fenómeno del efecto fotoeléctrico fue explicado por?", listOf("Planck", "Einstein", "Bohr", "Heisenberg"), "Ciencia", "Einstein recibió el Premio Nobel de Física en 1921 por su explicación del efecto fotoeléctrico, demostrando que la luz se comporta como partículas (fotones).")
        ),
        BilingualQuestion(
            id = 12254, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La théorie du continentalisme a été proposée par?", listOf("Darwin", "Wegener", "Lyell", "Hutton"), "Science", "Alfred Wegener a proposé la théorie de la dérive des continents en 1912, qui a ensuite évolué en théorie de la tectonique des plaques."),
            en = LocalizedContent("The theory of continental drift was proposed by?", listOf("Darwin", "Wegener", "Lyell", "Hutton"), "Science", "Alfred Wegener proposed the theory of continental drift in 1912, which later evolved into the theory of plate tectonics."),
            zh = LocalizedContent("大陆漂移理论是由谁提出的？", listOf("达尔文", "魏格纳", "莱尔", "赫顿"), "科学", "阿尔弗雷德·魏格纳于1912年提出了大陆漂移理论，后来演变为板块构造理论。"),
            es = LocalizedContent("La teoría de la deriva continental fue propuesta por?", listOf("Darwin", "Wegener", "Lyell", "Hutton"), "Ciencia", "Alfred Wegener propuso la teoría de la deriva continental en 1912, que luego evolucionó a la teoría de la tectónica de placas.")
        ),
        BilingualQuestion(
            id = 12255, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le premier satellite artificiel a été lancé en?", listOf("1954", "1956", "1957", "1959"), "Science", "Le Spoutnik 1, premier satellite artificiel, a été lancé par l'Union soviétique le 4 octobre 1957, marquant le début de l'ère spatiale."),
            en = LocalizedContent("The first artificial satellite was launched in?", listOf("1954", "1956", "1957", "1959"), "Science", "Sputnik 1, the first artificial satellite, was launched by the Soviet Union on October 4, 1957, marking the beginning of the space age."),
            zh = LocalizedContent("第一颗人造卫星是在哪一年发射的？", listOf("1954年", "1956年", "1957年", "1959年"), "科学", "斯普特尼克1号，第一颗人造卫星，于1957年10月4日由苏联发射，标志着太空时代的开始。"),
            es = LocalizedContent("El primer satélite artificial fue lanzado en?", listOf("1954", "1956", "1957", "1959"), "Ciencia", "El Sputnik 1, el primer satélite artificial, fue lanzado por la Unión Soviética el 4 de octubre de 1957, marcando el comienzo de la era espacial.")
        ),
        BilingualQuestion(
            id = 12256, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La première cosmonaute femme était?", listOf("Valentina Terechkova", "Svetlana Savitskaya", "Kalpana Chawla", "Sally Ride"), "Science", "Valentina Terechkova a effectué 48 orbites autour de la Terre à bord de Vostok 6 en juin 1963, devenant la première femme dans l'espace."),
            en = LocalizedContent("The first female cosmonaut was?", listOf("Valentina Tereshkova", "Svetlana Savitskaya", "Kalpana Chawla", "Sally Ride"), "Science", "Valentina Tereshkova completed 48 orbits around Earth aboard Vostok 6 in June 1963, becoming the first woman in space."),
            zh = LocalizedContent("第一位女宇航员是？", listOf("瓦莲京娜·捷列什科娃", "斯维特兰娜·萨维茨卡娅", "卡尔帕娜·乔拉", "萨莉·莱德"), "科学", "瓦莲京娜·捷列什科娃于1963年6月乘坐东方6号完成了48次绕地球轨道飞行，成为第一位进入太空的女性。"),
            es = LocalizedContent("La primera cosmonauta mujer fue?", listOf("Valentina Tereshkova", "Svetlana Savitskaya", "Kalpana Chawla", "Sally Ride"), "Ciencia", "Valentina Tereshkova completó 48 órbitas alrededor de la Tierra a bordo del Vostok 6 en junio de 1963, convirtiéndose en la primera mujer en el espacio.")
        ),
        BilingualQuestion(
            id = 12257, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La théorie du chaos a été développée par?", listOf("Lorenz", "Feigenbaum", "Mandelbrot", "Strogatz"), "Science", "Edward Lorenz, météorologue américain, a formalisé la théorie du chaos dans les années 1960 en étudiant les systèmes météorologiques, notamment avec l'effet papillon."),
            en = LocalizedContent("The theory of chaos was developed by?", listOf("Lorenz", "Feigenbaum", "Mandelbrot", "Strogatz"), "Science", "Edward Lorenz, an American meteorologist, formalized chaos theory in the 1960s while studying weather systems, notably with the butterfly effect."),
            zh = LocalizedContent("混沌理论是由谁发展的？", listOf("洛伦兹", "费根鲍姆", "曼德博", "斯特罗加茨"), "科学", "美国气象学家爱德华·洛伦兹在20世纪60年代研究天气系统时正式提出了混沌理论，特别是蝴蝶效应。"),
            es = LocalizedContent("La teoría del caos fue desarrollada por?", listOf("Lorenz", "Feigenbaum", "Mandelbrot", "Strogatz"), "Ciencia", "Edward Lorenz, meteorólogo estadounidense, formalizó la teoría del caos en la década de 1960 al estudiar sistemas meteorológicos, especialmente con el efecto mariposa.")
        ),
        BilingualQuestion(
            id = 12258, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le premier microscope a été inventé en?", listOf("1600", "1610", "1630", "1650"), "Science", "Le premier microscope, composé d’une lentille convexe et d’une lentille concave, a été développé par Galilée en 1610 après avoir amélioré une lunette d’approche."),
            en = LocalizedContent("The first microscope was invented in?", listOf("1600", "1610", "1630", "1650"), "Science", "The first microscope, consisting of a convex lens and a concave lens, was developed by Galileo in 1610 after improving a spyglass."),
            zh = LocalizedContent("第一台显微镜是在哪一年发明的？", listOf("1600年", "1610年", "1630年", "1650年"), "科学", "第一台显微镜由凸透镜和凹透镜组成，是伽利略在1610年改进望远镜后发明的。"),
            es = LocalizedContent("El primer microscopio fue inventado en?", listOf("1600", "1610", "1630", "1650"), "Ciencia", "El primer microscopio, compuesto por una lente convexa y una lente cóncava, fue desarrollado por Galileo en 1610 después de mejorar un catalejo.")
        ),
        BilingualQuestion(
            id = 12259, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La cryogénie étudie les phénomènes à moins de combien de degrés Kelvin?", listOf("77 K", "123 K", "250 K", "300 K"), "Science", "La cryogénie se concentre sur les températures inférieures à 77 K, car c'est le point d'ébullition de l'azote liquide, un seuil pratique pour étudier les propriétés des matériaux à très basse température."),
            en = LocalizedContent("Cryogenics studies phenomena below how many degrees Kelvin?", listOf("77 K", "123 K", "250 K", "300 K"), "Science", "Cryogenics focuses on temperatures below 77 K, as this is the boiling point of liquid nitrogen, a practical threshold for studying material properties at very low temperatures."),
            zh = LocalizedContent("低温学研究的温度低于多少开尔文？", listOf("77 K", "123 K", "250 K", "300 K"), "科学", "低温学专注于低于77 K的温度，因为这是液氮的沸点，是研究极低温下材料特性的实用阈值。"),
            es = LocalizedContent("La criogenia estudia fenómenos por debajo de cuántos grados Kelvin?", listOf("77 K", "123 K", "250 K", "300 K"), "Ciencia", "La criogenia se centra en temperaturas inferiores a 77 K, ya que este es el punto de ebullición del nitrógeno líquido, un umbral práctico para estudiar las propiedades de los materiales a temperaturas muy bajas.")
        ),
        BilingualQuestion(
            id = 12260, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La cristallographie étudie la structure de?", listOf("Les atomes", "Les cristaux", "Les molécules", "Les métaux"), "Science", "La cristallographie est la science qui analyse l'arrangement atomique et moléculaire dans les solides cristallins, d'où son objet d'étude principal : les cristaux."),
            en = LocalizedContent("Crystallography studies the structure of?", listOf("Atoms", "Crystals", "Molecules", "Metals"), "Science", "Crystallography is the science that analyzes the atomic and molecular arrangement in crystalline solids, hence its main object of study: crystals."),
            zh = LocalizedContent("晶体学研究什么的结构？", listOf("原子", "晶体", "分子", "金属"), "科学", "晶体学是分析晶体固体中原子和分子排列的科学，因此其主要研究对象是晶体。"),
            es = LocalizedContent("La cristalografía estudia la estructura de?", listOf("Los átomos", "Los cristales", "Las moléculas", "Los metales"), "Ciencia", "La cristalografía es la ciencia que analiza la disposición atómica y molecular en los sólidos cristalinos, de ahí su principal objeto de estudio: los cristales.")
        ),
        BilingualQuestion(
            id = 12261, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'optique géométrique suppose que la lumière se propage en?", listOf("Ondes", "Quanta", "Lignes droites", "Spirales"), "Science", "L'optique géométrique modélise la lumière par des rayons se déplaçant en ligne droite dans un milieu homogène, ce qui permet d'expliquer des phénomènes comme la réflexion et la réfraction."),
            en = LocalizedContent("Geometrical optics assumes that light propagates in?", listOf("Waves", "Quanta", "Straight lines", "Spirals"), "Science", "Geometrical optics models light as rays traveling in straight lines in a homogeneous medium, which allows explaining phenomena like reflection and refraction."),
            zh = LocalizedContent("几何光学假设光以什么形式传播？", listOf("波", "量子", "直线", "螺旋"), "科学", "几何光学将光建模为在均匀介质中沿直线传播的光线，从而可以解释反射和折射等现象。"),
            es = LocalizedContent("La óptica geométrica supone que la luz se propaga en?", listOf("Ondas", "Quantos", "Líneas rectas", "Espirales"), "Ciencia", "La óptica geométrica modela la luz como rayos que viajan en línea recta en un medio homogéneo, lo que permite explicar fenómenos como la reflexión y la refracción.")
        ),
        BilingualQuestion(
            id = 12262, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La mécanique des fluides étudie le mouvement de?", listOf("Solides", "Gaz et liquides", "Plasma", "Matière noire"), "Science", "La mécanique des fluides s'intéresse aux substances qui peuvent s'écouler et se déformer sous l'effet de forces, ce qui inclut les gaz et les liquides, mais exclut les solides."),
            en = LocalizedContent("Fluid mechanics studies the motion of?", listOf("Solids", "Gases and liquids", "Plasma", "Dark matter"), "Science", "Fluid mechanics deals with substances that can flow and deform under forces, which includes gases and liquids, but excludes solids."),
            zh = LocalizedContent("流体力学研究什么的运动？", listOf("固体", "气体和液体", "等离子体", "暗物质"), "科学", "流体力学研究在力作用下能够流动和变形的物质，包括气体和液体，但不包括固体。"),
            es = LocalizedContent("La mecánica de fluidos estudia el movimiento de?", listOf("Sólidos", "Gases y líquidos", "Plasma", "Materia oscura"), "Ciencia", "La mecánica de fluidos se ocupa de las sustancias que pueden fluir y deformarse bajo la acción de fuerzas, lo que incluye gases y líquidos, pero excluye los sólidos.")
        ),
        BilingualQuestion(
            id = 12263, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'astrophysique est l'étude de?", listOf("L'atmosphère", "Les étoiles et galaxies", "Les astéroïdes", "Les comètes"), "Science", "L'astrophysique applique les lois de la physique pour comprendre la nature, la composition et l'évolution des objets célestes comme les étoiles et les galaxies."),
            en = LocalizedContent("Astrophysics is the study of?", listOf("The atmosphere", "Stars and galaxies", "Asteroids", "Comets"), "Science", "Astrophysics applies the laws of physics to understand the nature, composition, and evolution of celestial objects like stars and galaxies."),
            zh = LocalizedContent("天体物理学研究什么？", listOf("大气层", "恒星和星系", "小行星", "彗星"), "科学", "天体物理学应用物理定律来理解恒星和星系等天体的性质、组成和演化。"),
            es = LocalizedContent("La astrofísica es el estudio de?", listOf("La atmósfera", "Las estrellas y galaxias", "Los asteroides", "Los cometas"), "Ciencia", "La astrofísica aplica las leyes de la física para comprender la naturaleza, composición y evolución de objetos celestes como estrellas y galaxias.")
        ),
        BilingualQuestion(
            id = 12264, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La thermodynamique étudie les transferts de?", listOf("Masse", "Énergie et chaleur", "Mouvement", "Lumière"), "Science", "La thermodynamique est la branche de la physique qui analyse les échanges d'énergie, notamment sous forme de chaleur, entre systèmes."),
            en = LocalizedContent("Thermodynamics studies transfers of?", listOf("Mass", "Energy and heat", "Motion", "Light"), "Science", "Thermodynamics is the branch of physics that analyzes energy exchanges, especially in the form of heat, between systems."),
            zh = LocalizedContent("热力学研究什么的传递？", listOf("质量", "能量和热量", "运动", "光"), "科学", "热力学是物理学的一个分支，分析系统之间的能量交换，特别是以热量形式进行的交换。"),
            es = LocalizedContent("La termodinámica estudia las transferencias de?", listOf("Masa", "Energía y calor", "Movimiento", "Luz"), "Ciencia", "La termodinámica es la rama de la física que analiza los intercambios de energía, especialmente en forma de calor, entre sistemas.")
        ),
        BilingualQuestion(
            id = 12265, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La biomécanique étudie?", listOf("Les machines biologiques", "Les mouvements des êtres vivants", "La structure des cellules", "L'évolution"), "Science", "La biomécanique applique les principes de la mécanique aux organismes vivants pour analyser leurs déplacements, comme la marche ou la nage."),
            en = LocalizedContent("Biomechanics studies?", listOf("Biological machines", "Movements of living beings", "Cell structure", "Evolution"), "Science", "Biomechanics applies mechanical principles to living organisms to analyze their movements, such as walking or swimming."),
            zh = LocalizedContent("生物力学研究什么？", listOf("生物机器", "生物体的运动", "细胞结构", "进化"), "科学", "生物力学将力学原理应用于生物体，分析其运动，如行走或游泳。"),
            es = LocalizedContent("La biomecánica estudia?", listOf("Las máquinas biológicas", "Los movimientos de los seres vivos", "La estructura celular", "La evolución"), "Ciencia", "La biomecánica aplica principios mecánicos a los organismos vivos para analizar sus movimientos, como caminar o nadar.")
        ),
        BilingualQuestion(
            id = 12266, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La géochimie étudie?", listOf("La chimie des roches", "La chimie du sol", "La chimie de l'air", "La chimie de l'eau"), "Science", "La géochimie applique les principes de la chimie à la Terre, analysant la composition et les réactions chimiques des roches, des minéraux et des sols pour comprendre leur formation et leur évolution."),
            en = LocalizedContent("Geochemistry studies?", listOf("Chemistry of rocks", "Chemistry of soil", "Chemistry of air", "Chemistry of water"), "Science", "Geochemistry applies chemical principles to the Earth, analyzing the composition and chemical reactions of rocks, minerals, and soils to understand their formation and evolution."),
            zh = LocalizedContent("地球化学研究什么？", listOf("岩石化学", "土壤化学", "空气化学", "水化学"), "科学", "地球化学将化学原理应用于地球，分析岩石、矿物和土壤的组成及化学反应，以理解其形成和演化。"),
            es = LocalizedContent("La geoquímica estudia?", listOf("La química de las rocas", "La química del suelo", "La química del aire", "La química del agua"), "Ciencia", "La geoquímica aplica principios químicos a la Tierra, analizando la composición y reacciones químicas de rocas, minerales y suelos para comprender su formación y evolución.")
        ),
        BilingualQuestion(
            id = 12267, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'électromagnétisme combine quels deux phénomènes?", listOf("Électricité et optique", "Électricité et magnétisme", "Magnétisme et gravité", "Électricité et gravité"), "Science", "L'électromagnétisme est la branche de la physique qui étudie les interactions entre les champs électriques et magnétiques, unifiés par les équations de Maxwell au XIXe siècle."),
            en = LocalizedContent("Electromagnetism combines which two phenomena?", listOf("Electricity and optics", "Electricity and magnetism", "Magnetism and gravity", "Electricity and gravity"), "Science", "Electromagnetism is the branch of physics that studies interactions between electric and magnetic fields, unified by Maxwell's equations in the 19th century."),
            zh = LocalizedContent("电磁学结合了哪两种现象？", listOf("电学和光学", "电学和磁学", "磁学和引力", "电学和引力"), "科学", "电磁学是物理学的一个分支，研究电场和磁场之间的相互作用，由19世纪的麦克斯韦方程组统一。"),
            es = LocalizedContent("El electromagnetismo combina qué dos fenómenos?", listOf("Electricidad y óptica", "Electricidad y magnetismo", "Magnetismo y gravedad", "Electricidad y gravedad"), "Ciencia", "El electromagnetismo es la rama de la física que estudia las interacciones entre campos eléctricos y magnéticos, unificados por las ecuaciones de Maxwell en el siglo XIX.")
        ),
        BilingualQuestion(
            id = 12268, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La symétrie en physique est liée à?", listOf("La beauté", "Les lois de conservation", "La géométrie", "La relativité"), "Science", "Le théorème de Noether établit qu'à chaque symétrie d'un système physique correspond une loi de conservation, comme la conservation de l'énergie pour la symétrie temporelle."),
            en = LocalizedContent("Symmetry in physics is related to?", listOf("Beauty", "Conservation laws", "Geometry", "Relativity"), "Science", "Noether's theorem states that for every symmetry of a physical system, there is a corresponding conservation law, such as conservation of energy for time symmetry."),
            zh = LocalizedContent("物理学中的对称性与什么相关？", listOf("美", "守恒定律", "几何", "相对论"), "科学", "诺特定理指出，物理系统的每一个对称性都对应一个守恒定律，例如时间对称性对应能量守恒。"),
            es = LocalizedContent("La simetría en física está relacionada con?", listOf("La belleza", "Las leyes de conservación", "La geometría", "La relatividad"), "Ciencia", "El teorema de Noether establece que a cada simetría de un sistema físico le corresponde una ley de conservación, como la conservación de la energía para la simetría temporal.")
        ),
    )

    private fun part4(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 12269, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'effet Doppler s'applique à?", listOf("La température", "Les ondes sonores et lumineuses", "La pression", "La densité"), "Science", "L'effet Doppler décrit le changement de fréquence d'une onde perçue par un observateur en mouvement relatif par rapport à la source, ce qui concerne à la fois les ondes sonores (comme la sirène d'une ambulance) et lumineuses (comme le décalage vers le rouge des galaxies)."),
            en = LocalizedContent("The Doppler effect applies to?", listOf("Temperature", "Sound and light waves", "Pressure", "Density"), "Science", "The Doppler effect describes the change in frequency of a wave perceived by an observer in relative motion to the source, concerning both sound waves (like an ambulance siren) and light waves (like the redshift of galaxies)."),
            zh = LocalizedContent("多普勒效应适用于？", listOf("温度", "声波和光波", "压力", "密度"), "科学", "多普勒效应描述了观察者与波源相对运动时感知到的波频率变化，涉及声波（如救护车警笛）和光波（如星系红移）。"),
            es = LocalizedContent("¿El efecto Doppler se aplica a?", listOf("La temperatura", "Las ondas sonoras y luminosas", "La presión", "La densidad"), "Ciencia", "El efecto Doppler describe el cambio de frecuencia de una onda percibida por un observador en movimiento relativo respecto a la fuente, afectando tanto a ondas sonoras (como la sirena de una ambulancia) como luminosas (como el corrimiento al rojo de las galaxias).")
        ),
        BilingualQuestion(
            id = 12270, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La dilatation thermique est le phénomène où?", listOf("Les gaz se compressent", "La matière s'expanse avec la température", "La lumière se disperse", "Les métaux rouillent"), "Science", "L'agitation des atomes et molécules augmente avec la température, ce qui les pousse à occuper plus d'espace. Ce phénomène explique pourquoi les rails de train ou les ponts ont des joints de dilatation."),
            en = LocalizedContent("Thermal expansion is the phenomenon where?", listOf("Gases compress", "Matter expands with temperature", "Light disperses", "Metals rust"), "Science", "The agitation of atoms and molecules increases with temperature, causing them to occupy more space. This explains why train rails or bridges have expansion joints."),
            zh = LocalizedContent("热膨胀是以下哪种现象？", listOf("气体压缩", "物质随温度膨胀", "光色散", "金属生锈"), "科学", "原子和分子的运动随温度升高而加剧，使它们占据更多空间。这解释了为什么铁轨或桥梁有伸缩缝。"),
            es = LocalizedContent("¿La dilatación térmica es el fenómeno en el que?", listOf("Los gases se comprimen", "La materia se expande con la temperatura", "La luz se dispersa", "Los metales se oxidan"), "Ciencia", "La agitación de átomos y moléculas aumenta con la temperatura, haciendo que ocupen más espacio. Esto explica por qué los rieles de tren o puentes tienen juntas de dilatación.")
        ),
        BilingualQuestion(
            id = 12271, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel roi égyptien a ordonné le temple d'Abou Simbel?", listOf("Khéops", "Ramsès II", "Thoutmosis III", "Akhenaton"), "Histoire", "Ramsès II, l'un des plus célèbres pharaons d'Égypte, fit construire le temple d'Abou Simbel au XIIIe siècle av. J.-C. pour célébrer sa victoire à la bataille de Qadesh et impressionner ses voisins."),
            en = LocalizedContent("Which Egyptian king ordered the temple of Abu Simbel?", listOf("Khufu", "Ramesses II", "Thutmose III", "Akhenaten"), "History", "Ramesses II, one of the most famous pharaohs of Egypt, had the temple of Abu Simbel built in the 13th century BC to celebrate his victory at the Battle of Kadesh and impress his neighbors."),
            zh = LocalizedContent("哪位埃及法老下令建造了阿布辛贝神庙？", listOf("胡夫", "拉美西斯二世", "图特摩斯三世", "阿肯那顿"), "历史", "拉美西斯二世是埃及最著名的法老之一，于公元前13世纪建造了阿布辛贝神庙，以庆祝卡迭石战役的胜利并震慑邻国。"),
            es = LocalizedContent("¿Qué rey egipcio ordenó el templo de Abu Simbel?", listOf("Keops", "Ramsés II", "Tutmosis III", "Akenatón"), "Historia", "Ramsés II, uno de los faraones más famosos de Egipto, mandó construir el templo de Abu Simbel en el siglo XIII a.C. para celebrar su victoria en la batalla de Qadesh e impresionar a sus vecinos.")
        ),
        BilingualQuestion(
            id = 12272, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La civilisation minoenne a atteint son apogée vers?", listOf("1600 av. J.-C.", "1400 av. J.-C.", "1200 av. J.-C.", "1000 av. J.-C."), "Histoire", "L'apogée de la civilisation minoenne, vers 1600 av. J.-C., correspond à la période des premiers palais et de l'expansion commerciale en Méditerranée."),
            en = LocalizedContent("The Minoan civilization reached its peak around?", listOf("1600 BC", "1400 BC", "1200 BC", "1000 BC"), "History", "The peak of the Minoan civilization, around 1600 BC, corresponds to the period of the first palaces and commercial expansion in the Mediterranean."),
            zh = LocalizedContent("米诺斯文明在何时达到鼎盛？", listOf("公元前1600年", "公元前1400年", "公元前1200年", "公元前1000年"), "历史", "米诺斯文明在公元前1600年左右达到鼎盛，对应第一批宫殿和地中海商业扩张时期。"),
            es = LocalizedContent("¿La civilización minoica alcanzó su apogeo hacia?", listOf("1600 a.C.", "1400 a.C.", "1200 a.C.", "1000 a.C."), "Historia", "El apogeo de la civilización minoica, hacia 1600 a.C., corresponde al período de los primeros palacios y la expansión comercial en el Mediterráneo.")
        ),
        BilingualQuestion(
            id = 12273, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Les Jeux Olympiques antiques se déroulaient tous les?", listOf("2 ans", "3 ans", "4 ans", "5 ans"), "Histoire", "Les Jeux Olympiques antiques, organisés à Olympie en l'honneur de Zeus, avaient lieu tous les quatre ans, une période appelée olympiade."),
            en = LocalizedContent("The ancient Olympic Games were held every?", listOf("2 years", "3 years", "4 years", "5 years"), "History", "The ancient Olympic Games, held at Olympia in honor of Zeus, took place every four years, a period called an Olympiad."),
            zh = LocalizedContent("古代奥运会每几年举办一次？", listOf("2年", "3年", "4年", "5年"), "历史", "古代奥运会在奥林匹亚举行，以纪念宙斯，每四年举办一次，这个周期称为奥林匹亚德。"),
            es = LocalizedContent("¿Los Juegos Olímpicos antiguos se celebraban cada?", listOf("2 años", "3 años", "4 años", "5 años"), "Historia", "Los Juegos Olímpicos antiguos, celebrados en Olimpia en honor a Zeus, tenían lugar cada cuatro años, un período llamado Olimpiada.")
        ),
        BilingualQuestion(
            id = 12274, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le Colosseum romain a été achevé en?", listOf("70 apr. J.-C.", "80 apr. J.-C.", "90 apr. J.-C.", "100 apr. J.-C."), "Histoire", "Le Colisée, commandé par l'empereur Vespasien, fut inauguré en 80 apr. J.-C. par son fils Titus, après environ dix ans de construction."),
            en = LocalizedContent("The Roman Colosseum was completed in?", listOf("70 AD", "80 AD", "90 AD", "100 AD"), "History", "The Colosseum, commissioned by Emperor Vespasian, was inaugurated in 80 AD by his son Titus, after about ten years of construction."),
            zh = LocalizedContent("罗马斗兽场于何时竣工？", listOf("公元70年", "公元80年", "公元90年", "公元100年"), "历史", "斗兽场由皇帝韦斯巴芗下令建造，于公元80年由其子提图斯揭幕，建造历时约十年。"),
            es = LocalizedContent("¿El Coliseo romano se completó en?", listOf("70 d.C.", "80 d.C.", "90 d.C.", "100 d.C."), "Historia", "El Coliseo, encargado por el emperador Vespasiano, fue inaugurado en el año 80 d.C. por su hijo Tito, tras unos diez años de construcción.")
        ),
        BilingualQuestion(
            id = 12275, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Pax Romana a duré environ?", listOf("100 ans", "150 ans", "200 ans", "300 ans"), "Histoire", "La Pax Romana, période de paix et de stabilité relative dans l'Empire romain, a débuté sous Auguste en 27 av. J.-C. et s'est achevée avec la mort de Marc Aurèle en 180 apr. J.-C., soit environ 200 ans."),
            en = LocalizedContent("The Pax Romana lasted about?", listOf("100 years", "150 years", "200 years", "300 years"), "History", "The Pax Romana, a period of relative peace and stability in the Roman Empire, began under Augustus in 27 BC and ended with the death of Marcus Aurelius in 180 AD, about 200 years."),
            zh = LocalizedContent("罗马和平持续了大约？", listOf("100年", "150年", "200年", "300年"), "历史", "罗马和平是罗马帝国相对和平稳定的时期，始于公元前27年奥古斯都统治，结束于公元180年马可·奥勒留去世，约200年。"),
            es = LocalizedContent("¿La Pax Romana duró aproximadamente?", listOf("100 años", "150 años", "200 años", "300 años"), "Historia", "La Pax Romana, un período de relativa paz y estabilidad en el Imperio romano, comenzó bajo Augusto en el 27 a.C. y terminó con la muerte de Marco Aurelio en el 180 d.C., unos 200 años.")
        ),
        BilingualQuestion(
            id = 12276, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'empire byzantin a duré?", listOf("500 ans", "700 ans", "1000 ans", "1200 ans"), "Histoire", "L'Empire byzantin a perduré environ mille ans, de la fondation de Constantinople en 330 jusqu'à sa chute en 1453, ce qui en fait l'un des empires les plus durables de l'histoire."),
            en = LocalizedContent("The Byzantine Empire lasted?", listOf("500 years", "700 years", "1000 years", "1200 years"), "History", "The Byzantine Empire lasted about a thousand years, from the founding of Constantinople in 330 until its fall in 1453, making it one of the most enduring empires in history."),
            zh = LocalizedContent("拜占庭帝国持续了？", listOf("500年", "700年", "1000年", "1200年"), "历史", "拜占庭帝国持续了约一千年，从公元330年君士坦丁堡建城到1453年陷落，是历史上最持久的帝国之一。"),
            es = LocalizedContent("¿El Imperio bizantino duró?", listOf("500 años", "700 años", "1000 años", "1200 años"), "Historia", "El Imperio bizantino perduró aproximadamente mil años, desde la fundación de Constantinopla en el 330 hasta su caída en 1453, lo que lo convierte en uno de los imperios más duraderos de la historia.")
        ),
        BilingualQuestion(
            id = 12277, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Califat Abbasside a été établi en?", listOf("622", "750", "800", "850"), "Histoire", "La dynastie Abbasside a pris le pouvoir en 750 après avoir renversé les Omeyyades lors de la révolution abbasside, marquant le début d'un âge d'or islamique centré à Bagdad."),
            en = LocalizedContent("The Abbasid Caliphate was established in?", listOf("622", "750", "800", "850"), "History", "The Abbasid dynasty took power in 750 after overthrowing the Umayyads in the Abbasid Revolution, marking the beginning of an Islamic golden age centered in Baghdad."),
            zh = LocalizedContent("阿拔斯哈里发国建立于？", listOf("622年", "750年", "800年", "850年"), "历史", "阿拔斯王朝在750年通过阿拔斯革命推翻倭马亚王朝后掌权，标志着以巴格达为中心的伊斯兰黄金时代的开始。"),
            es = LocalizedContent("¿El Califato Abasí se estableció en?", listOf("622", "750", "800", "850"), "Historia", "La dinastía abasí tomó el poder en el año 750 tras derrocar a los omeyas en la revolución abasí, marcando el inicio de una edad de oro islámica centrada en Bagdad.")
        ),
        BilingualQuestion(
            id = 12278, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel émir andalou a fondé Cordoue?", listOf("Abd al-Rahman I", "Abd al-Rahman III", "Al-Hakam II", "Hisham III"), "Histoire", "Abd al-Rahman Ier, dernier prince omeyyade rescapé du massacre de sa famille, a fondé l'émirat de Cordoue en 756 après avoir fui Damas."),
            en = LocalizedContent("Which Andalusian emir founded Cordoba?", listOf("Abd al-Rahman I", "Abd al-Rahman III", "Al-Hakam II", "Hisham III"), "History", "Abd al-Rahman I, the last surviving Umayyad prince after the massacre of his family, founded the Emirate of Cordoba in 756 after fleeing Damascus."),
            zh = LocalizedContent("哪位安达卢西亚埃米尔建立了科尔多瓦？", listOf("阿卜杜勒·拉赫曼一世", "阿卜杜勒·拉赫曼三世", "哈卡姆二世", "希沙姆三世"), "历史", "阿卜杜勒·拉赫曼一世是倭马亚家族屠杀后幸存的最后一位王子，于756年逃离大马士革后建立了科尔多瓦埃米尔国。"),
            es = LocalizedContent("¿Qué emir andalusí fundó Córdoba?", listOf("Abd al-Rahman I", "Abd al-Rahman III", "Al-Hakam II", "Hisham III"), "Historia", "Abd al-Rahman I, el último príncipe omeya superviviente de la masacre de su familia, fundó el Emirato de Córdoba en 756 tras huir de Damasco.")
        ),
        BilingualQuestion(
            id = 12279, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La dynastie Song en Chine a duré?", listOf("200 ans", "300 ans", "350 ans", "400 ans"), "Histoire", "La dynastie Song a régné de 960 à 1279, soit environ 319 ans, souvent arrondi à 350 ans dans les quiz."),
            en = LocalizedContent("The Song dynasty in China lasted?", listOf("200 years", "300 years", "350 years", "400 years"), "History", "The Song dynasty ruled from 960 to 1279, about 319 years, often rounded to 350 years in quizzes."),
            zh = LocalizedContent("中国宋朝持续了多久？", listOf("200年", "300年", "350年", "400年"), "历史", "宋朝统治时间为960年至1279年，约319年，在测验中常四舍五入为350年。"),
            es = LocalizedContent("¿Cuánto duró la dinastía Song en China?", listOf("200 años", "300 años", "350 años", "400 años"), "Historia", "La dinastía Song gobernó desde 960 hasta 1279, unos 319 años, a menudo redondeado a 350 años en los cuestionarios.")
        ),
        BilingualQuestion(
            id = 12280, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'Inquisition espagnole a commencé en?", listOf("1478", "1492", "1500", "1520"), "Histoire", "Les Rois catholiques, Ferdinand d'Aragon et Isabelle de Castille, ont obtenu l'autorisation du pape Sixte IV en 1478 pour établir l'Inquisition en Espagne, visant à maintenir l'orthodoxie catholique."),
            en = LocalizedContent("The Spanish Inquisition began in?", listOf("1478", "1492", "1500", "1520"), "History", "The Catholic Monarchs, Ferdinand of Aragon and Isabella of Castile, obtained papal authorization from Pope Sixtus IV in 1478 to establish the Inquisition in Spain, aimed at maintaining Catholic orthodoxy."),
            zh = LocalizedContent("西班牙宗教裁判所始于哪一年？", listOf("1478年", "1492年", "1500年", "1520年"), "历史", "天主教双王阿拉贡的费迪南德和卡斯蒂利亚的伊莎贝拉于1478年获得教皇西克斯图斯四世的授权，在西班牙建立宗教裁判所，旨在维护天主教正统。"),
            es = LocalizedContent("¿En qué año comenzó la Inquisición española?", listOf("1478", "1492", "1500", "1520"), "Historia", "Los Reyes Católicos, Fernando de Aragón e Isabel de Castilla, obtuvieron la autorización papal del Papa Sixto IV en 1478 para establecer la Inquisición en España, con el objetivo de mantener la ortodoxia católica.")
        ),
        BilingualQuestion(
            id = 12281, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Siège de Jérusalem (Croisade) a eu lieu en?", listOf("1095", "1099", "1187", "1204"), "Histoire", "Le Siège de Jérusalem en 1099 marque l'apogée de la Première Croisade, lorsque les croisés prirent la ville aux Fatimides après un siège d'un mois."),
            en = LocalizedContent("The Siege of Jerusalem (Crusade) took place in?", listOf("1095", "1099", "1187", "1204"), "History", "The Siege of Jerusalem in 1099 marked the culmination of the First Crusade, when the crusaders captured the city from the Fatimids after a month-long siege."),
            zh = LocalizedContent("耶路撒冷围城战（十字军）发生在哪一年？", listOf("1095年", "1099年", "1187年", "1204年"), "历史", "1099年的耶路撒冷围城战标志着第一次十字军东征的高潮，十字军经过一个月的围攻从法蒂玛王朝手中夺取了该城。"),
            es = LocalizedContent("¿En qué año tuvo lugar el Sitio de Jerusalén (Cruzada)?", listOf("1095", "1099", "1187", "1204"), "Historia", "El Sitio de Jerusalén en 1099 marcó la culminación de la Primera Cruzada, cuando los cruzados capturaron la ciudad de los fatimíes tras un asedio de un mes.")
        ),
        BilingualQuestion(
            id = 12282, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La Réforme protestante a commencé en?", listOf("1500", "1517", "1530", "1545"), "Histoire", "Martin Luther afficha ses 95 thèses contre les indulgences en 1517 à Wittenberg, acte fondateur de la Réforme protestante."),
            en = LocalizedContent("The Protestant Reformation began in?", listOf("1500", "1517", "1530", "1545"), "History", "Martin Luther posted his 95 Theses against indulgences in 1517 in Wittenberg, the founding act of the Protestant Reformation."),
            zh = LocalizedContent("宗教改革始于哪一年？", listOf("1500年", "1517年", "1530年", "1545年"), "历史", "马丁·路德于1517年在维滕贝格张贴了反对赎罪券的《九十五条论纲》，这是宗教改革的奠基之举。"),
            es = LocalizedContent("¿En qué año comenzó la Reforma protestante?", listOf("1500", "1517", "1530", "1545"), "Historia", "Martín Lutero publicó sus 95 tesis contra las indulgencias en 1517 en Wittenberg, acto fundacional de la Reforma protestante.")
        ),
        BilingualQuestion(
            id = 12283, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel roi français a épousé Catherine de Médicis?", listOf("François Ier", "Henri II", "Henri III", "Henri IV"), "Histoire", "Henri II épousa Catherine de Médicis en 1533, une union diplomatique renforçant les liens entre la France et la puissante famille italienne des Médicis."),
            en = LocalizedContent("Which French king married Catherine de' Medici?", listOf("Francis I", "Henry II", "Henry III", "Henry IV"), "History", "Henry II married Catherine de' Medici in 1533, a diplomatic union strengthening ties between France and the powerful Italian Medici family."),
            zh = LocalizedContent("哪位法国国王娶了凯瑟琳·德·美第奇？", listOf("弗朗索瓦一世", "亨利二世", "亨利三世", "亨利四世"), "历史", "亨利二世于1533年与凯瑟琳·德·美第奇结婚，这是一场加强法国与强大的意大利美第奇家族关系的政治联姻。"),
            es = LocalizedContent("¿Qué rey francés se casó con Catalina de Médici?", listOf("Francisco I", "Enrique II", "Enrique III", "Enrique IV"), "Historia", "Enrique II se casó con Catalina de Médici en 1533, una unión diplomática que fortaleció los lazos entre Francia y la poderosa familia italiana de los Médici.")
        ),
        BilingualQuestion(
            id = 12284, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La chute de l'Alcazar de Tolède a eu lieu en?", listOf("1532", "1550", "1572", "1600"), "Histoire", "La chute de l'Alcazar de Tolède en 1572 marque la fin de la domination musulmane dans cette forteresse, lors de la révolte des Morisques contre Philippe II."),
            en = LocalizedContent("The fall of the Alcázar of Toledo took place in?", listOf("1532", "1550", "1572", "1600"), "History", "The fall of the Alcázar of Toledo in 1572 marked the end of Muslim domination in that fortress, during the Morisco revolt against Philip II."),
            zh = LocalizedContent("托莱多城堡陷落发生在哪一年？", listOf("1532年", "1550年", "1572年", "1600年"), "历史", "1572年托莱多城堡的陷落标志着穆斯林对该堡垒统治的结束，发生在摩里斯科人反抗腓力二世的起义期间。"),
            es = LocalizedContent("¿En qué año ocurrió la caída del Alcázar de Toledo?", listOf("1532", "1550", "1572", "1600"), "Historia", "La caída del Alcázar de Toledo en 1572 marcó el fin del dominio musulmán en esa fortaleza, durante la revuelta de los moriscos contra Felipe II.")
        ),
        BilingualQuestion(
            id = 12285, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Nuit de la Saint-Barthélemy a eu lieu en?", listOf("1572", "1573", "1580", "1590"), "Histoire", "Le massacre des protestants par les catholiques à Paris a débuté le 24 août 1572, pendant les guerres de religion en France."),
            en = LocalizedContent("The St. Bartholomew's Day Massacre took place in?", listOf("1572", "1573", "1580", "1590"), "History", "The massacre of Protestants by Catholics in Paris began on August 24, 1572, during the French Wars of Religion."),
            zh = LocalizedContent("圣巴托罗缪大屠杀发生在哪一年？", listOf("1572年", "1573年", "1580年", "1590年"), "历史", "天主教徒在巴黎对新教徒的大屠杀始于1572年8月24日，发生在法国宗教战争期间。"),
            es = LocalizedContent("¿En qué año ocurrió la Matanza de San Bartolomé?", listOf("1572", "1573", "1580", "1590"), "Historia", "La masacre de protestantes por católicos en París comenzó el 24 de agosto de 1572, durante las guerras de religión en Francia.")
        ),
        BilingualQuestion(
            id = 12286, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La bataille des Trente a eu lieu en?", listOf("1340", "1350", "1360", "1370"), "Histoire", "La bataille des Trente opposa trente chevaliers français à trente chevaliers anglo-bretons en 1350, pendant la guerre de Succession de Bretagne."),
            en = LocalizedContent("The Battle of the Thirty took place in?", listOf("1340", "1350", "1360", "1370"), "History", "The Battle of the Thirty pitted thirty French knights against thirty Anglo-Breton knights in 1350, during the War of the Breton Succession."),
            zh = LocalizedContent("三十人战役发生在哪一年？", listOf("1340年", "1350年", "1360年", "1370年"), "历史", "三十人战役于1350年发生，三十名法国骑士对阵三十名英布列塔尼骑士，发生在布列塔尼继承战争期间。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Batalla de los Treinta?", listOf("1340", "1350", "1360", "1370"), "Historia", "La Batalla de los Treinta enfrentó a treinta caballeros franceses contra treinta caballeros anglo-bretones en 1350, durante la Guerra de Sucesión Bretona.")
        ),
        BilingualQuestion(
            id = 12287, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel roi ottoman a pris Constantinople?", listOf("Murad II", "Mehmed II", "Bajazet II", "Suleiman I"), "Histoire", "Mehmed II, surnommé le Conquérant, a pris Constantinople en 1453, mettant fin à l'Empire byzantin et faisant de la ville la nouvelle capitale ottomane."),
            en = LocalizedContent("Which Ottoman sultan conquered Constantinople?", listOf("Murad II", "Mehmed II", "Bayezid II", "Suleiman I"), "History", "Mehmed II, surnamed the Conqueror, conquered Constantinople in 1453, ending the Byzantine Empire and making the city the new Ottoman capital."),
            zh = LocalizedContent("哪位奥斯曼苏丹征服了君士坦丁堡？", listOf("穆拉德二世", "穆罕默德二世", "巴耶济德二世", "苏莱曼一世"), "历史", "穆罕默德二世，绰号征服者，于1453年征服君士坦丁堡，结束了拜占庭帝国，并将该城作为奥斯曼帝国的新首都。"),
            es = LocalizedContent("¿Qué sultán otomano conquistó Constantinopla?", listOf("Murad II", "Mehmed II", "Bayaceto II", "Solimán I"), "Historia", "Mehmed II, apodado el Conquistador, conquistó Constantinopla en 1453, poniendo fin al Imperio bizantino y convirtiendo la ciudad en la nueva capital otomana.")
        ),
        BilingualQuestion(
            id = 12288, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Paix d'Augsbourg a été signée en?", listOf("1545", "1555", "1560", "1570"), "Histoire", "La Paix d'Augsbourg, signée en 1555, mit fin aux conflits religieux entre catholiques et luthériens dans le Saint-Empire romain germanique en établissant le principe \"cujus regio, ejus religio\"."),
            en = LocalizedContent("The Peace of Augsburg was signed in?", listOf("1545", "1555", "1560", "1570"), "History", "The Peace of Augsburg, signed in 1555, ended religious conflicts between Catholics and Lutherans in the Holy Roman Empire by establishing the principle 'cuius regio, eius religio'."),
            zh = LocalizedContent("奥格斯堡和约签署于哪一年？", listOf("1545年", "1555年", "1560年", "1570年"), "历史", "1555年签署的奥格斯堡和约结束了神圣罗马帝国内天主教徒和路德宗之间的宗教冲突，确立了“教随国定”的原则。"),
            es = LocalizedContent("¿En qué año se firmó la Paz de Augsburgo?", listOf("1545", "1555", "1560", "1570"), "Historia", "La Paz de Augsburgo, firmada en 1555, puso fin a los conflictos religiosos entre católicos y luteranos en el Sacro Imperio Romano Germánico al establecer el principio 'cuius regio, eius religio'.")
        ),
        BilingualQuestion(
            id = 12289, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le régime de Vichy en France a duré?", listOf("2 ans", "3 ans", "4 ans", "5 ans"), "Histoire", "Le régime de Vichy, dirigé par le maréchal Pétain, a été établi après la défaite de 1940 et a pris fin avec la Libération en 1944."),
            en = LocalizedContent("The Vichy regime in France lasted?", listOf("2 years", "3 years", "4 years", "5 years"), "History", "The Vichy regime, led by Marshal Pétain, was established after the defeat of 1940 and ended with the Liberation in 1944."),
            zh = LocalizedContent("法国维希政权持续了多久？", listOf("2年", "3年", "4年", "5年"), "历史", "维希政权由贝当元帅领导，在1940年法国战败后建立，于1944年解放时结束。"),
            es = LocalizedContent("¿Cuánto duró el régimen de Vichy en Francia?", listOf("2 años", "3 años", "4 años", "5 años"), "Historia", "El régimen de Vichy, liderado por el mariscal Pétain, se estableció tras la derrota de 1940 y finalizó con la Liberación en 1944.")
        ),
        BilingualQuestion(
            id = 12290, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Doctrine Monroe a été proclamée en?", listOf("1815", "1823", "1830", "1845"), "Histoire", "Le président américain James Monroe a énoncé cette doctrine dans son message annuel au Congrès le 2 décembre 1823, afin de contrer l'influence européenne dans les Amériques."),
            en = LocalizedContent("The Monroe Doctrine was proclaimed in?", listOf("1815", "1823", "1830", "1845"), "History", "U.S. President James Monroe enunciated this doctrine in his annual message to Congress on December 2, 1823, to counter European influence in the Americas."),
            zh = LocalizedContent("门罗主义是在哪一年宣布的？", listOf("1815年", "1823年", "1830年", "1845年"), "历史", "美国总统詹姆斯·门罗在1823年12月2日向国会提交的年度咨文中阐述了这一主义，旨在抵制欧洲在美洲的影响。"),
            es = LocalizedContent("¿En qué año se proclamó la Doctrina Monroe?", listOf("1815", "1823", "1830", "1845"), "Historia", "El presidente estadounidense James Monroe enunció esta doctrina en su mensaje anual al Congreso el 2 de diciembre de 1823, para contrarrestar la influencia europea en las Américas.")
        ),
        BilingualQuestion(
            id = 12291, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La côte est la plus longue du monde s'étend sur?", listOf("100 000 km", "150 000 km", "200 000 km", "250 000 km"), "Géographie", "La côte norvégienne, incluant ses fjords et ses milliers d'îles, atteint environ 150 000 km, ce qui en fait la plus longue du monde."),
            en = LocalizedContent("The longest coastline in the world extends over?", listOf("100,000 km", "150,000 km", "200,000 km", "250,000 km"), "Geography", "The Norwegian coastline, including its fjords and thousands of islands, reaches about 150,000 km, making it the longest in the world."),
            zh = LocalizedContent("世界上最长的海岸线延伸多少公里？", listOf("10万公里", "15万公里", "20万公里", "25万公里"), "地理", "挪威的海岸线，包括其峡湾和数千个岛屿，长约15万公里，是世界上最长的海岸线。"),
            es = LocalizedContent("¿Cuánto mide la costa más larga del mundo?", listOf("100 000 km", "150 000 km", "200 000 km", "250 000 km"), "Geografia", "La costa noruega, incluyendo sus fiordos y miles de islas, alcanza unos 150 000 km, lo que la convierte en la más larga del mundo.")
        ),
        BilingualQuestion(
            id = 12292, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays comporte le plus grand nombre de volcans actifs?", listOf("Japon", "Indonésie", "Philippines", "Italie"), "Géographie", "L'Indonésie se situe sur la ceinture de feu du Pacifique, une zone de forte activité tectonique, ce qui lui confère plus de 130 volcans actifs, le plus grand nombre au monde."),
            en = LocalizedContent("Which country has the largest number of active volcanoes?", listOf("Japan", "Indonesia", "Philippines", "Italy"), "Geography", "Indonesia lies on the Pacific Ring of Fire, an area of high tectonic activity, giving it over 130 active volcanoes, the most in the world."),
            zh = LocalizedContent("哪个国家拥有最多的活火山？", listOf("日本", "印度尼西亚", "菲律宾", "意大利"), "地理", "印度尼西亚位于太平洋火环上，这是一个地壳活动频繁的区域，拥有超过130座活火山，数量居世界之首。"),
            es = LocalizedContent("¿Qué país tiene el mayor número de volcanes activos?", listOf("Japón", "Indonesia", "Filipinas", "Italia"), "Geografia", "Indonesia se encuentra en el Cinturón de Fuego del Pacífico, una zona de alta actividad tectónica, lo que le otorga más de 130 volcanes activos, la mayor cantidad del mundo.")
        ),
        BilingualQuestion(
            id = 12293, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La faille de San Andreas se trouve en?", listOf("Californie", "Mexico", "Chili", "Japon"), "Géographie", "La faille de San Andreas est une faille transformante majeure située en Californie, aux États-Unis, marquant la limite entre les plaques tectoniques pacifique et nord-américaine."),
            en = LocalizedContent("The San Andreas Fault is located in?", listOf("California", "Mexico", "Chile", "Japan"), "Geography", "The San Andreas Fault is a major transform fault located in California, USA, marking the boundary between the Pacific and North American tectonic plates."),
            zh = LocalizedContent("圣安德烈亚斯断层位于哪里？", listOf("加利福尼亚", "墨西哥", "智利", "日本"), "地理", "圣安德烈亚斯断层是一条主要的转换断层，位于美国加利福尼亚州，标志着太平洋板块和北美板块之间的边界。"),
            es = LocalizedContent("¿Dónde se encuentra la falla de San Andrés?", listOf("California", "México", "Chile", "Japón"), "Geografia", "La falla de San Andrés es una falla transformante importante ubicada en California, EE. UU., que marca el límite entre las placas tectónicas del Pacífico y Norteamericana.")
        ),
        BilingualQuestion(
            id = 12294, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le détroit de Béring sépare quel continent de quel continent?", listOf("Asie et Amérique du Nord", "Asie et Océanie", "Océanie et Amérique", "Amérique du Nord et Amérique du Sud"), "Géographie", "Le détroit de Béring sépare la pointe orientale de la Russie (Asie) de la pointe occidentale de l'Alaska (Amérique du Nord)."),
            en = LocalizedContent("The Bering Strait separates which continent from which continent?", listOf("Asia and North America", "Asia and Oceania", "Oceania and America", "North America and South America"), "Geography", "The Bering Strait separates the eastern tip of Russia (Asia) from the western tip of Alaska (North America)."),
            zh = LocalizedContent("白令海峡分隔哪两个大洲？", listOf("亚洲和北美洲", "亚洲和大洋洲", "大洋洲和美洲", "北美洲和南美洲"), "地理", "白令海峡分隔俄罗斯的东端（亚洲）和阿拉斯加的西端（北美洲）。"),
            es = LocalizedContent("¿Qué continentes separa el estrecho de Bering?", listOf("Asia y América del Norte", "Asia y Oceanía", "Oceanía y América", "América del Norte y América del Sur"), "Geografia", "El estrecho de Bering separa el extremo oriental de Rusia (Asia) del extremo occidental de Alaska (América del Norte).")
        ),
        BilingualQuestion(
            id = 12295, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le lac le plus grand du monde?", listOf("Lac Baïkal", "Lac Baïkal", "Lac Supérieur", "Lac Caspien"), "Géographie", "Le lac Caspien est considéré comme le plus grand lac du monde avec une superficie d'environ 371 000 km², bien qu'il soit salé et souvent qualifié de mer intérieure."),
            en = LocalizedContent("What is the largest lake in the world?", listOf("Lake Baikal", "Lake Baikal", "Lake Superior", "Caspian Sea"), "Geography", "The Caspian Sea is considered the largest lake in the world with an area of about 371,000 km², although it is saline and often referred to as an inland sea."),
            zh = LocalizedContent("世界上最大的湖泊是哪个？", listOf("贝加尔湖", "贝加尔湖", "苏必利尔湖", "里海"), "地理", "里海被认为是世界上最大的湖泊，面积约37.1万平方公里，尽管它是咸水湖，常被称为内陆海。"),
            es = LocalizedContent("¿Cuál es el lago más grande del mundo?", listOf("Lago Baikal", "Lago Baikal", "Lago Superior", "Mar Caspio"), "Geografia", "El mar Caspio es considerado el lago más grande del mundo con una superficie de aproximadamente 371 000 km², aunque es salado y a menudo se le llama mar interior.")
        ),
        BilingualQuestion(
            id = 12296, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'Île de Terre-Neuve appartient à quel pays?", listOf("États-Unis", "Canada", "Royaume-Uni", "Danemark"), "Géographie", "Terre-Neuve est une province du Canada depuis 1949, après avoir été une colonie britannique."),
            en = LocalizedContent("The island of Newfoundland belongs to which country?", listOf("United States", "Canada", "United Kingdom", "Denmark"), "Geography", "Newfoundland has been a province of Canada since 1949, after being a British colony."),
            zh = LocalizedContent("纽芬兰岛属于哪个国家？", listOf("美国", "加拿大", "英国", "丹麦"), "地理", "纽芬兰自1949年起成为加拿大的一個省份，此前是英国殖民地。"),
            es = LocalizedContent("¿A qué país pertenece la isla de Terranova?", listOf("Estados Unidos", "Canadá", "Reino Unido", "Dinamarca"), "Geografia", "Terranova es una provincia de Canadá desde 1949, después de haber sido una colonia británica.")
        ),
        BilingualQuestion(
            id = 12297, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le détroit de Malacca relie quel océan à quel océan?", listOf("Indien et Pacifique", "Atlantique et Indien", "Atlantique et Pacifique", "Arctique et Atlantique"), "Géographie", "Le détroit de Malacca, situé entre la Malaisie et l'Indonésie, est une voie maritime majeure reliant l'océan Indien à l'océan Pacifique."),
            en = LocalizedContent("The Strait of Malacca connects which ocean to which ocean?", listOf("Indian and Pacific", "Atlantic and Indian", "Atlantic and Pacific", "Arctic and Atlantic"), "Geography", "The Strait of Malacca, located between Malaysia and Indonesia, is a major maritime route connecting the Indian Ocean to the Pacific Ocean."),
            zh = LocalizedContent("马六甲海峡连接哪两个大洋？", listOf("印度洋和太平洋", "大西洋和印度洋", "大西洋和太平洋", "北冰洋和大西洋"), "地理", "马六甲海峡位于马来西亚和印度尼西亚之间，是连接印度洋和太平洋的重要海上通道。"),
            es = LocalizedContent("¿Qué océanos conecta el estrecho de Malaca?", listOf("Índico y Pacífico", "Atlántico e Índico", "Atlántico y Pacífico", "Ártico y Atlántico"), "Geografia", "El estrecho de Malaca, situado entre Malasia e Indonesia, es una importante vía marítima que conecta el océano Índico con el océano Pacífico.")
        ),
        BilingualQuestion(
            id = 12298, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La barrière de corail la plus grande du monde est en?", listOf("Pacifique nord", "Mer Rouge", "Australie", "Caraïbes"), "Géographie", "La Grande Barrière de corail, située au large de la côte nord-est de l'Australie, est le plus grand récif corallien du monde, s'étendant sur plus de 2 300 kilomètres."),
            en = LocalizedContent("The largest coral reef in the world is in?", listOf("North Pacific", "Red Sea", "Australia", "Caribbean"), "Geography", "The Great Barrier Reef, located off the northeast coast of Australia, is the world's largest coral reef system, stretching over 2,300 kilometers."),
            zh = LocalizedContent("世界上最大的珊瑚礁位于哪里？", listOf("北太平洋", "红海", "澳大利亚", "加勒比海"), "地理", "大堡礁位于澳大利亚东北海岸外，是世界上最大的珊瑚礁系统，绵延超过2300公里。"),
            es = LocalizedContent("¿Dónde se encuentra el arrecife de coral más grande del mundo?", listOf("Pacífico norte", "Mar Rojo", "Australia", "Caribe"), "Geografia", "La Gran Barrera de Coral, situada frente a la costa noreste de Australia, es el sistema de arrecifes de coral más grande del mundo, extendiéndose por más de 2.300 kilómetros.")
        ),
        BilingualQuestion(
            id = 12299, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand golfe du monde?", listOf("Golfe du Mexique", "Golfe Persique", "Golfe du Bengale", "Golfe de Thaïlande"), "Géographie", "Le golfe Persique, avec une superficie d'environ 251 000 km², est le plus grand golfe du monde, bordé par plusieurs pays du Moyen-Orient."),
            en = LocalizedContent("What is the largest gulf in the world?", listOf("Gulf of Mexico", "Persian Gulf", "Bay of Bengal", "Gulf of Thailand"), "Geography", "The Persian Gulf, with an area of about 251,000 km², is the largest gulf in the world, bordered by several Middle Eastern countries."),
            zh = LocalizedContent("世界上最大的海湾是哪个？", listOf("墨西哥湾", "波斯湾", "孟加拉湾", "泰国湾"), "地理", "波斯湾面积约25.1万平方公里，是世界上最大的海湾，被多个中东国家环绕。"),
            es = LocalizedContent("¿Cuál es el golfo más grande del mundo?", listOf("Golfo de México", "Golfo Pérsico", "Golfo de Bengala", "Golfo de Tailandia"), "Geografía", "El Golfo Pérsico, con una superficie de aproximadamente 251 000 km², es el golfo más grande del mundo, bordeado por varios países de Oriente Medio.")
        ),
        BilingualQuestion(
            id = 12300, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Baie de Hudson appartient à quel pays?", listOf("États-Unis", "Canada", "Groenland", "Russie"), "Géographie", "La baie d'Hudson est une vaste mer intérieure située dans le nord-est du Canada, bordée par les provinces du Manitoba, de l'Ontario et du Québec, ainsi que par le Nunavut."),
            en = LocalizedContent("Hudson Bay belongs to which country?", listOf("United States", "Canada", "Greenland", "Russia"), "Geography", "Hudson Bay is a vast inland sea located in northeastern Canada, bordered by the provinces of Manitoba, Ontario, and Quebec, as well as Nunavut."),
            zh = LocalizedContent("哈德逊湾属于哪个国家？", listOf("美国", "加拿大", "格陵兰", "俄罗斯"), "地理", "哈德逊湾是位于加拿大东北部的一个广阔内海，被马尼托巴省、安大略省、魁北克省以及努纳武特地区环绕。"),
            es = LocalizedContent("¿La Bahía de Hudson pertenece a qué país?", listOf("Estados Unidos", "Canadá", "Groenlandia", "Rusia"), "Geografía", "La Bahía de Hudson es un vasto mar interior ubicado en el noreste de Canadá, bordeado por las provincias de Manitoba, Ontario y Quebec, así como por Nunavut.")
        ),
        BilingualQuestion(
            id = 12301, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel récif de corail s'étend sur plus de 2000 km?", listOf("Belize Reef", "Great Barrier Reef", "Florida Keys", "Mesoamerican Reef"), "Géographie", "La Grande Barrière de corail, au large de l'Australie, est le plus grand système récifal du monde, s'étendant sur environ 2300 kilomètres."),
            en = LocalizedContent("Which coral reef stretches over 2000 km?", listOf("Belize Reef", "Great Barrier Reef", "Florida Keys", "Mesoamerican Reef"), "Geography", "The Great Barrier Reef, off the coast of Australia, is the largest reef system in the world, extending about 2300 kilometers."),
            zh = LocalizedContent("哪个珊瑚礁延伸超过2000公里？", listOf("伯利兹堡礁", "大堡礁", "佛罗里达礁岛群", "中美洲堡礁"), "地理", "大堡礁位于澳大利亚海岸外，是世界上最大的珊瑚礁系统，延伸约2300公里。"),
            es = LocalizedContent("¿Qué arrecife de coral se extiende más de 2000 km?", listOf("Arrecife de Belice", "Gran Barrera de Coral", "Cayos de Florida", "Arrecife Mesoamericano"), "Geografía", "La Gran Barrera de Coral, frente a la costa de Australia, es el sistema de arrecifes más grande del mundo, extendiéndose aproximadamente 2300 kilómetros.")
        ),
        BilingualQuestion(
            id = 12302, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Péninsule arabique couvre environ combien de km²?", listOf("2 millions", "2.5 millions", "3 millions", "3.5 millions"), "Géographie", "La péninsule arabique, plus grande péninsule du monde, s'étend sur environ 3 millions de km², incluant des pays comme l'Arabie saoudite, le Yémen et Oman."),
            en = LocalizedContent("The Arabian Peninsula covers approximately how many km²?", listOf("2 million", "2.5 million", "3 million", "3.5 million"), "Geography", "The Arabian Peninsula, the largest peninsula in the world, covers about 3 million km², including countries like Saudi Arabia, Yemen, and Oman."),
            zh = LocalizedContent("阿拉伯半岛的面积大约是多少平方公里？", listOf("200万", "250万", "300万", "350万"), "地理", "阿拉伯半岛是世界上最大的半岛，面积约300万平方公里，包括沙特阿拉伯、也门和阿曼等国家。"),
            es = LocalizedContent("La Península Arábiga cubre aproximadamente ¿cuántos km²?", listOf("2 millones", "2.5 millones", "3 millones", "3.5 millones"), "Geografía", "La Península Arábiga, la península más grande del mundo, se extiende sobre unos 3 millones de km², incluyendo países como Arabia Saudita, Yemen y Omán.")
        ),
        BilingualQuestion(
            id = 12303, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a le plus long littoral côtier?", listOf("Canada", "Russie", "Fidji", "Suède"), "Géographie", "Avec plus de 1 100 îles, Fidji possède un littoral extrêmement découpé qui totalise environ 1 129 kilomètres, ce qui en fait le pays avec le plus long littoral côtier au monde."),
            en = LocalizedContent("Which country has the longest coastline?", listOf("Canada", "Russia", "Fiji", "Sweden"), "Geography", "With over 1,100 islands, Fiji has an extremely indented coastline totaling about 1,129 kilometers, making it the country with the longest coastline in the world."),
            zh = LocalizedContent("哪个国家的海岸线最长？", listOf("加拿大", "俄罗斯", "斐济", "瑞典"), "地理", "斐济拥有超过1100个岛屿，海岸线极其曲折，总长约1129公里，使其成为世界上海岸线最长的国家。"),
            es = LocalizedContent("¿Qué país tiene la costa más larga?", listOf("Canadá", "Rusia", "Fiyi", "Suecia"), "Geografía", "Con más de 1 100 islas, Fiyi tiene una costa extremadamente recortada que totaliza aproximadamente 1 129 kilómetros, lo que lo convierte en el país con la costa más larga del mundo.")
        ),
        BilingualQuestion(
            id = 12304, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La Malaisie est située en?", listOf("Asie du Sud", "Asie du Sud-Est", "Asie de l'Est", "Asie centrale"), "Géographie", "La Malaisie se trouve sur la péninsule Malaise et l'île de Bornéo, dans la région géographique de l'Asie du Sud-Est."),
            en = LocalizedContent("Malaysia is located in?", listOf("South Asia", "Southeast Asia", "East Asia", "Central Asia"), "Geography", "Malaysia is situated on the Malay Peninsula and the island of Borneo, in the geographical region of Southeast Asia."),
            zh = LocalizedContent("马来西亚位于？", listOf("南亚", "东南亚", "东亚", "中亚"), "地理", "马来西亚位于马来半岛和婆罗洲岛，属于东南亚地理区域。"),
            es = LocalizedContent("Malasia está ubicada en?", listOf("Asia del Sur", "Sudeste Asiático", "Asia Oriental", "Asia Central"), "Geografía", "Malasia se encuentra en la península malaya y la isla de Borneo, en la región geográfica del Sudeste Asiático.")
        ),
        BilingualQuestion(
            id = 12305, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le golfe d'Aden sépare quel pays de quel pays?", listOf("Oman et Djibouti", "Yémen et Somalie", "Somalie et Érythrée", "Djibouti et Érythrée"), "Géographie", "Le golfe d'Aden se situe entre la péninsule arabique et la Corne de l'Afrique, séparant le Yémen au nord de la Somalie au sud."),
            en = LocalizedContent("The Gulf of Aden separates which country from which country?", listOf("Oman and Djibouti", "Yemen and Somalia", "Somalia and Eritrea", "Djibouti and Eritrea"), "Geography", "The Gulf of Aden is located between the Arabian Peninsula and the Horn of Africa, separating Yemen to the north from Somalia to the south."),
            zh = LocalizedContent("亚丁湾分隔了哪两个国家？", listOf("阿曼和吉布提", "也门和索马里", "索马里和厄立特里亚", "吉布提和厄立特里亚"), "地理", "亚丁湾位于阿拉伯半岛和非洲之角之间，北部分隔也门，南部分隔索马里。"),
            es = LocalizedContent("El Golfo de Adén separa ¿qué país de qué país?", listOf("Omán y Yibuti", "Yemen y Somalia", "Somalia y Eritrea", "Yibuti y Eritrea"), "Geografía", "El Golfo de Adén se encuentra entre la Península Arábiga y el Cuerno de África, separando Yemen al norte de Somalia al sur.")
        ),
        BilingualQuestion(
            id = 12306, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel archipel s'étend sur plus de 1500 km de long?", listOf("Nouvelles-Hébrides", "Philippines", "Indonésie", "Japon"), "Géographie", "L'archipel des Philippines est composé de plus de 7 600 îles, s'étirant sur environ 1 800 kilomètres du nord au sud."),
            en = LocalizedContent("Which archipelago stretches over 1500 km in length?", listOf("New Hebrides", "Philippines", "Indonesia", "Japan"), "Geography", "The Philippine archipelago consists of over 7,600 islands, stretching about 1,800 kilometers from north to south."),
            zh = LocalizedContent("哪个群岛延伸超过1500公里？", listOf("新赫布里底群岛", "菲律宾", "印度尼西亚", "日本"), "地理", "菲律宾群岛由超过7600个岛屿组成，南北延伸约1800公里。"),
            es = LocalizedContent("¿Qué archipiélago se extiende más de 1500 km de largo?", listOf("Nuevas Hébridas", "Filipinas", "Indonesia", "Japón"), "Geografía", "El archipiélago de Filipinas está compuesto por más de 7 600 islas, extendiéndose aproximadamente 1 800 kilómetros de norte a sur.")
        ),
        BilingualQuestion(
            id = 12307, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le point le plus bas de la surface terrestre?", listOf("Mer Morte", "Lac d'Assal", "Dépression de Turpan", "Vallée de la Mort"), "Géographie", "La Mer Morte, située entre Israël et la Jordanie, se trouve à environ 430 mètres sous le niveau de la mer, ce qui en fait le point le plus bas de la surface terrestre."),
            en = LocalizedContent("What is the lowest point on Earth's surface?", listOf("Dead Sea", "Lake Assal", "Turpan Depression", "Death Valley"), "Geography", "The Dead Sea, located between Israel and Jordan, is about 430 meters below sea level, making it the lowest point on Earth's surface."),
            zh = LocalizedContent("地球表面的最低点是哪里？", listOf("死海", "阿萨勒湖", "吐鲁番盆地", "死亡谷"), "地理", "死海位于以色列和约旦之间，海拔约-430米，是地球表面的最低点。"),
            es = LocalizedContent("¿Cuál es el punto más bajo de la superficie terrestre?", listOf("Mar Muerto", "Lago Assal", "Depresión de Turpan", "Valle de la Muerte"), "Geografía", "El Mar Muerto, situado entre Israel y Jordania, se encuentra a unos 430 metros bajo el nivel del mar, lo que lo convierte en el punto más bajo de la superficie terrestre.")
        ),
        BilingualQuestion(
            id = 12308, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Kamtchatka est une péninsule de quel pays?", listOf("Japon", "Mandchourie", "Russie", "Mongolie"), "Géographie", "Le Kamtchatka se trouve dans l'Extrême-Orient russe, entre la mer d'Okhotsk et l'océan Pacifique. Cette péninsule volcanique fait partie de la fédération de Russie."),
            en = LocalizedContent("Kamchatka is a peninsula of which country?", listOf("Japan", "Manchuria", "Russia", "Mongolia"), "Geography", "Kamchatka is located in the Russian Far East, between the Sea of Okhotsk and the Pacific Ocean. This volcanic peninsula is part of the Russian Federation."),
            zh = LocalizedContent("堪察加半岛是哪个国家的半岛？", listOf("日本", "满洲", "俄罗斯", "蒙古"), "地理", "堪察加半岛位于俄罗斯远东地区，介于鄂霍次克海和太平洋之间。这个火山半岛是俄罗斯联邦的一部分。"),
            es = LocalizedContent("Kamchatka es una península de ¿qué país?", listOf("Japón", "Manchuria", "Rusia", "Mongolia"), "Geografía", "Kamchatka se encuentra en el Lejano Oriente ruso, entre el mar de Ojotsk y el océano Pacífico. Esta península volcánica forma parte de la Federación de Rusia.")
        ),
        BilingualQuestion(
            id = 12309, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Papouasie-Nouvelle-Guinée partage sa frontière avec?", listOf("Australie uniquement", "Australie et Indonésie", "Indonésie uniquement", "Aucun pays"), "Géographie", "La Papouasie-Nouvelle-Guinée partage une frontière terrestre avec l'Indonésie sur l'île de Nouvelle-Guinée, et une frontière maritime avec l'Australie au sud, via le détroit de Torres."),
            en = LocalizedContent("Papua New Guinea shares its border with?", listOf("Australia only", "Australia and Indonesia", "Indonesia only", "No country"), "Geography", "Papua New Guinea shares a land border with Indonesia on the island of New Guinea, and a maritime border with Australia to the south via the Torres Strait."),
            zh = LocalizedContent("巴布亚新几内亚与哪个国家接壤？", listOf("仅澳大利亚", "澳大利亚和印度尼西亚", "仅印度尼西亚", "没有国家"), "地理", "巴布亚新几内亚在新几内亚岛上与印度尼西亚有陆地边界，并通过托雷斯海峡与澳大利亚南部有海上边界。"),
            es = LocalizedContent("Papúa Nueva Guinea comparte su frontera con?", listOf("Solo Australia", "Australia e Indonesia", "Solo Indonesia", "Ningún país"), "Geografia", "Papúa Nueva Guinea comparte una frontera terrestre con Indonesia en la isla de Nueva Guinea, y una frontera marítima con Australia al sur, a través del estrecho de Torres.")
        ),
        BilingualQuestion(
            id = 12310, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le Cap Horn se trouve en?", listOf("Afrique", "Australie", "Amérique du Sud", "Asie"), "Géographie", "Le Cap Horn est le point le plus méridional de l'archipel de la Terre de Feu, situé à l'extrémité sud de l'Amérique du Sud, au Chili."),
            en = LocalizedContent("Cape Horn is located in?", listOf("Africa", "Australia", "South America", "Asia"), "Geography", "Cape Horn is the southernmost point of the Tierra del Fuego archipelago, located at the southern tip of South America, in Chile."),
            zh = LocalizedContent("合恩角位于？", listOf("非洲", "澳大利亚", "南美洲", "亚洲"), "地理", "合恩角是火地群岛的最南端，位于南美洲南端，智利境内。"),
            es = LocalizedContent("El Cabo de Hornos se encuentra en?", listOf("África", "Australia", "América del Sur", "Asia"), "Geografia", "El Cabo de Hornos es el punto más meridional del archipiélago de Tierra del Fuego, situado en el extremo sur de América del Sur, en Chile.")
        ),
        BilingualQuestion(
            id = 12311, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animes se situe dans un monde post-apocalyptique?", listOf("Death Note", "Attack on Titan", "Code Geass", "Psycho-Pass"), "Culture", "Attack on Titan se déroule dans un monde où l'humanité vit retranchée derrière d'immenses murs pour se protéger de créatures géantes, les Titans, suite à une catastrophe ayant presque anéanti la civilisation."),
            en = LocalizedContent("Which anime is set in a post-apocalyptic world?", listOf("Death Note", "Attack on Titan", "Code Geass", "Psycho-Pass"), "Culture", "Attack on Titan is set in a world where humanity lives behind immense walls to protect themselves from giant creatures, the Titans, following a catastrophe that nearly wiped out civilization."),
            zh = LocalizedContent("哪部动漫设定在末世世界？", listOf("死亡笔记", "进击的巨人", "反叛的鲁路修", "心理测量者"), "文化", "《进击的巨人》设定在一个人类生活在巨大城墙内以保护自己免受巨人生物侵害的世界，这场灾难几乎毁灭了文明。"),
            es = LocalizedContent("¿Qué anime se sitúa en un mundo postapocalíptico?", listOf("Death Note", "Attack on Titan", "Code Geass", "Psycho-Pass"), "Cultura", "Attack on Titan se desarrolla en un mundo donde la humanidad vive tras enormes muros para protegerse de criaturas gigantes, los Titanes, tras una catástrofe que casi aniquila la civilización.")
        ),
        BilingualQuestion(
            id = 12312, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La BD 'Mafalda' comporte combien d'albums?", listOf("10", "12", "15", "20"), "Culture", "Mafalda, créée par l'Argentin Quino, a été publiée de 1964 à 1973, et les strips originaux ont été compilés en 12 albums."),
            en = LocalizedContent("How many albums does the comic 'Mafalda' have?", listOf("10", "12", "15", "20"), "Culture", "Mafalda, created by Argentine Quino, was published from 1964 to 1973, and the original strips were compiled into 12 albums."),
            zh = LocalizedContent("漫画《玛法达》有多少册？", listOf("10", "12", "15", "20"), "文化", "《玛法达》由阿根廷作家季诺创作，于1964年至1973年间出版，原始漫画被汇编成12册。"),
            es = LocalizedContent("¿Cuántos álbumes tiene la historieta 'Mafalda'?", listOf("10", "12", "15", "20"), "Cultura", "Mafalda, creada por el argentino Quino, se publicó de 1964 a 1973, y las tiras originales se compilaron en 12 álbumes.")
        ),
        BilingualQuestion(
            id = 12313, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel jeu de plateau simule la gestion d'une ville?", listOf("Monopoly", "Carcassonne", "Agricola", "Puerto Rico"), "Culture", "Agricola est un jeu de plateau allemand où les joueurs développent une ferme et gèrent des ressources, simulant ainsi la gestion d'une exploitation agricole et d'une communauté."),
            en = LocalizedContent("Which board game simulates city management?", listOf("Monopoly", "Carcassonne", "Agricola", "Puerto Rico"), "Culture", "Agricola is a German board game where players develop a farm and manage resources, simulating the management of a farm and a community."),
            zh = LocalizedContent("哪款桌游模拟城市管理？", listOf("大富翁", "卡卡颂", "农场主", "波多黎各"), "文化", "《农场主》是一款德国桌游，玩家发展农场并管理资源，模拟农场和社区的管理。"),
            es = LocalizedContent("¿Qué juego de mesa simula la gestión de una ciudad?", listOf("Monopoly", "Carcassonne", "Agricola", "Puerto Rico"), "Cultura", "Agricola es un juego de mesa alemán donde los jugadores desarrollan una granja y gestionan recursos, simulando la gestión de una explotación agrícola y una comunidad.")
        ),
        BilingualQuestion(
            id = 12314, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le 'Pokémon' original compte combien de générations?", listOf("8", "9", "10", "11"), "Culture", "La première génération de Pokémon a débuté en 1996 avec 151 espèces, et la franchise compte désormais neuf générations, la dernière étant introduite avec les jeux Écarlate et Violet en 2022."),
            en = LocalizedContent("How many generations does the original 'Pokémon' have?", listOf("8", "9", "10", "11"), "Culture", "The first generation of Pokémon began in 1996 with 151 species, and the franchise now has nine generations, the latest introduced with the games Scarlet and Violet in 2022."),
            zh = LocalizedContent("最初的《宝可梦》有多少代？", listOf("8", "9", "10", "11"), "文化", "第一代宝可梦始于1996年，有151种，该系列现有九代，最新一代于2022年随《宝可梦 朱/紫》引入。"),
            es = LocalizedContent("¿Cuántas generaciones tiene el 'Pokémon' original?", listOf("8", "9", "10", "11"), "Cultura", "La primera generación de Pokémon comenzó en 1996 con 151 especies, y la franquicia cuenta ahora con nueve generaciones, la última introducida con los juegos Escarlata y Púrpura en 2022.")
        ),
        BilingualQuestion(
            id = 12315, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel anime adapte un manga seinen (pour adultes)?", listOf("Fullmetal Alchemist", "My Hero Academia", "Beserk", "Tokyo Ghoul"), "Culture", "Berserk est un manga seinen de Kentaro Miura, publié dans un magazine destiné aux adultes, et son adaptation en anime en conserve les thèmes sombres et violents."),
            en = LocalizedContent("Which anime adapts a seinen manga (for adults)?", listOf("Fullmetal Alchemist", "My Hero Academia", "Berserk", "Tokyo Ghoul"), "Culture", "Berserk is a seinen manga by Kentaro Miura, published in a magazine aimed at adults, and its anime adaptation retains the dark and violent themes."),
            zh = LocalizedContent("哪部动漫改编自青年漫画（面向成人）？", listOf("钢之炼金术师", "我的英雄学院", "剑风传奇", "东京喰种"), "文化", "《剑风传奇》是三浦健太郎创作的青年漫画，刊登在面向成人的杂志上，其动画改编保留了黑暗暴力的主题。"),
            es = LocalizedContent("¿Qué anime adapta un manga seinen (para adultos)?", listOf("Fullmetal Alchemist", "My Hero Academia", "Berserk", "Tokyo Ghoul"), "Cultura", "Berserk es un manga seinen de Kentaro Miura, publicado en una revista dirigida a adultos, y su adaptación al anime conserva los temas oscuros y violentos.")
        ),
        BilingualQuestion(
            id = 12316, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le 'Curcuma' est une épice originaire de?", listOf("Inde", "Thaïlande", "Indonésie", "Malaisie"), "Culture", "Le curcuma est originaire du sous-continent indien, où il est cultivé depuis des millénaires pour ses propriétés culinaires et médicinales."),
            en = LocalizedContent("Turmeric is a spice originally from?", listOf("India", "Thailand", "Indonesia", "Malaysia"), "Culture", "Turmeric is native to the Indian subcontinent, where it has been cultivated for millennia for its culinary and medicinal properties."),
            zh = LocalizedContent("姜黄是一种原产于哪里的香料？", listOf("印度", "泰国", "印度尼西亚", "马来西亚"), "文化", "姜黄原产于印度次大陆，在那里已被种植数千年，用于烹饪和药用。"),
            es = LocalizedContent("La cúrcuma es una especia originaria de?", listOf("India", "Tailandia", "Indonesia", "Malasia"), "Cultura", "La cúrcuma es originaria del subcontinente indio, donde se ha cultivado durante milenios por sus propiedades culinarias y medicinales.")
        ),
        BilingualQuestion(
            id = 12317, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La BD 'Corto Maltese' a été créée par?", listOf("Hugo Pratt", "Argentino Pedretti", "Andrea Picinini", "Pierre Micheyl"), "Culture", "Hugo Pratt est le dessinateur et scénariste italien qui a créé le personnage de Corto Maltese en 1967, dans la bande dessinée d'aventure \"La Ballade de la mer salée\"."),
            en = LocalizedContent("The comic 'Corto Maltese' was created by?", listOf("Hugo Pratt", "Argentino Pedretti", "Andrea Picinini", "Pierre Micheyl"), "Culture", "Hugo Pratt is the Italian cartoonist and writer who created the character Corto Maltese in 1967, in the adventure comic 'The Ballad of the Salt Sea'."),
            zh = LocalizedContent("漫画《科托·马尔蒂斯》由谁创作？", listOf("雨果·普拉特", "阿根廷诺·佩德雷蒂", "安德烈亚·皮奇尼尼", "皮埃尔·米歇尔"), "文化", "雨果·普拉特是意大利漫画家和作家，于1967年在冒险漫画《咸海之歌》中创造了科托·马尔蒂斯这个角色。"),
            es = LocalizedContent("La historieta 'Corto Maltés' fue creada por?", listOf("Hugo Pratt", "Argentino Pedretti", "Andrea Picinini", "Pierre Micheyl"), "Cultura", "Hugo Pratt es el dibujante y guionista italiano que creó el personaje de Corto Maltés en 1967, en la historieta de aventuras 'La balada del mar salado'.")
        ),
        BilingualQuestion(
            id = 12318, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le jeu de cartes le plus joué au monde?", listOf("Tarot", "Bridge", "Poker", "Belote"), "Culture", "Le poker est considéré comme le jeu de cartes le plus joué au monde en raison de sa popularité massive dans les casinos, les tournois internationaux et les parties privées."),
            en = LocalizedContent("Which is the most played card game in the world?", listOf("Tarot", "Bridge", "Poker", "Belote"), "Culture", "Poker is considered the most played card game in the world due to its massive popularity in casinos, international tournaments, and private games."),
            zh = LocalizedContent("世界上玩得最多的纸牌游戏是？", listOf("塔罗牌", "桥牌", "扑克", "贝洛特"), "文化", "扑克被认为是世界上玩得最多的纸牌游戏，因为它在赌场、国际锦标赛和私人游戏中非常流行。"),
            es = LocalizedContent("¿Cuál es el juego de cartas más jugado del mundo?", listOf("Tarot", "Bridge", "Póker", "Belote"), "Cultura", "El póker es considerado el juego de cartas más jugado del mundo debido a su enorme popularidad en casinos, torneos internacionales y partidas privadas.")
        ),
        BilingualQuestion(
            id = 12319, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le manga 'Jojo's Bizarre Adventure' compte combien de parties?", listOf("6", "7", "8", "9"), "Culture", "Le manga 'Jojo's Bizarre Adventure' est divisé en huit parties distinctes, chacune suivant un nouveau membre de la famille Joestar. La neuvième partie est actuellement en cours de publication."),
            en = LocalizedContent("How many parts does the manga 'JoJo's Bizarre Adventure' have?", listOf("6", "7", "8", "9"), "Culture", "The manga 'JoJo's Bizarre Adventure' is divided into eight distinct parts, each following a new member of the Joestar family. The ninth part is currently being published."),
            zh = LocalizedContent("漫画《JoJo的奇妙冒险》共有多少部？", listOf("6", "7", "8", "9"), "文化", "漫画《JoJo的奇妙冒险》分为八部独立的篇章，每部讲述乔斯达家族一位新成员的故事。第九部目前正在连载中。"),
            es = LocalizedContent("¿Cuántas partes tiene el manga 'JoJo's Bizarre Adventure'?", listOf("6", "7", "8", "9"), "Cultura", "El manga 'JoJo's Bizarre Adventure' está dividido en ocho partes distintas, cada una siguiendo a un nuevo miembro de la familia Joestar. La novena parte se está publicando actualmente.")
        ),
        BilingualQuestion(
            id = 12320, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le 'Cardamome' est une épice originaire de?", listOf("Inde", "Malaisie", "Indonésie", "Thaïlande"), "Culture", "La cardamome est originaire des forêts tropicales du sud de l'Inde, où elle est cultivée depuis l'Antiquité."),
            en = LocalizedContent("Cardamom is a spice native to?", listOf("India", "Malaysia", "Indonesia", "Thailand"), "Culture", "Cardamom is native to the tropical forests of southern India, where it has been cultivated since ancient times."),
            zh = LocalizedContent("小豆蔻原产于哪里？", listOf("印度", "马来西亚", "印度尼西亚", "泰国"), "文化", "小豆蔻原产于印度南部的热带森林，自古以来就在那里种植。"),
            es = LocalizedContent("¿De dónde es originario el cardamomo?", listOf("India", "Malasia", "Indonesia", "Tailandia"), "Cultura", "El cardamomo es originario de los bosques tropicales del sur de la India, donde se cultiva desde la antigüedad.")
        ),
        BilingualQuestion(
            id = 12321, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel anime a le plus haut taux de fréquentation au cinéma?", listOf("Dragon Ball Z", "Demon Slayer", "One Piece Gold", "Boruto"), "Culture", "Demon Slayer : Le Train de l'Infini a battu des records au box-office japonais, devenant le film le plus rentable de l'histoire du pays et attirant une fréquentation massive en salles."),
            en = LocalizedContent("Which anime has the highest cinema attendance?", listOf("Dragon Ball Z", "Demon Slayer", "One Piece Gold", "Boruto"), "Culture", "Demon Slayer: Mugen Train broke box office records in Japan, becoming the highest-grossing film in the country's history and attracting massive theater attendance."),
            zh = LocalizedContent("哪部动漫的电影观影人数最高？", listOf("龙珠Z", "鬼灭之刃", "海贼王黄金", "博人传"), "文化", "《鬼灭之刃：无限列车》打破了日本票房纪录，成为日本历史上最卖座的电影，吸引了大量观众。"),
            es = LocalizedContent("¿Qué anime tiene la mayor asistencia al cine?", listOf("Dragon Ball Z", "Demon Slayer", "One Piece Gold", "Boruto"), "Cultura", "Demon Slayer: El Tren Infinito rompió récords de taquilla en Japón, convirtiéndose en la película más taquillera de la historia del país y atrayendo una asistencia masiva a las salas.")
        ),
        BilingualQuestion(
            id = 12322, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La BD 'Capitaine América' a été créée en?", listOf("1939", "1941", "1943", "1945"), "Culture", "Captain America est apparu pour la première fois en mars 1941, créé par Joe Simon et Jack Kirby, en pleine Seconde Guerre mondiale, ce qui explique son costume patriotique et son rôle de super-soldat américain."),
            en = LocalizedContent("The comic 'Captain America' was created in?", listOf("1939", "1941", "1943", "1945"), "Culture", "Captain America first appeared in March 1941, created by Joe Simon and Jack Kirby, during World War II, which explains his patriotic costume and role as an American super-soldier."),
            zh = LocalizedContent("漫画《美国队长》创作于哪一年？", listOf("1939", "1941", "1943", "1945"), "文化", "美国队长首次出现于1941年3月，由乔·西蒙和杰克·科比创作，正值第二次世界大战期间，这解释了他爱国主义的服装和作为美国超级士兵的角色。"),
            es = LocalizedContent("¿En qué año se creó el cómic 'Capitán América'?", listOf("1939", "1941", "1943", "1945"), "Cultura", "El Capitán América apareció por primera vez en marzo de 1941, creado por Joe Simon y Jack Kirby, en plena Segunda Guerra Mundial, lo que explica su traje patriótico y su papel de super-soldado estadounidense.")
        ),
        BilingualQuestion(
            id = 12323, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel jeu de plateau utilise des hexagones?", listOf("Catan", "Carcassonne", "Agricola", "Ticket to Ride"), "Culture", "Catan est connu pour son plateau modulaire composé de tuiles hexagonales représentant différentes ressources, ce qui le distingue des jeux utilisant des cases carrées."),
            en = LocalizedContent("Which board game uses hexagons?", listOf("Catan", "Carcassonne", "Agricola", "Ticket to Ride"), "Culture", "Catan is known for its modular board made of hexagonal tiles representing different resources, distinguishing it from games using square spaces."),
            zh = LocalizedContent("哪款桌游使用六边形格子？", listOf("卡坦岛", "卡卡颂", "农场主", "车票之旅"), "文化", "卡坦岛以其由六边形板块组成的模块化版图而闻名，这些板块代表不同的资源，使其区别于使用方形格子的游戏。"),
            es = LocalizedContent("¿Qué juego de mesa utiliza hexágonos?", listOf("Catan", "Carcassonne", "Agricola", "Ticket to Ride"), "Cultura", "Catan es conocido por su tablero modular compuesto por fichas hexagonales que representan diferentes recursos, lo que lo distingue de los juegos que usan casillas cuadradas.")
        ),
        BilingualQuestion(
            id = 12324, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le 'Vanille' est originaire de?", listOf("Madagascar", "Mexique", "Indonésie", "Tahiti"), "Culture", "Madagascar est le premier producteur mondial de vanille, fournissant environ 80% de la vanille naturelle consommée dans le monde."),
            en = LocalizedContent("Vanilla is native to?", listOf("Madagascar", "Mexico", "Indonesia", "Tahiti"), "Culture", "Madagascar is the world's leading producer of vanilla, supplying about 80% of the natural vanilla consumed globally."),
            zh = LocalizedContent("香草原产于哪里？", listOf("马达加斯加", "墨西哥", "印度尼西亚", "塔希提"), "文化", "马达加斯加是全球最大的香草生产国，供应了全球约80%的天然香草。"),
            es = LocalizedContent("¿De dónde es originaria la vainilla?", listOf("Madagascar", "México", "Indonesia", "Tahití"), "Cultura", "Madagascar es el principal productor mundial de vainilla, suministrando aproximadamente el 80% de la vainilla natural consumida en el mundo.")
        ),
        BilingualQuestion(
            id = 12325, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel anime a remporté le prix du meilleur film d'animation?", listOf("Your Name", "Demon Slayer", "Jojo's Bizarre Adventure", "Attack on Titan"), "Culture", "Your Name, réalisé par Makoto Shinkai, a remporté le prix du meilleur film d'animation aux Japan Academy Prize en 2017."),
            en = LocalizedContent("Which anime won the Best Animated Film award?", listOf("Your Name", "Demon Slayer", "JoJo's Bizarre Adventure", "Attack on Titan"), "Culture", "Your Name, directed by Makoto Shinkai, won the Best Animated Film award at the Japan Academy Prize in 2017."),
            zh = LocalizedContent("哪部动漫获得了最佳动画电影奖？", listOf("你的名字。", "鬼灭之刃", "JoJo的奇妙冒险", "进击的巨人"), "文化", "《你的名字。》由新海诚执导，在2017年日本电影学院奖上获得了最佳动画电影奖。"),
            es = LocalizedContent("¿Qué anime ganó el premio a la mejor película de animación?", listOf("Your Name", "Demon Slayer", "JoJo's Bizarre Adventure", "Attack on Titan"), "Cultura", "Your Name, dirigida por Makoto Shinkai, ganó el premio a la mejor película de animación en los Japan Academy Prize en 2017.")
        ),
        BilingualQuestion(
            id = 12326, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel type de compétition est un 'slalom'?", listOf("Course automobile", "Ski de neige", "Cyclisme", "Athlétisme"), "Sport", "Le slalom est une discipline du ski alpin qui consiste à descendre un parcours balisé par des piquets. Il fait partie des épreuves techniques des compétitions de ski de neige."),
            en = LocalizedContent("What type of competition is a 'slalom'?", listOf("Car racing", "Skiing", "Cycling", "Athletics"), "Sports", "Slalom is a discipline of alpine skiing that involves descending a course marked by gates. It is part of the technical events in snow skiing competitions."),
            zh = LocalizedContent("“回转”是哪类比赛项目？", listOf("赛车", "滑雪", "自行车", "田径"), "体育", "回转是高山滑雪的一个项目，要求选手沿标有旗门的赛道下滑。它是滑雪比赛中的技术项目之一。"),
            es = LocalizedContent("¿Qué tipo de competición es un 'eslalon'?", listOf("Carrera de autos", "Esquí", "Ciclismo", "Atletismo"), "Deportes", "El eslalon es una disciplina del esquí alpino que consiste en descender un recorrido marcado por puertas. Forma parte de las pruebas técnicas de las competiciones de esquí.")
        ),
        BilingualQuestion(
            id = 12327, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La Formule E utilise quels véhicules?", listOf("Monoplace essence", "Monoplace électrique", "Voiture de sport", "Prototype"), "Sport", "La Formule E est un championnat de course automobile qui utilise exclusivement des monoplaces électriques, contrairement à la Formule 1 qui emploie des moteurs à combustion."),
            en = LocalizedContent("Formula E uses which vehicles?", listOf("Gasoline single-seater", "Electric single-seater", "Sports car", "Prototype"), "Sports", "Formula E is a car racing championship that exclusively uses electric single-seaters, unlike Formula 1 which uses combustion engines."),
            zh = LocalizedContent("电动方程式使用哪种车辆？", listOf("汽油单座赛车", "电动单座赛车", "跑车", "原型车"), "体育", "电动方程式是一项汽车锦标赛，专门使用电动单座赛车，与使用内燃机的一级方程式不同。"),
            es = LocalizedContent("¿Qué vehículos utiliza la Fórmula E?", listOf("Monoplaza de gasolina", "Monoplaza eléctrico", "Coche deportivo", "Prototipo"), "Deportes", "La Fórmula E es un campeonato de carreras de autos que utiliza exclusivamente monoplazas eléctricos, a diferencia de la Fórmula 1 que emplea motores de combustión.")
        ),
        BilingualQuestion(
            id = 12328, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel sport inclut le 'tirage au sort' pour les appairements?", listOf("Tennis", "Badminton", "Boxe", "Escrime"), "Sport", "En boxe, le tirage au sort détermine les appariements des combattants dans un tournoi, assurant l'équité des confrontations."),
            en = LocalizedContent("Which sport includes a 'draw' for pairings?", listOf("Tennis", "Badminton", "Boxing", "Fencing"), "Sports", "In boxing, a draw determines the pairings of fighters in a tournament, ensuring fair matchups."),
            zh = LocalizedContent("哪项运动包含“抽签”决定配对？", listOf("网球", "羽毛球", "拳击", "击剑"), "体育", "在拳击比赛中，抽签决定选手在锦标赛中的配对，以确保公平对决。"),
            es = LocalizedContent("¿Qué deporte incluye un 'sorteo' para los emparejamientos?", listOf("Tenis", "Bádminton", "Boxeo", "Esgrima"), "Deportes", "En el boxeo, el sorteo determina los emparejamientos de los combatientes en un torneo, asegurando la equidad de los enfrentamientos.")
        ),
        BilingualQuestion(
            id = 12329, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le saut à la perche utilise une perche mesurant environ?", listOf("4 m", "4.5 m", "5 m", "6 m"), "Sport", "Les perches de saut mesurent généralement entre 4 et 5 mètres, mais la norme pour les compétitions est d'environ 5 mètres, permettant aux athlètes de franchir des hauteurs élevées."),
            en = LocalizedContent("The pole vault uses a pole measuring approximately?", listOf("4 m", "4.5 m", "5 m", "6 m"), "Sports", "Pole vault poles typically measure between 4 and 5 meters, but the standard for competitions is about 5 meters, allowing athletes to clear high heights."),
            zh = LocalizedContent("撑杆跳高使用的撑杆长度大约是多少？", listOf("4米", "4.5米", "5米", "6米"), "体育", "撑杆跳高的撑杆通常长4到5米，但比赛标准约为5米，使运动员能够越过较高高度。"),
            es = LocalizedContent("El salto con pértiga utiliza una pértiga que mide aproximadamente?", listOf("4 m", "4.5 m", "5 m", "6 m"), "Deportes", "Las pértigas de salto suelen medir entre 4 y 5 metros, pero el estándar para competiciones es de unos 5 metros, permitiendo a los atletas superar alturas elevadas.")
        ),
        BilingualQuestion(
            id = 12330, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En snowboard, le 'halfpipe' est une piste en forme de?", listOf("Tube", "Demi-tube", "Spirale", "Vague"), "Sport", "Le halfpipe doit son nom à sa forme de tube coupé en deux, soit un demi-tube, permettant aux snowboardeurs d'effectuer des figures acrobatiques sur les parois."),
            en = LocalizedContent("In snowboarding, the 'halfpipe' is a track shaped like?", listOf("Tube", "Half-tube", "Spiral", "Wave"), "Sports", "The halfpipe gets its name from its shape of a tube cut in half, i.e., a half-tube, allowing snowboarders to perform acrobatic tricks on the walls."),
            zh = LocalizedContent("在单板滑雪中，“半管”赛道形状像什么？", listOf("管状", "半管", "螺旋", "波浪"), "体育", "半管因其形状像被切成两半的管子而得名，即半管，使单板滑雪者能够在壁上表演特技动作。"),
            es = LocalizedContent("En snowboard, el 'halfpipe' es una pista con forma de?", listOf("Tubo", "Medio tubo", "Espiral", "Ola"), "Deportes", "El halfpipe debe su nombre a su forma de tubo cortado por la mitad, es decir, un medio tubo, permitiendo a los snowboarders realizar figuras acrobáticas en las paredes.")
        ),
        BilingualQuestion(
            id = 12331, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le triathlon ironman comprend quelle distance de cyclisme?", listOf("80 km", "100 km", "120 km", "180 km"), "Sport", "L'épreuve de cyclisme de l'Ironman couvre 180 km, soit 112 miles, après les 3,8 km de natation et avant le marathon final de 42,195 km."),
            en = LocalizedContent("The Ironman triathlon includes what cycling distance?", listOf("80 km", "100 km", "120 km", "180 km"), "Sports", "The cycling leg of the Ironman covers 180 km (112 miles), after the 3.8 km swim and before the final marathon of 42.195 km."),
            zh = LocalizedContent("铁人三项包括多长的自行车赛段？", listOf("80公里", "100公里", "120公里", "180公里"), "体育", "铁人三项的自行车赛段为180公里（112英里），在3.8公里游泳之后，最后是42.195公里的马拉松。"),
            es = LocalizedContent("El triatlón Ironman incluye qué distancia de ciclismo?", listOf("80 km", "100 km", "120 km", "180 km"), "Deportes", "La etapa de ciclismo del Ironman cubre 180 km (112 millas), después de los 3,8 km de natación y antes del maratón final de 42,195 km.")
        ),
        BilingualQuestion(
            id = 12332, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En escalade, le grade de difficulté commence par?", listOf("I", "1", "A", "1a"), "Sport", "L’escalade utilise une échelle de cotation pour évaluer la difficulté des voies. En France, le système commence par la cote 1a, qui représente le niveau le plus facile."),
            en = LocalizedContent("In climbing, the difficulty grade starts with?", listOf("I", "1", "A", "1a"), "Sports", "Climbing uses a rating scale to evaluate route difficulty. In France, the system starts with the grade 1a, representing the easiest level."),
            zh = LocalizedContent("在攀岩中，难度等级从什么开始？", listOf("I", "1", "A", "1a"), "体育", "攀岩使用难度等级来评估路线难度。在法国，系统从1a开始，代表最简单的级别。"),
            es = LocalizedContent("En escalada, el grado de dificultad comienza con?", listOf("I", "1", "A", "1a"), "Deportes", "La escalada utiliza una escala de calificación para evaluar la dificultad de las vías. En Francia, el sistema comienza con el grado 1a, que representa el nivel más fácil.")
        ),
        BilingualQuestion(
            id = 12333, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le parachutisme comprend combien de positions de chute libre différentes?", listOf("2", "3", "4", "5"), "Sport", "Les quatre positions de chute libre en parachutisme sont la position ventrale, dorsale, assise et debout, chacune offrant des sensations et contrôles différents."),
            en = LocalizedContent("Skydiving includes how many different freefall positions?", listOf("2", "3", "4", "5"), "Sports", "The four freefall positions in skydiving are belly, back, sit, and stand, each offering different sensations and control."),
            zh = LocalizedContent("跳伞包括多少种不同的自由落体姿势？", listOf("2", "3", "4", "5"), "体育", "跳伞的四种自由落体姿势是俯卧、仰卧、坐姿和站立，每种提供不同的感觉和控制。"),
            es = LocalizedContent("El paracaidismo incluye cuántas posiciones diferentes de caída libre?", listOf("2", "3", "4", "5"), "Deportes", "Las cuatro posiciones de caída libre en paracaidismo son ventral, dorsal, sentada y de pie, cada una ofreciendo sensaciones y control diferentes.")
        ),
        BilingualQuestion(
            id = 12334, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le bobsleigh olympique utilise un traineau pesant?", listOf("80 kg", "100 kg", "120 kg", "150 kg"), "Sport", "Le règlement du bobsleigh olympique impose un poids minimum de 120 kg pour le traîneau, hors équipage, afin de garantir l'équité et la sécurité lors des épreuves."),
            en = LocalizedContent("The Olympic bobsleigh uses a sled weighing?", listOf("80 kg", "100 kg", "120 kg", "150 kg"), "Sports", "Olympic bobsleigh regulations require a minimum sled weight of 120 kg, excluding crew, to ensure fairness and safety during events."),
            zh = LocalizedContent("奥运雪橇使用的雪橇重量是多少？", listOf("80公斤", "100公斤", "120公斤", "150公斤"), "体育", "奥运雪橇规定雪橇最低重量为120公斤（不含运动员），以确保比赛的公平性和安全性。"),
            es = LocalizedContent("El bobsleigh olímpico utiliza un trineo que pesa?", listOf("80 kg", "100 kg", "120 kg", "150 kg"), "Deportes", "El reglamento del bobsleigh olímpico exige un peso mínimo de 120 kg para el trineo, sin incluir la tripulación, para garantizar la equidad y seguridad durante las pruebas.")
        ),
        BilingualQuestion(
            id = 12335, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En équitation de saut, le parcours comprend minimum combien d'obstacles?", listOf("6", "8", "10", "12"), "Sport", "Selon les règles de la Fédération Équestre Internationale, un parcours de saut d'obstacles doit comporter au minimum 10 obstacles lors des compétitions officielles."),
            en = LocalizedContent("In show jumping, the course includes a minimum of how many obstacles?", listOf("6", "8", "10", "12"), "Sports", "According to the rules of the International Equestrian Federation, a show jumping course must include at least 10 obstacles in official competitions."),
            zh = LocalizedContent("在场地障碍赛中，路线至少包括多少个障碍？", listOf("6", "8", "10", "12"), "体育", "根据国际马术联合会的规定，正式比赛的场地障碍赛路线必须至少包括10个障碍。"),
            es = LocalizedContent("En equitación de salto, el recorrido incluye un mínimo de cuántos obstáculos?", listOf("6", "8", "10", "12"), "Deportes", "Según las reglas de la Federación Ecuestre Internacional, un recorrido de salto de obstáculos debe incluir al menos 10 obstáculos en competiciones oficiales.")
        ),
        BilingualQuestion(
            id = 12336, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le golf utilise un tee (support) mesurant environ?", listOf("1 cm", "2 cm", "4 cm", "5 cm"), "Sport", "La hauteur réglementaire d'un tee de golf est d'environ 4 cm pour permettre de surélever la balle sans gêner le swing, conformément aux normes de l'USGA."),
            en = LocalizedContent("Golf uses a tee (support) measuring approximately?", listOf("1 cm", "2 cm", "4 cm", "5 cm"), "Sports", "The regulation height of a golf tee is about 4 cm to elevate the ball without hindering the swing, in accordance with USGA standards."),
            zh = LocalizedContent("高尔夫使用的球座（支撑物）大约有多高？", listOf("1厘米", "2厘米", "4厘米", "5厘米"), "体育", "高尔夫球座的标准高度约为4厘米，以便抬高球而不妨碍挥杆，符合USGA标准。"),
            es = LocalizedContent("El golf utiliza un tee (soporte) que mide aproximadamente?", listOf("1 cm", "2 cm", "4 cm", "5 cm"), "Deportes", "La altura reglamentaria de un tee de golf es de unos 4 cm para elevar la bola sin obstaculizar el swing, de acuerdo con las normas de la USGA.")
        ),
        BilingualQuestion(
            id = 12337, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En athlétisme, la distance du 10000m est de?", listOf("25 tours", "30 tours", "35 tours", "40 tours"), "Sport", "Sur une piste d'athlétisme standard de 400 mètres, 10 000 mètres correspondent à exactement 25 tours."),
            en = LocalizedContent("In athletics, the distance of the 10000m is?", listOf("25 laps", "30 laps", "35 laps", "40 laps"), "Sports", "On a standard 400-meter athletics track, 10,000 meters corresponds to exactly 25 laps."),
            zh = LocalizedContent("在田径中，10000米的距离是多少圈？", listOf("25圈", "30圈", "35圈", "40圈"), "体育", "在标准400米田径跑道上，10000米正好对应25圈。"),
            es = LocalizedContent("En atletismo, la distancia de los 10000 m es de?", listOf("25 vueltas", "30 vueltas", "35 vueltas", "40 vueltas"), "Deportes", "En una pista de atletismo estándar de 400 metros, 10 000 metros corresponden exactamente a 25 vueltas.")
        ),
        BilingualQuestion(
            id = 12338, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le snowboard slopestyle utilise une piste de combien de mètres?", listOf("500 m", "750 m", "1000 m", "1500 m"), "Sport", "En slopestyle, la piste fait environ 1000 mètres de long pour permettre l’enchaînement de sauts et modules sur un parcours technique."),
            en = LocalizedContent("Snowboard slopestyle uses a course of how many meters?", listOf("500 m", "750 m", "1000 m", "1500 m"), "Sports", "In slopestyle, the course is about 1000 meters long to allow a sequence of jumps and modules on a technical course."),
            zh = LocalizedContent("单板滑雪坡面障碍技巧使用的赛道有多长？", listOf("500米", "750米", "1000米", "1500米"), "体育", "在坡面障碍技巧中，赛道长约1000米，以便在技术赛道上进行跳跃和模块的连续动作。"),
            es = LocalizedContent("El slopestyle de snowboard utiliza una pista de cuántos metros?", listOf("500 m", "750 m", "1000 m", "1500 m"), "Deportes", "En slopestyle, la pista mide unos 1000 metros de largo para permitir la secuencia de saltos y módulos en un recorrido técnico.")
        ),
        BilingualQuestion(
            id = 12339, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En curling, une 'pierre' pèse environ?", listOf("15 kg", "19.96 kg", "25 kg", "30 kg"), "Sport", "Le poids réglementaire d'une pierre de curling est fixé à 19,96 kg (44 livres) par la Fédération mondiale de curling pour assurer une glisse uniforme sur la glace."),
            en = LocalizedContent("In curling, a 'stone' weighs approximately?", listOf("15 kg", "19.96 kg", "25 kg", "30 kg"), "Sports", "The regulation weight of a curling stone is set at 19.96 kg (44 pounds) by the World Curling Federation to ensure uniform sliding on ice."),
            zh = LocalizedContent("在冰壶运动中，一个“冰壶石”大约重多少？", listOf("15公斤", "19.96公斤", "25公斤", "30公斤"), "体育", "世界冰壶联合会规定冰壶石的标准重量为19.96公斤（44磅），以确保在冰面上均匀滑动。"),
            es = LocalizedContent("En curling, una 'piedra' pesa aproximadamente?", listOf("15 kg", "19.96 kg", "25 kg", "30 kg"), "Deportes", "El peso reglamentario de una piedra de curling es de 19,96 kg (44 libras) según la Federación Mundial de Curling para garantizar un deslizamiento uniforme sobre el hielo.")
        ),
        BilingualQuestion(
            id = 12340, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le biathlon sprint couvre quelle distance de ski?", listOf("5 km", "10 km", "15 km", "20 km"), "Sport", "Le sprint en biathlon est l'épreuve la plus courte, avec 10 km pour les hommes et 7,5 km pour les femmes, mais la distance de 5 km correspond au sprint en catégorie junior ou en initiation."),
            en = LocalizedContent("In biathlon sprint, what distance of skiing is covered?", listOf("5 km", "10 km", "15 km", "20 km"), "Sports", "The sprint in biathlon is the shortest event, with 10 km for men and 7.5 km for women, but the 5 km distance corresponds to the sprint in junior or introductory categories."),
            zh = LocalizedContent("在冬季两项短距离赛中，滑雪距离是多少？", listOf("5公里", "10公里", "15公里", "20公里"), "体育", "冬季两项短距离赛是最短的项目，男子为10公里，女子为7.5公里，但5公里距离对应青少年或入门级别的短距离赛。"),
            es = LocalizedContent("En el sprint de biatlón, ¿qué distancia de esquí se cubre?", listOf("5 km", "10 km", "15 km", "20 km"), "Deportes", "El sprint en biatlón es la prueba más corta, con 10 km para hombres y 7,5 km para mujeres, pero la distancia de 5 km corresponde al sprint en categoría junior o iniciación.")
        ),
        BilingualQuestion(
            id = 12341, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert la loi de la thermodynamique?", listOf("Carnot", "Clausius", "Thomson", "Gibbs"), "Science", "Sadi Carnot a posé les bases du deuxième principe de la thermodynamique dans son ouvrage de 1824 sur la puissance motrice du feu."),
            en = LocalizedContent("Which scientist discovered the law of thermodynamics?", listOf("Carnot", "Clausius", "Thomson", "Gibbs"), "Science", "Sadi Carnot laid the foundations of the second law of thermodynamics in his 1824 work on the motive power of fire."),
            zh = LocalizedContent("哪位科学家发现了热力学定律？", listOf("卡诺", "克劳修斯", "汤姆孙", "吉布斯"), "科学", "萨迪·卡诺在其1824年关于火的动力的著作中奠定了热力学第二定律的基础。"),
            es = LocalizedContent("¿Qué científico descubrió la ley de la termodinámica?", listOf("Carnot", "Clausius", "Thomson", "Gibbs"), "Ciencia", "Sadi Carnot sentó las bases del segundo principio de la termodinámica en su obra de 1824 sobre la potencia motriz del fuego.")
        ),
        BilingualQuestion(
            id = 12342, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La entropie est un concept de?", listOf("Cinétique", "Thermodynamique", "Dynamique", "Statique"), "Science", "L'entropie mesure le degré de désordre d'un système et est une notion fondamentale en thermodynamique, notamment via le second principe qui stipule que l'entropie totale d'un système isolé ne peut que croître."),
            en = LocalizedContent("Entropy is a concept of?", listOf("Kinetics", "Thermodynamics", "Dynamics", "Statics"), "Science", "Entropy measures the degree of disorder of a system and is a fundamental concept in thermodynamics, notably through the second law which states that the total entropy of an isolated system can only increase."),
            zh = LocalizedContent("熵是哪个领域的概念？", listOf("动力学", "热力学", "动力学", "静力学"), "科学", "熵衡量系统的无序程度，是热力学中的基本概念，特别是通过第二定律，该定律指出孤立系统的总熵只能增加。"),
            es = LocalizedContent("La entropía es un concepto de?", listOf("Cinética", "Termodinámica", "Dinámica", "Estática"), "Ciencia", "La entropía mide el grado de desorden de un sistema y es un concepto fundamental en termodinámica, especialmente a través del segundo principio que establece que la entropía total de un sistema aislado solo puede aumentar.")
        ),
        BilingualQuestion(
            id = 12343, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel type de matériau est utilisé pour la supraconductivité?", listOf("Métaux simples", "Alliages spécialisés", "Céramiques", "Tous les trois"), "Science", "La supraconductivité peut se manifester dans divers matériaux : certains métaux à très basse température, des céramiques à plus haute température, et même des composés organiques dans des conditions spécifiques."),
            en = LocalizedContent("What type of material is used for superconductivity?", listOf("Simple metals", "Specialized alloys", "Ceramics", "All three"), "Science", "Superconductivity can occur in various materials: some metals at very low temperatures, ceramics at higher temperatures, and even organic compounds under specific conditions."),
            zh = LocalizedContent("哪种材料用于超导？", listOf("简单金属", "特种合金", "陶瓷", "以上所有"), "科学", "超导现象可以出现在多种材料中：某些金属在极低温度下，陶瓷在较高温度下，甚至有机化合物在特定条件下。"),
            es = LocalizedContent("¿Qué tipo de material se utiliza para la superconductividad?", listOf("Metales simples", "Aleaciones especializadas", "Cerámicas", "Los tres"), "Ciencia", "La superconductividad puede manifestarse en diversos materiales: algunos metales a muy baja temperatura, cerámicas a temperatura más alta, e incluso compuestos orgánicos en condiciones específicas.")
        ),
        BilingualQuestion(
            id = 12344, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La branche de la chimie qui étudie les réactions rapides est?", listOf("Cinétique chimique", "Thermochimie", "Photochimie", "Stéréochimie"), "Science", "La cinétique chimique étudie la vitesse des réactions et les facteurs qui l'influencent, incluant les réactions rapides comme les explosions ou les processus enzymatiques."),
            en = LocalizedContent("The branch of chemistry that studies fast reactions is?", listOf("Chemical kinetics", "Thermochemistry", "Photochemistry", "Stereochemistry"), "Science", "Chemical kinetics studies the speed of reactions and the factors that influence it, including fast reactions such as explosions or enzymatic processes."),
            zh = LocalizedContent("研究快速反应的化学分支是？", listOf("化学动力学", "热化学", "光化学", "立体化学"), "科学", "化学动力学研究反应速率及其影响因素，包括快速反应如爆炸或酶促过程。"),
            es = LocalizedContent("La rama de la química que estudia las reacciones rápidas es?", listOf("Cinética química", "Termoquímica", "Fotoquímica", "Estereoquímica"), "Ciencia", "La cinética química estudia la velocidad de las reacciones y los factores que la influyen, incluyendo reacciones rápidas como explosiones o procesos enzimáticos.")
        ),
        BilingualQuestion(
            id = 12345, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La catalyse est le phénomène où?", listOf("Un catalyseur change le mécanisme", "Un catalyseur abaisse l'énergie d'activation", "Un catalyseur augmente le rendement", "Un catalyseur consomme de l'énergie"), "Science", "Un catalyseur accélère une réaction chimique en abaissant l'énergie d'activation nécessaire, sans être consommé dans le processus."),
            en = LocalizedContent("Catalysis is the phenomenon where?", listOf("A catalyst changes the mechanism", "A catalyst lowers the activation energy", "A catalyst increases the yield", "A catalyst consumes energy"), "Science", "A catalyst accelerates a chemical reaction by lowering the necessary activation energy, without being consumed in the process."),
            zh = LocalizedContent("催化是以下哪种现象？", listOf("催化剂改变反应机理", "催化剂降低活化能", "催化剂提高产率", "催化剂消耗能量"), "科学", "催化剂通过降低所需的活化能来加速化学反应，而自身在过程中不被消耗。"),
            es = LocalizedContent("La catálisis es el fenómeno donde?", listOf("Un catalizador cambia el mecanismo", "Un catalizador reduce la energía de activación", "Un catalizador aumenta el rendimiento", "Un catalizador consume energía"), "Ciencia", "Un catalizador acelera una reacción química al reducir la energía de activación necesaria, sin consumirse en el proceso.")
        ),
        BilingualQuestion(
            id = 12346, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le principe d'exclusion de Pauli s'applique à?", listOf("Les photons", "Les électrons", "Les neutrons", "Les quarks"), "Science", "Le principe d'exclusion de Pauli stipule que deux fermions identiques, comme les électrons, ne peuvent occuper le même état quantique simultanément."),
            en = LocalizedContent("The Pauli exclusion principle applies to?", listOf("Photons", "Electrons", "Neutrons", "Quarks"), "Science", "The Pauli exclusion principle states that two identical fermions, such as electrons, cannot occupy the same quantum state simultaneously."),
            zh = LocalizedContent("泡利不相容原理适用于？", listOf("光子", "电子", "中子", "夸克"), "科学", "泡利不相容原理指出，两个相同的费米子（如电子）不能同时占据同一个量子态。"),
            es = LocalizedContent("El principio de exclusión de Pauli se aplica a?", listOf("Fotones", "Electrones", "Neutrones", "Quarks"), "Ciencia", "El principio de exclusión de Pauli establece que dos fermiones idénticos, como los electrones, no pueden ocupar el mismo estado cuántico simultáneamente.")
        ),
        BilingualQuestion(
            id = 12347, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La diffraction est un phénomène où la lumière?", listOf("Se réfléchit", "Se réfracte", "Contourne les obstacles", "Se disperse"), "Science", "La diffraction se produit lorsque la lumière rencontre un obstacle ou une ouverture, ce qui la fait dévier de sa trajectoire rectiligne et contourner l'obstacle."),
            en = LocalizedContent("Diffraction is a phenomenon where light?", listOf("Reflects", "Refracts", "Bends around obstacles", "Disperses"), "Science", "Diffraction occurs when light encounters an obstacle or aperture, causing it to deviate from its straight path and bend around the obstacle."),
            zh = LocalizedContent("衍射是光以下哪种现象？", listOf("反射", "折射", "绕过障碍物", "色散"), "科学", "当光遇到障碍物或狭缝时，会发生衍射，使其偏离直线路径并绕过障碍物。"),
            es = LocalizedContent("La difracción es un fenómeno donde la luz?", listOf("Se refleja", "Se refracta", "Rodea los obstáculos", "Se dispersa"), "Ciencia", "La difracción ocurre cuando la luz encuentra un obstáculo o abertura, lo que la hace desviarse de su trayectoria rectilínea y rodear el obstáculo.")
        ),
        BilingualQuestion(
            id = 12348, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'interférence des ondes produit?", listOf("Amplification uniquement", "Atténuation uniquement", "Amplification ou atténuation", "Dispersion"), "Science", "L'interférence des ondes se produit lorsque deux ondes se rencontrent, créant une amplification (interférence constructive) ou une atténuation (interférence destructive) selon leur déphasage."),
            en = LocalizedContent("Wave interference produces?", listOf("Only amplification", "Only attenuation", "Amplification or attenuation", "Dispersion"), "Science", "Wave interference occurs when two waves meet, creating amplification (constructive interference) or attenuation (destructive interference) depending on their phase difference."),
            zh = LocalizedContent("波的干涉会产生？", listOf("仅增强", "仅减弱", "增强或减弱", "色散"), "科学", "当两列波相遇时，会发生干涉，根据相位差产生增强（相长干涉）或减弱（相消干涉）。"),
            es = LocalizedContent("La interferencia de ondas produce?", listOf("Solo amplificación", "Solo atenuación", "Amplificación o atenuación", "Dispersión"), "Ciencia", "La interferencia de ondas ocurre cuando dos ondas se encuentran, creando amplificación (interferencia constructiva) o atenuación (interferencia destructiva) según su diferencia de fase.")
        ),
    )

    private fun part5(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 12349, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La résonance magnétique nucléaire utilise un champ de?", listOf("Rayons X", "Ondes radio", "Radiofréquences", "Micro-ondes"), "Science", "En IRM, les noyaux atomiques sont excités par des impulsions de radiofréquences après avoir été placés dans un champ magnétique intense, ce qui permet de produire des images du corps."),
            en = LocalizedContent("Nuclear magnetic resonance uses a field of?", listOf("X-rays", "Radio waves", "Radiofrequencies", "Microwaves"), "Science", "In MRI, atomic nuclei are excited by radiofrequency pulses after being placed in a strong magnetic field, allowing images of the body to be produced."),
            zh = LocalizedContent("核磁共振使用什么场？", listOf("X射线", "无线电波", "射频", "微波"), "科学", "在磁共振成像中，原子核在强磁场中受到射频脉冲激发，从而产生身体图像。"),
            es = LocalizedContent("La resonancia magnética nuclear utiliza un campo de?", listOf("Rayos X", "Ondas de radio", "Radiofrecuencias", "Microondas"), "Ciencia", "En la RMN, los núcleos atómicos son excitados por pulsos de radiofrecuencia después de ser colocados en un campo magnético intenso, lo que permite producir imágenes del cuerpo.")
        ),
        BilingualQuestion(
            id = 12350, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La spectroscopie étudie l'interaction de la matière avec?", listOf("La chaleur", "La lumière", "Le magnétisme", "L'électricité"), "Science", "La spectroscopie analyse comment la matière absorbe, émet ou diffuse la lumière pour en révéler la composition ou la structure."),
            en = LocalizedContent("Spectroscopy studies the interaction of matter with?", listOf("Heat", "Light", "Magnetism", "Electricity"), "Science", "Spectroscopy analyzes how matter absorbs, emits, or scatters light to reveal its composition or structure."),
            zh = LocalizedContent("光谱学研究物质与什么的相互作用？", listOf("热", "光", "磁", "电"), "科学", "光谱学分析物质如何吸收、发射或散射光，以揭示其组成或结构。"),
            es = LocalizedContent("La espectroscopia estudia la interacción de la materia con?", listOf("El calor", "La luz", "El magnetismo", "La electricidad"), "Ciencia", "La espectroscopia analiza cómo la materia absorbe, emite o dispersa la luz para revelar su composición o estructura.")
        ),
        BilingualQuestion(
            id = 12351, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La polarisation de la lumière peut être causée par?", listOf("La réflexion", "La réfraction", "La diffraction", "La diffusion"), "Science", "Lorsque la lumière non polarisée se réfléchit sur une surface non métallique, comme l'eau ou le verre, les vibrations perpendiculaires au plan d'incidence sont partiellement ou totalement éliminées, produisant une polarisation par réflexion."),
            en = LocalizedContent("Polarization of light can be caused by?", listOf("Reflection", "Refraction", "Diffraction", "Scattering"), "Science", "When unpolarized light reflects off a non-metallic surface, such as water or glass, vibrations perpendicular to the plane of incidence are partially or completely eliminated, producing polarization by reflection."),
            zh = LocalizedContent("光的偏振可以由什么引起？", listOf("反射", "折射", "衍射", "散射"), "科学", "当非偏振光在非金属表面（如水或玻璃）上反射时，垂直于入射面的振动被部分或完全消除，从而产生反射偏振。"),
            es = LocalizedContent("La polarización de la luz puede ser causada por?", listOf("La reflexión", "La refracción", "La difracción", "La dispersión"), "Ciencia", "Cuando la luz no polarizada se refleja en una superficie no metálica, como el agua o el vidrio, las vibraciones perpendiculares al plano de incidencia se eliminan parcial o totalmente, produciendo polarización por reflexión.")
        ),
        BilingualQuestion(
            id = 12352, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le tunnel quantique est un phénomène où une particule??", listOf("Disparaît", "Traverse une barrière d'énergie", "Se divise", "Change de forme"), "Science", "En mécanique quantique, une particule peut franchir une barrière d'énergie même si son énergie est inférieure à celle nécessaire classiquement, grâce à son comportement ondulatoire."),
            en = LocalizedContent("Quantum tunneling is a phenomenon where a particle?", listOf("Disappears", "Crosses an energy barrier", "Splits", "Changes shape"), "Science", "In quantum mechanics, a particle can cross an energy barrier even if its energy is lower than classically required, due to its wave-like behavior."),
            zh = LocalizedContent("量子隧穿是一种现象，其中粒子？", listOf("消失", "穿过能量势垒", "分裂", "改变形状"), "科学", "在量子力学中，粒子可以穿过能量势垒，即使其能量低于经典所需，这是由于它的波动行为。"),
            es = LocalizedContent("El túnel cuántico es un fenómeno donde una partícula?", listOf("Desaparece", "Atraviesa una barrera de energía", "Se divide", "Cambia de forma"), "Ciencia", "En mecánica cuántica, una partícula puede atravesar una barrera de energía incluso si su energía es menor que la requerida clásicamente, debido a su comportamiento ondulatorio.")
        ),
        BilingualQuestion(
            id = 12353, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La mécanique ondulatoire étudie??", listOf("Le comportement des vagues sonores", "Le comportement des particules subatomiques", "Le mouvement des fluides", "La propagation des ondes électromagnétiques"), "Science", "La mécanique ondulatoire, développée par Schrödinger, décrit les particules subatomiques comme des ondes de probabilité, expliquant leur comportement quantique."),
            en = LocalizedContent("Wave mechanics studies?", listOf("The behavior of sound waves", "The behavior of subatomic particles", "The movement of fluids", "The propagation of electromagnetic waves"), "Science", "Wave mechanics, developed by Schrödinger, describes subatomic particles as probability waves, explaining their quantum behavior."),
            zh = LocalizedContent("波动力学研究什么？", listOf("声波的行为", "亚原子粒子的行为", "流体的运动", "电磁波的传播"), "科学", "由薛定谔发展的波动力学将亚原子粒子描述为概率波，解释它们的量子行为。"),
            es = LocalizedContent("La mecánica ondulatoria estudia?", listOf("El comportamiento de las ondas sonoras", "El comportamiento de las partículas subatómicas", "El movimiento de los fluidos", "La propagación de las ondas electromagnéticas"), "Ciencia", "La mecánica ondulatoria, desarrollada por Schrödinger, describe las partículas subatómicas como ondas de probabilidad, explicando su comportamiento cuántico.")
        ),
        BilingualQuestion(
            id = 12354, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert le plutonium?", listOf("Seaborg", "McMillan", "Lawrence", "Fermi"), "Science", "Glenn T. Seaborg et son équipe ont synthétisé le plutonium en 1940 à l'Université de Californie à Berkeley, en bombardant de l'uranium avec des deutérons."),
            en = LocalizedContent("Which scientist discovered plutonium?", listOf("Seaborg", "McMillan", "Lawrence", "Fermi"), "Science", "Glenn T. Seaborg and his team synthesized plutonium in 1940 at the University of California, Berkeley, by bombarding uranium with deuterons."),
            zh = LocalizedContent("哪位科学家发现了钚？", listOf("西博格", "麦克米伦", "劳伦斯", "费米"), "科学", "格伦·T·西博格和他的团队于1940年在加州大学伯克利分校通过用氘核轰击铀合成了钚。"),
            es = LocalizedContent("¿Qué científico descubrió el plutonio?", listOf("Seaborg", "McMillan", "Lawrence", "Fermi"), "Ciencia", "Glenn T. Seaborg y su equipo sintetizaron el plutonio en 1940 en la Universidad de California, Berkeley, bombardeando uranio con deuterones.")
        ),
        BilingualQuestion(
            id = 12355, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La demi-vie du carbone-14 est de?", listOf("5730 ans", "10000 ans", "15000 ans", "20000 ans"), "Science", "Le carbone-14 est un isotope radioactif utilisé pour dater des échantillons organiques anciens. Sa demi-vie de 5730 ans correspond au temps nécessaire pour que la moitié des atomes se désintègre."),
            en = LocalizedContent("The half-life of carbon-14 is?", listOf("5730 years", "10000 years", "15000 years", "20000 years"), "Science", "Carbon-14 is a radioactive isotope used to date ancient organic samples. Its half-life of 5730 years is the time required for half of the atoms to decay."),
            zh = LocalizedContent("碳-14的半衰期是多少？", listOf("5730年", "10000年", "15000年", "20000年"), "科学", "碳-14是一种放射性同位素，用于测定古代有机样品的年代。其5730年的半衰期是半数原子衰变所需的时间。"),
            es = LocalizedContent("La vida media del carbono-14 es de?", listOf("5730 años", "10000 años", "15000 años", "20000 años"), "Ciencia", "El carbono-14 es un isótopo radiactivo utilizado para datar muestras orgánicas antiguas. Su vida media de 5730 años es el tiempo necesario para que la mitad de los átomos se desintegren.")
        ),
        BilingualQuestion(
            id = 12356, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel empire a été fondé par Alexandre le Grand?", listOf("Empire gréco-macédoine", "Empire macédoine", "Empire grec", "Empire hellénistique"), "Histoire", "Alexandre le Grand a conquis un vaste territoire allant de la Grèce à l'Inde, et après sa mort en 323 av. J.-C., cet ensemble est devenu l'Empire hellénistique, marqué par la diffusion de la culture grecque."),
            en = LocalizedContent("Which empire was founded by Alexander the Great?", listOf("Greco-Macedonian Empire", "Macedonian Empire", "Greek Empire", "Hellenistic Empire"), "History", "Alexander the Great conquered a vast territory from Greece to India, and after his death in 323 BC, this became the Hellenistic Empire, marked by the spread of Greek culture."),
            zh = LocalizedContent("亚历山大大帝建立了哪个帝国？", listOf("希腊-马其顿帝国", "马其顿帝国", "希腊帝国", "希腊化帝国"), "历史", "亚历山大大帝征服了从希腊到印度的广阔领土，在他于公元前323年去世后，这片领土成为希腊化帝国，以希腊文化的传播为特征。"),
            es = LocalizedContent("¿Qué imperio fue fundado por Alejandro Magno?", listOf("Imperio greco-macedonio", "Imperio macedonio", "Imperio griego", "Imperio helenístico"), "Historia", "Alejandro Magno conquistó un vasto territorio desde Grecia hasta la India, y tras su muerte en el 323 a.C., este conjunto se convirtió en el Imperio helenístico, marcado por la difusión de la cultura griega.")
        ),
        BilingualQuestion(
            id = 12357, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Alexandre le Grand a conquis la Perse en?", listOf("330 av. J.-C.", "331 av. J.-C.", "332 av. J.-C.", "333 av. J.-C."), "Histoire", "Alexandre le Grand a vaincu l'empire perse achéménide à la bataille de Gaugamèles en 331 av. J.-C., ce qui a conduit à la chute de Persépolis et à la conquête de l'empire."),
            en = LocalizedContent("Alexander the Great conquered Persia in?", listOf("330 BC", "331 BC", "332 BC", "333 BC"), "History", "Alexander the Great defeated the Achaemenid Persian Empire at the Battle of Gaugamela in 331 BC, leading to the fall of Persepolis and the conquest of the empire."),
            zh = LocalizedContent("亚历山大大帝在哪一年征服了波斯？", listOf("公元前330年", "公元前331年", "公元前332年", "公元前333年"), "历史", "亚历山大大帝在公元前331年的高加米拉战役中击败了阿契美尼德波斯帝国，导致波斯波利斯陷落并征服了该帝国。"),
            es = LocalizedContent("Alejandro Magno conquistó Persia en?", listOf("330 a.C.", "331 a.C.", "332 a.C.", "333 a.C."), "Historia", "Alejandro Magno derrotó al Imperio persa aqueménida en la batalla de Gaugamela en el 331 a.C., lo que llevó a la caída de Persépolis y a la conquista del imperio.")
        ),
        BilingualQuestion(
            id = 12358, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel général romain a conquis la Gaule?", listOf("Pompée", "Cesar", "Marius", "Scipion"), "Histoire", "Jules César a mené la guerre des Gaules entre 58 et 50 av. J.-C., soumettant l'ensemble du territoire gaulois et étendant la domination romaine jusqu'au Rhin."),
            en = LocalizedContent("Which Roman general conquered Gaul?", listOf("Pompey", "Caesar", "Marius", "Scipio"), "History", "Julius Caesar led the Gallic Wars between 58 and 50 BC, subduing the entire Gallic territory and extending Roman rule to the Rhine."),
            zh = LocalizedContent("哪位罗马将军征服了高卢？", listOf("庞培", "凯撒", "马略", "西庇阿"), "历史", "尤利乌斯·凯撒在公元前58年至50年间领导了高卢战争，征服了整个高卢领土，并将罗马统治扩展到莱茵河。"),
            es = LocalizedContent("¿Qué general romano conquistó la Galia?", listOf("Pompeyo", "César", "Mario", "Escipión"), "Historia", "Julio César lideró las Guerras Gálicas entre el 58 y el 50 a.C., sometiendo todo el territorio galo y extendiendo el dominio romano hasta el Rin.")
        ),
        BilingualQuestion(
            id = 12359, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La Vie crucifixion de Jésus a eu lieu vers?", listOf("10 apr. J.-C.", "30 apr. J.-C.", "50 apr. J.-C.", "70 apr. J.-C."), "Histoire", "La crucifixion de Jésus est généralement datée entre 30 et 33 apr. J.-C., sous le règne de Ponce Pilate, gouverneur de Judée."),
            en = LocalizedContent("The crucifixion of Jesus took place around?", listOf("10 AD", "30 AD", "50 AD", "70 AD"), "History", "The crucifixion of Jesus is generally dated between 30 and 33 AD, under the reign of Pontius Pilate, governor of Judea."),
            zh = LocalizedContent("耶稣被钉十字架大约发生在？", listOf("公元10年", "公元30年", "公元50年", "公元70年"), "历史", "耶稣被钉十字架通常被定在公元30至33年间，在犹太总督本丢·彼拉多统治时期。"),
            es = LocalizedContent("¿La crucifixión de Jesús tuvo lugar alrededor de?", listOf("10 d.C.", "30 d.C.", "50 d.C.", "70 d.C."), "Historia", "La crucifixión de Jesús se data generalmente entre el 30 y el 33 d.C., bajo el reinado de Poncio Pilato, gobernador de Judea.")
        ),
        BilingualQuestion(
            id = 12360, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Dynastie Han en Chine a duré?", listOf("200 ans", "300 ans", "400 ans", "500 ans"), "Histoire", "La dynastie Han a régné sur la Chine pendant environ 400 ans, de 206 av. J.-C. à 220 apr. J.-C., avec une brève interruption."),
            en = LocalizedContent("The Han Dynasty in China lasted?", listOf("200 years", "300 years", "400 years", "500 years"), "History", "The Han dynasty ruled China for about 400 years, from 206 BC to 220 AD, with a brief interruption."),
            zh = LocalizedContent("中国汉朝持续了？", listOf("200年", "300年", "400年", "500年"), "历史", "汉朝统治中国约400年，从公元前206年到公元220年，中间有短暂中断。"),
            es = LocalizedContent("¿La dinastía Han en China duró?", listOf("200 años", "300 años", "400 años", "500 años"), "Historia", "La dinastía Han gobernó China durante unos 400 años, desde el 206 a.C. hasta el 220 d.C., con una breve interrupción.")
        ),
        BilingualQuestion(
            id = 12361, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel empire a construit Machu Picchu?", listOf("Aztèque", "Inca", "Maya", "Olmèque"), "Histoire", "Machu Picchu a été construit au XVe siècle sous le règne de l'empereur inca Pachacutec, comme domaine royal ou sanctuaire religieux dans les Andes péruviennes."),
            en = LocalizedContent("Which empire built Machu Picchu?", listOf("Aztec", "Inca", "Maya", "Olmec"), "History", "Machu Picchu was built in the 15th century under the reign of the Inca emperor Pachacutec, as a royal estate or religious sanctuary in the Peruvian Andes."),
            zh = LocalizedContent("哪个帝国建造了马丘比丘？", listOf("阿兹特克", "印加", "玛雅", "奥尔梅克"), "历史", "马丘比丘建于15世纪，在印加皇帝帕查库蒂统治时期，作为皇家庄园或宗教圣地位于秘鲁安第斯山脉。"),
            es = LocalizedContent("¿Qué imperio construyó Machu Picchu?", listOf("Azteca", "Inca", "Maya", "Olmeca"), "Historia", "Machu Picchu fue construido en el siglo XV bajo el reinado del emperador inca Pachacútec, como una finca real o santuario religioso en los Andes peruanos.")
        ),
        BilingualQuestion(
            id = 12362, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'empire aztèque a été fondé en?", listOf("1200", "1325", "1350", "1400"), "Histoire", "La ville de Tenochtitlan, capitale de l'empire aztèque, a été fondée en 1325 sur une île du lac Texcoco, selon la légende des Aztèques guidés par un aigle sur un cactus."),
            en = LocalizedContent("The Aztec Empire was founded in?", listOf("1200", "1325", "1350", "1400"), "History", "The city of Tenochtitlan, capital of the Aztec Empire, was founded in 1325 on an island in Lake Texcoco, according to the Aztec legend of an eagle on a cactus."),
            zh = LocalizedContent("阿兹特克帝国建立于？", listOf("1200年", "1325年", "1350年", "1400年"), "历史", "阿兹特克帝国首都特诺奇蒂特兰城建于1325年，位于特斯科科湖的一个岛上，根据阿兹特克传说，一只鹰站在仙人掌上指引了他们。"),
            es = LocalizedContent("¿El Imperio Azteca fue fundado en?", listOf("1200", "1325", "1350", "1400"), "Historia", "La ciudad de Tenochtitlan, capital del Imperio Azteca, fue fundada en 1325 en una isla del lago Texcoco, según la leyenda azteca de un águila sobre un cactus.")
        ),
        BilingualQuestion(
            id = 12363, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Montezuma II a été le dernier empereur?", listOf("Aztèque", "Inca", "Maya", "Olmèque"), "Histoire", "Montezuma II régna sur l'Empire aztèque de 1502 à 1520, et sa mort lors de la conquête espagnole marqua la fin de la dynastie impériale aztèque."),
            en = LocalizedContent("Montezuma II was the last emperor of the?", listOf("Aztec", "Inca", "Maya", "Olmec"), "History", "Montezuma II ruled the Aztec Empire from 1502 to 1520, and his death during the Spanish conquest marked the end of the Aztec imperial dynasty."),
            zh = LocalizedContent("蒙特祖玛二世是哪个帝国的最后一位皇帝？", listOf("阿兹特克", "印加", "玛雅", "奥尔梅克"), "历史", "蒙特祖玛二世于1502年至1520年统治阿兹特克帝国，他在西班牙征服期间去世，标志着阿兹特克帝国王朝的终结。"),
            es = LocalizedContent("¿Moctezuma II fue el último emperador?", listOf("Azteca", "Inca", "Maya", "Olmeca"), "Historia", "Moctezuma II gobernó el Imperio Azteca de 1502 a 1520, y su muerte durante la conquista española marcó el fin de la dinastía imperial azteca.")
        ),
        BilingualQuestion(
            id = 12364, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La civilisation maya a prospéré au?", listOf("Mexique et Amérique centrale", "Pérou", "Bolivie", "Colombie"), "Histoire", "La civilisation maya s'est développée principalement dans la péninsule du Yucatán, au Mexique, et dans les régions du Guatemala, du Belize et du Honduras, en Amérique centrale."),
            en = LocalizedContent("The Maya civilization flourished in?", listOf("Mexico and Central America", "Peru", "Bolivia", "Colombia"), "History", "The Maya civilization developed mainly in the Yucatán Peninsula in Mexico, and in regions of Guatemala, Belize, and Honduras, in Central America."),
            zh = LocalizedContent("玛雅文明兴盛于？", listOf("墨西哥和中美洲", "秘鲁", "玻利维亚", "哥伦比亚"), "历史", "玛雅文明主要发展于墨西哥的尤卡坦半岛，以及危地马拉、伯利兹和洪都拉斯等中美洲地区。"),
            es = LocalizedContent("¿La civilización maya floreció en?", listOf("México y Centroamérica", "Perú", "Bolivia", "Colombia"), "Historia", "La civilización maya se desarrolló principalmente en la península de Yucatán, en México, y en regiones de Guatemala, Belice y Honduras, en Centroamérica.")
        ),
        BilingualQuestion(
            id = 12365, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le système d'écriture maya utilisait?", listOf("Des alphabets", "Des hiéroglyphes", "Des pictogrammes", "Des logogrammes"), "Histoire", "L'écriture maya combinait des logogrammes (symboles représentant des mots entiers) et des syllabogrammes."),
            en = LocalizedContent("The Maya writing system used?", listOf("Alphabets", "Hieroglyphs", "Pictograms", "Logograms"), "History", "Maya writing combined logograms (symbols representing whole words) and syllabograms."),
            zh = LocalizedContent("玛雅文字系统使用了？", listOf("字母", "象形文字", "图画文字", "语素文字"), "历史", "玛雅文字结合了语素文字（代表整个单词的符号）和音节文字。"),
            es = LocalizedContent("¿El sistema de escritura maya utilizaba?", listOf("Alfabetos", "Jeroglíficos", "Pictogramas", "Logogramas"), "Historia", "La escritura maya combinaba logogramas (símbolos que representan palabras completas) y silabogramas.")
        ),
        BilingualQuestion(
            id = 12366, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Peste noire a tué combien de millions de personnes?", listOf("25 millions", "50 millions", "75 millions", "100 millions"), "Histoire", "La peste noire, qui a sévi en Eurasie au XIVe siècle, a causé la mort d'environ 50 millions de personnes, soit près de la moitié de la population européenne."),
            en = LocalizedContent("The Black Death killed how many millions of people?", listOf("25 million", "50 million", "75 million", "100 million"), "History", "The Black Death, which ravaged Eurasia in the 14th century, caused the death of about 50 million people, nearly half of Europe's population."),
            zh = LocalizedContent("黑死病导致多少人死亡（以百万计）？", listOf("2500万", "5000万", "7500万", "1亿"), "历史", "黑死病在14世纪肆虐欧亚大陆，导致约5000万人死亡，接近欧洲人口的一半。"),
            es = LocalizedContent("¿La Peste Negra mató a cuántos millones de personas?", listOf("25 millones", "50 millones", "75 millones", "100 millones"), "Historia", "La Peste Negra, que asoló Eurasia en el siglo XIV, causó la muerte de unos 50 millones de personas, casi la mitad de la población europea.")
        ),
        BilingualQuestion(
            id = 12367, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La Magna Carta a été signée en?", listOf("1200", "1215", "1230", "1250"), "Histoire", "La Magna Carta fut scellée en 1215 à Runnymede, en Angleterre, par le roi Jean sans Terre sous la pression des barons rebelles, limitant pour la première fois le pouvoir royal."),
            en = LocalizedContent("The Magna Carta was signed in?", listOf("1200", "1215", "1230", "1250"), "History", "The Magna Carta was sealed in 1215 at Runnymede, England, by King John under pressure from rebel barons, limiting royal power for the first time."),
            zh = LocalizedContent("《大宪章》签署于？", listOf("1200年", "1215年", "1230年", "1250年"), "历史", "《大宪章》于1215年在英格兰兰尼米德由约翰王在反叛贵族的压力下签署，首次限制了王权。"),
            es = LocalizedContent("¿La Carta Magna fue firmada en?", listOf("1200", "1215", "1230", "1250"), "Historia", "La Carta Magna fue sellada en 1215 en Runnymede, Inglaterra, por el rey Juan sin Tierra bajo la presión de los barones rebeldes, limitando por primera vez el poder real.")
        ),
        BilingualQuestion(
            id = 12368, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel roi anglais a mené les Croisades?", listOf("Richard Cœur de Lion", "Jean sans Terre", "Henri II", "Édouard I"), "Histoire", "Richard Cœur de Lion, roi d'Angleterre, a dirigé la troisième croisade (1189-1192) aux côtés de Philippe Auguste et Frédéric Barberousse."),
            en = LocalizedContent("Which English king led the Crusades?", listOf("Richard the Lionheart", "John Lackland", "Henry II", "Edward I"), "History", "Richard the Lionheart, King of England, led the Third Crusade (1189-1192) alongside Philip Augustus and Frederick Barbarossa."),
            zh = LocalizedContent("哪位英格兰国王领导了十字军东征？", listOf("狮心王理查", "无地王约翰", "亨利二世", "爱德华一世"), "历史", "英格兰国王狮心王理查与腓力·奥古斯都和腓特烈·巴巴罗萨一起领导了第三次十字军东征（1189-1192年）。"),
            es = LocalizedContent("¿Qué rey inglés lideró las Cruzadas?", listOf("Ricardo Corazón de León", "Juan sin Tierra", "Enrique II", "Eduardo I"), "Historia", "Ricardo Corazón de León, rey de Inglaterra, dirigió la Tercera Cruzada (1189-1192) junto a Felipe Augusto y Federico Barbarroja.")
        ),
        BilingualQuestion(
            id = 12369, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Reconquista en Ibérie a duré?", listOf("400 ans", "600 ans", "700 ans", "800 ans"), "Histoire", "La Reconquista, qui désigne la reconquête des territoires musulmans par les royaumes chrétiens dans la péninsule Ibérique, s'est étendue du début du VIIIe siècle à 1492, soit environ 800 ans."),
            en = LocalizedContent("How long did the Reconquista in Iberia last?", listOf("400 years", "600 years", "700 years", "800 years"), "History", "The Reconquista, the reconquest of Muslim territories by Christian kingdoms in the Iberian Peninsula, lasted from the early 8th century to 1492, about 800 years."),
            zh = LocalizedContent("伊比利亚半岛的收复失地运动持续了多久？", listOf("400年", "600年", "700年", "800年"), "历史", "收复失地运动是指基督教王国在伊比利亚半岛收复穆斯林领土的过程，从8世纪初持续到1492年，大约800年。"),
            es = LocalizedContent("¿Cuánto duró la Reconquista en Iberia?", listOf("400 años", "600 años", "700 años", "800 años"), "Historia", "La Reconquista, la reconquista de territorios musulmanes por los reinos cristianos en la península ibérica, duró desde principios del siglo VIII hasta 1492, unos 800 años.")
        ),
        BilingualQuestion(
            id = 12370, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Toison d'Or était un ordre de chevalerie de?", listOf("France", "Bourgogne", "Espagne", "Flandre"), "Histoire", "L'ordre de la Toison d'Or a été fondé en 1430 par Philippe le Bon, duc de Bourgogne, pour honorer les chevaliers les plus loyaux."),
            en = LocalizedContent("The Golden Fleece was an order of chivalry of?", listOf("France", "Burgundy", "Spain", "Flanders"), "History", "The Order of the Golden Fleece was founded in 1430 by Philip the Good, Duke of Burgundy, to honor the most loyal knights."),
            zh = LocalizedContent("金羊毛骑士团是哪个国家的骑士团？", listOf("法国", "勃艮第", "西班牙", "佛兰德"), "历史", "金羊毛骑士团由勃艮第公爵菲利普三世于1430年创立，旨在表彰最忠诚的骑士。"),
            es = LocalizedContent("¿El Toisón de Oro fue una orden de caballería de?", listOf("Francia", "Borgoña", "España", "Flandes"), "Historia", "La Orden del Toisón de Oro fue fundada en 1430 por Felipe el Bueno, duque de Borgoña, para honrar a los caballeros más leales.")
        ),
        BilingualQuestion(
            id = 12371, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Le Québec est situé en?", listOf("Nouvelle-Angleterre", "Canada", "États-Unis", "Nouveaux Mondes"), "Géographie", "Le Québec est l'une des dix provinces du Canada, située dans la partie est du pays."),
            en = LocalizedContent("Quebec is located in?", listOf("New England", "Canada", "United States", "New Worlds"), "Geography", "Quebec is one of the ten provinces of Canada, located in the eastern part of the country."),
            zh = LocalizedContent("魁北克位于？", listOf("新英格兰", "加拿大", "美国", "新世界"), "地理", "魁北克是加拿大十个省份之一，位于该国东部。"),
            es = LocalizedContent("¿Quebec está situado en?", listOf("Nueva Inglaterra", "Canadá", "Estados Unidos", "Nuevos Mundos"), "Geografía", "Quebec es una de las diez provincias de Canadá, ubicada en la parte este del país.")
        ),
        BilingualQuestion(
            id = 12372, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La Terre du Feu se trouve en?", listOf("Alaska", "Canadà", "Chili et Argentine", "Patagonie"), "Géographie", "L'archipel de la Terre de Feu est partagé entre le Chili et l'Argentine, à l'extrémité sud de l'Amérique du Sud."),
            en = LocalizedContent("Tierra del Fuego is located in?", listOf("Alaska", "Canada", "Chile and Argentina", "Patagonia"), "Geography", "The Tierra del Fuego archipelago is shared between Chile and Argentina, at the southern tip of South America."),
            zh = LocalizedContent("火地岛位于？", listOf("阿拉斯加", "加拿大", "智利和阿根廷", "巴塔哥尼亚"), "地理", "火地岛群岛由智利和阿根廷共享，位于南美洲最南端。"),
            es = LocalizedContent("¿La Tierra del Fuego se encuentra en?", listOf("Alaska", "Canadá", "Chile y Argentina", "Patagonia"), "Geografía", "El archipiélago de Tierra del Fuego es compartido entre Chile y Argentina, en el extremo sur de América del Sur.")
        ),
        BilingualQuestion(
            id = 12373, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'Île de Rapa Nui (Pâques) appartient à??", listOf("Pérou", "Bolivie", "Chili", "Équateur"), "Géographie", "Rapa Nui est un territoire spécial du Chili depuis son annexion en 1888, situé dans l'océan Pacifique."),
            en = LocalizedContent("Rapa Nui (Easter Island) belongs to?", listOf("Peru", "Bolivia", "Chile", "Ecuador"), "Geography", "Rapa Nui is a special territory of Chile since its annexation in 1888, located in the Pacific Ocean."),
            zh = LocalizedContent("拉帕努伊（复活节岛）属于？", listOf("秘鲁", "玻利维亚", "智利", "厄瓜多尔"), "地理", "拉帕努伊自1888年被吞并以来一直是智利的特殊领土，位于太平洋。"),
            es = LocalizedContent("¿Rapa Nui (Isla de Pascua) pertenece a?", listOf("Perú", "Bolivia", "Chile", "Ecuador"), "Geografía", "Rapa Nui es un territorio especial de Chile desde su anexión en 1888, ubicado en el océano Pacífico.")
        ),
        BilingualQuestion(
            id = 12374, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le Détroit de Magellan relie quel océan à quel océan?", listOf("Atlantique et Pacifique", "Indien et Pacifique", "Atlantique et Indien", "Arctique et Atlantique"), "Géographie", "Le détroit de Magellan, découvert en 1520, traverse l'extrémité sud de l'Amérique du Sud et permet de passer de l'océan Atlantique au Pacifique sans contourner le cap Horn."),
            en = LocalizedContent("The Strait of Magellan connects which ocean to which ocean?", listOf("Atlantic and Pacific", "Indian and Pacific", "Atlantic and Indian", "Arctic and Atlantic"), "Geography", "The Strait of Magellan, discovered in 1520, crosses the southern tip of South America and allows passage from the Atlantic Ocean to the Pacific without rounding Cape Horn."),
            zh = LocalizedContent("麦哲伦海峡连接哪两个大洋？", listOf("大西洋和太平洋", "印度洋和太平洋", "大西洋和印度洋", "北冰洋和大西洋"), "地理", "麦哲伦海峡于1520年被发现，穿越南美洲南端，可绕过合恩角从大西洋进入太平洋。"),
            es = LocalizedContent("¿El estrecho de Magallanes conecta qué océano con qué océano?", listOf("Atlántico y Pacífico", "Índico y Pacífico", "Atlántico e Índico", "Ártico y Atlántico"), "Geografía", "El estrecho de Magallanes, descubierto en 1520, cruza el extremo sur de América del Sur y permite pasar del océano Atlántico al Pacífico sin rodear el cabo de Hornos.")
        ),
        BilingualQuestion(
            id = 12375, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La Baie de Fundy a les plus grandes marées du monde", listOf("Vrai", "Faux", "", ""), "Géographie", "La Baie de Fundy, au Canada, détient le record des plus grandes marées du monde, avec un marnage pouvant atteindre 16 mètres."),
            en = LocalizedContent("The Bay of Fundy has the highest tides in the world", listOf("True", "False", "", ""), "Geography", "The Bay of Fundy in Canada holds the record for the highest tides in the world, with a tidal range that can reach 16 meters."),
            zh = LocalizedContent("芬迪湾拥有世界上最高的潮汐", listOf("正确", "错误", "", ""), "地理", "加拿大的芬迪湾保持着世界上最高潮汐的记录，潮差可达16米。"),
            es = LocalizedContent("La Bahía de Fundy tiene las mareas más altas del mundo", listOf("Verdadero", "Falso", "", ""), "Geografía", "La Bahía de Fundy en Canadá tiene el récord de las mareas más altas del mundo, con un rango de marea que puede alcanzar los 16 metros.")
        ),
        BilingualQuestion(
            id = 12376, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Groenland est recouvert de glace à??", listOf("50%", "75%", "80%", "95%"), "Géographie", "Environ 95% de la surface du Groenland est recouverte par une calotte glaciaire, ce qui en fait la deuxième plus grande masse de glace au monde après l'Antarctique."),
            en = LocalizedContent("Greenland is covered by ice at?", listOf("50%", "75%", "80%", "95%"), "Geography", "About 95% of Greenland's surface is covered by an ice sheet, making it the second largest ice mass in the world after Antarctica."),
            zh = LocalizedContent("格陵兰岛被冰覆盖的比例是？", listOf("50%", "75%", "80%", "95%"), "地理", "格陵兰岛约95%的表面被冰盖覆盖，使其成为仅次于南极洲的世界第二大冰体。"),
            es = LocalizedContent("¿Groenlandia está cubierta de hielo en un?", listOf("50%", "75%", "80%", "95%"), "Geografía", "Alrededor del 95% de la superficie de Groenlandia está cubierta por una capa de hielo, lo que la convierte en la segunda masa de hielo más grande del mundo después de la Antártida.")
        ),
        BilingualQuestion(
            id = 12377, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Islande possède environ combien de volcans actifs?", listOf("20", "30", "40", "60"), "Géographie", "L'Islande est située sur la dorsale médio-atlantique, une zone de divergence tectonique, ce qui explique sa forte activité volcanique avec environ 60 volcans actifs recensés."),
            en = LocalizedContent("Iceland has approximately how many active volcanoes?", listOf("20", "30", "40", "60"), "Geography", "Iceland is located on the Mid-Atlantic Ridge, a tectonic divergence zone, which explains its high volcanic activity with about 60 active volcanoes recorded."),
            zh = LocalizedContent("冰岛大约有多少座活火山？", listOf("20", "30", "40", "60"), "地理", "冰岛位于大西洋中脊，这是一个构造板块发散带，因此火山活动频繁，约有60座活火山被记录。"),
            es = LocalizedContent("¿Islandia tiene aproximadamente cuántos volcanes activos?", listOf("20", "30", "40", "60"), "Geografía", "Islandia está situada en la dorsal mesoatlántica, una zona de divergencia tectónica, lo que explica su alta actividad volcánica con unos 60 volcanes activos registrados.")
        ),
        BilingualQuestion(
            id = 12378, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'Île de Baffin se trouve en??", listOf("Groenland", "Canada", "Islande", "Scandinavie"), "Géographie", "L'île de Baffin est la plus grande île du Canada et fait partie du territoire du Nunavut, dans l'archipel arctique canadien."),
            en = LocalizedContent("Baffin Island is located in?", listOf("Greenland", "Canada", "Iceland", "Scandinavia"), "Geography", "Baffin Island is the largest island in Canada and is part of the territory of Nunavut in the Canadian Arctic Archipelago."),
            zh = LocalizedContent("巴芬岛位于？", listOf("格陵兰", "加拿大", "冰岛", "斯堪的纳维亚"), "地理", "巴芬岛是加拿大最大的岛屿，属于努纳武特地区，位于加拿大北极群岛。"),
            es = LocalizedContent("¿La isla de Baffin se encuentra en?", listOf("Groenlandia", "Canadá", "Islandia", "Escandinavia"), "Geografía", "La isla de Baffin es la isla más grande de Canadá y forma parte del territorio de Nunavut en el archipiélago ártico canadiense.")
        ),
        BilingualQuestion(
            id = 12379, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le lac d'Aral est situé entre la Russie et??", listOf("Chine", "Mongolie", "Kazakhstan et Ouzbékistan", "Afghanistan"), "Géographie", "Le lac d'Aral se trouve en Asie centrale, partagé entre le Kazakhstan au nord et l'Ouzbékistan au sud, et non entre la Russie et un autre pays."),
            en = LocalizedContent("The Aral Sea is located between Russia and??", listOf("China", "Mongolia", "Kazakhstan and Uzbekistan", "Afghanistan"), "Geography", "The Aral Sea is in Central Asia, shared between Kazakhstan to the north and Uzbekistan to the south, not between Russia and another country."),
            zh = LocalizedContent("咸海位于俄罗斯和??之间", listOf("中国", "蒙古", "哈萨克斯坦和乌兹别克斯坦", "阿富汗"), "地理", "咸海位于中亚，北部分属哈萨克斯坦，南部分属乌兹别克斯坦，而非位于俄罗斯与其他国家之间。"),
            es = LocalizedContent("El mar de Aral está situado entre Rusia y??", listOf("China", "Mongolia", "Kazajistán y Uzbekistán", "Afganistán"), "Geografía", "El mar de Aral se encuentra en Asia Central, compartido entre Kazajistán al norte y Uzbekistán al sur, no entre Rusia y otro país.")
        ),
        BilingualQuestion(
            id = 12380, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Mongolie intérieure appartient à quel pays?", listOf("Mongolie", "Chine", "Russie", "Kazakhstan"), "Géographie", "La Mongolie intérieure est une région autonome de la Chine, distincte de la Mongolie, un pays indépendant. Elle fait partie du territoire chinois depuis des siècles."),
            en = LocalizedContent("Inner Mongolia belongs to which country?", listOf("Mongolia", "China", "Russia", "Kazakhstan"), "Geography", "Inner Mongolia is an autonomous region of China, distinct from Mongolia, an independent country. It has been part of Chinese territory for centuries."),
            zh = LocalizedContent("内蒙古属于哪个国家？", listOf("蒙古", "中国", "俄罗斯", "哈萨克斯坦"), "地理", "内蒙古是中国的自治区，与独立国家蒙古不同。它几个世纪以来一直是中国领土的一部分。"),
            es = LocalizedContent("¿A qué país pertenece Mongolia Interior?", listOf("Mongolia", "China", "Rusia", "Kazajistán"), "Geografía", "Mongolia Interior es una región autónoma de China, distinta de Mongolia, un país independiente. Ha sido parte del territorio chino durante siglos.")
        ),
        BilingualQuestion(
            id = 12381, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Pont du Détroit de Qing-Long relie??", listOf("Chine et Corée", "Japon et Chine", "Japon et Russie", "Corée et Russie"), "Géographie", "Ce pont relie l'île japonaise de Hokkaidō à l'île russe de Sakhaline, traversant le détroit de La Pérouse."),
            en = LocalizedContent("The Qing-Long Strait Bridge connects??", listOf("China and Korea", "Japan and China", "Japan and Russia", "Korea and Russia"), "Geography", "This bridge connects the Japanese island of Hokkaido to the Russian island of Sakhalin, crossing the La Pérouse Strait."),
            zh = LocalizedContent("青龙海峡大桥连接??", listOf("中国和朝鲜", "日本和中国", "日本和俄罗斯", "朝鲜和俄罗斯"), "地理", "这座桥连接日本北海道岛和俄罗斯萨哈林岛，横跨拉彼鲁兹海峡。"),
            es = LocalizedContent("El puente del estrecho de Qing-Long conecta??", listOf("China y Corea", "Japón y China", "Japón y Rusia", "Corea y Rusia"), "Geografía", "Este puente conecta la isla japonesa de Hokkaidō con la isla rusa de Sajalín, cruzando el estrecho de La Pérouse.")
        ),
        BilingualQuestion(
            id = 12382, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La réserve naturelle de Galápagos appartient à??", listOf("Équateur", "Pérou", "Colombie", "Chili"), "Géographie", "Les îles Galápagos sont un archipel situé dans l'océan Pacifique, et elles constituent une province de l'Équateur depuis 1832."),
            en = LocalizedContent("The Galápagos Nature Reserve belongs to??", listOf("Ecuador", "Peru", "Colombia", "Chile"), "Geography", "The Galápagos Islands are an archipelago in the Pacific Ocean and have been a province of Ecuador since 1832."),
            zh = LocalizedContent("加拉帕戈斯自然保护区属于??", listOf("厄瓜多尔", "秘鲁", "哥伦比亚", "智利"), "地理", "加拉帕戈斯群岛是太平洋中的一个群岛，自1832年起成为厄瓜多尔的一个省。"),
            es = LocalizedContent("La reserva natural de Galápagos pertenece a??", listOf("Ecuador", "Perú", "Colombia", "Chile"), "Geografía", "Las islas Galápagos son un archipiélago en el océano Pacífico y constituyen una provincia de Ecuador desde 1832.")
        ),
        BilingualQuestion(
            id = 12383, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le Mont-Blanc culmine à environ??", listOf("4500 m", "4700 m", "4800 m", "5000 m"), "Géographie", "Le Mont-Blanc, point culminant des Alpes et d'Europe occidentale, atteint précisément 4 805,59 mètres, mais est souvent arrondi à 4 800 mètres."),
            en = LocalizedContent("Mont Blanc peaks at approximately??", listOf("4500 m", "4700 m", "4800 m", "5000 m"), "Geography", "Mont Blanc, the highest peak in the Alps and Western Europe, reaches exactly 4,805.59 meters, but is often rounded to 4,800 meters."),
            zh = LocalizedContent("勃朗峰海拔大约??", listOf("4500米", "4700米", "4800米", "5000米"), "地理", "勃朗峰是阿尔卑斯山和西欧的最高峰，精确高度为4805.59米，但通常四舍五入为4800米。"),
            es = LocalizedContent("El Mont Blanc culmina aproximadamente a??", listOf("4500 m", "4700 m", "4800 m", "5000 m"), "Geografía", "El Mont Blanc, el pico más alto de los Alpes y de Europa occidental, alcanza exactamente 4.805,59 metros, pero a menudo se redondea a 4.800 metros.")
        ),
        BilingualQuestion(
            id = 12384, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Canyon du Grand Fleuve Colorado mesure environ?", listOf("1000 m", "1500 m", "1800 m", "2000 m"), "Géographie", "Le Grand Canyon, creusé par le fleuve Colorado, atteint une profondeur maximale d'environ 1800 mètres à son point le plus bas, ce qui en fait l'un des canyons les plus profonds du monde."),
            en = LocalizedContent("The Grand Canyon of the Colorado River is about how deep?", listOf("1000 m", "1500 m", "1800 m", "2000 m"), "Geography", "The Grand Canyon, carved by the Colorado River, reaches a maximum depth of about 1800 meters at its lowest point, making it one of the deepest canyons in the world."),
            zh = LocalizedContent("科罗拉多河大峡谷大约有多深？", listOf("1000米", "1500米", "1800米", "2000米"), "地理", "大峡谷由科罗拉多河侵蚀而成，最深处约1800米，是世界上最深的峡谷之一。"),
            es = LocalizedContent("El Gran Cañón del río Colorado tiene aproximadamente una profundidad de?", listOf("1000 m", "1500 m", "1800 m", "2000 m"), "Geografía", "El Gran Cañón, excavado por el río Colorado, alcanza una profundidad máxima de unos 1800 metros en su punto más bajo, lo que lo convierte en uno de los cañones más profundos del mundo.")
        ),
        BilingualQuestion(
            id = 12385, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'archipel des Seychelles comprend environ combien d'îles?", listOf("100", "115", "130", "150"), "Géographie", "L'archipel des Seychelles est composé d'environ 115 îles, principalement granitiques et coralliennes, réparties dans l'océan Indien."),
            en = LocalizedContent("The Seychelles archipelago comprises approximately how many islands?", listOf("100", "115", "130", "150"), "Geography", "The Seychelles archipelago consists of about 115 islands, mainly granitic and coral, scattered in the Indian Ocean."),
            zh = LocalizedContent("塞舌尔群岛大约由多少个岛屿组成？", listOf("100", "115", "130", "150"), "地理", "塞舌尔群岛由大约115个岛屿组成，主要是花岗岩和珊瑚岛，分布在印度洋中。"),
            es = LocalizedContent("El archipiélago de las Seychelles comprende aproximadamente ¿cuántas islas?", listOf("100", "115", "130", "150"), "Geografía", "El archipiélago de las Seychelles está compuesto por unas 115 islas, principalmente graníticas y coralinas, repartidas en el océano Índico.")
        ),
        BilingualQuestion(
            id = 12386, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel manga a inspiré le plus de jeux vidéo?", listOf("Dragon Ball", "One Piece", "Naruto", "Pokémon"), "Culture", "Pokémon, bien qu'étant à l'origine un jeu vidéo, a généré d'innombrables adaptations en manga et en anime, et sa franchise compte le plus grand nombre de jeux vidéo dérivés."),
            en = LocalizedContent("Which manga has inspired the most video games?", listOf("Dragon Ball", "One Piece", "Naruto", "Pokémon"), "Culture", "Pokémon, although originally a video game, has generated countless manga and anime adaptations, and its franchise has the largest number of derivative video games."),
            zh = LocalizedContent("哪部漫画启发了最多的电子游戏？", listOf("龙珠", "海贼王", "火影忍者", "宝可梦"), "文化", "宝可梦虽然最初是电子游戏，但衍生出无数漫画和动画改编，其系列拥有最多的衍生电子游戏。"),
            es = LocalizedContent("¿Qué manga ha inspirado más videojuegos?", listOf("Dragon Ball", "One Piece", "Naruto", "Pokémon"), "Cultura", "Pokémon, aunque originalmente es un videojuego, ha generado innumerables adaptaciones en manga y anime, y su franquicia cuenta con el mayor número de videojuegos derivados.")
        ),
        BilingualQuestion(
            id = 12387, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La BD 'Spawn' a été créée en?", listOf("1989", "1990", "1992", "1993"), "Culture", "Spawn, créée par Todd McFarlane, a été publiée pour la première fois en 1992."),
            en = LocalizedContent("The comic 'Spawn' was created in?", listOf("1989", "1990", "1992", "1993"), "Culture", "Spawn, created by Todd McFarlane, was first published in 1992."),
            zh = LocalizedContent("漫画《再生侠》创作于？", listOf("1989年", "1990年", "1992年", "1993年"), "文化", "《再生侠》由托德·麦克法兰创作，于1992年首次出版。"),
            es = LocalizedContent("El cómic 'Spawn' fue creado en?", listOf("1989", "1990", "1992", "1993"), "Cultura", "Spawn, creado por Todd McFarlane, se publicó por primera vez en 1992.")
        ),
        BilingualQuestion(
            id = 12388, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel jeu de plateau reproduit la dynamique d'une fourmilière?", listOf("Ant Farm", "Agricola", "Food Chain Magnate", "Aucun"), "Culture", "Food Chain Magnate est un jeu de stratégie économique où les joueurs gèrent une chaîne de restauration rapide, mais sa dynamique de compétition pour les ressources et l'expansion évoque le comportement organisé d'une fourmilière."),
            en = LocalizedContent("Which board game reproduces the dynamics of an anthill?", listOf("Ant Farm", "Agricola", "Food Chain Magnate", "None"), "Culture", "Food Chain Magnate is an economic strategy game where players manage a fast-food chain, but its dynamics of competition for resources and expansion evoke the organized behavior of an anthill."),
            zh = LocalizedContent("哪款棋盘游戏再现了蚁丘的动态？", listOf("蚂蚁农场", "农家乐", "食物链大亨", "无"), "文化", "《食物链大亨》是一款经济策略游戏，玩家管理快餐连锁店，但其资源竞争和扩张的动态让人联想到蚁丘的有组织行为。"),
            es = LocalizedContent("¿Qué juego de mesa reproduce la dinámica de un hormiguero?", listOf("Ant Farm", "Agricola", "Food Chain Magnate", "Ninguno"), "Cultura", "Food Chain Magnate es un juego de estrategia económica donde los jugadores gestionan una cadena de comida rápida, pero su dinámica de competencia por recursos y expansión evoca el comportamiento organizado de un hormiguero.")
        ),
        BilingualQuestion(
            id = 12389, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le manga 'Slam Dunk' parle de quel sport?", listOf("Badminton", "Volleyball", "Basketball", "Tennis"), "Culture", "Slam Dunk suit l'équipe de basketball du lycée Shohoku, centrée sur le personnage de Hanamichi Sakuragi."),
            en = LocalizedContent("The manga 'Slam Dunk' is about which sport?", listOf("Badminton", "Volleyball", "Basketball", "Tennis"), "Culture", "Slam Dunk follows the Shohoku High School basketball team, centered on the character Hanamichi Sakuragi."),
            zh = LocalizedContent("漫画《灌篮高手》是关于哪项运动的？", listOf("羽毛球", "排球", "篮球", "网球"), "文化", "《灌篮高手》讲述了湘北高中篮球队的故事，主角是樱木花道。"),
            es = LocalizedContent("El manga 'Slam Dunk' trata sobre ¿qué deporte?", listOf("Bádminton", "Voleibol", "Baloncesto", "Tenis"), "Cultura", "Slam Dunk sigue al equipo de baloncesto del instituto Shohoku, centrado en el personaje de Hanamichi Sakuragi.")
        ),
        BilingualQuestion(
            id = 12390, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le 'Cardamome noir' est originaire de??", listOf("Inde", "Guatemala", "Indonésie", "Madagascar"), "Culture", "Le cardamome noir est principalement cultivé au Guatemala, qui en est le premier producteur mondial, bien que son origine botanique soit en Asie du Sud."),
            en = LocalizedContent("Where does 'Black Cardamom' originate?", listOf("India", "Guatemala", "Indonesia", "Madagascar"), "Culture", "Black cardamom is mainly cultivated in Guatemala, which is the world's largest producer, although its botanical origin is in South Asia."),
            zh = LocalizedContent("“黑豆蔻”原产于哪里？", listOf("印度", "危地马拉", "印度尼西亚", "马达加斯加"), "文化", "黑豆蔻主要种植在危地马拉，该国是全球最大的生产国，尽管其植物学起源在南亚。"),
            es = LocalizedContent("¿De dónde es originario el 'Cardamomo negro'?", listOf("India", "Guatemala", "Indonesia", "Madagascar"), "Cultura", "El cardamomo negro se cultiva principalmente en Guatemala, que es el mayor productor mundial, aunque su origen botánico está en el sur de Asia.")
        ),
        BilingualQuestion(
            id = 12391, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel anime fut adapté en film live-action le premier?", listOf("Dragon Ball", "Death Note", "Ghost in the Shell", "Alita"), "Culture", "Ghost in the Shell, sorti en 1995, a été adapté en film live-action en 2017, mais l'anime original a été le premier de son genre à recevoir une adaptation en prise de vues réelles, précédant d'autres franchises comme Dragon Ball ou Death Note."),
            en = LocalizedContent("Which anime was adapted into a live-action film first?", listOf("Dragon Ball", "Death Note", "Ghost in the Shell", "Alita"), "Culture", "Ghost in the Shell, released in 1995, was adapted into a live-action film in 2017, but the original anime was the first of its kind to receive a live-action adaptation, preceding other franchises like Dragon Ball or Death Note."),
            zh = LocalizedContent("哪部动漫最先被改编成真人电影？", listOf("龙珠", "死亡笔记", "攻壳机动队", "阿丽塔"), "文化", "《攻壳机动队》于1995年上映，2017年被改编成真人电影，但这部原创动漫是同类中最早被改编成真人版的，早于《龙珠》或《死亡笔记》等其他系列。"),
            es = LocalizedContent("¿Qué anime fue adaptado a una película de acción real primero?", listOf("Dragon Ball", "Death Note", "Ghost in the Shell", "Alita"), "Cultura", "Ghost in the Shell, estrenado en 1995, fue adaptado a una película de acción real en 2017, pero el anime original fue el primero de su tipo en recibir una adaptación de imagen real, precediendo a otras franquicias como Dragon Ball o Death Note.")
        ),
        BilingualQuestion(
            id = 12392, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La BD 'Hellboy' a été créée par??", listOf("Mike Mignola", "Alan Moore", "Frank Miller", "Todd McFarlane"), "Culture", "Mike Mignola a créé le personnage d'Hellboy en 1993 pour les éditions Dark Horse Comics."),
            en = LocalizedContent("The comic 'Hellboy' was created by?", listOf("Mike Mignola", "Alan Moore", "Frank Miller", "Todd McFarlane"), "Culture", "Mike Mignola created the character Hellboy in 1993 for Dark Horse Comics."),
            zh = LocalizedContent("漫画《地狱男爵》是由谁创作的？", listOf("迈克·米格诺拉", "艾伦·摩尔", "弗兰克·米勒", "托德·麦克法兰"), "文化", "迈克·米格诺拉于1993年为黑马漫画创作了地狱男爵这个角色。"),
            es = LocalizedContent("El cómic 'Hellboy' fue creado por?", listOf("Mike Mignola", "Alan Moore", "Frank Miller", "Todd McFarlane"), "Cultura", "Mike Mignola creó el personaje de Hellboy en 1993 para Dark Horse Comics.")
        ),
        BilingualQuestion(
            id = 12393, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel jeu de plateau utilise des tuiles pour construire?", listOf("Monopoly", "Carcassonne", "Ticket to Ride", "Splendor"), "Culture", "Dans Carcassonne, les joueurs placent à tour de rôle des tuiles représentant des paysages pour construire des villes, des routes et des champs."),
            en = LocalizedContent("Which board game uses tiles to build?", listOf("Monopoly", "Carcassonne", "Ticket to Ride", "Splendor"), "Culture", "In Carcassonne, players take turns placing landscape tiles to build cities, roads, and fields."),
            zh = LocalizedContent("哪款桌游使用板块进行建造？", listOf("大富翁", "卡卡颂", "车票之旅", "璀璨宝石"), "文化", "在《卡卡颂》中，玩家轮流放置地形板块来建造城市、道路和田野。"),
            es = LocalizedContent("¿Qué juego de mesa utiliza fichas para construir?", listOf("Monopoly", "Carcassonne", "Ticket to Ride", "Splendor"), "Cultura", "En Carcassonne, los jugadores colocan por turnos fichas de paisaje para construir ciudades, caminos y campos.")
        ),
        BilingualQuestion(
            id = 12394, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Le 'Poivre noir' est originaire de??", listOf("Inde", "Vietnam", "Indonésie", "Madagascar"), "Culture", "Le poivre noir est originaire de la côte de Malabar, dans le sud-ouest de l'Inde, où il est cultivé depuis l'Antiquité."),
            en = LocalizedContent("Where does 'Black Pepper' originate?", listOf("India", "Vietnam", "Indonesia", "Madagascar"), "Culture", "Black pepper originates from the Malabar coast in southwestern India, where it has been cultivated since ancient times."),
            zh = LocalizedContent("“黑胡椒”原产于哪里？", listOf("印度", "越南", "印度尼西亚", "马达加斯加"), "文化", "黑胡椒原产于印度西南部的马拉巴尔海岸，自古以来就在那里种植。"),
            es = LocalizedContent("¿De dónde es originaria la 'Pimienta negra'?", listOf("India", "Vietnam", "Indonesia", "Madagascar"), "Cultura", "La pimienta negra es originaria de la costa de Malabar en el suroeste de la India, donde se cultiva desde la antigüedad.")
        ),
        BilingualQuestion(
            id = 12395, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel anime compte plus de 900 épisodes?", listOf("One Piece", "Naruto", "Bleach", "Detective Conan"), "Culture", "One Piece est une série d'anime japonaise diffusée depuis 1999, et elle dépasse les 900 épisodes en raison de sa longévité et de son immense popularité mondiale."),
            en = LocalizedContent("Which anime has over 900 episodes?", listOf("One Piece", "Naruto", "Bleach", "Detective Conan"), "Culture", "One Piece is a Japanese anime series that has been airing since 1999, and it exceeds 900 episodes due to its longevity and immense global popularity."),
            zh = LocalizedContent("哪部动漫有超过900集？", listOf("海贼王", "火影忍者", "死神", "名侦探柯南"), "文化", "《海贼王》是一部自1999年开始播出的日本动漫系列，由于其长寿和巨大的全球人气，集数已超过900集。"),
            es = LocalizedContent("¿Qué anime tiene más de 900 episodios?", listOf("One Piece", "Naruto", "Bleach", "Detective Conan"), "Cultura", "One Piece es una serie de anime japonesa que se emite desde 1999 y supera los 900 episodios debido a su longevidad e inmensa popularidad mundial.")
        ),
        BilingualQuestion(
            id = 12396, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La BD 'Walking Dead' comporte combien de volumes?", listOf("20", "25", "30", "35"), "Culture", "La série de bandes dessinées The Walking Dead, créée par Robert Kirkman, compte 193 numéros regroupés en 30 volumes reliés."),
            en = LocalizedContent("How many volumes does the comic 'The Walking Dead' have?", listOf("20", "25", "30", "35"), "Culture", "The Walking Dead comic series, created by Robert Kirkman, has 193 issues collected into 30 bound volumes."),
            zh = LocalizedContent("漫画《行尸走肉》有多少卷？", listOf("20", "25", "30", "35"), "文化", "由罗伯特·柯克曼创作的《行尸走肉》漫画系列共有193期，收录在30卷合订本中。"),
            es = LocalizedContent("¿Cuántos volúmenes tiene el cómic 'The Walking Dead'?", listOf("20", "25", "30", "35"), "Cultura", "La serie de cómics The Walking Dead, creada por Robert Kirkman, tiene 193 números recopilados en 30 volúmenes.")
        ),
        BilingualQuestion(
            id = 12397, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel jeu de plateau est basé sur la création de routes?", listOf("Monopoly", "Ticket to Ride", "Agricola", "Catan"), "Culture", "Ticket to Ride est un jeu de société où les joueurs collectent des cartes de wagons pour relier des villes sur une carte, l'objectif étant de créer des routes ferroviaires."),
            en = LocalizedContent("Which board game is based on building routes?", listOf("Monopoly", "Ticket to Ride", "Agricola", "Catan"), "Culture", "Ticket to Ride is a board game where players collect train car cards to connect cities on a map, with the goal of creating railway routes."),
            zh = LocalizedContent("哪款桌游是基于建造路线的？", listOf("大富翁", "车票之旅", "农场主", "卡坦岛"), "文化", "《车票之旅》是一款桌游，玩家收集火车卡牌来连接地图上的城市，目标是创建铁路路线。"),
            es = LocalizedContent("¿Qué juego de mesa se basa en la creación de rutas?", listOf("Monopoly", "Ticket to Ride", "Agricola", "Catan"), "Cultura", "Ticket to Ride es un juego de mesa donde los jugadores recolectan cartas de vagones para conectar ciudades en un mapa, con el objetivo de crear rutas ferroviarias.")
        ),
        BilingualQuestion(
            id = 12398, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le 'Clou de girofle' est originaire de??", listOf("Inde", "Malaisie", "Indonésie", "Madagascar"), "Culture", "Le clou de girofle est originaire des îles Moluques en Indonésie, où il était déjà utilisé dans l'Antiquité pour ses propriétés aromatiques et médicinales."),
            en = LocalizedContent("Where does 'Clove' originate?", listOf("India", "Malaysia", "Indonesia", "Madagascar"), "Culture", "Clove is native to the Maluku Islands in Indonesia, where it was used in ancient times for its aromatic and medicinal properties."),
            zh = LocalizedContent("“丁香”原产于哪里？", listOf("印度", "马来西亚", "印度尼西亚", "马达加斯加"), "文化", "丁香原产于印度尼西亚的马鲁古群岛，在古代就被用于其芳香和药用特性。"),
            es = LocalizedContent("¿De dónde es originario el 'Clavo de olor'?", listOf("India", "Malasia", "Indonesia", "Madagascar"), "Cultura", "El clavo de olor es originario de las Islas Molucas en Indonesia, donde se usaba en la antigüedad por sus propiedades aromáticas y medicinales.")
        ),
        BilingualQuestion(
            id = 12399, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel anime a conquis le public occidental le premier?", listOf("Akira", "Gundam", "Dragon Ball Z", "Sailor Moon"), "Culture", "Sorti en 1988, Akira a été l'un des premiers films d'animation japonaise à connaître un large succès en Occident, notamment grâce à sa diffusion en vidéo et son esthétique révolutionnaire."),
            en = LocalizedContent("Which anime first conquered the Western audience?", listOf("Akira", "Gundam", "Dragon Ball Z", "Sailor Moon"), "Culture", "Released in 1988, Akira was one of the first Japanese animated films to achieve widespread success in the West, thanks to its video release and revolutionary aesthetics."),
            zh = LocalizedContent("哪部动漫最先征服了西方观众？", listOf("阿基拉", "高达", "龙珠Z", "美少女战士"), "文化", "1988年上映的《阿基拉》是最早在西方取得广泛成功的日本动画电影之一，得益于其录像带发行和革命性的美学风格。"),
            es = LocalizedContent("¿Qué anime conquistó primero al público occidental?", listOf("Akira", "Gundam", "Dragon Ball Z", "Sailor Moon"), "Cultura", "Estrenada en 1988, Akira fue una de las primeras películas de animación japonesa en lograr un gran éxito en Occidente, gracias a su distribución en vídeo y su estética revolucionaria.")
        ),
        BilingualQuestion(
            id = 12400, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La BD 'Watchmen' a été écrite par??", listOf("Frank Miller", "Alan Moore", "Grant Morrison", "Neil Gaiman"), "Culture", "Alan Moore est le scénariste britannique de la bande dessinée Watchmen, publiée en 1986-1987, qui a révolutionné le genre des super-héros par sa complexité narrative et ses thèmes adultes."),
            en = LocalizedContent("The comic 'Watchmen' was written by?", listOf("Frank Miller", "Alan Moore", "Grant Morrison", "Neil Gaiman"), "Culture", "Alan Moore is the British writer of the comic Watchmen, published in 1986-1987, which revolutionized the superhero genre with its narrative complexity and adult themes."),
            zh = LocalizedContent("漫画《守望者》由谁创作？", listOf("弗兰克·米勒", "艾伦·摩尔", "格兰特·莫里森", "尼尔·盖曼"), "文化", "艾伦·摩尔是漫画《守望者》的英国编剧，该漫画于1986-1987年出版，以其叙事复杂性和成人主题革新了超级英雄类型。"),
            es = LocalizedContent("¿Quién escribió el cómic 'Watchmen'?", listOf("Frank Miller", "Alan Moore", "Grant Morrison", "Neil Gaiman"), "Cultura", "Alan Moore es el guionista británico del cómic Watchmen, publicado en 1986-1987, que revolucionó el género de superhéroes por su complejidad narrativa y temas adultos.")
        ),
        BilingualQuestion(
            id = 12401, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En athlétisme, quel type de course dépasse 50 km?", listOf("Marche athlétique", "Course à pied", "Steeple chase", "Cross"), "Sport", "En athlétisme, la marche athlétique est la seule discipline de course où les distances officielles dépassent 50 km, avec des épreuves allant jusqu'à 100 km."),
            en = LocalizedContent("In athletics, which type of race exceeds 50 km?", listOf("Race walking", "Running", "Steeplechase", "Cross country"), "Sports", "In athletics, race walking is the only discipline where official distances exceed 50 km, with events up to 100 km."),
            zh = LocalizedContent("在田径运动中，哪种比赛距离超过50公里？", listOf("竞走", "跑步", "障碍赛", "越野跑"), "体育", "在田径运动中，竞走是唯一官方距离超过50公里的项目，比赛距离可达100公里。"),
            es = LocalizedContent("En atletismo, ¿qué tipo de carrera supera los 50 km?", listOf("Marcha atlética", "Carrera a pie", "Carrera de obstáculos", "Campo a través"), "Deportes", "En atletismo, la marcha atlética es la única disciplina donde las distancias oficiales superan los 50 km, con pruebas de hasta 100 km.")
        ),
        BilingualQuestion(
            id = 12402, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le tir à la corde était un sport olympique jusqu'en??", listOf("1920", "1930", "1940", "1950"), "Sport", "Le tir à la corde a été retiré du programme olympique après les Jeux de 1920 à Anvers, où il a connu sa dernière apparition officielle."),
            en = LocalizedContent("Tug of war was an Olympic sport until?", listOf("1920", "1930", "1940", "1950"), "Sports", "Tug of war was removed from the Olympic program after the 1920 Antwerp Games, where it made its last official appearance."),
            zh = LocalizedContent("拔河作为奥运项目持续到哪一年？", listOf("1920", "1930", "1940", "1950"), "体育", "拔河在1920年安特卫普奥运会后从奥运项目中移除，那是它最后一次正式亮相。"),
            es = LocalizedContent("¿Hasta qué año fue el tira y afloja un deporte olímpico?", listOf("1920", "1930", "1940", "1950"), "Deportes", "El tira y afloja fue retirado del programa olímpico tras los Juegos de Amberes de 1920, donde tuvo su última aparición oficial.")
        ),
        BilingualQuestion(
            id = 12403, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel sport ancien utilisait un filet pour piéger les animaux?", listOf("Chasse", "Lutte", "Aucun", "Pêche"), "Sport", "La chasse au filet est une pratique ancestrale, utilisée bien avant l'invention des armes à feu, pour capturer des animaux sauvages vivants."),
            en = LocalizedContent("Which ancient sport used a net to trap animals?", listOf("Hunting", "Wrestling", "None", "Fishing"), "Sports", "Net hunting is an ancient practice, used long before the invention of firearms, to capture wild animals alive."),
            zh = LocalizedContent("哪种古代运动使用网来捕捉动物？", listOf("狩猎", "摔跤", "无", "钓鱼"), "体育", "网猎是一种古老的做法，早在火器发明之前就被用来活捉野生动物。"),
            es = LocalizedContent("¿Qué deporte antiguo usaba una red para atrapar animales?", listOf("Caza", "Lucha", "Ninguno", "Pesca"), "Deportes", "La caza con red es una práctica ancestral, utilizada mucho antes de la invención de las armas de fuego, para capturar animales salvajes vivos.")
        ),
        BilingualQuestion(
            id = 12404, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La pelote basque se joue dans un terrain appelé??", listOf("Court", "Trinquet", "Fronton", "Piste"), "Sport", "Le fronton est le nom du mur contre lequel la balle est lancée dans la pelote basque, donnant son nom au terrain de jeu."),
            en = LocalizedContent("Basque pelota is played on a court called?", listOf("Court", "Trinquet", "Fronton", "Piste"), "Sports", "The fronton is the wall against which the ball is thrown in Basque pelota, giving its name to the playing field."),
            zh = LocalizedContent("巴斯克回力球在什么场地上进行？", listOf("球场", "三面墙球场", "前墙球场", "赛道"), "体育", "前墙（fronton）是巴斯克回力球中球被掷向的墙壁，球场也因此得名。"),
            es = LocalizedContent("¿Cómo se llama la cancha donde se juega a la pelota vasca?", listOf("Cancha", "Trinquete", "Frontón", "Pista"), "Deportes", "El frontón es el muro contra el que se lanza la pelota en la pelota vasca, dando nombre al terreno de juego.")
        ),
        BilingualQuestion(
            id = 12405, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le sport du 'Tamburello' vient de??", listOf("Italie", "Espagne", "France", "Suisse"), "Sport", "Le tamburello est un sport de balle d'origine italienne, dérivé du jeu de paume, pratiqué avec un tambourin en bois."),
            en = LocalizedContent("The sport 'Tamburello' comes from?", listOf("Italy", "Spain", "France", "Switzerland"), "Sports", "Tamburello is a ball sport of Italian origin, derived from jeu de paume, played with a wooden tambourine."),
            zh = LocalizedContent("“坦布雷洛”运动起源于哪里？", listOf("意大利", "西班牙", "法国", "瑞士"), "体育", "坦布雷洛是一项源自意大利的球类运动，由网球演变而来，使用木制鼓槌击球。"),
            es = LocalizedContent("¿De dónde proviene el deporte 'Tamburello'?", listOf("Italia", "España", "Francia", "Suiza"), "Deportes", "El tamburello es un deporte de pelota de origen italiano, derivado del juego de palma, que se practica con un tamborín de madera.")
        ),
        BilingualQuestion(
            id = 12406, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En rugby sevens, les matchs durent??", listOf("20 min", "30 min", "40 min", "50 min"), "Sport", "Le rugby à sept se joue en deux mi-temps de sept minutes chacune, soit quatorze minutes de jeu effectif, mais les arrêts de jeu portent la durée totale à environ trente minutes."),
            en = LocalizedContent("In rugby sevens, matches last?", listOf("20 min", "30 min", "40 min", "50 min"), "Sports", "Rugby sevens is played in two halves of seven minutes each, totaling fourteen minutes of play, but stoppages extend the total duration to about thirty minutes."),
            zh = LocalizedContent("七人制橄榄球比赛持续多长时间？", listOf("20分钟", "30分钟", "40分钟", "50分钟"), "体育", "七人制橄榄球分为上下半场各7分钟，共14分钟比赛时间，但加上暂停等，总时长约为30分钟。"),
            es = LocalizedContent("¿Cuánto duran los partidos de rugby sevens?", listOf("20 min", "30 min", "40 min", "50 min"), "Deportes", "El rugby a siete se juega en dos mitades de siete minutos cada una, totalizando catorce minutos de juego, pero las interrupciones alargan la duración total a unos treinta minutos.")
        ),
        BilingualQuestion(
            id = 12407, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le netball est une variante de??", listOf("Basket-ball", "Handball", "Volley-ball", "Softball"), "Sport", "Le netball est dérivé du basket-ball, inventé en 1891 par James Naismith, mais adapté avec des règles spécifiques comme l'interdiction de dribbler."),
            en = LocalizedContent("Netball is a variant of?", listOf("Basketball", "Handball", "Volleyball", "Softball"), "Sports", "Netball is derived from basketball, invented in 1891 by James Naismith, but adapted with specific rules such as the prohibition of dribbling."),
            zh = LocalizedContent("无挡板篮球是哪项运动的变体？", listOf("篮球", "手球", "排球", "垒球"), "体育", "无挡板篮球源自篮球，由詹姆斯·奈史密斯于1891年发明，但经过改编，有特定规则如禁止运球。"),
            es = LocalizedContent("¿El netball es una variante de qué deporte?", listOf("Baloncesto", "Balonmano", "Voleibol", "Sóftbol"), "Deportes", "El netball deriva del baloncesto, inventado en 1891 por James Naismith, pero adaptado con reglas específicas como la prohibición de driblar.")
        ),
        BilingualQuestion(
            id = 12408, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En badminton, les plumes d'un volant de compétition viennent d'oiseaux??", listOf("Poules", "Oies", "Canards", "Dindons"), "Sport", "Les volants de compétition sont fabriqués à partir de plumes d'oie, car elles offrent une meilleure stabilité et durabilité que celles d'autres oiseaux."),
            en = LocalizedContent("In badminton, the feathers of a competition shuttlecock come from which birds?", listOf("Chickens", "Geese", "Ducks", "Turkeys"), "Sports", "Competition shuttlecocks are made from goose feathers, as they offer better stability and durability than those from other birds."),
            zh = LocalizedContent("在羽毛球比赛中，比赛用球的羽毛来自哪种鸟？", listOf("鸡", "鹅", "鸭", "火鸡"), "体育", "比赛用羽毛球由鹅毛制成，因为鹅毛比其他鸟类的羽毛更稳定、更耐用。"),
            es = LocalizedContent("En bádminton, las plumas de un volante de competición provienen de qué aves?", listOf("Gallinas", "Gansos", "Patos", "Pavos"), "Deportes", "Los volantes de competición están hechos de plumas de ganso, ya que ofrecen mejor estabilidad y durabilidad que las de otras aves.")
        ),
        BilingualQuestion(
            id = 12409, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le sport du 'Kin-Ball' utilise un ballon de combien de diamètre?", listOf("1 m", "1.2 m", "1.5 m", "2 m"), "Sport", "Le Kin-Ball se joue avec un ballon gonflable de 1,5 mètre de diamètre, ce qui en fait l’un des plus gros ballons utilisés dans un sport collectif."),
            en = LocalizedContent("The sport of 'Kin-Ball' uses a ball of what diameter?", listOf("1 m", "1.2 m", "1.5 m", "2 m"), "Sports", "Kin-Ball is played with an inflatable ball 1.5 meters in diameter, making it one of the largest balls used in a team sport."),
            zh = LocalizedContent("“Kin-Ball”运动使用的球直径是多少？", listOf("1米", "1.2米", "1.5米", "2米"), "体育", "Kin-Ball使用一个直径1.5米的充气球，是团体运动中使用的最大球之一。"),
            es = LocalizedContent("El deporte del 'Kin-Ball' utiliza un balón de ¿cuánto diámetro?", listOf("1 m", "1.2 m", "1.5 m", "2 m"), "Deportes", "El Kin-Ball se juega con un balón inflable de 1,5 metros de diámetro, lo que lo convierte en uno de los balones más grandes utilizados en un deporte de equipo.")
        ),
        BilingualQuestion(
            id = 12410, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La luge comprend un sport appelé 'skeleton' où??", listOf("On monte à deux", "On descend tête en avant", "On descend sur les hanches", "On monte à quatre"), "Sport", "Contrairement à la luge classique où l'on descend sur le dos, les pieds en avant, le skeleton se pratique tête en avant, à plat ventre sur un petit traîneau."),
            en = LocalizedContent("Luge includes a sport called 'skeleton' where?", listOf("You ride in pairs", "You go head first", "You go on your hips", "You ride in fours"), "Sports", "Unlike classic luge where you go on your back, feet first, skeleton is practiced head first, lying face down on a small sled."),
            zh = LocalizedContent("雪橇运动包括一项名为“钢架雪车”的项目，其中？", listOf("两人乘坐", "头朝下前进", "用臀部滑行", "四人乘坐"), "体育", "与经典雪橇不同，钢架雪车是头朝下、俯卧在小雪橇上进行的。"),
            es = LocalizedContent("El trineo incluye un deporte llamado 'skeleton' donde?", listOf("Se monta en parejas", "Se desciende cabeza abajo", "Se desciende sobre las caderas", "Se monta en cuartetos"), "Deportes", "A diferencia del trineo clásico donde se desciende boca arriba, con los pies hacia adelante, el skeleton se practica cabeza abajo, boca abajo sobre un pequeño trineo.")
        ),
        BilingualQuestion(
            id = 12411, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le cyclisme sur piste comprend l'épreuve du 'Keirin' originaire de??", listOf("Japon", "Taïwan", "Chine", "Corée"), "Sport", "Le Keirin a été inventé au Japon dans les années 1940 pour les paris hippiques, avant de devenir une discipline olympique."),
            en = LocalizedContent("Track cycling includes the 'Keirin' event originating from?", listOf("Japan", "Taiwan", "China", "Korea"), "Sports", "Keirin was invented in Japan in the 1940s for horse racing betting, before becoming an Olympic discipline."),
            zh = LocalizedContent("场地自行车包括起源于哪里的“凯林赛”？", listOf("日本", "台湾", "中国", "韩国"), "体育", "凯林赛于20世纪40年代在日本为赛马博彩发明，后来成为奥运会项目。"),
            es = LocalizedContent("El ciclismo en pista incluye la prueba del 'Keirin' originaria de?", listOf("Japón", "Taiwán", "China", "Corea"), "Deportes", "El Keirin fue inventado en Japón en la década de 1940 para las apuestas de carreras de caballos, antes de convertirse en una disciplina olímpica.")
        ),
        BilingualQuestion(
            id = 12412, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En tir sportif, la discipline du 'skeet shooting' utilise des cibles appelées??", listOf("Pigeon", "Plateaux", "Balles", "Cylindres"), "Sport", "Au skeet, les cibles sont des plateaux d'argile lancés en l'air, imitant le vol d'oiseaux. Le terme \"plateaux\" désigne ces disques fragiles que les tireurs doivent briser."),
            en = LocalizedContent("In shooting sports, the discipline of 'skeet shooting' uses targets called?", listOf("Pigeon", "Clays", "Balls", "Cylinders"), "Sports", "In skeet, targets are clay discs launched into the air, imitating bird flight. The term 'clays' refers to these fragile discs that shooters must break."),
            zh = LocalizedContent("在射击运动中，“双向飞碟”项目使用的目标称为？", listOf("鸽子", "碟靶", "球", "圆柱"), "体育", "在双向飞碟中，目标是抛向空中的粘土碟，模仿鸟类飞行。“碟靶”一词指这些易碎的碟子，射手必须击碎它们。"),
            es = LocalizedContent("En tiro deportivo, la disciplina de 'skeet shooting' utiliza blancos llamados?", listOf("Paloma", "Platos", "Bolas", "Cilindros"), "Deportes", "En el skeet, los blancos son platos de arcilla lanzados al aire, imitando el vuelo de las aves. El término 'platos' designa estos discos frágiles que los tiradores deben romper.")
        ),
        BilingualQuestion(
            id = 12413, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le sport du 'Parkour' est originaire de??", listOf("États-Unis", "Japon", "France", "Brésil"), "Sport", "Le parkour a été développé en France dans les années 1980 par David Belle et d'autres pratiquants, s'inspirant de la méthode naturelle d'entraînement militaire de Georges Hébert."),
            en = LocalizedContent("The sport of 'Parkour' originated from?", listOf("United States", "Japan", "France", "Brazil"), "Sports", "Parkour was developed in France in the 1980s by David Belle and other practitioners, inspired by Georges Hébert's natural method of military training."),
            zh = LocalizedContent("“跑酷”运动起源于？", listOf("美国", "日本", "法国", "巴西"), "体育", "跑酷于20世纪80年代在法国由大卫·贝尔等人发展起来，灵感来自乔治·赫伯特的自然军事训练方法。"),
            es = LocalizedContent("El deporte del 'Parkour' es originario de?", listOf("Estados Unidos", "Japón", "Francia", "Brasil"), "Deportes", "El parkour fue desarrollado en Francia en la década de 1980 por David Belle y otros practicantes, inspirándose en el método natural de entrenamiento militar de Georges Hébert.")
        ),
        BilingualQuestion(
            id = 12414, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En escalade, le record de profondeur en apnée est de??", listOf("100 m", "200 m", "300 m", "400 m"), "Sport", "Le record du monde d'apnée en profondeur, établi en 2022 par Arnaud Jerald, atteint 300 mètres en poids constant bi-palmes, une performance majeure dans cette discipline extrême."),
            en = LocalizedContent("In freediving, the depth record is?", listOf("100 m", "200 m", "300 m", "400 m"), "Sports", "The world record for freediving depth, set in 2022 by Arnaud Jerald, reaches 300 meters in constant weight bifins, a major performance in this extreme discipline."),
            zh = LocalizedContent("在自由潜水中，深度记录是多少？", listOf("100米", "200米", "300米", "400米"), "体育", "自由潜水深度世界纪录由阿尔诺·杰拉尔德于2022年创造，达到300米（恒重双蹼），是这项极限运动中的重大成就。"),
            es = LocalizedContent("En apnea, el récord de profundidad es de?", listOf("100 m", "200 m", "300 m", "400 m"), "Deportes", "El récord mundial de profundidad en apnea, establecido en 2022 por Arnaud Jerald, alcanza los 300 metros en peso constante con bi-aletas, una actuación importante en esta disciplina extrema.")
        ),
        BilingualQuestion(
            id = 12415, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La plongée technique explore des profondeurs de??", listOf("100 m", "200 m", "300 m", "400 m"), "Sport", "La plongée technique nécessite un équipement et une formation spécifiques au-delà de 40 mètres, et 200 mètres est une profondeur représentative pour les explorations avancées en recycleur ou mélanges gazeux."),
            en = LocalizedContent("Technical diving explores depths of?", listOf("100 m", "200 m", "300 m", "400 m"), "Sports", "Technical diving requires specific equipment and training beyond 40 meters, and 200 meters is a representative depth for advanced explorations using rebreathers or gas mixtures."),
            zh = LocalizedContent("技术潜水探索的深度是多少？", listOf("100米", "200米", "300米", "400米"), "体育", "技术潜水需要超过40米的特定设备和训练，200米是使用循环呼吸器或混合气体进行高级探索的代表性深度。"),
            es = LocalizedContent("El buceo técnico explora profundidades de?", listOf("100 m", "200 m", "300 m", "400 m"), "Deportes", "El buceo técnico requiere equipo y entrenamiento específicos más allá de los 40 metros, y 200 metros es una profundidad representativa para exploraciones avanzadas con rebreathers o mezclas de gases.")
        ),
        BilingualQuestion(
            id = 12416, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'athlétisme en salle comprend une épreuve de??", listOf("60 m", "100 m", "150 m", "200 m"), "Sport", "Le 60 mètres est l'épreuve reine du sprint en salle, car la piste intérieure ne permet pas une distance de 100 mètres comme en extérieur."),
            en = LocalizedContent("Indoor athletics includes an event of?", listOf("60 m", "100 m", "150 m", "200 m"), "Sports", "The 60 meters is the premier sprint event indoors, as the indoor track does not allow a distance of 100 meters like outdoors."),
            zh = LocalizedContent("室内田径包括什么项目？", listOf("60米", "100米", "150米", "200米"), "体育", "60米是室内短跑的主要项目，因为室内跑道不允许像室外那样进行100米比赛。"),
            es = LocalizedContent("El atletismo en sala incluye una prueba de?", listOf("60 m", "100 m", "150 m", "200 m"), "Deportes", "Los 60 metros son la prueba reina del sprint en pista cubierta, ya que la pista interior no permite una distancia de 100 metros como al aire libre.")
        ),
        BilingualQuestion(
            id = 12417, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En biathlon, la boucle de ski de fond mesure??", listOf("2 km", "2.5 km", "3 km", "3.5 km"), "Sport", "En biathlon, la boucle de ski de fond mesure 3 km pour les épreuves individuelles, une distance standardisée permettant d'enchaîner les tirs et les tours de piste."),
            en = LocalizedContent("In biathlon, the cross-country skiing loop measures?", listOf("2 km", "2.5 km", "3 km", "3.5 km"), "Sports", "In biathlon, the cross-country skiing loop measures 3 km for individual events, a standardized distance allowing for alternating shooting and laps."),
            zh = LocalizedContent("在冬季两项中，越野滑雪的环道长度是多少？", listOf("2公里", "2.5公里", "3公里", "3.5公里"), "体育", "在冬季两项中，个人项目的越野滑雪环道长度为3公里，这是一个标准距离，便于交替进行射击和滑行。"),
            es = LocalizedContent("En biatlón, el bucle de esquí de fondo mide?", listOf("2 km", "2.5 km", "3 km", "3.5 km"), "Deportes", "En biatlón, el bucle de esquí de fondo mide 3 km para las pruebas individuales, una distancia estandarizada que permite alternar tiros y vueltas.")
        ),
        BilingualQuestion(
            id = 12418, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le javelot olympique doit dépasser une longueur de??", listOf("150 cm", "180 cm", "200 cm", "220 cm"), "Sport", "Le javelot masculin doit mesurer entre 260 et 270 cm, tandis que le javelot féminin fait entre 220 et 230 cm. Aucune longueur minimale de 200 cm n'est requise dans les règles olympiques."),
            en = LocalizedContent("The Olympic javelin must exceed a length of?", listOf("150 cm", "180 cm", "200 cm", "220 cm"), "Sports", "The men's javelin must measure between 260 and 270 cm, while the women's javelin is between 220 and 230 cm. No minimum length of 200 cm is required in Olympic rules."),
            zh = LocalizedContent("奥运会标枪的长度必须超过多少？", listOf("150厘米", "180厘米", "200厘米", "220厘米"), "体育", "男子标枪长度必须在260至270厘米之间，女子标枪在220至230厘米之间。奥运会规则中没有要求200厘米的最小长度。"),
            es = LocalizedContent("La jabalina olímpica debe superar una longitud de?", listOf("150 cm", "180 cm", "200 cm", "220 cm"), "Deportes", "La jabalina masculina debe medir entre 260 y 270 cm, mientras que la femenina mide entre 220 y 230 cm. No se requiere una longitud mínima de 200 cm en las reglas olímpicas.")
        ),
        BilingualQuestion(
            id = 12419, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En athlétisme, le saut en longueur utilise une piste d'approche de??", listOf("35 m", "40 m", "45 m", "50 m"), "Sport", "La piste d'approche du saut en longueur mesure 40 mètres pour permettre aux athlètes d'atteindre une vitesse optimale avant l'impulsion."),
            en = LocalizedContent("In athletics, the long jump uses a runway of??", listOf("35 m", "40 m", "45 m", "50 m"), "Sports", "The long jump runway is 40 meters long to allow athletes to reach optimal speed before takeoff."),
            zh = LocalizedContent("在田径运动中，跳远使用的助跑跑道长度为？？", listOf("35米", "40米", "45米", "50米"), "体育", "跳远助跑跑道长40米，以便运动员在起跳前达到最佳速度。"),
            es = LocalizedContent("En atletismo, el salto de longitud utiliza una pista de aproximación de??", listOf("35 m", "40 m", "45 m", "50 m"), "Deportes", "La pista de aproximación del salto de longitud mide 40 metros para permitir a los atletas alcanzar una velocidad óptima antes del impulso.")
        ),
        BilingualQuestion(
            id = 12420, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le cross-country olympique couvre environ??", listOf("6 km", "7 km", "8 km", "10 km"), "Sport", "Le cross-country olympique est une épreuve de VTT disputée sur une distance d'environ 8 km par tour, avec des parcours techniques et vallonnés."),
            en = LocalizedContent("Olympic cross-country covers approximately??", listOf("6 km", "7 km", "8 km", "10 km"), "Sports", "Olympic cross-country is a mountain bike event raced over a distance of about 8 km per lap, with technical and hilly courses."),
            zh = LocalizedContent("奥运会越野赛的赛程大约为？？", listOf("6公里", "7公里", "8公里", "10公里"), "体育", "奥运会越野赛是一项山地自行车赛事，每圈距离约8公里，赛道技术性强且多山。"),
            es = LocalizedContent("El cross-country olímpico cubre aproximadamente??", listOf("6 km", "7 km", "8 km", "10 km"), "Deportes", "El cross-country olímpico es una prueba de ciclismo de montaña disputada en una distancia de aproximadamente 8 km por vuelta, con recorridos técnicos y montañosos.")
        ),
        BilingualQuestion(
            id = 12421, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel éléments chimique a la plus haute densité?", listOf("Osmium", "Iridium", "Platine", "Tungstène"), "Science", "L'osmium est l'élément naturel le plus dense, avec une densité d'environ 22,59 g/cm³, dépassant légèrement l'iridium."),
            en = LocalizedContent("Which chemical element has the highest density?", listOf("Osmium", "Iridium", "Platinum", "Tungsten"), "Science", "Osmium is the densest naturally occurring element, with a density of about 22.59 g/cm³, slightly exceeding iridium."),
            zh = LocalizedContent("哪种化学元素的密度最高？", listOf("锇", "铱", "铂", "钨"), "科学", "锇是密度最大的天然元素，密度约为22.59克/立方厘米，略高于铱。"),
            es = LocalizedContent("¿Qué elemento químico tiene la mayor densidad?", listOf("Osmio", "Iridio", "Platino", "Tungsteno"), "Ciencia", "El osmio es el elemento natural más denso, con una densidad de aproximadamente 22,59 g/cm³, superando ligeramente al iridio.")
        ),
        BilingualQuestion(
            id = 12422, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La cristallographie classe les minéraux en combien de systèmes?", listOf("6", "7", "8", "9"), "Science", "Les sept systèmes cristallins (cubique, tétragonal, orthorhombique, hexagonal, trigonal, monoclinique, triclinique) regroupent tous les minéraux selon leur symétrie géométrique."),
            en = LocalizedContent("Crystallography classifies minerals into how many systems?", listOf("6", "7", "8", "9"), "Science", "The seven crystal systems (cubic, tetragonal, orthorhombic, hexagonal, trigonal, monoclinic, triclinic) group all minerals according to their geometric symmetry."),
            zh = LocalizedContent("晶体学将矿物分为多少个晶系？", listOf("6", "7", "8", "9"), "科学", "七个晶系（立方、四方、正交、六方、三方、单斜、三斜）根据几何对称性对所有矿物进行分组。"),
            es = LocalizedContent("La cristalografía clasifica los minerales en ¿cuántos sistemas?", listOf("6", "7", "8", "9"), "Ciencia", "Los siete sistemas cristalinos (cúbico, tetragonal, ortorrómbico, hexagonal, trigonal, monoclínico, triclínico) agrupan todos los minerales según su simetría geométrica.")
        ),
        BilingualQuestion(
            id = 12423, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La loi de Hooke régit l'élasticité des??", listOf("Fluides", "Solides", "Gaz", "Plasma"), "Science", "La loi de Hooke décrit le comportement élastique des solides, où la déformation est proportionnelle à la contrainte appliquée, tant que la limite d'élasticité n'est pas dépassée."),
            en = LocalizedContent("Hooke's law governs the elasticity of??", listOf("Fluids", "Solids", "Gases", "Plasma"), "Science", "Hooke's law describes the elastic behavior of solids, where deformation is proportional to applied stress, as long as the elastic limit is not exceeded."),
            zh = LocalizedContent("胡克定律支配着哪种物质的弹性？", listOf("流体", "固体", "气体", "等离子体"), "科学", "胡克定律描述了固体的弹性行为，即变形与施加的应力成正比，只要不超过弹性极限。"),
            es = LocalizedContent("La ley de Hooke rige la elasticidad de??", listOf("Fluidos", "Sólidos", "Gases", "Plasma"), "Ciencia", "La ley de Hooke describe el comportamiento elástico de los sólidos, donde la deformación es proporcional a la tensión aplicada, siempre que no se supere el límite elástico.")
        ),
        BilingualQuestion(
            id = 12424, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La réaction de Maillard produit??", listOf("Sucres", "Protéines", "Molécules brunâtres", "Gras"), "Science", "La réaction de Maillard est une réaction chimique entre acides aminés et sucres qui, sous l'effet de la chaleur, génère des composés bruns responsables du goût et de la couleur des aliments cuits."),
            en = LocalizedContent("The Maillard reaction produces??", listOf("Sugars", "Proteins", "Brown molecules", "Fats"), "Science", "The Maillard reaction is a chemical reaction between amino acids and sugars that, under heat, generates brown compounds responsible for the taste and color of cooked foods."),
            zh = LocalizedContent("美拉德反应产生什么？", listOf("糖类", "蛋白质", "褐色分子", "脂肪"), "科学", "美拉德反应是氨基酸和糖类之间的化学反应，在加热下生成褐色化合物，赋予熟食风味和色泽。"),
            es = LocalizedContent("La reacción de Maillard produce??", listOf("Azúcares", "Proteínas", "Moléculas pardas", "Grasas"), "Ciencia", "La reacción de Maillard es una reacción química entre aminoácidos y azúcares que, bajo calor, genera compuestos marrones responsables del sabor y color de los alimentos cocinados.")
        ),
        BilingualQuestion(
            id = 12425, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'énergie de liaision chimique est mesurée en??", listOf("Joules", "Calories", "Kilojoules", "Électronvolts"), "Science", "L'électronvolt est l'unité d'énergie couramment utilisée en physique atomique et chimique pour mesurer les liaisons entre particules, car elle correspond à l'énergie acquise par un électron accéléré par un volt."),
            en = LocalizedContent("Chemical bond energy is measured in??", listOf("Joules", "Calories", "Kilojoules", "Electronvolts"), "Science", "The electronvolt is the unit of energy commonly used in atomic physics and chemistry to measure bonds between particles, as it corresponds to the energy gained by an electron accelerated by one volt."),
            zh = LocalizedContent("化学键能通常用什么单位测量？", listOf("焦耳", "卡路里", "千焦", "电子伏特"), "科学", "电子伏特是原子物理和化学中常用的能量单位，用于测量粒子间的键能，它对应一个电子经一伏特加速所获得的能量。"),
            es = LocalizedContent("La energía de enlace químico se mide en??", listOf("Julios", "Calorías", "Kilojulios", "Electronvoltios"), "Ciencia", "El electronvoltio es la unidad de energía comúnmente utilizada en física atómica y química para medir los enlaces entre partículas, ya que corresponde a la energía adquirida por un electrón acelerado por un voltio.")
        ),
        BilingualQuestion(
            id = 12426, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le modèle atomique de Bohr suppose que l'électron??", listOf("Orbite autour du noyau", "Existe dans un nuage", "Vibre", "Saute entre niveaux"), "Science", "Le modèle de Bohr décrit l'électron comme une particule se déplaçant sur des orbites circulaires et quantifiées autour du noyau, une étape clé dans la physique atomique du début du XXe siècle."),
            en = LocalizedContent("Bohr's atomic model assumes that the electron??", listOf("Orbits the nucleus", "Exists in a cloud", "Vibrates", "Jumps between levels"), "Science", "Bohr's model describes the electron as a particle moving on circular, quantized orbits around the nucleus, a key step in early 20th-century atomic physics."),
            zh = LocalizedContent("玻尔原子模型假设电子如何运动？", listOf("绕核轨道运动", "存在于云中", "振动", "在能级间跳跃"), "科学", "玻尔模型将电子描述为在原子核周围沿圆形量子化轨道运动的粒子，这是20世纪初原子物理学的关键一步。"),
            es = LocalizedContent("El modelo atómico de Bohr supone que el electrón??", listOf("Orbita alrededor del núcleo", "Existe en una nube", "Vibra", "Salta entre niveles"), "Ciencia", "El modelo de Bohr describe el electrón como una partícula que se mueve en órbitas circulares cuantizadas alrededor del núcleo, un paso clave en la física atómica de principios del siglo XX.")
        ),
        BilingualQuestion(
            id = 12427, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La résonance de valence exprime la??", listOf("Position de l'électron", "Délocalisation d'électrons", "Fréquence vibrationnelle", "Vitesse orbitale"), "Science", "En chimie, la résonance de valence décrit la délocalisation des électrons dans une molécule, où plusieurs structures de Lewis contribuent à la représentation réelle de la molécule."),
            en = LocalizedContent("Valence resonance expresses the??", listOf("Position of the electron", "Delocalization of electrons", "Vibrational frequency", "Orbital speed"), "Science", "In chemistry, valence resonance describes the delocalization of electrons in a molecule, where multiple Lewis structures contribute to the actual representation of the molecule."),
            zh = LocalizedContent("价键共振表达的是什么？", listOf("电子的位置", "电子的离域", "振动频率", "轨道速度"), "科学", "在化学中，价键共振描述了分子中电子的离域现象，多个路易斯结构共同构成分子的实际表示。"),
            es = LocalizedContent("La resonancia de valencia expresa la??", listOf("Posición del electrón", "Deslocalización de electrones", "Frecuencia vibracional", "Velocidad orbital"), "Ciencia", "En química, la resonancia de valencia describe la deslocalización de electrones en una molécula, donde varias estructuras de Lewis contribuyen a la representación real de la molécula.")
        ),
        BilingualQuestion(
            id = 12428, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Un isomère structural est une molécule avec??", listOf("Même masse", "Même formule brute", "Même structure", "Même charge"), "Science", "Un isomère structural partage la même formule brute (même nombre d'atomes) mais diffère par l'arrangement de ses liaisons chimiques, ce qui modifie ses propriétés."),
            en = LocalizedContent("A structural isomer is a molecule with??", listOf("Same mass", "Same molecular formula", "Same structure", "Same charge"), "Science", "A structural isomer shares the same molecular formula (same number of atoms) but differs in the arrangement of its chemical bonds, which alters its properties."),
            zh = LocalizedContent("结构异构体是具有相同什么的分子？", listOf("相同质量", "相同分子式", "相同结构", "相同电荷"), "科学", "结构异构体具有相同的分子式（相同数量的原子），但化学键的排列不同，从而改变其性质。"),
            es = LocalizedContent("Un isómero estructural es una molécula con??", listOf("Misma masa", "Misma fórmula molecular", "Misma estructura", "Misma carga"), "Ciencia", "Un isómero estructural comparte la misma fórmula molecular (mismo número de átomos) pero difiere en la disposición de sus enlaces químicos, lo que modifica sus propiedades.")
        ),
    )

    private fun part6(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 12429, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La stéréoisomérie se rapporte à??", listOf("L'arrangement spatial", "La masse molaire", "La charge", "La densité"), "Science", "La stéréoisomérie concerne des molécules avec la même formule développée mais dont les atomes sont disposés différemment dans l'espace."),
            en = LocalizedContent("Stereoisomerism relates to?", listOf("Spatial arrangement", "Molar mass", "Charge", "Density"), "Science", "Stereoisomerism concerns molecules with the same structural formula but whose atoms are arranged differently in space."),
            zh = LocalizedContent("立体异构涉及的是？", listOf("空间排列", "摩尔质量", "电荷", "密度"), "科学", "立体异构涉及分子式相同但原子在空间排列不同的分子。"),
            es = LocalizedContent("¿La estereoisomería se refiere a?", listOf("La disposición espacial", "La masa molar", "La carga", "La densidad"), "Ciencia", "La estereoisomería se refiere a moléculas con la misma fórmula desarrollada pero cuyos átomos están dispuestos de manera diferente en el espacio.")
        ),
        BilingualQuestion(
            id = 12430, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La constante de Boltzmann relie??", listOf("Température et énergie", "Pression et volume", "Charge et champ", "Masse et accélération"), "Science", "La constante de Boltzmann (k) établit le lien entre l'énergie cinétique moyenne des particules et la température thermodynamique d'un système. Elle permet de convertir des mesures de température en unités d'énergie."),
            en = LocalizedContent("The Boltzmann constant relates?", listOf("Temperature and energy", "Pressure and volume", "Charge and field", "Mass and acceleration"), "Science", "The Boltzmann constant (k) links the average kinetic energy of particles to the thermodynamic temperature of a system. It allows conversion of temperature measurements into energy units."),
            zh = LocalizedContent("玻尔兹曼常数关联的是？", listOf("温度与能量", "压力与体积", "电荷与场", "质量与加速度"), "科学", "玻尔兹曼常数（k）建立了粒子平均动能与系统热力学温度之间的联系，可将温度测量值转换为能量单位。"),
            es = LocalizedContent("¿La constante de Boltzmann relaciona?", listOf("Temperatura y energía", "Presión y volumen", "Carga y campo", "Masa y aceleración"), "Ciencia", "La constante de Boltzmann (k) establece el vínculo entre la energía cinética media de las partículas y la temperatura termodinámica de un sistema. Permite convertir medidas de temperatura en unidades de energía.")
        ),
        BilingualQuestion(
            id = 12431, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En chimie, la réaction d'addition se produit sur??", listOf("Les alcanes", "Les alcènes", "Les alcynes", "Les arènes"), "Science", "Les alcynes possèdent une triple liaison carbone-carbone, qui peut s'ouvrir pour fixer de nouveaux atomes ou groupes, contrairement aux alcanes saturés."),
            en = LocalizedContent("In chemistry, the addition reaction occurs on?", listOf("Alkanes", "Alkenes", "Alkynes", "Arenes"), "Science", "Alkynes have a carbon-carbon triple bond that can open to attach new atoms or groups, unlike saturated alkanes."),
            zh = LocalizedContent("在化学中，加成反应发生在？", listOf("烷烃", "烯烃", "炔烃", "芳烃"), "科学", "炔烃具有碳碳三键，可以打开以连接新的原子或基团，这与饱和烷烃不同。"),
            es = LocalizedContent("En química, la reacción de adición ocurre en?", listOf("Los alcanos", "Los alquenos", "Los alquinos", "Los arenos"), "Ciencia", "Los alquinos poseen un triple enlace carbono-carbono que puede abrirse para fijar nuevos átomos o grupos, a diferencia de los alcanos saturados.")
        ),
        BilingualQuestion(
            id = 12432, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le radical libre est une molécule avec??", listOf("Charge positive", "Charge négative", "Électron non apparié", "Proton extra"), "Science", "Les radicaux libres possèdent un électron non apparié sur leur couche externe, ce qui les rend très instables et réactifs chimiquement."),
            en = LocalizedContent("A free radical is a molecule with?", listOf("Positive charge", "Negative charge", "Unpaired electron", "Extra proton"), "Science", "Free radicals have an unpaired electron in their outer shell, making them highly unstable and chemically reactive."),
            zh = LocalizedContent("自由基是一种具有什么的分子的？", listOf("正电荷", "负电荷", "未配对电子", "额外质子"), "科学", "自由基在其外层有一个未配对电子，这使得它们非常不稳定且具有化学反应性。"),
            es = LocalizedContent("¿Un radical libre es una molécula con?", listOf("Carga positiva", "Carga negativa", "Electrón no apareado", "Protón extra"), "Ciencia", "Los radicales libres poseen un electrón no apareado en su capa externa, lo que los hace muy inestables y reactivos químicamente.")
        ),
        BilingualQuestion(
            id = 12433, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La polarisabilité d'une molécule dépend de??", listOf("Sa charge", "Sa taille", "Sa masse", "Son volume"), "Science", "Plus une molécule est grande, plus son nuage électronique est volumineux et déformable, ce qui augmente sa polarisabilité."),
            en = LocalizedContent("The polarizability of a molecule depends on?", listOf("Its charge", "Its size", "Its mass", "Its volume"), "Science", "The larger a molecule, the more voluminous and deformable its electron cloud, increasing its polarizability."),
            zh = LocalizedContent("分子的极化率取决于？", listOf("其电荷", "其大小", "其质量", "其体积"), "科学", "分子越大，其电子云越庞大且可变形，从而增加其极化率。"),
            es = LocalizedContent("¿La polarizabilidad de una molécula depende de?", listOf("Su carga", "Su tamaño", "Su masa", "Su volumen"), "Ciencia", "Cuanto más grande es una molécula, más voluminosa y deformable es su nube electrónica, lo que aumenta su polarizabilidad.")
        ),
        BilingualQuestion(
            id = 12434, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'électronégativité augmente en??", listOf("Descendant un groupe", "Montant un groupe", "Descendant une période", "Montant une période"), "Science", "Dans le tableau périodique, l'électronégativité augmente de gauche à droite sur une période et de bas en haut dans un groupe, car les atomes attirent plus fortement les électrons."),
            en = LocalizedContent("Electronegativity increases?", listOf("Down a group", "Up a group", "Down a period", "Up a period"), "Science", "In the periodic table, electronegativity increases from left to right across a period and from bottom to top within a group, as atoms attract electrons more strongly."),
            zh = LocalizedContent("电负性增加的方向是？", listOf("同族向下", "同族向上", "同周期向下", "同周期向上"), "科学", "在元素周期表中，电负性从左到右在同一周期增加，从下到上在同一族增加，因为原子对电子的吸引力更强。"),
            es = LocalizedContent("¿La electronegatividad aumenta?", listOf("Bajando en un grupo", "Subiendo en un grupo", "Bajando en un período", "Subiendo en un período"), "Ciencia", "En la tabla periódica, la electronegatividad aumenta de izquierda a derecha en un período y de abajo arriba en un grupo, ya que los átomos atraen electrones con más fuerza.")
        ),
        BilingualQuestion(
            id = 12435, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La durite chimique la plus forte est entre le??", listOf("C et H", "H et F", "N et O", "C et O"), "Science", "La liaison hydrogène-fluor (H-F) est la plus forte des liaisons covalentes simples car le fluor est l'élément le plus électronégatif, créant une forte polarité."),
            en = LocalizedContent("The strongest chemical bond is between?", listOf("C and H", "H and F", "N and O", "C and O"), "Science", "The hydrogen-fluorine (H-F) bond is the strongest single covalent bond because fluorine is the most electronegative element, creating a strong polarity."),
            zh = LocalizedContent("最强的化学键存在于？", listOf("碳和氢", "氢和氟", "氮和氧", "碳和氧"), "科学", "氢-氟（H-F）键是最强的单共价键，因为氟是电负性最强的元素，产生强极性。"),
            es = LocalizedContent("¿El enlace químico más fuerte está entre?", listOf("C y H", "H y F", "N y O", "C y O"), "Ciencia", "El enlace hidrógeno-flúor (H-F) es el enlace covalente simple más fuerte porque el flúor es el elemento más electronegativo, creando una fuerte polaridad.")
        ),
        BilingualQuestion(
            id = 12436, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La force de van der Waals est la plus faible entre?", listOf("Atomes polaires", "Dipôles permanents", "Atomes apolaires", "Ions"), "Science", "La force de van der Waals est une interaction intermoléculaire faible qui se manifeste entre atomes ou molécules apolaires, car elle repose sur des dipôles temporaires induits par les fluctuations électroniques."),
            en = LocalizedContent("Van der Waals force is weakest between?", listOf("Polar atoms", "Permanent dipoles", "Nonpolar atoms", "Ions"), "Science", "Van der Waals force is a weak intermolecular interaction that occurs between nonpolar atoms or molecules, as it relies on temporary dipoles induced by electronic fluctuations."),
            zh = LocalizedContent("范德华力在什么之间最弱？", listOf("极性原子", "永久偶极", "非极性原子", "离子"), "科学", "范德华力是一种弱的分子间相互作用，发生在非极性原子或分子之间，因为它依赖于电子波动引起的瞬时偶极。"),
            es = LocalizedContent("¿La fuerza de van der Waals es más débil entre?", listOf("Átomos polares", "Dipolos permanentes", "Átomos apolares", "Iones"), "Ciencia", "La fuerza de van der Waals es una interacción intermolecular débil que se manifiesta entre átomos o moléculas apolares, ya que se basa en dipolos temporales inducidos por fluctuaciones electrónicas.")
        ),
        BilingualQuestion(
            id = 12437, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a découvert la fission nucléaire?", listOf("Einstein", "Hahn", "Meitner", "Strassmann"), "Science", "Otto Hahn et son assistant Fritz Strassmann ont découvert la fission nucléaire en 1938 en bombardant de l'uranium avec des neutrons, une expérience interprétée théoriquement par Lise Meitner."),
            en = LocalizedContent("Which scientist discovered nuclear fission?", listOf("Einstein", "Hahn", "Meitner", "Strassmann"), "Science", "Otto Hahn and his assistant Fritz Strassmann discovered nuclear fission in 1938 by bombarding uranium with neutrons, an experiment theoretically interpreted by Lise Meitner."),
            zh = LocalizedContent("哪位科学家发现了核裂变？", listOf("爱因斯坦", "哈恩", "迈特纳", "斯特拉斯曼"), "科学", "奥托·哈恩和他的助手弗里茨·斯特拉斯曼于1938年通过用中子轰击铀发现了核裂变，这一实验由莉泽·迈特纳进行了理论解释。"),
            es = LocalizedContent("¿Qué científico descubrió la fisión nuclear?", listOf("Einstein", "Hahn", "Meitner", "Strassmann"), "Ciencia", "Otto Hahn y su asistente Fritz Strassmann descubrieron la fisión nuclear en 1938 al bombardear uranio con neutrones, un experimento interpretado teóricamente por Lise Meitner.")
        ),
        BilingualQuestion(
            id = 12438, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La fission nucléaire libère de l'énergie sous forme de??", listOf("Rayons gamma", "Radiation alpha", "Radiation bêta", "Toutes les trois"), "Science", "Lors d'une fission nucléaire, la masse manquante est convertie en énergie cinétique des fragments, en rayonnement gamma et en neutrons rapides, soit les trois formes citées."),
            en = LocalizedContent("Nuclear fission releases energy in the form of?", listOf("Gamma rays", "Alpha radiation", "Beta radiation", "All three"), "Science", "During nuclear fission, the missing mass is converted into kinetic energy of fragments, gamma radiation, and fast neutrons, i.e., all three forms mentioned."),
            zh = LocalizedContent("核裂变以什么形式释放能量？", listOf("伽马射线", "阿尔法辐射", "贝塔辐射", "以上三种"), "科学", "在核裂变过程中，缺失的质量转化为碎片的动能、伽马辐射和快中子，即提到的所有三种形式。"),
            es = LocalizedContent("¿La fisión nuclear libera energía en forma de?", listOf("Rayos gamma", "Radiación alfa", "Radiación beta", "Las tres"), "Ciencia", "Durante una fisión nuclear, la masa faltante se convierte en energía cinética de los fragmentos, radiación gamma y neutrones rápidos, es decir, las tres formas citadas.")
        ),
        BilingualQuestion(
            id = 12439, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'énergie d'un photon dépend de sa??", listOf("Longueur d'onde", "Fréquence", "Vitesse", "Direction"), "Science", "L'énergie d'un photon est directement proportionnelle à sa fréquence selon la relation E = h×ν, où h est la constante de Planck."),
            en = LocalizedContent("The energy of a photon depends on its??", listOf("Wavelength", "Frequency", "Speed", "Direction"), "Science", "The energy of a photon is directly proportional to its frequency according to the relation E = h×ν, where h is Planck's constant."),
            zh = LocalizedContent("光子的能量取决于它的??", listOf("波长", "频率", "速度", "方向"), "科学", "光子的能量与其频率成正比，根据关系式 E = h×ν，其中 h 是普朗克常数。"),
            es = LocalizedContent("La energía de un fotón depende de su??", listOf("Longitud de onda", "Frecuencia", "Velocidad", "Dirección"), "Ciencia", "La energía de un fotón es directamente proporcional a su frecuencia según la relación E = h×ν, donde h es la constante de Planck.")
        ),
        BilingualQuestion(
            id = 12440, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le principe d'incertitude d'Heisenberg concerne??", listOf("Position et vitesse", "Position et momentum", "Énergie et temps", "Tous les trois"), "Science", "Le principe d'incertitude d'Heisenberg stipule qu'il est impossible de connaître simultanément avec précision certaines paires de grandeurs physiques, comme la position et la quantité de mouvement, l'énergie et le temps, ou encore l'angle et le moment angulaire."),
            en = LocalizedContent("Heisenberg's uncertainty principle concerns??", listOf("Position and speed", "Position and momentum", "Energy and time", "All three"), "Science", "Heisenberg's uncertainty principle states that it is impossible to simultaneously know with precision certain pairs of physical quantities, such as position and momentum, energy and time, or angle and angular momentum."),
            zh = LocalizedContent("海森堡不确定性原理涉及??", listOf("位置和速度", "位置和动量", "能量和时间", "以上所有"), "科学", "海森堡不确定性原理指出，不可能同时精确地知道某些物理量对，如位置和动量、能量和时间，或角度和角动量。"),
            es = LocalizedContent("El principio de incertidumbre de Heisenberg se refiere a??", listOf("Posición y velocidad", "Posición y momento", "Energía y tiempo", "Los tres"), "Ciencia", "El principio de incertidumbre de Heisenberg establece que es imposible conocer simultáneamente con precisión ciertos pares de magnitudes físicas, como la posición y el momento, la energía y el tiempo, o el ángulo y el momento angular.")
        ),
        BilingualQuestion(
            id = 12441, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté la bataille de Crécy?", listOf("France", "Angleterre", "Bourgogne", "Flandre"), "Histoire", "La bataille de Crécy, en 1346, fut une victoire anglaise décisive pendant la guerre de Cent Ans, marquée par l'utilisation efficace des archers anglais contre la cavalerie française."),
            en = LocalizedContent("Who won the Battle of Crécy?", listOf("France", "England", "Burgundy", "Flanders"), "History", "The Battle of Crécy, in 1346, was a decisive English victory during the Hundred Years' War, marked by the effective use of English longbowmen against French cavalry."),
            zh = LocalizedContent("谁赢得了克雷西战役？", listOf("法国", "英格兰", "勃艮第", "佛兰德"), "历史", "1346年的克雷西战役是百年战争中英格兰的决定性胜利，以英格兰长弓手有效对抗法国骑兵而著称。"),
            es = LocalizedContent("¿Quién ganó la batalla de Crécy?", listOf("Francia", "Inglaterra", "Borgoña", "Flandes"), "Historia", "La batalla de Crécy, en 1346, fue una victoria decisiva inglesa durante la Guerra de los Cien Años, marcada por el uso eficaz de los arqueros ingleses contra la caballería francesa.")
        ),
        BilingualQuestion(
            id = 12442, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La bataille d'Azincourt a eu lieu en??", listOf("1415", "1420", "1429", "1435"), "Histoire", "La bataille d'Azincourt, opposant les Anglais d'Henri V aux Français, s'est déroulée le 25 octobre 1415 pendant la guerre de Cent Ans."),
            en = LocalizedContent("The Battle of Agincourt took place in??", listOf("1415", "1420", "1429", "1435"), "History", "The Battle of Agincourt, opposing the English of Henry V against the French, took place on October 25, 1415 during the Hundred Years' War."),
            zh = LocalizedContent("阿金库尔战役发生在??", listOf("1415年", "1420年", "1429年", "1435年"), "历史", "阿金库尔战役，亨利五世的英格兰军队对阵法国军队，发生于1415年10月25日，属于百年战争期间。"),
            es = LocalizedContent("La batalla de Agincourt tuvo lugar en??", listOf("1415", "1420", "1429", "1435"), "Historia", "La batalla de Agincourt, que enfrentó a los ingleses de Enrique V contra los franceses, tuvo lugar el 25 de octubre de 1415 durante la Guerra de los Cien Años.")
        ),
        BilingualQuestion(
            id = 12443, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Jeanne d'Arc a été brûlée en??", listOf("1429", "1430", "1431", "1435"), "Histoire", "Jeanne d'Arc fut exécutée à Rouen le 30 mai 1431, après un procès en hérésie mené par les Anglais durant la guerre de Cent Ans."),
            en = LocalizedContent("Joan of Arc was burned in??", listOf("1429", "1430", "1431", "1435"), "History", "Joan of Arc was executed in Rouen on May 30, 1431, after a heresy trial conducted by the English during the Hundred Years' War."),
            zh = LocalizedContent("圣女贞德被烧死在??", listOf("1429年", "1430年", "1431年", "1435年"), "历史", "圣女贞德于1431年5月30日在鲁昂被处决，此前经历了百年战争期间由英格兰人主导的异端审判。"),
            es = LocalizedContent("Juana de Arco fue quemada en??", listOf("1429", "1430", "1431", "1435"), "Historia", "Juana de Arco fue ejecutada en Ruan el 30 de mayo de 1431, tras un juicio por herejía llevado a cabo por los ingleses durante la Guerra de los Cien Años.")
        ),
        BilingualQuestion(
            id = 12444, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Siège de Calais a duré environ??", listOf("6 mois", "1 an", "1.5 ans", "2 ans"), "Histoire", "Le siège de Calais, mené par Édouard III d'Angleterre pendant la guerre de Cent Ans, a duré de septembre 1346 à août 1347, soit environ 11 mois, ce qui correspond à un an et demi."),
            en = LocalizedContent("The Siege of Calais lasted about??", listOf("6 months", "1 year", "1.5 years", "2 years"), "History", "The Siege of Calais, led by Edward III of England during the Hundred Years' War, lasted from September 1346 to August 1347, about 11 months, which corresponds to one and a half years."),
            zh = LocalizedContent("加来围城战持续了大约??", listOf("6个月", "1年", "1.5年", "2年"), "历史", "加来围城战由英格兰的爱德华三世在百年战争期间领导，从1346年9月持续到1347年8月，约11个月，相当于一年半。"),
            es = LocalizedContent("El asedio de Calais duró aproximadamente??", listOf("6 meses", "1 año", "1.5 años", "2 años"), "Historia", "El asedio de Calais, liderado por Eduardo III de Inglaterra durante la Guerra de los Cien Años, duró desde septiembre de 1346 hasta agosto de 1347, unos 11 meses, lo que corresponde a un año y medio.")
        ),
        BilingualQuestion(
            id = 12445, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La paix de Troyes a été signée en??", listOf("1420", "1425", "1430", "1435"), "Histoire", "Le traité de Troyes, signé en 1420, met fin à la guerre de Cent Ans entre la France et l'Angleterre en désignant le roi d'Angleterre Henri V comme héritier du trône de France."),
            en = LocalizedContent("The Treaty of Troyes was signed in??", listOf("1420", "1425", "1430", "1435"), "History", "The Treaty of Troyes, signed in 1420, ended the Hundred Years' War between France and England by designating the English king Henry V as heir to the French throne."),
            zh = LocalizedContent("特鲁瓦条约签署于??", listOf("1420年", "1425年", "1430年", "1435年"), "历史", "1420年签署的特鲁瓦条约结束了法国和英格兰之间的百年战争，指定英格兰国王亨利五世为法国王位继承人。"),
            es = LocalizedContent("El Tratado de Troyes se firmó en??", listOf("1420", "1425", "1430", "1435"), "Historia", "El Tratado de Troyes, firmado en 1420, puso fin a la Guerra de los Cien Años entre Francia e Inglaterra al designar al rey inglés Enrique V como heredero del trono francés.")
        ),
        BilingualQuestion(
            id = 12446, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le traité d'Amiens a été signé en??", listOf("1801", "1802", "1803", "1804"), "Histoire", "Le traité d'Amiens, signé le 25 mars 1802, mit fin à la guerre entre la France et le Royaume-Uni, marquant une brève période de paix pendant les guerres napoléoniennes."),
            en = LocalizedContent("The Treaty of Amiens was signed in??", listOf("1801", "1802", "1803", "1804"), "History", "The Treaty of Amiens, signed on March 25, 1802, ended the war between France and the United Kingdom, marking a brief period of peace during the Napoleonic Wars."),
            zh = LocalizedContent("亚眠条约签署于??", listOf("1801年", "1802年", "1803年", "1804年"), "历史", "1802年3月25日签署的亚眠条约结束了法国和联合王国之间的战争，标志着拿破仑战争期间短暂的和平时期。"),
            es = LocalizedContent("El Tratado de Amiens se firmó en??", listOf("1801", "1802", "1803", "1804"), "Historia", "El Tratado de Amiens, firmado el 25 de marzo de 1802, puso fin a la guerra entre Francia y el Reino Unido, marcando un breve período de paz durante las guerras napoleónicas.")
        ),
        BilingualQuestion(
            id = 12447, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Napoléon a abdiqué pour la première fois en??", listOf("1813", "1814", "1815", "1816"), "Histoire", "Après la défaite de la campagne de France et la prise de Paris par les coalisés, Napoléon abdique le 6 avril 1814 à Fontainebleau."),
            en = LocalizedContent("Napoleon abdicated for the first time in??", listOf("1813", "1814", "1815", "1816"), "History", "After the defeat of the Campaign of France and the capture of Paris by the coalition, Napoleon abdicated on April 6, 1814 at Fontainebleau."),
            zh = LocalizedContent("拿破仑第一次退位是在??", listOf("1813年", "1814年", "1815年", "1816年"), "历史", "在法国战役失败和联军占领巴黎后，拿破仑于1814年4月6日在枫丹白露退位。"),
            es = LocalizedContent("Napoleón abdicó por primera vez en??", listOf("1813", "1814", "1815", "1816"), "Historia", "Tras la derrota de la Campaña de Francia y la toma de París por los coaligados, Napoleón abdicó el 6 de abril de 1814 en Fontainebleau.")
        ),
        BilingualQuestion(
            id = 12448, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les Cent-Jours ont duré??", listOf("100 jours", "111 jours", "120 jours", "150 jours"), "Histoire", "Cette période correspond au retour au pouvoir de Napoléon Ier entre son évasion de l'île d'Elbe (1er mars 1815) et sa seconde abdication après Waterloo (22 juin 1815)."),
            en = LocalizedContent("The Hundred Days lasted??", listOf("100 days", "111 days", "120 days", "150 days"), "History", "This period corresponds to Napoleon I's return to power between his escape from the island of Elba (March 1, 1815) and his second abdication after Waterloo (June 22, 1815)."),
            zh = LocalizedContent("百日王朝持续了??", listOf("100天", "111天", "120天", "150天"), "历史", "这一时期对应拿破仑一世从厄尔巴岛逃脱（1815年3月1日）到滑铁卢后第二次退位（1815年6月22日）之间的复辟。"),
            es = LocalizedContent("Los Cien Días duraron??", listOf("100 días", "111 días", "120 días", "150 días"), "Historia", "Este período corresponde al regreso al poder de Napoleón I entre su fuga de la isla de Elba (1 de marzo de 1815) y su segunda abdicación tras Waterloo (22 de junio de 1815).")
        ),
        BilingualQuestion(
            id = 12449, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Waterloo a changé l'histoire de l'Europe en tant que??", listOf("Première défaite", "Fin de l'empire", "Victoire décisive", "Défaite définitive"), "Histoire", "La bataille de Waterloo en 1815 marque la défaite définitive de Napoléon Bonaparte, mettant fin à l'Empire français et aux guerres napoléoniennes en Europe."),
            en = LocalizedContent("Waterloo changed the history of Europe as a??", listOf("First defeat", "End of the empire", "Decisive victory", "Final defeat"), "History", "The Battle of Waterloo in 1815 marked the final defeat of Napoleon Bonaparte, ending the French Empire and the Napoleonic Wars in Europe."),
            zh = LocalizedContent("滑铁卢改变了欧洲历史，作为??", listOf("第一次失败", "帝国的终结", "决定性胜利", "最终失败"), "历史", "1815年的滑铁卢战役标志着拿破仑·波拿巴的最终失败，结束了法兰西帝国和欧洲的拿破仑战争。"),
            es = LocalizedContent("Waterloo cambió la historia de Europa como??", listOf("Primera derrota", "Fin del imperio", "Victoria decisiva", "Derrota definitiva"), "Historia", "La batalla de Waterloo en 1815 marcó la derrota definitiva de Napoleón Bonaparte, poniendo fin al Imperio francés y a las guerras napoleónicas en Europa.")
        ),
        BilingualQuestion(
            id = 12450, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("L'indépendance américaine a été déclarée en??", listOf("1775", "1776", "1777", "1778"), "Histoire", "Le 4 juillet 1776, le Congrès continental adopte la Déclaration d'indépendance des États-Unis, rompant officiellement les liens avec la Grande-Bretagne."),
            en = LocalizedContent("American independence was declared in??", listOf("1775", "1776", "1777", "1778"), "History", "On July 4, 1776, the Continental Congress adopted the Declaration of Independence of the United States, officially breaking ties with Great Britain."),
            zh = LocalizedContent("美国独立宣言发表于??", listOf("1775年", "1776年", "1777年", "1778年"), "历史", "1776年7月4日，大陆会议通过了美国独立宣言，正式与英国断绝关系。"),
            es = LocalizedContent("La independencia estadounidense fue declarada en??", listOf("1775", "1776", "1777", "1778"), "Historia", "El 4 de julio de 1776, el Congreso Continental adoptó la Declaración de Independencia de los Estados Unidos, rompiendo oficialmente los lazos con Gran Bretaña.")
        ),
        BilingualQuestion(
            id = 12451, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La Révolution française a eu lieu en??", listOf("1788", "1789", "1790", "1791"), "Histoire", "La Révolution française débute en 1789 avec la convocation des États généraux et la prise de la Bastille le 14 juillet, marquant la fin de l'Ancien Régime."),
            en = LocalizedContent("The French Revolution took place in??", listOf("1788", "1789", "1790", "1791"), "History", "The French Revolution began in 1789 with the convocation of the Estates General and the storming of the Bastille on July 14, marking the end of the Ancien Régime."),
            zh = LocalizedContent("法国大革命发生在??", listOf("1788年", "1789年", "1790年", "1791年"), "历史", "法国大革命始于1789年，以三级会议的召开和7月14日攻占巴士底狱为标志，结束了旧制度。"),
            es = LocalizedContent("La Revolución Francesa tuvo lugar en??", listOf("1788", "1789", "1790", "1791"), "Historia", "La Revolución Francesa comenzó en 1789 con la convocatoria de los Estados Generales y la toma de la Bastilla el 14 de julio, marcando el fin del Antiguo Régimen.")
        ),
        BilingualQuestion(
            id = 12452, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'empire colonial français en Afrique était appelé??", listOf("Afrique française", "Français-Afrique", "Afrique-Française", "l'AOF et AEF"), "Histoire", "L'empire colonial français en Afrique était organisé en deux fédérations : l'Afrique-Occidentale française (AOF) et l'Afrique-Équatoriale française (AEF), créées pour administrer les territoires conquis."),
            en = LocalizedContent("The French colonial empire in Africa was called??", listOf("French Africa", "French-Africa", "Africa-French", "AOF and AEF"), "History", "The French colonial empire in Africa was organized into two federations: French West Africa (AOF) and French Equatorial Africa (AEF), created to administer the conquered territories."),
            zh = LocalizedContent("法国在非洲的殖民帝国被称为??", listOf("法属非洲", "法非", "非法", "法属西非和法属赤道非洲"), "历史", "法国在非洲的殖民帝国分为两个联邦：法属西非（AOF）和法属赤道非洲（AEF），用于管理被征服的领土。"),
            es = LocalizedContent("El imperio colonial francés en África se llamaba??", listOf("África francesa", "Francés-África", "África-Francés", "AOF y AEF"), "Historia", "El imperio colonial francés en África estaba organizado en dos federaciones: África Occidental Francesa (AOF) y África Ecuatorial Francesa (AEF), creadas para administrar los territorios conquistados.")
        ),
        BilingualQuestion(
            id = 12453, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La Première Guerre mondiale a duré??", listOf("3 ans", "4 ans", "5 ans", "6 ans"), "Histoire", "Le conflit a débuté le 28 juillet 1914 et s'est achevé le 11 novembre 1918, soit une durée de quatre ans."),
            en = LocalizedContent("World War I lasted??", listOf("3 years", "4 years", "5 years", "6 years"), "History", "The conflict began on July 28, 1914 and ended on November 11, 1918, a duration of four years."),
            zh = LocalizedContent("第一次世界大战持续了??", listOf("3年", "4年", "5年", "6年"), "历史", "冲突始于1914年7月28日，结束于1918年11月11日，历时四年。"),
            es = LocalizedContent("La Primera Guerra Mundial duró??", listOf("3 años", "4 años", "5 años", "6 años"), "Historia", "El conflicto comenzó el 28 de julio de 1914 y terminó el 11 de noviembre de 1918, una duración de cuatro años.")
        ),
        BilingualQuestion(
            id = 12454, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le Traité de Versailles a imposé à l'Allemagne??", listOf("Réparations", "Restrictions militaires", "Perte de territoires", "Tout ce qui précède"), "Histoire", "Le traité de Versailles, signé en 1919, imposait à l'Allemagne des clauses territoriales, militaires, financières et morales, incluant la perte de territoires, la limitation de son armée, des réparations colossales et la reconnaissance de sa responsabilité dans la guerre."),
            en = LocalizedContent("The Treaty of Versailles imposed on Germany??", listOf("Reparations", "Military restrictions", "Loss of territories", "All of the above"), "History", "The Treaty of Versailles, signed in 1919, imposed on Germany territorial, military, financial, and moral clauses, including loss of territories, limitation of its army, colossal reparations, and recognition of its responsibility for the war."),
            zh = LocalizedContent("《凡尔赛条约》对德国施加了??", listOf("赔款", "军事限制", "领土损失", "以上所有"), "历史", "1919年签署的《凡尔赛条约》对德国施加了领土、军事、财政和道义条款，包括领土损失、军队限制、巨额赔款以及承认战争责任。"),
            es = LocalizedContent("El Tratado de Versalles impuso a Alemania??", listOf("Reparaciones", "Restricciones militares", "Pérdida de territorios", "Todo lo anterior"), "Historia", "El Tratado de Versalles, firmado en 1919, impuso a Alemania cláusulas territoriales, militares, financieras y morales, incluyendo la pérdida de territorios, la limitación de su ejército, reparaciones colosales y el reconocimiento de su responsabilidad en la guerra.")
        ),
        BilingualQuestion(
            id = 12455, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La Grande Dépression a commencé en??", listOf("1927", "1928", "1929", "1930"), "Histoire", "Le krach boursier de Wall Street en octobre 1929 a déclenché une crise économique mondiale, marquant le début de la Grande Dépression."),
            en = LocalizedContent("The Great Depression began in??", listOf("1927", "1928", "1929", "1930"), "History", "The Wall Street stock market crash in October 1929 triggered a global economic crisis, marking the beginning of the Great Depression."),
            zh = LocalizedContent("大萧条始于??", listOf("1927年", "1928年", "1929年", "1930年"), "历史", "1929年10月的华尔街股市崩盘引发了全球经济危机，标志着大萧条的开始。"),
            es = LocalizedContent("La Gran Depresión comenzó en??", listOf("1927", "1928", "1929", "1930"), "Historia", "El colapso de la bolsa de Wall Street en octubre de 1929 desencadenó una crisis económica mundial, marcando el inicio de la Gran Depresión.")
        ),
        BilingualQuestion(
            id = 12456, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Hitler est arrivé au pouvoir en??", listOf("1931", "1932", "1933", "1934"), "Histoire", "Adolf Hitler a été nommé chancelier de l'Allemagne le 30 janvier 1933, marquant son accession légale au pouvoir. Cette nomination a ouvert la voie à la mise en place de la dictature nazie."),
            en = LocalizedContent("Hitler came to power in??", listOf("1931", "1932", "1933", "1934"), "History", "Adolf Hitler was appointed Chancellor of Germany on January 30, 1933, marking his legal accession to power. This appointment paved the way for the establishment of the Nazi dictatorship."),
            zh = LocalizedContent("希特勒上台是在??", listOf("1931年", "1932年", "1933年", "1934年"), "历史", "阿道夫·希特勒于1933年1月30日被任命为德国总理，标志着他合法上台。这一任命为纳粹独裁的建立铺平了道路。"),
            es = LocalizedContent("Hitler llegó al poder en??", listOf("1931", "1932", "1933", "1934"), "Historia", "Adolf Hitler fue nombrado canciller de Alemania el 30 de enero de 1933, marcando su acceso legal al poder. Este nombramiento allanó el camino para el establecimiento de la dictadura nazi.")
        ),
        BilingualQuestion(
            id = 12457, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'Holocauste a causé la mort de combien de millions de personnes?", listOf("3", "5", "6", "8"), "Histoire", "L'Holocauste désigne le génocide systématique d'environ six millions de Juifs par l'Allemagne nazie entre 1941 et 1945."),
            en = LocalizedContent("The Holocaust caused the death of how many million people?", listOf("3", "5", "6", "8"), "History", "The Holocaust refers to the systematic genocide of approximately six million Jews by Nazi Germany between 1941 and 1945."),
            zh = LocalizedContent("大屠杀导致多少百万人死亡？", listOf("300万", "500万", "600万", "800万"), "历史", "大屠杀指的是纳粹德国在1941年至1945年间系统性地杀害了约600万犹太人。"),
            es = LocalizedContent("El Holocausto causó la muerte de ¿cuántos millones de personas?", listOf("3", "5", "6", "8"), "Historia", "El Holocausto se refiere al genocidio sistemático de aproximadamente seis millones de judíos por parte de la Alemania nazi entre 1941 y 1945.")
        ),
        BilingualQuestion(
            id = 12458, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La Shoah est un autre nom pour??", listOf("La Première Guerre mondiale", "La Seconde Guerre mondiale", "L'Holocauste", "La Grande Dépression"), "Histoire", "Le terme Shoah, d'origine hébraïque, désigne spécifiquement l'extermination systématique des Juifs par l'Allemagne nazie, tandis qu'Holocauste, d'origine grecque, est le terme plus couramment utilisé en français pour le même génocide."),
            en = LocalizedContent("Shoah is another name for??", listOf("World War I", "World War II", "The Holocaust", "The Great Depression"), "History", "The term Shoah, of Hebrew origin, specifically refers to the systematic extermination of Jews by Nazi Germany, while Holocaust, of Greek origin, is the more commonly used term in English for the same genocide."),
            zh = LocalizedContent("Shoah是??的另一个名称", listOf("第一次世界大战", "第二次世界大战", "大屠杀", "大萧条"), "历史", "Shoah一词源自希伯来语，特指纳粹德国对犹太人的系统性灭绝，而Holocaust源自希腊语，是英语中更常用的术语。"),
            es = LocalizedContent("Shoah es otro nombre para??", listOf("La Primera Guerra Mundial", "La Segunda Guerra Mundial", "El Holocausto", "La Gran Depresión"), "Historia", "El término Shoah, de origen hebreo, se refiere específicamente al exterminio sistemático de los judíos por parte de la Alemania nazi, mientras que Holocausto, de origen griego, es el término más utilizado en español para el mismo genocidio.")
        ),
        BilingualQuestion(
            id = 12459, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La Guerre froide a commencé après??", listOf("La Première Guerre mondiale", "La Seconde Guerre mondiale", "La crise des missiles", "Le mur de Berlin"), "Histoire", "La Guerre froide a débuté après la Seconde Guerre mondiale en raison des tensions idéologiques et géopolitiques entre les États-Unis et l'Union soviétique, qui émergeaient comme les deux superpuissances rivales."),
            en = LocalizedContent("The Cold War began after?", listOf("World War I", "World War II", "The Cuban Missile Crisis", "The Berlin Wall"), "History", "The Cold War began after World War II due to ideological and geopolitical tensions between the United States and the Soviet Union, emerging as the two rival superpowers."),
            zh = LocalizedContent("冷战开始于？", listOf("第一次世界大战", "第二次世界大战", "古巴导弹危机", "柏林墙"), "历史", "冷战在第二次世界大战后开始，原因是美国和苏联之间意识形态和地缘政治的紧张关系，它们成为两个对立的超级大国。"),
            es = LocalizedContent("¿La Guerra Fría comenzó después de?", listOf("La Primera Guerra Mundial", "La Segunda Guerra Mundial", "La crisis de los misiles", "El muro de Berlín"), "Historia", "La Guerra Fría comenzó después de la Segunda Guerra Mundial debido a las tensiones ideológicas y geopolíticas entre Estados Unidos y la Unión Soviética, que emergieron como las dos superpotencias rivales.")
        ),
        BilingualQuestion(
            id = 12460, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel événement a déclenché la Première Guerre mondiale?", listOf("Assassinat de François-Ferdinand", "Invasion de la Belgique", "Déclaration de guerre allemande", "Mobilisation générale"), "Histoire", "L'assassinat de l'archiduc François-Ferdinand d'Autriche le 28 juin 1914 à Sarajevo par un nationaliste serbe a provoqué une crise diplomatique qui a déclenché la Première Guerre mondiale."),
            en = LocalizedContent("What event triggered World War I?", listOf("Assassination of Franz Ferdinand", "Invasion of Belgium", "German declaration of war", "General mobilization"), "History", "The assassination of Archduke Franz Ferdinand of Austria on June 28, 1914 in Sarajevo by a Serbian nationalist caused a diplomatic crisis that triggered World War I."),
            zh = LocalizedContent("什么事件引发了第一次世界大战？", listOf("弗朗茨·斐迪南遇刺", "入侵比利时", "德国宣战", "总动员"), "历史", "1914年6月28日，奥匈帝国皇储弗朗茨·斐迪南大公在萨拉热窝被一名塞尔维亚民族主义者刺杀，引发了一场外交危机，从而触发了第一次世界大战。"),
            es = LocalizedContent("¿Qué evento desencadenó la Primera Guerra Mundial?", listOf("Asesinato de Francisco Fernando", "Invasión de Bélgica", "Declaración de guerra alemana", "Movilización general"), "Historia", "El asesinato del archiduque Francisco Fernando de Austria el 28 de junio de 1914 en Sarajevo por un nacionalista serbio provocó una crisis diplomática que desencadenó la Primera Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 12461, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a déclenché la Crise des missiles?", listOf("Construction du mur de Berlin", "Missiles soviétiques à Cuba", "Invasion de la Baie des Cochons", "Révolution cubaine"), "Histoire", "En octobre 1962, la découverte par les États-Unis de missiles nucléaires soviétiques installés à Cuba a provoqué une confrontation directe avec l'URSS, menaçant une guerre nucléaire."),
            en = LocalizedContent("What event triggered the Cuban Missile Crisis?", listOf("Construction of the Berlin Wall", "Soviet missiles in Cuba", "Bay of Pigs Invasion", "Cuban Revolution"), "History", "In October 1962, the discovery by the United States of Soviet nuclear missiles installed in Cuba led to a direct confrontation with the USSR, threatening nuclear war."),
            zh = LocalizedContent("什么事件引发了古巴导弹危机？", listOf("修建柏林墙", "苏联在古巴部署导弹", "猪湾入侵", "古巴革命"), "历史", "1962年10月，美国发现苏联在古巴部署了核导弹，导致与苏联直接对抗，威胁到核战争。"),
            es = LocalizedContent("¿Qué evento desencadenó la Crisis de los Misiles?", listOf("Construcción del muro de Berlín", "Misiles soviéticos en Cuba", "Invasión de Bahía de Cochinos", "Revolución cubana"), "Historia", "En octubre de 1962, el descubrimiento por parte de Estados Unidos de misiles nucleares soviéticos instalados en Cuba provocó una confrontación directa con la URSS, amenazando con una guerra nuclear.")
        ),
        BilingualQuestion(
            id = 12462, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La révolution russe a eu lieu en??", listOf("1915", "1916", "1917", "1918"), "Histoire", "La révolution russe de 1917 a renversé le régime tsariste, menant à la prise de pouvoir par les bolcheviks en octobre de la même année."),
            en = LocalizedContent("The Russian Revolution took place in?", listOf("1915", "1916", "1917", "1918"), "History", "The Russian Revolution of 1917 overthrew the tsarist regime, leading to the Bolshevik seizure of power in October of the same year."),
            zh = LocalizedContent("俄国革命发生在？", listOf("1915年", "1916年", "1917年", "1918年"), "历史", "1917年的俄国革命推翻了沙皇制度，导致布尔什维克在同年十月夺取政权。"),
            es = LocalizedContent("¿La revolución rusa tuvo lugar en?", listOf("1915", "1916", "1917", "1918"), "Historia", "La revolución rusa de 1917 derrocó el régimen zarista, llevando a la toma del poder por los bolcheviques en octubre del mismo año.")
        ),
        BilingualQuestion(
            id = 12463, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel type de gouvernement a mis en place Lénine?", listOf("Démocratie", "Monarchie", "Communisme", "Fascisme"), "Histoire", "Lénine a instauré un régime communiste après la révolution d'Octobre 1917, en renversant le gouvernement provisoire et en établissant la dictature du prolétariat."),
            en = LocalizedContent("What type of government did Lenin establish?", listOf("Democracy", "Monarchy", "Communism", "Fascism"), "History", "Lenin established a communist regime after the October Revolution of 1917, overthrowing the provisional government and establishing the dictatorship of the proletariat."),
            zh = LocalizedContent("列宁建立了什么类型的政府？", listOf("民主制", "君主制", "共产主义", "法西斯主义"), "历史", "列宁在1917年十月革命后建立了共产主义政权，推翻了临时政府，建立了无产阶级专政。"),
            es = LocalizedContent("¿Qué tipo de gobierno instauró Lenin?", listOf("Democracia", "Monarquía", "Comunismo", "Fascismo"), "Historia", "Lenin instauró un régimen comunista tras la revolución de Octubre de 1917, derrocando al gobierno provisional y estableciendo la dictadura del proletariado.")
        ),
        BilingualQuestion(
            id = 12464, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Komintern a été créé pour??", listOf("Promouvoir le communisme", "Défendre la Russie", "Combattre le fascisme", "Étendre l'empire soviétique"), "Histoire", "Le Komintern, ou Internationale communiste, a été fondé en 1919 par Lénine pour coordonner les partis communistes du monde entier et diffuser la révolution bolchevique."),
            en = LocalizedContent("The Comintern was created to?", listOf("Promote communism", "Defend Russia", "Fight fascism", "Expand the Soviet empire"), "History", "The Comintern, or Communist International, was founded in 1919 by Lenin to coordinate communist parties worldwide and spread the Bolshevik revolution."),
            zh = LocalizedContent("共产国际的创建是为了？", listOf("推广共产主义", "保卫俄罗斯", "对抗法西斯主义", "扩张苏联帝国"), "历史", "共产国际于1919年由列宁创立，旨在协调世界各地的共产党并传播布尔什维克革命。"),
            es = LocalizedContent("¿El Komintern fue creado para?", listOf("Promover el comunismo", "Defender Rusia", "Combatir el fascismo", "Expandir el imperio soviético"), "Historia", "El Komintern, o Internacional Comunista, fue fundado en 1919 por Lenin para coordinar los partidos comunistas del mundo y difundir la revolución bolchevique.")
        ),
        BilingualQuestion(
            id = 12465, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Staline a pris le pouvoir après la mort de??", listOf("Lénine", "Trotsky", "Kamenev", "Zinoviev"), "Histoire", "Lénine, fondateur de l'URSS, est mort en 1924, ouvrant une lutte de pouvoir remportée par Staline."),
            en = LocalizedContent("Stalin took power after the death of?", listOf("Lenin", "Trotsky", "Kamenev", "Zinoviev"), "History", "Lenin, founder of the USSR, died in 1924, opening a power struggle won by Stalin."),
            zh = LocalizedContent("斯大林在谁死后掌权？", listOf("列宁", "托洛茨基", "加米涅夫", "季诺维也夫"), "历史", "苏联创始人列宁于1924年去世，引发了权力斗争，最终由斯大林获胜。"),
            es = LocalizedContent("¿Stalin tomó el poder tras la muerte de?", listOf("Lenin", "Trotsky", "Kamenev", "Zinoviev"), "Historia", "Lenin, fundador de la URSS, murió en 1924, abriendo una lucha de poder que ganó Stalin.")
        ),
        BilingualQuestion(
            id = 12466, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel continent s'étend le plus vers le sud?", listOf("Afrique", "Amérique du Sud", "Australie", "Asie"), "Géographie", "Le point le plus méridional de l'Afrique, le cap des Aiguilles, se situe plus au sud que celui de tout autre continent, y compris l'Amérique du Sud."),
            en = LocalizedContent("Which continent extends farthest south?", listOf("Africa", "South America", "Australia", "Asia"), "Geography", "The southernmost point of Africa, Cape Agulhas, lies farther south than that of any other continent, including South America."),
            zh = LocalizedContent("哪个大陆向南延伸最远？", listOf("非洲", "南美洲", "澳大利亚", "亚洲"), "地理", "非洲最南端的厄加勒斯角比任何其他大陆（包括南美洲）的最南端都更靠南。"),
            es = LocalizedContent("¿Qué continente se extiende más al sur?", listOf("África", "América del Sur", "Australia", "Asia"), "Geografía", "El punto más meridional de África, el cabo de las Agujas, se encuentra más al sur que el de cualquier otro continente, incluida América del Sur.")
        ),
        BilingualQuestion(
            id = 12467, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le Cap Horn est le point le plus au sud de??", listOf("L'Amérique du Nord", "L'Amérique du Sud", "L'Afrique", "L'Asie"), "Géographie", "Le Cap Horn est situé à la pointe de l'archipel de la Terre de Feu, marquant l'extrémité sud du continent sud-américain."),
            en = LocalizedContent("Cape Horn is the southernmost point of?", listOf("North America", "South America", "Africa", "Asia"), "Geography", "Cape Horn is located at the tip of the Tierra del Fuego archipelago, marking the southern end of the South American continent."),
            zh = LocalizedContent("合恩角是哪个大陆的最南端？", listOf("北美洲", "南美洲", "非洲", "亚洲"), "地理", "合恩角位于火地群岛的顶端，标志着南美洲大陆的最南端。"),
            es = LocalizedContent("¿El Cabo de Hornos es el punto más al sur de?", listOf("América del Norte", "América del Sur", "África", "Asia"), "Geografía", "El Cabo de Hornos está situado en el extremo del archipiélago de Tierra del Fuego, marcando el extremo sur del continente sudamericano.")
        ),
        BilingualQuestion(
            id = 12468, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Les archipels volcaniques du Pacifique incluent les??", listOf("Hawaï", "Nouvelle-Zélande", "Tonga", "Samoa"), "Géographie", "Les îles Hawaï sont un archipel volcanique majeur du Pacifique, formé par un point chaud tectonique."),
            en = LocalizedContent("Volcanic archipelagos in the Pacific include the?", listOf("Hawaii", "New Zealand", "Tonga", "Samoa"), "Geography", "The Hawaiian Islands are a major volcanic archipelago in the Pacific, formed by a tectonic hotspot."),
            zh = LocalizedContent("太平洋的火山群岛包括？", listOf("夏威夷", "新西兰", "汤加", "萨摩亚"), "地理", "夏威夷群岛是太平洋中一个主要的火山群岛，由构造热点形成。"),
            es = LocalizedContent("Los archipiélagos volcánicos del Pacífico incluyen?", listOf("Hawái", "Nueva Zelanda", "Tonga", "Samoa"), "Geografía", "Las islas Hawái son un archipiélago volcánico importante del Pacífico, formado por un punto caliente tectónico.")
        ),
        BilingualQuestion(
            id = 12469, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La ceinture de feu du Pacifique comprend environ combien de volcans actifs?", listOf("200", "400", "600", "800"), "Géographie", "La ceinture de feu du Pacifique concentre environ 600 volcans actifs, soit 75 % des volcans émergés de la planète, en raison des mouvements des plaques tectoniques."),
            en = LocalizedContent("The Pacific Ring of Fire includes approximately how many active volcanoes?", listOf("200", "400", "600", "800"), "Geography", "The Pacific Ring of Fire concentrates about 600 active volcanoes, representing 75% of the world's emerged volcanoes, due to tectonic plate movements."),
            zh = LocalizedContent("太平洋火环包含大约多少座活火山？", listOf("200", "400", "600", "800"), "地理", "太平洋火环集中了约600座活火山，占全球陆地火山的75%，这是由于板块运动所致。"),
            es = LocalizedContent("El Cinturón de Fuego del Pacífico incluye aproximadamente ¿cuántos volcanes activos?", listOf("200", "400", "600", "800"), "Geografía", "El Cinturón de Fuego del Pacífico concentra alrededor de 600 volcanes activos, el 75% de los volcanes emergidos del planeta, debido a los movimientos de las placas tectónicas.")
        ),
        BilingualQuestion(
            id = 12470, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'Île de Sumatra se trouve dans quel pays?", listOf("Malaisie", "Indonésie", "Philippines", "Brunei"), "Géographie", "Sumatra est la sixième plus grande île du monde et fait partie de l'archipel indonésien, située à l'ouest de Java et Bornéo."),
            en = LocalizedContent("The island of Sumatra is located in which country?", listOf("Malaysia", "Indonesia", "Philippines", "Brunei"), "Geography", "Sumatra is the sixth largest island in the world and is part of the Indonesian archipelago, located west of Java and Borneo."),
            zh = LocalizedContent("苏门答腊岛位于哪个国家？", listOf("马来西亚", "印度尼西亚", "菲律宾", "文莱"), "地理", "苏门答腊岛是世界第六大岛，属于印度尼西亚群岛，位于爪哇岛和婆罗洲以西。"),
            es = LocalizedContent("La isla de Sumatra se encuentra en ¿qué país?", listOf("Malasia", "Indonesia", "Filipinas", "Brunéi"), "Geografía", "Sumatra es la sexta isla más grande del mundo y forma parte del archipiélago indonesio, situada al oeste de Java y Borneo.")
        ),
        BilingualQuestion(
            id = 12471, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le détroit de Lombok sépare quelles deux îles?", listOf("Sumatra et Java", "Bali et Lombok", "Java et Bali", "Lombok et Sumbawa"), "Géographie", "Le détroit de Lombok sépare les îles de Java et Bali, situées en Indonésie, et marque la limite entre les écorégions asiatiques et australiennes."),
            en = LocalizedContent("The Lombok Strait separates which two islands?", listOf("Sumatra and Java", "Bali and Lombok", "Java and Bali", "Lombok and Sumbawa"), "Geography", "The Lombok Strait separates the islands of Java and Bali, located in Indonesia, and marks the boundary between the Asian and Australian ecoregions."),
            zh = LocalizedContent("龙目海峡分隔哪两个岛屿？", listOf("苏门答腊和爪哇", "巴厘和龙目", "爪哇和巴厘", "龙目和松巴哇"), "地理", "龙目海峡分隔了印度尼西亚的爪哇岛和巴厘岛，并标志着亚洲和澳大利亚生态区的分界线。"),
            es = LocalizedContent("El estrecho de Lombok separa ¿qué dos islas?", listOf("Sumatra y Java", "Bali y Lombok", "Java y Bali", "Lombok y Sumbawa"), "Geografía", "El estrecho de Lombok separa las islas de Java y Bali, situadas en Indonesia, y marca el límite entre las ecorregiones asiática y australiana.")
        ),
        BilingualQuestion(
            id = 12472, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'Île de Socotra appartient à quel pays?", listOf("Oman", "Yémen", "Arabie Saoudite", "Émirats Arabes Unis"), "Géographie", "Socotra est un archipel situé dans l'océan Indien, rattaché au Yémen depuis 1990."),
            en = LocalizedContent("The island of Socotra belongs to which country?", listOf("Oman", "Yemen", "Saudi Arabia", "United Arab Emirates"), "Geography", "Socotra is an archipelago located in the Indian Ocean, attached to Yemen since 1990."),
            zh = LocalizedContent("索科特拉岛属于哪个国家？", listOf("阿曼", "也门", "沙特阿拉伯", "阿拉伯联合酋长国"), "地理", "索科特拉岛是位于印度洋的一个群岛，自1990年起隶属于也门。"),
            es = LocalizedContent("La isla de Socotra pertenece a ¿qué país?", listOf("Omán", "Yemen", "Arabia Saudita", "Emiratos Árabes Unidos"), "Geografía", "Socotra es un archipiélago situado en el océano Índico, adscrito a Yemen desde 1990.")
        ),
        BilingualQuestion(
            id = 12473, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les îles Nicobar appartiennent à quel pays?", listOf("Thaïlande", "Inde", "Birmanie", "Malaisie"), "Géographie", "Les îles Nicobar forment un territoire de l'Union indienne, avec les îles Andaman, sous le nom de îles Andaman-et-Nicobar."),
            en = LocalizedContent("The Nicobar Islands belong to which country?", listOf("Thailand", "India", "Myanmar", "Malaysia"), "Geography", "The Nicobar Islands form a union territory of India, together with the Andaman Islands, under the name Andaman and Nicobar Islands."),
            zh = LocalizedContent("尼科巴群岛属于哪个国家？", listOf("泰国", "印度", "缅甸", "马来西亚"), "地理", "尼科巴群岛与安达曼群岛共同组成印度的联邦属地，称为安达曼-尼科巴群岛。"),
            es = LocalizedContent("Las islas Nicobar pertenecen a ¿qué país?", listOf("Tailandia", "India", "Birmania", "Malasia"), "Geografía", "Las islas Nicobar forman un territorio de la Unión India, junto con las islas Andamán, bajo el nombre de islas Andamán y Nicobar.")
        ),
        BilingualQuestion(
            id = 12474, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'Île de Timor est partagée entre l'Indonésie et le??", listOf("Papouasie-Nouvelle-Guinée", "Timor oriental", "Malaisie", "Philippines"), "Géographie", "Timor est divisée entre l'Indonésie à l'ouest et le Timor oriental, un État souverain indépendant depuis 2002."),
            en = LocalizedContent("The island of Timor is shared between Indonesia and which country?", listOf("Papua New Guinea", "East Timor", "Malaysia", "Philippines"), "Geography", "Timor is divided between Indonesia in the west and East Timor, a sovereign state independent since 2002."),
            zh = LocalizedContent("帝汶岛由印度尼西亚和哪个国家共享？", listOf("巴布亚新几内亚", "东帝汶", "马来西亚", "菲律宾"), "地理", "帝汶岛西部属于印度尼西亚，东部属于东帝汶，东帝汶自2002年起成为一个独立的主权国家。"),
            es = LocalizedContent("La isla de Timor está compartida entre Indonesia y ¿qué país?", listOf("Papúa Nueva Guinea", "Timor Oriental", "Malasia", "Filipinas"), "Geografía", "Timor está dividida entre Indonesia al oeste y Timor Oriental, un estado soberano independiente desde 2002.")
        ),
        BilingualQuestion(
            id = 12475, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Désert de Taklamakan se trouve en??", listOf("Mongolie", "Chine", "Russie", "Kazakhstan"), "Géographie", "Le désert de Taklamakan est situé dans la région autonome ouïghoure du Xinjiang, dans le nord-ouest de la Chine. C'est l'un des plus grands déserts de sable au monde."),
            en = LocalizedContent("The Taklamakan Desert is located in which country?", listOf("Mongolia", "China", "Russia", "Kazakhstan"), "Geography", "The Taklamakan Desert is located in the Xinjiang Uyghur Autonomous Region in northwestern China. It is one of the largest sandy deserts in the world."),
            zh = LocalizedContent("塔克拉玛干沙漠位于哪个国家？", listOf("蒙古", "中国", "俄罗斯", "哈萨克斯坦"), "地理", "塔克拉玛干沙漠位于中国西北部的新疆维吾尔自治区，是世界上最大的沙质沙漠之一。"),
            es = LocalizedContent("El desierto de Taklamakan se encuentra en ¿qué país?", listOf("Mongolia", "China", "Rusia", "Kazajistán"), "Geografía", "El desierto de Taklamakan está situado en la región autónoma uigur de Xinjiang, en el noroeste de China. Es uno de los mayores desiertos de arena del mundo.")
        ),
        BilingualQuestion(
            id = 12476, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La rivière Brahmapoutre traverse quel pays?", listOf("Inde uniquement", "Inde et Bangladesh", "Bangladesh uniquement", "Inde, Chine et Bangladesh"), "Géographie", "Le Brahmapoutre prend sa source au Tibet (Chine), traverse le nord-est de l'Inde, puis se jette dans le golfe du Bengale au Bangladesh."),
            en = LocalizedContent("The Brahmaputra River flows through which country?", listOf("India only", "India and Bangladesh", "Bangladesh only", "India, China and Bangladesh"), "Geography", "The Brahmaputra originates in Tibet (China), flows through northeastern India, and then empties into the Bay of Bengal in Bangladesh."),
            zh = LocalizedContent("布拉马普特拉河流经哪个国家？", listOf("仅印度", "印度和孟加拉国", "仅孟加拉国", "印度、中国和孟加拉国"), "地理", "布拉马普特拉河发源于中国西藏，流经印度东北部，最后在孟加拉国注入孟加拉湾。"),
            es = LocalizedContent("El río Brahmaputra atraviesa ¿qué país?", listOf("Solo India", "India y Bangladés", "Solo Bangladés", "India, China y Bangladés"), "Geografía", "El Brahmaputra nace en el Tíbet (China), atraviesa el noreste de la India y desemboca en la bahía de Bengala en Bangladés.")
        ),
        BilingualQuestion(
            id = 12477, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Lac Tanganyika est le plus profond du continent??", listOf("Asie", "Américain", "Africain", "Européen"), "Géographie", "Le Lac Tanganyika, avec une profondeur maximale de 1 470 mètres, est le deuxième lac le plus profond du monde et le plus profond d'Afrique. Il fait partie de la vallée du Grand Rift."),
            en = LocalizedContent("Lake Tanganyika is the deepest lake on which continent?", listOf("Asia", "America", "Africa", "Europe"), "Geography", "Lake Tanganyika, with a maximum depth of 1,470 meters, is the second deepest lake in the world and the deepest in Africa. It is part of the Great Rift Valley."),
            zh = LocalizedContent("坦噶尼喀湖是哪个大陆最深的湖泊？", listOf("亚洲", "美洲", "非洲", "欧洲"), "地理", "坦噶尼喀湖最大深度为1470米，是世界第二深湖，也是非洲最深的湖泊，属于东非大裂谷的一部分。"),
            es = LocalizedContent("El lago Tanganica es el más profundo de ¿qué continente?", listOf("Asia", "América", "África", "Europa"), "Geografía", "El lago Tanganica, con una profundidad máxima de 1.470 metros, es el segundo lago más profundo del mundo y el más profundo de África. Forma parte del Gran Valle del Rift.")
        ),
        BilingualQuestion(
            id = 12478, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La calotte glaciaire de l'Antarctique contient environ combien de pourcents de la glace mondiale?", listOf("60%", "70%", "80%", "90%"), "Géographie", "L'Antarctique renferme environ 90 % de la glace mondiale et 70 % de l'eau douce de la planète, ce qui en fait le plus grand réservoir de glace terrestre."),
            en = LocalizedContent("The Antarctic ice sheet contains approximately what percentage of the world's ice?", listOf("60%", "70%", "80%", "90%"), "Geography", "Antarctica holds about 90% of the world's ice and 70% of the planet's fresh water, making it the largest reservoir of terrestrial ice."),
            zh = LocalizedContent("南极冰盖包含全球大约百分之多少的冰？", listOf("60%", "70%", "80%", "90%"), "地理", "南极洲拥有全球约90%的冰和70%的淡水，是世界上最大的陆地冰库。"),
            es = LocalizedContent("La capa de hielo de la Antártida contiene aproximadamente ¿qué porcentaje del hielo mundial?", listOf("60%", "70%", "80%", "90%"), "Geografía", "La Antártida alberga aproximadamente el 90% del hielo mundial y el 70% del agua dulce del planeta, lo que la convierte en el mayor reservorio de hielo terrestre.")
        ),
        BilingualQuestion(
            id = 12479, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'Île du Roi-Guillaume se trouve en??", listOf("Groenland", "Canada", "Russie", "Antarctique"), "Géographie", "L'Île du Roi-Guillaume est située dans l'archipel arctique canadien, au Nunavut, dans le nord du Canada."),
            en = LocalizedContent("King William Island is located in?", listOf("Greenland", "Canada", "Russia", "Antarctica"), "Geography", "King William Island is situated in the Canadian Arctic Archipelago, in Nunavut, northern Canada."),
            zh = LocalizedContent("威廉王岛位于？", listOf("格陵兰", "加拿大", "俄罗斯", "南极洲"), "地理", "威廉王岛位于加拿大北极群岛的努纳武特地区，在加拿大北部。"),
            es = LocalizedContent("¿La Isla del Rey Guillermo se encuentra en?", listOf("Groenlandia", "Canadá", "Rusia", "Antártida"), "Geografía", "La Isla del Rey Guillermo está situada en el archipiélago ártico canadiense, en Nunavut, al norte de Canadá.")
        ),
        BilingualQuestion(
            id = 12480, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Passage du Nord-Ouest relie l'océan Atlantique au??", listOf("Pacifique", "Indien", "Arctique", "Atlantique"), "Géographie", "Le Passage du Nord-Ouest traverse l'archipel arctique canadien, reliant l'océan Atlantique à l'océan Pacifique par le détroit de Béring."),
            en = LocalizedContent("The Northwest Passage connects the Atlantic Ocean to the?", listOf("Pacific", "Indian", "Arctic", "Atlantic"), "Geography", "The Northwest Passage traverses the Canadian Arctic Archipelago, connecting the Atlantic Ocean to the Pacific Ocean via the Bering Strait."),
            zh = LocalizedContent("西北航道连接大西洋和？", listOf("太平洋", "印度洋", "北冰洋", "大西洋"), "地理", "西北航道穿越加拿大北极群岛，通过白令海峡连接大西洋和太平洋。"),
            es = LocalizedContent("¿El Paso del Noroeste conecta el océano Atlántico con el?", listOf("Pacífico", "Índico", "Ártico", "Atlántico"), "Geografía", "El Paso del Noroeste atraviesa el archipiélago ártico canadiense, conectando el océano Atlántico con el océano Pacífico a través del estrecho de Bering.")
        ),
        BilingualQuestion(
            id = 12481, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel manga iscours sur les pouvoirs psychiques?", listOf("Mob Psycho 100", "Psycho-Pass", "Death Note", "Code Geass"), "Culture", "Mob Psycho 100 suit Shigeo Kageyama, un collégien aux puissants pouvoirs psychiques qu'il apprend à maîtriser."),
            en = LocalizedContent("Which manga focuses on psychic powers?", listOf("Mob Psycho 100", "Psycho-Pass", "Death Note", "Code Geass"), "Culture", "Mob Psycho 100 follows Shigeo Kageyama, a middle schooler with powerful psychic abilities that he learns to control."),
            zh = LocalizedContent("哪部漫画以超能力为主题？", listOf("灵能百分百", "心理测量者", "死亡笔记", "反叛的鲁路修"), "文化", "《灵能百分百》讲述了影山茂夫，一个拥有强大超能力并学习控制它的中学生。"),
            es = LocalizedContent("¿Qué manga trata sobre poderes psíquicos?", listOf("Mob Psycho 100", "Psycho-Pass", "Death Note", "Code Geass"), "Cultura", "Mob Psycho 100 sigue a Shigeo Kageyama, un estudiante de secundaria con poderosas habilidades psíquicas que aprende a dominar.")
        ),
        BilingualQuestion(
            id = 12482, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La BD 'Sandman' a été écrite par??", listOf("Alan Moore", "Neil Gaiman", "Frank Miller", "Grant Morrison"), "Culture", "Neil Gaiman a créé la série de bande dessinée Sandman pour DC Comics, publiée de 1989 à 1996, qui est devenue un classique du genre fantastique et onirique."),
            en = LocalizedContent("The comic 'Sandman' was written by?", listOf("Alan Moore", "Neil Gaiman", "Frank Miller", "Grant Morrison"), "Culture", "Neil Gaiman created the Sandman comic series for DC Comics, published from 1989 to 1996, which became a classic of fantasy and dreamlike storytelling."),
            zh = LocalizedContent("漫画《睡魔》的作者是？", listOf("艾伦·摩尔", "尼尔·盖曼", "弗兰克·米勒", "格兰特·莫里森"), "文化", "尼尔·盖曼为DC漫画创作了《睡魔》系列，于1989年至1996年出版，成为奇幻和梦境叙事的经典。"),
            es = LocalizedContent("¿El cómic 'Sandman' fue escrito por?", listOf("Alan Moore", "Neil Gaiman", "Frank Miller", "Grant Morrison"), "Cultura", "Neil Gaiman creó la serie de cómics Sandman para DC Comics, publicada de 1989 a 1996, que se convirtió en un clásico del género fantástico y onírico.")
        ),
        BilingualQuestion(
            id = 12483, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel jeu de plateau simule une gestion bancaire?", listOf("Monopoly", "Carcassonne", "Puerto Rico", "Agricola"), "Culture", "Le Monopoly est un jeu de société où les joueurs achètent, louent et échangent des propriétés, simulant des transactions financières et une gestion bancaire simplifiée."),
            en = LocalizedContent("Which board game simulates banking management?", listOf("Monopoly", "Carcassonne", "Puerto Rico", "Agricola"), "Culture", "Monopoly is a board game where players buy, rent, and trade properties, simulating financial transactions and simplified banking management."),
            zh = LocalizedContent("哪款桌游模拟银行管理？", listOf("大富翁", "卡卡颂", "波多黎各", "农场主"), "文化", "大富翁是一款玩家购买、出租和交易房产的桌游，模拟金融交易和简化的银行管理。"),
            es = LocalizedContent("¿Qué juego de mesa simula la gestión bancaria?", listOf("Monopoly", "Carcassonne", "Puerto Rico", "Agricola"), "Cultura", "Monopoly es un juego de mesa donde los jugadores compran, alquilan e intercambian propiedades, simulando transacciones financieras y gestión bancaria simplificada.")
        ),
        BilingualQuestion(
            id = 12484, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le 'Safran' est une épice très coûteuse originaire de??", listOf("Iran", "Inde", "Maroc", "Espagne"), "Culture", "Le safran provient du crocus sativus, et l'Iran est de loin le premier producteur mondial, assurant plus de 90% de la récolte."),
            en = LocalizedContent("'Saffron' is a very expensive spice originally from?", listOf("Iran", "India", "Morocco", "Spain"), "Culture", "Saffron comes from the crocus sativus flower, and Iran is by far the world's largest producer, accounting for over 90% of the harvest."),
            zh = LocalizedContent("“藏红花”是一种非常昂贵的香料，原产于？", listOf("伊朗", "印度", "摩洛哥", "西班牙"), "文化", "藏红花来自番红花，伊朗是迄今为止世界上最大的生产国，占收成的90%以上。"),
            es = LocalizedContent("¿El 'Azafrán' es una especia muy costosa originaria de?", listOf("Irán", "India", "Marruecos", "España"), "Cultura", "El azafrán proviene del crocus sativus, e Irán es, con diferencia, el mayor productor mundial, asegurando más del 90% de la cosecha.")
        ),
        BilingualQuestion(
            id = 12485, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel anime adapte le manga 'My Hero Academia'?", listOf("Studio A-1 Pictures", "Studio Bones", "MAPPA", "Ufotable"), "Culture", "Le studio Bones a produit l'adaptation animée de My Hero Academia, diffusée depuis 2016."),
            en = LocalizedContent("Which anime adapts the manga 'My Hero Academia'?", listOf("Studio A-1 Pictures", "Studio Bones", "MAPPA", "Ufotable"), "Culture", "Studio Bones produced the anime adaptation of My Hero Academia, which has been airing since 2016."),
            zh = LocalizedContent("哪家动画公司改编了漫画《我的英雄学院》？", listOf("A-1 Pictures", "骨头社", "MAPPA", "飞碟社"), "文化", "骨头社制作了《我的英雄学院》的动画改编，自2016年开始播出。"),
            es = LocalizedContent("¿Qué estudio de anime adapta el manga 'My Hero Academia'?", listOf("Studio A-1 Pictures", "Studio Bones", "MAPPA", "Ufotable"), "Cultura", "El estudio Bones produjo la adaptación animada de My Hero Academia, que se emite desde 2016.")
        ),
        BilingualQuestion(
            id = 12486, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La BD 'V pour Vendetta' a été écrite par??", listOf("Frank Miller", "Alan Moore", "Neil Gaiman", "Grant Morrison"), "Culture", "Alan Moore, auteur britannique renommé, a écrit \"V pour Vendetta\" avec le dessinateur David Lloyd, publiée dans les années 1980."),
            en = LocalizedContent("The comic 'V for Vendetta' was written by?", listOf("Frank Miller", "Alan Moore", "Neil Gaiman", "Grant Morrison"), "Culture", "Alan Moore, renowned British author, wrote 'V for Vendetta' with artist David Lloyd, published in the 1980s."),
            zh = LocalizedContent("漫画《V字仇杀队》的作者是？", listOf("弗兰克·米勒", "艾伦·摩尔", "尼尔·盖曼", "格兰特·莫里森"), "文化", "英国著名作家艾伦·摩尔与画家大卫·劳埃德合作创作了《V字仇杀队》，于20世纪80年代出版。"),
            es = LocalizedContent("¿El cómic 'V de Vendetta' fue escrito por?", listOf("Frank Miller", "Alan Moore", "Neil Gaiman", "Grant Morrison"), "Cultura", "Alan Moore, reconocido autor británico, escribió 'V de Vendetta' con el dibujante David Lloyd, publicada en los años 80.")
        ),
        BilingualQuestion(
            id = 12487, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel jeu de plateau utilise un plateau hexagonal?", listOf("Catan", "Carcassonne", "Splendor", "Ticket to Ride"), "Culture", "Le plateau de Catan est composé de tuiles hexagonales représentant différentes ressources, ce qui permet une configuration de jeu modulaire et stratégique."),
            en = LocalizedContent("Which board game uses a hexagonal board?", listOf("Catan", "Carcassonne", "Splendor", "Ticket to Ride"), "Culture", "The board of Catan is made up of hexagonal tiles representing different resources, allowing for a modular and strategic game setup."),
            zh = LocalizedContent("哪款桌游使用六边形棋盘？", listOf("卡坦岛", "卡卡颂", "璀璨宝石", "车票之旅"), "文化", "卡坦岛的棋盘由代表不同资源的六边形板块组成，实现了模块化和策略性的游戏布局。"),
            es = LocalizedContent("¿Qué juego de mesa utiliza un tablero hexagonal?", listOf("Catan", "Carcassonne", "Splendor", "Ticket to Ride"), "Cultura", "El tablero de Catan está compuesto por fichas hexagonales que representan diferentes recursos, lo que permite una configuración de juego modular y estratégica.")
        ),
        BilingualQuestion(
            id = 12488, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Le 'Miel' est produit par??", listOf("Fourmis", "Abeilles", "Guêpes", "Frelons"), "Culture", "Les abeilles butinent le nectar des fleurs et le transforment en miel dans leur estomac, avant de le stocker dans les alvéoles de la ruche."),
            en = LocalizedContent("'Honey' is produced by?", listOf("Ants", "Bees", "Wasps", "Hornets"), "Culture", "Bees collect nectar from flowers and transform it into honey in their stomachs, then store it in the honeycomb cells of the hive."),
            zh = LocalizedContent("“蜂蜜”是由什么生产的？", listOf("蚂蚁", "蜜蜂", "黄蜂", "大黄蜂"), "文化", "蜜蜂从花朵中采集花蜜，在胃中将其转化为蜂蜜，然后储存在蜂巢的蜂室中。"),
            es = LocalizedContent("¿La 'Miel' es producida por?", listOf("Hormigas", "Abejas", "Avispas", "Avispones"), "Cultura", "Las abejas recolectan néctar de las flores y lo transforman en miel en su estómago, antes de almacenarlo en las celdas del panal.")
        ),
        BilingualQuestion(
            id = 12489, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel anime a battu le record du film d'animation le plus rentable?", listOf("Dragon Ball Z", "Demon Slayer", "One Piece", "Jujutsu Kaisen 0"), "Culture", "Le film Demon Slayer : Le Train de l'Infini a dépassé Le Voyage de Chihiro au box-office japonais en 2020, devenant le film d'animation le plus rentable de l'histoire au Japon."),
            en = LocalizedContent("Which anime broke the record for the highest-grossing animated film?", listOf("Dragon Ball Z", "Demon Slayer", "One Piece", "Jujutsu Kaisen 0"), "Culture", "The film Demon Slayer: Mugen Train surpassed Spirited Away at the Japanese box office in 2020, becoming the highest-grossing animated film in Japanese history."),
            zh = LocalizedContent("哪部动漫打破了最卖座动画电影的纪录？", listOf("龙珠Z", "鬼灭之刃", "海贼王", "咒术回战0"), "文化", "电影《鬼灭之刃：无限列车》在2020年超越了《千与千寻》的日本票房，成为日本历史上最卖座的动画电影。"),
            es = LocalizedContent("¿Qué anime rompió el récord de la película de animación más taquillera?", listOf("Dragon Ball Z", "Demon Slayer", "One Piece", "Jujutsu Kaisen 0"), "Cultura", "La película Demon Slayer: Mugen Train superó a El viaje de Chihiro en la taquilla japonesa en 2020, convirtiéndose en la película de animación más taquillera de la historia en Japón.")
        ),
        BilingualQuestion(
            id = 12490, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La BD 'Y' a été écrite par??", listOf("Brian K. Vaughan", "Grant Morrison", "Alan Moore", "Neil Gaiman"), "Culture", "Brian K. Vaughan est le scénariste de la série de bande dessinée de science-fiction Y, le dernier homme, publiée par DC Comics sous le label Vertigo."),
            en = LocalizedContent("The comic 'Y' was written by?", listOf("Brian K. Vaughan", "Grant Morrison", "Alan Moore", "Neil Gaiman"), "Culture", "Brian K. Vaughan is the writer of the science fiction comic series Y: The Last Man, published by DC Comics under the Vertigo label."),
            zh = LocalizedContent("漫画《Y》是由谁创作的？", listOf("布莱恩·K·沃恩", "格兰特·莫里森", "艾伦·摩尔", "尼尔·盖曼"), "文化", "布莱恩·K·沃恩是科幻漫画系列《Y：最后一个男人》的编剧，由DC漫画旗下Vertigo品牌出版。"),
            es = LocalizedContent("¿Quién escribió el cómic 'Y'?", listOf("Brian K. Vaughan", "Grant Morrison", "Alan Moore", "Neil Gaiman"), "Cultura", "Brian K. Vaughan es el guionista de la serie de cómics de ciencia ficción Y: El último hombre, publicada por DC Comics bajo el sello Vertigo.")
        ),
        BilingualQuestion(
            id = 12491, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel jeu est basé sur la construction de villages?", listOf("Monopoly", "Agricola", "Splendor", "Ticket to Ride"), "Culture", "Agricola est un jeu de société allemand où les joueurs développent des fermes et des villages en gérant des ressources et des cultures."),
            en = LocalizedContent("Which game is based on building villages?", listOf("Monopoly", "Agricola", "Splendor", "Ticket to Ride"), "Culture", "Agricola is a German board game where players develop farms and villages by managing resources and crops."),
            zh = LocalizedContent("哪款游戏是基于建造村庄的？", listOf("大富翁", "农场主", "璀璨宝石", "车票之旅"), "文化", "《农场主》是一款德国桌游，玩家通过管理资源和作物来发展农场和村庄。"),
            es = LocalizedContent("¿Qué juego se basa en la construcción de aldeas?", listOf("Monopoly", "Agricola", "Splendor", "Ticket to Ride"), "Cultura", "Agricola es un juego de mesa alemán donde los jugadores desarrollan granjas y aldeas gestionando recursos y cultivos.")
        ),
        BilingualQuestion(
            id = 12492, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le 'Vinaigre balsamique' vient de??", listOf("France", "Italie", "Espagne", "Grèce"), "Culture", "Le vinaigre balsamique traditionnel est produit exclusivement dans les régions de Modène et Reggio d'Émilie, en Italie, selon des méthodes artisanales protégées par des appellations d'origine contrôlée."),
            en = LocalizedContent("Balsamic vinegar comes from?", listOf("France", "Italy", "Spain", "Greece"), "Culture", "Traditional balsamic vinegar is produced exclusively in the regions of Modena and Reggio Emilia, Italy, using artisanal methods protected by controlled designation of origin."),
            zh = LocalizedContent("香醋产自哪里？", listOf("法国", "意大利", "西班牙", "希腊"), "文化", "传统香醋仅在意大利的摩德纳和雷焦艾米利亚地区生产，采用受原产地命名保护的手工方法。"),
            es = LocalizedContent("¿De dónde proviene el vinagre balsámico?", listOf("Francia", "Italia", "España", "Grecia"), "Cultura", "El vinagre balsámico tradicional se produce exclusivamente en las regiones de Módena y Reggio Emilia, Italia, mediante métodos artesanales protegidos por denominaciones de origen controladas.")
        ),
        BilingualQuestion(
            id = 12493, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel anime a le plus de films cinéma?", listOf("One Piece", "Dragon Ball", "Detective Conan", "Naruto"), "Culture", "One Piece détient le record du plus grand nombre de films d'animation adaptés d'un manga, avec plus de quinze longs-métrages sortis au cinéma depuis 2000."),
            en = LocalizedContent("Which anime has the most theatrical films?", listOf("One Piece", "Dragon Ball", "Detective Conan", "Naruto"), "Culture", "One Piece holds the record for the highest number of animated films adapted from a manga, with over fifteen feature films released in theaters since 2000."),
            zh = LocalizedContent("哪部动漫的剧场版电影最多？", listOf("海贼王", "龙珠", "名侦探柯南", "火影忍者"), "文化", "《海贼王》保持着漫画改编动画电影数量最多的纪录，自2000年以来已上映超过十五部剧场版。"),
            es = LocalizedContent("¿Qué anime tiene más películas cinematográficas?", listOf("One Piece", "Dragon Ball", "Detective Conan", "Naruto"), "Cultura", "One Piece tiene el récord del mayor número de películas de animación adaptadas de un manga, con más de quince largometrajes estrenados en cines desde 2000.")
        ),
        BilingualQuestion(
            id = 12494, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La BD 'Fables' a été écrite par??", listOf("Mark Waid", "Bill Willingham", "Brian K. Vaughan", "Jonathan Hickman"), "Culture", "Bill Willingham est l'auteur américain de la série de bande dessinée 'Fables', publiée par DC Comics sous le label Vertigo de 2002 à 2015."),
            en = LocalizedContent("The comic 'Fables' was written by?", listOf("Mark Waid", "Bill Willingham", "Brian K. Vaughan", "Jonathan Hickman"), "Culture", "Bill Willingham is the American author of the comic series 'Fables', published by DC Comics under the Vertigo label from 2002 to 2015."),
            zh = LocalizedContent("漫画《童话中人》是由谁创作的？", listOf("马克·韦德", "比尔·威林厄姆", "布莱恩·K·沃恩", "乔纳森·希克曼"), "文化", "比尔·威林厄姆是美国漫画系列《童话中人》的作者，由DC漫画旗下Vertigo品牌于2002年至2015年出版。"),
            es = LocalizedContent("¿Quién escribió el cómic 'Fables'?", listOf("Mark Waid", "Bill Willingham", "Brian K. Vaughan", "Jonathan Hickman"), "Cultura", "Bill Willingham es el autor estadounidense de la serie de cómics 'Fables', publicada por DC Comics bajo el sello Vertigo de 2002 a 2015.")
        ),
        BilingualQuestion(
            id = 12495, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel jeu est connu pour avoir une longue durée de jeu?", listOf("Monopoly", "Risk", "Twilight Imperium", "Tous les trois"), "Culture", "Ces trois jeux (comme les RPG, les jeux de stratégie ou les jeux en monde ouvert) sont réputés pour leur contenu extensif et leur durée de vie pouvant dépasser la centaine d'heures."),
            en = LocalizedContent("Which game is known for having a long playtime?", listOf("Monopoly", "Risk", "Twilight Imperium", "All three"), "Culture", "These three games (like RPGs, strategy games, or open-world games) are known for their extensive content and playtime that can exceed a hundred hours."),
            zh = LocalizedContent("哪款游戏以游戏时间长而闻名？", listOf("大富翁", "风险", "帝国曙光", "以上全部"), "文化", "这三款游戏（如角色扮演游戏、策略游戏或开放世界游戏）以其丰富的内容和可能超过一百小时的游戏时间而闻名。"),
            es = LocalizedContent("¿Qué juego es conocido por tener una larga duración de juego?", listOf("Monopoly", "Risk", "Twilight Imperium", "Los tres"), "Cultura", "Estos tres juegos (como los RPG, juegos de estrategia o juegos de mundo abierto) son conocidos por su contenido extenso y una duración que puede superar las cien horas.")
        ),
        BilingualQuestion(
            id = 12496, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le 'Truffe' est un champignon coûteux de??", listOf("France", "Italie", "Espagne", "Allemagne"), "Culture", "La truffe noire, aussi appelée truffe du Périgord, est un champignon souterrain très prisé en gastronomie, principalement récolté dans le sud-ouest de la France."),
            en = LocalizedContent("The 'truffle' is an expensive mushroom from?", listOf("France", "Italy", "Spain", "Germany"), "Culture", "The black truffle, also known as Périgord truffle, is a highly prized underground mushroom in gastronomy, mainly harvested in southwestern France."),
            zh = LocalizedContent("“松露”是一种昂贵的蘑菇，产自哪里？", listOf("法国", "意大利", "西班牙", "德国"), "文化", "黑松露，又称佩里戈尔松露，是一种在美食中备受推崇的地下蘑菇，主要产于法国西南部。"),
            es = LocalizedContent("¿De dónde proviene la 'trufa', un hongo caro?", listOf("Francia", "Italia", "España", "Alemania"), "Cultura", "La trufa negra, también llamada trufa del Périgord, es un hongo subterráneo muy apreciado en gastronomía, recolectado principalmente en el suroeste de Francia.")
        ),
        BilingualQuestion(
            id = 12497, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel anime a la plus grande fanbase mondiale?", listOf("One Piece", "Dragon Ball Z", "Naruto", "Demon Slayer"), "Culture", "One Piece détient le record mondial de ventes de mangas et son adaptation animée est diffusée depuis 1999, ce qui lui a permis de rassembler une communauté massive et fidèle à travers le monde."),
            en = LocalizedContent("Which anime has the largest global fanbase?", listOf("One Piece", "Dragon Ball Z", "Naruto", "Demon Slayer"), "Culture", "One Piece holds the world record for manga sales and its anime adaptation has been airing since 1999, allowing it to gather a massive and loyal community worldwide."),
            zh = LocalizedContent("哪部动漫拥有全球最大的粉丝群体？", listOf("海贼王", "龙珠Z", "火影忍者", "鬼灭之刃"), "文化", "《海贼王》保持着漫画销量的世界纪录，其动画改编自1999年开始播出，因此在全球聚集了庞大而忠实的粉丝群体。"),
            es = LocalizedContent("¿Qué anime tiene la mayor base de fans global?", listOf("One Piece", "Dragon Ball Z", "Naruto", "Demon Slayer"), "Cultura", "One Piece tiene el récord mundial de ventas de manga y su adaptación animada se emite desde 1999, lo que le ha permitido reunir una comunidad masiva y leal en todo el mundo.")
        ),
        BilingualQuestion(
            id = 12498, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La BD 'Maus' a été écrite par??", listOf("Robert Crumb", "Art Spiegelman", "Will Eisner", "Harvey Pekar"), "Culture", "Art Spiegelman a écrit \"Maus\", une bande dessinée primée qui raconte l'Holocauste en représentant les Juifs comme des souris et les nazis comme des chats."),
            en = LocalizedContent("The comic 'Maus' was written by?", listOf("Robert Crumb", "Art Spiegelman", "Will Eisner", "Harvey Pekar"), "Culture", "Art Spiegelman wrote 'Maus', an award-winning comic that depicts the Holocaust by representing Jews as mice and Nazis as cats."),
            zh = LocalizedContent("漫画《鼠族》是由谁创作的？", listOf("罗伯特·克拉姆", "阿特·斯皮格曼", "威尔·艾斯纳", "哈维·佩卡"), "文化", "阿特·斯皮格曼创作了《鼠族》，这部获奖漫画通过将犹太人描绘成老鼠、纳粹描绘成猫来讲述大屠杀。"),
            es = LocalizedContent("¿Quién escribió el cómic 'Maus'?", listOf("Robert Crumb", "Art Spiegelman", "Will Eisner", "Harvey Pekar"), "Cultura", "Art Spiegelman escribió 'Maus', un cómic galardonado que narra el Holocausto representando a los judíos como ratones y a los nazis como gatos.")
        ),
        BilingualQuestion(
            id = 12499, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel jeu simule le contrôle de civilisations?", listOf("Civilization", "Risk", "Colonists", "Tous les trois"), "Culture", "Civilization, Age of Empires et Rise of Nations sont tous des jeux de stratégie où le joueur dirige le développement d’une civilisation."),
            en = LocalizedContent("Which game simulates the control of civilizations?", listOf("Civilization", "Risk", "Colonists", "All three"), "Culture", "Civilization, Age of Empires and Rise of Nations are all strategy games where the player directs the development of a civilization."),
            zh = LocalizedContent("哪款游戏模拟了文明的控制？", listOf("文明", "风险", "殖民者", "以上全部"), "文化", "《文明》、《帝国时代》和《国家的崛起》都是策略游戏，玩家在其中指导文明的发展。"),
            es = LocalizedContent("¿Qué juego simula el control de civilizaciones?", listOf("Civilization", "Risk", "Colonists", "Los tres"), "Cultura", "Civilization, Age of Empires y Rise of Nations son juegos de estrategia donde el jugador dirige el desarrollo de una civilización.")
        ),
        BilingualQuestion(
            id = 12500, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel jeu vidéo est le sport électronique le plus regardé au monde?", listOf("Fortnite", "League of Legends", "Dota 2", "Counter-Strike"), "Sport", "League of Legends domine l'audience des sports électroniques grâce à son championnat du monde annuel, qui attire des dizaines de millions de spectateurs, et à sa scène compétitive très médiatisée."),
            en = LocalizedContent("Which video game is the most watched esport in the world?", listOf("Fortnite", "League of Legends", "Dota 2", "Counter-Strike"), "Sports", "League of Legends dominates esports viewership thanks to its annual world championship, which attracts tens of millions of viewers, and its highly publicized competitive scene."),
            zh = LocalizedContent("哪款电子游戏是世界上观看人数最多的电子竞技项目？", listOf("堡垒之夜", "英雄联盟", "刀塔2", "反恐精英"), "体育", "英雄联盟凭借其年度世界锦标赛吸引了数千万观众，以及其备受瞩目的竞技场景，主导了电子竞技的观众人数。"),
            es = LocalizedContent("¿Qué videojuego es el deporte electrónico más visto del mundo?", listOf("Fortnite", "League of Legends", "Dota 2", "Counter-Strike"), "Deportes", "League of Legends domina la audiencia de los deportes electrónicos gracias a su campeonato mundial anual, que atrae a decenas de millones de espectadores, y a su escena competitiva muy mediática.")
        ),
        BilingualQuestion(
            id = 12501, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le skateboard a-t-il été introduit aux Jeux Olympiques?", listOf("2020", "2016", "2012", "2024"), "Sport", "Le skateboard a fait ses débuts olympiques aux Jeux de Tokyo en 2020, reportés à 2021 en raison de la pandémie, mais officiellement comptabilisés comme édition 2020."),
            en = LocalizedContent("In which year was skateboarding introduced to the Olympic Games?", listOf("2020", "2016", "2012", "2024"), "Sports", "Skateboarding made its Olympic debut at the Tokyo Games in 2020, postponed to 2021 due to the pandemic, but officially counted as the 2020 edition."),
            zh = LocalizedContent("滑板在哪一年被引入奥运会？", listOf("2020", "2016", "2012", "2024"), "体育", "滑板在2020年东京奥运会上首次亮相，因疫情推迟至2021年，但官方仍计为2020年届。"),
            es = LocalizedContent("¿En qué año se introdujo el skateboarding en los Juegos Olímpicos?", listOf("2020", "2016", "2012", "2024"), "Deportes", "El skateboarding debutó en los Juegos Olímpicos de Tokio en 2020, aplazados a 2021 debido a la pandemia, pero contabilizados oficialmente como la edición de 2020.")
        ),
        BilingualQuestion(
            id = 12502, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de participants ont participé au tournoi League of Legends Worlds 2023?", listOf("8 équipes", "12 équipes", "16 équipes", "24 équipes"), "Sport", "Le tournoi principal des Worlds 2023 de League of Legends a réuni 16 équipes, issues des différentes régions compétitives du monde, après des phases de play-in."),
            en = LocalizedContent("How many participants took part in the League of Legends Worlds 2023 tournament?", listOf("8 teams", "12 teams", "16 teams", "24 teams"), "Sports", "The main tournament of the 2023 League of Legends Worlds brought together 16 teams from different competitive regions around the world, after play-in stages."),
            zh = LocalizedContent("有多少支队伍参加了2023年英雄联盟全球总决赛？", listOf("8支队伍", "12支队伍", "16支队伍", "24支队伍"), "体育", "2023年英雄联盟全球总决赛的正赛阶段汇集了来自全球不同赛区的16支队伍，经过入围赛阶段后产生。"),
            es = LocalizedContent("¿Cuántos participantes compitieron en el torneo League of Legends Worlds 2023?", listOf("8 equipos", "12 equipos", "16 equipos", "24 equipos"), "Deportes", "El torneo principal de los Worlds 2023 de League of Legends reunió a 16 equipos de las diferentes regiones competitivas del mundo, tras las fases de play-in.")
        ),
        BilingualQuestion(
            id = 12503, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le prix des Jeux Paralympiques d'été 2024?", listOf("Médaille d'or seule", "Médaille et prime", "Médaille et argent", "Aucune récompense"), "Sport", "Aux Jeux Paralympiques, les athlètes reçoivent une médaille pour leur classement et une prime financière, contrairement aux Jeux Olympiques où seules les médailles sont attribuées."),
            en = LocalizedContent("What is the prize for the 2024 Summer Paralympics?", listOf("Gold medal only", "Medal and bonus", "Medal and money", "No reward"), "Sports", "At the Paralympics, athletes receive a medal for their ranking and a financial bonus, unlike the Olympics where only medals are awarded."),
            zh = LocalizedContent("2024年夏季残奥会的奖励是什么？", listOf("仅金牌", "奖牌和奖金", "奖牌和现金", "无奖励"), "体育", "在残奥会上，运动员根据排名获得奖牌和奖金，而奥运会只颁发奖牌。"),
            es = LocalizedContent("¿Cuál es el premio de los Juegos Paralímpicos de Verano 2024?", listOf("Solo medalla de oro", "Medalla y prima", "Medalla y dinero", "Sin recompensa"), "Deportes", "En los Juegos Paralímpicos, los atletas reciben una medalla por su clasificación y una prima económica, a diferencia de los Juegos Olímpicos donde solo se otorgan medallas.")
        ),
        BilingualQuestion(
            id = 12504, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui détient le record du monde de vitesse en parachutisme?", listOf("Felix Baumgartner", "Alan Eustace", "Joe Kittinger", "Michel Fournier"), "Sport", "Alan Eustace a battu le record de vitesse en parachutisme en 2014 lors d'un saut depuis la stratosphère, atteignant 1 357,6 km/h."),
            en = LocalizedContent("Who holds the world speed record in skydiving?", listOf("Felix Baumgartner", "Alan Eustace", "Joe Kittinger", "Michel Fournier"), "Sports", "Alan Eustace broke the skydiving speed record in 2014 during a jump from the stratosphere, reaching 1,357.6 km/h."),
            zh = LocalizedContent("谁保持着跳伞速度的世界纪录？", listOf("菲利克斯·鲍姆加特纳", "艾伦·尤斯塔斯", "乔·基廷格", "米歇尔·富尼耶"), "体育", "艾伦·尤斯塔斯在2014年从平流层跳伞时打破了跳伞速度纪录，达到了1357.6公里/小时。"),
            es = LocalizedContent("¿Quién posee el récord mundial de velocidad en paracaidismo?", listOf("Felix Baumgartner", "Alan Eustace", "Joe Kittinger", "Michel Fournier"), "Deportes", "Alan Eustace batió el récord de velocidad en paracaidismo en 2014 durante un salto desde la estratosfera, alcanzando 1.357,6 km/h.")
        ),
        BilingualQuestion(
            id = 12505, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En base jumping, d'où saute-t-on généralement?", listOf("Avion", "Montagne", "Falaise", "Gratte-ciel"), "Sport", "Le base jumping se pratique depuis des objets fixes comme des falaises, des antennes, des ponts ou des gratte-ciel, d'où le nom issu de ces quatre catégories."),
            en = LocalizedContent("In base jumping, where does one typically jump from?", listOf("Airplane", "Mountain", "Cliff", "Skyscraper"), "Sports", "Base jumping is practiced from fixed objects such as cliffs, antennas, bridges, or skyscrapers, hence the name derived from these four categories."),
            zh = LocalizedContent("在定点跳伞中，通常从哪里跳下？", listOf("飞机", "山", "悬崖", "摩天大楼"), "体育", "定点跳伞通常从固定物体如悬崖、天线、桥梁或摩天大楼上进行，其名称即源于这四类物体。"),
            es = LocalizedContent("En el base jumping, ¿desde dónde se salta normalmente?", listOf("Avión", "Montaña", "Acantilado", "Rascacielos"), "Deportes", "El base jumping se practica desde objetos fijos como acantilados, antenas, puentes o rascacielos, de ahí el nombre derivado de estas cuatro categorías.")
        ),
        BilingualQuestion(
            id = 12506, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel freestyle extrême combine snowboard et saut en hauteur?", listOf("Heli-skiing", "Big air", "Slopestyle", "Halfpipe"), "Sport", "Le big air est une discipline de freestyle où les riders s'élancent d'un tremplin pour effectuer des figures acrobatiques en hauteur, combinant ainsi les sauts du snowboard avec des éléments de saut en hauteur."),
            en = LocalizedContent("Which extreme freestyle combines snowboarding and high jump?", listOf("Heli-skiing", "Big air", "Slopestyle", "Halfpipe"), "Sports", "Big air is a freestyle discipline where riders launch off a ramp to perform acrobatic tricks in the air, combining snowboard jumps with high jump elements."),
            zh = LocalizedContent("哪种极限自由式运动结合了单板滑雪和跳高？", listOf("直升机滑雪", "大跳台", "坡面障碍技巧", "U型池"), "体育", "大跳台是一种自由式项目，选手从跳台起跳在空中完成特技动作，结合了单板滑雪的跳跃和跳高元素。"),
            es = LocalizedContent("¿Qué freestyle extremo combina snowboard y salto de altura?", listOf("Heli-skiing", "Big air", "Slopestyle", "Halfpipe"), "Deportes", "El big air es una disciplina de freestyle donde los riders se lanzan desde un trampolín para realizar figuras acrobáticas en el aire, combinando los saltos del snowboard con elementos de salto de altura.")
        ),
        BilingualQuestion(
            id = 12507, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de médailles d'or le nageur Michael Phelps a-t-il remportées?", listOf("18", "20", "23", "25"), "Sport", "Michael Phelps détient le record du plus grand nombre de médailles d'or olympiques, avec 23 titres remportés entre 2004 et 2016."),
            en = LocalizedContent("How many gold medals did swimmer Michael Phelps win?", listOf("18", "20", "23", "25"), "Sports", "Michael Phelps holds the record for the most Olympic gold medals, with 23 titles won between 2004 and 2016."),
            zh = LocalizedContent("游泳运动员迈克尔·菲尔普斯获得了多少枚金牌？", listOf("18", "20", "23", "25"), "体育", "迈克尔·菲尔普斯保持着奥运会金牌最多的纪录，在2004年至2016年间共获得23枚金牌。"),
            es = LocalizedContent("¿Cuántas medallas de oro ganó el nadador Michael Phelps?", listOf("18", "20", "23", "25"), "Deportes", "Michael Phelps posee el récord del mayor número de medallas de oro olímpicas, con 23 títulos obtenidos entre 2004 y 2016.")
        ),
        BilingualQuestion(
            id = 12508, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record Guinness de vitesse en descente à ski?", listOf("180 km/h", "200 km/h", "220 km/h", "240 km/h"), "Sport", "Le record de vitesse en ski est détenu par l'Italien Ivan Origone, qui a atteint 254,958 km/h en 2016, mais 240 km/h correspond à un record antérieur ou à une performance notable dans cette discipline."),
            en = LocalizedContent("What is the Guinness record for speed in downhill skiing?", listOf("180 km/h", "200 km/h", "220 km/h", "240 km/h"), "Sports", "The speed record in skiing is held by Italian Ivan Origone, who reached 254.958 km/h in 2016, but 240 km/h corresponds to an earlier record or a notable performance in this discipline."),
            zh = LocalizedContent("高山滑雪速度的吉尼斯纪录是多少？", listOf("180公里/小时", "200公里/小时", "220公里/小时", "240公里/小时"), "体育", "滑雪速度纪录由意大利人伊万·奥里戈内保持，他在2016年达到了254.958公里/小时，但240公里/小时对应的是该项目的早期纪录或显著成绩。"),
            es = LocalizedContent("¿Cuál es el récord Guinness de velocidad en descenso de esquí?", listOf("180 km/h", "200 km/h", "220 km/h", "240 km/h"), "Deportes", "El récord de velocidad en esquí lo posee el italiano Ivan Origone, que alcanzó 254,958 km/h en 2016, pero 240 km/h corresponde a un récord anterior o a una actuación notable en esta disciplina.")
        ),
    )

    private fun part7(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 12509, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En Esports, quel jeu a remporté le plus grand prix en tournoi unique?", listOf("Dota 2", "League of Legends", "Counter-Strike", "StarCraft"), "Sport", "Dota 2 détient le record du plus gros prize pool pour un tournoi d'esports unique, principalement grâce à son système de financement participatif via le Battle Pass."),
            en = LocalizedContent("In Esports, which game has the largest prize pool for a single tournament?", listOf("Dota 2", "League of Legends", "Counter-Strike", "StarCraft"), "Sports", "Dota 2 holds the record for the largest prize pool in a single esports tournament, mainly due to its crowdfunding system via the Battle Pass."),
            zh = LocalizedContent("在电子竞技中，哪个游戏在单次锦标赛中拥有最高的奖金池？", listOf("Dota 2", "英雄联盟", "反恐精英", "星际争霸"), "体育", "Dota 2 保持着电子竞技单次锦标赛最高奖金池的记录，主要归功于其通过 Battle Pass 进行的众筹系统。"),
            es = LocalizedContent("En los Esports, ¿qué juego tiene el mayor premio en un torneo individual?", listOf("Dota 2", "League of Legends", "Counter-Strike", "StarCraft"), "Deportes", "Dota 2 tiene el récord del mayor pozo de premios en un torneo de esports individual, principalmente gracias a su sistema de financiación colectiva a través del Battle Pass.")
        ),
        BilingualQuestion(
            id = 12510, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel athlète paralympique détient le plus de médailles d'or?", listOf("Daniel Dias", "Tatyana McFadden", "Jonas Rego", "David Weir"), "Sport", "Le nageur brésilien Daniel Dias a remporté 14 médailles d'or paralympiques entre 2008 et 2020, un record dans l'histoire des Jeux."),
            en = LocalizedContent("Which Paralympic athlete holds the most gold medals?", listOf("Daniel Dias", "Tatyana McFadden", "Jonas Rego", "David Weir"), "Sports", "Brazilian swimmer Daniel Dias has won 14 Paralympic gold medals between 2008 and 2020, a record in the history of the Games."),
            zh = LocalizedContent("哪位残奥会运动员拥有最多的金牌？", listOf("丹尼尔·迪亚斯", "塔季扬娜·麦克法登", "乔纳斯·雷戈", "大卫·韦尔"), "体育", "巴西游泳运动员丹尼尔·迪亚斯在2008年至2020年间赢得了14枚残奥会金牌，创下了残奥会历史上的纪录。"),
            es = LocalizedContent("¿Qué atleta paralímpico tiene más medallas de oro?", listOf("Daniel Dias", "Tatyana McFadden", "Jonas Rego", "David Weir"), "Deportes", "El nadador brasileño Daniel Dias ha ganado 14 medallas de oro paralímpicas entre 2008 y 2020, un récord en la historia de los Juegos.")
        ),
        BilingualQuestion(
            id = 12511, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de points de base pour remporter une partie League of Legends aux Worlds?", listOf("1 point", "3 points", "5 points", "10 points"), "Sport", "Aux Worlds de League of Legends, les matchs se jouent en format bo5 (best of five), et il faut donc remporter trois manches pour gagner la partie."),
            en = LocalizedContent("How many points are needed to win a League of Legends game at Worlds?", listOf("1 point", "3 points", "5 points", "10 points"), "Sports", "At the League of Legends World Championship, matches are played in a best-of-five format, so you need to win three games to win the match."),
            zh = LocalizedContent("在英雄联盟全球总决赛中，赢得一场比赛需要多少分？", listOf("1分", "3分", "5分", "10分"), "体育", "在英雄联盟全球总决赛中，比赛采用五局三胜制，因此需要赢得三局才能赢得比赛。"),
            es = LocalizedContent("¿Cuántos puntos se necesitan para ganar una partida de League of Legends en los Worlds?", listOf("1 punto", "3 puntos", "5 puntos", "10 puntos"), "Deportes", "En los Worlds de League of Legends, las partidas se juegan al mejor de cinco, por lo que se necesitan tres victorias para ganar la serie.")
        ),
        BilingualQuestion(
            id = 12512, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le record du monde de saut en longueur?", listOf("8.35m", "8.48m", "8.95m", "9.15m"), "Sport", "Le record du monde masculin de saut en longueur est détenu par Mike Powell depuis 1991, avec un saut de 8,95 mètres réalisé aux championnats du monde de Tokyo."),
            en = LocalizedContent("What is the world record in long jump?", listOf("8.35m", "8.48m", "8.95m", "9.15m"), "Sports", "The men's world record in long jump is held by Mike Powell since 1991, with a jump of 8.95 meters at the World Championships in Tokyo."),
            zh = LocalizedContent("跳远的世界纪录是多少？", listOf("8.35米", "8.48米", "8.95米", "9.15米"), "体育", "男子跳远世界纪录由迈克·鲍威尔自1991年保持，他在东京世锦赛上跳出了8.95米。"),
            es = LocalizedContent("¿Cuál es el récord mundial de salto de longitud?", listOf("8.35m", "8.48m", "8.95m", "9.15m"), "Deportes", "El récord mundial masculino de salto de longitud lo ostenta Mike Powell desde 1991, con un salto de 8,95 metros en los Campeonatos del Mundo de Tokio.")
        ),
        BilingualQuestion(
            id = 12513, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En 2023, quel joueur de tennis a remporté le plus de Grand Slams?", listOf("Novak Djokovic", "Rafael Nadal", "Jannik Sinner", "Carlos Alcaraz"), "Sport", "Avec 22 titres du Grand Chelem, Rafael Nadal détient le record masculin, mais en 2023, Novak Djokovic l'a dépassé pour atteindre 24 titres, un record absolu."),
            en = LocalizedContent("In 2023, which tennis player won the most Grand Slams?", listOf("Novak Djokovic", "Rafael Nadal", "Jannik Sinner", "Carlos Alcaraz"), "Sports", "With 22 Grand Slam titles, Rafael Nadal held the men's record, but in 2023 Novak Djokovic surpassed him to reach 24 titles, an absolute record."),
            zh = LocalizedContent("2023年，哪位网球运动员赢得了最多的大满贯？", listOf("诺瓦克·德约科维奇", "拉斐尔·纳达尔", "扬尼克·辛纳", "卡洛斯·阿尔卡拉斯"), "体育", "拉斐尔·纳达尔以22个大满贯冠军保持着男子纪录，但在2023年，诺瓦克·德约科维奇超越他达到了24个冠军，成为绝对纪录。"),
            es = LocalizedContent("En 2023, ¿qué tenista ganó más Grand Slams?", listOf("Novak Djokovic", "Rafael Nadal", "Jannik Sinner", "Carlos Alcaraz"), "Deportes", "Con 22 títulos de Grand Slam, Rafael Nadal tenía el récord masculino, pero en 2023 Novak Djokovic lo superó para alcanzar 24 títulos, un récord absoluto.")
        ),
        BilingualQuestion(
            id = 12514, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand tournoi d'Esports par prix dotés?", listOf("TI (Dota 2)", "Worlds (LoL)", "IEM Katowice", "CS Major"), "Sport", "Le tournoi The International (TI) de Dota 2 détient le record des plus gros prize pools de l'esport, souvent dépassant les 40 millions de dollars, grâce au financement participatif via le Battle Pass."),
            en = LocalizedContent("What is the largest Esports tournament by prize pool?", listOf("TI (Dota 2)", "Worlds (LoL)", "IEM Katowice", "CS Major"), "Sports", "The International (TI) for Dota 2 holds the record for the largest prize pools in esports, often exceeding $40 million, thanks to crowdfunding via the Battle Pass."),
            zh = LocalizedContent("按奖金池计算，最大的电子竞技赛事是什么？", listOf("国际邀请赛（Dota 2）", "全球总决赛（英雄联盟）", "IEM卡托维兹", "CS Major"), "体育", "Dota 2的国际邀请赛（TI）保持着电子竞技最高奖金池的记录，通常超过4000万美元，这得益于通过Battle Pass进行的众筹。"),
            es = LocalizedContent("¿Cuál es el torneo de Esports más grande por pozo de premios?", listOf("TI (Dota 2)", "Worlds (LoL)", "IEM Katowice", "CS Major"), "Deportes", "The International (TI) de Dota 2 tiene el récord de los mayores pozos de premios en esports, a menudo superando los 40 millones de dólares, gracias a la financiación colectiva a través del Battle Pass.")
        ),
        BilingualQuestion(
            id = 12515, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de joueurs composent une équipe en 5v5 Counter-Strike?", listOf("3", "5", "7", "10"), "Sport", "Counter-Strike se joue en équipes de cinq joueurs, d'où le nom 5v5. Ce format est la norme pour les compétitions officielles."),
            en = LocalizedContent("How many players make up a team in 5v5 Counter-Strike?", listOf("3", "5", "7", "10"), "Sports", "Counter-Strike is played with teams of five players, hence the name 5v5. This format is the standard for official competitions."),
            zh = LocalizedContent("在5v5的反恐精英中，一支队伍由多少名玩家组成？", listOf("3", "5", "7", "10"), "体育", "反恐精英以五名玩家组成的队伍进行比赛，因此称为5v5。这种形式是官方比赛的标准。"),
            es = LocalizedContent("¿Cuántos jugadores componen un equipo en Counter-Strike 5v5?", listOf("3", "5", "7", "10"), "Deportes", "Counter-Strike se juega con equipos de cinco jugadores, de ahí el nombre 5v5. Este formato es el estándar para las competiciones oficiales.")
        ),
        BilingualQuestion(
            id = 12516, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel sport olympique les femmes ne peuvent pas pratiquer en compétition?", listOf("Heptathlon", "Escrime", "Boxe", "Aucun officiellement"), "Sport", "Depuis les Jeux de Tokyo 2020, toutes les disciplines olympiques sont ouvertes aux femmes, même si certains sports comme le patinage artistique ou la boxe ont eu des restrictions par le passé."),
            en = LocalizedContent("Which Olympic sport are women not allowed to practice in competition?", listOf("Heptathlon", "Fencing", "Boxing", "None officially"), "Sports", "Since the Tokyo 2020 Games, all Olympic disciplines are open to women, although some sports like figure skating or boxing had restrictions in the past."),
            zh = LocalizedContent("哪项奥运项目女性不能在比赛中参加？", listOf("七项全能", "击剑", "拳击", "官方上没有"), "体育", "自2020年东京奥运会以来，所有奥运项目都对女性开放，尽管过去一些项目如花样滑冰或拳击曾有限制。"),
            es = LocalizedContent("¿Qué deporte olímpico no pueden practicar las mujeres en competición?", listOf("Heptatlón", "Esgrima", "Boxeo", "Ninguno oficialmente"), "Deportes", "Desde los Juegos de Tokio 2020, todas las disciplinas olímpicas están abiertas a las mujeres, aunque algunos deportes como el patinaje artístico o el boxeo tuvieron restricciones en el pasado.")
        ),
        BilingualQuestion(
            id = 12517, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le record du monde de sprint 100m (hommes)?", listOf("9.58s", "9.63s", "9.69s", "9.72s"), "Sport", "Le record du monde masculin du 100 mètres est détenu par Usain Bolt, qui a couru en 9,58 secondes aux championnats du monde de Berlin en 2009."),
            en = LocalizedContent("What is the world record in the 100m sprint (men)?", listOf("9.58s", "9.63s", "9.69s", "9.72s"), "Sports", "The men's world record in the 100 meters is held by Usain Bolt, who ran 9.58 seconds at the 2009 World Championships in Berlin."),
            zh = LocalizedContent("男子100米短跑的世界纪录是多少？", listOf("9.58秒", "9.63秒", "9.69秒", "9.72秒"), "体育", "男子100米世界纪录由尤塞恩·博尔特保持，他在2009年柏林世锦赛上跑出了9.58秒。"),
            es = LocalizedContent("¿Cuál es el récord mundial de los 100m lisos (hombres)?", listOf("9.58s", "9.63s", "9.69s", "9.72s"), "Deportes", "El récord mundial masculino de 100 metros lo ostenta Usain Bolt, quien corrió en 9,58 segundos en los Campeonatos del Mundo de Berlín de 2009.")
        ),
        BilingualQuestion(
            id = 12518, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En Esports, quel est le jeu avec le plus grand nombre de joueurs professionnels?", listOf("Dota 2", "Counter-Strike", "League of Legends", "Valorant"), "Sport", "League of Legends possède le plus grand nombre de joueurs professionnels en Esports, avec des ligues structurées dans le monde entier et un écosystème compétitif très développé."),
            en = LocalizedContent("In Esports, which game has the largest number of professional players?", listOf("Dota 2", "Counter-Strike", "League of Legends", "Valorant"), "Sports", "League of Legends has the largest number of professional players in Esports, with structured leagues worldwide and a highly developed competitive ecosystem."),
            zh = LocalizedContent("在电子竞技中，哪个游戏拥有最多的职业选手？", listOf("Dota 2", "反恐精英", "英雄联盟", "无畏契约"), "体育", "英雄联盟拥有电子竞技中最多的职业选手，全球有结构化的联赛和高度发达的竞技生态系统。"),
            es = LocalizedContent("En los Esports, ¿qué juego tiene el mayor número de jugadores profesionales?", listOf("Dota 2", "Counter-Strike", "League of Legends", "Valorant"), "Deportes", "League of Legends tiene el mayor número de jugadores profesionales en Esports, con ligas estructuradas en todo el mundo y un ecosistema competitivo muy desarrollado.")
        ),
        BilingualQuestion(
            id = 12519, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel athlète a remporté 7 Ballons d'Or?", listOf("Cristiano Ronaldo", "Lionel Messi", "Pelé", "Diego Maradona"), "Sport", "Lionel Messi a remporté sept Ballons d'Or, un record, entre 2009 et 2023, grâce à ses performances exceptionnelles avec le FC Barcelone et l'Argentine."),
            en = LocalizedContent("Which athlete has won 7 Ballons d'Or?", listOf("Cristiano Ronaldo", "Lionel Messi", "Pelé", "Diego Maradona"), "Sports", "Lionel Messi has won seven Ballons d'Or, a record, between 2009 and 2023, thanks to his exceptional performances with FC Barcelona and Argentina."),
            zh = LocalizedContent("哪位运动员赢得了7次金球奖？", listOf("克里斯蒂亚诺·罗纳尔多", "莱昂内尔·梅西", "贝利", "迭戈·马拉多纳"), "体育", "莱昂内尔·梅西在2009年至2023年间赢得了七次金球奖，创下纪录，这得益于他在巴塞罗那和阿根廷队的出色表现。"),
            es = LocalizedContent("¿Qué atleta ha ganado 7 Balones de Oro?", listOf("Cristiano Ronaldo", "Lionel Messi", "Pelé", "Diego Maradona"), "Deportes", "Lionel Messi ha ganado siete Balones de Oro, un récord, entre 2009 y 2023, gracias a sus excepcionales actuaciones con el FC Barcelona y Argentina.")
        ),
        BilingualQuestion(
            id = 12520, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel scientifique a proposé la théorie de l'intrication quantique?", listOf("Albert Einstein", "Max Planck", "Erwin Schrödinger", "Werner Heisenberg"), "Science", "Erwin Schrödinger a introduit le terme \"intrication quantique\" en 1935 dans un article où il décrivait ce phénomène comme la caractéristique essentielle de la mécanique quantique."),
            en = LocalizedContent("Which scientist proposed the theory of quantum entanglement?", listOf("Albert Einstein", "Max Planck", "Erwin Schrödinger", "Werner Heisenberg"), "Science", "Erwin Schrödinger introduced the term 'quantum entanglement' in 1935 in a paper where he described this phenomenon as the essential characteristic of quantum mechanics."),
            zh = LocalizedContent("哪位科学家提出了量子纠缠理论？", listOf("阿尔伯特·爱因斯坦", "马克斯·普朗克", "埃尔温·薛定谔", "维尔纳·海森堡"), "科学", "埃尔温·薛定谔在1935年的一篇论文中引入了“量子纠缠”一词，他将这一现象描述为量子力学的基本特征。"),
            es = LocalizedContent("¿Qué científico propuso la teoría del entrelazamiento cuántico?", listOf("Albert Einstein", "Max Planck", "Erwin Schrödinger", "Werner Heisenberg"), "Ciencia", "Erwin Schrödinger introdujo el término 'entrelazamiento cuántico' en 1935 en un artículo donde describió este fenómeno como la característica esencial de la mecánica cuántica.")
        ),
        BilingualQuestion(
            id = 12521, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de neurotransmetteurs principaux existent dans le cerveau humain?", listOf("5", "15", "50+", "200+"), "Science", "Le cerveau humain utilise plus de 50 neurotransmetteurs principaux, incluant la dopamine, la sérotonine et l'acétylcholine, pour transmettre des signaux entre les neurones."),
            en = LocalizedContent("How many main neurotransmitters exist in the human brain?", listOf("5", "15", "50+", "200+"), "Science", "The human brain uses more than 50 main neurotransmitters, including dopamine, serotonin, and acetylcholine, to transmit signals between neurons."),
            zh = LocalizedContent("人脑中有多少种主要神经递质？", listOf("5", "15", "50+", "200+"), "科学", "人脑使用超过50种主要神经递质，包括多巴胺、血清素和乙酰胆碱，用于在神经元之间传递信号。"),
            es = LocalizedContent("¿Cuántos neurotransmisores principales existen en el cerebro humano?", listOf("5", "15", "50+", "200+"), "Ciencia", "El cerebro humano utiliza más de 50 neurotransmisores principales, incluyendo dopamina, serotonina y acetilcolina, para transmitir señales entre las neuronas.")
        ),
        BilingualQuestion(
            id = 12522, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus petit quantum de lumière?", listOf("Photon", "Boson", "Quark", "Électron"), "Science", "Le photon est la particule élémentaire médiatrice de l'interaction électromagnétique, et il constitue le quantum, ou plus petite unité indivisible, de la lumière."),
            en = LocalizedContent("What is the smallest quantum of light?", listOf("Photon", "Boson", "Quark", "Electron"), "Science", "The photon is the elementary particle mediating the electromagnetic interaction, and it constitutes the quantum, or smallest indivisible unit, of light."),
            zh = LocalizedContent("光的最小量子是什么？", listOf("光子", "玻色子", "夸克", "电子"), "科学", "光子是传递电磁相互作用的基本粒子，它构成了光的量子，即最小的不可分割单位。"),
            es = LocalizedContent("¿Cuál es el cuanto más pequeño de luz?", listOf("Fotón", "Bosón", "Quark", "Electrón"), "Ciencia", "El fotón es la partícula elemental mediadora de la interacción electromagnética, y constituye el cuanto, o unidad indivisible más pequeña, de la luz.")
        ),
        BilingualQuestion(
            id = 12523, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le cerveau humain représente quel pourcentage du poids corporel?", listOf("1%", "2%", "5%", "10%"), "Science", "Le cerveau humain pèse environ 1,4 kg pour un adulte de 70 kg, soit environ 2 % du poids corporel total."),
            en = LocalizedContent("What percentage of body weight does the human brain represent?", listOf("1%", "2%", "5%", "10%"), "Science", "The human brain weighs about 1.4 kg for a 70 kg adult, which is approximately 2% of total body weight."),
            zh = LocalizedContent("人脑占体重的百分比是多少？", listOf("1%", "2%", "5%", "10%"), "科学", "一个70公斤成年人的大脑重约1.4公斤，约占总体重的2%。"),
            es = LocalizedContent("¿Qué porcentaje del peso corporal representa el cerebro humano?", listOf("1%", "2%", "5%", "10%"), "Ciencia", "El cerebro humano pesa aproximadamente 1,4 kg para un adulto de 70 kg, lo que supone alrededor del 2% del peso corporal total.")
        ),
        BilingualQuestion(
            id = 12524, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel principe quantique stipule qu'on ne peut pas connaître position et vitesse simultanément?", listOf("Superposition", "Incertitude de Heisenberg", "Dualité onde-corpuscule", "Intrication"), "Science", "Le principe d'incertitude de Heisenberg, formulé par Werner Heisenberg en 1927, établit une limite fondamentale à la précision avec laquelle certaines paires de propriétés physiques, comme la position et la vitesse, peuvent être connues simultanément."),
            en = LocalizedContent("Which quantum principle states that one cannot know position and velocity simultaneously?", listOf("Superposition", "Heisenberg's Uncertainty", "Wave-particle duality", "Entanglement"), "Science", "Heisenberg's uncertainty principle, formulated by Werner Heisenberg in 1927, establishes a fundamental limit to the precision with which certain pairs of physical properties, such as position and velocity, can be known simultaneously."),
            zh = LocalizedContent("哪个量子原理指出不能同时知道位置和速度？", listOf("叠加", "海森堡不确定性", "波粒二象性", "纠缠"), "科学", "海森堡不确定性原理由维尔纳·海森堡于1927年提出，它确立了同时知道某些物理属性对（如位置和速度）的精度的基本极限。"),
            es = LocalizedContent("¿Qué principio cuántico establece que no se pueden conocer simultáneamente la posición y la velocidad?", listOf("Superposición", "Incertidumbre de Heisenberg", "Dualidad onda-partícula", "Entrelazamiento"), "Ciencia", "El principio de incertidumbre de Heisenberg, formulado por Werner Heisenberg en 1927, establece un límite fundamental a la precisión con la que ciertos pares de propiedades físicas, como la posición y la velocidad, pueden conocerse simultáneamente.")
        ),
        BilingualQuestion(
            id = 12525, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de lobes le cerveau humain possède-t-il?", listOf("2", "4", "6", "8"), "Science", "Le cerveau humain est divisé en quatre lobes principaux : frontal, pariétal, temporal et occipital, chacun ayant des fonctions spécifiques."),
            en = LocalizedContent("How many lobes does the human brain have?", listOf("2", "4", "6", "8"), "Science", "The human brain is divided into four main lobes: frontal, parietal, temporal, and occipital, each with specific functions."),
            zh = LocalizedContent("人脑有多少个叶？", listOf("2", "4", "6", "8"), "科学", "人脑分为四个主要叶：额叶、顶叶、颞叶和枕叶，每个叶都有特定的功能。"),
            es = LocalizedContent("¿Cuántos lóbulos tiene el cerebro humano?", listOf("2", "4", "6", "8"), "Ciencia", "El cerebro humano se divide en cuatro lóbulos principales: frontal, parietal, temporal y occipital, cada uno con funciones específicas.")
        ),
        BilingualQuestion(
            id = 12526, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel neurotransmetteur est responsable de la sensation de plaisir?", listOf("Dopamine", "Sérotonine", "Noradrénaline", "Acétylcholine"), "Science", "La dopamine est un neurotransmetteur clé du système de récompense du cerveau, libéré lors d'expériences agréables comme manger ou réussir une tâche."),
            en = LocalizedContent("Which neurotransmitter is responsible for the feeling of pleasure?", listOf("Dopamine", "Serotonin", "Norepinephrine", "Acetylcholine"), "Science", "Dopamine is a key neurotransmitter in the brain's reward system, released during pleasurable experiences such as eating or completing a task."),
            zh = LocalizedContent("哪种神经递质负责产生愉悦感？", listOf("多巴胺", "血清素", "去甲肾上腺素", "乙酰胆碱"), "科学", "多巴胺是大脑奖励系统中的关键神经递质，在愉快的体验（如进食或完成任务）中释放。"),
            es = LocalizedContent("¿Qué neurotransmisor es responsable de la sensación de placer?", listOf("Dopamina", "Serotonina", "Noradrenalina", "Acetilcolina"), "Ciencia", "La dopamina es un neurotransmisor clave en el sistema de recompensa del cerebro, liberado durante experiencias placenteras como comer o completar una tarea.")
        ),
        BilingualQuestion(
            id = 12527, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La conscience quantique provient de quel scientifique?", listOf("Roger Penrose", "Max Tegmark", "Sean Carroll", "Brian Greene"), "Science", "Roger Penrose, physicien et mathématicien britannique, a proposé avec Stuart Hameroff que la conscience émerge de processus quantiques dans les microtubules des neurones."),
            en = LocalizedContent("Quantum consciousness originates from which scientist?", listOf("Roger Penrose", "Max Tegmark", "Sean Carroll", "Brian Greene"), "Science", "Roger Penrose, British physicist and mathematician, proposed with Stuart Hameroff that consciousness emerges from quantum processes in neuronal microtubules."),
            zh = LocalizedContent("量子意识起源于哪位科学家？", listOf("罗杰·彭罗斯", "马克斯·泰格马克", "肖恩·卡罗尔", "布莱恩·格林"), "科学", "英国物理学家和数学家罗杰·彭罗斯与斯图尔特·哈梅罗夫共同提出，意识源于神经元微管中的量子过程。"),
            es = LocalizedContent("¿La conciencia cuántica proviene de qué científico?", listOf("Roger Penrose", "Max Tegmark", "Sean Carroll", "Brian Greene"), "Ciencia", "Roger Penrose, físico y matemático británico, propuso junto con Stuart Hameroff que la conciencia surge de procesos cuánticos en los microtúbulos de las neuronas.")
        ),
        BilingualQuestion(
            id = 12528, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le temps de cohérence d'un qubit supraconducteur?", listOf("Microsecondes", "Nanosecondes", "Millisecondes", "Secondes"), "Science", "Les qubits supraconducteurs sont sensibles au bruit environnemental, ce qui limite leur temps de cohérence à quelques microsecondes avant que l'information quantique ne se perde."),
            en = LocalizedContent("What is the coherence time of a superconducting qubit?", listOf("Microseconds", "Nanoseconds", "Milliseconds", "Seconds"), "Science", "Superconducting qubits are sensitive to environmental noise, which limits their coherence time to a few microseconds before quantum information is lost."),
            zh = LocalizedContent("超导量子比特的相干时间是多少？", listOf("微秒", "纳秒", "毫秒", "秒"), "科学", "超导量子比特对环境噪声敏感，这将其相干时间限制在几微秒，之后量子信息就会丢失。"),
            es = LocalizedContent("¿Cuál es el tiempo de coherencia de un qubit superconductor?", listOf("Microsegundos", "Nanosegundos", "Milisegundos", "Segundos"), "Ciencia", "Los qubits superconductores son sensibles al ruido ambiental, lo que limita su tiempo de coherencia a unos pocos microsegundos antes de que se pierda la información cuántica.")
        ),
    )
}
