package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.StackBackward: ImageVector
    get() {
        if (_StackBackward != null) {
            return _StackBackward!!
        }
        _StackBackward = ImageVector.Builder(
            name = "Filled.StackBackward",
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
                moveTo(14f, 12f)
                lineToRelative(6f, -3f)
                lineToRelative(-8f, -4f)
                lineToRelative(-8f, 4f)
                lineToRelative(6f, 3f)
            }
            path(
                fill = SolidColor(Color.Black),
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
                lineToRelative(-2f, 1f)
                close()
            }
        }.build()

        return _StackBackward!!
    }

@Suppress("ObjectPropertyName")
private var _StackBackward: ImageVector? = null
