package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Diamond: ImageVector
    get() {
        if (_Diamond != null) {
            return _Diamond!!
        }
        _Diamond = ImageVector.Builder(
            name = "Filled.Diamond",
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
                moveTo(6f, 5f)
                horizontalLineToRelative(12f)
                lineToRelative(3f, 5f)
                lineToRelative(-8.5f, 9.5f)
                arcToRelative(0.7f, 0.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 0f)
                lineToRelative(-8.5f, -9.5f)
                lineToRelative(3f, -5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 12f)
                lineToRelative(-2f, -2.2f)
                lineToRelative(0.6f, -1f)
            }
        }.build()

        return _Diamond!!
    }

@Suppress("ObjectPropertyName")
private var _Diamond: ImageVector? = null
