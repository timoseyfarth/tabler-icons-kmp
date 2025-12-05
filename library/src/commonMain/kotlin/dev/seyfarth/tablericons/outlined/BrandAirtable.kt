package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandAirtable: ImageVector
    get() {
        if (_BrandAirtable != null) {
            return _BrandAirtable!!
        }
        _BrandAirtable = ImageVector.Builder(
            name = "Filled.BrandAirtable",
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
                moveTo(3f, 10f)
                verticalLineToRelative(8f)
                lineToRelative(7f, -3f)
                verticalLineToRelative(-2.6f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 6f)
                lineToRelative(9f, 3f)
                lineToRelative(9f, -3f)
                lineToRelative(-9f, -3f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 12.3f)
                verticalLineToRelative(8.7f)
                lineToRelative(7f, -3f)
                verticalLineToRelative(-8f)
                close()
            }
        }.build()

        return _BrandAirtable!!
    }

@Suppress("ObjectPropertyName")
private var _BrandAirtable: ImageVector? = null
