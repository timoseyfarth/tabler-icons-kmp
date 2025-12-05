package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ChevronCompactDown: ImageVector
    get() {
        if (_ChevronCompactDown != null) {
            return _ChevronCompactDown!!
        }
        _ChevronCompactDown = ImageVector.Builder(
            name = "Filled.ChevronCompactDown",
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
                moveTo(4f, 11f)
                lineToRelative(8f, 3f)
                lineToRelative(8f, -3f)
            }
        }.build()

        return _ChevronCompactDown!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronCompactDown: ImageVector? = null
