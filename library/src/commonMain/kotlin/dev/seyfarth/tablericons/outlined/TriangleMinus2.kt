package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.TriangleMinus2: ImageVector
    get() {
        if (_TriangleMinus2 != null) {
            return _TriangleMinus2!!
        }
        _TriangleMinus2 = ImageVector.Builder(
            name = "Filled.TriangleMinus2",
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
                moveTo(20.48f, 15.016f)
                lineToRelative(-6.843f, -11.426f)
                arcToRelative(1.914f, 1.914f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.274f, 0f)
                lineToRelative(-8.106f, 13.535f)
                arcToRelative(1.914f, 1.914f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.636f, 2.871f)
                horizontalLineToRelative(8.107f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 19f)
                horizontalLineToRelative(6f)
            }
        }.build()

        return _TriangleMinus2!!
    }

@Suppress("ObjectPropertyName")
private var _TriangleMinus2: ImageVector? = null
