package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandVisualStudio: ImageVector
    get() {
        if (_BrandVisualStudio != null) {
            return _BrandVisualStudio!!
        }
        _BrandVisualStudio = ImageVector.Builder(
            name = "Filled.BrandVisualStudio",
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
                moveTo(4f, 8f)
                lineToRelative(2f, -1f)
                lineToRelative(10f, 13f)
                lineToRelative(4f, -2f)
                verticalLineToRelative(-12f)
                lineToRelative(-4f, -2f)
                lineToRelative(-10f, 13f)
                lineToRelative(-2f, -1f)
                close()
            }
        }.build()

        return _BrandVisualStudio!!
    }

@Suppress("ObjectPropertyName")
private var _BrandVisualStudio: ImageVector? = null
