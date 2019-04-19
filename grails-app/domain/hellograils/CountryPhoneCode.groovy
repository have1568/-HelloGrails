package hellograils

class CountryPhoneCode {


    int id  //主键

    String shortName //名称简写 例如 CN、US等

    String chineseName //中文名称

    String englishName //英文名称

    String phoneCode //国家区号

    String regexpStr = "" //验证的正则表达式

    boolean enableRegVerify = false //是否启用正则表达式验证

    boolean enable = false //该国家是否可用

    static mapping = {

        table "cdk_country_phone_code"

        id column: "id", generator: "identity"
        shortName column: "short_name"
        chineseName column: "chinese_name"
        englishName column: "english_name"
        phoneCode column: "phone_code"
        regexpStr column: "regexp_str"
        enableRegVerify column: "enable_reg_verify"
    }

    static constraints = {
    }
}
