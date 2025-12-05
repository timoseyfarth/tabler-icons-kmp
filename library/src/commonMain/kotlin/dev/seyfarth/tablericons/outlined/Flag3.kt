package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Flag3: ImageVector
    get() {
        if (_Flag3 != null) {
            return _Flag3!!
        }
        _Flag3 = ImageVector.Builder(
            name = "Filled.Flag3",
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
                moveTo(5f, 14f)
                horizontalLineToRelative(14f)
                lineToRelative(-4.5f, -4.5f)
                lineToRelative(4.5f, -4.5f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(16f)
            }
        }.build()

        return _Flag3!!
    }

@Suppress("ObjectPropertyName")
private var _Flag3: ImageVector? = null
