package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Number1: ImageVector
    get() {
        if (_Number1 != null) {
            return _Number1!!
        }
        _Number1 = ImageVector.Builder(
            name = "Filled.Number1",
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
                verticalLineToRelative(-16f)
                lineToRelative(-5f, 5f)
            }
        }.build()

        return _Number1!!
    }

@Suppress("ObjectPropertyName")
private var _Number1: ImageVector? = null
