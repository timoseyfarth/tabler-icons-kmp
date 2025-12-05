package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandNetflix: ImageVector
    get() {
        if (_BrandNetflix != null) {
            return _BrandNetflix!!
        }
        _BrandNetflix = ImageVector.Builder(
            name = "Filled.BrandNetflix",
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
                moveTo(9f, 3f)
                lineToRelative(10f, 18f)
                horizontalLineToRelative(-4f)
                lineToRelative(-10f, -18f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-10.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 21f)
                verticalLineToRelative(-18f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(10.5f)
            }
        }.build()

        return _BrandNetflix!!
    }

@Suppress("ObjectPropertyName")
private var _BrandNetflix: ImageVector? = null
