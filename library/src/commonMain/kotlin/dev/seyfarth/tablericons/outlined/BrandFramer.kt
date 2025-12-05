package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandFramer: ImageVector
    get() {
        if (_BrandFramer != null) {
            return _BrandFramer!!
        }
        _BrandFramer = ImageVector.Builder(
            name = "Filled.BrandFramer",
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
                moveTo(6f, 15f)
                horizontalLineToRelative(12f)
                lineToRelative(-12f, -12f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(6f)
                lineToRelative(6f, 6f)
                verticalLineToRelative(-6f)
            }
        }.build()

        return _BrandFramer!!
    }

@Suppress("ObjectPropertyName")
private var _BrandFramer: ImageVector? = null
