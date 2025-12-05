package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Tilde: ImageVector
    get() {
        if (_Tilde != null) {
            return _Tilde!!
        }
        _Tilde = ImageVector.Builder(
            name = "Filled.Tilde",
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
                moveTo(4f, 12f)
                curveToRelative(0f, -1.657f, 1.592f, -3f, 3.556f, -3f)
                curveToRelative(1.963f, 0f, 3.11f, 1.5f, 4.444f, 3f)
                curveToRelative(1.333f, 1.5f, 2.48f, 3f, 4.444f, 3f)
                reflectiveCurveToRelative(3.556f, -1.343f, 3.556f, -3f)
            }
        }.build()

        return _Tilde!!
    }

@Suppress("ObjectPropertyName")
private var _Tilde: ImageVector? = null
