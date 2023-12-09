package com.example.snakeofbd;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SnakeDetails extends Activity {

    private TextView Vname;
    private TextView Bname;
    private TextView descrip;
    private ImageView popImage;
    private int current_image;

    private TextView venom_name;

    String[] VenomousSnakeName;
    {
        VenomousSnakeName = new String[]{"Banded Krait","King Cobra","Russel's Viper","Lesser Black Krait","White Lipped Pit Viper","Greater Black Krait",
                "Wall's Krait","Monocled Cobra","Common Krait","Spectacled Cobra","Popes Pit Viper","Sind Krait",
                "Macceleland's Coral Snake","Mountain Pit Viper","Saw Scaled Viper","Belcher's Sea Snake","Black Banded Sea Snake",
                "Yellow Lipped Sea Snake","Green Pit Viper","Spot Tailed Pit Viper","Red Necked Keelback","Bamboo Pit Viper",
                "Slender Coral Snake","Hook Nosed Sea Snake"};
    }

    String[] vtype;
    {
        vtype=new String[]{"NeuroToxic","CytoToxic and NeuroToxic","HemoToxic","NeuroToxic","HemoToxic","NeuroToxic",
                "NeuroToxic","NeuroToxic and CytoToxic","NeuroToxic","NeuroToxic","HemoToxic","NeuroToxic",
                "NeuroToxic","HemoToxic","Both HemoToxic and CytoToxic","NeuroToxic","NeuroToxic",
                "NeuroToxic","HemoToxic","HemoToxic","NeuroToxic and Poisonous", "HemoToxic",
                "NeuroToxic","NeuroToxic"};
    }


    String[] Venomousbionominal;
    {
        Venomousbionominal=new String[]{"Bungarus fasciatus","Ophiophagus hannah","Daboia russelii","Bungarus lividus","Trimeresurus albolabris",
                "Bungarus niger","didnt","Naja kaouthia","Bungarus caeruleus","Naja naja","Trimeresurus popeiorum",
                "Bungarus sindanus","Sinomicrurus macclellandi","Ovophis monticola","Echis carinatus",
                "Hydrophis belcheri","Laticauda semifasciata","Laticauda colubrina","No Description Available Right Now","Trimeresurus erythrurus","Rhabdophis subminiatus",
                "Trimeresurus stejnegeri","Calliophis melanurus","Enhydrina schistosa"};
    }



    int[] VenomousImages={ R.drawable.banded_krait,R.drawable.king_kobra,R.drawable.russels_viper,R.drawable.lesser_krait,R.drawable.white_lipped_pit,R.drawable.greater_krait
            ,R.drawable.walls_krait,R.drawable.monocled,R.drawable.common_krait,R.drawable.spectacled,R.drawable.pope_pit,R.drawable.sind_krait
            ,R.drawable.macclelands_coral,R.drawable.mountain_pit,R.drawable.saw_scaled_viper,R.drawable.belchers_sea,R.drawable.black_banded_sea
            ,R.drawable.yellow_lipped_sea,R.drawable.green_pit_viper,R.drawable.spot_tailed_pit,R.drawable.red_necked,R.drawable.bamboo_pit
            ,R.drawable.slender_coral,R.drawable.hook_nosed_sea};



    String[] VenomousDescription;

    {
        VenomousDescription = new String[]{"The banded krait is easily identified by its alternate black and yellow crossbands,its triangular body cross section, and the marked vertebral ridge consisting of enlarged vertebral shields along its body. The head is broad and depressed. The eyes are black. It has arrowhead-like yellow markings on its otherwise black head and has yellow lips, lores, chin, and throat.",
                "The king cobra's skin is olive green with black and white bands on the trunk that converge to the head. The head is covered by 15 drab coloured and black edged shields. The muzzle is rounded, and the tongue black. It has two fangs and 3–5 maxillar teeth in the upper jaw, and two rows of teeth in the lower jaw. The nostrils are between two shields. The large eyes have a golden iris and round pupils. Its hood is oval shaped and covered with olive green smooth scales and two black spots between the two lowest scales. Its cylindrical tail is yellowish green above and marked with black.",
                "D. russelii can grow to a maximum length (body and tail) of 166 cm (5.5 ft) and averages about 120 cm (4 ft) on mainland Asian populations. Island populations may be slightly smaller on average.It is more slender than most vipers. Ditmars(1937) reported the following dimensions for a fair-sized adult specimen",
                "No Description Available Right Now",
                "Maximum total length males 600 mm (24 in), females 810 mm (32 in); maximum tail length males 120 mm (4.7 in), females 130 mm (5.1 in).",
                "Bungarus niger is medium in length, slender-bodied, and triangular in cross-section, with a short, pointed tail. It can grow to a maximum total length (including tail) of about 1.3 m (4.3 ft), but adults usually average around 0.8 m (2.6 ft). The head is flat and slightly distinct from the neck. The eye is small to medium in size, black with a round pupil.",
                "No Description Available Right Now",
                "The monocled cobra has an O-shaped, or monocellate hood pattern, unlike that of the Indian cobra, which has the spectacle pattern (two circular ocelli connected by a curved line) on the rear of its hood. Adult monocled cobras reach a length of 1.35 to 1.5m (4.4 to 4.9ft) with a tail length of 23cm (9.1in).",
                "The average length of the common krait is 0.9 m (3.0 ft), but it can grow to 1.75 m (5 ft 9 in). Males are longer than females, with proportionately longer tails. The head is flat and the neck hardly evident. The body is cylindrical, tapering towards the tail. The tail is short and rounded. The eyes are rather small, with rounded pupils, indistinguishable in life. The head shields are normal, with no loreals. four shields occur along the margin of the lower lip; the third and fourth supraoculars touch the eye.",
                "The Indian cobra is a moderately sized, heavy bodied species. This cobra species can easily be identified by its relatively large and quite impressive hood, which it expands when threatened.",
                "Trimeresurus popeiorum may grow to a total length of 770 mm (30 in), which includes a tail length 170 mm (6.7 in).Above green, below pale green to whitish, the two separated by a bright bicolored orange or brown (below) and white (above) (males) or white (females) ventrolateral stripe, which occupies the whole of the outermost scale row and a portion of the second row.",
                "The Sind krait is generally 1 m (3 ft) with some specimens as long as 1.8 m (6 ft). Their most visible feature is their narrow white bands, though the bands can be either yellow or grey depending on the color variation.",
                "S. macclellandi is a small snake, about 40–80 centimetres (16–31 ) in total length (including tail), and has a thin body.Dorsally, it is reddish-brown, with thin, black cross bars, and its belly is creamy white. The head is small, round and black in color, with a broad, creamy white transverse band, and black outlines at the middle of the head.",
                " Total length of males 49cm (19¼ inches), of females 110cm (43¼ inches); tail length of males 8cm (3⅛ inches), of females 15cm (5⅞ inches).",
                "The size of E. carinatus ranges between 38 and 80cm (15 and 31in) in total length (body + tail), but usually no more than 60cm (24in).",
                "The belcher's sea snake is of moderate size, ranging from 0.5 to 1 meter (about 20–40 inches) in adult length. Its thin body is usually chrome yellowish in colour with dark greenish crossbands. The dorsal pattern does not extend onto the venter. The head is short and has bands of the same colours. Its mouth is very small but suitable for aquatic life.",
                "This sea snake frequents coral reef areas. It has a short head, thick trunk, and no easily discernible neck. The tail is simply extended skin, spread wide like a fin, and unsupported by any bony projections from the vertebral column. The stomach is comparatively wide. Massing together near the shore, it breeds between narrow cracks in the reef and in caves. It is a nocturnal snake, rarely seen during the day. It breathes air; so it breaks the surface at least once every six hours.",
                "The head of a yellow-lipped sea krait is black, with lateral nostrils and an undivided rostral scale. The upper lip and snout are characteristically colored yellow, and the yellow color extends backward on each side of the head above the eye to the temporal scales.",
                "No Description Available Right Now",
                "Males grow to a maximum total length 575 millimetres (22.6 in), of which the tail is 120 millimetres (4.7 in) in length. Females reach a maximum total length of 1,045 millimetres (41.1in), with a tail length of 165 millimetres (6.5in).",
                "Rhabdophis subminiatus has a greenish hue with red and yellow regions near the head. It grows to 70 to 90 cm (27.5 to 35.5 in) in total length (including tail).",
                "Trimeresurus stejnegeri grows to a maximum total length of 75 centimetres (30 in), which includes a tail length of 14.5 centimetres (5.7 in). The males have hemipenes that are short and spinose beyond the bifurcation.",
                "No Description Available Right Now",
                "The rostral scale is longer than broad, and is in contact with four shields; frontal more long than broad, shorter than the parietals; nasals in contact with the two anterior labials; sometimes partially divided; one pre- and one or two postoculars; temporals l–3; seven or eight upper labials, fourth or third and fourth entering the eye, the last sometimes divided; anterior chin-shields rather indistinct, separated."};
    }


    String [] venomousLink;
    {
        venomousLink=new String[]{
                "https://www.google.com/search?q=banded+krait&client=firefox-b-d&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjkrpK5m7bzAhXszjgGHY2SBr0Q_AUoAXoECAEQAw&biw=1283&bih=701&dpr=1.25",
                "https://www.google.com/search?q=King+Cobra&tbm=isch&ved=2ahUKEwjblqe6m7bzAhWLs0sFHcp2C30Q2-cCegQIABAA&oq=King+Cobra&gs_lcp=CgNpbWcQAzIHCAAQsQMQQzIECAAQQzIECAAQQzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgARQ5vMWWJCJF2C4sxdoAHAAeASAAZkBiAGLB5IBAzAuN5gBAKABAaoBC2d3cy13aXotaW1nsAEAwAEB&sclient=img&ei=A9BdYZuJIIvnrtoPyu2t6Ac&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Russel%27s+Viper&tbm=isch&ved=2ahUKEwjiqYvynLbzAhVim0sFHVxyBPUQ2-cCegQIABAA&oq=Russel%27s+Viper&gs_lcp=CgNpbWcQAzIFCAAQgAQyBAgAEB4yBAgAEB4yBAgAEB4yBAgAEB4yBAgAEB4yBAgAEB4yBAgAEB4yBggAEAUQHjIECAAQHjoHCAAQsQMQQzoECAAQQ1CKqgNYsrYDYJDGA2gAcAB4BIAB8gGIAdAHkgEFMC41LjGYAQCgAQGqAQtnd3Mtd2l6LWltZ7ABAMABAQ&sclient=img&ei=hNFdYeLXOeK2rtoP3OSRqA8&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Lesser+Black+Krait&tbm=isch&ved=2ahUKEwiixciOnbbzAhU9sksFHfDvD1AQ2-cCegQIABAA&oq=Lesser+Black+Krait&gs_lcp=CgNpbWcQAzIFCAAQgAQ6BAgAEEM6BAgAEB46BggAEAUQHlDZqAJYurYCYLe_AmgAcAB4A4AB7geIAYIakgELMC4xLjEuNi0yLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ7ABAMABAQ&sclient=img&ei=wNFdYaLlKL3krtoP8N-_gAU&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=White+Lipped+Pit+Viper&tbm=isch&ved=2ahUKEwijorWjnbbzAhVnnUsFHSIsDz8Q2-cCegQIABAA&oq=White+Lipped+Pit+Viper&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIGCAAQBRAeMgYIABAFEB4yBggAEAUQHjIGCAAQBRAeMgYIABAFEB4yBggAEAgQHjIGCAAQCBAeOgQIABBDUIKCBFiZoQRgvaoEaABwAHgCgAG9AYgBpg2SAQQwLjEymAEAoAEBqgELZ3dzLXdpei1pbWewAQDAAQE&sclient=img&ei=7NFdYaP8F-e6rtoPoti8-AM&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Greater+Black+Krait&tbm=isch&ved=2ahUKEwiRxJ_GnbbzAhVznksFHXzTC9UQ2-cCegQIABAA&oq=Greater+Black+Krait&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABFCHsBNYh7ATYP28E2gAcAB4AIABlAGIAZQBkgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=NdJdYdHVGvO8rtoP_KavqA0&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Wall%27s+Krait&tbm=isch&ved=2ahUKEwiyg5ffnrbzAhW_n0sFHRKUDzwQ2-cCegQIABAA&oq=Wall%27s+Krait&gs_lcp=CgNpbWcQAzIFCAAQgAQyBggAEAgQHlDP6gNYz-oDYOL1A2gAcAB4AIABiwGIAYsBkgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=dtNdYbLwCb-_rtoPkqi-4AM&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Monocled+Cobra&tbm=isch&ved=2ahUKEwjTx_r-nrbzAhWwmksFHdxTDIcQ2-cCegQIABAA&oq=Monocled+Cobra&gs_lcp=CgNpbWcQAzIKCAAQsQMQgwEQQzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABFD3ngNY954DYOKmA2gAcAB4AIABjwGIAY8BkgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=uNNdYdOLMbC1rtoP3KexuAg&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Common+Krait&tbm=isch&ved=2ahUKEwiA5NyZn7bzAhUynUsFHXp_D4IQ2-cCegQIABAA&oq=Common+Krait&gs_lcp=CgNpbWcQAzIECAAQQzIECAAQQzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEUKvmAlir5gJghfACaABwAHgAgAH7AogB-wKSAQMzLTGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=8NNdYYCsObK6rtoP-v69kAg&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Spectacled+Cobra&tbm=isch&ved=2ahUKEwjV5pCxn7bzAhW9oUsFHRJuB2MQ2-cCegQIABAA&oq=Spectacled+Cobra&gs_lcp=CgNpbWcQAzIECAAQQzIFCAAQgAQyBQgAEIAEMgQIABBDMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEUO37G1jt-xtgwYQcaABwAHgAgAG9AYgBvQGSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=ItRdYdXNAb3DrtoPktydmAY&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Popes+Pit+Viper&tbm=isch&ved=2ahUKEwj38vGMobbzAhVFsksFHaTrAT0Q2-cCegQIABAA&oq=Popes+Pit+Viper&gs_lcp=CgNpbWcQAzIFCAAQgAQyBggAEAgQHlDh0QdY4dEHYKPcB2gAcAB4AIABbIgBbJIBAzAuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=7tVdYffDNsXkrtoPpNeH6AM&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Macceleland%27s+Coral+Snake&tbm=isch&ved=2ahUKEwiWhPTJobbzAhVEfCsKHSSDC48Q2-cCegQIABAA&oq=Macceleland%27s+Coral+Snake&gs_lcp=CgNpbWcQA1C0nQlYtJ0JYJKoCWgAcAB4AIABgwGIAYMBkgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=btZdYZaVNMT4rQGkhq74CA&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Sind+Krait&tbm=isch&ved=2ahUKEwiGoaqTorbzAhX_tUsFHeUNCuoQ2-cCegQIABAA&oq=Sind+Krait&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIGCAAQBRAeMgQIABAYMgQIABAYMgQIABAYUID-AliA_gJghIUDaABwAHgAgAGKAYgBigGSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=CNddYYb9Mv_rrtoP5Zuo0A4&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Mountain+Pit+Viper&tbm=isch&ved=2ahUKEwiWzPqrorbzAhVgs0sFHTjIBpsQ2-cCegQIABAA&oq=Mountain+Pit+Viper&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgYIABAFEB4yBggAEAUQHjIGCAAQBRAeMgYIABAIEB4yBggAEAgQHjIGCAAQCBAeMgQIABAYUOuYEVjrmBFgn6URaABwAHgAgAGlAYgBpQGSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=PNddYZa-HeDmrtoPuJCb2Ak&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Saw+Scaled+Viper&tbm=isch&ved=2ahUKEwi8sNGzo7bzAhVJm0sFHRk3AywQ2-cCegQIABAA&oq=Saw+Scaled+Viper&gs_lcp=CgNpbWcQAzIECAAQQzIECAAQQzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEUKCFA1ighQNg040DaABwAHgAgAGVAYgBlQGSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=WdhdYfyfAcm2rtoPme6M4AI&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Belcher%27s+Sea+Snake&tbm=isch&ved=2ahUKEwjN2MbMo7bzAhWnnEsFHTxmD0EQ2-cCegQIABAA&oq=Belcher%27s+Sea+Snake&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABFCI5hZYiOYWYObxFmgAcAB4AIABoQKIAaECkgEDMi0xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=jdhdYY3eEKe5rtoPvMy9iAQ&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Black+Banded+Sea+Snake&tbm=isch&ved=2ahUKEwik-4iApbbzAhUTSysKHcyXAN4Q2-cCegQIABAA&oq=Black+Banded+Sea+Snake&gs_lcp=CgNpbWcQAzIFCAAQgAQyBggAEAgQHlDvvwJY778CYKnNAmgAcAB4AIAB2QGIAdkBkgEDMi0xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=BdpdYeTkLZOWrQHMr4LwDQ&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Yellow+Lipped+Sea+Snake&tbm=isch&ved=2ahUKEwjQho2VpbbzAhUNfn0KHb4GCc0Q2-cCegQIABAA&oq=Yellow+Lipped+Sea+Snake&gs_lcp=CgNpbWcQAzIFCAAQgAQyBggAEAgQHlD-iwRY_osEYLSUBGgAcAB4AIABjQGIAY0BkgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=MdpdYZCqNI389QO-jaToDA&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Green+Pit+Viper&tbm=isch&ved=2ahUKEwicnJ62pbbzAhVfnUsFHeeqD2kQ2-cCegQIABAA&oq=Green+Pit+Viper&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgARQ5sUCWObFAmCJzwJoAHAAeACAAbkBiAG5AZIBAzAuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=d9pdYdyEFd-6rtoP59W-yAY&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Spot+Tailed+Pit+Viper&tbm=isch&ved=2ahUKEwiJiv3LpbbzAhX3oUsFHdjaDnoQ2-cCegQIABAA&oq=Spot+Tailed+Pit+Viper&gs_lcp=CgNpbWcQAzIFCAAQgARQtJgCWLSYAmCzpAJoAHAAeACAAYoDiAGKA5IBAzMtMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=pNpdYYmoOffDrtoP2LW70Ac&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Red+Necked+Keelback&tbm=isch&ved=2ahUKEwjjvubepbbzAhUSoUsFHX9CAbYQ2-cCegQIABAA&oq=Red+Necked+Keelback&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIECAAQHjIGCAAQBRAeMgQIABAYMgQIABAYUMDGAljAxgJgsc0CaABwAHgAgAGnAYgBpwGSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=zNpdYeOoGZLCrtoP_4SFsAs&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Bamboo+Pit+Viper&tbm=isch&ved=2ahUKEwir7tzzpbbzAhXNsksFHWhaDqMQ2-cCegQIABAA&oq=Bamboo+Pit+Viper&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABFCNgQNYjYEDYKGHA2gAcAB4AIABgwGIAYMBkgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=-NpdYauSEs3lrtoP6LS5mAo&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Slender+Coral+Snake&tbm=isch&ved=2ahUKEwjFuKSMprbzAhX1qksFHT3rA1EQ2-cCegQIABAA&oq=Slender+Coral+Snake&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgQIABAYMgQIABAYUMSXA1jElwNg9p8DaABwAHgAgAGIAYgBiAGSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=K9tdYYX3MPXVrtoPvdaPiAU&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Hook+Nosed+Sea+Snake&tbm=isch&ved=2ahUKEwjS8KmmprbzAhXVoUsFHb0aCTwQ2-cCegQIABAA&oq=Hook+Nosed+Sea+Snake&gs_lcp=CgNpbWcQAzIECAAQQzIFCAAQgAQyBAgAEBhQ9KICWPSiAmC_rAJoAHAAeACAAY0BiAGNAZIBAzAuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=YttdYdK3GdXDrtoPvbWk4AM&bih=701&biw=1283&client=firefox-b-d"

        };
    }


    String[] MildSnakeName;
    {
        MildSnakeName=new String[]{"Arrowback Tree Snake","Asian Vine Snake","Brown Speckled","Common Cat Snake",
                                    "Common Mock Viper","Common Vine Snake","Green Cat Snake","Dog Tooth Cat Snake",
                                    "Dussumieri Water Snake","Glossy Marsh Water Snake","Puff Faced Water Snake",
                                    "Dog Faced Water Snake","Many Spotted Cat Snake","Siebolds Water Snake",
                                    "Rainbow Water Snake","White Bellied Mangrove Snake","Tawny Cat Snake",
                                    "Westermanns Snake","Mock Viper","Golden Flying Snake","Smooth Scaled Water Snake"};
    }

    String[] MildVenBio;
    {
        MildVenBio=new String[]{"Boiga gocool", " Ahaetulla prasina", "Pseudonaja guttata", "Boiga trigonata",
                "Psammodynastes pulverulentus", " Ahaetulla nasuta", " Boiga cyanea", "Boiga cynodon",
                " Dieurostus dussumieri", " Gerarda prevostiana", " Homalopsis buccata",
                "Cerberus rynchops", "Boiga multomaculata", "Ferania sieboldii",
                "Enhydris enhydris", "Fordonia leucobalia", "Boiga ochracea",
                "Elachistodon westermanni", "Psammodynastes pulverulentus", "Chrysopelea ornata", "Enhydris enhydris"

        };
    }

    String[] MildVenDes;
    {
        MildVenDes=new String[]{
                "No Information Available Right Now",
                "The body form is extremely slender with a long, pointed, projecting snout which is rather more than twice as long as the eye. Adult colouration varies from light brown to dull yellow-green and often a startling fluorescent green. The type and number of scales is used to identify the snakes. In this species the Internasals are usually in contact with the labial or lip scales. There are one to four small loreals between the prefrontal and the labial scales. The frontal is as long as its distance from the end of the snout or a little longer and a little longer than the parietal scales. There is one preocular scale in front of the eye, which is in contact with the frontal scale. There two postocular scales (behind the eyes). The scales in 15 rows and are usually faintly keeled on the sacral region. The interstitial skin of the neck is black and white",
                "The speckled brown snake grows to 1.4 m (4 ft 7 in) long. It has a small head, straw-yellow to orange upper parts, white throat and lips, and cream, yellow, or white under parts blotched with orange. Its scales have black edges that become visible when the snake bends or moves. Some snakes have wide, darker bands.[6] It has 19–21 rows of dorsal scales at midbody, 190 to 220 ventral scales, 44 to 70 divided subcaudal scales (occasionally some of the anterior ones are undivided), and a divided anal scale.It lays a clutch of six eggs on average",
                "B. trigonata has anterior palatine and mandibular teeth scarcely larger than the posterior. Its eyes are as long as the distance from its nostril; the rostral is broader than deep with the internasal scales shorter than the prefrontal scales. The frontal scales are longer than their distance from the end of the snout and shorter than the parietal scales. The loreals are as long as they are deep, or, they can be deeper than they are long. B. trigonata's one preocular does not extend to the upper surface of the head. B. trigonata's body is moderately laterally compressed with smooth dorsal scales in 21 (or rarely 19) rows, with apical pits, disposed obliquely, with the vertebrals very feebly enlarged. There are 229-269 ventral scales, 79-92 divided subcaudal scales, and a single anal scale.B. trigonata has a yellowish-olive or pale grey colour along the back and a white black-edged zigzag band along the length of the head with two brown bands edged with black, diverging posteriorly. The belly is white and can have a series of small brown spots along each side.The total length is around 3 feet (91 cm) with a 7-inch (18 cm) tail.",
                "Mock viper is a small snake (total length up to 65 cm (26 in), less in males), but it will form defensive coils and strike in viper-like fashion when threatened",
                "Common vine snakes are diurnal, arboreal, and mildly venomous. They normally feed on frogs and lizards using their binocular vision to hunt. They are slow moving, relying on camouflaging themselves as vines in foliage. They expand their bodies when disturbed to show a black and white scale marking. Also, they may open their mouths in a threat display and point their heads in the direction of the perceived threat. They are the only species of snake with horizontal pupils, compared to the normal vertical slit pupils found in many species of viper.The species is viviparous, giving birth to young that grow within the body of the mother, enclosed within the egg membrane. They may be capable of delayed fertilization; (parthenogenesis is rare but not unknown in snakes) as a female in the London zoo kept in isolation from August, 1885 gave birth in August, 1888",
                "Medium to large in length, slightly compressed, medium bodied snake with a moderately long tail. Head distinct from narrow neck with a rounded snout. Eyes large in size with vertically elliptical pupils. Dorsal scales smooth with single or double apical pits. Ventrals with a feeble lateral keels. Dorsal scale count usually 21 - 21 ( 23 ) - 15. Its long prehensile tail makes it purely arboreal.Dorsal color uniform green or green mixed with grayish or bluish. Belly color greenish or yellowish white. Top of the head usually similar to dorsal color or sometimes of brownish tint. Upper lip color yellowish; most of head scaled margined with black. Eyes golden brown. Hatchlings are reddish brown with a green head. The color of the hatchlings starts to change after 8–9 months of age",
                "It is a large snake, reaching more than 2 m (6+1⁄2 ft) in total length. The front teeth of the upper jaw and the lower jaw are strongly enlarged.The body is slender and laterally compressed. Dorsally it is tannish with reddish-brown or dark brown crossbands. There is a dark streak behind the eye on each side of the head. The venter is whitish, heavily marbled with dark brown.The smooth dorsal scales are arranged in 23 or 33 rows at midbody, and those in the vertebral row are strongly enlarged. Ventrals 248–290; subcaudals 114–165",
                "D. dussumieri is a thoroughly aquatic snake, and is more evident during the rains. This species has been sighted in inundated rice paddies, flooded crop fields and is very much at home in lakes and swamps. On land, its movements are rather clumsy and laboured. It feeds mostly on fishes and takes refuge in crab-holes on mud banks and other such safe retreats near water bodies",
                "G. prevostiana has the following scalation. The frontal is a little longer than broad, shorter than its distance from the end of the snout, or than the parietals. The loreal is slightly longer than deep, a little smaller than the nasal. There is one preocular, and there are two postoculars. The temporals are arranged 1+2. There are eight upper labials, the fourth entering the eye. Four of the lower labials are in contact with the anterior chin shields. The anterior chin shields are much larger than the posterior chin shields. The dorsal scales are in 17 rows at midbody. The ventrals number 146–158. The anal is divided. The subcaudals number 31–34.The body is uniform dark olive above, with three outer rows of scales whitish. The upper lip is white, and the rostral is dark olive. The ventrals and subcaudals are whitish, with dark edges.The total length is 41 cm (16 inches), including the tail which is 5 cm (2 inches) long",
                "Upper labials 1–4 contact single loreal; two prefrontals; 33–40 dorsal scale rows at mid-body, usually reduced to fewer than 30 posteriorly; one postocular plus a postsubocular; 12 (11–14) upper labials; ventral count fewer than 166. Homalopsis hardwickii has a divided loreal; H. nigroventralis has upper labials 1–3 contacting the loreal; H. semizonata has a divided or fragmented loreal contacting upper labials 1–4 or 1–5 and three prefrontals; H. mereljcoxi, has a single loreal contacting upper labials 1–4, scale rows at mid-body 40–47, reduced to 30 or more posteriorly.This snake has banded pattern and usually reach 1 meter (3 feet) in length. They have somewhat similar body build with anaconda, but doesn't use constriction to subdue their prey, they use their mild venom to subdue their prey through their grooved rear fang",
                "The visibility of upper jaw, giving it a dog-like appearance. Head long and distinct from neck. Eyes small and beady, with rounded pupils. Dorsum dark gray, with faint dark blotches and a dark line along the sides of the head, across the eyes. Center cream with two distinct rows of large, diffuse dark gray spots.Scales are distinctly keeled. Midbody scale rows 21–25. Ventrals 132–160. Subcaudals 49–72",
                "Dorsally it is gray-brown, with two alternating series of round dark brown, reddish-brown or chestnut-colored spots and two other series of smaller spots on the lower sides. On the head it has two blackish bands which diverge posteriorly. There is a blackish streak from the eye to the corner of the mouth. Ventrally it is whitish, marbled or spotted with brown, and there is a series of brown spots along each side. Adults may attain 77 cm (30 in.) in total length",
                "F. sieboldii has a dorsal pattern of large blotches similar to those of a python, but it is distinctive in having its nostrils on the top of the snout to aid its aquatic lifestyle. It also lacks labial pits. It may attain a total length (including tail) of 89 cm (35 in). A female of that length had a tail which was 11 cm (4.3 in) long",
                "The Rainbow Water Snake Enhydris enhydris inhabits freshwater habitats including marshlands, rural ponds and rice paddies. This snake is best identified by the two pale stripes running down the full length of the body and tail on either side of the vertebral line : these two stripes converge on the crown.The body is medium brown to greenish brown, and the head and neck is generally more olive coloured than the body. The belly is pale, with a thin brown line running down the middle",
                "Individual F. leucobalia reach up to a meter in length, and are brown or gray in color with a white belly. There is significant color variation. Some have spots. The anatomy reflects the snake's water-living lifestyle: the eyes are located atop the head, and the nostrils have valves that close when the snake dives.The snake eats small prey that live in its habitat, such as frogs and small fish, and it specializes in crabs, hence its name. Like other homalopsines, F. leucobalia bears live young",
                "No Information Available Right Now",
                "E. westermanni is glossy brown to black, with bluish white flecks posteriorly and a middorsal creamy stripe from neck to tail tip. The head is brown with a black arrow mark. The ventrals are white with brown dots. Adults may attain a total length of 78 cm (31 inches), with a tail 11 cm (4¼ inches) long",
                "Mock viper is a small snake (total length up to 65 cm (26 in), less in males), but it will form defensive coils and strike in viper-like fashion when threatened",
                "Chrysopelea ornata is usually green in color, with black cross-hatching and yellow or gold colored accents. The body, though slender, is far less so than in other tree snakes. It has a flattened head with constricted neck, a blunt nose and large eyes with round pupils.The lateral, sharp and pronounced keeled condition of the ventrals in association with the normal, not enlarged, vertebral row of scales distinguish this snake",
                "F. sieboldii has a dorsal pattern of large blotches similar to those of a python, but it is distinctive in having its nostrils on the top of the snout to aid its aquatic lifestyle. It also lacks labial pits.It may attain a total length (including tail) of 89 cm (35 in). A female of that length had a tail which was 11 cm (4.3 in) long"


        };
    }

    String [] MildvenomousLink;

    {
        MildvenomousLink = new String[]{
                "https://www.google.com/search?q=Arrowback+Tree+Snake&tbm=isch&ved=2ahUKEwj35a65prbzAhUjlEsFHQd0CRQQ2-cCegQIABAA&oq=Arrowback+Tree+Snake&gs_lcp=CgNpbWcQA1CQhz9YkIc_YOKlP2gAcAB4AIABgQKIAYECkgEDMi0xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=ittdYff4FKOortoPh-iloAE&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Asian+Vine+Snake&tbm=isch&ved=2ahUKEwjPqceoqrbzAhUTbysKHf9HDEwQ2-cCegQIABAA&oq=Asian+Vine+Snake&gs_lcp=CgNpbWcQAzIECAAQQzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABFC0uJIBWN7IkgFgzc-SAWgAcAB4AIAB3wGIAcUCkgEFMC4xLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=mN9dYc_9MpPerQH_j7HgBA&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Brown+Speckled+snake&tbm=isch&ved=2ahUKEwi6oOa3s7bzAhUZf30KHcIPB-wQ2-cCegQIABAA&oq=Brown+Speckled+snake&gs_lcp=CgNpbWcQAzIFCAAQgAQyBAgAEBgyBAgAEBg6BggAEAUQHlDSdFiwe2DThQFoAHAAeACAAcQCiAGLCJIBBzAuNS4wLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=KOldYbrsK5n-9QPCn5zgDg&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Common+Cat+Snake&tbm=isch&ved=2ahUKEwi9scPAs7bzAhXSnUsFHWIGBKMQ2-cCegQIABAA&oq=Common+Cat+Snake&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIGCAAQBRAeMgYIABAFEB4yBAgAEBhQhPsBWIT7AWCohQJoAHAAeACAAYYBiAGGAZIBAzAuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=O-ldYf2nAdK7rtoP4oyQmAo&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Common+Mock+Viper&tbm=isch&ved=2ahUKEwiLs5HRs7bzAhUPnEsFHdHNCWMQ2-cCegQIABAA&oq=Common+Mock+Viper&gs_lcp=CgNpbWcQAzIFCAAQgAQyBAgAEBhQuJsDWLibA2CIrQNoAHAAeACAAX2IAX2SAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=XeldYcuQNI-4rtoP0ZunmAY&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Common+Vine+Snake&tbm=isch&ved=2ahUKEwiXyvbrs7bzAhWknUsFHcAyBFwQ2-cCegQIABAA&oq=Common+Vine+Snake&gs_lcp=CgNpbWcQAzIFCAAQgARQ1sUCWNbFAmCc1gJoAHAAeACAAcMDiAHDA5IBAzQtMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=luldYZenAqS7rtoPwOWQ4AU&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Green+Cat+Snake&tbm=isch&ved=2ahUKEwiaj6yBtLbzAhXWnUsFHVwDA-cQ2-cCegQIABAA&oq=Green+Cat+Snake&gs_lcp=CgNpbWcQAzIFCAAQgAQyBggAEAUQHjIGCAAQBRAeMgYIABAIEB4yBAgAEBgyBAgAEBgyBAgAEBgyBAgAEBhQyLcDWMi3A2DXwgNoAHAAeACAAXSIAXSSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=wuldYZqmOta7rtoP3IaMuA4&bih=701&biw=1283&client=firefox-b-d",
                "https://www.google.com/search?q=Dogtooth+Cat+Snake&tbm=isch&client=firefox-b-d&hl=en-US&sa=X&ved=2ahUKEwiahKG1tLbzAhXskksFHQy5CGEQBXoECAEQJg&biw=1266&bih=701",
                "https://www.google.com/search?q=Dussumieri+Water+Snake&tbm=isch&ved=2ahUKEwjMyujTtLbzAhWkm0sFHVIVDsUQ2-cCegQIABAA&oq=Dussumieri+Water+Snake&gs_lcp=CgNpbWcQA1Ca6wRYmusEYNr1BGgAcAB4AIABYYgBYZIBATGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=b-pdYYzXN6S3rtoP0qq4qAw&bih=701&biw=1266&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Glossy+Marsh+Water+Snake&tbm=isch&ved=2ahUKEwjNqOf6tLbzAhWMYisKHf8qAaQQ2-cCegQIABAA&oq=Glossy+Marsh+Water+Snake&gs_lcp=CgNpbWcQA1DQwgNY0MIDYKjQA2gAcAB4AIABdYgBdZIBAzAuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=wepdYY3EKYzFrQH_1YSgCg&bih=701&biw=1266&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Puff+Faced+Water+Snake&tbm=isch&ved=2ahUKEwjfmtqXtbbzAhXRNnIKHRviCFwQ2-cCegQIABAA&oq=Puff+Faced+Water+Snake&gs_lcp=CgNpbWcQAzIECAAQQzIECAAQGDIECAAQGFCPgQJYj4ECYNiJAmgAcAB4AIABeogBepIBAzAuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=_updYd-jEdHtyAObxKPgBQ&bih=701&biw=1266&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Dog+Faced+Water+Snake&tbm=isch&ved=2ahUKEwiz_bmotbbzAhUAnUsFHSy8BdQQ2-cCegQIABAA&oq=Dog+Faced+Water+Snake&gs_lcp=CgNpbWcQAzIECAAQQzIFCAAQgAQyBQgAEIAEMgUIABCABDIGCAAQBRAeMgQIABAYMgQIABAYUNqSAljakgJgkpsCaABwAHgAgAF1iAF1kgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=IetdYfPoGIC6rtoPrPiWoA0&bih=701&biw=1266&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Many+Spotted+Cat+Snake&tbm=isch&ved=2ahUKEwjQiMO6tbbzAhXUnEsFHf4_DKMQ2-cCegQIABAA&oq=Many+Spotted+Cat+Snake&gs_lcp=CgNpbWcQAzIFCAAQgARQ4vEJWOLxCWDB-AloAHAAeACAAZcBiAGXAZIBAzAuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=R-tdYZDJEtS5rtoP_v-wmAo&bih=701&biw=1266&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Siebolds+Water+Snake&tbm=isch&ved=2ahUKEwjhnd6ItrbzAhXTXn0KHZmoDw8Q2-cCegQIABAA&oq=Siebolds+Water+Snake&gs_lcp=CgNpbWcQA1CPwgJYj8ICYOjJAmgAcAB4AIABaIgBaJIBAzAuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=6-tdYaH8E9O99QOZ0b54&bih=701&biw=1266&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Rainbow+Water+Snake&tbm=isch&ved=2ahUKEwiqq7edtrbzAhUBmUsFHTBjAUcQ2-cCegQIABAA&oq=Rainbow+Water+Snake&gs_lcp=CgNpbWcQAzIFCAAQgAQyBggAEAUQHjIGCAAQBRAeMgYIABAFEB4yBggAEAgQHlDVvQJY1b0CYLLGAmgAcAB4AIABvwGIAb8BkgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=FuxdYarILIGyrtoPsMaFuAQ&bih=701&biw=1266&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=White+Bellied+Mangrove+Snake&tbm=isch&ved=2ahUKEwiVu_GxtrbzAhX9rEsFHWjGBksQ2-cCegQIABAA&oq=White+Bellied+Mangrove+Snake&gs_lcp=CgNpbWcQA1Cp5gFYqeYBYLOCAmgAcAB4AIABqQGIAakBkgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=QexdYdWWJv3ZrtoP6Iyb2AQ&bih=701&biw=1266&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Tawny+Cat+Snake&client=firefox-b-d&hl=en-US&source=lnms&tbm=isch&sa=X&ved=2ahUKEwii6NX4uLbzAhVc4jgGHfcSDg0Q_AUoAXoECAEQAw&biw=1283&bih=701&dpr=1.25",
                "https://www.google.com/search?q=Westermanns+Snake&tbm=isch&ved=2ahUKEwjOx_b5uLbzAhVfoEsFHY3eAGQQ2-cCegQIABAA&oq=Westermanns+Snake&gs_lcp=CgNpbWcQA1CF_AFYhfwBYJGDAmgAcAB4AIABxAGIAcQBkgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=8e5dYY6LI9_ArtoPjb2DoAY&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Mock+Viper&tbm=isch&ved=2ahUKEwiOhMmKubbzAhXnkUsFHTEPAu4Q2-cCegQIABAA&oq=Mock+Viper&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIECAAQQzIFCAAQgAQyBggAEAUQHjIGCAAQBRAeMgYIABAFEB4yBggAEAUQHjIECAAQGFD6lQJY-pUCYJqdAmgAcAB4AIABhQGIAYUBkgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=FO9dYY6qHeejrtoPsZ6I8A4&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Golden+Flying+Snake&tbm=isch&ved=2ahUKEwi118ucubbzAhXHkUsFHe7cCFIQ2-cCegQIABAA&oq=Golden+Flying+Snake&gs_lcp=CgNpbWcQAzIFCAAQgAQyBggAEAUQHjIGCAAQCBAeUL2SA1i9kgNg258DaABwAHgAgAGsAYgBrAGSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=Ou9dYbXSEMejrtoP7rmjkAU&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Smooth+Scaled+Water+Snake&tbm=isch&ved=2ahUKEwjLgsW2ubbzAhXVoUsFHZptD7IQ2-cCegQIABAA&oq=Smooth+Scaled+Water+Snake&gs_lcp=CgNpbWcQAzIFCAAQgARQycoBWMnKAWC70gFoAHAAeACAAbwBiAG8AZIBAzAuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=cO9dYcuKKtXDrtoPmtu9kAs&bih=701&biw=1283&client=firefox-b-d&hl=en-US"

        };
    }


    int[] MildImage={R.drawable.arrow_back_tree,R.drawable.asian_vine,R.drawable.brown_speckled,R.drawable.common_cat,
                     R.drawable.common_mock_viper,R.drawable.common_vine,R.drawable.green_cat,R.drawable.dogtooth_cat,
                     R.drawable.dussumieri_water,R.drawable.glossy_marsh,R.drawable.puff_faced_water,
                     R.drawable.dog_faced_water,R.drawable.many_spotted_cat,R.drawable.siebolds_water,
                     R.drawable.rainbow_water,R.drawable.white_bellied_mangrove,R.drawable.tawny_cat,
                     R.drawable.westermanns,R.drawable.mock_viper,R.drawable.golden_flying,R.drawable.smooth_scaled};


    String[] NonSnakeName;
    {
        NonSnakeName=new String[]{"Ashy Kukri Snake","Banded Racer","Buff Striped Keelback","Burmese Rock Python","Calamaria Reed Snake",
                "Checkered Keelback","Common Bronzeback Tree","Common Slug Eater","Copper Headed Trinket",
                "Green Rat Snake","Indian Rat Snake","Indian Wolf Snake","Painted Bronzeback Tree",
                "Marine File Snake","Olive Keelback","Indo-Chinese Rat Snake","Painted Keelback",
                "Reticulate Python","Rock Python","Russel's Sand Boa","Trinket Snake","Twin Spotted Wolf",
                "Wall's Keelback","White Banded Wolf","White Barred Kukri","Red Coral Kukri"};
    }

    String[] NonSnakeBionominal;
    {
        NonSnakeBionominal=new String[]{"Oligodon cinereus", "Argyrogena fasciolata", "Amphiesma stolatum", "Python bivittatus", "Liopeltis calamaria",
                "Fowlea piscator", "Dendrelaphis tristis", "Duberria lutrix", "Coelognathus radiatus",
                "Gonyosoma oxycephalum", "Ptyas mucosa", "Lycodon aulicus", "Dendrelaphis pictus",
                "Acrochordus granulatus", "Atretium schistosum", "Ptyas korros", "Xenochrophis cerasogaster",
                "Python sebae", "Python bivittatus","Gongylophis conicus", "Coelognathus helenus", "Lycodon jara",
                "Herpetoreas xenura", "Lycodon septentrionalis", "Oligodon arnensis", "Oligodon kheriensis"

        };
    }

    String[] NonVenDes;
    {
        NonVenDes=new String[]{
                "Nasal divided; portion of rostral seen from above as long as its distance from tho frontal or a little shorter; suture between the internasals usually shorter than that between the prefrontals: frontal as long as its distance from the end of the snout, as long as the parietals; loreal usually longer than deep; preocular single, usually with a small subocular below, between the third and fourth labials; one or two postoculars; temporals 1+2; upper labials 8, fourth and fifth entering the eye, 3 or 4 lower labials in contact with the anterior chin-shields; posterior chin-shields one half or loss than one half the size of the anterior. Scales in 17 rows. Ventrals 160-180 (196); anal undivided; subcaudals 34–39. Pale brown, purplish or reddish above; markings on the head very indistinct; uniform above and below. Total length 30 inches; tail 3",
                "Snout obtuse, curved and prominent; rostral large, broader than wide, the portion visible from above more than half its length from the frontal; suture between the internasals as long as that between the prefrontals or a little shorter; frontal nearly as long as its distance from the end of the snout, or as the parietals; loreal as long as deep or longer than deep; one pre-ocular, usually with a small subocular below; two or three postoculars; temporals 2+2 or 2+3; upper labials 8, fourth and fifth entering the eye; 4 or 5 lower labials in contact with the anterior chin-shields; posterior chin-shields nearly as long as the anterior, separated from each other by two or three series of scales. Dorsals smooth, in 21 or 23 rows. Ventrals 197–225; anal divided; subcaudals 73–88. Yellowish or brownish olive above, with narrow white, brown, and black variegated cross bands on the anterior half of the body; these bands may entirely disappear in the adult; lower parts uniform yellowish.Total length 1060 mm (3.5 feet); tail 220 mm (8.5 inches).Shaw's original description of the species was based on a plate in Russell, Ind. Serp. (1796)",
                "The buff striped keelback is diurnal, and although mostly seen on land, it can readily take to water. It has long rear teeth for catching frogs and toads.The buff striped keelback is nonvenomous and totally harmless. When alarmed, it inflates its body causing the bright interscale colours to be exposed. Sometimes, the snake flattens and narrows its head to form a hood. This behaviour sometimes causes the species to be mistaken by laypersons for a baby cobra.The snake aestivates during hot weather and appears at the end of summer. It is abundant during the rains. In north India, the striped keelback hibernates 25 to 45 cm (about 10 to 18 inches) under the ground in soil, amongst grass",
                "The Burmese python is a dark-colored non-venomous snake with many brown blotches bordered in black down the back. In the wild, Burmese pythons typically grow to 5 m (16 ft),while specimens of more than 7 m (23 ft) are uncommon. This species is sexually dimorphic in size; females average only slightly longer, but are considerably heavier and bulkier than the males. For examples, length-weight comparisons in captive Burmese pythons for individual females have shown: at 3.47 m (11 ft 5 in) length, a specimen weighed 29 kg (64 lb), a specimen of just over 4 m (13 ft) weighed 36 kg (79 lb), a specimen of 4.5 m (15 ft) weighed 40 kg (88 lb), and a specimen of 5 m (16 ft) weighed 75 kg (165 lb). In comparison, length-weight comparisons for males found: a specimen of 2.8 m (9 ft 2 in) weighed 12 kg (26 lb), 2.97 m (9 ft 9 in) weighed 14.5 kg (32 lb), a specimen of 3 m (9.8 ft) weighed 7 kg (15 lb), and a specimen of 3.05 m (10.0 ft) weighed 18.5 kg (41 lb). In general, individuals over 5 m (16 ft) are rare. The record for maximum length of Burmese pythons is held by a female that lived at Serpent Safari for 27 years. Shortly after death.",
                "Maxillary teeth 24-26; head not depressed and fairly distinct from the neck; snout not projecting, not twice as long as the eye; nostril very small and in a long undivided nasal, which is united with the loreal; normally 7 supralabials, rarely only 6, 3rd and 4th touching the eye; anterior genials a little longer than the posterior. Ventrals 126–142 in the male and 130–154 in the female. Caudals 68–78 in males and 53–72 in the females.Hemipenis like that of frenatus in general construction, but the calyces smaller, more deeply scalloped, and packed so closely together that only the papillae are visible on the surface; the spines are shorter, thicker and more numerous; there is a fold.Light brown, greyish-brown or greenish, above, the scales usually edged with black, showing as more or less distinct longitudinal lines, the most conspicuous being one on each side of the vertebral region; they are separated from each other by five rows of scales. The area enclosed between them may be of a darker colour than that of the rest of the body; lower parts whitish (yellow in life); a series of dark spots on each side of the head, the remnants of the temporal stripes.Total length of male 335 mm (tail 108 mm); females 390 mm long with the tail of 100 mm",
                "The eye of F. piscator is rather small and shorter than its distance from the nostril in the adult. Its rostral scale is visible from above. The internasal scales are much narrowed anteriorly and subtriangular, with the anterior angle truncated and as long as the prefrontal scales. The frontal scale is longer than its distance from the end of the snout, and as long as the parietals or a little shorter. The loreal is nearly as long as it is deep. There are one preocular and three (rarely four) post-oculars. Its temporals are 2+2 or 2+3. There are normally nine upper labials, with the fourth and fifth entering the eye; and five lower labials in contact with the anterior chin-shields, which are shorter than the posterior. The dorsal scales are arranged in 19 rows, strongly keeled, with outer rows smooth. The ventrals number 125–158, the anal is divided, and the subcaudals number 64–90. Coloration is very variable, consisting of dark spots arranged quincuncially and often separated by a whitish network, or of black longitudinal bands on a pale ground, or of dark crossbands, with or without whitish spots. Two oblique black streaks, one below and the other behind the eye, are nearly constant. The lower parts are white, with or without black margins to the shields.The checkered keelback is a medium-sized snake, but may grow to be large. Adults may attain a snout-to-vent length (SVL) of 1.75 m (5.7 ft)",
                "Dendrelaphis tristis is a long, slender snake with a pointed head and a bronze coloured line running right down its back. Its diet includes geckos, birds and occasionally frogs. This harmless snake prefers the tree tops to life on the ground. It is camouflaged (made invisible by means of protective coloring) among the leaves because of its uniform ruddy brown skin. This active snake is restless and quick, both on the ground as well as in the trees. Generally a lively and plucky snake, its disposition varies from one example to another. It is found in southern India and the Himalayan foothills. This oviparous (egg laying animal e.g. birds) snake lays its eggs between September and February. The 6–7 eggs in a clutch, or number of eggs laid at once, hatch 4–6 weeks after laying; that is, they have a gestation period of 4–6 weeks",
                "Adults can be up to thirty to forty cm (approximately twelve to sixteen inches). The common slug eater's colour can vary, but they typically have an olive green to brown or russet back, grey flanks, a yellowish or cream belly, and a black, more or less complete, vertebral stripe",
                "Copper Headed Trinket has the following scalation. The rostral is a little broader than deep, and visible from above. The suture between the internasals is much shorter than that between the prefrontals. The frontal is as long as its distance from the end of the snout, but shorter than the parietals. The loreal is somewhat longer than deep. One large preocular and two postoculars are present. The temporals are arranged 2+2 or 2+3. There are 9 (exceptionally 10 or 11) upper labials, and the fifth and sixth (or fourth, fifth, and sixth) enter the eye. There are 5 or 6 lower labials in contact with the anterior chin shields. The anterior chin shields are as long as or a little longer than the posterior chin shields.The dorsal scales are in 23 to 27 rows at midbody, smooth, or feebly keeled on the posterior part of the body and on the tail. The ventrals number 220-265; the anal plate is entire; and the subcaudals number 75-94.The young are pale brown above, with black crossbands, each crossband enclosing four to six white ocelli. The adults are darker brown, with a transverse series of squarish black spots, or with more or less distinct traces of the color pattern of the young. There is a vertical black streak below the eye, and an oblique black streak behind the eye. Some specimens have a white, black-edged collar; others have two black longitudinal streaks on the head; and others are intermediate in this respect. The lower parts are yellowish, with or without a few small black spots, sometimes with a more or less distinct festooned marking on each side.Adults may attain a total length of 4.5 ft (1.4 m), which includes a tail 10 in (25 cm) long",
                "G. oxycephalum is a robust powerful snake, with wide smooth scales on its belly that are ideal for climbing trees and across branches. It has smaller, smooth scales on its back, which is usually bright green or light green and may have a black net-like pattern. A gray-colored morph with a yellow head exists in Panay, in the Philippines.As some of its common names indicate, the snake has a green body with a red tail, but is usually brown. It also has a dark line horizontally across the eye. On the sides of its black tongue there may be brown and blue colour. The top of the head may be dark green, yellow-green, or yellow in colour",
                "Ptyas mucosa, commonly known as the oriental ratsnake,Indian rat snake, darash or dhaman, is a common non-venomous snake.Typical mature total length is around 1.5 to 1.95 m (4 ft 11 in to 6 ft 5 in) though some exceed 2 m (6 ft 7 in). The record length for this species was 3.7 m (12 ft 2 in), second only to their cousin Ptyas carinata among living colubrid snakes.Despite their large size, oriental ratsnakes are usually quite slender with even a specimen of 2 m (6 ft 7 in) commonly measuring 4 to 6 cm (1.6 to 2.4 in) only around in diameter[which?]. Furthermore, the average weight of ratsnakes caught in Java was around 877 to 940 g (1.933 to 2.072 lb), though larger males of over 2.3 m (7 ft 7 in) (which average mildly larger of the two sexes in the species) may easily weigh over 2.5 kg (5.5 lb).Their color varies from pale browns in dry regions to nearly black in moist forest areas. Dhamans are diurnal, semi-arboreal, non-venomous, and fast-moving. Dhamans eat a variety of prey and are frequently found in urban areas where rodents thrive",
                "The colouration of this snake is variable.Snout broad, much depressed, long, spatulate, with the upper lip swollen, and without canthus rostralis. Rostral shield very low, broad, slightly bent backwards on the upper surface of the snout; anterior frontals [= internasals] very small; posterior frontals [= prefrontals] longer than broad, much more so in adult specimens than in young ones; there is a lateral notch between the anterior and posterior frontals, in which the inner anterior angle of the loreal is received; the posterior frontals have an obtuse lateral angle corresponding to the suture between loreal and praeocular; occipitals elongate. Nostril small, directed upwards, between two nasals, the anterior of which is situated on the foremost part of the snout. Loreal single, large, nearly twice as long as broad. Praeocular single, in contact with the vertical [= frontal] and with the third labial; specimens in which it does not reach the vertical are very scarce. Two postoculars; supraciliary rather small. Nine upper labials, the third, fourth, and fifth of which enter the orbit. Temporals numerous, scale-like. Scales smooth, with a minute apical groove, in seventeen rows. Abdomen and tail with an angular ridge on each side. Ventrals 183-209; anal bifid, in a few specimens entire; subcaudals 57-77. Each maxillary is armed with two fangs in front, placed in a transverse line, the outer being much larger than the inner; the lateral longitudinal series of teeth commences at some distance from the fangs; they are small, from four to twelve in number, the last being considerably larger than the others; pterygoido-palatine teeth small, of equal size; mandible with two or three fangs on each side and with a series of small teeth",
                "In the painted bronzeback the maxillary teeth number from 23 to 26, the eye is as long as the distance between the nostril and eye. The rostral scale is more broad than deep, and is visible from above. Internasal scales are as long as, or slightly shorter than, the praefrontal scales. The frontal scale is as long as its distance from the rostral or the tip of the snout, but shorter than the parietal scales. The loreal is long and there is one preocular and two postoculars. The temporal scales are 2+2, 1+1, or 1+2. There are nine (seven or eight) upper labials, with the fifth and sixth (or fourth to sixth) entering the eye. This snake has five (four) lower labials in contact with the anterior chin shields the latter shorter than the posterior, which are separated by one anterior and two posterior scales. Scales are in 15 rows, vertebrals about as large as the outer; Ventrals number 151–204, the anal scale is divided, and subcaudals number 103–174.The snake's colouration is olive or brown above with a yellow lateral stripe, bordered below by a dark line between the outer scales and the ventrals. A black stripe on each side of the head passes through the eye, widens or breaks up into spots, separated by bluish-green bands on the nape. The upper lip is yellow, and the lower surface yellowish or greenish. Length of head and body approximately 740 mm and the tail 440 mm",
                "Acrochordus granulatus is the smallest of the three members of the family Acrochordidae, and is commonly called the little file snake. Acrochordus granulatus is also the only Acrochord that permanently inhabits estuaries as well as coastal seas, dawning its other common name the Marine file snake. All members of Acrochordus are completely aquatic and nearly helpless on land. As with the other members of the genus, Acrochordus granulatus has uniquely spinose scales with an almost rough texture. Members of Acrochordus also possess specialized tubercles with nerve endings on the skin between their scales which provide an extra sensory organ used to feel water movements of prey. Acrochordus granulatus also have laterally compressed tails, and they can flatten dorsoventrally to assist in swimming. Acrochordus granulatus are the most marine of the Acrochordidae and have specialized sublingual salt glands similar to those found in the true sea snake subfamily Hydrophiinae. Despite this, they are still susceptible to dehydration at sea and rely on freshwater lenses built up on the surface of marine water for freshwater. Members of the true sea snake subfamily Hydrophiinae have been shown to exhibit this same behavior. Acrochordus granulatus are sexually divergent, with females being slightly larger than males",
                "It is a small, robust snake with thin head, short snout and slit nostrils placed rather high. The snake is olive-green and yellow to orange below. It is sometimes tinged with pink or purplish on the flanks. The length of the tail is one third to one-fourth of the total length.The scales are rough because they are keeled. Specimens from South India have a distinct reddish line along the 5th and 6th or the 4th and 5th up to the vent. This line is brighter in the males. The females are between 70 and 75 cm long, and the males between 50 and 60 cm. The longest measured snake is 87 cm long.The olive keelback is found near water or among the surrounding vegetation",
                "Snout obtuse, projecting; eye very large. Rostral visible from above; internasals shorter than the prefrontals; frontal as long as its distance from the tip of the snout or a little longer, as long as the parietals; two or three loreals; a large preocular, sometimes touching the frontal; a small subocular below; two postoculars; temporals 2 + 2; eight upper labials, fourth and fifth entering the eye; five lower labials in contact with the anterior chin-shields, which are shorter than the posterior.Dorsal scales smooth or feebly keeled on the posterior part of the body, in 15 rows at midbody; ventrals 160-177; anal divided; sub-caudals 122–145.Brown or olive above; the scales on the posterior part of the body and on the tail often yellow and edged with black. Lower surface yellow. Young specimens with transverse series of round whitish spots or with narrow yellow transverse bars.Length of head and body 1,080 mm (43 in); tail 700 mm (28 in)",
                "In this species, the head is narrow and elongated, with an angular canthus rostralis and slightly concave lores; the eyes are moderate or rather small. The rostral is 1.5 to 3.0 times as broad as it is long; the suture between the internasals is nearly as long as that between the prefrontals; the frontal is much longer than its distance from the end of the snout, as long as the parietals; the lorealae are as long as deep or a little longer, It has one preocular, two or three postoculars, and one or two suboculars; the temporals number 2+2 or 2+3. It has 9 upper labials, with the fourth (rarely fifth) entering the eye; the five or six lower labials are in contact with the anterior chin shields, which are about as long as the posterior. Its scales are strongly keeled, in 19 rows, with 140-151 ventral scales; the anal scale is divided; the subcaudals are 60–70 in number.This snake is brown above, with or without darker spots and with a more or less distinct paler dorsolateral band. The lower parts are cherry-red to purplish-black, with a yellow band on each side extending from the lips to the end of the tail. Total length is two feet, and the tail is 5.5 inches",
                "No Description Available Right Now",
                "Africa's largest snake sand one of the world's largest,the typical African rock python adult measures 3 to 3.53 m (9 ft 10 in to 11 ft 7 in) in total length (including tail), with only unusually large specimens likely to exceed 4.8 m (15 ft 9 in). Reports of specimens over 6 m (19 ft 8 in) are considered reliable, although larger specimens have never been confirmed. Weights are reportedly in the range of 44 to 55 kg (97 to 121 lb), per one study adults are expected to weigh only up to 32.2 kg (71 lb). Exceptionally large specimens may weigh 91 kg (201 lb) or more.The African species may be the second heaviest living snake with some authors agreeing that it can exceptionally exceed 90 kg (200 lb). One specimen, reportedly 7 m (23 ft 0 in) in length, was killed by K. H. Kroft in 1958 and was claimed to have had a 1.5 m (4 ft 11 in) juvenile Nile crocodile in its stomach.An even larger specimen considered authentic was shot in The Gambia and measured 7.5 m (24 ft 7 in).In general,The head is triangular and is marked on top with a dark brown spear-head outlined in buffy yellow. Teeth are many, sharp, and backwardly curved. Under the eye, there is a distinctive triangular marking, the subocular mark.  Like all pythons, the scales of the African rock python are small and smooth. Those around the lips possess heat-sensitive pits, which are used to detect warm-blooded prey, even in the dark.The southern subspecies is distinguished by its smaller size (adults typically about 2.4 to 4.4 m in length).",
                "Adults of G. conicus may attain a total length of 3 feet 3 inches (99 cm), which includes a tail 3 inches (76 mm) long.The anterior maxillary and mandibular teeth are longer than the posterior. The head is covered with small scales. The eye is small with a vertical pupil. The dorsal scales are small and keeled. The tail is pointed, not or but very slightly prehensile. The rostral scale is twice as broad as long, slightly prominent, without an angular horizontal edge. The top of the head is covered with small obtusely keeled scales, except for the nasals and internasals which are enlarged. Interorbitals: 8 to 10. Circumorbitals: 10 to 15. The eye is separated from the labials by one or two rows of scales. Supralabial scales: 12 to 14. Dorsal scales tubercularly keeled, in 40 to 49 rows. Ventral scales: 162-186. The anal scale is single. Subcaudals: 17-24. The anterior dorsal scales are only feebly keeled, but these keels increase in size posteriorly to the point that they become so heavily keeled that it can make a squirming specimen really painful to handle. This also makes it look as if the front and rear ends belong to markedly different animals. Dorsally, the color pattern consists of a broad zigzag band or a series of dark brown blotches on a yellowish or brownish grey ground color. The belly is uniform white. In India it can be mistaken at first glance for either the Indian python, Python m. molurus, or the deadly Russell's viper, Daboia russelii",
                "C.Helena has the following scalation. The rostral is a little broader than deep, and visible from above. The suture between the internasals is much shorter than that between the prefrontals. The frontal is as long as its distance from the end of the snout, but shorter than the parietals. The loreal is somewhat longer than deep. One large preocular and two postoculars are present. The temporals are arranged 2+2 or 2+3. There are 9 (exceptionally 10 or 11) upper labials, and the fifth and sixth (or fourth, fifth, and sixth) enter the eye. There are 5 or 6 lower labials in contact with the anterior chin shields. The anterior chin shields are as long as or a little longer than the posterior chin shields.The dorsal scales are in 23 to 27 rows at midbody, smooth, or feebly keeled on the posterior part of the body and on the tail. The ventrals number 220-265; the anal plate is entire; and the subcaudals number 75-94.The young are pale brown above, with black crossbands, each crossband enclosing four to six white ocelli. The adults are darker brown, with a transverse series of squarish black spots, or with more or less distinct traces of the color pattern of the young. There is a vertical black streak below the eye, and an oblique black streak behind the eye. Some specimens have a white, black-edged collar; others have two black longitudinal streaks on the head; and others are intermediate in this respect. The lower parts are yellowish, with or without a few small black spots, sometimes with a more or less distinct festooned marking on each side.Adults may attain a total length of 4.5 ft (1.4 m), which includes a tail 10 in (25 cm) long",
                "Snout much depressed; eye rather small. Rostral much broader than long, just visible from above; internasals much shorter than the prefrontals; frontal as long as or a little shorter than its distance from the end of the snout, a little shorter than the parietals; loreal elongate, not entering the eye; one pre-ocular; two post-oculars; temporals small, 1 + 2; 9 or 10 upper labials, third, fourth, and fifth entering the eye; 4 or 5 lower labials in contact with the anterior chin-shields, which are longer than the posterior.Dorsal scales smooth, in 17 rows. Ventrals 167–175, not angulate laterally; anal divided; subcaudals 56–63, in two rows.Brown above, each scale with two white dots or short longitudinal lines; labials white; usually a white collar; lower surface uniform white.Total length 35 cm (13¾ inches); tail 6 cm (2⅜ inches)",
                "No Description Available Right Now",
                "The snake's snout is slightly depressed, and not spatulated. It has relatively small eyes. The rostral scale is much broader than it is deep, and is visible from above the snake. The scales between the nostrils are much shorter than the prefrontal scales. The frontal scale is slightly longer than it is broad, approximately as long as the distance from the scale to the snout, and shorter than the panetal scales. The loreal scale is small, elongated, and not entering the eye. The snake has one preocular and two postocular scales, and between 2 and 3 temporal scales. It has eight upper labial scales, with the third, fourth, and fifth entering the eye; its five lower labials are in contact with the anterior chin shields, which are longer than the posterior. It has 17 rows of scales, with the scales in the seven middle rows possessing a slight keel. Its 214 ventral scales are angulated laterally; the anal scale is entire; its 83 subcaudals are in two rows. The snake is black above and on the sides, with narrow, whitish, transverse bands. The bands form complete rings on the tail, which is dark brown on its lower surface. The snake's belly is whitish, with a few brown spots towards the rear. It can grow to a length of three feet, of which the tail consists of eight inches",
                "The nasal scale is divided; the portion of rostral seen from above is as long as its distance from the frontal or a little shorter; the suture between the internasals is usually nearly as long as that between the prefrontals. The frontal is as long as its distance from the end of the snout or a little shorter, and a little shorter than the parietals. The loreal, if distinct, is longer than it is deep, and frequently united with the prefrontal. It has one preocular and two postoculars; the temporals are 1+2; of its seven upper labials, the third and fourth enter the eye; its four lower labials are in contact with the anterior chin shields; the posterior chin shields are one-half to two-thirds the length of the anterior. Its scales are in 17 rows. The ventrals are angulated laterally, and number 170-202; the anal scale is divided; subcaudals are 41–59 in number. The banded kukuri snake is pale brown or orange above, with well-defined black crossbands, which vary in number and in width according to individuals, and may be edged with white; an angular or transverse black band is found between the eyes, with another behind, with the apex on the frontal, and a third on the nape. Its lower surface is uniform yellowish, rarely spotted with brown, or with a brown posterior border to the ventrals. Its total length is 24 inches, with a 3.5-inch tail.(female 640 mm, tail 100 mm). It is found in India and Sri Lanka, northwards to Nepal and the Himalayas, where it has been recorded from an altitude of 4100 feet.",
                "No Description Available Right Now"



        };
    }


    String [] NonvenomousLink;

    {
        NonvenomousLink = new String[]{
                "https://www.google.com/search?q=Ashy+Kukri+Snake&tbm=isch&ved=2ahUKEwil847EubbzAhVos0sFHblABLQQ2-cCegQIABAA&oq=Ashy+Kukri+Snake&gs_lcp=CgNpbWcQA1Cp5AlYqeQJYIbtCWgAcAB4AIAB2QGIAdkBkgEDMi0xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=je9dYeX4CejmrtoPuYGRoAs&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Banded+Racer&tbm=isch&ved=2ahUKEwj4mtSRurbzAhUtnksFHQMjApcQ2-cCegQIABAA&oq=Banded+Racer&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgYIABAFEB4yBAgAEBhQ39wBWN_cAWCR5AFoAHAAeACAAWuIAWuSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=L_BdYbjHL628rtoPg8aIuAk&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Buff+Striped+Keelback&tbm=isch&ved=2ahUKEwjbg6egurbzAhXQnUsFHRQwA20Q2-cCegQIABAA&oq=Buff+Striped+Keelback&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgARQ1uoBWNbqAWD-8gFoAHAAeACAAWyIAWySAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=TvBdYdukHtC7rtoPlOCM6AY&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Burmese+Rock+Python&tbm=isch&ved=2ahUKEwj8muOvurbzAhVFNnIKHb_dBzsQ2-cCegQIABAA&oq=Burmese+Rock+Python&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgYIABAIEB4yBggAEAgQHjIGCAAQCBAeMgYIABAIEB4yBggAEAgQHjIGCAAQCBAeUKCTAligkwJg75kCaABwAHgAgAF6iAF6kgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=bvBdYfyrOcXsyAO_u5_YAw&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Calamaria+Reed+Snake&tbm=isch&ved=2ahUKEwjW6MjBurbzAhWJnEsFHYvKCwwQ2-cCegQIABAA&oq=Calamaria+Reed+Snake&gs_lcp=CgNpbWcQAzIFCAAQgARQq-gBWKvoAWCp8QFoAHAAeACAAXqIAXqSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=lPBdYdbOD4m5rtoPi5WvYA&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Checkered+Keelback&tbm=isch&ved=2ahUKEwiV-o_RurbzAhXCXysKHeJ0BKAQ2-cCegQIABAA&oq=Checkered+Keelback&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgARQtMYBWLTGAWD3ygFoAHAAeACAAdUBiAHVAZIBAzItMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=tPBdYZXQNcK_rQHi6ZGACg&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Common+Bronzeback+Tree&tbm=isch&ved=2ahUKEwizyo_eurbzAhVSVSsKHYyWDJEQ2-cCegQIABAA&oq=Common+Bronzeback+Tree&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgYIABAFEB5Q4uQBWOLkAWDq6wFoAHAAeACAAbMBiAGzAZIBAzAuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=0PBdYbOiCNKqrQGMrbKICQ&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Common+Slug+Eater&tbm=isch&ved=2ahUKEwilvpDturbzAhW-nEsFHQo8Ak0Q2-cCegQIABAA&oq=Common+Slug+Eater&gs_lcp=CgNpbWcQAzIFCAAQgAQyBAgAEBhQ38sBWN_LAWD01QFoAHAAeACAAXOIAXOSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=7_BdYeWKJb65rtoPiviI6AQ&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Copper+Headed+Trinket&tbm=isch&ved=2ahUKEwiEpuT6urbzAhUFbysKHRoRDaIQ2-cCegQIABAA&oq=Copper+Headed+Trinket&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIGCAAQBRAeMgQIABAYMgQIABAYMgQIABAYUOPcAVjj3AFgsuMBaABwAHgAgAF5iAF5kgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=DPFdYYTwDoXerQGaorSQCg&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Green+Rat+Snake&tbm=isch&ved=2ahUKEwju1buJu7bzAhU8nEsFHVnBC94Q2-cCegQIABAA&oq=Green+Rat+Snake&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBggAEAUQHjIGCAAQBRAeMgYIABAFEB4yBggAEAUQHjIGCAAQBRAeMgYIABAFEB5Q9KUCWPSlAmCBrAJoAHAAeACAAW6IAW6SAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=K_FdYa6UAry4rtoP2YKv8A0&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Indian+Rat+Snake&tbm=isch&ved=2ahUKEwjogqacu7bzAhWKnEsFHaMJAlsQ2-cCegQIABAA&oq=Indian+Rat+Snake&gs_lcp=CgNpbWcQAzIECAAQQzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABFC-igJYvooCYLGSAmgAcAB4AIABcogBcpIBAzAuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=UvFdYeiRIIq5rtoPo5OI2AU&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Indian+Wolf+Snake&tbm=isch&ved=2ahUKEwja0eOtu7bzAhXnoUsFHaWBBlsQ2-cCegQIABAA&oq=Indian+Wolf+Snake&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIGCAAQBRAeMgYIABAFEB4yBggAEAUQHjIECAAQGFDg_QFY4P0BYOCMAmgAcAB4AIABdIgBdJIBAzAuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=d_FdYZq6C-fDrtoPpYOa2AU&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Painted+Bronzeback+Tree&tbm=isch&ved=2ahUKEwiiqPG-u7bzAhVvnEsFHadUAmEQ2-cCegQIABAA&oq=Painted+Bronzeback+Tree&gs_lcp=CgNpbWcQAzIFCAAQgARQ_t4BWP7eAWDW5QFoAHAAeACAAboBiAG6AZIBAzAuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=m_FdYeLuA--4rtoPp6mJiAY&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Marine+File+Snake&tbm=isch&ved=2ahUKEwjDyezNu7bzAhVfoEsFHY3eAGQQ2-cCegQIABAA&oq=Marine+File+Snake&gs_lcp=CgNpbWcQAzIFCAAQgAQyBAgAEBgyBAgAEBhQ-sYBWPrGAWCkzQFoAHAAeACAAW-IAW-SAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=uvFdYcOEG9_ArtoPjb2DoAY&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Olive+Keelback&tbm=isch&ved=2ahUKEwiV5_Pau7bzAhXRNnIKHRviCFwQ2-cCegQIABAA&oq=Olive+Keelback&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABFCQzAFYkMwBYIjUAWgAcAB4AIABpgGIAaYBkgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=1fFdYdWoMtHtyAObxKPgBQ&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Indo-Chinese+Rat+Snake&tbm=isch&ved=2ahUKEwjJq7nou7bzAhXukUsFHX5RCGEQ2-cCegQIABAA&oq=Indo-Chinese+Rat+Snake&gs_lcp=CgNpbWcQAzIFCAAQgARQpPkBWKT5AWCzgAJoAHAAeACAAXuIAXuSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=8vFdYcnqDe6jrtoP_qKhiAY&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Painted+Keelback&tbm=isch&ved=2ahUKEwj5vcn4u7bzAhVCMHIKHcUQArkQ2-cCegQIABAA&oq=Painted+Keelback&gs_lcp=CgNpbWcQAzIFCAAQgARQ7a0BWO2tAWDjtAFoAHAAeACAAXCIAXCSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=FPJdYfnjAsLgyAPFoYjICw&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Reticulate+Python&tbm=isch&ved=2ahUKEwi488iEvLbzAhUBsksFHRKbAZEQ2-cCegQIABAA&oq=Reticulate+Python&gs_lcp=CgNpbWcQAzIFCAAQgAQyBAgAEBgyBAgAEBgyBAgAEBgyBAgAEBgyBAgAEBhQ5ocCWOaHAmDPjgJoAHAAeACAAXmIAXmSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=LfJdYfioDIHkrtoPkraGiAk&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Rock+Python&tbm=isch&ved=2ahUKEwjopsqVvLbzAhU8hksFHfTNCmkQ2-cCegQIABAA&oq=Rock+Python&gs_lcp=CgNpbWcQAzIECAAQQzIECAAQQzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIECAAQQzIFCAAQgARQsbUBWLG1AWCkvAFoAHAAeACAAXWIAXWSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=UPJdYei-NbyMrtoP9JuryAY&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Russel%27s+Sand+Boa&tbm=isch&ved=2ahUKEwiJldShvLbzAhVYs0sFHXpDCZ0Q2-cCegQIABAA&oq=Russel%27s+Sand+Boa&gs_lcp=CgNpbWcQA1DG1QFYxtUBYObbAWgAcAB4AIABeIgBeJIBAzAuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=avJdYYm4DNjmrtoP-oal6Ak&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Trinket+Snake&tbm=isch&ved=2ahUKEwir8cmvvLbzAhX3m0sFHWndDyoQ2-cCegQIABAA&oq=Trinket+Snake&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgARQpMwBWKTMAWDT0wFoAHAAeACAAYQBiAGEAZIBAzAuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=h_JdYeuRGPe3rtoP6bq_0AI&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Twin+Spotted+Wolf&tbm=isch&ved=2ahUKEwjwm6C9vLbzAhWlVn0KHR4BB-YQ2-cCegQIABAA&oq=Twin+Spotted+Wolf&gs_lcp=CgNpbWcQAzIFCAAQgARQoJYDWKCWA2DooANoAHAAeACAAW-IAW-SAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=pPJdYfC5BKWt9QOegpywDg&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Wall%27s+Keelback&tbm=isch&ved=2ahUKEwii16TXvLbzAhXdDnIKHXNfAmsQ2-cCegQIABAA&oq=Wall%27s+Keelback&gs_lcp=CgNpbWcQA1D6ygFY-soBYInRAWgAcAB4AIABhgGIAYYBkgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=2vJdYaKCKd2dyAPzvonYBg&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=White+Banded+Wolf&tbm=isch&ved=2ahUKEwjWw8zkvLbzAhVAnEsFHYrHCQkQ2-cCegQIABAA&oq=White+Banded+Wolf&gs_lcp=CgNpbWcQAzIFCAAQgARQoa4BWKGuAWC8tAFoAHAAeACAAXCIAXCSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=9vJdYdbwI8C4rtoPio-nSA&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=white+barred+kukri+snake&tbm=isch&ved=2ahUKEwij05fwvLbzAhXInUsFHdDeBdsQ2-cCegQIABAA&oq=White+Barred+Kukr&gs_lcp=CgNpbWcQARgAMgUIABCABFDxywFY8csBYKriAWgAcAB4AIABqQGIAakBkgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=DvNdYaOUNsi7rtoP0L2X2A0&bih=701&biw=1283&client=firefox-b-d&hl=en-US",
                "https://www.google.com/search?q=Red+Coral+Kukr&tbm=isch&ved=2ahUKEwjIv87-vLbzAhUSm0sFHZkPD2EQ2-cCegQIABAA&oq=Red+Coral+Kukr&gs_lcp=CgNpbWcQAzIECAAQQzIECAAQQzIFCAAQgAQyBAgAEEMyBAgAEEMyBAgAEBgyBAgAEBgyBAgAEBgyBAgAEBgyBAgAEBhQirsBWIq7AWCpwwFoAHAAeACAAXeIAXeSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=LfNdYYj1CJK2rtoPmZ-8iAY&bih=701&biw=1283&client=firefox-b-d&hl=en-US"

        };
    }




    int[] NonImage={R.drawable.ashy_kukri,R.drawable.banded_racer,R.drawable.buff_striped,R.drawable.burmese_rock,R.drawable.calamaria_reed,
            R.drawable.checkered_keelback,R.drawable.common_bronzeback,R.drawable.common_slug_eater,R.drawable.copperhead_trinket,
            R.drawable.green_rat_snake,R.drawable.indian_rat_snake,R.drawable.indian_wolf,R.drawable.painted_bronzeback_tree,
            R.drawable.marine_file,R.drawable.olive_keelback,R.drawable.indo_chinese_rat,R.drawable.painted_keelback,
            R.drawable.reticulate_python,R.drawable.rock_python,R.drawable.sand_boa,R.drawable.trinket_snake,R.drawable.twin_spotted_wolf,
            R.drawable.walls_keelback,R.drawable.white_banded_wolf,R.drawable.white_barred_kukri,R.drawable.red_coral_kukri};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snake_details);


        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width=dm.widthPixels;
        int height=dm.heightPixels;
        getWindow().setLayout((int)(width*.85),(int)(height*.85));

        popImage=(ImageView)findViewById(R.id.popImage);
        Vname = findViewById(R.id.Vname);
        Bname=findViewById(R.id.Bname);
        descrip=findViewById(R.id.descrip);
        venom_name=findViewById(R.id.venom_name);





        Intent intent = getIntent();
        String s = intent.getStringExtra("getID");
        String n= "",v="",a="";
        int id = Integer.parseInt(s);


        String t=intent.getStringExtra("getType");
        int type=Integer.parseInt(t);
        if(type==1)
        {
            n=Vname.getText().toString();
            Vname.setText(n+VenomousSnakeName[id]);


            popImage.setImageResource(VenomousImages[id]);


            Bname.setText(Venomousbionominal[id]);
            n=venom_name.getText().toString();
            venom_name.setText(n+vtype[id]);

            popImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    gotoUrl(venomousLink[id]);
                }
            });


            descrip.setText(VenomousDescription[id]);
        }

        else if(type==2)
        {

            n=Vname.getText().toString();
            Vname.setText(n+MildSnakeName[id]);

            Bname.setText(MildVenBio[id]);



            popImage.setImageResource(MildImage[id]);


            v=venom_name.getText().toString();

            popImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    gotoUrl(MildvenomousLink[id]);
                }
            });

            venom_name.setText("Mild Venomous");
            descrip.setText(MildVenDes[id]);
        }

        else if(type==3)
        {
            n=Vname.getText().toString();
            Vname.setText(n+NonSnakeName[id]);


            popImage.setImageResource(NonImage[id]);

            Bname.setText(NonSnakeBionominal[id]);


            v=venom_name.getText().toString();

            popImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    gotoUrl(NonvenomousLink[id]);
                }
            });

            venom_name.setText("Non Venomous");
            descrip.setText(NonVenDes[id]);
        }

    }

    private void gotoUrl(String s) {

        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }


}