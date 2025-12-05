package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Activity: ImageVector
    get() {
        if (_Activity != null) {
            return _Activity!!
        }
        _Activity = ImageVector.Builder(
            name = "Filled.Activity",
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
                moveTo(3f, 12f)
                horizontalLineToRelative(4f)
                lineToRelative(3f, 8f)
                lineToRelative(4f, -16f)
                lineToRelative(3f, 8f)
                horizontalLineToRelative(4f)
            }
        }.build()

        return _Activity!!
    }

@Suppress("ObjectPropertyName")
private var _Activity: ImageVector? = null
