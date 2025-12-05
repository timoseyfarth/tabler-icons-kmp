package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.TriangleInverted: ImageVector
    get() {
        if (_TriangleInverted != null) {
            return _TriangleInverted!!
        }
        _TriangleInverted = ImageVector.Builder(
            name = "Filled.TriangleInverted",
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
                moveTo(10.363f, 20.405f)
                lineToRelative(-8.106f, -13.534f)
                arcToRelative(1.914f, 1.914f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.636f, -2.871f)
                horizontalLineToRelative(16.214f)
                arcToRelative(1.914f, 1.914f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.636f, 2.871f)
                lineToRelative(-8.106f, 13.534f)
                arcToRelative(1.914f, 1.914f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.274f, 0f)
                close()
            }
        }.build()

        return _TriangleInverted!!
    }

@Suppress("ObjectPropertyName")
private var _TriangleInverted: ImageVector? = null
