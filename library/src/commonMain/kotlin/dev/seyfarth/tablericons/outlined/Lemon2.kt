package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Lemon2: ImageVector
    get() {
        if (_Lemon2 != null) {
            return _Lemon2!!
        }
        _Lemon2 = ImageVector.Builder(
            name = "Filled.Lemon2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.185f, 3.611f)
                curveToRelative(1.55f, 2.94f, 0.873f, 6.917f, -1.892f, 9.682f)
                curveToRelative(-2.765f, 2.765f, -6.743f, 3.442f, -9.682f, 1.892f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.796f, -2.796f)
                curveToRelative(-1.55f, -2.94f, -0.873f, -6.917f, 1.892f, -9.682f)
                curveToRelative(2.765f, -2.765f, 6.743f, -3.442f, 9.682f, -1.892f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.611f, -0.815f)
                close()
            }
        }.build()

        return _Lemon2!!
    }

@Suppress("ObjectPropertyName")
private var _Lemon2: ImageVector? = null
