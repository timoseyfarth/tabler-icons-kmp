package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Parachute: ImageVector
    get() {
        if (_Parachute != null) {
            return _Parachute!!
        }
        _Parachute = ImageVector.Builder(
            name = "Filled.Parachute",
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
                moveTo(22f, 12f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, -20f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 12f)
                curveToRelative(0f, -1.66f, -1.46f, -3f, -3.25f, -3f)
                curveToRelative(-1.8f, 0f, -3.25f, 1.34f, -3.25f, 3f)
                curveToRelative(0f, -1.66f, -1.57f, -3f, -3.5f, -3f)
                reflectiveCurveToRelative(-3.5f, 1.34f, -3.5f, 3f)
                curveToRelative(0f, -1.66f, -1.46f, -3f, -3.25f, -3f)
                curveToRelative(-1.8f, 0f, -3.25f, 1.34f, -3.25f, 3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12f)
                lineToRelative(10f, 10f)
                lineToRelative(-3.5f, -10f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.5f, 12f)
                lineToRelative(-3.5f, 10f)
                lineToRelative(10f, -10f)
            }
        }.build()

        return _Parachute!!
    }

@Suppress("ObjectPropertyName")
private var _Parachute: ImageVector? = null
