package hellograils

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class SysUserSpec extends Specification implements DomainUnitTest<SysUser> {

    def uuid
    SysUser user

    def setup() {
        uuid = UUID.randomUUID().toString()
        user = new SysUser([uid: uuid, username: "wang"]).save()
    }

    def cleanup() {
    }

    void "test findOne"() {

        given:
        setup()

        expect:
        user.getUid() == uuid

    }
}
