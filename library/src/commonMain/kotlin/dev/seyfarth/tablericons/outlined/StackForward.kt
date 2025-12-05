package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.StackForward: ImageVector
    get() {
        if (_StackForward != null) {
            return _StackForward!!
        }
        _StackForward = ImageVector.Builder(
            name = "Filled.StackForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 5f)
                lineToRelative(-8f, 4f)
                lineToRelative(8f, 4f)
                lineToRelative(8f, -4f)
                lineToRelative(-8f, -4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 12f)
                lineToRelative(-6f, 3f)
                lineToRelative(8f, 4f)
                lineToRelative(8f, -4f)
                lineToRelative(-6f, -3f)
            }
        }.build()

        return _StackForward!!
    }

@Suppress("ObjectPropertyName")
private var _StackForward: ImageVector? = null
