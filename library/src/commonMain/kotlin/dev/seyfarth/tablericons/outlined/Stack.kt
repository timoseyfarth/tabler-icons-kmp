package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Stack: ImageVector
    get() {
        if (_Stack != null) {
            return _Stack!!
        }
        _Stack = ImageVector.Builder(
            name = "Filled.Stack",
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
                moveTo(12f, 6f)
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
                moveTo(4f, 14f)
                lineToRelative(8f, 4f)
                lineToRelative(8f, -4f)
            }
        }.build()

        return _Stack!!
    }

@Suppress("ObjectPropertyName")
private var _Stack: ImageVector? = null
