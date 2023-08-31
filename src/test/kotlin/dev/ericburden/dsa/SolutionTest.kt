package dev.ericburden.dsa

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

@DisplayName("Solution")
class SolutionTest {
  @Nested
  @DisplayName("Example 1")
  inner class Example1 {
    @Test
    fun `Matches example`() {
      val solution = Solution().solve()
      assertThat(solution).isEqualTo("Hello World!")
    }
  }
}
