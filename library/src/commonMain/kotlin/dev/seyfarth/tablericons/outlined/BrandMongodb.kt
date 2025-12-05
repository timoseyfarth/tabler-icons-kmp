package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandMongodb: ImageVector
    get() {
        if (_BrandMongodb != null) {
            return _BrandMongodb!!
        }
        _BrandMongodb = ImageVector.Builder(
            name = "Filled.BrandMongodb",
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
                moveTo(12f, 3f)
                verticalLineToRelative(19f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 11.227f)
                curveToRelative(0f, 3.273f, -1.812f, 4.77f, -6f, 9.273f)
                curveToRelative(-4.188f, -4.503f, -6f, -6f, -6f, -9.273f)
                curveToRelative(0f, -4.454f, 3.071f, -6.927f, 6f, -9.227f)
                curveToRelative(2.929f, 2.3f, 6f, 4.773f, 6f, 9.227f)
                close()
            }
        }.build()

        return _BrandMongodb!!
    }

@Suppress("ObjectPropertyName")
private var _BrandMongodb: ImageVector? = null
