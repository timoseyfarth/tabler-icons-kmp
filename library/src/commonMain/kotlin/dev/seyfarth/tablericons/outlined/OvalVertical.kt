package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.OvalVertical: ImageVector
    get() {
        if (_OvalVertical != null) {
            return _OvalVertical!!
        }
        _OvalVertical = ImageVector.Builder(
            name = "Filled.OvalVertical",
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
                moveTo(3f, 12f)
                curveToRelative(0f, -3.314f, 4.03f, -6f, 9f, -6f)
                reflectiveCurveToRelative(9f, 2.686f, 9f, 6f)
                reflectiveCurveToRelative(-4.03f, 6f, -9f, 6f)
                reflectiveCurveToRelative(-9f, -2.686f, -9f, -6f)
                close()
            }
        }.build()

        return _OvalVertical!!
    }

@Suppress("ObjectPropertyName")
private var _OvalVertical: ImageVector? = null
