package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandXdeep: ImageVector
    get() {
        if (_BrandXdeep != null) {
            return _BrandXdeep!!
        }
        _BrandXdeep = ImageVector.Builder(
            name = "Filled.BrandXdeep",
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
                moveTo(14.401f, 8.398f)
                lineToRelative(1.599f, -2.398f)
                horizontalLineToRelative(5f)
                lineToRelative(-4f, 6f)
                lineToRelative(4f, 6f)
                horizontalLineToRelative(-5f)
                lineToRelative(-8f, -12f)
                horizontalLineToRelative(-5f)
                lineToRelative(4f, 6f)
                lineToRelative(-4f, 6f)
                horizontalLineToRelative(5f)
                lineToRelative(1.596f, -2.393f)
            }
        }.build()

        return _BrandXdeep!!
    }

@Suppress("ObjectPropertyName")
private var _BrandXdeep: ImageVector? = null
