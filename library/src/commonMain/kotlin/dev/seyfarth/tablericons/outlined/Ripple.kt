package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Ripple: ImageVector
    get() {
        if (_Ripple != null) {
            return _Ripple!!
        }
        _Ripple = ImageVector.Builder(
            name = "Filled.Ripple",
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
                moveTo(3f, 7f)
                curveToRelative(3f, -2f, 6f, -2f, 9f, 0f)
                reflectiveCurveToRelative(6f, 2f, 9f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 17f)
                curveToRelative(3f, -2f, 6f, -2f, 9f, 0f)
                reflectiveCurveToRelative(6f, 2f, 9f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 12f)
                curveToRelative(3f, -2f, 6f, -2f, 9f, 0f)
                reflectiveCurveToRelative(6f, 2f, 9f, 0f)
            }
        }.build()

        return _Ripple!!
    }

@Suppress("ObjectPropertyName")
private var _Ripple: ImageVector? = null
