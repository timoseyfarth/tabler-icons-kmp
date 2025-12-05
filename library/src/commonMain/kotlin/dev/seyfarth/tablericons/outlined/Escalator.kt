package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Escalator: ImageVector
    get() {
        if (_Escalator != null) {
            return _Escalator!!
        }
        _Escalator = ImageVector.Builder(
            name = "Filled.Escalator",
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
                moveTo(19.5f, 5f)
                horizontalLineToRelative(-2.672f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, 0.586f)
                lineToRelative(-8.414f, 8.414f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 5f)
                horizontalLineToRelative(3.672f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.414f, -0.586f)
                lineToRelative(8.414f, -8.414f)
                horizontalLineToRelative(1.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5f)
                close()
            }
        }.build()

        return _Escalator!!
    }

@Suppress("ObjectPropertyName")
private var _Escalator: ImageVector? = null
