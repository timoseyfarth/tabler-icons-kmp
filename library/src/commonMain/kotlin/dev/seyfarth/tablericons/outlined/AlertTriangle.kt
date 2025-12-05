package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.AlertTriangle: ImageVector
    get() {
        if (_AlertTriangle != null) {
            return _AlertTriangle!!
        }
        _AlertTriangle = ImageVector.Builder(
            name = "Filled.AlertTriangle",
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
                moveTo(12f, 9f)
                verticalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.363f, 3.591f)
                lineToRelative(-8.106f, 13.534f)
                arcToRelative(1.914f, 1.914f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.636f, 2.871f)
                horizontalLineToRelative(16.214f)
                arcToRelative(1.914f, 1.914f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.636f, -2.87f)
                lineToRelative(-8.106f, -13.536f)
                arcToRelative(1.914f, 1.914f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.274f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                horizontalLineToRelative(0.01f)
            }
        }.build()

        return _AlertTriangle!!
    }

@Suppress("ObjectPropertyName")
private var _AlertTriangle: ImageVector? = null
