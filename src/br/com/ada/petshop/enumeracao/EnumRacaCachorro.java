package br.com.ada.petshop.enumeracao;

public enum EnumRacaCachorro {

    PASTOR_ALEMAO,
    PIT_PULL,
    VIRA_LATA;

    public static EnumRacaCachorro getRacaByNome(String nome){
        for (EnumRacaCachorro racaEnum: EnumRacaCachorro.values()) {
            if (racaEnum.name().equals(nome)){
                return racaEnum;
            }
        }
        return VIRA_LATA;
    }
}
