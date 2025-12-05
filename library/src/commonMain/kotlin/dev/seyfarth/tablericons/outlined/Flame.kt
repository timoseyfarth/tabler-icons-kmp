package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Flame: ImageVector
    get() {
        if (_Flame != null) {
            return _Flame!!
        }
        _Flame = ImageVector.Builder(
            name = "Filled.Flame",
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
                moveTo(12f, 10.941f)
                curveToRelative(2.333f, -3.308f, 0.167f, -7.823f, -1f, -8.941f)
                curveToRelative(0f, 3.395f, -2.235f, 5.299f, -3.667f, 6.706f)
                curveToRelative(-1.43f, 1.408f, -2.333f, 3.621f, -2.333f, 5.588f)
                curveToRelative(0f, 3.704f, 3.134f, 6.706f, 7f, 6.706f)
                reflectiveCurveToRelative(7f, -3.002f, 7f, -6.706f)
                curveToRelative(0f, -1.712f, -1.232f, -4.403f, -2.333f, -5.588f)
                curveToRelative(-2.084f, 3.353f, -3.257f, 3.353f, -4.667f, 2.235f)
            }
        }.build()

        return _Flame!!
    }

@Suppress("ObjectPropertyName")
private var _Flame: ImageVector? = null
