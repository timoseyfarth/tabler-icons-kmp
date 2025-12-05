package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandFortnite: ImageVector
    get() {
        if (_BrandFortnite != null) {
            return _BrandFortnite!!
        }
        _BrandFortnite = ImageVector.Builder(
            name = "Filled.BrandFortnite",
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
                moveTo(8f, 3f)
                horizontalLineToRelative(7.5f)
                lineToRelative(-0.5f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6.5f)
                lineToRelative(-4f, 1f)
                close()
            }
        }.build()

        return _BrandFortnite!!
    }

@Suppress("ObjectPropertyName")
private var _BrandFortnite: ImageVector? = null
