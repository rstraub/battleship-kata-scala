import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Test1 extends AnyFlatSpec with Matchers:
  "hello" should "work" in {
    true shouldBe true
  }

