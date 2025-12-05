package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BatteryExclamation: ImageVector
    get() {
        if (_BatteryExclamation != null) {
            return _BatteryExclamation!!
        }
        _BatteryExclamation = ImageVector.Builder(
            name = "Filled.BatteryExclamation",
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
                moveTo(9f, 17f)
                horizontalLineToRelative(8f)
                curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
                horizontalLineToRelative(-11f)
                curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
                verticalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 16f)
                verticalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 22f)
                verticalLineToRelative(0.01f)
            }
        }.build()

        return _BatteryExclamation!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryExclamation: ImageVector? = null
