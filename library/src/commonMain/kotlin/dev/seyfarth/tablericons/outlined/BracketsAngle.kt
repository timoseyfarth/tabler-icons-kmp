package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BracketsAngle: ImageVector
    get() {
        if (_BracketsAngle != null) {
            return _BracketsAngle!!
        }
        _BracketsAngle = ImageVector.Builder(
            name = "Filled.BracketsAngle",
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
                moveTo(8f, 4f)
                lineToRelative(-5f, 8f)
                lineToRelative(5f, 8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 4f)
                lineToRelative(5f, 8f)
                lineToRelative(-5f, 8f)
            }
        }.build()

        return _BracketsAngle!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsAngle: ImageVector? = null
