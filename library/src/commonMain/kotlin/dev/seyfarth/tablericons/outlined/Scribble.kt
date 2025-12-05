package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Scribble: ImageVector
    get() {
        if (_Scribble != null) {
            return _Scribble!!
        }
        _Scribble = ImageVector.Builder(
            name = "Filled.Scribble",
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
                moveTo(3f, 15f)
                curveToRelative(2f, 3f, 4f, 4f, 7f, 4f)
                reflectiveCurveToRelative(7f, -3f, 7f, -7f)
                reflectiveCurveToRelative(-3f, -7f, -6f, -7f)
                reflectiveCurveToRelative(-5f, 1.5f, -5f, 4f)
                reflectiveCurveToRelative(2f, 5f, 6f, 5f)
                reflectiveCurveToRelative(8.408f, -2.453f, 10f, -5f)
            }
        }.build()

        return _Scribble!!
    }

@Suppress("ObjectPropertyName")
private var _Scribble: ImageVector? = null
