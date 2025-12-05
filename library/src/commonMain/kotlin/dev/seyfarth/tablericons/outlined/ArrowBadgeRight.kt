package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ArrowBadgeRight: ImageVector
    get() {
        if (_ArrowBadgeRight != null) {
            return _ArrowBadgeRight!!
        }
        _ArrowBadgeRight = ImageVector.Builder(
            name = "Filled.ArrowBadgeRight",
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
                moveTo(13f, 7f)
                horizontalLineToRelative(-6f)
                lineToRelative(4f, 5f)
                lineToRelative(-4f, 5f)
                horizontalLineToRelative(6f)
                lineToRelative(4f, -5f)
                close()
            }
        }.build()

        return _ArrowBadgeRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBadgeRight: ImageVector? = null
