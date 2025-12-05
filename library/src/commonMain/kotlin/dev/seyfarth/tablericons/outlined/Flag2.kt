package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Flag2: ImageVector
    get() {
        if (_Flag2 != null) {
            return _Flag2!!
        }
        _Flag2 = ImageVector.Builder(
            name = "Filled.Flag2",
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
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(16f)
            }
        }.build()

        return _Flag2!!
    }

@Suppress("ObjectPropertyName")
private var _Flag2: ImageVector? = null
