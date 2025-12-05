package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ChevronUpRight: ImageVector
    get() {
        if (_ChevronUpRight != null) {
            return _ChevronUpRight!!
        }
        _ChevronUpRight = ImageVector.Builder(
            name = "Filled.ChevronUpRight",
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
                moveTo(8f, 8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8f)
            }
        }.build()

        return _ChevronUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronUpRight: ImageVector? = null
