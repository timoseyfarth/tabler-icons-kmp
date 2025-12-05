package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ChevronCompactLeft: ImageVector
    get() {
        if (_ChevronCompactLeft != null) {
            return _ChevronCompactLeft!!
        }
        _ChevronCompactLeft = ImageVector.Builder(
            name = "Filled.ChevronCompactLeft",
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
                moveTo(13f, 20f)
                lineToRelative(-3f, -8f)
                lineToRelative(3f, -8f)
            }
        }.build()

        return _ChevronCompactLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronCompactLeft: ImageVector? = null
