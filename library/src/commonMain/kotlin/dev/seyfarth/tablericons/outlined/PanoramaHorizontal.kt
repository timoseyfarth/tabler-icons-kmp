package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.PanoramaHorizontal: ImageVector
    get() {
        if (_PanoramaHorizontal != null) {
            return _PanoramaHorizontal!!
        }
        _PanoramaHorizontal = ImageVector.Builder(
            name = "Filled.PanoramaHorizontal",
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
                moveTo(4.338f, 5.53f)
                curveToRelative(5.106f, 1.932f, 10.211f, 1.932f, 15.317f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.345f, 0.934f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.692f, -0.692f, 1.2f, -1.34f, 0.962f)
                curveToRelative(-5.107f, -1.932f, -10.214f, -1.932f, -15.321f, 0f)
                curveToRelative(-0.648f, 0.246f, -1.339f, -0.242f, -1.339f, -0.935f)
                verticalLineToRelative(-11.027f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.338f, -0.935f)
                close()
            }
        }.build()

        return _PanoramaHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _PanoramaHorizontal: ImageVector? = null
