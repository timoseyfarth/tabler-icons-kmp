package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.StarHalf: ImageVector
    get() {
        if (_StarHalf != null) {
            return _StarHalf!!
        }
        _StarHalf = ImageVector.Builder(
            name = "Filled.StarHalf",
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
                moveTo(12f, 17.75f)
                lineToRelative(-6.172f, 3.245f)
                lineToRelative(1.179f, -6.873f)
                lineToRelative(-5f, -4.867f)
                lineToRelative(6.9f, -1f)
                lineToRelative(3.086f, -6.253f)
                close()
            }
        }.build()

        return _StarHalf!!
    }

@Suppress("ObjectPropertyName")
private var _StarHalf: ImageVector? = null
