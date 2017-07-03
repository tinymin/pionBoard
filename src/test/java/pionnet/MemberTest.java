package pionnet;

import org.junit.Test;
import pionnet.dto.Member;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kim.Suncheol on 2017-07-03.
 */
public class MemberTest {
    @Test
    public void 멤버객체테스트() throws Exception {
        Member m = new Member();
        m.setId("test");
        m.setName("테스트");
        m.setPassword("1111");

        assertEquals("test", m.getId());
        assertEquals("테스트", m.getName());
        assertEquals("1111", m.getPassword());
    }
}
