package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandValorant: ImageVector
    get() {
        if (_BrandValorant != null) {
            return _BrandValorant!!
        }
        _BrandValorant = ImageVector.Builder(
            name = "Filled.BrandValorant",
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
                moveTo(14.5f, 14f)
                horizontalLineToRelative(4.5f)
                lineToRelative(2f, -2f)
                verticalLineToRelative(-6f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 19f)
                horizontalLineToRelative(5f)
                lineToRelative(-11f, -13f)
                verticalLineToRelative(6f)
                close()
            }
        }.build()

        return _BrandValorant!!
    }

@Suppress("ObjectPropertyName")
private var _BrandValorant: ImageVector? = null
