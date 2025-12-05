package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ChevronCompactRight: ImageVector
    get() {
        if (_ChevronCompactRight != null) {
            return _ChevronCompactRight!!
        }
        _ChevronCompactRight = ImageVector.Builder(
            name = "Filled.ChevronCompactRight",
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
                moveTo(11f, 4f)
                lineToRelative(3f, 8f)
                lineToRelative(-3f, 8f)
            }
        }.build()

        return _ChevronCompactRight!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronCompactRight: ImageVector? = null
