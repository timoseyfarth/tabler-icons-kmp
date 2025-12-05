package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.StackBack: ImageVector
    get() {
        if (_StackBack != null) {
            return _StackBack!!
        }
        _StackBack = ImageVector.Builder(
            name = "Filled.StackBack",
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
                moveTo(4f, 8f)
                lineToRelative(8f, 4f)
                lineToRelative(8f, -4f)
                lineToRelative(-8f, -4f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                lineToRelative(-4f, -2f)
                lineToRelative(-4f, 2f)
                lineToRelative(8f, 4f)
                lineToRelative(8f, -4f)
                lineToRelative(-4f, -2f)
                lineToRelative(-4f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 10f)
                lineToRelative(-4f, 2f)
                lineToRelative(4f, 2f)
                moveToRelative(8f, 0f)
                lineToRelative(4f, -2f)
                lineToRelative(-4f, -2f)
            }
        }.build()

        return _StackBack!!
    }

@Suppress("ObjectPropertyName")
private var _StackBack: ImageVector? = null
