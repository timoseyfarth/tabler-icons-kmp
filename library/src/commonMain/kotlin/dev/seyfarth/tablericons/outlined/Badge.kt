package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Badge: ImageVector
    get() {
        if (_Badge != null) {
            return _Badge!!
        }
        _Badge = ImageVector.Builder(
            name = "Filled.Badge",
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
                moveTo(17f, 17f)
                verticalLineToRelative(-13f)
                lineToRelative(-5f, 3f)
                lineToRelative(-5f, -3f)
                verticalLineToRelative(13f)
                lineToRelative(5f, 3f)
                close()
            }
        }.build()

        return _Badge!!
    }

@Suppress("ObjectPropertyName")
private var _Badge: ImageVector? = null
